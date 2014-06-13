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
 * @author Cornel Ventuneac
 */
public class PendingEmergencyAdmissionShortVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.PendingEmergencyAdmissionShortVo copy(ims.emergency.vo.PendingEmergencyAdmissionShortVo valueObjectDest, ims.emergency.vo.PendingEmergencyAdmissionShortVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PendingEmergencyAdmission(valueObjectSrc.getID_PendingEmergencyAdmission());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// pasEvent
		valueObjectDest.setPasEvent(valueObjectSrc.getPasEvent());
		// AdmissionStatus
		valueObjectDest.setAdmissionStatus(valueObjectSrc.getAdmissionStatus());
		// DTADateTime
		valueObjectDest.setDTADateTime(valueObjectSrc.getDTADateTime());
		// AdmissionType
		valueObjectDest.setAdmissionType(valueObjectSrc.getAdmissionType());
		// CurrentLocation
		valueObjectDest.setCurrentLocation(valueObjectSrc.getCurrentLocation());
		// BedTypeRequested
		valueObjectDest.setBedTypeRequested(valueObjectSrc.getBedTypeRequested());
		// AllocatedWard
		valueObjectDest.setAllocatedWard(valueObjectSrc.getAllocatedWard());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPendingEmergencyAdmissionShortVoCollectionFromPendingEmergencyAdmission(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.PendingEmergencyAdmission objects.
	 */
	public static ims.emergency.vo.PendingEmergencyAdmissionShortVoCollection createPendingEmergencyAdmissionShortVoCollectionFromPendingEmergencyAdmission(java.util.Set domainObjectSet)	
	{
		return createPendingEmergencyAdmissionShortVoCollectionFromPendingEmergencyAdmission(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.PendingEmergencyAdmission objects.
	 */
	public static ims.emergency.vo.PendingEmergencyAdmissionShortVoCollection createPendingEmergencyAdmissionShortVoCollectionFromPendingEmergencyAdmission(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.PendingEmergencyAdmissionShortVoCollection voList = new ims.emergency.vo.PendingEmergencyAdmissionShortVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.pas.domain.objects.PendingEmergencyAdmission domainObject = (ims.core.admin.pas.domain.objects.PendingEmergencyAdmission) iterator.next();
			ims.emergency.vo.PendingEmergencyAdmissionShortVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.PendingEmergencyAdmission objects.
	 */
	public static ims.emergency.vo.PendingEmergencyAdmissionShortVoCollection createPendingEmergencyAdmissionShortVoCollectionFromPendingEmergencyAdmission(java.util.List domainObjectList) 
	{
		return createPendingEmergencyAdmissionShortVoCollectionFromPendingEmergencyAdmission(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.PendingEmergencyAdmission objects.
	 */
	public static ims.emergency.vo.PendingEmergencyAdmissionShortVoCollection createPendingEmergencyAdmissionShortVoCollectionFromPendingEmergencyAdmission(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.PendingEmergencyAdmissionShortVoCollection voList = new ims.emergency.vo.PendingEmergencyAdmissionShortVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.PendingEmergencyAdmission domainObject = (ims.core.admin.pas.domain.objects.PendingEmergencyAdmission) domainObjectList.get(i);
			ims.emergency.vo.PendingEmergencyAdmissionShortVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.pas.domain.objects.PendingEmergencyAdmission set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPendingEmergencyAdmissionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.PendingEmergencyAdmissionShortVoCollection voCollection) 
	 {
	 	return extractPendingEmergencyAdmissionSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPendingEmergencyAdmissionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.PendingEmergencyAdmissionShortVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.PendingEmergencyAdmissionShortVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.PendingEmergencyAdmission domainObject = PendingEmergencyAdmissionShortVoAssembler.extractPendingEmergencyAdmission(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.pas.domain.objects.PendingEmergencyAdmission list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPendingEmergencyAdmissionList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.PendingEmergencyAdmissionShortVoCollection voCollection) 
	 {
	 	return extractPendingEmergencyAdmissionList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPendingEmergencyAdmissionList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.PendingEmergencyAdmissionShortVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.PendingEmergencyAdmissionShortVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.PendingEmergencyAdmission domainObject = PendingEmergencyAdmissionShortVoAssembler.extractPendingEmergencyAdmission(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.pas.domain.objects.PendingEmergencyAdmission object.
	 * @param domainObject ims.core.admin.pas.domain.objects.PendingEmergencyAdmission
	 */
	 public static ims.emergency.vo.PendingEmergencyAdmissionShortVo create(ims.core.admin.pas.domain.objects.PendingEmergencyAdmission domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.pas.domain.objects.PendingEmergencyAdmission object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.emergency.vo.PendingEmergencyAdmissionShortVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.PendingEmergencyAdmission domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.PendingEmergencyAdmissionShortVo valueObject = (ims.emergency.vo.PendingEmergencyAdmissionShortVo) map.getValueObject(domainObject, ims.emergency.vo.PendingEmergencyAdmissionShortVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.PendingEmergencyAdmissionShortVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.pas.domain.objects.PendingEmergencyAdmission
	 */
	 public static ims.emergency.vo.PendingEmergencyAdmissionShortVo insert(ims.emergency.vo.PendingEmergencyAdmissionShortVo valueObject, ims.core.admin.pas.domain.objects.PendingEmergencyAdmission domainObject) 
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
	 * @param domainObject ims.core.admin.pas.domain.objects.PendingEmergencyAdmission
	 */
	 public static ims.emergency.vo.PendingEmergencyAdmissionShortVo insert(DomainObjectMap map, ims.emergency.vo.PendingEmergencyAdmissionShortVo valueObject, ims.core.admin.pas.domain.objects.PendingEmergencyAdmission domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PendingEmergencyAdmission(domainObject.getId());
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
			
		// pasEvent
		valueObject.setPasEvent(ims.core.vo.domain.PasEventShortVoAssembler.create(map, domainObject.getPasEvent()) );
		// AdmissionStatus
		ims.domain.lookups.LookupInstance instance2 = domainObject.getAdmissionStatus();
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

			ims.core.vo.lookups.EmergencyAdmissionStatus voLookup2 = new ims.core.vo.lookups.EmergencyAdmissionStatus(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.EmergencyAdmissionStatus parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.EmergencyAdmissionStatus(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setAdmissionStatus(voLookup2);
		}
				// DTADateTime
		java.util.Date DTADateTime = domainObject.getDTADateTime();
		if ( null != DTADateTime ) 
		{
			valueObject.setDTADateTime(new ims.framework.utils.DateTime(DTADateTime) );
		}
		// AdmissionType
		ims.domain.lookups.LookupInstance instance4 = domainObject.getAdmissionType();
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

			ims.core.vo.lookups.AdmissionType voLookup4 = new ims.core.vo.lookups.AdmissionType(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.AdmissionType parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.AdmissionType(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setAdmissionType(voLookup4);
		}
				// CurrentLocation
		valueObject.setCurrentLocation(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getCurrentLocation()) );
		// BedTypeRequested
		ims.domain.lookups.LookupInstance instance6 = domainObject.getBedTypeRequested();
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

			ims.core.vo.lookups.BedTypeRequested voLookup6 = new ims.core.vo.lookups.BedTypeRequested(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.BedTypeRequested parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.BedTypeRequested(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setBedTypeRequested(voLookup6);
		}
				// AllocatedWard
		if (domainObject.getAllocatedWard() != null)
		{
			if(domainObject.getAllocatedWard() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAllocatedWard();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAllocatedWard(new ims.core.resource.place.vo.LocationRefVo(id, -1));				
			}
			else
			{
				valueObject.setAllocatedWard(new ims.core.resource.place.vo.LocationRefVo(domainObject.getAllocatedWard().getId(), domainObject.getAllocatedWard().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.pas.domain.objects.PendingEmergencyAdmission extractPendingEmergencyAdmission(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.PendingEmergencyAdmissionShortVo valueObject) 
	{
		return 	extractPendingEmergencyAdmission(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.PendingEmergencyAdmission extractPendingEmergencyAdmission(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.PendingEmergencyAdmissionShortVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PendingEmergencyAdmission();
		ims.core.admin.pas.domain.objects.PendingEmergencyAdmission domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.pas.domain.objects.PendingEmergencyAdmission)domMap.get(valueObject);
			}
			// ims.emergency.vo.PendingEmergencyAdmissionShortVo ID_PendingEmergencyAdmission field is unknown
			domainObject = new ims.core.admin.pas.domain.objects.PendingEmergencyAdmission();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PendingEmergencyAdmission());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.pas.domain.objects.PendingEmergencyAdmission)domMap.get(key);
			}
			domainObject = (ims.core.admin.pas.domain.objects.PendingEmergencyAdmission) domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.PendingEmergencyAdmission.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PendingEmergencyAdmission());

		domainObject.setPasEvent(ims.core.vo.domain.PasEventShortVoAssembler.extractPASEvent(domainFactory, valueObject.getPasEvent(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getAdmissionStatus() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getAdmissionStatus().getID());
		}
		domainObject.setAdmissionStatus(value2);
		ims.framework.utils.DateTime dateTime3 = valueObject.getDTADateTime();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setDTADateTime(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getAdmissionType() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getAdmissionType().getID());
		}
		domainObject.setAdmissionType(value4);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value5 = null;
		if ( null != valueObject.getCurrentLocation() ) 
		{
			if (valueObject.getCurrentLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getCurrentLocation()) != null)
				{
					value5 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getCurrentLocation());
				}
			}
			else
			{
				value5 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getCurrentLocation().getBoId());
			}
		}
		domainObject.setCurrentLocation(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getBedTypeRequested() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getBedTypeRequested().getID());
		}
		domainObject.setBedTypeRequested(value6);
		ims.core.resource.place.domain.objects.Location value7 = null;
		if ( null != valueObject.getAllocatedWard() ) 
		{
			if (valueObject.getAllocatedWard().getBoId() == null)
			{
				if (domMap.get(valueObject.getAllocatedWard()) != null)
				{
					value7 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getAllocatedWard());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value7 = domainObject.getAllocatedWard();	
			}
			else
			{
				value7 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getAllocatedWard().getBoId());
			}
		}
		domainObject.setAllocatedWard(value7);

		return domainObject;
	}

}
