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
import ims.core.configuration.domain.objects.ClinNoteForEvolveSettings;
import ims.core.documents.domain.objects.PatientDocument;
import ims.core.patient.domain.objects.Patient;
import ims.core.patient.vo.PatientRefVo;
import ims.core.patient.vo.PatientRefVoCollection;
import ims.core.resource.people.domain.objects.MemberOfStaff;
import ims.core.resource.people.vo.HcpRefVo;
import ims.core.resource.people.vo.MemberOfStaffRefVo;
import ims.core.vo.ClinicalNotesForEvolveTaskSettingsVo;
import ims.core.vo.MemberOfStaffVo;
import ims.core.vo.PatientDocumentStatusVo;
import ims.core.vo.PatientDocumentStatusVoCollection;
import ims.core.vo.PatientDocumentVo;
import ims.core.vo.ServerDocumentVo;
import ims.core.vo.domain.ClinicalNotesForEvolveTaskSettingsVoAssembler;
import ims.core.vo.domain.MemberOfStaffVoAssembler;
import ims.core.vo.domain.PatientDocumentVoAssembler;
import ims.core.vo.lookups.DocumentCategory;
import ims.core.vo.lookups.DocumentCreationType;
import ims.core.vo.lookups.DocumentStatus;
import ims.core.vo.lookups.FileType;
import ims.core.vo.lookups.PreActiveActiveInactiveStatus;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.ForeignKeyViolationException;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.exceptions.CodingRuntimeException;
import ims.framework.interfaces.IConfiguredScheduledJob;
import ims.framework.utils.DateTime;
import ims.scheduler.DomainFactoryBridge;
import ims.scheduler.SchedulerJobExecutionStatus;
import ims.scheduler.SchedulerJobExecutionSummary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.security.SecureRandom;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

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

public final class PatientClinicalNotesforEvolveIngestionJobImpl extends ims.scheduler.SchedulerJob
{
	
	private static final int 	TIMEOUT = 1000 * 60 * 15;
	private static final int 	MAX_BUFFER_LIMIT_NO_WARNING = 1024*1024;
	
	private static String 	 urlQueryServer;
	private static String 	 urlReportServer;
	private static String 	 urlPdfUploadServer;	
	private static String 	 pdfStorePath;
	
	private static Integer	 PATIENT_CLINICAL_NOTES_BATCH_REPORT_IMSID = 353;
	private String 			 fileName;
	private String 			 filePath = "";
	private String 			 printer = null;
	
	private int				 GeneratedReports = 0;
	private int				 FailedGeneratedReports = 0;
	
	@Override
	public SchedulerJobExecutionSummary doExecute() throws JobExecutionException
	{

		long start = System.currentTimeMillis();		
		StringBuilder summaryMessage = new StringBuilder();		
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());		
		summaryMessage.append("Start job at " +  calendar.getTime());
		summaryMessage.append("\n");
		trace("SI Clinical notes - scheduled job started");
		
		ClinicalNotesForEvolveTaskSettingsVo job = getJobDetails();
		if (job == null)
		{
			throw new JobExecutionException("Job configuration missing");
		}
		
		
		trace("SI Clinical notes - scheduled job started 1 ");
		MemberOfStaffRefVo mosRefVo = getMOSForConfiguredJob(job);
		if (mosRefVo == null)
		{
			throw new JobExecutionException("No Recording User available");
		}
		trace("SI Clinical notes - scheduled job started 2 ");
		
		
		PatientRefVoCollection patientsToProcess = getPatientsToProcess(job);
		
		try
		{
			savePatientDocuments(patientsToProcess, job, mosRefVo);
		}
		catch(Exception e)
		{
			trace("Conversion error: " + e.getMessage());
			
			summaryMessage.append("Scheduled job failed!");
			summaryMessage.append("\n");
			summaryMessage.append("Total successfully generated reports : " + GeneratedReports);
			summaryMessage.append("Total failed reports : " + FailedGeneratedReports); 
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
		
		summaryMessage.append("Total time for execution: " + d + " days, " + h + " hours, " + m + " minutes, " + s + " seconds");
		summaryMessage.append("\n");
		summaryMessage.append("Total successfully generated reports: " + GeneratedReports);
		summaryMessage.append("\n");
		summaryMessage.append("Total failed reports: " + FailedGeneratedReports);
		summaryMessage.append("\n");	
		summaryMessage.append("Scheduled job completed successfully.");
		
		trace("Scheduled job ended");
		
		return new SchedulerJobExecutionSummary(SchedulerJobExecutionStatus.SUCCEEDED, summaryMessage.toString());
	}
	
