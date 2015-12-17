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
public class PatientJourneyInterfaceVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.pathways.vo.PatientJourneyInterfaceVo copy(ims.pathways.vo.PatientJourneyInterfaceVo valueObjectDest, ims.pathways.vo.PatientJourneyInterfaceVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientPathwayJourney(valueObjectSrc.getID_PatientPathwayJourney());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Pathway
		valueObjectDest.setPathway(valueObjectSrc.getPathway());
		// StartDate
		valueObjectDest.setStartDate(valueObjectSrc.getStartDate());
		// EndedOnDate
		valueObjectDest.setEndedOnDate(valueObjectSrc.getEndedOnDate());
		// JourneyTargets
		valueObjectDest.setJourneyTargets(valueObjectSrc.getJourneyTargets());
		// ClockHistory
		valueObjectDest.setClockHistory(valueObjectSrc.getClockHistory());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// StatusHistory
		valueObjectDest.setStatusHistory(valueObjectSrc.getStatusHistory());
		// Referral
		valueObjectDest.setReferral(valueObjectSrc.getReferral());
		// Comments
		valueObjectDest.setComments(valueObjectSrc.getComments());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientJourneyInterfaceVoCollectionFromPatientPathwayJourney(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.pathways.domain.objects.PatientPathwayJourney objects.
	 */
	public static ims.pathways.vo.PatientJourneyInterfaceVoCollection createPatientJourneyInterfaceVoCollectionFromPatientPathwayJourney(java.util.Set domainObjectSet)	
	{
		return createPatientJourneyInterfaceVoCollectionFromPatientPathwayJourney(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.pathways.domain.objects.PatientPathwayJourney objects.
	 */
	public static ims.pathways.vo.PatientJourneyInterfaceVoCollection createPatientJourneyInterfaceVoCollectionFromPatientPathwayJourney(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.pathways.vo.PatientJourneyInterfaceVoCollection voList = new ims.pathways.vo.PatientJourneyInterfaceVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.pathways.domain.objects.PatientPathwayJourney domainObject = (ims.pathways.domain.objects.PatientPathwayJourney) iterator.next();
			ims.pathways.vo.PatientJourneyInterfaceVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.pathways.domain.objects.PatientPathwayJourney objects.
	 */
	public static ims.pathways.vo.PatientJourneyInterfaceVoCollection createPatientJourneyInterfaceVoCollectionFromPatientPathwayJourney(java.util.List domainObjectList) 
	{
		return createPatientJourneyInterfaceVoCollectionFromPatientPathwayJourney(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.pathways.domain.objects.PatientPathwayJourney objects.
	 */
	public static ims.pathways.vo.PatientJourneyInterfaceVoCollection createPatientJourneyInterfaceVoCollectionFromPatientPathwayJourney(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.pathways.vo.PatientJourneyInterfaceVoCollection voList = new ims.pathways.vo.PatientJourneyInterfaceVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.pathways.domain.objects.PatientPathwayJourney domainObject = (ims.pathways.domain.objects.PatientPathwayJourney) domainObjectList.get(i);
			ims.pathways.vo.PatientJourneyInterfaceVo vo = create(map, domainObject);

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
	 * Create the ims.pathways.domain.objects.PatientPathwayJourney set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientPathwayJourneySet(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PatientJourneyInterfaceVoCollection voCollection) 
	 {
	 	return extractPatientPathwayJourneySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientPathwayJourneySet(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PatientJourneyInterfaceVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.pathways.vo.PatientJourneyInterfaceVo vo = voCollection.get(i);
			ims.pathways.domain.objects.PatientPathwayJourney domainObject = PatientJourneyInterfaceVoAssembler.extractPatientPathwayJourney(domainFactory, vo, domMap);

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
	 * Create the ims.pathways.domain.objects.PatientPathwayJourney list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientPathwayJourneyList(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PatientJourneyInterfaceVoCollection voCollection) 
	 {
	 	return extractPatientPathwayJourneyList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientPathwayJourneyList(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PatientJourneyInterfaceVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.pathways.vo.PatientJourneyInterfaceVo vo = voCollection.get(i);
			ims.pathways.domain.objects.PatientPathwayJourney domainObject = PatientJourneyInterfaceVoAssembler.extractPatientPathwayJourney(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.pathways.domain.objects.PatientPathwayJourney object.
	 * @param domainObject ims.pathways.domain.objects.PatientPathwayJourney
	 */
	 public static ims.pathways.vo.PatientJourneyInterfaceVo create(ims.pathways.domain.objects.PatientPathwayJourney domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.pathways.domain.objects.PatientPathwayJourney object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.pathways.vo.PatientJourneyInterfaceVo create(DomainObjectMap map, ims.pathways.domain.objects.PatientPathwayJourney domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.pathways.vo.PatientJourneyInterfaceVo valueObject = (ims.pathways.vo.PatientJourneyInterfaceVo) map.getValueObject(domainObject, ims.pathways.vo.PatientJourneyInterfaceVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.pathways.vo.PatientJourneyInterfaceVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.pathways.domain.objects.PatientPathwayJourney
	 */
	 public static ims.pathways.vo.PatientJourneyInterfaceVo insert(ims.pathways.vo.PatientJourneyInterfaceVo valueObject, ims.pathways.domain.objects.PatientPathwayJourney domainObject) 
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
	 * @param domainObject ims.pathways.domain.objects.PatientPathwayJourney
	 */
	 public static ims.pathways.vo.PatientJourneyInterfaceVo insert(DomainObjectMap map, ims.pathways.vo.PatientJourneyInterfaceVo valueObject, ims.pathways.domain.objects.PatientPathwayJourney domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientPathwayJourney(domainObject.getId());
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
			
		// Pathway
		valueObject.setPathway(ims.pathways.vo.domain.PathwayLiteVoAssembler.create(map, domainObject.getPathway()) );
		// StartDate
		java.util.Date StartDate = domainObject.getStartDate();
		if ( null != StartDate ) 
		{
			valueObject.setStartDate(new ims.framework.utils.Date(StartDate) );
		}
		// EndedOnDate
		java.util.Date EndedOnDate = domainObject.getEndedOnDate();
		if ( null != EndedOnDate ) 
		{
			valueObject.setEndedOnDate(new ims.framework.utils.Date(EndedOnDate) );
		}
		// JourneyTargets
		valueObject.setJourneyTargets(ims.pathways.vo.domain.PatientJourneyJourneyTargetInterfaceVoAssembler.createPatientJourneyJourneyTargetInterfaceVoCollectionFromPatientJourneyTarget(map, domainObject.getPatientTargets()) );
		// ClockHistory
		valueObject.setClockHistory(ims.pathways.vo.domain.PathwayClockVoAssembler.createPathwayClockVoCollectionFromPathwayClock(map, domainObject.getClockHistory()) );
		// CurrentStatus
		valueObject.setCurrentStatus(ims.pathways.vo.domain.PatientJourneyStatusVoAssembler.create(map, domainObject.getCurrentStatus()) );
		// StatusHistory
		valueObject.setStatusHistory(ims.pathways.vo.domain.PatientJourneyStatusVoAssembler.createPatientJourneyStatusVoCollectionFromPatientJourneyStatus(map, domainObject.getStatusHistory()) );
		// Referral
		valueObject.setReferral(ims.core.vo.domain.ReferralListVoAssembler.create(map, domainObject.getReferral()) );
		// Comments
		valueObject.setComments(domainObject.getComments());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.pathways.domain.objects.PatientPathwayJourney extractPatientPathwayJourney(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PatientJourneyInterfaceVo valueObject) 
	{
		return 	extractPatientPathwayJourney(domainFactory, valueObject, new HashMap());
	}

	public static ims.pathways.domain.objects.PatientPathwayJourney extractPatientPathwayJourney(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PatientJourneyInterfaceVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientPathwayJourney();
		ims.pathways.domain.objects.PatientPathwayJourney domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.pathways.domain.objects.PatientPathwayJourney)domMap.get(valueObject);
			}
			// ims.pathways.vo.PatientJourneyInterfaceVo ID_PatientPathwayJourney field is unknown
			domainObject = new ims.pathways.domain.objects.PatientPathwayJourney();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientPathwayJourney());
			if (domMap.get(key) != null)
			{
				return (ims.pathways.domain.objects.PatientPathwayJourney)domMap.get(key);
			}
			domainObject = (ims.pathways.domain.objects.PatientPathwayJourney) domainFactory.getDomainObject(ims.pathways.domain.objects.PatientPathwayJourney.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientPathwayJourney());

		domainObject.setPathway(ims.pathways.vo.domain.PathwayLiteVoAssembler.extractPathway(domainFactory, valueObject.getPathway(), domMap));
		java.util.Date value2 = null;
		ims.framework.utils.Date date2 = valueObject.getStartDate();		
		if ( date2 != null ) 
		{
			value2 = date2.getDate();
		}
		domainObject.setStartDate(value2);
		java.util.Date value3 = null;
		ims.framework.utils.Date date3 = valueObject.getEndedOnDate();		
		if ( date3 != null ) 
		{
			value3 = date3.getDate();
		}
		domainObject.setEndedOnDate(value3);
		domainObject.setPatientTargets(ims.pathways.vo.domain.PatientJourneyJourneyTargetInterfaceVoAssembler.extractPatientJourneyTargetSet(domainFactory, valueObject.getJourneyTargets(), domainObject.getPatientTargets(), domMap));		
		domainObject.setClockHistory(ims.pathways.vo.domain.PathwayClockVoAssembler.extractPathwayClockSet(domainFactory, valueObject.getClockHistory(), domainObject.getClockHistory(), domMap));		
		domainObject.setCurrentStatus(ims.pathways.vo.domain.PatientJourneyStatusVoAssembler.extractPatientJourneyStatus(domainFactory, valueObject.getCurrentStatus(), domMap));
		domainObject.setStatusHistory(ims.pathways.vo.domain.PatientJourneyStatusVoAssembler.extractPatientJourneyStatusSet(domainFactory, valueObject.getStatusHistory(), domainObject.getStatusHistory(), domMap));		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.Referral value8 = null;
		if ( null != valueObject.getReferral() ) 
		{
			if (valueObject.getReferral().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferral()) != null)
				{
					value8 = (ims.core.admin.domain.objects.Referral)domMap.get(valueObject.getReferral());
				}
			}
			else
			{
				value8 = (ims.core.admin.domain.objects.Referral)domainFactory.getDomainObject(ims.core.admin.domain.objects.Referral.class, valueObject.getReferral().getBoId());
			}
		}
		domainObject.setReferral(value8);
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
