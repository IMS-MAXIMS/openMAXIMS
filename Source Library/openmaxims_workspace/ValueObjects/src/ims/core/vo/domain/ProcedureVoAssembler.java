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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Sinead McDermott
 */
public class ProcedureVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.ProcedureVo copy(ims.core.vo.ProcedureVo valueObjectDest, ims.core.vo.ProcedureVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Procedure(valueObjectSrc.getID_Procedure());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Activity
		valueObjectDest.setActivity(valueObjectSrc.getActivity());
		// Keywords
		valueObjectDest.setKeywords(valueObjectSrc.getKeywords());
		// SurgeonCategory
		valueObjectDest.setSurgeonCategory(valueObjectSrc.getSurgeonCategory());
		// AnaesthetistCategory
		valueObjectDest.setAnaesthetistCategory(valueObjectSrc.getAnaesthetistCategory());
		// HospitalCategory
		valueObjectDest.setHospitalCategory(valueObjectSrc.getHospitalCategory());
		// OutpatientOnlyProcedure
		valueObjectDest.setOutpatientOnlyProcedure(valueObjectSrc.getOutpatientOnlyProcedure());
		// taxonomyMap
		valueObjectDest.setTaxonomyMap(valueObjectSrc.getTaxonomyMap());
		// ProcedureName
		valueObjectDest.setProcedureName(valueObjectSrc.getProcedureName());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// procedureStatus
		valueObjectDest.setProcedureStatus(valueObjectSrc.getProcedureStatus());
		// DurationInMins
		valueObjectDest.setDurationInMins(valueObjectSrc.getDurationInMins());
		// TCILagTime
		valueObjectDest.setTCILagTime(valueObjectSrc.getTCILagTime());
		// LOS
		valueObjectDest.setLOS(valueObjectSrc.getLOS());
		// isLateralityApplicable
		valueObjectDest.setIsLateralityApplicable(valueObjectSrc.getIsLateralityApplicable());
		// isBilateralListingApplicable
		valueObjectDest.setIsBilateralListingApplicable(valueObjectSrc.getIsBilateralListingApplicable());
		// DefaultAnaestheticType
		valueObjectDest.setDefaultAnaestheticType(valueObjectSrc.getDefaultAnaestheticType());
		// GenderSpecific
		valueObjectDest.setGenderSpecific(valueObjectSrc.getGenderSpecific());
		// isEndoscopy
		valueObjectDest.setIsEndoscopy(valueObjectSrc.getIsEndoscopy());
		// EndoscopyType
		valueObjectDest.setEndoscopyType(valueObjectSrc.getEndoscopyType());
		// MedicalWL
		valueObjectDest.setMedicalWL(valueObjectSrc.getMedicalWL());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createProcedureVoCollectionFromProcedure(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.Procedure objects.
	 */
	public static ims.core.vo.ProcedureVoCollection createProcedureVoCollectionFromProcedure(java.util.Set domainObjectSet)	
	{
		return createProcedureVoCollectionFromProcedure(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.Procedure objects.
	 */
	public static ims.core.vo.ProcedureVoCollection createProcedureVoCollectionFromProcedure(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.ProcedureVoCollection voList = new ims.core.vo.ProcedureVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.Procedure domainObject = (ims.core.clinical.domain.objects.Procedure) iterator.next();
			ims.core.vo.ProcedureVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.Procedure objects.
	 */
	public static ims.core.vo.ProcedureVoCollection createProcedureVoCollectionFromProcedure(java.util.List domainObjectList) 
	{
		return createProcedureVoCollectionFromProcedure(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.Procedure objects.
	 */
	public static ims.core.vo.ProcedureVoCollection createProcedureVoCollectionFromProcedure(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.ProcedureVoCollection voList = new ims.core.vo.ProcedureVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.Procedure domainObject = (ims.core.clinical.domain.objects.Procedure) domainObjectList.get(i);
			ims.core.vo.ProcedureVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.Procedure set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractProcedureSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ProcedureVoCollection voCollection) 
	 {
	 	return extractProcedureSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractProcedureSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ProcedureVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.ProcedureVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.Procedure domainObject = ProcedureVoAssembler.extractProcedure(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.Procedure list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractProcedureList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ProcedureVoCollection voCollection) 
	 {
	 	return extractProcedureList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractProcedureList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ProcedureVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.ProcedureVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.Procedure domainObject = ProcedureVoAssembler.extractProcedure(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.Procedure object.
	 * @param domainObject ims.core.clinical.domain.objects.Procedure
	 */
	 public static ims.core.vo.ProcedureVo create(ims.core.clinical.domain.objects.Procedure domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.Procedure object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.ProcedureVo create(DomainObjectMap map, ims.core.clinical.domain.objects.Procedure domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.ProcedureVo valueObject = (ims.core.vo.ProcedureVo) map.getValueObject(domainObject, ims.core.vo.ProcedureVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.ProcedureVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.Procedure
	 */
	 public static ims.core.vo.ProcedureVo insert(ims.core.vo.ProcedureVo valueObject, ims.core.clinical.domain.objects.Procedure domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.Procedure
	 */
	 public static ims.core.vo.ProcedureVo insert(DomainObjectMap map, ims.core.vo.ProcedureVo valueObject, ims.core.clinical.domain.objects.Procedure domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Procedure(domainObject.getId());
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
			
		// Activity
		valueObject.setActivity(ims.core.vo.domain.ActivityVoAssembler.create(map, domainObject.getActivity()) );
		// Keywords
		valueObject.setKeywords(ims.core.vo.domain.KeywordVoAssembler.createKeywordVoCollectionFromKeyword(map, domainObject.getKeywords()) );
		// SurgeonCategory
		ims.domain.lookups.LookupInstance instance3 = domainObject.getSurgeonCategory();
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

			ims.clinicaladmin.vo.lookups.CaseTypeProcedure voLookup3 = new ims.clinicaladmin.vo.lookups.CaseTypeProcedure(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.clinicaladmin.vo.lookups.CaseTypeProcedure parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.clinicaladmin.vo.lookups.CaseTypeProcedure(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setSurgeonCategory(voLookup3);
		}
				// AnaesthetistCategory
		ims.domain.lookups.LookupInstance instance4 = domainObject.getAnaesthetistCategory();
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

			ims.clinicaladmin.vo.lookups.CaseTypeProcedure voLookup4 = new ims.clinicaladmin.vo.lookups.CaseTypeProcedure(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.clinicaladmin.vo.lookups.CaseTypeProcedure parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.clinicaladmin.vo.lookups.CaseTypeProcedure(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setAnaesthetistCategory(voLookup4);
		}
				// HospitalCategory
		ims.domain.lookups.LookupInstance instance5 = domainObject.getHospitalCategory();
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

			ims.clinicaladmin.vo.lookups.CaseTypeProcedure voLookup5 = new ims.clinicaladmin.vo.lookups.CaseTypeProcedure(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.clinicaladmin.vo.lookups.CaseTypeProcedure parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.clinicaladmin.vo.lookups.CaseTypeProcedure(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setHospitalCategory(voLookup5);
		}
				// OutpatientOnlyProcedure
		valueObject.setOutpatientOnlyProcedure( domainObject.isOutpatientOnlyProcedure() );
		// taxonomyMap
		valueObject.setTaxonomyMap(ims.core.vo.domain.NonUniqueTaxonomyMapVoAssembler.createNonUniqueTaxonomyMapVoCollectionFromNonUniqueTaxonomyMap(map, domainObject.getTaxonomyMap()) );
		// ProcedureName
		valueObject.setProcedureName(domainObject.getProcedureName());
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// procedureStatus
		ims.domain.lookups.LookupInstance instance10 = domainObject.getProcedureStatus();
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

			ims.core.vo.lookups.ProcedureStatus voLookup10 = new ims.core.vo.lookups.ProcedureStatus(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.ProcedureStatus parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.core.vo.lookups.ProcedureStatus(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setProcedureStatus(voLookup10);
		}
				// DurationInMins
		valueObject.setDurationInMins(domainObject.getDurationInMins());
		// TCILagTime
		valueObject.setTCILagTime(domainObject.getTCILagTime());
		// LOS
		valueObject.setLOS(domainObject.getLOS());
		// isLateralityApplicable
		valueObject.setIsLateralityApplicable( domainObject.isIsLateralityApplicable() );
		// isBilateralListingApplicable
		valueObject.setIsBilateralListingApplicable( domainObject.isIsBilateralListingApplicable() );
		// DefaultAnaestheticType
		ims.domain.lookups.LookupInstance instance16 = domainObject.getDefaultAnaestheticType();
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
			valueObject.setDefaultAnaestheticType(voLookup16);
		}
				// GenderSpecific
		ims.domain.lookups.LookupInstance instance17 = domainObject.getGenderSpecific();
		if ( null != instance17 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance17.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance17.getImage().getImageId(), instance17.getImage().getImagePath());
			}
			color = instance17.getColor();
			if (color != null) 
				color.getValue();

			ims.admin.vo.lookups.GenderSpecific voLookup17 = new ims.admin.vo.lookups.GenderSpecific(instance17.getId(),instance17.getText(), instance17.isActive(), null, img, color);
			ims.admin.vo.lookups.GenderSpecific parentVoLookup17 = voLookup17;
			ims.domain.lookups.LookupInstance parent17 = instance17.getParent();
			while (parent17 != null)
			{
				if (parent17.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent17.getImage().getImageId(), parent17.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent17.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup17.setParent(new ims.admin.vo.lookups.GenderSpecific(parent17.getId(),parent17.getText(), parent17.isActive(), null, img, color));
				parentVoLookup17 = parentVoLookup17.getParent();
								parent17 = parent17.getParent();
			}			
			valueObject.setGenderSpecific(voLookup17);
		}
				// isEndoscopy
		valueObject.setIsEndoscopy( domainObject.isIsEndoscopy() );
		// EndoscopyType
		ims.domain.lookups.LookupInstance instance19 = domainObject.getEndoscopyType();
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

			ims.core.vo.lookups.ProcedureEndoscopyType voLookup19 = new ims.core.vo.lookups.ProcedureEndoscopyType(instance19.getId(),instance19.getText(), instance19.isActive(), null, img, color);
			ims.core.vo.lookups.ProcedureEndoscopyType parentVoLookup19 = voLookup19;
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
								parentVoLookup19.setParent(new ims.core.vo.lookups.ProcedureEndoscopyType(parent19.getId(),parent19.getText(), parent19.isActive(), null, img, color));
				parentVoLookup19 = parentVoLookup19.getParent();
								parent19 = parent19.getParent();
			}			
			valueObject.setEndoscopyType(voLookup19);
		}
				// MedicalWL
		valueObject.setMedicalWL( domainObject.isMedicalWL() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.Procedure extractProcedure(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ProcedureVo valueObject) 
	{
		return 	extractProcedure(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.Procedure extractProcedure(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ProcedureVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Procedure();
		ims.core.clinical.domain.objects.Procedure domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.Procedure)domMap.get(valueObject);
			}
			// ims.core.vo.ProcedureVo ID_Procedure field is unknown
			domainObject = new ims.core.clinical.domain.objects.Procedure();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Procedure());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.Procedure)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.Procedure) domainFactory.getDomainObject(ims.core.clinical.domain.objects.Procedure.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Procedure());

		domainObject.setActivity(ims.core.vo.domain.ActivityVoAssembler.extractActivity(domainFactory, valueObject.getActivity(), domMap));
		domainObject.setKeywords(ims.core.vo.domain.KeywordVoAssembler.extractKeywordList(domainFactory, valueObject.getKeywords(), domainObject.getKeywords(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getSurgeonCategory() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getSurgeonCategory().getID());
		}
		domainObject.setSurgeonCategory(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getAnaesthetistCategory() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getAnaesthetistCategory().getID());
		}
		domainObject.setAnaesthetistCategory(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getHospitalCategory() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getHospitalCategory().getID());
		}
		domainObject.setHospitalCategory(value5);
		domainObject.setOutpatientOnlyProcedure(valueObject.getOutpatientOnlyProcedure());
		domainObject.setTaxonomyMap(ims.core.vo.domain.NonUniqueTaxonomyMapVoAssembler.extractNonUniqueTaxonomyMapList(domainFactory, valueObject.getTaxonomyMap(), domainObject.getTaxonomyMap(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getProcedureName() != null && valueObject.getProcedureName().equals(""))
		{
			valueObject.setProcedureName(null);
		}
		domainObject.setProcedureName(valueObject.getProcedureName());
		domainObject.setIsActive(valueObject.getIsActive());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getProcedureStatus() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getProcedureStatus().getID());
		}
		domainObject.setProcedureStatus(value10);
		domainObject.setDurationInMins(valueObject.getDurationInMins());
		domainObject.setTCILagTime(valueObject.getTCILagTime());
		domainObject.setLOS(valueObject.getLOS());
		domainObject.setIsLateralityApplicable(valueObject.getIsLateralityApplicable());
		domainObject.setIsBilateralListingApplicable(valueObject.getIsBilateralListingApplicable());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getDefaultAnaestheticType() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getDefaultAnaestheticType().getID());
		}
		domainObject.setDefaultAnaestheticType(value16);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value17 = null;
		if ( null != valueObject.getGenderSpecific() ) 
		{
			value17 =
				domainFactory.getLookupInstance(valueObject.getGenderSpecific().getID());
		}
		domainObject.setGenderSpecific(value17);
		domainObject.setIsEndoscopy(valueObject.getIsEndoscopy());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value19 = null;
		if ( null != valueObject.getEndoscopyType() ) 
		{
			value19 =
				domainFactory.getLookupInstance(valueObject.getEndoscopyType().getID());
		}
		domainObject.setEndoscopyType(value19);
		domainObject.setMedicalWL(valueObject.getMedicalWL());

		return domainObject;
	}

}
