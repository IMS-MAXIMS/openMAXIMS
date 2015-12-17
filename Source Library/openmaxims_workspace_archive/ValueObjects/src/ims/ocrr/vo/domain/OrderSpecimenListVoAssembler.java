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
public class OrderSpecimenListVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.OrderSpecimenListVo copy(ims.ocrr.vo.OrderSpecimenListVo valueObjectDest, ims.ocrr.vo.OrderSpecimenListVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_OrderSpecimen(valueObjectSrc.getID_OrderSpecimen());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CollDateTimePlacer
		valueObjectDest.setCollDateTimePlacer(valueObjectSrc.getCollDateTimePlacer());
		// CollectingMos
		valueObjectDest.setCollectingMos(valueObjectSrc.getCollectingMos());
		// CollectorComment
		valueObjectDest.setCollectorComment(valueObjectSrc.getCollectorComment());
		// IsAwaitingCollection
		valueObjectDest.setIsAwaitingCollection(valueObjectSrc.getIsAwaitingCollection());
		// Discipline
		valueObjectDest.setDiscipline(valueObjectSrc.getDiscipline());
		// Investigations
		valueObjectDest.setInvestigations(valueObjectSrc.getInvestigations());
		// Order
		valueObjectDest.setOrder(valueObjectSrc.getOrder());
		// Containers
		valueObjectDest.setContainers(valueObjectSrc.getContainers());
		// InstructionsToCollector
		valueObjectDest.setInstructionsToCollector(valueObjectSrc.getInstructionsToCollector());
		// SpecimenSource
		valueObjectDest.setSpecimenSource(valueObjectSrc.getSpecimenSource());
		// SiteCd
		valueObjectDest.setSiteCd(valueObjectSrc.getSiteCd());
		// SpecimenCollectionStatus
		valueObjectDest.setSpecimenCollectionStatus(valueObjectSrc.getSpecimenCollectionStatus());
		// SysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
		// PlacerOrdNum
		valueObjectDest.setPlacerOrdNum(valueObjectSrc.getPlacerOrdNum());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createOrderSpecimenListVoCollectionFromOrderSpecimen(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OrderSpecimen objects.
	 */
	public static ims.ocrr.vo.OrderSpecimenListVoCollection createOrderSpecimenListVoCollectionFromOrderSpecimen(java.util.Set domainObjectSet)	
	{
		return createOrderSpecimenListVoCollectionFromOrderSpecimen(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OrderSpecimen objects.
	 */
	public static ims.ocrr.vo.OrderSpecimenListVoCollection createOrderSpecimenListVoCollectionFromOrderSpecimen(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.OrderSpecimenListVoCollection voList = new ims.ocrr.vo.OrderSpecimenListVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ocrr.orderingresults.domain.objects.OrderSpecimen domainObject = (ims.ocrr.orderingresults.domain.objects.OrderSpecimen) iterator.next();
			ims.ocrr.vo.OrderSpecimenListVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.OrderSpecimen objects.
	 */
	public static ims.ocrr.vo.OrderSpecimenListVoCollection createOrderSpecimenListVoCollectionFromOrderSpecimen(java.util.List domainObjectList) 
	{
		return createOrderSpecimenListVoCollectionFromOrderSpecimen(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.OrderSpecimen objects.
	 */
	public static ims.ocrr.vo.OrderSpecimenListVoCollection createOrderSpecimenListVoCollectionFromOrderSpecimen(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.OrderSpecimenListVoCollection voList = new ims.ocrr.vo.OrderSpecimenListVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.orderingresults.domain.objects.OrderSpecimen domainObject = (ims.ocrr.orderingresults.domain.objects.OrderSpecimen) domainObjectList.get(i);
			ims.ocrr.vo.OrderSpecimenListVo vo = create(map, domainObject);

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
	 * Create the ims.ocrr.orderingresults.domain.objects.OrderSpecimen set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractOrderSpecimenSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderSpecimenListVoCollection voCollection) 
	 {
	 	return extractOrderSpecimenSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOrderSpecimenSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderSpecimenListVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.OrderSpecimenListVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OrderSpecimen domainObject = OrderSpecimenListVoAssembler.extractOrderSpecimen(domainFactory, vo, domMap);

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
	 * Create the ims.ocrr.orderingresults.domain.objects.OrderSpecimen list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractOrderSpecimenList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderSpecimenListVoCollection voCollection) 
	 {
	 	return extractOrderSpecimenList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOrderSpecimenList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderSpecimenListVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.OrderSpecimenListVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OrderSpecimen domainObject = OrderSpecimenListVoAssembler.extractOrderSpecimen(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.OrderSpecimen object.
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.OrderSpecimen
	 */
	 public static ims.ocrr.vo.OrderSpecimenListVo create(ims.ocrr.orderingresults.domain.objects.OrderSpecimen domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.OrderSpecimen object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ocrr.vo.OrderSpecimenListVo create(DomainObjectMap map, ims.ocrr.orderingresults.domain.objects.OrderSpecimen domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.OrderSpecimenListVo valueObject = (ims.ocrr.vo.OrderSpecimenListVo) map.getValueObject(domainObject, ims.ocrr.vo.OrderSpecimenListVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.OrderSpecimenListVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.OrderSpecimen
	 */
	 public static ims.ocrr.vo.OrderSpecimenListVo insert(ims.ocrr.vo.OrderSpecimenListVo valueObject, ims.ocrr.orderingresults.domain.objects.OrderSpecimen domainObject) 
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
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.OrderSpecimen
	 */
	 public static ims.ocrr.vo.OrderSpecimenListVo insert(DomainObjectMap map, ims.ocrr.vo.OrderSpecimenListVo valueObject, ims.ocrr.orderingresults.domain.objects.OrderSpecimen domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_OrderSpecimen(domainObject.getId());
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
			
		// CollDateTimePlacer
		java.util.Date CollDateTimePlacer = domainObject.getCollDateTimePlacer();
		if ( null != CollDateTimePlacer ) 
		{
			valueObject.setCollDateTimePlacer(new ims.framework.utils.DateTime(CollDateTimePlacer) );
		}
		// CollectingMos
		valueObject.setCollectingMos(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getCollectingMos()) );
		// CollectorComment
		valueObject.setCollectorComment(domainObject.getCollectorComment());
		// IsAwaitingCollection
		valueObject.setIsAwaitingCollection( domainObject.isIsAwaitingCollection() );
		// Discipline
		valueObject.setDiscipline(ims.core.vo.domain.ServiceLiteVoAssembler.create(map, domainObject.getDiscipline()) );
		// Investigations
		valueObject.setInvestigations(ims.ocrr.vo.domain.OrderInvestigationListVoAssembler.createOrderInvestigationListVoCollectionFromOrderInvestigation(map, domainObject.getInvestigations()) );
		// Order
		valueObject.setOrder(ims.ocrr.vo.domain.OcsOrderListVoAssembler.create(map, domainObject.getOrder()) );
		// Containers
		valueObject.setContainers(ims.ocrr.vo.domain.OrderSpecimenContainerListVoAssembler.createOrderSpecimenContainerListVoCollectionFromOrderSpecimenContainer(map, domainObject.getContainers()) );
		// InstructionsToCollector
		valueObject.setInstructionsToCollector(domainObject.getInstructionsToCollector());
		// SpecimenSource
		ims.domain.lookups.LookupInstance instance10 = domainObject.getSpecimenSource();
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

			ims.ocrr.vo.lookups.SpecimenType voLookup10 = new ims.ocrr.vo.lookups.SpecimenType(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.ocrr.vo.lookups.SpecimenType parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.ocrr.vo.lookups.SpecimenType(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setSpecimenSource(voLookup10);
		}
				// SiteCd
		ims.domain.lookups.LookupInstance instance11 = domainObject.getSiteCd();
		if ( null != instance11 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance11.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance11.getImage().getImageId(), instance11.getImage().getImagePath());
			}
			color = instance11.getColor();
			if (color != null) 
				color.getValue();

			ims.ocrr.vo.lookups.SpecimenSite voLookup11 = new ims.ocrr.vo.lookups.SpecimenSite(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.ocrr.vo.lookups.SpecimenSite parentVoLookup11 = voLookup11;
			ims.domain.lookups.LookupInstance parent11 = instance11.getParent();
			while (parent11 != null)
			{
				if (parent11.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent11.getImage().getImageId(), parent11.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent11.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup11.setParent(new ims.ocrr.vo.lookups.SpecimenSite(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setSiteCd(voLookup11);
		}
				// SpecimenCollectionStatus
		valueObject.setSpecimenCollectionStatus(ims.ocrr.vo.domain.SpecimenCollectionStatusVoAssembler.createSpecimenCollectionStatusVoCollectionFromSpecimenCollectionStatus(map, domainObject.getSpecimenCollectionStatus()) );
		// SysInfo
		// set system information
		valueObject.setSysInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// PlacerOrdNum
		valueObject.setPlacerOrdNum(domainObject.getPlacerOrdNum());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.orderingresults.domain.objects.OrderSpecimen extractOrderSpecimen(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderSpecimenListVo valueObject) 
	{
		return 	extractOrderSpecimen(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.orderingresults.domain.objects.OrderSpecimen extractOrderSpecimen(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderSpecimenListVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_OrderSpecimen();
		ims.ocrr.orderingresults.domain.objects.OrderSpecimen domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.OrderSpecimen)domMap.get(valueObject);
			}
			// ims.ocrr.vo.OrderSpecimenListVo ID_OrderSpecimen field is unknown
			domainObject = new ims.ocrr.orderingresults.domain.objects.OrderSpecimen();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_OrderSpecimen());
			if (domMap.get(key) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.OrderSpecimen)domMap.get(key);
			}
			domainObject = (ims.ocrr.orderingresults.domain.objects.OrderSpecimen) domainFactory.getDomainObject(ims.ocrr.orderingresults.domain.objects.OrderSpecimen.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_OrderSpecimen());

		ims.framework.utils.DateTime dateTime1 = valueObject.getCollDateTimePlacer();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setCollDateTimePlacer(value1);
		domainObject.setCollectingMos(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.extractMemberOfStaff(domainFactory, valueObject.getCollectingMos(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCollectorComment() != null && valueObject.getCollectorComment().equals(""))
		{
			valueObject.setCollectorComment(null);
		}
		domainObject.setCollectorComment(valueObject.getCollectorComment());
		domainObject.setIsAwaitingCollection(valueObject.getIsAwaitingCollection());
		domainObject.setDiscipline(ims.core.vo.domain.ServiceLiteVoAssembler.extractService(domainFactory, valueObject.getDiscipline(), domMap));
		domainObject.setInvestigations(ims.ocrr.vo.domain.OrderInvestigationListVoAssembler.extractOrderInvestigationSet(domainFactory, valueObject.getInvestigations(), domainObject.getInvestigations(), domMap));		
		domainObject.setOrder(ims.ocrr.vo.domain.OcsOrderListVoAssembler.extractOcsOrderSession(domainFactory, valueObject.getOrder(), domMap));
		domainObject.setContainers(ims.ocrr.vo.domain.OrderSpecimenContainerListVoAssembler.extractOrderSpecimenContainerSet(domainFactory, valueObject.getContainers(), domainObject.getContainers(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getInstructionsToCollector() != null && valueObject.getInstructionsToCollector().equals(""))
		{
			valueObject.setInstructionsToCollector(null);
		}
		domainObject.setInstructionsToCollector(valueObject.getInstructionsToCollector());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getSpecimenSource() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getSpecimenSource().getID());
		}
		domainObject.setSpecimenSource(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getSiteCd() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getSiteCd().getID());
		}
		domainObject.setSiteCd(value11);
		domainObject.setSpecimenCollectionStatus(ims.ocrr.vo.domain.SpecimenCollectionStatusVoAssembler.extractSpecimenCollectionStatusSet(domainFactory, valueObject.getSpecimenCollectionStatus(), domainObject.getSpecimenCollectionStatus(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPlacerOrdNum() != null && valueObject.getPlacerOrdNum().equals(""))
		{
			valueObject.setPlacerOrdNum(null);
		}
		domainObject.setPlacerOrdNum(valueObject.getPlacerOrdNum());

		return domainObject;
	}

}
