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
public class OnwardReferralVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.OnwardReferralVo copy(ims.RefMan.vo.OnwardReferralVo valueObjectDest, ims.RefMan.vo.OnwardReferralVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_OnwardReferral(valueObjectSrc.getID_OnwardReferral());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// DischargeDate
		valueObjectDest.setDischargeDate(valueObjectSrc.getDischargeDate());
		// OnwardReferralOrg
		valueObjectDest.setOnwardReferralOrg(valueObjectSrc.getOnwardReferralOrg());
		// OnwardReferral
		valueObjectDest.setOnwardReferral(valueObjectSrc.getOnwardReferral());
		// RejectedDate
		valueObjectDest.setRejectedDate(valueObjectSrc.getRejectedDate());
		// RejectionReason
		valueObjectDest.setRejectionReason(valueObjectSrc.getRejectionReason());
		// RejectedBy
		valueObjectDest.setRejectedBy(valueObjectSrc.getRejectedBy());
		// OnwardReferralReason
		valueObjectDest.setOnwardReferralReason(valueObjectSrc.getOnwardReferralReason());
		// CopyToGP
		valueObjectDest.setCopyToGP(valueObjectSrc.getCopyToGP());
		// CopyToPatient
		valueObjectDest.setCopyToPatient(valueObjectSrc.getCopyToPatient());
		// CopyToSecondaryCare
		valueObjectDest.setCopyToSecondaryCare(valueObjectSrc.getCopyToSecondaryCare());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createOnwardReferralVoCollectionFromOnwardReferral(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.OnwardReferral objects.
	 */
	public static ims.RefMan.vo.OnwardReferralVoCollection createOnwardReferralVoCollectionFromOnwardReferral(java.util.Set domainObjectSet)	
	{
		return createOnwardReferralVoCollectionFromOnwardReferral(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.OnwardReferral objects.
	 */
	public static ims.RefMan.vo.OnwardReferralVoCollection createOnwardReferralVoCollectionFromOnwardReferral(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.OnwardReferralVoCollection voList = new ims.RefMan.vo.OnwardReferralVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.OnwardReferral domainObject = (ims.RefMan.domain.objects.OnwardReferral) iterator.next();
			ims.RefMan.vo.OnwardReferralVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.OnwardReferral objects.
	 */
	public static ims.RefMan.vo.OnwardReferralVoCollection createOnwardReferralVoCollectionFromOnwardReferral(java.util.List domainObjectList) 
	{
		return createOnwardReferralVoCollectionFromOnwardReferral(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.OnwardReferral objects.
	 */
	public static ims.RefMan.vo.OnwardReferralVoCollection createOnwardReferralVoCollectionFromOnwardReferral(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.OnwardReferralVoCollection voList = new ims.RefMan.vo.OnwardReferralVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.OnwardReferral domainObject = (ims.RefMan.domain.objects.OnwardReferral) domainObjectList.get(i);
			ims.RefMan.vo.OnwardReferralVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.OnwardReferral set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractOnwardReferralSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.OnwardReferralVoCollection voCollection) 
	 {
	 	return extractOnwardReferralSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOnwardReferralSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.OnwardReferralVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.OnwardReferralVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.OnwardReferral domainObject = OnwardReferralVoAssembler.extractOnwardReferral(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.OnwardReferral list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractOnwardReferralList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.OnwardReferralVoCollection voCollection) 
	 {
	 	return extractOnwardReferralList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOnwardReferralList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.OnwardReferralVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.OnwardReferralVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.OnwardReferral domainObject = OnwardReferralVoAssembler.extractOnwardReferral(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.OnwardReferral object.
	 * @param domainObject ims.RefMan.domain.objects.OnwardReferral
	 */
	 public static ims.RefMan.vo.OnwardReferralVo create(ims.RefMan.domain.objects.OnwardReferral domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.OnwardReferral object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.OnwardReferralVo create(DomainObjectMap map, ims.RefMan.domain.objects.OnwardReferral domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.OnwardReferralVo valueObject = (ims.RefMan.vo.OnwardReferralVo) map.getValueObject(domainObject, ims.RefMan.vo.OnwardReferralVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.OnwardReferralVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.OnwardReferral
	 */
	 public static ims.RefMan.vo.OnwardReferralVo insert(ims.RefMan.vo.OnwardReferralVo valueObject, ims.RefMan.domain.objects.OnwardReferral domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.OnwardReferral
	 */
	 public static ims.RefMan.vo.OnwardReferralVo insert(DomainObjectMap map, ims.RefMan.vo.OnwardReferralVo valueObject, ims.RefMan.domain.objects.OnwardReferral domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_OnwardReferral(domainObject.getId());
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
			
		// DischargeDate
		java.util.Date DischargeDate = domainObject.getDischargeDate();
		if ( null != DischargeDate ) 
		{
			valueObject.setDischargeDate(new ims.framework.utils.Date(DischargeDate) );
		}
		// OnwardReferralOrg
		valueObject.setOnwardReferralOrg(ims.core.vo.domain.OrgLiteVoAssembler.create(map, domainObject.getOnwardReferralOrg()) );
		// OnwardReferral
		valueObject.setOnwardReferral(domainObject.getOnwardReferral());
		// RejectedDate
		java.util.Date RejectedDate = domainObject.getRejectedDate();
		if ( null != RejectedDate ) 
		{
			valueObject.setRejectedDate(new ims.framework.utils.Date(RejectedDate) );
		}
		// RejectionReason
		valueObject.setRejectionReason(domainObject.getRejectionReason());
		// RejectedBy
		ims.domain.lookups.LookupInstance instance6 = domainObject.getRejectedBy();
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

			ims.RefMan.vo.lookups.OnwardReferralRejectedBy voLookup6 = new ims.RefMan.vo.lookups.OnwardReferralRejectedBy(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.RefMan.vo.lookups.OnwardReferralRejectedBy parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.RefMan.vo.lookups.OnwardReferralRejectedBy(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setRejectedBy(voLookup6);
		}
				// OnwardReferralReason
		ims.domain.lookups.LookupInstance instance7 = domainObject.getOnwardReferralReason();
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

			ims.RefMan.vo.lookups.OnwardReferralReason voLookup7 = new ims.RefMan.vo.lookups.OnwardReferralReason(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.RefMan.vo.lookups.OnwardReferralReason parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.RefMan.vo.lookups.OnwardReferralReason(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setOnwardReferralReason(voLookup7);
		}
				// CopyToGP
		valueObject.setCopyToGP( domainObject.isCopyToGP() );
		// CopyToPatient
		valueObject.setCopyToPatient( domainObject.isCopyToPatient() );
		// CopyToSecondaryCare
		valueObject.setCopyToSecondaryCare( domainObject.isCopyToSecondaryCare() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.OnwardReferral extractOnwardReferral(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.OnwardReferralVo valueObject) 
	{
		return 	extractOnwardReferral(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.OnwardReferral extractOnwardReferral(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.OnwardReferralVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_OnwardReferral();
		ims.RefMan.domain.objects.OnwardReferral domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.OnwardReferral)domMap.get(valueObject);
			}
			// ims.RefMan.vo.OnwardReferralVo ID_OnwardReferral field is unknown
			domainObject = new ims.RefMan.domain.objects.OnwardReferral();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_OnwardReferral());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.OnwardReferral)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.OnwardReferral) domainFactory.getDomainObject(ims.RefMan.domain.objects.OnwardReferral.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_OnwardReferral());

		java.util.Date value1 = null;
		ims.framework.utils.Date date1 = valueObject.getDischargeDate();		
		if ( date1 != null ) 
		{
			value1 = date1.getDate();
		}
		domainObject.setDischargeDate(value1);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Organisation value2 = null;
		if ( null != valueObject.getOnwardReferralOrg() ) 
		{
			if (valueObject.getOnwardReferralOrg().getBoId() == null)
			{
				if (domMap.get(valueObject.getOnwardReferralOrg()) != null)
				{
					value2 = (ims.core.resource.place.domain.objects.Organisation)domMap.get(valueObject.getOnwardReferralOrg());
				}
			}
			else
			{
				value2 = (ims.core.resource.place.domain.objects.Organisation)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Organisation.class, valueObject.getOnwardReferralOrg().getBoId());
			}
		}
		domainObject.setOnwardReferralOrg(value2);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOnwardReferral() != null && valueObject.getOnwardReferral().equals(""))
		{
			valueObject.setOnwardReferral(null);
		}
		domainObject.setOnwardReferral(valueObject.getOnwardReferral());
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getRejectedDate();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setRejectedDate(value4);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getRejectionReason() != null && valueObject.getRejectionReason().equals(""))
		{
			valueObject.setRejectionReason(null);
		}
		domainObject.setRejectionReason(valueObject.getRejectionReason());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getRejectedBy() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getRejectedBy().getID());
		}
		domainObject.setRejectedBy(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getOnwardReferralReason() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getOnwardReferralReason().getID());
		}
		domainObject.setOnwardReferralReason(value7);
		domainObject.setCopyToGP(valueObject.getCopyToGP());
		domainObject.setCopyToPatient(valueObject.getCopyToPatient());
		domainObject.setCopyToSecondaryCare(valueObject.getCopyToSecondaryCare());

		return domainObject;
	}

}
