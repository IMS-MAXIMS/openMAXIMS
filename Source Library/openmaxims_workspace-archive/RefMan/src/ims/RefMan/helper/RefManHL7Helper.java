package ims.RefMan.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;

import ims.admin.vo.ConfigPropertyVo;
import ims.RefMan.domain.ExternalEvents;
import ims.RefMan.domain.objects.CatsReferral;
import ims.RefMan.domain.objects.OrderInvAppt;
import ims.RefMan.vo.IFCATSExternalEventVo;
import ims.configuration.gen.ConfigFlag;
import ims.configuration.ConfigItems;
import ims.core.documents.domain.objects.PatientDocument;
import ims.core.documents.domain.objects.ServerDocument;
import ims.core.generic.domain.objects.PersonName;
import ims.core.patient.domain.objects.Patient;
import ims.core.resource.people.domain.objects.Hcp;
import ims.core.resource.people.domain.objects.MemberOfStaff;
import ims.core.resource.people.vo.HcpRefVo;
import ims.core.vo.PersonAddress;
import ims.core.vo.lookups.DocumentCategory;
import ims.core.vo.lookups.FileType;
import ims.core.vo.lookups.PreActiveActiveInactiveStatus;
import ims.core.vo.lookups.ReferralManagementContractType;
import ims.domain.DomainFactory;
import ims.domain.DomainInterface;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.impl.DomainImpl;
import ims.framework.utils.Date;
import ims.framework.utils.DateTime;
import ims.framework.utils.DateTimeFormat;
import ims.framework.utils.FileUpload;
import ims.framework.utils.Time;
import ims.hl7.utils.HL7Utils;
import ims.ocrr.orderingresults.domain.objects.OrderInvestigation;
import ims.ocrr.orderingresults.domain.objects.OrderedInvestigationStatus;
import ims.ocrr.orderingresults.domain.objects.ResultDetails;
import ims.ocrr.orderingresults.vo.OrderInvestigationRefVo;
import ims.ocrr.vo.lookups.OrderInvStatus;
import ims.ocrr.vo.lookups.ResultDetailsType;
import ims.ocs_if.helper.IHL7Helper;
import ims.ocs_if.vo.IfOrderInvCurrentStatusVo;
import ims.ocs_if.vo.IfOrderInvestigationVo;
import ims.ocs_if.vo.IfOrderMessageVo;
import ims.ocs_if.vo.IfOutOcsOrderVo;
import ims.scheduling.domain.objects.Appointment_Status;
import ims.scheduling.domain.objects.Booking_Appointment;
import ims.scheduling.vo.Booking_AppointmentRefVo;
import ims.scheduling.vo.lookups.Status_Reason;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v24.datatype.TS;
import ca.uhn.hl7v2.model.v24.datatype.XAD;
import ca.uhn.hl7v2.model.v24.group.ORU_R01_ORCOBRNTECTDOBXNTEFT1CTI;
import ca.uhn.hl7v2.model.v24.message.ORM_O01;
import ca.uhn.hl7v2.model.v24.message.ORR_O02;
import ca.uhn.hl7v2.model.v24.message.ORU_R01;
import ca.uhn.hl7v2.model.v24.segment.OBR;
import ca.uhn.hl7v2.model.v24.segment.ORC;
import ca.uhn.hl7v2.model.v24.segment.PID;
import ca.uhn.hl7v2.model.v24.segment.PV1;
public class RefManHL7Helper extends DomainImpl implements IHL7Helper {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger			LOG		= Logger.getLogger(RefManHL7Helper.class);

