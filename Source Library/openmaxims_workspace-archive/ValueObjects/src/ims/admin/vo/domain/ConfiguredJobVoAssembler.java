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
package ims.admin.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Catalin Tomozei
 */
public class ConfiguredJobVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.admin.vo.ConfiguredJobVo copy(ims.admin.vo.ConfiguredJobVo valueObjectDest, ims.admin.vo.ConfiguredJobVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ConfiguredJob(valueObjectSrc.getID_ConfiguredJob());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// StartDateTime
		valueObjectDest.setStartDateTime(valueObjectSrc.getStartDateTime());
		// EndDateTime
		valueObjectDest.setEndDateTime(valueObjectSrc.getEndDateTime());
		// IsCronTrigger
		valueObjectDest.setIsCronTrigger(valueObjectSrc.getIsCronTrigger());
		// CronExpression
		valueObjectDest.setCronExpression(valueObjectSrc.getCronExpression());
		// LastRun
		valueObjectDest.setLastRun(valueObjectSrc.getLastRun());
		// NextRun
		valueObjectDest.setNextRun(valueObjectSrc.getNextRun());
		// CronExpressionDisplay
		valueObjectDest.setCronExpressionDisplay(valueObjectSrc.getCronExpressionDisplay());
		// SystemInformation
		valueObjectDest.setSystemInformation(valueObjectSrc.getSystemInformation());
		// IsActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// Description
		valueObjectDest.setDescription(valueObjectSrc.getDescription());
		// ScheduledJob
		valueObjectDest.setScheduledJob(valueObjectSrc.getScheduledJob());
		// Frequency
		valueObjectDest.setFrequency(valueObjectSrc.getFrequency());
		// NotificationsOnSuccess
		valueObjectDest.setNotificationsOnSuccess(valueObjectSrc.getNotificationsOnSuccess());
		// NotificationsOnFailure
		valueObjectDest.setNotificationsOnFailure(valueObjectSrc.getNotificationsOnFailure());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createConfiguredJobVoCollectionFromConfiguredJob(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.configuration.domain.objects.ConfiguredJob objects.
	 */
	public static ims.admin.vo.ConfiguredJobVoCollection createConfiguredJobVoCollectionFromConfiguredJob(java.util.Set domainObjectSet)	
	{
		return createConfiguredJobVoCollectionFromConfiguredJob(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.configuration.domain.objects.ConfiguredJob objects.
	 */
	public static ims.admin.vo.ConfiguredJobVoCollection createConfiguredJobVoCollectionFromConfiguredJob(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.admin.vo.ConfiguredJobVoCollection voList = new ims.admin.vo.ConfiguredJobVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.configuration.domain.objects.ConfiguredJob domainObject = (ims.core.configuration.domain.objects.ConfiguredJob) iterator.next();
			ims.admin.vo.ConfiguredJobVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.configuration.domain.objects.ConfiguredJob objects.
	 */
	public static ims.admin.vo.ConfiguredJobVoCollection createConfiguredJobVoCollectionFromConfiguredJob(java.util.List domainObjectList) 
	{
		return createConfiguredJobVoCollectionFromConfiguredJob(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.configuration.domain.objects.ConfiguredJob objects.
	 */
	public static ims.admin.vo.ConfiguredJobVoCollection createConfiguredJobVoCollectionFromConfiguredJob(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.admin.vo.ConfiguredJobVoCollection voList = new ims.admin.vo.ConfiguredJobVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.configuration.domain.objects.ConfiguredJob domainObject = (ims.core.configuration.domain.objects.ConfiguredJob) domainObjectList.get(i);
			ims.admin.vo.ConfiguredJobVo vo = create(map, domainObject);

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
	 * Create the ims.core.configuration.domain.objects.ConfiguredJob set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractConfiguredJobSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ConfiguredJobVoCollection voCollection) 
	 {
	 	return extractConfiguredJobSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractConfiguredJobSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ConfiguredJobVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.ConfiguredJobVo vo = voCollection.get(i);
			ims.core.configuration.domain.objects.ConfiguredJob domainObject = ConfiguredJobVoAssembler.extractConfiguredJob(domainFactory, vo, domMap);

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
	 * Create the ims.core.configuration.domain.objects.ConfiguredJob list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractConfiguredJobList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ConfiguredJobVoCollection voCollection) 
	 {
	 	return extractConfiguredJobList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractConfiguredJobList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ConfiguredJobVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.ConfiguredJobVo vo = voCollection.get(i);
			ims.core.configuration.domain.objects.ConfiguredJob domainObject = ConfiguredJobVoAssembler.extractConfiguredJob(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.configuration.domain.objects.ConfiguredJob object.
	 * @param domainObject ims.core.configuration.domain.objects.ConfiguredJob
	 */
	 public static ims.admin.vo.ConfiguredJobVo create(ims.core.configuration.domain.objects.ConfiguredJob domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.configuration.domain.objects.ConfiguredJob object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.admin.vo.ConfiguredJobVo create(DomainObjectMap map, ims.core.configuration.domain.objects.ConfiguredJob domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.admin.vo.ConfiguredJobVo valueObject = (ims.admin.vo.ConfiguredJobVo) map.getValueObject(domainObject, ims.admin.vo.ConfiguredJobVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.admin.vo.ConfiguredJobVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.configuration.domain.objects.ConfiguredJob
	 */
	 public static ims.admin.vo.ConfiguredJobVo insert(ims.admin.vo.ConfiguredJobVo valueObject, ims.core.configuration.domain.objects.ConfiguredJob domainObject) 
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
	 * @param domainObject ims.core.configuration.domain.objects.ConfiguredJob
	 */
	 public static ims.admin.vo.ConfiguredJobVo insert(DomainObjectMap map, ims.admin.vo.ConfiguredJobVo valueObject, ims.core.configuration.domain.objects.ConfiguredJob domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ConfiguredJob(domainObject.getId());
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
			
		// StartDateTime
		java.util.Date StartDateTime = domainObject.getStartDateTime();
		if ( null != StartDateTime ) 
		{
			valueObject.setStartDateTime(new ims.framework.utils.DateTime(StartDateTime) );
		}
		// EndDateTime
		java.util.Date EndDateTime = domainObject.getEndDateTime();
		if ( null != EndDateTime ) 
		{
			valueObject.setEndDateTime(new ims.framework.utils.DateTime(EndDateTime) );
		}
		// IsCronTrigger
		valueObject.setIsCronTrigger( domainObject.isIsCronTrigger() );
		// CronExpression
		valueObject.setCronExpression(domainObject.getCronExpression());
		// LastRun
		java.util.Date LastRun = domainObject.getLastRun();
		if ( null != LastRun ) 
		{
			valueObject.setLastRun(new ims.framework.utils.DateTime(LastRun) );
		}
		// NextRun
		java.util.Date NextRun = domainObject.getNextRun();
		if ( null != NextRun ) 
		{
			valueObject.setNextRun(new ims.framework.utils.DateTime(NextRun) );
		}
		// CronExpressionDisplay
		valueObject.setCronExpressionDisplay(domainObject.getCronExpressionDisplay());
		// SystemInformation
		// set system information
		valueObject.setSystemInformation(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// IsActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// Description
		valueObject.setDescription(domainObject.getDescription());
		// ScheduledJob
		valueObject.setScheduledJob(ims.admin.vo.domain.SystemJobVoAssembler.create(map, domainObject.getScheduledJob()) );
		// Frequency
		ims.domain.lookups.LookupInstance instance12 = domainObject.getFrequency();
		if ( null != instance12 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance12.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance12.getImage().getImageId(), instance12.getImage().getImagePath());
			}
			color = instance12.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.JobRunningFrequency voLookup12 = new ims.core.vo.lookups.JobRunningFrequency(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.core.vo.lookups.JobRunningFrequency parentVoLookup12 = voLookup12;
			ims.domain.lookups.LookupInstance parent12 = instance12.getParent();
			while (parent12 != null)
			{
				if (parent12.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent12.getImage().getImageId(), parent12.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent12.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup12.setParent(new ims.core.vo.lookups.JobRunningFrequency(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setFrequency(voLookup12);
		}
				// NotificationsOnSuccess
		valueObject.setNotificationsOnSuccess(ims.core.vo.domain.ConfiguredJobNotificationVoAssembler.createConfiguredJobNotificationVoCollectionFromConfiguredJobNotification(map, domainObject.getNotificationsOnSuccess()) );
		// NotificationsOnFailure
		valueObject.setNotificationsOnFailure(ims.core.vo.domain.ConfiguredJobNotificationVoAssembler.createConfiguredJobNotificationVoCollectionFromConfiguredJobNotification(map, domainObject.getNotificationsOnFailure()) );
		// Name
		valueObject.setName(domainObject.getName());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.configuration.domain.objects.ConfiguredJob extractConfiguredJob(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ConfiguredJobVo valueObject) 
	{
		return 	extractConfiguredJob(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.configuration.domain.objects.ConfiguredJob extractConfiguredJob(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ConfiguredJobVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ConfiguredJob();
		ims.core.configuration.domain.objects.ConfiguredJob domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.configuration.domain.objects.ConfiguredJob)domMap.get(valueObject);
			}
			// ims.admin.vo.ConfiguredJobVo ID_ConfiguredJob field is unknown
			domainObject = new ims.core.configuration.domain.objects.ConfiguredJob();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ConfiguredJob());
			if (domMap.get(key) != null)
			{
				return (ims.core.configuration.domain.objects.ConfiguredJob)domMap.get(key);
			}
			domainObject = (ims.core.configuration.domain.objects.ConfiguredJob) domainFactory.getDomainObject(ims.core.configuration.domain.objects.ConfiguredJob.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ConfiguredJob());

		ims.framework.utils.DateTime dateTime1 = valueObject.getStartDateTime();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setStartDateTime(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getEndDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setEndDateTime(value2);
		domainObject.setIsCronTrigger(valueObject.getIsCronTrigger());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCronExpression() != null && valueObject.getCronExpression().equals(""))
		{
			valueObject.setCronExpression(null);
		}
		domainObject.setCronExpression(valueObject.getCronExpression());
		ims.framework.utils.DateTime dateTime5 = valueObject.getLastRun();
		java.util.Date value5 = null;
		if ( dateTime5 != null ) 
		{
			value5 = dateTime5.getJavaDate();
		}
		domainObject.setLastRun(value5);
		ims.framework.utils.DateTime dateTime6 = valueObject.getNextRun();
		java.util.Date value6 = null;
		if ( dateTime6 != null ) 
		{
			value6 = dateTime6.getJavaDate();
		}
		domainObject.setNextRun(value6);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCronExpressionDisplay() != null && valueObject.getCronExpressionDisplay().equals(""))
		{
			valueObject.setCronExpressionDisplay(null);
		}
		domainObject.setCronExpressionDisplay(valueObject.getCronExpressionDisplay());
		domainObject.setIsActive(valueObject.getIsActive());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDescription() != null && valueObject.getDescription().equals(""))
		{
			valueObject.setDescription(null);
		}
		domainObject.setDescription(valueObject.getDescription());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.configuration.domain.objects.SystemJob value11 = null;
		if ( null != valueObject.getScheduledJob() ) 
		{
			if (valueObject.getScheduledJob().getBoId() == null)
			{
				if (domMap.get(valueObject.getScheduledJob()) != null)
				{
					value11 = (ims.core.configuration.domain.objects.SystemJob)domMap.get(valueObject.getScheduledJob());
				}
			}
			else
			{
				value11 = (ims.core.configuration.domain.objects.SystemJob)domainFactory.getDomainObject(ims.core.configuration.domain.objects.SystemJob.class, valueObject.getScheduledJob().getBoId());
			}
		}
		domainObject.setScheduledJob(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getFrequency() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getFrequency().getID());
		}
		domainObject.setFrequency(value12);
		domainObject.setNotificationsOnSuccess(ims.core.vo.domain.ConfiguredJobNotificationVoAssembler.extractConfiguredJobNotificationList(domainFactory, valueObject.getNotificationsOnSuccess(), domainObject.getNotificationsOnSuccess(), domMap));		
		domainObject.setNotificationsOnFailure(ims.core.vo.domain.ConfiguredJobNotificationVoAssembler.extractConfiguredJobNotificationList(domainFactory, valueObject.getNotificationsOnFailure(), domainObject.getNotificationsOnFailure(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());

		return domainObject;
	}

}
