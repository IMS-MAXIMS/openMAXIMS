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
package ims.hl7.domain;

import java.util.HashMap;
import java.util.Map;

import ims.admin.domain.GPAdmin;
import ims.admin.domain.HcpAdmin;
import ims.admin.domain.LookupTree;
import ims.admin.domain.MosAdmin;
import ims.admin.domain.OrganisationAndLocation;
import ims.domain.DomainSession;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.impl.DomainImplFlyweightFactory;
import ims.domain.lookups.LookupService;
import ims.framework.enumerations.SystemLogLevel;
import ims.framework.enumerations.SystemLogType;
import ims.framework.utils.DateTime;
import ims.clinical.domain.Allergies;
import ims.clinical.domain.ClinicalCoding;
import ims.clinical.domain.DischargeInpatient;
import ims.clinical.domain.HL7TTOIF;
import ims.configuration.gen.ConfigFlag;
import ims.configuration.User;
import ims.core.admin.vo.ProviderSystemRefVo;
import ims.core.domain.ADT;
import ims.core.domain.CareContextSelectDialog;
import ims.core.domain.CareSpellDialog;
import ims.core.domain.Demographics;
import ims.core.domain.HL7Query;
import ims.core.domain.PatientSearch;
import ims.core.patient.vo.PatientRefVo;
import ims.hl7.HL7Config;
import ims.hl7.domain.mapping.IMessageHandler;
import ims.hl7.domain.mapping.VoMapper;
import ims.hl7.utils.EvnCodes;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.hl7.utils.SegName;
import ims.hl7.vo.HL7InboundSaveVo;
import ims.hl7.vo.lookups.MessageType;
import ims.ocrr.vo.ProviderSystemVo;
import ims.ocs_if.domain.OcsIf;
import ims.ocs_if.domain.OcsIfInbound;
import ims.ocs_if.helper.IRefManDomainHelper;

import org.apache.log4j.Logger;
import com.jamonapi.proxy.MonProxyFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.app.Application;
import ca.uhn.hl7v2.app.ApplicationException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.message.ACK;

public class HL7EngineApplication implements Application
{
	private DomainSession			sess	= DomainSession.getSession();

	private HL7Config				cfg;
	private HL7MessageParser		parser;
	private static final Logger		LOG		= Logger.getLogger(HL7EngineApplication.class);
	
	private static Map<String, Object> voMappers = new HashMap<String, Object>();
	
	private LookupService			svc;
	private Demographics			demog;
	private ADT						adt;
	private OrganisationAndLocation	orgLoc;
	private HcpAdmin				hcpAdmin;
	private MosAdmin				mosAdmin;
	private PatientSearch			psearch;
	private OcsIfInbound			ocsIfInbound;
	private OcsIf					ocsIf;
	private GPAdmin					gpAdmin;
	private LookupTree				lookupTree;
	private CareSpellDialog			careSpellDialog;
	private DischargeInpatient		dischargeInpatient;
	private Allergies				allergy;
	private ClinicalCoding			allergen;
//	private ExternalEvents          externalEvents;	
	private IRefManDomainHelper	   RefManDomain;
	private HL7TTOIF			hl7tto;
	private CareContextSelectDialog careContextSelectDialog;
	private HL7Query				hl7query;
	
	
	public HL7EngineApplication(HL7Config cfg) throws Exception
	{
		this.cfg = cfg;
		createRequiredImpls();
		loadMapper(EvnCodes.A28);
		loadMapper(EvnCodes.A31);
		loadMapper(EvnCodes.A01);
		loadMapper(EvnCodes.A02);
		loadMapper(EvnCodes.A03);
		loadMapper(EvnCodes.A04);
		loadMapper(EvnCodes.A05);
		loadMapper(EvnCodes.A08);
		loadMapper(EvnCodes.A10);
		loadMapper(EvnCodes.A11);
		loadMapper(EvnCodes.A12);
		loadMapper(EvnCodes.A13);
		loadMapper(EvnCodes.A21);
		loadMapper(EvnCodes.A22);
		loadMapper(EvnCodes.A29);
		loadMapper(EvnCodes.A34);
		loadMapper(EvnCodes.A38);
		loadMapper(EvnCodes.A40);
		loadMapper(EvnCodes.A47);
		loadMapper(EvnCodes.A52);
		loadMapper(EvnCodes.A53);
		loadMapper(EvnCodes.A60);
		loadMapper(EvnCodes.M01);
		loadMapper(EvnCodes.M02);
		loadMapper(EvnCodes.M05);
		loadMapper(EvnCodes.R01);
		loadMapper(EvnCodes.O01);
		loadMapper(EvnCodes.O02);
		loadMapper(EvnCodes.PCG);
		loadMapper(EvnCodes.O19);
		loadMapper(EvnCodes.O20);
		loadMapper(EvnCodes.O13);
		loadMapper(EvnCodes.I12);
		loadMapper(EvnCodes.I13);
		loadMapper(EvnCodes.I14);
		
		
		parser = new HL7MessageParser();
		login();
	}
	
