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
 * @author Margaret Mc Carthy
 */
public class HistoricOutPatientAttendanceVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.HistoricOutPatientAttendanceVo copy(ims.core.vo.HistoricOutPatientAttendanceVo valueObjectDest, ims.core.vo.HistoricOutPatientAttendanceVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_HistoricOutpatientAttendance(valueObjectSrc.getID_HistoricOutpatientAttendance());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AppointmentDateTime
		valueObjectDest.setAppointmentDateTime(valueObjectSrc.getAppointmentDateTime());
		// AppointmentStatus
		valueObjectDest.setAppointmentStatus(valueObjectSrc.getAppointmentStatus());
		// CancellationReason
		valueObjectDest.setCancellationReason(valueObjectSrc.getCancellationReason());
		// pasEvent
		valueObjectDest.setPasEvent(valueObjectSrc.getPasEvent());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// clinic
		valueObjectDest.setClinic(valueObjectSrc.getClinic());
		// DateMoved
		valueObjectDest.setDateMoved(valueObjectSrc.getDateMoved());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createHistoricOutPatientAttendanceVoCollectionFromHistoricOutpatientAttendance(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.HistoricOutpatientAttendance objects.
	 */
	public static ims.core.vo.HistoricOutPatientAttendanceVoCollection createHistoricOutPatientAttendanceVoCollectionFromHistoricOutpatientAttendance(java.util.Set domainObjectSet)	
	{
		return createHistoricOutPatientAttendanceVoCollectionFromHistoricOutpatientAttendance(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.HistoricOutpatientAttendance objects.
	 */
	public static ims.core.vo.HistoricOutPatientAttendanceVoCollection createHistoricOutPatientAttendanceVoCollectionFromHistoricOutpatientAttendance(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.HistoricOutPatientAttendanceVoCollection voList = new ims.core.vo.HistoricOutPatientAttendanceVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.pas.domain.objects.HistoricOutpatientAttendance domainObject = (ims.core.admin.pas.domain.objects.HistoricOutpatientAttendance) iterator.next();
			ims.core.vo.HistoricOutPatientAttendanceVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.HistoricOutpatientAttendance objects.
	 */
	public static ims.core.vo.HistoricOutPatientAttendanceVoCollection createHistoricOutPatientAttendanceVoCollectionFromHistoricOutpatientAttendance(java.util.List domainObjectList) 
	{
		return createHistoricOutPatientAttendanceVoCollectionFromHistoricOutpatientAttendance(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.HistoricOutpatientAttendance objects.
	 */
	public static ims.core.vo.HistoricOutPatientAttendanceVoCollection createHistoricOutPatientAttendanceVoCollectionFromHistoricOutpatientAttendance(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.HistoricOutPatientAttendanceVoCollection voList = new ims.core.vo.HistoricOutPatientAttendanceVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.HistoricOutpatientAttendance domainObject = (ims.core.admin.pas.domain.objects.HistoricOutpatientAttendance) domainObjectList.get(i);
			ims.core.vo.HistoricOutPatientAttendanceVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.pas.domain.objects.HistoricOutpatientAttendance set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractHistoricOutpatientAttendanceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.HistoricOutPatientAttendanceVoCollection voCollection) 
	 {
	 	return extractHistoricOutpatientAttendanceSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractHistoricOutpatientAttendanceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.HistoricOutPatientAttendanceVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.HistoricOutPatientAttendanceVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.HistoricOutpatientAttendance domainObject = HistoricOutPatientAttendanceVoAssembler.extractHistoricOutpatientAttendance(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.pas.domain.objects.HistoricOutpatientAttendance list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractHistoricOutpatientAttendanceList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.HistoricOutPatientAttendanceVoCollection voCollection) 
	 {
	 	return extractHistoricOutpatientAttendanceList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractHistoricOutpatientAttendanceList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.HistoricOutPatientAttendanceVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.HistoricOutPatientAttendanceVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.HistoricOutpatientAttendance domainObject = HistoricOutPatientAttendanceVoAssembler.extractHistoricOutpatientAttendance(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.pas.domain.objects.HistoricOutpatientAttendance object.
	 * @param domainObject ims.core.admin.pas.domain.objects.HistoricOutpatientAttendance
	 */
	 public static ims.core.vo.HistoricOutPatientAttendanceVo create(ims.core.admin.pas.domain.objects.HistoricOutpatientAttendance domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.pas.domain.objects.HistoricOutpatientAttendance object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.HistoricOutPatientAttendanceVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.HistoricOutpatientAttendance domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.HistoricOutPatientAttendanceVo valueObject = (ims.core.vo.HistoricOutPatientAttendanceVo) map.getValueObject(domainObject, ims.core.vo.HistoricOutPatientAttendanceVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.HistoricOutPatientAttendanceVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.pas.domain.objects.HistoricOutpatientAttendance
	 */
	 public static ims.core.vo.HistoricOutPatientAttendanceVo insert(ims.core.vo.HistoricOutPatientAttendanceVo valueObject, ims.core.admin.pas.domain.objects.HistoricOutpatientAttendance domainObject) 
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
	 * @param domainObject ims.core.admin.pas.domain.objects.HistoricOutpatientAttendance
	 */
	 public static ims.core.vo.HistoricOutPatientAttendanceVo insert(DomainObjectMap map, ims.core.vo.HistoricOutPatientAttendanceVo valueObject, ims.core.admin.pas.domain.objects.HistoricOutpatientAttendance domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_HistoricOutpatientAttendance(domainObject.getId());
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
			
		// AppointmentDateTime
		java.util.Date AppointmentDateTime = domainObject.getAppointmentDateTime();
		if ( null != AppointmentDateTime ) 
		{
			valueObject.setAppointmentDateTime(new ims.framework.utils.DateTime(AppointmentDateTime) );
		}
		// AppointmentStatus
		ims.domain.lookups.LookupInstance instance2 = domainObject.getAppointmentStatus();
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
			valueObject.setAppointmentStatus(voLookup2);
		}
				// CancellationReason
		ims.domain.lookups.LookupInstance instance3 = domainObject.getCancellationReason();
		if ( null != instance3 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance3.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance3.getImage().getImageId(), instance3.getImage().getImagePath());
			}
			color = instance3.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.Status_Reason voLookup3 = new ims.scheduling.vo.lookups.Status_Reason(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.scheduling.vo.lookups.Status_Reason parentVoLookup3 = voLookup3;
			ims.domain.lookups.LookupInstance parent3 = instance3.getParent();
			while (parent3 != null)
			{
				if (parent3.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent3.getImage().getImageId(), parent3.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent3.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup3.setParent(new ims.scheduling.vo.lookups.Status_Reason(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setCancellationReason(voLookup3);
		}
				// pasEvent
		if (domainObject.getPasEvent() != null)
		{
			if(domainObject.getPasEvent() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPasEvent();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPasEvent(new ims.core.admin.pas.vo.PASEventRefVo(id, -1));				
			}
			else
			{
				valueObject.setPasEvent(new ims.core.admin.pas.vo.PASEventRefVo(domainObject.getPasEvent().getId(), domainObject.getPasEvent().getVersion()));
			}
		}
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// clinic
		if (domainObject.getClinic() != null)
		{
			if(domainObject.getClinic() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getClinic();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setClinic(new ims.core.resource.place.vo.ClinicRefVo(id, -1));				
			}
			else
			{
				valueObject.setClinic(new ims.core.resource.place.vo.ClinicRefVo(domainObject.getClinic().getId(), domainObject.getClinic().getVersion()));
			}
		}
		// DateMoved
		java.util.Date DateMoved = domainObject.getDateMoved();
		if ( null != DateMoved ) 
		{
			valueObject.setDateMoved(new ims.framework.utils.DateTime(DateMoved) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.pas.domain.objects.HistoricOutpatientAttendance extractHistoricOutpatientAttendance(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.HistoricOutPatientAttendanceVo valueObject) 
	{
		return 	extractHistoricOutpatientAttendance(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.HistoricOutpatientAttendance extractHistoricOutpatientAttendance(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.HistoricOutPatientAttendanceVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_HistoricOutpatientAttendance();
		ims.core.admin.pas.domain.objects.HistoricOutpatientAttendance domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.pas.domain.objects.HistoricOutpatientAttendance)domMap.get(valueObject);
			}
			// ims.core.vo.HistoricOutPatientAttendanceVo ID_HistoricOutpatientAttendance field is unknown
			domainObject = new ims.core.admin.pas.domain.objects.HistoricOutpatientAttendance();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_HistoricOutpatientAttendance());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.pas.domain.objects.HistoricOutpatientAttendance)domMap.get(key);
			}
			domainObject = (ims.core.admin.pas.domain.objects.HistoricOutpatientAttendance) domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.HistoricOutpatientAttendance.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_HistoricOutpatientAttendance());

		ims.framework.utils.DateTime dateTime1 = valueObject.getAppointmentDateTime();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setAppointmentDateTime(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getAppointmentStatus() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getAppointmentStatus().getID());
		}
		domainObject.setAppointmentStatus(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getCancellationReason() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getCancellationReason().getID());
		}
		domainObject.setCancellationReason(value3);
		ims.core.admin.pas.domain.objects.PASEvent value4 = null;
		if ( null != valueObject.getPasEvent() ) 
		{
			if (valueObject.getPasEvent().getBoId() == null)
			{
				if (domMap.get(valueObject.getPasEvent()) != null)
				{
					value4 = (ims.core.admin.pas.domain.objects.PASEvent)domMap.get(valueObject.getPasEvent());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getPasEvent();	
			}
			else
			{
				value4 = (ims.core.admin.pas.domain.objects.PASEvent)domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.PASEvent.class, valueObject.getPasEvent().getBoId());
			}
		}
		domainObject.setPasEvent(value4);
		domainObject.setIsActive(valueObject.getIsActive());
		ims.core.resource.place.domain.objects.Clinic value6 = null;
		if ( null != valueObject.getClinic() ) 
		{
			if (valueObject.getClinic().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinic()) != null)
				{
					value6 = (ims.core.resource.place.domain.objects.Clinic)domMap.get(valueObject.getClinic());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value6 = domainObject.getClinic();	
			}
			else
			{
				value6 = (ims.core.resource.place.domain.objects.Clinic)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Clinic.class, valueObject.getClinic().getBoId());
			}
		}
		domainObject.setClinic(value6);
		ims.framework.utils.DateTime dateTime7 = valueObject.getDateMoved();
		java.util.Date value7 = null;
		if ( dateTime7 != null ) 
		{
			value7 = dateTime7.getJavaDate();
		}
		domainObject.setDateMoved(value7);

		return domainObject;
	}

}
