//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
package ims.core.helper;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

public class CommChannelHelper
{
	public boolean isValidEmailAddress(String email)
	{
		boolean sValid = true;
		try
		{
			InternetAddress emailAddr = new InternetAddress(email);
			emailAddr.validate();
		}
		catch (AddressException ex)
		{
			sValid = false;
		}
		return sValid;
	}
	
	public boolean isValidTelephoneNumber(String tel)
	{
		// UK Telephone formats accepted
		String[] patterns = new String[] 
		{
		"01########",
		"01#########",
		"011########",
		"01#1#######",
		"013873#####",
		"015242#####",
		"015394#####",
		"015395#####",
		"015396#####",
		"016973#####",
		"016974#####",
		"016977####",
		"016977#####",
		"017683#####",
		"017684#####",
		"017687#####",
		"019467#####",
		"02#########",
		"03#########",
		"05#########",
		"0500######",
		"07#########",
		"0800######",
		"08#########",
		"09#########",
		"08001111",
		"08454647"
		};
		
		for(String pattern : patterns)
		{
			if(checkAgainstPattern(pattern, tel))
			{
				return true;
			}
		}
		
		return false;
	}

	private boolean checkAgainstPattern(String pattern, String tel)
	{
		if(pattern == null || tel == null)
			return false;

		String telNoSpaces = tel.replaceAll(" ", "");
		int lenPattern = pattern.length();
		int lenTel = telNoSpaces.length();
		
		if(lenPattern != lenTel)
			return false;
		
		for(int i = 0; i < lenPattern; i++)
		{
			if(pattern.charAt(i) == '#')
			{
				//the char at index 'i' within telNoSpaces can be any digit
				if(!Character.isDigit(telNoSpaces.charAt(i)))
					return false;
			}
			else if(pattern.charAt(i) != telNoSpaces.charAt(i))
			{
				//if the pattern has a digit at position 'i' then telNoSpaces must have the same digit at position 'i'
				return false;
			}
		}
		
		return true;
	}
	
}
