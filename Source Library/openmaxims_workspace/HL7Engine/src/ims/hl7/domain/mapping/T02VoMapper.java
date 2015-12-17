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
package ims.hl7.domain.mapping;


import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.log4j.Logger;

import ims.configuration.ConfigItems;
import ims.configuration.gen.ConfigFlag;
import ims.core.vo.IfPatientDocumentMessageVo;
import ims.core.vo.IfPatientDocumentVo;
import ims.core.vo.MemberOfStaffShortVo;
import ims.core.vo.Patient;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.utils.DateTime;
import ims.framework.utils.DateTimeFormat;
import ims.hl7.domain.EventResponse;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.ocrr.vo.ProviderSystemVo;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.Varies;
import ca.uhn.hl7v2.model.v24.datatype.ST;
import ca.uhn.hl7v2.model.v24.message.MDM_T02;
import ca.uhn.hl7v2.model.v24.segment.OBX;
import ca.uhn.hl7v2.model.v24.segment.PID;
import ca.uhn.hl7v2.model.v24.segment.PV1;
import ca.uhn.hl7v2.model.v24.segment.TXA;

public class T02VoMapper extends VoMapper {
	
	private static final Logger			LOG		= Logger.getLogger(T02VoMapper.class);

	@Override
	public Message populateMessage() {
		return null;
	}

