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
 * @author Catalin Tomozei
 */
public class ProviderCancellationVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.ProviderCancellationVo copy(ims.RefMan.vo.ProviderCancellationVo valueObjectDest, ims.RefMan.vo.ProviderCancellationVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ProviderCancellation(valueObjectSrc.getID_ProviderCancellation());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Reason
		valueObjectDest.setReason(valueObjectSrc.getReason());
		// Comments
		valueObjectDest.setComments(valueObjectSrc.getComments());
		// CancellationDateTime
		valueObjectDest.setCancellationDateTime(valueObjectSrc.getCancellationDateTime());
		// wasGPInformed
		valueObjectDest.setWasGPInformed(valueObjectSrc.getWasGPInformed());
		// wasPatientInformed
		valueObjectDest.setWasPatientInformed(valueObjectSrc.getWasPatientInformed());
		// SysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createProviderCancellationVoCollectionFromProviderCancellation(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.ProviderCancellation objects.
	 */
	public static ims.RefMan.vo.ProviderCancellationVoCollection createProviderCancellationVoCollectionFromProviderCancellation(java.util.Set domainObjectSet)	
	{
		return createProviderCancellationVoCollectionFromProviderCancellation(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.ProviderCancellation objects.
	 */
	public static ims.RefMan.vo.ProviderCancellationVoCollection createProviderCancellationVoCollectionFromProviderCancellation(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.ProviderCancellationVoCollection voList = new ims.RefMan.vo.ProviderCancellationVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.ProviderCancellation domainObject = (ims.RefMan.domain.objects.ProviderCancellation) iterator.next();
			ims.RefMan.vo.ProviderCancellationVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.ProviderCancellation objects.
	 */
	public static ims.RefMan.vo.ProviderCancellationVoCollection createProviderCancellationVoCollectionFromProviderCancellation(java.util.List domainObjectList) 
	{
		return createProviderCancellationVoCollectionFromProviderCancellation(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.ProviderCancellation objects.
	 */
	public static ims.RefMan.vo.ProviderCancellationVoCollection createProviderCancellationVoCollectionFromProviderCancellation(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.ProviderCancellationVoCollection voList = new ims.RefMan.vo.ProviderCancellationVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.ProviderCancellation domainObject = (ims.RefMan.domain.objects.ProviderCancellation) domainObjectList.get(i);
			ims.RefMan.vo.ProviderCancellationVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.ProviderCancellation set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractProviderCancellationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ProviderCancellationVoCollection voCollection) 
	 {
	 	return extractProviderCancellationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractProviderCancellationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ProviderCancellationVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ProviderCancellationVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.ProviderCancellation domainObject = ProviderCancellationVoAssembler.extractProviderCancellation(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.ProviderCancellation list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractProviderCancellationList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ProviderCancellationVoCollection voCollection) 
	 {
	 	return extractProviderCancellationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractProviderCancellationList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ProviderCancellationVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ProviderCancellationVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.ProviderCancellation domainObject = ProviderCancellationVoAssembler.extractProviderCancellation(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.ProviderCancellation object.
	 * @param domainObject ims.RefMan.domain.objects.ProviderCancellation
	 */
	 public static ims.RefMan.vo.ProviderCancellationVo create(ims.RefMan.domain.objects.ProviderCancellation domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.ProviderCancellation object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.ProviderCancellationVo create(DomainObjectMap map, ims.RefMan.domain.objects.ProviderCancellation domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.ProviderCancellationVo valueObject = (ims.RefMan.vo.ProviderCancellationVo) map.getValueObject(domainObject, ims.RefMan.vo.ProviderCancellationVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.ProviderCancellationVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.ProviderCancellation
	 */
	 public static ims.RefMan.vo.ProviderCancellationVo insert(ims.RefMan.vo.ProviderCancellationVo valueObject, ims.RefMan.domain.objects.ProviderCancellation domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.ProviderCancellation
	 */
	 public static ims.RefMan.vo.ProviderCancellationVo insert(DomainObjectMap map, ims.RefMan.vo.ProviderCancellationVo valueObject, ims.RefMan.domain.objects.ProviderCancellation domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ProviderCancellation(domainObject.getId());
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
			
		// Reason
		ims.domain.lookups.LookupInstance instance1 = domainObject.getReason();
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

			ims.RefMan.vo.lookups.ProviderCancellationReason voLookup1 = new ims.RefMan.vo.lookups.ProviderCancellationReason(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ProviderCancellationReason parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.RefMan.vo.lookups.ProviderCancellationReason(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setReason(voLookup1);
		}
				// Comments
		valueObject.setComments(domainObject.getComments());
		// CancellationDateTime
		java.util.Date CancellationDateTime = domainObject.getCancellationDateTime();
		if ( null != CancellationDateTime ) 
		{
			valueObject.setCancellationDateTime(new ims.framework.utils.DateTime(CancellationDateTime) );
		}
		// wasGPInformed
		valueObject.setWasGPInformed( domainObject.isWasGPInformed() );
		// wasPatientInformed
		valueObject.setWasPatientInformed( domainObject.isWasPatientInformed() );
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
	public static ims.RefMan.domain.objects.ProviderCancellation extractProviderCancellation(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ProviderCancellationVo valueObject) 
	{
		return 	extractProviderCancellation(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.ProviderCancellation extractProviderCancellation(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ProviderCancellationVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ProviderCancellation();
		ims.RefMan.domain.objects.ProviderCancellation domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.ProviderCancellation)domMap.get(valueObject);
			}
			// ims.RefMan.vo.ProviderCancellationVo ID_ProviderCancellation field is unknown
			domainObject = new ims.RefMan.domain.objects.ProviderCancellation();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ProviderCancellation());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.ProviderCancellation)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.ProviderCancellation) domainFactory.getDomainObject(ims.RefMan.domain.objects.ProviderCancellation.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ProviderCancellation());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getReason() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getReason().getID());
		}
		domainObject.setReason(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComments() != null && valueObject.getComments().equals(""))
		{
			valueObject.setComments(null);
		}
		domainObject.setComments(valueObject.getComments());
		ims.framework.utils.DateTime dateTime3 = valueObject.getCancellationDateTime();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setCancellationDateTime(value3);
		domainObject.setWasGPInformed(valueObject.getWasGPInformed());
		domainObject.setWasPatientInformed(valueObject.getWasPatientInformed());

		return domainObject;
	}

}
