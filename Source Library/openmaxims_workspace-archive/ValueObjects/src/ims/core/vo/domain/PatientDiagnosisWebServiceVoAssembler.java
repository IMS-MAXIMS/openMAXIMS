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
 * @author Marius Mihalec
 */
public class PatientDiagnosisWebServiceVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PatientDiagnosisWebServiceVo copy(ims.core.vo.PatientDiagnosisWebServiceVo valueObjectDest, ims.core.vo.PatientDiagnosisWebServiceVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientDiagnosis(valueObjectSrc.getID_PatientDiagnosis());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// SourceofInformation
		valueObjectDest.setSourceofInformation(valueObjectSrc.getSourceofInformation());
		// DiagnosedBy
		valueObjectDest.setDiagnosedBy(valueObjectSrc.getDiagnosedBy());
		// isResolved
		valueObjectDest.setIsResolved(valueObjectSrc.getIsResolved());
		// DateResolved
		valueObjectDest.setDateResolved(valueObjectSrc.getDateResolved());
		// ResolvedHCP
		valueObjectDest.setResolvedHCP(valueObjectSrc.getResolvedHCP());
		// isComplication
		valueObjectDest.setIsComplication(valueObjectSrc.getIsComplication());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// Notes
		valueObjectDest.setNotes(valueObjectSrc.getNotes());
		// Specialty
		valueObjectDest.setSpecialty(valueObjectSrc.getSpecialty());
		// DiagConfirmedStatus
		valueObjectDest.setDiagConfirmedStatus(valueObjectSrc.getDiagConfirmedStatus());
		// DiagConfirmedBy
		valueObjectDest.setDiagConfirmedBy(valueObjectSrc.getDiagConfirmedBy());
		// DiagConfirmedDateTime
		valueObjectDest.setDiagConfirmedDateTime(valueObjectSrc.getDiagConfirmedDateTime());
		// isCancerDiagnosis
		valueObjectDest.setIsCancerDiagnosis(valueObjectSrc.getIsCancerDiagnosis());
		// AuthoringInfo
		valueObjectDest.setAuthoringInfo(valueObjectSrc.getAuthoringInfo());
		// DiagLaterality
		valueObjectDest.setDiagLaterality(valueObjectSrc.getDiagLaterality());
		// Site
		valueObjectDest.setSite(valueObjectSrc.getSite());
		// SiteText
		valueObjectDest.setSiteText(valueObjectSrc.getSiteText());
		// InformedOfDiagnosis
		valueObjectDest.setInformedOfDiagnosis(valueObjectSrc.getInformedOfDiagnosis());
		// BasisofDiagnosis
		valueObjectDest.setBasisofDiagnosis(valueObjectSrc.getBasisofDiagnosis());
		// isPMH
		valueObjectDest.setIsPMH(valueObjectSrc.getIsPMH());
		// isComorbidity
		valueObjectDest.setIsComorbidity(valueObjectSrc.getIsComorbidity());
		// Diagnosis
		valueObjectDest.setDiagnosis(valueObjectSrc.getDiagnosis());
		// DiagnosisDescription
		valueObjectDest.setDiagnosisDescription(valueObjectSrc.getDiagnosisDescription());
		// DiagnosedDate
		valueObjectDest.setDiagnosedDate(valueObjectSrc.getDiagnosedDate());
		// DateOnset
		valueObjectDest.setDateOnset(valueObjectSrc.getDateOnset());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientDiagnosisWebServiceVoCollectionFromPatientDiagnosis(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientDiagnosis objects.
	 */
	public static ims.core.vo.PatientDiagnosisWebServiceVoCollection createPatientDiagnosisWebServiceVoCollectionFromPatientDiagnosis(java.util.Set domainObjectSet)	
	{
		return createPatientDiagnosisWebServiceVoCollectionFromPatientDiagnosis(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientDiagnosis objects.
	 */
	public static ims.core.vo.PatientDiagnosisWebServiceVoCollection createPatientDiagnosisWebServiceVoCollectionFromPatientDiagnosis(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatientDiagnosisWebServiceVoCollection voList = new ims.core.vo.PatientDiagnosisWebServiceVoCollection();
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
			ims.core.vo.PatientDiagnosisWebServiceVo vo = create(map, domainObject);
			
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
	public static ims.core.vo.PatientDiagnosisWebServiceVoCollection createPatientDiagnosisWebServiceVoCollectionFromPatientDiagnosis(java.util.List domainObjectList) 
	{
		return createPatientDiagnosisWebServiceVoCollectionFromPatientDiagnosis(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientDiagnosis objects.
	 */
	public static ims.core.vo.PatientDiagnosisWebServiceVoCollection createPatientDiagnosisWebServiceVoCollectionFromPatientDiagnosis(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatientDiagnosisWebServiceVoCollection voList = new ims.core.vo.PatientDiagnosisWebServiceVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.PatientDiagnosis domainObject = (ims.core.clinical.domain.objects.PatientDiagnosis) domainObjectList.get(i);
			ims.core.vo.PatientDiagnosisWebServiceVo vo = create(map, domainObject);

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
	 public static java.util.Set extractPatientDiagnosisSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientDiagnosisWebServiceVoCollection voCollection) 
	 {
	 	return extractPatientDiagnosisSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientDiagnosisSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientDiagnosisWebServiceVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientDiagnosisWebServiceVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientDiagnosis domainObject = PatientDiagnosisWebServiceVoAssembler.extractPatientDiagnosis(domainFactory, vo, domMap);

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
	 public static java.util.List extractPatientDiagnosisList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientDiagnosisWebServiceVoCollection voCollection) 
	 {
	 	return extractPatientDiagnosisList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientDiagnosisList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientDiagnosisWebServiceVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientDiagnosisWebServiceVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientDiagnosis domainObject = PatientDiagnosisWebServiceVoAssembler.extractPatientDiagnosis(domainFactory, vo, domMap);

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
	 public static ims.core.vo.PatientDiagnosisWebServiceVo create(ims.core.clinical.domain.objects.PatientDiagnosis domainObject) 
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
	  public static ims.core.vo.PatientDiagnosisWebServiceVo create(DomainObjectMap map, ims.core.clinical.domain.objects.PatientDiagnosis domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PatientDiagnosisWebServiceVo valueObject = (ims.core.vo.PatientDiagnosisWebServiceVo) map.getValueObject(domainObject, ims.core.vo.PatientDiagnosisWebServiceVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PatientDiagnosisWebServiceVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.core.vo.PatientDiagnosisWebServiceVo insert(ims.core.vo.PatientDiagnosisWebServiceVo valueObject, ims.core.clinical.domain.objects.PatientDiagnosis domainObject) 
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
	 public static ims.core.vo.PatientDiagnosisWebServiceVo insert(DomainObjectMap map, ims.core.vo.PatientDiagnosisWebServiceVo valueObject, ims.core.clinical.domain.objects.PatientDiagnosis domainObject) 
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
			
		// SourceofInformation
		ims.domain.lookups.LookupInstance instance1 = domainObject.getSourceofInformation();
		if ( null != instance1 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance1.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance1.getImage().getImageId(), instance1.getImage().getImagePath());
			}
			color = instance1.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.SourceofInformation voLookup1 = new ims.core.vo.lookups.SourceofInformation(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.SourceofInformation parentVoLookup1 = voLookup1;
			ims.domain.lookups.LookupInstance parent1 = instance1.getParent();
			while (parent1 != null)
			{
				if (parent1.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent1.getImage().getImageId(), parent1.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent1.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup1.setParent(new ims.core.vo.lookups.SourceofInformation(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setSourceofInformation(voLookup1);
		}
				// DiagnosedBy
		valueObject.setDiagnosedBy(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getDiagnosedBy()) );
		// isResolved
		valueObject.setIsResolved( domainObject.isIsResolved() );
		// DateResolved
		java.util.Date DateResolved = domainObject.getDateResolved();
		if ( null != DateResolved ) 
		{
			valueObject.setDateResolved(new ims.framework.utils.Date(DateResolved) );
		}
		// ResolvedHCP
		valueObject.setResolvedHCP(ims.core.vo.domain.MedicLiteVoAssembler.create(map, domainObject.getResolvedHCP()) );
		// isComplication
		valueObject.setIsComplication( domainObject.isIsComplication() );
		// CurrentStatus
		valueObject.setCurrentStatus(ims.clinical.vo.domain.PatientDiagnosisStatusVoAssembler.create(map, domainObject.getCurrentStatus()) );
		// Notes
		valueObject.setNotes(domainObject.getNotes());
		// Specialty
		ims.domain.lookups.LookupInstance instance9 = domainObject.getSpecialty();
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

			ims.core.vo.lookups.Specialty voLookup9 = new ims.core.vo.lookups.Specialty(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.core.vo.lookups.Specialty(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setSpecialty(voLookup9);
		}
				// DiagConfirmedStatus
		ims.domain.lookups.LookupInstance instance10 = domainObject.getDiagConfirmedStatus();
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

			ims.core.vo.lookups.ConfirmedStatus voLookup10 = new ims.core.vo.lookups.ConfirmedStatus(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.ConfirmedStatus parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.core.vo.lookups.ConfirmedStatus(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setDiagConfirmedStatus(voLookup10);
		}
				// DiagConfirmedBy
		valueObject.setDiagConfirmedBy(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getDiagConfirmedBy()) );
		// DiagConfirmedDateTime
		java.util.Date DiagConfirmedDateTime = domainObject.getDiagConfirmedDateTime();
		if ( null != DiagConfirmedDateTime ) 
		{
			valueObject.setDiagConfirmedDateTime(new ims.framework.utils.DateTime(DiagConfirmedDateTime) );
		}
		// isCancerDiagnosis
		valueObject.setIsCancerDiagnosis( domainObject.isIsCancerDiagnosis() );
		// AuthoringInfo
		valueObject.setAuthoringInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInfo()) );
		// DiagLaterality
		ims.domain.lookups.LookupInstance instance15 = domainObject.getDiagLaterality();
		if ( null != instance15 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance15.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance15.getImage().getImageId(), instance15.getImage().getImagePath());
			}
			color = instance15.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.LateralityLRB voLookup15 = new ims.core.vo.lookups.LateralityLRB(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.core.vo.lookups.LateralityLRB parentVoLookup15 = voLookup15;
			ims.domain.lookups.LookupInstance parent15 = instance15.getParent();
			while (parent15 != null)
			{
				if (parent15.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent15.getImage().getImageId(), parent15.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent15.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup15.setParent(new ims.core.vo.lookups.LateralityLRB(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setDiagLaterality(voLookup15);
		}
				// Site
		ims.domain.lookups.LookupInstance instance16 = domainObject.getSite();
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

			ims.clinical.vo.lookups.Site voLookup16 = new ims.clinical.vo.lookups.Site(instance16.getId(),instance16.getText(), instance16.isActive(), null, img, color);
			ims.clinical.vo.lookups.Site parentVoLookup16 = voLookup16;
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
								parentVoLookup16.setParent(new ims.clinical.vo.lookups.Site(parent16.getId(),parent16.getText(), parent16.isActive(), null, img, color));
				parentVoLookup16 = parentVoLookup16.getParent();
								parent16 = parent16.getParent();
			}			
			valueObject.setSite(voLookup16);
		}
				// SiteText
		valueObject.setSiteText(domainObject.getSiteText());
		// InformedOfDiagnosis
		java.util.List listInformedOfDiagnosis = domainObject.getInformedOfDiagnosis();
		ims.core.vo.lookups.DiagnosisInformedOfDiagnosisCollection InformedOfDiagnosis = new ims.core.vo.lookups.DiagnosisInformedOfDiagnosisCollection();
		for(java.util.Iterator iterator = listInformedOfDiagnosis.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.core.vo.lookups.DiagnosisInformedOfDiagnosis voInstance = new ims.core.vo.lookups.DiagnosisInformedOfDiagnosis(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.core.vo.lookups.DiagnosisInformedOfDiagnosis parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.core.vo.lookups.DiagnosisInformedOfDiagnosis(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			InformedOfDiagnosis.add(voInstance);
		}
		valueObject.setInformedOfDiagnosis( InformedOfDiagnosis );
		// BasisofDiagnosis
		java.util.List listBasisofDiagnosis = domainObject.getBasisofDiagnosis();
		ims.core.vo.lookups.DiagnosisBasisofDiagnosisCollection BasisofDiagnosis = new ims.core.vo.lookups.DiagnosisBasisofDiagnosisCollection();
		for(java.util.Iterator iterator = listBasisofDiagnosis.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.core.vo.lookups.DiagnosisBasisofDiagnosis voInstance = new ims.core.vo.lookups.DiagnosisBasisofDiagnosis(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.core.vo.lookups.DiagnosisBasisofDiagnosis parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.core.vo.lookups.DiagnosisBasisofDiagnosis(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			BasisofDiagnosis.add(voInstance);
		}
		valueObject.setBasisofDiagnosis( BasisofDiagnosis );
		// isPMH
		valueObject.setIsPMH( domainObject.isIsPMH() );
		// isComorbidity
		valueObject.setIsComorbidity( domainObject.isIsComorbidity() );
		// Diagnosis
		valueObject.setDiagnosis(ims.core.vo.domain.DiagLiteVoAssembler.create(map, domainObject.getDiagnosis()) );
		// DiagnosisDescription
		valueObject.setDiagnosisDescription(domainObject.getDiagnosisDescription());
		// DiagnosedDate
		Integer DiagnosedDate = domainObject.getDiagnosedDate();
		if ( null != DiagnosedDate ) 
		{
			valueObject.setDiagnosedDate(new ims.framework.utils.PartialDate(DiagnosedDate) );
		}
		// DateOnset
		java.util.Date DateOnset = domainObject.getDateOnset();
		if ( null != DateOnset ) 
		{
			valueObject.setDateOnset(new ims.framework.utils.Date(DateOnset) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.PatientDiagnosis extractPatientDiagnosis(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientDiagnosisWebServiceVo valueObject) 
	{
		return 	extractPatientDiagnosis(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.PatientDiagnosis extractPatientDiagnosis(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientDiagnosisWebServiceVo valueObject, HashMap domMap) 
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
			// ims.core.vo.PatientDiagnosisWebServiceVo ID_PatientDiagnosis field is unknown
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

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getSourceofInformation() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getSourceofInformation().getID());
		}
		domainObject.setSourceofInformation(value1);
		domainObject.setDiagnosedBy(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getDiagnosedBy(), domMap));
		domainObject.setIsResolved(valueObject.getIsResolved());
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getDateResolved();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setDateResolved(value4);
		domainObject.setResolvedHCP(ims.core.vo.domain.MedicLiteVoAssembler.extractMedic(domainFactory, valueObject.getResolvedHCP(), domMap));
		domainObject.setIsComplication(valueObject.getIsComplication());
		domainObject.setCurrentStatus(ims.clinical.vo.domain.PatientDiagnosisStatusVoAssembler.extractPatientDiagnosisStatus(domainFactory, valueObject.getCurrentStatus(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNotes() != null && valueObject.getNotes().equals(""))
		{
			valueObject.setNotes(null);
		}
		domainObject.setNotes(valueObject.getNotes());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getDiagConfirmedStatus() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getDiagConfirmedStatus().getID());
		}
		domainObject.setDiagConfirmedStatus(value10);
		domainObject.setDiagConfirmedBy(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getDiagConfirmedBy(), domMap));
		ims.framework.utils.DateTime dateTime12 = valueObject.getDiagConfirmedDateTime();
		java.util.Date value12 = null;
		if ( dateTime12 != null ) 
		{
			value12 = dateTime12.getJavaDate();
		}
		domainObject.setDiagConfirmedDateTime(value12);
		domainObject.setIsCancerDiagnosis(valueObject.getIsCancerDiagnosis());
		domainObject.setAuthoringInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInfo(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getDiagLaterality() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getDiagLaterality().getID());
		}
		domainObject.setDiagLaterality(value15);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getSite() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getSite().getID());
		}
		domainObject.setSite(value16);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSiteText() != null && valueObject.getSiteText().equals(""))
		{
			valueObject.setSiteText(null);
		}
		domainObject.setSiteText(valueObject.getSiteText());
		ims.core.vo.lookups.DiagnosisInformedOfDiagnosisCollection collection18 =
	valueObject.getInformedOfDiagnosis();
	    java.util.List domainInformedOfDiagnosis = domainObject.getInformedOfDiagnosis();;			
	    int collection18Size=0;
		if (collection18 == null)
		{
			domainInformedOfDiagnosis = new java.util.ArrayList(0);
		}
		else
		{
			collection18Size = collection18.size();
		}
		
		for(int i=0; i<collection18Size; i++) 
		{
			int instanceId = collection18.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainInformedOfDiagnosis.indexOf(dom);
			if (domIdx == -1)
			{
				domainInformedOfDiagnosis.add(i, dom);
			}
			else if (i != domIdx && i < domainInformedOfDiagnosis.size())
			{
				Object tmp = domainInformedOfDiagnosis.get(i);
				domainInformedOfDiagnosis.set(i, domainInformedOfDiagnosis.get(domIdx));
				domainInformedOfDiagnosis.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j18 = domainInformedOfDiagnosis.size();
		while (j18 > collection18Size)
		{
			domainInformedOfDiagnosis.remove(j18-1);
			j18 = domainInformedOfDiagnosis.size();
		}

		domainObject.setInformedOfDiagnosis(domainInformedOfDiagnosis);		
		ims.core.vo.lookups.DiagnosisBasisofDiagnosisCollection collection19 =
	valueObject.getBasisofDiagnosis();
	    java.util.List domainBasisofDiagnosis = domainObject.getBasisofDiagnosis();;			
	    int collection19Size=0;
		if (collection19 == null)
		{
			domainBasisofDiagnosis = new java.util.ArrayList(0);
		}
		else
		{
			collection19Size = collection19.size();
		}
		
		for(int i=0; i<collection19Size; i++) 
		{
			int instanceId = collection19.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainBasisofDiagnosis.indexOf(dom);
			if (domIdx == -1)
			{
				domainBasisofDiagnosis.add(i, dom);
			}
			else if (i != domIdx && i < domainBasisofDiagnosis.size())
			{
				Object tmp = domainBasisofDiagnosis.get(i);
				domainBasisofDiagnosis.set(i, domainBasisofDiagnosis.get(domIdx));
				domainBasisofDiagnosis.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j19 = domainBasisofDiagnosis.size();
		while (j19 > collection19Size)
		{
			domainBasisofDiagnosis.remove(j19-1);
			j19 = domainBasisofDiagnosis.size();
		}

		domainObject.setBasisofDiagnosis(domainBasisofDiagnosis);		
		domainObject.setIsPMH(valueObject.getIsPMH());
		domainObject.setIsComorbidity(valueObject.getIsComorbidity());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Diagnosis value22 = null;
		if ( null != valueObject.getDiagnosis() ) 
		{
			if (valueObject.getDiagnosis().getBoId() == null)
			{
				if (domMap.get(valueObject.getDiagnosis()) != null)
				{
					value22 = (ims.core.clinical.domain.objects.Diagnosis)domMap.get(valueObject.getDiagnosis());
				}
			}
			else
			{
				value22 = (ims.core.clinical.domain.objects.Diagnosis)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Diagnosis.class, valueObject.getDiagnosis().getBoId());
			}
		}
		domainObject.setDiagnosis(value22);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDiagnosisDescription() != null && valueObject.getDiagnosisDescription().equals(""))
		{
			valueObject.setDiagnosisDescription(null);
		}
		domainObject.setDiagnosisDescription(valueObject.getDiagnosisDescription());
		ims.framework.utils.PartialDate DiagnosedDate = valueObject.getDiagnosedDate();
		Integer value24 = null;
		if ( null != DiagnosedDate ) 
		{
			value24 = DiagnosedDate.toInteger();
		}
		domainObject.setDiagnosedDate(value24);
		java.util.Date value25 = null;
		ims.framework.utils.Date date25 = valueObject.getDateOnset();		
		if ( date25 != null ) 
		{
			value25 = date25.getDate();
		}
		domainObject.setDateOnset(value25);

		return domainObject;
	}

}
