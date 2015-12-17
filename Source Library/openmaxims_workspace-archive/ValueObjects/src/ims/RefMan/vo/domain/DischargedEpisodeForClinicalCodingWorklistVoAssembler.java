/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 16/04/2014, 12:31
 *
 */
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class DischargedEpisodeForClinicalCodingWorklistVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.DischargedEpisodeForClinicalCodingWorklistVo copy(ims.RefMan.vo.DischargedEpisodeForClinicalCodingWorklistVo valueObjectDest, ims.RefMan.vo.DischargedEpisodeForClinicalCodingWorklistVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_DischargedEpisode(valueObjectSrc.getID_DischargedEpisode());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// pasEvent
		valueObjectDest.setPasEvent(valueObjectSrc.getPasEvent());
		// dischargeDateTime
		valueObjectDest.setDischargeDateTime(valueObjectSrc.getDischargeDateTime());
		// DischargeDestination
		valueObjectDest.setDischargeDestination(valueObjectSrc.getDischargeDestination());
		// isCoded
		valueObjectDest.setIsCoded(valueObjectSrc.getIsCoded());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createDischargedEpisodeForClinicalCodingWorklistVoCollectionFromDischargedEpisode(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.DischargedEpisode objects.
	 */
	public static ims.RefMan.vo.DischargedEpisodeForClinicalCodingWorklistVoCollection createDischargedEpisodeForClinicalCodingWorklistVoCollectionFromDischargedEpisode(java.util.Set domainObjectSet)	
	{
		return createDischargedEpisodeForClinicalCodingWorklistVoCollectionFromDischargedEpisode(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.DischargedEpisode objects.
	 */
	public static ims.RefMan.vo.DischargedEpisodeForClinicalCodingWorklistVoCollection createDischargedEpisodeForClinicalCodingWorklistVoCollectionFromDischargedEpisode(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.DischargedEpisodeForClinicalCodingWorklistVoCollection voList = new ims.RefMan.vo.DischargedEpisodeForClinicalCodingWorklistVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.pas.domain.objects.DischargedEpisode domainObject = (ims.core.admin.pas.domain.objects.DischargedEpisode) iterator.next();
			ims.RefMan.vo.DischargedEpisodeForClinicalCodingWorklistVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.DischargedEpisode objects.
	 */
	public static ims.RefMan.vo.DischargedEpisodeForClinicalCodingWorklistVoCollection createDischargedEpisodeForClinicalCodingWorklistVoCollectionFromDischargedEpisode(java.util.List domainObjectList) 
	{
		return createDischargedEpisodeForClinicalCodingWorklistVoCollectionFromDischargedEpisode(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.DischargedEpisode objects.
	 */
	public static ims.RefMan.vo.DischargedEpisodeForClinicalCodingWorklistVoCollection createDischargedEpisodeForClinicalCodingWorklistVoCollectionFromDischargedEpisode(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.DischargedEpisodeForClinicalCodingWorklistVoCollection voList = new ims.RefMan.vo.DischargedEpisodeForClinicalCodingWorklistVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.DischargedEpisode domainObject = (ims.core.admin.pas.domain.objects.DischargedEpisode) domainObjectList.get(i);
			ims.RefMan.vo.DischargedEpisodeForClinicalCodingWorklistVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.pas.domain.objects.DischargedEpisode set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractDischargedEpisodeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.DischargedEpisodeForClinicalCodingWorklistVoCollection voCollection) 
	 {
	 	return extractDischargedEpisodeSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractDischargedEpisodeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.DischargedEpisodeForClinicalCodingWorklistVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.DischargedEpisodeForClinicalCodingWorklistVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.DischargedEpisode domainObject = DischargedEpisodeForClinicalCodingWorklistVoAssembler.extractDischargedEpisode(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.pas.domain.objects.DischargedEpisode list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractDischargedEpisodeList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.DischargedEpisodeForClinicalCodingWorklistVoCollection voCollection) 
	 {
	 	return extractDischargedEpisodeList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractDischargedEpisodeList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.DischargedEpisodeForClinicalCodingWorklistVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.DischargedEpisodeForClinicalCodingWorklistVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.DischargedEpisode domainObject = DischargedEpisodeForClinicalCodingWorklistVoAssembler.extractDischargedEpisode(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.pas.domain.objects.DischargedEpisode object.
	 * @param domainObject ims.core.admin.pas.domain.objects.DischargedEpisode
	 */
	 public static ims.RefMan.vo.DischargedEpisodeForClinicalCodingWorklistVo create(ims.core.admin.pas.domain.objects.DischargedEpisode domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.pas.domain.objects.DischargedEpisode object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.DischargedEpisodeForClinicalCodingWorklistVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.DischargedEpisode domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.DischargedEpisodeForClinicalCodingWorklistVo valueObject = (ims.RefMan.vo.DischargedEpisodeForClinicalCodingWorklistVo) map.getValueObject(domainObject, ims.RefMan.vo.DischargedEpisodeForClinicalCodingWorklistVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.DischargedEpisodeForClinicalCodingWorklistVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.pas.domain.objects.DischargedEpisode
	 */
	 public static ims.RefMan.vo.DischargedEpisodeForClinicalCodingWorklistVo insert(ims.RefMan.vo.DischargedEpisodeForClinicalCodingWorklistVo valueObject, ims.core.admin.pas.domain.objects.DischargedEpisode domainObject) 
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
	 * @param domainObject ims.core.admin.pas.domain.objects.DischargedEpisode
	 */
	 public static ims.RefMan.vo.DischargedEpisodeForClinicalCodingWorklistVo insert(DomainObjectMap map, ims.RefMan.vo.DischargedEpisodeForClinicalCodingWorklistVo valueObject, ims.core.admin.pas.domain.objects.DischargedEpisode domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_DischargedEpisode(domainObject.getId());
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
			
		// pasEvent
		valueObject.setPasEvent(ims.RefMan.vo.domain.PasEventForClinicalCodingWorklistVoAssembler.create(map, domainObject.getPasEvent()) );
		// dischargeDateTime
		java.util.Date dischargeDateTime = domainObject.getDischargeDateTime();
		if ( null != dischargeDateTime ) 
		{
			valueObject.setDischargeDateTime(new ims.framework.utils.DateTime(dischargeDateTime) );
		}
		// DischargeDestination
		ims.domain.lookups.LookupInstance instance3 = domainObject.getDischargeDestination();
		if ( null != instance3 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance3.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance3.getImage().getImageId(), instance3.getImage().getImagePath());
			}
			color = instance3.getColor();
			if (color != null) 
				color.getValue();

			ims.coe.vo.lookups.DischargeDestination voLookup3 = new ims.coe.vo.lookups.DischargeDestination(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.coe.vo.lookups.DischargeDestination parentVoLookup3 = voLookup3;
			ims.domain.lookups.LookupInstance parent3 = instance3.getParent();
			while (parent3 != null)
			{
				if (parent3.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent3.getImage().getImageId(), parent3.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent3.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup3.setParent(new ims.coe.vo.lookups.DischargeDestination(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setDischargeDestination(voLookup3);
		}
				// isCoded
		valueObject.setIsCoded( domainObject.isIsCoded() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.pas.domain.objects.DischargedEpisode extractDischargedEpisode(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.DischargedEpisodeForClinicalCodingWorklistVo valueObject) 
	{
		return 	extractDischargedEpisode(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.DischargedEpisode extractDischargedEpisode(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.DischargedEpisodeForClinicalCodingWorklistVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_DischargedEpisode();
		ims.core.admin.pas.domain.objects.DischargedEpisode domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.pas.domain.objects.DischargedEpisode)domMap.get(valueObject);
			}
			// ims.RefMan.vo.DischargedEpisodeForClinicalCodingWorklistVo ID_DischargedEpisode field is unknown
			domainObject = new ims.core.admin.pas.domain.objects.DischargedEpisode();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_DischargedEpisode());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.pas.domain.objects.DischargedEpisode)domMap.get(key);
			}
			domainObject = (ims.core.admin.pas.domain.objects.DischargedEpisode) domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.DischargedEpisode.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_DischargedEpisode());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.pas.domain.objects.PASEvent value1 = null;
		if ( null != valueObject.getPasEvent() ) 
		{
			if (valueObject.getPasEvent().getBoId() == null)
			{
				if (domMap.get(valueObject.getPasEvent()) != null)
				{
					value1 = (ims.core.admin.pas.domain.objects.PASEvent)domMap.get(valueObject.getPasEvent());
				}
			}
			else
			{
				value1 = (ims.core.admin.pas.domain.objects.PASEvent)domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.PASEvent.class, valueObject.getPasEvent().getBoId());
			}
		}
		domainObject.setPasEvent(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getDischargeDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setDischargeDateTime(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getDischargeDestination() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getDischargeDestination().getID());
		}
		domainObject.setDischargeDestination(value3);
		domainObject.setIsCoded(valueObject.getIsCoded());

		return domainObject;
	}

}
