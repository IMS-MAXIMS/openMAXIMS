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
package ims.hl7.domain.mapping;

import java.text.DecimalFormat;

import org.apache.log4j.Logger;

import ims.core.patient.vo.PatientRefVo;
import ims.core.vo.PatientShort;
import ims.core.vo.ServiceShortVo;
import ims.framework.utils.DateTime;
import ims.hl7.domain.HL7EngineApplication;
import ims.hl7.utils.EvnCodes;
import ims.ocrr.orderingresults.vo.OcsOrderSessionRefVo;
import ims.ocrr.vo.ProviderSystemVo;
import ims.ocrr.vo.lookups.OrderInvStatus;
import ims.ocs_if.helper.IHL7Helper;
import ims.ocs_if.vo.IfOrderInvestigationVo;
import ims.ocs_if.vo.IfOutOcsOrderVo;
import ims.ocs_if.vo.OrderChangeResponseVo;
import ims.scheduling.vo.ExternalEventVo;
import ims.scheduling.vo.lookups.ExternalSystemEventTypes;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.message.ORR_O02;
import ca.uhn.hl7v2.model.v24.segment.ORC;

public class O02VoMapper extends VoMapper
{
	private static final Logger			LOG		= Logger.getLogger(O02VoMapper.class);

	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception 
	{
		R01VoMapper r01mapper = (R01VoMapper) HL7EngineApplication.getVoMapper(EvnCodes.R01);
		if (r01mapper == null)
		{
			throw new HL7Exception("O02 mapper requires R01 mapper. R01 mapper not found in list of registerd mappers.");			
		}
		return r01mapper.processEvent(msg, providerSystem);
	}
	
	public Message populateMessage()
	{
		// Not required for inbound only
		return null;
	}

