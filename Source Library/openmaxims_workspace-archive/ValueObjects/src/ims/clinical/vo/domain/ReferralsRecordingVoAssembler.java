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
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Neil McAnaspie
 */
public class ReferralsRecordingVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.ReferralsRecordingVo copy(ims.clinical.vo.ReferralsRecordingVo valueObjectDest, ims.clinical.vo.ReferralsRecordingVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ReferralsRecording(valueObjectSrc.getID_ReferralsRecording());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// PreceedingReferrals
		valueObjectDest.setPreceedingReferrals(valueObjectSrc.getPreceedingReferrals());
		// ReasonForReferralText
		valueObjectDest.setReasonForReferralText(valueObjectSrc.getReasonForReferralText());
		// SuppliedReferralDetails
		valueObjectDest.setSuppliedReferralDetails(valueObjectSrc.getSuppliedReferralDetails());
		// Assessment
		valueObjectDest.setAssessment(valueObjectSrc.getAssessment());
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
 	 * If more than one call to an Assembler is made then #createReferralsRecordingVoCollectionFromReferralsRecording(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.ReferralsRecording objects.
	 */
	public static ims.clinical.vo.ReferralsRecordingVoCollection createReferralsRecordingVoCollectionFromReferralsRecording(java.util.Set domainObjectSet)	
	{
		return createReferralsRecordingVoCollectionFromReferralsRecording(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.ReferralsRecording objects.
	 */
	public static ims.clinical.vo.ReferralsRecordingVoCollection createReferralsRecordingVoCollectionFromReferralsRecording(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.ReferralsRecordingVoCollection voList = new ims.clinical.vo.ReferralsRecordingVoCollection();
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
			ims.clinical.vo.ReferralsRecordingVo vo = create(map, domainObject);
			
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
	public static ims.clinical.vo.ReferralsRecordingVoCollection createReferralsRecordingVoCollectionFromReferralsRecording(java.util.List domainObjectList) 
	{
		return createReferralsRecordingVoCollectionFromReferralsRecording(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.ReferralsRecording objects.
	 */
	public static ims.clinical.vo.ReferralsRecordingVoCollection createReferralsRecordingVoCollectionFromReferralsRecording(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.ReferralsRecordingVoCollection voList = new ims.clinical.vo.ReferralsRecordingVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.ReferralsRecording domainObject = (ims.clinical.domain.objects.ReferralsRecording) domainObjectList.get(i);
			ims.clinical.vo.ReferralsRecordingVo vo = create(map, domainObject);

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
	 public static java.util.Set extractReferralsRecordingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ReferralsRecordingVoCollection voCollection) 
	 {
	 	return extractReferralsRecordingSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractReferralsRecordingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ReferralsRecordingVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.ReferralsRecordingVo vo = voCollection.get(i);
			ims.clinical.domain.objects.ReferralsRecording domainObject = ReferralsRecordingVoAssembler.extractReferralsRecording(domainFactory, vo, domMap);

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
	 public static java.util.List extractReferralsRecordingList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ReferralsRecordingVoCollection voCollection) 
	 {
	 	return extractReferralsRecordingList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractReferralsRecordingList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ReferralsRecordingVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.ReferralsRecordingVo vo = voCollection.get(i);
			ims.clinical.domain.objects.ReferralsRecording domainObject = ReferralsRecordingVoAssembler.extractReferralsRecording(domainFactory, vo, domMap);

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
	 public static ims.clinical.vo.ReferralsRecordingVo create(ims.clinical.domain.objects.ReferralsRecording domainObject) 
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
	  public static ims.clinical.vo.ReferralsRecordingVo create(DomainObjectMap map, ims.clinical.domain.objects.ReferralsRecording domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.ReferralsRecordingVo valueObject = (ims.clinical.vo.ReferralsRecordingVo) map.getValueObject(domainObject, ims.clinical.vo.ReferralsRecordingVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.ReferralsRecordingVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.clinical.vo.ReferralsRecordingVo insert(ims.clinical.vo.ReferralsRecordingVo valueObject, ims.clinical.domain.objects.ReferralsRecording domainObject) 
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
	 public static ims.clinical.vo.ReferralsRecordingVo insert(DomainObjectMap map, ims.clinical.vo.ReferralsRecordingVo valueObject, ims.clinical.domain.objects.ReferralsRecording domainObject) 
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
			
		// PreceedingReferrals
		valueObject.setPreceedingReferrals(ims.clinical.vo.domain.ReferralsRecordingVoAssembler.createReferralsRecordingVoCollectionFromReferralsRecording(map, domainObject.getPreceedingReferrals()) );
		// ReasonForReferralText
		valueObject.setReasonForReferralText(domainObject.getReasonForReferralText());
		// SuppliedReferralDetails
		valueObject.setSuppliedReferralDetails(ims.clinical.vo.domain.SuppliedReferralDetailsVoAssembler.create(map, domainObject.getSuppliedReferralDetails()) );
		// Assessment
		valueObject.setAssessment(ims.assessment.vo.domain.PatientAssessmentVoAssembler.create(map, domainObject.getAssessment()) );
		// ReferralType
		ims.domain.lookups.LookupInstance instance5 = domainObject.getReferralType();
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

			ims.clinical.vo.lookups.TypeOfReferral voLookup5 = new ims.clinical.vo.lookups.TypeOfReferral(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.clinical.vo.lookups.TypeOfReferral parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.clinical.vo.lookups.TypeOfReferral(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setReferralType(voLookup5);
		}
				// ReferralSource
		ims.domain.lookups.LookupInstance instance6 = domainObject.getReferralSource();
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

			ims.clinical.vo.lookups.ReferralSource voLookup6 = new ims.clinical.vo.lookups.ReferralSource(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.clinical.vo.lookups.ReferralSource parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.clinical.vo.lookups.ReferralSource(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setReferralSource(voLookup6);
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
		ims.domain.lookups.LookupInstance instance14 = domainObject.getReferralPriority();
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

			ims.core.vo.lookups.ReferralPriority voLookup14 = new ims.core.vo.lookups.ReferralPriority(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.core.vo.lookups.ReferralPriority parentVoLookup14 = voLookup14;
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
								parentVoLookup14.setParent(new ims.core.vo.lookups.ReferralPriority(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setReferralPriority(voLookup14);
		}
				// ReasonForReferral
		ims.domain.lookups.LookupInstance instance15 = domainObject.getReasonForReferral();
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

			ims.core.vo.lookups.ReasonForReferral voLookup15 = new ims.core.vo.lookups.ReasonForReferral(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.core.vo.lookups.ReasonForReferral parentVoLookup15 = voLookup15;
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
								parentVoLookup15.setParent(new ims.core.vo.lookups.ReasonForReferral(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setReasonForReferral(voLookup15);
		}
				// SpecialtyFunctionCode
		ims.domain.lookups.LookupInstance instance16 = domainObject.getSpecialtyFunctionCode();
		if ( null != instance16 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance16.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance16.getImage().getImageId(), instance16.getImage().getImagePath());
			}
			color = instance16.getColor();
			if (color != null) 
				color.getValue();

			ims.clinical.vo.lookups.SpecialtyFunctionCode voLookup16 = new ims.clinical.vo.lookups.SpecialtyFunctionCode(instance16.getId(),instance16.getText(), instance16.isActive(), null, img, color);
			ims.clinical.vo.lookups.SpecialtyFunctionCode parentVoLookup16 = voLookup16;
			ims.domain.lookups.LookupInstance parent16 = instance16.getParent();
			while (parent16 != null)
			{
				if (parent16.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent16.getImage().getImageId(), parent16.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent16.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup16.setParent(new ims.clinical.vo.lookups.SpecialtyFunctionCode(parent16.getId(),parent16.getText(), parent16.isActive(), null, img, color));
				parentVoLookup16 = parentVoLookup16.getParent();
								parent16 = parent16.getParent();
			}			
			valueObject.setSpecialtyFunctionCode(voLookup16);
		}
				// ReferredByGP
		valueObject.setReferredByGP(ims.core.vo.domain.GpShortVoAssembler.create(map, domainObject.getReferredByGP()) );
		// ReferralCategory
		ims.domain.lookups.LookupInstance instance18 = domainObject.getReferralCategory();
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

			ims.clinical.vo.lookups.ReferralCategory voLookup18 = new ims.clinical.vo.lookups.ReferralCategory(instance18.getId(),instance18.getText(), instance18.isActive(), null, img, color);
			ims.clinical.vo.lookups.ReferralCategory parentVoLookup18 = voLookup18;
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
								parentVoLookup18.setParent(new ims.clinical.vo.lookups.ReferralCategory(parent18.getId(),parent18.getText(), parent18.isActive(), null, img, color));
				parentVoLookup18 = parentVoLookup18.getParent();
								parent18 = parent18.getParent();
			}			
			valueObject.setReferralCategory(voLookup18);
		}
				// PrimaryPreceeding
		ims.domain.lookups.LookupInstance instance19 = domainObject.getPrimaryPreceeding();
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

			ims.clinical.vo.lookups.PrimaryPreceeding voLookup19 = new ims.clinical.vo.lookups.PrimaryPreceeding(instance19.getId(),instance19.getText(), instance19.isActive(), null, img, color);
			ims.clinical.vo.lookups.PrimaryPreceeding parentVoLookup19 = voLookup19;
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
								parentVoLookup19.setParent(new ims.clinical.vo.lookups.PrimaryPreceeding(parent19.getId(),parent19.getText(), parent19.isActive(), null, img, color));
				parentVoLookup19 = parentVoLookup19.getParent();
								parent19 = parent19.getParent();
			}			
			valueObject.setPrimaryPreceeding(voLookup19);
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
		ims.domain.lookups.LookupInstance instance26 = domainObject.getReferralStatus();
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

			ims.core.vo.lookups.CoreReferralStatus voLookup26 = new ims.core.vo.lookups.CoreReferralStatus(instance26.getId(),instance26.getText(), instance26.isActive(), null, img, color);
			ims.core.vo.lookups.CoreReferralStatus parentVoLookup26 = voLookup26;
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
								parentVoLookup26.setParent(new ims.core.vo.lookups.CoreReferralStatus(parent26.getId(),parent26.getText(), parent26.isActive(), null, img, color));
				parentVoLookup26 = parentVoLookup26.getParent();
								parent26 = parent26.getParent();
			}			
			valueObject.setReferralStatus(voLookup26);
		}
				// UrgentCancerReferralType
		ims.domain.lookups.LookupInstance instance27 = domainObject.getUrgentCancerReferralType();
		if ( null != instance27 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance27.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance27.getImage().getImageId(), instance27.getImage().getImagePath());
			}
			color = instance27.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.UrgentCancerReferralType voLookup27 = new ims.core.vo.lookups.UrgentCancerReferralType(instance27.getId(),instance27.getText(), instance27.isActive(), null, img, color);
			ims.core.vo.lookups.UrgentCancerReferralType parentVoLookup27 = voLookup27;
			ims.domain.lookups.LookupInstance parent27 = instance27.getParent();
			while (parent27 != null)
			{
				if (parent27.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent27.getImage().getImageId(), parent27.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent27.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup27.setParent(new ims.core.vo.lookups.UrgentCancerReferralType(parent27.getId(),parent27.getText(), parent27.isActive(), null, img, color));
				parentVoLookup27 = parentVoLookup27.getParent();
								parent27 = parent27.getParent();
			}			
			valueObject.setUrgentCancerReferralType(voLookup27);
		}
				// CancerStatus
		ims.domain.lookups.LookupInstance instance28 = domainObject.getCancerStatus();
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

			ims.core.vo.lookups.CancerStatus voLookup28 = new ims.core.vo.lookups.CancerStatus(instance28.getId(),instance28.getText(), instance28.isActive(), null, img, color);
			ims.core.vo.lookups.CancerStatus parentVoLookup28 = voLookup28;
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
								parentVoLookup28.setParent(new ims.core.vo.lookups.CancerStatus(parent28.getId(),parent28.getText(), parent28.isActive(), null, img, color));
				parentVoLookup28 = parentVoLookup28.getParent();
								parent28 = parent28.getParent();
			}			
			valueObject.setCancerStatus(voLookup28);
		}
				// DelayReasonGPUrgentReferral
		ims.domain.lookups.LookupInstance instance29 = domainObject.getDelayReasonGPUrgentReferral();
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

			ims.clinical.vo.lookups.DelayReasonGPUrgentReferral voLookup29 = new ims.clinical.vo.lookups.DelayReasonGPUrgentReferral(instance29.getId(),instance29.getText(), instance29.isActive(), null, img, color);
			ims.clinical.vo.lookups.DelayReasonGPUrgentReferral parentVoLookup29 = voLookup29;
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
								parentVoLookup29.setParent(new ims.clinical.vo.lookups.DelayReasonGPUrgentReferral(parent29.getId(),parent29.getText(), parent29.isActive(), null, img, color));
				parentVoLookup29 = parentVoLookup29.getParent();
								parent29 = parent29.getParent();
			}			
			valueObject.setDelayReasonGPUrgentReferral(voLookup29);
		}
				// DelayReasonText
		valueObject.setDelayReasonText(domainObject.getDelayReasonText());
		// SysInfo
		// set system information
		valueObject.setSysInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// RecordingMOS
		valueObject.setRecordingMOS(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getRecordingMOS()) );
		// Discipline
		ims.domain.lookups.LookupInstance instance33 = domainObject.getDiscipline();
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

			ims.clinical.vo.lookups.ReferralDiscipline voLookup33 = new ims.clinical.vo.lookups.ReferralDiscipline(instance33.getId(),instance33.getText(), instance33.isActive(), null, img, color);
			ims.clinical.vo.lookups.ReferralDiscipline parentVoLookup33 = voLookup33;
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
								parentVoLookup33.setParent(new ims.clinical.vo.lookups.ReferralDiscipline(parent33.getId(),parent33.getText(), parent33.isActive(), null, img, color));
				parentVoLookup33 = parentVoLookup33.getParent();
								parent33 = parent33.getParent();
			}			
			valueObject.setDiscipline(voLookup33);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.ReferralsRecording extractReferralsRecording(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ReferralsRecordingVo valueObject) 
	{
		return 	extractReferralsRecording(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.ReferralsRecording extractReferralsRecording(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ReferralsRecordingVo valueObject, HashMap domMap) 
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
			// ims.clinical.vo.ReferralsRecordingVo ID_ReferralsRecording field is unknown
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

		domainObject.setPreceedingReferrals(ims.clinical.vo.domain.ReferralsRecordingVoAssembler.extractReferralsRecordingSet(domainFactory, valueObject.getPreceedingReferrals(), domainObject.getPreceedingReferrals(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReasonForReferralText() != null && valueObject.getReasonForReferralText().equals(""))
		{
			valueObject.setReasonForReferralText(null);
		}
		domainObject.setReasonForReferralText(valueObject.getReasonForReferralText());
		domainObject.setSuppliedReferralDetails(ims.clinical.vo.domain.SuppliedReferralDetailsVoAssembler.extractSuppliedReferralDetails(domainFactory, valueObject.getSuppliedReferralDetails(), domMap));
		domainObject.setAssessment(ims.assessment.vo.domain.PatientAssessmentVoAssembler.extractPatientAssessment(domainFactory, valueObject.getAssessment(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getReferralType() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getReferralType().getID());
		}
		domainObject.setReferralType(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getReferralSource() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getReferralSource().getID());
		}
		domainObject.setReferralSource(value6);
		java.util.Date value7 = null;
		ims.framework.utils.Date date7 = valueObject.getDateSent();		
		if ( date7 != null ) 
		{
			value7 = date7.getDate();
		}
		domainObject.setDateSent(value7);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDetails() != null && valueObject.getDetails().equals(""))
		{
			valueObject.setDetails(null);
		}
		domainObject.setDetails(valueObject.getDetails());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Organisation value9 = null;
		if ( null != valueObject.getRefOrgaCode() ) 
		{
			if (valueObject.getRefOrgaCode().getBoId() == null)
			{
				if (domMap.get(valueObject.getRefOrgaCode()) != null)
				{
					value9 = (ims.core.resource.place.domain.objects.Organisation)domMap.get(valueObject.getRefOrgaCode());
				}
			}
			else
			{
				value9 = (ims.core.resource.place.domain.objects.Organisation)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Organisation.class, valueObject.getRefOrgaCode().getBoId());
			}
		}
		domainObject.setRefOrgaCode(value9);
		java.util.Date value10 = null;
		ims.framework.utils.Date date10 = valueObject.getDateFirstSeen();		
		if ( date10 != null ) 
		{
			value10 = date10.getDate();
		}
		domainObject.setDateFirstSeen(value10);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value11 = null;
		if ( null != valueObject.getReferralHCP() ) 
		{
			if (valueObject.getReferralHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferralHCP()) != null)
				{
					value11 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getReferralHCP());
				}
			}
			else
			{
				value11 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getReferralHCP().getBoId());
			}
		}
		domainObject.setReferralHCP(value11);
		java.util.Date value12 = null;
		ims.framework.utils.Date date12 = valueObject.getDateReceived();		
		if ( date12 != null ) 
		{
			value12 = date12.getDate();
		}
		domainObject.setDateReceived(value12);
		domainObject.setReferredBy(ims.core.vo.domain.HcpAssembler.extractHcp(domainFactory, valueObject.getReferredBy(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getReferralPriority() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getReferralPriority().getID());
		}
		domainObject.setReferralPriority(value14);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getReasonForReferral() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getReasonForReferral().getID());
		}
		domainObject.setReasonForReferral(value15);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getSpecialtyFunctionCode() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getSpecialtyFunctionCode().getID());
		}
		domainObject.setSpecialtyFunctionCode(value16);
		domainObject.setReferredByGP(ims.core.vo.domain.GpShortVoAssembler.extractGp(domainFactory, valueObject.getReferredByGP(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value18 = null;
		if ( null != valueObject.getReferralCategory() ) 
		{
			value18 =
				domainFactory.getLookupInstance(valueObject.getReferralCategory().getID());
		}
		domainObject.setReferralCategory(value18);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value19 = null;
		if ( null != valueObject.getPrimaryPreceeding() ) 
		{
			value19 =
				domainFactory.getLookupInstance(valueObject.getPrimaryPreceeding().getID());
		}
		domainObject.setPrimaryPreceeding(value19);
		domainObject.setAuthoringInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInfo(), domMap));
		ims.core.admin.domain.objects.CareSpell value21 = null;
		if ( null != valueObject.getCareSpell() ) 
		{
			if (valueObject.getCareSpell().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareSpell()) != null)
				{
					value21 = (ims.core.admin.domain.objects.CareSpell)domMap.get(valueObject.getCareSpell());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value21 = domainObject.getCareSpell();	
			}
			else
			{
				value21 = (ims.core.admin.domain.objects.CareSpell)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareSpell.class, valueObject.getCareSpell().getBoId());
			}
		}
		domainObject.setCareSpell(value21);
		ims.core.admin.domain.objects.CareContext value22 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value22 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value22 = domainObject.getCareContext();	
			}
			else
			{
				value22 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value22);
		ims.core.admin.domain.objects.ClinicalContact value23 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value23 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value23 = domainObject.getClinicalContact();	
			}
			else
			{
				value23 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value23);
		domainObject.setSuppliedReferralProfessional(ims.clinical.vo.domain.ReferralProffessionalDetailVoAssembler.extractReferralProfessionalDetail(domainFactory, valueObject.getSuppliedReferralProfessional(), domMap));
		domainObject.setReferredtoLocation(ims.core.vo.domain.LocShortVoAssembler.extractLocation(domainFactory, valueObject.getReferredtoLocation(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value26 = null;
		if ( null != valueObject.getReferralStatus() ) 
		{
			value26 =
				domainFactory.getLookupInstance(valueObject.getReferralStatus().getID());
		}
		domainObject.setReferralStatus(value26);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value27 = null;
		if ( null != valueObject.getUrgentCancerReferralType() ) 
		{
			value27 =
				domainFactory.getLookupInstance(valueObject.getUrgentCancerReferralType().getID());
		}
		domainObject.setUrgentCancerReferralType(value27);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value28 = null;
		if ( null != valueObject.getCancerStatus() ) 
		{
			value28 =
				domainFactory.getLookupInstance(valueObject.getCancerStatus().getID());
		}
		domainObject.setCancerStatus(value28);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value29 = null;
		if ( null != valueObject.getDelayReasonGPUrgentReferral() ) 
		{
			value29 =
				domainFactory.getLookupInstance(valueObject.getDelayReasonGPUrgentReferral().getID());
		}
		domainObject.setDelayReasonGPUrgentReferral(value29);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDelayReasonText() != null && valueObject.getDelayReasonText().equals(""))
		{
			valueObject.setDelayReasonText(null);
		}
		domainObject.setDelayReasonText(valueObject.getDelayReasonText());
		domainObject.setRecordingMOS(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.extractMemberOfStaff(domainFactory, valueObject.getRecordingMOS(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value33 = null;
		if ( null != valueObject.getDiscipline() ) 
		{
			value33 =
				domainFactory.getLookupInstance(valueObject.getDiscipline().getID());
		}
		domainObject.setDiscipline(value33);

		return domainObject;
	}

}
