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
 * @author Billy Mahon
 */
public class TreatmentModalitiesVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.oncology.vo.TreatmentModalitiesVo copy(ims.oncology.vo.TreatmentModalitiesVo valueObjectDest, ims.oncology.vo.TreatmentModalitiesVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CarePlanModality(valueObjectSrc.getID_CarePlanModality());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TreatmentModality
		valueObjectDest.setTreatmentModality(valueObjectSrc.getTreatmentModality());
		// isMDTModality
		valueObjectDest.setIsMDTModality(valueObjectSrc.getIsMDTModality());
		// MDTSequence
		valueObjectDest.setMDTSequence(valueObjectSrc.getMDTSequence());
		// PatientAgreed
		valueObjectDest.setPatientAgreed(valueObjectSrc.getPatientAgreed());
		// PatientSequence
		valueObjectDest.setPatientSequence(valueObjectSrc.getPatientSequence());
		// ModalityStatus
		valueObjectDest.setModalityStatus(valueObjectSrc.getModalityStatus());
		// CompletedDate
		valueObjectDest.setCompletedDate(valueObjectSrc.getCompletedDate());
		// isCommenced
		valueObjectDest.setIsCommenced(valueObjectSrc.getIsCommenced());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTreatmentModalitiesVoCollectionFromCarePlanModality(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.CarePlanModality objects.
	 */
	public static ims.oncology.vo.TreatmentModalitiesVoCollection createTreatmentModalitiesVoCollectionFromCarePlanModality(java.util.Set domainObjectSet)	
	{
		return createTreatmentModalitiesVoCollectionFromCarePlanModality(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.CarePlanModality objects.
	 */
	public static ims.oncology.vo.TreatmentModalitiesVoCollection createTreatmentModalitiesVoCollectionFromCarePlanModality(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.oncology.vo.TreatmentModalitiesVoCollection voList = new ims.oncology.vo.TreatmentModalitiesVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.oncology.domain.objects.CarePlanModality domainObject = (ims.oncology.domain.objects.CarePlanModality) iterator.next();
			ims.oncology.vo.TreatmentModalitiesVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.oncology.domain.objects.CarePlanModality objects.
	 */
	public static ims.oncology.vo.TreatmentModalitiesVoCollection createTreatmentModalitiesVoCollectionFromCarePlanModality(java.util.List domainObjectList) 
	{
		return createTreatmentModalitiesVoCollectionFromCarePlanModality(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.domain.objects.CarePlanModality objects.
	 */
	public static ims.oncology.vo.TreatmentModalitiesVoCollection createTreatmentModalitiesVoCollectionFromCarePlanModality(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.oncology.vo.TreatmentModalitiesVoCollection voList = new ims.oncology.vo.TreatmentModalitiesVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.domain.objects.CarePlanModality domainObject = (ims.oncology.domain.objects.CarePlanModality) domainObjectList.get(i);
			ims.oncology.vo.TreatmentModalitiesVo vo = create(map, domainObject);

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
	 * Create the ims.oncology.domain.objects.CarePlanModality set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractCarePlanModalitySet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.TreatmentModalitiesVoCollection voCollection) 
	 {
	 	return extractCarePlanModalitySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCarePlanModalitySet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.TreatmentModalitiesVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.TreatmentModalitiesVo vo = voCollection.get(i);
			ims.oncology.domain.objects.CarePlanModality domainObject = TreatmentModalitiesVoAssembler.extractCarePlanModality(domainFactory, vo, domMap);

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
	 * Create the ims.oncology.domain.objects.CarePlanModality list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractCarePlanModalityList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.TreatmentModalitiesVoCollection voCollection) 
	 {
	 	return extractCarePlanModalityList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCarePlanModalityList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.TreatmentModalitiesVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.TreatmentModalitiesVo vo = voCollection.get(i);
			ims.oncology.domain.objects.CarePlanModality domainObject = TreatmentModalitiesVoAssembler.extractCarePlanModality(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.oncology.domain.objects.CarePlanModality object.
	 * @param domainObject ims.oncology.domain.objects.CarePlanModality
	 */
	 public static ims.oncology.vo.TreatmentModalitiesVo create(ims.oncology.domain.objects.CarePlanModality domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.oncology.domain.objects.CarePlanModality object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.oncology.vo.TreatmentModalitiesVo create(DomainObjectMap map, ims.oncology.domain.objects.CarePlanModality domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.oncology.vo.TreatmentModalitiesVo valueObject = (ims.oncology.vo.TreatmentModalitiesVo) map.getValueObject(domainObject, ims.oncology.vo.TreatmentModalitiesVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.oncology.vo.TreatmentModalitiesVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.oncology.domain.objects.CarePlanModality
	 */
	 public static ims.oncology.vo.TreatmentModalitiesVo insert(ims.oncology.vo.TreatmentModalitiesVo valueObject, ims.oncology.domain.objects.CarePlanModality domainObject) 
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
	 * @param domainObject ims.oncology.domain.objects.CarePlanModality
	 */
	 public static ims.oncology.vo.TreatmentModalitiesVo insert(DomainObjectMap map, ims.oncology.vo.TreatmentModalitiesVo valueObject, ims.oncology.domain.objects.CarePlanModality domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_CarePlanModality(domainObject.getId());
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
			
		// TreatmentModality
		ims.domain.lookups.LookupInstance instance1 = domainObject.getTreatmentModality();
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

			ims.oncology.vo.lookups.CarePlanTreatmentModality voLookup1 = new ims.oncology.vo.lookups.CarePlanTreatmentModality(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.oncology.vo.lookups.CarePlanTreatmentModality parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.oncology.vo.lookups.CarePlanTreatmentModality(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setTreatmentModality(voLookup1);
		}
				// isMDTModality
		valueObject.setIsMDTModality( domainObject.isIsMDTModality() );
		// MDTSequence
		valueObject.setMDTSequence(domainObject.getMDTSequence());
		// PatientAgreed
		ims.domain.lookups.LookupInstance instance4 = domainObject.getPatientAgreed();
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

			ims.core.vo.lookups.YesNo voLookup4 = new ims.core.vo.lookups.YesNo(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.YesNo(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setPatientAgreed(voLookup4);
		}
				// PatientSequence
		valueObject.setPatientSequence(domainObject.getPatientSequence());
		// ModalityStatus
		ims.domain.lookups.LookupInstance instance6 = domainObject.getModalityStatus();
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

			ims.oncology.vo.lookups.CarePlanModalityStatus voLookup6 = new ims.oncology.vo.lookups.CarePlanModalityStatus(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.oncology.vo.lookups.CarePlanModalityStatus parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.oncology.vo.lookups.CarePlanModalityStatus(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setModalityStatus(voLookup6);
		}
				// CompletedDate
		java.util.Date CompletedDate = domainObject.getCompletedDate();
		if ( null != CompletedDate ) 
		{
			valueObject.setCompletedDate(new ims.framework.utils.Date(CompletedDate) );
		}
		// isCommenced
		valueObject.setIsCommenced( domainObject.isIsCommenced() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.domain.objects.CarePlanModality extractCarePlanModality(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.TreatmentModalitiesVo valueObject) 
	{
		return 	extractCarePlanModality(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.domain.objects.CarePlanModality extractCarePlanModality(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.TreatmentModalitiesVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_CarePlanModality();
		ims.oncology.domain.objects.CarePlanModality domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.oncology.domain.objects.CarePlanModality)domMap.get(valueObject);
			}
			// ims.oncology.vo.TreatmentModalitiesVo ID_CarePlanModality field is unknown
			domainObject = new ims.oncology.domain.objects.CarePlanModality();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_CarePlanModality());
			if (domMap.get(key) != null)
			{
				return (ims.oncology.domain.objects.CarePlanModality)domMap.get(key);
			}
			domainObject = (ims.oncology.domain.objects.CarePlanModality) domainFactory.getDomainObject(ims.oncology.domain.objects.CarePlanModality.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_CarePlanModality());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getTreatmentModality() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getTreatmentModality().getID());
		}
		domainObject.setTreatmentModality(value1);
		domainObject.setIsMDTModality(valueObject.getIsMDTModality());
		domainObject.setMDTSequence(valueObject.getMDTSequence());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getPatientAgreed() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getPatientAgreed().getID());
		}
		domainObject.setPatientAgreed(value4);
		domainObject.setPatientSequence(valueObject.getPatientSequence());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getModalityStatus() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getModalityStatus().getID());
		}
		domainObject.setModalityStatus(value6);
		java.util.Date value7 = null;
		ims.framework.utils.Date date7 = valueObject.getCompletedDate();		
		if ( date7 != null ) 
		{
			value7 = date7.getDate();
		}
		domainObject.setCompletedDate(value7);
		domainObject.setIsCommenced(valueObject.getIsCommenced());

		return domainObject;
	}

}
