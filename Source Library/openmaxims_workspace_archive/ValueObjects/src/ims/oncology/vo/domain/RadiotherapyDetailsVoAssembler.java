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
package ims.oncology.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Catalin Tomozei
 */
public class RadiotherapyDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.oncology.vo.RadiotherapyDetailsVo copy(ims.oncology.vo.RadiotherapyDetailsVo valueObjectDest, ims.oncology.vo.RadiotherapyDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_RadiotherapyDetails(valueObjectSrc.getID_RadiotherapyDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// EndDate
		valueObjectDest.setEndDate(valueObjectSrc.getEndDate());
		// PrescribedDose
		valueObjectDest.setPrescribedDose(valueObjectSrc.getPrescribedDose());
		// PrescribedFractions
		valueObjectDest.setPrescribedFractions(valueObjectSrc.getPrescribedFractions());
		// PrescribedDuration
		valueObjectDest.setPrescribedDuration(valueObjectSrc.getPrescribedDuration());
		// TeletherapyDetails
		valueObjectDest.setTeletherapyDetails(valueObjectSrc.getTeletherapyDetails());
		// BrachytherapyDetails
		valueObjectDest.setBrachytherapyDetails(valueObjectSrc.getBrachytherapyDetails());
		// TreatmentCourseStatus
		valueObjectDest.setTreatmentCourseStatus(valueObjectSrc.getTreatmentCourseStatus());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// TreatingHospital
		valueObjectDest.setTreatingHospital(valueObjectSrc.getTreatingHospital());
		// PerformanceStatusAtDDT
		valueObjectDest.setPerformanceStatusAtDDT(valueObjectSrc.getPerformanceStatusAtDDT());
		// ConcurrentChemotherapy
		valueObjectDest.setConcurrentChemotherapy(valueObjectSrc.getConcurrentChemotherapy());
		// TreatmentCategory
		valueObjectDest.setTreatmentCategory(valueObjectSrc.getTreatmentCategory());
		// DiseaseStatus
		valueObjectDest.setDiseaseStatus(valueObjectSrc.getDiseaseStatus());
		// DiseaseTreatment
		valueObjectDest.setDiseaseTreatment(valueObjectSrc.getDiseaseTreatment());
		// ReasonDelay1
		valueObjectDest.setReasonDelay1(valueObjectSrc.getReasonDelay1());
		// ReasonDelay2
		valueObjectDest.setReasonDelay2(valueObjectSrc.getReasonDelay2());
		// PrescribingHCP
		valueObjectDest.setPrescribingHCP(valueObjectSrc.getPrescribingHCP());
		// PrescribedDate
		valueObjectDest.setPrescribedDate(valueObjectSrc.getPrescribedDate());
		// AssociatedTreatmentPlanAction
		valueObjectDest.setAssociatedTreatmentPlanAction(valueObjectSrc.getAssociatedTreatmentPlanAction());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// RadiotherapyType
		valueObjectDest.setRadiotherapyType(valueObjectSrc.getRadiotherapyType());
		// TreatingConsultant
		valueObjectDest.setTreatingConsultant(valueObjectSrc.getTreatingConsultant());
		// TreatementIntent
		valueObjectDest.setTreatementIntent(valueObjectSrc.getTreatementIntent());
		// AnatomicalTreatmentSite
		valueObjectDest.setAnatomicalTreatmentSite(valueObjectSrc.getAnatomicalTreatmentSite());
		// DateDecisionToTreat
		valueObjectDest.setDateDecisionToTreat(valueObjectSrc.getDateDecisionToTreat());
		// StartDate
		valueObjectDest.setStartDate(valueObjectSrc.getStartDate());
		// EpisodeOfCare
		valueObjectDest.setEpisodeOfCare(valueObjectSrc.getEpisodeOfCare());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createRadiotherapyDetailsVoCollectionFromRadiotherapyDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.RadiotherapyDetails objects.
	 */
	public static ims.oncology.vo.RadiotherapyDetailsVoCollection createRadiotherapyDetailsVoCollectionFromRadiotherapyDetails(java.util.Set domainObjectSet)	
	{
		return createRadiotherapyDetailsVoCollectionFromRadiotherapyDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.RadiotherapyDetails objects.
	 */
	public static ims.oncology.vo.RadiotherapyDetailsVoCollection createRadiotherapyDetailsVoCollectionFromRadiotherapyDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.oncology.vo.RadiotherapyDetailsVoCollection voList = new ims.oncology.vo.RadiotherapyDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.oncology.domain.objects.RadiotherapyDetails domainObject = (ims.oncology.domain.objects.RadiotherapyDetails) iterator.next();
			ims.oncology.vo.RadiotherapyDetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.oncology.domain.objects.RadiotherapyDetails objects.
	 */
	public static ims.oncology.vo.RadiotherapyDetailsVoCollection createRadiotherapyDetailsVoCollectionFromRadiotherapyDetails(java.util.List domainObjectList) 
	{
		return createRadiotherapyDetailsVoCollectionFromRadiotherapyDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.domain.objects.RadiotherapyDetails objects.
	 */
	public static ims.oncology.vo.RadiotherapyDetailsVoCollection createRadiotherapyDetailsVoCollectionFromRadiotherapyDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.oncology.vo.RadiotherapyDetailsVoCollection voList = new ims.oncology.vo.RadiotherapyDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.domain.objects.RadiotherapyDetails domainObject = (ims.oncology.domain.objects.RadiotherapyDetails) domainObjectList.get(i);
			ims.oncology.vo.RadiotherapyDetailsVo vo = create(map, domainObject);

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
	 * Create the ims.oncology.domain.objects.RadiotherapyDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractRadiotherapyDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.RadiotherapyDetailsVoCollection voCollection) 
	 {
	 	return extractRadiotherapyDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractRadiotherapyDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.RadiotherapyDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.RadiotherapyDetailsVo vo = voCollection.get(i);
			ims.oncology.domain.objects.RadiotherapyDetails domainObject = RadiotherapyDetailsVoAssembler.extractRadiotherapyDetails(domainFactory, vo, domMap);

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
	 * Create the ims.oncology.domain.objects.RadiotherapyDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractRadiotherapyDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.RadiotherapyDetailsVoCollection voCollection) 
	 {
	 	return extractRadiotherapyDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractRadiotherapyDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.RadiotherapyDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.RadiotherapyDetailsVo vo = voCollection.get(i);
			ims.oncology.domain.objects.RadiotherapyDetails domainObject = RadiotherapyDetailsVoAssembler.extractRadiotherapyDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.oncology.domain.objects.RadiotherapyDetails object.
	 * @param domainObject ims.oncology.domain.objects.RadiotherapyDetails
	 */
	 public static ims.oncology.vo.RadiotherapyDetailsVo create(ims.oncology.domain.objects.RadiotherapyDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.oncology.domain.objects.RadiotherapyDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.oncology.vo.RadiotherapyDetailsVo create(DomainObjectMap map, ims.oncology.domain.objects.RadiotherapyDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.oncology.vo.RadiotherapyDetailsVo valueObject = (ims.oncology.vo.RadiotherapyDetailsVo) map.getValueObject(domainObject, ims.oncology.vo.RadiotherapyDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.oncology.vo.RadiotherapyDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.oncology.domain.objects.RadiotherapyDetails
	 */
	 public static ims.oncology.vo.RadiotherapyDetailsVo insert(ims.oncology.vo.RadiotherapyDetailsVo valueObject, ims.oncology.domain.objects.RadiotherapyDetails domainObject) 
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
	 * @param domainObject ims.oncology.domain.objects.RadiotherapyDetails
	 */
	 public static ims.oncology.vo.RadiotherapyDetailsVo insert(DomainObjectMap map, ims.oncology.vo.RadiotherapyDetailsVo valueObject, ims.oncology.domain.objects.RadiotherapyDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_RadiotherapyDetails(domainObject.getId());
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
			
		// EndDate
		java.util.Date EndDate = domainObject.getEndDate();
		if ( null != EndDate ) 
		{
			valueObject.setEndDate(new ims.framework.utils.Date(EndDate) );
		}
		// PrescribedDose
		valueObject.setPrescribedDose(domainObject.getPrescribedDose());
		// PrescribedFractions
		valueObject.setPrescribedFractions(domainObject.getPrescribedFractions());
		// PrescribedDuration
		valueObject.setPrescribedDuration(domainObject.getPrescribedDuration());
		// TeletherapyDetails
		valueObject.setTeletherapyDetails(ims.oncology.vo.domain.TeletherapyDetailsVoAssembler.create(map, domainObject.getTeletherapyDetails()) );
		// BrachytherapyDetails
		valueObject.setBrachytherapyDetails(ims.oncology.vo.domain.BrachytherapyDetailsVoAssembler.create(map, domainObject.getBrachytherapyDetails()) );
		// TreatmentCourseStatus
		ims.domain.lookups.LookupInstance instance7 = domainObject.getTreatmentCourseStatus();
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

			ims.oncology.vo.lookups.TreatmentCourseStatus voLookup7 = new ims.oncology.vo.lookups.TreatmentCourseStatus(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.oncology.vo.lookups.TreatmentCourseStatus parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.oncology.vo.lookups.TreatmentCourseStatus(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setTreatmentCourseStatus(voLookup7);
		}
				// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// TreatingHospital
		ims.domain.lookups.LookupInstance instance9 = domainObject.getTreatingHospital();
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

			ims.oncology.vo.lookups.TreatmentHospital voLookup9 = new ims.oncology.vo.lookups.TreatmentHospital(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.oncology.vo.lookups.TreatmentHospital parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.oncology.vo.lookups.TreatmentHospital(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setTreatingHospital(voLookup9);
		}
				// PerformanceStatusAtDDT
		ims.domain.lookups.LookupInstance instance10 = domainObject.getPerformanceStatusAtDDT();
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

			ims.medicaloncology.vo.lookups.PerformanceStatus voLookup10 = new ims.medicaloncology.vo.lookups.PerformanceStatus(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.medicaloncology.vo.lookups.PerformanceStatus parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.medicaloncology.vo.lookups.PerformanceStatus(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setPerformanceStatusAtDDT(voLookup10);
		}
				// ConcurrentChemotherapy
		ims.domain.lookups.LookupInstance instance11 = domainObject.getConcurrentChemotherapy();
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

			ims.core.vo.lookups.YesNo voLookup11 = new ims.core.vo.lookups.YesNo(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.core.vo.lookups.YesNo(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setConcurrentChemotherapy(voLookup11);
		}
				// TreatmentCategory
		valueObject.setTreatmentCategory(domainObject.getTreatmentCategory());
		// DiseaseStatus
		ims.domain.lookups.LookupInstance instance13 = domainObject.getDiseaseStatus();
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

			ims.oncology.vo.lookups.DiseaseStatus voLookup13 = new ims.oncology.vo.lookups.DiseaseStatus(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.oncology.vo.lookups.DiseaseStatus parentVoLookup13 = voLookup13;
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
								parentVoLookup13.setParent(new ims.oncology.vo.lookups.DiseaseStatus(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setDiseaseStatus(voLookup13);
		}
				// DiseaseTreatment
		ims.domain.lookups.LookupInstance instance14 = domainObject.getDiseaseTreatment();
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

			ims.oncology.vo.lookups.DiseaseStatus voLookup14 = new ims.oncology.vo.lookups.DiseaseStatus(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.oncology.vo.lookups.DiseaseStatus parentVoLookup14 = voLookup14;
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
								parentVoLookup14.setParent(new ims.oncology.vo.lookups.DiseaseStatus(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setDiseaseTreatment(voLookup14);
		}
				// ReasonDelay1
		ims.domain.lookups.LookupInstance instance15 = domainObject.getReasonDelay1();
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

			ims.oncology.vo.lookups.RadiotherapyDelayReason voLookup15 = new ims.oncology.vo.lookups.RadiotherapyDelayReason(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.oncology.vo.lookups.RadiotherapyDelayReason parentVoLookup15 = voLookup15;
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
								parentVoLookup15.setParent(new ims.oncology.vo.lookups.RadiotherapyDelayReason(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setReasonDelay1(voLookup15);
		}
				// ReasonDelay2
		ims.domain.lookups.LookupInstance instance16 = domainObject.getReasonDelay2();
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

			ims.oncology.vo.lookups.RadiotherapyDelayReason voLookup16 = new ims.oncology.vo.lookups.RadiotherapyDelayReason(instance16.getId(),instance16.getText(), instance16.isActive(), null, img, color);
			ims.oncology.vo.lookups.RadiotherapyDelayReason parentVoLookup16 = voLookup16;
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
								parentVoLookup16.setParent(new ims.oncology.vo.lookups.RadiotherapyDelayReason(parent16.getId(),parent16.getText(), parent16.isActive(), null, img, color));
				parentVoLookup16 = parentVoLookup16.getParent();
								parent16 = parent16.getParent();
			}			
			valueObject.setReasonDelay2(voLookup16);
		}
				// PrescribingHCP
		valueObject.setPrescribingHCP(ims.core.vo.domain.MedicVoAssembler.create(map, domainObject.getPrescribingHCP()) );
		// PrescribedDate
		java.util.Date PrescribedDate = domainObject.getPrescribedDate();
		if ( null != PrescribedDate ) 
		{
			valueObject.setPrescribedDate(new ims.framework.utils.Date(PrescribedDate) );
		}
		// AssociatedTreatmentPlanAction
		if (domainObject.getAssociatedTreatmentPlanAction() != null)
		{
			if(domainObject.getAssociatedTreatmentPlanAction() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAssociatedTreatmentPlanAction();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAssociatedTreatmentPlanAction(new ims.oncology.vo.PatActionRefVo(id, -1));				
			}
			else
			{
				valueObject.setAssociatedTreatmentPlanAction(new ims.oncology.vo.PatActionRefVo(domainObject.getAssociatedTreatmentPlanAction().getId(), domainObject.getAssociatedTreatmentPlanAction().getVersion()));
			}
		}
		// CareContext
		valueObject.setCareContext(ims.core.vo.domain.CareContextShortVoAssembler.create(map, domainObject.getCareContext()) );
		// RadiotherapyType
		ims.domain.lookups.LookupInstance instance21 = domainObject.getRadiotherapyType();
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

			ims.oncology.vo.lookups.RadiotherapyType voLookup21 = new ims.oncology.vo.lookups.RadiotherapyType(instance21.getId(),instance21.getText(), instance21.isActive(), null, img, color);
			ims.oncology.vo.lookups.RadiotherapyType parentVoLookup21 = voLookup21;
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
								parentVoLookup21.setParent(new ims.oncology.vo.lookups.RadiotherapyType(parent21.getId(),parent21.getText(), parent21.isActive(), null, img, color));
				parentVoLookup21 = parentVoLookup21.getParent();
								parent21 = parent21.getParent();
			}			
			valueObject.setRadiotherapyType(voLookup21);
		}
				// TreatingConsultant
		valueObject.setTreatingConsultant((ims.core.vo.Hcp)ims.core.vo.domain.HcpAssembler.create(map, domainObject.getTreatingConsultant()) );
		// TreatementIntent
		ims.domain.lookups.LookupInstance instance23 = domainObject.getTreatementIntent();
		if ( null != instance23 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance23.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance23.getImage().getImageId(), instance23.getImage().getImagePath());
			}
			color = instance23.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.CancerTreatmentIntent voLookup23 = new ims.oncology.vo.lookups.CancerTreatmentIntent(instance23.getId(),instance23.getText(), instance23.isActive(), null, img, color);
			ims.oncology.vo.lookups.CancerTreatmentIntent parentVoLookup23 = voLookup23;
			ims.domain.lookups.LookupInstance parent23 = instance23.getParent();
			while (parent23 != null)
			{
				if (parent23.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent23.getImage().getImageId(), parent23.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent23.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup23.setParent(new ims.oncology.vo.lookups.CancerTreatmentIntent(parent23.getId(),parent23.getText(), parent23.isActive(), null, img, color));
				parentVoLookup23 = parentVoLookup23.getParent();
								parent23 = parent23.getParent();
			}			
			valueObject.setTreatementIntent(voLookup23);
		}
				// AnatomicalTreatmentSite
		ims.domain.lookups.LookupInstance instance24 = domainObject.getAnatomicalTreatmentSite();
		if ( null != instance24 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance24.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance24.getImage().getImageId(), instance24.getImage().getImagePath());
			}
			color = instance24.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.AnatomicalTreatmentSite voLookup24 = new ims.oncology.vo.lookups.AnatomicalTreatmentSite(instance24.getId(),instance24.getText(), instance24.isActive(), null, img, color);
			ims.oncology.vo.lookups.AnatomicalTreatmentSite parentVoLookup24 = voLookup24;
			ims.domain.lookups.LookupInstance parent24 = instance24.getParent();
			while (parent24 != null)
			{
				if (parent24.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent24.getImage().getImageId(), parent24.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent24.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup24.setParent(new ims.oncology.vo.lookups.AnatomicalTreatmentSite(parent24.getId(),parent24.getText(), parent24.isActive(), null, img, color));
				parentVoLookup24 = parentVoLookup24.getParent();
								parent24 = parent24.getParent();
			}			
			valueObject.setAnatomicalTreatmentSite(voLookup24);
		}
				// DateDecisionToTreat
		java.util.Date DateDecisionToTreat = domainObject.getDateDecisionToTreat();
		if ( null != DateDecisionToTreat ) 
		{
			valueObject.setDateDecisionToTreat(new ims.framework.utils.Date(DateDecisionToTreat) );
		}
		// StartDate
		java.util.Date StartDate = domainObject.getStartDate();
		if ( null != StartDate ) 
		{
			valueObject.setStartDate(new ims.framework.utils.Date(StartDate) );
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
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.domain.objects.RadiotherapyDetails extractRadiotherapyDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.RadiotherapyDetailsVo valueObject) 
	{
		return 	extractRadiotherapyDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.domain.objects.RadiotherapyDetails extractRadiotherapyDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.RadiotherapyDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_RadiotherapyDetails();
		ims.oncology.domain.objects.RadiotherapyDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.oncology.domain.objects.RadiotherapyDetails)domMap.get(valueObject);
			}
			// ims.oncology.vo.RadiotherapyDetailsVo ID_RadiotherapyDetails field is unknown
			domainObject = new ims.oncology.domain.objects.RadiotherapyDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_RadiotherapyDetails());
			if (domMap.get(key) != null)
			{
				return (ims.oncology.domain.objects.RadiotherapyDetails)domMap.get(key);
			}
			domainObject = (ims.oncology.domain.objects.RadiotherapyDetails) domainFactory.getDomainObject(ims.oncology.domain.objects.RadiotherapyDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_RadiotherapyDetails());

		java.util.Date value1 = null;
		ims.framework.utils.Date date1 = valueObject.getEndDate();		
		if ( date1 != null ) 
		{
			value1 = date1.getDate();
		}
		domainObject.setEndDate(value1);
		domainObject.setPrescribedDose(valueObject.getPrescribedDose());
		domainObject.setPrescribedFractions(valueObject.getPrescribedFractions());
		domainObject.setPrescribedDuration(valueObject.getPrescribedDuration());
		domainObject.setTeletherapyDetails(ims.oncology.vo.domain.TeletherapyDetailsVoAssembler.extractTeletherapyDetails(domainFactory, valueObject.getTeletherapyDetails(), domMap));
		domainObject.setBrachytherapyDetails(ims.oncology.vo.domain.BrachytherapyDetailsVoAssembler.extractBrachytherapyDetails(domainFactory, valueObject.getBrachytherapyDetails(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getTreatmentCourseStatus() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getTreatmentCourseStatus().getID());
		}
		domainObject.setTreatmentCourseStatus(value7);
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getTreatingHospital() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getTreatingHospital().getID());
		}
		domainObject.setTreatingHospital(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getPerformanceStatusAtDDT() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getPerformanceStatusAtDDT().getID());
		}
		domainObject.setPerformanceStatusAtDDT(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getConcurrentChemotherapy() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getConcurrentChemotherapy().getID());
		}
		domainObject.setConcurrentChemotherapy(value11);
		domainObject.setTreatmentCategory(valueObject.getTreatmentCategory());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getDiseaseStatus() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getDiseaseStatus().getID());
		}
		domainObject.setDiseaseStatus(value13);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getDiseaseTreatment() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getDiseaseTreatment().getID());
		}
		domainObject.setDiseaseTreatment(value14);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getReasonDelay1() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getReasonDelay1().getID());
		}
		domainObject.setReasonDelay1(value15);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getReasonDelay2() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getReasonDelay2().getID());
		}
		domainObject.setReasonDelay2(value16);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Medic value17 = null;
		if ( null != valueObject.getPrescribingHCP() ) 
		{
			if (valueObject.getPrescribingHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrescribingHCP()) != null)
				{
					value17 = (ims.core.resource.people.domain.objects.Medic)domMap.get(valueObject.getPrescribingHCP());
				}
			}
			else
			{
				value17 = (ims.core.resource.people.domain.objects.Medic)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Medic.class, valueObject.getPrescribingHCP().getBoId());
			}
		}
		domainObject.setPrescribingHCP(value17);
		java.util.Date value18 = null;
		ims.framework.utils.Date date18 = valueObject.getPrescribedDate();		
		if ( date18 != null ) 
		{
			value18 = date18.getDate();
		}
		domainObject.setPrescribedDate(value18);
		ims.oncology.domain.objects.PatAction value19 = null;
		if ( null != valueObject.getAssociatedTreatmentPlanAction() ) 
		{
			if (valueObject.getAssociatedTreatmentPlanAction().getBoId() == null)
			{
				if (domMap.get(valueObject.getAssociatedTreatmentPlanAction()) != null)
				{
					value19 = (ims.oncology.domain.objects.PatAction)domMap.get(valueObject.getAssociatedTreatmentPlanAction());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value19 = domainObject.getAssociatedTreatmentPlanAction();	
			}
			else
			{
				value19 = (ims.oncology.domain.objects.PatAction)domainFactory.getDomainObject(ims.oncology.domain.objects.PatAction.class, valueObject.getAssociatedTreatmentPlanAction().getBoId());
			}
		}
		domainObject.setAssociatedTreatmentPlanAction(value19);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.CareContext value20 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value20 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else
			{
				value20 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value20);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value21 = null;
		if ( null != valueObject.getRadiotherapyType() ) 
		{
			value21 =
				domainFactory.getLookupInstance(valueObject.getRadiotherapyType().getID());
		}
		domainObject.setRadiotherapyType(value21);
		domainObject.setTreatingConsultant(ims.core.vo.domain.HcpAssembler.extractHcp(domainFactory, (ims.core.vo.Hcp)valueObject.getTreatingConsultant(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value23 = null;
		if ( null != valueObject.getTreatementIntent() ) 
		{
			value23 =
				domainFactory.getLookupInstance(valueObject.getTreatementIntent().getID());
		}
		domainObject.setTreatementIntent(value23);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value24 = null;
		if ( null != valueObject.getAnatomicalTreatmentSite() ) 
		{
			value24 =
				domainFactory.getLookupInstance(valueObject.getAnatomicalTreatmentSite().getID());
		}
		domainObject.setAnatomicalTreatmentSite(value24);
		java.util.Date value25 = null;
		ims.framework.utils.Date date25 = valueObject.getDateDecisionToTreat();		
		if ( date25 != null ) 
		{
			value25 = date25.getDate();
		}
		domainObject.setDateDecisionToTreat(value25);
		java.util.Date value26 = null;
		ims.framework.utils.Date date26 = valueObject.getStartDate();		
		if ( date26 != null ) 
		{
			value26 = date26.getDate();
		}
		domainObject.setStartDate(value26);
		ims.core.admin.domain.objects.EpisodeOfCare value27 = null;
		if ( null != valueObject.getEpisodeOfCare() ) 
		{
			if (valueObject.getEpisodeOfCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisodeOfCare()) != null)
				{
					value27 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisodeOfCare());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value27 = domainObject.getEpisodeOfCare();	
			}
			else
			{
				value27 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisodeOfCare().getBoId());
			}
		}
		domainObject.setEpisodeOfCare(value27);

		return domainObject;
	}

}
