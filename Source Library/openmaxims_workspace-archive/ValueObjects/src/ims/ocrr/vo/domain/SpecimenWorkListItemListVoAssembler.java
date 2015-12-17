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
 * @author Alexie Ursache
 */
public class SpecimenWorkListItemListVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.SpecimenWorkListItemListVo copy(ims.ocrr.vo.SpecimenWorkListItemListVo valueObjectDest, ims.ocrr.vo.SpecimenWorkListItemListVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_SpecimenWorkListItem(valueObjectSrc.getID_SpecimenWorkListItem());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Specimen
		valueObjectDest.setSpecimen(valueObjectSrc.getSpecimen());
		// ListType
		valueObjectDest.setListType(valueObjectSrc.getListType());
		// DateToCollect
		valueObjectDest.setDateToCollect(valueObjectSrc.getDateToCollect());
		// RoundToCollect
		valueObjectDest.setRoundToCollect(valueObjectSrc.getRoundToCollect());
		// TimeToCollect
		valueObjectDest.setTimeToCollect(valueObjectSrc.getTimeToCollect());
		// CollectionStatus
		valueObjectDest.setCollectionStatus(valueObjectSrc.getCollectionStatus());
		// Printed
		valueObjectDest.setPrinted(valueObjectSrc.getPrinted());
		// DFTOrderInvestigation
		valueObjectDest.setDFTOrderInvestigation(valueObjectSrc.getDFTOrderInvestigation());
		// Ward
		valueObjectDest.setWard(valueObjectSrc.getWard());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSpecimenWorkListItemListVoCollectionFromSpecimenWorkListItem(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.SpecimenWorkListItem objects.
	 */
	public static ims.ocrr.vo.SpecimenWorkListItemListVoCollection createSpecimenWorkListItemListVoCollectionFromSpecimenWorkListItem(java.util.Set domainObjectSet)	
	{
		return createSpecimenWorkListItemListVoCollectionFromSpecimenWorkListItem(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.SpecimenWorkListItem objects.
	 */
	public static ims.ocrr.vo.SpecimenWorkListItemListVoCollection createSpecimenWorkListItemListVoCollectionFromSpecimenWorkListItem(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.SpecimenWorkListItemListVoCollection voList = new ims.ocrr.vo.SpecimenWorkListItemListVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ocrr.orderingresults.domain.objects.SpecimenWorkListItem domainObject = (ims.ocrr.orderingresults.domain.objects.SpecimenWorkListItem) iterator.next();
			ims.ocrr.vo.SpecimenWorkListItemListVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.SpecimenWorkListItem objects.
	 */
	public static ims.ocrr.vo.SpecimenWorkListItemListVoCollection createSpecimenWorkListItemListVoCollectionFromSpecimenWorkListItem(java.util.List domainObjectList) 
	{
		return createSpecimenWorkListItemListVoCollectionFromSpecimenWorkListItem(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.SpecimenWorkListItem objects.
	 */
	public static ims.ocrr.vo.SpecimenWorkListItemListVoCollection createSpecimenWorkListItemListVoCollectionFromSpecimenWorkListItem(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.SpecimenWorkListItemListVoCollection voList = new ims.ocrr.vo.SpecimenWorkListItemListVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.orderingresults.domain.objects.SpecimenWorkListItem domainObject = (ims.ocrr.orderingresults.domain.objects.SpecimenWorkListItem) domainObjectList.get(i);
			ims.ocrr.vo.SpecimenWorkListItemListVo vo = create(map, domainObject);

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
	 * Create the ims.ocrr.orderingresults.domain.objects.SpecimenWorkListItem set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractSpecimenWorkListItemSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.SpecimenWorkListItemListVoCollection voCollection) 
	 {
	 	return extractSpecimenWorkListItemSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSpecimenWorkListItemSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.SpecimenWorkListItemListVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.SpecimenWorkListItemListVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.SpecimenWorkListItem domainObject = SpecimenWorkListItemListVoAssembler.extractSpecimenWorkListItem(domainFactory, vo, domMap);

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
	 * Create the ims.ocrr.orderingresults.domain.objects.SpecimenWorkListItem list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractSpecimenWorkListItemList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.SpecimenWorkListItemListVoCollection voCollection) 
	 {
	 	return extractSpecimenWorkListItemList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSpecimenWorkListItemList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.SpecimenWorkListItemListVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.SpecimenWorkListItemListVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.SpecimenWorkListItem domainObject = SpecimenWorkListItemListVoAssembler.extractSpecimenWorkListItem(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.SpecimenWorkListItem object.
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.SpecimenWorkListItem
	 */
	 public static ims.ocrr.vo.SpecimenWorkListItemListVo create(ims.ocrr.orderingresults.domain.objects.SpecimenWorkListItem domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.SpecimenWorkListItem object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ocrr.vo.SpecimenWorkListItemListVo create(DomainObjectMap map, ims.ocrr.orderingresults.domain.objects.SpecimenWorkListItem domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.SpecimenWorkListItemListVo valueObject = (ims.ocrr.vo.SpecimenWorkListItemListVo) map.getValueObject(domainObject, ims.ocrr.vo.SpecimenWorkListItemListVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.SpecimenWorkListItemListVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.SpecimenWorkListItem
	 */
	 public static ims.ocrr.vo.SpecimenWorkListItemListVo insert(ims.ocrr.vo.SpecimenWorkListItemListVo valueObject, ims.ocrr.orderingresults.domain.objects.SpecimenWorkListItem domainObject) 
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
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.SpecimenWorkListItem
	 */
	 public static ims.ocrr.vo.SpecimenWorkListItemListVo insert(DomainObjectMap map, ims.ocrr.vo.SpecimenWorkListItemListVo valueObject, ims.ocrr.orderingresults.domain.objects.SpecimenWorkListItem domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_SpecimenWorkListItem(domainObject.getId());
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
			
		// Specimen
		valueObject.setSpecimen(ims.ocrr.vo.domain.OrderSpecimenListVoAssembler.create(map, domainObject.getSpecimen()) );
		// ListType
		ims.domain.lookups.LookupInstance instance2 = domainObject.getListType();
		if ( null != instance2 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance2.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance2.getImage().getImageId(), instance2.getImage().getImagePath());
			}
			color = instance2.getColor();
			if (color != null) 
				color.getValue();

			ims.ocrr.vo.lookups.SpecimenCollectionMethod voLookup2 = new ims.ocrr.vo.lookups.SpecimenCollectionMethod(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.ocrr.vo.lookups.SpecimenCollectionMethod parentVoLookup2 = voLookup2;
			ims.domain.lookups.LookupInstance parent2 = instance2.getParent();
			while (parent2 != null)
			{
				if (parent2.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent2.getImage().getImageId(), parent2.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent2.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup2.setParent(new ims.ocrr.vo.lookups.SpecimenCollectionMethod(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setListType(voLookup2);
		}
				// DateToCollect
		java.util.Date DateToCollect = domainObject.getDateToCollect();
		if ( null != DateToCollect ) 
		{
			valueObject.setDateToCollect(new ims.framework.utils.Date(DateToCollect) );
		}
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
				// TimeToCollect
		String TimeToCollect = domainObject.getTimeToCollect();
		if ( null != TimeToCollect ) 
		{
			valueObject.setTimeToCollect(new ims.framework.utils.Time(TimeToCollect) );
		}
		// CollectionStatus
		ims.domain.lookups.LookupInstance instance6 = domainObject.getCollectionStatus();
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

			ims.ocrr.vo.lookups.SpecimenCollectionStatus voLookup6 = new ims.ocrr.vo.lookups.SpecimenCollectionStatus(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.ocrr.vo.lookups.SpecimenCollectionStatus parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.ocrr.vo.lookups.SpecimenCollectionStatus(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setCollectionStatus(voLookup6);
		}
				// Printed
		valueObject.setPrinted( domainObject.isPrinted() );
		// DFTOrderInvestigation
		valueObject.setDFTOrderInvestigation(ims.ocrr.vo.domain.DftOrderInvestigationVoAssembler.create(map, domainObject.getDFTOrderInvestigation()) );
		// Ward
		if (domainObject.getWard() != null)
		{
			if(domainObject.getWard() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getWard();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setWard(new ims.core.resource.place.vo.LocationRefVo(id, -1));				
			}
			else
			{
				valueObject.setWard(new ims.core.resource.place.vo.LocationRefVo(domainObject.getWard().getId(), domainObject.getWard().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.orderingresults.domain.objects.SpecimenWorkListItem extractSpecimenWorkListItem(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.SpecimenWorkListItemListVo valueObject) 
	{
		return 	extractSpecimenWorkListItem(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.orderingresults.domain.objects.SpecimenWorkListItem extractSpecimenWorkListItem(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.SpecimenWorkListItemListVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_SpecimenWorkListItem();
		ims.ocrr.orderingresults.domain.objects.SpecimenWorkListItem domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.SpecimenWorkListItem)domMap.get(valueObject);
			}
			// ims.ocrr.vo.SpecimenWorkListItemListVo ID_SpecimenWorkListItem field is unknown
			domainObject = new ims.ocrr.orderingresults.domain.objects.SpecimenWorkListItem();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_SpecimenWorkListItem());
			if (domMap.get(key) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.SpecimenWorkListItem)domMap.get(key);
			}
			domainObject = (ims.ocrr.orderingresults.domain.objects.SpecimenWorkListItem) domainFactory.getDomainObject(ims.ocrr.orderingresults.domain.objects.SpecimenWorkListItem.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_SpecimenWorkListItem());

		domainObject.setSpecimen(ims.ocrr.vo.domain.OrderSpecimenListVoAssembler.extractOrderSpecimen(domainFactory, valueObject.getSpecimen(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getListType() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getListType().getID());
		}
		domainObject.setListType(value2);
		java.util.Date value3 = null;
		ims.framework.utils.Date date3 = valueObject.getDateToCollect();		
		if ( date3 != null ) 
		{
			value3 = date3.getDate();
		}
		domainObject.setDateToCollect(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getRoundToCollect() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getRoundToCollect().getID());
		}
		domainObject.setRoundToCollect(value4);
		ims.framework.utils.Time time5 = valueObject.getTimeToCollect();
		String value5 = null;
		if ( time5 != null ) 
		{
			value5 = time5.toString();
		}
		domainObject.setTimeToCollect(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getCollectionStatus() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getCollectionStatus().getID());
		}
		domainObject.setCollectionStatus(value6);
		domainObject.setPrinted(valueObject.getPrinted());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.ocrr.orderingresults.domain.objects.OrderInvestigation value8 = null;
		if ( null != valueObject.getDFTOrderInvestigation() ) 
		{
			if (valueObject.getDFTOrderInvestigation().getBoId() == null)
			{
				if (domMap.get(valueObject.getDFTOrderInvestigation()) != null)
				{
					value8 = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation)domMap.get(valueObject.getDFTOrderInvestigation());
				}
			}
			else
			{
				value8 = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation)domainFactory.getDomainObject(ims.ocrr.orderingresults.domain.objects.OrderInvestigation.class, valueObject.getDFTOrderInvestigation().getBoId());
			}
		}
		domainObject.setDFTOrderInvestigation(value8);
		ims.core.resource.place.domain.objects.Location value9 = null;
		if ( null != valueObject.getWard() ) 
		{
			if (valueObject.getWard().getBoId() == null)
			{
				if (domMap.get(valueObject.getWard()) != null)
				{
					value9 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getWard());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value9 = domainObject.getWard();	
			}
			else
			{
				value9 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getWard().getBoId());
			}
		}
		domainObject.setWard(value9);

		return domainObject;
	}

}
