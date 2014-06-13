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
package ims.ocrr.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Vasile Purdila
 */
public class PhlebotomyRoundShortVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.PhlebotomyRoundShortVo copy(ims.ocrr.vo.PhlebotomyRoundShortVo valueObjectDest, ims.ocrr.vo.PhlebotomyRoundShortVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PhlebotomyRound(valueObjectSrc.getID_PhlebotomyRound());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Date
		valueObjectDest.setDate(valueObjectSrc.getDate());
		// Collector
		valueObjectDest.setCollector(valueObjectSrc.getCollector());
		// Wards
		valueObjectDest.setWards(valueObjectSrc.getWards());
		// RoundToCollect
		valueObjectDest.setRoundToCollect(valueObjectSrc.getRoundToCollect());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPhlebotomyRoundShortVoCollectionFromPhlebotomyRound(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.PhlebotomyRound objects.
	 */
	public static ims.ocrr.vo.PhlebotomyRoundShortVoCollection createPhlebotomyRoundShortVoCollectionFromPhlebotomyRound(java.util.Set domainObjectSet)	
	{
		return createPhlebotomyRoundShortVoCollectionFromPhlebotomyRound(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.PhlebotomyRound objects.
	 */
	public static ims.ocrr.vo.PhlebotomyRoundShortVoCollection createPhlebotomyRoundShortVoCollectionFromPhlebotomyRound(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.PhlebotomyRoundShortVoCollection voList = new ims.ocrr.vo.PhlebotomyRoundShortVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ocrr.orderingresults.domain.objects.PhlebotomyRound domainObject = (ims.ocrr.orderingresults.domain.objects.PhlebotomyRound) iterator.next();
			ims.ocrr.vo.PhlebotomyRoundShortVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.PhlebotomyRound objects.
	 */
	public static ims.ocrr.vo.PhlebotomyRoundShortVoCollection createPhlebotomyRoundShortVoCollectionFromPhlebotomyRound(java.util.List domainObjectList) 
	{
		return createPhlebotomyRoundShortVoCollectionFromPhlebotomyRound(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.PhlebotomyRound objects.
	 */
	public static ims.ocrr.vo.PhlebotomyRoundShortVoCollection createPhlebotomyRoundShortVoCollectionFromPhlebotomyRound(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.PhlebotomyRoundShortVoCollection voList = new ims.ocrr.vo.PhlebotomyRoundShortVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.orderingresults.domain.objects.PhlebotomyRound domainObject = (ims.ocrr.orderingresults.domain.objects.PhlebotomyRound) domainObjectList.get(i);
			ims.ocrr.vo.PhlebotomyRoundShortVo vo = create(map, domainObject);

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
	 * Create the ims.ocrr.orderingresults.domain.objects.PhlebotomyRound set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPhlebotomyRoundSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.PhlebotomyRoundShortVoCollection voCollection) 
	 {
	 	return extractPhlebotomyRoundSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPhlebotomyRoundSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.PhlebotomyRoundShortVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.PhlebotomyRoundShortVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.PhlebotomyRound domainObject = PhlebotomyRoundShortVoAssembler.extractPhlebotomyRound(domainFactory, vo, domMap);

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
	 * Create the ims.ocrr.orderingresults.domain.objects.PhlebotomyRound list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPhlebotomyRoundList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.PhlebotomyRoundShortVoCollection voCollection) 
	 {
	 	return extractPhlebotomyRoundList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPhlebotomyRoundList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.PhlebotomyRoundShortVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.PhlebotomyRoundShortVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.PhlebotomyRound domainObject = PhlebotomyRoundShortVoAssembler.extractPhlebotomyRound(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.PhlebotomyRound object.
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.PhlebotomyRound
	 */
	 public static ims.ocrr.vo.PhlebotomyRoundShortVo create(ims.ocrr.orderingresults.domain.objects.PhlebotomyRound domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.PhlebotomyRound object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ocrr.vo.PhlebotomyRoundShortVo create(DomainObjectMap map, ims.ocrr.orderingresults.domain.objects.PhlebotomyRound domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.PhlebotomyRoundShortVo valueObject = (ims.ocrr.vo.PhlebotomyRoundShortVo) map.getValueObject(domainObject, ims.ocrr.vo.PhlebotomyRoundShortVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.PhlebotomyRoundShortVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.PhlebotomyRound
	 */
	 public static ims.ocrr.vo.PhlebotomyRoundShortVo insert(ims.ocrr.vo.PhlebotomyRoundShortVo valueObject, ims.ocrr.orderingresults.domain.objects.PhlebotomyRound domainObject) 
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
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.PhlebotomyRound
	 */
	 public static ims.ocrr.vo.PhlebotomyRoundShortVo insert(DomainObjectMap map, ims.ocrr.vo.PhlebotomyRoundShortVo valueObject, ims.ocrr.orderingresults.domain.objects.PhlebotomyRound domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PhlebotomyRound(domainObject.getId());
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
			
		// Date
		java.util.Date Date = domainObject.getDate();
		if ( null != Date ) 
		{
			valueObject.setDate(new ims.framework.utils.Date(Date) );
		}
		// Collector
		valueObject.setCollector(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getCollector()) );
		// Wards
		valueObject.setWards(ims.core.vo.domain.LocationLiteVoAssembler.createLocationLiteVoCollectionFromLocation(map, domainObject.getWards()) );
		// RoundToCollect
		ims.domain.lookups.LookupInstance instance4 = domainObject.getRoundToCollect();
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

			ims.ocrr.vo.lookups.SpecimenCollectionTime voLookup4 = new ims.ocrr.vo.lookups.SpecimenCollectionTime(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.ocrr.vo.lookups.SpecimenCollectionTime parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.ocrr.vo.lookups.SpecimenCollectionTime(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setRoundToCollect(voLookup4);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.orderingresults.domain.objects.PhlebotomyRound extractPhlebotomyRound(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.PhlebotomyRoundShortVo valueObject) 
	{
		return 	extractPhlebotomyRound(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.orderingresults.domain.objects.PhlebotomyRound extractPhlebotomyRound(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.PhlebotomyRoundShortVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PhlebotomyRound();
		ims.ocrr.orderingresults.domain.objects.PhlebotomyRound domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.PhlebotomyRound)domMap.get(valueObject);
			}
			// ims.ocrr.vo.PhlebotomyRoundShortVo ID_PhlebotomyRound field is unknown
			domainObject = new ims.ocrr.orderingresults.domain.objects.PhlebotomyRound();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PhlebotomyRound());
			if (domMap.get(key) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.PhlebotomyRound)domMap.get(key);
			}
			domainObject = (ims.ocrr.orderingresults.domain.objects.PhlebotomyRound) domainFactory.getDomainObject(ims.ocrr.orderingresults.domain.objects.PhlebotomyRound.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PhlebotomyRound());

		java.util.Date value1 = null;
		ims.framework.utils.Date date1 = valueObject.getDate();		
		if ( date1 != null ) 
		{
			value1 = date1.getDate();
		}
		domainObject.setDate(value1);
		domainObject.setCollector(ims.core.vo.domain.HcpAssembler.extractHcp(domainFactory, valueObject.getCollector(), domMap));

		// SaveAsRefVO treated as RefValueObject
		ims.core.resource.place.vo.LocationRefVoCollection refCollection3 = new ims.core.resource.place.vo.LocationRefVoCollection();
		if (valueObject.getWards() != null)
		{
			for (int i3=0; i3<valueObject.getWards().size(); i3++)
			{
				ims.core.resource.place.vo.LocationRefVo ref3 = (ims.core.resource.place.vo.LocationRefVo)valueObject.getWards().get(i3);
				refCollection3.add(ref3);
			}
		}
		int size3 = (null == refCollection3) ? 0 : refCollection3.size();		
		java.util.Set domainWards3 = domainObject.getWards();
		if (domainWards3 == null)
		{
			domainWards3 = new java.util.HashSet();
		}
		java.util.Set newSet3  = new java.util.HashSet();
		for(int i=0; i<size3; i++) 
		{
			ims.core.resource.place.vo.LocationRefVo vo = refCollection3.get(i);					
			ims.core.resource.place.domain.objects.Location dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.resource.place.domain.objects.Location)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject( ims.core.resource.place.domain.objects.Location.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainWards3.contains(dom))
			{
				domainWards3.add(dom);
			}
			newSet3.add(dom);			
		}
		java.util.Set removedSet3 = new java.util.HashSet();
		java.util.Iterator iter3 = domainWards3.iterator();
		//Find out which objects need to be removed
		while (iter3.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter3.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet3.contains(o))
			{
				removedSet3.add(o);
			}
		}
		iter3 = removedSet3.iterator();
		//Remove the unwanted objects
		while (iter3.hasNext())
		{
			domainWards3.remove(iter3.next());
		}		
		
		domainObject.setWards(domainWards3);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getRoundToCollect() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getRoundToCollect().getID());
		}
		domainObject.setRoundToCollect(value4);

		return domainObject;
	}

}
