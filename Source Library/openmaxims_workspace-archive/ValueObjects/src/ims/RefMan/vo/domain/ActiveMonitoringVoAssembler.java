/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 16/04/2014, 12:32
 *
 */
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class ActiveMonitoringVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.ActiveMonitoringVo copy(ims.RefMan.vo.ActiveMonitoringVo valueObjectDest, ims.RefMan.vo.ActiveMonitoringVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ActiveMonitoring(valueObjectSrc.getID_ActiveMonitoring());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// StartDateActiveMonitoring
		valueObjectDest.setStartDateActiveMonitoring(valueObjectSrc.getStartDateActiveMonitoring());
		// ActiveMonitoringReason
		valueObjectDest.setActiveMonitoringReason(valueObjectSrc.getActiveMonitoringReason());
		// PeriodOfMonitoringDays
		valueObjectDest.setPeriodOfMonitoringDays(valueObjectSrc.getPeriodOfMonitoringDays());
		// BookApptBy
		valueObjectDest.setBookApptBy(valueObjectSrc.getBookApptBy());
		// ActiveMonitoringComments
		valueObjectDest.setActiveMonitoringComments(valueObjectSrc.getActiveMonitoringComments());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// RecordingInformation
		valueObjectDest.setRecordingInformation(valueObjectSrc.getRecordingInformation());
		// ActiveMonitoringEndDate
		valueObjectDest.setActiveMonitoringEndDate(valueObjectSrc.getActiveMonitoringEndDate());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createActiveMonitoringVoCollectionFromActiveMonitoring(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.ActiveMonitoring objects.
	 */
	public static ims.RefMan.vo.ActiveMonitoringVoCollection createActiveMonitoringVoCollectionFromActiveMonitoring(java.util.Set domainObjectSet)	
	{
		return createActiveMonitoringVoCollectionFromActiveMonitoring(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.ActiveMonitoring objects.
	 */
	public static ims.RefMan.vo.ActiveMonitoringVoCollection createActiveMonitoringVoCollectionFromActiveMonitoring(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.ActiveMonitoringVoCollection voList = new ims.RefMan.vo.ActiveMonitoringVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.ActiveMonitoring domainObject = (ims.RefMan.domain.objects.ActiveMonitoring) iterator.next();
			ims.RefMan.vo.ActiveMonitoringVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.ActiveMonitoring objects.
	 */
	public static ims.RefMan.vo.ActiveMonitoringVoCollection createActiveMonitoringVoCollectionFromActiveMonitoring(java.util.List domainObjectList) 
	{
		return createActiveMonitoringVoCollectionFromActiveMonitoring(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.ActiveMonitoring objects.
	 */
	public static ims.RefMan.vo.ActiveMonitoringVoCollection createActiveMonitoringVoCollectionFromActiveMonitoring(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.ActiveMonitoringVoCollection voList = new ims.RefMan.vo.ActiveMonitoringVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.ActiveMonitoring domainObject = (ims.RefMan.domain.objects.ActiveMonitoring) domainObjectList.get(i);
			ims.RefMan.vo.ActiveMonitoringVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.ActiveMonitoring set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractActiveMonitoringSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ActiveMonitoringVoCollection voCollection) 
	 {
	 	return extractActiveMonitoringSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractActiveMonitoringSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ActiveMonitoringVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ActiveMonitoringVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.ActiveMonitoring domainObject = ActiveMonitoringVoAssembler.extractActiveMonitoring(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.ActiveMonitoring list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractActiveMonitoringList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ActiveMonitoringVoCollection voCollection) 
	 {
	 	return extractActiveMonitoringList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractActiveMonitoringList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ActiveMonitoringVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ActiveMonitoringVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.ActiveMonitoring domainObject = ActiveMonitoringVoAssembler.extractActiveMonitoring(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.ActiveMonitoring object.
	 * @param domainObject ims.RefMan.domain.objects.ActiveMonitoring
	 */
	 public static ims.RefMan.vo.ActiveMonitoringVo create(ims.RefMan.domain.objects.ActiveMonitoring domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.ActiveMonitoring object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.ActiveMonitoringVo create(DomainObjectMap map, ims.RefMan.domain.objects.ActiveMonitoring domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.ActiveMonitoringVo valueObject = (ims.RefMan.vo.ActiveMonitoringVo) map.getValueObject(domainObject, ims.RefMan.vo.ActiveMonitoringVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.ActiveMonitoringVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.ActiveMonitoring
	 */
	 public static ims.RefMan.vo.ActiveMonitoringVo insert(ims.RefMan.vo.ActiveMonitoringVo valueObject, ims.RefMan.domain.objects.ActiveMonitoring domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.ActiveMonitoring
	 */
	 public static ims.RefMan.vo.ActiveMonitoringVo insert(DomainObjectMap map, ims.RefMan.vo.ActiveMonitoringVo valueObject, ims.RefMan.domain.objects.ActiveMonitoring domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ActiveMonitoring(domainObject.getId());
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
			
		// StartDateActiveMonitoring
		java.util.Date StartDateActiveMonitoring = domainObject.getStartDateActiveMonitoring();
		if ( null != StartDateActiveMonitoring ) 
		{
			valueObject.setStartDateActiveMonitoring(new ims.framework.utils.DateTime(StartDateActiveMonitoring) );
		}
		// ActiveMonitoringReason
		ims.domain.lookups.LookupInstance instance2 = domainObject.getActiveMonitoringReason();
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

			ims.RefMan.vo.lookups.ActiveMonitoringReason voLookup2 = new ims.RefMan.vo.lookups.ActiveMonitoringReason(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ActiveMonitoringReason parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.RefMan.vo.lookups.ActiveMonitoringReason(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setActiveMonitoringReason(voLookup2);
		}
				// PeriodOfMonitoringDays
		valueObject.setPeriodOfMonitoringDays(domainObject.getPeriodOfMonitoringDays());
		// BookApptBy
		java.util.Date BookApptBy = domainObject.getBookApptBy();
		if ( null != BookApptBy ) 
		{
			valueObject.setBookApptBy(new ims.framework.utils.Date(BookApptBy) );
		}
		// ActiveMonitoringComments
		valueObject.setActiveMonitoringComments(domainObject.getActiveMonitoringComments());
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringHCP()) );
		// RecordingInformation
		valueObject.setRecordingInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getRecordingInformation()) );
		// ActiveMonitoringEndDate
		java.util.Date ActiveMonitoringEndDate = domainObject.getActiveMonitoringEndDate();
		if ( null != ActiveMonitoringEndDate ) 
		{
			valueObject.setActiveMonitoringEndDate(new ims.framework.utils.Date(ActiveMonitoringEndDate) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.ActiveMonitoring extractActiveMonitoring(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ActiveMonitoringVo valueObject) 
	{
		return 	extractActiveMonitoring(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.ActiveMonitoring extractActiveMonitoring(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ActiveMonitoringVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ActiveMonitoring();
		ims.RefMan.domain.objects.ActiveMonitoring domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.ActiveMonitoring)domMap.get(valueObject);
			}
			// ims.RefMan.vo.ActiveMonitoringVo ID_ActiveMonitoring field is unknown
			domainObject = new ims.RefMan.domain.objects.ActiveMonitoring();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ActiveMonitoring());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.ActiveMonitoring)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.ActiveMonitoring) domainFactory.getDomainObject(ims.RefMan.domain.objects.ActiveMonitoring.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ActiveMonitoring());

		ims.framework.utils.DateTime dateTime1 = valueObject.getStartDateActiveMonitoring();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setStartDateActiveMonitoring(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getActiveMonitoringReason() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getActiveMonitoringReason().getID());
		}
		domainObject.setActiveMonitoringReason(value2);
		domainObject.setPeriodOfMonitoringDays(valueObject.getPeriodOfMonitoringDays());
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getBookApptBy();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setBookApptBy(value4);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getActiveMonitoringComments() != null && valueObject.getActiveMonitoringComments().equals(""))
		{
			valueObject.setActiveMonitoringComments(null);
		}
		domainObject.setActiveMonitoringComments(valueObject.getActiveMonitoringComments());
		domainObject.setAuthoringHCP(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		domainObject.setRecordingInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getRecordingInformation(), domMap));
		java.util.Date value8 = null;
		ims.framework.utils.Date date8 = valueObject.getActiveMonitoringEndDate();		
		if ( date8 != null ) 
		{
			value8 = date8.getDate();
		}
		domainObject.setActiveMonitoringEndDate(value8);

		return domainObject;
	}

}
