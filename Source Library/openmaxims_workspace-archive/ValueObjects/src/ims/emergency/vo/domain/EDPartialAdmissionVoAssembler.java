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
package ims.emergency.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Florin Blindu
 */
public class EDPartialAdmissionVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.EDPartialAdmissionVo copy(ims.emergency.vo.EDPartialAdmissionVo valueObjectDest, ims.emergency.vo.EDPartialAdmissionVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_EDPartialAdmission(valueObjectSrc.getID_EDPartialAdmission());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// DecisionToAdmitDateTime
		valueObjectDest.setDecisionToAdmitDateTime(valueObjectSrc.getDecisionToAdmitDateTime());
		// Specialty
		valueObjectDest.setSpecialty(valueObjectSrc.getSpecialty());
		// AllocatedDateTime
		valueObjectDest.setAllocatedDateTime(valueObjectSrc.getAllocatedDateTime());
		// AllocatedBedType
		valueObjectDest.setAllocatedBedType(valueObjectSrc.getAllocatedBedType());
		// AllocatedBedNote
		valueObjectDest.setAllocatedBedNote(valueObjectSrc.getAllocatedBedNote());
		// AllocatedWard
		valueObjectDest.setAllocatedWard(valueObjectSrc.getAllocatedWard());
		// AllocatedStatus
		valueObjectDest.setAllocatedStatus(valueObjectSrc.getAllocatedStatus());
		// AdmissionDateTime
		valueObjectDest.setAdmissionDateTime(valueObjectSrc.getAdmissionDateTime());
		// AdmissionWard
		valueObjectDest.setAdmissionWard(valueObjectSrc.getAdmissionWard());
		// AdmittingConsultant
		valueObjectDest.setAdmittingConsultant(valueObjectSrc.getAdmittingConsultant());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createEDPartialAdmissionVoCollectionFromEDPartialAdmission(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.emergency.domain.objects.EDPartialAdmission objects.
	 */
	public static ims.emergency.vo.EDPartialAdmissionVoCollection createEDPartialAdmissionVoCollectionFromEDPartialAdmission(java.util.Set domainObjectSet)	
	{
		return createEDPartialAdmissionVoCollectionFromEDPartialAdmission(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.emergency.domain.objects.EDPartialAdmission objects.
	 */
	public static ims.emergency.vo.EDPartialAdmissionVoCollection createEDPartialAdmissionVoCollectionFromEDPartialAdmission(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.EDPartialAdmissionVoCollection voList = new ims.emergency.vo.EDPartialAdmissionVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.emergency.domain.objects.EDPartialAdmission domainObject = (ims.emergency.domain.objects.EDPartialAdmission) iterator.next();
			ims.emergency.vo.EDPartialAdmissionVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.emergency.domain.objects.EDPartialAdmission objects.
	 */
	public static ims.emergency.vo.EDPartialAdmissionVoCollection createEDPartialAdmissionVoCollectionFromEDPartialAdmission(java.util.List domainObjectList) 
	{
		return createEDPartialAdmissionVoCollectionFromEDPartialAdmission(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.emergency.domain.objects.EDPartialAdmission objects.
	 */
	public static ims.emergency.vo.EDPartialAdmissionVoCollection createEDPartialAdmissionVoCollectionFromEDPartialAdmission(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.EDPartialAdmissionVoCollection voList = new ims.emergency.vo.EDPartialAdmissionVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.emergency.domain.objects.EDPartialAdmission domainObject = (ims.emergency.domain.objects.EDPartialAdmission) domainObjectList.get(i);
			ims.emergency.vo.EDPartialAdmissionVo vo = create(map, domainObject);

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
	 * Create the ims.emergency.domain.objects.EDPartialAdmission set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractEDPartialAdmissionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EDPartialAdmissionVoCollection voCollection) 
	 {
	 	return extractEDPartialAdmissionSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractEDPartialAdmissionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EDPartialAdmissionVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.EDPartialAdmissionVo vo = voCollection.get(i);
			ims.emergency.domain.objects.EDPartialAdmission domainObject = EDPartialAdmissionVoAssembler.extractEDPartialAdmission(domainFactory, vo, domMap);

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
	 * Create the ims.emergency.domain.objects.EDPartialAdmission list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractEDPartialAdmissionList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EDPartialAdmissionVoCollection voCollection) 
	 {
	 	return extractEDPartialAdmissionList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractEDPartialAdmissionList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EDPartialAdmissionVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.EDPartialAdmissionVo vo = voCollection.get(i);
			ims.emergency.domain.objects.EDPartialAdmission domainObject = EDPartialAdmissionVoAssembler.extractEDPartialAdmission(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.emergency.domain.objects.EDPartialAdmission object.
	 * @param domainObject ims.emergency.domain.objects.EDPartialAdmission
	 */
	 public static ims.emergency.vo.EDPartialAdmissionVo create(ims.emergency.domain.objects.EDPartialAdmission domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.emergency.domain.objects.EDPartialAdmission object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.emergency.vo.EDPartialAdmissionVo create(DomainObjectMap map, ims.emergency.domain.objects.EDPartialAdmission domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.EDPartialAdmissionVo valueObject = (ims.emergency.vo.EDPartialAdmissionVo) map.getValueObject(domainObject, ims.emergency.vo.EDPartialAdmissionVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.EDPartialAdmissionVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.emergency.domain.objects.EDPartialAdmission
	 */
	 public static ims.emergency.vo.EDPartialAdmissionVo insert(ims.emergency.vo.EDPartialAdmissionVo valueObject, ims.emergency.domain.objects.EDPartialAdmission domainObject) 
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
	 * @param domainObject ims.emergency.domain.objects.EDPartialAdmission
	 */
	 public static ims.emergency.vo.EDPartialAdmissionVo insert(DomainObjectMap map, ims.emergency.vo.EDPartialAdmissionVo valueObject, ims.emergency.domain.objects.EDPartialAdmission domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_EDPartialAdmission(domainObject.getId());
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
			
		// DecisionToAdmitDateTime
		java.util.Date DecisionToAdmitDateTime = domainObject.getDecisionToAdmitDateTime();
		if ( null != DecisionToAdmitDateTime ) 
		{
			valueObject.setDecisionToAdmitDateTime(new ims.framework.utils.DateTime(DecisionToAdmitDateTime) );
		}
		// Specialty
		ims.domain.lookups.LookupInstance instance2 = domainObject.getSpecialty();
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

			ims.core.vo.lookups.Specialty voLookup2 = new ims.core.vo.lookups.Specialty(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.Specialty(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setSpecialty(voLookup2);
		}
				// AllocatedDateTime
		java.util.Date AllocatedDateTime = domainObject.getAllocatedDateTime();
		if ( null != AllocatedDateTime ) 
		{
			valueObject.setAllocatedDateTime(new ims.framework.utils.DateTime(AllocatedDateTime) );
		}
		// AllocatedBedType
		ims.domain.lookups.LookupInstance instance4 = domainObject.getAllocatedBedType();
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

			ims.emergency.vo.lookups.AllocatedBedType voLookup4 = new ims.emergency.vo.lookups.AllocatedBedType(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.emergency.vo.lookups.AllocatedBedType parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.emergency.vo.lookups.AllocatedBedType(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setAllocatedBedType(voLookup4);
		}
				// AllocatedBedNote
		valueObject.setAllocatedBedNote(domainObject.getAllocatedBedNote());
		// AllocatedWard
		valueObject.setAllocatedWard(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getAllocatedWard()) );
		// AllocatedStatus
		ims.domain.lookups.LookupInstance instance7 = domainObject.getAllocatedStatus();
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

			ims.emergency.vo.lookups.AllocationStatus voLookup7 = new ims.emergency.vo.lookups.AllocationStatus(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.emergency.vo.lookups.AllocationStatus parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.emergency.vo.lookups.AllocationStatus(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setAllocatedStatus(voLookup7);
		}
				// AdmissionDateTime
		java.util.Date AdmissionDateTime = domainObject.getAdmissionDateTime();
		if ( null != AdmissionDateTime ) 
		{
			valueObject.setAdmissionDateTime(new ims.framework.utils.DateTime(AdmissionDateTime) );
		}
		// AdmissionWard
		valueObject.setAdmissionWard(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getAdmissionWard()) );
		// AdmittingConsultant
		ims.domain.lookups.LookupInstance instance10 = domainObject.getAdmittingConsultant();
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

			ims.emergency.vo.lookups.ReferralSpecialtyConsultantOrTeam voLookup10 = new ims.emergency.vo.lookups.ReferralSpecialtyConsultantOrTeam(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.emergency.vo.lookups.ReferralSpecialtyConsultantOrTeam parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.emergency.vo.lookups.ReferralSpecialtyConsultantOrTeam(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setAdmittingConsultant(voLookup10);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.emergency.domain.objects.EDPartialAdmission extractEDPartialAdmission(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EDPartialAdmissionVo valueObject) 
	{
		return 	extractEDPartialAdmission(domainFactory, valueObject, new HashMap());
	}

	public static ims.emergency.domain.objects.EDPartialAdmission extractEDPartialAdmission(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EDPartialAdmissionVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_EDPartialAdmission();
		ims.emergency.domain.objects.EDPartialAdmission domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.emergency.domain.objects.EDPartialAdmission)domMap.get(valueObject);
			}
			// ims.emergency.vo.EDPartialAdmissionVo ID_EDPartialAdmission field is unknown
			domainObject = new ims.emergency.domain.objects.EDPartialAdmission();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_EDPartialAdmission());
			if (domMap.get(key) != null)
			{
				return (ims.emergency.domain.objects.EDPartialAdmission)domMap.get(key);
			}
			domainObject = (ims.emergency.domain.objects.EDPartialAdmission) domainFactory.getDomainObject(ims.emergency.domain.objects.EDPartialAdmission.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_EDPartialAdmission());

		ims.framework.utils.DateTime dateTime1 = valueObject.getDecisionToAdmitDateTime();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setDecisionToAdmitDateTime(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value2);
		ims.framework.utils.DateTime dateTime3 = valueObject.getAllocatedDateTime();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setAllocatedDateTime(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getAllocatedBedType() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getAllocatedBedType().getID());
		}
		domainObject.setAllocatedBedType(value4);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAllocatedBedNote() != null && valueObject.getAllocatedBedNote().equals(""))
		{
			valueObject.setAllocatedBedNote(null);
		}
		domainObject.setAllocatedBedNote(valueObject.getAllocatedBedNote());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value6 = null;
		if ( null != valueObject.getAllocatedWard() ) 
		{
			if (valueObject.getAllocatedWard().getBoId() == null)
			{
				if (domMap.get(valueObject.getAllocatedWard()) != null)
				{
					value6 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getAllocatedWard());
				}
			}
			else
			{
				value6 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getAllocatedWard().getBoId());
			}
		}
		domainObject.setAllocatedWard(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getAllocatedStatus() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getAllocatedStatus().getID());
		}
		domainObject.setAllocatedStatus(value7);
		ims.framework.utils.DateTime dateTime8 = valueObject.getAdmissionDateTime();
		java.util.Date value8 = null;
		if ( dateTime8 != null ) 
		{
			value8 = dateTime8.getJavaDate();
		}
		domainObject.setAdmissionDateTime(value8);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value9 = null;
		if ( null != valueObject.getAdmissionWard() ) 
		{
			if (valueObject.getAdmissionWard().getBoId() == null)
			{
				if (domMap.get(valueObject.getAdmissionWard()) != null)
				{
					value9 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getAdmissionWard());
				}
			}
			else
			{
				value9 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getAdmissionWard().getBoId());
			}
		}
		domainObject.setAdmissionWard(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getAdmittingConsultant() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getAdmittingConsultant().getID());
		}
		domainObject.setAdmittingConsultant(value10);

		return domainObject;
	}

}
