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
 * @author Neil McAnaspie
 */
public class OutPatientListVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.OutPatientListVo copy(ims.core.vo.OutPatientListVo valueObjectDest, ims.core.vo.OutPatientListVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_OutpatientAttendance(valueObjectSrc.getID_OutpatientAttendance());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AppointmentDateTime
		valueObjectDest.setAppointmentDateTime(valueObjectSrc.getAppointmentDateTime());
		// pasEvent
		valueObjectDest.setPasEvent(valueObjectSrc.getPasEvent());
		// clinic
		valueObjectDest.setClinic(valueObjectSrc.getClinic());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createOutPatientListVoCollectionFromOutpatientAttendance(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.OutpatientAttendance objects.
	 */
	public static ims.core.vo.OutPatientListVoCollection createOutPatientListVoCollectionFromOutpatientAttendance(java.util.Set domainObjectSet)	
	{
		return createOutPatientListVoCollectionFromOutpatientAttendance(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.OutpatientAttendance objects.
	 */
	public static ims.core.vo.OutPatientListVoCollection createOutPatientListVoCollectionFromOutpatientAttendance(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.OutPatientListVoCollection voList = new ims.core.vo.OutPatientListVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.pas.domain.objects.OutpatientAttendance domainObject = (ims.core.admin.pas.domain.objects.OutpatientAttendance) iterator.next();
			ims.core.vo.OutPatientListVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.OutpatientAttendance objects.
	 */
	public static ims.core.vo.OutPatientListVoCollection createOutPatientListVoCollectionFromOutpatientAttendance(java.util.List domainObjectList) 
	{
		return createOutPatientListVoCollectionFromOutpatientAttendance(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.OutpatientAttendance objects.
	 */
	public static ims.core.vo.OutPatientListVoCollection createOutPatientListVoCollectionFromOutpatientAttendance(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.OutPatientListVoCollection voList = new ims.core.vo.OutPatientListVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.OutpatientAttendance domainObject = (ims.core.admin.pas.domain.objects.OutpatientAttendance) domainObjectList.get(i);
			ims.core.vo.OutPatientListVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.pas.domain.objects.OutpatientAttendance set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractOutpatientAttendanceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.OutPatientListVoCollection voCollection) 
	 {
	 	return extractOutpatientAttendanceSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOutpatientAttendanceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.OutPatientListVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.OutPatientListVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.OutpatientAttendance domainObject = OutPatientListVoAssembler.extractOutpatientAttendance(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.pas.domain.objects.OutpatientAttendance list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractOutpatientAttendanceList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.OutPatientListVoCollection voCollection) 
	 {
	 	return extractOutpatientAttendanceList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOutpatientAttendanceList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.OutPatientListVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.OutPatientListVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.OutpatientAttendance domainObject = OutPatientListVoAssembler.extractOutpatientAttendance(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.pas.domain.objects.OutpatientAttendance object.
	 * @param domainObject ims.core.admin.pas.domain.objects.OutpatientAttendance
	 */
	 public static ims.core.vo.OutPatientListVo create(ims.core.admin.pas.domain.objects.OutpatientAttendance domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.pas.domain.objects.OutpatientAttendance object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.OutPatientListVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.OutpatientAttendance domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.OutPatientListVo valueObject = (ims.core.vo.OutPatientListVo) map.getValueObject(domainObject, ims.core.vo.OutPatientListVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.OutPatientListVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.pas.domain.objects.OutpatientAttendance
	 */
	 public static ims.core.vo.OutPatientListVo insert(ims.core.vo.OutPatientListVo valueObject, ims.core.admin.pas.domain.objects.OutpatientAttendance domainObject) 
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
	 * @param domainObject ims.core.admin.pas.domain.objects.OutpatientAttendance
	 */
	 public static ims.core.vo.OutPatientListVo insert(DomainObjectMap map, ims.core.vo.OutPatientListVo valueObject, ims.core.admin.pas.domain.objects.OutpatientAttendance domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_OutpatientAttendance(domainObject.getId());
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
			
		// AppointmentDateTime
		java.util.Date AppointmentDateTime = domainObject.getAppointmentDateTime();
		if ( null != AppointmentDateTime ) 
		{
			valueObject.setAppointmentDateTime(new ims.framework.utils.DateTime(AppointmentDateTime) );
		}
		// pasEvent
		valueObject.setPasEvent(ims.core.vo.domain.PasEventShortVoAssembler.create(map, domainObject.getPasEvent()) );
		// clinic
		valueObject.setClinic(ims.core.vo.domain.ClinicVoAssembler.create(map, domainObject.getClinic()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.pas.domain.objects.OutpatientAttendance extractOutpatientAttendance(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.OutPatientListVo valueObject) 
	{
		return 	extractOutpatientAttendance(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.OutpatientAttendance extractOutpatientAttendance(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.OutPatientListVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_OutpatientAttendance();
		ims.core.admin.pas.domain.objects.OutpatientAttendance domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.pas.domain.objects.OutpatientAttendance)domMap.get(valueObject);
			}
			// ims.core.vo.OutPatientListVo ID_OutpatientAttendance field is unknown
			domainObject = new ims.core.admin.pas.domain.objects.OutpatientAttendance();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_OutpatientAttendance());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.pas.domain.objects.OutpatientAttendance)domMap.get(key);
			}
			domainObject = (ims.core.admin.pas.domain.objects.OutpatientAttendance) domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.OutpatientAttendance.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_OutpatientAttendance());

		ims.framework.utils.DateTime dateTime1 = valueObject.getAppointmentDateTime();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setAppointmentDateTime(value1);
		domainObject.setPasEvent(ims.core.vo.domain.PasEventShortVoAssembler.extractPASEvent(domainFactory, valueObject.getPasEvent(), domMap));
		domainObject.setClinic(ims.core.vo.domain.ClinicVoAssembler.extractClinic(domainFactory, valueObject.getClinic(), domMap));

		return domainObject;
	}

}
