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
package ims.clinicaladmin.helper;

import ims.core.vo.lookups.DailyTimePeriods;

public final class DailyPatternAndShiftsHelper
{
	public ims.core.vo.lookups.DailyTimePeriodsCollection configureCustomTimePeriods(ims.framework.utils.Time timStart, ims.core.vo.lookups.DailyTimePeriodsCollection lookupCollection)
	{
		if (timStart != null && lookupCollection != null)
		{
			lookupCollection.sort();
			
			for(int x = 0; x < lookupCollection.size(); x++)
			{
				Integer nStartHour = new Integer(timStart.getHour());
				int intStartHour = timStart.getHour();
	
				if (lookupCollection.get(x).equals(DailyTimePeriods.HOUR0))
				{
					nStartHour = new Integer(intStartHour);
					if (intStartHour > 23)
						nStartHour = new Integer(intStartHour - 24);
	
					lookupCollection.get(x).setText(getTimeString(nStartHour));
				}
				else if (lookupCollection.get(x).equals(DailyTimePeriods.HOUR1))
				{
					nStartHour = new Integer(intStartHour + 1);
					if (intStartHour + 1 > 23)
						nStartHour = new Integer(intStartHour + 1 - 24);
						
					lookupCollection.get(x).setText(getTimeString(nStartHour));
				}
				else if (lookupCollection.get(x).equals(DailyTimePeriods.HOUR2))
				{
					nStartHour = new Integer(intStartHour + 2);
					if (intStartHour + 2 > 23)
						nStartHour = new Integer(intStartHour + 2 - 24);
	
					lookupCollection.get(x).setText(getTimeString(nStartHour));
				}
				else if (lookupCollection.get(x).equals(DailyTimePeriods.HOUR3))
				{
					nStartHour = new Integer(intStartHour + 3);
					if (intStartHour + 3 > 23)
						nStartHour = new Integer(intStartHour + 3 - 24);
	
					lookupCollection.get(x).setText(getTimeString(nStartHour));
				}
				else if (lookupCollection.get(x).equals(DailyTimePeriods.HOUR4))
				{
					nStartHour = new Integer(intStartHour + 4);
					if (intStartHour + 4 > 23)
						nStartHour = new Integer(intStartHour + 4 - 24);
	
					lookupCollection.get(x).setText(getTimeString(nStartHour));
				}
				else if (lookupCollection.get(x).equals(DailyTimePeriods.HOUR5))
				{
					nStartHour = new Integer(intStartHour + 5);
					if (intStartHour + 5 > 23)
						nStartHour = new Integer(intStartHour + 5 - 24);
	
					lookupCollection.get(x).setText(getTimeString(nStartHour));
				}
				else if (lookupCollection.get(x).equals(DailyTimePeriods.HOUR6))
				{
					nStartHour = new Integer(intStartHour + 6);
					if (intStartHour + 6 > 23)
						nStartHour = new Integer(intStartHour + 6 - 24);
	
					lookupCollection.get(x).setText(getTimeString(nStartHour));
				}
				else if (lookupCollection.get(x).equals(DailyTimePeriods.HOUR7))
				{
					nStartHour = new Integer(intStartHour + 7);
					if (intStartHour + 7 > 23)
						nStartHour = new Integer(intStartHour + 7 - 24);
	
					lookupCollection.get(x).setText(getTimeString(nStartHour));
				}
				else if (lookupCollection.get(x).equals(DailyTimePeriods.HOUR8))
				{
					nStartHour = new Integer(intStartHour + 8);
					if (intStartHour + 8 > 23)
						nStartHour = new Integer(intStartHour + 8 - 24);
	
					lookupCollection.get(x).setText(getTimeString(nStartHour));
				}
				else if (lookupCollection.get(x).equals(DailyTimePeriods.HOUR9))
				{
					nStartHour = new Integer(intStartHour + 9);
					if (intStartHour + 9 > 23)
						nStartHour = new Integer(intStartHour + 9 - 24);
	
					lookupCollection.get(x).setText(getTimeString(nStartHour));
				}
				else if (lookupCollection.get(x).equals(DailyTimePeriods.HOUR10))
				{
					nStartHour = new Integer(intStartHour + 10);
					if (intStartHour + 10 > 23)
						nStartHour = new Integer(intStartHour + 10 - 24);
	
					lookupCollection.get(x).setText(getTimeString(nStartHour));
				}
				else if (lookupCollection.get(x).equals(DailyTimePeriods.HOUR11))
				{
					nStartHour = new Integer(intStartHour + 11);
					if (intStartHour + 11 > 23)
						nStartHour = new Integer(intStartHour + 11 - 24);
	
					lookupCollection.get(x).setText(getTimeString(nStartHour));
				}
				else if (lookupCollection.get(x).equals(DailyTimePeriods.HOUR12))
				{
					nStartHour = new Integer(intStartHour + 12);
					if (intStartHour + 12 > 23)
						nStartHour = new Integer(intStartHour + 12 - 24);
	
					lookupCollection.get(x).setText(getTimeString(nStartHour));
				}
				else if (lookupCollection.get(x).equals(DailyTimePeriods.HOUR13))
				{
					nStartHour = new Integer(intStartHour + 13);
					if (intStartHour + 13 > 23)
						nStartHour = new Integer(intStartHour + 13 - 24);
	
					lookupCollection.get(x).setText(getTimeString(nStartHour));
				}
				else if (lookupCollection.get(x).equals(DailyTimePeriods.HOUR14))
				{
					nStartHour = new Integer(intStartHour + 14);
					if (intStartHour + 14 > 23)
						nStartHour = new Integer(intStartHour + 14 - 24);
	
					lookupCollection.get(x).setText(getTimeString(nStartHour));
				}
				else if (lookupCollection.get(x).equals(DailyTimePeriods.HOUR15))
				{
					nStartHour = new Integer(intStartHour + 15);
					if (intStartHour + 15 > 23)
						nStartHour = new Integer(intStartHour + 15 - 24);
	
					lookupCollection.get(x).setText(getTimeString(nStartHour));
				}
				else if (lookupCollection.get(x).equals(DailyTimePeriods.HOUR16))
				{
					nStartHour = new Integer(intStartHour + 16);
					if (intStartHour + 16 > 23)
						nStartHour = new Integer(intStartHour + 16 - 24);
	
					lookupCollection.get(x).setText(getTimeString(nStartHour));
				}
				else if (lookupCollection.get(x).equals(DailyTimePeriods.HOUR17))
				{
					nStartHour = new Integer(intStartHour + 17);
					if (intStartHour + 17 > 23)
						nStartHour = new Integer(intStartHour + 17 - 24);
	
					lookupCollection.get(x).setText(getTimeString(nStartHour));
				}
				else if (lookupCollection.get(x).equals(DailyTimePeriods.HOUR18))
				{
					nStartHour = new Integer(intStartHour + 18);
					if (intStartHour + 18 > 23)
						nStartHour = new Integer(intStartHour + 18 - 24);
	
					lookupCollection.get(x).setText(getTimeString(nStartHour));
				}
				else if (lookupCollection.get(x).equals(DailyTimePeriods.HOUR19))
				{
					nStartHour = new Integer(intStartHour + 19);
					if (intStartHour + 19 > 23)
						nStartHour = new Integer(intStartHour + 19 - 24);
	
					lookupCollection.get(x).setText(getTimeString(nStartHour));
				}
				else if (lookupCollection.get(x).equals(DailyTimePeriods.HOUR20))
				{
					nStartHour = new Integer(intStartHour + 20);
					if (intStartHour + 20 > 23)
						nStartHour = new Integer(intStartHour + 20 - 24);
	
					lookupCollection.get(x).setText(getTimeString(nStartHour));
				}
				else if (lookupCollection.get(x).equals(DailyTimePeriods.HOUR21))
				{
					nStartHour = new Integer(intStartHour + 21);
					if (intStartHour + 21 > 23)
						nStartHour = new Integer(intStartHour + 21 - 24);
	
					lookupCollection.get(x).setText(getTimeString(nStartHour));
				}
				else if (lookupCollection.get(x).equals(DailyTimePeriods.HOUR22))
				{
					nStartHour = new Integer(intStartHour + 22);
					if (intStartHour + 22 > 23)
						nStartHour = new Integer(intStartHour + 22 - 24);
	
					lookupCollection.get(x).setText(getTimeString(nStartHour));
				}
				else if (lookupCollection.get(x).equals(DailyTimePeriods.HOUR23))
				{
					nStartHour = new Integer(intStartHour + 23);
					if (intStartHour + 23 > 23)
						nStartHour = new Integer(intStartHour + 23 - 24);
	
					lookupCollection.get(x).setText(getTimeString(nStartHour));
				}
			}
			return lookupCollection;
		}
		else
			return null;
	}
	
	private String getTimeString(Integer nStartHour)
	{
		StringBuffer timStr = new StringBuffer();

		if (nStartHour.intValue() < 10 && nStartHour.toString().length() == 1)
			timStr.append("0");
		
		timStr.append(nStartHour.toString());
		timStr.append(":00 - ");

		if (nStartHour.intValue() < 10 && nStartHour.toString().length() == 1)
			timStr.append("0");

		timStr.append(nStartHour.toString());
		timStr.append(":59");
		return timStr.toString();
	}
}
