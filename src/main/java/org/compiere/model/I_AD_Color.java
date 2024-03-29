package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Color
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Color {

  /** TableName=AD_Color */
  public static final String Table_Name = "AD_Color";

  /** AD_Table_ID=457 */
  public static final int Table_ID = 457;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Get Client. Client/Tenant for this installation. */
  public int getADClientID();

  /** Column name AD_Color_ID */
  public static final String COLUMNNAME_AD_Color_ID = "AD_Color_ID";

  /** Set System Color. Color for backgrounds or indicators */
  public void setAD_Color_ID(int AD_Color_ID);

  /** Get System Color. Color for backgrounds or indicators */
  public int getAD_Color_ID();

  /** Column name AD_Color_UU */
  public static final String COLUMNNAME_AD_Color_UU = "AD_Color_UU";

  /** Set AD_Color_UU */
  public void setAD_Color_UU(String AD_Color_UU);

  /** Get AD_Color_UU */
  public String getAD_Color_UU();

  /** Column name AD_Image_ID */
  public static final String COLUMNNAME_AD_Image_ID = "AD_Image_ID";

  /** Set Image. Image or Icon */
  public void setAD_Image_ID(int AD_Image_ID);

  /** Get Image. Image or Icon */
  public int getAD_Image_ID();

  public I_AD_Image getAD_Image() throws RuntimeException;

  /** Column name AD_Org_ID */
  public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  public void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  public int getAD_Org_ID();

  /** Column name Alpha */
  public static final String COLUMNNAME_Alpha = "Alpha";

  /** Set Alpha. Color Alpha value 0-255 */
  public void setAlpha(int Alpha);

  /** Get Alpha. Color Alpha value 0-255 */
  public int getAlpha();

  /** Column name Alpha_1 */
  public static final String COLUMNNAME_Alpha_1 = "Alpha_1";

  /** Set 2nd Alpha. Alpha value for second color */
  public void setAlpha_1(int Alpha_1);

  /** Get 2nd Alpha. Alpha value for second color */
  public int getAlpha_1();

  /** Column name Blue */
  public static final String COLUMNNAME_Blue = "Blue";

  /** Set Blue. Color RGB blue value */
  public void setBlue(int Blue);

  /** Get Blue. Color RGB blue value */
  public int getBlue();

  /** Column name Blue_1 */
  public static final String COLUMNNAME_Blue_1 = "Blue_1";

  /** Set 2nd Blue. RGB value for second color */
  public void setBlue_1(int Blue_1);

  /** Get 2nd Blue. RGB value for second color */
  public int getBlue_1();

  /** Column name ColorType */
  public static final String COLUMNNAME_ColorType = "ColorType";

  /** Set Color Type. Color presentation for this color */
  public void setColorType(String ColorType);

  /** Get Color Type. Color presentation for this color */
  public String getColorType();

  /** Column name Created */
  public static final String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  public Timestamp getCreated();

  /** Column name CreatedBy */
  public static final String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  public int getCreatedBy();

  /** Column name Green */
  public static final String COLUMNNAME_Green = "Green";

  /** Set Green. RGB value */
  public void setGreen(int Green);

  /** Get Green. RGB value */
  public int getGreen();

  /** Column name Green_1 */
  public static final String COLUMNNAME_Green_1 = "Green_1";

  /** Set 2nd Green. RGB value for second color */
  public void setGreen_1(int Green_1);

  /** Get 2nd Green. RGB value for second color */
  public int getGreen_1();

  /** Column name ImageAlpha */
  public static final String COLUMNNAME_ImageAlpha = "ImageAlpha";

  /** Set Image Alpha . Image Texture Composite Alpha */
  public void setImageAlpha(BigDecimal ImageAlpha);

  /** Get Image Alpha . Image Texture Composite Alpha */
  public BigDecimal getImageAlpha();

  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Column name IsDefault */
  public static final String COLUMNNAME_IsDefault = "IsDefault";

  /** Set Default. Default value */
  public void setIsDefault(boolean IsDefault);

  /** Get Default. Default value */
  public boolean isDefault();

  /** Column name LineDistance */
  public static final String COLUMNNAME_LineDistance = "LineDistance";

  /** Set Line Distance. Distance between lines */
  public void setLineDistance(int LineDistance);

  /** Get Line Distance. Distance between lines */
  public int getLineDistance();

  /** Column name LineWidth */
  public static final String COLUMNNAME_LineWidth = "LineWidth";

  /** Set Line Width. Width of the lines */
  public void setLineWidth(int LineWidth);

  /** Get Line Width. Width of the lines */
  public int getLineWidth();

  /** Set Name. Alphanumeric identifier of the entity */
  public void setName(String Name);

  /** Get Name. Alphanumeric identifier of the entity */
  public String getName();

  /** Column name Red */
  public static final String COLUMNNAME_Red = "Red";

  /** Set Red. RGB value */
  public void setRed(int Red);

  /** Get Red. RGB value */
  public int getRed();

  /** Column name Red_1 */
  public static final String COLUMNNAME_Red_1 = "Red_1";

  /** Set 2nd Red. RGB value for second color */
  public void setRed_1(int Red_1);

  /** Get 2nd Red. RGB value for second color */
  public int getRed_1();

  /** Column name RepeatDistance */
  public static final String COLUMNNAME_RepeatDistance = "RepeatDistance";

  /** Set Repeat Distance. Distance in points to repeat gradient color - or zero */
  public void setRepeatDistance(int RepeatDistance);

  /** Get Repeat Distance. Distance in points to repeat gradient color - or zero */
  public int getRepeatDistance();

  /** Column name StartPoint */
  public static final String COLUMNNAME_StartPoint = "StartPoint";

  /** Set Start Point. Start point of the gradient colors */
  public void setStartPoint(String StartPoint);

  /** Get Start Point. Start point of the gradient colors */
  public String getStartPoint();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}
