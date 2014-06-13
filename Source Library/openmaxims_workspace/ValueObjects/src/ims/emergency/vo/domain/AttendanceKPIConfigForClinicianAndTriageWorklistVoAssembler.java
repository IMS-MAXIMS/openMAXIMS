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
 * @author Cornel Ventuneac
 */
public class AttendanceKPIConfigForClinicianAndTriageWorklistVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.AttendanceKPIConfigForClinicianAndTriageWorklistVo copy(ims.emergency.vo.AttendanceKPIConfigForClinicianAndTriageWorklistVo valueObjectDest, ims.emergency.vo.AttendanceKPIConfigForClinicianAndTriageWorklistVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_AttendanceKPIConfig(valueObjectSrc.getID_AttendanceKPIConfig());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// EDLocation
		valueObjectDest.setEDLocation(valueObjectSrc.getEDLocation());
		// AwaitingTriageBreachWarningKPI
		valueObjectDest.setAwaitingTriageBreachWarningKPI(valueObjectSrc.getAwaitingTriageBreachWarningKPI());
		// AwaitingTriageBreachWarningKPITextColour
		valueObjectDest.setAwaitingTriageBreachWarningKPITextColour(valueObjectSrc.getAwaitingTriageBreachWarningKPITextColour());
		// AwaitingTriageBreachWarningKPIFlashingText
		valueObjectDest.setAwaitingTriageBreachWarningKPIFlashingText(valueObjectSrc.getAwaitingTriageBreachWarningKPIFlashingText());
		// AwaitingTriageBreachWarningKPIFlashingTextColour
		valueObjectDest.setAwaitingTriageBreachWarningKPIFlashingTextColour(valueObjectSrc.getAwaitingTriageBreachWarningKPIFlashingTextColour());
		// AwaitingTriageBreachWarningKPIBackgroundColour
		valueObjectDest.setAwaitingTriageBreachWarningKPIBackgroundColour(valueObjectSrc.getAwaitingTriageBreachWarningKPIBackgroundColour());
		// AwaitingTriageBreachedKPI
		valueObjectDest.setAwaitingTriageBreachedKPI(valueObjectSrc.getAwaitingTriageBreachedKPI());
		// AwaitingTriageBreachKPITextColour
		valueObjectDest.setAwaitingTriageBreachKPITextColour(valueObjectSrc.getAwaitingTriageBreachKPITextColour());
		// AwaitingTriageBreachKPIFlashingText
		valueObjectDest.setAwaitingTriageBreachKPIFlashingText(valueObjectSrc.getAwaitingTriageBreachKPIFlashingText());
		// AwaitingTriageBreachKPIFlashingTextColour
		valueObjectDest.setAwaitingTriageBreachKPIFlashingTextColour(valueObjectSrc.getAwaitingTriageBreachKPIFlashingTextColour());
		// AwaitingTriageBreachKPIBackgroundColour
		valueObjectDest.setAwaitingTriageBreachKPIBackgroundColour(valueObjectSrc.getAwaitingTriageBreachKPIBackgroundColour());
		// TriagePriorityKPIs
		valueObjectDest.setTriagePriorityKPIs(valueObjectSrc.getTriagePriorityKPIs());
		// AwaitingClinicianBreachWarningKPI
		valueObjectDest.setAwaitingClinicianBreachWarningKPI(valueObjectSrc.getAwaitingClinicianBreachWarningKPI());
		// AwaitingClinicianBreachWarningKPITextColour
		valueObjectDest.setAwaitingClinicianBreachWarningKPITextColour(valueObjectSrc.getAwaitingClinicianBreachWarningKPITextColour());
		// AwaitingClinicianBreachWarningKPIFlashingText
		valueObjectDest.setAwaitingClinicianBreachWarningKPIFlashingText(valueObjectSrc.getAwaitingClinicianBreachWarningKPIFlashingText());
		// AwaitingClinicianBreachWarningKPIFlashingTextColour
		valueObjectDest.setAwaitingClinicianBreachWarningKPIFlashingTextColour(valueObjectSrc.getAwaitingClinicianBreachWarningKPIFlashingTextColour());
		// AwaitingClinicianBreachWarningKPIBackgroundColour
		valueObjectDest.setAwaitingClinicianBreachWarningKPIBackgroundColour(valueObjectSrc.getAwaitingClinicianBreachWarningKPIBackgroundColour());
		// AwaitingClinicianBreachedKPI
		valueObjectDest.setAwaitingClinicianBreachedKPI(valueObjectSrc.getAwaitingClinicianBreachedKPI());
		// AwaitingClinicianBreachKPITextColour
		valueObjectDest.setAwaitingClinicianBreachKPITextColour(valueObjectSrc.getAwaitingClinicianBreachKPITextColour());
		// AwaitingClinicianBreachKPIFlashingText
		valueObjectDest.setAwaitingClinicianBreachKPIFlashingText(valueObjectSrc.getAwaitingClinicianBreachKPIFlashingText());
		// AwaitingClinicianBreachKPIFlashingTextColour
		valueObjectDest.setAwaitingClinicianBreachKPIFlashingTextColour(valueObjectSrc.getAwaitingClinicianBreachKPIFlashingTextColour());
		// AwaitingClinicianBreachKPIBackgroundColour
		valueObjectDest.setAwaitingClinicianBreachKPIBackgroundColour(valueObjectSrc.getAwaitingClinicianBreachKPIBackgroundColour());
		// LosBreachWarningKPI
		valueObjectDest.setLosBreachWarningKPI(valueObjectSrc.getLosBreachWarningKPI());
		// LosBreachWarningKPITextColour
		valueObjectDest.setLosBreachWarningKPITextColour(valueObjectSrc.getLosBreachWarningKPITextColour());
		// LosBreachWarningKPIFlashingText
		valueObjectDest.setLosBreachWarningKPIFlashingText(valueObjectSrc.getLosBreachWarningKPIFlashingText());
		// LosBreachWarningKPIFlashingTextColour
		valueObjectDest.setLosBreachWarningKPIFlashingTextColour(valueObjectSrc.getLosBreachWarningKPIFlashingTextColour());
		// LosBreachWarningKPIBackgroundColour
		valueObjectDest.setLosBreachWarningKPIBackgroundColour(valueObjectSrc.getLosBreachWarningKPIBackgroundColour());
		// LosBreachedKPI
		valueObjectDest.setLosBreachedKPI(valueObjectSrc.getLosBreachedKPI());
		// LosBreachKPITextColour
		valueObjectDest.setLosBreachKPITextColour(valueObjectSrc.getLosBreachKPITextColour());
		// LosBreachedKPIFlashingText
		valueObjectDest.setLosBreachedKPIFlashingText(valueObjectSrc.getLosBreachedKPIFlashingText());
		// LosBreachedKPIFlashingTextColour
		valueObjectDest.setLosBreachedKPIFlashingTextColour(valueObjectSrc.getLosBreachedKPIFlashingTextColour());
		// LosBreachedKPIBackgroundColour
		valueObjectDest.setLosBreachedKPIBackgroundColour(valueObjectSrc.getLosBreachedKPIBackgroundColour());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createAttendanceKPIConfigForClinicianAndTriageWorklistVoCollectionFromAttendanceKPIConfig(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.emergency.configuration.domain.objects.AttendanceKPIConfig objects.
	 */
	public static ims.emergency.vo.AttendanceKPIConfigForClinicianAndTriageWorklistVoCollection createAttendanceKPIConfigForClinicianAndTriageWorklistVoCollectionFromAttendanceKPIConfig(java.util.Set domainObjectSet)	
	{
		return createAttendanceKPIConfigForClinicianAndTriageWorklistVoCollectionFromAttendanceKPIConfig(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.emergency.configuration.domain.objects.AttendanceKPIConfig objects.
	 */
	public static ims.emergency.vo.AttendanceKPIConfigForClinicianAndTriageWorklistVoCollection createAttendanceKPIConfigForClinicianAndTriageWorklistVoCollectionFromAttendanceKPIConfig(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.AttendanceKPIConfigForClinicianAndTriageWorklistVoCollection voList = new ims.emergency.vo.AttendanceKPIConfigForClinicianAndTriageWorklistVoCollection();
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
			ims.emergency.vo.AttendanceKPIConfigForClinicianAndTriageWorklistVo vo = create(map, domainObject);
			
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
	public static ims.emergency.vo.AttendanceKPIConfigForClinicianAndTriageWorklistVoCollection createAttendanceKPIConfigForClinicianAndTriageWorklistVoCollectionFromAttendanceKPIConfig(java.util.List domainObjectList) 
	{
		return createAttendanceKPIConfigForClinicianAndTriageWorklistVoCollectionFromAttendanceKPIConfig(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.emergency.configuration.domain.objects.AttendanceKPIConfig objects.
	 */
	public static ims.emergency.vo.AttendanceKPIConfigForClinicianAndTriageWorklistVoCollection createAttendanceKPIConfigForClinicianAndTriageWorklistVoCollectionFromAttendanceKPIConfig(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.AttendanceKPIConfigForClinicianAndTriageWorklistVoCollection voList = new ims.emergency.vo.AttendanceKPIConfigForClinicianAndTriageWorklistVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.emergency.configuration.domain.objects.AttendanceKPIConfig domainObject = (ims.emergency.configuration.domain.objects.AttendanceKPIConfig) domainObjectList.get(i);
			ims.emergency.vo.AttendanceKPIConfigForClinicianAndTriageWorklistVo vo = create(map, domainObject);

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
	 public static java.util.Set extractAttendanceKPIConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AttendanceKPIConfigForClinicianAndTriageWorklistVoCollection voCollection) 
	 {
	 	return extractAttendanceKPIConfigSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractAttendanceKPIConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AttendanceKPIConfigForClinicianAndTriageWorklistVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.AttendanceKPIConfigForClinicianAndTriageWorklistVo vo = voCollection.get(i);
			ims.emergency.configuration.domain.objects.AttendanceKPIConfig domainObject = AttendanceKPIConfigForClinicianAndTriageWorklistVoAssembler.extractAttendanceKPIConfig(domainFactory, vo, domMap);

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
	 public static java.util.List extractAttendanceKPIConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AttendanceKPIConfigForClinicianAndTriageWorklistVoCollection voCollection) 
	 {
	 	return extractAttendanceKPIConfigList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractAttendanceKPIConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AttendanceKPIConfigForClinicianAndTriageWorklistVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.AttendanceKPIConfigForClinicianAndTriageWorklistVo vo = voCollection.get(i);
			ims.emergency.configuration.domain.objects.AttendanceKPIConfig domainObject = AttendanceKPIConfigForClinicianAndTriageWorklistVoAssembler.extractAttendanceKPIConfig(domainFactory, vo, domMap);

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
	 public static ims.emergency.vo.AttendanceKPIConfigForClinicianAndTriageWorklistVo create(ims.emergency.configuration.domain.objects.AttendanceKPIConfig domainObject) 
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
	  public static ims.emergency.vo.AttendanceKPIConfigForClinicianAndTriageWorklistVo create(DomainObjectMap map, ims.emergency.configuration.domain.objects.AttendanceKPIConfig domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.AttendanceKPIConfigForClinicianAndTriageWorklistVo valueObject = (ims.emergency.vo.AttendanceKPIConfigForClinicianAndTriageWorklistVo) map.getValueObject(domainObject, ims.emergency.vo.AttendanceKPIConfigForClinicianAndTriageWorklistVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.AttendanceKPIConfigForClinicianAndTriageWorklistVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.emergency.vo.AttendanceKPIConfigForClinicianAndTriageWorklistVo insert(ims.emergency.vo.AttendanceKPIConfigForClinicianAndTriageWorklistVo valueObject, ims.emergency.configuration.domain.objects.AttendanceKPIConfig domainObject) 
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
	 public static ims.emergency.vo.AttendanceKPIConfigForClinicianAndTriageWorklistVo insert(DomainObjectMap map, ims.emergency.vo.AttendanceKPIConfigForClinicianAndTriageWorklistVo valueObject, ims.emergency.configuration.domain.objects.AttendanceKPIConfig domainObject) 
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
		// AwaitingTriageBreachWarningKPI
		valueObject.setAwaitingTriageBreachWarningKPI(domainObject.getAwaitingTriageBreachWarningKPI());
		// AwaitingTriageBreachWarningKPITextColour
		valueObject.setAwaitingTriageBreachWarningKPITextColour(domainObject.getAwaitingTriageBreachWarningKPITextColour());
		// AwaitingTriageBreachWarningKPIFlashingText
		ims.domain.lookups.LookupInstance instance4 = domainObject.getAwaitingTriageBreachWarningKPIFlashingText();
		if ( null != instance4 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance4.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance4.getImage().getImageId(), instance4.getImage().getImagePath());
			}
			color = instance4.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup4 = new ims.core.vo.lookups.YesNo(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup4 = voLookup4;
			ims.domain.lookups.LookupInstance parent4 = instance4.getParent();
			while (parent4 != null)
			{
				if (parent4.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent4.getImage().getImageId(), parent4.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent4.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup4.setParent(new ims.core.vo.lookups.YesNo(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setAwaitingTriageBreachWarningKPIFlashingText(voLookup4);
		}
				// AwaitingTriageBreachWarningKPIFlashingTextColour
		valueObject.setAwaitingTriageBreachWarningKPIFlashingTextColour(domainObject.getAwaitingTriageBreachWarningKPIFlashingTextColour());
		// AwaitingTriageBreachWarningKPIBackgroundColour
		valueObject.setAwaitingTriageBreachWarningKPIBackgroundColour(domainObject.getAwaitingTriageBreachWarningKPIBackgroundColour());
		// AwaitingTriageBreachedKPI
		valueObject.setAwaitingTriageBreachedKPI(domainObject.getAwaitingTriageBreachedKPI());
		// AwaitingTriageBreachKPITextColour
		valueObject.setAwaitingTriageBreachKPITextColour(domainObject.getAwaitingTriageBreachKPITextColour());
		// AwaitingTriageBreachKPIFlashingText
		ims.domain.lookups.LookupInstance instance9 = domainObject.getAwaitingTriageBreachKPIFlashingText();
		if ( null != instance9 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance9.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance9.getImage().getImageId(), instance9.getImage().getImagePath());
			}
			color = instance9.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup9 = new ims.core.vo.lookups.YesNo(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup9 = voLookup9;
			ims.domain.lookups.LookupInstance parent9 = instance9.getParent();
			while (parent9 != null)
			{
				if (parent9.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent9.getImage().getImageId(), parent9.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent9.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup9.setParent(new ims.core.vo.lookups.YesNo(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setAwaitingTriageBreachKPIFlashingText(voLookup9);
		}
				// AwaitingTriageBreachKPIFlashingTextColour
		valueObject.setAwaitingTriageBreachKPIFlashingTextColour(domainObject.getAwaitingTriageBreachKPIFlashingTextColour());
		// AwaitingTriageBreachKPIBackgroundColour
		valueObject.setAwaitingTriageBreachKPIBackgroundColour(domainObject.getAwaitingTriageBreachKPIBackgroundColour());
		// TriagePriorityKPIs
		valueObject.setTriagePriorityKPIs(ims.emergency.vo.domain.TriagePriorityKpConfigVoAssembler.createTriagePriorityKpConfigVoCollectionFromTriagePriorityKPConfig(map, domainObject.getTriagePriorityKPIs()) );
		// AwaitingClinicianBreachWarningKPI
		valueObject.setAwaitingClinicianBreachWarningKPI(domainObject.getAwaitingClinicianBreachWarningKPI());
		// AwaitingClinicianBreachWarningKPITextColour
		valueObject.setAwaitingClinicianBreachWarningKPITextColour(domainObject.getAwaitingClinicianBreachWarningKPITextColour());
		// AwaitingClinicianBreachWarningKPIFlashingText
		ims.domain.lookups.LookupInstance instance15 = domainObject.getAwaitingClinicianBreachWarningKPIFlashingText();
		if ( null != instance15 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance15.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance15.getImage().getImageId(), instance15.getImage().getImagePath());
			}
			color = instance15.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup15 = new ims.core.vo.lookups.YesNo(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup15 = voLookup15;
			ims.domain.lookups.LookupInstance parent15 = instance15.getParent();
			while (parent15 != null)
			{
				if (parent15.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent15.getImage().getImageId(), parent15.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent15.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup15.setParent(new ims.core.vo.lookups.YesNo(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setAwaitingClinicianBreachWarningKPIFlashingText(voLookup15);
		}
				// AwaitingClinicianBreachWarningKPIFlashingTextColour
		valueObject.setAwaitingClinicianBreachWarningKPIFlashingTextColour(domainObject.getAwaitingClinicianBreachWarningKPIFlashingTextColour());
		// AwaitingClinicianBreachWarningKPIBackgroundColour
		valueObject.setAwaitingClinicianBreachWarningKPIBackgroundColour(domainObject.getAwaitingClinicianBreachWarningKPIBackgroundColour());
		// AwaitingClinicianBreachedKPI
		valueObject.setAwaitingClinicianBreachedKPI(domainObject.getAwaitingClinicianBreachedKPI());
		// AwaitingClinicianBreachKPITextColour
		valueObject.setAwaitingClinicianBreachKPITextColour(domainObject.getAwaitingClinicianBreachKPITextColour());
		// AwaitingClinicianBreachKPIFlashingText
		ims.domain.lookups.LookupInstance instance20 = domainObject.getAwaitingClinicianBreachKPIFlashingText();
		if ( null != instance20 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance20.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance20.getImage().getImageId(), instance20.getImage().getImagePath());
			}
			color = instance20.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup20 = new ims.core.vo.lookups.YesNo(instance20.getId(),instance20.getText(), instance20.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup20 = voLookup20;
			ims.domain.lookups.LookupInstance parent20 = instance20.getParent();
			while (parent20 != null)
			{
				if (parent20.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent20.getImage().getImageId(), parent20.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent20.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup20.setParent(new ims.core.vo.lookups.YesNo(parent20.getId(),parent20.getText(), parent20.isActive(), null, img, color));
				parentVoLookup20 = parentVoLookup20.getParent();
								parent20 = parent20.getParent();
			}			
			valueObject.setAwaitingClinicianBreachKPIFlashingText(voLookup20);
		}
				// AwaitingClinicianBreachKPIFlashingTextColour
		valueObject.setAwaitingClinicianBreachKPIFlashingTextColour(domainObject.getAwaitingClinicianBreachKPIFlashingTextColour());
		// AwaitingClinicianBreachKPIBackgroundColour
		valueObject.setAwaitingClinicianBreachKPIBackgroundColour(domainObject.getAwaitingClinicianBreachKPIBackgroundColour());
		// LosBreachWarningKPI
		valueObject.setLosBreachWarningKPI(domainObject.getLosBreachWarningKPI());
		// LosBreachWarningKPITextColour
		valueObject.setLosBreachWarningKPITextColour(domainObject.getLosBreachWarningKPITextColour());
		// LosBreachWarningKPIFlashingText
		ims.domain.lookups.LookupInstance instance25 = domainObject.getLosBreachWarningKPIFlashingText();
		if ( null != instance25 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance25.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance25.getImage().getImageId(), instance25.getImage().getImagePath());
			}
			color = instance25.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup25 = new ims.core.vo.lookups.YesNo(instance25.getId(),instance25.getText(), instance25.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup25 = voLookup25;
			ims.domain.lookups.LookupInstance parent25 = instance25.getParent();
			while (parent25 != null)
			{
				if (parent25.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent25.getImage().getImageId(), parent25.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent25.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup25.setParent(new ims.core.vo.lookups.YesNo(parent25.getId(),parent25.getText(), parent25.isActive(), null, img, color));
				parentVoLookup25 = parentVoLookup25.getParent();
								parent25 = parent25.getParent();
			}			
			valueObject.setLosBreachWarningKPIFlashingText(voLookup25);
		}
				// LosBreachWarningKPIFlashingTextColour
		valueObject.setLosBreachWarningKPIFlashingTextColour(domainObject.getLosBreachWarningKPIFlashingTextColour());
		// LosBreachWarningKPIBackgroundColour
		valueObject.setLosBreachWarningKPIBackgroundColour(domainObject.getLosBreachWarningKPIBackgroundColour());
		// LosBreachedKPI
		valueObject.setLosBreachedKPI(domainObject.getLosBreachedKPI());
		// LosBreachKPITextColour
		valueObject.setLosBreachKPITextColour(domainObject.getLosBreachKPITextColour());
		// LosBreachedKPIFlashingText
		ims.domain.lookups.LookupInstance instance30 = domainObject.getLosBreachedKPIFlashingText();
		if ( null != instance30 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance30.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance30.getImage().getImageId(), instance30.getImage().getImagePath());
			}
			color = instance30.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup30 = new ims.core.vo.lookups.YesNo(instance30.getId(),instance30.getText(), instance30.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup30 = voLookup30;
			ims.domain.lookups.LookupInstance parent30 = instance30.getParent();
			while (parent30 != null)
			{
				if (parent30.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent30.getImage().getImageId(), parent30.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent30.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup30.setParent(new ims.core.vo.lookups.YesNo(parent30.getId(),parent30.getText(), parent30.isActive(), null, img, color));
				parentVoLookup30 = parentVoLookup30.getParent();
								parent30 = parent30.getParent();
			}			
			valueObject.setLosBreachedKPIFlashingText(voLookup30);
		}
				// LosBreachedKPIFlashingTextColour
		valueObject.setLosBreachedKPIFlashingTextColour(domainObject.getLosBreachedKPIFlashingTextColour());
		// LosBreachedKPIBackgroundColour
		valueObject.setLosBreachedKPIBackgroundColour(domainObject.getLosBreachedKPIBackgroundColour());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.emergency.configuration.domain.objects.AttendanceKPIConfig extractAttendanceKPIConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AttendanceKPIConfigForClinicianAndTriageWorklistVo valueObject) 
	{
		return 	extractAttendanceKPIConfig(domainFactory, valueObject, new HashMap());
	}

	public static ims.emergency.configuration.domain.objects.AttendanceKPIConfig extractAttendanceKPIConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AttendanceKPIConfigForClinicianAndTriageWorklistVo valueObject, HashMap domMap) 
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
			// ims.emergency.vo.AttendanceKPIConfigForClinicianAndTriageWorklistVo ID_AttendanceKPIConfig field is unknown
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

		ims.core.resource.place.domain.objects.Location value1 = null;
		if ( null != valueObject.getEDLocation() ) 
		{
			if (valueObject.getEDLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getEDLocation()) != null)
				{
					value1 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getEDLocation());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getEDLocation();	
			}
			else
			{
				value1 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getEDLocation().getBoId());
			}
		}
		domainObject.setEDLocation(value1);
		domainObject.setAwaitingTriageBreachWarningKPI(valueObject.getAwaitingTriageBreachWarningKPI());
		domainObject.setAwaitingTriageBreachWarningKPITextColour(valueObject.getAwaitingTriageBreachWarningKPITextColour());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getAwaitingTriageBreachWarningKPIFlashingText() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getAwaitingTriageBreachWarningKPIFlashingText().getID());
		}
		domainObject.setAwaitingTriageBreachWarningKPIFlashingText(value4);
		domainObject.setAwaitingTriageBreachWarningKPIFlashingTextColour(valueObject.getAwaitingTriageBreachWarningKPIFlashingTextColour());
		domainObject.setAwaitingTriageBreachWarningKPIBackgroundColour(valueObject.getAwaitingTriageBreachWarningKPIBackgroundColour());
		domainObject.setAwaitingTriageBreachedKPI(valueObject.getAwaitingTriageBreachedKPI());
		domainObject.setAwaitingTriageBreachKPITextColour(valueObject.getAwaitingTriageBreachKPITextColour());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getAwaitingTriageBreachKPIFlashingText() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getAwaitingTriageBreachKPIFlashingText().getID());
		}
		domainObject.setAwaitingTriageBreachKPIFlashingText(value9);
		domainObject.setAwaitingTriageBreachKPIFlashingTextColour(valueObject.getAwaitingTriageBreachKPIFlashingTextColour());
		domainObject.setAwaitingTriageBreachKPIBackgroundColour(valueObject.getAwaitingTriageBreachKPIBackgroundColour());

		// SaveAsRefVO treated as RefValueObject
		ims.emergency.configuration.vo.TriagePriorityKPConfigRefVoCollection refCollection12 = new ims.emergency.configuration.vo.TriagePriorityKPConfigRefVoCollection();
		if (valueObject.getTriagePriorityKPIs() != null)
		{
			for (int i12=0; i12<valueObject.getTriagePriorityKPIs().size(); i12++)
			{
				ims.emergency.configuration.vo.TriagePriorityKPConfigRefVo ref12 = (ims.emergency.configuration.vo.TriagePriorityKPConfigRefVo)valueObject.getTriagePriorityKPIs().get(i12);
				refCollection12.add(ref12);
			}
		}
		int size12 = (null == refCollection12) ? 0 : refCollection12.size();		
		java.util.List domainTriagePriorityKPIs12 = domainObject.getTriagePriorityKPIs();
		if (domainTriagePriorityKPIs12 == null)
		{
			domainTriagePriorityKPIs12 = new java.util.ArrayList();
		}
		for(int i=0; i < size12; i++) 
		{
			ims.emergency.configuration.vo.TriagePriorityKPConfigRefVo vo = refCollection12.get(i);			
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

			int domIdx = domainTriagePriorityKPIs12.indexOf(dom);
			if (domIdx == -1)
			{
				domainTriagePriorityKPIs12.add(i, dom);
			}
			else if (i != domIdx && i < domainTriagePriorityKPIs12.size())
			{
				Object tmp = domainTriagePriorityKPIs12.get(i);
				domainTriagePriorityKPIs12.set(i, domainTriagePriorityKPIs12.get(domIdx));
				domainTriagePriorityKPIs12.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i12 = domainTriagePriorityKPIs12.size();
		while (i12 > size12)
		{
			domainTriagePriorityKPIs12.remove(i12-1);
			i12 = domainTriagePriorityKPIs12.size();
		}
		
		domainObject.setTriagePriorityKPIs(domainTriagePriorityKPIs12);		
		domainObject.setAwaitingClinicianBreachWarningKPI(valueObject.getAwaitingClinicianBreachWarningKPI());
		domainObject.setAwaitingClinicianBreachWarningKPITextColour(valueObject.getAwaitingClinicianBreachWarningKPITextColour());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getAwaitingClinicianBreachWarningKPIFlashingText() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getAwaitingClinicianBreachWarningKPIFlashingText().getID());
		}
		domainObject.setAwaitingClinicianBreachWarningKPIFlashingText(value15);
		domainObject.setAwaitingClinicianBreachWarningKPIFlashingTextColour(valueObject.getAwaitingClinicianBreachWarningKPIFlashingTextColour());
		domainObject.setAwaitingClinicianBreachWarningKPIBackgroundColour(valueObject.getAwaitingClinicianBreachWarningKPIBackgroundColour());
		domainObject.setAwaitingClinicianBreachedKPI(valueObject.getAwaitingClinicianBreachedKPI());
		domainObject.setAwaitingClinicianBreachKPITextColour(valueObject.getAwaitingClinicianBreachKPITextColour());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value20 = null;
		if ( null != valueObject.getAwaitingClinicianBreachKPIFlashingText() ) 
		{
			value20 =
				domainFactory.getLookupInstance(valueObject.getAwaitingClinicianBreachKPIFlashingText().getID());
		}
		domainObject.setAwaitingClinicianBreachKPIFlashingText(value20);
		domainObject.setAwaitingClinicianBreachKPIFlashingTextColour(valueObject.getAwaitingClinicianBreachKPIFlashingTextColour());
		domainObject.setAwaitingClinicianBreachKPIBackgroundColour(valueObject.getAwaitingClinicianBreachKPIBackgroundColour());
		domainObject.setLosBreachWarningKPI(valueObject.getLosBreachWarningKPI());
		domainObject.setLosBreachWarningKPITextColour(valueObject.getLosBreachWarningKPITextColour());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value25 = null;
		if ( null != valueObject.getLosBreachWarningKPIFlashingText() ) 
		{
			value25 =
				domainFactory.getLookupInstance(valueObject.getLosBreachWarningKPIFlashingText().getID());
		}
		domainObject.setLosBreachWarningKPIFlashingText(value25);
		domainObject.setLosBreachWarningKPIFlashingTextColour(valueObject.getLosBreachWarningKPIFlashingTextColour());
		domainObject.setLosBreachWarningKPIBackgroundColour(valueObject.getLosBreachWarningKPIBackgroundColour());
		domainObject.setLosBreachedKPI(valueObject.getLosBreachedKPI());
		domainObject.setLosBreachKPITextColour(valueObject.getLosBreachKPITextColour());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value30 = null;
		if ( null != valueObject.getLosBreachedKPIFlashingText() ) 
		{
			value30 =
				domainFactory.getLookupInstance(valueObject.getLosBreachedKPIFlashingText().getID());
		}
		domainObject.setLosBreachedKPIFlashingText(value30);
		domainObject.setLosBreachedKPIFlashingTextColour(valueObject.getLosBreachedKPIFlashingTextColour());
		domainObject.setLosBreachedKPIBackgroundColour(valueObject.getLosBreachedKPIBackgroundColour());

		return domainObject;
	}

}
