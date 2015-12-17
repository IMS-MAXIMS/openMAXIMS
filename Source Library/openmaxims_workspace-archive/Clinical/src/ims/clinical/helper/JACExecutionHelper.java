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
package ims.clinical.helper;

import ims.configuration.gen.ConfigFlag;
import ims.core.vo.PatientShort;
import ims.framework.interfaces.IAppUser;
import ims.framework.interfaces.IExternalEncodingProvider;

public class JACExecutionHelper 
{
	ims.framework.UIComponentEngine compEngine;
	ims.framework.UIEngine uiEngine;
	PatientShort patient;
	boolean bComponent;
	String szPath;
	String szParameter;
	String szOutpatCode;
	
	public JACExecutionHelper(ims.framework.UIComponentEngine paramEngine, PatientShort paramPatient)
	{
		compEngine = paramEngine;
		patient = paramPatient;
		bComponent = true;
		szPath = null;
		szParameter = null;
		szOutpatCode = null;
	}
	public JACExecutionHelper(ims.framework.UIEngine paramEngine, PatientShort paramPatient, String path, String parameter) 
	{
		uiEngine = paramEngine;
		patient = paramPatient;
		bComponent = false;
		szPath = path;
		szParameter = parameter;
		szOutpatCode = null;
	}
	
	public JACExecutionHelper(ims.framework.UIEngine paramEngine, PatientShort paramPatient, String path, String parameter, String outpatCode) 
	{
		uiEngine = paramEngine;
		patient = paramPatient;
		bComponent = false;
		szPath = path;
		szParameter = parameter;
		szOutpatCode = outpatCode;
	}
	
	public Boolean executeJAC()
	{
		StringBuffer sb = new StringBuffer();
		if (szParameter != null)
		{
			sb.append("/");
			sb.append(szParameter);
			sb.append("/");
		}
		else if(ConfigFlag.UI.JAC_APPLICATION_FUNCTION.getValue().toString().length() > 0)
		{
			sb.append("/");
			sb.append(ConfigFlag.UI.JAC_APPLICATION_FUNCTION.getValue().toString());
			sb.append("/");
		}
		else
		{
			if (bComponent)
				compEngine.showMessage("No JAC_APPLICATION_FUNCTION flag found.");
			else
				uiEngine.showMessage("No Parameter found.");
				
			return false;
		}
		
		IAppUser user = null;
		if (bComponent)
			user = compEngine.getLoggedInUser();
		else
			user = uiEngine.getLoggedInUser();
			
		if (user != null
			&& user.getUsername() != null)
		{
			sb.append(user.getUsername());
			sb.append("/");
		}
		else
		{
			if (bComponent)
				compEngine.showMessage("User Name was not found.");
			else
				uiEngine.showMessage("User Name was not found.");

			return false;
		}
		
		if (patient != null
			&& patient.getHospnum() != null)
		{
			sb.append(patient.getHospnum().getValue().toString());
		}
		else
		{
			if (bComponent)
				compEngine.showMessage("Hospital Number was not found.");
			else
				uiEngine.showMessage("Hospital Number was not found.");
			return false;
		}
			
		
		//	parm4 – is the outpatient clinic code (ONLY used for functions requiring a ward or clinic)
		if (szOutpatCode != null
			&& szParameter != null
			&& szParameter.matches("OUT"))
		{
			sb.append("/");
			sb.append(szOutpatCode);
		}

		IExternalEncodingProvider extProv = null;
		if (bComponent)
			extProv = compEngine.getExternalEncodingProvider();
		else
			extProv = uiEngine.getExternalEncodingProvider();
		if (extProv == null)
		{
			if (bComponent)
				compEngine.showMessage("No External Encoding Provider found.");
			else
				uiEngine.showMessage("No External Encoding Provider found.");
			return false;
		}

		String param = extProv.encode(sb.toString());
		StringBuffer sb2 = new StringBuffer();
		if (szPath != null)
			sb2.append(szPath);
		else if (ConfigFlag.UI.JAC_APPLICATION_EXECUTABLE_PATH.getValue().toString().length() > 0)
			sb2.append(ConfigFlag.UI.JAC_APPLICATION_EXECUTABLE_PATH.getValue().toString());
		else
		{
			if (bComponent)
				compEngine.showMessage("No JAC_APPLICATION_FULL_EXECUTABLE_PATH flag found.");
			else
				uiEngine.showMessage("No path found.");
			return false;
		}
		sb2.append(" ");
		sb2.append(param);
		
		if (param != null)
			if (bComponent)
				compEngine.runExternalApplication(sb2.toString(), false, true, "POE / eTTA cannot be selected from Maxims as there is already a POE session open.  Please close the POE session and continue.");
			else
				uiEngine.runExternalApplication(sb2.toString(), false, false, true,"ePrescribing cannot be selected from Maxims as there is already a session open.  Please close the session and continue.");
		else
		{
			if (bComponent)
				compEngine.showMessage("No Encoded data found.");
			else
				uiEngine.showMessage("No Encoded data found.");
			return false;
		}
		return true;
		
	}
}
