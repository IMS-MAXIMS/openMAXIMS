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
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Marius Mihalec
 */
public class CatsReferralWizardVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.CatsReferralWizardVo copy(ims.RefMan.vo.CatsReferralWizardVo valueObjectDest, ims.RefMan.vo.CatsReferralWizardVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CatsReferral(valueObjectSrc.getID_CatsReferral());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// ReferralDetails
		valueObjectDest.setReferralDetails(valueObjectSrc.getReferralDetails());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// AdditionalInvApptsStatus
		valueObjectDest.setAdditionalInvApptsStatus(valueObjectSrc.getAdditionalInvApptsStatus());
		// hasInvestigations
		valueObjectDest.setHasInvestigations(valueObjectSrc.getHasInvestigations());
		// hasAppointments
		valueObjectDest.setHasAppointments(valueObjectSrc.getHasAppointments());
		// hasDocuments
		valueObjectDest.setHasDocuments(valueObjectSrc.getHasDocuments());
		// hasReferralLetter
		valueObjectDest.setHasReferralLetter(valueObjectSrc.getHasReferralLetter());
		// isCAB
		valueObjectDest.setIsCAB(valueObjectSrc.getIsCAB());
		// StatusHistory
		valueObjectDest.setStatusHistory(valueObjectSrc.getStatusHistory());
		// RejectReferralDetail
		valueObjectDest.setRejectReferralDetail(valueObjectSrc.getRejectReferralDetail());
		// hasRejectedInv
		valueObjectDest.setHasRejectedInv(valueObjectSrc.getHasRejectedInv());
		// OnwardReferralStatus
		valueObjectDest.setOnwardReferralStatus(valueObjectSrc.getOnwardReferralStatus());
		// ProviderCancellation
		valueObjectDest.setProviderCancellation(valueObjectSrc.getProviderCancellation());
		// hasConsultationDetails
		valueObjectDest.setHasConsultationDetails(valueObjectSrc.getHasConsultationDetails());
		// DischargeDate
		valueObjectDest.setDischargeDate(valueObjectSrc.getDischargeDate());
		// isFinalReportRequired
		valueObjectDest.setIsFinalReportRequired(valueObjectSrc.getIsFinalReportRequired());
		// TriageDateTime
		valueObjectDest.setTriageDateTime(valueObjectSrc.getTriageDateTime());
		// LastApptArrivedDate
		valueObjectDest.setLastApptArrivedDate(valueObjectSrc.getLastApptArrivedDate());
		// isAcceptedOnCAB
		valueObjectDest.setIsAcceptedOnCAB(valueObjectSrc.getIsAcceptedOnCAB());
		// isReferralRejectedOnCAB
		valueObjectDest.setIsReferralRejectedOnCAB(valueObjectSrc.getIsReferralRejectedOnCAB());
		// wasPatientRejectionLetterSent
		valueObjectDest.setWasPatientRejectionLetterSent(valueObjectSrc.getWasPatientRejectionLetterSent());
		// wasPatientProviderCancellationLetterSent
		valueObjectDest.setWasPatientProviderCancellationLetterSent(valueObjectSrc.getWasPatientProviderCancellationLetterSent());
		// requiresDischargeRep
		valueObjectDest.setRequiresDischargeRep(valueObjectSrc.getRequiresDischargeRep());
		// isSecondaryReportRequired
		valueObjectDest.setIsSecondaryReportRequired(valueObjectSrc.getIsSecondaryReportRequired());
		// wasFurtherManagementDetailsReviewed
		valueObjectDest.setWasFurtherManagementDetailsReviewed(valueObjectSrc.getWasFurtherManagementDetailsReviewed());
		// OnwardReferralReason
		valueObjectDest.setOnwardReferralReason(valueObjectSrc.getOnwardReferralReason());
		// DischargeToGPDetailsReviewStatus
		valueObjectDest.setDischargeToGPDetailsReviewStatus(valueObjectSrc.getDischargeToGPDetailsReviewStatus());
		// isSuitableForSurgery
		valueObjectDest.setIsSuitableForSurgery(valueObjectSrc.getIsSuitableForSurgery());
		// isFitForSurgery
		valueObjectDest.setIsFitForSurgery(valueObjectSrc.getIsFitForSurgery());
		// AwaitingClinicalInfo
		valueObjectDest.setAwaitingClinicalInfo(valueObjectSrc.getAwaitingClinicalInfo());
		// isAwaitingClinicalInfo
		valueObjectDest.setIsAwaitingClinicalInfo(valueObjectSrc.getIsAwaitingClinicalInfo());
		// Contract
		valueObjectDest.setContract(valueObjectSrc.getContract());
		// ReportsRequired
		valueObjectDest.setReportsRequired(valueObjectSrc.getReportsRequired());
		// isActiveMonitorApptRequired
		valueObjectDest.setIsActiveMonitorApptRequired(valueObjectSrc.getIsActiveMonitorApptRequired());
		// CATSReportSentDate
		valueObjectDest.setCATSReportSentDate(valueObjectSrc.getCATSReportSentDate());
		// EndOfCareDate
		valueObjectDest.setEndOfCareDate(valueObjectSrc.getEndOfCareDate());
		// ProcedureForPostOpReview
		valueObjectDest.setProcedureForPostOpReview(valueObjectSrc.getProcedureForPostOpReview());
		// ReferralCategory
		valueObjectDest.setReferralCategory(valueObjectSrc.getReferralCategory());
		// isOnwardReferralTriage
		valueObjectDest.setIsOnwardReferralTriage(valueObjectSrc.getIsOnwardReferralTriage());
		// NearestTreatmentCentre
		valueObjectDest.setNearestTreatmentCentre(valueObjectSrc.getNearestTreatmentCentre());
		// Urgency
		valueObjectDest.setUrgency(valueObjectSrc.getUrgency());
		// PathwayID
		valueObjectDest.setPathwayID(valueObjectSrc.getPathwayID());
		// RTTClockImpact
		valueObjectDest.setRTTClockImpact(valueObjectSrc.getRTTClockImpact());
		// ReferralTransfer
		valueObjectDest.setReferralTransfer(valueObjectSrc.getReferralTransfer());
		// ConsUpgradeDate
		valueObjectDest.setConsUpgradeDate(valueObjectSrc.getConsUpgradeDate());
		// DOS
		valueObjectDest.setDOS(valueObjectSrc.getDOS());
		// CancerType
		valueObjectDest.setCancerType(valueObjectSrc.getCancerType());
		// EpisodeOfCare
		valueObjectDest.setEpisodeOfCare(valueObjectSrc.getEpisodeOfCare());
		// current31TargetDate
		valueObjectDest.setCurrent31TargetDate(valueObjectSrc.getCurrent31TargetDate());
		// current62TargetDate
		valueObjectDest.setCurrent62TargetDate(valueObjectSrc.getCurrent62TargetDate());
		// PatientCategory
		valueObjectDest.setPatientCategory(valueObjectSrc.getPatientCategory());
		// UrgencyUpdateHistory
		valueObjectDest.setUrgencyUpdateHistory(valueObjectSrc.getUrgencyUpdateHistory());
		// IsEmergencyReferral
		valueObjectDest.setIsEmergencyReferral(valueObjectSrc.getIsEmergencyReferral());
		// ManuallyMarkedAsNotRTTImpact
		valueObjectDest.setManuallyMarkedAsNotRTTImpact(valueObjectSrc.getManuallyMarkedAsNotRTTImpact());
		// changeCBAppointment
		valueObjectDest.setChangeCBAppointment(valueObjectSrc.getChangeCBAppointment());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCatsReferralWizardVoCollectionFromCatsReferral(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.CatsReferral objects.
	 */
	public static ims.RefMan.vo.CatsReferralWizardVoCollection createCatsReferralWizardVoCollectionFromCatsReferral(java.util.Set domainObjectSet)	
	{
		return createCatsReferralWizardVoCollectionFromCatsReferral(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.CatsReferral objects.
	 */
	public static ims.RefMan.vo.CatsReferralWizardVoCollection createCatsReferralWizardVoCollectionFromCatsReferral(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.CatsReferralWizardVoCollection voList = new ims.RefMan.vo.CatsReferralWizardVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.CatsReferral domainObject = (ims.RefMan.domain.objects.CatsReferral) iterator.next();
			ims.RefMan.vo.CatsReferralWizardVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.CatsReferral objects.
	 */
	public static ims.RefMan.vo.CatsReferralWizardVoCollection createCatsReferralWizardVoCollectionFromCatsReferral(java.util.List domainObjectList) 
	{
		return createCatsReferralWizardVoCollectionFromCatsReferral(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.CatsReferral objects.
	 */
	public static ims.RefMan.vo.CatsReferralWizardVoCollection createCatsReferralWizardVoCollectionFromCatsReferral(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.CatsReferralWizardVoCollection voList = new ims.RefMan.vo.CatsReferralWizardVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.CatsReferral domainObject = (ims.RefMan.domain.objects.CatsReferral) domainObjectList.get(i);
			ims.RefMan.vo.CatsReferralWizardVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.CatsReferral set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractCatsReferralSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralWizardVoCollection voCollection) 
	 {
	 	return extractCatsReferralSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCatsReferralSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralWizardVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.CatsReferralWizardVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.CatsReferral domainObject = CatsReferralWizardVoAssembler.extractCatsReferral(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.CatsReferral list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractCatsReferralList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralWizardVoCollection voCollection) 
	 {
	 	return extractCatsReferralList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCatsReferralList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralWizardVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.CatsReferralWizardVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.CatsReferral domainObject = CatsReferralWizardVoAssembler.extractCatsReferral(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.CatsReferral object.
	 * @param domainObject ims.RefMan.domain.objects.CatsReferral
	 */
	 public static ims.RefMan.vo.CatsReferralWizardVo create(ims.RefMan.domain.objects.CatsReferral domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.CatsReferral object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.CatsReferralWizardVo create(DomainObjectMap map, ims.RefMan.domain.objects.CatsReferral domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.CatsReferralWizardVo valueObject = (ims.RefMan.vo.CatsReferralWizardVo) map.getValueObject(domainObject, ims.RefMan.vo.CatsReferralWizardVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.CatsReferralWizardVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.CatsReferral
	 */
	 public static ims.RefMan.vo.CatsReferralWizardVo insert(ims.RefMan.vo.CatsReferralWizardVo valueObject, ims.RefMan.domain.objects.CatsReferral domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.CatsReferral
	 */
	 public static ims.RefMan.vo.CatsReferralWizardVo insert(DomainObjectMap map, ims.RefMan.vo.CatsReferralWizardVo valueObject, ims.RefMan.domain.objects.CatsReferral domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_CatsReferral(domainObject.getId());
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
			
		// Patient
		valueObject.setPatient(ims.core.vo.domain.PatientAssembler.create(map, domainObject.getPatient()) );
		// ReferralDetails
		valueObject.setReferralDetails(ims.clinical.vo.domain.ReferralLetterDetailsVoAssembler.create(map, domainObject.getReferralDetails()) );
		// CurrentStatus
		valueObject.setCurrentStatus(ims.RefMan.vo.domain.CatsReferralStatusVoAssembler.create(map, domainObject.getCurrentStatus()) );
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
		// AdditionalInvApptsStatus
		ims.domain.lookups.LookupInstance instance5 = domainObject.getAdditionalInvApptsStatus();
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

			ims.RefMan.vo.lookups.AdditionalInvestigationAppointmentsStatus voLookup5 = new ims.RefMan.vo.lookups.AdditionalInvestigationAppointmentsStatus(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.RefMan.vo.lookups.AdditionalInvestigationAppointmentsStatus parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.RefMan.vo.lookups.AdditionalInvestigationAppointmentsStatus(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setAdditionalInvApptsStatus(voLookup5);
		}
				// hasInvestigations
		valueObject.setHasInvestigations( domainObject.isHasInvestigations() );
		// hasAppointments
		valueObject.setHasAppointments( domainObject.isHasAppointments() );
		// hasDocuments
		valueObject.setHasDocuments( domainObject.isHasDocuments() );
		// hasReferralLetter
		valueObject.setHasReferralLetter( domainObject.isHasReferralLetter() );
		// isCAB
		valueObject.setIsCAB( domainObject.isIsCAB() );
		// StatusHistory
		valueObject.setStatusHistory(ims.RefMan.vo.domain.CatsReferralStatusVoAssembler.createCatsReferralStatusVoCollectionFromCATSReferralStatus(map, domainObject.getStatusHistory()) );
		// RejectReferralDetail
		valueObject.setRejectReferralDetail(ims.RefMan.vo.domain.RejectReferralVoAssembler.create(map, domainObject.getRejectReferralDetail()) );
		// hasRejectedInv
		valueObject.setHasRejectedInv( domainObject.isHasRejectedInv() );
		// OnwardReferralStatus
		ims.domain.lookups.LookupInstance instance14 = domainObject.getOnwardReferralStatus();
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

			ims.RefMan.vo.lookups.OnwardReferralStatus voLookup14 = new ims.RefMan.vo.lookups.OnwardReferralStatus(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.RefMan.vo.lookups.OnwardReferralStatus parentVoLookup14 = voLookup14;
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
								parentVoLookup14.setParent(new ims.RefMan.vo.lookups.OnwardReferralStatus(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setOnwardReferralStatus(voLookup14);
		}
				// ProviderCancellation
		if (domainObject.getProviderCancellation() != null)
		{
			if(domainObject.getProviderCancellation() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getProviderCancellation();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setProviderCancellation(new ims.RefMan.vo.ProviderCancellationRefVo(id, -1));				
			}
			else
			{
				valueObject.setProviderCancellation(new ims.RefMan.vo.ProviderCancellationRefVo(domainObject.getProviderCancellation().getId(), domainObject.getProviderCancellation().getVersion()));
			}
		}
		// hasConsultationDetails
		valueObject.setHasConsultationDetails( domainObject.isHasConsultationDetails() );
		// DischargeDate
		java.util.Date DischargeDate = domainObject.getDischargeDate();
		if ( null != DischargeDate ) 
		{
			valueObject.setDischargeDate(new ims.framework.utils.Date(DischargeDate) );
		}
		// isFinalReportRequired
		ims.domain.lookups.LookupInstance instance18 = domainObject.getIsFinalReportRequired();
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

			ims.RefMan.vo.lookups.ReportStatus voLookup18 = new ims.RefMan.vo.lookups.ReportStatus(instance18.getId(),instance18.getText(), instance18.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ReportStatus parentVoLookup18 = voLookup18;
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
								parentVoLookup18.setParent(new ims.RefMan.vo.lookups.ReportStatus(parent18.getId(),parent18.getText(), parent18.isActive(), null, img, color));
				parentVoLookup18 = parentVoLookup18.getParent();
								parent18 = parent18.getParent();
			}			
			valueObject.setIsFinalReportRequired(voLookup18);
		}
				// TriageDateTime
		java.util.Date TriageDateTime = domainObject.getTriageDateTime();
		if ( null != TriageDateTime ) 
		{
			valueObject.setTriageDateTime(new ims.framework.utils.DateTime(TriageDateTime) );
		}
		// LastApptArrivedDate
		java.util.Date LastApptArrivedDate = domainObject.getLastApptArrivedDate();
		if ( null != LastApptArrivedDate ) 
		{
			valueObject.setLastApptArrivedDate(new ims.framework.utils.Date(LastApptArrivedDate) );
		}
		// isAcceptedOnCAB
		valueObject.setIsAcceptedOnCAB( domainObject.isIsAcceptedOnCAB() );
		// isReferralRejectedOnCAB
		valueObject.setIsReferralRejectedOnCAB( domainObject.isIsReferralRejectedOnCAB() );
		// wasPatientRejectionLetterSent
		valueObject.setWasPatientRejectionLetterSent( domainObject.isWasPatientRejectionLetterSent() );
		// wasPatientProviderCancellationLetterSent
		valueObject.setWasPatientProviderCancellationLetterSent( domainObject.isWasPatientProviderCancellationLetterSent() );
		// requiresDischargeRep
		valueObject.setRequiresDischargeRep( domainObject.isRequiresDischargeRep() );
		// isSecondaryReportRequired
		ims.domain.lookups.LookupInstance instance26 = domainObject.getIsSecondaryReportRequired();
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

			ims.RefMan.vo.lookups.ReportStatus voLookup26 = new ims.RefMan.vo.lookups.ReportStatus(instance26.getId(),instance26.getText(), instance26.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ReportStatus parentVoLookup26 = voLookup26;
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
								parentVoLookup26.setParent(new ims.RefMan.vo.lookups.ReportStatus(parent26.getId(),parent26.getText(), parent26.isActive(), null, img, color));
				parentVoLookup26 = parentVoLookup26.getParent();
								parent26 = parent26.getParent();
			}			
			valueObject.setIsSecondaryReportRequired(voLookup26);
		}
				// wasFurtherManagementDetailsReviewed
		valueObject.setWasFurtherManagementDetailsReviewed( domainObject.isWasFurtherManagementDetailsReviewed() );
		// OnwardReferralReason
		ims.domain.lookups.LookupInstance instance28 = domainObject.getOnwardReferralReason();
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

			ims.RefMan.vo.lookups.OnwardReferralReason voLookup28 = new ims.RefMan.vo.lookups.OnwardReferralReason(instance28.getId(),instance28.getText(), instance28.isActive(), null, img, color);
			ims.RefMan.vo.lookups.OnwardReferralReason parentVoLookup28 = voLookup28;
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
								parentVoLookup28.setParent(new ims.RefMan.vo.lookups.OnwardReferralReason(parent28.getId(),parent28.getText(), parent28.isActive(), null, img, color));
				parentVoLookup28 = parentVoLookup28.getParent();
								parent28 = parent28.getParent();
			}			
			valueObject.setOnwardReferralReason(voLookup28);
		}
				// DischargeToGPDetailsReviewStatus
		ims.domain.lookups.LookupInstance instance29 = domainObject.getDischargeToGPDetailsReviewStatus();
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

			ims.RefMan.vo.lookups.DischargeToGPDetailsReviewStatus voLookup29 = new ims.RefMan.vo.lookups.DischargeToGPDetailsReviewStatus(instance29.getId(),instance29.getText(), instance29.isActive(), null, img, color);
			ims.RefMan.vo.lookups.DischargeToGPDetailsReviewStatus parentVoLookup29 = voLookup29;
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
								parentVoLookup29.setParent(new ims.RefMan.vo.lookups.DischargeToGPDetailsReviewStatus(parent29.getId(),parent29.getText(), parent29.isActive(), null, img, color));
				parentVoLookup29 = parentVoLookup29.getParent();
								parent29 = parent29.getParent();
			}			
			valueObject.setDischargeToGPDetailsReviewStatus(voLookup29);
		}
				// isSuitableForSurgery
		valueObject.setIsSuitableForSurgery( domainObject.isIsSuitableForSurgery() );
		// isFitForSurgery
		valueObject.setIsFitForSurgery( domainObject.isIsFitForSurgery() );
		// AwaitingClinicalInfo
		valueObject.setAwaitingClinicalInfo(ims.RefMan.vo.domain.AwaitingClinicalInfoVoAssembler.create(map, domainObject.getAwaitingClinicalInfo()) );
		// isAwaitingClinicalInfo
		valueObject.setIsAwaitingClinicalInfo( domainObject.isIsAwaitingClinicalInfo() );
		// Contract
		valueObject.setContract(ims.RefMan.vo.domain.ContractConfigForReferralDetailsComponentVoAssembler.create(map, domainObject.getContract()) );
		// ReportsRequired
		valueObject.setReportsRequired(ims.RefMan.vo.domain.ReportsRequiredForPrintingVoAssembler.createReportsRequiredForPrintingVoCollectionFromReportsRequiredForPrinting(map, domainObject.getReportsRequired()) );
		// isActiveMonitorApptRequired
		valueObject.setIsActiveMonitorApptRequired( domainObject.isIsActiveMonitorApptRequired() );
		// CATSReportSentDate
		java.util.Date CATSReportSentDate = domainObject.getCATSReportSentDate();
		if ( null != CATSReportSentDate ) 
		{
			valueObject.setCATSReportSentDate(new ims.framework.utils.DateTime(CATSReportSentDate) );
		}
		// EndOfCareDate
		java.util.Date EndOfCareDate = domainObject.getEndOfCareDate();
		if ( null != EndOfCareDate ) 
		{
			valueObject.setEndOfCareDate(new ims.framework.utils.Date(EndOfCareDate) );
		}
		// ProcedureForPostOpReview
		if (domainObject.getProcedureForPostOpReview() != null)
		{
			if(domainObject.getProcedureForPostOpReview() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getProcedureForPostOpReview();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setProcedureForPostOpReview(new ims.core.clinical.vo.PatientProcedureRefVo(id, -1));				
			}
			else
			{
				valueObject.setProcedureForPostOpReview(new ims.core.clinical.vo.PatientProcedureRefVo(domainObject.getProcedureForPostOpReview().getId(), domainObject.getProcedureForPostOpReview().getVersion()));
			}
		}
		// ReferralCategory
		ims.domain.lookups.LookupInstance instance40 = domainObject.getReferralCategory();
		if ( null != instance40 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance40.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance40.getImage().getImageId(), instance40.getImage().getImagePath());
			}
			color = instance40.getColor();
			if (color != null) 
				color.getValue();

			ims.RefMan.vo.lookups.CatsReferralCategory voLookup40 = new ims.RefMan.vo.lookups.CatsReferralCategory(instance40.getId(),instance40.getText(), instance40.isActive(), null, img, color);
			ims.RefMan.vo.lookups.CatsReferralCategory parentVoLookup40 = voLookup40;
			ims.domain.lookups.LookupInstance parent40 = instance40.getParent();
			while (parent40 != null)
			{
				if (parent40.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent40.getImage().getImageId(), parent40.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent40.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup40.setParent(new ims.RefMan.vo.lookups.CatsReferralCategory(parent40.getId(),parent40.getText(), parent40.isActive(), null, img, color));
				parentVoLookup40 = parentVoLookup40.getParent();
								parent40 = parent40.getParent();
			}			
			valueObject.setReferralCategory(voLookup40);
		}
				// isOnwardReferralTriage
		valueObject.setIsOnwardReferralTriage( domainObject.isIsOnwardReferralTriage() );
		// NearestTreatmentCentre
		valueObject.setNearestTreatmentCentre(ims.admin.vo.domain.ConfigLocationLiteVoAssembler.create(map, domainObject.getNearestTreatmentCentre()) );
		// Urgency
		ims.domain.lookups.LookupInstance instance43 = domainObject.getUrgency();
		if ( null != instance43 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance43.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance43.getImage().getImageId(), instance43.getImage().getImagePath());
			}
			color = instance43.getColor();
			if (color != null) 
				color.getValue();

			ims.RefMan.vo.lookups.ReferralUrgency voLookup43 = new ims.RefMan.vo.lookups.ReferralUrgency(instance43.getId(),instance43.getText(), instance43.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ReferralUrgency parentVoLookup43 = voLookup43;
			ims.domain.lookups.LookupInstance parent43 = instance43.getParent();
			while (parent43 != null)
			{
				if (parent43.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent43.getImage().getImageId(), parent43.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent43.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup43.setParent(new ims.RefMan.vo.lookups.ReferralUrgency(parent43.getId(),parent43.getText(), parent43.isActive(), null, img, color));
				parentVoLookup43 = parentVoLookup43.getParent();
								parent43 = parent43.getParent();
			}			
			valueObject.setUrgency(voLookup43);
		}
				// PathwayID
		valueObject.setPathwayID(domainObject.getPathwayID());
		// RTTClockImpact
		valueObject.setRTTClockImpact( domainObject.isRTTClockImpact() );
		// ReferralTransfer
		valueObject.setReferralTransfer(ims.RefMan.vo.domain.ReferralTransferVoAssembler.create(map, domainObject.getReferralTransfer()) );
		// ConsUpgradeDate
		java.util.Date ConsUpgradeDate = domainObject.getConsUpgradeDate();
		if ( null != ConsUpgradeDate ) 
		{
			valueObject.setConsUpgradeDate(new ims.framework.utils.Date(ConsUpgradeDate) );
		}
		// DOS
		valueObject.setDOS(ims.scheduling.vo.domain.DirectoryOfServiceForCatsReferralWizardVoAssembler.create(map, domainObject.getDOS()) );
		// CancerType
		ims.domain.lookups.LookupInstance instance49 = domainObject.getCancerType();
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

			ims.RefMan.vo.lookups.CancerType voLookup49 = new ims.RefMan.vo.lookups.CancerType(instance49.getId(),instance49.getText(), instance49.isActive(), null, img, color);
			ims.RefMan.vo.lookups.CancerType parentVoLookup49 = voLookup49;
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
								parentVoLookup49.setParent(new ims.RefMan.vo.lookups.CancerType(parent49.getId(),parent49.getText(), parent49.isActive(), null, img, color));
				parentVoLookup49 = parentVoLookup49.getParent();
								parent49 = parent49.getParent();
			}			
			valueObject.setCancerType(voLookup49);
		}
				// EpisodeOfCare
		if (domainObject.getEpisodeOfCare() != null)
		{
			if(domainObject.getEpisodeOfCare() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getEpisodeOfCare();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setEpisodeOfCare(new ims.core.admin.vo.EpisodeOfCareRefVo(id, -1));				
			}
			else
			{
				valueObject.setEpisodeOfCare(new ims.core.admin.vo.EpisodeOfCareRefVo(domainObject.getEpisodeOfCare().getId(), domainObject.getEpisodeOfCare().getVersion()));
			}
		}
		// current31TargetDate
		java.util.Date current31TargetDate = domainObject.getCurrent31TargetDate();
		if ( null != current31TargetDate ) 
		{
			valueObject.setCurrent31TargetDate(new ims.framework.utils.Date(current31TargetDate) );
		}
		// current62TargetDate
		java.util.Date current62TargetDate = domainObject.getCurrent62TargetDate();
		if ( null != current62TargetDate ) 
		{
			valueObject.setCurrent62TargetDate(new ims.framework.utils.Date(current62TargetDate) );
		}
		// PatientCategory
		ims.domain.lookups.LookupInstance instance53 = domainObject.getPatientCategory();
		if ( null != instance53 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance53.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance53.getImage().getImageId(), instance53.getImage().getImagePath());
			}
			color = instance53.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PatientStatus voLookup53 = new ims.core.vo.lookups.PatientStatus(instance53.getId(),instance53.getText(), instance53.isActive(), null, img, color);
			ims.core.vo.lookups.PatientStatus parentVoLookup53 = voLookup53;
			ims.domain.lookups.LookupInstance parent53 = instance53.getParent();
			while (parent53 != null)
			{
				if (parent53.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent53.getImage().getImageId(), parent53.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent53.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup53.setParent(new ims.core.vo.lookups.PatientStatus(parent53.getId(),parent53.getText(), parent53.isActive(), null, img, color));
				parentVoLookup53 = parentVoLookup53.getParent();
								parent53 = parent53.getParent();
			}			
			valueObject.setPatientCategory(voLookup53);
		}
				// UrgencyUpdateHistory
		valueObject.setUrgencyUpdateHistory(ims.RefMan.vo.domain.ReferralUrgencyUpdatesVoAssembler.createReferralUrgencyUpdatesVoCollectionFromReferralUrgencyUpdates(map, domainObject.getUrgencyUpdateHistory()) );
		// IsEmergencyReferral
		valueObject.setIsEmergencyReferral( domainObject.isIsEmergencyReferral() );
		// ManuallyMarkedAsNotRTTImpact
		valueObject.setManuallyMarkedAsNotRTTImpact( domainObject.isManuallyMarkedAsNotRTTImpact() );
		// changeCBAppointment
		valueObject.setChangeCBAppointment( domainObject.isChangeCBAppointment() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.CatsReferral extractCatsReferral(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralWizardVo valueObject) 
	{
		return 	extractCatsReferral(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.CatsReferral extractCatsReferral(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralWizardVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_CatsReferral();
		ims.RefMan.domain.objects.CatsReferral domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.CatsReferral)domMap.get(valueObject);
			}
			// ims.RefMan.vo.CatsReferralWizardVo ID_CatsReferral field is unknown
			domainObject = new ims.RefMan.domain.objects.CatsReferral();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_CatsReferral());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.CatsReferral)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.CatsReferral) domainFactory.getDomainObject(ims.RefMan.domain.objects.CatsReferral.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_CatsReferral());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.patient.domain.objects.Patient value1 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value1 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else
			{
				value1 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value1);
		domainObject.setReferralDetails(ims.clinical.vo.domain.ReferralLetterDetailsVoAssembler.extractReferralLetterDetails(domainFactory, valueObject.getReferralDetails(), domMap));
		domainObject.setCurrentStatus(ims.RefMan.vo.domain.CatsReferralStatusVoAssembler.extractCATSReferralStatus(domainFactory, valueObject.getCurrentStatus(), domMap));
		ims.core.admin.domain.objects.CareContext value4 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value4 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getCareContext();	
			}
			else
			{
				value4 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getAdditionalInvApptsStatus() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getAdditionalInvApptsStatus().getID());
		}
		domainObject.setAdditionalInvApptsStatus(value5);
		domainObject.setHasInvestigations(valueObject.getHasInvestigations());
		domainObject.setHasAppointments(valueObject.getHasAppointments());
		domainObject.setHasDocuments(valueObject.getHasDocuments());
		domainObject.setHasReferralLetter(valueObject.getHasReferralLetter());
		domainObject.setIsCAB(valueObject.getIsCAB());
		domainObject.setStatusHistory(ims.RefMan.vo.domain.CatsReferralStatusVoAssembler.extractCATSReferralStatusSet(domainFactory, valueObject.getStatusHistory(), domainObject.getStatusHistory(), domMap));		
		domainObject.setRejectReferralDetail(ims.RefMan.vo.domain.RejectReferralVoAssembler.extractReferralReject(domainFactory, valueObject.getRejectReferralDetail(), domMap));
		domainObject.setHasRejectedInv(valueObject.getHasRejectedInv());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getOnwardReferralStatus() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getOnwardReferralStatus().getID());
		}
		domainObject.setOnwardReferralStatus(value14);
		ims.RefMan.domain.objects.ProviderCancellation value15 = null;
		if ( null != valueObject.getProviderCancellation() ) 
		{
			if (valueObject.getProviderCancellation().getBoId() == null)
			{
				if (domMap.get(valueObject.getProviderCancellation()) != null)
				{
					value15 = (ims.RefMan.domain.objects.ProviderCancellation)domMap.get(valueObject.getProviderCancellation());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value15 = domainObject.getProviderCancellation();	
			}
			else
			{
				value15 = (ims.RefMan.domain.objects.ProviderCancellation)domainFactory.getDomainObject(ims.RefMan.domain.objects.ProviderCancellation.class, valueObject.getProviderCancellation().getBoId());
			}
		}
		domainObject.setProviderCancellation(value15);
		domainObject.setHasConsultationDetails(valueObject.getHasConsultationDetails());
		java.util.Date value17 = null;
		ims.framework.utils.Date date17 = valueObject.getDischargeDate();		
		if ( date17 != null ) 
		{
			value17 = date17.getDate();
		}
		domainObject.setDischargeDate(value17);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value18 = null;
		if ( null != valueObject.getIsFinalReportRequired() ) 
		{
			value18 =
				domainFactory.getLookupInstance(valueObject.getIsFinalReportRequired().getID());
		}
		domainObject.setIsFinalReportRequired(value18);
		ims.framework.utils.DateTime dateTime19 = valueObject.getTriageDateTime();
		java.util.Date value19 = null;
		if ( dateTime19 != null ) 
		{
			value19 = dateTime19.getJavaDate();
		}
		domainObject.setTriageDateTime(value19);
		java.util.Date value20 = null;
		ims.framework.utils.Date date20 = valueObject.getLastApptArrivedDate();		
		if ( date20 != null ) 
		{
			value20 = date20.getDate();
		}
		domainObject.setLastApptArrivedDate(value20);
		domainObject.setIsAcceptedOnCAB(valueObject.getIsAcceptedOnCAB());
		domainObject.setIsReferralRejectedOnCAB(valueObject.getIsReferralRejectedOnCAB());
		domainObject.setWasPatientRejectionLetterSent(valueObject.getWasPatientRejectionLetterSent());
		domainObject.setWasPatientProviderCancellationLetterSent(valueObject.getWasPatientProviderCancellationLetterSent());
		domainObject.setRequiresDischargeRep(valueObject.getRequiresDischargeRep());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value26 = null;
		if ( null != valueObject.getIsSecondaryReportRequired() ) 
		{
			value26 =
				domainFactory.getLookupInstance(valueObject.getIsSecondaryReportRequired().getID());
		}
		domainObject.setIsSecondaryReportRequired(value26);
		domainObject.setWasFurtherManagementDetailsReviewed(valueObject.getWasFurtherManagementDetailsReviewed());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value28 = null;
		if ( null != valueObject.getOnwardReferralReason() ) 
		{
			value28 =
				domainFactory.getLookupInstance(valueObject.getOnwardReferralReason().getID());
		}
		domainObject.setOnwardReferralReason(value28);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value29 = null;
		if ( null != valueObject.getDischargeToGPDetailsReviewStatus() ) 
		{
			value29 =
				domainFactory.getLookupInstance(valueObject.getDischargeToGPDetailsReviewStatus().getID());
		}
		domainObject.setDischargeToGPDetailsReviewStatus(value29);
		domainObject.setIsSuitableForSurgery(valueObject.getIsSuitableForSurgery());
		domainObject.setIsFitForSurgery(valueObject.getIsFitForSurgery());
		domainObject.setAwaitingClinicalInfo(ims.RefMan.vo.domain.AwaitingClinicalInfoVoAssembler.extractAwaitingClinicalInfo(domainFactory, valueObject.getAwaitingClinicalInfo(), domMap));
		domainObject.setIsAwaitingClinicalInfo(valueObject.getIsAwaitingClinicalInfo());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.configuration.domain.objects.ContractConfig value34 = null;
		if ( null != valueObject.getContract() ) 
		{
			if (valueObject.getContract().getBoId() == null)
			{
				if (domMap.get(valueObject.getContract()) != null)
				{
					value34 = (ims.core.configuration.domain.objects.ContractConfig)domMap.get(valueObject.getContract());
				}
			}
			else
			{
				value34 = (ims.core.configuration.domain.objects.ContractConfig)domainFactory.getDomainObject(ims.core.configuration.domain.objects.ContractConfig.class, valueObject.getContract().getBoId());
			}
		}
		domainObject.setContract(value34);
		domainObject.setReportsRequired(ims.RefMan.vo.domain.ReportsRequiredForPrintingVoAssembler.extractReportsRequiredForPrintingSet(domainFactory, valueObject.getReportsRequired(), domainObject.getReportsRequired(), domMap));		
		domainObject.setIsActiveMonitorApptRequired(valueObject.getIsActiveMonitorApptRequired());
		ims.framework.utils.DateTime dateTime37 = valueObject.getCATSReportSentDate();
		java.util.Date value37 = null;
		if ( dateTime37 != null ) 
		{
			value37 = dateTime37.getJavaDate();
		}
		domainObject.setCATSReportSentDate(value37);
		java.util.Date value38 = null;
		ims.framework.utils.Date date38 = valueObject.getEndOfCareDate();		
		if ( date38 != null ) 
		{
			value38 = date38.getDate();
		}
		domainObject.setEndOfCareDate(value38);
		ims.core.clinical.domain.objects.PatientProcedure value39 = null;
		if ( null != valueObject.getProcedureForPostOpReview() ) 
		{
			if (valueObject.getProcedureForPostOpReview().getBoId() == null)
			{
				if (domMap.get(valueObject.getProcedureForPostOpReview()) != null)
				{
					value39 = (ims.core.clinical.domain.objects.PatientProcedure)domMap.get(valueObject.getProcedureForPostOpReview());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value39 = domainObject.getProcedureForPostOpReview();	
			}
			else
			{
				value39 = (ims.core.clinical.domain.objects.PatientProcedure)domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientProcedure.class, valueObject.getProcedureForPostOpReview().getBoId());
			}
		}
		domainObject.setProcedureForPostOpReview(value39);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value40 = null;
		if ( null != valueObject.getReferralCategory() ) 
		{
			value40 =
				domainFactory.getLookupInstance(valueObject.getReferralCategory().getID());
		}
		domainObject.setReferralCategory(value40);
		domainObject.setIsOnwardReferralTriage(valueObject.getIsOnwardReferralTriage());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value42 = null;
		if ( null != valueObject.getNearestTreatmentCentre() ) 
		{
			if (valueObject.getNearestTreatmentCentre().getBoId() == null)
			{
				if (domMap.get(valueObject.getNearestTreatmentCentre()) != null)
				{
					value42 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getNearestTreatmentCentre());
				}
			}
			else
			{
				value42 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getNearestTreatmentCentre().getBoId());
			}
		}
		domainObject.setNearestTreatmentCentre(value42);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value43 = null;
		if ( null != valueObject.getUrgency() ) 
		{
			value43 =
				domainFactory.getLookupInstance(valueObject.getUrgency().getID());
		}
		domainObject.setUrgency(value43);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPathwayID() != null && valueObject.getPathwayID().equals(""))
		{
			valueObject.setPathwayID(null);
		}
		domainObject.setPathwayID(valueObject.getPathwayID());
		domainObject.setRTTClockImpact(valueObject.getRTTClockImpact());
		domainObject.setReferralTransfer(ims.RefMan.vo.domain.ReferralTransferVoAssembler.extractReferralTransfer(domainFactory, valueObject.getReferralTransfer(), domMap));
		java.util.Date value47 = null;
		ims.framework.utils.Date date47 = valueObject.getConsUpgradeDate();		
		if ( date47 != null ) 
		{
			value47 = date47.getDate();
		}
		domainObject.setConsUpgradeDate(value47);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.scheduling.domain.objects.DirectoryofService value48 = null;
		if ( null != valueObject.getDOS() ) 
		{
			if (valueObject.getDOS().getBoId() == null)
			{
				if (domMap.get(valueObject.getDOS()) != null)
				{
					value48 = (ims.scheduling.domain.objects.DirectoryofService)domMap.get(valueObject.getDOS());
				}
			}
			else
			{
				value48 = (ims.scheduling.domain.objects.DirectoryofService)domainFactory.getDomainObject(ims.scheduling.domain.objects.DirectoryofService.class, valueObject.getDOS().getBoId());
			}
		}
		domainObject.setDOS(value48);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value49 = null;
		if ( null != valueObject.getCancerType() ) 
		{
			value49 =
				domainFactory.getLookupInstance(valueObject.getCancerType().getID());
		}
		domainObject.setCancerType(value49);
		ims.core.admin.domain.objects.EpisodeOfCare value50 = null;
		if ( null != valueObject.getEpisodeOfCare() ) 
		{
			if (valueObject.getEpisodeOfCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisodeOfCare()) != null)
				{
					value50 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisodeOfCare());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value50 = domainObject.getEpisodeOfCare();	
			}
			else
			{
				value50 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisodeOfCare().getBoId());
			}
		}
		domainObject.setEpisodeOfCare(value50);
		java.util.Date value51 = null;
		ims.framework.utils.Date date51 = valueObject.getCurrent31TargetDate();		
		if ( date51 != null ) 
		{
			value51 = date51.getDate();
		}
		domainObject.setCurrent31TargetDate(value51);
		java.util.Date value52 = null;
		ims.framework.utils.Date date52 = valueObject.getCurrent62TargetDate();		
		if ( date52 != null ) 
		{
			value52 = date52.getDate();
		}
		domainObject.setCurrent62TargetDate(value52);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value53 = null;
		if ( null != valueObject.getPatientCategory() ) 
		{
			value53 =
				domainFactory.getLookupInstance(valueObject.getPatientCategory().getID());
		}
		domainObject.setPatientCategory(value53);
		domainObject.setUrgencyUpdateHistory(ims.RefMan.vo.domain.ReferralUrgencyUpdatesVoAssembler.extractReferralUrgencyUpdatesList(domainFactory, valueObject.getUrgencyUpdateHistory(), domainObject.getUrgencyUpdateHistory(), domMap));		
		domainObject.setIsEmergencyReferral(valueObject.getIsEmergencyReferral());
		domainObject.setManuallyMarkedAsNotRTTImpact(valueObject.getManuallyMarkedAsNotRTTImpact());
		domainObject.setChangeCBAppointment(valueObject.getChangeCBAppointment());

		return domainObject;
	}

}
