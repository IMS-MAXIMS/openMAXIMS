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
public class MedicationDoseAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.MedicationDose copy(ims.core.vo.MedicationDose valueObjectDest, ims.core.vo.MedicationDose valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientMedicationDose(valueObjectSrc.getID_PatientMedicationDose());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Dose
		valueObjectDest.setDose(valueObjectSrc.getDose());
		// WhenTaken
		valueObjectDest.setWhenTaken(valueObjectSrc.getWhenTaken());
		// AdminRoute
		valueObjectDest.setAdminRoute(valueObjectSrc.getAdminRoute());
		// Duration
		valueObjectDest.setDuration(valueObjectSrc.getDuration());
		// DurationUnits
		valueObjectDest.setDurationUnits(valueObjectSrc.getDurationUnits());
		// DoseUnit
		valueObjectDest.setDoseUnit(valueObjectSrc.getDoseUnit());
		// AdminTimes
		valueObjectDest.setAdminTimes(valueObjectSrc.getAdminTimes());
		// DoseStartHcp
		valueObjectDest.setDoseStartHcp(valueObjectSrc.getDoseStartHcp());
		// DoseStartDate
		valueObjectDest.setDoseStartDate(valueObjectSrc.getDoseStartDate());
		// isStopped
		valueObjectDest.setIsStopped(valueObjectSrc.getIsStopped());
		// isStoppedDate
		valueObjectDest.setIsStoppedDate(valueObjectSrc.getIsStoppedDate());
		// isStoppedHcp
		valueObjectDest.setIsStoppedHcp(valueObjectSrc.getIsStoppedHcp());
		// isStoppedReason
		valueObjectDest.setIsStoppedReason(valueObjectSrc.getIsStoppedReason());
		// isStoppedReasonText
		valueObjectDest.setIsStoppedReasonText(valueObjectSrc.getIsStoppedReasonText());
		// isCopied
		valueObjectDest.setIsCopied(valueObjectSrc.getIsCopied());
		// CommencedByType
		valueObjectDest.setCommencedByType(valueObjectSrc.getCommencedByType());
		// StoppedByType
		valueObjectDest.setStoppedByType(valueObjectSrc.getStoppedByType());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createMedicationDoseCollectionFromPatientMedicationDose(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientMedicationDose objects.
	 */
	public static ims.core.vo.MedicationDoseCollection createMedicationDoseCollectionFromPatientMedicationDose(java.util.Set domainObjectSet)	
	{
		return createMedicationDoseCollectionFromPatientMedicationDose(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientMedicationDose objects.
	 */
	public static ims.core.vo.MedicationDoseCollection createMedicationDoseCollectionFromPatientMedicationDose(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.MedicationDoseCollection voList = new ims.core.vo.MedicationDoseCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.PatientMedicationDose domainObject = (ims.core.clinical.domain.objects.PatientMedicationDose) iterator.next();
			ims.core.vo.MedicationDose vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientMedicationDose objects.
	 */
	public static ims.core.vo.MedicationDoseCollection createMedicationDoseCollectionFromPatientMedicationDose(java.util.List domainObjectList) 
	{
		return createMedicationDoseCollectionFromPatientMedicationDose(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientMedicationDose objects.
	 */
	public static ims.core.vo.MedicationDoseCollection createMedicationDoseCollectionFromPatientMedicationDose(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.MedicationDoseCollection voList = new ims.core.vo.MedicationDoseCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.PatientMedicationDose domainObject = (ims.core.clinical.domain.objects.PatientMedicationDose) domainObjectList.get(i);
			ims.core.vo.MedicationDose vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.PatientMedicationDose set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientMedicationDoseSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MedicationDoseCollection voCollection) 
	 {
	 	return extractPatientMedicationDoseSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientMedicationDoseSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MedicationDoseCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.MedicationDose vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientMedicationDose domainObject = MedicationDoseAssembler.extractPatientMedicationDose(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.PatientMedicationDose list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientMedicationDoseList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MedicationDoseCollection voCollection) 
	 {
	 	return extractPatientMedicationDoseList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientMedicationDoseList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MedicationDoseCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.MedicationDose vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientMedicationDose domainObject = MedicationDoseAssembler.extractPatientMedicationDose(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.PatientMedicationDose object.
	 * @param domainObject ims.core.clinical.domain.objects.PatientMedicationDose
	 */
	 public static ims.core.vo.MedicationDose create(ims.core.clinical.domain.objects.PatientMedicationDose domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.PatientMedicationDose object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.MedicationDose create(DomainObjectMap map, ims.core.clinical.domain.objects.PatientMedicationDose domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.MedicationDose valueObject = (ims.core.vo.MedicationDose) map.getValueObject(domainObject, ims.core.vo.MedicationDose.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.MedicationDose(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.PatientMedicationDose
	 */
	 public static ims.core.vo.MedicationDose insert(ims.core.vo.MedicationDose valueObject, ims.core.clinical.domain.objects.PatientMedicationDose domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.PatientMedicationDose
	 */
	 public static ims.core.vo.MedicationDose insert(DomainObjectMap map, ims.core.vo.MedicationDose valueObject, ims.core.clinical.domain.objects.PatientMedicationDose domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientMedicationDose(domainObject.getId());
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
			
		// Dose
		valueObject.setDose(domainObject.getDose());
		// WhenTaken
		valueObject.setWhenTaken(domainObject.getWhenTaken());
		// AdminRoute
		ims.domain.lookups.LookupInstance instance3 = domainObject.getAdminRoute();
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

			ims.core.vo.lookups.MedicationRoute voLookup3 = new ims.core.vo.lookups.MedicationRoute(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.MedicationRoute parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.MedicationRoute(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setAdminRoute(voLookup3);
		}
				// Duration
		valueObject.setDuration(domainObject.getDuration());
		// DurationUnits
		ims.domain.lookups.LookupInstance instance5 = domainObject.getDurationUnits();
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

			ims.core.vo.lookups.TimeUnitsSecondsToMonths voLookup5 = new ims.core.vo.lookups.TimeUnitsSecondsToMonths(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.TimeUnitsSecondsToMonths parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.TimeUnitsSecondsToMonths(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setDurationUnits(voLookup5);
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
				// AdminTimes
		java.util.List listAdminTimes = domainObject.getAdminTimes();
		ims.core.vo.lookups.MedicationTimesOfAdministrationCollection AdminTimes = new ims.core.vo.lookups.MedicationTimesOfAdministrationCollection();
		for(java.util.Iterator iterator = listAdminTimes.iterator(); iterator.hasNext(); ) 
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
			ims.core.vo.lookups.MedicationTimesOfAdministration voInstance = new ims.core.vo.lookups.MedicationTimesOfAdministration(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.core.vo.lookups.MedicationTimesOfAdministration parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.core.vo.lookups.MedicationTimesOfAdministration(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			AdminTimes.add(voInstance);
		}
		valueObject.setAdminTimes( AdminTimes );
		// DoseStartHcp
		valueObject.setDoseStartHcp(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getDoseStartHcp()) );
		// DoseStartDate
		java.util.Date DoseStartDate = domainObject.getDoseStartDate();
		if ( null != DoseStartDate ) 
		{
			valueObject.setDoseStartDate(new ims.framework.utils.Date(DoseStartDate) );
		}
		// isStopped
		valueObject.setIsStopped( domainObject.isIsStopped() );
		// isStoppedDate
		java.util.Date isStoppedDate = domainObject.getIsStoppedDate();
		if ( null != isStoppedDate ) 
		{
			valueObject.setIsStoppedDate(new ims.framework.utils.Date(isStoppedDate) );
		}
		// isStoppedHcp
		valueObject.setIsStoppedHcp(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getIsStoppedHcp()) );
		// isStoppedReason
		ims.domain.lookups.LookupInstance instance13 = domainObject.getIsStoppedReason();
		if ( null != instance13 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance13.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance13.getImage().getImageId(), instance13.getImage().getImagePath());
			}
			color = instance13.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.MedicationDoseReasonStopped voLookup13 = new ims.core.vo.lookups.MedicationDoseReasonStopped(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.core.vo.lookups.MedicationDoseReasonStopped parentVoLookup13 = voLookup13;
			ims.domain.lookups.LookupInstance parent13 = instance13.getParent();
			while (parent13 != null)
			{
				if (parent13.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent13.getImage().getImageId(), parent13.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent13.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup13.setParent(new ims.core.vo.lookups.MedicationDoseReasonStopped(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setIsStoppedReason(voLookup13);
		}
				// isStoppedReasonText
		valueObject.setIsStoppedReasonText(domainObject.getIsStoppedReasonText());
		// isCopied
		valueObject.setIsCopied( domainObject.isIsCopied() );
		// CommencedByType
		ims.domain.lookups.LookupInstance instance16 = domainObject.getCommencedByType();
		if ( null != instance16 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance16.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance16.getImage().getImageId(), instance16.getImage().getImagePath());
			}
			color = instance16.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.MedciationCommencedDiscontinuedType voLookup16 = new ims.core.vo.lookups.MedciationCommencedDiscontinuedType(instance16.getId(),instance16.getText(), instance16.isActive(), null, img, color);
			ims.core.vo.lookups.MedciationCommencedDiscontinuedType parentVoLookup16 = voLookup16;
			ims.domain.lookups.LookupInstance parent16 = instance16.getParent();
			while (parent16 != null)
			{
				if (parent16.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent16.getImage().getImageId(), parent16.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent16.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup16.setParent(new ims.core.vo.lookups.MedciationCommencedDiscontinuedType(parent16.getId(),parent16.getText(), parent16.isActive(), null, img, color));
				parentVoLookup16 = parentVoLookup16.getParent();
								parent16 = parent16.getParent();
			}			
			valueObject.setCommencedByType(voLookup16);
		}
				// StoppedByType
		ims.domain.lookups.LookupInstance instance17 = domainObject.getStoppedByType();
		if ( null != instance17 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance17.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance17.getImage().getImageId(), instance17.getImage().getImagePath());
			}
			color = instance17.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.MedciationCommencedDiscontinuedType voLookup17 = new ims.core.vo.lookups.MedciationCommencedDiscontinuedType(instance17.getId(),instance17.getText(), instance17.isActive(), null, img, color);
			ims.core.vo.lookups.MedciationCommencedDiscontinuedType parentVoLookup17 = voLookup17;
			ims.domain.lookups.LookupInstance parent17 = instance17.getParent();
			while (parent17 != null)
			{
				if (parent17.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent17.getImage().getImageId(), parent17.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent17.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup17.setParent(new ims.core.vo.lookups.MedciationCommencedDiscontinuedType(parent17.getId(),parent17.getText(), parent17.isActive(), null, img, color));
				parentVoLookup17 = parentVoLookup17.getParent();
								parent17 = parent17.getParent();
			}			
			valueObject.setStoppedByType(voLookup17);
		}
				// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.PatientMedicationDose extractPatientMedicationDose(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MedicationDose valueObject) 
	{
		return 	extractPatientMedicationDose(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.PatientMedicationDose extractPatientMedicationDose(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MedicationDose valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientMedicationDose();
		ims.core.clinical.domain.objects.PatientMedicationDose domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.PatientMedicationDose)domMap.get(valueObject);
			}
			// ims.core.vo.MedicationDose ID_PatientMedicationDose field is unknown
			domainObject = new ims.core.clinical.domain.objects.PatientMedicationDose();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientMedicationDose());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.PatientMedicationDose)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.PatientMedicationDose) domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientMedicationDose.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientMedicationDose());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDose() != null && valueObject.getDose().equals(""))
		{
			valueObject.setDose(null);
		}
		domainObject.setDose(valueObject.getDose());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getWhenTaken() != null && valueObject.getWhenTaken().equals(""))
		{
			valueObject.setWhenTaken(null);
		}
		domainObject.setWhenTaken(valueObject.getWhenTaken());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getAdminRoute() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getAdminRoute().getID());
		}
		domainObject.setAdminRoute(value3);
		domainObject.setDuration(valueObject.getDuration());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getDurationUnits() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getDurationUnits().getID());
		}
		domainObject.setDurationUnits(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getDoseUnit() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getDoseUnit().getID());
		}
		domainObject.setDoseUnit(value6);
		ims.core.vo.lookups.MedicationTimesOfAdministrationCollection collection7 =
	valueObject.getAdminTimes();
	    java.util.List domainAdminTimes = domainObject.getAdminTimes();;			
	    int collection7Size=0;
		if (collection7 == null)
		{
			domainAdminTimes = new java.util.ArrayList(0);
		}
		else
		{
			collection7Size = collection7.size();
		}
		
		for(int i=0; i<collection7Size; i++) 
		{
			int instanceId = collection7.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainAdminTimes.indexOf(dom);
			if (domIdx == -1)
			{
				domainAdminTimes.add(i, dom);
			}
			else if (i != domIdx && i < domainAdminTimes.size())
			{
				Object tmp = domainAdminTimes.get(i);
				domainAdminTimes.set(i, domainAdminTimes.get(domIdx));
				domainAdminTimes.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j7 = domainAdminTimes.size();
		while (j7 > collection7Size)
		{
			domainAdminTimes.remove(j7-1);
			j7 = domainAdminTimes.size();
		}

		domainObject.setAdminTimes(domainAdminTimes);		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value8 = null;
		if ( null != valueObject.getDoseStartHcp() ) 
		{
			if (valueObject.getDoseStartHcp().getBoId() == null)
			{
				if (domMap.get(valueObject.getDoseStartHcp()) != null)
				{
					value8 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getDoseStartHcp());
				}
			}
			else
			{
				value8 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getDoseStartHcp().getBoId());
			}
		}
		domainObject.setDoseStartHcp(value8);
		java.util.Date value9 = null;
		ims.framework.utils.Date date9 = valueObject.getDoseStartDate();		
		if ( date9 != null ) 
		{
			value9 = date9.getDate();
		}
		domainObject.setDoseStartDate(value9);
		domainObject.setIsStopped(valueObject.getIsStopped());
		java.util.Date value11 = null;
		ims.framework.utils.Date date11 = valueObject.getIsStoppedDate();		
		if ( date11 != null ) 
		{
			value11 = date11.getDate();
		}
		domainObject.setIsStoppedDate(value11);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value12 = null;
		if ( null != valueObject.getIsStoppedHcp() ) 
		{
			if (valueObject.getIsStoppedHcp().getBoId() == null)
			{
				if (domMap.get(valueObject.getIsStoppedHcp()) != null)
				{
					value12 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getIsStoppedHcp());
				}
			}
			else
			{
				value12 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getIsStoppedHcp().getBoId());
			}
		}
		domainObject.setIsStoppedHcp(value12);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getIsStoppedReason() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getIsStoppedReason().getID());
		}
		domainObject.setIsStoppedReason(value13);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getIsStoppedReasonText() != null && valueObject.getIsStoppedReasonText().equals(""))
		{
			valueObject.setIsStoppedReasonText(null);
		}
		domainObject.setIsStoppedReasonText(valueObject.getIsStoppedReasonText());
		domainObject.setIsCopied(valueObject.getIsCopied());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getCommencedByType() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getCommencedByType().getID());
		}
		domainObject.setCommencedByType(value16);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value17 = null;
		if ( null != valueObject.getStoppedByType() ) 
		{
			value17 =
				domainFactory.getLookupInstance(valueObject.getStoppedByType().getID());
		}
		domainObject.setStoppedByType(value17);
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));

		return domainObject;
	}

}
