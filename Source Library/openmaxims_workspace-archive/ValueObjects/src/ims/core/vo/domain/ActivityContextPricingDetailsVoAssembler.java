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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Kevin O'Carroll
 */
public class ActivityContextPricingDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.ActivityContextPricingDetailsVo copy(ims.core.vo.ActivityContextPricingDetailsVo valueObjectDest, ims.core.vo.ActivityContextPricingDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ActivityContextPricingDetails(valueObjectSrc.getID_ActivityContextPricingDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Context
		valueObjectDest.setContext(valueObjectSrc.getContext());
		// Price
		valueObjectDest.setPrice(valueObjectSrc.getPrice());
		// Currency
		valueObjectDest.setCurrency(valueObjectSrc.getCurrency());
		// NormLengthStay
		valueObjectDest.setNormLengthStay(valueObjectSrc.getNormLengthStay());
		// EffectiveFrom
		valueObjectDest.setEffectiveFrom(valueObjectSrc.getEffectiveFrom());
		// EffectiveTo
		valueObjectDest.setEffectiveTo(valueObjectSrc.getEffectiveTo());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// priceCategory
		valueObjectDest.setPriceCategory(valueObjectSrc.getPriceCategory());
		// TaxonomyMap
		valueObjectDest.setTaxonomyMap(valueObjectSrc.getTaxonomyMap());
		// isPreActive
		valueObjectDest.setIsPreActive(valueObjectSrc.getIsPreActive());
		// EffectiveToSet
		valueObjectDest.setEffectiveToSet(valueObjectSrc.getEffectiveToSet());
		// CreatingBatch
		valueObjectDest.setCreatingBatch(valueObjectSrc.getCreatingBatch());
		// EffectiveFromSet
		valueObjectDest.setEffectiveFromSet(valueObjectSrc.getEffectiveFromSet());
		// ActivePricing
		valueObjectDest.setActivePricing(valueObjectSrc.getActivePricing());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createActivityContextPricingDetailsVoCollectionFromActivityContextPricingDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.ActivityContextPricingDetails objects.
	 */
	public static ims.core.vo.ActivityContextPricingDetailsVoCollection createActivityContextPricingDetailsVoCollectionFromActivityContextPricingDetails(java.util.Set domainObjectSet)	
	{
		return createActivityContextPricingDetailsVoCollectionFromActivityContextPricingDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.ActivityContextPricingDetails objects.
	 */
	public static ims.core.vo.ActivityContextPricingDetailsVoCollection createActivityContextPricingDetailsVoCollectionFromActivityContextPricingDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.ActivityContextPricingDetailsVoCollection voList = new ims.core.vo.ActivityContextPricingDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.ActivityContextPricingDetails domainObject = (ims.core.clinical.domain.objects.ActivityContextPricingDetails) iterator.next();
			ims.core.vo.ActivityContextPricingDetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.ActivityContextPricingDetails objects.
	 */
	public static ims.core.vo.ActivityContextPricingDetailsVoCollection createActivityContextPricingDetailsVoCollectionFromActivityContextPricingDetails(java.util.List domainObjectList) 
	{
		return createActivityContextPricingDetailsVoCollectionFromActivityContextPricingDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.ActivityContextPricingDetails objects.
	 */
	public static ims.core.vo.ActivityContextPricingDetailsVoCollection createActivityContextPricingDetailsVoCollectionFromActivityContextPricingDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.ActivityContextPricingDetailsVoCollection voList = new ims.core.vo.ActivityContextPricingDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.ActivityContextPricingDetails domainObject = (ims.core.clinical.domain.objects.ActivityContextPricingDetails) domainObjectList.get(i);
			ims.core.vo.ActivityContextPricingDetailsVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.ActivityContextPricingDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractActivityContextPricingDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ActivityContextPricingDetailsVoCollection voCollection) 
	 {
	 	return extractActivityContextPricingDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractActivityContextPricingDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ActivityContextPricingDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.ActivityContextPricingDetailsVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.ActivityContextPricingDetails domainObject = ActivityContextPricingDetailsVoAssembler.extractActivityContextPricingDetails(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.ActivityContextPricingDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractActivityContextPricingDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ActivityContextPricingDetailsVoCollection voCollection) 
	 {
	 	return extractActivityContextPricingDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractActivityContextPricingDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ActivityContextPricingDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.ActivityContextPricingDetailsVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.ActivityContextPricingDetails domainObject = ActivityContextPricingDetailsVoAssembler.extractActivityContextPricingDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.ActivityContextPricingDetails object.
	 * @param domainObject ims.core.clinical.domain.objects.ActivityContextPricingDetails
	 */
	 public static ims.core.vo.ActivityContextPricingDetailsVo create(ims.core.clinical.domain.objects.ActivityContextPricingDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.ActivityContextPricingDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.ActivityContextPricingDetailsVo create(DomainObjectMap map, ims.core.clinical.domain.objects.ActivityContextPricingDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.ActivityContextPricingDetailsVo valueObject = (ims.core.vo.ActivityContextPricingDetailsVo) map.getValueObject(domainObject, ims.core.vo.ActivityContextPricingDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.ActivityContextPricingDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.ActivityContextPricingDetails
	 */
	 public static ims.core.vo.ActivityContextPricingDetailsVo insert(ims.core.vo.ActivityContextPricingDetailsVo valueObject, ims.core.clinical.domain.objects.ActivityContextPricingDetails domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.ActivityContextPricingDetails
	 */
	 public static ims.core.vo.ActivityContextPricingDetailsVo insert(DomainObjectMap map, ims.core.vo.ActivityContextPricingDetailsVo valueObject, ims.core.clinical.domain.objects.ActivityContextPricingDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ActivityContextPricingDetails(domainObject.getId());
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
			
		// Context
		ims.domain.lookups.LookupInstance instance1 = domainObject.getContext();
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

			ims.core.vo.lookups.ProcedureContext voLookup1 = new ims.core.vo.lookups.ProcedureContext(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.ProcedureContext parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.core.vo.lookups.ProcedureContext(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setContext(voLookup1);
		}
				// Price
		valueObject.setPrice(domainObject.getPrice());
		// Currency
		ims.domain.lookups.LookupInstance instance3 = domainObject.getCurrency();
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

			ims.core.vo.lookups.Currency voLookup3 = new ims.core.vo.lookups.Currency(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.Currency parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.Currency(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setCurrency(voLookup3);
		}
				// NormLengthStay
		valueObject.setNormLengthStay(domainObject.getNormLengthStay());
		// EffectiveFrom
		java.util.Date EffectiveFrom = domainObject.getEffectiveFrom();
		if ( null != EffectiveFrom ) 
		{
			valueObject.setEffectiveFrom(new ims.framework.utils.Date(EffectiveFrom) );
		}
		// EffectiveTo
		java.util.Date EffectiveTo = domainObject.getEffectiveTo();
		if ( null != EffectiveTo ) 
		{
			valueObject.setEffectiveTo(new ims.framework.utils.Date(EffectiveTo) );
		}
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// priceCategory
		ims.domain.lookups.LookupInstance instance8 = domainObject.getPriceCategory();
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

			ims.ntpf.vo.lookups.PatientType voLookup8 = new ims.ntpf.vo.lookups.PatientType(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.ntpf.vo.lookups.PatientType parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.ntpf.vo.lookups.PatientType(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setPriceCategory(voLookup8);
		}
				// TaxonomyMap
		valueObject.setTaxonomyMap(ims.core.vo.domain.TaxonomyMapAssembler.createTaxonomyMapCollectionFromTaxonomyMap(map, domainObject.getTaxonomyMap()) );
		// isPreActive
		valueObject.setIsPreActive( domainObject.isIsPreActive() );
		// EffectiveToSet
		java.util.Date EffectiveToSet = domainObject.getEffectiveToSet();
		if ( null != EffectiveToSet ) 
		{
			valueObject.setEffectiveToSet(new ims.framework.utils.Date(EffectiveToSet) );
		}
		// CreatingBatch
		valueObject.setCreatingBatch(ims.core.vo.domain.BatchPricingShortVoAssembler.create(map, domainObject.getCreatingBatch()) );
		// EffectiveFromSet
		java.util.Date EffectiveFromSet = domainObject.getEffectiveFromSet();
		if ( null != EffectiveFromSet ) 
		{
			valueObject.setEffectiveFromSet(new ims.framework.utils.Date(EffectiveFromSet) );
		}
		// ActivePricing
		if (domainObject.getActivePricing() != null)
		{
			if(domainObject.getActivePricing() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getActivePricing();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setActivePricing(new ims.core.clinical.vo.ActivityContextPricingDetailsRefVo(id, -1));				
			}
			else
			{
				valueObject.setActivePricing(new ims.core.clinical.vo.ActivityContextPricingDetailsRefVo(domainObject.getActivePricing().getId(), domainObject.getActivePricing().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.ActivityContextPricingDetails extractActivityContextPricingDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ActivityContextPricingDetailsVo valueObject) 
	{
		return 	extractActivityContextPricingDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.ActivityContextPricingDetails extractActivityContextPricingDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ActivityContextPricingDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ActivityContextPricingDetails();
		ims.core.clinical.domain.objects.ActivityContextPricingDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.ActivityContextPricingDetails)domMap.get(valueObject);
			}
			// ims.core.vo.ActivityContextPricingDetailsVo ID_ActivityContextPricingDetails field is unknown
			domainObject = new ims.core.clinical.domain.objects.ActivityContextPricingDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ActivityContextPricingDetails());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.ActivityContextPricingDetails)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.ActivityContextPricingDetails) domainFactory.getDomainObject(ims.core.clinical.domain.objects.ActivityContextPricingDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ActivityContextPricingDetails());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getContext() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getContext().getID());
		}
		domainObject.setContext(value1);
		domainObject.setPrice(valueObject.getPrice());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getCurrency() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getCurrency().getID());
		}
		domainObject.setCurrency(value3);
		domainObject.setNormLengthStay(valueObject.getNormLengthStay());
		java.util.Date value5 = null;
		ims.framework.utils.Date date5 = valueObject.getEffectiveFrom();		
		if ( date5 != null ) 
		{
			value5 = date5.getDate();
		}
		domainObject.setEffectiveFrom(value5);
		java.util.Date value6 = null;
		ims.framework.utils.Date date6 = valueObject.getEffectiveTo();		
		if ( date6 != null ) 
		{
			value6 = date6.getDate();
		}
		domainObject.setEffectiveTo(value6);
		domainObject.setIsActive(valueObject.getIsActive());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getPriceCategory() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getPriceCategory().getID());
		}
		domainObject.setPriceCategory(value8);
		domainObject.setTaxonomyMap(ims.core.vo.domain.TaxonomyMapAssembler.extractTaxonomyMapList(domainFactory, valueObject.getTaxonomyMap(), domainObject.getTaxonomyMap(), domMap));		
		domainObject.setIsPreActive(valueObject.getIsPreActive());
		java.util.Date value11 = null;
		ims.framework.utils.Date date11 = valueObject.getEffectiveToSet();		
		if ( date11 != null ) 
		{
			value11 = date11.getDate();
		}
		domainObject.setEffectiveToSet(value11);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.BatchPricing value12 = null;
		if ( null != valueObject.getCreatingBatch() ) 
		{
			if (valueObject.getCreatingBatch().getBoId() == null)
			{
				if (domMap.get(valueObject.getCreatingBatch()) != null)
				{
					value12 = (ims.core.clinical.domain.objects.BatchPricing)domMap.get(valueObject.getCreatingBatch());
				}
			}
			else
			{
				value12 = (ims.core.clinical.domain.objects.BatchPricing)domainFactory.getDomainObject(ims.core.clinical.domain.objects.BatchPricing.class, valueObject.getCreatingBatch().getBoId());
			}
		}
		domainObject.setCreatingBatch(value12);
		java.util.Date value13 = null;
		ims.framework.utils.Date date13 = valueObject.getEffectiveFromSet();		
		if ( date13 != null ) 
		{
			value13 = date13.getDate();
		}
		domainObject.setEffectiveFromSet(value13);
		ims.core.clinical.domain.objects.ActivityContextPricingDetails value14 = null;
		if ( null != valueObject.getActivePricing() ) 
		{
			if (valueObject.getActivePricing().getBoId() == null)
			{
				if (domMap.get(valueObject.getActivePricing()) != null)
				{
					value14 = (ims.core.clinical.domain.objects.ActivityContextPricingDetails)domMap.get(valueObject.getActivePricing());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value14 = domainObject.getActivePricing();	
			}
			else
			{
				value14 = (ims.core.clinical.domain.objects.ActivityContextPricingDetails)domainFactory.getDomainObject(ims.core.clinical.domain.objects.ActivityContextPricingDetails.class, valueObject.getActivePricing().getBoId());
			}
		}
		domainObject.setActivePricing(value14);

		return domainObject;
	}

}
