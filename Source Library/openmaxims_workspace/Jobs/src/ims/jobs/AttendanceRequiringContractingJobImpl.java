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

import ims.configuration.gen.ConfigFlag;
import ims.core.admin.domain.objects.EmergencyAttendance;
import ims.domain.exceptions.StaleObjectException;
import ims.emergency.configuration.domain.objects.AttendanceReqContractSettings;
import ims.emergency.domain.objects.AttendanceRequiringContracting;
import ims.emergency.vo.AttendanceReqContractSettingsVo;
import ims.emergency.vo.domain.AttendanceReqContractSettingsVoAssembler;
import ims.framework.interfaces.IConfiguredScheduledJob;
import ims.framework.utils.DateTime;
import ims.scheduler.DomainFactoryBridge;
import ims.scheduler.SchedulerJobExecutionStatus;
import ims.scheduler.SchedulerJobExecutionSummary;

import java.util.Calendar;
import java.util.List;

import org.quartz.JobExecutionException;

public final class AttendanceRequiringContractingJobImpl extends ims.scheduler.SchedulerJob
{
	private int reqAllocations = 0;
	private int failed = 0;
	
	@Override
	public SchedulerJobExecutionSummary doExecute() throws JobExecutionException
	{
		StringBuilder summaryMessage = new StringBuilder();

		if (!Boolean.TRUE.equals(ConfigFlag.UI.USE_HEARTS_CONTRACTING.getValue()))
		{
			trace("Scheduled job not started because USE_HEARTS_CONTRACTING flag is set to false.");
			summaryMessage.append("Scheduled job not started because USE_HEARTS_CONTRACTING flag is set to false.");
			return new SchedulerJobExecutionSummary(SchedulerJobExecutionStatus.FAILED, summaryMessage.toString());
		}
		
		// use trace method to log various execution points and state
		long start = System.currentTimeMillis();
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());		
		summaryMessage.append("Start job at " +  calendar.getTime());
		summaryMessage.append("\n");

		AttendanceReqContractSettingsVo job = getJobDetails();
		if (job == null)
		{
			throw new JobExecutionException("Job configuration missing");
		}
		
		DateTime fromDate = job.getFromDate();
		DateTime toDate = job.getToDate();
		
		List listAttendances = getAllAttendances(fromDate,toDate);
		
		if (listAttendances!=null && listAttendances.size()>0)
		{
			for (int i=0;i<listAttendances.size();i++)
			{
				save((EmergencyAttendance)listAttendances.get(i));
				reqAllocations++;
			}
		}
			
		try 
		{		
			getDomainFactory().commitTransaction();
		} 
		catch (StaleObjectException e) 
		{
			trace("Attendance Requiring Contracting  save failed! " + e.getMessage());
			failed++;
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
		summaryMessage.append("Total records failed : " + failed);
		summaryMessage.append("\n");
		summaryMessage.append("Total records processed : " + reqAllocations);
		summaryMessage.append("\n");				
		
		trace("Scheduled job ended");
		summaryMessage.append("Scheduled job completed successfully.");

		// Return the execution summary
		// This should include a summary text along with the job execution status
		return new SchedulerJobExecutionSummary(SchedulerJobExecutionStatus.SUCCEEDED, summaryMessage.toString());
	}

	private void save(EmergencyAttendance emergencyAttendance)
	{
		if (emergencyAttendance == null )
		{
			return;
		}

		DomainFactoryBridge factory = getDomainFactory();
	
		AttendanceRequiringContracting doAttendanceRequiringContracting=new AttendanceRequiringContracting();
		doAttendanceRequiringContracting.setPatient(emergencyAttendance.getPatient());
		doAttendanceRequiringContracting.setAttendance(emergencyAttendance);
		
		try 
		{
			factory.save(doAttendanceRequiringContracting);

			if (reqAllocations % 100 == 0)
				factory.commitTransaction();
			
		} 
		catch (StaleObjectException e) 
		{
			trace("Attendance Requiring Contracting  save failed! " + e.getMessage());
			return;
		}
		
	}

	private List getAllAttendances(DateTime fromDate, DateTime toDate)
	{
		DomainFactoryBridge factory = getDomainFactory();
		
		//WDEV-19360 - get attendances where the id is not in all attendancerequiringcontracting where the status is not INACTIVE
		String hsql = "select ea from EmergencyAttendance as ea where (ea.id not in (select arc.attendance.id  from AttendanceRequiringContracting as arc where status is null or status != -2553)) and  ea.arrivalDateTime >= :fromDate and ea.arrivalDateTime <= :toDate ";
		List allAttendances=factory.find(hsql, new String[] {"fromDate","toDate"}, new Object[] {fromDate.getJavaDate(),toDate.getJavaDate()});
		//List allAttendances = factory.find(hsql);
		return allAttendances;
	}

	@Override
	public void cleanUpSettings(IConfiguredScheduledJob job) throws Exception
	{
		// Clean up existing job configuration settings here
		// This method will be called when the configured job is being deleted
		AttendanceReqContractSettings doAttendanceReqContractSettings = AttendanceReqContractSettings.getAttendanceReqContractSettingsFromConfiguredJob(getDomainFactory(), super.getConfiguredJob().getConfiguredScheduledJobID());
		
		if(doAttendanceReqContractSettings != null)
		{
			getDomainFactory().delete(doAttendanceReqContractSettings);
		}
	}

	private AttendanceReqContractSettingsVo getJobDetails() 
	{
		AttendanceReqContractSettings doAttendanceReqContractSettings = AttendanceReqContractSettings.getAttendanceReqContractSettingsFromConfiguredJob(getDomainFactory(), super.getConfiguredJob().getConfiguredScheduledJobID());
		return AttendanceReqContractSettingsVoAssembler.create(doAttendanceReqContractSettings);
	}
}
