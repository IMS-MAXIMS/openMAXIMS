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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class FilmPacketTransferVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.FilmPacketTransferVo copy(ims.core.vo.FilmPacketTransferVo valueObjectDest, ims.core.vo.FilmPacketTransferVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_FilmPacketTransfer(valueObjectSrc.getID_FilmPacketTransfer());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TransferLocation
		valueObjectDest.setTransferLocation(valueObjectSrc.getTransferLocation());
		// DateSent
		valueObjectDest.setDateSent(valueObjectSrc.getDateSent());
		// Comment
		valueObjectDest.setComment(valueObjectSrc.getComment());
		// RecordingUser
		valueObjectDest.setRecordingUser(valueObjectSrc.getRecordingUser());
		// RecordingDateTime
		valueObjectDest.setRecordingDateTime(valueObjectSrc.getRecordingDateTime());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createFilmPacketTransferVoCollectionFromFilmPacketTransfer(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.FilmPacketTransfer objects.
	 */
	public static ims.core.vo.FilmPacketTransferVoCollection createFilmPacketTransferVoCollectionFromFilmPacketTransfer(java.util.Set domainObjectSet)	
	{
		return createFilmPacketTransferVoCollectionFromFilmPacketTransfer(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.FilmPacketTransfer objects.
	 */
	public static ims.core.vo.FilmPacketTransferVoCollection createFilmPacketTransferVoCollectionFromFilmPacketTransfer(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.FilmPacketTransferVoCollection voList = new ims.core.vo.FilmPacketTransferVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.FilmPacketTransfer domainObject = (ims.core.clinical.domain.objects.FilmPacketTransfer) iterator.next();
			ims.core.vo.FilmPacketTransferVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.FilmPacketTransfer objects.
	 */
	public static ims.core.vo.FilmPacketTransferVoCollection createFilmPacketTransferVoCollectionFromFilmPacketTransfer(java.util.List domainObjectList) 
	{
		return createFilmPacketTransferVoCollectionFromFilmPacketTransfer(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.FilmPacketTransfer objects.
	 */
	public static ims.core.vo.FilmPacketTransferVoCollection createFilmPacketTransferVoCollectionFromFilmPacketTransfer(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.FilmPacketTransferVoCollection voList = new ims.core.vo.FilmPacketTransferVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.FilmPacketTransfer domainObject = (ims.core.clinical.domain.objects.FilmPacketTransfer) domainObjectList.get(i);
			ims.core.vo.FilmPacketTransferVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.FilmPacketTransfer set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractFilmPacketTransferSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.FilmPacketTransferVoCollection voCollection) 
	 {
	 	return extractFilmPacketTransferSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractFilmPacketTransferSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.FilmPacketTransferVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.FilmPacketTransferVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.FilmPacketTransfer domainObject = FilmPacketTransferVoAssembler.extractFilmPacketTransfer(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.FilmPacketTransfer list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractFilmPacketTransferList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.FilmPacketTransferVoCollection voCollection) 
	 {
	 	return extractFilmPacketTransferList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractFilmPacketTransferList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.FilmPacketTransferVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.FilmPacketTransferVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.FilmPacketTransfer domainObject = FilmPacketTransferVoAssembler.extractFilmPacketTransfer(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.FilmPacketTransfer object.
	 * @param domainObject ims.core.clinical.domain.objects.FilmPacketTransfer
	 */
	 public static ims.core.vo.FilmPacketTransferVo create(ims.core.clinical.domain.objects.FilmPacketTransfer domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.FilmPacketTransfer object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.FilmPacketTransferVo create(DomainObjectMap map, ims.core.clinical.domain.objects.FilmPacketTransfer domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.FilmPacketTransferVo valueObject = (ims.core.vo.FilmPacketTransferVo) map.getValueObject(domainObject, ims.core.vo.FilmPacketTransferVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.FilmPacketTransferVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.FilmPacketTransfer
	 */
	 public static ims.core.vo.FilmPacketTransferVo insert(ims.core.vo.FilmPacketTransferVo valueObject, ims.core.clinical.domain.objects.FilmPacketTransfer domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.FilmPacketTransfer
	 */
	 public static ims.core.vo.FilmPacketTransferVo insert(DomainObjectMap map, ims.core.vo.FilmPacketTransferVo valueObject, ims.core.clinical.domain.objects.FilmPacketTransfer domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_FilmPacketTransfer(domainObject.getId());
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
			
		// TransferLocation
		valueObject.setTransferLocation(domainObject.getTransferLocation());
		// DateSent
		java.util.Date DateSent = domainObject.getDateSent();
		if ( null != DateSent ) 
		{
			valueObject.setDateSent(new ims.framework.utils.Date(DateSent) );
		}
		// Comment
		valueObject.setComment(domainObject.getComment());
		// RecordingUser
		valueObject.setRecordingUser(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getRecordingUser()) );
		// RecordingDateTime
		java.util.Date RecordingDateTime = domainObject.getRecordingDateTime();
		if ( null != RecordingDateTime ) 
		{
			valueObject.setRecordingDateTime(new ims.framework.utils.DateTime(RecordingDateTime) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.FilmPacketTransfer extractFilmPacketTransfer(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.FilmPacketTransferVo valueObject) 
	{
		return 	extractFilmPacketTransfer(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.FilmPacketTransfer extractFilmPacketTransfer(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.FilmPacketTransferVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_FilmPacketTransfer();
		ims.core.clinical.domain.objects.FilmPacketTransfer domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.FilmPacketTransfer)domMap.get(valueObject);
			}
			// ims.core.vo.FilmPacketTransferVo ID_FilmPacketTransfer field is unknown
			domainObject = new ims.core.clinical.domain.objects.FilmPacketTransfer();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_FilmPacketTransfer());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.FilmPacketTransfer)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.FilmPacketTransfer) domainFactory.getDomainObject(ims.core.clinical.domain.objects.FilmPacketTransfer.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_FilmPacketTransfer());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTransferLocation() != null && valueObject.getTransferLocation().equals(""))
		{
			valueObject.setTransferLocation(null);
		}
		domainObject.setTransferLocation(valueObject.getTransferLocation());
		java.util.Date value2 = null;
		ims.framework.utils.Date date2 = valueObject.getDateSent();		
		if ( date2 != null ) 
		{
			value2 = date2.getDate();
		}
		domainObject.setDateSent(value2);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComment() != null && valueObject.getComment().equals(""))
		{
			valueObject.setComment(null);
		}
		domainObject.setComment(valueObject.getComment());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value4 = null;
		if ( null != valueObject.getRecordingUser() ) 
		{
			if (valueObject.getRecordingUser().getBoId() == null)
			{
				if (domMap.get(valueObject.getRecordingUser()) != null)
				{
					value4 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getRecordingUser());
				}
			}
			else
			{
				value4 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getRecordingUser().getBoId());
			}
		}
		domainObject.setRecordingUser(value4);
		ims.framework.utils.DateTime dateTime5 = valueObject.getRecordingDateTime();
		java.util.Date value5 = null;
		if ( dateTime5 != null ) 
		{
			value5 = dateTime5.getJavaDate();
		}
		domainObject.setRecordingDateTime(value5);

		return domainObject;
	}

}
