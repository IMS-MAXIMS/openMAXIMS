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
 * @author Bogdan Tofei
 */
public class EmergencyEpisodeForEventHistoryVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.EmergencyEpisodeForEventHistoryVo copy(ims.emergency.vo.EmergencyEpisodeForEventHistoryVo valueObjectDest, ims.emergency.vo.EmergencyEpisodeForEventHistoryVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_EmergencyEpisode(valueObjectSrc.getID_EmergencyEpisode());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// InjuryDateTime
		valueObjectDest.setInjuryDateTime(valueObjectSrc.getInjuryDateTime());
		// SourceOfReferral
		valueObjectDest.setSourceOfReferral(valueObjectSrc.getSourceOfReferral());
		// Category
		valueObjectDest.setCategory(valueObjectSrc.getCategory());
		// PresentingComplaint
		valueObjectDest.setPresentingComplaint(valueObjectSrc.getPresentingComplaint());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createEmergencyEpisodeForEventHistoryVoCollectionFromEmergencyEpisode(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.EmergencyEpisode objects.
	 */
	public static ims.emergency.vo.EmergencyEpisodeForEventHistoryVoCollection createEmergencyEpisodeForEventHistoryVoCollectionFromEmergencyEpisode(java.util.Set domainObjectSet)	
	{
		return createEmergencyEpisodeForEventHistoryVoCollectionFromEmergencyEpisode(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.EmergencyEpisode objects.
	 */
	public static ims.emergency.vo.EmergencyEpisodeForEventHistoryVoCollection createEmergencyEpisodeForEventHistoryVoCollectionFromEmergencyEpisode(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.EmergencyEpisodeForEventHistoryVoCollection voList = new ims.emergency.vo.EmergencyEpisodeForEventHistoryVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.domain.objects.EmergencyEpisode domainObject = (ims.core.admin.domain.objects.EmergencyEpisode) iterator.next();
			ims.emergency.vo.EmergencyEpisodeForEventHistoryVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.domain.objects.EmergencyEpisode objects.
	 */
	public static ims.emergency.vo.EmergencyEpisodeForEventHistoryVoCollection createEmergencyEpisodeForEventHistoryVoCollectionFromEmergencyEpisode(java.util.List domainObjectList) 
	{
		return createEmergencyEpisodeForEventHistoryVoCollectionFromEmergencyEpisode(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.EmergencyEpisode objects.
	 */
	public static ims.emergency.vo.EmergencyEpisodeForEventHistoryVoCollection createEmergencyEpisodeForEventHistoryVoCollectionFromEmergencyEpisode(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.EmergencyEpisodeForEventHistoryVoCollection voList = new ims.emergency.vo.EmergencyEpisodeForEventHistoryVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.EmergencyEpisode domainObject = (ims.core.admin.domain.objects.EmergencyEpisode) domainObjectList.get(i);
			ims.emergency.vo.EmergencyEpisodeForEventHistoryVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.domain.objects.EmergencyEpisode set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractEmergencyEpisodeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EmergencyEpisodeForEventHistoryVoCollection voCollection) 
	 {
	 	return extractEmergencyEpisodeSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractEmergencyEpisodeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EmergencyEpisodeForEventHistoryVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.EmergencyEpisodeForEventHistoryVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.EmergencyEpisode domainObject = EmergencyEpisodeForEventHistoryVoAssembler.extractEmergencyEpisode(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.domain.objects.EmergencyEpisode list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractEmergencyEpisodeList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EmergencyEpisodeForEventHistoryVoCollection voCollection) 
	 {
	 	return extractEmergencyEpisodeList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractEmergencyEpisodeList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EmergencyEpisodeForEventHistoryVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.EmergencyEpisodeForEventHistoryVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.EmergencyEpisode domainObject = EmergencyEpisodeForEventHistoryVoAssembler.extractEmergencyEpisode(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.domain.objects.EmergencyEpisode object.
	 * @param domainObject ims.core.admin.domain.objects.EmergencyEpisode
	 */
	 public static ims.emergency.vo.EmergencyEpisodeForEventHistoryVo create(ims.core.admin.domain.objects.EmergencyEpisode domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.domain.objects.EmergencyEpisode object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.emergency.vo.EmergencyEpisodeForEventHistoryVo create(DomainObjectMap map, ims.core.admin.domain.objects.EmergencyEpisode domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.EmergencyEpisodeForEventHistoryVo valueObject = (ims.emergency.vo.EmergencyEpisodeForEventHistoryVo) map.getValueObject(domainObject, ims.emergency.vo.EmergencyEpisodeForEventHistoryVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.EmergencyEpisodeForEventHistoryVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.domain.objects.EmergencyEpisode
	 */
	 public static ims.emergency.vo.EmergencyEpisodeForEventHistoryVo insert(ims.emergency.vo.EmergencyEpisodeForEventHistoryVo valueObject, ims.core.admin.domain.objects.EmergencyEpisode domainObject) 
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
	 * @param domainObject ims.core.admin.domain.objects.EmergencyEpisode
	 */
	 public static ims.emergency.vo.EmergencyEpisodeForEventHistoryVo insert(DomainObjectMap map, ims.emergency.vo.EmergencyEpisodeForEventHistoryVo valueObject, ims.core.admin.domain.objects.EmergencyEpisode domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_EmergencyEpisode(domainObject.getId());
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
			
		// InjuryDateTime
		java.util.Date InjuryDateTime = domainObject.getInjuryDateTime();
		if ( null != InjuryDateTime ) 
		{
			valueObject.setInjuryDateTime(new ims.framework.utils.DateTime(InjuryDateTime) );
		}
		// SourceOfReferral
		ims.domain.lookups.LookupInstance instance2 = domainObject.getSourceOfReferral();
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

			ims.emergency.vo.lookups.ReferredBy voLookup2 = new ims.emergency.vo.lookups.ReferredBy(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.emergency.vo.lookups.ReferredBy parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.emergency.vo.lookups.ReferredBy(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setSourceOfReferral(voLookup2);
		}
				// Category
		ims.domain.lookups.LookupInstance instance3 = domainObject.getCategory();
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

			ims.emergency.vo.lookups.PatientCategory voLookup3 = new ims.emergency.vo.lookups.PatientCategory(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.emergency.vo.lookups.PatientCategory parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.emergency.vo.lookups.PatientCategory(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setCategory(voLookup3);
		}
				// PresentingComplaint
		ims.domain.lookups.LookupInstance instance4 = domainObject.getPresentingComplaint();
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

			ims.emergency.vo.lookups.PresentingComplaint voLookup4 = new ims.emergency.vo.lookups.PresentingComplaint(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.emergency.vo.lookups.PresentingComplaint parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.emergency.vo.lookups.PresentingComplaint(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setPresentingComplaint(voLookup4);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.EmergencyEpisode extractEmergencyEpisode(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EmergencyEpisodeForEventHistoryVo valueObject) 
	{
		return 	extractEmergencyEpisode(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.EmergencyEpisode extractEmergencyEpisode(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EmergencyEpisodeForEventHistoryVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_EmergencyEpisode();
		ims.core.admin.domain.objects.EmergencyEpisode domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.domain.objects.EmergencyEpisode)domMap.get(valueObject);
			}
			// ims.emergency.vo.EmergencyEpisodeForEventHistoryVo ID_EmergencyEpisode field is unknown
			domainObject = new ims.core.admin.domain.objects.EmergencyEpisode();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_EmergencyEpisode());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.domain.objects.EmergencyEpisode)domMap.get(key);
			}
			domainObject = (ims.core.admin.domain.objects.EmergencyEpisode) domainFactory.getDomainObject(ims.core.admin.domain.objects.EmergencyEpisode.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_EmergencyEpisode());

		ims.framework.utils.DateTime dateTime1 = valueObject.getInjuryDateTime();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setInjuryDateTime(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getSourceOfReferral() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getSourceOfReferral().getID());
		}
		domainObject.setSourceOfReferral(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getCategory() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getCategory().getID());
		}
		domainObject.setCategory(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getPresentingComplaint() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getPresentingComplaint().getID());
		}
		domainObject.setPresentingComplaint(value4);

		return domainObject;
	}

}
