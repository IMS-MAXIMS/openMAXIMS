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
public class TTAMedicationAndPharmacyVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.TTAMedicationAndPharmacyVo copy(ims.clinical.vo.TTAMedicationAndPharmacyVo valueObjectDest, ims.clinical.vo.TTAMedicationAndPharmacyVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_TTAMedicationAndPharmacy(valueObjectSrc.getID_TTAMedicationAndPharmacy());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TTAStatusHistory
		valueObjectDest.setTTAStatusHistory(valueObjectSrc.getTTAStatusHistory());
		// TTAMedications
		valueObjectDest.setTTAMedications(valueObjectSrc.getTTAMedications());
		// OrderingClinician
		valueObjectDest.setOrderingClinician(valueObjectSrc.getOrderingClinician());
		// ResponsiblePharmacist
		valueObjectDest.setResponsiblePharmacist(valueObjectSrc.getResponsiblePharmacist());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// BodyWeightKg
		valueObjectDest.setBodyWeightKg(valueObjectSrc.getBodyWeightKg());
		// ClinicalCommentsToPharmacy
		valueObjectDest.setClinicalCommentsToPharmacy(valueObjectSrc.getClinicalCommentsToPharmacy());
		// OrderingDateTime
		valueObjectDest.setOrderingDateTime(valueObjectSrc.getOrderingDateTime());
		// ClinicianBleepNo
		valueObjectDest.setClinicianBleepNo(valueObjectSrc.getClinicianBleepNo());
		// CurrentTTAStatus
		valueObjectDest.setCurrentTTAStatus(valueObjectSrc.getCurrentTTAStatus());
		// DateSubmittedToPharmacy
		valueObjectDest.setDateSubmittedToPharmacy(valueObjectSrc.getDateSubmittedToPharmacy());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTTAMedicationAndPharmacyVoCollectionFromTTAMedicationAndPharmacy(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.edischarge.domain.objects.TTAMedicationAndPharmacy objects.
	 */
	public static ims.clinical.vo.TTAMedicationAndPharmacyVoCollection createTTAMedicationAndPharmacyVoCollectionFromTTAMedicationAndPharmacy(java.util.Set domainObjectSet)	
	{
		return createTTAMedicationAndPharmacyVoCollectionFromTTAMedicationAndPharmacy(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.edischarge.domain.objects.TTAMedicationAndPharmacy objects.
	 */
	public static ims.clinical.vo.TTAMedicationAndPharmacyVoCollection createTTAMedicationAndPharmacyVoCollectionFromTTAMedicationAndPharmacy(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.TTAMedicationAndPharmacyVoCollection voList = new ims.clinical.vo.TTAMedicationAndPharmacyVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.edischarge.domain.objects.TTAMedicationAndPharmacy domainObject = (ims.edischarge.domain.objects.TTAMedicationAndPharmacy) iterator.next();
			ims.clinical.vo.TTAMedicationAndPharmacyVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.edischarge.domain.objects.TTAMedicationAndPharmacy objects.
	 */
	public static ims.clinical.vo.TTAMedicationAndPharmacyVoCollection createTTAMedicationAndPharmacyVoCollectionFromTTAMedicationAndPharmacy(java.util.List domainObjectList) 
	{
		return createTTAMedicationAndPharmacyVoCollectionFromTTAMedicationAndPharmacy(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.edischarge.domain.objects.TTAMedicationAndPharmacy objects.
	 */
	public static ims.clinical.vo.TTAMedicationAndPharmacyVoCollection createTTAMedicationAndPharmacyVoCollectionFromTTAMedicationAndPharmacy(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.TTAMedicationAndPharmacyVoCollection voList = new ims.clinical.vo.TTAMedicationAndPharmacyVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.edischarge.domain.objects.TTAMedicationAndPharmacy domainObject = (ims.edischarge.domain.objects.TTAMedicationAndPharmacy) domainObjectList.get(i);
			ims.clinical.vo.TTAMedicationAndPharmacyVo vo = create(map, domainObject);

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
	 * Create the ims.edischarge.domain.objects.TTAMedicationAndPharmacy set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTTAMedicationAndPharmacySet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TTAMedicationAndPharmacyVoCollection voCollection) 
	 {
	 	return extractTTAMedicationAndPharmacySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTTAMedicationAndPharmacySet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TTAMedicationAndPharmacyVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.TTAMedicationAndPharmacyVo vo = voCollection.get(i);
			ims.edischarge.domain.objects.TTAMedicationAndPharmacy domainObject = TTAMedicationAndPharmacyVoAssembler.extractTTAMedicationAndPharmacy(domainFactory, vo, domMap);

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
	 * Create the ims.edischarge.domain.objects.TTAMedicationAndPharmacy list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTTAMedicationAndPharmacyList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TTAMedicationAndPharmacyVoCollection voCollection) 
	 {
	 	return extractTTAMedicationAndPharmacyList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTTAMedicationAndPharmacyList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TTAMedicationAndPharmacyVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.TTAMedicationAndPharmacyVo vo = voCollection.get(i);
			ims.edischarge.domain.objects.TTAMedicationAndPharmacy domainObject = TTAMedicationAndPharmacyVoAssembler.extractTTAMedicationAndPharmacy(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.edischarge.domain.objects.TTAMedicationAndPharmacy object.
	 * @param domainObject ims.edischarge.domain.objects.TTAMedicationAndPharmacy
	 */
	 public static ims.clinical.vo.TTAMedicationAndPharmacyVo create(ims.edischarge.domain.objects.TTAMedicationAndPharmacy domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.edischarge.domain.objects.TTAMedicationAndPharmacy object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.TTAMedicationAndPharmacyVo create(DomainObjectMap map, ims.edischarge.domain.objects.TTAMedicationAndPharmacy domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.TTAMedicationAndPharmacyVo valueObject = (ims.clinical.vo.TTAMedicationAndPharmacyVo) map.getValueObject(domainObject, ims.clinical.vo.TTAMedicationAndPharmacyVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.TTAMedicationAndPharmacyVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.edischarge.domain.objects.TTAMedicationAndPharmacy
	 */
	 public static ims.clinical.vo.TTAMedicationAndPharmacyVo insert(ims.clinical.vo.TTAMedicationAndPharmacyVo valueObject, ims.edischarge.domain.objects.TTAMedicationAndPharmacy domainObject) 
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
	 * @param domainObject ims.edischarge.domain.objects.TTAMedicationAndPharmacy
	 */
	 public static ims.clinical.vo.TTAMedicationAndPharmacyVo insert(DomainObjectMap map, ims.clinical.vo.TTAMedicationAndPharmacyVo valueObject, ims.edischarge.domain.objects.TTAMedicationAndPharmacy domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_TTAMedicationAndPharmacy(domainObject.getId());
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
			
		// TTAStatusHistory
		valueObject.setTTAStatusHistory(ims.clinical.vo.domain.TTAStatusVoAssembler.createTTAStatusVoCollectionFromTTAStatus(map, domainObject.getTTAStatusHistory()) );
		// TTAMedications
		valueObject.setTTAMedications(ims.clinical.vo.domain.TTAMedicationDetailVoAssembler.createTTAMedicationDetailVoCollectionFromTTAMedicationDetail(map, domainObject.getTTAMedications()) );
		// OrderingClinician
		valueObject.setOrderingClinician(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getOrderingClinician()) );
		// ResponsiblePharmacist
		valueObject.setResponsiblePharmacist(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getResponsiblePharmacist()) );
		// Patient
		valueObject.setPatient(ims.core.vo.domain.PatientShortAssembler.create(map, domainObject.getPatient()) );
		// CareContext
		valueObject.setCareContext(ims.core.vo.domain.CareContextLiteVoAssembler.create(map, domainObject.getCareContext()) );
		// BodyWeightKg
		valueObject.setBodyWeightKg(domainObject.getBodyWeightKg());
		// ClinicalCommentsToPharmacy
		valueObject.setClinicalCommentsToPharmacy(domainObject.getClinicalCommentsToPharmacy());
		// OrderingDateTime
		java.util.Date OrderingDateTime = domainObject.getOrderingDateTime();
		if ( null != OrderingDateTime ) 
		{
			valueObject.setOrderingDateTime(new ims.framework.utils.DateTime(OrderingDateTime) );
		}
		// ClinicianBleepNo
		valueObject.setClinicianBleepNo(domainObject.getClinicianBleepNo());
		// CurrentTTAStatus
		valueObject.setCurrentTTAStatus(ims.clinical.vo.domain.TTAStatusVoAssembler.create(map, domainObject.getCurrentTTAStatus()) );
		// DateSubmittedToPharmacy
		java.util.Date DateSubmittedToPharmacy = domainObject.getDateSubmittedToPharmacy();
		if ( null != DateSubmittedToPharmacy ) 
		{
			valueObject.setDateSubmittedToPharmacy(new ims.framework.utils.Date(DateSubmittedToPharmacy) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.edischarge.domain.objects.TTAMedicationAndPharmacy extractTTAMedicationAndPharmacy(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TTAMedicationAndPharmacyVo valueObject) 
	{
		return 	extractTTAMedicationAndPharmacy(domainFactory, valueObject, new HashMap());
	}

	public static ims.edischarge.domain.objects.TTAMedicationAndPharmacy extractTTAMedicationAndPharmacy(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TTAMedicationAndPharmacyVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_TTAMedicationAndPharmacy();
		ims.edischarge.domain.objects.TTAMedicationAndPharmacy domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.edischarge.domain.objects.TTAMedicationAndPharmacy)domMap.get(valueObject);
			}
			// ims.clinical.vo.TTAMedicationAndPharmacyVo ID_TTAMedicationAndPharmacy field is unknown
			domainObject = new ims.edischarge.domain.objects.TTAMedicationAndPharmacy();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_TTAMedicationAndPharmacy());
			if (domMap.get(key) != null)
			{
				return (ims.edischarge.domain.objects.TTAMedicationAndPharmacy)domMap.get(key);
			}
			domainObject = (ims.edischarge.domain.objects.TTAMedicationAndPharmacy) domainFactory.getDomainObject(ims.edischarge.domain.objects.TTAMedicationAndPharmacy.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_TTAMedicationAndPharmacy());

		domainObject.setTTAStatusHistory(ims.clinical.vo.domain.TTAStatusVoAssembler.extractTTAStatusSet(domainFactory, valueObject.getTTAStatusHistory(), domainObject.getTTAStatusHistory(), domMap));		
		domainObject.setTTAMedications(ims.clinical.vo.domain.TTAMedicationDetailVoAssembler.extractTTAMedicationDetailList(domainFactory, valueObject.getTTAMedications(), domainObject.getTTAMedications(), domMap));		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value3 = null;
		if ( null != valueObject.getOrderingClinician() ) 
		{
			if (valueObject.getOrderingClinician().getBoId() == null)
			{
				if (domMap.get(valueObject.getOrderingClinician()) != null)
				{
					value3 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getOrderingClinician());
				}
			}
			else
			{
				value3 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getOrderingClinician().getBoId());
			}
		}
		domainObject.setOrderingClinician(value3);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value4 = null;
		if ( null != valueObject.getResponsiblePharmacist() ) 
		{
			if (valueObject.getResponsiblePharmacist().getBoId() == null)
			{
				if (domMap.get(valueObject.getResponsiblePharmacist()) != null)
				{
					value4 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getResponsiblePharmacist());
				}
			}
			else
			{
				value4 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getResponsiblePharmacist().getBoId());
			}
		}
		domainObject.setResponsiblePharmacist(value4);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.patient.domain.objects.Patient value5 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value5 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else
			{
				value5 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value5);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.CareContext value6 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value6 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else
			{
				value6 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value6);
		domainObject.setBodyWeightKg(valueObject.getBodyWeightKg());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getClinicalCommentsToPharmacy() != null && valueObject.getClinicalCommentsToPharmacy().equals(""))
		{
			valueObject.setClinicalCommentsToPharmacy(null);
		}
		domainObject.setClinicalCommentsToPharmacy(valueObject.getClinicalCommentsToPharmacy());
		ims.framework.utils.DateTime dateTime9 = valueObject.getOrderingDateTime();
		java.util.Date value9 = null;
		if ( dateTime9 != null ) 
		{
			value9 = dateTime9.getJavaDate();
		}
		domainObject.setOrderingDateTime(value9);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getClinicianBleepNo() != null && valueObject.getClinicianBleepNo().equals(""))
		{
			valueObject.setClinicianBleepNo(null);
		}
		domainObject.setClinicianBleepNo(valueObject.getClinicianBleepNo());
		domainObject.setCurrentTTAStatus(ims.clinical.vo.domain.TTAStatusVoAssembler.extractTTAStatus(domainFactory, valueObject.getCurrentTTAStatus(), domMap));
		java.util.Date value12 = null;
		ims.framework.utils.Date date12 = valueObject.getDateSubmittedToPharmacy();		
		if ( date12 != null ) 
		{
			value12 = date12.getDate();
		}
		domainObject.setDateSubmittedToPharmacy(value12);

		return domainObject;
	}

}
