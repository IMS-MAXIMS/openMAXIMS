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
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class MDTMeetingVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.MDTMeetingVo copy(ims.clinical.vo.MDTMeetingVo valueObjectDest, ims.clinical.vo.MDTMeetingVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_MDTMeeting(valueObjectSrc.getID_MDTMeeting());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// MeetingNotes
		valueObjectDest.setMeetingNotes(valueObjectSrc.getMeetingNotes());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// ListPatientisOn
		valueObjectDest.setListPatientisOn(valueObjectSrc.getListPatientisOn());
		// KeyDates
		valueObjectDest.setKeyDates(valueObjectSrc.getKeyDates());
		// SystemInformation
		valueObjectDest.setSystemInformation(valueObjectSrc.getSystemInformation());
		// MDTMeetingDate
		valueObjectDest.setMDTMeetingDate(valueObjectSrc.getMDTMeetingDate());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createMDTMeetingVoCollectionFromMDTMeeting(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.MDTMeeting objects.
	 */
	public static ims.clinical.vo.MDTMeetingVoCollection createMDTMeetingVoCollectionFromMDTMeeting(java.util.Set domainObjectSet)	
	{
		return createMDTMeetingVoCollectionFromMDTMeeting(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.MDTMeeting objects.
	 */
	public static ims.clinical.vo.MDTMeetingVoCollection createMDTMeetingVoCollectionFromMDTMeeting(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.MDTMeetingVoCollection voList = new ims.clinical.vo.MDTMeetingVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.MDTMeeting domainObject = (ims.clinical.domain.objects.MDTMeeting) iterator.next();
			ims.clinical.vo.MDTMeetingVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.MDTMeeting objects.
	 */
	public static ims.clinical.vo.MDTMeetingVoCollection createMDTMeetingVoCollectionFromMDTMeeting(java.util.List domainObjectList) 
	{
		return createMDTMeetingVoCollectionFromMDTMeeting(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.MDTMeeting objects.
	 */
	public static ims.clinical.vo.MDTMeetingVoCollection createMDTMeetingVoCollectionFromMDTMeeting(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.MDTMeetingVoCollection voList = new ims.clinical.vo.MDTMeetingVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.MDTMeeting domainObject = (ims.clinical.domain.objects.MDTMeeting) domainObjectList.get(i);
			ims.clinical.vo.MDTMeetingVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.MDTMeeting set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractMDTMeetingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.MDTMeetingVoCollection voCollection) 
	 {
	 	return extractMDTMeetingSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractMDTMeetingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.MDTMeetingVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.MDTMeetingVo vo = voCollection.get(i);
			ims.clinical.domain.objects.MDTMeeting domainObject = MDTMeetingVoAssembler.extractMDTMeeting(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.MDTMeeting list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractMDTMeetingList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.MDTMeetingVoCollection voCollection) 
	 {
	 	return extractMDTMeetingList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractMDTMeetingList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.MDTMeetingVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.MDTMeetingVo vo = voCollection.get(i);
			ims.clinical.domain.objects.MDTMeeting domainObject = MDTMeetingVoAssembler.extractMDTMeeting(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.MDTMeeting object.
	 * @param domainObject ims.clinical.domain.objects.MDTMeeting
	 */
	 public static ims.clinical.vo.MDTMeetingVo create(ims.clinical.domain.objects.MDTMeeting domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.MDTMeeting object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.MDTMeetingVo create(DomainObjectMap map, ims.clinical.domain.objects.MDTMeeting domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.MDTMeetingVo valueObject = (ims.clinical.vo.MDTMeetingVo) map.getValueObject(domainObject, ims.clinical.vo.MDTMeetingVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.MDTMeetingVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.MDTMeeting
	 */
	 public static ims.clinical.vo.MDTMeetingVo insert(ims.clinical.vo.MDTMeetingVo valueObject, ims.clinical.domain.objects.MDTMeeting domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.MDTMeeting
	 */
	 public static ims.clinical.vo.MDTMeetingVo insert(DomainObjectMap map, ims.clinical.vo.MDTMeetingVo valueObject, ims.clinical.domain.objects.MDTMeeting domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_MDTMeeting(domainObject.getId());
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
			
		// MeetingNotes
		valueObject.setMeetingNotes(ims.clinical.vo.domain.MDTNotesVoAssembler.createMDTNotesVoCollectionFromMDTNotes(map, domainObject.getMeetingNotes()) );
		// CareContext
		valueObject.setCareContext(ims.core.vo.domain.CareContextShortVoAssembler.create(map, domainObject.getCareContext()) );
		// ListPatientisOn
		ims.domain.lookups.LookupInstance instance3 = domainObject.getListPatientisOn();
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

			ims.clinical.vo.lookups.MDTListAorB voLookup3 = new ims.clinical.vo.lookups.MDTListAorB(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.clinical.vo.lookups.MDTListAorB parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.clinical.vo.lookups.MDTListAorB(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setListPatientisOn(voLookup3);
		}
				// KeyDates
		valueObject.setKeyDates(ims.clinical.vo.domain.KeyDatesVoAssembler.createKeyDatesVoCollectionFromKeyDates(map, domainObject.getKeyDates()) );
		// SystemInformation
		// set system information
		valueObject.setSystemInformation(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// MDTMeetingDate
		java.util.Date MDTMeetingDate = domainObject.getMDTMeetingDate();
		if ( null != MDTMeetingDate ) 
		{
			valueObject.setMDTMeetingDate(new ims.framework.utils.Date(MDTMeetingDate) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.MDTMeeting extractMDTMeeting(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.MDTMeetingVo valueObject) 
	{
		return 	extractMDTMeeting(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.MDTMeeting extractMDTMeeting(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.MDTMeetingVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_MDTMeeting();
		ims.clinical.domain.objects.MDTMeeting domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.MDTMeeting)domMap.get(valueObject);
			}
			// ims.clinical.vo.MDTMeetingVo ID_MDTMeeting field is unknown
			domainObject = new ims.clinical.domain.objects.MDTMeeting();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_MDTMeeting());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.MDTMeeting)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.MDTMeeting) domainFactory.getDomainObject(ims.clinical.domain.objects.MDTMeeting.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_MDTMeeting());

		domainObject.setMeetingNotes(ims.clinical.vo.domain.MDTNotesVoAssembler.extractMDTNotesList(domainFactory, valueObject.getMeetingNotes(), domainObject.getMeetingNotes(), domMap));		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.CareContext value2 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value2 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else
			{
				value2 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getListPatientisOn() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getListPatientisOn().getID());
		}
		domainObject.setListPatientisOn(value3);
		domainObject.setKeyDates(ims.clinical.vo.domain.KeyDatesVoAssembler.extractKeyDatesSet(domainFactory, valueObject.getKeyDates(), domainObject.getKeyDates(), domMap));		
		java.util.Date value6 = null;
		ims.framework.utils.Date date6 = valueObject.getMDTMeetingDate();		
		if ( date6 != null ) 
		{
			value6 = date6.getDate();
		}
		domainObject.setMDTMeetingDate(value6);

		return domainObject;
	}

}
