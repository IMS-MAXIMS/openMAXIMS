//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
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
//#############################################################################
//#EOH
package ims.hl7.nas;

import ims.configuration.gen.ConfigFlag;
import ims.configuration.ConfigItems;
import ims.hl7.nas.mapping.NasMapper;
import ims.hl7.nas.mapping.V231NasMapper;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.hl7.utils.SegName;
import ims.utils.Logging;
import imsmaxims.common.ImsNasClient;
import imsmaxims.common.ImsNasMsg;

import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.llp.HL7Reader;
import ca.uhn.hl7v2.llp.HL7Writer;
import ca.uhn.hl7v2.llp.MinLLPReader;
import ca.uhn.hl7v2.llp.MinLLPWriter;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.Structure;
import ca.uhn.hl7v2.model.v231.datatype.XCN;
import ca.uhn.hl7v2.model.v231.message.ADR_A19;
import ca.uhn.hl7v2.model.v231.message.ADT_A01;
import ca.uhn.hl7v2.model.v231.message.ADT_A39;
import ca.uhn.hl7v2.model.v231.message.QRY_A19;
import ca.uhn.hl7v2.model.v231.segment.EVN;
import ca.uhn.hl7v2.model.v231.segment.MRG;
import ca.uhn.hl7v2.model.v231.segment.MSA;
import ca.uhn.hl7v2.model.v231.segment.PID;
import ca.uhn.hl7v2.model.v231.segment.PV1;
import ca.uhn.hl7v2.model.v231.segment.QRD;
import ca.uhn.hl7v2.parser.GenericParser;
import ca.uhn.hl7v2.model.v231.message.ACK;
import ca.uhn.hl7v2.model.v231.segment.MSH;

public class HL7PasProcessor extends Thread 
{
	protected static final Logger LOG = Logging.getLogger(HL7PasProcessor.class);
	private static final int NO_DATA_FOUND = -2;
	private static final int NO_MORE_DATA = -3;
	
	private boolean isRunning = false;
	private HL7PasApplication app;
	private int pid_count = 0;
	private boolean bNackReceived = false;

	public HL7PasProcessor(HL7PasApplication pasApp)
	{
		app = pasApp;
		isRunning = true;
	}
	
	public void run()
	{
		while (isRunning && !(isInterrupted()))
		{
			Message msg = app.getNextMessage();
			if (msg != null)
			{
				processMessage(msg);
			}
			else
			{
				try
				{
					Thread.sleep(200);
				}
				catch (InterruptedException e)
				{
					isRunning = false;
				}
			}
		}
	}

	public boolean isRunning()
	{
		return isRunning;
	}

	public void stopRunning()
	{
		this.interrupt();
	}
		
	public void startRunning()
	{
		this.start();
	}
	
