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
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class PatientElectiveListDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.PatientElectiveListDetailsVo copy(ims.RefMan.vo.PatientElectiveListDetailsVo valueObjectDest, ims.RefMan.vo.PatientElectiveListDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientElectiveList(valueObjectSrc.getID_PatientElectiveList());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// Referral
		valueObjectDest.setReferral(valueObjectSrc.getReferral());
		// DateOnList
		valueObjectDest.setDateOnList(valueObjectSrc.getDateOnList());
		// EROD
		valueObjectDest.setEROD(valueObjectSrc.getEROD());
		// ERODHistory
		valueObjectDest.setERODHistory(valueObjectSrc.getERODHistory());
		// ElectiveAdmissionType
		valueObjectDest.setElectiveAdmissionType(valueObjectSrc.getElectiveAdmissionType());
		// ElectiveListStatus
		valueObjectDest.setElectiveListStatus(valueObjectSrc.getElectiveListStatus());
		// TCIDetails
		valueObjectDest.setTCIDetails(valueObjectSrc.getTCIDetails());
		// TCIHistory
		valueObjectDest.setTCIHistory(valueObjectSrc.getTCIHistory());
		// AdmissionType
		valueObjectDest.setAdmissionType(valueObjectSrc.getAdmissionType());
		// ElectiveListReason
		valueObjectDest.setElectiveListReason(valueObjectSrc.getElectiveListReason());
		// ToBePlannedIn
		valueObjectDest.setToBePlannedIn(valueObjectSrc.getToBePlannedIn());
		// ToBePlannedInUnit
		valueObjectDest.setToBePlannedInUnit(valueObjectSrc.getToBePlannedInUnit());
		// PlannedDate
		valueObjectDest.setPlannedDate(valueObjectSrc.getPlannedDate());
		// wasPossibleDateGiven
		valueObjectDest.setWasPossibleDateGiven(valueObjectSrc.getWasPossibleDateGiven());
		// DateGivenToPatient
		valueObjectDest.setDateGivenToPatient(valueObjectSrc.getDateGivenToPatient());
		// PrimaryProcedure
		valueObjectDest.setPrimaryProcedure(valueObjectSrc.getPrimaryProcedure());
		// ProcLaterality
		valueObjectDest.setProcLaterality(valueObjectSrc.getProcLaterality());
		// ProcedureDescription
		valueObjectDest.setProcedureDescription(valueObjectSrc.getProcedureDescription());
		// SecondaryProcedure
		valueObjectDest.setSecondaryProcedure(valueObjectSrc.getSecondaryProcedure());
		// SecondaryProcLaterality
		valueObjectDest.setSecondaryProcLaterality(valueObjectSrc.getSecondaryProcLaterality());
		// Priority
		valueObjectDest.setPriority(valueObjectSrc.getPriority());
		// ElectiveList
		valueObjectDest.setElectiveList(valueObjectSrc.getElectiveList());
		// AnticipatedProcedureLength
		valueObjectDest.setAnticipatedProcedureLength(valueObjectSrc.getAnticipatedProcedureLength());
		// RequiredTheatreType
		valueObjectDest.setRequiredTheatreType(valueObjectSrc.getRequiredTheatreType());
		// CriticalCareBedRequired
		valueObjectDest.setCriticalCareBedRequired(valueObjectSrc.getCriticalCareBedRequired());
		// AnaesthesisRiskAssessmentRequest
		valueObjectDest.setAnaesthesisRiskAssessmentRequest(valueObjectSrc.getAnaesthesisRiskAssessmentRequest());
		// FollowPeriOperativeguidelines
		valueObjectDest.setFollowPeriOperativeguidelines(valueObjectSrc.getFollowPeriOperativeguidelines());
		// PeriOpNoReasonComments
		valueObjectDest.setPeriOpNoReasonComments(valueObjectSrc.getPeriOpNoReasonComments());
		// ProceduredToBeCarriedBy
		valueObjectDest.setProceduredToBeCarriedBy(valueObjectSrc.getProceduredToBeCarriedBy());
		// ProcedureCarriedOutBy
		valueObjectDest.setProcedureCarriedOutBy(valueObjectSrc.getProcedureCarriedOutBy());
		// PreAssessmentRequired
		valueObjectDest.setPreAssessmentRequired(valueObjectSrc.getPreAssessmentRequired());
		// InterpretatorRequired
		valueObjectDest.setInterpretatorRequired(valueObjectSrc.getInterpretatorRequired());
		// Language
		valueObjectDest.setLanguage(valueObjectSrc.getLanguage());
		// TransportRequired
		valueObjectDest.setTransportRequired(valueObjectSrc.getTransportRequired());
		// Transport
		valueObjectDest.setTransport(valueObjectSrc.getTransport());
		// SpecialRequirements
		valueObjectDest.setSpecialRequirements(valueObjectSrc.getSpecialRequirements());
		// SpecialRequirementsDetails
		valueObjectDest.setSpecialRequirementsDetails(valueObjectSrc.getSpecialRequirementsDetails());
		// Comments
		valueObjectDest.setComments(valueObjectSrc.getComments());
		// Hospital
		valueObjectDest.setHospital(valueObjectSrc.getHospital());
		// Consultant
		valueObjectDest.setConsultant(valueObjectSrc.getConsultant());
		// SuspectedGIBleed
		valueObjectDest.setSuspectedGIBleed(valueObjectSrc.getSuspectedGIBleed());
		// Points
		valueObjectDest.setPoints(valueObjectSrc.getPoints());
		// SuitableforTraining
		valueObjectDest.setSuitableforTraining(valueObjectSrc.getSuitableforTraining());
		// GeneralAnaesthetic
		valueObjectDest.setGeneralAnaesthetic(valueObjectSrc.getGeneralAnaesthetic());
		// CanNurseCarryOutProcedure
		valueObjectDest.setCanNurseCarryOutProcedure(valueObjectSrc.getCanNurseCarryOutProcedure());
		// MedicationShouldBeStoppedOralBowelPrep
		valueObjectDest.setMedicationShouldBeStoppedOralBowelPrep(valueObjectSrc.getMedicationShouldBeStoppedOralBowelPrep());
		// DrugInformation
		valueObjectDest.setDrugInformation(valueObjectSrc.getDrugInformation());
		// hasPacemakerDefib
		valueObjectDest.setHasPacemakerDefib(valueObjectSrc.getHasPacemakerDefib());
		// RenalFunctionAssessment
		valueObjectDest.setRenalFunctionAssessment(valueObjectSrc.getRenalFunctionAssessment());
		// AreThereKeyTherapeutic
		valueObjectDest.setAreThereKeyTherapeutic(valueObjectSrc.getAreThereKeyTherapeutic());
		// CognitiveComments
		valueObjectDest.setCognitiveComments(valueObjectSrc.getCognitiveComments());
		// DetailsForNonGAEndoProcedure
		valueObjectDest.setDetailsForNonGAEndoProcedure(valueObjectSrc.getDetailsForNonGAEndoProcedure());
		// CurrentSuspensionEndDate
		valueObjectDest.setCurrentSuspensionEndDate(valueObjectSrc.getCurrentSuspensionEndDate());
		// was28DayRuleApplied
		valueObjectDest.setWas28DayRuleApplied(valueObjectSrc.getWas28DayRuleApplied());
		// Notes
		valueObjectDest.setNotes(valueObjectSrc.getNotes());
		// TCICancelledByProvider
		valueObjectDest.setTCICancelledByProvider(valueObjectSrc.getTCICancelledByProvider());
		// numberOfProviderTCICancellations
		valueObjectDest.setNumberOfProviderTCICancellations(valueObjectSrc.getNumberOfProviderTCICancellations());
		// ElectiveListStatusHistory
		valueObjectDest.setElectiveListStatusHistory(valueObjectSrc.getElectiveListStatusHistory());
		// PreAssessmentOutcome
		valueObjectDest.setPreAssessmentOutcome(valueObjectSrc.getPreAssessmentOutcome());
		// FitForSurgery
		valueObjectDest.setFitForSurgery(valueObjectSrc.getFitForSurgery());
		// AnaestheticType
		valueObjectDest.setAnaestheticType(valueObjectSrc.getAnaestheticType());
		// AvailableAtShortNotice
		valueObjectDest.setAvailableAtShortNotice(valueObjectSrc.getAvailableAtShortNotice());
		// PreOperativeOvernightStayRequired
		valueObjectDest.setPreOperativeOvernightStayRequired(valueObjectSrc.getPreOperativeOvernightStayRequired());
		// NoOfPreOperativeNights
		valueObjectDest.setNoOfPreOperativeNights(valueObjectSrc.getNoOfPreOperativeNights());
		// AnticipatedStay
		valueObjectDest.setAnticipatedStay(valueObjectSrc.getAnticipatedStay());
		// PatientReceivingAnticoagulantTherapy
		valueObjectDest.setPatientReceivingAnticoagulantTherapy(valueObjectSrc.getPatientReceivingAnticoagulantTherapy());
		// AvailableAtShortNoticePeriod
		valueObjectDest.setAvailableAtShortNoticePeriod(valueObjectSrc.getAvailableAtShortNoticePeriod());
		// SubjectTo28DayRule
		valueObjectDest.setSubjectTo28DayRule(valueObjectSrc.getSubjectTo28DayRule());
		// Rule28DayStatus
		valueObjectDest.setRule28DayStatus(valueObjectSrc.getRule28DayStatus());
		// Rule28DayPeriodStart
		valueObjectDest.setRule28DayPeriodStart(valueObjectSrc.getRule28DayPeriodStart());
		// Admissions
		valueObjectDest.setAdmissions(valueObjectSrc.getAdmissions());
		// TheatreAppointment
		valueObjectDest.setTheatreAppointment(valueObjectSrc.getTheatreAppointment());
		// SystemInformation
		valueObjectDest.setSystemInformation(valueObjectSrc.getSystemInformation());
		// Ward
		valueObjectDest.setWard(valueObjectSrc.getWard());
		// PatientCategory
		valueObjectDest.setPatientCategory(valueObjectSrc.getPatientCategory());
		// VettingHCP
		valueObjectDest.setVettingHCP(valueObjectSrc.getVettingHCP());
		// AuthoringInfo
		valueObjectDest.setAuthoringInfo(valueObjectSrc.getAuthoringInfo());
		// RequiresVetting
		valueObjectDest.setRequiresVetting(valueObjectSrc.getRequiresVetting());
		// RecordingUser
		valueObjectDest.setRecordingUser(valueObjectSrc.getRecordingUser());
		// PreColonoscopyAssessmentRequired
		valueObjectDest.setPreColonoscopyAssessmentRequired(valueObjectSrc.getPreColonoscopyAssessmentRequired());
		// ResponsibleHCP
		valueObjectDest.setResponsibleHCP(valueObjectSrc.getResponsibleHCP());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientElectiveListDetailsVoCollectionFromPatientElectiveList(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListDetailsVoCollection createPatientElectiveListDetailsVoCollectionFromPatientElectiveList(java.util.Set domainObjectSet)	
	{
		return createPatientElectiveListDetailsVoCollectionFromPatientElectiveList(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListDetailsVoCollection createPatientElectiveListDetailsVoCollectionFromPatientElectiveList(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.PatientElectiveListDetailsVoCollection voList = new ims.RefMan.vo.PatientElectiveListDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.PatientElectiveList domainObject = (ims.RefMan.domain.objects.PatientElectiveList) iterator.next();
			ims.RefMan.vo.PatientElectiveListDetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListDetailsVoCollection createPatientElectiveListDetailsVoCollectionFromPatientElectiveList(java.util.List domainObjectList) 
	{
		return createPatientElectiveListDetailsVoCollectionFromPatientElectiveList(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListDetailsVoCollection createPatientElectiveListDetailsVoCollectionFromPatientElectiveList(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.PatientElectiveListDetailsVoCollection voList = new ims.RefMan.vo.PatientElectiveListDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.PatientElectiveList domainObject = (ims.RefMan.domain.objects.PatientElectiveList) domainObjectList.get(i);
			ims.RefMan.vo.PatientElectiveListDetailsVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.PatientElectiveList set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientElectiveListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListDetailsVoCollection voCollection) 
	 {
	 	return extractPatientElectiveListSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientElectiveListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientElectiveListDetailsVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.PatientElectiveList domainObject = PatientElectiveListDetailsVoAssembler.extractPatientElectiveList(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.PatientElectiveList list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientElectiveListList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListDetailsVoCollection voCollection) 
	 {
	 	return extractPatientElectiveListList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientElectiveListList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientElectiveListDetailsVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.PatientElectiveList domainObject = PatientElectiveListDetailsVoAssembler.extractPatientElectiveList(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.PatientElectiveList object.
	 * @param domainObject ims.RefMan.domain.objects.PatientElectiveList
	 */
	 public static ims.RefMan.vo.PatientElectiveListDetailsVo create(ims.RefMan.domain.objects.PatientElectiveList domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.PatientElectiveList object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.PatientElectiveListDetailsVo create(DomainObjectMap map, ims.RefMan.domain.objects.PatientElectiveList domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.PatientElectiveListDetailsVo valueObject = (ims.RefMan.vo.PatientElectiveListDetailsVo) map.getValueObject(domainObject, ims.RefMan.vo.PatientElectiveListDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.PatientElectiveListDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.PatientElectiveList
	 */
	 public static ims.RefMan.vo.PatientElectiveListDetailsVo insert(ims.RefMan.vo.PatientElectiveListDetailsVo valueObject, ims.RefMan.domain.objects.PatientElectiveList domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.PatientElectiveList
	 */
	 public static ims.RefMan.vo.PatientElectiveListDetailsVo insert(DomainObjectMap map, ims.RefMan.vo.PatientElectiveListDetailsVo valueObject, ims.RefMan.domain.objects.PatientElectiveList domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientElectiveList(domainObject.getId());
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
		if (domainObject.getPatient() != null)
		{
			if(domainObject.getPatient() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPatient();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPatient(new ims.core.patient.vo.PatientRefVo(id, -1));				
			}
			else
			{
				valueObject.setPatient(new ims.core.patient.vo.PatientRefVo(domainObject.getPatient().getId(), domainObject.getPatient().getVersion()));
			}
		}
		// Referral
		valueObject.setReferral(ims.RefMan.vo.domain.CatsReferralforElectiveListDetailsVoAssembler.create(map, domainObject.getReferral()) );
		// DateOnList
		java.util.Date DateOnList = domainObject.getDateOnList();
		if ( null != DateOnList ) 
		{
			valueObject.setDateOnList(new ims.framework.utils.Date(DateOnList) );
		}
		// EROD
		valueObject.setEROD(ims.RefMan.vo.domain.ReferralERODDetailsVoAssembler.create(map, domainObject.getEROD()) );
		// ERODHistory
		valueObject.setERODHistory(ims.RefMan.vo.domain.ReferralERODDetailsVoAssembler.createReferralERODDetailsVoCollectionFromReferralEROD(map, domainObject.getERODHistory()) );
		// ElectiveAdmissionType
		ims.domain.lookups.LookupInstance instance6 = domainObject.getElectiveAdmissionType();
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

			ims.RefMan.vo.lookups.ElectiveAdmissionType voLookup6 = new ims.RefMan.vo.lookups.ElectiveAdmissionType(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ElectiveAdmissionType parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.RefMan.vo.lookups.ElectiveAdmissionType(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setElectiveAdmissionType(voLookup6);
		}
				// ElectiveListStatus
		valueObject.setElectiveListStatus(ims.RefMan.vo.domain.ElectiveListStatusVoAssembler.create(map, domainObject.getElectiveListStatus()) );
		// TCIDetails
		valueObject.setTCIDetails(ims.RefMan.vo.domain.TCIForPatientElectiveListDetailsVoAssembler.create(map, domainObject.getTCIDetails()) );
		// TCIHistory
		valueObject.setTCIHistory(ims.RefMan.vo.domain.TCIForPatientElectiveListDetailsVoAssembler.createTCIForPatientElectiveListDetailsVoCollectionFromTCIForPatientElectiveList(map, domainObject.getTCIHistory()) );
		// AdmissionType
		ims.domain.lookups.LookupInstance instance10 = domainObject.getAdmissionType();
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

			ims.RefMan.vo.lookups.WaitingCardAdmissionType voLookup10 = new ims.RefMan.vo.lookups.WaitingCardAdmissionType(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.RefMan.vo.lookups.WaitingCardAdmissionType parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.RefMan.vo.lookups.WaitingCardAdmissionType(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setAdmissionType(voLookup10);
		}
				// ElectiveListReason
		ims.domain.lookups.LookupInstance instance11 = domainObject.getElectiveListReason();
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

			ims.emergency.vo.lookups.ElectiveListReason voLookup11 = new ims.emergency.vo.lookups.ElectiveListReason(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.emergency.vo.lookups.ElectiveListReason parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.emergency.vo.lookups.ElectiveListReason(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setElectiveListReason(voLookup11);
		}
				// ToBePlannedIn
		valueObject.setToBePlannedIn(domainObject.getToBePlannedIn());
		// ToBePlannedInUnit
		ims.domain.lookups.LookupInstance instance13 = domainObject.getToBePlannedInUnit();
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

			ims.core.vo.lookups.TimeUnitsSecondsToMonths voLookup13 = new ims.core.vo.lookups.TimeUnitsSecondsToMonths(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.core.vo.lookups.TimeUnitsSecondsToMonths parentVoLookup13 = voLookup13;
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
								parentVoLookup13.setParent(new ims.core.vo.lookups.TimeUnitsSecondsToMonths(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setToBePlannedInUnit(voLookup13);
		}
				// PlannedDate
		java.util.Date PlannedDate = domainObject.getPlannedDate();
		if ( null != PlannedDate ) 
		{
			valueObject.setPlannedDate(new ims.framework.utils.Date(PlannedDate) );
		}
		// wasPossibleDateGiven
		valueObject.setWasPossibleDateGiven( domainObject.isWasPossibleDateGiven() );
		// DateGivenToPatient
		java.util.Date DateGivenToPatient = domainObject.getDateGivenToPatient();
		if ( null != DateGivenToPatient ) 
		{
			valueObject.setDateGivenToPatient(new ims.framework.utils.Date(DateGivenToPatient) );
		}
		// PrimaryProcedure
		valueObject.setPrimaryProcedure(ims.core.vo.domain.ProcedureLiteVoAssembler.create(map, domainObject.getPrimaryProcedure()) );
		// ProcLaterality
		ims.domain.lookups.LookupInstance instance18 = domainObject.getProcLaterality();
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

			ims.core.vo.lookups.LateralityLRB voLookup18 = new ims.core.vo.lookups.LateralityLRB(instance18.getId(),instance18.getText(), instance18.isActive(), null, img, color);
			ims.core.vo.lookups.LateralityLRB parentVoLookup18 = voLookup18;
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
								parentVoLookup18.setParent(new ims.core.vo.lookups.LateralityLRB(parent18.getId(),parent18.getText(), parent18.isActive(), null, img, color));
				parentVoLookup18 = parentVoLookup18.getParent();
								parent18 = parent18.getParent();
			}			
			valueObject.setProcLaterality(voLookup18);
		}
				// ProcedureDescription
		valueObject.setProcedureDescription(domainObject.getProcedureDescription());
		// SecondaryProcedure
		valueObject.setSecondaryProcedure(ims.core.vo.domain.ProcedureLiteVoAssembler.create(map, domainObject.getSecondaryProcedure()) );
		// SecondaryProcLaterality
		ims.domain.lookups.LookupInstance instance21 = domainObject.getSecondaryProcLaterality();
		if ( null != instance21 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance21.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance21.getImage().getImageId(), instance21.getImage().getImagePath());
			}
			color = instance21.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.LateralityLRB voLookup21 = new ims.core.vo.lookups.LateralityLRB(instance21.getId(),instance21.getText(), instance21.isActive(), null, img, color);
			ims.core.vo.lookups.LateralityLRB parentVoLookup21 = voLookup21;
			ims.domain.lookups.LookupInstance parent21 = instance21.getParent();
			while (parent21 != null)
			{
				if (parent21.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent21.getImage().getImageId(), parent21.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent21.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup21.setParent(new ims.core.vo.lookups.LateralityLRB(parent21.getId(),parent21.getText(), parent21.isActive(), null, img, color));
				parentVoLookup21 = parentVoLookup21.getParent();
								parent21 = parent21.getParent();
			}			
			valueObject.setSecondaryProcLaterality(voLookup21);
		}
				// Priority
		ims.domain.lookups.LookupInstance instance22 = domainObject.getPriority();
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

			ims.RefMan.vo.lookups.ReferralUrgency voLookup22 = new ims.RefMan.vo.lookups.ReferralUrgency(instance22.getId(),instance22.getText(), instance22.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ReferralUrgency parentVoLookup22 = voLookup22;
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
								parentVoLookup22.setParent(new ims.RefMan.vo.lookups.ReferralUrgency(parent22.getId(),parent22.getText(), parent22.isActive(), null, img, color));
				parentVoLookup22 = parentVoLookup22.getParent();
								parent22 = parent22.getParent();
			}			
			valueObject.setPriority(voLookup22);
		}
				// ElectiveList
		valueObject.setElectiveList(ims.admin.vo.domain.ElectiveListConfigForElectiveListDetailsVoAssembler.create(map, domainObject.getElectiveList()) );
		// AnticipatedProcedureLength
		valueObject.setAnticipatedProcedureLength(domainObject.getAnticipatedProcedureLength());
		// RequiredTheatreType
		ims.domain.lookups.LookupInstance instance25 = domainObject.getRequiredTheatreType();
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

			ims.scheduling.vo.lookups.TheatreType voLookup25 = new ims.scheduling.vo.lookups.TheatreType(instance25.getId(),instance25.getText(), instance25.isActive(), null, img, color);
			ims.scheduling.vo.lookups.TheatreType parentVoLookup25 = voLookup25;
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
								parentVoLookup25.setParent(new ims.scheduling.vo.lookups.TheatreType(parent25.getId(),parent25.getText(), parent25.isActive(), null, img, color));
				parentVoLookup25 = parentVoLookup25.getParent();
								parent25 = parent25.getParent();
			}			
			valueObject.setRequiredTheatreType(voLookup25);
		}
				// CriticalCareBedRequired
		valueObject.setCriticalCareBedRequired( domainObject.isCriticalCareBedRequired() );
		// AnaesthesisRiskAssessmentRequest
		valueObject.setAnaesthesisRiskAssessmentRequest( domainObject.isAnaesthesisRiskAssessmentRequest() );
		// FollowPeriOperativeguidelines
		ims.domain.lookups.LookupInstance instance28 = domainObject.getFollowPeriOperativeguidelines();
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

			ims.core.vo.lookups.YesNo voLookup28 = new ims.core.vo.lookups.YesNo(instance28.getId(),instance28.getText(), instance28.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup28 = voLookup28;
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
								parentVoLookup28.setParent(new ims.core.vo.lookups.YesNo(parent28.getId(),parent28.getText(), parent28.isActive(), null, img, color));
				parentVoLookup28 = parentVoLookup28.getParent();
								parent28 = parent28.getParent();
			}			
			valueObject.setFollowPeriOperativeguidelines(voLookup28);
		}
				// PeriOpNoReasonComments
		valueObject.setPeriOpNoReasonComments(domainObject.getPeriOpNoReasonComments());
		// ProceduredToBeCarriedBy
		ims.domain.lookups.LookupInstance instance30 = domainObject.getProceduredToBeCarriedBy();
		if ( null != instance30 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance30.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance30.getImage().getImageId(), instance30.getImage().getImagePath());
			}
			color = instance30.getColor();
			if (color != null) 
				color.getValue();

			ims.RefMan.vo.lookups.ProcedureExecutant voLookup30 = new ims.RefMan.vo.lookups.ProcedureExecutant(instance30.getId(),instance30.getText(), instance30.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ProcedureExecutant parentVoLookup30 = voLookup30;
			ims.domain.lookups.LookupInstance parent30 = instance30.getParent();
			while (parent30 != null)
			{
				if (parent30.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent30.getImage().getImageId(), parent30.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent30.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup30.setParent(new ims.RefMan.vo.lookups.ProcedureExecutant(parent30.getId(),parent30.getText(), parent30.isActive(), null, img, color));
				parentVoLookup30 = parentVoLookup30.getParent();
								parent30 = parent30.getParent();
			}			
			valueObject.setProceduredToBeCarriedBy(voLookup30);
		}
				// ProcedureCarriedOutBy
		valueObject.setProcedureCarriedOutBy(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getProcedureCarriedOutBy()) );
		// PreAssessmentRequired
		valueObject.setPreAssessmentRequired( domainObject.isPreAssessmentRequired() );
		// InterpretatorRequired
		valueObject.setInterpretatorRequired( domainObject.isInterpretatorRequired() );
		// Language
		ims.domain.lookups.LookupInstance instance34 = domainObject.getLanguage();
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

			ims.core.vo.lookups.Language voLookup34 = new ims.core.vo.lookups.Language(instance34.getId(),instance34.getText(), instance34.isActive(), null, img, color);
			ims.core.vo.lookups.Language parentVoLookup34 = voLookup34;
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
								parentVoLookup34.setParent(new ims.core.vo.lookups.Language(parent34.getId(),parent34.getText(), parent34.isActive(), null, img, color));
				parentVoLookup34 = parentVoLookup34.getParent();
								parent34 = parent34.getParent();
			}			
			valueObject.setLanguage(voLookup34);
		}
				// TransportRequired
		valueObject.setTransportRequired( domainObject.isTransportRequired() );
		// Transport
		ims.domain.lookups.LookupInstance instance36 = domainObject.getTransport();
		if ( null != instance36 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance36.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance36.getImage().getImageId(), instance36.getImage().getImagePath());
			}
			color = instance36.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.ApptTransportType voLookup36 = new ims.scheduling.vo.lookups.ApptTransportType(instance36.getId(),instance36.getText(), instance36.isActive(), null, img, color);
			ims.scheduling.vo.lookups.ApptTransportType parentVoLookup36 = voLookup36;
			ims.domain.lookups.LookupInstance parent36 = instance36.getParent();
			while (parent36 != null)
			{
				if (parent36.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent36.getImage().getImageId(), parent36.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent36.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup36.setParent(new ims.scheduling.vo.lookups.ApptTransportType(parent36.getId(),parent36.getText(), parent36.isActive(), null, img, color));
				parentVoLookup36 = parentVoLookup36.getParent();
								parent36 = parent36.getParent();
			}			
			valueObject.setTransport(voLookup36);
		}
				// SpecialRequirements
		valueObject.setSpecialRequirements( domainObject.isSpecialRequirements() );
		// SpecialRequirementsDetails
		valueObject.setSpecialRequirementsDetails(domainObject.getSpecialRequirementsDetails());
		// Comments
		valueObject.setComments(domainObject.getComments());
		// Hospital
		valueObject.setHospital(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getHospital()) );
		// Consultant
		valueObject.setConsultant(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getConsultant()) );
		// SuspectedGIBleed
		valueObject.setSuspectedGIBleed( domainObject.isSuspectedGIBleed() );
		// Points
		valueObject.setPoints(domainObject.getPoints());
		// SuitableforTraining
		valueObject.setSuitableforTraining( domainObject.isSuitableforTraining() );
		// GeneralAnaesthetic
		ims.domain.lookups.LookupInstance instance45 = domainObject.getGeneralAnaesthetic();
		if ( null != instance45 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance45.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance45.getImage().getImageId(), instance45.getImage().getImagePath());
			}
			color = instance45.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup45 = new ims.core.vo.lookups.YesNo(instance45.getId(),instance45.getText(), instance45.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup45 = voLookup45;
			ims.domain.lookups.LookupInstance parent45 = instance45.getParent();
			while (parent45 != null)
			{
				if (parent45.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent45.getImage().getImageId(), parent45.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent45.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup45.setParent(new ims.core.vo.lookups.YesNo(parent45.getId(),parent45.getText(), parent45.isActive(), null, img, color));
				parentVoLookup45 = parentVoLookup45.getParent();
								parent45 = parent45.getParent();
			}			
			valueObject.setGeneralAnaesthetic(voLookup45);
		}
				// CanNurseCarryOutProcedure
		valueObject.setCanNurseCarryOutProcedure( domainObject.isCanNurseCarryOutProcedure() );
		// MedicationShouldBeStoppedOralBowelPrep
		valueObject.setMedicationShouldBeStoppedOralBowelPrep( domainObject.isMedicationShouldBeStoppedOralBowelPrep() );
		// DrugInformation
		valueObject.setDrugInformation(domainObject.getDrugInformation());
		// hasPacemakerDefib
		valueObject.setHasPacemakerDefib( domainObject.isHasPacemakerDefib() );
		// RenalFunctionAssessment
		ims.domain.lookups.LookupInstance instance50 = domainObject.getRenalFunctionAssessment();
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

			ims.core.vo.lookups.YesNo voLookup50 = new ims.core.vo.lookups.YesNo(instance50.getId(),instance50.getText(), instance50.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup50 = voLookup50;
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
								parentVoLookup50.setParent(new ims.core.vo.lookups.YesNo(parent50.getId(),parent50.getText(), parent50.isActive(), null, img, color));
				parentVoLookup50 = parentVoLookup50.getParent();
								parent50 = parent50.getParent();
			}			
			valueObject.setRenalFunctionAssessment(voLookup50);
		}
				// AreThereKeyTherapeutic
		valueObject.setAreThereKeyTherapeutic( domainObject.isAreThereKeyTherapeutic() );
		// CognitiveComments
		valueObject.setCognitiveComments(domainObject.getCognitiveComments());
		// DetailsForNonGAEndoProcedure
		valueObject.setDetailsForNonGAEndoProcedure(domainObject.getDetailsForNonGAEndoProcedure());
		// CurrentSuspensionEndDate
		java.util.Date CurrentSuspensionEndDate = domainObject.getCurrentSuspensionEndDate();
		if ( null != CurrentSuspensionEndDate ) 
		{
			valueObject.setCurrentSuspensionEndDate(new ims.framework.utils.DateTime(CurrentSuspensionEndDate) );
		}
		// was28DayRuleApplied
		valueObject.setWas28DayRuleApplied( domainObject.isWas28DayRuleApplied() );
		// Notes
		valueObject.setNotes(ims.RefMan.vo.domain.PatientElectiveListNotesVoAssembler.createPatientElectiveListNotesVoCollectionFromNotesForPatientElectiveList(map, domainObject.getNotes()) );
		// TCICancelledByProvider
		valueObject.setTCICancelledByProvider( domainObject.isTCICancelledByProvider() );
		// numberOfProviderTCICancellations
		valueObject.setNumberOfProviderTCICancellations(domainObject.getNumberOfProviderTCICancellations());
		// ElectiveListStatusHistory
		valueObject.setElectiveListStatusHistory(ims.RefMan.vo.domain.ElectiveListStatusVoAssembler.createElectiveListStatusVoCollectionFromElectiveListStatus(map, domainObject.getElectiveListStatusHistory()) );
		// PreAssessmentOutcome
		valueObject.setPreAssessmentOutcome(ims.RefMan.vo.domain.PreAssessmentOutcomeForElectiveListDetailsVoAssembler.create(map, domainObject.getPreAssessmentOutcome()) );
		// FitForSurgery
		ims.domain.lookups.LookupInstance instance61 = domainObject.getFitForSurgery();
		if ( null != instance61 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance61.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance61.getImage().getImageId(), instance61.getImage().getImagePath());
			}
			color = instance61.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNoUnknown voLookup61 = new ims.core.vo.lookups.YesNoUnknown(instance61.getId(),instance61.getText(), instance61.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup61 = voLookup61;
			ims.domain.lookups.LookupInstance parent61 = instance61.getParent();
			while (parent61 != null)
			{
				if (parent61.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent61.getImage().getImageId(), parent61.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent61.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup61.setParent(new ims.core.vo.lookups.YesNoUnknown(parent61.getId(),parent61.getText(), parent61.isActive(), null, img, color));
				parentVoLookup61 = parentVoLookup61.getParent();
								parent61 = parent61.getParent();
			}			
			valueObject.setFitForSurgery(voLookup61);
		}
				// AnaestheticType
		ims.domain.lookups.LookupInstance instance62 = domainObject.getAnaestheticType();
		if ( null != instance62 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance62.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance62.getImage().getImageId(), instance62.getImage().getImagePath());
			}
			color = instance62.getColor();
			if (color != null) 
				color.getValue();

			ims.clinical.vo.lookups.AnaestheticType voLookup62 = new ims.clinical.vo.lookups.AnaestheticType(instance62.getId(),instance62.getText(), instance62.isActive(), null, img, color);
			ims.clinical.vo.lookups.AnaestheticType parentVoLookup62 = voLookup62;
			ims.domain.lookups.LookupInstance parent62 = instance62.getParent();
			while (parent62 != null)
			{
				if (parent62.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent62.getImage().getImageId(), parent62.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent62.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup62.setParent(new ims.clinical.vo.lookups.AnaestheticType(parent62.getId(),parent62.getText(), parent62.isActive(), null, img, color));
				parentVoLookup62 = parentVoLookup62.getParent();
								parent62 = parent62.getParent();
			}			
			valueObject.setAnaestheticType(voLookup62);
		}
				// AvailableAtShortNotice
		valueObject.setAvailableAtShortNotice( domainObject.isAvailableAtShortNotice() );
		// PreOperativeOvernightStayRequired
		valueObject.setPreOperativeOvernightStayRequired( domainObject.isPreOperativeOvernightStayRequired() );
		// NoOfPreOperativeNights
		valueObject.setNoOfPreOperativeNights(domainObject.getNoOfPreOperativeNights());
		// AnticipatedStay
		valueObject.setAnticipatedStay(domainObject.getAnticipatedStay());
		// PatientReceivingAnticoagulantTherapy
		ims.domain.lookups.LookupInstance instance67 = domainObject.getPatientReceivingAnticoagulantTherapy();
		if ( null != instance67 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance67.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance67.getImage().getImageId(), instance67.getImage().getImagePath());
			}
			color = instance67.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNoUnknown voLookup67 = new ims.core.vo.lookups.YesNoUnknown(instance67.getId(),instance67.getText(), instance67.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup67 = voLookup67;
			ims.domain.lookups.LookupInstance parent67 = instance67.getParent();
			while (parent67 != null)
			{
				if (parent67.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent67.getImage().getImageId(), parent67.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent67.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup67.setParent(new ims.core.vo.lookups.YesNoUnknown(parent67.getId(),parent67.getText(), parent67.isActive(), null, img, color));
				parentVoLookup67 = parentVoLookup67.getParent();
								parent67 = parent67.getParent();
			}			
			valueObject.setPatientReceivingAnticoagulantTherapy(voLookup67);
		}
				// AvailableAtShortNoticePeriod
		valueObject.setAvailableAtShortNoticePeriod(domainObject.getAvailableAtShortNoticePeriod());
		// SubjectTo28DayRule
		valueObject.setSubjectTo28DayRule( domainObject.isSubjectTo28DayRule() );
		// Rule28DayStatus
		ims.domain.lookups.LookupInstance instance70 = domainObject.getRule28DayStatus();
		if ( null != instance70 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance70.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance70.getImage().getImageId(), instance70.getImage().getImagePath());
			}
			color = instance70.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.Rule28DayStatus voLookup70 = new ims.scheduling.vo.lookups.Rule28DayStatus(instance70.getId(),instance70.getText(), instance70.isActive(), null, img, color);
			ims.scheduling.vo.lookups.Rule28DayStatus parentVoLookup70 = voLookup70;
			ims.domain.lookups.LookupInstance parent70 = instance70.getParent();
			while (parent70 != null)
			{
				if (parent70.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent70.getImage().getImageId(), parent70.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent70.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup70.setParent(new ims.scheduling.vo.lookups.Rule28DayStatus(parent70.getId(),parent70.getText(), parent70.isActive(), null, img, color));
				parentVoLookup70 = parentVoLookup70.getParent();
								parent70 = parent70.getParent();
			}			
			valueObject.setRule28DayStatus(voLookup70);
		}
				// Rule28DayPeriodStart
		java.util.Date Rule28DayPeriodStart = domainObject.getRule28DayPeriodStart();
		if ( null != Rule28DayPeriodStart ) 
		{
			valueObject.setRule28DayPeriodStart(new ims.framework.utils.Date(Rule28DayPeriodStart) );
		}
		// Admissions
		ims.core.admin.pas.vo.AdmissionDetailRefVoCollection Admissions = new ims.core.admin.pas.vo.AdmissionDetailRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getAdmissions().iterator(); iterator.hasNext(); ) 
		{
			ims.core.admin.pas.domain.objects.AdmissionDetail tmp = (ims.core.admin.pas.domain.objects.AdmissionDetail)iterator.next();
			if (tmp != null)
				Admissions.add(new ims.core.admin.pas.vo.AdmissionDetailRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setAdmissions(Admissions);
		// TheatreAppointment
		valueObject.setTheatreAppointment(ims.scheduling.vo.domain.Booking_AppointmentLiteVoAssembler.create(map, domainObject.getTheatreAppointment()) );
		// SystemInformation
		// set system information
		valueObject.setSystemInformation(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// Ward
		valueObject.setWard(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getWard()) );
		// PatientCategory
		ims.domain.lookups.LookupInstance instance76 = domainObject.getPatientCategory();
		if ( null != instance76 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance76.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance76.getImage().getImageId(), instance76.getImage().getImagePath());
			}
			color = instance76.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PatientStatus voLookup76 = new ims.core.vo.lookups.PatientStatus(instance76.getId(),instance76.getText(), instance76.isActive(), null, img, color);
			ims.core.vo.lookups.PatientStatus parentVoLookup76 = voLookup76;
			ims.domain.lookups.LookupInstance parent76 = instance76.getParent();
			while (parent76 != null)
			{
				if (parent76.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent76.getImage().getImageId(), parent76.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent76.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup76.setParent(new ims.core.vo.lookups.PatientStatus(parent76.getId(),parent76.getText(), parent76.isActive(), null, img, color));
				parentVoLookup76 = parentVoLookup76.getParent();
								parent76 = parent76.getParent();
			}			
			valueObject.setPatientCategory(voLookup76);
		}
				// VettingHCP
		valueObject.setVettingHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getVettingHCP()) );
		// AuthoringInfo
		valueObject.setAuthoringInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInfo()) );
		// RequiresVetting
		valueObject.setRequiresVetting( domainObject.isRequiresVetting() );
		// RecordingUser
		valueObject.setRecordingUser(ims.RefMan.vo.domain.RecordingUserInformationForWLCVoAssembler.create(map, domainObject.getRecordingUser()) );
		// PreColonoscopyAssessmentRequired
		ims.domain.lookups.LookupInstance instance81 = domainObject.getPreColonoscopyAssessmentRequired();
		if ( null != instance81 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance81.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance81.getImage().getImageId(), instance81.getImage().getImagePath());
			}
			color = instance81.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup81 = new ims.core.vo.lookups.YesNo(instance81.getId(),instance81.getText(), instance81.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup81 = voLookup81;
			ims.domain.lookups.LookupInstance parent81 = instance81.getParent();
			while (parent81 != null)
			{
				if (parent81.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent81.getImage().getImageId(), parent81.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent81.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup81.setParent(new ims.core.vo.lookups.YesNo(parent81.getId(),parent81.getText(), parent81.isActive(), null, img, color));
				parentVoLookup81 = parentVoLookup81.getParent();
								parent81 = parent81.getParent();
			}			
			valueObject.setPreColonoscopyAssessmentRequired(voLookup81);
		}
				// ResponsibleHCP
		valueObject.setResponsibleHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getResponsibleHCP()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.PatientElectiveList extractPatientElectiveList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListDetailsVo valueObject) 
	{
		return 	extractPatientElectiveList(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.PatientElectiveList extractPatientElectiveList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientElectiveList();
		ims.RefMan.domain.objects.PatientElectiveList domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.PatientElectiveList)domMap.get(valueObject);
			}
			// ims.RefMan.vo.PatientElectiveListDetailsVo ID_PatientElectiveList field is unknown
			domainObject = new ims.RefMan.domain.objects.PatientElectiveList();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientElectiveList());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.PatientElectiveList)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.PatientElectiveList) domainFactory.getDomainObject(ims.RefMan.domain.objects.PatientElectiveList.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientElectiveList());

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
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getPatient();	
			}
			else
			{
				value1 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value1);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.RefMan.domain.objects.CatsReferral value2 = null;
		if ( null != valueObject.getReferral() ) 
		{
			if (valueObject.getReferral().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferral()) != null)
				{
					value2 = (ims.RefMan.domain.objects.CatsReferral)domMap.get(valueObject.getReferral());
				}
			}
			else
			{
				value2 = (ims.RefMan.domain.objects.CatsReferral)domainFactory.getDomainObject(ims.RefMan.domain.objects.CatsReferral.class, valueObject.getReferral().getBoId());
			}
		}
		domainObject.setReferral(value2);
		java.util.Date value3 = null;
		ims.framework.utils.Date date3 = valueObject.getDateOnList();		
		if ( date3 != null ) 
		{
			value3 = date3.getDate();
		}
		domainObject.setDateOnList(value3);
		domainObject.setEROD(ims.RefMan.vo.domain.ReferralERODDetailsVoAssembler.extractReferralEROD(domainFactory, valueObject.getEROD(), domMap));
		domainObject.setERODHistory(ims.RefMan.vo.domain.ReferralERODDetailsVoAssembler.extractReferralERODList(domainFactory, valueObject.getERODHistory(), domainObject.getERODHistory(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getElectiveAdmissionType() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getElectiveAdmissionType().getID());
		}
		domainObject.setElectiveAdmissionType(value6);
		domainObject.setElectiveListStatus(ims.RefMan.vo.domain.ElectiveListStatusVoAssembler.extractElectiveListStatus(domainFactory, valueObject.getElectiveListStatus(), domMap));
		domainObject.setTCIDetails(ims.RefMan.vo.domain.TCIForPatientElectiveListDetailsVoAssembler.extractTCIForPatientElectiveList(domainFactory, valueObject.getTCIDetails(), domMap));

		// SaveAsRefVO treated as RefValueObject
		ims.RefMan.vo.TCIForPatientElectiveListRefVoCollection refCollection9 = new ims.RefMan.vo.TCIForPatientElectiveListRefVoCollection();
		if (valueObject.getTCIHistory() != null)
		{
			for (int i9=0; i9<valueObject.getTCIHistory().size(); i9++)
			{
				ims.RefMan.vo.TCIForPatientElectiveListRefVo ref9 = (ims.RefMan.vo.TCIForPatientElectiveListRefVo)valueObject.getTCIHistory().get(i9);
				refCollection9.add(ref9);
			}
		}
		int size9 = (null == refCollection9) ? 0 : refCollection9.size();		
		java.util.List domainTCIHistory9 = domainObject.getTCIHistory();
		if (domainTCIHistory9 == null)
		{
			domainTCIHistory9 = new java.util.ArrayList();
		}
		for(int i=0; i < size9; i++) 
		{
			ims.RefMan.vo.TCIForPatientElectiveListRefVo vo = refCollection9.get(i);			
			ims.RefMan.domain.objects.TCIForPatientElectiveList dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.RefMan.domain.objects.TCIForPatientElectiveList)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.RefMan.domain.objects.TCIForPatientElectiveList)domainFactory.getDomainObject( ims.RefMan.domain.objects.TCIForPatientElectiveList.class, vo.getBoId());
				}
			}

			int domIdx = domainTCIHistory9.indexOf(dom);
			if (domIdx == -1)
			{
				domainTCIHistory9.add(i, dom);
			}
			else if (i != domIdx && i < domainTCIHistory9.size())
			{
				Object tmp = domainTCIHistory9.get(i);
				domainTCIHistory9.set(i, domainTCIHistory9.get(domIdx));
				domainTCIHistory9.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i9 = domainTCIHistory9.size();
		while (i9 > size9)
		{
			domainTCIHistory9.remove(i9-1);
			i9 = domainTCIHistory9.size();
		}
		
		domainObject.setTCIHistory(domainTCIHistory9);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getAdmissionType() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getAdmissionType().getID());
		}
		domainObject.setAdmissionType(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getElectiveListReason() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getElectiveListReason().getID());
		}
		domainObject.setElectiveListReason(value11);
		domainObject.setToBePlannedIn(valueObject.getToBePlannedIn());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getToBePlannedInUnit() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getToBePlannedInUnit().getID());
		}
		domainObject.setToBePlannedInUnit(value13);
		java.util.Date value14 = null;
		ims.framework.utils.Date date14 = valueObject.getPlannedDate();		
		if ( date14 != null ) 
		{
			value14 = date14.getDate();
		}
		domainObject.setPlannedDate(value14);
		domainObject.setWasPossibleDateGiven(valueObject.getWasPossibleDateGiven());
		java.util.Date value16 = null;
		ims.framework.utils.Date date16 = valueObject.getDateGivenToPatient();		
		if ( date16 != null ) 
		{
			value16 = date16.getDate();
		}
		domainObject.setDateGivenToPatient(value16);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Procedure value17 = null;
		if ( null != valueObject.getPrimaryProcedure() ) 
		{
			if (valueObject.getPrimaryProcedure().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrimaryProcedure()) != null)
				{
					value17 = (ims.core.clinical.domain.objects.Procedure)domMap.get(valueObject.getPrimaryProcedure());
				}
			}
			else
			{
				value17 = (ims.core.clinical.domain.objects.Procedure)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Procedure.class, valueObject.getPrimaryProcedure().getBoId());
			}
		}
		domainObject.setPrimaryProcedure(value17);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value18 = null;
		if ( null != valueObject.getProcLaterality() ) 
		{
			value18 =
				domainFactory.getLookupInstance(valueObject.getProcLaterality().getID());
		}
		domainObject.setProcLaterality(value18);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getProcedureDescription() != null && valueObject.getProcedureDescription().equals(""))
		{
			valueObject.setProcedureDescription(null);
		}
		domainObject.setProcedureDescription(valueObject.getProcedureDescription());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Procedure value20 = null;
		if ( null != valueObject.getSecondaryProcedure() ) 
		{
			if (valueObject.getSecondaryProcedure().getBoId() == null)
			{
				if (domMap.get(valueObject.getSecondaryProcedure()) != null)
				{
					value20 = (ims.core.clinical.domain.objects.Procedure)domMap.get(valueObject.getSecondaryProcedure());
				}
			}
			else
			{
				value20 = (ims.core.clinical.domain.objects.Procedure)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Procedure.class, valueObject.getSecondaryProcedure().getBoId());
			}
		}
		domainObject.setSecondaryProcedure(value20);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value21 = null;
		if ( null != valueObject.getSecondaryProcLaterality() ) 
		{
			value21 =
				domainFactory.getLookupInstance(valueObject.getSecondaryProcLaterality().getID());
		}
		domainObject.setSecondaryProcLaterality(value21);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value22 = null;
		if ( null != valueObject.getPriority() ) 
		{
			value22 =
				domainFactory.getLookupInstance(valueObject.getPriority().getID());
		}
		domainObject.setPriority(value22);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.configuration.domain.objects.ElectiveListConfiguration value23 = null;
		if ( null != valueObject.getElectiveList() ) 
		{
			if (valueObject.getElectiveList().getBoId() == null)
			{
				if (domMap.get(valueObject.getElectiveList()) != null)
				{
					value23 = (ims.core.configuration.domain.objects.ElectiveListConfiguration)domMap.get(valueObject.getElectiveList());
				}
			}
			else
			{
				value23 = (ims.core.configuration.domain.objects.ElectiveListConfiguration)domainFactory.getDomainObject(ims.core.configuration.domain.objects.ElectiveListConfiguration.class, valueObject.getElectiveList().getBoId());
			}
		}
		domainObject.setElectiveList(value23);
		domainObject.setAnticipatedProcedureLength(valueObject.getAnticipatedProcedureLength());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value25 = null;
		if ( null != valueObject.getRequiredTheatreType() ) 
		{
			value25 =
				domainFactory.getLookupInstance(valueObject.getRequiredTheatreType().getID());
		}
		domainObject.setRequiredTheatreType(value25);
		domainObject.setCriticalCareBedRequired(valueObject.getCriticalCareBedRequired());
		domainObject.setAnaesthesisRiskAssessmentRequest(valueObject.getAnaesthesisRiskAssessmentRequest());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value28 = null;
		if ( null != valueObject.getFollowPeriOperativeguidelines() ) 
		{
			value28 =
				domainFactory.getLookupInstance(valueObject.getFollowPeriOperativeguidelines().getID());
		}
		domainObject.setFollowPeriOperativeguidelines(value28);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPeriOpNoReasonComments() != null && valueObject.getPeriOpNoReasonComments().equals(""))
		{
			valueObject.setPeriOpNoReasonComments(null);
		}
		domainObject.setPeriOpNoReasonComments(valueObject.getPeriOpNoReasonComments());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value30 = null;
		if ( null != valueObject.getProceduredToBeCarriedBy() ) 
		{
			value30 =
				domainFactory.getLookupInstance(valueObject.getProceduredToBeCarriedBy().getID());
		}
		domainObject.setProceduredToBeCarriedBy(value30);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value31 = null;
		if ( null != valueObject.getProcedureCarriedOutBy() ) 
		{
			if (valueObject.getProcedureCarriedOutBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getProcedureCarriedOutBy()) != null)
				{
					value31 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getProcedureCarriedOutBy());
				}
			}
			else
			{
				value31 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getProcedureCarriedOutBy().getBoId());
			}
		}
		domainObject.setProcedureCarriedOutBy(value31);
		domainObject.setPreAssessmentRequired(valueObject.getPreAssessmentRequired());
		domainObject.setInterpretatorRequired(valueObject.getInterpretatorRequired());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value34 = null;
		if ( null != valueObject.getLanguage() ) 
		{
			value34 =
				domainFactory.getLookupInstance(valueObject.getLanguage().getID());
		}
		domainObject.setLanguage(value34);
		domainObject.setTransportRequired(valueObject.getTransportRequired());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value36 = null;
		if ( null != valueObject.getTransport() ) 
		{
			value36 =
				domainFactory.getLookupInstance(valueObject.getTransport().getID());
		}
		domainObject.setTransport(value36);
		domainObject.setSpecialRequirements(valueObject.getSpecialRequirements());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSpecialRequirementsDetails() != null && valueObject.getSpecialRequirementsDetails().equals(""))
		{
			valueObject.setSpecialRequirementsDetails(null);
		}
		domainObject.setSpecialRequirementsDetails(valueObject.getSpecialRequirementsDetails());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComments() != null && valueObject.getComments().equals(""))
		{
			valueObject.setComments(null);
		}
		domainObject.setComments(valueObject.getComments());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value40 = null;
		if ( null != valueObject.getHospital() ) 
		{
			if (valueObject.getHospital().getBoId() == null)
			{
				if (domMap.get(valueObject.getHospital()) != null)
				{
					value40 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getHospital());
				}
			}
			else
			{
				value40 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getHospital().getBoId());
			}
		}
		domainObject.setHospital(value40);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value41 = null;
		if ( null != valueObject.getConsultant() ) 
		{
			if (valueObject.getConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getConsultant()) != null)
				{
					value41 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getConsultant());
				}
			}
			else
			{
				value41 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getConsultant().getBoId());
			}
		}
		domainObject.setConsultant(value41);
		domainObject.setSuspectedGIBleed(valueObject.getSuspectedGIBleed());
		domainObject.setPoints(valueObject.getPoints());
		domainObject.setSuitableforTraining(valueObject.getSuitableforTraining());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value45 = null;
		if ( null != valueObject.getGeneralAnaesthetic() ) 
		{
			value45 =
				domainFactory.getLookupInstance(valueObject.getGeneralAnaesthetic().getID());
		}
		domainObject.setGeneralAnaesthetic(value45);
		domainObject.setCanNurseCarryOutProcedure(valueObject.getCanNurseCarryOutProcedure());
		domainObject.setMedicationShouldBeStoppedOralBowelPrep(valueObject.getMedicationShouldBeStoppedOralBowelPrep());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDrugInformation() != null && valueObject.getDrugInformation().equals(""))
		{
			valueObject.setDrugInformation(null);
		}
		domainObject.setDrugInformation(valueObject.getDrugInformation());
		domainObject.setHasPacemakerDefib(valueObject.getHasPacemakerDefib());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value50 = null;
		if ( null != valueObject.getRenalFunctionAssessment() ) 
		{
			value50 =
				domainFactory.getLookupInstance(valueObject.getRenalFunctionAssessment().getID());
		}
		domainObject.setRenalFunctionAssessment(value50);
		domainObject.setAreThereKeyTherapeutic(valueObject.getAreThereKeyTherapeutic());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCognitiveComments() != null && valueObject.getCognitiveComments().equals(""))
		{
			valueObject.setCognitiveComments(null);
		}
		domainObject.setCognitiveComments(valueObject.getCognitiveComments());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDetailsForNonGAEndoProcedure() != null && valueObject.getDetailsForNonGAEndoProcedure().equals(""))
		{
			valueObject.setDetailsForNonGAEndoProcedure(null);
		}
		domainObject.setDetailsForNonGAEndoProcedure(valueObject.getDetailsForNonGAEndoProcedure());
		ims.framework.utils.DateTime dateTime54 = valueObject.getCurrentSuspensionEndDate();
		java.util.Date value54 = null;
		if ( dateTime54 != null ) 
		{
			value54 = dateTime54.getJavaDate();
		}
		domainObject.setCurrentSuspensionEndDate(value54);
		domainObject.setWas28DayRuleApplied(valueObject.getWas28DayRuleApplied());
		domainObject.setNotes(ims.RefMan.vo.domain.PatientElectiveListNotesVoAssembler.extractNotesForPatientElectiveListSet(domainFactory, valueObject.getNotes(), domainObject.getNotes(), domMap));		
		domainObject.setTCICancelledByProvider(valueObject.getTCICancelledByProvider());
		domainObject.setNumberOfProviderTCICancellations(valueObject.getNumberOfProviderTCICancellations());
		domainObject.setElectiveListStatusHistory(ims.RefMan.vo.domain.ElectiveListStatusVoAssembler.extractElectiveListStatusList(domainFactory, valueObject.getElectiveListStatusHistory(), domainObject.getElectiveListStatusHistory(), domMap));		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.RefMan.domain.objects.PreAssessmentOutcome value60 = null;
		if ( null != valueObject.getPreAssessmentOutcome() ) 
		{
			if (valueObject.getPreAssessmentOutcome().getBoId() == null)
			{
				if (domMap.get(valueObject.getPreAssessmentOutcome()) != null)
				{
					value60 = (ims.RefMan.domain.objects.PreAssessmentOutcome)domMap.get(valueObject.getPreAssessmentOutcome());
				}
			}
			else
			{
				value60 = (ims.RefMan.domain.objects.PreAssessmentOutcome)domainFactory.getDomainObject(ims.RefMan.domain.objects.PreAssessmentOutcome.class, valueObject.getPreAssessmentOutcome().getBoId());
			}
		}
		domainObject.setPreAssessmentOutcome(value60);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value61 = null;
		if ( null != valueObject.getFitForSurgery() ) 
		{
			value61 =
				domainFactory.getLookupInstance(valueObject.getFitForSurgery().getID());
		}
		domainObject.setFitForSurgery(value61);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value62 = null;
		if ( null != valueObject.getAnaestheticType() ) 
		{
			value62 =
				domainFactory.getLookupInstance(valueObject.getAnaestheticType().getID());
		}
		domainObject.setAnaestheticType(value62);
		domainObject.setAvailableAtShortNotice(valueObject.getAvailableAtShortNotice());
		domainObject.setPreOperativeOvernightStayRequired(valueObject.getPreOperativeOvernightStayRequired());
		domainObject.setNoOfPreOperativeNights(valueObject.getNoOfPreOperativeNights());
		domainObject.setAnticipatedStay(valueObject.getAnticipatedStay());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value67 = null;
		if ( null != valueObject.getPatientReceivingAnticoagulantTherapy() ) 
		{
			value67 =
				domainFactory.getLookupInstance(valueObject.getPatientReceivingAnticoagulantTherapy().getID());
		}
		domainObject.setPatientReceivingAnticoagulantTherapy(value67);
		domainObject.setAvailableAtShortNoticePeriod(valueObject.getAvailableAtShortNoticePeriod());
		domainObject.setSubjectTo28DayRule(valueObject.getSubjectTo28DayRule());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value70 = null;
		if ( null != valueObject.getRule28DayStatus() ) 
		{
			value70 =
				domainFactory.getLookupInstance(valueObject.getRule28DayStatus().getID());
		}
		domainObject.setRule28DayStatus(value70);
		java.util.Date value71 = null;
		ims.framework.utils.Date date71 = valueObject.getRule28DayPeriodStart();		
		if ( date71 != null ) 
		{
			value71 = date71.getDate();
		}
		domainObject.setRule28DayPeriodStart(value71);

		ims.core.admin.pas.vo.AdmissionDetailRefVoCollection refCollection72 = valueObject.getAdmissions();
		int size72 = (null == refCollection72) ? 0 : refCollection72.size();		
		java.util.List domainAdmissions72 = domainObject.getAdmissions();
		if (domainAdmissions72 == null)
		{
			domainAdmissions72 = new java.util.ArrayList();
		}
		for(int i=0; i < size72; i++) 
		{
			ims.core.admin.pas.vo.AdmissionDetailRefVo vo = refCollection72.get(i);			
			ims.core.admin.pas.domain.objects.AdmissionDetail dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.admin.pas.domain.objects.AdmissionDetail)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.admin.pas.domain.objects.AdmissionDetail)domainFactory.getDomainObject( ims.core.admin.pas.domain.objects.AdmissionDetail.class, vo.getBoId());
				}
			}

			int domIdx = domainAdmissions72.indexOf(dom);
			if (domIdx == -1)
			{
				domainAdmissions72.add(i, dom);
			}
			else if (i != domIdx && i < domainAdmissions72.size())
			{
				Object tmp = domainAdmissions72.get(i);
				domainAdmissions72.set(i, domainAdmissions72.get(domIdx));
				domainAdmissions72.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i72 = domainAdmissions72.size();
		while (i72 > size72)
		{
			domainAdmissions72.remove(i72-1);
			i72 = domainAdmissions72.size();
		}
		
		domainObject.setAdmissions(domainAdmissions72);		
		domainObject.setTheatreAppointment(ims.scheduling.vo.domain.Booking_AppointmentLiteVoAssembler.extractBooking_Appointment(domainFactory, valueObject.getTheatreAppointment(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value75 = null;
		if ( null != valueObject.getWard() ) 
		{
			if (valueObject.getWard().getBoId() == null)
			{
				if (domMap.get(valueObject.getWard()) != null)
				{
					value75 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getWard());
				}
			}
			else
			{
				value75 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getWard().getBoId());
			}
		}
		domainObject.setWard(value75);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value76 = null;
		if ( null != valueObject.getPatientCategory() ) 
		{
			value76 =
				domainFactory.getLookupInstance(valueObject.getPatientCategory().getID());
		}
		domainObject.setPatientCategory(value76);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value77 = null;
		if ( null != valueObject.getVettingHCP() ) 
		{
			if (valueObject.getVettingHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getVettingHCP()) != null)
				{
					value77 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getVettingHCP());
				}
			}
			else
			{
				value77 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getVettingHCP().getBoId());
			}
		}
		domainObject.setVettingHCP(value77);
		domainObject.setAuthoringInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInfo(), domMap));
		domainObject.setRequiresVetting(valueObject.getRequiresVetting());
		domainObject.setRecordingUser(ims.RefMan.vo.domain.RecordingUserInformationForWLCVoAssembler.extractRecordingUserInformation(domainFactory, valueObject.getRecordingUser(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value81 = null;
		if ( null != valueObject.getPreColonoscopyAssessmentRequired() ) 
		{
			value81 =
				domainFactory.getLookupInstance(valueObject.getPreColonoscopyAssessmentRequired().getID());
		}
		domainObject.setPreColonoscopyAssessmentRequired(value81);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value82 = null;
		if ( null != valueObject.getResponsibleHCP() ) 
		{
			if (valueObject.getResponsibleHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getResponsibleHCP()) != null)
				{
					value82 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getResponsibleHCP());
				}
			}
			else
			{
				value82 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getResponsibleHCP().getBoId());
			}
		}
		domainObject.setResponsibleHCP(value82);

		return domainObject;
	}

}
