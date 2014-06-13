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
public class PrimaryTumourDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.oncology.vo.PrimaryTumourDetailsVo copy(ims.oncology.vo.PrimaryTumourDetailsVo valueObjectDest, ims.oncology.vo.PrimaryTumourDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PrimaryTumourDetails(valueObjectSrc.getID_PrimaryTumourDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// Benign
		valueObjectDest.setBenign(valueObjectSrc.getBenign());
		// TumourStatus
		valueObjectDest.setTumourStatus(valueObjectSrc.getTumourStatus());
		// HistologySource
		valueObjectDest.setHistologySource(valueObjectSrc.getHistologySource());
		// DifferentatationSource
		valueObjectDest.setDifferentatationSource(valueObjectSrc.getDifferentatationSource());
		// PreTreatmentTVal
		valueObjectDest.setPreTreatmentTVal(valueObjectSrc.getPreTreatmentTVal());
		// PreTreatmentTCert
		valueObjectDest.setPreTreatmentTCert(valueObjectSrc.getPreTreatmentTCert());
		// PreTreatmentNVal
		valueObjectDest.setPreTreatmentNVal(valueObjectSrc.getPreTreatmentNVal());
		// PreTreatmentNCert
		valueObjectDest.setPreTreatmentNCert(valueObjectSrc.getPreTreatmentNCert());
		// PreTreatmentMVal
		valueObjectDest.setPreTreatmentMVal(valueObjectSrc.getPreTreatmentMVal());
		// PreTreatmentMCert
		valueObjectDest.setPreTreatmentMCert(valueObjectSrc.getPreTreatmentMCert());
		// PreTreatmentOverAllCert
		valueObjectDest.setPreTreatmentOverAllCert(valueObjectSrc.getPreTreatmentOverAllCert());
		// IntegratedTVal
		valueObjectDest.setIntegratedTVal(valueObjectSrc.getIntegratedTVal());
		// IntegratedNVal
		valueObjectDest.setIntegratedNVal(valueObjectSrc.getIntegratedNVal());
		// IntegratedMVal
		valueObjectDest.setIntegratedMVal(valueObjectSrc.getIntegratedMVal());
		// BasisofDiagnosis
		valueObjectDest.setBasisofDiagnosis(valueObjectSrc.getBasisofDiagnosis());
		// StagingClassifications
		valueObjectDest.setStagingClassifications(valueObjectSrc.getStagingClassifications());
		// PreTreatmentSerumMarker
		valueObjectDest.setPreTreatmentSerumMarker(valueObjectSrc.getPreTreatmentSerumMarker());
		// GradeofDifferentation
		valueObjectDest.setGradeofDifferentation(valueObjectSrc.getGradeofDifferentation());
		// Over45Status
		valueObjectDest.setOver45Status(valueObjectSrc.getOver45Status());
		// TumourRecurrence
		valueObjectDest.setTumourRecurrence(valueObjectSrc.getTumourRecurrence());
		// TumourVersion
		valueObjectDest.setTumourVersion(valueObjectSrc.getTumourVersion());
		// PathologicalTVal
		valueObjectDest.setPathologicalTVal(valueObjectSrc.getPathologicalTVal());
		// PathologicalNVal
		valueObjectDest.setPathologicalNVal(valueObjectSrc.getPathologicalNVal());
		// PathologicalMVal
		valueObjectDest.setPathologicalMVal(valueObjectSrc.getPathologicalMVal());
		// Assessment
		valueObjectDest.setAssessment(valueObjectSrc.getAssessment());
		// MovedToPrognostic
		valueObjectDest.setMovedToPrognostic(valueObjectSrc.getMovedToPrognostic());
		// PrognosticLocation
		valueObjectDest.setPrognosticLocation(valueObjectSrc.getPrognosticLocation());
		// PrognosticRisk
		valueObjectDest.setPrognosticRisk(valueObjectSrc.getPrognosticRisk());
		// PrognosticPSA
		valueObjectDest.setPrognosticPSA(valueObjectSrc.getPrognosticPSA());
		// PrognosticGleason
		valueObjectDest.setPrognosticGleason(valueObjectSrc.getPrognosticGleason());
		// PrognosticGrouping
		valueObjectDest.setPrognosticGrouping(valueObjectSrc.getPrognosticGrouping());
		// PrognosticGroupingCert
		valueObjectDest.setPrognosticGroupingCert(valueObjectSrc.getPrognosticGroupingCert());
		// PrognosticTVal
		valueObjectDest.setPrognosticTVal(valueObjectSrc.getPrognosticTVal());
		// PrognosticNVal
		valueObjectDest.setPrognosticNVal(valueObjectSrc.getPrognosticNVal());
		// PrognosticMVal
		valueObjectDest.setPrognosticMVal(valueObjectSrc.getPrognosticMVal());
		// PrognosticTCert
		valueObjectDest.setPrognosticTCert(valueObjectSrc.getPrognosticTCert());
		// PrognosticNCert
		valueObjectDest.setPrognosticNCert(valueObjectSrc.getPrognosticNCert());
		// PrognosticMCert
		valueObjectDest.setPrognosticMCert(valueObjectSrc.getPrognosticMCert());
		// PathologicalDate
		valueObjectDest.setPathologicalDate(valueObjectSrc.getPathologicalDate());
		// IntegratedDate
		valueObjectDest.setIntegratedDate(valueObjectSrc.getIntegratedDate());
		// PatientDiagnosis
		valueObjectDest.setPatientDiagnosis(valueObjectSrc.getPatientDiagnosis());
		// PreTreatmentOverall
		valueObjectDest.setPreTreatmentOverall(valueObjectSrc.getPreTreatmentOverall());
		// EpisodeOfCare
		valueObjectDest.setEpisodeOfCare(valueObjectSrc.getEpisodeOfCare());
		// TumourHistology
		valueObjectDest.setTumourHistology(valueObjectSrc.getTumourHistology());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// TumourGroup
		valueObjectDest.setTumourGroup(valueObjectSrc.getTumourGroup());
		// TumourSite
		valueObjectDest.setTumourSite(valueObjectSrc.getTumourSite());
		// TumourLaterality
		valueObjectDest.setTumourLaterality(valueObjectSrc.getTumourLaterality());
		// isCurrent
		valueObjectDest.setIsCurrent(valueObjectSrc.getIsCurrent());
		// EndDate
		valueObjectDest.setEndDate(valueObjectSrc.getEndDate());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPrimaryTumourDetailsVoCollectionFromPrimaryTumourDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.PrimaryTumourDetails objects.
	 */
	public static ims.oncology.vo.PrimaryTumourDetailsVoCollection createPrimaryTumourDetailsVoCollectionFromPrimaryTumourDetails(java.util.Set domainObjectSet)	
	{
		return createPrimaryTumourDetailsVoCollectionFromPrimaryTumourDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.PrimaryTumourDetails objects.
	 */
	public static ims.oncology.vo.PrimaryTumourDetailsVoCollection createPrimaryTumourDetailsVoCollectionFromPrimaryTumourDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.oncology.vo.PrimaryTumourDetailsVoCollection voList = new ims.oncology.vo.PrimaryTumourDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.oncology.domain.objects.PrimaryTumourDetails domainObject = (ims.oncology.domain.objects.PrimaryTumourDetails) iterator.next();
			ims.oncology.vo.PrimaryTumourDetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.oncology.domain.objects.PrimaryTumourDetails objects.
	 */
	public static ims.oncology.vo.PrimaryTumourDetailsVoCollection createPrimaryTumourDetailsVoCollectionFromPrimaryTumourDetails(java.util.List domainObjectList) 
	{
		return createPrimaryTumourDetailsVoCollectionFromPrimaryTumourDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.domain.objects.PrimaryTumourDetails objects.
	 */
	public static ims.oncology.vo.PrimaryTumourDetailsVoCollection createPrimaryTumourDetailsVoCollectionFromPrimaryTumourDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.oncology.vo.PrimaryTumourDetailsVoCollection voList = new ims.oncology.vo.PrimaryTumourDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.domain.objects.PrimaryTumourDetails domainObject = (ims.oncology.domain.objects.PrimaryTumourDetails) domainObjectList.get(i);
			ims.oncology.vo.PrimaryTumourDetailsVo vo = create(map, domainObject);

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
	 * Create the ims.oncology.domain.objects.PrimaryTumourDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPrimaryTumourDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.PrimaryTumourDetailsVoCollection voCollection) 
	 {
	 	return extractPrimaryTumourDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPrimaryTumourDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.PrimaryTumourDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.PrimaryTumourDetailsVo vo = voCollection.get(i);
			ims.oncology.domain.objects.PrimaryTumourDetails domainObject = PrimaryTumourDetailsVoAssembler.extractPrimaryTumourDetails(domainFactory, vo, domMap);

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
	 * Create the ims.oncology.domain.objects.PrimaryTumourDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPrimaryTumourDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.PrimaryTumourDetailsVoCollection voCollection) 
	 {
	 	return extractPrimaryTumourDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPrimaryTumourDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.PrimaryTumourDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.PrimaryTumourDetailsVo vo = voCollection.get(i);
			ims.oncology.domain.objects.PrimaryTumourDetails domainObject = PrimaryTumourDetailsVoAssembler.extractPrimaryTumourDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.oncology.domain.objects.PrimaryTumourDetails object.
	 * @param domainObject ims.oncology.domain.objects.PrimaryTumourDetails
	 */
	 public static ims.oncology.vo.PrimaryTumourDetailsVo create(ims.oncology.domain.objects.PrimaryTumourDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.oncology.domain.objects.PrimaryTumourDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.oncology.vo.PrimaryTumourDetailsVo create(DomainObjectMap map, ims.oncology.domain.objects.PrimaryTumourDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.oncology.vo.PrimaryTumourDetailsVo valueObject = (ims.oncology.vo.PrimaryTumourDetailsVo) map.getValueObject(domainObject, ims.oncology.vo.PrimaryTumourDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.oncology.vo.PrimaryTumourDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.oncology.domain.objects.PrimaryTumourDetails
	 */
	 public static ims.oncology.vo.PrimaryTumourDetailsVo insert(ims.oncology.vo.PrimaryTumourDetailsVo valueObject, ims.oncology.domain.objects.PrimaryTumourDetails domainObject) 
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
	 * @param domainObject ims.oncology.domain.objects.PrimaryTumourDetails
	 */
	 public static ims.oncology.vo.PrimaryTumourDetailsVo insert(DomainObjectMap map, ims.oncology.vo.PrimaryTumourDetailsVo valueObject, ims.oncology.domain.objects.PrimaryTumourDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PrimaryTumourDetails(domainObject.getId());
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
			
		// CareContext
		valueObject.setCareContext(ims.core.vo.domain.CareContextShortVoAssembler.create(map, domainObject.getCareContext()) );
		// Benign
		ims.domain.lookups.LookupInstance instance2 = domainObject.getBenign();
		if ( null != instance2 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance2.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance2.getImage().getImageId(), instance2.getImage().getImagePath());
			}
			color = instance2.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNoUnknown voLookup2 = new ims.core.vo.lookups.YesNoUnknown(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup2 = voLookup2;
			ims.domain.lookups.LookupInstance parent2 = instance2.getParent();
			while (parent2 != null)
			{
				if (parent2.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent2.getImage().getImageId(), parent2.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent2.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup2.setParent(new ims.core.vo.lookups.YesNoUnknown(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setBenign(voLookup2);
		}
				// TumourStatus
		ims.domain.lookups.LookupInstance instance3 = domainObject.getTumourStatus();
		if ( null != instance3 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance3.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance3.getImage().getImageId(), instance3.getImage().getImagePath());
			}
			color = instance3.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.TumourStatus voLookup3 = new ims.oncology.vo.lookups.TumourStatus(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.oncology.vo.lookups.TumourStatus parentVoLookup3 = voLookup3;
			ims.domain.lookups.LookupInstance parent3 = instance3.getParent();
			while (parent3 != null)
			{
				if (parent3.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent3.getImage().getImageId(), parent3.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent3.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup3.setParent(new ims.oncology.vo.lookups.TumourStatus(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setTumourStatus(voLookup3);
		}
				// HistologySource
		ims.domain.lookups.LookupInstance instance4 = domainObject.getHistologySource();
		if ( null != instance4 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance4.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance4.getImage().getImageId(), instance4.getImage().getImagePath());
			}
			color = instance4.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.HistologySource voLookup4 = new ims.oncology.vo.lookups.HistologySource(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.oncology.vo.lookups.HistologySource parentVoLookup4 = voLookup4;
			ims.domain.lookups.LookupInstance parent4 = instance4.getParent();
			while (parent4 != null)
			{
				if (parent4.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent4.getImage().getImageId(), parent4.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent4.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup4.setParent(new ims.oncology.vo.lookups.HistologySource(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setHistologySource(voLookup4);
		}
				// DifferentatationSource
		ims.domain.lookups.LookupInstance instance5 = domainObject.getDifferentatationSource();
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

			ims.oncology.vo.lookups.DifferentatationSource voLookup5 = new ims.oncology.vo.lookups.DifferentatationSource(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.oncology.vo.lookups.DifferentatationSource parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.oncology.vo.lookups.DifferentatationSource(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setDifferentatationSource(voLookup5);
		}
				// PreTreatmentTVal
		valueObject.setPreTreatmentTVal(ims.clinicaladmin.vo.domain.TumourGroupSiteTNMValueListVoAssembler.create(map, domainObject.getPreTreatmentTVal()) );
		// PreTreatmentTCert
		ims.domain.lookups.LookupInstance instance7 = domainObject.getPreTreatmentTCert();
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

			ims.oncology.vo.lookups.TNMCertaintyFactor voLookup7 = new ims.oncology.vo.lookups.TNMCertaintyFactor(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.oncology.vo.lookups.TNMCertaintyFactor parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.oncology.vo.lookups.TNMCertaintyFactor(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setPreTreatmentTCert(voLookup7);
		}
				// PreTreatmentNVal
		valueObject.setPreTreatmentNVal(ims.clinicaladmin.vo.domain.TumourGroupSiteTNMValueListVoAssembler.create(map, domainObject.getPreTreatmentNVal()) );
		// PreTreatmentNCert
		ims.domain.lookups.LookupInstance instance9 = domainObject.getPreTreatmentNCert();
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

			ims.oncology.vo.lookups.TNMCertaintyFactor voLookup9 = new ims.oncology.vo.lookups.TNMCertaintyFactor(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.oncology.vo.lookups.TNMCertaintyFactor parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.oncology.vo.lookups.TNMCertaintyFactor(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setPreTreatmentNCert(voLookup9);
		}
				// PreTreatmentMVal
		valueObject.setPreTreatmentMVal(ims.clinicaladmin.vo.domain.TumourGroupSiteTNMValueListVoAssembler.create(map, domainObject.getPreTreatmentMVal()) );
		// PreTreatmentMCert
		ims.domain.lookups.LookupInstance instance11 = domainObject.getPreTreatmentMCert();
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

			ims.oncology.vo.lookups.TNMCertaintyFactor voLookup11 = new ims.oncology.vo.lookups.TNMCertaintyFactor(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.oncology.vo.lookups.TNMCertaintyFactor parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.oncology.vo.lookups.TNMCertaintyFactor(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setPreTreatmentMCert(voLookup11);
		}
				// PreTreatmentOverAllCert
		ims.domain.lookups.LookupInstance instance12 = domainObject.getPreTreatmentOverAllCert();
		if ( null != instance12 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance12.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance12.getImage().getImageId(), instance12.getImage().getImagePath());
			}
			color = instance12.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.TNMCertaintyFactor voLookup12 = new ims.oncology.vo.lookups.TNMCertaintyFactor(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.oncology.vo.lookups.TNMCertaintyFactor parentVoLookup12 = voLookup12;
			ims.domain.lookups.LookupInstance parent12 = instance12.getParent();
			while (parent12 != null)
			{
				if (parent12.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent12.getImage().getImageId(), parent12.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent12.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup12.setParent(new ims.oncology.vo.lookups.TNMCertaintyFactor(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setPreTreatmentOverAllCert(voLookup12);
		}
				// IntegratedTVal
		valueObject.setIntegratedTVal(ims.clinicaladmin.vo.domain.TumourGroupSiteTNMValueListVoAssembler.create(map, domainObject.getIntegratedTVal()) );
		// IntegratedNVal
		valueObject.setIntegratedNVal(ims.clinicaladmin.vo.domain.TumourGroupSiteTNMValueListVoAssembler.create(map, domainObject.getIntegratedNVal()) );
		// IntegratedMVal
		valueObject.setIntegratedMVal(ims.clinicaladmin.vo.domain.TumourGroupSiteTNMValueListVoAssembler.create(map, domainObject.getIntegratedMVal()) );
		// BasisofDiagnosis
		ims.domain.lookups.LookupInstance instance16 = domainObject.getBasisofDiagnosis();
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

			ims.core.vo.lookups.DiagnosisBasisofDiagnosis voLookup16 = new ims.core.vo.lookups.DiagnosisBasisofDiagnosis(instance16.getId(),instance16.getText(), instance16.isActive(), null, img, color);
			ims.core.vo.lookups.DiagnosisBasisofDiagnosis parentVoLookup16 = voLookup16;
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
								parentVoLookup16.setParent(new ims.core.vo.lookups.DiagnosisBasisofDiagnosis(parent16.getId(),parent16.getText(), parent16.isActive(), null, img, color));
				parentVoLookup16 = parentVoLookup16.getParent();
								parent16 = parent16.getParent();
			}			
			valueObject.setBasisofDiagnosis(voLookup16);
		}
				// StagingClassifications
		valueObject.setStagingClassifications(ims.oncology.vo.domain.PatientTumourClassificationVoAssembler.createPatientTumourClassificationVoCollectionFromPatientTumourClassification(map, domainObject.getStagingClassifications()) );
		// PreTreatmentSerumMarker
		valueObject.setPreTreatmentSerumMarker(ims.clinicaladmin.vo.domain.TumourSerumMarkersLiteVoAssembler.create(map, domainObject.getPreTreatmentSerumMarker()) );
		// GradeofDifferentation
		valueObject.setGradeofDifferentation(ims.clinicaladmin.vo.domain.HistopathologicGradeVoAssembler.create(map, domainObject.getGradeofDifferentation()) );
		// Over45Status
		valueObject.setOver45Status(domainObject.getOver45Status());
		// TumourRecurrence
		valueObject.setTumourRecurrence(ims.clinicaladmin.vo.domain.PatientTumourRecurrenceVoAssembler.createPatientTumourRecurrenceVoCollectionFromPatientTumourRecurrence(map, domainObject.getTumourRecurrence()) );
		// TumourVersion
		valueObject.setTumourVersion(ims.clinicaladmin.vo.domain.TNMStagingClassificationVersionLiteVoAssembler.create(map, domainObject.getTumourVersion()) );
		// PathologicalTVal
		valueObject.setPathologicalTVal(ims.clinicaladmin.vo.domain.TumourGroupSiteTNMValueListVoAssembler.create(map, domainObject.getPathologicalTVal()) );
		// PathologicalNVal
		valueObject.setPathologicalNVal(ims.clinicaladmin.vo.domain.TumourGroupSiteTNMValueListVoAssembler.create(map, domainObject.getPathologicalNVal()) );
		// PathologicalMVal
		valueObject.setPathologicalMVal(ims.clinicaladmin.vo.domain.TumourGroupSiteTNMValueListVoAssembler.create(map, domainObject.getPathologicalMVal()) );
		// Assessment
		valueObject.setAssessment(ims.assessment.vo.domain.PatientAssessmentVoAssembler.create(map, domainObject.getAssessment()) );
		// MovedToPrognostic
		valueObject.setMovedToPrognostic( domainObject.isMovedToPrognostic() );
		// PrognosticLocation
		valueObject.setPrognosticLocation(ims.oncology.vo.domain.PrognosticLocationConfigVoAssembler.create(map, domainObject.getPrognosticLocation()) );
		// PrognosticRisk
		valueObject.setPrognosticRisk(ims.clinicaladmin.vo.domain.PrognosticRiskConfigVoAssembler.create(map, domainObject.getPrognosticRisk()) );
		// PrognosticPSA
		valueObject.setPrognosticPSA(ims.clinicaladmin.vo.domain.PSAConfigVoAssembler.create(map, domainObject.getPrognosticPSA()) );
		// PrognosticGleason
		valueObject.setPrognosticGleason(ims.clinicaladmin.vo.domain.GleasonConfigLiteVoAssembler.create(map, domainObject.getPrognosticGleason()) );
		// PrognosticGrouping
		valueObject.setPrognosticGrouping(ims.clinicaladmin.vo.domain.OverallPrognosticGroupingLiteVoAssembler.create(map, domainObject.getPrognosticGrouping()) );
		// PrognosticGroupingCert
		ims.domain.lookups.LookupInstance instance33 = domainObject.getPrognosticGroupingCert();
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

			ims.oncology.vo.lookups.TNMCertaintyFactor voLookup33 = new ims.oncology.vo.lookups.TNMCertaintyFactor(instance33.getId(),instance33.getText(), instance33.isActive(), null, img, color);
			ims.oncology.vo.lookups.TNMCertaintyFactor parentVoLookup33 = voLookup33;
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
								parentVoLookup33.setParent(new ims.oncology.vo.lookups.TNMCertaintyFactor(parent33.getId(),parent33.getText(), parent33.isActive(), null, img, color));
				parentVoLookup33 = parentVoLookup33.getParent();
								parent33 = parent33.getParent();
			}			
			valueObject.setPrognosticGroupingCert(voLookup33);
		}
				// PrognosticTVal
		valueObject.setPrognosticTVal(ims.clinicaladmin.vo.domain.TumourGroupSiteTNMValueListVoAssembler.create(map, domainObject.getPrognosticTVal()) );
		// PrognosticNVal
		valueObject.setPrognosticNVal(ims.clinicaladmin.vo.domain.TumourGroupSiteTNMValueListVoAssembler.create(map, domainObject.getPrognosticNVal()) );
		// PrognosticMVal
		valueObject.setPrognosticMVal(ims.clinicaladmin.vo.domain.TumourGroupSiteTNMValueListVoAssembler.create(map, domainObject.getPrognosticMVal()) );
		// PrognosticTCert
		ims.domain.lookups.LookupInstance instance37 = domainObject.getPrognosticTCert();
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

			ims.oncology.vo.lookups.TNMCertaintyFactor voLookup37 = new ims.oncology.vo.lookups.TNMCertaintyFactor(instance37.getId(),instance37.getText(), instance37.isActive(), null, img, color);
			ims.oncology.vo.lookups.TNMCertaintyFactor parentVoLookup37 = voLookup37;
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
								parentVoLookup37.setParent(new ims.oncology.vo.lookups.TNMCertaintyFactor(parent37.getId(),parent37.getText(), parent37.isActive(), null, img, color));
				parentVoLookup37 = parentVoLookup37.getParent();
								parent37 = parent37.getParent();
			}			
			valueObject.setPrognosticTCert(voLookup37);
		}
				// PrognosticNCert
		ims.domain.lookups.LookupInstance instance38 = domainObject.getPrognosticNCert();
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

			ims.oncology.vo.lookups.TNMCertaintyFactor voLookup38 = new ims.oncology.vo.lookups.TNMCertaintyFactor(instance38.getId(),instance38.getText(), instance38.isActive(), null, img, color);
			ims.oncology.vo.lookups.TNMCertaintyFactor parentVoLookup38 = voLookup38;
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
								parentVoLookup38.setParent(new ims.oncology.vo.lookups.TNMCertaintyFactor(parent38.getId(),parent38.getText(), parent38.isActive(), null, img, color));
				parentVoLookup38 = parentVoLookup38.getParent();
								parent38 = parent38.getParent();
			}			
			valueObject.setPrognosticNCert(voLookup38);
		}
				// PrognosticMCert
		ims.domain.lookups.LookupInstance instance39 = domainObject.getPrognosticMCert();
		if ( null != instance39 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance39.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance39.getImage().getImageId(), instance39.getImage().getImagePath());
			}
			color = instance39.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.TNMCertaintyFactor voLookup39 = new ims.oncology.vo.lookups.TNMCertaintyFactor(instance39.getId(),instance39.getText(), instance39.isActive(), null, img, color);
			ims.oncology.vo.lookups.TNMCertaintyFactor parentVoLookup39 = voLookup39;
			ims.domain.lookups.LookupInstance parent39 = instance39.getParent();
			while (parent39 != null)
			{
				if (parent39.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent39.getImage().getImageId(), parent39.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent39.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup39.setParent(new ims.oncology.vo.lookups.TNMCertaintyFactor(parent39.getId(),parent39.getText(), parent39.isActive(), null, img, color));
				parentVoLookup39 = parentVoLookup39.getParent();
								parent39 = parent39.getParent();
			}			
			valueObject.setPrognosticMCert(voLookup39);
		}
				// PathologicalDate
		java.util.Date PathologicalDate = domainObject.getPathologicalDate();
		if ( null != PathologicalDate ) 
		{
			valueObject.setPathologicalDate(new ims.framework.utils.Date(PathologicalDate) );
		}
		// IntegratedDate
		java.util.Date IntegratedDate = domainObject.getIntegratedDate();
		if ( null != IntegratedDate ) 
		{
			valueObject.setIntegratedDate(new ims.framework.utils.Date(IntegratedDate) );
		}
		// PatientDiagnosis
		valueObject.setPatientDiagnosis(ims.oncology.vo.domain.PatientDiagnosisForPrimaryTumourVoAssembler.create(map, domainObject.getPatientDiagnosis()) );
		// PreTreatmentOverall
		valueObject.setPreTreatmentOverall(ims.clinicaladmin.vo.domain.TumourGroupSiteOverallStagingVoAssembler.create(map, domainObject.getPreTreatmentOverall()) );
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
		// TumourHistology
		valueObject.setTumourHistology(ims.clinicaladmin.vo.domain.TumourHistologyLiteVoAssembler.create(map, domainObject.getTumourHistology()) );
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// TumourGroup
		valueObject.setTumourGroup(ims.clinicaladmin.vo.domain.TumourGroupLiteVoAssembler.create(map, domainObject.getTumourGroup()) );
		// TumourSite
		valueObject.setTumourSite(ims.clinicaladmin.vo.domain.TumourSiteLiteVoAssembler.create(map, domainObject.getTumourSite()) );
		// TumourLaterality
		ims.domain.lookups.LookupInstance instance49 = domainObject.getTumourLaterality();
		if ( null != instance49 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance49.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance49.getImage().getImageId(), instance49.getImage().getImagePath());
			}
			color = instance49.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.LateralityLRB voLookup49 = new ims.core.vo.lookups.LateralityLRB(instance49.getId(),instance49.getText(), instance49.isActive(), null, img, color);
			ims.core.vo.lookups.LateralityLRB parentVoLookup49 = voLookup49;
			ims.domain.lookups.LookupInstance parent49 = instance49.getParent();
			while (parent49 != null)
			{
				if (parent49.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent49.getImage().getImageId(), parent49.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent49.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup49.setParent(new ims.core.vo.lookups.LateralityLRB(parent49.getId(),parent49.getText(), parent49.isActive(), null, img, color));
				parentVoLookup49 = parentVoLookup49.getParent();
								parent49 = parent49.getParent();
			}			
			valueObject.setTumourLaterality(voLookup49);
		}
				// isCurrent
		valueObject.setIsCurrent( domainObject.isIsCurrent() );
		// EndDate
		java.util.Date EndDate = domainObject.getEndDate();
		if ( null != EndDate ) 
		{
			valueObject.setEndDate(new ims.framework.utils.Date(EndDate) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.domain.objects.PrimaryTumourDetails extractPrimaryTumourDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.PrimaryTumourDetailsVo valueObject) 
	{
		return 	extractPrimaryTumourDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.domain.objects.PrimaryTumourDetails extractPrimaryTumourDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.PrimaryTumourDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PrimaryTumourDetails();
		ims.oncology.domain.objects.PrimaryTumourDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.oncology.domain.objects.PrimaryTumourDetails)domMap.get(valueObject);
			}
			// ims.oncology.vo.PrimaryTumourDetailsVo ID_PrimaryTumourDetails field is unknown
			domainObject = new ims.oncology.domain.objects.PrimaryTumourDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PrimaryTumourDetails());
			if (domMap.get(key) != null)
			{
				return (ims.oncology.domain.objects.PrimaryTumourDetails)domMap.get(key);
			}
			domainObject = (ims.oncology.domain.objects.PrimaryTumourDetails) domainFactory.getDomainObject(ims.oncology.domain.objects.PrimaryTumourDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PrimaryTumourDetails());

		domainObject.setCareContext(ims.core.vo.domain.CareContextShortVoAssembler.extractCareContext(domainFactory, valueObject.getCareContext(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getBenign() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getBenign().getID());
		}
		domainObject.setBenign(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getTumourStatus() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getTumourStatus().getID());
		}
		domainObject.setTumourStatus(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getHistologySource() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getHistologySource().getID());
		}
		domainObject.setHistologySource(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getDifferentatationSource() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getDifferentatationSource().getID());
		}
		domainObject.setDifferentatationSource(value5);
		domainObject.setPreTreatmentTVal(ims.clinicaladmin.vo.domain.TumourGroupSiteTNMValueListVoAssembler.extractTumourGroupSiteTNMValue(domainFactory, valueObject.getPreTreatmentTVal(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getPreTreatmentTCert() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getPreTreatmentTCert().getID());
		}
		domainObject.setPreTreatmentTCert(value7);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue value8 = null;
		if ( null != valueObject.getPreTreatmentNVal() ) 
		{
			if (valueObject.getPreTreatmentNVal().getBoId() == null)
			{
				if (domMap.get(valueObject.getPreTreatmentNVal()) != null)
				{
					value8 = (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue)domMap.get(valueObject.getPreTreatmentNVal());
				}
			}
			else
			{
				value8 = (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.class, valueObject.getPreTreatmentNVal().getBoId());
			}
		}
		domainObject.setPreTreatmentNVal(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getPreTreatmentNCert() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getPreTreatmentNCert().getID());
		}
		domainObject.setPreTreatmentNCert(value9);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue value10 = null;
		if ( null != valueObject.getPreTreatmentMVal() ) 
		{
			if (valueObject.getPreTreatmentMVal().getBoId() == null)
			{
				if (domMap.get(valueObject.getPreTreatmentMVal()) != null)
				{
					value10 = (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue)domMap.get(valueObject.getPreTreatmentMVal());
				}
			}
			else
			{
				value10 = (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.class, valueObject.getPreTreatmentMVal().getBoId());
			}
		}
		domainObject.setPreTreatmentMVal(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getPreTreatmentMCert() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getPreTreatmentMCert().getID());
		}
		domainObject.setPreTreatmentMCert(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getPreTreatmentOverAllCert() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getPreTreatmentOverAllCert().getID());
		}
		domainObject.setPreTreatmentOverAllCert(value12);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue value13 = null;
		if ( null != valueObject.getIntegratedTVal() ) 
		{
			if (valueObject.getIntegratedTVal().getBoId() == null)
			{
				if (domMap.get(valueObject.getIntegratedTVal()) != null)
				{
					value13 = (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue)domMap.get(valueObject.getIntegratedTVal());
				}
			}
			else
			{
				value13 = (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.class, valueObject.getIntegratedTVal().getBoId());
			}
		}
		domainObject.setIntegratedTVal(value13);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue value14 = null;
		if ( null != valueObject.getIntegratedNVal() ) 
		{
			if (valueObject.getIntegratedNVal().getBoId() == null)
			{
				if (domMap.get(valueObject.getIntegratedNVal()) != null)
				{
					value14 = (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue)domMap.get(valueObject.getIntegratedNVal());
				}
			}
			else
			{
				value14 = (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.class, valueObject.getIntegratedNVal().getBoId());
			}
		}
		domainObject.setIntegratedNVal(value14);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue value15 = null;
		if ( null != valueObject.getIntegratedMVal() ) 
		{
			if (valueObject.getIntegratedMVal().getBoId() == null)
			{
				if (domMap.get(valueObject.getIntegratedMVal()) != null)
				{
					value15 = (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue)domMap.get(valueObject.getIntegratedMVal());
				}
			}
			else
			{
				value15 = (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.class, valueObject.getIntegratedMVal().getBoId());
			}
		}
		domainObject.setIntegratedMVal(value15);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getBasisofDiagnosis() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getBasisofDiagnosis().getID());
		}
		domainObject.setBasisofDiagnosis(value16);
		domainObject.setStagingClassifications(ims.oncology.vo.domain.PatientTumourClassificationVoAssembler.extractPatientTumourClassificationSet(domainFactory, valueObject.getStagingClassifications(), domainObject.getStagingClassifications(), domMap));		
		domainObject.setPreTreatmentSerumMarker(ims.clinicaladmin.vo.domain.TumourSerumMarkersLiteVoAssembler.extractTumourSerumMarker(domainFactory, valueObject.getPreTreatmentSerumMarker(), domMap));
		domainObject.setGradeofDifferentation(ims.clinicaladmin.vo.domain.HistopathologicGradeVoAssembler.extractHistopathologicGrade(domainFactory, valueObject.getGradeofDifferentation(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOver45Status() != null && valueObject.getOver45Status().equals(""))
		{
			valueObject.setOver45Status(null);
		}
		domainObject.setOver45Status(valueObject.getOver45Status());
		domainObject.setTumourRecurrence(ims.clinicaladmin.vo.domain.PatientTumourRecurrenceVoAssembler.extractPatientTumourRecurrenceSet(domainFactory, valueObject.getTumourRecurrence(), domainObject.getTumourRecurrence(), domMap));		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion value22 = null;
		if ( null != valueObject.getTumourVersion() ) 
		{
			if (valueObject.getTumourVersion().getBoId() == null)
			{
				if (domMap.get(valueObject.getTumourVersion()) != null)
				{
					value22 = (ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion)domMap.get(valueObject.getTumourVersion());
				}
			}
			else
			{
				value22 = (ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion.class, valueObject.getTumourVersion().getBoId());
			}
		}
		domainObject.setTumourVersion(value22);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue value23 = null;
		if ( null != valueObject.getPathologicalTVal() ) 
		{
			if (valueObject.getPathologicalTVal().getBoId() == null)
			{
				if (domMap.get(valueObject.getPathologicalTVal()) != null)
				{
					value23 = (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue)domMap.get(valueObject.getPathologicalTVal());
				}
			}
			else
			{
				value23 = (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.class, valueObject.getPathologicalTVal().getBoId());
			}
		}
		domainObject.setPathologicalTVal(value23);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue value24 = null;
		if ( null != valueObject.getPathologicalNVal() ) 
		{
			if (valueObject.getPathologicalNVal().getBoId() == null)
			{
				if (domMap.get(valueObject.getPathologicalNVal()) != null)
				{
					value24 = (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue)domMap.get(valueObject.getPathologicalNVal());
				}
			}
			else
			{
				value24 = (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.class, valueObject.getPathologicalNVal().getBoId());
			}
		}
		domainObject.setPathologicalNVal(value24);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue value25 = null;
		if ( null != valueObject.getPathologicalMVal() ) 
		{
			if (valueObject.getPathologicalMVal().getBoId() == null)
			{
				if (domMap.get(valueObject.getPathologicalMVal()) != null)
				{
					value25 = (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue)domMap.get(valueObject.getPathologicalMVal());
				}
			}
			else
			{
				value25 = (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.class, valueObject.getPathologicalMVal().getBoId());
			}
		}
		domainObject.setPathologicalMVal(value25);
		domainObject.setAssessment(ims.assessment.vo.domain.PatientAssessmentVoAssembler.extractPatientAssessment(domainFactory, valueObject.getAssessment(), domMap));
		domainObject.setMovedToPrognostic(valueObject.getMovedToPrognostic());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.PrognosticLocationConfig value28 = null;
		if ( null != valueObject.getPrognosticLocation() ) 
		{
			if (valueObject.getPrognosticLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrognosticLocation()) != null)
				{
					value28 = (ims.oncology.configuration.domain.objects.PrognosticLocationConfig)domMap.get(valueObject.getPrognosticLocation());
				}
			}
			else
			{
				value28 = (ims.oncology.configuration.domain.objects.PrognosticLocationConfig)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.PrognosticLocationConfig.class, valueObject.getPrognosticLocation().getBoId());
			}
		}
		domainObject.setPrognosticLocation(value28);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.PrognosticRiskConfiguration value29 = null;
		if ( null != valueObject.getPrognosticRisk() ) 
		{
			if (valueObject.getPrognosticRisk().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrognosticRisk()) != null)
				{
					value29 = (ims.oncology.configuration.domain.objects.PrognosticRiskConfiguration)domMap.get(valueObject.getPrognosticRisk());
				}
			}
			else
			{
				value29 = (ims.oncology.configuration.domain.objects.PrognosticRiskConfiguration)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.PrognosticRiskConfiguration.class, valueObject.getPrognosticRisk().getBoId());
			}
		}
		domainObject.setPrognosticRisk(value29);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.PSAConfig value30 = null;
		if ( null != valueObject.getPrognosticPSA() ) 
		{
			if (valueObject.getPrognosticPSA().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrognosticPSA()) != null)
				{
					value30 = (ims.oncology.configuration.domain.objects.PSAConfig)domMap.get(valueObject.getPrognosticPSA());
				}
			}
			else
			{
				value30 = (ims.oncology.configuration.domain.objects.PSAConfig)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.PSAConfig.class, valueObject.getPrognosticPSA().getBoId());
			}
		}
		domainObject.setPrognosticPSA(value30);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.GleasonConfig value31 = null;
		if ( null != valueObject.getPrognosticGleason() ) 
		{
			if (valueObject.getPrognosticGleason().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrognosticGleason()) != null)
				{
					value31 = (ims.oncology.configuration.domain.objects.GleasonConfig)domMap.get(valueObject.getPrognosticGleason());
				}
			}
			else
			{
				value31 = (ims.oncology.configuration.domain.objects.GleasonConfig)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.GleasonConfig.class, valueObject.getPrognosticGleason().getBoId());
			}
		}
		domainObject.setPrognosticGleason(value31);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.PrognosticGrouping value32 = null;
		if ( null != valueObject.getPrognosticGrouping() ) 
		{
			if (valueObject.getPrognosticGrouping().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrognosticGrouping()) != null)
				{
					value32 = (ims.oncology.configuration.domain.objects.PrognosticGrouping)domMap.get(valueObject.getPrognosticGrouping());
				}
			}
			else
			{
				value32 = (ims.oncology.configuration.domain.objects.PrognosticGrouping)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.PrognosticGrouping.class, valueObject.getPrognosticGrouping().getBoId());
			}
		}
		domainObject.setPrognosticGrouping(value32);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value33 = null;
		if ( null != valueObject.getPrognosticGroupingCert() ) 
		{
			value33 =
				domainFactory.getLookupInstance(valueObject.getPrognosticGroupingCert().getID());
		}
		domainObject.setPrognosticGroupingCert(value33);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue value34 = null;
		if ( null != valueObject.getPrognosticTVal() ) 
		{
			if (valueObject.getPrognosticTVal().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrognosticTVal()) != null)
				{
					value34 = (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue)domMap.get(valueObject.getPrognosticTVal());
				}
			}
			else
			{
				value34 = (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.class, valueObject.getPrognosticTVal().getBoId());
			}
		}
		domainObject.setPrognosticTVal(value34);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue value35 = null;
		if ( null != valueObject.getPrognosticNVal() ) 
		{
			if (valueObject.getPrognosticNVal().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrognosticNVal()) != null)
				{
					value35 = (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue)domMap.get(valueObject.getPrognosticNVal());
				}
			}
			else
			{
				value35 = (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.class, valueObject.getPrognosticNVal().getBoId());
			}
		}
		domainObject.setPrognosticNVal(value35);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue value36 = null;
		if ( null != valueObject.getPrognosticMVal() ) 
		{
			if (valueObject.getPrognosticMVal().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrognosticMVal()) != null)
				{
					value36 = (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue)domMap.get(valueObject.getPrognosticMVal());
				}
			}
			else
			{
				value36 = (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.class, valueObject.getPrognosticMVal().getBoId());
			}
		}
		domainObject.setPrognosticMVal(value36);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value37 = null;
		if ( null != valueObject.getPrognosticTCert() ) 
		{
			value37 =
				domainFactory.getLookupInstance(valueObject.getPrognosticTCert().getID());
		}
		domainObject.setPrognosticTCert(value37);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value38 = null;
		if ( null != valueObject.getPrognosticNCert() ) 
		{
			value38 =
				domainFactory.getLookupInstance(valueObject.getPrognosticNCert().getID());
		}
		domainObject.setPrognosticNCert(value38);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value39 = null;
		if ( null != valueObject.getPrognosticMCert() ) 
		{
			value39 =
				domainFactory.getLookupInstance(valueObject.getPrognosticMCert().getID());
		}
		domainObject.setPrognosticMCert(value39);
		java.util.Date value40 = null;
		ims.framework.utils.Date date40 = valueObject.getPathologicalDate();		
		if ( date40 != null ) 
		{
			value40 = date40.getDate();
		}
		domainObject.setPathologicalDate(value40);
		java.util.Date value41 = null;
		ims.framework.utils.Date date41 = valueObject.getIntegratedDate();		
		if ( date41 != null ) 
		{
			value41 = date41.getDate();
		}
		domainObject.setIntegratedDate(value41);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.PatientDiagnosis value42 = null;
		if ( null != valueObject.getPatientDiagnosis() ) 
		{
			if (valueObject.getPatientDiagnosis().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatientDiagnosis()) != null)
				{
					value42 = (ims.core.clinical.domain.objects.PatientDiagnosis)domMap.get(valueObject.getPatientDiagnosis());
				}
			}
			else
			{
				value42 = (ims.core.clinical.domain.objects.PatientDiagnosis)domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientDiagnosis.class, valueObject.getPatientDiagnosis().getBoId());
			}
		}
		domainObject.setPatientDiagnosis(value42);
		domainObject.setPreTreatmentOverall(ims.clinicaladmin.vo.domain.TumourGroupSiteOverallStagingVoAssembler.extractTumourGroupSiteOverallStaging(domainFactory, valueObject.getPreTreatmentOverall(), domMap));
		ims.core.admin.domain.objects.EpisodeOfCare value44 = null;
		if ( null != valueObject.getEpisodeOfCare() ) 
		{
			if (valueObject.getEpisodeOfCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisodeOfCare()) != null)
				{
					value44 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisodeOfCare());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value44 = domainObject.getEpisodeOfCare();	
			}
			else
			{
				value44 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisodeOfCare().getBoId());
			}
		}
		domainObject.setEpisodeOfCare(value44);
		domainObject.setTumourHistology(ims.clinicaladmin.vo.domain.TumourHistologyLiteVoAssembler.extractTumourHistology(domainFactory, valueObject.getTumourHistology(), domMap));
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.TumourGroup value47 = null;
		if ( null != valueObject.getTumourGroup() ) 
		{
			if (valueObject.getTumourGroup().getBoId() == null)
			{
				if (domMap.get(valueObject.getTumourGroup()) != null)
				{
					value47 = (ims.oncology.configuration.domain.objects.TumourGroup)domMap.get(valueObject.getTumourGroup());
				}
			}
			else
			{
				value47 = (ims.oncology.configuration.domain.objects.TumourGroup)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.TumourGroup.class, valueObject.getTumourGroup().getBoId());
			}
		}
		domainObject.setTumourGroup(value47);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.TumourSite value48 = null;
		if ( null != valueObject.getTumourSite() ) 
		{
			if (valueObject.getTumourSite().getBoId() == null)
			{
				if (domMap.get(valueObject.getTumourSite()) != null)
				{
					value48 = (ims.oncology.configuration.domain.objects.TumourSite)domMap.get(valueObject.getTumourSite());
				}
			}
			else
			{
				value48 = (ims.oncology.configuration.domain.objects.TumourSite)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.TumourSite.class, valueObject.getTumourSite().getBoId());
			}
		}
		domainObject.setTumourSite(value48);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value49 = null;
		if ( null != valueObject.getTumourLaterality() ) 
		{
			value49 =
				domainFactory.getLookupInstance(valueObject.getTumourLaterality().getID());
		}
		domainObject.setTumourLaterality(value49);
		domainObject.setIsCurrent(valueObject.getIsCurrent());
		java.util.Date value51 = null;
		ims.framework.utils.Date date51 = valueObject.getEndDate();		
		if ( date51 != null ) 
		{
			value51 = date51.getDate();
		}
		domainObject.setEndDate(value51);

		return domainObject;
	}

}
