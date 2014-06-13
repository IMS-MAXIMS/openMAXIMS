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
 * @author Vasile Purdila
 */
public class CDSHistoryVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.CDSHistoryVo copy(ims.core.vo.CDSHistoryVo valueObjectDest, ims.core.vo.CDSHistoryVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CDSHistory(valueObjectSrc.getID_CDSHistory());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// JobStartTime
		valueObjectDest.setJobStartTime(valueObjectSrc.getJobStartTime());
		// JobEndTime
		valueObjectDest.setJobEndTime(valueObjectSrc.getJobEndTime());
		// JobSuccessful
		valueObjectDest.setJobSuccessful(valueObjectSrc.getJobSuccessful());
		// ErrorMessage
		valueObjectDest.setErrorMessage(valueObjectSrc.getErrorMessage());
		// ReportType
		valueObjectDest.setReportType(valueObjectSrc.getReportType());
		// StartDate
		valueObjectDest.setStartDate(valueObjectSrc.getStartDate());
		// EndDate
		valueObjectDest.setEndDate(valueObjectSrc.getEndDate());
		// Location
		valueObjectDest.setLocation(valueObjectSrc.getLocation());
		// LogUrl
		valueObjectDest.setLogUrl(valueObjectSrc.getLogUrl());
		// FileUrl
		valueObjectDest.setFileUrl(valueObjectSrc.getFileUrl());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCDSHistoryVoCollectionFromCDSHistory(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.cds.domain.objects.CDSHistory objects.
	 */
	public static ims.core.vo.CDSHistoryVoCollection createCDSHistoryVoCollectionFromCDSHistory(java.util.Set domainObjectSet)	
	{
		return createCDSHistoryVoCollectionFromCDSHistory(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.cds.domain.objects.CDSHistory objects.
	 */
	public static ims.core.vo.CDSHistoryVoCollection createCDSHistoryVoCollectionFromCDSHistory(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.CDSHistoryVoCollection voList = new ims.core.vo.CDSHistoryVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.cds.domain.objects.CDSHistory domainObject = (ims.core.cds.domain.objects.CDSHistory) iterator.next();
			ims.core.vo.CDSHistoryVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.cds.domain.objects.CDSHistory objects.
	 */
	public static ims.core.vo.CDSHistoryVoCollection createCDSHistoryVoCollectionFromCDSHistory(java.util.List domainObjectList) 
	{
		return createCDSHistoryVoCollectionFromCDSHistory(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.cds.domain.objects.CDSHistory objects.
	 */
	public static ims.core.vo.CDSHistoryVoCollection createCDSHistoryVoCollectionFromCDSHistory(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.CDSHistoryVoCollection voList = new ims.core.vo.CDSHistoryVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.cds.domain.objects.CDSHistory domainObject = (ims.core.cds.domain.objects.CDSHistory) domainObjectList.get(i);
			ims.core.vo.CDSHistoryVo vo = create(map, domainObject);

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
	 * Create the ims.core.cds.domain.objects.CDSHistory set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractCDSHistorySet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CDSHistoryVoCollection voCollection) 
	 {
	 	return extractCDSHistorySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCDSHistorySet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CDSHistoryVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.CDSHistoryVo vo = voCollection.get(i);
			ims.core.cds.domain.objects.CDSHistory domainObject = CDSHistoryVoAssembler.extractCDSHistory(domainFactory, vo, domMap);

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
	 * Create the ims.core.cds.domain.objects.CDSHistory list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractCDSHistoryList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CDSHistoryVoCollection voCollection) 
	 {
	 	return extractCDSHistoryList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCDSHistoryList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CDSHistoryVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.CDSHistoryVo vo = voCollection.get(i);
			ims.core.cds.domain.objects.CDSHistory domainObject = CDSHistoryVoAssembler.extractCDSHistory(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.cds.domain.objects.CDSHistory object.
	 * @param domainObject ims.core.cds.domain.objects.CDSHistory
	 */
	 public static ims.core.vo.CDSHistoryVo create(ims.core.cds.domain.objects.CDSHistory domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.cds.domain.objects.CDSHistory object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.CDSHistoryVo create(DomainObjectMap map, ims.core.cds.domain.objects.CDSHistory domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.CDSHistoryVo valueObject = (ims.core.vo.CDSHistoryVo) map.getValueObject(domainObject, ims.core.vo.CDSHistoryVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.CDSHistoryVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.cds.domain.objects.CDSHistory
	 */
	 public static ims.core.vo.CDSHistoryVo insert(ims.core.vo.CDSHistoryVo valueObject, ims.core.cds.domain.objects.CDSHistory domainObject) 
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
	 * @param domainObject ims.core.cds.domain.objects.CDSHistory
	 */
	 public static ims.core.vo.CDSHistoryVo insert(DomainObjectMap map, ims.core.vo.CDSHistoryVo valueObject, ims.core.cds.domain.objects.CDSHistory domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_CDSHistory(domainObject.getId());
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
			
		// JobStartTime
		java.util.Date JobStartTime = domainObject.getJobStartTime();
		if ( null != JobStartTime ) 
		{
			valueObject.setJobStartTime(new ims.framework.utils.DateTime(JobStartTime) );
		}
		// JobEndTime
		java.util.Date JobEndTime = domainObject.getJobEndTime();
		if ( null != JobEndTime ) 
		{
			valueObject.setJobEndTime(new ims.framework.utils.DateTime(JobEndTime) );
		}
		// JobSuccessful
		valueObject.setJobSuccessful( domainObject.isJobSuccessful() );
		// ErrorMessage
		valueObject.setErrorMessage(domainObject.getErrorMessage());
		// ReportType
		ims.domain.lookups.LookupInstance instance5 = domainObject.getReportType();
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

			ims.core.vo.lookups.CDSReportType voLookup5 = new ims.core.vo.lookups.CDSReportType(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.CDSReportType parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.CDSReportType(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setReportType(voLookup5);
		}
				// StartDate
		java.util.Date StartDate = domainObject.getStartDate();
		if ( null != StartDate ) 
		{
			valueObject.setStartDate(new ims.framework.utils.Date(StartDate) );
		}
		// EndDate
		java.util.Date EndDate = domainObject.getEndDate();
		if ( null != EndDate ) 
		{
			valueObject.setEndDate(new ims.framework.utils.Date(EndDate) );
		}
		// Location
		valueObject.setLocation(domainObject.getLocation());
		// LogUrl
		valueObject.setLogUrl(domainObject.getLogUrl());
		// FileUrl
		valueObject.setFileUrl(domainObject.getFileUrl());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.cds.domain.objects.CDSHistory extractCDSHistory(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CDSHistoryVo valueObject) 
	{
		return 	extractCDSHistory(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.cds.domain.objects.CDSHistory extractCDSHistory(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CDSHistoryVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_CDSHistory();
		ims.core.cds.domain.objects.CDSHistory domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.cds.domain.objects.CDSHistory)domMap.get(valueObject);
			}
			// ims.core.vo.CDSHistoryVo ID_CDSHistory field is unknown
			domainObject = new ims.core.cds.domain.objects.CDSHistory();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_CDSHistory());
			if (domMap.get(key) != null)
			{
				return (ims.core.cds.domain.objects.CDSHistory)domMap.get(key);
			}
			domainObject = (ims.core.cds.domain.objects.CDSHistory) domainFactory.getDomainObject(ims.core.cds.domain.objects.CDSHistory.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_CDSHistory());

		ims.framework.utils.DateTime dateTime1 = valueObject.getJobStartTime();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setJobStartTime(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getJobEndTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setJobEndTime(value2);
		domainObject.setJobSuccessful(valueObject.getJobSuccessful());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getErrorMessage() != null && valueObject.getErrorMessage().equals(""))
		{
			valueObject.setErrorMessage(null);
		}
		domainObject.setErrorMessage(valueObject.getErrorMessage());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getReportType() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getReportType().getID());
		}
		domainObject.setReportType(value5);
		java.util.Date value6 = null;
		ims.framework.utils.Date date6 = valueObject.getStartDate();		
		if ( date6 != null ) 
		{
			value6 = date6.getDate();
		}
		domainObject.setStartDate(value6);
		java.util.Date value7 = null;
		ims.framework.utils.Date date7 = valueObject.getEndDate();		
		if ( date7 != null ) 
		{
			value7 = date7.getDate();
		}
		domainObject.setEndDate(value7);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLocation() != null && valueObject.getLocation().equals(""))
		{
			valueObject.setLocation(null);
		}
		domainObject.setLocation(valueObject.getLocation());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLogUrl() != null && valueObject.getLogUrl().equals(""))
		{
			valueObject.setLogUrl(null);
		}
		domainObject.setLogUrl(valueObject.getLogUrl());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getFileUrl() != null && valueObject.getFileUrl().equals(""))
		{
			valueObject.setFileUrl(null);
		}
		domainObject.setFileUrl(valueObject.getFileUrl());

		return domainObject;
	}

}
