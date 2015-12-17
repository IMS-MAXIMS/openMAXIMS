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
 * @author Cristian Belciug
 */
public class CSPrimaryDiagnosisForClinicalNotesVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.CSPrimaryDiagnosisForClinicalNotesVo copy(ims.RefMan.vo.CSPrimaryDiagnosisForClinicalNotesVo valueObjectDest, ims.RefMan.vo.CSPrimaryDiagnosisForClinicalNotesVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CsPrimaryDiagnosis(valueObjectSrc.getID_CsPrimaryDiagnosis());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// Diagnosis
		valueObjectDest.setDiagnosis(valueObjectSrc.getDiagnosis());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// EpisodeOfCare
		valueObjectDest.setEpisodeOfCare(valueObjectSrc.getEpisodeOfCare());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCSPrimaryDiagnosisForClinicalNotesVoCollectionFromCsPrimaryDiagnosis(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.CsPrimaryDiagnosis objects.
	 */
	public static ims.RefMan.vo.CSPrimaryDiagnosisForClinicalNotesVoCollection createCSPrimaryDiagnosisForClinicalNotesVoCollectionFromCsPrimaryDiagnosis(java.util.Set domainObjectSet)	
	{
		return createCSPrimaryDiagnosisForClinicalNotesVoCollectionFromCsPrimaryDiagnosis(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.CsPrimaryDiagnosis objects.
	 */
	public static ims.RefMan.vo.CSPrimaryDiagnosisForClinicalNotesVoCollection createCSPrimaryDiagnosisForClinicalNotesVoCollectionFromCsPrimaryDiagnosis(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.CSPrimaryDiagnosisForClinicalNotesVoCollection voList = new ims.RefMan.vo.CSPrimaryDiagnosisForClinicalNotesVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.CsPrimaryDiagnosis domainObject = (ims.core.clinical.domain.objects.CsPrimaryDiagnosis) iterator.next();
			ims.RefMan.vo.CSPrimaryDiagnosisForClinicalNotesVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.CsPrimaryDiagnosis objects.
	 */
	public static ims.RefMan.vo.CSPrimaryDiagnosisForClinicalNotesVoCollection createCSPrimaryDiagnosisForClinicalNotesVoCollectionFromCsPrimaryDiagnosis(java.util.List domainObjectList) 
	{
		return createCSPrimaryDiagnosisForClinicalNotesVoCollectionFromCsPrimaryDiagnosis(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.CsPrimaryDiagnosis objects.
	 */
	public static ims.RefMan.vo.CSPrimaryDiagnosisForClinicalNotesVoCollection createCSPrimaryDiagnosisForClinicalNotesVoCollectionFromCsPrimaryDiagnosis(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.CSPrimaryDiagnosisForClinicalNotesVoCollection voList = new ims.RefMan.vo.CSPrimaryDiagnosisForClinicalNotesVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.CsPrimaryDiagnosis domainObject = (ims.core.clinical.domain.objects.CsPrimaryDiagnosis) domainObjectList.get(i);
			ims.RefMan.vo.CSPrimaryDiagnosisForClinicalNotesVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.CsPrimaryDiagnosis set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractCsPrimaryDiagnosisSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CSPrimaryDiagnosisForClinicalNotesVoCollection voCollection) 
	 {
	 	return extractCsPrimaryDiagnosisSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCsPrimaryDiagnosisSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CSPrimaryDiagnosisForClinicalNotesVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.CSPrimaryDiagnosisForClinicalNotesVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.CsPrimaryDiagnosis domainObject = CSPrimaryDiagnosisForClinicalNotesVoAssembler.extractCsPrimaryDiagnosis(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.CsPrimaryDiagnosis list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractCsPrimaryDiagnosisList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CSPrimaryDiagnosisForClinicalNotesVoCollection voCollection) 
	 {
	 	return extractCsPrimaryDiagnosisList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCsPrimaryDiagnosisList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CSPrimaryDiagnosisForClinicalNotesVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.CSPrimaryDiagnosisForClinicalNotesVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.CsPrimaryDiagnosis domainObject = CSPrimaryDiagnosisForClinicalNotesVoAssembler.extractCsPrimaryDiagnosis(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.CsPrimaryDiagnosis object.
	 * @param domainObject ims.core.clinical.domain.objects.CsPrimaryDiagnosis
	 */
	 public static ims.RefMan.vo.CSPrimaryDiagnosisForClinicalNotesVo create(ims.core.clinical.domain.objects.CsPrimaryDiagnosis domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.CsPrimaryDiagnosis object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.CSPrimaryDiagnosisForClinicalNotesVo create(DomainObjectMap map, ims.core.clinical.domain.objects.CsPrimaryDiagnosis domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.CSPrimaryDiagnosisForClinicalNotesVo valueObject = (ims.RefMan.vo.CSPrimaryDiagnosisForClinicalNotesVo) map.getValueObject(domainObject, ims.RefMan.vo.CSPrimaryDiagnosisForClinicalNotesVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.CSPrimaryDiagnosisForClinicalNotesVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.CsPrimaryDiagnosis
	 */
	 public static ims.RefMan.vo.CSPrimaryDiagnosisForClinicalNotesVo insert(ims.RefMan.vo.CSPrimaryDiagnosisForClinicalNotesVo valueObject, ims.core.clinical.domain.objects.CsPrimaryDiagnosis domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.CsPrimaryDiagnosis
	 */
	 public static ims.RefMan.vo.CSPrimaryDiagnosisForClinicalNotesVo insert(DomainObjectMap map, ims.RefMan.vo.CSPrimaryDiagnosisForClinicalNotesVo valueObject, ims.core.clinical.domain.objects.CsPrimaryDiagnosis domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_CsPrimaryDiagnosis(domainObject.getId());
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
			
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
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
		// ClinicalContact
		if (domainObject.getClinicalContact() != null)
		{
			if(domainObject.getClinicalContact() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getClinicalContact();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(id, -1));				
			}
			else
			{
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(domainObject.getClinicalContact().getId(), domainObject.getClinicalContact().getVersion()));
			}
		}
		// Diagnosis
		if (domainObject.getDiagnosis() != null)
		{
			if(domainObject.getDiagnosis() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getDiagnosis();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setDiagnosis(new ims.core.clinical.vo.PatientDiagnosisRefVo(id, -1));				
			}
			else
			{
				valueObject.setDiagnosis(new ims.core.clinical.vo.PatientDiagnosisRefVo(domainObject.getDiagnosis().getId(), domainObject.getDiagnosis().getVersion()));
			}
		}
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
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
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.CsPrimaryDiagnosis extractCsPrimaryDiagnosis(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CSPrimaryDiagnosisForClinicalNotesVo valueObject) 
	{
		return 	extractCsPrimaryDiagnosis(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.CsPrimaryDiagnosis extractCsPrimaryDiagnosis(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CSPrimaryDiagnosisForClinicalNotesVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_CsPrimaryDiagnosis();
		ims.core.clinical.domain.objects.CsPrimaryDiagnosis domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.CsPrimaryDiagnosis)domMap.get(valueObject);
			}
			// ims.RefMan.vo.CSPrimaryDiagnosisForClinicalNotesVo ID_CsPrimaryDiagnosis field is unknown
			domainObject = new ims.core.clinical.domain.objects.CsPrimaryDiagnosis();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_CsPrimaryDiagnosis());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.CsPrimaryDiagnosis)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.CsPrimaryDiagnosis) domainFactory.getDomainObject(ims.core.clinical.domain.objects.CsPrimaryDiagnosis.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_CsPrimaryDiagnosis());

		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		ims.core.admin.domain.objects.CareContext value2 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value2 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getCareContext();	
			}
			else
			{
				value2 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value2);
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
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getClinicalContact();	
			}
			else
			{
				value3 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value3);
		ims.core.clinical.domain.objects.PatientDiagnosis value4 = null;
		if ( null != valueObject.getDiagnosis() ) 
		{
			if (valueObject.getDiagnosis().getBoId() == null)
			{
				if (domMap.get(valueObject.getDiagnosis()) != null)
				{
					value4 = (ims.core.clinical.domain.objects.PatientDiagnosis)domMap.get(valueObject.getDiagnosis());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getDiagnosis();	
			}
			else
			{
				value4 = (ims.core.clinical.domain.objects.PatientDiagnosis)domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientDiagnosis.class, valueObject.getDiagnosis().getBoId());
			}
		}
		domainObject.setDiagnosis(value4);
		domainObject.setIsActive(valueObject.getIsActive());
		ims.core.admin.domain.objects.EpisodeOfCare value6 = null;
		if ( null != valueObject.getEpisodeOfCare() ) 
		{
			if (valueObject.getEpisodeOfCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisodeOfCare()) != null)
				{
					value6 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisodeOfCare());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value6 = domainObject.getEpisodeOfCare();	
			}
			else
			{
				value6 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisodeOfCare().getBoId());
			}
		}
		domainObject.setEpisodeOfCare(value6);

		return domainObject;
	}

}
