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
 * @author Cristian Belciug
 */
public class HospitalAtNightPatientDetailListVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.HospitalAtNightPatientDetailListVo copy(ims.clinical.vo.HospitalAtNightPatientDetailListVo valueObjectDest, ims.clinical.vo.HospitalAtNightPatientDetailListVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_HospitalAtNightPatientDetail(valueObjectSrc.getID_HospitalAtNightPatientDetail());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// MEWS
		valueObjectDest.setMEWS(valueObjectSrc.getMEWS());
		// TypeOfRequest
		valueObjectDest.setTypeOfRequest(valueObjectSrc.getTypeOfRequest());
		// WardWhenPlacedOnList
		valueObjectDest.setWardWhenPlacedOnList(valueObjectSrc.getWardWhenPlacedOnList());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// RequestingDateTime
		valueObjectDest.setRequestingDateTime(valueObjectSrc.getRequestingDateTime());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createHospitalAtNightPatientDetailListVoCollectionFromHospitalAtNightPatientDetail(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.HospitalAtNightPatientDetail objects.
	 */
	public static ims.clinical.vo.HospitalAtNightPatientDetailListVoCollection createHospitalAtNightPatientDetailListVoCollectionFromHospitalAtNightPatientDetail(java.util.Set domainObjectSet)	
	{
		return createHospitalAtNightPatientDetailListVoCollectionFromHospitalAtNightPatientDetail(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.HospitalAtNightPatientDetail objects.
	 */
	public static ims.clinical.vo.HospitalAtNightPatientDetailListVoCollection createHospitalAtNightPatientDetailListVoCollectionFromHospitalAtNightPatientDetail(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.HospitalAtNightPatientDetailListVoCollection voList = new ims.clinical.vo.HospitalAtNightPatientDetailListVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.HospitalAtNightPatientDetail domainObject = (ims.clinical.domain.objects.HospitalAtNightPatientDetail) iterator.next();
			ims.clinical.vo.HospitalAtNightPatientDetailListVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.HospitalAtNightPatientDetail objects.
	 */
	public static ims.clinical.vo.HospitalAtNightPatientDetailListVoCollection createHospitalAtNightPatientDetailListVoCollectionFromHospitalAtNightPatientDetail(java.util.List domainObjectList) 
	{
		return createHospitalAtNightPatientDetailListVoCollectionFromHospitalAtNightPatientDetail(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.HospitalAtNightPatientDetail objects.
	 */
	public static ims.clinical.vo.HospitalAtNightPatientDetailListVoCollection createHospitalAtNightPatientDetailListVoCollectionFromHospitalAtNightPatientDetail(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.HospitalAtNightPatientDetailListVoCollection voList = new ims.clinical.vo.HospitalAtNightPatientDetailListVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.HospitalAtNightPatientDetail domainObject = (ims.clinical.domain.objects.HospitalAtNightPatientDetail) domainObjectList.get(i);
			ims.clinical.vo.HospitalAtNightPatientDetailListVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.HospitalAtNightPatientDetail set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractHospitalAtNightPatientDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.HospitalAtNightPatientDetailListVoCollection voCollection) 
	 {
	 	return extractHospitalAtNightPatientDetailSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractHospitalAtNightPatientDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.HospitalAtNightPatientDetailListVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.HospitalAtNightPatientDetailListVo vo = voCollection.get(i);
			ims.clinical.domain.objects.HospitalAtNightPatientDetail domainObject = HospitalAtNightPatientDetailListVoAssembler.extractHospitalAtNightPatientDetail(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.HospitalAtNightPatientDetail list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractHospitalAtNightPatientDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.HospitalAtNightPatientDetailListVoCollection voCollection) 
	 {
	 	return extractHospitalAtNightPatientDetailList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractHospitalAtNightPatientDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.HospitalAtNightPatientDetailListVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.HospitalAtNightPatientDetailListVo vo = voCollection.get(i);
			ims.clinical.domain.objects.HospitalAtNightPatientDetail domainObject = HospitalAtNightPatientDetailListVoAssembler.extractHospitalAtNightPatientDetail(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.HospitalAtNightPatientDetail object.
	 * @param domainObject ims.clinical.domain.objects.HospitalAtNightPatientDetail
	 */
	 public static ims.clinical.vo.HospitalAtNightPatientDetailListVo create(ims.clinical.domain.objects.HospitalAtNightPatientDetail domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.HospitalAtNightPatientDetail object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.HospitalAtNightPatientDetailListVo create(DomainObjectMap map, ims.clinical.domain.objects.HospitalAtNightPatientDetail domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.HospitalAtNightPatientDetailListVo valueObject = (ims.clinical.vo.HospitalAtNightPatientDetailListVo) map.getValueObject(domainObject, ims.clinical.vo.HospitalAtNightPatientDetailListVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.HospitalAtNightPatientDetailListVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.HospitalAtNightPatientDetail
	 */
	 public static ims.clinical.vo.HospitalAtNightPatientDetailListVo insert(ims.clinical.vo.HospitalAtNightPatientDetailListVo valueObject, ims.clinical.domain.objects.HospitalAtNightPatientDetail domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.HospitalAtNightPatientDetail
	 */
	 public static ims.clinical.vo.HospitalAtNightPatientDetailListVo insert(DomainObjectMap map, ims.clinical.vo.HospitalAtNightPatientDetailListVo valueObject, ims.clinical.domain.objects.HospitalAtNightPatientDetail domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_HospitalAtNightPatientDetail(domainObject.getId());
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
		valueObject.setPatient(ims.clinical.vo.domain.PatientForHospitalAtNightVoAssembler.create(map, domainObject.getPatient()) );
		// MEWS
		ims.domain.lookups.LookupInstance instance2 = domainObject.getMEWS();
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

			ims.clinical.vo.lookups.MEWS voLookup2 = new ims.clinical.vo.lookups.MEWS(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.clinical.vo.lookups.MEWS parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.clinical.vo.lookups.MEWS(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setMEWS(voLookup2);
		}
				// TypeOfRequest
		ims.domain.lookups.LookupInstance instance3 = domainObject.getTypeOfRequest();
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

			ims.clinical.vo.lookups.HospitalAtNightRequestType voLookup3 = new ims.clinical.vo.lookups.HospitalAtNightRequestType(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.clinical.vo.lookups.HospitalAtNightRequestType parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.clinical.vo.lookups.HospitalAtNightRequestType(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setTypeOfRequest(voLookup3);
		}
				// WardWhenPlacedOnList
		valueObject.setWardWhenPlacedOnList(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getWardWhenPlacedOnList()) );
		// CurrentStatus
		valueObject.setCurrentStatus(ims.clinical.vo.domain.HospitalAtNightPatientDetailStatusVoAssembler.create(map, domainObject.getCurrentStatus()) );
		// RequestingDateTime
		java.util.Date RequestingDateTime = domainObject.getRequestingDateTime();
		if ( null != RequestingDateTime ) 
		{
			valueObject.setRequestingDateTime(new ims.framework.utils.DateTime(RequestingDateTime) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.HospitalAtNightPatientDetail extractHospitalAtNightPatientDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.HospitalAtNightPatientDetailListVo valueObject) 
	{
		return 	extractHospitalAtNightPatientDetail(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.HospitalAtNightPatientDetail extractHospitalAtNightPatientDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.HospitalAtNightPatientDetailListVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_HospitalAtNightPatientDetail();
		ims.clinical.domain.objects.HospitalAtNightPatientDetail domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.HospitalAtNightPatientDetail)domMap.get(valueObject);
			}
			// ims.clinical.vo.HospitalAtNightPatientDetailListVo ID_HospitalAtNightPatientDetail field is unknown
			domainObject = new ims.clinical.domain.objects.HospitalAtNightPatientDetail();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_HospitalAtNightPatientDetail());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.HospitalAtNightPatientDetail)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.HospitalAtNightPatientDetail) domainFactory.getDomainObject(ims.clinical.domain.objects.HospitalAtNightPatientDetail.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_HospitalAtNightPatientDetail());

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
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getMEWS() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getMEWS().getID());
		}
		domainObject.setMEWS(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getTypeOfRequest() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getTypeOfRequest().getID());
		}
		domainObject.setTypeOfRequest(value3);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value4 = null;
		if ( null != valueObject.getWardWhenPlacedOnList() ) 
		{
			if (valueObject.getWardWhenPlacedOnList().getBoId() == null)
			{
				if (domMap.get(valueObject.getWardWhenPlacedOnList()) != null)
				{
					value4 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getWardWhenPlacedOnList());
				}
			}
			else
			{
				value4 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getWardWhenPlacedOnList().getBoId());
			}
		}
		domainObject.setWardWhenPlacedOnList(value4);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.clinical.domain.objects.HospitalAtNightPatientDetailStatus value5 = null;
		if ( null != valueObject.getCurrentStatus() ) 
		{
			if (valueObject.getCurrentStatus().getBoId() == null)
			{
				if (domMap.get(valueObject.getCurrentStatus()) != null)
				{
					value5 = (ims.clinical.domain.objects.HospitalAtNightPatientDetailStatus)domMap.get(valueObject.getCurrentStatus());
				}
			}
			else
			{
				value5 = (ims.clinical.domain.objects.HospitalAtNightPatientDetailStatus)domainFactory.getDomainObject(ims.clinical.domain.objects.HospitalAtNightPatientDetailStatus.class, valueObject.getCurrentStatus().getBoId());
			}
		}
		domainObject.setCurrentStatus(value5);
		ims.framework.utils.DateTime dateTime6 = valueObject.getRequestingDateTime();
		java.util.Date value6 = null;
		if ( dateTime6 != null ) 
		{
			value6 = dateTime6.getJavaDate();
		}
		domainObject.setRequestingDateTime(value6);

		return domainObject;
	}

}
