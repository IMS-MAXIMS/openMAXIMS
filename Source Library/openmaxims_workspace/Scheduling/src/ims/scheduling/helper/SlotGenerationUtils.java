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
 * Created on 18-Jul-2005
 *
 */
package ims.scheduling.helper;

import ims.core.clinical.domain.objects.ServiceFunction;
import ims.scheduling.domain.objects.DirectoryOfServiceSessionSlot;
import ims.scheduling.domain.objects.DirectoryofService;
import ims.scheduling.domain.objects.Profile_Activity;
import ims.scheduling.domain.objects.Profile_BookingRight;
import ims.scheduling.domain.objects.Profile_Exc_Time;
import ims.scheduling.domain.objects.Profile_ListOwner;
import ims.scheduling.domain.objects.Sch_Session;
import ims.scheduling.domain.objects.SessionActivity;
import ims.scheduling.domain.objects.Session_BookingRight;
import ims.scheduling.domain.objects.Session_Exc_Time;
import ims.scheduling.domain.objects.Session_ListOwner;
import ims.scheduling.domain.objects.Session_Slot;
import ims.scheduling.domain.objects.SlotDirectoryOfService;

import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author bworwood
 *
 * Utility Class used for Slot Generation and profile updates ripple out functionality
 * */
public class SlotGenerationUtils 
{
	/**
	 * @param directoryOfServices
	 * @return
	 */
	public static Set copySlotDirectoryOfServices(Set directoryOfServices, Session_Slot slot)
	{
		//if changing here please also modify SessionSlotDialog to same effect (dlaffan)
		Set doDosSessSlotSet = new HashSet();
		
		Iterator it = directoryOfServices.iterator();
		while (it.hasNext())
		{
			SlotDirectoryOfService dosProf = (SlotDirectoryOfService) it.next();
			DirectoryOfServiceSessionSlot doDosSessSlot = new DirectoryOfServiceSessionSlot();
			doDosSessSlot.setDirectoryOfService(dosProf.getDirectoryOfService());
			doDosSessSlot.setSlot(slot);
			doDosSessSlot.setUSRN(Uuid.generateUUID());
			doDosSessSlot.setIsPublished(Boolean.FALSE);
			doDosSessSlotSet.add(doDosSessSlot);
		}
		
		return doDosSessSlotSet;
	}
	
	public static Set copyDirectoryOfServices(Set directoryOfServices)
	{
		Set dosSet = new HashSet();
		
		Iterator it = directoryOfServices.iterator();
		while (it.hasNext())
		{
			DirectoryofService dosProf = (DirectoryofService) it.next();
			dosSet.add(dosProf);
		}
		
		return dosSet;
	}

	/**
	 * @param functions
	 * @return
	 */
	public static  Set copyFunctions(Set functions)
	{
		Set functionSet = new HashSet();
		
		Iterator it = functions.iterator();
		while (it.hasNext())
		{
			ServiceFunction funcProf = (ServiceFunction) it.next();
			if (funcProf.isIsActive().booleanValue())
			{
				functionSet.add(funcProf);
			}
		}
		return functionSet;
	}

