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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Barbara Worwood
 */
public class CDSInpatientVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.CDSInpatientVo copy(ims.core.vo.CDSInpatientVo valueObjectDest, ims.core.vo.CDSInpatientVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CDSInpatient(valueObjectSrc.getID_CDSInpatient());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// UBRN
		valueObjectDest.setUBRN(valueObjectSrc.getUBRN());
		// PathwayIdentifier
		valueObjectDest.setPathwayIdentifier(valueObjectSrc.getPathwayIdentifier());
		// PathwayOrgCode
		valueObjectDest.setPathwayOrgCode(valueObjectSrc.getPathwayOrgCode());
		// ReferralToTreatmentStatus
		valueObjectDest.setReferralToTreatmentStatus(valueObjectSrc.getReferralToTreatmentStatus());
		// RTTStartDate
		valueObjectDest.setRTTStartDate(valueObjectSrc.getRTTStartDate());
		// RTTEndDate
		valueObjectDest.setRTTEndDate(valueObjectSrc.getRTTEndDate());
		// LeadCareActInd
		valueObjectDest.setLeadCareActInd(valueObjectSrc.getLeadCareActInd());
		// LocalPatientIdentifier
		valueObjectDest.setLocalPatientIdentifier(valueObjectSrc.getLocalPatientIdentifier());
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
		// EthnicCategory
		valueObjectDest.setEthnicCategory(valueObjectSrc.getEthnicCategory());
		// ProviderSpellNo
		valueObjectDest.setProviderSpellNo(valueObjectSrc.getProviderSpellNo());
		// AdminCategoryADT
		valueObjectDest.setAdminCategoryADT(valueObjectSrc.getAdminCategoryADT());
		// PatientClassification
		valueObjectDest.setPatientClassification(valueObjectSrc.getPatientClassification());
		// AdmissionMethod
		valueObjectDest.setAdmissionMethod(valueObjectSrc.getAdmissionMethod());
		// SourceOfAdmission
		valueObjectDest.setSourceOfAdmission(valueObjectSrc.getSourceOfAdmission());
		// StartDate
		valueObjectDest.setStartDate(valueObjectSrc.getStartDate());
		// Age
		valueObjectDest.setAge(valueObjectSrc.getAge());
		// DischargeDestination
		valueObjectDest.setDischargeDestination(valueObjectSrc.getDischargeDestination());
		// DischargeMethod
		valueObjectDest.setDischargeMethod(valueObjectSrc.getDischargeMethod());
		// DischargeReadyDate
		valueObjectDest.setDischargeReadyDate(valueObjectSrc.getDischargeReadyDate());
		// DischargeDate
		valueObjectDest.setDischargeDate(valueObjectSrc.getDischargeDate());
		// EpisodeNumber
		valueObjectDest.setEpisodeNumber(valueObjectSrc.getEpisodeNumber());
		// LastEpisodeInd
		valueObjectDest.setLastEpisodeInd(valueObjectSrc.getLastEpisodeInd());
		// AdminCategoryEPIS
		valueObjectDest.setAdminCategoryEPIS(valueObjectSrc.getAdminCategoryEPIS());
		// OperationStatus
		valueObjectDest.setOperationStatus(valueObjectSrc.getOperationStatus());
		// NeonatalCareLevel
		valueObjectDest.setNeonatalCareLevel(valueObjectSrc.getNeonatalCareLevel());
		// FirstAdmission
		valueObjectDest.setFirstAdmission(valueObjectSrc.getFirstAdmission());
		// PsychPatientStatus
		valueObjectDest.setPsychPatientStatus(valueObjectSrc.getPsychPatientStatus());
		// LegalStatus
		valueObjectDest.setLegalStatus(valueObjectSrc.getLegalStatus());
		// EpisodeStartDate
		valueObjectDest.setEpisodeStartDate(valueObjectSrc.getEpisodeStartDate());
		// EpisodeEndDate
		valueObjectDest.setEpisodeEndDate(valueObjectSrc.getEpisodeEndDate());
		// AgeAtCDSActivity
		valueObjectDest.setAgeAtCDSActivity(valueObjectSrc.getAgeAtCDSActivity());
		// SerialNumber
		valueObjectDest.setSerialNumber(valueObjectSrc.getSerialNumber());
		// NHSServiceAgreeNum
		valueObjectDest.setNHSServiceAgreeNum(valueObjectSrc.getNHSServiceAgreeNum());
		// ProviderRefNum
		valueObjectDest.setProviderRefNum(valueObjectSrc.getProviderRefNum());
		// CommissionerRefNum
		valueObjectDest.setCommissionerRefNum(valueObjectSrc.getCommissionerRefNum());
		// OrgCodeProvider
		valueObjectDest.setOrgCodeProvider(valueObjectSrc.getOrgCodeProvider());
		// OrgCodeCommissioner
		valueObjectDest.setOrgCodeCommissioner(valueObjectSrc.getOrgCodeCommissioner());
		// ConsultantCode
		valueObjectDest.setConsultantCode(valueObjectSrc.getConsultantCode());
		// SpecialtyCode
		valueObjectDest.setSpecialtyCode(valueObjectSrc.getSpecialtyCode());
		// TreatmentFuncCode
		valueObjectDest.setTreatmentFuncCode(valueObjectSrc.getTreatmentFuncCode());
		// ICDDiagnosisGroup
		valueObjectDest.setICDDiagnosisGroup(valueObjectSrc.getICDDiagnosisGroup());
		// ReadDiagGroup
		valueObjectDest.setReadDiagGroup(valueObjectSrc.getReadDiagGroup());
		// OPCSProcedureGroup
		valueObjectDest.setOPCSProcedureGroup(valueObjectSrc.getOPCSProcedureGroup());
		// READProcedureGroup
		valueObjectDest.setREADProcedureGroup(valueObjectSrc.getREADProcedureGroup());
		// LocationGroupStartEpis
		valueObjectDest.setLocationGroupStartEpis(valueObjectSrc.getLocationGroupStartEpis());
		// LocationGroupWardStay
		valueObjectDest.setLocationGroupWardStay(valueObjectSrc.getLocationGroupWardStay());
		// LocationGroupEndEpis
		valueObjectDest.setLocationGroupEndEpis(valueObjectSrc.getLocationGroupEndEpis());
		// NeonatalCare
		valueObjectDest.setNeonatalCare(valueObjectSrc.getNeonatalCare());
		// PaediatricCare
		valueObjectDest.setPaediatricCare(valueObjectSrc.getPaediatricCare());
		// AdultCare
		valueObjectDest.setAdultCare(valueObjectSrc.getAdultCare());
		// CCUnitBedConfiguration
		valueObjectDest.setCCUnitBedConfiguration(valueObjectSrc.getCCUnitBedConfiguration());
		// CCAdmissionSource
		valueObjectDest.setCCAdmissionSource(valueObjectSrc.getCCAdmissionSource());
		// CCSourceLocation
		valueObjectDest.setCCSourceLocation(valueObjectSrc.getCCSourceLocation());
		// CCAdmissionType
		valueObjectDest.setCCAdmissionType(valueObjectSrc.getCCAdmissionType());
		// AdvRespiratorySupDays
		valueObjectDest.setAdvRespiratorySupDays(valueObjectSrc.getAdvRespiratorySupDays());
		// BscRespiratorySupDays
		valueObjectDest.setBscRespiratorySupDays(valueObjectSrc.getBscRespiratorySupDays());
		// AdvCardioSupDays
		valueObjectDest.setAdvCardioSupDays(valueObjectSrc.getAdvCardioSupDays());
		// BscCardioSupDays
		valueObjectDest.setBscCardioSupDays(valueObjectSrc.getBscCardioSupDays());
		// RenalSupportDays
		valueObjectDest.setRenalSupportDays(valueObjectSrc.getRenalSupportDays());
		// NeuroSupportDays
		valueObjectDest.setNeuroSupportDays(valueObjectSrc.getNeuroSupportDays());
		// GastroSupportDays
		valueObjectDest.setGastroSupportDays(valueObjectSrc.getGastroSupportDays());
		// DermaSupportDays
		valueObjectDest.setDermaSupportDays(valueObjectSrc.getDermaSupportDays());
		// LiverSupportDays
		valueObjectDest.setLiverSupportDays(valueObjectSrc.getLiverSupportDays());
		// OrganSupportMax
		valueObjectDest.setOrganSupportMax(valueObjectSrc.getOrganSupportMax());
		// CCLevel2Days
		valueObjectDest.setCCLevel2Days(valueObjectSrc.getCCLevel2Days());
		// CCLevel3Days
		valueObjectDest.setCCLevel3Days(valueObjectSrc.getCCLevel3Days());
		// CCDischargeDate
		valueObjectDest.setCCDischargeDate(valueObjectSrc.getCCDischargeDate());
		// CCDischargeTime
		valueObjectDest.setCCDischargeTime(valueObjectSrc.getCCDischargeTime());
		// CCDischargeReadyDate
		valueObjectDest.setCCDischargeReadyDate(valueObjectSrc.getCCDischargeReadyDate());
		// CCDischargeReadyTime
		valueObjectDest.setCCDischargeReadyTime(valueObjectSrc.getCCDischargeReadyTime());
		// CCDischargeStatus
		valueObjectDest.setCCDischargeStatus(valueObjectSrc.getCCDischargeStatus());
		// CCDischargeDest
		valueObjectDest.setCCDischargeDest(valueObjectSrc.getCCDischargeDest());
		// CCDischargeLocation
		valueObjectDest.setCCDischargeLocation(valueObjectSrc.getCCDischargeLocation());
		// GPCode
		valueObjectDest.setGPCode(valueObjectSrc.getGPCode());
		// PracticeCode
		valueObjectDest.setPracticeCode(valueObjectSrc.getPracticeCode());
		// ReferrerCode
		valueObjectDest.setReferrerCode(valueObjectSrc.getReferrerCode());
		// OrgCodeReferrer
		valueObjectDest.setOrgCodeReferrer(valueObjectSrc.getOrgCodeReferrer());
		// DurElectiveWait
		valueObjectDest.setDurElectiveWait(valueObjectSrc.getDurElectiveWait());
		// IntendedManagement
		valueObjectDest.setIntendedManagement(valueObjectSrc.getIntendedManagement());
		// DecidedToAdmitDate
		valueObjectDest.setDecidedToAdmitDate(valueObjectSrc.getDecidedToAdmitDate());
		// ERODate
		valueObjectDest.setERODate(valueObjectSrc.getERODate());
		// ResourceGrpCode
		valueObjectDest.setResourceGrpCode(valueObjectSrc.getResourceGrpCode());
		// ProcedureScheme
		valueObjectDest.setProcedureScheme(valueObjectSrc.getProcedureScheme());
		// HrgDominantGrouping
		valueObjectDest.setHrgDominantGrouping(valueObjectSrc.getHrgDominantGrouping());
		// CDSApplicableDate
		valueObjectDest.setCDSApplicableDate(valueObjectSrc.getCDSApplicableDate());
		// CDSSenderOrgCode
		valueObjectDest.setCDSSenderOrgCode(valueObjectSrc.getCDSSenderOrgCode());
		// ResourceGPVersion
		valueObjectDest.setResourceGPVersion(valueObjectSrc.getResourceGPVersion());
		// MaritalStatus
		valueObjectDest.setMaritalStatus(valueObjectSrc.getMaritalStatus());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCDSInpatientVoCollectionFromCDSInpatient(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.cds.domain.objects.CDSInpatient objects.
	 */
	public static ims.core.vo.CDSInpatientVoCollection createCDSInpatientVoCollectionFromCDSInpatient(java.util.Set domainObjectSet)	
	{
		return createCDSInpatientVoCollectionFromCDSInpatient(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.cds.domain.objects.CDSInpatient objects.
	 */
	public static ims.core.vo.CDSInpatientVoCollection createCDSInpatientVoCollectionFromCDSInpatient(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.CDSInpatientVoCollection voList = new ims.core.vo.CDSInpatientVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.cds.domain.objects.CDSInpatient domainObject = (ims.core.cds.domain.objects.CDSInpatient) iterator.next();
			ims.core.vo.CDSInpatientVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.cds.domain.objects.CDSInpatient objects.
	 */
	public static ims.core.vo.CDSInpatientVoCollection createCDSInpatientVoCollectionFromCDSInpatient(java.util.List domainObjectList) 
	{
		return createCDSInpatientVoCollectionFromCDSInpatient(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.cds.domain.objects.CDSInpatient objects.
	 */
	public static ims.core.vo.CDSInpatientVoCollection createCDSInpatientVoCollectionFromCDSInpatient(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.CDSInpatientVoCollection voList = new ims.core.vo.CDSInpatientVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.cds.domain.objects.CDSInpatient domainObject = (ims.core.cds.domain.objects.CDSInpatient) domainObjectList.get(i);
			ims.core.vo.CDSInpatientVo vo = create(map, domainObject);

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
	 * Create the ims.core.cds.domain.objects.CDSInpatient set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractCDSInpatientSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CDSInpatientVoCollection voCollection) 
	 {
	 	return extractCDSInpatientSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCDSInpatientSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CDSInpatientVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.CDSInpatientVo vo = voCollection.get(i);
			ims.core.cds.domain.objects.CDSInpatient domainObject = CDSInpatientVoAssembler.extractCDSInpatient(domainFactory, vo, domMap);

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
	 * Create the ims.core.cds.domain.objects.CDSInpatient list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractCDSInpatientList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CDSInpatientVoCollection voCollection) 
	 {
	 	return extractCDSInpatientList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCDSInpatientList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CDSInpatientVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.CDSInpatientVo vo = voCollection.get(i);
			ims.core.cds.domain.objects.CDSInpatient domainObject = CDSInpatientVoAssembler.extractCDSInpatient(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.cds.domain.objects.CDSInpatient object.
	 * @param domainObject ims.core.cds.domain.objects.CDSInpatient
	 */
	 public static ims.core.vo.CDSInpatientVo create(ims.core.cds.domain.objects.CDSInpatient domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.cds.domain.objects.CDSInpatient object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.CDSInpatientVo create(DomainObjectMap map, ims.core.cds.domain.objects.CDSInpatient domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.CDSInpatientVo valueObject = (ims.core.vo.CDSInpatientVo) map.getValueObject(domainObject, ims.core.vo.CDSInpatientVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.CDSInpatientVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.cds.domain.objects.CDSInpatient
	 */
	 public static ims.core.vo.CDSInpatientVo insert(ims.core.vo.CDSInpatientVo valueObject, ims.core.cds.domain.objects.CDSInpatient domainObject) 
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
	 * @param domainObject ims.core.cds.domain.objects.CDSInpatient
	 */
	 public static ims.core.vo.CDSInpatientVo insert(DomainObjectMap map, ims.core.vo.CDSInpatientVo valueObject, ims.core.cds.domain.objects.CDSInpatient domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_CDSInpatient(domainObject.getId());
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
			
		// UBRN
		valueObject.setUBRN(domainObject.getUBRN());
		// PathwayIdentifier
		valueObject.setPathwayIdentifier(domainObject.getPathwayIdentifier());
		// PathwayOrgCode
		valueObject.setPathwayOrgCode(domainObject.getPathwayOrgCode());
		// ReferralToTreatmentStatus
		valueObject.setReferralToTreatmentStatus(domainObject.getReferralToTreatmentStatus());
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
		// LeadCareActInd
		valueObject.setLeadCareActInd(domainObject.getLeadCareActInd());
		// LocalPatientIdentifier
		valueObject.setLocalPatientIdentifier(domainObject.getLocalPatientIdentifier());
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
		// EthnicCategory
		valueObject.setEthnicCategory(domainObject.getEthnicCategory());
		// ProviderSpellNo
		valueObject.setProviderSpellNo(domainObject.getProviderSpellNo());
		// AdminCategoryADT
		valueObject.setAdminCategoryADT(domainObject.getAdminCategoryADT());
		// PatientClassification
		valueObject.setPatientClassification(domainObject.getPatientClassification());
		// AdmissionMethod
		valueObject.setAdmissionMethod(domainObject.getAdmissionMethod());
		// SourceOfAdmission
		valueObject.setSourceOfAdmission(domainObject.getSourceOfAdmission());
		// StartDate
		java.util.Date StartDate = domainObject.getStartDate();
		if ( null != StartDate ) 
		{
			valueObject.setStartDate(new ims.framework.utils.Date(StartDate) );
		}
		// Age
		valueObject.setAge(domainObject.getAge());
		// DischargeDestination
		valueObject.setDischargeDestination(domainObject.getDischargeDestination());
		// DischargeMethod
		valueObject.setDischargeMethod(domainObject.getDischargeMethod());
		// DischargeReadyDate
		java.util.Date DischargeReadyDate = domainObject.getDischargeReadyDate();
		if ( null != DischargeReadyDate ) 
		{
			valueObject.setDischargeReadyDate(new ims.framework.utils.Date(DischargeReadyDate) );
		}
		// DischargeDate
		java.util.Date DischargeDate = domainObject.getDischargeDate();
		if ( null != DischargeDate ) 
		{
			valueObject.setDischargeDate(new ims.framework.utils.Date(DischargeDate) );
		}
		// EpisodeNumber
		valueObject.setEpisodeNumber(domainObject.getEpisodeNumber());
		// LastEpisodeInd
		valueObject.setLastEpisodeInd(domainObject.getLastEpisodeInd());
		// AdminCategoryEPIS
		valueObject.setAdminCategoryEPIS(domainObject.getAdminCategoryEPIS());
		// OperationStatus
		valueObject.setOperationStatus(domainObject.getOperationStatus());
		// NeonatalCareLevel
		valueObject.setNeonatalCareLevel(domainObject.getNeonatalCareLevel());
		// FirstAdmission
		valueObject.setFirstAdmission(domainObject.getFirstAdmission());
		// PsychPatientStatus
		valueObject.setPsychPatientStatus(domainObject.getPsychPatientStatus());
		// LegalStatus
		valueObject.setLegalStatus(domainObject.getLegalStatus());
		// EpisodeStartDate
		java.util.Date EpisodeStartDate = domainObject.getEpisodeStartDate();
		if ( null != EpisodeStartDate ) 
		{
			valueObject.setEpisodeStartDate(new ims.framework.utils.Date(EpisodeStartDate) );
		}
		// EpisodeEndDate
		java.util.Date EpisodeEndDate = domainObject.getEpisodeEndDate();
		if ( null != EpisodeEndDate ) 
		{
			valueObject.setEpisodeEndDate(new ims.framework.utils.Date(EpisodeEndDate) );
		}
		// AgeAtCDSActivity
		valueObject.setAgeAtCDSActivity(domainObject.getAgeAtCDSActivity());
		// SerialNumber
		valueObject.setSerialNumber(domainObject.getSerialNumber());
		// NHSServiceAgreeNum
		valueObject.setNHSServiceAgreeNum(domainObject.getNHSServiceAgreeNum());
		// ProviderRefNum
		valueObject.setProviderRefNum(domainObject.getProviderRefNum());
		// CommissionerRefNum
		valueObject.setCommissionerRefNum(domainObject.getCommissionerRefNum());
		// OrgCodeProvider
		valueObject.setOrgCodeProvider(domainObject.getOrgCodeProvider());
		// OrgCodeCommissioner
		valueObject.setOrgCodeCommissioner(domainObject.getOrgCodeCommissioner());
		// ConsultantCode
		valueObject.setConsultantCode(domainObject.getConsultantCode());
		// SpecialtyCode
		valueObject.setSpecialtyCode(domainObject.getSpecialtyCode());
		// TreatmentFuncCode
		valueObject.setTreatmentFuncCode(domainObject.getTreatmentFuncCode());
		// ICDDiagnosisGroup
		valueObject.setICDDiagnosisGroup(ims.core.vo.domain.CDSDiagnosisDetailsVoAssembler.createCDSDiagnosisDetailsVoCollectionFromCDSDiagnosisDetails(map, domainObject.getICDDiagnosisGroup()) );
		// ReadDiagGroup
		if (domainObject.getReadDiagGroup() != null)
		{
			if(domainObject.getReadDiagGroup() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getReadDiagGroup();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setReadDiagGroup(new ims.core.cds.vo.CDSDiagnosisDetailsRefVo(id, -1));				
			}
			else
			{
				valueObject.setReadDiagGroup(new ims.core.cds.vo.CDSDiagnosisDetailsRefVo(domainObject.getReadDiagGroup().getId(), domainObject.getReadDiagGroup().getVersion()));
			}
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
		// LocationGroupStartEpis
		valueObject.setLocationGroupStartEpis(ims.core.vo.domain.CDSInpatientLocationGroupVoAssembler.create(map, domainObject.getLocationGroupStartEpis()) );
		// LocationGroupWardStay
		ims.core.cds.vo.CDSInpatientLocationGroupRefVoCollection LocationGroupWardStay = new ims.core.cds.vo.CDSInpatientLocationGroupRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getLocationGroupWardStay().iterator(); iterator.hasNext(); ) 
		{
			ims.core.cds.domain.objects.CDSInpatientLocationGroup tmp = (ims.core.cds.domain.objects.CDSInpatientLocationGroup)iterator.next();
			if (tmp != null)
				LocationGroupWardStay.add(new ims.core.cds.vo.CDSInpatientLocationGroupRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setLocationGroupWardStay(LocationGroupWardStay);
		// LocationGroupEndEpis
		if (domainObject.getLocationGroupEndEpis() != null)
		{
			if(domainObject.getLocationGroupEndEpis() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getLocationGroupEndEpis();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setLocationGroupEndEpis(new ims.core.cds.vo.CDSInpatientLocationGroupRefVo(id, -1));				
			}
			else
			{
				valueObject.setLocationGroupEndEpis(new ims.core.cds.vo.CDSInpatientLocationGroupRefVo(domainObject.getLocationGroupEndEpis().getId(), domainObject.getLocationGroupEndEpis().getVersion()));
			}
		}
		// NeonatalCare
		valueObject.setNeonatalCare(ims.core.vo.domain.CDSCriticalCareVoAssembler.create(map, domainObject.getNeonatalCare()) );
		// PaediatricCare
		if (domainObject.getPaediatricCare() != null)
		{
			if(domainObject.getPaediatricCare() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPaediatricCare();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPaediatricCare(new ims.core.cds.vo.CDSCriticalCareDetailsRefVo(id, -1));				
			}
			else
			{
				valueObject.setPaediatricCare(new ims.core.cds.vo.CDSCriticalCareDetailsRefVo(domainObject.getPaediatricCare().getId(), domainObject.getPaediatricCare().getVersion()));
			}
		}
		// AdultCare
		if (domainObject.getAdultCare() != null)
		{
			if(domainObject.getAdultCare() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAdultCare();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAdultCare(new ims.core.cds.vo.CDSCriticalCareDetailsRefVo(id, -1));				
			}
			else
			{
				valueObject.setAdultCare(new ims.core.cds.vo.CDSCriticalCareDetailsRefVo(domainObject.getAdultCare().getId(), domainObject.getAdultCare().getVersion()));
			}
		}
		// CCUnitBedConfiguration
		valueObject.setCCUnitBedConfiguration(domainObject.getCCUnitBedConfiguration());
		// CCAdmissionSource
		valueObject.setCCAdmissionSource(domainObject.getCCAdmissionSource());
		// CCSourceLocation
		valueObject.setCCSourceLocation(domainObject.getCCSourceLocation());
		// CCAdmissionType
		valueObject.setCCAdmissionType(domainObject.getCCAdmissionType());
		// AdvRespiratorySupDays
		valueObject.setAdvRespiratorySupDays(domainObject.getAdvRespiratorySupDays());
		// BscRespiratorySupDays
		valueObject.setBscRespiratorySupDays(domainObject.getBscRespiratorySupDays());
		// AdvCardioSupDays
		valueObject.setAdvCardioSupDays(domainObject.getAdvCardioSupDays());
		// BscCardioSupDays
		valueObject.setBscCardioSupDays(domainObject.getBscCardioSupDays());
		// RenalSupportDays
		valueObject.setRenalSupportDays(domainObject.getRenalSupportDays());
		// NeuroSupportDays
		valueObject.setNeuroSupportDays(domainObject.getNeuroSupportDays());
		// GastroSupportDays
		valueObject.setGastroSupportDays(domainObject.getGastroSupportDays());
		// DermaSupportDays
		valueObject.setDermaSupportDays(domainObject.getDermaSupportDays());
		// LiverSupportDays
		valueObject.setLiverSupportDays(domainObject.getLiverSupportDays());
		// OrganSupportMax
		valueObject.setOrganSupportMax(domainObject.getOrganSupportMax());
		// CCLevel2Days
		valueObject.setCCLevel2Days(domainObject.getCCLevel2Days());
		// CCLevel3Days
		valueObject.setCCLevel3Days(domainObject.getCCLevel3Days());
		// CCDischargeDate
		java.util.Date CCDischargeDate = domainObject.getCCDischargeDate();
		if ( null != CCDischargeDate ) 
		{
			valueObject.setCCDischargeDate(new ims.framework.utils.Date(CCDischargeDate) );
		}
		// CCDischargeTime
		String CCDischargeTime = domainObject.getCCDischargeTime();
		if ( null != CCDischargeTime ) 
		{
			valueObject.setCCDischargeTime(new ims.framework.utils.Time(CCDischargeTime) );
		}
		// CCDischargeReadyDate
		java.util.Date CCDischargeReadyDate = domainObject.getCCDischargeReadyDate();
		if ( null != CCDischargeReadyDate ) 
		{
			valueObject.setCCDischargeReadyDate(new ims.framework.utils.Date(CCDischargeReadyDate) );
		}
		// CCDischargeReadyTime
		String CCDischargeReadyTime = domainObject.getCCDischargeReadyTime();
		if ( null != CCDischargeReadyTime ) 
		{
			valueObject.setCCDischargeReadyTime(new ims.framework.utils.Time(CCDischargeReadyTime) );
		}
		// CCDischargeStatus
		valueObject.setCCDischargeStatus(domainObject.getCCDischargeStatus());
		// CCDischargeDest
		valueObject.setCCDischargeDest(domainObject.getCCDischargeDest());
		// CCDischargeLocation
		valueObject.setCCDischargeLocation(domainObject.getCCDischargeLocation());
		// GPCode
		valueObject.setGPCode(domainObject.getGPCode());
		// PracticeCode
		valueObject.setPracticeCode(domainObject.getPracticeCode());
		// ReferrerCode
		valueObject.setReferrerCode(domainObject.getReferrerCode());
		// OrgCodeReferrer
		valueObject.setOrgCodeReferrer(domainObject.getOrgCodeReferrer());
		// DurElectiveWait
		valueObject.setDurElectiveWait(domainObject.getDurElectiveWait());
		// IntendedManagement
		valueObject.setIntendedManagement(domainObject.getIntendedManagement());
		// DecidedToAdmitDate
		java.util.Date DecidedToAdmitDate = domainObject.getDecidedToAdmitDate();
		if ( null != DecidedToAdmitDate ) 
		{
			valueObject.setDecidedToAdmitDate(new ims.framework.utils.Date(DecidedToAdmitDate) );
		}
		// ERODate
		java.util.Date ERODate = domainObject.getERODate();
		if ( null != ERODate ) 
		{
			valueObject.setERODate(new ims.framework.utils.Date(ERODate) );
		}
		// ResourceGrpCode
		valueObject.setResourceGrpCode(domainObject.getResourceGrpCode());
		// ProcedureScheme
		valueObject.setProcedureScheme(domainObject.getProcedureScheme());
		// HrgDominantGrouping
		valueObject.setHrgDominantGrouping(domainObject.getHrgDominantGrouping());
		// CDSApplicableDate
		java.util.Date CDSApplicableDate = domainObject.getCDSApplicableDate();
		if ( null != CDSApplicableDate ) 
		{
			valueObject.setCDSApplicableDate(new ims.framework.utils.DateTime(CDSApplicableDate) );
		}
		// CDSSenderOrgCode
		valueObject.setCDSSenderOrgCode(domainObject.getCDSSenderOrgCode());
		// ResourceGPVersion
		valueObject.setResourceGPVersion(domainObject.getResourceGPVersion());
		// MaritalStatus
		valueObject.setMaritalStatus(domainObject.getMaritalStatus());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.cds.domain.objects.CDSInpatient extractCDSInpatient(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CDSInpatientVo valueObject) 
	{
		return 	extractCDSInpatient(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.cds.domain.objects.CDSInpatient extractCDSInpatient(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CDSInpatientVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_CDSInpatient();
		ims.core.cds.domain.objects.CDSInpatient domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.cds.domain.objects.CDSInpatient)domMap.get(valueObject);
			}
			// ims.core.vo.CDSInpatientVo ID_CDSInpatient field is unknown
			domainObject = new ims.core.cds.domain.objects.CDSInpatient();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_CDSInpatient());
			if (domMap.get(key) != null)
			{
				return (ims.core.cds.domain.objects.CDSInpatient)domMap.get(key);
			}
			domainObject = (ims.core.cds.domain.objects.CDSInpatient) domainFactory.getDomainObject(ims.core.cds.domain.objects.CDSInpatient.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_CDSInpatient());

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
		java.util.Date value5 = null;
		ims.framework.utils.Date date5 = valueObject.getRTTStartDate();		
		if ( date5 != null ) 
		{
			value5 = date5.getDate();
		}
		domainObject.setRTTStartDate(value5);
		java.util.Date value6 = null;
		ims.framework.utils.Date date6 = valueObject.getRTTEndDate();		
		if ( date6 != null ) 
		{
			value6 = date6.getDate();
		}
		domainObject.setRTTEndDate(value6);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLeadCareActInd() != null && valueObject.getLeadCareActInd().equals(""))
		{
			valueObject.setLeadCareActInd(null);
		}
		domainObject.setLeadCareActInd(valueObject.getLeadCareActInd());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLocalPatientIdentifier() != null && valueObject.getLocalPatientIdentifier().equals(""))
		{
			valueObject.setLocalPatientIdentifier(null);
		}
		domainObject.setLocalPatientIdentifier(valueObject.getLocalPatientIdentifier());
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
		java.util.Date value16 = null;
		ims.framework.utils.Date date16 = valueObject.getDateOfBirth();		
		if ( date16 != null ) 
		{
			value16 = date16.getDate();
		}
		domainObject.setDateOfBirth(value16);
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
		if (valueObject.getEthnicCategory() != null && valueObject.getEthnicCategory().equals(""))
		{
			valueObject.setEthnicCategory(null);
		}
		domainObject.setEthnicCategory(valueObject.getEthnicCategory());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getProviderSpellNo() != null && valueObject.getProviderSpellNo().equals(""))
		{
			valueObject.setProviderSpellNo(null);
		}
		domainObject.setProviderSpellNo(valueObject.getProviderSpellNo());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAdminCategoryADT() != null && valueObject.getAdminCategoryADT().equals(""))
		{
			valueObject.setAdminCategoryADT(null);
		}
		domainObject.setAdminCategoryADT(valueObject.getAdminCategoryADT());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPatientClassification() != null && valueObject.getPatientClassification().equals(""))
		{
			valueObject.setPatientClassification(null);
		}
		domainObject.setPatientClassification(valueObject.getPatientClassification());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAdmissionMethod() != null && valueObject.getAdmissionMethod().equals(""))
		{
			valueObject.setAdmissionMethod(null);
		}
		domainObject.setAdmissionMethod(valueObject.getAdmissionMethod());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSourceOfAdmission() != null && valueObject.getSourceOfAdmission().equals(""))
		{
			valueObject.setSourceOfAdmission(null);
		}
		domainObject.setSourceOfAdmission(valueObject.getSourceOfAdmission());
		java.util.Date value25 = null;
		ims.framework.utils.Date date25 = valueObject.getStartDate();		
		if ( date25 != null ) 
		{
			value25 = date25.getDate();
		}
		domainObject.setStartDate(value25);
		domainObject.setAge(valueObject.getAge());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDischargeDestination() != null && valueObject.getDischargeDestination().equals(""))
		{
			valueObject.setDischargeDestination(null);
		}
		domainObject.setDischargeDestination(valueObject.getDischargeDestination());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDischargeMethod() != null && valueObject.getDischargeMethod().equals(""))
		{
			valueObject.setDischargeMethod(null);
		}
		domainObject.setDischargeMethod(valueObject.getDischargeMethod());
		java.util.Date value29 = null;
		ims.framework.utils.Date date29 = valueObject.getDischargeReadyDate();		
		if ( date29 != null ) 
		{
			value29 = date29.getDate();
		}
		domainObject.setDischargeReadyDate(value29);
		java.util.Date value30 = null;
		ims.framework.utils.Date date30 = valueObject.getDischargeDate();		
		if ( date30 != null ) 
		{
			value30 = date30.getDate();
		}
		domainObject.setDischargeDate(value30);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getEpisodeNumber() != null && valueObject.getEpisodeNumber().equals(""))
		{
			valueObject.setEpisodeNumber(null);
		}
		domainObject.setEpisodeNumber(valueObject.getEpisodeNumber());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLastEpisodeInd() != null && valueObject.getLastEpisodeInd().equals(""))
		{
			valueObject.setLastEpisodeInd(null);
		}
		domainObject.setLastEpisodeInd(valueObject.getLastEpisodeInd());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAdminCategoryEPIS() != null && valueObject.getAdminCategoryEPIS().equals(""))
		{
			valueObject.setAdminCategoryEPIS(null);
		}
		domainObject.setAdminCategoryEPIS(valueObject.getAdminCategoryEPIS());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOperationStatus() != null && valueObject.getOperationStatus().equals(""))
		{
			valueObject.setOperationStatus(null);
		}
		domainObject.setOperationStatus(valueObject.getOperationStatus());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNeonatalCareLevel() != null && valueObject.getNeonatalCareLevel().equals(""))
		{
			valueObject.setNeonatalCareLevel(null);
		}
		domainObject.setNeonatalCareLevel(valueObject.getNeonatalCareLevel());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getFirstAdmission() != null && valueObject.getFirstAdmission().equals(""))
		{
			valueObject.setFirstAdmission(null);
		}
		domainObject.setFirstAdmission(valueObject.getFirstAdmission());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPsychPatientStatus() != null && valueObject.getPsychPatientStatus().equals(""))
		{
			valueObject.setPsychPatientStatus(null);
		}
		domainObject.setPsychPatientStatus(valueObject.getPsychPatientStatus());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLegalStatus() != null && valueObject.getLegalStatus().equals(""))
		{
			valueObject.setLegalStatus(null);
		}
		domainObject.setLegalStatus(valueObject.getLegalStatus());
		java.util.Date value39 = null;
		ims.framework.utils.Date date39 = valueObject.getEpisodeStartDate();		
		if ( date39 != null ) 
		{
			value39 = date39.getDate();
		}
		domainObject.setEpisodeStartDate(value39);
		java.util.Date value40 = null;
		ims.framework.utils.Date date40 = valueObject.getEpisodeEndDate();		
		if ( date40 != null ) 
		{
			value40 = date40.getDate();
		}
		domainObject.setEpisodeEndDate(value40);
		domainObject.setAgeAtCDSActivity(valueObject.getAgeAtCDSActivity());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSerialNumber() != null && valueObject.getSerialNumber().equals(""))
		{
			valueObject.setSerialNumber(null);
		}
		domainObject.setSerialNumber(valueObject.getSerialNumber());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNHSServiceAgreeNum() != null && valueObject.getNHSServiceAgreeNum().equals(""))
		{
			valueObject.setNHSServiceAgreeNum(null);
		}
		domainObject.setNHSServiceAgreeNum(valueObject.getNHSServiceAgreeNum());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getProviderRefNum() != null && valueObject.getProviderRefNum().equals(""))
		{
			valueObject.setProviderRefNum(null);
		}
		domainObject.setProviderRefNum(valueObject.getProviderRefNum());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCommissionerRefNum() != null && valueObject.getCommissionerRefNum().equals(""))
		{
			valueObject.setCommissionerRefNum(null);
		}
		domainObject.setCommissionerRefNum(valueObject.getCommissionerRefNum());
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

		// SaveAsRefVO treated as RefValueObject
		ims.core.cds.vo.CDSDiagnosisDetailsRefVoCollection refCollection51 = new ims.core.cds.vo.CDSDiagnosisDetailsRefVoCollection();
		if (valueObject.getICDDiagnosisGroup() != null)
		{
			for (int i51=0; i51<valueObject.getICDDiagnosisGroup().size(); i51++)
			{
				ims.core.cds.vo.CDSDiagnosisDetailsRefVo ref51 = (ims.core.cds.vo.CDSDiagnosisDetailsRefVo)valueObject.getICDDiagnosisGroup().get(i51);
				refCollection51.add(ref51);
			}
		}
		int size51 = (null == refCollection51) ? 0 : refCollection51.size();		
		java.util.List domainICDDiagnosisGroup51 = domainObject.getICDDiagnosisGroup();
		if (domainICDDiagnosisGroup51 == null)
		{
			domainICDDiagnosisGroup51 = new java.util.ArrayList();
		}
		for(int i=0; i < size51; i++) 
		{
			ims.core.cds.vo.CDSDiagnosisDetailsRefVo vo = refCollection51.get(i);			
			ims.core.cds.domain.objects.CDSDiagnosisDetails dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.cds.domain.objects.CDSDiagnosisDetails)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.cds.domain.objects.CDSDiagnosisDetails)domainFactory.getDomainObject( ims.core.cds.domain.objects.CDSDiagnosisDetails.class, vo.getBoId());
				}
			}

			int domIdx = domainICDDiagnosisGroup51.indexOf(dom);
			if (domIdx == -1)
			{
				domainICDDiagnosisGroup51.add(i, dom);
			}
			else if (i != domIdx && i < domainICDDiagnosisGroup51.size())
			{
				Object tmp = domainICDDiagnosisGroup51.get(i);
				domainICDDiagnosisGroup51.set(i, domainICDDiagnosisGroup51.get(domIdx));
				domainICDDiagnosisGroup51.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i51 = domainICDDiagnosisGroup51.size();
		while (i51 > size51)
		{
			domainICDDiagnosisGroup51.remove(i51-1);
			i51 = domainICDDiagnosisGroup51.size();
		}
		
		domainObject.setICDDiagnosisGroup(domainICDDiagnosisGroup51);		
		ims.core.cds.domain.objects.CDSDiagnosisDetails value52 = null;
		if ( null != valueObject.getReadDiagGroup() ) 
		{
			if (valueObject.getReadDiagGroup().getBoId() == null)
			{
				if (domMap.get(valueObject.getReadDiagGroup()) != null)
				{
					value52 = (ims.core.cds.domain.objects.CDSDiagnosisDetails)domMap.get(valueObject.getReadDiagGroup());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value52 = domainObject.getReadDiagGroup();	
			}
			else
			{
				value52 = (ims.core.cds.domain.objects.CDSDiagnosisDetails)domainFactory.getDomainObject(ims.core.cds.domain.objects.CDSDiagnosisDetails.class, valueObject.getReadDiagGroup().getBoId());
			}
		}
		domainObject.setReadDiagGroup(value52);

		ims.core.cds.vo.CDSProcedureDetailsRefVoCollection refCollection53 = valueObject.getOPCSProcedureGroup();
		int size53 = (null == refCollection53) ? 0 : refCollection53.size();		
		java.util.List domainOPCSProcedureGroup53 = domainObject.getOPCSProcedureGroup();
		if (domainOPCSProcedureGroup53 == null)
		{
			domainOPCSProcedureGroup53 = new java.util.ArrayList();
		}
		for(int i=0; i < size53; i++) 
		{
			ims.core.cds.vo.CDSProcedureDetailsRefVo vo = refCollection53.get(i);			
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

			int domIdx = domainOPCSProcedureGroup53.indexOf(dom);
			if (domIdx == -1)
			{
				domainOPCSProcedureGroup53.add(i, dom);
			}
			else if (i != domIdx && i < domainOPCSProcedureGroup53.size())
			{
				Object tmp = domainOPCSProcedureGroup53.get(i);
				domainOPCSProcedureGroup53.set(i, domainOPCSProcedureGroup53.get(domIdx));
				domainOPCSProcedureGroup53.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i53 = domainOPCSProcedureGroup53.size();
		while (i53 > size53)
		{
			domainOPCSProcedureGroup53.remove(i53-1);
			i53 = domainOPCSProcedureGroup53.size();
		}
		
		domainObject.setOPCSProcedureGroup(domainOPCSProcedureGroup53);		
		ims.core.cds.domain.objects.CDSProcedureDetails value54 = null;
		if ( null != valueObject.getREADProcedureGroup() ) 
		{
			if (valueObject.getREADProcedureGroup().getBoId() == null)
			{
				if (domMap.get(valueObject.getREADProcedureGroup()) != null)
				{
					value54 = (ims.core.cds.domain.objects.CDSProcedureDetails)domMap.get(valueObject.getREADProcedureGroup());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value54 = domainObject.getREADProcedureGroup();	
			}
			else
			{
				value54 = (ims.core.cds.domain.objects.CDSProcedureDetails)domainFactory.getDomainObject(ims.core.cds.domain.objects.CDSProcedureDetails.class, valueObject.getREADProcedureGroup().getBoId());
			}
		}
		domainObject.setREADProcedureGroup(value54);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.cds.domain.objects.CDSInpatientLocationGroup value55 = null;
		if ( null != valueObject.getLocationGroupStartEpis() ) 
		{
			if (valueObject.getLocationGroupStartEpis().getBoId() == null)
			{
				if (domMap.get(valueObject.getLocationGroupStartEpis()) != null)
				{
					value55 = (ims.core.cds.domain.objects.CDSInpatientLocationGroup)domMap.get(valueObject.getLocationGroupStartEpis());
				}
			}
			else
			{
				value55 = (ims.core.cds.domain.objects.CDSInpatientLocationGroup)domainFactory.getDomainObject(ims.core.cds.domain.objects.CDSInpatientLocationGroup.class, valueObject.getLocationGroupStartEpis().getBoId());
			}
		}
		domainObject.setLocationGroupStartEpis(value55);

		ims.core.cds.vo.CDSInpatientLocationGroupRefVoCollection refCollection56 = valueObject.getLocationGroupWardStay();
		int size56 = (null == refCollection56) ? 0 : refCollection56.size();		
		java.util.Set domainLocationGroupWardStay56 = domainObject.getLocationGroupWardStay();
		if (domainLocationGroupWardStay56 == null)
		{
			domainLocationGroupWardStay56 = new java.util.HashSet();
		}
		java.util.Set newSet56  = new java.util.HashSet();
		for(int i=0; i<size56; i++) 
		{
			ims.core.cds.vo.CDSInpatientLocationGroupRefVo vo = refCollection56.get(i);					
			ims.core.cds.domain.objects.CDSInpatientLocationGroup dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.cds.domain.objects.CDSInpatientLocationGroup)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.cds.domain.objects.CDSInpatientLocationGroup)domainFactory.getDomainObject( ims.core.cds.domain.objects.CDSInpatientLocationGroup.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainLocationGroupWardStay56.contains(dom))
			{
				domainLocationGroupWardStay56.add(dom);
			}
			newSet56.add(dom);			
		}
		java.util.Set removedSet56 = new java.util.HashSet();
		java.util.Iterator iter56 = domainLocationGroupWardStay56.iterator();
		//Find out which objects need to be removed
		while (iter56.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter56.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet56.contains(o))
			{
				removedSet56.add(o);
			}
		}
		iter56 = removedSet56.iterator();
		//Remove the unwanted objects
		while (iter56.hasNext())
		{
			domainLocationGroupWardStay56.remove(iter56.next());
		}		
		
		domainObject.setLocationGroupWardStay(domainLocationGroupWardStay56);		
		ims.core.cds.domain.objects.CDSInpatientLocationGroup value57 = null;
		if ( null != valueObject.getLocationGroupEndEpis() ) 
		{
			if (valueObject.getLocationGroupEndEpis().getBoId() == null)
			{
				if (domMap.get(valueObject.getLocationGroupEndEpis()) != null)
				{
					value57 = (ims.core.cds.domain.objects.CDSInpatientLocationGroup)domMap.get(valueObject.getLocationGroupEndEpis());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value57 = domainObject.getLocationGroupEndEpis();	
			}
			else
			{
				value57 = (ims.core.cds.domain.objects.CDSInpatientLocationGroup)domainFactory.getDomainObject(ims.core.cds.domain.objects.CDSInpatientLocationGroup.class, valueObject.getLocationGroupEndEpis().getBoId());
			}
		}
		domainObject.setLocationGroupEndEpis(value57);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.cds.domain.objects.CDSCriticalCareDetails value58 = null;
		if ( null != valueObject.getNeonatalCare() ) 
		{
			if (valueObject.getNeonatalCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getNeonatalCare()) != null)
				{
					value58 = (ims.core.cds.domain.objects.CDSCriticalCareDetails)domMap.get(valueObject.getNeonatalCare());
				}
			}
			else
			{
				value58 = (ims.core.cds.domain.objects.CDSCriticalCareDetails)domainFactory.getDomainObject(ims.core.cds.domain.objects.CDSCriticalCareDetails.class, valueObject.getNeonatalCare().getBoId());
			}
		}
		domainObject.setNeonatalCare(value58);
		ims.core.cds.domain.objects.CDSCriticalCareDetails value59 = null;
		if ( null != valueObject.getPaediatricCare() ) 
		{
			if (valueObject.getPaediatricCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getPaediatricCare()) != null)
				{
					value59 = (ims.core.cds.domain.objects.CDSCriticalCareDetails)domMap.get(valueObject.getPaediatricCare());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value59 = domainObject.getPaediatricCare();	
			}
			else
			{
				value59 = (ims.core.cds.domain.objects.CDSCriticalCareDetails)domainFactory.getDomainObject(ims.core.cds.domain.objects.CDSCriticalCareDetails.class, valueObject.getPaediatricCare().getBoId());
			}
		}
		domainObject.setPaediatricCare(value59);
		ims.core.cds.domain.objects.CDSCriticalCareDetails value60 = null;
		if ( null != valueObject.getAdultCare() ) 
		{
			if (valueObject.getAdultCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getAdultCare()) != null)
				{
					value60 = (ims.core.cds.domain.objects.CDSCriticalCareDetails)domMap.get(valueObject.getAdultCare());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value60 = domainObject.getAdultCare();	
			}
			else
			{
				value60 = (ims.core.cds.domain.objects.CDSCriticalCareDetails)domainFactory.getDomainObject(ims.core.cds.domain.objects.CDSCriticalCareDetails.class, valueObject.getAdultCare().getBoId());
			}
		}
		domainObject.setAdultCare(value60);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCCUnitBedConfiguration() != null && valueObject.getCCUnitBedConfiguration().equals(""))
		{
			valueObject.setCCUnitBedConfiguration(null);
		}
		domainObject.setCCUnitBedConfiguration(valueObject.getCCUnitBedConfiguration());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCCAdmissionSource() != null && valueObject.getCCAdmissionSource().equals(""))
		{
			valueObject.setCCAdmissionSource(null);
		}
		domainObject.setCCAdmissionSource(valueObject.getCCAdmissionSource());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCCSourceLocation() != null && valueObject.getCCSourceLocation().equals(""))
		{
			valueObject.setCCSourceLocation(null);
		}
		domainObject.setCCSourceLocation(valueObject.getCCSourceLocation());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCCAdmissionType() != null && valueObject.getCCAdmissionType().equals(""))
		{
			valueObject.setCCAdmissionType(null);
		}
		domainObject.setCCAdmissionType(valueObject.getCCAdmissionType());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAdvRespiratorySupDays() != null && valueObject.getAdvRespiratorySupDays().equals(""))
		{
			valueObject.setAdvRespiratorySupDays(null);
		}
		domainObject.setAdvRespiratorySupDays(valueObject.getAdvRespiratorySupDays());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getBscRespiratorySupDays() != null && valueObject.getBscRespiratorySupDays().equals(""))
		{
			valueObject.setBscRespiratorySupDays(null);
		}
		domainObject.setBscRespiratorySupDays(valueObject.getBscRespiratorySupDays());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAdvCardioSupDays() != null && valueObject.getAdvCardioSupDays().equals(""))
		{
			valueObject.setAdvCardioSupDays(null);
		}
		domainObject.setAdvCardioSupDays(valueObject.getAdvCardioSupDays());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getBscCardioSupDays() != null && valueObject.getBscCardioSupDays().equals(""))
		{
			valueObject.setBscCardioSupDays(null);
		}
		domainObject.setBscCardioSupDays(valueObject.getBscCardioSupDays());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getRenalSupportDays() != null && valueObject.getRenalSupportDays().equals(""))
		{
			valueObject.setRenalSupportDays(null);
		}
		domainObject.setRenalSupportDays(valueObject.getRenalSupportDays());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNeuroSupportDays() != null && valueObject.getNeuroSupportDays().equals(""))
		{
			valueObject.setNeuroSupportDays(null);
		}
		domainObject.setNeuroSupportDays(valueObject.getNeuroSupportDays());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getGastroSupportDays() != null && valueObject.getGastroSupportDays().equals(""))
		{
			valueObject.setGastroSupportDays(null);
		}
		domainObject.setGastroSupportDays(valueObject.getGastroSupportDays());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDermaSupportDays() != null && valueObject.getDermaSupportDays().equals(""))
		{
			valueObject.setDermaSupportDays(null);
		}
		domainObject.setDermaSupportDays(valueObject.getDermaSupportDays());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLiverSupportDays() != null && valueObject.getLiverSupportDays().equals(""))
		{
			valueObject.setLiverSupportDays(null);
		}
		domainObject.setLiverSupportDays(valueObject.getLiverSupportDays());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOrganSupportMax() != null && valueObject.getOrganSupportMax().equals(""))
		{
			valueObject.setOrganSupportMax(null);
		}
		domainObject.setOrganSupportMax(valueObject.getOrganSupportMax());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCCLevel2Days() != null && valueObject.getCCLevel2Days().equals(""))
		{
			valueObject.setCCLevel2Days(null);
		}
		domainObject.setCCLevel2Days(valueObject.getCCLevel2Days());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCCLevel3Days() != null && valueObject.getCCLevel3Days().equals(""))
		{
			valueObject.setCCLevel3Days(null);
		}
		domainObject.setCCLevel3Days(valueObject.getCCLevel3Days());
		java.util.Date value77 = null;
		ims.framework.utils.Date date77 = valueObject.getCCDischargeDate();		
		if ( date77 != null ) 
		{
			value77 = date77.getDate();
		}
		domainObject.setCCDischargeDate(value77);
		ims.framework.utils.Time time78 = valueObject.getCCDischargeTime();
		String value78 = null;
		if ( time78 != null ) 
		{
			value78 = time78.toString();
		}
		domainObject.setCCDischargeTime(value78);
		java.util.Date value79 = null;
		ims.framework.utils.Date date79 = valueObject.getCCDischargeReadyDate();		
		if ( date79 != null ) 
		{
			value79 = date79.getDate();
		}
		domainObject.setCCDischargeReadyDate(value79);
		ims.framework.utils.Time time80 = valueObject.getCCDischargeReadyTime();
		String value80 = null;
		if ( time80 != null ) 
		{
			value80 = time80.toString();
		}
		domainObject.setCCDischargeReadyTime(value80);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCCDischargeStatus() != null && valueObject.getCCDischargeStatus().equals(""))
		{
			valueObject.setCCDischargeStatus(null);
		}
		domainObject.setCCDischargeStatus(valueObject.getCCDischargeStatus());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCCDischargeDest() != null && valueObject.getCCDischargeDest().equals(""))
		{
			valueObject.setCCDischargeDest(null);
		}
		domainObject.setCCDischargeDest(valueObject.getCCDischargeDest());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCCDischargeLocation() != null && valueObject.getCCDischargeLocation().equals(""))
		{
			valueObject.setCCDischargeLocation(null);
		}
		domainObject.setCCDischargeLocation(valueObject.getCCDischargeLocation());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getGPCode() != null && valueObject.getGPCode().equals(""))
		{
			valueObject.setGPCode(null);
		}
		domainObject.setGPCode(valueObject.getGPCode());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPracticeCode() != null && valueObject.getPracticeCode().equals(""))
		{
			valueObject.setPracticeCode(null);
		}
		domainObject.setPracticeCode(valueObject.getPracticeCode());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReferrerCode() != null && valueObject.getReferrerCode().equals(""))
		{
			valueObject.setReferrerCode(null);
		}
		domainObject.setReferrerCode(valueObject.getReferrerCode());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOrgCodeReferrer() != null && valueObject.getOrgCodeReferrer().equals(""))
		{
			valueObject.setOrgCodeReferrer(null);
		}
		domainObject.setOrgCodeReferrer(valueObject.getOrgCodeReferrer());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDurElectiveWait() != null && valueObject.getDurElectiveWait().equals(""))
		{
			valueObject.setDurElectiveWait(null);
		}
		domainObject.setDurElectiveWait(valueObject.getDurElectiveWait());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getIntendedManagement() != null && valueObject.getIntendedManagement().equals(""))
		{
			valueObject.setIntendedManagement(null);
		}
		domainObject.setIntendedManagement(valueObject.getIntendedManagement());
		java.util.Date value90 = null;
		ims.framework.utils.Date date90 = valueObject.getDecidedToAdmitDate();		
		if ( date90 != null ) 
		{
			value90 = date90.getDate();
		}
		domainObject.setDecidedToAdmitDate(value90);
		java.util.Date value91 = null;
		ims.framework.utils.Date date91 = valueObject.getERODate();		
		if ( date91 != null ) 
		{
			value91 = date91.getDate();
		}
		domainObject.setERODate(value91);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getResourceGrpCode() != null && valueObject.getResourceGrpCode().equals(""))
		{
			valueObject.setResourceGrpCode(null);
		}
		domainObject.setResourceGrpCode(valueObject.getResourceGrpCode());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getProcedureScheme() != null && valueObject.getProcedureScheme().equals(""))
		{
			valueObject.setProcedureScheme(null);
		}
		domainObject.setProcedureScheme(valueObject.getProcedureScheme());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getHrgDominantGrouping() != null && valueObject.getHrgDominantGrouping().equals(""))
		{
			valueObject.setHrgDominantGrouping(null);
		}
		domainObject.setHrgDominantGrouping(valueObject.getHrgDominantGrouping());
		ims.framework.utils.DateTime dateTime95 = valueObject.getCDSApplicableDate();
		java.util.Date value95 = null;
		if ( dateTime95 != null ) 
		{
			value95 = dateTime95.getJavaDate();
		}
		domainObject.setCDSApplicableDate(value95);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCDSSenderOrgCode() != null && valueObject.getCDSSenderOrgCode().equals(""))
		{
			valueObject.setCDSSenderOrgCode(null);
		}
		domainObject.setCDSSenderOrgCode(valueObject.getCDSSenderOrgCode());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getResourceGPVersion() != null && valueObject.getResourceGPVersion().equals(""))
		{
			valueObject.setResourceGPVersion(null);
		}
		domainObject.setResourceGPVersion(valueObject.getResourceGPVersion());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getMaritalStatus() != null && valueObject.getMaritalStatus().equals(""))
		{
			valueObject.setMaritalStatus(null);
		}
		domainObject.setMaritalStatus(valueObject.getMaritalStatus());

		return domainObject;
	}

}
