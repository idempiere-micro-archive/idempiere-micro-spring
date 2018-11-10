package org.idempiere.process;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.logging.Level;
import org.compiere.accounting.MBankStatement;
import org.compiere.accounting.MBankStatementLine;
import org.compiere.accounting.MPayment;
import org.compiere.accounting.X_I_BankStatement;
import org.compiere.invoicing.MInvoice;
import org.compiere.model.IProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.idempiere.common.util.AdempiereSystemError;
import org.idempiere.common.util.AdempiereUserError;
import org.idempiere.common.util.Env;

/**
 * Create Payment from Bank Statement Info
 *
 * @author Jorg Janke
 * @version $Id: BankStatementPayment.java,v 1.3 2006/07/30 00:51:01 jjanke Exp $
 */
public class BankStatementPayment extends SvrProcess {

  /** Prepare - e.g., get Parameters. */
  protected void prepare() {
    IProcessInfoParameter[] para = getParameter();
    for (int i = 0; i < para.length; i++) {
      String name = para[i].getParameterName();
      if (para[i].getParameter() == null) ;
      else log.log(Level.SEVERE, "Unknown Parameter: " + name);
    }
  } //	prepare

  /**
   * Perform process.
   *
   * @return Message
   * @throws Exception if not successful
   */
  protected String doIt() throws Exception {
    int Table_ID = getTable_ID();
    int Record_ID = getRecord_ID();
    if (log.isLoggable(Level.INFO)) log.info("Table_ID=" + Table_ID + ", Record_ID=" + Record_ID);

    if (Table_ID == X_I_BankStatement.Table_ID)
      return createPayment(new X_I_BankStatement(getCtx(), Record_ID, get_TrxName()));
    else if (Table_ID == MBankStatementLine.Table_ID)
      return createPayment(new MBankStatementLine(getCtx(), Record_ID, get_TrxName()));

    throw new AdempiereSystemError("??");
  } //	doIt

  /**
   * Create Payment for Import
   *
   * @param ibs import bank statement
   * @return Message
   * @throws Exception if not successful
   */
  private String createPayment(X_I_BankStatement ibs) throws Exception {
    if (ibs == null || ibs.getC_Payment_ID() != 0) return "--";
    if (log.isLoggable(Level.FINE)) log.fine(ibs.toString());
    if (ibs.getC_Invoice_ID() == 0 && ibs.getC_BPartner_ID() == 0)
      throw new AdempiereUserError("@NotFound@ @C_Invoice_ID@ / @C_BPartner_ID@");
    if (ibs.getC_BankAccount_ID() == 0)
      throw new AdempiereUserError("@NotFound@ @C_BankAccount_ID@");
    //
    MPayment payment =
        createPayment(
            ibs.getC_Invoice_ID(),
            ibs.getC_BPartner_ID(),
            ibs.getC_Currency_ID(),
            ibs.getStmtAmt(),
            ibs.getTrxAmt(),
            ibs.getC_BankAccount_ID(),
            ibs.getStatementLineDate() == null
                ? ibs.getStatementDate()
                : ibs.getStatementLineDate(),
            ibs.getDateAcct(),
            ibs.getDescription(),
            ibs.getAD_Org_ID());
    if (payment == null) throw new AdempiereSystemError("Could not create Payment");

    ibs.setC_Payment_ID(payment.getC_Payment_ID());
    ibs.setC_Currency_ID(payment.getC_Currency_ID());
    ibs.setTrxAmt(payment.getPayAmt(true));
    ibs.saveEx();
    //
    StringBuilder retString =
        new StringBuilder("@C_Payment_ID@ = ").append(payment.getDocumentNo());
    if (payment.getOverUnderAmt().signum() != 0)
      retString.append(" - @OverUnderAmt@=").append(payment.getOverUnderAmt());
    return retString.toString();
  } //	createPayment - Import

