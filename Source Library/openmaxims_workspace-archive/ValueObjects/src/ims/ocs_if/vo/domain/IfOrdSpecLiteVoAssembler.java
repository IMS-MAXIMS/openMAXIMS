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
public class IfOrdSpecLiteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocs_if.vo.IfOrdSpecLiteVo copy(ims.ocs_if.vo.IfOrdSpecLiteVo valueObjectDest, ims.ocs_if.vo.IfOrdSpecLiteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_OrderSpecimen(valueObjectSrc.getID_OrderSpecimen());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
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
 	 * If more than one call to an Assembler is made then #createIfOrdSpecLiteVoCollectionFromOrderSpecimen(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OrderSpecimen objects.
	 */
	public static ims.ocs_if.vo.IfOrdSpecLiteVoCollection createIfOrdSpecLiteVoCollectionFromOrderSpecimen(java.util.Set domainObjectSet)	
	{
		return createIfOrdSpecLiteVoCollectionFromOrderSpecimen(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OrderSpecimen objects.
	 */
	public static ims.ocs_if.vo.IfOrdSpecLiteVoCollection createIfOrdSpecLiteVoCollectionFromOrderSpecimen(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocs_if.vo.IfOrdSpecLiteVoCollection voList = new ims.ocs_if.vo.IfOrdSpecLiteVoCollection();
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
			ims.ocs_if.vo.IfOrdSpecLiteVo vo = create(map, domainObject);
			
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
	public static ims.ocs_if.vo.IfOrdSpecLiteVoCollection createIfOrdSpecLiteVoCollectionFromOrderSpecimen(java.util.List domainObjectList) 
	{
		return createIfOrdSpecLiteVoCollectionFromOrderSpecimen(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.OrderSpecimen objects.
	 */
	public static ims.ocs_if.vo.IfOrdSpecLiteVoCollection createIfOrdSpecLiteVoCollectionFromOrderSpecimen(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocs_if.vo.IfOrdSpecLiteVoCollection voList = new ims.ocs_if.vo.IfOrdSpecLiteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.orderingresults.domain.objects.OrderSpecimen domainObject = (ims.ocrr.orderingresults.domain.objects.OrderSpecimen) domainObjectList.get(i);
			ims.ocs_if.vo.IfOrdSpecLiteVo vo = create(map, domainObject);

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
	 public static java.util.Set extractOrderSpecimenSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOrdSpecLiteVoCollection voCollection) 
	 {
	 	return extractOrderSpecimenSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOrderSpecimenSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOrdSpecLiteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocs_if.vo.IfOrdSpecLiteVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OrderSpecimen domainObject = IfOrdSpecLiteVoAssembler.extractOrderSpecimen(domainFactory, vo, domMap);

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
	 public static java.util.List extractOrderSpecimenList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOrdSpecLiteVoCollection voCollection) 
	 {
	 	return extractOrderSpecimenList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOrderSpecimenList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOrdSpecLiteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocs_if.vo.IfOrdSpecLiteVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OrderSpecimen domainObject = IfOrdSpecLiteVoAssembler.extractOrderSpecimen(domainFactory, vo, domMap);

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
	 public static ims.ocs_if.vo.IfOrdSpecLiteVo create(ims.ocrr.orderingresults.domain.objects.OrderSpecimen domainObject) 
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
	  public static ims.ocs_if.vo.IfOrdSpecLiteVo create(DomainObjectMap map, ims.ocrr.orderingresults.domain.objects.OrderSpecimen domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocs_if.vo.IfOrdSpecLiteVo valueObject = (ims.ocs_if.vo.IfOrdSpecLiteVo) map.getValueObject(domainObject, ims.ocs_if.vo.IfOrdSpecLiteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocs_if.vo.IfOrdSpecLiteVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.ocs_if.vo.IfOrdSpecLiteVo insert(ims.ocs_if.vo.IfOrdSpecLiteVo valueObject, ims.ocrr.orderingresults.domain.objects.OrderSpecimen domainObject) 
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
	 public static ims.ocs_if.vo.IfOrdSpecLiteVo insert(DomainObjectMap map, ims.ocs_if.vo.IfOrdSpecLiteVo valueObject, ims.ocrr.orderingresults.domain.objects.OrderSpecimen domainObject) 
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
		ims.domain.lookups.LookupInstance instance7 = domainObject.getSpecimenSource();
		if ( null != instance7 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance7.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance7.getImage().getImageId(), instance7.getImage().getImagePath());
			}
			color = instance7.getColor();
			if (color != null) 
				color.getValue();

			ims.ocrr.vo.lookups.SpecimenType voLookup7 = new ims.ocrr.vo.lookups.SpecimenType(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.ocrr.vo.lookups.SpecimenType parentVoLookup7 = voLookup7;
			ims.domain.lookups.LookupInstance parent7 = instance7.getParent();
			while (parent7 != null)
			{
				if (parent7.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent7.getImage().getImageId(), parent7.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent7.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup7.setParent(new ims.ocrr.vo.lookups.SpecimenType(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setSpecimenSource(voLookup7);
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
		ims.domain.lookups.LookupInstance instance16 = domainObject.getSiteCd();
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

			ims.ocrr.vo.lookups.SpecimenSite voLookup16 = new ims.ocrr.vo.lookups.SpecimenSite(instance16.getId(),instance16.getText(), instance16.isActive(), null, img, color);
			ims.ocrr.vo.lookups.SpecimenSite parentVoLookup16 = voLookup16;
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
								parentVoLookup16.setParent(new ims.ocrr.vo.lookups.SpecimenSite(parent16.getId(),parent16.getText(), parent16.isActive(), null, img, color));
				parentVoLookup16 = parentVoLookup16.getParent();
								parent16 = parent16.getParent();
			}			
			valueObject.setSiteCd(voLookup16);
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
	public static ims.ocrr.orderingresults.domain.objects.OrderSpecimen extractOrderSpecimen(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOrdSpecLiteVo valueObject) 
	{
		return 	extractOrderSpecimen(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.orderingresults.domain.objects.OrderSpecimen extractOrderSpecimen(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOrdSpecLiteVo valueObject, HashMap domMap) 
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
			// ims.ocs_if.vo.IfOrdSpecLiteVo ID_OrderSpecimen field is unknown
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
		ims.framework.utils.DateTime dateTime2 = valueObject.getCollDateTimeFiller();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setCollDateTimeFiller(value2);
		domainObject.setColTimeFillerSupplied(valueObject.getColTimeFillerSupplied());
		ims.framework.utils.DateTime dateTime4 = valueObject.getCollEndDateTimePlacer();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setCollEndDateTimePlacer(value4);
		ims.framework.utils.DateTime dateTime5 = valueObject.getCollEndDateTimeFiller();
		java.util.Date value5 = null;
		if ( dateTime5 != null ) 
		{
			value5 = dateTime5.getJavaDate();
		}
		domainObject.setCollEndDateTimeFiller(value5);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSiteText() != null && valueObject.getSiteText().equals(""))
		{
			valueObject.setSiteText(null);
		}
		domainObject.setSiteText(valueObject.getSiteText());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getSpecimenSource() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getSpecimenSource().getID());
		}
		domainObject.setSpecimenSource(value7);
		domainObject.setDiscipline(ims.core.vo.domain.ServiceLiteVoAssembler.extractService(domainFactory, valueObject.getDiscipline(), domMap));
		domainObject.setCollectingMos(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.extractMemberOfStaff(domainFactory, valueObject.getCollectingMos(), domMap));
		domainObject.setIsPatientCollect(valueObject.getIsPatientCollect());
		domainObject.setIsAwaitingCollection(valueObject.getIsAwaitingCollection());
		ims.framework.utils.DateTime dateTime12 = valueObject.getReceivedDateTime();
		java.util.Date value12 = null;
		if ( dateTime12 != null ) 
		{
			value12 = dateTime12.getJavaDate();
		}
		domainObject.setReceivedDateTime(value12);
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
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getSiteCd() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getSiteCd().getID());
		}
		domainObject.setSiteCd(value16);
		domainObject.setWasProcessed(valueObject.getWasProcessed());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPlacerOrdNum() != null && valueObject.getPlacerOrdNum().equals(""))
		{
			valueObject.setPlacerOrdNum(null);
		}
		domainObject.setPlacerOrdNum(valueObject.getPlacerOrdNum());
		ims.framework.utils.DateTime dateTime19 = valueObject.getDftSpecimenResulted();
		java.util.Date value19 = null;
		if ( dateTime19 != null ) 
		{
			value19 = dateTime19.getJavaDate();
		}
		domainObject.setDftSpecimenResulted(value19);
		domainObject.setDftSpecimenResultedTimeSupplied(valueObject.getDftSpecimenResultedTimeSupplied());

		return domainObject;
	}

}
