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
 * @author Cornel Ventuneac
 */
public class PatientElectiveListAddLaterVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.PatientElectiveListAddLaterVo copy(ims.RefMan.vo.PatientElectiveListAddLaterVo valueObjectDest, ims.RefMan.vo.PatientElectiveListAddLaterVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientElectiveList(valueObjectSrc.getID_PatientElectiveList());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ElectiveList
		valueObjectDest.setElectiveList(valueObjectSrc.getElectiveList());
		// ElectiveListStatus
		valueObjectDest.setElectiveListStatus(valueObjectSrc.getElectiveListStatus());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// Referral
		valueObjectDest.setReferral(valueObjectSrc.getReferral());
		// DateOnList
		valueObjectDest.setDateOnList(valueObjectSrc.getDateOnList());
		// ElectiveListReason
		valueObjectDest.setElectiveListReason(valueObjectSrc.getElectiveListReason());
		// ElectiveAdmissionType
		valueObjectDest.setElectiveAdmissionType(valueObjectSrc.getElectiveAdmissionType());
		// AnticipatedStay
		valueObjectDest.setAnticipatedStay(valueObjectSrc.getAnticipatedStay());
		// Priority
		valueObjectDest.setPriority(valueObjectSrc.getPriority());
		// OperativeProcedureStatus
		valueObjectDest.setOperativeProcedureStatus(valueObjectSrc.getOperativeProcedureStatus());
		// PrimaryProcedure
		valueObjectDest.setPrimaryProcedure(valueObjectSrc.getPrimaryProcedure());
		// ProcedureDescription
		valueObjectDest.setProcedureDescription(valueObjectSrc.getProcedureDescription());
		// ProcLaterality
		valueObjectDest.setProcLaterality(valueObjectSrc.getProcLaterality());
		// isConsultantPerformingProcedure
		valueObjectDest.setIsConsultantPerformingProcedure(valueObjectSrc.getIsConsultantPerformingProcedure());
		// ElectiveListStatusHistory
		valueObjectDest.setElectiveListStatusHistory(valueObjectSrc.getElectiveListStatusHistory());
		// AnaestheticType
		valueObjectDest.setAnaestheticType(valueObjectSrc.getAnaestheticType());
		// AnaesthesisRiskAssessmentRequest
		valueObjectDest.setAnaesthesisRiskAssessmentRequest(valueObjectSrc.getAnaesthesisRiskAssessmentRequest());
		// OperateOnAnticoagulantComment
		valueObjectDest.setOperateOnAnticoagulantComment(valueObjectSrc.getOperateOnAnticoagulantComment());
		// RequiredTheatreType
		valueObjectDest.setRequiredTheatreType(valueObjectSrc.getRequiredTheatreType());
		// Comments
		valueObjectDest.setComments(valueObjectSrc.getComments());
		// CreatingAppointment
		valueObjectDest.setCreatingAppointment(valueObjectSrc.getCreatingAppointment());
		// AppointmentOutcomeAction
		valueObjectDest.setAppointmentOutcomeAction(valueObjectSrc.getAppointmentOutcomeAction());
		// TCIGiven
		valueObjectDest.setTCIGiven(valueObjectSrc.getTCIGiven());
		// TakesLongerThanStandardTime
		valueObjectDest.setTakesLongerThanStandardTime(valueObjectSrc.getTakesLongerThanStandardTime());
		// AnticipatedProcedureLength
		valueObjectDest.setAnticipatedProcedureLength(valueObjectSrc.getAnticipatedProcedureLength());
		// AnaesthetistRequiredInTheatre
		valueObjectDest.setAnaesthetistRequiredInTheatre(valueObjectSrc.getAnaesthetistRequiredInTheatre());
		// CareGiven
		valueObjectDest.setCareGiven(valueObjectSrc.getCareGiven());
		// ProcedureCarriedOutBy
		valueObjectDest.setProcedureCarriedOutBy(valueObjectSrc.getProcedureCarriedOutBy());
		// ProceduredToBeCarriedBy
		valueObjectDest.setProceduredToBeCarriedBy(valueObjectSrc.getProceduredToBeCarriedBy());
		// Hospital
		valueObjectDest.setHospital(valueObjectSrc.getHospital());
		// AdmissionType
		valueObjectDest.setAdmissionType(valueObjectSrc.getAdmissionType());
		// AdmittedIn
		valueObjectDest.setAdmittedIn(valueObjectSrc.getAdmittedIn());
		// AdmittedInUnitOfTime
		valueObjectDest.setAdmittedInUnitOfTime(valueObjectSrc.getAdmittedInUnitOfTime());
		// wasPossibleDateGiven
		valueObjectDest.setWasPossibleDateGiven(valueObjectSrc.getWasPossibleDateGiven());
		// DateGivenToPatient
		valueObjectDest.setDateGivenToPatient(valueObjectSrc.getDateGivenToPatient());
		// SecondaryProcedure
		valueObjectDest.setSecondaryProcedure(valueObjectSrc.getSecondaryProcedure());
		// SecondaryProcLaterality
		valueObjectDest.setSecondaryProcLaterality(valueObjectSrc.getSecondaryProcLaterality());
		// WLAnaestheticType
		valueObjectDest.setWLAnaestheticType(valueObjectSrc.getWLAnaestheticType());
		// AvailableAtShortNotice
		valueObjectDest.setAvailableAtShortNotice(valueObjectSrc.getAvailableAtShortNotice());
		// AvailableAtShortNoticePeriod
		valueObjectDest.setAvailableAtShortNoticePeriod(valueObjectSrc.getAvailableAtShortNoticePeriod());
		// WLAvailableAtShortNotice
		valueObjectDest.setWLAvailableAtShortNotice(valueObjectSrc.getWLAvailableAtShortNotice());
		// WLAvailableAtShortNoticePeriod
		valueObjectDest.setWLAvailableAtShortNoticePeriod(valueObjectSrc.getWLAvailableAtShortNoticePeriod());
		// PreOperativeOvernightStayRequired
		valueObjectDest.setPreOperativeOvernightStayRequired(valueObjectSrc.getPreOperativeOvernightStayRequired());
		// WLPreOperativeOvernightStayRequired
		valueObjectDest.setWLPreOperativeOvernightStayRequired(valueObjectSrc.getWLPreOperativeOvernightStayRequired());
		// NoOfPreOperativeNights
		valueObjectDest.setNoOfPreOperativeNights(valueObjectSrc.getNoOfPreOperativeNights());
		// WLNoOfPreOperativeNights
		valueObjectDest.setWLNoOfPreOperativeNights(valueObjectSrc.getWLNoOfPreOperativeNights());
		// WLAnticipatedStay
		valueObjectDest.setWLAnticipatedStay(valueObjectSrc.getWLAnticipatedStay());
		// CriticalCareBedRequired
		valueObjectDest.setCriticalCareBedRequired(valueObjectSrc.getCriticalCareBedRequired());
		// HDUBedRequired
		valueObjectDest.setHDUBedRequired(valueObjectSrc.getHDUBedRequired());
		// ITUBedRequired
		valueObjectDest.setITUBedRequired(valueObjectSrc.getITUBedRequired());
		// PatientReceivingAnticoagulantTherapy
		valueObjectDest.setPatientReceivingAnticoagulantTherapy(valueObjectSrc.getPatientReceivingAnticoagulantTherapy());
		// WLPatientReceivingAnticoagulantTherapy
		valueObjectDest.setWLPatientReceivingAnticoagulantTherapy(valueObjectSrc.getWLPatientReceivingAnticoagulantTherapy());
		// FollowPeriOperativeguidelines
		valueObjectDest.setFollowPeriOperativeguidelines(valueObjectSrc.getFollowPeriOperativeguidelines());
		// PeriOpNoReasonComments
		valueObjectDest.setPeriOpNoReasonComments(valueObjectSrc.getPeriOpNoReasonComments());
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
		// DetailsForNonGAEndoProcedure
		valueObjectDest.setDetailsForNonGAEndoProcedure(valueObjectSrc.getDetailsForNonGAEndoProcedure());
		// PreAssessmentRequired
		valueObjectDest.setPreAssessmentRequired(valueObjectSrc.getPreAssessmentRequired());
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
		// TCIDetails
		valueObjectDest.setTCIDetails(valueObjectSrc.getTCIDetails());
		// Consultant
		valueObjectDest.setConsultant(valueObjectSrc.getConsultant());
		// CognitiveComments
		valueObjectDest.setCognitiveComments(valueObjectSrc.getCognitiveComments());
		// ToBePlannedIn
		valueObjectDest.setToBePlannedIn(valueObjectSrc.getToBePlannedIn());
		// ToBePlannedInUnit
		valueObjectDest.setToBePlannedInUnit(valueObjectSrc.getToBePlannedInUnit());
		// PlannedDate
		valueObjectDest.setPlannedDate(valueObjectSrc.getPlannedDate());
		// isSuitableForTelephoneAssessment
		valueObjectDest.setIsSuitableForTelephoneAssessment(valueObjectSrc.getIsSuitableForTelephoneAssessment());
		// SystemInformation
		valueObjectDest.setSystemInformation(valueObjectSrc.getSystemInformation());
		// MultiServiceCase
		valueObjectDest.setMultiServiceCase(valueObjectSrc.getMultiServiceCase());
		// RequiresVetting
		valueObjectDest.setRequiresVetting(valueObjectSrc.getRequiresVetting());
		// Ward
		valueObjectDest.setWard(valueObjectSrc.getWard());
		// VettingDate
		valueObjectDest.setVettingDate(valueObjectSrc.getVettingDate());
		// VettingHCP
		valueObjectDest.setVettingHCP(valueObjectSrc.getVettingHCP());
		// AuthoringInfo
		valueObjectDest.setAuthoringInfo(valueObjectSrc.getAuthoringInfo());
		// IntendedManagement
		valueObjectDest.setIntendedManagement(valueObjectSrc.getIntendedManagement());
		// PatientCategory
		valueObjectDest.setPatientCategory(valueObjectSrc.getPatientCategory());
		// PreAssessmentOutcome
		valueObjectDest.setPreAssessmentOutcome(valueObjectSrc.getPreAssessmentOutcome());
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
 	 * If more than one call to an Assembler is made then #createPatientElectiveListAddLaterVoCollectionFromPatientElectiveList(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListAddLaterVoCollection createPatientElectiveListAddLaterVoCollectionFromPatientElectiveList(java.util.Set domainObjectSet)	
	{
		return createPatientElectiveListAddLaterVoCollectionFromPatientElectiveList(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListAddLaterVoCollection createPatientElectiveListAddLaterVoCollectionFromPatientElectiveList(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.PatientElectiveListAddLaterVoCollection voList = new ims.RefMan.vo.PatientElectiveListAddLaterVoCollection();
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
			ims.RefMan.vo.PatientElectiveListAddLaterVo vo = create(map, domainObject);
			
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
	public static ims.RefMan.vo.PatientElectiveListAddLaterVoCollection createPatientElectiveListAddLaterVoCollectionFromPatientElectiveList(java.util.List domainObjectList) 
	{
		return createPatientElectiveListAddLaterVoCollectionFromPatientElectiveList(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListAddLaterVoCollection createPatientElectiveListAddLaterVoCollectionFromPatientElectiveList(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.PatientElectiveListAddLaterVoCollection voList = new ims.RefMan.vo.PatientElectiveListAddLaterVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.PatientElectiveList domainObject = (ims.RefMan.domain.objects.PatientElectiveList) domainObjectList.get(i);
			ims.RefMan.vo.PatientElectiveListAddLaterVo vo = create(map, domainObject);

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
	 public static java.util.Set extractPatientElectiveListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListAddLaterVoCollection voCollection) 
	 {
	 	return extractPatientElectiveListSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientElectiveListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListAddLaterVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientElectiveListAddLaterVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.PatientElectiveList domainObject = PatientElectiveListAddLaterVoAssembler.extractPatientElectiveList(domainFactory, vo, domMap);

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
	 public static java.util.List extractPatientElectiveListList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListAddLaterVoCollection voCollection) 
	 {
	 	return extractPatientElectiveListList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientElectiveListList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListAddLaterVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientElectiveListAddLaterVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.PatientElectiveList domainObject = PatientElectiveListAddLaterVoAssembler.extractPatientElectiveList(domainFactory, vo, domMap);

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
	 public static ims.RefMan.vo.PatientElectiveListAddLaterVo create(ims.RefMan.domain.objects.PatientElectiveList domainObject) 
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
	  public static ims.RefMan.vo.PatientElectiveListAddLaterVo create(DomainObjectMap map, ims.RefMan.domain.objects.PatientElectiveList domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.PatientElectiveListAddLaterVo valueObject = (ims.RefMan.vo.PatientElectiveListAddLaterVo) map.getValueObject(domainObject, ims.RefMan.vo.PatientElectiveListAddLaterVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.PatientElectiveListAddLaterVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.RefMan.vo.PatientElectiveListAddLaterVo insert(ims.RefMan.vo.PatientElectiveListAddLaterVo valueObject, ims.RefMan.domain.objects.PatientElectiveList domainObject) 
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
	 public static ims.RefMan.vo.PatientElectiveListAddLaterVo insert(DomainObjectMap map, ims.RefMan.vo.PatientElectiveListAddLaterVo valueObject, ims.RefMan.domain.objects.PatientElectiveList domainObject) 
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
			
		// ElectiveList
		valueObject.setElectiveList(ims.RefMan.vo.domain.ElectiveListConfigurationWLVoAssembler.create(map, domainObject.getElectiveList()) );
		// ElectiveListStatus
		valueObject.setElectiveListStatus(ims.RefMan.vo.domain.ElectiveListStatusVoAssembler.create(map, domainObject.getElectiveListStatus()) );
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
		if (domainObject.getReferral() != null)
		{
			if(domainObject.getReferral() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getReferral();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setReferral(new ims.RefMan.vo.CatsReferralRefVo(id, -1));				
			}
			else
			{
				valueObject.setReferral(new ims.RefMan.vo.CatsReferralRefVo(domainObject.getReferral().getId(), domainObject.getReferral().getVersion()));
			}
		}
		// DateOnList
		java.util.Date DateOnList = domainObject.getDateOnList();
		if ( null != DateOnList ) 
		{
			valueObject.setDateOnList(new ims.framework.utils.Date(DateOnList) );
		}
		// ElectiveListReason
		ims.domain.lookups.LookupInstance instance6 = domainObject.getElectiveListReason();
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

			ims.emergency.vo.lookups.ElectiveListReason voLookup6 = new ims.emergency.vo.lookups.ElectiveListReason(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.emergency.vo.lookups.ElectiveListReason parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.emergency.vo.lookups.ElectiveListReason(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setElectiveListReason(voLookup6);
		}
				// ElectiveAdmissionType
		ims.domain.lookups.LookupInstance instance7 = domainObject.getElectiveAdmissionType();
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

			ims.RefMan.vo.lookups.ElectiveAdmissionType voLookup7 = new ims.RefMan.vo.lookups.ElectiveAdmissionType(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ElectiveAdmissionType parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.RefMan.vo.lookups.ElectiveAdmissionType(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setElectiveAdmissionType(voLookup7);
		}
				// AnticipatedStay
		valueObject.setAnticipatedStay(domainObject.getAnticipatedStay());
		// Priority
		ims.domain.lookups.LookupInstance instance9 = domainObject.getPriority();
		if ( null != instance9 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance9.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance9.getImage().getImageId(), instance9.getImage().getImagePath());
			}
			color = instance9.getColor();
			if (color != null) 
				color.getValue();

			ims.RefMan.vo.lookups.ReferralUrgency voLookup9 = new ims.RefMan.vo.lookups.ReferralUrgency(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ReferralUrgency parentVoLookup9 = voLookup9;
			ims.domain.lookups.LookupInstance parent9 = instance9.getParent();
			while (parent9 != null)
			{
				if (parent9.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent9.getImage().getImageId(), parent9.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent9.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup9.setParent(new ims.RefMan.vo.lookups.ReferralUrgency(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setPriority(voLookup9);
		}
				// OperativeProcedureStatus
		valueObject.setOperativeProcedureStatus( domainObject.isOperativeProcedureStatus() );
		// PrimaryProcedure
		valueObject.setPrimaryProcedure(ims.core.vo.domain.ProcedureVoAssembler.create(map, domainObject.getPrimaryProcedure()) );
		// ProcedureDescription
		valueObject.setProcedureDescription(domainObject.getProcedureDescription());
		// ProcLaterality
		ims.domain.lookups.LookupInstance instance13 = domainObject.getProcLaterality();
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

			ims.core.vo.lookups.LateralityLRB voLookup13 = new ims.core.vo.lookups.LateralityLRB(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.core.vo.lookups.LateralityLRB parentVoLookup13 = voLookup13;
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
								parentVoLookup13.setParent(new ims.core.vo.lookups.LateralityLRB(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setProcLaterality(voLookup13);
		}
				// isConsultantPerformingProcedure
		valueObject.setIsConsultantPerformingProcedure( domainObject.isIsConsultantPerformingProcedure() );
		// ElectiveListStatusHistory
		valueObject.setElectiveListStatusHistory(ims.RefMan.vo.domain.ElectiveListStatusVoAssembler.createElectiveListStatusVoCollectionFromElectiveListStatus(map, domainObject.getElectiveListStatusHistory()) );
		// AnaestheticType
		ims.domain.lookups.LookupInstance instance16 = domainObject.getAnaestheticType();
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

			ims.clinical.vo.lookups.AnaestheticType voLookup16 = new ims.clinical.vo.lookups.AnaestheticType(instance16.getId(),instance16.getText(), instance16.isActive(), null, img, color);
			ims.clinical.vo.lookups.AnaestheticType parentVoLookup16 = voLookup16;
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
								parentVoLookup16.setParent(new ims.clinical.vo.lookups.AnaestheticType(parent16.getId(),parent16.getText(), parent16.isActive(), null, img, color));
				parentVoLookup16 = parentVoLookup16.getParent();
								parent16 = parent16.getParent();
			}			
			valueObject.setAnaestheticType(voLookup16);
		}
				// AnaesthesisRiskAssessmentRequest
		valueObject.setAnaesthesisRiskAssessmentRequest( domainObject.isAnaesthesisRiskAssessmentRequest() );
		// OperateOnAnticoagulantComment
		valueObject.setOperateOnAnticoagulantComment(domainObject.getOperateOnAnticoagulantComment());
		// RequiredTheatreType
		ims.domain.lookups.LookupInstance instance19 = domainObject.getRequiredTheatreType();
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

			ims.scheduling.vo.lookups.TheatreType voLookup19 = new ims.scheduling.vo.lookups.TheatreType(instance19.getId(),instance19.getText(), instance19.isActive(), null, img, color);
			ims.scheduling.vo.lookups.TheatreType parentVoLookup19 = voLookup19;
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
								parentVoLookup19.setParent(new ims.scheduling.vo.lookups.TheatreType(parent19.getId(),parent19.getText(), parent19.isActive(), null, img, color));
				parentVoLookup19 = parentVoLookup19.getParent();
								parent19 = parent19.getParent();
			}			
			valueObject.setRequiredTheatreType(voLookup19);
		}
				// Comments
		valueObject.setComments(domainObject.getComments());
		// CreatingAppointment
		if (domainObject.getCreatingAppointment() != null)
		{
			if(domainObject.getCreatingAppointment() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCreatingAppointment();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCreatingAppointment(new ims.scheduling.vo.Booking_AppointmentRefVo(id, -1));				
			}
			else
			{
				valueObject.setCreatingAppointment(new ims.scheduling.vo.Booking_AppointmentRefVo(domainObject.getCreatingAppointment().getId(), domainObject.getCreatingAppointment().getVersion()));
			}
		}
		// AppointmentOutcomeAction
		if (domainObject.getAppointmentOutcomeAction() != null)
		{
			if(domainObject.getAppointmentOutcomeAction() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAppointmentOutcomeAction();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAppointmentOutcomeAction(new ims.scheduling.vo.AppointmentOutcomeActionRefVo(id, -1));				
			}
			else
			{
				valueObject.setAppointmentOutcomeAction(new ims.scheduling.vo.AppointmentOutcomeActionRefVo(domainObject.getAppointmentOutcomeAction().getId(), domainObject.getAppointmentOutcomeAction().getVersion()));
			}
		}
		// TCIGiven
		valueObject.setTCIGiven( domainObject.isTCIGiven() );
		// TakesLongerThanStandardTime
		valueObject.setTakesLongerThanStandardTime( domainObject.isTakesLongerThanStandardTime() );
		// AnticipatedProcedureLength
		valueObject.setAnticipatedProcedureLength(domainObject.getAnticipatedProcedureLength());
		// AnaesthetistRequiredInTheatre
		valueObject.setAnaesthetistRequiredInTheatre( domainObject.isAnaesthetistRequiredInTheatre() );
		// CareGiven
		ims.domain.lookups.LookupInstance instance27 = domainObject.getCareGiven();
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

			ims.RefMan.vo.lookups.PreOpPostOpCare voLookup27 = new ims.RefMan.vo.lookups.PreOpPostOpCare(instance27.getId(),instance27.getText(), instance27.isActive(), null, img, color);
			ims.RefMan.vo.lookups.PreOpPostOpCare parentVoLookup27 = voLookup27;
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
								parentVoLookup27.setParent(new ims.RefMan.vo.lookups.PreOpPostOpCare(parent27.getId(),parent27.getText(), parent27.isActive(), null, img, color));
				parentVoLookup27 = parentVoLookup27.getParent();
								parent27 = parent27.getParent();
			}			
			valueObject.setCareGiven(voLookup27);
		}
				// ProcedureCarriedOutBy
		valueObject.setProcedureCarriedOutBy(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getProcedureCarriedOutBy()) );
		// ProceduredToBeCarriedBy
		ims.domain.lookups.LookupInstance instance29 = domainObject.getProceduredToBeCarriedBy();
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

			ims.RefMan.vo.lookups.ProcedureExecutant voLookup29 = new ims.RefMan.vo.lookups.ProcedureExecutant(instance29.getId(),instance29.getText(), instance29.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ProcedureExecutant parentVoLookup29 = voLookup29;
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
								parentVoLookup29.setParent(new ims.RefMan.vo.lookups.ProcedureExecutant(parent29.getId(),parent29.getText(), parent29.isActive(), null, img, color));
				parentVoLookup29 = parentVoLookup29.getParent();
								parent29 = parent29.getParent();
			}			
			valueObject.setProceduredToBeCarriedBy(voLookup29);
		}
				// Hospital
		valueObject.setHospital(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getHospital()) );
		// AdmissionType
		ims.domain.lookups.LookupInstance instance31 = domainObject.getAdmissionType();
		if ( null != instance31 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance31.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance31.getImage().getImageId(), instance31.getImage().getImagePath());
			}
			color = instance31.getColor();
			if (color != null) 
				color.getValue();

			ims.RefMan.vo.lookups.WaitingCardAdmissionType voLookup31 = new ims.RefMan.vo.lookups.WaitingCardAdmissionType(instance31.getId(),instance31.getText(), instance31.isActive(), null, img, color);
			ims.RefMan.vo.lookups.WaitingCardAdmissionType parentVoLookup31 = voLookup31;
			ims.domain.lookups.LookupInstance parent31 = instance31.getParent();
			while (parent31 != null)
			{
				if (parent31.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent31.getImage().getImageId(), parent31.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent31.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup31.setParent(new ims.RefMan.vo.lookups.WaitingCardAdmissionType(parent31.getId(),parent31.getText(), parent31.isActive(), null, img, color));
				parentVoLookup31 = parentVoLookup31.getParent();
								parent31 = parent31.getParent();
			}			
			valueObject.setAdmissionType(voLookup31);
		}
				// AdmittedIn
		valueObject.setAdmittedIn(domainObject.getAdmittedIn());
		// AdmittedInUnitOfTime
		ims.domain.lookups.LookupInstance instance33 = domainObject.getAdmittedInUnitOfTime();
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

			ims.RefMan.vo.lookups.AddmitedInTimeUnit voLookup33 = new ims.RefMan.vo.lookups.AddmitedInTimeUnit(instance33.getId(),instance33.getText(), instance33.isActive(), null, img, color);
			ims.RefMan.vo.lookups.AddmitedInTimeUnit parentVoLookup33 = voLookup33;
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
								parentVoLookup33.setParent(new ims.RefMan.vo.lookups.AddmitedInTimeUnit(parent33.getId(),parent33.getText(), parent33.isActive(), null, img, color));
				parentVoLookup33 = parentVoLookup33.getParent();
								parent33 = parent33.getParent();
			}			
			valueObject.setAdmittedInUnitOfTime(voLookup33);
		}
				// wasPossibleDateGiven
		valueObject.setWasPossibleDateGiven( domainObject.isWasPossibleDateGiven() );
		// DateGivenToPatient
		java.util.Date DateGivenToPatient = domainObject.getDateGivenToPatient();
		if ( null != DateGivenToPatient ) 
		{
			valueObject.setDateGivenToPatient(new ims.framework.utils.Date(DateGivenToPatient) );
		}
		// SecondaryProcedure
		valueObject.setSecondaryProcedure(ims.core.vo.domain.ProcedureVoAssembler.create(map, domainObject.getSecondaryProcedure()) );
		// SecondaryProcLaterality
		ims.domain.lookups.LookupInstance instance37 = domainObject.getSecondaryProcLaterality();
		if ( null != instance37 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance37.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance37.getImage().getImageId(), instance37.getImage().getImagePath());
			}
			color = instance37.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.LateralityLRB voLookup37 = new ims.core.vo.lookups.LateralityLRB(instance37.getId(),instance37.getText(), instance37.isActive(), null, img, color);
			ims.core.vo.lookups.LateralityLRB parentVoLookup37 = voLookup37;
			ims.domain.lookups.LookupInstance parent37 = instance37.getParent();
			while (parent37 != null)
			{
				if (parent37.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent37.getImage().getImageId(), parent37.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent37.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup37.setParent(new ims.core.vo.lookups.LateralityLRB(parent37.getId(),parent37.getText(), parent37.isActive(), null, img, color));
				parentVoLookup37 = parentVoLookup37.getParent();
								parent37 = parent37.getParent();
			}			
			valueObject.setSecondaryProcLaterality(voLookup37);
		}
				// WLAnaestheticType
		ims.domain.lookups.LookupInstance instance38 = domainObject.getWLAnaestheticType();
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

			ims.clinical.vo.lookups.AnaestheticType voLookup38 = new ims.clinical.vo.lookups.AnaestheticType(instance38.getId(),instance38.getText(), instance38.isActive(), null, img, color);
			ims.clinical.vo.lookups.AnaestheticType parentVoLookup38 = voLookup38;
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
								parentVoLookup38.setParent(new ims.clinical.vo.lookups.AnaestheticType(parent38.getId(),parent38.getText(), parent38.isActive(), null, img, color));
				parentVoLookup38 = parentVoLookup38.getParent();
								parent38 = parent38.getParent();
			}			
			valueObject.setWLAnaestheticType(voLookup38);
		}
				// AvailableAtShortNotice
		valueObject.setAvailableAtShortNotice( domainObject.isAvailableAtShortNotice() );
		// AvailableAtShortNoticePeriod
		valueObject.setAvailableAtShortNoticePeriod(domainObject.getAvailableAtShortNoticePeriod());
		// WLAvailableAtShortNotice
		valueObject.setWLAvailableAtShortNotice( domainObject.isWLAvailableAtShortNotice() );
		// WLAvailableAtShortNoticePeriod
		valueObject.setWLAvailableAtShortNoticePeriod(domainObject.getWLAvailableAtShortNoticePeriod());
		// PreOperativeOvernightStayRequired
		valueObject.setPreOperativeOvernightStayRequired( domainObject.isPreOperativeOvernightStayRequired() );
		// WLPreOperativeOvernightStayRequired
		valueObject.setWLPreOperativeOvernightStayRequired( domainObject.isWLPreOperativeOvernightStayRequired() );
		// NoOfPreOperativeNights
		valueObject.setNoOfPreOperativeNights(domainObject.getNoOfPreOperativeNights());
		// WLNoOfPreOperativeNights
		valueObject.setWLNoOfPreOperativeNights(domainObject.getWLNoOfPreOperativeNights());
		// WLAnticipatedStay
		valueObject.setWLAnticipatedStay(domainObject.getWLAnticipatedStay());
		// CriticalCareBedRequired
		valueObject.setCriticalCareBedRequired( domainObject.isCriticalCareBedRequired() );
		// HDUBedRequired
		valueObject.setHDUBedRequired( domainObject.isHDUBedRequired() );
		// ITUBedRequired
		valueObject.setITUBedRequired( domainObject.isITUBedRequired() );
		// PatientReceivingAnticoagulantTherapy
		ims.domain.lookups.LookupInstance instance51 = domainObject.getPatientReceivingAnticoagulantTherapy();
		if ( null != instance51 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance51.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance51.getImage().getImageId(), instance51.getImage().getImagePath());
			}
			color = instance51.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNoUnknown voLookup51 = new ims.core.vo.lookups.YesNoUnknown(instance51.getId(),instance51.getText(), instance51.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup51 = voLookup51;
			ims.domain.lookups.LookupInstance parent51 = instance51.getParent();
			while (parent51 != null)
			{
				if (parent51.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent51.getImage().getImageId(), parent51.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent51.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup51.setParent(new ims.core.vo.lookups.YesNoUnknown(parent51.getId(),parent51.getText(), parent51.isActive(), null, img, color));
				parentVoLookup51 = parentVoLookup51.getParent();
								parent51 = parent51.getParent();
			}			
			valueObject.setPatientReceivingAnticoagulantTherapy(voLookup51);
		}
				// WLPatientReceivingAnticoagulantTherapy
		ims.domain.lookups.LookupInstance instance52 = domainObject.getWLPatientReceivingAnticoagulantTherapy();
		if ( null != instance52 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance52.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance52.getImage().getImageId(), instance52.getImage().getImagePath());
			}
			color = instance52.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNoUnknown voLookup52 = new ims.core.vo.lookups.YesNoUnknown(instance52.getId(),instance52.getText(), instance52.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup52 = voLookup52;
			ims.domain.lookups.LookupInstance parent52 = instance52.getParent();
			while (parent52 != null)
			{
				if (parent52.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent52.getImage().getImageId(), parent52.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent52.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup52.setParent(new ims.core.vo.lookups.YesNoUnknown(parent52.getId(),parent52.getText(), parent52.isActive(), null, img, color));
				parentVoLookup52 = parentVoLookup52.getParent();
								parent52 = parent52.getParent();
			}			
			valueObject.setWLPatientReceivingAnticoagulantTherapy(voLookup52);
		}
				// FollowPeriOperativeguidelines
		ims.domain.lookups.LookupInstance instance53 = domainObject.getFollowPeriOperativeguidelines();
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

			ims.core.vo.lookups.YesNo voLookup53 = new ims.core.vo.lookups.YesNo(instance53.getId(),instance53.getText(), instance53.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup53 = voLookup53;
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
								parentVoLookup53.setParent(new ims.core.vo.lookups.YesNo(parent53.getId(),parent53.getText(), parent53.isActive(), null, img, color));
				parentVoLookup53 = parentVoLookup53.getParent();
								parent53 = parent53.getParent();
			}			
			valueObject.setFollowPeriOperativeguidelines(voLookup53);
		}
				// PeriOpNoReasonComments
		valueObject.setPeriOpNoReasonComments(domainObject.getPeriOpNoReasonComments());
		// InterpretatorRequired
		valueObject.setInterpretatorRequired( domainObject.isInterpretatorRequired() );
		// Language
		ims.domain.lookups.LookupInstance instance56 = domainObject.getLanguage();
		if ( null != instance56 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance56.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance56.getImage().getImageId(), instance56.getImage().getImagePath());
			}
			color = instance56.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.Language voLookup56 = new ims.core.vo.lookups.Language(instance56.getId(),instance56.getText(), instance56.isActive(), null, img, color);
			ims.core.vo.lookups.Language parentVoLookup56 = voLookup56;
			ims.domain.lookups.LookupInstance parent56 = instance56.getParent();
			while (parent56 != null)
			{
				if (parent56.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent56.getImage().getImageId(), parent56.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent56.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup56.setParent(new ims.core.vo.lookups.Language(parent56.getId(),parent56.getText(), parent56.isActive(), null, img, color));
				parentVoLookup56 = parentVoLookup56.getParent();
								parent56 = parent56.getParent();
			}			
			valueObject.setLanguage(voLookup56);
		}
				// TransportRequired
		valueObject.setTransportRequired( domainObject.isTransportRequired() );
		// Transport
		ims.domain.lookups.LookupInstance instance58 = domainObject.getTransport();
		if ( null != instance58 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance58.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance58.getImage().getImageId(), instance58.getImage().getImagePath());
			}
			color = instance58.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.ApptTransportType voLookup58 = new ims.scheduling.vo.lookups.ApptTransportType(instance58.getId(),instance58.getText(), instance58.isActive(), null, img, color);
			ims.scheduling.vo.lookups.ApptTransportType parentVoLookup58 = voLookup58;
			ims.domain.lookups.LookupInstance parent58 = instance58.getParent();
			while (parent58 != null)
			{
				if (parent58.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent58.getImage().getImageId(), parent58.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent58.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup58.setParent(new ims.scheduling.vo.lookups.ApptTransportType(parent58.getId(),parent58.getText(), parent58.isActive(), null, img, color));
				parentVoLookup58 = parentVoLookup58.getParent();
								parent58 = parent58.getParent();
			}			
			valueObject.setTransport(voLookup58);
		}
				// SpecialRequirements
		valueObject.setSpecialRequirements( domainObject.isSpecialRequirements() );
		// SpecialRequirementsDetails
		valueObject.setSpecialRequirementsDetails(domainObject.getSpecialRequirementsDetails());
		// SuspectedGIBleed
		valueObject.setSuspectedGIBleed( domainObject.isSuspectedGIBleed() );
		// Points
		valueObject.setPoints(domainObject.getPoints());
		// SuitableforTraining
		valueObject.setSuitableforTraining( domainObject.isSuitableforTraining() );
		// GeneralAnaesthetic
		ims.domain.lookups.LookupInstance instance64 = domainObject.getGeneralAnaesthetic();
		if ( null != instance64 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance64.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance64.getImage().getImageId(), instance64.getImage().getImagePath());
			}
			color = instance64.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup64 = new ims.core.vo.lookups.YesNo(instance64.getId(),instance64.getText(), instance64.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup64 = voLookup64;
			ims.domain.lookups.LookupInstance parent64 = instance64.getParent();
			while (parent64 != null)
			{
				if (parent64.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent64.getImage().getImageId(), parent64.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent64.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup64.setParent(new ims.core.vo.lookups.YesNo(parent64.getId(),parent64.getText(), parent64.isActive(), null, img, color));
				parentVoLookup64 = parentVoLookup64.getParent();
								parent64 = parent64.getParent();
			}			
			valueObject.setGeneralAnaesthetic(voLookup64);
		}
				// CanNurseCarryOutProcedure
		valueObject.setCanNurseCarryOutProcedure( domainObject.isCanNurseCarryOutProcedure() );
		// DetailsForNonGAEndoProcedure
		valueObject.setDetailsForNonGAEndoProcedure(domainObject.getDetailsForNonGAEndoProcedure());
		// PreAssessmentRequired
		valueObject.setPreAssessmentRequired( domainObject.isPreAssessmentRequired() );
		// MedicationShouldBeStoppedOralBowelPrep
		valueObject.setMedicationShouldBeStoppedOralBowelPrep( domainObject.isMedicationShouldBeStoppedOralBowelPrep() );
		// DrugInformation
		valueObject.setDrugInformation(domainObject.getDrugInformation());
		// hasPacemakerDefib
		valueObject.setHasPacemakerDefib( domainObject.isHasPacemakerDefib() );
		// RenalFunctionAssessment
		ims.domain.lookups.LookupInstance instance71 = domainObject.getRenalFunctionAssessment();
		if ( null != instance71 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance71.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance71.getImage().getImageId(), instance71.getImage().getImagePath());
			}
			color = instance71.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup71 = new ims.core.vo.lookups.YesNo(instance71.getId(),instance71.getText(), instance71.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup71 = voLookup71;
			ims.domain.lookups.LookupInstance parent71 = instance71.getParent();
			while (parent71 != null)
			{
				if (parent71.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent71.getImage().getImageId(), parent71.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent71.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup71.setParent(new ims.core.vo.lookups.YesNo(parent71.getId(),parent71.getText(), parent71.isActive(), null, img, color));
				parentVoLookup71 = parentVoLookup71.getParent();
								parent71 = parent71.getParent();
			}			
			valueObject.setRenalFunctionAssessment(voLookup71);
		}
				// AreThereKeyTherapeutic
		valueObject.setAreThereKeyTherapeutic( domainObject.isAreThereKeyTherapeutic() );
		// TCIDetails
		valueObject.setTCIDetails(ims.RefMan.vo.domain.TCIForPatientElectivetListWLVoAssembler.create(map, domainObject.getTCIDetails()) );
		// Consultant
		valueObject.setConsultant(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getConsultant()) );
		// CognitiveComments
		valueObject.setCognitiveComments(domainObject.getCognitiveComments());
		// ToBePlannedIn
		valueObject.setToBePlannedIn(domainObject.getToBePlannedIn());
		// ToBePlannedInUnit
		ims.domain.lookups.LookupInstance instance77 = domainObject.getToBePlannedInUnit();
		if ( null != instance77 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance77.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance77.getImage().getImageId(), instance77.getImage().getImagePath());
			}
			color = instance77.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.TimeUnitsSecondsToMonths voLookup77 = new ims.core.vo.lookups.TimeUnitsSecondsToMonths(instance77.getId(),instance77.getText(), instance77.isActive(), null, img, color);
			ims.core.vo.lookups.TimeUnitsSecondsToMonths parentVoLookup77 = voLookup77;
			ims.domain.lookups.LookupInstance parent77 = instance77.getParent();
			while (parent77 != null)
			{
				if (parent77.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent77.getImage().getImageId(), parent77.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent77.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup77.setParent(new ims.core.vo.lookups.TimeUnitsSecondsToMonths(parent77.getId(),parent77.getText(), parent77.isActive(), null, img, color));
				parentVoLookup77 = parentVoLookup77.getParent();
								parent77 = parent77.getParent();
			}			
			valueObject.setToBePlannedInUnit(voLookup77);
		}
				// PlannedDate
		java.util.Date PlannedDate = domainObject.getPlannedDate();
		if ( null != PlannedDate ) 
		{
			valueObject.setPlannedDate(new ims.framework.utils.Date(PlannedDate) );
		}
		// isSuitableForTelephoneAssessment
		valueObject.setIsSuitableForTelephoneAssessment( domainObject.isIsSuitableForTelephoneAssessment() );
		// SystemInformation
		// set system information
		valueObject.setSystemInformation(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// MultiServiceCase
		valueObject.setMultiServiceCase( domainObject.isMultiServiceCase() );
		// RequiresVetting
		valueObject.setRequiresVetting( domainObject.isRequiresVetting() );
		// Ward
		valueObject.setWard(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getWard()) );
		// VettingDate
		java.util.Date VettingDate = domainObject.getVettingDate();
		if ( null != VettingDate ) 
		{
			valueObject.setVettingDate(new ims.framework.utils.DateTime(VettingDate) );
		}
		// VettingHCP
		valueObject.setVettingHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getVettingHCP()) );
		// AuthoringInfo
		valueObject.setAuthoringInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInfo()) );
		// IntendedManagement
		ims.domain.lookups.LookupInstance instance87 = domainObject.getIntendedManagement();
		if ( null != instance87 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance87.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance87.getImage().getImageId(), instance87.getImage().getImagePath());
			}
			color = instance87.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.ManagementIntention voLookup87 = new ims.core.vo.lookups.ManagementIntention(instance87.getId(),instance87.getText(), instance87.isActive(), null, img, color);
			ims.core.vo.lookups.ManagementIntention parentVoLookup87 = voLookup87;
			ims.domain.lookups.LookupInstance parent87 = instance87.getParent();
			while (parent87 != null)
			{
				if (parent87.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent87.getImage().getImageId(), parent87.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent87.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup87.setParent(new ims.core.vo.lookups.ManagementIntention(parent87.getId(),parent87.getText(), parent87.isActive(), null, img, color));
				parentVoLookup87 = parentVoLookup87.getParent();
								parent87 = parent87.getParent();
			}			
			valueObject.setIntendedManagement(voLookup87);
		}
				// PatientCategory
		ims.domain.lookups.LookupInstance instance88 = domainObject.getPatientCategory();
		if ( null != instance88 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance88.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance88.getImage().getImageId(), instance88.getImage().getImagePath());
			}
			color = instance88.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PatientStatus voLookup88 = new ims.core.vo.lookups.PatientStatus(instance88.getId(),instance88.getText(), instance88.isActive(), null, img, color);
			ims.core.vo.lookups.PatientStatus parentVoLookup88 = voLookup88;
			ims.domain.lookups.LookupInstance parent88 = instance88.getParent();
			while (parent88 != null)
			{
				if (parent88.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent88.getImage().getImageId(), parent88.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent88.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup88.setParent(new ims.core.vo.lookups.PatientStatus(parent88.getId(),parent88.getText(), parent88.isActive(), null, img, color));
				parentVoLookup88 = parentVoLookup88.getParent();
								parent88 = parent88.getParent();
			}			
			valueObject.setPatientCategory(voLookup88);
		}
				// PreAssessmentOutcome
		if (domainObject.getPreAssessmentOutcome() != null)
		{
			if(domainObject.getPreAssessmentOutcome() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPreAssessmentOutcome();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPreAssessmentOutcome(new ims.RefMan.vo.PreAssessmentOutcomeRefVo(id, -1));				
			}
			else
			{
				valueObject.setPreAssessmentOutcome(new ims.RefMan.vo.PreAssessmentOutcomeRefVo(domainObject.getPreAssessmentOutcome().getId(), domainObject.getPreAssessmentOutcome().getVersion()));
			}
		}
		// RecordingUser
		valueObject.setRecordingUser(ims.RefMan.vo.domain.RecordingUserInformationForWLCVoAssembler.create(map, domainObject.getRecordingUser()) );
		// PreColonoscopyAssessmentRequired
		ims.domain.lookups.LookupInstance instance91 = domainObject.getPreColonoscopyAssessmentRequired();
		if ( null != instance91 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance91.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance91.getImage().getImageId(), instance91.getImage().getImagePath());
			}
			color = instance91.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup91 = new ims.core.vo.lookups.YesNo(instance91.getId(),instance91.getText(), instance91.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup91 = voLookup91;
			ims.domain.lookups.LookupInstance parent91 = instance91.getParent();
			while (parent91 != null)
			{
				if (parent91.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent91.getImage().getImageId(), parent91.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent91.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup91.setParent(new ims.core.vo.lookups.YesNo(parent91.getId(),parent91.getText(), parent91.isActive(), null, img, color));
				parentVoLookup91 = parentVoLookup91.getParent();
								parent91 = parent91.getParent();
			}			
			valueObject.setPreColonoscopyAssessmentRequired(voLookup91);
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
	public static ims.RefMan.domain.objects.PatientElectiveList extractPatientElectiveList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListAddLaterVo valueObject) 
	{
		return 	extractPatientElectiveList(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.PatientElectiveList extractPatientElectiveList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListAddLaterVo valueObject, HashMap domMap) 
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
			// ims.RefMan.vo.PatientElectiveListAddLaterVo ID_PatientElectiveList field is unknown
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

		domainObject.setElectiveList(ims.RefMan.vo.domain.ElectiveListConfigurationWLVoAssembler.extractElectiveListConfiguration(domainFactory, valueObject.getElectiveList(), domMap));
		domainObject.setElectiveListStatus(ims.RefMan.vo.domain.ElectiveListStatusVoAssembler.extractElectiveListStatus(domainFactory, valueObject.getElectiveListStatus(), domMap));
		ims.core.patient.domain.objects.Patient value3 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value3 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getPatient();	
			}
			else
			{
				value3 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value3);
		ims.RefMan.domain.objects.CatsReferral value4 = null;
		if ( null != valueObject.getReferral() ) 
		{
			if (valueObject.getReferral().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferral()) != null)
				{
					value4 = (ims.RefMan.domain.objects.CatsReferral)domMap.get(valueObject.getReferral());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getReferral();	
			}
			else
			{
				value4 = (ims.RefMan.domain.objects.CatsReferral)domainFactory.getDomainObject(ims.RefMan.domain.objects.CatsReferral.class, valueObject.getReferral().getBoId());
			}
		}
		domainObject.setReferral(value4);
		java.util.Date value5 = null;
		ims.framework.utils.Date date5 = valueObject.getDateOnList();		
		if ( date5 != null ) 
		{
			value5 = date5.getDate();
		}
		domainObject.setDateOnList(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getElectiveListReason() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getElectiveListReason().getID());
		}
		domainObject.setElectiveListReason(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getElectiveAdmissionType() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getElectiveAdmissionType().getID());
		}
		domainObject.setElectiveAdmissionType(value7);
		domainObject.setAnticipatedStay(valueObject.getAnticipatedStay());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getPriority() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getPriority().getID());
		}
		domainObject.setPriority(value9);
		domainObject.setOperativeProcedureStatus(valueObject.getOperativeProcedureStatus());
		domainObject.setPrimaryProcedure(ims.core.vo.domain.ProcedureVoAssembler.extractProcedure(domainFactory, valueObject.getPrimaryProcedure(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getProcedureDescription() != null && valueObject.getProcedureDescription().equals(""))
		{
			valueObject.setProcedureDescription(null);
		}
		domainObject.setProcedureDescription(valueObject.getProcedureDescription());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getProcLaterality() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getProcLaterality().getID());
		}
		domainObject.setProcLaterality(value13);
		domainObject.setIsConsultantPerformingProcedure(valueObject.getIsConsultantPerformingProcedure());
		domainObject.setElectiveListStatusHistory(ims.RefMan.vo.domain.ElectiveListStatusVoAssembler.extractElectiveListStatusList(domainFactory, valueObject.getElectiveListStatusHistory(), domainObject.getElectiveListStatusHistory(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getAnaestheticType() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getAnaestheticType().getID());
		}
		domainObject.setAnaestheticType(value16);
		domainObject.setAnaesthesisRiskAssessmentRequest(valueObject.getAnaesthesisRiskAssessmentRequest());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOperateOnAnticoagulantComment() != null && valueObject.getOperateOnAnticoagulantComment().equals(""))
		{
			valueObject.setOperateOnAnticoagulantComment(null);
		}
		domainObject.setOperateOnAnticoagulantComment(valueObject.getOperateOnAnticoagulantComment());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value19 = null;
		if ( null != valueObject.getRequiredTheatreType() ) 
		{
			value19 =
				domainFactory.getLookupInstance(valueObject.getRequiredTheatreType().getID());
		}
		domainObject.setRequiredTheatreType(value19);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComments() != null && valueObject.getComments().equals(""))
		{
			valueObject.setComments(null);
		}
		domainObject.setComments(valueObject.getComments());
		ims.scheduling.domain.objects.Booking_Appointment value21 = null;
		if ( null != valueObject.getCreatingAppointment() ) 
		{
			if (valueObject.getCreatingAppointment().getBoId() == null)
			{
				if (domMap.get(valueObject.getCreatingAppointment()) != null)
				{
					value21 = (ims.scheduling.domain.objects.Booking_Appointment)domMap.get(valueObject.getCreatingAppointment());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value21 = domainObject.getCreatingAppointment();	
			}
			else
			{
				value21 = (ims.scheduling.domain.objects.Booking_Appointment)domainFactory.getDomainObject(ims.scheduling.domain.objects.Booking_Appointment.class, valueObject.getCreatingAppointment().getBoId());
			}
		}
		domainObject.setCreatingAppointment(value21);
		ims.scheduling.domain.objects.AppointmentOutcomeAction value22 = null;
		if ( null != valueObject.getAppointmentOutcomeAction() ) 
		{
			if (valueObject.getAppointmentOutcomeAction().getBoId() == null)
			{
				if (domMap.get(valueObject.getAppointmentOutcomeAction()) != null)
				{
					value22 = (ims.scheduling.domain.objects.AppointmentOutcomeAction)domMap.get(valueObject.getAppointmentOutcomeAction());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value22 = domainObject.getAppointmentOutcomeAction();	
			}
			else
			{
				value22 = (ims.scheduling.domain.objects.AppointmentOutcomeAction)domainFactory.getDomainObject(ims.scheduling.domain.objects.AppointmentOutcomeAction.class, valueObject.getAppointmentOutcomeAction().getBoId());
			}
		}
		domainObject.setAppointmentOutcomeAction(value22);
		domainObject.setTCIGiven(valueObject.getTCIGiven());
		domainObject.setTakesLongerThanStandardTime(valueObject.getTakesLongerThanStandardTime());
		domainObject.setAnticipatedProcedureLength(valueObject.getAnticipatedProcedureLength());
		domainObject.setAnaesthetistRequiredInTheatre(valueObject.getAnaesthetistRequiredInTheatre());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value27 = null;
		if ( null != valueObject.getCareGiven() ) 
		{
			value27 =
				domainFactory.getLookupInstance(valueObject.getCareGiven().getID());
		}
		domainObject.setCareGiven(value27);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value28 = null;
		if ( null != valueObject.getProcedureCarriedOutBy() ) 
		{
			if (valueObject.getProcedureCarriedOutBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getProcedureCarriedOutBy()) != null)
				{
					value28 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getProcedureCarriedOutBy());
				}
			}
			else
			{
				value28 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getProcedureCarriedOutBy().getBoId());
			}
		}
		domainObject.setProcedureCarriedOutBy(value28);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value29 = null;
		if ( null != valueObject.getProceduredToBeCarriedBy() ) 
		{
			value29 =
				domainFactory.getLookupInstance(valueObject.getProceduredToBeCarriedBy().getID());
		}
		domainObject.setProceduredToBeCarriedBy(value29);
		domainObject.setHospital(ims.core.vo.domain.LocationLiteVoAssembler.extractLocation(domainFactory, valueObject.getHospital(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value31 = null;
		if ( null != valueObject.getAdmissionType() ) 
		{
			value31 =
				domainFactory.getLookupInstance(valueObject.getAdmissionType().getID());
		}
		domainObject.setAdmissionType(value31);
		domainObject.setAdmittedIn(valueObject.getAdmittedIn());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value33 = null;
		if ( null != valueObject.getAdmittedInUnitOfTime() ) 
		{
			value33 =
				domainFactory.getLookupInstance(valueObject.getAdmittedInUnitOfTime().getID());
		}
		domainObject.setAdmittedInUnitOfTime(value33);
		domainObject.setWasPossibleDateGiven(valueObject.getWasPossibleDateGiven());
		java.util.Date value35 = null;
		ims.framework.utils.Date date35 = valueObject.getDateGivenToPatient();		
		if ( date35 != null ) 
		{
			value35 = date35.getDate();
		}
		domainObject.setDateGivenToPatient(value35);
		domainObject.setSecondaryProcedure(ims.core.vo.domain.ProcedureVoAssembler.extractProcedure(domainFactory, valueObject.getSecondaryProcedure(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value37 = null;
		if ( null != valueObject.getSecondaryProcLaterality() ) 
		{
			value37 =
				domainFactory.getLookupInstance(valueObject.getSecondaryProcLaterality().getID());
		}
		domainObject.setSecondaryProcLaterality(value37);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value38 = null;
		if ( null != valueObject.getWLAnaestheticType() ) 
		{
			value38 =
				domainFactory.getLookupInstance(valueObject.getWLAnaestheticType().getID());
		}
		domainObject.setWLAnaestheticType(value38);
		domainObject.setAvailableAtShortNotice(valueObject.getAvailableAtShortNotice());
		domainObject.setAvailableAtShortNoticePeriod(valueObject.getAvailableAtShortNoticePeriod());
		domainObject.setWLAvailableAtShortNotice(valueObject.getWLAvailableAtShortNotice());
		domainObject.setWLAvailableAtShortNoticePeriod(valueObject.getWLAvailableAtShortNoticePeriod());
		domainObject.setPreOperativeOvernightStayRequired(valueObject.getPreOperativeOvernightStayRequired());
		domainObject.setWLPreOperativeOvernightStayRequired(valueObject.getWLPreOperativeOvernightStayRequired());
		domainObject.setNoOfPreOperativeNights(valueObject.getNoOfPreOperativeNights());
		domainObject.setWLNoOfPreOperativeNights(valueObject.getWLNoOfPreOperativeNights());
		domainObject.setWLAnticipatedStay(valueObject.getWLAnticipatedStay());
		domainObject.setCriticalCareBedRequired(valueObject.getCriticalCareBedRequired());
		domainObject.setHDUBedRequired(valueObject.getHDUBedRequired());
		domainObject.setITUBedRequired(valueObject.getITUBedRequired());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value51 = null;
		if ( null != valueObject.getPatientReceivingAnticoagulantTherapy() ) 
		{
			value51 =
				domainFactory.getLookupInstance(valueObject.getPatientReceivingAnticoagulantTherapy().getID());
		}
		domainObject.setPatientReceivingAnticoagulantTherapy(value51);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value52 = null;
		if ( null != valueObject.getWLPatientReceivingAnticoagulantTherapy() ) 
		{
			value52 =
				domainFactory.getLookupInstance(valueObject.getWLPatientReceivingAnticoagulantTherapy().getID());
		}
		domainObject.setWLPatientReceivingAnticoagulantTherapy(value52);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value53 = null;
		if ( null != valueObject.getFollowPeriOperativeguidelines() ) 
		{
			value53 =
				domainFactory.getLookupInstance(valueObject.getFollowPeriOperativeguidelines().getID());
		}
		domainObject.setFollowPeriOperativeguidelines(value53);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPeriOpNoReasonComments() != null && valueObject.getPeriOpNoReasonComments().equals(""))
		{
			valueObject.setPeriOpNoReasonComments(null);
		}
		domainObject.setPeriOpNoReasonComments(valueObject.getPeriOpNoReasonComments());
		domainObject.setInterpretatorRequired(valueObject.getInterpretatorRequired());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value56 = null;
		if ( null != valueObject.getLanguage() ) 
		{
			value56 =
				domainFactory.getLookupInstance(valueObject.getLanguage().getID());
		}
		domainObject.setLanguage(value56);
		domainObject.setTransportRequired(valueObject.getTransportRequired());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value58 = null;
		if ( null != valueObject.getTransport() ) 
		{
			value58 =
				domainFactory.getLookupInstance(valueObject.getTransport().getID());
		}
		domainObject.setTransport(value58);
		domainObject.setSpecialRequirements(valueObject.getSpecialRequirements());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSpecialRequirementsDetails() != null && valueObject.getSpecialRequirementsDetails().equals(""))
		{
			valueObject.setSpecialRequirementsDetails(null);
		}
		domainObject.setSpecialRequirementsDetails(valueObject.getSpecialRequirementsDetails());
		domainObject.setSuspectedGIBleed(valueObject.getSuspectedGIBleed());
		domainObject.setPoints(valueObject.getPoints());
		domainObject.setSuitableforTraining(valueObject.getSuitableforTraining());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value64 = null;
		if ( null != valueObject.getGeneralAnaesthetic() ) 
		{
			value64 =
				domainFactory.getLookupInstance(valueObject.getGeneralAnaesthetic().getID());
		}
		domainObject.setGeneralAnaesthetic(value64);
		domainObject.setCanNurseCarryOutProcedure(valueObject.getCanNurseCarryOutProcedure());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDetailsForNonGAEndoProcedure() != null && valueObject.getDetailsForNonGAEndoProcedure().equals(""))
		{
			valueObject.setDetailsForNonGAEndoProcedure(null);
		}
		domainObject.setDetailsForNonGAEndoProcedure(valueObject.getDetailsForNonGAEndoProcedure());
		domainObject.setPreAssessmentRequired(valueObject.getPreAssessmentRequired());
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
		ims.domain.lookups.LookupInstance value71 = null;
		if ( null != valueObject.getRenalFunctionAssessment() ) 
		{
			value71 =
				domainFactory.getLookupInstance(valueObject.getRenalFunctionAssessment().getID());
		}
		domainObject.setRenalFunctionAssessment(value71);
		domainObject.setAreThereKeyTherapeutic(valueObject.getAreThereKeyTherapeutic());
		domainObject.setTCIDetails(ims.RefMan.vo.domain.TCIForPatientElectivetListWLVoAssembler.extractTCIForPatientElectiveList(domainFactory, valueObject.getTCIDetails(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value74 = null;
		if ( null != valueObject.getConsultant() ) 
		{
			if (valueObject.getConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getConsultant()) != null)
				{
					value74 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getConsultant());
				}
			}
			else
			{
				value74 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getConsultant().getBoId());
			}
		}
		domainObject.setConsultant(value74);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCognitiveComments() != null && valueObject.getCognitiveComments().equals(""))
		{
			valueObject.setCognitiveComments(null);
		}
		domainObject.setCognitiveComments(valueObject.getCognitiveComments());
		domainObject.setToBePlannedIn(valueObject.getToBePlannedIn());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value77 = null;
		if ( null != valueObject.getToBePlannedInUnit() ) 
		{
			value77 =
				domainFactory.getLookupInstance(valueObject.getToBePlannedInUnit().getID());
		}
		domainObject.setToBePlannedInUnit(value77);
		java.util.Date value78 = null;
		ims.framework.utils.Date date78 = valueObject.getPlannedDate();		
		if ( date78 != null ) 
		{
			value78 = date78.getDate();
		}
		domainObject.setPlannedDate(value78);
		domainObject.setIsSuitableForTelephoneAssessment(valueObject.getIsSuitableForTelephoneAssessment());
		domainObject.setMultiServiceCase(valueObject.getMultiServiceCase());
		domainObject.setRequiresVetting(valueObject.getRequiresVetting());
		domainObject.setWard(ims.core.vo.domain.LocationLiteVoAssembler.extractLocation(domainFactory, valueObject.getWard(), domMap));
		ims.framework.utils.DateTime dateTime84 = valueObject.getVettingDate();
		java.util.Date value84 = null;
		if ( dateTime84 != null ) 
		{
			value84 = dateTime84.getJavaDate();
		}
		domainObject.setVettingDate(value84);
		domainObject.setVettingHCP(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getVettingHCP(), domMap));
		domainObject.setAuthoringInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInfo(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value87 = null;
		if ( null != valueObject.getIntendedManagement() ) 
		{
			value87 =
				domainFactory.getLookupInstance(valueObject.getIntendedManagement().getID());
		}
		domainObject.setIntendedManagement(value87);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value88 = null;
		if ( null != valueObject.getPatientCategory() ) 
		{
			value88 =
				domainFactory.getLookupInstance(valueObject.getPatientCategory().getID());
		}
		domainObject.setPatientCategory(value88);
		ims.RefMan.domain.objects.PreAssessmentOutcome value89 = null;
		if ( null != valueObject.getPreAssessmentOutcome() ) 
		{
			if (valueObject.getPreAssessmentOutcome().getBoId() == null)
			{
				if (domMap.get(valueObject.getPreAssessmentOutcome()) != null)
				{
					value89 = (ims.RefMan.domain.objects.PreAssessmentOutcome)domMap.get(valueObject.getPreAssessmentOutcome());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value89 = domainObject.getPreAssessmentOutcome();	
			}
			else
			{
				value89 = (ims.RefMan.domain.objects.PreAssessmentOutcome)domainFactory.getDomainObject(ims.RefMan.domain.objects.PreAssessmentOutcome.class, valueObject.getPreAssessmentOutcome().getBoId());
			}
		}
		domainObject.setPreAssessmentOutcome(value89);
		domainObject.setRecordingUser(ims.RefMan.vo.domain.RecordingUserInformationForWLCVoAssembler.extractRecordingUserInformation(domainFactory, valueObject.getRecordingUser(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value91 = null;
		if ( null != valueObject.getPreColonoscopyAssessmentRequired() ) 
		{
			value91 =
				domainFactory.getLookupInstance(valueObject.getPreColonoscopyAssessmentRequired().getID());
		}
		domainObject.setPreColonoscopyAssessmentRequired(value91);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value92 = null;
		if ( null != valueObject.getResponsibleHCP() ) 
		{
			if (valueObject.getResponsibleHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getResponsibleHCP()) != null)
				{
					value92 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getResponsibleHCP());
				}
			}
			else
			{
				value92 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getResponsibleHCP().getBoId());
			}
		}
		domainObject.setResponsibleHCP(value92);

		return domainObject;
	}

}
