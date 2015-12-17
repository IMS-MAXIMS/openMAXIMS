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
 * @author Bogdan Tofei
 */
public class PendingEmergencyAdmissionForDischargeVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.PendingEmergencyAdmissionForDischargeVo copy(ims.emergency.vo.PendingEmergencyAdmissionForDischargeVo valueObjectDest, ims.emergency.vo.PendingEmergencyAdmissionForDischargeVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PendingEmergencyAdmission(valueObjectSrc.getID_PendingEmergencyAdmission());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AdmissionStatus
		valueObjectDest.setAdmissionStatus(valueObjectSrc.getAdmissionStatus());
		// ConclusionDate
		valueObjectDest.setConclusionDate(valueObjectSrc.getConclusionDate());
		// pasEvent
		valueObjectDest.setPasEvent(valueObjectSrc.getPasEvent());
		// DTADateTime
		valueObjectDest.setDTADateTime(valueObjectSrc.getDTADateTime());
		// CurrentLocation
		valueObjectDest.setCurrentLocation(valueObjectSrc.getCurrentLocation());
		// AdmissionType
		valueObjectDest.setAdmissionType(valueObjectSrc.getAdmissionType());
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
 	 * If more than one call to an Assembler is made then #createPendingEmergencyAdmissionForDischargeVoCollectionFromPendingEmergencyAdmission(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.PendingEmergencyAdmission objects.
	 */
	public static ims.emergency.vo.PendingEmergencyAdmissionForDischargeVoCollection createPendingEmergencyAdmissionForDischargeVoCollectionFromPendingEmergencyAdmission(java.util.Set domainObjectSet)	
	{
		return createPendingEmergencyAdmissionForDischargeVoCollectionFromPendingEmergencyAdmission(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.PendingEmergencyAdmission objects.
	 */
	public static ims.emergency.vo.PendingEmergencyAdmissionForDischargeVoCollection createPendingEmergencyAdmissionForDischargeVoCollectionFromPendingEmergencyAdmission(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.PendingEmergencyAdmissionForDischargeVoCollection voList = new ims.emergency.vo.PendingEmergencyAdmissionForDischargeVoCollection();
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
			ims.emergency.vo.PendingEmergencyAdmissionForDischargeVo vo = create(map, domainObject);
			
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
	public static ims.emergency.vo.PendingEmergencyAdmissionForDischargeVoCollection createPendingEmergencyAdmissionForDischargeVoCollectionFromPendingEmergencyAdmission(java.util.List domainObjectList) 
	{
		return createPendingEmergencyAdmissionForDischargeVoCollectionFromPendingEmergencyAdmission(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.PendingEmergencyAdmission objects.
	 */
	public static ims.emergency.vo.PendingEmergencyAdmissionForDischargeVoCollection createPendingEmergencyAdmissionForDischargeVoCollectionFromPendingEmergencyAdmission(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.PendingEmergencyAdmissionForDischargeVoCollection voList = new ims.emergency.vo.PendingEmergencyAdmissionForDischargeVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.PendingEmergencyAdmission domainObject = (ims.core.admin.pas.domain.objects.PendingEmergencyAdmission) domainObjectList.get(i);
			ims.emergency.vo.PendingEmergencyAdmissionForDischargeVo vo = create(map, domainObject);

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
	 public static java.util.Set extractPendingEmergencyAdmissionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.PendingEmergencyAdmissionForDischargeVoCollection voCollection) 
	 {
	 	return extractPendingEmergencyAdmissionSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPendingEmergencyAdmissionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.PendingEmergencyAdmissionForDischargeVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.PendingEmergencyAdmissionForDischargeVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.PendingEmergencyAdmission domainObject = PendingEmergencyAdmissionForDischargeVoAssembler.extractPendingEmergencyAdmission(domainFactory, vo, domMap);

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
	 public static java.util.List extractPendingEmergencyAdmissionList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.PendingEmergencyAdmissionForDischargeVoCollection voCollection) 
	 {
	 	return extractPendingEmergencyAdmissionList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPendingEmergencyAdmissionList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.PendingEmergencyAdmissionForDischargeVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.PendingEmergencyAdmissionForDischargeVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.PendingEmergencyAdmission domainObject = PendingEmergencyAdmissionForDischargeVoAssembler.extractPendingEmergencyAdmission(domainFactory, vo, domMap);

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
	 public static ims.emergency.vo.PendingEmergencyAdmissionForDischargeVo create(ims.core.admin.pas.domain.objects.PendingEmergencyAdmission domainObject) 
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
	  public static ims.emergency.vo.PendingEmergencyAdmissionForDischargeVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.PendingEmergencyAdmission domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.PendingEmergencyAdmissionForDischargeVo valueObject = (ims.emergency.vo.PendingEmergencyAdmissionForDischargeVo) map.getValueObject(domainObject, ims.emergency.vo.PendingEmergencyAdmissionForDischargeVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.PendingEmergencyAdmissionForDischargeVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.emergency.vo.PendingEmergencyAdmissionForDischargeVo insert(ims.emergency.vo.PendingEmergencyAdmissionForDischargeVo valueObject, ims.core.admin.pas.domain.objects.PendingEmergencyAdmission domainObject) 
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
	 public static ims.emergency.vo.PendingEmergencyAdmissionForDischargeVo insert(DomainObjectMap map, ims.emergency.vo.PendingEmergencyAdmissionForDischargeVo valueObject, ims.core.admin.pas.domain.objects.PendingEmergencyAdmission domainObject) 
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
			
		// AdmissionStatus
		ims.domain.lookups.LookupInstance instance1 = domainObject.getAdmissionStatus();
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

			ims.core.vo.lookups.EmergencyAdmissionStatus voLookup1 = new ims.core.vo.lookups.EmergencyAdmissionStatus(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.EmergencyAdmissionStatus parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.core.vo.lookups.EmergencyAdmissionStatus(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setAdmissionStatus(voLookup1);
		}
				// ConclusionDate
		java.util.Date ConclusionDate = domainObject.getConclusionDate();
		if ( null != ConclusionDate ) 
		{
			valueObject.setConclusionDate(new ims.framework.utils.DateTime(ConclusionDate) );
		}
		// pasEvent
		valueObject.setPasEvent(ims.core.vo.domain.PasEventShortVoAssembler.create(map, domainObject.getPasEvent()) );
		// DTADateTime
		java.util.Date DTADateTime = domainObject.getDTADateTime();
		if ( null != DTADateTime ) 
		{
			valueObject.setDTADateTime(new ims.framework.utils.DateTime(DTADateTime) );
		}
		// CurrentLocation
		valueObject.setCurrentLocation(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getCurrentLocation()) );
		// AdmissionType
		ims.domain.lookups.LookupInstance instance6 = domainObject.getAdmissionType();
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

			ims.core.vo.lookups.AdmissionType voLookup6 = new ims.core.vo.lookups.AdmissionType(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.AdmissionType parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.AdmissionType(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setAdmissionType(voLookup6);
		}
				// BedTypeRequested
		ims.domain.lookups.LookupInstance instance7 = domainObject.getBedTypeRequested();
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

			ims.core.vo.lookups.BedTypeRequested voLookup7 = new ims.core.vo.lookups.BedTypeRequested(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.BedTypeRequested parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.core.vo.lookups.BedTypeRequested(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setBedTypeRequested(voLookup7);
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
	public static ims.core.admin.pas.domain.objects.PendingEmergencyAdmission extractPendingEmergencyAdmission(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.PendingEmergencyAdmissionForDischargeVo valueObject) 
	{
		return 	extractPendingEmergencyAdmission(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.PendingEmergencyAdmission extractPendingEmergencyAdmission(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.PendingEmergencyAdmissionForDischargeVo valueObject, HashMap domMap) 
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
			// ims.emergency.vo.PendingEmergencyAdmissionForDischargeVo ID_PendingEmergencyAdmission field is unknown
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

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getAdmissionStatus() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getAdmissionStatus().getID());
		}
		domainObject.setAdmissionStatus(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getConclusionDate();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setConclusionDate(value2);
		domainObject.setPasEvent(ims.core.vo.domain.PasEventShortVoAssembler.extractPASEvent(domainFactory, valueObject.getPasEvent(), domMap));
		ims.framework.utils.DateTime dateTime4 = valueObject.getDTADateTime();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setDTADateTime(value4);
		domainObject.setCurrentLocation(ims.core.vo.domain.LocationLiteVoAssembler.extractLocation(domainFactory, valueObject.getCurrentLocation(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getAdmissionType() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getAdmissionType().getID());
		}
		domainObject.setAdmissionType(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getBedTypeRequested() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getBedTypeRequested().getID());
		}
		domainObject.setBedTypeRequested(value7);
		ims.core.resource.place.domain.objects.Location value8 = null;
		if ( null != valueObject.getAllocatedWard() ) 
		{
			if (valueObject.getAllocatedWard().getBoId() == null)
			{
				if (domMap.get(valueObject.getAllocatedWard()) != null)
				{
					value8 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getAllocatedWard());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value8 = domainObject.getAllocatedWard();	
			}
			else
			{
				value8 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getAllocatedWard().getBoId());
			}
		}
		domainObject.setAllocatedWard(value8);

		return domainObject;
	}

}
