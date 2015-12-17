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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//http://jira/browse/WDEV-14000
import java.io.FileOutputStream;
//http://jira/browse/WDEV-14000
import java.io.IOException;
import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;
import org.quartz.JobExecutionException;
import org.quartz.SchedulerConfigException;
import ims.configuration.ConfigFlag;
import ims.core.configuration.domain.objects.DocumentConversionSettings;

import ims.core.vo.lookups.FileType;
import ims.core.vo.lookups.PreActiveActiveInactiveStatus;
import ims.core.vo.lookups.Specialty;
import ims.core.vo.lookups.TaxonomyType;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.lookups.LookupInstance;
import ims.domain.lookups.LookupMapping;
import ims.framework.interfaces.IConfiguredScheduledJob;
import ims.framework.utils.Date;
import ims.framework.utils.DateTime;
import ims.scheduler.DomainFactoryBridge;
import ims.scheduler.SchedulerJobExecutionSummary;
import ims.scheduler.SchedulerJobExecutionStatus;
import ims.vo.LookupTypeVo;

public final class DocumentsConversionJobImpl extends ims.scheduler.SchedulerJob
{
	private Connection conection;
	private HashMap<String, String> months = new HashMap<String, String>();
	private HashMap<String, String> specialtyMap = new HashMap<String, String>();
	private Vector<String[]> cache;
	private String[] headers;
	private int colCount;
	private Statement statement = null;
	private Statement statementRsno = null;
	private String filePath = "";	
	private boolean allRecords = false;
	private int converted = 0;
	private int failed = 0;
	
	private static final String UNID = "unid";
	private static final String PKEY = "valu";
	private static final String CREATE_DATE = "cdate";
	private static final String CREATE_TIME = "ctime";
	private static final String EVENT_DATE = "event_date";
	private static final String RECORDING_DATE = "rdat";
	private static final String UPDATING_DATE = "updating_date";
	private static final String UPDATING_TIME = "updating_time";
	private static final String DOCUMENT_TYPE_ID = "document_type_id";
	private static final String DOCUMENT_FILE_NAME = "document_file_name";	
	private static final String CONVERTED_DATE_TIME = "converted_date_time";	
	private static final String DOC_SPEC = "doc_spec";
	private static final String RESP_HCP = "recording_hcp";
	private static final String AUTH_HCP = "entering_user";
	
	@Override
	public SchedulerJobExecutionSummary doExecute() throws JobExecutionException
	{		
		long start = System.currentTimeMillis();		
		StringBuilder summaryMessage = new StringBuilder();		
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());		
		summaryMessage.append("Start job at " +  calendar.getTime());
		summaryMessage.append("\n");
		
		formatMonths();
		
		trace("Loading driver");
		loadDriver();
		trace("Driver loaded successfully");
		
		DocumentConversionSettings setting = DocumentConversionSettings.getDocumentConversionSettingsFromConfiguredJob(getDomainFactory(), super.getConfiguredJob().getConfiguredScheduledJobID());		
		if (setting == null)
		{
			throw new JobExecutionException("Job configuration missing");
		}		
		if (setting.isAllRecords())
		{
			allRecords = true;
		}
		
		try 
		{
			trace("Connecting ...");
			makeConnection(setting.getDatabaseUsername(), setting.getDatabasePassword(), setting.getServer(), setting.getServerPort(), setting.getDatabaseName());
			trace("Connected!");
			
			trace("Create Statement ...");						
			createStatement(setting);
			
			trace("load specialtyMap ...");
			loadSpecialtyMap();
			
			trace("Start conversion ...");
			convertDocuments(setting.getFilesPath());
		} 
		catch (Exception e) 
		{
			//throw new JobExecutionException(e);
			trace("Conversion error: " + e.getMessage());
			
			summaryMessage.append("Scheduled job failed!");
			summaryMessage.append("\n");
		
			return new SchedulerJobExecutionSummary(SchedulerJobExecutionStatus.FAILED, e.getMessage());			
		}
		finally
		{
			closeConnection();
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
		summaryMessage.append("Total successfully conversions : " + converted);
		summaryMessage.append("\n");
		summaryMessage.append("Total failed conversions : " + failed);
		summaryMessage.append("\n");				
		summaryMessage.append("Scheduled job completed successfully.");
		
		return new SchedulerJobExecutionSummary(SchedulerJobExecutionStatus.SUCCEEDED, summaryMessage.toString());
	}
	
	@Override
	public void cleanUpSettings(IConfiguredScheduledJob job) throws	Exception
	{		
		DocumentConversionSettings setting = DocumentConversionSettings.getDocumentConversionSettingsFromConfiguredJob(getDomainFactory(), super.getConfiguredJob().getConfiguredScheduledJobID()); 
		if (setting != null)
		{
			getDomainFactory().delete(setting);
		}				
	}
	