	private MemberOfStaffVo getMOSForConfiguredJob(ClinicalNotesForEvolveTaskSettingsVo job)
	{
		if ( (job == null)
			|| (job != null && job.getSystemInformation() == null)
			|| (job != null && job.getSystemInformation().getCreationUser() == null)
			||  (job != null && job.getSystemInformation().getCreationUser() == "") )
		{
			trace("MOSForConfiguredJob is null");
			return null;
		}
		
		String query = "select m1_1 from MemberOfStaff as m1_1 left join m1_1.appUser as a1_1 where a1_1.username = :userName";
		DomainFactoryBridge factory = getDomainFactory();
		List<?> results = factory.find(query, new String[] {"userName"}, new Object[] {job.getSystemInformation().getCreationUser()});
		if (results != null && results.size() >0)
			return MemberOfStaffVoAssembler.create((MemberOfStaff)results.get(0));
		else
			return null;
	}

	
	@Override
	public void cleanUpSettings(IConfiguredScheduledJob job) throws Exception
	{
		DomainFactoryBridge factory = getDomainFactory();
		
		ClinNoteForEvolveSettings clinicalNotesForEvolveSettingsDO = ClinNoteForEvolveSettings.getClinNoteForEvolveSettingsFromConfiguredJob(factory, super.getConfiguredJob().getConfiguredScheduledJobID());
		if (clinicalNotesForEvolveSettingsDO != null)
		{
			factory.delete(clinicalNotesForEvolveSettingsDO);
		}
	}
	
	private void saveJob(ClinicalNotesForEvolveTaskSettingsVo job)
	{
		if(job == null)
			return;
		
		job.setSuccessfulProcessed(job.getSuccessfulProcessed() != null ? job.getSuccessfulProcessed() + GeneratedReports : GeneratedReports);
		job.setFailedProcessed(job.getFailedProcessed() != null ? job.getFailedProcessed() + FailedGeneratedReports : FailedGeneratedReports);
		
			
		DomainFactoryBridge factory = getDomainFactory();
		ClinNoteForEvolveSettings jobDO = ClinicalNotesForEvolveTaskSettingsVoAssembler.extractClinNoteForEvolveSettings(factory, job);
		try 
		{
			factory.save(jobDO);
		} 
		catch (StaleObjectException e) 
		{
			trace("Job details save has failed! " + e.getMessage());
			return;
		}
	}

	private ClinicalNotesForEvolveTaskSettingsVo getJobDetails()
	{
		DomainFactoryBridge domainFactory = getDomainFactory();
		ClinNoteForEvolveSettings clinNotesSettingsDO = ClinNoteForEvolveSettings.getClinNoteForEvolveSettingsFromConfiguredJob(domainFactory,super.getConfiguredJob().getConfiguredScheduledJobID());
		
		return ClinicalNotesForEvolveTaskSettingsVoAssembler.create(clinNotesSettingsDO);
	}

	private PatientRefVoCollection getPatientsToProcess(ClinicalNotesForEvolveTaskSettingsVo job)
	{
		if (job == null)
			return null;
		DomainFactoryBridge factory = getDomainFactory();
		
		Integer hoursToSearch = new Integer(-job.getPeriodForJob().intValue());	
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.HOUR, hoursToSearch.intValue());
		Date searchStartDate = cal.getTime();

		String query = "select pat from ClinicalNotes as cl join cl.careContext as cc join cc.episodeOfCare as ep join ep.careSpell as cs join cs.patient as pat " +
				"where (cl.isRIE is null  or cl.isRIE = 0) and  ( (cl.systemInformation.creationDateTime >= :SEARCHSTARTDATE) " +
				"or (cl.systemInformation.lastUpdateDateTime >= :SEARCHSTARTDATE) )"; 

		List<?> results = factory.find(query, new String[] {"SEARCHSTARTDATE"}, new Object[] {searchStartDate});

