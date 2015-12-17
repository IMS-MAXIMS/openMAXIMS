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
import ims.emergency.domain.objects.AttendanceRequiringContracting;
import ims.core.admin.domain.objects.EmergencyAttendance;
import ims.core.clinical.domain.objects.TaxonomyMap;
import ims.core.generic.domain.objects.Address;
import ims.core.patient.domain.objects.Patient;
import ims.core.patient.domain.objects.PatientId;
import ims.core.resource.people.domain.objects.Gp;
import ims.core.resource.place.domain.objects.LocSite;
import ims.core.resource.place.domain.objects.Location;
import ims.core.vo.lookups.PatIdType;
import ims.core.vo.lookups.TaxonomyType;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.ForeignKeyViolationException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.lookups.LookupInstance;
import ims.emergency.configuration.domain.objects.AttendanceReqContServiceSettings;
import ims.emergency.vo.lookups.AttendanceReqContractingStatus;
import ims.framework.enumerations.SystemLogLevel;
import ims.framework.enumerations.SystemLogType;
import ims.framework.interfaces.IConfiguredScheduledJob;
import ims.scheduler.DomainFactoryBridge;
import ims.scheduler.SchedulerJobExecutionStatus;
import ims.scheduler.SchedulerJobExecutionSummary;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;




import org.quartz.JobExecutionException;


public final class ContractAllocationJobImpl extends ims.scheduler.SchedulerJob
{
    private Socket sock=null;
	private InputStream input;
	private OutputStream output;
	//private SimpleDateFormat formatter = new SimpleDateFormat("EEE_MMM_dd_HH_mm_ss_SSS");
	private SimpleDateFormat formatterDate = new SimpleDateFormat("yyyyMMdd");
	private SimpleDateFormat formatterTime = new SimpleDateFormat("HHmm");
	private boolean allRecords = false;
	private int contractAllocations = 0;
	private int failed = 0;	 
	 
	public SchedulerJobExecutionSummary doExecute() throws JobExecutionException
	{		
		long start = System.currentTimeMillis();
		int intRet = -1;
		StringBuilder summaryMessage = new StringBuilder();		
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());		
		summaryMessage.append("Start job at " +  calendar.getTime());
		summaryMessage.append("\n");
				
		AttendanceReqContServiceSettings setting = AttendanceReqContServiceSettings.getAttendanceReqContServiceSettingsFromConfiguredJob(getDomainFactory(), super.getConfiguredJob().getConfiguredScheduledJobID());
		
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
			intRet = contractAllocation(setting,summaryMessage);
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
		summaryMessage.append("Total successfully contract allocations : " + contractAllocations);
		summaryMessage.append("\n");
		summaryMessage.append("Total failed allocations : " + failed);
		summaryMessage.append("\n");				
		
