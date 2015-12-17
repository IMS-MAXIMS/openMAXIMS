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
package ims.correspondence.helper;

import ims.core.vo.lookups.DocumentStatus;

public class StatusHelper 
{
	private static final String  c_strNoLetterGenerated = "No Letter Generated" ;
	
	public static String getGenericTemplateName()
	{
		return c_strNoLetterGenerated;
	}
	
	
	public static boolean canUpdateStatus(DocumentStatus statusFrom, DocumentStatus statusTo)
	{
		if (statusFrom == null)
		{
			if (statusTo.getId() == DocumentStatus.NOLETTERREQUIRED.getId() ||
					statusTo.getId() == DocumentStatus.LETTERREQUIRED.getId())
				return true;
			else
				return false;
			
		}
		
		
		if (statusFrom.getId() == DocumentStatus.LETTERREQUIRED.getId())		
		{
			if (statusTo.getId() == DocumentStatus.NOLETTERREQUIRED.getId() ||
					statusTo.getId() == DocumentStatus.DICTATED.getId() ||
					statusTo.getId() == DocumentStatus.NOLETTERDICTATED.getId())
				return true;
			else
				return false;
		}
			
		if (statusFrom.getId() == DocumentStatus.NOLETTERREQUIRED.getId())
		{
			if (statusTo.getId() == DocumentStatus.LETTERREQUIRED.getId() ||
					statusTo.getId() == DocumentStatus.DICTATED.getId() ||
					statusTo.getId() == DocumentStatus.NOLETTERDICTATED.getId())
				return true;
			else
				return false;
			
		}

		if (statusFrom.getId() == DocumentStatus.DICTATED.getId())
		{
			if (statusTo.getId() == DocumentStatus.NOLETTERREQUIRED.getId() ||
					statusTo.getId() == DocumentStatus.NOLETTERDICTATED.getId())
				return true;
			else
				return false;
			
		}

		if (statusFrom.getId() == DocumentStatus.NOLETTERDICTATED.getId())
		{
			if (statusTo.getId() == DocumentStatus.LETTERREQUIRED.getId() ||
					statusTo.getId() == DocumentStatus.NOLETTERREQUIRED.getId() ||
					statusTo.getId() == DocumentStatus.DICTATED.getId())
				return true;
			else
				return false;
			
		}
		
		return false;
	}


}
