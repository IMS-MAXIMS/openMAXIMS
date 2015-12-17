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
 * @author Florin Blindu
 */
public class DementiaVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.DementiaVo copy(ims.clinical.vo.DementiaVo valueObjectDest, ims.clinical.vo.DementiaVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Dementia(valueObjectSrc.getID_Dementia());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// AdmissionDateTime
		valueObjectDest.setAdmissionDateTime(valueObjectSrc.getAdmissionDateTime());
		// BreachDateTime
		valueObjectDest.setBreachDateTime(valueObjectSrc.getBreachDateTime());
		// AgeOnAdmission
		valueObjectDest.setAgeOnAdmission(valueObjectSrc.getAgeOnAdmission());
		// DischargeDateTime
		valueObjectDest.setDischargeDateTime(valueObjectSrc.getDischargeDateTime());
		// CurrentWorklistStatus
		valueObjectDest.setCurrentWorklistStatus(valueObjectSrc.getCurrentWorklistStatus());
		// HistoricalWorklistStatus
		valueObjectDest.setHistoricalWorklistStatus(valueObjectSrc.getHistoricalWorklistStatus());
		// DementiaConfirmed
		valueObjectDest.setDementiaConfirmed(valueObjectSrc.getDementiaConfirmed());
		// DeliriumConfirmed
		valueObjectDest.setDeliriumConfirmed(valueObjectSrc.getDeliriumConfirmed());
		// AMTSScore
		valueObjectDest.setAMTSScore(valueObjectSrc.getAMTSScore());
		// StepOneFind
		valueObjectDest.setStepOneFind(valueObjectSrc.getStepOneFind());
		// StepTwoAssess
		valueObjectDest.setStepTwoAssess(valueObjectSrc.getStepTwoAssess());
		// ConfirmedPatientPutOnDementiaPathway
		valueObjectDest.setConfirmedPatientPutOnDementiaPathway(valueObjectSrc.getConfirmedPatientPutOnDementiaPathway());
		// AdmissionDetail
		valueObjectDest.setAdmissionDetail(valueObjectSrc.getAdmissionDetail());
		// isExcludedFromWorklist
		valueObjectDest.setIsExcludedFromWorklist(valueObjectSrc.getIsExcludedFromWorklist());
		// FollowUpAssessments
		valueObjectDest.setFollowUpAssessments(valueObjectSrc.getFollowUpAssessments());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createDementiaVoCollectionFromDementia(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.Dementia objects.
	 */
	public static ims.clinical.vo.DementiaVoCollection createDementiaVoCollectionFromDementia(java.util.Set domainObjectSet)	
	{
		return createDementiaVoCollectionFromDementia(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.Dementia objects.
	 */
	public static ims.clinical.vo.DementiaVoCollection createDementiaVoCollectionFromDementia(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.DementiaVoCollection voList = new ims.clinical.vo.DementiaVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.Dementia domainObject = (ims.core.clinical.domain.objects.Dementia) iterator.next();
			ims.clinical.vo.DementiaVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.Dementia objects.
	 */
	public static ims.clinical.vo.DementiaVoCollection createDementiaVoCollectionFromDementia(java.util.List domainObjectList) 
	{
		return createDementiaVoCollectionFromDementia(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.Dementia objects.
	 */
	public static ims.clinical.vo.DementiaVoCollection createDementiaVoCollectionFromDementia(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.DementiaVoCollection voList = new ims.clinical.vo.DementiaVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.Dementia domainObject = (ims.core.clinical.domain.objects.Dementia) domainObjectList.get(i);
			ims.clinical.vo.DementiaVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.Dementia set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractDementiaSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DementiaVoCollection voCollection) 
	 {
	 	return extractDementiaSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractDementiaSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DementiaVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.DementiaVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.Dementia domainObject = DementiaVoAssembler.extractDementia(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.Dementia list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractDementiaList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DementiaVoCollection voCollection) 
	 {
	 	return extractDementiaList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractDementiaList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DementiaVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.DementiaVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.Dementia domainObject = DementiaVoAssembler.extractDementia(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.Dementia object.
	 * @param domainObject ims.core.clinical.domain.objects.Dementia
	 */
	 public static ims.clinical.vo.DementiaVo create(ims.core.clinical.domain.objects.Dementia domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.Dementia object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.DementiaVo create(DomainObjectMap map, ims.core.clinical.domain.objects.Dementia domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.DementiaVo valueObject = (ims.clinical.vo.DementiaVo) map.getValueObject(domainObject, ims.clinical.vo.DementiaVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.DementiaVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.Dementia
	 */
	 public static ims.clinical.vo.DementiaVo insert(ims.clinical.vo.DementiaVo valueObject, ims.core.clinical.domain.objects.Dementia domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.Dementia
	 */
	 public static ims.clinical.vo.DementiaVo insert(DomainObjectMap map, ims.clinical.vo.DementiaVo valueObject, ims.core.clinical.domain.objects.Dementia domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Dementia(domainObject.getId());
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
			
		// patient
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
		// AdmissionDateTime
		java.util.Date AdmissionDateTime = domainObject.getAdmissionDateTime();
		if ( null != AdmissionDateTime ) 
		{
			valueObject.setAdmissionDateTime(new ims.framework.utils.DateTime(AdmissionDateTime) );
		}
		// BreachDateTime
		java.util.Date BreachDateTime = domainObject.getBreachDateTime();
		if ( null != BreachDateTime ) 
		{
			valueObject.setBreachDateTime(new ims.framework.utils.DateTime(BreachDateTime) );
		}
		// AgeOnAdmission
		valueObject.setAgeOnAdmission(domainObject.getAgeOnAdmission());
		// DischargeDateTime
		java.util.Date DischargeDateTime = domainObject.getDischargeDateTime();
		if ( null != DischargeDateTime ) 
		{
			valueObject.setDischargeDateTime(new ims.framework.utils.DateTime(DischargeDateTime) );
		}
		// CurrentWorklistStatus
		valueObject.setCurrentWorklistStatus(ims.clinical.vo.domain.DementiaWorklistStatusVoAssembler.create(map, domainObject.getCurrentWorklistStatus()) );
		// HistoricalWorklistStatus
		valueObject.setHistoricalWorklistStatus(ims.clinical.vo.domain.DementiaWorklistStatusVoAssembler.createDementiaWorklistStatusVoCollectionFromDementiaWorklistStatus(map, domainObject.getHistoricalWorklistStatus()) );
		// DementiaConfirmed
		valueObject.setDementiaConfirmed( domainObject.isDementiaConfirmed() );
		// DeliriumConfirmed
		valueObject.setDeliriumConfirmed( domainObject.isDeliriumConfirmed() );
		// AMTSScore
		valueObject.setAMTSScore(domainObject.getAMTSScore());
		// StepOneFind
		valueObject.setStepOneFind(ims.clinical.vo.domain.DementiaFindVoAssembler.create(map, domainObject.getStepOneFind()) );
		// StepTwoAssess
		valueObject.setStepTwoAssess(ims.clinical.vo.domain.DementiaAssessAndInvestigateVoAssembler.create(map, domainObject.getStepTwoAssess()) );
		// ConfirmedPatientPutOnDementiaPathway
		valueObject.setConfirmedPatientPutOnDementiaPathway( domainObject.isConfirmedPatientPutOnDementiaPathway() );
		// AdmissionDetail
		if (domainObject.getAdmissionDetail() != null)
		{
			if(domainObject.getAdmissionDetail() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAdmissionDetail();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAdmissionDetail(new ims.core.admin.pas.vo.AdmissionDetailRefVo(id, -1));				
			}
			else
			{
				valueObject.setAdmissionDetail(new ims.core.admin.pas.vo.AdmissionDetailRefVo(domainObject.getAdmissionDetail().getId(), domainObject.getAdmissionDetail().getVersion()));
			}
		}
		// isExcludedFromWorklist
		valueObject.setIsExcludedFromWorklist( domainObject.isIsExcludedFromWorklist() );
		// FollowUpAssessments
		valueObject.setFollowUpAssessments(ims.clinical.vo.domain.DementiaAssessAndInvestigateVoAssembler.createDementiaAssessAndInvestigateVoCollectionFromDementiaAssessAndInvestigate(map, domainObject.getFollowUpAssessments()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.Dementia extractDementia(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DementiaVo valueObject) 
	{
		return 	extractDementia(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.Dementia extractDementia(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DementiaVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Dementia();
		ims.core.clinical.domain.objects.Dementia domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.Dementia)domMap.get(valueObject);
			}
			// ims.clinical.vo.DementiaVo ID_Dementia field is unknown
			domainObject = new ims.core.clinical.domain.objects.Dementia();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Dementia());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.Dementia)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.Dementia) domainFactory.getDomainObject(ims.core.clinical.domain.objects.Dementia.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Dementia());

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
		ims.framework.utils.DateTime dateTime2 = valueObject.getAdmissionDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setAdmissionDateTime(value2);
		ims.framework.utils.DateTime dateTime3 = valueObject.getBreachDateTime();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setBreachDateTime(value3);
		domainObject.setAgeOnAdmission(valueObject.getAgeOnAdmission());
		ims.framework.utils.DateTime dateTime5 = valueObject.getDischargeDateTime();
		java.util.Date value5 = null;
		if ( dateTime5 != null ) 
		{
			value5 = dateTime5.getJavaDate();
		}
		domainObject.setDischargeDateTime(value5);
		domainObject.setCurrentWorklistStatus(ims.clinical.vo.domain.DementiaWorklistStatusVoAssembler.extractDementiaWorklistStatus(domainFactory, valueObject.getCurrentWorklistStatus(), domMap));
		domainObject.setHistoricalWorklistStatus(ims.clinical.vo.domain.DementiaWorklistStatusVoAssembler.extractDementiaWorklistStatusList(domainFactory, valueObject.getHistoricalWorklistStatus(), domainObject.getHistoricalWorklistStatus(), domMap));		
		domainObject.setDementiaConfirmed(valueObject.getDementiaConfirmed());
		domainObject.setDeliriumConfirmed(valueObject.getDeliriumConfirmed());
		domainObject.setAMTSScore(valueObject.getAMTSScore());
		domainObject.setStepOneFind(ims.clinical.vo.domain.DementiaFindVoAssembler.extractDementiaFind(domainFactory, valueObject.getStepOneFind(), domMap));
		domainObject.setStepTwoAssess(ims.clinical.vo.domain.DementiaAssessAndInvestigateVoAssembler.extractDementiaAssessAndInvestigate(domainFactory, valueObject.getStepTwoAssess(), domMap));
		domainObject.setConfirmedPatientPutOnDementiaPathway(valueObject.getConfirmedPatientPutOnDementiaPathway());
		ims.core.admin.pas.domain.objects.AdmissionDetail value14 = null;
		if ( null != valueObject.getAdmissionDetail() ) 
		{
			if (valueObject.getAdmissionDetail().getBoId() == null)
			{
				if (domMap.get(valueObject.getAdmissionDetail()) != null)
				{
					value14 = (ims.core.admin.pas.domain.objects.AdmissionDetail)domMap.get(valueObject.getAdmissionDetail());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value14 = domainObject.getAdmissionDetail();	
			}
			else
			{
				value14 = (ims.core.admin.pas.domain.objects.AdmissionDetail)domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.AdmissionDetail.class, valueObject.getAdmissionDetail().getBoId());
			}
		}
		domainObject.setAdmissionDetail(value14);
		domainObject.setIsExcludedFromWorklist(valueObject.getIsExcludedFromWorklist());
		domainObject.setFollowUpAssessments(ims.clinical.vo.domain.DementiaAssessAndInvestigateVoAssembler.extractDementiaAssessAndInvestigateList(domainFactory, valueObject.getFollowUpAssessments(), domainObject.getFollowUpAssessments(), domMap));		

		return domainObject;
	}

}
