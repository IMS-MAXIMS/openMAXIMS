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
package ims.hl7.helper;

import ims.domain.SessionData;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.impl.DomainImpl;
import ims.framework.Context;
import ims.framework.SessionConstants;
import ims.framework.interfaces.IContextEvalProvider;
import ims.vo.ValueObjectRef;

public abstract class BaseContextEvalProvider extends DomainImpl implements IContextEvalProvider
{
	//This is the only method of the IContextEvalProvider interface
	//which must be overridden by concrete classes extending this class
	public abstract void setPatientInfoAndIcons(ValueObjectRef refVo);

	public boolean isPatientRip()
	{
		return false;
	}

	public boolean isEpisodeEnded()
	{
		return false;
	}
	
	public ValueObjectRef getPatientForEpisodeOfCare(ValueObjectRef refVo)
	{
		return null;
	}

	public ValueObjectRef getCareContextForClinicalContact(ValueObjectRef refVo)
	{
		return null;
	}

	public ValueObjectRef getEpisodeOfCareForCareContext(ValueObjectRef refVo)
	{
		return null;
	}	

	protected final SessionData getSessionData()
	{
		SessionData sessData = (SessionData)super.getSession().getAttribute(SessionConstants.SESSION_DATA);
		if (sessData == null)
			throw new DomainRuntimeException("SessionData in domain session cannot be null");
		
		return sessData;
	}
	
	protected final Context getContext()
	{		
		Context ctx = getSessionData().context.get();
		if (ctx == null)
			throw new DomainRuntimeException("Context in SessionData in domain session cannot be null");
		
		return ctx;
	}

}
