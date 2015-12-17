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
package ims.emergency.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class EmergencyAttendanceForTriageVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.EmergencyAttendanceForTriageVo copy(ims.emergency.vo.EmergencyAttendanceForTriageVo valueObjectDest, ims.emergency.vo.EmergencyAttendanceForTriageVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_EmergencyAttendance(valueObjectSrc.getID_EmergencyAttendance());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// RegistrationLocation
		valueObjectDest.setRegistrationLocation(valueObjectSrc.getRegistrationLocation());
		// Outcome
		valueObjectDest.setOutcome(valueObjectSrc.getOutcome());
		// ArrivalDateTime
		valueObjectDest.setArrivalDateTime(valueObjectSrc.getArrivalDateTime());
		// DischargeDateTime
		valueObjectDest.setDischargeDateTime(valueObjectSrc.getDischargeDateTime());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// UrgencyLevel
		valueObjectDest.setUrgencyLevel(valueObjectSrc.getUrgencyLevel());
		// ConclusionDateTime
		valueObjectDest.setConclusionDateTime(valueObjectSrc.getConclusionDateTime());
		// BedTypeRequested
		valueObjectDest.setBedTypeRequested(valueObjectSrc.getBedTypeRequested());
		// MC
		valueObjectDest.setMC(valueObjectSrc.getMC());
		// COTA
		valueObjectDest.setCOTA(valueObjectSrc.getCOTA());
		// PCG1
		valueObjectDest.setPCG1(valueObjectSrc.getPCG1());
		// PCG2
		valueObjectDest.setPCG2(valueObjectSrc.getPCG2());
		// HAR
		valueObjectDest.setHAR(valueObjectSrc.getHAR());
		// Purchaser
		valueObjectDest.setPurchaser(valueObjectSrc.getPurchaser());
		// SequenceNumber
		valueObjectDest.setSequenceNumber(valueObjectSrc.getSequenceNumber());
		// RegistrationDateTime
		valueObjectDest.setRegistrationDateTime(valueObjectSrc.getRegistrationDateTime());
		// AgeAtAttendance
		valueObjectDest.setAgeAtAttendance(valueObjectSrc.getAgeAtAttendance());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createEmergencyAttendanceForTriageVoCollectionFromEmergencyAttendance(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.EmergencyAttendance objects.
	 */
	public static ims.emergency.vo.EmergencyAttendanceForTriageVoCollection createEmergencyAttendanceForTriageVoCollectionFromEmergencyAttendance(java.util.Set domainObjectSet)	
	{
		return createEmergencyAttendanceForTriageVoCollectionFromEmergencyAttendance(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.EmergencyAttendance objects.
	 */
	public static ims.emergency.vo.EmergencyAttendanceForTriageVoCollection createEmergencyAttendanceForTriageVoCollectionFromEmergencyAttendance(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.EmergencyAttendanceForTriageVoCollection voList = new ims.emergency.vo.EmergencyAttendanceForTriageVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.domain.objects.EmergencyAttendance domainObject = (ims.core.admin.domain.objects.EmergencyAttendance) iterator.next();
			ims.emergency.vo.EmergencyAttendanceForTriageVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.domain.objects.EmergencyAttendance objects.
	 */
	public static ims.emergency.vo.EmergencyAttendanceForTriageVoCollection createEmergencyAttendanceForTriageVoCollectionFromEmergencyAttendance(java.util.List domainObjectList) 
	{
		return createEmergencyAttendanceForTriageVoCollectionFromEmergencyAttendance(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.EmergencyAttendance objects.
	 */
	public static ims.emergency.vo.EmergencyAttendanceForTriageVoCollection createEmergencyAttendanceForTriageVoCollectionFromEmergencyAttendance(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.EmergencyAttendanceForTriageVoCollection voList = new ims.emergency.vo.EmergencyAttendanceForTriageVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.EmergencyAttendance domainObject = (ims.core.admin.domain.objects.EmergencyAttendance) domainObjectList.get(i);
			ims.emergency.vo.EmergencyAttendanceForTriageVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.domain.objects.EmergencyAttendance set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractEmergencyAttendanceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EmergencyAttendanceForTriageVoCollection voCollection) 
	 {
	 	return extractEmergencyAttendanceSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractEmergencyAttendanceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EmergencyAttendanceForTriageVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.EmergencyAttendanceForTriageVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.EmergencyAttendance domainObject = EmergencyAttendanceForTriageVoAssembler.extractEmergencyAttendance(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.domain.objects.EmergencyAttendance list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractEmergencyAttendanceList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EmergencyAttendanceForTriageVoCollection voCollection) 
	 {
	 	return extractEmergencyAttendanceList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractEmergencyAttendanceList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EmergencyAttendanceForTriageVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.EmergencyAttendanceForTriageVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.EmergencyAttendance domainObject = EmergencyAttendanceForTriageVoAssembler.extractEmergencyAttendance(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.domain.objects.EmergencyAttendance object.
	 * @param domainObject ims.core.admin.domain.objects.EmergencyAttendance
	 */
	 public static ims.emergency.vo.EmergencyAttendanceForTriageVo create(ims.core.admin.domain.objects.EmergencyAttendance domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.domain.objects.EmergencyAttendance object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.emergency.vo.EmergencyAttendanceForTriageVo create(DomainObjectMap map, ims.core.admin.domain.objects.EmergencyAttendance domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.EmergencyAttendanceForTriageVo valueObject = (ims.emergency.vo.EmergencyAttendanceForTriageVo) map.getValueObject(domainObject, ims.emergency.vo.EmergencyAttendanceForTriageVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.EmergencyAttendanceForTriageVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.domain.objects.EmergencyAttendance
	 */
	 public static ims.emergency.vo.EmergencyAttendanceForTriageVo insert(ims.emergency.vo.EmergencyAttendanceForTriageVo valueObject, ims.core.admin.domain.objects.EmergencyAttendance domainObject) 
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
	 * @param domainObject ims.core.admin.domain.objects.EmergencyAttendance
	 */
	 public static ims.emergency.vo.EmergencyAttendanceForTriageVo insert(DomainObjectMap map, ims.emergency.vo.EmergencyAttendanceForTriageVo valueObject, ims.core.admin.domain.objects.EmergencyAttendance domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_EmergencyAttendance(domainObject.getId());
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
			
		// RegistrationLocation
		valueObject.setRegistrationLocation(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getRegistrationLocation()) );
		// Outcome
		ims.domain.lookups.LookupInstance instance2 = domainObject.getOutcome();
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

			ims.emergency.vo.lookups.AttendanceOutcome voLookup2 = new ims.emergency.vo.lookups.AttendanceOutcome(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.emergency.vo.lookups.AttendanceOutcome parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.emergency.vo.lookups.AttendanceOutcome(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setOutcome(voLookup2);
		}
				// ArrivalDateTime
		java.util.Date ArrivalDateTime = domainObject.getArrivalDateTime();
		if ( null != ArrivalDateTime ) 
		{
			valueObject.setArrivalDateTime(new ims.framework.utils.DateTime(ArrivalDateTime) );
		}
		// DischargeDateTime
		java.util.Date DischargeDateTime = domainObject.getDischargeDateTime();
		if ( null != DischargeDateTime ) 
		{
			valueObject.setDischargeDateTime(new ims.framework.utils.DateTime(DischargeDateTime) );
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
		// UrgencyLevel
		ims.domain.lookups.LookupInstance instance6 = domainObject.getUrgencyLevel();
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

			ims.emergency.vo.lookups.UrgencyLevel voLookup6 = new ims.emergency.vo.lookups.UrgencyLevel(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.emergency.vo.lookups.UrgencyLevel parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.emergency.vo.lookups.UrgencyLevel(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setUrgencyLevel(voLookup6);
		}
				// ConclusionDateTime
		java.util.Date ConclusionDateTime = domainObject.getConclusionDateTime();
		if ( null != ConclusionDateTime ) 
		{
			valueObject.setConclusionDateTime(new ims.framework.utils.DateTime(ConclusionDateTime) );
		}
		// BedTypeRequested
		ims.domain.lookups.LookupInstance instance8 = domainObject.getBedTypeRequested();
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

			ims.core.vo.lookups.BedTypeRequested voLookup8 = new ims.core.vo.lookups.BedTypeRequested(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.BedTypeRequested parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.BedTypeRequested(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setBedTypeRequested(voLookup8);
		}
				// MC
		valueObject.setMC(domainObject.getMC());
		// COTA
		valueObject.setCOTA(domainObject.getCOTA());
		// PCG1
		valueObject.setPCG1(domainObject.getPCG1());
		// PCG2
		valueObject.setPCG2(domainObject.getPCG2());
		// HAR
		valueObject.setHAR(domainObject.getHAR());
		// Purchaser
		valueObject.setPurchaser(domainObject.getPurchaser());
		// SequenceNumber
		valueObject.setSequenceNumber(domainObject.getSequenceNumber());
		// RegistrationDateTime
		java.util.Date RegistrationDateTime = domainObject.getRegistrationDateTime();
		if ( null != RegistrationDateTime ) 
		{
			valueObject.setRegistrationDateTime(new ims.framework.utils.DateTime(RegistrationDateTime) );
		}
		// AgeAtAttendance
		valueObject.setAgeAtAttendance(domainObject.getAgeAtAttendance());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.EmergencyAttendance extractEmergencyAttendance(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EmergencyAttendanceForTriageVo valueObject) 
	{
		return 	extractEmergencyAttendance(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.EmergencyAttendance extractEmergencyAttendance(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EmergencyAttendanceForTriageVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_EmergencyAttendance();
		ims.core.admin.domain.objects.EmergencyAttendance domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.domain.objects.EmergencyAttendance)domMap.get(valueObject);
			}
			// ims.emergency.vo.EmergencyAttendanceForTriageVo ID_EmergencyAttendance field is unknown
			domainObject = new ims.core.admin.domain.objects.EmergencyAttendance();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_EmergencyAttendance());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.domain.objects.EmergencyAttendance)domMap.get(key);
			}
			domainObject = (ims.core.admin.domain.objects.EmergencyAttendance) domainFactory.getDomainObject(ims.core.admin.domain.objects.EmergencyAttendance.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_EmergencyAttendance());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value1 = null;
		if ( null != valueObject.getRegistrationLocation() ) 
		{
			if (valueObject.getRegistrationLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getRegistrationLocation()) != null)
				{
					value1 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getRegistrationLocation());
				}
			}
			else
			{
				value1 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getRegistrationLocation().getBoId());
			}
		}
		domainObject.setRegistrationLocation(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getOutcome() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getOutcome().getID());
		}
		domainObject.setOutcome(value2);
		ims.framework.utils.DateTime dateTime3 = valueObject.getArrivalDateTime();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setArrivalDateTime(value3);
		ims.framework.utils.DateTime dateTime4 = valueObject.getDischargeDateTime();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setDischargeDateTime(value4);
		ims.core.admin.domain.objects.CareContext value5 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value5 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value5 = domainObject.getCareContext();	
			}
			else
			{
				value5 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getUrgencyLevel() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getUrgencyLevel().getID());
		}
		domainObject.setUrgencyLevel(value6);
		ims.framework.utils.DateTime dateTime7 = valueObject.getConclusionDateTime();
		java.util.Date value7 = null;
		if ( dateTime7 != null ) 
		{
			value7 = dateTime7.getJavaDate();
		}
		domainObject.setConclusionDateTime(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getBedTypeRequested() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getBedTypeRequested().getID());
		}
		domainObject.setBedTypeRequested(value8);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getMC() != null && valueObject.getMC().equals(""))
		{
			valueObject.setMC(null);
		}
		domainObject.setMC(valueObject.getMC());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCOTA() != null && valueObject.getCOTA().equals(""))
		{
			valueObject.setCOTA(null);
		}
		domainObject.setCOTA(valueObject.getCOTA());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPCG1() != null && valueObject.getPCG1().equals(""))
		{
			valueObject.setPCG1(null);
		}
		domainObject.setPCG1(valueObject.getPCG1());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPCG2() != null && valueObject.getPCG2().equals(""))
		{
			valueObject.setPCG2(null);
		}
		domainObject.setPCG2(valueObject.getPCG2());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getHAR() != null && valueObject.getHAR().equals(""))
		{
			valueObject.setHAR(null);
		}
		domainObject.setHAR(valueObject.getHAR());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPurchaser() != null && valueObject.getPurchaser().equals(""))
		{
			valueObject.setPurchaser(null);
		}
		domainObject.setPurchaser(valueObject.getPurchaser());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSequenceNumber() != null && valueObject.getSequenceNumber().equals(""))
		{
			valueObject.setSequenceNumber(null);
		}
		domainObject.setSequenceNumber(valueObject.getSequenceNumber());
		ims.framework.utils.DateTime dateTime16 = valueObject.getRegistrationDateTime();
		java.util.Date value16 = null;
		if ( dateTime16 != null ) 
		{
			value16 = dateTime16.getJavaDate();
		}
		domainObject.setRegistrationDateTime(value16);
		domainObject.setAgeAtAttendance(valueObject.getAgeAtAttendance());

		return domainObject;
	}

}
