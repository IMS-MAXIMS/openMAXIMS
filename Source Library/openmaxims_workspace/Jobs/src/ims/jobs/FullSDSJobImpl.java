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

import ims.admin.vo.PDSConfigurationVo;
import ims.admin.vo.domain.PDSConfigurationVoAssembler;
import ims.core.admin.domain.objects.PDSConfiguration;
import ims.core.clinical.domain.objects.TaxonomyMap;
import ims.core.configuration.domain.objects.FullSDSBatch;
import ims.core.helper.SdsRequestHelper;
import ims.core.resource.people.domain.objects.Gp;
import ims.core.resource.place.domain.objects.Organisation;
import ims.core.vo.FullSDSBatchVo;
import ims.core.vo.domain.FullSDSBatchVoAssembler;
import ims.core.vo.lookups.GPStatus;
import ims.core.vo.lookups.TaxonomyType;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.enumerations.SystemLogLevel;
import ims.framework.enumerations.SystemLogType;
import ims.framework.interfaces.IConfiguredScheduledJob;
import ims.scheduler.DomainFactoryBridge;
import ims.scheduler.SchedulerJobExecutionStatus;
import ims.scheduler.SchedulerJobExecutionSummary;

import java.net.ConnectException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.quartz.JobExecutionException;

public final class FullSDSJobImpl extends ims.scheduler.SchedulerJob
{
	private int	TotalGPsNo = 0;
	private int	SuccessfulGPssNo = 0;
	private int	TotalPracticesNo = 0;
	private int	SuccessfulPracticesNo = 0;
	
	//private static int FAILED_MAX_NUMBER = 100000;
	//private int FailedNo = 0;
	//private int FailedNoInactiveGP = 0;
	
	private int FailedNoProcessingGPs = 0;
	private int FailedNoProcessingPractices = 0;
	private int FailedNoSavingGPs = 0;
	private int FailedNoSavingPractices = 0;
	
	HashSet<Gp> gps = null;
	HashSet<Organisation> practices = null;
	
	//WDEV-23281
	//HashSet<Gp> updatedGps = null;
	//HashSet<Organisation> updatedPractices = null;
	
	@Override
	public SchedulerJobExecutionSummary doExecute() throws JobExecutionException
	{
		long start = System.currentTimeMillis();		
		StringBuilder summaryMessage = new StringBuilder();		
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());		
		summaryMessage.append("Start job at " +  calendar.getTime());
		summaryMessage.append("\n");
		trace("Scheduled job started");
		
		FullSDSBatchVo job = getJobDetails();
		if(job == null)
		{
			throw new JobExecutionException("Job configuration missing");
		}
		
		PDSConfigurationVo conf = getPdsConfiguration();
		
		if (conf == null)
		{
			trace("Scheduled job not started because SDSHost and SDSPort must be configured on Patient Search Configuration screen in order to perform a GP/Practice SDS lookup.");
			summaryMessage.append("Scheduled job not started because SDSHost and SDSPort must be configured on Patient Search Configuration screen in order to perform a GP/Practice SDS lookup.");
			return new SchedulerJobExecutionSummary(SchedulerJobExecutionStatus.FAILED, summaryMessage.toString());
		}

		if(conf.getSDSHost() == null || conf.getSDSHost().length() == 0)
		{
			trace("Scheduled job not started because SDSHost must be configured on Patient Search Configuration screen in order to perform a GP/Practice SDS lookup.");
			summaryMessage.append("Scheduled job not started because SDSHost must be configured on Patient Search Configuration screen in order to perform a GP/Practice SDS lookup.");
			return new SchedulerJobExecutionSummary(SchedulerJobExecutionStatus.FAILED, summaryMessage.toString());
		}

		if(conf.getSDSPort() == null || conf.getSDSPort().length() == 0)
		{
			trace("Scheduled job not started because SDSPort must be configured on Patient Search Configuration screen in order to perform a GP/Practice SDS lookup.");
			summaryMessage.append("Scheduled job not started because SDSPort must be configured on Patient Search Configuration screen in order to perform a GP/Practice SDS lookup.");
			return new SchedulerJobExecutionSummary(SchedulerJobExecutionStatus.FAILED, summaryMessage.toString());
		}
		
		listGpsAndPractices();
		
