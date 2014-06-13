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
 * @author Rory Fitzpatrick
 */
public class DischargeFuturePlanVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.DischargeFuturePlanVo copy(ims.clinical.vo.DischargeFuturePlanVo valueObjectDest, ims.clinical.vo.DischargeFuturePlanVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_FuturePlan(valueObjectSrc.getID_FuturePlan());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// HospitalFollowUp
		valueObjectDest.setHospitalFollowUp(valueObjectSrc.getHospitalFollowUp());
		// FollowupIn
		valueObjectDest.setFollowupIn(valueObjectSrc.getFollowupIn());
		// FollowupInInterval
		valueObjectDest.setFollowupInInterval(valueObjectSrc.getFollowupInInterval());
		// FollowupHCP
		valueObjectDest.setFollowupHCP(valueObjectSrc.getFollowupHCP());
		// HospitalPlan
		valueObjectDest.setHospitalPlan(valueObjectSrc.getHospitalPlan());
		// ActionsforGPandCommunity
		valueObjectDest.setActionsforGPandCommunity(valueObjectSrc.getActionsforGPandCommunity());
		// ResultsAwaited
		valueObjectDest.setResultsAwaited(valueObjectSrc.getResultsAwaited());
		// OtherResultsAwaited
		valueObjectDest.setOtherResultsAwaited(valueObjectSrc.getOtherResultsAwaited());
		// MedicalCertificationIssued
		valueObjectDest.setMedicalCertificationIssued(valueObjectSrc.getMedicalCertificationIssued());
		// CertificateExpiresDate
		valueObjectDest.setCertificateExpiresDate(valueObjectSrc.getCertificateExpiresDate());
		// Comments
		valueObjectDest.setComments(valueObjectSrc.getComments());
		// DischargeDetails
		valueObjectDest.setDischargeDetails(valueObjectSrc.getDischargeDetails());
		// RefrainFromWorkUnit
		valueObjectDest.setRefrainFromWorkUnit(valueObjectSrc.getRefrainFromWorkUnit());
		// wasNurseEnabledDischarge
		valueObjectDest.setWasNurseEnabledDischarge(valueObjectSrc.getWasNurseEnabledDischarge());
		// RefrainFromWorkValue
		valueObjectDest.setRefrainFromWorkValue(valueObjectSrc.getRefrainFromWorkValue());
		// FollowUpDetails
		valueObjectDest.setFollowUpDetails(valueObjectSrc.getFollowUpDetails());
		// LinkedSurgicalOperationNote
		valueObjectDest.setLinkedSurgicalOperationNote(valueObjectSrc.getLinkedSurgicalOperationNote());
		// NurseEnabledInstructions
		valueObjectDest.setNurseEnabledInstructions(valueObjectSrc.getNurseEnabledInstructions());
		// isSugicalOpNotesComplete
		valueObjectDest.setIsSugicalOpNotesComplete(valueObjectSrc.getIsSugicalOpNotesComplete());
		// OpNotesActionsforGPandCommunity
		valueObjectDest.setOpNotesActionsforGPandCommunity(valueObjectSrc.getOpNotesActionsforGPandCommunity());
		// OpNotesFollowUpDetails
		valueObjectDest.setOpNotesFollowUpDetails(valueObjectSrc.getOpNotesFollowUpDetails());
		// OpNotesNurseEnabledInstructions
		valueObjectDest.setOpNotesNurseEnabledInstructions(valueObjectSrc.getOpNotesNurseEnabledInstructions());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createDischargeFuturePlanVoCollectionFromFuturePlan(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.edischarge.domain.objects.FuturePlan objects.
	 */
	public static ims.clinical.vo.DischargeFuturePlanVoCollection createDischargeFuturePlanVoCollectionFromFuturePlan(java.util.Set domainObjectSet)	
	{
		return createDischargeFuturePlanVoCollectionFromFuturePlan(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.edischarge.domain.objects.FuturePlan objects.
	 */
	public static ims.clinical.vo.DischargeFuturePlanVoCollection createDischargeFuturePlanVoCollectionFromFuturePlan(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.DischargeFuturePlanVoCollection voList = new ims.clinical.vo.DischargeFuturePlanVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.edischarge.domain.objects.FuturePlan domainObject = (ims.edischarge.domain.objects.FuturePlan) iterator.next();
			ims.clinical.vo.DischargeFuturePlanVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.edischarge.domain.objects.FuturePlan objects.
	 */
	public static ims.clinical.vo.DischargeFuturePlanVoCollection createDischargeFuturePlanVoCollectionFromFuturePlan(java.util.List domainObjectList) 
	{
		return createDischargeFuturePlanVoCollectionFromFuturePlan(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.edischarge.domain.objects.FuturePlan objects.
	 */
	public static ims.clinical.vo.DischargeFuturePlanVoCollection createDischargeFuturePlanVoCollectionFromFuturePlan(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.DischargeFuturePlanVoCollection voList = new ims.clinical.vo.DischargeFuturePlanVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.edischarge.domain.objects.FuturePlan domainObject = (ims.edischarge.domain.objects.FuturePlan) domainObjectList.get(i);
			ims.clinical.vo.DischargeFuturePlanVo vo = create(map, domainObject);

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
	 * Create the ims.edischarge.domain.objects.FuturePlan set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractFuturePlanSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeFuturePlanVoCollection voCollection) 
	 {
	 	return extractFuturePlanSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractFuturePlanSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeFuturePlanVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.DischargeFuturePlanVo vo = voCollection.get(i);
			ims.edischarge.domain.objects.FuturePlan domainObject = DischargeFuturePlanVoAssembler.extractFuturePlan(domainFactory, vo, domMap);

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
	 * Create the ims.edischarge.domain.objects.FuturePlan list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractFuturePlanList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeFuturePlanVoCollection voCollection) 
	 {
	 	return extractFuturePlanList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractFuturePlanList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeFuturePlanVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.DischargeFuturePlanVo vo = voCollection.get(i);
			ims.edischarge.domain.objects.FuturePlan domainObject = DischargeFuturePlanVoAssembler.extractFuturePlan(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.edischarge.domain.objects.FuturePlan object.
	 * @param domainObject ims.edischarge.domain.objects.FuturePlan
	 */
	 public static ims.clinical.vo.DischargeFuturePlanVo create(ims.edischarge.domain.objects.FuturePlan domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.edischarge.domain.objects.FuturePlan object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.DischargeFuturePlanVo create(DomainObjectMap map, ims.edischarge.domain.objects.FuturePlan domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.DischargeFuturePlanVo valueObject = (ims.clinical.vo.DischargeFuturePlanVo) map.getValueObject(domainObject, ims.clinical.vo.DischargeFuturePlanVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.DischargeFuturePlanVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.edischarge.domain.objects.FuturePlan
	 */
	 public static ims.clinical.vo.DischargeFuturePlanVo insert(ims.clinical.vo.DischargeFuturePlanVo valueObject, ims.edischarge.domain.objects.FuturePlan domainObject) 
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
	 * @param domainObject ims.edischarge.domain.objects.FuturePlan
	 */
	 public static ims.clinical.vo.DischargeFuturePlanVo insert(DomainObjectMap map, ims.clinical.vo.DischargeFuturePlanVo valueObject, ims.edischarge.domain.objects.FuturePlan domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_FuturePlan(domainObject.getId());
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
		// HospitalFollowUp
		ims.domain.lookups.LookupInstance instance2 = domainObject.getHospitalFollowUp();
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

			ims.core.vo.lookups.YesNo voLookup2 = new ims.core.vo.lookups.YesNo(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.YesNo(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setHospitalFollowUp(voLookup2);
		}
				// FollowupIn
		valueObject.setFollowupIn(domainObject.getFollowupIn());
		// FollowupInInterval
		ims.domain.lookups.LookupInstance instance4 = domainObject.getFollowupInInterval();
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

			ims.core.vo.lookups.TimeUnitsSecondsToMonths voLookup4 = new ims.core.vo.lookups.TimeUnitsSecondsToMonths(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.TimeUnitsSecondsToMonths parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.TimeUnitsSecondsToMonths(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setFollowupInInterval(voLookup4);
		}
				// FollowupHCP
		valueObject.setFollowupHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getFollowupHCP()) );
		// HospitalPlan
		valueObject.setHospitalPlan(domainObject.getHospitalPlan());
		// ActionsforGPandCommunity
		valueObject.setActionsforGPandCommunity(domainObject.getActionsforGPandCommunity());
		// ResultsAwaited
		valueObject.setResultsAwaited(ims.ocrr.vo.domain.OrderInvestigationBookingVoAssembler.createOrderInvestigationBookingVoCollectionFromOrderInvestigation(map, domainObject.getResultsAwaited()) );
		// OtherResultsAwaited
		valueObject.setOtherResultsAwaited(domainObject.getOtherResultsAwaited());
		// MedicalCertificationIssued
		ims.domain.lookups.LookupInstance instance10 = domainObject.getMedicalCertificationIssued();
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

			ims.core.vo.lookups.YesNo voLookup10 = new ims.core.vo.lookups.YesNo(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.core.vo.lookups.YesNo(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setMedicalCertificationIssued(voLookup10);
		}
				// CertificateExpiresDate
		java.util.Date CertificateExpiresDate = domainObject.getCertificateExpiresDate();
		if ( null != CertificateExpiresDate ) 
		{
			valueObject.setCertificateExpiresDate(new ims.framework.utils.Date(CertificateExpiresDate) );
		}
		// Comments
		valueObject.setComments(domainObject.getComments());
		// DischargeDetails
		valueObject.setDischargeDetails(ims.clinical.vo.domain.DischargeDetailsVoAssembler.create(map, domainObject.getDischargeDetails()) );
		// RefrainFromWorkUnit
		ims.domain.lookups.LookupInstance instance14 = domainObject.getRefrainFromWorkUnit();
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

			ims.core.vo.lookups.TimeDaystoYears voLookup14 = new ims.core.vo.lookups.TimeDaystoYears(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.core.vo.lookups.TimeDaystoYears parentVoLookup14 = voLookup14;
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
								parentVoLookup14.setParent(new ims.core.vo.lookups.TimeDaystoYears(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setRefrainFromWorkUnit(voLookup14);
		}
				// wasNurseEnabledDischarge
		valueObject.setWasNurseEnabledDischarge( domainObject.isWasNurseEnabledDischarge() );
		// RefrainFromWorkValue
		valueObject.setRefrainFromWorkValue(domainObject.getRefrainFromWorkValue());
		// FollowUpDetails
		valueObject.setFollowUpDetails(ims.clinical.vo.domain.DischargeFuturePlanFollowUpVoAssembler.createDischargeFuturePlanFollowUpVoCollectionFromFuturePlanFollowUp(map, domainObject.getFollowUpDetails()) );
		// LinkedSurgicalOperationNote
		valueObject.setLinkedSurgicalOperationNote(ims.clinical.vo.domain.SurgicalOperationNotesVoAssembler.create(map, domainObject.getLinkedSurgicalOperationNote()) );
		// NurseEnabledInstructions
		valueObject.setNurseEnabledInstructions(ims.clinical.vo.domain.NurseEnabledInstructionsVoAssembler.create(map, domainObject.getNurseEnabledInstructions()) );
		// isSugicalOpNotesComplete
		valueObject.setIsSugicalOpNotesComplete( domainObject.isIsSugicalOpNotesComplete() );
		// OpNotesActionsforGPandCommunity
		valueObject.setOpNotesActionsforGPandCommunity(domainObject.getOpNotesActionsforGPandCommunity());
		// OpNotesFollowUpDetails
		valueObject.setOpNotesFollowUpDetails(ims.clinical.vo.domain.DischargeFuturePlanFollowUpVoAssembler.createDischargeFuturePlanFollowUpVoCollectionFromFuturePlanFollowUp(map, domainObject.getOpNotesFollowUpDetails()) );
		// OpNotesNurseEnabledInstructions
		valueObject.setOpNotesNurseEnabledInstructions(ims.clinical.vo.domain.NurseEnabledInstructionsVoAssembler.create(map, domainObject.getOpNotesNurseEnabledInstructions()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.edischarge.domain.objects.FuturePlan extractFuturePlan(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeFuturePlanVo valueObject) 
	{
		return 	extractFuturePlan(domainFactory, valueObject, new HashMap());
	}

	public static ims.edischarge.domain.objects.FuturePlan extractFuturePlan(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeFuturePlanVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_FuturePlan();
		ims.edischarge.domain.objects.FuturePlan domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.edischarge.domain.objects.FuturePlan)domMap.get(valueObject);
			}
			// ims.clinical.vo.DischargeFuturePlanVo ID_FuturePlan field is unknown
			domainObject = new ims.edischarge.domain.objects.FuturePlan();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_FuturePlan());
			if (domMap.get(key) != null)
			{
				return (ims.edischarge.domain.objects.FuturePlan)domMap.get(key);
			}
			domainObject = (ims.edischarge.domain.objects.FuturePlan) domainFactory.getDomainObject(ims.edischarge.domain.objects.FuturePlan.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_FuturePlan());

		ims.core.admin.domain.objects.CareContext value1 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value1 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getCareContext();	
			}
			else
			{
				value1 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getHospitalFollowUp() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getHospitalFollowUp().getID());
		}
		domainObject.setHospitalFollowUp(value2);
		domainObject.setFollowupIn(valueObject.getFollowupIn());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getFollowupInInterval() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getFollowupInInterval().getID());
		}
		domainObject.setFollowupInInterval(value4);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value5 = null;
		if ( null != valueObject.getFollowupHCP() ) 
		{
			if (valueObject.getFollowupHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getFollowupHCP()) != null)
				{
					value5 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getFollowupHCP());
				}
			}
			else
			{
				value5 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getFollowupHCP().getBoId());
			}
		}
		domainObject.setFollowupHCP(value5);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getHospitalPlan() != null && valueObject.getHospitalPlan().equals(""))
		{
			valueObject.setHospitalPlan(null);
		}
		domainObject.setHospitalPlan(valueObject.getHospitalPlan());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getActionsforGPandCommunity() != null && valueObject.getActionsforGPandCommunity().equals(""))
		{
			valueObject.setActionsforGPandCommunity(null);
		}
		domainObject.setActionsforGPandCommunity(valueObject.getActionsforGPandCommunity());

		// SaveAsRefVO treated as RefValueObject
		ims.ocrr.orderingresults.vo.OrderInvestigationRefVoCollection refCollection8 = new ims.ocrr.orderingresults.vo.OrderInvestigationRefVoCollection();
		if (valueObject.getResultsAwaited() != null)
		{
			for (int i8=0; i8<valueObject.getResultsAwaited().size(); i8++)
			{
				ims.ocrr.orderingresults.vo.OrderInvestigationRefVo ref8 = (ims.ocrr.orderingresults.vo.OrderInvestigationRefVo)valueObject.getResultsAwaited().get(i8);
				refCollection8.add(ref8);
			}
		}
		int size8 = (null == refCollection8) ? 0 : refCollection8.size();		
		java.util.Set domainResultsAwaited8 = domainObject.getResultsAwaited();
		if (domainResultsAwaited8 == null)
		{
			domainResultsAwaited8 = new java.util.HashSet();
		}
		java.util.Set newSet8  = new java.util.HashSet();
		for(int i=0; i<size8; i++) 
		{
			ims.ocrr.orderingresults.vo.OrderInvestigationRefVo vo = refCollection8.get(i);					
			ims.ocrr.orderingresults.domain.objects.OrderInvestigation dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation)domainFactory.getDomainObject( ims.ocrr.orderingresults.domain.objects.OrderInvestigation.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainResultsAwaited8.contains(dom))
			{
				domainResultsAwaited8.add(dom);
			}
			newSet8.add(dom);			
		}
		java.util.Set removedSet8 = new java.util.HashSet();
		java.util.Iterator iter8 = domainResultsAwaited8.iterator();
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
			domainResultsAwaited8.remove(iter8.next());
		}		
		
		domainObject.setResultsAwaited(domainResultsAwaited8);		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOtherResultsAwaited() != null && valueObject.getOtherResultsAwaited().equals(""))
		{
			valueObject.setOtherResultsAwaited(null);
		}
		domainObject.setOtherResultsAwaited(valueObject.getOtherResultsAwaited());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getMedicalCertificationIssued() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getMedicalCertificationIssued().getID());
		}
		domainObject.setMedicalCertificationIssued(value10);
		java.util.Date value11 = null;
		ims.framework.utils.Date date11 = valueObject.getCertificateExpiresDate();		
		if ( date11 != null ) 
		{
			value11 = date11.getDate();
		}
		domainObject.setCertificateExpiresDate(value11);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComments() != null && valueObject.getComments().equals(""))
		{
			valueObject.setComments(null);
		}
		domainObject.setComments(valueObject.getComments());
		domainObject.setDischargeDetails(ims.clinical.vo.domain.DischargeDetailsVoAssembler.extractDischargeDetails(domainFactory, valueObject.getDischargeDetails(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getRefrainFromWorkUnit() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getRefrainFromWorkUnit().getID());
		}
		domainObject.setRefrainFromWorkUnit(value14);
		domainObject.setWasNurseEnabledDischarge(valueObject.getWasNurseEnabledDischarge());
		domainObject.setRefrainFromWorkValue(valueObject.getRefrainFromWorkValue());
		domainObject.setFollowUpDetails(ims.clinical.vo.domain.DischargeFuturePlanFollowUpVoAssembler.extractFuturePlanFollowUpSet(domainFactory, valueObject.getFollowUpDetails(), domainObject.getFollowUpDetails(), domMap));		
		domainObject.setLinkedSurgicalOperationNote(ims.clinical.vo.domain.SurgicalOperationNotesVoAssembler.extractSurgicalOperationNotes(domainFactory, valueObject.getLinkedSurgicalOperationNote(), domMap));
		domainObject.setNurseEnabledInstructions(ims.clinical.vo.domain.NurseEnabledInstructionsVoAssembler.extractNurseEnabledInstructions(domainFactory, valueObject.getNurseEnabledInstructions(), domMap));
		domainObject.setIsSugicalOpNotesComplete(valueObject.getIsSugicalOpNotesComplete());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOpNotesActionsforGPandCommunity() != null && valueObject.getOpNotesActionsforGPandCommunity().equals(""))
		{
			valueObject.setOpNotesActionsforGPandCommunity(null);
		}
		domainObject.setOpNotesActionsforGPandCommunity(valueObject.getOpNotesActionsforGPandCommunity());
		domainObject.setOpNotesFollowUpDetails(ims.clinical.vo.domain.DischargeFuturePlanFollowUpVoAssembler.extractFuturePlanFollowUpSet(domainFactory, valueObject.getOpNotesFollowUpDetails(), domainObject.getOpNotesFollowUpDetails(), domMap));		
		domainObject.setOpNotesNurseEnabledInstructions(ims.clinical.vo.domain.NurseEnabledInstructionsVoAssembler.extractNurseEnabledInstructions(domainFactory, valueObject.getOpNotesNurseEnabledInstructions(), domMap));

		return domainObject;
	}

}
