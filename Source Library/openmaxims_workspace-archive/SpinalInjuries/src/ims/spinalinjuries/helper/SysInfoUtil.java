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
package ims.spinalinjuries.helper;
//Provides a common point for getting the Date/Time from SystemInformation.
//Provides null checks and in the case when SystemInformation changes we'll have 
//only one place to modify (doesn't contradicts Ronan's law)

import ims.vo.SystemInformation;
import ims.framework.utils.Date;
import ims.framework.utils.DateFormat;
import ims.framework.utils.Time;

public class SysInfoUtil
{
	public static Date getCreationDate(SystemInformation voSysInfo)
	{
		if(voSysInfo != null && voSysInfo.getCreationDateTime() != null)
			return voSysInfo.getCreationDateTime().getDate();
		return null;
	}
	public static String getCreationDate(SystemInformation voSysInfo, DateFormat dateFormat)
	{
		if(voSysInfo != null && voSysInfo.getCreationDateTime() != null)
		{
			if(dateFormat != null)
				return voSysInfo.getCreationDateTime().getDate().toString(dateFormat);
			else
				return voSysInfo.getCreationDateTime().getDate().toString();
		}
		return null;
	}
	
	public static Time getCreationTime(SystemInformation voSysInfo)
	{
		if(voSysInfo != null && voSysInfo.getCreationDateTime() != null)
			return voSysInfo.getCreationDateTime().getTime();
		return null;
	}
	
	public static Date getLastUpdatedDate(SystemInformation voSysInfo)
	{
		if(voSysInfo != null && voSysInfo.getLastupdateDateTime() != null)
			return voSysInfo.getLastupdateDateTime().getDate();
		return null;
	}
	
	public static Time getLastUpdatedTime(SystemInformation voSysInfo)
	{
		if(voSysInfo != null && voSysInfo.getLastupdateDateTime() != null)
			return voSysInfo.getLastupdateDateTime().getTime();
		return null;
	}
}
