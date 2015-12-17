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
 * @author Neil McAnaspie
 */
public class AttendanceDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.AttendanceDetailsVo copy(ims.emergency.vo.AttendanceDetailsVo valueObjectDest, ims.emergency.vo.AttendanceDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_EmergencyAttendance(valueObjectSrc.getID_EmergencyAttendance());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ArrivalDateTime
		valueObjectDest.setArrivalDateTime(valueObjectSrc.getArrivalDateTime());
		// RegistrationDateTime
		valueObjectDest.setRegistrationDateTime(valueObjectSrc.getRegistrationDateTime());
		// DischargeDateTime
		valueObjectDest.setDischargeDateTime(valueObjectSrc.getDischargeDateTime());
		// AttendanceType
		valueObjectDest.setAttendanceType(valueObjectSrc.getAttendanceType());
		// EmergencyDeptType
		valueObjectDest.setEmergencyDeptType(valueObjectSrc.getEmergencyDeptType());
		// ModeOfArrival
		valueObjectDest.setModeOfArrival(valueObjectSrc.getModeOfArrival());
		// AccompaniedBy
		valueObjectDest.setAccompaniedBy(valueObjectSrc.getAccompaniedBy());
		// RegistrationLocation
		valueObjectDest.setRegistrationLocation(valueObjectSrc.getRegistrationLocation());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// EmergencyEpisode
		valueObjectDest.setEmergencyEpisode(valueObjectSrc.getEmergencyEpisode());
		// Outcome
		valueObjectDest.setOutcome(valueObjectSrc.getOutcome());
		// Destination
		valueObjectDest.setDestination(valueObjectSrc.getDestination());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// Episode
		valueObjectDest.setEpisode(valueObjectSrc.getEpisode());
		// AmbulanceArrivalDateTime
		valueObjectDest.setAmbulanceArrivalDateTime(valueObjectSrc.getAmbulanceArrivalDateTime());
		// AmbulanceJobNo
		valueObjectDest.setAmbulanceJobNo(valueObjectSrc.getAmbulanceJobNo());
		// AgeAtAttendance
		valueObjectDest.setAgeAtAttendance(valueObjectSrc.getAgeAtAttendance());
		// UrgencyLevel
		valueObjectDest.setUrgencyLevel(valueObjectSrc.getUrgencyLevel());
		// VisitType
		valueObjectDest.setVisitType(valueObjectSrc.getVisitType());
		// EDConsultant
		valueObjectDest.setEDConsultant(valueObjectSrc.getEDConsultant());
		// RegisteringMOS
		valueObjectDest.setRegisteringMOS(valueObjectSrc.getRegisteringMOS());
		// UpdatingMOS
		valueObjectDest.setUpdatingMOS(valueObjectSrc.getUpdatingMOS());
		// Comments
		valueObjectDest.setComments(valueObjectSrc.getComments());
		// PreferedLanguage
		valueObjectDest.setPreferedLanguage(valueObjectSrc.getPreferedLanguage());
		// IntrepreterRequired
		valueObjectDest.setIntrepreterRequired(valueObjectSrc.getIntrepreterRequired());
		// DeptType
		valueObjectDest.setDeptType(valueObjectSrc.getDeptType());
		// isExpectedArrival
		valueObjectDest.setIsExpectedArrival(valueObjectSrc.getIsExpectedArrival());
		// isPrimaryCare
		valueObjectDest.setIsPrimaryCare(valueObjectSrc.getIsPrimaryCare());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createAttendanceDetailsVoCollectionFromEmergencyAttendance(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.EmergencyAttendance objects.
	 */
	public static ims.emergency.vo.AttendanceDetailsVoCollection createAttendanceDetailsVoCollectionFromEmergencyAttendance(java.util.Set domainObjectSet)	
	{
		return createAttendanceDetailsVoCollectionFromEmergencyAttendance(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.EmergencyAttendance objects.
	 */
	public static ims.emergency.vo.AttendanceDetailsVoCollection createAttendanceDetailsVoCollectionFromEmergencyAttendance(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.AttendanceDetailsVoCollection voList = new ims.emergency.vo.AttendanceDetailsVoCollection();
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
			ims.emergency.vo.AttendanceDetailsVo vo = create(map, domainObject);
			
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
	public static ims.emergency.vo.AttendanceDetailsVoCollection createAttendanceDetailsVoCollectionFromEmergencyAttendance(java.util.List domainObjectList) 
	{
		return createAttendanceDetailsVoCollectionFromEmergencyAttendance(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.EmergencyAttendance objects.
	 */
	public static ims.emergency.vo.AttendanceDetailsVoCollection createAttendanceDetailsVoCollectionFromEmergencyAttendance(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.AttendanceDetailsVoCollection voList = new ims.emergency.vo.AttendanceDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.EmergencyAttendance domainObject = (ims.core.admin.domain.objects.EmergencyAttendance) domainObjectList.get(i);
			ims.emergency.vo.AttendanceDetailsVo vo = create(map, domainObject);

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
	 public static java.util.Set extractEmergencyAttendanceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AttendanceDetailsVoCollection voCollection) 
	 {
	 	return extractEmergencyAttendanceSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractEmergencyAttendanceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AttendanceDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.AttendanceDetailsVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.EmergencyAttendance domainObject = AttendanceDetailsVoAssembler.extractEmergencyAttendance(domainFactory, vo, domMap);

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
	 public static java.util.List extractEmergencyAttendanceList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AttendanceDetailsVoCollection voCollection) 
	 {
	 	return extractEmergencyAttendanceList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractEmergencyAttendanceList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AttendanceDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.AttendanceDetailsVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.EmergencyAttendance domainObject = AttendanceDetailsVoAssembler.extractEmergencyAttendance(domainFactory, vo, domMap);

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
	 public static ims.emergency.vo.AttendanceDetailsVo create(ims.core.admin.domain.objects.EmergencyAttendance domainObject) 
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
	  public static ims.emergency.vo.AttendanceDetailsVo create(DomainObjectMap map, ims.core.admin.domain.objects.EmergencyAttendance domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.AttendanceDetailsVo valueObject = (ims.emergency.vo.AttendanceDetailsVo) map.getValueObject(domainObject, ims.emergency.vo.AttendanceDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.AttendanceDetailsVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.emergency.vo.AttendanceDetailsVo insert(ims.emergency.vo.AttendanceDetailsVo valueObject, ims.core.admin.domain.objects.EmergencyAttendance domainObject) 
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
	 public static ims.emergency.vo.AttendanceDetailsVo insert(DomainObjectMap map, ims.emergency.vo.AttendanceDetailsVo valueObject, ims.core.admin.domain.objects.EmergencyAttendance domainObject) 
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
			
		// ArrivalDateTime
		java.util.Date ArrivalDateTime = domainObject.getArrivalDateTime();
		if ( null != ArrivalDateTime ) 
		{
			valueObject.setArrivalDateTime(new ims.framework.utils.DateTime(ArrivalDateTime) );
		}
		// RegistrationDateTime
		java.util.Date RegistrationDateTime = domainObject.getRegistrationDateTime();
		if ( null != RegistrationDateTime ) 
		{
			valueObject.setRegistrationDateTime(new ims.framework.utils.DateTime(RegistrationDateTime) );
		}
		// DischargeDateTime
		java.util.Date DischargeDateTime = domainObject.getDischargeDateTime();
		if ( null != DischargeDateTime ) 
		{
			valueObject.setDischargeDateTime(new ims.framework.utils.DateTime(DischargeDateTime) );
		}
		// AttendanceType
		ims.domain.lookups.LookupInstance instance4 = domainObject.getAttendanceType();
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

			ims.emergency.vo.lookups.AttendanceType voLookup4 = new ims.emergency.vo.lookups.AttendanceType(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.emergency.vo.lookups.AttendanceType parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.emergency.vo.lookups.AttendanceType(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setAttendanceType(voLookup4);
		}
				// EmergencyDeptType
		ims.domain.lookups.LookupInstance instance5 = domainObject.getEmergencyDeptType();
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

			ims.emergency.vo.lookups.EmergencyDeptType voLookup5 = new ims.emergency.vo.lookups.EmergencyDeptType(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.emergency.vo.lookups.EmergencyDeptType parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.emergency.vo.lookups.EmergencyDeptType(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setEmergencyDeptType(voLookup5);
		}
				// ModeOfArrival
		ims.domain.lookups.LookupInstance instance6 = domainObject.getModeOfArrival();
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

			ims.emergency.vo.lookups.ModeOfArrival voLookup6 = new ims.emergency.vo.lookups.ModeOfArrival(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.emergency.vo.lookups.ModeOfArrival parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.emergency.vo.lookups.ModeOfArrival(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setModeOfArrival(voLookup6);
		}
				// AccompaniedBy
		ims.domain.lookups.LookupInstance instance7 = domainObject.getAccompaniedBy();
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

			ims.emergency.vo.lookups.AccompaniedBy voLookup7 = new ims.emergency.vo.lookups.AccompaniedBy(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.emergency.vo.lookups.AccompaniedBy parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.emergency.vo.lookups.AccompaniedBy(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setAccompaniedBy(voLookup7);
		}
				// RegistrationLocation
		if (domainObject.getRegistrationLocation() != null)
		{
			if(domainObject.getRegistrationLocation() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getRegistrationLocation();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setRegistrationLocation(new ims.core.resource.place.vo.LocationRefVo(id, -1));				
			}
			else
			{
				valueObject.setRegistrationLocation(new ims.core.resource.place.vo.LocationRefVo(domainObject.getRegistrationLocation().getId(), domainObject.getRegistrationLocation().getVersion()));
			}
		}
		// CareContext
		valueObject.setCareContext(ims.core.vo.domain.CareContextShortVoAssembler.create(map, domainObject.getCareContext()) );
		// EmergencyEpisode
		if (domainObject.getEmergencyEpisode() != null)
		{
			if(domainObject.getEmergencyEpisode() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getEmergencyEpisode();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setEmergencyEpisode(new ims.core.admin.vo.EmergencyEpisodeRefVo(id, -1));				
			}
			else
			{
				valueObject.setEmergencyEpisode(new ims.core.admin.vo.EmergencyEpisodeRefVo(domainObject.getEmergencyEpisode().getId(), domainObject.getEmergencyEpisode().getVersion()));
			}
		}
		// Outcome
		ims.domain.lookups.LookupInstance instance11 = domainObject.getOutcome();
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

			ims.emergency.vo.lookups.AttendanceOutcome voLookup11 = new ims.emergency.vo.lookups.AttendanceOutcome(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.emergency.vo.lookups.AttendanceOutcome parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.emergency.vo.lookups.AttendanceOutcome(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setOutcome(voLookup11);
		}
				// Destination
		valueObject.setDestination(domainObject.getDestination());
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
		// Episode
		if (domainObject.getEpisode() != null)
		{
			if(domainObject.getEpisode() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getEpisode();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setEpisode(new ims.core.admin.vo.EmergencyEpisodeRefVo(id, -1));				
			}
			else
			{
				valueObject.setEpisode(new ims.core.admin.vo.EmergencyEpisodeRefVo(domainObject.getEpisode().getId(), domainObject.getEpisode().getVersion()));
			}
		}
		// AmbulanceArrivalDateTime
		java.util.Date AmbulanceArrivalDateTime = domainObject.getAmbulanceArrivalDateTime();
		if ( null != AmbulanceArrivalDateTime ) 
		{
			valueObject.setAmbulanceArrivalDateTime(new ims.framework.utils.DateTime(AmbulanceArrivalDateTime) );
		}
		// AmbulanceJobNo
		valueObject.setAmbulanceJobNo(domainObject.getAmbulanceJobNo());
		// AgeAtAttendance
		valueObject.setAgeAtAttendance(domainObject.getAgeAtAttendance());
		// UrgencyLevel
		ims.domain.lookups.LookupInstance instance18 = domainObject.getUrgencyLevel();
		if ( null != instance18 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance18.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance18.getImage().getImageId(), instance18.getImage().getImagePath());
			}
			color = instance18.getColor();
			if (color != null) 
				color.getValue();

			ims.emergency.vo.lookups.UrgencyLevel voLookup18 = new ims.emergency.vo.lookups.UrgencyLevel(instance18.getId(),instance18.getText(), instance18.isActive(), null, img, color);
			ims.emergency.vo.lookups.UrgencyLevel parentVoLookup18 = voLookup18;
			ims.domain.lookups.LookupInstance parent18 = instance18.getParent();
			while (parent18 != null)
			{
				if (parent18.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent18.getImage().getImageId(), parent18.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent18.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup18.setParent(new ims.emergency.vo.lookups.UrgencyLevel(parent18.getId(),parent18.getText(), parent18.isActive(), null, img, color));
				parentVoLookup18 = parentVoLookup18.getParent();
								parent18 = parent18.getParent();
			}			
			valueObject.setUrgencyLevel(voLookup18);
		}
				// VisitType
		ims.domain.lookups.LookupInstance instance19 = domainObject.getVisitType();
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

			ims.emergency.vo.lookups.EDVisitType voLookup19 = new ims.emergency.vo.lookups.EDVisitType(instance19.getId(),instance19.getText(), instance19.isActive(), null, img, color);
			ims.emergency.vo.lookups.EDVisitType parentVoLookup19 = voLookup19;
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
								parentVoLookup19.setParent(new ims.emergency.vo.lookups.EDVisitType(parent19.getId(),parent19.getText(), parent19.isActive(), null, img, color));
				parentVoLookup19 = parentVoLookup19.getParent();
								parent19 = parent19.getParent();
			}			
			valueObject.setVisitType(voLookup19);
		}
				// EDConsultant
		ims.domain.lookups.LookupInstance instance20 = domainObject.getEDConsultant();
		if ( null != instance20 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance20.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance20.getImage().getImageId(), instance20.getImage().getImagePath());
			}
			color = instance20.getColor();
			if (color != null) 
				color.getValue();

			ims.emergency.vo.lookups.EDConsultant voLookup20 = new ims.emergency.vo.lookups.EDConsultant(instance20.getId(),instance20.getText(), instance20.isActive(), null, img, color);
			ims.emergency.vo.lookups.EDConsultant parentVoLookup20 = voLookup20;
			ims.domain.lookups.LookupInstance parent20 = instance20.getParent();
			while (parent20 != null)
			{
				if (parent20.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent20.getImage().getImageId(), parent20.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent20.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup20.setParent(new ims.emergency.vo.lookups.EDConsultant(parent20.getId(),parent20.getText(), parent20.isActive(), null, img, color));
				parentVoLookup20 = parentVoLookup20.getParent();
								parent20 = parent20.getParent();
			}			
			valueObject.setEDConsultant(voLookup20);
		}
				// RegisteringMOS
		valueObject.setRegisteringMOS(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getRegisteringMOS()) );
		// UpdatingMOS
		valueObject.setUpdatingMOS(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getUpdatingMOS()) );
		// Comments
		valueObject.setComments(domainObject.getComments());
		// PreferedLanguage
		ims.domain.lookups.LookupInstance instance24 = domainObject.getPreferedLanguage();
		if ( null != instance24 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance24.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance24.getImage().getImageId(), instance24.getImage().getImagePath());
			}
			color = instance24.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.Language voLookup24 = new ims.core.vo.lookups.Language(instance24.getId(),instance24.getText(), instance24.isActive(), null, img, color);
			ims.core.vo.lookups.Language parentVoLookup24 = voLookup24;
			ims.domain.lookups.LookupInstance parent24 = instance24.getParent();
			while (parent24 != null)
			{
				if (parent24.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent24.getImage().getImageId(), parent24.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent24.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup24.setParent(new ims.core.vo.lookups.Language(parent24.getId(),parent24.getText(), parent24.isActive(), null, img, color));
				parentVoLookup24 = parentVoLookup24.getParent();
								parent24 = parent24.getParent();
			}			
			valueObject.setPreferedLanguage(voLookup24);
		}
				// IntrepreterRequired
		ims.domain.lookups.LookupInstance instance25 = domainObject.getIntrepreterRequired();
		if ( null != instance25 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance25.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance25.getImage().getImageId(), instance25.getImage().getImagePath());
			}
			color = instance25.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup25 = new ims.core.vo.lookups.YesNo(instance25.getId(),instance25.getText(), instance25.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup25 = voLookup25;
			ims.domain.lookups.LookupInstance parent25 = instance25.getParent();
			while (parent25 != null)
			{
				if (parent25.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent25.getImage().getImageId(), parent25.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent25.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup25.setParent(new ims.core.vo.lookups.YesNo(parent25.getId(),parent25.getText(), parent25.isActive(), null, img, color));
				parentVoLookup25 = parentVoLookup25.getParent();
								parent25 = parent25.getParent();
			}			
			valueObject.setIntrepreterRequired(voLookup25);
		}
				// DeptType
		ims.domain.lookups.LookupInstance instance26 = domainObject.getDeptType();
		if ( null != instance26 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance26.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance26.getImage().getImageId(), instance26.getImage().getImagePath());
			}
			color = instance26.getColor();
			if (color != null) 
				color.getValue();

			ims.emergency.vo.lookups.EmergencyDeptType voLookup26 = new ims.emergency.vo.lookups.EmergencyDeptType(instance26.getId(),instance26.getText(), instance26.isActive(), null, img, color);
			ims.emergency.vo.lookups.EmergencyDeptType parentVoLookup26 = voLookup26;
			ims.domain.lookups.LookupInstance parent26 = instance26.getParent();
			while (parent26 != null)
			{
				if (parent26.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent26.getImage().getImageId(), parent26.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent26.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup26.setParent(new ims.emergency.vo.lookups.EmergencyDeptType(parent26.getId(),parent26.getText(), parent26.isActive(), null, img, color));
				parentVoLookup26 = parentVoLookup26.getParent();
								parent26 = parent26.getParent();
			}			
			valueObject.setDeptType(voLookup26);
		}
				// isExpectedArrival
		valueObject.setIsExpectedArrival( domainObject.isIsExpectedArrival() );
		// isPrimaryCare
		valueObject.setIsPrimaryCare( domainObject.isIsPrimaryCare() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.EmergencyAttendance extractEmergencyAttendance(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AttendanceDetailsVo valueObject) 
	{
		return 	extractEmergencyAttendance(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.EmergencyAttendance extractEmergencyAttendance(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AttendanceDetailsVo valueObject, HashMap domMap) 
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
			// ims.emergency.vo.AttendanceDetailsVo ID_EmergencyAttendance field is unknown
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

		ims.framework.utils.DateTime dateTime1 = valueObject.getArrivalDateTime();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setArrivalDateTime(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getRegistrationDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setRegistrationDateTime(value2);
		ims.framework.utils.DateTime dateTime3 = valueObject.getDischargeDateTime();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setDischargeDateTime(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getAttendanceType() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getAttendanceType().getID());
		}
		domainObject.setAttendanceType(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getEmergencyDeptType() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getEmergencyDeptType().getID());
		}
		domainObject.setEmergencyDeptType(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getModeOfArrival() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getModeOfArrival().getID());
		}
		domainObject.setModeOfArrival(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getAccompaniedBy() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getAccompaniedBy().getID());
		}
		domainObject.setAccompaniedBy(value7);
		ims.core.resource.place.domain.objects.Location value8 = null;
		if ( null != valueObject.getRegistrationLocation() ) 
		{
			if (valueObject.getRegistrationLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getRegistrationLocation()) != null)
				{
					value8 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getRegistrationLocation());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value8 = domainObject.getRegistrationLocation();	
			}
			else
			{
				value8 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getRegistrationLocation().getBoId());
			}
		}
		domainObject.setRegistrationLocation(value8);
		domainObject.setCareContext(ims.core.vo.domain.CareContextShortVoAssembler.extractCareContext(domainFactory, valueObject.getCareContext(), domMap));
		ims.core.admin.domain.objects.EmergencyEpisode value10 = null;
		if ( null != valueObject.getEmergencyEpisode() ) 
		{
			if (valueObject.getEmergencyEpisode().getBoId() == null)
			{
				if (domMap.get(valueObject.getEmergencyEpisode()) != null)
				{
					value10 = (ims.core.admin.domain.objects.EmergencyEpisode)domMap.get(valueObject.getEmergencyEpisode());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value10 = domainObject.getEmergencyEpisode();	
			}
			else
			{
				value10 = (ims.core.admin.domain.objects.EmergencyEpisode)domainFactory.getDomainObject(ims.core.admin.domain.objects.EmergencyEpisode.class, valueObject.getEmergencyEpisode().getBoId());
			}
		}
		domainObject.setEmergencyEpisode(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getOutcome() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getOutcome().getID());
		}
		domainObject.setOutcome(value11);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDestination() != null && valueObject.getDestination().equals(""))
		{
			valueObject.setDestination(null);
		}
		domainObject.setDestination(valueObject.getDestination());
		ims.core.patient.domain.objects.Patient value13 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value13 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value13 = domainObject.getPatient();	
			}
			else
			{
				value13 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value13);
		ims.core.admin.domain.objects.EmergencyEpisode value14 = null;
		if ( null != valueObject.getEpisode() ) 
		{
			if (valueObject.getEpisode().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisode()) != null)
				{
					value14 = (ims.core.admin.domain.objects.EmergencyEpisode)domMap.get(valueObject.getEpisode());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value14 = domainObject.getEpisode();	
			}
			else
			{
				value14 = (ims.core.admin.domain.objects.EmergencyEpisode)domainFactory.getDomainObject(ims.core.admin.domain.objects.EmergencyEpisode.class, valueObject.getEpisode().getBoId());
			}
		}
		domainObject.setEpisode(value14);
		ims.framework.utils.DateTime dateTime15 = valueObject.getAmbulanceArrivalDateTime();
		java.util.Date value15 = null;
		if ( dateTime15 != null ) 
		{
			value15 = dateTime15.getJavaDate();
		}
		domainObject.setAmbulanceArrivalDateTime(value15);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAmbulanceJobNo() != null && valueObject.getAmbulanceJobNo().equals(""))
		{
			valueObject.setAmbulanceJobNo(null);
		}
		domainObject.setAmbulanceJobNo(valueObject.getAmbulanceJobNo());
		domainObject.setAgeAtAttendance(valueObject.getAgeAtAttendance());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value18 = null;
		if ( null != valueObject.getUrgencyLevel() ) 
		{
			value18 =
				domainFactory.getLookupInstance(valueObject.getUrgencyLevel().getID());
		}
		domainObject.setUrgencyLevel(value18);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value19 = null;
		if ( null != valueObject.getVisitType() ) 
		{
			value19 =
				domainFactory.getLookupInstance(valueObject.getVisitType().getID());
		}
		domainObject.setVisitType(value19);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value20 = null;
		if ( null != valueObject.getEDConsultant() ) 
		{
			value20 =
				domainFactory.getLookupInstance(valueObject.getEDConsultant().getID());
		}
		domainObject.setEDConsultant(value20);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value21 = null;
		if ( null != valueObject.getRegisteringMOS() ) 
		{
			if (valueObject.getRegisteringMOS().getBoId() == null)
			{
				if (domMap.get(valueObject.getRegisteringMOS()) != null)
				{
					value21 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getRegisteringMOS());
				}
			}
			else
			{
				value21 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getRegisteringMOS().getBoId());
			}
		}
		domainObject.setRegisteringMOS(value21);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value22 = null;
		if ( null != valueObject.getUpdatingMOS() ) 
		{
			if (valueObject.getUpdatingMOS().getBoId() == null)
			{
				if (domMap.get(valueObject.getUpdatingMOS()) != null)
				{
					value22 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getUpdatingMOS());
				}
			}
			else
			{
				value22 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getUpdatingMOS().getBoId());
			}
		}
		domainObject.setUpdatingMOS(value22);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComments() != null && valueObject.getComments().equals(""))
		{
			valueObject.setComments(null);
		}
		domainObject.setComments(valueObject.getComments());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value24 = null;
		if ( null != valueObject.getPreferedLanguage() ) 
		{
			value24 =
				domainFactory.getLookupInstance(valueObject.getPreferedLanguage().getID());
		}
		domainObject.setPreferedLanguage(value24);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value25 = null;
		if ( null != valueObject.getIntrepreterRequired() ) 
		{
			value25 =
				domainFactory.getLookupInstance(valueObject.getIntrepreterRequired().getID());
		}
		domainObject.setIntrepreterRequired(value25);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value26 = null;
		if ( null != valueObject.getDeptType() ) 
		{
			value26 =
				domainFactory.getLookupInstance(valueObject.getDeptType().getID());
		}
		domainObject.setDeptType(value26);
		domainObject.setIsExpectedArrival(valueObject.getIsExpectedArrival());
		domainObject.setIsPrimaryCare(valueObject.getIsPrimaryCare());

		return domainObject;
	}

}
