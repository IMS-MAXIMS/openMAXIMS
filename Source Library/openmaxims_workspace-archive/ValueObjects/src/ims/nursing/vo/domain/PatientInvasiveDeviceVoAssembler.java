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
package ims.nursing.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Catalin Tomozei
 */
public class PatientInvasiveDeviceVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.nursing.vo.PatientInvasiveDeviceVo copy(ims.nursing.vo.PatientInvasiveDeviceVo valueObjectDest, ims.nursing.vo.PatientInvasiveDeviceVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientInvasiveDevice(valueObjectSrc.getID_PatientInvasiveDevice());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// Type
		valueObjectDest.setType(valueObjectSrc.getType());
		// Size
		valueObjectDest.setSize(valueObjectSrc.getSize());
		// Comment
		valueObjectDest.setComment(valueObjectSrc.getComment());
		// RemovalReason
		valueObjectDest.setRemovalReason(valueObjectSrc.getRemovalReason());
		// SentForCulture
		valueObjectDest.setSentForCulture(valueObjectSrc.getSentForCulture());
		// Result
		valueObjectDest.setResult(valueObjectSrc.getResult());
		// InvasiveDevice
		valueObjectDest.setInvasiveDevice(valueObjectSrc.getInvasiveDevice());
		// InsertedDateTime
		valueObjectDest.setInsertedDateTime(valueObjectSrc.getInsertedDateTime());
		// InsertedHCP
		valueObjectDest.setInsertedHCP(valueObjectSrc.getInsertedHCP());
		// VIPScore
		valueObjectDest.setVIPScore(valueObjectSrc.getVIPScore());
		// RemovalDateTime
		valueObjectDest.setRemovalDateTime(valueObjectSrc.getRemovalDateTime());
		// RemovalHCP
		valueObjectDest.setRemovalHCP(valueObjectSrc.getRemovalHCP());
		// TargetRemovalDateTime
		valueObjectDest.setTargetRemovalDateTime(valueObjectSrc.getTargetRemovalDateTime());
		// Site
		valueObjectDest.setSite(valueObjectSrc.getSite());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientInvasiveDeviceVoCollectionFromPatientInvasiveDevice(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.PatientInvasiveDevice objects.
	 */
	public static ims.nursing.vo.PatientInvasiveDeviceVoCollection createPatientInvasiveDeviceVoCollectionFromPatientInvasiveDevice(java.util.Set domainObjectSet)	
	{
		return createPatientInvasiveDeviceVoCollectionFromPatientInvasiveDevice(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.PatientInvasiveDevice objects.
	 */
	public static ims.nursing.vo.PatientInvasiveDeviceVoCollection createPatientInvasiveDeviceVoCollectionFromPatientInvasiveDevice(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.nursing.vo.PatientInvasiveDeviceVoCollection voList = new ims.nursing.vo.PatientInvasiveDeviceVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.PatientInvasiveDevice domainObject = (ims.clinical.domain.objects.PatientInvasiveDevice) iterator.next();
			ims.nursing.vo.PatientInvasiveDeviceVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.PatientInvasiveDevice objects.
	 */
	public static ims.nursing.vo.PatientInvasiveDeviceVoCollection createPatientInvasiveDeviceVoCollectionFromPatientInvasiveDevice(java.util.List domainObjectList) 
	{
		return createPatientInvasiveDeviceVoCollectionFromPatientInvasiveDevice(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.PatientInvasiveDevice objects.
	 */
	public static ims.nursing.vo.PatientInvasiveDeviceVoCollection createPatientInvasiveDeviceVoCollectionFromPatientInvasiveDevice(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.nursing.vo.PatientInvasiveDeviceVoCollection voList = new ims.nursing.vo.PatientInvasiveDeviceVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.PatientInvasiveDevice domainObject = (ims.clinical.domain.objects.PatientInvasiveDevice) domainObjectList.get(i);
			ims.nursing.vo.PatientInvasiveDeviceVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.PatientInvasiveDevice set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientInvasiveDeviceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PatientInvasiveDeviceVoCollection voCollection) 
	 {
	 	return extractPatientInvasiveDeviceSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientInvasiveDeviceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PatientInvasiveDeviceVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.PatientInvasiveDeviceVo vo = voCollection.get(i);
			ims.clinical.domain.objects.PatientInvasiveDevice domainObject = PatientInvasiveDeviceVoAssembler.extractPatientInvasiveDevice(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.PatientInvasiveDevice list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientInvasiveDeviceList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PatientInvasiveDeviceVoCollection voCollection) 
	 {
	 	return extractPatientInvasiveDeviceList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientInvasiveDeviceList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PatientInvasiveDeviceVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.PatientInvasiveDeviceVo vo = voCollection.get(i);
			ims.clinical.domain.objects.PatientInvasiveDevice domainObject = PatientInvasiveDeviceVoAssembler.extractPatientInvasiveDevice(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.PatientInvasiveDevice object.
	 * @param domainObject ims.clinical.domain.objects.PatientInvasiveDevice
	 */
	 public static ims.nursing.vo.PatientInvasiveDeviceVo create(ims.clinical.domain.objects.PatientInvasiveDevice domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.PatientInvasiveDevice object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.nursing.vo.PatientInvasiveDeviceVo create(DomainObjectMap map, ims.clinical.domain.objects.PatientInvasiveDevice domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.nursing.vo.PatientInvasiveDeviceVo valueObject = (ims.nursing.vo.PatientInvasiveDeviceVo) map.getValueObject(domainObject, ims.nursing.vo.PatientInvasiveDeviceVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.nursing.vo.PatientInvasiveDeviceVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.PatientInvasiveDevice
	 */
	 public static ims.nursing.vo.PatientInvasiveDeviceVo insert(ims.nursing.vo.PatientInvasiveDeviceVo valueObject, ims.clinical.domain.objects.PatientInvasiveDevice domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.PatientInvasiveDevice
	 */
	 public static ims.nursing.vo.PatientInvasiveDeviceVo insert(DomainObjectMap map, ims.nursing.vo.PatientInvasiveDeviceVo valueObject, ims.clinical.domain.objects.PatientInvasiveDevice domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientInvasiveDevice(domainObject.getId());
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
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// Type
		if (domainObject.getType() != null)
		{
			if(domainObject.getType() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getType();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setType(new ims.clinical.configuration.vo.InvasiveDeviceTypeRefVo(id, -1));				
			}
			else
			{
				valueObject.setType(new ims.clinical.configuration.vo.InvasiveDeviceTypeRefVo(domainObject.getType().getId(), domainObject.getType().getVersion()));
			}
		}
		// Size
		if (domainObject.getSize() != null)
		{
			if(domainObject.getSize() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getSize();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setSize(new ims.clinical.configuration.vo.InvasiveDeviceConfigSizeRefVo(id, -1));				
			}
			else
			{
				valueObject.setSize(new ims.clinical.configuration.vo.InvasiveDeviceConfigSizeRefVo(domainObject.getSize().getId(), domainObject.getSize().getVersion()));
			}
		}
		// Comment
		valueObject.setComment(domainObject.getComment());
		// RemovalReason
		ims.domain.lookups.LookupInstance instance7 = domainObject.getRemovalReason();
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

			ims.clinical.vo.lookups.InvasiveDeviceRemovalReason voLookup7 = new ims.clinical.vo.lookups.InvasiveDeviceRemovalReason(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.clinical.vo.lookups.InvasiveDeviceRemovalReason parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.clinical.vo.lookups.InvasiveDeviceRemovalReason(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setRemovalReason(voLookup7);
		}
				// SentForCulture
		ims.domain.lookups.LookupInstance instance8 = domainObject.getSentForCulture();
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
			valueObject.setSentForCulture(voLookup8);
		}
				// Result
		valueObject.setResult(domainObject.getResult());
		// InvasiveDevice
		valueObject.setInvasiveDevice(ims.clinicaladmin.vo.domain.InvasiveDeviceConfigShortVoAssembler.create(map, domainObject.getInvasiveDevice()) );
		// InsertedDateTime
		java.util.Date InsertedDateTime = domainObject.getInsertedDateTime();
		if ( null != InsertedDateTime ) 
		{
			valueObject.setInsertedDateTime(new ims.framework.utils.DateTime(InsertedDateTime) );
		}
		// InsertedHCP
		valueObject.setInsertedHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getInsertedHCP()) );
		// VIPScore
		valueObject.setVIPScore(ims.nursing.vo.domain.PatientInvasiveDeviceVipVoAssembler.createPatientInvasiveDeviceVipVoCollectionFromVIPScore(map, domainObject.getVIPScore()) );
		// RemovalDateTime
		java.util.Date RemovalDateTime = domainObject.getRemovalDateTime();
		if ( null != RemovalDateTime ) 
		{
			valueObject.setRemovalDateTime(new ims.framework.utils.DateTime(RemovalDateTime) );
		}
		// RemovalHCP
		valueObject.setRemovalHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getRemovalHCP()) );
		// TargetRemovalDateTime
		java.util.Date TargetRemovalDateTime = domainObject.getTargetRemovalDateTime();
		if ( null != TargetRemovalDateTime ) 
		{
			valueObject.setTargetRemovalDateTime(new ims.framework.utils.DateTime(TargetRemovalDateTime) );
		}
		// Site
		valueObject.setSite(domainObject.getSite());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.PatientInvasiveDevice extractPatientInvasiveDevice(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PatientInvasiveDeviceVo valueObject) 
	{
		return 	extractPatientInvasiveDevice(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.PatientInvasiveDevice extractPatientInvasiveDevice(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PatientInvasiveDeviceVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientInvasiveDevice();
		ims.clinical.domain.objects.PatientInvasiveDevice domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.PatientInvasiveDevice)domMap.get(valueObject);
			}
			// ims.nursing.vo.PatientInvasiveDeviceVo ID_PatientInvasiveDevice field is unknown
			domainObject = new ims.clinical.domain.objects.PatientInvasiveDevice();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientInvasiveDevice());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.PatientInvasiveDevice)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.PatientInvasiveDevice) domainFactory.getDomainObject(ims.clinical.domain.objects.PatientInvasiveDevice.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientInvasiveDevice());

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
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		ims.clinical.configuration.domain.objects.InvasiveDeviceType value4 = null;
		if ( null != valueObject.getType() ) 
		{
			if (valueObject.getType().getBoId() == null)
			{
				if (domMap.get(valueObject.getType()) != null)
				{
					value4 = (ims.clinical.configuration.domain.objects.InvasiveDeviceType)domMap.get(valueObject.getType());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getType();	
			}
			else
			{
				value4 = (ims.clinical.configuration.domain.objects.InvasiveDeviceType)domainFactory.getDomainObject(ims.clinical.configuration.domain.objects.InvasiveDeviceType.class, valueObject.getType().getBoId());
			}
		}
		domainObject.setType(value4);
		ims.clinical.configuration.domain.objects.InvasiveDeviceConfigSize value5 = null;
		if ( null != valueObject.getSize() ) 
		{
			if (valueObject.getSize().getBoId() == null)
			{
				if (domMap.get(valueObject.getSize()) != null)
				{
					value5 = (ims.clinical.configuration.domain.objects.InvasiveDeviceConfigSize)domMap.get(valueObject.getSize());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value5 = domainObject.getSize();	
			}
			else
			{
				value5 = (ims.clinical.configuration.domain.objects.InvasiveDeviceConfigSize)domainFactory.getDomainObject(ims.clinical.configuration.domain.objects.InvasiveDeviceConfigSize.class, valueObject.getSize().getBoId());
			}
		}
		domainObject.setSize(value5);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComment() != null && valueObject.getComment().equals(""))
		{
			valueObject.setComment(null);
		}
		domainObject.setComment(valueObject.getComment());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getRemovalReason() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getRemovalReason().getID());
		}
		domainObject.setRemovalReason(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getSentForCulture() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getSentForCulture().getID());
		}
		domainObject.setSentForCulture(value8);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getResult() != null && valueObject.getResult().equals(""))
		{
			valueObject.setResult(null);
		}
		domainObject.setResult(valueObject.getResult());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.clinical.configuration.domain.objects.InvasiveDeviceConfig value10 = null;
		if ( null != valueObject.getInvasiveDevice() ) 
		{
			if (valueObject.getInvasiveDevice().getBoId() == null)
			{
				if (domMap.get(valueObject.getInvasiveDevice()) != null)
				{
					value10 = (ims.clinical.configuration.domain.objects.InvasiveDeviceConfig)domMap.get(valueObject.getInvasiveDevice());
				}
			}
			else
			{
				value10 = (ims.clinical.configuration.domain.objects.InvasiveDeviceConfig)domainFactory.getDomainObject(ims.clinical.configuration.domain.objects.InvasiveDeviceConfig.class, valueObject.getInvasiveDevice().getBoId());
			}
		}
		domainObject.setInvasiveDevice(value10);
		ims.framework.utils.DateTime dateTime11 = valueObject.getInsertedDateTime();
		java.util.Date value11 = null;
		if ( dateTime11 != null ) 
		{
			value11 = dateTime11.getJavaDate();
		}
		domainObject.setInsertedDateTime(value11);
		domainObject.setInsertedHCP(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getInsertedHCP(), domMap));
		domainObject.setVIPScore(ims.nursing.vo.domain.PatientInvasiveDeviceVipVoAssembler.extractVIPScoreList(domainFactory, valueObject.getVIPScore(), domainObject.getVIPScore(), domMap));		
		ims.framework.utils.DateTime dateTime14 = valueObject.getRemovalDateTime();
		java.util.Date value14 = null;
		if ( dateTime14 != null ) 
		{
			value14 = dateTime14.getJavaDate();
		}
		domainObject.setRemovalDateTime(value14);
		domainObject.setRemovalHCP(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getRemovalHCP(), domMap));
		ims.framework.utils.DateTime dateTime16 = valueObject.getTargetRemovalDateTime();
		java.util.Date value16 = null;
		if ( dateTime16 != null ) 
		{
			value16 = dateTime16.getJavaDate();
		}
		domainObject.setTargetRemovalDateTime(value16);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSite() != null && valueObject.getSite().equals(""))
		{
			valueObject.setSite(null);
		}
		domainObject.setSite(valueObject.getSite());

		return domainObject;
	}

}