	@Override
	//WDEV-20112
//	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception 
	public EventResponse processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception 
	{
		EventResponse response = new EventResponse();
		
		PID pid = null;
		pid = (PID) msg.get("PID");
		Patient patVo = getPrimaryIdFromPid(pid, providerSystem);
		try
		{
			Patient patVo2 = getDemog().getPatient(patVo);
			response.setPatient(patVo2);
		}
		catch (StaleObjectException e)
		{
			response.setMessage(HL7Utils.buildRejAck(msg.get("MSH"), "Exception: " + e.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
			return response;
		}
		response.setMessage(HL7Utils.buildRejAck(msg.get("MSH"), "Exception: Inbound T02 message types not currently processed by application!", HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
		return response; //WDEV-20112	
	}

	public Message populateMDM_T02Message(IfPatientDocumentMessageVo event) throws Exception
	{
		LOG.debug("T02VoMapper populateMDM_T02Message: entry");
		
		//http://jira/browse/WDEV-19913
		String useISO_SECSStr = HL7Utils.getConfigItem(toConfigItemArray(event.getProviderSystem().getConfigItems()), ConfigItems.RenderTSAsISO_SECS);
		boolean useISO_SECS = useISO_SECSStr != null && (useISO_SECSStr.equalsIgnoreCase("TRUE") || useISO_SECSStr.equalsIgnoreCase("YES"))?true:false;
		
		 MDM_T02 message = new MDM_T02();
		

		 IfPatientDocumentVo patientDocument = null;
		 String codeSystem =null;

		 // Sanity checks first
		 if (event.getProviderSystem()==null||event.getProviderSystem().getCodeSystem()==null)
		 {
			 throw new Exception("Provider system or code system is null");
		 }
		 codeSystem =event.getProviderSystem().getCodeSystem().getText();
		 
		 if(event.getPatientDocumentIsNotNull())
		 {
			 patientDocument = event.getPatientDocument();
		 }
		 else 
		 {
			 throw new Exception("Null patient document cannot be processed");
		 }
		 
		 if(patientDocument.getServerDocument()==null)
		 {
			 throw new Exception("Null server document cannot be processed for patient document:"+patientDocument.getID_PatientDocument());
		 }

		 if(patientDocument.getServerDocument().getFileName()==null)
		 {
			 throw new Exception("Null file name cannot be processed for patient document:"+patientDocument.getID_PatientDocument());
		 }

		 
		 //copy the document
		 File srcFile = new File(patientDocument.getServerDocument().getFileName());
		 if(srcFile==null)
		 {
			 throw new Exception("Null file object cannot be processed for patient document:"+patientDocument.getID_PatientDocument());
		 }
		 String srcFileName = srcFile.getName();
		 URL url=null;
		 try{
			 url = new URL(ConfigFlag.GEN.FILE_SERVER_URL.getValue()+patientDocument.getServerDocument().getFileName());
		 }
		 catch (Exception e) {
			 LOG.warn("MALFormed URL", e);
		 }
		 File destDir = new File (ConfigFlag.HL7.HL7_MDM_DOCUMENT_SHARE.getValue());
		 if(!destDir.exists())
			 LOG.warn("HL7 MDM Document Share does not exist: Check value of HL7_MDM_DOCUMENT_SHARE flag.");
		 try
		 {
			 File destFile = new File(destDir,srcFileName);
			 if(!destFile.exists())
			 {
				 org.apache.commons.io.FileUtils.copyURLToFile(url, destFile);
			 }
		 }
		 catch(IOException ioe)
		 {
			 LOG.warn("Could not copy Patient document: "+
					 srcFile.toString()+" to Outbound Document share: "+
					 destDir, ioe);
		 }
		 
		 
		 
		//populate the message
		//WDEV-19913
		 if(useISO_SECS)
		 {
			 populateMSH( event.getProviderSystem(),  message.getMSH(),Long.toString( new java.util.Date().getTime()),"MDM","T02",DateTimeFormat.ISO_SECS);
		 }
		 else
		 {
			 populateMSH( event.getProviderSystem(),  message.getMSH(),Long.toString( new java.util.Date().getTime()),"MDM","T02");
		 }
		
		if(event.getPatientDocument()==null||!event.getID_PatientDocumentMessageQueueIsNotNull())
		{
			throw new Exception("T02: no patient document for event"+event.getID_PatientDocumentMessageQueue());
		}
		
		renderPatientVoToPID(patientDocument.getPatient(), message.getPID(), event.getProviderSystem());
		
		PV1 pv1 =  message.getPV1();
		pv1.getPatientClass().setValue("U");
		if(patientDocument.getSpecialtyIsNotNull())
		{
			pv1.getHospitalService().setValue(svc.getRemoteLookup(patientDocument.getSpecialty().getId(),codeSystem));
		}
		
		TXA txa= message.getTXA(); 
		
		// TXA-1
		txa.getSetIDTXA().setValue("1");
		
		
		// TXA-2
		if(event.getPatientDocumentIsNotNull()&&event.getPatientDocument().getCategoryIsNotNull())
		{
			txa.getDocumentType().setValue(svc.getRemoteLookup(patientDocument.getCategory().getId(),codeSystem));
		}
		

		// TXA-3
		txa.getDocumentContentPresentation().setValue("AP");
		
		
		//TXA-4
		//http://jira/browse/WDEV-19913
		DateTime authoringdt = patientDocument.getAuthoringDateTime();
		if(useISO_SECS)
		{
			renderDateTimeVoToTS(authoringdt, txa.getActivityDateTime(),DateTimeFormat.ISO_SECS);
		}
		else
		{
			renderDateTimeVoToTS(authoringdt, txa.getActivityDateTime());
		}
		
		
		//TXA-5
		if (patientDocument.getResponsibleHCPIsNotNull())
		{
			MemberOfStaffShortVo mos =  patientDocument.getResponsibleHCP().getMos();
			//WDEV-21000
//			renderMemberOfStaffShortVoToXCNNatCode(mos, txa.getPrimaryActivityProviderCodeName(0), event.getProviderSystem());
			if (ConfigFlag.HL7.USE_CONFIGURED_TAXONOMYTYPES_FOR_XCN.getValue())
			{
				renderMemberOfStaffShortVoToPrimaryActivityProviderCodeName(mos, txa, event.getProviderSystem());
			}
			else
			{
				renderMemberOfStaffShortVoToXCNNatCode(mos, txa.getPrimaryActivityProviderCodeName(0), event.getProviderSystem());
			}
		}
		
		//TXA-6
		//Not used
		
		//TXA-7
		//http://jira/browse/WDEV-19913
		DateTime transcribedt = patientDocument.getRecordingDateTime();
		if(useISO_SECS)
		{
			renderDateTimeVoToTS(transcribedt, txa.getTranscriptionDateTime(),DateTimeFormat.ISO_SECS);
		}
		else
		{
			renderDateTimeVoToTS(transcribedt, txa.getTranscriptionDateTime());
		}
		
		
		//TXA-8
		//Not used
		
		//TXA-9
		if (patientDocument.getAuthoringHCPIsNotNull())
		{
			MemberOfStaffShortVo mos =  patientDocument.getAuthoringHCP().getMos();
			//WDEV-21000
//			renderMemberOfStaffShortVoToXCNNatCode(mos, txa.getOriginatorCodeName(0), event.getProviderSystem());
			if (ConfigFlag.HL7.USE_CONFIGURED_TAXONOMYTYPES_FOR_XCN.getValue())
			{
				renderMemberOfStaffShortVoToOriginatorCodeName(mos, txa, event.getProviderSystem());
			}
			else
			{
				renderMemberOfStaffShortVoToXCNNatCode(mos, txa.getOriginatorCodeName(0), event.getProviderSystem());
			}
		}

		//TXA-10
		//Not used
		
		//TXA-11
		if (patientDocument.getRecordingUserIsNotNull())
		{
			MemberOfStaffShortVo mos =  patientDocument.getRecordingUser();
			//WDEV-21000
//			renderMemberOfStaffShortVoToXCN(mos, txa.getTranscriptionistCodeName(0), event.getProviderSystem());
			if (ConfigFlag.HL7.USE_CONFIGURED_TAXONOMYTYPES_FOR_XCN.getValue())
			{
				renderMemberOfStaffShortVoToTranscriptionistCodeName(mos, txa, event.getProviderSystem());
			}
			else
			{
				renderMemberOfStaffShortVoToXCN(mos, txa.getTranscriptionistCodeName(0), event.getProviderSystem());
			}
		}
		
		//TXA-12
		txa.getUniqueDocumentNumber().getEntityIdentifier().setValue(patientDocument.getID_PatientDocument().toString());
		
		//TXA-13
		if(patientDocument.getNameIsNotNull())
		{
			txa.getParentDocumentNumber().getEntityIdentifier().setValue(patientDocument.getName());
		}
		
		//TXA-14 TXA-15
		//Not used
		
		//TXA-16
		if (patientDocument.getServerDocumentIsNotNull())
		{
			txa.getUniqueDocumentFileName().setValue(srcFileName);
		}
		
		//TXA-17
		txa.getDocumentCompletionStatus().setValue("AU");
		
		

		OBX obx = message.getOBX();
		obx.getSetIDOBX().setValue("1");
		obx.getValueType().setValue("RP");
		obx.getObservationIdentifier().getIdentifier().setValue("1");
		if (patientDocument.getServerDocumentIsNotNull())
		{
			ST st = new ST();
			st.setValue(srcFileName);
			Varies value = obx.getObservationValue(0);
			value.setData(st);
		}
		obx.getObservationResultStatus().setValue("F");
		
		LOG.debug("T02VoMapper populateMDM_T02Message: exit");
		return message;

	}
	
	
}
