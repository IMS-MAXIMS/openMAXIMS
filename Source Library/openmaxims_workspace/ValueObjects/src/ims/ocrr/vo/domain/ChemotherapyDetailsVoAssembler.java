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
package ims.ocrr.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Alexie Ursache
 */
public class ChemotherapyDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.ChemotherapyDetailsVo copy(ims.ocrr.vo.ChemotherapyDetailsVo valueObjectDest, ims.ocrr.vo.ChemotherapyDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ChemotherapyDetails(valueObjectSrc.getID_ChemotherapyDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CycleDetails
		valueObjectDest.setCycleDetails(valueObjectSrc.getCycleDetails());
		// AuthoringInfo
		valueObjectDest.setAuthoringInfo(valueObjectSrc.getAuthoringInfo());
		// CCOCycleDetails
		valueObjectDest.setCCOCycleDetails(valueObjectSrc.getCCOCycleDetails());
		// PerformanceStatus
		valueObjectDest.setPerformanceStatus(valueObjectSrc.getPerformanceStatus());
		// DelayReason1
		valueObjectDest.setDelayReason1(valueObjectSrc.getDelayReason1());
		// DelayReason2
		valueObjectDest.setDelayReason2(valueObjectSrc.getDelayReason2());
		// TreatmentSite
		valueObjectDest.setTreatmentSite(valueObjectSrc.getTreatmentSite());
		// EndDate
		valueObjectDest.setEndDate(valueObjectSrc.getEndDate());
		// ProgrammeNr
		valueObjectDest.setProgrammeNr(valueObjectSrc.getProgrammeNr());
		// RegimenNr
		valueObjectDest.setRegimenNr(valueObjectSrc.getRegimenNr());
		// ComorbidityAdjustment
		valueObjectDest.setComorbidityAdjustment(valueObjectSrc.getComorbidityAdjustment());
		// ChemoRadiation
		valueObjectDest.setChemoRadiation(valueObjectSrc.getChemoRadiation());
		// ClinicalTrial
		valueObjectDest.setClinicalTrial(valueObjectSrc.getClinicalTrial());
		// PlannedCycles
		valueObjectDest.setPlannedCycles(valueObjectSrc.getPlannedCycles());
		// OutcomeDoseReduction
		valueObjectDest.setOutcomeDoseReduction(valueObjectSrc.getOutcomeDoseReduction());
		// OutcomeTimeDelay
		valueObjectDest.setOutcomeTimeDelay(valueObjectSrc.getOutcomeTimeDelay());
		// OutcomeStoppedEarly
		valueObjectDest.setOutcomeStoppedEarly(valueObjectSrc.getOutcomeStoppedEarly());
		// OutcomeSummary
		valueObjectDest.setOutcomeSummary(valueObjectSrc.getOutcomeSummary());
		// PrescribingHCP
		valueObjectDest.setPrescribingHCP(valueObjectSrc.getPrescribingHCP());
		// PrescribedDate
		valueObjectDest.setPrescribedDate(valueObjectSrc.getPrescribedDate());
		// AssociatedTreatmentPlanAction
		valueObjectDest.setAssociatedTreatmentPlanAction(valueObjectSrc.getAssociatedTreatmentPlanAction());
		// TreatingConsultant
		valueObjectDest.setTreatingConsultant(valueObjectSrc.getTreatingConsultant());
		// TxChangeReason
		valueObjectDest.setTxChangeReason(valueObjectSrc.getTxChangeReason());
		// PreTreatSurfaceArea
		valueObjectDest.setPreTreatSurfaceArea(valueObjectSrc.getPreTreatSurfaceArea());
		// CreatinineClearance
		valueObjectDest.setCreatinineClearance(valueObjectSrc.getCreatinineClearance());
		// HeightValueCM
		valueObjectDest.setHeightValueCM(valueObjectSrc.getHeightValueCM());
		// WeightValueKG
		valueObjectDest.setWeightValueKG(valueObjectSrc.getWeightValueKG());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// EpisodeOfCare
		valueObjectDest.setEpisodeOfCare(valueObjectSrc.getEpisodeOfCare());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// StartDate
		valueObjectDest.setStartDate(valueObjectSrc.getStartDate());
		// DateDecisionToTreat
		valueObjectDest.setDateDecisionToTreat(valueObjectSrc.getDateDecisionToTreat());
		// DrugTherapyType
		valueObjectDest.setDrugTherapyType(valueObjectSrc.getDrugTherapyType());
		// RegimenAcronym
		valueObjectDest.setRegimenAcronym(valueObjectSrc.getRegimenAcronym());
		// CancerTreatementIntent
		valueObjectDest.setCancerTreatementIntent(valueObjectSrc.getCancerTreatementIntent());
		// TreatmentResponse
		valueObjectDest.setTreatmentResponse(valueObjectSrc.getTreatmentResponse());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createChemotherapyDetailsVoCollectionFromChemotherapyDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.ChemotherapyDetails objects.
	 */
	public static ims.ocrr.vo.ChemotherapyDetailsVoCollection createChemotherapyDetailsVoCollectionFromChemotherapyDetails(java.util.Set domainObjectSet)	
	{
		return createChemotherapyDetailsVoCollectionFromChemotherapyDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.ChemotherapyDetails objects.
	 */
	public static ims.ocrr.vo.ChemotherapyDetailsVoCollection createChemotherapyDetailsVoCollectionFromChemotherapyDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.ChemotherapyDetailsVoCollection voList = new ims.ocrr.vo.ChemotherapyDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.oncology.domain.objects.ChemotherapyDetails domainObject = (ims.oncology.domain.objects.ChemotherapyDetails) iterator.next();
			ims.ocrr.vo.ChemotherapyDetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.oncology.domain.objects.ChemotherapyDetails objects.
	 */
	public static ims.ocrr.vo.ChemotherapyDetailsVoCollection createChemotherapyDetailsVoCollectionFromChemotherapyDetails(java.util.List domainObjectList) 
	{
		return createChemotherapyDetailsVoCollectionFromChemotherapyDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.domain.objects.ChemotherapyDetails objects.
	 */
	public static ims.ocrr.vo.ChemotherapyDetailsVoCollection createChemotherapyDetailsVoCollectionFromChemotherapyDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.ChemotherapyDetailsVoCollection voList = new ims.ocrr.vo.ChemotherapyDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.domain.objects.ChemotherapyDetails domainObject = (ims.oncology.domain.objects.ChemotherapyDetails) domainObjectList.get(i);
			ims.ocrr.vo.ChemotherapyDetailsVo vo = create(map, domainObject);

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
	 * Create the ims.oncology.domain.objects.ChemotherapyDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractChemotherapyDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ChemotherapyDetailsVoCollection voCollection) 
	 {
	 	return extractChemotherapyDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractChemotherapyDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ChemotherapyDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.ChemotherapyDetailsVo vo = voCollection.get(i);
			ims.oncology.domain.objects.ChemotherapyDetails domainObject = ChemotherapyDetailsVoAssembler.extractChemotherapyDetails(domainFactory, vo, domMap);

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
	 * Create the ims.oncology.domain.objects.ChemotherapyDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractChemotherapyDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ChemotherapyDetailsVoCollection voCollection) 
	 {
	 	return extractChemotherapyDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractChemotherapyDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ChemotherapyDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.ChemotherapyDetailsVo vo = voCollection.get(i);
			ims.oncology.domain.objects.ChemotherapyDetails domainObject = ChemotherapyDetailsVoAssembler.extractChemotherapyDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.oncology.domain.objects.ChemotherapyDetails object.
	 * @param domainObject ims.oncology.domain.objects.ChemotherapyDetails
	 */
	 public static ims.ocrr.vo.ChemotherapyDetailsVo create(ims.oncology.domain.objects.ChemotherapyDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.oncology.domain.objects.ChemotherapyDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ocrr.vo.ChemotherapyDetailsVo create(DomainObjectMap map, ims.oncology.domain.objects.ChemotherapyDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.ChemotherapyDetailsVo valueObject = (ims.ocrr.vo.ChemotherapyDetailsVo) map.getValueObject(domainObject, ims.ocrr.vo.ChemotherapyDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.ChemotherapyDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.oncology.domain.objects.ChemotherapyDetails
	 */
	 public static ims.ocrr.vo.ChemotherapyDetailsVo insert(ims.ocrr.vo.ChemotherapyDetailsVo valueObject, ims.oncology.domain.objects.ChemotherapyDetails domainObject) 
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
	 * @param domainObject ims.oncology.domain.objects.ChemotherapyDetails
	 */
	 public static ims.ocrr.vo.ChemotherapyDetailsVo insert(DomainObjectMap map, ims.ocrr.vo.ChemotherapyDetailsVo valueObject, ims.oncology.domain.objects.ChemotherapyDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ChemotherapyDetails(domainObject.getId());
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
			
		// CycleDetails
		valueObject.setCycleDetails(ims.oncology.vo.domain.ChemotherapyCycleDetailsVoAssembler.createChemotherapyCycleDetailsVoCollectionFromChemotherapyCycleDetails(map, domainObject.getCycleDetails()) );
		// AuthoringInfo
		valueObject.setAuthoringInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInfo()) );
		// CCOCycleDetails
		valueObject.setCCOCycleDetails(ims.oncology.vo.domain.ChemoCycleDetailsCCOVoAssembler.createChemoCycleDetailsCCOVoCollectionFromChemoCycleDetailsCCO(map, domainObject.getCCOCycleDetails()) );
		// PerformanceStatus
		ims.domain.lookups.LookupInstance instance4 = domainObject.getPerformanceStatus();
		if ( null != instance4 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance4.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance4.getImage().getImageId(), instance4.getImage().getImagePath());
			}
			color = instance4.getColor();
			if (color != null) 
				color.getValue();

			ims.medicaloncology.vo.lookups.PerformanceStatus voLookup4 = new ims.medicaloncology.vo.lookups.PerformanceStatus(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.medicaloncology.vo.lookups.PerformanceStatus parentVoLookup4 = voLookup4;
			ims.domain.lookups.LookupInstance parent4 = instance4.getParent();
			while (parent4 != null)
			{
				if (parent4.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent4.getImage().getImageId(), parent4.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent4.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup4.setParent(new ims.medicaloncology.vo.lookups.PerformanceStatus(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setPerformanceStatus(voLookup4);
		}
				// DelayReason1
		ims.domain.lookups.LookupInstance instance5 = domainObject.getDelayReason1();
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

			ims.medicaloncology.vo.lookups.SurgeryReasonForDelay voLookup5 = new ims.medicaloncology.vo.lookups.SurgeryReasonForDelay(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.medicaloncology.vo.lookups.SurgeryReasonForDelay parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.medicaloncology.vo.lookups.SurgeryReasonForDelay(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setDelayReason1(voLookup5);
		}
				// DelayReason2
		ims.domain.lookups.LookupInstance instance6 = domainObject.getDelayReason2();
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

			ims.medicaloncology.vo.lookups.SurgeryReasonForDelay voLookup6 = new ims.medicaloncology.vo.lookups.SurgeryReasonForDelay(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.medicaloncology.vo.lookups.SurgeryReasonForDelay parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.medicaloncology.vo.lookups.SurgeryReasonForDelay(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setDelayReason2(voLookup6);
		}
				// TreatmentSite
		ims.domain.lookups.LookupInstance instance7 = domainObject.getTreatmentSite();
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

			ims.oncology.vo.lookups.TreatmentHospital voLookup7 = new ims.oncology.vo.lookups.TreatmentHospital(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.oncology.vo.lookups.TreatmentHospital parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.oncology.vo.lookups.TreatmentHospital(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setTreatmentSite(voLookup7);
		}
				// EndDate
		java.util.Date EndDate = domainObject.getEndDate();
		if ( null != EndDate ) 
		{
			valueObject.setEndDate(new ims.framework.utils.Date(EndDate) );
		}
		// ProgrammeNr
		valueObject.setProgrammeNr(domainObject.getProgrammeNr());
		// RegimenNr
		valueObject.setRegimenNr(domainObject.getRegimenNr());
		// ComorbidityAdjustment
		ims.domain.lookups.LookupInstance instance11 = domainObject.getComorbidityAdjustment();
		if ( null != instance11 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance11.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance11.getImage().getImageId(), instance11.getImage().getImagePath());
			}
			color = instance11.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup11 = new ims.core.vo.lookups.YesNo(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup11 = voLookup11;
			ims.domain.lookups.LookupInstance parent11 = instance11.getParent();
			while (parent11 != null)
			{
				if (parent11.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent11.getImage().getImageId(), parent11.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent11.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup11.setParent(new ims.core.vo.lookups.YesNo(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setComorbidityAdjustment(voLookup11);
		}
				// ChemoRadiation
		ims.domain.lookups.LookupInstance instance12 = domainObject.getChemoRadiation();
		if ( null != instance12 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance12.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance12.getImage().getImageId(), instance12.getImage().getImagePath());
			}
			color = instance12.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup12 = new ims.core.vo.lookups.YesNo(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup12 = voLookup12;
			ims.domain.lookups.LookupInstance parent12 = instance12.getParent();
			while (parent12 != null)
			{
				if (parent12.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent12.getImage().getImageId(), parent12.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent12.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup12.setParent(new ims.core.vo.lookups.YesNo(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setChemoRadiation(voLookup12);
		}
				// ClinicalTrial
		ims.domain.lookups.LookupInstance instance13 = domainObject.getClinicalTrial();
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

			ims.core.vo.lookups.YesNo voLookup13 = new ims.core.vo.lookups.YesNo(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup13 = voLookup13;
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
								parentVoLookup13.setParent(new ims.core.vo.lookups.YesNo(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setClinicalTrial(voLookup13);
		}
				// PlannedCycles
		valueObject.setPlannedCycles(domainObject.getPlannedCycles());
		// OutcomeDoseReduction
		ims.domain.lookups.LookupInstance instance15 = domainObject.getOutcomeDoseReduction();
		if ( null != instance15 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance15.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance15.getImage().getImageId(), instance15.getImage().getImagePath());
			}
			color = instance15.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup15 = new ims.core.vo.lookups.YesNo(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup15 = voLookup15;
			ims.domain.lookups.LookupInstance parent15 = instance15.getParent();
			while (parent15 != null)
			{
				if (parent15.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent15.getImage().getImageId(), parent15.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent15.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup15.setParent(new ims.core.vo.lookups.YesNo(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setOutcomeDoseReduction(voLookup15);
		}
				// OutcomeTimeDelay
		ims.domain.lookups.LookupInstance instance16 = domainObject.getOutcomeTimeDelay();
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

			ims.core.vo.lookups.YesNo voLookup16 = new ims.core.vo.lookups.YesNo(instance16.getId(),instance16.getText(), instance16.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup16 = voLookup16;
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
								parentVoLookup16.setParent(new ims.core.vo.lookups.YesNo(parent16.getId(),parent16.getText(), parent16.isActive(), null, img, color));
				parentVoLookup16 = parentVoLookup16.getParent();
								parent16 = parent16.getParent();
			}			
			valueObject.setOutcomeTimeDelay(voLookup16);
		}
				// OutcomeStoppedEarly
		ims.domain.lookups.LookupInstance instance17 = domainObject.getOutcomeStoppedEarly();
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

			ims.core.vo.lookups.YesNo voLookup17 = new ims.core.vo.lookups.YesNo(instance17.getId(),instance17.getText(), instance17.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup17 = voLookup17;
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
								parentVoLookup17.setParent(new ims.core.vo.lookups.YesNo(parent17.getId(),parent17.getText(), parent17.isActive(), null, img, color));
				parentVoLookup17 = parentVoLookup17.getParent();
								parent17 = parent17.getParent();
			}			
			valueObject.setOutcomeStoppedEarly(voLookup17);
		}
				// OutcomeSummary
		ims.domain.lookups.LookupInstance instance18 = domainObject.getOutcomeSummary();
		if ( null != instance18 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance18.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance18.getImage().getImageId(), instance18.getImage().getImagePath());
			}
			color = instance18.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.RegimenOutcomeSummary voLookup18 = new ims.oncology.vo.lookups.RegimenOutcomeSummary(instance18.getId(),instance18.getText(), instance18.isActive(), null, img, color);
			ims.oncology.vo.lookups.RegimenOutcomeSummary parentVoLookup18 = voLookup18;
			ims.domain.lookups.LookupInstance parent18 = instance18.getParent();
			while (parent18 != null)
			{
				if (parent18.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent18.getImage().getImageId(), parent18.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent18.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup18.setParent(new ims.oncology.vo.lookups.RegimenOutcomeSummary(parent18.getId(),parent18.getText(), parent18.isActive(), null, img, color));
				parentVoLookup18 = parentVoLookup18.getParent();
								parent18 = parent18.getParent();
			}			
			valueObject.setOutcomeSummary(voLookup18);
		}
				// PrescribingHCP
		valueObject.setPrescribingHCP(ims.core.vo.domain.MedicVoAssembler.create(map, domainObject.getPrescribingHCP()) );
		// PrescribedDate
		java.util.Date PrescribedDate = domainObject.getPrescribedDate();
		if ( null != PrescribedDate ) 
		{
			valueObject.setPrescribedDate(new ims.framework.utils.Date(PrescribedDate) );
		}
		// AssociatedTreatmentPlanAction
		if (domainObject.getAssociatedTreatmentPlanAction() != null)
		{
			if(domainObject.getAssociatedTreatmentPlanAction() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAssociatedTreatmentPlanAction();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAssociatedTreatmentPlanAction(new ims.oncology.vo.PatActionRefVo(id, -1));				
			}
			else
			{
				valueObject.setAssociatedTreatmentPlanAction(new ims.oncology.vo.PatActionRefVo(domainObject.getAssociatedTreatmentPlanAction().getId(), domainObject.getAssociatedTreatmentPlanAction().getVersion()));
			}
		}
		// TreatingConsultant
		valueObject.setTreatingConsultant(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getTreatingConsultant()) );
		// TxChangeReason
		ims.domain.lookups.LookupInstance instance23 = domainObject.getTxChangeReason();
		if ( null != instance23 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance23.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance23.getImage().getImageId(), instance23.getImage().getImagePath());
			}
			color = instance23.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.ChemoTxChangeReason voLookup23 = new ims.oncology.vo.lookups.ChemoTxChangeReason(instance23.getId(),instance23.getText(), instance23.isActive(), null, img, color);
			ims.oncology.vo.lookups.ChemoTxChangeReason parentVoLookup23 = voLookup23;
			ims.domain.lookups.LookupInstance parent23 = instance23.getParent();
			while (parent23 != null)
			{
				if (parent23.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent23.getImage().getImageId(), parent23.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent23.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup23.setParent(new ims.oncology.vo.lookups.ChemoTxChangeReason(parent23.getId(),parent23.getText(), parent23.isActive(), null, img, color));
				parentVoLookup23 = parentVoLookup23.getParent();
								parent23 = parent23.getParent();
			}			
			valueObject.setTxChangeReason(voLookup23);
		}
				// PreTreatSurfaceArea
		valueObject.setPreTreatSurfaceArea(domainObject.getPreTreatSurfaceArea());
		// CreatinineClearance
		valueObject.setCreatinineClearance(domainObject.getCreatinineClearance());
		// HeightValueCM
		valueObject.setHeightValueCM(domainObject.getHeightValueCM());
		// WeightValueKG
		valueObject.setWeightValueKG(domainObject.getWeightValueKG());
		// Status
		ims.domain.lookups.LookupInstance instance28 = domainObject.getStatus();
		if ( null != instance28 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance28.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance28.getImage().getImageId(), instance28.getImage().getImagePath());
			}
			color = instance28.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup28 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance28.getId(),instance28.getText(), instance28.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup28 = voLookup28;
			ims.domain.lookups.LookupInstance parent28 = instance28.getParent();
			while (parent28 != null)
			{
				if (parent28.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent28.getImage().getImageId(), parent28.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent28.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup28.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent28.getId(),parent28.getText(), parent28.isActive(), null, img, color));
				parentVoLookup28 = parentVoLookup28.getParent();
								parent28 = parent28.getParent();
			}			
			valueObject.setStatus(voLookup28);
		}
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
		// StartDate
		java.util.Date StartDate = domainObject.getStartDate();
		if ( null != StartDate ) 
		{
			valueObject.setStartDate(new ims.framework.utils.Date(StartDate) );
		}
		// DateDecisionToTreat
		java.util.Date DateDecisionToTreat = domainObject.getDateDecisionToTreat();
		if ( null != DateDecisionToTreat ) 
		{
			valueObject.setDateDecisionToTreat(new ims.framework.utils.Date(DateDecisionToTreat) );
		}
		// DrugTherapyType
		ims.domain.lookups.LookupInstance instance33 = domainObject.getDrugTherapyType();
		if ( null != instance33 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance33.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance33.getImage().getImageId(), instance33.getImage().getImagePath());
			}
			color = instance33.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.DrugTherapyType voLookup33 = new ims.oncology.vo.lookups.DrugTherapyType(instance33.getId(),instance33.getText(), instance33.isActive(), null, img, color);
			ims.oncology.vo.lookups.DrugTherapyType parentVoLookup33 = voLookup33;
			ims.domain.lookups.LookupInstance parent33 = instance33.getParent();
			while (parent33 != null)
			{
				if (parent33.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent33.getImage().getImageId(), parent33.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent33.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup33.setParent(new ims.oncology.vo.lookups.DrugTherapyType(parent33.getId(),parent33.getText(), parent33.isActive(), null, img, color));
				parentVoLookup33 = parentVoLookup33.getParent();
								parent33 = parent33.getParent();
			}			
			valueObject.setDrugTherapyType(voLookup33);
		}
				// RegimenAcronym
		ims.domain.lookups.LookupInstance instance34 = domainObject.getRegimenAcronym();
		if ( null != instance34 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance34.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance34.getImage().getImageId(), instance34.getImage().getImagePath());
			}
			color = instance34.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.RegimenAcronym voLookup34 = new ims.oncology.vo.lookups.RegimenAcronym(instance34.getId(),instance34.getText(), instance34.isActive(), null, img, color);
			ims.oncology.vo.lookups.RegimenAcronym parentVoLookup34 = voLookup34;
			ims.domain.lookups.LookupInstance parent34 = instance34.getParent();
			while (parent34 != null)
			{
				if (parent34.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent34.getImage().getImageId(), parent34.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent34.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup34.setParent(new ims.oncology.vo.lookups.RegimenAcronym(parent34.getId(),parent34.getText(), parent34.isActive(), null, img, color));
				parentVoLookup34 = parentVoLookup34.getParent();
								parent34 = parent34.getParent();
			}			
			valueObject.setRegimenAcronym(voLookup34);
		}
				// CancerTreatementIntent
		ims.domain.lookups.LookupInstance instance35 = domainObject.getCancerTreatementIntent();
		if ( null != instance35 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance35.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance35.getImage().getImageId(), instance35.getImage().getImagePath());
			}
			color = instance35.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.CancerTreatmentIntent voLookup35 = new ims.oncology.vo.lookups.CancerTreatmentIntent(instance35.getId(),instance35.getText(), instance35.isActive(), null, img, color);
			ims.oncology.vo.lookups.CancerTreatmentIntent parentVoLookup35 = voLookup35;
			ims.domain.lookups.LookupInstance parent35 = instance35.getParent();
			while (parent35 != null)
			{
				if (parent35.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent35.getImage().getImageId(), parent35.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent35.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup35.setParent(new ims.oncology.vo.lookups.CancerTreatmentIntent(parent35.getId(),parent35.getText(), parent35.isActive(), null, img, color));
				parentVoLookup35 = parentVoLookup35.getParent();
								parent35 = parent35.getParent();
			}			
			valueObject.setCancerTreatementIntent(voLookup35);
		}
				// TreatmentResponse
		ims.domain.lookups.LookupInstance instance36 = domainObject.getTreatmentResponse();
		if ( null != instance36 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance36.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance36.getImage().getImageId(), instance36.getImage().getImagePath());
			}
			color = instance36.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.DrugProgramResponse voLookup36 = new ims.oncology.vo.lookups.DrugProgramResponse(instance36.getId(),instance36.getText(), instance36.isActive(), null, img, color);
			ims.oncology.vo.lookups.DrugProgramResponse parentVoLookup36 = voLookup36;
			ims.domain.lookups.LookupInstance parent36 = instance36.getParent();
			while (parent36 != null)
			{
				if (parent36.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent36.getImage().getImageId(), parent36.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent36.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup36.setParent(new ims.oncology.vo.lookups.DrugProgramResponse(parent36.getId(),parent36.getText(), parent36.isActive(), null, img, color));
				parentVoLookup36 = parentVoLookup36.getParent();
								parent36 = parent36.getParent();
			}			
			valueObject.setTreatmentResponse(voLookup36);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.domain.objects.ChemotherapyDetails extractChemotherapyDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ChemotherapyDetailsVo valueObject) 
	{
		return 	extractChemotherapyDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.domain.objects.ChemotherapyDetails extractChemotherapyDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ChemotherapyDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ChemotherapyDetails();
		ims.oncology.domain.objects.ChemotherapyDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.oncology.domain.objects.ChemotherapyDetails)domMap.get(valueObject);
			}
			// ims.ocrr.vo.ChemotherapyDetailsVo ID_ChemotherapyDetails field is unknown
			domainObject = new ims.oncology.domain.objects.ChemotherapyDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ChemotherapyDetails());
			if (domMap.get(key) != null)
			{
				return (ims.oncology.domain.objects.ChemotherapyDetails)domMap.get(key);
			}
			domainObject = (ims.oncology.domain.objects.ChemotherapyDetails) domainFactory.getDomainObject(ims.oncology.domain.objects.ChemotherapyDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ChemotherapyDetails());

		domainObject.setCycleDetails(ims.oncology.vo.domain.ChemotherapyCycleDetailsVoAssembler.extractChemotherapyCycleDetailsList(domainFactory, valueObject.getCycleDetails(), domainObject.getCycleDetails(), domMap));		
		domainObject.setAuthoringInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInfo(), domMap));
		domainObject.setCCOCycleDetails(ims.oncology.vo.domain.ChemoCycleDetailsCCOVoAssembler.extractChemoCycleDetailsCCOList(domainFactory, valueObject.getCCOCycleDetails(), domainObject.getCCOCycleDetails(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getPerformanceStatus() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getPerformanceStatus().getID());
		}
		domainObject.setPerformanceStatus(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getDelayReason1() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getDelayReason1().getID());
		}
		domainObject.setDelayReason1(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getDelayReason2() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getDelayReason2().getID());
		}
		domainObject.setDelayReason2(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getTreatmentSite() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getTreatmentSite().getID());
		}
		domainObject.setTreatmentSite(value7);
		java.util.Date value8 = null;
		ims.framework.utils.Date date8 = valueObject.getEndDate();		
		if ( date8 != null ) 
		{
			value8 = date8.getDate();
		}
		domainObject.setEndDate(value8);
		domainObject.setProgrammeNr(valueObject.getProgrammeNr());
		domainObject.setRegimenNr(valueObject.getRegimenNr());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getComorbidityAdjustment() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getComorbidityAdjustment().getID());
		}
		domainObject.setComorbidityAdjustment(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getChemoRadiation() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getChemoRadiation().getID());
		}
		domainObject.setChemoRadiation(value12);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getClinicalTrial() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getClinicalTrial().getID());
		}
		domainObject.setClinicalTrial(value13);
		domainObject.setPlannedCycles(valueObject.getPlannedCycles());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getOutcomeDoseReduction() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getOutcomeDoseReduction().getID());
		}
		domainObject.setOutcomeDoseReduction(value15);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getOutcomeTimeDelay() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getOutcomeTimeDelay().getID());
		}
		domainObject.setOutcomeTimeDelay(value16);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value17 = null;
		if ( null != valueObject.getOutcomeStoppedEarly() ) 
		{
			value17 =
				domainFactory.getLookupInstance(valueObject.getOutcomeStoppedEarly().getID());
		}
		domainObject.setOutcomeStoppedEarly(value17);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value18 = null;
		if ( null != valueObject.getOutcomeSummary() ) 
		{
			value18 =
				domainFactory.getLookupInstance(valueObject.getOutcomeSummary().getID());
		}
		domainObject.setOutcomeSummary(value18);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Medic value19 = null;
		if ( null != valueObject.getPrescribingHCP() ) 
		{
			if (valueObject.getPrescribingHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrescribingHCP()) != null)
				{
					value19 = (ims.core.resource.people.domain.objects.Medic)domMap.get(valueObject.getPrescribingHCP());
				}
			}
			else
			{
				value19 = (ims.core.resource.people.domain.objects.Medic)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Medic.class, valueObject.getPrescribingHCP().getBoId());
			}
		}
		domainObject.setPrescribingHCP(value19);
		java.util.Date value20 = null;
		ims.framework.utils.Date date20 = valueObject.getPrescribedDate();		
		if ( date20 != null ) 
		{
			value20 = date20.getDate();
		}
		domainObject.setPrescribedDate(value20);
		ims.oncology.domain.objects.PatAction value21 = null;
		if ( null != valueObject.getAssociatedTreatmentPlanAction() ) 
		{
			if (valueObject.getAssociatedTreatmentPlanAction().getBoId() == null)
			{
				if (domMap.get(valueObject.getAssociatedTreatmentPlanAction()) != null)
				{
					value21 = (ims.oncology.domain.objects.PatAction)domMap.get(valueObject.getAssociatedTreatmentPlanAction());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value21 = domainObject.getAssociatedTreatmentPlanAction();	
			}
			else
			{
				value21 = (ims.oncology.domain.objects.PatAction)domainFactory.getDomainObject(ims.oncology.domain.objects.PatAction.class, valueObject.getAssociatedTreatmentPlanAction().getBoId());
			}
		}
		domainObject.setAssociatedTreatmentPlanAction(value21);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value22 = null;
		if ( null != valueObject.getTreatingConsultant() ) 
		{
			if (valueObject.getTreatingConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getTreatingConsultant()) != null)
				{
					value22 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getTreatingConsultant());
				}
			}
			else
			{
				value22 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getTreatingConsultant().getBoId());
			}
		}
		domainObject.setTreatingConsultant(value22);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value23 = null;
		if ( null != valueObject.getTxChangeReason() ) 
		{
			value23 =
				domainFactory.getLookupInstance(valueObject.getTxChangeReason().getID());
		}
		domainObject.setTxChangeReason(value23);
		domainObject.setPreTreatSurfaceArea(valueObject.getPreTreatSurfaceArea());
		domainObject.setCreatinineClearance(valueObject.getCreatinineClearance());
		domainObject.setHeightValueCM(valueObject.getHeightValueCM());
		domainObject.setWeightValueKG(valueObject.getWeightValueKG());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value28 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value28 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value28);
		ims.core.admin.domain.objects.EpisodeOfCare value29 = null;
		if ( null != valueObject.getEpisodeOfCare() ) 
		{
			if (valueObject.getEpisodeOfCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisodeOfCare()) != null)
				{
					value29 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisodeOfCare());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value29 = domainObject.getEpisodeOfCare();	
			}
			else
			{
				value29 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisodeOfCare().getBoId());
			}
		}
		domainObject.setEpisodeOfCare(value29);
		ims.core.admin.domain.objects.CareContext value30 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value30 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value30 = domainObject.getCareContext();	
			}
			else
			{
				value30 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value30);
		java.util.Date value31 = null;
		ims.framework.utils.Date date31 = valueObject.getStartDate();		
		if ( date31 != null ) 
		{
			value31 = date31.getDate();
		}
		domainObject.setStartDate(value31);
		java.util.Date value32 = null;
		ims.framework.utils.Date date32 = valueObject.getDateDecisionToTreat();		
		if ( date32 != null ) 
		{
			value32 = date32.getDate();
		}
		domainObject.setDateDecisionToTreat(value32);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value33 = null;
		if ( null != valueObject.getDrugTherapyType() ) 
		{
			value33 =
				domainFactory.getLookupInstance(valueObject.getDrugTherapyType().getID());
		}
		domainObject.setDrugTherapyType(value33);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value34 = null;
		if ( null != valueObject.getRegimenAcronym() ) 
		{
			value34 =
				domainFactory.getLookupInstance(valueObject.getRegimenAcronym().getID());
		}
		domainObject.setRegimenAcronym(value34);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value35 = null;
		if ( null != valueObject.getCancerTreatementIntent() ) 
		{
			value35 =
				domainFactory.getLookupInstance(valueObject.getCancerTreatementIntent().getID());
		}
		domainObject.setCancerTreatementIntent(value35);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value36 = null;
		if ( null != valueObject.getTreatmentResponse() ) 
		{
			value36 =
				domainFactory.getLookupInstance(valueObject.getTreatmentResponse().getID());
		}
		domainObject.setTreatmentResponse(value36);

		return domainObject;
	}

}
