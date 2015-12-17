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
package ims.scheduling.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class Sch_ProfileGenericVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.Sch_ProfileGenericVo copy(ims.scheduling.vo.Sch_ProfileGenericVo valueObjectDest, ims.scheduling.vo.Sch_ProfileGenericVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Sch_Profile(valueObjectSrc.getID_Sch_Profile());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ProfileSlots
		valueObjectDest.setProfileSlots(valueObjectSrc.getProfileSlots());
		// DirectoryOfServices
		valueObjectDest.setDirectoryOfServices(valueObjectSrc.getDirectoryOfServices());
		// TheatreDetails
		valueObjectDest.setTheatreDetails(valueObjectSrc.getTheatreDetails());
		// isTheatreProfile
		valueObjectDest.setIsTheatreProfile(valueObjectSrc.getIsTheatreProfile());
		// TheatreType
		valueObjectDest.setTheatreType(valueObjectSrc.getTheatreType());
		// ProfileActivities
		valueObjectDest.setProfileActivities(valueObjectSrc.getProfileActivities());
		// ProfileTheatreSlots
		valueObjectDest.setProfileTheatreSlots(valueObjectSrc.getProfileTheatreSlots());
		// SlotType
		valueObjectDest.setSlotType(valueObjectSrc.getSlotType());
		// ParentChildSlots
		valueObjectDest.setParentChildSlots(valueObjectSrc.getParentChildSlots());
		// AnaestheticType
		valueObjectDest.setAnaestheticType(valueObjectSrc.getAnaestheticType());
		// SchLocation
		valueObjectDest.setSchLocation(valueObjectSrc.getSchLocation());
		// isFixed
		valueObjectDest.setIsFixed(valueObjectSrc.getIsFixed());
		// isUnderContract
		valueObjectDest.setIsUnderContract(valueObjectSrc.getIsUnderContract());
		// IntervalType
		valueObjectDest.setIntervalType(valueObjectSrc.getIntervalType());
		// IntervalSize
		valueObjectDest.setIntervalSize(valueObjectSrc.getIntervalSize());
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
		// isFirstInstance
		valueObjectDest.setIsFirstInstance(valueObjectSrc.getIsFirstInstance());
		// isSecondInstance
		valueObjectDest.setIsSecondInstance(valueObjectSrc.getIsSecondInstance());
		// isThirdInstance
		valueObjectDest.setIsThirdInstance(valueObjectSrc.getIsThirdInstance());
		// isFourthInstance
		valueObjectDest.setIsFourthInstance(valueObjectSrc.getIsFourthInstance());
		// isFifthInstance
		valueObjectDest.setIsFifthInstance(valueObjectSrc.getIsFifthInstance());
		// MinInt
		valueObjectDest.setMinInt(valueObjectSrc.getMinInt());
		// RoundAttTime
		valueObjectDest.setRoundAttTime(valueObjectSrc.getRoundAttTime());
		// LastAppInterval
		valueObjectDest.setLastAppInterval(valueObjectSrc.getLastAppInterval());
		// StartTm
		valueObjectDest.setStartTm(valueObjectSrc.getStartTm());
		// EndTm
		valueObjectDest.setEndTm(valueObjectSrc.getEndTm());
		// PASClinic
		valueObjectDest.setPASClinic(valueObjectSrc.getPASClinic());
		// MaxNoAppts
		valueObjectDest.setMaxNoAppts(valueObjectSrc.getMaxNoAppts());
		// BookingRights
		valueObjectDest.setBookingRights(valueObjectSrc.getBookingRights());
		// ListOwners
		valueObjectDest.setListOwners(valueObjectSrc.getListOwners());
		// ExclusionDates
		valueObjectDest.setExclusionDates(valueObjectSrc.getExclusionDates());
		// ExclusionTimes
		valueObjectDest.setExclusionTimes(valueObjectSrc.getExclusionTimes());
		// ConsMediaType
		valueObjectDest.setConsMediaType(valueObjectSrc.getConsMediaType());
		// Description
		valueObjectDest.setDescription(valueObjectSrc.getDescription());
		// PrfCategory
		valueObjectDest.setPrfCategory(valueObjectSrc.getPrfCategory());
		// Prftype
		valueObjectDest.setPrftype(valueObjectSrc.getPrftype());
		// EffFrm
		valueObjectDest.setEffFrm(valueObjectSrc.getEffFrm());
		// EffTo
		valueObjectDest.setEffTo(valueObjectSrc.getEffTo());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// Service
		valueObjectDest.setService(valueObjectSrc.getService());
		// LastActualGenDate
		valueObjectDest.setLastActualGenDate(valueObjectSrc.getLastActualGenDate());
		// LastGenDate
		valueObjectDest.setLastGenDate(valueObjectSrc.getLastGenDate());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSch_ProfileGenericVoCollectionFromSch_Profile(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Sch_Profile objects.
	 */
	public static ims.scheduling.vo.Sch_ProfileGenericVoCollection createSch_ProfileGenericVoCollectionFromSch_Profile(java.util.Set domainObjectSet)	
	{
		return createSch_ProfileGenericVoCollectionFromSch_Profile(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Sch_Profile objects.
	 */
	public static ims.scheduling.vo.Sch_ProfileGenericVoCollection createSch_ProfileGenericVoCollectionFromSch_Profile(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.Sch_ProfileGenericVoCollection voList = new ims.scheduling.vo.Sch_ProfileGenericVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.scheduling.domain.objects.Sch_Profile domainObject = (ims.scheduling.domain.objects.Sch_Profile) iterator.next();
			ims.scheduling.vo.Sch_ProfileGenericVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Sch_Profile objects.
	 */
	public static ims.scheduling.vo.Sch_ProfileGenericVoCollection createSch_ProfileGenericVoCollectionFromSch_Profile(java.util.List domainObjectList) 
	{
		return createSch_ProfileGenericVoCollectionFromSch_Profile(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Sch_Profile objects.
	 */
	public static ims.scheduling.vo.Sch_ProfileGenericVoCollection createSch_ProfileGenericVoCollectionFromSch_Profile(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.Sch_ProfileGenericVoCollection voList = new ims.scheduling.vo.Sch_ProfileGenericVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.Sch_Profile domainObject = (ims.scheduling.domain.objects.Sch_Profile) domainObjectList.get(i);
			ims.scheduling.vo.Sch_ProfileGenericVo vo = create(map, domainObject);

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
	 * Create the ims.scheduling.domain.objects.Sch_Profile set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractSch_ProfileSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Sch_ProfileGenericVoCollection voCollection) 
	 {
	 	return extractSch_ProfileSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSch_ProfileSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Sch_ProfileGenericVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.Sch_ProfileGenericVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Sch_Profile domainObject = Sch_ProfileGenericVoAssembler.extractSch_Profile(domainFactory, vo, domMap);

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
	 * Create the ims.scheduling.domain.objects.Sch_Profile list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractSch_ProfileList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Sch_ProfileGenericVoCollection voCollection) 
	 {
	 	return extractSch_ProfileList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSch_ProfileList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Sch_ProfileGenericVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.Sch_ProfileGenericVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Sch_Profile domainObject = Sch_ProfileGenericVoAssembler.extractSch_Profile(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.scheduling.domain.objects.Sch_Profile object.
	 * @param domainObject ims.scheduling.domain.objects.Sch_Profile
	 */
	 public static ims.scheduling.vo.Sch_ProfileGenericVo create(ims.scheduling.domain.objects.Sch_Profile domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.scheduling.domain.objects.Sch_Profile object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.scheduling.vo.Sch_ProfileGenericVo create(DomainObjectMap map, ims.scheduling.domain.objects.Sch_Profile domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.Sch_ProfileGenericVo valueObject = (ims.scheduling.vo.Sch_ProfileGenericVo) map.getValueObject(domainObject, ims.scheduling.vo.Sch_ProfileGenericVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.Sch_ProfileGenericVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.scheduling.domain.objects.Sch_Profile
	 */
	 public static ims.scheduling.vo.Sch_ProfileGenericVo insert(ims.scheduling.vo.Sch_ProfileGenericVo valueObject, ims.scheduling.domain.objects.Sch_Profile domainObject) 
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
	 * @param domainObject ims.scheduling.domain.objects.Sch_Profile
	 */
	 public static ims.scheduling.vo.Sch_ProfileGenericVo insert(DomainObjectMap map, ims.scheduling.vo.Sch_ProfileGenericVo valueObject, ims.scheduling.domain.objects.Sch_Profile domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Sch_Profile(domainObject.getId());
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
			
		// ProfileSlots
		valueObject.setProfileSlots(ims.scheduling.vo.domain.Profile_SlotGenericVoAssembler.createProfile_SlotGenericVoCollectionFromProfile_Slot(map, domainObject.getProfileSlots()) );
		// DirectoryOfServices
		valueObject.setDirectoryOfServices(ims.scheduling.vo.domain.DirectoryOfServiceVoAssembler.createDirectoryOfServiceVoCollectionFromDirectoryofService(map, domainObject.getDirectoryOfServices()) );
		// TheatreDetails
		valueObject.setTheatreDetails(ims.scheduling.vo.domain.TheatreDetailLiteVoAssembler.createTheatreDetailLiteVoCollectionFromTheatreDetail(map, domainObject.getTheatreDetails()) );
		// isTheatreProfile
		valueObject.setIsTheatreProfile( domainObject.isIsTheatreProfile() );
		// TheatreType
		ims.domain.lookups.LookupInstance instance5 = domainObject.getTheatreType();
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

			ims.scheduling.vo.lookups.TheatreType voLookup5 = new ims.scheduling.vo.lookups.TheatreType(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.scheduling.vo.lookups.TheatreType parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.scheduling.vo.lookups.TheatreType(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setTheatreType(voLookup5);
		}
				// ProfileActivities
		valueObject.setProfileActivities(ims.scheduling.vo.domain.ProfileActivityVoAssembler.createProfileActivityVoCollectionFromProfile_Activity(map, domainObject.getProfileActivities()) );
		// ProfileTheatreSlots
		valueObject.setProfileTheatreSlots(ims.scheduling.vo.domain.ProfileTheatreTCISlotVoAssembler.createProfileTheatreTCISlotVoCollectionFromProfileTheatreTCISlot(map, domainObject.getProfileTheatreSlots()) );
		// SlotType
		ims.domain.lookups.LookupInstance instance8 = domainObject.getSlotType();
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

			ims.scheduling.vo.lookups.SlotType voLookup8 = new ims.scheduling.vo.lookups.SlotType(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.scheduling.vo.lookups.SlotType parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.scheduling.vo.lookups.SlotType(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setSlotType(voLookup8);
		}
				// ParentChildSlots
		valueObject.setParentChildSlots(ims.scheduling.vo.domain.ProfileParentChildSlotVoAssembler.createProfileParentChildSlotVoCollectionFromProfileParentChildSlot(map, domainObject.getParentChildSlots()) );
		// AnaestheticType
		java.util.List listAnaestheticType = domainObject.getAnaestheticType();
		ims.clinical.vo.lookups.AnaestheticTypeCollection AnaestheticType = new ims.clinical.vo.lookups.AnaestheticTypeCollection();
		for(java.util.Iterator iterator = listAnaestheticType.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.clinical.vo.lookups.AnaestheticType voInstance = new ims.clinical.vo.lookups.AnaestheticType(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.clinical.vo.lookups.AnaestheticType parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.clinical.vo.lookups.AnaestheticType(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			AnaestheticType.add(voInstance);
		}
		valueObject.setAnaestheticType( AnaestheticType );
		// SchLocation
		valueObject.setSchLocation(ims.core.vo.domain.LocShortVoAssembler.create(map, domainObject.getSchLocation()) );
		// isFixed
		valueObject.setIsFixed( domainObject.isIsFixed() );
		// isUnderContract
		valueObject.setIsUnderContract( domainObject.isIsUnderContract() );
		// IntervalType
		ims.domain.lookups.LookupInstance instance14 = domainObject.getIntervalType();
		if ( null != instance14 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance14.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance14.getImage().getImageId(), instance14.getImage().getImagePath());
			}
			color = instance14.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.Profile_Interval_Type voLookup14 = new ims.scheduling.vo.lookups.Profile_Interval_Type(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.scheduling.vo.lookups.Profile_Interval_Type parentVoLookup14 = voLookup14;
			ims.domain.lookups.LookupInstance parent14 = instance14.getParent();
			while (parent14 != null)
			{
				if (parent14.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent14.getImage().getImageId(), parent14.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent14.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup14.setParent(new ims.scheduling.vo.lookups.Profile_Interval_Type(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setIntervalType(voLookup14);
		}
				// IntervalSize
		valueObject.setIntervalSize(domainObject.getIntervalSize());
		// isSchMon
		valueObject.setIsSchMon( domainObject.isIsSchMon() );
		// isSchTue
		valueObject.setIsSchTue( domainObject.isIsSchTue() );
		// isSchWed
		valueObject.setIsSchWed( domainObject.isIsSchWed() );
		// isSchThur
		valueObject.setIsSchThur( domainObject.isIsSchThur() );
		// isSchFri
		valueObject.setIsSchFri( domainObject.isIsSchFri() );
		// isSchSat
		valueObject.setIsSchSat( domainObject.isIsSchSat() );
		// isSchSun
		valueObject.setIsSchSun( domainObject.isIsSchSun() );
		// isFirstInstance
		valueObject.setIsFirstInstance( domainObject.isIsFirstInstance() );
		// isSecondInstance
		valueObject.setIsSecondInstance( domainObject.isIsSecondInstance() );
		// isThirdInstance
		valueObject.setIsThirdInstance( domainObject.isIsThirdInstance() );
		// isFourthInstance
		valueObject.setIsFourthInstance( domainObject.isIsFourthInstance() );
		// isFifthInstance
		valueObject.setIsFifthInstance( domainObject.isIsFifthInstance() );
		// MinInt
		valueObject.setMinInt(domainObject.getMinInt());
		// RoundAttTime
		valueObject.setRoundAttTime(domainObject.getRoundAttTime());
		// LastAppInterval
		valueObject.setLastAppInterval(domainObject.getLastAppInterval());
		// StartTm
		String StartTm = domainObject.getStartTm();
		if ( null != StartTm ) 
		{
			valueObject.setStartTm(new ims.framework.utils.Time(StartTm) );
		}
		// EndTm
		String EndTm = domainObject.getEndTm();
		if ( null != EndTm ) 
		{
			valueObject.setEndTm(new ims.framework.utils.Time(EndTm) );
		}
		// PASClinic
		ims.domain.lookups.LookupInstance instance33 = domainObject.getPASClinic();
		if ( null != instance33 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance33.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance33.getImage().getImageId(), instance33.getImage().getImagePath());
			}
			color = instance33.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.SchedPASClinic voLookup33 = new ims.scheduling.vo.lookups.SchedPASClinic(instance33.getId(),instance33.getText(), instance33.isActive(), null, img, color);
			ims.scheduling.vo.lookups.SchedPASClinic parentVoLookup33 = voLookup33;
			ims.domain.lookups.LookupInstance parent33 = instance33.getParent();
			while (parent33 != null)
			{
				if (parent33.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent33.getImage().getImageId(), parent33.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent33.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup33.setParent(new ims.scheduling.vo.lookups.SchedPASClinic(parent33.getId(),parent33.getText(), parent33.isActive(), null, img, color));
				parentVoLookup33 = parentVoLookup33.getParent();
								parent33 = parent33.getParent();
			}			
			valueObject.setPASClinic(voLookup33);
		}
				// MaxNoAppts
		valueObject.setMaxNoAppts(domainObject.getMaxNoAppts());
		// BookingRights
		valueObject.setBookingRights(ims.scheduling.vo.domain.Profile_BookRightsVoAssembler.createProfile_BookRightsVoCollectionFromProfile_BookingRight(map, domainObject.getBookingRights()) );
		// ListOwners
		valueObject.setListOwners(ims.scheduling.vo.domain.Profile_ListOwnerVoAssembler.createProfile_ListOwnerVoCollectionFromProfile_ListOwner(map, domainObject.getListOwners()) );
		// ExclusionDates
		valueObject.setExclusionDates(ims.scheduling.vo.domain.Profile_Exc_DateVoAssembler.createProfile_Exc_DateVoCollectionFromProfile_Exc_Date(map, domainObject.getExclusionDates()) );
		// ExclusionTimes
		valueObject.setExclusionTimes(ims.scheduling.vo.domain.Profile_Exc_TimeVoAssembler.createProfile_Exc_TimeVoCollectionFromProfile_Exc_Time(map, domainObject.getExclusionTimes()) );
		// ConsMediaType
		ims.domain.lookups.LookupInstance instance39 = domainObject.getConsMediaType();
		if ( null != instance39 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance39.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance39.getImage().getImageId(), instance39.getImage().getImagePath());
			}
			color = instance39.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.ConsultationMediaType voLookup39 = new ims.scheduling.vo.lookups.ConsultationMediaType(instance39.getId(),instance39.getText(), instance39.isActive(), null, img, color);
			ims.scheduling.vo.lookups.ConsultationMediaType parentVoLookup39 = voLookup39;
			ims.domain.lookups.LookupInstance parent39 = instance39.getParent();
			while (parent39 != null)
			{
				if (parent39.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent39.getImage().getImageId(), parent39.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent39.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup39.setParent(new ims.scheduling.vo.lookups.ConsultationMediaType(parent39.getId(),parent39.getText(), parent39.isActive(), null, img, color));
				parentVoLookup39 = parentVoLookup39.getParent();
								parent39 = parent39.getParent();
			}			
			valueObject.setConsMediaType(voLookup39);
		}
				// Description
		valueObject.setDescription(domainObject.getDescription());
		// PrfCategory
		ims.domain.lookups.LookupInstance instance41 = domainObject.getPrfCategory();
		if ( null != instance41 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance41.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance41.getImage().getImageId(), instance41.getImage().getImagePath());
			}
			color = instance41.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.Sched_Prfile_Cat voLookup41 = new ims.scheduling.vo.lookups.Sched_Prfile_Cat(instance41.getId(),instance41.getText(), instance41.isActive(), null, img, color);
			ims.scheduling.vo.lookups.Sched_Prfile_Cat parentVoLookup41 = voLookup41;
			ims.domain.lookups.LookupInstance parent41 = instance41.getParent();
			while (parent41 != null)
			{
				if (parent41.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent41.getImage().getImageId(), parent41.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent41.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup41.setParent(new ims.scheduling.vo.lookups.Sched_Prfile_Cat(parent41.getId(),parent41.getText(), parent41.isActive(), null, img, color));
				parentVoLookup41 = parentVoLookup41.getParent();
								parent41 = parent41.getParent();
			}			
			valueObject.setPrfCategory(voLookup41);
		}
				// Prftype
		ims.domain.lookups.LookupInstance instance42 = domainObject.getPrftype();
		if ( null != instance42 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance42.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance42.getImage().getImageId(), instance42.getImage().getImagePath());
			}
			color = instance42.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.Sched_Profile_Type voLookup42 = new ims.scheduling.vo.lookups.Sched_Profile_Type(instance42.getId(),instance42.getText(), instance42.isActive(), null, img, color);
			ims.scheduling.vo.lookups.Sched_Profile_Type parentVoLookup42 = voLookup42;
			ims.domain.lookups.LookupInstance parent42 = instance42.getParent();
			while (parent42 != null)
			{
				if (parent42.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent42.getImage().getImageId(), parent42.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent42.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup42.setParent(new ims.scheduling.vo.lookups.Sched_Profile_Type(parent42.getId(),parent42.getText(), parent42.isActive(), null, img, color));
				parentVoLookup42 = parentVoLookup42.getParent();
								parent42 = parent42.getParent();
			}			
			valueObject.setPrftype(voLookup42);
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
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// Service
		valueObject.setService(ims.core.vo.domain.ServiceShortVoAssembler.create(map, domainObject.getService()) );
		// LastActualGenDate
		java.util.Date LastActualGenDate = domainObject.getLastActualGenDate();
		if ( null != LastActualGenDate ) 
		{
			valueObject.setLastActualGenDate(new ims.framework.utils.Date(LastActualGenDate) );
		}
		// LastGenDate
		java.util.Date LastGenDate = domainObject.getLastGenDate();
		if ( null != LastGenDate ) 
		{
			valueObject.setLastGenDate(new ims.framework.utils.Date(LastGenDate) );
		}
		// Name
		valueObject.setName(domainObject.getName());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.Sch_Profile extractSch_Profile(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Sch_ProfileGenericVo valueObject) 
	{
		return 	extractSch_Profile(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.Sch_Profile extractSch_Profile(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Sch_ProfileGenericVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Sch_Profile();
		ims.scheduling.domain.objects.Sch_Profile domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.scheduling.domain.objects.Sch_Profile)domMap.get(valueObject);
			}
			// ims.scheduling.vo.Sch_ProfileGenericVo ID_Sch_Profile field is unknown
			domainObject = new ims.scheduling.domain.objects.Sch_Profile();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Sch_Profile());
			if (domMap.get(key) != null)
			{
				return (ims.scheduling.domain.objects.Sch_Profile)domMap.get(key);
			}
			domainObject = (ims.scheduling.domain.objects.Sch_Profile) domainFactory.getDomainObject(ims.scheduling.domain.objects.Sch_Profile.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Sch_Profile());

		domainObject.setProfileSlots(ims.scheduling.vo.domain.Profile_SlotGenericVoAssembler.extractProfile_SlotSet(domainFactory, valueObject.getProfileSlots(), domainObject.getProfileSlots(), domMap));		
		domainObject.setDirectoryOfServices(ims.scheduling.vo.domain.DirectoryOfServiceVoAssembler.extractDirectoryofServiceSet(domainFactory, valueObject.getDirectoryOfServices(), domainObject.getDirectoryOfServices(), domMap));		
		domainObject.setTheatreDetails(ims.scheduling.vo.domain.TheatreDetailLiteVoAssembler.extractTheatreDetailSet(domainFactory, valueObject.getTheatreDetails(), domainObject.getTheatreDetails(), domMap));		
		domainObject.setIsTheatreProfile(valueObject.getIsTheatreProfile());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getTheatreType() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getTheatreType().getID());
		}
		domainObject.setTheatreType(value5);
		domainObject.setProfileActivities(ims.scheduling.vo.domain.ProfileActivityVoAssembler.extractProfile_ActivitySet(domainFactory, valueObject.getProfileActivities(), domainObject.getProfileActivities(), domMap));		
		domainObject.setProfileTheatreSlots(ims.scheduling.vo.domain.ProfileTheatreTCISlotVoAssembler.extractProfileTheatreTCISlotSet(domainFactory, valueObject.getProfileTheatreSlots(), domainObject.getProfileTheatreSlots(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getSlotType() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getSlotType().getID());
		}
		domainObject.setSlotType(value8);
		domainObject.setParentChildSlots(ims.scheduling.vo.domain.ProfileParentChildSlotVoAssembler.extractProfileParentChildSlotSet(domainFactory, valueObject.getParentChildSlots(), domainObject.getParentChildSlots(), domMap));		
		ims.clinical.vo.lookups.AnaestheticTypeCollection collection10 =
	valueObject.getAnaestheticType();
	    java.util.List domainAnaestheticType = domainObject.getAnaestheticType();;			
	    int collection10Size=0;
		if (collection10 == null)
		{
			domainAnaestheticType = new java.util.ArrayList(0);
		}
		else
		{
			collection10Size = collection10.size();
		}
		
		for(int i=0; i<collection10Size; i++) 
		{
			int instanceId = collection10.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainAnaestheticType.indexOf(dom);
			if (domIdx == -1)
			{
				domainAnaestheticType.add(i, dom);
			}
			else if (i != domIdx && i < domainAnaestheticType.size())
			{
				Object tmp = domainAnaestheticType.get(i);
				domainAnaestheticType.set(i, domainAnaestheticType.get(domIdx));
				domainAnaestheticType.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j10 = domainAnaestheticType.size();
		while (j10 > collection10Size)
		{
			domainAnaestheticType.remove(j10-1);
			j10 = domainAnaestheticType.size();
		}

		domainObject.setAnaestheticType(domainAnaestheticType);		
		domainObject.setSchLocation(ims.core.vo.domain.LocShortVoAssembler.extractLocation(domainFactory, valueObject.getSchLocation(), domMap));
		domainObject.setIsFixed(valueObject.getIsFixed());
		domainObject.setIsUnderContract(valueObject.getIsUnderContract());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getIntervalType() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getIntervalType().getID());
		}
		domainObject.setIntervalType(value14);
		domainObject.setIntervalSize(valueObject.getIntervalSize());
		domainObject.setIsSchMon(valueObject.getIsSchMon());
		domainObject.setIsSchTue(valueObject.getIsSchTue());
		domainObject.setIsSchWed(valueObject.getIsSchWed());
		domainObject.setIsSchThur(valueObject.getIsSchThur());
		domainObject.setIsSchFri(valueObject.getIsSchFri());
		domainObject.setIsSchSat(valueObject.getIsSchSat());
		domainObject.setIsSchSun(valueObject.getIsSchSun());
		domainObject.setIsFirstInstance(valueObject.getIsFirstInstance());
		domainObject.setIsSecondInstance(valueObject.getIsSecondInstance());
		domainObject.setIsThirdInstance(valueObject.getIsThirdInstance());
		domainObject.setIsFourthInstance(valueObject.getIsFourthInstance());
		domainObject.setIsFifthInstance(valueObject.getIsFifthInstance());
		domainObject.setMinInt(valueObject.getMinInt());
		domainObject.setRoundAttTime(valueObject.getRoundAttTime());
		domainObject.setLastAppInterval(valueObject.getLastAppInterval());
		ims.framework.utils.Time time31 = valueObject.getStartTm();
		String value31 = null;
		if ( time31 != null ) 
		{
			value31 = time31.toString();
		}
		domainObject.setStartTm(value31);
		ims.framework.utils.Time time32 = valueObject.getEndTm();
		String value32 = null;
		if ( time32 != null ) 
		{
			value32 = time32.toString();
		}
		domainObject.setEndTm(value32);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value33 = null;
		if ( null != valueObject.getPASClinic() ) 
		{
			value33 =
				domainFactory.getLookupInstance(valueObject.getPASClinic().getID());
		}
		domainObject.setPASClinic(value33);
		domainObject.setMaxNoAppts(valueObject.getMaxNoAppts());
		domainObject.setBookingRights(ims.scheduling.vo.domain.Profile_BookRightsVoAssembler.extractProfile_BookingRightSet(domainFactory, valueObject.getBookingRights(), domainObject.getBookingRights(), domMap));		
		domainObject.setListOwners(ims.scheduling.vo.domain.Profile_ListOwnerVoAssembler.extractProfile_ListOwnerSet(domainFactory, valueObject.getListOwners(), domainObject.getListOwners(), domMap));		
		domainObject.setExclusionDates(ims.scheduling.vo.domain.Profile_Exc_DateVoAssembler.extractProfile_Exc_DateSet(domainFactory, valueObject.getExclusionDates(), domainObject.getExclusionDates(), domMap));		
		domainObject.setExclusionTimes(ims.scheduling.vo.domain.Profile_Exc_TimeVoAssembler.extractProfile_Exc_TimeSet(domainFactory, valueObject.getExclusionTimes(), domainObject.getExclusionTimes(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value39 = null;
		if ( null != valueObject.getConsMediaType() ) 
		{
			value39 =
				domainFactory.getLookupInstance(valueObject.getConsMediaType().getID());
		}
		domainObject.setConsMediaType(value39);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDescription() != null && valueObject.getDescription().equals(""))
		{
			valueObject.setDescription(null);
		}
		domainObject.setDescription(valueObject.getDescription());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value41 = null;
		if ( null != valueObject.getPrfCategory() ) 
		{
			value41 =
				domainFactory.getLookupInstance(valueObject.getPrfCategory().getID());
		}
		domainObject.setPrfCategory(value41);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value42 = null;
		if ( null != valueObject.getPrftype() ) 
		{
			value42 =
				domainFactory.getLookupInstance(valueObject.getPrftype().getID());
		}
		domainObject.setPrftype(value42);
		java.util.Date value43 = null;
		ims.framework.utils.Date date43 = valueObject.getEffFrm();		
		if ( date43 != null ) 
		{
			value43 = date43.getDate();
		}
		domainObject.setEffFrm(value43);
		java.util.Date value44 = null;
		ims.framework.utils.Date date44 = valueObject.getEffTo();		
		if ( date44 != null ) 
		{
			value44 = date44.getDate();
		}
		domainObject.setEffTo(value44);
		domainObject.setIsActive(valueObject.getIsActive());
		domainObject.setService(ims.core.vo.domain.ServiceShortVoAssembler.extractService(domainFactory, valueObject.getService(), domMap));
		java.util.Date value47 = null;
		ims.framework.utils.Date date47 = valueObject.getLastActualGenDate();		
		if ( date47 != null ) 
		{
			value47 = date47.getDate();
		}
		domainObject.setLastActualGenDate(value47);
		java.util.Date value48 = null;
		ims.framework.utils.Date date48 = valueObject.getLastGenDate();		
		if ( date48 != null ) 
		{
			value48 = date48.getDate();
		}
		domainObject.setLastGenDate(value48);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());

		return domainObject;
	}

}
