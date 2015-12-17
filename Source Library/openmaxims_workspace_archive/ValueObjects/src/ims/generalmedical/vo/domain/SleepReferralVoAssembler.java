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
package ims.generalmedical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class SleepReferralVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.generalmedical.vo.SleepReferralVo copy(ims.generalmedical.vo.SleepReferralVo valueObjectDest, ims.generalmedical.vo.SleepReferralVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_SleepReferral(valueObjectSrc.getID_SleepReferral());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// PulseOximetry
		valueObjectDest.setPulseOximetry(valueObjectSrc.getPulseOximetry());
		// OximetryValues
		valueObjectDest.setOximetryValues(valueObjectSrc.getOximetryValues());
		// WeightHeightNeckSize
		valueObjectDest.setWeightHeightNeckSize(valueObjectSrc.getWeightHeightNeckSize());
		// Medication
		valueObjectDest.setMedication(valueObjectSrc.getMedication());
		// SleepFindings
		valueObjectDest.setSleepFindings(valueObjectSrc.getSleepFindings());
		// EpworthSleepAssessment
		valueObjectDest.setEpworthSleepAssessment(valueObjectSrc.getEpworthSleepAssessment());
		// CognitiveFunction
		valueObjectDest.setCognitiveFunction(valueObjectSrc.getCognitiveFunction());
		// SleepApnoea
		valueObjectDest.setSleepApnoea(valueObjectSrc.getSleepApnoea());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSleepReferralVoCollectionFromSleepReferral(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.medical.domain.objects.SleepReferral objects.
	 */
	public static ims.generalmedical.vo.SleepReferralVoCollection createSleepReferralVoCollectionFromSleepReferral(java.util.Set domainObjectSet)	
	{
		return createSleepReferralVoCollectionFromSleepReferral(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.medical.domain.objects.SleepReferral objects.
	 */
	public static ims.generalmedical.vo.SleepReferralVoCollection createSleepReferralVoCollectionFromSleepReferral(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.generalmedical.vo.SleepReferralVoCollection voList = new ims.generalmedical.vo.SleepReferralVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.medical.domain.objects.SleepReferral domainObject = (ims.medical.domain.objects.SleepReferral) iterator.next();
			ims.generalmedical.vo.SleepReferralVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.medical.domain.objects.SleepReferral objects.
	 */
	public static ims.generalmedical.vo.SleepReferralVoCollection createSleepReferralVoCollectionFromSleepReferral(java.util.List domainObjectList) 
	{
		return createSleepReferralVoCollectionFromSleepReferral(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.medical.domain.objects.SleepReferral objects.
	 */
	public static ims.generalmedical.vo.SleepReferralVoCollection createSleepReferralVoCollectionFromSleepReferral(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.generalmedical.vo.SleepReferralVoCollection voList = new ims.generalmedical.vo.SleepReferralVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.medical.domain.objects.SleepReferral domainObject = (ims.medical.domain.objects.SleepReferral) domainObjectList.get(i);
			ims.generalmedical.vo.SleepReferralVo vo = create(map, domainObject);

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
	 * Create the ims.medical.domain.objects.SleepReferral set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractSleepReferralSet(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.SleepReferralVoCollection voCollection) 
	 {
	 	return extractSleepReferralSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSleepReferralSet(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.SleepReferralVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.generalmedical.vo.SleepReferralVo vo = voCollection.get(i);
			ims.medical.domain.objects.SleepReferral domainObject = SleepReferralVoAssembler.extractSleepReferral(domainFactory, vo, domMap);

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
	 * Create the ims.medical.domain.objects.SleepReferral list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractSleepReferralList(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.SleepReferralVoCollection voCollection) 
	 {
	 	return extractSleepReferralList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSleepReferralList(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.SleepReferralVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.generalmedical.vo.SleepReferralVo vo = voCollection.get(i);
			ims.medical.domain.objects.SleepReferral domainObject = SleepReferralVoAssembler.extractSleepReferral(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.medical.domain.objects.SleepReferral object.
	 * @param domainObject ims.medical.domain.objects.SleepReferral
	 */
	 public static ims.generalmedical.vo.SleepReferralVo create(ims.medical.domain.objects.SleepReferral domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.medical.domain.objects.SleepReferral object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.generalmedical.vo.SleepReferralVo create(DomainObjectMap map, ims.medical.domain.objects.SleepReferral domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.generalmedical.vo.SleepReferralVo valueObject = (ims.generalmedical.vo.SleepReferralVo) map.getValueObject(domainObject, ims.generalmedical.vo.SleepReferralVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.generalmedical.vo.SleepReferralVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.medical.domain.objects.SleepReferral
	 */
	 public static ims.generalmedical.vo.SleepReferralVo insert(ims.generalmedical.vo.SleepReferralVo valueObject, ims.medical.domain.objects.SleepReferral domainObject) 
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
	 * @param domainObject ims.medical.domain.objects.SleepReferral
	 */
	 public static ims.generalmedical.vo.SleepReferralVo insert(DomainObjectMap map, ims.generalmedical.vo.SleepReferralVo valueObject, ims.medical.domain.objects.SleepReferral domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_SleepReferral(domainObject.getId());
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
			
		// PulseOximetry
		valueObject.setPulseOximetry( domainObject.isPulseOximetry() );
		// OximetryValues
		ims.domain.lookups.LookupInstance instance2 = domainObject.getOximetryValues();
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

			ims.core.vo.lookups.PulseOximetryValues voLookup2 = new ims.core.vo.lookups.PulseOximetryValues(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.PulseOximetryValues parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.PulseOximetryValues(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setOximetryValues(voLookup2);
		}
				// WeightHeightNeckSize
		valueObject.setWeightHeightNeckSize(ims.core.vo.domain.VSMetricsAssembler.create(map, domainObject.getWeightHeightNeckSize()) );
		// Medication
		valueObject.setMedication(domainObject.getMedication());
		// SleepFindings
		valueObject.setSleepFindings(ims.generalmedical.vo.domain.SleepFindingsVoAssembler.createSleepFindingsVoCollectionFromSleepFindings(map, domainObject.getSleepFindings()) );
		// EpworthSleepAssessment
		valueObject.setEpworthSleepAssessment(ims.generalmedical.vo.domain.EpworthSleepAssessmentVoAssembler.createEpworthSleepAssessmentVoCollectionFromEpworthSleepAssessment(map, domainObject.getEpworthSleepAssessment()) );
		// CognitiveFunction
		valueObject.setCognitiveFunction(ims.generalmedical.vo.domain.CognitiveFunctionVoAssembler.createCognitiveFunctionVoCollectionFromCognitiveFunction(map, domainObject.getCognitiveFunction()) );
		// SleepApnoea
		valueObject.setSleepApnoea(ims.generalmedical.vo.domain.SleepApnoeaVoAssembler.createSleepApnoeaVoCollectionFromSleepApnoea(map, domainObject.getSleepApnoea()) );
		// CareContext
		valueObject.setCareContext(ims.core.vo.domain.CareContextShortVoAssembler.create(map, domainObject.getCareContext()) );
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.medical.domain.objects.SleepReferral extractSleepReferral(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.SleepReferralVo valueObject) 
	{
		return 	extractSleepReferral(domainFactory, valueObject, new HashMap());
	}

	public static ims.medical.domain.objects.SleepReferral extractSleepReferral(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.SleepReferralVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_SleepReferral();
		ims.medical.domain.objects.SleepReferral domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.medical.domain.objects.SleepReferral)domMap.get(valueObject);
			}
			// ims.generalmedical.vo.SleepReferralVo ID_SleepReferral field is unknown
			domainObject = new ims.medical.domain.objects.SleepReferral();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_SleepReferral());
			if (domMap.get(key) != null)
			{
				return (ims.medical.domain.objects.SleepReferral)domMap.get(key);
			}
			domainObject = (ims.medical.domain.objects.SleepReferral) domainFactory.getDomainObject(ims.medical.domain.objects.SleepReferral.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_SleepReferral());

		domainObject.setPulseOximetry(valueObject.getPulseOximetry());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getOximetryValues() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getOximetryValues().getID());
		}
		domainObject.setOximetryValues(value2);
		domainObject.setWeightHeightNeckSize(ims.core.vo.domain.VSMetricsAssembler.extractMetrics(domainFactory, valueObject.getWeightHeightNeckSize(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getMedication() != null && valueObject.getMedication().equals(""))
		{
			valueObject.setMedication(null);
		}
		domainObject.setMedication(valueObject.getMedication());
		domainObject.setSleepFindings(ims.generalmedical.vo.domain.SleepFindingsVoAssembler.extractSleepFindingsSet(domainFactory, valueObject.getSleepFindings(), domainObject.getSleepFindings(), domMap));		
		domainObject.setEpworthSleepAssessment(ims.generalmedical.vo.domain.EpworthSleepAssessmentVoAssembler.extractEpworthSleepAssessmentSet(domainFactory, valueObject.getEpworthSleepAssessment(), domainObject.getEpworthSleepAssessment(), domMap));		
		domainObject.setCognitiveFunction(ims.generalmedical.vo.domain.CognitiveFunctionVoAssembler.extractCognitiveFunctionSet(domainFactory, valueObject.getCognitiveFunction(), domainObject.getCognitiveFunction(), domMap));		
		domainObject.setSleepApnoea(ims.generalmedical.vo.domain.SleepApnoeaVoAssembler.extractSleepApnoeaSet(domainFactory, valueObject.getSleepApnoea(), domainObject.getSleepApnoea(), domMap));		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.CareContext value9 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value9 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else
			{
				value9 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value9);
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));

		return domainObject;
	}

}
