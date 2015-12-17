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
 * @author Cornel Ventuneac
 */
public class ReviewPatientElectiveListVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.ReviewPatientElectiveListVo copy(ims.RefMan.vo.ReviewPatientElectiveListVo valueObjectDest, ims.RefMan.vo.ReviewPatientElectiveListVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ReviewPatientElectiveList(valueObjectSrc.getID_ReviewPatientElectiveList());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ReviewType
		valueObjectDest.setReviewType(valueObjectSrc.getReviewType());
		// ReviewNotes
		valueObjectDest.setReviewNotes(valueObjectSrc.getReviewNotes());
		// ReviewedDate
		valueObjectDest.setReviewedDate(valueObjectSrc.getReviewedDate());
		// ReviewedBy
		valueObjectDest.setReviewedBy(valueObjectSrc.getReviewedBy());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createReviewPatientElectiveListVoCollectionFromReviewPatientElectiveList(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.ReviewPatientElectiveList objects.
	 */
	public static ims.RefMan.vo.ReviewPatientElectiveListVoCollection createReviewPatientElectiveListVoCollectionFromReviewPatientElectiveList(java.util.Set domainObjectSet)	
	{
		return createReviewPatientElectiveListVoCollectionFromReviewPatientElectiveList(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.ReviewPatientElectiveList objects.
	 */
	public static ims.RefMan.vo.ReviewPatientElectiveListVoCollection createReviewPatientElectiveListVoCollectionFromReviewPatientElectiveList(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.ReviewPatientElectiveListVoCollection voList = new ims.RefMan.vo.ReviewPatientElectiveListVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.ReviewPatientElectiveList domainObject = (ims.RefMan.domain.objects.ReviewPatientElectiveList) iterator.next();
			ims.RefMan.vo.ReviewPatientElectiveListVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.ReviewPatientElectiveList objects.
	 */
	public static ims.RefMan.vo.ReviewPatientElectiveListVoCollection createReviewPatientElectiveListVoCollectionFromReviewPatientElectiveList(java.util.List domainObjectList) 
	{
		return createReviewPatientElectiveListVoCollectionFromReviewPatientElectiveList(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.ReviewPatientElectiveList objects.
	 */
	public static ims.RefMan.vo.ReviewPatientElectiveListVoCollection createReviewPatientElectiveListVoCollectionFromReviewPatientElectiveList(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.ReviewPatientElectiveListVoCollection voList = new ims.RefMan.vo.ReviewPatientElectiveListVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.ReviewPatientElectiveList domainObject = (ims.RefMan.domain.objects.ReviewPatientElectiveList) domainObjectList.get(i);
			ims.RefMan.vo.ReviewPatientElectiveListVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.ReviewPatientElectiveList set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractReviewPatientElectiveListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReviewPatientElectiveListVoCollection voCollection) 
	 {
	 	return extractReviewPatientElectiveListSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractReviewPatientElectiveListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReviewPatientElectiveListVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ReviewPatientElectiveListVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.ReviewPatientElectiveList domainObject = ReviewPatientElectiveListVoAssembler.extractReviewPatientElectiveList(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.ReviewPatientElectiveList list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractReviewPatientElectiveListList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReviewPatientElectiveListVoCollection voCollection) 
	 {
	 	return extractReviewPatientElectiveListList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractReviewPatientElectiveListList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReviewPatientElectiveListVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ReviewPatientElectiveListVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.ReviewPatientElectiveList domainObject = ReviewPatientElectiveListVoAssembler.extractReviewPatientElectiveList(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.ReviewPatientElectiveList object.
	 * @param domainObject ims.RefMan.domain.objects.ReviewPatientElectiveList
	 */
	 public static ims.RefMan.vo.ReviewPatientElectiveListVo create(ims.RefMan.domain.objects.ReviewPatientElectiveList domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.ReviewPatientElectiveList object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.ReviewPatientElectiveListVo create(DomainObjectMap map, ims.RefMan.domain.objects.ReviewPatientElectiveList domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.ReviewPatientElectiveListVo valueObject = (ims.RefMan.vo.ReviewPatientElectiveListVo) map.getValueObject(domainObject, ims.RefMan.vo.ReviewPatientElectiveListVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.ReviewPatientElectiveListVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.ReviewPatientElectiveList
	 */
	 public static ims.RefMan.vo.ReviewPatientElectiveListVo insert(ims.RefMan.vo.ReviewPatientElectiveListVo valueObject, ims.RefMan.domain.objects.ReviewPatientElectiveList domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.ReviewPatientElectiveList
	 */
	 public static ims.RefMan.vo.ReviewPatientElectiveListVo insert(DomainObjectMap map, ims.RefMan.vo.ReviewPatientElectiveListVo valueObject, ims.RefMan.domain.objects.ReviewPatientElectiveList domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ReviewPatientElectiveList(domainObject.getId());
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
			
		// ReviewType
		ims.domain.lookups.LookupInstance instance1 = domainObject.getReviewType();
		if ( null != instance1 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance1.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance1.getImage().getImageId(), instance1.getImage().getImagePath());
			}
			color = instance1.getColor();
			if (color != null) 
				color.getValue();

			ims.RefMan.vo.lookups.ElectiveListReviewType voLookup1 = new ims.RefMan.vo.lookups.ElectiveListReviewType(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ElectiveListReviewType parentVoLookup1 = voLookup1;
			ims.domain.lookups.LookupInstance parent1 = instance1.getParent();
			while (parent1 != null)
			{
				if (parent1.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent1.getImage().getImageId(), parent1.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent1.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup1.setParent(new ims.RefMan.vo.lookups.ElectiveListReviewType(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setReviewType(voLookup1);
		}
				// ReviewNotes
		valueObject.setReviewNotes(domainObject.getReviewNotes());
		// ReviewedDate
		java.util.Date ReviewedDate = domainObject.getReviewedDate();
		if ( null != ReviewedDate ) 
		{
			valueObject.setReviewedDate(new ims.framework.utils.DateTime(ReviewedDate) );
		}
		// ReviewedBy
		valueObject.setReviewedBy(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getReviewedBy()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.ReviewPatientElectiveList extractReviewPatientElectiveList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReviewPatientElectiveListVo valueObject) 
	{
		return 	extractReviewPatientElectiveList(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.ReviewPatientElectiveList extractReviewPatientElectiveList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReviewPatientElectiveListVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ReviewPatientElectiveList();
		ims.RefMan.domain.objects.ReviewPatientElectiveList domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.ReviewPatientElectiveList)domMap.get(valueObject);
			}
			// ims.RefMan.vo.ReviewPatientElectiveListVo ID_ReviewPatientElectiveList field is unknown
			domainObject = new ims.RefMan.domain.objects.ReviewPatientElectiveList();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ReviewPatientElectiveList());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.ReviewPatientElectiveList)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.ReviewPatientElectiveList) domainFactory.getDomainObject(ims.RefMan.domain.objects.ReviewPatientElectiveList.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ReviewPatientElectiveList());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getReviewType() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getReviewType().getID());
		}
		domainObject.setReviewType(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReviewNotes() != null && valueObject.getReviewNotes().equals(""))
		{
			valueObject.setReviewNotes(null);
		}
		domainObject.setReviewNotes(valueObject.getReviewNotes());
		ims.framework.utils.DateTime dateTime3 = valueObject.getReviewedDate();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setReviewedDate(value3);
		domainObject.setReviewedBy(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.extractMemberOfStaff(domainFactory, valueObject.getReviewedBy(), domMap));

		return domainObject;
	}

}
