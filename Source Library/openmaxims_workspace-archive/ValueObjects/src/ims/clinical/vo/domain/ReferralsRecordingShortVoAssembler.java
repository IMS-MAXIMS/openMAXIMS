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
 * @author Catalin Tomozei
 */
public class ReferralsRecordingShortVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.ReferralsRecordingShortVo copy(ims.clinical.vo.ReferralsRecordingShortVo valueObjectDest, ims.clinical.vo.ReferralsRecordingShortVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ReferralsRecording(valueObjectSrc.getID_ReferralsRecording());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ReferralType
		valueObjectDest.setReferralType(valueObjectSrc.getReferralType());
		// ReferralSource
		valueObjectDest.setReferralSource(valueObjectSrc.getReferralSource());
		// DateSent
		valueObjectDest.setDateSent(valueObjectSrc.getDateSent());
		// Details
		valueObjectDest.setDetails(valueObjectSrc.getDetails());
		// RefOrgaCode
		valueObjectDest.setRefOrgaCode(valueObjectSrc.getRefOrgaCode());
		// DateFirstSeen
		valueObjectDest.setDateFirstSeen(valueObjectSrc.getDateFirstSeen());
		// ReferralHCP
		valueObjectDest.setReferralHCP(valueObjectSrc.getReferralHCP());
		// DateReceived
		valueObjectDest.setDateReceived(valueObjectSrc.getDateReceived());
		// ReferredBy
		valueObjectDest.setReferredBy(valueObjectSrc.getReferredBy());
		// ReferralPriority
		valueObjectDest.setReferralPriority(valueObjectSrc.getReferralPriority());
		// ReasonForReferral
		valueObjectDest.setReasonForReferral(valueObjectSrc.getReasonForReferral());
		// SpecialtyFunctionCode
		valueObjectDest.setSpecialtyFunctionCode(valueObjectSrc.getSpecialtyFunctionCode());
		// ReferredByGP
		valueObjectDest.setReferredByGP(valueObjectSrc.getReferredByGP());
		// ReferralCategory
		valueObjectDest.setReferralCategory(valueObjectSrc.getReferralCategory());
		// PrimaryPreceeding
		valueObjectDest.setPrimaryPreceeding(valueObjectSrc.getPrimaryPreceeding());
		// AuthoringInfo
		valueObjectDest.setAuthoringInfo(valueObjectSrc.getAuthoringInfo());
		// CareSpell
		valueObjectDest.setCareSpell(valueObjectSrc.getCareSpell());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// SuppliedReferralProfessional
		valueObjectDest.setSuppliedReferralProfessional(valueObjectSrc.getSuppliedReferralProfessional());
		// ReferredtoLocation
		valueObjectDest.setReferredtoLocation(valueObjectSrc.getReferredtoLocation());
		// ReferralStatus
		valueObjectDest.setReferralStatus(valueObjectSrc.getReferralStatus());
		// UrgentCancerReferralType
		valueObjectDest.setUrgentCancerReferralType(valueObjectSrc.getUrgentCancerReferralType());
		// CancerStatus
		valueObjectDest.setCancerStatus(valueObjectSrc.getCancerStatus());
		// DelayReasonGPUrgentReferral
		valueObjectDest.setDelayReasonGPUrgentReferral(valueObjectSrc.getDelayReasonGPUrgentReferral());
		// DelayReasonText
		valueObjectDest.setDelayReasonText(valueObjectSrc.getDelayReasonText());
		// SysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
		// RecordingMOS
		valueObjectDest.setRecordingMOS(valueObjectSrc.getRecordingMOS());
		// Discipline
		valueObjectDest.setDiscipline(valueObjectSrc.getDiscipline());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createReferralsRecordingShortVoCollectionFromReferralsRecording(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.ReferralsRecording objects.
	 */
	public static ims.clinical.vo.ReferralsRecordingShortVoCollection createReferralsRecordingShortVoCollectionFromReferralsRecording(java.util.Set domainObjectSet)	
	{
		return createReferralsRecordingShortVoCollectionFromReferralsRecording(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.ReferralsRecording objects.
	 */
	public static ims.clinical.vo.ReferralsRecordingShortVoCollection createReferralsRecordingShortVoCollectionFromReferralsRecording(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.ReferralsRecordingShortVoCollection voList = new ims.clinical.vo.ReferralsRecordingShortVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.ReferralsRecording domainObject = (ims.clinical.domain.objects.ReferralsRecording) iterator.next();
			ims.clinical.vo.ReferralsRecordingShortVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.ReferralsRecording objects.
	 */
	public static ims.clinical.vo.ReferralsRecordingShortVoCollection createReferralsRecordingShortVoCollectionFromReferralsRecording(java.util.List domainObjectList) 
	{
		return createReferralsRecordingShortVoCollectionFromReferralsRecording(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.ReferralsRecording objects.
	 */
	public static ims.clinical.vo.ReferralsRecordingShortVoCollection createReferralsRecordingShortVoCollectionFromReferralsRecording(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.ReferralsRecordingShortVoCollection voList = new ims.clinical.vo.ReferralsRecordingShortVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.ReferralsRecording domainObject = (ims.clinical.domain.objects.ReferralsRecording) domainObjectList.get(i);
			ims.clinical.vo.ReferralsRecordingShortVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.ReferralsRecording set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractReferralsRecordingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ReferralsRecordingShortVoCollection voCollection) 
	 {
	 	return extractReferralsRecordingSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractReferralsRecordingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ReferralsRecordingShortVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.ReferralsRecordingShortVo vo = voCollection.get(i);
			ims.clinical.domain.objects.ReferralsRecording domainObject = ReferralsRecordingShortVoAssembler.extractReferralsRecording(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.ReferralsRecording list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractReferralsRecordingList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ReferralsRecordingShortVoCollection voCollection) 
	 {
	 	return extractReferralsRecordingList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractReferralsRecordingList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ReferralsRecordingShortVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.ReferralsRecordingShortVo vo = voCollection.get(i);
			ims.clinical.domain.objects.ReferralsRecording domainObject = ReferralsRecordingShortVoAssembler.extractReferralsRecording(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.ReferralsRecording object.
	 * @param domainObject ims.clinical.domain.objects.ReferralsRecording
	 */
	 public static ims.clinical.vo.ReferralsRecordingShortVo create(ims.clinical.domain.objects.ReferralsRecording domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.ReferralsRecording object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.ReferralsRecordingShortVo create(DomainObjectMap map, ims.clinical.domain.objects.ReferralsRecording domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.ReferralsRecordingShortVo valueObject = (ims.clinical.vo.ReferralsRecordingShortVo) map.getValueObject(domainObject, ims.clinical.vo.ReferralsRecordingShortVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.ReferralsRecordingShortVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.ReferralsRecording
	 */
	 public static ims.clinical.vo.ReferralsRecordingShortVo insert(ims.clinical.vo.ReferralsRecordingShortVo valueObject, ims.clinical.domain.objects.ReferralsRecording domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.ReferralsRecording
	 */
	 public static ims.clinical.vo.ReferralsRecordingShortVo insert(DomainObjectMap map, ims.clinical.vo.ReferralsRecordingShortVo valueObject, ims.clinical.domain.objects.ReferralsRecording domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ReferralsRecording(domainObject.getId());
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
			
		// ReferralType
		ims.domain.lookups.LookupInstance instance1 = domainObject.getReferralType();
		if ( null != instance1 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance1.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance1.getImage().getImageId(), instance1.getImage().getImagePath());
			}
			color = instance1.getColor();
			if (color != null) 
				color.getValue();

			ims.clinical.vo.lookups.TypeOfReferral voLookup1 = new ims.clinical.vo.lookups.TypeOfReferral(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.clinical.vo.lookups.TypeOfReferral parentVoLookup1 = voLookup1;
			ims.domain.lookups.LookupInstance parent1 = instance1.getParent();
			while (parent1 != null)
			{
				if (parent1.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent1.getImage().getImageId(), parent1.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent1.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup1.setParent(new ims.clinical.vo.lookups.TypeOfReferral(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setReferralType(voLookup1);
		}
				// ReferralSource
		ims.domain.lookups.LookupInstance instance2 = domainObject.getReferralSource();
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

			ims.clinical.vo.lookups.ReferralSource voLookup2 = new ims.clinical.vo.lookups.ReferralSource(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.clinical.vo.lookups.ReferralSource parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.clinical.vo.lookups.ReferralSource(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setReferralSource(voLookup2);
		}
				// DateSent
		java.util.Date DateSent = domainObject.getDateSent();
		if ( null != DateSent ) 
		{
			valueObject.setDateSent(new ims.framework.utils.Date(DateSent) );
		}
		// Details
		valueObject.setDetails(domainObject.getDetails());
		// RefOrgaCode
		valueObject.setRefOrgaCode(ims.core.vo.domain.OrgLiteVoAssembler.create(map, domainObject.getRefOrgaCode()) );
		// DateFirstSeen
		java.util.Date DateFirstSeen = domainObject.getDateFirstSeen();
		if ( null != DateFirstSeen ) 
		{
			valueObject.setDateFirstSeen(new ims.framework.utils.Date(DateFirstSeen) );
		}
		// ReferralHCP
		valueObject.setReferralHCP(ims.core.vo.domain.MemberOfStaffShortVoAssembler.create(map, domainObject.getReferralHCP()) );
		// DateReceived
		java.util.Date DateReceived = domainObject.getDateReceived();
		if ( null != DateReceived ) 
		{
			valueObject.setDateReceived(new ims.framework.utils.Date(DateReceived) );
		}
		// ReferredBy
		valueObject.setReferredBy(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getReferredBy()) );
		// ReferralPriority
		ims.domain.lookups.LookupInstance instance10 = domainObject.getReferralPriority();
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

			ims.core.vo.lookups.ReferralPriority voLookup10 = new ims.core.vo.lookups.ReferralPriority(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.ReferralPriority parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.core.vo.lookups.ReferralPriority(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setReferralPriority(voLookup10);
		}
				// ReasonForReferral
		ims.domain.lookups.LookupInstance instance11 = domainObject.getReasonForReferral();
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

			ims.core.vo.lookups.ReasonForReferral voLookup11 = new ims.core.vo.lookups.ReasonForReferral(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.core.vo.lookups.ReasonForReferral parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.core.vo.lookups.ReasonForReferral(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setReasonForReferral(voLookup11);
		}
				// SpecialtyFunctionCode
		ims.domain.lookups.LookupInstance instance12 = domainObject.getSpecialtyFunctionCode();
		if ( null != instance12 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance12.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance12.getImage().getImageId(), instance12.getImage().getImagePath());
			}
			color = instance12.getColor();
			if (color != null) 
				color.getValue();

			ims.clinical.vo.lookups.SpecialtyFunctionCode voLookup12 = new ims.clinical.vo.lookups.SpecialtyFunctionCode(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.clinical.vo.lookups.SpecialtyFunctionCode parentVoLookup12 = voLookup12;
			ims.domain.lookups.LookupInstance parent12 = instance12.getParent();
			while (parent12 != null)
			{
				if (parent12.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent12.getImage().getImageId(), parent12.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent12.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup12.setParent(new ims.clinical.vo.lookups.SpecialtyFunctionCode(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setSpecialtyFunctionCode(voLookup12);
		}
				// ReferredByGP
		valueObject.setReferredByGP(ims.core.vo.domain.GpShortVoAssembler.create(map, domainObject.getReferredByGP()) );
		// ReferralCategory
		ims.domain.lookups.LookupInstance instance14 = domainObject.getReferralCategory();
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

			ims.clinical.vo.lookups.ReferralCategory voLookup14 = new ims.clinical.vo.lookups.ReferralCategory(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.clinical.vo.lookups.ReferralCategory parentVoLookup14 = voLookup14;
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
								parentVoLookup14.setParent(new ims.clinical.vo.lookups.ReferralCategory(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setReferralCategory(voLookup14);
		}
				// PrimaryPreceeding
		ims.domain.lookups.LookupInstance instance15 = domainObject.getPrimaryPreceeding();
		if ( null != instance15 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance15.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance15.getImage().getImageId(), instance15.getImage().getImagePath());
			}
			color = instance15.getColor();
			if (color != null) 
				color.getValue();

			ims.clinical.vo.lookups.PrimaryPreceeding voLookup15 = new ims.clinical.vo.lookups.PrimaryPreceeding(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.clinical.vo.lookups.PrimaryPreceeding parentVoLookup15 = voLookup15;
			ims.domain.lookups.LookupInstance parent15 = instance15.getParent();
			while (parent15 != null)
			{
				if (parent15.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent15.getImage().getImageId(), parent15.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent15.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup15.setParent(new ims.clinical.vo.lookups.PrimaryPreceeding(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setPrimaryPreceeding(voLookup15);
		}
				// AuthoringInfo
		valueObject.setAuthoringInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInfo()) );
		// CareSpell
		if (domainObject.getCareSpell() != null)
		{
			if(domainObject.getCareSpell() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCareSpell();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCareSpell(new ims.core.admin.vo.CareSpellRefVo(id, -1));				
			}
			else
			{
				valueObject.setCareSpell(new ims.core.admin.vo.CareSpellRefVo(domainObject.getCareSpell().getId(), domainObject.getCareSpell().getVersion()));
			}
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
		// ClinicalContact
		if (domainObject.getClinicalContact() != null)
		{
			if(domainObject.getClinicalContact() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getClinicalContact();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(id, -1));				
			}
			else
			{
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(domainObject.getClinicalContact().getId(), domainObject.getClinicalContact().getVersion()));
			}
		}
		// SuppliedReferralProfessional
		valueObject.setSuppliedReferralProfessional(ims.clinical.vo.domain.ReferralProffessionalDetailVoAssembler.create(map, domainObject.getSuppliedReferralProfessional()) );
		// ReferredtoLocation
		valueObject.setReferredtoLocation(ims.core.vo.domain.LocShortVoAssembler.create(map, domainObject.getReferredtoLocation()) );
		// ReferralStatus
		ims.domain.lookups.LookupInstance instance22 = domainObject.getReferralStatus();
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

			ims.core.vo.lookups.CoreReferralStatus voLookup22 = new ims.core.vo.lookups.CoreReferralStatus(instance22.getId(),instance22.getText(), instance22.isActive(), null, img, color);
			ims.core.vo.lookups.CoreReferralStatus parentVoLookup22 = voLookup22;
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
								parentVoLookup22.setParent(new ims.core.vo.lookups.CoreReferralStatus(parent22.getId(),parent22.getText(), parent22.isActive(), null, img, color));
				parentVoLookup22 = parentVoLookup22.getParent();
								parent22 = parent22.getParent();
			}			
			valueObject.setReferralStatus(voLookup22);
		}
				// UrgentCancerReferralType
		ims.domain.lookups.LookupInstance instance23 = domainObject.getUrgentCancerReferralType();
		if ( null != instance23 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance23.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance23.getImage().getImageId(), instance23.getImage().getImagePath());
			}
			color = instance23.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.UrgentCancerReferralType voLookup23 = new ims.core.vo.lookups.UrgentCancerReferralType(instance23.getId(),instance23.getText(), instance23.isActive(), null, img, color);
			ims.core.vo.lookups.UrgentCancerReferralType parentVoLookup23 = voLookup23;
			ims.domain.lookups.LookupInstance parent23 = instance23.getParent();
			while (parent23 != null)
			{
				if (parent23.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent23.getImage().getImageId(), parent23.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent23.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup23.setParent(new ims.core.vo.lookups.UrgentCancerReferralType(parent23.getId(),parent23.getText(), parent23.isActive(), null, img, color));
				parentVoLookup23 = parentVoLookup23.getParent();
								parent23 = parent23.getParent();
			}			
			valueObject.setUrgentCancerReferralType(voLookup23);
		}
				// CancerStatus
		ims.domain.lookups.LookupInstance instance24 = domainObject.getCancerStatus();
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

			ims.core.vo.lookups.CancerStatus voLookup24 = new ims.core.vo.lookups.CancerStatus(instance24.getId(),instance24.getText(), instance24.isActive(), null, img, color);
			ims.core.vo.lookups.CancerStatus parentVoLookup24 = voLookup24;
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
								parentVoLookup24.setParent(new ims.core.vo.lookups.CancerStatus(parent24.getId(),parent24.getText(), parent24.isActive(), null, img, color));
				parentVoLookup24 = parentVoLookup24.getParent();
								parent24 = parent24.getParent();
			}			
			valueObject.setCancerStatus(voLookup24);
		}
				// DelayReasonGPUrgentReferral
		ims.domain.lookups.LookupInstance instance25 = domainObject.getDelayReasonGPUrgentReferral();
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

			ims.clinical.vo.lookups.DelayReasonGPUrgentReferral voLookup25 = new ims.clinical.vo.lookups.DelayReasonGPUrgentReferral(instance25.getId(),instance25.getText(), instance25.isActive(), null, img, color);
			ims.clinical.vo.lookups.DelayReasonGPUrgentReferral parentVoLookup25 = voLookup25;
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
								parentVoLookup25.setParent(new ims.clinical.vo.lookups.DelayReasonGPUrgentReferral(parent25.getId(),parent25.getText(), parent25.isActive(), null, img, color));
				parentVoLookup25 = parentVoLookup25.getParent();
								parent25 = parent25.getParent();
			}			
			valueObject.setDelayReasonGPUrgentReferral(voLookup25);
		}
				// DelayReasonText
		valueObject.setDelayReasonText(domainObject.getDelayReasonText());
		// SysInfo
		// set system information
		valueObject.setSysInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// RecordingMOS
		valueObject.setRecordingMOS(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getRecordingMOS()) );
		// Discipline
		ims.domain.lookups.LookupInstance instance29 = domainObject.getDiscipline();
		if ( null != instance29 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance29.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance29.getImage().getImageId(), instance29.getImage().getImagePath());
			}
			color = instance29.getColor();
			if (color != null) 
				color.getValue();

			ims.clinical.vo.lookups.ReferralDiscipline voLookup29 = new ims.clinical.vo.lookups.ReferralDiscipline(instance29.getId(),instance29.getText(), instance29.isActive(), null, img, color);
			ims.clinical.vo.lookups.ReferralDiscipline parentVoLookup29 = voLookup29;
			ims.domain.lookups.LookupInstance parent29 = instance29.getParent();
			while (parent29 != null)
			{
				if (parent29.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent29.getImage().getImageId(), parent29.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent29.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup29.setParent(new ims.clinical.vo.lookups.ReferralDiscipline(parent29.getId(),parent29.getText(), parent29.isActive(), null, img, color));
				parentVoLookup29 = parentVoLookup29.getParent();
								parent29 = parent29.getParent();
			}			
			valueObject.setDiscipline(voLookup29);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.ReferralsRecording extractReferralsRecording(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ReferralsRecordingShortVo valueObject) 
	{
		return 	extractReferralsRecording(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.ReferralsRecording extractReferralsRecording(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ReferralsRecordingShortVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ReferralsRecording();
		ims.clinical.domain.objects.ReferralsRecording domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.ReferralsRecording)domMap.get(valueObject);
			}
			// ims.clinical.vo.ReferralsRecordingShortVo ID_ReferralsRecording field is unknown
			domainObject = new ims.clinical.domain.objects.ReferralsRecording();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ReferralsRecording());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.ReferralsRecording)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.ReferralsRecording) domainFactory.getDomainObject(ims.clinical.domain.objects.ReferralsRecording.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ReferralsRecording());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getReferralType() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getReferralType().getID());
		}
		domainObject.setReferralType(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getReferralSource() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getReferralSource().getID());
		}
		domainObject.setReferralSource(value2);
		java.util.Date value3 = null;
		ims.framework.utils.Date date3 = valueObject.getDateSent();		
		if ( date3 != null ) 
		{
			value3 = date3.getDate();
		}
		domainObject.setDateSent(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDetails() != null && valueObject.getDetails().equals(""))
		{
			valueObject.setDetails(null);
		}
		domainObject.setDetails(valueObject.getDetails());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Organisation value5 = null;
		if ( null != valueObject.getRefOrgaCode() ) 
		{
			if (valueObject.getRefOrgaCode().getBoId() == null)
			{
				if (domMap.get(valueObject.getRefOrgaCode()) != null)
				{
					value5 = (ims.core.resource.place.domain.objects.Organisation)domMap.get(valueObject.getRefOrgaCode());
				}
			}
			else
			{
				value5 = (ims.core.resource.place.domain.objects.Organisation)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Organisation.class, valueObject.getRefOrgaCode().getBoId());
			}
		}
		domainObject.setRefOrgaCode(value5);
		java.util.Date value6 = null;
		ims.framework.utils.Date date6 = valueObject.getDateFirstSeen();		
		if ( date6 != null ) 
		{
			value6 = date6.getDate();
		}
		domainObject.setDateFirstSeen(value6);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value7 = null;
		if ( null != valueObject.getReferralHCP() ) 
		{
			if (valueObject.getReferralHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferralHCP()) != null)
				{
					value7 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getReferralHCP());
				}
			}
			else
			{
				value7 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getReferralHCP().getBoId());
			}
		}
		domainObject.setReferralHCP(value7);
		java.util.Date value8 = null;
		ims.framework.utils.Date date8 = valueObject.getDateReceived();		
		if ( date8 != null ) 
		{
			value8 = date8.getDate();
		}
		domainObject.setDateReceived(value8);
		domainObject.setReferredBy(ims.core.vo.domain.HcpAssembler.extractHcp(domainFactory, valueObject.getReferredBy(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getReferralPriority() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getReferralPriority().getID());
		}
		domainObject.setReferralPriority(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getReasonForReferral() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getReasonForReferral().getID());
		}
		domainObject.setReasonForReferral(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getSpecialtyFunctionCode() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getSpecialtyFunctionCode().getID());
		}
		domainObject.setSpecialtyFunctionCode(value12);
		domainObject.setReferredByGP(ims.core.vo.domain.GpShortVoAssembler.extractGp(domainFactory, valueObject.getReferredByGP(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getReferralCategory() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getReferralCategory().getID());
		}
		domainObject.setReferralCategory(value14);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getPrimaryPreceeding() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getPrimaryPreceeding().getID());
		}
		domainObject.setPrimaryPreceeding(value15);
		domainObject.setAuthoringInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInfo(), domMap));
		ims.core.admin.domain.objects.CareSpell value17 = null;
		if ( null != valueObject.getCareSpell() ) 
		{
			if (valueObject.getCareSpell().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareSpell()) != null)
				{
					value17 = (ims.core.admin.domain.objects.CareSpell)domMap.get(valueObject.getCareSpell());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value17 = domainObject.getCareSpell();	
			}
			else
			{
				value17 = (ims.core.admin.domain.objects.CareSpell)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareSpell.class, valueObject.getCareSpell().getBoId());
			}
		}
		domainObject.setCareSpell(value17);
		ims.core.admin.domain.objects.CareContext value18 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value18 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value18 = domainObject.getCareContext();	
			}
			else
			{
				value18 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value18);
		ims.core.admin.domain.objects.ClinicalContact value19 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value19 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value19 = domainObject.getClinicalContact();	
			}
			else
			{
				value19 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value19);
		domainObject.setSuppliedReferralProfessional(ims.clinical.vo.domain.ReferralProffessionalDetailVoAssembler.extractReferralProfessionalDetail(domainFactory, valueObject.getSuppliedReferralProfessional(), domMap));
		domainObject.setReferredtoLocation(ims.core.vo.domain.LocShortVoAssembler.extractLocation(domainFactory, valueObject.getReferredtoLocation(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value22 = null;
		if ( null != valueObject.getReferralStatus() ) 
		{
			value22 =
				domainFactory.getLookupInstance(valueObject.getReferralStatus().getID());
		}
		domainObject.setReferralStatus(value22);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value23 = null;
		if ( null != valueObject.getUrgentCancerReferralType() ) 
		{
			value23 =
				domainFactory.getLookupInstance(valueObject.getUrgentCancerReferralType().getID());
		}
		domainObject.setUrgentCancerReferralType(value23);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value24 = null;
		if ( null != valueObject.getCancerStatus() ) 
		{
			value24 =
				domainFactory.getLookupInstance(valueObject.getCancerStatus().getID());
		}
		domainObject.setCancerStatus(value24);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value25 = null;
		if ( null != valueObject.getDelayReasonGPUrgentReferral() ) 
		{
			value25 =
				domainFactory.getLookupInstance(valueObject.getDelayReasonGPUrgentReferral().getID());
		}
		domainObject.setDelayReasonGPUrgentReferral(value25);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDelayReasonText() != null && valueObject.getDelayReasonText().equals(""))
		{
			valueObject.setDelayReasonText(null);
		}
		domainObject.setDelayReasonText(valueObject.getDelayReasonText());
		domainObject.setRecordingMOS(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.extractMemberOfStaff(domainFactory, valueObject.getRecordingMOS(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value29 = null;
		if ( null != valueObject.getDiscipline() ) 
		{
			value29 =
				domainFactory.getLookupInstance(valueObject.getDiscipline().getID());
		}
		domainObject.setDiscipline(value29);

		return domainObject;
	}

}
