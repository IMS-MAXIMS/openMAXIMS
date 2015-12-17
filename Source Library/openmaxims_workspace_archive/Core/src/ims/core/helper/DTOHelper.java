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

import ims.core.vo.lookups.TaxonomyType;
import ims.domain.lookups.LookupInstance;
import ims.domain.lookups.LookupMapping;
import ims.framework.exceptions.CodingRuntimeException;
import ims.framework.utils.Date;
import ims.framework.utils.DateFormat;
import ims.framework.utils.DateTime;
import ims.framework.utils.PartialDate;
import ims.framework.utils.Time;
import ims.framework.utils.TimeFormat;

public class DTOHelper
{
	public static String convertToDtoTime(java.util.Date javaDate) 
	{
		if(javaDate == null)
			throw new CodingRuntimeException("javaDate cannot be null in method convertToDtoTime");
		
		DateTime imsDate = new DateTime(javaDate); 
		return imsDate.getTime().toString(TimeFormat.FLAT4);
	}
	
	public static String convertToDtoDate(java.util.Date javaDate) 
	{
		if(javaDate == null)
			throw new CodingRuntimeException("javaDate cannot be null in method convertToDtoDate");

		Date imsDate = new Date(javaDate); 
		return imsDate.toString(DateFormat.ISO);
	}
	
	public static String convertToDtoDate(PartialDate partialDate) 
	{
		if(partialDate == null)
			return "";

		String strDate = partialDate.getYear().toString();
		strDate += partialDate.getMonth() != null ? (partialDate.getMonth().toString().length() == 1 ? "0" + partialDate.getMonth().toString() : partialDate.getMonth().toString()) : "00";
		strDate += partialDate.getDay() != null ? (partialDate.getDay().toString().length() == 1 ? "0" + partialDate.getDay().toString() : partialDate.getDay().toString()) : "00";
		
		return strDate;
	}
	
	public static String getPasMapping(LookupInstance inst) 
	{
		if(inst == null)
			return "";

		LookupMapping map = inst.getMapping(TaxonomyType.PAS.getText());
		if(map != null)
			return map.getExtCode();
		
		return null;
	}

	public static String convertToDtoTime(String time)
	{
		Time lTime = new Time(time);
		return lTime.toString(TimeFormat.FLAT4);
	}
}
