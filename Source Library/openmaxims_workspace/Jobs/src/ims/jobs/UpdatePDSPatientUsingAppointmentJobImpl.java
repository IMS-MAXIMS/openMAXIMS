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
package ims.jobs;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.quartz.JobExecutionException;

import ims.admin.vo.PDSConfigurationVo;
import ims.admin.vo.domain.PDSConfigurationVoAssembler;
import ims.configuration.gen.ConfigFlag;

import ims.core.admin.domain.objects.PDSApptLetterRun;
import ims.core.admin.domain.objects.PDSConfiguration;
import ims.core.helper.IPDSDemographicDomainHelper;
import ims.core.helper.PdsException;
import ims.core.helper.PdsRequestParameters;
import ims.core.helper.PdsRetrievalQueryHelper;
import ims.core.vo.InititPatAndPDSPATForJobVo;
import ims.core.vo.MissingMappingVoCollection;
import ims.core.vo.PDSApptLetterRunVo;
import ims.core.vo.Patient;
import ims.core.vo.PatientForJobVo;
import ims.core.vo.PatientForJobVoCollection;
import ims.core.vo.PatientShort;
import ims.core.vo.domain.PDSApptLetterRunVoAssembler;
import ims.core.vo.domain.PatientForJobVoAssembler;
import ims.core.vo.domain.PatientShortAssembler;
import ims.core.vo.lookups.PDSBackOfficeType;
import ims.core.vo.lookups.PDSBackOfficeWorkPriority;
import ims.core.vo.lookups.PDSSearchStatus;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.ForeignKeyViolationException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.impl.DomainImplFlyweightFactory;
import ims.framework.interfaces.IConfiguredScheduledJob;
import ims.framework.utils.Date;
import ims.framework.utils.DateTime;
import ims.scheduler.DomainFactoryBridge;
import ims.scheduler.SchedulerJobExecutionSummary;
import ims.scheduler.SchedulerJobExecutionStatus;




public final class UpdatePDSPatientUsingAppointmentJobImpl extends ims.scheduler.SchedulerJob
{
	
	private int updated 	= 0;
	private int notupdated 	= 0;
	private int patientsfound = 0;
	
	@Override
	public SchedulerJobExecutionSummary doExecute() throws JobExecutionException
	{
		MissingMappingVoCollection missingMappings = new MissingMappingVoCollection();
		
		StringBuilder summaryMessage = new StringBuilder();
						
		long start = System.currentTimeMillis();
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());		
		summaryMessage.append("Start job at " +  calendar.getTime());
		summaryMessage.append("\n");
		
		PDSApptLetterRunVo job = getJobDetails();
		if (job == null)
		{
			throw new JobExecutionException("Job configuration missing !!!");
		}
				
		PDSConfigurationVo configVo = getPDSConfiguration();
		
