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
package ims.pathways.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Marius Mihalec
 */
public class PatientJourneyEventInterfaceVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.pathways.vo.PatientJourneyEventInterfaceVo copy(ims.pathways.vo.PatientJourneyEventInterfaceVo valueObjectDest, ims.pathways.vo.PatientJourneyEventInterfaceVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientEvent(valueObjectSrc.getID_PatientEvent());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Event
		valueObjectDest.setEvent(valueObjectSrc.getEvent());
		// EventDateTime
		valueObjectDest.setEventDateTime(valueObjectSrc.getEventDateTime());
		// PatientTarget
		valueObjectDest.setPatientTarget(valueObjectSrc.getPatientTarget());
		// Specialty
		valueObjectDest.setSpecialty(valueObjectSrc.getSpecialty());
		// Consultant
		valueObjectDest.setConsultant(valueObjectSrc.getConsultant());
		// ClinicCode
		valueObjectDest.setClinicCode(valueObjectSrc.getClinicCode());
		// ScheduledDate
		valueObjectDest.setScheduledDate(valueObjectSrc.getScheduledDate());
		// EventStatus
		valueObjectDest.setEventStatus(valueObjectSrc.getEventStatus());
		// Description
		valueObjectDest.setDescription(valueObjectSrc.getDescription());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientJourneyEventInterfaceVoCollectionFromPatientEvent(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.pathways.domain.objects.PatientEvent objects.
	 */
	public static ims.pathways.vo.PatientJourneyEventInterfaceVoCollection createPatientJourneyEventInterfaceVoCollectionFromPatientEvent(java.util.Set domainObjectSet)	
	{
		return createPatientJourneyEventInterfaceVoCollectionFromPatientEvent(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.pathways.domain.objects.PatientEvent objects.
	 */
	public static ims.pathways.vo.PatientJourneyEventInterfaceVoCollection createPatientJourneyEventInterfaceVoCollectionFromPatientEvent(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.pathways.vo.PatientJourneyEventInterfaceVoCollection voList = new ims.pathways.vo.PatientJourneyEventInterfaceVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.pathways.domain.objects.PatientEvent domainObject = (ims.pathways.domain.objects.PatientEvent) iterator.next();
			ims.pathways.vo.PatientJourneyEventInterfaceVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.pathways.domain.objects.PatientEvent objects.
	 */
	public static ims.pathways.vo.PatientJourneyEventInterfaceVoCollection createPatientJourneyEventInterfaceVoCollectionFromPatientEvent(java.util.List domainObjectList) 
	{
		return createPatientJourneyEventInterfaceVoCollectionFromPatientEvent(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.pathways.domain.objects.PatientEvent objects.
	 */
	public static ims.pathways.vo.PatientJourneyEventInterfaceVoCollection createPatientJourneyEventInterfaceVoCollectionFromPatientEvent(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.pathways.vo.PatientJourneyEventInterfaceVoCollection voList = new ims.pathways.vo.PatientJourneyEventInterfaceVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.pathways.domain.objects.PatientEvent domainObject = (ims.pathways.domain.objects.PatientEvent) domainObjectList.get(i);
			ims.pathways.vo.PatientJourneyEventInterfaceVo vo = create(map, domainObject);

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
	 * Create the ims.pathways.domain.objects.PatientEvent set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientEventSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PatientJourneyEventInterfaceVoCollection voCollection) 
	 {
	 	return extractPatientEventSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientEventSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PatientJourneyEventInterfaceVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.pathways.vo.PatientJourneyEventInterfaceVo vo = voCollection.get(i);
			ims.pathways.domain.objects.PatientEvent domainObject = PatientJourneyEventInterfaceVoAssembler.extractPatientEvent(domainFactory, vo, domMap);

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
	 * Create the ims.pathways.domain.objects.PatientEvent list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientEventList(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PatientJourneyEventInterfaceVoCollection voCollection) 
	 {
	 	return extractPatientEventList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientEventList(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PatientJourneyEventInterfaceVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.pathways.vo.PatientJourneyEventInterfaceVo vo = voCollection.get(i);
			ims.pathways.domain.objects.PatientEvent domainObject = PatientJourneyEventInterfaceVoAssembler.extractPatientEvent(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.pathways.domain.objects.PatientEvent object.
	 * @param domainObject ims.pathways.domain.objects.PatientEvent
	 */
	 public static ims.pathways.vo.PatientJourneyEventInterfaceVo create(ims.pathways.domain.objects.PatientEvent domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.pathways.domain.objects.PatientEvent object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.pathways.vo.PatientJourneyEventInterfaceVo create(DomainObjectMap map, ims.pathways.domain.objects.PatientEvent domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.pathways.vo.PatientJourneyEventInterfaceVo valueObject = (ims.pathways.vo.PatientJourneyEventInterfaceVo) map.getValueObject(domainObject, ims.pathways.vo.PatientJourneyEventInterfaceVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.pathways.vo.PatientJourneyEventInterfaceVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.pathways.domain.objects.PatientEvent
	 */
	 public static ims.pathways.vo.PatientJourneyEventInterfaceVo insert(ims.pathways.vo.PatientJourneyEventInterfaceVo valueObject, ims.pathways.domain.objects.PatientEvent domainObject) 
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
	 * @param domainObject ims.pathways.domain.objects.PatientEvent
	 */
	 public static ims.pathways.vo.PatientJourneyEventInterfaceVo insert(DomainObjectMap map, ims.pathways.vo.PatientJourneyEventInterfaceVo valueObject, ims.pathways.domain.objects.PatientEvent domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientEvent(domainObject.getId());
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
			
		// Event
		valueObject.setEvent(ims.pathways.vo.domain.EventLiteVoAssembler.create(map, domainObject.getEvent()) );
		// EventDateTime
		java.util.Date EventDateTime = domainObject.getEventDateTime();
		if ( null != EventDateTime ) 
		{
			valueObject.setEventDateTime(new ims.framework.utils.DateTime(EventDateTime) );
		}
		// PatientTarget
		valueObject.setPatientTarget(ims.pathways.vo.domain.PatientJourneyJourneyTargetInterfaceVoAssembler.create(map, domainObject.getPatientTarget()) );
		// Specialty
		ims.domain.lookups.LookupInstance instance4 = domainObject.getSpecialty();
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

			ims.core.vo.lookups.Specialty voLookup4 = new ims.core.vo.lookups.Specialty(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.Specialty(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setSpecialty(voLookup4);
		}
				// Consultant
		valueObject.setConsultant(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getConsultant()) );
		// ClinicCode
		valueObject.setClinicCode(domainObject.getClinicCode());
		// ScheduledDate
		java.util.Date ScheduledDate = domainObject.getScheduledDate();
		if ( null != ScheduledDate ) 
		{
			valueObject.setScheduledDate(new ims.framework.utils.DateTime(ScheduledDate) );
		}
		// EventStatus
		ims.domain.lookups.LookupInstance instance8 = domainObject.getEventStatus();
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

			ims.pathways.vo.lookups.EventStatus voLookup8 = new ims.pathways.vo.lookups.EventStatus(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.pathways.vo.lookups.EventStatus parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.pathways.vo.lookups.EventStatus(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setEventStatus(voLookup8);
		}
				// Description
		valueObject.setDescription(domainObject.getDescription());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.pathways.domain.objects.PatientEvent extractPatientEvent(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PatientJourneyEventInterfaceVo valueObject) 
	{
		return 	extractPatientEvent(domainFactory, valueObject, new HashMap());
	}

	public static ims.pathways.domain.objects.PatientEvent extractPatientEvent(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PatientJourneyEventInterfaceVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientEvent();
		ims.pathways.domain.objects.PatientEvent domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.pathways.domain.objects.PatientEvent)domMap.get(valueObject);
			}
			// ims.pathways.vo.PatientJourneyEventInterfaceVo ID_PatientEvent field is unknown
			domainObject = new ims.pathways.domain.objects.PatientEvent();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientEvent());
			if (domMap.get(key) != null)
			{
				return (ims.pathways.domain.objects.PatientEvent)domMap.get(key);
			}
			domainObject = (ims.pathways.domain.objects.PatientEvent) domainFactory.getDomainObject(ims.pathways.domain.objects.PatientEvent.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientEvent());

		domainObject.setEvent(ims.pathways.vo.domain.EventLiteVoAssembler.extractEvent(domainFactory, valueObject.getEvent(), domMap));
		ims.framework.utils.DateTime dateTime2 = valueObject.getEventDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setEventDateTime(value2);
		domainObject.setPatientTarget(ims.pathways.vo.domain.PatientJourneyJourneyTargetInterfaceVoAssembler.extractPatientJourneyTarget(domainFactory, valueObject.getPatientTarget(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value4);
		domainObject.setConsultant(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getConsultant(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getClinicCode() != null && valueObject.getClinicCode().equals(""))
		{
			valueObject.setClinicCode(null);
		}
		domainObject.setClinicCode(valueObject.getClinicCode());
		ims.framework.utils.DateTime dateTime7 = valueObject.getScheduledDate();
		java.util.Date value7 = null;
		if ( dateTime7 != null ) 
		{
			value7 = dateTime7.getJavaDate();
		}
		domainObject.setScheduledDate(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getEventStatus() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getEventStatus().getID());
		}
		domainObject.setEventStatus(value8);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDescription() != null && valueObject.getDescription().equals(""))
		{
			valueObject.setDescription(null);
		}
		domainObject.setDescription(valueObject.getDescription());

		return domainObject;
	}

}
