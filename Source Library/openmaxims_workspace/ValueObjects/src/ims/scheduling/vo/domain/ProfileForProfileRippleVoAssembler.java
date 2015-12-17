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
 * @author Florin Blindu
 */
public class ProfileForProfileRippleVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.ProfileForProfileRippleVo copy(ims.scheduling.vo.ProfileForProfileRippleVo valueObjectDest, ims.scheduling.vo.ProfileForProfileRippleVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Sch_Profile(valueObjectSrc.getID_Sch_Profile());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// SchLocation
		valueObjectDest.setSchLocation(valueObjectSrc.getSchLocation());
		// StartTm
		valueObjectDest.setStartTm(valueObjectSrc.getStartTm());
		// EndTm
		valueObjectDest.setEndTm(valueObjectSrc.getEndTm());
		// ProfileSlots
		valueObjectDest.setProfileSlots(valueObjectSrc.getProfileSlots());
		// ListOwners
		valueObjectDest.setListOwners(valueObjectSrc.getListOwners());
		// ProfileType
		valueObjectDest.setProfileType(valueObjectSrc.getProfileType());
		// Function
		valueObjectDest.setFunction(valueObjectSrc.getFunction());
		// DirectoryOfServices
		valueObjectDest.setDirectoryOfServices(valueObjectSrc.getDirectoryOfServices());
		// hasChooseBookActivity
		valueObjectDest.setHasChooseBookActivity(valueObjectSrc.getHasChooseBookActivity());
		// Hospital
		valueObjectDest.setHospital(valueObjectSrc.getHospital());
		// ParentChildSlots
		valueObjectDest.setParentChildSlots(valueObjectSrc.getParentChildSlots());
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
 	 * If more than one call to an Assembler is made then #createProfileForProfileRippleVoCollectionFromSch_Profile(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Sch_Profile objects.
	 */
	public static ims.scheduling.vo.ProfileForProfileRippleVoCollection createProfileForProfileRippleVoCollectionFromSch_Profile(java.util.Set domainObjectSet)	
	{
		return createProfileForProfileRippleVoCollectionFromSch_Profile(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Sch_Profile objects.
	 */
	public static ims.scheduling.vo.ProfileForProfileRippleVoCollection createProfileForProfileRippleVoCollectionFromSch_Profile(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.ProfileForProfileRippleVoCollection voList = new ims.scheduling.vo.ProfileForProfileRippleVoCollection();
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
			ims.scheduling.vo.ProfileForProfileRippleVo vo = create(map, domainObject);
			
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
	public static ims.scheduling.vo.ProfileForProfileRippleVoCollection createProfileForProfileRippleVoCollectionFromSch_Profile(java.util.List domainObjectList) 
	{
		return createProfileForProfileRippleVoCollectionFromSch_Profile(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Sch_Profile objects.
	 */
	public static ims.scheduling.vo.ProfileForProfileRippleVoCollection createProfileForProfileRippleVoCollectionFromSch_Profile(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.ProfileForProfileRippleVoCollection voList = new ims.scheduling.vo.ProfileForProfileRippleVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.Sch_Profile domainObject = (ims.scheduling.domain.objects.Sch_Profile) domainObjectList.get(i);
			ims.scheduling.vo.ProfileForProfileRippleVo vo = create(map, domainObject);

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
	 public static java.util.Set extractSch_ProfileSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.ProfileForProfileRippleVoCollection voCollection) 
	 {
	 	return extractSch_ProfileSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSch_ProfileSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.ProfileForProfileRippleVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.ProfileForProfileRippleVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Sch_Profile domainObject = ProfileForProfileRippleVoAssembler.extractSch_Profile(domainFactory, vo, domMap);

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
	 public static java.util.List extractSch_ProfileList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.ProfileForProfileRippleVoCollection voCollection) 
	 {
	 	return extractSch_ProfileList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSch_ProfileList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.ProfileForProfileRippleVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.ProfileForProfileRippleVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Sch_Profile domainObject = ProfileForProfileRippleVoAssembler.extractSch_Profile(domainFactory, vo, domMap);

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
	 public static ims.scheduling.vo.ProfileForProfileRippleVo create(ims.scheduling.domain.objects.Sch_Profile domainObject) 
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
	  public static ims.scheduling.vo.ProfileForProfileRippleVo create(DomainObjectMap map, ims.scheduling.domain.objects.Sch_Profile domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.ProfileForProfileRippleVo valueObject = (ims.scheduling.vo.ProfileForProfileRippleVo) map.getValueObject(domainObject, ims.scheduling.vo.ProfileForProfileRippleVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.ProfileForProfileRippleVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.scheduling.vo.ProfileForProfileRippleVo insert(ims.scheduling.vo.ProfileForProfileRippleVo valueObject, ims.scheduling.domain.objects.Sch_Profile domainObject) 
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
	 public static ims.scheduling.vo.ProfileForProfileRippleVo insert(DomainObjectMap map, ims.scheduling.vo.ProfileForProfileRippleVo valueObject, ims.scheduling.domain.objects.Sch_Profile domainObject) 
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
		if (domainObject.getSchLocation() != null)
		{
			if(domainObject.getSchLocation() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getSchLocation();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setSchLocation(new ims.core.resource.place.vo.LocationRefVo(id, -1));				
			}
			else
			{
				valueObject.setSchLocation(new ims.core.resource.place.vo.LocationRefVo(domainObject.getSchLocation().getId(), domainObject.getSchLocation().getVersion()));
			}
		}
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
		// ProfileSlots
		valueObject.setProfileSlots(ims.scheduling.vo.domain.Profile_SlotGenericVoAssembler.createProfile_SlotGenericVoCollectionFromProfile_Slot(map, domainObject.getProfileSlots()) );
		// ListOwners
		valueObject.setListOwners(ims.scheduling.vo.domain.Profile_ListOwnerVoAssembler.createProfile_ListOwnerVoCollectionFromProfile_ListOwner(map, domainObject.getListOwners()) );
		// ProfileType
		ims.domain.lookups.LookupInstance instance6 = domainObject.getProfileType();
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

			ims.scheduling.vo.lookups.SchProfileType voLookup6 = new ims.scheduling.vo.lookups.SchProfileType(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.scheduling.vo.lookups.SchProfileType parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.scheduling.vo.lookups.SchProfileType(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setProfileType(voLookup6);
		}
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
		// DirectoryOfServices
		valueObject.setDirectoryOfServices(ims.scheduling.vo.domain.DirectoryOfServiceVoAssembler.createDirectoryOfServiceVoCollectionFromDirectoryofService(map, domainObject.getDirectoryOfServices()) );
		// hasChooseBookActivity
		valueObject.setHasChooseBookActivity( domainObject.isHasChooseBookActivity() );
		// Hospital
		valueObject.setHospital(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getHospital()) );
		// ParentChildSlots
		ims.scheduling.vo.ProfileParentChildSlotRefVoCollection ParentChildSlots = new ims.scheduling.vo.ProfileParentChildSlotRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getParentChildSlots().iterator(); iterator.hasNext(); ) 
		{
			ims.scheduling.domain.objects.ProfileParentChildSlot tmp = (ims.scheduling.domain.objects.ProfileParentChildSlot)iterator.next();
			if (tmp != null)
				ParentChildSlots.add(new ims.scheduling.vo.ProfileParentChildSlotRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setParentChildSlots(ParentChildSlots);
		// Description
		valueObject.setDescription(domainObject.getDescription());
		// PrfCategory
		ims.domain.lookups.LookupInstance instance13 = domainObject.getPrfCategory();
		if ( null != instance13 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance13.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance13.getImage().getImageId(), instance13.getImage().getImagePath());
			}
			color = instance13.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.Sched_Prfile_Cat voLookup13 = new ims.scheduling.vo.lookups.Sched_Prfile_Cat(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.scheduling.vo.lookups.Sched_Prfile_Cat parentVoLookup13 = voLookup13;
			ims.domain.lookups.LookupInstance parent13 = instance13.getParent();
			while (parent13 != null)
			{
				if (parent13.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent13.getImage().getImageId(), parent13.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent13.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup13.setParent(new ims.scheduling.vo.lookups.Sched_Prfile_Cat(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setPrfCategory(voLookup13);
		}
				// Prftype
		ims.domain.lookups.LookupInstance instance14 = domainObject.getPrftype();
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

			ims.scheduling.vo.lookups.Sched_Profile_Type voLookup14 = new ims.scheduling.vo.lookups.Sched_Profile_Type(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.scheduling.vo.lookups.Sched_Profile_Type parentVoLookup14 = voLookup14;
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
								parentVoLookup14.setParent(new ims.scheduling.vo.lookups.Sched_Profile_Type(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setPrftype(voLookup14);
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
	public static ims.scheduling.domain.objects.Sch_Profile extractSch_Profile(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.ProfileForProfileRippleVo valueObject) 
	{
		return 	extractSch_Profile(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.Sch_Profile extractSch_Profile(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.ProfileForProfileRippleVo valueObject, HashMap domMap) 
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
			// ims.scheduling.vo.ProfileForProfileRippleVo ID_Sch_Profile field is unknown
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

		ims.core.resource.place.domain.objects.Location value1 = null;
		if ( null != valueObject.getSchLocation() ) 
		{
			if (valueObject.getSchLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getSchLocation()) != null)
				{
					value1 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getSchLocation());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getSchLocation();	
			}
			else
			{
				value1 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getSchLocation().getBoId());
			}
		}
		domainObject.setSchLocation(value1);
		ims.framework.utils.Time time2 = valueObject.getStartTm();
		String value2 = null;
		if ( time2 != null ) 
		{
			value2 = time2.toString();
		}
		domainObject.setStartTm(value2);
		ims.framework.utils.Time time3 = valueObject.getEndTm();
		String value3 = null;
		if ( time3 != null ) 
		{
			value3 = time3.toString();
		}
		domainObject.setEndTm(value3);
		domainObject.setProfileSlots(ims.scheduling.vo.domain.Profile_SlotGenericVoAssembler.extractProfile_SlotSet(domainFactory, valueObject.getProfileSlots(), domainObject.getProfileSlots(), domMap));		
		domainObject.setListOwners(ims.scheduling.vo.domain.Profile_ListOwnerVoAssembler.extractProfile_ListOwnerSet(domainFactory, valueObject.getListOwners(), domainObject.getListOwners(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getProfileType() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getProfileType().getID());
		}
		domainObject.setProfileType(value6);
		ims.core.vo.lookups.ServiceFunctionCollection collection7 =
	valueObject.getFunction();
	    java.util.List domainFunction = domainObject.getFunction();;			
	    int collection7Size=0;
		if (collection7 == null)
		{
			domainFunction = new java.util.ArrayList(0);
		}
		else
		{
			collection7Size = collection7.size();
		}
		
		for(int i=0; i<collection7Size; i++) 
		{
			int instanceId = collection7.get(i).getID();
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
		int j7 = domainFunction.size();
		while (j7 > collection7Size)
		{
			domainFunction.remove(j7-1);
			j7 = domainFunction.size();
		}

		domainObject.setFunction(domainFunction);		

		// SaveAsRefVO treated as RefValueObject
		ims.scheduling.vo.DirectoryofServiceRefVoCollection refCollection8 = new ims.scheduling.vo.DirectoryofServiceRefVoCollection();
		if (valueObject.getDirectoryOfServices() != null)
		{
			for (int i8=0; i8<valueObject.getDirectoryOfServices().size(); i8++)
			{
				ims.scheduling.vo.DirectoryofServiceRefVo ref8 = (ims.scheduling.vo.DirectoryofServiceRefVo)valueObject.getDirectoryOfServices().get(i8);
				refCollection8.add(ref8);
			}
		}
		int size8 = (null == refCollection8) ? 0 : refCollection8.size();		
		java.util.Set domainDirectoryOfServices8 = domainObject.getDirectoryOfServices();
		if (domainDirectoryOfServices8 == null)
		{
			domainDirectoryOfServices8 = new java.util.HashSet();
		}
		java.util.Set newSet8  = new java.util.HashSet();
		for(int i=0; i<size8; i++) 
		{
			ims.scheduling.vo.DirectoryofServiceRefVo vo = refCollection8.get(i);					
			ims.scheduling.domain.objects.DirectoryofService dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.scheduling.domain.objects.DirectoryofService)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.scheduling.domain.objects.DirectoryofService)domainFactory.getDomainObject( ims.scheduling.domain.objects.DirectoryofService.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainDirectoryOfServices8.contains(dom))
			{
				domainDirectoryOfServices8.add(dom);
			}
			newSet8.add(dom);			
		}
		java.util.Set removedSet8 = new java.util.HashSet();
		java.util.Iterator iter8 = domainDirectoryOfServices8.iterator();
		//Find out which objects need to be removed
		while (iter8.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter8.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet8.contains(o))
			{
				removedSet8.add(o);
			}
		}
		iter8 = removedSet8.iterator();
		//Remove the unwanted objects
		while (iter8.hasNext())
		{
			domainDirectoryOfServices8.remove(iter8.next());
		}		
		
		domainObject.setDirectoryOfServices(domainDirectoryOfServices8);		
		domainObject.setHasChooseBookActivity(valueObject.getHasChooseBookActivity());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value10 = null;
		if ( null != valueObject.getHospital() ) 
		{
			if (valueObject.getHospital().getBoId() == null)
			{
				if (domMap.get(valueObject.getHospital()) != null)
				{
					value10 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getHospital());
				}
			}
			else
			{
				value10 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getHospital().getBoId());
			}
		}
		domainObject.setHospital(value10);

		ims.scheduling.vo.ProfileParentChildSlotRefVoCollection refCollection11 = valueObject.getParentChildSlots();
		int size11 = (null == refCollection11) ? 0 : refCollection11.size();		
		java.util.Set domainParentChildSlots11 = domainObject.getParentChildSlots();
		if (domainParentChildSlots11 == null)
		{
			domainParentChildSlots11 = new java.util.HashSet();
		}
		java.util.Set newSet11  = new java.util.HashSet();
		for(int i=0; i<size11; i++) 
		{
			ims.scheduling.vo.ProfileParentChildSlotRefVo vo = refCollection11.get(i);					
			ims.scheduling.domain.objects.ProfileParentChildSlot dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.scheduling.domain.objects.ProfileParentChildSlot)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.scheduling.domain.objects.ProfileParentChildSlot)domainFactory.getDomainObject( ims.scheduling.domain.objects.ProfileParentChildSlot.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainParentChildSlots11.contains(dom))
			{
				domainParentChildSlots11.add(dom);
			}
			newSet11.add(dom);			
		}
		java.util.Set removedSet11 = new java.util.HashSet();
		java.util.Iterator iter11 = domainParentChildSlots11.iterator();
		//Find out which objects need to be removed
		while (iter11.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter11.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet11.contains(o))
			{
				removedSet11.add(o);
			}
		}
		iter11 = removedSet11.iterator();
		//Remove the unwanted objects
		while (iter11.hasNext())
		{
			domainParentChildSlots11.remove(iter11.next());
		}		
		
		domainObject.setParentChildSlots(domainParentChildSlots11);		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDescription() != null && valueObject.getDescription().equals(""))
		{
			valueObject.setDescription(null);
		}
		domainObject.setDescription(valueObject.getDescription());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getPrfCategory() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getPrfCategory().getID());
		}
		domainObject.setPrfCategory(value13);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getPrftype() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getPrftype().getID());
		}
		domainObject.setPrftype(value14);
		java.util.Date value15 = null;
		ims.framework.utils.Date date15 = valueObject.getEffFrm();		
		if ( date15 != null ) 
		{
			value15 = date15.getDate();
		}
		domainObject.setEffFrm(value15);
		java.util.Date value16 = null;
		ims.framework.utils.Date date16 = valueObject.getEffTo();		
		if ( date16 != null ) 
		{
			value16 = date16.getDate();
		}
		domainObject.setEffTo(value16);
		domainObject.setIsActive(valueObject.getIsActive());
		domainObject.setService(ims.core.vo.domain.ServiceShortVoAssembler.extractService(domainFactory, valueObject.getService(), domMap));
		java.util.Date value19 = null;
		ims.framework.utils.Date date19 = valueObject.getLastActualGenDate();		
		if ( date19 != null ) 
		{
			value19 = date19.getDate();
		}
		domainObject.setLastActualGenDate(value19);
		java.util.Date value20 = null;
		ims.framework.utils.Date date20 = valueObject.getLastGenDate();		
		if ( date20 != null ) 
		{
			value20 = date20.getDate();
		}
		domainObject.setLastGenDate(value20);
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
