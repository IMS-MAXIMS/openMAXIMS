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
package ims.chooseandbook.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Barbara Worwood
 */
public class PdsRequestVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.chooseandbook.vo.PdsRequestVo copy(ims.chooseandbook.vo.PdsRequestVo valueObjectDest, ims.chooseandbook.vo.PdsRequestVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PdsRequest(valueObjectSrc.getID_PdsRequest());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// nhsn
		valueObjectDest.setNhsn(valueObjectSrc.getNhsn());
		// dateTimeRequested
		valueObjectDest.setDateTimeRequested(valueObjectSrc.getDateTimeRequested());
		// dateTimeLastChecked
		valueObjectDest.setDateTimeLastChecked(valueObjectSrc.getDateTimeLastChecked());
		// active
		valueObjectDest.setActive(valueObjectSrc.getActive());
		// comments
		valueObjectDest.setComments(valueObjectSrc.getComments());
		// success
		valueObjectDest.setSuccess(valueObjectSrc.getSuccess());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPdsRequestVoCollectionFromPdsRequest(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.choose_book.domain.objects.PdsRequest objects.
	 */
	public static ims.chooseandbook.vo.PdsRequestVoCollection createPdsRequestVoCollectionFromPdsRequest(java.util.Set domainObjectSet)	
	{
		return createPdsRequestVoCollectionFromPdsRequest(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.choose_book.domain.objects.PdsRequest objects.
	 */
	public static ims.chooseandbook.vo.PdsRequestVoCollection createPdsRequestVoCollectionFromPdsRequest(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.chooseandbook.vo.PdsRequestVoCollection voList = new ims.chooseandbook.vo.PdsRequestVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.choose_book.domain.objects.PdsRequest domainObject = (ims.choose_book.domain.objects.PdsRequest) iterator.next();
			ims.chooseandbook.vo.PdsRequestVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.choose_book.domain.objects.PdsRequest objects.
	 */
	public static ims.chooseandbook.vo.PdsRequestVoCollection createPdsRequestVoCollectionFromPdsRequest(java.util.List domainObjectList) 
	{
		return createPdsRequestVoCollectionFromPdsRequest(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.choose_book.domain.objects.PdsRequest objects.
	 */
	public static ims.chooseandbook.vo.PdsRequestVoCollection createPdsRequestVoCollectionFromPdsRequest(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.chooseandbook.vo.PdsRequestVoCollection voList = new ims.chooseandbook.vo.PdsRequestVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.choose_book.domain.objects.PdsRequest domainObject = (ims.choose_book.domain.objects.PdsRequest) domainObjectList.get(i);
			ims.chooseandbook.vo.PdsRequestVo vo = create(map, domainObject);

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
	 * Create the ims.choose_book.domain.objects.PdsRequest set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPdsRequestSet(ims.domain.ILightweightDomainFactory domainFactory, ims.chooseandbook.vo.PdsRequestVoCollection voCollection) 
	 {
	 	return extractPdsRequestSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPdsRequestSet(ims.domain.ILightweightDomainFactory domainFactory, ims.chooseandbook.vo.PdsRequestVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.chooseandbook.vo.PdsRequestVo vo = voCollection.get(i);
			ims.choose_book.domain.objects.PdsRequest domainObject = PdsRequestVoAssembler.extractPdsRequest(domainFactory, vo, domMap);

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
	 * Create the ims.choose_book.domain.objects.PdsRequest list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPdsRequestList(ims.domain.ILightweightDomainFactory domainFactory, ims.chooseandbook.vo.PdsRequestVoCollection voCollection) 
	 {
	 	return extractPdsRequestList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPdsRequestList(ims.domain.ILightweightDomainFactory domainFactory, ims.chooseandbook.vo.PdsRequestVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.chooseandbook.vo.PdsRequestVo vo = voCollection.get(i);
			ims.choose_book.domain.objects.PdsRequest domainObject = PdsRequestVoAssembler.extractPdsRequest(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.choose_book.domain.objects.PdsRequest object.
	 * @param domainObject ims.choose_book.domain.objects.PdsRequest
	 */
	 public static ims.chooseandbook.vo.PdsRequestVo create(ims.choose_book.domain.objects.PdsRequest domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.choose_book.domain.objects.PdsRequest object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.chooseandbook.vo.PdsRequestVo create(DomainObjectMap map, ims.choose_book.domain.objects.PdsRequest domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.chooseandbook.vo.PdsRequestVo valueObject = (ims.chooseandbook.vo.PdsRequestVo) map.getValueObject(domainObject, ims.chooseandbook.vo.PdsRequestVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.chooseandbook.vo.PdsRequestVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.choose_book.domain.objects.PdsRequest
	 */
	 public static ims.chooseandbook.vo.PdsRequestVo insert(ims.chooseandbook.vo.PdsRequestVo valueObject, ims.choose_book.domain.objects.PdsRequest domainObject) 
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
	 * @param domainObject ims.choose_book.domain.objects.PdsRequest
	 */
	 public static ims.chooseandbook.vo.PdsRequestVo insert(DomainObjectMap map, ims.chooseandbook.vo.PdsRequestVo valueObject, ims.choose_book.domain.objects.PdsRequest domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PdsRequest(domainObject.getId());
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
			
		// nhsn
		valueObject.setNhsn(domainObject.getNhsn());
		// dateTimeRequested
		java.util.Date dateTimeRequested = domainObject.getDateTimeRequested();
		if ( null != dateTimeRequested ) 
		{
			valueObject.setDateTimeRequested(new ims.framework.utils.DateTime(dateTimeRequested) );
		}
		// dateTimeLastChecked
		java.util.Date dateTimeLastChecked = domainObject.getDateTimeLastChecked();
		if ( null != dateTimeLastChecked ) 
		{
			valueObject.setDateTimeLastChecked(new ims.framework.utils.DateTime(dateTimeLastChecked) );
		}
		// active
		valueObject.setActive( domainObject.isActive() );
		// comments
		valueObject.setComments(domainObject.getComments());
		// success
		ims.domain.lookups.LookupInstance instance6 = domainObject.getSuccess();
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

			ims.core.vo.lookups.YesNo voLookup6 = new ims.core.vo.lookups.YesNo(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.YesNo(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setSuccess(voLookup6);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.choose_book.domain.objects.PdsRequest extractPdsRequest(ims.domain.ILightweightDomainFactory domainFactory, ims.chooseandbook.vo.PdsRequestVo valueObject) 
	{
		return 	extractPdsRequest(domainFactory, valueObject, new HashMap());
	}

	public static ims.choose_book.domain.objects.PdsRequest extractPdsRequest(ims.domain.ILightweightDomainFactory domainFactory, ims.chooseandbook.vo.PdsRequestVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PdsRequest();
		ims.choose_book.domain.objects.PdsRequest domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.choose_book.domain.objects.PdsRequest)domMap.get(valueObject);
			}
			// ims.chooseandbook.vo.PdsRequestVo ID_PdsRequest field is unknown
			domainObject = new ims.choose_book.domain.objects.PdsRequest();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PdsRequest());
			if (domMap.get(key) != null)
			{
				return (ims.choose_book.domain.objects.PdsRequest)domMap.get(key);
			}
			domainObject = (ims.choose_book.domain.objects.PdsRequest) domainFactory.getDomainObject(ims.choose_book.domain.objects.PdsRequest.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PdsRequest());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNhsn() != null && valueObject.getNhsn().equals(""))
		{
			valueObject.setNhsn(null);
		}
		domainObject.setNhsn(valueObject.getNhsn());
		ims.framework.utils.DateTime dateTime2 = valueObject.getDateTimeRequested();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setDateTimeRequested(value2);
		ims.framework.utils.DateTime dateTime3 = valueObject.getDateTimeLastChecked();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setDateTimeLastChecked(value3);
		domainObject.setActive(valueObject.getActive());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComments() != null && valueObject.getComments().equals(""))
		{
			valueObject.setComments(null);
		}
		domainObject.setComments(valueObject.getComments());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getSuccess() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getSuccess().getID());
		}
		domainObject.setSuccess(value6);

		return domainObject;
	}

}
