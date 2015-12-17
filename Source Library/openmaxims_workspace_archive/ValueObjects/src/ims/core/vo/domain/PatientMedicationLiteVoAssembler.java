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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Alexie Ursache
 */
public class PatientMedicationLiteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PatientMedicationLiteVo copy(ims.core.vo.PatientMedicationLiteVo valueObjectDest, ims.core.vo.PatientMedicationLiteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientMedication(valueObjectSrc.getID_PatientMedication());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
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
 	 * If more than one call to an Assembler is made then #createPatientMedicationLiteVoCollectionFromPatientMedication(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientMedication objects.
	 */
	public static ims.core.vo.PatientMedicationLiteVoCollection createPatientMedicationLiteVoCollectionFromPatientMedication(java.util.Set domainObjectSet)	
	{
		return createPatientMedicationLiteVoCollectionFromPatientMedication(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientMedication objects.
	 */
	public static ims.core.vo.PatientMedicationLiteVoCollection createPatientMedicationLiteVoCollectionFromPatientMedication(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatientMedicationLiteVoCollection voList = new ims.core.vo.PatientMedicationLiteVoCollection();
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
			ims.core.vo.PatientMedicationLiteVo vo = create(map, domainObject);
			
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
	public static ims.core.vo.PatientMedicationLiteVoCollection createPatientMedicationLiteVoCollectionFromPatientMedication(java.util.List domainObjectList) 
	{
		return createPatientMedicationLiteVoCollectionFromPatientMedication(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientMedication objects.
	 */
	public static ims.core.vo.PatientMedicationLiteVoCollection createPatientMedicationLiteVoCollectionFromPatientMedication(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatientMedicationLiteVoCollection voList = new ims.core.vo.PatientMedicationLiteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.PatientMedication domainObject = (ims.core.clinical.domain.objects.PatientMedication) domainObjectList.get(i);
			ims.core.vo.PatientMedicationLiteVo vo = create(map, domainObject);

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
	 public static java.util.Set extractPatientMedicationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientMedicationLiteVoCollection voCollection) 
	 {
	 	return extractPatientMedicationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientMedicationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientMedicationLiteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientMedicationLiteVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientMedication domainObject = PatientMedicationLiteVoAssembler.extractPatientMedication(domainFactory, vo, domMap);

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
	 public static java.util.List extractPatientMedicationList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientMedicationLiteVoCollection voCollection) 
	 {
	 	return extractPatientMedicationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientMedicationList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientMedicationLiteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientMedicationLiteVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientMedication domainObject = PatientMedicationLiteVoAssembler.extractPatientMedication(domainFactory, vo, domMap);

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
	 public static ims.core.vo.PatientMedicationLiteVo create(ims.core.clinical.domain.objects.PatientMedication domainObject) 
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
	  public static ims.core.vo.PatientMedicationLiteVo create(DomainObjectMap map, ims.core.clinical.domain.objects.PatientMedication domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PatientMedicationLiteVo valueObject = (ims.core.vo.PatientMedicationLiteVo) map.getValueObject(domainObject, ims.core.vo.PatientMedicationLiteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PatientMedicationLiteVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.core.vo.PatientMedicationLiteVo insert(ims.core.vo.PatientMedicationLiteVo valueObject, ims.core.clinical.domain.objects.PatientMedication domainObject) 
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
	 public static ims.core.vo.PatientMedicationLiteVo insert(DomainObjectMap map, ims.core.vo.PatientMedicationLiteVo valueObject, ims.core.clinical.domain.objects.PatientMedication domainObject) 
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
		ims.domain.lookups.LookupInstance instance5 = domainObject.getFrequency();
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

			ims.core.vo.lookups.MedicationFrequency voLookup5 = new ims.core.vo.lookups.MedicationFrequency(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.MedicationFrequency parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.MedicationFrequency(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setFrequency(voLookup5);
		}
				// SourceofInformation
		ims.domain.lookups.LookupInstance instance6 = domainObject.getSourceofInformation();
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

			ims.core.vo.lookups.SourceofInformation voLookup6 = new ims.core.vo.lookups.SourceofInformation(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.SourceofInformation parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.SourceofInformation(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setSourceofInformation(voLookup6);
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
	public static ims.core.clinical.domain.objects.PatientMedication extractPatientMedication(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientMedicationLiteVo valueObject) 
	{
		return 	extractPatientMedication(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.PatientMedication extractPatientMedication(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientMedicationLiteVo valueObject, HashMap domMap) 
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
			// ims.core.vo.PatientMedicationLiteVo ID_PatientMedication field is unknown
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
		domainObject.setPrescribedDoses(ims.core.vo.domain.MedicationDoseAssembler.extractPatientMedicationDoseList(domainFactory, valueObject.getPrescribedDoses(), domainObject.getPrescribedDoses(), domMap));		
		ims.core.patient.domain.objects.Patient value4 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value4 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getPatient();	
			}
			else
			{
				value4 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getFrequency() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getFrequency().getID());
		}
		domainObject.setFrequency(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getSourceofInformation() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getSourceofInformation().getID());
		}
		domainObject.setSourceofInformation(value6);
		java.util.Date value7 = null;
		ims.framework.utils.Date date7 = valueObject.getCommencedDate();		
		if ( date7 != null ) 
		{
			value7 = date7.getDate();
		}
		domainObject.setCommencedDate(value7);
		domainObject.setNoDaysSupply(valueObject.getNoDaysSupply());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getBatchNo() != null && valueObject.getBatchNo().equals(""))
		{
			valueObject.setBatchNo(null);
		}
		domainObject.setBatchNo(valueObject.getBatchNo());
		java.util.Date value10 = null;
		ims.framework.utils.Date date10 = valueObject.getExpiryDate();		
		if ( date10 != null ) 
		{
			value10 = date10.getDate();
		}
		domainObject.setExpiryDate(value10);
		domainObject.setIsDiscontinued(valueObject.getIsDiscontinued());

		return domainObject;
	}

}
