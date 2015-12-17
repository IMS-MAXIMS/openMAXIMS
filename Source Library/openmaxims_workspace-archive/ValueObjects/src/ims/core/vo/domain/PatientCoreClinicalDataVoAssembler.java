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
 * @author Peter Martin
 */
public class PatientCoreClinicalDataVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PatientCoreClinicalDataVo copy(ims.core.vo.PatientCoreClinicalDataVo valueObjectDest, ims.core.vo.PatientCoreClinicalDataVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientCoreClinicalData(valueObjectSrc.getID_PatientCoreClinicalData());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// AllergyStatus
		valueObjectDest.setAllergyStatus(valueObjectSrc.getAllergyStatus());
		// AlertStatus
		valueObjectDest.setAlertStatus(valueObjectSrc.getAlertStatus());
		// SupportNetworkStatus
		valueObjectDest.setSupportNetworkStatus(valueObjectSrc.getSupportNetworkStatus());
		// SupportNetworkServiceStatus
		valueObjectDest.setSupportNetworkServiceStatus(valueObjectSrc.getSupportNetworkServiceStatus());
		// AllergyAuthoringInformation
		valueObjectDest.setAllergyAuthoringInformation(valueObjectSrc.getAllergyAuthoringInformation());
		// AlertAuthoringInformation
		valueObjectDest.setAlertAuthoringInformation(valueObjectSrc.getAlertAuthoringInformation());
		// SnStatusAuthoringInformation
		valueObjectDest.setSnStatusAuthoringInformation(valueObjectSrc.getSnStatusAuthoringInformation());
		// SnServiceAuthoringInformation
		valueObjectDest.setSnServiceAuthoringInformation(valueObjectSrc.getSnServiceAuthoringInformation());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientCoreClinicalDataVoCollectionFromPatientCoreClinicalData(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientCoreClinicalData objects.
	 */
	public static ims.core.vo.PatientCoreClinicalDataVoCollection createPatientCoreClinicalDataVoCollectionFromPatientCoreClinicalData(java.util.Set domainObjectSet)	
	{
		return createPatientCoreClinicalDataVoCollectionFromPatientCoreClinicalData(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientCoreClinicalData objects.
	 */
	public static ims.core.vo.PatientCoreClinicalDataVoCollection createPatientCoreClinicalDataVoCollectionFromPatientCoreClinicalData(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatientCoreClinicalDataVoCollection voList = new ims.core.vo.PatientCoreClinicalDataVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.PatientCoreClinicalData domainObject = (ims.core.clinical.domain.objects.PatientCoreClinicalData) iterator.next();
			ims.core.vo.PatientCoreClinicalDataVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientCoreClinicalData objects.
	 */
	public static ims.core.vo.PatientCoreClinicalDataVoCollection createPatientCoreClinicalDataVoCollectionFromPatientCoreClinicalData(java.util.List domainObjectList) 
	{
		return createPatientCoreClinicalDataVoCollectionFromPatientCoreClinicalData(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientCoreClinicalData objects.
	 */
	public static ims.core.vo.PatientCoreClinicalDataVoCollection createPatientCoreClinicalDataVoCollectionFromPatientCoreClinicalData(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatientCoreClinicalDataVoCollection voList = new ims.core.vo.PatientCoreClinicalDataVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.PatientCoreClinicalData domainObject = (ims.core.clinical.domain.objects.PatientCoreClinicalData) domainObjectList.get(i);
			ims.core.vo.PatientCoreClinicalDataVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.PatientCoreClinicalData set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientCoreClinicalDataSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCoreClinicalDataVoCollection voCollection) 
	 {
	 	return extractPatientCoreClinicalDataSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientCoreClinicalDataSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCoreClinicalDataVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientCoreClinicalDataVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientCoreClinicalData domainObject = PatientCoreClinicalDataVoAssembler.extractPatientCoreClinicalData(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.PatientCoreClinicalData list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientCoreClinicalDataList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCoreClinicalDataVoCollection voCollection) 
	 {
	 	return extractPatientCoreClinicalDataList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientCoreClinicalDataList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCoreClinicalDataVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientCoreClinicalDataVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientCoreClinicalData domainObject = PatientCoreClinicalDataVoAssembler.extractPatientCoreClinicalData(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.PatientCoreClinicalData object.
	 * @param domainObject ims.core.clinical.domain.objects.PatientCoreClinicalData
	 */
	 public static ims.core.vo.PatientCoreClinicalDataVo create(ims.core.clinical.domain.objects.PatientCoreClinicalData domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.PatientCoreClinicalData object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PatientCoreClinicalDataVo create(DomainObjectMap map, ims.core.clinical.domain.objects.PatientCoreClinicalData domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PatientCoreClinicalDataVo valueObject = (ims.core.vo.PatientCoreClinicalDataVo) map.getValueObject(domainObject, ims.core.vo.PatientCoreClinicalDataVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PatientCoreClinicalDataVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.PatientCoreClinicalData
	 */
	 public static ims.core.vo.PatientCoreClinicalDataVo insert(ims.core.vo.PatientCoreClinicalDataVo valueObject, ims.core.clinical.domain.objects.PatientCoreClinicalData domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.PatientCoreClinicalData
	 */
	 public static ims.core.vo.PatientCoreClinicalDataVo insert(DomainObjectMap map, ims.core.vo.PatientCoreClinicalDataVo valueObject, ims.core.clinical.domain.objects.PatientCoreClinicalData domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientCoreClinicalData(domainObject.getId());
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
				// AlertStatus
		ims.domain.lookups.LookupInstance instance3 = domainObject.getAlertStatus();
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

			ims.core.vo.lookups.PatientAlertStatus voLookup3 = new ims.core.vo.lookups.PatientAlertStatus(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.PatientAlertStatus parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.PatientAlertStatus(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setAlertStatus(voLookup3);
		}
				// SupportNetworkStatus
		ims.domain.lookups.LookupInstance instance4 = domainObject.getSupportNetworkStatus();
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

			ims.core.vo.lookups.PatientSupportNetworkStatus voLookup4 = new ims.core.vo.lookups.PatientSupportNetworkStatus(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.PatientSupportNetworkStatus parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.PatientSupportNetworkStatus(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setSupportNetworkStatus(voLookup4);
		}
				// SupportNetworkServiceStatus
		ims.domain.lookups.LookupInstance instance5 = domainObject.getSupportNetworkServiceStatus();
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

			ims.core.vo.lookups.PatientSupportNetworkStatus voLookup5 = new ims.core.vo.lookups.PatientSupportNetworkStatus(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.PatientSupportNetworkStatus parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.PatientSupportNetworkStatus(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setSupportNetworkServiceStatus(voLookup5);
		}
				// AllergyAuthoringInformation
		valueObject.setAllergyAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAllergyAuthoringInformation()) );
		// AlertAuthoringInformation
		valueObject.setAlertAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAlertAuthoringInformation()) );
		// SnStatusAuthoringInformation
		valueObject.setSnStatusAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getSnStatusAuthoringInformation()) );
		// SnServiceAuthoringInformation
		valueObject.setSnServiceAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getSnServiceAuthoringInformation()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.PatientCoreClinicalData extractPatientCoreClinicalData(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCoreClinicalDataVo valueObject) 
	{
		return 	extractPatientCoreClinicalData(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.PatientCoreClinicalData extractPatientCoreClinicalData(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCoreClinicalDataVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientCoreClinicalData();
		ims.core.clinical.domain.objects.PatientCoreClinicalData domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.PatientCoreClinicalData)domMap.get(valueObject);
			}
			// ims.core.vo.PatientCoreClinicalDataVo ID_PatientCoreClinicalData field is unknown
			domainObject = new ims.core.clinical.domain.objects.PatientCoreClinicalData();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientCoreClinicalData());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.PatientCoreClinicalData)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.PatientCoreClinicalData) domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientCoreClinicalData.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientCoreClinicalData());

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
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getAlertStatus() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getAlertStatus().getID());
		}
		domainObject.setAlertStatus(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getSupportNetworkStatus() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getSupportNetworkStatus().getID());
		}
		domainObject.setSupportNetworkStatus(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getSupportNetworkServiceStatus() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getSupportNetworkServiceStatus().getID());
		}
		domainObject.setSupportNetworkServiceStatus(value5);
		domainObject.setAllergyAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAllergyAuthoringInformation(), domMap));
		domainObject.setAlertAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAlertAuthoringInformation(), domMap));
		domainObject.setSnStatusAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getSnStatusAuthoringInformation(), domMap));
		domainObject.setSnServiceAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getSnServiceAuthoringInformation(), domMap));

		return domainObject;
	}

}
