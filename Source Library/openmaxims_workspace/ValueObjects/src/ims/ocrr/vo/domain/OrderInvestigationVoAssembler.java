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
package ims.ocrr.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class OrderInvestigationVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.OrderInvestigationVo copy(ims.ocrr.vo.OrderInvestigationVo valueObjectDest, ims.ocrr.vo.OrderInvestigationVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_OrderInvestigation(valueObjectSrc.getID_OrderInvestigation());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Investigation
		valueObjectDest.setInvestigation(valueObjectSrc.getInvestigation());
		// OrderPriority
		valueObjectDest.setOrderPriority(valueObjectSrc.getOrderPriority());
		// DisplayDateTime
		valueObjectDest.setDisplayDateTime(valueObjectSrc.getDisplayDateTime());
		// DisplayFlag
		valueObjectDest.setDisplayFlag(valueObjectSrc.getDisplayFlag());
		// wasOrdered
		valueObjectDest.setWasOrdered(valueObjectSrc.getWasOrdered());
		// OrdInvCurrentStatus
		valueObjectDest.setOrdInvCurrentStatus(valueObjectSrc.getOrdInvCurrentStatus());
		// Specimen
		valueObjectDest.setSpecimen(valueObjectSrc.getSpecimen());
		// OrderDetails
		valueObjectDest.setOrderDetails(valueObjectSrc.getOrderDetails());
		// ordInvSeq
		valueObjectDest.setOrdInvSeq(valueObjectSrc.getOrdInvSeq());
		// RequestedLocation
		valueObjectDest.setRequestedLocation(valueObjectSrc.getRequestedLocation());
		// AccessionNumber
		valueObjectDest.setAccessionNumber(valueObjectSrc.getAccessionNumber());
		// Container
		valueObjectDest.setContainer(valueObjectSrc.getContainer());
		// ReorderReason
		valueObjectDest.setReorderReason(valueObjectSrc.getReorderReason());
		// RequiredByDate
		valueObjectDest.setRequiredByDate(valueObjectSrc.getRequiredByDate());
		// OrdInvStatusHistory
		valueObjectDest.setOrdInvStatusHistory(valueObjectSrc.getOrdInvStatusHistory());
		// CollectionType
		valueObjectDest.setCollectionType(valueObjectSrc.getCollectionType());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createOrderInvestigationVoCollectionFromOrderInvestigation(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OrderInvestigation objects.
	 */
	public static ims.ocrr.vo.OrderInvestigationVoCollection createOrderInvestigationVoCollectionFromOrderInvestigation(java.util.Set domainObjectSet)	
	{
		return createOrderInvestigationVoCollectionFromOrderInvestigation(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OrderInvestigation objects.
	 */
	public static ims.ocrr.vo.OrderInvestigationVoCollection createOrderInvestigationVoCollectionFromOrderInvestigation(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.OrderInvestigationVoCollection voList = new ims.ocrr.vo.OrderInvestigationVoCollection();
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
			ims.ocrr.vo.OrderInvestigationVo vo = create(map, domainObject);
			
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
	public static ims.ocrr.vo.OrderInvestigationVoCollection createOrderInvestigationVoCollectionFromOrderInvestigation(java.util.List domainObjectList) 
	{
		return createOrderInvestigationVoCollectionFromOrderInvestigation(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.OrderInvestigation objects.
	 */
	public static ims.ocrr.vo.OrderInvestigationVoCollection createOrderInvestigationVoCollectionFromOrderInvestigation(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.OrderInvestigationVoCollection voList = new ims.ocrr.vo.OrderInvestigationVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation) domainObjectList.get(i);
			ims.ocrr.vo.OrderInvestigationVo vo = create(map, domainObject);

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
	 public static java.util.Set extractOrderInvestigationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderInvestigationVoCollection voCollection) 
	 {
	 	return extractOrderInvestigationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOrderInvestigationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderInvestigationVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.OrderInvestigationVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject = OrderInvestigationVoAssembler.extractOrderInvestigation(domainFactory, vo, domMap);

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
	 public static java.util.List extractOrderInvestigationList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderInvestigationVoCollection voCollection) 
	 {
	 	return extractOrderInvestigationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOrderInvestigationList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderInvestigationVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.OrderInvestigationVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject = OrderInvestigationVoAssembler.extractOrderInvestigation(domainFactory, vo, domMap);

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
	 public static ims.ocrr.vo.OrderInvestigationVo create(ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject) 
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
	  public static ims.ocrr.vo.OrderInvestigationVo create(DomainObjectMap map, ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.OrderInvestigationVo valueObject = (ims.ocrr.vo.OrderInvestigationVo) map.getValueObject(domainObject, ims.ocrr.vo.OrderInvestigationVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.OrderInvestigationVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.ocrr.vo.OrderInvestigationVo insert(ims.ocrr.vo.OrderInvestigationVo valueObject, ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject) 
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
	 public static ims.ocrr.vo.OrderInvestigationVo insert(DomainObjectMap map, ims.ocrr.vo.OrderInvestigationVo valueObject, ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject) 
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
		valueObject.setInvestigation(ims.ocrr.vo.domain.InvestigationUnderSpecimenVoAssembler.create(map, domainObject.getInvestigation()) );
		// OrderPriority
		ims.domain.lookups.LookupInstance instance2 = domainObject.getOrderPriority();
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

			ims.ocrr.vo.lookups.OrderPriority voLookup2 = new ims.ocrr.vo.lookups.OrderPriority(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.ocrr.vo.lookups.OrderPriority parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.ocrr.vo.lookups.OrderPriority(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setOrderPriority(voLookup2);
		}
				// DisplayDateTime
		java.util.Date DisplayDateTime = domainObject.getDisplayDateTime();
		if ( null != DisplayDateTime ) 
		{
			valueObject.setDisplayDateTime(new ims.framework.utils.DateTime(DisplayDateTime) );
		}
		// DisplayFlag
		ims.domain.lookups.LookupInstance instance4 = domainObject.getDisplayFlag();
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

			ims.ocrr.vo.lookups.OcsDisplayFlag voLookup4 = new ims.ocrr.vo.lookups.OcsDisplayFlag(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.ocrr.vo.lookups.OcsDisplayFlag parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.ocrr.vo.lookups.OcsDisplayFlag(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setDisplayFlag(voLookup4);
		}
				// wasOrdered
		valueObject.setWasOrdered( domainObject.isWasOrdered() );
		// OrdInvCurrentStatus
		valueObject.setOrdInvCurrentStatus(ims.ocrr.vo.domain.OrderedInvestigationStatusVoAssembler.create(map, domainObject.getOrdInvCurrentStatus()) );
		// Specimen
		ims.ocrr.orderingresults.vo.OrderSpecimenRefVoCollection Specimen = new ims.ocrr.orderingresults.vo.OrderSpecimenRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getSpecimen().iterator(); iterator.hasNext(); ) 
		{
			ims.ocrr.orderingresults.domain.objects.OrderSpecimen tmp = (ims.ocrr.orderingresults.domain.objects.OrderSpecimen)iterator.next();
			if (tmp != null)
				Specimen.add(new ims.ocrr.orderingresults.vo.OrderSpecimenRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setSpecimen(Specimen);
		// OrderDetails
		if (domainObject.getOrderDetails() != null)
		{
			if(domainObject.getOrderDetails() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getOrderDetails();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setOrderDetails(new ims.ocrr.orderingresults.vo.OcsOrderSessionRefVo(id, -1));				
			}
			else
			{
				valueObject.setOrderDetails(new ims.ocrr.orderingresults.vo.OcsOrderSessionRefVo(domainObject.getOrderDetails().getId(), domainObject.getOrderDetails().getVersion()));
			}
		}
		// ordInvSeq
		valueObject.setOrdInvSeq(domainObject.getOrdInvSeq());
		// RequestedLocation
		if (domainObject.getRequestedLocation() != null)
		{
			if(domainObject.getRequestedLocation() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getRequestedLocation();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setRequestedLocation(new ims.core.resource.place.vo.LocationRefVo(id, -1));				
			}
			else
			{
				valueObject.setRequestedLocation(new ims.core.resource.place.vo.LocationRefVo(domainObject.getRequestedLocation().getId(), domainObject.getRequestedLocation().getVersion()));
			}
		}
		// AccessionNumber
		valueObject.setAccessionNumber(domainObject.getAccessionNumber());
		// Container
		valueObject.setContainer(ims.ocrr.vo.domain.OrderSpecimenContainerVoAssembler.createOrderSpecimenContainerVoCollectionFromOrderSpecimenContainer(map, domainObject.getContainer()) );
		// ReorderReason
		valueObject.setReorderReason(domainObject.getReorderReason());
		// RequiredByDate
		java.util.Date RequiredByDate = domainObject.getRequiredByDate();
		if ( null != RequiredByDate ) 
		{
			valueObject.setRequiredByDate(new ims.framework.utils.DateTime(RequiredByDate) );
		}
		// OrdInvStatusHistory
		valueObject.setOrdInvStatusHistory(ims.ocrr.vo.domain.OrderedInvestigationStatusVoAssembler.createOrderedInvestigationStatusVoCollectionFromOrderedInvestigationStatus(map, domainObject.getOrdInvStatusHistory()) );
		// CollectionType
		ims.domain.lookups.LookupInstance instance16 = domainObject.getCollectionType();
		if ( null != instance16 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance16.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance16.getImage().getImageId(), instance16.getImage().getImagePath());
			}
			color = instance16.getColor();
			if (color != null) 
				color.getValue();

			ims.ocrr.vo.lookups.SpecimenCollectionType voLookup16 = new ims.ocrr.vo.lookups.SpecimenCollectionType(instance16.getId(),instance16.getText(), instance16.isActive(), null, img, color);
			ims.ocrr.vo.lookups.SpecimenCollectionType parentVoLookup16 = voLookup16;
			ims.domain.lookups.LookupInstance parent16 = instance16.getParent();
			while (parent16 != null)
			{
				if (parent16.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent16.getImage().getImageId(), parent16.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent16.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup16.setParent(new ims.ocrr.vo.lookups.SpecimenCollectionType(parent16.getId(),parent16.getText(), parent16.isActive(), null, img, color));
				parentVoLookup16 = parentVoLookup16.getParent();
								parent16 = parent16.getParent();
			}			
			valueObject.setCollectionType(voLookup16);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.orderingresults.domain.objects.OrderInvestigation extractOrderInvestigation(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderInvestigationVo valueObject) 
	{
		return 	extractOrderInvestigation(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.orderingresults.domain.objects.OrderInvestigation extractOrderInvestigation(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderInvestigationVo valueObject, HashMap domMap) 
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
			// ims.ocrr.vo.OrderInvestigationVo ID_OrderInvestigation field is unknown
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

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.ocrr.configuration.domain.objects.Investigation value1 = null;
		if ( null != valueObject.getInvestigation() ) 
		{
			if (valueObject.getInvestigation().getBoId() == null)
			{
				if (domMap.get(valueObject.getInvestigation()) != null)
				{
					value1 = (ims.ocrr.configuration.domain.objects.Investigation)domMap.get(valueObject.getInvestigation());
				}
			}
			else
			{
				value1 = (ims.ocrr.configuration.domain.objects.Investigation)domainFactory.getDomainObject(ims.ocrr.configuration.domain.objects.Investigation.class, valueObject.getInvestigation().getBoId());
			}
		}
		domainObject.setInvestigation(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getOrderPriority() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getOrderPriority().getID());
		}
		domainObject.setOrderPriority(value2);
		ims.framework.utils.DateTime dateTime3 = valueObject.getDisplayDateTime();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setDisplayDateTime(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getDisplayFlag() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getDisplayFlag().getID());
		}
		domainObject.setDisplayFlag(value4);
		domainObject.setWasOrdered(valueObject.getWasOrdered());
		domainObject.setOrdInvCurrentStatus(ims.ocrr.vo.domain.OrderedInvestigationStatusVoAssembler.extractOrderedInvestigationStatus(domainFactory, valueObject.getOrdInvCurrentStatus(), domMap));

		ims.ocrr.orderingresults.vo.OrderSpecimenRefVoCollection refCollection7 = valueObject.getSpecimen();
		int size7 = (null == refCollection7) ? 0 : refCollection7.size();		
		java.util.List domainSpecimen7 = domainObject.getSpecimen();
		if (domainSpecimen7 == null)
		{
			domainSpecimen7 = new java.util.ArrayList();
		}
		for(int i=0; i < size7; i++) 
		{
			ims.ocrr.orderingresults.vo.OrderSpecimenRefVo vo = refCollection7.get(i);			
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

			int domIdx = domainSpecimen7.indexOf(dom);
			if (domIdx == -1)
			{
				domainSpecimen7.add(i, dom);
			}
			else if (i != domIdx && i < domainSpecimen7.size())
			{
				Object tmp = domainSpecimen7.get(i);
				domainSpecimen7.set(i, domainSpecimen7.get(domIdx));
				domainSpecimen7.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i7 = domainSpecimen7.size();
		while (i7 > size7)
		{
			domainSpecimen7.remove(i7-1);
			i7 = domainSpecimen7.size();
		}
		
		domainObject.setSpecimen(domainSpecimen7);		
		ims.ocrr.orderingresults.domain.objects.OcsOrderSession value8 = null;
		if ( null != valueObject.getOrderDetails() ) 
		{
			if (valueObject.getOrderDetails().getBoId() == null)
			{
				if (domMap.get(valueObject.getOrderDetails()) != null)
				{
					value8 = (ims.ocrr.orderingresults.domain.objects.OcsOrderSession)domMap.get(valueObject.getOrderDetails());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value8 = domainObject.getOrderDetails();	
			}
			else
			{
				value8 = (ims.ocrr.orderingresults.domain.objects.OcsOrderSession)domainFactory.getDomainObject(ims.ocrr.orderingresults.domain.objects.OcsOrderSession.class, valueObject.getOrderDetails().getBoId());
			}
		}
		domainObject.setOrderDetails(value8);
		domainObject.setOrdInvSeq(valueObject.getOrdInvSeq());
		ims.core.resource.place.domain.objects.Location value10 = null;
		if ( null != valueObject.getRequestedLocation() ) 
		{
			if (valueObject.getRequestedLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getRequestedLocation()) != null)
				{
					value10 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getRequestedLocation());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value10 = domainObject.getRequestedLocation();	
			}
			else
			{
				value10 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getRequestedLocation().getBoId());
			}
		}
		domainObject.setRequestedLocation(value10);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAccessionNumber() != null && valueObject.getAccessionNumber().equals(""))
		{
			valueObject.setAccessionNumber(null);
		}
		domainObject.setAccessionNumber(valueObject.getAccessionNumber());
		domainObject.setContainer(ims.ocrr.vo.domain.OrderSpecimenContainerVoAssembler.extractOrderSpecimenContainerSet(domainFactory, valueObject.getContainer(), domainObject.getContainer(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReorderReason() != null && valueObject.getReorderReason().equals(""))
		{
			valueObject.setReorderReason(null);
		}
		domainObject.setReorderReason(valueObject.getReorderReason());
		ims.framework.utils.DateTime dateTime14 = valueObject.getRequiredByDate();
		java.util.Date value14 = null;
		if ( dateTime14 != null ) 
		{
			value14 = dateTime14.getJavaDate();
		}
		domainObject.setRequiredByDate(value14);
		domainObject.setOrdInvStatusHistory(ims.ocrr.vo.domain.OrderedInvestigationStatusVoAssembler.extractOrderedInvestigationStatusList(domainFactory, valueObject.getOrdInvStatusHistory(), domainObject.getOrdInvStatusHistory(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getCollectionType() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getCollectionType().getID());
		}
		domainObject.setCollectionType(value16);

		return domainObject;
	}

}
