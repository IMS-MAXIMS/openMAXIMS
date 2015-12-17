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
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cornel Ventuneac
 */
public class PatientJournayTargetForTransferOfCareVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.PatientJournayTargetForTransferOfCareVo copy(ims.RefMan.vo.PatientJournayTargetForTransferOfCareVo valueObjectDest, ims.RefMan.vo.PatientJournayTargetForTransferOfCareVo valueObjectSrc) 
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
		// StatusHistory
		valueObjectDest.setStatusHistory(valueObjectSrc.getStatusHistory());
		// JourneyClock
		valueObjectDest.setJourneyClock(valueObjectSrc.getJourneyClock());
		// AchievedDate
		valueObjectDest.setAchievedDate(valueObjectSrc.getAchievedDate());
		// ScheduledDate
		valueObjectDest.setScheduledDate(valueObjectSrc.getScheduledDate());
		// CancelledDate
		valueObjectDest.setCancelledDate(valueObjectSrc.getCancelledDate());
		// hasCancelledEvents
		valueObjectDest.setHasCancelledEvents(valueObjectSrc.getHasCancelledEvents());
		// Events
		valueObjectDest.setEvents(valueObjectSrc.getEvents());
		// PathwayJourney
		valueObjectDest.setPathwayJourney(valueObjectSrc.getPathwayJourney());
		// AchievedVariance
		valueObjectDest.setAchievedVariance(valueObjectSrc.getAchievedVariance());
		// TargetCalFromDate
		valueObjectDest.setTargetCalFromDate(valueObjectSrc.getTargetCalFromDate());
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
 	 * If more than one call to an Assembler is made then #createPatientJournayTargetForTransferOfCareVoCollectionFromPatientJourneyTarget(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.pathways.domain.objects.PatientJourneyTarget objects.
	 */
	public static ims.RefMan.vo.PatientJournayTargetForTransferOfCareVoCollection createPatientJournayTargetForTransferOfCareVoCollectionFromPatientJourneyTarget(java.util.Set domainObjectSet)	
	{
		return createPatientJournayTargetForTransferOfCareVoCollectionFromPatientJourneyTarget(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.pathways.domain.objects.PatientJourneyTarget objects.
	 */
	public static ims.RefMan.vo.PatientJournayTargetForTransferOfCareVoCollection createPatientJournayTargetForTransferOfCareVoCollectionFromPatientJourneyTarget(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.PatientJournayTargetForTransferOfCareVoCollection voList = new ims.RefMan.vo.PatientJournayTargetForTransferOfCareVoCollection();
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
			ims.RefMan.vo.PatientJournayTargetForTransferOfCareVo vo = create(map, domainObject);
			
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
	public static ims.RefMan.vo.PatientJournayTargetForTransferOfCareVoCollection createPatientJournayTargetForTransferOfCareVoCollectionFromPatientJourneyTarget(java.util.List domainObjectList) 
	{
		return createPatientJournayTargetForTransferOfCareVoCollectionFromPatientJourneyTarget(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.pathways.domain.objects.PatientJourneyTarget objects.
	 */
	public static ims.RefMan.vo.PatientJournayTargetForTransferOfCareVoCollection createPatientJournayTargetForTransferOfCareVoCollectionFromPatientJourneyTarget(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.PatientJournayTargetForTransferOfCareVoCollection voList = new ims.RefMan.vo.PatientJournayTargetForTransferOfCareVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.pathways.domain.objects.PatientJourneyTarget domainObject = (ims.pathways.domain.objects.PatientJourneyTarget) domainObjectList.get(i);
			ims.RefMan.vo.PatientJournayTargetForTransferOfCareVo vo = create(map, domainObject);

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
	 public static java.util.Set extractPatientJourneyTargetSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientJournayTargetForTransferOfCareVoCollection voCollection) 
	 {
	 	return extractPatientJourneyTargetSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientJourneyTargetSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientJournayTargetForTransferOfCareVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientJournayTargetForTransferOfCareVo vo = voCollection.get(i);
			ims.pathways.domain.objects.PatientJourneyTarget domainObject = PatientJournayTargetForTransferOfCareVoAssembler.extractPatientJourneyTarget(domainFactory, vo, domMap);

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
	 public static java.util.List extractPatientJourneyTargetList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientJournayTargetForTransferOfCareVoCollection voCollection) 
	 {
	 	return extractPatientJourneyTargetList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientJourneyTargetList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientJournayTargetForTransferOfCareVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientJournayTargetForTransferOfCareVo vo = voCollection.get(i);
			ims.pathways.domain.objects.PatientJourneyTarget domainObject = PatientJournayTargetForTransferOfCareVoAssembler.extractPatientJourneyTarget(domainFactory, vo, domMap);

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
	 public static ims.RefMan.vo.PatientJournayTargetForTransferOfCareVo create(ims.pathways.domain.objects.PatientJourneyTarget domainObject) 
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
	  public static ims.RefMan.vo.PatientJournayTargetForTransferOfCareVo create(DomainObjectMap map, ims.pathways.domain.objects.PatientJourneyTarget domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.PatientJournayTargetForTransferOfCareVo valueObject = (ims.RefMan.vo.PatientJournayTargetForTransferOfCareVo) map.getValueObject(domainObject, ims.RefMan.vo.PatientJournayTargetForTransferOfCareVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.PatientJournayTargetForTransferOfCareVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.RefMan.vo.PatientJournayTargetForTransferOfCareVo insert(ims.RefMan.vo.PatientJournayTargetForTransferOfCareVo valueObject, ims.pathways.domain.objects.PatientJourneyTarget domainObject) 
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
	 public static ims.RefMan.vo.PatientJournayTargetForTransferOfCareVo insert(DomainObjectMap map, ims.RefMan.vo.PatientJournayTargetForTransferOfCareVo valueObject, ims.pathways.domain.objects.PatientJourneyTarget domainObject) 
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
		if (domainObject.getPathwayTarget() != null)
		{
			if(domainObject.getPathwayTarget() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPathwayTarget();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPathwayTarget(new ims.pathways.configuration.vo.PathwayTargetRefVo(id, -1));				
			}
			else
			{
				valueObject.setPathwayTarget(new ims.pathways.configuration.vo.PathwayTargetRefVo(domainObject.getPathwayTarget().getId(), domainObject.getPathwayTarget().getVersion()));
			}
		}
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
		// StatusHistory
		valueObject.setStatusHistory(ims.pathways.vo.domain.JourneyTargetStatusVoAssembler.createJourneyTargetStatusVoCollectionFromJourneyTargetStatus(map, domainObject.getStatusHistory()) );
		// JourneyClock
		valueObject.setJourneyClock(ims.RefMan.vo.domain.PathwayClockForTransferOfCareVoAssembler.create(map, domainObject.getJourneyClock()) );
		// AchievedDate
		java.util.Date AchievedDate = domainObject.getAchievedDate();
		if ( null != AchievedDate ) 
		{
			valueObject.setAchievedDate(new ims.framework.utils.DateTime(AchievedDate) );
		}
		// ScheduledDate
		java.util.Date ScheduledDate = domainObject.getScheduledDate();
		if ( null != ScheduledDate ) 
		{
			valueObject.setScheduledDate(new ims.framework.utils.Date(ScheduledDate) );
		}
		// CancelledDate
		java.util.Date CancelledDate = domainObject.getCancelledDate();
		if ( null != CancelledDate ) 
		{
			valueObject.setCancelledDate(new ims.framework.utils.Date(CancelledDate) );
		}
		// hasCancelledEvents
		valueObject.setHasCancelledEvents( domainObject.isHasCancelledEvents() );
		// Events
		valueObject.setEvents(ims.RefMan.vo.domain.PatientEventForTransferOfCareVoAssembler.createPatientEventForTransferOfCareVoCollectionFromPatientEvent(map, domainObject.getEvents()) );
		// PathwayJourney
		if (domainObject.getPathwayJourney() != null)
		{
			if(domainObject.getPathwayJourney() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPathwayJourney();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPathwayJourney(new ims.pathways.vo.PatientPathwayJourneyRefVo(id, -1));				
			}
			else
			{
				valueObject.setPathwayJourney(new ims.pathways.vo.PatientPathwayJourneyRefVo(domainObject.getPathwayJourney().getId(), domainObject.getPathwayJourney().getVersion()));
			}
		}
		// AchievedVariance
		valueObject.setAchievedVariance(domainObject.getAchievedVariance());
		// TargetCalFromDate
		java.util.Date TargetCalFromDate = domainObject.getTargetCalFromDate();
		if ( null != TargetCalFromDate ) 
		{
			valueObject.setTargetCalFromDate(new ims.framework.utils.Date(TargetCalFromDate) );
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
	public static ims.pathways.domain.objects.PatientJourneyTarget extractPatientJourneyTarget(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientJournayTargetForTransferOfCareVo valueObject) 
	{
		return 	extractPatientJourneyTarget(domainFactory, valueObject, new HashMap());
	}

	public static ims.pathways.domain.objects.PatientJourneyTarget extractPatientJourneyTarget(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientJournayTargetForTransferOfCareVo valueObject, HashMap domMap) 
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
			// ims.RefMan.vo.PatientJournayTargetForTransferOfCareVo ID_PatientJourneyTarget field is unknown
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

		ims.pathways.configuration.domain.objects.PathwayTarget value1 = null;
		if ( null != valueObject.getPathwayTarget() ) 
		{
			if (valueObject.getPathwayTarget().getBoId() == null)
			{
				if (domMap.get(valueObject.getPathwayTarget()) != null)
				{
					value1 = (ims.pathways.configuration.domain.objects.PathwayTarget)domMap.get(valueObject.getPathwayTarget());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getPathwayTarget();	
			}
			else
			{
				value1 = (ims.pathways.configuration.domain.objects.PathwayTarget)domainFactory.getDomainObject(ims.pathways.configuration.domain.objects.PathwayTarget.class, valueObject.getPathwayTarget().getBoId());
			}
		}
		domainObject.setPathwayTarget(value1);
		domainObject.setWeekNumber(valueObject.getWeekNumber());
		java.util.Date value3 = null;
		ims.framework.utils.Date date3 = valueObject.getTargetDate();		
		if ( date3 != null ) 
		{
			value3 = date3.getDate();
		}
		domainObject.setTargetDate(value3);
		domainObject.setCurrentStatus(ims.pathways.vo.domain.JourneyTargetStatusVoAssembler.extractJourneyTargetStatus(domainFactory, valueObject.getCurrentStatus(), domMap));
		domainObject.setStatusHistory(ims.pathways.vo.domain.JourneyTargetStatusVoAssembler.extractJourneyTargetStatusSet(domainFactory, valueObject.getStatusHistory(), domainObject.getStatusHistory(), domMap));		
		domainObject.setJourneyClock(ims.RefMan.vo.domain.PathwayClockForTransferOfCareVoAssembler.extractPathwayClock(domainFactory, valueObject.getJourneyClock(), domMap));
		ims.framework.utils.DateTime dateTime7 = valueObject.getAchievedDate();
		java.util.Date value7 = null;
		if ( dateTime7 != null ) 
		{
			value7 = dateTime7.getJavaDate();
		}
		domainObject.setAchievedDate(value7);
		java.util.Date value8 = null;
		ims.framework.utils.Date date8 = valueObject.getScheduledDate();		
		if ( date8 != null ) 
		{
			value8 = date8.getDate();
		}
		domainObject.setScheduledDate(value8);
		java.util.Date value9 = null;
		ims.framework.utils.Date date9 = valueObject.getCancelledDate();		
		if ( date9 != null ) 
		{
			value9 = date9.getDate();
		}
		domainObject.setCancelledDate(value9);
		domainObject.setHasCancelledEvents(valueObject.getHasCancelledEvents());
		domainObject.setEvents(ims.RefMan.vo.domain.PatientEventForTransferOfCareVoAssembler.extractPatientEventSet(domainFactory, valueObject.getEvents(), domainObject.getEvents(), domMap));		
		ims.pathways.domain.objects.PatientPathwayJourney value12 = null;
		if ( null != valueObject.getPathwayJourney() ) 
		{
			if (valueObject.getPathwayJourney().getBoId() == null)
			{
				if (domMap.get(valueObject.getPathwayJourney()) != null)
				{
					value12 = (ims.pathways.domain.objects.PatientPathwayJourney)domMap.get(valueObject.getPathwayJourney());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value12 = domainObject.getPathwayJourney();	
			}
			else
			{
				value12 = (ims.pathways.domain.objects.PatientPathwayJourney)domainFactory.getDomainObject(ims.pathways.domain.objects.PatientPathwayJourney.class, valueObject.getPathwayJourney().getBoId());
			}
		}
		domainObject.setPathwayJourney(value12);
		domainObject.setAchievedVariance(valueObject.getAchievedVariance());
		java.util.Date value14 = null;
		ims.framework.utils.Date date14 = valueObject.getTargetCalFromDate();		
		if ( date14 != null ) 
		{
			value14 = date14.getDate();
		}
		domainObject.setTargetCalFromDate(value14);

		// SaveAsRefVO treated as RefValueObject
		ims.pathways.vo.TargetReadjustmentRefVoCollection refCollection15 = new ims.pathways.vo.TargetReadjustmentRefVoCollection();
		if (valueObject.getReadjustments() != null)
		{
			for (int i15=0; i15<valueObject.getReadjustments().size(); i15++)
			{
				ims.pathways.vo.TargetReadjustmentRefVo ref15 = (ims.pathways.vo.TargetReadjustmentRefVo)valueObject.getReadjustments().get(i15);
				refCollection15.add(ref15);
			}
		}
		int size15 = (null == refCollection15) ? 0 : refCollection15.size();		
		java.util.Set domainReadjustments15 = domainObject.getReadjustments();
		if (domainReadjustments15 == null)
		{
			domainReadjustments15 = new java.util.HashSet();
		}
		java.util.Set newSet15  = new java.util.HashSet();
		for(int i=0; i<size15; i++) 
		{
			ims.pathways.vo.TargetReadjustmentRefVo vo = refCollection15.get(i);					
			ims.pathways.domain.objects.TargetReadjustment dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.pathways.domain.objects.TargetReadjustment)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.pathways.domain.objects.TargetReadjustment)domainFactory.getDomainObject( ims.pathways.domain.objects.TargetReadjustment.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainReadjustments15.contains(dom))
			{
				domainReadjustments15.add(dom);
			}
			newSet15.add(dom);			
		}
		java.util.Set removedSet15 = new java.util.HashSet();
		java.util.Iterator iter15 = domainReadjustments15.iterator();
		//Find out which objects need to be removed
		while (iter15.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter15.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet15.contains(o))
			{
				removedSet15.add(o);
			}
		}
		iter15 = removedSet15.iterator();
		//Remove the unwanted objects
		while (iter15.hasNext())
		{
			domainReadjustments15.remove(iter15.next());
		}		
		
		domainObject.setReadjustments(domainReadjustments15);		
		domainObject.setHasReadjustments(valueObject.getHasReadjustments());

		return domainObject;
	}

}
