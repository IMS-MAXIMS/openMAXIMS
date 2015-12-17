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
package ims.ocs_if.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author John MacEnri
 */
public class IfOrderSpecimenVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocs_if.vo.IfOrderSpecimenVo copy(ims.ocs_if.vo.IfOrderSpecimenVo valueObjectDest, ims.ocs_if.vo.IfOrderSpecimenVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_OrderSpecimen(valueObjectSrc.getID_OrderSpecimen());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Investigations
		valueObjectDest.setInvestigations(valueObjectSrc.getInvestigations());
		// Order
		valueObjectDest.setOrder(valueObjectSrc.getOrder());
		// CollDateTimePlacer
		valueObjectDest.setCollDateTimePlacer(valueObjectSrc.getCollDateTimePlacer());
		// CollDateTimeFiller
		valueObjectDest.setCollDateTimeFiller(valueObjectSrc.getCollDateTimeFiller());
		// ColTimeFillerSupplied
		valueObjectDest.setColTimeFillerSupplied(valueObjectSrc.getColTimeFillerSupplied());
		// CollEndDateTimePlacer
		valueObjectDest.setCollEndDateTimePlacer(valueObjectSrc.getCollEndDateTimePlacer());
		// CollEndDateTimeFiller
		valueObjectDest.setCollEndDateTimeFiller(valueObjectSrc.getCollEndDateTimeFiller());
		// SiteText
		valueObjectDest.setSiteText(valueObjectSrc.getSiteText());
		// SpecimenSource
		valueObjectDest.setSpecimenSource(valueObjectSrc.getSpecimenSource());
		// Discipline
		valueObjectDest.setDiscipline(valueObjectSrc.getDiscipline());
		// CollectingMos
		valueObjectDest.setCollectingMos(valueObjectSrc.getCollectingMos());
		// IsPatientCollect
		valueObjectDest.setIsPatientCollect(valueObjectSrc.getIsPatientCollect());
		// IsAwaitingCollection
		valueObjectDest.setIsAwaitingCollection(valueObjectSrc.getIsAwaitingCollection());
		// ReceivedDateTime
		valueObjectDest.setReceivedDateTime(valueObjectSrc.getReceivedDateTime());
		// ReceivedTimeSupplied
		valueObjectDest.setReceivedTimeSupplied(valueObjectSrc.getReceivedTimeSupplied());
		// FillerOrdNum
		valueObjectDest.setFillerOrdNum(valueObjectSrc.getFillerOrdNum());
		// CollectorComment
		valueObjectDest.setCollectorComment(valueObjectSrc.getCollectorComment());
		// SiteCd
		valueObjectDest.setSiteCd(valueObjectSrc.getSiteCd());
		// wasProcessed
		valueObjectDest.setWasProcessed(valueObjectSrc.getWasProcessed());
		// PlacerOrdNum
		valueObjectDest.setPlacerOrdNum(valueObjectSrc.getPlacerOrdNum());
		// DftSpecimenResulted
		valueObjectDest.setDftSpecimenResulted(valueObjectSrc.getDftSpecimenResulted());
		// DftSpecimenResultedTimeSupplied
		valueObjectDest.setDftSpecimenResultedTimeSupplied(valueObjectSrc.getDftSpecimenResultedTimeSupplied());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createIfOrderSpecimenVoCollectionFromOrderSpecimen(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OrderSpecimen objects.
	 */
	public static ims.ocs_if.vo.IfOrderSpecimenVoCollection createIfOrderSpecimenVoCollectionFromOrderSpecimen(java.util.Set domainObjectSet)	
	{
		return createIfOrderSpecimenVoCollectionFromOrderSpecimen(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OrderSpecimen objects.
	 */
	public static ims.ocs_if.vo.IfOrderSpecimenVoCollection createIfOrderSpecimenVoCollectionFromOrderSpecimen(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocs_if.vo.IfOrderSpecimenVoCollection voList = new ims.ocs_if.vo.IfOrderSpecimenVoCollection();
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
			ims.ocs_if.vo.IfOrderSpecimenVo vo = create(map, domainObject);
			
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
	public static ims.ocs_if.vo.IfOrderSpecimenVoCollection createIfOrderSpecimenVoCollectionFromOrderSpecimen(java.util.List domainObjectList) 
	{
		return createIfOrderSpecimenVoCollectionFromOrderSpecimen(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.OrderSpecimen objects.
	 */
	public static ims.ocs_if.vo.IfOrderSpecimenVoCollection createIfOrderSpecimenVoCollectionFromOrderSpecimen(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocs_if.vo.IfOrderSpecimenVoCollection voList = new ims.ocs_if.vo.IfOrderSpecimenVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.orderingresults.domain.objects.OrderSpecimen domainObject = (ims.ocrr.orderingresults.domain.objects.OrderSpecimen) domainObjectList.get(i);
			ims.ocs_if.vo.IfOrderSpecimenVo vo = create(map, domainObject);

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
	 public static java.util.Set extractOrderSpecimenSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOrderSpecimenVoCollection voCollection) 
	 {
	 	return extractOrderSpecimenSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOrderSpecimenSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOrderSpecimenVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocs_if.vo.IfOrderSpecimenVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OrderSpecimen domainObject = IfOrderSpecimenVoAssembler.extractOrderSpecimen(domainFactory, vo, domMap);

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
	 public static java.util.List extractOrderSpecimenList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOrderSpecimenVoCollection voCollection) 
	 {
	 	return extractOrderSpecimenList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOrderSpecimenList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOrderSpecimenVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocs_if.vo.IfOrderSpecimenVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OrderSpecimen domainObject = IfOrderSpecimenVoAssembler.extractOrderSpecimen(domainFactory, vo, domMap);

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
	 public static ims.ocs_if.vo.IfOrderSpecimenVo create(ims.ocrr.orderingresults.domain.objects.OrderSpecimen domainObject) 
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
	  public static ims.ocs_if.vo.IfOrderSpecimenVo create(DomainObjectMap map, ims.ocrr.orderingresults.domain.objects.OrderSpecimen domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocs_if.vo.IfOrderSpecimenVo valueObject = (ims.ocs_if.vo.IfOrderSpecimenVo) map.getValueObject(domainObject, ims.ocs_if.vo.IfOrderSpecimenVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocs_if.vo.IfOrderSpecimenVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.ocs_if.vo.IfOrderSpecimenVo insert(ims.ocs_if.vo.IfOrderSpecimenVo valueObject, ims.ocrr.orderingresults.domain.objects.OrderSpecimen domainObject) 
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
	 public static ims.ocs_if.vo.IfOrderSpecimenVo insert(DomainObjectMap map, ims.ocs_if.vo.IfOrderSpecimenVo valueObject, ims.ocrr.orderingresults.domain.objects.OrderSpecimen domainObject) 
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
			
		// Investigations
		valueObject.setInvestigations(ims.ocs_if.vo.domain.IfOrderInvestigationVoAssembler.createIfOrderInvestigationVoCollectionFromOrderInvestigation(map, domainObject.getInvestigations()) );
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
		// CollDateTimePlacer
		java.util.Date CollDateTimePlacer = domainObject.getCollDateTimePlacer();
		if ( null != CollDateTimePlacer ) 
		{
			valueObject.setCollDateTimePlacer(new ims.framework.utils.DateTime(CollDateTimePlacer) );
		}
		// CollDateTimeFiller
		java.util.Date CollDateTimeFiller = domainObject.getCollDateTimeFiller();
		if ( null != CollDateTimeFiller ) 
		{
			valueObject.setCollDateTimeFiller(new ims.framework.utils.DateTime(CollDateTimeFiller) );
		}
		// ColTimeFillerSupplied
		valueObject.setColTimeFillerSupplied( domainObject.isColTimeFillerSupplied() );
		// CollEndDateTimePlacer
		java.util.Date CollEndDateTimePlacer = domainObject.getCollEndDateTimePlacer();
		if ( null != CollEndDateTimePlacer ) 
		{
			valueObject.setCollEndDateTimePlacer(new ims.framework.utils.DateTime(CollEndDateTimePlacer) );
		}
		// CollEndDateTimeFiller
		java.util.Date CollEndDateTimeFiller = domainObject.getCollEndDateTimeFiller();
		if ( null != CollEndDateTimeFiller ) 
		{
			valueObject.setCollEndDateTimeFiller(new ims.framework.utils.DateTime(CollEndDateTimeFiller) );
		}
		// SiteText
		valueObject.setSiteText(domainObject.getSiteText());
		// SpecimenSource
		ims.domain.lookups.LookupInstance instance9 = domainObject.getSpecimenSource();
		if ( null != instance9 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance9.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance9.getImage().getImageId(), instance9.getImage().getImagePath());
			}
			color = instance9.getColor();
			if (color != null) 
				color.getValue();

			ims.ocrr.vo.lookups.SpecimenType voLookup9 = new ims.ocrr.vo.lookups.SpecimenType(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.ocrr.vo.lookups.SpecimenType parentVoLookup9 = voLookup9;
			ims.domain.lookups.LookupInstance parent9 = instance9.getParent();
			while (parent9 != null)
			{
				if (parent9.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent9.getImage().getImageId(), parent9.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent9.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup9.setParent(new ims.ocrr.vo.lookups.SpecimenType(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setSpecimenSource(voLookup9);
		}
				// Discipline
		valueObject.setDiscipline(ims.core.vo.domain.ServiceLiteVoAssembler.create(map, domainObject.getDiscipline()) );
		// CollectingMos
		valueObject.setCollectingMos(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getCollectingMos()) );
		// IsPatientCollect
		valueObject.setIsPatientCollect( domainObject.isIsPatientCollect() );
		// IsAwaitingCollection
		valueObject.setIsAwaitingCollection( domainObject.isIsAwaitingCollection() );
		// ReceivedDateTime
		java.util.Date ReceivedDateTime = domainObject.getReceivedDateTime();
		if ( null != ReceivedDateTime ) 
		{
			valueObject.setReceivedDateTime(new ims.framework.utils.DateTime(ReceivedDateTime) );
		}
		// ReceivedTimeSupplied
		valueObject.setReceivedTimeSupplied( domainObject.isReceivedTimeSupplied() );
		// FillerOrdNum
		valueObject.setFillerOrdNum(domainObject.getFillerOrdNum());
		// CollectorComment
		valueObject.setCollectorComment(domainObject.getCollectorComment());
		// SiteCd
		ims.domain.lookups.LookupInstance instance18 = domainObject.getSiteCd();
		if ( null != instance18 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance18.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance18.getImage().getImageId(), instance18.getImage().getImagePath());
			}
			color = instance18.getColor();
			if (color != null) 
				color.getValue();

			ims.ocrr.vo.lookups.SpecimenSite voLookup18 = new ims.ocrr.vo.lookups.SpecimenSite(instance18.getId(),instance18.getText(), instance18.isActive(), null, img, color);
			ims.ocrr.vo.lookups.SpecimenSite parentVoLookup18 = voLookup18;
			ims.domain.lookups.LookupInstance parent18 = instance18.getParent();
			while (parent18 != null)
			{
				if (parent18.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent18.getImage().getImageId(), parent18.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent18.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup18.setParent(new ims.ocrr.vo.lookups.SpecimenSite(parent18.getId(),parent18.getText(), parent18.isActive(), null, img, color));
				parentVoLookup18 = parentVoLookup18.getParent();
								parent18 = parent18.getParent();
			}			
			valueObject.setSiteCd(voLookup18);
		}
				// wasProcessed
		valueObject.setWasProcessed( domainObject.isWasProcessed() );
		// PlacerOrdNum
		valueObject.setPlacerOrdNum(domainObject.getPlacerOrdNum());
		// DftSpecimenResulted
		java.util.Date DftSpecimenResulted = domainObject.getDftSpecimenResulted();
		if ( null != DftSpecimenResulted ) 
		{
			valueObject.setDftSpecimenResulted(new ims.framework.utils.DateTime(DftSpecimenResulted) );
		}
		// DftSpecimenResultedTimeSupplied
		valueObject.setDftSpecimenResultedTimeSupplied( domainObject.isDftSpecimenResultedTimeSupplied() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.orderingresults.domain.objects.OrderSpecimen extractOrderSpecimen(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOrderSpecimenVo valueObject) 
	{
		return 	extractOrderSpecimen(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.orderingresults.domain.objects.OrderSpecimen extractOrderSpecimen(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOrderSpecimenVo valueObject, HashMap domMap) 
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
			// ims.ocs_if.vo.IfOrderSpecimenVo ID_OrderSpecimen field is unknown
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

		domainObject.setInvestigations(ims.ocs_if.vo.domain.IfOrderInvestigationVoAssembler.extractOrderInvestigationSet(domainFactory, valueObject.getInvestigations(), domainObject.getInvestigations(), domMap));		
		ims.ocrr.orderingresults.domain.objects.OcsOrderSession value2 = null;
		if ( null != valueObject.getOrder() ) 
		{
			if (valueObject.getOrder().getBoId() == null)
			{
				if (domMap.get(valueObject.getOrder()) != null)
				{
					value2 = (ims.ocrr.orderingresults.domain.objects.OcsOrderSession)domMap.get(valueObject.getOrder());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getOrder();	
			}
			else
			{
				value2 = (ims.ocrr.orderingresults.domain.objects.OcsOrderSession)domainFactory.getDomainObject(ims.ocrr.orderingresults.domain.objects.OcsOrderSession.class, valueObject.getOrder().getBoId());
			}
		}
		domainObject.setOrder(value2);
		ims.framework.utils.DateTime dateTime3 = valueObject.getCollDateTimePlacer();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setCollDateTimePlacer(value3);
		ims.framework.utils.DateTime dateTime4 = valueObject.getCollDateTimeFiller();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setCollDateTimeFiller(value4);
		domainObject.setColTimeFillerSupplied(valueObject.getColTimeFillerSupplied());
		ims.framework.utils.DateTime dateTime6 = valueObject.getCollEndDateTimePlacer();
		java.util.Date value6 = null;
		if ( dateTime6 != null ) 
		{
			value6 = dateTime6.getJavaDate();
		}
		domainObject.setCollEndDateTimePlacer(value6);
		ims.framework.utils.DateTime dateTime7 = valueObject.getCollEndDateTimeFiller();
		java.util.Date value7 = null;
		if ( dateTime7 != null ) 
		{
			value7 = dateTime7.getJavaDate();
		}
		domainObject.setCollEndDateTimeFiller(value7);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSiteText() != null && valueObject.getSiteText().equals(""))
		{
			valueObject.setSiteText(null);
		}
		domainObject.setSiteText(valueObject.getSiteText());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getSpecimenSource() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getSpecimenSource().getID());
		}
		domainObject.setSpecimenSource(value9);
		domainObject.setDiscipline(ims.core.vo.domain.ServiceLiteVoAssembler.extractService(domainFactory, valueObject.getDiscipline(), domMap));
		domainObject.setCollectingMos(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.extractMemberOfStaff(domainFactory, valueObject.getCollectingMos(), domMap));
		domainObject.setIsPatientCollect(valueObject.getIsPatientCollect());
		domainObject.setIsAwaitingCollection(valueObject.getIsAwaitingCollection());
		ims.framework.utils.DateTime dateTime14 = valueObject.getReceivedDateTime();
		java.util.Date value14 = null;
		if ( dateTime14 != null ) 
		{
			value14 = dateTime14.getJavaDate();
		}
		domainObject.setReceivedDateTime(value14);
		domainObject.setReceivedTimeSupplied(valueObject.getReceivedTimeSupplied());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getFillerOrdNum() != null && valueObject.getFillerOrdNum().equals(""))
		{
			valueObject.setFillerOrdNum(null);
		}
		domainObject.setFillerOrdNum(valueObject.getFillerOrdNum());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCollectorComment() != null && valueObject.getCollectorComment().equals(""))
		{
			valueObject.setCollectorComment(null);
		}
		domainObject.setCollectorComment(valueObject.getCollectorComment());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value18 = null;
		if ( null != valueObject.getSiteCd() ) 
		{
			value18 =
				domainFactory.getLookupInstance(valueObject.getSiteCd().getID());
		}
		domainObject.setSiteCd(value18);
		domainObject.setWasProcessed(valueObject.getWasProcessed());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPlacerOrdNum() != null && valueObject.getPlacerOrdNum().equals(""))
		{
			valueObject.setPlacerOrdNum(null);
		}
		domainObject.setPlacerOrdNum(valueObject.getPlacerOrdNum());
		ims.framework.utils.DateTime dateTime21 = valueObject.getDftSpecimenResulted();
		java.util.Date value21 = null;
		if ( dateTime21 != null ) 
		{
			value21 = dateTime21.getJavaDate();
		}
		domainObject.setDftSpecimenResulted(value21);
		domainObject.setDftSpecimenResultedTimeSupplied(valueObject.getDftSpecimenResultedTimeSupplied());

		return domainObject;
	}

}