	public ORM_O01 PopulateOrderMessage(ORM_O01 order, IfOrderMessageVo msgVo,
			 IfOrderInvestigationVo inv,
			DomainInterface domObj ) throws DataTypeException, HL7Exception
			{

		IFCATSExternalEventVo catsEventVo = null;
		
		PV1 pv = order.getORM_O01_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1().getORM_O01_PV1PV2().getPV1();
		PID pid = order.getORM_O01_PIDPD1NTEPV1PV2IN1IN2IN3GT1AL1().getPID();
		ORC orc = order.getORM_O01_ORCOBRRQDRQ1RXOODSODTNTECTDDG1OBXNTEFT1CTIBLG(0).getORC();
		//OBR obr = order.getORM_O01_ORCOBRRQDRQ1RXOODSODTNTECTDDG1OBXNTEFT1CTIBLG(0).getORM_O01_OBRRQDRQ1RXOODSODTNTECTDDG1OBXNTE().getOBR();
		
		
		//Get the OBR if there is one already in the order but don't create one 
		// the status change messages should not contain any obrs
		OBR obr = null;
		if(0!= order.getORM_O01_ORCOBRRQDRQ1RXOODSODTNTECTDDG1OBXNTEFT1CTIBLG(0).getORM_O01_OBRRQDRQ1RXOODSODTNTECTDDG1OBXNTE().getAll("OBR").length)
			obr = order.getORM_O01_ORCOBRRQDRQ1RXOODSODTNTECTDDG1OBXNTEFT1CTIBLG(0).getORM_O01_OBRRQDRQ1RXOODSODTNTECTDDG1OBXNTE().getOBR();
	
		
		
		
		
		if(domObj  instanceof ExternalEvents)
		{
			ExternalEvents eventObject = (ExternalEvents)domObj;
			
			//If it is a new order then we don't bother with the appointment status
			if(orc.getOrderControl().getValue().equals("NW") ) 
			{
				catsEventVo=eventObject.getCATSIFValues( inv,false );
				
				if (/*ConfigFlag.GEN.PUKKAJ_ENABLED.getValue()&&*/catsEventVo==null)
				{
					return order;
				}
				//else if (ConfigFlag.GEN.PUKKAJ_ENABLED.getValue()&&catsEventVo.getAppointmentID()==null)
				else if (catsEventVo.getContractType()!=null
						&&catsEventVo.getContractType().equals(ReferralManagementContractType.DIAGNOSTIC)
						&&catsEventVo.getAppointmentID()==null)
					
				{
					String appointmentParentLocationCode = catsEventVo.getAppointmentParentLocationCode();
					if(appointmentParentLocationCode!=null)
						pv.getAssignedPatientLocation().getPointOfCare().setValue(appointmentParentLocationCode);
					
					boolean rebookWithFullXO=false;
					if(msgVo!=null&&msgVo.getProviderSystem()!=null)
					{
						ConfigPropertyVo prop= msgVo.getProviderSystem().getConfigurationProperty(ConfigItems.RebookApptWithCancelandFullXO);
						if (prop != null && (prop.getPropertyValueIsNotNull())&&(prop.getPropertyValue().length() > 0)
								&&(prop.getPropertyValue().trim().equalsIgnoreCase("TRUE")||prop.getPropertyValue().trim().equalsIgnoreCase("YES")))
						{
							rebookWithFullXO=true;
						}
					}
					if (rebookWithFullXO&&catsEventVo.getContractId()!=null)
						pv.getTemporaryLocation().getLocationStatus().setValue(catsEventVo.getContractId());

					return order;
				}
				
			}
			else
			{
				catsEventVo=eventObject.getCATSIFValues( inv,true );
			}
		if(null== catsEventVo)
			throw new HL7Exception("No appointment details found for schedulable service : "+inv.toString());


		String apptID=catsEventVo.getAppointmentID();
		String referralID=catsEventVo.getReferralID();
		String transportArranged = catsEventVo.getTransportArranged();
		String interperterRequired=catsEventVo.getInterperterRequired();
		String commentsOnTransport=catsEventVo.getCommentsOnTransport();
		String documentType = catsEventVo.getDocumentType();
		String documentPath=catsEventVo.getDocumentPath();
		String documentFormat=catsEventVo.getDocumentFormat();
		DateTime startTimeVo = catsEventVo.getStartDateTime();
		DateTime endTimeVo = catsEventVo.getEndDateTime();
		String appointmentStatusCode = catsEventVo.getAppointmentStatusCode();
		String appointmentStatusComment = catsEventVo.getAppointmentStatusComment();
		String appointmentLocationCode = catsEventVo.getAppointmentLocationCode();
		String appointmentParentLocationCode = catsEventVo.getAppointmentParentLocationCode();
		
		DateTime referralDate = catsEventVo.getReferralCreationDate();
		String UBRN = catsEventVo.getUBRN();
		String contractId = catsEventVo.getContractId();
		
		//http://jira/browse/WDEV-9646
		if(msgVo!=null&&msgVo.getProviderSystem()!=null)
		{
			ConfigPropertyVo prop= msgVo.getProviderSystem().getConfigurationProperty(ConfigItems.UseGpAsOrderingProvider);
			if (prop != null && (prop.getPropertyValueIsNotNull())&&(prop.getPropertyValue().length() > 0)
					&&prop.getPropertyValue().trim().equalsIgnoreCase("TRUE"))
			{
				String gpPracticeName = catsEventVo.getPracticeName();
				String gpPracticeCode = catsEventVo.getPracticeCode();
				PersonAddress parcticeAddress = catsEventVo.getPracticeAddress();
			
				XAD practiceAddressHL7 = orc.getOrderingProviderAddress(0);
				renderAddressVoToXAD(parcticeAddress,practiceAddressHL7);
				practiceAddressHL7.getStreetAddress().getDwellingNumber().setValue(gpPracticeName);
				practiceAddressHL7.getAddressRepresentationCode().setValue(gpPracticeCode);
			}
		}
		
				
		pv.getPreadmitNumber().getID().setValue(apptID);
		if (UBRN!=null)
		{
			pv.getPreadmitNumber().getCheckDigit().setValue(UBRN);
		}
		
		//PV1.11
		pv.getTemporaryLocation().getPointOfCare().setValue(appointmentLocationCode);
		
		if(contractId!=null)
		{
			pv.getTemporaryLocation().getLocationStatus().setValue(contractId);
		}
		
		if(catsEventVo!=null&&catsEventVo.getContractType()!=null&&
				catsEventVo.getContractType().equals(ReferralManagementContractType.DIAGNOSTIC))
		{
			//pv1.3
			if(appointmentParentLocationCode!=null)
				pv.getAssignedPatientLocation().getPointOfCare().setValue(appointmentParentLocationCode);
			//pv1.44
			if (referralDate!=null)
				renderDateTimeVoToTS(referralDate,pv.getAdmitDateTime());
		}
		pid.getPatientAccountNumber().getID().setValue(referralID);
		
		
		renderDateTimeVoToTS(startTimeVo, orc.getQuantityTiming(0).getStartDateTime());
		renderDateTimeVoToTS(endTimeVo, orc.getQuantityTiming(0).getEndDateTime());
		
		//ORC-16
		if(null!=appointmentStatusCode)
			orc.getOrderControlCodeReason().getIdentifier().setValue(appointmentStatusCode);
		if(null!=appointmentStatusComment)
			orc.getOrderControlCodeReason().getText().setValue(HL7Utils.toHL7Text (appointmentStatusComment));

		
		if(null!=obr)
		{
			obr.getTransportArranged().setValue(transportArranged);
			obr.getEscortRequired().setValue(interperterRequired);
			obr.getPlannedPatientTransportComment(0).getIdentifier().setValue(commentsOnTransport);
			obr.getPlacerSupplementalServiceInformation(0).getIdentifier().setValue(documentType);
			obr.getPlacerSupplementalServiceInformation(0).getText().setValue(documentPath);
			obr.getPlacerSupplementalServiceInformation(0).getNameOfCodingSystem().setValue(documentFormat);
		}
		
		}		
		return order;
	}
	
	
	//TODO copied from VOMapper needs to be refactored into a helper class in base

