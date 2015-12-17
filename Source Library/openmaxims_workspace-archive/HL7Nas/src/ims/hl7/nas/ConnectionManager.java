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
package ims.hl7.nas;

import ims.crypto.Encryption;
import ims.crypto.EncryptionType;
import ims.hl7.HL7Config;
import imsmaxims.common.ImsNasClient;

import java.util.ArrayList;
import java.util.Iterator;

public class ConnectionManager
{
	private ArrayList connections = new ArrayList();
	private HL7Config cfg = new HL7Config();

	public synchronized ImsNasClient getConnection() throws Exception
	{
		ImsNasClient result = null;
		if (this.connections.isEmpty())
		{
			String password = Encryption.encrypt(cfg.getNasPassword(), EncryptionType.PRIME);
			result = new ImsNasClient(cfg.getNasHost(), Integer.parseInt(cfg.getNasPort()), cfg.getNasUser(), password, false);			
		}
		
		if (result == null)
			result = (ImsNasClient) this.connections.remove(this.connections.size() - 1);
		
		return result;
	}
	
	public synchronized void freeConnection(ImsNasClient nc)
	{
		if (nc != null)
			this.connections.add(nc);
	}
	
	public synchronized void reset()
	{
		Iterator it = this.connections.iterator();
		while(it.hasNext())
			((ImsNasClient)it.next()).sendClientDisconnect();

		this.connections.clear();		
	}

	public synchronized int getNumberOfContexts()
	{
		return this.connections.size();
	}
	
	public static ConnectionManager getInstance()
	{
		return SingletonHolder.singleton;
	}
	private static final class SingletonHolder
	{
		static final ConnectionManager singleton = new ConnectionManager();
	}

}