	private void loadMapper(String eventCode)
	{
		try
		{
			Class<?> c = Class.forName("ims.hl7.domain.mapping." + eventCode + "VoMapper");
			VoMapper mapper = (VoMapper)c.newInstance();
			mapper.setCfg(cfg);
			mapper.setSess(sess);
			setImplsOnMapper(mapper);
			voMappers.put(eventCode, mapper);
		}
		catch (ClassNotFoundException e)
		{
			LOG.warn("Vo Mapper class not found for event code " + eventCode + ". " + e.getMessage());			
		}
		catch (InstantiationException e)
		{
			LOG.warn("Could not instantiate Vo Mapper class for event code " + eventCode + ". " + e.getMessage(), e);			
		}
		catch (IllegalAccessException e)
		{
			LOG.warn("IllegalAccessException trying to instantiate Vo Mapper class for event code " + eventCode + ". " + e.getMessage(), e);			
		}
		catch (Exception e)
		{
			LOG.error("Exception occurred creating Mapper instance - " + e.getMessage());
		}
	}

	private void setImplsOnMapper(VoMapper mapper)
	{
		mapper.setSvc(svc);
		mapper.setDemog(demog);
		mapper.setADT(adt);
		mapper.setOrgLoc(orgLoc);
		mapper.setHcpAdmin(hcpAdmin);
		mapper.setMosAdmin(mosAdmin);
		mapper.setPSearch(psearch);
		mapper.setOcsIfInbound(ocsIfInbound);
		mapper.setOcsIf(ocsIf);
		mapper.setGpAdmin(gpAdmin);
		mapper.setLookupTree(lookupTree);
		mapper.setCareSpellDialog(careSpellDialog);
		mapper.setDischargeInpatient(dischargeInpatient);
		mapper.setRefManDomain(RefManDomain);
		mapper.setHL7TTO(hl7tto);
		mapper.setCareContextSelectDialog(careContextSelectDialog);
		mapper.setAllergy(allergy);
		mapper.setAllergen(allergen);
	}

	private void login() throws Exception
	{
		User user = new User();
		user.setUsername("HL7Inbound");
		sess.setUser(user);
	}

