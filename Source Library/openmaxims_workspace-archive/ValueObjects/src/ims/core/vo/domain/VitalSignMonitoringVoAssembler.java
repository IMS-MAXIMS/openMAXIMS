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
 * Generated on 16/04/2014, 12:32
 *
 */
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Callum Wells
 */
public class VitalSignMonitoringVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.VitalSignMonitoringVo copy(ims.core.vo.VitalSignMonitoringVo valueObjectDest, ims.core.vo.VitalSignMonitoringVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_VitalSignsMonitoring(valueObjectSrc.getID_VitalSignsMonitoring());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// VitalSignGroup
		valueObjectDest.setVitalSignGroup(valueObjectSrc.getVitalSignGroup());
		// GroupFrequency
		valueObjectDest.setGroupFrequency(valueObjectSrc.getGroupFrequency());
		// StartDateTime
		valueObjectDest.setStartDateTime(valueObjectSrc.getStartDateTime());
		// DurationValue
		valueObjectDest.setDurationValue(valueObjectSrc.getDurationValue());
		// DurationUnit
		valueObjectDest.setDurationUnit(valueObjectSrc.getDurationUnit());
		// RequestedBy
		valueObjectDest.setRequestedBy(valueObjectSrc.getRequestedBy());
		// RequestDetails
		valueObjectDest.setRequestDetails(valueObjectSrc.getRequestDetails());
		// StoppedBy
		valueObjectDest.setStoppedBy(valueObjectSrc.getStoppedBy());
		// StoppedDateTime
		valueObjectDest.setStoppedDateTime(valueObjectSrc.getStoppedDateTime());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// ItemFrequency
		valueObjectDest.setItemFrequency(valueObjectSrc.getItemFrequency());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createVitalSignMonitoringVoCollectionFromVitalSignsMonitoring(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.VitalSignsMonitoring objects.
	 */
	public static ims.core.vo.VitalSignMonitoringVoCollection createVitalSignMonitoringVoCollectionFromVitalSignsMonitoring(java.util.Set domainObjectSet)	
	{
		return createVitalSignMonitoringVoCollectionFromVitalSignsMonitoring(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.VitalSignsMonitoring objects.
	 */
	public static ims.core.vo.VitalSignMonitoringVoCollection createVitalSignMonitoringVoCollectionFromVitalSignsMonitoring(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.VitalSignMonitoringVoCollection voList = new ims.core.vo.VitalSignMonitoringVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.VitalSignsMonitoring domainObject = (ims.core.clinical.domain.objects.VitalSignsMonitoring) iterator.next();
			ims.core.vo.VitalSignMonitoringVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.VitalSignsMonitoring objects.
	 */
	public static ims.core.vo.VitalSignMonitoringVoCollection createVitalSignMonitoringVoCollectionFromVitalSignsMonitoring(java.util.List domainObjectList) 
	{
		return createVitalSignMonitoringVoCollectionFromVitalSignsMonitoring(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.VitalSignsMonitoring objects.
	 */
	public static ims.core.vo.VitalSignMonitoringVoCollection createVitalSignMonitoringVoCollectionFromVitalSignsMonitoring(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.VitalSignMonitoringVoCollection voList = new ims.core.vo.VitalSignMonitoringVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.VitalSignsMonitoring domainObject = (ims.core.clinical.domain.objects.VitalSignsMonitoring) domainObjectList.get(i);
			ims.core.vo.VitalSignMonitoringVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.VitalSignsMonitoring set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractVitalSignsMonitoringSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VitalSignMonitoringVoCollection voCollection) 
	 {
	 	return extractVitalSignsMonitoringSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractVitalSignsMonitoringSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VitalSignMonitoringVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.VitalSignMonitoringVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.VitalSignsMonitoring domainObject = VitalSignMonitoringVoAssembler.extractVitalSignsMonitoring(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.VitalSignsMonitoring list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractVitalSignsMonitoringList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VitalSignMonitoringVoCollection voCollection) 
	 {
	 	return extractVitalSignsMonitoringList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractVitalSignsMonitoringList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VitalSignMonitoringVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.VitalSignMonitoringVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.VitalSignsMonitoring domainObject = VitalSignMonitoringVoAssembler.extractVitalSignsMonitoring(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.VitalSignsMonitoring object.
	 * @param domainObject ims.core.clinical.domain.objects.VitalSignsMonitoring
	 */
	 public static ims.core.vo.VitalSignMonitoringVo create(ims.core.clinical.domain.objects.VitalSignsMonitoring domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.VitalSignsMonitoring object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.VitalSignMonitoringVo create(DomainObjectMap map, ims.core.clinical.domain.objects.VitalSignsMonitoring domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.VitalSignMonitoringVo valueObject = (ims.core.vo.VitalSignMonitoringVo) map.getValueObject(domainObject, ims.core.vo.VitalSignMonitoringVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.VitalSignMonitoringVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.VitalSignsMonitoring
	 */
	 public static ims.core.vo.VitalSignMonitoringVo insert(ims.core.vo.VitalSignMonitoringVo valueObject, ims.core.clinical.domain.objects.VitalSignsMonitoring domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.VitalSignsMonitoring
	 */
	 public static ims.core.vo.VitalSignMonitoringVo insert(DomainObjectMap map, ims.core.vo.VitalSignMonitoringVo valueObject, ims.core.clinical.domain.objects.VitalSignsMonitoring domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_VitalSignsMonitoring(domainObject.getId());
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
			
		// ClinicalContact
		if (domainObject.getClinicalContact() != null)
		{
			if(domainObject.getClinicalContact() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getClinicalContact();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(id, -1));				
			}
			else
			{
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(domainObject.getClinicalContact().getId(), domainObject.getClinicalContact().getVersion()));
			}
		}
		// CareContext
		if (domainObject.getCareContext() != null)
		{
			if(domainObject.getCareContext() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCareContext();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(id, -1));				
			}
			else
			{
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(domainObject.getCareContext().getId(), domainObject.getCareContext().getVersion()));
			}
		}
		// VitalSignGroup
		valueObject.setVitalSignGroup(ims.core.vo.domain.VitalSignMonitoringGroupVoAssembler.create(map, domainObject.getVitalSignGroup()) );
		// GroupFrequency
		ims.domain.lookups.LookupInstance instance4 = domainObject.getGroupFrequency();
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

			ims.core.vo.lookups.VitalSignsMonitoringFrequency voLookup4 = new ims.core.vo.lookups.VitalSignsMonitoringFrequency(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.VitalSignsMonitoringFrequency parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.VitalSignsMonitoringFrequency(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setGroupFrequency(voLookup4);
		}
				// StartDateTime
		java.util.Date StartDateTime = domainObject.getStartDateTime();
		if ( null != StartDateTime ) 
		{
			valueObject.setStartDateTime(new ims.framework.utils.DateTime(StartDateTime) );
		}
		// DurationValue
		valueObject.setDurationValue(domainObject.getDurationValue());
		// DurationUnit
		ims.domain.lookups.LookupInstance instance7 = domainObject.getDurationUnit();
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

			ims.core.vo.lookups.VitalSignsMonitoringDuration voLookup7 = new ims.core.vo.lookups.VitalSignsMonitoringDuration(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.VitalSignsMonitoringDuration parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.core.vo.lookups.VitalSignsMonitoringDuration(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setDurationUnit(voLookup7);
		}
				// RequestedBy
		valueObject.setRequestedBy(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getRequestedBy()) );
		// RequestDetails
		valueObject.setRequestDetails(domainObject.getRequestDetails());
		// StoppedBy
		valueObject.setStoppedBy(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getStoppedBy()) );
		// StoppedDateTime
		java.util.Date StoppedDateTime = domainObject.getStoppedDateTime();
		if ( null != StoppedDateTime ) 
		{
			valueObject.setStoppedDateTime(new ims.framework.utils.DateTime(StoppedDateTime) );
		}
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// ItemFrequency
		valueObject.setItemFrequency(ims.core.vo.domain.VitalSignItemFrequencyVoAssembler.createVitalSignItemFrequencyVoCollectionFromVitalSignItemFrequency(map, domainObject.getItemFrequency()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.VitalSignsMonitoring extractVitalSignsMonitoring(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VitalSignMonitoringVo valueObject) 
	{
		return 	extractVitalSignsMonitoring(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.VitalSignsMonitoring extractVitalSignsMonitoring(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VitalSignMonitoringVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_VitalSignsMonitoring();
		ims.core.clinical.domain.objects.VitalSignsMonitoring domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.VitalSignsMonitoring)domMap.get(valueObject);
			}
			// ims.core.vo.VitalSignMonitoringVo ID_VitalSignsMonitoring field is unknown
			domainObject = new ims.core.clinical.domain.objects.VitalSignsMonitoring();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_VitalSignsMonitoring());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.VitalSignsMonitoring)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.VitalSignsMonitoring) domainFactory.getDomainObject(ims.core.clinical.domain.objects.VitalSignsMonitoring.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_VitalSignsMonitoring());

		ims.core.admin.domain.objects.ClinicalContact value1 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value1 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getClinicalContact();	
			}
			else
			{
				value1 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value1);
		ims.core.admin.domain.objects.CareContext value2 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value2 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getCareContext();	
			}
			else
			{
				value2 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.configuration.domain.objects.VitalSignMonitoringGroup value3 = null;
		if ( null != valueObject.getVitalSignGroup() ) 
		{
			if (valueObject.getVitalSignGroup().getBoId() == null)
			{
				if (domMap.get(valueObject.getVitalSignGroup()) != null)
				{
					value3 = (ims.core.configuration.domain.objects.VitalSignMonitoringGroup)domMap.get(valueObject.getVitalSignGroup());
				}
			}
			else
			{
				value3 = (ims.core.configuration.domain.objects.VitalSignMonitoringGroup)domainFactory.getDomainObject(ims.core.configuration.domain.objects.VitalSignMonitoringGroup.class, valueObject.getVitalSignGroup().getBoId());
			}
		}
		domainObject.setVitalSignGroup(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getGroupFrequency() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getGroupFrequency().getID());
		}
		domainObject.setGroupFrequency(value4);
		ims.framework.utils.DateTime dateTime5 = valueObject.getStartDateTime();
		java.util.Date value5 = null;
		if ( dateTime5 != null ) 
		{
			value5 = dateTime5.getJavaDate();
		}
		domainObject.setStartDateTime(value5);
		domainObject.setDurationValue(valueObject.getDurationValue());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getDurationUnit() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getDurationUnit().getID());
		}
		domainObject.setDurationUnit(value7);
		domainObject.setRequestedBy(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getRequestedBy(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getRequestDetails() != null && valueObject.getRequestDetails().equals(""))
		{
			valueObject.setRequestDetails(null);
		}
		domainObject.setRequestDetails(valueObject.getRequestDetails());
		domainObject.setStoppedBy(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getStoppedBy(), domMap));
		ims.framework.utils.DateTime dateTime11 = valueObject.getStoppedDateTime();
		java.util.Date value11 = null;
		if ( dateTime11 != null ) 
		{
			value11 = dateTime11.getJavaDate();
		}
		domainObject.setStoppedDateTime(value11);
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		domainObject.setItemFrequency(ims.core.vo.domain.VitalSignItemFrequencyVoAssembler.extractVitalSignItemFrequencySet(domainFactory, valueObject.getItemFrequency(), domainObject.getItemFrequency(), domMap));		

		return domainObject;
	}

}
