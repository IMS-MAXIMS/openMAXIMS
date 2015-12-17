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
 * @author George Cristian Josan
 */
public class PatientAssessmentListVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.PatientAssessmentListVo copy(ims.clinical.vo.PatientAssessmentListVo valueObjectDest, ims.clinical.vo.PatientAssessmentListVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientAssessment(valueObjectSrc.getID_PatientAssessment());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// EpisodeOfCare
		valueObjectDest.setEpisodeOfCare(valueObjectSrc.getEpisodeOfCare());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// AssessmentData
		valueObjectDest.setAssessmentData(valueObjectSrc.getAssessmentData());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// StatusReason
		valueObjectDest.setStatusReason(valueObjectSrc.getStatusReason());
		// SystemInformation
		valueObjectDest.setSystemInformation(valueObjectSrc.getSystemInformation());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientAssessmentListVoCollectionFromPatientAssessment(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.assessment.instantiation.domain.objects.PatientAssessment objects.
	 */
	public static ims.clinical.vo.PatientAssessmentListVoCollection createPatientAssessmentListVoCollectionFromPatientAssessment(java.util.Set domainObjectSet)	
	{
		return createPatientAssessmentListVoCollectionFromPatientAssessment(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.assessment.instantiation.domain.objects.PatientAssessment objects.
	 */
	public static ims.clinical.vo.PatientAssessmentListVoCollection createPatientAssessmentListVoCollectionFromPatientAssessment(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.PatientAssessmentListVoCollection voList = new ims.clinical.vo.PatientAssessmentListVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.assessment.instantiation.domain.objects.PatientAssessment domainObject = (ims.assessment.instantiation.domain.objects.PatientAssessment) iterator.next();
			ims.clinical.vo.PatientAssessmentListVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.assessment.instantiation.domain.objects.PatientAssessment objects.
	 */
	public static ims.clinical.vo.PatientAssessmentListVoCollection createPatientAssessmentListVoCollectionFromPatientAssessment(java.util.List domainObjectList) 
	{
		return createPatientAssessmentListVoCollectionFromPatientAssessment(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.assessment.instantiation.domain.objects.PatientAssessment objects.
	 */
	public static ims.clinical.vo.PatientAssessmentListVoCollection createPatientAssessmentListVoCollectionFromPatientAssessment(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.PatientAssessmentListVoCollection voList = new ims.clinical.vo.PatientAssessmentListVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.assessment.instantiation.domain.objects.PatientAssessment domainObject = (ims.assessment.instantiation.domain.objects.PatientAssessment) domainObjectList.get(i);
			ims.clinical.vo.PatientAssessmentListVo vo = create(map, domainObject);

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
	 * Create the ims.assessment.instantiation.domain.objects.PatientAssessment set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientAssessmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientAssessmentListVoCollection voCollection) 
	 {
	 	return extractPatientAssessmentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientAssessmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientAssessmentListVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.PatientAssessmentListVo vo = voCollection.get(i);
			ims.assessment.instantiation.domain.objects.PatientAssessment domainObject = PatientAssessmentListVoAssembler.extractPatientAssessment(domainFactory, vo, domMap);

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
	 * Create the ims.assessment.instantiation.domain.objects.PatientAssessment list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientAssessmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientAssessmentListVoCollection voCollection) 
	 {
	 	return extractPatientAssessmentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientAssessmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientAssessmentListVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.PatientAssessmentListVo vo = voCollection.get(i);
			ims.assessment.instantiation.domain.objects.PatientAssessment domainObject = PatientAssessmentListVoAssembler.extractPatientAssessment(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.assessment.instantiation.domain.objects.PatientAssessment object.
	 * @param domainObject ims.assessment.instantiation.domain.objects.PatientAssessment
	 */
	 public static ims.clinical.vo.PatientAssessmentListVo create(ims.assessment.instantiation.domain.objects.PatientAssessment domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.assessment.instantiation.domain.objects.PatientAssessment object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.PatientAssessmentListVo create(DomainObjectMap map, ims.assessment.instantiation.domain.objects.PatientAssessment domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.PatientAssessmentListVo valueObject = (ims.clinical.vo.PatientAssessmentListVo) map.getValueObject(domainObject, ims.clinical.vo.PatientAssessmentListVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.PatientAssessmentListVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.assessment.instantiation.domain.objects.PatientAssessment
	 */
	 public static ims.clinical.vo.PatientAssessmentListVo insert(ims.clinical.vo.PatientAssessmentListVo valueObject, ims.assessment.instantiation.domain.objects.PatientAssessment domainObject) 
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
	 * @param domainObject ims.assessment.instantiation.domain.objects.PatientAssessment
	 */
	 public static ims.clinical.vo.PatientAssessmentListVo insert(DomainObjectMap map, ims.clinical.vo.PatientAssessmentListVo valueObject, ims.assessment.instantiation.domain.objects.PatientAssessment domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientAssessment(domainObject.getId());
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
			
		// ClinicalContact
		valueObject.setClinicalContact(ims.core.vo.domain.ClinicalContactPatientAssessmentListVoAssembler.create(map, domainObject.getClinicalContact()) );
		// CareContext
		valueObject.setCareContext(ims.core.vo.domain.CareContextPatientAssessmentListVoAssembler.create(map, domainObject.getCareContext()) );
		// EpisodeOfCare
		valueObject.setEpisodeOfCare(ims.core.vo.domain.EpisodeOfCarePatientAssessmentListVoAssembler.create(map, domainObject.getEpisodeOfCare()) );
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// AssessmentData
		valueObject.setAssessmentData(ims.assessment.vo.domain.PatientAssessmentDataListVoAssembler.create(map, domainObject.getAssessmentData()) );
		// Status
		ims.domain.lookups.LookupInstance instance6 = domainObject.getStatus();
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

			ims.core.vo.lookups.PatientAssessmentStatusReason voLookup6 = new ims.core.vo.lookups.PatientAssessmentStatusReason(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.PatientAssessmentStatusReason parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.PatientAssessmentStatusReason(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setStatus(voLookup6);
		}
				// StatusReason
		ims.domain.lookups.LookupInstance instance7 = domainObject.getStatusReason();
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

			ims.core.vo.lookups.PatientAssessmentStatusReason voLookup7 = new ims.core.vo.lookups.PatientAssessmentStatusReason(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.PatientAssessmentStatusReason parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.core.vo.lookups.PatientAssessmentStatusReason(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setStatusReason(voLookup7);
		}
				// SystemInformation
		// set system information
		valueObject.setSystemInformation(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.assessment.instantiation.domain.objects.PatientAssessment extractPatientAssessment(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientAssessmentListVo valueObject) 
	{
		return 	extractPatientAssessment(domainFactory, valueObject, new HashMap());
	}

	public static ims.assessment.instantiation.domain.objects.PatientAssessment extractPatientAssessment(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientAssessmentListVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientAssessment();
		ims.assessment.instantiation.domain.objects.PatientAssessment domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.assessment.instantiation.domain.objects.PatientAssessment)domMap.get(valueObject);
			}
			// ims.clinical.vo.PatientAssessmentListVo ID_PatientAssessment field is unknown
			domainObject = new ims.assessment.instantiation.domain.objects.PatientAssessment();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientAssessment());
			if (domMap.get(key) != null)
			{
				return (ims.assessment.instantiation.domain.objects.PatientAssessment)domMap.get(key);
			}
			domainObject = (ims.assessment.instantiation.domain.objects.PatientAssessment) domainFactory.getDomainObject(ims.assessment.instantiation.domain.objects.PatientAssessment.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientAssessment());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.ClinicalContact value1 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value1 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else
			{
				value1 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value1);
	// SaveAsRefVO - treated as a refVo in extract methods
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
			else
			{
				value2 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.EpisodeOfCare value3 = null;
		if ( null != valueObject.getEpisodeOfCare() ) 
		{
			if (valueObject.getEpisodeOfCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisodeOfCare()) != null)
				{
					value3 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisodeOfCare());
				}
			}
			else
			{
				value3 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisodeOfCare().getBoId());
			}
		}
		domainObject.setEpisodeOfCare(value3);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.AuthoringInformation value4 = null;
		if ( null != valueObject.getAuthoringInformation() ) 
		{
			if (valueObject.getAuthoringInformation().getBoId() == null)
			{
				if (domMap.get(valueObject.getAuthoringInformation()) != null)
				{
					value4 = (ims.core.clinical.domain.objects.AuthoringInformation)domMap.get(valueObject.getAuthoringInformation());
				}
			}
			else
			{
				value4 = (ims.core.clinical.domain.objects.AuthoringInformation)domainFactory.getDomainObject(ims.core.clinical.domain.objects.AuthoringInformation.class, valueObject.getAuthoringInformation().getBoId());
			}
		}
		domainObject.setAuthoringInformation(value4);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.assessment.instantiation.domain.objects.PatientAssessmentData value5 = null;
		if ( null != valueObject.getAssessmentData() ) 
		{
			if (valueObject.getAssessmentData().getBoId() == null)
			{
				if (domMap.get(valueObject.getAssessmentData()) != null)
				{
					value5 = (ims.assessment.instantiation.domain.objects.PatientAssessmentData)domMap.get(valueObject.getAssessmentData());
				}
			}
			else
			{
				value5 = (ims.assessment.instantiation.domain.objects.PatientAssessmentData)domainFactory.getDomainObject(ims.assessment.instantiation.domain.objects.PatientAssessmentData.class, valueObject.getAssessmentData().getBoId());
			}
		}
		domainObject.setAssessmentData(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getStatusReason() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getStatusReason().getID());
		}
		domainObject.setStatusReason(value7);

		return domainObject;
	}

}
