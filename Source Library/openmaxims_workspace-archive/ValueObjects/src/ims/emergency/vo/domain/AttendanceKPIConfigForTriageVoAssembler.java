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
public class AttendanceKPIConfigForTriageVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.AttendanceKPIConfigForTriageVo copy(ims.emergency.vo.AttendanceKPIConfigForTriageVo valueObjectDest, ims.emergency.vo.AttendanceKPIConfigForTriageVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_AttendanceKPIConfig(valueObjectSrc.getID_AttendanceKPIConfig());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AwaitingTriageBreachWarningKPI
		valueObjectDest.setAwaitingTriageBreachWarningKPI(valueObjectSrc.getAwaitingTriageBreachWarningKPI());
		// AwaitingTriageBreachedKPI
		valueObjectDest.setAwaitingTriageBreachedKPI(valueObjectSrc.getAwaitingTriageBreachedKPI());
		// EDLocation
		valueObjectDest.setEDLocation(valueObjectSrc.getEDLocation());
		// TriagePriorityKPIs
		valueObjectDest.setTriagePriorityKPIs(valueObjectSrc.getTriagePriorityKPIs());
		// AwaitingTriageBreachWarningKPIFlashingText
		valueObjectDest.setAwaitingTriageBreachWarningKPIFlashingText(valueObjectSrc.getAwaitingTriageBreachWarningKPIFlashingText());
		// AwaitingTriageBreachWarningKPIFlashingTextColour
		valueObjectDest.setAwaitingTriageBreachWarningKPIFlashingTextColour(valueObjectSrc.getAwaitingTriageBreachWarningKPIFlashingTextColour());
		// AwaitingTriageBreachWarningKPIBackgroundColour
		valueObjectDest.setAwaitingTriageBreachWarningKPIBackgroundColour(valueObjectSrc.getAwaitingTriageBreachWarningKPIBackgroundColour());
		// AwaitingTriageBreachKPIFlashingText
		valueObjectDest.setAwaitingTriageBreachKPIFlashingText(valueObjectSrc.getAwaitingTriageBreachKPIFlashingText());
		// AwaitingTriageBreachKPIFlashingTextColour
		valueObjectDest.setAwaitingTriageBreachKPIFlashingTextColour(valueObjectSrc.getAwaitingTriageBreachKPIFlashingTextColour());
		// AwaitingTriageBreachKPIBackgroundColour
		valueObjectDest.setAwaitingTriageBreachKPIBackgroundColour(valueObjectSrc.getAwaitingTriageBreachKPIBackgroundColour());
		// AwaitingTriageBreachWarningKPITextColour
		valueObjectDest.setAwaitingTriageBreachWarningKPITextColour(valueObjectSrc.getAwaitingTriageBreachWarningKPITextColour());
		// AwaitingTriageBreachKPITextColour
		valueObjectDest.setAwaitingTriageBreachKPITextColour(valueObjectSrc.getAwaitingTriageBreachKPITextColour());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createAttendanceKPIConfigForTriageVoCollectionFromAttendanceKPIConfig(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.emergency.configuration.domain.objects.AttendanceKPIConfig objects.
	 */
	public static ims.emergency.vo.AttendanceKPIConfigForTriageVoCollection createAttendanceKPIConfigForTriageVoCollectionFromAttendanceKPIConfig(java.util.Set domainObjectSet)	
	{
		return createAttendanceKPIConfigForTriageVoCollectionFromAttendanceKPIConfig(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.emergency.configuration.domain.objects.AttendanceKPIConfig objects.
	 */
	public static ims.emergency.vo.AttendanceKPIConfigForTriageVoCollection createAttendanceKPIConfigForTriageVoCollectionFromAttendanceKPIConfig(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.AttendanceKPIConfigForTriageVoCollection voList = new ims.emergency.vo.AttendanceKPIConfigForTriageVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.emergency.configuration.domain.objects.AttendanceKPIConfig domainObject = (ims.emergency.configuration.domain.objects.AttendanceKPIConfig) iterator.next();
			ims.emergency.vo.AttendanceKPIConfigForTriageVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.emergency.configuration.domain.objects.AttendanceKPIConfig objects.
	 */
	public static ims.emergency.vo.AttendanceKPIConfigForTriageVoCollection createAttendanceKPIConfigForTriageVoCollectionFromAttendanceKPIConfig(java.util.List domainObjectList) 
	{
		return createAttendanceKPIConfigForTriageVoCollectionFromAttendanceKPIConfig(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.emergency.configuration.domain.objects.AttendanceKPIConfig objects.
	 */
	public static ims.emergency.vo.AttendanceKPIConfigForTriageVoCollection createAttendanceKPIConfigForTriageVoCollectionFromAttendanceKPIConfig(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.AttendanceKPIConfigForTriageVoCollection voList = new ims.emergency.vo.AttendanceKPIConfigForTriageVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.emergency.configuration.domain.objects.AttendanceKPIConfig domainObject = (ims.emergency.configuration.domain.objects.AttendanceKPIConfig) domainObjectList.get(i);
			ims.emergency.vo.AttendanceKPIConfigForTriageVo vo = create(map, domainObject);

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
	 * Create the ims.emergency.configuration.domain.objects.AttendanceKPIConfig set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractAttendanceKPIConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AttendanceKPIConfigForTriageVoCollection voCollection) 
	 {
	 	return extractAttendanceKPIConfigSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractAttendanceKPIConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AttendanceKPIConfigForTriageVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.AttendanceKPIConfigForTriageVo vo = voCollection.get(i);
			ims.emergency.configuration.domain.objects.AttendanceKPIConfig domainObject = AttendanceKPIConfigForTriageVoAssembler.extractAttendanceKPIConfig(domainFactory, vo, domMap);

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
	 * Create the ims.emergency.configuration.domain.objects.AttendanceKPIConfig list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractAttendanceKPIConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AttendanceKPIConfigForTriageVoCollection voCollection) 
	 {
	 	return extractAttendanceKPIConfigList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractAttendanceKPIConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AttendanceKPIConfigForTriageVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.AttendanceKPIConfigForTriageVo vo = voCollection.get(i);
			ims.emergency.configuration.domain.objects.AttendanceKPIConfig domainObject = AttendanceKPIConfigForTriageVoAssembler.extractAttendanceKPIConfig(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.emergency.configuration.domain.objects.AttendanceKPIConfig object.
	 * @param domainObject ims.emergency.configuration.domain.objects.AttendanceKPIConfig
	 */
	 public static ims.emergency.vo.AttendanceKPIConfigForTriageVo create(ims.emergency.configuration.domain.objects.AttendanceKPIConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.emergency.configuration.domain.objects.AttendanceKPIConfig object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.emergency.vo.AttendanceKPIConfigForTriageVo create(DomainObjectMap map, ims.emergency.configuration.domain.objects.AttendanceKPIConfig domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.AttendanceKPIConfigForTriageVo valueObject = (ims.emergency.vo.AttendanceKPIConfigForTriageVo) map.getValueObject(domainObject, ims.emergency.vo.AttendanceKPIConfigForTriageVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.AttendanceKPIConfigForTriageVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.emergency.configuration.domain.objects.AttendanceKPIConfig
	 */
	 public static ims.emergency.vo.AttendanceKPIConfigForTriageVo insert(ims.emergency.vo.AttendanceKPIConfigForTriageVo valueObject, ims.emergency.configuration.domain.objects.AttendanceKPIConfig domainObject) 
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
	 * @param domainObject ims.emergency.configuration.domain.objects.AttendanceKPIConfig
	 */
	 public static ims.emergency.vo.AttendanceKPIConfigForTriageVo insert(DomainObjectMap map, ims.emergency.vo.AttendanceKPIConfigForTriageVo valueObject, ims.emergency.configuration.domain.objects.AttendanceKPIConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_AttendanceKPIConfig(domainObject.getId());
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
			
		// AwaitingTriageBreachWarningKPI
		valueObject.setAwaitingTriageBreachWarningKPI(domainObject.getAwaitingTriageBreachWarningKPI());
		// AwaitingTriageBreachedKPI
		valueObject.setAwaitingTriageBreachedKPI(domainObject.getAwaitingTriageBreachedKPI());
		// EDLocation
		if (domainObject.getEDLocation() != null)
		{
			if(domainObject.getEDLocation() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getEDLocation();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setEDLocation(new ims.core.resource.place.vo.LocationRefVo(id, -1));				
			}
			else
			{
				valueObject.setEDLocation(new ims.core.resource.place.vo.LocationRefVo(domainObject.getEDLocation().getId(), domainObject.getEDLocation().getVersion()));
			}
		}
		// TriagePriorityKPIs
		valueObject.setTriagePriorityKPIs(ims.emergency.vo.domain.TriagePriorityKpConfigVoAssembler.createTriagePriorityKpConfigVoCollectionFromTriagePriorityKPConfig(map, domainObject.getTriagePriorityKPIs()) );
		// AwaitingTriageBreachWarningKPIFlashingText
		ims.domain.lookups.LookupInstance instance5 = domainObject.getAwaitingTriageBreachWarningKPIFlashingText();
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

			ims.core.vo.lookups.YesNo voLookup5 = new ims.core.vo.lookups.YesNo(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.YesNo(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setAwaitingTriageBreachWarningKPIFlashingText(voLookup5);
		}
				// AwaitingTriageBreachWarningKPIFlashingTextColour
		valueObject.setAwaitingTriageBreachWarningKPIFlashingTextColour(domainObject.getAwaitingTriageBreachWarningKPIFlashingTextColour());
		// AwaitingTriageBreachWarningKPIBackgroundColour
		valueObject.setAwaitingTriageBreachWarningKPIBackgroundColour(domainObject.getAwaitingTriageBreachWarningKPIBackgroundColour());
		// AwaitingTriageBreachKPIFlashingText
		ims.domain.lookups.LookupInstance instance8 = domainObject.getAwaitingTriageBreachKPIFlashingText();
		if ( null != instance8 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance8.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance8.getImage().getImageId(), instance8.getImage().getImagePath());
			}
			color = instance8.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup8 = new ims.core.vo.lookups.YesNo(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup8 = voLookup8;
			ims.domain.lookups.LookupInstance parent8 = instance8.getParent();
			while (parent8 != null)
			{
				if (parent8.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent8.getImage().getImageId(), parent8.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent8.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup8.setParent(new ims.core.vo.lookups.YesNo(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setAwaitingTriageBreachKPIFlashingText(voLookup8);
		}
				// AwaitingTriageBreachKPIFlashingTextColour
		valueObject.setAwaitingTriageBreachKPIFlashingTextColour(domainObject.getAwaitingTriageBreachKPIFlashingTextColour());
		// AwaitingTriageBreachKPIBackgroundColour
		valueObject.setAwaitingTriageBreachKPIBackgroundColour(domainObject.getAwaitingTriageBreachKPIBackgroundColour());
		// AwaitingTriageBreachWarningKPITextColour
		valueObject.setAwaitingTriageBreachWarningKPITextColour(domainObject.getAwaitingTriageBreachWarningKPITextColour());
		// AwaitingTriageBreachKPITextColour
		valueObject.setAwaitingTriageBreachKPITextColour(domainObject.getAwaitingTriageBreachKPITextColour());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.emergency.configuration.domain.objects.AttendanceKPIConfig extractAttendanceKPIConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AttendanceKPIConfigForTriageVo valueObject) 
	{
		return 	extractAttendanceKPIConfig(domainFactory, valueObject, new HashMap());
	}

	public static ims.emergency.configuration.domain.objects.AttendanceKPIConfig extractAttendanceKPIConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AttendanceKPIConfigForTriageVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_AttendanceKPIConfig();
		ims.emergency.configuration.domain.objects.AttendanceKPIConfig domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.emergency.configuration.domain.objects.AttendanceKPIConfig)domMap.get(valueObject);
			}
			// ims.emergency.vo.AttendanceKPIConfigForTriageVo ID_AttendanceKPIConfig field is unknown
			domainObject = new ims.emergency.configuration.domain.objects.AttendanceKPIConfig();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_AttendanceKPIConfig());
			if (domMap.get(key) != null)
			{
				return (ims.emergency.configuration.domain.objects.AttendanceKPIConfig)domMap.get(key);
			}
			domainObject = (ims.emergency.configuration.domain.objects.AttendanceKPIConfig) domainFactory.getDomainObject(ims.emergency.configuration.domain.objects.AttendanceKPIConfig.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_AttendanceKPIConfig());

		domainObject.setAwaitingTriageBreachWarningKPI(valueObject.getAwaitingTriageBreachWarningKPI());
		domainObject.setAwaitingTriageBreachedKPI(valueObject.getAwaitingTriageBreachedKPI());
		ims.core.resource.place.domain.objects.Location value3 = null;
		if ( null != valueObject.getEDLocation() ) 
		{
			if (valueObject.getEDLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getEDLocation()) != null)
				{
					value3 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getEDLocation());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getEDLocation();	
			}
			else
			{
				value3 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getEDLocation().getBoId());
			}
		}
		domainObject.setEDLocation(value3);

		// SaveAsRefVO treated as RefValueObject
		ims.emergency.configuration.vo.TriagePriorityKPConfigRefVoCollection refCollection4 = new ims.emergency.configuration.vo.TriagePriorityKPConfigRefVoCollection();
		if (valueObject.getTriagePriorityKPIs() != null)
		{
			for (int i4=0; i4<valueObject.getTriagePriorityKPIs().size(); i4++)
			{
				ims.emergency.configuration.vo.TriagePriorityKPConfigRefVo ref4 = (ims.emergency.configuration.vo.TriagePriorityKPConfigRefVo)valueObject.getTriagePriorityKPIs().get(i4);
				refCollection4.add(ref4);
			}
		}
		int size4 = (null == refCollection4) ? 0 : refCollection4.size();		
		java.util.List domainTriagePriorityKPIs4 = domainObject.getTriagePriorityKPIs();
		if (domainTriagePriorityKPIs4 == null)
		{
			domainTriagePriorityKPIs4 = new java.util.ArrayList();
		}
		for(int i=0; i < size4; i++) 
		{
			ims.emergency.configuration.vo.TriagePriorityKPConfigRefVo vo = refCollection4.get(i);			
			ims.emergency.configuration.domain.objects.TriagePriorityKPConfig dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.emergency.configuration.domain.objects.TriagePriorityKPConfig)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.emergency.configuration.domain.objects.TriagePriorityKPConfig)domainFactory.getDomainObject( ims.emergency.configuration.domain.objects.TriagePriorityKPConfig.class, vo.getBoId());
				}
			}

			int domIdx = domainTriagePriorityKPIs4.indexOf(dom);
			if (domIdx == -1)
			{
				domainTriagePriorityKPIs4.add(i, dom);
			}
			else if (i != domIdx && i < domainTriagePriorityKPIs4.size())
			{
				Object tmp = domainTriagePriorityKPIs4.get(i);
				domainTriagePriorityKPIs4.set(i, domainTriagePriorityKPIs4.get(domIdx));
				domainTriagePriorityKPIs4.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i4 = domainTriagePriorityKPIs4.size();
		while (i4 > size4)
		{
			domainTriagePriorityKPIs4.remove(i4-1);
			i4 = domainTriagePriorityKPIs4.size();
		}
		
		domainObject.setTriagePriorityKPIs(domainTriagePriorityKPIs4);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getAwaitingTriageBreachWarningKPIFlashingText() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getAwaitingTriageBreachWarningKPIFlashingText().getID());
		}
		domainObject.setAwaitingTriageBreachWarningKPIFlashingText(value5);
		domainObject.setAwaitingTriageBreachWarningKPIFlashingTextColour(valueObject.getAwaitingTriageBreachWarningKPIFlashingTextColour());
		domainObject.setAwaitingTriageBreachWarningKPIBackgroundColour(valueObject.getAwaitingTriageBreachWarningKPIBackgroundColour());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getAwaitingTriageBreachKPIFlashingText() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getAwaitingTriageBreachKPIFlashingText().getID());
		}
		domainObject.setAwaitingTriageBreachKPIFlashingText(value8);
		domainObject.setAwaitingTriageBreachKPIFlashingTextColour(valueObject.getAwaitingTriageBreachKPIFlashingTextColour());
		domainObject.setAwaitingTriageBreachKPIBackgroundColour(valueObject.getAwaitingTriageBreachKPIBackgroundColour());
		domainObject.setAwaitingTriageBreachWarningKPITextColour(valueObject.getAwaitingTriageBreachWarningKPITextColour());
		domainObject.setAwaitingTriageBreachKPITextColour(valueObject.getAwaitingTriageBreachKPITextColour());

		return domainObject;
	}

}