	public Message populateOrderResponseMessage(OrderChangeResponseVo responseVo)throws Exception
	{
		LOG.debug("O02VoMapper populateOrderResponseMessage: entry");
		IfOutOcsOrderVo orderVo=ocsIfInbound.getOrderFromInv(responseVo.getInvestigation());
		PatientRefVo patient= orderVo.getPatient();
		ORR_O02   order = new ORR_O02();
		DecimalFormat myFormatter = new DecimalFormat("000000000");  // Required for placer order number
		
		// Radiology messages only have a single investigation
		IfOrderInvestigationVo orderInv=getInvFromOrderVoAndMessage(orderVo,responseVo.getInvestigation());
		
		
		
		String placerNum = myFormatter.format(orderInv.getID_OrderInvestigation());
		String fillerNum = orderInv.getFillerOrdNum();
		DateTime startDate = orderInv.getAppointmentDate();
		String priority = "";
		if (null!=orderInv.getOrderPriority())
		{
			priority  = orderInv.getOrderPriority().getText();
		}
		
		
		
		
		populateMSH( responseVo.getProviderSystem(),  order.getMSH(),Long.toString( new java.util.Date().getTime()),"ORR","O02");
		PatientShort shortPatient = demog.getPatientShort(patient);
		renderPatientShortVoToPID(shortPatient, order.getORR_O02_PIDNTEORCOBRRQDRQ1RXOODSODTNTECTI().getORR_O02_PIDNTE().getPID(), responseVo.getProviderSystem());
		ORC commonOrder = order.getORR_O02_PIDNTEORCOBRRQDRQ1RXOODSODTNTECTI().getORR_O02_ORCOBRRQDRQ1RXOODSODTNTECTI().getORC();

		
		if(OrderInvStatus.CHANGED.equals( responseVo.getCausingStatus()))
		{
			commonOrder.getOrderControl().setValue("XR");
		}
		else if(OrderInvStatus.PROVIDER_CHANGE_REJECTED.equals( responseVo.getCausingStatus()))
		{
			commonOrder.getOrderControl().setValue("UX");
		}
		
		//ORC-2		
		commonOrder.getPlacerOrderNumber().getEntityIdentifier().setValue(placerNum);
		//ORC-3
		commonOrder.getFillerOrderNumber().getEntityIdentifier().setValue(fillerNum);
		//ORC-4
		commonOrder.getPlacerGroupNumber().getEntityIdentifier().setValue(orderInv.getID_OrderInvestigation().toString());
		
		//ORC-5 ??
//		commonOrder.getOrderStatus().get
		
		// ORC-6   Response flag   (ID)   00220
		// Possible values..
		//		E	Report exceptions only
		//		R	Same as E, also Replacement and Parent-Child
		//		D	Same as R, also other associated segments
		//		F	Same as D, plus confirmations explicitly
		//		N	Only the MSA segment is returned
		commonOrder.getResponseFlag().setValue("D");  // Default Value 

		
		//ORC-7 TODO
		//Start and end time handled in helper

		commonOrder.getQuantityTiming(0).getPriority().setValue(priority);
		
		//Current Date Time ORC-9		
		//WDEV-8866
		if (orderInv.getDisplayDateTimeIsNotNull())
			renderDateTimeVoToTS(orderInv.getDisplayDateTime(), commonOrder.getDateTimeOfTransaction());
		else 
			renderDateTimeVoToTS(new DateTime(), commonOrder.getDateTimeOfTransaction());
		
		if (orderVo.getOrderedByIsNotNull())
		{
			// ORC-10   Entered by   (XCN)   00224
			renderMemberOfStaffShortVoToXCN(orderVo.getOrderedBy(), commonOrder.getEnteredBy(0),responseVo.getProviderSystem());

			// ORC-13   Enterer’s location   (PL)   00227 
			if (orderVo.getOrderedBy().getPrimaryLocationIsNotNull())
			{
				commonOrder.getEntererSLocation().getLocationDescription().setValue(orderVo.getOrderedBy().getPrimaryLocation().getName());
			}
			
			if (orderVo.getOrderedBy().getCommChannelsIsNotNull())
			{
				// ORC-14   Call back phone number   (XTN)   00228
				renderCommChannelVoCollectionToXTN(orderVo.getOrderedBy().getCommChannels(), commonOrder.getCallBackPhoneNumber(0));
			}
		}
		
		// ORC-12   Ordering provider   (XCN)   00226
		if (orderVo.getResponsibleClinicianIsNotNull())
		{
			renderMemberOfStaffShortVoToXCN(orderVo.getResponsibleClinician().getMos(), commonOrder.getOrderingProvider(0),responseVo.getProviderSystem());
		}
		
		
		
		//ORC-15 Is this the same as ORC-7? It is for now
		renderDateTimeVoToTS(startDate,commonOrder.getOrderEffectiveDateTime());
		
		ServiceShortVo service = ocsIf.getService(orderInv.getInvestigation());
		
		//ORC-15
		commonOrder.getOrderControlCodeReason().getText().setValue(responseVo.getStatusReason());

		if (service.getCanBeScheduled()) 
		{
			IHL7Helper RefManHelper=(IHL7Helper)getDomainImpl("ims.RefMan.helper.RefManHL7Helper");
			order = RefManHelper.PopulateOrderMessage(order,orderInv,orderVo,RefMandomain);
		}
		
		LOG.debug("O02VoMapper populateOrderResponseMessage: exit");
		// TODO Auto-generated method stub
		return order;
	}
	
	
	
	public Message populateOrderResponseMessage(ExternalEventVo event) throws Exception
	
