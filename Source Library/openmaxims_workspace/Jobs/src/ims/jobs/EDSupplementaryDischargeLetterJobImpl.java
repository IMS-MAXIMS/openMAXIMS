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

import ims.clinical.vo.lookups.DischargeLetterStatus;
import ims.configuration.gen.ConfigFlag;
import ims.core.configuration.domain.objects.EDSuppSummarySchedule;
import ims.core.documents.domain.objects.PatientDocument;
import ims.core.resource.people.domain.objects.MemberOfStaff;
import ims.core.resource.people.vo.HcpRefVo;
import ims.core.resource.people.vo.MemberOfStaffRefVo;
import ims.core.vo.CommChannelVo;
import ims.core.vo.GPLiteWithCommChannelsVo;
import ims.core.vo.MemberOfStaffVo;
import ims.core.vo.PatientDocumentVo;
import ims.core.vo.ServerDocumentVo;
import ims.core.vo.domain.MemberOfStaffVoAssembler;
import ims.core.vo.domain.PatientDocumentVoAssembler;
import ims.core.vo.lookups.ChannelType;
import ims.core.vo.lookups.DocumentCategory;
import ims.core.vo.lookups.DocumentCreationType;
import ims.core.vo.lookups.FileType;
import ims.core.vo.lookups.PreActiveActiveInactiveStatus;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.ForeignKeyViolationException;
import ims.domain.exceptions.StaleObjectException;
import ims.emergency.domain.objects.Tracking;
import ims.emergency.vo.EDSuppSummaryScheduleVo;
import ims.emergency.vo.PatientForEDDischargeVo;
import ims.emergency.vo.TrackingJobVo;
import ims.emergency.vo.TrackingJobVoCollection;
import ims.emergency.vo.domain.EDSuppSummaryScheduleVoAssembler;
import ims.emergency.vo.domain.TrackingJobVoAssembler;
import ims.framework.exceptions.CodingRuntimeException;
import ims.framework.interfaces.IConfiguredScheduledJob;
import ims.framework.utils.DateTime;
import ims.scheduler.DomainFactoryBridge;
import ims.scheduler.SchedulerJobExecutionStatus;
import ims.scheduler.SchedulerJobExecutionSummary;

import java.io.IOException;
import java.security.SecureRandom;
import java.security.Security;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.multipart.ByteArrayPartSource;
import org.apache.commons.httpclient.methods.multipart.FilePart;
import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;
import org.apache.commons.httpclient.methods.multipart.Part;
import org.apache.commons.httpclient.methods.multipart.StringPart;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.quartz.JobExecutionException;

import com.ims.query.builder.client.QueryBuilderClient;
import com.ims.query.builder.client.SeedValue;
import com.ims.query.builder.client.exceptions.QueryBuilderClientException;

public final class EDSupplementaryDischargeLetterJobImpl extends ims.scheduler.SchedulerJob
{
	
	private static final int 	TIMEOUT = 1000 * 60 * 15;
	private static final int 	MAX_BUFFER_LIMIT_NO_WARNING = 1024*1024;
	private static final String EMAIL_SUBJECT = " Patient Data - ";
	
	private static String 	 urlQueryServer;
	private static String 	 urlReportServer;
	private static String 	 urlPdfUploadServer;	
	private static String 	 pdfStorePath;
	private static String 	 SMTP_HOST_NAME;
	private static int 		 SMTP_PORT;
	private static String 	 SMTP_AUTH;
	private static String 	 emailFromAddress;
	private static Integer	 ED_SUPPLEMENTARY_DISCHARGE_SUMMARY_REPORT_ID = 360;
	private String 			 fileName;
	private String 			 filePath = "";
	private String 			 printer = null;
	
	private int				 GeneratedLettersNo = 0;
	private int				 SuccessfulEmailsNo = 0;
	private int				 FailedEmailsNo = 0;
	private int				 PrintedLettersNo = 0;
	
