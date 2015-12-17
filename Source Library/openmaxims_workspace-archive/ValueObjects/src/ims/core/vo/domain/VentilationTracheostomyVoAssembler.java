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
public class VentilationTracheostomyVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.VentilationTracheostomyVo copy(ims.core.vo.VentilationTracheostomyVo valueObjectDest, ims.core.vo.VentilationTracheostomyVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_VentilationTracheostomy(valueObjectSrc.getID_VentilationTracheostomy());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// BreathsSpontaneously
		valueObjectDest.setBreathsSpontaneously(valueObjectSrc.getBreathsSpontaneously());
		// PatientIntubated
		valueObjectDest.setPatientIntubated(valueObjectSrc.getPatientIntubated());
		// IntubationMethod
		valueObjectDest.setIntubationMethod(valueObjectSrc.getIntubationMethod());
		// PatientVentilated
		valueObjectDest.setPatientVentilated(valueObjectSrc.getPatientVentilated());
		// TypeOfVentilator
		valueObjectDest.setTypeOfVentilator(valueObjectSrc.getTypeOfVentilator());
		// ModeOfVentilation
		valueObjectDest.setModeOfVentilation(valueObjectSrc.getModeOfVentilation());
		// RequiresATracheostomy
		valueObjectDest.setRequiresATracheostomy(valueObjectSrc.getRequiresATracheostomy());
		// TracheostomyType
		valueObjectDest.setTracheostomyType(valueObjectSrc.getTracheostomyType());
		// TracheostomyAccessories
		valueObjectDest.setTracheostomyAccessories(valueObjectSrc.getTracheostomyAccessories());
		// SizeCPAPValve
		valueObjectDest.setSizeCPAPValve(valueObjectSrc.getSizeCPAPValve());
		// SizeOfTracheostomy
		valueObjectDest.setSizeOfTracheostomy(valueObjectSrc.getSizeOfTracheostomy());
		// DateInserted
		valueObjectDest.setDateInserted(valueObjectSrc.getDateInserted());
		// DateLastChange
		valueObjectDest.setDateLastChange(valueObjectSrc.getDateLastChange());
		// DateNextChange
		valueObjectDest.setDateNextChange(valueObjectSrc.getDateNextChange());
		// DateRemoved
		valueObjectDest.setDateRemoved(valueObjectSrc.getDateRemoved());
		// Notes
		valueObjectDest.setNotes(valueObjectSrc.getNotes());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createVentilationTracheostomyVoCollectionFromVentilationTracheostomy(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.vitals.domain.objects.VentilationTracheostomy objects.
	 */
	public static ims.core.vo.VentilationTracheostomyVoCollection createVentilationTracheostomyVoCollectionFromVentilationTracheostomy(java.util.Set domainObjectSet)	
	{
		return createVentilationTracheostomyVoCollectionFromVentilationTracheostomy(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.vitals.domain.objects.VentilationTracheostomy objects.
	 */
	public static ims.core.vo.VentilationTracheostomyVoCollection createVentilationTracheostomyVoCollectionFromVentilationTracheostomy(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.VentilationTracheostomyVoCollection voList = new ims.core.vo.VentilationTracheostomyVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.vitals.domain.objects.VentilationTracheostomy domainObject = (ims.core.vitals.domain.objects.VentilationTracheostomy) iterator.next();
			ims.core.vo.VentilationTracheostomyVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.vitals.domain.objects.VentilationTracheostomy objects.
	 */
	public static ims.core.vo.VentilationTracheostomyVoCollection createVentilationTracheostomyVoCollectionFromVentilationTracheostomy(java.util.List domainObjectList) 
	{
		return createVentilationTracheostomyVoCollectionFromVentilationTracheostomy(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.vitals.domain.objects.VentilationTracheostomy objects.
	 */
	public static ims.core.vo.VentilationTracheostomyVoCollection createVentilationTracheostomyVoCollectionFromVentilationTracheostomy(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.VentilationTracheostomyVoCollection voList = new ims.core.vo.VentilationTracheostomyVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.vitals.domain.objects.VentilationTracheostomy domainObject = (ims.core.vitals.domain.objects.VentilationTracheostomy) domainObjectList.get(i);
			ims.core.vo.VentilationTracheostomyVo vo = create(map, domainObject);

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
	 * Create the ims.core.vitals.domain.objects.VentilationTracheostomy set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractVentilationTracheostomySet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VentilationTracheostomyVoCollection voCollection) 
	 {
	 	return extractVentilationTracheostomySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractVentilationTracheostomySet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VentilationTracheostomyVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.VentilationTracheostomyVo vo = voCollection.get(i);
			ims.core.vitals.domain.objects.VentilationTracheostomy domainObject = VentilationTracheostomyVoAssembler.extractVentilationTracheostomy(domainFactory, vo, domMap);

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
	 * Create the ims.core.vitals.domain.objects.VentilationTracheostomy list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractVentilationTracheostomyList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VentilationTracheostomyVoCollection voCollection) 
	 {
	 	return extractVentilationTracheostomyList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractVentilationTracheostomyList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VentilationTracheostomyVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.VentilationTracheostomyVo vo = voCollection.get(i);
			ims.core.vitals.domain.objects.VentilationTracheostomy domainObject = VentilationTracheostomyVoAssembler.extractVentilationTracheostomy(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.vitals.domain.objects.VentilationTracheostomy object.
	 * @param domainObject ims.core.vitals.domain.objects.VentilationTracheostomy
	 */
	 public static ims.core.vo.VentilationTracheostomyVo create(ims.core.vitals.domain.objects.VentilationTracheostomy domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.vitals.domain.objects.VentilationTracheostomy object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.VentilationTracheostomyVo create(DomainObjectMap map, ims.core.vitals.domain.objects.VentilationTracheostomy domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.VentilationTracheostomyVo valueObject = (ims.core.vo.VentilationTracheostomyVo) map.getValueObject(domainObject, ims.core.vo.VentilationTracheostomyVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.VentilationTracheostomyVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.vitals.domain.objects.VentilationTracheostomy
	 */
	 public static ims.core.vo.VentilationTracheostomyVo insert(ims.core.vo.VentilationTracheostomyVo valueObject, ims.core.vitals.domain.objects.VentilationTracheostomy domainObject) 
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
	 * @param domainObject ims.core.vitals.domain.objects.VentilationTracheostomy
	 */
	 public static ims.core.vo.VentilationTracheostomyVo insert(DomainObjectMap map, ims.core.vo.VentilationTracheostomyVo valueObject, ims.core.vitals.domain.objects.VentilationTracheostomy domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_VentilationTracheostomy(domainObject.getId());
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
			
		// BreathsSpontaneously
		ims.domain.lookups.LookupInstance instance1 = domainObject.getBreathsSpontaneously();
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

			ims.core.vo.lookups.YesNoUnknown voLookup1 = new ims.core.vo.lookups.YesNoUnknown(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.core.vo.lookups.YesNoUnknown(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setBreathsSpontaneously(voLookup1);
		}
				// PatientIntubated
		ims.domain.lookups.LookupInstance instance2 = domainObject.getPatientIntubated();
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

			ims.core.vo.lookups.YesNoUnknown voLookup2 = new ims.core.vo.lookups.YesNoUnknown(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.YesNoUnknown(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setPatientIntubated(voLookup2);
		}
				// IntubationMethod
		valueObject.setIntubationMethod(domainObject.getIntubationMethod());
		// PatientVentilated
		ims.domain.lookups.LookupInstance instance4 = domainObject.getPatientVentilated();
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

			ims.core.vo.lookups.YesNoUnknown voLookup4 = new ims.core.vo.lookups.YesNoUnknown(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.YesNoUnknown(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setPatientVentilated(voLookup4);
		}
				// TypeOfVentilator
		ims.domain.lookups.LookupInstance instance5 = domainObject.getTypeOfVentilator();
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

			ims.core.vo.lookups.VentilatorType voLookup5 = new ims.core.vo.lookups.VentilatorType(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.VentilatorType parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.VentilatorType(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setTypeOfVentilator(voLookup5);
		}
				// ModeOfVentilation
		ims.domain.lookups.LookupInstance instance6 = domainObject.getModeOfVentilation();
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

			ims.core.vo.lookups.VentilationMode voLookup6 = new ims.core.vo.lookups.VentilationMode(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.VentilationMode parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.VentilationMode(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setModeOfVentilation(voLookup6);
		}
				// RequiresATracheostomy
		ims.domain.lookups.LookupInstance instance7 = domainObject.getRequiresATracheostomy();
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

			ims.core.vo.lookups.YesNoUnknown voLookup7 = new ims.core.vo.lookups.YesNoUnknown(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.core.vo.lookups.YesNoUnknown(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setRequiresATracheostomy(voLookup7);
		}
				// TracheostomyType
		ims.domain.lookups.LookupInstance instance8 = domainObject.getTracheostomyType();
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

			ims.core.vo.lookups.TracheostomyType voLookup8 = new ims.core.vo.lookups.TracheostomyType(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.TracheostomyType parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.TracheostomyType(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setTracheostomyType(voLookup8);
		}
				// TracheostomyAccessories
		ims.domain.lookups.LookupInstance instance9 = domainObject.getTracheostomyAccessories();
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

			ims.core.vo.lookups.TracheostomyAccessories voLookup9 = new ims.core.vo.lookups.TracheostomyAccessories(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.TracheostomyAccessories parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.core.vo.lookups.TracheostomyAccessories(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setTracheostomyAccessories(voLookup9);
		}
				// SizeCPAPValve
		valueObject.setSizeCPAPValve(domainObject.getSizeCPAPValve());
		// SizeOfTracheostomy
		valueObject.setSizeOfTracheostomy(domainObject.getSizeOfTracheostomy());
		// DateInserted
		java.util.Date DateInserted = domainObject.getDateInserted();
		if ( null != DateInserted ) 
		{
			valueObject.setDateInserted(new ims.framework.utils.Date(DateInserted) );
		}
		// DateLastChange
		java.util.Date DateLastChange = domainObject.getDateLastChange();
		if ( null != DateLastChange ) 
		{
			valueObject.setDateLastChange(new ims.framework.utils.Date(DateLastChange) );
		}
		// DateNextChange
		java.util.Date DateNextChange = domainObject.getDateNextChange();
		if ( null != DateNextChange ) 
		{
			valueObject.setDateNextChange(new ims.framework.utils.Date(DateNextChange) );
		}
		// DateRemoved
		java.util.Date DateRemoved = domainObject.getDateRemoved();
		if ( null != DateRemoved ) 
		{
			valueObject.setDateRemoved(new ims.framework.utils.Date(DateRemoved) );
		}
		// Notes
		valueObject.setNotes(domainObject.getNotes());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.vitals.domain.objects.VentilationTracheostomy extractVentilationTracheostomy(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VentilationTracheostomyVo valueObject) 
	{
		return 	extractVentilationTracheostomy(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.vitals.domain.objects.VentilationTracheostomy extractVentilationTracheostomy(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VentilationTracheostomyVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_VentilationTracheostomy();
		ims.core.vitals.domain.objects.VentilationTracheostomy domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.vitals.domain.objects.VentilationTracheostomy)domMap.get(valueObject);
			}
			// ims.core.vo.VentilationTracheostomyVo ID_VentilationTracheostomy field is unknown
			domainObject = new ims.core.vitals.domain.objects.VentilationTracheostomy();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_VentilationTracheostomy());
			if (domMap.get(key) != null)
			{
				return (ims.core.vitals.domain.objects.VentilationTracheostomy)domMap.get(key);
			}
			domainObject = (ims.core.vitals.domain.objects.VentilationTracheostomy) domainFactory.getDomainObject(ims.core.vitals.domain.objects.VentilationTracheostomy.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_VentilationTracheostomy());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getBreathsSpontaneously() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getBreathsSpontaneously().getID());
		}
		domainObject.setBreathsSpontaneously(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getPatientIntubated() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getPatientIntubated().getID());
		}
		domainObject.setPatientIntubated(value2);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getIntubationMethod() != null && valueObject.getIntubationMethod().equals(""))
		{
			valueObject.setIntubationMethod(null);
		}
		domainObject.setIntubationMethod(valueObject.getIntubationMethod());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getPatientVentilated() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getPatientVentilated().getID());
		}
		domainObject.setPatientVentilated(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getTypeOfVentilator() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getTypeOfVentilator().getID());
		}
		domainObject.setTypeOfVentilator(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getModeOfVentilation() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getModeOfVentilation().getID());
		}
		domainObject.setModeOfVentilation(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getRequiresATracheostomy() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getRequiresATracheostomy().getID());
		}
		domainObject.setRequiresATracheostomy(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getTracheostomyType() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getTracheostomyType().getID());
		}
		domainObject.setTracheostomyType(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getTracheostomyAccessories() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getTracheostomyAccessories().getID());
		}
		domainObject.setTracheostomyAccessories(value9);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSizeCPAPValve() != null && valueObject.getSizeCPAPValve().equals(""))
		{
			valueObject.setSizeCPAPValve(null);
		}
		domainObject.setSizeCPAPValve(valueObject.getSizeCPAPValve());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSizeOfTracheostomy() != null && valueObject.getSizeOfTracheostomy().equals(""))
		{
			valueObject.setSizeOfTracheostomy(null);
		}
		domainObject.setSizeOfTracheostomy(valueObject.getSizeOfTracheostomy());
		java.util.Date value12 = null;
		ims.framework.utils.Date date12 = valueObject.getDateInserted();		
		if ( date12 != null ) 
		{
			value12 = date12.getDate();
		}
		domainObject.setDateInserted(value12);
		java.util.Date value13 = null;
		ims.framework.utils.Date date13 = valueObject.getDateLastChange();		
		if ( date13 != null ) 
		{
			value13 = date13.getDate();
		}
		domainObject.setDateLastChange(value13);
		java.util.Date value14 = null;
		ims.framework.utils.Date date14 = valueObject.getDateNextChange();		
		if ( date14 != null ) 
		{
			value14 = date14.getDate();
		}
		domainObject.setDateNextChange(value14);
		java.util.Date value15 = null;
		ims.framework.utils.Date date15 = valueObject.getDateRemoved();		
		if ( date15 != null ) 
		{
			value15 = date15.getDate();
		}
		domainObject.setDateRemoved(value15);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNotes() != null && valueObject.getNotes().equals(""))
		{
			valueObject.setNotes(null);
		}
		domainObject.setNotes(valueObject.getNotes());

		return domainObject;
	}

}
