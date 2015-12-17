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
package ims.therapies.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Sean Nesbitt
 */
public class AdaptationsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.therapies.vo.AdaptationsVo copy(ims.therapies.vo.AdaptationsVo valueObjectDest, ims.therapies.vo.AdaptationsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Adaptations(valueObjectSrc.getID_Adaptations());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ItemCategory
		valueObjectDest.setItemCategory(valueObjectSrc.getItemCategory());
		// ItemType
		valueObjectDest.setItemType(valueObjectSrc.getItemType());
		// Supplier
		valueObjectDest.setSupplier(valueObjectSrc.getSupplier());
		// DateRequired
		valueObjectDest.setDateRequired(valueObjectSrc.getDateRequired());
		// DateSupplied
		valueObjectDest.setDateSupplied(valueObjectSrc.getDateSupplied());
		// SuppliedFor
		valueObjectDest.setSuppliedFor(valueObjectSrc.getSuppliedFor());
		// Loan
		valueObjectDest.setLoan(valueObjectSrc.getLoan());
		// FundedBy
		valueObjectDest.setFundedBy(valueObjectSrc.getFundedBy());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createAdaptationsVoCollectionFromAdaptations(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.therapies.domain.objects.Adaptations objects.
	 */
	public static ims.therapies.vo.AdaptationsVoCollection createAdaptationsVoCollectionFromAdaptations(java.util.Set domainObjectSet)	
	{
		return createAdaptationsVoCollectionFromAdaptations(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.therapies.domain.objects.Adaptations objects.
	 */
	public static ims.therapies.vo.AdaptationsVoCollection createAdaptationsVoCollectionFromAdaptations(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.therapies.vo.AdaptationsVoCollection voList = new ims.therapies.vo.AdaptationsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.therapies.domain.objects.Adaptations domainObject = (ims.therapies.domain.objects.Adaptations) iterator.next();
			ims.therapies.vo.AdaptationsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.therapies.domain.objects.Adaptations objects.
	 */
	public static ims.therapies.vo.AdaptationsVoCollection createAdaptationsVoCollectionFromAdaptations(java.util.List domainObjectList) 
	{
		return createAdaptationsVoCollectionFromAdaptations(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.therapies.domain.objects.Adaptations objects.
	 */
	public static ims.therapies.vo.AdaptationsVoCollection createAdaptationsVoCollectionFromAdaptations(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.therapies.vo.AdaptationsVoCollection voList = new ims.therapies.vo.AdaptationsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.therapies.domain.objects.Adaptations domainObject = (ims.therapies.domain.objects.Adaptations) domainObjectList.get(i);
			ims.therapies.vo.AdaptationsVo vo = create(map, domainObject);

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
	 * Create the ims.therapies.domain.objects.Adaptations set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractAdaptationsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.AdaptationsVoCollection voCollection) 
	 {
	 	return extractAdaptationsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractAdaptationsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.AdaptationsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.AdaptationsVo vo = voCollection.get(i);
			ims.therapies.domain.objects.Adaptations domainObject = AdaptationsVoAssembler.extractAdaptations(domainFactory, vo, domMap);

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
	 * Create the ims.therapies.domain.objects.Adaptations list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractAdaptationsList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.AdaptationsVoCollection voCollection) 
	 {
	 	return extractAdaptationsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractAdaptationsList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.AdaptationsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.AdaptationsVo vo = voCollection.get(i);
			ims.therapies.domain.objects.Adaptations domainObject = AdaptationsVoAssembler.extractAdaptations(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.therapies.domain.objects.Adaptations object.
	 * @param domainObject ims.therapies.domain.objects.Adaptations
	 */
	 public static ims.therapies.vo.AdaptationsVo create(ims.therapies.domain.objects.Adaptations domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.therapies.domain.objects.Adaptations object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.therapies.vo.AdaptationsVo create(DomainObjectMap map, ims.therapies.domain.objects.Adaptations domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.therapies.vo.AdaptationsVo valueObject = (ims.therapies.vo.AdaptationsVo) map.getValueObject(domainObject, ims.therapies.vo.AdaptationsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.therapies.vo.AdaptationsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.therapies.domain.objects.Adaptations
	 */
	 public static ims.therapies.vo.AdaptationsVo insert(ims.therapies.vo.AdaptationsVo valueObject, ims.therapies.domain.objects.Adaptations domainObject) 
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
	 * @param domainObject ims.therapies.domain.objects.Adaptations
	 */
	 public static ims.therapies.vo.AdaptationsVo insert(DomainObjectMap map, ims.therapies.vo.AdaptationsVo valueObject, ims.therapies.domain.objects.Adaptations domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Adaptations(domainObject.getId());
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
			
		// ItemCategory
		ims.domain.lookups.LookupInstance instance1 = domainObject.getItemCategory();
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

			ims.spinalinjuries.vo.lookups.Adaptation voLookup1 = new ims.spinalinjuries.vo.lookups.Adaptation(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.Adaptation parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.spinalinjuries.vo.lookups.Adaptation(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setItemCategory(voLookup1);
		}
				// ItemType
		ims.domain.lookups.LookupInstance instance2 = domainObject.getItemType();
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

			ims.spinalinjuries.vo.lookups.Adaptation voLookup2 = new ims.spinalinjuries.vo.lookups.Adaptation(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.Adaptation parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.spinalinjuries.vo.lookups.Adaptation(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setItemType(voLookup2);
		}
				// Supplier
		ims.domain.lookups.LookupInstance instance3 = domainObject.getSupplier();
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

			ims.core.vo.lookups.EquipmentAdaptationSupplier voLookup3 = new ims.core.vo.lookups.EquipmentAdaptationSupplier(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.EquipmentAdaptationSupplier parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.EquipmentAdaptationSupplier(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setSupplier(voLookup3);
		}
				// DateRequired
		java.util.Date DateRequired = domainObject.getDateRequired();
		if ( null != DateRequired ) 
		{
			valueObject.setDateRequired(new ims.framework.utils.Date(DateRequired) );
		}
		// DateSupplied
		java.util.Date DateSupplied = domainObject.getDateSupplied();
		if ( null != DateSupplied ) 
		{
			valueObject.setDateSupplied(new ims.framework.utils.Date(DateSupplied) );
		}
		// SuppliedFor
		ims.domain.lookups.LookupInstance instance6 = domainObject.getSuppliedFor();
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

			ims.core.vo.lookups.EquipmentAdaptationSuppliedFor voLookup6 = new ims.core.vo.lookups.EquipmentAdaptationSuppliedFor(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.EquipmentAdaptationSuppliedFor parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.EquipmentAdaptationSuppliedFor(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setSuppliedFor(voLookup6);
		}
				// Loan
		ims.domain.lookups.LookupInstance instance7 = domainObject.getLoan();
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

			ims.core.vo.lookups.EquipmentAdaptationLoan voLookup7 = new ims.core.vo.lookups.EquipmentAdaptationLoan(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.EquipmentAdaptationLoan parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.core.vo.lookups.EquipmentAdaptationLoan(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setLoan(voLookup7);
		}
				// FundedBy
		ims.domain.lookups.LookupInstance instance8 = domainObject.getFundedBy();
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

			ims.core.vo.lookups.EquipmentAdaptationsFundedBy voLookup8 = new ims.core.vo.lookups.EquipmentAdaptationsFundedBy(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.EquipmentAdaptationsFundedBy parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.EquipmentAdaptationsFundedBy(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setFundedBy(voLookup8);
		}
				// CareContext
		if (domainObject.getCareContext() != null)
		{
			if(domainObject.getCareContext() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCareContext();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(id, -1));				
			}
			else
			{
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(domainObject.getCareContext().getId(), domainObject.getCareContext().getVersion()));
			}
		}
		// ClinicalContact
		if (domainObject.getClinicalContact() != null)
		{
			if(domainObject.getClinicalContact() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getClinicalContact();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(id, -1));				
			}
			else
			{
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(domainObject.getClinicalContact().getId(), domainObject.getClinicalContact().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.therapies.domain.objects.Adaptations extractAdaptations(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.AdaptationsVo valueObject) 
	{
		return 	extractAdaptations(domainFactory, valueObject, new HashMap());
	}

	public static ims.therapies.domain.objects.Adaptations extractAdaptations(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.AdaptationsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Adaptations();
		ims.therapies.domain.objects.Adaptations domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.therapies.domain.objects.Adaptations)domMap.get(valueObject);
			}
			// ims.therapies.vo.AdaptationsVo ID_Adaptations field is unknown
			domainObject = new ims.therapies.domain.objects.Adaptations();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Adaptations());
			if (domMap.get(key) != null)
			{
				return (ims.therapies.domain.objects.Adaptations)domMap.get(key);
			}
			domainObject = (ims.therapies.domain.objects.Adaptations) domainFactory.getDomainObject(ims.therapies.domain.objects.Adaptations.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Adaptations());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getItemCategory() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getItemCategory().getID());
		}
		domainObject.setItemCategory(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getItemType() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getItemType().getID());
		}
		domainObject.setItemType(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getSupplier() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getSupplier().getID());
		}
		domainObject.setSupplier(value3);
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getDateRequired();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setDateRequired(value4);
		java.util.Date value5 = null;
		ims.framework.utils.Date date5 = valueObject.getDateSupplied();		
		if ( date5 != null ) 
		{
			value5 = date5.getDate();
		}
		domainObject.setDateSupplied(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getSuppliedFor() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getSuppliedFor().getID());
		}
		domainObject.setSuppliedFor(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getLoan() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getLoan().getID());
		}
		domainObject.setLoan(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getFundedBy() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getFundedBy().getID());
		}
		domainObject.setFundedBy(value8);
		ims.core.admin.domain.objects.CareContext value9 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value9 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value9 = domainObject.getCareContext();	
			}
			else
			{
				value9 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value9);
		ims.core.admin.domain.objects.ClinicalContact value10 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value10 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value10 = domainObject.getClinicalContact();	
			}
			else
			{
				value10 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value10);

		return domainObject;
	}

}
