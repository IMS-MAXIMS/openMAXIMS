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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import ims.admin.domain.GPAdmin;
import ims.admin.domain.HcpAdmin;
import ims.admin.domain.LookupTree;
import ims.admin.domain.MosAdmin;
import ims.admin.domain.OrganisationAndLocation;
import ims.admin.vo.ConfigPropertyVo;
import ims.admin.vo.DemographicFeedVo;
import ims.admin.vo.EDAttendanceFeedVo;
import ims.configuration.BuildInfo;
import ims.configuration.gen.ConfigFlag;
import ims.configuration.ConfigItems;
import ims.configuration.Configuration;
import ims.configuration.User;
import ims.core.admin.vo.ProviderSystemRefVo;
import ims.core.domain.ADT;
import ims.core.domain.Demographics;
import ims.core.domain.HL7Query;
import ims.core.domain.PatientSearch;
import ims.core.patient.vo.PatientRefVo;
import ims.core.vo.HcpLiteVo;
import ims.core.vo.IfPatientDocumentMessageVo;
import ims.core.vo.PatientIdCollection;
import ims.core.vo.lookups.MsgEventType;
import ims.core.vo.lookups.QueueType;
import ims.domain.DomainSession;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.impl.DomainImplFlyweightFactory;
import ims.domain.lookups.LookupService;
import ims.framework.cn.Notifier;
import ims.framework.enumerations.SystemLogLevel;
import ims.framework.enumerations.SystemLogType;
import ims.framework.utils.DateTime;
import ims.hl7.HL7Config;
import ims.hl7.domain.mapping.A01VoMapper;
import ims.hl7.domain.mapping.A03VoMapper;
import ims.hl7.domain.mapping.A08VoMapper;
import ims.hl7.domain.mapping.A10VoMapper;
import ims.hl7.domain.mapping.A11VoMapper;
import ims.hl7.domain.mapping.A13VoMapper;
import ims.hl7.domain.mapping.A28VoMapper;
import ims.hl7.domain.mapping.A31VoMapper;
import ims.hl7.domain.mapping.A40VoMapper;
import ims.hl7.domain.mapping.A47VoMapper;
import ims.hl7.domain.mapping.O01VoMapper;
import ims.hl7.domain.mapping.O02VoMapper;
import ims.hl7.domain.mapping.O19VoMapper;
import ims.hl7.domain.mapping.O20VoMapper;
import ims.hl7.domain.mapping.T02VoMapper;
import ims.hl7.domain.mapping.VoMapper;
import ims.hl7.interfaces.IHL7InterfaceComponent;
import ims.hl7.utils.EvnCodes;
import ims.hl7.utils.HL7Utils;
import ims.hl7.vo.HL7OutboundSaveVo;
import ims.hl7.vo.lookups.MessageType;
import ims.ocrr.orderingresults.vo.OcsOrderSessionRefVo;
import ims.ocrr.vo.ProviderSystemVo;
import ims.ocrr.vo.lookups.Category;
import ims.ocrr.vo.lookups.InvEventType;
import ims.ocrr.vo.lookups.OrderInvStatus;
import ims.ocrr.vo.lookups.OrderMessageStatus;
import ims.ocs_if.domain.OcsIf;
import ims.ocs_if.domain.OcsIfInbound;
import ims.ocs_if.helper.IRefManDomainHelper;
import ims.ocs_if.helper.IQueueHandler;
import ims.ocs_if.vo.Hl7OutboundRegVo;
import ims.ocs_if.vo.IfOcsOrderShortVo;
import ims.ocs_if.vo.IfOrderInvCurrentStatusVo;
import ims.ocs_if.vo.IfOrderInvestigationVo;
import ims.ocs_if.vo.IfOrderInvestigationVoCollection;
import ims.ocs_if.vo.IfOrderMessageVo;
import ims.ocs_if.vo.IfOrderMessageVoCollection;
import ims.ocs_if.vo.IfOrderSpecimenVo;
import ims.ocs_if.vo.IfOrderSpecimenVoCollection;
import ims.ocs_if.vo.IfOutOcsOrderVo;
import ims.ocs_if.vo.OrderChangeResponseVo;
import ims.ocs_if.vo.QueuedEventVo;
import ims.scheduling.vo.ExternalEventVo;
import ims.scheduling.vo.lookups.ExternalSystemEventTypes;
import ims.vo.interfaces.IHL7OutboundMessageHandler;

import org.apache.log4j.Logger;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.llp.LLPException;
import ca.uhn.hl7v2.llp.MinLLPReader;
import ca.uhn.hl7v2.llp.MinLLPWriter;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.message.ACK;
import ca.uhn.hl7v2.parser.EncodingNotSupportedException;
import ca.uhn.hl7v2.parser.PipeParser;

/**
 * Need somehow ensure only one instance of the outbound interface is ever
 * running. Once one starts, it must lock out all others.
 * 
 * @author jmacenri
 * 
 */
public class HL7EngineOutbound extends Thread implements IHL7InterfaceComponent
{
	private static final Logger LOG = Logger.getLogger(HL7EngineOutbound.class);
	private HL7Config cfg;
	private boolean isRunning = false;
	private Hl7OutboundRegVo reg = null;
	private OcsOrderSessionRefVo lastOrder = null;
	// private ExternalSystemEventRefVo lastEvent = null;
	private QueuedEventVo lastQueuedEvent = null;
	private String ipAddress;
	private String servletContext;
	private Map<String, VoMapper> voMappers = new HashMap<String, VoMapper>();

	private DomainSession sess = DomainSession.getSession();
	private O01VoMapper o01mapper;
	private A28VoMapper a28mapper;
	private A31VoMapper a31mapper;
	private A47VoMapper a47mapper;
	private A40VoMapper a40mapper;
	private A10VoMapper a10mapper;
	private O02VoMapper o02mapper;
	private O19VoMapper o19mapper;
	private O20VoMapper o20mapper;
	private T02VoMapper t02mapper;
	private A01VoMapper a01mapper;
	private A08VoMapper a08mapper;
	private A03VoMapper a03mapper;
	private A11VoMapper a11mapper;
	private A13VoMapper a13mapper;
	private HL7MessageParser parser;
	private DateTime startTime;

	private LookupService svc;
	private Demographics demog;
	private ADT adt;
	private OrganisationAndLocation orgLoc;
	private HcpAdmin hcpAdmin;
	private MosAdmin mosAdmin;
	private PatientSearch psearch;
	private OcsIfInbound ocsIfInbound;
	private OcsIf ocsIf;
	private GPAdmin gpAdmin;
	private LookupTree lookupTree;
	private IQueueHandler externalEvents;
	private IRefManDomainHelper RefManDomain;
	private Map<String, SocketPackage> providerSystemSocks = new HashMap<String, SocketPackage>();
	private HL7Query hl7query;

	public HL7EngineOutbound(String ipAddress, String servletContext) throws Exception
	{
		this.cfg = new HL7Config();
		this.ipAddress = ipAddress;
		this.servletContext = servletContext;

		cfg = new HL7Config();
		parser = new HL7MessageParser();

		loadAllMappers();
		o01mapper = (O01VoMapper) voMappers.get(EvnCodes.O01);
		if (o01mapper == null)
		{
			throw new Exception("No VoMapper found for O01");
		}
		a28mapper = (A28VoMapper) voMappers.get(EvnCodes.A28);
		if (a28mapper == null)
		{
			throw new Exception("No VoMapper found for A28");
		}
		a10mapper = (A10VoMapper) voMappers.get(EvnCodes.A10);
		if (a10mapper == null)
		{
			throw new Exception("No voMapper found for A10");
		}
		o02mapper = (O02VoMapper) voMappers.get(EvnCodes.O02);
		if (o02mapper == null)
		{
			throw new Exception("No VoMapper found for O02");
		}
		o19mapper = (O19VoMapper) voMappers.get(EvnCodes.O19);
		if (o19mapper == null)
		{
			throw new Exception("No VoMapper found for O19");
		}
		o20mapper = (O20VoMapper) voMappers.get(EvnCodes.O20);
		if (o20mapper == null)
		{
			throw new Exception("No VoMapper found for O20");
		}
		a31mapper = (A31VoMapper) voMappers.get(EvnCodes.A31);
		if (a31mapper == null)
		{
			throw new Exception("No VoMapper found for A31");
		}
		a47mapper = (A47VoMapper) voMappers.get(EvnCodes.A47);
		if (a47mapper == null)
		{
			throw new Exception("No VoMapper found for A47");
		}
		a40mapper = (A40VoMapper) voMappers.get(EvnCodes.A40);
		if (a40mapper == null)
		{
			throw new Exception("No VoMapper found for A40");
		}
		t02mapper= (T02VoMapper) voMappers.get(EvnCodes.T02);
		if (t02mapper == null)
		{
			throw new Exception("No VoMapper found for T02");
		}
		a01mapper=(A01VoMapper) voMappers.get(EvnCodes.A01);
		if(a01mapper==null)
		{
			throw new Exception("No VoMapper found for A01");
		}
		a03mapper=(A03VoMapper) voMappers.get(EvnCodes.A03);
		if(a03mapper==null)
		{
			throw new Exception("No VoMapper found for A03");
		}
		a08mapper=(A08VoMapper) voMappers.get(EvnCodes.A08);
		if(a08mapper==null)
		{
			throw new Exception("No VoMapper found for A08");
		}
		a11mapper=(A11VoMapper) voMappers.get(EvnCodes.A11);
		if(a11mapper==null)
		{
			throw new Exception("No VoMapper found for A11");
		}
		a13mapper=(A13VoMapper) voMappers.get(EvnCodes.A13);
		if(a13mapper==null)
		{
			throw new Exception("No VoMapper found for A13");
		}

		
		login();
		isRunning = true;
	}