	public synchronized Message processMessage(Message msg) throws ApplicationException
	{
		LOG.debug("Start Processing Message. " + msg.getName());
		Message ack = null;
		VoMapper mapper=null;
		String ackStr = "";
		String msgStr = "";
		Boolean isFailedByProviderSystem = false; 
		
		try
		{
			//WDEV-4828, log received message at debug level, and at info if an error occurs.
			//For use later
			if (LOG.isDebugEnabled()) msgStr = parser.encode(msg);
			
			if (!versionSupported(msg))
			{
				ack = HL7Utils.buildRejAck(msg.get("MSH"), "Version " + HL7Utils.getVersion(msg) + " is not supported. ", HL7Errors.UNSUPP_VERSION);
				ackStr = parser.encode(ack);
				msgStr = parser.encode(msg);
				warn("Message Rejected: " + msg.getName() +": \n" + msgStr +  "\nwith ACK: \n" + ackStr);
				
//				saveInboundMessage(msgStr, "Message Rejected: " + msg.getName() +": \n" + msgStr +  "\nwith ACK: \n" + ackStr, null, null, null, null);
				return ack;
			}

			String evnCode = HL7Utils.getEventCode(msg);
			mapper = (VoMapper)voMappers.get(evnCode);
			if (mapper == null)
			{
				ack = HL7Utils.buildRejAck(msg.get(SegName.MSH), "No Event Handler Class found for event code " + evnCode, HL7Errors.UNSUPP_EVN_CODE);
				ackStr = parser.encode(ack);
				msgStr = parser.encode(msg);
				warn("Message Rejected: " + msg.getName() +": \n" + msgStr + "\nwith ACK: \n" + ackStr);
				
//				saveInboundMessage(msgStr, "Message Rejected: " + msg.getName() +": \n" + msgStr + "\nwith ACK: \n" + ackStr, evnCode, null, null, null);
				return ack;
			}
			
			isFailedByProviderSystem = true;
			ProviderSystemVo providerSystem = mapper.getProviderSystem(HL7Utils.getSendingApplication(msg));	
			isFailedByProviderSystem = false;
			
			mapper.processedCount++;
			
			IMessageHandler myObject = (IMessageHandler) MonProxyFactory.monitor(mapper);
			
			ack=myObject.processEvent(msg, providerSystem);	
			ackStr = parser.encode(ack);
//			saveInboundMessage(parser.encode(msg), null, evnCode, providerSystem, mapper.getPatient(msg, providerSystem), null);
			
		}
		catch (HL7Exception hex)
		{
			mapper.errorCount++;		
			mapper.lastFailedDateTime = new DateTime();
			try
			{
				mapper.lastFailedMessage = parser.encode(msg);
				ack = HL7Utils.buildRejAck(msg.get("MSH"), "HL7Exception : " + hex.getMessage(), HL7Errors.APP_INT_ERROR);
				ackStr = parser.encode(ack);
				msgStr = parser.encode(msg);
				warn("Message Rejected: " + msg.getName() +": \n" + msgStr + "\nwith ACK: \n" + ackStr);
				
//				saveInboundMessage(msgStr, "Message Rejected: " + msg.getName() +": \n" + msgStr + "\nwith ACK: \n" + ackStr, null, null, null, isFailedByProviderSystem);
			}
			catch (HL7Exception e)
			{
				throw new ApplicationException(hex.getMessage(), e);
			}
		}
		catch (Exception ex)
		{
			mapper.errorCount++;
			mapper.lastFailedDateTime = new DateTime();
			try
			{
				mapper.lastFailedMessage = parser.encode(msg);
				LOG.error(ex);
				if(ex.getMessage().equals("Index: 0, Size: 0"))
					ack = HL7Utils.buildRejAck(msg.get("MSH"), "HL7Exception : " + "Patient Not Registered", HL7Errors.APP_INT_ERROR);
				else
					ack = HL7Utils.buildRejAck(msg.get("MSH"), "HL7Exception : " + ex.getMessage(), HL7Errors.APP_INT_ERROR);
				ackStr = parser.encode(ack);
				msgStr = parser.encode(msg);
				warn("Message Rejected: " + msg.getName() +": \n" + msgStr + "\nwith ACK: \n" + ackStr);
				
//				saveInboundMessage(msgStr, "Message Rejected: " + msg.getName() +": \n" + msgStr + "\nwith ACK: \n" + ackStr, null, null, null, null);
			}
			catch (HL7Exception e)
			{
				throw new ApplicationException(ex.getMessage(), e);
			}
		}
		if (ack instanceof ACK)
		{
			ACK retAck = (ACK)ack;
			if (retAck.getMSA().getAcknowledgementCode().getValue().equals("AA"))
			{
				mapper.successCount++;
				mapper.lastSuccessDateTime = new DateTime();
				try
				{
					mapper.lastSuccessMessage = parser.encode(msg);
					ackStr = parser.encode(ack);
				}
				catch (HL7Exception e)
				{
					LOG.error(e);
				}
			}
			else 
			{
				if (retAck.getMSA().getTextMessage() != null && retAck.getMSA().getTextMessage().getValue().indexOf("connection") >= 0)
				{
					// Recurse this method again and try to re-establish the connection
					try
					{
						// Sleep before retrying
						Thread.sleep(3000);
					}
					catch (InterruptedException e){}
					ack=processMessage(msg);
					
				}
				else
				{
					mapper.errorCount++;
					mapper.lastFailedDateTime = new DateTime();
					try
					{
						mapper.lastFailedMessage = parser.encode(msg);
						ackStr = parser.encode(ack);
						msgStr = parser.encode(msg);
					}
					catch (HL7Exception e)
					{
						LOG.error(e);
					}
				}
				
				warn("Message Rejected: " + msg.getName() +": \n" + msgStr + "\nwith ACK: \n" + ackStr);
			}
		}		
			
		LOG.debug("Finish Processing Message. " + msg.getName() +": \n" + msgStr +  "\nwith ACK: \n" + ackStr);
		
		return ack;
	}

