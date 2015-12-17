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
package ims.scheduling.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class Appointment_StatusVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.Appointment_StatusVo copy(ims.scheduling.vo.Appointment_StatusVo valueObjectDest, ims.scheduling.vo.Appointment_StatusVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Appointment_Status(valueObjectSrc.getID_Appointment_Status());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// StatusReason
		valueObjectDest.setStatusReason(valueObjectSrc.getStatusReason());
		// ApptDate
		valueObjectDest.setApptDate(valueObjectSrc.getApptDate());
		// ApptTime
		valueObjectDest.setApptTime(valueObjectSrc.getApptTime());
		// PASClinic
		valueObjectDest.setPASClinic(valueObjectSrc.getPASClinic());
		// DoS
		valueObjectDest.setDoS(valueObjectSrc.getDoS());
		// Priority
		valueObjectDest.setPriority(valueObjectSrc.getPriority());
		// CancellationReason
		valueObjectDest.setCancellationReason(valueObjectSrc.getCancellationReason());
		// Comment
		valueObjectDest.setComment(valueObjectSrc.getComment());
		// RebookSelected
		valueObjectDest.setRebookSelected(valueObjectSrc.getRebookSelected());
		// EarliestOfferedDate
		valueObjectDest.setEarliestOfferedDate(valueObjectSrc.getEarliestOfferedDate());
		// StatusChangeDateTime
		valueObjectDest.setStatusChangeDateTime(valueObjectSrc.getStatusChangeDateTime());
		// SysInformation
		valueObjectDest.setSysInformation(valueObjectSrc.getSysInformation());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createAppointment_StatusVoCollectionFromAppointment_Status(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Appointment_Status objects.
	 */
	public static ims.scheduling.vo.Appointment_StatusVoCollection createAppointment_StatusVoCollectionFromAppointment_Status(java.util.Set domainObjectSet)	
	{
		return createAppointment_StatusVoCollectionFromAppointment_Status(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Appointment_Status objects.
	 */
	public static ims.scheduling.vo.Appointment_StatusVoCollection createAppointment_StatusVoCollectionFromAppointment_Status(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.Appointment_StatusVoCollection voList = new ims.scheduling.vo.Appointment_StatusVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.scheduling.domain.objects.Appointment_Status domainObject = (ims.scheduling.domain.objects.Appointment_Status) iterator.next();
			ims.scheduling.vo.Appointment_StatusVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Appointment_Status objects.
	 */
	public static ims.scheduling.vo.Appointment_StatusVoCollection createAppointment_StatusVoCollectionFromAppointment_Status(java.util.List domainObjectList) 
	{
		return createAppointment_StatusVoCollectionFromAppointment_Status(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Appointment_Status objects.
	 */
	public static ims.scheduling.vo.Appointment_StatusVoCollection createAppointment_StatusVoCollectionFromAppointment_Status(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.Appointment_StatusVoCollection voList = new ims.scheduling.vo.Appointment_StatusVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.Appointment_Status domainObject = (ims.scheduling.domain.objects.Appointment_Status) domainObjectList.get(i);
			ims.scheduling.vo.Appointment_StatusVo vo = create(map, domainObject);

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
	 * Create the ims.scheduling.domain.objects.Appointment_Status set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractAppointment_StatusSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Appointment_StatusVoCollection voCollection) 
	 {
	 	return extractAppointment_StatusSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractAppointment_StatusSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Appointment_StatusVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.Appointment_StatusVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Appointment_Status domainObject = Appointment_StatusVoAssembler.extractAppointment_Status(domainFactory, vo, domMap);

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
	 * Create the ims.scheduling.domain.objects.Appointment_Status list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractAppointment_StatusList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Appointment_StatusVoCollection voCollection) 
	 {
	 	return extractAppointment_StatusList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractAppointment_StatusList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Appointment_StatusVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.Appointment_StatusVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Appointment_Status domainObject = Appointment_StatusVoAssembler.extractAppointment_Status(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.scheduling.domain.objects.Appointment_Status object.
	 * @param domainObject ims.scheduling.domain.objects.Appointment_Status
	 */
	 public static ims.scheduling.vo.Appointment_StatusVo create(ims.scheduling.domain.objects.Appointment_Status domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.scheduling.domain.objects.Appointment_Status object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.scheduling.vo.Appointment_StatusVo create(DomainObjectMap map, ims.scheduling.domain.objects.Appointment_Status domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.Appointment_StatusVo valueObject = (ims.scheduling.vo.Appointment_StatusVo) map.getValueObject(domainObject, ims.scheduling.vo.Appointment_StatusVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.Appointment_StatusVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.scheduling.domain.objects.Appointment_Status
	 */
	 public static ims.scheduling.vo.Appointment_StatusVo insert(ims.scheduling.vo.Appointment_StatusVo valueObject, ims.scheduling.domain.objects.Appointment_Status domainObject) 
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
	 * @param domainObject ims.scheduling.domain.objects.Appointment_Status
	 */
	 public static ims.scheduling.vo.Appointment_StatusVo insert(DomainObjectMap map, ims.scheduling.vo.Appointment_StatusVo valueObject, ims.scheduling.domain.objects.Appointment_Status domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Appointment_Status(domainObject.getId());
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
			
		// Status
		ims.domain.lookups.LookupInstance instance1 = domainObject.getStatus();
		if ( null != instance1 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance1.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance1.getImage().getImageId(), instance1.getImage().getImagePath());
			}
			color = instance1.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.Status_Reason voLookup1 = new ims.scheduling.vo.lookups.Status_Reason(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.scheduling.vo.lookups.Status_Reason parentVoLookup1 = voLookup1;
			ims.domain.lookups.LookupInstance parent1 = instance1.getParent();
			while (parent1 != null)
			{
				if (parent1.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent1.getImage().getImageId(), parent1.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent1.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup1.setParent(new ims.scheduling.vo.lookups.Status_Reason(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setStatus(voLookup1);
		}
				// StatusReason
		ims.domain.lookups.LookupInstance instance2 = domainObject.getStatusReason();
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

			ims.scheduling.vo.lookups.Status_Reason voLookup2 = new ims.scheduling.vo.lookups.Status_Reason(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.scheduling.vo.lookups.Status_Reason parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.scheduling.vo.lookups.Status_Reason(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setStatusReason(voLookup2);
		}
				// ApptDate
		java.util.Date ApptDate = domainObject.getApptDate();
		if ( null != ApptDate ) 
		{
			valueObject.setApptDate(new ims.framework.utils.Date(ApptDate) );
		}
		// ApptTime
		String ApptTime = domainObject.getApptTime();
		if ( null != ApptTime ) 
		{
			valueObject.setApptTime(new ims.framework.utils.Time(ApptTime) );
		}
		// PASClinic
		ims.domain.lookups.LookupInstance instance5 = domainObject.getPASClinic();
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

			ims.scheduling.vo.lookups.SchedPASClinic voLookup5 = new ims.scheduling.vo.lookups.SchedPASClinic(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.scheduling.vo.lookups.SchedPASClinic parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.scheduling.vo.lookups.SchedPASClinic(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setPASClinic(voLookup5);
		}
				// DoS
		if (domainObject.getDoS() != null)
		{
			if(domainObject.getDoS() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getDoS();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setDoS(new ims.scheduling.vo.DirectoryofServiceRefVo(id, -1));				
			}
			else
			{
				valueObject.setDoS(new ims.scheduling.vo.DirectoryofServiceRefVo(domainObject.getDoS().getId(), domainObject.getDoS().getVersion()));
			}
		}
		// Priority
		ims.domain.lookups.LookupInstance instance7 = domainObject.getPriority();
		if ( null != instance7 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance7.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance7.getImage().getImageId(), instance7.getImage().getImagePath());
			}
			color = instance7.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.SchedulingPriority voLookup7 = new ims.scheduling.vo.lookups.SchedulingPriority(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.scheduling.vo.lookups.SchedulingPriority parentVoLookup7 = voLookup7;
			ims.domain.lookups.LookupInstance parent7 = instance7.getParent();
			while (parent7 != null)
			{
				if (parent7.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent7.getImage().getImageId(), parent7.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent7.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup7.setParent(new ims.scheduling.vo.lookups.SchedulingPriority(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setPriority(voLookup7);
		}
				// CancellationReason
		ims.domain.lookups.LookupInstance instance8 = domainObject.getCancellationReason();
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

			ims.scheduling.vo.lookups.CancelAppointmentReason voLookup8 = new ims.scheduling.vo.lookups.CancelAppointmentReason(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.scheduling.vo.lookups.CancelAppointmentReason parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.scheduling.vo.lookups.CancelAppointmentReason(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setCancellationReason(voLookup8);
		}
				// Comment
		valueObject.setComment(domainObject.getComment());
		// RebookSelected
		valueObject.setRebookSelected( domainObject.isRebookSelected() );
		// EarliestOfferedDate
		java.util.Date EarliestOfferedDate = domainObject.getEarliestOfferedDate();
		if ( null != EarliestOfferedDate ) 
		{
			valueObject.setEarliestOfferedDate(new ims.framework.utils.Date(EarliestOfferedDate) );
		}
		// StatusChangeDateTime
		java.util.Date StatusChangeDateTime = domainObject.getStatusChangeDateTime();
		if ( null != StatusChangeDateTime ) 
		{
			valueObject.setStatusChangeDateTime(new ims.framework.utils.DateTime(StatusChangeDateTime) );
		}
		// SysInformation
		// set system information
		valueObject.setSysInformation(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.Appointment_Status extractAppointment_Status(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Appointment_StatusVo valueObject) 
	{
		return 	extractAppointment_Status(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.Appointment_Status extractAppointment_Status(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Appointment_StatusVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Appointment_Status();
		ims.scheduling.domain.objects.Appointment_Status domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.scheduling.domain.objects.Appointment_Status)domMap.get(valueObject);
			}
			// ims.scheduling.vo.Appointment_StatusVo ID_Appointment_Status field is unknown
			domainObject = new ims.scheduling.domain.objects.Appointment_Status();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Appointment_Status());
			if (domMap.get(key) != null)
			{
				return (ims.scheduling.domain.objects.Appointment_Status)domMap.get(key);
			}
			domainObject = (ims.scheduling.domain.objects.Appointment_Status) domainFactory.getDomainObject(ims.scheduling.domain.objects.Appointment_Status.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Appointment_Status());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getStatusReason() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getStatusReason().getID());
		}
		domainObject.setStatusReason(value2);
		java.util.Date value3 = null;
		ims.framework.utils.Date date3 = valueObject.getApptDate();		
		if ( date3 != null ) 
		{
			value3 = date3.getDate();
		}
		domainObject.setApptDate(value3);
		ims.framework.utils.Time time4 = valueObject.getApptTime();
		String value4 = null;
		if ( time4 != null ) 
		{
			value4 = time4.toString();
		}
		domainObject.setApptTime(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getPASClinic() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getPASClinic().getID());
		}
		domainObject.setPASClinic(value5);
		ims.scheduling.domain.objects.DirectoryofService value6 = null;
		if ( null != valueObject.getDoS() ) 
		{
			if (valueObject.getDoS().getBoId() == null)
			{
				if (domMap.get(valueObject.getDoS()) != null)
				{
					value6 = (ims.scheduling.domain.objects.DirectoryofService)domMap.get(valueObject.getDoS());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value6 = domainObject.getDoS();	
			}
			else
			{
				value6 = (ims.scheduling.domain.objects.DirectoryofService)domainFactory.getDomainObject(ims.scheduling.domain.objects.DirectoryofService.class, valueObject.getDoS().getBoId());
			}
		}
		domainObject.setDoS(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getPriority() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getPriority().getID());
		}
		domainObject.setPriority(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getCancellationReason() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getCancellationReason().getID());
		}
		domainObject.setCancellationReason(value8);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComment() != null && valueObject.getComment().equals(""))
		{
			valueObject.setComment(null);
		}
		domainObject.setComment(valueObject.getComment());
		domainObject.setRebookSelected(valueObject.getRebookSelected());
		java.util.Date value11 = null;
		ims.framework.utils.Date date11 = valueObject.getEarliestOfferedDate();		
		if ( date11 != null ) 
		{
			value11 = date11.getDate();
		}
		domainObject.setEarliestOfferedDate(value11);
		ims.framework.utils.DateTime dateTime12 = valueObject.getStatusChangeDateTime();
		java.util.Date value12 = null;
		if ( dateTime12 != null ) 
		{
			value12 = dateTime12.getJavaDate();
		}
		domainObject.setStatusChangeDateTime(value12);

		return domainObject;
	}

}
