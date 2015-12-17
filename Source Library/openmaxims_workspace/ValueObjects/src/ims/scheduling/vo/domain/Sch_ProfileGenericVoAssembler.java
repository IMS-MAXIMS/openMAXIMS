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
 * Generated on 12/10/2015, 13:25
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
		// ListType
		valueObjectDest.setListType(valueObjectSrc.getListType());
		// ResponsibleHCP
		valueObjectDest.setResponsibleHCP(valueObjectSrc.getResponsibleHCP());
		// Function
		valueObjectDest.setFunction(valueObjectSrc.getFunction());
		// hasChooseBookActivity
		valueObjectDest.setHasChooseBookActivity(valueObjectSrc.getHasChooseBookActivity());
		// ProfileType
		valueObjectDest.setProfileType(valueObjectSrc.getProfileType());
		// isOtherHospital
		valueObjectDest.setIsOtherHospital(valueObjectSrc.getIsOtherHospital());
		// OtherHospital
		valueObjectDest.setOtherHospital(valueObjectSrc.getOtherHospital());
		// SchLocation
		valueObjectDest.setSchLocation(valueObjectSrc.getSchLocation());
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
		// CaseNoteFolderLocation
		valueObjectDest.setCaseNoteFolderLocation(valueObjectSrc.getCaseNoteFolderLocation());
		// caseNoteFolderNotRequired
		valueObjectDest.setCaseNoteFolderNotRequired(valueObjectSrc.getCaseNoteFolderNotRequired());
		// Hospital
		valueObjectDest.setHospital(valueObjectSrc.getHospital());
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
		// AutoGeneratePeriod
		valueObjectDest.setAutoGeneratePeriod(valueObjectSrc.getAutoGeneratePeriod());
		// ReadyToGenerate
		valueObjectDest.setReadyToGenerate(valueObjectSrc.getReadyToGenerate());
		// isFixed
		valueObjectDest.setIsFixed(valueObjectSrc.getIsFixed());
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
		// TheatreType
		ims.domain.lookups.LookupInstance instance4 = domainObject.getTheatreType();
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

			ims.scheduling.vo.lookups.TheatreType voLookup4 = new ims.scheduling.vo.lookups.TheatreType(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.scheduling.vo.lookups.TheatreType parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.scheduling.vo.lookups.TheatreType(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setTheatreType(voLookup4);
		}
				// ProfileActivities
		valueObject.setProfileActivities(ims.scheduling.vo.domain.ProfileActivityVoAssembler.createProfileActivityVoCollectionFromProfile_Activity(map, domainObject.getProfileActivities()) );
		// ProfileTheatreSlots
		valueObject.setProfileTheatreSlots(ims.scheduling.vo.domain.ProfileTheatreTCISlotVoAssembler.createProfileTheatreTCISlotVoCollectionFromProfileTheatreTCISlot(map, domainObject.getProfileTheatreSlots()) );
		// SlotType
		ims.domain.lookups.LookupInstance instance7 = domainObject.getSlotType();
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

			ims.scheduling.vo.lookups.SlotType voLookup7 = new ims.scheduling.vo.lookups.SlotType(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.scheduling.vo.lookups.SlotType parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.scheduling.vo.lookups.SlotType(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setSlotType(voLookup7);
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
		// ListType
		ims.domain.lookups.LookupInstance instance10 = domainObject.getListType();
		if ( null != instance10 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance10.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance10.getImage().getImageId(), instance10.getImage().getImagePath());
			}
			color = instance10.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.ProfileListType voLookup10 = new ims.scheduling.vo.lookups.ProfileListType(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.scheduling.vo.lookups.ProfileListType parentVoLookup10 = voLookup10;
			ims.domain.lookups.LookupInstance parent10 = instance10.getParent();
			while (parent10 != null)
			{
				if (parent10.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent10.getImage().getImageId(), parent10.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent10.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup10.setParent(new ims.scheduling.vo.lookups.ProfileListType(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setListType(voLookup10);
		}
				// ResponsibleHCP
		valueObject.setResponsibleHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getResponsibleHCP()) );
		// Function
		java.util.List listFunction = domainObject.getFunction();
		ims.core.vo.lookups.ServiceFunctionCollection Function = new ims.core.vo.lookups.ServiceFunctionCollection();
		for(java.util.Iterator iterator = listFunction.iterator(); iterator.hasNext(); ) 
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
			ims.core.vo.lookups.ServiceFunction voInstance = new ims.core.vo.lookups.ServiceFunction(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.core.vo.lookups.ServiceFunction parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.core.vo.lookups.ServiceFunction(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			Function.add(voInstance);
		}
		valueObject.setFunction( Function );
		// hasChooseBookActivity
		valueObject.setHasChooseBookActivity( domainObject.isHasChooseBookActivity() );
		// ProfileType
		ims.domain.lookups.LookupInstance instance14 = domainObject.getProfileType();
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

			ims.scheduling.vo.lookups.SchProfileType voLookup14 = new ims.scheduling.vo.lookups.SchProfileType(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.scheduling.vo.lookups.SchProfileType parentVoLookup14 = voLookup14;
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
								parentVoLookup14.setParent(new ims.scheduling.vo.lookups.SchProfileType(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setProfileType(voLookup14);
		}
				// isOtherHospital
		valueObject.setIsOtherHospital( domainObject.isIsOtherHospital() );
		// OtherHospital
		valueObject.setOtherHospital(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getOtherHospital()) );
		// SchLocation
		valueObject.setSchLocation(ims.core.vo.domain.LocShortVoAssembler.create(map, domainObject.getSchLocation()) );
		// isUnderContract
		valueObject.setIsUnderContract( domainObject.isIsUnderContract() );
		// IntervalType
		ims.domain.lookups.LookupInstance instance19 = domainObject.getIntervalType();
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

			ims.scheduling.vo.lookups.Profile_Interval_Type voLookup19 = new ims.scheduling.vo.lookups.Profile_Interval_Type(instance19.getId(),instance19.getText(), instance19.isActive(), null, img, color);
			ims.scheduling.vo.lookups.Profile_Interval_Type parentVoLookup19 = voLookup19;
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
								parentVoLookup19.setParent(new ims.scheduling.vo.lookups.Profile_Interval_Type(parent19.getId(),parent19.getText(), parent19.isActive(), null, img, color));
				parentVoLookup19 = parentVoLookup19.getParent();
								parent19 = parent19.getParent();
			}			
			valueObject.setIntervalType(voLookup19);
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
		ims.domain.lookups.LookupInstance instance38 = domainObject.getPASClinic();
		if ( null != instance38 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance38.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance38.getImage().getImageId(), instance38.getImage().getImagePath());
			}
			color = instance38.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.SchedPASClinic voLookup38 = new ims.scheduling.vo.lookups.SchedPASClinic(instance38.getId(),instance38.getText(), instance38.isActive(), null, img, color);
			ims.scheduling.vo.lookups.SchedPASClinic parentVoLookup38 = voLookup38;
			ims.domain.lookups.LookupInstance parent38 = instance38.getParent();
			while (parent38 != null)
			{
				if (parent38.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent38.getImage().getImageId(), parent38.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent38.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup38.setParent(new ims.scheduling.vo.lookups.SchedPASClinic(parent38.getId(),parent38.getText(), parent38.isActive(), null, img, color));
				parentVoLookup38 = parentVoLookup38.getParent();
								parent38 = parent38.getParent();
			}			
			valueObject.setPASClinic(voLookup38);
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
		ims.domain.lookups.LookupInstance instance44 = domainObject.getConsMediaType();
		if ( null != instance44 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance44.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance44.getImage().getImageId(), instance44.getImage().getImagePath());
			}
			color = instance44.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.ConsultationMediaType voLookup44 = new ims.scheduling.vo.lookups.ConsultationMediaType(instance44.getId(),instance44.getText(), instance44.isActive(), null, img, color);
			ims.scheduling.vo.lookups.ConsultationMediaType parentVoLookup44 = voLookup44;
			ims.domain.lookups.LookupInstance parent44 = instance44.getParent();
			while (parent44 != null)
			{
				if (parent44.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent44.getImage().getImageId(), parent44.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent44.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup44.setParent(new ims.scheduling.vo.lookups.ConsultationMediaType(parent44.getId(),parent44.getText(), parent44.isActive(), null, img, color));
				parentVoLookup44 = parentVoLookup44.getParent();
								parent44 = parent44.getParent();
			}			
			valueObject.setConsMediaType(voLookup44);
		}
				// CaseNoteFolderLocation
		valueObject.setCaseNoteFolderLocation(ims.core.vo.domain.LocShortVoAssembler.create(map, domainObject.getCaseNoteFolderLocation()) );
		// caseNoteFolderNotRequired
		valueObject.setCaseNoteFolderNotRequired( domainObject.isCaseNoteFolderNotRequired() );
		// Hospital
		valueObject.setHospital(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getHospital()) );
		// Description
		valueObject.setDescription(domainObject.getDescription());
		// PrfCategory
		ims.domain.lookups.LookupInstance instance49 = domainObject.getPrfCategory();
		if ( null != instance49 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance49.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance49.getImage().getImageId(), instance49.getImage().getImagePath());
			}
			color = instance49.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.Sched_Prfile_Cat voLookup49 = new ims.scheduling.vo.lookups.Sched_Prfile_Cat(instance49.getId(),instance49.getText(), instance49.isActive(), null, img, color);
			ims.scheduling.vo.lookups.Sched_Prfile_Cat parentVoLookup49 = voLookup49;
			ims.domain.lookups.LookupInstance parent49 = instance49.getParent();
			while (parent49 != null)
			{
				if (parent49.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent49.getImage().getImageId(), parent49.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent49.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup49.setParent(new ims.scheduling.vo.lookups.Sched_Prfile_Cat(parent49.getId(),parent49.getText(), parent49.isActive(), null, img, color));
				parentVoLookup49 = parentVoLookup49.getParent();
								parent49 = parent49.getParent();
			}			
			valueObject.setPrfCategory(voLookup49);
		}
				// Prftype
		ims.domain.lookups.LookupInstance instance50 = domainObject.getPrftype();
		if ( null != instance50 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance50.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance50.getImage().getImageId(), instance50.getImage().getImagePath());
			}
			color = instance50.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.Sched_Profile_Type voLookup50 = new ims.scheduling.vo.lookups.Sched_Profile_Type(instance50.getId(),instance50.getText(), instance50.isActive(), null, img, color);
			ims.scheduling.vo.lookups.Sched_Profile_Type parentVoLookup50 = voLookup50;
			ims.domain.lookups.LookupInstance parent50 = instance50.getParent();
			while (parent50 != null)
			{
				if (parent50.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent50.getImage().getImageId(), parent50.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent50.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup50.setParent(new ims.scheduling.vo.lookups.Sched_Profile_Type(parent50.getId(),parent50.getText(), parent50.isActive(), null, img, color));
				parentVoLookup50 = parentVoLookup50.getParent();
								parent50 = parent50.getParent();
			}			
			valueObject.setPrftype(voLookup50);
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
		// AutoGeneratePeriod
		valueObject.setAutoGeneratePeriod(domainObject.getAutoGeneratePeriod());
		// ReadyToGenerate
		valueObject.setReadyToGenerate( domainObject.isReadyToGenerate() );
		// isFixed
		valueObject.setIsFixed( domainObject.isIsFixed() );
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
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getTheatreType() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getTheatreType().getID());
		}
		domainObject.setTheatreType(value4);
		domainObject.setProfileActivities(ims.scheduling.vo.domain.ProfileActivityVoAssembler.extractProfile_ActivitySet(domainFactory, valueObject.getProfileActivities(), domainObject.getProfileActivities(), domMap));		
		domainObject.setProfileTheatreSlots(ims.scheduling.vo.domain.ProfileTheatreTCISlotVoAssembler.extractProfileTheatreTCISlotSet(domainFactory, valueObject.getProfileTheatreSlots(), domainObject.getProfileTheatreSlots(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getSlotType() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getSlotType().getID());
		}
		domainObject.setSlotType(value7);
		domainObject.setParentChildSlots(ims.scheduling.vo.domain.ProfileParentChildSlotVoAssembler.extractProfileParentChildSlotSet(domainFactory, valueObject.getParentChildSlots(), domainObject.getParentChildSlots(), domMap));		
		ims.clinical.vo.lookups.AnaestheticTypeCollection collection9 =
	valueObject.getAnaestheticType();
	    java.util.List domainAnaestheticType = domainObject.getAnaestheticType();;			
	    int collection9Size=0;
		if (collection9 == null)
		{
			domainAnaestheticType = new java.util.ArrayList(0);
		}
		else
		{
			collection9Size = collection9.size();
		}
		
		for(int i=0; i<collection9Size; i++) 
		{
			int instanceId = collection9.get(i).getID();
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
		int j9 = domainAnaestheticType.size();
		while (j9 > collection9Size)
		{
			domainAnaestheticType.remove(j9-1);
			j9 = domainAnaestheticType.size();
		}

		domainObject.setAnaestheticType(domainAnaestheticType);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getListType() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getListType().getID());
		}
		domainObject.setListType(value10);
		domainObject.setResponsibleHCP(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getResponsibleHCP(), domMap));
		ims.core.vo.lookups.ServiceFunctionCollection collection12 =
	valueObject.getFunction();
	    java.util.List domainFunction = domainObject.getFunction();;			
	    int collection12Size=0;
		if (collection12 == null)
		{
			domainFunction = new java.util.ArrayList(0);
		}
		else
		{
			collection12Size = collection12.size();
		}
		
		for(int i=0; i<collection12Size; i++) 
		{
			int instanceId = collection12.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainFunction.indexOf(dom);
			if (domIdx == -1)
			{
				domainFunction.add(i, dom);
			}
			else if (i != domIdx && i < domainFunction.size())
			{
				Object tmp = domainFunction.get(i);
				domainFunction.set(i, domainFunction.get(domIdx));
				domainFunction.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j12 = domainFunction.size();
		while (j12 > collection12Size)
		{
			domainFunction.remove(j12-1);
			j12 = domainFunction.size();
		}

		domainObject.setFunction(domainFunction);		
		domainObject.setHasChooseBookActivity(valueObject.getHasChooseBookActivity());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getProfileType() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getProfileType().getID());
		}
		domainObject.setProfileType(value14);
		domainObject.setIsOtherHospital(valueObject.getIsOtherHospital());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value16 = null;
		if ( null != valueObject.getOtherHospital() ) 
		{
			if (valueObject.getOtherHospital().getBoId() == null)
			{
				if (domMap.get(valueObject.getOtherHospital()) != null)
				{
					value16 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getOtherHospital());
				}
			}
			else
			{
				value16 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getOtherHospital().getBoId());
			}
		}
		domainObject.setOtherHospital(value16);
		domainObject.setSchLocation(ims.core.vo.domain.LocShortVoAssembler.extractLocation(domainFactory, valueObject.getSchLocation(), domMap));
		domainObject.setIsUnderContract(valueObject.getIsUnderContract());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value19 = null;
		if ( null != valueObject.getIntervalType() ) 
		{
			value19 =
				domainFactory.getLookupInstance(valueObject.getIntervalType().getID());
		}
		domainObject.setIntervalType(value19);
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
		ims.framework.utils.Time time36 = valueObject.getStartTm();
		String value36 = null;
		if ( time36 != null ) 
		{
			value36 = time36.toString();
		}
		domainObject.setStartTm(value36);
		ims.framework.utils.Time time37 = valueObject.getEndTm();
		String value37 = null;
		if ( time37 != null ) 
		{
			value37 = time37.toString();
		}
		domainObject.setEndTm(value37);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value38 = null;
		if ( null != valueObject.getPASClinic() ) 
		{
			value38 =
				domainFactory.getLookupInstance(valueObject.getPASClinic().getID());
		}
		domainObject.setPASClinic(value38);
		domainObject.setMaxNoAppts(valueObject.getMaxNoAppts());
		domainObject.setBookingRights(ims.scheduling.vo.domain.Profile_BookRightsVoAssembler.extractProfile_BookingRightSet(domainFactory, valueObject.getBookingRights(), domainObject.getBookingRights(), domMap));		
		domainObject.setListOwners(ims.scheduling.vo.domain.Profile_ListOwnerVoAssembler.extractProfile_ListOwnerSet(domainFactory, valueObject.getListOwners(), domainObject.getListOwners(), domMap));		
		domainObject.setExclusionDates(ims.scheduling.vo.domain.Profile_Exc_DateVoAssembler.extractProfile_Exc_DateSet(domainFactory, valueObject.getExclusionDates(), domainObject.getExclusionDates(), domMap));		
		domainObject.setExclusionTimes(ims.scheduling.vo.domain.Profile_Exc_TimeVoAssembler.extractProfile_Exc_TimeSet(domainFactory, valueObject.getExclusionTimes(), domainObject.getExclusionTimes(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value44 = null;
		if ( null != valueObject.getConsMediaType() ) 
		{
			value44 =
				domainFactory.getLookupInstance(valueObject.getConsMediaType().getID());
		}
		domainObject.setConsMediaType(value44);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value45 = null;
		if ( null != valueObject.getCaseNoteFolderLocation() ) 
		{
			if (valueObject.getCaseNoteFolderLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getCaseNoteFolderLocation()) != null)
				{
					value45 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getCaseNoteFolderLocation());
				}
			}
			else
			{
				value45 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getCaseNoteFolderLocation().getBoId());
			}
		}
		domainObject.setCaseNoteFolderLocation(value45);
		domainObject.setCaseNoteFolderNotRequired(valueObject.getCaseNoteFolderNotRequired());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value47 = null;
		if ( null != valueObject.getHospital() ) 
		{
			if (valueObject.getHospital().getBoId() == null)
			{
				if (domMap.get(valueObject.getHospital()) != null)
				{
					value47 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getHospital());
				}
			}
			else
			{
				value47 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getHospital().getBoId());
			}
		}
		domainObject.setHospital(value47);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDescription() != null && valueObject.getDescription().equals(""))
		{
			valueObject.setDescription(null);
		}
		domainObject.setDescription(valueObject.getDescription());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value49 = null;
		if ( null != valueObject.getPrfCategory() ) 
		{
			value49 =
				domainFactory.getLookupInstance(valueObject.getPrfCategory().getID());
		}
		domainObject.setPrfCategory(value49);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value50 = null;
		if ( null != valueObject.getPrftype() ) 
		{
			value50 =
				domainFactory.getLookupInstance(valueObject.getPrftype().getID());
		}
		domainObject.setPrftype(value50);
		java.util.Date value51 = null;
		ims.framework.utils.Date date51 = valueObject.getEffFrm();		
		if ( date51 != null ) 
		{
			value51 = date51.getDate();
		}
		domainObject.setEffFrm(value51);
		java.util.Date value52 = null;
		ims.framework.utils.Date date52 = valueObject.getEffTo();		
		if ( date52 != null ) 
		{
			value52 = date52.getDate();
		}
		domainObject.setEffTo(value52);
		domainObject.setIsActive(valueObject.getIsActive());
		domainObject.setService(ims.core.vo.domain.ServiceShortVoAssembler.extractService(domainFactory, valueObject.getService(), domMap));
		java.util.Date value55 = null;
		ims.framework.utils.Date date55 = valueObject.getLastActualGenDate();		
		if ( date55 != null ) 
		{
			value55 = date55.getDate();
		}
		domainObject.setLastActualGenDate(value55);
		java.util.Date value56 = null;
		ims.framework.utils.Date date56 = valueObject.getLastGenDate();		
		if ( date56 != null ) 
		{
			value56 = date56.getDate();
		}
		domainObject.setLastGenDate(value56);
		domainObject.setAutoGeneratePeriod(valueObject.getAutoGeneratePeriod());
		domainObject.setReadyToGenerate(valueObject.getReadyToGenerate());
		domainObject.setIsFixed(valueObject.getIsFixed());
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