	private void saveInboundMessage(String hl7Message, String failureMessage, String messageCategory, ProviderSystemRefVo providerSistem, PatientRefVo patient, Boolean isFailedByProviderSystem) 
	{
		HL7InboundSaveVo inboundMessage = new HL7InboundSaveVo();
		
		inboundMessage.setHL7Message(hl7Message);
		inboundMessage.setFailureMessage(failureMessage);
		inboundMessage.setProviderSystem(providerSistem);
		inboundMessage.setPatient(patient);
		inboundMessage.setMessageDateTime(new DateTime());
		inboundMessage.setMessageType(MessageType.getNegativeInstance(messageCategory));
		inboundMessage.setMessageCategory(inboundMessage.getMessageType() instanceof MessageType ? inboundMessage.getMessageType().getParent() : null);
		inboundMessage.setSuccessfulOutcome((isFailedByProviderSystem != null && isFailedByProviderSystem) ? false : null);
		
		String[] validateErrors = inboundMessage.validate();
    	
    	if(validateErrors != null && validateErrors.length > 0)
    	{
    		LOG.error("HL7InboundSaveVo has validation errors - " + getErrors(validateErrors));
    		return;
    	}
		
		try 
		{
			hl7query.saveInboundHL7Message(inboundMessage);
		} 
		catch (DomainInterfaceException e1) 
		{
			LOG.error("DomainInterfaceException while trying to save HL7Inbound message.", e1);
		}
		catch (StaleObjectException e1) 
		{
			LOG.error("StaleObjectException while trying to save HL7Inbound message.", e1);
		}
	}

	private String getErrors(String[] validateErrors) 
	{
		if(validateErrors == null || validateErrors.length == 0)
			return null;
		
		String errors = "";
		
		for(int i=0; i<validateErrors.length; i++)
		{
			errors += validateErrors[i] + " ";
		}
		
		return errors;
	}

	private boolean versionSupported(Message msg) throws HL7Exception
	{
		String version = HL7Utils.getVersion(msg);
		if (version.equals("2.4"))
		{
			return true;
		}
		return false;
	}

	public boolean canProcess(Message msg)
	{
		return true;
	}

	public HL7Config getCfg()
	{
		return cfg;
	}

	public static VoMapper getVoMapper(String eventCode)
	{
		return (VoMapper)voMappers.get(eventCode);
	}
	
	public String[] getEventCodesHandled()
	{
		return  EvnCodes.getEventCodesHandled();
	}

	public HL7MessageParser getParser()
	{
		return parser;
	}

	public void setParser(HL7MessageParser parser)
	{
		this.parser = parser;
	}
	
	public int getProcessedCount(String evn)
	{
		if (evn != null && getVoMapper(evn) != null)
		{
			return getVoMapper(evn).processedCount;
		}		
		return 0;
	}

	public int getErrorCount(String evn)
	{
		if (evn != null && getVoMapper(evn) != null)
		{
			return getVoMapper(evn).errorCount;
		}		
		return 0;
	}
	
	public int getSuccessCount(String evn)
	{
		if (evn != null && getVoMapper(evn) != null)
		{
			return getVoMapper(evn).successCount;
		}		
		return 0;
	}
	
	public CareSpellDialog getCareSpellDialog()
	{
		return this.careSpellDialog;
	}
	
	public void setCareSpellDialog(CareSpellDialog careSpellDialog)
	{
		this.careSpellDialog = careSpellDialog;
	}

