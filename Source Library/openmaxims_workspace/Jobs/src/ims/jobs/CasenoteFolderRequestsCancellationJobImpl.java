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

import ims.admin.vo.CaseNoteFolderRequestsCancellationSettingsVo;
import ims.admin.vo.CaseNoteTrackingConfigVo;
import ims.admin.vo.domain.CaseNoteFolderRequestsCancellationSettingsVoAssembler;
import ims.admin.vo.domain.CaseNoteTrackingConfigVoAssembler;
import ims.core.clinical.domain.objects.PatientCaseNoteRequest;
import ims.core.configuration.domain.objects.CancelRequestsSchedule;
import ims.core.configuration.domain.objects.CaseNoteTrackingConfig;
import ims.core.vo.PatientCaseNoteRequestLiteVo;
import ims.core.vo.PatientCaseNoteRequestLiteVoCollection;
import ims.core.vo.domain.PatientCaseNoteRequestLiteVoAssembler;
import ims.core.vo.lookups.CaseNoteRequestCancellationReason;
import ims.core.vo.lookups.CaseNoteRequestStatus;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.interfaces.IConfiguredScheduledJob;
import ims.framework.utils.DateTime;
import ims.scheduler.DomainFactoryBridge;
import ims.scheduler.SchedulerJobExecutionStatus;
import ims.scheduler.SchedulerJobExecutionSummary;

import java.util.Calendar;
import java.util.List;

import org.quartz.JobExecutionException;

public final class CasenoteFolderRequestsCancellationJobImpl extends ims.scheduler.SchedulerJob
{
	private int				 TotalRequests = 0;
	private int				 SuccessfullyProcessed = 0;
	private int				 FailedToProcess = 0;
	
	public SchedulerJobExecutionSummary doExecute() throws JobExecutionException
	{
		StringBuilder summaryMessage = new StringBuilder();

		// use trace method to log various execution points and state
		trace("Scheduled job started");

		long start = System.currentTimeMillis();
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());		
		summaryMessage.append("Started job at: " +  calendar.getTime());
		summaryMessage.append("\n");

		CaseNoteFolderRequestsCancellationSettingsVo job = getJobDetails();
		if (job == null)
		{
			throw new JobExecutionException("Job configuration missing");
		}
		
		CaseNoteTrackingConfigVo confVo = getCaseNotesTrackingConfiguration();
		
		if (confVo == null || confVo.getRequestsOlderThan() == null)
		{
			trace("Scheduled job not started because Case Note Folder Tracking configuration is missing or invalid.");
			summaryMessage.append("Scheduled job not started because Case Note Folder Tracking configuration is missing or invalid.");
			return new SchedulerJobExecutionSummary(SchedulerJobExecutionStatus.FAILED, summaryMessage.toString());
		}
		PatientCaseNoteRequestLiteVoCollection requestsColl = getCaseNoteRequests(confVo);
		
		if (requestsColl !=null)
		{
			TotalRequests = requestsColl.size();

			for (PatientCaseNoteRequestLiteVo request : requestsColl)
			{
				if (request != null)
				{	
					if (save(request))
						SuccessfullyProcessed++;
				}
			}
		}
		
		try 
		{		
			getDomainFactory().commitTransaction();
		} 
		catch (StaleObjectException e) 
		{
			trace("Case Note Request cancellation failed! " + e.getMessage());
			FailedToProcess++;
		}
		
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
		summaryMessage.append("\n");
		summaryMessage.append("Total number of records found: " + TotalRequests);
		summaryMessage.append("\n");
		summaryMessage.append("Total records failed: " + FailedToProcess);
		summaryMessage.append("\n");
		summaryMessage.append("Total records processed successfully: " + SuccessfullyProcessed);
		summaryMessage.append("\n");				
		trace("Scheduled job ended");
		summaryMessage.append("Scheduled job completed successfully.");
		
