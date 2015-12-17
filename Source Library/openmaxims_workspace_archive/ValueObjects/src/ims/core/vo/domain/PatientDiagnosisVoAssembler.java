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
 * @author Sinead McDermott
 */
public class PatientDiagnosisVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PatientDiagnosisVo copy(ims.core.vo.PatientDiagnosisVo valueObjectDest, ims.core.vo.PatientDiagnosisVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientDiagnosis(valueObjectSrc.getID_PatientDiagnosis());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Site
		valueObjectDest.setSite(valueObjectSrc.getSite());
		// DiagnosedBy
		valueObjectDest.setDiagnosedBy(valueObjectSrc.getDiagnosedBy());
		// isResolved
		valueObjectDest.setIsResolved(valueObjectSrc.getIsResolved());
		// ResolvedHCP
		valueObjectDest.setResolvedHCP(valueObjectSrc.getResolvedHCP());
		// InformedOfDiagnosis
		valueObjectDest.setInformedOfDiagnosis(valueObjectSrc.getInformedOfDiagnosis());
		// Notes
		valueObjectDest.setNotes(valueObjectSrc.getNotes());
		// Specialty
		valueObjectDest.setSpecialty(valueObjectSrc.getSpecialty());
		// BasisofDiagnosis
		valueObjectDest.setBasisofDiagnosis(valueObjectSrc.getBasisofDiagnosis());
		// ExcludefromOthers
		valueObjectDest.setExcludefromOthers(valueObjectSrc.getExcludefromOthers());
		// DiagConfirmedStatus
		valueObjectDest.setDiagConfirmedStatus(valueObjectSrc.getDiagConfirmedStatus());
		// DiagConfirmedBy
		valueObjectDest.setDiagConfirmedBy(valueObjectSrc.getDiagConfirmedBy());
		// DiagConfirmedDateTime
		valueObjectDest.setDiagConfirmedDateTime(valueObjectSrc.getDiagConfirmedDateTime());
		// StatusHistory
		valueObjectDest.setStatusHistory(valueObjectSrc.getStatusHistory());
		// PrimaryForCareSpells
		valueObjectDest.setPrimaryForCareSpells(valueObjectSrc.getPrimaryForCareSpells());
		// isComplication
		valueObjectDest.setIsComplication(valueObjectSrc.getIsComplication());
		// DateResolved
		valueObjectDest.setDateResolved(valueObjectSrc.getDateResolved());
		// SysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
		// DateOnset
		valueObjectDest.setDateOnset(valueObjectSrc.getDateOnset());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// DiagLaterality
		valueObjectDest.setDiagLaterality(valueObjectSrc.getDiagLaterality());
		// SiteText
		valueObjectDest.setSiteText(valueObjectSrc.getSiteText());
		// isPMH
		valueObjectDest.setIsPMH(valueObjectSrc.getIsPMH());
		// isCancerDiagnosis
		valueObjectDest.setIsCancerDiagnosis(valueObjectSrc.getIsCancerDiagnosis());
		// AuthoringInfo
		valueObjectDest.setAuthoringInfo(valueObjectSrc.getAuthoringInfo());
		// DiagnosisDescription
		valueObjectDest.setDiagnosisDescription(valueObjectSrc.getDiagnosisDescription());
		// DiagnosedDate
		valueObjectDest.setDiagnosedDate(valueObjectSrc.getDiagnosedDate());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// SourceofInformation
		valueObjectDest.setSourceofInformation(valueObjectSrc.getSourceofInformation());
		// Diagnosis
		valueObjectDest.setDiagnosis(valueObjectSrc.getDiagnosis());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// isComorbidity
		valueObjectDest.setIsComorbidity(valueObjectSrc.getIsComorbidity());
		// EpisodeOfCare
		valueObjectDest.setEpisodeOfCare(valueObjectSrc.getEpisodeOfCare());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientDiagnosisVoCollectionFromPatientDiagnosis(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientDiagnosis objects.
	 */
	public static ims.core.vo.PatientDiagnosisVoCollection createPatientDiagnosisVoCollectionFromPatientDiagnosis(java.util.Set domainObjectSet)	
	{
		return createPatientDiagnosisVoCollectionFromPatientDiagnosis(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientDiagnosis objects.
	 */
	public static ims.core.vo.PatientDiagnosisVoCollection createPatientDiagnosisVoCollectionFromPatientDiagnosis(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatientDiagnosisVoCollection voList = new ims.core.vo.PatientDiagnosisVoCollection();
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
			ims.core.vo.PatientDiagnosisVo vo = create(map, domainObject);
			
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
	public static ims.core.vo.PatientDiagnosisVoCollection createPatientDiagnosisVoCollectionFromPatientDiagnosis(java.util.List domainObjectList) 
	{
		return createPatientDiagnosisVoCollectionFromPatientDiagnosis(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientDiagnosis objects.
	 */
	public static ims.core.vo.PatientDiagnosisVoCollection createPatientDiagnosisVoCollectionFromPatientDiagnosis(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatientDiagnosisVoCollection voList = new ims.core.vo.PatientDiagnosisVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.PatientDiagnosis domainObject = (ims.core.clinical.domain.objects.PatientDiagnosis) domainObjectList.get(i);
			ims.core.vo.PatientDiagnosisVo vo = create(map, domainObject);

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
	 public static java.util.Set extractPatientDiagnosisSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientDiagnosisVoCollection voCollection) 
	 {
	 	return extractPatientDiagnosisSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientDiagnosisSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientDiagnosisVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientDiagnosisVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientDiagnosis domainObject = PatientDiagnosisVoAssembler.extractPatientDiagnosis(domainFactory, vo, domMap);

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
	 public static java.util.List extractPatientDiagnosisList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientDiagnosisVoCollection voCollection) 
	 {
	 	return extractPatientDiagnosisList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientDiagnosisList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientDiagnosisVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientDiagnosisVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientDiagnosis domainObject = PatientDiagnosisVoAssembler.extractPatientDiagnosis(domainFactory, vo, domMap);

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
	 public static ims.core.vo.PatientDiagnosisVo create(ims.core.clinical.domain.objects.PatientDiagnosis domainObject) 
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
	  public static ims.core.vo.PatientDiagnosisVo create(DomainObjectMap map, ims.core.clinical.domain.objects.PatientDiagnosis domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PatientDiagnosisVo valueObject = (ims.core.vo.PatientDiagnosisVo) map.getValueObject(domainObject, ims.core.vo.PatientDiagnosisVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PatientDiagnosisVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.core.vo.PatientDiagnosisVo insert(ims.core.vo.PatientDiagnosisVo valueObject, ims.core.clinical.domain.objects.PatientDiagnosis domainObject) 
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
	 public static ims.core.vo.PatientDiagnosisVo insert(DomainObjectMap map, ims.core.vo.PatientDiagnosisVo valueObject, ims.core.clinical.domain.objects.PatientDiagnosis domainObject) 
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
			
		// Site
		ims.domain.lookups.LookupInstance instance1 = domainObject.getSite();
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

			ims.clinical.vo.lookups.Site voLookup1 = new ims.clinical.vo.lookups.Site(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.clinical.vo.lookups.Site parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.clinical.vo.lookups.Site(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setSite(voLookup1);
		}
				// DiagnosedBy
		valueObject.setDiagnosedBy(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getDiagnosedBy()) );
		// isResolved
		valueObject.setIsResolved( domainObject.isIsResolved() );
		// ResolvedHCP
		valueObject.setResolvedHCP((ims.core.vo.MedicVo)ims.core.vo.domain.MedicVoAssembler.create(map, domainObject.getResolvedHCP()) );
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
		// Notes
		valueObject.setNotes(domainObject.getNotes());
		// Specialty
		ims.domain.lookups.LookupInstance instance7 = domainObject.getSpecialty();
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

			ims.core.vo.lookups.Specialty voLookup7 = new ims.core.vo.lookups.Specialty(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.core.vo.lookups.Specialty(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setSpecialty(voLookup7);
		}
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
		// ExcludefromOthers
		valueObject.setExcludefromOthers( domainObject.isExcludefromOthers() );
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
		valueObject.setDiagConfirmedBy(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getDiagConfirmedBy()) );
		// DiagConfirmedDateTime
		java.util.Date DiagConfirmedDateTime = domainObject.getDiagConfirmedDateTime();
		if ( null != DiagConfirmedDateTime ) 
		{
			valueObject.setDiagConfirmedDateTime(new ims.framework.utils.DateTime(DiagConfirmedDateTime) );
		}
		// StatusHistory
		valueObject.setStatusHistory(ims.clinical.vo.domain.PatientDiagnosisStatusVoAssembler.createPatientDiagnosisStatusVoCollectionFromPatientDiagnosisStatus(map, domainObject.getStatusHistory()) );
		// PrimaryForCareSpells
		valueObject.setPrimaryForCareSpells(ims.core.vo.domain.CSPrimaryDiagnosisVoAssembler.createCSPrimaryDiagnosisVoCollectionFromCsPrimaryDiagnosis(map, domainObject.getPrimaryForCareSpells()) );
		// isComplication
		valueObject.setIsComplication( domainObject.isIsComplication() );
		// DateResolved
		java.util.Date DateResolved = domainObject.getDateResolved();
		if ( null != DateResolved ) 
		{
			valueObject.setDateResolved(new ims.framework.utils.Date(DateResolved) );
		}
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
		valueObject.setClinicalContact(ims.core.vo.domain.ClinicalContactShortVoAssembler.create(map, domainObject.getClinicalContact()) );
		// DiagLaterality
		ims.domain.lookups.LookupInstance instance20 = domainObject.getDiagLaterality();
		if ( null != instance20 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance20.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance20.getImage().getImageId(), instance20.getImage().getImagePath());
			}
			color = instance20.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.LateralityLRB voLookup20 = new ims.core.vo.lookups.LateralityLRB(instance20.getId(),instance20.getText(), instance20.isActive(), null, img, color);
			ims.core.vo.lookups.LateralityLRB parentVoLookup20 = voLookup20;
			ims.domain.lookups.LookupInstance parent20 = instance20.getParent();
			while (parent20 != null)
			{
				if (parent20.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent20.getImage().getImageId(), parent20.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent20.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup20.setParent(new ims.core.vo.lookups.LateralityLRB(parent20.getId(),parent20.getText(), parent20.isActive(), null, img, color));
				parentVoLookup20 = parentVoLookup20.getParent();
								parent20 = parent20.getParent();
			}			
			valueObject.setDiagLaterality(voLookup20);
		}
				// SiteText
		valueObject.setSiteText(domainObject.getSiteText());
		// isPMH
		valueObject.setIsPMH( domainObject.isIsPMH() );
		// isCancerDiagnosis
		valueObject.setIsCancerDiagnosis( domainObject.isIsCancerDiagnosis() );
		// AuthoringInfo
		valueObject.setAuthoringInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInfo()) );
		// DiagnosisDescription
		valueObject.setDiagnosisDescription(domainObject.getDiagnosisDescription());
		// DiagnosedDate
		Integer DiagnosedDate = domainObject.getDiagnosedDate();
		if ( null != DiagnosedDate ) 
		{
			valueObject.setDiagnosedDate(new ims.framework.utils.PartialDate(DiagnosedDate) );
		}
		// CurrentStatus
		valueObject.setCurrentStatus(ims.clinical.vo.domain.PatientDiagnosisStatusVoAssembler.create(map, domainObject.getCurrentStatus()) );
		// SourceofInformation
		ims.domain.lookups.LookupInstance instance28 = domainObject.getSourceofInformation();
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

			ims.core.vo.lookups.SourceofInformation voLookup28 = new ims.core.vo.lookups.SourceofInformation(instance28.getId(),instance28.getText(), instance28.isActive(), null, img, color);
			ims.core.vo.lookups.SourceofInformation parentVoLookup28 = voLookup28;
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
								parentVoLookup28.setParent(new ims.core.vo.lookups.SourceofInformation(parent28.getId(),parent28.getText(), parent28.isActive(), null, img, color));
				parentVoLookup28 = parentVoLookup28.getParent();
								parent28 = parent28.getParent();
			}			
			valueObject.setSourceofInformation(voLookup28);
		}
				// Diagnosis
		valueObject.setDiagnosis(ims.core.vo.domain.DiagLiteVoAssembler.create(map, domainObject.getDiagnosis()) );
		// CareContext
		valueObject.setCareContext(ims.core.vo.domain.CareContextLiteVoAssembler.create(map, domainObject.getCareContext()) );
		// isComorbidity
		valueObject.setIsComorbidity( domainObject.isIsComorbidity() );
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
	public static ims.core.clinical.domain.objects.PatientDiagnosis extractPatientDiagnosis(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientDiagnosisVo valueObject) 
	{
		return 	extractPatientDiagnosis(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.PatientDiagnosis extractPatientDiagnosis(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientDiagnosisVo valueObject, HashMap domMap) 
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
			// ims.core.vo.PatientDiagnosisVo ID_PatientDiagnosis field is unknown
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
		if ( null != valueObject.getSite() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getSite().getID());
		}
		domainObject.setSite(value1);
		domainObject.setDiagnosedBy(ims.core.vo.domain.HcpAssembler.extractHcp(domainFactory, valueObject.getDiagnosedBy(), domMap));
		domainObject.setIsResolved(valueObject.getIsResolved());
		domainObject.setResolvedHCP(ims.core.vo.domain.MedicVoAssembler.extractMedic(domainFactory, (ims.core.vo.MedicVo)valueObject.getResolvedHCP(), domMap));
		ims.core.vo.lookups.DiagnosisInformedOfDiagnosisCollection collection5 =
	valueObject.getInformedOfDiagnosis();
	    java.util.List domainInformedOfDiagnosis = domainObject.getInformedOfDiagnosis();;			
	    int collection5Size=0;
		if (collection5 == null)
		{
			domainInformedOfDiagnosis = new java.util.ArrayList(0);
		}
		else
		{
			collection5Size = collection5.size();
		}
		
		for(int i=0; i<collection5Size; i++) 
		{
			int instanceId = collection5.get(i).getID();
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
		int j5 = domainInformedOfDiagnosis.size();
		while (j5 > collection5Size)
		{
			domainInformedOfDiagnosis.remove(j5-1);
			j5 = domainInformedOfDiagnosis.size();
		}

		domainObject.setInformedOfDiagnosis(domainInformedOfDiagnosis);		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNotes() != null && valueObject.getNotes().equals(""))
		{
			valueObject.setNotes(null);
		}
		domainObject.setNotes(valueObject.getNotes());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value7);
		ims.core.vo.lookups.DiagnosisBasisofDiagnosisCollection collection8 =
	valueObject.getBasisofDiagnosis();
	    java.util.List domainBasisofDiagnosis = domainObject.getBasisofDiagnosis();;			
	    int collection8Size=0;
		if (collection8 == null)
		{
			domainBasisofDiagnosis = new java.util.ArrayList(0);
		}
		else
		{
			collection8Size = collection8.size();
		}
		
		for(int i=0; i<collection8Size; i++) 
		{
			int instanceId = collection8.get(i).getID();
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
		int j8 = domainBasisofDiagnosis.size();
		while (j8 > collection8Size)
		{
			domainBasisofDiagnosis.remove(j8-1);
			j8 = domainBasisofDiagnosis.size();
		}

		domainObject.setBasisofDiagnosis(domainBasisofDiagnosis);		
		domainObject.setExcludefromOthers(valueObject.getExcludefromOthers());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getDiagConfirmedStatus() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getDiagConfirmedStatus().getID());
		}
		domainObject.setDiagConfirmedStatus(value10);
		domainObject.setDiagConfirmedBy(ims.core.vo.domain.HcpAssembler.extractHcp(domainFactory, valueObject.getDiagConfirmedBy(), domMap));
		ims.framework.utils.DateTime dateTime12 = valueObject.getDiagConfirmedDateTime();
		java.util.Date value12 = null;
		if ( dateTime12 != null ) 
		{
			value12 = dateTime12.getJavaDate();
		}
		domainObject.setDiagConfirmedDateTime(value12);
		domainObject.setStatusHistory(ims.clinical.vo.domain.PatientDiagnosisStatusVoAssembler.extractPatientDiagnosisStatusSet(domainFactory, valueObject.getStatusHistory(), domainObject.getStatusHistory(), domMap));		
		domainObject.setPrimaryForCareSpells(ims.core.vo.domain.CSPrimaryDiagnosisVoAssembler.extractCsPrimaryDiagnosisSet(domainFactory, valueObject.getPrimaryForCareSpells(), domainObject.getPrimaryForCareSpells(), domMap));		
		domainObject.setIsComplication(valueObject.getIsComplication());
		java.util.Date value16 = null;
		ims.framework.utils.Date date16 = valueObject.getDateResolved();		
		if ( date16 != null ) 
		{
			value16 = date16.getDate();
		}
		domainObject.setDateResolved(value16);
		java.util.Date value18 = null;
		ims.framework.utils.Date date18 = valueObject.getDateOnset();		
		if ( date18 != null ) 
		{
			value18 = date18.getDate();
		}
		domainObject.setDateOnset(value18);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.ClinicalContact value19 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value19 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else
			{
				value19 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value19);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value20 = null;
		if ( null != valueObject.getDiagLaterality() ) 
		{
			value20 =
				domainFactory.getLookupInstance(valueObject.getDiagLaterality().getID());
		}
		domainObject.setDiagLaterality(value20);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSiteText() != null && valueObject.getSiteText().equals(""))
		{
			valueObject.setSiteText(null);
		}
		domainObject.setSiteText(valueObject.getSiteText());
		domainObject.setIsPMH(valueObject.getIsPMH());
		domainObject.setIsCancerDiagnosis(valueObject.getIsCancerDiagnosis());
		domainObject.setAuthoringInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInfo(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDiagnosisDescription() != null && valueObject.getDiagnosisDescription().equals(""))
		{
			valueObject.setDiagnosisDescription(null);
		}
		domainObject.setDiagnosisDescription(valueObject.getDiagnosisDescription());
		ims.framework.utils.PartialDate DiagnosedDate = valueObject.getDiagnosedDate();
		Integer value26 = null;
		if ( null != DiagnosedDate ) 
		{
			value26 = DiagnosedDate.toInteger();
		}
		domainObject.setDiagnosedDate(value26);
		domainObject.setCurrentStatus(ims.clinical.vo.domain.PatientDiagnosisStatusVoAssembler.extractPatientDiagnosisStatus(domainFactory, valueObject.getCurrentStatus(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value28 = null;
		if ( null != valueObject.getSourceofInformation() ) 
		{
			value28 =
				domainFactory.getLookupInstance(valueObject.getSourceofInformation().getID());
		}
		domainObject.setSourceofInformation(value28);
		domainObject.setDiagnosis(ims.core.vo.domain.DiagLiteVoAssembler.extractDiagnosis(domainFactory, valueObject.getDiagnosis(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.CareContext value30 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value30 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else
			{
				value30 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value30);
		domainObject.setIsComorbidity(valueObject.getIsComorbidity());
		ims.core.admin.domain.objects.EpisodeOfCare value32 = null;
		if ( null != valueObject.getEpisodeOfCare() ) 
		{
			if (valueObject.getEpisodeOfCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisodeOfCare()) != null)
				{
					value32 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisodeOfCare());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value32 = domainObject.getEpisodeOfCare();	
			}
			else
			{
				value32 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisodeOfCare().getBoId());
			}
		}
		domainObject.setEpisodeOfCare(value32);

		return domainObject;
	}

}
