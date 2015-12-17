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
 * @author Peter Martin
 */
public class DiagnosisManagementVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.DiagnosisManagementVo copy(ims.RefMan.vo.DiagnosisManagementVo valueObjectDest, ims.RefMan.vo.DiagnosisManagementVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_DiagnosisManagement(valueObjectSrc.getID_DiagnosisManagement());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Diagnosis
		valueObjectDest.setDiagnosis(valueObjectSrc.getDiagnosis());
		// Procedures
		valueObjectDest.setProcedures(valueObjectSrc.getProcedures());
		// FirstDefinitiveTreatmentDate
		valueObjectDest.setFirstDefinitiveTreatmentDate(valueObjectSrc.getFirstDefinitiveTreatmentDate());
		// InvestigationsAndResults
		valueObjectDest.setInvestigationsAndResults(valueObjectSrc.getInvestigationsAndResults());
		// ManagementPlan
		valueObjectDest.setManagementPlan(valueObjectSrc.getManagementPlan());
		// AdviceAndInfoGiven
		valueObjectDest.setAdviceAndInfoGiven(valueObjectSrc.getAdviceAndInfoGiven());
		// ActionRequiredByGP
		valueObjectDest.setActionRequiredByGP(valueObjectSrc.getActionRequiredByGP());
		// ActionRequiredByGPNotes
		valueObjectDest.setActionRequiredByGPNotes(valueObjectSrc.getActionRequiredByGPNotes());
		// PatientConsent
		valueObjectDest.setPatientConsent(valueObjectSrc.getPatientConsent());
		// CatsReferral
		valueObjectDest.setCatsReferral(valueObjectSrc.getCatsReferral());
		// RecordingInformation
		valueObjectDest.setRecordingInformation(valueObjectSrc.getRecordingInformation());
		// LastAuthoringHCP
		valueObjectDest.setLastAuthoringHCP(valueObjectSrc.getLastAuthoringHCP());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createDiagnosisManagementVoCollectionFromDiagnosisManagement(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.DiagnosisManagement objects.
	 */
	public static ims.RefMan.vo.DiagnosisManagementVoCollection createDiagnosisManagementVoCollectionFromDiagnosisManagement(java.util.Set domainObjectSet)	
	{
		return createDiagnosisManagementVoCollectionFromDiagnosisManagement(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.DiagnosisManagement objects.
	 */
	public static ims.RefMan.vo.DiagnosisManagementVoCollection createDiagnosisManagementVoCollectionFromDiagnosisManagement(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.DiagnosisManagementVoCollection voList = new ims.RefMan.vo.DiagnosisManagementVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.DiagnosisManagement domainObject = (ims.RefMan.domain.objects.DiagnosisManagement) iterator.next();
			ims.RefMan.vo.DiagnosisManagementVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.DiagnosisManagement objects.
	 */
	public static ims.RefMan.vo.DiagnosisManagementVoCollection createDiagnosisManagementVoCollectionFromDiagnosisManagement(java.util.List domainObjectList) 
	{
		return createDiagnosisManagementVoCollectionFromDiagnosisManagement(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.DiagnosisManagement objects.
	 */
	public static ims.RefMan.vo.DiagnosisManagementVoCollection createDiagnosisManagementVoCollectionFromDiagnosisManagement(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.DiagnosisManagementVoCollection voList = new ims.RefMan.vo.DiagnosisManagementVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.DiagnosisManagement domainObject = (ims.RefMan.domain.objects.DiagnosisManagement) domainObjectList.get(i);
			ims.RefMan.vo.DiagnosisManagementVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.DiagnosisManagement set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractDiagnosisManagementSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.DiagnosisManagementVoCollection voCollection) 
	 {
	 	return extractDiagnosisManagementSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractDiagnosisManagementSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.DiagnosisManagementVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.DiagnosisManagementVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.DiagnosisManagement domainObject = DiagnosisManagementVoAssembler.extractDiagnosisManagement(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.DiagnosisManagement list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractDiagnosisManagementList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.DiagnosisManagementVoCollection voCollection) 
	 {
	 	return extractDiagnosisManagementList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractDiagnosisManagementList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.DiagnosisManagementVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.DiagnosisManagementVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.DiagnosisManagement domainObject = DiagnosisManagementVoAssembler.extractDiagnosisManagement(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.DiagnosisManagement object.
	 * @param domainObject ims.RefMan.domain.objects.DiagnosisManagement
	 */
	 public static ims.RefMan.vo.DiagnosisManagementVo create(ims.RefMan.domain.objects.DiagnosisManagement domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.DiagnosisManagement object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.DiagnosisManagementVo create(DomainObjectMap map, ims.RefMan.domain.objects.DiagnosisManagement domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.DiagnosisManagementVo valueObject = (ims.RefMan.vo.DiagnosisManagementVo) map.getValueObject(domainObject, ims.RefMan.vo.DiagnosisManagementVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.DiagnosisManagementVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.DiagnosisManagement
	 */
	 public static ims.RefMan.vo.DiagnosisManagementVo insert(ims.RefMan.vo.DiagnosisManagementVo valueObject, ims.RefMan.domain.objects.DiagnosisManagement domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.DiagnosisManagement
	 */
	 public static ims.RefMan.vo.DiagnosisManagementVo insert(DomainObjectMap map, ims.RefMan.vo.DiagnosisManagementVo valueObject, ims.RefMan.domain.objects.DiagnosisManagement domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_DiagnosisManagement(domainObject.getId());
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
			
		// Diagnosis
		valueObject.setDiagnosis(ims.core.vo.domain.PatientDiagnosisAtConsultationVoAssembler.createPatientDiagnosisAtConsultationVoCollectionFromPatientDiagnosis(map, domainObject.getDiagnosis()) );
		// Procedures
		valueObject.setProcedures(ims.core.vo.domain.PatientProcedureShortVoAssembler.createPatientProcedureShortVoCollectionFromPatientProcedure(map, domainObject.getProcedures()) );
		// FirstDefinitiveTreatmentDate
		java.util.Date FirstDefinitiveTreatmentDate = domainObject.getFirstDefinitiveTreatmentDate();
		if ( null != FirstDefinitiveTreatmentDate ) 
		{
			valueObject.setFirstDefinitiveTreatmentDate(new ims.framework.utils.Date(FirstDefinitiveTreatmentDate) );
		}
		// InvestigationsAndResults
		valueObject.setInvestigationsAndResults(domainObject.getInvestigationsAndResults());
		// ManagementPlan
		valueObject.setManagementPlan(domainObject.getManagementPlan());
		// AdviceAndInfoGiven
		valueObject.setAdviceAndInfoGiven(domainObject.getAdviceAndInfoGiven());
		// ActionRequiredByGP
		ims.domain.lookups.LookupInstance instance7 = domainObject.getActionRequiredByGP();
		if ( null != instance7 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance7.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance7.getImage().getImageId(), instance7.getImage().getImagePath());
			}
			color = instance7.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup7 = new ims.core.vo.lookups.YesNo(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup7 = voLookup7;
			ims.domain.lookups.LookupInstance parent7 = instance7.getParent();
			while (parent7 != null)
			{
				if (parent7.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent7.getImage().getImageId(), parent7.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent7.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup7.setParent(new ims.core.vo.lookups.YesNo(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setActionRequiredByGP(voLookup7);
		}
				// ActionRequiredByGPNotes
		valueObject.setActionRequiredByGPNotes(domainObject.getActionRequiredByGPNotes());
		// PatientConsent
		ims.domain.lookups.LookupInstance instance9 = domainObject.getPatientConsent();
		if ( null != instance9 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance9.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance9.getImage().getImageId(), instance9.getImage().getImagePath());
			}
			color = instance9.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup9 = new ims.core.vo.lookups.YesNo(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup9 = voLookup9;
			ims.domain.lookups.LookupInstance parent9 = instance9.getParent();
			while (parent9 != null)
			{
				if (parent9.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent9.getImage().getImageId(), parent9.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent9.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup9.setParent(new ims.core.vo.lookups.YesNo(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setPatientConsent(voLookup9);
		}
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
		// RecordingInformation
		valueObject.setRecordingInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getRecordingInformation()) );
		// LastAuthoringHCP
		valueObject.setLastAuthoringHCP(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getLastAuthoringHCP()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.DiagnosisManagement extractDiagnosisManagement(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.DiagnosisManagementVo valueObject) 
	{
		return 	extractDiagnosisManagement(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.DiagnosisManagement extractDiagnosisManagement(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.DiagnosisManagementVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_DiagnosisManagement();
		ims.RefMan.domain.objects.DiagnosisManagement domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.DiagnosisManagement)domMap.get(valueObject);
			}
			// ims.RefMan.vo.DiagnosisManagementVo ID_DiagnosisManagement field is unknown
			domainObject = new ims.RefMan.domain.objects.DiagnosisManagement();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_DiagnosisManagement());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.DiagnosisManagement)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.DiagnosisManagement) domainFactory.getDomainObject(ims.RefMan.domain.objects.DiagnosisManagement.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_DiagnosisManagement());

		domainObject.setDiagnosis(ims.core.vo.domain.PatientDiagnosisAtConsultationVoAssembler.extractPatientDiagnosisSet(domainFactory, valueObject.getDiagnosis(), domainObject.getDiagnosis(), domMap));		
		domainObject.setProcedures(ims.core.vo.domain.PatientProcedureShortVoAssembler.extractPatientProcedureSet(domainFactory, valueObject.getProcedures(), domainObject.getProcedures(), domMap));		
		java.util.Date value3 = null;
		ims.framework.utils.Date date3 = valueObject.getFirstDefinitiveTreatmentDate();		
		if ( date3 != null ) 
		{
			value3 = date3.getDate();
		}
		domainObject.setFirstDefinitiveTreatmentDate(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getInvestigationsAndResults() != null && valueObject.getInvestigationsAndResults().equals(""))
		{
			valueObject.setInvestigationsAndResults(null);
		}
		domainObject.setInvestigationsAndResults(valueObject.getInvestigationsAndResults());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getManagementPlan() != null && valueObject.getManagementPlan().equals(""))
		{
			valueObject.setManagementPlan(null);
		}
		domainObject.setManagementPlan(valueObject.getManagementPlan());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAdviceAndInfoGiven() != null && valueObject.getAdviceAndInfoGiven().equals(""))
		{
			valueObject.setAdviceAndInfoGiven(null);
		}
		domainObject.setAdviceAndInfoGiven(valueObject.getAdviceAndInfoGiven());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getActionRequiredByGP() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getActionRequiredByGP().getID());
		}
		domainObject.setActionRequiredByGP(value7);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getActionRequiredByGPNotes() != null && valueObject.getActionRequiredByGPNotes().equals(""))
		{
			valueObject.setActionRequiredByGPNotes(null);
		}
		domainObject.setActionRequiredByGPNotes(valueObject.getActionRequiredByGPNotes());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getPatientConsent() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getPatientConsent().getID());
		}
		domainObject.setPatientConsent(value9);
		ims.RefMan.domain.objects.CatsReferral value10 = null;
		if ( null != valueObject.getCatsReferral() ) 
		{
			if (valueObject.getCatsReferral().getBoId() == null)
			{
				if (domMap.get(valueObject.getCatsReferral()) != null)
				{
					value10 = (ims.RefMan.domain.objects.CatsReferral)domMap.get(valueObject.getCatsReferral());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value10 = domainObject.getCatsReferral();	
			}
			else
			{
				value10 = (ims.RefMan.domain.objects.CatsReferral)domainFactory.getDomainObject(ims.RefMan.domain.objects.CatsReferral.class, valueObject.getCatsReferral().getBoId());
			}
		}
		domainObject.setCatsReferral(value10);
		domainObject.setRecordingInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getRecordingInformation(), domMap));
		domainObject.setLastAuthoringHCP(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getLastAuthoringHCP(), domMap));

		return domainObject;
	}

}
