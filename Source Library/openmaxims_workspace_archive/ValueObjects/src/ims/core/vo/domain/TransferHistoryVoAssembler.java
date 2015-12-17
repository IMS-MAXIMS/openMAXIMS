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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cornel Ventuneac
 */
public class TransferHistoryVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.TransferHistoryVo copy(ims.core.vo.TransferHistoryVo valueObjectDest, ims.core.vo.TransferHistoryVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_TransferHistory(valueObjectSrc.getID_TransferHistory());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TransferringFromWard
		valueObjectDest.setTransferringFromWard(valueObjectSrc.getTransferringFromWard());
		// MarkedForTransferOutDateTime
		valueObjectDest.setMarkedForTransferOutDateTime(valueObjectSrc.getMarkedForTransferOutDateTime());
		// AcceptingOrRejectingWard
		valueObjectDest.setAcceptingOrRejectingWard(valueObjectSrc.getAcceptingOrRejectingWard());
		// AcceptTransferDateTime
		valueObjectDest.setAcceptTransferDateTime(valueObjectSrc.getAcceptTransferDateTime());
		// RejectTransferDateTime
		valueObjectDest.setRejectTransferDateTime(valueObjectSrc.getRejectTransferDateTime());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTransferHistoryVoCollectionFromTransferHistory(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.TransferHistory objects.
	 */
	public static ims.core.vo.TransferHistoryVoCollection createTransferHistoryVoCollectionFromTransferHistory(java.util.Set domainObjectSet)	
	{
		return createTransferHistoryVoCollectionFromTransferHistory(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.TransferHistory objects.
	 */
	public static ims.core.vo.TransferHistoryVoCollection createTransferHistoryVoCollectionFromTransferHistory(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.TransferHistoryVoCollection voList = new ims.core.vo.TransferHistoryVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.pas.domain.objects.TransferHistory domainObject = (ims.core.admin.pas.domain.objects.TransferHistory) iterator.next();
			ims.core.vo.TransferHistoryVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.TransferHistory objects.
	 */
	public static ims.core.vo.TransferHistoryVoCollection createTransferHistoryVoCollectionFromTransferHistory(java.util.List domainObjectList) 
	{
		return createTransferHistoryVoCollectionFromTransferHistory(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.TransferHistory objects.
	 */
	public static ims.core.vo.TransferHistoryVoCollection createTransferHistoryVoCollectionFromTransferHistory(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.TransferHistoryVoCollection voList = new ims.core.vo.TransferHistoryVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.TransferHistory domainObject = (ims.core.admin.pas.domain.objects.TransferHistory) domainObjectList.get(i);
			ims.core.vo.TransferHistoryVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.pas.domain.objects.TransferHistory set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTransferHistorySet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.TransferHistoryVoCollection voCollection) 
	 {
	 	return extractTransferHistorySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTransferHistorySet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.TransferHistoryVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.TransferHistoryVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.TransferHistory domainObject = TransferHistoryVoAssembler.extractTransferHistory(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.pas.domain.objects.TransferHistory list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTransferHistoryList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.TransferHistoryVoCollection voCollection) 
	 {
	 	return extractTransferHistoryList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTransferHistoryList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.TransferHistoryVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.TransferHistoryVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.TransferHistory domainObject = TransferHistoryVoAssembler.extractTransferHistory(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.pas.domain.objects.TransferHistory object.
	 * @param domainObject ims.core.admin.pas.domain.objects.TransferHistory
	 */
	 public static ims.core.vo.TransferHistoryVo create(ims.core.admin.pas.domain.objects.TransferHistory domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.pas.domain.objects.TransferHistory object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.TransferHistoryVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.TransferHistory domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.TransferHistoryVo valueObject = (ims.core.vo.TransferHistoryVo) map.getValueObject(domainObject, ims.core.vo.TransferHistoryVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.TransferHistoryVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.pas.domain.objects.TransferHistory
	 */
	 public static ims.core.vo.TransferHistoryVo insert(ims.core.vo.TransferHistoryVo valueObject, ims.core.admin.pas.domain.objects.TransferHistory domainObject) 
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
	 * @param domainObject ims.core.admin.pas.domain.objects.TransferHistory
	 */
	 public static ims.core.vo.TransferHistoryVo insert(DomainObjectMap map, ims.core.vo.TransferHistoryVo valueObject, ims.core.admin.pas.domain.objects.TransferHistory domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_TransferHistory(domainObject.getId());
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
			
		// TransferringFromWard
		valueObject.setTransferringFromWard(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getTransferringFromWard()) );
		// MarkedForTransferOutDateTime
		java.util.Date MarkedForTransferOutDateTime = domainObject.getMarkedForTransferOutDateTime();
		if ( null != MarkedForTransferOutDateTime ) 
		{
			valueObject.setMarkedForTransferOutDateTime(new ims.framework.utils.DateTime(MarkedForTransferOutDateTime) );
		}
		// AcceptingOrRejectingWard
		valueObject.setAcceptingOrRejectingWard(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getAcceptingOrRejectingWard()) );
		// AcceptTransferDateTime
		java.util.Date AcceptTransferDateTime = domainObject.getAcceptTransferDateTime();
		if ( null != AcceptTransferDateTime ) 
		{
			valueObject.setAcceptTransferDateTime(new ims.framework.utils.DateTime(AcceptTransferDateTime) );
		}
		// RejectTransferDateTime
		java.util.Date RejectTransferDateTime = domainObject.getRejectTransferDateTime();
		if ( null != RejectTransferDateTime ) 
		{
			valueObject.setRejectTransferDateTime(new ims.framework.utils.DateTime(RejectTransferDateTime) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.pas.domain.objects.TransferHistory extractTransferHistory(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.TransferHistoryVo valueObject) 
	{
		return 	extractTransferHistory(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.TransferHistory extractTransferHistory(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.TransferHistoryVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_TransferHistory();
		ims.core.admin.pas.domain.objects.TransferHistory domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.pas.domain.objects.TransferHistory)domMap.get(valueObject);
			}
			// ims.core.vo.TransferHistoryVo ID_TransferHistory field is unknown
			domainObject = new ims.core.admin.pas.domain.objects.TransferHistory();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_TransferHistory());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.pas.domain.objects.TransferHistory)domMap.get(key);
			}
			domainObject = (ims.core.admin.pas.domain.objects.TransferHistory) domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.TransferHistory.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_TransferHistory());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value1 = null;
		if ( null != valueObject.getTransferringFromWard() ) 
		{
			if (valueObject.getTransferringFromWard().getBoId() == null)
			{
				if (domMap.get(valueObject.getTransferringFromWard()) != null)
				{
					value1 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getTransferringFromWard());
				}
			}
			else
			{
				value1 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getTransferringFromWard().getBoId());
			}
		}
		domainObject.setTransferringFromWard(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getMarkedForTransferOutDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setMarkedForTransferOutDateTime(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value3 = null;
		if ( null != valueObject.getAcceptingOrRejectingWard() ) 
		{
			if (valueObject.getAcceptingOrRejectingWard().getBoId() == null)
			{
				if (domMap.get(valueObject.getAcceptingOrRejectingWard()) != null)
				{
					value3 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getAcceptingOrRejectingWard());
				}
			}
			else
			{
				value3 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getAcceptingOrRejectingWard().getBoId());
			}
		}
		domainObject.setAcceptingOrRejectingWard(value3);
		ims.framework.utils.DateTime dateTime4 = valueObject.getAcceptTransferDateTime();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setAcceptTransferDateTime(value4);
		ims.framework.utils.DateTime dateTime5 = valueObject.getRejectTransferDateTime();
		java.util.Date value5 = null;
		if ( dateTime5 != null ) 
		{
			value5 = dateTime5.getJavaDate();
		}
		domainObject.setRejectTransferDateTime(value5);

		return domainObject;
	}

}