	private void loadDriver() throws JobExecutionException
	{
	  	try 
	  	{		  
	  		Class.forName("net.sourceforge.jtds.jdbc.Driver");				
		}
		catch(ClassNotFoundException error) 
		{
		    throw new JobExecutionException("Error loading driver: " + error);
		}
	}
	private void makeConnection(String username, String password, String ipAddress, int port, String dataBase) throws JobExecutionException
	{
	  	try 
	  	{		  				
	  		String url = "jdbc:jtds:sybase://" + ipAddress + ":" + port + "/" + dataBase;
			trace("Connecting to Sybase " +  dataBase + " database ..." );
			conection = DriverManager.getConnection( url, username, password );
			conection.setAutoCommit(false);												
		}
		catch(SQLException error) 
		{			
			throw new JobExecutionException("Error connecting to Sybase " +  dataBase + " database : " +  error.getMessage());			
		}
	}
	private void formatMonths() 
	{
		months.put("01", "Jan");
		months.put("02", "Feb");
		months.put("03", "Mar");
		months.put("04", "Apr");
		months.put("05", "May");
		months.put("06", "Jun");
		months.put("07", "Jul");
		months.put("08", "Aug");
		months.put("09", "Sep");
		months.put("10", "Oct");
		months.put("11", "Nov");
		months.put("12", "Dec");
	}
	private void createStatement(DocumentConversionSettings setting) throws JobExecutionException
	{
		cache = new Vector<String[]>();
		String query = null;		
		java.sql.Date fromDate = null;
		java.sql.Date toDate = null;
		
		if (setting.getFromDate() != null) {
			fromDate = new java.sql.Date(setting.getFromDate().getTime());			
		}		
		if (setting.getToDate() != null) {
			toDate = new java.sql.Date(setting.getToDate().getTime());
		}
		
		if (allRecords) 
		{	 
			query = "select type.doc_name, doc.recording_hcp, doc.unid, pid.valu, doc.cdate, doc.event_date, doc.rdat, doc.ctime, doc.document_type_id, doc.document_file_name, doc.updating_date, doc.updating_time, doc.doc_spec, doc.entering_user  from DOCS as doc, PID as pid, DOCTYPE as type where (pid.pkey = doc.pkey and pid.type = 38095) and (doc.document_type_id=type.doc_id) and doc.conversion_date_time is null";			
		}
		else 
		{
			query = "select type.doc_name, doc.recording_hcp, doc.unid, pid.valu, doc.cdate, doc.event_date, doc.rdat, doc.ctime, doc.document_type_id, doc.document_file_name, doc.updating_date, doc.updating_time, doc.doc_spec, doc.entering_user  from DOCS as doc, PID as pid, DOCTYPE as type where (pid.pkey = doc.pkey and pid.type = 38095) and (doc.document_type_id=type.doc_id) and (doc.conversion_date_time is not null and doc.updating_date is not null and doc.updating_date > doc.conversion_date_time)";
		}
		if (fromDate != null && toDate != null)
		{
			query += " and doc.cdate between '" +  fromDate + "' and '" + toDate + "'";
		}
		
		query += " order by doc.cdate";
		
		try 
    	{		          
    		statement = conection.createStatement();
    		
    		//Execute the query and store the result set and its metadata
    		ResultSet result = statement.executeQuery(query);
    		if (result != null)
    		{
    			 ResultSetMetaData meta = result.getMetaData();
    			 colCount = meta.getColumnCount();
    			 headers  = new String[colCount];
    			 
    		     for (int h = 1; h <= colCount; h++) 
    		     {
    		    	 headers[h - 1] = meta.getColumnName(h);
    		     }
    		     
    		     while (result.next()) 
    		     {    		    	 
    		         String[] record = new String[colCount];
    		         for (int i = 0; i < colCount; i++) 
    		         {
    		        	 record[i] = result.getString(i + 1);
    		         }
    		         
    		         cache.addElement(record);    		         
    		     }
    		}
    		
    		trace("Found " + cache.size() + " records ...");
	    }
    	catch(SQLException ex) 
    	{
    		cache = new Vector<String[]>();  //blank it out 
    		trace("Error executing statement: " + query + " : " + ex.getMessage());    		
    		throw new JobExecutionException("Error executing statement: " + query + " : " + ex.getMessage());
	    }
    	finally 
    	{   
    		if(statement != null)
    		{
    			try 
    			{
					statement.close();
				} 
    			catch (SQLException e) 
				{
					throw new JobExecutionException(e);
				}
    		}
    	}				  	
	}
	private void convertDocuments(String pathToReadFile) throws JobExecutionException, FileNotFoundException, IOException, SchedulerConfigException 
	{	
		for (int i = 0; i < cache.size(); i++) 
		{	
			convertDocument(cache.get(i), pathToReadFile);
		}
	}
	public void convertDocument(String[] record, String pathToReadFile) throws JobExecutionException, FileNotFoundException, IOException, SchedulerConfigException
	{	    		
		long startProcessingOneRecord = 0;
		long finishProcessingOneRecord = 0;    	
	   	long startBuildingVo = 0;
	   	long finishBuildingVo = 0;
	   	long startUpload = 0;
	   	long finishUpload = 0;
	   	Date DocumentDate = null;
	   	DateTime RecordingDateTime = null;
	   	
	    					
	    int 			patient 			= -1;	    			
	    String 			path 				= pathToReadFile;
	    String 			document_file_name 	= "";
	    boolean 		badRecord 			= false;
	    int 			unid 				= 0;
	    String 			event_date			= "";
	    String 			recording_date		= "";
	    String			updating_date		= "";
	    String			doc_spec			= "";
	    String			resposibleHcp		= "";
	    String			authoringHcp		= "";
	    		   
	    startProcessingOneRecord = System.currentTimeMillis();    		
	    startBuildingVo = System.currentTimeMillis();
	    int recordNumber = 0;
	    
		for (int j = 1; j < record.length; j++) 
	    {	
	    	recordNumber ++;
	    	
	    	if (getColumnName(j).equals(PKEY)) 
	    	{
	    		if (record[j] == null || (record[j] != null && record[j].equals("-1")))
	    		{
	    			trace("Bad PKEY for unid = " + + unid);	 
	    			failed ++;
	    			badRecord = true;	    			
	    			
	    			break;
	    		}
	    					
	    		//Get Patient
	    		patient = getPatientByHospitalNo(record[j]);
	    		if (patient == -1)
	    		{
	    			badRecord = true;
	    			failed ++;
	    			trace("There is no Patient with HospitalNo: " + record[j]+ ". Skip record with unid = " + unid);	    				    				   
	    			
	    			break;
	    		}	    				
	    	}
	    	else if (getColumnName(j).equals(UNID)) 
	    	{
	    		unid = Integer.parseInt(record[j]);
	    	}
	    	else if (getColumnName(j).equals(CREATE_DATE)) 
	    	{
	    		if (record[j] != null)
	    		{
	    			//Build file path
		   			String year = record[j].split(" ")[0].substring(0, 4);
		   			String month = months.get(record[j].split(" ")[0].substring(5, 7));
		   			path = year + "/" + month;	
	    		}	    					 
	    	}
	    	else if (getColumnName(j).equals(CREATE_TIME)) 
	    	{
	    		
	    	}
	    	else if (getColumnName(j).equals(EVENT_DATE)) 
	    	{
	    		event_date = (record[j]==null?"":record[j]);	    		
	    	}
	    	else if (getColumnName(j).equals(RECORDING_DATE)) 
	    	{
	    		recording_date = (record[j]==null?"":record[j]);
	    	}	    		   
	    	else if (getColumnName(j).equals(DOCUMENT_TYPE_ID)) 
	    	{
				//Build file path
	    		path += "/" + record[j] + "/";	    					
	    	}
	    	else if (getColumnName(j).equals(DOCUMENT_FILE_NAME)) 
	    	{
	    		if(record[j] != null && record[j].contains("."))
	    		{
    				document_file_name = record[j].substring(0, record[j].lastIndexOf('.')) + ".pdf";
	    		}
	    	}	    				
	    	else if (getColumnName(j).equals(UPDATING_DATE)) 
	    	{
	    		updating_date = (record[j]==null?"":record[j]);
	    	}
	    	else if (getColumnName(j).equals(UPDATING_TIME)) 
	    	{
	    	}
	    	else if (getColumnName(j).equals(CONVERTED_DATE_TIME)) 
	    	{
	    	}
	    	else if (getColumnName(j).equals(DOC_SPEC)) 
	    	{
	    		doc_spec = (record[j]==null?"":record[j]);
	    	}	
	    	else if (getColumnName(j).equals(RESP_HCP)) 
	    	{
	    		resposibleHcp = (record[j]==null?"":record[j]);
	    	}
	    	else if (getColumnName(j).equals(AUTH_HCP)) 
	    	{
	    		authoringHcp = (record[j]==null?"":record[j]);
	    	}	    	
	    	
		}
	    	
    	finishBuildingVo = System.currentTimeMillis();
    	//debug("Total time for get data to create DocumentConversionVo : " + (finishBuildingVo - startBuildingVo) + " ms");
	    
    	byte[] buffer = readFile(pathToReadFile + "/" + path + document_file_name);
		if (buffer == null || (buffer != null && buffer.length == 0)) 
		{	
			trace("Cannot read file : " + pathToReadFile + "/" + path + document_file_name);
			failed ++;
			badRecord = true; 						
		}
    	
/*    	// Test if file is on path
    	if (!new File(pathToReadFile + "\\" + path + document_file_name).exists())
    	{
    		trace("Cannot read file : " + pathToReadFile + "\\" + path + document_file_name);
    		badRecord = true;        		
    	}
*/    	
    	//Process next record
    	if (badRecord) {
    		return;
    	}
	    			
		//read file to be converted
	    /*byte[] buffer = readFile(pathToReadFile + "\\" + path + document_file_name);
		if (buffer == null || (buffer != null && buffer.length == 0)) 
		{	
			trace("Cannot read file : " + pathToReadFile + "\\" + path + document_file_name);
			return ; 						
		}
		*/																									
		try 
		{					
			filePath = generateName() + ".pdf";				
			startUpload = System.currentTimeMillis();
				
			//new FileUpload(null, ConfigFlag.GEN.PDF_UPLOAD_URL.getValue()).upload(buffer, filePath,  ConfigFlag.GEN.FILE_UPLOAD_DIR.getValue() + "/");			
			
			finishUpload = System.currentTimeMillis();		    		
			//debug("Total time for uploading file: " + (finishUpload - startUpload) + " ms");
			
			//http://jira/browse/WDEV-14000 - start			
			//http://jira/browse/WDEV-13982
			String storePath = ConfigFlag.GEN.PDF_STORE_PATH.getValue();
			
			//TODO create directory if it doesn't exist
			//if(!storePath.endsWith("/"))
				//storePath = storePath + "/";

			DateTime startDate = new ims.framework.utils.DateTime();	
			String lFile = storePath + startDate.getDate().getYear() + "/" + startDate.getDate().getMonth() + "/" + startDate.getDate().getDay() + "/" + filePath;			

			trace("Writing File named " + lFile);
			FileOutputStream out = new FileOutputStream(lFile, false);
			out.write(buffer);
			out.flush();
			out.close();
			
			
//			if (!new File(lFile.replace("/", "\\")).exists())
//			{
//				trace("Error uploading file : "  + lFile.replace("/", "\\") + " File not found.");			
//				return; 
//			}
//			else
//				trace("File uploaded successfully : "  + lFile);
			//http://jira/browse/WDEV-13982
			//http://jira/browse/WDEV-14000 - end
			
		}
		catch (Exception exception)
		{
			trace("Error uploading file : "  + filePath + ". Exception: " + exception.getMessage());	
			failed ++;
			return; 
		}					
	    		
	    //**** Populate PatientDocumentVo
	    //PatientDocumentVo patientDocumentVo = new PatientDocumentVo();
	    //changed to construct refvo without assembler
	    //PatientRefVo patRefVo = new PatientRefVo();
	    //patRefVo.setID_Patient(patient);
		
	    //patientDocumentVo.setPatient(patRefVo);			    			
	    //patientDocumentVo.setName(record[0]);	    			
	    //ServerDocumentVo serverDocument = createServerDocumentVo();
	    //patientDocumentVo.setServerDocument(serverDocument);	    			
	    //patientDocumentVo.setCreationType(DocumentCreationType.GENERATED);						
	    //patientDocumentVo.setCategory(DocumentCategory.HISTORICAL);						
	    //patientDocumentVo.setRecordingUser(null);
	    
	    //event_date has presedence over recording_date
	    if (event_date != "")
	    {
		    try {
    			//format date
		    	// eg. 2005-05-20 00:00:00.0
	   			String year = event_date.substring(0, 4);
	   			String month = event_date.substring(5, 7);
	   			String day = event_date.substring(8, 10);
		    	//trace("Event Date : " + event_date);
		    	//trace("Format Date : year " + year + "month" +month+" day" +day);
				//patientDocumentVo.setDocumentDate(new Date(day + "/" + month + "/" + year));
	   			DocumentDate = new Date(day + "/" + month + "/" + year);
			} catch (ParseException e1) 
			{
				trace("Error getting event date of hisorical document : " + e1.getMessage());
			}
	    }
	    else
	    {
		    if (recording_date != "")
		    {	    	
			    try {
					//format date
			    	// eg. 2005-05-20 00:00:00.0
		   			String year = recording_date.substring(0, 4);
		   			String month = recording_date.substring(5, 7);
		   			String day = recording_date.substring(8, 10);
			    	//trace("Recording Date : " + event_date);
			    	//trace("Format Date : year " + year + "month" +month+" day" +day);		    	
					//patientDocumentVo.setRecordingDateTime(new DateTime(year+month+day));
		   			DocumentDate = new Date(day + "/" + month + "/" + year);
				} catch (ParseException e1) 
				{
					trace("Error getting recording date of hisorical document : " + e1.getMessage());
				}	   
				
		    }
		    else
		    {
		    	//default to today
		    	//patientDocumentVo.setRecordingDateTime(new DateTime());
		    	DocumentDate = (new Date());
		    }	    	
	    }
	    
	    if (recording_date != "")
	    {	    	
		    try {
				//format date
		    	// eg. 2005-05-20 00:00:00.0
	   			String year = recording_date.substring(0, 4);
	   			String month = recording_date.substring(5, 7);
	   			String day = recording_date.substring(8, 10);
		    	//trace("Recording Date : " + event_date);
		    	//trace("Format Date : year " + year + "month" +month+" day" +day);		    	
				//patientDocumentVo.setRecordingDateTime(new DateTime(year+month+day));
				RecordingDateTime =  new DateTime(year+month+day);
			} catch (ParseException e1) 
			{
				trace("Error getting recording date of hisorical document : " + e1.getMessage());
			}	   
			
	    }
	    else
	    {
	    	//default to today
	    	//patientDocumentVo.setRecordingDateTime(new DateTime());
	    	RecordingDateTime = (new DateTime());
	    }
	    
	    //patientDocumentVo.setStatus(PreActiveActiveInactiveStatus.ACTIVE);	
	    //patientDocumentVo.setHistoricalFileName(document_file_name);
	    
//	    String[] str = patientDocumentVo.validate();					
//	    if (str != null && str.length > 0)
//		{	
//	    	trace("Error saving PatientDocumentVo: " + str);
//	    	failed ++;
//			return;
//		}
	    
	    long startSave = System.currentTimeMillis();
	    try 
		{
			//savePatientDocument(patient);
		    //	  patientid,name,CreationType,Category,DocumentDate,RecordingDateTime,status,HistoricalFileName
		    savePatientDocument(patient,record[0],DocumentDate,
		    		RecordingDateTime,PreActiveActiveInactiveStatus.ACTIVE,document_file_name,unid,doc_spec,resposibleHcp,authoringHcp);	    	
		}
		catch (StaleObjectException exception) 
		{	
			trace("Error saving PatientDocument : " + exception.getMessage());
			failed ++;
			return;
		}
		long endSave = System.currentTimeMillis();
		//debug("Total time for save PatientDocument: " + (endSave - startSave) + " ms");
		
		long start = System.currentTimeMillis();

		//WDEV-13625
		// in order for the delta process to work without missing any docuemnt updates, 
		// the conversion_date must be updated to the corresponding update_date.
		//changed to above : Update Sybase database; set converted_date_time = new DateTime()
		//Calendar now = Calendar.getInstance();

		String query = "update DOCS set conversion_date_time = '" +  updating_date + "' where DOCS.unid = " + unid;		
		try 
		{		          
			statement = conection.createStatement();	
			int rows = statement.executeUpdate(query);
	    	conection.commit();
//	    	if (rows == 1)
//	    	{
//	    		debug("Sybase database update successfully");
//	    	}
		}
	    catch(SQLException ex) 
	    {
	    	trace("Error executing statement: " + query + " : " + ex.getMessage());
	    	failed ++;
	     	throw new JobExecutionException("Error executing statement: " + query + " : " + ex.getMessage());
	     	
		}	    
	    finally 
	    {   
	    	if(statement != null)
	    	{
	    		try 
	    		{
					statement.close();
				} 
	    		catch (SQLException e) 
				{
	    			failed ++;
					throw new JobExecutionException(e);
				}
	    	}
	    }			
		
	    long end = System.currentTimeMillis();
	    
	    //debug("Total time for Sybase update: " + (end - start) + " ms");
	    
	    converted ++;
	    
		finishProcessingOneRecord = System.currentTimeMillis();
		//debug("Total time for processing record: " + (finishProcessingOneRecord - startProcessingOneRecord) + " ms");		    		
	}
	
