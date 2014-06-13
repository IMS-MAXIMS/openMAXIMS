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
 * @author Florin Blindu
 */
public class AttendanceReqContractSettingsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.AttendanceReqContractSettingsVo copy(ims.emergency.vo.AttendanceReqContractSettingsVo valueObjectDest, ims.emergency.vo.AttendanceReqContractSettingsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_AttendanceReqContractSettings(valueObjectSrc.getID_AttendanceReqContractSettings());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// FromDate
		valueObjectDest.setFromDate(valueObjectSrc.getFromDate());
		// ToDate
		valueObjectDest.setToDate(valueObjectSrc.getToDate());
		// ConfiguredJob
		valueObjectDest.setConfiguredJob(valueObjectSrc.getConfiguredJob());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createAttendanceReqContractSettingsVoCollectionFromAttendanceReqContractSettings(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.emergency.configuration.domain.objects.AttendanceReqContractSettings objects.
	 */
	public static ims.emergency.vo.AttendanceReqContractSettingsVoCollection createAttendanceReqContractSettingsVoCollectionFromAttendanceReqContractSettings(java.util.Set domainObjectSet)	
	{
		return createAttendanceReqContractSettingsVoCollectionFromAttendanceReqContractSettings(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.emergency.configuration.domain.objects.AttendanceReqContractSettings objects.
	 */
	public static ims.emergency.vo.AttendanceReqContractSettingsVoCollection createAttendanceReqContractSettingsVoCollectionFromAttendanceReqContractSettings(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.AttendanceReqContractSettingsVoCollection voList = new ims.emergency.vo.AttendanceReqContractSettingsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.emergency.configuration.domain.objects.AttendanceReqContractSettings domainObject = (ims.emergency.configuration.domain.objects.AttendanceReqContractSettings) iterator.next();
			ims.emergency.vo.AttendanceReqContractSettingsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.emergency.configuration.domain.objects.AttendanceReqContractSettings objects.
	 */
	public static ims.emergency.vo.AttendanceReqContractSettingsVoCollection createAttendanceReqContractSettingsVoCollectionFromAttendanceReqContractSettings(java.util.List domainObjectList) 
	{
		return createAttendanceReqContractSettingsVoCollectionFromAttendanceReqContractSettings(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.emergency.configuration.domain.objects.AttendanceReqContractSettings objects.
	 */
	public static ims.emergency.vo.AttendanceReqContractSettingsVoCollection createAttendanceReqContractSettingsVoCollectionFromAttendanceReqContractSettings(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.AttendanceReqContractSettingsVoCollection voList = new ims.emergency.vo.AttendanceReqContractSettingsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.emergency.configuration.domain.objects.AttendanceReqContractSettings domainObject = (ims.emergency.configuration.domain.objects.AttendanceReqContractSettings) domainObjectList.get(i);
			ims.emergency.vo.AttendanceReqContractSettingsVo vo = create(map, domainObject);

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
	 * Create the ims.emergency.configuration.domain.objects.AttendanceReqContractSettings set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractAttendanceReqContractSettingsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AttendanceReqContractSettingsVoCollection voCollection) 
	 {
	 	return extractAttendanceReqContractSettingsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractAttendanceReqContractSettingsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AttendanceReqContractSettingsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.AttendanceReqContractSettingsVo vo = voCollection.get(i);
			ims.emergency.configuration.domain.objects.AttendanceReqContractSettings domainObject = AttendanceReqContractSettingsVoAssembler.extractAttendanceReqContractSettings(domainFactory, vo, domMap);

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
	 * Create the ims.emergency.configuration.domain.objects.AttendanceReqContractSettings list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractAttendanceReqContractSettingsList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AttendanceReqContractSettingsVoCollection voCollection) 
	 {
	 	return extractAttendanceReqContractSettingsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractAttendanceReqContractSettingsList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AttendanceReqContractSettingsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.AttendanceReqContractSettingsVo vo = voCollection.get(i);
			ims.emergency.configuration.domain.objects.AttendanceReqContractSettings domainObject = AttendanceReqContractSettingsVoAssembler.extractAttendanceReqContractSettings(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.emergency.configuration.domain.objects.AttendanceReqContractSettings object.
	 * @param domainObject ims.emergency.configuration.domain.objects.AttendanceReqContractSettings
	 */
	 public static ims.emergency.vo.AttendanceReqContractSettingsVo create(ims.emergency.configuration.domain.objects.AttendanceReqContractSettings domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.emergency.configuration.domain.objects.AttendanceReqContractSettings object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.emergency.vo.AttendanceReqContractSettingsVo create(DomainObjectMap map, ims.emergency.configuration.domain.objects.AttendanceReqContractSettings domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.AttendanceReqContractSettingsVo valueObject = (ims.emergency.vo.AttendanceReqContractSettingsVo) map.getValueObject(domainObject, ims.emergency.vo.AttendanceReqContractSettingsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.AttendanceReqContractSettingsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.emergency.configuration.domain.objects.AttendanceReqContractSettings
	 */
	 public static ims.emergency.vo.AttendanceReqContractSettingsVo insert(ims.emergency.vo.AttendanceReqContractSettingsVo valueObject, ims.emergency.configuration.domain.objects.AttendanceReqContractSettings domainObject) 
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
	 * @param domainObject ims.emergency.configuration.domain.objects.AttendanceReqContractSettings
	 */
	 public static ims.emergency.vo.AttendanceReqContractSettingsVo insert(DomainObjectMap map, ims.emergency.vo.AttendanceReqContractSettingsVo valueObject, ims.emergency.configuration.domain.objects.AttendanceReqContractSettings domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_AttendanceReqContractSettings(domainObject.getId());
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
			
		// FromDate
		java.util.Date FromDate = domainObject.getFromDate();
		if ( null != FromDate ) 
		{
			valueObject.setFromDate(new ims.framework.utils.DateTime(FromDate) );
		}
		// ToDate
		java.util.Date ToDate = domainObject.getToDate();
		if ( null != ToDate ) 
		{
			valueObject.setToDate(new ims.framework.utils.DateTime(ToDate) );
		}
		// ConfiguredJob
		if (domainObject.getConfiguredJob() != null)
		{
			if(domainObject.getConfiguredJob() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getConfiguredJob();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setConfiguredJob(new ims.core.configuration.vo.ConfiguredJobRefVo(id, -1));				
			}
			else
			{
				valueObject.setConfiguredJob(new ims.core.configuration.vo.ConfiguredJobRefVo(domainObject.getConfiguredJob().getId(), domainObject.getConfiguredJob().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.emergency.configuration.domain.objects.AttendanceReqContractSettings extractAttendanceReqContractSettings(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AttendanceReqContractSettingsVo valueObject) 
	{
		return 	extractAttendanceReqContractSettings(domainFactory, valueObject, new HashMap());
	}

	public static ims.emergency.configuration.domain.objects.AttendanceReqContractSettings extractAttendanceReqContractSettings(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AttendanceReqContractSettingsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_AttendanceReqContractSettings();
		ims.emergency.configuration.domain.objects.AttendanceReqContractSettings domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.emergency.configuration.domain.objects.AttendanceReqContractSettings)domMap.get(valueObject);
			}
			// ims.emergency.vo.AttendanceReqContractSettingsVo ID_AttendanceReqContractSettings field is unknown
			domainObject = new ims.emergency.configuration.domain.objects.AttendanceReqContractSettings();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_AttendanceReqContractSettings());
			if (domMap.get(key) != null)
			{
				return (ims.emergency.configuration.domain.objects.AttendanceReqContractSettings)domMap.get(key);
			}
			domainObject = (ims.emergency.configuration.domain.objects.AttendanceReqContractSettings) domainFactory.getDomainObject(ims.emergency.configuration.domain.objects.AttendanceReqContractSettings.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_AttendanceReqContractSettings());

		ims.framework.utils.DateTime dateTime1 = valueObject.getFromDate();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setFromDate(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getToDate();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setToDate(value2);
		ims.core.configuration.domain.objects.ConfiguredJob value3 = null;
		if ( null != valueObject.getConfiguredJob() ) 
		{
			if (valueObject.getConfiguredJob().getBoId() == null)
			{
				if (domMap.get(valueObject.getConfiguredJob()) != null)
				{
					value3 = (ims.core.configuration.domain.objects.ConfiguredJob)domMap.get(valueObject.getConfiguredJob());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getConfiguredJob();	
			}
			else
			{
				value3 = (ims.core.configuration.domain.objects.ConfiguredJob)domainFactory.getDomainObject(ims.core.configuration.domain.objects.ConfiguredJob.class, valueObject.getConfiguredJob().getBoId());
			}
		}
		domainObject.setConfiguredJob(value3);

		return domainObject;
	}

}
