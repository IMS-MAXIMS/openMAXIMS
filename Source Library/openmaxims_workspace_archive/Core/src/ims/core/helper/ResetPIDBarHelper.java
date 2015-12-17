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

import ims.core.vo.PatientShort;

public class ResetPIDBarHelper 
{
	ims.framework.UIComponentEngine engine;
	String patient;
	
	public ResetPIDBarHelper(ims.framework.UIEngine paramEngine, PatientShort paramPatient, String szText)
	{
		if (paramPatient == null)
			return;

		if (szText == null)
			szText = "";
			
		StringBuffer sb = new StringBuffer();
		sb.append(paramPatient.getPatientInfo());
		
		sb.append(szText);

		if (paramPatient.getIsDead() != null 
			&& paramPatient.getIsDead().booleanValue())
			paramEngine.setPatientInfo(sb.toString(), ims.configuration.gen.ConfigFlag.UI.RIP_INFO_COLOUR.getValue());
		else
			paramEngine.setPatientInfo(sb.toString());
	}
	
	public ResetPIDBarHelper(ims.framework.UIComponentEngine paramEngine, PatientShort paramPatient, String szText)
	{
		if (paramPatient == null)
			return;

		if (szText == null)
			szText = "";
			
		StringBuffer sb = new StringBuffer();
		sb.append(paramPatient.getPatientInfo());
		
		sb.append(szText);

		if (paramPatient.getIsDead() != null 
			&& paramPatient.getIsDead().booleanValue())
			paramEngine.setPatientInfo(sb.toString(), ims.configuration.gen.ConfigFlag.UI.RIP_INFO_COLOUR.getValue());
		else
			paramEngine.setPatientInfo(sb.toString());
	}
}
