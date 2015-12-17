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
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 12/10/2015, 13:24
 *
 */
package ims.scheduling.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class FutureAppointmentDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.FutureAppointmentDetailsVo copy(ims.scheduling.vo.FutureAppointmentDetailsVo valueObjectDest, ims.scheduling.vo.FutureAppointmentDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_FutureAppointmentDetails(valueObjectSrc.getID_FutureAppointmentDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Appointments
		valueObjectDest.setAppointments(valueObjectSrc.getAppointments());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// StatusHistory
		valueObjectDest.setStatusHistory(valueObjectSrc.getStatusHistory());
		// Source
		valueObjectDest.setSource(valueObjectSrc.getSource());
		// SameService
		valueObjectDest.setSameService(valueObjectSrc.getSameService());
		// SameDay
		valueObjectDest.setSameDay(valueObjectSrc.getSameDay());
		// LinkedDiagnostics
		valueObjectDest.setLinkedDiagnostics(valueObjectSrc.getLinkedDiagnostics());
		// RequestToSchedule
		valueObjectDest.setRequestToSchedule(valueObjectSrc.getRequestToSchedule());
		// StartingWeek
		valueObjectDest.setStartingWeek(valueObjectSrc.getStartingWeek());
		// Mon
		valueObjectDest.setMon(valueObjectSrc.getMon());
		// Tues
		valueObjectDest.setTues(valueObjectSrc.getTues());
		// Wed
		valueObjectDest.setWed(valueObjectSrc.getWed());
		// Thurs
		valueObjectDest.setThurs(valueObjectSrc.getThurs());
		// Fri
		valueObjectDest.setFri(valueObjectSrc.getFri());
		// Sat
		valueObjectDest.setSat(valueObjectSrc.getSat());
		// Sun
		valueObjectDest.setSun(valueObjectSrc.getSun());
		// Comments
		valueObjectDest.setComments(valueObjectSrc.getComments());
		// Referral
		valueObjectDest.setReferral(valueObjectSrc.getReferral());
		// NumberOfLinkedRecurringApptsToBook
		valueObjectDest.setNumberOfLinkedRecurringApptsToBook(valueObjectSrc.getNumberOfLinkedRecurringApptsToBook());
		// FirstApptService
		valueObjectDest.setFirstApptService(valueObjectSrc.getFirstApptService());
		// FirstApptFunction
		valueObjectDest.setFirstApptFunction(valueObjectSrc.getFirstApptFunction());
		// FirstApptPeriodValue
		valueObjectDest.setFirstApptPeriodValue(valueObjectSrc.getFirstApptPeriodValue());
		// FirstApptPeriodType
		valueObjectDest.setFirstApptPeriodType(valueObjectSrc.getFirstApptPeriodType());
		// FirstApptFutureApptByDate
		valueObjectDest.setFirstApptFutureApptByDate(valueObjectSrc.getFirstApptFutureApptByDate());
		// FirstApptToSee
		valueObjectDest.setFirstApptToSee(valueObjectSrc.getFirstApptToSee());
		// SecondApptService
		valueObjectDest.setSecondApptService(valueObjectSrc.getSecondApptService());
		// SecondApptFunction
		valueObjectDest.setSecondApptFunction(valueObjectSrc.getSecondApptFunction());
		// SecondApptPeriodValue
		valueObjectDest.setSecondApptPeriodValue(valueObjectSrc.getSecondApptPeriodValue());
		// SecondApptPeriodType
		valueObjectDest.setSecondApptPeriodType(valueObjectSrc.getSecondApptPeriodType());
		// SecondApptFutureApptByDate
		valueObjectDest.setSecondApptFutureApptByDate(valueObjectSrc.getSecondApptFutureApptByDate());
		// SecondApptToSee
		valueObjectDest.setSecondApptToSee(valueObjectSrc.getSecondApptToSee());
		// ThirdApptService
		valueObjectDest.setThirdApptService(valueObjectSrc.getThirdApptService());
		// ThirdApptFunction
		valueObjectDest.setThirdApptFunction(valueObjectSrc.getThirdApptFunction());
		// ThirdApptPeriodValue
		valueObjectDest.setThirdApptPeriodValue(valueObjectSrc.getThirdApptPeriodValue());
		// ThirdApptPeriodType
		valueObjectDest.setThirdApptPeriodType(valueObjectSrc.getThirdApptPeriodType());
		// ThirdApptFutureApptByDate
		valueObjectDest.setThirdApptFutureApptByDate(valueObjectSrc.getThirdApptFutureApptByDate());
		// ThirdAppToSee
		valueObjectDest.setThirdAppToSee(valueObjectSrc.getThirdAppToSee());
		// Recurring
		valueObjectDest.setRecurring(valueObjectSrc.getRecurring());
		// EndAfterNOccurrences
		valueObjectDest.setEndAfterNOccurrences(valueObjectSrc.getEndAfterNOccurrences());
		// NoOfTimesPerWeek
		valueObjectDest.setNoOfTimesPerWeek(valueObjectSrc.getNoOfTimesPerWeek());
		// EveryNMonths
		valueObjectDest.setEveryNMonths(valueObjectSrc.getEveryNMonths());
		// WeekInTheMonth
		valueObjectDest.setWeekInTheMonth(valueObjectSrc.getWeekInTheMonth());
		// FutureAppointmentComments
		valueObjectDest.setFutureAppointmentComments(valueObjectSrc.getFutureAppointmentComments());
		// DoNotMoveDate
		valueObjectDest.setDoNotMoveDate(valueObjectSrc.getDoNotMoveDate());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createFutureAppointmentDetailsVoCollectionFromFutureAppointmentDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.FutureAppointmentDetails objects.
	 */
	public static ims.scheduling.vo.FutureAppointmentDetailsVoCollection createFutureAppointmentDetailsVoCollectionFromFutureAppointmentDetails(java.util.Set domainObjectSet)	
	{
		return createFutureAppointmentDetailsVoCollectionFromFutureAppointmentDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.FutureAppointmentDetails objects.
	 */
	public static ims.scheduling.vo.FutureAppointmentDetailsVoCollection createFutureAppointmentDetailsVoCollectionFromFutureAppointmentDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.FutureAppointmentDetailsVoCollection voList = new ims.scheduling.vo.FutureAppointmentDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.scheduling.domain.objects.FutureAppointmentDetails domainObject = (ims.scheduling.domain.objects.FutureAppointmentDetails) iterator.next();
			ims.scheduling.vo.FutureAppointmentDetailsVo vo = create(map, domainObject);
			
			if (vo != null)
				voList.add(vo);
				
			if (domainObject != null)
			{				
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param domainObjectList - List of ims.scheduling.domain.objects.FutureAppointmentDetails objects.
	 */
	public static ims.scheduling.vo.FutureAppointmentDetailsVoCollection createFutureAppointmentDetailsVoCollectionFromFutureAppointmentDetails(java.util.List domainObjectList) 
	{
		return createFutureAppointmentDetailsVoCollectionFromFutureAppointmentDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.FutureAppointmentDetails objects.
	 */
	public static ims.scheduling.vo.FutureAppointmentDetailsVoCollection createFutureAppointmentDetailsVoCollectionFromFutureAppointmentDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.FutureAppointmentDetailsVoCollection voList = new ims.scheduling.vo.FutureAppointmentDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.FutureAppointmentDetails domainObject = (ims.scheduling.domain.objects.FutureAppointmentDetails) domainObjectList.get(i);
			ims.scheduling.vo.FutureAppointmentDetailsVo vo = create(map, domainObject);

			if (vo != null)
				voList.add(vo);
			
			if (domainObject != null)
			{
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ims.scheduling.domain.objects.FutureAppointmentDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractFutureAppointmentDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.FutureAppointmentDetailsVoCollection voCollection) 
	 {
	 	return extractFutureAppointmentDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractFutureAppointmentDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.FutureAppointmentDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.FutureAppointmentDetailsVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.FutureAppointmentDetails domainObject = FutureAppointmentDetailsVoAssembler.extractFutureAppointmentDetails(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}
			
			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainObjectSet.contains(domainObject)) domainObjectSet.add(domainObject);
			newSet.add(domainObject);			
		}
		java.util.Set removedSet = new java.util.HashSet();
		java.util.Iterator iter = domainObjectSet.iterator();
		//Find out which objects need to be removed
		while (iter.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet.contains(o))
			{
				removedSet.add(o);
			}
		}
		iter = removedSet.iterator();
		//Remove the unwanted objects
		while (iter.hasNext())
		{
			domainObjectSet.remove(iter.next());
		}
		return domainObjectSet;	 
	 }


	/**
	 * Create the ims.scheduling.domain.objects.FutureAppointmentDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractFutureAppointmentDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.FutureAppointmentDetailsVoCollection voCollection) 
	 {
	 	return extractFutureAppointmentDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractFutureAppointmentDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.FutureAppointmentDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.FutureAppointmentDetailsVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.FutureAppointmentDetails domainObject = FutureAppointmentDetailsVoAssembler.extractFutureAppointmentDetails(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}

			int domIdx = domainObjectList.indexOf(domainObject);
			if (domIdx == -1)
			{
				domainObjectList.add(i, domainObject);
			}
			else if (i != domIdx && i < domainObjectList.size())
			{
				Object tmp = domainObjectList.get(i);
				domainObjectList.set(i, domainObjectList.get(domIdx));
				domainObjectList.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1=domainObjectList.size();
		while (i1 > size)
		{
			domainObjectList.remove(i1-1);
			i1=domainObjectList.size();
		}
		return domainObjectList;	 
	 }

 

	/**
	 * Create the ValueObject from the ims.scheduling.domain.objects.FutureAppointmentDetails object.
	 * @param domainObject ims.scheduling.domain.objects.FutureAppointmentDetails
	 */
	 public static ims.scheduling.vo.FutureAppointmentDetailsVo create(ims.scheduling.domain.objects.FutureAppointmentDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.scheduling.domain.objects.FutureAppointmentDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.scheduling.vo.FutureAppointmentDetailsVo create(DomainObjectMap map, ims.scheduling.domain.objects.FutureAppointmentDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.FutureAppointmentDetailsVo valueObject = (ims.scheduling.vo.FutureAppointmentDetailsVo) map.getValueObject(domainObject, ims.scheduling.vo.FutureAppointmentDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.FutureAppointmentDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.scheduling.domain.objects.FutureAppointmentDetails
	 */
	 public static ims.scheduling.vo.FutureAppointmentDetailsVo insert(ims.scheduling.vo.FutureAppointmentDetailsVo valueObject, ims.scheduling.domain.objects.FutureAppointmentDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
		DomainObjectMap map = new DomainObjectMap();
		return insert(map, valueObject, domainObject);
	 }
	 
	/**
	 * Update the ValueObject with the Domain Object.
	 * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	 * @param valueObject to be updated
	 * @param domainObject ims.scheduling.domain.objects.FutureAppointmentDetails
	 */
	 public static ims.scheduling.vo.FutureAppointmentDetailsVo insert(DomainObjectMap map, ims.scheduling.vo.FutureAppointmentDetailsVo valueObject, ims.scheduling.domain.objects.FutureAppointmentDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_FutureAppointmentDetails(domainObject.getId());
		valueObject.setIsRIE(domainObject.getIsRIE());
		
		// If this is a recordedInError record, and the domainObject
		// value isIncludeRecord has not been set, then we return null and
		// not the value object
		if (valueObject.getIsRIE() != null && valueObject.getIsRIE().booleanValue() == true && !domainObject.isIncludeRecord())
			return null;
			
		// If this is not a recordedInError record, and the domainObject
		// value isIncludeRecord has been set, then we return null and
		// not the value object
		if ((valueObject.getIsRIE() == null || valueObject.getIsRIE().booleanValue() == false) && domainObject.isIncludeRecord())
			return null;
			
		// Appointments
		if (domainObject.getAppointments() != null)
		{
			if(domainObject.getAppointments() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAppointments();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAppointments(new ims.scheduling.vo.Booking_AppointmentRefVo(id, -1));				
			}
			else
			{
				valueObject.setAppointments(new ims.scheduling.vo.Booking_AppointmentRefVo(domainObject.getAppointments().getId(), domainObject.getAppointments().getVersion()));
			}
		}
		// CurrentStatus
		valueObject.setCurrentStatus(ims.RefMan.vo.domain.FutureAppointmentStatusVoAssembler.create(map, domainObject.getCurrentStatus()) );
		// StatusHistory
		valueObject.setStatusHistory(ims.RefMan.vo.domain.FutureAppointmentStatusVoAssembler.createFutureAppointmentStatusVoCollectionFromFutureAppointmentStatus(map, domainObject.getStatusHistory()) );
		// Source
		ims.domain.lookups.LookupInstance instance4 = domainObject.getSource();
		if ( null != instance4 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance4.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance4.getImage().getImageId(), instance4.getImage().getImagePath());
			}
			color = instance4.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.FutureAppointmentSource voLookup4 = new ims.scheduling.vo.lookups.FutureAppointmentSource(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.scheduling.vo.lookups.FutureAppointmentSource parentVoLookup4 = voLookup4;
			ims.domain.lookups.LookupInstance parent4 = instance4.getParent();
			while (parent4 != null)
			{
				if (parent4.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent4.getImage().getImageId(), parent4.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent4.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup4.setParent(new ims.scheduling.vo.lookups.FutureAppointmentSource(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setSource(voLookup4);
		}
				// SameService
		valueObject.setSameService( domainObject.isSameService() );
		// SameDay
		valueObject.setSameDay( domainObject.isSameDay() );
		// LinkedDiagnostics
		valueObject.setLinkedDiagnostics(ims.RefMan.vo.domain.LinkedDiagnosticVoAssembler.createLinkedDiagnosticVoCollectionFromLinkedDiagnostic(map, domainObject.getLinkedDiagnostics()) );
		// RequestToSchedule
		ims.domain.lookups.LookupInstance instance8 = domainObject.getRequestToSchedule();
		if ( null != instance8 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance8.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance8.getImage().getImageId(), instance8.getImage().getImagePath());
			}
			color = instance8.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.RequestToSchedule voLookup8 = new ims.scheduling.vo.lookups.RequestToSchedule(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.scheduling.vo.lookups.RequestToSchedule parentVoLookup8 = voLookup8;
			ims.domain.lookups.LookupInstance parent8 = instance8.getParent();
			while (parent8 != null)
			{
				if (parent8.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent8.getImage().getImageId(), parent8.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent8.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup8.setParent(new ims.scheduling.vo.lookups.RequestToSchedule(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setRequestToSchedule(voLookup8);
		}
				// StartingWeek
		java.util.Date StartingWeek = domainObject.getStartingWeek();
		if ( null != StartingWeek ) 
		{
			valueObject.setStartingWeek(new ims.framework.utils.Date(StartingWeek) );
		}
		// Mon
		valueObject.setMon( domainObject.isMon() );
		// Tues
		valueObject.setTues( domainObject.isTues() );
		// Wed
		valueObject.setWed( domainObject.isWed() );
		// Thurs
		valueObject.setThurs( domainObject.isThurs() );
		// Fri
		valueObject.setFri( domainObject.isFri() );
		// Sat
		valueObject.setSat( domainObject.isSat() );
		// Sun
		valueObject.setSun( domainObject.isSun() );
		// Comments
		valueObject.setComments(domainObject.getComments());
		// Referral
		if (domainObject.getReferral() != null)
		{
			if(domainObject.getReferral() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getReferral();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setReferral(new ims.RefMan.vo.CatsReferralRefVo(id, -1));				
			}
			else
			{
				valueObject.setReferral(new ims.RefMan.vo.CatsReferralRefVo(domainObject.getReferral().getId(), domainObject.getReferral().getVersion()));
			}
		}
		// NumberOfLinkedRecurringApptsToBook
		valueObject.setNumberOfLinkedRecurringApptsToBook(domainObject.getNumberOfLinkedRecurringApptsToBook());
		// FirstApptService
		valueObject.setFirstApptService(ims.core.vo.domain.ServiceLiteVoAssembler.create(map, domainObject.get_1stApptService()) );
		// FirstApptFunction
		ims.domain.lookups.LookupInstance instance21 = domainObject.get_1stApptFunction();
		if ( null != instance21 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance21.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance21.getImage().getImageId(), instance21.getImage().getImagePath());
			}
			color = instance21.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.ServiceFunction voLookup21 = new ims.core.vo.lookups.ServiceFunction(instance21.getId(),instance21.getText(), instance21.isActive(), null, img, color);
			ims.core.vo.lookups.ServiceFunction parentVoLookup21 = voLookup21;
			ims.domain.lookups.LookupInstance parent21 = instance21.getParent();
			while (parent21 != null)
			{
				if (parent21.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent21.getImage().getImageId(), parent21.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent21.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup21.setParent(new ims.core.vo.lookups.ServiceFunction(parent21.getId(),parent21.getText(), parent21.isActive(), null, img, color));
				parentVoLookup21 = parentVoLookup21.getParent();
								parent21 = parent21.getParent();
			}			
			valueObject.setFirstApptFunction(voLookup21);
		}
				// FirstApptPeriodValue
		valueObject.setFirstApptPeriodValue(domainObject.get_1stApptPeriodValue());
		// FirstApptPeriodType
		ims.domain.lookups.LookupInstance instance23 = domainObject.get_1stApptPeriodType();
		if ( null != instance23 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance23.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance23.getImage().getImageId(), instance23.getImage().getImagePath());
			}
			color = instance23.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.TimeUnitsSecondsToMonths voLookup23 = new ims.core.vo.lookups.TimeUnitsSecondsToMonths(instance23.getId(),instance23.getText(), instance23.isActive(), null, img, color);
			ims.core.vo.lookups.TimeUnitsSecondsToMonths parentVoLookup23 = voLookup23;
			ims.domain.lookups.LookupInstance parent23 = instance23.getParent();
			while (parent23 != null)
			{
				if (parent23.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent23.getImage().getImageId(), parent23.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent23.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup23.setParent(new ims.core.vo.lookups.TimeUnitsSecondsToMonths(parent23.getId(),parent23.getText(), parent23.isActive(), null, img, color));
				parentVoLookup23 = parentVoLookup23.getParent();
								parent23 = parent23.getParent();
			}			
			valueObject.setFirstApptPeriodType(voLookup23);
		}
				// FirstApptFutureApptByDate
		java.util.Date FirstApptFutureApptByDate = domainObject.get_1stApptFutureApptByDate();
		if ( null != FirstApptFutureApptByDate ) 
		{
			valueObject.setFirstApptFutureApptByDate(new ims.framework.utils.Date(FirstApptFutureApptByDate) );
		}
		// FirstApptToSee
		valueObject.setFirstApptToSee(ims.RefMan.vo.domain.OPAVoAssembler.create(map, domainObject.get_1stApptToSee()) );
		// SecondApptService
		valueObject.setSecondApptService(ims.core.vo.domain.ServiceLiteVoAssembler.create(map, domainObject.get_2ndApptService()) );
		// SecondApptFunction
		ims.domain.lookups.LookupInstance instance27 = domainObject.get_2ndApptFunction();
		if ( null != instance27 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance27.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance27.getImage().getImageId(), instance27.getImage().getImagePath());
			}
			color = instance27.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.ServiceFunction voLookup27 = new ims.core.vo.lookups.ServiceFunction(instance27.getId(),instance27.getText(), instance27.isActive(), null, img, color);
			ims.core.vo.lookups.ServiceFunction parentVoLookup27 = voLookup27;
			ims.domain.lookups.LookupInstance parent27 = instance27.getParent();
			while (parent27 != null)
			{
				if (parent27.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent27.getImage().getImageId(), parent27.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent27.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup27.setParent(new ims.core.vo.lookups.ServiceFunction(parent27.getId(),parent27.getText(), parent27.isActive(), null, img, color));
				parentVoLookup27 = parentVoLookup27.getParent();
								parent27 = parent27.getParent();
			}			
			valueObject.setSecondApptFunction(voLookup27);
		}
				// SecondApptPeriodValue
		valueObject.setSecondApptPeriodValue(domainObject.get_2ndApptPeriodValue());
		// SecondApptPeriodType
		ims.domain.lookups.LookupInstance instance29 = domainObject.get_2ndApptPeriodType();
		if ( null != instance29 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance29.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance29.getImage().getImageId(), instance29.getImage().getImagePath());
			}
			color = instance29.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.TimeUnitsSecondsToMonths voLookup29 = new ims.core.vo.lookups.TimeUnitsSecondsToMonths(instance29.getId(),instance29.getText(), instance29.isActive(), null, img, color);
			ims.core.vo.lookups.TimeUnitsSecondsToMonths parentVoLookup29 = voLookup29;
			ims.domain.lookups.LookupInstance parent29 = instance29.getParent();
			while (parent29 != null)
			{
				if (parent29.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent29.getImage().getImageId(), parent29.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent29.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup29.setParent(new ims.core.vo.lookups.TimeUnitsSecondsToMonths(parent29.getId(),parent29.getText(), parent29.isActive(), null, img, color));
				parentVoLookup29 = parentVoLookup29.getParent();
								parent29 = parent29.getParent();
			}			
			valueObject.setSecondApptPeriodType(voLookup29);
		}
				// SecondApptFutureApptByDate
		java.util.Date SecondApptFutureApptByDate = domainObject.get_2ndApptFutureApptByDate();
		if ( null != SecondApptFutureApptByDate ) 
		{
			valueObject.setSecondApptFutureApptByDate(new ims.framework.utils.Date(SecondApptFutureApptByDate) );
		}
		// SecondApptToSee
		valueObject.setSecondApptToSee(ims.RefMan.vo.domain.OPAVoAssembler.create(map, domainObject.get_2ndApptToSee()) );
		// ThirdApptService
		valueObject.setThirdApptService(ims.core.vo.domain.ServiceLiteVoAssembler.create(map, domainObject.get_3rdApptService()) );
		// ThirdApptFunction
		ims.domain.lookups.LookupInstance instance33 = domainObject.get_3rdApptFunction();
		if ( null != instance33 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance33.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance33.getImage().getImageId(), instance33.getImage().getImagePath());
			}
			color = instance33.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.ServiceFunction voLookup33 = new ims.core.vo.lookups.ServiceFunction(instance33.getId(),instance33.getText(), instance33.isActive(), null, img, color);
			ims.core.vo.lookups.ServiceFunction parentVoLookup33 = voLookup33;
			ims.domain.lookups.LookupInstance parent33 = instance33.getParent();
			while (parent33 != null)
			{
				if (parent33.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent33.getImage().getImageId(), parent33.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent33.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup33.setParent(new ims.core.vo.lookups.ServiceFunction(parent33.getId(),parent33.getText(), parent33.isActive(), null, img, color));
				parentVoLookup33 = parentVoLookup33.getParent();
								parent33 = parent33.getParent();
			}			
			valueObject.setThirdApptFunction(voLookup33);
		}
				// ThirdApptPeriodValue
		valueObject.setThirdApptPeriodValue(domainObject.get_3rdApptPeriodValue());
		// ThirdApptPeriodType
		ims.domain.lookups.LookupInstance instance35 = domainObject.get_3rdApptPeriodType();
		if ( null != instance35 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance35.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance35.getImage().getImageId(), instance35.getImage().getImagePath());
			}
			color = instance35.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.TimeUnitsSecondsToMonths voLookup35 = new ims.core.vo.lookups.TimeUnitsSecondsToMonths(instance35.getId(),instance35.getText(), instance35.isActive(), null, img, color);
			ims.core.vo.lookups.TimeUnitsSecondsToMonths parentVoLookup35 = voLookup35;
			ims.domain.lookups.LookupInstance parent35 = instance35.getParent();
			while (parent35 != null)
			{
				if (parent35.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent35.getImage().getImageId(), parent35.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent35.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup35.setParent(new ims.core.vo.lookups.TimeUnitsSecondsToMonths(parent35.getId(),parent35.getText(), parent35.isActive(), null, img, color));
				parentVoLookup35 = parentVoLookup35.getParent();
								parent35 = parent35.getParent();
			}			
			valueObject.setThirdApptPeriodType(voLookup35);
		}
				// ThirdApptFutureApptByDate
		java.util.Date ThirdApptFutureApptByDate = domainObject.get_3rdApptFutureApptByDate();
		if ( null != ThirdApptFutureApptByDate ) 
		{
			valueObject.setThirdApptFutureApptByDate(new ims.framework.utils.Date(ThirdApptFutureApptByDate) );
		}
		// ThirdAppToSee
		valueObject.setThirdAppToSee(ims.RefMan.vo.domain.OPAVoAssembler.create(map, domainObject.get_3rdAppToSee()) );
		// Recurring
		ims.domain.lookups.LookupInstance instance38 = domainObject.getRecurring();
		if ( null != instance38 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance38.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance38.getImage().getImageId(), instance38.getImage().getImagePath());
			}
			color = instance38.getColor();
			if (color != null) 
				color.getValue();

			ims.RefMan.vo.lookups.Recurring voLookup38 = new ims.RefMan.vo.lookups.Recurring(instance38.getId(),instance38.getText(), instance38.isActive(), null, img, color);
			ims.RefMan.vo.lookups.Recurring parentVoLookup38 = voLookup38;
			ims.domain.lookups.LookupInstance parent38 = instance38.getParent();
			while (parent38 != null)
			{
				if (parent38.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent38.getImage().getImageId(), parent38.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent38.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup38.setParent(new ims.RefMan.vo.lookups.Recurring(parent38.getId(),parent38.getText(), parent38.isActive(), null, img, color));
				parentVoLookup38 = parentVoLookup38.getParent();
								parent38 = parent38.getParent();
			}			
			valueObject.setRecurring(voLookup38);
		}
				// EndAfterNOccurrences
		valueObject.setEndAfterNOccurrences(domainObject.getEndAfterNOccurrences());
		// NoOfTimesPerWeek
		valueObject.setNoOfTimesPerWeek(domainObject.getNoOfTimesPerWeek());
		// EveryNMonths
		valueObject.setEveryNMonths(domainObject.getEveryNMonths());
		// WeekInTheMonth
		ims.domain.lookups.LookupInstance instance42 = domainObject.getWeekInTheMonth();
		if ( null != instance42 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance42.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance42.getImage().getImageId(), instance42.getImage().getImagePath());
			}
			color = instance42.getColor();
			if (color != null) 
				color.getValue();

			ims.RefMan.vo.lookups.WeekInTheMonth voLookup42 = new ims.RefMan.vo.lookups.WeekInTheMonth(instance42.getId(),instance42.getText(), instance42.isActive(), null, img, color);
			ims.RefMan.vo.lookups.WeekInTheMonth parentVoLookup42 = voLookup42;
			ims.domain.lookups.LookupInstance parent42 = instance42.getParent();
			while (parent42 != null)
			{
				if (parent42.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent42.getImage().getImageId(), parent42.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent42.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup42.setParent(new ims.RefMan.vo.lookups.WeekInTheMonth(parent42.getId(),parent42.getText(), parent42.isActive(), null, img, color));
				parentVoLookup42 = parentVoLookup42.getParent();
								parent42 = parent42.getParent();
			}			
			valueObject.setWeekInTheMonth(voLookup42);
		}
				// FutureAppointmentComments
		valueObject.setFutureAppointmentComments(domainObject.getFutureAppointmentComments());
		// DoNotMoveDate
		valueObject.setDoNotMoveDate( domainObject.isDoNotMoveDate() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.FutureAppointmentDetails extractFutureAppointmentDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.FutureAppointmentDetailsVo valueObject) 
	{
		return 	extractFutureAppointmentDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.FutureAppointmentDetails extractFutureAppointmentDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.FutureAppointmentDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_FutureAppointmentDetails();
		ims.scheduling.domain.objects.FutureAppointmentDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.scheduling.domain.objects.FutureAppointmentDetails)domMap.get(valueObject);
			}
			// ims.scheduling.vo.FutureAppointmentDetailsVo ID_FutureAppointmentDetails field is unknown
			domainObject = new ims.scheduling.domain.objects.FutureAppointmentDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_FutureAppointmentDetails());
			if (domMap.get(key) != null)
			{
				return (ims.scheduling.domain.objects.FutureAppointmentDetails)domMap.get(key);
			}
			domainObject = (ims.scheduling.domain.objects.FutureAppointmentDetails) domainFactory.getDomainObject(ims.scheduling.domain.objects.FutureAppointmentDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_FutureAppointmentDetails());

		ims.scheduling.domain.objects.Booking_Appointment value1 = null;
		if ( null != valueObject.getAppointments() ) 
		{
			if (valueObject.getAppointments().getBoId() == null)
			{
				if (domMap.get(valueObject.getAppointments()) != null)
				{
					value1 = (ims.scheduling.domain.objects.Booking_Appointment)domMap.get(valueObject.getAppointments());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getAppointments();	
			}
			else
			{
				value1 = (ims.scheduling.domain.objects.Booking_Appointment)domainFactory.getDomainObject(ims.scheduling.domain.objects.Booking_Appointment.class, valueObject.getAppointments().getBoId());
			}
		}
		domainObject.setAppointments(value1);
		domainObject.setCurrentStatus(ims.RefMan.vo.domain.FutureAppointmentStatusVoAssembler.extractFutureAppointmentStatus(domainFactory, valueObject.getCurrentStatus(), domMap));
		domainObject.setStatusHistory(ims.RefMan.vo.domain.FutureAppointmentStatusVoAssembler.extractFutureAppointmentStatusList(domainFactory, valueObject.getStatusHistory(), domainObject.getStatusHistory(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getSource() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getSource().getID());
		}
		domainObject.setSource(value4);
		domainObject.setSameService(valueObject.getSameService());
		domainObject.setSameDay(valueObject.getSameDay());
		domainObject.setLinkedDiagnostics(ims.RefMan.vo.domain.LinkedDiagnosticVoAssembler.extractLinkedDiagnosticList(domainFactory, valueObject.getLinkedDiagnostics(), domainObject.getLinkedDiagnostics(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getRequestToSchedule() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getRequestToSchedule().getID());
		}
		domainObject.setRequestToSchedule(value8);
		java.util.Date value9 = null;
		ims.framework.utils.Date date9 = valueObject.getStartingWeek();		
		if ( date9 != null ) 
		{
			value9 = date9.getDate();
		}
		domainObject.setStartingWeek(value9);
		domainObject.setMon(valueObject.getMon());
		domainObject.setTues(valueObject.getTues());
		domainObject.setWed(valueObject.getWed());
		domainObject.setThurs(valueObject.getThurs());
		domainObject.setFri(valueObject.getFri());
		domainObject.setSat(valueObject.getSat());
		domainObject.setSun(valueObject.getSun());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComments() != null && valueObject.getComments().equals(""))
		{
			valueObject.setComments(null);
		}
		domainObject.setComments(valueObject.getComments());
		ims.RefMan.domain.objects.CatsReferral value18 = null;
		if ( null != valueObject.getReferral() ) 
		{
			if (valueObject.getReferral().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferral()) != null)
				{
					value18 = (ims.RefMan.domain.objects.CatsReferral)domMap.get(valueObject.getReferral());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value18 = domainObject.getReferral();	
			}
			else
			{
				value18 = (ims.RefMan.domain.objects.CatsReferral)domainFactory.getDomainObject(ims.RefMan.domain.objects.CatsReferral.class, valueObject.getReferral().getBoId());
			}
		}
		domainObject.setReferral(value18);
		domainObject.setNumberOfLinkedRecurringApptsToBook(valueObject.getNumberOfLinkedRecurringApptsToBook());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Service value20 = null;
		if ( null != valueObject.getFirstApptService() ) 
		{
			if (valueObject.getFirstApptService().getBoId() == null)
			{
				if (domMap.get(valueObject.getFirstApptService()) != null)
				{
					value20 = (ims.core.clinical.domain.objects.Service)domMap.get(valueObject.getFirstApptService());
				}
			}
			else
			{
				value20 = (ims.core.clinical.domain.objects.Service)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Service.class, valueObject.getFirstApptService().getBoId());
			}
		}
		domainObject.set_1stApptService(value20);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value21 = null;
		if ( null != valueObject.getFirstApptFunction() ) 
		{
			value21 =
				domainFactory.getLookupInstance(valueObject.getFirstApptFunction().getID());
		}
		domainObject.set_1stApptFunction(value21);
		domainObject.set_1stApptPeriodValue(valueObject.getFirstApptPeriodValue());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value23 = null;
		if ( null != valueObject.getFirstApptPeriodType() ) 
		{
			value23 =
				domainFactory.getLookupInstance(valueObject.getFirstApptPeriodType().getID());
		}
		domainObject.set_1stApptPeriodType(value23);
		java.util.Date value24 = null;
		ims.framework.utils.Date date24 = valueObject.getFirstApptFutureApptByDate();		
		if ( date24 != null ) 
		{
			value24 = date24.getDate();
		}
		domainObject.set_1stApptFutureApptByDate(value24);
		domainObject.set_1stApptToSee(ims.RefMan.vo.domain.OPAVoAssembler.extractOPA(domainFactory, valueObject.getFirstApptToSee(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Service value26 = null;
		if ( null != valueObject.getSecondApptService() ) 
		{
			if (valueObject.getSecondApptService().getBoId() == null)
			{
				if (domMap.get(valueObject.getSecondApptService()) != null)
				{
					value26 = (ims.core.clinical.domain.objects.Service)domMap.get(valueObject.getSecondApptService());
				}
			}
			else
			{
				value26 = (ims.core.clinical.domain.objects.Service)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Service.class, valueObject.getSecondApptService().getBoId());
			}
		}
		domainObject.set_2ndApptService(value26);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value27 = null;
		if ( null != valueObject.getSecondApptFunction() ) 
		{
			value27 =
				domainFactory.getLookupInstance(valueObject.getSecondApptFunction().getID());
		}
		domainObject.set_2ndApptFunction(value27);
		domainObject.set_2ndApptPeriodValue(valueObject.getSecondApptPeriodValue());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value29 = null;
		if ( null != valueObject.getSecondApptPeriodType() ) 
		{
			value29 =
				domainFactory.getLookupInstance(valueObject.getSecondApptPeriodType().getID());
		}
		domainObject.set_2ndApptPeriodType(value29);
		java.util.Date value30 = null;
		ims.framework.utils.Date date30 = valueObject.getSecondApptFutureApptByDate();		
		if ( date30 != null ) 
		{
			value30 = date30.getDate();
		}
		domainObject.set_2ndApptFutureApptByDate(value30);
		domainObject.set_2ndApptToSee(ims.RefMan.vo.domain.OPAVoAssembler.extractOPA(domainFactory, valueObject.getSecondApptToSee(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Service value32 = null;
		if ( null != valueObject.getThirdApptService() ) 
		{
			if (valueObject.getThirdApptService().getBoId() == null)
			{
				if (domMap.get(valueObject.getThirdApptService()) != null)
				{
					value32 = (ims.core.clinical.domain.objects.Service)domMap.get(valueObject.getThirdApptService());
				}
			}
			else
			{
				value32 = (ims.core.clinical.domain.objects.Service)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Service.class, valueObject.getThirdApptService().getBoId());
			}
		}
		domainObject.set_3rdApptService(value32);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value33 = null;
		if ( null != valueObject.getThirdApptFunction() ) 
		{
			value33 =
				domainFactory.getLookupInstance(valueObject.getThirdApptFunction().getID());
		}
		domainObject.set_3rdApptFunction(value33);
		domainObject.set_3rdApptPeriodValue(valueObject.getThirdApptPeriodValue());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value35 = null;
		if ( null != valueObject.getThirdApptPeriodType() ) 
		{
			value35 =
				domainFactory.getLookupInstance(valueObject.getThirdApptPeriodType().getID());
		}
		domainObject.set_3rdApptPeriodType(value35);
		java.util.Date value36 = null;
		ims.framework.utils.Date date36 = valueObject.getThirdApptFutureApptByDate();		
		if ( date36 != null ) 
		{
			value36 = date36.getDate();
		}
		domainObject.set_3rdApptFutureApptByDate(value36);
		domainObject.set_3rdAppToSee(ims.RefMan.vo.domain.OPAVoAssembler.extractOPA(domainFactory, valueObject.getThirdAppToSee(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value38 = null;
		if ( null != valueObject.getRecurring() ) 
		{
			value38 =
				domainFactory.getLookupInstance(valueObject.getRecurring().getID());
		}
		domainObject.setRecurring(value38);
		domainObject.setEndAfterNOccurrences(valueObject.getEndAfterNOccurrences());
		domainObject.setNoOfTimesPerWeek(valueObject.getNoOfTimesPerWeek());
		domainObject.setEveryNMonths(valueObject.getEveryNMonths());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value42 = null;
		if ( null != valueObject.getWeekInTheMonth() ) 
		{
			value42 =
				domainFactory.getLookupInstance(valueObject.getWeekInTheMonth().getID());
		}
		domainObject.setWeekInTheMonth(value42);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getFutureAppointmentComments() != null && valueObject.getFutureAppointmentComments().equals(""))
		{
			valueObject.setFutureAppointmentComments(null);
		}
		domainObject.setFutureAppointmentComments(valueObject.getFutureAppointmentComments());
		domainObject.setDoNotMoveDate(valueObject.getDoNotMoveDate());

		return domainObject;
	}

}
