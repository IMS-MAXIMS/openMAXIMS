//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 12/10/2015, 13:24
 *
 */
package ims.dtomove.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Barbara Worwood
 */
public class ProfileVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.dtomove.vo.ProfileVo copy(ims.dtomove.vo.ProfileVo valueObjectDest, ims.dtomove.vo.ProfileVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Profile(valueObjectSrc.getID_Profile());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ActivityGroup
		valueObjectDest.setActivityGroup(valueObjectSrc.getActivityGroup());
		// Location
		valueObjectDest.setLocation(valueObjectSrc.getLocation());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// ScheduleCategory
		valueObjectDest.setScheduleCategory(valueObjectSrc.getScheduleCategory());
		// StartTime
		valueObjectDest.setStartTime(valueObjectSrc.getStartTime());
		// EndTime
		valueObjectDest.setEndTime(valueObjectSrc.getEndTime());
		// EffFrm
		valueObjectDest.setEffFrm(valueObjectSrc.getEffFrm());
		// EffTo
		valueObjectDest.setEffTo(valueObjectSrc.getEffTo());
		// MaxNoAppts
		valueObjectDest.setMaxNoAppts(valueObjectSrc.getMaxNoAppts());
		// IntervalType
		valueObjectDest.setIntervalType(valueObjectSrc.getIntervalType());
		// IntervalSize
		valueObjectDest.setIntervalSize(valueObjectSrc.getIntervalSize());
		// SchedulingType
		valueObjectDest.setSchedulingType(valueObjectSrc.getSchedulingType());
		// LastAppInterval
		valueObjectDest.setLastAppInterval(valueObjectSrc.getLastAppInterval());
		// cmdExtValue
		valueObjectDest.setCmdExtValue(valueObjectSrc.getCmdExtValue());
		// specClinic
		valueObjectDest.setSpecClinic(valueObjectSrc.getSpecClinic());
		// RoundAttTime
		valueObjectDest.setRoundAttTime(valueObjectSrc.getRoundAttTime());
		// LastGenDate
		valueObjectDest.setLastGenDate(valueObjectSrc.getLastGenDate());
		// isSchMon
		valueObjectDest.setIsSchMon(valueObjectSrc.getIsSchMon());
		// isSchTue
		valueObjectDest.setIsSchTue(valueObjectSrc.getIsSchTue());
		// isSchWed
		valueObjectDest.setIsSchWed(valueObjectSrc.getIsSchWed());
		// isSchThur
		valueObjectDest.setIsSchThur(valueObjectSrc.getIsSchThur());
		// isSchFri
		valueObjectDest.setIsSchFri(valueObjectSrc.getIsSchFri());
		// isSchSat
		valueObjectDest.setIsSchSat(valueObjectSrc.getIsSchSat());
		// isSchSun
		valueObjectDest.setIsSchSun(valueObjectSrc.getIsSchSun());
		// isWeek1
		valueObjectDest.setIsWeek1(valueObjectSrc.getIsWeek1());
		// isWeek2
		valueObjectDest.setIsWeek2(valueObjectSrc.getIsWeek2());
		// isWeek3
		valueObjectDest.setIsWeek3(valueObjectSrc.getIsWeek3());
		// isWeek4
		valueObjectDest.setIsWeek4(valueObjectSrc.getIsWeek4());
		// isWeek5
		valueObjectDest.setIsWeek5(valueObjectSrc.getIsWeek5());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// MinInt
		valueObjectDest.setMinInt(valueObjectSrc.getMinInt());
		// contArr
		valueObjectDest.setContArr(valueObjectSrc.getContArr());
		// contLocation
		valueObjectDest.setContLocation(valueObjectSrc.getContLocation());
		// specialty
		valueObjectDest.setSpecialty(valueObjectSrc.getSpecialty());
		// profileDetails
		valueObjectDest.setProfileDetails(valueObjectSrc.getProfileDetails());
		// ProfileListOwner
		valueObjectDest.setProfileListOwner(valueObjectSrc.getProfileListOwner());
		// profileUsers
		valueObjectDest.setProfileUsers(valueObjectSrc.getProfileUsers());
		// exclusionDates
		valueObjectDest.setExclusionDates(valueObjectSrc.getExclusionDates());
		// exclusionTimes
		valueObjectDest.setExclusionTimes(valueObjectSrc.getExclusionTimes());
		// actions
		valueObjectDest.setActions(valueObjectSrc.getActions());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createProfileVoCollectionFromProfile(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.dto_move.domain.objects.Profile objects.
	 */
	public static ims.dtomove.vo.ProfileVoCollection createProfileVoCollectionFromProfile(java.util.Set domainObjectSet)	
	{
		return createProfileVoCollectionFromProfile(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.dto_move.domain.objects.Profile objects.
	 */
	public static ims.dtomove.vo.ProfileVoCollection createProfileVoCollectionFromProfile(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.dtomove.vo.ProfileVoCollection voList = new ims.dtomove.vo.ProfileVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.dto_move.domain.objects.Profile domainObject = (ims.dto_move.domain.objects.Profile) iterator.next();
			ims.dtomove.vo.ProfileVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.dto_move.domain.objects.Profile objects.
	 */
	public static ims.dtomove.vo.ProfileVoCollection createProfileVoCollectionFromProfile(java.util.List domainObjectList) 
	{
		return createProfileVoCollectionFromProfile(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.dto_move.domain.objects.Profile objects.
	 */
	public static ims.dtomove.vo.ProfileVoCollection createProfileVoCollectionFromProfile(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.dtomove.vo.ProfileVoCollection voList = new ims.dtomove.vo.ProfileVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.dto_move.domain.objects.Profile domainObject = (ims.dto_move.domain.objects.Profile) domainObjectList.get(i);
			ims.dtomove.vo.ProfileVo vo = create(map, domainObject);

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
	 * Create the ims.dto_move.domain.objects.Profile set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractProfileSet(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.ProfileVoCollection voCollection) 
	 {
	 	return extractProfileSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractProfileSet(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.ProfileVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.dtomove.vo.ProfileVo vo = voCollection.get(i);
			ims.dto_move.domain.objects.Profile domainObject = ProfileVoAssembler.extractProfile(domainFactory, vo, domMap);

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
	 * Create the ims.dto_move.domain.objects.Profile list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractProfileList(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.ProfileVoCollection voCollection) 
	 {
	 	return extractProfileList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractProfileList(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.ProfileVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.dtomove.vo.ProfileVo vo = voCollection.get(i);
			ims.dto_move.domain.objects.Profile domainObject = ProfileVoAssembler.extractProfile(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.dto_move.domain.objects.Profile object.
	 * @param domainObject ims.dto_move.domain.objects.Profile
	 */
	 public static ims.dtomove.vo.ProfileVo create(ims.dto_move.domain.objects.Profile domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.dto_move.domain.objects.Profile object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.dtomove.vo.ProfileVo create(DomainObjectMap map, ims.dto_move.domain.objects.Profile domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.dtomove.vo.ProfileVo valueObject = (ims.dtomove.vo.ProfileVo) map.getValueObject(domainObject, ims.dtomove.vo.ProfileVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.dtomove.vo.ProfileVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.dto_move.domain.objects.Profile
	 */
	 public static ims.dtomove.vo.ProfileVo insert(ims.dtomove.vo.ProfileVo valueObject, ims.dto_move.domain.objects.Profile domainObject) 
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
	 * @param domainObject ims.dto_move.domain.objects.Profile
	 */
	 public static ims.dtomove.vo.ProfileVo insert(DomainObjectMap map, ims.dtomove.vo.ProfileVo valueObject, ims.dto_move.domain.objects.Profile domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Profile(domainObject.getId());
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
			
		// ActivityGroup
		if (domainObject.getActivityGroup() != null)
		{
			if(domainObject.getActivityGroup() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getActivityGroup();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setActivityGroup(new ims.dto_move.vo.ActivityGroupRefVo(id, -1));				
			}
			else
			{
				valueObject.setActivityGroup(new ims.dto_move.vo.ActivityGroupRefVo(domainObject.getActivityGroup().getId(), domainObject.getActivityGroup().getVersion()));
			}
		}
		// Location
		if (domainObject.getLocation() != null)
		{
			if(domainObject.getLocation() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getLocation();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setLocation(new ims.dto_move.vo.InternalLocationRefVo(id, -1));				
			}
			else
			{
				valueObject.setLocation(new ims.dto_move.vo.InternalLocationRefVo(domainObject.getLocation().getId(), domainObject.getLocation().getVersion()));
			}
		}
		// Name
		valueObject.setName(domainObject.getName());
		// ScheduleCategory
		valueObject.setScheduleCategory(domainObject.getScheduleCategory());
		// StartTime
		String StartTime = domainObject.getStartTime();
		if ( null != StartTime ) 
		{
			valueObject.setStartTime(new ims.framework.utils.Time(StartTime) );
		}
		// EndTime
		String EndTime = domainObject.getEndTime();
		if ( null != EndTime ) 
		{
			valueObject.setEndTime(new ims.framework.utils.Time(EndTime) );
		}
		// EffFrm
		java.util.Date EffFrm = domainObject.getEffFrm();
		if ( null != EffFrm ) 
		{
			valueObject.setEffFrm(new ims.framework.utils.Date(EffFrm) );
		}
		// EffTo
		java.util.Date EffTo = domainObject.getEffTo();
		if ( null != EffTo ) 
		{
			valueObject.setEffTo(new ims.framework.utils.Date(EffTo) );
		}
		// MaxNoAppts
		valueObject.setMaxNoAppts(domainObject.getMaxNoAppts());
		// IntervalType
		valueObject.setIntervalType(domainObject.getIntervalType());
		// IntervalSize
		valueObject.setIntervalSize(domainObject.getIntervalSize());
		// SchedulingType
		valueObject.setSchedulingType(domainObject.getSchedulingType());
		// LastAppInterval
		valueObject.setLastAppInterval(domainObject.getLastAppInterval());
		// cmdExtValue
		valueObject.setCmdExtValue(domainObject.getCmdExtValue());
		// specClinic
		valueObject.setSpecClinic(domainObject.getSpecClinic());
		// RoundAttTime
		valueObject.setRoundAttTime(domainObject.getRoundAttTime());
		// LastGenDate
		java.util.Date LastGenDate = domainObject.getLastGenDate();
		if ( null != LastGenDate ) 
		{
			valueObject.setLastGenDate(new ims.framework.utils.Date(LastGenDate) );
		}
		// isSchMon
		valueObject.setIsSchMon(domainObject.getIsSchMon());
		// isSchTue
		valueObject.setIsSchTue(domainObject.getIsSchTue());
		// isSchWed
		valueObject.setIsSchWed(domainObject.getIsSchWed());
		// isSchThur
		valueObject.setIsSchThur(domainObject.getIsSchThur());
		// isSchFri
		valueObject.setIsSchFri(domainObject.getIsSchFri());
		// isSchSat
		valueObject.setIsSchSat(domainObject.getIsSchSat());
		// isSchSun
		valueObject.setIsSchSun(domainObject.getIsSchSun());
		// isWeek1
		valueObject.setIsWeek1(domainObject.getIsWeek1());
		// isWeek2
		valueObject.setIsWeek2(domainObject.getIsWeek2());
		// isWeek3
		valueObject.setIsWeek3(domainObject.getIsWeek3());
		// isWeek4
		valueObject.setIsWeek4(domainObject.getIsWeek4());
		// isWeek5
		valueObject.setIsWeek5(domainObject.getIsWeek5());
		// isActive
		valueObject.setIsActive(domainObject.getIsActive());
		// MinInt
		valueObject.setMinInt(domainObject.getMinInt());
		// contArr
		valueObject.setContArr(domainObject.getContArr());
		// contLocation
		valueObject.setContLocation(domainObject.getContLocation());
		// specialty
		valueObject.setSpecialty(domainObject.getSpecialty());
		// profileDetails
		ims.dto_move.vo.ProfileDetailRefVoCollection profileDetails = new ims.dto_move.vo.ProfileDetailRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getProfileDetails().iterator(); iterator.hasNext(); ) 
		{
			ims.dto_move.domain.objects.ProfileDetail tmp = (ims.dto_move.domain.objects.ProfileDetail)iterator.next();
			if (tmp != null)
				profileDetails.add(new ims.dto_move.vo.ProfileDetailRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setProfileDetails(profileDetails);
		// ProfileListOwner
		ims.dto_move.vo.ProfileListOwnerRefVoCollection ProfileListOwner = new ims.dto_move.vo.ProfileListOwnerRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getProfileListOwner().iterator(); iterator.hasNext(); ) 
		{
			ims.dto_move.domain.objects.ProfileListOwner tmp = (ims.dto_move.domain.objects.ProfileListOwner)iterator.next();
			if (tmp != null)
				ProfileListOwner.add(new ims.dto_move.vo.ProfileListOwnerRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setProfileListOwner(ProfileListOwner);
		// profileUsers
		ims.dto_move.vo.ProfileUserRefVoCollection profileUsers = new ims.dto_move.vo.ProfileUserRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getProfileUsers().iterator(); iterator.hasNext(); ) 
		{
			ims.dto_move.domain.objects.ProfileUser tmp = (ims.dto_move.domain.objects.ProfileUser)iterator.next();
			if (tmp != null)
				profileUsers.add(new ims.dto_move.vo.ProfileUserRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setProfileUsers(profileUsers);
		// exclusionDates
		ims.dto_move.vo.ProfileExclusionDateRefVoCollection exclusionDates = new ims.dto_move.vo.ProfileExclusionDateRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getExclusionDates().iterator(); iterator.hasNext(); ) 
		{
			ims.dto_move.domain.objects.ProfileExclusionDate tmp = (ims.dto_move.domain.objects.ProfileExclusionDate)iterator.next();
			if (tmp != null)
				exclusionDates.add(new ims.dto_move.vo.ProfileExclusionDateRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setExclusionDates(exclusionDates);
		// exclusionTimes
		ims.dto_move.vo.ProfileExclusionTimeRefVoCollection exclusionTimes = new ims.dto_move.vo.ProfileExclusionTimeRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getExclusionTimes().iterator(); iterator.hasNext(); ) 
		{
			ims.dto_move.domain.objects.ProfileExclusionTime tmp = (ims.dto_move.domain.objects.ProfileExclusionTime)iterator.next();
			if (tmp != null)
				exclusionTimes.add(new ims.dto_move.vo.ProfileExclusionTimeRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setExclusionTimes(exclusionTimes);
		// actions
		ims.dto_move.vo.ProfileActionRefVoCollection actions = new ims.dto_move.vo.ProfileActionRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getActions().iterator(); iterator.hasNext(); ) 
		{
			ims.dto_move.domain.objects.ProfileAction tmp = (ims.dto_move.domain.objects.ProfileAction)iterator.next();
			if (tmp != null)
				actions.add(new ims.dto_move.vo.ProfileActionRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setActions(actions);
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.dto_move.domain.objects.Profile extractProfile(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.ProfileVo valueObject) 
	{
		return 	extractProfile(domainFactory, valueObject, new HashMap());
	}

	public static ims.dto_move.domain.objects.Profile extractProfile(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.ProfileVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Profile();
		ims.dto_move.domain.objects.Profile domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.dto_move.domain.objects.Profile)domMap.get(valueObject);
			}
			// ims.dtomove.vo.ProfileVo ID_Profile field is unknown
			domainObject = new ims.dto_move.domain.objects.Profile();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Profile());
			if (domMap.get(key) != null)
			{
				return (ims.dto_move.domain.objects.Profile)domMap.get(key);
			}
			domainObject = (ims.dto_move.domain.objects.Profile) domainFactory.getDomainObject(ims.dto_move.domain.objects.Profile.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Profile());

		ims.dto_move.domain.objects.ActivityGroup value1 = null;
		if ( null != valueObject.getActivityGroup() ) 
		{
			if (valueObject.getActivityGroup().getBoId() == null)
			{
				if (domMap.get(valueObject.getActivityGroup()) != null)
				{
					value1 = (ims.dto_move.domain.objects.ActivityGroup)domMap.get(valueObject.getActivityGroup());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getActivityGroup();	
			}
			else
			{
				value1 = (ims.dto_move.domain.objects.ActivityGroup)domainFactory.getDomainObject(ims.dto_move.domain.objects.ActivityGroup.class, valueObject.getActivityGroup().getBoId());
			}
		}
		domainObject.setActivityGroup(value1);
		ims.dto_move.domain.objects.InternalLocation value2 = null;
		if ( null != valueObject.getLocation() ) 
		{
			if (valueObject.getLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getLocation()) != null)
				{
					value2 = (ims.dto_move.domain.objects.InternalLocation)domMap.get(valueObject.getLocation());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getLocation();	
			}
			else
			{
				value2 = (ims.dto_move.domain.objects.InternalLocation)domainFactory.getDomainObject(ims.dto_move.domain.objects.InternalLocation.class, valueObject.getLocation().getBoId());
			}
		}
		domainObject.setLocation(value2);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());
		domainObject.setScheduleCategory(valueObject.getScheduleCategory());
		ims.framework.utils.Time time5 = valueObject.getStartTime();
		String value5 = null;
		if ( time5 != null ) 
		{
			value5 = time5.toString();
		}
		domainObject.setStartTime(value5);
		ims.framework.utils.Time time6 = valueObject.getEndTime();
		String value6 = null;
		if ( time6 != null ) 
		{
			value6 = time6.toString();
		}
		domainObject.setEndTime(value6);
		java.util.Date value7 = null;
		ims.framework.utils.Date date7 = valueObject.getEffFrm();		
		if ( date7 != null ) 
		{
			value7 = date7.getDate();
		}
		domainObject.setEffFrm(value7);
		java.util.Date value8 = null;
		ims.framework.utils.Date date8 = valueObject.getEffTo();		
		if ( date8 != null ) 
		{
			value8 = date8.getDate();
		}
		domainObject.setEffTo(value8);
		domainObject.setMaxNoAppts(valueObject.getMaxNoAppts());
		domainObject.setIntervalType(valueObject.getIntervalType());
		domainObject.setIntervalSize(valueObject.getIntervalSize());
		domainObject.setSchedulingType(valueObject.getSchedulingType());
		domainObject.setLastAppInterval(valueObject.getLastAppInterval());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCmdExtValue() != null && valueObject.getCmdExtValue().equals(""))
		{
			valueObject.setCmdExtValue(null);
		}
		domainObject.setCmdExtValue(valueObject.getCmdExtValue());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSpecClinic() != null && valueObject.getSpecClinic().equals(""))
		{
			valueObject.setSpecClinic(null);
		}
		domainObject.setSpecClinic(valueObject.getSpecClinic());
		domainObject.setRoundAttTime(valueObject.getRoundAttTime());
		java.util.Date value17 = null;
		ims.framework.utils.Date date17 = valueObject.getLastGenDate();		
		if ( date17 != null ) 
		{
			value17 = date17.getDate();
		}
		domainObject.setLastGenDate(value17);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getIsSchMon() != null && valueObject.getIsSchMon().equals(""))
		{
			valueObject.setIsSchMon(null);
		}
		domainObject.setIsSchMon(valueObject.getIsSchMon());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getIsSchTue() != null && valueObject.getIsSchTue().equals(""))
		{
			valueObject.setIsSchTue(null);
		}
		domainObject.setIsSchTue(valueObject.getIsSchTue());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getIsSchWed() != null && valueObject.getIsSchWed().equals(""))
		{
			valueObject.setIsSchWed(null);
		}
		domainObject.setIsSchWed(valueObject.getIsSchWed());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getIsSchThur() != null && valueObject.getIsSchThur().equals(""))
		{
			valueObject.setIsSchThur(null);
		}
		domainObject.setIsSchThur(valueObject.getIsSchThur());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getIsSchFri() != null && valueObject.getIsSchFri().equals(""))
		{
			valueObject.setIsSchFri(null);
		}
		domainObject.setIsSchFri(valueObject.getIsSchFri());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getIsSchSat() != null && valueObject.getIsSchSat().equals(""))
		{
			valueObject.setIsSchSat(null);
		}
		domainObject.setIsSchSat(valueObject.getIsSchSat());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getIsSchSun() != null && valueObject.getIsSchSun().equals(""))
		{
			valueObject.setIsSchSun(null);
		}
		domainObject.setIsSchSun(valueObject.getIsSchSun());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getIsWeek1() != null && valueObject.getIsWeek1().equals(""))
		{
			valueObject.setIsWeek1(null);
		}
		domainObject.setIsWeek1(valueObject.getIsWeek1());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getIsWeek2() != null && valueObject.getIsWeek2().equals(""))
		{
			valueObject.setIsWeek2(null);
		}
		domainObject.setIsWeek2(valueObject.getIsWeek2());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getIsWeek3() != null && valueObject.getIsWeek3().equals(""))
		{
			valueObject.setIsWeek3(null);
		}
		domainObject.setIsWeek3(valueObject.getIsWeek3());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getIsWeek4() != null && valueObject.getIsWeek4().equals(""))
		{
			valueObject.setIsWeek4(null);
		}
		domainObject.setIsWeek4(valueObject.getIsWeek4());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getIsWeek5() != null && valueObject.getIsWeek5().equals(""))
		{
			valueObject.setIsWeek5(null);
		}
		domainObject.setIsWeek5(valueObject.getIsWeek5());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getIsActive() != null && valueObject.getIsActive().equals(""))
		{
			valueObject.setIsActive(null);
		}
		domainObject.setIsActive(valueObject.getIsActive());
		domainObject.setMinInt(valueObject.getMinInt());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getContArr() != null && valueObject.getContArr().equals(""))
		{
			valueObject.setContArr(null);
		}
		domainObject.setContArr(valueObject.getContArr());
		domainObject.setContLocation(valueObject.getContLocation());
		domainObject.setSpecialty(valueObject.getSpecialty());

		ims.dto_move.vo.ProfileDetailRefVoCollection refCollection35 = valueObject.getProfileDetails();
		int size35 = (null == refCollection35) ? 0 : refCollection35.size();		
		java.util.List domainProfileDetails35 = domainObject.getProfileDetails();
		if (domainProfileDetails35 == null)
		{
			domainProfileDetails35 = new java.util.ArrayList();
		}
		for(int i=0; i < size35; i++) 
		{
			ims.dto_move.vo.ProfileDetailRefVo vo = refCollection35.get(i);			
			ims.dto_move.domain.objects.ProfileDetail dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.dto_move.domain.objects.ProfileDetail)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.dto_move.domain.objects.ProfileDetail)domainFactory.getDomainObject( ims.dto_move.domain.objects.ProfileDetail.class, vo.getBoId());
				}
			}

			int domIdx = domainProfileDetails35.indexOf(dom);
			if (domIdx == -1)
			{
				domainProfileDetails35.add(i, dom);
			}
			else if (i != domIdx && i < domainProfileDetails35.size())
			{
				Object tmp = domainProfileDetails35.get(i);
				domainProfileDetails35.set(i, domainProfileDetails35.get(domIdx));
				domainProfileDetails35.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i35 = domainProfileDetails35.size();
		while (i35 > size35)
		{
			domainProfileDetails35.remove(i35-1);
			i35 = domainProfileDetails35.size();
		}
		
		domainObject.setProfileDetails(domainProfileDetails35);		

		ims.dto_move.vo.ProfileListOwnerRefVoCollection refCollection36 = valueObject.getProfileListOwner();
		int size36 = (null == refCollection36) ? 0 : refCollection36.size();		
		java.util.List domainProfileListOwner36 = domainObject.getProfileListOwner();
		if (domainProfileListOwner36 == null)
		{
			domainProfileListOwner36 = new java.util.ArrayList();
		}
		for(int i=0; i < size36; i++) 
		{
			ims.dto_move.vo.ProfileListOwnerRefVo vo = refCollection36.get(i);			
			ims.dto_move.domain.objects.ProfileListOwner dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.dto_move.domain.objects.ProfileListOwner)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.dto_move.domain.objects.ProfileListOwner)domainFactory.getDomainObject( ims.dto_move.domain.objects.ProfileListOwner.class, vo.getBoId());
				}
			}

			int domIdx = domainProfileListOwner36.indexOf(dom);
			if (domIdx == -1)
			{
				domainProfileListOwner36.add(i, dom);
			}
			else if (i != domIdx && i < domainProfileListOwner36.size())
			{
				Object tmp = domainProfileListOwner36.get(i);
				domainProfileListOwner36.set(i, domainProfileListOwner36.get(domIdx));
				domainProfileListOwner36.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i36 = domainProfileListOwner36.size();
		while (i36 > size36)
		{
			domainProfileListOwner36.remove(i36-1);
			i36 = domainProfileListOwner36.size();
		}
		
		domainObject.setProfileListOwner(domainProfileListOwner36);		

		ims.dto_move.vo.ProfileUserRefVoCollection refCollection37 = valueObject.getProfileUsers();
		int size37 = (null == refCollection37) ? 0 : refCollection37.size();		
		java.util.List domainProfileUsers37 = domainObject.getProfileUsers();
		if (domainProfileUsers37 == null)
		{
			domainProfileUsers37 = new java.util.ArrayList();
		}
		for(int i=0; i < size37; i++) 
		{
			ims.dto_move.vo.ProfileUserRefVo vo = refCollection37.get(i);			
			ims.dto_move.domain.objects.ProfileUser dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.dto_move.domain.objects.ProfileUser)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.dto_move.domain.objects.ProfileUser)domainFactory.getDomainObject( ims.dto_move.domain.objects.ProfileUser.class, vo.getBoId());
				}
			}

			int domIdx = domainProfileUsers37.indexOf(dom);
			if (domIdx == -1)
			{
				domainProfileUsers37.add(i, dom);
			}
			else if (i != domIdx && i < domainProfileUsers37.size())
			{
				Object tmp = domainProfileUsers37.get(i);
				domainProfileUsers37.set(i, domainProfileUsers37.get(domIdx));
				domainProfileUsers37.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i37 = domainProfileUsers37.size();
		while (i37 > size37)
		{
			domainProfileUsers37.remove(i37-1);
			i37 = domainProfileUsers37.size();
		}
		
		domainObject.setProfileUsers(domainProfileUsers37);		

		ims.dto_move.vo.ProfileExclusionDateRefVoCollection refCollection38 = valueObject.getExclusionDates();
		int size38 = (null == refCollection38) ? 0 : refCollection38.size();		
		java.util.List domainExclusionDates38 = domainObject.getExclusionDates();
		if (domainExclusionDates38 == null)
		{
			domainExclusionDates38 = new java.util.ArrayList();
		}
		for(int i=0; i < size38; i++) 
		{
			ims.dto_move.vo.ProfileExclusionDateRefVo vo = refCollection38.get(i);			
			ims.dto_move.domain.objects.ProfileExclusionDate dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.dto_move.domain.objects.ProfileExclusionDate)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.dto_move.domain.objects.ProfileExclusionDate)domainFactory.getDomainObject( ims.dto_move.domain.objects.ProfileExclusionDate.class, vo.getBoId());
				}
			}

			int domIdx = domainExclusionDates38.indexOf(dom);
			if (domIdx == -1)
			{
				domainExclusionDates38.add(i, dom);
			}
			else if (i != domIdx && i < domainExclusionDates38.size())
			{
				Object tmp = domainExclusionDates38.get(i);
				domainExclusionDates38.set(i, domainExclusionDates38.get(domIdx));
				domainExclusionDates38.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i38 = domainExclusionDates38.size();
		while (i38 > size38)
		{
			domainExclusionDates38.remove(i38-1);
			i38 = domainExclusionDates38.size();
		}
		
		domainObject.setExclusionDates(domainExclusionDates38);		

		ims.dto_move.vo.ProfileExclusionTimeRefVoCollection refCollection39 = valueObject.getExclusionTimes();
		int size39 = (null == refCollection39) ? 0 : refCollection39.size();		
		java.util.List domainExclusionTimes39 = domainObject.getExclusionTimes();
		if (domainExclusionTimes39 == null)
		{
			domainExclusionTimes39 = new java.util.ArrayList();
		}
		for(int i=0; i < size39; i++) 
		{
			ims.dto_move.vo.ProfileExclusionTimeRefVo vo = refCollection39.get(i);			
			ims.dto_move.domain.objects.ProfileExclusionTime dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.dto_move.domain.objects.ProfileExclusionTime)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.dto_move.domain.objects.ProfileExclusionTime)domainFactory.getDomainObject( ims.dto_move.domain.objects.ProfileExclusionTime.class, vo.getBoId());
				}
			}

			int domIdx = domainExclusionTimes39.indexOf(dom);
			if (domIdx == -1)
			{
				domainExclusionTimes39.add(i, dom);
			}
			else if (i != domIdx && i < domainExclusionTimes39.size())
			{
				Object tmp = domainExclusionTimes39.get(i);
				domainExclusionTimes39.set(i, domainExclusionTimes39.get(domIdx));
				domainExclusionTimes39.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i39 = domainExclusionTimes39.size();
		while (i39 > size39)
		{
			domainExclusionTimes39.remove(i39-1);
			i39 = domainExclusionTimes39.size();
		}
		
		domainObject.setExclusionTimes(domainExclusionTimes39);		

		ims.dto_move.vo.ProfileActionRefVoCollection refCollection40 = valueObject.getActions();
		int size40 = (null == refCollection40) ? 0 : refCollection40.size();		
		java.util.List domainActions40 = domainObject.getActions();
		if (domainActions40 == null)
		{
			domainActions40 = new java.util.ArrayList();
		}
		for(int i=0; i < size40; i++) 
		{
			ims.dto_move.vo.ProfileActionRefVo vo = refCollection40.get(i);			
			ims.dto_move.domain.objects.ProfileAction dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.dto_move.domain.objects.ProfileAction)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.dto_move.domain.objects.ProfileAction)domainFactory.getDomainObject( ims.dto_move.domain.objects.ProfileAction.class, vo.getBoId());
				}
			}

			int domIdx = domainActions40.indexOf(dom);
			if (domIdx == -1)
			{
				domainActions40.add(i, dom);
			}
			else if (i != domIdx && i < domainActions40.size())
			{
				Object tmp = domainActions40.get(i);
				domainActions40.set(i, domainActions40.get(domIdx));
				domainActions40.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i40 = domainActions40.size();
		while (i40 > size40)
		{
			domainActions40.remove(i40-1);
			i40 = domainActions40.size();
		}
		
		domainObject.setActions(domainActions40);		

		return domainObject;
	}

}