		if( configVo == null || !configVo.getNumOfDaysAppointBatchTraceIsNotNull())
		{
			summaryMessage.append("PDS Configuration missing !!!");
			summaryMessage.append("\n");	
		}
		else
		{
			
						
    		PatientForJobVoCollection patients = listPatientsFromBookingAppt(job, configVo);		//get Patient from Booking appointments
    		
    		if( patients != null && patients.size() > 0 )
    		{
    			    			
    			patientsfound = patients.size();
    			
    			for(int i = 0; i < patients.size();i++)
    			{
    				PatientForJobVo apptPat = patients.get(i);
    				if( apptPat != null  )
    				{
    					
    					PatientShort pat = getPatientShort(apptPat);
    					InititPatAndPDSPATForJobVo patTempVo = new InititPatAndPDSPATForJobVo();
    					patTempVo.setInitialPatient(null);
    					patTempVo.setPDSPatient(null);
    			    			    	
    			    	IPDSDemographicDomainHelper tempI = null;
    			        try
    					{
    			        							
    						try
    						{
    							tempI = (IPDSDemographicDomainHelper) getDomainImpl("ims.core.helper.PDSDemographicDomainHelper");
    						}
    						catch (Exception e1)
    						{
    							
    							e1.printStackTrace();
    							summaryMessage.append("Error getting the patient record: " + e1.toString());
    							summaryMessage.append("\n");	
    						}
    						
    			        	
    						patTempVo.setInitialPatient(tempI.getPatient(pat));
    			        	
    			        							
    					}
    					catch (StaleObjectException e1)
    					{
    						
    						e1.printStackTrace();
    						summaryMessage.append("Error getting the patient record: " + e1.toString());
    						summaryMessage.append("\n");	
    					}
    					
    					
    					if( !Boolean.TRUE.equals(apptPat.getDecoupled()) 
    						&&  apptPat.getSCNIsNotNull() 
    						&& !Boolean.TRUE.equals(apptPat.getIsConfidential()) 
    						&& ( apptPat.getSCN().intValue() > 0 
    							  || (apptPat.getSCN().intValue() == 0 && apptPat.getPDSPatientUpdateIsNotNull() && apptPat.getPDSPatientUpdate().getPDSUpdateRequestIsNotNull() && !PDSSearchStatus.PENDING.equals(apptPat.getPDSPatientUpdate().getPDSUpdateRequest().getStatus()))))
    
    					{
    						
    						if( checkAndRetrievalPdsDemographics(pat,patTempVo, missingMappings) == true )	//get pds patient from cloud
    				    	{
    							Patient pdsPattem = patTempVo.getPDSPatient();
    							if( pdsPattem != null && Boolean.TRUE.equals(pdsPattem.getIsConfidential()))	// If the PDS Retrieval helper return a patient.IsConfidential == TRUE
    							{
    								notupdated++;
    								
    								PdsRetrievalQueryHelper helper = new PdsRetrievalQueryHelper(null);
      				    		  	helper.setPatientInContext(patTempVo.getInitialPatient());
      				    		  	try
      				    		  	{
      				    		  		helper.createBackOfficeItemAndNotification(PDSBackOfficeType.PDS_SYNC_REQUIRED,  patTempVo.getInitialPatient().getNhsn() != null ? patTempVo.getInitialPatient().getNhsn().toString():"", PDSBackOfficeWorkPriority.P2);
      				    		  	}
      				    		  	catch (PdsException e)
      				    		  	{
      								
      				    		  		e.printStackTrace();
      				    		  		summaryMessage.append("Error creating Back Office Entry: " + e.toString());
      				    		  		summaryMessage.append("\n");	
      				    		  	}
    							}
    							else
    							{
        				    		if( updateLocalPatientWithPds(patTempVo, missingMappings) == true)			//update local patient with pds patient 
        				    		{
        				    			updated++;
        				    		}
        				    		else
        				    		{
        				    			summaryMessage.append("Error updating the patient:"+ (pat.getNameIsNotNull() ? pat.getName().toString():" "));
        								summaryMessage.append("\n");
        				    		}
    							}
    				    	}
    				    	else
    				    	{
    				    		  PdsRetrievalQueryHelper helper = new PdsRetrievalQueryHelper(null);
    				    		  helper.setPatientInContext(patTempVo.getInitialPatient());
    							  try
    							  {
    								helper.createBackOfficeItemAndNotification(PDSBackOfficeType.PDSSYNCFAILED,  patTempVo.getInitialPatient().getNhsn() != null ? patTempVo.getInitialPatient().getNhsn().toString():"", PDSBackOfficeWorkPriority.P2);
    								apptPat.setSCN(0);
        							apptPat.validate();
        							save(apptPat);
    							  }
    							  catch (PdsException e)
    							  {
    								
    								e.printStackTrace();
    								summaryMessage.append("Error creating Back Office Entry: " + e.toString());
    								summaryMessage.append("\n");	
    							  }
    				    	}
    						
    					}
    					else
    					{
    							
    							notupdated++;
    						
    						  	PdsRetrievalQueryHelper helper = new PdsRetrievalQueryHelper(null);
        			    		helper.setPatientInContext(patTempVo.getInitialPatient());
        						try
        						{
        							helper.createBackOfficeItemAndNotification(PDSBackOfficeType.PDSSYNCFAILED,  patTempVo.getInitialPatient().getNhsn() != null ? patTempVo.getInitialPatient().getNhsn().toString():" ", PDSBackOfficeWorkPriority.P2);
        							       							        							
        						}
        						catch (PdsException e)
        						{
        							
        							e.printStackTrace();
        							summaryMessage.append("Error getting the patient record: " + e.toString());
        							summaryMessage.append("\n");	
        						}	
        						
    					}
    				}
    			}
    		
    		}
    		
		}
		
		
		long end = System.currentTimeMillis();				
		
		calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());				
		summaryMessage.append("End job at " +  calendar.getTime());
		summaryMessage.append("\n");
		
		int d = (int) (((end - start) / 1000) / 86400);
		int h = (int) (((end - start) / 1000) / 3600);
		int m = (int) ((((end - start) / 1000) / 60) % 60);
		int s = (int) (((end - start) / 1000) % 60);
		
		summaryMessage.append("Total time for execution : " + d + " days, " + h + " hours, " + m + " minutes, " + s + " seconds");
		summaryMessage.append("\n");
		summaryMessage.append("Total patients found : " + patientsfound);
		summaryMessage.append("\n");
		summaryMessage.append("Total patients updated : " + updated);
		summaryMessage.append("\n");
		summaryMessage.append("Total patients not updared  : " + notupdated);
		summaryMessage.append("\n");	

		trace("Scheduled job ended");
		summaryMessage.append("Scheduled job completed successfully.");

		
		return new SchedulerJobExecutionSummary(SchedulerJobExecutionStatus.SUCCEEDED, summaryMessage.toString());
	}
	
	private synchronized void save(PatientForJobVo apptPat )
	{
		if( apptPat == null )
		{
			return;
		}

		DomainFactoryBridge factory = getDomainFactory();
	
		ims.core.patient.domain.objects.Patient doPatient  = new ims.core.patient.domain.objects.Patient();
			
		try 
		{
			factory.save(doPatient);

					
		} 
		catch (StaleObjectException e) 
		{
			trace("Attendance Requiring Contracting  save failed! " + e.getMessage());
			return;
		}
		
	}
	
	private PatientForJobVoCollection listPatientsFromBookingAppt(PDSApptLetterRunVo job, PDSConfigurationVo configVo)
	{
	 
		java.util.Date fromDate = new DateTime(job.getFromDate()).getJavaDate();
		java.util.Date toDate = new DateTime(job.getToDate()).getJavaDate();
		Date todayd = new Date();
		
		java.util.Date todayMinus = null;
		if( configVo != null && configVo.getNumOfDaysAppointBatchTrace() != null )
			todayMinus = new DateTime( todayd.addDay((configVo.getNumOfDaysAppointBatchTrace())*(-1))).getJavaDate();
			
		DomainFactoryBridge factory = getDomainFactory();
				
		String hsql = "select distinct p1_1 from Booking_Appointment as b1_1 left join b1_1.patient as p1_1 where ( b1_1.appointmentDate >= :fromDate and b1_1.appointmentDate <= :toDate and p1_1.pDSDateLastChecked < :todayminus)";
		List allpatbookingappt = factory.find(hsql, new String[] {"fromDate","toDate","todayminus"}, new Object[] {fromDate,toDate,todayMinus});
		
		//String hsql = "select distinct p1_1 from Booking_Appointment as b1_1 left join b1_1.patient as p1_1 where ( b1_1.appointmentDate >= :fromDate and b1_1.appointmentDate <= :toDate)";
		//List allpatbookingappt = factory.find(hsql, new String[] {"fromDate","toDate"}, new Object[] {fromDate,toDate});
		
		if( allpatbookingappt != null && allpatbookingappt.size() > 0)
		{
			return PatientForJobVoAssembler.createPatientForJobVoCollectionFromPatient(allpatbookingappt);
		}
		
		return null;
	}
	
	private PDSApptLetterRunVo getJobDetails()
	{
		PDSApptLetterRun doPDSApptLetterRun = PDSApptLetterRun.getPDSApptLetterRunFromConfiguredJob(getDomainFactory(), super.getConfiguredJob().getConfiguredScheduledJobID());
		return PDSApptLetterRunVoAssembler.create(doPDSApptLetterRun);
		
	}
	private PDSConfigurationVo getPDSConfiguration()
	{
				
		List<?> results = getDomainFactory().find("from PDSConfiguration as cnconf");
		
		if( results == null || results.isEmpty() )
			return null;
		
		return PDSConfigurationVoAssembler.create((PDSConfiguration) results.get(0));
		
	}

	@Override
	public void cleanUpSettings(IConfiguredScheduledJob job) throws Exception
	{
		// Clean up existing job configuration settings here
		// This method will be called when the configured job is being deleted
		
		PDSApptLetterRun  doPDSApptLetterRun = PDSApptLetterRun.getPDSApptLetterRunFromConfiguredJob(getDomainFactory(), super.getConfiguredJob().getConfiguredScheduledJobID());
		
		if( doPDSApptLetterRun != null)
		{
			getDomainFactory().delete(doPDSApptLetterRun);
		}
	}
	
	private PatientShort getPatientShort(PatientForJobVo apptPat)
	{
		ims.core.patient.domain.objects.Patient doPatient = (ims.core.patient.domain.objects.Patient) getDomainFactory().getDomainObject(ims.core.patient.domain.objects.Patient.class, apptPat.getID_Patient());
		return PatientShortAssembler.create(doPatient);
	}
	
	
		
	private boolean checkAndRetrievalPdsDemographics(PatientShort pat, InititPatAndPDSPATForJobVo patTempVo, MissingMappingVoCollection missingMappings) 
    {
		if( patTempVo == null )
			return false;
		
		PDSConfigurationVo configVo = getPDSConfiguration();
		
		if(configVo == null)
		{
			System.out.println("UpdatePDSPatientUsingAppointmentJobImpl: PDSConfigurationVo is null !");
			return false;
		}

		if(configVo.getFromPDSAccreditedSystemId() == null || configVo.getFromPDSAccreditedSystemId().length() == 0)
		{
			System.out.println("PDSConfigurationVo.FromPDSAccreditedSystemId is null !");
			return false;
		}

		if(configVo.getToPDSAccreditedSystemId() == null || configVo.getToPDSAccreditedSystemId().length() == 0)
		{
			System.out.println("PDSConfigurationVo.ToPDSAccreditedSystemId is null !");
			return false;
		}
		
		Patient pdsPatient = null;
		        
		PdsRequestParameters params = new PdsRequestParameters(configVo.getFromPDSAccreditedSystemId(), configVo.getToPDSAccreditedSystemId());
    	    	               
        String url = ConfigFlag.GEN.PDS_SYNC_GATEWAY_URL.getValue();
               
        if(url == null || url.length() == 0)
        {
        	return false;
        }
        
                        
        PdsRetrievalQueryHelper helper = new PdsRetrievalQueryHelper(null);
                
        if( pat.getNhsn() != null)
        {
			//call PDS retrieval
			try
			{
				pdsPatient = helper.makeRequest(params, pat.getNhsn() != null ? pat.getNhsn().getIdValue() : "", PdsRetrievalQueryHelper.HistoricDataIndicator.ON);
				patTempVo.setPDSPatient(pdsPatient);
				if(pdsPatient == null)
				{
					return false;
				}
				
				if(helper.getMissingMappings() != null && missingMappings != null)
				{
					missingMappings.clear();
					
					for(int i = 0; i < helper.getMissingMappings().size(); i++)
					{
						missingMappings.add(helper.getMissingMappings().get(i));
					}
				}
			}
			catch (PdsException e)
			{
				System.out.println("UpdatePDSPatientUsingAppointmentJobImpl: " + e.toString());
				return false;
			}
		}
        else
        	return false;
        
        return true;
    }
	
	private boolean updateLocalPatientWithPds(InititPatAndPDSPATForJobVo patTempVo, MissingMappingVoCollection missingMappings)
	{
		if( patTempVo == null )
			return false;
		
    	ArrayList errors = new ArrayList();
    	Patient initialPatient = patTempVo.getInitialPatient();
    	Patient pdsPatient = patTempVo.getPDSPatient();
    	
    	
    	if( pdsPatient == null )
    		return false;
    	IPDSDemographicDomainHelper tempI = null; 
    	try
		{
    		try
			{
				tempI = (IPDSDemographicDomainHelper) getDomainImpl("ims.core.helper.PDSDemographicDomainHelper");
			}
			catch (Exception e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
				return false;	
			}
    		
    		
    		
			tempI.updateLocalPatientWithPds(initialPatient, pdsPatient, errors, IPDSDemographicDomainHelper.DEFAULT, null, missingMappings);
		}
		catch (DomainInterfaceException e1)
		{
			e1.printStackTrace();
			return false;
		}
		catch (StaleObjectException e1)
		{
			e1.printStackTrace();
			return false;
		}
		catch (ForeignKeyViolationException e1)
		{
			e1.printStackTrace();
			return false;
		}
		
		return true;
    	
    	
    
	}
	 
	private Object getDomainImpl(String className) throws Exception
	{
		Class<?> implClass = Class.forName(className);
		DomainImplFlyweightFactory factory = DomainImplFlyweightFactory.getInstance();
		return factory.create(implClass, ims.scheduler.DomainSession.getSession());
	}

	
	
}
