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


public class NHSNumberCalculator 
{
	public static String ValidNHSNumber(String nhsNumber)
	{
		if ( ! checkCodeIs9Ns(nhsNumber) 
			&& ! checkCodeIs10Ns(nhsNumber))
			return "\r\nThe NHS Number is not of the correct length.";

		char checkChar = nhsNumber.charAt(0);
		
		if (nhsNumber.charAt(1) == checkChar
			&& nhsNumber.charAt(2) == checkChar
			&& nhsNumber.charAt(3) == checkChar
			&& nhsNumber.charAt(4) == checkChar
			&& nhsNumber.charAt(5) == checkChar
			&& nhsNumber.charAt(7) == checkChar
			&& nhsNumber.charAt(8) == checkChar)
			return "\r\nThe NHS Number is invalid. Constant number strings are not allowed.";
		return "";
	}

	public static boolean checkCodeIs9Ns(String nhsNumber)
	{
		if (nhsNumber == null)
			return false;

		if (nhsNumber.length() != 9)
			return false;
		
		for (int i = 0 ; i < 9 ; i++)
		{
			if (! Character.isDigit(nhsNumber.charAt(i)))
				return false;
		}

		return true;
	}
	
	public static boolean checkCodeIs10Ns(String nhsNumber)
	{
		if (nhsNumber == null)
			return false;

		if (nhsNumber.length() != 10)
			return false;
		
		for (int i = 0 ; i < 10 ; i++)
		{
			if (! Character.isDigit(nhsNumber.charAt(i)))
				return false;
		}

		return true;
	}

	public static String calcNHSNumber9N(String nhsNumber)
	{
		String strError = ValidNHSNumber(nhsNumber);
		if (strError != "")
			return strError;
		
		//Step one
		int nOne = new Integer(nhsNumber.substring(0, 1)) * 10;
		int nTwo = new Integer(nhsNumber.substring(1,2)) * 9;
		int nThree = new Integer(nhsNumber.substring(2,3)) * 8;
		int nFour = new Integer(nhsNumber.substring(3,4)) * 7;
		int nFive = new Integer(nhsNumber.substring(4,5)) * 6;
		int nSix = new Integer(nhsNumber.substring(5,6)) * 5;
		int nSeven = new Integer(nhsNumber.substring(6,7)) * 4;
		int nEight= new Integer(nhsNumber.substring(7,8)) * 3;
		int nNine = new Integer(nhsNumber.substring(8,9)) * 2;
		
		//Step one
		int nTotalStepTwo = nOne + nTwo + nThree + nFour + nFive + nSix + nSeven + nEight + nNine;
			
		//Step three
		
		int remainder = nTotalStepTwo % 11;

		//Step Four
		int checkDigit = 11 - remainder;
		
		if (checkDigit == 11)
			checkDigit = 0;
		
		if (checkDigit == 10)//invalid number
			return "NHS number provided is invalid";
		
		return nhsNumber+checkDigit;
	}

}
