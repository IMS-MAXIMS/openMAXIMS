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
package ims.emergency.helper;

public class EmergencyDisplayHelper 
{
	private static final long serialVersionUID = 1L;
	
	public static String minutesToHoursAndMinutes(Integer minutes) 
	{
		if(minutes == null)
			return null;
		
		int hours = minutes/60;
		int mins = minutes%60;
		
		StringBuilder time = new StringBuilder();
		
		if(hours > 0)
		{
			time.append(hours + "h");
		}
		
		if(mins > 0)
		{
			time.append((time.length() > 0 ? " " : "") + ((mins >= 0 && mins <= 9 && time.length() > 0) ? "0" : "") + mins + "m");
		}
		
		if(time.length() > 0)
			return time.toString();
		
		return null;
	}
}