	public Message processMessage(Message msg) 
	{
		LOG.info("Start Processing Message. " + msg.getName());
		LOG.debug("Incoming message. " + msg.toString());		
			
		Message ack = null;		
		Socket sock = null;
		int rv = 0;
		int count = 0;
		boolean bFirstCall = true;
		ImsNasMsg nasMsg = null;		
		NasMapper mapper = null;
		V231NasMapper V231mapper = null;
		ImsNasClient client = null;
		pid_count = 0;
		bNackReceived = false;
		GenericParser parser = new GenericParser();
		try
		{			
			if (!HL7Utils.versionSupported(msg))
			{
				ack = HL7Utils.buildRejAck(msg.get(SegName.MSH), "Version " + HL7Utils.getVersion(msg) + " is not supported. ", HL7Errors.UNSUPP_VERSION);
			}
			else
			{
				String evnCode = HL7Utils.getEventCode(msg);
				if (evnCode.equals("A19") || evnCode.equalsIgnoreCase("A28") || evnCode.equalsIgnoreCase("A31")) //sort this out!
				{
					evnCode = "V231" + evnCode;					
					V231mapper = (V231NasMapper)app.getV231NasMapper(evnCode);					
				}else{

					mapper = (NasMapper)app.getNasMapper(evnCode);
				}
				
				if (mapper == null && V231mapper == null)
				{
					LOG.warn("No NAS Mapper found for event code " + evnCode);
					ack = HL7Utils.buildRejAck(msg.get(SegName.MSH), "No NAS Mapper found for event code " + evnCode, HL7Errors.UNSUPP_EVN_CODE);
				}
				else{
					client = ConnectionManager.getInstance().getConnection();
					if (mapper != null){
						mapper.setConnection(client);
						nasMsg = mapper.translate(msg);
					}else if(V231mapper != null){
						V231mapper.setConnection(client);
						nasMsg = V231mapper.translate(msg);
						if (nasMsg != null){		
							LOG.debug("Attempting Connection to " + ConfigFlag.HL7.HL7_EXTERNAL_LISTENER_HOST.getValue() + ", port: " + ConfigFlag.HL7.HL7_EXTERNAL_LISTENER_PORT.getValue());
							sock = new Socket(ConfigFlag.HL7.HL7_EXTERNAL_LISTENER_HOST.getValue(), ConfigFlag.HL7.HL7_EXTERNAL_LISTENER_PORT.getValue()); 									
							sock.setSoTimeout(200000);
						}
					}
								
					LOG.debug("Received Message: " + parser.encode(msg));
					
					ImsNasMsg nm = new ImsNasMsg();
					nm.addPair("*SERVICE", "PATIENT");
					nm.addPair("ACTION", "STOPLIST");
					StringBuffer tmpOutMess = new StringBuffer();
					StringBuffer tmpErrMess = new StringBuffer();
				
					int tmpRv = client.sendClientRequest(nm.toString(), tmpOutMess, tmpErrMess);
					
					while (1==1)					
					{						
						LOG.debug("ImsNasMsg Translated:" + nasMsg.toPrintString());
						StringBuffer outMess = new StringBuffer();
						StringBuffer errMess = new StringBuffer();
					
						rv = client.sendClientRequest(nasMsg.toString(), outMess, errMess);
						//PAS/EPM now gives total 
						if (nasMsg.getPairVal("ACTION").equals("LIST") || nasMsg.getPairVal("ACTION").equals("NEXTLIST"))
						{
							if (!bFirstCall)
								count -= rv;
							else if (rv > 0)
							{
								LOG.debug("LIST call returned total of " + rv);
								count = rv - Integer.parseInt(nasMsg.getPairVal("MAXNO"));
								rv = Integer.parseInt(nasMsg.getPairVal("MAXNO"));
								bFirstCall = false;
							}							
						}
						ConnectionManager.getInstance().freeConnection(client);
						LOG.debug("NAS Server returned " + rv);
						if (rv == NO_DATA_FOUND){	
							sendResponseToNewSocket(sock,msg,rv,outMess,false);
							break;
						}
						else if (rv < 0 && rv != NO_MORE_DATA){						
							ack = HL7Utils.buildRejAck(msg.get(SegName.MSH), "Error occured at NAS server. " + errMess.toString(), rv);
							LOG.warn("Error " + rv + " occurred at NasServer");
							sendResponseToNewSocket(sock,ack,rv,outMess,true);
							break;
						}else if (rv == 0 && (evnCode.equals("V231A28") || evnCode.equals("V231A31"))){																				
							
							LOG.debug("INSERT OR UPDATE Returned Success");
							sendResponseToNewSocket(sock,msg,rv,outMess,false);							
							break;
						}else if ((rv >= 0 || rv == NO_MORE_DATA) ){									
							//KODAK not implementing HL7 continuation Protocol - flag?
							// They require data to be returned on a different connection
							if (rv == NO_MORE_DATA) {							
								sendResponseToNewSocket(sock,msg,rv,outMess,true);								
								LOG.debug("Call STOPLIST");
								nasMsg.replacePair("ACTION","STOPLIST");								
							}else if (rv == 0){
								if (outMess.length() > 0){								
									LOG.debug("GET Returned Success");
									sendResponseToNewSocket(sock,msg,rv,outMess,false);							
									break;									
								}else 
									break;
							}
							else{										
								
								if (rv > 0){												
									//at this point have data we need to send - just need to figure out whether to mark it as the
									//lst message									
									if (count <= 0)
									{
										LOG.debug("Call STOPLIST");
										sendResponseToNewSocket(sock,msg,rv,outMess,true);
										nasMsg.replacePair("ACTION","STOPLIST");
									}
									else
									{
										LOG.debug("Call NEXTLIST");								
										nasMsg.replacePair("ACTION","NEXTLIST");									
										sendResponseToNewSocket(sock,msg,rv,outMess,false);
									}									
								}
								else
									break;
							}
						}					
						else if (outMess == null || outMess.length() == 0) { 																
							ack = buildAck(msg.get(SegName.MSH));							
							break;
						}
						else{
							ack = buildAck(msg.get(SegName.MSH));
							LOG.debug("NAS response was " + outMess.toString());
							break;
						} //if (rv == NO_DATA_FOUND){					
					} // while(nasMsg != null)
				}// if (mapper == null && V231mapper == null)							
			}//if (!HL7Utils.versionSupported(msg))
			
			if (!sock.isClosed())
				sock.close();
		}
		catch (HL7Exception hex)
		{
			LOG.info("HL7Exception occured. ",hex);
			try
			{
				ack = HL7Utils.buildRejAck(msg.get(SegName.MSH), "HL7Exception : " + hex.getMessage(), HL7Errors.APP_INT_ERROR);
			}
			catch (HL7Exception e)
			{
				LOG.error(e);
			}
		}
		catch (Exception ex)
		{
			LOG.info("Exception occured. ",ex);
			try
			{
				ack = HL7Utils.buildRejAck(msg.get(SegName.MSH), "Exception : " + ex.getMessage(), HL7Errors.APP_INT_ERROR);
			}
			catch (HL7Exception e)
			{
				LOG.error(e);
			}
		}
		finally
		{
			if (mapper != null)
			{
				mapper.setConnection(null);
				ConnectionManager.getInstance().freeConnection(client);				
			}
		}

		LOG.info("Finish Processing Message. " + msg.getName());
		if (ack != null)
			LOG.debug("Outgoing message. " + ack.toString());
		else
			LOG.warn("Outgoing message is null." );

		rv = MessageReviewManager.storeMessage(msg, nasMsg, ack);
		LOG.info(rv + " message now in review store.");
		
		return ack;
	}


