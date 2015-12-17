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
 * @author Daniel Laffan
 */
public class OrderSpecimenVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.OrderSpecimenVo copy(ims.ocrr.vo.OrderSpecimenVo valueObjectDest, ims.ocrr.vo.OrderSpecimenVo valueObjectSrc) 
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
		// IsPatientCollect
		valueObjectDest.setIsPatientCollect(valueObjectSrc.getIsPatientCollect());
		// IsAwaitingCollection
		valueObjectDest.setIsAwaitingCollection(valueObjectSrc.getIsAwaitingCollection());
		// SpecimenSource
		valueObjectDest.setSpecimenSource(valueObjectSrc.getSpecimenSource());
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
		// CollectorComment
		valueObjectDest.setCollectorComment(valueObjectSrc.getCollectorComment());
		// SiteCd
		valueObjectDest.setSiteCd(valueObjectSrc.getSiteCd());
		// RequestedType
		valueObjectDest.setRequestedType(valueObjectSrc.getRequestedType());
		// SysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createOrderSpecimenVoCollectionFromOrderSpecimen(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OrderSpecimen objects.
	 */
	public static ims.ocrr.vo.OrderSpecimenVoCollection createOrderSpecimenVoCollectionFromOrderSpecimen(java.util.Set domainObjectSet)	
	{
		return createOrderSpecimenVoCollectionFromOrderSpecimen(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OrderSpecimen objects.
	 */
	public static ims.ocrr.vo.OrderSpecimenVoCollection createOrderSpecimenVoCollectionFromOrderSpecimen(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.OrderSpecimenVoCollection voList = new ims.ocrr.vo.OrderSpecimenVoCollection();
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
			ims.ocrr.vo.OrderSpecimenVo vo = create(map, domainObject);
			
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
	public static ims.ocrr.vo.OrderSpecimenVoCollection createOrderSpecimenVoCollectionFromOrderSpecimen(java.util.List domainObjectList) 
	{
		return createOrderSpecimenVoCollectionFromOrderSpecimen(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.OrderSpecimen objects.
	 */
	public static ims.ocrr.vo.OrderSpecimenVoCollection createOrderSpecimenVoCollectionFromOrderSpecimen(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.OrderSpecimenVoCollection voList = new ims.ocrr.vo.OrderSpecimenVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.orderingresults.domain.objects.OrderSpecimen domainObject = (ims.ocrr.orderingresults.domain.objects.OrderSpecimen) domainObjectList.get(i);
			ims.ocrr.vo.OrderSpecimenVo vo = create(map, domainObject);

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
	 public static java.util.Set extractOrderSpecimenSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderSpecimenVoCollection voCollection) 
	 {
	 	return extractOrderSpecimenSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOrderSpecimenSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderSpecimenVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.OrderSpecimenVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OrderSpecimen domainObject = OrderSpecimenVoAssembler.extractOrderSpecimen(domainFactory, vo, domMap);

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
	 public static java.util.List extractOrderSpecimenList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderSpecimenVoCollection voCollection) 
	 {
	 	return extractOrderSpecimenList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOrderSpecimenList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderSpecimenVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.OrderSpecimenVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OrderSpecimen domainObject = OrderSpecimenVoAssembler.extractOrderSpecimen(domainFactory, vo, domMap);

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
	 public static ims.ocrr.vo.OrderSpecimenVo create(ims.ocrr.orderingresults.domain.objects.OrderSpecimen domainObject) 
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
	  public static ims.ocrr.vo.OrderSpecimenVo create(DomainObjectMap map, ims.ocrr.orderingresults.domain.objects.OrderSpecimen domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.OrderSpecimenVo valueObject = (ims.ocrr.vo.OrderSpecimenVo) map.getValueObject(domainObject, ims.ocrr.vo.OrderSpecimenVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.OrderSpecimenVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.ocrr.vo.OrderSpecimenVo insert(ims.ocrr.vo.OrderSpecimenVo valueObject, ims.ocrr.orderingresults.domain.objects.OrderSpecimen domainObject) 
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
	 public static ims.ocrr.vo.OrderSpecimenVo insert(DomainObjectMap map, ims.ocrr.vo.OrderSpecimenVo valueObject, ims.ocrr.orderingresults.domain.objects.OrderSpecimen domainObject) 
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
		if (domainObject.getCollectingMos() != null)
		{
			if(domainObject.getCollectingMos() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCollectingMos();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCollectingMos(new ims.core.resource.people.vo.MemberOfStaffRefVo(id, -1));				
			}
			else
			{
				valueObject.setCollectingMos(new ims.core.resource.people.vo.MemberOfStaffRefVo(domainObject.getCollectingMos().getId(), domainObject.getCollectingMos().getVersion()));
			}
		}
		// IsPatientCollect
		valueObject.setIsPatientCollect( domainObject.isIsPatientCollect() );
		// IsAwaitingCollection
		valueObject.setIsAwaitingCollection( domainObject.isIsAwaitingCollection() );
		// SpecimenSource
		ims.domain.lookups.LookupInstance instance5 = domainObject.getSpecimenSource();
		if ( null != instance5 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance5.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance5.getImage().getImageId(), instance5.getImage().getImagePath());
			}
			color = instance5.getColor();
			if (color != null) 
				color.getValue();

			ims.ocrr.vo.lookups.SpecimenType voLookup5 = new ims.ocrr.vo.lookups.SpecimenType(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.ocrr.vo.lookups.SpecimenType parentVoLookup5 = voLookup5;
			ims.domain.lookups.LookupInstance parent5 = instance5.getParent();
			while (parent5 != null)
			{
				if (parent5.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent5.getImage().getImageId(), parent5.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent5.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup5.setParent(new ims.ocrr.vo.lookups.SpecimenType(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setSpecimenSource(voLookup5);
		}
				// Discipline
		if (domainObject.getDiscipline() != null)
		{
			if(domainObject.getDiscipline() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getDiscipline();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setDiscipline(new ims.core.clinical.vo.ServiceRefVo(id, -1));				
			}
			else
			{
				valueObject.setDiscipline(new ims.core.clinical.vo.ServiceRefVo(domainObject.getDiscipline().getId(), domainObject.getDiscipline().getVersion()));
			}
		}
		// Investigations
		ims.ocrr.orderingresults.vo.OrderInvestigationRefVoCollection Investigations = new ims.ocrr.orderingresults.vo.OrderInvestigationRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getInvestigations().iterator(); iterator.hasNext(); ) 
		{
			ims.ocrr.orderingresults.domain.objects.OrderInvestigation tmp = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation)iterator.next();
			if (tmp != null)
				Investigations.add(new ims.ocrr.orderingresults.vo.OrderInvestigationRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setInvestigations(Investigations);
		// Order
		if (domainObject.getOrder() != null)
		{
			if(domainObject.getOrder() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getOrder();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setOrder(new ims.ocrr.orderingresults.vo.OcsOrderSessionRefVo(id, -1));				
			}
			else
			{
				valueObject.setOrder(new ims.ocrr.orderingresults.vo.OcsOrderSessionRefVo(domainObject.getOrder().getId(), domainObject.getOrder().getVersion()));
			}
		}
		// Containers
		valueObject.setContainers(ims.ocrr.vo.domain.OrderSpecimenContainerVoAssembler.createOrderSpecimenContainerVoCollectionFromOrderSpecimenContainer(map, domainObject.getContainers()) );
		// InstructionsToCollector
		valueObject.setInstructionsToCollector(domainObject.getInstructionsToCollector());
		// CollectorComment
		valueObject.setCollectorComment(domainObject.getCollectorComment());
		// SiteCd
		ims.domain.lookups.LookupInstance instance12 = domainObject.getSiteCd();
		if ( null != instance12 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance12.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance12.getImage().getImageId(), instance12.getImage().getImagePath());
			}
			color = instance12.getColor();
			if (color != null) 
				color.getValue();

			ims.ocrr.vo.lookups.SpecimenSite voLookup12 = new ims.ocrr.vo.lookups.SpecimenSite(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.ocrr.vo.lookups.SpecimenSite parentVoLookup12 = voLookup12;
			ims.domain.lookups.LookupInstance parent12 = instance12.getParent();
			while (parent12 != null)
			{
				if (parent12.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent12.getImage().getImageId(), parent12.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent12.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup12.setParent(new ims.ocrr.vo.lookups.SpecimenSite(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setSiteCd(voLookup12);
		}
				// RequestedType
		ims.domain.lookups.LookupInstance instance13 = domainObject.getRequestedType();
		if ( null != instance13 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance13.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance13.getImage().getImageId(), instance13.getImage().getImagePath());
			}
			color = instance13.getColor();
			if (color != null) 
				color.getValue();

			ims.ocrr.vo.lookups.SpecimenCollectionType voLookup13 = new ims.ocrr.vo.lookups.SpecimenCollectionType(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.ocrr.vo.lookups.SpecimenCollectionType parentVoLookup13 = voLookup13;
			ims.domain.lookups.LookupInstance parent13 = instance13.getParent();
			while (parent13 != null)
			{
				if (parent13.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent13.getImage().getImageId(), parent13.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent13.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup13.setParent(new ims.ocrr.vo.lookups.SpecimenCollectionType(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setRequestedType(voLookup13);
		}
				// SysInfo
		// set system information
		valueObject.setSysInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.orderingresults.domain.objects.OrderSpecimen extractOrderSpecimen(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderSpecimenVo valueObject) 
	{
		return 	extractOrderSpecimen(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.orderingresults.domain.objects.OrderSpecimen extractOrderSpecimen(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderSpecimenVo valueObject, HashMap domMap) 
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
			// ims.ocrr.vo.OrderSpecimenVo ID_OrderSpecimen field is unknown
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
		ims.core.resource.people.domain.objects.MemberOfStaff value2 = null;
		if ( null != valueObject.getCollectingMos() ) 
		{
			if (valueObject.getCollectingMos().getBoId() == null)
			{
				if (domMap.get(valueObject.getCollectingMos()) != null)
				{
					value2 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getCollectingMos());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getCollectingMos();	
			}
			else
			{
				value2 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getCollectingMos().getBoId());
			}
		}
		domainObject.setCollectingMos(value2);
		domainObject.setIsPatientCollect(valueObject.getIsPatientCollect());
		domainObject.setIsAwaitingCollection(valueObject.getIsAwaitingCollection());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getSpecimenSource() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getSpecimenSource().getID());
		}
		domainObject.setSpecimenSource(value5);
		ims.core.clinical.domain.objects.Service value6 = null;
		if ( null != valueObject.getDiscipline() ) 
		{
			if (valueObject.getDiscipline().getBoId() == null)
			{
				if (domMap.get(valueObject.getDiscipline()) != null)
				{
					value6 = (ims.core.clinical.domain.objects.Service)domMap.get(valueObject.getDiscipline());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value6 = domainObject.getDiscipline();	
			}
			else
			{
				value6 = (ims.core.clinical.domain.objects.Service)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Service.class, valueObject.getDiscipline().getBoId());
			}
		}
		domainObject.setDiscipline(value6);

		ims.ocrr.orderingresults.vo.OrderInvestigationRefVoCollection refCollection7 = valueObject.getInvestigations();
		int size7 = (null == refCollection7) ? 0 : refCollection7.size();		
		java.util.Set domainInvestigations7 = domainObject.getInvestigations();
		if (domainInvestigations7 == null)
		{
			domainInvestigations7 = new java.util.HashSet();
		}
		java.util.Set newSet7  = new java.util.HashSet();
		for(int i=0; i<size7; i++) 
		{
			ims.ocrr.orderingresults.vo.OrderInvestigationRefVo vo = refCollection7.get(i);					
			ims.ocrr.orderingresults.domain.objects.OrderInvestigation dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation)domainFactory.getDomainObject( ims.ocrr.orderingresults.domain.objects.OrderInvestigation.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainInvestigations7.contains(dom))
			{
				domainInvestigations7.add(dom);
			}
			newSet7.add(dom);			
		}
		java.util.Set removedSet7 = new java.util.HashSet();
		java.util.Iterator iter7 = domainInvestigations7.iterator();
		//Find out which objects need to be removed
		while (iter7.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter7.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet7.contains(o))
			{
				removedSet7.add(o);
			}
		}
		iter7 = removedSet7.iterator();
		//Remove the unwanted objects
		while (iter7.hasNext())
		{
			domainInvestigations7.remove(iter7.next());
		}		
		
		domainObject.setInvestigations(domainInvestigations7);		
		ims.ocrr.orderingresults.domain.objects.OcsOrderSession value8 = null;
		if ( null != valueObject.getOrder() ) 
		{
			if (valueObject.getOrder().getBoId() == null)
			{
				if (domMap.get(valueObject.getOrder()) != null)
				{
					value8 = (ims.ocrr.orderingresults.domain.objects.OcsOrderSession)domMap.get(valueObject.getOrder());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value8 = domainObject.getOrder();	
			}
			else
			{
				value8 = (ims.ocrr.orderingresults.domain.objects.OcsOrderSession)domainFactory.getDomainObject(ims.ocrr.orderingresults.domain.objects.OcsOrderSession.class, valueObject.getOrder().getBoId());
			}
		}
		domainObject.setOrder(value8);
		domainObject.setContainers(ims.ocrr.vo.domain.OrderSpecimenContainerVoAssembler.extractOrderSpecimenContainerSet(domainFactory, valueObject.getContainers(), domainObject.getContainers(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getInstructionsToCollector() != null && valueObject.getInstructionsToCollector().equals(""))
		{
			valueObject.setInstructionsToCollector(null);
		}
		domainObject.setInstructionsToCollector(valueObject.getInstructionsToCollector());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCollectorComment() != null && valueObject.getCollectorComment().equals(""))
		{
			valueObject.setCollectorComment(null);
		}
		domainObject.setCollectorComment(valueObject.getCollectorComment());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getSiteCd() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getSiteCd().getID());
		}
		domainObject.setSiteCd(value12);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getRequestedType() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getRequestedType().getID());
		}
		domainObject.setRequestedType(value13);

		return domainObject;
	}

}
