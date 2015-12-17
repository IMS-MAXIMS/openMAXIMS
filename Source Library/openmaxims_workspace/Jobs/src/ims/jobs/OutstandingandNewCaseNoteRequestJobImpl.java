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
import ims.core.configuration.domain.objects.NewRequestsBatch;
import ims.core.vo.CaseNoteRequestJobVo;
import ims.core.vo.CaseNoteRequestJobVoCollection;
import ims.core.vo.NewRequestsBatchVo;
import ims.core.vo.domain.CaseNoteRequestJobVoAssembler;
import ims.core.vo.domain.NewRequestsBatchVoAssembler;
import ims.core.vo.lookups.CaseNoteRequestStatus;
import ims.core.vo.lookups.LocationType;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.interfaces.IConfiguredScheduledJob;
import ims.framework.utils.Date;
import ims.framework.utils.DateTime;
import ims.framework.utils.Time;
import ims.scheduler.DomainFactoryBridge;
import ims.scheduler.SchedulerJobExecutionStatus;
import ims.scheduler.SchedulerJobExecutionSummary;

import java.util.Calendar;
import java.util.List;

import org.quartz.JobExecutionException;

import com.ims.query.builder.client.QueryBuilderClient;
import com.ims.query.builder.client.SeedValue;
import com.ims.query.builder.client.exceptions.QueryBuilderClientException;

public final class OutstandingandNewCaseNoteRequestJobImpl extends ims.scheduler.SchedulerJob
{
	private static Integer	 OUTPATIENT_CASE_NOTE_REQUESTS_LIST_REPORT_ID = 355;
	private static Integer	 TCI_CASE_NOTE_REQUESTS_LIST_REPORT_ID = 356;
	private static Integer	 OUTSTANDING_AND_NEW_CASE_NOTE_REQUESTS_LIST_REPORT_ID = 357;
	
	private static String 	 urlQueryServer;
	private static String 	 urlReportServer;
	
	private Integer			 NDays = 0;
	private String 			 printer = null;
	
	private int				 TotalRequestsNo = 0;
	private int				 SuccessfulRequestsNo = 0;
	
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
		
		NewRequestsBatchVo job = getJobDetails();
		if (job == null)
		{
			throw new JobExecutionException("Job configuration missing");
		}
		
		printer = job.getPrintAgentTo();
		NDays = job.getPrintRequestsForOutstandingAndNewRequestsInNdays();
		
		if(NDays == null)
			throw new JobExecutionException("Print Requests for Outstanding and New Requests in N days is not set.");
		
		if (urlQueryServer == "")
		{			
			throw new JobExecutionException("QUERY_SERVER_URL flag need to be set");
		}
		if (urlReportServer == "")
		{			
			throw new JobExecutionException("REPORT_SERVER_URL flag need to be set");
		}
		
		TotalRequestsNo = 0;
		SuccessfulRequestsNo = 0;
		
		CaseNoteRequestJobVoCollection outpatientRequests = getRequests(true, false);
		
		try
		{
			saveRequestsAndPrint(outpatientRequests, OUTPATIENT_CASE_NOTE_REQUESTS_LIST_REPORT_ID, "PatientCaseNoteRequest_id");
		}
		catch(Exception e)
		{
			trace("Scheduled job failed: " + e.getMessage());
			
			summaryMessage.append("Scheduled job failed!");
			summaryMessage.append("\n");
			summaryMessage.append("Total Processed Requests : " + TotalRequestsNo);
			return new SchedulerJobExecutionSummary(SchedulerJobExecutionStatus.FAILED, e.getMessage());	
		}
		
		CaseNoteRequestJobVoCollection tciRequests = getRequests(false, true);
		
		try
		{
			saveRequestsAndPrint(tciRequests, TCI_CASE_NOTE_REQUESTS_LIST_REPORT_ID, "CASENOTEREQUEST_ID");
		}
		catch(Exception e)
		{
			trace("Scheduled job failed: " + e.getMessage());
			
			summaryMessage.append("Scheduled job failed!");
			summaryMessage.append("\n");
			summaryMessage.append("Total Processed Requests : " + TotalRequestsNo);
			return new SchedulerJobExecutionSummary(SchedulerJobExecutionStatus.FAILED, e.getMessage());	
		}
		
		CaseNoteRequestJobVoCollection otherRequests = getRequests(false, false);
		
