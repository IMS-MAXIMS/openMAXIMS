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
package ims.nursing.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Sinead McDermott
 */
public class PainAssessmentFindingsAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.nursing.vo.PainAssessmentFindings copy(ims.nursing.vo.PainAssessmentFindings valueObjectDest, ims.nursing.vo.PainAssessmentFindings valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PainAssessmentFindings(valueObjectSrc.getID_PainAssessmentFindings());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// SiteImage
		valueObjectDest.setSiteImage(valueObjectSrc.getSiteImage());
		// SiteName
		valueObjectDest.setSiteName(valueObjectSrc.getSiteName());
		// PainHypersensitivity
		valueObjectDest.setPainHypersensitivity(valueObjectSrc.getPainHypersensitivity());
		// PainAssessmentReview
		valueObjectDest.setPainAssessmentReview(valueObjectSrc.getPainAssessmentReview());
		// isDiscontinuedAssess
		valueObjectDest.setIsDiscontinuedAssess(valueObjectSrc.getIsDiscontinuedAssess());
		// isContinuedAssessment
		valueObjectDest.setIsContinuedAssessment(valueObjectSrc.getIsContinuedAssessment());
		// SiteDetails
		valueObjectDest.setSiteDetails(valueObjectSrc.getSiteDetails());
		// Type
		valueObjectDest.setType(valueObjectSrc.getType());
		// Severity
		valueObjectDest.setSeverity(valueObjectSrc.getSeverity());
		// Onset
		valueObjectDest.setOnset(valueObjectSrc.getOnset());
		// Progression
		valueObjectDest.setProgression(valueObjectSrc.getProgression());
		// Depth
		valueObjectDest.setDepth(valueObjectSrc.getDepth());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPainAssessmentFindingsCollectionFromPainAssessmentFindings(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.nursing.assessmenttools.domain.objects.PainAssessmentFindings objects.
	 */
	public static ims.nursing.vo.PainAssessmentFindingsCollection createPainAssessmentFindingsCollectionFromPainAssessmentFindings(java.util.Set domainObjectSet)	
	{
		return createPainAssessmentFindingsCollectionFromPainAssessmentFindings(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.nursing.assessmenttools.domain.objects.PainAssessmentFindings objects.
	 */
	public static ims.nursing.vo.PainAssessmentFindingsCollection createPainAssessmentFindingsCollectionFromPainAssessmentFindings(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.nursing.vo.PainAssessmentFindingsCollection voList = new ims.nursing.vo.PainAssessmentFindingsCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.nursing.assessmenttools.domain.objects.PainAssessmentFindings domainObject = (ims.nursing.assessmenttools.domain.objects.PainAssessmentFindings) iterator.next();
			ims.nursing.vo.PainAssessmentFindings vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.nursing.assessmenttools.domain.objects.PainAssessmentFindings objects.
	 */
	public static ims.nursing.vo.PainAssessmentFindingsCollection createPainAssessmentFindingsCollectionFromPainAssessmentFindings(java.util.List domainObjectList) 
	{
		return createPainAssessmentFindingsCollectionFromPainAssessmentFindings(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.nursing.assessmenttools.domain.objects.PainAssessmentFindings objects.
	 */
	public static ims.nursing.vo.PainAssessmentFindingsCollection createPainAssessmentFindingsCollectionFromPainAssessmentFindings(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.nursing.vo.PainAssessmentFindingsCollection voList = new ims.nursing.vo.PainAssessmentFindingsCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.nursing.assessmenttools.domain.objects.PainAssessmentFindings domainObject = (ims.nursing.assessmenttools.domain.objects.PainAssessmentFindings) domainObjectList.get(i);
			ims.nursing.vo.PainAssessmentFindings vo = create(map, domainObject);

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
	 * Create the ims.nursing.assessmenttools.domain.objects.PainAssessmentFindings set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPainAssessmentFindingsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PainAssessmentFindingsCollection voCollection) 
	 {
	 	return extractPainAssessmentFindingsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPainAssessmentFindingsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PainAssessmentFindingsCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.PainAssessmentFindings vo = voCollection.get(i);
			ims.nursing.assessmenttools.domain.objects.PainAssessmentFindings domainObject = PainAssessmentFindingsAssembler.extractPainAssessmentFindings(domainFactory, vo, domMap);

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
	 * Create the ims.nursing.assessmenttools.domain.objects.PainAssessmentFindings list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPainAssessmentFindingsList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PainAssessmentFindingsCollection voCollection) 
	 {
	 	return extractPainAssessmentFindingsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPainAssessmentFindingsList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PainAssessmentFindingsCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.PainAssessmentFindings vo = voCollection.get(i);
			ims.nursing.assessmenttools.domain.objects.PainAssessmentFindings domainObject = PainAssessmentFindingsAssembler.extractPainAssessmentFindings(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.nursing.assessmenttools.domain.objects.PainAssessmentFindings object.
	 * @param domainObject ims.nursing.assessmenttools.domain.objects.PainAssessmentFindings
	 */
	 public static ims.nursing.vo.PainAssessmentFindings create(ims.nursing.assessmenttools.domain.objects.PainAssessmentFindings domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.nursing.assessmenttools.domain.objects.PainAssessmentFindings object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.nursing.vo.PainAssessmentFindings create(DomainObjectMap map, ims.nursing.assessmenttools.domain.objects.PainAssessmentFindings domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.nursing.vo.PainAssessmentFindings valueObject = (ims.nursing.vo.PainAssessmentFindings) map.getValueObject(domainObject, ims.nursing.vo.PainAssessmentFindings.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.nursing.vo.PainAssessmentFindings(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.nursing.assessmenttools.domain.objects.PainAssessmentFindings
	 */
	 public static ims.nursing.vo.PainAssessmentFindings insert(ims.nursing.vo.PainAssessmentFindings valueObject, ims.nursing.assessmenttools.domain.objects.PainAssessmentFindings domainObject) 
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
	 * @param domainObject ims.nursing.assessmenttools.domain.objects.PainAssessmentFindings
	 */
	 public static ims.nursing.vo.PainAssessmentFindings insert(DomainObjectMap map, ims.nursing.vo.PainAssessmentFindings valueObject, ims.nursing.assessmenttools.domain.objects.PainAssessmentFindings domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PainAssessmentFindings(domainObject.getId());
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
			
		// SiteImage
		valueObject.setSiteImage(domainObject.getSiteImage());
		// SiteName
		valueObject.setSiteName(domainObject.getSiteName());
		// PainHypersensitivity
		ims.domain.lookups.LookupInstance instance3 = domainObject.getPainHypersensitivity();
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

			ims.nursing.vo.lookups.PainHypersensitivity voLookup3 = new ims.nursing.vo.lookups.PainHypersensitivity(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.nursing.vo.lookups.PainHypersensitivity parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.nursing.vo.lookups.PainHypersensitivity(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setPainHypersensitivity(voLookup3);
		}
				// PainAssessmentReview
		valueObject.setPainAssessmentReview(ims.nursing.vo.domain.PainAssessmentReviewAssembler.createPainAssessmentReviewCollectionFromPainAssessmentReview(map, domainObject.getPainAssessmentReview()) );
		// isDiscontinuedAssess
		valueObject.setIsDiscontinuedAssess( domainObject.isIsDiscontinuedAssess() );
		// isContinuedAssessment
		valueObject.setIsContinuedAssessment( domainObject.isIsContinuedAssessment() );
		// SiteDetails
		valueObject.setSiteDetails(domainObject.getSiteDetails());
		// Type
		ims.domain.lookups.LookupInstance instance8 = domainObject.getType();
		if ( null != instance8 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance8.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance8.getImage().getImageId(), instance8.getImage().getImagePath());
			}
			color = instance8.getColor();
			if (color != null) 
				color.getValue();

			ims.nursing.vo.lookups.PainType voLookup8 = new ims.nursing.vo.lookups.PainType(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.nursing.vo.lookups.PainType parentVoLookup8 = voLookup8;
			ims.domain.lookups.LookupInstance parent8 = instance8.getParent();
			while (parent8 != null)
			{
				if (parent8.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent8.getImage().getImageId(), parent8.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent8.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup8.setParent(new ims.nursing.vo.lookups.PainType(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setType(voLookup8);
		}
				// Severity
		ims.domain.lookups.LookupInstance instance9 = domainObject.getSeverity();
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

			ims.nursing.vo.lookups.PainSeverity voLookup9 = new ims.nursing.vo.lookups.PainSeverity(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.nursing.vo.lookups.PainSeverity parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.nursing.vo.lookups.PainSeverity(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setSeverity(voLookup9);
		}
				// Onset
		ims.domain.lookups.LookupInstance instance10 = domainObject.getOnset();
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

			ims.nursing.vo.lookups.PainOnset voLookup10 = new ims.nursing.vo.lookups.PainOnset(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.nursing.vo.lookups.PainOnset parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.nursing.vo.lookups.PainOnset(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setOnset(voLookup10);
		}
				// Progression
		ims.domain.lookups.LookupInstance instance11 = domainObject.getProgression();
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

			ims.nursing.vo.lookups.PainProgression voLookup11 = new ims.nursing.vo.lookups.PainProgression(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.nursing.vo.lookups.PainProgression parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.nursing.vo.lookups.PainProgression(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setProgression(voLookup11);
		}
				// Depth
		ims.domain.lookups.LookupInstance instance12 = domainObject.getDepth();
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

			ims.nursing.vo.lookups.PainDepth voLookup12 = new ims.nursing.vo.lookups.PainDepth(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.nursing.vo.lookups.PainDepth parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.nursing.vo.lookups.PainDepth(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setDepth(voLookup12);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.nursing.assessmenttools.domain.objects.PainAssessmentFindings extractPainAssessmentFindings(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PainAssessmentFindings valueObject) 
	{
		return 	extractPainAssessmentFindings(domainFactory, valueObject, new HashMap());
	}

	public static ims.nursing.assessmenttools.domain.objects.PainAssessmentFindings extractPainAssessmentFindings(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PainAssessmentFindings valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PainAssessmentFindings();
		ims.nursing.assessmenttools.domain.objects.PainAssessmentFindings domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.nursing.assessmenttools.domain.objects.PainAssessmentFindings)domMap.get(valueObject);
			}
			// ims.nursing.vo.PainAssessmentFindings ID_PainAssessmentFindings field is unknown
			domainObject = new ims.nursing.assessmenttools.domain.objects.PainAssessmentFindings();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PainAssessmentFindings());
			if (domMap.get(key) != null)
			{
				return (ims.nursing.assessmenttools.domain.objects.PainAssessmentFindings)domMap.get(key);
			}
			domainObject = (ims.nursing.assessmenttools.domain.objects.PainAssessmentFindings) domainFactory.getDomainObject(ims.nursing.assessmenttools.domain.objects.PainAssessmentFindings.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PainAssessmentFindings());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSiteImage() != null && valueObject.getSiteImage().equals(""))
		{
			valueObject.setSiteImage(null);
		}
		domainObject.setSiteImage(valueObject.getSiteImage());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSiteName() != null && valueObject.getSiteName().equals(""))
		{
			valueObject.setSiteName(null);
		}
		domainObject.setSiteName(valueObject.getSiteName());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getPainHypersensitivity() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getPainHypersensitivity().getID());
		}
		domainObject.setPainHypersensitivity(value3);
		domainObject.setPainAssessmentReview(ims.nursing.vo.domain.PainAssessmentReviewAssembler.extractPainAssessmentReviewSet(domainFactory, valueObject.getPainAssessmentReview(), domainObject.getPainAssessmentReview(), domMap));		
		domainObject.setIsDiscontinuedAssess(valueObject.getIsDiscontinuedAssess());
		domainObject.setIsContinuedAssessment(valueObject.getIsContinuedAssessment());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSiteDetails() != null && valueObject.getSiteDetails().equals(""))
		{
			valueObject.setSiteDetails(null);
		}
		domainObject.setSiteDetails(valueObject.getSiteDetails());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getType() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getType().getID());
		}
		domainObject.setType(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getSeverity() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getSeverity().getID());
		}
		domainObject.setSeverity(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getOnset() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getOnset().getID());
		}
		domainObject.setOnset(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getProgression() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getProgression().getID());
		}
		domainObject.setProgression(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getDepth() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getDepth().getID());
		}
		domainObject.setDepth(value12);

		return domainObject;
	}

}
