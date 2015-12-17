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
public class PainAssessmentReviewAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.nursing.vo.PainAssessmentReview copy(ims.nursing.vo.PainAssessmentReview valueObjectDest, ims.nursing.vo.PainAssessmentReview valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PainAssessmentReview(valueObjectSrc.getID_PainAssessmentReview());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AssessmentDateTime
		valueObjectDest.setAssessmentDateTime(valueObjectSrc.getAssessmentDateTime());
		// RecordingDateTime
		valueObjectDest.setRecordingDateTime(valueObjectSrc.getRecordingDateTime());
		// RecordingHCP
		valueObjectDest.setRecordingHCP(valueObjectSrc.getRecordingHCP());
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
 	 * If more than one call to an Assembler is made then #createPainAssessmentReviewCollectionFromPainAssessmentReview(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.nursing.assessmenttools.domain.objects.PainAssessmentReview objects.
	 */
	public static ims.nursing.vo.PainAssessmentReviewCollection createPainAssessmentReviewCollectionFromPainAssessmentReview(java.util.Set domainObjectSet)	
	{
		return createPainAssessmentReviewCollectionFromPainAssessmentReview(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.nursing.assessmenttools.domain.objects.PainAssessmentReview objects.
	 */
	public static ims.nursing.vo.PainAssessmentReviewCollection createPainAssessmentReviewCollectionFromPainAssessmentReview(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.nursing.vo.PainAssessmentReviewCollection voList = new ims.nursing.vo.PainAssessmentReviewCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.nursing.assessmenttools.domain.objects.PainAssessmentReview domainObject = (ims.nursing.assessmenttools.domain.objects.PainAssessmentReview) iterator.next();
			ims.nursing.vo.PainAssessmentReview vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.nursing.assessmenttools.domain.objects.PainAssessmentReview objects.
	 */
	public static ims.nursing.vo.PainAssessmentReviewCollection createPainAssessmentReviewCollectionFromPainAssessmentReview(java.util.List domainObjectList) 
	{
		return createPainAssessmentReviewCollectionFromPainAssessmentReview(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.nursing.assessmenttools.domain.objects.PainAssessmentReview objects.
	 */
	public static ims.nursing.vo.PainAssessmentReviewCollection createPainAssessmentReviewCollectionFromPainAssessmentReview(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.nursing.vo.PainAssessmentReviewCollection voList = new ims.nursing.vo.PainAssessmentReviewCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.nursing.assessmenttools.domain.objects.PainAssessmentReview domainObject = (ims.nursing.assessmenttools.domain.objects.PainAssessmentReview) domainObjectList.get(i);
			ims.nursing.vo.PainAssessmentReview vo = create(map, domainObject);

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
	 * Create the ims.nursing.assessmenttools.domain.objects.PainAssessmentReview set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPainAssessmentReviewSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PainAssessmentReviewCollection voCollection) 
	 {
	 	return extractPainAssessmentReviewSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPainAssessmentReviewSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PainAssessmentReviewCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.PainAssessmentReview vo = voCollection.get(i);
			ims.nursing.assessmenttools.domain.objects.PainAssessmentReview domainObject = PainAssessmentReviewAssembler.extractPainAssessmentReview(domainFactory, vo, domMap);

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
	 * Create the ims.nursing.assessmenttools.domain.objects.PainAssessmentReview list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPainAssessmentReviewList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PainAssessmentReviewCollection voCollection) 
	 {
	 	return extractPainAssessmentReviewList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPainAssessmentReviewList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PainAssessmentReviewCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.PainAssessmentReview vo = voCollection.get(i);
			ims.nursing.assessmenttools.domain.objects.PainAssessmentReview domainObject = PainAssessmentReviewAssembler.extractPainAssessmentReview(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.nursing.assessmenttools.domain.objects.PainAssessmentReview object.
	 * @param domainObject ims.nursing.assessmenttools.domain.objects.PainAssessmentReview
	 */
	 public static ims.nursing.vo.PainAssessmentReview create(ims.nursing.assessmenttools.domain.objects.PainAssessmentReview domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.nursing.assessmenttools.domain.objects.PainAssessmentReview object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.nursing.vo.PainAssessmentReview create(DomainObjectMap map, ims.nursing.assessmenttools.domain.objects.PainAssessmentReview domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.nursing.vo.PainAssessmentReview valueObject = (ims.nursing.vo.PainAssessmentReview) map.getValueObject(domainObject, ims.nursing.vo.PainAssessmentReview.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.nursing.vo.PainAssessmentReview(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.nursing.assessmenttools.domain.objects.PainAssessmentReview
	 */
	 public static ims.nursing.vo.PainAssessmentReview insert(ims.nursing.vo.PainAssessmentReview valueObject, ims.nursing.assessmenttools.domain.objects.PainAssessmentReview domainObject) 
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
	 * @param domainObject ims.nursing.assessmenttools.domain.objects.PainAssessmentReview
	 */
	 public static ims.nursing.vo.PainAssessmentReview insert(DomainObjectMap map, ims.nursing.vo.PainAssessmentReview valueObject, ims.nursing.assessmenttools.domain.objects.PainAssessmentReview domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PainAssessmentReview(domainObject.getId());
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
			
		// AssessmentDateTime
		java.util.Date AssessmentDateTime = domainObject.getAssessmentDateTime();
		if ( null != AssessmentDateTime ) 
		{
			valueObject.setAssessmentDateTime(new ims.framework.utils.DateTime(AssessmentDateTime) );
		}
		// RecordingDateTime
		java.util.Date RecordingDateTime = domainObject.getAuthoringDateTime();
		if ( null != RecordingDateTime ) 
		{
			valueObject.setRecordingDateTime(new ims.framework.utils.DateTime(RecordingDateTime) );
		}
		// RecordingHCP
		valueObject.setRecordingHCP(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getAuthoringCP()) );
		// SiteDetails
		valueObject.setSiteDetails(domainObject.getSiteDetails());
		// Type
		ims.domain.lookups.LookupInstance instance5 = domainObject.getType();
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

			ims.nursing.vo.lookups.PainType voLookup5 = new ims.nursing.vo.lookups.PainType(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.nursing.vo.lookups.PainType parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.nursing.vo.lookups.PainType(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setType(voLookup5);
		}
				// Severity
		ims.domain.lookups.LookupInstance instance6 = domainObject.getSeverity();
		if ( null != instance6 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance6.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance6.getImage().getImageId(), instance6.getImage().getImagePath());
			}
			color = instance6.getColor();
			if (color != null) 
				color.getValue();

			ims.nursing.vo.lookups.PainSeverity voLookup6 = new ims.nursing.vo.lookups.PainSeverity(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.nursing.vo.lookups.PainSeverity parentVoLookup6 = voLookup6;
			ims.domain.lookups.LookupInstance parent6 = instance6.getParent();
			while (parent6 != null)
			{
				if (parent6.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent6.getImage().getImageId(), parent6.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent6.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup6.setParent(new ims.nursing.vo.lookups.PainSeverity(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setSeverity(voLookup6);
		}
				// Onset
		ims.domain.lookups.LookupInstance instance7 = domainObject.getOnset();
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

			ims.nursing.vo.lookups.PainOnset voLookup7 = new ims.nursing.vo.lookups.PainOnset(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.nursing.vo.lookups.PainOnset parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.nursing.vo.lookups.PainOnset(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setOnset(voLookup7);
		}
				// Progression
		ims.domain.lookups.LookupInstance instance8 = domainObject.getProgression();
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

			ims.nursing.vo.lookups.PainProgression voLookup8 = new ims.nursing.vo.lookups.PainProgression(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.nursing.vo.lookups.PainProgression parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.nursing.vo.lookups.PainProgression(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setProgression(voLookup8);
		}
				// Depth
		ims.domain.lookups.LookupInstance instance9 = domainObject.getDepth();
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

			ims.nursing.vo.lookups.PainDepth voLookup9 = new ims.nursing.vo.lookups.PainDepth(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.nursing.vo.lookups.PainDepth parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.nursing.vo.lookups.PainDepth(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setDepth(voLookup9);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.nursing.assessmenttools.domain.objects.PainAssessmentReview extractPainAssessmentReview(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PainAssessmentReview valueObject) 
	{
		return 	extractPainAssessmentReview(domainFactory, valueObject, new HashMap());
	}

	public static ims.nursing.assessmenttools.domain.objects.PainAssessmentReview extractPainAssessmentReview(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PainAssessmentReview valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PainAssessmentReview();
		ims.nursing.assessmenttools.domain.objects.PainAssessmentReview domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.nursing.assessmenttools.domain.objects.PainAssessmentReview)domMap.get(valueObject);
			}
			// ims.nursing.vo.PainAssessmentReview ID_PainAssessmentReview field is unknown
			domainObject = new ims.nursing.assessmenttools.domain.objects.PainAssessmentReview();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PainAssessmentReview());
			if (domMap.get(key) != null)
			{
				return (ims.nursing.assessmenttools.domain.objects.PainAssessmentReview)domMap.get(key);
			}
			domainObject = (ims.nursing.assessmenttools.domain.objects.PainAssessmentReview) domainFactory.getDomainObject(ims.nursing.assessmenttools.domain.objects.PainAssessmentReview.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PainAssessmentReview());

		ims.framework.utils.DateTime dateTime1 = valueObject.getAssessmentDateTime();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setAssessmentDateTime(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getRecordingDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setAuthoringDateTime(value2);
		domainObject.setAuthoringCP(ims.core.vo.domain.HcpAssembler.extractHcp(domainFactory, valueObject.getRecordingHCP(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSiteDetails() != null && valueObject.getSiteDetails().equals(""))
		{
			valueObject.setSiteDetails(null);
		}
		domainObject.setSiteDetails(valueObject.getSiteDetails());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getType() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getType().getID());
		}
		domainObject.setType(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getSeverity() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getSeverity().getID());
		}
		domainObject.setSeverity(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getOnset() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getOnset().getID());
		}
		domainObject.setOnset(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getProgression() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getProgression().getID());
		}
		domainObject.setProgression(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getDepth() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getDepth().getID());
		}
		domainObject.setDepth(value9);

		return domainObject;
	}

}
