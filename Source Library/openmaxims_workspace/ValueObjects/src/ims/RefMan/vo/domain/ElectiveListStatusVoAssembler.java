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
 * @author Rory Fitzpatrick
 */
public class ElectiveListStatusVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.ElectiveListStatusVo copy(ims.RefMan.vo.ElectiveListStatusVo valueObjectDest, ims.RefMan.vo.ElectiveListStatusVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ElectiveListStatus(valueObjectSrc.getID_ElectiveListStatus());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AuthoringUser
		valueObjectDest.setAuthoringUser(valueObjectSrc.getAuthoringUser());
		// StatusDateTime
		valueObjectDest.setStatusDateTime(valueObjectSrc.getStatusDateTime());
		// StatusComment
		valueObjectDest.setStatusComment(valueObjectSrc.getStatusComment());
		// ElectiveListStatus
		valueObjectDest.setElectiveListStatus(valueObjectSrc.getElectiveListStatus());
		// RemovalReason
		valueObjectDest.setRemovalReason(valueObjectSrc.getRemovalReason());
		// RemovalOtherReason
		valueObjectDest.setRemovalOtherReason(valueObjectSrc.getRemovalOtherReason());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createElectiveListStatusVoCollectionFromElectiveListStatus(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.ElectiveListStatus objects.
	 */
	public static ims.RefMan.vo.ElectiveListStatusVoCollection createElectiveListStatusVoCollectionFromElectiveListStatus(java.util.Set domainObjectSet)	
	{
		return createElectiveListStatusVoCollectionFromElectiveListStatus(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.ElectiveListStatus objects.
	 */
	public static ims.RefMan.vo.ElectiveListStatusVoCollection createElectiveListStatusVoCollectionFromElectiveListStatus(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.ElectiveListStatusVoCollection voList = new ims.RefMan.vo.ElectiveListStatusVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.ElectiveListStatus domainObject = (ims.RefMan.domain.objects.ElectiveListStatus) iterator.next();
			ims.RefMan.vo.ElectiveListStatusVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.ElectiveListStatus objects.
	 */
	public static ims.RefMan.vo.ElectiveListStatusVoCollection createElectiveListStatusVoCollectionFromElectiveListStatus(java.util.List domainObjectList) 
	{
		return createElectiveListStatusVoCollectionFromElectiveListStatus(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.ElectiveListStatus objects.
	 */
	public static ims.RefMan.vo.ElectiveListStatusVoCollection createElectiveListStatusVoCollectionFromElectiveListStatus(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.ElectiveListStatusVoCollection voList = new ims.RefMan.vo.ElectiveListStatusVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.ElectiveListStatus domainObject = (ims.RefMan.domain.objects.ElectiveListStatus) domainObjectList.get(i);
			ims.RefMan.vo.ElectiveListStatusVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.ElectiveListStatus set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractElectiveListStatusSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ElectiveListStatusVoCollection voCollection) 
	 {
	 	return extractElectiveListStatusSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractElectiveListStatusSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ElectiveListStatusVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ElectiveListStatusVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.ElectiveListStatus domainObject = ElectiveListStatusVoAssembler.extractElectiveListStatus(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.ElectiveListStatus list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractElectiveListStatusList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ElectiveListStatusVoCollection voCollection) 
	 {
	 	return extractElectiveListStatusList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractElectiveListStatusList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ElectiveListStatusVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ElectiveListStatusVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.ElectiveListStatus domainObject = ElectiveListStatusVoAssembler.extractElectiveListStatus(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.ElectiveListStatus object.
	 * @param domainObject ims.RefMan.domain.objects.ElectiveListStatus
	 */
	 public static ims.RefMan.vo.ElectiveListStatusVo create(ims.RefMan.domain.objects.ElectiveListStatus domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.ElectiveListStatus object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.ElectiveListStatusVo create(DomainObjectMap map, ims.RefMan.domain.objects.ElectiveListStatus domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.ElectiveListStatusVo valueObject = (ims.RefMan.vo.ElectiveListStatusVo) map.getValueObject(domainObject, ims.RefMan.vo.ElectiveListStatusVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.ElectiveListStatusVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.ElectiveListStatus
	 */
	 public static ims.RefMan.vo.ElectiveListStatusVo insert(ims.RefMan.vo.ElectiveListStatusVo valueObject, ims.RefMan.domain.objects.ElectiveListStatus domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.ElectiveListStatus
	 */
	 public static ims.RefMan.vo.ElectiveListStatusVo insert(DomainObjectMap map, ims.RefMan.vo.ElectiveListStatusVo valueObject, ims.RefMan.domain.objects.ElectiveListStatus domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ElectiveListStatus(domainObject.getId());
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
			
		// AuthoringUser
		valueObject.setAuthoringUser(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getAuthoringUser()) );
		// StatusDateTime
		java.util.Date StatusDateTime = domainObject.getStatusDateTime();
		if ( null != StatusDateTime ) 
		{
			valueObject.setStatusDateTime(new ims.framework.utils.DateTime(StatusDateTime) );
		}
		// StatusComment
		valueObject.setStatusComment(domainObject.getStatusComment());
		// ElectiveListStatus
		ims.domain.lookups.LookupInstance instance4 = domainObject.getElectiveListStatus();
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

			ims.core.vo.lookups.WaitingListStatus voLookup4 = new ims.core.vo.lookups.WaitingListStatus(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.WaitingListStatus parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.WaitingListStatus(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setElectiveListStatus(voLookup4);
		}
				// RemovalReason
		ims.domain.lookups.LookupInstance instance5 = domainObject.getRemovalReason();
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

			ims.RefMan.vo.lookups.ElectiveListStatusReason voLookup5 = new ims.RefMan.vo.lookups.ElectiveListStatusReason(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ElectiveListStatusReason parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.RefMan.vo.lookups.ElectiveListStatusReason(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setRemovalReason(voLookup5);
		}
				// RemovalOtherReason
		ims.domain.lookups.LookupInstance instance6 = domainObject.getRemovalOtherReason();
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

			ims.RefMan.vo.lookups.RemovalOtherReason voLookup6 = new ims.RefMan.vo.lookups.RemovalOtherReason(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.RefMan.vo.lookups.RemovalOtherReason parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.RefMan.vo.lookups.RemovalOtherReason(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setRemovalOtherReason(voLookup6);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.ElectiveListStatus extractElectiveListStatus(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ElectiveListStatusVo valueObject) 
	{
		return 	extractElectiveListStatus(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.ElectiveListStatus extractElectiveListStatus(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ElectiveListStatusVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ElectiveListStatus();
		ims.RefMan.domain.objects.ElectiveListStatus domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.ElectiveListStatus)domMap.get(valueObject);
			}
			// ims.RefMan.vo.ElectiveListStatusVo ID_ElectiveListStatus field is unknown
			domainObject = new ims.RefMan.domain.objects.ElectiveListStatus();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ElectiveListStatus());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.ElectiveListStatus)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.ElectiveListStatus) domainFactory.getDomainObject(ims.RefMan.domain.objects.ElectiveListStatus.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ElectiveListStatus());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value1 = null;
		if ( null != valueObject.getAuthoringUser() ) 
		{
			if (valueObject.getAuthoringUser().getBoId() == null)
			{
				if (domMap.get(valueObject.getAuthoringUser()) != null)
				{
					value1 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getAuthoringUser());
				}
			}
			else
			{
				value1 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getAuthoringUser().getBoId());
			}
		}
		domainObject.setAuthoringUser(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getStatusDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setStatusDateTime(value2);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getStatusComment() != null && valueObject.getStatusComment().equals(""))
		{
			valueObject.setStatusComment(null);
		}
		domainObject.setStatusComment(valueObject.getStatusComment());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getElectiveListStatus() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getElectiveListStatus().getID());
		}
		domainObject.setElectiveListStatus(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getRemovalReason() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getRemovalReason().getID());
		}
		domainObject.setRemovalReason(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getRemovalOtherReason() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getRemovalOtherReason().getID());
		}
		domainObject.setRemovalOtherReason(value6);

		return domainObject;
	}

}
