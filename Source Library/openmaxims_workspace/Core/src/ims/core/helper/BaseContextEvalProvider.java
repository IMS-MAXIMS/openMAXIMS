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

import ims.admin.helper.ContextReader;
import ims.configuration.gen.ConfigFlag;
import ims.configuration.ReadAudit;
import ims.core.vo.EpisodeofCareShortVo;
import ims.core.vo.PatientShort;
import ims.domain.SessionData;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.impl.DomainImpl;
import ims.framework.Context;
import ims.framework.SessionConstants;
import ims.framework.interfaces.IAppUser;
import ims.framework.interfaces.IContextEvalProvider;
import ims.framework.interfaces.ILocation;
import ims.vo.ValueObjectRef;

public abstract class BaseContextEvalProvider extends DomainImpl implements IContextEvalProvider
{
	//This is the only method of the IContextEvalProvider interface
	//which must be overridden by concrete classes extending this class
	public abstract void setPatientInfoAndIcons(ValueObjectRef refVo);

	public boolean isPatientRip()
	{
		Context ctx = getContext();
		PatientShort pat = ContextReader.getPatientShort(ctx);
		if (pat == null)
			return false;
		else
			return (pat.getDod() != null);
	}

	public boolean isEpisodeEnded()
	{
		Context ctx = getContext();
		EpisodeofCareShortVo epis = ContextReader.getCurrentEpisodeOfCare(ctx);
		if (epis == null)
			return false;
		else
			return (epis.getEndDate() != null);
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
	
	public void recordReadAudit(ValueObjectRef refVo, String action)
	{
		if (ConfigFlag.DOM.READ_AUDIT_ENABLED.getValue() != true)
			return;
		
		ReadAudit domRead = new ReadAudit();
		domRead.setPatientId(refVo.getBoId());
		domRead.setAuditAction(action);
		domRead.setAuditDateTime(new java.util.Date());
			
		IAppUser user = getSession().getUser();
		if (user != null)
		{
			domRead.setAuditUser(user.getUsername());
			domRead.setAuditHost(user.getHostName());
		}
		ILocation loc = getCurrentLocation();
		if (loc != null)
			domRead.setAuditUserLocation(new Integer(loc.getID()));
		try
		{
			getDomainFactory().save(domRead);
		}
		catch (StaleObjectException e)
		{
			throw new DomainRuntimeException("StaleObjectException occurred saving ReadAudit record");
		}
	}

}
