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
public class PatientProcedureVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PatientProcedureVo copy(ims.core.vo.PatientProcedureVo valueObjectDest, ims.core.vo.PatientProcedureVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientProcedure(valueObjectSrc.getID_PatientProcedure());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Location
		valueObjectDest.setLocation(valueObjectSrc.getLocation());
		// Specialty
		valueObjectDest.setSpecialty(valueObjectSrc.getSpecialty());
		// ConfirmedStatus
		valueObjectDest.setConfirmedStatus(valueObjectSrc.getConfirmedStatus());
		// ConfirmedBy
		valueObjectDest.setConfirmedBy(valueObjectSrc.getConfirmedBy());
		// ConfirmedDateTime
		valueObjectDest.setConfirmedDateTime(valueObjectSrc.getConfirmedDateTime());
		// ExcludeFromOthers
		valueObjectDest.setExcludeFromOthers(valueObjectSrc.getExcludeFromOthers());
		// HCPPresent
		valueObjectDest.setHCPPresent(valueObjectSrc.getHCPPresent());
		// InsertedDevices
		valueObjectDest.setInsertedDevices(valueObjectSrc.getInsertedDevices());
		// RemovedDevices
		valueObjectDest.setRemovedDevices(valueObjectSrc.getRemovedDevices());
		// ProcLocation
		valueObjectDest.setProcLocation(valueObjectSrc.getProcLocation());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// CancelledDate
		valueObjectDest.setCancelledDate(valueObjectSrc.getCancelledDate());
		// CancelledReason
		valueObjectDest.setCancelledReason(valueObjectSrc.getCancelledReason());
		// SurgeonsGrade
		valueObjectDest.setSurgeonsGrade(valueObjectSrc.getSurgeonsGrade());
		// ProcEndDate
		valueObjectDest.setProcEndDate(valueObjectSrc.getProcEndDate());
		// ProcEndTime
		valueObjectDest.setProcEndTime(valueObjectSrc.getProcEndTime());
		// SignifProc
		valueObjectDest.setSignifProc(valueObjectSrc.getSignifProc());
		// IntraOperativeRecord
		valueObjectDest.setIntraOperativeRecord(valueObjectSrc.getIntraOperativeRecord());
		// Notes
		valueObjectDest.setNotes(valueObjectSrc.getNotes());
		// SysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
		// ProcedureUrgency
		valueObjectDest.setProcedureUrgency(valueObjectSrc.getProcedureUrgency());
		// ProcedureOutcome
		valueObjectDest.setProcedureOutcome(valueObjectSrc.getProcedureOutcome());
		// DatePlanned
		valueObjectDest.setDatePlanned(valueObjectSrc.getDatePlanned());
		// PlannedProc
		valueObjectDest.setPlannedProc(valueObjectSrc.getPlannedProc());
		// ProcSite
		valueObjectDest.setProcSite(valueObjectSrc.getProcSite());
		// PeformedBy
		valueObjectDest.setPeformedBy(valueObjectSrc.getPeformedBy());
		// ProcedureIntent
		valueObjectDest.setProcedureIntent(valueObjectSrc.getProcedureIntent());
		// Procedure
		valueObjectDest.setProcedure(valueObjectSrc.getProcedure());
		// ProcedureDescription
		valueObjectDest.setProcedureDescription(valueObjectSrc.getProcedureDescription());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// InfoSource
		valueObjectDest.setInfoSource(valueObjectSrc.getInfoSource());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// ProcDate
		valueObjectDest.setProcDate(valueObjectSrc.getProcDate());
		// includeInDischargeLetter
		valueObjectDest.setIncludeInDischargeLetter(valueObjectSrc.getIncludeInDischargeLetter());
		// SiteText
		valueObjectDest.setSiteText(valueObjectSrc.getSiteText());
		// ProcLaterality
		valueObjectDest.setProcLaterality(valueObjectSrc.getProcLaterality());
		// ProcedureStatus
		valueObjectDest.setProcedureStatus(valueObjectSrc.getProcedureStatus());
		// ProcTime
		valueObjectDest.setProcTime(valueObjectSrc.getProcTime());
		// EpisodeOfCare
		valueObjectDest.setEpisodeOfCare(valueObjectSrc.getEpisodeOfCare());
		// isPrimary
		valueObjectDest.setIsPrimary(valueObjectSrc.getIsPrimary());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientProcedureVoCollectionFromPatientProcedure(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientProcedure objects.
	 */
	public static ims.core.vo.PatientProcedureVoCollection createPatientProcedureVoCollectionFromPatientProcedure(java.util.Set domainObjectSet)	
	{
		return createPatientProcedureVoCollectionFromPatientProcedure(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientProcedure objects.
	 */
	public static ims.core.vo.PatientProcedureVoCollection createPatientProcedureVoCollectionFromPatientProcedure(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatientProcedureVoCollection voList = new ims.core.vo.PatientProcedureVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.PatientProcedure domainObject = (ims.core.clinical.domain.objects.PatientProcedure) iterator.next();
			ims.core.vo.PatientProcedureVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientProcedure objects.
	 */
	public static ims.core.vo.PatientProcedureVoCollection createPatientProcedureVoCollectionFromPatientProcedure(java.util.List domainObjectList) 
	{
		return createPatientProcedureVoCollectionFromPatientProcedure(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientProcedure objects.
	 */
	public static ims.core.vo.PatientProcedureVoCollection createPatientProcedureVoCollectionFromPatientProcedure(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatientProcedureVoCollection voList = new ims.core.vo.PatientProcedureVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.PatientProcedure domainObject = (ims.core.clinical.domain.objects.PatientProcedure) domainObjectList.get(i);
			ims.core.vo.PatientProcedureVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.PatientProcedure set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientProcedureSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientProcedureVoCollection voCollection) 
	 {
	 	return extractPatientProcedureSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientProcedureSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientProcedureVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientProcedureVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientProcedure domainObject = PatientProcedureVoAssembler.extractPatientProcedure(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.PatientProcedure list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientProcedureList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientProcedureVoCollection voCollection) 
	 {
	 	return extractPatientProcedureList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientProcedureList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientProcedureVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientProcedureVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientProcedure domainObject = PatientProcedureVoAssembler.extractPatientProcedure(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.PatientProcedure object.
	 * @param domainObject ims.core.clinical.domain.objects.PatientProcedure
	 */
	 public static ims.core.vo.PatientProcedureVo create(ims.core.clinical.domain.objects.PatientProcedure domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.PatientProcedure object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PatientProcedureVo create(DomainObjectMap map, ims.core.clinical.domain.objects.PatientProcedure domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PatientProcedureVo valueObject = (ims.core.vo.PatientProcedureVo) map.getValueObject(domainObject, ims.core.vo.PatientProcedureVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PatientProcedureVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.PatientProcedure
	 */
	 public static ims.core.vo.PatientProcedureVo insert(ims.core.vo.PatientProcedureVo valueObject, ims.core.clinical.domain.objects.PatientProcedure domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.PatientProcedure
	 */
	 public static ims.core.vo.PatientProcedureVo insert(DomainObjectMap map, ims.core.vo.PatientProcedureVo valueObject, ims.core.clinical.domain.objects.PatientProcedure domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientProcedure(domainObject.getId());
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
			
		// Location
		valueObject.setLocation(domainObject.getLocation());
		// Specialty
		ims.domain.lookups.LookupInstance instance2 = domainObject.getSpecialty();
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

			ims.core.vo.lookups.Specialty voLookup2 = new ims.core.vo.lookups.Specialty(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.Specialty(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setSpecialty(voLookup2);
		}
				// ConfirmedStatus
		ims.domain.lookups.LookupInstance instance3 = domainObject.getConfirmedStatus();
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

			ims.core.vo.lookups.ConfirmedStatus voLookup3 = new ims.core.vo.lookups.ConfirmedStatus(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.ConfirmedStatus parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.ConfirmedStatus(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setConfirmedStatus(voLookup3);
		}
				// ConfirmedBy
		valueObject.setConfirmedBy(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getConfirmedBy()) );
		// ConfirmedDateTime
		java.util.Date ConfirmedDateTime = domainObject.getConfirmedDateTime();
		if ( null != ConfirmedDateTime ) 
		{
			valueObject.setConfirmedDateTime(new ims.framework.utils.DateTime(ConfirmedDateTime) );
		}
		// ExcludeFromOthers
		valueObject.setExcludeFromOthers( domainObject.isExcludeFromOthers() );
		// HCPPresent
		valueObject.setHCPPresent(ims.core.vo.domain.HcpLiteVoAssembler.createHcpLiteVoCollectionFromHcp(map, domainObject.getHCPPresent()) );
		// InsertedDevices
		valueObject.setInsertedDevices(ims.core.vo.domain.PatientCharacteristicVoAssembler.createPatientCharacteristicVoCollectionFromPatientCharacteristic(map, domainObject.getInsertedDevices()) );
		// RemovedDevices
		valueObject.setRemovedDevices(ims.core.vo.domain.PatientCharacteristicVoAssembler.createPatientCharacteristicVoCollectionFromPatientCharacteristic(map, domainObject.getRemovedDevices()) );
		// ProcLocation
		ims.domain.lookups.LookupInstance instance10 = domainObject.getProcLocation();
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

			ims.core.vo.lookups.ProcedureLocation voLookup10 = new ims.core.vo.lookups.ProcedureLocation(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.ProcedureLocation parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.core.vo.lookups.ProcedureLocation(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setProcLocation(voLookup10);
		}
				// ClinicalContact
		valueObject.setClinicalContact(ims.core.vo.domain.ClinicalContactShortVoAssembler.create(map, domainObject.getClinicalContact()) );
		// CancelledDate
		java.util.Date CancelledDate = domainObject.getCancelledDate();
		if ( null != CancelledDate ) 
		{
			valueObject.setCancelledDate(new ims.framework.utils.Date(CancelledDate) );
		}
		// CancelledReason
		valueObject.setCancelledReason(domainObject.getCancelledReason());
		// SurgeonsGrade
		ims.domain.lookups.LookupInstance instance14 = domainObject.getSurgeonsGrade();
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

			ims.core.vo.lookups.MedicGrade voLookup14 = new ims.core.vo.lookups.MedicGrade(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.core.vo.lookups.MedicGrade parentVoLookup14 = voLookup14;
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
								parentVoLookup14.setParent(new ims.core.vo.lookups.MedicGrade(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setSurgeonsGrade(voLookup14);
		}
				// ProcEndDate
		Integer ProcEndDate = domainObject.getProcEndDate();
		if ( null != ProcEndDate ) 
		{
			valueObject.setProcEndDate(new ims.framework.utils.PartialDate(ProcEndDate) );
		}
		// ProcEndTime
		String ProcEndTime = domainObject.getProcEndTime();
		if ( null != ProcEndTime ) 
		{
			valueObject.setProcEndTime(new ims.framework.utils.Time(ProcEndTime) );
		}
		// SignifProc
		valueObject.setSignifProc( domainObject.isSignifProc() );
		// IntraOperativeRecord
		valueObject.setIntraOperativeRecord(ims.clinical.vo.domain.IntraOperativeCareRecordMinVoAssembler.create(map, domainObject.getIntraOperativeRecord()) );
		// Notes
		valueObject.setNotes(domainObject.getNotes());
		// SysInfo
		// set system information
		valueObject.setSysInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// ProcedureUrgency
		ims.domain.lookups.LookupInstance instance21 = domainObject.getProcedureUrgency();
		if ( null != instance21 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance21.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance21.getImage().getImageId(), instance21.getImage().getImagePath());
			}
			color = instance21.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.ProcedureUrgency voLookup21 = new ims.core.vo.lookups.ProcedureUrgency(instance21.getId(),instance21.getText(), instance21.isActive(), null, img, color);
			ims.core.vo.lookups.ProcedureUrgency parentVoLookup21 = voLookup21;
			ims.domain.lookups.LookupInstance parent21 = instance21.getParent();
			while (parent21 != null)
			{
				if (parent21.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent21.getImage().getImageId(), parent21.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent21.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup21.setParent(new ims.core.vo.lookups.ProcedureUrgency(parent21.getId(),parent21.getText(), parent21.isActive(), null, img, color));
				parentVoLookup21 = parentVoLookup21.getParent();
								parent21 = parent21.getParent();
			}			
			valueObject.setProcedureUrgency(voLookup21);
		}
				// ProcedureOutcome
		ims.domain.lookups.LookupInstance instance22 = domainObject.getProcedureOutcome();
		if ( null != instance22 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance22.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance22.getImage().getImageId(), instance22.getImage().getImagePath());
			}
			color = instance22.getColor();
			if (color != null) 
				color.getValue();

			ims.clinical.vo.lookups.PatientProcedureOutcome voLookup22 = new ims.clinical.vo.lookups.PatientProcedureOutcome(instance22.getId(),instance22.getText(), instance22.isActive(), null, img, color);
			ims.clinical.vo.lookups.PatientProcedureOutcome parentVoLookup22 = voLookup22;
			ims.domain.lookups.LookupInstance parent22 = instance22.getParent();
			while (parent22 != null)
			{
				if (parent22.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent22.getImage().getImageId(), parent22.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent22.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup22.setParent(new ims.clinical.vo.lookups.PatientProcedureOutcome(parent22.getId(),parent22.getText(), parent22.isActive(), null, img, color));
				parentVoLookup22 = parentVoLookup22.getParent();
								parent22 = parent22.getParent();
			}			
			valueObject.setProcedureOutcome(voLookup22);
		}
				// DatePlanned
		Integer DatePlanned = domainObject.getDatePlanned();
		if ( null != DatePlanned ) 
		{
			valueObject.setDatePlanned(new ims.framework.utils.PartialDate(DatePlanned) );
		}
		// PlannedProc
		if (domainObject.getPlannedProc() != null)
		{
			if(domainObject.getPlannedProc() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPlannedProc();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPlannedProc(new ims.core.clinical.vo.PatientProcedureRefVo(id, -1));				
			}
			else
			{
				valueObject.setPlannedProc(new ims.core.clinical.vo.PatientProcedureRefVo(domainObject.getPlannedProc().getId(), domainObject.getPlannedProc().getVersion()));
			}
		}
		// ProcSite
		ims.domain.lookups.LookupInstance instance25 = domainObject.getProcSite();
		if ( null != instance25 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance25.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance25.getImage().getImageId(), instance25.getImage().getImagePath());
			}
			color = instance25.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.MedicalHistoryProcedureSite voLookup25 = new ims.core.vo.lookups.MedicalHistoryProcedureSite(instance25.getId(),instance25.getText(), instance25.isActive(), null, img, color);
			ims.core.vo.lookups.MedicalHistoryProcedureSite parentVoLookup25 = voLookup25;
			ims.domain.lookups.LookupInstance parent25 = instance25.getParent();
			while (parent25 != null)
			{
				if (parent25.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent25.getImage().getImageId(), parent25.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent25.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup25.setParent(new ims.core.vo.lookups.MedicalHistoryProcedureSite(parent25.getId(),parent25.getText(), parent25.isActive(), null, img, color));
				parentVoLookup25 = parentVoLookup25.getParent();
								parent25 = parent25.getParent();
			}			
			valueObject.setProcSite(voLookup25);
		}
				// PeformedBy
		valueObject.setPeformedBy((ims.core.vo.HcpLiteVo)ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getPeformedBy()) );
		// ProcedureIntent
		ims.domain.lookups.LookupInstance instance27 = domainObject.getProcedureIntent();
		if ( null != instance27 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance27.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance27.getImage().getImageId(), instance27.getImage().getImagePath());
			}
			color = instance27.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.ProcedureIntent voLookup27 = new ims.core.vo.lookups.ProcedureIntent(instance27.getId(),instance27.getText(), instance27.isActive(), null, img, color);
			ims.core.vo.lookups.ProcedureIntent parentVoLookup27 = voLookup27;
			ims.domain.lookups.LookupInstance parent27 = instance27.getParent();
			while (parent27 != null)
			{
				if (parent27.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent27.getImage().getImageId(), parent27.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent27.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup27.setParent(new ims.core.vo.lookups.ProcedureIntent(parent27.getId(),parent27.getText(), parent27.isActive(), null, img, color));
				parentVoLookup27 = parentVoLookup27.getParent();
								parent27 = parent27.getParent();
			}			
			valueObject.setProcedureIntent(voLookup27);
		}
				// Procedure
		valueObject.setProcedure(ims.core.vo.domain.ProcedureLiteVoAssembler.create(map, domainObject.getProcedure()) );
		// ProcedureDescription
		valueObject.setProcedureDescription(domainObject.getProcedureDescription());
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// InfoSource
		ims.domain.lookups.LookupInstance instance31 = domainObject.getInfoSource();
		if ( null != instance31 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance31.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance31.getImage().getImageId(), instance31.getImage().getImagePath());
			}
			color = instance31.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.SourceofInformation voLookup31 = new ims.core.vo.lookups.SourceofInformation(instance31.getId(),instance31.getText(), instance31.isActive(), null, img, color);
			ims.core.vo.lookups.SourceofInformation parentVoLookup31 = voLookup31;
			ims.domain.lookups.LookupInstance parent31 = instance31.getParent();
			while (parent31 != null)
			{
				if (parent31.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent31.getImage().getImageId(), parent31.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent31.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup31.setParent(new ims.core.vo.lookups.SourceofInformation(parent31.getId(),parent31.getText(), parent31.isActive(), null, img, color));
				parentVoLookup31 = parentVoLookup31.getParent();
								parent31 = parent31.getParent();
			}			
			valueObject.setInfoSource(voLookup31);
		}
				// CareContext
		valueObject.setCareContext(ims.core.vo.domain.CareContextLiteVoAssembler.create(map, domainObject.getCareContext()) );
		// ProcDate
		Integer ProcDate = domainObject.getProcDate();
		if ( null != ProcDate ) 
		{
			valueObject.setProcDate(new ims.framework.utils.PartialDate(ProcDate) );
		}
		// includeInDischargeLetter
		valueObject.setIncludeInDischargeLetter( domainObject.isIncludeInDischargeLetter() );
		// SiteText
		valueObject.setSiteText(domainObject.getSiteText());
		// ProcLaterality
		ims.domain.lookups.LookupInstance instance36 = domainObject.getProcLaterality();
		if ( null != instance36 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance36.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance36.getImage().getImageId(), instance36.getImage().getImagePath());
			}
			color = instance36.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.LateralityLRB voLookup36 = new ims.core.vo.lookups.LateralityLRB(instance36.getId(),instance36.getText(), instance36.isActive(), null, img, color);
			ims.core.vo.lookups.LateralityLRB parentVoLookup36 = voLookup36;
			ims.domain.lookups.LookupInstance parent36 = instance36.getParent();
			while (parent36 != null)
			{
				if (parent36.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent36.getImage().getImageId(), parent36.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent36.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup36.setParent(new ims.core.vo.lookups.LateralityLRB(parent36.getId(),parent36.getText(), parent36.isActive(), null, img, color));
				parentVoLookup36 = parentVoLookup36.getParent();
								parent36 = parent36.getParent();
			}			
			valueObject.setProcLaterality(voLookup36);
		}
				// ProcedureStatus
		ims.domain.lookups.LookupInstance instance37 = domainObject.getProcedureStatus();
		if ( null != instance37 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance37.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance37.getImage().getImageId(), instance37.getImage().getImagePath());
			}
			color = instance37.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PatientProcedureStatus voLookup37 = new ims.core.vo.lookups.PatientProcedureStatus(instance37.getId(),instance37.getText(), instance37.isActive(), null, img, color);
			ims.core.vo.lookups.PatientProcedureStatus parentVoLookup37 = voLookup37;
			ims.domain.lookups.LookupInstance parent37 = instance37.getParent();
			while (parent37 != null)
			{
				if (parent37.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent37.getImage().getImageId(), parent37.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent37.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup37.setParent(new ims.core.vo.lookups.PatientProcedureStatus(parent37.getId(),parent37.getText(), parent37.isActive(), null, img, color));
				parentVoLookup37 = parentVoLookup37.getParent();
								parent37 = parent37.getParent();
			}			
			valueObject.setProcedureStatus(voLookup37);
		}
				// ProcTime
		String ProcTime = domainObject.getProcTime();
		if ( null != ProcTime ) 
		{
			valueObject.setProcTime(new ims.framework.utils.Time(ProcTime) );
		}
		// EpisodeOfCare
		if (domainObject.getEpisodeOfCare() != null)
		{
			if(domainObject.getEpisodeOfCare() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getEpisodeOfCare();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setEpisodeOfCare(new ims.core.admin.vo.EpisodeOfCareRefVo(id, -1));				
			}
			else
			{
				valueObject.setEpisodeOfCare(new ims.core.admin.vo.EpisodeOfCareRefVo(domainObject.getEpisodeOfCare().getId(), domainObject.getEpisodeOfCare().getVersion()));
			}
		}
		// isPrimary
		valueObject.setIsPrimary( domainObject.isIsPrimary() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.PatientProcedure extractPatientProcedure(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientProcedureVo valueObject) 
	{
		return 	extractPatientProcedure(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.PatientProcedure extractPatientProcedure(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientProcedureVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientProcedure();
		ims.core.clinical.domain.objects.PatientProcedure domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.PatientProcedure)domMap.get(valueObject);
			}
			// ims.core.vo.PatientProcedureVo ID_PatientProcedure field is unknown
			domainObject = new ims.core.clinical.domain.objects.PatientProcedure();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientProcedure());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.PatientProcedure)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.PatientProcedure) domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientProcedure.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientProcedure());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLocation() != null && valueObject.getLocation().equals(""))
		{
			valueObject.setLocation(null);
		}
		domainObject.setLocation(valueObject.getLocation());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getConfirmedStatus() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getConfirmedStatus().getID());
		}
		domainObject.setConfirmedStatus(value3);
		domainObject.setConfirmedBy(ims.core.vo.domain.HcpAssembler.extractHcp(domainFactory, valueObject.getConfirmedBy(), domMap));
		ims.framework.utils.DateTime dateTime5 = valueObject.getConfirmedDateTime();
		java.util.Date value5 = null;
		if ( dateTime5 != null ) 
		{
			value5 = dateTime5.getJavaDate();
		}
		domainObject.setConfirmedDateTime(value5);
		domainObject.setExcludeFromOthers(valueObject.getExcludeFromOthers());
		domainObject.setHCPPresent(ims.core.vo.domain.HcpLiteVoAssembler.extractHcpSet(domainFactory, valueObject.getHCPPresent(), domainObject.getHCPPresent(), domMap));		
		domainObject.setInsertedDevices(ims.core.vo.domain.PatientCharacteristicVoAssembler.extractPatientCharacteristicSet(domainFactory, valueObject.getInsertedDevices(), domainObject.getInsertedDevices(), domMap));		
		domainObject.setRemovedDevices(ims.core.vo.domain.PatientCharacteristicVoAssembler.extractPatientCharacteristicSet(domainFactory, valueObject.getRemovedDevices(), domainObject.getRemovedDevices(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getProcLocation() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getProcLocation().getID());
		}
		domainObject.setProcLocation(value10);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.ClinicalContact value11 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value11 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else
			{
				value11 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value11);
		java.util.Date value12 = null;
		ims.framework.utils.Date date12 = valueObject.getCancelledDate();		
		if ( date12 != null ) 
		{
			value12 = date12.getDate();
		}
		domainObject.setCancelledDate(value12);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCancelledReason() != null && valueObject.getCancelledReason().equals(""))
		{
			valueObject.setCancelledReason(null);
		}
		domainObject.setCancelledReason(valueObject.getCancelledReason());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getSurgeonsGrade() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getSurgeonsGrade().getID());
		}
		domainObject.setSurgeonsGrade(value14);
		ims.framework.utils.PartialDate ProcEndDate = valueObject.getProcEndDate();
		Integer value15 = null;
		if ( null != ProcEndDate ) 
		{
			value15 = ProcEndDate.toInteger();
		}
		domainObject.setProcEndDate(value15);
		ims.framework.utils.Time time16 = valueObject.getProcEndTime();
		String value16 = null;
		if ( time16 != null ) 
		{
			value16 = time16.toString();
		}
		domainObject.setProcEndTime(value16);
		domainObject.setSignifProc(valueObject.getSignifProc());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.IntraOperativeCareRecord value18 = null;
		if ( null != valueObject.getIntraOperativeRecord() ) 
		{
			if (valueObject.getIntraOperativeRecord().getBoId() == null)
			{
				if (domMap.get(valueObject.getIntraOperativeRecord()) != null)
				{
					value18 = (ims.core.clinical.domain.objects.IntraOperativeCareRecord)domMap.get(valueObject.getIntraOperativeRecord());
				}
			}
			else
			{
				value18 = (ims.core.clinical.domain.objects.IntraOperativeCareRecord)domainFactory.getDomainObject(ims.core.clinical.domain.objects.IntraOperativeCareRecord.class, valueObject.getIntraOperativeRecord().getBoId());
			}
		}
		domainObject.setIntraOperativeRecord(value18);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNotes() != null && valueObject.getNotes().equals(""))
		{
			valueObject.setNotes(null);
		}
		domainObject.setNotes(valueObject.getNotes());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value21 = null;
		if ( null != valueObject.getProcedureUrgency() ) 
		{
			value21 =
				domainFactory.getLookupInstance(valueObject.getProcedureUrgency().getID());
		}
		domainObject.setProcedureUrgency(value21);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value22 = null;
		if ( null != valueObject.getProcedureOutcome() ) 
		{
			value22 =
				domainFactory.getLookupInstance(valueObject.getProcedureOutcome().getID());
		}
		domainObject.setProcedureOutcome(value22);
		ims.framework.utils.PartialDate DatePlanned = valueObject.getDatePlanned();
		Integer value23 = null;
		if ( null != DatePlanned ) 
		{
			value23 = DatePlanned.toInteger();
		}
		domainObject.setDatePlanned(value23);
		ims.core.clinical.domain.objects.PatientProcedure value24 = null;
		if ( null != valueObject.getPlannedProc() ) 
		{
			if (valueObject.getPlannedProc().getBoId() == null)
			{
				if (domMap.get(valueObject.getPlannedProc()) != null)
				{
					value24 = (ims.core.clinical.domain.objects.PatientProcedure)domMap.get(valueObject.getPlannedProc());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value24 = domainObject.getPlannedProc();	
			}
			else
			{
				value24 = (ims.core.clinical.domain.objects.PatientProcedure)domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientProcedure.class, valueObject.getPlannedProc().getBoId());
			}
		}
		domainObject.setPlannedProc(value24);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value25 = null;
		if ( null != valueObject.getProcSite() ) 
		{
			value25 =
				domainFactory.getLookupInstance(valueObject.getProcSite().getID());
		}
		domainObject.setProcSite(value25);
		domainObject.setPeformedBy(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, (ims.core.vo.HcpLiteVo)valueObject.getPeformedBy(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value27 = null;
		if ( null != valueObject.getProcedureIntent() ) 
		{
			value27 =
				domainFactory.getLookupInstance(valueObject.getProcedureIntent().getID());
		}
		domainObject.setProcedureIntent(value27);
		domainObject.setProcedure(ims.core.vo.domain.ProcedureLiteVoAssembler.extractProcedure(domainFactory, valueObject.getProcedure(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getProcedureDescription() != null && valueObject.getProcedureDescription().equals(""))
		{
			valueObject.setProcedureDescription(null);
		}
		domainObject.setProcedureDescription(valueObject.getProcedureDescription());
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value31 = null;
		if ( null != valueObject.getInfoSource() ) 
		{
			value31 =
				domainFactory.getLookupInstance(valueObject.getInfoSource().getID());
		}
		domainObject.setInfoSource(value31);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.CareContext value32 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value32 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else
			{
				value32 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value32);
		ims.framework.utils.PartialDate ProcDate = valueObject.getProcDate();
		Integer value33 = null;
		if ( null != ProcDate ) 
		{
			value33 = ProcDate.toInteger();
		}
		domainObject.setProcDate(value33);
		domainObject.setIncludeInDischargeLetter(valueObject.getIncludeInDischargeLetter());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSiteText() != null && valueObject.getSiteText().equals(""))
		{
			valueObject.setSiteText(null);
		}
		domainObject.setSiteText(valueObject.getSiteText());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value36 = null;
		if ( null != valueObject.getProcLaterality() ) 
		{
			value36 =
				domainFactory.getLookupInstance(valueObject.getProcLaterality().getID());
		}
		domainObject.setProcLaterality(value36);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value37 = null;
		if ( null != valueObject.getProcedureStatus() ) 
		{
			value37 =
				domainFactory.getLookupInstance(valueObject.getProcedureStatus().getID());
		}
		domainObject.setProcedureStatus(value37);
		ims.framework.utils.Time time38 = valueObject.getProcTime();
		String value38 = null;
		if ( time38 != null ) 
		{
			value38 = time38.toString();
		}
		domainObject.setProcTime(value38);
		ims.core.admin.domain.objects.EpisodeOfCare value39 = null;
		if ( null != valueObject.getEpisodeOfCare() ) 
		{
			if (valueObject.getEpisodeOfCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisodeOfCare()) != null)
				{
					value39 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisodeOfCare());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value39 = domainObject.getEpisodeOfCare();	
			}
			else
			{
				value39 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisodeOfCare().getBoId());
			}
		}
		domainObject.setEpisodeOfCare(value39);
		domainObject.setIsPrimary(valueObject.getIsPrimary());

		return domainObject;
	}

}