	private final void renderAddressVoToXAD(PersonAddress pa, XAD xad) throws HL7Exception
	{
		LOG.debug("RefManHL7Helper renderAddressVoToXAD: entry");
		if (pa == null)
			return;

		xad.getStreetAddress().getStreetOrMailingAddress().setValue(pa.getLine1());
		xad.getOtherDesignation().setValue(pa.getLine2());
		xad.getCity().setValue(pa.getLine3());
		xad.getStateOrProvince().setValue(pa.getLine4());
		xad.getOtherGeographicDesignation().setValue(pa.getLine5());
		xad.getZipOrPostalCode().setValue(pa.getPostCode());

		LOG.debug("RefManHL7Helper renderAddressVoToXAD: exit (" + xad.toString() + ")");
	}
	
	
	//TODO copied from VOMapper needs to be refactored into a helper class in base
	final void renderDateTimeVoToTS(DateTime dt, TS ts) throws DataTypeException 
	{
		LOG.debug("VoMapper renderDateTimeVoToTS: entry");
		if (dt == null)
			return;

		ts.getTimeOfAnEvent().setValue(dt.toString(DateTimeFormat.MILLI));

		LOG.debug("VoMapper renderDateTimeVoToTS: exit (" + ts.toString() + ")");
	}



	/*
	 * (non-Javadoc)
	 * No PV1 segment in a ORR_O02
	 * @see ims.RefMan.helper.IHL7Helper#PopulateOrderMessage(ca.uhn.hl7v2.model.v24.message.ORR_O02, ims.ocs_if.vo.IfOrderMessageVo, ims.ocs_if.vo.IfOutOcsOrderVo, ims.domain.DomainInterface)
	 */
	public ORR_O02 PopulateOrderMessage(ORR_O02 order, IfOrderInvestigationVo invVo,
			IfOutOcsOrderVo newOrder, DomainInterface domObj)
			throws DataTypeException, HL7Exception {
		
		
		PID pid=order.getORR_O02_PIDNTEORCOBRRQDRQ1RXOODSODTNTECTI().getORR_O02_PIDNTE().getPID();
		
		ORC orc = order.getORR_O02_PIDNTEORCOBRRQDRQ1RXOODSODTNTECTI().getORR_O02_ORCOBRRQDRQ1RXOODSODTNTECTI().getORC();
		
		// If it is an NA message just send back the numbers
		if(orc.getOrderControl().getValue().equals("NA") )
			return order;
		
		//Get the OBR if there is one already in the order but don't create one 
		// the status change messages should not contain any obrs
		OBR obr = null;
		if(0!= order.getORR_O02_PIDNTEORCOBRRQDRQ1RXOODSODTNTECTI().getORR_O02_ORCOBRRQDRQ1RXOODSODTNTECTI().getAll("OBR").length)
			obr = order.getORR_O02_PIDNTEORCOBRRQDRQ1RXOODSODTNTECTI().getORR_O02_ORCOBRRQDRQ1RXOODSODTNTECTI().getOBR();

		IFCATSExternalEventVo catsEventVo = null;

		if(domObj  instanceof ExternalEvents)
		{
			ExternalEvents eventObject = (ExternalEvents)domObj;
			
			//If it is a new order then we don't bother with the appointment status
			if(orc.getOrderControl().getValue().equals("NW") ) 
				catsEventVo=eventObject.getCATSIFValues( invVo,false );
			else
				catsEventVo=eventObject.getCATSIFValues( invVo,true );

			if(null== catsEventVo)
				throw new HL7Exception("No appointment details found for schedulable service : "+invVo.toString());


		String referralID=catsEventVo.getReferralID();
		String transportArranged = catsEventVo.getTransportArranged();
		String interperterRequired=catsEventVo.getInterperterRequired();
		String commentsOnTransport=catsEventVo.getCommentsOnTransport();
		String documentType = catsEventVo.getDocumentType();
		String documentPath=catsEventVo.getDocumentPath();
		String documentFormat=catsEventVo.getDocumentFormat();
		DateTime startTimeVo = catsEventVo.getStartDateTime();
		DateTime endTimeVo = catsEventVo.getEndDateTime();
		String appointmentStatusCode = catsEventVo.getAppointmentStatusCode();
		String appointmentStatusComment = catsEventVo.getAppointmentStatusComment();
		
		
		pid.getPatientAccountNumber().getID().setValue(referralID);
		
		
		renderDateTimeVoToTS(startTimeVo, orc.getQuantityTiming(0).getStartDateTime());
		renderDateTimeVoToTS(endTimeVo, orc.getQuantityTiming(0).getEndDateTime());
		
		//ORC-16
		if(null!=appointmentStatusCode)
			orc.getOrderControlCodeReason().getIdentifier().setValue(appointmentStatusCode);
		if(null!=appointmentStatusComment)
			orc.getOrderControlCodeReason().getText().setValue(HL7Utils.toHL7Text(appointmentStatusComment));

		
		if(null!=obr)
		{
			obr.getTransportArranged().setValue(transportArranged);
			obr.getEscortRequired().setValue(interperterRequired);
			obr.getPlannedPatientTransportComment(0).getIdentifier().setValue(commentsOnTransport);
			obr.getPlacerSupplementalServiceInformation(0).getIdentifier().setValue(documentType);
			obr.getPlacerSupplementalServiceInformation(0).getText().setValue(documentPath);
			obr.getPlacerSupplementalServiceInformation(0).getNameOfCodingSystem().setValue(documentFormat);
		}
		
		}		
		return order;
	}



