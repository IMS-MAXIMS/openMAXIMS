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
package ims.oncology.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Barbara Worwood
 */
public class WaitingTimesVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.oncology.vo.WaitingTimesVo copy(ims.oncology.vo.WaitingTimesVo valueObjectDest, ims.oncology.vo.WaitingTimesVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_WaitingTimes(valueObjectSrc.getID_WaitingTimes());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// NHSNumber
		valueObjectDest.setNHSNumber(valueObjectSrc.getNHSNumber());
		// ReferralSource
		valueObjectDest.setReferralSource(valueObjectSrc.getReferralSource());
		// RefDecisionDate
		valueObjectDest.setRefDecisionDate(valueObjectSrc.getRefDecisionDate());
		// RefReceivedDate
		valueObjectDest.setRefReceivedDate(valueObjectSrc.getRefReceivedDate());
		// PriorityCode
		valueObjectDest.setPriorityCode(valueObjectSrc.getPriorityCode());
		// ReferralType
		valueObjectDest.setReferralType(valueObjectSrc.getReferralType());
		// FirstSeenDate
		valueObjectDest.setFirstSeenDate(valueObjectSrc.getFirstSeenDate());
		// FirstSeenOrgaCode
		valueObjectDest.setFirstSeenOrgaCode(valueObjectSrc.getFirstSeenOrgaCode());
		// WTAdjustmentFS
		valueObjectDest.setWTAdjustmentFS(valueObjectSrc.getWTAdjustmentFS());
		// WTAdjustmentReasonFS
		valueObjectDest.setWTAdjustmentReasonFS(valueObjectSrc.getWTAdjustmentReasonFS());
		// BreachReason
		valueObjectDest.setBreachReason(valueObjectSrc.getBreachReason());
		// DelayReasonRefFirstSeen
		valueObjectDest.setDelayReasonRefFirstSeen(valueObjectSrc.getDelayReasonRefFirstSeen());
		// SpecReferralDate
		valueObjectDest.setSpecReferralDate(valueObjectSrc.getSpecReferralDate());
		// ReferredBy
		valueObjectDest.setReferredBy(valueObjectSrc.getReferredBy());
		// SpecDateFirstSeen
		valueObjectDest.setSpecDateFirstSeen(valueObjectSrc.getSpecDateFirstSeen());
		// SpecOrgCode
		valueObjectDest.setSpecOrgCode(valueObjectSrc.getSpecOrgCode());
		// ClinlInterventionDate
		valueObjectDest.setClinlInterventionDate(valueObjectSrc.getClinlInterventionDate());
		// ClinInterventionOrgCode
		valueObjectDest.setClinInterventionOrgCode(valueObjectSrc.getClinInterventionOrgCode());
		// MDTDiscussInd
		valueObjectDest.setMDTDiscussInd(valueObjectSrc.getMDTDiscussInd());
		// MDTDiscussDate
		valueObjectDest.setMDTDiscussDate(valueObjectSrc.getMDTDiscussDate());
		// CancerStatus
		valueObjectDest.setCancerStatus(valueObjectSrc.getCancerStatus());
		// PrimaryDiagnosis
		valueObjectDest.setPrimaryDiagnosis(valueObjectSrc.getPrimaryDiagnosis());
		// TumourLaterality
		valueObjectDest.setTumourLaterality(valueObjectSrc.getTumourLaterality());
		// DDTDateSurgery
		valueObjectDest.setDDTDateSurgery(valueObjectSrc.getDDTDateSurgery());
		// DDTDateChemo
		valueObjectDest.setDDTDateChemo(valueObjectSrc.getDDTDateChemo());
		// DDTDateTele
		valueObjectDest.setDDTDateTele(valueObjectSrc.getDDTDateTele());
		// DDTDateBrachy
		valueObjectDest.setDDTDateBrachy(valueObjectSrc.getDDTDateBrachy());
		// DDTDatePalliative
		valueObjectDest.setDDTDatePalliative(valueObjectSrc.getDDTDatePalliative());
		// DDTDateActiveMon
		valueObjectDest.setDDTDateActiveMon(valueObjectSrc.getDDTDateActiveMon());
		// DDTOrgCode
		valueObjectDest.setDDTOrgCode(valueObjectSrc.getDDTOrgCode());
		// WTAdjustmentTreat
		valueObjectDest.setWTAdjustmentTreat(valueObjectSrc.getWTAdjustmentTreat());
		// WTAdjustmentReasonTreat
		valueObjectDest.setWTAdjustmentReasonTreat(valueObjectSrc.getWTAdjustmentReasonTreat());
		// PlanCancerTreatType
		valueObjectDest.setPlanCancerTreatType(valueObjectSrc.getPlanCancerTreatType());
		// FirstTreatmentDateSurg
		valueObjectDest.setFirstTreatmentDateSurg(valueObjectSrc.getFirstTreatmentDateSurg());
		// FirstTreatmentDateChemo
		valueObjectDest.setFirstTreatmentDateChemo(valueObjectSrc.getFirstTreatmentDateChemo());
		// FirstTreatmentDateTele
		valueObjectDest.setFirstTreatmentDateTele(valueObjectSrc.getFirstTreatmentDateTele());
		// FirstTreatmentDateBrachy
		valueObjectDest.setFirstTreatmentDateBrachy(valueObjectSrc.getFirstTreatmentDateBrachy());
		// FirstTreatmentDateSPCare
		valueObjectDest.setFirstTreatmentDateSPCare(valueObjectSrc.getFirstTreatmentDateSPCare());
		// FirstTreatmentDateActiveMon
		valueObjectDest.setFirstTreatmentDateActiveMon(valueObjectSrc.getFirstTreatmentDateActiveMon());
		// FirstTreatmentOrgCode
		valueObjectDest.setFirstTreatmentOrgCode(valueObjectSrc.getFirstTreatmentOrgCode());
		// WTAdjustFirstTreat
		valueObjectDest.setWTAdjustFirstTreat(valueObjectSrc.getWTAdjustFirstTreat());
		// WTAdjustmentReasonFT
		valueObjectDest.setWTAdjustmentReasonFT(valueObjectSrc.getWTAdjustmentReasonFT());
		// DelayReasonDTT
		valueObjectDest.setDelayReasonDTT(valueObjectSrc.getDelayReasonDTT());
		// DelayReasonRTT
		valueObjectDest.setDelayReasonRTT(valueObjectSrc.getDelayReasonRTT());
		// DelayCodeDTT
		valueObjectDest.setDelayCodeDTT(valueObjectSrc.getDelayCodeDTT());
		// DelayCodeRTT
		valueObjectDest.setDelayCodeRTT(valueObjectSrc.getDelayCodeRTT());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createWaitingTimesVoCollectionFromWaitingTimes(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.waitingtimes.domain.objects.WaitingTimes objects.
	 */
	public static ims.oncology.vo.WaitingTimesVoCollection createWaitingTimesVoCollectionFromWaitingTimes(java.util.Set domainObjectSet)	
	{
		return createWaitingTimesVoCollectionFromWaitingTimes(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.waitingtimes.domain.objects.WaitingTimes objects.
	 */
	public static ims.oncology.vo.WaitingTimesVoCollection createWaitingTimesVoCollectionFromWaitingTimes(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.oncology.vo.WaitingTimesVoCollection voList = new ims.oncology.vo.WaitingTimesVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.oncology.waitingtimes.domain.objects.WaitingTimes domainObject = (ims.oncology.waitingtimes.domain.objects.WaitingTimes) iterator.next();
			ims.oncology.vo.WaitingTimesVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.oncology.waitingtimes.domain.objects.WaitingTimes objects.
	 */
	public static ims.oncology.vo.WaitingTimesVoCollection createWaitingTimesVoCollectionFromWaitingTimes(java.util.List domainObjectList) 
	{
		return createWaitingTimesVoCollectionFromWaitingTimes(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.waitingtimes.domain.objects.WaitingTimes objects.
	 */
	public static ims.oncology.vo.WaitingTimesVoCollection createWaitingTimesVoCollectionFromWaitingTimes(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.oncology.vo.WaitingTimesVoCollection voList = new ims.oncology.vo.WaitingTimesVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.waitingtimes.domain.objects.WaitingTimes domainObject = (ims.oncology.waitingtimes.domain.objects.WaitingTimes) domainObjectList.get(i);
			ims.oncology.vo.WaitingTimesVo vo = create(map, domainObject);

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
	 * Create the ims.oncology.waitingtimes.domain.objects.WaitingTimes set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractWaitingTimesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.WaitingTimesVoCollection voCollection) 
	 {
	 	return extractWaitingTimesSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractWaitingTimesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.WaitingTimesVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.WaitingTimesVo vo = voCollection.get(i);
			ims.oncology.waitingtimes.domain.objects.WaitingTimes domainObject = WaitingTimesVoAssembler.extractWaitingTimes(domainFactory, vo, domMap);

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
	 * Create the ims.oncology.waitingtimes.domain.objects.WaitingTimes list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractWaitingTimesList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.WaitingTimesVoCollection voCollection) 
	 {
	 	return extractWaitingTimesList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractWaitingTimesList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.WaitingTimesVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.WaitingTimesVo vo = voCollection.get(i);
			ims.oncology.waitingtimes.domain.objects.WaitingTimes domainObject = WaitingTimesVoAssembler.extractWaitingTimes(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.oncology.waitingtimes.domain.objects.WaitingTimes object.
	 * @param domainObject ims.oncology.waitingtimes.domain.objects.WaitingTimes
	 */
	 public static ims.oncology.vo.WaitingTimesVo create(ims.oncology.waitingtimes.domain.objects.WaitingTimes domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.oncology.waitingtimes.domain.objects.WaitingTimes object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.oncology.vo.WaitingTimesVo create(DomainObjectMap map, ims.oncology.waitingtimes.domain.objects.WaitingTimes domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.oncology.vo.WaitingTimesVo valueObject = (ims.oncology.vo.WaitingTimesVo) map.getValueObject(domainObject, ims.oncology.vo.WaitingTimesVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.oncology.vo.WaitingTimesVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.oncology.waitingtimes.domain.objects.WaitingTimes
	 */
	 public static ims.oncology.vo.WaitingTimesVo insert(ims.oncology.vo.WaitingTimesVo valueObject, ims.oncology.waitingtimes.domain.objects.WaitingTimes domainObject) 
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
	 * @param domainObject ims.oncology.waitingtimes.domain.objects.WaitingTimes
	 */
	 public static ims.oncology.vo.WaitingTimesVo insert(DomainObjectMap map, ims.oncology.vo.WaitingTimesVo valueObject, ims.oncology.waitingtimes.domain.objects.WaitingTimes domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_WaitingTimes(domainObject.getId());
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
			
		// NHSNumber
		valueObject.setNHSNumber(domainObject.getNHSNumber());
		// ReferralSource
		valueObject.setReferralSource(domainObject.getReferralSource());
		// RefDecisionDate
		java.util.Date RefDecisionDate = domainObject.getRefDecisionDate();
		if ( null != RefDecisionDate ) 
		{
			valueObject.setRefDecisionDate(new ims.framework.utils.Date(RefDecisionDate) );
		}
		// RefReceivedDate
		java.util.Date RefReceivedDate = domainObject.getRefReceivedDate();
		if ( null != RefReceivedDate ) 
		{
			valueObject.setRefReceivedDate(new ims.framework.utils.Date(RefReceivedDate) );
		}
		// PriorityCode
		valueObject.setPriorityCode(domainObject.getPriorityCode());
		// ReferralType
		valueObject.setReferralType(domainObject.getReferralType());
		// FirstSeenDate
		java.util.Date FirstSeenDate = domainObject.getFirstSeenDate();
		if ( null != FirstSeenDate ) 
		{
			valueObject.setFirstSeenDate(new ims.framework.utils.Date(FirstSeenDate) );
		}
		// FirstSeenOrgaCode
		valueObject.setFirstSeenOrgaCode(domainObject.getFirstSeenOrgaCode());
		// WTAdjustmentFS
		valueObject.setWTAdjustmentFS(domainObject.getWTAdjustmentFS());
		// WTAdjustmentReasonFS
		valueObject.setWTAdjustmentReasonFS(domainObject.getWTAdjustmentReasonFS());
		// BreachReason
		valueObject.setBreachReason(domainObject.getBreachReason());
		// DelayReasonRefFirstSeen
		valueObject.setDelayReasonRefFirstSeen(domainObject.getDelayReasonRefFirstSeen());
		// SpecReferralDate
		java.util.Date SpecReferralDate = domainObject.getSpecReferralDate();
		if ( null != SpecReferralDate ) 
		{
			valueObject.setSpecReferralDate(new ims.framework.utils.Date(SpecReferralDate) );
		}
		// ReferredBy
		valueObject.setReferredBy(domainObject.getReferredBy());
		// SpecDateFirstSeen
		java.util.Date SpecDateFirstSeen = domainObject.getSpecDateFirstSeen();
		if ( null != SpecDateFirstSeen ) 
		{
			valueObject.setSpecDateFirstSeen(new ims.framework.utils.Date(SpecDateFirstSeen) );
		}
		// SpecOrgCode
		valueObject.setSpecOrgCode(domainObject.getSpecOrgCode());
		// ClinlInterventionDate
		java.util.Date ClinlInterventionDate = domainObject.getClinlInterventionDate();
		if ( null != ClinlInterventionDate ) 
		{
			valueObject.setClinlInterventionDate(new ims.framework.utils.Date(ClinlInterventionDate) );
		}
		// ClinInterventionOrgCode
		valueObject.setClinInterventionOrgCode(domainObject.getClinInterventionOrgCode());
		// MDTDiscussInd
		valueObject.setMDTDiscussInd(domainObject.getMDTDiscussInd());
		// MDTDiscussDate
		java.util.Date MDTDiscussDate = domainObject.getMDTDiscussDate();
		if ( null != MDTDiscussDate ) 
		{
			valueObject.setMDTDiscussDate(new ims.framework.utils.Date(MDTDiscussDate) );
		}
		// CancerStatus
		valueObject.setCancerStatus(domainObject.getCancerStatus());
		// PrimaryDiagnosis
		valueObject.setPrimaryDiagnosis(domainObject.getPrimaryDiagnosis());
		// TumourLaterality
		valueObject.setTumourLaterality(domainObject.getTumourLaterality());
		// DDTDateSurgery
		java.util.Date DDTDateSurgery = domainObject.getDDTDateSurgery();
		if ( null != DDTDateSurgery ) 
		{
			valueObject.setDDTDateSurgery(new ims.framework.utils.Date(DDTDateSurgery) );
		}
		// DDTDateChemo
		java.util.Date DDTDateChemo = domainObject.getDDTDateChemo();
		if ( null != DDTDateChemo ) 
		{
			valueObject.setDDTDateChemo(new ims.framework.utils.Date(DDTDateChemo) );
		}
		// DDTDateTele
		java.util.Date DDTDateTele = domainObject.getDDTDateTele();
		if ( null != DDTDateTele ) 
		{
			valueObject.setDDTDateTele(new ims.framework.utils.Date(DDTDateTele) );
		}
		// DDTDateBrachy
		java.util.Date DDTDateBrachy = domainObject.getDDTDateBrachy();
		if ( null != DDTDateBrachy ) 
		{
			valueObject.setDDTDateBrachy(new ims.framework.utils.Date(DDTDateBrachy) );
		}
		// DDTDatePalliative
		java.util.Date DDTDatePalliative = domainObject.getDDTDatePalliative();
		if ( null != DDTDatePalliative ) 
		{
			valueObject.setDDTDatePalliative(new ims.framework.utils.Date(DDTDatePalliative) );
		}
		// DDTDateActiveMon
		java.util.Date DDTDateActiveMon = domainObject.getDDTDateActiveMon();
		if ( null != DDTDateActiveMon ) 
		{
			valueObject.setDDTDateActiveMon(new ims.framework.utils.Date(DDTDateActiveMon) );
		}
		// DDTOrgCode
		valueObject.setDDTOrgCode(domainObject.getDDTOrgCode());
		// WTAdjustmentTreat
		valueObject.setWTAdjustmentTreat(domainObject.getWTAdjustmentTreat());
		// WTAdjustmentReasonTreat
		valueObject.setWTAdjustmentReasonTreat(domainObject.getWTAdjustmentReasonTreat());
		// PlanCancerTreatType
		valueObject.setPlanCancerTreatType(domainObject.getPlanCancerTreatType());
		// FirstTreatmentDateSurg
		java.util.Date FirstTreatmentDateSurg = domainObject.getFirstTreatmentDateSurg();
		if ( null != FirstTreatmentDateSurg ) 
		{
			valueObject.setFirstTreatmentDateSurg(new ims.framework.utils.Date(FirstTreatmentDateSurg) );
		}
		// FirstTreatmentDateChemo
		java.util.Date FirstTreatmentDateChemo = domainObject.getFirstTreatmentDateChemo();
		if ( null != FirstTreatmentDateChemo ) 
		{
			valueObject.setFirstTreatmentDateChemo(new ims.framework.utils.Date(FirstTreatmentDateChemo) );
		}
		// FirstTreatmentDateTele
		java.util.Date FirstTreatmentDateTele = domainObject.getFirstTreatmentDateTele();
		if ( null != FirstTreatmentDateTele ) 
		{
			valueObject.setFirstTreatmentDateTele(new ims.framework.utils.Date(FirstTreatmentDateTele) );
		}
		// FirstTreatmentDateBrachy
		java.util.Date FirstTreatmentDateBrachy = domainObject.getFirstTreatmentDateBrachy();
		if ( null != FirstTreatmentDateBrachy ) 
		{
			valueObject.setFirstTreatmentDateBrachy(new ims.framework.utils.Date(FirstTreatmentDateBrachy) );
		}
		// FirstTreatmentDateSPCare
		java.util.Date FirstTreatmentDateSPCare = domainObject.getFirstTreatmentDateSPCare();
		if ( null != FirstTreatmentDateSPCare ) 
		{
			valueObject.setFirstTreatmentDateSPCare(new ims.framework.utils.Date(FirstTreatmentDateSPCare) );
		}
		// FirstTreatmentDateActiveMon
		java.util.Date FirstTreatmentDateActiveMon = domainObject.getFirstTreatmentDateActiveMon();
		if ( null != FirstTreatmentDateActiveMon ) 
		{
			valueObject.setFirstTreatmentDateActiveMon(new ims.framework.utils.Date(FirstTreatmentDateActiveMon) );
		}
		// FirstTreatmentOrgCode
		valueObject.setFirstTreatmentOrgCode(domainObject.getFirstTreatmentOrgCode());
		// WTAdjustFirstTreat
		valueObject.setWTAdjustFirstTreat(domainObject.getWTAdjustFirstTreat());
		// WTAdjustmentReasonFT
		valueObject.setWTAdjustmentReasonFT(domainObject.getWTAdjustmentReasonFT());
		// DelayReasonDTT
		valueObject.setDelayReasonDTT(domainObject.getDelayReasonDTT());
		// DelayReasonRTT
		valueObject.setDelayReasonRTT(domainObject.getDelayReasonRTT());
		// DelayCodeDTT
		valueObject.setDelayCodeDTT(domainObject.getDelayCodeDTT());
		// DelayCodeRTT
		valueObject.setDelayCodeRTT(domainObject.getDelayCodeRTT());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.waitingtimes.domain.objects.WaitingTimes extractWaitingTimes(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.WaitingTimesVo valueObject) 
	{
		return 	extractWaitingTimes(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.waitingtimes.domain.objects.WaitingTimes extractWaitingTimes(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.WaitingTimesVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_WaitingTimes();
		ims.oncology.waitingtimes.domain.objects.WaitingTimes domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.oncology.waitingtimes.domain.objects.WaitingTimes)domMap.get(valueObject);
			}
			// ims.oncology.vo.WaitingTimesVo ID_WaitingTimes field is unknown
			domainObject = new ims.oncology.waitingtimes.domain.objects.WaitingTimes();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_WaitingTimes());
			if (domMap.get(key) != null)
			{
				return (ims.oncology.waitingtimes.domain.objects.WaitingTimes)domMap.get(key);
			}
			domainObject = (ims.oncology.waitingtimes.domain.objects.WaitingTimes) domainFactory.getDomainObject(ims.oncology.waitingtimes.domain.objects.WaitingTimes.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_WaitingTimes());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNHSNumber() != null && valueObject.getNHSNumber().equals(""))
		{
			valueObject.setNHSNumber(null);
		}
		domainObject.setNHSNumber(valueObject.getNHSNumber());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReferralSource() != null && valueObject.getReferralSource().equals(""))
		{
			valueObject.setReferralSource(null);
		}
		domainObject.setReferralSource(valueObject.getReferralSource());
		java.util.Date value3 = null;
		ims.framework.utils.Date date3 = valueObject.getRefDecisionDate();		
		if ( date3 != null ) 
		{
			value3 = date3.getDate();
		}
		domainObject.setRefDecisionDate(value3);
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getRefReceivedDate();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setRefReceivedDate(value4);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPriorityCode() != null && valueObject.getPriorityCode().equals(""))
		{
			valueObject.setPriorityCode(null);
		}
		domainObject.setPriorityCode(valueObject.getPriorityCode());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReferralType() != null && valueObject.getReferralType().equals(""))
		{
			valueObject.setReferralType(null);
		}
		domainObject.setReferralType(valueObject.getReferralType());
		java.util.Date value7 = null;
		ims.framework.utils.Date date7 = valueObject.getFirstSeenDate();		
		if ( date7 != null ) 
		{
			value7 = date7.getDate();
		}
		domainObject.setFirstSeenDate(value7);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getFirstSeenOrgaCode() != null && valueObject.getFirstSeenOrgaCode().equals(""))
		{
			valueObject.setFirstSeenOrgaCode(null);
		}
		domainObject.setFirstSeenOrgaCode(valueObject.getFirstSeenOrgaCode());
		domainObject.setWTAdjustmentFS(valueObject.getWTAdjustmentFS());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getWTAdjustmentReasonFS() != null && valueObject.getWTAdjustmentReasonFS().equals(""))
		{
			valueObject.setWTAdjustmentReasonFS(null);
		}
		domainObject.setWTAdjustmentReasonFS(valueObject.getWTAdjustmentReasonFS());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getBreachReason() != null && valueObject.getBreachReason().equals(""))
		{
			valueObject.setBreachReason(null);
		}
		domainObject.setBreachReason(valueObject.getBreachReason());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDelayReasonRefFirstSeen() != null && valueObject.getDelayReasonRefFirstSeen().equals(""))
		{
			valueObject.setDelayReasonRefFirstSeen(null);
		}
		domainObject.setDelayReasonRefFirstSeen(valueObject.getDelayReasonRefFirstSeen());
		java.util.Date value13 = null;
		ims.framework.utils.Date date13 = valueObject.getSpecReferralDate();		
		if ( date13 != null ) 
		{
			value13 = date13.getDate();
		}
		domainObject.setSpecReferralDate(value13);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReferredBy() != null && valueObject.getReferredBy().equals(""))
		{
			valueObject.setReferredBy(null);
		}
		domainObject.setReferredBy(valueObject.getReferredBy());
		java.util.Date value15 = null;
		ims.framework.utils.Date date15 = valueObject.getSpecDateFirstSeen();		
		if ( date15 != null ) 
		{
			value15 = date15.getDate();
		}
		domainObject.setSpecDateFirstSeen(value15);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSpecOrgCode() != null && valueObject.getSpecOrgCode().equals(""))
		{
			valueObject.setSpecOrgCode(null);
		}
		domainObject.setSpecOrgCode(valueObject.getSpecOrgCode());
		java.util.Date value17 = null;
		ims.framework.utils.Date date17 = valueObject.getClinlInterventionDate();		
		if ( date17 != null ) 
		{
			value17 = date17.getDate();
		}
		domainObject.setClinlInterventionDate(value17);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getClinInterventionOrgCode() != null && valueObject.getClinInterventionOrgCode().equals(""))
		{
			valueObject.setClinInterventionOrgCode(null);
		}
		domainObject.setClinInterventionOrgCode(valueObject.getClinInterventionOrgCode());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getMDTDiscussInd() != null && valueObject.getMDTDiscussInd().equals(""))
		{
			valueObject.setMDTDiscussInd(null);
		}
		domainObject.setMDTDiscussInd(valueObject.getMDTDiscussInd());
		java.util.Date value20 = null;
		ims.framework.utils.Date date20 = valueObject.getMDTDiscussDate();		
		if ( date20 != null ) 
		{
			value20 = date20.getDate();
		}
		domainObject.setMDTDiscussDate(value20);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCancerStatus() != null && valueObject.getCancerStatus().equals(""))
		{
			valueObject.setCancerStatus(null);
		}
		domainObject.setCancerStatus(valueObject.getCancerStatus());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPrimaryDiagnosis() != null && valueObject.getPrimaryDiagnosis().equals(""))
		{
			valueObject.setPrimaryDiagnosis(null);
		}
		domainObject.setPrimaryDiagnosis(valueObject.getPrimaryDiagnosis());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTumourLaterality() != null && valueObject.getTumourLaterality().equals(""))
		{
			valueObject.setTumourLaterality(null);
		}
		domainObject.setTumourLaterality(valueObject.getTumourLaterality());
		java.util.Date value24 = null;
		ims.framework.utils.Date date24 = valueObject.getDDTDateSurgery();		
		if ( date24 != null ) 
		{
			value24 = date24.getDate();
		}
		domainObject.setDDTDateSurgery(value24);
		java.util.Date value25 = null;
		ims.framework.utils.Date date25 = valueObject.getDDTDateChemo();		
		if ( date25 != null ) 
		{
			value25 = date25.getDate();
		}
		domainObject.setDDTDateChemo(value25);
		java.util.Date value26 = null;
		ims.framework.utils.Date date26 = valueObject.getDDTDateTele();		
		if ( date26 != null ) 
		{
			value26 = date26.getDate();
		}
		domainObject.setDDTDateTele(value26);
		java.util.Date value27 = null;
		ims.framework.utils.Date date27 = valueObject.getDDTDateBrachy();		
		if ( date27 != null ) 
		{
			value27 = date27.getDate();
		}
		domainObject.setDDTDateBrachy(value27);
		java.util.Date value28 = null;
		ims.framework.utils.Date date28 = valueObject.getDDTDatePalliative();		
		if ( date28 != null ) 
		{
			value28 = date28.getDate();
		}
		domainObject.setDDTDatePalliative(value28);
		java.util.Date value29 = null;
		ims.framework.utils.Date date29 = valueObject.getDDTDateActiveMon();		
		if ( date29 != null ) 
		{
			value29 = date29.getDate();
		}
		domainObject.setDDTDateActiveMon(value29);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDDTOrgCode() != null && valueObject.getDDTOrgCode().equals(""))
		{
			valueObject.setDDTOrgCode(null);
		}
		domainObject.setDDTOrgCode(valueObject.getDDTOrgCode());
		domainObject.setWTAdjustmentTreat(valueObject.getWTAdjustmentTreat());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getWTAdjustmentReasonTreat() != null && valueObject.getWTAdjustmentReasonTreat().equals(""))
		{
			valueObject.setWTAdjustmentReasonTreat(null);
		}
		domainObject.setWTAdjustmentReasonTreat(valueObject.getWTAdjustmentReasonTreat());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPlanCancerTreatType() != null && valueObject.getPlanCancerTreatType().equals(""))
		{
			valueObject.setPlanCancerTreatType(null);
		}
		domainObject.setPlanCancerTreatType(valueObject.getPlanCancerTreatType());
		java.util.Date value34 = null;
		ims.framework.utils.Date date34 = valueObject.getFirstTreatmentDateSurg();		
		if ( date34 != null ) 
		{
			value34 = date34.getDate();
		}
		domainObject.setFirstTreatmentDateSurg(value34);
		java.util.Date value35 = null;
		ims.framework.utils.Date date35 = valueObject.getFirstTreatmentDateChemo();		
		if ( date35 != null ) 
		{
			value35 = date35.getDate();
		}
		domainObject.setFirstTreatmentDateChemo(value35);
		java.util.Date value36 = null;
		ims.framework.utils.Date date36 = valueObject.getFirstTreatmentDateTele();		
		if ( date36 != null ) 
		{
			value36 = date36.getDate();
		}
		domainObject.setFirstTreatmentDateTele(value36);
		java.util.Date value37 = null;
		ims.framework.utils.Date date37 = valueObject.getFirstTreatmentDateBrachy();		
		if ( date37 != null ) 
		{
			value37 = date37.getDate();
		}
		domainObject.setFirstTreatmentDateBrachy(value37);
		java.util.Date value38 = null;
		ims.framework.utils.Date date38 = valueObject.getFirstTreatmentDateSPCare();		
		if ( date38 != null ) 
		{
			value38 = date38.getDate();
		}
		domainObject.setFirstTreatmentDateSPCare(value38);
		java.util.Date value39 = null;
		ims.framework.utils.Date date39 = valueObject.getFirstTreatmentDateActiveMon();		
		if ( date39 != null ) 
		{
			value39 = date39.getDate();
		}
		domainObject.setFirstTreatmentDateActiveMon(value39);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getFirstTreatmentOrgCode() != null && valueObject.getFirstTreatmentOrgCode().equals(""))
		{
			valueObject.setFirstTreatmentOrgCode(null);
		}
		domainObject.setFirstTreatmentOrgCode(valueObject.getFirstTreatmentOrgCode());
		domainObject.setWTAdjustFirstTreat(valueObject.getWTAdjustFirstTreat());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getWTAdjustmentReasonFT() != null && valueObject.getWTAdjustmentReasonFT().equals(""))
		{
			valueObject.setWTAdjustmentReasonFT(null);
		}
		domainObject.setWTAdjustmentReasonFT(valueObject.getWTAdjustmentReasonFT());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDelayReasonDTT() != null && valueObject.getDelayReasonDTT().equals(""))
		{
			valueObject.setDelayReasonDTT(null);
		}
		domainObject.setDelayReasonDTT(valueObject.getDelayReasonDTT());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDelayReasonRTT() != null && valueObject.getDelayReasonRTT().equals(""))
		{
			valueObject.setDelayReasonRTT(null);
		}
		domainObject.setDelayReasonRTT(valueObject.getDelayReasonRTT());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDelayCodeDTT() != null && valueObject.getDelayCodeDTT().equals(""))
		{
			valueObject.setDelayCodeDTT(null);
		}
		domainObject.setDelayCodeDTT(valueObject.getDelayCodeDTT());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDelayCodeRTT() != null && valueObject.getDelayCodeRTT().equals(""))
		{
			valueObject.setDelayCodeRTT(null);
		}
		domainObject.setDelayCodeRTT(valueObject.getDelayCodeRTT());

		return domainObject;
	}

}
