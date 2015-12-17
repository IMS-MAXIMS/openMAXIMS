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
public class AttendanceKPIConfigForClinicianWorklistVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.AttendanceKPIConfigForClinicianWorklistVo copy(ims.emergency.vo.AttendanceKPIConfigForClinicianWorklistVo valueObjectDest, ims.emergency.vo.AttendanceKPIConfigForClinicianWorklistVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_AttendanceKPIConfig(valueObjectSrc.getID_AttendanceKPIConfig());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TriagePriorityKPIs
		valueObjectDest.setTriagePriorityKPIs(valueObjectSrc.getTriagePriorityKPIs());
		// LosBreachWarningKPI
		valueObjectDest.setLosBreachWarningKPI(valueObjectSrc.getLosBreachWarningKPI());
		// LosBreachedKPI
		valueObjectDest.setLosBreachedKPI(valueObjectSrc.getLosBreachedKPI());
		// LosBreachWarningKPIFlashingTextColour
		valueObjectDest.setLosBreachWarningKPIFlashingTextColour(valueObjectSrc.getLosBreachWarningKPIFlashingTextColour());
		// LosBreachWarningKPIBackgroundColour
		valueObjectDest.setLosBreachWarningKPIBackgroundColour(valueObjectSrc.getLosBreachWarningKPIBackgroundColour());
		// LosBreachedKPIFlashingTextColour
		valueObjectDest.setLosBreachedKPIFlashingTextColour(valueObjectSrc.getLosBreachedKPIFlashingTextColour());
		// LosBreachedKPIBackgroundColour
		valueObjectDest.setLosBreachedKPIBackgroundColour(valueObjectSrc.getLosBreachedKPIBackgroundColour());
		// LosBreachWarningKPITextColour
		valueObjectDest.setLosBreachWarningKPITextColour(valueObjectSrc.getLosBreachWarningKPITextColour());
		// LosBreachWarningKPIFlashingText
		valueObjectDest.setLosBreachWarningKPIFlashingText(valueObjectSrc.getLosBreachWarningKPIFlashingText());
		// LosBreachKPITextColour
		valueObjectDest.setLosBreachKPITextColour(valueObjectSrc.getLosBreachKPITextColour());
		// LosBreachedKPIFlashingText
		valueObjectDest.setLosBreachedKPIFlashingText(valueObjectSrc.getLosBreachedKPIFlashingText());
		// AwaitingTriageBreachedKPI
		valueObjectDest.setAwaitingTriageBreachedKPI(valueObjectSrc.getAwaitingTriageBreachedKPI());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createAttendanceKPIConfigForClinicianWorklistVoCollectionFromAttendanceKPIConfig(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.emergency.configuration.domain.objects.AttendanceKPIConfig objects.
	 */
	public static ims.emergency.vo.AttendanceKPIConfigForClinicianWorklistVoCollection createAttendanceKPIConfigForClinicianWorklistVoCollectionFromAttendanceKPIConfig(java.util.Set domainObjectSet)	
	{
		return createAttendanceKPIConfigForClinicianWorklistVoCollectionFromAttendanceKPIConfig(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.emergency.configuration.domain.objects.AttendanceKPIConfig objects.
	 */
	public static ims.emergency.vo.AttendanceKPIConfigForClinicianWorklistVoCollection createAttendanceKPIConfigForClinicianWorklistVoCollectionFromAttendanceKPIConfig(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.AttendanceKPIConfigForClinicianWorklistVoCollection voList = new ims.emergency.vo.AttendanceKPIConfigForClinicianWorklistVoCollection();
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
			ims.emergency.vo.AttendanceKPIConfigForClinicianWorklistVo vo = create(map, domainObject);
			
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
	public static ims.emergency.vo.AttendanceKPIConfigForClinicianWorklistVoCollection createAttendanceKPIConfigForClinicianWorklistVoCollectionFromAttendanceKPIConfig(java.util.List domainObjectList) 
	{
		return createAttendanceKPIConfigForClinicianWorklistVoCollectionFromAttendanceKPIConfig(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.emergency.configuration.domain.objects.AttendanceKPIConfig objects.
	 */
	public static ims.emergency.vo.AttendanceKPIConfigForClinicianWorklistVoCollection createAttendanceKPIConfigForClinicianWorklistVoCollectionFromAttendanceKPIConfig(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.AttendanceKPIConfigForClinicianWorklistVoCollection voList = new ims.emergency.vo.AttendanceKPIConfigForClinicianWorklistVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.emergency.configuration.domain.objects.AttendanceKPIConfig domainObject = (ims.emergency.configuration.domain.objects.AttendanceKPIConfig) domainObjectList.get(i);
			ims.emergency.vo.AttendanceKPIConfigForClinicianWorklistVo vo = create(map, domainObject);

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
	 public static java.util.Set extractAttendanceKPIConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AttendanceKPIConfigForClinicianWorklistVoCollection voCollection) 
	 {
	 	return extractAttendanceKPIConfigSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractAttendanceKPIConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AttendanceKPIConfigForClinicianWorklistVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.AttendanceKPIConfigForClinicianWorklistVo vo = voCollection.get(i);
			ims.emergency.configuration.domain.objects.AttendanceKPIConfig domainObject = AttendanceKPIConfigForClinicianWorklistVoAssembler.extractAttendanceKPIConfig(domainFactory, vo, domMap);

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
	 public static java.util.List extractAttendanceKPIConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AttendanceKPIConfigForClinicianWorklistVoCollection voCollection) 
	 {
	 	return extractAttendanceKPIConfigList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractAttendanceKPIConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AttendanceKPIConfigForClinicianWorklistVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.AttendanceKPIConfigForClinicianWorklistVo vo = voCollection.get(i);
			ims.emergency.configuration.domain.objects.AttendanceKPIConfig domainObject = AttendanceKPIConfigForClinicianWorklistVoAssembler.extractAttendanceKPIConfig(domainFactory, vo, domMap);

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
	 public static ims.emergency.vo.AttendanceKPIConfigForClinicianWorklistVo create(ims.emergency.configuration.domain.objects.AttendanceKPIConfig domainObject) 
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
	  public static ims.emergency.vo.AttendanceKPIConfigForClinicianWorklistVo create(DomainObjectMap map, ims.emergency.configuration.domain.objects.AttendanceKPIConfig domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.AttendanceKPIConfigForClinicianWorklistVo valueObject = (ims.emergency.vo.AttendanceKPIConfigForClinicianWorklistVo) map.getValueObject(domainObject, ims.emergency.vo.AttendanceKPIConfigForClinicianWorklistVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.AttendanceKPIConfigForClinicianWorklistVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.emergency.vo.AttendanceKPIConfigForClinicianWorklistVo insert(ims.emergency.vo.AttendanceKPIConfigForClinicianWorklistVo valueObject, ims.emergency.configuration.domain.objects.AttendanceKPIConfig domainObject) 
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
	 public static ims.emergency.vo.AttendanceKPIConfigForClinicianWorklistVo insert(DomainObjectMap map, ims.emergency.vo.AttendanceKPIConfigForClinicianWorklistVo valueObject, ims.emergency.configuration.domain.objects.AttendanceKPIConfig domainObject) 
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
			
		// TriagePriorityKPIs
		valueObject.setTriagePriorityKPIs(ims.emergency.vo.domain.TriagePriorityKpConfigVoAssembler.createTriagePriorityKpConfigVoCollectionFromTriagePriorityKPConfig(map, domainObject.getTriagePriorityKPIs()) );
		// LosBreachWarningKPI
		valueObject.setLosBreachWarningKPI(domainObject.getLosBreachWarningKPI());
		// LosBreachedKPI
		valueObject.setLosBreachedKPI(domainObject.getLosBreachedKPI());
		// LosBreachWarningKPIFlashingTextColour
		valueObject.setLosBreachWarningKPIFlashingTextColour(domainObject.getLosBreachWarningKPIFlashingTextColour());
		// LosBreachWarningKPIBackgroundColour
		valueObject.setLosBreachWarningKPIBackgroundColour(domainObject.getLosBreachWarningKPIBackgroundColour());
		// LosBreachedKPIFlashingTextColour
		valueObject.setLosBreachedKPIFlashingTextColour(domainObject.getLosBreachedKPIFlashingTextColour());
		// LosBreachedKPIBackgroundColour
		valueObject.setLosBreachedKPIBackgroundColour(domainObject.getLosBreachedKPIBackgroundColour());
		// LosBreachWarningKPITextColour
		valueObject.setLosBreachWarningKPITextColour(domainObject.getLosBreachWarningKPITextColour());
		// LosBreachWarningKPIFlashingText
		ims.domain.lookups.LookupInstance instance9 = domainObject.getLosBreachWarningKPIFlashingText();
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
			valueObject.setLosBreachWarningKPIFlashingText(voLookup9);
		}
				// LosBreachKPITextColour
		valueObject.setLosBreachKPITextColour(domainObject.getLosBreachKPITextColour());
		// LosBreachedKPIFlashingText
		ims.domain.lookups.LookupInstance instance11 = domainObject.getLosBreachedKPIFlashingText();
		if ( null != instance11 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance11.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance11.getImage().getImageId(), instance11.getImage().getImagePath());
			}
			color = instance11.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup11 = new ims.core.vo.lookups.YesNo(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup11 = voLookup11;
			ims.domain.lookups.LookupInstance parent11 = instance11.getParent();
			while (parent11 != null)
			{
				if (parent11.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent11.getImage().getImageId(), parent11.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent11.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup11.setParent(new ims.core.vo.lookups.YesNo(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setLosBreachedKPIFlashingText(voLookup11);
		}
				// AwaitingTriageBreachedKPI
		valueObject.setAwaitingTriageBreachedKPI(domainObject.getAwaitingTriageBreachedKPI());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.emergency.configuration.domain.objects.AttendanceKPIConfig extractAttendanceKPIConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AttendanceKPIConfigForClinicianWorklistVo valueObject) 
	{
		return 	extractAttendanceKPIConfig(domainFactory, valueObject, new HashMap());
	}

	public static ims.emergency.configuration.domain.objects.AttendanceKPIConfig extractAttendanceKPIConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AttendanceKPIConfigForClinicianWorklistVo valueObject, HashMap domMap) 
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
			// ims.emergency.vo.AttendanceKPIConfigForClinicianWorklistVo ID_AttendanceKPIConfig field is unknown
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


		// SaveAsRefVO treated as RefValueObject
		ims.emergency.configuration.vo.TriagePriorityKPConfigRefVoCollection refCollection1 = new ims.emergency.configuration.vo.TriagePriorityKPConfigRefVoCollection();
		if (valueObject.getTriagePriorityKPIs() != null)
		{
			for (int i1=0; i1<valueObject.getTriagePriorityKPIs().size(); i1++)
			{
				ims.emergency.configuration.vo.TriagePriorityKPConfigRefVo ref1 = (ims.emergency.configuration.vo.TriagePriorityKPConfigRefVo)valueObject.getTriagePriorityKPIs().get(i1);
				refCollection1.add(ref1);
			}
		}
		int size1 = (null == refCollection1) ? 0 : refCollection1.size();		
		java.util.List domainTriagePriorityKPIs1 = domainObject.getTriagePriorityKPIs();
		if (domainTriagePriorityKPIs1 == null)
		{
			domainTriagePriorityKPIs1 = new java.util.ArrayList();
		}
		for(int i=0; i < size1; i++) 
		{
			ims.emergency.configuration.vo.TriagePriorityKPConfigRefVo vo = refCollection1.get(i);			
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

			int domIdx = domainTriagePriorityKPIs1.indexOf(dom);
			if (domIdx == -1)
			{
				domainTriagePriorityKPIs1.add(i, dom);
			}
			else if (i != domIdx && i < domainTriagePriorityKPIs1.size())
			{
				Object tmp = domainTriagePriorityKPIs1.get(i);
				domainTriagePriorityKPIs1.set(i, domainTriagePriorityKPIs1.get(domIdx));
				domainTriagePriorityKPIs1.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1 = domainTriagePriorityKPIs1.size();
		while (i1 > size1)
		{
			domainTriagePriorityKPIs1.remove(i1-1);
			i1 = domainTriagePriorityKPIs1.size();
		}
		
		domainObject.setTriagePriorityKPIs(domainTriagePriorityKPIs1);		
		domainObject.setLosBreachWarningKPI(valueObject.getLosBreachWarningKPI());
		domainObject.setLosBreachedKPI(valueObject.getLosBreachedKPI());
		domainObject.setLosBreachWarningKPIFlashingTextColour(valueObject.getLosBreachWarningKPIFlashingTextColour());
		domainObject.setLosBreachWarningKPIBackgroundColour(valueObject.getLosBreachWarningKPIBackgroundColour());
		domainObject.setLosBreachedKPIFlashingTextColour(valueObject.getLosBreachedKPIFlashingTextColour());
		domainObject.setLosBreachedKPIBackgroundColour(valueObject.getLosBreachedKPIBackgroundColour());
		domainObject.setLosBreachWarningKPITextColour(valueObject.getLosBreachWarningKPITextColour());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getLosBreachWarningKPIFlashingText() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getLosBreachWarningKPIFlashingText().getID());
		}
		domainObject.setLosBreachWarningKPIFlashingText(value9);
		domainObject.setLosBreachKPITextColour(valueObject.getLosBreachKPITextColour());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getLosBreachedKPIFlashingText() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getLosBreachedKPIFlashingText().getID());
		}
		domainObject.setLosBreachedKPIFlashingText(value11);
		domainObject.setAwaitingTriageBreachedKPI(valueObject.getAwaitingTriageBreachedKPI());

		return domainObject;
	}

}
