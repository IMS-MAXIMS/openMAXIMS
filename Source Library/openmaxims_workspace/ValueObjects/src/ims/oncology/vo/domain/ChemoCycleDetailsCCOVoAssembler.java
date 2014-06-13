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
package ims.oncology.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class ChemoCycleDetailsCCOVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.oncology.vo.ChemoCycleDetailsCCOVo copy(ims.oncology.vo.ChemoCycleDetailsCCOVo valueObjectDest, ims.oncology.vo.ChemoCycleDetailsCCOVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ChemoCycleDetailsCCO(valueObjectSrc.getID_ChemoCycleDetailsCCO());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CycleNumber
		valueObjectDest.setCycleNumber(valueObjectSrc.getCycleNumber());
		// CycleStartDate
		valueObjectDest.setCycleStartDate(valueObjectSrc.getCycleStartDate());
		// CycleDuration
		valueObjectDest.setCycleDuration(valueObjectSrc.getCycleDuration());
		// TreatmentType
		valueObjectDest.setTreatmentType(valueObjectSrc.getTreatmentType());
		// Regimen
		valueObjectDest.setRegimen(valueObjectSrc.getRegimen());
		// ProcurementCode
		valueObjectDest.setProcurementCode(valueObjectSrc.getProcurementCode());
		// DayOneDeliveryCode
		valueObjectDest.setDayOneDeliveryCode(valueObjectSrc.getDayOneDeliveryCode());
		// DeliveryCodeAllOtherDays
		valueObjectDest.setDeliveryCodeAllOtherDays(valueObjectSrc.getDeliveryCodeAllOtherDays());
		// DayNumber
		valueObjectDest.setDayNumber(valueObjectSrc.getDayNumber());
		// IsActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// Weight
		valueObjectDest.setWeight(valueObjectSrc.getWeight());
		// PerformanceStatus
		valueObjectDest.setPerformanceStatus(valueObjectSrc.getPerformanceStatus());
		// DiaryEntry
		valueObjectDest.setDiaryEntry(valueObjectSrc.getDiaryEntry());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createChemoCycleDetailsCCOVoCollectionFromChemoCycleDetailsCCO(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.ChemoCycleDetailsCCO objects.
	 */
	public static ims.oncology.vo.ChemoCycleDetailsCCOVoCollection createChemoCycleDetailsCCOVoCollectionFromChemoCycleDetailsCCO(java.util.Set domainObjectSet)	
	{
		return createChemoCycleDetailsCCOVoCollectionFromChemoCycleDetailsCCO(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.ChemoCycleDetailsCCO objects.
	 */
	public static ims.oncology.vo.ChemoCycleDetailsCCOVoCollection createChemoCycleDetailsCCOVoCollectionFromChemoCycleDetailsCCO(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.oncology.vo.ChemoCycleDetailsCCOVoCollection voList = new ims.oncology.vo.ChemoCycleDetailsCCOVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.oncology.domain.objects.ChemoCycleDetailsCCO domainObject = (ims.oncology.domain.objects.ChemoCycleDetailsCCO) iterator.next();
			ims.oncology.vo.ChemoCycleDetailsCCOVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.oncology.domain.objects.ChemoCycleDetailsCCO objects.
	 */
	public static ims.oncology.vo.ChemoCycleDetailsCCOVoCollection createChemoCycleDetailsCCOVoCollectionFromChemoCycleDetailsCCO(java.util.List domainObjectList) 
	{
		return createChemoCycleDetailsCCOVoCollectionFromChemoCycleDetailsCCO(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.domain.objects.ChemoCycleDetailsCCO objects.
	 */
	public static ims.oncology.vo.ChemoCycleDetailsCCOVoCollection createChemoCycleDetailsCCOVoCollectionFromChemoCycleDetailsCCO(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.oncology.vo.ChemoCycleDetailsCCOVoCollection voList = new ims.oncology.vo.ChemoCycleDetailsCCOVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.domain.objects.ChemoCycleDetailsCCO domainObject = (ims.oncology.domain.objects.ChemoCycleDetailsCCO) domainObjectList.get(i);
			ims.oncology.vo.ChemoCycleDetailsCCOVo vo = create(map, domainObject);

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
	 * Create the ims.oncology.domain.objects.ChemoCycleDetailsCCO set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractChemoCycleDetailsCCOSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.ChemoCycleDetailsCCOVoCollection voCollection) 
	 {
	 	return extractChemoCycleDetailsCCOSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractChemoCycleDetailsCCOSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.ChemoCycleDetailsCCOVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.ChemoCycleDetailsCCOVo vo = voCollection.get(i);
			ims.oncology.domain.objects.ChemoCycleDetailsCCO domainObject = ChemoCycleDetailsCCOVoAssembler.extractChemoCycleDetailsCCO(domainFactory, vo, domMap);

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
	 * Create the ims.oncology.domain.objects.ChemoCycleDetailsCCO list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractChemoCycleDetailsCCOList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.ChemoCycleDetailsCCOVoCollection voCollection) 
	 {
	 	return extractChemoCycleDetailsCCOList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractChemoCycleDetailsCCOList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.ChemoCycleDetailsCCOVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.ChemoCycleDetailsCCOVo vo = voCollection.get(i);
			ims.oncology.domain.objects.ChemoCycleDetailsCCO domainObject = ChemoCycleDetailsCCOVoAssembler.extractChemoCycleDetailsCCO(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.oncology.domain.objects.ChemoCycleDetailsCCO object.
	 * @param domainObject ims.oncology.domain.objects.ChemoCycleDetailsCCO
	 */
	 public static ims.oncology.vo.ChemoCycleDetailsCCOVo create(ims.oncology.domain.objects.ChemoCycleDetailsCCO domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.oncology.domain.objects.ChemoCycleDetailsCCO object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.oncology.vo.ChemoCycleDetailsCCOVo create(DomainObjectMap map, ims.oncology.domain.objects.ChemoCycleDetailsCCO domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.oncology.vo.ChemoCycleDetailsCCOVo valueObject = (ims.oncology.vo.ChemoCycleDetailsCCOVo) map.getValueObject(domainObject, ims.oncology.vo.ChemoCycleDetailsCCOVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.oncology.vo.ChemoCycleDetailsCCOVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.oncology.domain.objects.ChemoCycleDetailsCCO
	 */
	 public static ims.oncology.vo.ChemoCycleDetailsCCOVo insert(ims.oncology.vo.ChemoCycleDetailsCCOVo valueObject, ims.oncology.domain.objects.ChemoCycleDetailsCCO domainObject) 
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
	 * @param domainObject ims.oncology.domain.objects.ChemoCycleDetailsCCO
	 */
	 public static ims.oncology.vo.ChemoCycleDetailsCCOVo insert(DomainObjectMap map, ims.oncology.vo.ChemoCycleDetailsCCOVo valueObject, ims.oncology.domain.objects.ChemoCycleDetailsCCO domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ChemoCycleDetailsCCO(domainObject.getId());
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
			
		// CycleNumber
		valueObject.setCycleNumber(domainObject.getCycleNumber());
		// CycleStartDate
		java.util.Date CycleStartDate = domainObject.getCycleStartDate();
		if ( null != CycleStartDate ) 
		{
			valueObject.setCycleStartDate(new ims.framework.utils.Date(CycleStartDate) );
		}
		// CycleDuration
		valueObject.setCycleDuration(domainObject.getCycleDuration());
		// TreatmentType
		ims.domain.lookups.LookupInstance instance4 = domainObject.getTreatmentType();
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

			ims.oncology.vo.lookups.ChemoCycleTreatmentType voLookup4 = new ims.oncology.vo.lookups.ChemoCycleTreatmentType(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.oncology.vo.lookups.ChemoCycleTreatmentType parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.oncology.vo.lookups.ChemoCycleTreatmentType(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setTreatmentType(voLookup4);
		}
				// Regimen
		ims.domain.lookups.LookupInstance instance5 = domainObject.getRegimen();
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

			ims.oncology.vo.lookups.RegimenAcronym voLookup5 = new ims.oncology.vo.lookups.RegimenAcronym(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.oncology.vo.lookups.RegimenAcronym parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.oncology.vo.lookups.RegimenAcronym(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setRegimen(voLookup5);
		}
				// ProcurementCode
		ims.domain.lookups.LookupInstance instance6 = domainObject.getProcurementCode();
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

			ims.oncology.vo.lookups.ProcurementCode voLookup6 = new ims.oncology.vo.lookups.ProcurementCode(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.oncology.vo.lookups.ProcurementCode parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.oncology.vo.lookups.ProcurementCode(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setProcurementCode(voLookup6);
		}
				// DayOneDeliveryCode
		ims.domain.lookups.LookupInstance instance7 = domainObject.getDayOneDeliveryCode();
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

			ims.oncology.vo.lookups.DayOneDeliveryCode voLookup7 = new ims.oncology.vo.lookups.DayOneDeliveryCode(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.oncology.vo.lookups.DayOneDeliveryCode parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.oncology.vo.lookups.DayOneDeliveryCode(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setDayOneDeliveryCode(voLookup7);
		}
				// DeliveryCodeAllOtherDays
		ims.domain.lookups.LookupInstance instance8 = domainObject.getDeliveryCodeAllOtherDays();
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

			ims.oncology.vo.lookups.DeliveryCodeAllOtherDays voLookup8 = new ims.oncology.vo.lookups.DeliveryCodeAllOtherDays(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.oncology.vo.lookups.DeliveryCodeAllOtherDays parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.oncology.vo.lookups.DeliveryCodeAllOtherDays(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setDeliveryCodeAllOtherDays(voLookup8);
		}
				// DayNumber
		valueObject.setDayNumber(domainObject.getDayNumber());
		// IsActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// Weight
		valueObject.setWeight(domainObject.getWeight());
		// PerformanceStatus
		ims.domain.lookups.LookupInstance instance12 = domainObject.getPerformanceStatus();
		if ( null != instance12 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance12.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance12.getImage().getImageId(), instance12.getImage().getImagePath());
			}
			color = instance12.getColor();
			if (color != null) 
				color.getValue();

			ims.medicaloncology.vo.lookups.PerformanceStatus voLookup12 = new ims.medicaloncology.vo.lookups.PerformanceStatus(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.medicaloncology.vo.lookups.PerformanceStatus parentVoLookup12 = voLookup12;
			ims.domain.lookups.LookupInstance parent12 = instance12.getParent();
			while (parent12 != null)
			{
				if (parent12.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent12.getImage().getImageId(), parent12.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent12.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup12.setParent(new ims.medicaloncology.vo.lookups.PerformanceStatus(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setPerformanceStatus(voLookup12);
		}
				// DiaryEntry
		valueObject.setDiaryEntry(ims.core.vo.domain.PatientApptDiaryVoAssembler.create(map, domainObject.getDiaryEntry()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.domain.objects.ChemoCycleDetailsCCO extractChemoCycleDetailsCCO(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.ChemoCycleDetailsCCOVo valueObject) 
	{
		return 	extractChemoCycleDetailsCCO(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.domain.objects.ChemoCycleDetailsCCO extractChemoCycleDetailsCCO(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.ChemoCycleDetailsCCOVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ChemoCycleDetailsCCO();
		ims.oncology.domain.objects.ChemoCycleDetailsCCO domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.oncology.domain.objects.ChemoCycleDetailsCCO)domMap.get(valueObject);
			}
			// ims.oncology.vo.ChemoCycleDetailsCCOVo ID_ChemoCycleDetailsCCO field is unknown
			domainObject = new ims.oncology.domain.objects.ChemoCycleDetailsCCO();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ChemoCycleDetailsCCO());
			if (domMap.get(key) != null)
			{
				return (ims.oncology.domain.objects.ChemoCycleDetailsCCO)domMap.get(key);
			}
			domainObject = (ims.oncology.domain.objects.ChemoCycleDetailsCCO) domainFactory.getDomainObject(ims.oncology.domain.objects.ChemoCycleDetailsCCO.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ChemoCycleDetailsCCO());

		domainObject.setCycleNumber(valueObject.getCycleNumber());
		java.util.Date value2 = null;
		ims.framework.utils.Date date2 = valueObject.getCycleStartDate();		
		if ( date2 != null ) 
		{
			value2 = date2.getDate();
		}
		domainObject.setCycleStartDate(value2);
		domainObject.setCycleDuration(valueObject.getCycleDuration());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getTreatmentType() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getTreatmentType().getID());
		}
		domainObject.setTreatmentType(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getRegimen() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getRegimen().getID());
		}
		domainObject.setRegimen(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getProcurementCode() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getProcurementCode().getID());
		}
		domainObject.setProcurementCode(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getDayOneDeliveryCode() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getDayOneDeliveryCode().getID());
		}
		domainObject.setDayOneDeliveryCode(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getDeliveryCodeAllOtherDays() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getDeliveryCodeAllOtherDays().getID());
		}
		domainObject.setDeliveryCodeAllOtherDays(value8);
		domainObject.setDayNumber(valueObject.getDayNumber());
		domainObject.setIsActive(valueObject.getIsActive());
		domainObject.setWeight(valueObject.getWeight());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getPerformanceStatus() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getPerformanceStatus().getID());
		}
		domainObject.setPerformanceStatus(value12);
		domainObject.setDiaryEntry(ims.core.vo.domain.PatientApptDiaryVoAssembler.extractPatientApptDiary(domainFactory, valueObject.getDiaryEntry(), domMap));

		return domainObject;
	}

}
