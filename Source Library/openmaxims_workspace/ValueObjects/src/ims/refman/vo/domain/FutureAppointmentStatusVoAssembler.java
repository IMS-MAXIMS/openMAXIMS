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
public class FutureAppointmentStatusVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.FutureAppointmentStatusVo copy(ims.RefMan.vo.FutureAppointmentStatusVo valueObjectDest, ims.RefMan.vo.FutureAppointmentStatusVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_FutureAppointmentStatus(valueObjectSrc.getID_FutureAppointmentStatus());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// PendingStatus
		valueObjectDest.setPendingStatus(valueObjectSrc.getPendingStatus());
		// AuthoringUser
		valueObjectDest.setAuthoringUser(valueObjectSrc.getAuthoringUser());
		// StatusDateTime
		valueObjectDest.setStatusDateTime(valueObjectSrc.getStatusDateTime());
		// StatusComment
		valueObjectDest.setStatusComment(valueObjectSrc.getStatusComment());
		// RemovalReason
		valueObjectDest.setRemovalReason(valueObjectSrc.getRemovalReason());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createFutureAppointmentStatusVoCollectionFromFutureAppointmentStatus(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.FutureAppointmentStatus objects.
	 */
	public static ims.RefMan.vo.FutureAppointmentStatusVoCollection createFutureAppointmentStatusVoCollectionFromFutureAppointmentStatus(java.util.Set domainObjectSet)	
	{
		return createFutureAppointmentStatusVoCollectionFromFutureAppointmentStatus(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.FutureAppointmentStatus objects.
	 */
	public static ims.RefMan.vo.FutureAppointmentStatusVoCollection createFutureAppointmentStatusVoCollectionFromFutureAppointmentStatus(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.FutureAppointmentStatusVoCollection voList = new ims.RefMan.vo.FutureAppointmentStatusVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.scheduling.domain.objects.FutureAppointmentStatus domainObject = (ims.scheduling.domain.objects.FutureAppointmentStatus) iterator.next();
			ims.RefMan.vo.FutureAppointmentStatusVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.scheduling.domain.objects.FutureAppointmentStatus objects.
	 */
	public static ims.RefMan.vo.FutureAppointmentStatusVoCollection createFutureAppointmentStatusVoCollectionFromFutureAppointmentStatus(java.util.List domainObjectList) 
	{
		return createFutureAppointmentStatusVoCollectionFromFutureAppointmentStatus(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.FutureAppointmentStatus objects.
	 */
	public static ims.RefMan.vo.FutureAppointmentStatusVoCollection createFutureAppointmentStatusVoCollectionFromFutureAppointmentStatus(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.FutureAppointmentStatusVoCollection voList = new ims.RefMan.vo.FutureAppointmentStatusVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.FutureAppointmentStatus domainObject = (ims.scheduling.domain.objects.FutureAppointmentStatus) domainObjectList.get(i);
			ims.RefMan.vo.FutureAppointmentStatusVo vo = create(map, domainObject);

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
	 * Create the ims.scheduling.domain.objects.FutureAppointmentStatus set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractFutureAppointmentStatusSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.FutureAppointmentStatusVoCollection voCollection) 
	 {
	 	return extractFutureAppointmentStatusSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractFutureAppointmentStatusSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.FutureAppointmentStatusVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.FutureAppointmentStatusVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.FutureAppointmentStatus domainObject = FutureAppointmentStatusVoAssembler.extractFutureAppointmentStatus(domainFactory, vo, domMap);

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
	 * Create the ims.scheduling.domain.objects.FutureAppointmentStatus list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractFutureAppointmentStatusList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.FutureAppointmentStatusVoCollection voCollection) 
	 {
	 	return extractFutureAppointmentStatusList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractFutureAppointmentStatusList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.FutureAppointmentStatusVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.FutureAppointmentStatusVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.FutureAppointmentStatus domainObject = FutureAppointmentStatusVoAssembler.extractFutureAppointmentStatus(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.scheduling.domain.objects.FutureAppointmentStatus object.
	 * @param domainObject ims.scheduling.domain.objects.FutureAppointmentStatus
	 */
	 public static ims.RefMan.vo.FutureAppointmentStatusVo create(ims.scheduling.domain.objects.FutureAppointmentStatus domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.scheduling.domain.objects.FutureAppointmentStatus object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.FutureAppointmentStatusVo create(DomainObjectMap map, ims.scheduling.domain.objects.FutureAppointmentStatus domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.FutureAppointmentStatusVo valueObject = (ims.RefMan.vo.FutureAppointmentStatusVo) map.getValueObject(domainObject, ims.RefMan.vo.FutureAppointmentStatusVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.FutureAppointmentStatusVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.scheduling.domain.objects.FutureAppointmentStatus
	 */
	 public static ims.RefMan.vo.FutureAppointmentStatusVo insert(ims.RefMan.vo.FutureAppointmentStatusVo valueObject, ims.scheduling.domain.objects.FutureAppointmentStatus domainObject) 
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
	 * @param domainObject ims.scheduling.domain.objects.FutureAppointmentStatus
	 */
	 public static ims.RefMan.vo.FutureAppointmentStatusVo insert(DomainObjectMap map, ims.RefMan.vo.FutureAppointmentStatusVo valueObject, ims.scheduling.domain.objects.FutureAppointmentStatus domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_FutureAppointmentStatus(domainObject.getId());
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
			
		// PendingStatus
		ims.domain.lookups.LookupInstance instance1 = domainObject.getPendingStatus();
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

			ims.scheduling.vo.lookups.FutureAppointmentStatus voLookup1 = new ims.scheduling.vo.lookups.FutureAppointmentStatus(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.scheduling.vo.lookups.FutureAppointmentStatus parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.scheduling.vo.lookups.FutureAppointmentStatus(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setPendingStatus(voLookup1);
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
		// StatusDateTime
		java.util.Date StatusDateTime = domainObject.getStatusDateTime();
		if ( null != StatusDateTime ) 
		{
			valueObject.setStatusDateTime(new ims.framework.utils.DateTime(StatusDateTime) );
		}
		// StatusComment
		valueObject.setStatusComment(domainObject.getStatusComment());
		// RemovalReason
		ims.domain.lookups.LookupInstance instance5 = domainObject.getRemovalReason();
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

			ims.scheduling.vo.lookups.FutureApptRemovalReason voLookup5 = new ims.scheduling.vo.lookups.FutureApptRemovalReason(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.scheduling.vo.lookups.FutureApptRemovalReason parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.scheduling.vo.lookups.FutureApptRemovalReason(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setRemovalReason(voLookup5);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.FutureAppointmentStatus extractFutureAppointmentStatus(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.FutureAppointmentStatusVo valueObject) 
	{
		return 	extractFutureAppointmentStatus(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.FutureAppointmentStatus extractFutureAppointmentStatus(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.FutureAppointmentStatusVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_FutureAppointmentStatus();
		ims.scheduling.domain.objects.FutureAppointmentStatus domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.scheduling.domain.objects.FutureAppointmentStatus)domMap.get(valueObject);
			}
			// ims.RefMan.vo.FutureAppointmentStatusVo ID_FutureAppointmentStatus field is unknown
			domainObject = new ims.scheduling.domain.objects.FutureAppointmentStatus();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_FutureAppointmentStatus());
			if (domMap.get(key) != null)
			{
				return (ims.scheduling.domain.objects.FutureAppointmentStatus)domMap.get(key);
			}
			domainObject = (ims.scheduling.domain.objects.FutureAppointmentStatus) domainFactory.getDomainObject(ims.scheduling.domain.objects.FutureAppointmentStatus.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_FutureAppointmentStatus());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getPendingStatus() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getPendingStatus().getID());
		}
		domainObject.setPendingStatus(value1);
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
		ims.framework.utils.DateTime dateTime3 = valueObject.getStatusDateTime();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setStatusDateTime(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getStatusComment() != null && valueObject.getStatusComment().equals(""))
		{
			valueObject.setStatusComment(null);
		}
		domainObject.setStatusComment(valueObject.getStatusComment());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getRemovalReason() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getRemovalReason().getID());
		}
		domainObject.setRemovalReason(value5);

		return domainObject;
	}

}
