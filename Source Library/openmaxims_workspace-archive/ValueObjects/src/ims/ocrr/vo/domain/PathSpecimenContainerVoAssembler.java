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
 * Generated on 16/04/2014, 12:32
 *
 */
package ims.ocrr.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Vasile Purdila
 */
public class PathSpecimenContainerVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.PathSpecimenContainerVo copy(ims.ocrr.vo.PathSpecimenContainerVo valueObjectDest, ims.ocrr.vo.PathSpecimenContainerVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PathSpecimenContainer(valueObjectSrc.getID_PathSpecimenContainer());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Colour
		valueObjectDest.setColour(valueObjectSrc.getColour());
		// Manufacturer
		valueObjectDest.setManufacturer(valueObjectSrc.getManufacturer());
		// ManufRefNo
		valueObjectDest.setManufRefNo(valueObjectSrc.getManufRefNo());
		// Size
		valueObjectDest.setSize(valueObjectSrc.getSize());
		// Material
		valueObjectDest.setMaterial(valueObjectSrc.getMaterial());
		// Additive
		valueObjectDest.setAdditive(valueObjectSrc.getAdditive());
		// Notes
		valueObjectDest.setNotes(valueObjectSrc.getNotes());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// VolumeUnits
		valueObjectDest.setVolumeUnits(valueObjectSrc.getVolumeUnits());
		// pathSpecimenOrder
		valueObjectDest.setPathSpecimenOrder(valueObjectSrc.getPathSpecimenOrder());
		// TaxonomyMap
		valueObjectDest.setTaxonomyMap(valueObjectSrc.getTaxonomyMap());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// Volume
		valueObjectDest.setVolume(valueObjectSrc.getVolume());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPathSpecimenContainerVoCollectionFromPathSpecimenContainer(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.configuration.domain.objects.PathSpecimenContainer objects.
	 */
	public static ims.ocrr.vo.PathSpecimenContainerVoCollection createPathSpecimenContainerVoCollectionFromPathSpecimenContainer(java.util.Set domainObjectSet)	
	{
		return createPathSpecimenContainerVoCollectionFromPathSpecimenContainer(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.configuration.domain.objects.PathSpecimenContainer objects.
	 */
	public static ims.ocrr.vo.PathSpecimenContainerVoCollection createPathSpecimenContainerVoCollectionFromPathSpecimenContainer(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.PathSpecimenContainerVoCollection voList = new ims.ocrr.vo.PathSpecimenContainerVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ocrr.configuration.domain.objects.PathSpecimenContainer domainObject = (ims.ocrr.configuration.domain.objects.PathSpecimenContainer) iterator.next();
			ims.ocrr.vo.PathSpecimenContainerVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.ocrr.configuration.domain.objects.PathSpecimenContainer objects.
	 */
	public static ims.ocrr.vo.PathSpecimenContainerVoCollection createPathSpecimenContainerVoCollectionFromPathSpecimenContainer(java.util.List domainObjectList) 
	{
		return createPathSpecimenContainerVoCollectionFromPathSpecimenContainer(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.configuration.domain.objects.PathSpecimenContainer objects.
	 */
	public static ims.ocrr.vo.PathSpecimenContainerVoCollection createPathSpecimenContainerVoCollectionFromPathSpecimenContainer(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.PathSpecimenContainerVoCollection voList = new ims.ocrr.vo.PathSpecimenContainerVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.configuration.domain.objects.PathSpecimenContainer domainObject = (ims.ocrr.configuration.domain.objects.PathSpecimenContainer) domainObjectList.get(i);
			ims.ocrr.vo.PathSpecimenContainerVo vo = create(map, domainObject);

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
	 * Create the ims.ocrr.configuration.domain.objects.PathSpecimenContainer set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPathSpecimenContainerSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.PathSpecimenContainerVoCollection voCollection) 
	 {
	 	return extractPathSpecimenContainerSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPathSpecimenContainerSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.PathSpecimenContainerVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.PathSpecimenContainerVo vo = voCollection.get(i);
			ims.ocrr.configuration.domain.objects.PathSpecimenContainer domainObject = PathSpecimenContainerVoAssembler.extractPathSpecimenContainer(domainFactory, vo, domMap);

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
	 * Create the ims.ocrr.configuration.domain.objects.PathSpecimenContainer list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPathSpecimenContainerList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.PathSpecimenContainerVoCollection voCollection) 
	 {
	 	return extractPathSpecimenContainerList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPathSpecimenContainerList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.PathSpecimenContainerVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.PathSpecimenContainerVo vo = voCollection.get(i);
			ims.ocrr.configuration.domain.objects.PathSpecimenContainer domainObject = PathSpecimenContainerVoAssembler.extractPathSpecimenContainer(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.ocrr.configuration.domain.objects.PathSpecimenContainer object.
	 * @param domainObject ims.ocrr.configuration.domain.objects.PathSpecimenContainer
	 */
	 public static ims.ocrr.vo.PathSpecimenContainerVo create(ims.ocrr.configuration.domain.objects.PathSpecimenContainer domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ocrr.configuration.domain.objects.PathSpecimenContainer object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ocrr.vo.PathSpecimenContainerVo create(DomainObjectMap map, ims.ocrr.configuration.domain.objects.PathSpecimenContainer domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.PathSpecimenContainerVo valueObject = (ims.ocrr.vo.PathSpecimenContainerVo) map.getValueObject(domainObject, ims.ocrr.vo.PathSpecimenContainerVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.PathSpecimenContainerVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ocrr.configuration.domain.objects.PathSpecimenContainer
	 */
	 public static ims.ocrr.vo.PathSpecimenContainerVo insert(ims.ocrr.vo.PathSpecimenContainerVo valueObject, ims.ocrr.configuration.domain.objects.PathSpecimenContainer domainObject) 
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
	 * @param domainObject ims.ocrr.configuration.domain.objects.PathSpecimenContainer
	 */
	 public static ims.ocrr.vo.PathSpecimenContainerVo insert(DomainObjectMap map, ims.ocrr.vo.PathSpecimenContainerVo valueObject, ims.ocrr.configuration.domain.objects.PathSpecimenContainer domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PathSpecimenContainer(domainObject.getId());
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
			
		// Colour
		ims.domain.lookups.LookupInstance instance1 = domainObject.getColour();
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

			ims.ocrr.vo.lookups.SpecimenColour voLookup1 = new ims.ocrr.vo.lookups.SpecimenColour(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.ocrr.vo.lookups.SpecimenColour parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.ocrr.vo.lookups.SpecimenColour(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setColour(voLookup1);
		}
				// Manufacturer
		ims.domain.lookups.LookupInstance instance2 = domainObject.getManufacturer();
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

			ims.ocrr.vo.lookups.SpecimenManufacturer voLookup2 = new ims.ocrr.vo.lookups.SpecimenManufacturer(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.ocrr.vo.lookups.SpecimenManufacturer parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.ocrr.vo.lookups.SpecimenManufacturer(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setManufacturer(voLookup2);
		}
				// ManufRefNo
		valueObject.setManufRefNo(domainObject.getManufRefNo());
		// Size
		ims.domain.lookups.LookupInstance instance4 = domainObject.getSize();
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

			ims.ocrr.vo.lookups.PathContainerSize voLookup4 = new ims.ocrr.vo.lookups.PathContainerSize(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.ocrr.vo.lookups.PathContainerSize parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.ocrr.vo.lookups.PathContainerSize(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setSize(voLookup4);
		}
				// Material
		ims.domain.lookups.LookupInstance instance5 = domainObject.getMaterial();
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

			ims.ocrr.vo.lookups.PathContainerMaterial voLookup5 = new ims.ocrr.vo.lookups.PathContainerMaterial(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.ocrr.vo.lookups.PathContainerMaterial parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.ocrr.vo.lookups.PathContainerMaterial(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setMaterial(voLookup5);
		}
				// Additive
		java.util.List listAdditive = domainObject.getAdditive();
		ims.ocrr.vo.lookups.PathContainerAdditiveCollection Additive = new ims.ocrr.vo.lookups.PathContainerAdditiveCollection();
		for(java.util.Iterator iterator = listAdditive.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.ocrr.vo.lookups.PathContainerAdditive voInstance = new ims.ocrr.vo.lookups.PathContainerAdditive(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.ocrr.vo.lookups.PathContainerAdditive parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.ocrr.vo.lookups.PathContainerAdditive(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			Additive.add(voInstance);
		}
		valueObject.setAdditive( Additive );
		// Notes
		valueObject.setNotes(domainObject.getNotes());
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// VolumeUnits
		ims.domain.lookups.LookupInstance instance9 = domainObject.getVolumeUnits();
		if ( null != instance9 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance9.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance9.getImage().getImageId(), instance9.getImage().getImagePath());
			}
			color = instance9.getColor();
			if (color != null) 
				color.getValue();

			ims.ocrr.vo.lookups.PathVolumeUnits voLookup9 = new ims.ocrr.vo.lookups.PathVolumeUnits(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.ocrr.vo.lookups.PathVolumeUnits parentVoLookup9 = voLookup9;
			ims.domain.lookups.LookupInstance parent9 = instance9.getParent();
			while (parent9 != null)
			{
				if (parent9.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent9.getImage().getImageId(), parent9.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent9.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup9.setParent(new ims.ocrr.vo.lookups.PathVolumeUnits(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setVolumeUnits(voLookup9);
		}
				// pathSpecimenOrder
		valueObject.setPathSpecimenOrder(domainObject.getPathSpecimenOrder());
		// TaxonomyMap
		valueObject.setTaxonomyMap(ims.core.vo.domain.TaxonomyMapAssembler.createTaxonomyMapCollectionFromTaxonomyMap(map, domainObject.getTaxonomyMap()) );
		// Name
		valueObject.setName(domainObject.getName());
		// Volume
		valueObject.setVolume(domainObject.getVolume());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.configuration.domain.objects.PathSpecimenContainer extractPathSpecimenContainer(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.PathSpecimenContainerVo valueObject) 
	{
		return 	extractPathSpecimenContainer(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.configuration.domain.objects.PathSpecimenContainer extractPathSpecimenContainer(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.PathSpecimenContainerVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PathSpecimenContainer();
		ims.ocrr.configuration.domain.objects.PathSpecimenContainer domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ocrr.configuration.domain.objects.PathSpecimenContainer)domMap.get(valueObject);
			}
			// ims.ocrr.vo.PathSpecimenContainerVo ID_PathSpecimenContainer field is unknown
			domainObject = new ims.ocrr.configuration.domain.objects.PathSpecimenContainer();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PathSpecimenContainer());
			if (domMap.get(key) != null)
			{
				return (ims.ocrr.configuration.domain.objects.PathSpecimenContainer)domMap.get(key);
			}
			domainObject = (ims.ocrr.configuration.domain.objects.PathSpecimenContainer) domainFactory.getDomainObject(ims.ocrr.configuration.domain.objects.PathSpecimenContainer.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PathSpecimenContainer());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getColour() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getColour().getID());
		}
		domainObject.setColour(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getManufacturer() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getManufacturer().getID());
		}
		domainObject.setManufacturer(value2);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getManufRefNo() != null && valueObject.getManufRefNo().equals(""))
		{
			valueObject.setManufRefNo(null);
		}
		domainObject.setManufRefNo(valueObject.getManufRefNo());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getSize() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getSize().getID());
		}
		domainObject.setSize(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getMaterial() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getMaterial().getID());
		}
		domainObject.setMaterial(value5);
		ims.ocrr.vo.lookups.PathContainerAdditiveCollection collection6 =
	valueObject.getAdditive();
	    java.util.List domainAdditive = domainObject.getAdditive();;			
	    int collection6Size=0;
		if (collection6 == null)
		{
			domainAdditive = new java.util.ArrayList(0);
		}
		else
		{
			collection6Size = collection6.size();
		}
		
		for(int i=0; i<collection6Size; i++) 
		{
			int instanceId = collection6.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainAdditive.indexOf(dom);
			if (domIdx == -1)
			{
				domainAdditive.add(i, dom);
			}
			else if (i != domIdx && i < domainAdditive.size())
			{
				Object tmp = domainAdditive.get(i);
				domainAdditive.set(i, domainAdditive.get(domIdx));
				domainAdditive.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j6 = domainAdditive.size();
		while (j6 > collection6Size)
		{
			domainAdditive.remove(j6-1);
			j6 = domainAdditive.size();
		}

		domainObject.setAdditive(domainAdditive);		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNotes() != null && valueObject.getNotes().equals(""))
		{
			valueObject.setNotes(null);
		}
		domainObject.setNotes(valueObject.getNotes());
		domainObject.setIsActive(valueObject.getIsActive());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getVolumeUnits() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getVolumeUnits().getID());
		}
		domainObject.setVolumeUnits(value9);
		domainObject.setPathSpecimenOrder(valueObject.getPathSpecimenOrder());
		domainObject.setTaxonomyMap(ims.core.vo.domain.TaxonomyMapAssembler.extractTaxonomyMapList(domainFactory, valueObject.getTaxonomyMap(), domainObject.getTaxonomyMap(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());
		domainObject.setVolume(valueObject.getVolume());

		return domainObject;
	}

}