		if(!processGPSDSLookup(conf))
		{
			trace("Scheduled job aborted because of a Connection Exception.");
			summaryMessage.append("Scheduled job aborted because of a Connection Exception.");
			return new SchedulerJobExecutionSummary(SchedulerJobExecutionStatus.FAILED, summaryMessage.toString());
		}
		
		//WDEV-23281
		//saveGPs();
		//WDEV-23281
		
		//processPracticeSDSLookup(conf);
		
		//WDEV-23281
		//savePractices();
		//WDEV-23281
		
		saveJob(job);

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
		summaryMessage.append("\n\n");
		
		summaryMessage.append("Total GPs Processed : " + TotalGPsNo);
		summaryMessage.append("\n");
		summaryMessage.append("Successful GPs Updated : " + SuccessfulGPssNo);
		summaryMessage.append("\n");
		summaryMessage.append("\n");
		//summaryMessage.append("Total Practices Processed : " + TotalPracticesNo);
		//summaryMessage.append("\n");
		//summaryMessage.append("Successful Practices Updated : " + SuccessfulPracticesNo);
		//summaryMessage.append("\n\n");	
		
		summaryMessage.append("Total Errors From Processing Gps: " + FailedNoProcessingGPs);
		summaryMessage.append("\n");	

		//summaryMessage.append("Total Errors From Processing Practices: " + FailedNoProcessingPractices);
		//summaryMessage.append("\n");	

		summaryMessage.append("Total Errors From Updating Gps: " + FailedNoSavingGPs);
		summaryMessage.append("\n");	

		//summaryMessage.append("Total Errors From Updating Practices: " + FailedNoSavingPractices);
		//summaryMessage.append("\n");
		summaryMessage.append("Errors can be seen on System Log Form");
		summaryMessage.append("\n\n");
		
		
		
		summaryMessage.append("Scheduled job completed successfully.");
		
		trace("Scheduled job ended");
		
		return new SchedulerJobExecutionSummary(SchedulerJobExecutionStatus.SUCCEEDED, summaryMessage.toString());
	}

//WDEV-23281
//	private void savePractices()
//	{
//		if(updatedPractices == null)
//			return;
//		
//		DomainFactoryBridge factory = getDomainFactory();
//		
//		Iterator<Organisation> it = updatedPractices.iterator();
//		while(it.hasNext())
//		{
//			Organisation practice = it.next();
//			
//			if(practice == null)
//				continue;
//		
//    		try
//    		{
//    			factory.save(practice);
//    			factory.commitTransaction();
//    		}
//    		catch (Exception e)
//    		{
//    			//trace("Error saving SDS request for Practice '" + practice.getName()  + "': " + e.getMessage());
//    			createSystemLogEntry(SystemLogType.SDS, SystemLogLevel.ERROR, "Error saving SDS request for Practice '" + practice.getName()  + "': " + e.getMessage());
//    			FailedNoSavingPractices++;
//    			continue;
//    		}
//    		
//    		SuccessfulPracticesNo ++;
//		}
//	}

//	private void saveGPs()
//	{
//		if(updatedGps == null)
//			return;
//		
//		DomainFactoryBridge factory = getDomainFactory();
//		
//		Iterator<Gp> it = updatedGps.iterator();
//		while(it.hasNext())
//		{
//			Gp gp = it.next();
//			
//			if(gp == null)
//				continue;
//			
//			try
//			{
//				factory.save(gp);
//				factory.commitTransaction();
//			}
//			catch (Exception e)
//			{
//				//trace("Error during saving updates for GP '" + gp.getName().toString()  + "': " + e.getMessage());
//				createSystemLogEntry(SystemLogType.SDS, SystemLogLevel.ERROR, "Error during saving updates for GP '" + gp.getName().toString()  + "': " + e.getMessage());
//				FailedNoSavingGPs++;
//				continue;
//			}
//			
//			SuccessfulGPssNo ++;
//		}
//	}
//WDEV-23281
	