		if (results != null && results.size() >0)
		{
			PatientRefVoCollection pats = new PatientRefVoCollection();
			for (int i=0; i< results.size();i++)
			{	
				if (!(results.get(i) instanceof Patient))
					continue;
				pats.add(new PatientRefVo(((Patient)results.get(i)).getId(), ((Patient)results.get(i)).getVersion()));
			}
			return pats;
		}
		return null;		
	}

	private synchronized void savePatientDocuments(PatientRefVoCollection patientsToProcess, ClinicalNotesForEvolveTaskSettingsVo job, MemberOfStaffRefVo mosRefVo) throws Exception
	{
		if(patientsToProcess == null || patientsToProcess.size() == 0)
			return;
		
		urlQueryServer 		= ConfigFlag.GEN.QUERY_SERVER_URL.getValue();
		urlReportServer 	= ConfigFlag.GEN.REPORT_SERVER_URL.getValue();
		urlPdfUploadServer 	= ConfigFlag.GEN.PDF_UPLOAD_URL.getValue();
		pdfStorePath 		= ConfigFlag.GEN.PDF_STORE_PATH.getValue();
		
		if (urlQueryServer == "")
		{			
			throw new JobExecutionException("QUERY_SERVER_URL is not set.");
		}
		if (urlReportServer == "")
		{			
			throw new JobExecutionException("REPORT_SERVER_URL flag is not set.");
		}
		if (urlPdfUploadServer == "")
		{			
			throw new JobExecutionException("PDF_UPLOAD_URL flag is not set.");
		}
		if (pdfStorePath == "")
		{			
			throw new JobExecutionException("PDF_STORE_PATH flag is not set.");
		}
		
		Object[] obj = getSystemReportAndTemplate(PATIENT_CLINICAL_NOTES_BATCH_REPORT_IMSID);
		
		if(obj == null || obj.length < 2) 
		{		
			throw new JobExecutionException("The report could not be found or it's not deployed.");
		}
		
		if(obj[0] == null || obj[1] == null) 
		{		
			throw new JobExecutionException("The report could not be found or it's not deployed.");
		}
		
		GeneratedReports = 0;
		FailedGeneratedReports = 0;
		
		for(PatientRefVo patientRef : patientsToProcess)
		{
			createPatientDocument(patientRef, obj[0], obj[1], job, mosRefVo);
		}
		
	}

	private void createPatientDocument(PatientRefVo patientRef, Object report, Object template, ClinicalNotesForEvolveTaskSettingsVo job, MemberOfStaffRefVo mosRefVo) throws Exception
	{
		if(patientRef == null)
			return;
		
		fileName = generateName() + ".pdf";	
		
		PatientDocumentVo document = null;
		
		Integer hoursToSearch = new Integer(-job.getPeriodForJob().intValue());	
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.HOUR, hoursToSearch.intValue());
		Date searchStartDate = cal.getTime();
		
		try
		{
			document = saveDocument(patientRef, mosRefVo);
			if(document == null)
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
			FailedGeneratedReports++;
			return;
		}
		
		QueryBuilderClient client = new QueryBuilderClient(urlQueryServer, null);
		client.addSeed(new SeedValue("Patient_id",  patientRef.getID_Patient(), Integer.class));
		client.addSeed(new SeedValue("StartDate",  searchStartDate, java.util.Date.class));
		client.addSeed(new SeedValue("EndDate",  new Date(), java.util.Date.class));
		
		byte[] buffer = null;
		try 	
		{							
			trace("Report server URL:" + urlReportServer);
			trace("Trying to build report...");
			long start = System.currentTimeMillis();
			buffer = client.buildReport((String)report, (String)template, urlReportServer, "PDF", "", 0);
			long end = System.currentTimeMillis();
			trace("Report was built successfully in :" + (end - start) + " ms" );
			if (buffer == null || (buffer != null && buffer.length == 0)) 
			{
				trace("Generated report size is zero");
			}
		}
		catch (QueryBuilderClientException err) 
		{	
			rollback(document);
			trace("Building report has failed! " + err.getMessage());
			return;
		}
		
		try
		{
			long start = System.currentTimeMillis();
			trace("Trying to upload report...");
			uploadFile(buffer, fileName,  pdfStorePath);
			long end = System.currentTimeMillis();
			trace("File uploaded successfully in :" + (end - start) + " ms" );							
		}
		catch(Exception e)
		{
			rollback(document);
			FailedGeneratedReports++;
			trace("Uploading file has failed! " + e.getMessage());
			return;
		}
		
		GeneratedReports++;
		
	}

	public String uploadFile(byte[] file, String fileName, String localFolder) throws Exception
	{
		if(ConfigFlag.GEN.FILE_UPLOAD_DIR.getValue() == null || ConfigFlag.GEN.FILE_UPLOAD_DIR.getValue().length() == 0)
		{
			throw new Exception("ConfigFlag GEN.FILE_UPLOAD_DIR is not set.");			
		}
	//	if(ConfigFlag.GEN.FILE_UPLOAD_DIR.getValue() != null || ConfigFlag.GEN.FILE_UPLOAD_DIR.getValue().equals(ConfigFlag.GEN.FILE_UPLOAD_DIR.getDefaultValue()))
	//	{
	//		throw new Exception("ConfigFlag GEN.FILE_UPLOAD_DIR is set to default.");			
	//	}
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
	private void rollback(PatientDocumentVo document) throws StaleObjectException
	{
		if(document != null)
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

	private void deletePatientDocument(PatientDocumentVo document) throws ForeignKeyViolationException
	{
		if(document == null) {
			throw new CodingRuntimeException("PatientDocumentVo object is null.");
		}
		if (!document.isValidated()) {
			throw new DomainRuntimeException("PatientDocumentVo is not validated.");
		}
		
		DomainFactoryBridge factory = getDomainFactory();
		
		//// try to delete the file on disk to avoid duplicates on re-completion
		FileLock lock = null;
		FileChannel chan = null;
		String patDocFilePath = document.getServerDocument().getFileName();

		try
		{
			try
			{
				chan = new RandomAccessFile(getMaximsDocumentStorePath() + patDocFilePath, "rw").getChannel();
				lock = chan.tryLock();
			}
			catch (FileNotFoundException e)
			{
				trace ("Could not find the file associated with this Patient Document in the document store location.");
				throw e;
			}
			catch (IOException e)
			{
				trace("A I/O exception occured while deleting the file associated with this Patient Document.");
				throw e;
			}

			lock.release();

			if (chan != null)
			{
				try
				{
					chan.close();
				}
				catch (IOException e)
				{
					trace("A I/O exception occured while deleting the file associated with this Patient Document.");
				}
			}

			deleteFile(getMaximsDocumentStorePath() + patDocFilePath);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if (chan != null)
			try
			{
					chan.close();
			}
			catch (IOException e)
			{
				trace("A I/O exception occured while deleting the file associated with this Patient Document.");
			}
		}
				
		PatientDocument doPatientDocument = PatientDocumentVoAssembler.extractPatientDocument(factory, document);	
		factory.delete(doPatientDocument);		
	}
	
	private boolean deleteFile(String fileToDelete)
	{
		File file = new File(fileToDelete);
		if (file.exists())
		{
			boolean wasDeleted = file.delete();
			if (!wasDeleted)
			{
				file.deleteOnExit();
			}
		}
		
		return true;
	}
	
	private String getMaximsDocumentStorePath()
	{
		String storePath = pdfStorePath;
		
		if(!(storePath.endsWith("/") || storePath.endsWith("\\")))
			storePath = storePath + "/";
				
		return storePath;
	}
	
	private PatientDocumentVo saveDocument(PatientRefVo patientRef, MemberOfStaffRefVo mosRefVo) throws Exception
	{
		PatientDocumentVo document = populatePatientDocument(patientRef, mosRefVo);
		
		String[] str = document.validate();		
		if (str != null && str.length > 0)
		{	
			trace("PatientDocumentVo has validation errors.");
			return null;
		}	
		
		document = savePatientDocument(document);
		return document;
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

	private PatientDocumentVo populatePatientDocument(PatientRefVo patientRef, MemberOfStaffRefVo mosRefVo) throws Exception
	{
		if(patientRef == null)
			return null;
		
		PatientDocumentVo vo = new PatientDocumentVo();
		
		vo.setPatient(patientRef);					
						
		vo.setDocumentDate(new ims.framework.utils.Date());
		vo.setName("Patient Clinical Notes Batch Report");
		vo.setServerDocument(populateServerDocument());
		vo.setCreationType(DocumentCreationType.GENERATED);						
		vo.setCategory(DocumentCategory.CLINICAL_NOTES);
		
		vo.setRecordingDateTime(new DateTime());
		vo.setStatus(PreActiveActiveInactiveStatus.ACTIVE);
		
		PatientDocumentStatusVo status = new PatientDocumentStatusVo();
		status.setCorrespondenceStatus(DocumentStatus.COMPLETED);
		status.setRecordingUser(mosRefVo);
		status.setRecordingDateTime(new DateTime());

		vo.setCurrentDocumentStatus(status);
		vo.setDocumentStatusHistory(new PatientDocumentStatusVoCollection());//wdev-19898
		vo.getDocumentStatusHistory().add(status);//wdev-19898

		vo.setRecordingUser(mosRefVo);//wdev-19898
		vo.setRecordingDateTime(new DateTime());//wdev-19898
		vo.setAuthoringHCP(getHcpForMosRef(mosRefVo));//wdev-19898
		vo.setAuthoringDateTime(new DateTime());//wdev-19898

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
}