	public void ProcessOrderMessage(ORC orc,IfOrderInvestigationVo invVo,IfOrderInvestigationVo invFromMessage,DomainInterface domObj,DateTime startDT,DateTime endDT,HcpRefVo seenBy)
	{
		if(domObj  instanceof ExternalEvents)
		{
			ExternalEvents eventObject = (ExternalEvents)domObj;
			OrderInvestigationRefVo orgInvRef = new OrderInvestigationRefVo();
			orgInvRef.setID_OrderInvestigation(invVo.getID_OrderInvestigation());
			
			try {
				String orderControl = orc.getOrderControl().getValue();
				if(null!=orderControl)
				{
					if(("CA".equals(orderControl))||("UA".equals(orderControl)))
						{
						eventObject.setCATSReferralHasRejectedInv(invVo);
						}
					
					if("CA".equals(orderControl))
					{
						Booking_AppointmentRefVo baRef= eventObject.getLatestAppointmentForInvestigation(orgInvRef);
						eventObject.generateOrderCancelAsRequestedEvent(baRef, orgInvRef);
					}
					else if ("SN".equals(orderControl))
					{
						DomainFactory factory = getDomainFactory();
						Booking_AppointmentRefVo baRef= eventObject.getLatestAppointmentForInvestigation(invFromMessage);
						if (null==baRef)
						{
							String message = "Appointment details for OrderInvestigation not found:"+invFromMessage.toString();
							LOG.warn(message);
							throw new HL7Exception(message);
						}
						DateTime apptDT= invFromMessage.getAppointmentDate(); //Get the appointment DT from the original OrderInv
						Booking_Appointment domBookAppt=(Booking_Appointment)factory.getDomainObject( baRef);
						OrderInvestigation domOrdInv= (OrderInvestigation) factory.getDomainObject( orgInvRef);
						if(null!=apptDT)
							domOrdInv.setAppointmentDate(apptDT.getJavaDate());
						OrderInvAppt doOrderInvAppt = new OrderInvAppt();
						doOrderInvAppt.setAppointment(domBookAppt);
						doOrderInvAppt.setOrderInvestigation(domOrdInv);
						eventObject.generateOrderNumberAllocatedEvent(baRef, orgInvRef);
						
						
						String hql = "select cr	from CatsReferral as cr join cr.appointments as ba  "
							+ "where (ba.id = :apptId)";

					List<?> referralList = factory.find(hql, new String[] { "apptId" },
							new Object[] { domBookAppt.getId() });

					if (referralList.size() == 0)
					{
						throw new HL7Exception("CATSReferral for Investigation cannot be found:"+invFromMessage.toString());
					}
					CatsReferral domObjReferral = (CatsReferral) referralList.get(0);
					factory.save(domOrdInv);
					factory.save(doOrderInvAppt);
					
					domObjReferral.getOrderInvAppts().add(doOrderInvAppt);

						factory.save(domObjReferral);
					}
					else if("SC".equals(orderControl)) //http://jira/browse/WDEV-6595
					{
						DomainFactory factory = getDomainFactory();
						Booking_AppointmentRefVo baRef= eventObject.getLatestAppointmentForInvestigation(invFromMessage);
						if (null==baRef)
						{
							String message = "Appointment details for OrderInvestigation not found:"+invFromMessage.toString();
							LOG.warn(message);
							throw new HL7Exception(message);
						}
						Booking_Appointment domBookAppt=(Booking_Appointment)factory.getDomainObject( baRef);
						Appointment_Status status = new Appointment_Status();
						
						if(startDT!=null)
						{
							domBookAppt.setSeenTime((new Time(startDT.getJavaDate()).toString()));
							status.setApptDate(startDT.getJavaDate());
							status.setApptTime(domBookAppt.getSeenTime());
						}
						if (seenBy!=null)
						{
							domBookAppt.setSeenBy((Hcp)factory.getDomainObject(seenBy));
						}
						
						if(endDT!=null)
						{
							domBookAppt.setApptCompleteTime((new Time(endDT.getJavaDate()).toString()));
						}
						status.setStatusChangeDateTime(new java.util.Date());
						status.setStatus(getDomLookup(Status_Reason.SEEN));
						
						domBookAppt.setCurrentStatusRecord(status);
						domBookAppt.setApptStatus(getDomLookup(Status_Reason.SEEN));
						domBookAppt.getApptStatusHistory().add(status);
						
						factory.save(domBookAppt);

					}
					
				}
				
			} catch (StaleObjectException e) {
				LOG.warn("SOE Getting appointment from Investigation Order", e);
				return;
			} catch (HL7Exception e) {
				LOG.warn("HL7Exception  Getting Order Control Status", e);
			}
			catch (Exception e) {
			LOG.warn("Exception  Getting Order Control Status", e);
		}
		}
		
		
	}



