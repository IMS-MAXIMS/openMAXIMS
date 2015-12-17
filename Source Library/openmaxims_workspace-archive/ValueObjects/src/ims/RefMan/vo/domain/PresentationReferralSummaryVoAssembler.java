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
 * @author Aidan Mc Donnell
 */
public class PresentationReferralSummaryVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.PresentationReferralSummaryVo copy(ims.RefMan.vo.PresentationReferralSummaryVo valueObjectDest, ims.RefMan.vo.PresentationReferralSummaryVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PresentationReferralSummary(valueObjectSrc.getID_PresentationReferralSummary());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CatsReferral
		valueObjectDest.setCatsReferral(valueObjectSrc.getCatsReferral());
		// AuthoringUser
		valueObjectDest.setAuthoringUser(valueObjectSrc.getAuthoringUser());
		// AuthoringDateTime
		valueObjectDest.setAuthoringDateTime(valueObjectSrc.getAuthoringDateTime());
		// PresentingIssues
		valueObjectDest.setPresentingIssues(valueObjectSrc.getPresentingIssues());
		// MedicationOnReferral
		valueObjectDest.setMedicationOnReferral(valueObjectSrc.getMedicationOnReferral());
		// Allergies
		valueObjectDest.setAllergies(valueObjectSrc.getAllergies());
		// PresentingIssuesNonIndicated
		valueObjectDest.setPresentingIssuesNonIndicated(valueObjectSrc.getPresentingIssuesNonIndicated());
		// MedicationNonIndicated
		valueObjectDest.setMedicationNonIndicated(valueObjectSrc.getMedicationNonIndicated());
		// AllergiesIssuesNonIndicated
		valueObjectDest.setAllergiesIssuesNonIndicated(valueObjectSrc.getAllergiesIssuesNonIndicated());
		// ComorbiditiesIssuesNonIndicated
		valueObjectDest.setComorbiditiesIssuesNonIndicated(valueObjectSrc.getComorbiditiesIssuesNonIndicated());
		// Comorbidities
		valueObjectDest.setComorbidities(valueObjectSrc.getComorbidities());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPresentationReferralSummaryVoCollectionFromPresentationReferralSummary(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.PresentationReferralSummary objects.
	 */
	public static ims.RefMan.vo.PresentationReferralSummaryVoCollection createPresentationReferralSummaryVoCollectionFromPresentationReferralSummary(java.util.Set domainObjectSet)	
	{
		return createPresentationReferralSummaryVoCollectionFromPresentationReferralSummary(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.PresentationReferralSummary objects.
	 */
	public static ims.RefMan.vo.PresentationReferralSummaryVoCollection createPresentationReferralSummaryVoCollectionFromPresentationReferralSummary(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.PresentationReferralSummaryVoCollection voList = new ims.RefMan.vo.PresentationReferralSummaryVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.PresentationReferralSummary domainObject = (ims.RefMan.domain.objects.PresentationReferralSummary) iterator.next();
			ims.RefMan.vo.PresentationReferralSummaryVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.PresentationReferralSummary objects.
	 */
	public static ims.RefMan.vo.PresentationReferralSummaryVoCollection createPresentationReferralSummaryVoCollectionFromPresentationReferralSummary(java.util.List domainObjectList) 
	{
		return createPresentationReferralSummaryVoCollectionFromPresentationReferralSummary(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.PresentationReferralSummary objects.
	 */
	public static ims.RefMan.vo.PresentationReferralSummaryVoCollection createPresentationReferralSummaryVoCollectionFromPresentationReferralSummary(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.PresentationReferralSummaryVoCollection voList = new ims.RefMan.vo.PresentationReferralSummaryVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.PresentationReferralSummary domainObject = (ims.RefMan.domain.objects.PresentationReferralSummary) domainObjectList.get(i);
			ims.RefMan.vo.PresentationReferralSummaryVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.PresentationReferralSummary set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPresentationReferralSummarySet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PresentationReferralSummaryVoCollection voCollection) 
	 {
	 	return extractPresentationReferralSummarySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPresentationReferralSummarySet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PresentationReferralSummaryVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PresentationReferralSummaryVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.PresentationReferralSummary domainObject = PresentationReferralSummaryVoAssembler.extractPresentationReferralSummary(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.PresentationReferralSummary list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPresentationReferralSummaryList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PresentationReferralSummaryVoCollection voCollection) 
	 {
	 	return extractPresentationReferralSummaryList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPresentationReferralSummaryList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PresentationReferralSummaryVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PresentationReferralSummaryVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.PresentationReferralSummary domainObject = PresentationReferralSummaryVoAssembler.extractPresentationReferralSummary(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.PresentationReferralSummary object.
	 * @param domainObject ims.RefMan.domain.objects.PresentationReferralSummary
	 */
	 public static ims.RefMan.vo.PresentationReferralSummaryVo create(ims.RefMan.domain.objects.PresentationReferralSummary domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.PresentationReferralSummary object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.PresentationReferralSummaryVo create(DomainObjectMap map, ims.RefMan.domain.objects.PresentationReferralSummary domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.PresentationReferralSummaryVo valueObject = (ims.RefMan.vo.PresentationReferralSummaryVo) map.getValueObject(domainObject, ims.RefMan.vo.PresentationReferralSummaryVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.PresentationReferralSummaryVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.PresentationReferralSummary
	 */
	 public static ims.RefMan.vo.PresentationReferralSummaryVo insert(ims.RefMan.vo.PresentationReferralSummaryVo valueObject, ims.RefMan.domain.objects.PresentationReferralSummary domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.PresentationReferralSummary
	 */
	 public static ims.RefMan.vo.PresentationReferralSummaryVo insert(DomainObjectMap map, ims.RefMan.vo.PresentationReferralSummaryVo valueObject, ims.RefMan.domain.objects.PresentationReferralSummary domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PresentationReferralSummary(domainObject.getId());
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
		// AuthoringUser
		valueObject.setAuthoringUser(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getAuthoringUser()) );
		// AuthoringDateTime
		java.util.Date AuthoringDateTime = domainObject.getAuthoringDateTime();
		if ( null != AuthoringDateTime ) 
		{
			valueObject.setAuthoringDateTime(new ims.framework.utils.DateTime(AuthoringDateTime) );
		}
		// PresentingIssues
		valueObject.setPresentingIssues(ims.clinical.vo.domain.PatientComplaintVoAssembler.createPatientComplaintVoCollectionFromPatientComplaint(map, domainObject.getPresentingIssues()) );
		// MedicationOnReferral
		valueObject.setMedicationOnReferral(ims.core.vo.domain.PatientMedicationLiteVoAssembler.createPatientMedicationLiteVoCollectionFromPatientMedication(map, domainObject.getMedicationOnReferral()) );
		// Allergies
		valueObject.setAllergies(ims.core.vo.domain.PatientAllergyAssembler.createPatientAllergyCollectionFromPatientAllergy(map, domainObject.getAllergies()) );
		// PresentingIssuesNonIndicated
		valueObject.setPresentingIssuesNonIndicated( domainObject.isPresentingIssuesNonIndicated() );
		// MedicationNonIndicated
		valueObject.setMedicationNonIndicated( domainObject.isMedicationNonIndicated() );
		// AllergiesIssuesNonIndicated
		valueObject.setAllergiesIssuesNonIndicated( domainObject.isAllergiesIssuesNonIndicated() );
		// ComorbiditiesIssuesNonIndicated
		valueObject.setComorbiditiesIssuesNonIndicated( domainObject.isComorbiditiesIssuesNonIndicated() );
		// Comorbidities
		valueObject.setComorbidities(ims.core.vo.domain.PatientDiagnosisLiteVoAssembler.createPatientDiagnosisLiteVoCollectionFromPatientDiagnosis(map, domainObject.getComorbidities()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.PresentationReferralSummary extractPresentationReferralSummary(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PresentationReferralSummaryVo valueObject) 
	{
		return 	extractPresentationReferralSummary(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.PresentationReferralSummary extractPresentationReferralSummary(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PresentationReferralSummaryVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PresentationReferralSummary();
		ims.RefMan.domain.objects.PresentationReferralSummary domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.PresentationReferralSummary)domMap.get(valueObject);
			}
			// ims.RefMan.vo.PresentationReferralSummaryVo ID_PresentationReferralSummary field is unknown
			domainObject = new ims.RefMan.domain.objects.PresentationReferralSummary();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PresentationReferralSummary());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.PresentationReferralSummary)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.PresentationReferralSummary) domainFactory.getDomainObject(ims.RefMan.domain.objects.PresentationReferralSummary.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PresentationReferralSummary());

		ims.RefMan.domain.objects.CatsReferral value1 = null;
		if ( null != valueObject.getCatsReferral() ) 
		{
			if (valueObject.getCatsReferral().getBoId() == null)
			{
				if (domMap.get(valueObject.getCatsReferral()) != null)
				{
					value1 = (ims.RefMan.domain.objects.CatsReferral)domMap.get(valueObject.getCatsReferral());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getCatsReferral();	
			}
			else
			{
				value1 = (ims.RefMan.domain.objects.CatsReferral)domainFactory.getDomainObject(ims.RefMan.domain.objects.CatsReferral.class, valueObject.getCatsReferral().getBoId());
			}
		}
		domainObject.setCatsReferral(value1);
		domainObject.setAuthoringUser(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.extractMemberOfStaff(domainFactory, valueObject.getAuthoringUser(), domMap));
		ims.framework.utils.DateTime dateTime3 = valueObject.getAuthoringDateTime();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setAuthoringDateTime(value3);
		domainObject.setPresentingIssues(ims.clinical.vo.domain.PatientComplaintVoAssembler.extractPatientComplaintSet(domainFactory, valueObject.getPresentingIssues(), domainObject.getPresentingIssues(), domMap));		
		domainObject.setMedicationOnReferral(ims.core.vo.domain.PatientMedicationLiteVoAssembler.extractPatientMedicationSet(domainFactory, valueObject.getMedicationOnReferral(), domainObject.getMedicationOnReferral(), domMap));		
		domainObject.setAllergies(ims.core.vo.domain.PatientAllergyAssembler.extractPatientAllergySet(domainFactory, valueObject.getAllergies(), domainObject.getAllergies(), domMap));		
		domainObject.setPresentingIssuesNonIndicated(valueObject.getPresentingIssuesNonIndicated());
		domainObject.setMedicationNonIndicated(valueObject.getMedicationNonIndicated());
		domainObject.setAllergiesIssuesNonIndicated(valueObject.getAllergiesIssuesNonIndicated());
		domainObject.setComorbiditiesIssuesNonIndicated(valueObject.getComorbiditiesIssuesNonIndicated());
		domainObject.setComorbidities(ims.core.vo.domain.PatientDiagnosisLiteVoAssembler.extractPatientDiagnosisSet(domainFactory, valueObject.getComorbidities(), domainObject.getComorbidities(), domMap));		

		return domainObject;
	}

}
