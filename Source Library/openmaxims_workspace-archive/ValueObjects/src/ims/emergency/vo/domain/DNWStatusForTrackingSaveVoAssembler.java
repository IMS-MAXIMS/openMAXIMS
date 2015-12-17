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
public class DNWStatusForTrackingSaveVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.DNWStatusForTrackingSaveVo copy(ims.emergency.vo.DNWStatusForTrackingSaveVo valueObjectDest, ims.emergency.vo.DNWStatusForTrackingSaveVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_DNWStatus(valueObjectSrc.getID_DNWStatus());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// StatusDateTime
		valueObjectDest.setStatusDateTime(valueObjectSrc.getStatusDateTime());
		// AuthoringUser
		valueObjectDest.setAuthoringUser(valueObjectSrc.getAuthoringUser());
		// Area
		valueObjectDest.setArea(valueObjectSrc.getArea());
		// Comment
		valueObjectDest.setComment(valueObjectSrc.getComment());
		// CalledAmount
		valueObjectDest.setCalledAmount(valueObjectSrc.getCalledAmount());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createDNWStatusForTrackingSaveVoCollectionFromDNWStatus(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.emergency.domain.objects.DNWStatus objects.
	 */
	public static ims.emergency.vo.DNWStatusForTrackingSaveVoCollection createDNWStatusForTrackingSaveVoCollectionFromDNWStatus(java.util.Set domainObjectSet)	
	{
		return createDNWStatusForTrackingSaveVoCollectionFromDNWStatus(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.emergency.domain.objects.DNWStatus objects.
	 */
	public static ims.emergency.vo.DNWStatusForTrackingSaveVoCollection createDNWStatusForTrackingSaveVoCollectionFromDNWStatus(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.DNWStatusForTrackingSaveVoCollection voList = new ims.emergency.vo.DNWStatusForTrackingSaveVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.emergency.domain.objects.DNWStatus domainObject = (ims.emergency.domain.objects.DNWStatus) iterator.next();
			ims.emergency.vo.DNWStatusForTrackingSaveVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.emergency.domain.objects.DNWStatus objects.
	 */
	public static ims.emergency.vo.DNWStatusForTrackingSaveVoCollection createDNWStatusForTrackingSaveVoCollectionFromDNWStatus(java.util.List domainObjectList) 
	{
		return createDNWStatusForTrackingSaveVoCollectionFromDNWStatus(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.emergency.domain.objects.DNWStatus objects.
	 */
	public static ims.emergency.vo.DNWStatusForTrackingSaveVoCollection createDNWStatusForTrackingSaveVoCollectionFromDNWStatus(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.DNWStatusForTrackingSaveVoCollection voList = new ims.emergency.vo.DNWStatusForTrackingSaveVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.emergency.domain.objects.DNWStatus domainObject = (ims.emergency.domain.objects.DNWStatus) domainObjectList.get(i);
			ims.emergency.vo.DNWStatusForTrackingSaveVo vo = create(map, domainObject);

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
	 * Create the ims.emergency.domain.objects.DNWStatus set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractDNWStatusSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.DNWStatusForTrackingSaveVoCollection voCollection) 
	 {
	 	return extractDNWStatusSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractDNWStatusSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.DNWStatusForTrackingSaveVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.DNWStatusForTrackingSaveVo vo = voCollection.get(i);
			ims.emergency.domain.objects.DNWStatus domainObject = DNWStatusForTrackingSaveVoAssembler.extractDNWStatus(domainFactory, vo, domMap);

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
	 * Create the ims.emergency.domain.objects.DNWStatus list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractDNWStatusList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.DNWStatusForTrackingSaveVoCollection voCollection) 
	 {
	 	return extractDNWStatusList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractDNWStatusList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.DNWStatusForTrackingSaveVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.DNWStatusForTrackingSaveVo vo = voCollection.get(i);
			ims.emergency.domain.objects.DNWStatus domainObject = DNWStatusForTrackingSaveVoAssembler.extractDNWStatus(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.emergency.domain.objects.DNWStatus object.
	 * @param domainObject ims.emergency.domain.objects.DNWStatus
	 */
	 public static ims.emergency.vo.DNWStatusForTrackingSaveVo create(ims.emergency.domain.objects.DNWStatus domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.emergency.domain.objects.DNWStatus object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.emergency.vo.DNWStatusForTrackingSaveVo create(DomainObjectMap map, ims.emergency.domain.objects.DNWStatus domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.DNWStatusForTrackingSaveVo valueObject = (ims.emergency.vo.DNWStatusForTrackingSaveVo) map.getValueObject(domainObject, ims.emergency.vo.DNWStatusForTrackingSaveVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.DNWStatusForTrackingSaveVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.emergency.domain.objects.DNWStatus
	 */
	 public static ims.emergency.vo.DNWStatusForTrackingSaveVo insert(ims.emergency.vo.DNWStatusForTrackingSaveVo valueObject, ims.emergency.domain.objects.DNWStatus domainObject) 
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
	 * @param domainObject ims.emergency.domain.objects.DNWStatus
	 */
	 public static ims.emergency.vo.DNWStatusForTrackingSaveVo insert(DomainObjectMap map, ims.emergency.vo.DNWStatusForTrackingSaveVo valueObject, ims.emergency.domain.objects.DNWStatus domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_DNWStatus(domainObject.getId());
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
			
		// StatusDateTime
		java.util.Date StatusDateTime = domainObject.getStatusDateTime();
		if ( null != StatusDateTime ) 
		{
			valueObject.setStatusDateTime(new ims.framework.utils.DateTime(StatusDateTime) );
		}
		// AuthoringUser
		if (domainObject.getAuthoringUser() != null)
		{
			if(domainObject.getAuthoringUser() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAuthoringUser();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAuthoringUser(new ims.core.resource.people.vo.MemberOfStaffRefVo(id, -1));				
			}
			else
			{
				valueObject.setAuthoringUser(new ims.core.resource.people.vo.MemberOfStaffRefVo(domainObject.getAuthoringUser().getId(), domainObject.getAuthoringUser().getVersion()));
			}
		}
		// Area
		if (domainObject.getArea() != null)
		{
			if(domainObject.getArea() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getArea();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setArea(new ims.emergency.configuration.vo.TrackingAreaRefVo(id, -1));				
			}
			else
			{
				valueObject.setArea(new ims.emergency.configuration.vo.TrackingAreaRefVo(domainObject.getArea().getId(), domainObject.getArea().getVersion()));
			}
		}
		// Comment
		valueObject.setComment(domainObject.getComment());
		// CalledAmount
		valueObject.setCalledAmount(domainObject.getCalledAmount());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.emergency.domain.objects.DNWStatus extractDNWStatus(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.DNWStatusForTrackingSaveVo valueObject) 
	{
		return 	extractDNWStatus(domainFactory, valueObject, new HashMap());
	}

	public static ims.emergency.domain.objects.DNWStatus extractDNWStatus(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.DNWStatusForTrackingSaveVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_DNWStatus();
		ims.emergency.domain.objects.DNWStatus domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.emergency.domain.objects.DNWStatus)domMap.get(valueObject);
			}
			// ims.emergency.vo.DNWStatusForTrackingSaveVo ID_DNWStatus field is unknown
			domainObject = new ims.emergency.domain.objects.DNWStatus();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_DNWStatus());
			if (domMap.get(key) != null)
			{
				return (ims.emergency.domain.objects.DNWStatus)domMap.get(key);
			}
			domainObject = (ims.emergency.domain.objects.DNWStatus) domainFactory.getDomainObject(ims.emergency.domain.objects.DNWStatus.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_DNWStatus());

		ims.framework.utils.DateTime dateTime1 = valueObject.getStatusDateTime();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setStatusDateTime(value1);
		ims.core.resource.people.domain.objects.MemberOfStaff value2 = null;
		if ( null != valueObject.getAuthoringUser() ) 
		{
			if (valueObject.getAuthoringUser().getBoId() == null)
			{
				if (domMap.get(valueObject.getAuthoringUser()) != null)
				{
					value2 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getAuthoringUser());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getAuthoringUser();	
			}
			else
			{
				value2 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getAuthoringUser().getBoId());
			}
		}
		domainObject.setAuthoringUser(value2);
		ims.emergency.configuration.domain.objects.TrackingArea value3 = null;
		if ( null != valueObject.getArea() ) 
		{
			if (valueObject.getArea().getBoId() == null)
			{
				if (domMap.get(valueObject.getArea()) != null)
				{
					value3 = (ims.emergency.configuration.domain.objects.TrackingArea)domMap.get(valueObject.getArea());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getArea();	
			}
			else
			{
				value3 = (ims.emergency.configuration.domain.objects.TrackingArea)domainFactory.getDomainObject(ims.emergency.configuration.domain.objects.TrackingArea.class, valueObject.getArea().getBoId());
			}
		}
		domainObject.setArea(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComment() != null && valueObject.getComment().equals(""))
		{
			valueObject.setComment(null);
		}
		domainObject.setComment(valueObject.getComment());
		domainObject.setCalledAmount(valueObject.getCalledAmount());

		return domainObject;
	}

}
