/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2006 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@idempiere.org or http://www.idempiere.org/license.html           *
 *****************************************************************************/
package org.idempiere.common.base;

/**
 * This is a very simple factory for service locators
 * 
 * @author viola
 * 
 */
public abstract class Service {

	private static IServiceLocator theLocator;
	protected static Service instance;

	protected abstract IServiceLocator getLocator();
    private final static Object mutex = new Object();

	/**
	 * 
	 * @return service locator instance
	 */
	public static IServiceLocator locator() {
        synchronized (mutex) {
            if (theLocator != null) {
                return theLocator;
            } else if (instance != null) {
                theLocator = instance.getLocator();
                return theLocator;
            } else throw new IllegalStateException("Service Locator");
        }
	}
}
