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
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 16/04/2014, 12:31
 *
 */
package ims.pathways.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Marius Mihalec
 */
public class PatientJourneyJourneyTargetInterfaceVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.pathways.vo.PatientJourneyJourneyTargetInterfaceVo copy(ims.pathways.vo.PatientJourneyJourneyTargetInterfaceVo valueObjectDest, ims.pathways.vo.PatientJourneyJourneyTargetInterfaceVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientJourneyTarget(valueObjectSrc.getID_PatientJourneyTarget());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// PathwayTarget
		valueObjectDest.setPathwayTarget(valueObjectSrc.getPathwayTarget());
		// WeekNumber
		valueObjectDest.setWeekNumber(valueObjectSrc.getWeekNumber());
		// TargetDate
		valueObjectDest.setTargetDate(valueObjectSrc.getTargetDate());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// CancelledDate
		valueObjectDest.setCancelledDate(valueObjectSrc.getCancelledDate());
		// hasCancelledEvents
		valueObjectDest.setHasCancelledEvents(valueObjectSrc.getHasCancelledEvents());
		// Events
		valueObjectDest.setEvents(valueObjectSrc.getEvents());
		// ScheduledDate
		valueObjectDest.setScheduledDate(valueObjectSrc.getScheduledDate());
		// JourneyClock
		valueObjectDest.setJourneyClock(valueObjectSrc.getJourneyClock());
		// AchievedDate
		valueObjectDest.setAchievedDate(valueObjectSrc.getAchievedDate());
		// Readjustments
		valueObjectDest.setReadjustments(valueObjectSrc.getReadjustments());
		// hasReadjustments
		valueObjectDest.setHasReadjustments(valueObjectSrc.getHasReadjustments());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientJourneyJourneyTargetInterfaceVoCollectionFromPatientJourneyTarget(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.pathways.domain.objects.PatientJourneyTarget objects.
	 */
	public static ims.pathways.vo.PatientJourneyJourneyTargetInterfaceVoCollection createPatientJourneyJourneyTargetInterfaceVoCollectionFromPatientJourneyTarget(java.util.Set domainObjectSet)	
	{
		return createPatientJourneyJourneyTargetInterfaceVoCollectionFromPatientJourneyTarget(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.pathways.domain.objects.PatientJourneyTarget objects.
	 */
	public static ims.pathways.vo.PatientJourneyJourneyTargetInterfaceVoCollection createPatientJourneyJourneyTargetInterfaceVoCollectionFromPatientJourneyTarget(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.pathways.vo.PatientJourneyJourneyTargetInterfaceVoCollection voList = new ims.pathways.vo.PatientJourneyJourneyTargetInterfaceVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.pathways.domain.objects.PatientJourneyTarget domainObject = (ims.pathways.domain.objects.PatientJourneyTarget) iterator.next();
			ims.pathways.vo.PatientJourneyJourneyTargetInterfaceVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.pathways.domain.objects.PatientJourneyTarget objects.
	 */
	public static ims.pathways.vo.PatientJourneyJourneyTargetInterfaceVoCollection createPatientJourneyJourneyTargetInterfaceVoCollectionFromPatientJourneyTarget(java.util.List domainObjectList) 
	{
		return createPatientJourneyJourneyTargetInterfaceVoCollectionFromPatientJourneyTarget(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.pathways.domain.objects.PatientJourneyTarget objects.
	 */
	public static ims.pathways.vo.PatientJourneyJourneyTargetInterfaceVoCollection createPatientJourneyJourneyTargetInterfaceVoCollectionFromPatientJourneyTarget(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.pathways.vo.PatientJourneyJourneyTargetInterfaceVoCollection voList = new ims.pathways.vo.PatientJourneyJourneyTargetInterfaceVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.pathways.domain.objects.PatientJourneyTarget domainObject = (ims.pathways.domain.objects.PatientJourneyTarget) domainObjectList.get(i);
			ims.pathways.vo.PatientJourneyJourneyTargetInterfaceVo vo = create(map, domainObject);

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
	 * Create the ims.pathways.domain.objects.PatientJourneyTarget set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientJourneyTargetSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PatientJourneyJourneyTargetInterfaceVoCollection voCollection) 
	 {
	 	return extractPatientJourneyTargetSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientJourneyTargetSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PatientJourneyJourneyTargetInterfaceVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.pathways.vo.PatientJourneyJourneyTargetInterfaceVo vo = voCollection.get(i);
			ims.pathways.domain.objects.PatientJourneyTarget domainObject = PatientJourneyJourneyTargetInterfaceVoAssembler.extractPatientJourneyTarget(domainFactory, vo, domMap);

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
	 * Create the ims.pathways.domain.objects.PatientJourneyTarget list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientJourneyTargetList(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PatientJourneyJourneyTargetInterfaceVoCollection voCollection) 
	 {
	 	return extractPatientJourneyTargetList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientJourneyTargetList(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PatientJourneyJourneyTargetInterfaceVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.pathways.vo.PatientJourneyJourneyTargetInterfaceVo vo = voCollection.get(i);
			ims.pathways.domain.objects.PatientJourneyTarget domainObject = PatientJourneyJourneyTargetInterfaceVoAssembler.extractPatientJourneyTarget(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.pathways.domain.objects.PatientJourneyTarget object.
	 * @param domainObject ims.pathways.domain.objects.PatientJourneyTarget
	 */
	 public static ims.pathways.vo.PatientJourneyJourneyTargetInterfaceVo create(ims.pathways.domain.objects.PatientJourneyTarget domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.pathways.domain.objects.PatientJourneyTarget object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.pathways.vo.PatientJourneyJourneyTargetInterfaceVo create(DomainObjectMap map, ims.pathways.domain.objects.PatientJourneyTarget domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.pathways.vo.PatientJourneyJourneyTargetInterfaceVo valueObject = (ims.pathways.vo.PatientJourneyJourneyTargetInterfaceVo) map.getValueObject(domainObject, ims.pathways.vo.PatientJourneyJourneyTargetInterfaceVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.pathways.vo.PatientJourneyJourneyTargetInterfaceVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.pathways.domain.objects.PatientJourneyTarget
	 */
	 public static ims.pathways.vo.PatientJourneyJourneyTargetInterfaceVo insert(ims.pathways.vo.PatientJourneyJourneyTargetInterfaceVo valueObject, ims.pathways.domain.objects.PatientJourneyTarget domainObject) 
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
	 * @param domainObject ims.pathways.domain.objects.PatientJourneyTarget
	 */
	 public static ims.pathways.vo.PatientJourneyJourneyTargetInterfaceVo insert(DomainObjectMap map, ims.pathways.vo.PatientJourneyJourneyTargetInterfaceVo valueObject, ims.pathways.domain.objects.PatientJourneyTarget domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientJourneyTarget(domainObject.getId());
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
			
		// PathwayTarget
		valueObject.setPathwayTarget(ims.pathways.vo.domain.PathwayTargetShortVoAssembler.create(map, domainObject.getPathwayTarget()) );
		// WeekNumber
		valueObject.setWeekNumber(domainObject.getWeekNumber());
		// TargetDate
		java.util.Date TargetDate = domainObject.getTargetDate();
		if ( null != TargetDate ) 
		{
			valueObject.setTargetDate(new ims.framework.utils.Date(TargetDate) );
		}
		// CurrentStatus
		valueObject.setCurrentStatus(ims.pathways.vo.domain.JourneyTargetStatusVoAssembler.create(map, domainObject.getCurrentStatus()) );
		// CancelledDate
		java.util.Date CancelledDate = domainObject.getCancelledDate();
		if ( null != CancelledDate ) 
		{
			valueObject.setCancelledDate(new ims.framework.utils.Date(CancelledDate) );
		}
		// hasCancelledEvents
		valueObject.setHasCancelledEvents( domainObject.isHasCancelledEvents() );
		// Events
		valueObject.setEvents(ims.pathways.vo.domain.PatientJourneyEventInterfaceVoAssembler.createPatientJourneyEventInterfaceVoCollectionFromPatientEvent(map, domainObject.getEvents()) );
		// ScheduledDate
		java.util.Date ScheduledDate = domainObject.getScheduledDate();
		if ( null != ScheduledDate ) 
		{
			valueObject.setScheduledDate(new ims.framework.utils.Date(ScheduledDate) );
		}
		// JourneyClock
		valueObject.setJourneyClock(ims.pathways.vo.domain.PatientJourneyClockInterfaceVoAssembler.create(map, domainObject.getJourneyClock()) );
		// AchievedDate
		java.util.Date AchievedDate = domainObject.getAchievedDate();
		if ( null != AchievedDate ) 
		{
			valueObject.setAchievedDate(new ims.framework.utils.DateTime(AchievedDate) );
		}
		// Readjustments
		valueObject.setReadjustments(ims.pathways.vo.domain.TargetReadjustmentVoAssembler.createTargetReadjustmentVoCollectionFromTargetReadjustment(map, domainObject.getReadjustments()) );
		// hasReadjustments
		valueObject.setHasReadjustments( domainObject.isHasReadjustments() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.pathways.domain.objects.PatientJourneyTarget extractPatientJourneyTarget(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PatientJourneyJourneyTargetInterfaceVo valueObject) 
	{
		return 	extractPatientJourneyTarget(domainFactory, valueObject, new HashMap());
	}

	public static ims.pathways.domain.objects.PatientJourneyTarget extractPatientJourneyTarget(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PatientJourneyJourneyTargetInterfaceVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientJourneyTarget();
		ims.pathways.domain.objects.PatientJourneyTarget domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.pathways.domain.objects.PatientJourneyTarget)domMap.get(valueObject);
			}
			// ims.pathways.vo.PatientJourneyJourneyTargetInterfaceVo ID_PatientJourneyTarget field is unknown
			domainObject = new ims.pathways.domain.objects.PatientJourneyTarget();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientJourneyTarget());
			if (domMap.get(key) != null)
			{
				return (ims.pathways.domain.objects.PatientJourneyTarget)domMap.get(key);
			}
			domainObject = (ims.pathways.domain.objects.PatientJourneyTarget) domainFactory.getDomainObject(ims.pathways.domain.objects.PatientJourneyTarget.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientJourneyTarget());

		domainObject.setPathwayTarget(ims.pathways.vo.domain.PathwayTargetShortVoAssembler.extractPathwayTarget(domainFactory, valueObject.getPathwayTarget(), domMap));
		domainObject.setWeekNumber(valueObject.getWeekNumber());
		java.util.Date value3 = null;
		ims.framework.utils.Date date3 = valueObject.getTargetDate();		
		if ( date3 != null ) 
		{
			value3 = date3.getDate();
		}
		domainObject.setTargetDate(value3);
		domainObject.setCurrentStatus(ims.pathways.vo.domain.JourneyTargetStatusVoAssembler.extractJourneyTargetStatus(domainFactory, valueObject.getCurrentStatus(), domMap));
		java.util.Date value5 = null;
		ims.framework.utils.Date date5 = valueObject.getCancelledDate();		
		if ( date5 != null ) 
		{
			value5 = date5.getDate();
		}
		domainObject.setCancelledDate(value5);
		domainObject.setHasCancelledEvents(valueObject.getHasCancelledEvents());
		domainObject.setEvents(ims.pathways.vo.domain.PatientJourneyEventInterfaceVoAssembler.extractPatientEventSet(domainFactory, valueObject.getEvents(), domainObject.getEvents(), domMap));		
		java.util.Date value8 = null;
		ims.framework.utils.Date date8 = valueObject.getScheduledDate();		
		if ( date8 != null ) 
		{
			value8 = date8.getDate();
		}
		domainObject.setScheduledDate(value8);
		domainObject.setJourneyClock(ims.pathways.vo.domain.PatientJourneyClockInterfaceVoAssembler.extractPathwayClock(domainFactory, valueObject.getJourneyClock(), domMap));
		ims.framework.utils.DateTime dateTime10 = valueObject.getAchievedDate();
		java.util.Date value10 = null;
		if ( dateTime10 != null ) 
		{
			value10 = dateTime10.getJavaDate();
		}
		domainObject.setAchievedDate(value10);
		domainObject.setReadjustments(ims.pathways.vo.domain.TargetReadjustmentVoAssembler.extractTargetReadjustmentSet(domainFactory, valueObject.getReadjustments(), domainObject.getReadjustments(), domMap));		
		domainObject.setHasReadjustments(valueObject.getHasReadjustments());

		return domainObject;
	}

}
