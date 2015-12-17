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

import org.quartz.JobExecutionException;

import ims.framework.interfaces.IConfiguredScheduledJob;
import ims.scheduler.SchedulerJobExecutionStatus;
import ims.scheduler.SchedulerJobExecutionSummary;
 
public final class IMSInternalTestJobImpl extends ims.scheduler.SchedulerJob
{
	@Override
	public SchedulerJobExecutionSummary doExecute() throws JobExecutionException
	{
		StringBuilder summaryMessage = new StringBuilder();

		// use trace method to log various execution points and state
		trace("Scheduled job started");

		// TODO: Implement the job execution here
		getDomainFactory().beginTransaction();		
		
		trace("Scheduled job ended");
		summaryMessage.append("Scheduled job completed successfully.");

		// Return the execution summary
		// This should include a summary text along with the job execution status
		return new SchedulerJobExecutionSummary(SchedulerJobExecutionStatus.SUCCEEDED, summaryMessage.toString());
	}

	@Override
	public void cleanUpSettings(IConfiguredScheduledJob job) throws Exception 
	{		
		// Clean up existing job configuration settings here
		// This method will be called when the configured job is being deleted
	}
}
