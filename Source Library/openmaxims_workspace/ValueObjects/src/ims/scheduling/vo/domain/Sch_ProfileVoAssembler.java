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
 * @author Kevin O'Carroll
 */
public class Sch_ProfileVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.Sch_ProfileVo copy(ims.scheduling.vo.Sch_ProfileVo valueObjectDest, ims.scheduling.vo.Sch_ProfileVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Sch_Profile(valueObjectSrc.getID_Sch_Profile());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
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
 	 * If more than one call to an Assembler is made then #createSch_ProfileVoCollectionFromSch_Profile(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Sch_Profile objects.
	 */
	public static ims.scheduling.vo.Sch_ProfileVoCollection createSch_ProfileVoCollectionFromSch_Profile(java.util.Set domainObjectSet)	
	{
		return createSch_ProfileVoCollectionFromSch_Profile(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Sch_Profile objects.
	 */
	public static ims.scheduling.vo.Sch_ProfileVoCollection createSch_ProfileVoCollectionFromSch_Profile(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.Sch_ProfileVoCollection voList = new ims.scheduling.vo.Sch_ProfileVoCollection();
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
			ims.scheduling.vo.Sch_ProfileVo vo = create(map, domainObject);
			
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
	public static ims.scheduling.vo.Sch_ProfileVoCollection createSch_ProfileVoCollectionFromSch_Profile(java.util.List domainObjectList) 
	{
		return createSch_ProfileVoCollectionFromSch_Profile(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Sch_Profile objects.
	 */
	public static ims.scheduling.vo.Sch_ProfileVoCollection createSch_ProfileVoCollectionFromSch_Profile(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.Sch_ProfileVoCollection voList = new ims.scheduling.vo.Sch_ProfileVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.Sch_Profile domainObject = (ims.scheduling.domain.objects.Sch_Profile) domainObjectList.get(i);
			ims.scheduling.vo.Sch_ProfileVo vo = create(map, domainObject);

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
	 public static java.util.Set extractSch_ProfileSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Sch_ProfileVoCollection voCollection) 
	 {
	 	return extractSch_ProfileSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSch_ProfileSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Sch_ProfileVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.Sch_ProfileVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Sch_Profile domainObject = Sch_ProfileVoAssembler.extractSch_Profile(domainFactory, vo, domMap);

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
	 public static java.util.List extractSch_ProfileList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Sch_ProfileVoCollection voCollection) 
	 {
	 	return extractSch_ProfileList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSch_ProfileList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Sch_ProfileVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.Sch_ProfileVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Sch_Profile domainObject = Sch_ProfileVoAssembler.extractSch_Profile(domainFactory, vo, domMap);

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
	 public static ims.scheduling.vo.Sch_ProfileVo create(ims.scheduling.domain.objects.Sch_Profile domainObject) 
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
	  public static ims.scheduling.vo.Sch_ProfileVo create(DomainObjectMap map, ims.scheduling.domain.objects.Sch_Profile domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.Sch_ProfileVo valueObject = (ims.scheduling.vo.Sch_ProfileVo) map.getValueObject(domainObject, ims.scheduling.vo.Sch_ProfileVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.Sch_ProfileVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.scheduling.vo.Sch_ProfileVo insert(ims.scheduling.vo.Sch_ProfileVo valueObject, ims.scheduling.domain.objects.Sch_Profile domainObject) 
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
	 public static ims.scheduling.vo.Sch_ProfileVo insert(DomainObjectMap map, ims.scheduling.vo.Sch_ProfileVo valueObject, ims.scheduling.domain.objects.Sch_Profile domainObject) 
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
			
		// SchLocation
		valueObject.setSchLocation(ims.core.vo.domain.LocShortVoAssembler.create(map, domainObject.getSchLocation()) );
		// isUnderContract
		valueObject.setIsUnderContract( domainObject.isIsUnderContract() );
		// IntervalType
		ims.domain.lookups.LookupInstance instance3 = domainObject.getIntervalType();
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

			ims.scheduling.vo.lookups.Profile_Interval_Type voLookup3 = new ims.scheduling.vo.lookups.Profile_Interval_Type(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.scheduling.vo.lookups.Profile_Interval_Type parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.scheduling.vo.lookups.Profile_Interval_Type(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setIntervalType(voLookup3);
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
		ims.domain.lookups.LookupInstance instance22 = domainObject.getPASClinic();
		if ( null != instance22 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance22.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance22.getImage().getImageId(), instance22.getImage().getImagePath());
			}
			color = instance22.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.SchedPASClinic voLookup22 = new ims.scheduling.vo.lookups.SchedPASClinic(instance22.getId(),instance22.getText(), instance22.isActive(), null, img, color);
			ims.scheduling.vo.lookups.SchedPASClinic parentVoLookup22 = voLookup22;
			ims.domain.lookups.LookupInstance parent22 = instance22.getParent();
			while (parent22 != null)
			{
				if (parent22.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent22.getImage().getImageId(), parent22.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent22.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup22.setParent(new ims.scheduling.vo.lookups.SchedPASClinic(parent22.getId(),parent22.getText(), parent22.isActive(), null, img, color));
				parentVoLookup22 = parentVoLookup22.getParent();
								parent22 = parent22.getParent();
			}			
			valueObject.setPASClinic(voLookup22);
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
		ims.domain.lookups.LookupInstance instance28 = domainObject.getConsMediaType();
		if ( null != instance28 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance28.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance28.getImage().getImageId(), instance28.getImage().getImagePath());
			}
			color = instance28.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.ConsultationMediaType voLookup28 = new ims.scheduling.vo.lookups.ConsultationMediaType(instance28.getId(),instance28.getText(), instance28.isActive(), null, img, color);
			ims.scheduling.vo.lookups.ConsultationMediaType parentVoLookup28 = voLookup28;
			ims.domain.lookups.LookupInstance parent28 = instance28.getParent();
			while (parent28 != null)
			{
				if (parent28.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent28.getImage().getImageId(), parent28.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent28.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup28.setParent(new ims.scheduling.vo.lookups.ConsultationMediaType(parent28.getId(),parent28.getText(), parent28.isActive(), null, img, color));
				parentVoLookup28 = parentVoLookup28.getParent();
								parent28 = parent28.getParent();
			}			
			valueObject.setConsMediaType(voLookup28);
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
		ims.domain.lookups.LookupInstance instance33 = domainObject.getPrfCategory();
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

			ims.scheduling.vo.lookups.Sched_Prfile_Cat voLookup33 = new ims.scheduling.vo.lookups.Sched_Prfile_Cat(instance33.getId(),instance33.getText(), instance33.isActive(), null, img, color);
			ims.scheduling.vo.lookups.Sched_Prfile_Cat parentVoLookup33 = voLookup33;
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
								parentVoLookup33.setParent(new ims.scheduling.vo.lookups.Sched_Prfile_Cat(parent33.getId(),parent33.getText(), parent33.isActive(), null, img, color));
				parentVoLookup33 = parentVoLookup33.getParent();
								parent33 = parent33.getParent();
			}			
			valueObject.setPrfCategory(voLookup33);
		}
				// Prftype
		ims.domain.lookups.LookupInstance instance34 = domainObject.getPrftype();
		if ( null != instance34 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance34.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance34.getImage().getImageId(), instance34.getImage().getImagePath());
			}
			color = instance34.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.Sched_Profile_Type voLookup34 = new ims.scheduling.vo.lookups.Sched_Profile_Type(instance34.getId(),instance34.getText(), instance34.isActive(), null, img, color);
			ims.scheduling.vo.lookups.Sched_Profile_Type parentVoLookup34 = voLookup34;
			ims.domain.lookups.LookupInstance parent34 = instance34.getParent();
			while (parent34 != null)
			{
				if (parent34.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent34.getImage().getImageId(), parent34.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent34.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup34.setParent(new ims.scheduling.vo.lookups.Sched_Profile_Type(parent34.getId(),parent34.getText(), parent34.isActive(), null, img, color));
				parentVoLookup34 = parentVoLookup34.getParent();
								parent34 = parent34.getParent();
			}			
			valueObject.setPrftype(voLookup34);
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
	public static ims.scheduling.domain.objects.Sch_Profile extractSch_Profile(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Sch_ProfileVo valueObject) 
	{
		return 	extractSch_Profile(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.Sch_Profile extractSch_Profile(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Sch_ProfileVo valueObject, HashMap domMap) 
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
			// ims.scheduling.vo.Sch_ProfileVo ID_Sch_Profile field is unknown
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

		domainObject.setSchLocation(ims.core.vo.domain.LocShortVoAssembler.extractLocation(domainFactory, valueObject.getSchLocation(), domMap));
		domainObject.setIsUnderContract(valueObject.getIsUnderContract());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getIntervalType() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getIntervalType().getID());
		}
		domainObject.setIntervalType(value3);
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
		ims.framework.utils.Time time20 = valueObject.getStartTm();
		String value20 = null;
		if ( time20 != null ) 
		{
			value20 = time20.toString();
		}
		domainObject.setStartTm(value20);
		ims.framework.utils.Time time21 = valueObject.getEndTm();
		String value21 = null;
		if ( time21 != null ) 
		{
			value21 = time21.toString();
		}
		domainObject.setEndTm(value21);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value22 = null;
		if ( null != valueObject.getPASClinic() ) 
		{
			value22 =
				domainFactory.getLookupInstance(valueObject.getPASClinic().getID());
		}
		domainObject.setPASClinic(value22);
		domainObject.setMaxNoAppts(valueObject.getMaxNoAppts());
		domainObject.setBookingRights(ims.scheduling.vo.domain.Profile_BookRightsVoAssembler.extractProfile_BookingRightSet(domainFactory, valueObject.getBookingRights(), domainObject.getBookingRights(), domMap));		
		domainObject.setListOwners(ims.scheduling.vo.domain.Profile_ListOwnerVoAssembler.extractProfile_ListOwnerSet(domainFactory, valueObject.getListOwners(), domainObject.getListOwners(), domMap));		
		domainObject.setExclusionDates(ims.scheduling.vo.domain.Profile_Exc_DateVoAssembler.extractProfile_Exc_DateSet(domainFactory, valueObject.getExclusionDates(), domainObject.getExclusionDates(), domMap));		
		domainObject.setExclusionTimes(ims.scheduling.vo.domain.Profile_Exc_TimeVoAssembler.extractProfile_Exc_TimeSet(domainFactory, valueObject.getExclusionTimes(), domainObject.getExclusionTimes(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value28 = null;
		if ( null != valueObject.getConsMediaType() ) 
		{
			value28 =
				domainFactory.getLookupInstance(valueObject.getConsMediaType().getID());
		}
		domainObject.setConsMediaType(value28);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value29 = null;
		if ( null != valueObject.getCaseNoteFolderLocation() ) 
		{
			if (valueObject.getCaseNoteFolderLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getCaseNoteFolderLocation()) != null)
				{
					value29 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getCaseNoteFolderLocation());
				}
			}
			else
			{
				value29 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getCaseNoteFolderLocation().getBoId());
			}
		}
		domainObject.setCaseNoteFolderLocation(value29);
		domainObject.setCaseNoteFolderNotRequired(valueObject.getCaseNoteFolderNotRequired());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value31 = null;
		if ( null != valueObject.getHospital() ) 
		{
			if (valueObject.getHospital().getBoId() == null)
			{
				if (domMap.get(valueObject.getHospital()) != null)
				{
					value31 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getHospital());
				}
			}
			else
			{
				value31 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getHospital().getBoId());
			}
		}
		domainObject.setHospital(value31);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDescription() != null && valueObject.getDescription().equals(""))
		{
			valueObject.setDescription(null);
		}
		domainObject.setDescription(valueObject.getDescription());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value33 = null;
		if ( null != valueObject.getPrfCategory() ) 
		{
			value33 =
				domainFactory.getLookupInstance(valueObject.getPrfCategory().getID());
		}
		domainObject.setPrfCategory(value33);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value34 = null;
		if ( null != valueObject.getPrftype() ) 
		{
			value34 =
				domainFactory.getLookupInstance(valueObject.getPrftype().getID());
		}
		domainObject.setPrftype(value34);
		java.util.Date value35 = null;
		ims.framework.utils.Date date35 = valueObject.getEffFrm();		
		if ( date35 != null ) 
		{
			value35 = date35.getDate();
		}
		domainObject.setEffFrm(value35);
		java.util.Date value36 = null;
		ims.framework.utils.Date date36 = valueObject.getEffTo();		
		if ( date36 != null ) 
		{
			value36 = date36.getDate();
		}
		domainObject.setEffTo(value36);
		domainObject.setIsActive(valueObject.getIsActive());
		domainObject.setService(ims.core.vo.domain.ServiceShortVoAssembler.extractService(domainFactory, valueObject.getService(), domMap));
		java.util.Date value39 = null;
		ims.framework.utils.Date date39 = valueObject.getLastActualGenDate();		
		if ( date39 != null ) 
		{
			value39 = date39.getDate();
		}
		domainObject.setLastActualGenDate(value39);
		java.util.Date value40 = null;
		ims.framework.utils.Date date40 = valueObject.getLastGenDate();		
		if ( date40 != null ) 
		{
			value40 = date40.getDate();
		}
		domainObject.setLastGenDate(value40);
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
