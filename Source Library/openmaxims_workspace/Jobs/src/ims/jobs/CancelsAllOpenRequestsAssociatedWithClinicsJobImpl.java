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

import ims.core.clinical.domain.objects.PatientCaseNoteRequest;
import ims.core.configuration.domain.objects.CancelClinicRequestsBatch;
import ims.core.vo.CancelClinicRequestsBatchVo;
import ims.core.vo.PatientCaseNoteRequestLiteVo;
import ims.core.vo.PatientCaseNoteRequestLiteVoCollection;
import ims.core.vo.domain.CancelClinicRequestsBatchVoAssembler;
import ims.core.vo.domain.PatientCaseNoteRequestLiteVoAssembler;
import ims.core.vo.lookups.CaseNoteRequestCancellationReason;
import ims.core.vo.lookups.CaseNoteRequestStatus;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.interfaces.IConfiguredScheduledJob;
import ims.framework.utils.Date;
import ims.framework.utils.DateTime;
import ims.scheduler.DomainFactoryBridge;
import ims.scheduler.SchedulerJobExecutionStatus;
import ims.scheduler.SchedulerJobExecutionSummary;

import java.util.Calendar;
import java.util.List;

import org.quartz.JobExecutionException;

public final class CancelsAllOpenRequestsAssociatedWithClinicsJobImpl extends ims.scheduler.SchedulerJob
{
	private int	TotalRequestsNo = 0;
	private int	SuccessfulRequestsNo = 0;
	private int	FailedToProcessNo = 0;
	
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
		
		CancelClinicRequestsBatchVo job = getJobDetails();
		if(job == null)
		{
			throw new JobExecutionException("Job configuration missing");
		}
		
		PatientCaseNoteRequestLiteVoCollection requestsColl = getCaseNoteRequests();
		
		if(requestsColl !=null)
		{
			TotalRequestsNo = requestsColl.size();

			for(PatientCaseNoteRequestLiteVo request : requestsColl)
			{
				if(request != null)
				{	
					if(save(request))
					{
						SuccessfulRequestsNo++;
					}
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
			FailedToProcessNo++;
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
		summaryMessage.append("Total Processed Requests : " + TotalRequestsNo);
		summaryMessage.append("\n");
		summaryMessage.append("Successful Requests Updated : " + SuccessfulRequestsNo);
		summaryMessage.append("\n");	

		summaryMessage.append("Scheduled job completed successfully.");
		
		trace("Scheduled job ended");
		
		return new SchedulerJobExecutionSummary(SchedulerJobExecutionStatus.SUCCEEDED, summaryMessage.toString());
	}
	
	private synchronized void saveJob(CancelClinicRequestsBatchVo job)
	{
		if(job == null)
			return;
		
		job.setProcessedRequestsNo(job.getProcessedRequestsNo() != null ? job.getProcessedRequestsNo() + TotalRequestsNo : TotalRequestsNo);
		job.setSuccessfulRequestsUpdatedNo(job.getSuccessfulRequestsUpdatedNo() != null ? job.getSuccessfulRequestsUpdatedNo() + SuccessfulRequestsNo : SuccessfulRequestsNo);
			
		DomainFactoryBridge factory = getDomainFactory();
		CancelClinicRequestsBatch cancelClinicRequestsBatchDO  = CancelClinicRequestsBatchVoAssembler.extractCancelClinicRequestsBatch(factory, job);
		try 
		{
			factory.save(cancelClinicRequestsBatchDO);
		} 
		catch (StaleObjectException e) 
		{
			trace("Job details save has failed! " + e.getMessage());
			return;
		}
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
			
			trace("Case Note Request Cancellation Succeeded");

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
					throw ex;
				}
				
				trace("Patient Case Note record update suceeded.");
			}
			
			if (SuccessfulRequestsNo % 100 == 0)
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
	
	private PatientCaseNoteRequestLiteVoCollection getCaseNoteRequests()
	{
		String hql = "select req from PatientCaseNoteRequest as req where req.appointment is not null and req.requestStatus.id = :OPEN_REQID and req.requiredByDate >= :START_DATE and req.requiredByDate  < :END_DATE";
		
		Date currentDate = new Date();
		Date previousDate = (new Date()).addDay(-1);
		
		List<?> requestList = getDomainFactory().find(hql, new String[]{"OPEN_REQID", "START_DATE", "END_DATE"}, new Object[] {CaseNoteRequestStatus.OPEN.getID(), previousDate.getDate(), currentDate.getDate()});
		
		if (requestList == null || requestList.isEmpty())
			return null;
		
		return PatientCaseNoteRequestLiteVoAssembler.createPatientCaseNoteRequestLiteVoCollectionFromPatientCaseNoteRequest(requestList);
	}

	private CancelClinicRequestsBatchVo getJobDetails()
	{
		CancelClinicRequestsBatch doJob = CancelClinicRequestsBatch.getCancelClinicRequestsBatchFromConfiguredJobDetails(getDomainFactory(), super.getConfiguredJob().getConfiguredScheduledJobID());
		return CancelClinicRequestsBatchVoAssembler.create(doJob);
	}

	@Override
	public void cleanUpSettings(IConfiguredScheduledJob job) throws Exception
	{
		CancelClinicRequestsBatch doJob = CancelClinicRequestsBatch.getCancelClinicRequestsBatchFromConfiguredJobDetails(getDomainFactory(), super.getConfiguredJob().getConfiguredScheduledJobID());
		
		if(doJob != null)
		{
			getDomainFactory().delete(doJob);
		}
	}
}
