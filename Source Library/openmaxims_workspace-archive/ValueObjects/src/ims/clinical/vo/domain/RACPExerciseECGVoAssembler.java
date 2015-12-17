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
 * @author Peter Martin
 */
public class RACPExerciseECGVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.RACPExerciseECGVo copy(ims.clinical.vo.RACPExerciseECGVo valueObjectDest, ims.clinical.vo.RACPExerciseECGVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_RACPExerciseECG(valueObjectSrc.getID_RACPExerciseECG());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// PreAssessesCHD
		valueObjectDest.setPreAssessesCHD(valueObjectSrc.getPreAssessesCHD());
		// Protocol
		valueObjectDest.setProtocol(valueObjectSrc.getProtocol());
		// MedicationAtTest
		valueObjectDest.setMedicationAtTest(valueObjectSrc.getMedicationAtTest());
		// DurationMins
		valueObjectDest.setDurationMins(valueObjectSrc.getDurationMins());
		// DurationSecs
		valueObjectDest.setDurationSecs(valueObjectSrc.getDurationSecs());
		// VSPulse
		valueObjectDest.setVSPulse(valueObjectSrc.getVSPulse());
		// VSBP
		valueObjectDest.setVSBP(valueObjectSrc.getVSBP());
		// MaxPredHeartRate
		valueObjectDest.setMaxPredHeartRate(valueObjectSrc.getMaxPredHeartRate());
		// StopReasons
		valueObjectDest.setStopReasons(valueObjectSrc.getStopReasons());
		// Dysponea
		valueObjectDest.setDysponea(valueObjectSrc.getDysponea());
		// SympomOnset
		valueObjectDest.setSympomOnset(valueObjectSrc.getSympomOnset());
		// OtherFindings
		valueObjectDest.setOtherFindings(valueObjectSrc.getOtherFindings());
		// MaxSTChangeMM
		valueObjectDest.setMaxSTChangeMM(valueObjectSrc.getMaxSTChangeMM());
		// MinsTo1mmChange
		valueObjectDest.setMinsTo1mmChange(valueObjectSrc.getMinsTo1mmChange());
		// SecsTo1mmChange
		valueObjectDest.setSecsTo1mmChange(valueObjectSrc.getSecsTo1mmChange());
		// Result
		valueObjectDest.setResult(valueObjectSrc.getResult());
		// Interpretation
		valueObjectDest.setInterpretation(valueObjectSrc.getInterpretation());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// PainExperienced
		valueObjectDest.setPainExperienced(valueObjectSrc.getPainExperienced());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createRACPExerciseECGVoCollectionFromRACPExerciseECG(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.RACPExerciseECG objects.
	 */
	public static ims.clinical.vo.RACPExerciseECGVoCollection createRACPExerciseECGVoCollectionFromRACPExerciseECG(java.util.Set domainObjectSet)	
	{
		return createRACPExerciseECGVoCollectionFromRACPExerciseECG(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.RACPExerciseECG objects.
	 */
	public static ims.clinical.vo.RACPExerciseECGVoCollection createRACPExerciseECGVoCollectionFromRACPExerciseECG(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.RACPExerciseECGVoCollection voList = new ims.clinical.vo.RACPExerciseECGVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.RACPExerciseECG domainObject = (ims.clinical.domain.objects.RACPExerciseECG) iterator.next();
			ims.clinical.vo.RACPExerciseECGVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.RACPExerciseECG objects.
	 */
	public static ims.clinical.vo.RACPExerciseECGVoCollection createRACPExerciseECGVoCollectionFromRACPExerciseECG(java.util.List domainObjectList) 
	{
		return createRACPExerciseECGVoCollectionFromRACPExerciseECG(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.RACPExerciseECG objects.
	 */
	public static ims.clinical.vo.RACPExerciseECGVoCollection createRACPExerciseECGVoCollectionFromRACPExerciseECG(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.RACPExerciseECGVoCollection voList = new ims.clinical.vo.RACPExerciseECGVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.RACPExerciseECG domainObject = (ims.clinical.domain.objects.RACPExerciseECG) domainObjectList.get(i);
			ims.clinical.vo.RACPExerciseECGVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.RACPExerciseECG set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractRACPExerciseECGSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.RACPExerciseECGVoCollection voCollection) 
	 {
	 	return extractRACPExerciseECGSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractRACPExerciseECGSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.RACPExerciseECGVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.RACPExerciseECGVo vo = voCollection.get(i);
			ims.clinical.domain.objects.RACPExerciseECG domainObject = RACPExerciseECGVoAssembler.extractRACPExerciseECG(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.RACPExerciseECG list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractRACPExerciseECGList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.RACPExerciseECGVoCollection voCollection) 
	 {
	 	return extractRACPExerciseECGList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractRACPExerciseECGList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.RACPExerciseECGVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.RACPExerciseECGVo vo = voCollection.get(i);
			ims.clinical.domain.objects.RACPExerciseECG domainObject = RACPExerciseECGVoAssembler.extractRACPExerciseECG(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.RACPExerciseECG object.
	 * @param domainObject ims.clinical.domain.objects.RACPExerciseECG
	 */
	 public static ims.clinical.vo.RACPExerciseECGVo create(ims.clinical.domain.objects.RACPExerciseECG domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.RACPExerciseECG object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.RACPExerciseECGVo create(DomainObjectMap map, ims.clinical.domain.objects.RACPExerciseECG domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.RACPExerciseECGVo valueObject = (ims.clinical.vo.RACPExerciseECGVo) map.getValueObject(domainObject, ims.clinical.vo.RACPExerciseECGVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.RACPExerciseECGVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.RACPExerciseECG
	 */
	 public static ims.clinical.vo.RACPExerciseECGVo insert(ims.clinical.vo.RACPExerciseECGVo valueObject, ims.clinical.domain.objects.RACPExerciseECG domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.RACPExerciseECG
	 */
	 public static ims.clinical.vo.RACPExerciseECGVo insert(DomainObjectMap map, ims.clinical.vo.RACPExerciseECGVo valueObject, ims.clinical.domain.objects.RACPExerciseECG domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_RACPExerciseECG(domainObject.getId());
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
			
		// PreAssessesCHD
		ims.domain.lookups.LookupInstance instance1 = domainObject.getPreAssessesCHD();
		if ( null != instance1 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance1.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance1.getImage().getImageId(), instance1.getImage().getImagePath());
			}
			color = instance1.getColor();
			if (color != null) 
				color.getValue();

			ims.clinical.vo.lookups.RACPPreAssessmentCHD voLookup1 = new ims.clinical.vo.lookups.RACPPreAssessmentCHD(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.clinical.vo.lookups.RACPPreAssessmentCHD parentVoLookup1 = voLookup1;
			ims.domain.lookups.LookupInstance parent1 = instance1.getParent();
			while (parent1 != null)
			{
				if (parent1.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent1.getImage().getImageId(), parent1.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent1.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup1.setParent(new ims.clinical.vo.lookups.RACPPreAssessmentCHD(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setPreAssessesCHD(voLookup1);
		}
				// Protocol
		ims.domain.lookups.LookupInstance instance2 = domainObject.getProtocol();
		if ( null != instance2 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance2.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance2.getImage().getImageId(), instance2.getImage().getImagePath());
			}
			color = instance2.getColor();
			if (color != null) 
				color.getValue();

			ims.clinical.vo.lookups.RACPProtocol voLookup2 = new ims.clinical.vo.lookups.RACPProtocol(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.clinical.vo.lookups.RACPProtocol parentVoLookup2 = voLookup2;
			ims.domain.lookups.LookupInstance parent2 = instance2.getParent();
			while (parent2 != null)
			{
				if (parent2.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent2.getImage().getImageId(), parent2.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent2.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup2.setParent(new ims.clinical.vo.lookups.RACPProtocol(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setProtocol(voLookup2);
		}
				// MedicationAtTest
		java.util.List listMedicationAtTest = domainObject.getMedicationAtTest();
		ims.clinical.vo.lookups.RACPMedicationAtTestCollection MedicationAtTest = new ims.clinical.vo.lookups.RACPMedicationAtTestCollection();
		for(java.util.Iterator iterator = listMedicationAtTest.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.clinical.vo.lookups.RACPMedicationAtTest voInstance = new ims.clinical.vo.lookups.RACPMedicationAtTest(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.clinical.vo.lookups.RACPMedicationAtTest parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.clinical.vo.lookups.RACPMedicationAtTest(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			MedicationAtTest.add(voInstance);
		}
		valueObject.setMedicationAtTest( MedicationAtTest );
		// DurationMins
		valueObject.setDurationMins(domainObject.getDurationMins());
		// DurationSecs
		valueObject.setDurationSecs(domainObject.getDurationSecs());
		// VSPulse
		valueObject.setVSPulse(ims.core.vo.domain.VSPulseAssembler.create(map, domainObject.getVSPulse()) );
		// VSBP
		valueObject.setVSBP(ims.core.vo.domain.VSBloodPressureAssembler.create(map, domainObject.getVSBP()) );
		// MaxPredHeartRate
		valueObject.setMaxPredHeartRate(domainObject.getMaxPredHeartRate());
		// StopReasons
		java.util.List listStopReasons = domainObject.getStopReasons();
		ims.clinical.vo.lookups.RACPStopTestReasonCollection StopReasons = new ims.clinical.vo.lookups.RACPStopTestReasonCollection();
		for(java.util.Iterator iterator = listStopReasons.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.clinical.vo.lookups.RACPStopTestReason voInstance = new ims.clinical.vo.lookups.RACPStopTestReason(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.clinical.vo.lookups.RACPStopTestReason parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.clinical.vo.lookups.RACPStopTestReason(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			StopReasons.add(voInstance);
		}
		valueObject.setStopReasons( StopReasons );
		// Dysponea
		ims.domain.lookups.LookupInstance instance10 = domainObject.getDysponea();
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

			ims.nursing.vo.lookups.BreathingDyspnoea voLookup10 = new ims.nursing.vo.lookups.BreathingDyspnoea(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.nursing.vo.lookups.BreathingDyspnoea parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.nursing.vo.lookups.BreathingDyspnoea(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setDysponea(voLookup10);
		}
				// SympomOnset
		valueObject.setSympomOnset(domainObject.getSympomOnset());
		// OtherFindings
		java.util.List listOtherFindings = domainObject.getOtherFindings();
		ims.clinical.vo.lookups.RACPExerciseECGFindingsCollection OtherFindings = new ims.clinical.vo.lookups.RACPExerciseECGFindingsCollection();
		for(java.util.Iterator iterator = listOtherFindings.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.clinical.vo.lookups.RACPExerciseECGFindings voInstance = new ims.clinical.vo.lookups.RACPExerciseECGFindings(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.clinical.vo.lookups.RACPExerciseECGFindings parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.clinical.vo.lookups.RACPExerciseECGFindings(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			OtherFindings.add(voInstance);
		}
		valueObject.setOtherFindings( OtherFindings );
		// MaxSTChangeMM
		valueObject.setMaxSTChangeMM(domainObject.getMaxSTChangeMM());
		// MinsTo1mmChange
		valueObject.setMinsTo1mmChange(domainObject.getMinsTo1mmChange());
		// SecsTo1mmChange
		valueObject.setSecsTo1mmChange(domainObject.getSecsTo1mmChange());
		// Result
		ims.domain.lookups.LookupInstance instance16 = domainObject.getResult();
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

			ims.clinical.vo.lookups.RACPExerciseECGResult voLookup16 = new ims.clinical.vo.lookups.RACPExerciseECGResult(instance16.getId(),instance16.getText(), instance16.isActive(), null, img, color);
			ims.clinical.vo.lookups.RACPExerciseECGResult parentVoLookup16 = voLookup16;
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
								parentVoLookup16.setParent(new ims.clinical.vo.lookups.RACPExerciseECGResult(parent16.getId(),parent16.getText(), parent16.isActive(), null, img, color));
				parentVoLookup16 = parentVoLookup16.getParent();
								parent16 = parent16.getParent();
			}			
			valueObject.setResult(voLookup16);
		}
				// Interpretation
		ims.domain.lookups.LookupInstance instance17 = domainObject.getInterpretation();
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

			ims.clinical.vo.lookups.RACPExerciseECGInterpretation voLookup17 = new ims.clinical.vo.lookups.RACPExerciseECGInterpretation(instance17.getId(),instance17.getText(), instance17.isActive(), null, img, color);
			ims.clinical.vo.lookups.RACPExerciseECGInterpretation parentVoLookup17 = voLookup17;
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
								parentVoLookup17.setParent(new ims.clinical.vo.lookups.RACPExerciseECGInterpretation(parent17.getId(),parent17.getText(), parent17.isActive(), null, img, color));
				parentVoLookup17 = parentVoLookup17.getParent();
								parent17 = parent17.getParent();
			}			
			valueObject.setInterpretation(voLookup17);
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
		// PainExperienced
		ims.domain.lookups.LookupInstance instance19 = domainObject.getPainExperienced();
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

			ims.racpc.vo.lookups.PainExperienced voLookup19 = new ims.racpc.vo.lookups.PainExperienced(instance19.getId(),instance19.getText(), instance19.isActive(), null, img, color);
			ims.racpc.vo.lookups.PainExperienced parentVoLookup19 = voLookup19;
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
								parentVoLookup19.setParent(new ims.racpc.vo.lookups.PainExperienced(parent19.getId(),parent19.getText(), parent19.isActive(), null, img, color));
				parentVoLookup19 = parentVoLookup19.getParent();
								parent19 = parent19.getParent();
			}			
			valueObject.setPainExperienced(voLookup19);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.RACPExerciseECG extractRACPExerciseECG(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.RACPExerciseECGVo valueObject) 
	{
		return 	extractRACPExerciseECG(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.RACPExerciseECG extractRACPExerciseECG(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.RACPExerciseECGVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_RACPExerciseECG();
		ims.clinical.domain.objects.RACPExerciseECG domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.RACPExerciseECG)domMap.get(valueObject);
			}
			// ims.clinical.vo.RACPExerciseECGVo ID_RACPExerciseECG field is unknown
			domainObject = new ims.clinical.domain.objects.RACPExerciseECG();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_RACPExerciseECG());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.RACPExerciseECG)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.RACPExerciseECG) domainFactory.getDomainObject(ims.clinical.domain.objects.RACPExerciseECG.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_RACPExerciseECG());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getPreAssessesCHD() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getPreAssessesCHD().getID());
		}
		domainObject.setPreAssessesCHD(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getProtocol() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getProtocol().getID());
		}
		domainObject.setProtocol(value2);
		ims.clinical.vo.lookups.RACPMedicationAtTestCollection collection3 =
	valueObject.getMedicationAtTest();
	    java.util.List domainMedicationAtTest = domainObject.getMedicationAtTest();;			
	    int collection3Size=0;
		if (collection3 == null)
		{
			domainMedicationAtTest = new java.util.ArrayList(0);
		}
		else
		{
			collection3Size = collection3.size();
		}
		
		for(int i=0; i<collection3Size; i++) 
		{
			int instanceId = collection3.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainMedicationAtTest.indexOf(dom);
			if (domIdx == -1)
			{
				domainMedicationAtTest.add(i, dom);
			}
			else if (i != domIdx && i < domainMedicationAtTest.size())
			{
				Object tmp = domainMedicationAtTest.get(i);
				domainMedicationAtTest.set(i, domainMedicationAtTest.get(domIdx));
				domainMedicationAtTest.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j3 = domainMedicationAtTest.size();
		while (j3 > collection3Size)
		{
			domainMedicationAtTest.remove(j3-1);
			j3 = domainMedicationAtTest.size();
		}

		domainObject.setMedicationAtTest(domainMedicationAtTest);		
		domainObject.setDurationMins(valueObject.getDurationMins());
		domainObject.setDurationSecs(valueObject.getDurationSecs());
		domainObject.setVSPulse(ims.core.vo.domain.VSPulseAssembler.extractPulse(domainFactory, valueObject.getVSPulse(), domMap));
		domainObject.setVSBP(ims.core.vo.domain.VSBloodPressureAssembler.extractBloodpressure(domainFactory, valueObject.getVSBP(), domMap));
		domainObject.setMaxPredHeartRate(valueObject.getMaxPredHeartRate());
		ims.clinical.vo.lookups.RACPStopTestReasonCollection collection9 =
	valueObject.getStopReasons();
	    java.util.List domainStopReasons = domainObject.getStopReasons();;			
	    int collection9Size=0;
		if (collection9 == null)
		{
			domainStopReasons = new java.util.ArrayList(0);
		}
		else
		{
			collection9Size = collection9.size();
		}
		
		for(int i=0; i<collection9Size; i++) 
		{
			int instanceId = collection9.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainStopReasons.indexOf(dom);
			if (domIdx == -1)
			{
				domainStopReasons.add(i, dom);
			}
			else if (i != domIdx && i < domainStopReasons.size())
			{
				Object tmp = domainStopReasons.get(i);
				domainStopReasons.set(i, domainStopReasons.get(domIdx));
				domainStopReasons.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j9 = domainStopReasons.size();
		while (j9 > collection9Size)
		{
			domainStopReasons.remove(j9-1);
			j9 = domainStopReasons.size();
		}

		domainObject.setStopReasons(domainStopReasons);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getDysponea() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getDysponea().getID());
		}
		domainObject.setDysponea(value10);
		domainObject.setSympomOnset(valueObject.getSympomOnset());
		ims.clinical.vo.lookups.RACPExerciseECGFindingsCollection collection12 =
	valueObject.getOtherFindings();
	    java.util.List domainOtherFindings = domainObject.getOtherFindings();;			
	    int collection12Size=0;
		if (collection12 == null)
		{
			domainOtherFindings = new java.util.ArrayList(0);
		}
		else
		{
			collection12Size = collection12.size();
		}
		
		for(int i=0; i<collection12Size; i++) 
		{
			int instanceId = collection12.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainOtherFindings.indexOf(dom);
			if (domIdx == -1)
			{
				domainOtherFindings.add(i, dom);
			}
			else if (i != domIdx && i < domainOtherFindings.size())
			{
				Object tmp = domainOtherFindings.get(i);
				domainOtherFindings.set(i, domainOtherFindings.get(domIdx));
				domainOtherFindings.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j12 = domainOtherFindings.size();
		while (j12 > collection12Size)
		{
			domainOtherFindings.remove(j12-1);
			j12 = domainOtherFindings.size();
		}

		domainObject.setOtherFindings(domainOtherFindings);		
		domainObject.setMaxSTChangeMM(valueObject.getMaxSTChangeMM());
		domainObject.setMinsTo1mmChange(valueObject.getMinsTo1mmChange());
		domainObject.setSecsTo1mmChange(valueObject.getSecsTo1mmChange());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getResult() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getResult().getID());
		}
		domainObject.setResult(value16);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value17 = null;
		if ( null != valueObject.getInterpretation() ) 
		{
			value17 =
				domainFactory.getLookupInstance(valueObject.getInterpretation().getID());
		}
		domainObject.setInterpretation(value17);
		ims.core.admin.domain.objects.CareContext value18 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value18 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value18 = domainObject.getCareContext();	
			}
			else
			{
				value18 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value18);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value19 = null;
		if ( null != valueObject.getPainExperienced() ) 
		{
			value19 =
				domainFactory.getLookupInstance(valueObject.getPainExperienced().getID());
		}
		domainObject.setPainExperienced(value19);

		return domainObject;
	}

}