//WDEV-23281	
	private void processPracticeSDSLookup(PDSConfigurationVo conf)
	{
		if(practices == null || practices.size() == 0)
			return;		
		
		createSystemLogEntry(SystemLogType.SDS, SystemLogLevel.INFORMATION, "Start Process of Practice Full SDS Job - Number of records to process = " + practices.size());
		
		Iterator<Organisation> it = practices.iterator();
		while(it.hasNext())
		{
			
			Organisation practice = it.next();
			
			DomainFactoryBridge factory = getDomainFactory();
			
			if(practice == null)
				continue;
			
			String sdsOrgId = getTaxonomyCode(practice, TaxonomyType.ICAB);
			
			if(sdsOrgId == null || sdsOrgId.length() == 0)
			{
				sdsOrgId = getTaxonomyCode(practice, TaxonomyType.NAT_LOC_CODE);
			}
			
			if(sdsOrgId != null && sdsOrgId.length() > 0)
			{
				TotalPracticesNo++;
				
				SdsRequestHelper sdsHelper = new SdsRequestHelper(conf);
				
				Organisation updatedPractice = null;
				
				try
				{
					updatedPractice = sdsHelper.processPracticeSdsRequest(practice, conf.getSDSHost(), conf.getSDSPort());
					
					if (updatedPractice!=null && practice!=null)
					{
						practice.setName(updatedPractice.getName());
						practice.setUpperName(updatedPractice.getUpperName());
						practice.setAddress(updatedPractice.getAddress());
						practice.setIsActive(updatedPractice.isIsActive());
						practice.setPctCode(updatedPractice.getPctCode());

			    		try
			    		{
			    			factory.save(practice);
							if (TotalPracticesNo%100==0)
							{
								createSystemLogEntry(SystemLogType.SDS, SystemLogLevel.INFORMATION, "Commit tranaction Practice Full SDS Job - Number of records processed = " + TotalPracticesNo);
								factory.commitTransaction();
							}
			    		}
			    		catch (Exception e)
			    		{
			    			//trace("Error saving SDS request for Practice '" + practice.getName()  + "': " + e.getMessage());
			    			if (practice!=null)
			    				createSystemLogEntry(SystemLogType.SDS, SystemLogLevel.ERROR, "Error saving SDS request for Practice '" + practice.getName()  + "': " + e.getMessage());
			    			FailedNoSavingPractices++;
			    			continue;
			    		}
					}
					
				}
				catch (Exception e)
				{
					//trace("Error processing SDS request for Practice '" + practice.getName()  + "': " + e.getMessage());
					if (practice!=null)
						createSystemLogEntry(SystemLogType.SDS, SystemLogLevel.ERROR, "Error processing SDS request for Practice '" + practice.getName()  + "': " + e.getMessage());
					FailedNoProcessingPractices++;
					continue;
				}
				
//				if(updatedPractice != null)
//				{
//					if(updatedPractices == null)
//					{
//						updatedPractices = new HashSet<Organisation>();
//					}
//					
//					updatedPractices.add(updatedPractice);
//				}
			}
		}
	}
