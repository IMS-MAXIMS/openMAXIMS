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
 * @author Rory Fitzpatrick
 */
public class BaselineObservationsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.BaselineObservationsVo copy(ims.RefMan.vo.BaselineObservationsVo valueObjectDest, ims.RefMan.vo.BaselineObservationsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_NursingNotes(valueObjectSrc.getID_NursingNotes());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CatsReferral
		valueObjectDest.setCatsReferral(valueObjectSrc.getCatsReferral());
		// AuthoringUser
		valueObjectDest.setAuthoringUser(valueObjectSrc.getAuthoringUser());
		// AuthoringDateTime
		valueObjectDest.setAuthoringDateTime(valueObjectSrc.getAuthoringDateTime());
		// VitalSigns
		valueObjectDest.setVitalSigns(valueObjectSrc.getVitalSigns());
		// SmokingStatus
		valueObjectDest.setSmokingStatus(valueObjectSrc.getSmokingStatus());
		// ObservationNotes
		valueObjectDest.setObservationNotes(valueObjectSrc.getObservationNotes());
		// SpecialNeeds
		valueObjectDest.setSpecialNeeds(valueObjectSrc.getSpecialNeeds());
		// Allergies
		valueObjectDest.setAllergies(valueObjectSrc.getAllergies());
		// AdviceGiven
		valueObjectDest.setAdviceGiven(valueObjectSrc.getAdviceGiven());
		// UnitsOfAlcoholConsumedPerWeek
		valueObjectDest.setUnitsOfAlcoholConsumedPerWeek(valueObjectSrc.getUnitsOfAlcoholConsumedPerWeek());
		// ReferredToSomkingCessation
		valueObjectDest.setReferredToSomkingCessation(valueObjectSrc.getReferredToSomkingCessation());
		// Comorbidities
		valueObjectDest.setComorbidities(valueObjectSrc.getComorbidities());
		// MRSAResult
		valueObjectDest.setMRSAResult(valueObjectSrc.getMRSAResult());
		// CurrentMedications
		valueObjectDest.setCurrentMedications(valueObjectSrc.getCurrentMedications());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createBaselineObservationsVoCollectionFromNursingNotes(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.NursingNotes objects.
	 */
	public static ims.RefMan.vo.BaselineObservationsVoCollection createBaselineObservationsVoCollectionFromNursingNotes(java.util.Set domainObjectSet)	
	{
		return createBaselineObservationsVoCollectionFromNursingNotes(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.NursingNotes objects.
	 */
	public static ims.RefMan.vo.BaselineObservationsVoCollection createBaselineObservationsVoCollectionFromNursingNotes(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.BaselineObservationsVoCollection voList = new ims.RefMan.vo.BaselineObservationsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.NursingNotes domainObject = (ims.RefMan.domain.objects.NursingNotes) iterator.next();
			ims.RefMan.vo.BaselineObservationsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.NursingNotes objects.
	 */
	public static ims.RefMan.vo.BaselineObservationsVoCollection createBaselineObservationsVoCollectionFromNursingNotes(java.util.List domainObjectList) 
	{
		return createBaselineObservationsVoCollectionFromNursingNotes(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.NursingNotes objects.
	 */
	public static ims.RefMan.vo.BaselineObservationsVoCollection createBaselineObservationsVoCollectionFromNursingNotes(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.BaselineObservationsVoCollection voList = new ims.RefMan.vo.BaselineObservationsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.NursingNotes domainObject = (ims.RefMan.domain.objects.NursingNotes) domainObjectList.get(i);
			ims.RefMan.vo.BaselineObservationsVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.NursingNotes set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractNursingNotesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.BaselineObservationsVoCollection voCollection) 
	 {
	 	return extractNursingNotesSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractNursingNotesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.BaselineObservationsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.BaselineObservationsVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.NursingNotes domainObject = BaselineObservationsVoAssembler.extractNursingNotes(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.NursingNotes list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractNursingNotesList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.BaselineObservationsVoCollection voCollection) 
	 {
	 	return extractNursingNotesList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractNursingNotesList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.BaselineObservationsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.BaselineObservationsVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.NursingNotes domainObject = BaselineObservationsVoAssembler.extractNursingNotes(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.NursingNotes object.
	 * @param domainObject ims.RefMan.domain.objects.NursingNotes
	 */
	 public static ims.RefMan.vo.BaselineObservationsVo create(ims.RefMan.domain.objects.NursingNotes domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.NursingNotes object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.BaselineObservationsVo create(DomainObjectMap map, ims.RefMan.domain.objects.NursingNotes domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.BaselineObservationsVo valueObject = (ims.RefMan.vo.BaselineObservationsVo) map.getValueObject(domainObject, ims.RefMan.vo.BaselineObservationsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.BaselineObservationsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.NursingNotes
	 */
	 public static ims.RefMan.vo.BaselineObservationsVo insert(ims.RefMan.vo.BaselineObservationsVo valueObject, ims.RefMan.domain.objects.NursingNotes domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.NursingNotes
	 */
	 public static ims.RefMan.vo.BaselineObservationsVo insert(DomainObjectMap map, ims.RefMan.vo.BaselineObservationsVo valueObject, ims.RefMan.domain.objects.NursingNotes domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_NursingNotes(domainObject.getId());
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
		valueObject.setAuthoringUser(ims.core.vo.domain.MemberOfStaffShortVoAssembler.create(map, domainObject.getAuthoringUser()) );
		// AuthoringDateTime
		java.util.Date AuthoringDateTime = domainObject.getAuthoringDateTime();
		if ( null != AuthoringDateTime ) 
		{
			valueObject.setAuthoringDateTime(new ims.framework.utils.DateTime(AuthoringDateTime) );
		}
		// VitalSigns
		valueObject.setVitalSigns(ims.core.vo.domain.VitalSignsVoAssembler.create(map, domainObject.getVitalSigns()) );
		// SmokingStatus
		ims.domain.lookups.LookupInstance instance5 = domainObject.getSmokingStatus();
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

			ims.core.vo.lookups.SmokingStatus voLookup5 = new ims.core.vo.lookups.SmokingStatus(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.SmokingStatus parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.SmokingStatus(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setSmokingStatus(voLookup5);
		}
				// ObservationNotes
		valueObject.setObservationNotes(domainObject.getObservationNotes());
		// SpecialNeeds
		valueObject.setSpecialNeeds(ims.clinical.vo.domain.PatientSpecialNeedVoAssembler.createPatientSpecialNeedVoCollectionFromPatientSpecialNeed(map, domainObject.getSpecialNeeds()) );
		// Allergies
		valueObject.setAllergies(ims.core.vo.domain.PatientAllergyAssembler.createPatientAllergyCollectionFromPatientAllergy(map, domainObject.getAllergies()) );
		// AdviceGiven
		valueObject.setAdviceGiven( domainObject.isAdviceGiven() );
		// UnitsOfAlcoholConsumedPerWeek
		valueObject.setUnitsOfAlcoholConsumedPerWeek(domainObject.getUnitsOfAlcoholConsumedPerWeek());
		// ReferredToSomkingCessation
		valueObject.setReferredToSomkingCessation( domainObject.isReferredToSomkingCessation() );
		// Comorbidities
		ims.core.clinical.vo.PatientDiagnosisRefVoCollection Comorbidities = new ims.core.clinical.vo.PatientDiagnosisRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getComorbidities().iterator(); iterator.hasNext(); ) 
		{
			ims.core.clinical.domain.objects.PatientDiagnosis tmp = (ims.core.clinical.domain.objects.PatientDiagnosis)iterator.next();
			if (tmp != null)
				Comorbidities.add(new ims.core.clinical.vo.PatientDiagnosisRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setComorbidities(Comorbidities);
		// MRSAResult
		ims.domain.lookups.LookupInstance instance13 = domainObject.getMRSAResult();
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

			ims.nursing.vo.lookups.MRSAResult voLookup13 = new ims.nursing.vo.lookups.MRSAResult(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.nursing.vo.lookups.MRSAResult parentVoLookup13 = voLookup13;
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
								parentVoLookup13.setParent(new ims.nursing.vo.lookups.MRSAResult(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setMRSAResult(voLookup13);
		}
				// CurrentMedications
		ims.core.clinical.vo.PatientMedicationRefVoCollection CurrentMedications = new ims.core.clinical.vo.PatientMedicationRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getCurrentMedications().iterator(); iterator.hasNext(); ) 
		{
			ims.core.clinical.domain.objects.PatientMedication tmp = (ims.core.clinical.domain.objects.PatientMedication)iterator.next();
			if (tmp != null)
				CurrentMedications.add(new ims.core.clinical.vo.PatientMedicationRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setCurrentMedications(CurrentMedications);
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.NursingNotes extractNursingNotes(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.BaselineObservationsVo valueObject) 
	{
		return 	extractNursingNotes(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.NursingNotes extractNursingNotes(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.BaselineObservationsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_NursingNotes();
		ims.RefMan.domain.objects.NursingNotes domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.NursingNotes)domMap.get(valueObject);
			}
			// ims.RefMan.vo.BaselineObservationsVo ID_NursingNotes field is unknown
			domainObject = new ims.RefMan.domain.objects.NursingNotes();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_NursingNotes());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.NursingNotes)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.NursingNotes) domainFactory.getDomainObject(ims.RefMan.domain.objects.NursingNotes.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_NursingNotes());

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
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value2 = null;
		if ( null != valueObject.getAuthoringUser() ) 
		{
			if (valueObject.getAuthoringUser().getBoId() == null)
			{
				if (domMap.get(valueObject.getAuthoringUser()) != null)
				{
					value2 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getAuthoringUser());
				}
			}
			else
			{
				value2 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getAuthoringUser().getBoId());
			}
		}
		domainObject.setAuthoringUser(value2);
		ims.framework.utils.DateTime dateTime3 = valueObject.getAuthoringDateTime();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setAuthoringDateTime(value3);
		domainObject.setVitalSigns(ims.core.vo.domain.VitalSignsVoAssembler.extractVitalSigns(domainFactory, valueObject.getVitalSigns(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getSmokingStatus() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getSmokingStatus().getID());
		}
		domainObject.setSmokingStatus(value5);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getObservationNotes() != null && valueObject.getObservationNotes().equals(""))
		{
			valueObject.setObservationNotes(null);
		}
		domainObject.setObservationNotes(valueObject.getObservationNotes());
		domainObject.setSpecialNeeds(ims.clinical.vo.domain.PatientSpecialNeedVoAssembler.extractPatientSpecialNeedSet(domainFactory, valueObject.getSpecialNeeds(), domainObject.getSpecialNeeds(), domMap));		
		domainObject.setAllergies(ims.core.vo.domain.PatientAllergyAssembler.extractPatientAllergySet(domainFactory, valueObject.getAllergies(), domainObject.getAllergies(), domMap));		
		domainObject.setAdviceGiven(valueObject.getAdviceGiven());
		domainObject.setUnitsOfAlcoholConsumedPerWeek(valueObject.getUnitsOfAlcoholConsumedPerWeek());
		domainObject.setReferredToSomkingCessation(valueObject.getReferredToSomkingCessation());

		ims.core.clinical.vo.PatientDiagnosisRefVoCollection refCollection12 = valueObject.getComorbidities();
		int size12 = (null == refCollection12) ? 0 : refCollection12.size();		
		java.util.Set domainComorbidities12 = domainObject.getComorbidities();
		if (domainComorbidities12 == null)
		{
			domainComorbidities12 = new java.util.HashSet();
		}
		java.util.Set newSet12  = new java.util.HashSet();
		for(int i=0; i<size12; i++) 
		{
			ims.core.clinical.vo.PatientDiagnosisRefVo vo = refCollection12.get(i);					
			ims.core.clinical.domain.objects.PatientDiagnosis dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.clinical.domain.objects.PatientDiagnosis)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.clinical.domain.objects.PatientDiagnosis)domainFactory.getDomainObject( ims.core.clinical.domain.objects.PatientDiagnosis.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainComorbidities12.contains(dom))
			{
				domainComorbidities12.add(dom);
			}
			newSet12.add(dom);			
		}
		java.util.Set removedSet12 = new java.util.HashSet();
		java.util.Iterator iter12 = domainComorbidities12.iterator();
		//Find out which objects need to be removed
		while (iter12.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter12.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet12.contains(o))
			{
				removedSet12.add(o);
			}
		}
		iter12 = removedSet12.iterator();
		//Remove the unwanted objects
		while (iter12.hasNext())
		{
			domainComorbidities12.remove(iter12.next());
		}		
		
		domainObject.setComorbidities(domainComorbidities12);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getMRSAResult() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getMRSAResult().getID());
		}
		domainObject.setMRSAResult(value13);

		ims.core.clinical.vo.PatientMedicationRefVoCollection refCollection14 = valueObject.getCurrentMedications();
		int size14 = (null == refCollection14) ? 0 : refCollection14.size();		
		java.util.Set domainCurrentMedications14 = domainObject.getCurrentMedications();
		if (domainCurrentMedications14 == null)
		{
			domainCurrentMedications14 = new java.util.HashSet();
		}
		java.util.Set newSet14  = new java.util.HashSet();
		for(int i=0; i<size14; i++) 
		{
			ims.core.clinical.vo.PatientMedicationRefVo vo = refCollection14.get(i);					
			ims.core.clinical.domain.objects.PatientMedication dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.clinical.domain.objects.PatientMedication)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.clinical.domain.objects.PatientMedication)domainFactory.getDomainObject( ims.core.clinical.domain.objects.PatientMedication.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainCurrentMedications14.contains(dom))
			{
				domainCurrentMedications14.add(dom);
			}
			newSet14.add(dom);			
		}
		java.util.Set removedSet14 = new java.util.HashSet();
		java.util.Iterator iter14 = domainCurrentMedications14.iterator();
		//Find out which objects need to be removed
		while (iter14.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter14.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet14.contains(o))
			{
				removedSet14.add(o);
			}
		}
		iter14 = removedSet14.iterator();
		//Remove the unwanted objects
		while (iter14.hasNext())
		{
			domainCurrentMedications14.remove(iter14.next());
		}		
		
		domainObject.setCurrentMedications(domainCurrentMedications14);		

		return domainObject;
	}

}
