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
 * @author Florin Blindu
 */
public class AppointmentOutcomeConfigVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.admin.vo.AppointmentOutcomeConfigVo copy(ims.admin.vo.AppointmentOutcomeConfigVo valueObjectDest, ims.admin.vo.AppointmentOutcomeConfigVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_AppointmentOutcomeConfig(valueObjectSrc.getID_AppointmentOutcomeConfig());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AppointmentOutcomeReasons
		valueObjectDest.setAppointmentOutcomeReasons(valueObjectSrc.getAppointmentOutcomeReasons());
		// ShowFirstDefinitiveTreatment
		valueObjectDest.setShowFirstDefinitiveTreatment(valueObjectSrc.getShowFirstDefinitiveTreatment());
		// CanAddtoWaitingList
		valueObjectDest.setCanAddtoWaitingList(valueObjectSrc.getCanAddtoWaitingList());
		// CanAddtoBookedList
		valueObjectDest.setCanAddtoBookedList(valueObjectSrc.getCanAddtoBookedList());
		// CanAddtoPlannedList
		valueObjectDest.setCanAddtoPlannedList(valueObjectSrc.getCanAddtoPlannedList());
		// CanMakeAppointment
		valueObjectDest.setCanMakeAppointment(valueObjectSrc.getCanMakeAppointment());
		// CanMakeOnwardReferral
		valueObjectDest.setCanMakeOnwardReferral(valueObjectSrc.getCanMakeOnwardReferral());
		// CanTransfer
		valueObjectDest.setCanTransfer(valueObjectSrc.getCanTransfer());
		// AppointmentOutcome
		valueObjectDest.setAppointmentOutcome(valueObjectSrc.getAppointmentOutcome());
		// FirstDefinitiveTreatmentEvent
		valueObjectDest.setFirstDefinitiveTreatmentEvent(valueObjectSrc.getFirstDefinitiveTreatmentEvent());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createAppointmentOutcomeConfigVoCollectionFromAppointmentOutcomeConfig(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.pathways.configuration.domain.objects.AppointmentOutcomeConfig objects.
	 */
	public static ims.admin.vo.AppointmentOutcomeConfigVoCollection createAppointmentOutcomeConfigVoCollectionFromAppointmentOutcomeConfig(java.util.Set domainObjectSet)	
	{
		return createAppointmentOutcomeConfigVoCollectionFromAppointmentOutcomeConfig(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.pathways.configuration.domain.objects.AppointmentOutcomeConfig objects.
	 */
	public static ims.admin.vo.AppointmentOutcomeConfigVoCollection createAppointmentOutcomeConfigVoCollectionFromAppointmentOutcomeConfig(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.admin.vo.AppointmentOutcomeConfigVoCollection voList = new ims.admin.vo.AppointmentOutcomeConfigVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.pathways.configuration.domain.objects.AppointmentOutcomeConfig domainObject = (ims.pathways.configuration.domain.objects.AppointmentOutcomeConfig) iterator.next();
			ims.admin.vo.AppointmentOutcomeConfigVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.pathways.configuration.domain.objects.AppointmentOutcomeConfig objects.
	 */
	public static ims.admin.vo.AppointmentOutcomeConfigVoCollection createAppointmentOutcomeConfigVoCollectionFromAppointmentOutcomeConfig(java.util.List domainObjectList) 
	{
		return createAppointmentOutcomeConfigVoCollectionFromAppointmentOutcomeConfig(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.pathways.configuration.domain.objects.AppointmentOutcomeConfig objects.
	 */
	public static ims.admin.vo.AppointmentOutcomeConfigVoCollection createAppointmentOutcomeConfigVoCollectionFromAppointmentOutcomeConfig(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.admin.vo.AppointmentOutcomeConfigVoCollection voList = new ims.admin.vo.AppointmentOutcomeConfigVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.pathways.configuration.domain.objects.AppointmentOutcomeConfig domainObject = (ims.pathways.configuration.domain.objects.AppointmentOutcomeConfig) domainObjectList.get(i);
			ims.admin.vo.AppointmentOutcomeConfigVo vo = create(map, domainObject);

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
	 * Create the ims.pathways.configuration.domain.objects.AppointmentOutcomeConfig set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractAppointmentOutcomeConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.AppointmentOutcomeConfigVoCollection voCollection) 
	 {
	 	return extractAppointmentOutcomeConfigSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractAppointmentOutcomeConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.AppointmentOutcomeConfigVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.AppointmentOutcomeConfigVo vo = voCollection.get(i);
			ims.pathways.configuration.domain.objects.AppointmentOutcomeConfig domainObject = AppointmentOutcomeConfigVoAssembler.extractAppointmentOutcomeConfig(domainFactory, vo, domMap);

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
	 * Create the ims.pathways.configuration.domain.objects.AppointmentOutcomeConfig list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractAppointmentOutcomeConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.AppointmentOutcomeConfigVoCollection voCollection) 
	 {
	 	return extractAppointmentOutcomeConfigList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractAppointmentOutcomeConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.AppointmentOutcomeConfigVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.AppointmentOutcomeConfigVo vo = voCollection.get(i);
			ims.pathways.configuration.domain.objects.AppointmentOutcomeConfig domainObject = AppointmentOutcomeConfigVoAssembler.extractAppointmentOutcomeConfig(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.pathways.configuration.domain.objects.AppointmentOutcomeConfig object.
	 * @param domainObject ims.pathways.configuration.domain.objects.AppointmentOutcomeConfig
	 */
	 public static ims.admin.vo.AppointmentOutcomeConfigVo create(ims.pathways.configuration.domain.objects.AppointmentOutcomeConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.pathways.configuration.domain.objects.AppointmentOutcomeConfig object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.admin.vo.AppointmentOutcomeConfigVo create(DomainObjectMap map, ims.pathways.configuration.domain.objects.AppointmentOutcomeConfig domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.admin.vo.AppointmentOutcomeConfigVo valueObject = (ims.admin.vo.AppointmentOutcomeConfigVo) map.getValueObject(domainObject, ims.admin.vo.AppointmentOutcomeConfigVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.admin.vo.AppointmentOutcomeConfigVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.pathways.configuration.domain.objects.AppointmentOutcomeConfig
	 */
	 public static ims.admin.vo.AppointmentOutcomeConfigVo insert(ims.admin.vo.AppointmentOutcomeConfigVo valueObject, ims.pathways.configuration.domain.objects.AppointmentOutcomeConfig domainObject) 
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
	 * @param domainObject ims.pathways.configuration.domain.objects.AppointmentOutcomeConfig
	 */
	 public static ims.admin.vo.AppointmentOutcomeConfigVo insert(DomainObjectMap map, ims.admin.vo.AppointmentOutcomeConfigVo valueObject, ims.pathways.configuration.domain.objects.AppointmentOutcomeConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_AppointmentOutcomeConfig(domainObject.getId());
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
			
		// AppointmentOutcomeReasons
		valueObject.setAppointmentOutcomeReasons(ims.admin.vo.domain.AppointmentOutcomeReasonVoAssembler.createAppointmentOutcomeReasonVoCollectionFromAppointmentOutcomeReasons(map, domainObject.getAppointmentOutcomeReasons()) );
		// ShowFirstDefinitiveTreatment
		valueObject.setShowFirstDefinitiveTreatment( domainObject.isShowFirstDefinitiveTreatment() );
		// CanAddtoWaitingList
		valueObject.setCanAddtoWaitingList( domainObject.isCanAddtoWaitingList() );
		// CanAddtoBookedList
		valueObject.setCanAddtoBookedList( domainObject.isCanAddtoBookedList() );
		// CanAddtoPlannedList
		valueObject.setCanAddtoPlannedList( domainObject.isCanAddtoPlannedList() );
		// CanMakeAppointment
		valueObject.setCanMakeAppointment( domainObject.isCanMakeAppointment() );
		// CanMakeOnwardReferral
		valueObject.setCanMakeOnwardReferral( domainObject.isCanMakeOnwardReferral() );
		// CanTransfer
		valueObject.setCanTransfer( domainObject.isCanTransfer() );
		// AppointmentOutcome
		ims.domain.lookups.LookupInstance instance9 = domainObject.getAppointmentOutcome();
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

			ims.scheduling.vo.lookups.ApptOutcome voLookup9 = new ims.scheduling.vo.lookups.ApptOutcome(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.scheduling.vo.lookups.ApptOutcome parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.scheduling.vo.lookups.ApptOutcome(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setAppointmentOutcome(voLookup9);
		}
				// FirstDefinitiveTreatmentEvent
		valueObject.setFirstDefinitiveTreatmentEvent(ims.pathways.vo.domain.EventLiteVoAssembler.create(map, domainObject.getFirstDefinitiveTreatmentEvent()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.pathways.configuration.domain.objects.AppointmentOutcomeConfig extractAppointmentOutcomeConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.AppointmentOutcomeConfigVo valueObject) 
	{
		return 	extractAppointmentOutcomeConfig(domainFactory, valueObject, new HashMap());
	}

	public static ims.pathways.configuration.domain.objects.AppointmentOutcomeConfig extractAppointmentOutcomeConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.AppointmentOutcomeConfigVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_AppointmentOutcomeConfig();
		ims.pathways.configuration.domain.objects.AppointmentOutcomeConfig domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.pathways.configuration.domain.objects.AppointmentOutcomeConfig)domMap.get(valueObject);
			}
			// ims.admin.vo.AppointmentOutcomeConfigVo ID_AppointmentOutcomeConfig field is unknown
			domainObject = new ims.pathways.configuration.domain.objects.AppointmentOutcomeConfig();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_AppointmentOutcomeConfig());
			if (domMap.get(key) != null)
			{
				return (ims.pathways.configuration.domain.objects.AppointmentOutcomeConfig)domMap.get(key);
			}
			domainObject = (ims.pathways.configuration.domain.objects.AppointmentOutcomeConfig) domainFactory.getDomainObject(ims.pathways.configuration.domain.objects.AppointmentOutcomeConfig.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_AppointmentOutcomeConfig());

		domainObject.setAppointmentOutcomeReasons(ims.admin.vo.domain.AppointmentOutcomeReasonVoAssembler.extractAppointmentOutcomeReasonsList(domainFactory, valueObject.getAppointmentOutcomeReasons(), domainObject.getAppointmentOutcomeReasons(), domMap));		
		domainObject.setShowFirstDefinitiveTreatment(valueObject.getShowFirstDefinitiveTreatment());
		domainObject.setCanAddtoWaitingList(valueObject.getCanAddtoWaitingList());
		domainObject.setCanAddtoBookedList(valueObject.getCanAddtoBookedList());
		domainObject.setCanAddtoPlannedList(valueObject.getCanAddtoPlannedList());
		domainObject.setCanMakeAppointment(valueObject.getCanMakeAppointment());
		domainObject.setCanMakeOnwardReferral(valueObject.getCanMakeOnwardReferral());
		domainObject.setCanTransfer(valueObject.getCanTransfer());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getAppointmentOutcome() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getAppointmentOutcome().getID());
		}
		domainObject.setAppointmentOutcome(value9);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.pathways.configuration.domain.objects.Event value10 = null;
		if ( null != valueObject.getFirstDefinitiveTreatmentEvent() ) 
		{
			if (valueObject.getFirstDefinitiveTreatmentEvent().getBoId() == null)
			{
				if (domMap.get(valueObject.getFirstDefinitiveTreatmentEvent()) != null)
				{
					value10 = (ims.pathways.configuration.domain.objects.Event)domMap.get(valueObject.getFirstDefinitiveTreatmentEvent());
				}
			}
			else
			{
				value10 = (ims.pathways.configuration.domain.objects.Event)domainFactory.getDomainObject(ims.pathways.configuration.domain.objects.Event.class, valueObject.getFirstDefinitiveTreatmentEvent().getBoId());
			}
		}
		domainObject.setFirstDefinitiveTreatmentEvent(value10);

		return domainObject;
	}

}