	private void sendResponseToNewSocket(Socket sock,Message msg,int nasError,StringBuffer outMess,boolean bLastMess) throws Exception
	{
		Message resp = msg;
		Message ack = null;
		ImsNasMsg nm = new ImsNasMsg(outMess.toString());
		
		if ((resp = this.generate(msg,nm)) == null){
			LOG.warn("Error generating Response for NO_DATA_FOUND");								
			resp = HL7Utils.buildRejAck(msg.get(SegName.MSH), "Error occured generating response",-1);								
		}
		else
		{
			if (!(msg instanceof ADT_A01) && !(msg instanceof ADT_A39)) 
			{	
				if (nasError == NO_DATA_FOUND || nasError == NO_MORE_DATA || nasError == 0 || bLastMess)
				{
					if (bNackReceived == false) 
					{
						LOG.debug("Setting QueryResultsLevel to F" );
						((QRD)resp.get("QRD")).getQueryResultsLevel().setValue("F");
					}
					else
					{
						LOG.debug("Setting QueryResultsLevel to P" );
						((QRD)resp.get("QRD")).getQueryResultsLevel().setValue("P"); //partial as there was a NACK
					}
				}
				else if (nasError > 0)
				{
					LOG.debug("Setting QueryResultsLevel to T" );
					((QRD)resp.get("QRD")).getQueryResultsLevel().setValue("T");
				}
				else if (nasError < 0)
					((MSA)resp.get("MSA")).getTextMessage().setValue("Nas Error" + nasError + " occurred sending message to EPM");
			}
		}
		LOG.debug("Sending response to remote server: nasError was " + nasError);				
		GenericParser parser = new GenericParser();			
		String msgTxt = parser.encode(resp);
		String ackTxt = ""; 
		msgTxt = msgTxt.replaceAll("\n", "\r");
		LOG.debug("Sending Message " +msgTxt);
		HL7Writer writer = new MinLLPWriter(sock.getOutputStream());
		HL7Reader reader = new MinLLPReader(sock.getInputStream());
		writer.writeMessage(msgTxt); 
		
		LOG.debug("Message sent, waiting for ACK... ");
		ackTxt = reader.getMessage();//parser.encode(resp,reader.getMessage().toString());

		ack = parser.parse(ackTxt);
		MSA msa = (MSA)ack.get("MSA");
		if (!msa.getAcknowledgementCode().getValue().equals("AA"))
		{
			LOG.debug("Received NACK: " + ackTxt);
			bNackReceived = true;
		}
		else
			LOG.debug("Received ACK: " + ackTxt);
	}

