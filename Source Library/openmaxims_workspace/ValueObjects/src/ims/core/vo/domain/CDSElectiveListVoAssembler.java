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
 * Generated on 12/10/2015, 13:23
 *
 */
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Richard Reynolds
 */
public class CDSElectiveListVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.CDSElectiveListVo copy(ims.core.vo.CDSElectiveListVo valueObjectDest, ims.core.vo.CDSElectiveListVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CDSElectiveList(valueObjectSrc.getID_CDSElectiveList());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CDSApplicableDate
		valueObjectDest.setCDSApplicableDate(valueObjectSrc.getCDSApplicableDate());
		// CDSSenderOrgCode
		valueObjectDest.setCDSSenderOrgCode(valueObjectSrc.getCDSSenderOrgCode());
		// UBRN
		valueObjectDest.setUBRN(valueObjectSrc.getUBRN());
		// PathwayIdentifier
		valueObjectDest.setPathwayIdentifier(valueObjectSrc.getPathwayIdentifier());
		// PathwayOrgCode
		valueObjectDest.setPathwayOrgCode(valueObjectSrc.getPathwayOrgCode());
		// ReferralToTreatmentStatus
		valueObjectDest.setReferralToTreatmentStatus(valueObjectSrc.getReferralToTreatmentStatus());
		// WaitTimeMeasureType
		valueObjectDest.setWaitTimeMeasureType(valueObjectSrc.getWaitTimeMeasureType());
		// RTTStartDate
		valueObjectDest.setRTTStartDate(valueObjectSrc.getRTTStartDate());
		// RTTEndDate
		valueObjectDest.setRTTEndDate(valueObjectSrc.getRTTEndDate());
		// LocalPatientIdentifier
		valueObjectDest.setLocalPatientIdentifier(valueObjectSrc.getLocalPatientIdentifier());
		// CCGOrgCode
		valueObjectDest.setCCGOrgCode(valueObjectSrc.getCCGOrgCode());
		// WithHeldIdentityReason
		valueObjectDest.setWithHeldIdentityReason(valueObjectSrc.getWithHeldIdentityReason());
		// PatIdOrgCode
		valueObjectDest.setPatIdOrgCode(valueObjectSrc.getPatIdOrgCode());
		// NHSNumber
		valueObjectDest.setNHSNumber(valueObjectSrc.getNHSNumber());
		// NHSNumberStatusInd
		valueObjectDest.setNHSNumberStatusInd(valueObjectSrc.getNHSNumberStatusInd());
		// PatientName
		valueObjectDest.setPatientName(valueObjectSrc.getPatientName());
		// PatientAddress
		valueObjectDest.setPatientAddress(valueObjectSrc.getPatientAddress());
		// PostCode
		valueObjectDest.setPostCode(valueObjectSrc.getPostCode());
		// PCTOrgCode
		valueObjectDest.setPCTOrgCode(valueObjectSrc.getPCTOrgCode());
		// DateOfBirth
		valueObjectDest.setDateOfBirth(valueObjectSrc.getDateOfBirth());
		// PersonGender
		valueObjectDest.setPersonGender(valueObjectSrc.getPersonGender());
		// CarerSupportInd
		valueObjectDest.setCarerSupportInd(valueObjectSrc.getCarerSupportInd());
		// CommSerialNumber
		valueObjectDest.setCommSerialNumber(valueObjectSrc.getCommSerialNumber());
		// NHSServAgreeLineNum
		valueObjectDest.setNHSServAgreeLineNum(valueObjectSrc.getNHSServAgreeLineNum());
		// ProviderRefNum
		valueObjectDest.setProviderRefNum(valueObjectSrc.getProviderRefNum());
		// CommissionerReferenceNum
		valueObjectDest.setCommissionerReferenceNum(valueObjectSrc.getCommissionerReferenceNum());
		// OrgCodeProvider
		valueObjectDest.setOrgCodeProvider(valueObjectSrc.getOrgCodeProvider());
		// OrgCodeCommissioner
		valueObjectDest.setOrgCodeCommissioner(valueObjectSrc.getOrgCodeCommissioner());
		// NHSServAgreeChangeDate
		valueObjectDest.setNHSServAgreeChangeDate(valueObjectSrc.getNHSServAgreeChangeDate());
		// ElectiveListID
		valueObjectDest.setElectiveListID(valueObjectSrc.getElectiveListID());
		// AdminCategory
		valueObjectDest.setAdminCategory(valueObjectSrc.getAdminCategory());
		// CountSuspendedDays
		valueObjectDest.setCountSuspendedDays(valueObjectSrc.getCountSuspendedDays());
		// ELEStatus
		valueObjectDest.setELEStatus(valueObjectSrc.getELEStatus());
		// ELEType
		valueObjectDest.setELEType(valueObjectSrc.getELEType());
		// IntendedManagement
		valueObjectDest.setIntendedManagement(valueObjectSrc.getIntendedManagement());
		// IntendedProcedure
		valueObjectDest.setIntendedProcedure(valueObjectSrc.getIntendedProcedure());
		// PriorityTypeCode
		valueObjectDest.setPriorityTypeCode(valueObjectSrc.getPriorityTypeCode());
		// PatientClassification
		valueObjectDest.setPatientClassification(valueObjectSrc.getPatientClassification());
		// DecidedToAdmitDate
		valueObjectDest.setDecidedToAdmitDate(valueObjectSrc.getDecidedToAdmitDate());
		// AgeAtCDSActivity
		valueObjectDest.setAgeAtCDSActivity(valueObjectSrc.getAgeAtCDSActivity());
		// AdmissionMethod
		valueObjectDest.setAdmissionMethod(valueObjectSrc.getAdmissionMethod());
		// OverseasVisitorStatus
		valueObjectDest.setOverseasVisitorStatus(valueObjectSrc.getOverseasVisitorStatus());
		// GuarenteedAdmissionDate
		valueObjectDest.setGuarenteedAdmissionDate(valueObjectSrc.getGuarenteedAdmissionDate());
		// LastDNACancelledDate
		valueObjectDest.setLastDNACancelledDate(valueObjectSrc.getLastDNACancelledDate());
		// LastReviewedDate
		valueObjectDest.setLastReviewedDate(valueObjectSrc.getLastReviewedDate());
		// ConsultantCode
		valueObjectDest.setConsultantCode(valueObjectSrc.getConsultantCode());
		// SpecialtyCode
		valueObjectDest.setSpecialtyCode(valueObjectSrc.getSpecialtyCode());
		// TreatmentFuncCode
		valueObjectDest.setTreatmentFuncCode(valueObjectSrc.getTreatmentFuncCode());
		// LocalSubSpecialtyCode
		valueObjectDest.setLocalSubSpecialtyCode(valueObjectSrc.getLocalSubSpecialtyCode());
		// ProcedureScheme
		valueObjectDest.setProcedureScheme(valueObjectSrc.getProcedureScheme());
		// Procedure
		valueObjectDest.setProcedure(valueObjectSrc.getProcedure());
		// ProcedureDate
		valueObjectDest.setProcedureDate(valueObjectSrc.getProcedureDate());
		// ProfRegistrationCode
		valueObjectDest.setProfRegistrationCode(valueObjectSrc.getProfRegistrationCode());
		// ProfRegistrationID
		valueObjectDest.setProfRegistrationID(valueObjectSrc.getProfRegistrationID());
		// PatientGPCode
		valueObjectDest.setPatientGPCode(valueObjectSrc.getPatientGPCode());
		// PatientGPPractice
		valueObjectDest.setPatientGPPractice(valueObjectSrc.getPatientGPPractice());
		// ReferrerCode
		valueObjectDest.setReferrerCode(valueObjectSrc.getReferrerCode());
		// ReferrerPractice
		valueObjectDest.setReferrerPractice(valueObjectSrc.getReferrerPractice());
		// OutcomeCode
		valueObjectDest.setOutcomeCode(valueObjectSrc.getOutcomeCode());
		// DateTCIOffered
		valueObjectDest.setDateTCIOffered(valueObjectSrc.getDateTCIOffered());
		// ERODate
		valueObjectDest.setERODate(valueObjectSrc.getERODate());
		// OrigDecisionToAdmitDate
		valueObjectDest.setOrigDecisionToAdmitDate(valueObjectSrc.getOrigDecisionToAdmitDate());
		// StartDate
		valueObjectDest.setStartDate(valueObjectSrc.getStartDate());
		// RemovalReason
		valueObjectDest.setRemovalReason(valueObjectSrc.getRemovalReason());
		// RemovalDate
		valueObjectDest.setRemovalDate(valueObjectSrc.getRemovalDate());
		// EpisodeStartDate
		valueObjectDest.setEpisodeStartDate(valueObjectSrc.getEpisodeStartDate());
		// OPCSProcedureGroup
		valueObjectDest.setOPCSProcedureGroup(valueObjectSrc.getOPCSProcedureGroup());
		// READProcedureGroup
		valueObjectDest.setREADProcedureGroup(valueObjectSrc.getREADProcedureGroup());
		// LocationGroup
		valueObjectDest.setLocationGroup(valueObjectSrc.getLocationGroup());
		// CareContextId
		valueObjectDest.setCareContextId(valueObjectSrc.getCareContextId());
		// HRGCode
		valueObjectDest.setHRGCode(valueObjectSrc.getHRGCode());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCDSElectiveListVoCollectionFromCDSElectiveList(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.cds.domain.objects.CDSElectiveList objects.
	 */
	public static ims.core.vo.CDSElectiveListVoCollection createCDSElectiveListVoCollectionFromCDSElectiveList(java.util.Set domainObjectSet)	
	{
		return createCDSElectiveListVoCollectionFromCDSElectiveList(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.cds.domain.objects.CDSElectiveList objects.
	 */
	public static ims.core.vo.CDSElectiveListVoCollection createCDSElectiveListVoCollectionFromCDSElectiveList(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.CDSElectiveListVoCollection voList = new ims.core.vo.CDSElectiveListVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.cds.domain.objects.CDSElectiveList domainObject = (ims.core.cds.domain.objects.CDSElectiveList) iterator.next();
			ims.core.vo.CDSElectiveListVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.cds.domain.objects.CDSElectiveList objects.
	 */
	public static ims.core.vo.CDSElectiveListVoCollection createCDSElectiveListVoCollectionFromCDSElectiveList(java.util.List domainObjectList) 
	{
		return createCDSElectiveListVoCollectionFromCDSElectiveList(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.cds.domain.objects.CDSElectiveList objects.
	 */
	public static ims.core.vo.CDSElectiveListVoCollection createCDSElectiveListVoCollectionFromCDSElectiveList(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.CDSElectiveListVoCollection voList = new ims.core.vo.CDSElectiveListVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.cds.domain.objects.CDSElectiveList domainObject = (ims.core.cds.domain.objects.CDSElectiveList) domainObjectList.get(i);
			ims.core.vo.CDSElectiveListVo vo = create(map, domainObject);

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
	 * Create the ims.core.cds.domain.objects.CDSElectiveList set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractCDSElectiveListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CDSElectiveListVoCollection voCollection) 
	 {
	 	return extractCDSElectiveListSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCDSElectiveListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CDSElectiveListVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.CDSElectiveListVo vo = voCollection.get(i);
			ims.core.cds.domain.objects.CDSElectiveList domainObject = CDSElectiveListVoAssembler.extractCDSElectiveList(domainFactory, vo, domMap);

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
	 * Create the ims.core.cds.domain.objects.CDSElectiveList list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractCDSElectiveListList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CDSElectiveListVoCollection voCollection) 
	 {
	 	return extractCDSElectiveListList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCDSElectiveListList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CDSElectiveListVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.CDSElectiveListVo vo = voCollection.get(i);
			ims.core.cds.domain.objects.CDSElectiveList domainObject = CDSElectiveListVoAssembler.extractCDSElectiveList(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.cds.domain.objects.CDSElectiveList object.
	 * @param domainObject ims.core.cds.domain.objects.CDSElectiveList
	 */
	 public static ims.core.vo.CDSElectiveListVo create(ims.core.cds.domain.objects.CDSElectiveList domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.cds.domain.objects.CDSElectiveList object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.CDSElectiveListVo create(DomainObjectMap map, ims.core.cds.domain.objects.CDSElectiveList domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.CDSElectiveListVo valueObject = (ims.core.vo.CDSElectiveListVo) map.getValueObject(domainObject, ims.core.vo.CDSElectiveListVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.CDSElectiveListVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.cds.domain.objects.CDSElectiveList
	 */
	 public static ims.core.vo.CDSElectiveListVo insert(ims.core.vo.CDSElectiveListVo valueObject, ims.core.cds.domain.objects.CDSElectiveList domainObject) 
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
	 * @param domainObject ims.core.cds.domain.objects.CDSElectiveList
	 */
	 public static ims.core.vo.CDSElectiveListVo insert(DomainObjectMap map, ims.core.vo.CDSElectiveListVo valueObject, ims.core.cds.domain.objects.CDSElectiveList domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_CDSElectiveList(domainObject.getId());
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
			
		// CDSApplicableDate
		java.util.Date CDSApplicableDate = domainObject.getCDSApplicableDate();
		if ( null != CDSApplicableDate ) 
		{
			valueObject.setCDSApplicableDate(new ims.framework.utils.DateTime(CDSApplicableDate) );
		}
		// CDSSenderOrgCode
		valueObject.setCDSSenderOrgCode(domainObject.getCDSSenderOrgCode());
		// UBRN
		valueObject.setUBRN(domainObject.getUBRN());
		// PathwayIdentifier
		valueObject.setPathwayIdentifier(domainObject.getPathwayIdentifier());
		// PathwayOrgCode
		valueObject.setPathwayOrgCode(domainObject.getPathwayOrgCode());
		// ReferralToTreatmentStatus
		valueObject.setReferralToTreatmentStatus(domainObject.getReferralToTreatmentStatus());
		// WaitTimeMeasureType
		valueObject.setWaitTimeMeasureType(domainObject.getWaitTimeMeasureType());
		// RTTStartDate
		java.util.Date RTTStartDate = domainObject.getRTTStartDate();
		if ( null != RTTStartDate ) 
		{
			valueObject.setRTTStartDate(new ims.framework.utils.Date(RTTStartDate) );
		}
		// RTTEndDate
		java.util.Date RTTEndDate = domainObject.getRTTEndDate();
		if ( null != RTTEndDate ) 
		{
			valueObject.setRTTEndDate(new ims.framework.utils.Date(RTTEndDate) );
		}
		// LocalPatientIdentifier
		valueObject.setLocalPatientIdentifier(domainObject.getLocalPatientIdentifier());
		// CCGOrgCode
		valueObject.setCCGOrgCode(domainObject.getCCGOrgCode());
		// WithHeldIdentityReason
		valueObject.setWithHeldIdentityReason(domainObject.getWithHeldIdentityReason());
		// PatIdOrgCode
		valueObject.setPatIdOrgCode(domainObject.getPatIdOrgCode());
		// NHSNumber
		valueObject.setNHSNumber(domainObject.getNHSNumber());
		// NHSNumberStatusInd
		valueObject.setNHSNumberStatusInd(domainObject.getNHSNumberStatusInd());
		// PatientName
		valueObject.setPatientName(domainObject.getPatientName());
		// PatientAddress
		valueObject.setPatientAddress(domainObject.getPatientAddress());
		// PostCode
		valueObject.setPostCode(domainObject.getPostCode());
		// PCTOrgCode
		valueObject.setPCTOrgCode(domainObject.getPCTOrgCode());
		// DateOfBirth
		java.util.Date DateOfBirth = domainObject.getDateOfBirth();
		if ( null != DateOfBirth ) 
		{
			valueObject.setDateOfBirth(new ims.framework.utils.Date(DateOfBirth) );
		}
		// PersonGender
		valueObject.setPersonGender(domainObject.getPersonGender());
		// CarerSupportInd
		valueObject.setCarerSupportInd(domainObject.getCarerSupportInd());
		// CommSerialNumber
		valueObject.setCommSerialNumber(domainObject.getCommSerialNumber());
		// NHSServAgreeLineNum
		valueObject.setNHSServAgreeLineNum(domainObject.getNHSServAgreeLineNum());
		// ProviderRefNum
		valueObject.setProviderRefNum(domainObject.getProviderRefNum());
		// CommissionerReferenceNum
		valueObject.setCommissionerReferenceNum(domainObject.getCommissionerReferenceNum());
		// OrgCodeProvider
		valueObject.setOrgCodeProvider(domainObject.getOrgCodeProvider());
		// OrgCodeCommissioner
		valueObject.setOrgCodeCommissioner(domainObject.getOrgCodeCommissioner());
		// NHSServAgreeChangeDate
		java.util.Date NHSServAgreeChangeDate = domainObject.getNHSServAgreeChangeDate();
		if ( null != NHSServAgreeChangeDate ) 
		{
			valueObject.setNHSServAgreeChangeDate(new ims.framework.utils.Date(NHSServAgreeChangeDate) );
		}
		// ElectiveListID
		valueObject.setElectiveListID(domainObject.getElectiveListID());
		// AdminCategory
		valueObject.setAdminCategory(domainObject.getAdminCategory());
		// CountSuspendedDays
		valueObject.setCountSuspendedDays(domainObject.getCountSuspendedDays());
		// ELEStatus
		valueObject.setELEStatus(domainObject.getELEStatus());
		// ELEType
		valueObject.setELEType(domainObject.getELEType());
		// IntendedManagement
		valueObject.setIntendedManagement(domainObject.getIntendedManagement());
		// IntendedProcedure
		valueObject.setIntendedProcedure(domainObject.getIntendedProcedure());
		// PriorityTypeCode
		valueObject.setPriorityTypeCode(domainObject.getPriorityTypeCode());
		// PatientClassification
		valueObject.setPatientClassification(domainObject.getPatientClassification());
		// DecidedToAdmitDate
		java.util.Date DecidedToAdmitDate = domainObject.getDecidedToAdmitDate();
		if ( null != DecidedToAdmitDate ) 
		{
			valueObject.setDecidedToAdmitDate(new ims.framework.utils.Date(DecidedToAdmitDate) );
		}
		// AgeAtCDSActivity
		valueObject.setAgeAtCDSActivity(domainObject.getAgeAtCDSActivity());
		// AdmissionMethod
		valueObject.setAdmissionMethod(domainObject.getAdmissionMethod());
		// OverseasVisitorStatus
		valueObject.setOverseasVisitorStatus(domainObject.getOverseasVisitorStatus());
		// GuarenteedAdmissionDate
		java.util.Date GuarenteedAdmissionDate = domainObject.getGuarenteedAdmissionDate();
		if ( null != GuarenteedAdmissionDate ) 
		{
			valueObject.setGuarenteedAdmissionDate(new ims.framework.utils.Date(GuarenteedAdmissionDate) );
		}
		// LastDNACancelledDate
		java.util.Date LastDNACancelledDate = domainObject.getLastDNACancelledDate();
		if ( null != LastDNACancelledDate ) 
		{
			valueObject.setLastDNACancelledDate(new ims.framework.utils.Date(LastDNACancelledDate) );
		}
		// LastReviewedDate
		java.util.Date LastReviewedDate = domainObject.getLastReviewedDate();
		if ( null != LastReviewedDate ) 
		{
			valueObject.setLastReviewedDate(new ims.framework.utils.Date(LastReviewedDate) );
		}
		// ConsultantCode
		valueObject.setConsultantCode(domainObject.getConsultantCode());
		// SpecialtyCode
		valueObject.setSpecialtyCode(domainObject.getSpecialtyCode());
		// TreatmentFuncCode
		valueObject.setTreatmentFuncCode(domainObject.getTreatmentFuncCode());
		// LocalSubSpecialtyCode
		valueObject.setLocalSubSpecialtyCode(domainObject.getLocalSubSpecialtyCode());
		// ProcedureScheme
		valueObject.setProcedureScheme(domainObject.getProcedureScheme());
		// Procedure
		valueObject.setProcedure(domainObject.getProcedure());
		// ProcedureDate
		java.util.Date ProcedureDate = domainObject.getProcedureDate();
		if ( null != ProcedureDate ) 
		{
			valueObject.setProcedureDate(new ims.framework.utils.Date(ProcedureDate) );
		}
		// ProfRegistrationCode
		valueObject.setProfRegistrationCode(domainObject.getProfRegistrationCode());
		// ProfRegistrationID
		valueObject.setProfRegistrationID(domainObject.getProfRegistrationID());
		// PatientGPCode
		valueObject.setPatientGPCode(domainObject.getPatientGPCode());
		// PatientGPPractice
		valueObject.setPatientGPPractice(domainObject.getPatientGPPractice());
		// ReferrerCode
		valueObject.setReferrerCode(domainObject.getReferrerCode());
		// ReferrerPractice
		valueObject.setReferrerPractice(domainObject.getReferrerPractice());
		// OutcomeCode
		valueObject.setOutcomeCode(domainObject.getOutcomeCode());
		// DateTCIOffered
		java.util.Date DateTCIOffered = domainObject.getDateTCIOffered();
		if ( null != DateTCIOffered ) 
		{
			valueObject.setDateTCIOffered(new ims.framework.utils.Date(DateTCIOffered) );
		}
		// ERODate
		java.util.Date ERODate = domainObject.getERODate();
		if ( null != ERODate ) 
		{
			valueObject.setERODate(new ims.framework.utils.Date(ERODate) );
		}
		// OrigDecisionToAdmitDate
		java.util.Date OrigDecisionToAdmitDate = domainObject.getOrigDecisionToAdmitDate();
		if ( null != OrigDecisionToAdmitDate ) 
		{
			valueObject.setOrigDecisionToAdmitDate(new ims.framework.utils.Date(OrigDecisionToAdmitDate) );
		}
		// StartDate
		java.util.Date StartDate = domainObject.getStartDate();
		if ( null != StartDate ) 
		{
			valueObject.setStartDate(new ims.framework.utils.Date(StartDate) );
		}
		// RemovalReason
		valueObject.setRemovalReason(domainObject.getRemovalReason());
		// RemovalDate
		java.util.Date RemovalDate = domainObject.getRemovalDate();
		if ( null != RemovalDate ) 
		{
			valueObject.setRemovalDate(new ims.framework.utils.Date(RemovalDate) );
		}
		// EpisodeStartDate
		java.util.Date EpisodeStartDate = domainObject.getEpisodeStartDate();
		if ( null != EpisodeStartDate ) 
		{
			valueObject.setEpisodeStartDate(new ims.framework.utils.Date(EpisodeStartDate) );
		}
		// OPCSProcedureGroup
		ims.core.cds.vo.CDSProcedureDetailsRefVoCollection OPCSProcedureGroup = new ims.core.cds.vo.CDSProcedureDetailsRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getOPCSProcedureGroup().iterator(); iterator.hasNext(); ) 
		{
			ims.core.cds.domain.objects.CDSProcedureDetails tmp = (ims.core.cds.domain.objects.CDSProcedureDetails)iterator.next();
			if (tmp != null)
				OPCSProcedureGroup.add(new ims.core.cds.vo.CDSProcedureDetailsRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setOPCSProcedureGroup(OPCSProcedureGroup);
		// READProcedureGroup
		if (domainObject.getREADProcedureGroup() != null)
		{
			if(domainObject.getREADProcedureGroup() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getREADProcedureGroup();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setREADProcedureGroup(new ims.core.cds.vo.CDSProcedureDetailsRefVo(id, -1));				
			}
			else
			{
				valueObject.setREADProcedureGroup(new ims.core.cds.vo.CDSProcedureDetailsRefVo(domainObject.getREADProcedureGroup().getId(), domainObject.getREADProcedureGroup().getVersion()));
			}
		}
		// LocationGroup
		if (domainObject.getLocationGroup() != null)
		{
			if(domainObject.getLocationGroup() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getLocationGroup();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setLocationGroup(new ims.core.cds.vo.CDSWaitingListLocGroupRefVo(id, -1));				
			}
			else
			{
				valueObject.setLocationGroup(new ims.core.cds.vo.CDSWaitingListLocGroupRefVo(domainObject.getLocationGroup().getId(), domainObject.getLocationGroup().getVersion()));
			}
		}
		// CareContextId
		valueObject.setCareContextId(domainObject.getCareContextId());
		// HRGCode
		valueObject.setHRGCode(domainObject.getHRGCode());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.cds.domain.objects.CDSElectiveList extractCDSElectiveList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CDSElectiveListVo valueObject) 
	{
		return 	extractCDSElectiveList(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.cds.domain.objects.CDSElectiveList extractCDSElectiveList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CDSElectiveListVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_CDSElectiveList();
		ims.core.cds.domain.objects.CDSElectiveList domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.cds.domain.objects.CDSElectiveList)domMap.get(valueObject);
			}
			// ims.core.vo.CDSElectiveListVo ID_CDSElectiveList field is unknown
			domainObject = new ims.core.cds.domain.objects.CDSElectiveList();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_CDSElectiveList());
			if (domMap.get(key) != null)
			{
				return (ims.core.cds.domain.objects.CDSElectiveList)domMap.get(key);
			}
			domainObject = (ims.core.cds.domain.objects.CDSElectiveList) domainFactory.getDomainObject(ims.core.cds.domain.objects.CDSElectiveList.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_CDSElectiveList());

		ims.framework.utils.DateTime dateTime1 = valueObject.getCDSApplicableDate();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setCDSApplicableDate(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCDSSenderOrgCode() != null && valueObject.getCDSSenderOrgCode().equals(""))
		{
			valueObject.setCDSSenderOrgCode(null);
		}
		domainObject.setCDSSenderOrgCode(valueObject.getCDSSenderOrgCode());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getUBRN() != null && valueObject.getUBRN().equals(""))
		{
			valueObject.setUBRN(null);
		}
		domainObject.setUBRN(valueObject.getUBRN());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPathwayIdentifier() != null && valueObject.getPathwayIdentifier().equals(""))
		{
			valueObject.setPathwayIdentifier(null);
		}
		domainObject.setPathwayIdentifier(valueObject.getPathwayIdentifier());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPathwayOrgCode() != null && valueObject.getPathwayOrgCode().equals(""))
		{
			valueObject.setPathwayOrgCode(null);
		}
		domainObject.setPathwayOrgCode(valueObject.getPathwayOrgCode());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReferralToTreatmentStatus() != null && valueObject.getReferralToTreatmentStatus().equals(""))
		{
			valueObject.setReferralToTreatmentStatus(null);
		}
		domainObject.setReferralToTreatmentStatus(valueObject.getReferralToTreatmentStatus());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getWaitTimeMeasureType() != null && valueObject.getWaitTimeMeasureType().equals(""))
		{
			valueObject.setWaitTimeMeasureType(null);
		}
		domainObject.setWaitTimeMeasureType(valueObject.getWaitTimeMeasureType());
		java.util.Date value8 = null;
		ims.framework.utils.Date date8 = valueObject.getRTTStartDate();		
		if ( date8 != null ) 
		{
			value8 = date8.getDate();
		}
		domainObject.setRTTStartDate(value8);
		java.util.Date value9 = null;
		ims.framework.utils.Date date9 = valueObject.getRTTEndDate();		
		if ( date9 != null ) 
		{
			value9 = date9.getDate();
		}
		domainObject.setRTTEndDate(value9);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLocalPatientIdentifier() != null && valueObject.getLocalPatientIdentifier().equals(""))
		{
			valueObject.setLocalPatientIdentifier(null);
		}
		domainObject.setLocalPatientIdentifier(valueObject.getLocalPatientIdentifier());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCCGOrgCode() != null && valueObject.getCCGOrgCode().equals(""))
		{
			valueObject.setCCGOrgCode(null);
		}
		domainObject.setCCGOrgCode(valueObject.getCCGOrgCode());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getWithHeldIdentityReason() != null && valueObject.getWithHeldIdentityReason().equals(""))
		{
			valueObject.setWithHeldIdentityReason(null);
		}
		domainObject.setWithHeldIdentityReason(valueObject.getWithHeldIdentityReason());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPatIdOrgCode() != null && valueObject.getPatIdOrgCode().equals(""))
		{
			valueObject.setPatIdOrgCode(null);
		}
		domainObject.setPatIdOrgCode(valueObject.getPatIdOrgCode());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNHSNumber() != null && valueObject.getNHSNumber().equals(""))
		{
			valueObject.setNHSNumber(null);
		}
		domainObject.setNHSNumber(valueObject.getNHSNumber());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNHSNumberStatusInd() != null && valueObject.getNHSNumberStatusInd().equals(""))
		{
			valueObject.setNHSNumberStatusInd(null);
		}
		domainObject.setNHSNumberStatusInd(valueObject.getNHSNumberStatusInd());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPatientName() != null && valueObject.getPatientName().equals(""))
		{
			valueObject.setPatientName(null);
		}
		domainObject.setPatientName(valueObject.getPatientName());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPatientAddress() != null && valueObject.getPatientAddress().equals(""))
		{
			valueObject.setPatientAddress(null);
		}
		domainObject.setPatientAddress(valueObject.getPatientAddress());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPostCode() != null && valueObject.getPostCode().equals(""))
		{
			valueObject.setPostCode(null);
		}
		domainObject.setPostCode(valueObject.getPostCode());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPCTOrgCode() != null && valueObject.getPCTOrgCode().equals(""))
		{
			valueObject.setPCTOrgCode(null);
		}
		domainObject.setPCTOrgCode(valueObject.getPCTOrgCode());
		java.util.Date value20 = null;
		ims.framework.utils.Date date20 = valueObject.getDateOfBirth();		
		if ( date20 != null ) 
		{
			value20 = date20.getDate();
		}
		domainObject.setDateOfBirth(value20);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPersonGender() != null && valueObject.getPersonGender().equals(""))
		{
			valueObject.setPersonGender(null);
		}
		domainObject.setPersonGender(valueObject.getPersonGender());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCarerSupportInd() != null && valueObject.getCarerSupportInd().equals(""))
		{
			valueObject.setCarerSupportInd(null);
		}
		domainObject.setCarerSupportInd(valueObject.getCarerSupportInd());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCommSerialNumber() != null && valueObject.getCommSerialNumber().equals(""))
		{
			valueObject.setCommSerialNumber(null);
		}
		domainObject.setCommSerialNumber(valueObject.getCommSerialNumber());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNHSServAgreeLineNum() != null && valueObject.getNHSServAgreeLineNum().equals(""))
		{
			valueObject.setNHSServAgreeLineNum(null);
		}
		domainObject.setNHSServAgreeLineNum(valueObject.getNHSServAgreeLineNum());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getProviderRefNum() != null && valueObject.getProviderRefNum().equals(""))
		{
			valueObject.setProviderRefNum(null);
		}
		domainObject.setProviderRefNum(valueObject.getProviderRefNum());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCommissionerReferenceNum() != null && valueObject.getCommissionerReferenceNum().equals(""))
		{
			valueObject.setCommissionerReferenceNum(null);
		}
		domainObject.setCommissionerReferenceNum(valueObject.getCommissionerReferenceNum());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOrgCodeProvider() != null && valueObject.getOrgCodeProvider().equals(""))
		{
			valueObject.setOrgCodeProvider(null);
		}
		domainObject.setOrgCodeProvider(valueObject.getOrgCodeProvider());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOrgCodeCommissioner() != null && valueObject.getOrgCodeCommissioner().equals(""))
		{
			valueObject.setOrgCodeCommissioner(null);
		}
		domainObject.setOrgCodeCommissioner(valueObject.getOrgCodeCommissioner());
		java.util.Date value29 = null;
		ims.framework.utils.Date date29 = valueObject.getNHSServAgreeChangeDate();		
		if ( date29 != null ) 
		{
			value29 = date29.getDate();
		}
		domainObject.setNHSServAgreeChangeDate(value29);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getElectiveListID() != null && valueObject.getElectiveListID().equals(""))
		{
			valueObject.setElectiveListID(null);
		}
		domainObject.setElectiveListID(valueObject.getElectiveListID());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAdminCategory() != null && valueObject.getAdminCategory().equals(""))
		{
			valueObject.setAdminCategory(null);
		}
		domainObject.setAdminCategory(valueObject.getAdminCategory());
		domainObject.setCountSuspendedDays(valueObject.getCountSuspendedDays());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getELEStatus() != null && valueObject.getELEStatus().equals(""))
		{
			valueObject.setELEStatus(null);
		}
		domainObject.setELEStatus(valueObject.getELEStatus());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getELEType() != null && valueObject.getELEType().equals(""))
		{
			valueObject.setELEType(null);
		}
		domainObject.setELEType(valueObject.getELEType());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getIntendedManagement() != null && valueObject.getIntendedManagement().equals(""))
		{
			valueObject.setIntendedManagement(null);
		}
		domainObject.setIntendedManagement(valueObject.getIntendedManagement());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getIntendedProcedure() != null && valueObject.getIntendedProcedure().equals(""))
		{
			valueObject.setIntendedProcedure(null);
		}
		domainObject.setIntendedProcedure(valueObject.getIntendedProcedure());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPriorityTypeCode() != null && valueObject.getPriorityTypeCode().equals(""))
		{
			valueObject.setPriorityTypeCode(null);
		}
		domainObject.setPriorityTypeCode(valueObject.getPriorityTypeCode());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPatientClassification() != null && valueObject.getPatientClassification().equals(""))
		{
			valueObject.setPatientClassification(null);
		}
		domainObject.setPatientClassification(valueObject.getPatientClassification());
		java.util.Date value39 = null;
		ims.framework.utils.Date date39 = valueObject.getDecidedToAdmitDate();		
		if ( date39 != null ) 
		{
			value39 = date39.getDate();
		}
		domainObject.setDecidedToAdmitDate(value39);
		domainObject.setAgeAtCDSActivity(valueObject.getAgeAtCDSActivity());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAdmissionMethod() != null && valueObject.getAdmissionMethod().equals(""))
		{
			valueObject.setAdmissionMethod(null);
		}
		domainObject.setAdmissionMethod(valueObject.getAdmissionMethod());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOverseasVisitorStatus() != null && valueObject.getOverseasVisitorStatus().equals(""))
		{
			valueObject.setOverseasVisitorStatus(null);
		}
		domainObject.setOverseasVisitorStatus(valueObject.getOverseasVisitorStatus());
		java.util.Date value43 = null;
		ims.framework.utils.Date date43 = valueObject.getGuarenteedAdmissionDate();		
		if ( date43 != null ) 
		{
			value43 = date43.getDate();
		}
		domainObject.setGuarenteedAdmissionDate(value43);
		java.util.Date value44 = null;
		ims.framework.utils.Date date44 = valueObject.getLastDNACancelledDate();		
		if ( date44 != null ) 
		{
			value44 = date44.getDate();
		}
		domainObject.setLastDNACancelledDate(value44);
		java.util.Date value45 = null;
		ims.framework.utils.Date date45 = valueObject.getLastReviewedDate();		
		if ( date45 != null ) 
		{
			value45 = date45.getDate();
		}
		domainObject.setLastReviewedDate(value45);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getConsultantCode() != null && valueObject.getConsultantCode().equals(""))
		{
			valueObject.setConsultantCode(null);
		}
		domainObject.setConsultantCode(valueObject.getConsultantCode());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSpecialtyCode() != null && valueObject.getSpecialtyCode().equals(""))
		{
			valueObject.setSpecialtyCode(null);
		}
		domainObject.setSpecialtyCode(valueObject.getSpecialtyCode());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTreatmentFuncCode() != null && valueObject.getTreatmentFuncCode().equals(""))
		{
			valueObject.setTreatmentFuncCode(null);
		}
		domainObject.setTreatmentFuncCode(valueObject.getTreatmentFuncCode());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLocalSubSpecialtyCode() != null && valueObject.getLocalSubSpecialtyCode().equals(""))
		{
			valueObject.setLocalSubSpecialtyCode(null);
		}
		domainObject.setLocalSubSpecialtyCode(valueObject.getLocalSubSpecialtyCode());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getProcedureScheme() != null && valueObject.getProcedureScheme().equals(""))
		{
			valueObject.setProcedureScheme(null);
		}
		domainObject.setProcedureScheme(valueObject.getProcedureScheme());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getProcedure() != null && valueObject.getProcedure().equals(""))
		{
			valueObject.setProcedure(null);
		}
		domainObject.setProcedure(valueObject.getProcedure());
		java.util.Date value52 = null;
		ims.framework.utils.Date date52 = valueObject.getProcedureDate();		
		if ( date52 != null ) 
		{
			value52 = date52.getDate();
		}
		domainObject.setProcedureDate(value52);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getProfRegistrationCode() != null && valueObject.getProfRegistrationCode().equals(""))
		{
			valueObject.setProfRegistrationCode(null);
		}
		domainObject.setProfRegistrationCode(valueObject.getProfRegistrationCode());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getProfRegistrationID() != null && valueObject.getProfRegistrationID().equals(""))
		{
			valueObject.setProfRegistrationID(null);
		}
		domainObject.setProfRegistrationID(valueObject.getProfRegistrationID());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPatientGPCode() != null && valueObject.getPatientGPCode().equals(""))
		{
			valueObject.setPatientGPCode(null);
		}
		domainObject.setPatientGPCode(valueObject.getPatientGPCode());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPatientGPPractice() != null && valueObject.getPatientGPPractice().equals(""))
		{
			valueObject.setPatientGPPractice(null);
		}
		domainObject.setPatientGPPractice(valueObject.getPatientGPPractice());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReferrerCode() != null && valueObject.getReferrerCode().equals(""))
		{
			valueObject.setReferrerCode(null);
		}
		domainObject.setReferrerCode(valueObject.getReferrerCode());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReferrerPractice() != null && valueObject.getReferrerPractice().equals(""))
		{
			valueObject.setReferrerPractice(null);
		}
		domainObject.setReferrerPractice(valueObject.getReferrerPractice());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOutcomeCode() != null && valueObject.getOutcomeCode().equals(""))
		{
			valueObject.setOutcomeCode(null);
		}
		domainObject.setOutcomeCode(valueObject.getOutcomeCode());
		java.util.Date value60 = null;
		ims.framework.utils.Date date60 = valueObject.getDateTCIOffered();		
		if ( date60 != null ) 
		{
			value60 = date60.getDate();
		}
		domainObject.setDateTCIOffered(value60);
		java.util.Date value61 = null;
		ims.framework.utils.Date date61 = valueObject.getERODate();		
		if ( date61 != null ) 
		{
			value61 = date61.getDate();
		}
		domainObject.setERODate(value61);
		java.util.Date value62 = null;
		ims.framework.utils.Date date62 = valueObject.getOrigDecisionToAdmitDate();		
		if ( date62 != null ) 
		{
			value62 = date62.getDate();
		}
		domainObject.setOrigDecisionToAdmitDate(value62);
		java.util.Date value63 = null;
		ims.framework.utils.Date date63 = valueObject.getStartDate();		
		if ( date63 != null ) 
		{
			value63 = date63.getDate();
		}
		domainObject.setStartDate(value63);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getRemovalReason() != null && valueObject.getRemovalReason().equals(""))
		{
			valueObject.setRemovalReason(null);
		}
		domainObject.setRemovalReason(valueObject.getRemovalReason());
		java.util.Date value65 = null;
		ims.framework.utils.Date date65 = valueObject.getRemovalDate();		
		if ( date65 != null ) 
		{
			value65 = date65.getDate();
		}
		domainObject.setRemovalDate(value65);
		java.util.Date value66 = null;
		ims.framework.utils.Date date66 = valueObject.getEpisodeStartDate();		
		if ( date66 != null ) 
		{
			value66 = date66.getDate();
		}
		domainObject.setEpisodeStartDate(value66);

		ims.core.cds.vo.CDSProcedureDetailsRefVoCollection refCollection67 = valueObject.getOPCSProcedureGroup();
		int size67 = (null == refCollection67) ? 0 : refCollection67.size();		
		java.util.List domainOPCSProcedureGroup67 = domainObject.getOPCSProcedureGroup();
		if (domainOPCSProcedureGroup67 == null)
		{
			domainOPCSProcedureGroup67 = new java.util.ArrayList();
		}
		for(int i=0; i < size67; i++) 
		{
			ims.core.cds.vo.CDSProcedureDetailsRefVo vo = refCollection67.get(i);			
			ims.core.cds.domain.objects.CDSProcedureDetails dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.cds.domain.objects.CDSProcedureDetails)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.cds.domain.objects.CDSProcedureDetails)domainFactory.getDomainObject( ims.core.cds.domain.objects.CDSProcedureDetails.class, vo.getBoId());
				}
			}

			int domIdx = domainOPCSProcedureGroup67.indexOf(dom);
			if (domIdx == -1)
			{
				domainOPCSProcedureGroup67.add(i, dom);
			}
			else if (i != domIdx && i < domainOPCSProcedureGroup67.size())
			{
				Object tmp = domainOPCSProcedureGroup67.get(i);
				domainOPCSProcedureGroup67.set(i, domainOPCSProcedureGroup67.get(domIdx));
				domainOPCSProcedureGroup67.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i67 = domainOPCSProcedureGroup67.size();
		while (i67 > size67)
		{
			domainOPCSProcedureGroup67.remove(i67-1);
			i67 = domainOPCSProcedureGroup67.size();
		}
		
		domainObject.setOPCSProcedureGroup(domainOPCSProcedureGroup67);		
		ims.core.cds.domain.objects.CDSProcedureDetails value68 = null;
		if ( null != valueObject.getREADProcedureGroup() ) 
		{
			if (valueObject.getREADProcedureGroup().getBoId() == null)
			{
				if (domMap.get(valueObject.getREADProcedureGroup()) != null)
				{
					value68 = (ims.core.cds.domain.objects.CDSProcedureDetails)domMap.get(valueObject.getREADProcedureGroup());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value68 = domainObject.getREADProcedureGroup();	
			}
			else
			{
				value68 = (ims.core.cds.domain.objects.CDSProcedureDetails)domainFactory.getDomainObject(ims.core.cds.domain.objects.CDSProcedureDetails.class, valueObject.getREADProcedureGroup().getBoId());
			}
		}
		domainObject.setREADProcedureGroup(value68);
		ims.core.cds.domain.objects.CDSWaitingListLocGroup value69 = null;
		if ( null != valueObject.getLocationGroup() ) 
		{
			if (valueObject.getLocationGroup().getBoId() == null)
			{
				if (domMap.get(valueObject.getLocationGroup()) != null)
				{
					value69 = (ims.core.cds.domain.objects.CDSWaitingListLocGroup)domMap.get(valueObject.getLocationGroup());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value69 = domainObject.getLocationGroup();	
			}
			else
			{
				value69 = (ims.core.cds.domain.objects.CDSWaitingListLocGroup)domainFactory.getDomainObject(ims.core.cds.domain.objects.CDSWaitingListLocGroup.class, valueObject.getLocationGroup().getBoId());
			}
		}
		domainObject.setLocationGroup(value69);
		domainObject.setCareContextId(valueObject.getCareContextId());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getHRGCode() != null && valueObject.getHRGCode().equals(""))
		{
			valueObject.setHRGCode(null);
		}
		domainObject.setHRGCode(valueObject.getHRGCode());

		return domainObject;
	}

}