	private String getColumnName(int i) 
	{
		return headers[i];
	}	
	
//	private ServerDocumentVo createServerDocumentVo() 
//	{
//		ServerDocumentVo vo = new ServerDocumentVo();
//		DateTime startDate = new ims.framework.utils.DateTime();											
//		vo.setFileName(startDate.getDate().getYear() + "/" + startDate.getDate().getMonth() + "/" + startDate.getDate().getDay() + "/" + filePath);
//		vo.setFileType(FileType.PDF);						
//		
//		return vo;		
//	}
	
	private int getPatientByHospitalNo(String hospitalNo) 
	{	
		String patId = "";
		DomainFactoryBridge factory = getDomainFactory();
		Connection conectionTarget = factory.getjdbcConnection();
		
		StringBuffer sql = new StringBuffer();
		sql.append("select id from core_patient_c_identifi where core_patient_c_identifi.lkp_c_ty = -150 and core_patient_c_identifi.c_val = ?");

		trace("sql" + sql.toString());
		
		try 
		{
			PreparedStatement ps = conectionTarget.prepareStatement(sql.toString());
			ps.setString(1, hospitalNo);
			
			ResultSet rs = ps.executeQuery();
			if (!rs.next())
			{
				debug("Patient no found for Hospital Number:" + hospitalNo);
				rs.close();
				ps.close();
				conectionTarget.commit();
				conectionTarget.close();
				return -1;
			}
			else
			{
				patId = rs.getString(rs.getRow());
				rs.close();
				ps.close();
				//PatientLiteVo vo = PatientLiteVoAssembler.create((Patient)factory.getDomainObject((Patient.class), new Integer(patId).intValue()));
				conectionTarget.commit();	
				conectionTarget.close();
				return new Integer(patId).intValue();
			}
		}
		catch (SQLException e) 
		{
			throw new DomainRuntimeException(e.getMessage(),e);
		}			

		
		//List domainObjectList = factory.find("select p from Patient as p left join p.identifiers as pIdent left join pIdent.type as identType where (identType.id = -150) and  pIdent.value = :hospitalNo", new String[] {"hospitalNo"}, new Object[] {hospitalNo});
		//PatientLiteVoCollection patient = PatientLiteVoAssembler.createPatientLiteVoCollectionFromPatient(domainObjectList);
		//return patient != null && patient.size() > 0 ? (patient.get(0) != null ? patient.get(0) : null) : null;
	}
	private byte[] readFile(String filePath) throws FileNotFoundException, IOException 
	{
		File pdf = new File(filePath);
		long size = pdf.length();
		
		if (size == 0) {
			trace("Error reading file " + filePath);
			return null;
		}
		
		FileInputStream fileInputStream = new FileInputStream(pdf);		
		int bytesAvailable = fileInputStream.available();
		int maxBufferSize = (int) size;
		int bufferSize = Math.min(bytesAvailable, maxBufferSize);
		byte[] buffer = new byte[bufferSize];
		int bytesRead = fileInputStream.read(buffer, 0, bufferSize);
		while (bytesRead > 0)
		{					
		    bytesAvailable = fileInputStream.available();
		    bufferSize = Math.min(bytesAvailable, maxBufferSize);
		    bytesRead = fileInputStream.read(buffer, 0, bufferSize);
		}
		fileInputStream.close();		
		
		return buffer;
	}
	private String generateName()
	{	
		String name = "";
		  
		try
		{
			  //Get Random Segment
		      SecureRandom prng = SecureRandom.getInstance("SHA1PRNG");
		      name += Integer.toHexString(prng.nextInt());
		      while (name.length () < 8)
	          {
		    	  name = '0' + name;
	          }
			  
			  //Get CurrentTimeMillis() segment
		      name += Long.toHexString(System.currentTimeMillis());
		      while (name.length () < 12)
	          {
		    	  name = '0' + name;
	          }

			  //Get Random Segment
		      SecureRandom secondPrng = SecureRandom.getInstance("SHA1PRNG");
		      name += Integer.toHexString(secondPrng.nextInt());
		      while (name.length () < 8)
	          {	
		    	  name = '0' + name;
	          }

		      //Get IdentityHash() segment
		      name += Long.toHexString(System.identityHashCode((Object) this));
		      while (name.length() < 8)
		      {
		    	  name = '0' + name; 
		      }	  
		      //Get Third Random Segment
		      byte bytes[] = new byte[16]; 
		      SecureRandom thirdPrng = SecureRandom.getInstance("SHA1PRNG");
		      thirdPrng.nextBytes(bytes);
		      name += Integer.toHexString(thirdPrng.nextInt());
		      while (name.length () < 8)
	          {
		    	  name = '0' + name;
	          }
		}
		catch(java.security.NoSuchAlgorithmException err)
		{
			trace(err.toString());	
		}
		  
		return name;
	}
	//public void savePatientDocument(PatientDocumentVo newDocument) throws StaleObjectException
	public void savePatientDocument(int patient, String filename, Date documentDate, 
			DateTime recordingDateTime, PreActiveActiveInactiveStatus active, String historical_filename, int unid,String strSpecialty,String strRHcp, String authoringHcp) throws StaleObjectException
	{
//		if(newDocument == null) 
//			throw new CodingRuntimeException("PatientDocumentVo is null");
//
//		if (!newDocument.isValidated()) 
//			throw new DomainRuntimeException("PatientDocumentVo not validated");
				
//		DomainFactoryBridge factory = getDomainFactory();			
//		long startSave = System.currentTimeMillis();				
//		PatientDocument pdoc = PatientDocumentVoAssembler.extractPatientDocument(factory, newDocument);
//		long finishSave = System.currentTimeMillis();
//		debug("Total time to extract PatientDocument from PatientDocumentVo : " + (finishSave-startSave) + " ms");
//		
//		
//		startSave = System.currentTimeMillis();
//		factory.save(pdoc);
//		finishSave = System.currentTimeMillis();
//		
//		factory.commitTransaction();
//				
//		debug("Total time for save : " + (finishSave-startSave) + " ms");
		
		
		DateTime startDate = new ims.framework.utils.DateTime();											

		DomainFactoryBridge factory = getDomainFactory();
		Connection conectionTarget = factory.getjdbcConnection();
		StringBuffer sql = new StringBuffer();
		StringBuffer sql3 = new StringBuffer();
		
		//debug("Specialty = " + strSpecialty);
		String szSpecialty = getMappedSpecialty(strSpecialty);		
		String szResponsibleHcp = getRSFMappedCode(strRHcp,TaxonomyType.NAT_CONS_CODE.getID());
		String szAuthoringHcp = getRSFMappedCode(authoringHcp,TaxonomyType.NAT_CONS_CODE.getID());
		
//		inactivateHistoricDocs(newDocument.getHistoricDocId());
		sql3.append("update CORE_PATIENTDOCUMEN set lkp_status = ? where historicdo = ?");
		trace("sql :- " + sql3.toString());
		
		//to_char((to_date(sl01h.time_add)), 'HH24:MI:SS') 
		
		//create serverdocument
		sql.append("insert into core_serverdocument(id,class,vstp,rie,sys_creation_datetime,sys_lastupdate_datetime,sys_creation_user,sys_lastupdate_user,filename,lkp_filetype)")
//	    id                      numeric(10,0) IDENTITY,
		.append(" values(HIBERNATE_SEQUENCE.nextval,")
//	    class                   varchar(4)    NULL,
		.append("null,")
//	    vstp                    int           NOT NULL,
		.append("0,")
//	    rie                     tinyint       NULL,
		.append("0,")
//	    sys_creation_datetime   datetime      NULL,
		.append("current_timestamp,")
//	    sys_lastupdate_datetime datetime      NULL,
		.append("null,")
//	    sys_creation_user       varchar(30)   NULL,
		.append("'MIGRATE',")
//	    sys_lastupdate_user     varchar(30)   NULL,
		.append("null,'")
//	    filename                varchar(500)  NOT NULL,
		//.append(newDocument.getServerDocument().getFileName())
		.append(startDate.getDate().getYear() + "/" + startDate.getDate().getMonth() + "/" + startDate.getDate().getDay() + "/" + filePath)
		.append("',")
//	    lkp_filetype            numeric(10,0) NULL,
		//.append(new Integer(newDocument.getServerDocument().getFileType().getID()).toString())
		.append(new Integer(FileType.PDF.getID()).toString())
		.append(")");		
		
		try 
		{			
			
			//update historical docs to inactive
			PreparedStatement ps3 = conectionTarget.prepareCall(sql3.toString());
			ps3.setInt(1, PreActiveActiveInactiveStatus.INACTIVE.getID());
			ps3.setInt(2, unid);
			trace("sql historical document update call:- " + sql3.toString() + "Params :- " + 
					PreActiveActiveInactiveStatus.INACTIVE.getID() + " for unid: " + unid );			
			ps3.execute();
			ps3.close();
			
			trace("sql :- " + sql.toString());
			
			PreparedStatement st = conectionTarget.prepareStatement(sql.toString(), new String[] {"ID"}); 
			
			st.executeUpdate();
			ResultSet rs = st.getGeneratedKeys();
		 			
			//String serverFileId = new Integer(id).toString();
			rs.next();
			int serverFileId = rs.getInt(1);
			st.close();

			StringBuffer sql2 = new StringBuffer();
			
			//insert PatientDocument
			sql2.append("insert into CORE_PATIENTDOCUMEN(id,class,vstp,rie,sys_creation_datetime,sys_lastupdate_datetime,sys_creation_user,sys_lastupdate_user,patient,")
			.append("episodeofc,carecontex,clinicalco,referral,serverdocu,recordingu,authoringh,currentdoc,clinic,lockedbyus,responsibl,")
			.append("name,lkp_creationty,lkp_category,lkp_status,recordingd,authoringd,lkp_specialty,lkp_correspond,documentda,islockedfo,")
			.append("lockedonda,noofcopies,historical,edis_dischargerepor_discharged,edis_summary_discharged,historicdo)")
//			    id                             numeric(10,0) IDENTITY,
			.append(" values(HIBERNATE_SEQUENCE.nextval,")
//			    class                          varchar(4)    NULL,
			.append("null,")
//			    vstp                           int           NOT NULL,
			.append("0,")
//			    rie                            tinyint       NULL,
			.append("0,");
//			    sys_creation_datetime          datetime      NULL,			
			sql2.append("current_timestamp,");
//			    sys_lastupdate_datetime        datetime      NULL,
			sql2.append("null,")
//			    sys_creation_user              varchar(30)   NULL,
			.append("'MIGRATE',")
//			    sys_lastupdate_user            varchar(30)   NULL,
			.append("null,")							
//			    patient                        numeric(10,0) NOT NULL,
			.append("?,")  //patient				
//			    episodeofc                     numeric(10,0) NULL,
			.append("null,")
//			    carecontex                     numeric(10,0) NULL,
			.append("null,")
//			    clinicalco                     numeric(10,0) NULL,
			.append("null,")
//			    referral                       numeric(10,0) NULL,
			.append("null,")
//			    serverdocu                     numeric(10,0) NOT NULL,
			.append("?,")  //server document
//			    recordingu                     numeric(10,0) NULL,
			.append("null,")
//			    authoringh                     numeric(10,0) NULL,
			.append(szAuthoringHcp+",")
//			    currentdoc                     numeric(10,0) NULL,
			.append("null,")
//			    clinic                         numeric(10,0) NULL,
			.append("null,")
//			    lockedbyus                     numeric(10,0) NULL,
			.append("null,")
//			    responsibl                     numeric(10,0) NULL,
			.append(szResponsibleHcp+",")
//			    name                           varchar(100)  NOT NULL,
			.append("'")
			//.append(newDocument.getNameIsNotNull()?newDocument.getName().replace("'", "''"):"")
			.append(filename.replace("'", "''"))
			.append("',")
//			    lkp_creationty                 numeric(10,0) NULL,     DocumentCreationType.GENERATED
			.append("-1487,")  //lkp_creationty
//			    lkp_category                   numeric(10,0) NOT NULL, DocumentCategory.HISTORICAL
			.append("-1912,")  //lkp_category
//			    lkp_status                     numeric(10,0) NOT NULL,
			.append("?,")  //patientDocumentVo.getStatus
//			    recordingd                     datetime      NOT NULL,
			.append("to_date('");
		if (recordingDateTime != null)
			{
				sql2.append(recordingDateTime.toString())
				.append("','dd/mm/yyyy hh24:mi'),");  //newDocument.getRecordingDateTime()
			}
			else
				sql2.append("null,");
//			    authoringd                     datetime      NULL,
			sql2.append("null,")
//			    lkp_specialty                  numeric(10,0) NULL,
			.append(szSpecialty==null?"null,":szSpecialty+",")
//			    lkp_correspond                 numeric(10,0) NULL,
			.append("null,");
//			    documentda                     datetime      NULL, documentdate
			if (documentDate != null)
			{
				sql2.append("to_date('")
				.append(documentDate.toString())
				.append("','dd/mm/yyyy'),"); //newDocument.getDocumentDate()
			}
			else
				sql2.append("null,");
//			    islockedfo                     tinyint       NULL,
			sql2.append("null,")
//			    lockedonda                     datetime      NULL,
			.append("null,")
//			    noofcopies                     int           NULL,
			.append("null,")
//			    historical                     varchar(255)  NULL,
			.append("'")
			.append(historical_filename)
			.append("',") //patientDocumentVo.setHistoricalFileName
//			    edis_dischargerepor_discharged numeric(10,0) NULL,
			.append("null,")
//			    edis_summary_discharged        numeric(10,0) NULL,
			.append("null,")
			.append(unid + ")");


			PreparedStatement ps = conectionTarget.prepareCall(sql2.toString());
//			ps.setInt(1, newDocument.getPatient().getID_Patient());
//			ps.setInt(2, serverFileId);				
//			ps.setInt(3, newDocument.getStatus().getId());

			ps.setInt(1, patient);
			ps.setInt(2, serverFileId);				
			ps.setInt(3, active.getId());
			
			trace("sql :- " + sql2.toString() + "Params :- " + 
					patient + "," + serverFileId + "," + active.getId());
			
			ResultSet rsPd = ps.executeQuery();
			if (!rsPd.next())
			{
				debug("error inserting patient document : " + filename);
				return;
			}
			
			ps.close();
			
			conectionTarget.commit();	
			conectionTarget.close();
			return;
			
		}
		catch (SQLException e) 
		{
			throw new DomainRuntimeException(e.getMessage(),e);
		}			

		
		
	}
		
