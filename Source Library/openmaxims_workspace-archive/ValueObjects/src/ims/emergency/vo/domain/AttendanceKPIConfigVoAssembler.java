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
public class AttendanceKPIConfigVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.AttendanceKPIConfigVo copy(ims.emergency.vo.AttendanceKPIConfigVo valueObjectDest, ims.emergency.vo.AttendanceKPIConfigVo valueObjectSrc) 
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
		// AwaitingTriageBreachedKPI
		valueObjectDest.setAwaitingTriageBreachedKPI(valueObjectSrc.getAwaitingTriageBreachedKPI());
		// TriagePriorityKPIs
		valueObjectDest.setTriagePriorityKPIs(valueObjectSrc.getTriagePriorityKPIs());
		// AwaitingClinicianBreachWarningKPI
		valueObjectDest.setAwaitingClinicianBreachWarningKPI(valueObjectSrc.getAwaitingClinicianBreachWarningKPI());
		// AwaitingClinicianBreachedKPI
		valueObjectDest.setAwaitingClinicianBreachedKPI(valueObjectSrc.getAwaitingClinicianBreachedKPI());
		// LosBreachWarningKPI
		valueObjectDest.setLosBreachWarningKPI(valueObjectSrc.getLosBreachWarningKPI());
		// LosBreachedKPI
		valueObjectDest.setLosBreachedKPI(valueObjectSrc.getLosBreachedKPI());
		// AwaitingTriageBreachWarningKPITextColour
		valueObjectDest.setAwaitingTriageBreachWarningKPITextColour(valueObjectSrc.getAwaitingTriageBreachWarningKPITextColour());
		// AwaitingTriageBreachWarningKPIFlashingText
		valueObjectDest.setAwaitingTriageBreachWarningKPIFlashingText(valueObjectSrc.getAwaitingTriageBreachWarningKPIFlashingText());
		// AwaitingTriageBreachWarningKPIFlashingTextColour
		valueObjectDest.setAwaitingTriageBreachWarningKPIFlashingTextColour(valueObjectSrc.getAwaitingTriageBreachWarningKPIFlashingTextColour());
		// AwaitingTriageBreachWarningKPIBackgroundColour
		valueObjectDest.setAwaitingTriageBreachWarningKPIBackgroundColour(valueObjectSrc.getAwaitingTriageBreachWarningKPIBackgroundColour());
		// AwaitingTriageBreachKPITextColour
		valueObjectDest.setAwaitingTriageBreachKPITextColour(valueObjectSrc.getAwaitingTriageBreachKPITextColour());
		// AwaitingTriageBreachKPIFlashingText
		valueObjectDest.setAwaitingTriageBreachKPIFlashingText(valueObjectSrc.getAwaitingTriageBreachKPIFlashingText());
		// AwaitingTriageBreachKPIFlashingTextColour
		valueObjectDest.setAwaitingTriageBreachKPIFlashingTextColour(valueObjectSrc.getAwaitingTriageBreachKPIFlashingTextColour());
		// AwaitingTriageBreachKPIBackgroundColour
		valueObjectDest.setAwaitingTriageBreachKPIBackgroundColour(valueObjectSrc.getAwaitingTriageBreachKPIBackgroundColour());
		// AwaitingClinicianBreachWarningKPITextColour
		valueObjectDest.setAwaitingClinicianBreachWarningKPITextColour(valueObjectSrc.getAwaitingClinicianBreachWarningKPITextColour());
		// AwaitingClinicianBreachWarningKPIFlashingText
		valueObjectDest.setAwaitingClinicianBreachWarningKPIFlashingText(valueObjectSrc.getAwaitingClinicianBreachWarningKPIFlashingText());
		// AwaitingClinicianBreachWarningKPIFlashingTextColour
		valueObjectDest.setAwaitingClinicianBreachWarningKPIFlashingTextColour(valueObjectSrc.getAwaitingClinicianBreachWarningKPIFlashingTextColour());
		// AwaitingClinicianBreachWarningKPIBackgroundColour
		valueObjectDest.setAwaitingClinicianBreachWarningKPIBackgroundColour(valueObjectSrc.getAwaitingClinicianBreachWarningKPIBackgroundColour());
		// AwaitingClinicianBreachKPITextColour
		valueObjectDest.setAwaitingClinicianBreachKPITextColour(valueObjectSrc.getAwaitingClinicianBreachKPITextColour());
		// AwaitingClinicianBreachKPIFlashingText
		valueObjectDest.setAwaitingClinicianBreachKPIFlashingText(valueObjectSrc.getAwaitingClinicianBreachKPIFlashingText());
		// AwaitingClinicianBreachKPIFlashingTextColour
		valueObjectDest.setAwaitingClinicianBreachKPIFlashingTextColour(valueObjectSrc.getAwaitingClinicianBreachKPIFlashingTextColour());
		// AwaitingClinicianBreachKPIBackgroundColour
		valueObjectDest.setAwaitingClinicianBreachKPIBackgroundColour(valueObjectSrc.getAwaitingClinicianBreachKPIBackgroundColour());
		// LosBreachWarningKPITextColour
		valueObjectDest.setLosBreachWarningKPITextColour(valueObjectSrc.getLosBreachWarningKPITextColour());
		// LosBreachWarningKPIFlashingText
		valueObjectDest.setLosBreachWarningKPIFlashingText(valueObjectSrc.getLosBreachWarningKPIFlashingText());
		// LosBreachWarningKPIFlashingTextColour
		valueObjectDest.setLosBreachWarningKPIFlashingTextColour(valueObjectSrc.getLosBreachWarningKPIFlashingTextColour());
		// LosBreachWarningKPIBackgroundColour
		valueObjectDest.setLosBreachWarningKPIBackgroundColour(valueObjectSrc.getLosBreachWarningKPIBackgroundColour());
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
 	 * If more than one call to an Assembler is made then #createAttendanceKPIConfigVoCollectionFromAttendanceKPIConfig(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.emergency.configuration.domain.objects.AttendanceKPIConfig objects.
	 */
	public static ims.emergency.vo.AttendanceKPIConfigVoCollection createAttendanceKPIConfigVoCollectionFromAttendanceKPIConfig(java.util.Set domainObjectSet)	
	{
		return createAttendanceKPIConfigVoCollectionFromAttendanceKPIConfig(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.emergency.configuration.domain.objects.AttendanceKPIConfig objects.
	 */
	public static ims.emergency.vo.AttendanceKPIConfigVoCollection createAttendanceKPIConfigVoCollectionFromAttendanceKPIConfig(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.AttendanceKPIConfigVoCollection voList = new ims.emergency.vo.AttendanceKPIConfigVoCollection();
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
			ims.emergency.vo.AttendanceKPIConfigVo vo = create(map, domainObject);
			
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
	public static ims.emergency.vo.AttendanceKPIConfigVoCollection createAttendanceKPIConfigVoCollectionFromAttendanceKPIConfig(java.util.List domainObjectList) 
	{
		return createAttendanceKPIConfigVoCollectionFromAttendanceKPIConfig(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.emergency.configuration.domain.objects.AttendanceKPIConfig objects.
	 */
	public static ims.emergency.vo.AttendanceKPIConfigVoCollection createAttendanceKPIConfigVoCollectionFromAttendanceKPIConfig(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.AttendanceKPIConfigVoCollection voList = new ims.emergency.vo.AttendanceKPIConfigVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.emergency.configuration.domain.objects.AttendanceKPIConfig domainObject = (ims.emergency.configuration.domain.objects.AttendanceKPIConfig) domainObjectList.get(i);
			ims.emergency.vo.AttendanceKPIConfigVo vo = create(map, domainObject);

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
	 public static java.util.Set extractAttendanceKPIConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AttendanceKPIConfigVoCollection voCollection) 
	 {
	 	return extractAttendanceKPIConfigSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractAttendanceKPIConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AttendanceKPIConfigVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.AttendanceKPIConfigVo vo = voCollection.get(i);
			ims.emergency.configuration.domain.objects.AttendanceKPIConfig domainObject = AttendanceKPIConfigVoAssembler.extractAttendanceKPIConfig(domainFactory, vo, domMap);

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
	 public static java.util.List extractAttendanceKPIConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AttendanceKPIConfigVoCollection voCollection) 
	 {
	 	return extractAttendanceKPIConfigList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractAttendanceKPIConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AttendanceKPIConfigVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.AttendanceKPIConfigVo vo = voCollection.get(i);
			ims.emergency.configuration.domain.objects.AttendanceKPIConfig domainObject = AttendanceKPIConfigVoAssembler.extractAttendanceKPIConfig(domainFactory, vo, domMap);

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
	 public static ims.emergency.vo.AttendanceKPIConfigVo create(ims.emergency.configuration.domain.objects.AttendanceKPIConfig domainObject) 
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
	  public static ims.emergency.vo.AttendanceKPIConfigVo create(DomainObjectMap map, ims.emergency.configuration.domain.objects.AttendanceKPIConfig domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.AttendanceKPIConfigVo valueObject = (ims.emergency.vo.AttendanceKPIConfigVo) map.getValueObject(domainObject, ims.emergency.vo.AttendanceKPIConfigVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.AttendanceKPIConfigVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.emergency.vo.AttendanceKPIConfigVo insert(ims.emergency.vo.AttendanceKPIConfigVo valueObject, ims.emergency.configuration.domain.objects.AttendanceKPIConfig domainObject) 
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
	 public static ims.emergency.vo.AttendanceKPIConfigVo insert(DomainObjectMap map, ims.emergency.vo.AttendanceKPIConfigVo valueObject, ims.emergency.configuration.domain.objects.AttendanceKPIConfig domainObject) 
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
		// AwaitingTriageBreachedKPI
		valueObject.setAwaitingTriageBreachedKPI(domainObject.getAwaitingTriageBreachedKPI());
		// TriagePriorityKPIs
		valueObject.setTriagePriorityKPIs(ims.emergency.vo.domain.TriagePriorityKpConfigVoAssembler.createTriagePriorityKpConfigVoCollectionFromTriagePriorityKPConfig(map, domainObject.getTriagePriorityKPIs()) );
		// AwaitingClinicianBreachWarningKPI
		valueObject.setAwaitingClinicianBreachWarningKPI(domainObject.getAwaitingClinicianBreachWarningKPI());
		// AwaitingClinicianBreachedKPI
		valueObject.setAwaitingClinicianBreachedKPI(domainObject.getAwaitingClinicianBreachedKPI());
		// LosBreachWarningKPI
		valueObject.setLosBreachWarningKPI(domainObject.getLosBreachWarningKPI());
		// LosBreachedKPI
		valueObject.setLosBreachedKPI(domainObject.getLosBreachedKPI());
		// AwaitingTriageBreachWarningKPITextColour
		valueObject.setAwaitingTriageBreachWarningKPITextColour(domainObject.getAwaitingTriageBreachWarningKPITextColour());
		// AwaitingTriageBreachWarningKPIFlashingText
		ims.domain.lookups.LookupInstance instance10 = domainObject.getAwaitingTriageBreachWarningKPIFlashingText();
		if ( null != instance10 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance10.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance10.getImage().getImageId(), instance10.getImage().getImagePath());
			}
			color = instance10.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup10 = new ims.core.vo.lookups.YesNo(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup10 = voLookup10;
			ims.domain.lookups.LookupInstance parent10 = instance10.getParent();
			while (parent10 != null)
			{
				if (parent10.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent10.getImage().getImageId(), parent10.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent10.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup10.setParent(new ims.core.vo.lookups.YesNo(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setAwaitingTriageBreachWarningKPIFlashingText(voLookup10);
		}
				// AwaitingTriageBreachWarningKPIFlashingTextColour
		valueObject.setAwaitingTriageBreachWarningKPIFlashingTextColour(domainObject.getAwaitingTriageBreachWarningKPIFlashingTextColour());
		// AwaitingTriageBreachWarningKPIBackgroundColour
		valueObject.setAwaitingTriageBreachWarningKPIBackgroundColour(domainObject.getAwaitingTriageBreachWarningKPIBackgroundColour());
		// AwaitingTriageBreachKPITextColour
		valueObject.setAwaitingTriageBreachKPITextColour(domainObject.getAwaitingTriageBreachKPITextColour());
		// AwaitingTriageBreachKPIFlashingText
		ims.domain.lookups.LookupInstance instance14 = domainObject.getAwaitingTriageBreachKPIFlashingText();
		if ( null != instance14 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance14.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance14.getImage().getImageId(), instance14.getImage().getImagePath());
			}
			color = instance14.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup14 = new ims.core.vo.lookups.YesNo(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup14 = voLookup14;
			ims.domain.lookups.LookupInstance parent14 = instance14.getParent();
			while (parent14 != null)
			{
				if (parent14.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent14.getImage().getImageId(), parent14.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent14.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup14.setParent(new ims.core.vo.lookups.YesNo(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setAwaitingTriageBreachKPIFlashingText(voLookup14);
		}
				// AwaitingTriageBreachKPIFlashingTextColour
		valueObject.setAwaitingTriageBreachKPIFlashingTextColour(domainObject.getAwaitingTriageBreachKPIFlashingTextColour());
		// AwaitingTriageBreachKPIBackgroundColour
		valueObject.setAwaitingTriageBreachKPIBackgroundColour(domainObject.getAwaitingTriageBreachKPIBackgroundColour());
		// AwaitingClinicianBreachWarningKPITextColour
		valueObject.setAwaitingClinicianBreachWarningKPITextColour(domainObject.getAwaitingClinicianBreachWarningKPITextColour());
		// AwaitingClinicianBreachWarningKPIFlashingText
		ims.domain.lookups.LookupInstance instance18 = domainObject.getAwaitingClinicianBreachWarningKPIFlashingText();
		if ( null != instance18 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance18.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance18.getImage().getImageId(), instance18.getImage().getImagePath());
			}
			color = instance18.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup18 = new ims.core.vo.lookups.YesNo(instance18.getId(),instance18.getText(), instance18.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup18 = voLookup18;
			ims.domain.lookups.LookupInstance parent18 = instance18.getParent();
			while (parent18 != null)
			{
				if (parent18.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent18.getImage().getImageId(), parent18.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent18.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup18.setParent(new ims.core.vo.lookups.YesNo(parent18.getId(),parent18.getText(), parent18.isActive(), null, img, color));
				parentVoLookup18 = parentVoLookup18.getParent();
								parent18 = parent18.getParent();
			}			
			valueObject.setAwaitingClinicianBreachWarningKPIFlashingText(voLookup18);
		}
				// AwaitingClinicianBreachWarningKPIFlashingTextColour
		valueObject.setAwaitingClinicianBreachWarningKPIFlashingTextColour(domainObject.getAwaitingClinicianBreachWarningKPIFlashingTextColour());
		// AwaitingClinicianBreachWarningKPIBackgroundColour
		valueObject.setAwaitingClinicianBreachWarningKPIBackgroundColour(domainObject.getAwaitingClinicianBreachWarningKPIBackgroundColour());
		// AwaitingClinicianBreachKPITextColour
		valueObject.setAwaitingClinicianBreachKPITextColour(domainObject.getAwaitingClinicianBreachKPITextColour());
		// AwaitingClinicianBreachKPIFlashingText
		ims.domain.lookups.LookupInstance instance22 = domainObject.getAwaitingClinicianBreachKPIFlashingText();
		if ( null != instance22 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance22.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance22.getImage().getImageId(), instance22.getImage().getImagePath());
			}
			color = instance22.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup22 = new ims.core.vo.lookups.YesNo(instance22.getId(),instance22.getText(), instance22.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup22 = voLookup22;
			ims.domain.lookups.LookupInstance parent22 = instance22.getParent();
			while (parent22 != null)
			{
				if (parent22.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent22.getImage().getImageId(), parent22.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent22.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup22.setParent(new ims.core.vo.lookups.YesNo(parent22.getId(),parent22.getText(), parent22.isActive(), null, img, color));
				parentVoLookup22 = parentVoLookup22.getParent();
								parent22 = parent22.getParent();
			}			
			valueObject.setAwaitingClinicianBreachKPIFlashingText(voLookup22);
		}
				// AwaitingClinicianBreachKPIFlashingTextColour
		valueObject.setAwaitingClinicianBreachKPIFlashingTextColour(domainObject.getAwaitingClinicianBreachKPIFlashingTextColour());
		// AwaitingClinicianBreachKPIBackgroundColour
		valueObject.setAwaitingClinicianBreachKPIBackgroundColour(domainObject.getAwaitingClinicianBreachKPIBackgroundColour());
		// LosBreachWarningKPITextColour
		valueObject.setLosBreachWarningKPITextColour(domainObject.getLosBreachWarningKPITextColour());
		// LosBreachWarningKPIFlashingText
		ims.domain.lookups.LookupInstance instance26 = domainObject.getLosBreachWarningKPIFlashingText();
		if ( null != instance26 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance26.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance26.getImage().getImageId(), instance26.getImage().getImagePath());
			}
			color = instance26.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup26 = new ims.core.vo.lookups.YesNo(instance26.getId(),instance26.getText(), instance26.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup26 = voLookup26;
			ims.domain.lookups.LookupInstance parent26 = instance26.getParent();
			while (parent26 != null)
			{
				if (parent26.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent26.getImage().getImageId(), parent26.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent26.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup26.setParent(new ims.core.vo.lookups.YesNo(parent26.getId(),parent26.getText(), parent26.isActive(), null, img, color));
				parentVoLookup26 = parentVoLookup26.getParent();
								parent26 = parent26.getParent();
			}			
			valueObject.setLosBreachWarningKPIFlashingText(voLookup26);
		}
				// LosBreachWarningKPIFlashingTextColour
		valueObject.setLosBreachWarningKPIFlashingTextColour(domainObject.getLosBreachWarningKPIFlashingTextColour());
		// LosBreachWarningKPIBackgroundColour
		valueObject.setLosBreachWarningKPIBackgroundColour(domainObject.getLosBreachWarningKPIBackgroundColour());
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
	public static ims.emergency.configuration.domain.objects.AttendanceKPIConfig extractAttendanceKPIConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AttendanceKPIConfigVo valueObject) 
	{
		return 	extractAttendanceKPIConfig(domainFactory, valueObject, new HashMap());
	}

	public static ims.emergency.configuration.domain.objects.AttendanceKPIConfig extractAttendanceKPIConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AttendanceKPIConfigVo valueObject, HashMap domMap) 
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
			// ims.emergency.vo.AttendanceKPIConfigVo ID_AttendanceKPIConfig field is unknown
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
		domainObject.setAwaitingTriageBreachedKPI(valueObject.getAwaitingTriageBreachedKPI());
		domainObject.setTriagePriorityKPIs(ims.emergency.vo.domain.TriagePriorityKpConfigVoAssembler.extractTriagePriorityKPConfigList(domainFactory, valueObject.getTriagePriorityKPIs(), domainObject.getTriagePriorityKPIs(), domMap));		
		domainObject.setAwaitingClinicianBreachWarningKPI(valueObject.getAwaitingClinicianBreachWarningKPI());
		domainObject.setAwaitingClinicianBreachedKPI(valueObject.getAwaitingClinicianBreachedKPI());
		domainObject.setLosBreachWarningKPI(valueObject.getLosBreachWarningKPI());
		domainObject.setLosBreachedKPI(valueObject.getLosBreachedKPI());
		domainObject.setAwaitingTriageBreachWarningKPITextColour(valueObject.getAwaitingTriageBreachWarningKPITextColour());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getAwaitingTriageBreachWarningKPIFlashingText() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getAwaitingTriageBreachWarningKPIFlashingText().getID());
		}
		domainObject.setAwaitingTriageBreachWarningKPIFlashingText(value10);
		domainObject.setAwaitingTriageBreachWarningKPIFlashingTextColour(valueObject.getAwaitingTriageBreachWarningKPIFlashingTextColour());
		domainObject.setAwaitingTriageBreachWarningKPIBackgroundColour(valueObject.getAwaitingTriageBreachWarningKPIBackgroundColour());
		domainObject.setAwaitingTriageBreachKPITextColour(valueObject.getAwaitingTriageBreachKPITextColour());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getAwaitingTriageBreachKPIFlashingText() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getAwaitingTriageBreachKPIFlashingText().getID());
		}
		domainObject.setAwaitingTriageBreachKPIFlashingText(value14);
		domainObject.setAwaitingTriageBreachKPIFlashingTextColour(valueObject.getAwaitingTriageBreachKPIFlashingTextColour());
		domainObject.setAwaitingTriageBreachKPIBackgroundColour(valueObject.getAwaitingTriageBreachKPIBackgroundColour());
		domainObject.setAwaitingClinicianBreachWarningKPITextColour(valueObject.getAwaitingClinicianBreachWarningKPITextColour());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value18 = null;
		if ( null != valueObject.getAwaitingClinicianBreachWarningKPIFlashingText() ) 
		{
			value18 =
				domainFactory.getLookupInstance(valueObject.getAwaitingClinicianBreachWarningKPIFlashingText().getID());
		}
		domainObject.setAwaitingClinicianBreachWarningKPIFlashingText(value18);
		domainObject.setAwaitingClinicianBreachWarningKPIFlashingTextColour(valueObject.getAwaitingClinicianBreachWarningKPIFlashingTextColour());
		domainObject.setAwaitingClinicianBreachWarningKPIBackgroundColour(valueObject.getAwaitingClinicianBreachWarningKPIBackgroundColour());
		domainObject.setAwaitingClinicianBreachKPITextColour(valueObject.getAwaitingClinicianBreachKPITextColour());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value22 = null;
		if ( null != valueObject.getAwaitingClinicianBreachKPIFlashingText() ) 
		{
			value22 =
				domainFactory.getLookupInstance(valueObject.getAwaitingClinicianBreachKPIFlashingText().getID());
		}
		domainObject.setAwaitingClinicianBreachKPIFlashingText(value22);
		domainObject.setAwaitingClinicianBreachKPIFlashingTextColour(valueObject.getAwaitingClinicianBreachKPIFlashingTextColour());
		domainObject.setAwaitingClinicianBreachKPIBackgroundColour(valueObject.getAwaitingClinicianBreachKPIBackgroundColour());
		domainObject.setLosBreachWarningKPITextColour(valueObject.getLosBreachWarningKPITextColour());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value26 = null;
		if ( null != valueObject.getLosBreachWarningKPIFlashingText() ) 
		{
			value26 =
				domainFactory.getLookupInstance(valueObject.getLosBreachWarningKPIFlashingText().getID());
		}
		domainObject.setLosBreachWarningKPIFlashingText(value26);
		domainObject.setLosBreachWarningKPIFlashingTextColour(valueObject.getLosBreachWarningKPIFlashingTextColour());
		domainObject.setLosBreachWarningKPIBackgroundColour(valueObject.getLosBreachWarningKPIBackgroundColour());
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
