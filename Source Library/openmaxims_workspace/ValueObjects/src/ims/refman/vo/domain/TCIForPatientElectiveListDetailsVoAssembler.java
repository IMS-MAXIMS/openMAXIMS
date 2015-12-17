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
 * Generated on 12/10/2015, 13:25
 *
 */
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class TCIForPatientElectiveListDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.TCIForPatientElectiveListDetailsVo copy(ims.RefMan.vo.TCIForPatientElectiveListDetailsVo valueObjectDest, ims.RefMan.vo.TCIForPatientElectiveListDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_TCIForPatientElectiveList(valueObjectSrc.getID_TCIForPatientElectiveList());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TCIDate
		valueObjectDest.setTCIDate(valueObjectSrc.getTCIDate());
		// TCITime
		valueObjectDest.setTCITime(valueObjectSrc.getTCITime());
		// TCIHospital
		valueObjectDest.setTCIHospital(valueObjectSrc.getTCIHospital());
		// TCIWard
		valueObjectDest.setTCIWard(valueObjectSrc.getTCIWard());
		// RTTBreachReason
		valueObjectDest.setRTTBreachReason(valueObjectSrc.getRTTBreachReason());
		// TCIOfferMethod
		valueObjectDest.setTCIOfferMethod(valueObjectSrc.getTCIOfferMethod());
		// DateTCIOffered
		valueObjectDest.setDateTCIOffered(valueObjectSrc.getDateTCIOffered());
		// Appointment
		valueObjectDest.setAppointment(valueObjectSrc.getAppointment());
		// IsActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// Day28BreachReason
		valueObjectDest.setDay28BreachReason(valueObjectSrc.getDay28BreachReason());
		// wasReasonable28dayOfferMade
		valueObjectDest.setWasReasonable28dayOfferMade(valueObjectSrc.getWasReasonable28dayOfferMade());
		// DayTCIDate28Offered
		valueObjectDest.setDayTCIDate28Offered(valueObjectSrc.getDayTCIDate28Offered());
		// Date28OfOffer
		valueObjectDest.setDate28OfOffer(valueObjectSrc.getDate28OfOffer());
		// ReasonDeclined28
		valueObjectDest.setReasonDeclined28(valueObjectSrc.getReasonDeclined28());
		// CurrentOutcome
		valueObjectDest.setCurrentOutcome(valueObjectSrc.getCurrentOutcome());
		// OutcomeHistory
		valueObjectDest.setOutcomeHistory(valueObjectSrc.getOutcomeHistory());
		// SubjectTo28DayRule
		valueObjectDest.setSubjectTo28DayRule(valueObjectSrc.getSubjectTo28DayRule());
		// Rule28DayStatus
		valueObjectDest.setRule28DayStatus(valueObjectSrc.getRule28DayStatus());
		// Rule28DayPeriodStart
		valueObjectDest.setRule28DayPeriodStart(valueObjectSrc.getRule28DayPeriodStart());
		// PlannedTCIDate
		valueObjectDest.setPlannedTCIDate(valueObjectSrc.getPlannedTCIDate());
		// SystemInformation
		valueObjectDest.setSystemInformation(valueObjectSrc.getSystemInformation());
		// Comments
		valueObjectDest.setComments(valueObjectSrc.getComments());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTCIForPatientElectiveListDetailsVoCollectionFromTCIForPatientElectiveList(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.TCIForPatientElectiveList objects.
	 */
	public static ims.RefMan.vo.TCIForPatientElectiveListDetailsVoCollection createTCIForPatientElectiveListDetailsVoCollectionFromTCIForPatientElectiveList(java.util.Set domainObjectSet)	
	{
		return createTCIForPatientElectiveListDetailsVoCollectionFromTCIForPatientElectiveList(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.TCIForPatientElectiveList objects.
	 */
	public static ims.RefMan.vo.TCIForPatientElectiveListDetailsVoCollection createTCIForPatientElectiveListDetailsVoCollectionFromTCIForPatientElectiveList(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.TCIForPatientElectiveListDetailsVoCollection voList = new ims.RefMan.vo.TCIForPatientElectiveListDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.TCIForPatientElectiveList domainObject = (ims.RefMan.domain.objects.TCIForPatientElectiveList) iterator.next();
			ims.RefMan.vo.TCIForPatientElectiveListDetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.TCIForPatientElectiveList objects.
	 */
	public static ims.RefMan.vo.TCIForPatientElectiveListDetailsVoCollection createTCIForPatientElectiveListDetailsVoCollectionFromTCIForPatientElectiveList(java.util.List domainObjectList) 
	{
		return createTCIForPatientElectiveListDetailsVoCollectionFromTCIForPatientElectiveList(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.TCIForPatientElectiveList objects.
	 */
	public static ims.RefMan.vo.TCIForPatientElectiveListDetailsVoCollection createTCIForPatientElectiveListDetailsVoCollectionFromTCIForPatientElectiveList(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.TCIForPatientElectiveListDetailsVoCollection voList = new ims.RefMan.vo.TCIForPatientElectiveListDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.TCIForPatientElectiveList domainObject = (ims.RefMan.domain.objects.TCIForPatientElectiveList) domainObjectList.get(i);
			ims.RefMan.vo.TCIForPatientElectiveListDetailsVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.TCIForPatientElectiveList set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTCIForPatientElectiveListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.TCIForPatientElectiveListDetailsVoCollection voCollection) 
	 {
	 	return extractTCIForPatientElectiveListSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTCIForPatientElectiveListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.TCIForPatientElectiveListDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.TCIForPatientElectiveListDetailsVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.TCIForPatientElectiveList domainObject = TCIForPatientElectiveListDetailsVoAssembler.extractTCIForPatientElectiveList(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.TCIForPatientElectiveList list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTCIForPatientElectiveListList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.TCIForPatientElectiveListDetailsVoCollection voCollection) 
	 {
	 	return extractTCIForPatientElectiveListList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTCIForPatientElectiveListList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.TCIForPatientElectiveListDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.TCIForPatientElectiveListDetailsVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.TCIForPatientElectiveList domainObject = TCIForPatientElectiveListDetailsVoAssembler.extractTCIForPatientElectiveList(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.TCIForPatientElectiveList object.
	 * @param domainObject ims.RefMan.domain.objects.TCIForPatientElectiveList
	 */
	 public static ims.RefMan.vo.TCIForPatientElectiveListDetailsVo create(ims.RefMan.domain.objects.TCIForPatientElectiveList domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.TCIForPatientElectiveList object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.TCIForPatientElectiveListDetailsVo create(DomainObjectMap map, ims.RefMan.domain.objects.TCIForPatientElectiveList domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.TCIForPatientElectiveListDetailsVo valueObject = (ims.RefMan.vo.TCIForPatientElectiveListDetailsVo) map.getValueObject(domainObject, ims.RefMan.vo.TCIForPatientElectiveListDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.TCIForPatientElectiveListDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.TCIForPatientElectiveList
	 */
	 public static ims.RefMan.vo.TCIForPatientElectiveListDetailsVo insert(ims.RefMan.vo.TCIForPatientElectiveListDetailsVo valueObject, ims.RefMan.domain.objects.TCIForPatientElectiveList domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.TCIForPatientElectiveList
	 */
	 public static ims.RefMan.vo.TCIForPatientElectiveListDetailsVo insert(DomainObjectMap map, ims.RefMan.vo.TCIForPatientElectiveListDetailsVo valueObject, ims.RefMan.domain.objects.TCIForPatientElectiveList domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_TCIForPatientElectiveList(domainObject.getId());
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
			
		// TCIDate
		java.util.Date TCIDate = domainObject.getTCIDate();
		if ( null != TCIDate ) 
		{
			valueObject.setTCIDate(new ims.framework.utils.Date(TCIDate) );
		}
		// TCITime
		String TCITime = domainObject.getTCITime();
		if ( null != TCITime ) 
		{
			valueObject.setTCITime(new ims.framework.utils.Time(TCITime) );
		}
		// TCIHospital
		valueObject.setTCIHospital(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getTCIHospital()) );
		// TCIWard
		valueObject.setTCIWard(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getTCIWard()) );
		// RTTBreachReason
		ims.domain.lookups.LookupInstance instance5 = domainObject.getRTTBreachReason();
		if ( null != instance5 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance5.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance5.getImage().getImageId(), instance5.getImage().getImagePath());
			}
			color = instance5.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.RTTWeekWaitOr28DayRuleBreachReason voLookup5 = new ims.scheduling.vo.lookups.RTTWeekWaitOr28DayRuleBreachReason(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.scheduling.vo.lookups.RTTWeekWaitOr28DayRuleBreachReason parentVoLookup5 = voLookup5;
			ims.domain.lookups.LookupInstance parent5 = instance5.getParent();
			while (parent5 != null)
			{
				if (parent5.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent5.getImage().getImageId(), parent5.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent5.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup5.setParent(new ims.scheduling.vo.lookups.RTTWeekWaitOr28DayRuleBreachReason(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setRTTBreachReason(voLookup5);
		}
				// TCIOfferMethod
		ims.domain.lookups.LookupInstance instance6 = domainObject.getTCIOfferMethod();
		if ( null != instance6 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance6.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance6.getImage().getImageId(), instance6.getImage().getImagePath());
			}
			color = instance6.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.TCIOfferMethod voLookup6 = new ims.core.vo.lookups.TCIOfferMethod(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.TCIOfferMethod parentVoLookup6 = voLookup6;
			ims.domain.lookups.LookupInstance parent6 = instance6.getParent();
			while (parent6 != null)
			{
				if (parent6.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent6.getImage().getImageId(), parent6.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent6.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup6.setParent(new ims.core.vo.lookups.TCIOfferMethod(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setTCIOfferMethod(voLookup6);
		}
				// DateTCIOffered
		java.util.Date DateTCIOffered = domainObject.getDateTCIOffered();
		if ( null != DateTCIOffered ) 
		{
			valueObject.setDateTCIOffered(new ims.framework.utils.Date(DateTCIOffered) );
		}
		// Appointment
		valueObject.setAppointment(ims.RefMan.vo.domain.BookingAppointmentForTCIVoAssembler.create(map, domainObject.getAppointment()) );
		// IsActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// Day28BreachReason
		ims.domain.lookups.LookupInstance instance10 = domainObject.getDay28BreachReason();
		if ( null != instance10 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance10.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance10.getImage().getImageId(), instance10.getImage().getImagePath());
			}
			color = instance10.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.RTTWeekWaitOr28DayRuleBreachReason voLookup10 = new ims.scheduling.vo.lookups.RTTWeekWaitOr28DayRuleBreachReason(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.scheduling.vo.lookups.RTTWeekWaitOr28DayRuleBreachReason parentVoLookup10 = voLookup10;
			ims.domain.lookups.LookupInstance parent10 = instance10.getParent();
			while (parent10 != null)
			{
				if (parent10.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent10.getImage().getImageId(), parent10.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent10.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup10.setParent(new ims.scheduling.vo.lookups.RTTWeekWaitOr28DayRuleBreachReason(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setDay28BreachReason(voLookup10);
		}
				// wasReasonable28dayOfferMade
		valueObject.setWasReasonable28dayOfferMade( domainObject.isWasReasonable28dayOfferMade() );
		// DayTCIDate28Offered
		java.util.Date DayTCIDate28Offered = domainObject.get_28DayTCIDateOffered();
		if ( null != DayTCIDate28Offered ) 
		{
			valueObject.setDayTCIDate28Offered(new ims.framework.utils.Date(DayTCIDate28Offered) );
		}
		// Date28OfOffer
		java.util.Date Date28OfOffer = domainObject.get_28DateOfOffer();
		if ( null != Date28OfOffer ) 
		{
			valueObject.setDate28OfOffer(new ims.framework.utils.Date(Date28OfOffer) );
		}
		// ReasonDeclined28
		ims.domain.lookups.LookupInstance instance14 = domainObject.get_28ReasonDeclined();
		if ( null != instance14 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance14.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance14.getImage().getImageId(), instance14.getImage().getImagePath());
			}
			color = instance14.getColor();
			if (color != null) 
				color.getValue();

			ims.RefMan.vo.lookups.ReasonDeclined28DayOffer voLookup14 = new ims.RefMan.vo.lookups.ReasonDeclined28DayOffer(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ReasonDeclined28DayOffer parentVoLookup14 = voLookup14;
			ims.domain.lookups.LookupInstance parent14 = instance14.getParent();
			while (parent14 != null)
			{
				if (parent14.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent14.getImage().getImageId(), parent14.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent14.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup14.setParent(new ims.RefMan.vo.lookups.ReasonDeclined28DayOffer(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setReasonDeclined28(voLookup14);
		}
				// CurrentOutcome
		valueObject.setCurrentOutcome(ims.RefMan.vo.domain.TCIOutcomeForPatientElectiveListVoAssembler.create(map, domainObject.getCurrentOutcome()) );
		// OutcomeHistory
		valueObject.setOutcomeHistory(ims.RefMan.vo.domain.TCIOutcomeForPatientElectiveListVoAssembler.createTCIOutcomeForPatientElectiveListVoCollectionFromTCIOutcomeForPatientElectiveList(map, domainObject.getOutcomeHistory()) );
		// SubjectTo28DayRule
		valueObject.setSubjectTo28DayRule( domainObject.isSubjectTo28DayRule() );
		// Rule28DayStatus
		ims.domain.lookups.LookupInstance instance18 = domainObject.getRule28DayStatus();
		if ( null != instance18 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance18.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance18.getImage().getImageId(), instance18.getImage().getImagePath());
			}
			color = instance18.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.Rule28DayStatus voLookup18 = new ims.scheduling.vo.lookups.Rule28DayStatus(instance18.getId(),instance18.getText(), instance18.isActive(), null, img, color);
			ims.scheduling.vo.lookups.Rule28DayStatus parentVoLookup18 = voLookup18;
			ims.domain.lookups.LookupInstance parent18 = instance18.getParent();
			while (parent18 != null)
			{
				if (parent18.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent18.getImage().getImageId(), parent18.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent18.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup18.setParent(new ims.scheduling.vo.lookups.Rule28DayStatus(parent18.getId(),parent18.getText(), parent18.isActive(), null, img, color));
				parentVoLookup18 = parentVoLookup18.getParent();
								parent18 = parent18.getParent();
			}			
			valueObject.setRule28DayStatus(voLookup18);
		}
				// Rule28DayPeriodStart
		java.util.Date Rule28DayPeriodStart = domainObject.getRule28DayPeriodStart();
		if ( null != Rule28DayPeriodStart ) 
		{
			valueObject.setRule28DayPeriodStart(new ims.framework.utils.Date(Rule28DayPeriodStart) );
		}
		// PlannedTCIDate
		java.util.Date PlannedTCIDate = domainObject.getPlannedTCIDate();
		if ( null != PlannedTCIDate ) 
		{
			valueObject.setPlannedTCIDate(new ims.framework.utils.Date(PlannedTCIDate) );
		}
		// SystemInformation
		// set system information
		valueObject.setSystemInformation(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// Comments
		valueObject.setComments(domainObject.getComments());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.TCIForPatientElectiveList extractTCIForPatientElectiveList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.TCIForPatientElectiveListDetailsVo valueObject) 
	{
		return 	extractTCIForPatientElectiveList(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.TCIForPatientElectiveList extractTCIForPatientElectiveList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.TCIForPatientElectiveListDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_TCIForPatientElectiveList();
		ims.RefMan.domain.objects.TCIForPatientElectiveList domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.TCIForPatientElectiveList)domMap.get(valueObject);
			}
			// ims.RefMan.vo.TCIForPatientElectiveListDetailsVo ID_TCIForPatientElectiveList field is unknown
			domainObject = new ims.RefMan.domain.objects.TCIForPatientElectiveList();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_TCIForPatientElectiveList());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.TCIForPatientElectiveList)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.TCIForPatientElectiveList) domainFactory.getDomainObject(ims.RefMan.domain.objects.TCIForPatientElectiveList.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_TCIForPatientElectiveList());

		java.util.Date value1 = null;
		ims.framework.utils.Date date1 = valueObject.getTCIDate();		
		if ( date1 != null ) 
		{
			value1 = date1.getDate();
		}
		domainObject.setTCIDate(value1);
		ims.framework.utils.Time time2 = valueObject.getTCITime();
		String value2 = null;
		if ( time2 != null ) 
		{
			value2 = time2.toString();
		}
		domainObject.setTCITime(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value3 = null;
		if ( null != valueObject.getTCIHospital() ) 
		{
			if (valueObject.getTCIHospital().getBoId() == null)
			{
				if (domMap.get(valueObject.getTCIHospital()) != null)
				{
					value3 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getTCIHospital());
				}
			}
			else
			{
				value3 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getTCIHospital().getBoId());
			}
		}
		domainObject.setTCIHospital(value3);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value4 = null;
		if ( null != valueObject.getTCIWard() ) 
		{
			if (valueObject.getTCIWard().getBoId() == null)
			{
				if (domMap.get(valueObject.getTCIWard()) != null)
				{
					value4 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getTCIWard());
				}
			}
			else
			{
				value4 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getTCIWard().getBoId());
			}
		}
		domainObject.setTCIWard(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getRTTBreachReason() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getRTTBreachReason().getID());
		}
		domainObject.setRTTBreachReason(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getTCIOfferMethod() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getTCIOfferMethod().getID());
		}
		domainObject.setTCIOfferMethod(value6);
		java.util.Date value7 = null;
		ims.framework.utils.Date date7 = valueObject.getDateTCIOffered();		
		if ( date7 != null ) 
		{
			value7 = date7.getDate();
		}
		domainObject.setDateTCIOffered(value7);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.scheduling.domain.objects.Booking_Appointment value8 = null;
		if ( null != valueObject.getAppointment() ) 
		{
			if (valueObject.getAppointment().getBoId() == null)
			{
				if (domMap.get(valueObject.getAppointment()) != null)
				{
					value8 = (ims.scheduling.domain.objects.Booking_Appointment)domMap.get(valueObject.getAppointment());
				}
			}
			else
			{
				value8 = (ims.scheduling.domain.objects.Booking_Appointment)domainFactory.getDomainObject(ims.scheduling.domain.objects.Booking_Appointment.class, valueObject.getAppointment().getBoId());
			}
		}
		domainObject.setAppointment(value8);
		domainObject.setIsActive(valueObject.getIsActive());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getDay28BreachReason() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getDay28BreachReason().getID());
		}
		domainObject.setDay28BreachReason(value10);
		domainObject.setWasReasonable28dayOfferMade(valueObject.getWasReasonable28dayOfferMade());
		java.util.Date value12 = null;
		ims.framework.utils.Date date12 = valueObject.getDayTCIDate28Offered();		
		if ( date12 != null ) 
		{
			value12 = date12.getDate();
		}
		domainObject.set_28DayTCIDateOffered(value12);
		java.util.Date value13 = null;
		ims.framework.utils.Date date13 = valueObject.getDate28OfOffer();		
		if ( date13 != null ) 
		{
			value13 = date13.getDate();
		}
		domainObject.set_28DateOfOffer(value13);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getReasonDeclined28() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getReasonDeclined28().getID());
		}
		domainObject.set_28ReasonDeclined(value14);
		domainObject.setCurrentOutcome(ims.RefMan.vo.domain.TCIOutcomeForPatientElectiveListVoAssembler.extractTCIOutcomeForPatientElectiveList(domainFactory, valueObject.getCurrentOutcome(), domMap));
		domainObject.setOutcomeHistory(ims.RefMan.vo.domain.TCIOutcomeForPatientElectiveListVoAssembler.extractTCIOutcomeForPatientElectiveListList(domainFactory, valueObject.getOutcomeHistory(), domainObject.getOutcomeHistory(), domMap));		
		domainObject.setSubjectTo28DayRule(valueObject.getSubjectTo28DayRule());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value18 = null;
		if ( null != valueObject.getRule28DayStatus() ) 
		{
			value18 =
				domainFactory.getLookupInstance(valueObject.getRule28DayStatus().getID());
		}
		domainObject.setRule28DayStatus(value18);
		java.util.Date value19 = null;
		ims.framework.utils.Date date19 = valueObject.getRule28DayPeriodStart();		
		if ( date19 != null ) 
		{
			value19 = date19.getDate();
		}
		domainObject.setRule28DayPeriodStart(value19);
		java.util.Date value20 = null;
		ims.framework.utils.Date date20 = valueObject.getPlannedTCIDate();		
		if ( date20 != null ) 
		{
			value20 = date20.getDate();
		}
		domainObject.setPlannedTCIDate(value20);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComments() != null && valueObject.getComments().equals(""))
		{
			valueObject.setComments(null);
		}
		domainObject.setComments(valueObject.getComments());

		return domainObject;
	}

}
