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

import ims.admin.domain.NavigationAdmin;
import ims.admin.domain.OrganisationAndLocation;
import ims.admin.domain.impl.NavigationAdminImpl;
import ims.admin.domain.impl.OrganisationAndLocationImpl;
import ims.core.domain.Demographics;
import ims.core.domain.impl.DemographicsImpl;
import ims.core.vo.Patient;
import ims.core.vo.PatientId;
import ims.core.vo.PatientIdCollection;
import ims.core.vo.PatientShort;
import ims.core.vo.lookups.PatIdType;
import ims.domain.SessionData;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.factory.RoleFactory;
import ims.domain.impl.DomainImpl;
import ims.framework.SessionConstants;
import ims.framework.interfaces.IAppForm;
import ims.framework.interfaces.IAppRole;
import ims.framework.interfaces.IContextSetter;
import ims.framework.interfaces.ILocation;
import ims.framework.interfaces.IRoleProvider;
import ims.framework.interfaces.ISecurityTokenHandler;
import ims.framework.interfaces.ISecurityTokenHandlerProvider;
import ims.framework.interfaces.ISecurityTokenParameter;
import ims.vo.ValueObject;
import ims.vo.ValueObjectCollection;

public class SecurityTokenWebServicesHandlerProvider extends DomainImpl implements ISecurityTokenHandlerProvider,ISecurityTokenHandler
{
	private static final long serialVersionUID = 1L;
	private StringBuilder errors = null;

	public void setApplicationContextFromRequest(IContextSetter setter, String serviceName,ISecurityTokenParameter[] parameters)	
	{ 				
		PatientShort 		 patient 		  = new ims.core.vo.Patient();
		PatientIdCollection  patIdColl  	  = new ims.core.vo.PatientIdCollection();
		PatientId			 patId			  = new PatientId();
		boolean				 locationSet	  = false;
		boolean				 roleSet	      = false;
		boolean				 startupFormSet	  = false;
		boolean 			 restrictPatient  = true;
		
		for (int i = 0; i < parameters.length; i++) 
		{	      		    
			String key = parameters[i].getName();
			
			//Set location
			if (key.equals("locationId") && Boolean.FALSE.equals(locationSet))
			{
				ILocation loc = getLocation(Integer.valueOf(parameters[i].getValue()));
				SessionData sessData = (SessionData)this.getDomainFactory().getDomainSession().getAttribute(SessionConstants.SESSION_DATA);
				sessData.selectedLocation.set(loc);
				locationSet = true;
			}
			//Set role
			else if (key.equals("roleId") && Boolean.FALSE.equals(roleSet))
			{
				IAppRole role = getRole(Integer.valueOf(parameters[i].getValue()));
				SessionData sessData = (SessionData)this.getDomainFactory().getDomainSession().getAttribute(SessionConstants.SESSION_DATA);
				sessData.role.set(role);
				roleSet = true;
			}
			//Set startup form
			else if (key.equals("startupFormId") && Boolean.FALSE.equals(startupFormSet))
			{
				IAppForm startupForm = getForm(Integer.valueOf(parameters[i].getValue()));
				SessionData sessData = (SessionData)this.getDomainFactory().getDomainSession().getAttribute(SessionConstants.SESSION_DATA);
				sessData.openForm.set(startupForm.getFormId());
				sessData.defaultStartupForm.set(startupForm.getFormId());				
				startupFormSet = true;
			}
			//Restrict patient
			else if (key.equals("restrictPatient") && Boolean.FALSE.equals(Boolean.valueOf(parameters[i].getValue().toLowerCase())))
			{				
				restrictPatient =  false;
			}
			//Set Patient identifiers
			else
			{
				for (int j = 0; j < PatIdType.getNegativeInstanceNames().length; j++) 
				{
					if (PatIdType.getNegativeInstanceNames()[j].equals(key.toUpperCase()))
					{
						PatIdType lookupInstance = PatIdType.getNegativeInstance(PatIdType.getNegativeInstanceNames()[j]);
						patId.setType(lookupInstance);
						patId.setValue(parameters[i].getValue());
						patIdColl.add(patId);
						break;
					}				
				}						
			}
		}  
		
		patient.setIdentifiers(patIdColl);
		
		Patient pat = null;
		try 
		{
			pat = getPatient(patient);
		}
		catch (StaleObjectException e) 
		{
			throw new DomainRuntimeException("Error retrieving patient: " + e.getMessage());
		}

		if (pat != null)
		{			
			setter.setPatient(pat.getID_Patient());
			
			if (restrictPatient)
			{
				SessionData sessData = (SessionData)this.getDomainFactory().getDomainSession().getAttribute(SessionConstants.SESSION_DATA);
				sessData.restrictPatientAccess.set("True");
				sessData.restrictPatientId.set(pat.getID_Patient());				
			}
		}
		else
		{
			throw new DomainRuntimeException("Patient not found!");
		}
	}
	
	public ILocation getLocation(Integer locationId)
	{	
		OrganisationAndLocation orgImpl = (OrganisationAndLocation) getDomainImpl(OrganisationAndLocationImpl.class);
		return orgImpl.getLocation(locationId);
	}
	
	private IAppRole getRole(Integer roleId)
	{	
		RoleFactory roleFactory = new RoleFactory(getDomainFactory().getDomainSession());
		if (!roleFactory.hasRoleProvider())
		{
			throw new DomainRuntimeException("No Role Provider available");
		}				
		IRoleProvider provider = roleFactory.getRoleProvider();
		
		if (roleId == null)
		{	
			throw new DomainRuntimeException("'roleId' is null");
		}
		
		return provider.getRole(Integer.valueOf(roleId).intValue());	
	}
	
	private IAppForm getForm(Integer formId)
	{						
		NavigationAdmin navImpl = (NavigationAdmin) getDomainImpl(NavigationAdminImpl.class);
		return navImpl.getAppForm(formId);
    }
	
	public String getErrors()
	{
		return errors != null ? errors.toString() : null ;
	}
	
	private Patient getPatient(PatientShort patient) throws StaleObjectException 
	{		
		Demographics demographicsImpl = (Demographics)getDomainImpl(DemographicsImpl.class);
		return demographicsImpl.getPatient(patient);		
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

	public void setApplicationContextFromRequest(IContextSetter setter, String serviceName, String parameters)  
	{
		// TODO Auto-generated method stub
		
	}
}
