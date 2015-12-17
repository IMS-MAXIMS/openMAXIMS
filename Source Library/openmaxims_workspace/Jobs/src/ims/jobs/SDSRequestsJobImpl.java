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
import ims.core.configuration.domain.objects.SDSRequestsBatch;
import ims.core.helper.SdsRequestHelper;
import ims.core.resource.people.domain.objects.Gp;
import ims.core.resource.place.domain.objects.Organisation;
import ims.core.vo.SDSRequestsBatchVo;
import ims.core.vo.domain.SDSRequestsBatchVoAssembler;
import ims.core.vo.lookups.TaxonomyType;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.enumerations.SystemLogLevel;
import ims.framework.enumerations.SystemLogType;
import ims.framework.interfaces.IConfiguredScheduledJob;
import ims.framework.utils.DateTime;
import ims.scheduler.DomainFactoryBridge;
import ims.scheduler.SchedulerJobExecutionStatus;
import ims.scheduler.SchedulerJobExecutionSummary;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.quartz.JobExecutionException;

public final class SDSRequestsJobImpl extends ims.scheduler.SchedulerJob
{
	private int	TotalGPsNo = 0;
	private int	SuccessfulGPssNo = 0;
	private int	TotalPracticesNo = 0;
	private int	SuccessfulPracticesNo = 0;
	
	HashSet<Gp> gps = null;
	HashSet<Organisation> practices = null;
	
	HashSet<Gp> updatedGps = null;//WDEV-23211
	HashSet<Organisation> updatedPractices = null;//WDEV-23211
	
	DateTime newSuccessfulRunDate = null;
	
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
		
		SDSRequestsBatchVo job = getJobDetails();
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
		
		listGpsAndPractices(job.getLastSuccessfulRunDate());
		
		processGPSDSLookup(conf);
		saveGPs();//WDEV-23211
		
		processPracticeSDSLookup(conf);
		savePractices();//WDEV-23211
		
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
		
		if(newSuccessfulRunDate == null)
		{
			summaryMessage.append("An error was found during execution.  The next scheduled job will also pick up older requests.");
			summaryMessage.append("\n\n");
		}
		
		summaryMessage.append("Total GPs Processed : " + TotalGPsNo);
		summaryMessage.append("\n");
		summaryMessage.append("Successful GPs Updated : " + SuccessfulGPssNo);
		summaryMessage.append("\n");
		summaryMessage.append("\n");
		summaryMessage.append("Total Practices Processed : " + TotalPracticesNo);
		summaryMessage.append("\n");
		summaryMessage.append("Successful Practices Updated : " + SuccessfulPracticesNo);
		summaryMessage.append("\n\n");	

		summaryMessage.append("Scheduled job completed successfully.");
		
		trace("Scheduled job ended");
		
