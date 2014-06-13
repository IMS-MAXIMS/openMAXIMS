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
package ims.admin.helper;

import ims.admin.vo.SystemLogVo;
import ims.admin.vo.domain.SystemLogVoAssembler;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.impl.DomainImpl;
import ims.framework.enumerations.SystemLogType;
import ims.framework.enumerations.SystemLogLevel;
import ims.framework.interfaces.ISystemLog;
import ims.framework.interfaces.ISystemLogProvider;
import ims.framework.utils.DateTime;

public class SystemLogProvider extends DomainImpl implements ISystemLogProvider 
{
	private static final long serialVersionUID = 1L;

	public ISystemLog save(DateTime dateTime, SystemLogType type, SystemLogLevel level, String server, String user, String source, String computer, String userAgent, String sessionId, String message)
	{
		SystemLogVo entry = new SystemLogVo();
		
		entry.setEventDateTime(dateTime);
		entry.setEventType(type.getId());
		entry.setEventLevel(level.getId());
		entry.setApplicationServer(server);
		entry.setUser(user);
		entry.setSource(source);
		entry.setComputer(computer);
		entry.setMessage(message);
		entry.setSessionId(sessionId);
		entry.setUserAgent(userAgent);
		
		ims.core.admin.domain.objects.SystemLog domainObject = SystemLogVoAssembler.extractSystemLog(getDomainFactory(), entry);
		try 
		{
			getDomainFactory().save(domainObject);
		} 
		catch (StaleObjectException e) 
		{
			return null;
		}
		
		return SystemLogVoAssembler.create(domainObject);
	}
}