  /**
   * Create Payment for BankStatement
   *
   * @param bsl bank statement Line
   * @return Message
   * @throws Exception if not successful
   */
  private String createPayment(MBankStatementLine bsl) throws Exception {
    if (bsl == null || bsl.getC_Payment_ID() != 0) return "--";
    if (log.isLoggable(Level.FINE)) log.fine(bsl.toString());
    if (bsl.getC_Invoice_ID() == 0 && bsl.getC_BPartner_ID() == 0)
      throw new AdempiereUserError("@NotFound@ @C_Invoice_ID@ / @C_BPartner_ID@");
    //
    MBankStatement bs = new MBankStatement(getCtx(), bsl.getC_BankStatement_ID(), get_TrxName());
    //
    MPayment payment =
        createPayment(
            bsl.getC_Invoice_ID(),
            bsl.getC_BPartner_ID(),
            bsl.getC_Currency_ID(),
            bsl.getStmtAmt(),
            bsl.getTrxAmt(),
            bs.getC_BankAccount_ID(),
            bsl.getStatementLineDate(),
            bsl.getDateAcct(),
            bsl.getDescription(),
            bsl.getAD_Org_ID());
    if (payment == null) throw new AdempiereSystemError("Could not create Payment");
    //	update statement
    bsl.setPayment(payment);
    bsl.saveEx();
    //
    StringBuilder retString =
        new StringBuilder("@C_Payment_ID@ = ").append(payment.getDocumentNo());
    if (payment.getOverUnderAmt().signum() != 0)
      retString.append(" - @OverUnderAmt@=").append(payment.getOverUnderAmt());
    return retString.toString();
  } //	createPayment

  /**
   * Create actual Payment
   *
   * @param C_Invoice_ID invoice
   * @param C_BPartner_ID partner ignored when invoice exists
   * @param C_Currency_ID currency
   * @param StmtAmt statement amount
   * @param TrxAmt transaction amt
   * @param C_BankAccount_ID bank account
   * @param DateTrx transaction date
   * @param DateAcct accounting date
   * @param Description description
   * @param AD_Org_ID org
   * @return payment
   */
  private MPayment createPayment(
      int C_Invoice_ID,
      int C_BPartner_ID,
      int C_Currency_ID,
      BigDecimal StmtAmt,
      BigDecimal TrxAmt,
      int C_BankAccount_ID,
      Timestamp DateTrx,
      Timestamp DateAcct,
      String Description,
      int AD_Org_ID) {
    //	Trx Amount = Payment overwrites Statement Amount if defined
    BigDecimal PayAmt = TrxAmt;
    if (PayAmt == null || Env.ZERO.compareTo(PayAmt) == 0) PayAmt = StmtAmt;
    if (C_Invoice_ID == 0 && (PayAmt == null || Env.ZERO.compareTo(PayAmt) == 0))
      throw new IllegalStateException("@PayAmt@ = 0");
    if (PayAmt == null) PayAmt = Env.ZERO;
    //
    MPayment payment = new MPayment(getCtx(), 0, get_TrxName());
    payment.setAD_Org_ID(AD_Org_ID);
    payment.setC_BankAccount_ID(C_BankAccount_ID);
    payment.setTenderType(MPayment.TENDERTYPE_Check);
    if (DateTrx != null) payment.setDateTrx(DateTrx);
    else if (DateAcct != null) payment.setDateTrx(DateAcct);
    if (DateAcct != null) payment.setDateAcct(DateAcct);
    else payment.setDateAcct(payment.getDateTrx());
    payment.setDescription(Description);
    //
    if (C_Invoice_ID != 0) {
      MInvoice invoice = new MInvoice(getCtx(), C_Invoice_ID, null);
      payment.setC_DocType_ID(invoice.isSOTrx()); // 	Receipt
      payment.setC_Invoice_ID(invoice.getC_Invoice_ID());
      payment.setC_BPartner_ID(invoice.getC_BPartner_ID());
      if (PayAmt.signum() != 0) // 	explicit Amount
      {
        payment.setC_Currency_ID(C_Currency_ID);
        if (invoice.isSOTrx()) payment.setPayAmt(PayAmt);
        else //	payment is likely to be negative
        payment.setPayAmt(PayAmt.negate());
        payment.setOverUnderAmt(invoice.getOpenAmt().subtract(payment.getPayAmt()));
      } else // set Pay Amout from Invoice
      {
        payment.setC_Currency_ID(invoice.getC_Currency_ID());
        payment.setPayAmt(invoice.getOpenAmt());
      }
    } else if (C_BPartner_ID != 0) {
      payment.setC_BPartner_ID(C_BPartner_ID);
      payment.setC_Currency_ID(C_Currency_ID);
      if (PayAmt.signum() < 0) // 	Payment
      {
        payment.setPayAmt(PayAmt.abs());
        payment.setC_DocType_ID(false);
      } else //	Receipt
      {
        payment.setPayAmt(PayAmt);
        payment.setC_DocType_ID(true);
      }
    } else return null;
    payment.saveEx();
    //
    if (!payment.processIt(MPayment.DOCACTION_Complete)) {
      log.warning(
          "Payment Process Failed: " + payment.getDocumentNo() + " " + payment.getProcessMsg());
      throw new IllegalStateException(
          "Payment Process Failed: " + payment.getDocumentNo() + " " + payment.getProcessMsg());
    }
    payment.saveEx();
    return payment;
  } //	createPayment
} //	BankStatementPayment
