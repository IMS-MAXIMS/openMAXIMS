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
/*
 * Created on 22-Jul-2005
 *
 */
package ims.scheduling.helper;

import java.util.Iterator;

import ims.choose_book.domain.objects.ActionRequest;
import ims.chooseandbook.vo.lookups.ActionRequestType;
import ims.configuration.gen.ConfigFlag;
import ims.core.vo.lookups.TaxonomyType;
import ims.domain.exceptions.DomainException;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.lookups.LookupInstance;
import ims.domain.lookups.LookupMapping;
import ims.scheduling.domain.objects.Booking_Appointment;
import ims.scheduling.domain.objects.DirectoryOfServiceSessionSlot;
import ims.scheduling.domain.objects.Session_Slot;

/**
 * <p>
 * Utility class with static method placeOutgoingRequest is used
 * to post all notify messages through the CAB Gateway.  A request
 * is placed on the ActionRequest entity.  This request will be picked up
 * by the CabRequestQueue class and actioned accordingly.
 * Note: MsgDetails for ApptCANC = UBRN:<value>;REASON:<value>
 * Note: MsgDetails for ApptDNA = UBRN:<value>;UBRN:<value>;etc..
 * Note: MsgDetails for SlotCancel = USRN:<value>;USRN:<value>;etc..
 * For an Appointment Cancellation, we need to get the reason.
 * We do this by selecting the REASON value - this points to
 * a lookup instance, we then get the CABGW external mapping to
 * get the value required for the Choose & Book Server
 * </p>
 */
public class CABRequests 
{
	public static void placeOutgoingRequest(DomainFactory factory, LookupInstance requestType, String msgDetails, String statComments) throws StaleObjectException
	{
		// Check the configuration flag to see if the cabgw is enabled.  If
		// it is not simple return
		if (!(ConfigFlag.GEN.ICAB_ENABLED.getValue()))
			return;
		
		if (msgDetails == null)
			return; //throw new DomainRuntimeException("CAB Action Request cannot be placed without message details");
		
		try 
		{
			String defaultValue=null;
			if (requestType.getId() == ActionRequestType.NOTIFY_APPT_CANCEL.getId())
				defaultValue = "99"; // Appt Cancel Default - unknown
			else if (requestType.getId() == ActionRequestType.NOTIFY_DNA.getId())
				defaultValue = "9";  // DNA Default - not specified

			// Get the External Mapping for reason for DNA and Cancelled
			if (defaultValue != null)
			{
				int reasonIdx = msgDetails.indexOf("REASON:");
				int endIdx = reasonIdx + msgDetails.substring(reasonIdx).indexOf(";");
				String cancelReason = msgDetails.substring(reasonIdx + 7, endIdx);
				StringBuffer newMsgDetails = new StringBuffer(msgDetails.substring(0, reasonIdx));
				String externalReason = getExternalMapping(factory, cancelReason, defaultValue);

				newMsgDetails.append("REASON:" + externalReason + ";");
				msgDetails = newMsgDetails.toString();
			}
			
			ActionRequest req= new ActionRequest();
			req.setActive(Boolean.TRUE);
			req.setRequestDate(new java.util.Date());
			req.setRequestType(requestType);
			req.setMsgDetails(msgDetails);
			req.setConvId(Uuid.generateUUID());
			req.setCpaId(null);
			req.setStatComment(statComments);

			factory.save(req);
		} catch (DomainException e) {
			throw new DomainRuntimeException("DomainException occurred saving CAB Request - " + e.getMessage(), e);
		} 
	}
	
	private static String getExternalMapping(DomainFactory factory, String cancelReason, String defaultValue)
	{
		if (cancelReason == null || cancelReason.equals(""))
			return defaultValue;
		
		LookupInstance inst = factory.getLookupInstance(Integer.parseInt(cancelReason));
		if (inst != null)
		{
			LookupMapping map = inst.getMapping(TaxonomyType.ICAB.getText());
			if (map != null)
				return (map.getExtCode());
		}
		return defaultValue;
	}
	
	public static Booking_Appointment sendRequestandUpdateReferences(DomainFactory factory,  LookupInstance requestType, ims.domain.DomainObject doObject, String requestSource) throws StaleObjectException
	{
		if(requestType != null)
		{
			Booking_Appointment doAppt = null;
			Session_Slot doSlot = null;
			
			if(doObject instanceof Booking_Appointment)
				doAppt = (Booking_Appointment)doObject;
			else if(doObject instanceof Session_Slot)
			{
				doSlot = (Session_Slot)doObject;
				doAppt = doSlot.getAppointment();
			}
				
			
			if(ims.configuration.gen.ConfigFlag.DOM.SCHEDULING_SLOTS_CREATION.getValue().equals("Choose and Book"))
			{
				// wdev-5700 - cannot cancel slot without previously cancelling an appointment, so removed code from here that tried to handle that
				if (doAppt != null && (requestType.getId() == ActionRequestType.NOTIFY_APPT_CANCEL.getID()) || (requestType.getId() == ActionRequestType.NOTIFY_DNA.getID()))
				{
					placeOutgoingRequest(factory, requestType, doAppt.buildCabMessage(requestType), requestSource);
				}

				// wdev-5726
				if(doSlot != null && requestType.getId() == ActionRequestType.NOTIFY_SLOT_CANCEL.getID())
				{
					StringBuffer cabMessage = new StringBuffer();
					cabMessage.append("USRN:");
					Iterator it = doSlot.getDirectoryOfServices().iterator();
					while (it.hasNext())
					{
						ims.scheduling.domain.objects.DirectoryOfServiceSessionSlot slotDos = (DirectoryOfServiceSessionSlot) it.next();
						if (slotDos.isIsPublished() != null && slotDos.isIsPublished().booleanValue() == true)
						{
							if (slotDos.getUBRN() == null || (doSlot.getAppointment() != null && (doSlot.getAppointment().isIsCABBooking() == null 
									|| doSlot.getAppointment().isIsCABBooking().booleanValue() == false)))
							{
								cabMessage.append(slotDos.getUSRN());
								if (it.hasNext())
									cabMessage.append(";");
							}
						}
					}
					cabMessage.append(";");
					if (cabMessage.length() > 0 && !cabMessage.toString().equals("") && !cabMessage.toString().equals("USRN:;"))
						placeOutgoingRequest(factory, requestType, cabMessage.toString(), requestSource);
					
				}
			}
							
			return doAppt;
		}	
		
		return null;
	}
	
}
