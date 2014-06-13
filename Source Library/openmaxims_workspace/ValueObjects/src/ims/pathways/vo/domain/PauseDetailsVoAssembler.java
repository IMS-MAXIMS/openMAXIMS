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
public class PauseDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.pathways.vo.PauseDetailsVo copy(ims.pathways.vo.PauseDetailsVo valueObjectDest, ims.pathways.vo.PauseDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PauseDetails(valueObjectSrc.getID_PauseDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// PauseStart
		valueObjectDest.setPauseStart(valueObjectSrc.getPauseStart());
		// PauseStop
		valueObjectDest.setPauseStop(valueObjectSrc.getPauseStop());
		// Active
		valueObjectDest.setActive(valueObjectSrc.getActive());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPauseDetailsVoCollectionFromPauseDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.pathways.domain.objects.PauseDetails objects.
	 */
	public static ims.pathways.vo.PauseDetailsVoCollection createPauseDetailsVoCollectionFromPauseDetails(java.util.Set domainObjectSet)	
	{
		return createPauseDetailsVoCollectionFromPauseDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.pathways.domain.objects.PauseDetails objects.
	 */
	public static ims.pathways.vo.PauseDetailsVoCollection createPauseDetailsVoCollectionFromPauseDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.pathways.vo.PauseDetailsVoCollection voList = new ims.pathways.vo.PauseDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.pathways.domain.objects.PauseDetails domainObject = (ims.pathways.domain.objects.PauseDetails) iterator.next();
			ims.pathways.vo.PauseDetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.pathways.domain.objects.PauseDetails objects.
	 */
	public static ims.pathways.vo.PauseDetailsVoCollection createPauseDetailsVoCollectionFromPauseDetails(java.util.List domainObjectList) 
	{
		return createPauseDetailsVoCollectionFromPauseDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.pathways.domain.objects.PauseDetails objects.
	 */
	public static ims.pathways.vo.PauseDetailsVoCollection createPauseDetailsVoCollectionFromPauseDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.pathways.vo.PauseDetailsVoCollection voList = new ims.pathways.vo.PauseDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.pathways.domain.objects.PauseDetails domainObject = (ims.pathways.domain.objects.PauseDetails) domainObjectList.get(i);
			ims.pathways.vo.PauseDetailsVo vo = create(map, domainObject);

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
	 * Create the ims.pathways.domain.objects.PauseDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPauseDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PauseDetailsVoCollection voCollection) 
	 {
	 	return extractPauseDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPauseDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PauseDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.pathways.vo.PauseDetailsVo vo = voCollection.get(i);
			ims.pathways.domain.objects.PauseDetails domainObject = PauseDetailsVoAssembler.extractPauseDetails(domainFactory, vo, domMap);

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
	 * Create the ims.pathways.domain.objects.PauseDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPauseDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PauseDetailsVoCollection voCollection) 
	 {
	 	return extractPauseDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPauseDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PauseDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.pathways.vo.PauseDetailsVo vo = voCollection.get(i);
			ims.pathways.domain.objects.PauseDetails domainObject = PauseDetailsVoAssembler.extractPauseDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.pathways.domain.objects.PauseDetails object.
	 * @param domainObject ims.pathways.domain.objects.PauseDetails
	 */
	 public static ims.pathways.vo.PauseDetailsVo create(ims.pathways.domain.objects.PauseDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.pathways.domain.objects.PauseDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.pathways.vo.PauseDetailsVo create(DomainObjectMap map, ims.pathways.domain.objects.PauseDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.pathways.vo.PauseDetailsVo valueObject = (ims.pathways.vo.PauseDetailsVo) map.getValueObject(domainObject, ims.pathways.vo.PauseDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.pathways.vo.PauseDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.pathways.domain.objects.PauseDetails
	 */
	 public static ims.pathways.vo.PauseDetailsVo insert(ims.pathways.vo.PauseDetailsVo valueObject, ims.pathways.domain.objects.PauseDetails domainObject) 
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
	 * @param domainObject ims.pathways.domain.objects.PauseDetails
	 */
	 public static ims.pathways.vo.PauseDetailsVo insert(DomainObjectMap map, ims.pathways.vo.PauseDetailsVo valueObject, ims.pathways.domain.objects.PauseDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PauseDetails(domainObject.getId());
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
			
		// PauseStart
		java.util.Date PauseStart = domainObject.getPauseStart();
		if ( null != PauseStart ) 
		{
			valueObject.setPauseStart(new ims.framework.utils.Date(PauseStart) );
		}
		// PauseStop
		java.util.Date PauseStop = domainObject.getPauseStop();
		if ( null != PauseStop ) 
		{
			valueObject.setPauseStop(new ims.framework.utils.Date(PauseStop) );
		}
		// Active
		valueObject.setActive( domainObject.isActive() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.pathways.domain.objects.PauseDetails extractPauseDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PauseDetailsVo valueObject) 
	{
		return 	extractPauseDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.pathways.domain.objects.PauseDetails extractPauseDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PauseDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PauseDetails();
		ims.pathways.domain.objects.PauseDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.pathways.domain.objects.PauseDetails)domMap.get(valueObject);
			}
			// ims.pathways.vo.PauseDetailsVo ID_PauseDetails field is unknown
			domainObject = new ims.pathways.domain.objects.PauseDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PauseDetails());
			if (domMap.get(key) != null)
			{
				return (ims.pathways.domain.objects.PauseDetails)domMap.get(key);
			}
			domainObject = (ims.pathways.domain.objects.PauseDetails) domainFactory.getDomainObject(ims.pathways.domain.objects.PauseDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PauseDetails());

		java.util.Date value1 = null;
		ims.framework.utils.Date date1 = valueObject.getPauseStart();		
		if ( date1 != null ) 
		{
			value1 = date1.getDate();
		}
		domainObject.setPauseStart(value1);
		java.util.Date value2 = null;
		ims.framework.utils.Date date2 = valueObject.getPauseStop();		
		if ( date2 != null ) 
		{
			value2 = date2.getDate();
		}
		domainObject.setPauseStop(value2);
		domainObject.setActive(valueObject.getActive());

		return domainObject;
	}

}