		try
		{
			saveRequestsAndPrint(otherRequests, OUTSTANDING_AND_NEW_CASE_NOTE_REQUESTS_LIST_REPORT_ID, "PatientCaseNoteRequest_id");
		}
		catch(Exception e)
		{
			trace("Scheduled job failed: " + e.getMessage());
			
			summaryMessage.append("Scheduled job failed!");
			summaryMessage.append("\n");
			summaryMessage.append("Total Processed Requests : " + TotalRequestsNo);
			return new SchedulerJobExecutionSummary(SchedulerJobExecutionStatus.FAILED, e.getMessage());	
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

	private synchronized void saveJob(NewRequestsBatchVo job)
	{
		if(job == null)
			return;
		
		job.setProcessedRequestsNo(job.getProcessedRequestsNo() != null ? job.getProcessedRequestsNo() + TotalRequestsNo : TotalRequestsNo);
		job.setSuccessfulRequestsUpdatedNo(job.getSuccessfulRequestsUpdatedNo() != null ? job.getSuccessfulRequestsUpdatedNo() + SuccessfulRequestsNo : SuccessfulRequestsNo);
		
		DomainFactoryBridge factory = getDomainFactory();
		NewRequestsBatch doJob = NewRequestsBatchVoAssembler.extractNewRequestsBatch(factory, job);
		
		try 
		{
			factory.save(doJob);
		} 
		catch (StaleObjectException e) 
		{
			trace("Job details save failed! " + e.getMessage());
			return;
		}
	}

	private synchronized void saveRequestsAndPrint(CaseNoteRequestJobVoCollection requests, Integer IMSID, String seedName) throws Exception
	{
		if(requests == null)
			return;
		
		urlQueryServer 		= ConfigFlag.GEN.QUERY_SERVER_URL.getValue();
		urlReportServer 	= ConfigFlag.GEN.REPORT_SERVER_URL.getValue();
		
		Object[] obj = getSystemReportAndTemplate(IMSID);
		
		if(obj == null || obj.length < 2) 
		{		
			throw new JobExecutionException("getSystemReportAndTemplate return null");
		}
		
		if(obj[0] == null || obj[1] == null) 
		{		
			throw new JobExecutionException("getSystemReportAndTemplate return null");
		}
		
		QueryBuilderClient client = new QueryBuilderClient(urlQueryServer, null);
		
		boolean canPrint = false;
		DomainFactoryBridge factory = getDomainFactory();
		
		for(CaseNoteRequestJobVo request : requests)
		{
			TotalRequestsNo++;
			
			if(request == null)
				continue;
			
			request = updateAndSave(request, factory);
			
			if(request == null)
				continue;
			
			SuccessfulRequestsNo++;
			canPrint = true;
				
			client.addSeed(new SeedValue(seedName, request.getID_PatientCaseNoteRequest(), Integer.class));
		}
		
		factory.commitTransaction();
		
		if(canPrint)
		{
    		try 	
    		{							
    			trace("Report server URL:" + urlReportServer);
    			trace("Trying to print report...");
    			long start = System.currentTimeMillis();
    			client.buildReport((String)obj[0], (String)obj[1], urlReportServer, "PDF", printer, 1);
    			long end = System.currentTimeMillis();
    			trace("Print report successful in :" + (end - start) + " ms" );
    		}
    		catch (QueryBuilderClientException err) 
    		{	
    			trace("Rollback started... ");
    			rollback(requests);
    			trace("Rollback finished... ");
    			trace("Print report failed! " + err.getMessage());
    			throw new JobExecutionException(err);
    		}
		}
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
	
	private CaseNoteRequestJobVo updateAndSave(CaseNoteRequestJobVo request, DomainFactoryBridge factory) throws StaleObjectException
	{
		if(request == null)
			return null;
		
		request.setPrintedPullListDate(new DateTime());
		
		String[] str = request.validate();		
		if (str != null && str.length > 0)
		{	
			trace("CaseNoteRequestJobVo has validation errors.");
			return null;
		}
		
		PatientCaseNoteRequest doReq = CaseNoteRequestJobVoAssembler.extractPatientCaseNoteRequest(factory, request);	
		factory.save(doReq);	
		return CaseNoteRequestJobVoAssembler.create(doReq);
	}

	private CaseNoteRequestJobVoCollection getRequests(boolean outpatient, boolean tci)
	{
		DomainFactoryBridge factory = getDomainFactory();
		
		Date tempDate = new Date();
		tempDate.addDay(NDays);
		
		DateTime fromDate = new DateTime(tempDate, new Time(0, 0));
		DateTime toDate = new DateTime(tempDate, new Time(23, 59));
		
		String query = "select req from PatientCaseNoteRequest as req left join req.caseNote as cn left join cn.currentLocation as rLoc left join rLoc.type as locType left join req.requestStatus as rStatus where locType.id = :Type and req.requiredByDate between :DateFrom and :DateTo and req.printedPullListDate is null and rStatus.id = :StatusId";
		
		if(Boolean.TRUE.equals(outpatient))
		{
			query += " and req.appointment is not null";
		}
		else if(Boolean.TRUE.equals(tci))
		{
			query += " and req.tCIDetail is not null";
		}
		
		List<?> results = factory.find(query, new String[] {"Type", "DateFrom", "DateTo", "StatusId"}, new Object[] {LocationType.MEDICAL_RECORDS.getID(), fromDate.getJavaDate(), toDate.getJavaDate(), CaseNoteRequestStatus.OPEN.getID()});
		
		return CaseNoteRequestJobVoAssembler.createCaseNoteRequestJobVoCollectionFromPatientCaseNoteRequest(results);
	}

	private NewRequestsBatchVo getJobDetails()
	{
		NewRequestsBatch doJob = NewRequestsBatch.getNewRequestsBatchFromConfiguredJobDetails(getDomainFactory(), super.getConfiguredJob().getConfiguredScheduledJobID());
		return NewRequestsBatchVoAssembler.create(doJob);
	}

	@Override
	public void cleanUpSettings(IConfiguredScheduledJob job) throws Exception
	{
		NewRequestsBatch doJob = NewRequestsBatch.getNewRequestsBatchFromConfiguredJobDetails(getDomainFactory(), super.getConfiguredJob().getConfiguredScheduledJobID());
		
		if(doJob != null)
		{
			getDomainFactory().delete(doJob);
		}
	}
}
