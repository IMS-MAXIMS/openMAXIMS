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
 * Generated on 12/10/2015, 13:25
 *
 */
package ims.pci.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author George Cristian Josan
 */
public class ClientScheduleStageVaccineVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.pci.vo.ClientScheduleStageVaccineVo copy(ims.pci.vo.ClientScheduleStageVaccineVo valueObjectDest, ims.pci.vo.ClientScheduleStageVaccineVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ClientScheduleStageVaccine(valueObjectSrc.getID_ClientScheduleStageVaccine());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// StageVaccine
		valueObjectDest.setStageVaccine(valueObjectSrc.getStageVaccine());
		// ScheduledDate
		valueObjectDest.setScheduledDate(valueObjectSrc.getScheduledDate());
		// DeliveredDate
		valueObjectDest.setDeliveredDate(valueObjectSrc.getDeliveredDate());
		// TerminatedDate
		valueObjectDest.setTerminatedDate(valueObjectSrc.getTerminatedDate());
		// VaccineManufacturer
		valueObjectDest.setVaccineManufacturer(valueObjectSrc.getVaccineManufacturer());
		// ExpiryDate
		valueObjectDest.setExpiryDate(valueObjectSrc.getExpiryDate());
		// BatchNumber
		valueObjectDest.setBatchNumber(valueObjectSrc.getBatchNumber());
		// PaymentType
		valueObjectDest.setPaymentType(valueObjectSrc.getPaymentType());
		// DeliveredByMedic
		valueObjectDest.setDeliveredByMedic(valueObjectSrc.getDeliveredByMedic());
		// DeliveredByGp
		valueObjectDest.setDeliveredByGp(valueObjectSrc.getDeliveredByGp());
		// PaymentGp
		valueObjectDest.setPaymentGp(valueObjectSrc.getPaymentGp());
		// TerminatedBy
		valueObjectDest.setTerminatedBy(valueObjectSrc.getTerminatedBy());
		// TerminationReason
		valueObjectDest.setTerminationReason(valueObjectSrc.getTerminationReason());
		// IsDeleted
		valueObjectDest.setIsDeleted(valueObjectSrc.getIsDeleted());
		// isExtracted
		valueObjectDest.setIsExtracted(valueObjectSrc.getIsExtracted());
		// ScheduleType
		valueObjectDest.setScheduleType(valueObjectSrc.getScheduleType());
		// PersonRecordingDelivery
		valueObjectDest.setPersonRecordingDelivery(valueObjectSrc.getPersonRecordingDelivery());
		// isCancelled
		valueObjectDest.setIsCancelled(valueObjectSrc.getIsCancelled());
		// CancelledBy
		valueObjectDest.setCancelledBy(valueObjectSrc.getCancelledBy());
		// CancellationReason
		valueObjectDest.setCancellationReason(valueObjectSrc.getCancellationReason());
		// CancellationDateTime
		valueObjectDest.setCancellationDateTime(valueObjectSrc.getCancellationDateTime());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createClientScheduleStageVaccineVoCollectionFromClientScheduleStageVaccine(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.pci.domain.objects.ClientScheduleStageVaccine objects.
	 */
	public static ims.pci.vo.ClientScheduleStageVaccineVoCollection createClientScheduleStageVaccineVoCollectionFromClientScheduleStageVaccine(java.util.Set domainObjectSet)	
	{
		return createClientScheduleStageVaccineVoCollectionFromClientScheduleStageVaccine(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.pci.domain.objects.ClientScheduleStageVaccine objects.
	 */
	public static ims.pci.vo.ClientScheduleStageVaccineVoCollection createClientScheduleStageVaccineVoCollectionFromClientScheduleStageVaccine(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.pci.vo.ClientScheduleStageVaccineVoCollection voList = new ims.pci.vo.ClientScheduleStageVaccineVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.pci.domain.objects.ClientScheduleStageVaccine domainObject = (ims.pci.domain.objects.ClientScheduleStageVaccine) iterator.next();
			ims.pci.vo.ClientScheduleStageVaccineVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.pci.domain.objects.ClientScheduleStageVaccine objects.
	 */
	public static ims.pci.vo.ClientScheduleStageVaccineVoCollection createClientScheduleStageVaccineVoCollectionFromClientScheduleStageVaccine(java.util.List domainObjectList) 
	{
		return createClientScheduleStageVaccineVoCollectionFromClientScheduleStageVaccine(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.pci.domain.objects.ClientScheduleStageVaccine objects.
	 */
	public static ims.pci.vo.ClientScheduleStageVaccineVoCollection createClientScheduleStageVaccineVoCollectionFromClientScheduleStageVaccine(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.pci.vo.ClientScheduleStageVaccineVoCollection voList = new ims.pci.vo.ClientScheduleStageVaccineVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.pci.domain.objects.ClientScheduleStageVaccine domainObject = (ims.pci.domain.objects.ClientScheduleStageVaccine) domainObjectList.get(i);
			ims.pci.vo.ClientScheduleStageVaccineVo vo = create(map, domainObject);

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
	 * Create the ims.pci.domain.objects.ClientScheduleStageVaccine set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractClientScheduleStageVaccineSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ClientScheduleStageVaccineVoCollection voCollection) 
	 {
	 	return extractClientScheduleStageVaccineSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractClientScheduleStageVaccineSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ClientScheduleStageVaccineVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.pci.vo.ClientScheduleStageVaccineVo vo = voCollection.get(i);
			ims.pci.domain.objects.ClientScheduleStageVaccine domainObject = ClientScheduleStageVaccineVoAssembler.extractClientScheduleStageVaccine(domainFactory, vo, domMap);

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
	 * Create the ims.pci.domain.objects.ClientScheduleStageVaccine list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractClientScheduleStageVaccineList(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ClientScheduleStageVaccineVoCollection voCollection) 
	 {
	 	return extractClientScheduleStageVaccineList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractClientScheduleStageVaccineList(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ClientScheduleStageVaccineVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.pci.vo.ClientScheduleStageVaccineVo vo = voCollection.get(i);
			ims.pci.domain.objects.ClientScheduleStageVaccine domainObject = ClientScheduleStageVaccineVoAssembler.extractClientScheduleStageVaccine(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.pci.domain.objects.ClientScheduleStageVaccine object.
	 * @param domainObject ims.pci.domain.objects.ClientScheduleStageVaccine
	 */
	 public static ims.pci.vo.ClientScheduleStageVaccineVo create(ims.pci.domain.objects.ClientScheduleStageVaccine domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.pci.domain.objects.ClientScheduleStageVaccine object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.pci.vo.ClientScheduleStageVaccineVo create(DomainObjectMap map, ims.pci.domain.objects.ClientScheduleStageVaccine domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.pci.vo.ClientScheduleStageVaccineVo valueObject = (ims.pci.vo.ClientScheduleStageVaccineVo) map.getValueObject(domainObject, ims.pci.vo.ClientScheduleStageVaccineVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.pci.vo.ClientScheduleStageVaccineVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.pci.domain.objects.ClientScheduleStageVaccine
	 */
	 public static ims.pci.vo.ClientScheduleStageVaccineVo insert(ims.pci.vo.ClientScheduleStageVaccineVo valueObject, ims.pci.domain.objects.ClientScheduleStageVaccine domainObject) 
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
	 * @param domainObject ims.pci.domain.objects.ClientScheduleStageVaccine
	 */
	 public static ims.pci.vo.ClientScheduleStageVaccineVo insert(DomainObjectMap map, ims.pci.vo.ClientScheduleStageVaccineVo valueObject, ims.pci.domain.objects.ClientScheduleStageVaccine domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ClientScheduleStageVaccine(domainObject.getId());
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
			
		// StageVaccine
		valueObject.setStageVaccine(ims.pci.vo.domain.StageVaccineVoAssembler.create(map, domainObject.getStageVaccine()) );
		// ScheduledDate
		java.util.Date ScheduledDate = domainObject.getScheduledDate();
		if ( null != ScheduledDate ) 
		{
			valueObject.setScheduledDate(new ims.framework.utils.Date(ScheduledDate) );
		}
		// DeliveredDate
		java.util.Date DeliveredDate = domainObject.getDeliveredDate();
		if ( null != DeliveredDate ) 
		{
			valueObject.setDeliveredDate(new ims.framework.utils.Date(DeliveredDate) );
		}
		// TerminatedDate
		java.util.Date TerminatedDate = domainObject.getTerminatedDate();
		if ( null != TerminatedDate ) 
		{
			valueObject.setTerminatedDate(new ims.framework.utils.Date(TerminatedDate) );
		}
		// VaccineManufacturer
		ims.domain.lookups.LookupInstance instance5 = domainObject.getVaccineManufacturer();
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

			ims.clinical.vo.lookups.VaccineManufacturer voLookup5 = new ims.clinical.vo.lookups.VaccineManufacturer(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.clinical.vo.lookups.VaccineManufacturer parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.clinical.vo.lookups.VaccineManufacturer(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setVaccineManufacturer(voLookup5);
		}
				// ExpiryDate
		java.util.Date ExpiryDate = domainObject.getExpiryDate();
		if ( null != ExpiryDate ) 
		{
			valueObject.setExpiryDate(new ims.framework.utils.Date(ExpiryDate) );
		}
		// BatchNumber
		valueObject.setBatchNumber(domainObject.getBatchNumber());
		// PaymentType
		ims.domain.lookups.LookupInstance instance8 = domainObject.getPaymentType();
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

			ims.pci.vo.lookups.PaymentType voLookup8 = new ims.pci.vo.lookups.PaymentType(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.pci.vo.lookups.PaymentType parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.pci.vo.lookups.PaymentType(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setPaymentType(voLookup8);
		}
				// DeliveredByMedic
		valueObject.setDeliveredByMedic(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getDeliveredByMedic()) );
		// DeliveredByGp
		valueObject.setDeliveredByGp(ims.core.vo.domain.GpShortVoAssembler.create(map, domainObject.getDeliveredByGp()) );
		// PaymentGp
		valueObject.setPaymentGp(ims.core.vo.domain.GpShortVoAssembler.create(map, domainObject.getPaymentGp()) );
		// TerminatedBy
		ims.domain.lookups.LookupInstance instance12 = domainObject.getTerminatedBy();
		if ( null != instance12 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance12.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance12.getImage().getImageId(), instance12.getImage().getImagePath());
			}
			color = instance12.getColor();
			if (color != null) 
				color.getValue();

			ims.pci.vo.lookups.TerminatedBy voLookup12 = new ims.pci.vo.lookups.TerminatedBy(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.pci.vo.lookups.TerminatedBy parentVoLookup12 = voLookup12;
			ims.domain.lookups.LookupInstance parent12 = instance12.getParent();
			while (parent12 != null)
			{
				if (parent12.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent12.getImage().getImageId(), parent12.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent12.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup12.setParent(new ims.pci.vo.lookups.TerminatedBy(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setTerminatedBy(voLookup12);
		}
				// TerminationReason
		ims.domain.lookups.LookupInstance instance13 = domainObject.getTerminationReason();
		if ( null != instance13 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance13.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance13.getImage().getImageId(), instance13.getImage().getImagePath());
			}
			color = instance13.getColor();
			if (color != null) 
				color.getValue();

			ims.pci.vo.lookups.TerminationReason voLookup13 = new ims.pci.vo.lookups.TerminationReason(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.pci.vo.lookups.TerminationReason parentVoLookup13 = voLookup13;
			ims.domain.lookups.LookupInstance parent13 = instance13.getParent();
			while (parent13 != null)
			{
				if (parent13.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent13.getImage().getImageId(), parent13.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent13.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup13.setParent(new ims.pci.vo.lookups.TerminationReason(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setTerminationReason(voLookup13);
		}
				// IsDeleted
		valueObject.setIsDeleted( domainObject.isIsDeleted() );
		// isExtracted
		valueObject.setIsExtracted( domainObject.isIsExtracted() );
		// ScheduleType
		ims.domain.lookups.LookupInstance instance16 = domainObject.getScheduleType();
		if ( null != instance16 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance16.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance16.getImage().getImageId(), instance16.getImage().getImagePath());
			}
			color = instance16.getColor();
			if (color != null) 
				color.getValue();

			ims.pci.vo.lookups.ScheduleType voLookup16 = new ims.pci.vo.lookups.ScheduleType(instance16.getId(),instance16.getText(), instance16.isActive(), null, img, color);
			ims.pci.vo.lookups.ScheduleType parentVoLookup16 = voLookup16;
			ims.domain.lookups.LookupInstance parent16 = instance16.getParent();
			while (parent16 != null)
			{
				if (parent16.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent16.getImage().getImageId(), parent16.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent16.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup16.setParent(new ims.pci.vo.lookups.ScheduleType(parent16.getId(),parent16.getText(), parent16.isActive(), null, img, color));
				parentVoLookup16 = parentVoLookup16.getParent();
								parent16 = parent16.getParent();
			}			
			valueObject.setScheduleType(voLookup16);
		}
				// PersonRecordingDelivery
		valueObject.setPersonRecordingDelivery(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getPersonRecordingDelivery()) );
		// isCancelled
		valueObject.setIsCancelled( domainObject.isIsCancelled() );
		// CancelledBy
		if (domainObject.getCancelledBy() != null)
		{
			if(domainObject.getCancelledBy() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCancelledBy();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCancelledBy(new ims.core.resource.people.vo.MemberOfStaffRefVo(id, -1));				
			}
			else
			{
				valueObject.setCancelledBy(new ims.core.resource.people.vo.MemberOfStaffRefVo(domainObject.getCancelledBy().getId(), domainObject.getCancelledBy().getVersion()));
			}
		}
		// CancellationReason
		ims.domain.lookups.LookupInstance instance20 = domainObject.getCancellationReason();
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

			ims.pci.vo.lookups.VaccineCancellationReason voLookup20 = new ims.pci.vo.lookups.VaccineCancellationReason(instance20.getId(),instance20.getText(), instance20.isActive(), null, img, color);
			ims.pci.vo.lookups.VaccineCancellationReason parentVoLookup20 = voLookup20;
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
								parentVoLookup20.setParent(new ims.pci.vo.lookups.VaccineCancellationReason(parent20.getId(),parent20.getText(), parent20.isActive(), null, img, color));
				parentVoLookup20 = parentVoLookup20.getParent();
								parent20 = parent20.getParent();
			}			
			valueObject.setCancellationReason(voLookup20);
		}
				// CancellationDateTime
		java.util.Date CancellationDateTime = domainObject.getCancellationDateTime();
		if ( null != CancellationDateTime ) 
		{
			valueObject.setCancellationDateTime(new ims.framework.utils.DateTime(CancellationDateTime) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.pci.domain.objects.ClientScheduleStageVaccine extractClientScheduleStageVaccine(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ClientScheduleStageVaccineVo valueObject) 
	{
		return 	extractClientScheduleStageVaccine(domainFactory, valueObject, new HashMap());
	}

	public static ims.pci.domain.objects.ClientScheduleStageVaccine extractClientScheduleStageVaccine(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ClientScheduleStageVaccineVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ClientScheduleStageVaccine();
		ims.pci.domain.objects.ClientScheduleStageVaccine domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.pci.domain.objects.ClientScheduleStageVaccine)domMap.get(valueObject);
			}
			// ims.pci.vo.ClientScheduleStageVaccineVo ID_ClientScheduleStageVaccine field is unknown
			domainObject = new ims.pci.domain.objects.ClientScheduleStageVaccine();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ClientScheduleStageVaccine());
			if (domMap.get(key) != null)
			{
				return (ims.pci.domain.objects.ClientScheduleStageVaccine)domMap.get(key);
			}
			domainObject = (ims.pci.domain.objects.ClientScheduleStageVaccine) domainFactory.getDomainObject(ims.pci.domain.objects.ClientScheduleStageVaccine.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ClientScheduleStageVaccine());

		domainObject.setStageVaccine(ims.pci.vo.domain.StageVaccineVoAssembler.extractStageVaccine(domainFactory, valueObject.getStageVaccine(), domMap));
		java.util.Date value2 = null;
		ims.framework.utils.Date date2 = valueObject.getScheduledDate();		
		if ( date2 != null ) 
		{
			value2 = date2.getDate();
		}
		domainObject.setScheduledDate(value2);
		java.util.Date value3 = null;
		ims.framework.utils.Date date3 = valueObject.getDeliveredDate();		
		if ( date3 != null ) 
		{
			value3 = date3.getDate();
		}
		domainObject.setDeliveredDate(value3);
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getTerminatedDate();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setTerminatedDate(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getVaccineManufacturer() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getVaccineManufacturer().getID());
		}
		domainObject.setVaccineManufacturer(value5);
		java.util.Date value6 = null;
		ims.framework.utils.Date date6 = valueObject.getExpiryDate();		
		if ( date6 != null ) 
		{
			value6 = date6.getDate();
		}
		domainObject.setExpiryDate(value6);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getBatchNumber() != null && valueObject.getBatchNumber().equals(""))
		{
			valueObject.setBatchNumber(null);
		}
		domainObject.setBatchNumber(valueObject.getBatchNumber());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getPaymentType() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getPaymentType().getID());
		}
		domainObject.setPaymentType(value8);
		domainObject.setDeliveredByMedic(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getDeliveredByMedic(), domMap));
		domainObject.setDeliveredByGp(ims.core.vo.domain.GpShortVoAssembler.extractGp(domainFactory, valueObject.getDeliveredByGp(), domMap));
		domainObject.setPaymentGp(ims.core.vo.domain.GpShortVoAssembler.extractGp(domainFactory, valueObject.getPaymentGp(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getTerminatedBy() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getTerminatedBy().getID());
		}
		domainObject.setTerminatedBy(value12);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getTerminationReason() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getTerminationReason().getID());
		}
		domainObject.setTerminationReason(value13);
		domainObject.setIsDeleted(valueObject.getIsDeleted());
		domainObject.setIsExtracted(valueObject.getIsExtracted());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getScheduleType() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getScheduleType().getID());
		}
		domainObject.setScheduleType(value16);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value17 = null;
		if ( null != valueObject.getPersonRecordingDelivery() ) 
		{
			if (valueObject.getPersonRecordingDelivery().getBoId() == null)
			{
				if (domMap.get(valueObject.getPersonRecordingDelivery()) != null)
				{
					value17 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getPersonRecordingDelivery());
				}
			}
			else
			{
				value17 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getPersonRecordingDelivery().getBoId());
			}
		}
		domainObject.setPersonRecordingDelivery(value17);
		domainObject.setIsCancelled(valueObject.getIsCancelled());
		ims.core.resource.people.domain.objects.MemberOfStaff value19 = null;
		if ( null != valueObject.getCancelledBy() ) 
		{
			if (valueObject.getCancelledBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getCancelledBy()) != null)
				{
					value19 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getCancelledBy());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value19 = domainObject.getCancelledBy();	
			}
			else
			{
				value19 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getCancelledBy().getBoId());
			}
		}
		domainObject.setCancelledBy(value19);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value20 = null;
		if ( null != valueObject.getCancellationReason() ) 
		{
			value20 =
				domainFactory.getLookupInstance(valueObject.getCancellationReason().getID());
		}
		domainObject.setCancellationReason(value20);
		ims.framework.utils.DateTime dateTime21 = valueObject.getCancellationDateTime();
		java.util.Date value21 = null;
		if ( dateTime21 != null ) 
		{
			value21 = dateTime21.getJavaDate();
		}
		domainObject.setCancellationDateTime(value21);

		return domainObject;
	}

}