	public void PocessResultMessage(ORU_R01 result,
			IfOrderInvestigationVo invVo,
			IfOrderInvestigationVo invFromMesssageVo, DomainInterface domObj) throws HL7Exception{
		String documentPath=null;
		try {
			ORU_R01_ORCOBRNTECTDOBXNTEFT1CTI orc_group = null;
			// Only one result per message
			orc_group = ((ORU_R01)result).getORU_R01_PIDPD1NK1NTEPV1PV2ORCOBRNTECTDOBXNTEFT1CTI(0).getORU_R01_ORCOBRNTECTDOBXNTEFT1CTI(0);
			OBR obr = orc_group.getOBR();
			String documentType = obr.getPlacerSupplementalServiceInformation(0).getIdentifier().getValue();
			documentPath = obr.getPlacerSupplementalServiceInformation(0).getText().getValue();
			String documentFormat = obr.getPlacerSupplementalServiceInformation(0).getNameOfCodingSystem().getValue();
			
			if(null==documentType||null==documentPath||null==documentFormat)
				return;
		}
		catch (HL7Exception e)
		{
		// Do nothing and return 
		return;
		}
		
		try {
		//Get the CATS referral
		CatsReferral referral = getCatsReferralFromInvestigation(invVo);
		
		File inFile = new File(ConfigFlag.HL7.HL7_INBOUND_DOCUMENT_SHARE.getValue(),documentPath);
		if(!inFile.exists())
		{
			LOG.error("Report file could not be found:"+documentPath);
			LOG.error("Full path to file:"+inFile.getAbsolutePath());
			throw new HL7Exception("Report file could not be found:"+documentPath);
		}
		byte[] buffer = readFile(inFile);
		uploadFile(ConfigFlag.GEN.PDF_UPLOAD_URL.getValue(), buffer, inFile.getName(), ConfigFlag.HL7.HL7_INBOUND_DOCUMENT_SHARE.getValue());
		
		if(!inFile.delete())
		{
			LOG.error("Failed to delete file from shared area :"+inFile.getAbsolutePath());
		}
		PatientDocument patDoc = new PatientDocument();
		patDoc.setCategory( this.getDomLookup(DocumentCategory.RESULTREPORT));
		
		ServerDocument serverDoc = new ServerDocument();
		serverDoc.setFileType(this.getDomLookup(FileType.PDF));
		
		Date date = new Date();
		int year = date.getYear(), month = date.getMonth(), day = date.getDay();							
		String upLoadName= year + "/" + month + "/" + day + "/" + inFile.getName();
		
		Patient p = referral.getPatient();
		serverDoc.setFileName(upLoadName);
		patDoc.setServerDocument(serverDoc);
		patDoc.setPatient(p);
		patDoc.setName("Result Report");
		patDoc.setStatus(this.getDomLookup(PreActiveActiveInactiveStatus.ACTIVE));
		MemberOfStaff mos = new MemberOfStaff();
		mos.setName(new PersonName());
		patDoc.setRecordingUser(mos);
		patDoc.setRecordingDateTime(new java.util.Date());
		referral.getReferralDocuments().add(patDoc);
		DomainFactory factory = getDomainFactory();
		
		OrderInvestigation domOrdInv= (OrderInvestigation) factory.getDomainObject( invVo);
		
		IfOrderInvCurrentStatusVo vo= invVo.getOrdInvCurrentStatus();
		vo.setOrdInvStatus(OrderInvStatus.RESULTED);
		invVo.setOrdInvCurrentStatus(vo);
		
		// WDEV-16224 - ResultDetails introduced as part of DFT changes, so need to move the patDoc down on level
		//domOrdInv.setManualResultReport(patDoc);
		ResultDetails resDet = new ResultDetails();
		resDet.setDocumentResultDetails(patDoc);
		resDet.setType(this.getDomLookup(ResultDetailsType.DOCUMENT));
		domOrdInv.setResultDetails(resDet);
		
		OrderedInvestigationStatus ordInvCurrentStatus = domOrdInv.getOrdInvCurrentStatus();
		ordInvCurrentStatus.setOrdInvStatus(this.getDomLookup(OrderInvStatus.RESULTED));
		domOrdInv.setOrdInvCurrentStatus(ordInvCurrentStatus);
		
		
		factory.save(referral);
		} catch (StaleObjectException e) {
			LOG.error("Stale Object Exception saving result report",e);
		} catch (FileNotFoundException e) {
			LOG.error("File Not Found exception saving result report",e);
		} catch (IOException e) {
			LOG.error("IOException saving result report", e);
		} 
		
	}


