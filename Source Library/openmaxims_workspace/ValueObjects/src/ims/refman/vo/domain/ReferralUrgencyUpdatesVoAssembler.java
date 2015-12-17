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
 * Generated on 12/10/2015, 13:25
 *
 */
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class ReferralUrgencyUpdatesVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.ReferralUrgencyUpdatesVo copy(ims.RefMan.vo.ReferralUrgencyUpdatesVo valueObjectDest, ims.RefMan.vo.ReferralUrgencyUpdatesVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ReferralUrgencyUpdates(valueObjectSrc.getID_ReferralUrgencyUpdates());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Urgency
		valueObjectDest.setUrgency(valueObjectSrc.getUrgency());
		// RecordingUser
		valueObjectDest.setRecordingUser(valueObjectSrc.getRecordingUser());
		// RecordingDateTime
		valueObjectDest.setRecordingDateTime(valueObjectSrc.getRecordingDateTime());
		// Reason
		valueObjectDest.setReason(valueObjectSrc.getReason());
		// ReasonForChangeUrgency
		valueObjectDest.setReasonForChangeUrgency(valueObjectSrc.getReasonForChangeUrgency());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createReferralUrgencyUpdatesVoCollectionFromReferralUrgencyUpdates(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.ReferralUrgencyUpdates objects.
	 */
	public static ims.RefMan.vo.ReferralUrgencyUpdatesVoCollection createReferralUrgencyUpdatesVoCollectionFromReferralUrgencyUpdates(java.util.Set domainObjectSet)	
	{
		return createReferralUrgencyUpdatesVoCollectionFromReferralUrgencyUpdates(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.ReferralUrgencyUpdates objects.
	 */
	public static ims.RefMan.vo.ReferralUrgencyUpdatesVoCollection createReferralUrgencyUpdatesVoCollectionFromReferralUrgencyUpdates(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.ReferralUrgencyUpdatesVoCollection voList = new ims.RefMan.vo.ReferralUrgencyUpdatesVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.ReferralUrgencyUpdates domainObject = (ims.RefMan.domain.objects.ReferralUrgencyUpdates) iterator.next();
			ims.RefMan.vo.ReferralUrgencyUpdatesVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.ReferralUrgencyUpdates objects.
	 */
	public static ims.RefMan.vo.ReferralUrgencyUpdatesVoCollection createReferralUrgencyUpdatesVoCollectionFromReferralUrgencyUpdates(java.util.List domainObjectList) 
	{
		return createReferralUrgencyUpdatesVoCollectionFromReferralUrgencyUpdates(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.ReferralUrgencyUpdates objects.
	 */
	public static ims.RefMan.vo.ReferralUrgencyUpdatesVoCollection createReferralUrgencyUpdatesVoCollectionFromReferralUrgencyUpdates(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.ReferralUrgencyUpdatesVoCollection voList = new ims.RefMan.vo.ReferralUrgencyUpdatesVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.ReferralUrgencyUpdates domainObject = (ims.RefMan.domain.objects.ReferralUrgencyUpdates) domainObjectList.get(i);
			ims.RefMan.vo.ReferralUrgencyUpdatesVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.ReferralUrgencyUpdates set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractReferralUrgencyUpdatesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralUrgencyUpdatesVoCollection voCollection) 
	 {
	 	return extractReferralUrgencyUpdatesSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractReferralUrgencyUpdatesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralUrgencyUpdatesVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ReferralUrgencyUpdatesVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.ReferralUrgencyUpdates domainObject = ReferralUrgencyUpdatesVoAssembler.extractReferralUrgencyUpdates(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.ReferralUrgencyUpdates list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractReferralUrgencyUpdatesList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralUrgencyUpdatesVoCollection voCollection) 
	 {
	 	return extractReferralUrgencyUpdatesList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractReferralUrgencyUpdatesList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralUrgencyUpdatesVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ReferralUrgencyUpdatesVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.ReferralUrgencyUpdates domainObject = ReferralUrgencyUpdatesVoAssembler.extractReferralUrgencyUpdates(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.ReferralUrgencyUpdates object.
	 * @param domainObject ims.RefMan.domain.objects.ReferralUrgencyUpdates
	 */
	 public static ims.RefMan.vo.ReferralUrgencyUpdatesVo create(ims.RefMan.domain.objects.ReferralUrgencyUpdates domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.ReferralUrgencyUpdates object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.ReferralUrgencyUpdatesVo create(DomainObjectMap map, ims.RefMan.domain.objects.ReferralUrgencyUpdates domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.ReferralUrgencyUpdatesVo valueObject = (ims.RefMan.vo.ReferralUrgencyUpdatesVo) map.getValueObject(domainObject, ims.RefMan.vo.ReferralUrgencyUpdatesVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.ReferralUrgencyUpdatesVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.ReferralUrgencyUpdates
	 */
	 public static ims.RefMan.vo.ReferralUrgencyUpdatesVo insert(ims.RefMan.vo.ReferralUrgencyUpdatesVo valueObject, ims.RefMan.domain.objects.ReferralUrgencyUpdates domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.ReferralUrgencyUpdates
	 */
	 public static ims.RefMan.vo.ReferralUrgencyUpdatesVo insert(DomainObjectMap map, ims.RefMan.vo.ReferralUrgencyUpdatesVo valueObject, ims.RefMan.domain.objects.ReferralUrgencyUpdates domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ReferralUrgencyUpdates(domainObject.getId());
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
			
		// Urgency
		ims.domain.lookups.LookupInstance instance1 = domainObject.getUrgency();
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

			ims.RefMan.vo.lookups.ReferralUrgency voLookup1 = new ims.RefMan.vo.lookups.ReferralUrgency(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ReferralUrgency parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.RefMan.vo.lookups.ReferralUrgency(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setUrgency(voLookup1);
		}
				// RecordingUser
		valueObject.setRecordingUser(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getRecordingUser()) );
		// RecordingDateTime
		java.util.Date RecordingDateTime = domainObject.getRecordingDateTime();
		if ( null != RecordingDateTime ) 
		{
			valueObject.setRecordingDateTime(new ims.framework.utils.DateTime(RecordingDateTime) );
		}
		// Reason
		valueObject.setReason(domainObject.getReason());
		// ReasonForChangeUrgency
		ims.domain.lookups.LookupInstance instance5 = domainObject.getReasonForChangeUrgency();
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

			ims.RefMan.vo.lookups.ReasonForChangeUrgency voLookup5 = new ims.RefMan.vo.lookups.ReasonForChangeUrgency(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ReasonForChangeUrgency parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.RefMan.vo.lookups.ReasonForChangeUrgency(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setReasonForChangeUrgency(voLookup5);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.ReferralUrgencyUpdates extractReferralUrgencyUpdates(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralUrgencyUpdatesVo valueObject) 
	{
		return 	extractReferralUrgencyUpdates(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.ReferralUrgencyUpdates extractReferralUrgencyUpdates(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralUrgencyUpdatesVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ReferralUrgencyUpdates();
		ims.RefMan.domain.objects.ReferralUrgencyUpdates domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.ReferralUrgencyUpdates)domMap.get(valueObject);
			}
			// ims.RefMan.vo.ReferralUrgencyUpdatesVo ID_ReferralUrgencyUpdates field is unknown
			domainObject = new ims.RefMan.domain.objects.ReferralUrgencyUpdates();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ReferralUrgencyUpdates());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.ReferralUrgencyUpdates)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.ReferralUrgencyUpdates) domainFactory.getDomainObject(ims.RefMan.domain.objects.ReferralUrgencyUpdates.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ReferralUrgencyUpdates());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getUrgency() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getUrgency().getID());
		}
		domainObject.setUrgency(value1);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value2 = null;
		if ( null != valueObject.getRecordingUser() ) 
		{
			if (valueObject.getRecordingUser().getBoId() == null)
			{
				if (domMap.get(valueObject.getRecordingUser()) != null)
				{
					value2 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getRecordingUser());
				}
			}
			else
			{
				value2 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getRecordingUser().getBoId());
			}
		}
		domainObject.setRecordingUser(value2);
		ims.framework.utils.DateTime dateTime3 = valueObject.getRecordingDateTime();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setRecordingDateTime(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReason() != null && valueObject.getReason().equals(""))
		{
			valueObject.setReason(null);
		}
		domainObject.setReason(valueObject.getReason());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getReasonForChangeUrgency() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getReasonForChangeUrgency().getID());
		}
		domainObject.setReasonForChangeUrgency(value5);

		return domainObject;
	}

}
