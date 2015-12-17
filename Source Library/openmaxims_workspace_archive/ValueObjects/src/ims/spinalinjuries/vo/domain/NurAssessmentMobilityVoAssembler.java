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
package ims.spinalinjuries.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Sinead McDermott
 */
public class NurAssessmentMobilityVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.spinalinjuries.vo.NurAssessmentMobilityVo copy(ims.spinalinjuries.vo.NurAssessmentMobilityVo valueObjectDest, ims.spinalinjuries.vo.NurAssessmentMobilityVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_AssessmentComponent(valueObjectSrc.getID_AssessmentComponent());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// MobilityStatus
		valueObjectDest.setMobilityStatus(valueObjectSrc.getMobilityStatus());
		// OrthosesUsed
		valueObjectDest.setOrthosesUsed(valueObjectSrc.getOrthosesUsed());
		// MobilityAids
		valueObjectDest.setMobilityAids(valueObjectSrc.getMobilityAids());
		// Transfers
		valueObjectDest.setTransfers(valueObjectSrc.getTransfers());
		// Notes
		valueObjectDest.setNotes(valueObjectSrc.getNotes());
		// isComplete
		valueObjectDest.setIsComplete(valueObjectSrc.getIsComplete());
		// AssessmentInfo
		valueObjectDest.setAssessmentInfo(valueObjectSrc.getAssessmentInfo());
		// Copy
		valueObjectDest.setCopy(valueObjectSrc.getCopy());
		// ComponentType
		valueObjectDest.setComponentType(valueObjectSrc.getComponentType());
		// CarePlanTemplate
		valueObjectDest.setCarePlanTemplate(valueObjectSrc.getCarePlanTemplate());
		// CarePlans
		valueObjectDest.setCarePlans(valueObjectSrc.getCarePlans());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createNurAssessmentMobilityVoCollectionFromNurMobilityComponent(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.nursing.assessment.domain.objects.NurMobilityComponent objects.
	 */
	public static ims.spinalinjuries.vo.NurAssessmentMobilityVoCollection createNurAssessmentMobilityVoCollectionFromNurMobilityComponent(java.util.Set domainObjectSet)	
	{
		return createNurAssessmentMobilityVoCollectionFromNurMobilityComponent(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.nursing.assessment.domain.objects.NurMobilityComponent objects.
	 */
	public static ims.spinalinjuries.vo.NurAssessmentMobilityVoCollection createNurAssessmentMobilityVoCollectionFromNurMobilityComponent(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.spinalinjuries.vo.NurAssessmentMobilityVoCollection voList = new ims.spinalinjuries.vo.NurAssessmentMobilityVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.nursing.assessment.domain.objects.NurMobilityComponent domainObject = (ims.nursing.assessment.domain.objects.NurMobilityComponent) iterator.next();
			ims.spinalinjuries.vo.NurAssessmentMobilityVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.nursing.assessment.domain.objects.NurMobilityComponent objects.
	 */
	public static ims.spinalinjuries.vo.NurAssessmentMobilityVoCollection createNurAssessmentMobilityVoCollectionFromNurMobilityComponent(java.util.List domainObjectList) 
	{
		return createNurAssessmentMobilityVoCollectionFromNurMobilityComponent(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.nursing.assessment.domain.objects.NurMobilityComponent objects.
	 */
	public static ims.spinalinjuries.vo.NurAssessmentMobilityVoCollection createNurAssessmentMobilityVoCollectionFromNurMobilityComponent(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.spinalinjuries.vo.NurAssessmentMobilityVoCollection voList = new ims.spinalinjuries.vo.NurAssessmentMobilityVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.nursing.assessment.domain.objects.NurMobilityComponent domainObject = (ims.nursing.assessment.domain.objects.NurMobilityComponent) domainObjectList.get(i);
			ims.spinalinjuries.vo.NurAssessmentMobilityVo vo = create(map, domainObject);

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
	 * Create the ims.nursing.assessment.domain.objects.NurMobilityComponent set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractNurMobilityComponentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.spinalinjuries.vo.NurAssessmentMobilityVoCollection voCollection) 
	 {
	 	return extractNurMobilityComponentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractNurMobilityComponentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.spinalinjuries.vo.NurAssessmentMobilityVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.spinalinjuries.vo.NurAssessmentMobilityVo vo = voCollection.get(i);
			ims.nursing.assessment.domain.objects.NurMobilityComponent domainObject = NurAssessmentMobilityVoAssembler.extractNurMobilityComponent(domainFactory, vo, domMap);

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
	 * Create the ims.nursing.assessment.domain.objects.NurMobilityComponent list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractNurMobilityComponentList(ims.domain.ILightweightDomainFactory domainFactory, ims.spinalinjuries.vo.NurAssessmentMobilityVoCollection voCollection) 
	 {
	 	return extractNurMobilityComponentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractNurMobilityComponentList(ims.domain.ILightweightDomainFactory domainFactory, ims.spinalinjuries.vo.NurAssessmentMobilityVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.spinalinjuries.vo.NurAssessmentMobilityVo vo = voCollection.get(i);
			ims.nursing.assessment.domain.objects.NurMobilityComponent domainObject = NurAssessmentMobilityVoAssembler.extractNurMobilityComponent(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.nursing.assessment.domain.objects.NurMobilityComponent object.
	 * @param domainObject ims.nursing.assessment.domain.objects.NurMobilityComponent
	 */
	 public static ims.spinalinjuries.vo.NurAssessmentMobilityVo create(ims.nursing.assessment.domain.objects.NurMobilityComponent domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.nursing.assessment.domain.objects.NurMobilityComponent object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.spinalinjuries.vo.NurAssessmentMobilityVo create(DomainObjectMap map, ims.nursing.assessment.domain.objects.NurMobilityComponent domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.spinalinjuries.vo.NurAssessmentMobilityVo valueObject = (ims.spinalinjuries.vo.NurAssessmentMobilityVo) map.getValueObject(domainObject, ims.spinalinjuries.vo.NurAssessmentMobilityVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.spinalinjuries.vo.NurAssessmentMobilityVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.nursing.assessment.domain.objects.NurMobilityComponent
	 */
	 public static ims.spinalinjuries.vo.NurAssessmentMobilityVo insert(ims.spinalinjuries.vo.NurAssessmentMobilityVo valueObject, ims.nursing.assessment.domain.objects.NurMobilityComponent domainObject) 
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
	 * @param domainObject ims.nursing.assessment.domain.objects.NurMobilityComponent
	 */
	 public static ims.spinalinjuries.vo.NurAssessmentMobilityVo insert(DomainObjectMap map, ims.spinalinjuries.vo.NurAssessmentMobilityVo valueObject, ims.nursing.assessment.domain.objects.NurMobilityComponent domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_AssessmentComponent(domainObject.getId());
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
			
		// MobilityStatus
		java.util.List listMobilityStatus = domainObject.getMobilityStatus();
		ims.nursing.vo.lookups.MobilityStatusCollection MobilityStatus = new ims.nursing.vo.lookups.MobilityStatusCollection();
		for(java.util.Iterator iterator = listMobilityStatus.iterator(); iterator.hasNext(); ) 
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
			ims.nursing.vo.lookups.MobilityStatus voInstance = new ims.nursing.vo.lookups.MobilityStatus(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.nursing.vo.lookups.MobilityStatus parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.nursing.vo.lookups.MobilityStatus(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			MobilityStatus.add(voInstance);
		}
		valueObject.setMobilityStatus( MobilityStatus );
		// OrthosesUsed
		java.util.List listOrthosesUsed = domainObject.getOrthosesUsed();
		ims.spinalinjuries.vo.lookups.OrthosesCollection OrthosesUsed = new ims.spinalinjuries.vo.lookups.OrthosesCollection();
		for(java.util.Iterator iterator = listOrthosesUsed.iterator(); iterator.hasNext(); ) 
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
			ims.spinalinjuries.vo.lookups.Orthoses voInstance = new ims.spinalinjuries.vo.lookups.Orthoses(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.Orthoses parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.spinalinjuries.vo.lookups.Orthoses(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			OrthosesUsed.add(voInstance);
		}
		valueObject.setOrthosesUsed( OrthosesUsed );
		// MobilityAids
		ims.domain.lookups.LookupInstance instance3 = domainObject.getMobilityAids();
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

			ims.nursing.vo.lookups.MobilityAids voLookup3 = new ims.nursing.vo.lookups.MobilityAids(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.nursing.vo.lookups.MobilityAids parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.nursing.vo.lookups.MobilityAids(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setMobilityAids(voLookup3);
		}
				// Transfers
		valueObject.setTransfers(ims.nursing.vo.domain.TransfersAssembler.createTransfersCollectionFromTransfers(map, domainObject.getTransfers()) );
		// Notes
		valueObject.setNotes(domainObject.getNotes());
		// isComplete
		valueObject.setIsComplete( domainObject.isIsComplete() );
		// AssessmentInfo
		valueObject.setAssessmentInfo(ims.nursing.vo.domain.AssessmentInfoAssembler.createAssessmentInfoCollectionFromAssessmentInfo(map, domainObject.getAssessmentInfo()) );
		// Copy
		valueObject.setCopy( domainObject.isCopy() );
		// ComponentType
		ims.domain.lookups.LookupInstance instance9 = domainObject.getComponentType();
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

			ims.nursing.vo.lookups.AssessmentComponentType voLookup9 = new ims.nursing.vo.lookups.AssessmentComponentType(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.nursing.vo.lookups.AssessmentComponentType parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.nursing.vo.lookups.AssessmentComponentType(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setComponentType(voLookup9);
		}
				// CarePlanTemplate
		valueObject.setCarePlanTemplate(ims.nursing.vo.domain.CarePlanTemplateAssembler.createCarePlanTemplateCollectionFromCarePlanTemplate(map, domainObject.getCarePlanTemplate()) );
		// CarePlans
		valueObject.setCarePlans(ims.nursing.vo.domain.CarePlanAssembler.createCarePlanCollectionFromCarePlan(map, domainObject.getCarePlans()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.nursing.assessment.domain.objects.NurMobilityComponent extractNurMobilityComponent(ims.domain.ILightweightDomainFactory domainFactory, ims.spinalinjuries.vo.NurAssessmentMobilityVo valueObject) 
	{
		return 	extractNurMobilityComponent(domainFactory, valueObject, new HashMap());
	}

	public static ims.nursing.assessment.domain.objects.NurMobilityComponent extractNurMobilityComponent(ims.domain.ILightweightDomainFactory domainFactory, ims.spinalinjuries.vo.NurAssessmentMobilityVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_AssessmentComponent();
		ims.nursing.assessment.domain.objects.NurMobilityComponent domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.nursing.assessment.domain.objects.NurMobilityComponent)domMap.get(valueObject);
			}
			// ims.spinalinjuries.vo.NurAssessmentMobilityVo ID_NurMobilityComponent field is unknown
			domainObject = new ims.nursing.assessment.domain.objects.NurMobilityComponent();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_AssessmentComponent());
			if (domMap.get(key) != null)
			{
				return (ims.nursing.assessment.domain.objects.NurMobilityComponent)domMap.get(key);
			}
			domainObject = (ims.nursing.assessment.domain.objects.NurMobilityComponent) domainFactory.getDomainObject(ims.nursing.assessment.domain.objects.NurMobilityComponent.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_AssessmentComponent());

		ims.nursing.vo.lookups.MobilityStatusCollection collection1 =
	valueObject.getMobilityStatus();
	    java.util.List domainMobilityStatus = domainObject.getMobilityStatus();;			
	    int collection1Size=0;
		if (collection1 == null)
		{
			domainMobilityStatus = new java.util.ArrayList(0);
		}
		else
		{
			collection1Size = collection1.size();
		}
		
		for(int i=0; i<collection1Size; i++) 
		{
			int instanceId = collection1.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainMobilityStatus.indexOf(dom);
			if (domIdx == -1)
			{
				domainMobilityStatus.add(i, dom);
			}
			else if (i != domIdx && i < domainMobilityStatus.size())
			{
				Object tmp = domainMobilityStatus.get(i);
				domainMobilityStatus.set(i, domainMobilityStatus.get(domIdx));
				domainMobilityStatus.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j1 = domainMobilityStatus.size();
		while (j1 > collection1Size)
		{
			domainMobilityStatus.remove(j1-1);
			j1 = domainMobilityStatus.size();
		}

		domainObject.setMobilityStatus(domainMobilityStatus);		
		ims.spinalinjuries.vo.lookups.OrthosesCollection collection2 =
	valueObject.getOrthosesUsed();
	    java.util.List domainOrthosesUsed = domainObject.getOrthosesUsed();;			
	    int collection2Size=0;
		if (collection2 == null)
		{
			domainOrthosesUsed = new java.util.ArrayList(0);
		}
		else
		{
			collection2Size = collection2.size();
		}
		
		for(int i=0; i<collection2Size; i++) 
		{
			int instanceId = collection2.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainOrthosesUsed.indexOf(dom);
			if (domIdx == -1)
			{
				domainOrthosesUsed.add(i, dom);
			}
			else if (i != domIdx && i < domainOrthosesUsed.size())
			{
				Object tmp = domainOrthosesUsed.get(i);
				domainOrthosesUsed.set(i, domainOrthosesUsed.get(domIdx));
				domainOrthosesUsed.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j2 = domainOrthosesUsed.size();
		while (j2 > collection2Size)
		{
			domainOrthosesUsed.remove(j2-1);
			j2 = domainOrthosesUsed.size();
		}

		domainObject.setOrthosesUsed(domainOrthosesUsed);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getMobilityAids() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getMobilityAids().getID());
		}
		domainObject.setMobilityAids(value3);
		domainObject.setTransfers(ims.nursing.vo.domain.TransfersAssembler.extractTransfersSet(domainFactory, valueObject.getTransfers(), domainObject.getTransfers(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNotes() != null && valueObject.getNotes().equals(""))
		{
			valueObject.setNotes(null);
		}
		domainObject.setNotes(valueObject.getNotes());
		domainObject.setIsComplete(valueObject.getIsComplete());
		domainObject.setAssessmentInfo(ims.nursing.vo.domain.AssessmentInfoAssembler.extractAssessmentInfoList(domainFactory, valueObject.getAssessmentInfo(), domainObject.getAssessmentInfo(), domMap));		
		domainObject.setCopy(valueObject.getCopy());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getComponentType() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getComponentType().getID());
		}
		domainObject.setComponentType(value9);
		domainObject.setCarePlanTemplate(ims.nursing.vo.domain.CarePlanTemplateAssembler.extractCarePlanTemplateSet(domainFactory, valueObject.getCarePlanTemplate(), domainObject.getCarePlanTemplate(), domMap));		
		domainObject.setCarePlans(ims.nursing.vo.domain.CarePlanAssembler.extractCarePlanSet(domainFactory, valueObject.getCarePlans(), domainObject.getCarePlans(), domMap));		

		return domainObject;
	}

}