	public  static Integer calculateDuration(String startTm, String endTm)
	{
	  int hour, minute;
	  int fromValue, toValue;
	  
	  String startTime = startTm.replaceAll(":", "");
	  String endTime = endTm.replaceAll(":", "");

	  if (startTime == null || endTime == null)
		 return new Integer(0);

	  if (startTime.length() < 4)
	  {
		DecimalFormat myFormatter = new DecimalFormat("0000");
		startTime = myFormatter.format(Integer.parseInt(startTime));

	  }

	  if (endTime.length() < 4)
	  {
		DecimalFormat myFormatter = new DecimalFormat("0000");
		endTime = myFormatter.format(Integer.parseInt(endTime));
	  }

	  hour = Integer.parseInt(startTime.substring(0, 2));
	  minute = Integer.parseInt(startTime.substring(2, 4));
	  fromValue = (hour *60) + minute;

	  hour = Integer.parseInt(endTime.substring(0, 2));
	  minute = Integer.parseInt(endTime.substring(2, 4));
	  toValue = (hour *60) + minute;
	  
	  return new Integer(toValue-fromValue);
	}
	
	
	public static  String calculateNextSlotTime(int startTm, int duration, int instance)
	{
	  int hour, minute;
	  int fromValue;
	  
	  DecimalFormat myFormatter = new DecimalFormat("0000");

	  String startTime = String.valueOf(startTm);
	  if (startTime.length() < 4)
		startTime = myFormatter.format(Integer.parseInt(startTime));

	  hour = Integer.parseInt(startTime.substring(0, 2));
	  minute = Integer.parseInt(startTime.substring(2, 4));
	  fromValue = (hour *60) + minute;
	  
	  int newValue = fromValue + (duration * instance);
	  int newHour = newValue / 60;
	  int newMinute = newValue % 60;
	  String newMinStr = String.valueOf(newMinute);
	  if (newMinute < 10)
	  	newMinStr = "0" + newMinStr;
	  String newHourStr = String.valueOf(newHour);
	  if (newHour < 10)
	  	newHourStr = "0" + newHourStr;
	  return(new String() + newHourStr + ":" + newMinStr);
	}
	
	
	/**
	 * @param profile
	 * @return
	 */
	public static  Set copyExclusionTimes(Set profileExcTime)
	{
		Set exclSet = new HashSet();
		
		Iterator it = profileExcTime.iterator();
		while (it.hasNext())
		{
			Profile_Exc_Time excProf = (Profile_Exc_Time) it.next();
			Session_Exc_Time excTime = new Session_Exc_Time();
			excTime.setEndTime(excProf.getEndTime());
			excTime.setStartTime(excProf.getStartTime());
			excTime.setIsActive(Boolean.TRUE);
			exclSet.add(excTime);
		}
		
		return exclSet;
	}

	/**
	 * @param profile
	 * @return
	 */
	public static  Set copyListOwners(Set profileListOwners)
	{
		Set sessListOwners = new HashSet();
		
		Iterator it = profileListOwners.iterator();
		while (it.hasNext())
		{
			Profile_ListOwner profOwner = (Profile_ListOwner) it.next();
			Session_ListOwner sessOwner = new Session_ListOwner();
			sessOwner.setEndTime(profOwner.getEndTime());
			sessOwner.setHcp(profOwner.getHCP());
			sessOwner.setMaxNoAppts(profOwner.getMaxNoAppts());
			sessOwner.setStartTime(profOwner.getStartTime());
			sessListOwners.add(sessOwner);
		}
		return sessListOwners;
	}

	/**
	 * @param profile
	 * @return
	 */
	public static  Set copyBookingRights(Set profileBookingRights) 
	{
		Set sessBookingRights = new HashSet();
		
		Iterator it = profileBookingRights.iterator();
		while (it.hasNext())
		{
			Session_BookingRight sessRight = new Session_BookingRight();
			Profile_BookingRight profRight = (Profile_BookingRight) it.next();
			sessRight.setRole(profRight.getRole());
			sessBookingRights.add(sessRight);
		}
		return sessBookingRights;
	}

	/**
	 * @param session
	 * @param slotResp
	 * @return
	 */
	public static Session_ListOwner getSessionListOwner(Sch_Session session, Profile_ListOwner slotResp) 
	{
		// Loop through the session's list owners and get the instance of the profile list owner for the slot
		if (session == null || session.getListOwners() == null || slotResp == null)
			return null;
		
		Iterator it = session.getListOwners().iterator();
		while (it.hasNext())
		{
			Session_ListOwner lo = (Session_ListOwner) it.next();
			if (lo.getHcp().getId() == slotResp.getHCP().getId())
				return lo;
		}
		return null;
	}
	
	/**
	 * 
	 * @param profileActivities
	 * @return
	 */
	public static Set copyActivities(Set profileActivities)
	{
		Set sessActivities = new HashSet();
		
		Iterator it = profileActivities.iterator();
		while (it.hasNext())
		{
			SessionActivity sessAct = new SessionActivity();
			Profile_Activity profAct = (Profile_Activity) it.next();
			sessAct.setActivity(profAct.getActivity());
			sessAct.setIsActive(profAct.isIsActive());
			sessActivities.add(sessAct);
		}
		return sessActivities;
	}
}
