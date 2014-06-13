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
package ims.emergency.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class ReferToSpecTeamForTrackingVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.ReferToSpecTeamForTrackingVo copy(ims.emergency.vo.ReferToSpecTeamForTrackingVo valueObjectDest, ims.emergency.vo.ReferToSpecTeamForTrackingVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ReferralToSpecTeam(valueObjectSrc.getID_ReferralToSpecTeam());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TeamConsultant
		valueObjectDest.setTeamConsultant(valueObjectSrc.getTeamConsultant());
		// Specialty
		valueObjectDest.setSpecialty(valueObjectSrc.getSpecialty());
		// ReferredDateTime
		valueObjectDest.setReferredDateTime(valueObjectSrc.getReferredDateTime());
		// SeenDateTime
		valueObjectDest.setSeenDateTime(valueObjectSrc.getSeenDateTime());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createReferToSpecTeamForTrackingVoCollectionFromReferralToSpecTeam(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.emergency.domain.objects.ReferralToSpecTeam objects.
	 */
	public static ims.emergency.vo.ReferToSpecTeamForTrackingVoCollection createReferToSpecTeamForTrackingVoCollectionFromReferralToSpecTeam(java.util.Set domainObjectSet)	
	{
		return createReferToSpecTeamForTrackingVoCollectionFromReferralToSpecTeam(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.emergency.domain.objects.ReferralToSpecTeam objects.
	 */
	public static ims.emergency.vo.ReferToSpecTeamForTrackingVoCollection createReferToSpecTeamForTrackingVoCollectionFromReferralToSpecTeam(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.ReferToSpecTeamForTrackingVoCollection voList = new ims.emergency.vo.ReferToSpecTeamForTrackingVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.emergency.domain.objects.ReferralToSpecTeam domainObject = (ims.emergency.domain.objects.ReferralToSpecTeam) iterator.next();
			ims.emergency.vo.ReferToSpecTeamForTrackingVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.emergency.domain.objects.ReferralToSpecTeam objects.
	 */
	public static ims.emergency.vo.ReferToSpecTeamForTrackingVoCollection createReferToSpecTeamForTrackingVoCollectionFromReferralToSpecTeam(java.util.List domainObjectList) 
	{
		return createReferToSpecTeamForTrackingVoCollectionFromReferralToSpecTeam(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.emergency.domain.objects.ReferralToSpecTeam objects.
	 */
	public static ims.emergency.vo.ReferToSpecTeamForTrackingVoCollection createReferToSpecTeamForTrackingVoCollectionFromReferralToSpecTeam(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.ReferToSpecTeamForTrackingVoCollection voList = new ims.emergency.vo.ReferToSpecTeamForTrackingVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.emergency.domain.objects.ReferralToSpecTeam domainObject = (ims.emergency.domain.objects.ReferralToSpecTeam) domainObjectList.get(i);
			ims.emergency.vo.ReferToSpecTeamForTrackingVo vo = create(map, domainObject);

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
	 * Create the ims.emergency.domain.objects.ReferralToSpecTeam set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractReferralToSpecTeamSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.ReferToSpecTeamForTrackingVoCollection voCollection) 
	 {
	 	return extractReferralToSpecTeamSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractReferralToSpecTeamSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.ReferToSpecTeamForTrackingVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.ReferToSpecTeamForTrackingVo vo = voCollection.get(i);
			ims.emergency.domain.objects.ReferralToSpecTeam domainObject = ReferToSpecTeamForTrackingVoAssembler.extractReferralToSpecTeam(domainFactory, vo, domMap);

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
	 * Create the ims.emergency.domain.objects.ReferralToSpecTeam list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractReferralToSpecTeamList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.ReferToSpecTeamForTrackingVoCollection voCollection) 
	 {
	 	return extractReferralToSpecTeamList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractReferralToSpecTeamList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.ReferToSpecTeamForTrackingVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.ReferToSpecTeamForTrackingVo vo = voCollection.get(i);
			ims.emergency.domain.objects.ReferralToSpecTeam domainObject = ReferToSpecTeamForTrackingVoAssembler.extractReferralToSpecTeam(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.emergency.domain.objects.ReferralToSpecTeam object.
	 * @param domainObject ims.emergency.domain.objects.ReferralToSpecTeam
	 */
	 public static ims.emergency.vo.ReferToSpecTeamForTrackingVo create(ims.emergency.domain.objects.ReferralToSpecTeam domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.emergency.domain.objects.ReferralToSpecTeam object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.emergency.vo.ReferToSpecTeamForTrackingVo create(DomainObjectMap map, ims.emergency.domain.objects.ReferralToSpecTeam domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.ReferToSpecTeamForTrackingVo valueObject = (ims.emergency.vo.ReferToSpecTeamForTrackingVo) map.getValueObject(domainObject, ims.emergency.vo.ReferToSpecTeamForTrackingVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.ReferToSpecTeamForTrackingVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.emergency.domain.objects.ReferralToSpecTeam
	 */
	 public static ims.emergency.vo.ReferToSpecTeamForTrackingVo insert(ims.emergency.vo.ReferToSpecTeamForTrackingVo valueObject, ims.emergency.domain.objects.ReferralToSpecTeam domainObject) 
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
	 * @param domainObject ims.emergency.domain.objects.ReferralToSpecTeam
	 */
	 public static ims.emergency.vo.ReferToSpecTeamForTrackingVo insert(DomainObjectMap map, ims.emergency.vo.ReferToSpecTeamForTrackingVo valueObject, ims.emergency.domain.objects.ReferralToSpecTeam domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ReferralToSpecTeam(domainObject.getId());
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
			
		// TeamConsultant
		ims.domain.lookups.LookupInstance instance1 = domainObject.getTeamConsultant();
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

			ims.emergency.vo.lookups.ReferralSpecialtyConsultantOrTeam voLookup1 = new ims.emergency.vo.lookups.ReferralSpecialtyConsultantOrTeam(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.emergency.vo.lookups.ReferralSpecialtyConsultantOrTeam parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.emergency.vo.lookups.ReferralSpecialtyConsultantOrTeam(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setTeamConsultant(voLookup1);
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
				// ReferredDateTime
		java.util.Date ReferredDateTime = domainObject.getReferredDateTime();
		if ( null != ReferredDateTime ) 
		{
			valueObject.setReferredDateTime(new ims.framework.utils.DateTime(ReferredDateTime) );
		}
		// SeenDateTime
		java.util.Date SeenDateTime = domainObject.getSeenDateTime();
		if ( null != SeenDateTime ) 
		{
			valueObject.setSeenDateTime(new ims.framework.utils.DateTime(SeenDateTime) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.emergency.domain.objects.ReferralToSpecTeam extractReferralToSpecTeam(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.ReferToSpecTeamForTrackingVo valueObject) 
	{
		return 	extractReferralToSpecTeam(domainFactory, valueObject, new HashMap());
	}

	public static ims.emergency.domain.objects.ReferralToSpecTeam extractReferralToSpecTeam(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.ReferToSpecTeamForTrackingVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ReferralToSpecTeam();
		ims.emergency.domain.objects.ReferralToSpecTeam domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.emergency.domain.objects.ReferralToSpecTeam)domMap.get(valueObject);
			}
			// ims.emergency.vo.ReferToSpecTeamForTrackingVo ID_ReferralToSpecTeam field is unknown
			domainObject = new ims.emergency.domain.objects.ReferralToSpecTeam();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ReferralToSpecTeam());
			if (domMap.get(key) != null)
			{
				return (ims.emergency.domain.objects.ReferralToSpecTeam)domMap.get(key);
			}
			domainObject = (ims.emergency.domain.objects.ReferralToSpecTeam) domainFactory.getDomainObject(ims.emergency.domain.objects.ReferralToSpecTeam.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ReferralToSpecTeam());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getTeamConsultant() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getTeamConsultant().getID());
		}
		domainObject.setTeamConsultant(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value2);
		ims.framework.utils.DateTime dateTime3 = valueObject.getReferredDateTime();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setReferredDateTime(value3);
		ims.framework.utils.DateTime dateTime4 = valueObject.getSeenDateTime();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setSeenDateTime(value4);

		return domainObject;
	}

}
