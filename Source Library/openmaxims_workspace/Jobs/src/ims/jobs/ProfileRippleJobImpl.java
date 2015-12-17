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

import java.util.Calendar;
import java.util.List;

import org.quartz.JobExecutionException;


import ims.core.configuration.domain.objects.ConfiguredJob;
import ims.domain.DomainSession;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.impl.DomainImplFlyweightFactory;
import ims.framework.interfaces.IConfiguredScheduledJob;
import ims.scheduler.SchedulerJobExecutionSummary;
import ims.scheduler.SchedulerJobExecutionStatus;
import ims.scheduling.domain.GenerateSessions;

public final class ProfileRippleJobImpl extends ims.scheduler.SchedulerJob
{
	@Override
	public SchedulerJobExecutionSummary doExecute() throws JobExecutionException
	{
		long start = System.currentTimeMillis();
		StringBuilder summaryMessage = new StringBuilder();
		
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());		
		summaryMessage.append("Started scheduled job at: " +  calendar.getTime());
		summaryMessage.append("\n");
		trace("Scheduled job was started successfully!");
		
		ConfiguredJob  job = getJobDetails();
		if (job == null)
		{
			throw new JobExecutionException("Job configuration is missing. Aborted execution at: " + calendar.getTime());
		}
		
		// Call the method to load ProfileRipple records and update sessions / appointments
		int totalRecordsUpdated = 0;
		
		try 
		{
		    GenerateSessions impl = (GenerateSessions) getDomainImpl("ims.scheduling.domain.impl.GenerateSessionsImpl");
		    totalRecordsUpdated = impl.rippleProfileChanges();

			getDomainFactory().save(job);
		} 
		catch (Exception e) 
		{
			return new SchedulerJobExecutionSummary(SchedulerJobExecutionStatus.FAILED, e.getMessage());
		}

		long end = System.currentTimeMillis();				
		
		calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());				
		summaryMessage.append("Scheduled job ended at: " +  calendar.getTime());
		summaryMessage.append("\n");
		
		int d = (int) (((end - start) / 1000) / 86400);
		int h = (int) (((end - start) / 1000) / 3600);
		int m = (int) ((((end - start) / 1000) / 60) % 60);
		int s = (int) (((end - start) / 1000) % 60);
		
		summaryMessage.append("Total time for execution: " + d + " days, " + h + " hours, " + m + " minutes, " + s + " seconds.");
		summaryMessage.append("\n");
		summaryMessage.append("Total number of sessions updated: " + totalRecordsUpdated);
		summaryMessage.append("\n");
		summaryMessage.append("Scheduled job has completed successfully!");
		
		trace("Scheduled job has ended!");

		return new SchedulerJobExecutionSummary(SchedulerJobExecutionStatus.SUCCEEDED, summaryMessage.toString());
	}

	private ConfiguredJob getJobDetails() 
	{
		List lst = getDomainFactory().find(" from ConfiguredJob job where job.scheduledJob.imsId = :imsId and job.scheduledJob.name = :name ", new String[]{"imsId", "name"}, new Object[]{18, "ProfileRipple"});
		if (lst == null || lst.size() == 0)
			return null;
		
		return (ConfiguredJob) (lst.get(0));
	}
	
	// used to get the instantiated Domain Impl class
	protected Object getDomainImpl(String className) throws Exception
	{
		Class<?> implClass = Class.forName(className);
			
		DomainSession sess = ims.scheduler.DomainSession.getSession();
		DomainImplFlyweightFactory factory = DomainImplFlyweightFactory.getInstance();
		
		return factory.create(implClass, sess);
	}
	
	public void cleanUpSettings(IConfiguredScheduledJob job) throws Exception
	{
		// Clean up existing job configuration settings here
		// This method will be called when the configured job is being deleted
	}
}
