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
import ims.core.clinical.domain.objects.PatientCaseNoteRequest;
import ims.core.configuration.domain.objects.TCIRequestsBatch;
import ims.core.vo.CaseNoteRequestJobVo;
import ims.core.vo.CaseNoteRequestJobVoCollection;
import ims.core.vo.TCIRequestsBatchSettingsVo;
import ims.core.vo.domain.CaseNoteRequestJobVoAssembler;
import ims.core.vo.domain.TCIRequestsBatchSettingsVoAssembler;
import ims.core.vo.lookups.CaseNoteRequestStatus;
import ims.core.vo.lookups.LocationType;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.interfaces.IConfiguredScheduledJob;
import ims.framework.utils.DateTime;
import ims.framework.utils.Time;
import ims.scheduler.DomainFactoryBridge;
import ims.scheduler.SchedulerJobExecutionStatus;
import ims.scheduler.SchedulerJobExecutionSummary;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.quartz.JobExecutionException;

import com.ims.query.builder.client.QueryBuilderClient;
import com.ims.query.builder.client.SeedValue;
import com.ims.query.builder.client.exceptions.QueryBuilderClientException;


public final class TCICaseNoteRequestsJobImpl extends ims.scheduler.SchedulerJob
{
	private static final Integer TCI_CASENOTE_REQUESTS_LIST_REPORT_IMSID = new Integer(356); 
	
	private static String 	 urlQueryServer;
	private static String 	 urlReportServer;
		
	private String 			 printer = null;
	
	private int				 TotalRecordsNo = 0;
	private int				 SuccessfullUpdatedRecordsNo = 0;
	
	@Override
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
		trace("Scheduled job started");
		
		TCIRequestsBatchSettingsVo job = getJobDetails();
		
		if (job == null)
		{
			throw new JobExecutionException("Job configuration missing.");
		}
		
		if (job.getPrintRequestsForTCIsInNdays() == null)
		{
			throw new JobExecutionException("Cannot retrieve requests. Number of days that TCIs are due in was not set in configuration.");
		}
		printer = job.getPrintAgentTo();
		
		CaseNoteRequestJobVoCollection tciRequests = getRequests(job.getPrintRequestsForTCIsInNdays());
		
		try
		{
			saveRequest(tciRequests);
		}
		catch(Exception e)
		{
			trace("Updating of requests has failed: " + e.getMessage());
			
			summaryMessage.append("Scheduled job failed!");
			summaryMessage.append("\n");
			summaryMessage.append("Total requests found: " + TotalRecordsNo);
			return new SchedulerJobExecutionSummary(SchedulerJobExecutionStatus.FAILED, e.getMessage());	
		}
		
		saveJob(job);

		long end = System.currentTimeMillis();				
		
		calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());				
		summaryMessage.append("End job at: " +  calendar.getTime());
		summaryMessage.append("\n");
		
		int d = (int) (((end - start) / 1000) / 86400);
		int h = (int) (((end - start) / 1000) / 3600);
		int m = (int) ((((end - start) / 1000) / 60) % 60);
		int s = (int) (((end - start) / 1000) % 60);
		
		summaryMessage.append("Total time for execution: " + d + " days, " + h + " hours, " + m + " minutes, " + s + " seconds");
		summaryMessage.append("\n");
		summaryMessage.append("Total requests found: " + TotalRecordsNo);
		summaryMessage.append("\n");
		summaryMessage.append("Total requests updated successfully: " + SuccessfullUpdatedRecordsNo);
		summaryMessage.append("\n");	
		summaryMessage.append("Total request failed to process: " + (TotalRecordsNo - SuccessfullUpdatedRecordsNo));
		summaryMessage.append("\n");	
		summaryMessage.append("Scheduled job completed successfully.");
		
		trace("Scheduled job ended");
		
		// Return the execution summary
		// This should include a summary text along with the job execution status
		return new SchedulerJobExecutionSummary(SchedulerJobExecutionStatus.SUCCEEDED, summaryMessage.toString());
	}
	
	@Override
	public void cleanUpSettings(IConfiguredScheduledJob job) throws Exception
	{
		// Clean up existing job configuration settings here
		// This method will be called when the configured job is being deleted
		
		TCIRequestsBatch jobDO = TCIRequestsBatch.getTCIRequestsBatchFromConfiguredJobDetails(getDomainFactory(), super.getConfiguredJob().getConfiguredScheduledJobID());
		if (jobDO != null)
		{
			try
			{
				getDomainFactory().delete(jobDO);
			}
			catch (Exception ex)
			{
				throw new Exception("Failed to delete scheduled job.");
			}
		}
	}
	private synchronized void saveRequest(CaseNoteRequestJobVoCollection requestsColl) throws Exception 
	{
		if(requestsColl == null)
			return;

		urlQueryServer 		= ConfigFlag.GEN.QUERY_SERVER_URL.getValue();
		urlReportServer 	= ConfigFlag.GEN.REPORT_SERVER_URL.getValue();
		
		if (urlQueryServer == "")
		{			
			throw new JobExecutionException("QUERY_SERVER_URL flag need to be set");
		}
		if (urlReportServer == "")
		{			
			throw new JobExecutionException("REPORT_SERVER_URL flag need to be set");
		}

		Object[] obj = getSystemReportAndTemplate(TCI_CASENOTE_REQUESTS_LIST_REPORT_IMSID);

		if(obj == null || obj.length < 2) 
		{		
			throw new JobExecutionException("Cannot find TCI CaseNote Requests report. ");
		}

		if(obj[0] == null || obj[1] == null) 
		{		
			throw new JobExecutionException("Invalid report or template found for TCI CaseNote Requests report.");
		}

		TotalRecordsNo = 0;
		SuccessfullUpdatedRecordsNo = 0;
		boolean canPrint = false;

		QueryBuilderClient client = new QueryBuilderClient(urlQueryServer, null);
		DomainFactoryBridge factory = getDomainFactory();

		for (CaseNoteRequestJobVo caseNoteRequest : requestsColl)
		{
			TotalRecordsNo++;

			if (caseNoteRequest != null)
				canPrint = processRequestAndIncludeInPrintList(caseNoteRequest, obj[0], obj[1], client, factory);
		}

		if (canPrint)
		{	
			byte[] buffer = null;
			try 	
			{							
				trace("Report server URL: " + urlReportServer);
				trace("Trying to build report...");
				long start = System.currentTimeMillis();
				buffer = client.buildReport((String)obj[0], (String)obj[1], urlReportServer, "PDF", "", 0);
				long end = System.currentTimeMillis();
				trace("Report built successful in: " + (end - start) + " ms" );
				if (buffer != null && buffer.length == 0) 
				{
					trace("Generated report size is zero.");
					return;
				}
				printReport(client,buffer);
			}
			catch (QueryBuilderClientException err) 
			{	
				trace("Building report failed! " + err.getMessage());
				trace("Rollback started... ");
				rollback(requestsColl);
				trace("Rollback finished... ");

				throw new JobExecutionException(err);
			}

			catch (Exception e) 
			{
				trace("Printing report failed!" + e.getMessage());
				trace("Rollback started... ");
				rollback(requestsColl);
				trace("Rollback finished... ");
				throw new JobExecutionException(e);
			}
		}

	}

	private void printReport(QueryBuilderClient client, byte[] buffer) throws Exception
	{
		long start = System.currentTimeMillis();
		client.printReport(buffer, urlReportServer, printer, 1);
		long end = System.currentTimeMillis();
		trace("Print report successful in:" + (end - start) + " ms" );

	}

	private boolean processRequestAndIncludeInPrintList(CaseNoteRequestJobVo caseNoteRequest, Object report, Object template, QueryBuilderClient client, DomainFactoryBridge factory) throws Exception
	{
		if(caseNoteRequest == null)
			return false;

		try
		{		
			caseNoteRequest = updateAndSaveRequest(caseNoteRequest, factory);
			SuccessfullUpdatedRecordsNo++;

			if(caseNoteRequest == null)
				return false;

			if (factory != null)
			{
				factory.commitTransaction();
			}
			else
			{
				trace("DomainFactory retuned null");
				return false;
			}
		}

		catch(StaleObjectException e)
		{
			trace("Save failed! " + e.getMessage());
			factory.rollbackTransaction();
			return false;
		}

		client.addSeed(new SeedValue("CASENOTEREQUEST_ID",  caseNoteRequest.getID_PatientCaseNoteRequest(), Integer.class));
		return true;

	}

	private CaseNoteRequestJobVo updateAndSaveRequest(CaseNoteRequestJobVo caseNoteRequest, DomainFactoryBridge factory) throws StaleObjectException
	{
		if (caseNoteRequest == null)
			return null;
		caseNoteRequest.setPrintedPullListDate(new DateTime());

		String[] errors = caseNoteRequest.validate();

		if (errors != null && errors.length > 0)
		{
			trace("CaseNoteRequestJobVo object has validation errors.");
			return null;
		}

		return saveRequest(caseNoteRequest, factory);
	}

	private CaseNoteRequestJobVo saveRequest(CaseNoteRequestJobVo caseNoteRequest, DomainFactoryBridge domainFactory) throws StaleObjectException
	{
		if (caseNoteRequest == null)
		{
			trace("Cannot save a null CaseNoteRequestJobVo.");
			return null;
		}

		if (!caseNoteRequest.isValidated())
		{
			trace("CaseNoteRequestJobVo was not validated.");
			return null;
		}

		if (domainFactory == null)
		{
			trace("DomainFactory returned null.");
			return null;
		}
		PatientCaseNoteRequest requestDO = CaseNoteRequestJobVoAssembler.extractPatientCaseNoteRequest(domainFactory, caseNoteRequest);	
		domainFactory.save(requestDO);

		return CaseNoteRequestJobVoAssembler.create(requestDO);
	}

	private String[] getSystemReportAndTemplate(Integer imsId)
	{
		String[] result = null;		
		DomainFactoryBridge factory = getDomainFactory();

		List<?> lst = factory.find("select r1_1.reportXml, t1_1.templateXml, r1_1.reportName, r1_1.reportDescription, t1_1.name, t1_1.description from ReportBo as r1_1 left join r1_1.templates as t1_1 where (r1_1.imsId= :imsid) order by t1_1.name", new String[] {"imsid"}, new Object[] {imsId});

		if(lst.iterator().hasNext())
		{
			Object[] obj = (Object[])lst.iterator().next();			
			result = new String[] {(String)obj[0], (String)obj[1], (String)obj[2], (String)obj[3], (String)obj[4], (String)obj[5]};
		}

		return result;
	}
	private TCIRequestsBatchSettingsVo getJobDetails() 
	{
		TCIRequestsBatch tciBatchDO = TCIRequestsBatch.getTCIRequestsBatchFromConfiguredJobDetails(getDomainFactory(), super.getConfiguredJob().getConfiguredScheduledJobID());
		return TCIRequestsBatchSettingsVoAssembler.create(tciBatchDO);
	}

	private synchronized void saveJob(TCIRequestsBatchSettingsVo job)
	{
		if(job == null)
			return;

		job.setProcessedRequestsNo(job.getProcessedRequestsNo() != null ? job.getProcessedRequestsNo() + TotalRecordsNo : TotalRecordsNo);
		job.setSuccessfulRequestsUpdatedNo(job.getSuccessfulRequestsUpdatedNo() != null ? job.getSuccessfulRequestsUpdatedNo() + SuccessfullUpdatedRecordsNo : SuccessfullUpdatedRecordsNo);


		DomainFactoryBridge factory = getDomainFactory();
		TCIRequestsBatch jobDO = TCIRequestsBatchSettingsVoAssembler.extractTCIRequestsBatch(factory, job);
		try 
		{
			factory.save(jobDO);
		} 
		catch (StaleObjectException e) 
		{
			trace("Job details save failed! " + e.getMessage());
			return;
		}
	}
	private CaseNoteRequestJobVoCollection getRequests(Integer noOfDays)
	{
		if (noOfDays == null)
			return null;
		ims.framework.utils.Date dueDate = new ims.framework.utils.Date().addDay(noOfDays);
		
		Date dateFrom = new DateTime(dueDate, new Time(0,0,0)).getJavaDate();
		Date dateTo = new DateTime(dueDate, new Time(23,59,59)).getJavaDate();
		
		String hql = "select cnrequest FROM PatientCaseNoteRequest AS cnrequest LEFT JOIN cnrequest.caseNote AS cnote LEFT JOIN cnote.currentLocation cnloc LEFT JOIN cnloc.type AS cnloctype LEFT JOIN cnrequest.tCIDetail AS tciLinked LEFT JOIN cnrequest.requestStatus AS reqstatus WHERE cnrequest.printedPullListDate IS NULL AND cnrequest.tCIDetail IS NOT NULL AND (cnrequest.requiredByDate >= :DATE_FROM AND cnrequest.requiredByDate <= :DATE_TO) AND cnloctype.id = :MEDICAL_RECORDSID AND reqstatus.id = :OPEN_REQID ORDER BY cnrequest.requestedForLocation.upperName asc, cnote.trackingID asc";

		List<?> requestList = getDomainFactory().find(hql, new String[]{"DATE_FROM", "DATE_TO", "MEDICAL_RECORDSID", "OPEN_REQID"}, new Object[]{dateFrom, dateTo, LocationType.MEDICAL_RECORDS.getID(), CaseNoteRequestStatus.OPEN.getID()}); 

		if (requestList == null || requestList.isEmpty())
			return null;

		return CaseNoteRequestJobVoAssembler.createCaseNoteRequestJobVoCollectionFromPatientCaseNoteRequest(requestList);
	}
	private void rollback(CaseNoteRequestJobVoCollection requests) throws StaleObjectException
	{
		if(requests == null)
			return;

		DomainFactoryBridge factory = getDomainFactory();

		for(CaseNoteRequestJobVo request : requests)
		{
			if(request == null || request.getID_PatientCaseNoteRequest() == null)
				continue;

			PatientCaseNoteRequest doReq = (PatientCaseNoteRequest) factory.getDomainObject(PatientCaseNoteRequest.class, request.getID_PatientCaseNoteRequest());

			if(doReq != null)
			{
				doReq.setPrintedPullListDate(null);
				factory.save(doReq);	
			}
		}

		factory.commitTransaction();
	}

}
