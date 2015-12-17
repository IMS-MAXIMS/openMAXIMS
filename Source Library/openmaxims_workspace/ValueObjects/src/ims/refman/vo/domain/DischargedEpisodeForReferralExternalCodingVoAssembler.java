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
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class DischargedEpisodeForReferralExternalCodingVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.DischargedEpisodeForReferralExternalCodingVo copy(ims.RefMan.vo.DischargedEpisodeForReferralExternalCodingVo valueObjectDest, ims.RefMan.vo.DischargedEpisodeForReferralExternalCodingVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_DischargedEpisode(valueObjectSrc.getID_DischargedEpisode());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// dischargeDateTime
		valueObjectDest.setDischargeDateTime(valueObjectSrc.getDischargeDateTime());
		// DischargeDestination
		valueObjectDest.setDischargeDestination(valueObjectSrc.getDischargeDestination());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createDischargedEpisodeForReferralExternalCodingVoCollectionFromDischargedEpisode(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.DischargedEpisode objects.
	 */
	public static ims.RefMan.vo.DischargedEpisodeForReferralExternalCodingVoCollection createDischargedEpisodeForReferralExternalCodingVoCollectionFromDischargedEpisode(java.util.Set domainObjectSet)	
	{
		return createDischargedEpisodeForReferralExternalCodingVoCollectionFromDischargedEpisode(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.DischargedEpisode objects.
	 */
	public static ims.RefMan.vo.DischargedEpisodeForReferralExternalCodingVoCollection createDischargedEpisodeForReferralExternalCodingVoCollectionFromDischargedEpisode(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.DischargedEpisodeForReferralExternalCodingVoCollection voList = new ims.RefMan.vo.DischargedEpisodeForReferralExternalCodingVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.pas.domain.objects.DischargedEpisode domainObject = (ims.core.admin.pas.domain.objects.DischargedEpisode) iterator.next();
			ims.RefMan.vo.DischargedEpisodeForReferralExternalCodingVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.DischargedEpisode objects.
	 */
	public static ims.RefMan.vo.DischargedEpisodeForReferralExternalCodingVoCollection createDischargedEpisodeForReferralExternalCodingVoCollectionFromDischargedEpisode(java.util.List domainObjectList) 
	{
		return createDischargedEpisodeForReferralExternalCodingVoCollectionFromDischargedEpisode(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.DischargedEpisode objects.
	 */
	public static ims.RefMan.vo.DischargedEpisodeForReferralExternalCodingVoCollection createDischargedEpisodeForReferralExternalCodingVoCollectionFromDischargedEpisode(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.DischargedEpisodeForReferralExternalCodingVoCollection voList = new ims.RefMan.vo.DischargedEpisodeForReferralExternalCodingVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.DischargedEpisode domainObject = (ims.core.admin.pas.domain.objects.DischargedEpisode) domainObjectList.get(i);
			ims.RefMan.vo.DischargedEpisodeForReferralExternalCodingVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.pas.domain.objects.DischargedEpisode set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractDischargedEpisodeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.DischargedEpisodeForReferralExternalCodingVoCollection voCollection) 
	 {
	 	return extractDischargedEpisodeSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractDischargedEpisodeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.DischargedEpisodeForReferralExternalCodingVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.DischargedEpisodeForReferralExternalCodingVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.DischargedEpisode domainObject = DischargedEpisodeForReferralExternalCodingVoAssembler.extractDischargedEpisode(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.pas.domain.objects.DischargedEpisode list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractDischargedEpisodeList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.DischargedEpisodeForReferralExternalCodingVoCollection voCollection) 
	 {
	 	return extractDischargedEpisodeList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractDischargedEpisodeList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.DischargedEpisodeForReferralExternalCodingVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.DischargedEpisodeForReferralExternalCodingVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.DischargedEpisode domainObject = DischargedEpisodeForReferralExternalCodingVoAssembler.extractDischargedEpisode(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.pas.domain.objects.DischargedEpisode object.
	 * @param domainObject ims.core.admin.pas.domain.objects.DischargedEpisode
	 */
	 public static ims.RefMan.vo.DischargedEpisodeForReferralExternalCodingVo create(ims.core.admin.pas.domain.objects.DischargedEpisode domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.pas.domain.objects.DischargedEpisode object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.DischargedEpisodeForReferralExternalCodingVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.DischargedEpisode domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.DischargedEpisodeForReferralExternalCodingVo valueObject = (ims.RefMan.vo.DischargedEpisodeForReferralExternalCodingVo) map.getValueObject(domainObject, ims.RefMan.vo.DischargedEpisodeForReferralExternalCodingVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.DischargedEpisodeForReferralExternalCodingVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.pas.domain.objects.DischargedEpisode
	 */
	 public static ims.RefMan.vo.DischargedEpisodeForReferralExternalCodingVo insert(ims.RefMan.vo.DischargedEpisodeForReferralExternalCodingVo valueObject, ims.core.admin.pas.domain.objects.DischargedEpisode domainObject) 
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
	 * @param domainObject ims.core.admin.pas.domain.objects.DischargedEpisode
	 */
	 public static ims.RefMan.vo.DischargedEpisodeForReferralExternalCodingVo insert(DomainObjectMap map, ims.RefMan.vo.DischargedEpisodeForReferralExternalCodingVo valueObject, ims.core.admin.pas.domain.objects.DischargedEpisode domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_DischargedEpisode(domainObject.getId());
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
			
		// dischargeDateTime
		java.util.Date dischargeDateTime = domainObject.getDischargeDateTime();
		if ( null != dischargeDateTime ) 
		{
			valueObject.setDischargeDateTime(new ims.framework.utils.DateTime(dischargeDateTime) );
		}
		// DischargeDestination
		ims.domain.lookups.LookupInstance instance2 = domainObject.getDischargeDestination();
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

			ims.coe.vo.lookups.DischargeDestination voLookup2 = new ims.coe.vo.lookups.DischargeDestination(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.coe.vo.lookups.DischargeDestination parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.coe.vo.lookups.DischargeDestination(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setDischargeDestination(voLookup2);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.pas.domain.objects.DischargedEpisode extractDischargedEpisode(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.DischargedEpisodeForReferralExternalCodingVo valueObject) 
	{
		return 	extractDischargedEpisode(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.DischargedEpisode extractDischargedEpisode(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.DischargedEpisodeForReferralExternalCodingVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_DischargedEpisode();
		ims.core.admin.pas.domain.objects.DischargedEpisode domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.pas.domain.objects.DischargedEpisode)domMap.get(valueObject);
			}
			// ims.RefMan.vo.DischargedEpisodeForReferralExternalCodingVo ID_DischargedEpisode field is unknown
			domainObject = new ims.core.admin.pas.domain.objects.DischargedEpisode();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_DischargedEpisode());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.pas.domain.objects.DischargedEpisode)domMap.get(key);
			}
			domainObject = (ims.core.admin.pas.domain.objects.DischargedEpisode) domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.DischargedEpisode.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_DischargedEpisode());

		ims.framework.utils.DateTime dateTime1 = valueObject.getDischargeDateTime();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setDischargeDateTime(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getDischargeDestination() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getDischargeDestination().getID());
		}
		domainObject.setDischargeDestination(value2);

		return domainObject;
	}

}
