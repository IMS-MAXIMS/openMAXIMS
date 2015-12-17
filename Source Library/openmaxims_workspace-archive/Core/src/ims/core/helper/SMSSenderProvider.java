//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
//#                                                                           #
//#  This program is free software: you can redistribute it and/or modify     #
//#  it under the terms of the GNU Affero General Public License as           #
//#  published by the Free Software Foundation, either version 3 of the       #
//#  License, or (at your option) any later version.                          # 
//#                                                                           #
//#  This program is distributed in the hope that it will be useful,          #
//#  but WITHOUT ANY WARRANTY; without even the implied warranty of           #
//#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the            #
//#  GNU Affero General Public License for more details.                      #
//#                                                                           #
//#  You should have received a copy of the GNU Affero General Public License #
//#  along with this program.  If not, see <http://www.gnu.org/licenses/>.    #
//#                                                                           #
//#############################################################################
//#EOH
package ims.core.helper;

import com.esendex.sdk.ems.soapinterface.EsendexHeader;
import com.esendex.sdk.ems.soapinterface.MessageType;
import com.esendex.sdk.ems.soapinterface.SendServiceLocator;
import com.esendex.sdk.ems.soapinterface.SendServiceSoap_BindingStub;

import ims.core.configuration.domain.objects.AppUser;
import ims.domain.impl.DomainImpl;
import ims.framework.interfaces.INotification;
import ims.framework.interfaces.ISMSSenderProvider;

public class SMSSenderProvider extends DomainImpl implements ISMSSenderProvider 
{
	private static final long serialVersionUID = 1L;
	private final String username = "it-dept@imsmaxims.com";
	private final String password = "by34ktfdi8gdf";
	private final String account  = "EX0001469";
	
	public void send(INotification notification) 
	{
		send(new INotification[] { notification });
	}
	public void send(INotification[] notifications) 
	{
		try
		{
			EsendexHeader header = new EsendexHeader(username, password, account);

			SendServiceLocator locator = new SendServiceLocator();	
			locator.getSendServiceSoap();
		    SendServiceSoap_BindingStub service = (SendServiceSoap_BindingStub)locator.getSendServiceSoap();
		    service.setHeader(header);

		    for(int x = 0; x < notifications.length; x++)
		    {
		    	INotification notification = notifications[x];
		    	String deliveryAddress = getUserDeliveryAddress(notification);
		    	if(deliveryAddress != null)
		    	{
		    		service.sendMessage(deliveryAddress, notification.getINotificationMessage(), MessageType.Text);
		    	}
		    }
		}
		catch(Exception e)
	    {
	      e.printStackTrace();
	    }		
	}
	
	private String getUserDeliveryAddress(INotification notification)
	{
		AppUser doUser = (AppUser)getDomainFactory().getDomainObject(AppUser.class, notification.getINotificationUserId());
		if(doUser == null || doUser.getNotificationDetails() == null)
			return null;
		return doUser.getNotificationDetails().getMobilePhone();
	}
}
