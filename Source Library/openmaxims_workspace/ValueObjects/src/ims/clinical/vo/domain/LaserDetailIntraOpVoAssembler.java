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
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class LaserDetailIntraOpVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.LaserDetailIntraOpVo copy(ims.clinical.vo.LaserDetailIntraOpVo valueObjectDest, ims.clinical.vo.LaserDetailIntraOpVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_LaserDetailIntraOp(valueObjectSrc.getID_LaserDetailIntraOp());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TheatreAppointment
		valueObjectDest.setTheatreAppointment(valueObjectSrc.getTheatreAppointment());
		// DeviceName
		valueObjectDest.setDeviceName(valueObjectSrc.getDeviceName());
		// DeviceSerialNumber
		valueObjectDest.setDeviceSerialNumber(valueObjectSrc.getDeviceSerialNumber());
		// LaserFibreLotNumber
		valueObjectDest.setLaserFibreLotNumber(valueObjectSrc.getLaserFibreLotNumber());
		// LaserMode
		valueObjectDest.setLaserMode(valueObjectSrc.getLaserMode());
		// Power
		valueObjectDest.setPower(valueObjectSrc.getPower());
		// TotalDurationSeconds
		valueObjectDest.setTotalDurationSeconds(valueObjectSrc.getTotalDurationSeconds());
		// NumberOfBurns
		valueObjectDest.setNumberOfBurns(valueObjectSrc.getNumberOfBurns());
		// LaserOperator
		valueObjectDest.setLaserOperator(valueObjectSrc.getLaserOperator());
		// PatientSafetyMeasures
		valueObjectDest.setPatientSafetyMeasures(valueObjectSrc.getPatientSafetyMeasures());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createLaserDetailIntraOpVoCollectionFromLaserDetailIntraOp(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.LaserDetailIntraOp objects.
	 */
	public static ims.clinical.vo.LaserDetailIntraOpVoCollection createLaserDetailIntraOpVoCollectionFromLaserDetailIntraOp(java.util.Set domainObjectSet)	
	{
		return createLaserDetailIntraOpVoCollectionFromLaserDetailIntraOp(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.LaserDetailIntraOp objects.
	 */
	public static ims.clinical.vo.LaserDetailIntraOpVoCollection createLaserDetailIntraOpVoCollectionFromLaserDetailIntraOp(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.LaserDetailIntraOpVoCollection voList = new ims.clinical.vo.LaserDetailIntraOpVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.LaserDetailIntraOp domainObject = (ims.clinical.domain.objects.LaserDetailIntraOp) iterator.next();
			ims.clinical.vo.LaserDetailIntraOpVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.LaserDetailIntraOp objects.
	 */
	public static ims.clinical.vo.LaserDetailIntraOpVoCollection createLaserDetailIntraOpVoCollectionFromLaserDetailIntraOp(java.util.List domainObjectList) 
	{
		return createLaserDetailIntraOpVoCollectionFromLaserDetailIntraOp(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.LaserDetailIntraOp objects.
	 */
	public static ims.clinical.vo.LaserDetailIntraOpVoCollection createLaserDetailIntraOpVoCollectionFromLaserDetailIntraOp(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.LaserDetailIntraOpVoCollection voList = new ims.clinical.vo.LaserDetailIntraOpVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.LaserDetailIntraOp domainObject = (ims.clinical.domain.objects.LaserDetailIntraOp) domainObjectList.get(i);
			ims.clinical.vo.LaserDetailIntraOpVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.LaserDetailIntraOp set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractLaserDetailIntraOpSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.LaserDetailIntraOpVoCollection voCollection) 
	 {
	 	return extractLaserDetailIntraOpSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractLaserDetailIntraOpSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.LaserDetailIntraOpVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.LaserDetailIntraOpVo vo = voCollection.get(i);
			ims.clinical.domain.objects.LaserDetailIntraOp domainObject = LaserDetailIntraOpVoAssembler.extractLaserDetailIntraOp(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.LaserDetailIntraOp list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractLaserDetailIntraOpList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.LaserDetailIntraOpVoCollection voCollection) 
	 {
	 	return extractLaserDetailIntraOpList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractLaserDetailIntraOpList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.LaserDetailIntraOpVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.LaserDetailIntraOpVo vo = voCollection.get(i);
			ims.clinical.domain.objects.LaserDetailIntraOp domainObject = LaserDetailIntraOpVoAssembler.extractLaserDetailIntraOp(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.LaserDetailIntraOp object.
	 * @param domainObject ims.clinical.domain.objects.LaserDetailIntraOp
	 */
	 public static ims.clinical.vo.LaserDetailIntraOpVo create(ims.clinical.domain.objects.LaserDetailIntraOp domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.LaserDetailIntraOp object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.LaserDetailIntraOpVo create(DomainObjectMap map, ims.clinical.domain.objects.LaserDetailIntraOp domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.LaserDetailIntraOpVo valueObject = (ims.clinical.vo.LaserDetailIntraOpVo) map.getValueObject(domainObject, ims.clinical.vo.LaserDetailIntraOpVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.LaserDetailIntraOpVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.LaserDetailIntraOp
	 */
	 public static ims.clinical.vo.LaserDetailIntraOpVo insert(ims.clinical.vo.LaserDetailIntraOpVo valueObject, ims.clinical.domain.objects.LaserDetailIntraOp domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.LaserDetailIntraOp
	 */
	 public static ims.clinical.vo.LaserDetailIntraOpVo insert(DomainObjectMap map, ims.clinical.vo.LaserDetailIntraOpVo valueObject, ims.clinical.domain.objects.LaserDetailIntraOp domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_LaserDetailIntraOp(domainObject.getId());
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
			
		// TheatreAppointment
		if (domainObject.getTheatreAppointment() != null)
		{
			if(domainObject.getTheatreAppointment() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getTheatreAppointment();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setTheatreAppointment(new ims.scheduling.vo.Booking_AppointmentRefVo(id, -1));				
			}
			else
			{
				valueObject.setTheatreAppointment(new ims.scheduling.vo.Booking_AppointmentRefVo(domainObject.getTheatreAppointment().getId(), domainObject.getTheatreAppointment().getVersion()));
			}
		}
		// DeviceName
		ims.domain.lookups.LookupInstance instance2 = domainObject.getDeviceName();
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

			ims.core.vo.lookups.LaserDeviceName voLookup2 = new ims.core.vo.lookups.LaserDeviceName(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.LaserDeviceName parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.LaserDeviceName(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setDeviceName(voLookup2);
		}
				// DeviceSerialNumber
		ims.domain.lookups.LookupInstance instance3 = domainObject.getDeviceSerialNumber();
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

			ims.core.vo.lookups.LaserDeviceSerialNumber voLookup3 = new ims.core.vo.lookups.LaserDeviceSerialNumber(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.LaserDeviceSerialNumber parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.LaserDeviceSerialNumber(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setDeviceSerialNumber(voLookup3);
		}
				// LaserFibreLotNumber
		valueObject.setLaserFibreLotNumber(domainObject.getLaserFibreLotNumber());
		// LaserMode
		ims.domain.lookups.LookupInstance instance5 = domainObject.getLaserMode();
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

			ims.core.vo.lookups.LaserMode voLookup5 = new ims.core.vo.lookups.LaserMode(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.LaserMode parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.LaserMode(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setLaserMode(voLookup5);
		}
				// Power
		valueObject.setPower(domainObject.getPower());
		// TotalDurationSeconds
		valueObject.setTotalDurationSeconds(domainObject.getTotalDurationSeconds());
		// NumberOfBurns
		valueObject.setNumberOfBurns(domainObject.getNumberOfBurns());
		// LaserOperator
		valueObject.setLaserOperator(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getLaserOperator()) );
		// PatientSafetyMeasures
		java.util.List listPatientSafetyMeasures = domainObject.getPatientSafetyMeasures();
		ims.core.vo.lookups.LaserPatientSafetyMeasuresCollection PatientSafetyMeasures = new ims.core.vo.lookups.LaserPatientSafetyMeasuresCollection();
		for(java.util.Iterator iterator = listPatientSafetyMeasures.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.core.vo.lookups.LaserPatientSafetyMeasures voInstance = new ims.core.vo.lookups.LaserPatientSafetyMeasures(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.core.vo.lookups.LaserPatientSafetyMeasures parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.core.vo.lookups.LaserPatientSafetyMeasures(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			PatientSafetyMeasures.add(voInstance);
		}
		valueObject.setPatientSafetyMeasures( PatientSafetyMeasures );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.LaserDetailIntraOp extractLaserDetailIntraOp(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.LaserDetailIntraOpVo valueObject) 
	{
		return 	extractLaserDetailIntraOp(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.LaserDetailIntraOp extractLaserDetailIntraOp(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.LaserDetailIntraOpVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_LaserDetailIntraOp();
		ims.clinical.domain.objects.LaserDetailIntraOp domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.LaserDetailIntraOp)domMap.get(valueObject);
			}
			// ims.clinical.vo.LaserDetailIntraOpVo ID_LaserDetailIntraOp field is unknown
			domainObject = new ims.clinical.domain.objects.LaserDetailIntraOp();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_LaserDetailIntraOp());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.LaserDetailIntraOp)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.LaserDetailIntraOp) domainFactory.getDomainObject(ims.clinical.domain.objects.LaserDetailIntraOp.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_LaserDetailIntraOp());

		ims.scheduling.domain.objects.Booking_Appointment value1 = null;
		if ( null != valueObject.getTheatreAppointment() ) 
		{
			if (valueObject.getTheatreAppointment().getBoId() == null)
			{
				if (domMap.get(valueObject.getTheatreAppointment()) != null)
				{
					value1 = (ims.scheduling.domain.objects.Booking_Appointment)domMap.get(valueObject.getTheatreAppointment());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getTheatreAppointment();	
			}
			else
			{
				value1 = (ims.scheduling.domain.objects.Booking_Appointment)domainFactory.getDomainObject(ims.scheduling.domain.objects.Booking_Appointment.class, valueObject.getTheatreAppointment().getBoId());
			}
		}
		domainObject.setTheatreAppointment(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getDeviceName() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getDeviceName().getID());
		}
		domainObject.setDeviceName(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getDeviceSerialNumber() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getDeviceSerialNumber().getID());
		}
		domainObject.setDeviceSerialNumber(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLaserFibreLotNumber() != null && valueObject.getLaserFibreLotNumber().equals(""))
		{
			valueObject.setLaserFibreLotNumber(null);
		}
		domainObject.setLaserFibreLotNumber(valueObject.getLaserFibreLotNumber());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getLaserMode() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getLaserMode().getID());
		}
		domainObject.setLaserMode(value5);
		domainObject.setPower(valueObject.getPower());
		domainObject.setTotalDurationSeconds(valueObject.getTotalDurationSeconds());
		domainObject.setNumberOfBurns(valueObject.getNumberOfBurns());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value9 = null;
		if ( null != valueObject.getLaserOperator() ) 
		{
			if (valueObject.getLaserOperator().getBoId() == null)
			{
				if (domMap.get(valueObject.getLaserOperator()) != null)
				{
					value9 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getLaserOperator());
				}
			}
			else
			{
				value9 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getLaserOperator().getBoId());
			}
		}
		domainObject.setLaserOperator(value9);
		ims.core.vo.lookups.LaserPatientSafetyMeasuresCollection collection10 =
	valueObject.getPatientSafetyMeasures();
	    java.util.List domainPatientSafetyMeasures = domainObject.getPatientSafetyMeasures();;			
	    int collection10Size=0;
		if (collection10 == null)
		{
			domainPatientSafetyMeasures = new java.util.ArrayList(0);
		}
		else
		{
			collection10Size = collection10.size();
		}
		
		for(int i=0; i<collection10Size; i++) 
		{
			int instanceId = collection10.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainPatientSafetyMeasures.indexOf(dom);
			if (domIdx == -1)
			{
				domainPatientSafetyMeasures.add(i, dom);
			}
			else if (i != domIdx && i < domainPatientSafetyMeasures.size())
			{
				Object tmp = domainPatientSafetyMeasures.get(i);
				domainPatientSafetyMeasures.set(i, domainPatientSafetyMeasures.get(domIdx));
				domainPatientSafetyMeasures.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j10 = domainPatientSafetyMeasures.size();
		while (j10 > collection10Size)
		{
			domainPatientSafetyMeasures.remove(j10-1);
			j10 = domainPatientSafetyMeasures.size();
		}

		domainObject.setPatientSafetyMeasures(domainPatientSafetyMeasures);		

		return domainObject;
	}

}
