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
package ims.oncology.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Billy Mahon
 */
public class CarePlanModalityVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.oncology.vo.CarePlanModalityVo copy(ims.oncology.vo.CarePlanModalityVo valueObjectDest, ims.oncology.vo.CarePlanModalityVo valueObjectSrc) 
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
		// PatientSequence
		valueObjectDest.setPatientSequence(valueObjectSrc.getPatientSequence());
		// ModalityStatus
		valueObjectDest.setModalityStatus(valueObjectSrc.getModalityStatus());
		// CompletedDate
		valueObjectDest.setCompletedDate(valueObjectSrc.getCompletedDate());
		// isCommenced
		valueObjectDest.setIsCommenced(valueObjectSrc.getIsCommenced());
		// PatientAgreed
		valueObjectDest.setPatientAgreed(valueObjectSrc.getPatientAgreed());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCarePlanModalityVoCollectionFromCarePlanModality(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.CarePlanModality objects.
	 */
	public static ims.oncology.vo.CarePlanModalityVoCollection createCarePlanModalityVoCollectionFromCarePlanModality(java.util.Set domainObjectSet)	
	{
		return createCarePlanModalityVoCollectionFromCarePlanModality(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.CarePlanModality objects.
	 */
	public static ims.oncology.vo.CarePlanModalityVoCollection createCarePlanModalityVoCollectionFromCarePlanModality(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.oncology.vo.CarePlanModalityVoCollection voList = new ims.oncology.vo.CarePlanModalityVoCollection();
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
			ims.oncology.vo.CarePlanModalityVo vo = create(map, domainObject);
			
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
	public static ims.oncology.vo.CarePlanModalityVoCollection createCarePlanModalityVoCollectionFromCarePlanModality(java.util.List domainObjectList) 
	{
		return createCarePlanModalityVoCollectionFromCarePlanModality(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.domain.objects.CarePlanModality objects.
	 */
	public static ims.oncology.vo.CarePlanModalityVoCollection createCarePlanModalityVoCollectionFromCarePlanModality(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.oncology.vo.CarePlanModalityVoCollection voList = new ims.oncology.vo.CarePlanModalityVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.domain.objects.CarePlanModality domainObject = (ims.oncology.domain.objects.CarePlanModality) domainObjectList.get(i);
			ims.oncology.vo.CarePlanModalityVo vo = create(map, domainObject);

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
	 public static java.util.Set extractCarePlanModalitySet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.CarePlanModalityVoCollection voCollection) 
	 {
	 	return extractCarePlanModalitySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCarePlanModalitySet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.CarePlanModalityVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.CarePlanModalityVo vo = voCollection.get(i);
			ims.oncology.domain.objects.CarePlanModality domainObject = CarePlanModalityVoAssembler.extractCarePlanModality(domainFactory, vo, domMap);

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
	 public static java.util.List extractCarePlanModalityList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.CarePlanModalityVoCollection voCollection) 
	 {
	 	return extractCarePlanModalityList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCarePlanModalityList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.CarePlanModalityVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.CarePlanModalityVo vo = voCollection.get(i);
			ims.oncology.domain.objects.CarePlanModality domainObject = CarePlanModalityVoAssembler.extractCarePlanModality(domainFactory, vo, domMap);

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
	 public static ims.oncology.vo.CarePlanModalityVo create(ims.oncology.domain.objects.CarePlanModality domainObject) 
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
	  public static ims.oncology.vo.CarePlanModalityVo create(DomainObjectMap map, ims.oncology.domain.objects.CarePlanModality domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.oncology.vo.CarePlanModalityVo valueObject = (ims.oncology.vo.CarePlanModalityVo) map.getValueObject(domainObject, ims.oncology.vo.CarePlanModalityVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.oncology.vo.CarePlanModalityVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.oncology.vo.CarePlanModalityVo insert(ims.oncology.vo.CarePlanModalityVo valueObject, ims.oncology.domain.objects.CarePlanModality domainObject) 
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
	 public static ims.oncology.vo.CarePlanModalityVo insert(DomainObjectMap map, ims.oncology.vo.CarePlanModalityVo valueObject, ims.oncology.domain.objects.CarePlanModality domainObject) 
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
		// PatientSequence
		valueObject.setPatientSequence(domainObject.getPatientSequence());
		// ModalityStatus
		ims.domain.lookups.LookupInstance instance5 = domainObject.getModalityStatus();
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

			ims.oncology.vo.lookups.CarePlanModalityStatus voLookup5 = new ims.oncology.vo.lookups.CarePlanModalityStatus(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.oncology.vo.lookups.CarePlanModalityStatus parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.oncology.vo.lookups.CarePlanModalityStatus(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setModalityStatus(voLookup5);
		}
				// CompletedDate
		java.util.Date CompletedDate = domainObject.getCompletedDate();
		if ( null != CompletedDate ) 
		{
			valueObject.setCompletedDate(new ims.framework.utils.Date(CompletedDate) );
		}
		// isCommenced
		valueObject.setIsCommenced( domainObject.isIsCommenced() );
		// PatientAgreed
		ims.domain.lookups.LookupInstance instance8 = domainObject.getPatientAgreed();
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

			ims.core.vo.lookups.YesNo voLookup8 = new ims.core.vo.lookups.YesNo(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.YesNo(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setPatientAgreed(voLookup8);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.domain.objects.CarePlanModality extractCarePlanModality(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.CarePlanModalityVo valueObject) 
	{
		return 	extractCarePlanModality(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.domain.objects.CarePlanModality extractCarePlanModality(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.CarePlanModalityVo valueObject, HashMap domMap) 
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
			// ims.oncology.vo.CarePlanModalityVo ID_CarePlanModality field is unknown
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
		domainObject.setPatientSequence(valueObject.getPatientSequence());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getModalityStatus() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getModalityStatus().getID());
		}
		domainObject.setModalityStatus(value5);
		java.util.Date value6 = null;
		ims.framework.utils.Date date6 = valueObject.getCompletedDate();		
		if ( date6 != null ) 
		{
			value6 = date6.getDate();
		}
		domainObject.setCompletedDate(value6);
		domainObject.setIsCommenced(valueObject.getIsCommenced());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getPatientAgreed() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getPatientAgreed().getID());
		}
		domainObject.setPatientAgreed(value8);

		return domainObject;
	}

}
