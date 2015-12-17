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
 * @author Kevin O'Carroll
 */
public class PatientCharacteristicVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PatientCharacteristicVo copy(ims.core.vo.PatientCharacteristicVo valueObjectDest, ims.core.vo.PatientCharacteristicVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientCharacteristic(valueObjectSrc.getID_PatientCharacteristic());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CharacteresticType
		valueObjectDest.setCharacteresticType(valueObjectSrc.getCharacteresticType());
		// ImplantedDevice
		valueObjectDest.setImplantedDevice(valueObjectSrc.getImplantedDevice());
		// InsertionProcedure
		valueObjectDest.setInsertionProcedure(valueObjectSrc.getInsertionProcedure());
		// RemovalProcedure
		valueObjectDest.setRemovalProcedure(valueObjectSrc.getRemovalProcedure());
		// IsRemoved
		valueObjectDest.setIsRemoved(valueObjectSrc.getIsRemoved());
		// DateInserted
		valueObjectDest.setDateInserted(valueObjectSrc.getDateInserted());
		// DateRemoved
		valueObjectDest.setDateRemoved(valueObjectSrc.getDateRemoved());
		// IsActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// SysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientCharacteristicVoCollectionFromPatientCharacteristic(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientCharacteristic objects.
	 */
	public static ims.core.vo.PatientCharacteristicVoCollection createPatientCharacteristicVoCollectionFromPatientCharacteristic(java.util.Set domainObjectSet)	
	{
		return createPatientCharacteristicVoCollectionFromPatientCharacteristic(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientCharacteristic objects.
	 */
	public static ims.core.vo.PatientCharacteristicVoCollection createPatientCharacteristicVoCollectionFromPatientCharacteristic(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatientCharacteristicVoCollection voList = new ims.core.vo.PatientCharacteristicVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.PatientCharacteristic domainObject = (ims.core.clinical.domain.objects.PatientCharacteristic) iterator.next();
			ims.core.vo.PatientCharacteristicVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientCharacteristic objects.
	 */
	public static ims.core.vo.PatientCharacteristicVoCollection createPatientCharacteristicVoCollectionFromPatientCharacteristic(java.util.List domainObjectList) 
	{
		return createPatientCharacteristicVoCollectionFromPatientCharacteristic(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientCharacteristic objects.
	 */
	public static ims.core.vo.PatientCharacteristicVoCollection createPatientCharacteristicVoCollectionFromPatientCharacteristic(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatientCharacteristicVoCollection voList = new ims.core.vo.PatientCharacteristicVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.PatientCharacteristic domainObject = (ims.core.clinical.domain.objects.PatientCharacteristic) domainObjectList.get(i);
			ims.core.vo.PatientCharacteristicVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.PatientCharacteristic set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientCharacteristicSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCharacteristicVoCollection voCollection) 
	 {
	 	return extractPatientCharacteristicSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientCharacteristicSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCharacteristicVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientCharacteristicVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientCharacteristic domainObject = PatientCharacteristicVoAssembler.extractPatientCharacteristic(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.PatientCharacteristic list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientCharacteristicList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCharacteristicVoCollection voCollection) 
	 {
	 	return extractPatientCharacteristicList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientCharacteristicList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCharacteristicVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientCharacteristicVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientCharacteristic domainObject = PatientCharacteristicVoAssembler.extractPatientCharacteristic(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.PatientCharacteristic object.
	 * @param domainObject ims.core.clinical.domain.objects.PatientCharacteristic
	 */
	 public static ims.core.vo.PatientCharacteristicVo create(ims.core.clinical.domain.objects.PatientCharacteristic domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.PatientCharacteristic object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PatientCharacteristicVo create(DomainObjectMap map, ims.core.clinical.domain.objects.PatientCharacteristic domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PatientCharacteristicVo valueObject = (ims.core.vo.PatientCharacteristicVo) map.getValueObject(domainObject, ims.core.vo.PatientCharacteristicVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PatientCharacteristicVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.PatientCharacteristic
	 */
	 public static ims.core.vo.PatientCharacteristicVo insert(ims.core.vo.PatientCharacteristicVo valueObject, ims.core.clinical.domain.objects.PatientCharacteristic domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.PatientCharacteristic
	 */
	 public static ims.core.vo.PatientCharacteristicVo insert(DomainObjectMap map, ims.core.vo.PatientCharacteristicVo valueObject, ims.core.clinical.domain.objects.PatientCharacteristic domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientCharacteristic(domainObject.getId());
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
			
		// CharacteresticType
		ims.domain.lookups.LookupInstance instance1 = domainObject.getCharacteresticType();
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

			ims.core.vo.lookups.PatientCharacteresticType voLookup1 = new ims.core.vo.lookups.PatientCharacteresticType(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.PatientCharacteresticType parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.core.vo.lookups.PatientCharacteresticType(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setCharacteresticType(voLookup1);
		}
				// ImplantedDevice
		valueObject.setImplantedDevice(domainObject.getImplantedDevice());
		// InsertionProcedure
		valueObject.setInsertionProcedure(ims.core.vo.domain.PatientProcedureVoAssembler.create(map, domainObject.getInsertionProcedure()) );
		// RemovalProcedure
		valueObject.setRemovalProcedure(ims.core.vo.domain.PatientProcedureVoAssembler.create(map, domainObject.getRemovalProcedure()) );
		// IsRemoved
		valueObject.setIsRemoved( domainObject.isIsRemoved() );
		// DateInserted
		java.util.Date DateInserted = domainObject.getDateInserted();
		if ( null != DateInserted ) 
		{
			valueObject.setDateInserted(new ims.framework.utils.Date(DateInserted) );
		}
		// DateRemoved
		java.util.Date DateRemoved = domainObject.getDateRemoved();
		if ( null != DateRemoved ) 
		{
			valueObject.setDateRemoved(new ims.framework.utils.Date(DateRemoved) );
		}
		// IsActive
		valueObject.setIsActive( domainObject.isIsActive() );
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
		// SysInfo
		// set system information
		valueObject.setSysInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// Patient
		if (domainObject.getPatient() != null)
		{
			if(domainObject.getPatient() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPatient();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPatient(new ims.core.patient.vo.PatientRefVo(id, -1));				
			}
			else
			{
				valueObject.setPatient(new ims.core.patient.vo.PatientRefVo(domainObject.getPatient().getId(), domainObject.getPatient().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.PatientCharacteristic extractPatientCharacteristic(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCharacteristicVo valueObject) 
	{
		return 	extractPatientCharacteristic(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.PatientCharacteristic extractPatientCharacteristic(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCharacteristicVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientCharacteristic();
		ims.core.clinical.domain.objects.PatientCharacteristic domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.PatientCharacteristic)domMap.get(valueObject);
			}
			// ims.core.vo.PatientCharacteristicVo ID_PatientCharacteristic field is unknown
			domainObject = new ims.core.clinical.domain.objects.PatientCharacteristic();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientCharacteristic());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.PatientCharacteristic)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.PatientCharacteristic) domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientCharacteristic.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientCharacteristic());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getCharacteresticType() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getCharacteresticType().getID());
		}
		domainObject.setCharacteresticType(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getImplantedDevice() != null && valueObject.getImplantedDevice().equals(""))
		{
			valueObject.setImplantedDevice(null);
		}
		domainObject.setImplantedDevice(valueObject.getImplantedDevice());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.PatientProcedure value3 = null;
		if ( null != valueObject.getInsertionProcedure() ) 
		{
			if (valueObject.getInsertionProcedure().getBoId() == null)
			{
				if (domMap.get(valueObject.getInsertionProcedure()) != null)
				{
					value3 = (ims.core.clinical.domain.objects.PatientProcedure)domMap.get(valueObject.getInsertionProcedure());
				}
			}
			else
			{
				value3 = (ims.core.clinical.domain.objects.PatientProcedure)domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientProcedure.class, valueObject.getInsertionProcedure().getBoId());
			}
		}
		domainObject.setInsertionProcedure(value3);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.PatientProcedure value4 = null;
		if ( null != valueObject.getRemovalProcedure() ) 
		{
			if (valueObject.getRemovalProcedure().getBoId() == null)
			{
				if (domMap.get(valueObject.getRemovalProcedure()) != null)
				{
					value4 = (ims.core.clinical.domain.objects.PatientProcedure)domMap.get(valueObject.getRemovalProcedure());
				}
			}
			else
			{
				value4 = (ims.core.clinical.domain.objects.PatientProcedure)domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientProcedure.class, valueObject.getRemovalProcedure().getBoId());
			}
		}
		domainObject.setRemovalProcedure(value4);
		domainObject.setIsRemoved(valueObject.getIsRemoved());
		java.util.Date value6 = null;
		ims.framework.utils.Date date6 = valueObject.getDateInserted();		
		if ( date6 != null ) 
		{
			value6 = date6.getDate();
		}
		domainObject.setDateInserted(value6);
		java.util.Date value7 = null;
		ims.framework.utils.Date date7 = valueObject.getDateRemoved();		
		if ( date7 != null ) 
		{
			value7 = date7.getDate();
		}
		domainObject.setDateRemoved(value7);
		domainObject.setIsActive(valueObject.getIsActive());
		ims.core.admin.domain.objects.CareContext value9 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value9 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value9 = domainObject.getCareContext();	
			}
			else
			{
				value9 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value9);
		ims.core.patient.domain.objects.Patient value11 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value11 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value11 = domainObject.getPatient();	
			}
			else
			{
				value11 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value11);

		return domainObject;
	}

}
