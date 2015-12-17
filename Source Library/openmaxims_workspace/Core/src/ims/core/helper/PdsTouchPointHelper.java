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

import ims.core.vo.Patient;
import ims.core.vo.PatientShort;
import ims.core.vo.PdsErrorVo;
import ims.core.vo.lookups.PDSBackOfficeType;
import ims.core.vo.lookups.PDSBackOfficeWorkPriority;
import ims.domain.DomainSession;
import ims.domain.impl.DomainImplFlyweightFactory;

public class PdsTouchPointHelper 
{
	private IPdsTouchPoint impl;
	private ims.core.vo.Patient patient;
	
	public final static int PDS_TOUCH_POINT_SUCCESSFUL = 0;
	public final static int CROSS_CHECK_FAILED = 1;
	public final static int RETRIEVAL_FAILED = 2;
	
	private int lastError;

	public PdsTouchPointHelper()
	{
		try
		{
			impl = (IPdsTouchPoint) getDomainImpl("ims.core.helper.PdsTouchPointImpl");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		lastError = -1;
	}
	
	public Patient checkPdsTouchPointConditions(PatientShort pat, ims.framework.UIEngine engine, ims.domain.DomainInterface domain)
	{
		PdsRequestParameters params = new PdsRequestParameters("200000000004", "457564770545", "userUUID", "roleProfileCode", "sdsJobRoleCode");
		
		if(pat.getSCNIsNotNull())
		{
			
		}
		else
		{
			Patient patient = null;
			
			/*
			PdsCrossCheckTraceQueryHelper helper = new PdsCrossCheckTraceQueryHelper(domain);
			try
			{
				helper.setDummyError();
				patient = helper.makeRequest(params, pat.getNhsn() != null ? pat.getNhsn().getIdValue() : "", pat.getDob() != null ? pat.getDob().toString() : "", pat.getName().getSurname(), pat.getName().getForename());
				
				if(patient == null)
				{
					//spine returned an error
					PdsErrorVo pdsError = helper.getLastErrorDetails();
					
					engine.showMessage("Error calling PdsCrossCheckTraceQuery, query response code: " + pdsError.getQueryResponseCode());
					
					createBackOfficeItemAndNotification();
					return CROSS_CHECK_FAILED;
				}
				
			}
			catch (PdsException e)
			{
				e.printStackTrace();
				
				engine.showMessage("Error calling PdsCrossCheckTraceQuery: " + e.toString());
				helper.setPdsErrorFromException(e);
				
				createBackOfficeItemAndNotification();
				return CROSS_CHECK_FAILED;
			}
			*/
			
			//call PDS retrieval
			PdsRetrievalQueryHelper helper = new PdsRetrievalQueryHelper(domain);
			try
			{
				patient = helper.makeRequest(params, pat.getNhsn() != null ? pat.getNhsn().getIdValue() : "", PdsRetrievalQueryHelper.HistoricDataIndicator.ON);
				
				if(patient == null)
				{
					//spine returned an error
					PdsErrorVo pdsError = helper.getLastErrorDetails();
					
					String err = "Error calling PdsRetrievalQuery, query response code: " + pdsError.getQueryResponseCode();
					engine.showMessage(err);
					
					try
					{
						helper.createBackOfficeItemAndNotification(PDSBackOfficeType.CONNECTIONERROR,  err, PDSBackOfficeWorkPriority.P1);
					}
					catch (PdsException e1)
					{
						e1.printStackTrace();
					}

					lastError = RETRIEVAL_FAILED;
				}
				
			}
			catch (PdsException e)
			{
				e.printStackTrace();
				
				engine.showMessage("Error calling PdsRetrievalQuery: " + e.toString());
				
				helper.setPdsErrorFromException(e);
				try
				{
					helper.createBackOfficeItemAndNotification(PDSBackOfficeType.CONNECTIONERROR,  e.toString(), PDSBackOfficeWorkPriority.P1);
				}
				catch (PdsException e1)
				{
					e1.printStackTrace();
				}
				
				lastError =  RETRIEVAL_FAILED;
			}
		}
		
		lastError =  PDS_TOUCH_POINT_SUCCESSFUL;
		
		return patient;
	}

	public ims.core.vo.Patient getPatient(ims.core.patient.vo.PatientRefVo refPat)
	{
		patient = impl.getPatient(refPat);
		return patient;
	}
	
	private Object getDomainImpl(String className) throws Exception
	{
		DomainSession sess = DomainSession.getSession();
		Class<?> implClass = Class.forName(className);
		DomainImplFlyweightFactory factory = DomainImplFlyweightFactory.getInstance();
		return factory.create(implClass, sess);
	}

	public int getLastError()
	{
		return lastError;
	}
}
