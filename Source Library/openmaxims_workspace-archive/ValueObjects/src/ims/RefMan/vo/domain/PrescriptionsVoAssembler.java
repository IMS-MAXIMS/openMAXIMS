/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 16/04/2014, 12:32
 *
 */
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Catalin Tomozei
 */
public class PrescriptionsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.PrescriptionsVo copy(ims.RefMan.vo.PrescriptionsVo valueObjectDest, ims.RefMan.vo.PrescriptionsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Prescription(valueObjectSrc.getID_Prescription());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Medications
		valueObjectDest.setMedications(valueObjectSrc.getMedications());
		// isPrinted
		valueObjectDest.setIsPrinted(valueObjectSrc.getIsPrinted());
		// CatsReferral
		valueObjectDest.setCatsReferral(valueObjectSrc.getCatsReferral());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// RecordingInformation
		valueObjectDest.setRecordingInformation(valueObjectSrc.getRecordingInformation());
		// IsActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPrescriptionsVoCollectionFromPrescription(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.Prescription objects.
	 */
	public static ims.RefMan.vo.PrescriptionsVoCollection createPrescriptionsVoCollectionFromPrescription(java.util.Set domainObjectSet)	
	{
		return createPrescriptionsVoCollectionFromPrescription(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.Prescription objects.
	 */
	public static ims.RefMan.vo.PrescriptionsVoCollection createPrescriptionsVoCollectionFromPrescription(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.PrescriptionsVoCollection voList = new ims.RefMan.vo.PrescriptionsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.Prescription domainObject = (ims.RefMan.domain.objects.Prescription) iterator.next();
			ims.RefMan.vo.PrescriptionsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.Prescription objects.
	 */
	public static ims.RefMan.vo.PrescriptionsVoCollection createPrescriptionsVoCollectionFromPrescription(java.util.List domainObjectList) 
	{
		return createPrescriptionsVoCollectionFromPrescription(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.Prescription objects.
	 */
	public static ims.RefMan.vo.PrescriptionsVoCollection createPrescriptionsVoCollectionFromPrescription(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.PrescriptionsVoCollection voList = new ims.RefMan.vo.PrescriptionsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.Prescription domainObject = (ims.RefMan.domain.objects.Prescription) domainObjectList.get(i);
			ims.RefMan.vo.PrescriptionsVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.Prescription set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPrescriptionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PrescriptionsVoCollection voCollection) 
	 {
	 	return extractPrescriptionSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPrescriptionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PrescriptionsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PrescriptionsVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.Prescription domainObject = PrescriptionsVoAssembler.extractPrescription(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.Prescription list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPrescriptionList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PrescriptionsVoCollection voCollection) 
	 {
	 	return extractPrescriptionList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPrescriptionList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PrescriptionsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PrescriptionsVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.Prescription domainObject = PrescriptionsVoAssembler.extractPrescription(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.Prescription object.
	 * @param domainObject ims.RefMan.domain.objects.Prescription
	 */
	 public static ims.RefMan.vo.PrescriptionsVo create(ims.RefMan.domain.objects.Prescription domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.Prescription object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.PrescriptionsVo create(DomainObjectMap map, ims.RefMan.domain.objects.Prescription domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.PrescriptionsVo valueObject = (ims.RefMan.vo.PrescriptionsVo) map.getValueObject(domainObject, ims.RefMan.vo.PrescriptionsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.PrescriptionsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.Prescription
	 */
	 public static ims.RefMan.vo.PrescriptionsVo insert(ims.RefMan.vo.PrescriptionsVo valueObject, ims.RefMan.domain.objects.Prescription domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.Prescription
	 */
	 public static ims.RefMan.vo.PrescriptionsVo insert(DomainObjectMap map, ims.RefMan.vo.PrescriptionsVo valueObject, ims.RefMan.domain.objects.Prescription domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Prescription(domainObject.getId());
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
			
		// Medications
		valueObject.setMedications(ims.core.vo.domain.PatientMedicationLiteVoAssembler.createPatientMedicationLiteVoCollectionFromPatientMedication(map, domainObject.getMedications()) );
		// isPrinted
		valueObject.setIsPrinted( domainObject.isIsPrinted() );
		// CatsReferral
		if (domainObject.getCatsReferral() != null)
		{
			if(domainObject.getCatsReferral() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCatsReferral();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCatsReferral(new ims.RefMan.vo.CatsReferralRefVo(id, -1));				
			}
			else
			{
				valueObject.setCatsReferral(new ims.RefMan.vo.CatsReferralRefVo(domainObject.getCatsReferral().getId(), domainObject.getCatsReferral().getVersion()));
			}
		}
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// RecordingInformation
		valueObject.setRecordingInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getRecordingInformation()) );
		// IsActive
		valueObject.setIsActive( domainObject.isIsActive() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.Prescription extractPrescription(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PrescriptionsVo valueObject) 
	{
		return 	extractPrescription(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.Prescription extractPrescription(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PrescriptionsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Prescription();
		ims.RefMan.domain.objects.Prescription domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.Prescription)domMap.get(valueObject);
			}
			// ims.RefMan.vo.PrescriptionsVo ID_Prescription field is unknown
			domainObject = new ims.RefMan.domain.objects.Prescription();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Prescription());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.Prescription)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.Prescription) domainFactory.getDomainObject(ims.RefMan.domain.objects.Prescription.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Prescription());

		domainObject.setMedications(ims.core.vo.domain.PatientMedicationLiteVoAssembler.extractPatientMedicationList(domainFactory, valueObject.getMedications(), domainObject.getMedications(), domMap));		
		domainObject.setIsPrinted(valueObject.getIsPrinted());
		ims.RefMan.domain.objects.CatsReferral value3 = null;
		if ( null != valueObject.getCatsReferral() ) 
		{
			if (valueObject.getCatsReferral().getBoId() == null)
			{
				if (domMap.get(valueObject.getCatsReferral()) != null)
				{
					value3 = (ims.RefMan.domain.objects.CatsReferral)domMap.get(valueObject.getCatsReferral());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getCatsReferral();	
			}
			else
			{
				value3 = (ims.RefMan.domain.objects.CatsReferral)domainFactory.getDomainObject(ims.RefMan.domain.objects.CatsReferral.class, valueObject.getCatsReferral().getBoId());
			}
		}
		domainObject.setCatsReferral(value3);
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		domainObject.setRecordingInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getRecordingInformation(), domMap));
		domainObject.setIsActive(valueObject.getIsActive());

		return domainObject;
	}

}
