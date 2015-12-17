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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class PatientMergeHistoryVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PatientMergeHistoryVo copy(ims.core.vo.PatientMergeHistoryVo valueObjectDest, ims.core.vo.PatientMergeHistoryVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientMergeHistory(valueObjectSrc.getID_PatientMergeHistory());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// SourcePatId
		valueObjectDest.setSourcePatId(valueObjectSrc.getSourcePatId());
		// DestinationPatId
		valueObjectDest.setDestinationPatId(valueObjectSrc.getDestinationPatId());
		// RequestedBy
		valueObjectDest.setRequestedBy(valueObjectSrc.getRequestedBy());
		// CreationDateTime
		valueObjectDest.setCreationDateTime(valueObjectSrc.getCreationDateTime());
		// Comment
		valueObjectDest.setComment(valueObjectSrc.getComment());
		// PatientIds
		valueObjectDest.setPatientIds(valueObjectSrc.getPatientIds());
		// DatabaseName
		valueObjectDest.setDatabaseName(valueObjectSrc.getDatabaseName());
		// Items
		valueObjectDest.setItems(valueObjectSrc.getItems());
		// Hostname
		valueObjectDest.setHostname(valueObjectSrc.getHostname());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientMergeHistoryVoCollectionFromPatientMergeHistory(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.PatientMergeHistory objects.
	 */
	public static ims.core.vo.PatientMergeHistoryVoCollection createPatientMergeHistoryVoCollectionFromPatientMergeHistory(java.util.Set domainObjectSet)	
	{
		return createPatientMergeHistoryVoCollectionFromPatientMergeHistory(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.PatientMergeHistory objects.
	 */
	public static ims.core.vo.PatientMergeHistoryVoCollection createPatientMergeHistoryVoCollectionFromPatientMergeHistory(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatientMergeHistoryVoCollection voList = new ims.core.vo.PatientMergeHistoryVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.patient.domain.objects.PatientMergeHistory domainObject = (ims.core.patient.domain.objects.PatientMergeHistory) iterator.next();
			ims.core.vo.PatientMergeHistoryVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.patient.domain.objects.PatientMergeHistory objects.
	 */
	public static ims.core.vo.PatientMergeHistoryVoCollection createPatientMergeHistoryVoCollectionFromPatientMergeHistory(java.util.List domainObjectList) 
	{
		return createPatientMergeHistoryVoCollectionFromPatientMergeHistory(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.patient.domain.objects.PatientMergeHistory objects.
	 */
	public static ims.core.vo.PatientMergeHistoryVoCollection createPatientMergeHistoryVoCollectionFromPatientMergeHistory(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatientMergeHistoryVoCollection voList = new ims.core.vo.PatientMergeHistoryVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.patient.domain.objects.PatientMergeHistory domainObject = (ims.core.patient.domain.objects.PatientMergeHistory) domainObjectList.get(i);
			ims.core.vo.PatientMergeHistoryVo vo = create(map, domainObject);

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
	 * Create the ims.core.patient.domain.objects.PatientMergeHistory set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientMergeHistorySet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientMergeHistoryVoCollection voCollection) 
	 {
	 	return extractPatientMergeHistorySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientMergeHistorySet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientMergeHistoryVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientMergeHistoryVo vo = voCollection.get(i);
			ims.core.patient.domain.objects.PatientMergeHistory domainObject = PatientMergeHistoryVoAssembler.extractPatientMergeHistory(domainFactory, vo, domMap);

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
	 * Create the ims.core.patient.domain.objects.PatientMergeHistory list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientMergeHistoryList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientMergeHistoryVoCollection voCollection) 
	 {
	 	return extractPatientMergeHistoryList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientMergeHistoryList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientMergeHistoryVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientMergeHistoryVo vo = voCollection.get(i);
			ims.core.patient.domain.objects.PatientMergeHistory domainObject = PatientMergeHistoryVoAssembler.extractPatientMergeHistory(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.patient.domain.objects.PatientMergeHistory object.
	 * @param domainObject ims.core.patient.domain.objects.PatientMergeHistory
	 */
	 public static ims.core.vo.PatientMergeHistoryVo create(ims.core.patient.domain.objects.PatientMergeHistory domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.patient.domain.objects.PatientMergeHistory object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PatientMergeHistoryVo create(DomainObjectMap map, ims.core.patient.domain.objects.PatientMergeHistory domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PatientMergeHistoryVo valueObject = (ims.core.vo.PatientMergeHistoryVo) map.getValueObject(domainObject, ims.core.vo.PatientMergeHistoryVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PatientMergeHistoryVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.patient.domain.objects.PatientMergeHistory
	 */
	 public static ims.core.vo.PatientMergeHistoryVo insert(ims.core.vo.PatientMergeHistoryVo valueObject, ims.core.patient.domain.objects.PatientMergeHistory domainObject) 
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
	 * @param domainObject ims.core.patient.domain.objects.PatientMergeHistory
	 */
	 public static ims.core.vo.PatientMergeHistoryVo insert(DomainObjectMap map, ims.core.vo.PatientMergeHistoryVo valueObject, ims.core.patient.domain.objects.PatientMergeHistory domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientMergeHistory(domainObject.getId());
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
			
		// SourcePatId
		valueObject.setSourcePatId(domainObject.getSourcePatId());
		// DestinationPatId
		valueObject.setDestinationPatId(domainObject.getDestinationPatId());
		// RequestedBy
		valueObject.setRequestedBy(ims.core.vo.domain.MemberOfStaffVoAssembler.create(map, domainObject.getRequestedBy()) );
		// CreationDateTime
		java.util.Date CreationDateTime = domainObject.getCreationDateTime();
		if ( null != CreationDateTime ) 
		{
			valueObject.setCreationDateTime(new ims.framework.utils.DateTime(CreationDateTime) );
		}
		// Comment
		valueObject.setComment(domainObject.getComment());
		// PatientIds
		valueObject.setPatientIds(ims.core.vo.domain.PatientIdAssembler.createPatientIdCollectionFromPatientId(map, domainObject.getPatientIds()) );
		// DatabaseName
		valueObject.setDatabaseName(domainObject.getDatabaseName());
		// Items
		valueObject.setItems(ims.core.vo.domain.MergedTablesVoAssembler.createMergedTablesVoCollectionFromMergedTables(map, domainObject.getItems()) );
		// Hostname
		valueObject.setHostname(domainObject.getHostname());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.patient.domain.objects.PatientMergeHistory extractPatientMergeHistory(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientMergeHistoryVo valueObject) 
	{
		return 	extractPatientMergeHistory(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.patient.domain.objects.PatientMergeHistory extractPatientMergeHistory(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientMergeHistoryVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientMergeHistory();
		ims.core.patient.domain.objects.PatientMergeHistory domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.patient.domain.objects.PatientMergeHistory)domMap.get(valueObject);
			}
			// ims.core.vo.PatientMergeHistoryVo ID_PatientMergeHistory field is unknown
			domainObject = new ims.core.patient.domain.objects.PatientMergeHistory();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientMergeHistory());
			if (domMap.get(key) != null)
			{
				return (ims.core.patient.domain.objects.PatientMergeHistory)domMap.get(key);
			}
			domainObject = (ims.core.patient.domain.objects.PatientMergeHistory) domainFactory.getDomainObject(ims.core.patient.domain.objects.PatientMergeHistory.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientMergeHistory());

		domainObject.setSourcePatId(valueObject.getSourcePatId());
		domainObject.setDestinationPatId(valueObject.getDestinationPatId());
		domainObject.setRequestedBy(ims.core.vo.domain.MemberOfStaffVoAssembler.extractMemberOfStaff(domainFactory, valueObject.getRequestedBy(), domMap));
		ims.framework.utils.DateTime dateTime4 = valueObject.getCreationDateTime();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setCreationDateTime(value4);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComment() != null && valueObject.getComment().equals(""))
		{
			valueObject.setComment(null);
		}
		domainObject.setComment(valueObject.getComment());

		// SaveAsRefVO treated as RefValueObject
		ims.core.patient.vo.PatientIdRefVoCollection refCollection6 = new ims.core.patient.vo.PatientIdRefVoCollection();
		if (valueObject.getPatientIds() != null)
		{
			for (int i6=0; i6<valueObject.getPatientIds().size(); i6++)
			{
				ims.core.patient.vo.PatientIdRefVo ref6 = (ims.core.patient.vo.PatientIdRefVo)valueObject.getPatientIds().get(i6);
				refCollection6.add(ref6);
			}
		}
		int size6 = (null == refCollection6) ? 0 : refCollection6.size();		
		java.util.List domainPatientIds6 = domainObject.getPatientIds();
		if (domainPatientIds6 == null)
		{
			domainPatientIds6 = new java.util.ArrayList();
		}
		for(int i=0; i < size6; i++) 
		{
			ims.core.patient.vo.PatientIdRefVo vo = refCollection6.get(i);			
			ims.core.patient.domain.objects.PatientId dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.patient.domain.objects.PatientId)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.patient.domain.objects.PatientId)domainFactory.getDomainObject( ims.core.patient.domain.objects.PatientId.class, vo.getBoId());
				}
			}

			int domIdx = domainPatientIds6.indexOf(dom);
			if (domIdx == -1)
			{
				domainPatientIds6.add(i, dom);
			}
			else if (i != domIdx && i < domainPatientIds6.size())
			{
				Object tmp = domainPatientIds6.get(i);
				domainPatientIds6.set(i, domainPatientIds6.get(domIdx));
				domainPatientIds6.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i6 = domainPatientIds6.size();
		while (i6 > size6)
		{
			domainPatientIds6.remove(i6-1);
			i6 = domainPatientIds6.size();
		}
		
		domainObject.setPatientIds(domainPatientIds6);		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDatabaseName() != null && valueObject.getDatabaseName().equals(""))
		{
			valueObject.setDatabaseName(null);
		}
		domainObject.setDatabaseName(valueObject.getDatabaseName());

		// SaveAsRefVO treated as RefValueObject
		ims.core.patient.vo.MergedTablesRefVoCollection refCollection8 = new ims.core.patient.vo.MergedTablesRefVoCollection();
		if (valueObject.getItems() != null)
		{
			for (int i8=0; i8<valueObject.getItems().size(); i8++)
			{
				ims.core.patient.vo.MergedTablesRefVo ref8 = (ims.core.patient.vo.MergedTablesRefVo)valueObject.getItems().get(i8);
				refCollection8.add(ref8);
			}
		}
		int size8 = (null == refCollection8) ? 0 : refCollection8.size();		
		java.util.List domainItems8 = domainObject.getItems();
		if (domainItems8 == null)
		{
			domainItems8 = new java.util.ArrayList();
		}
		for(int i=0; i < size8; i++) 
		{
			ims.core.patient.vo.MergedTablesRefVo vo = refCollection8.get(i);			
			ims.core.patient.domain.objects.MergedTables dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.patient.domain.objects.MergedTables)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.patient.domain.objects.MergedTables)domainFactory.getDomainObject( ims.core.patient.domain.objects.MergedTables.class, vo.getBoId());
				}
			}

			int domIdx = domainItems8.indexOf(dom);
			if (domIdx == -1)
			{
				domainItems8.add(i, dom);
			}
			else if (i != domIdx && i < domainItems8.size())
			{
				Object tmp = domainItems8.get(i);
				domainItems8.set(i, domainItems8.get(domIdx));
				domainItems8.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i8 = domainItems8.size();
		while (i8 > size8)
		{
			domainItems8.remove(i8-1);
			i8 = domainItems8.size();
		}
		
		domainObject.setItems(domainItems8);		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getHostname() != null && valueObject.getHostname().equals(""))
		{
			valueObject.setHostname(null);
		}
		domainObject.setHostname(valueObject.getHostname());

		return domainObject;
	}

}