		if (intRet<0)
		{
			summaryMessage.append("Contract Allocation job completed with errors.");
			return new SchedulerJobExecutionSummary(SchedulerJobExecutionStatus.FAILED, summaryMessage.toString());
		}
		else
		{
			summaryMessage.append("Contract Allocation job completed successfully.");
			return new SchedulerJobExecutionSummary(SchedulerJobExecutionStatus.SUCCEEDED, summaryMessage.toString());
		}
	}
	
	
	private int contractAllocation(AttendanceReqContServiceSettings setting, StringBuilder summaryMessage) 
	{
		int iRet = 1;
		
		if (ConfigFlag.UI.USE_HEARTS_CONTRACTING.getValue())
		{
			if (setting.getServer() != null
					&& !setting.getServer().equals(""))
			{
				DomainFactoryBridge factory = getDomainFactory();
				
				List<AttendanceRequiringContracting> results = factory.find("select contAtt from AttendanceRequiringContracting as contAtt" +
						   " left join contAtt.status as cs" +
					       " where cs.id = :atReqStat or cs is null",new String[] {"atReqStat"}, new Object[] {AttendanceReqContractingStatus.ACTIVE.getID()});
				
				//server and port setting for tcp/ip connection
				//AttendanceRequiringContractingVoCollection coll =  AttendanceRequiringContractingVoAssembler.createAttendanceRequiringContractingVoCollectionFromAttendanceRequiringContracting(results);				
				
				//for (AttendanceRequiringContractingVo vo: coll)
				for (AttendanceRequiringContracting domContract: results)
				{
					iRet = 1;
					
					
					EmergencyAttendance domEmAttendance =domContract.getAttendance();
					Patient patient = domContract.getPatient();
					Location domLoc = domEmAttendance.getRegistrationLocation();					
	
					//hpcd via the site_id (registration location from EmergencyAttendance, 
					//there will be a PAS mapping on these locations to give you this codes.					
					String hpcd = null;
					if (domLoc != null)
					{
						hpcd = domLoc.getExtCode(TaxonomyType.PASCONTRACT.getID());
					}
					else
					{
						createSystemLogEntry(SystemLogType.QUARTZ_JOB,SystemLogLevel.ERROR,
								"No Registration Location ",summaryMessage);
						iRet = -1;
					}
											
					if (hpcd==null)
					{
						createSystemLogEntry(SystemLogType.QUARTZ_JOB,SystemLogLevel.ERROR,
								"No " + TaxonomyType.PASCONTRACT.getText() + " mapping for location : " + (domEmAttendance.getRegistrationLocation()!=null?domEmAttendance.getRegistrationLocation().getName():""),summaryMessage);
						iRet = -1;
					}
						
					//harc, postcode at time of attendance					
					if (patient==null)
					{
						createSystemLogEntry(SystemLogType.QUARTZ_JOB,SystemLogLevel.ERROR,
								"No Patient for found for Emergency Attendance : " +
								domEmAttendance.getId().toString(),summaryMessage);
						iRet = -1;
					}
					
					//pkey11 - code mapping of patient identifier
					List<?> patidMapping  = patient.getIdentifiers();
					String pkey = null;
					if (patidMapping != null)
					{
						//get pkey from patidMapping
						for (int i=0; i < patidMapping.size();i++)
						{
							PatientId map = (PatientId)patidMapping.get(i);
							if (map.getType().getId() == PatIdType.PKEY.getId())
								pkey = map.getValue();
						}
					}
					
					if (pkey==null)
					{
						createSystemLogEntry(SystemLogType.QUARTZ_JOB,SystemLogLevel.ERROR,
								"No " + PatIdType.PKEY.getText() + " for patient id " +
								patient.getId().toString(),summaryMessage);
						iRet = -1;
					}
					
					//WDEV-17701
					Address address = patient.getAddress();
					String addressCCG = null;
					if (address!=null && address.getPCT() != null)
					{
						addressCCG = address.getPCT();
					}
					else
						addressCCG = null;
										
					//GP Surgery RSNO code
					LocSite patGpSurgery = patient.getGpSurgery();
					String patGpSurgeryCd = null;
					//hpcd via the site_id (registration location from EmergencyAttendance, 
					//there will be a PAS mapping on these locations to give you this codes.
					if (patGpSurgery!= null && patGpSurgery.getCodeMappings() != null)
					{
						//get patGpCd from codemapping
						for (int i=0; i < patGpSurgery.getCodeMappings().size();i++)
						{
							TaxonomyMap map = (TaxonomyMap)patGpSurgery.getCodeMappings().get(i);
							if (map.getTaxonomyName().getText().equals(TaxonomyType.PAS.getText()))
							{
								if (map.getTaxonomyCode().lastIndexOf('_')>-1)
									patGpSurgeryCd = (map.getTaxonomyCode()!=null?map.getTaxonomyCode().substring(map.getTaxonomyCode().lastIndexOf("_")+1, map.getTaxonomyCode().length()):null);
								else
									patGpSurgeryCd = null;
							}
								
						}
					}
					else
						patGpSurgeryCd = null;
					
					if (iRet == -1)
					{
						//update to inactive for future process if an error has occurred at this point 
 
						domContract.setStatus(factory.getLookupInstance(AttendanceReqContractingStatus.INACTIVE.getID()));
						try {
							getDomainFactory().save(domContract);
						} catch (StaleObjectException e) 
						{
							  createSystemLogEntry(SystemLogType.QUARTZ_JOB, SystemLogLevel.ERROR, e.getMessage(),summaryMessage);
						}				
						failed++;
					}
					else if (iRet != -1)
					{
						// <hpcd>A&E<date8><time4><pkey11><harc3><post8><gpcd11><ckey11><prov2>
							
						// Build the message to be sent to the Contract Allocation Server
						StringBuffer buff = new StringBuffer();
						
						//all mappings are through PASCONTRACT
						// <hpcd>					
	//					-61 use A 
	//					-60 use K 
	//					-59 use G 
	//					-58 use F 
	//					-57 use D 
	//					-54 use V 
	//					-53 use M 
	//					-52 use B 
	//					-51 use S 
	//					-50 use W 
						
						buff.append(hpcd!=null?hpcd:" ")
						.append("A&E");
						 
						//<date8>
						String szDate = formatterDate.format(domEmAttendance.getArrivalDateTime());
						if (szDate.length()==9)
							szDate=szDate.substring(0, 8);
						buff.append(szDate);
						
						//<time4>
						String attTime = formatterTime.format(domEmAttendance.getArrivalDateTime());
						if (attTime.equals("0"))
							attTime = "0000";				
						buff.append(attTime);
						
						//<pkey11>
						//DecimalFormat myFormatter = new DecimalFormat("00000000000");// 11 for pkey
						if (pkey!=null)
						{
							//buff.append(myFormatter.format(pkey!=null?new Integer(pkey):"           "));
							buff.append(pkey);
							for (int i=pkey.length(); i<11; i++) buff.append(" ");
						}
						else
							for (int i=0; i<11; i++) buff.append(" ");
						
						//<harc3>
						//Harc length 3 - is the CCG at time of attendance 
						buff.append(addressCCG!=null?addressCCG:"   ");
						//WDEV-17701
						
						//<post8>
						//Post length 8 - is the postcode at time attendance 
						buff.append(address!=null?address.getPostCode()!=null?address.getPostCode():"        ":"        ");  // 8 characters  needed for postcode
						if (address != null && address.getPostCode() != null)
							for (int i=address.getPostCode().length(); i<8; i++) buff.append(" ");
		
						//<gpcd11>
						//GP length 11 - is the GP at time of attendance - Hearts RSNO - 
						//will need the PAS code resource number(there will be a PAS mapping on the GP to give you this value) 
						buff.append(patGpSurgeryCd!=null?patGpSurgeryCd:"           ");  // 11 characters needed for gp resource
						if (patGpSurgeryCd != null)
							for (int i=patGpSurgeryCd.length(); i<11; i++) buff.append(" ");
						
						//<ckey11>
						//Contract Key length 11 - Hearts contract allocated key, put 11 blanks in
						for (int i=0; i<11; i++) buff.append(" ");
						
						//<prov2>
						//Provider length 2 - Put space for WST (For BLK configuration option) 
						//TODO Query about config for BLK
						buff.append(" ");
									
						//process records
						if (updateEmergencyAttendance(setting, buff, domEmAttendance.getId(),summaryMessage) == 1)
						{
							//record processed successfully
							//WDEV-19360
							//update record to inactive							
							domContract.setStatus(factory.getLookupInstance(AttendanceReqContractingStatus.INACTIVE.getID()));
							try {
								//WDEV-19360
								//getDomainFactory().delete(domContract);
								getDomainFactory().save(domContract);
								contractAllocations++;
							} catch (StaleObjectException e) 
							{
								  createSystemLogEntry(SystemLogType.QUARTZ_JOB, SystemLogLevel.ERROR, e.getMessage(),summaryMessage);
								  failed++;
							}						
							
						}
						else
							failed++;
					}
				}
				
			}
			else
			{
				trace("Contract Allocation : No Configuration for server and port.");
				createSystemLogEntry(SystemLogType.QUARTZ_JOB,SystemLogLevel.ERROR,"Contract Allocation : No Configuration for server and port.",summaryMessage);
			}
		}
		else
			createSystemLogEntry(SystemLogType.QUARTZ_JOB,SystemLogLevel.WARNING,"Contract Allocation : USE_HEARTS_CONTRACTING not set.",summaryMessage);
			
		if (failed>0)
			return -1;
		else
			return 1;
	}

	private String getCCGFromLocation(Patient patient, Location domLoc, StringBuilder summaryMessage) throws DomainInterfaceException 
	{
		String addressCCG = null;
		
		// If a Patient has no address or no GP, 
		// the contract allocation job should pick it up and it should use the PCT(CCG) code from the hospital
		if ( domLoc != null && domLoc.getAddress() != null && domLoc.getAddress().getPCT() != null)
			addressCCG = domLoc.getAddress().getPCT();
		else if (domLoc != null)
		{
			//try mapping
			addressCCG = domLoc.getExtCode(TaxonomyType.PCT.getID());
			
			if (addressCCG == null)
			{
				createSystemLogEntry(SystemLogType.QUARTZ_JOB,SystemLogLevel.ERROR,
						"No Registration Location Address for for Attendance Loaction " +
								domLoc.getId().toString() + " - " + domLoc.getName(),summaryMessage);
				throw new DomainInterfaceException("No Registration Location Address for for Attendance Loaction " +
								domLoc.getId().toString() + " - " + domLoc.getName());
			}
		}
		else
		{
			createSystemLogEntry(SystemLogType.QUARTZ_JOB,SystemLogLevel.ERROR,
					"No Registration Location for patient" + patient.getId().toString() + " and CCG for Attendance Loaction ",summaryMessage);
			throw new DomainInterfaceException("No Registration Location for patient" + patient.getId().toString() + " and CCG for Attendance Loaction ");			
		}
		
		return addressCCG;
	}


	private void createSystemLogEntry(SystemLogType logType, SystemLogLevel logLevel, String message, StringBuilder summaryMessage)
	{		
		try
		{
			ims.domain.DomainSession.getSession().createSystemLogEntry(logType, logLevel, message);
			summaryMessage.append(message + "\n");
		}
		catch(Exception e)
		{	
			e.printStackTrace();
		}
	}

	/**
	 * <p>Method which communicates over a socket with the Contract Allocation
	 * Server to send required buffer and receive back contract message and update the EmergencyAttendance
	 * @param buff input values 
	 * @param emergencyAttendanceId 
	 * @param summaryMessage 
	 * @return </p>
	 */
	private int updateEmergencyAttendance(AttendanceReqContServiceSettings setting,StringBuffer buff, Integer emergencyAttendanceId, StringBuilder summaryMessage)
	{
	  // We need to send this buff to the contract allocation server
	  // and parse the returned value
	  try
	  {
		// Will check if connected, if not, will attempt to connect
		contractAllocationConnect(setting);
		if (sock == null)
		{
		  createSystemLogEntry(SystemLogType.QUARTZ_JOB, SystemLogLevel.ERROR, "Failed to connect to Contract Allocation Server",summaryMessage);
		  return -1;
		}

		createSystemLogEntry(SystemLogType.QUARTZ_JOB, SystemLogLevel.INFORMATION, "Sending to Contract Allocation: " + buff,summaryMessage);
		byte[] bOut = new byte[buff.length()];
		bOut = buff.toString().getBytes();
		output.write(bOut);
		byte[] inbuff = new byte[1024];
		int n = input.read(inbuff);
		if (n <= 0)
		{
		  createSystemLogEntry(SystemLogType.QUARTZ_JOB, SystemLogLevel.FATALERROR, "Error reading data from Contract Allocation Server (input read returned " + n + ")",summaryMessage);
		  if (sock != null)
		  {
				try {
					sock.close();
					sock=null;
				}
				catch (IOException ex) {
				}
		  }
		  return -1;
		}

		String tmpStr = new String(inbuff,0,n);
		createSystemLogEntry(SystemLogType.QUARTZ_JOB, SystemLogLevel.INFORMATION, "Result from Contract Allocation " + tmpStr,summaryMessage);

		// we need to parse out the purchaser and sequence numbers
		if (tmpStr.startsWith("1"))
	    {
		  //<msge 80>
		  createSystemLogEntry(SystemLogType.QUARTZ_JOB, SystemLogLevel.INFORMATION, "Error returned from Contract Allocation Server - " + tmpStr,summaryMessage);
		  contractAllocationDisconnect();
		  return -1;
		}

//		RETURN 
//		contract message returned will be in the following format: 
//
//		0<purc 5><seqn 6><ecrf 1> 
//		1<msge 80> (if error - msge = error text) 
//		2<purc 5><seqn 6><recipient1 5><r2 3><r3 5><r4 3><r5 5><r6 5><r7 5> 
//		                                                                             
//		Store these fields in core.admin.EmergencyAttendance [ID: 1004100025, Type: business object] - PCG1, PCG2, MC, COTA, HAR, Purchaser and Sequence Number. 
//
//		The Hearts contracting Allocation server returns the following 
//
//		Main Commissioner (we use column MC) - Recipient 5 
//		Organisation to which Cost of Treatment accrues (we use COTA) - Recipient 6 
//		CCG of GP (we use PCG1) - Recipient 1 
//		CCG of Patient (we use PCG2) - Recipient 3 
//		Prime Recipient (we use HAR) - Recipient 7 
//		Purchaser 
//		Sequence Number 	
		
		
 
		EmergencyAttendance domEmerAtt = (EmergencyAttendance) getDomainFactory().getDomainObject(EmergencyAttendance.class, 
						emergencyAttendanceId);
				
		//0<purc 5>
		domEmerAtt.setPurchaser(tmpStr.substring(1, 6));

		//<seqn 6>
		//WDEV-18122
		domEmerAtt.setSequenceNumber(tmpStr.substring(6, 12));
		//WDEV-18122
		
		if (tmpStr.startsWith("0"))
		{
			//TODO - query, which field is this?			
			//<ecrf 1>
			//if 2 in first character returned I treat as success else treat as failed
			if (!tmpStr.substring(12, 13).startsWith("2"))
			{
				//allocation failed
				//TODO log
				contractAllocationDisconnect();
			}
				
					
		}
		else if (tmpStr.startsWith("2"))
		{			
			//<recipient1 5>
			//CCG of GP (we use PCG1) - Recipient 1
			domEmerAtt.setPCG1(tmpStr.substring(12,17));
			//<r2 3>
			//TODO - query this field is not specified in the issue
			//<r3 5>
			tmpStr.substring(17, 20);
			//CCG of Patient (we use PCG2) - Recipient 3
			domEmerAtt.setPCG2(tmpStr.substring(20,25));
			//<r4 3>
			//TODO - query this field is not specified in the issue
			tmpStr.substring(25, 28);
			//<r5 5>
			//Main Commissioner (we use column MC) - Recipient 5
			domEmerAtt.setMC(tmpStr.substring(28, 33));
			//<r6 5>
			//Organisation to which Cost of Treatment accrues (we use COTA) - Recipient 6
			domEmerAtt.setCOTA(tmpStr.substring(33, 38));
			//<r7 5> 
			//Prime Recipient (we use HAR) - Recipient 7
			domEmerAtt.setHAR(tmpStr.substring(38, 43));
			
			getDomainFactory().save(domEmerAtt);
			
			//commit for every 100 records.
			if (contractAllocations % 100 == 0)
				getDomainFactory().commitTransaction();
			
		}

		contractAllocationDisconnect();
	  }
	  catch (IOException e)
	  {
		createSystemLogEntry(SystemLogType.QUARTZ_JOB, SystemLogLevel.FATALERROR,"IO Exception occurred during communication with Contract Allocation Server " + e.getMessage(),summaryMessage);
		return -1;
	  }
	  catch (Exception e)
	  {
		createSystemLogEntry(SystemLogType.QUARTZ_JOB, SystemLogLevel.FATALERROR, "Exception occurred retrieving data from Contract Allocation Server" + e.getMessage(),summaryMessage);
		return -1;
	  }
	  return 1;
	}

	private void contractAllocationDisconnect() 
	{
	  if (sock != null)
	  {
			try {
				sock.close();
				sock=null;
			}
			catch (IOException ex) {
			}
	  }		
	}


	private void contractAllocationConnect(AttendanceReqContServiceSettings setting) throws UnknownHostException, IOException 
	{
		//create socket connection
		sock = new Socket(setting.getServer(), setting.getServerPort());
		input = sock.getInputStream();
		output = sock.getOutputStream();
		
	}


	private void closeConnection() 
	{
		
		
	}


	public void cleanUpSettings(IConfiguredScheduledJob job) throws	Exception
	{		
		AttendanceReqContServiceSettings setting = AttendanceReqContServiceSettings.getAttendanceReqContServiceSettingsFromConfiguredJob(getDomainFactory(), super.getConfiguredJob().getConfiguredScheduledJobID()); 
		if (setting != null)
		{
			getDomainFactory().delete(setting);
		}				
	}	
}
