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
public class OrderInvestigationListVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.OrderInvestigationListVo copy(ims.ocrr.vo.OrderInvestigationListVo valueObjectDest, ims.ocrr.vo.OrderInvestigationListVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_OrderInvestigation(valueObjectSrc.getID_OrderInvestigation());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Investigation
		valueObjectDest.setInvestigation(valueObjectSrc.getInvestigation());
		// OrdInvCurrentStatus
		valueObjectDest.setOrdInvCurrentStatus(valueObjectSrc.getOrdInvCurrentStatus());
		// OrdInvStatusHistory
		valueObjectDest.setOrdInvStatusHistory(valueObjectSrc.getOrdInvStatusHistory());
		// RequestedLocation
		valueObjectDest.setRequestedLocation(valueObjectSrc.getRequestedLocation());
		// OrdInvXOStatusHistory
		valueObjectDest.setOrdInvXOStatusHistory(valueObjectSrc.getOrdInvXOStatusHistory());
		// Specimen
		valueObjectDest.setSpecimen(valueObjectSrc.getSpecimen());
		// ExpectedDateTime
		valueObjectDest.setExpectedDateTime(valueObjectSrc.getExpectedDateTime());
		// PlacerOrdNum
		valueObjectDest.setPlacerOrdNum(valueObjectSrc.getPlacerOrdNum());
		// ReorderReason
		valueObjectDest.setReorderReason(valueObjectSrc.getReorderReason());
		// CollectionType
		valueObjectDest.setCollectionType(valueObjectSrc.getCollectionType());
		// RequiredByDate
		valueObjectDest.setRequiredByDate(valueObjectSrc.getRequiredByDate());
		// AccessionNumber
		valueObjectDest.setAccessionNumber(valueObjectSrc.getAccessionNumber());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createOrderInvestigationListVoCollectionFromOrderInvestigation(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OrderInvestigation objects.
	 */
	public static ims.ocrr.vo.OrderInvestigationListVoCollection createOrderInvestigationListVoCollectionFromOrderInvestigation(java.util.Set domainObjectSet)	
	{
		return createOrderInvestigationListVoCollectionFromOrderInvestigation(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OrderInvestigation objects.
	 */
	public static ims.ocrr.vo.OrderInvestigationListVoCollection createOrderInvestigationListVoCollectionFromOrderInvestigation(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.OrderInvestigationListVoCollection voList = new ims.ocrr.vo.OrderInvestigationListVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation) iterator.next();
			ims.ocrr.vo.OrderInvestigationListVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.OrderInvestigation objects.
	 */
	public static ims.ocrr.vo.OrderInvestigationListVoCollection createOrderInvestigationListVoCollectionFromOrderInvestigation(java.util.List domainObjectList) 
	{
		return createOrderInvestigationListVoCollectionFromOrderInvestigation(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.OrderInvestigation objects.
	 */
	public static ims.ocrr.vo.OrderInvestigationListVoCollection createOrderInvestigationListVoCollectionFromOrderInvestigation(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.OrderInvestigationListVoCollection voList = new ims.ocrr.vo.OrderInvestigationListVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation) domainObjectList.get(i);
			ims.ocrr.vo.OrderInvestigationListVo vo = create(map, domainObject);

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
	 * Create the ims.ocrr.orderingresults.domain.objects.OrderInvestigation set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractOrderInvestigationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderInvestigationListVoCollection voCollection) 
	 {
	 	return extractOrderInvestigationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOrderInvestigationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderInvestigationListVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.OrderInvestigationListVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject = OrderInvestigationListVoAssembler.extractOrderInvestigation(domainFactory, vo, domMap);

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
	 * Create the ims.ocrr.orderingresults.domain.objects.OrderInvestigation list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractOrderInvestigationList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderInvestigationListVoCollection voCollection) 
	 {
	 	return extractOrderInvestigationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOrderInvestigationList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderInvestigationListVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.OrderInvestigationListVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject = OrderInvestigationListVoAssembler.extractOrderInvestigation(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.OrderInvestigation object.
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.OrderInvestigation
	 */
	 public static ims.ocrr.vo.OrderInvestigationListVo create(ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.OrderInvestigation object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ocrr.vo.OrderInvestigationListVo create(DomainObjectMap map, ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.OrderInvestigationListVo valueObject = (ims.ocrr.vo.OrderInvestigationListVo) map.getValueObject(domainObject, ims.ocrr.vo.OrderInvestigationListVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.OrderInvestigationListVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.OrderInvestigation
	 */
	 public static ims.ocrr.vo.OrderInvestigationListVo insert(ims.ocrr.vo.OrderInvestigationListVo valueObject, ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject) 
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
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.OrderInvestigation
	 */
	 public static ims.ocrr.vo.OrderInvestigationListVo insert(DomainObjectMap map, ims.ocrr.vo.OrderInvestigationListVo valueObject, ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_OrderInvestigation(domainObject.getId());
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
			
		// Investigation
		valueObject.setInvestigation(ims.ocrr.vo.domain.InvestigationUnderSpecimenListVoAssembler.create(map, domainObject.getInvestigation()) );
		// OrdInvCurrentStatus
		valueObject.setOrdInvCurrentStatus(ims.ocrr.vo.domain.OrderedInvestigationStatusVoAssembler.create(map, domainObject.getOrdInvCurrentStatus()) );
		// OrdInvStatusHistory
		valueObject.setOrdInvStatusHistory(ims.ocrr.vo.domain.OrderedInvestigationStatusVoAssembler.createOrderedInvestigationStatusVoCollectionFromOrderedInvestigationStatus(map, domainObject.getOrdInvStatusHistory()) );
		// RequestedLocation
		valueObject.setRequestedLocation(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getRequestedLocation()) );
		// OrdInvXOStatusHistory
		valueObject.setOrdInvXOStatusHistory(ims.ocrr.vo.domain.OrdInvXOStatusHistoryLiteVoAssembler.createOrdInvXOStatusHistoryLiteVoCollectionFromOrderedInvestigationStatus(map, domainObject.getOrdInvXOStatusHistory()) );
		// Specimen
		ims.ocrr.orderingresults.vo.OrderSpecimenRefVoCollection Specimen = new ims.ocrr.orderingresults.vo.OrderSpecimenRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getSpecimen().iterator(); iterator.hasNext(); ) 
		{
			ims.ocrr.orderingresults.domain.objects.OrderSpecimen tmp = (ims.ocrr.orderingresults.domain.objects.OrderSpecimen)iterator.next();
			if (tmp != null)
				Specimen.add(new ims.ocrr.orderingresults.vo.OrderSpecimenRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setSpecimen(Specimen);
		// ExpectedDateTime
		java.util.Date ExpectedDateTime = domainObject.getExpectedDateTime();
		if ( null != ExpectedDateTime ) 
		{
			valueObject.setExpectedDateTime(new ims.framework.utils.DateTime(ExpectedDateTime) );
		}
		// PlacerOrdNum
		valueObject.setPlacerOrdNum(domainObject.getPlacerOrdNum());
		// ReorderReason
		valueObject.setReorderReason(domainObject.getReorderReason());
		// CollectionType
		ims.domain.lookups.LookupInstance instance10 = domainObject.getCollectionType();
		if ( null != instance10 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance10.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance10.getImage().getImageId(), instance10.getImage().getImagePath());
			}
			color = instance10.getColor();
			if (color != null) 
				color.getValue();

			ims.ocrr.vo.lookups.SpecimenCollectionType voLookup10 = new ims.ocrr.vo.lookups.SpecimenCollectionType(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.ocrr.vo.lookups.SpecimenCollectionType parentVoLookup10 = voLookup10;
			ims.domain.lookups.LookupInstance parent10 = instance10.getParent();
			while (parent10 != null)
			{
				if (parent10.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent10.getImage().getImageId(), parent10.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent10.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup10.setParent(new ims.ocrr.vo.lookups.SpecimenCollectionType(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setCollectionType(voLookup10);
		}
				// RequiredByDate
		java.util.Date RequiredByDate = domainObject.getRequiredByDate();
		if ( null != RequiredByDate ) 
		{
			valueObject.setRequiredByDate(new ims.framework.utils.DateTime(RequiredByDate) );
		}
		// AccessionNumber
		valueObject.setAccessionNumber(domainObject.getAccessionNumber());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.orderingresults.domain.objects.OrderInvestigation extractOrderInvestigation(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderInvestigationListVo valueObject) 
	{
		return 	extractOrderInvestigation(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.orderingresults.domain.objects.OrderInvestigation extractOrderInvestigation(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderInvestigationListVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_OrderInvestigation();
		ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.OrderInvestigation)domMap.get(valueObject);
			}
			// ims.ocrr.vo.OrderInvestigationListVo ID_OrderInvestigation field is unknown
			domainObject = new ims.ocrr.orderingresults.domain.objects.OrderInvestigation();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_OrderInvestigation());
			if (domMap.get(key) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.OrderInvestigation)domMap.get(key);
			}
			domainObject = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation) domainFactory.getDomainObject(ims.ocrr.orderingresults.domain.objects.OrderInvestigation.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_OrderInvestigation());

		domainObject.setInvestigation(ims.ocrr.vo.domain.InvestigationUnderSpecimenListVoAssembler.extractInvestigation(domainFactory, valueObject.getInvestigation(), domMap));
		domainObject.setOrdInvCurrentStatus(ims.ocrr.vo.domain.OrderedInvestigationStatusVoAssembler.extractOrderedInvestigationStatus(domainFactory, valueObject.getOrdInvCurrentStatus(), domMap));
		domainObject.setOrdInvStatusHistory(ims.ocrr.vo.domain.OrderedInvestigationStatusVoAssembler.extractOrderedInvestigationStatusList(domainFactory, valueObject.getOrdInvStatusHistory(), domainObject.getOrdInvStatusHistory(), domMap));		
		domainObject.setRequestedLocation(ims.core.vo.domain.LocationLiteVoAssembler.extractLocation(domainFactory, valueObject.getRequestedLocation(), domMap));

		// SaveAsRefVO treated as RefValueObject
		ims.ocrr.orderingresults.vo.OrderedInvestigationStatusRefVoCollection refCollection5 = new ims.ocrr.orderingresults.vo.OrderedInvestigationStatusRefVoCollection();
		if (valueObject.getOrdInvXOStatusHistory() != null)
		{
			for (int i5=0; i5<valueObject.getOrdInvXOStatusHistory().size(); i5++)
			{
				ims.ocrr.orderingresults.vo.OrderedInvestigationStatusRefVo ref5 = (ims.ocrr.orderingresults.vo.OrderedInvestigationStatusRefVo)valueObject.getOrdInvXOStatusHistory().get(i5);
				refCollection5.add(ref5);
			}
		}
		int size5 = (null == refCollection5) ? 0 : refCollection5.size();		
		java.util.List domainOrdInvXOStatusHistory5 = domainObject.getOrdInvXOStatusHistory();
		if (domainOrdInvXOStatusHistory5 == null)
		{
			domainOrdInvXOStatusHistory5 = new java.util.ArrayList();
		}
		for(int i=0; i < size5; i++) 
		{
			ims.ocrr.orderingresults.vo.OrderedInvestigationStatusRefVo vo = refCollection5.get(i);			
			ims.ocrr.orderingresults.domain.objects.OrderedInvestigationStatus dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.ocrr.orderingresults.domain.objects.OrderedInvestigationStatus)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.ocrr.orderingresults.domain.objects.OrderedInvestigationStatus)domainFactory.getDomainObject( ims.ocrr.orderingresults.domain.objects.OrderedInvestigationStatus.class, vo.getBoId());
				}
			}

			int domIdx = domainOrdInvXOStatusHistory5.indexOf(dom);
			if (domIdx == -1)
			{
				domainOrdInvXOStatusHistory5.add(i, dom);
			}
			else if (i != domIdx && i < domainOrdInvXOStatusHistory5.size())
			{
				Object tmp = domainOrdInvXOStatusHistory5.get(i);
				domainOrdInvXOStatusHistory5.set(i, domainOrdInvXOStatusHistory5.get(domIdx));
				domainOrdInvXOStatusHistory5.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i5 = domainOrdInvXOStatusHistory5.size();
		while (i5 > size5)
		{
			domainOrdInvXOStatusHistory5.remove(i5-1);
			i5 = domainOrdInvXOStatusHistory5.size();
		}
		
		domainObject.setOrdInvXOStatusHistory(domainOrdInvXOStatusHistory5);		

		ims.ocrr.orderingresults.vo.OrderSpecimenRefVoCollection refCollection6 = valueObject.getSpecimen();
		int size6 = (null == refCollection6) ? 0 : refCollection6.size();		
		java.util.List domainSpecimen6 = domainObject.getSpecimen();
		if (domainSpecimen6 == null)
		{
			domainSpecimen6 = new java.util.ArrayList();
		}
		for(int i=0; i < size6; i++) 
		{
			ims.ocrr.orderingresults.vo.OrderSpecimenRefVo vo = refCollection6.get(i);			
			ims.ocrr.orderingresults.domain.objects.OrderSpecimen dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.ocrr.orderingresults.domain.objects.OrderSpecimen)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.ocrr.orderingresults.domain.objects.OrderSpecimen)domainFactory.getDomainObject( ims.ocrr.orderingresults.domain.objects.OrderSpecimen.class, vo.getBoId());
				}
			}

			int domIdx = domainSpecimen6.indexOf(dom);
			if (domIdx == -1)
			{
				domainSpecimen6.add(i, dom);
			}
			else if (i != domIdx && i < domainSpecimen6.size())
			{
				Object tmp = domainSpecimen6.get(i);
				domainSpecimen6.set(i, domainSpecimen6.get(domIdx));
				domainSpecimen6.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i6 = domainSpecimen6.size();
		while (i6 > size6)
		{
			domainSpecimen6.remove(i6-1);
			i6 = domainSpecimen6.size();
		}
		
		domainObject.setSpecimen(domainSpecimen6);		
		ims.framework.utils.DateTime dateTime7 = valueObject.getExpectedDateTime();
		java.util.Date value7 = null;
		if ( dateTime7 != null ) 
		{
			value7 = dateTime7.getJavaDate();
		}
		domainObject.setExpectedDateTime(value7);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPlacerOrdNum() != null && valueObject.getPlacerOrdNum().equals(""))
		{
			valueObject.setPlacerOrdNum(null);
		}
		domainObject.setPlacerOrdNum(valueObject.getPlacerOrdNum());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReorderReason() != null && valueObject.getReorderReason().equals(""))
		{
			valueObject.setReorderReason(null);
		}
		domainObject.setReorderReason(valueObject.getReorderReason());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getCollectionType() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getCollectionType().getID());
		}
		domainObject.setCollectionType(value10);
		ims.framework.utils.DateTime dateTime11 = valueObject.getRequiredByDate();
		java.util.Date value11 = null;
		if ( dateTime11 != null ) 
		{
			value11 = dateTime11.getJavaDate();
		}
		domainObject.setRequiredByDate(value11);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAccessionNumber() != null && valueObject.getAccessionNumber().equals(""))
		{
			valueObject.setAccessionNumber(null);
		}
		domainObject.setAccessionNumber(valueObject.getAccessionNumber());

		return domainObject;
	}

}
