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

import ims.configuration.gen.ConfigFlag;
import ims.core.vo.PatientId;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.interfaces.IContextSetter;
import ims.framework.interfaces.ISecurityTokenHandler;
import ims.framework.interfaces.ISecurityTokenHandlerProvider;
import ims.framework.interfaces.ISecurityTokenParameter;
import ims.vo.ValueObject;
import ims.vo.ValueObjectCollection;

public class SecurityTokenHandlerProvider extends DomainHelper implements ISecurityTokenHandlerProvider,ISecurityTokenHandler
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void setApplicationContextFromRequest(IContextSetter setter, String serviceName, String parameters) 
	{ 
		
		ims.core.vo.PatientShort patient = new ims.core.vo.Patient();
		ims.core.vo.PatientIdCollection patidColl = new ims.core.vo.PatientIdCollection();
		PatientId patid = new PatientId();
		 
		if (ConfigFlag.DOM.INTERFACE_PATID_TYPE.getValue().equals("HOSPNUM"))
		{
			patid.setType(ims.core.vo.lookups.PatIdType.HOSPNUM);
			patid.setValue(getParam(parameters,"PKEY"));
		}
		else if (ConfigFlag.DOM.INTERFACE_PATID_TYPE.getValue().equals("PKEY"))
		{
			patid.setType(ims.core.vo.lookups.PatIdType.PKEY);
			patid.setValue(getParam(parameters,"PKEY"));
		}

		patidColl.add(patid);
		patient.setIdentifiers(patidColl);
		
		this.domain = (IDomainHelper) getDomainImpl(DomainHelper.class);
		
		ims.core.vo.Patient pat = null;
		try {
			pat = domain.getPatient(patient);
		} catch (StaleObjectException e) {
			//do nothing
		}

		if (pat != null)
			setter.setPatient(pat.getID_Patient());		
	}

	private String getParam(String parameters,String token) 
	{
		if (parameters.equals(""))
				return "";
				
		if (parameters.length()>0)
		{
			String[] l_args;
			l_args = parameters.split(";");

			String l_str;
			for(int i=0; i <= l_args.length; i++)
			{
				l_str = l_args[i];
				if (l_str.equals(token))
				{
					if (i+1 <= l_args.length)
						return l_args[i+1];
					else
						return "";
				}
			}
		}
		
		return "";
	}

	public String setSTParameters(String serviceName, ValueObject vo) {
		// TODO Auto-generated method stub
		return null;
	}

	public String setSTParameters(String serviceName, ValueObjectCollection voCollection) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean testClassLoad() {
		// TODO Auto-generated method stub
		return false;
	}

	public ISecurityTokenHandler[] getAllISecurityTokenParameterHandlers() {
		// TODO Auto-generated method stub
		return null;
	}

	public ISecurityTokenHandler getISecurityTokenParameterHandler(String systemNameCode) {
		// TODO Auto-generated method stub
		return this;
	}

	public void setApplicationContextFromRequest(IContextSetter setter,
			String serviceName, ISecurityTokenParameter[] parameters) {
		// TODO Auto-generated method stub
		
	}


}
