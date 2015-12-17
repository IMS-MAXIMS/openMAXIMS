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

import java.util.ArrayList;
import java.util.List;

import ims.configuration.gen.ConfigFlag;
import ims.core.patient.domain.objects.Patient;
import ims.core.vo.PatientShort;
import ims.core.vo.domain.PatientShortAssembler;
import ims.domain.DomainFactory;
import ims.domain.SessionData;
import ims.domain.impl.DomainImpl;
import ims.framework.FormName;
import ims.framework.SessionConstants;
import ims.framework.UIEngine;
import ims.framework.enumerations.ContextQueryItem;
import ims.framework.interfaces.IAppParam;
import ims.framework.interfaces.IAppParamHandlerProvider;
import ims.vo.LookupInstVo;

public class NHSParamProvider extends DomainImpl implements IAppParamHandlerProvider 
{
	private static final long serialVersionUID = 1L;
	private final FormName	formDemographics = new LocalFormName(102101);
	private static final int NHS_NumberInstId = -9;
	
	public void handle(UIEngine engine, IAppParam[] params) 
	{
		processNHSNoContext(engine, params, "nhsno");	
	}

	private void processNHSNoContext(UIEngine engine, IAppParam[] params, String nhsno) 
	{
		String patientNHSNo = "";
		
		if (params != null && params.length > 0)
		{
			for(int i = 0; i<params.length; i++)
			{
				if (params[i].getName().equals(nhsno))
				{
					patientNHSNo = params[i].getValue();
					break;
				}
			}
		}
		
		PatientShort patient = getPatientByNHS(patientNHSNo);
			
		if(patient != null)
		{
			SessionData sessData = (SessionData)super.getSession().getAttribute(SessionConstants.SESSION_DATA);
			sessData.context.get().put(ContextQueryItem.PATIENT.getKey(), patient);
				
			engine.open(ConfigFlag.UI.DEMOGRAPHICS_FORM.getValue() != null ? ConfigFlag.UI.DEMOGRAPHICS_FORM.getValue() : formDemographics , new Object[]{patient});
		}
	}

	private PatientShort getPatientByNHS(String patientNHSNo) 
	{
		if(patientNHSNo == null)
			return null;
		
		LookupInstVo lookInstNHS = new LookupInstVo(NHS_NumberInstId);
		
		DomainFactory factory = getDomainFactory();
		
		ArrayList<String> markers = new ArrayList<String>();
		ArrayList<Object> values = new ArrayList<Object>();
		
		String query = "from Patient p left join p.identifiers as ids where ids.type = :idtype and ids.value = :nhs";
		
		markers.add("idtype");
		values.add(getDomLookup(lookInstNHS));
		markers.add("nhs");
		values.add(patientNHSNo);
		
		List<Object> patients=factory.find(query,markers,values);
		
		if (patients!=null && patients.size()>0)
		{
			return PatientShortAssembler.create((Patient) patients.get(0));
		}
		
		return null;
	}

	private final class LocalFormName extends FormName
	{
		private static final long	serialVersionUID	= 1L;

		private LocalFormName(int name)
		{
			super(name);
		}
	}

}