	{
		LOG.debug("O02VoMapper populateOrderResponseMessage: entry");
		
		PatientRefVo patient= RefMandomain.getPatientFromAppointment(event.getAppointment());
		OcsOrderSessionRefVo orderRef=RefMandomain.getOrderFromInvestigation(event.getInvestigation());
		IfOutOcsOrderVo orderVo= ocsIf.getOrder(orderRef);
		
		ORR_O02   order = new ORR_O02();
		
		DecimalFormat myFormatter = new DecimalFormat("000000000");  // Required for placer order number
		
		// Radiology messages only have a single investigation
		IfOrderInvestigationVo orderInv=getInvFromOrderVoAndMessage(orderVo,event.getInvestigation());
		
		
		
		String placerNum = myFormatter.format(orderInv.getID_OrderInvestigation());
		String fillerNum = orderInv.getFillerOrdNum();
		DateTime startDate = orderInv.getAppointmentDate();
		String priority = "";
		if (null!=orderInv.getOrderPriority())
		{
			priority  = orderInv.getOrderPriority().getText();
		}
		
		
		
		
		populateMSH( event.getProviderSystem(),  order.getMSH(),Long.toString( new java.util.Date().getTime()),"ORR","O02");
		PatientShort shortPatient = demog.getPatientShort(patient);
		renderPatientShortVoToPID(shortPatient, order.getORR_O02_PIDNTEORCOBRRQDRQ1RXOODSODTNTECTI().getORR_O02_PIDNTE().getPID(), event.getProviderSystem());
		ORC commonOrder = order.getORR_O02_PIDNTEORCOBRRQDRQ1RXOODSODTNTECTI().getORR_O02_ORCOBRRQDRQ1RXOODSODTNTECTI().getORC();
		
		
		//ORC-1
		if(ExternalSystemEventTypes.ALLOCATEORDERNUMBER.equals(event.getEventType()))
		{
			commonOrder.getOrderControl().setValue("NA");
		}
		else if(ExternalSystemEventTypes.ACKCANCELREQUEST.equals(event.getEventType()))
		{
			commonOrder.getOrderControl().setValue("CR");
		}
		
		//ORC-2		
		commonOrder.getPlacerOrderNumber().getEntityIdentifier().setValue(placerNum);
		//ORC-3
		commonOrder.getFillerOrderNumber().getEntityIdentifier().setValue(fillerNum);
		//ORC-4
		commonOrder.getPlacerGroupNumber().getEntityIdentifier().setValue(orderInv.getID_OrderInvestigation().toString());
		
		//ORC-5 ??
//		commonOrder.getOrderStatus().get
		
		// ORC-6   Response flag   (ID)   00220
		// Possible values..
		//		E	Report exceptions only
		//		R	Same as E, also Replacement and Parent-Child
		//		D	Same as R, also other associated segments
		//		F	Same as D, plus confirmations explicitly
		//		N	Only the MSA segment is returned
		commonOrder.getResponseFlag().setValue("D");  // Default Value 

		
		//ORC-7 TODO
		//Start and end time handled in helper

		commonOrder.getQuantityTiming(0).getPriority().setValue(priority);
		
		//Current Date Time ORC-9		
		//WDEV-8866
		if (orderInv.getDisplayDateTimeIsNotNull())
			renderDateTimeVoToTS(orderInv.getDisplayDateTime(), commonOrder.getDateTimeOfTransaction());
		else 
			renderDateTimeVoToTS(new DateTime(), commonOrder.getDateTimeOfTransaction());
		
		if (orderVo.getOrderedByIsNotNull())
		{
			// ORC-10   Entered by   (XCN)   00224
			renderMemberOfStaffShortVoToXCN(orderVo.getOrderedBy(), commonOrder.getEnteredBy(0),event.getProviderSystem());

			// ORC-13   Enterer’s location   (PL)   00227 
			if (orderVo.getOrderedBy().getPrimaryLocationIsNotNull())
			{
				commonOrder.getEntererSLocation().getLocationDescription().setValue(orderVo.getOrderedBy().getPrimaryLocation().getName());
			}
			
			if (orderVo.getOrderedBy().getCommChannelsIsNotNull())
			{
				// ORC-14   Call back phone number   (XTN)   00228
				renderCommChannelVoCollectionToXTN(orderVo.getOrderedBy().getCommChannels(), commonOrder.getCallBackPhoneNumber(0));
			}
		}
		
		// ORC-12   Ordering provider   (XCN)   00226
		if (orderVo.getResponsibleClinicianIsNotNull())
		{
			renderMemberOfStaffShortVoToXCN(orderVo.getResponsibleClinician().getMos(), commonOrder.getOrderingProvider(0),event.getProviderSystem());
		}
		
		
		
		//ORC-15 Is this the same as ORC-7? It is for now
		renderDateTimeVoToTS(startDate,commonOrder.getOrderEffectiveDateTime());
		
		ServiceShortVo service = ocsIf.getService(orderInv.getInvestigation());

		if (service.getCanBeScheduled()) 
		{
			IHL7Helper RefManHelper=(IHL7Helper)getDomainImpl("ims.RefMan.helper.RefManHL7Helper");
		order = RefManHelper.PopulateOrderMessage(order,orderInv,orderVo,RefMandomain);
		}
		
		LOG.debug("O02VoMapper populateOrderResponseMessage: exit");
		// TODO Auto-generated method stub
		return order;
	}

	
	
}
