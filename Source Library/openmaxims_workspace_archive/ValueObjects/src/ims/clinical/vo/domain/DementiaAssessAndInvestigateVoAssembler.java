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
 * @author Florin Blindu
 */
public class DementiaAssessAndInvestigateVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.DementiaAssessAndInvestigateVo copy(ims.clinical.vo.DementiaAssessAndInvestigateVo valueObjectDest, ims.clinical.vo.DementiaAssessAndInvestigateVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_DementiaAssessAndInvestigate(valueObjectSrc.getID_DementiaAssessAndInvestigate());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// Q1Age
		valueObjectDest.setQ1Age(valueObjectSrc.getQ1Age());
		// Q2DOB
		valueObjectDest.setQ2DOB(valueObjectSrc.getQ2DOB());
		// Q3CurrentYear
		valueObjectDest.setQ3CurrentYear(valueObjectSrc.getQ3CurrentYear());
		// Q4CurrentTime
		valueObjectDest.setQ4CurrentTime(valueObjectSrc.getQ4CurrentTime());
		// Q5NameOfHospital
		valueObjectDest.setQ5NameOfHospital(valueObjectSrc.getQ5NameOfHospital());
		// Q6RecognisePeople
		valueObjectDest.setQ6RecognisePeople(valueObjectSrc.getQ6RecognisePeople());
		// Q7YearWW2Ended
		valueObjectDest.setQ7YearWW2Ended(valueObjectSrc.getQ7YearWW2Ended());
		// Q8Monarch
		valueObjectDest.setQ8Monarch(valueObjectSrc.getQ8Monarch());
		// Q9CountBackwards
		valueObjectDest.setQ9CountBackwards(valueObjectSrc.getQ9CountBackwards());
		// Q10Recall
		valueObjectDest.setQ10Recall(valueObjectSrc.getQ10Recall());
		// AMTSScore
		valueObjectDest.setAMTSScore(valueObjectSrc.getAMTSScore());
		// ConfirmTrustsProtocol
		valueObjectDest.setConfirmTrustsProtocol(valueObjectSrc.getConfirmTrustsProtocol());
		// ConfirmMedicationReview
		valueObjectDest.setConfirmMedicationReview(valueObjectSrc.getConfirmMedicationReview());
		// StepTwoAssessNote
		valueObjectDest.setStepTwoAssessNote(valueObjectSrc.getStepTwoAssessNote());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createDementiaAssessAndInvestigateVoCollectionFromDementiaAssessAndInvestigate(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.DementiaAssessAndInvestigate objects.
	 */
	public static ims.clinical.vo.DementiaAssessAndInvestigateVoCollection createDementiaAssessAndInvestigateVoCollectionFromDementiaAssessAndInvestigate(java.util.Set domainObjectSet)	
	{
		return createDementiaAssessAndInvestigateVoCollectionFromDementiaAssessAndInvestigate(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.DementiaAssessAndInvestigate objects.
	 */
	public static ims.clinical.vo.DementiaAssessAndInvestigateVoCollection createDementiaAssessAndInvestigateVoCollectionFromDementiaAssessAndInvestigate(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.DementiaAssessAndInvestigateVoCollection voList = new ims.clinical.vo.DementiaAssessAndInvestigateVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.DementiaAssessAndInvestigate domainObject = (ims.core.clinical.domain.objects.DementiaAssessAndInvestigate) iterator.next();
			ims.clinical.vo.DementiaAssessAndInvestigateVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.DementiaAssessAndInvestigate objects.
	 */
	public static ims.clinical.vo.DementiaAssessAndInvestigateVoCollection createDementiaAssessAndInvestigateVoCollectionFromDementiaAssessAndInvestigate(java.util.List domainObjectList) 
	{
		return createDementiaAssessAndInvestigateVoCollectionFromDementiaAssessAndInvestigate(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.DementiaAssessAndInvestigate objects.
	 */
	public static ims.clinical.vo.DementiaAssessAndInvestigateVoCollection createDementiaAssessAndInvestigateVoCollectionFromDementiaAssessAndInvestigate(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.DementiaAssessAndInvestigateVoCollection voList = new ims.clinical.vo.DementiaAssessAndInvestigateVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.DementiaAssessAndInvestigate domainObject = (ims.core.clinical.domain.objects.DementiaAssessAndInvestigate) domainObjectList.get(i);
			ims.clinical.vo.DementiaAssessAndInvestigateVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.DementiaAssessAndInvestigate set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractDementiaAssessAndInvestigateSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DementiaAssessAndInvestigateVoCollection voCollection) 
	 {
	 	return extractDementiaAssessAndInvestigateSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractDementiaAssessAndInvestigateSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DementiaAssessAndInvestigateVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.DementiaAssessAndInvestigateVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.DementiaAssessAndInvestigate domainObject = DementiaAssessAndInvestigateVoAssembler.extractDementiaAssessAndInvestigate(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.DementiaAssessAndInvestigate list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractDementiaAssessAndInvestigateList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DementiaAssessAndInvestigateVoCollection voCollection) 
	 {
	 	return extractDementiaAssessAndInvestigateList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractDementiaAssessAndInvestigateList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DementiaAssessAndInvestigateVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.DementiaAssessAndInvestigateVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.DementiaAssessAndInvestigate domainObject = DementiaAssessAndInvestigateVoAssembler.extractDementiaAssessAndInvestigate(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.DementiaAssessAndInvestigate object.
	 * @param domainObject ims.core.clinical.domain.objects.DementiaAssessAndInvestigate
	 */
	 public static ims.clinical.vo.DementiaAssessAndInvestigateVo create(ims.core.clinical.domain.objects.DementiaAssessAndInvestigate domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.DementiaAssessAndInvestigate object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.DementiaAssessAndInvestigateVo create(DomainObjectMap map, ims.core.clinical.domain.objects.DementiaAssessAndInvestigate domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.DementiaAssessAndInvestigateVo valueObject = (ims.clinical.vo.DementiaAssessAndInvestigateVo) map.getValueObject(domainObject, ims.clinical.vo.DementiaAssessAndInvestigateVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.DementiaAssessAndInvestigateVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.DementiaAssessAndInvestigate
	 */
	 public static ims.clinical.vo.DementiaAssessAndInvestigateVo insert(ims.clinical.vo.DementiaAssessAndInvestigateVo valueObject, ims.core.clinical.domain.objects.DementiaAssessAndInvestigate domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.DementiaAssessAndInvestigate
	 */
	 public static ims.clinical.vo.DementiaAssessAndInvestigateVo insert(DomainObjectMap map, ims.clinical.vo.DementiaAssessAndInvestigateVo valueObject, ims.core.clinical.domain.objects.DementiaAssessAndInvestigate domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_DementiaAssessAndInvestigate(domainObject.getId());
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
		// Q1Age
		ims.domain.lookups.LookupInstance instance2 = domainObject.getQ1Age();
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

			ims.core.vo.lookups.YesNo voLookup2 = new ims.core.vo.lookups.YesNo(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.YesNo(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setQ1Age(voLookup2);
		}
				// Q2DOB
		ims.domain.lookups.LookupInstance instance3 = domainObject.getQ2DOB();
		if ( null != instance3 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance3.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance3.getImage().getImageId(), instance3.getImage().getImagePath());
			}
			color = instance3.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup3 = new ims.core.vo.lookups.YesNo(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup3 = voLookup3;
			ims.domain.lookups.LookupInstance parent3 = instance3.getParent();
			while (parent3 != null)
			{
				if (parent3.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent3.getImage().getImageId(), parent3.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent3.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup3.setParent(new ims.core.vo.lookups.YesNo(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setQ2DOB(voLookup3);
		}
				// Q3CurrentYear
		ims.domain.lookups.LookupInstance instance4 = domainObject.getQ3CurrentYear();
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

			ims.core.vo.lookups.YesNo voLookup4 = new ims.core.vo.lookups.YesNo(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.YesNo(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setQ3CurrentYear(voLookup4);
		}
				// Q4CurrentTime
		ims.domain.lookups.LookupInstance instance5 = domainObject.getQ4CurrentTime();
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

			ims.core.vo.lookups.YesNo voLookup5 = new ims.core.vo.lookups.YesNo(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.YesNo(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setQ4CurrentTime(voLookup5);
		}
				// Q5NameOfHospital
		ims.domain.lookups.LookupInstance instance6 = domainObject.getQ5NameOfHospital();
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

			ims.core.vo.lookups.YesNo voLookup6 = new ims.core.vo.lookups.YesNo(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.YesNo(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setQ5NameOfHospital(voLookup6);
		}
				// Q6RecognisePeople
		ims.domain.lookups.LookupInstance instance7 = domainObject.getQ6RecognisePeople();
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
			valueObject.setQ6RecognisePeople(voLookup7);
		}
				// Q7YearWW2Ended
		ims.domain.lookups.LookupInstance instance8 = domainObject.getQ7YearWW2Ended();
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
			valueObject.setQ7YearWW2Ended(voLookup8);
		}
				// Q8Monarch
		ims.domain.lookups.LookupInstance instance9 = domainObject.getQ8Monarch();
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
			valueObject.setQ8Monarch(voLookup9);
		}
				// Q9CountBackwards
		ims.domain.lookups.LookupInstance instance10 = domainObject.getQ9CountBackwards();
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
			valueObject.setQ9CountBackwards(voLookup10);
		}
				// Q10Recall
		ims.domain.lookups.LookupInstance instance11 = domainObject.getQ10Recall();
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
			valueObject.setQ10Recall(voLookup11);
		}
				// AMTSScore
		valueObject.setAMTSScore(domainObject.getAMTSScore());
		// ConfirmTrustsProtocol
		ims.domain.lookups.LookupInstance instance13 = domainObject.getConfirmTrustsProtocol();
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
			valueObject.setConfirmTrustsProtocol(voLookup13);
		}
				// ConfirmMedicationReview
		ims.domain.lookups.LookupInstance instance14 = domainObject.getConfirmMedicationReview();
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
			valueObject.setConfirmMedicationReview(voLookup14);
		}
				// StepTwoAssessNote
		valueObject.setStepTwoAssessNote(ims.clinical.vo.domain.DementiaAssessInvestigateNoteVoAssembler.create(map, domainObject.getStepTwoAssessNote()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.DementiaAssessAndInvestigate extractDementiaAssessAndInvestigate(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DementiaAssessAndInvestigateVo valueObject) 
	{
		return 	extractDementiaAssessAndInvestigate(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.DementiaAssessAndInvestigate extractDementiaAssessAndInvestigate(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DementiaAssessAndInvestigateVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_DementiaAssessAndInvestigate();
		ims.core.clinical.domain.objects.DementiaAssessAndInvestigate domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.DementiaAssessAndInvestigate)domMap.get(valueObject);
			}
			// ims.clinical.vo.DementiaAssessAndInvestigateVo ID_DementiaAssessAndInvestigate field is unknown
			domainObject = new ims.core.clinical.domain.objects.DementiaAssessAndInvestigate();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_DementiaAssessAndInvestigate());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.DementiaAssessAndInvestigate)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.DementiaAssessAndInvestigate) domainFactory.getDomainObject(ims.core.clinical.domain.objects.DementiaAssessAndInvestigate.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_DementiaAssessAndInvestigate());

		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getQ1Age() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getQ1Age().getID());
		}
		domainObject.setQ1Age(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getQ2DOB() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getQ2DOB().getID());
		}
		domainObject.setQ2DOB(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getQ3CurrentYear() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getQ3CurrentYear().getID());
		}
		domainObject.setQ3CurrentYear(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getQ4CurrentTime() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getQ4CurrentTime().getID());
		}
		domainObject.setQ4CurrentTime(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getQ5NameOfHospital() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getQ5NameOfHospital().getID());
		}
		domainObject.setQ5NameOfHospital(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getQ6RecognisePeople() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getQ6RecognisePeople().getID());
		}
		domainObject.setQ6RecognisePeople(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getQ7YearWW2Ended() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getQ7YearWW2Ended().getID());
		}
		domainObject.setQ7YearWW2Ended(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getQ8Monarch() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getQ8Monarch().getID());
		}
		domainObject.setQ8Monarch(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getQ9CountBackwards() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getQ9CountBackwards().getID());
		}
		domainObject.setQ9CountBackwards(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getQ10Recall() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getQ10Recall().getID());
		}
		domainObject.setQ10Recall(value11);
		domainObject.setAMTSScore(valueObject.getAMTSScore());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getConfirmTrustsProtocol() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getConfirmTrustsProtocol().getID());
		}
		domainObject.setConfirmTrustsProtocol(value13);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getConfirmMedicationReview() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getConfirmMedicationReview().getID());
		}
		domainObject.setConfirmMedicationReview(value14);
		domainObject.setStepTwoAssessNote(ims.clinical.vo.domain.DementiaAssessInvestigateNoteVoAssembler.extractDementiaAssessInvestigateNote(domainFactory, valueObject.getStepTwoAssessNote(), domMap));

		return domainObject;
	}

}
