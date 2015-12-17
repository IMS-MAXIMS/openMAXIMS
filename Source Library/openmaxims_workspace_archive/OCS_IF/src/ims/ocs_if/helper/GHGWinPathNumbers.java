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
package ims.ocs_if.helper;
import ims.configuration.gen.ConfigFlag;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class GHGWinPathNumbers
{

	
	public String getOCSNumber(int i)
	{
		DecimalFormat yearFormatter = new DecimalFormat("00");
		GregorianCalendar cal = new GregorianCalendar();
		String ocsNumber=yearFormatter.format(cal.get(Calendar.YEAR)%100 )+getAlpha(i)+getDigits(i);
		return ocsNumber;
	}
	
//	private String getDigits(int dbID)
//	{
//		int num = (dbID%500000)+500000;
//		DecimalFormat numFormatter = new DecimalFormat("000000");
//		return numFormatter.format(num);
//		
//	}

	private String getDigits(int dbID)
	{
		int num = (dbID%1000000);
		DecimalFormat numFormatter = new DecimalFormat("000000");
		return numFormatter.format(num);
		
	}

	
	private String getAlpha(int dbID)
	{
		return ConfigFlag.HL7.CUSTOM_OCS_NUMBER_PREFIX.getValue();
	}
	
//	private String getAlpha(int dbID)
//	{
//		int ocsNum = dbID%11500000; // Always less that 11500000 
//		if (ocsNum<500000)
//			return "A";
//		else if (ocsNum<1000000)
//			return "B";
//		else if (ocsNum<1500000)
//			return "C";
//		else if (ocsNum<2000000)
//			return "D";
//		else if (ocsNum<2500000)
//			return "E";
//		else if (ocsNum<3000000)
//			return "F";
//		else if (ocsNum<3500000)
//			return "G";
//		else if (ocsNum<4000000)
//			return "K";
//		else if (ocsNum<4500000)
//			return "L";
//		else if (ocsNum<5000000)
//			return "M";
//		else if (ocsNum<5500000)
//			return "N";
//		else if (ocsNum<6000000)
//			return "O";
//		else if (ocsNum<6500000)
//			return "P";
//		else if (ocsNum<7000000)
//			return "Q";
//		else if (ocsNum<7500000)
//			return "R";
//		else if (ocsNum<8000000)
//			return "S";
//		else if (ocsNum<8500000)
//			return "T";
//		else if (ocsNum<9000000)
//			return "U";
//		else if (ocsNum<9500000)
//			return "V";
//		else if (ocsNum<10000000)
//			return "W";
//		else if (ocsNum<10500000)
//			return "X";
//		else if (ocsNum<11000000)
//			return "Y";
//		else if (ocsNum<11500000)
//			return "Z";
//		throw new RuntimeException("Unreachable Code");
//	}
}