//WDEV-23281
	
	private String getTaxonomyCode(Organisation practice, TaxonomyType taxMap)
	{
		if(practice == null || taxMap == null)
			return null;
		
		if(practice.getCodeMappings() != null)
		{
			for(int j = 0; j < practice.getCodeMappings().size(); j++)
			{
				Object mapping = practice.getCodeMappings().get(j);
				
				if(mapping instanceof TaxonomyMap)
				{
					if(((TaxonomyMap)mapping).getTaxonomyName() != null  && (taxMap.getID() == ((TaxonomyMap)mapping).getTaxonomyName().getId()))
					{
						return ((TaxonomyMap) mapping).getTaxonomyCode();
					}
				}
			}
		}
		
		return null;
	}

	private boolean processGPSDSLookup(PDSConfigurationVo conf)
	{
		if(gps == null || gps.size() == 0)
			return true;
//WDEV-23281			
		
		createSystemLogEntry(SystemLogType.SDS, SystemLogLevel.INFORMATION, "Start Process of GP Full SDS Job - Number of records to process = " + gps.size());
		
		DomainFactoryBridge factory = getDomainFactory();
		
		Iterator<Gp> it = gps.iterator();
		
		while(it.hasNext())
		{
			Gp gp = it.next();
			if(gp == null)
				continue;
			
			String sdsId = "";
			String gpCode = "";
			
			if(gp.getCodeMappings() != null)
			{
				for(int j = 0; j < gp.getCodeMappings().size(); j++)
				{
					Object mapping = gp.getCodeMappings().get(j);
					
					if(mapping instanceof TaxonomyMap)
					{
    					if(((TaxonomyMap)mapping).getTaxonomyName() != null && (TaxonomyType.SDSID.getID() == ((TaxonomyMap)mapping).getTaxonomyName().getId()))
    					{
    						sdsId = ((TaxonomyMap) mapping).getTaxonomyCode();
    					}
    					
    					if(((TaxonomyMap)mapping).getTaxonomyName() != null && (TaxonomyType.NAT_GP_CODE.getID() == ((TaxonomyMap)mapping).getTaxonomyName().getId()))
    					{
    						gpCode = ((TaxonomyMap) mapping).getTaxonomyCode();
    					}
					}
				}
			}
			
			if((sdsId != null && sdsId.length() > 0) || (gpCode != null && gpCode.length() > 0) )
			{
				TotalGPsNo++;
				
				SdsRequestHelper sdsHelper = new SdsRequestHelper(conf);
				
				Gp gpNew = null;
				
				try
				{
					gpNew = sdsHelper.processGPSdsRequest(gp, conf.getSDSHost(), conf.getSDSPort());
					
					try
					{
						if((gpNew != null && gpNew.getName()!=null) && (gp!=null && gp.getName()!=null))
						{							
							
							//get the Gp record again and update
							
							//Only update retrieved gp domain object from db from query on list, not the gp instance returned from the sds request 
			        		gp.getName().setForename(gpNew.getName().getForename());
			            	gp.getName().setUpperForename(gpNew.getName().getForename() != null ? gpNew.getName().getForename().toUpperCase() : null);
			            	gp.getName().setSurname(gpNew.getName().getSurname());
			            	gp.getName().setUpperSurname(gpNew.getName().getSurname() != null ? gpNew.getName().getSurname().toUpperCase() : null);
			            	gp.getName().setMiddleName(gpNew.getName().getMiddleName());
			            	gp.getName().setTitle(gpNew.getName().getTitle());
			            				            	
//							if(updatedGps == null)
//							{
//								updatedGps = new HashSet<Gp>();
//							}
//
//							updatedGps.add(gp);
			            	
			            	if (factory==null)
			            		factory = getDomainFactory();
			            		
			            	
							factory.save(gp);
							
							if (TotalGPsNo%100==0)
							{
								createSystemLogEntry(SystemLogType.SDS, SystemLogLevel.INFORMATION, "Commit tranaction GP Full SDS Job - Number of records processed = " + TotalGPsNo);
								factory.commitTransaction();
							}
						}
						
					}
					catch (Exception e)
					{
						//trace("Error during saving updates for GP '" + gp.getName().toString()  + "': " + e.getMessage());
						
						if (gp!=null && gp.getName()!=null)
							createSystemLogEntry(SystemLogType.SDS, SystemLogLevel.ERROR, "Error during saving updates for GP '" + gp.getName().toString()  + "': " + e.getMessage());
						else if (gp!=null)
							createSystemLogEntry(SystemLogType.SDS, SystemLogLevel.ERROR, "Error during saving updates for GP '" + gp.getName() + "': " + e.getMessage());
						FailedNoSavingGPs++;
						continue;
					}
					
					SuccessfulGPssNo ++;
					
				}
				catch (Exception e)
				{
					if(e.getCause() instanceof ConnectException || e.getCause() instanceof SocketException || e.getCause() instanceof UnknownHostException)
					{
						return false;
					}
					
					//trace("Error processing SDS request for GP '" + gp.getName().toString()  + "': " + e.getMessage());
					if (gp!=null && gp.getName()!=null)
						createSystemLogEntry(SystemLogType.SDS, SystemLogLevel.ERROR, "Error processing SDS request for GP '" + gp.getName().toString()  + "': " + e.getMessage());
					else if (gp!=null)
						createSystemLogEntry(SystemLogType.SDS, SystemLogLevel.ERROR, "Error processing SDS request for GP '" + gp.getName()  + "': " + e.getMessage());
					FailedNoProcessingGPs++;
					continue;
				}
				
//				if(gpNew != null)
//				{
//					if(updatedGps == null)
//					{
//						updatedGps = new HashSet<Gp>();
//					}
//					
//					//Only update retrieved gp domain object from db from query on list, not the gp instance returned from the sds request 
//	        		gp.getName().setForename(gpNew.getName().getForename());
//	            	gp.getName().setUpperForename(gpNew.getName().getForename() != null ? gpNew.getName().getForename().toUpperCase() : null);
//	            	gp.getName().setSurname(gpNew.getName().getForename());
//	            	gp.getName().setUpperSurname(gpNew.getName().getSurname() != null ? gpNew.getName().getSurname().toUpperCase() : null);
//	            	gp.getName().setMiddleName(gpNew.getName().getMiddleName());
//	            	gp.getName().setTitle(gpNew.getName().getTitle());
//
//					updatedGps.add(gp);
//				}
			}
		}
//WDEV-23281
		
		return true;
	}

	private PDSConfigurationVo getPdsConfiguration()
	{
		String hql = "select pds from PDSConfiguration as pds where pds.isRIE is null order by pds.id desc";
		
		List<?> list = getDomainFactory().find(hql);

		if(list != null && list.size() > 0)
			return PDSConfigurationVoAssembler.create((PDSConfiguration) list.get(0));
		
		return null;
	}
	
	private void listGpsAndPractices()
	{
		String gpQuery = "select gp from Gp as gp left join gp.status as status where (gp.isRIE is null or gp.isRIE = 0) and  status.id <> " + GPStatus.INACTIVE.getID();
		List<?> gpsList = getDomainFactory().find(gpQuery);
		
		assembleGps(gpsList);
		
		//String practiceQuery = "select org from Organisation as org left join org.type as orgType where (org.isRIE is null or org.isRIE = 0) and orgType.id = :OrganisationType";
		//List<?> practicesList = getDomainFactory().find(practiceQuery, new String[]{"OrganisationType"}, new Object[] {OrganisationType.GPP.getID()});
		
		//assemblePractices(practicesList);
	}

	private void assembleGps(List<?> list)
	{
		if(list != null && list.size() > 0)
		{
			if(gps == null)
				gps = new HashSet<Gp>();
			
			for(int i=0; i<list.size(); i++)
			{
				if(list.get(i) instanceof Gp)
				{
					gps.add((Gp) list.get(i));
				}
			}
		}
	}
	
	private void assemblePractices(List<?> list)
	{
		if(list != null && list.size() > 0)
		{
			if(practices == null)
				practices = new HashSet<Organisation>();
			
			for(int i=0; i<list.size(); i++)
			{
				if(list.get(i) instanceof Organisation)
				{
					practices.add((Organisation) list.get(i));
				}
			}
		}
	}

	private synchronized void saveJob(FullSDSBatchVo job)
	{
		if(job == null)
			return;
		
		job.setProcessedGPRequestsNo(TotalGPsNo);
		job.setSuccessfulGPRequestsUpdatedNo(SuccessfulGPssNo);
		job.setProcessedPracticeRequestsNo(TotalPracticesNo);
		job.setSuccessfulPracticeRequestsUpdatedNo(SuccessfulPracticesNo);
			
		DomainFactoryBridge factory = getDomainFactory();
		FullSDSBatch batch  = FullSDSBatchVoAssembler.extractFullSDSBatch(factory, job);
		try 
		{
			factory.save(batch);
		} 
		catch (StaleObjectException e) 
		{
			trace("Job details save has failed! " + e.getMessage());
			return;
		}
	}

	private FullSDSBatchVo getJobDetails()
	{
		FullSDSBatch doJob = FullSDSBatch.getFullSDSBatchFromConfiguredJobDetails(getDomainFactory(), super.getConfiguredJob().getConfiguredScheduledJobID());
		return FullSDSBatchVoAssembler.create(doJob);
	}

	@Override
	public void cleanUpSettings(IConfiguredScheduledJob job) throws Exception
	{
		FullSDSBatch doJob = FullSDSBatch.getFullSDSBatchFromConfiguredJobDetails(getDomainFactory(), super.getConfiguredJob().getConfiguredScheduledJobID());
		
		if(doJob != null)
		{
			getDomainFactory().delete(doJob);
		}
	}
	
	private void createSystemLogEntry(SystemLogType logType, SystemLogLevel logLevel, String message)
	{		
		try
		{
			ims.domain.DomainSession.getSession().createSystemLogEntry(logType, logLevel, message);
		}
		catch(Exception e)
		{	
			e.printStackTrace();
		}
	}
}