	private void createRequiredImpls()
	{
		try
		{
			if (svc == null)
				svc = (LookupService) getDomainImpl("ims.domain.lookups.impl.LookupServiceImpl");
	
			if (ocsIf == null)  // Required for Provider System
				ocsIf = (OcsIf) getDomainImpl("ims.ocs_if.domain.impl.OcsIfImpl");
			
			if (gpAdmin == null)
				gpAdmin = (GPAdmin) getDomainImpl("ims.admin.domain.impl.GPAdminImpl");
			
			if (orgLoc == null)
				orgLoc = (OrganisationAndLocation) getDomainImpl("ims.admin.domain.impl.OrganisationAndLocationImpl");

			if (hcpAdmin == null)
				hcpAdmin = (HcpAdmin) getDomainImpl("ims.admin.domain.impl.HcpAdminImpl");
			
			if (lookupTree == null)
				lookupTree = (LookupTree) getDomainImpl("ims.admin.domain.impl.LookupTreeImpl");

			if (adt == null)
				adt = (ADT) getDomainImpl("ims.core.domain.impl.ADTImpl");
			
			if (demog == null)
				demog = (Demographics) getDomainImpl("ims.core.domain.impl.DemographicsImpl");

			if (allergy == null)
				allergy = (Allergies) getDomainImpl("ims.clinical.domain.impl.AllergiesImpl");

			if (allergen == null)
				allergen = (ClinicalCoding) getDomainImpl("ims.clinical.domain.impl.ClinicalCodingImpl");
			
			if (psearch == null)
				psearch = (PatientSearch) getDomainImpl("ims.core.domain.impl.PatientSearchImpl");
			
			if (mosAdmin == null)
				mosAdmin = (MosAdmin) getDomainImpl("ims.admin.domain.impl.MosAdminImpl");
			
			if (ocsIfInbound == null) 
				ocsIfInbound = (OcsIfInbound) getDomainImpl("ims.ocs_if.domain.impl.OcsIfInboundImpl");
			
			if (ocsIf == null) 
				ocsIf = (OcsIf) getDomainImpl("ims.ocs_if.domain.impl.OcsIfImpl");
			
			if (careSpellDialog == null) 
				careSpellDialog = (CareSpellDialog) getDomainImpl("ims.core.domain.impl.CareSpellDialogImpl");
			
			if (dischargeInpatient == null)
				dischargeInpatient = (DischargeInpatient)getDomainImpl("ims.clinical.domain.impl.DischargeInpatientImpl");
			
			if ((RefManDomain == null)&&("CARE_UK".equals(ConfigFlag.HL7.EXTENDED_HL7_PROCESSING.getValue())))
				RefManDomain = (IRefManDomainHelper)getDomainImpl("ims.RefMan.domain.impl.ExternalEventsImpl");
			
			if(hl7tto == null)
				hl7tto=(HL7TTOIF)getDomainImpl("ims.clinical.domain.impl.HL7TTOIFImpl");
			
			if(careContextSelectDialog==null)
				careContextSelectDialog=(CareContextSelectDialog)getDomainImpl("ims.core.domain.impl.CareContextSelectDialogImpl");
			
			if(hl7query == null)
				hl7query = (HL7Query) getDomainImpl("ims.core.domain.impl.HL7QueryImpl");
				
		}
		catch (Exception e)
		{
			throw new RuntimeException("Exception occurred creating VoMapper instance - " + e.getMessage(), e);
		}
		
	}

	private Object getDomainImpl(String className) throws Exception
	{
		Class<?> implClass = Class.forName(className);
		DomainImplFlyweightFactory factory = DomainImplFlyweightFactory.getInstance();
		return factory.create(implClass, sess);
	}

	public DateTime getLastSuccesfulDateTime(String evn)
	{
		if (evn != null && getVoMapper(evn) != null)
		{
			return getVoMapper(evn).lastSuccessDateTime;
		}		
		return null;
	}

	public String getLastSuccesfulMessage(String evn)
	{
		if (evn != null && getVoMapper(evn) != null)
		{
			return getVoMapper(evn).lastSuccessMessage;
		}		
		return null;
	}

	public DateTime getLastFailedDateTime(String evn)
	{
		if (evn != null && getVoMapper(evn) != null)
		{
			return getVoMapper(evn).lastFailedDateTime;
		}		
		return null;
	}

	public String getLastFailedMessage(String evn)
	{
		if (evn != null && getVoMapper(evn) != null)
		{
			return getVoMapper(evn).lastFailedMessage;
		}		
		return null;
	}

	void warn(String warning)
	{
		LOG.warn(warning);
		adt.createSystemLogEntry(SystemLogType.HL7, SystemLogLevel.WARNING, warning);
	}

}
