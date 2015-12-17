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
 * @author Barbara Worwood
 */
public class RTTStatusPointVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.pathways.vo.RTTStatusPointVo copy(ims.pathways.vo.RTTStatusPointVo valueObjectDest, ims.pathways.vo.RTTStatusPointVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_RTTStatusPoint(valueObjectSrc.getID_RTTStatusPoint());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// NationalCode
		valueObjectDest.setNationalCode(valueObjectSrc.getNationalCode());
		// Description
		valueObjectDest.setDescription(valueObjectSrc.getDescription());
		// LocalCode
		valueObjectDest.setLocalCode(valueObjectSrc.getLocalCode());
		// Children
		valueObjectDest.setChildren(valueObjectSrc.getChildren());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createRTTStatusPointVoCollectionFromRTTStatusPoint(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.pathways.configuration.domain.objects.RTTStatusPoint objects.
	 */
	public static ims.pathways.vo.RTTStatusPointVoCollection createRTTStatusPointVoCollectionFromRTTStatusPoint(java.util.Set domainObjectSet)	
	{
		return createRTTStatusPointVoCollectionFromRTTStatusPoint(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.pathways.configuration.domain.objects.RTTStatusPoint objects.
	 */
	public static ims.pathways.vo.RTTStatusPointVoCollection createRTTStatusPointVoCollectionFromRTTStatusPoint(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.pathways.vo.RTTStatusPointVoCollection voList = new ims.pathways.vo.RTTStatusPointVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.pathways.configuration.domain.objects.RTTStatusPoint domainObject = (ims.pathways.configuration.domain.objects.RTTStatusPoint) iterator.next();
			ims.pathways.vo.RTTStatusPointVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.pathways.configuration.domain.objects.RTTStatusPoint objects.
	 */
	public static ims.pathways.vo.RTTStatusPointVoCollection createRTTStatusPointVoCollectionFromRTTStatusPoint(java.util.List domainObjectList) 
	{
		return createRTTStatusPointVoCollectionFromRTTStatusPoint(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.pathways.configuration.domain.objects.RTTStatusPoint objects.
	 */
	public static ims.pathways.vo.RTTStatusPointVoCollection createRTTStatusPointVoCollectionFromRTTStatusPoint(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.pathways.vo.RTTStatusPointVoCollection voList = new ims.pathways.vo.RTTStatusPointVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.pathways.configuration.domain.objects.RTTStatusPoint domainObject = (ims.pathways.configuration.domain.objects.RTTStatusPoint) domainObjectList.get(i);
			ims.pathways.vo.RTTStatusPointVo vo = create(map, domainObject);

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
	 * Create the ims.pathways.configuration.domain.objects.RTTStatusPoint set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractRTTStatusPointSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.RTTStatusPointVoCollection voCollection) 
	 {
	 	return extractRTTStatusPointSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractRTTStatusPointSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.RTTStatusPointVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.pathways.vo.RTTStatusPointVo vo = voCollection.get(i);
			ims.pathways.configuration.domain.objects.RTTStatusPoint domainObject = RTTStatusPointVoAssembler.extractRTTStatusPoint(domainFactory, vo, domMap);

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
	 * Create the ims.pathways.configuration.domain.objects.RTTStatusPoint list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractRTTStatusPointList(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.RTTStatusPointVoCollection voCollection) 
	 {
	 	return extractRTTStatusPointList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractRTTStatusPointList(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.RTTStatusPointVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.pathways.vo.RTTStatusPointVo vo = voCollection.get(i);
			ims.pathways.configuration.domain.objects.RTTStatusPoint domainObject = RTTStatusPointVoAssembler.extractRTTStatusPoint(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.pathways.configuration.domain.objects.RTTStatusPoint object.
	 * @param domainObject ims.pathways.configuration.domain.objects.RTTStatusPoint
	 */
	 public static ims.pathways.vo.RTTStatusPointVo create(ims.pathways.configuration.domain.objects.RTTStatusPoint domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.pathways.configuration.domain.objects.RTTStatusPoint object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.pathways.vo.RTTStatusPointVo create(DomainObjectMap map, ims.pathways.configuration.domain.objects.RTTStatusPoint domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.pathways.vo.RTTStatusPointVo valueObject = (ims.pathways.vo.RTTStatusPointVo) map.getValueObject(domainObject, ims.pathways.vo.RTTStatusPointVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.pathways.vo.RTTStatusPointVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.pathways.configuration.domain.objects.RTTStatusPoint
	 */
	 public static ims.pathways.vo.RTTStatusPointVo insert(ims.pathways.vo.RTTStatusPointVo valueObject, ims.pathways.configuration.domain.objects.RTTStatusPoint domainObject) 
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
	 * @param domainObject ims.pathways.configuration.domain.objects.RTTStatusPoint
	 */
	 public static ims.pathways.vo.RTTStatusPointVo insert(DomainObjectMap map, ims.pathways.vo.RTTStatusPointVo valueObject, ims.pathways.configuration.domain.objects.RTTStatusPoint domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_RTTStatusPoint(domainObject.getId());
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
			
		// NationalCode
		valueObject.setNationalCode(domainObject.getNationalCode());
		// Description
		valueObject.setDescription(domainObject.getDescription());
		// LocalCode
		valueObject.setLocalCode(domainObject.getLocalCode());
		// Children
		valueObject.setChildren(ims.pathways.vo.domain.RTTStatusPointVoAssembler.createRTTStatusPointVoCollectionFromRTTStatusPoint(map, domainObject.getChildren()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.pathways.configuration.domain.objects.RTTStatusPoint extractRTTStatusPoint(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.RTTStatusPointVo valueObject) 
	{
		return 	extractRTTStatusPoint(domainFactory, valueObject, new HashMap());
	}

	public static ims.pathways.configuration.domain.objects.RTTStatusPoint extractRTTStatusPoint(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.RTTStatusPointVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_RTTStatusPoint();
		ims.pathways.configuration.domain.objects.RTTStatusPoint domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.pathways.configuration.domain.objects.RTTStatusPoint)domMap.get(valueObject);
			}
			// ims.pathways.vo.RTTStatusPointVo ID_RTTStatusPoint field is unknown
			domainObject = new ims.pathways.configuration.domain.objects.RTTStatusPoint();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_RTTStatusPoint());
			if (domMap.get(key) != null)
			{
				return (ims.pathways.configuration.domain.objects.RTTStatusPoint)domMap.get(key);
			}
			domainObject = (ims.pathways.configuration.domain.objects.RTTStatusPoint) domainFactory.getDomainObject(ims.pathways.configuration.domain.objects.RTTStatusPoint.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_RTTStatusPoint());

		domainObject.setNationalCode(valueObject.getNationalCode());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDescription() != null && valueObject.getDescription().equals(""))
		{
			valueObject.setDescription(null);
		}
		domainObject.setDescription(valueObject.getDescription());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLocalCode() != null && valueObject.getLocalCode().equals(""))
		{
			valueObject.setLocalCode(null);
		}
		domainObject.setLocalCode(valueObject.getLocalCode());

		// SaveAsRefVO treated as RefValueObject
		ims.pathways.configuration.vo.RTTStatusPointRefVoCollection refCollection4 = new ims.pathways.configuration.vo.RTTStatusPointRefVoCollection();
		if (valueObject.getChildren() != null)
		{
			for (int i4=0; i4<valueObject.getChildren().size(); i4++)
			{
				ims.pathways.configuration.vo.RTTStatusPointRefVo ref4 = (ims.pathways.configuration.vo.RTTStatusPointRefVo)valueObject.getChildren().get(i4);
				refCollection4.add(ref4);
			}
		}
		int size4 = (null == refCollection4) ? 0 : refCollection4.size();		
		java.util.List domainChildren4 = domainObject.getChildren();
		if (domainChildren4 == null)
		{
			domainChildren4 = new java.util.ArrayList();
		}
		for(int i=0; i < size4; i++) 
		{
			ims.pathways.configuration.vo.RTTStatusPointRefVo vo = refCollection4.get(i);			
			ims.pathways.configuration.domain.objects.RTTStatusPoint dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.pathways.configuration.domain.objects.RTTStatusPoint)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.pathways.configuration.domain.objects.RTTStatusPoint)domainFactory.getDomainObject( ims.pathways.configuration.domain.objects.RTTStatusPoint.class, vo.getBoId());
				}
			}

			int domIdx = domainChildren4.indexOf(dom);
			if (domIdx == -1)
			{
				domainChildren4.add(i, dom);
			}
			else if (i != domIdx && i < domainChildren4.size())
			{
				Object tmp = domainChildren4.get(i);
				domainChildren4.set(i, domainChildren4.get(domIdx));
				domainChildren4.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i4 = domainChildren4.size();
		while (i4 > size4)
		{
			domainChildren4.remove(i4-1);
			i4 = domainChildren4.size();
		}
		
		domainObject.setChildren(domainChildren4);		

		return domainObject;
	}

}
