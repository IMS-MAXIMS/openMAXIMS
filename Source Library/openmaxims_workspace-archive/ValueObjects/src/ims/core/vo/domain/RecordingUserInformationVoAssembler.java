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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Peter Martin
 */
public class RecordingUserInformationVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.RecordingUserInformationVo copy(ims.core.vo.RecordingUserInformationVo valueObjectDest, ims.core.vo.RecordingUserInformationVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_RecordingUserInformation(valueObjectSrc.getID_RecordingUserInformation());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// RecordingUser
		valueObjectDest.setRecordingUser(valueObjectSrc.getRecordingUser());
		// RecordingDateTime
		valueObjectDest.setRecordingDateTime(valueObjectSrc.getRecordingDateTime());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createRecordingUserInformationVoCollectionFromRecordingUserInformation(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.RecordingUserInformation objects.
	 */
	public static ims.core.vo.RecordingUserInformationVoCollection createRecordingUserInformationVoCollectionFromRecordingUserInformation(java.util.Set domainObjectSet)	
	{
		return createRecordingUserInformationVoCollectionFromRecordingUserInformation(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.RecordingUserInformation objects.
	 */
	public static ims.core.vo.RecordingUserInformationVoCollection createRecordingUserInformationVoCollectionFromRecordingUserInformation(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.RecordingUserInformationVoCollection voList = new ims.core.vo.RecordingUserInformationVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.RecordingUserInformation domainObject = (ims.core.clinical.domain.objects.RecordingUserInformation) iterator.next();
			ims.core.vo.RecordingUserInformationVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.RecordingUserInformation objects.
	 */
	public static ims.core.vo.RecordingUserInformationVoCollection createRecordingUserInformationVoCollectionFromRecordingUserInformation(java.util.List domainObjectList) 
	{
		return createRecordingUserInformationVoCollectionFromRecordingUserInformation(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.RecordingUserInformation objects.
	 */
	public static ims.core.vo.RecordingUserInformationVoCollection createRecordingUserInformationVoCollectionFromRecordingUserInformation(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.RecordingUserInformationVoCollection voList = new ims.core.vo.RecordingUserInformationVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.RecordingUserInformation domainObject = (ims.core.clinical.domain.objects.RecordingUserInformation) domainObjectList.get(i);
			ims.core.vo.RecordingUserInformationVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.RecordingUserInformation set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractRecordingUserInformationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.RecordingUserInformationVoCollection voCollection) 
	 {
	 	return extractRecordingUserInformationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractRecordingUserInformationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.RecordingUserInformationVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.RecordingUserInformationVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.RecordingUserInformation domainObject = RecordingUserInformationVoAssembler.extractRecordingUserInformation(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.RecordingUserInformation list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractRecordingUserInformationList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.RecordingUserInformationVoCollection voCollection) 
	 {
	 	return extractRecordingUserInformationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractRecordingUserInformationList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.RecordingUserInformationVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.RecordingUserInformationVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.RecordingUserInformation domainObject = RecordingUserInformationVoAssembler.extractRecordingUserInformation(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.RecordingUserInformation object.
	 * @param domainObject ims.core.clinical.domain.objects.RecordingUserInformation
	 */
	 public static ims.core.vo.RecordingUserInformationVo create(ims.core.clinical.domain.objects.RecordingUserInformation domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.RecordingUserInformation object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.RecordingUserInformationVo create(DomainObjectMap map, ims.core.clinical.domain.objects.RecordingUserInformation domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.RecordingUserInformationVo valueObject = (ims.core.vo.RecordingUserInformationVo) map.getValueObject(domainObject, ims.core.vo.RecordingUserInformationVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.RecordingUserInformationVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.RecordingUserInformation
	 */
	 public static ims.core.vo.RecordingUserInformationVo insert(ims.core.vo.RecordingUserInformationVo valueObject, ims.core.clinical.domain.objects.RecordingUserInformation domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.RecordingUserInformation
	 */
	 public static ims.core.vo.RecordingUserInformationVo insert(DomainObjectMap map, ims.core.vo.RecordingUserInformationVo valueObject, ims.core.clinical.domain.objects.RecordingUserInformation domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_RecordingUserInformation(domainObject.getId());
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
			
		// RecordingUser
		valueObject.setRecordingUser(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getRecordingUser()) );
		// RecordingDateTime
		java.util.Date RecordingDateTime = domainObject.getRecordingDateTime();
		if ( null != RecordingDateTime ) 
		{
			valueObject.setRecordingDateTime(new ims.framework.utils.DateTime(RecordingDateTime) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.RecordingUserInformation extractRecordingUserInformation(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.RecordingUserInformationVo valueObject) 
	{
		return 	extractRecordingUserInformation(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.RecordingUserInformation extractRecordingUserInformation(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.RecordingUserInformationVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_RecordingUserInformation();
		ims.core.clinical.domain.objects.RecordingUserInformation domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.RecordingUserInformation)domMap.get(valueObject);
			}
			// ims.core.vo.RecordingUserInformationVo ID_RecordingUserInformation field is unknown
			domainObject = new ims.core.clinical.domain.objects.RecordingUserInformation();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_RecordingUserInformation());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.RecordingUserInformation)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.RecordingUserInformation) domainFactory.getDomainObject(ims.core.clinical.domain.objects.RecordingUserInformation.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_RecordingUserInformation());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value1 = null;
		if ( null != valueObject.getRecordingUser() ) 
		{
			if (valueObject.getRecordingUser().getBoId() == null)
			{
				if (domMap.get(valueObject.getRecordingUser()) != null)
				{
					value1 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getRecordingUser());
				}
			}
			else
			{
				value1 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getRecordingUser().getBoId());
			}
		}
		domainObject.setRecordingUser(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getRecordingDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setRecordingDateTime(value2);

		return domainObject;
	}

}
