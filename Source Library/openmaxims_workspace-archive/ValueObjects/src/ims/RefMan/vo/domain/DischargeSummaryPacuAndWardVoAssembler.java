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
 * @author George Cristian Josan
 */
public class DischargeSummaryPacuAndWardVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.DischargeSummaryPacuAndWardVo copy(ims.RefMan.vo.DischargeSummaryPacuAndWardVo valueObjectDest, ims.RefMan.vo.DischargeSummaryPacuAndWardVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_DischargeSummaryPacuAndWard(valueObjectSrc.getID_DischargeSummaryPacuAndWard());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AdmissionSummary
		valueObjectDest.setAdmissionSummary(valueObjectSrc.getAdmissionSummary());
		// Diagnosis
		valueObjectDest.setDiagnosis(valueObjectSrc.getDiagnosis());
		// MedicationOnDischarge
		valueObjectDest.setMedicationOnDischarge(valueObjectSrc.getMedicationOnDischarge());
		// ProblemsAndNeeds
		valueObjectDest.setProblemsAndNeeds(valueObjectSrc.getProblemsAndNeeds());
		// AdditionalComments
		valueObjectDest.setAdditionalComments(valueObjectSrc.getAdditionalComments());
		// DressingsAndAids
		valueObjectDest.setDressingsAndAids(valueObjectSrc.getDressingsAndAids());
		// FollowupType
		valueObjectDest.setFollowupType(valueObjectSrc.getFollowupType());
		// FurtherManagementInstructions
		valueObjectDest.setFurtherManagementInstructions(valueObjectSrc.getFurtherManagementInstructions());
		// MedicallyIncomplete
		valueObjectDest.setMedicallyIncomplete(valueObjectSrc.getMedicallyIncomplete());
		// IncompleteNoOfDays
		valueObjectDest.setIncompleteNoOfDays(valueObjectSrc.getIncompleteNoOfDays());
		// CurrentOnwardReferral
		valueObjectDest.setCurrentOnwardReferral(valueObjectSrc.getCurrentOnwardReferral());
		// OnwardReferrals
		valueObjectDest.setOnwardReferrals(valueObjectSrc.getOnwardReferrals());
		// ActionsforGPandCommunity
		valueObjectDest.setActionsforGPandCommunity(valueObjectSrc.getActionsforGPandCommunity());
		// CatsReferral
		valueObjectDest.setCatsReferral(valueObjectSrc.getCatsReferral());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// DischargeDate
		valueObjectDest.setDischargeDate(valueObjectSrc.getDischargeDate());
		// DischargeType
		valueObjectDest.setDischargeType(valueObjectSrc.getDischargeType());
		// DischargeEpisode
		valueObjectDest.setDischargeEpisode(valueObjectSrc.getDischargeEpisode());
		// IsCurrent
		valueObjectDest.setIsCurrent(valueObjectSrc.getIsCurrent());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createDischargeSummaryPacuAndWardVoCollectionFromDischargeSummaryPacuAndWard(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.DischargeSummaryPacuAndWard objects.
	 */
	public static ims.RefMan.vo.DischargeSummaryPacuAndWardVoCollection createDischargeSummaryPacuAndWardVoCollectionFromDischargeSummaryPacuAndWard(java.util.Set domainObjectSet)	
	{
		return createDischargeSummaryPacuAndWardVoCollectionFromDischargeSummaryPacuAndWard(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.DischargeSummaryPacuAndWard objects.
	 */
	public static ims.RefMan.vo.DischargeSummaryPacuAndWardVoCollection createDischargeSummaryPacuAndWardVoCollectionFromDischargeSummaryPacuAndWard(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.DischargeSummaryPacuAndWardVoCollection voList = new ims.RefMan.vo.DischargeSummaryPacuAndWardVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.DischargeSummaryPacuAndWard domainObject = (ims.RefMan.domain.objects.DischargeSummaryPacuAndWard) iterator.next();
			ims.RefMan.vo.DischargeSummaryPacuAndWardVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.DischargeSummaryPacuAndWard objects.
	 */
	public static ims.RefMan.vo.DischargeSummaryPacuAndWardVoCollection createDischargeSummaryPacuAndWardVoCollectionFromDischargeSummaryPacuAndWard(java.util.List domainObjectList) 
	{
		return createDischargeSummaryPacuAndWardVoCollectionFromDischargeSummaryPacuAndWard(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.DischargeSummaryPacuAndWard objects.
	 */
	public static ims.RefMan.vo.DischargeSummaryPacuAndWardVoCollection createDischargeSummaryPacuAndWardVoCollectionFromDischargeSummaryPacuAndWard(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.DischargeSummaryPacuAndWardVoCollection voList = new ims.RefMan.vo.DischargeSummaryPacuAndWardVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.DischargeSummaryPacuAndWard domainObject = (ims.RefMan.domain.objects.DischargeSummaryPacuAndWard) domainObjectList.get(i);
			ims.RefMan.vo.DischargeSummaryPacuAndWardVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.DischargeSummaryPacuAndWard set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractDischargeSummaryPacuAndWardSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.DischargeSummaryPacuAndWardVoCollection voCollection) 
	 {
	 	return extractDischargeSummaryPacuAndWardSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractDischargeSummaryPacuAndWardSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.DischargeSummaryPacuAndWardVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.DischargeSummaryPacuAndWardVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.DischargeSummaryPacuAndWard domainObject = DischargeSummaryPacuAndWardVoAssembler.extractDischargeSummaryPacuAndWard(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.DischargeSummaryPacuAndWard list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractDischargeSummaryPacuAndWardList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.DischargeSummaryPacuAndWardVoCollection voCollection) 
	 {
	 	return extractDischargeSummaryPacuAndWardList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractDischargeSummaryPacuAndWardList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.DischargeSummaryPacuAndWardVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.DischargeSummaryPacuAndWardVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.DischargeSummaryPacuAndWard domainObject = DischargeSummaryPacuAndWardVoAssembler.extractDischargeSummaryPacuAndWard(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.DischargeSummaryPacuAndWard object.
	 * @param domainObject ims.RefMan.domain.objects.DischargeSummaryPacuAndWard
	 */
	 public static ims.RefMan.vo.DischargeSummaryPacuAndWardVo create(ims.RefMan.domain.objects.DischargeSummaryPacuAndWard domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.DischargeSummaryPacuAndWard object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.DischargeSummaryPacuAndWardVo create(DomainObjectMap map, ims.RefMan.domain.objects.DischargeSummaryPacuAndWard domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.DischargeSummaryPacuAndWardVo valueObject = (ims.RefMan.vo.DischargeSummaryPacuAndWardVo) map.getValueObject(domainObject, ims.RefMan.vo.DischargeSummaryPacuAndWardVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.DischargeSummaryPacuAndWardVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.DischargeSummaryPacuAndWard
	 */
	 public static ims.RefMan.vo.DischargeSummaryPacuAndWardVo insert(ims.RefMan.vo.DischargeSummaryPacuAndWardVo valueObject, ims.RefMan.domain.objects.DischargeSummaryPacuAndWard domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.DischargeSummaryPacuAndWard
	 */
	 public static ims.RefMan.vo.DischargeSummaryPacuAndWardVo insert(DomainObjectMap map, ims.RefMan.vo.DischargeSummaryPacuAndWardVo valueObject, ims.RefMan.domain.objects.DischargeSummaryPacuAndWard domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_DischargeSummaryPacuAndWard(domainObject.getId());
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
			
		// AdmissionSummary
		valueObject.setAdmissionSummary(domainObject.getAdmissionSummary());
		// Diagnosis
		valueObject.setDiagnosis(ims.core.vo.domain.PatientDiagnosisLiteVoAssembler.createPatientDiagnosisLiteVoCollectionFromPatientDiagnosis(map, domainObject.getDiagnosis()) );
		// MedicationOnDischarge
		valueObject.setMedicationOnDischarge(ims.core.vo.domain.PatientMedicationVoAssembler.createPatientMedicationVoCollectionFromPatientMedication(map, domainObject.getMedicationOnDischarge()) );
		// ProblemsAndNeeds
		valueObject.setProblemsAndNeeds(domainObject.getProblemsAndNeeds());
		// AdditionalComments
		valueObject.setAdditionalComments(domainObject.getAdditionalComments());
		// DressingsAndAids
		valueObject.setDressingsAndAids(ims.clinical.vo.domain.DressingAndAidsVoAssembler.createDressingAndAidsVoCollectionFromDressingsAndAids(map, domainObject.getDressingsAndAids()) );
		// FollowupType
		ims.domain.lookups.LookupInstance instance7 = domainObject.getFollowupType();
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

			ims.RefMan.vo.lookups.FollowupManagementType voLookup7 = new ims.RefMan.vo.lookups.FollowupManagementType(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.RefMan.vo.lookups.FollowupManagementType parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.RefMan.vo.lookups.FollowupManagementType(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setFollowupType(voLookup7);
		}
				// FurtherManagementInstructions
		valueObject.setFurtherManagementInstructions(domainObject.getFurtherManagementInstructions());
		// MedicallyIncomplete
		ims.domain.lookups.LookupInstance instance9 = domainObject.getMedicallyIncomplete();
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

			ims.RefMan.vo.lookups.MedicallyIncomplete voLookup9 = new ims.RefMan.vo.lookups.MedicallyIncomplete(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.RefMan.vo.lookups.MedicallyIncomplete parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.RefMan.vo.lookups.MedicallyIncomplete(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setMedicallyIncomplete(voLookup9);
		}
				// IncompleteNoOfDays
		valueObject.setIncompleteNoOfDays(domainObject.getIncompleteNoOfDays());
		// CurrentOnwardReferral
		if (domainObject.getCurrentOnwardReferral() != null)
		{
			if(domainObject.getCurrentOnwardReferral() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCurrentOnwardReferral();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCurrentOnwardReferral(new ims.RefMan.vo.OnwardReferralRefVo(id, -1));				
			}
			else
			{
				valueObject.setCurrentOnwardReferral(new ims.RefMan.vo.OnwardReferralRefVo(domainObject.getCurrentOnwardReferral().getId(), domainObject.getCurrentOnwardReferral().getVersion()));
			}
		}
		// OnwardReferrals
		ims.RefMan.vo.OnwardReferralRefVoCollection OnwardReferrals = new ims.RefMan.vo.OnwardReferralRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getOnwardReferrals().iterator(); iterator.hasNext(); ) 
		{
			ims.RefMan.domain.objects.OnwardReferral tmp = (ims.RefMan.domain.objects.OnwardReferral)iterator.next();
			if (tmp != null)
				OnwardReferrals.add(new ims.RefMan.vo.OnwardReferralRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setOnwardReferrals(OnwardReferrals);
		// ActionsforGPandCommunity
		valueObject.setActionsforGPandCommunity(domainObject.getActionsforGPandCommunity());
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
		// DischargeDate
		java.util.Date DischargeDate = domainObject.getDischargeDate();
		if ( null != DischargeDate ) 
		{
			valueObject.setDischargeDate(new ims.framework.utils.Date(DischargeDate) );
		}
		// DischargeType
		ims.domain.lookups.LookupInstance instance17 = domainObject.getDischargeType();
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

			ims.RefMan.vo.lookups.DischargeType voLookup17 = new ims.RefMan.vo.lookups.DischargeType(instance17.getId(),instance17.getText(), instance17.isActive(), null, img, color);
			ims.RefMan.vo.lookups.DischargeType parentVoLookup17 = voLookup17;
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
								parentVoLookup17.setParent(new ims.RefMan.vo.lookups.DischargeType(parent17.getId(),parent17.getText(), parent17.isActive(), null, img, color));
				parentVoLookup17 = parentVoLookup17.getParent();
								parent17 = parent17.getParent();
			}			
			valueObject.setDischargeType(voLookup17);
		}
				// DischargeEpisode
		if (domainObject.getDischargeEpisode() != null)
		{
			if(domainObject.getDischargeEpisode() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getDischargeEpisode();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setDischargeEpisode(new ims.core.admin.pas.vo.DischargedEpisodeRefVo(id, -1));				
			}
			else
			{
				valueObject.setDischargeEpisode(new ims.core.admin.pas.vo.DischargedEpisodeRefVo(domainObject.getDischargeEpisode().getId(), domainObject.getDischargeEpisode().getVersion()));
			}
		}
		// IsCurrent
		valueObject.setIsCurrent( domainObject.isIsCurrent() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.DischargeSummaryPacuAndWard extractDischargeSummaryPacuAndWard(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.DischargeSummaryPacuAndWardVo valueObject) 
	{
		return 	extractDischargeSummaryPacuAndWard(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.DischargeSummaryPacuAndWard extractDischargeSummaryPacuAndWard(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.DischargeSummaryPacuAndWardVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_DischargeSummaryPacuAndWard();
		ims.RefMan.domain.objects.DischargeSummaryPacuAndWard domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.DischargeSummaryPacuAndWard)domMap.get(valueObject);
			}
			// ims.RefMan.vo.DischargeSummaryPacuAndWardVo ID_DischargeSummaryPacuAndWard field is unknown
			domainObject = new ims.RefMan.domain.objects.DischargeSummaryPacuAndWard();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_DischargeSummaryPacuAndWard());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.DischargeSummaryPacuAndWard)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.DischargeSummaryPacuAndWard) domainFactory.getDomainObject(ims.RefMan.domain.objects.DischargeSummaryPacuAndWard.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_DischargeSummaryPacuAndWard());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAdmissionSummary() != null && valueObject.getAdmissionSummary().equals(""))
		{
			valueObject.setAdmissionSummary(null);
		}
		domainObject.setAdmissionSummary(valueObject.getAdmissionSummary());

		// SaveAsRefVO treated as RefValueObject
		ims.core.clinical.vo.PatientDiagnosisRefVoCollection refCollection2 = new ims.core.clinical.vo.PatientDiagnosisRefVoCollection();
		if (valueObject.getDiagnosis() != null)
		{
			for (int i2=0; i2<valueObject.getDiagnosis().size(); i2++)
			{
				ims.core.clinical.vo.PatientDiagnosisRefVo ref2 = (ims.core.clinical.vo.PatientDiagnosisRefVo)valueObject.getDiagnosis().get(i2);
				refCollection2.add(ref2);
			}
		}
		int size2 = (null == refCollection2) ? 0 : refCollection2.size();		
		java.util.Set domainDiagnosis2 = domainObject.getDiagnosis();
		if (domainDiagnosis2 == null)
		{
			domainDiagnosis2 = new java.util.HashSet();
		}
		java.util.Set newSet2  = new java.util.HashSet();
		for(int i=0; i<size2; i++) 
		{
			ims.core.clinical.vo.PatientDiagnosisRefVo vo = refCollection2.get(i);					
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
			if (!domainDiagnosis2.contains(dom))
			{
				domainDiagnosis2.add(dom);
			}
			newSet2.add(dom);			
		}
		java.util.Set removedSet2 = new java.util.HashSet();
		java.util.Iterator iter2 = domainDiagnosis2.iterator();
		//Find out which objects need to be removed
		while (iter2.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter2.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet2.contains(o))
			{
				removedSet2.add(o);
			}
		}
		iter2 = removedSet2.iterator();
		//Remove the unwanted objects
		while (iter2.hasNext())
		{
			domainDiagnosis2.remove(iter2.next());
		}		
		
		domainObject.setDiagnosis(domainDiagnosis2);		
		domainObject.setMedicationOnDischarge(ims.core.vo.domain.PatientMedicationVoAssembler.extractPatientMedicationList(domainFactory, valueObject.getMedicationOnDischarge(), domainObject.getMedicationOnDischarge(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getProblemsAndNeeds() != null && valueObject.getProblemsAndNeeds().equals(""))
		{
			valueObject.setProblemsAndNeeds(null);
		}
		domainObject.setProblemsAndNeeds(valueObject.getProblemsAndNeeds());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAdditionalComments() != null && valueObject.getAdditionalComments().equals(""))
		{
			valueObject.setAdditionalComments(null);
		}
		domainObject.setAdditionalComments(valueObject.getAdditionalComments());
		domainObject.setDressingsAndAids(ims.clinical.vo.domain.DressingAndAidsVoAssembler.extractDressingsAndAidsSet(domainFactory, valueObject.getDressingsAndAids(), domainObject.getDressingsAndAids(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getFollowupType() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getFollowupType().getID());
		}
		domainObject.setFollowupType(value7);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getFurtherManagementInstructions() != null && valueObject.getFurtherManagementInstructions().equals(""))
		{
			valueObject.setFurtherManagementInstructions(null);
		}
		domainObject.setFurtherManagementInstructions(valueObject.getFurtherManagementInstructions());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getMedicallyIncomplete() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getMedicallyIncomplete().getID());
		}
		domainObject.setMedicallyIncomplete(value9);
		domainObject.setIncompleteNoOfDays(valueObject.getIncompleteNoOfDays());
		ims.RefMan.domain.objects.OnwardReferral value11 = null;
		if ( null != valueObject.getCurrentOnwardReferral() ) 
		{
			if (valueObject.getCurrentOnwardReferral().getBoId() == null)
			{
				if (domMap.get(valueObject.getCurrentOnwardReferral()) != null)
				{
					value11 = (ims.RefMan.domain.objects.OnwardReferral)domMap.get(valueObject.getCurrentOnwardReferral());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value11 = domainObject.getCurrentOnwardReferral();	
			}
			else
			{
				value11 = (ims.RefMan.domain.objects.OnwardReferral)domainFactory.getDomainObject(ims.RefMan.domain.objects.OnwardReferral.class, valueObject.getCurrentOnwardReferral().getBoId());
			}
		}
		domainObject.setCurrentOnwardReferral(value11);

		ims.RefMan.vo.OnwardReferralRefVoCollection refCollection12 = valueObject.getOnwardReferrals();
		int size12 = (null == refCollection12) ? 0 : refCollection12.size();		
		java.util.Set domainOnwardReferrals12 = domainObject.getOnwardReferrals();
		if (domainOnwardReferrals12 == null)
		{
			domainOnwardReferrals12 = new java.util.HashSet();
		}
		java.util.Set newSet12  = new java.util.HashSet();
		for(int i=0; i<size12; i++) 
		{
			ims.RefMan.vo.OnwardReferralRefVo vo = refCollection12.get(i);					
			ims.RefMan.domain.objects.OnwardReferral dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.RefMan.domain.objects.OnwardReferral)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.RefMan.domain.objects.OnwardReferral)domainFactory.getDomainObject( ims.RefMan.domain.objects.OnwardReferral.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainOnwardReferrals12.contains(dom))
			{
				domainOnwardReferrals12.add(dom);
			}
			newSet12.add(dom);			
		}
		java.util.Set removedSet12 = new java.util.HashSet();
		java.util.Iterator iter12 = domainOnwardReferrals12.iterator();
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
			domainOnwardReferrals12.remove(iter12.next());
		}		
		
		domainObject.setOnwardReferrals(domainOnwardReferrals12);		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getActionsforGPandCommunity() != null && valueObject.getActionsforGPandCommunity().equals(""))
		{
			valueObject.setActionsforGPandCommunity(null);
		}
		domainObject.setActionsforGPandCommunity(valueObject.getActionsforGPandCommunity());
		ims.RefMan.domain.objects.CatsReferral value14 = null;
		if ( null != valueObject.getCatsReferral() ) 
		{
			if (valueObject.getCatsReferral().getBoId() == null)
			{
				if (domMap.get(valueObject.getCatsReferral()) != null)
				{
					value14 = (ims.RefMan.domain.objects.CatsReferral)domMap.get(valueObject.getCatsReferral());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value14 = domainObject.getCatsReferral();	
			}
			else
			{
				value14 = (ims.RefMan.domain.objects.CatsReferral)domainFactory.getDomainObject(ims.RefMan.domain.objects.CatsReferral.class, valueObject.getCatsReferral().getBoId());
			}
		}
		domainObject.setCatsReferral(value14);
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		java.util.Date value16 = null;
		ims.framework.utils.Date date16 = valueObject.getDischargeDate();		
		if ( date16 != null ) 
		{
			value16 = date16.getDate();
		}
		domainObject.setDischargeDate(value16);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value17 = null;
		if ( null != valueObject.getDischargeType() ) 
		{
			value17 =
				domainFactory.getLookupInstance(valueObject.getDischargeType().getID());
		}
		domainObject.setDischargeType(value17);
		ims.core.admin.pas.domain.objects.DischargedEpisode value18 = null;
		if ( null != valueObject.getDischargeEpisode() ) 
		{
			if (valueObject.getDischargeEpisode().getBoId() == null)
			{
				if (domMap.get(valueObject.getDischargeEpisode()) != null)
				{
					value18 = (ims.core.admin.pas.domain.objects.DischargedEpisode)domMap.get(valueObject.getDischargeEpisode());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value18 = domainObject.getDischargeEpisode();	
			}
			else
			{
				value18 = (ims.core.admin.pas.domain.objects.DischargedEpisode)domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.DischargedEpisode.class, valueObject.getDischargeEpisode().getBoId());
			}
		}
		domainObject.setDischargeEpisode(value18);
		domainObject.setIsCurrent(valueObject.getIsCurrent());

		return domainObject;
	}

}
