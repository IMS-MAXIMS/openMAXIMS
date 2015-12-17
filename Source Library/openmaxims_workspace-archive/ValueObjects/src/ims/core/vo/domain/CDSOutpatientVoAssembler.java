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
public class CDSOutpatientVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.CDSOutpatientVo copy(ims.core.vo.CDSOutpatientVo valueObjectDest, ims.core.vo.CDSOutpatientVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CDSOutpatient(valueObjectSrc.getID_CDSOutpatient());
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
		// ConsultantCode
		valueObjectDest.setConsultantCode(valueObjectSrc.getConsultantCode());
		// SpecialtyCode
		valueObjectDest.setSpecialtyCode(valueObjectSrc.getSpecialtyCode());
		// TreatmentFuncCode
		valueObjectDest.setTreatmentFuncCode(valueObjectSrc.getTreatmentFuncCode());
		// ICDDiagGroup
		valueObjectDest.setICDDiagGroup(valueObjectSrc.getICDDiagGroup());
		// ReadDiagGroup
		valueObjectDest.setReadDiagGroup(valueObjectSrc.getReadDiagGroup());
		// AttendanceIdentifier
		valueObjectDest.setAttendanceIdentifier(valueObjectSrc.getAttendanceIdentifier());
		// AdminCategory
		valueObjectDest.setAdminCategory(valueObjectSrc.getAdminCategory());
		// AttendedOrDNA
		valueObjectDest.setAttendedOrDNA(valueObjectSrc.getAttendedOrDNA());
		// FirstAttendance
		valueObjectDest.setFirstAttendance(valueObjectSrc.getFirstAttendance());
		// MedStaffType
		valueObjectDest.setMedStaffType(valueObjectSrc.getMedStaffType());
		// OperationStatus
		valueObjectDest.setOperationStatus(valueObjectSrc.getOperationStatus());
		// AttendOutcome
		valueObjectDest.setAttendOutcome(valueObjectSrc.getAttendOutcome());
		// ApptDate
		valueObjectDest.setApptDate(valueObjectSrc.getApptDate());
		// Age
		valueObjectDest.setAge(valueObjectSrc.getAge());
		// EarliestOfferDate
		valueObjectDest.setEarliestOfferDate(valueObjectSrc.getEarliestOfferDate());
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
		// OPCSProcedure
		valueObjectDest.setOPCSProcedure(valueObjectSrc.getOPCSProcedure());
		// READProcedure
		valueObjectDest.setREADProcedure(valueObjectSrc.getREADProcedure());
		// LocationClass
		valueObjectDest.setLocationClass(valueObjectSrc.getLocationClass());
		// SiteCodeTreatment
		valueObjectDest.setSiteCodeTreatment(valueObjectSrc.getSiteCodeTreatment());
		// GPCode
		valueObjectDest.setGPCode(valueObjectSrc.getGPCode());
		// PracticeCode
		valueObjectDest.setPracticeCode(valueObjectSrc.getPracticeCode());
		// PriorityType
		valueObjectDest.setPriorityType(valueObjectSrc.getPriorityType());
		// ServiceTypeReq
		valueObjectDest.setServiceTypeReq(valueObjectSrc.getServiceTypeReq());
		// ReferralSource
		valueObjectDest.setReferralSource(valueObjectSrc.getReferralSource());
		// ReferralReceivedDate
		valueObjectDest.setReferralReceivedDate(valueObjectSrc.getReferralReceivedDate());
		// ReferrerCode
		valueObjectDest.setReferrerCode(valueObjectSrc.getReferrerCode());
		// OrgCodeReferrer
		valueObjectDest.setOrgCodeReferrer(valueObjectSrc.getOrgCodeReferrer());
		// LastDNACancelDate
		valueObjectDest.setLastDNACancelDate(valueObjectSrc.getLastDNACancelDate());
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
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCDSOutpatientVoCollectionFromCDSOutpatient(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.cds.domain.objects.CDSOutpatient objects.
	 */
	public static ims.core.vo.CDSOutpatientVoCollection createCDSOutpatientVoCollectionFromCDSOutpatient(java.util.Set domainObjectSet)	
	{
		return createCDSOutpatientVoCollectionFromCDSOutpatient(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.cds.domain.objects.CDSOutpatient objects.
	 */
	public static ims.core.vo.CDSOutpatientVoCollection createCDSOutpatientVoCollectionFromCDSOutpatient(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.CDSOutpatientVoCollection voList = new ims.core.vo.CDSOutpatientVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.cds.domain.objects.CDSOutpatient domainObject = (ims.core.cds.domain.objects.CDSOutpatient) iterator.next();
			ims.core.vo.CDSOutpatientVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.cds.domain.objects.CDSOutpatient objects.
	 */
	public static ims.core.vo.CDSOutpatientVoCollection createCDSOutpatientVoCollectionFromCDSOutpatient(java.util.List domainObjectList) 
	{
		return createCDSOutpatientVoCollectionFromCDSOutpatient(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.cds.domain.objects.CDSOutpatient objects.
	 */
	public static ims.core.vo.CDSOutpatientVoCollection createCDSOutpatientVoCollectionFromCDSOutpatient(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.CDSOutpatientVoCollection voList = new ims.core.vo.CDSOutpatientVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.cds.domain.objects.CDSOutpatient domainObject = (ims.core.cds.domain.objects.CDSOutpatient) domainObjectList.get(i);
			ims.core.vo.CDSOutpatientVo vo = create(map, domainObject);

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
	 * Create the ims.core.cds.domain.objects.CDSOutpatient set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractCDSOutpatientSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CDSOutpatientVoCollection voCollection) 
	 {
	 	return extractCDSOutpatientSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCDSOutpatientSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CDSOutpatientVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.CDSOutpatientVo vo = voCollection.get(i);
			ims.core.cds.domain.objects.CDSOutpatient domainObject = CDSOutpatientVoAssembler.extractCDSOutpatient(domainFactory, vo, domMap);

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
	 * Create the ims.core.cds.domain.objects.CDSOutpatient list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractCDSOutpatientList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CDSOutpatientVoCollection voCollection) 
	 {
	 	return extractCDSOutpatientList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCDSOutpatientList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CDSOutpatientVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.CDSOutpatientVo vo = voCollection.get(i);
			ims.core.cds.domain.objects.CDSOutpatient domainObject = CDSOutpatientVoAssembler.extractCDSOutpatient(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.cds.domain.objects.CDSOutpatient object.
	 * @param domainObject ims.core.cds.domain.objects.CDSOutpatient
	 */
	 public static ims.core.vo.CDSOutpatientVo create(ims.core.cds.domain.objects.CDSOutpatient domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.cds.domain.objects.CDSOutpatient object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.CDSOutpatientVo create(DomainObjectMap map, ims.core.cds.domain.objects.CDSOutpatient domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.CDSOutpatientVo valueObject = (ims.core.vo.CDSOutpatientVo) map.getValueObject(domainObject, ims.core.vo.CDSOutpatientVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.CDSOutpatientVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.cds.domain.objects.CDSOutpatient
	 */
	 public static ims.core.vo.CDSOutpatientVo insert(ims.core.vo.CDSOutpatientVo valueObject, ims.core.cds.domain.objects.CDSOutpatient domainObject) 
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
	 * @param domainObject ims.core.cds.domain.objects.CDSOutpatient
	 */
	 public static ims.core.vo.CDSOutpatientVo insert(DomainObjectMap map, ims.core.vo.CDSOutpatientVo valueObject, ims.core.cds.domain.objects.CDSOutpatient domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_CDSOutpatient(domainObject.getId());
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
		// ConsultantCode
		valueObject.setConsultantCode(domainObject.getConsultantCode());
		// SpecialtyCode
		valueObject.setSpecialtyCode(domainObject.getSpecialtyCode());
		// TreatmentFuncCode
		valueObject.setTreatmentFuncCode(domainObject.getTreatmentFuncCode());
		// ICDDiagGroup
		ims.core.cds.vo.CDSDiagnosisDetailsRefVoCollection ICDDiagGroup = new ims.core.cds.vo.CDSDiagnosisDetailsRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getICDDiagGroup().iterator(); iterator.hasNext(); ) 
		{
			ims.core.cds.domain.objects.CDSDiagnosisDetails tmp = (ims.core.cds.domain.objects.CDSDiagnosisDetails)iterator.next();
			if (tmp != null)
				ICDDiagGroup.add(new ims.core.cds.vo.CDSDiagnosisDetailsRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setICDDiagGroup(ICDDiagGroup);
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
		// AttendanceIdentifier
		valueObject.setAttendanceIdentifier(domainObject.getAttendanceIdentifier());
		// AdminCategory
		valueObject.setAdminCategory(domainObject.getAdminCategory());
		// AttendedOrDNA
		valueObject.setAttendedOrDNA(domainObject.getAttendedOrDNA());
		// FirstAttendance
		valueObject.setFirstAttendance(domainObject.getFirstAttendance());
		// MedStaffType
		valueObject.setMedStaffType(domainObject.getMedStaffType());
		// OperationStatus
		valueObject.setOperationStatus(domainObject.getOperationStatus());
		// AttendOutcome
		valueObject.setAttendOutcome(domainObject.getAttendOutcome());
		// ApptDate
		java.util.Date ApptDate = domainObject.getApptDate();
		if ( null != ApptDate ) 
		{
			valueObject.setApptDate(new ims.framework.utils.Date(ApptDate) );
		}
		// Age
		valueObject.setAge(domainObject.getAge());
		// EarliestOfferDate
		java.util.Date EarliestOfferDate = domainObject.getEarliestOfferDate();
		if ( null != EarliestOfferDate ) 
		{
			valueObject.setEarliestOfferDate(new ims.framework.utils.Date(EarliestOfferDate) );
		}
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
		// OPCSProcedure
		ims.core.cds.vo.CDSProcedureDetailsRefVoCollection OPCSProcedure = new ims.core.cds.vo.CDSProcedureDetailsRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getOPCSProcedure().iterator(); iterator.hasNext(); ) 
		{
			ims.core.cds.domain.objects.CDSProcedureDetails tmp = (ims.core.cds.domain.objects.CDSProcedureDetails)iterator.next();
			if (tmp != null)
				OPCSProcedure.add(new ims.core.cds.vo.CDSProcedureDetailsRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setOPCSProcedure(OPCSProcedure);
		// READProcedure
		if (domainObject.getREADProcedure() != null)
		{
			if(domainObject.getREADProcedure() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getREADProcedure();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setREADProcedure(new ims.core.cds.vo.CDSProcedureDetailsRefVo(id, -1));				
			}
			else
			{
				valueObject.setREADProcedure(new ims.core.cds.vo.CDSProcedureDetailsRefVo(domainObject.getREADProcedure().getId(), domainObject.getREADProcedure().getVersion()));
			}
		}
		// LocationClass
		valueObject.setLocationClass(domainObject.getLocationClass());
		// SiteCodeTreatment
		valueObject.setSiteCodeTreatment(domainObject.getSiteCodeTreatment());
		// GPCode
		valueObject.setGPCode(domainObject.getGPCode());
		// PracticeCode
		valueObject.setPracticeCode(domainObject.getPracticeCode());
		// PriorityType
		valueObject.setPriorityType(domainObject.getPriorityType());
		// ServiceTypeReq
		valueObject.setServiceTypeReq(domainObject.getServiceTypeReq());
		// ReferralSource
		valueObject.setReferralSource(domainObject.getReferralSource());
		// ReferralReceivedDate
		java.util.Date ReferralReceivedDate = domainObject.getReferralReceivedDate();
		if ( null != ReferralReceivedDate ) 
		{
			valueObject.setReferralReceivedDate(new ims.framework.utils.Date(ReferralReceivedDate) );
		}
		// ReferrerCode
		valueObject.setReferrerCode(domainObject.getReferrerCode());
		// OrgCodeReferrer
		valueObject.setOrgCodeReferrer(domainObject.getOrgCodeReferrer());
		// LastDNACancelDate
		java.util.Date LastDNACancelDate = domainObject.getLastDNACancelDate();
		if ( null != LastDNACancelDate ) 
		{
			valueObject.setLastDNACancelDate(new ims.framework.utils.Date(LastDNACancelDate) );
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
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.cds.domain.objects.CDSOutpatient extractCDSOutpatient(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CDSOutpatientVo valueObject) 
	{
		return 	extractCDSOutpatient(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.cds.domain.objects.CDSOutpatient extractCDSOutpatient(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CDSOutpatientVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_CDSOutpatient();
		ims.core.cds.domain.objects.CDSOutpatient domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.cds.domain.objects.CDSOutpatient)domMap.get(valueObject);
			}
			// ims.core.vo.CDSOutpatientVo ID_CDSOutpatient field is unknown
			domainObject = new ims.core.cds.domain.objects.CDSOutpatient();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_CDSOutpatient());
			if (domMap.get(key) != null)
			{
				return (ims.core.cds.domain.objects.CDSOutpatient)domMap.get(key);
			}
			domainObject = (ims.core.cds.domain.objects.CDSOutpatient) domainFactory.getDomainObject(ims.core.cds.domain.objects.CDSOutpatient.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_CDSOutpatient());

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

		ims.core.cds.vo.CDSDiagnosisDetailsRefVoCollection refCollection23 = valueObject.getICDDiagGroup();
		int size23 = (null == refCollection23) ? 0 : refCollection23.size();		
		java.util.List domainICDDiagGroup23 = domainObject.getICDDiagGroup();
		if (domainICDDiagGroup23 == null)
		{
			domainICDDiagGroup23 = new java.util.ArrayList();
		}
		for(int i=0; i < size23; i++) 
		{
			ims.core.cds.vo.CDSDiagnosisDetailsRefVo vo = refCollection23.get(i);			
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

			int domIdx = domainICDDiagGroup23.indexOf(dom);
			if (domIdx == -1)
			{
				domainICDDiagGroup23.add(i, dom);
			}
			else if (i != domIdx && i < domainICDDiagGroup23.size())
			{
				Object tmp = domainICDDiagGroup23.get(i);
				domainICDDiagGroup23.set(i, domainICDDiagGroup23.get(domIdx));
				domainICDDiagGroup23.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i23 = domainICDDiagGroup23.size();
		while (i23 > size23)
		{
			domainICDDiagGroup23.remove(i23-1);
			i23 = domainICDDiagGroup23.size();
		}
		
		domainObject.setICDDiagGroup(domainICDDiagGroup23);		
		ims.core.cds.domain.objects.CDSDiagnosisDetails value24 = null;
		if ( null != valueObject.getReadDiagGroup() ) 
		{
			if (valueObject.getReadDiagGroup().getBoId() == null)
			{
				if (domMap.get(valueObject.getReadDiagGroup()) != null)
				{
					value24 = (ims.core.cds.domain.objects.CDSDiagnosisDetails)domMap.get(valueObject.getReadDiagGroup());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value24 = domainObject.getReadDiagGroup();	
			}
			else
			{
				value24 = (ims.core.cds.domain.objects.CDSDiagnosisDetails)domainFactory.getDomainObject(ims.core.cds.domain.objects.CDSDiagnosisDetails.class, valueObject.getReadDiagGroup().getBoId());
			}
		}
		domainObject.setReadDiagGroup(value24);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAttendanceIdentifier() != null && valueObject.getAttendanceIdentifier().equals(""))
		{
			valueObject.setAttendanceIdentifier(null);
		}
		domainObject.setAttendanceIdentifier(valueObject.getAttendanceIdentifier());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAdminCategory() != null && valueObject.getAdminCategory().equals(""))
		{
			valueObject.setAdminCategory(null);
		}
		domainObject.setAdminCategory(valueObject.getAdminCategory());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAttendedOrDNA() != null && valueObject.getAttendedOrDNA().equals(""))
		{
			valueObject.setAttendedOrDNA(null);
		}
		domainObject.setAttendedOrDNA(valueObject.getAttendedOrDNA());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getFirstAttendance() != null && valueObject.getFirstAttendance().equals(""))
		{
			valueObject.setFirstAttendance(null);
		}
		domainObject.setFirstAttendance(valueObject.getFirstAttendance());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getMedStaffType() != null && valueObject.getMedStaffType().equals(""))
		{
			valueObject.setMedStaffType(null);
		}
		domainObject.setMedStaffType(valueObject.getMedStaffType());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOperationStatus() != null && valueObject.getOperationStatus().equals(""))
		{
			valueObject.setOperationStatus(null);
		}
		domainObject.setOperationStatus(valueObject.getOperationStatus());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAttendOutcome() != null && valueObject.getAttendOutcome().equals(""))
		{
			valueObject.setAttendOutcome(null);
		}
		domainObject.setAttendOutcome(valueObject.getAttendOutcome());
		java.util.Date value32 = null;
		ims.framework.utils.Date date32 = valueObject.getApptDate();		
		if ( date32 != null ) 
		{
			value32 = date32.getDate();
		}
		domainObject.setApptDate(value32);
		domainObject.setAge(valueObject.getAge());
		java.util.Date value34 = null;
		ims.framework.utils.Date date34 = valueObject.getEarliestOfferDate();		
		if ( date34 != null ) 
		{
			value34 = date34.getDate();
		}
		domainObject.setEarliestOfferDate(value34);
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

		ims.core.cds.vo.CDSProcedureDetailsRefVoCollection refCollection41 = valueObject.getOPCSProcedure();
		int size41 = (null == refCollection41) ? 0 : refCollection41.size();		
		java.util.List domainOPCSProcedure41 = domainObject.getOPCSProcedure();
		if (domainOPCSProcedure41 == null)
		{
			domainOPCSProcedure41 = new java.util.ArrayList();
		}
		for(int i=0; i < size41; i++) 
		{
			ims.core.cds.vo.CDSProcedureDetailsRefVo vo = refCollection41.get(i);			
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

			int domIdx = domainOPCSProcedure41.indexOf(dom);
			if (domIdx == -1)
			{
				domainOPCSProcedure41.add(i, dom);
			}
			else if (i != domIdx && i < domainOPCSProcedure41.size())
			{
				Object tmp = domainOPCSProcedure41.get(i);
				domainOPCSProcedure41.set(i, domainOPCSProcedure41.get(domIdx));
				domainOPCSProcedure41.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i41 = domainOPCSProcedure41.size();
		while (i41 > size41)
		{
			domainOPCSProcedure41.remove(i41-1);
			i41 = domainOPCSProcedure41.size();
		}
		
		domainObject.setOPCSProcedure(domainOPCSProcedure41);		
		ims.core.cds.domain.objects.CDSProcedureDetails value42 = null;
		if ( null != valueObject.getREADProcedure() ) 
		{
			if (valueObject.getREADProcedure().getBoId() == null)
			{
				if (domMap.get(valueObject.getREADProcedure()) != null)
				{
					value42 = (ims.core.cds.domain.objects.CDSProcedureDetails)domMap.get(valueObject.getREADProcedure());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value42 = domainObject.getREADProcedure();	
			}
			else
			{
				value42 = (ims.core.cds.domain.objects.CDSProcedureDetails)domainFactory.getDomainObject(ims.core.cds.domain.objects.CDSProcedureDetails.class, valueObject.getREADProcedure().getBoId());
			}
		}
		domainObject.setREADProcedure(value42);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLocationClass() != null && valueObject.getLocationClass().equals(""))
		{
			valueObject.setLocationClass(null);
		}
		domainObject.setLocationClass(valueObject.getLocationClass());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSiteCodeTreatment() != null && valueObject.getSiteCodeTreatment().equals(""))
		{
			valueObject.setSiteCodeTreatment(null);
		}
		domainObject.setSiteCodeTreatment(valueObject.getSiteCodeTreatment());
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
		if (valueObject.getPriorityType() != null && valueObject.getPriorityType().equals(""))
		{
			valueObject.setPriorityType(null);
		}
		domainObject.setPriorityType(valueObject.getPriorityType());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getServiceTypeReq() != null && valueObject.getServiceTypeReq().equals(""))
		{
			valueObject.setServiceTypeReq(null);
		}
		domainObject.setServiceTypeReq(valueObject.getServiceTypeReq());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReferralSource() != null && valueObject.getReferralSource().equals(""))
		{
			valueObject.setReferralSource(null);
		}
		domainObject.setReferralSource(valueObject.getReferralSource());
		java.util.Date value50 = null;
		ims.framework.utils.Date date50 = valueObject.getReferralReceivedDate();		
		if ( date50 != null ) 
		{
			value50 = date50.getDate();
		}
		domainObject.setReferralReceivedDate(value50);
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
		java.util.Date value53 = null;
		ims.framework.utils.Date date53 = valueObject.getLastDNACancelDate();		
		if ( date53 != null ) 
		{
			value53 = date53.getDate();
		}
		domainObject.setLastDNACancelDate(value53);
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
		ims.framework.utils.DateTime dateTime57 = valueObject.getCDSApplicableDate();
		java.util.Date value57 = null;
		if ( dateTime57 != null ) 
		{
			value57 = dateTime57.getJavaDate();
		}
		domainObject.setCDSApplicableDate(value57);
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

		return domainObject;
	}

}