	private String uploadFile(String url, byte[] content, String fileName, String localFolder)
	{
		return new FileUpload(this, url).upload(content, fileName, localFolder);
	}
	
	private byte[] readFile(File pdf) throws FileNotFoundException, IOException 
	{
		long size = pdf.length();
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
	
	
	private CatsReferral getCatsReferralFromInvestigation(IfOrderInvestigationVo invVo)
	{
		DomainFactory factory = getDomainFactory();
		String hql = "select cr	from CatsReferral as cr left join cr.investigationOrders as io left join io.investigations as inv "
			+ "where (inv.id = :invId) and cr.isRIE is null";

		List<?> referralList = factory.find(hql, new String[] { "invId" },
				new Object[] { invVo.getBoId() });

		if (referralList.size() == 0)
			return null;
		else
			return  (CatsReferral) referralList.get(0);
	}
	
	
	

	
//	private IfOrderInvestigationVo getInvestigationFromMsgOrOrder(IfOrderMessageVo msgVo,
//			IfOutOcsOrderVo newOrder) throws HL7Exception
//	{
//		
//	if(msgVo!=null&&msgVo.getInvestigationsIsNotNull()&&msgVo.getInvestigations().get(0)!=null)
//	{
//		return msgVo.getInvestigations().get(0);
//	}
//	else if (newOrder!=null&&newOrder.getInvestigationsIsNotNull()&& newOrder.getInvestigations().get(0)!=null)
//	{
//		return newOrder.getInvestigations().get(0);
//	}
//	else
//	{
//			throw new HL7Exception("Investigation not found in message or Order: "+((null!=msgVo)?msgVo.toString():newOrder.toString()));
//	}
//		
//	
//	}


	public Boolean isReferralDiagnostic(Integer nBookingId)
	{
		DomainFactory factory = getDomainFactory();
		List contractId = factory.find("select cont.contractType.id from CatsReferral as cats left join cats.appointments as bk left join cats.contract as cont where (bk.id = '" + nBookingId + "')");
		if (contractId.size() > 0&&ReferralManagementContractType.DIAGNOSTIC.getId()==((Integer)contractId.get(0)).intValue())
			return true;
		else
			return false;
	}
}
