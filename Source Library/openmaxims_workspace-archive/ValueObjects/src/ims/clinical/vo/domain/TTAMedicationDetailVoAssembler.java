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
 * @author Catalin Tomozei
 */
public class TTAMedicationDetailVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.TTAMedicationDetailVo copy(ims.clinical.vo.TTAMedicationDetailVo valueObjectDest, ims.clinical.vo.TTAMedicationDetailVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_TTAMedicationDetail(valueObjectSrc.getID_TTAMedicationDetail());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// DurationValue
		valueObjectDest.setDurationValue(valueObjectSrc.getDurationValue());
		// DurationUnit
		valueObjectDest.setDurationUnit(valueObjectSrc.getDurationUnit());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// ClinicalCommentsForPharmacy
		valueObjectDest.setClinicalCommentsForPharmacy(valueObjectSrc.getClinicalCommentsForPharmacy());
		// MedicationInstructionsForPatient
		valueObjectDest.setMedicationInstructionsForPatient(valueObjectSrc.getMedicationInstructionsForPatient());
		// PrescriberContacted
		valueObjectDest.setPrescriberContacted(valueObjectSrc.getPrescriberContacted());
		// UnitText
		valueObjectDest.setUnitText(valueObjectSrc.getUnitText());
		// OtherMedicationText
		valueObjectDest.setOtherMedicationText(valueObjectSrc.getOtherMedicationText());
		// DoseValue
		valueObjectDest.setDoseValue(valueObjectSrc.getDoseValue());
		// DoseUnit
		valueObjectDest.setDoseUnit(valueObjectSrc.getDoseUnit());
		// Form
		valueObjectDest.setForm(valueObjectSrc.getForm());
		// Route
		valueObjectDest.setRoute(valueObjectSrc.getRoute());
		// FrequencyValue
		valueObjectDest.setFrequencyValue(valueObjectSrc.getFrequencyValue());
		// FrequencyUnit
		valueObjectDest.setFrequencyUnit(valueObjectSrc.getFrequencyUnit());
		// CommencedDate
		valueObjectDest.setCommencedDate(valueObjectSrc.getCommencedDate());
		// Medication
		valueObjectDest.setMedication(valueObjectSrc.getMedication());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTTAMedicationDetailVoCollectionFromTTAMedicationDetail(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.edischarge.domain.objects.TTAMedicationDetail objects.
	 */
	public static ims.clinical.vo.TTAMedicationDetailVoCollection createTTAMedicationDetailVoCollectionFromTTAMedicationDetail(java.util.Set domainObjectSet)	
	{
		return createTTAMedicationDetailVoCollectionFromTTAMedicationDetail(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.edischarge.domain.objects.TTAMedicationDetail objects.
	 */
	public static ims.clinical.vo.TTAMedicationDetailVoCollection createTTAMedicationDetailVoCollectionFromTTAMedicationDetail(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.TTAMedicationDetailVoCollection voList = new ims.clinical.vo.TTAMedicationDetailVoCollection();
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
			ims.clinical.vo.TTAMedicationDetailVo vo = create(map, domainObject);
			
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
	public static ims.clinical.vo.TTAMedicationDetailVoCollection createTTAMedicationDetailVoCollectionFromTTAMedicationDetail(java.util.List domainObjectList) 
	{
		return createTTAMedicationDetailVoCollectionFromTTAMedicationDetail(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.edischarge.domain.objects.TTAMedicationDetail objects.
	 */
	public static ims.clinical.vo.TTAMedicationDetailVoCollection createTTAMedicationDetailVoCollectionFromTTAMedicationDetail(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.TTAMedicationDetailVoCollection voList = new ims.clinical.vo.TTAMedicationDetailVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.edischarge.domain.objects.TTAMedicationDetail domainObject = (ims.edischarge.domain.objects.TTAMedicationDetail) domainObjectList.get(i);
			ims.clinical.vo.TTAMedicationDetailVo vo = create(map, domainObject);

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
	 public static java.util.Set extractTTAMedicationDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TTAMedicationDetailVoCollection voCollection) 
	 {
	 	return extractTTAMedicationDetailSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTTAMedicationDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TTAMedicationDetailVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.TTAMedicationDetailVo vo = voCollection.get(i);
			ims.edischarge.domain.objects.TTAMedicationDetail domainObject = TTAMedicationDetailVoAssembler.extractTTAMedicationDetail(domainFactory, vo, domMap);

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
	 public static java.util.List extractTTAMedicationDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TTAMedicationDetailVoCollection voCollection) 
	 {
	 	return extractTTAMedicationDetailList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTTAMedicationDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TTAMedicationDetailVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.TTAMedicationDetailVo vo = voCollection.get(i);
			ims.edischarge.domain.objects.TTAMedicationDetail domainObject = TTAMedicationDetailVoAssembler.extractTTAMedicationDetail(domainFactory, vo, domMap);

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
	 public static ims.clinical.vo.TTAMedicationDetailVo create(ims.edischarge.domain.objects.TTAMedicationDetail domainObject) 
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
	  public static ims.clinical.vo.TTAMedicationDetailVo create(DomainObjectMap map, ims.edischarge.domain.objects.TTAMedicationDetail domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.TTAMedicationDetailVo valueObject = (ims.clinical.vo.TTAMedicationDetailVo) map.getValueObject(domainObject, ims.clinical.vo.TTAMedicationDetailVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.TTAMedicationDetailVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.clinical.vo.TTAMedicationDetailVo insert(ims.clinical.vo.TTAMedicationDetailVo valueObject, ims.edischarge.domain.objects.TTAMedicationDetail domainObject) 
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
	 public static ims.clinical.vo.TTAMedicationDetailVo insert(DomainObjectMap map, ims.clinical.vo.TTAMedicationDetailVo valueObject, ims.edischarge.domain.objects.TTAMedicationDetail domainObject) 
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
			
		// DurationValue
		valueObject.setDurationValue(domainObject.getDurationValue());
		// DurationUnit
		ims.domain.lookups.LookupInstance instance2 = domainObject.getDurationUnit();
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

			ims.clinical.vo.lookups.MedicationDuration voLookup2 = new ims.clinical.vo.lookups.MedicationDuration(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.clinical.vo.lookups.MedicationDuration parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.clinical.vo.lookups.MedicationDuration(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setDurationUnit(voLookup2);
		}
				// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// ClinicalCommentsForPharmacy
		valueObject.setClinicalCommentsForPharmacy(domainObject.getClinicalCommentsForPharmacy());
		// MedicationInstructionsForPatient
		valueObject.setMedicationInstructionsForPatient(domainObject.getMedicationInstructionsForPatient());
		// PrescriberContacted
		valueObject.setPrescriberContacted( domainObject.isPrescriberContacted() );
		// UnitText
		valueObject.setUnitText(domainObject.getUnitText());
		// OtherMedicationText
		valueObject.setOtherMedicationText(domainObject.getOtherMedicationText());
		// DoseValue
		valueObject.setDoseValue(domainObject.getDoseValue());
		// DoseUnit
		ims.domain.lookups.LookupInstance instance10 = domainObject.getDoseUnit();
		if ( null != instance10 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance10.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance10.getImage().getImageId(), instance10.getImage().getImagePath());
			}
			color = instance10.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.MedicationDoseUnit voLookup10 = new ims.core.vo.lookups.MedicationDoseUnit(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.MedicationDoseUnit parentVoLookup10 = voLookup10;
			ims.domain.lookups.LookupInstance parent10 = instance10.getParent();
			while (parent10 != null)
			{
				if (parent10.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent10.getImage().getImageId(), parent10.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent10.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup10.setParent(new ims.core.vo.lookups.MedicationDoseUnit(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setDoseUnit(voLookup10);
		}
				// Form
		ims.domain.lookups.LookupInstance instance11 = domainObject.getForm();
		if ( null != instance11 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance11.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance11.getImage().getImageId(), instance11.getImage().getImagePath());
			}
			color = instance11.getColor();
			if (color != null) 
				color.getValue();

			ims.clinical.vo.lookups.DoseFormIndicator voLookup11 = new ims.clinical.vo.lookups.DoseFormIndicator(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.clinical.vo.lookups.DoseFormIndicator parentVoLookup11 = voLookup11;
			ims.domain.lookups.LookupInstance parent11 = instance11.getParent();
			while (parent11 != null)
			{
				if (parent11.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent11.getImage().getImageId(), parent11.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent11.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup11.setParent(new ims.clinical.vo.lookups.DoseFormIndicator(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setForm(voLookup11);
		}
				// Route
		ims.domain.lookups.LookupInstance instance12 = domainObject.getRoute();
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

			ims.core.vo.lookups.MedicationRoute voLookup12 = new ims.core.vo.lookups.MedicationRoute(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.core.vo.lookups.MedicationRoute parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.core.vo.lookups.MedicationRoute(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setRoute(voLookup12);
		}
				// FrequencyValue
		valueObject.setFrequencyValue(domainObject.getFrequencyValue());
		// FrequencyUnit
		ims.domain.lookups.LookupInstance instance14 = domainObject.getFrequencyUnit();
		if ( null != instance14 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance14.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance14.getImage().getImageId(), instance14.getImage().getImagePath());
			}
			color = instance14.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.MedicationFrequency voLookup14 = new ims.core.vo.lookups.MedicationFrequency(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.core.vo.lookups.MedicationFrequency parentVoLookup14 = voLookup14;
			ims.domain.lookups.LookupInstance parent14 = instance14.getParent();
			while (parent14 != null)
			{
				if (parent14.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent14.getImage().getImageId(), parent14.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent14.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup14.setParent(new ims.core.vo.lookups.MedicationFrequency(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setFrequencyUnit(voLookup14);
		}
				// CommencedDate
		java.util.Date CommencedDate = domainObject.getCommencedDate();
		if ( null != CommencedDate ) 
		{
			valueObject.setCommencedDate(new ims.framework.utils.Date(CommencedDate) );
		}
		// Medication
		valueObject.setMedication(ims.core.vo.domain.MedicationLiteVoAssembler.create(map, domainObject.getMedication()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.edischarge.domain.objects.TTAMedicationDetail extractTTAMedicationDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TTAMedicationDetailVo valueObject) 
	{
		return 	extractTTAMedicationDetail(domainFactory, valueObject, new HashMap());
	}

	public static ims.edischarge.domain.objects.TTAMedicationDetail extractTTAMedicationDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TTAMedicationDetailVo valueObject, HashMap domMap) 
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
			// ims.clinical.vo.TTAMedicationDetailVo ID_TTAMedicationDetail field is unknown
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

		domainObject.setDurationValue(valueObject.getDurationValue());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getDurationUnit() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getDurationUnit().getID());
		}
		domainObject.setDurationUnit(value2);
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getClinicalCommentsForPharmacy() != null && valueObject.getClinicalCommentsForPharmacy().equals(""))
		{
			valueObject.setClinicalCommentsForPharmacy(null);
		}
		domainObject.setClinicalCommentsForPharmacy(valueObject.getClinicalCommentsForPharmacy());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getMedicationInstructionsForPatient() != null && valueObject.getMedicationInstructionsForPatient().equals(""))
		{
			valueObject.setMedicationInstructionsForPatient(null);
		}
		domainObject.setMedicationInstructionsForPatient(valueObject.getMedicationInstructionsForPatient());
		domainObject.setPrescriberContacted(valueObject.getPrescriberContacted());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getUnitText() != null && valueObject.getUnitText().equals(""))
		{
			valueObject.setUnitText(null);
		}
		domainObject.setUnitText(valueObject.getUnitText());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOtherMedicationText() != null && valueObject.getOtherMedicationText().equals(""))
		{
			valueObject.setOtherMedicationText(null);
		}
		domainObject.setOtherMedicationText(valueObject.getOtherMedicationText());
		domainObject.setDoseValue(valueObject.getDoseValue());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getDoseUnit() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getDoseUnit().getID());
		}
		domainObject.setDoseUnit(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getForm() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getForm().getID());
		}
		domainObject.setForm(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getRoute() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getRoute().getID());
		}
		domainObject.setRoute(value12);
		domainObject.setFrequencyValue(valueObject.getFrequencyValue());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getFrequencyUnit() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getFrequencyUnit().getID());
		}
		domainObject.setFrequencyUnit(value14);
		java.util.Date value15 = null;
		ims.framework.utils.Date date15 = valueObject.getCommencedDate();		
		if ( date15 != null ) 
		{
			value15 = date15.getDate();
		}
		domainObject.setCommencedDate(value15);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Medication value16 = null;
		if ( null != valueObject.getMedication() ) 
		{
			if (valueObject.getMedication().getBoId() == null)
			{
				if (domMap.get(valueObject.getMedication()) != null)
				{
					value16 = (ims.core.clinical.domain.objects.Medication)domMap.get(valueObject.getMedication());
				}
			}
			else
			{
				value16 = (ims.core.clinical.domain.objects.Medication)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Medication.class, valueObject.getMedication().getBoId());
			}
		}
		domainObject.setMedication(value16);

		return domainObject;
	}

}
