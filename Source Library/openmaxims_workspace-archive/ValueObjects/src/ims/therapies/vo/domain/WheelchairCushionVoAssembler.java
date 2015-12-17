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
 * @author Peter Martin
 */
public class WheelchairCushionVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.therapies.vo.WheelchairCushionVo copy(ims.therapies.vo.WheelchairCushionVo valueObjectDest, ims.therapies.vo.WheelchairCushionVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_WheelchairCushion(valueObjectSrc.getID_WheelchairCushion());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AuthoringDateTime
		valueObjectDest.setAuthoringDateTime(valueObjectSrc.getAuthoringDateTime());
		// AuthoringCP
		valueObjectDest.setAuthoringCP(valueObjectSrc.getAuthoringCP());
		// CushionType
		valueObjectDest.setCushionType(valueObjectSrc.getCushionType());
		// CushionCategory
		valueObjectDest.setCushionCategory(valueObjectSrc.getCushionCategory());
		// CoverType
		valueObjectDest.setCoverType(valueObjectSrc.getCoverType());
		// CushionSize
		valueObjectDest.setCushionSize(valueObjectSrc.getCushionSize());
		// StartDate
		valueObjectDest.setStartDate(valueObjectSrc.getStartDate());
		// EndDate
		valueObjectDest.setEndDate(valueObjectSrc.getEndDate());
		// PressureReadingDate
		valueObjectDest.setPressureReadingDate(valueObjectSrc.getPressureReadingDate());
		// CushionModification
		valueObjectDest.setCushionModification(valueObjectSrc.getCushionModification());
		// CushionAccessory
		valueObjectDest.setCushionAccessory(valueObjectSrc.getCushionAccessory());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createWheelchairCushionVoCollectionFromWheelchairCushion(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.therapies.mobilitytransfers.domain.objects.WheelchairCushion objects.
	 */
	public static ims.therapies.vo.WheelchairCushionVoCollection createWheelchairCushionVoCollectionFromWheelchairCushion(java.util.Set domainObjectSet)	
	{
		return createWheelchairCushionVoCollectionFromWheelchairCushion(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.therapies.mobilitytransfers.domain.objects.WheelchairCushion objects.
	 */
	public static ims.therapies.vo.WheelchairCushionVoCollection createWheelchairCushionVoCollectionFromWheelchairCushion(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.therapies.vo.WheelchairCushionVoCollection voList = new ims.therapies.vo.WheelchairCushionVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.therapies.mobilitytransfers.domain.objects.WheelchairCushion domainObject = (ims.therapies.mobilitytransfers.domain.objects.WheelchairCushion) iterator.next();
			ims.therapies.vo.WheelchairCushionVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.therapies.mobilitytransfers.domain.objects.WheelchairCushion objects.
	 */
	public static ims.therapies.vo.WheelchairCushionVoCollection createWheelchairCushionVoCollectionFromWheelchairCushion(java.util.List domainObjectList) 
	{
		return createWheelchairCushionVoCollectionFromWheelchairCushion(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.therapies.mobilitytransfers.domain.objects.WheelchairCushion objects.
	 */
	public static ims.therapies.vo.WheelchairCushionVoCollection createWheelchairCushionVoCollectionFromWheelchairCushion(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.therapies.vo.WheelchairCushionVoCollection voList = new ims.therapies.vo.WheelchairCushionVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.therapies.mobilitytransfers.domain.objects.WheelchairCushion domainObject = (ims.therapies.mobilitytransfers.domain.objects.WheelchairCushion) domainObjectList.get(i);
			ims.therapies.vo.WheelchairCushionVo vo = create(map, domainObject);

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
	 * Create the ims.therapies.mobilitytransfers.domain.objects.WheelchairCushion set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractWheelchairCushionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.WheelchairCushionVoCollection voCollection) 
	 {
	 	return extractWheelchairCushionSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractWheelchairCushionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.WheelchairCushionVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.WheelchairCushionVo vo = voCollection.get(i);
			ims.therapies.mobilitytransfers.domain.objects.WheelchairCushion domainObject = WheelchairCushionVoAssembler.extractWheelchairCushion(domainFactory, vo, domMap);

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
	 * Create the ims.therapies.mobilitytransfers.domain.objects.WheelchairCushion list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractWheelchairCushionList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.WheelchairCushionVoCollection voCollection) 
	 {
	 	return extractWheelchairCushionList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractWheelchairCushionList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.WheelchairCushionVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.WheelchairCushionVo vo = voCollection.get(i);
			ims.therapies.mobilitytransfers.domain.objects.WheelchairCushion domainObject = WheelchairCushionVoAssembler.extractWheelchairCushion(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.therapies.mobilitytransfers.domain.objects.WheelchairCushion object.
	 * @param domainObject ims.therapies.mobilitytransfers.domain.objects.WheelchairCushion
	 */
	 public static ims.therapies.vo.WheelchairCushionVo create(ims.therapies.mobilitytransfers.domain.objects.WheelchairCushion domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.therapies.mobilitytransfers.domain.objects.WheelchairCushion object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.therapies.vo.WheelchairCushionVo create(DomainObjectMap map, ims.therapies.mobilitytransfers.domain.objects.WheelchairCushion domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.therapies.vo.WheelchairCushionVo valueObject = (ims.therapies.vo.WheelchairCushionVo) map.getValueObject(domainObject, ims.therapies.vo.WheelchairCushionVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.therapies.vo.WheelchairCushionVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.therapies.mobilitytransfers.domain.objects.WheelchairCushion
	 */
	 public static ims.therapies.vo.WheelchairCushionVo insert(ims.therapies.vo.WheelchairCushionVo valueObject, ims.therapies.mobilitytransfers.domain.objects.WheelchairCushion domainObject) 
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
	 * @param domainObject ims.therapies.mobilitytransfers.domain.objects.WheelchairCushion
	 */
	 public static ims.therapies.vo.WheelchairCushionVo insert(DomainObjectMap map, ims.therapies.vo.WheelchairCushionVo valueObject, ims.therapies.mobilitytransfers.domain.objects.WheelchairCushion domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_WheelchairCushion(domainObject.getId());
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
			
		// AuthoringDateTime
		java.util.Date AuthoringDateTime = domainObject.getAuthoringDateTime();
		if ( null != AuthoringDateTime ) 
		{
			valueObject.setAuthoringDateTime(new ims.framework.utils.DateTime(AuthoringDateTime) );
		}
		// AuthoringCP
		valueObject.setAuthoringCP(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getAuthoringCP()) );
		// CushionType
		ims.domain.lookups.LookupInstance instance3 = domainObject.getCushionType();
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

			ims.spinalinjuries.vo.lookups.WheelchairCushionType voLookup3 = new ims.spinalinjuries.vo.lookups.WheelchairCushionType(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.WheelchairCushionType parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.spinalinjuries.vo.lookups.WheelchairCushionType(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setCushionType(voLookup3);
		}
				// CushionCategory
		ims.domain.lookups.LookupInstance instance4 = domainObject.getCushionCategory();
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

			ims.spinalinjuries.vo.lookups.WheelchairCushionType voLookup4 = new ims.spinalinjuries.vo.lookups.WheelchairCushionType(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.WheelchairCushionType parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.spinalinjuries.vo.lookups.WheelchairCushionType(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setCushionCategory(voLookup4);
		}
				// CoverType
		ims.domain.lookups.LookupInstance instance5 = domainObject.getCoverType();
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

			ims.spinalinjuries.vo.lookups.WheelchairCoverType voLookup5 = new ims.spinalinjuries.vo.lookups.WheelchairCoverType(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.WheelchairCoverType parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.spinalinjuries.vo.lookups.WheelchairCoverType(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setCoverType(voLookup5);
		}
				// CushionSize
		ims.domain.lookups.LookupInstance instance6 = domainObject.getCushionSize();
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

			ims.spinalinjuries.vo.lookups.WheelchairCushionSize voLookup6 = new ims.spinalinjuries.vo.lookups.WheelchairCushionSize(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.WheelchairCushionSize parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.spinalinjuries.vo.lookups.WheelchairCushionSize(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setCushionSize(voLookup6);
		}
				// StartDate
		java.util.Date StartDate = domainObject.getStartDate();
		if ( null != StartDate ) 
		{
			valueObject.setStartDate(new ims.framework.utils.Date(StartDate) );
		}
		// EndDate
		java.util.Date EndDate = domainObject.getEndDate();
		if ( null != EndDate ) 
		{
			valueObject.setEndDate(new ims.framework.utils.Date(EndDate) );
		}
		// PressureReadingDate
		java.util.List listPressureReadingDate = domainObject.getPressureReadingDate();
		ims.framework.utils.Date[] PressureReadingDate = new ims.framework.utils.Date[ listPressureReadingDate.size() ];
		int i9 = 0;
		for(java.util.Iterator iterator = listPressureReadingDate.iterator(); iterator.hasNext(); i9++ ) 
		{
			java.util.Date obj = (java.util.Date) iterator.next();
			PressureReadingDate[i9] = new ims.framework.utils.Date(obj);
		}
		valueObject.setPressureReadingDate( PressureReadingDate );
		// CushionModification
		java.util.List listCushionModification = domainObject.getCushionModification();
		ims.spinalinjuries.vo.lookups.WheelchairCushionModificationCollection CushionModification = new ims.spinalinjuries.vo.lookups.WheelchairCushionModificationCollection();
		for(java.util.Iterator iterator = listCushionModification.iterator(); iterator.hasNext(); ) 
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
			ims.spinalinjuries.vo.lookups.WheelchairCushionModification voInstance = new ims.spinalinjuries.vo.lookups.WheelchairCushionModification(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.WheelchairCushionModification parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.spinalinjuries.vo.lookups.WheelchairCushionModification(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			CushionModification.add(voInstance);
		}
		valueObject.setCushionModification( CushionModification );
		// CushionAccessory
		java.util.List listCushionAccessory = domainObject.getCushionAccessory();
		ims.spinalinjuries.vo.lookups.WheelchairCushionAccessoryCollection CushionAccessory = new ims.spinalinjuries.vo.lookups.WheelchairCushionAccessoryCollection();
		for(java.util.Iterator iterator = listCushionAccessory.iterator(); iterator.hasNext(); ) 
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
			ims.spinalinjuries.vo.lookups.WheelchairCushionAccessory voInstance = new ims.spinalinjuries.vo.lookups.WheelchairCushionAccessory(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.WheelchairCushionAccessory parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.spinalinjuries.vo.lookups.WheelchairCushionAccessory(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			CushionAccessory.add(voInstance);
		}
		valueObject.setCushionAccessory( CushionAccessory );
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
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.therapies.mobilitytransfers.domain.objects.WheelchairCushion extractWheelchairCushion(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.WheelchairCushionVo valueObject) 
	{
		return 	extractWheelchairCushion(domainFactory, valueObject, new HashMap());
	}

	public static ims.therapies.mobilitytransfers.domain.objects.WheelchairCushion extractWheelchairCushion(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.WheelchairCushionVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_WheelchairCushion();
		ims.therapies.mobilitytransfers.domain.objects.WheelchairCushion domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.therapies.mobilitytransfers.domain.objects.WheelchairCushion)domMap.get(valueObject);
			}
			// ims.therapies.vo.WheelchairCushionVo ID_WheelchairCushion field is unknown
			domainObject = new ims.therapies.mobilitytransfers.domain.objects.WheelchairCushion();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_WheelchairCushion());
			if (domMap.get(key) != null)
			{
				return (ims.therapies.mobilitytransfers.domain.objects.WheelchairCushion)domMap.get(key);
			}
			domainObject = (ims.therapies.mobilitytransfers.domain.objects.WheelchairCushion) domainFactory.getDomainObject(ims.therapies.mobilitytransfers.domain.objects.WheelchairCushion.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_WheelchairCushion());

		ims.framework.utils.DateTime dateTime1 = valueObject.getAuthoringDateTime();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setAuthoringDateTime(value1);
		domainObject.setAuthoringCP(ims.core.vo.domain.HcpAssembler.extractHcp(domainFactory, valueObject.getAuthoringCP(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getCushionType() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getCushionType().getID());
		}
		domainObject.setCushionType(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getCushionCategory() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getCushionCategory().getID());
		}
		domainObject.setCushionCategory(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getCoverType() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getCoverType().getID());
		}
		domainObject.setCoverType(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getCushionSize() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getCushionSize().getID());
		}
		domainObject.setCushionSize(value6);
		java.util.Date value7 = null;
		ims.framework.utils.Date date7 = valueObject.getStartDate();		
		if ( date7 != null ) 
		{
			value7 = date7.getDate();
		}
		domainObject.setStartDate(value7);
		java.util.Date value8 = null;
		ims.framework.utils.Date date8 = valueObject.getEndDate();		
		if ( date8 != null ) 
		{
			value8 = date8.getDate();
		}
		domainObject.setEndDate(value8);
		ims.framework.utils.Date[] array9 = valueObject.getPressureReadingDate();
		java.util.List value9 = null;
		if ( array9 != null ) 
		{
			value9 = new java.util.ArrayList(array9.length);
			for(int i=0; i<array9.length; i++) {
				value9.add(array9[i].getDate());
			}
		}
		domainObject.setPressureReadingDate(value9);		
		ims.spinalinjuries.vo.lookups.WheelchairCushionModificationCollection collection10 =
	valueObject.getCushionModification();
	    java.util.List domainCushionModification = domainObject.getCushionModification();;			
	    int collection10Size=0;
		if (collection10 == null)
		{
			domainCushionModification = new java.util.ArrayList(0);
		}
		else
		{
			collection10Size = collection10.size();
		}
		
		for(int i=0; i<collection10Size; i++) 
		{
			int instanceId = collection10.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainCushionModification.indexOf(dom);
			if (domIdx == -1)
			{
				domainCushionModification.add(i, dom);
			}
			else if (i != domIdx && i < domainCushionModification.size())
			{
				Object tmp = domainCushionModification.get(i);
				domainCushionModification.set(i, domainCushionModification.get(domIdx));
				domainCushionModification.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j10 = domainCushionModification.size();
		while (j10 > collection10Size)
		{
			domainCushionModification.remove(j10-1);
			j10 = domainCushionModification.size();
		}

		domainObject.setCushionModification(domainCushionModification);		
		ims.spinalinjuries.vo.lookups.WheelchairCushionAccessoryCollection collection11 =
	valueObject.getCushionAccessory();
	    java.util.List domainCushionAccessory = domainObject.getCushionAccessory();;			
	    int collection11Size=0;
		if (collection11 == null)
		{
			domainCushionAccessory = new java.util.ArrayList(0);
		}
		else
		{
			collection11Size = collection11.size();
		}
		
		for(int i=0; i<collection11Size; i++) 
		{
			int instanceId = collection11.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainCushionAccessory.indexOf(dom);
			if (domIdx == -1)
			{
				domainCushionAccessory.add(i, dom);
			}
			else if (i != domIdx && i < domainCushionAccessory.size())
			{
				Object tmp = domainCushionAccessory.get(i);
				domainCushionAccessory.set(i, domainCushionAccessory.get(domIdx));
				domainCushionAccessory.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j11 = domainCushionAccessory.size();
		while (j11 > collection11Size)
		{
			domainCushionAccessory.remove(j11-1);
			j11 = domainCushionAccessory.size();
		}

		domainObject.setCushionAccessory(domainCushionAccessory);		
		ims.core.admin.domain.objects.ClinicalContact value12 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value12 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value12 = domainObject.getClinicalContact();	
			}
			else
			{
				value12 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value12);
		ims.core.admin.domain.objects.CareContext value13 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value13 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value13 = domainObject.getCareContext();	
			}
			else
			{
				value13 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value13);

		return domainObject;
	}

}
