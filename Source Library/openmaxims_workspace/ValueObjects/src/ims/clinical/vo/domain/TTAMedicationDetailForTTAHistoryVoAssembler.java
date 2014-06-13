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
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Calin Perebiceanu
 */
public class TTAMedicationDetailForTTAHistoryVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.TTAMedicationDetailForTTAHistoryVo copy(ims.clinical.vo.TTAMedicationDetailForTTAHistoryVo valueObjectDest, ims.clinical.vo.TTAMedicationDetailForTTAHistoryVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_TTAMedicationDetail(valueObjectSrc.getID_TTAMedicationDetail());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Medication
		valueObjectDest.setMedication(valueObjectSrc.getMedication());
		// OtherMedicationText
		valueObjectDest.setOtherMedicationText(valueObjectSrc.getOtherMedicationText());
		// DoseValue
		valueObjectDest.setDoseValue(valueObjectSrc.getDoseValue());
		// Form
		valueObjectDest.setForm(valueObjectSrc.getForm());
		// Route
		valueObjectDest.setRoute(valueObjectSrc.getRoute());
		// DoseUnit
		valueObjectDest.setDoseUnit(valueObjectSrc.getDoseUnit());
		// FrequencyUnit
		valueObjectDest.setFrequencyUnit(valueObjectSrc.getFrequencyUnit());
		// UnitText
		valueObjectDest.setUnitText(valueObjectSrc.getUnitText());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTTAMedicationDetailForTTAHistoryVoCollectionFromTTAMedicationDetail(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.edischarge.domain.objects.TTAMedicationDetail objects.
	 */
	public static ims.clinical.vo.TTAMedicationDetailForTTAHistoryVoCollection createTTAMedicationDetailForTTAHistoryVoCollectionFromTTAMedicationDetail(java.util.Set domainObjectSet)	
	{
		return createTTAMedicationDetailForTTAHistoryVoCollectionFromTTAMedicationDetail(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.edischarge.domain.objects.TTAMedicationDetail objects.
	 */
	public static ims.clinical.vo.TTAMedicationDetailForTTAHistoryVoCollection createTTAMedicationDetailForTTAHistoryVoCollectionFromTTAMedicationDetail(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.TTAMedicationDetailForTTAHistoryVoCollection voList = new ims.clinical.vo.TTAMedicationDetailForTTAHistoryVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.edischarge.domain.objects.TTAMedicationDetail domainObject = (ims.edischarge.domain.objects.TTAMedicationDetail) iterator.next();
			ims.clinical.vo.TTAMedicationDetailForTTAHistoryVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.edischarge.domain.objects.TTAMedicationDetail objects.
	 */
	public static ims.clinical.vo.TTAMedicationDetailForTTAHistoryVoCollection createTTAMedicationDetailForTTAHistoryVoCollectionFromTTAMedicationDetail(java.util.List domainObjectList) 
	{
		return createTTAMedicationDetailForTTAHistoryVoCollectionFromTTAMedicationDetail(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.edischarge.domain.objects.TTAMedicationDetail objects.
	 */
	public static ims.clinical.vo.TTAMedicationDetailForTTAHistoryVoCollection createTTAMedicationDetailForTTAHistoryVoCollectionFromTTAMedicationDetail(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.TTAMedicationDetailForTTAHistoryVoCollection voList = new ims.clinical.vo.TTAMedicationDetailForTTAHistoryVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.edischarge.domain.objects.TTAMedicationDetail domainObject = (ims.edischarge.domain.objects.TTAMedicationDetail) domainObjectList.get(i);
			ims.clinical.vo.TTAMedicationDetailForTTAHistoryVo vo = create(map, domainObject);

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
	 * Create the ims.edischarge.domain.objects.TTAMedicationDetail set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTTAMedicationDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TTAMedicationDetailForTTAHistoryVoCollection voCollection) 
	 {
	 	return extractTTAMedicationDetailSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTTAMedicationDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TTAMedicationDetailForTTAHistoryVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.TTAMedicationDetailForTTAHistoryVo vo = voCollection.get(i);
			ims.edischarge.domain.objects.TTAMedicationDetail domainObject = TTAMedicationDetailForTTAHistoryVoAssembler.extractTTAMedicationDetail(domainFactory, vo, domMap);

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
	 * Create the ims.edischarge.domain.objects.TTAMedicationDetail list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTTAMedicationDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TTAMedicationDetailForTTAHistoryVoCollection voCollection) 
	 {
	 	return extractTTAMedicationDetailList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTTAMedicationDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TTAMedicationDetailForTTAHistoryVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.TTAMedicationDetailForTTAHistoryVo vo = voCollection.get(i);
			ims.edischarge.domain.objects.TTAMedicationDetail domainObject = TTAMedicationDetailForTTAHistoryVoAssembler.extractTTAMedicationDetail(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.edischarge.domain.objects.TTAMedicationDetail object.
	 * @param domainObject ims.edischarge.domain.objects.TTAMedicationDetail
	 */
	 public static ims.clinical.vo.TTAMedicationDetailForTTAHistoryVo create(ims.edischarge.domain.objects.TTAMedicationDetail domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.edischarge.domain.objects.TTAMedicationDetail object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.TTAMedicationDetailForTTAHistoryVo create(DomainObjectMap map, ims.edischarge.domain.objects.TTAMedicationDetail domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.TTAMedicationDetailForTTAHistoryVo valueObject = (ims.clinical.vo.TTAMedicationDetailForTTAHistoryVo) map.getValueObject(domainObject, ims.clinical.vo.TTAMedicationDetailForTTAHistoryVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.TTAMedicationDetailForTTAHistoryVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.edischarge.domain.objects.TTAMedicationDetail
	 */
	 public static ims.clinical.vo.TTAMedicationDetailForTTAHistoryVo insert(ims.clinical.vo.TTAMedicationDetailForTTAHistoryVo valueObject, ims.edischarge.domain.objects.TTAMedicationDetail domainObject) 
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
	 * @param domainObject ims.edischarge.domain.objects.TTAMedicationDetail
	 */
	 public static ims.clinical.vo.TTAMedicationDetailForTTAHistoryVo insert(DomainObjectMap map, ims.clinical.vo.TTAMedicationDetailForTTAHistoryVo valueObject, ims.edischarge.domain.objects.TTAMedicationDetail domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_TTAMedicationDetail(domainObject.getId());
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
			
		// Medication
		valueObject.setMedication(ims.core.vo.domain.MedicationLiteVoAssembler.create(map, domainObject.getMedication()) );
		// OtherMedicationText
		valueObject.setOtherMedicationText(domainObject.getOtherMedicationText());
		// DoseValue
		valueObject.setDoseValue(domainObject.getDoseValue());
		// Form
		ims.domain.lookups.LookupInstance instance4 = domainObject.getForm();
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

			ims.clinical.vo.lookups.DoseFormIndicator voLookup4 = new ims.clinical.vo.lookups.DoseFormIndicator(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.clinical.vo.lookups.DoseFormIndicator parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.clinical.vo.lookups.DoseFormIndicator(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setForm(voLookup4);
		}
				// Route
		ims.domain.lookups.LookupInstance instance5 = domainObject.getRoute();
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

			ims.core.vo.lookups.MedicationRoute voLookup5 = new ims.core.vo.lookups.MedicationRoute(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.MedicationRoute parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.MedicationRoute(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setRoute(voLookup5);
		}
				// DoseUnit
		ims.domain.lookups.LookupInstance instance6 = domainObject.getDoseUnit();
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

			ims.core.vo.lookups.MedicationDoseUnit voLookup6 = new ims.core.vo.lookups.MedicationDoseUnit(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.MedicationDoseUnit parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.MedicationDoseUnit(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setDoseUnit(voLookup6);
		}
				// FrequencyUnit
		ims.domain.lookups.LookupInstance instance7 = domainObject.getFrequencyUnit();
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

			ims.core.vo.lookups.MedicationFrequency voLookup7 = new ims.core.vo.lookups.MedicationFrequency(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.MedicationFrequency parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.core.vo.lookups.MedicationFrequency(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setFrequencyUnit(voLookup7);
		}
				// UnitText
		valueObject.setUnitText(domainObject.getUnitText());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.edischarge.domain.objects.TTAMedicationDetail extractTTAMedicationDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TTAMedicationDetailForTTAHistoryVo valueObject) 
	{
		return 	extractTTAMedicationDetail(domainFactory, valueObject, new HashMap());
	}

	public static ims.edischarge.domain.objects.TTAMedicationDetail extractTTAMedicationDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TTAMedicationDetailForTTAHistoryVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_TTAMedicationDetail();
		ims.edischarge.domain.objects.TTAMedicationDetail domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.edischarge.domain.objects.TTAMedicationDetail)domMap.get(valueObject);
			}
			// ims.clinical.vo.TTAMedicationDetailForTTAHistoryVo ID_TTAMedicationDetail field is unknown
			domainObject = new ims.edischarge.domain.objects.TTAMedicationDetail();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_TTAMedicationDetail());
			if (domMap.get(key) != null)
			{
				return (ims.edischarge.domain.objects.TTAMedicationDetail)domMap.get(key);
			}
			domainObject = (ims.edischarge.domain.objects.TTAMedicationDetail) domainFactory.getDomainObject(ims.edischarge.domain.objects.TTAMedicationDetail.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_TTAMedicationDetail());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Medication value1 = null;
		if ( null != valueObject.getMedication() ) 
		{
			if (valueObject.getMedication().getBoId() == null)
			{
				if (domMap.get(valueObject.getMedication()) != null)
				{
					value1 = (ims.core.clinical.domain.objects.Medication)domMap.get(valueObject.getMedication());
				}
			}
			else
			{
				value1 = (ims.core.clinical.domain.objects.Medication)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Medication.class, valueObject.getMedication().getBoId());
			}
		}
		domainObject.setMedication(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOtherMedicationText() != null && valueObject.getOtherMedicationText().equals(""))
		{
			valueObject.setOtherMedicationText(null);
		}
		domainObject.setOtherMedicationText(valueObject.getOtherMedicationText());
		domainObject.setDoseValue(valueObject.getDoseValue());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getForm() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getForm().getID());
		}
		domainObject.setForm(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getRoute() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getRoute().getID());
		}
		domainObject.setRoute(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getDoseUnit() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getDoseUnit().getID());
		}
		domainObject.setDoseUnit(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getFrequencyUnit() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getFrequencyUnit().getID());
		}
		domainObject.setFrequencyUnit(value7);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getUnitText() != null && valueObject.getUnitText().equals(""))
		{
			valueObject.setUnitText(null);
		}
		domainObject.setUnitText(valueObject.getUnitText());

		return domainObject;
	}

}
