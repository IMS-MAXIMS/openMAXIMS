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
package ims.pci.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author George Cristian Josan
 */
public class ScheduleConfigurationLiteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.pci.vo.ScheduleConfigurationLiteVo copy(ims.pci.vo.ScheduleConfigurationLiteVo valueObjectDest, ims.pci.vo.ScheduleConfigurationLiteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ScheduleConfiguration(valueObjectSrc.getID_ScheduleConfiguration());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ScheduleName
		valueObjectDest.setScheduleName(valueObjectSrc.getScheduleName());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// StartDob
		valueObjectDest.setStartDob(valueObjectSrc.getStartDob());
		// EndDob
		valueObjectDest.setEndDob(valueObjectSrc.getEndDob());
		// isDefaultSchedule
		valueObjectDest.setIsDefaultSchedule(valueObjectSrc.getIsDefaultSchedule());
		// ScheduleType
		valueObjectDest.setScheduleType(valueObjectSrc.getScheduleType());
		// CampaignStartDate
		valueObjectDest.setCampaignStartDate(valueObjectSrc.getCampaignStartDate());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createScheduleConfigurationLiteVoCollectionFromScheduleConfiguration(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.pci.domain.objects.ScheduleConfiguration objects.
	 */
	public static ims.pci.vo.ScheduleConfigurationLiteVoCollection createScheduleConfigurationLiteVoCollectionFromScheduleConfiguration(java.util.Set domainObjectSet)	
	{
		return createScheduleConfigurationLiteVoCollectionFromScheduleConfiguration(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.pci.domain.objects.ScheduleConfiguration objects.
	 */
	public static ims.pci.vo.ScheduleConfigurationLiteVoCollection createScheduleConfigurationLiteVoCollectionFromScheduleConfiguration(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.pci.vo.ScheduleConfigurationLiteVoCollection voList = new ims.pci.vo.ScheduleConfigurationLiteVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.pci.domain.objects.ScheduleConfiguration domainObject = (ims.pci.domain.objects.ScheduleConfiguration) iterator.next();
			ims.pci.vo.ScheduleConfigurationLiteVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.pci.domain.objects.ScheduleConfiguration objects.
	 */
	public static ims.pci.vo.ScheduleConfigurationLiteVoCollection createScheduleConfigurationLiteVoCollectionFromScheduleConfiguration(java.util.List domainObjectList) 
	{
		return createScheduleConfigurationLiteVoCollectionFromScheduleConfiguration(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.pci.domain.objects.ScheduleConfiguration objects.
	 */
	public static ims.pci.vo.ScheduleConfigurationLiteVoCollection createScheduleConfigurationLiteVoCollectionFromScheduleConfiguration(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.pci.vo.ScheduleConfigurationLiteVoCollection voList = new ims.pci.vo.ScheduleConfigurationLiteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.pci.domain.objects.ScheduleConfiguration domainObject = (ims.pci.domain.objects.ScheduleConfiguration) domainObjectList.get(i);
			ims.pci.vo.ScheduleConfigurationLiteVo vo = create(map, domainObject);

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
	 * Create the ims.pci.domain.objects.ScheduleConfiguration set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractScheduleConfigurationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ScheduleConfigurationLiteVoCollection voCollection) 
	 {
	 	return extractScheduleConfigurationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractScheduleConfigurationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ScheduleConfigurationLiteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.pci.vo.ScheduleConfigurationLiteVo vo = voCollection.get(i);
			ims.pci.domain.objects.ScheduleConfiguration domainObject = ScheduleConfigurationLiteVoAssembler.extractScheduleConfiguration(domainFactory, vo, domMap);

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
	 * Create the ims.pci.domain.objects.ScheduleConfiguration list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractScheduleConfigurationList(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ScheduleConfigurationLiteVoCollection voCollection) 
	 {
	 	return extractScheduleConfigurationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractScheduleConfigurationList(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ScheduleConfigurationLiteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.pci.vo.ScheduleConfigurationLiteVo vo = voCollection.get(i);
			ims.pci.domain.objects.ScheduleConfiguration domainObject = ScheduleConfigurationLiteVoAssembler.extractScheduleConfiguration(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.pci.domain.objects.ScheduleConfiguration object.
	 * @param domainObject ims.pci.domain.objects.ScheduleConfiguration
	 */
	 public static ims.pci.vo.ScheduleConfigurationLiteVo create(ims.pci.domain.objects.ScheduleConfiguration domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.pci.domain.objects.ScheduleConfiguration object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.pci.vo.ScheduleConfigurationLiteVo create(DomainObjectMap map, ims.pci.domain.objects.ScheduleConfiguration domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.pci.vo.ScheduleConfigurationLiteVo valueObject = (ims.pci.vo.ScheduleConfigurationLiteVo) map.getValueObject(domainObject, ims.pci.vo.ScheduleConfigurationLiteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.pci.vo.ScheduleConfigurationLiteVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.pci.domain.objects.ScheduleConfiguration
	 */
	 public static ims.pci.vo.ScheduleConfigurationLiteVo insert(ims.pci.vo.ScheduleConfigurationLiteVo valueObject, ims.pci.domain.objects.ScheduleConfiguration domainObject) 
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
	 * @param domainObject ims.pci.domain.objects.ScheduleConfiguration
	 */
	 public static ims.pci.vo.ScheduleConfigurationLiteVo insert(DomainObjectMap map, ims.pci.vo.ScheduleConfigurationLiteVo valueObject, ims.pci.domain.objects.ScheduleConfiguration domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ScheduleConfiguration(domainObject.getId());
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
			
		// ScheduleName
		valueObject.setScheduleName(domainObject.getScheduleName());
		// Status
		ims.domain.lookups.LookupInstance instance2 = domainObject.getStatus();
		if ( null != instance2 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance2.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance2.getImage().getImageId(), instance2.getImage().getImagePath());
			}
			color = instance2.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup2 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup2 = voLookup2;
			ims.domain.lookups.LookupInstance parent2 = instance2.getParent();
			while (parent2 != null)
			{
				if (parent2.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent2.getImage().getImageId(), parent2.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent2.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup2.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setStatus(voLookup2);
		}
				// StartDob
		java.util.Date StartDob = domainObject.getStartDob();
		if ( null != StartDob ) 
		{
			valueObject.setStartDob(new ims.framework.utils.Date(StartDob) );
		}
		// EndDob
		java.util.Date EndDob = domainObject.getEndDob();
		if ( null != EndDob ) 
		{
			valueObject.setEndDob(new ims.framework.utils.Date(EndDob) );
		}
		// isDefaultSchedule
		valueObject.setIsDefaultSchedule( domainObject.isIsDefaultSchedule() );
		// ScheduleType
		ims.domain.lookups.LookupInstance instance6 = domainObject.getScheduleType();
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

			ims.pci.vo.lookups.ScheduleType voLookup6 = new ims.pci.vo.lookups.ScheduleType(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.pci.vo.lookups.ScheduleType parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.pci.vo.lookups.ScheduleType(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setScheduleType(voLookup6);
		}
				// CampaignStartDate
		java.util.Date CampaignStartDate = domainObject.getCampaignStartDate();
		if ( null != CampaignStartDate ) 
		{
			valueObject.setCampaignStartDate(new ims.framework.utils.Date(CampaignStartDate) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.pci.domain.objects.ScheduleConfiguration extractScheduleConfiguration(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ScheduleConfigurationLiteVo valueObject) 
	{
		return 	extractScheduleConfiguration(domainFactory, valueObject, new HashMap());
	}

	public static ims.pci.domain.objects.ScheduleConfiguration extractScheduleConfiguration(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ScheduleConfigurationLiteVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ScheduleConfiguration();
		ims.pci.domain.objects.ScheduleConfiguration domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.pci.domain.objects.ScheduleConfiguration)domMap.get(valueObject);
			}
			// ims.pci.vo.ScheduleConfigurationLiteVo ID_ScheduleConfiguration field is unknown
			domainObject = new ims.pci.domain.objects.ScheduleConfiguration();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ScheduleConfiguration());
			if (domMap.get(key) != null)
			{
				return (ims.pci.domain.objects.ScheduleConfiguration)domMap.get(key);
			}
			domainObject = (ims.pci.domain.objects.ScheduleConfiguration) domainFactory.getDomainObject(ims.pci.domain.objects.ScheduleConfiguration.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ScheduleConfiguration());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getScheduleName() != null && valueObject.getScheduleName().equals(""))
		{
			valueObject.setScheduleName(null);
		}
		domainObject.setScheduleName(valueObject.getScheduleName());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value2);
		java.util.Date value3 = null;
		ims.framework.utils.Date date3 = valueObject.getStartDob();		
		if ( date3 != null ) 
		{
			value3 = date3.getDate();
		}
		domainObject.setStartDob(value3);
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getEndDob();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setEndDob(value4);
		domainObject.setIsDefaultSchedule(valueObject.getIsDefaultSchedule());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getScheduleType() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getScheduleType().getID());
		}
		domainObject.setScheduleType(value6);
		java.util.Date value7 = null;
		ims.framework.utils.Date date7 = valueObject.getCampaignStartDate();		
		if ( date7 != null ) 
		{
			value7 = date7.getDate();
		}
		domainObject.setCampaignStartDate(value7);

		return domainObject;
	}

}