	private Message generate(Message msg,ImsNasMsg nm) throws Exception
	{				
		
		String evnCode = HL7Utils.getEventCode(msg);
		if (evnCode == null || evnCode.length() == 0)
			return null;
		
		if (evnCode.equals("A19"))
		{
			PID pid = null;
			PV1 pv1 = null;
			QRY_A19 qry = (QRY_A19)msg;
			ADR_A19 resp = new ADR_A19();
			MSH msh = resp.getMSH();
		
			getResponseMSH(resp.getMSH(),msg);
			msh.getMessageType().getMessageType().setValue("ADR");
			msh.getMessageType().getTriggerEvent().setValue(evnCode);

			copyQueryQRD(resp,qry.getQRD()); //this can't be right!
			
			int setId;
			if (nm == null) //generate empty PID for no data
			{
				pid = resp.getADR_A19_EVNPIDPD1NK1PV1PV2DB1OBXAL1DG1DRGPR1ROLGT1IN1IN2IN3ACCUB1UB2(0).getPID();			
				pid.getSetIDPID().setValue("1");
				return resp;
			}
			for (int i = 0; i < nm.getRecCount(); i++)
			{
				//(PID)
				pid = resp.getADR_A19_EVNPIDPD1NK1PV1PV2DB1OBXAL1DG1DRGPR1ROLGT1IN1IN2IN3ACCUB1UB2(i).getPID();			
				setId = ++pid_count;
				renderPIDFromNasRecord(nm.getNasRecord(i),pid,setId);
				
				//PV1
				pv1 = resp.getADR_A19_EVNPIDPD1NK1PV1PV2DB1OBXAL1DG1DRGPR1ROLGT1IN1IN2IN3ACCUB1UB2(i).getPV1();
				pv1.getSetIDPV1().setValue("" + 1);			
			}
			return resp;
		}else if (evnCode.equals("A28"))
		{
			ADT_A39 resp = new ADT_A39();
			SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmss.SSS");
			
			MRG mrg = resp.getADT_A39_PIDPD1MRGPV1(0).getMRG();
			EVN evn = resp.getEVN();
			MSH msh = resp.getMSH();
			PID pid = resp.getADT_A39_PIDPD1MRGPV1().getPID();
			
			getResponseMSH(resp.getMSH(),msg);
			msh.getMessageType().getMessageType().setValue("ADT");
			msh.getMessageType().getTriggerEvent().setValue("A39");
			
			if (nm == null)
				return null;
			
			renderPIDFromNasRecord(nm.getNasRecord(0),pid,1);
			
			//EVN
			evn.getEventTypeCode().setValue("A39");			
			evn.getDateTimePlannedEvent().getTimeOfAnEvent().setValue(sf.format(new Date()));

			//MRG
			String priorId = ((PID)msg.get("PID")).getPatientID().getID().getValue();
			mrg.getPriorAlternatePatientID(0).getID().setValue(priorId);
			//mrg.getPriorPatientID().getID().setValue("JP");
			return resp;
			
		}
		else if (evnCode.equals("A31"))
		{						
			return msg;			
		}
		return null;
	}
	
