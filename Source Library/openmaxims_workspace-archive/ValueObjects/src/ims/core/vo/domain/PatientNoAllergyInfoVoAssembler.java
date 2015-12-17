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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class PatientNoAllergyInfoVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PatientNoAllergyInfoVo copy(ims.core.vo.PatientNoAllergyInfoVo valueObjectDest, ims.core.vo.PatientNoAllergyInfoVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientNoAllergyInfo(valueObjectSrc.getID_PatientNoAllergyInfo());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// AllergyStatus
		valueObjectDest.setAllergyStatus(valueObjectSrc.getAllergyStatus());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// WhenIdentified
		valueObjectDest.setWhenIdentified(valueObjectSrc.getWhenIdentified());
		// SourceofInformation
		valueObjectDest.setSourceofInformation(valueObjectSrc.getSourceofInformation());
		// RecordingInformation
		valueObjectDest.setRecordingInformation(valueObjectSrc.getRecordingInformation());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientNoAllergyInfoVoCollectionFromPatientNoAllergyInfo(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientNoAllergyInfo objects.
	 */
	public static ims.core.vo.PatientNoAllergyInfoVoCollection createPatientNoAllergyInfoVoCollectionFromPatientNoAllergyInfo(java.util.Set domainObjectSet)	
	{
		return createPatientNoAllergyInfoVoCollectionFromPatientNoAllergyInfo(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientNoAllergyInfo objects.
	 */
	public static ims.core.vo.PatientNoAllergyInfoVoCollection createPatientNoAllergyInfoVoCollectionFromPatientNoAllergyInfo(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatientNoAllergyInfoVoCollection voList = new ims.core.vo.PatientNoAllergyInfoVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.PatientNoAllergyInfo domainObject = (ims.core.clinical.domain.objects.PatientNoAllergyInfo) iterator.next();
			ims.core.vo.PatientNoAllergyInfoVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientNoAllergyInfo objects.
	 */
	public static ims.core.vo.PatientNoAllergyInfoVoCollection createPatientNoAllergyInfoVoCollectionFromPatientNoAllergyInfo(java.util.List domainObjectList) 
	{
		return createPatientNoAllergyInfoVoCollectionFromPatientNoAllergyInfo(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientNoAllergyInfo objects.
	 */
	public static ims.core.vo.PatientNoAllergyInfoVoCollection createPatientNoAllergyInfoVoCollectionFromPatientNoAllergyInfo(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatientNoAllergyInfoVoCollection voList = new ims.core.vo.PatientNoAllergyInfoVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.PatientNoAllergyInfo domainObject = (ims.core.clinical.domain.objects.PatientNoAllergyInfo) domainObjectList.get(i);
			ims.core.vo.PatientNoAllergyInfoVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.PatientNoAllergyInfo set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientNoAllergyInfoSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientNoAllergyInfoVoCollection voCollection) 
	 {
	 	return extractPatientNoAllergyInfoSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientNoAllergyInfoSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientNoAllergyInfoVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientNoAllergyInfoVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientNoAllergyInfo domainObject = PatientNoAllergyInfoVoAssembler.extractPatientNoAllergyInfo(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.PatientNoAllergyInfo list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientNoAllergyInfoList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientNoAllergyInfoVoCollection voCollection) 
	 {
	 	return extractPatientNoAllergyInfoList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientNoAllergyInfoList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientNoAllergyInfoVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientNoAllergyInfoVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientNoAllergyInfo domainObject = PatientNoAllergyInfoVoAssembler.extractPatientNoAllergyInfo(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.PatientNoAllergyInfo object.
	 * @param domainObject ims.core.clinical.domain.objects.PatientNoAllergyInfo
	 */
	 public static ims.core.vo.PatientNoAllergyInfoVo create(ims.core.clinical.domain.objects.PatientNoAllergyInfo domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.PatientNoAllergyInfo object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PatientNoAllergyInfoVo create(DomainObjectMap map, ims.core.clinical.domain.objects.PatientNoAllergyInfo domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PatientNoAllergyInfoVo valueObject = (ims.core.vo.PatientNoAllergyInfoVo) map.getValueObject(domainObject, ims.core.vo.PatientNoAllergyInfoVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PatientNoAllergyInfoVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.PatientNoAllergyInfo
	 */
	 public static ims.core.vo.PatientNoAllergyInfoVo insert(ims.core.vo.PatientNoAllergyInfoVo valueObject, ims.core.clinical.domain.objects.PatientNoAllergyInfo domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.PatientNoAllergyInfo
	 */
	 public static ims.core.vo.PatientNoAllergyInfoVo insert(DomainObjectMap map, ims.core.vo.PatientNoAllergyInfoVo valueObject, ims.core.clinical.domain.objects.PatientNoAllergyInfo domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientNoAllergyInfo(domainObject.getId());
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
		if (domainObject.getPatient() != null)
		{
			if(domainObject.getPatient() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPatient();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPatient(new ims.core.patient.vo.PatientRefVo(id, -1));				
			}
			else
			{
				valueObject.setPatient(new ims.core.patient.vo.PatientRefVo(domainObject.getPatient().getId(), domainObject.getPatient().getVersion()));
			}
		}
		// AllergyStatus
		ims.domain.lookups.LookupInstance instance2 = domainObject.getAllergyStatus();
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

			ims.core.vo.lookups.PatientAllergyStatus voLookup2 = new ims.core.vo.lookups.PatientAllergyStatus(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.PatientAllergyStatus parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.PatientAllergyStatus(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setAllergyStatus(voLookup2);
		}
				// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// WhenIdentified
		Integer WhenIdentified = domainObject.getWhenIdentified();
		if ( null != WhenIdentified ) 
		{
			valueObject.setWhenIdentified(new ims.framework.utils.PartialDate(WhenIdentified) );
		}
		// SourceofInformation
		ims.domain.lookups.LookupInstance instance5 = domainObject.getSourceofInformation();
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

			ims.core.vo.lookups.SourceofInformation voLookup5 = new ims.core.vo.lookups.SourceofInformation(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.SourceofInformation parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.SourceofInformation(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setSourceofInformation(voLookup5);
		}
				// RecordingInformation
		valueObject.setRecordingInformation(ims.core.vo.domain.RecordingUserInformationVoAssembler.create(map, domainObject.getRecordingInformation()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.PatientNoAllergyInfo extractPatientNoAllergyInfo(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientNoAllergyInfoVo valueObject) 
	{
		return 	extractPatientNoAllergyInfo(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.PatientNoAllergyInfo extractPatientNoAllergyInfo(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientNoAllergyInfoVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientNoAllergyInfo();
		ims.core.clinical.domain.objects.PatientNoAllergyInfo domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.PatientNoAllergyInfo)domMap.get(valueObject);
			}
			// ims.core.vo.PatientNoAllergyInfoVo ID_PatientNoAllergyInfo field is unknown
			domainObject = new ims.core.clinical.domain.objects.PatientNoAllergyInfo();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientNoAllergyInfo());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.PatientNoAllergyInfo)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.PatientNoAllergyInfo) domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientNoAllergyInfo.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientNoAllergyInfo());

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
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getPatient();	
			}
			else
			{
				value1 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getAllergyStatus() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getAllergyStatus().getID());
		}
		domainObject.setAllergyStatus(value2);
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		ims.framework.utils.PartialDate WhenIdentified = valueObject.getWhenIdentified();
		Integer value4 = null;
		if ( null != WhenIdentified ) 
		{
			value4 = WhenIdentified.toInteger();
		}
		domainObject.setWhenIdentified(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getSourceofInformation() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getSourceofInformation().getID());
		}
		domainObject.setSourceofInformation(value5);
		domainObject.setRecordingInformation(ims.core.vo.domain.RecordingUserInformationVoAssembler.extractRecordingUserInformation(domainFactory, valueObject.getRecordingInformation(), domMap));

		return domainObject;
	}

}
