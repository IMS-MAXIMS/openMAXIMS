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
 * @author Michael Noonan
 */
public class RTTManagementPatientPathwayJourneyVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.RTTManagementPatientPathwayJourneyVo copy(ims.RefMan.vo.RTTManagementPatientPathwayJourneyVo valueObjectDest, ims.RefMan.vo.RTTManagementPatientPathwayJourneyVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientPathwayJourney(valueObjectSrc.getID_PatientPathwayJourney());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Pathway
		valueObjectDest.setPathway(valueObjectSrc.getPathway());
		// CurrentClock
		valueObjectDest.setCurrentClock(valueObjectSrc.getCurrentClock());
		// NextValidationDate
		valueObjectDest.setNextValidationDate(valueObjectSrc.getNextValidationDate());
		// ClockHistory
		valueObjectDest.setClockHistory(valueObjectSrc.getClockHistory());
		// Referral
		valueObjectDest.setReferral(valueObjectSrc.getReferral());
		// ValidationCompletedDT
		valueObjectDest.setValidationCompletedDT(valueObjectSrc.getValidationCompletedDT());
		// ValidationCompletedBy
		valueObjectDest.setValidationCompletedBy(valueObjectSrc.getValidationCompletedBy());
		// LastValidationDate
		valueObjectDest.setLastValidationDate(valueObjectSrc.getLastValidationDate());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createRTTManagementPatientPathwayJourneyVoCollectionFromPatientPathwayJourney(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.pathways.domain.objects.PatientPathwayJourney objects.
	 */
	public static ims.RefMan.vo.RTTManagementPatientPathwayJourneyVoCollection createRTTManagementPatientPathwayJourneyVoCollectionFromPatientPathwayJourney(java.util.Set domainObjectSet)	
	{
		return createRTTManagementPatientPathwayJourneyVoCollectionFromPatientPathwayJourney(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.pathways.domain.objects.PatientPathwayJourney objects.
	 */
	public static ims.RefMan.vo.RTTManagementPatientPathwayJourneyVoCollection createRTTManagementPatientPathwayJourneyVoCollectionFromPatientPathwayJourney(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.RTTManagementPatientPathwayJourneyVoCollection voList = new ims.RefMan.vo.RTTManagementPatientPathwayJourneyVoCollection();
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
			ims.RefMan.vo.RTTManagementPatientPathwayJourneyVo vo = create(map, domainObject);
			
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
	public static ims.RefMan.vo.RTTManagementPatientPathwayJourneyVoCollection createRTTManagementPatientPathwayJourneyVoCollectionFromPatientPathwayJourney(java.util.List domainObjectList) 
	{
		return createRTTManagementPatientPathwayJourneyVoCollectionFromPatientPathwayJourney(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.pathways.domain.objects.PatientPathwayJourney objects.
	 */
	public static ims.RefMan.vo.RTTManagementPatientPathwayJourneyVoCollection createRTTManagementPatientPathwayJourneyVoCollectionFromPatientPathwayJourney(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.RTTManagementPatientPathwayJourneyVoCollection voList = new ims.RefMan.vo.RTTManagementPatientPathwayJourneyVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.pathways.domain.objects.PatientPathwayJourney domainObject = (ims.pathways.domain.objects.PatientPathwayJourney) domainObjectList.get(i);
			ims.RefMan.vo.RTTManagementPatientPathwayJourneyVo vo = create(map, domainObject);

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
	 public static java.util.Set extractPatientPathwayJourneySet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.RTTManagementPatientPathwayJourneyVoCollection voCollection) 
	 {
	 	return extractPatientPathwayJourneySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientPathwayJourneySet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.RTTManagementPatientPathwayJourneyVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.RTTManagementPatientPathwayJourneyVo vo = voCollection.get(i);
			ims.pathways.domain.objects.PatientPathwayJourney domainObject = RTTManagementPatientPathwayJourneyVoAssembler.extractPatientPathwayJourney(domainFactory, vo, domMap);

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
	 public static java.util.List extractPatientPathwayJourneyList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.RTTManagementPatientPathwayJourneyVoCollection voCollection) 
	 {
	 	return extractPatientPathwayJourneyList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientPathwayJourneyList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.RTTManagementPatientPathwayJourneyVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.RTTManagementPatientPathwayJourneyVo vo = voCollection.get(i);
			ims.pathways.domain.objects.PatientPathwayJourney domainObject = RTTManagementPatientPathwayJourneyVoAssembler.extractPatientPathwayJourney(domainFactory, vo, domMap);

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
	 public static ims.RefMan.vo.RTTManagementPatientPathwayJourneyVo create(ims.pathways.domain.objects.PatientPathwayJourney domainObject) 
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
	  public static ims.RefMan.vo.RTTManagementPatientPathwayJourneyVo create(DomainObjectMap map, ims.pathways.domain.objects.PatientPathwayJourney domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.RTTManagementPatientPathwayJourneyVo valueObject = (ims.RefMan.vo.RTTManagementPatientPathwayJourneyVo) map.getValueObject(domainObject, ims.RefMan.vo.RTTManagementPatientPathwayJourneyVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.RTTManagementPatientPathwayJourneyVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.RefMan.vo.RTTManagementPatientPathwayJourneyVo insert(ims.RefMan.vo.RTTManagementPatientPathwayJourneyVo valueObject, ims.pathways.domain.objects.PatientPathwayJourney domainObject) 
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
	 public static ims.RefMan.vo.RTTManagementPatientPathwayJourneyVo insert(DomainObjectMap map, ims.RefMan.vo.RTTManagementPatientPathwayJourneyVo valueObject, ims.pathways.domain.objects.PatientPathwayJourney domainObject) 
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
		// CurrentClock
		valueObject.setCurrentClock(ims.pathways.vo.domain.RTTManagementPathwayClockVoAssembler.create(map, domainObject.getCurrentClock()) );
		// NextValidationDate
		java.util.Date NextValidationDate = domainObject.getNextValidationDate();
		if ( null != NextValidationDate ) 
		{
			valueObject.setNextValidationDate(new ims.framework.utils.Date(NextValidationDate) );
		}
		// ClockHistory
		valueObject.setClockHistory(ims.pathways.vo.domain.RTTManagementPathwayClockVoAssembler.createRTTManagementPathwayClockVoCollectionFromPathwayClock(map, domainObject.getClockHistory()) );
		// Referral
		if (domainObject.getReferral() != null)
		{
			if(domainObject.getReferral() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getReferral();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setReferral(new ims.core.admin.vo.ReferralRefVo(id, -1));				
			}
			else
			{
				valueObject.setReferral(new ims.core.admin.vo.ReferralRefVo(domainObject.getReferral().getId(), domainObject.getReferral().getVersion()));
			}
		}
		// ValidationCompletedDT
		java.util.Date ValidationCompletedDT = domainObject.getValidationCompletedDT();
		if ( null != ValidationCompletedDT ) 
		{
			valueObject.setValidationCompletedDT(new ims.framework.utils.DateTime(ValidationCompletedDT) );
		}
		// ValidationCompletedBy
		valueObject.setValidationCompletedBy(ims.core.vo.domain.MemberOfStaffVoAssembler.create(map, domainObject.getValidationCompletedBy()) );
		// LastValidationDate
		java.util.Date LastValidationDate = domainObject.getLastValidationDate();
		if ( null != LastValidationDate ) 
		{
			valueObject.setLastValidationDate(new ims.framework.utils.Date(LastValidationDate) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.pathways.domain.objects.PatientPathwayJourney extractPatientPathwayJourney(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.RTTManagementPatientPathwayJourneyVo valueObject) 
	{
		return 	extractPatientPathwayJourney(domainFactory, valueObject, new HashMap());
	}

	public static ims.pathways.domain.objects.PatientPathwayJourney extractPatientPathwayJourney(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.RTTManagementPatientPathwayJourneyVo valueObject, HashMap domMap) 
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
			// ims.RefMan.vo.RTTManagementPatientPathwayJourneyVo ID_PatientPathwayJourney field is unknown
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

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.pathways.configuration.domain.objects.Pathway value1 = null;
		if ( null != valueObject.getPathway() ) 
		{
			if (valueObject.getPathway().getBoId() == null)
			{
				if (domMap.get(valueObject.getPathway()) != null)
				{
					value1 = (ims.pathways.configuration.domain.objects.Pathway)domMap.get(valueObject.getPathway());
				}
			}
			else
			{
				value1 = (ims.pathways.configuration.domain.objects.Pathway)domainFactory.getDomainObject(ims.pathways.configuration.domain.objects.Pathway.class, valueObject.getPathway().getBoId());
			}
		}
		domainObject.setPathway(value1);
		domainObject.setCurrentClock(ims.pathways.vo.domain.RTTManagementPathwayClockVoAssembler.extractPathwayClock(domainFactory, valueObject.getCurrentClock(), domMap));
		java.util.Date value3 = null;
		ims.framework.utils.Date date3 = valueObject.getNextValidationDate();		
		if ( date3 != null ) 
		{
			value3 = date3.getDate();
		}
		domainObject.setNextValidationDate(value3);

		// SaveAsRefVO treated as RefValueObject
		ims.pathways.vo.PathwayClockRefVoCollection refCollection4 = new ims.pathways.vo.PathwayClockRefVoCollection();
		if (valueObject.getClockHistory() != null)
		{
			for (int i4=0; i4<valueObject.getClockHistory().size(); i4++)
			{
				ims.pathways.vo.PathwayClockRefVo ref4 = (ims.pathways.vo.PathwayClockRefVo)valueObject.getClockHistory().get(i4);
				refCollection4.add(ref4);
			}
		}
		int size4 = (null == refCollection4) ? 0 : refCollection4.size();		
		java.util.Set domainClockHistory4 = domainObject.getClockHistory();
		if (domainClockHistory4 == null)
		{
			domainClockHistory4 = new java.util.HashSet();
		}
		java.util.Set newSet4  = new java.util.HashSet();
		for(int i=0; i<size4; i++) 
		{
			ims.pathways.vo.PathwayClockRefVo vo = refCollection4.get(i);					
			ims.pathways.domain.objects.PathwayClock dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.pathways.domain.objects.PathwayClock)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.pathways.domain.objects.PathwayClock)domainFactory.getDomainObject( ims.pathways.domain.objects.PathwayClock.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainClockHistory4.contains(dom))
			{
				domainClockHistory4.add(dom);
			}
			newSet4.add(dom);			
		}
		java.util.Set removedSet4 = new java.util.HashSet();
		java.util.Iterator iter4 = domainClockHistory4.iterator();
		//Find out which objects need to be removed
		while (iter4.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter4.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet4.contains(o))
			{
				removedSet4.add(o);
			}
		}
		iter4 = removedSet4.iterator();
		//Remove the unwanted objects
		while (iter4.hasNext())
		{
			domainClockHistory4.remove(iter4.next());
		}		
		
		domainObject.setClockHistory(domainClockHistory4);		
		ims.core.admin.domain.objects.Referral value5 = null;
		if ( null != valueObject.getReferral() ) 
		{
			if (valueObject.getReferral().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferral()) != null)
				{
					value5 = (ims.core.admin.domain.objects.Referral)domMap.get(valueObject.getReferral());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value5 = domainObject.getReferral();	
			}
			else
			{
				value5 = (ims.core.admin.domain.objects.Referral)domainFactory.getDomainObject(ims.core.admin.domain.objects.Referral.class, valueObject.getReferral().getBoId());
			}
		}
		domainObject.setReferral(value5);
		ims.framework.utils.DateTime dateTime6 = valueObject.getValidationCompletedDT();
		java.util.Date value6 = null;
		if ( dateTime6 != null ) 
		{
			value6 = dateTime6.getJavaDate();
		}
		domainObject.setValidationCompletedDT(value6);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value7 = null;
		if ( null != valueObject.getValidationCompletedBy() ) 
		{
			if (valueObject.getValidationCompletedBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getValidationCompletedBy()) != null)
				{
					value7 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getValidationCompletedBy());
				}
			}
			else
			{
				value7 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getValidationCompletedBy().getBoId());
			}
		}
		domainObject.setValidationCompletedBy(value7);
		java.util.Date value8 = null;
		ims.framework.utils.Date date8 = valueObject.getLastValidationDate();		
		if ( date8 != null ) 
		{
			value8 = date8.getDate();
		}
		domainObject.setLastValidationDate(value8);

		return domainObject;
	}

}
