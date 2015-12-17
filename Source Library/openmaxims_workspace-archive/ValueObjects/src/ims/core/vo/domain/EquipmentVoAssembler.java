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
 * @author Sinead McDermott
 */
public class EquipmentVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.EquipmentVo copy(ims.core.vo.EquipmentVo valueObjectDest, ims.core.vo.EquipmentVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Equipment(valueObjectSrc.getID_Equipment());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Type
		valueObjectDest.setType(valueObjectSrc.getType());
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
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// Inactive
		valueObjectDest.setInactive(valueObjectSrc.getInactive());
		// InactivationReason
		valueObjectDest.setInactivationReason(valueObjectSrc.getInactivationReason());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createEquipmentVoCollectionFromEquipment(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.resource.equipment.domain.objects.Equipment objects.
	 */
	public static ims.core.vo.EquipmentVoCollection createEquipmentVoCollectionFromEquipment(java.util.Set domainObjectSet)	
	{
		return createEquipmentVoCollectionFromEquipment(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.resource.equipment.domain.objects.Equipment objects.
	 */
	public static ims.core.vo.EquipmentVoCollection createEquipmentVoCollectionFromEquipment(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.EquipmentVoCollection voList = new ims.core.vo.EquipmentVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.resource.equipment.domain.objects.Equipment domainObject = (ims.core.resource.equipment.domain.objects.Equipment) iterator.next();
			ims.core.vo.EquipmentVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.resource.equipment.domain.objects.Equipment objects.
	 */
	public static ims.core.vo.EquipmentVoCollection createEquipmentVoCollectionFromEquipment(java.util.List domainObjectList) 
	{
		return createEquipmentVoCollectionFromEquipment(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.resource.equipment.domain.objects.Equipment objects.
	 */
	public static ims.core.vo.EquipmentVoCollection createEquipmentVoCollectionFromEquipment(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.EquipmentVoCollection voList = new ims.core.vo.EquipmentVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.resource.equipment.domain.objects.Equipment domainObject = (ims.core.resource.equipment.domain.objects.Equipment) domainObjectList.get(i);
			ims.core.vo.EquipmentVo vo = create(map, domainObject);

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
	 * Create the ims.core.resource.equipment.domain.objects.Equipment set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractEquipmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.EquipmentVoCollection voCollection) 
	 {
	 	return extractEquipmentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractEquipmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.EquipmentVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.EquipmentVo vo = voCollection.get(i);
			ims.core.resource.equipment.domain.objects.Equipment domainObject = EquipmentVoAssembler.extractEquipment(domainFactory, vo, domMap);

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
	 * Create the ims.core.resource.equipment.domain.objects.Equipment list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractEquipmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.EquipmentVoCollection voCollection) 
	 {
	 	return extractEquipmentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractEquipmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.EquipmentVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.EquipmentVo vo = voCollection.get(i);
			ims.core.resource.equipment.domain.objects.Equipment domainObject = EquipmentVoAssembler.extractEquipment(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.resource.equipment.domain.objects.Equipment object.
	 * @param domainObject ims.core.resource.equipment.domain.objects.Equipment
	 */
	 public static ims.core.vo.EquipmentVo create(ims.core.resource.equipment.domain.objects.Equipment domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.resource.equipment.domain.objects.Equipment object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.EquipmentVo create(DomainObjectMap map, ims.core.resource.equipment.domain.objects.Equipment domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.EquipmentVo valueObject = (ims.core.vo.EquipmentVo) map.getValueObject(domainObject, ims.core.vo.EquipmentVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.EquipmentVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.resource.equipment.domain.objects.Equipment
	 */
	 public static ims.core.vo.EquipmentVo insert(ims.core.vo.EquipmentVo valueObject, ims.core.resource.equipment.domain.objects.Equipment domainObject) 
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
	 * @param domainObject ims.core.resource.equipment.domain.objects.Equipment
	 */
	 public static ims.core.vo.EquipmentVo insert(DomainObjectMap map, ims.core.vo.EquipmentVo valueObject, ims.core.resource.equipment.domain.objects.Equipment domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Equipment(domainObject.getId());
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
			
		// Type
		ims.domain.lookups.LookupInstance instance1 = domainObject.getType();
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

			ims.core.vo.lookups.EquipmentType voLookup1 = new ims.core.vo.lookups.EquipmentType(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.EquipmentType parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.core.vo.lookups.EquipmentType(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setType(voLookup1);
		}
				// Supplier
		ims.domain.lookups.LookupInstance instance2 = domainObject.getSupplier();
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

			ims.core.vo.lookups.EquipmentAdaptationSupplier voLookup2 = new ims.core.vo.lookups.EquipmentAdaptationSupplier(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.EquipmentAdaptationSupplier parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.EquipmentAdaptationSupplier(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setSupplier(voLookup2);
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
		ims.domain.lookups.LookupInstance instance5 = domainObject.getSuppliedFor();
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

			ims.core.vo.lookups.EquipmentAdaptationSuppliedFor voLookup5 = new ims.core.vo.lookups.EquipmentAdaptationSuppliedFor(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.EquipmentAdaptationSuppliedFor parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.EquipmentAdaptationSuppliedFor(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setSuppliedFor(voLookup5);
		}
				// Loan
		ims.domain.lookups.LookupInstance instance6 = domainObject.getLoan();
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

			ims.core.vo.lookups.EquipmentAdaptationLoan voLookup6 = new ims.core.vo.lookups.EquipmentAdaptationLoan(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.EquipmentAdaptationLoan parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.EquipmentAdaptationLoan(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setLoan(voLookup6);
		}
				// FundedBy
		ims.domain.lookups.LookupInstance instance7 = domainObject.getFundedBy();
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

			ims.core.vo.lookups.EquipmentAdaptationsFundedBy voLookup7 = new ims.core.vo.lookups.EquipmentAdaptationsFundedBy(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.EquipmentAdaptationsFundedBy parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.core.vo.lookups.EquipmentAdaptationsFundedBy(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setFundedBy(voLookup7);
		}
				// ClinicalContact
		valueObject.setClinicalContact(ims.core.vo.domain.ClinicalContactShortVoAssembler.create(map, domainObject.getClinicalContact()) );
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
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// Inactive
		valueObject.setInactive( domainObject.isInactive() );
		// InactivationReason
		valueObject.setInactivationReason(domainObject.getInactivationReason());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.resource.equipment.domain.objects.Equipment extractEquipment(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.EquipmentVo valueObject) 
	{
		return 	extractEquipment(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.resource.equipment.domain.objects.Equipment extractEquipment(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.EquipmentVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Equipment();
		ims.core.resource.equipment.domain.objects.Equipment domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.resource.equipment.domain.objects.Equipment)domMap.get(valueObject);
			}
			// ims.core.vo.EquipmentVo ID_Equipment field is unknown
			domainObject = new ims.core.resource.equipment.domain.objects.Equipment();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Equipment());
			if (domMap.get(key) != null)
			{
				return (ims.core.resource.equipment.domain.objects.Equipment)domMap.get(key);
			}
			domainObject = (ims.core.resource.equipment.domain.objects.Equipment) domainFactory.getDomainObject(ims.core.resource.equipment.domain.objects.Equipment.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Equipment());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getType() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getType().getID());
		}
		domainObject.setType(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getSupplier() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getSupplier().getID());
		}
		domainObject.setSupplier(value2);
		java.util.Date value3 = null;
		ims.framework.utils.Date date3 = valueObject.getDateRequired();		
		if ( date3 != null ) 
		{
			value3 = date3.getDate();
		}
		domainObject.setDateRequired(value3);
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getDateSupplied();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setDateSupplied(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getSuppliedFor() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getSuppliedFor().getID());
		}
		domainObject.setSuppliedFor(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getLoan() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getLoan().getID());
		}
		domainObject.setLoan(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getFundedBy() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getFundedBy().getID());
		}
		domainObject.setFundedBy(value7);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.ClinicalContact value8 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value8 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else
			{
				value8 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value8);
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
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		domainObject.setInactive(valueObject.getInactive());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getInactivationReason() != null && valueObject.getInactivationReason().equals(""))
		{
			valueObject.setInactivationReason(null);
		}
		domainObject.setInactivationReason(valueObject.getInactivationReason());

		return domainObject;
	}

}