	private void renderPIDFromNasRecord(ImsNasMsg rec,PID pid,int setId) throws Exception
	{
		/* PAS EPM Server sample response:
		 * HOSPNUM:393632;CHARTNUM:     C108800;SNM:SMITH;SNMS:SMITH;FNM1:JOHN;TITLDESC:Mr;TITLTXT:
		 * Mr;PAS_SEX:M;SEX:M;DOB:19100121;ADR1:2 BAWNMORE ROAD;ADR2:KENNEDY PARK;ADR3:LIMERICK;
		 * PAS_MART:1;MART:1;PAS_AREA:1401;AREA_CODE:1401;
		 * */

		String hosp = rec.getPairVal("HOSPNUM");
		String chart = rec.getPairVal("CHARTNUM");			
		pid.getAlternatePatientIDPID(0).getID().setValue(hosp);
		pid.getAlternatePatientIDPID(0).getIdentifierTypeCode().setValue("HOSPNUM");
		if (chart != null && chart.length() > 0)
		{
			pid.getPatientID().getID().setValue(chart);
			pid.getPatientID().getIdentifierTypeCode().setValue("CHARTNUM");
		}
		else if (hosp != null)
		{
			LOG.debug("chartnum null or 0 length for hospnum " + hosp);
		}
		else
			LOG.debug("chartnum and hospnum null");
		//pid.getAlternatePatientIDPID(1).getID().setValue(chart);
		//pid.getAlternatePatientIDPID(1).getIdentifierTypeCode().setValue("CHARTNUM");
		
		pid.getSetIDPID().setValue("" + setId);
		pid.getPatientName(0).getFamilyLastName().getFamilyName().setValue(rec.getPairVal("SNM"));
		pid.getPatientName(0).getGivenName().setValue(rec.getPairVal("FNM1"));
		pid.getDateTimeOfBirth().getTimeOfAnEvent().setValue(rec.getPairVal("DOB"));
		pid.getPatientDeathDateAndTime().getTimeOfAnEvent().setValue(rec.getPairVal("DOD"));
		pid.getSex().setValue(rec.getPairVal("PAS_SEX"));
		pid.getPatientName(0).getPrefixEgDR().setValue(rec.getPairVal("TITLTXT"));		
		pid.getPatientAddress(0).getStreetAddress().setValue(rec.getPairVal("ADR1"));
		pid.getPatientAddress(0).getOtherDesignation().setValue(rec.getPairVal("ADR2"));
		pid.getPatientAddress(0).getCity().setValue(rec.getPairVal("ADR3"));
		pid.getPatientAddress(0).getStateOrProvince().setValue(rec.getPairVal("ADR4"));
		//pid.getPatientAddress(0).getZipOrPostalCode().setValue(rec.getPairVal("POST"));

	}
	
	

	private void copyQueryQRD(ADR_A19 resp,QRD qrd) throws Exception
	{		
		resp.getQRD().getQueryDateTime().getTimeOfAnEvent().setValue(qrd.getQueryDateTime().getTimeOfAnEvent().getValue());
		resp.getQRD().getQueryFormatCode().setValue(qrd.getQueryFormatCode().getValue());
		resp.getQRD().getQueryPriority().setValue(qrd.getQueryPriority().getValue());
		resp.getQRD().getQueryID().setValue(qrd.getQueryID().getValue());
		resp.getQRD().getQuantityLimitedRequest().getQuantity().setValue(qrd.getQuantityLimitedRequest().getQuantity().getValue());
		resp.getQRD().getQuantityLimitedRequest().getUnits().getIdentifier().setValue(qrd.getQuantityLimitedRequest().getUnits().getIdentifier().getValue());
		resp.getQRD().getDeferredResponseDateTime().getTimeOfAnEvent().setValue(qrd.getDeferredResponseDateTime().getTimeOfAnEvent().getValue());		 
		if (qrd.getWhoSubjectFilter().length > 0)
		{
			resp.getQRD().getWhoSubjectFilter(0).getIDNumber().setValue(qrd.getWhoSubjectFilter(0).getIDNumber().getValue());
			resp.getQRD().getWhoSubjectFilter(0).getFamilyLastName().getFamilyName().setValue(qrd.getWhoSubjectFilter(0).getFamilyLastName().getFamilyName().getValue());
			resp.getQRD().getWhoSubjectFilter(0).getGivenName().setValue(qrd.getWhoSubjectFilter(0).getGivenName().getValue());
			resp.getQRD().getWhoSubjectFilter(0).getMiddleInitialOrName().setValue(qrd.getWhoSubjectFilter(0).getMiddleInitialOrName().getValue());
			resp.getQRD().getWhoSubjectFilter(0).getSuffixEgJRorIII().setValue(qrd.getWhoSubjectFilter(0).getSuffixEgJRorIII().getValue());
		}

		if ( qrd.getWhatSubjectFilter().length > 0)
			resp.getQRD().getWhatSubjectFilter(0).getIdentifier().setValue(qrd.getWhatSubjectFilter(0).getIdentifier().getValue());
 
		if (qrd.getWhatDepartmentDataCode().length > 0)
			resp.getQRD().getWhatDepartmentDataCode(0).getIdentifier().setValue(qrd.getWhatDepartmentDataCode(0).getIdentifier().getValue());
 
		if (qrd.getWhatDataCodeValueQual().length > 0)	
			resp.getQRD().getWhatDataCodeValueQual(0).getFirstDataCodeValue().setValue(qrd.getWhatDataCodeValueQual(0).getFirstDataCodeValue().getValue());
		
		resp.getQRD().getDeferredResponseType().setValue(qrd.getDeferredResponseType().getValue());				
		resp.getQRD().getQueryResultsLevel().setValue(qrd.getQueryResultsLevel().getValue());		
	}
	
