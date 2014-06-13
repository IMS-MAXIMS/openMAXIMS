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
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cornel Ventuneac
 */
public class VTERiskAssessmentVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.VTERiskAssessmentVo copy(ims.clinical.vo.VTERiskAssessmentVo valueObjectDest, ims.clinical.vo.VTERiskAssessmentVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_VTERiskAssessment(valueObjectSrc.getID_VTERiskAssessment());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// RecordingInformation
		valueObjectDest.setRecordingInformation(valueObjectSrc.getRecordingInformation());
		// VTEAssessmentStatus
		valueObjectDest.setVTEAssessmentStatus(valueObjectSrc.getVTEAssessmentStatus());
		// CompletedBy
		valueObjectDest.setCompletedBy(valueObjectSrc.getCompletedBy());
		// NotExpectedReducedMobility
		valueObjectDest.setNotExpectedReducedMobility(valueObjectSrc.getNotExpectedReducedMobility());
		// ActiveCancer
		valueObjectDest.setActiveCancer(valueObjectSrc.getActiveCancer());
		// AgeOverSixty
		valueObjectDest.setAgeOverSixty(valueObjectSrc.getAgeOverSixty());
		// Dehydration
		valueObjectDest.setDehydration(valueObjectSrc.getDehydration());
		// KnownThrombophilias
		valueObjectDest.setKnownThrombophilias(valueObjectSrc.getKnownThrombophilias());
		// Obesity
		valueObjectDest.setObesity(valueObjectSrc.getObesity());
		// SignificantMorbidities
		valueObjectDest.setSignificantMorbidities(valueObjectSrc.getSignificantMorbidities());
		// HistoryOfVTE
		valueObjectDest.setHistoryOfVTE(valueObjectSrc.getHistoryOfVTE());
		// UseOfHRT
		valueObjectDest.setUseOfHRT(valueObjectSrc.getUseOfHRT());
		// UseOfOstogren
		valueObjectDest.setUseOfOstogren(valueObjectSrc.getUseOfOstogren());
		// VaricoseVeins
		valueObjectDest.setVaricoseVeins(valueObjectSrc.getVaricoseVeins());
		// Pregnancy
		valueObjectDest.setPregnancy(valueObjectSrc.getPregnancy());
		// ReducedMobility
		valueObjectDest.setReducedMobility(valueObjectSrc.getReducedMobility());
		// CriticalCareAdmission
		valueObjectDest.setCriticalCareAdmission(valueObjectSrc.getCriticalCareAdmission());
		// HipKneeReplacement
		valueObjectDest.setHipKneeReplacement(valueObjectSrc.getHipKneeReplacement());
		// HipFracture
		valueObjectDest.setHipFracture(valueObjectSrc.getHipFracture());
		// AnaestheticAndSurgery
		valueObjectDest.setAnaestheticAndSurgery(valueObjectSrc.getAnaestheticAndSurgery());
		// AcuteSurgicalAdmission
		valueObjectDest.setAcuteSurgicalAdmission(valueObjectSrc.getAcuteSurgicalAdmission());
		// SurgerySignificantMobilityReduction
		valueObjectDest.setSurgerySignificantMobilityReduction(valueObjectSrc.getSurgerySignificantMobilityReduction());
		// ActiveBleeding
		valueObjectDest.setActiveBleeding(valueObjectSrc.getActiveBleeding());
		// AcquiredBleeding
		valueObjectDest.setAcquiredBleeding(valueObjectSrc.getAcquiredBleeding());
		// ConcurrentAnticoagulants
		valueObjectDest.setConcurrentAnticoagulants(valueObjectSrc.getConcurrentAnticoagulants());
		// UncontrolledHypertension
		valueObjectDest.setUncontrolledHypertension(valueObjectSrc.getUncontrolledHypertension());
		// Thrombocytopenia
		valueObjectDest.setThrombocytopenia(valueObjectSrc.getThrombocytopenia());
		// AcuteStroke
		valueObjectDest.setAcuteStroke(valueObjectSrc.getAcuteStroke());
		// UntreatedBleedingDisorder
		valueObjectDest.setUntreatedBleedingDisorder(valueObjectSrc.getUntreatedBleedingDisorder());
		// NeuroSpinalEyeSurgery
		valueObjectDest.setNeuroSpinalEyeSurgery(valueObjectSrc.getNeuroSpinalEyeSurgery());
		// OtherProcedureWithHighBleedingRisk
		valueObjectDest.setOtherProcedureWithHighBleedingRisk(valueObjectSrc.getOtherProcedureWithHighBleedingRisk());
		// LumbarPunctureWithinNext12hrs
		valueObjectDest.setLumbarPunctureWithinNext12hrs(valueObjectSrc.getLumbarPunctureWithinNext12hrs());
		// LumbarPuncturePrevious4hrs
		valueObjectDest.setLumbarPuncturePrevious4hrs(valueObjectSrc.getLumbarPuncturePrevious4hrs());
		// RiskGroup
		valueObjectDest.setRiskGroup(valueObjectSrc.getRiskGroup());
		// ProphylaxisOffered
		valueObjectDest.setProphylaxisOffered(valueObjectSrc.getProphylaxisOffered());
		// SurgeryLowerLimbPelvis60mins
		valueObjectDest.setSurgeryLowerLimbPelvis60mins(valueObjectSrc.getSurgeryLowerLimbPelvis60mins());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createVTERiskAssessmentVoCollectionFromVTERiskAssessment(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.VTERiskAssessment objects.
	 */
	public static ims.clinical.vo.VTERiskAssessmentVoCollection createVTERiskAssessmentVoCollectionFromVTERiskAssessment(java.util.Set domainObjectSet)	
	{
		return createVTERiskAssessmentVoCollectionFromVTERiskAssessment(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.VTERiskAssessment objects.
	 */
	public static ims.clinical.vo.VTERiskAssessmentVoCollection createVTERiskAssessmentVoCollectionFromVTERiskAssessment(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.VTERiskAssessmentVoCollection voList = new ims.clinical.vo.VTERiskAssessmentVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.VTERiskAssessment domainObject = (ims.core.clinical.domain.objects.VTERiskAssessment) iterator.next();
			ims.clinical.vo.VTERiskAssessmentVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.VTERiskAssessment objects.
	 */
	public static ims.clinical.vo.VTERiskAssessmentVoCollection createVTERiskAssessmentVoCollectionFromVTERiskAssessment(java.util.List domainObjectList) 
	{
		return createVTERiskAssessmentVoCollectionFromVTERiskAssessment(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.VTERiskAssessment objects.
	 */
	public static ims.clinical.vo.VTERiskAssessmentVoCollection createVTERiskAssessmentVoCollectionFromVTERiskAssessment(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.VTERiskAssessmentVoCollection voList = new ims.clinical.vo.VTERiskAssessmentVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.VTERiskAssessment domainObject = (ims.core.clinical.domain.objects.VTERiskAssessment) domainObjectList.get(i);
			ims.clinical.vo.VTERiskAssessmentVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.VTERiskAssessment set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractVTERiskAssessmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.VTERiskAssessmentVoCollection voCollection) 
	 {
	 	return extractVTERiskAssessmentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractVTERiskAssessmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.VTERiskAssessmentVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.VTERiskAssessmentVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.VTERiskAssessment domainObject = VTERiskAssessmentVoAssembler.extractVTERiskAssessment(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.VTERiskAssessment list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractVTERiskAssessmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.VTERiskAssessmentVoCollection voCollection) 
	 {
	 	return extractVTERiskAssessmentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractVTERiskAssessmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.VTERiskAssessmentVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.VTERiskAssessmentVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.VTERiskAssessment domainObject = VTERiskAssessmentVoAssembler.extractVTERiskAssessment(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.VTERiskAssessment object.
	 * @param domainObject ims.core.clinical.domain.objects.VTERiskAssessment
	 */
	 public static ims.clinical.vo.VTERiskAssessmentVo create(ims.core.clinical.domain.objects.VTERiskAssessment domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.VTERiskAssessment object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.VTERiskAssessmentVo create(DomainObjectMap map, ims.core.clinical.domain.objects.VTERiskAssessment domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.VTERiskAssessmentVo valueObject = (ims.clinical.vo.VTERiskAssessmentVo) map.getValueObject(domainObject, ims.clinical.vo.VTERiskAssessmentVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.VTERiskAssessmentVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.VTERiskAssessment
	 */
	 public static ims.clinical.vo.VTERiskAssessmentVo insert(ims.clinical.vo.VTERiskAssessmentVo valueObject, ims.core.clinical.domain.objects.VTERiskAssessment domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.VTERiskAssessment
	 */
	 public static ims.clinical.vo.VTERiskAssessmentVo insert(DomainObjectMap map, ims.clinical.vo.VTERiskAssessmentVo valueObject, ims.core.clinical.domain.objects.VTERiskAssessment domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_VTERiskAssessment(domainObject.getId());
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
			
		// Patient
		valueObject.setPatient(ims.core.vo.domain.PatientShortAssembler.create(map, domainObject.getPatient()) );
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
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// RecordingInformation
		valueObject.setRecordingInformation(ims.core.vo.domain.RecordingUserInformationVoAssembler.create(map, domainObject.getRecordingInformation()) );
		// VTEAssessmentStatus
		ims.domain.lookups.LookupInstance instance5 = domainObject.getVTEAssessmentStatus();
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

			ims.clinical.vo.lookups.VTEAsessmentStatus voLookup5 = new ims.clinical.vo.lookups.VTEAsessmentStatus(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.clinical.vo.lookups.VTEAsessmentStatus parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.clinical.vo.lookups.VTEAsessmentStatus(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setVTEAssessmentStatus(voLookup5);
		}
				// CompletedBy
		valueObject.setCompletedBy(ims.core.vo.domain.RecordingUserInformationVoAssembler.create(map, domainObject.getCompletedBy()) );
		// NotExpectedReducedMobility
		ims.domain.lookups.LookupInstance instance7 = domainObject.getNotExpectedReducedMobility();
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
			valueObject.setNotExpectedReducedMobility(voLookup7);
		}
				// ActiveCancer
		ims.domain.lookups.LookupInstance instance8 = domainObject.getActiveCancer();
		if ( null != instance8 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance8.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance8.getImage().getImageId(), instance8.getImage().getImagePath());
			}
			color = instance8.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup8 = new ims.core.vo.lookups.YesNo(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup8 = voLookup8;
			ims.domain.lookups.LookupInstance parent8 = instance8.getParent();
			while (parent8 != null)
			{
				if (parent8.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent8.getImage().getImageId(), parent8.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent8.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup8.setParent(new ims.core.vo.lookups.YesNo(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setActiveCancer(voLookup8);
		}
				// AgeOverSixty
		ims.domain.lookups.LookupInstance instance9 = domainObject.getAgeOverSixty();
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
			valueObject.setAgeOverSixty(voLookup9);
		}
				// Dehydration
		ims.domain.lookups.LookupInstance instance10 = domainObject.getDehydration();
		if ( null != instance10 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance10.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance10.getImage().getImageId(), instance10.getImage().getImagePath());
			}
			color = instance10.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup10 = new ims.core.vo.lookups.YesNo(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup10 = voLookup10;
			ims.domain.lookups.LookupInstance parent10 = instance10.getParent();
			while (parent10 != null)
			{
				if (parent10.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent10.getImage().getImageId(), parent10.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent10.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup10.setParent(new ims.core.vo.lookups.YesNo(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setDehydration(voLookup10);
		}
				// KnownThrombophilias
		ims.domain.lookups.LookupInstance instance11 = domainObject.getKnownThrombophilias();
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
			valueObject.setKnownThrombophilias(voLookup11);
		}
				// Obesity
		ims.domain.lookups.LookupInstance instance12 = domainObject.getObesity();
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
			valueObject.setObesity(voLookup12);
		}
				// SignificantMorbidities
		ims.domain.lookups.LookupInstance instance13 = domainObject.getSignificantMorbidities();
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
			valueObject.setSignificantMorbidities(voLookup13);
		}
				// HistoryOfVTE
		ims.domain.lookups.LookupInstance instance14 = domainObject.getHistoryOfVTE();
		if ( null != instance14 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance14.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance14.getImage().getImageId(), instance14.getImage().getImagePath());
			}
			color = instance14.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup14 = new ims.core.vo.lookups.YesNo(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup14 = voLookup14;
			ims.domain.lookups.LookupInstance parent14 = instance14.getParent();
			while (parent14 != null)
			{
				if (parent14.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent14.getImage().getImageId(), parent14.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent14.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup14.setParent(new ims.core.vo.lookups.YesNo(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setHistoryOfVTE(voLookup14);
		}
				// UseOfHRT
		ims.domain.lookups.LookupInstance instance15 = domainObject.getUseOfHRT();
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
			valueObject.setUseOfHRT(voLookup15);
		}
				// UseOfOstogren
		ims.domain.lookups.LookupInstance instance16 = domainObject.getUseOfOstogren();
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
			valueObject.setUseOfOstogren(voLookup16);
		}
				// VaricoseVeins
		ims.domain.lookups.LookupInstance instance17 = domainObject.getVaricoseVeins();
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
			valueObject.setVaricoseVeins(voLookup17);
		}
				// Pregnancy
		ims.domain.lookups.LookupInstance instance18 = domainObject.getPregnancy();
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

			ims.core.vo.lookups.YesNo voLookup18 = new ims.core.vo.lookups.YesNo(instance18.getId(),instance18.getText(), instance18.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup18 = voLookup18;
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
								parentVoLookup18.setParent(new ims.core.vo.lookups.YesNo(parent18.getId(),parent18.getText(), parent18.isActive(), null, img, color));
				parentVoLookup18 = parentVoLookup18.getParent();
								parent18 = parent18.getParent();
			}			
			valueObject.setPregnancy(voLookup18);
		}
				// ReducedMobility
		ims.domain.lookups.LookupInstance instance19 = domainObject.getReducedMobility();
		if ( null != instance19 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance19.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance19.getImage().getImageId(), instance19.getImage().getImagePath());
			}
			color = instance19.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup19 = new ims.core.vo.lookups.YesNo(instance19.getId(),instance19.getText(), instance19.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup19 = voLookup19;
			ims.domain.lookups.LookupInstance parent19 = instance19.getParent();
			while (parent19 != null)
			{
				if (parent19.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent19.getImage().getImageId(), parent19.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent19.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup19.setParent(new ims.core.vo.lookups.YesNo(parent19.getId(),parent19.getText(), parent19.isActive(), null, img, color));
				parentVoLookup19 = parentVoLookup19.getParent();
								parent19 = parent19.getParent();
			}			
			valueObject.setReducedMobility(voLookup19);
		}
				// CriticalCareAdmission
		ims.domain.lookups.LookupInstance instance20 = domainObject.getCriticalCareAdmission();
		if ( null != instance20 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance20.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance20.getImage().getImageId(), instance20.getImage().getImagePath());
			}
			color = instance20.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup20 = new ims.core.vo.lookups.YesNo(instance20.getId(),instance20.getText(), instance20.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup20 = voLookup20;
			ims.domain.lookups.LookupInstance parent20 = instance20.getParent();
			while (parent20 != null)
			{
				if (parent20.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent20.getImage().getImageId(), parent20.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent20.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup20.setParent(new ims.core.vo.lookups.YesNo(parent20.getId(),parent20.getText(), parent20.isActive(), null, img, color));
				parentVoLookup20 = parentVoLookup20.getParent();
								parent20 = parent20.getParent();
			}			
			valueObject.setCriticalCareAdmission(voLookup20);
		}
				// HipKneeReplacement
		ims.domain.lookups.LookupInstance instance21 = domainObject.getHipKneeReplacement();
		if ( null != instance21 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance21.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance21.getImage().getImageId(), instance21.getImage().getImagePath());
			}
			color = instance21.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup21 = new ims.core.vo.lookups.YesNo(instance21.getId(),instance21.getText(), instance21.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup21 = voLookup21;
			ims.domain.lookups.LookupInstance parent21 = instance21.getParent();
			while (parent21 != null)
			{
				if (parent21.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent21.getImage().getImageId(), parent21.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent21.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup21.setParent(new ims.core.vo.lookups.YesNo(parent21.getId(),parent21.getText(), parent21.isActive(), null, img, color));
				parentVoLookup21 = parentVoLookup21.getParent();
								parent21 = parent21.getParent();
			}			
			valueObject.setHipKneeReplacement(voLookup21);
		}
				// HipFracture
		ims.domain.lookups.LookupInstance instance22 = domainObject.getHipFracture();
		if ( null != instance22 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance22.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance22.getImage().getImageId(), instance22.getImage().getImagePath());
			}
			color = instance22.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup22 = new ims.core.vo.lookups.YesNo(instance22.getId(),instance22.getText(), instance22.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup22 = voLookup22;
			ims.domain.lookups.LookupInstance parent22 = instance22.getParent();
			while (parent22 != null)
			{
				if (parent22.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent22.getImage().getImageId(), parent22.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent22.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup22.setParent(new ims.core.vo.lookups.YesNo(parent22.getId(),parent22.getText(), parent22.isActive(), null, img, color));
				parentVoLookup22 = parentVoLookup22.getParent();
								parent22 = parent22.getParent();
			}			
			valueObject.setHipFracture(voLookup22);
		}
				// AnaestheticAndSurgery
		ims.domain.lookups.LookupInstance instance23 = domainObject.getAnaestheticAndSurgery();
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

			ims.core.vo.lookups.YesNo voLookup23 = new ims.core.vo.lookups.YesNo(instance23.getId(),instance23.getText(), instance23.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup23 = voLookup23;
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
								parentVoLookup23.setParent(new ims.core.vo.lookups.YesNo(parent23.getId(),parent23.getText(), parent23.isActive(), null, img, color));
				parentVoLookup23 = parentVoLookup23.getParent();
								parent23 = parent23.getParent();
			}			
			valueObject.setAnaestheticAndSurgery(voLookup23);
		}
				// AcuteSurgicalAdmission
		ims.domain.lookups.LookupInstance instance24 = domainObject.getAcuteSurgicalAdmission();
		if ( null != instance24 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance24.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance24.getImage().getImageId(), instance24.getImage().getImagePath());
			}
			color = instance24.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup24 = new ims.core.vo.lookups.YesNo(instance24.getId(),instance24.getText(), instance24.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup24 = voLookup24;
			ims.domain.lookups.LookupInstance parent24 = instance24.getParent();
			while (parent24 != null)
			{
				if (parent24.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent24.getImage().getImageId(), parent24.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent24.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup24.setParent(new ims.core.vo.lookups.YesNo(parent24.getId(),parent24.getText(), parent24.isActive(), null, img, color));
				parentVoLookup24 = parentVoLookup24.getParent();
								parent24 = parent24.getParent();
			}			
			valueObject.setAcuteSurgicalAdmission(voLookup24);
		}
				// SurgerySignificantMobilityReduction
		ims.domain.lookups.LookupInstance instance25 = domainObject.getSurgerySignificantMobilityReduction();
		if ( null != instance25 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance25.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance25.getImage().getImageId(), instance25.getImage().getImagePath());
			}
			color = instance25.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup25 = new ims.core.vo.lookups.YesNo(instance25.getId(),instance25.getText(), instance25.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup25 = voLookup25;
			ims.domain.lookups.LookupInstance parent25 = instance25.getParent();
			while (parent25 != null)
			{
				if (parent25.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent25.getImage().getImageId(), parent25.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent25.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup25.setParent(new ims.core.vo.lookups.YesNo(parent25.getId(),parent25.getText(), parent25.isActive(), null, img, color));
				parentVoLookup25 = parentVoLookup25.getParent();
								parent25 = parent25.getParent();
			}			
			valueObject.setSurgerySignificantMobilityReduction(voLookup25);
		}
				// ActiveBleeding
		ims.domain.lookups.LookupInstance instance26 = domainObject.getActiveBleeding();
		if ( null != instance26 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance26.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance26.getImage().getImageId(), instance26.getImage().getImagePath());
			}
			color = instance26.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup26 = new ims.core.vo.lookups.YesNo(instance26.getId(),instance26.getText(), instance26.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup26 = voLookup26;
			ims.domain.lookups.LookupInstance parent26 = instance26.getParent();
			while (parent26 != null)
			{
				if (parent26.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent26.getImage().getImageId(), parent26.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent26.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup26.setParent(new ims.core.vo.lookups.YesNo(parent26.getId(),parent26.getText(), parent26.isActive(), null, img, color));
				parentVoLookup26 = parentVoLookup26.getParent();
								parent26 = parent26.getParent();
			}			
			valueObject.setActiveBleeding(voLookup26);
		}
				// AcquiredBleeding
		ims.domain.lookups.LookupInstance instance27 = domainObject.getAcquiredBleeding();
		if ( null != instance27 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance27.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance27.getImage().getImageId(), instance27.getImage().getImagePath());
			}
			color = instance27.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup27 = new ims.core.vo.lookups.YesNo(instance27.getId(),instance27.getText(), instance27.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup27 = voLookup27;
			ims.domain.lookups.LookupInstance parent27 = instance27.getParent();
			while (parent27 != null)
			{
				if (parent27.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent27.getImage().getImageId(), parent27.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent27.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup27.setParent(new ims.core.vo.lookups.YesNo(parent27.getId(),parent27.getText(), parent27.isActive(), null, img, color));
				parentVoLookup27 = parentVoLookup27.getParent();
								parent27 = parent27.getParent();
			}			
			valueObject.setAcquiredBleeding(voLookup27);
		}
				// ConcurrentAnticoagulants
		ims.domain.lookups.LookupInstance instance28 = domainObject.getConcurrentAnticoagulants();
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

			ims.core.vo.lookups.YesNo voLookup28 = new ims.core.vo.lookups.YesNo(instance28.getId(),instance28.getText(), instance28.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup28 = voLookup28;
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
								parentVoLookup28.setParent(new ims.core.vo.lookups.YesNo(parent28.getId(),parent28.getText(), parent28.isActive(), null, img, color));
				parentVoLookup28 = parentVoLookup28.getParent();
								parent28 = parent28.getParent();
			}			
			valueObject.setConcurrentAnticoagulants(voLookup28);
		}
				// UncontrolledHypertension
		ims.domain.lookups.LookupInstance instance29 = domainObject.getUncontrolledHypertension();
		if ( null != instance29 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance29.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance29.getImage().getImageId(), instance29.getImage().getImagePath());
			}
			color = instance29.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup29 = new ims.core.vo.lookups.YesNo(instance29.getId(),instance29.getText(), instance29.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup29 = voLookup29;
			ims.domain.lookups.LookupInstance parent29 = instance29.getParent();
			while (parent29 != null)
			{
				if (parent29.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent29.getImage().getImageId(), parent29.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent29.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup29.setParent(new ims.core.vo.lookups.YesNo(parent29.getId(),parent29.getText(), parent29.isActive(), null, img, color));
				parentVoLookup29 = parentVoLookup29.getParent();
								parent29 = parent29.getParent();
			}			
			valueObject.setUncontrolledHypertension(voLookup29);
		}
				// Thrombocytopenia
		ims.domain.lookups.LookupInstance instance30 = domainObject.getThrombocytopenia();
		if ( null != instance30 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance30.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance30.getImage().getImageId(), instance30.getImage().getImagePath());
			}
			color = instance30.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup30 = new ims.core.vo.lookups.YesNo(instance30.getId(),instance30.getText(), instance30.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup30 = voLookup30;
			ims.domain.lookups.LookupInstance parent30 = instance30.getParent();
			while (parent30 != null)
			{
				if (parent30.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent30.getImage().getImageId(), parent30.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent30.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup30.setParent(new ims.core.vo.lookups.YesNo(parent30.getId(),parent30.getText(), parent30.isActive(), null, img, color));
				parentVoLookup30 = parentVoLookup30.getParent();
								parent30 = parent30.getParent();
			}			
			valueObject.setThrombocytopenia(voLookup30);
		}
				// AcuteStroke
		ims.domain.lookups.LookupInstance instance31 = domainObject.getAcuteStroke();
		if ( null != instance31 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance31.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance31.getImage().getImageId(), instance31.getImage().getImagePath());
			}
			color = instance31.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup31 = new ims.core.vo.lookups.YesNo(instance31.getId(),instance31.getText(), instance31.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup31 = voLookup31;
			ims.domain.lookups.LookupInstance parent31 = instance31.getParent();
			while (parent31 != null)
			{
				if (parent31.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent31.getImage().getImageId(), parent31.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent31.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup31.setParent(new ims.core.vo.lookups.YesNo(parent31.getId(),parent31.getText(), parent31.isActive(), null, img, color));
				parentVoLookup31 = parentVoLookup31.getParent();
								parent31 = parent31.getParent();
			}			
			valueObject.setAcuteStroke(voLookup31);
		}
				// UntreatedBleedingDisorder
		ims.domain.lookups.LookupInstance instance32 = domainObject.getUntreatedBleedingDisorder();
		if ( null != instance32 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance32.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance32.getImage().getImageId(), instance32.getImage().getImagePath());
			}
			color = instance32.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup32 = new ims.core.vo.lookups.YesNo(instance32.getId(),instance32.getText(), instance32.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup32 = voLookup32;
			ims.domain.lookups.LookupInstance parent32 = instance32.getParent();
			while (parent32 != null)
			{
				if (parent32.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent32.getImage().getImageId(), parent32.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent32.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup32.setParent(new ims.core.vo.lookups.YesNo(parent32.getId(),parent32.getText(), parent32.isActive(), null, img, color));
				parentVoLookup32 = parentVoLookup32.getParent();
								parent32 = parent32.getParent();
			}			
			valueObject.setUntreatedBleedingDisorder(voLookup32);
		}
				// NeuroSpinalEyeSurgery
		ims.domain.lookups.LookupInstance instance33 = domainObject.getNeuroSpinalEyeSurgery();
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

			ims.core.vo.lookups.YesNo voLookup33 = new ims.core.vo.lookups.YesNo(instance33.getId(),instance33.getText(), instance33.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup33 = voLookup33;
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
								parentVoLookup33.setParent(new ims.core.vo.lookups.YesNo(parent33.getId(),parent33.getText(), parent33.isActive(), null, img, color));
				parentVoLookup33 = parentVoLookup33.getParent();
								parent33 = parent33.getParent();
			}			
			valueObject.setNeuroSpinalEyeSurgery(voLookup33);
		}
				// OtherProcedureWithHighBleedingRisk
		ims.domain.lookups.LookupInstance instance34 = domainObject.getOtherProcedureWithHighBleedingRisk();
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

			ims.core.vo.lookups.YesNo voLookup34 = new ims.core.vo.lookups.YesNo(instance34.getId(),instance34.getText(), instance34.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup34 = voLookup34;
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
								parentVoLookup34.setParent(new ims.core.vo.lookups.YesNo(parent34.getId(),parent34.getText(), parent34.isActive(), null, img, color));
				parentVoLookup34 = parentVoLookup34.getParent();
								parent34 = parent34.getParent();
			}			
			valueObject.setOtherProcedureWithHighBleedingRisk(voLookup34);
		}
				// LumbarPunctureWithinNext12hrs
		ims.domain.lookups.LookupInstance instance35 = domainObject.getLumbarPunctureWithinNext12hrs();
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

			ims.core.vo.lookups.YesNo voLookup35 = new ims.core.vo.lookups.YesNo(instance35.getId(),instance35.getText(), instance35.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup35 = voLookup35;
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
								parentVoLookup35.setParent(new ims.core.vo.lookups.YesNo(parent35.getId(),parent35.getText(), parent35.isActive(), null, img, color));
				parentVoLookup35 = parentVoLookup35.getParent();
								parent35 = parent35.getParent();
			}			
			valueObject.setLumbarPunctureWithinNext12hrs(voLookup35);
		}
				// LumbarPuncturePrevious4hrs
		ims.domain.lookups.LookupInstance instance36 = domainObject.getLumbarPuncturePrevious4hrs();
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

			ims.core.vo.lookups.YesNo voLookup36 = new ims.core.vo.lookups.YesNo(instance36.getId(),instance36.getText(), instance36.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup36 = voLookup36;
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
								parentVoLookup36.setParent(new ims.core.vo.lookups.YesNo(parent36.getId(),parent36.getText(), parent36.isActive(), null, img, color));
				parentVoLookup36 = parentVoLookup36.getParent();
								parent36 = parent36.getParent();
			}			
			valueObject.setLumbarPuncturePrevious4hrs(voLookup36);
		}
				// RiskGroup
		ims.domain.lookups.LookupInstance instance37 = domainObject.getRiskGroup();
		if ( null != instance37 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance37.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance37.getImage().getImageId(), instance37.getImage().getImagePath());
			}
			color = instance37.getColor();
			if (color != null) 
				color.getValue();

			ims.clinical.vo.lookups.VTERiskGroup voLookup37 = new ims.clinical.vo.lookups.VTERiskGroup(instance37.getId(),instance37.getText(), instance37.isActive(), null, img, color);
			ims.clinical.vo.lookups.VTERiskGroup parentVoLookup37 = voLookup37;
			ims.domain.lookups.LookupInstance parent37 = instance37.getParent();
			while (parent37 != null)
			{
				if (parent37.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent37.getImage().getImageId(), parent37.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent37.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup37.setParent(new ims.clinical.vo.lookups.VTERiskGroup(parent37.getId(),parent37.getText(), parent37.isActive(), null, img, color));
				parentVoLookup37 = parentVoLookup37.getParent();
								parent37 = parent37.getParent();
			}			
			valueObject.setRiskGroup(voLookup37);
		}
				// ProphylaxisOffered
		ims.domain.lookups.LookupInstance instance38 = domainObject.getProphylaxisOffered();
		if ( null != instance38 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance38.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance38.getImage().getImageId(), instance38.getImage().getImagePath());
			}
			color = instance38.getColor();
			if (color != null) 
				color.getValue();

			ims.clinical.vo.lookups.ProphylaxisOffered voLookup38 = new ims.clinical.vo.lookups.ProphylaxisOffered(instance38.getId(),instance38.getText(), instance38.isActive(), null, img, color);
			ims.clinical.vo.lookups.ProphylaxisOffered parentVoLookup38 = voLookup38;
			ims.domain.lookups.LookupInstance parent38 = instance38.getParent();
			while (parent38 != null)
			{
				if (parent38.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent38.getImage().getImageId(), parent38.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent38.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup38.setParent(new ims.clinical.vo.lookups.ProphylaxisOffered(parent38.getId(),parent38.getText(), parent38.isActive(), null, img, color));
				parentVoLookup38 = parentVoLookup38.getParent();
								parent38 = parent38.getParent();
			}			
			valueObject.setProphylaxisOffered(voLookup38);
		}
				// SurgeryLowerLimbPelvis60mins
		ims.domain.lookups.LookupInstance instance39 = domainObject.getSurgeryLowerLimbPelvis60mins();
		if ( null != instance39 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance39.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance39.getImage().getImageId(), instance39.getImage().getImagePath());
			}
			color = instance39.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup39 = new ims.core.vo.lookups.YesNo(instance39.getId(),instance39.getText(), instance39.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup39 = voLookup39;
			ims.domain.lookups.LookupInstance parent39 = instance39.getParent();
			while (parent39 != null)
			{
				if (parent39.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent39.getImage().getImageId(), parent39.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent39.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup39.setParent(new ims.core.vo.lookups.YesNo(parent39.getId(),parent39.getText(), parent39.isActive(), null, img, color));
				parentVoLookup39 = parentVoLookup39.getParent();
								parent39 = parent39.getParent();
			}			
			valueObject.setSurgeryLowerLimbPelvis60mins(voLookup39);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.VTERiskAssessment extractVTERiskAssessment(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.VTERiskAssessmentVo valueObject) 
	{
		return 	extractVTERiskAssessment(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.VTERiskAssessment extractVTERiskAssessment(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.VTERiskAssessmentVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_VTERiskAssessment();
		ims.core.clinical.domain.objects.VTERiskAssessment domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.VTERiskAssessment)domMap.get(valueObject);
			}
			// ims.clinical.vo.VTERiskAssessmentVo ID_VTERiskAssessment field is unknown
			domainObject = new ims.core.clinical.domain.objects.VTERiskAssessment();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_VTERiskAssessment());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.VTERiskAssessment)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.VTERiskAssessment) domainFactory.getDomainObject(ims.core.clinical.domain.objects.VTERiskAssessment.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_VTERiskAssessment());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.patient.domain.objects.Patient value1 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value1 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else
			{
				value1 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value1);
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
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		domainObject.setRecordingInformation(ims.core.vo.domain.RecordingUserInformationVoAssembler.extractRecordingUserInformation(domainFactory, valueObject.getRecordingInformation(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getVTEAssessmentStatus() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getVTEAssessmentStatus().getID());
		}
		domainObject.setVTEAssessmentStatus(value5);
		domainObject.setCompletedBy(ims.core.vo.domain.RecordingUserInformationVoAssembler.extractRecordingUserInformation(domainFactory, valueObject.getCompletedBy(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getNotExpectedReducedMobility() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getNotExpectedReducedMobility().getID());
		}
		domainObject.setNotExpectedReducedMobility(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getActiveCancer() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getActiveCancer().getID());
		}
		domainObject.setActiveCancer(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getAgeOverSixty() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getAgeOverSixty().getID());
		}
		domainObject.setAgeOverSixty(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getDehydration() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getDehydration().getID());
		}
		domainObject.setDehydration(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getKnownThrombophilias() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getKnownThrombophilias().getID());
		}
		domainObject.setKnownThrombophilias(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getObesity() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getObesity().getID());
		}
		domainObject.setObesity(value12);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getSignificantMorbidities() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getSignificantMorbidities().getID());
		}
		domainObject.setSignificantMorbidities(value13);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getHistoryOfVTE() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getHistoryOfVTE().getID());
		}
		domainObject.setHistoryOfVTE(value14);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getUseOfHRT() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getUseOfHRT().getID());
		}
		domainObject.setUseOfHRT(value15);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getUseOfOstogren() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getUseOfOstogren().getID());
		}
		domainObject.setUseOfOstogren(value16);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value17 = null;
		if ( null != valueObject.getVaricoseVeins() ) 
		{
			value17 =
				domainFactory.getLookupInstance(valueObject.getVaricoseVeins().getID());
		}
		domainObject.setVaricoseVeins(value17);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value18 = null;
		if ( null != valueObject.getPregnancy() ) 
		{
			value18 =
				domainFactory.getLookupInstance(valueObject.getPregnancy().getID());
		}
		domainObject.setPregnancy(value18);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value19 = null;
		if ( null != valueObject.getReducedMobility() ) 
		{
			value19 =
				domainFactory.getLookupInstance(valueObject.getReducedMobility().getID());
		}
		domainObject.setReducedMobility(value19);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value20 = null;
		if ( null != valueObject.getCriticalCareAdmission() ) 
		{
			value20 =
				domainFactory.getLookupInstance(valueObject.getCriticalCareAdmission().getID());
		}
		domainObject.setCriticalCareAdmission(value20);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value21 = null;
		if ( null != valueObject.getHipKneeReplacement() ) 
		{
			value21 =
				domainFactory.getLookupInstance(valueObject.getHipKneeReplacement().getID());
		}
		domainObject.setHipKneeReplacement(value21);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value22 = null;
		if ( null != valueObject.getHipFracture() ) 
		{
			value22 =
				domainFactory.getLookupInstance(valueObject.getHipFracture().getID());
		}
		domainObject.setHipFracture(value22);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value23 = null;
		if ( null != valueObject.getAnaestheticAndSurgery() ) 
		{
			value23 =
				domainFactory.getLookupInstance(valueObject.getAnaestheticAndSurgery().getID());
		}
		domainObject.setAnaestheticAndSurgery(value23);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value24 = null;
		if ( null != valueObject.getAcuteSurgicalAdmission() ) 
		{
			value24 =
				domainFactory.getLookupInstance(valueObject.getAcuteSurgicalAdmission().getID());
		}
		domainObject.setAcuteSurgicalAdmission(value24);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value25 = null;
		if ( null != valueObject.getSurgerySignificantMobilityReduction() ) 
		{
			value25 =
				domainFactory.getLookupInstance(valueObject.getSurgerySignificantMobilityReduction().getID());
		}
		domainObject.setSurgerySignificantMobilityReduction(value25);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value26 = null;
		if ( null != valueObject.getActiveBleeding() ) 
		{
			value26 =
				domainFactory.getLookupInstance(valueObject.getActiveBleeding().getID());
		}
		domainObject.setActiveBleeding(value26);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value27 = null;
		if ( null != valueObject.getAcquiredBleeding() ) 
		{
			value27 =
				domainFactory.getLookupInstance(valueObject.getAcquiredBleeding().getID());
		}
		domainObject.setAcquiredBleeding(value27);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value28 = null;
		if ( null != valueObject.getConcurrentAnticoagulants() ) 
		{
			value28 =
				domainFactory.getLookupInstance(valueObject.getConcurrentAnticoagulants().getID());
		}
		domainObject.setConcurrentAnticoagulants(value28);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value29 = null;
		if ( null != valueObject.getUncontrolledHypertension() ) 
		{
			value29 =
				domainFactory.getLookupInstance(valueObject.getUncontrolledHypertension().getID());
		}
		domainObject.setUncontrolledHypertension(value29);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value30 = null;
		if ( null != valueObject.getThrombocytopenia() ) 
		{
			value30 =
				domainFactory.getLookupInstance(valueObject.getThrombocytopenia().getID());
		}
		domainObject.setThrombocytopenia(value30);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value31 = null;
		if ( null != valueObject.getAcuteStroke() ) 
		{
			value31 =
				domainFactory.getLookupInstance(valueObject.getAcuteStroke().getID());
		}
		domainObject.setAcuteStroke(value31);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value32 = null;
		if ( null != valueObject.getUntreatedBleedingDisorder() ) 
		{
			value32 =
				domainFactory.getLookupInstance(valueObject.getUntreatedBleedingDisorder().getID());
		}
		domainObject.setUntreatedBleedingDisorder(value32);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value33 = null;
		if ( null != valueObject.getNeuroSpinalEyeSurgery() ) 
		{
			value33 =
				domainFactory.getLookupInstance(valueObject.getNeuroSpinalEyeSurgery().getID());
		}
		domainObject.setNeuroSpinalEyeSurgery(value33);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value34 = null;
		if ( null != valueObject.getOtherProcedureWithHighBleedingRisk() ) 
		{
			value34 =
				domainFactory.getLookupInstance(valueObject.getOtherProcedureWithHighBleedingRisk().getID());
		}
		domainObject.setOtherProcedureWithHighBleedingRisk(value34);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value35 = null;
		if ( null != valueObject.getLumbarPunctureWithinNext12hrs() ) 
		{
			value35 =
				domainFactory.getLookupInstance(valueObject.getLumbarPunctureWithinNext12hrs().getID());
		}
		domainObject.setLumbarPunctureWithinNext12hrs(value35);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value36 = null;
		if ( null != valueObject.getLumbarPuncturePrevious4hrs() ) 
		{
			value36 =
				domainFactory.getLookupInstance(valueObject.getLumbarPuncturePrevious4hrs().getID());
		}
		domainObject.setLumbarPuncturePrevious4hrs(value36);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value37 = null;
		if ( null != valueObject.getRiskGroup() ) 
		{
			value37 =
				domainFactory.getLookupInstance(valueObject.getRiskGroup().getID());
		}
		domainObject.setRiskGroup(value37);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value38 = null;
		if ( null != valueObject.getProphylaxisOffered() ) 
		{
			value38 =
				domainFactory.getLookupInstance(valueObject.getProphylaxisOffered().getID());
		}
		domainObject.setProphylaxisOffered(value38);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value39 = null;
		if ( null != valueObject.getSurgeryLowerLimbPelvis60mins() ) 
		{
			value39 =
				domainFactory.getLookupInstance(valueObject.getSurgeryLowerLimbPelvis60mins().getID());
		}
		domainObject.setSurgeryLowerLimbPelvis60mins(value39);

		return domainObject;
	}

}
