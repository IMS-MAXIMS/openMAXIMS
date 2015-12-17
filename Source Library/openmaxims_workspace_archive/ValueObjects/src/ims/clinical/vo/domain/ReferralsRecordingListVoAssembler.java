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
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class ReferralsRecordingListVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.ReferralsRecordingListVo copy(ims.clinical.vo.ReferralsRecordingListVo valueObjectDest, ims.clinical.vo.ReferralsRecordingListVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ReferralsRecording(valueObjectSrc.getID_ReferralsRecording());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ReferralSource
		valueObjectDest.setReferralSource(valueObjectSrc.getReferralSource());
		// ReferralHCP
		valueObjectDest.setReferralHCP(valueObjectSrc.getReferralHCP());
		// DateSent
		valueObjectDest.setDateSent(valueObjectSrc.getDateSent());
		// ReferralStatus
		valueObjectDest.setReferralStatus(valueObjectSrc.getReferralStatus());
		// Discipline
		valueObjectDest.setDiscipline(valueObjectSrc.getDiscipline());
		// SpecialtyFunctionCode
		valueObjectDest.setSpecialtyFunctionCode(valueObjectSrc.getSpecialtyFunctionCode());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createReferralsRecordingListVoCollectionFromReferralsRecording(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.ReferralsRecording objects.
	 */
	public static ims.clinical.vo.ReferralsRecordingListVoCollection createReferralsRecordingListVoCollectionFromReferralsRecording(java.util.Set domainObjectSet)	
	{
		return createReferralsRecordingListVoCollectionFromReferralsRecording(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.ReferralsRecording objects.
	 */
	public static ims.clinical.vo.ReferralsRecordingListVoCollection createReferralsRecordingListVoCollectionFromReferralsRecording(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.ReferralsRecordingListVoCollection voList = new ims.clinical.vo.ReferralsRecordingListVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.ReferralsRecording domainObject = (ims.clinical.domain.objects.ReferralsRecording) iterator.next();
			ims.clinical.vo.ReferralsRecordingListVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.ReferralsRecording objects.
	 */
	public static ims.clinical.vo.ReferralsRecordingListVoCollection createReferralsRecordingListVoCollectionFromReferralsRecording(java.util.List domainObjectList) 
	{
		return createReferralsRecordingListVoCollectionFromReferralsRecording(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.ReferralsRecording objects.
	 */
	public static ims.clinical.vo.ReferralsRecordingListVoCollection createReferralsRecordingListVoCollectionFromReferralsRecording(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.ReferralsRecordingListVoCollection voList = new ims.clinical.vo.ReferralsRecordingListVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.ReferralsRecording domainObject = (ims.clinical.domain.objects.ReferralsRecording) domainObjectList.get(i);
			ims.clinical.vo.ReferralsRecordingListVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.ReferralsRecording set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractReferralsRecordingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ReferralsRecordingListVoCollection voCollection) 
	 {
	 	return extractReferralsRecordingSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractReferralsRecordingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ReferralsRecordingListVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.ReferralsRecordingListVo vo = voCollection.get(i);
			ims.clinical.domain.objects.ReferralsRecording domainObject = ReferralsRecordingListVoAssembler.extractReferralsRecording(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.ReferralsRecording list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractReferralsRecordingList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ReferralsRecordingListVoCollection voCollection) 
	 {
	 	return extractReferralsRecordingList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractReferralsRecordingList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ReferralsRecordingListVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.ReferralsRecordingListVo vo = voCollection.get(i);
			ims.clinical.domain.objects.ReferralsRecording domainObject = ReferralsRecordingListVoAssembler.extractReferralsRecording(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.ReferralsRecording object.
	 * @param domainObject ims.clinical.domain.objects.ReferralsRecording
	 */
	 public static ims.clinical.vo.ReferralsRecordingListVo create(ims.clinical.domain.objects.ReferralsRecording domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.ReferralsRecording object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.ReferralsRecordingListVo create(DomainObjectMap map, ims.clinical.domain.objects.ReferralsRecording domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.ReferralsRecordingListVo valueObject = (ims.clinical.vo.ReferralsRecordingListVo) map.getValueObject(domainObject, ims.clinical.vo.ReferralsRecordingListVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.ReferralsRecordingListVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.ReferralsRecording
	 */
	 public static ims.clinical.vo.ReferralsRecordingListVo insert(ims.clinical.vo.ReferralsRecordingListVo valueObject, ims.clinical.domain.objects.ReferralsRecording domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.ReferralsRecording
	 */
	 public static ims.clinical.vo.ReferralsRecordingListVo insert(DomainObjectMap map, ims.clinical.vo.ReferralsRecordingListVo valueObject, ims.clinical.domain.objects.ReferralsRecording domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ReferralsRecording(domainObject.getId());
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
			
		// ReferralSource
		ims.domain.lookups.LookupInstance instance1 = domainObject.getReferralSource();
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

			ims.clinical.vo.lookups.ReferralSource voLookup1 = new ims.clinical.vo.lookups.ReferralSource(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.clinical.vo.lookups.ReferralSource parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.clinical.vo.lookups.ReferralSource(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setReferralSource(voLookup1);
		}
				// ReferralHCP
		valueObject.setReferralHCP(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getReferralHCP()) );
		// DateSent
		java.util.Date DateSent = domainObject.getDateSent();
		if ( null != DateSent ) 
		{
			valueObject.setDateSent(new ims.framework.utils.Date(DateSent) );
		}
		// ReferralStatus
		ims.domain.lookups.LookupInstance instance4 = domainObject.getReferralStatus();
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

			ims.core.vo.lookups.CoreReferralStatus voLookup4 = new ims.core.vo.lookups.CoreReferralStatus(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.CoreReferralStatus parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.CoreReferralStatus(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setReferralStatus(voLookup4);
		}
				// Discipline
		ims.domain.lookups.LookupInstance instance5 = domainObject.getDiscipline();
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

			ims.clinical.vo.lookups.ReferralDiscipline voLookup5 = new ims.clinical.vo.lookups.ReferralDiscipline(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.clinical.vo.lookups.ReferralDiscipline parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.clinical.vo.lookups.ReferralDiscipline(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setDiscipline(voLookup5);
		}
				// SpecialtyFunctionCode
		ims.domain.lookups.LookupInstance instance6 = domainObject.getSpecialtyFunctionCode();
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

			ims.clinical.vo.lookups.SpecialtyFunctionCode voLookup6 = new ims.clinical.vo.lookups.SpecialtyFunctionCode(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.clinical.vo.lookups.SpecialtyFunctionCode parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.clinical.vo.lookups.SpecialtyFunctionCode(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setSpecialtyFunctionCode(voLookup6);
		}
				// CareContext
		valueObject.setCareContext(ims.core.vo.domain.CareContextListVoAssembler.create(map, domainObject.getCareContext()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.ReferralsRecording extractReferralsRecording(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ReferralsRecordingListVo valueObject) 
	{
		return 	extractReferralsRecording(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.ReferralsRecording extractReferralsRecording(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ReferralsRecordingListVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ReferralsRecording();
		ims.clinical.domain.objects.ReferralsRecording domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.ReferralsRecording)domMap.get(valueObject);
			}
			// ims.clinical.vo.ReferralsRecordingListVo ID_ReferralsRecording field is unknown
			domainObject = new ims.clinical.domain.objects.ReferralsRecording();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ReferralsRecording());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.ReferralsRecording)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.ReferralsRecording) domainFactory.getDomainObject(ims.clinical.domain.objects.ReferralsRecording.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ReferralsRecording());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getReferralSource() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getReferralSource().getID());
		}
		domainObject.setReferralSource(value1);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value2 = null;
		if ( null != valueObject.getReferralHCP() ) 
		{
			if (valueObject.getReferralHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferralHCP()) != null)
				{
					value2 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getReferralHCP());
				}
			}
			else
			{
				value2 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getReferralHCP().getBoId());
			}
		}
		domainObject.setReferralHCP(value2);
		java.util.Date value3 = null;
		ims.framework.utils.Date date3 = valueObject.getDateSent();		
		if ( date3 != null ) 
		{
			value3 = date3.getDate();
		}
		domainObject.setDateSent(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getReferralStatus() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getReferralStatus().getID());
		}
		domainObject.setReferralStatus(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getDiscipline() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getDiscipline().getID());
		}
		domainObject.setDiscipline(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getSpecialtyFunctionCode() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getSpecialtyFunctionCode().getID());
		}
		domainObject.setSpecialtyFunctionCode(value6);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.CareContext value7 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value7 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else
			{
				value7 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value7);

		return domainObject;
	}

}
