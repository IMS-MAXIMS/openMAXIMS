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
 * Generated on 16/04/2014, 12:32
 *
 */
package ims.emergency.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class EmergencyAttendanceInvestigationCodingSequenceItemVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.EmergencyAttendanceInvestigationCodingSequenceItemVo copy(ims.emergency.vo.EmergencyAttendanceInvestigationCodingSequenceItemVo valueObjectDest, ims.emergency.vo.EmergencyAttendanceInvestigationCodingSequenceItemVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_EmergencyAttendanceInvestigationCodingSequenceItem(valueObjectSrc.getID_EmergencyAttendanceInvestigationCodingSequenceItem());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// OrderInvestigation
		valueObjectDest.setOrderInvestigation(valueObjectSrc.getOrderInvestigation());
		// EmergencyInvestigation
		valueObjectDest.setEmergencyInvestigation(valueObjectSrc.getEmergencyInvestigation());
		// CodingSequence
		valueObjectDest.setCodingSequence(valueObjectSrc.getCodingSequence());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createEmergencyAttendanceInvestigationCodingSequenceItemVoCollectionFromEmergencyAttendanceInvestigationCodingSequenceItem(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.emergency.domain.objects.EmergencyAttendanceInvestigationCodingSequenceItem objects.
	 */
	public static ims.emergency.vo.EmergencyAttendanceInvestigationCodingSequenceItemVoCollection createEmergencyAttendanceInvestigationCodingSequenceItemVoCollectionFromEmergencyAttendanceInvestigationCodingSequenceItem(java.util.Set domainObjectSet)	
	{
		return createEmergencyAttendanceInvestigationCodingSequenceItemVoCollectionFromEmergencyAttendanceInvestigationCodingSequenceItem(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.emergency.domain.objects.EmergencyAttendanceInvestigationCodingSequenceItem objects.
	 */
	public static ims.emergency.vo.EmergencyAttendanceInvestigationCodingSequenceItemVoCollection createEmergencyAttendanceInvestigationCodingSequenceItemVoCollectionFromEmergencyAttendanceInvestigationCodingSequenceItem(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.EmergencyAttendanceInvestigationCodingSequenceItemVoCollection voList = new ims.emergency.vo.EmergencyAttendanceInvestigationCodingSequenceItemVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.emergency.domain.objects.EmergencyAttendanceInvestigationCodingSequenceItem domainObject = (ims.emergency.domain.objects.EmergencyAttendanceInvestigationCodingSequenceItem) iterator.next();
			ims.emergency.vo.EmergencyAttendanceInvestigationCodingSequenceItemVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.emergency.domain.objects.EmergencyAttendanceInvestigationCodingSequenceItem objects.
	 */
	public static ims.emergency.vo.EmergencyAttendanceInvestigationCodingSequenceItemVoCollection createEmergencyAttendanceInvestigationCodingSequenceItemVoCollectionFromEmergencyAttendanceInvestigationCodingSequenceItem(java.util.List domainObjectList) 
	{
		return createEmergencyAttendanceInvestigationCodingSequenceItemVoCollectionFromEmergencyAttendanceInvestigationCodingSequenceItem(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.emergency.domain.objects.EmergencyAttendanceInvestigationCodingSequenceItem objects.
	 */
	public static ims.emergency.vo.EmergencyAttendanceInvestigationCodingSequenceItemVoCollection createEmergencyAttendanceInvestigationCodingSequenceItemVoCollectionFromEmergencyAttendanceInvestigationCodingSequenceItem(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.EmergencyAttendanceInvestigationCodingSequenceItemVoCollection voList = new ims.emergency.vo.EmergencyAttendanceInvestigationCodingSequenceItemVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.emergency.domain.objects.EmergencyAttendanceInvestigationCodingSequenceItem domainObject = (ims.emergency.domain.objects.EmergencyAttendanceInvestigationCodingSequenceItem) domainObjectList.get(i);
			ims.emergency.vo.EmergencyAttendanceInvestigationCodingSequenceItemVo vo = create(map, domainObject);

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
	 * Create the ims.emergency.domain.objects.EmergencyAttendanceInvestigationCodingSequenceItem set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractEmergencyAttendanceInvestigationCodingSequenceItemSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EmergencyAttendanceInvestigationCodingSequenceItemVoCollection voCollection) 
	 {
	 	return extractEmergencyAttendanceInvestigationCodingSequenceItemSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractEmergencyAttendanceInvestigationCodingSequenceItemSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EmergencyAttendanceInvestigationCodingSequenceItemVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.EmergencyAttendanceInvestigationCodingSequenceItemVo vo = voCollection.get(i);
			ims.emergency.domain.objects.EmergencyAttendanceInvestigationCodingSequenceItem domainObject = EmergencyAttendanceInvestigationCodingSequenceItemVoAssembler.extractEmergencyAttendanceInvestigationCodingSequenceItem(domainFactory, vo, domMap);

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
	 * Create the ims.emergency.domain.objects.EmergencyAttendanceInvestigationCodingSequenceItem list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractEmergencyAttendanceInvestigationCodingSequenceItemList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EmergencyAttendanceInvestigationCodingSequenceItemVoCollection voCollection) 
	 {
	 	return extractEmergencyAttendanceInvestigationCodingSequenceItemList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractEmergencyAttendanceInvestigationCodingSequenceItemList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EmergencyAttendanceInvestigationCodingSequenceItemVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.EmergencyAttendanceInvestigationCodingSequenceItemVo vo = voCollection.get(i);
			ims.emergency.domain.objects.EmergencyAttendanceInvestigationCodingSequenceItem domainObject = EmergencyAttendanceInvestigationCodingSequenceItemVoAssembler.extractEmergencyAttendanceInvestigationCodingSequenceItem(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.emergency.domain.objects.EmergencyAttendanceInvestigationCodingSequenceItem object.
	 * @param domainObject ims.emergency.domain.objects.EmergencyAttendanceInvestigationCodingSequenceItem
	 */
	 public static ims.emergency.vo.EmergencyAttendanceInvestigationCodingSequenceItemVo create(ims.emergency.domain.objects.EmergencyAttendanceInvestigationCodingSequenceItem domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.emergency.domain.objects.EmergencyAttendanceInvestigationCodingSequenceItem object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.emergency.vo.EmergencyAttendanceInvestigationCodingSequenceItemVo create(DomainObjectMap map, ims.emergency.domain.objects.EmergencyAttendanceInvestigationCodingSequenceItem domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.EmergencyAttendanceInvestigationCodingSequenceItemVo valueObject = (ims.emergency.vo.EmergencyAttendanceInvestigationCodingSequenceItemVo) map.getValueObject(domainObject, ims.emergency.vo.EmergencyAttendanceInvestigationCodingSequenceItemVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.EmergencyAttendanceInvestigationCodingSequenceItemVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.emergency.domain.objects.EmergencyAttendanceInvestigationCodingSequenceItem
	 */
	 public static ims.emergency.vo.EmergencyAttendanceInvestigationCodingSequenceItemVo insert(ims.emergency.vo.EmergencyAttendanceInvestigationCodingSequenceItemVo valueObject, ims.emergency.domain.objects.EmergencyAttendanceInvestigationCodingSequenceItem domainObject) 
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
	 * @param domainObject ims.emergency.domain.objects.EmergencyAttendanceInvestigationCodingSequenceItem
	 */
	 public static ims.emergency.vo.EmergencyAttendanceInvestigationCodingSequenceItemVo insert(DomainObjectMap map, ims.emergency.vo.EmergencyAttendanceInvestigationCodingSequenceItemVo valueObject, ims.emergency.domain.objects.EmergencyAttendanceInvestigationCodingSequenceItem domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_EmergencyAttendanceInvestigationCodingSequenceItem(domainObject.getId());
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
			
		// OrderInvestigation
		valueObject.setOrderInvestigation(domainObject.getOrderInvestigation());
		// EmergencyInvestigation
		if (domainObject.getEmergencyInvestigation() != null)
		{
			if(domainObject.getEmergencyInvestigation() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getEmergencyInvestigation();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setEmergencyInvestigation(new ims.emergency.vo.InvestigationAttendenceDetailRefVo(id, -1));				
			}
			else
			{
				valueObject.setEmergencyInvestigation(new ims.emergency.vo.InvestigationAttendenceDetailRefVo(domainObject.getEmergencyInvestigation().getId(), domainObject.getEmergencyInvestigation().getVersion()));
			}
		}
		// CodingSequence
		valueObject.setCodingSequence(domainObject.getCodingSequence());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.emergency.domain.objects.EmergencyAttendanceInvestigationCodingSequenceItem extractEmergencyAttendanceInvestigationCodingSequenceItem(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EmergencyAttendanceInvestigationCodingSequenceItemVo valueObject) 
	{
		return 	extractEmergencyAttendanceInvestigationCodingSequenceItem(domainFactory, valueObject, new HashMap());
	}

	public static ims.emergency.domain.objects.EmergencyAttendanceInvestigationCodingSequenceItem extractEmergencyAttendanceInvestigationCodingSequenceItem(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EmergencyAttendanceInvestigationCodingSequenceItemVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_EmergencyAttendanceInvestigationCodingSequenceItem();
		ims.emergency.domain.objects.EmergencyAttendanceInvestigationCodingSequenceItem domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.emergency.domain.objects.EmergencyAttendanceInvestigationCodingSequenceItem)domMap.get(valueObject);
			}
			// ims.emergency.vo.EmergencyAttendanceInvestigationCodingSequenceItemVo ID_EmergencyAttendanceInvestigationCodingSequenceItem field is unknown
			domainObject = new ims.emergency.domain.objects.EmergencyAttendanceInvestigationCodingSequenceItem();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_EmergencyAttendanceInvestigationCodingSequenceItem());
			if (domMap.get(key) != null)
			{
				return (ims.emergency.domain.objects.EmergencyAttendanceInvestigationCodingSequenceItem)domMap.get(key);
			}
			domainObject = (ims.emergency.domain.objects.EmergencyAttendanceInvestigationCodingSequenceItem) domainFactory.getDomainObject(ims.emergency.domain.objects.EmergencyAttendanceInvestigationCodingSequenceItem.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_EmergencyAttendanceInvestigationCodingSequenceItem());

		domainObject.setOrderInvestigation(valueObject.getOrderInvestigation());
		ims.emergency.domain.objects.InvestigationAttendenceDetail value2 = null;
		if ( null != valueObject.getEmergencyInvestigation() ) 
		{
			if (valueObject.getEmergencyInvestigation().getBoId() == null)
			{
				if (domMap.get(valueObject.getEmergencyInvestigation()) != null)
				{
					value2 = (ims.emergency.domain.objects.InvestigationAttendenceDetail)domMap.get(valueObject.getEmergencyInvestigation());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getEmergencyInvestigation();	
			}
			else
			{
				value2 = (ims.emergency.domain.objects.InvestigationAttendenceDetail)domainFactory.getDomainObject(ims.emergency.domain.objects.InvestigationAttendenceDetail.class, valueObject.getEmergencyInvestigation().getBoId());
			}
		}
		domainObject.setEmergencyInvestigation(value2);
		domainObject.setCodingSequence(valueObject.getCodingSequence());

		return domainObject;
	}

}