	@Override
	public SchedulerJobExecutionSummary doExecute() throws JobExecutionException
	{
		long start = System.currentTimeMillis();		
		StringBuilder summaryMessage = new StringBuilder();		
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());		
		summaryMessage.append("Job started at: " +  calendar.getTime());
		summaryMessage.append("\n");
		trace("Scheduled job has started");
		
		EDSuppSummaryScheduleVo job = getJobDetails();
		if (job == null)
		{
			throw new JobExecutionException("Job configuration is missing.");
		}
		
		printer = job.getPrintAgentTo();
		
		TrackingJobVoCollection dischargedTrackings = getDischargedTrackingsWithSuppNotes();
		MemberOfStaffRefVo mosRefVo = getMOSForConfiguredJob(job);
		try
		{
			savePatientDocuments(dischargedTrackings, job,mosRefVo);
		}
		catch(Exception e)
		{
			trace("Conversion error: " + e.getMessage());
			
			summaryMessage.append("Scheduled job failed!");
			summaryMessage.append("\n");
			summaryMessage.append("Total generated letters: " + GeneratedLettersNo); //WDEV-18840
			return new SchedulerJobExecutionSummary(SchedulerJobExecutionStatus.FAILED, e.getMessage());	
		}
		
		saveJob(job);

		long end = System.currentTimeMillis();				
		
		calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());				
		summaryMessage.append("Job ended at:  " +  calendar.getTime());
		summaryMessage.append("\n");
		
		int d = (int) (((end - start) / 1000) / 86400);
		int h = (int) (((end - start) / 1000) / 3600);
		int m = (int) ((((end - start) / 1000) / 60) % 60);
		int s = (int) (((end - start) / 1000) % 60);

		summaryMessage.append("Total time for execution: " + d + " days, " + h + " hours, " + m + " minutes, " + s + " seconds");
		summaryMessage.append("\n");
		summaryMessage.append("Total generated letters: " + GeneratedLettersNo);
		summaryMessage.append("\n");
		summaryMessage.append("Total printed letters: " + PrintedLettersNo);
		summaryMessage.append("\n");
		//WDEV-23034 
		if (Boolean.TRUE.equals(job.getPrintLettersOnly()))
		{
			summaryMessage.append("E-mail function of the job is currently disabled. No letters were e-mailed.");
			summaryMessage.append("\n");
		}
		else
		{	
			summaryMessage.append("Total successful e-mails: " + SuccessfulEmailsNo);
			summaryMessage.append("\n");		
			summaryMessage.append("Total failed e-mails: " + FailedEmailsNo);
			summaryMessage.append("\n");
		}

		summaryMessage.append("Scheduled job was completed successfully.");

		trace("Scheduled job has ended");
		
		return new SchedulerJobExecutionSummary(SchedulerJobExecutionStatus.SUCCEEDED, summaryMessage.toString());
	}

	@Override
	public void cleanUpSettings(IConfiguredScheduledJob job) throws Exception
	{
		EDSuppSummarySchedule doSuppJob = EDSuppSummarySchedule.getEDSuppSummaryScheduleFromConfiguredJobDetails(getDomainFactory(), super.getConfiguredJob().getConfiguredScheduledJobID());
		
		if(doSuppJob != null)
		{
			getDomainFactory().delete(doSuppJob);
		}
	}
	
	private synchronized void saveJob(EDSuppSummaryScheduleVo job)
	{
		if(job == null)
			return;

		job.setGeneratedLettersNo(job.getGeneratedLettersNo() != null ? job.getGeneratedLettersNo() + GeneratedLettersNo : GeneratedLettersNo);
		job.setPrintedLettersNo(job.getPrintedLettersNo() != null ? job.getPrintedLettersNo() + PrintedLettersNo : PrintedLettersNo);
		if (!Boolean.TRUE.equals(job.getPrintLettersOnly()))
		{	
			job.setSuccessfulEmailsNo(job.getSuccessfulEmailsNo() != null ? job.getSuccessfulEmailsNo() + SuccessfulEmailsNo : SuccessfulEmailsNo);
			job.setFailedEmailsNo(job.getFailedEmailsNo() != null ? job.getFailedEmailsNo() + FailedEmailsNo : FailedEmailsNo);
		}
		DomainFactoryBridge factory = getDomainFactory();
		EDSuppSummarySchedule doJob = EDSuppSummaryScheduleVoAssembler.extractEDSuppSummarySchedule(factory, job);
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

	private EDSuppSummaryScheduleVo getJobDetails() 
	{
		EDSuppSummarySchedule doEDDischargeSuppSummarySchedule = EDSuppSummarySchedule.getEDSuppSummaryScheduleFromConfiguredJobDetails(getDomainFactory(), super.getConfiguredJob().getConfiguredScheduledJobID());
		return EDSuppSummaryScheduleVoAssembler.create(doEDDischargeSuppSummarySchedule);
	}
	
	private MemberOfStaffVo getMOSForConfiguredJob(EDSuppSummaryScheduleVo job)
	{
		if ( job == null || job.getSystemInformation() == null	||  job.getSystemInformation().getCreationUser() == null || job.getSystemInformation().getCreationUser().length() == 0)
		{
			trace("Member of Staff for the configured job is null");
			return null;
		}
		
		String query = "select mos from MemberOfStaff as mos left join mos.appUser as usr where usr.username = :userName";
		DomainFactoryBridge factory = getDomainFactory();
		List<?> results = factory.find(query, new String[] {"userName"}, new Object[] {job.getSystemInformation().getCreationUser()});
		if (results != null && results.size() >0)
			return MemberOfStaffVoAssembler.create((MemberOfStaff)results.get(0));
		else
			return null;
	}

	private synchronized void savePatientDocuments(TrackingJobVoCollection dischargedTrackings, EDSuppSummaryScheduleVo job, MemberOfStaffRefVo mosRefVo) throws Exception 
	{
		if(dischargedTrackings == null || dischargedTrackings.size() == 0)
			return;
		
		urlQueryServer 		= ConfigFlag.GEN.QUERY_SERVER_URL.getValue();
		urlReportServer 	= ConfigFlag.GEN.REPORT_SERVER_URL.getValue();
		urlPdfUploadServer 	= ConfigFlag.GEN.PDF_UPLOAD_URL.getValue();
		pdfStorePath 		= ConfigFlag.GEN.PDF_STORE_PATH.getValue();
		
		if (urlQueryServer == "")
		{			
			throw new JobExecutionException("QUERY_SERVER_URL flag need to be set");
		}
		if (urlReportServer == "")
		{			
			throw new JobExecutionException("REPORT_SERVER_URL flag need to be set");
		}
		if (urlPdfUploadServer == "")
		{			
			throw new JobExecutionException("PDF_UPLOAD_URL flag need to be set");
		}
		if (pdfStorePath == "")
		{			
			throw new JobExecutionException("PDF_STORE_PATH flag need to be set");
		}
		
		Object[] obj = getSystemReportAndTemplate(ED_SUPPLEMENTARY_DISCHARGE_SUMMARY_REPORT_ID);
		
		if(obj == null || obj.length < 2) 
		{		
			throw new JobExecutionException("getSystemReportAndTemplate return null");
		}
		
		if(obj[0] == null || obj[1] == null) 
		{		
			throw new JobExecutionException("getSystemReportAndTemplate return null");
		}
		
		GeneratedLettersNo = 0;
		SuccessfulEmailsNo = 0;
		FailedEmailsNo = 0;
		PrintedLettersNo = 0;
		
		//WDEV-23034 
		boolean disableEmail = Boolean.TRUE.equals(job.getPrintLettersOnly());
		for(TrackingJobVo tracking : dischargedTrackings)
		{
			createPatientDocument(tracking, obj[0], obj[1], mosRefVo,disableEmail);
		}
	}

	private void createPatientDocument(TrackingJobVo tracking, Object report, Object template, MemberOfStaffRefVo mosRefVo, boolean disableEmail) throws Exception 
	{
		if(tracking == null)
			return;
		
		fileName = generateName() + ".pdf";	
		
		PatientDocumentVo document = null;
		
		try
		{
			document = saveDocument(tracking, mosRefVo);
			if(document == null)
				return;
			
			tracking = populateAndSaveTracking(tracking);
			if(tracking == null)
				return;
			
			if(getDomainFactory() != null)
			{
				getDomainFactory().commitTransaction();
			}
			else
			{
				trace("getDomainFactory is null");
				return;
			}
		}
		catch(StaleObjectException e)
		{
			trace("Save failed! " + e.getMessage());
			getDomainFactory().rollbackTransaction();
			return;
		}
		
		QueryBuilderClient client = new QueryBuilderClient(urlQueryServer, null);
		client.addSeed(new SeedValue("Tracking_id",  tracking.getID_Tracking(), Integer.class));
		
		byte[] buffer = null;
		try 	
		{							
			trace("Report server URL:" + urlReportServer);
			trace("Trying to build report...");
			long start = System.currentTimeMillis();
			buffer = client.buildReport((String)report, (String)template, urlReportServer, "PDF", "", 0);
			long end = System.currentTimeMillis();
			trace("Report built successfully in: " + (end - start) + " ms" );
			if (buffer == null || (buffer != null && buffer.length == 0)) 
			{
				trace("Generated report size is zero");
			}
		}
		catch (QueryBuilderClientException err) 
		{	
			rollback(document, tracking);
			trace("Build of report failed! " + err.getMessage());
			return;
		}
		
		try
		{
			long start = System.currentTimeMillis();
			trace("Trying to upload report...");
			uploadFile(buffer, fileName,  pdfStorePath);
			long end = System.currentTimeMillis();
			trace("File upload successful in: " + (end - start) + " ms" );							
		}
		catch(Exception e)
		{
			rollback(document, tracking);
			trace("Upload file failed! " + e.getMessage());
			return;
		}
		
		GeneratedLettersNo++;
		
		if (patientGpHasMail(tracking.getPatient()) && !disableEmail)
		{
			if (!sendMailToPatientGP(tracking.getPatient()))
			{
				rollback(document, tracking);
				GeneratedLettersNo--;
			}
		}
		else
		{
			if (!printEdDischargeSummaryReport(client, buffer))
			{
				rollback(document, tracking);
				GeneratedLettersNo--;
			}
		}
	}

	private void rollback(PatientDocumentVo document, TrackingJobVo tracking) throws StaleObjectException 
	{
		if (tracking != null)
		{
			tracking.setSupplementaryLetterStatus(DischargeLetterStatus.IN_PROGRESS);
			String[] str = tracking.validate();
			if (str != null && str.length > 0)
			{	
				trace("TrackingJobVo from rollback has validation errors.");
				return;
			}
			
			saveTracking(tracking);
		}
		
		if (document != null)
		{
			String[] str = document.validate();		
			if (str != null && str.length > 0)
			{	
				trace("PatientDocumentVo from rollback has validation errors.");
				return;
			}	
			try 
			{
				deletePatientDocument(document);
			} 
			catch (Exception e) 
			{
				throw new StaleObjectException(null);
			}
		}
		
		getDomainFactory().commitTransaction();
	}
	
	public void deletePatientDocument(PatientDocumentVo document) throws StaleObjectException, ForeignKeyViolationException
	{
		if(document == null) {
			throw new CodingRuntimeException("PatientDocumentVo is null");
		}
		if (!document.isValidated()) {
			throw new DomainRuntimeException("PatientDocumentVo not validated");
		}
		
		DomainFactoryBridge factory = getDomainFactory();
		PatientDocument doPatientDocument = PatientDocumentVoAssembler.extractPatientDocument(factory, document);	
		factory.delete(doPatientDocument);					
	}	

	private boolean printEdDischargeSummaryReport(QueryBuilderClient client, byte[] buffer) 
	{
		try 
		{
			long start = System.currentTimeMillis();
			client.printReport(buffer, urlReportServer, printer, 1);
			long end = System.currentTimeMillis();
			trace("Print report successful in :" + (end - start) + " ms" );
			PrintedLettersNo++;
		} 
		catch (QueryBuilderClientException e) 
		{
			trace("Print report failed!" + e.getMessage());
			return false;
		}	
		
		return true;
	}

	private boolean patientGpHasMail(PatientForEDDischargeVo patient) 
	{
		if(patient == null || patient.getGp() == null)
			return false;
		
		if(getGpMail(patient.getGp()) == null)
			return false;
		
		return true;
	}

	private PatientDocumentVo saveDocument(TrackingJobVo tracking, MemberOfStaffRefVo mosRefVo) throws StaleObjectException 
	{
		PatientDocumentVo document = populatePatientDocument(tracking, mosRefVo);
		
		String[] str = document.validate();		
		if (str != null && str.length > 0)
		{	
			trace("PatientDocumentVo has validation errors.");
			return null;
		}	
		
		document = savePatientDocument(document);
		return document;
	}
	
	private TrackingJobVo populateAndSaveTracking(TrackingJobVo tracking) throws StaleObjectException 
	{
		if(tracking == null)
			return null;
		
		tracking.setSupplementaryLetterStatus(DischargeLetterStatus.GENERATED);
		
		String[] str = tracking.validate();		
		if (str != null && str.length > 0)
		{	
			trace("TrackingJobVo has validation errors.");
			return null;
		}
		
		return saveTracking(tracking);
	}

	private TrackingJobVo saveTracking(TrackingJobVo tracking)	throws StaleObjectException
	{
		if(tracking == null)
		{
			trace("Cannot save a null TrackingJobVo.");
			return null;
		}
		
		if(!tracking.isValidated())
		{
			trace("TrackingJobVo is not validated.");
			return null;
		}
		
		DomainFactoryBridge factory = getDomainFactory();
		Tracking doTracking = TrackingJobVoAssembler.extractTracking(factory, tracking);	
		factory.save(doTracking);	
		return TrackingJobVoAssembler.create(doTracking);
	}

	private boolean sendMailToPatientGP(PatientForEDDischargeVo patient) throws JobExecutionException 
	{
		if(patient == null || patient.getGp() == null)
		{
			trace("Patient doesn't have a GP.");
			return false;
		}
		
		String gpEmail = getGpMail(patient.getGp());
		
		if(gpEmail == null)
		{
			trace("Patient's GP doesn't have a mail address.");
			return false;
		}
		
		String 	emailMsgTxt 	= "ED Supplementary Discharge Summary Report is attached";
		String 	emailSubjectTxt = getEmailSubject(patient);
		
		String slash = "";
		if(!(pdfStorePath.endsWith("/") || pdfStorePath.endsWith("\\")))
		{
			slash = "/";
		}
		
		trace("SubjectTxt 	  : " + emailSubjectTxt);
		trace("MsgTxt 		  : " + emailMsgTxt);
		trace("Attached file : " + pdfStorePath + slash + filePath);
		trace("FromAddress   : " + ConfigFlag.FW.SMTP_SENDER.getValue());
		
		try
		{
			long start = System.currentTimeMillis();									
			
			new SendMail().sendSSLMessage(gpEmail, emailSubjectTxt, emailMsgTxt, pdfStorePath + slash + filePath);									
			long end = System.currentTimeMillis();
			System.out.println("Email was sent successful in :" + (end - start) + " ms" );
			SuccessfulEmailsNo++;
		}
		catch (Exception err) 
		{	
			trace("Failed! Email was not sent successful" + err.getMessage());	
			FailedEmailsNo++;
			return false;
		}			
		
		return true;
	}

	private String getEmailSubject(PatientForEDDischargeVo patient) 
	{
		if(patient == null || patient.getName() == null)
			return EMAIL_SUBJECT;
		
		return EMAIL_SUBJECT + patient.getName().getSurname();
	}

	private String getGpMail(GPLiteWithCommChannelsVo gp) 
	{
		if(gp == null || gp.getCommChannels() == null)
			return null;
		
		for(CommChannelVo channel : gp.getCommChannels())
		{
			if(channel == null)
				continue;
			
			if(ChannelType.EMAIL.equals(channel.getChannelType()))
				return channel.getCommValue();
		}
		
		return null;
	}

	private PatientDocumentVo savePatientDocument(PatientDocumentVo document) throws StaleObjectException
	{
		if(document == null) {
			throw new CodingRuntimeException("PatientDocumentVo is null");
		}
		if (!document.isValidated()) {
			throw new DomainRuntimeException("PatientDocumentVo not validated");
		}
		
		DomainFactoryBridge factory = getDomainFactory();
		PatientDocument doPatientDocument = PatientDocumentVoAssembler.extractPatientDocument(factory, document);	
		factory.save(doPatientDocument);			
		return PatientDocumentVoAssembler.create(doPatientDocument);
	}

	private PatientDocumentVo populatePatientDocument(TrackingJobVo tracking, MemberOfStaffRefVo mosRefVo) 
	{
		if(tracking == null)
			return null;
		
		PatientDocumentVo vo = new PatientDocumentVo();
		
		vo.setPatient(tracking.getPatient());					
		vo.setCareContext(tracking.getAttendance() != null ? tracking.getAttendance().getCareContext() : null);	
		vo.setEpisodeofCare(tracking.getEpisode() != null ? tracking.getEpisode().getEpisodeOfCare() : null);
		vo.setSpecialty((tracking.getEpisode() != null && tracking.getEpisode().getEpisodeOfCare() != null) ? tracking.getEpisode().getEpisodeOfCare().getSpecialty() : null);
			
		vo.setResponsibleHCP((tracking.getEpisode() != null && tracking.getEpisode().getEpisodeOfCare() != null) ? tracking.getEpisode().getEpisodeOfCare().getResponsibleHCP() : null);
				
		vo.setDocumentDate((tracking.getAttendance() != null && tracking.getAttendance().getCareContext() != null && tracking.getAttendance().getCareContext().getStartDateTime() != null) ? tracking.getAttendance().getCareContext().getStartDateTime().getDate() : null);
		
		if(vo.getDocumentDate() == null)
		{
			vo.setDocumentDate(new ims.framework.utils.Date());
		}
		
		vo.setName("ED Discharge Supplementary Report"  + ((tracking.getPatient() != null && tracking.getPatient().getName() != null) ? " - " + tracking.getPatient().getName().toString() : ""));
		vo.setServerDocument(populateServerDocument());
		vo.setCreationType(DocumentCreationType.GENERATED);						
		vo.setCategory(DocumentCategory.DISCHARGE_SUPPLEMENTARY);
		
		if (mosRefVo != null)
		{
			vo.setRecordingUser(mosRefVo);
			vo.setAuthoringHCP(getHcpForMosRef(mosRefVo));
			vo.setAuthoringDateTime(new DateTime());
		}
		
		vo.setRecordingDateTime(new DateTime());				
		vo.setStatus(PreActiveActiveInactiveStatus.ACTIVE);
		
		return vo;					
	}
	
	private HcpRefVo getHcpForMosRef(MemberOfStaffRefVo mosRef)
	{
		DomainFactoryBridge factory = getDomainFactory();
		MemberOfStaff mosDo = (MemberOfStaff)factory.getDomainObject(MemberOfStaff.class, mosRef.getID_MemberOfStaff().intValue());
		MemberOfStaffVo mosVo = MemberOfStaffVoAssembler.create(mosDo);
		if (mosVo.getHcpIsNotNull())
			return (HcpRefVo)mosVo.getHcp();
		
		return null;
	}
	private ServerDocumentVo populateServerDocument() 
	{
		ServerDocumentVo vo = new ServerDocumentVo();
		DateTime startDate = new ims.framework.utils.DateTime();								
		filePath =  startDate.getDate().getYear()+ "/" +startDate.getDate().getMonth() + "/" + startDate.getDate().getDay() + "/" + fileName;	
		vo.setFileName(filePath);
		vo.setFileType(FileType.PDF);						
		
		return vo;		
	}

	public String uploadFile(byte[] file, String fileName, String localFolder) throws Exception
	{		
		if(ConfigFlag.GEN.FILE_UPLOAD_DIR.getValue() == null || ConfigFlag.GEN.FILE_UPLOAD_DIR.getValue().length() == 0)
		{
			throw new Exception("ConfigFlag GEN.FILE_UPLOAD_DIR is null");			
		}
		
		HttpClient conn = null;	  				
		StringBuffer sb = new StringBuffer(500);
		PostMethod filePost = new PostMethod(ConfigFlag.GEN.PDF_UPLOAD_URL.getValue());		

		conn = new HttpClient(new MultiThreadedHttpConnectionManager());

		conn.getHttpConnectionManager().getParams().setConnectionTimeout(TIMEOUT);		
		conn.getParams().setBooleanParameter(HttpMethodParams.USE_EXPECT_CONTINUE, true);
		conn.getParams().setIntParameter(HttpMethodParams.BUFFER_WARN_TRIGGER_LIMIT, MAX_BUFFER_LIMIT_NO_WARNING);

		Part[] data = 
		{
		    new StringPart("name", localFolder), 
		    new StringPart("filename", fileName),	           
		    new FilePart(fileName, new ByteArrayPartSource(fileName, file))	           
		};
		  		
		filePost.setRequestEntity(new MultipartRequestEntity(data, filePost.getParams()));

	    int iGetResultCode;
		try
		{
			iGetResultCode = conn.executeMethod(filePost);

			if (iGetResultCode == HttpStatus.SC_OK) 
			{
				sb.append("Upload complete, status	=	" + iGetResultCode);
				sb.append("\nUpload complete, response	=	" + HttpStatus.getStatusText(iGetResultCode));
				sb.append("\nUpload complete, response	=	" + filePost.getResponseBodyAsString());				
				trace(sb.toString());

				if (filePost.getResponseBodyAsString() != null &&
						filePost.getResponseBodyAsString().length() != 0 &&
							filePost.getResponseBodyAsString() != "")
				{
					return parse(filePost.getResponseBodyAsString());
				}				
			}
			else 
			{
				sb.append("Upload failed, status	=	" + iGetResultCode);
				sb.append("Upload failed, response=" + HttpStatus.getStatusText(iGetResultCode));
				sb.append("Upload failed, response=" + filePost.getResponseBodyAsString());
				trace(sb.toString());
				
				throw new Exception(sb.toString());
			}
		} 
		catch (HttpException e)
		{			 			 
			throw new Exception(e);
		} 
		catch (IOException e)
		{			
			throw new Exception(e);
		}
		finally
		{
			filePost.releaseConnection();
		}		

	  	return null;		
	}
	
	private String parse(String xml)
	{
		if (xml == null)
			return null;
	
		return (xml.split("\""))[1];	
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
	
	private String generateName() throws Exception
	  {	
		  String str = "";
		  
		  try
		  {
			  //Get Random Segment
		      SecureRandom prng = SecureRandom.getInstance("SHA1PRNG");
		      str += Integer.toHexString(prng.nextInt());
		      while (str.length () < 8)
	          {
	              str = '0' + str;
	          }
			  
			  //Get CurrentTimeMillis() segment
		      str += Long.toHexString(System.currentTimeMillis());
		      while (str.length () < 12)
	          {
	              str = '0' + str;
	          }

			  //Get Random Segment
		      SecureRandom secondPrng = SecureRandom.getInstance("SHA1PRNG");
		      str += Integer.toHexString(secondPrng.nextInt());
		      while (str.length () < 8)
	          {	
	              str = '0' + str;
	          }

		      //Get IdentityHash() segment
		      str += Long.toHexString(System.identityHashCode((Object) this));
		      while (str.length() < 8)
		      {
		          str = '0' + str; 
		      }	  
		      //Get Third Random Segment
		      byte bytes[] = new byte[16]; 
		      SecureRandom thirdPrng = SecureRandom.getInstance("SHA1PRNG");
		      thirdPrng.nextBytes(bytes);
		      str += Integer.toHexString(thirdPrng.nextInt());
		      while (str.length () < 8)
	          {
	              str = '0' + str;
	          }
		  }
		  catch(java.security.NoSuchAlgorithmException err)
		  {
			  throw new Exception(err);	
		  }
		  
		  return str;
	}	

	private TrackingJobVoCollection getDischargedTrackingsWithSuppNotes() 
	{
		DomainFactoryBridge factory = getDomainFactory();
		
		String query = "SELECT tr from Tracking AS tr LEFT JOIN tr.attendance AS att LEFT JOIN att.dischargeLetterStatus AS attletter WHERE tr.isDischarged = :DISCHARGED AND (tr.supplementaryLetterStatus IS NULL OR tr.supplementaryLetterStatus.id = :SUPP_DISCHARGE_LETTER_STATUS) AND attletter.id = :DISCHARGE_LETTER_STATUS AND att.conclusionDateTime is not null AND att.attendanceSupplementaryComment is not null";
		List<?> results = factory.find(query, new String[] {"DISCHARGED", "SUPP_DISCHARGE_LETTER_STATUS", "DISCHARGE_LETTER_STATUS"}, new Object[] {Boolean.TRUE,DischargeLetterStatus.IN_PROGRESS.getID(),DischargeLetterStatus.GENERATED.getID()});
		if (results.isEmpty())
			return null;
		
		return TrackingJobVoAssembler.createTrackingJobVoCollectionFromTracking(results);
	}
	
	private class SendMail 
	{
		private SendMail()
		{
			Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
			
			SMTP_HOST_NAME 		= ConfigFlag.FW.SMTP_SERVER.getValue();
			SMTP_PORT 			= ConfigFlag.FW.SMTP_PORT.getValue();
			SMTP_AUTH 			= ConfigFlag.FW.SMTP_AUTH.getValue();
			emailFromAddress 	= ConfigFlag.FW.SMTP_SENDER.getValue();	
		}
				
		public void sendSSLMessage(String recipient, String subject, String message, String atach) throws MessagingException 
		{
			System.out.println("Send email to: " + recipient + " with subject :" + subject + " and message : " + message + " and attach file: " + atach);
			
			boolean debug = false;									
			Properties props = new Properties();
			props.put("mail.host", SMTP_HOST_NAME);
			props.put("mail.smtp.auth", "true");
			props.put("mail.debug", "false");
			props.put("mail.smtp.port", SMTP_PORT);
			props.put("mail.smtp.socketFactory.port", SMTP_PORT);
			props.put("mail.smtp.socketFactory.fallback", "false");

			Session session = Session.getDefaultInstance(props,
			new javax.mail.Authenticator() 
			{
				protected PasswordAuthentication getPasswordAuthentication() 
				{
					String[] auth = SMTP_AUTH.split(":");
					return new PasswordAuthentication(auth[0], auth[1]);
				}
			});

			session.setDebug(debug);

			Message msg = new MimeMessage(session);
			InternetAddress addressFrom = new InternetAddress(emailFromAddress);
			msg.setFrom(addressFrom);

			InternetAddress addressTo = new InternetAddress(recipient);
			msg.setRecipient(Message.RecipientType.TO, addressTo);

			//Setting the Subject and Content Type
			msg.setSubject(subject);
			msg.setContent(message, "text/plain");
			
			//create and fill the first message part
			MimeBodyPart firstMsgBodyPart = new MimeBodyPart();
			firstMsgBodyPart.setText(message);

			// create the second message part
			MimeBodyPart secondMsgBodyPart = new MimeBodyPart();

		    // attach the file to the message
			FileDataSource fds = new FileDataSource(atach);
			secondMsgBodyPart.setDataHandler(new DataHandler(fds));
			secondMsgBodyPart.setFileName(fds.getName());

			//create the Multipart and add its parts to it
			Multipart mp = new MimeMultipart();
			mp.addBodyPart(firstMsgBodyPart);
			mp.addBodyPart(secondMsgBodyPart);

			//add the Multipart to the message
			msg.setContent(mp);

			//set the Date: header
			msg.setSentDate(new Date());

			Transport tr = session.getTransport("smtp");
			tr.connect(SMTP_HOST_NAME, SMTP_PORT, null, null);
			msg.saveChanges();
			tr.sendMessage(msg, msg.getAllRecipients());
			tr.close();
		}
	}

}
