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
 * @author Daniel Laffan
 */
public class OnwardReferralFromTriageVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.OnwardReferralFromTriageVo copy(ims.RefMan.vo.OnwardReferralFromTriageVo valueObjectDest, ims.RefMan.vo.OnwardReferralFromTriageVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_OnwardReferralFromTriage(valueObjectSrc.getID_OnwardReferralFromTriage());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CatsReferral
		valueObjectDest.setCatsReferral(valueObjectSrc.getCatsReferral());
		// ReferredDate
		valueObjectDest.setReferredDate(valueObjectSrc.getReferredDate());
		// SecondaryCareProvider
		valueObjectDest.setSecondaryCareProvider(valueObjectSrc.getSecondaryCareProvider());
		// RequestedByGP
		valueObjectDest.setRequestedByGP(valueObjectSrc.getRequestedByGP());
		// AgreeWithDecision
		valueObjectDest.setAgreeWithDecision(valueObjectSrc.getAgreeWithDecision());
		// Notes
		valueObjectDest.setNotes(valueObjectSrc.getNotes());
		// ServiceReferredInto
		valueObjectDest.setServiceReferredInto(valueObjectSrc.getServiceReferredInto());
		// ReferralComplete
		valueObjectDest.setReferralComplete(valueObjectSrc.getReferralComplete());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createOnwardReferralFromTriageVoCollectionFromOnwardReferralFromTriage(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.OnwardReferralFromTriage objects.
	 */
	public static ims.RefMan.vo.OnwardReferralFromTriageVoCollection createOnwardReferralFromTriageVoCollectionFromOnwardReferralFromTriage(java.util.Set domainObjectSet)	
	{
		return createOnwardReferralFromTriageVoCollectionFromOnwardReferralFromTriage(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.OnwardReferralFromTriage objects.
	 */
	public static ims.RefMan.vo.OnwardReferralFromTriageVoCollection createOnwardReferralFromTriageVoCollectionFromOnwardReferralFromTriage(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.OnwardReferralFromTriageVoCollection voList = new ims.RefMan.vo.OnwardReferralFromTriageVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.OnwardReferralFromTriage domainObject = (ims.RefMan.domain.objects.OnwardReferralFromTriage) iterator.next();
			ims.RefMan.vo.OnwardReferralFromTriageVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.OnwardReferralFromTriage objects.
	 */
	public static ims.RefMan.vo.OnwardReferralFromTriageVoCollection createOnwardReferralFromTriageVoCollectionFromOnwardReferralFromTriage(java.util.List domainObjectList) 
	{
		return createOnwardReferralFromTriageVoCollectionFromOnwardReferralFromTriage(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.OnwardReferralFromTriage objects.
	 */
	public static ims.RefMan.vo.OnwardReferralFromTriageVoCollection createOnwardReferralFromTriageVoCollectionFromOnwardReferralFromTriage(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.OnwardReferralFromTriageVoCollection voList = new ims.RefMan.vo.OnwardReferralFromTriageVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.OnwardReferralFromTriage domainObject = (ims.RefMan.domain.objects.OnwardReferralFromTriage) domainObjectList.get(i);
			ims.RefMan.vo.OnwardReferralFromTriageVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.OnwardReferralFromTriage set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractOnwardReferralFromTriageSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.OnwardReferralFromTriageVoCollection voCollection) 
	 {
	 	return extractOnwardReferralFromTriageSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOnwardReferralFromTriageSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.OnwardReferralFromTriageVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.OnwardReferralFromTriageVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.OnwardReferralFromTriage domainObject = OnwardReferralFromTriageVoAssembler.extractOnwardReferralFromTriage(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.OnwardReferralFromTriage list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractOnwardReferralFromTriageList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.OnwardReferralFromTriageVoCollection voCollection) 
	 {
	 	return extractOnwardReferralFromTriageList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOnwardReferralFromTriageList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.OnwardReferralFromTriageVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.OnwardReferralFromTriageVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.OnwardReferralFromTriage domainObject = OnwardReferralFromTriageVoAssembler.extractOnwardReferralFromTriage(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.OnwardReferralFromTriage object.
	 * @param domainObject ims.RefMan.domain.objects.OnwardReferralFromTriage
	 */
	 public static ims.RefMan.vo.OnwardReferralFromTriageVo create(ims.RefMan.domain.objects.OnwardReferralFromTriage domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.OnwardReferralFromTriage object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.OnwardReferralFromTriageVo create(DomainObjectMap map, ims.RefMan.domain.objects.OnwardReferralFromTriage domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.OnwardReferralFromTriageVo valueObject = (ims.RefMan.vo.OnwardReferralFromTriageVo) map.getValueObject(domainObject, ims.RefMan.vo.OnwardReferralFromTriageVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.OnwardReferralFromTriageVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.OnwardReferralFromTriage
	 */
	 public static ims.RefMan.vo.OnwardReferralFromTriageVo insert(ims.RefMan.vo.OnwardReferralFromTriageVo valueObject, ims.RefMan.domain.objects.OnwardReferralFromTriage domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.OnwardReferralFromTriage
	 */
	 public static ims.RefMan.vo.OnwardReferralFromTriageVo insert(DomainObjectMap map, ims.RefMan.vo.OnwardReferralFromTriageVo valueObject, ims.RefMan.domain.objects.OnwardReferralFromTriage domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_OnwardReferralFromTriage(domainObject.getId());
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
			
		// CatsReferral
		if (domainObject.getCatsReferral() != null)
		{
			if(domainObject.getCatsReferral() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCatsReferral();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCatsReferral(new ims.RefMan.vo.CatsReferralRefVo(id, -1));				
			}
			else
			{
				valueObject.setCatsReferral(new ims.RefMan.vo.CatsReferralRefVo(domainObject.getCatsReferral().getId(), domainObject.getCatsReferral().getVersion()));
			}
		}
		// ReferredDate
		java.util.Date ReferredDate = domainObject.getReferredDate();
		if ( null != ReferredDate ) 
		{
			valueObject.setReferredDate(new ims.framework.utils.DateTime(ReferredDate) );
		}
		// SecondaryCareProvider
		valueObject.setSecondaryCareProvider(ims.core.vo.domain.OrgLiteVoAssembler.create(map, domainObject.getSecondaryCareProvider()) );
		// RequestedByGP
		ims.domain.lookups.LookupInstance instance4 = domainObject.getRequestedByGP();
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

			ims.core.vo.lookups.YesNo voLookup4 = new ims.core.vo.lookups.YesNo(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.YesNo(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setRequestedByGP(voLookup4);
		}
				// AgreeWithDecision
		ims.domain.lookups.LookupInstance instance5 = domainObject.getAgreeWithDecision();
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

			ims.core.vo.lookups.YesNo voLookup5 = new ims.core.vo.lookups.YesNo(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.YesNo(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setAgreeWithDecision(voLookup5);
		}
				// Notes
		valueObject.setNotes(domainObject.getNotes());
		// ServiceReferredInto
		ims.domain.lookups.LookupInstance instance7 = domainObject.getServiceReferredInto();
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

			ims.RefMan.vo.lookups.ServiceReferredInto voLookup7 = new ims.RefMan.vo.lookups.ServiceReferredInto(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ServiceReferredInto parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.RefMan.vo.lookups.ServiceReferredInto(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setServiceReferredInto(voLookup7);
		}
				// ReferralComplete
		ims.domain.lookups.LookupInstance instance8 = domainObject.getReferralComplete();
		if ( null != instance8 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance8.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance8.getImage().getImageId(), instance8.getImage().getImagePath());
			}
			color = instance8.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup8 = new ims.core.vo.lookups.YesNo(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup8 = voLookup8;
			ims.domain.lookups.LookupInstance parent8 = instance8.getParent();
			while (parent8 != null)
			{
				if (parent8.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent8.getImage().getImageId(), parent8.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent8.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup8.setParent(new ims.core.vo.lookups.YesNo(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setReferralComplete(voLookup8);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.OnwardReferralFromTriage extractOnwardReferralFromTriage(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.OnwardReferralFromTriageVo valueObject) 
	{
		return 	extractOnwardReferralFromTriage(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.OnwardReferralFromTriage extractOnwardReferralFromTriage(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.OnwardReferralFromTriageVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_OnwardReferralFromTriage();
		ims.RefMan.domain.objects.OnwardReferralFromTriage domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.OnwardReferralFromTriage)domMap.get(valueObject);
			}
			// ims.RefMan.vo.OnwardReferralFromTriageVo ID_OnwardReferralFromTriage field is unknown
			domainObject = new ims.RefMan.domain.objects.OnwardReferralFromTriage();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_OnwardReferralFromTriage());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.OnwardReferralFromTriage)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.OnwardReferralFromTriage) domainFactory.getDomainObject(ims.RefMan.domain.objects.OnwardReferralFromTriage.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_OnwardReferralFromTriage());

		ims.RefMan.domain.objects.CatsReferral value1 = null;
		if ( null != valueObject.getCatsReferral() ) 
		{
			if (valueObject.getCatsReferral().getBoId() == null)
			{
				if (domMap.get(valueObject.getCatsReferral()) != null)
				{
					value1 = (ims.RefMan.domain.objects.CatsReferral)domMap.get(valueObject.getCatsReferral());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getCatsReferral();	
			}
			else
			{
				value1 = (ims.RefMan.domain.objects.CatsReferral)domainFactory.getDomainObject(ims.RefMan.domain.objects.CatsReferral.class, valueObject.getCatsReferral().getBoId());
			}
		}
		domainObject.setCatsReferral(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getReferredDate();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setReferredDate(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Organisation value3 = null;
		if ( null != valueObject.getSecondaryCareProvider() ) 
		{
			if (valueObject.getSecondaryCareProvider().getBoId() == null)
			{
				if (domMap.get(valueObject.getSecondaryCareProvider()) != null)
				{
					value3 = (ims.core.resource.place.domain.objects.Organisation)domMap.get(valueObject.getSecondaryCareProvider());
				}
			}
			else
			{
				value3 = (ims.core.resource.place.domain.objects.Organisation)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Organisation.class, valueObject.getSecondaryCareProvider().getBoId());
			}
		}
		domainObject.setSecondaryCareProvider(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getRequestedByGP() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getRequestedByGP().getID());
		}
		domainObject.setRequestedByGP(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getAgreeWithDecision() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getAgreeWithDecision().getID());
		}
		domainObject.setAgreeWithDecision(value5);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNotes() != null && valueObject.getNotes().equals(""))
		{
			valueObject.setNotes(null);
		}
		domainObject.setNotes(valueObject.getNotes());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getServiceReferredInto() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getServiceReferredInto().getID());
		}
		domainObject.setServiceReferredInto(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getReferralComplete() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getReferralComplete().getID());
		}
		domainObject.setReferralComplete(value8);

		return domainObject;
	}

}