	private void loadAllMappers()
	{
		createRequiredImpls();
		loadMapper(EvnCodes.O01);
		loadMapper(EvnCodes.A28);
		loadMapper(EvnCodes.A31);
		loadMapper(EvnCodes.A47);
		loadMapper(EvnCodes.A10);
		loadMapper(EvnCodes.O02);
		loadMapper(EvnCodes.O19);
		loadMapper(EvnCodes.O20);
		loadMapper(EvnCodes.A40);
		loadMapper(EvnCodes.T02);
		loadMapper(EvnCodes.A01);
		loadMapper(EvnCodes.A03);
		loadMapper(EvnCodes.A08);
		loadMapper(EvnCodes.A11);
		loadMapper(EvnCodes.A13);
	}

	private void loadMapper(String eventCode)
	{
		try
		{
			Class<?> c = Class.forName("ims.hl7.domain.mapping." + eventCode + "VoMapper");
			VoMapper mapper = (VoMapper) c.newInstance();
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
		mapper.setRefManDomain(RefManDomain);

	}

	public void stopRunning()
	{
		// WDEV-6776
		ocsIf.createSystemLogEntry(SystemLogType.HL7, SystemLogLevel.INFORMATION, "HL7 Outbound Engine has stopped"); // WDEV-6776
		this.interrupt();
	}

	public void startRunning()
	{
		startTime = new DateTime();
		this.start();
	}

	public void run()
	{
		LOG.warn("HL7EngineOutbound started");

		try
		{
			ocsIf = (OcsIf) getDomainImpl("ims.ocs_if.domain.impl.OcsIfImpl");
			reg = registerOutbound();
		}
		catch (Exception e)
		{
			LOG.error("Outbound registration has failed. Cannot continue. ", e);
			ocsIf.createSystemLogEntry(SystemLogType.HL7, SystemLogLevel.ERROR, "Outbound registration has failed.");

			isRunning = false;
		}
		// WDEV-6776
		if (isRunning)
			ocsIf.createSystemLogEntry(SystemLogType.HL7, SystemLogLevel.INFORMATION, "HL7 Outbound Engine has started");

		int exceptionFoundCount = 0;
		ByteArrayOutputStream bo = null;
		while (isRunning && !(isInterrupted()))
		{
			try
			{
				if ("CARE_UK".equals(ConfigFlag.HL7.EXTENDED_HL7_PROCESSING.getValue())
						||"Configured".equals(ConfigFlag.HL7.EXTENDED_HL7_PROCESSING.getValue()))
				{
					lastQueuedEvent = ocsIf.getNextQueuedEvent();
					if (lastQueuedEvent != null)
					{
						LOG.info("Processing Event " + lastQueuedEvent.getID() + " of type " + lastQueuedEvent.getQueueType());
						IHL7OutboundMessageHandler event = null;
//						event = externalEvents.getEvent(lastQueuedEvent);
						String msgText = null;
						String msgCategory = null;
						PatientRefVo patient = null;
						
						try
						{
							if (lastQueuedEvent.getQueueType() == null)
							{
								event = externalEvents.getEvent(lastQueuedEvent);
								ExternalEventVo newEvent = (ExternalEventVo) event;
								msgText = getOcsStatusMsgText(newEvent);
							}
							else if (QueueType.DEMOGRAPHICFEED.equals(lastQueuedEvent.getQueueType()))
							{
								event = externalEvents.getEvent(lastQueuedEvent);
								DemographicFeedVo feedVo = (DemographicFeedVo) event;
								if (MsgEventType.A28.equals(feedVo.getMsgType()))
								{
									msgText = generateA28Message(feedVo.getPatient(), feedVo.getProviderSystem().getHl7Application(), feedVo.getProviderSystem());
								}
								else if (MsgEventType.A31.equals(feedVo.getMsgType()))
								{
									msgText = generateA31Message(feedVo.getPatient(), feedVo.getProviderSystem().getHl7Application(), feedVo.getProviderSystem());
								}
								else if (MsgEventType.A47.equals(feedVo.getMsgType()))
								{
									msgText = generateA47Message(feedVo.getPatient(), feedVo.getProviderSystem().getHl7Application(), feedVo.getProviderSystem());
								}
								else if (MsgEventType.A40.equals(feedVo.getMsgType()))
								{
									if (feedVo.getMergeHistoryIsNotNull())
										msgText = generateA40Message(feedVo.getPatient(), feedVo.getPriorPatient(), feedVo.getMergeHistory().getPatientIds(), feedVo.getProviderSystem().getHl7Application(), feedVo.getProviderSystem());
									else
										msgText = generateA40Message(feedVo.getPatient(), feedVo.getPriorPatient(), null, feedVo.getProviderSystem().getHl7Application(), feedVo.getProviderSystem());
								}
								
								msgCategory = feedVo.getMsgType() != null ? feedVo.getMsgType().getText() : null;
								patient = feedVo.getPatient();

							}
							else if (QueueType.ORDERCHANGERESPONSE.equals(lastQueuedEvent.getQueueType()))
							{
								event = externalEvents.getEvent(lastQueuedEvent);
								OrderChangeResponseVo orderResponse = (OrderChangeResponseVo)event;
								msgText=generateOrderResponse(orderResponse);
								
								if(orderResponse.getInvestigationIsNotNull())
								{
									IfOutOcsOrderVo orderVo=ocsIfInbound.getOrderFromInv(orderResponse.getInvestigation());
									msgCategory = orderResponse.getMsgType() != null ? orderResponse.getMsgType().getText() : null;
									if(orderVo!=null)
									{
										patient= orderVo.getPatient();
									}
								}
							}
							else if (QueueType.PATIENTDOCUMENT.equals(lastQueuedEvent.getQueueType()))
							{
								event = externalEvents.getEvent(lastQueuedEvent);
								IfPatientDocumentMessageVo patientDocumentMessage = (IfPatientDocumentMessageVo)event;
								msgText=generateMDM_T02Message(patientDocumentMessage);
								if(patientDocumentMessage!=null&&patientDocumentMessage.getPatientDocumentIsNotNull())
								{
									msgCategory = patientDocumentMessage.getMsgType() != null ? patientDocumentMessage.getMsgType().getText() : null;
									patient=patientDocumentMessage.getPatientDocument().getPatient();
								}
							}
							else if (QueueType.EDATTENDANCE.equals(lastQueuedEvent.getQueueType()))
							{
								event = externalEvents.getEvent(lastQueuedEvent);
								EDAttendanceFeedVo feedVo = (EDAttendanceFeedVo)event;
								if(MsgEventType.A01.equals(feedVo.getMsgType()))
								{
									msgText=generateADT_A01Message(feedVo);
								}
								if(MsgEventType.A03.equals(feedVo.getMsgType()))
								{
									msgText=generateADT_A03Message(feedVo);
								}
								if(MsgEventType.A08.equals(feedVo.getMsgType()))
								{
									msgText=generateADT_A08Message(feedVo);
								}
								if(MsgEventType.A11.equals(feedVo.getMsgType()))
								{
									msgText=generateADT_A11Message(feedVo);
								}
								if(MsgEventType.A13.equals(feedVo.getMsgType()))
								{
									msgText=generateADT_A13Message(feedVo);
								}
							}
//							else if (QueueType.INPATIENTADT.equals(lastQueuedEvent.getQueueType()))
//							{
//								event = externalEvents.getEvent(lastQueuedEvent);
//								IfPatientDocumentMessageVo patientDocumentMessage = (IfPatientDocumentMessageVo)event;
//								msgText=generateMDM_T02Message(patientDocumentMessage);
//								if(patientDocumentMessage!=null&&patientDocumentMessage.getPatientDocumentIsNotNull())
//								{
//									msgCategory = patientDocumentMessage.getMsgType() != null ? patientDocumentMessage.getMsgType().getText() : null;
//									patient=patientDocumentMessage.getPatientDocument().getPatient();
//								}
//							}

							else
							{
								throw new HL7Exception("HL7Exception occured trying to send event for unknown/null event type.");
							}

							String resp = sendMsg(event.getProviderSystem(), null, msgText, null);
							event.setFailureMsg(null);
							event.setMessageStatus(OrderMessageStatus.SENT);
							event.setMsgText(msgText);
							event.setAckText(resp);
							event.setWasProcessed(true);
							
							saveOutboundMessage(msgText, null, msgCategory, event.getProviderSystem(), patient);

						}
						catch (IOException e)
						{
							LOG.error("IOException occurred sending message - " + e.getMessage(), e);
							event.setMessageStatus(OrderMessageStatus.FAILED);
							
							String failureMessage = "IOException sending message to IP:" + event.getProviderSystem().getIPAddress() + " PORT:" + event.getProviderSystem().getIPPort() + " - " + e.getMessage();
							event.setFailureMsg(failureMessage);
							saveOutboundMessage(msgText, failureMessage, msgCategory, event.getProviderSystem(), patient);
						}
						catch (LLPException e)
						{
							LOG.error("LLPException occurred sending message - " + e.getMessage(), e);
							event.setMessageStatus(OrderMessageStatus.FAILED);
							
							String failureMessage = "LLPException sending message to IP:" + event.getProviderSystem().getIPAddress() + " PORT:" + event.getProviderSystem().getIPPort() + " - " + e.getMessage();
							event.setFailureMsg(failureMessage);
							saveOutboundMessage(msgText, failureMessage, msgCategory, event.getProviderSystem(), patient);
						}
						catch (HL7Exception e)
						{
							LOG.error("HL7Exception occurred generating message - " + e.getMessage(), e);
							event.setMessageStatus(OrderMessageStatus.FAILED);
							event.setWasProcessed(true);
							
							String failureMessage = "HL7Exception generating ADT message - " + e.getMessage();
							event.setFailureMsg(failureMessage);
							saveOutboundMessage(msgText, failureMessage, msgCategory, event.getProviderSystem(), patient);
						}
						finally
						{
							try
							{
								// String[] errors = newEvent.validate();
								// if (errors != null)
								// throw new
								// HL7Exception("Order validation errors - " +
								// VoMapper.toDisplayString(errors));
								event = externalEvents.saveMessage(event);

							}
							catch (StaleObjectException e)
							{
								// TODO What to do here??
								LOG.error("Order has been updated by another user", e);
							}

							// if
							// (newEvent.getMessageStatus().equals(OrderMessageStatus.FAILED))
							// {
							// // Sleep for error count - 30 seconds and then
							// try the same one again
							// sleep(30000);
							// break;
							// }
						}
					}

				}

				boolean sendOMG = false;
				boolean allSpecimensAndInvestigationsReady = true;
				lastOrder = ocsIf.getNextOrder();
				if (lastOrder != null)
				{
					LOG.info("Processing OCS Order number " + lastOrder.getID_OcsOrderSession());

					IfOutOcsOrderVo newOrder = ocsIf.getOrder(lastOrder);

					IfOrderInvestigationVoCollection invs = newOrder.getInvestigations().sort();
					IfOrderSpecimenVoCollection specs = newOrder.getSpecimens();
					specs=removeProcessed(specs);
					ArrayList<Object> msgs = new ArrayList<Object>();

					for (int i = 0; i < invs.size(); i++)
					{
						IfOrderInvestigationVo inv = invs.get(i);
						if (inv.getInvestigation().getInvestigationIndex().getCategory().equals(Category.CLINICALIMAGING) && inv.getOrdInvCurrentStatus().getOrdInvStatus().equals(OrderInvStatus.ORDERED))
						{
							msgs.add(inv);
						}
						if(inv.getInvestigation().getEventType().equals(InvEventType.TIME_SERIES)&& inv.getOrdInvCurrentStatus().getOrdInvStatus().equals(OrderInvStatus.ORDERED)) //WDEV-16785
						{
							msgs.add(inv);
						}
						else if (inv.getInvestigation().getInvestigationIndex().getCategory().equals(Category.CLINICALIMAGING) && inv.getOrdInvCurrentStatus().getOrdInvStatus().equals(OrderInvStatus.ORDERED_AWAITING_APPT))
						{ // if the invs are awaiting sch then not all ready
							allSpecimensAndInvestigationsReady = false;
						}
					}
					for (int i = 0; i < specs.size(); i++)
					{
						IfOrderSpecimenVo spec = specs.get(i);
						if(spec.getInvestigations()==null ||  spec.getInvestigations().size() == 0)
						{
							ocsIf.processSpecimenWithoutInvestigations(spec);
						}
						
						
						// Only add the specimen if ready to go
//						if ((spec.getCollDateTimePlacerIsNotNull() || (spec.getIsPatientCollectIsNotNull() && spec.getIsPatientCollect().booleanValue())) && (spec.getInvestigationsIsNotNull() &&  spec.getInvestigations().size() > 0)) //WDEV-11109
						//http://jira/browse/WDEV-13444 Exclude specimens where all invs are cancelled
						if (((newOrder.getSendNumberIsNotNull()&&newOrder.getSendNumber())|| spec.getCollDateTimePlacerIsNotNull() || (spec.getIsPatientCollectIsNotNull() && spec.getIsPatientCollect().booleanValue())) && !invsMissingOrAllCancelled (spec)) //WDEV-11109
							msgs.add(spec);
						else
							allSpecimensAndInvestigationsReady = false;

					}

					DecimalFormat myFormatter = new DecimalFormat("000000000"); // Required
																				// for
																				// placer
																				// order
																				// number
					DecimalFormat dftFormatter = new DecimalFormat("G00000000");
					IfOrderMessageVoCollection msgVoColl = new IfOrderMessageVoCollection();
					IfOrderMessageVo msgVo = null;

					for (int i = 0; i < msgs.size(); i++)
					{
						msgVo = new IfOrderMessageVo();
						msgVo.setMessageStatus(OrderMessageStatus.CREATED);

						// wdev-2618 IfOutOcsOrder no longer extends orderShort
						msgVo.setOrderDetails(copyOrderInfo(newOrder));

						Object o = msgs.get(i);
						if (o instanceof IfOrderInvestigationVo)
						{
							IfOrderInvestigationVo inv = (IfOrderInvestigationVo) o;
							IfOrderInvestigationVoCollection invColl = new IfOrderInvestigationVoCollection();
							invColl.add(inv);
							msgVo.setInvestigations(invColl);
							if(inv.getInvestigation().getEventType().equals(InvEventType.TIME_SERIES))
							{
								msgVo.setPlacerOrdNum(dftFormatter.format(inv.getID_OrderInvestigation()));
								msgVo.setOrderCategory(Category.PATHOLOGY);
							}
							else
							{
								msgVo.setPlacerOrdNum(myFormatter.format(inv.getID_OrderInvestigation()));
								msgVo.setOrderCategory(Category.CLINICALIMAGING);
							}
							msgVo.setProviderSystem(ocsIf.getProviderSystem(inv.getInvestigation()));
							msgVo.setFillerNumber(inv.getFillerOrdNum());
						}
						else if (o instanceof IfOrderSpecimenVo)
						{
							IfOrderSpecimenVo spec = (IfOrderSpecimenVo) o;
							
							//WDEV-12944 check here for invs that are not cancelled or cancel request
							if(spec != null && spec.getInvestigations() != null)
							{
								spec.getInvestigations().sort();
								for(IfOrderInvestigationVo voOrdInv : spec.getInvestigations())
								{
									if(voOrdInv.getOrdInvCurrentStatusIsNotNull() &&  voOrdInv.getOrdInvCurrentStatus().getOrdInvStatusIsNotNull() && (!voOrdInv.getOrdInvCurrentStatus().getOrdInvStatus().equals(OrderInvStatus.CANCEL_REQUEST) && ! voOrdInv.getOrdInvCurrentStatus().getOrdInvStatus().equals(OrderInvStatus.CANCELLED)))
									{
										if(msgVo.getInvestigations() == null)
											msgVo.setInvestigations(new IfOrderInvestigationVoCollection());
											
										msgVo.getInvestigations().add(voOrdInv);
									}
								}
							}
							
							// WDEV-7493
							msgVo.setPlacerOrdNum(spec.getPlacerOrdNum());
							// END WDEV-7493
							msgVo.setProviderSystem(ocsIf.getProviderSystem(spec.getInvestigations().get(0).getInvestigation()));
							msgVo.setOrderCategory(Category.PATHOLOGY);
							msgVo.setFillerNumber(spec.getFillerOrdNum());
						}
						o01mapper.getProviderSystem(msgVo.getProviderSystem().getHl7Application());
						try
						{
							String mess = generateORMMessage(msgVo, newOrder);
							msgVo.setHL7Message(mess);
							exceptionFoundCount = 0;
						}
						catch (Exception e)
						{
							msgVo.setFailureMessage(e.getMessage());
							msgVo.setMessageStatus(OrderMessageStatus.FAILED);
							// Save stack trace for use later
							bo = new ByteArrayOutputStream();
							PrintStream ps = new PrintStream(bo);
							e.printStackTrace(ps);

							LOG.error("Exception occurred generating HL7Message for order id = " + msgVo.getOrderDetails().getID_OcsOrderSession() + "- " + e.getMessage(), e);
							exceptionFoundCount++;
							sleep(30000); // Sleep and try again later
						}
						// WDEV-10170 String[] errors = msgVo.validate();
						// WDEV-10170 if (errors != null)
						// WDEV-10170 throw new
						// HL7Exception("OrderMessage Validation Errors - " +
						// VoMapper.toDisplayString(errors));
						msgVoColl.add(msgVo);

						if (exceptionFoundCount > 0)
						{
							// wdev-2765 - After 3 attempts with the same
							// message, we should email error information
							// and skip this one by giving it a wasprocess value
							// of 2
							if (exceptionFoundCount == 3)
							{
								ocsIf.saveOrderAsDiscarded(msgVo.getOrderDetails());
								mailDiscardedInformation(msgVo, bo);

								exceptionFoundCount = 0;
							}
							break;
						}
					}

					try
					{
						msgVoColl = ocsIf.saveOrderMessages(msgVoColl);
					}
					catch (StaleObjectException e1)
					{
						LOG.error("Order Messages could not be saved - " + e1.getMessage(), e1);
						// wdev-2618 Update all Message records to indicate
						// failure so that they will not be sent
						for (int i = 0; i < msgVoColl.size(); i++)
						{
							msgVoColl.get(i).setMessageStatus(OrderMessageStatus.FAILED);
							msgVoColl.get(i).setFailureMessage(e1.getMessage());
						}
					}

					// If the message generation failed, we do not want to
					// attempt to send it
					if (msgVo != null && msgVo.getMessageStatusIsNotNull() && msgVo.getMessageStatus().getId() == OrderMessageStatus.FAILED.getId())
						continue;

					int msgSentCount = 0;
					for (int i = 0; i < msgVoColl.size(); i++)
					{
						msgVo = msgVoColl.get(i);
						String adtMsg = null;
						if (!msgVo.getMessageStatus().equals(OrderMessageStatus.SENT))
						{
							PatientRefVo patient = null;
							String messageCategory = null;
							
							if(msgVo.getOrderDetails() != null)
								patient = msgVo.getOrderDetails().getPatient();
							
							try
							{
								// It may be necessary to send the ADT message
								// prior
								// to the ORM message. If so, build it up and
								// send.

								ConfigPropertyVo prop = msgVo.getProviderSystem().getConfigurationProperty(ConfigItems.SendADT);
								if (prop != null && (prop.getPropertyValue().equalsIgnoreCase("YES") || prop.getPropertyValue().equalsIgnoreCase("TRUE")))
									adtMsg = generateA28Message(msgVo.getOrderDetails().getPatient(), msgVo.getProviderSystem().getHl7Application(), msgVo.getProviderSystem());

								sendMsg(msgVo.getProviderSystem(), msgVo.getPlacerOrdNum(), msgVo.getHL7Message(), adtMsg);
		
								messageCategory = getMessageCategory(msgVo.getHL7Message());
								saveOutboundMessage(msgVo.getHL7Message(), null, messageCategory, msgVo.getProviderSystem(), patient);
								// Save the msgVo again with it's updated status
								// msgVo.setHL7Message(adtMsg);
								msgVo.setFailureMessage(null);
								msgVo.setMessageStatus(OrderMessageStatus.SENT);
							}
							catch (IOException e)
							{
								LOG.error("IOException occurred sending message - " + e.getMessage(), e);
								msgVo.setMessageStatus(OrderMessageStatus.FAILED);
								
								String failureMessage = "IOException sending message to IP:" + msgVo.getProviderSystem().getIPAddress() + " PORT:" + msgVo.getProviderSystem().getIPPort() + " - " + e.getMessage();
								msgVo.setFailureMessage(failureMessage);
								saveOutboundMessage(msgVo.getHL7Message(), failureMessage, messageCategory, msgVo.getProviderSystem(), patient);
							}
							catch (LLPException e)
							{
								LOG.error("LLPException occurred sending message - " + e.getMessage(), e);
								msgVo.setMessageStatus(OrderMessageStatus.FAILED);
								
								String failureMessage = "LLPException sending message to IP:" + msgVo.getProviderSystem().getIPAddress() + " PORT:" + msgVo.getProviderSystem().getIPPort() + " - " + e.getMessage();
								msgVo.setFailureMessage(failureMessage);
								saveOutboundMessage(msgVo.getHL7Message(), failureMessage, messageCategory, msgVo.getProviderSystem(), patient);
							}
							catch (HL7Exception e)
							{
								// Could be here due to generating or sending
								// order OR adt message
								// so best keep it generic (was
								// "generating ADT")
								// May need to review exception throwing and
								// handling
								LOG.error("HL7Exception occurred sending message - " + e.getMessage(), e);
								msgVo.setMessageStatus(OrderMessageStatus.FAILED);
								
								String failureMessage = "HL7Exception sending message - " + e.getMessage();
								msgVo.setFailureMessage(failureMessage);
								saveOutboundMessage(msgVo.getHL7Message(), failureMessage, messageCategory, msgVo.getProviderSystem(), patient);
							}
							finally
							{
								try
								{
									// WDEV-10170 String[] errors =
									// msgVo.validate();
									// WDEV-10170 if (errors != null)
									// WDEV-10170 throw new
									// HL7Exception("Order validation errors - "
									// + VoMapper.toDisplayString(errors));
									msgVo = ocsIf.saveOrderMessage(msgVo);

									if (msgVo.getMessageStatus().equals(OrderMessageStatus.SENT))
									{
										IfOrderInvCurrentStatusVo vo = new IfOrderInvCurrentStatusVo();
										vo.setChangeDateTime(new DateTime());
										vo.setProcessedDateTime(new DateTime());
										vo.setChangeUser("OutboundEngine");
										vo.setOrdInvStatus(OrderInvStatus.SENT);
										vo.setStatusReason("Order has been sent");
										// For Every Investigation, Create a
										// history record
										for (int j = 0; j < msgVo.getInvestigations().size(); j++)
										{
											ocsIf.createInvestigationStatusRecord(msgVo.getInvestigations().get(j), vo);
										}
									}
								}
								catch (StaleObjectException e)
								{
									// TODO What to do here??
									LOG.error("Order has been updated by another user", e);
								}
								ConfigPropertyVo prop = msgVo.getProviderSystem().getConfigurationProperty(ConfigItems.SendOMG);

								if (prop != null && (prop.getPropertyValue().equalsIgnoreCase("TRUE")))
									sendOMG = true;

								if (msgVo.getMessageStatus().equals(OrderMessageStatus.FAILED))
								{

									if (adtMsg != null && adtMsg.length() > 0)
									{
										a28mapper.lastFailedMessage = adtMsg;// +
																			 // "\n"
																			 // +
																			 // msgVo.getHL7Message();
										a28mapper.lastFailedDateTime = new DateTime();
										a28mapper.errorCount++;
									}

									if (sendOMG)
									{
										o19mapper.lastFailedMessage = msgVo.getHL7Message();
										o19mapper.lastFailedDateTime = new DateTime();
										o19mapper.errorCount++;
									}
									else
									{
										o01mapper.lastFailedMessage = msgVo.getHL7Message();
										o01mapper.lastFailedDateTime = new DateTime();
										// Not sure about this as we're in retry
										// mode here so potentially
										// could get quite large.
										o01mapper.errorCount++;
									}

									// Sleep for error count - 30 seconds and
									// then try the same one again
									sleep(30000);
									break;
								}
								else
								{

									if (adtMsg != null && adtMsg.length() > 0)
									{
										a28mapper.lastSuccessMessage = adtMsg;// +
																			  // "\n"
																			  // +
																			  // msgVo.getHL7Message();
										a28mapper.lastSuccessDateTime = new DateTime();
										a28mapper.successCount++;
									}
									if (sendOMG)
									{
										o19mapper.lastSuccessMessage = msgVo.getHL7Message();
										o19mapper.lastSuccessDateTime = new DateTime();
										o19mapper.successCount++;
									}
									else
									{
										o01mapper.lastSuccessMessage = msgVo.getHL7Message();
										o01mapper.lastSuccessDateTime = new DateTime();
										o01mapper.successCount++;
									}
								}
							}
						}
						else
							msgSentCount++;
					}
					// After all have been processed successfully, we
					// update the order with wasProcessed = true
					if (msgVo != null && msgVo.getMessageStatus().equals(OrderMessageStatus.SENT) && (allSpecimensAndInvestigationsReady || msgVoColl.size() == msgSentCount))
					{
						try
						{
							ocsIf.updateNextOrder(lastOrder);
						}
						catch (StaleObjectException e)
						{
							// Will loop and this record will be picked up again
							LOG.error("StaleObjectException occurred updating order wasProcessed status - id = " + lastOrder.getID_OcsOrderSession(), e);
						}
					}
				}
				LOG.debug("No outstanding Orders to process - Sleeping");
				sleep(cfg.getOutboundSleepInterval() * 1000);
				checkRegistration();
			}
			catch (InterruptedException e)
			{
				isRunning = false;
				LOG.warn("InterruptedException occurred in HL7 Outbound Interface. - " + e.getMessage());
			}
			catch (Exception e)
			{
				LOG.error("Exception occurred during outbound register check - " + e.getMessage(), e);

				// wdev-2737 If it is a connection issue, we want to retry
				// establish the connection
				if (e instanceof DomainRuntimeException)
				{
//					String msg = e.getMessage();
					// Can't necessarily rely on content of exception, different
					// platforms etc. Safer to just reconnect anyway.
					// if (msg.indexOf("connection") >= 0) // DB Connection
					// issue - try again
					// {
					// WDEV-8923
					try
					{
						sleep(30000); // Sleep and try again later
					}
					catch (InterruptedException e2)
					{
						isRunning = false;
						LOG.warn("InterruptedException occurred in HL7 Outbound Interface. - " + e2.getMessage());
					}
					continue;
					// }
				}
			}

		}
		LOG.warn("HL7EngineOutbound Terminating");
		try
		{
			deregister();
		}
		catch (Exception e)
		{
			LOG.error("Deregistration failed.", e);
		}
	}

	private IfOrderSpecimenVoCollection removeProcessed(
			IfOrderSpecimenVoCollection specs) {
		
//		for (IfOrderSpecimenVo ifOrderSpecimenVo : specs)
//		{
//			if(Boolean.TRUE.equals(ifOrderSpecimenVo.getWasProcessed()))
//			{
//				specs.remove(ifOrderSpecimenVo);
//			}
//		}
//		
		
		
		
		
		for (Iterator<IfOrderSpecimenVo> it = specs.iterator(); it.hasNext(); )
		{
		    if (Boolean.TRUE.equals(it.next().getWasProcessed()))
		    {
		        it.remove();
		    }
		}
		
		
		return specs;
	}

	private String generateMDM_T02Message(IfPatientDocumentMessageVo event) throws HL7Exception 
	{
		t02mapper.processedCount++;
		try
		{
			// IfOutOcsOrderVo orderVo= ocsIf.getOrder(order);
			Message msg = t02mapper.populateMDM_T02Message(event);
			if (msg != null)
			{
				String ret = parser.encode(msg);
				t02mapper.successCount++;
				t02mapper.lastSuccessDateTime = new DateTime();
				t02mapper.lastSuccessMessage = ret;

				return ret;
			}
		}
		catch (Exception e)
		{
			t02mapper.errorCount++;
			t02mapper.lastFailedDateTime = new DateTime();
			throw new HL7Exception("Exception occurred generating T02 Message for HL7App - " + event.getProviderSystem().getHl7Application() + " - " + e.getMessage(), e);
		}
		t02mapper.errorCount++;
		t02mapper.lastFailedDateTime = new DateTime();
		throw new HL7Exception("A null message cannot be parsed!");
	}
	

	
	private String generateADT_A01Message(EDAttendanceFeedVo event) throws HL7Exception 
	{
		a01mapper.processedCount++;
		try
		{
			Message msg = a01mapper.populateMessage(event);
			if (msg != null)
			{
				String ret = parser.encode(msg);
				a01mapper.successCount++;
				a01mapper.lastSuccessDateTime = new DateTime();
				a01mapper.lastSuccessMessage = ret;

				return ret;
			}
		}
		catch (Exception e)
		{
			a01mapper.errorCount++;
			a01mapper.lastFailedDateTime = new DateTime();
			throw new HL7Exception("Exception occurred generating A01 Message for HL7App - " + event.getProviderSystem().getHl7Application() + " - " + e.getMessage(), e);
		}
		a01mapper.errorCount++;
		a01mapper.lastFailedDateTime = new DateTime();
		throw new HL7Exception("A null message cannot be parsed!");
	}


	
	private String generateADT_A03Message(EDAttendanceFeedVo event) throws HL7Exception 
	{
		a03mapper.processedCount++;
		try
		{
			Message msg =a03mapper.populateMessage(event);
			if (msg != null)
			{
				String ret = parser.encode(msg);
				a03mapper.successCount++;
				a03mapper.lastSuccessDateTime = new DateTime();
				a03mapper.lastSuccessMessage = ret;

				return ret;
			}
		}
		catch (Exception e)
		{
			a03mapper.errorCount++;
			a03mapper.lastFailedDateTime = new DateTime();
			throw new HL7Exception("Exception occurred generating A03 Message for HL7App - " + event.getProviderSystem().getHl7Application() + " - " + e.getMessage(), e);
		}
		a03mapper.errorCount++;
		a03mapper.lastFailedDateTime = new DateTime();
		throw new HL7Exception("A null message cannot be parsed!");
	}

	private String generateADT_A08Message(EDAttendanceFeedVo event) throws HL7Exception 
	{
		a08mapper.processedCount++;
		try
		{
			// IfOutOcsOrderVo orderVo= ocsIf.getOrder(order);
			Message msg = null;//a08mapper.populateMessage(event);
			if (msg != null)
			{
				String ret = parser.encode(msg);
				a08mapper.successCount++;
				a08mapper.lastSuccessDateTime = new DateTime();
				a08mapper.lastSuccessMessage = ret;

				return ret;
			}
		}
		catch (Exception e)
		{
			a08mapper.errorCount++;
			a08mapper.lastFailedDateTime = new DateTime();
			throw new HL7Exception("Exception occurred generating A08 Message for HL7App - " + event.getProviderSystem().getHl7Application() + " - " + e.getMessage(), e);
		}
		a08mapper.errorCount++;
		a08mapper.lastFailedDateTime = new DateTime();
		throw new HL7Exception("A null message cannot be parsed!");
	}

	private String generateADT_A13Message(EDAttendanceFeedVo event) throws HL7Exception 
	{
		a13mapper.processedCount++;
		try
		{
			Message msg = a13mapper.populateMessage(event);
			if (msg != null)
			{
				String ret = parser.encode(msg);
				a13mapper.successCount++;
				a13mapper.lastSuccessDateTime = new DateTime();
				a13mapper.lastSuccessMessage = ret;

				return ret;
			}
		}
		catch (Exception e)
		{
			a13mapper.errorCount++;
			a13mapper.lastFailedDateTime = new DateTime();
			throw new HL7Exception("Exception occurred generating A13 Message for HL7App - " + event.getProviderSystem().getHl7Application() + " - " + e.getMessage(), e);
		}
		a13mapper.errorCount++;
		a13mapper.lastFailedDateTime = new DateTime();
		throw new HL7Exception("A null message cannot be parsed!");
	}

	
	private String generateADT_A11Message(EDAttendanceFeedVo event) throws HL7Exception 
	{
		a11mapper.processedCount++;
		try
		{
			// IfOutOcsOrderVo orderVo= ocsIf.getOrder(order);
			Message msg = a11mapper.populateMessage(event);
			if (msg != null)
			{
				String ret = parser.encode(msg);
				a11mapper.successCount++;
				a11mapper.lastSuccessDateTime = new DateTime();
				a11mapper.lastSuccessMessage = ret;

				return ret;
			}
		}
		catch (Exception e)
		{
			a11mapper.errorCount++;
			a11mapper.lastFailedDateTime = new DateTime();
			throw new HL7Exception("Exception occurred generating A11 Message for HL7App - " + event.getProviderSystem().getHl7Application() + " - " + e.getMessage(), e);
		}
		a11mapper.errorCount++;
		a11mapper.lastFailedDateTime = new DateTime();
		throw new HL7Exception("A null message cannot be parsed!");
	}
	

	private String getMessageCategory(String hl7Message)
	{
		if(hl7Message == null)
			return null;
		
		String evnCode = null;
		PipeParser parser = new PipeParser();
		Message msg;
		
		hl7Message = hl7Message.replaceAll("\n", "\r");
		try
		{
			msg = parser.parse(hl7Message);
			if(msg != null)
				evnCode = HL7Utils.getEventCode(msg);
		}
		catch (EncodingNotSupportedException e)
		{
			return null;
		}
		catch (HL7Exception e)
		{
			return null;
		}	
		
		return evnCode;
	}

	private void mailDiscardedInformation(IfOrderMessageVo msgVo, ByteArrayOutputStream bo)
	{
		StringBuffer sb = new StringBuffer();
		sb.append("\nHL7 Message generation has failed after 3 attempts, this order will be skipped. (wasDiscarded set to true) \n\n");
		sb.append("Order Details\n");
		sb.append("Order Id: ").append(msgVo.getOrderDetails().getID_OcsOrderSession()).append("\n");
		sb.append("Failure Message: ").append(msgVo.getFailureMessage()).append("\n\n");

		BuildInfo buildInfo = Configuration.getBuildInfo();
		if (buildInfo != null)
		{
			sb.append(buildInfo.getName() + " Version " + buildInfo.getAppVersion() + " (" + buildInfo.getAppTimestamp() + ")\n");
			sb.append("War File Version " + buildInfo.getWarVersion() + " (" + buildInfo.getWarTimestamp() + ")\n");
			sb.append("Framework Version " + buildInfo.getFrameworkVersionInfo() + " (" + buildInfo.getFrameworkTimestamp() + ")\n");
			sb.append("Domain Version " + buildInfo.getDomainVersionInfo() + " (" + buildInfo.getDomainTimestamp() + ")\n");
			sb.append("Base Version " + buildInfo.getBaseVersionInfo() + " (" + buildInfo.getBaseTimestamp() + ")\n\n");
		}

		sb.append("Application Context: ").append(ConfigFlag.APP_CONTEXT_NAME.getValue()).append("\n");
		sb.append("Host Name: ").append(ConfigFlag.HOST_NAME.getValue()).append("\n");
		sb.append("Database: ").append(ConfigFlag.DBNAME.getValue()).append("\n");
		sb.append("Server Start Time: ").append(ConfigFlag.START_TIME.getValue()).append("\n\n");

		sb.append("Exception Stack Trace\n");
		sb.append("-----------------------\n");
		if (bo != null)
			sb.append(bo.toString());

		Notifier mail = new Notifier(sb.toString());
		mail.start();

	}

	/**
	 * Temporary code to re-open socket for each message to see if this sorts
	 * connectivity problem to ICAN
	 * 
	 * @param msgVo
	 * @param adtMsg
	 * @throws LLPException
	 * @throws IOException
	 * @throws UnknownHostException
	 */
	private String sendMsg(ProviderSystemVo provider, String placerOrdNum, String hl7Message, String adtMsg) throws LLPException, UnknownHostException, IOException, HL7Exception
	{
		Socket sock = null;
		MinLLPWriter writer = null;
		MinLLPReader hreader = null;
		PipeParser parser = new PipeParser();
		Message resp_msg = null;
		String resp = null;

		LOG.info("Sending HL7 Order Message with Placer Order No. = " + placerOrdNum + ".");// Record
																							// No.
																							// =
																							// "
																							// +
																							// msgVo.getID_OrderMessage());

		try
		{
			// WDEV-6541
			if (ConfigFlag.HL7.PERSISTENT_HL7_OUTBOUND_CONNECTION.getValue() == true)
			{
				if (providerSystemSocks == null)
					providerSystemSocks = new HashMap<String, SocketPackage>();

				SocketPackage pck = (SocketPackage) providerSystemSocks.get(provider.getHl7Application());
				if (pck == null)
				{
					sock = new Socket(provider.getIPAddress(), provider.getIPPort().intValue());
					sock.setKeepAlive(true); // wdev-6707
					writer = new MinLLPWriter(sock.getOutputStream());
					hreader = new MinLLPReader(sock.getInputStream());
					providerSystemSocks.put(provider.getHl7Application(), new SocketPackage(sock, writer, hreader));
				}
				else
				{
					sock = pck.getSocket();
					writer = pck.getWriter();
					hreader = pck.getReader();
				}

				if (!sock.isConnected())
				{
					LOG.warn("Socket is not connected! Will Re-establish connection before sending message");
					sock.connect(sock.getLocalSocketAddress());
					if (!sock.isConnected())
					{
						LOG.warn("Socket Re-connect did not work! Re-create socket");
						sock = new Socket(provider.getIPAddress(), provider.getIPPort().intValue());
						sock.setKeepAlive(true); // wdev-6707
					}
					writer = new MinLLPWriter(sock.getOutputStream());
					hreader = new MinLLPReader(sock.getInputStream());
					providerSystemSocks.put(provider.getHl7Application(), new SocketPackage(sock, writer, hreader));
				}

			}
			else
			{
				sock = new Socket(provider.getIPAddress(), provider.getIPPort().intValue());
				writer = new MinLLPWriter(sock.getOutputStream());
				hreader = new MinLLPReader(sock.getInputStream());
			}

			if (adtMsg != null)
			{
				LOG.info("Sending HL7 ADT Message with placer Order No. = " + placerOrdNum);

				writer.writeMessage(adtMsg);

				// WDEV-5927 - Now controlled by flag HL7_OUTBOUND_READ_RESP
				if (ConfigFlag.HL7.HL7_OUTBOUND_READ_RESP.getValue())
				{
					resp = hreader.getMessage();
					if (resp == null || resp.equals(""))
					{
						throw new IOException("Failed to read response message");
					}
					resp_msg = parser.parse(resp);

					if (!(resp_msg instanceof ACK))
					{
						throw new HL7Exception("Invalid HL7 response message received. Was not an ACK message");
					}
					ACK ack = (ACK) resp_msg;
					String respCode = ack.getMSA().getAcknowledgementCode().getValue();
					String respText = ack.getMSA().getTextMessage().getValue();

					// WDEV-5927
					// ClearSpan sends messages that mess up xml display.... so
					// get rid.
					if (respText != null)
					{
						respText = respText.replace("<", "");
						respText = respText.replace(">", "");
					}
					else
						respText = "NA";
					if (!respCode.equals("AA"))
					{
						// WDEV-6541
						if (!ConfigFlag.HL7.PERSISTENT_HL7_OUTBOUND_CONNECTION.getValue() == true)
						{
							hreader.close();
							writer.close();
							sock.close();
						}
						throw new HL7Exception("Negative acknowledgement received for ADT. Response code was " + respCode + ", " + respText);
					}
				}

				// WDEV-6541
				if (!ConfigFlag.HL7.PERSISTENT_HL7_OUTBOUND_CONNECTION.getValue() == true)
				{
					hreader.close();
					writer.close();
					sock.close();

					sock = new Socket(provider.getIPAddress(), provider.getIPPort().intValue());
					writer = new MinLLPWriter(sock.getOutputStream());
					hreader = new MinLLPReader(sock.getInputStream());
				}
			}

			writer.writeMessage(hl7Message);

			// TODO: JME: 20061110: Would rather do the following commented out
			// code, but ICAN
			// is not returning actual ACK messages so not possible. Need to
			// review why not

			// WDEV-5927 - Now controlled by flag HL7_OUTBOUND_READ_RESP
			if (ConfigFlag.HL7.HL7_OUTBOUND_READ_RESP.getValue())
			{
				resp = hreader.getMessage();
				if (resp == null || resp.equals(""))
				{
					throw new IOException("Failed to read response message");
				}
				resp_msg = parser.parse(resp);

				if (!(resp_msg instanceof ACK))
				{
					throw new HL7Exception("Invalid HL7 response message received. Was not an ACK message");
				}
				ACK ack = (ACK) resp_msg;
				String respCode = ack.getMSA().getAcknowledgementCode().getValue();
				String respText = ack.getMSA().getTextMessage().getValue();

				// WDEV-5927
				// ClearSpan sends messages that mess up xml display.... so get
				// rid.
				if (respText != null)
				{
					respText = respText.replace("<", "");
					respText = respText.replace(">", "");
				}
				else
					respText = "NA";
				if (!respCode.equals("AA"))
				{
					// WDEV-6541
					if (!ConfigFlag.HL7.PERSISTENT_HL7_OUTBOUND_CONNECTION.getValue() == true)
					{
						hreader.close();
						writer.close();
						sock.close();
					}
					throw new HL7Exception("Negative acknowledgement received for Order. Response code was " + respCode + ", " + respText);
				}
			}

			// WDEV-6541
			if (!ConfigFlag.HL7.PERSISTENT_HL7_OUTBOUND_CONNECTION.getValue() == true)
			{
				hreader.close();
				writer.close();
				sock.close();
			}
		}
		catch (IOException e)
		{
			//http://jira/browse/WDEV-12346
			if (e.getMessage().startsWith("Connection reset") || e.getMessage().toUpperCase().indexOf("BROKEN") >= 0 || // Broken
																																// Pipe
			e.getMessage().toUpperCase().indexOf("CONNECTION ABORT") >= 0) // wdev-6707
			{
				// Socket reset, try to re-establish connection once
				LOG.error("IOException - connection was reset (will try to re-establish connection) - " + e.getMessage(), e);
				sock = new Socket(provider.getIPAddress(), provider.getIPPort().intValue());
				sock.setKeepAlive(true); // wdev-6707
				writer = new MinLLPWriter(sock.getOutputStream());
				hreader = new MinLLPReader(sock.getInputStream());

				// WDEV-6541
				if (ConfigFlag.HL7.PERSISTENT_HL7_OUTBOUND_CONNECTION.getValue() == true)
					providerSystemSocks.put(provider.getHl7Application(), new SocketPackage(sock, writer, hreader));

				if (adtMsg != null)
				{
					writer.writeMessage(adtMsg);
					resp = hreader.getMessage();
					if (resp == null || resp.equals(""))
					{
						throw new IOException("Failed to read response message");
					}
					parser.parse(resp);

					// WDEV-6541
					if (!ConfigFlag.HL7.PERSISTENT_HL7_OUTBOUND_CONNECTION.getValue() == true)
					{
						hreader.close();
						writer.close();
						sock.close();

						sock = new Socket(provider.getIPAddress(), provider.getIPPort().intValue());
						writer = new MinLLPWriter(sock.getOutputStream());
						hreader = new MinLLPReader(sock.getInputStream());
					}
				}

				writer.writeMessage(hl7Message);
				resp = hreader.getMessage();
				if (resp == null || resp.equals(""))
				{
					throw new IOException("Failed to read response message");
				}
				parser.parse(resp);

				// WDEV-6541
				if (!ConfigFlag.HL7.PERSISTENT_HL7_OUTBOUND_CONNECTION.getValue() == true)
				{
					hreader.close();
					writer.close();
					sock.close();
				}
			}
			else
			{
				// wdev-6707
				// Some other type of IOException occurred, close the socket and
				// remove from provider hashmap
				// this will force a new socket to be established on retry
				try
				{
					if (sock != null)
						sock.close();
				}
				catch (IOException ex)
				{ /* Half Expected */}

				if (providerSystemSocks != null)
				{
					SocketPackage pck = (SocketPackage) providerSystemSocks.get(provider.getHl7Application());
					if (pck != null)
						providerSystemSocks.remove(provider.getHl7Application());
				}

				LOG.error("IOException occurred sending message - socket issue -  " + e.getMessage(), e);

				throw e;
			}
		}
		catch (EncodingNotSupportedException e)
		{
			throw new HL7Exception("Invalid HL7 response message received after sending outbound message.", e);
		}
		return resp;
	}

	// private void processResponse(Message resp_msg) throws HL7Exception
	// {
	// if (ConfigFlag.HL7.HL7_OUTBOUND_READ_RESP.getValue())
	// {
	// if (!(resp_msg instanceof ACK))
	// {
	// throw new
	// HL7Exception("Invalid HL7 response message received. Was not an ACK message");
	// }
	// ACK ack = (ACK)resp_msg;
	// String respText = "";
	// String respCode = ack.getMSA().getAcknowledgementCode().getValue();
	// respText = ack.getMSA().getTextMessage().getValue();
	//
	// //WDEV-5927
	// //ClearSpan sends messages that mess up xml display.... so get rid.
	// if (respText != null)
	// {
	// respText = respText.replace("<","");
	// respText = respText.replace(">","");
	// }
	// else
	// respText = "NA";
	// if (!respCode.equals("AA"))
	// {
	// throw new HL7Exception("Response code was " + respCode + ", " +
	// respText);
	// }
	// }
	// }

	private void deregister() throws Exception
	{
		if (reg == null)
			throw new Exception("This outbound thread instance has never been registered. It cannot continue.");

		reg.validate();
		ocsIf.deregisterOutbound(reg);
	}

	private Hl7OutboundRegVo registerOutbound() throws Exception
	{
		Hl7OutboundRegVo vo = new Hl7OutboundRegVo();
		vo.setIpAddress(this.ipAddress);
		vo.setServletContext(this.servletContext);
		vo.setRegDateTime(new DateTime());
		vo.setLastUpdated(vo.getRegDateTime());

		vo.validate();
		vo = ocsIf.registerOutbound(vo);
		return vo;
	}

	private IfOcsOrderShortVo copyOrderInfo(IfOutOcsOrderVo newOrder)
	{
		IfOcsOrderShortVo orderShort = new IfOcsOrderShortVo(newOrder.getID_OcsOrderSession(), newOrder.getBoVersion());
		orderShort.setPatient(newOrder.getPatient());
		orderShort.setOrderedBy(newOrder.getOrderedBy());
		orderShort.setPatientClinic(newOrder.getPatientClinic());
		orderShort.setPatientLocation(newOrder.getPatientLocation());
		if (newOrder.getResponsibleClinician()!=null) //http://jira/browse/WDEV-12682 changed from PukkaJ enabled
		{
			HcpLiteVo hcp = new HcpLiteVo(newOrder.getResponsibleClinician().getID_Hcp(), newOrder.getResponsibleClinician().getBoVersion());
			hcp.setHcpType(newOrder.getResponsibleClinician().getHcpType());
			hcp.setMos(newOrder.getResponsibleClinician().getMos());
			orderShort.setResponsibleClinician(hcp);
		}
		orderShort.setResponsibleGp(newOrder.getResponsibleGp());
		// wdev-3035
		orderShort.setAdditClinNotes(newOrder.getAdditClinNotes());
		orderShort.setSendNumber(newOrder.getSendNumber());
		
		return orderShort;

	}

	private void checkRegistration() throws Exception
	{
		if (reg == null)
			throw new Exception("This outbound thread instance has never been registered. It cannot continue.");

		reg.setLastUpdated(new DateTime());
		reg.validate();
		reg = ocsIf.updateOutboundRegistration(reg);
	}

	private String generateOrderStatusChangeMessage(ExternalEventVo event) throws HL7Exception
	{
		o01mapper.processedCount++;
		try
		{
			Message msg = o01mapper.populateStatusChangeRadiologyMessage(event);
			if (msg != null)
			{
				String ret = parser.encode(msg);
				o01mapper.successCount++;
				o01mapper.lastSuccessDateTime = new DateTime();
				o01mapper.lastSuccessMessage = ret;

				return ret;
			}
		}
		catch (Exception e)
		{
			o01mapper.errorCount++;
			o01mapper.lastFailedDateTime = new DateTime();
			throw new HL7Exception("Exception occurred generating ORM Message for HL7App - " + event.getProviderSystem().getHl7Application() + " - " + e.getMessage(), e);
		}
		o01mapper.errorCount++;
		o01mapper.lastFailedDateTime = new DateTime();
		throw new HL7Exception("A null message cannot be parsed!");

	}

	private String generateOrderResponseMessage(ExternalEventVo event) throws HL7Exception
	{
		// private String generateOrderResponseMessage(PatientRefVo patient,
		// LocationRefVo patientLocation, OcsOrderRefVo order, ProviderSystemVo
		// providerSystem)throws HL7Exception {
		o02mapper.processedCount++;
		try
		{
			// IfOutOcsOrderVo orderVo= ocsIf.getOrder(order);
			Message msg = o02mapper.populateOrderResponseMessage(event);
			if (msg != null)
			{
				String ret = parser.encode(msg);
				o02mapper.successCount++;
				o02mapper.lastSuccessDateTime = new DateTime();
				o02mapper.lastSuccessMessage = ret;

				return ret;
			}
		}
		catch (Exception e)
		{
			o02mapper.errorCount++;
			o02mapper.lastFailedDateTime = new DateTime();
			throw new HL7Exception("Exception occurred generating ORR Message for HL7App - " + event.getProviderSystem().getHl7Application() + " - " + e.getMessage(), e);
		}
		o02mapper.errorCount++;
		o02mapper.lastFailedDateTime = new DateTime();
		throw new HL7Exception("A null message cannot be parsed!");

	}

	// private String generateA10Message(PatientRefVo patient,LocationRefVo
	// patLoc,ProviderSystemVo provider)throws HL7Exception
	private String generateA10Message(ExternalEventVo newEvent) throws HL7Exception
	{
		Message message;
		a10mapper.processedCount++;
		try
		{
			message = a10mapper.populateMessage(newEvent);
			if (message != null)
			{
				String ret = parser.encode(message);
				a10mapper.successCount++;
				a10mapper.lastSuccessDateTime = new DateTime();
				a10mapper.lastSuccessMessage = ret;

				return ret;
			}
		}
		catch (Exception e)
		{
			a10mapper.errorCount++;
			a10mapper.lastFailedDateTime = new DateTime();
			throw new HL7Exception("Exception occurred generating A10 Message for HL7App - " + " - " + e.getMessage(), e);
		}

		a10mapper.errorCount++;
		a10mapper.lastFailedDateTime = new DateTime();
		throw new HL7Exception("generateA10Message: A null message cannot be parsed!");
	}

	private String generateORMMessage(IfOrderMessageVo msgVo, IfOutOcsOrderVo newOrder) throws Exception
	{
		LOG.info("Generating HL7 for Order Message with Placer Order No. = " + msgVo.getPlacerOrdNum() + ". Record No. + " + msgVo.getID_OrderMessage());

		ConfigPropertyVo prop = msgVo.getProviderSystem().getConfigurationProperty(ConfigItems.SendOMG);
		Message msg = null;
		msg = o01mapper.populateMessage(msgVo, newOrder);
		if (prop != null && (prop.getPropertyValue().equalsIgnoreCase("YES") || prop.getPropertyValue().equalsIgnoreCase("TRUE")))
		{
			o19mapper.processedCount++;
			if (msg != null)
			{
				String ret = parser.encode(msg);
				ret = ret.replace("|ORM^O01|", "|OMG^O19|");
				o19mapper.successCount++;
				o19mapper.lastSuccessDateTime = new DateTime();
				o19mapper.lastSuccessMessage = ret;
				return ret;
			}
			else
			{
				o19mapper.errorCount++;
				o19mapper.lastFailedDateTime = new DateTime();
				throw new HL7Exception("A null message cannot be parsed!");
			}
		}
		else
		{
			o01mapper.processedCount++;
			// Message msg = o01mapper.populateMessage(msgVo, newOrder);
			if (msg != null)
			{
				String ret = parser.encode(msg);
				o01mapper.successCount++;
				o01mapper.lastSuccessDateTime = new DateTime();
				o01mapper.lastSuccessMessage = ret;
				return ret;
			}
			else
			{
				o01mapper.errorCount++;
				o01mapper.lastFailedDateTime = new DateTime();
				throw new HL7Exception("A null message cannot be parsed!");
			}
		}
	}

	private String generateOrderResponse(OrderChangeResponseVo responseVo)throws Exception
	{

		ConfigPropertyVo prop = responseVo.getProviderSystem().getConfigurationProperty(ConfigItems.SendOMG);
		Message msg = null;
		msg = o02mapper.populateOrderResponseMessage(responseVo);
		if (prop != null && (prop.getPropertyValue().equalsIgnoreCase("YES") || prop.getPropertyValue().equalsIgnoreCase("TRUE")))
		{
			o20mapper.processedCount++;
			if (msg != null)
			{
				String ret = parser.encode(msg);
				ret = ret.replace("|ORR^O02|", "|ORG^O20|");
				o20mapper.successCount++;
				o20mapper.lastSuccessDateTime = new DateTime();
				o20mapper.lastSuccessMessage = ret;
				return ret;
			}
			else
			{
				o20mapper.errorCount++;
				o20mapper.lastFailedDateTime = new DateTime();
				throw new HL7Exception("A null message cannot be parsed!");
			}
		}
		else
		{
			o02mapper.processedCount++;
			// Message msg = o01mapper.populateMessage(msgVo, newOrder);
			if (msg != null)
			{
				String ret = parser.encode(msg);
				o02mapper.successCount++;
				o02mapper.lastSuccessDateTime = new DateTime();
				o02mapper.lastSuccessMessage = ret;
				return ret;
			}
			else
			{
				o02mapper.errorCount++;
				o02mapper.lastFailedDateTime = new DateTime();
				throw new HL7Exception("A null message cannot be parsed!");
			}
		}
	}
	private String generateA28Message(PatientRefVo patient, String hl7Application, ProviderSystemVo providerSystem) throws HL7Exception
	{
		Message msg;
		a28mapper.processedCount++;
		try
		{
			msg = a28mapper.populateMessage(patient, hl7Application, providerSystem);
			if (msg != null)
			{
				String ret = parser.encode(msg);
				a28mapper.successCount++;
				a28mapper.lastSuccessDateTime = new DateTime();
				a28mapper.lastSuccessMessage = ret;
				return ret;
			}
		}
		catch (Exception e)
		{
			a28mapper.errorCount++;
			a28mapper.lastFailedDateTime = new DateTime();
			throw new HL7Exception("Exception occurred generating ADT Message for HL7App - " + hl7Application + " - " + e.getMessage(), e);
		}

		a28mapper.errorCount++;
		a28mapper.lastFailedDateTime = new DateTime();
		throw new HL7Exception("generateA28Message: A null message cannot be parsed!");
	}

	private String generateA31Message(PatientRefVo patient, String hl7Application, ProviderSystemVo providerSystem) throws HL7Exception
	{
		Message msg;
		a31mapper.processedCount++;
		try
		{
			msg = a31mapper.populateMessage(patient, hl7Application, providerSystem);
			if (msg != null)
			{
				String ret = parser.encode(msg);
				a31mapper.successCount++;
				a31mapper.lastSuccessDateTime = new DateTime();
				a31mapper.lastSuccessMessage = ret;
				return ret;
			}
		}
		catch (Exception e)
		{
			a31mapper.errorCount++;
			a31mapper.lastFailedDateTime = new DateTime();
			throw new HL7Exception("Exception occurred generating ADT Message for HL7App - " + hl7Application + " - " + e.getMessage(), e);
		}

		a31mapper.errorCount++;
		a31mapper.lastFailedDateTime = new DateTime();
		throw new HL7Exception("generateA31Message: A null message cannot be parsed!");
	}

	private String generateA47Message(PatientRefVo patient, String hl7Application, ProviderSystemVo providerSystem) throws HL7Exception
	{
		Message msg;
		a47mapper.processedCount++;
		try
		{
			msg = a47mapper.populateMessage(patient, hl7Application, providerSystem);
			if (msg != null)
			{
				String ret = parser.encode(msg);
				a47mapper.successCount++;
				a47mapper.lastSuccessDateTime = new DateTime();
				a47mapper.lastSuccessMessage = ret;
				return ret;
			}
		}
		catch (Exception e)
		{
			a47mapper.errorCount++;
			a47mapper.lastFailedDateTime = new DateTime();
			throw new HL7Exception("Exception occurred generating ADT Message for HL7App - " + hl7Application + " - " + e.getMessage(), e);
		}

		a47mapper.errorCount++;
		a47mapper.lastFailedDateTime = new DateTime();
		throw new HL7Exception("generateA47Message: A null message cannot be parsed!");
	}

	
	
	
	private String generateA40Message(PatientRefVo patient, PatientRefVo priorPatient, PatientIdCollection priorPatIds, String hl7Application, ProviderSystemVo providerSystem) throws HL7Exception
	{
		Message msg;
		a40mapper.processedCount++;
		try
		{
			msg = a40mapper.populateMessage(patient, priorPatient, priorPatIds, hl7Application, providerSystem);
			if (msg != null)
			{
				String ret = parser.encode(msg);
				a40mapper.successCount++;
				a40mapper.lastSuccessDateTime = new DateTime();
				a40mapper.lastSuccessMessage = ret;
				return ret;
			}
		}
		catch (Exception e)
		{
			a40mapper.errorCount++;
			a40mapper.lastFailedDateTime = new DateTime();
			throw new HL7Exception("Exception occurred generating ADT Message for HL7App - " + hl7Application + " - " + e.getMessage(), e);
		}

		a40mapper.errorCount++;
		a40mapper.lastFailedDateTime = new DateTime();
		throw new HL7Exception("generateA40Message: A null message cannot be parsed!");
	}

	private String getOcsStatusMsgText(ExternalEventVo newEvent) throws HL7Exception
	{
		String msgText = null;
		if (newEvent != null)
		{
			if (newEvent.getEventType().equals(ExternalSystemEventTypes.PATIENTARRIVING))
			{
				msgText = generateA10Message(newEvent);
			}
			else if (newEvent.getEventType().equals(ExternalSystemEventTypes.CANCELORDER))
			{
				msgText = generateOrderStatusChangeMessage(newEvent);
			}
			else if (newEvent.getEventType().equals(ExternalSystemEventTypes.UPDATEORDER))
			{
				msgText = generateOrderStatusChangeMessage(newEvent);
			}
			else if (newEvent.getEventType().equals(ExternalSystemEventTypes.PATIENTDNA))
			{
				msgText = generateOrderStatusChangeMessage(newEvent);
			}

			else if (newEvent.getEventType().equals(ExternalSystemEventTypes.ALLOCATEORDERNUMBER))
			{
				msgText = generateOrderResponseMessage(newEvent);
			}
			else if (newEvent.getEventType().equals(ExternalSystemEventTypes.ACKCANCELREQUEST))
			{
				msgText = generateOrderResponseMessage(newEvent);
			}
			else if (newEvent.getEventType().equals(ExternalSystemEventTypes.CANCELAPPOINTMENT))
			{
				msgText = generateOrderStatusChangeMessage(newEvent);
			}
		}
		return msgText;
	}

	private void login() throws Exception
	{
		User user = new User();
		user.setUsername("HL7Outbound");
		sess.setUser(user);
	}

	private Object getDomainImpl(String className) throws Exception
	{
		Class<?> implClass = Class.forName(className);
		DomainImplFlyweightFactory factory = DomainImplFlyweightFactory.getInstance();
		return factory.create(implClass, sess);
	}

	public boolean isRunning()
	{
		return isRunning;
	}

	public DateTime getStartTime()
	{
		return startTime;
	}

	private void createRequiredImpls()
	{
		try
		{
			if (svc == null)
				svc = (LookupService) getDomainImpl("ims.domain.lookups.impl.LookupServiceImpl");

			if (ocsIf == null) // Required for Provider System
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

			if (psearch == null)
				psearch = (PatientSearch) getDomainImpl("ims.core.domain.impl.PatientSearchImpl");

			if (mosAdmin == null)
				mosAdmin = (MosAdmin) getDomainImpl("ims.admin.domain.impl.MosAdminImpl");

			if (ocsIfInbound == null)
				ocsIfInbound = (OcsIfInbound) getDomainImpl("ims.ocs_if.domain.impl.OcsIfInboundImpl");

			if (ocsIf == null)
				ocsIf = (OcsIf) getDomainImpl("ims.ocs_if.domain.impl.OcsIfImpl");
			
			if ((externalEvents == null) && ("CARE_UK".equals(ConfigFlag.HL7.EXTENDED_HL7_PROCESSING.getValue())))
				externalEvents = (IQueueHandler) getDomainImpl("ims.RefMan.domain.impl.ExternalEventsImpl");
			if ("Configured".equals(ConfigFlag.HL7.EXTENDED_HL7_PROCESSING.getValue()))
				externalEvents = (IQueueHandler) getDomainImpl("ims.ocs_if.domain.impl.OcsIfImpl");
			
			if ((RefManDomain == null) && ("CARE_UK".equals(ConfigFlag.HL7.EXTENDED_HL7_PROCESSING.getValue())))
				RefManDomain = (IRefManDomainHelper) getDomainImpl("ims.RefMan.domain.impl.ExternalEventsImpl");
			
			if(hl7query == null)
				hl7query = (HL7Query) getDomainImpl("ims.core.domain.impl.HL7QueryImpl");

		}
		catch (Exception e)
		{
			throw new RuntimeException("Exception occurred creating VoMapper instance - " + e.getMessage(), e);
		}

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

	public String[] getEventCodesHandled()
	{
		return new String[] { EvnCodes.A10, EvnCodes.A28, EvnCodes.A31,EvnCodes.A47, EvnCodes.A40, EvnCodes.O01, EvnCodes.O02, EvnCodes.O19, EvnCodes.O20,EvnCodes.T02 };
	}

	public int getSuccessfulCount(String evn)
	{
		if (evn != null && getVoMapper(evn) != null)
		{
			return getVoMapper(evn).successCount;
		}
		return 0;
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

	private VoMapper getVoMapper(String eventCode)
	{
		return voMappers.get(eventCode);
	}

	public String getIpAddress()
	{
		// TODO Auto-generated method stub
		return null;
	}
	 
	private void saveOutboundMessage(String hl7Message, String failureMessage, String messageCategory, ProviderSystemRefVo providerSistem, PatientRefVo patient) 
	{
		HL7OutboundSaveVo outboundMessage = new HL7OutboundSaveVo();
		
		outboundMessage.setHL7Message(hl7Message);
		outboundMessage.setFailureMessage(failureMessage);
		outboundMessage.setProviderSystem(providerSistem);
		outboundMessage.setPatient(patient);
		outboundMessage.setMessageSentDateTime(new DateTime());
		outboundMessage.setMessageType(MessageType.getNegativeInstance(messageCategory));
		outboundMessage.setMessageCategory(outboundMessage.getMessageType() instanceof MessageType ? outboundMessage.getMessageType().getParent() : null);
		
		String[] validateErrors = outboundMessage.validate();
    	
    	if(validateErrors != null && validateErrors.length > 0)
    	{
    		LOG.error("HL7OutboundVo has validation errors - " + getErrors(validateErrors));
    		return;
    	}
		
		try 
		{
			hl7query.saveOutboundHL7Message(outboundMessage);
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
	
	//http://jira/browse/WDEV-13444 
	private boolean invsMissingOrAllCancelled(IfOrderSpecimenVo spec)
	{
		boolean allCancelled=true;
		if(spec!=null&&spec.getInvestigationsIsNotNull())
		{
			for(IfOrderInvestigationVo voOrdInv : spec.getInvestigations())
			{
				if(voOrdInv.getOrdInvCurrentStatusIsNotNull() &&  voOrdInv.getOrdInvCurrentStatus().getOrdInvStatusIsNotNull() && (!voOrdInv.getOrdInvCurrentStatus().getOrdInvStatus().equals(OrderInvStatus.CANCEL_REQUEST) && ! voOrdInv.getOrdInvCurrentStatus().getOrdInvStatus().equals(OrderInvStatus.CANCELLED)))
				{
					allCancelled=false;
					break;
				}
			}
		}
		return allCancelled;
	}
}

class SocketPackage
{
	private Socket socket;
	private MinLLPWriter writer;
	private MinLLPReader reader;

	public SocketPackage(Socket socket, MinLLPWriter writer, MinLLPReader reader)
	{
		this.socket = socket;
		this.writer = writer;
		this.reader = reader;
	}

	public Socket getSocket()
	{
		return socket;
	}

	public MinLLPWriter getWriter()
	{
		return writer;
	}

	public MinLLPReader getReader()
	{
		return reader;
	}
}
