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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class PatientDiagnosisEDischargeVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PatientDiagnosisEDischargeVo copy(ims.core.vo.PatientDiagnosisEDischargeVo valueObjectDest, ims.core.vo.PatientDiagnosisEDischargeVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientDiagnosis(valueObjectSrc.getID_PatientDiagnosis());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// StatusHistory
		valueObjectDest.setStatusHistory(valueObjectSrc.getStatusHistory());
		// DiagnosisDescription
		valueObjectDest.setDiagnosisDescription(valueObjectSrc.getDiagnosisDescription());
		// DiagnosedDate
		valueObjectDest.setDiagnosedDate(valueObjectSrc.getDiagnosedDate());
		// Diagnosis
		valueObjectDest.setDiagnosis(valueObjectSrc.getDiagnosis());
		// SourceofInformation
		valueObjectDest.setSourceofInformation(valueObjectSrc.getSourceofInformation());
		// isComplication
		valueObjectDest.setIsComplication(valueObjectSrc.getIsComplication());
		// isComorbidity
		valueObjectDest.setIsComorbidity(valueObjectSrc.getIsComorbidity());
		// DateResolved
		valueObjectDest.setDateResolved(valueObjectSrc.getDateResolved());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// DiagLaterality
		valueObjectDest.setDiagLaterality(valueObjectSrc.getDiagLaterality());
		// SiteText
		valueObjectDest.setSiteText(valueObjectSrc.getSiteText());
		// AuthoringInfo
		valueObjectDest.setAuthoringInfo(valueObjectSrc.getAuthoringInfo());
		// IncludeDiagnosisInDiscReports
		valueObjectDest.setIncludeDiagnosisInDiscReports(valueObjectSrc.getIncludeDiagnosisInDiscReports());
		// isPrevRelevantDiagnosis
		valueObjectDest.setIsPrevRelevantDiagnosis(valueObjectSrc.getIsPrevRelevantDiagnosis());
		// SysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
		// DateOnset
		valueObjectDest.setDateOnset(valueObjectSrc.getDateOnset());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// PrimaryForCareSpells
		valueObjectDest.setPrimaryForCareSpells(valueObjectSrc.getPrimaryForCareSpells());
		// CoMorbidityForEpisodeOfCares
		valueObjectDest.setCoMorbidityForEpisodeOfCares(valueObjectSrc.getCoMorbidityForEpisodeOfCares());
		// EpisodeOfCare
		valueObjectDest.setEpisodeOfCare(valueObjectSrc.getEpisodeOfCare());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientDiagnosisEDischargeVoCollectionFromPatientDiagnosis(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientDiagnosis objects.
	 */
	public static ims.core.vo.PatientDiagnosisEDischargeVoCollection createPatientDiagnosisEDischargeVoCollectionFromPatientDiagnosis(java.util.Set domainObjectSet)	
	{
		return createPatientDiagnosisEDischargeVoCollectionFromPatientDiagnosis(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientDiagnosis objects.
	 */
	public static ims.core.vo.PatientDiagnosisEDischargeVoCollection createPatientDiagnosisEDischargeVoCollectionFromPatientDiagnosis(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatientDiagnosisEDischargeVoCollection voList = new ims.core.vo.PatientDiagnosisEDischargeVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.PatientDiagnosis domainObject = (ims.core.clinical.domain.objects.PatientDiagnosis) iterator.next();
			ims.core.vo.PatientDiagnosisEDischargeVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientDiagnosis objects.
	 */
	public static ims.core.vo.PatientDiagnosisEDischargeVoCollection createPatientDiagnosisEDischargeVoCollectionFromPatientDiagnosis(java.util.List domainObjectList) 
	{
		return createPatientDiagnosisEDischargeVoCollectionFromPatientDiagnosis(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientDiagnosis objects.
	 */
	public static ims.core.vo.PatientDiagnosisEDischargeVoCollection createPatientDiagnosisEDischargeVoCollectionFromPatientDiagnosis(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatientDiagnosisEDischargeVoCollection voList = new ims.core.vo.PatientDiagnosisEDischargeVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.PatientDiagnosis domainObject = (ims.core.clinical.domain.objects.PatientDiagnosis) domainObjectList.get(i);
			ims.core.vo.PatientDiagnosisEDischargeVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.PatientDiagnosis set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientDiagnosisSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientDiagnosisEDischargeVoCollection voCollection) 
	 {
	 	return extractPatientDiagnosisSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientDiagnosisSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientDiagnosisEDischargeVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientDiagnosisEDischargeVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientDiagnosis domainObject = PatientDiagnosisEDischargeVoAssembler.extractPatientDiagnosis(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.PatientDiagnosis list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientDiagnosisList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientDiagnosisEDischargeVoCollection voCollection) 
	 {
	 	return extractPatientDiagnosisList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientDiagnosisList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientDiagnosisEDischargeVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientDiagnosisEDischargeVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientDiagnosis domainObject = PatientDiagnosisEDischargeVoAssembler.extractPatientDiagnosis(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.PatientDiagnosis object.
	 * @param domainObject ims.core.clinical.domain.objects.PatientDiagnosis
	 */
	 public static ims.core.vo.PatientDiagnosisEDischargeVo create(ims.core.clinical.domain.objects.PatientDiagnosis domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.PatientDiagnosis object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PatientDiagnosisEDischargeVo create(DomainObjectMap map, ims.core.clinical.domain.objects.PatientDiagnosis domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PatientDiagnosisEDischargeVo valueObject = (ims.core.vo.PatientDiagnosisEDischargeVo) map.getValueObject(domainObject, ims.core.vo.PatientDiagnosisEDischargeVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PatientDiagnosisEDischargeVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.PatientDiagnosis
	 */
	 public static ims.core.vo.PatientDiagnosisEDischargeVo insert(ims.core.vo.PatientDiagnosisEDischargeVo valueObject, ims.core.clinical.domain.objects.PatientDiagnosis domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.PatientDiagnosis
	 */
	 public static ims.core.vo.PatientDiagnosisEDischargeVo insert(DomainObjectMap map, ims.core.vo.PatientDiagnosisEDischargeVo valueObject, ims.core.clinical.domain.objects.PatientDiagnosis domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientDiagnosis(domainObject.getId());
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
			
		// StatusHistory
		valueObject.setStatusHistory(ims.clinical.vo.domain.PatientDiagnosisStatusVoAssembler.createPatientDiagnosisStatusVoCollectionFromPatientDiagnosisStatus(map, domainObject.getStatusHistory()) );
		// DiagnosisDescription
		valueObject.setDiagnosisDescription(domainObject.getDiagnosisDescription());
		// DiagnosedDate
		Integer DiagnosedDate = domainObject.getDiagnosedDate();
		if ( null != DiagnosedDate ) 
		{
			valueObject.setDiagnosedDate(new ims.framework.utils.PartialDate(DiagnosedDate) );
		}
		// Diagnosis
		valueObject.setDiagnosis(ims.core.vo.domain.DiagLiteVoAssembler.create(map, domainObject.getDiagnosis()) );
		// SourceofInformation
		ims.domain.lookups.LookupInstance instance5 = domainObject.getSourceofInformation();
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

			ims.core.vo.lookups.SourceofInformation voLookup5 = new ims.core.vo.lookups.SourceofInformation(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.SourceofInformation parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.SourceofInformation(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setSourceofInformation(voLookup5);
		}
				// isComplication
		valueObject.setIsComplication( domainObject.isIsComplication() );
		// isComorbidity
		valueObject.setIsComorbidity( domainObject.isIsComorbidity() );
		// DateResolved
		java.util.Date DateResolved = domainObject.getDateResolved();
		if ( null != DateResolved ) 
		{
			valueObject.setDateResolved(new ims.framework.utils.Date(DateResolved) );
		}
		// CareContext
		valueObject.setCareContext(ims.core.vo.domain.CareContextForEdischargeDiagnosisVoAssembler.create(map, domainObject.getCareContext()) );
		// DiagLaterality
		ims.domain.lookups.LookupInstance instance10 = domainObject.getDiagLaterality();
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

			ims.core.vo.lookups.LateralityLRB voLookup10 = new ims.core.vo.lookups.LateralityLRB(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.LateralityLRB parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.core.vo.lookups.LateralityLRB(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setDiagLaterality(voLookup10);
		}
				// SiteText
		valueObject.setSiteText(domainObject.getSiteText());
		// AuthoringInfo
		valueObject.setAuthoringInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInfo()) );
		// IncludeDiagnosisInDiscReports
		valueObject.setIncludeDiagnosisInDiscReports(ims.core.vo.domain.IncludeDiagnosisInDischargeReportVoAssembler.createIncludeDiagnosisInDischargeReportVoCollectionFromIncludeDiagnosisInDischargeReport(map, domainObject.getIncludeDiagnosisInDiscReports()) );
		// isPrevRelevantDiagnosis
		valueObject.setIsPrevRelevantDiagnosis( domainObject.isIsPrevRelevantDiagnosis() );
		// SysInfo
		// set system information
		valueObject.setSysInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// DateOnset
		java.util.Date DateOnset = domainObject.getDateOnset();
		if ( null != DateOnset ) 
		{
			valueObject.setDateOnset(new ims.framework.utils.Date(DateOnset) );
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
		// PrimaryForCareSpells
		valueObject.setPrimaryForCareSpells(ims.core.vo.domain.CSPrimaryDiagnosisVoAssembler.createCSPrimaryDiagnosisVoCollectionFromCsPrimaryDiagnosis(map, domainObject.getPrimaryForCareSpells()) );
		// CoMorbidityForEpisodeOfCares
		valueObject.setCoMorbidityForEpisodeOfCares(ims.core.vo.domain.EpisodeOfCareCoMorbidityVoAssembler.createEpisodeOfCareCoMorbidityVoCollectionFromEpisodeOfCareCoMorbidity(map, domainObject.getCoMorbidityForEpisodeOfCares()) );
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
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.PatientDiagnosis extractPatientDiagnosis(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientDiagnosisEDischargeVo valueObject) 
	{
		return 	extractPatientDiagnosis(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.PatientDiagnosis extractPatientDiagnosis(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientDiagnosisEDischargeVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientDiagnosis();
		ims.core.clinical.domain.objects.PatientDiagnosis domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.PatientDiagnosis)domMap.get(valueObject);
			}
			// ims.core.vo.PatientDiagnosisEDischargeVo ID_PatientDiagnosis field is unknown
			domainObject = new ims.core.clinical.domain.objects.PatientDiagnosis();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientDiagnosis());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.PatientDiagnosis)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.PatientDiagnosis) domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientDiagnosis.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientDiagnosis());

		domainObject.setStatusHistory(ims.clinical.vo.domain.PatientDiagnosisStatusVoAssembler.extractPatientDiagnosisStatusSet(domainFactory, valueObject.getStatusHistory(), domainObject.getStatusHistory(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDiagnosisDescription() != null && valueObject.getDiagnosisDescription().equals(""))
		{
			valueObject.setDiagnosisDescription(null);
		}
		domainObject.setDiagnosisDescription(valueObject.getDiagnosisDescription());
		ims.framework.utils.PartialDate DiagnosedDate = valueObject.getDiagnosedDate();
		Integer value3 = null;
		if ( null != DiagnosedDate ) 
		{
			value3 = DiagnosedDate.toInteger();
		}
		domainObject.setDiagnosedDate(value3);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Diagnosis value4 = null;
		if ( null != valueObject.getDiagnosis() ) 
		{
			if (valueObject.getDiagnosis().getBoId() == null)
			{
				if (domMap.get(valueObject.getDiagnosis()) != null)
				{
					value4 = (ims.core.clinical.domain.objects.Diagnosis)domMap.get(valueObject.getDiagnosis());
				}
			}
			else
			{
				value4 = (ims.core.clinical.domain.objects.Diagnosis)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Diagnosis.class, valueObject.getDiagnosis().getBoId());
			}
		}
		domainObject.setDiagnosis(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getSourceofInformation() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getSourceofInformation().getID());
		}
		domainObject.setSourceofInformation(value5);
		domainObject.setIsComplication(valueObject.getIsComplication());
		domainObject.setIsComorbidity(valueObject.getIsComorbidity());
		java.util.Date value8 = null;
		ims.framework.utils.Date date8 = valueObject.getDateResolved();		
		if ( date8 != null ) 
		{
			value8 = date8.getDate();
		}
		domainObject.setDateResolved(value8);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.CareContext value9 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value9 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else
			{
				value9 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getDiagLaterality() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getDiagLaterality().getID());
		}
		domainObject.setDiagLaterality(value10);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSiteText() != null && valueObject.getSiteText().equals(""))
		{
			valueObject.setSiteText(null);
		}
		domainObject.setSiteText(valueObject.getSiteText());
		domainObject.setAuthoringInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInfo(), domMap));
		domainObject.setIncludeDiagnosisInDiscReports(ims.core.vo.domain.IncludeDiagnosisInDischargeReportVoAssembler.extractIncludeDiagnosisInDischargeReportSet(domainFactory, valueObject.getIncludeDiagnosisInDiscReports(), domainObject.getIncludeDiagnosisInDiscReports(), domMap));		
		domainObject.setIsPrevRelevantDiagnosis(valueObject.getIsPrevRelevantDiagnosis());
		java.util.Date value16 = null;
		ims.framework.utils.Date date16 = valueObject.getDateOnset();		
		if ( date16 != null ) 
		{
			value16 = date16.getDate();
		}
		domainObject.setDateOnset(value16);
		ims.core.admin.domain.objects.ClinicalContact value17 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value17 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value17 = domainObject.getClinicalContact();	
			}
			else
			{
				value17 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value17);
		domainObject.setPrimaryForCareSpells(ims.core.vo.domain.CSPrimaryDiagnosisVoAssembler.extractCsPrimaryDiagnosisSet(domainFactory, valueObject.getPrimaryForCareSpells(), domainObject.getPrimaryForCareSpells(), domMap));		
		domainObject.setCoMorbidityForEpisodeOfCares(ims.core.vo.domain.EpisodeOfCareCoMorbidityVoAssembler.extractEpisodeOfCareCoMorbiditySet(domainFactory, valueObject.getCoMorbidityForEpisodeOfCares(), domainObject.getCoMorbidityForEpisodeOfCares(), domMap));		
		ims.core.admin.domain.objects.EpisodeOfCare value20 = null;
		if ( null != valueObject.getEpisodeOfCare() ) 
		{
			if (valueObject.getEpisodeOfCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisodeOfCare()) != null)
				{
					value20 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisodeOfCare());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value20 = domainObject.getEpisodeOfCare();	
			}
			else
			{
				value20 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisodeOfCare().getBoId());
			}
		}
		domainObject.setEpisodeOfCare(value20);

		return domainObject;
	}

}