		return new SchedulerJobExecutionSummary(SchedulerJobExecutionStatus.SUCCEEDED, summaryMessage.toString());
	}
	
	private void savePractices()//WDEV-23211
	{
		if(updatedPractices == null)
			return;
		
		DomainFactoryBridge factory = getDomainFactory();
		
		Iterator<Organisation> it = updatedPractices.iterator();
		while(it.hasNext())
		{
			Organisation practice = it.next();
			
			if(practice == null)
				continue;
		
    		try
    		{
    			factory.save(practice);
    			factory.commitTransaction();
    		}
    		catch (StaleObjectException e)
    		{
    			//trace("Error saving SDS request for Practice '" + practice.getName()  + "': " + e.getMessage());
    			createSystemLogEntry(SystemLogType.SDS, SystemLogLevel.ERROR, "Error saving SDS request for Practice '" + practice.getName()  + "': " + e.getMessage());
    			newSuccessfulRunDate = null;
    			continue;
    		}
    		
    		SuccessfulPracticesNo ++;
		}
	}

	private void saveGPs()//WDEV-23211
	{
		if(updatedGps == null)
			return;
		
		DomainFactoryBridge factory = getDomainFactory();
		
		Iterator<Gp> it = updatedGps.iterator();
		while(it.hasNext())
		{
			Gp gp = it.next();
			
			if(gp == null)
				continue;
			
			try
			{
				factory.save(gp);
				factory.commitTransaction();
			}
			catch (StaleObjectException e)
			{
				//trace("Error during saving updates for GP '" + gp.getName().toString()  + "': " + e.getMessage());
				createSystemLogEntry(SystemLogType.SDS, SystemLogLevel.ERROR, "Error during saving updates for GP '" + gp.getName().toString()  + "': " + e.getMessage());
				newSuccessfulRunDate = null;
				continue;
			}
			
			SuccessfulGPssNo ++;
		}
	}

	private void processPracticeSDSLookup(PDSConfigurationVo conf)
	{
		if(practices == null || practices.size() == 0)
			return;
		
		Iterator<Organisation> it = practices.iterator();
		while(it.hasNext())
		{
			Organisation practice = it.next();
			
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
				
				SdsRequestHelper sdsHelper = new SdsRequestHelper();
				
				Organisation updatedPractice = null;
				
				try
				{
					updatedPractice = sdsHelper.processPracticeSdsRequest(practice, conf.getSDSHost(), conf.getSDSPort());
				}
				catch (Exception e)
				{
					//trace("Error processing SDS request for Practice '" + practice.getName()  + "': " + e.getMessage());
					createSystemLogEntry(SystemLogType.SDS, SystemLogLevel.ERROR, "Error processing SDS request for Practice '" + practice.getName()  + "': " + e.getMessage());
					newSuccessfulRunDate = null;
					continue;
				}
				
				if(updatedPractice != null)
				{
					//WDEV-23211 - starts here
					if(updatedPractices == null)
					{
						updatedPractices = new HashSet<Organisation>();
					}
					
					updatedPractices.add(updatedPractice);
					//WDEV-23211 - ends here
				}
			}
		}
	}

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

	private void processGPSDSLookup(PDSConfigurationVo conf)
	{
		if(gps == null || gps.size() == 0)
			return;
		
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
				
				SdsRequestHelper sdsHelper = new SdsRequestHelper();
				
				Gp gpNew = null;
				
				try
				{
					gpNew = sdsHelper.processGPSdsRequest(gp, conf.getSDSHost(), conf.getSDSPort());
				}
				catch (Exception e)
				{
					//trace("Error processing SDS request for GP '" + gp.getName().toString()  + "': " + e.getMessage());
					createSystemLogEntry(SystemLogType.SDS, SystemLogLevel.ERROR, "Error processing SDS request for GP '" + gp.getName().toString()  + "': " + e.getMessage());
					newSuccessfulRunDate = null;
					continue;
				}
				
				if(gpNew != null)
				{
					//WDEV-23211 - starts here
					if(updatedGps == null)
					{
						updatedGps = new HashSet<Gp>();
					}
					
					updatedGps.add(gpNew);
					//WDEV-23211 - ends here
				}
			}
		}
	}

	private PDSConfigurationVo getPdsConfiguration()
	{
		String hql = "select pds from PDSConfiguration as pds where pds.isRIE is null order by pds.id desc";
		
		List<?> list = getDomainFactory().find(hql);

		if(list != null && list.size() > 0)
			return PDSConfigurationVoAssembler.create((PDSConfiguration) list.get(0));
		
		return null;
	}
	
	private void listGpsAndPractices(DateTime lastSuccessfulRunDate)
	{
		if(lastSuccessfulRunDate == null)
		{
			lastSuccessfulRunDate = (new DateTime()).addDays(-30);//first time will run for the last month
		}
		
		String patientQuery = "select pat.gp, pat.practice from Patient as pat where pat.systemInformation.creationDateTime >= :Date or pat.systemInformation.lastUpdateDateTime >= :Date";
		List<?> patientList = getDomainFactory().find(patientQuery, new String[]{"Date"}, new Object[] {lastSuccessfulRunDate.getJavaDate()});
		
		assembleGpsAndPractices(patientList);
		
		String referralQuery = "select ref.gPName, ref.practice from ReferralLetterDetails as ref where ref.systemInformation.creationDateTime >= :Date or ref.systemInformation.lastUpdateDateTime >= :Date";
		List<?> referralList = getDomainFactory().find(referralQuery, new String[]{"Date"}, new Object[] {lastSuccessfulRunDate.getJavaDate()});
		
		assembleGpsAndPractices(referralList);
		
		newSuccessfulRunDate = new DateTime();
	}

	private void assembleGpsAndPractices(List<?> list)
	{
		if(list != null && list.size() > 0)
		{
			if(gps == null)
				gps = new HashSet<Gp>();
			
			if(practices == null)
				practices = new HashSet<Organisation>();
			
			for(int i=0; i<list.size(); i++)
			{
				if(list.get(i) == null)
					continue;
				
				Object[] items = (Object[]) list.get(i);
				
				if(items == null || items.length == 0)
					continue;
				
				if(items[0] instanceof Gp)
				{
					gps.add((Gp) items[0]);
				}
				
				if(items[1] instanceof Organisation)
				{
					practices.add((Organisation) items[1]);
				}
			}
		}
	}

	private synchronized void saveJob(SDSRequestsBatchVo job)
	{
		if(job == null)
			return;
		
		job.setProcessedGPRequestsNo(TotalGPsNo);
		job.setSuccessfulGPRequestsUpdatedNo(SuccessfulGPssNo);
		job.setProcessedPracticeRequestsNo(TotalPracticesNo);
		job.setSuccessfulPracticeRequestsUpdatedNo(SuccessfulPracticesNo);
		
		if(newSuccessfulRunDate != null)
		{
			job.setLastSuccessfulRunDate(newSuccessfulRunDate);
		}
			
		DomainFactoryBridge factory = getDomainFactory();
		SDSRequestsBatch batch  = SDSRequestsBatchVoAssembler.extractSDSRequestsBatch(factory, job);
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

	private SDSRequestsBatchVo getJobDetails()
	{
		SDSRequestsBatch doJob = SDSRequestsBatch.getSDSRequestsBatchFromConfiguredJobDetails(getDomainFactory(), super.getConfiguredJob().getConfiguredScheduledJobID());
		return SDSRequestsBatchVoAssembler.create(doJob);
	}

	@Override
	public void cleanUpSettings(IConfiguredScheduledJob job) throws Exception
	{
		SDSRequestsBatch doJob = SDSRequestsBatch.getSDSRequestsBatchFromConfiguredJobDetails(getDomainFactory(), super.getConfiguredJob().getConfiguredScheduledJobID());
		
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