	private String getRSFMappedCode(String strRHcp, int taxonomyCodeId) 
	{
		String strCode = null;
		String strId = null;
		DomainFactoryBridge factory = getDomainFactory();
		Connection conectionTarget = factory.getjdbcConnection();

		//strRHcp holds the rsno, need to confirm that is what needs to be mapped with PAS external code?
		
		//lookup the RSF table using rsno to get the 'code' which will be mapped to the 'National Consultant Code' as an external MOS mapping
		
		if (strRHcp==null || strRHcp.equals(""))
			return null;
		
		String query = "select code from RSF where rsno = " + strRHcp;		
		try 
		{		          
			statementRsno = conection.createStatement();	
			ResultSet res = statementRsno.executeQuery(query);
	   
	    	if (res.next())
	    	{
	    		if (res.getString("code") == null)
	    		{
	    			statementRsno.close();
	    			return null;
	    		}
	    		
	    		strCode = res.getString("code").trim();
	    		if (strCode!=null && !strCode.equals(""))
	    		{
	    			
	    			//lookup MOS mapping DomainObjects version if needed
//	    			String hql = " from MemberOfStaff mos " +
//	    			" join mos.codeMappings as mosCm" +
//	    			" where mosCm.taxonomyName = :taxType " + 
//	    			" and mosCm.taxonomyCode = :extId ";
//	    			List mosList = factory.find(hql,new String[]{"taxType", "extId"}, new Object[]{TaxonomyType.NAT_CONS_CODE.getText(),strCode});
	    				    			
	    			//lookup MOS mapping straight Oracle Sql	    			
	    			query = "select CORE_MEMBEROFSTAFF.id,CORE_MEMBEROFSTAFF.hcp,CORE_MEMBEROFSTAFF_CODEMAPPIN.taxonomyco from CORE_MEMBEROFSTAFF join CORE_MEMBEROFSTAFF_CODEMAPPIN on CORE_MEMBEROFSTAFF_CODEMAPPIN.id = CORE_MEMBEROFSTAFF.id where CORE_MEMBEROFSTAFF_CODEMAPPIN.lkp_taxonomyna = ? and CORE_MEMBEROFSTAFF_CODEMAPPIN.taxonomyco = ?";
	    			
	    			PreparedStatement ps3 = conectionTarget.prepareCall(query.toString());
	    			ps3.setInt(1, taxonomyCodeId);
	    			ps3.setString(2, strCode);
	    			trace("sql MOS query for mapped code call:- " + query.toString() + "Params :- " + 
	    					taxonomyCodeId + " : " + strCode);			
	    			ResultSet res3 = ps3.executeQuery();
	    			if (res3.next())
	    			{	    				
	    				strId = res3.getString("hcp");
	    				if (strId != null)
	    				{
	    					return strId.trim();
	    				}
	    				else
	    					return null;
	    			}
	    			
    				res3.close();
    				statementRsno.close();
    				ps3.close();
	    			
	    		}
	    	}

	    	return strId;
		}
	    catch(SQLException ex) 
	    {
	    	trace("Error executing statement: " + query + " : " + ex.getMessage());	     		     	
		}	    
	    finally 
	    {   
	    	if(statementRsno != null)
	    	{
	    		try 
	    		{
	    			statementRsno.close();
				} 
	    		catch (SQLException e) 
				{
				}
	    	}
	    }			
				
		return null;
	}

	private void loadSpecialtyMap()
	{
		LookupTypeVo typeVo = new LookupTypeVo();
		typeVo.setId(Specialty.TYPE_ID);

		DomainFactoryBridge factory = getDomainFactory();
		ims.domain.lookups.Lookup lookupType = factory.getLookup(typeVo.getId());
		if (null != lookupType)
		{
			java.util.Set set = lookupType.getInstances();
			for (Iterator iter = set.iterator(); iter.hasNext();)
			{
				LookupInstance element = (LookupInstance) iter.next();
				LookupMapping lkpMapping = element.getMapping(TaxonomyType.MAXIMS_INTERNAL.getText());
				if (lkpMapping!= null)
					specialtyMap.put(lkpMapping.getExtCode(), new Integer(element.getId()).toString());				
			}
		}
		
//		debug("Specialty Map");
//		debug(specialtyMap.toString());
		
	}
	private String getMappedSpecialty(String strSpecialty) 
	{
		return specialtyMap.get(strSpecialty);
	}

	private void closeConnection() throws JobExecutionException
	{	
		if(conection != null)
		{
			try 
			{
				conection.close();
			} 
			catch (SQLException e) 
			{
				throw new JobExecutionException(e);
			}
		}
	}
}
