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
public class PatientSurgicalOperationVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PatientSurgicalOperationVo copy(ims.core.vo.PatientSurgicalOperationVo valueObjectDest, ims.core.vo.PatientSurgicalOperationVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientProcedure(valueObjectSrc.getID_PatientProcedure());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Assistants
		valueObjectDest.setAssistants(valueObjectSrc.getAssistants());
		// Nurse
		valueObjectDest.setNurse(valueObjectSrc.getNurse());
		// Anaesthetist
		valueObjectDest.setAnaesthetist(valueObjectSrc.getAnaesthetist());
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
 	 * If more than one call to an Assembler is made then #createPatientSurgicalOperationVoCollectionFromPatientSurgicalOperation(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientSurgicalOperation objects.
	 */
	public static ims.core.vo.PatientSurgicalOperationVoCollection createPatientSurgicalOperationVoCollectionFromPatientSurgicalOperation(java.util.Set domainObjectSet)	
	{
		return createPatientSurgicalOperationVoCollectionFromPatientSurgicalOperation(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientSurgicalOperation objects.
	 */
	public static ims.core.vo.PatientSurgicalOperationVoCollection createPatientSurgicalOperationVoCollectionFromPatientSurgicalOperation(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatientSurgicalOperationVoCollection voList = new ims.core.vo.PatientSurgicalOperationVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.PatientSurgicalOperation domainObject = (ims.core.clinical.domain.objects.PatientSurgicalOperation) iterator.next();
			ims.core.vo.PatientSurgicalOperationVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientSurgicalOperation objects.
	 */
	public static ims.core.vo.PatientSurgicalOperationVoCollection createPatientSurgicalOperationVoCollectionFromPatientSurgicalOperation(java.util.List domainObjectList) 
	{
		return createPatientSurgicalOperationVoCollectionFromPatientSurgicalOperation(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientSurgicalOperation objects.
	 */
	public static ims.core.vo.PatientSurgicalOperationVoCollection createPatientSurgicalOperationVoCollectionFromPatientSurgicalOperation(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatientSurgicalOperationVoCollection voList = new ims.core.vo.PatientSurgicalOperationVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.PatientSurgicalOperation domainObject = (ims.core.clinical.domain.objects.PatientSurgicalOperation) domainObjectList.get(i);
			ims.core.vo.PatientSurgicalOperationVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.PatientSurgicalOperation set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientSurgicalOperationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientSurgicalOperationVoCollection voCollection) 
	 {
	 	return extractPatientSurgicalOperationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientSurgicalOperationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientSurgicalOperationVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientSurgicalOperationVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientSurgicalOperation domainObject = PatientSurgicalOperationVoAssembler.extractPatientSurgicalOperation(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.PatientSurgicalOperation list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientSurgicalOperationList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientSurgicalOperationVoCollection voCollection) 
	 {
	 	return extractPatientSurgicalOperationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientSurgicalOperationList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientSurgicalOperationVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientSurgicalOperationVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientSurgicalOperation domainObject = PatientSurgicalOperationVoAssembler.extractPatientSurgicalOperation(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.PatientSurgicalOperation object.
	 * @param domainObject ims.core.clinical.domain.objects.PatientSurgicalOperation
	 */
	 public static ims.core.vo.PatientSurgicalOperationVo create(ims.core.clinical.domain.objects.PatientSurgicalOperation domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.PatientSurgicalOperation object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PatientSurgicalOperationVo create(DomainObjectMap map, ims.core.clinical.domain.objects.PatientSurgicalOperation domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PatientSurgicalOperationVo valueObject = (ims.core.vo.PatientSurgicalOperationVo) map.getValueObject(domainObject, ims.core.vo.PatientSurgicalOperationVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PatientSurgicalOperationVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.PatientSurgicalOperation
	 */
	 public static ims.core.vo.PatientSurgicalOperationVo insert(ims.core.vo.PatientSurgicalOperationVo valueObject, ims.core.clinical.domain.objects.PatientSurgicalOperation domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.PatientSurgicalOperation
	 */
	 public static ims.core.vo.PatientSurgicalOperationVo insert(DomainObjectMap map, ims.core.vo.PatientSurgicalOperationVo valueObject, ims.core.clinical.domain.objects.PatientSurgicalOperation domainObject) 
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
			
		// Assistants
		valueObject.setAssistants(ims.core.vo.domain.HcpLiteVoAssembler.createHcpLiteVoCollectionFromHcp(map, domainObject.getAssistants()) );
		// Nurse
		valueObject.setNurse(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getNurse()) );
		// Anaesthetist
		valueObject.setAnaesthetist(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getAnaesthetist()) );
		// Location
		valueObject.setLocation(domainObject.getLocation());
		// Specialty
		ims.domain.lookups.LookupInstance instance5 = domainObject.getSpecialty();
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

			ims.core.vo.lookups.Specialty voLookup5 = new ims.core.vo.lookups.Specialty(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.Specialty(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setSpecialty(voLookup5);
		}
				// ConfirmedStatus
		ims.domain.lookups.LookupInstance instance6 = domainObject.getConfirmedStatus();
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

			ims.core.vo.lookups.ConfirmedStatus voLookup6 = new ims.core.vo.lookups.ConfirmedStatus(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.ConfirmedStatus parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.ConfirmedStatus(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setConfirmedStatus(voLookup6);
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
		ims.domain.lookups.LookupInstance instance13 = domainObject.getProcLocation();
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

			ims.core.vo.lookups.ProcedureLocation voLookup13 = new ims.core.vo.lookups.ProcedureLocation(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.core.vo.lookups.ProcedureLocation parentVoLookup13 = voLookup13;
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
								parentVoLookup13.setParent(new ims.core.vo.lookups.ProcedureLocation(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setProcLocation(voLookup13);
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
		ims.domain.lookups.LookupInstance instance17 = domainObject.getSurgeonsGrade();
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

			ims.core.vo.lookups.MedicGrade voLookup17 = new ims.core.vo.lookups.MedicGrade(instance17.getId(),instance17.getText(), instance17.isActive(), null, img, color);
			ims.core.vo.lookups.MedicGrade parentVoLookup17 = voLookup17;
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
								parentVoLookup17.setParent(new ims.core.vo.lookups.MedicGrade(parent17.getId(),parent17.getText(), parent17.isActive(), null, img, color));
				parentVoLookup17 = parentVoLookup17.getParent();
								parent17 = parent17.getParent();
			}			
			valueObject.setSurgeonsGrade(voLookup17);
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
		ims.domain.lookups.LookupInstance instance24 = domainObject.getProcedureUrgency();
		if ( null != instance24 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance24.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance24.getImage().getImageId(), instance24.getImage().getImagePath());
			}
			color = instance24.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.ProcedureUrgency voLookup24 = new ims.core.vo.lookups.ProcedureUrgency(instance24.getId(),instance24.getText(), instance24.isActive(), null, img, color);
			ims.core.vo.lookups.ProcedureUrgency parentVoLookup24 = voLookup24;
			ims.domain.lookups.LookupInstance parent24 = instance24.getParent();
			while (parent24 != null)
			{
				if (parent24.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent24.getImage().getImageId(), parent24.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent24.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup24.setParent(new ims.core.vo.lookups.ProcedureUrgency(parent24.getId(),parent24.getText(), parent24.isActive(), null, img, color));
				parentVoLookup24 = parentVoLookup24.getParent();
								parent24 = parent24.getParent();
			}			
			valueObject.setProcedureUrgency(voLookup24);
		}
				// ProcedureOutcome
		ims.domain.lookups.LookupInstance instance25 = domainObject.getProcedureOutcome();
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

			ims.clinical.vo.lookups.PatientProcedureOutcome voLookup25 = new ims.clinical.vo.lookups.PatientProcedureOutcome(instance25.getId(),instance25.getText(), instance25.isActive(), null, img, color);
			ims.clinical.vo.lookups.PatientProcedureOutcome parentVoLookup25 = voLookup25;
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
								parentVoLookup25.setParent(new ims.clinical.vo.lookups.PatientProcedureOutcome(parent25.getId(),parent25.getText(), parent25.isActive(), null, img, color));
				parentVoLookup25 = parentVoLookup25.getParent();
								parent25 = parent25.getParent();
			}			
			valueObject.setProcedureOutcome(voLookup25);
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
		ims.domain.lookups.LookupInstance instance28 = domainObject.getProcSite();
		if ( null != instance28 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance28.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance28.getImage().getImageId(), instance28.getImage().getImagePath());
			}
			color = instance28.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.MedicalHistoryProcedureSite voLookup28 = new ims.core.vo.lookups.MedicalHistoryProcedureSite(instance28.getId(),instance28.getText(), instance28.isActive(), null, img, color);
			ims.core.vo.lookups.MedicalHistoryProcedureSite parentVoLookup28 = voLookup28;
			ims.domain.lookups.LookupInstance parent28 = instance28.getParent();
			while (parent28 != null)
			{
				if (parent28.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent28.getImage().getImageId(), parent28.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent28.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup28.setParent(new ims.core.vo.lookups.MedicalHistoryProcedureSite(parent28.getId(),parent28.getText(), parent28.isActive(), null, img, color));
				parentVoLookup28 = parentVoLookup28.getParent();
								parent28 = parent28.getParent();
			}			
			valueObject.setProcSite(voLookup28);
		}
				// PeformedBy
		valueObject.setPeformedBy((ims.core.vo.HcpLiteVo)ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getPeformedBy()) );
		// ProcedureIntent
		ims.domain.lookups.LookupInstance instance30 = domainObject.getProcedureIntent();
		if ( null != instance30 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance30.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance30.getImage().getImageId(), instance30.getImage().getImagePath());
			}
			color = instance30.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.ProcedureIntent voLookup30 = new ims.core.vo.lookups.ProcedureIntent(instance30.getId(),instance30.getText(), instance30.isActive(), null, img, color);
			ims.core.vo.lookups.ProcedureIntent parentVoLookup30 = voLookup30;
			ims.domain.lookups.LookupInstance parent30 = instance30.getParent();
			while (parent30 != null)
			{
				if (parent30.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent30.getImage().getImageId(), parent30.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent30.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup30.setParent(new ims.core.vo.lookups.ProcedureIntent(parent30.getId(),parent30.getText(), parent30.isActive(), null, img, color));
				parentVoLookup30 = parentVoLookup30.getParent();
								parent30 = parent30.getParent();
			}			
			valueObject.setProcedureIntent(voLookup30);
		}
				// Procedure
		valueObject.setProcedure(ims.core.vo.domain.ProcedureLiteVoAssembler.create(map, domainObject.getProcedure()) );
		// ProcedureDescription
		valueObject.setProcedureDescription(domainObject.getProcedureDescription());
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// InfoSource
		ims.domain.lookups.LookupInstance instance34 = domainObject.getInfoSource();
		if ( null != instance34 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance34.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance34.getImage().getImageId(), instance34.getImage().getImagePath());
			}
			color = instance34.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.SourceofInformation voLookup34 = new ims.core.vo.lookups.SourceofInformation(instance34.getId(),instance34.getText(), instance34.isActive(), null, img, color);
			ims.core.vo.lookups.SourceofInformation parentVoLookup34 = voLookup34;
			ims.domain.lookups.LookupInstance parent34 = instance34.getParent();
			while (parent34 != null)
			{
				if (parent34.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent34.getImage().getImageId(), parent34.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent34.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup34.setParent(new ims.core.vo.lookups.SourceofInformation(parent34.getId(),parent34.getText(), parent34.isActive(), null, img, color));
				parentVoLookup34 = parentVoLookup34.getParent();
								parent34 = parent34.getParent();
			}			
			valueObject.setInfoSource(voLookup34);
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
		ims.domain.lookups.LookupInstance instance39 = domainObject.getProcLaterality();
		if ( null != instance39 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance39.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance39.getImage().getImageId(), instance39.getImage().getImagePath());
			}
			color = instance39.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.LateralityLRB voLookup39 = new ims.core.vo.lookups.LateralityLRB(instance39.getId(),instance39.getText(), instance39.isActive(), null, img, color);
			ims.core.vo.lookups.LateralityLRB parentVoLookup39 = voLookup39;
			ims.domain.lookups.LookupInstance parent39 = instance39.getParent();
			while (parent39 != null)
			{
				if (parent39.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent39.getImage().getImageId(), parent39.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent39.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup39.setParent(new ims.core.vo.lookups.LateralityLRB(parent39.getId(),parent39.getText(), parent39.isActive(), null, img, color));
				parentVoLookup39 = parentVoLookup39.getParent();
								parent39 = parent39.getParent();
			}			
			valueObject.setProcLaterality(voLookup39);
		}
				// ProcedureStatus
		ims.domain.lookups.LookupInstance instance40 = domainObject.getProcedureStatus();
		if ( null != instance40 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance40.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance40.getImage().getImageId(), instance40.getImage().getImagePath());
			}
			color = instance40.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PatientProcedureStatus voLookup40 = new ims.core.vo.lookups.PatientProcedureStatus(instance40.getId(),instance40.getText(), instance40.isActive(), null, img, color);
			ims.core.vo.lookups.PatientProcedureStatus parentVoLookup40 = voLookup40;
			ims.domain.lookups.LookupInstance parent40 = instance40.getParent();
			while (parent40 != null)
			{
				if (parent40.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent40.getImage().getImageId(), parent40.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent40.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup40.setParent(new ims.core.vo.lookups.PatientProcedureStatus(parent40.getId(),parent40.getText(), parent40.isActive(), null, img, color));
				parentVoLookup40 = parentVoLookup40.getParent();
								parent40 = parent40.getParent();
			}			
			valueObject.setProcedureStatus(voLookup40);
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
	public static ims.core.clinical.domain.objects.PatientSurgicalOperation extractPatientSurgicalOperation(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientSurgicalOperationVo valueObject) 
	{
		return 	extractPatientSurgicalOperation(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.PatientSurgicalOperation extractPatientSurgicalOperation(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientSurgicalOperationVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientProcedure();
		ims.core.clinical.domain.objects.PatientSurgicalOperation domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.PatientSurgicalOperation)domMap.get(valueObject);
			}
			// ims.core.vo.PatientSurgicalOperationVo ID_PatientSurgicalOperation field is unknown
			domainObject = new ims.core.clinical.domain.objects.PatientSurgicalOperation();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientProcedure());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.PatientSurgicalOperation)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.PatientSurgicalOperation) domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientSurgicalOperation.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientProcedure());

		domainObject.setAssistants(ims.core.vo.domain.HcpLiteVoAssembler.extractHcpSet(domainFactory, valueObject.getAssistants(), domainObject.getAssistants(), domMap));		
		domainObject.setNurse(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getNurse(), domMap));
		domainObject.setAnaesthetist(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getAnaesthetist(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLocation() != null && valueObject.getLocation().equals(""))
		{
			valueObject.setLocation(null);
		}
		domainObject.setLocation(valueObject.getLocation());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getConfirmedStatus() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getConfirmedStatus().getID());
		}
		domainObject.setConfirmedStatus(value6);
		domainObject.setConfirmedBy(ims.core.vo.domain.HcpAssembler.extractHcp(domainFactory, valueObject.getConfirmedBy(), domMap));
		ims.framework.utils.DateTime dateTime8 = valueObject.getConfirmedDateTime();
		java.util.Date value8 = null;
		if ( dateTime8 != null ) 
		{
			value8 = dateTime8.getJavaDate();
		}
		domainObject.setConfirmedDateTime(value8);
		domainObject.setExcludeFromOthers(valueObject.getExcludeFromOthers());
		domainObject.setHCPPresent(ims.core.vo.domain.HcpLiteVoAssembler.extractHcpSet(domainFactory, valueObject.getHCPPresent(), domainObject.getHCPPresent(), domMap));		
		domainObject.setInsertedDevices(ims.core.vo.domain.PatientCharacteristicVoAssembler.extractPatientCharacteristicSet(domainFactory, valueObject.getInsertedDevices(), domainObject.getInsertedDevices(), domMap));		
		domainObject.setRemovedDevices(ims.core.vo.domain.PatientCharacteristicVoAssembler.extractPatientCharacteristicSet(domainFactory, valueObject.getRemovedDevices(), domainObject.getRemovedDevices(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getProcLocation() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getProcLocation().getID());
		}
		domainObject.setProcLocation(value13);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.ClinicalContact value14 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value14 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else
			{
				value14 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value14);
		java.util.Date value15 = null;
		ims.framework.utils.Date date15 = valueObject.getCancelledDate();		
		if ( date15 != null ) 
		{
			value15 = date15.getDate();
		}
		domainObject.setCancelledDate(value15);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCancelledReason() != null && valueObject.getCancelledReason().equals(""))
		{
			valueObject.setCancelledReason(null);
		}
		domainObject.setCancelledReason(valueObject.getCancelledReason());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value17 = null;
		if ( null != valueObject.getSurgeonsGrade() ) 
		{
			value17 =
				domainFactory.getLookupInstance(valueObject.getSurgeonsGrade().getID());
		}
		domainObject.setSurgeonsGrade(value17);
		ims.framework.utils.PartialDate ProcEndDate = valueObject.getProcEndDate();
		Integer value18 = null;
		if ( null != ProcEndDate ) 
		{
			value18 = ProcEndDate.toInteger();
		}
		domainObject.setProcEndDate(value18);
		ims.framework.utils.Time time19 = valueObject.getProcEndTime();
		String value19 = null;
		if ( time19 != null ) 
		{
			value19 = time19.toString();
		}
		domainObject.setProcEndTime(value19);
		domainObject.setSignifProc(valueObject.getSignifProc());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.IntraOperativeCareRecord value21 = null;
		if ( null != valueObject.getIntraOperativeRecord() ) 
		{
			if (valueObject.getIntraOperativeRecord().getBoId() == null)
			{
				if (domMap.get(valueObject.getIntraOperativeRecord()) != null)
				{
					value21 = (ims.core.clinical.domain.objects.IntraOperativeCareRecord)domMap.get(valueObject.getIntraOperativeRecord());
				}
			}
			else
			{
				value21 = (ims.core.clinical.domain.objects.IntraOperativeCareRecord)domainFactory.getDomainObject(ims.core.clinical.domain.objects.IntraOperativeCareRecord.class, valueObject.getIntraOperativeRecord().getBoId());
			}
		}
		domainObject.setIntraOperativeRecord(value21);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNotes() != null && valueObject.getNotes().equals(""))
		{
			valueObject.setNotes(null);
		}
		domainObject.setNotes(valueObject.getNotes());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value24 = null;
		if ( null != valueObject.getProcedureUrgency() ) 
		{
			value24 =
				domainFactory.getLookupInstance(valueObject.getProcedureUrgency().getID());
		}
		domainObject.setProcedureUrgency(value24);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value25 = null;
		if ( null != valueObject.getProcedureOutcome() ) 
		{
			value25 =
				domainFactory.getLookupInstance(valueObject.getProcedureOutcome().getID());
		}
		domainObject.setProcedureOutcome(value25);
		ims.framework.utils.PartialDate DatePlanned = valueObject.getDatePlanned();
		Integer value26 = null;
		if ( null != DatePlanned ) 
		{
			value26 = DatePlanned.toInteger();
		}
		domainObject.setDatePlanned(value26);
		ims.core.clinical.domain.objects.PatientProcedure value27 = null;
		if ( null != valueObject.getPlannedProc() ) 
		{
			if (valueObject.getPlannedProc().getBoId() == null)
			{
				if (domMap.get(valueObject.getPlannedProc()) != null)
				{
					value27 = (ims.core.clinical.domain.objects.PatientProcedure)domMap.get(valueObject.getPlannedProc());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value27 = domainObject.getPlannedProc();	
			}
			else
			{
				value27 = (ims.core.clinical.domain.objects.PatientProcedure)domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientProcedure.class, valueObject.getPlannedProc().getBoId());
			}
		}
		domainObject.setPlannedProc(value27);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value28 = null;
		if ( null != valueObject.getProcSite() ) 
		{
			value28 =
				domainFactory.getLookupInstance(valueObject.getProcSite().getID());
		}
		domainObject.setProcSite(value28);
		domainObject.setPeformedBy(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, (ims.core.vo.HcpLiteVo)valueObject.getPeformedBy(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value30 = null;
		if ( null != valueObject.getProcedureIntent() ) 
		{
			value30 =
				domainFactory.getLookupInstance(valueObject.getProcedureIntent().getID());
		}
		domainObject.setProcedureIntent(value30);
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
		ims.domain.lookups.LookupInstance value34 = null;
		if ( null != valueObject.getInfoSource() ) 
		{
			value34 =
				domainFactory.getLookupInstance(valueObject.getInfoSource().getID());
		}
		domainObject.setInfoSource(value34);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.CareContext value35 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value35 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else
			{
				value35 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value35);
		ims.framework.utils.PartialDate ProcDate = valueObject.getProcDate();
		Integer value36 = null;
		if ( null != ProcDate ) 
		{
			value36 = ProcDate.toInteger();
		}
		domainObject.setProcDate(value36);
		domainObject.setIncludeInDischargeLetter(valueObject.getIncludeInDischargeLetter());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSiteText() != null && valueObject.getSiteText().equals(""))
		{
			valueObject.setSiteText(null);
		}
		domainObject.setSiteText(valueObject.getSiteText());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value39 = null;
		if ( null != valueObject.getProcLaterality() ) 
		{
			value39 =
				domainFactory.getLookupInstance(valueObject.getProcLaterality().getID());
		}
		domainObject.setProcLaterality(value39);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value40 = null;
		if ( null != valueObject.getProcedureStatus() ) 
		{
			value40 =
				domainFactory.getLookupInstance(valueObject.getProcedureStatus().getID());
		}
		domainObject.setProcedureStatus(value40);
		ims.framework.utils.Time time41 = valueObject.getProcTime();
		String value41 = null;
		if ( time41 != null ) 
		{
			value41 = time41.toString();
		}
		domainObject.setProcTime(value41);
		ims.core.admin.domain.objects.EpisodeOfCare value42 = null;
		if ( null != valueObject.getEpisodeOfCare() ) 
		{
			if (valueObject.getEpisodeOfCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisodeOfCare()) != null)
				{
					value42 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisodeOfCare());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value42 = domainObject.getEpisodeOfCare();	
			}
			else
			{
				value42 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisodeOfCare().getBoId());
			}
		}
		domainObject.setEpisodeOfCare(value42);
		domainObject.setIsPrimary(valueObject.getIsPrimary());

		return domainObject;
	}

}
