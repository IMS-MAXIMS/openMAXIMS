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
public class PatientMedicationVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PatientMedicationVo copy(ims.core.vo.PatientMedicationVo valueObjectDest, ims.core.vo.PatientMedicationVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientMedication(valueObjectSrc.getID_PatientMedication());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// DifficultiesWithMed
		valueObjectDest.setDifficultiesWithMed(valueObjectSrc.getDifficultiesWithMed());
		// Supplied
		valueObjectDest.setSupplied(valueObjectSrc.getSupplied());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// inPossession
		valueObjectDest.setInPossession(valueObjectSrc.getInPossession());
		// SysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
		// IsMedicationonAdmission
		valueObjectDest.setIsMedicationonAdmission(valueObjectSrc.getIsMedicationonAdmission());
		// isDischargeMedication
		valueObjectDest.setIsDischargeMedication(valueObjectSrc.getIsDischargeMedication());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// HcpCommenced
		valueObjectDest.setHcpCommenced(valueObjectSrc.getHcpCommenced());
		// isInTTO
		valueObjectDest.setIsInTTO(valueObjectSrc.getIsInTTO());
		// isDiscontinuedHcp
		valueObjectDest.setIsDiscontinuedHcp(valueObjectSrc.getIsDiscontinuedHcp());
		// isDiscontinuedDate
		valueObjectDest.setIsDiscontinuedDate(valueObjectSrc.getIsDiscontinuedDate());
		// isDiscontinuedReason
		valueObjectDest.setIsDiscontinuedReason(valueObjectSrc.getIsDiscontinuedReason());
		// isDiscontinuedReasonText
		valueObjectDest.setIsDiscontinuedReasonText(valueObjectSrc.getIsDiscontinuedReasonText());
		// isCopied
		valueObjectDest.setIsCopied(valueObjectSrc.getIsCopied());
		// CommencedByType
		valueObjectDest.setCommencedByType(valueObjectSrc.getCommencedByType());
		// DiscontinuedByType
		valueObjectDest.setDiscontinuedByType(valueObjectSrc.getDiscontinuedByType());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// SelfMedicating
		valueObjectDest.setSelfMedicating(valueObjectSrc.getSelfMedicating());
		// RecordingInformation
		valueObjectDest.setRecordingInformation(valueObjectSrc.getRecordingInformation());
		// Medication
		valueObjectDest.setMedication(valueObjectSrc.getMedication());
		// OtherMedicationText
		valueObjectDest.setOtherMedicationText(valueObjectSrc.getOtherMedicationText());
		// PrescribedDoses
		valueObjectDest.setPrescribedDoses(valueObjectSrc.getPrescribedDoses());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// Frequency
		valueObjectDest.setFrequency(valueObjectSrc.getFrequency());
		// SourceofInformation
		valueObjectDest.setSourceofInformation(valueObjectSrc.getSourceofInformation());
		// CommencedDate
		valueObjectDest.setCommencedDate(valueObjectSrc.getCommencedDate());
		// NoDaysSupply
		valueObjectDest.setNoDaysSupply(valueObjectSrc.getNoDaysSupply());
		// BatchNo
		valueObjectDest.setBatchNo(valueObjectSrc.getBatchNo());
		// ExpiryDate
		valueObjectDest.setExpiryDate(valueObjectSrc.getExpiryDate());
		// isDiscontinued
		valueObjectDest.setIsDiscontinued(valueObjectSrc.getIsDiscontinued());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientMedicationVoCollectionFromPatientMedication(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientMedication objects.
	 */
	public static ims.core.vo.PatientMedicationVoCollection createPatientMedicationVoCollectionFromPatientMedication(java.util.Set domainObjectSet)	
	{
		return createPatientMedicationVoCollectionFromPatientMedication(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientMedication objects.
	 */
	public static ims.core.vo.PatientMedicationVoCollection createPatientMedicationVoCollectionFromPatientMedication(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatientMedicationVoCollection voList = new ims.core.vo.PatientMedicationVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.PatientMedication domainObject = (ims.core.clinical.domain.objects.PatientMedication) iterator.next();
			ims.core.vo.PatientMedicationVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientMedication objects.
	 */
	public static ims.core.vo.PatientMedicationVoCollection createPatientMedicationVoCollectionFromPatientMedication(java.util.List domainObjectList) 
	{
		return createPatientMedicationVoCollectionFromPatientMedication(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientMedication objects.
	 */
	public static ims.core.vo.PatientMedicationVoCollection createPatientMedicationVoCollectionFromPatientMedication(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatientMedicationVoCollection voList = new ims.core.vo.PatientMedicationVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.PatientMedication domainObject = (ims.core.clinical.domain.objects.PatientMedication) domainObjectList.get(i);
			ims.core.vo.PatientMedicationVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.PatientMedication set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientMedicationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientMedicationVoCollection voCollection) 
	 {
	 	return extractPatientMedicationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientMedicationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientMedicationVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientMedicationVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientMedication domainObject = PatientMedicationVoAssembler.extractPatientMedication(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.PatientMedication list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientMedicationList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientMedicationVoCollection voCollection) 
	 {
	 	return extractPatientMedicationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientMedicationList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientMedicationVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientMedicationVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientMedication domainObject = PatientMedicationVoAssembler.extractPatientMedication(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.PatientMedication object.
	 * @param domainObject ims.core.clinical.domain.objects.PatientMedication
	 */
	 public static ims.core.vo.PatientMedicationVo create(ims.core.clinical.domain.objects.PatientMedication domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.PatientMedication object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PatientMedicationVo create(DomainObjectMap map, ims.core.clinical.domain.objects.PatientMedication domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PatientMedicationVo valueObject = (ims.core.vo.PatientMedicationVo) map.getValueObject(domainObject, ims.core.vo.PatientMedicationVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PatientMedicationVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.PatientMedication
	 */
	 public static ims.core.vo.PatientMedicationVo insert(ims.core.vo.PatientMedicationVo valueObject, ims.core.clinical.domain.objects.PatientMedication domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.PatientMedication
	 */
	 public static ims.core.vo.PatientMedicationVo insert(DomainObjectMap map, ims.core.vo.PatientMedicationVo valueObject, ims.core.clinical.domain.objects.PatientMedication domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientMedication(domainObject.getId());
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
			
		// DifficultiesWithMed
		valueObject.setDifficultiesWithMed(domainObject.getDifficultiesWithMed());
		// Supplied
		ims.domain.lookups.LookupInstance instance2 = domainObject.getSupplied();
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
			valueObject.setSupplied(voLookup2);
		}
				// ClinicalContact
		valueObject.setClinicalContact(ims.core.vo.domain.ClinicalContactShortVoAssembler.create(map, domainObject.getClinicalContact()) );
		// inPossession
		valueObject.setInPossession( domainObject.isInPossession() );
		// SysInfo
		// set system information
		valueObject.setSysInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// IsMedicationonAdmission
		valueObject.setIsMedicationonAdmission( domainObject.isIsMedicationonAdmission() );
		// isDischargeMedication
		valueObject.setIsDischargeMedication( domainObject.isIsDischargeMedication() );
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
		// HcpCommenced
		valueObject.setHcpCommenced(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getHcpCommenced()) );
		// isInTTO
		valueObject.setIsInTTO( domainObject.isIsInTTO() );
		// isDiscontinuedHcp
		valueObject.setIsDiscontinuedHcp(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getIsDiscontinuedHcp()) );
		// isDiscontinuedDate
		java.util.Date isDiscontinuedDate = domainObject.getIsDiscontinuedDate();
		if ( null != isDiscontinuedDate ) 
		{
			valueObject.setIsDiscontinuedDate(new ims.framework.utils.Date(isDiscontinuedDate) );
		}
		// isDiscontinuedReason
		ims.domain.lookups.LookupInstance instance13 = domainObject.getIsDiscontinuedReason();
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
			valueObject.setIsDiscontinuedReason(voLookup13);
		}
				// isDiscontinuedReasonText
		valueObject.setIsDiscontinuedReasonText(domainObject.getIsDiscontinuedReasonText());
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
				// DiscontinuedByType
		ims.domain.lookups.LookupInstance instance17 = domainObject.getDiscontinuedByType();
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
			valueObject.setDiscontinuedByType(voLookup17);
		}
				// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// SelfMedicating
		valueObject.setSelfMedicating( domainObject.isSelfMedicating() );
		// RecordingInformation
		valueObject.setRecordingInformation(ims.core.vo.domain.RecordingUserInformationVoAssembler.create(map, domainObject.getRecordingInformation()) );
		// Medication
		valueObject.setMedication(ims.core.vo.domain.MedicationLiteVoAssembler.create(map, domainObject.getMedication()) );
		// OtherMedicationText
		valueObject.setOtherMedicationText(domainObject.getOtherMedicationText());
		// PrescribedDoses
		valueObject.setPrescribedDoses(ims.core.vo.domain.MedicationDoseAssembler.createMedicationDoseCollectionFromPatientMedicationDose(map, domainObject.getPrescribedDoses()) );
		// Patient
		if (domainObject.getPatient() != null)
		{
			if(domainObject.getPatient() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPatient();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPatient(new ims.core.patient.vo.PatientRefVo(id, -1));				
			}
			else
			{
				valueObject.setPatient(new ims.core.patient.vo.PatientRefVo(domainObject.getPatient().getId(), domainObject.getPatient().getVersion()));
			}
		}
		// Frequency
		ims.domain.lookups.LookupInstance instance25 = domainObject.getFrequency();
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

			ims.core.vo.lookups.MedicationFrequency voLookup25 = new ims.core.vo.lookups.MedicationFrequency(instance25.getId(),instance25.getText(), instance25.isActive(), null, img, color);
			ims.core.vo.lookups.MedicationFrequency parentVoLookup25 = voLookup25;
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
								parentVoLookup25.setParent(new ims.core.vo.lookups.MedicationFrequency(parent25.getId(),parent25.getText(), parent25.isActive(), null, img, color));
				parentVoLookup25 = parentVoLookup25.getParent();
								parent25 = parent25.getParent();
			}			
			valueObject.setFrequency(voLookup25);
		}
				// SourceofInformation
		ims.domain.lookups.LookupInstance instance26 = domainObject.getSourceofInformation();
		if ( null != instance26 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance26.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance26.getImage().getImageId(), instance26.getImage().getImagePath());
			}
			color = instance26.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.SourceofInformation voLookup26 = new ims.core.vo.lookups.SourceofInformation(instance26.getId(),instance26.getText(), instance26.isActive(), null, img, color);
			ims.core.vo.lookups.SourceofInformation parentVoLookup26 = voLookup26;
			ims.domain.lookups.LookupInstance parent26 = instance26.getParent();
			while (parent26 != null)
			{
				if (parent26.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent26.getImage().getImageId(), parent26.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent26.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup26.setParent(new ims.core.vo.lookups.SourceofInformation(parent26.getId(),parent26.getText(), parent26.isActive(), null, img, color));
				parentVoLookup26 = parentVoLookup26.getParent();
								parent26 = parent26.getParent();
			}			
			valueObject.setSourceofInformation(voLookup26);
		}
				// CommencedDate
		java.util.Date CommencedDate = domainObject.getCommencedDate();
		if ( null != CommencedDate ) 
		{
			valueObject.setCommencedDate(new ims.framework.utils.Date(CommencedDate) );
		}
		// NoDaysSupply
		valueObject.setNoDaysSupply(domainObject.getNoDaysSupply());
		// BatchNo
		valueObject.setBatchNo(domainObject.getBatchNo());
		// ExpiryDate
		java.util.Date ExpiryDate = domainObject.getExpiryDate();
		if ( null != ExpiryDate ) 
		{
			valueObject.setExpiryDate(new ims.framework.utils.Date(ExpiryDate) );
		}
		// isDiscontinued
		valueObject.setIsDiscontinued( domainObject.isIsDiscontinued() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.PatientMedication extractPatientMedication(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientMedicationVo valueObject) 
	{
		return 	extractPatientMedication(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.PatientMedication extractPatientMedication(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientMedicationVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientMedication();
		ims.core.clinical.domain.objects.PatientMedication domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.PatientMedication)domMap.get(valueObject);
			}
			// ims.core.vo.PatientMedicationVo ID_PatientMedication field is unknown
			domainObject = new ims.core.clinical.domain.objects.PatientMedication();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientMedication());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.PatientMedication)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.PatientMedication) domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientMedication.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientMedication());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDifficultiesWithMed() != null && valueObject.getDifficultiesWithMed().equals(""))
		{
			valueObject.setDifficultiesWithMed(null);
		}
		domainObject.setDifficultiesWithMed(valueObject.getDifficultiesWithMed());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getSupplied() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getSupplied().getID());
		}
		domainObject.setSupplied(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.ClinicalContact value3 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value3 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else
			{
				value3 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value3);
		domainObject.setInPossession(valueObject.getInPossession());
		domainObject.setIsMedicationonAdmission(valueObject.getIsMedicationonAdmission());
		domainObject.setIsDischargeMedication(valueObject.getIsDischargeMedication());
		ims.core.admin.domain.objects.CareContext value8 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value8 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value8 = domainObject.getCareContext();	
			}
			else
			{
				value8 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value8);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value9 = null;
		if ( null != valueObject.getHcpCommenced() ) 
		{
			if (valueObject.getHcpCommenced().getBoId() == null)
			{
				if (domMap.get(valueObject.getHcpCommenced()) != null)
				{
					value9 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getHcpCommenced());
				}
			}
			else
			{
				value9 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getHcpCommenced().getBoId());
			}
		}
		domainObject.setHcpCommenced(value9);
		domainObject.setIsInTTO(valueObject.getIsInTTO());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value11 = null;
		if ( null != valueObject.getIsDiscontinuedHcp() ) 
		{
			if (valueObject.getIsDiscontinuedHcp().getBoId() == null)
			{
				if (domMap.get(valueObject.getIsDiscontinuedHcp()) != null)
				{
					value11 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getIsDiscontinuedHcp());
				}
			}
			else
			{
				value11 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getIsDiscontinuedHcp().getBoId());
			}
		}
		domainObject.setIsDiscontinuedHcp(value11);
		java.util.Date value12 = null;
		ims.framework.utils.Date date12 = valueObject.getIsDiscontinuedDate();		
		if ( date12 != null ) 
		{
			value12 = date12.getDate();
		}
		domainObject.setIsDiscontinuedDate(value12);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getIsDiscontinuedReason() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getIsDiscontinuedReason().getID());
		}
		domainObject.setIsDiscontinuedReason(value13);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getIsDiscontinuedReasonText() != null && valueObject.getIsDiscontinuedReasonText().equals(""))
		{
			valueObject.setIsDiscontinuedReasonText(null);
		}
		domainObject.setIsDiscontinuedReasonText(valueObject.getIsDiscontinuedReasonText());
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
		if ( null != valueObject.getDiscontinuedByType() ) 
		{
			value17 =
				domainFactory.getLookupInstance(valueObject.getDiscontinuedByType().getID());
		}
		domainObject.setDiscontinuedByType(value17);
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		domainObject.setSelfMedicating(valueObject.getSelfMedicating());
		domainObject.setRecordingInformation(ims.core.vo.domain.RecordingUserInformationVoAssembler.extractRecordingUserInformation(domainFactory, valueObject.getRecordingInformation(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Medication value21 = null;
		if ( null != valueObject.getMedication() ) 
		{
			if (valueObject.getMedication().getBoId() == null)
			{
				if (domMap.get(valueObject.getMedication()) != null)
				{
					value21 = (ims.core.clinical.domain.objects.Medication)domMap.get(valueObject.getMedication());
				}
			}
			else
			{
				value21 = (ims.core.clinical.domain.objects.Medication)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Medication.class, valueObject.getMedication().getBoId());
			}
		}
		domainObject.setMedication(value21);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOtherMedicationText() != null && valueObject.getOtherMedicationText().equals(""))
		{
			valueObject.setOtherMedicationText(null);
		}
		domainObject.setOtherMedicationText(valueObject.getOtherMedicationText());
		domainObject.setPrescribedDoses(ims.core.vo.domain.MedicationDoseAssembler.extractPatientMedicationDoseList(domainFactory, valueObject.getPrescribedDoses(), domainObject.getPrescribedDoses(), domMap));		
		ims.core.patient.domain.objects.Patient value24 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value24 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value24 = domainObject.getPatient();	
			}
			else
			{
				value24 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value24);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value25 = null;
		if ( null != valueObject.getFrequency() ) 
		{
			value25 =
				domainFactory.getLookupInstance(valueObject.getFrequency().getID());
		}
		domainObject.setFrequency(value25);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value26 = null;
		if ( null != valueObject.getSourceofInformation() ) 
		{
			value26 =
				domainFactory.getLookupInstance(valueObject.getSourceofInformation().getID());
		}
		domainObject.setSourceofInformation(value26);
		java.util.Date value27 = null;
		ims.framework.utils.Date date27 = valueObject.getCommencedDate();		
		if ( date27 != null ) 
		{
			value27 = date27.getDate();
		}
		domainObject.setCommencedDate(value27);
		domainObject.setNoDaysSupply(valueObject.getNoDaysSupply());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getBatchNo() != null && valueObject.getBatchNo().equals(""))
		{
			valueObject.setBatchNo(null);
		}
		domainObject.setBatchNo(valueObject.getBatchNo());
		java.util.Date value30 = null;
		ims.framework.utils.Date date30 = valueObject.getExpiryDate();		
		if ( date30 != null ) 
		{
			value30 = date30.getDate();
		}
		domainObject.setExpiryDate(value30);
		domainObject.setIsDiscontinued(valueObject.getIsDiscontinued());

		return domainObject;
	}

}
