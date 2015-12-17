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
package ims.emergency.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author George Cristian Josan
 */
public class EmergencyEpisodeShortVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.EmergencyEpisodeShortVo copy(ims.emergency.vo.EmergencyEpisodeShortVo valueObjectDest, ims.emergency.vo.EmergencyEpisodeShortVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_EmergencyEpisode(valueObjectSrc.getID_EmergencyEpisode());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// EpisodeOfCare
		valueObjectDest.setEpisodeOfCare(valueObjectSrc.getEpisodeOfCare());
		// EmergencyAttendances
		valueObjectDest.setEmergencyAttendances(valueObjectSrc.getEmergencyAttendances());
		// InjuryDateTime
		valueObjectDest.setInjuryDateTime(valueObjectSrc.getInjuryDateTime());
		// IncidentLocation
		valueObjectDest.setIncidentLocation(valueObjectSrc.getIncidentLocation());
		// LocationDetails
		valueObjectDest.setLocationDetails(valueObjectSrc.getLocationDetails());
		// Category
		valueObjectDest.setCategory(valueObjectSrc.getCategory());
		// PresentingComplaint
		valueObjectDest.setPresentingComplaint(valueObjectSrc.getPresentingComplaint());
		// ElapsedTime
		valueObjectDest.setElapsedTime(valueObjectSrc.getElapsedTime());
		// ElapsedPeriod
		valueObjectDest.setElapsedPeriod(valueObjectSrc.getElapsedPeriod());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createEmergencyEpisodeShortVoCollectionFromEmergencyEpisode(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.EmergencyEpisode objects.
	 */
	public static ims.emergency.vo.EmergencyEpisodeShortVoCollection createEmergencyEpisodeShortVoCollectionFromEmergencyEpisode(java.util.Set domainObjectSet)	
	{
		return createEmergencyEpisodeShortVoCollectionFromEmergencyEpisode(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.EmergencyEpisode objects.
	 */
	public static ims.emergency.vo.EmergencyEpisodeShortVoCollection createEmergencyEpisodeShortVoCollectionFromEmergencyEpisode(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.EmergencyEpisodeShortVoCollection voList = new ims.emergency.vo.EmergencyEpisodeShortVoCollection();
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
			ims.emergency.vo.EmergencyEpisodeShortVo vo = create(map, domainObject);
			
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
	public static ims.emergency.vo.EmergencyEpisodeShortVoCollection createEmergencyEpisodeShortVoCollectionFromEmergencyEpisode(java.util.List domainObjectList) 
	{
		return createEmergencyEpisodeShortVoCollectionFromEmergencyEpisode(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.EmergencyEpisode objects.
	 */
	public static ims.emergency.vo.EmergencyEpisodeShortVoCollection createEmergencyEpisodeShortVoCollectionFromEmergencyEpisode(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.EmergencyEpisodeShortVoCollection voList = new ims.emergency.vo.EmergencyEpisodeShortVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.EmergencyEpisode domainObject = (ims.core.admin.domain.objects.EmergencyEpisode) domainObjectList.get(i);
			ims.emergency.vo.EmergencyEpisodeShortVo vo = create(map, domainObject);

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
	 public static java.util.Set extractEmergencyEpisodeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EmergencyEpisodeShortVoCollection voCollection) 
	 {
	 	return extractEmergencyEpisodeSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractEmergencyEpisodeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EmergencyEpisodeShortVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.EmergencyEpisodeShortVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.EmergencyEpisode domainObject = EmergencyEpisodeShortVoAssembler.extractEmergencyEpisode(domainFactory, vo, domMap);

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
	 public static java.util.List extractEmergencyEpisodeList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EmergencyEpisodeShortVoCollection voCollection) 
	 {
	 	return extractEmergencyEpisodeList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractEmergencyEpisodeList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EmergencyEpisodeShortVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.EmergencyEpisodeShortVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.EmergencyEpisode domainObject = EmergencyEpisodeShortVoAssembler.extractEmergencyEpisode(domainFactory, vo, domMap);

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
	 public static ims.emergency.vo.EmergencyEpisodeShortVo create(ims.core.admin.domain.objects.EmergencyEpisode domainObject) 
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
	  public static ims.emergency.vo.EmergencyEpisodeShortVo create(DomainObjectMap map, ims.core.admin.domain.objects.EmergencyEpisode domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.EmergencyEpisodeShortVo valueObject = (ims.emergency.vo.EmergencyEpisodeShortVo) map.getValueObject(domainObject, ims.emergency.vo.EmergencyEpisodeShortVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.EmergencyEpisodeShortVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.emergency.vo.EmergencyEpisodeShortVo insert(ims.emergency.vo.EmergencyEpisodeShortVo valueObject, ims.core.admin.domain.objects.EmergencyEpisode domainObject) 
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
	 public static ims.emergency.vo.EmergencyEpisodeShortVo insert(DomainObjectMap map, ims.emergency.vo.EmergencyEpisodeShortVo valueObject, ims.core.admin.domain.objects.EmergencyEpisode domainObject) 
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
			
		// EpisodeOfCare
		valueObject.setEpisodeOfCare(ims.emergency.vo.domain.EpisodeOfcareLiteVoAssembler.create(map, domainObject.getEpisodeOfCare()) );
		// EmergencyAttendances
		valueObject.setEmergencyAttendances(ims.emergency.vo.domain.EmergencyAttendanceShortVoAssembler.createEmergencyAttendanceShortVoCollectionFromEmergencyAttendance(map, domainObject.getEmergencyAttendances()) );
		// InjuryDateTime
		java.util.Date InjuryDateTime = domainObject.getInjuryDateTime();
		if ( null != InjuryDateTime ) 
		{
			valueObject.setInjuryDateTime(new ims.framework.utils.DateTime(InjuryDateTime) );
		}
		// IncidentLocation
		ims.domain.lookups.LookupInstance instance4 = domainObject.getIncidentLocation();
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

			ims.emergency.vo.lookups.IncidentLocation voLookup4 = new ims.emergency.vo.lookups.IncidentLocation(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.emergency.vo.lookups.IncidentLocation parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.emergency.vo.lookups.IncidentLocation(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setIncidentLocation(voLookup4);
		}
				// LocationDetails
		valueObject.setLocationDetails(domainObject.getLocationDetails());
		// Category
		ims.domain.lookups.LookupInstance instance6 = domainObject.getCategory();
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

			ims.emergency.vo.lookups.PatientCategory voLookup6 = new ims.emergency.vo.lookups.PatientCategory(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.emergency.vo.lookups.PatientCategory parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.emergency.vo.lookups.PatientCategory(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setCategory(voLookup6);
		}
				// PresentingComplaint
		ims.domain.lookups.LookupInstance instance7 = domainObject.getPresentingComplaint();
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

			ims.emergency.vo.lookups.PresentingComplaint voLookup7 = new ims.emergency.vo.lookups.PresentingComplaint(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.emergency.vo.lookups.PresentingComplaint parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.emergency.vo.lookups.PresentingComplaint(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setPresentingComplaint(voLookup7);
		}
				// ElapsedTime
		valueObject.setElapsedTime(domainObject.getElapsedTime());
		// ElapsedPeriod
		ims.domain.lookups.LookupInstance instance9 = domainObject.getElapsedPeriod();
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

			ims.emergency.vo.lookups.ElapsedInjuryPeriod voLookup9 = new ims.emergency.vo.lookups.ElapsedInjuryPeriod(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.emergency.vo.lookups.ElapsedInjuryPeriod parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.emergency.vo.lookups.ElapsedInjuryPeriod(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setElapsedPeriod(voLookup9);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.EmergencyEpisode extractEmergencyEpisode(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EmergencyEpisodeShortVo valueObject) 
	{
		return 	extractEmergencyEpisode(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.EmergencyEpisode extractEmergencyEpisode(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EmergencyEpisodeShortVo valueObject, HashMap domMap) 
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
			// ims.emergency.vo.EmergencyEpisodeShortVo ID_EmergencyEpisode field is unknown
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

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.EpisodeOfCare value1 = null;
		if ( null != valueObject.getEpisodeOfCare() ) 
		{
			if (valueObject.getEpisodeOfCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisodeOfCare()) != null)
				{
					value1 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisodeOfCare());
				}
			}
			else
			{
				value1 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisodeOfCare().getBoId());
			}
		}
		domainObject.setEpisodeOfCare(value1);

		// SaveAsRefVO treated as RefValueObject
		ims.core.admin.vo.EmergencyAttendanceRefVoCollection refCollection2 = new ims.core.admin.vo.EmergencyAttendanceRefVoCollection();
		if (valueObject.getEmergencyAttendances() != null)
		{
			for (int i2=0; i2<valueObject.getEmergencyAttendances().size(); i2++)
			{
				ims.core.admin.vo.EmergencyAttendanceRefVo ref2 = (ims.core.admin.vo.EmergencyAttendanceRefVo)valueObject.getEmergencyAttendances().get(i2);
				refCollection2.add(ref2);
			}
		}
		int size2 = (null == refCollection2) ? 0 : refCollection2.size();		
		java.util.Set domainEmergencyAttendances2 = domainObject.getEmergencyAttendances();
		if (domainEmergencyAttendances2 == null)
		{
			domainEmergencyAttendances2 = new java.util.HashSet();
		}
		java.util.Set newSet2  = new java.util.HashSet();
		for(int i=0; i<size2; i++) 
		{
			ims.core.admin.vo.EmergencyAttendanceRefVo vo = refCollection2.get(i);					
			ims.core.admin.domain.objects.EmergencyAttendance dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.admin.domain.objects.EmergencyAttendance)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.admin.domain.objects.EmergencyAttendance)domainFactory.getDomainObject( ims.core.admin.domain.objects.EmergencyAttendance.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainEmergencyAttendances2.contains(dom))
			{
				domainEmergencyAttendances2.add(dom);
			}
			newSet2.add(dom);			
		}
		java.util.Set removedSet2 = new java.util.HashSet();
		java.util.Iterator iter2 = domainEmergencyAttendances2.iterator();
		//Find out which objects need to be removed
		while (iter2.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter2.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet2.contains(o))
			{
				removedSet2.add(o);
			}
		}
		iter2 = removedSet2.iterator();
		//Remove the unwanted objects
		while (iter2.hasNext())
		{
			domainEmergencyAttendances2.remove(iter2.next());
		}		
		
		domainObject.setEmergencyAttendances(domainEmergencyAttendances2);		
		ims.framework.utils.DateTime dateTime3 = valueObject.getInjuryDateTime();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setInjuryDateTime(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getIncidentLocation() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getIncidentLocation().getID());
		}
		domainObject.setIncidentLocation(value4);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLocationDetails() != null && valueObject.getLocationDetails().equals(""))
		{
			valueObject.setLocationDetails(null);
		}
		domainObject.setLocationDetails(valueObject.getLocationDetails());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getCategory() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getCategory().getID());
		}
		domainObject.setCategory(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getPresentingComplaint() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getPresentingComplaint().getID());
		}
		domainObject.setPresentingComplaint(value7);
		domainObject.setElapsedTime(valueObject.getElapsedTime());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getElapsedPeriod() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getElapsedPeriod().getID());
		}
		domainObject.setElapsedPeriod(value9);

		return domainObject;
	}

}