	private void getResponseMSH(/*ADR_A19resp*/MSH retMsh,Message msg) throws Exception
	{
		ca.uhn.hl7v2.model.v231.segment.MSH msh = (ca.uhn.hl7v2.model.v231.segment.MSH)msg.get("MSH");
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmss.SSS");
		//ca.uhn.hl7v2.model.v231.segment.MSH retMsh = resp.getMSH();
		
		retMsh.getEncodingCharacters().setValue(msh.getEncodingCharacters().getValue());
		retMsh.getFieldSeparator().setValue("|");
		retMsh.getSendingApplication().getNamespaceID().setValue("" + ConfigFlag.HL7.HL7_APPLICATION.getValue());
		retMsh.getSendingFacility().getNamespaceID().setValue("" + ConfigFlag.HL7.HL7_FACILITY.getValue());
		retMsh.getReceivingApplication().getNamespaceID().setValue(msh.getReceivingFacility().getNamespaceID().getValue());
		retMsh.getReceivingFacility().getNamespaceID().setValue(msh.getReceivingFacility().getNamespaceID().getValue());
		
		retMsh.getDateTimeOfMessage().getTimeOfAnEvent().setValue(sf.format(new Date()));		
		retMsh.getSequenceNumber().setValue(msh.getSequenceNumber().getValue());
		retMsh.getMessageControlID().setValue(msh.getMessageControlID().getValue());
		retMsh.getCharacterSet(0).setValue(msh.getCharacterSet(0).getValue());
		retMsh.getProcessingID().getProcessingID().setValue("" + ConfigFlag.HL7.HL7_PROCESSING_ID.getValue());
		retMsh.getVersionID().getVersionID().setValue("2.3.1");
		
	}
	
	public static ACK buildAck(Structure s) throws DataTypeException
	{
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmss.SSS"); 
		ACK ackMsg = new ACK();
		MSH retMsh = ackMsg.getMSH();
		MSA msa = ackMsg.getMSA();

		retMsh.getFieldSeparator().setValue("|");
		
		//String processingId = getConfigItem(config, ConfigItems.ProcessingID);
		//if (processingId == null)
		//	processingId = cfg.getProcessingId();
		
		retMsh.getSendingApplication().getNamespaceID().setValue(ConfigFlag.HL7.HL7_APPLICATION.getValue());
		retMsh.getSendingFacility().getNamespaceID().setValue(ConfigFlag.HL7.HL7_FACILITY.getValue()); 
		retMsh.getDateTimeOfMessage().getTimeOfAnEvent().setValue(sf.format(new Date()));		
		retMsh.getMessageType().getMessageType().setValue("ACK");
		retMsh.getProcessingID().getProcessingID().setValue(ConfigFlag.HL7.HL7_PROCESSING_ID.getValue());
		retMsh.getVersionID().getVersionID().setValue("2.3.1");		

		if (s instanceof MSH)
		{
			MSH msh = (MSH)s;			
			retMsh.getEncodingCharacters().setValue(msh.getEncodingCharacters().getValue());
			retMsh.getReceivingApplication().getNamespaceID().setValue(msh.getSendingApplication().getNamespaceID().getValue()); 
			retMsh.getReceivingFacility().getNamespaceID().setValue(msh.getSendingFacility().getNamespaceID().getValue()); 
			retMsh.getMessageControlID().setValue(msh.getMessageControlID().getValue());
			msa.getMessageControlID().setValue(msh.getMessageControlID().getValue());
		}
		else if (s instanceof ca.uhn.hl7v2.model.v231.segment.MSH)
		{
			ca.uhn.hl7v2.model.v231.segment.MSH msh = (ca.uhn.hl7v2.model.v231.segment.MSH)s;
			retMsh.getEncodingCharacters().setValue(msh.getEncodingCharacters().getValue());
			retMsh.getReceivingApplication().getNamespaceID().setValue(msh.getSendingApplication().getNamespaceID().getValue()); 
			retMsh.getReceivingFacility().getNamespaceID().setValue(msh.getSendingFacility().getNamespaceID().getValue()); 
			retMsh.getMessageControlID().setValue(msh.getMessageControlID().getValue());
			msa.getMessageControlID().setValue(msh.getMessageControlID().getValue());
		}
		
		return ackMsg;
	}

}
