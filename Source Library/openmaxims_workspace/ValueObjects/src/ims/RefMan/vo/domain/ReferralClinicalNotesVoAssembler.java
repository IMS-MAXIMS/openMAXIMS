/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 16/04/2014, 12:31
 *
 */
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class ReferralClinicalNotesVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.ReferralClinicalNotesVo copy(ims.RefMan.vo.ReferralClinicalNotesVo valueObjectDest, ims.RefMan.vo.ReferralClinicalNotesVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ReferralClinicalNotes(valueObjectSrc.getID_ReferralClinicalNotes());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CatsReferral
		valueObjectDest.setCatsReferral(valueObjectSrc.getCatsReferral());
		// ClinicalNotes
		valueObjectDest.setClinicalNotes(valueObjectSrc.getClinicalNotes());
		// Diagnosis
		valueObjectDest.setDiagnosis(valueObjectSrc.getDiagnosis());
		// Procedures
		valueObjectDest.setProcedures(valueObjectSrc.getProcedures());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createReferralClinicalNotesVoCollectionFromReferralClinicalNotes(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.ReferralClinicalNotes objects.
	 */
	public static ims.RefMan.vo.ReferralClinicalNotesVoCollection createReferralClinicalNotesVoCollectionFromReferralClinicalNotes(java.util.Set domainObjectSet)	
	{
		return createReferralClinicalNotesVoCollectionFromReferralClinicalNotes(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.ReferralClinicalNotes objects.
	 */
	public static ims.RefMan.vo.ReferralClinicalNotesVoCollection createReferralClinicalNotesVoCollectionFromReferralClinicalNotes(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.ReferralClinicalNotesVoCollection voList = new ims.RefMan.vo.ReferralClinicalNotesVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.ReferralClinicalNotes domainObject = (ims.RefMan.domain.objects.ReferralClinicalNotes) iterator.next();
			ims.RefMan.vo.ReferralClinicalNotesVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.ReferralClinicalNotes objects.
	 */
	public static ims.RefMan.vo.ReferralClinicalNotesVoCollection createReferralClinicalNotesVoCollectionFromReferralClinicalNotes(java.util.List domainObjectList) 
	{
		return createReferralClinicalNotesVoCollectionFromReferralClinicalNotes(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.ReferralClinicalNotes objects.
	 */
	public static ims.RefMan.vo.ReferralClinicalNotesVoCollection createReferralClinicalNotesVoCollectionFromReferralClinicalNotes(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.ReferralClinicalNotesVoCollection voList = new ims.RefMan.vo.ReferralClinicalNotesVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.ReferralClinicalNotes domainObject = (ims.RefMan.domain.objects.ReferralClinicalNotes) domainObjectList.get(i);
			ims.RefMan.vo.ReferralClinicalNotesVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.ReferralClinicalNotes set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractReferralClinicalNotesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralClinicalNotesVoCollection voCollection) 
	 {
	 	return extractReferralClinicalNotesSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractReferralClinicalNotesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralClinicalNotesVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ReferralClinicalNotesVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.ReferralClinicalNotes domainObject = ReferralClinicalNotesVoAssembler.extractReferralClinicalNotes(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.ReferralClinicalNotes list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractReferralClinicalNotesList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralClinicalNotesVoCollection voCollection) 
	 {
	 	return extractReferralClinicalNotesList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractReferralClinicalNotesList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralClinicalNotesVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ReferralClinicalNotesVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.ReferralClinicalNotes domainObject = ReferralClinicalNotesVoAssembler.extractReferralClinicalNotes(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.ReferralClinicalNotes object.
	 * @param domainObject ims.RefMan.domain.objects.ReferralClinicalNotes
	 */
	 public static ims.RefMan.vo.ReferralClinicalNotesVo create(ims.RefMan.domain.objects.ReferralClinicalNotes domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.ReferralClinicalNotes object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.ReferralClinicalNotesVo create(DomainObjectMap map, ims.RefMan.domain.objects.ReferralClinicalNotes domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.ReferralClinicalNotesVo valueObject = (ims.RefMan.vo.ReferralClinicalNotesVo) map.getValueObject(domainObject, ims.RefMan.vo.ReferralClinicalNotesVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.ReferralClinicalNotesVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.ReferralClinicalNotes
	 */
	 public static ims.RefMan.vo.ReferralClinicalNotesVo insert(ims.RefMan.vo.ReferralClinicalNotesVo valueObject, ims.RefMan.domain.objects.ReferralClinicalNotes domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.ReferralClinicalNotes
	 */
	 public static ims.RefMan.vo.ReferralClinicalNotesVo insert(DomainObjectMap map, ims.RefMan.vo.ReferralClinicalNotesVo valueObject, ims.RefMan.domain.objects.ReferralClinicalNotes domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ReferralClinicalNotes(domainObject.getId());
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
		// ClinicalNotes
		valueObject.setClinicalNotes(ims.RefMan.vo.domain.AppointmentClinicalNotesVoAssembler.createAppointmentClinicalNotesVoCollectionFromAppointmentClinicalNotes(map, domainObject.getClinicalNotes()) );
		// Diagnosis
		valueObject.setDiagnosis(ims.RefMan.vo.domain.PatientDiagnosisApptDetailVoAssembler.createPatientDiagnosisApptDetailVoCollectionFromPatientDiagnosisApptDetail(map, domainObject.getDiagnosis()) );
		// Procedures
		valueObject.setProcedures(ims.RefMan.vo.domain.PatientProcedureApptDetailVoAssembler.createPatientProcedureApptDetailVoCollectionFromPatientProcedureApptDetail(map, domainObject.getProcedures()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.ReferralClinicalNotes extractReferralClinicalNotes(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralClinicalNotesVo valueObject) 
	{
		return 	extractReferralClinicalNotes(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.ReferralClinicalNotes extractReferralClinicalNotes(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralClinicalNotesVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ReferralClinicalNotes();
		ims.RefMan.domain.objects.ReferralClinicalNotes domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.ReferralClinicalNotes)domMap.get(valueObject);
			}
			// ims.RefMan.vo.ReferralClinicalNotesVo ID_ReferralClinicalNotes field is unknown
			domainObject = new ims.RefMan.domain.objects.ReferralClinicalNotes();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ReferralClinicalNotes());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.ReferralClinicalNotes)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.ReferralClinicalNotes) domainFactory.getDomainObject(ims.RefMan.domain.objects.ReferralClinicalNotes.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ReferralClinicalNotes());

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
		domainObject.setClinicalNotes(ims.RefMan.vo.domain.AppointmentClinicalNotesVoAssembler.extractAppointmentClinicalNotesSet(domainFactory, valueObject.getClinicalNotes(), domainObject.getClinicalNotes(), domMap));		
		domainObject.setDiagnosis(ims.RefMan.vo.domain.PatientDiagnosisApptDetailVoAssembler.extractPatientDiagnosisApptDetailSet(domainFactory, valueObject.getDiagnosis(), domainObject.getDiagnosis(), domMap));		
		domainObject.setProcedures(ims.RefMan.vo.domain.PatientProcedureApptDetailVoAssembler.extractPatientProcedureApptDetailSet(domainFactory, valueObject.getProcedures(), domainObject.getProcedures(), domMap));		

		return domainObject;
	}

}