		// Return the execution summary
		// This should include a summary text along with the job execution status
		return new SchedulerJobExecutionSummary(SchedulerJobExecutionStatus.SUCCEEDED, summaryMessage.toString());
	}

	public void cleanUpSettings(IConfiguredScheduledJob job) throws Exception
	{
		// Clean up existing job configuration settings here
		// This method will be called when the configured job is being deleted
		
		CancelRequestsSchedule cancelRequestsSettingsDO = CancelRequestsSchedule.getCancelRequestsScheduleFromConfiguredJobDetails(getDomainFactory(), super.getConfiguredJob().getConfiguredScheduledJobID());
		
		if (cancelRequestsSettingsDO != null)
		{
			getDomainFactory().delete(cancelRequestsSettingsDO);
		}
	}
	
	//private methods---------------------
	
	private CaseNoteFolderRequestsCancellationSettingsVo getJobDetails()
	{
		CancelRequestsSchedule cancelRequestsSettingsDO = CancelRequestsSchedule.getCancelRequestsScheduleFromConfiguredJobDetails(getDomainFactory(), super.getConfiguredJob().getConfiguredScheduledJobID());
		
		return CaseNoteFolderRequestsCancellationSettingsVoAssembler.create(cancelRequestsSettingsDO);
	}
	
	private CaseNoteTrackingConfigVo getCaseNotesTrackingConfiguration()
	{
		List<?> results = getDomainFactory().find("from CaseNoteTrackingConfig as cnconf");
		
		if (results == null || results.isEmpty())
			return null;
		return CaseNoteTrackingConfigVoAssembler.create((CaseNoteTrackingConfig) results.get(0));
	}
	
	private PatientCaseNoteRequestLiteVoCollection getCaseNoteRequests(CaseNoteTrackingConfigVo casenoteConfig)
	{
		if (casenoteConfig == null)
			return null;
		
		Integer daysInterval = casenoteConfig.getRequestsOlderThan();
		java.util.Date searchDate = new ims.framework.utils.DateTime().addHours(-daysInterval*24).getJavaDate(); //WDEV-19644
		
		String hql = "select req from PatientCaseNoteRequest as req where req.requestStatus.id = :OPEN_REQID and req.requiredByDate  <= :VALIDREQ_DATE"; //WDEV-19644
		
		List<?> requestList = getDomainFactory().find(hql, new String[]{"OPEN_REQID", "VALIDREQ_DATE"}, new Object[] {CaseNoteRequestStatus.OPEN.getID(), searchDate}); //WDEV-19644
		
		if (requestList == null || requestList.isEmpty())
			return null;
		
		return PatientCaseNoteRequestLiteVoAssembler.createPatientCaseNoteRequestLiteVoCollectionFromPatientCaseNoteRequest(requestList);
	}
	
	private boolean save(PatientCaseNoteRequestLiteVo request)
	{
		if (request == null)
		{
			return false;
		}

		DomainFactoryBridge factory = getDomainFactory();

		request = updateRequestCancellationDetails(request);

		PatientCaseNoteRequest requestDO = PatientCaseNoteRequestLiteVoAssembler.extractPatientCaseNoteRequest(factory, request);

		try 
		{
			factory.save(requestDO);
			
			trace ("Case Note Request Cancellation Succeeded");

			ims.core.clinical.domain.objects.PatientCaseNote doCaseNote = getCaseNoteForRequestID(factory, request);

			if(doCaseNote != null && doCaseNote.getOpenRequests() != null)
			{
				doCaseNote.getOpenRequests().remove(requestDO);

				trace("Attempt to update Patient Case Note Folder record: removing cancelled request from open requests for the Case Note Folder. ");

				try 
				{
					factory.save(doCaseNote);
				}
				catch (StaleObjectException ex) 
				{
					trace("Patient Case Note update failed.Starting second attempt." );
					factory.save(doCaseNote);
					//trace("Patient Case Note update failed. Abort." + ex.getMessage());
					throw ex;
				}
				
				trace("Patient Case Note record update suceeded.");
			}
			if (SuccessfullyProcessed % 100 == 0)
				factory.commitTransaction();

		} 
		catch (StaleObjectException e) 
		{
			trace("CaseNote Request Cancellation failed for request with ID = " + String.valueOf(requestDO.getId()) + "\n" + e.getMessage());
			return false;
		}

		return true;
	}

	private ims.core.clinical.domain.objects.PatientCaseNote getCaseNoteForRequestID(DomainFactoryBridge factory, PatientCaseNoteRequestLiteVo requestVo)
	{
		String query = "select caseN from PatientCaseNoteRequest as req left join req.caseNote as caseN where req.id = :ReqId";
		List<?> listCaseNote = factory.find(query, new String[] {"ReqId"}, new Object[] {requestVo.getID_PatientCaseNoteRequest()});
		
		if(listCaseNote == null || listCaseNote.isEmpty())
			return null;
		
		return (ims.core.clinical.domain.objects.PatientCaseNote) listCaseNote.get(0);
			
	}	
	private PatientCaseNoteRequestLiteVo updateRequestCancellationDetails(PatientCaseNoteRequestLiteVo request)
	{
		request.setCancelledDate(new DateTime());
		request.setCancellationReason(CaseNoteRequestCancellationReason.REQ_PROCESSING_TIMEFRAME_EXCEEDED);
		request.setRequestStatus(CaseNoteRequestStatus.CANCELLED);
		
		request.validate();
		
		return request;			
	}
	
	private synchronized void saveJob(CaseNoteFolderRequestsCancellationSettingsVo job)
	{
		if(job == null)
			return;
		
		job.setProcessedRequestsNo(job.getProcessedRequestsNo() != null ? job.getProcessedRequestsNo() + TotalRequests : TotalRequests);
		job.setSuccessfulRequestsCancelledNo(job.getSuccessfulRequestsCancelledNo() != null ? job.getSuccessfulRequestsCancelledNo() + SuccessfullyProcessed : SuccessfullyProcessed);
			
		DomainFactoryBridge factory = getDomainFactory();
		CancelRequestsSchedule cancelRequestsSettingsJobDO  = CaseNoteFolderRequestsCancellationSettingsVoAssembler.extractCancelRequestsSchedule(factory, job);
		try 
		{
			factory.save(cancelRequestsSettingsJobDO);
		} 
		catch (StaleObjectException e) 
		{
			trace("Job details save has failed! " + e.getMessage());
			return;
		}
	}
	//------------------------------
}	
