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
package ims.oncology.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cornel Ventuneac
 */
public class ChemoRegimensConfigVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.oncology.vo.ChemoRegimensConfigVo copy(ims.oncology.vo.ChemoRegimensConfigVo valueObjectDest, ims.oncology.vo.ChemoRegimensConfigVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ChemoRegimensConfig(valueObjectSrc.getID_ChemoRegimensConfig());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Regimen
		valueObjectDest.setRegimen(valueObjectSrc.getRegimen());
		// ProcurementCode
		valueObjectDest.setProcurementCode(valueObjectSrc.getProcurementCode());
		// DayOneDeliveryCode
		valueObjectDest.setDayOneDeliveryCode(valueObjectSrc.getDayOneDeliveryCode());
		// DeliveryCodeAllOtherDays
		valueObjectDest.setDeliveryCodeAllOtherDays(valueObjectSrc.getDeliveryCodeAllOtherDays());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// RegimenDescription
		valueObjectDest.setRegimenDescription(valueObjectSrc.getRegimenDescription());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createChemoRegimensConfigVoCollectionFromChemoRegimensConfig(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.configuration.domain.objects.ChemoRegimensConfig objects.
	 */
	public static ims.oncology.vo.ChemoRegimensConfigVoCollection createChemoRegimensConfigVoCollectionFromChemoRegimensConfig(java.util.Set domainObjectSet)	
	{
		return createChemoRegimensConfigVoCollectionFromChemoRegimensConfig(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.configuration.domain.objects.ChemoRegimensConfig objects.
	 */
	public static ims.oncology.vo.ChemoRegimensConfigVoCollection createChemoRegimensConfigVoCollectionFromChemoRegimensConfig(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.oncology.vo.ChemoRegimensConfigVoCollection voList = new ims.oncology.vo.ChemoRegimensConfigVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.oncology.configuration.domain.objects.ChemoRegimensConfig domainObject = (ims.oncology.configuration.domain.objects.ChemoRegimensConfig) iterator.next();
			ims.oncology.vo.ChemoRegimensConfigVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.oncology.configuration.domain.objects.ChemoRegimensConfig objects.
	 */
	public static ims.oncology.vo.ChemoRegimensConfigVoCollection createChemoRegimensConfigVoCollectionFromChemoRegimensConfig(java.util.List domainObjectList) 
	{
		return createChemoRegimensConfigVoCollectionFromChemoRegimensConfig(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.configuration.domain.objects.ChemoRegimensConfig objects.
	 */
	public static ims.oncology.vo.ChemoRegimensConfigVoCollection createChemoRegimensConfigVoCollectionFromChemoRegimensConfig(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.oncology.vo.ChemoRegimensConfigVoCollection voList = new ims.oncology.vo.ChemoRegimensConfigVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.configuration.domain.objects.ChemoRegimensConfig domainObject = (ims.oncology.configuration.domain.objects.ChemoRegimensConfig) domainObjectList.get(i);
			ims.oncology.vo.ChemoRegimensConfigVo vo = create(map, domainObject);

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
	 * Create the ims.oncology.configuration.domain.objects.ChemoRegimensConfig set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractChemoRegimensConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.ChemoRegimensConfigVoCollection voCollection) 
	 {
	 	return extractChemoRegimensConfigSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractChemoRegimensConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.ChemoRegimensConfigVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.ChemoRegimensConfigVo vo = voCollection.get(i);
			ims.oncology.configuration.domain.objects.ChemoRegimensConfig domainObject = ChemoRegimensConfigVoAssembler.extractChemoRegimensConfig(domainFactory, vo, domMap);

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
	 * Create the ims.oncology.configuration.domain.objects.ChemoRegimensConfig list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractChemoRegimensConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.ChemoRegimensConfigVoCollection voCollection) 
	 {
	 	return extractChemoRegimensConfigList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractChemoRegimensConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.ChemoRegimensConfigVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.ChemoRegimensConfigVo vo = voCollection.get(i);
			ims.oncology.configuration.domain.objects.ChemoRegimensConfig domainObject = ChemoRegimensConfigVoAssembler.extractChemoRegimensConfig(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.oncology.configuration.domain.objects.ChemoRegimensConfig object.
	 * @param domainObject ims.oncology.configuration.domain.objects.ChemoRegimensConfig
	 */
	 public static ims.oncology.vo.ChemoRegimensConfigVo create(ims.oncology.configuration.domain.objects.ChemoRegimensConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.oncology.configuration.domain.objects.ChemoRegimensConfig object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.oncology.vo.ChemoRegimensConfigVo create(DomainObjectMap map, ims.oncology.configuration.domain.objects.ChemoRegimensConfig domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.oncology.vo.ChemoRegimensConfigVo valueObject = (ims.oncology.vo.ChemoRegimensConfigVo) map.getValueObject(domainObject, ims.oncology.vo.ChemoRegimensConfigVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.oncology.vo.ChemoRegimensConfigVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.oncology.configuration.domain.objects.ChemoRegimensConfig
	 */
	 public static ims.oncology.vo.ChemoRegimensConfigVo insert(ims.oncology.vo.ChemoRegimensConfigVo valueObject, ims.oncology.configuration.domain.objects.ChemoRegimensConfig domainObject) 
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
	 * @param domainObject ims.oncology.configuration.domain.objects.ChemoRegimensConfig
	 */
	 public static ims.oncology.vo.ChemoRegimensConfigVo insert(DomainObjectMap map, ims.oncology.vo.ChemoRegimensConfigVo valueObject, ims.oncology.configuration.domain.objects.ChemoRegimensConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ChemoRegimensConfig(domainObject.getId());
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
			
		// Regimen
		ims.domain.lookups.LookupInstance instance1 = domainObject.getRegimen();
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

			ims.oncology.vo.lookups.RegimenAcronym voLookup1 = new ims.oncology.vo.lookups.RegimenAcronym(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.oncology.vo.lookups.RegimenAcronym parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.oncology.vo.lookups.RegimenAcronym(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setRegimen(voLookup1);
		}
				// ProcurementCode
		ims.domain.lookups.LookupInstance instance2 = domainObject.getProcurementCode();
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

			ims.oncology.vo.lookups.ProcurementCode voLookup2 = new ims.oncology.vo.lookups.ProcurementCode(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.oncology.vo.lookups.ProcurementCode parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.oncology.vo.lookups.ProcurementCode(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setProcurementCode(voLookup2);
		}
				// DayOneDeliveryCode
		ims.domain.lookups.LookupInstance instance3 = domainObject.getDayOneDeliveryCode();
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

			ims.oncology.vo.lookups.DayOneDeliveryCode voLookup3 = new ims.oncology.vo.lookups.DayOneDeliveryCode(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.oncology.vo.lookups.DayOneDeliveryCode parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.oncology.vo.lookups.DayOneDeliveryCode(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setDayOneDeliveryCode(voLookup3);
		}
				// DeliveryCodeAllOtherDays
		ims.domain.lookups.LookupInstance instance4 = domainObject.getDeliveryCodeAllOtherDays();
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

			ims.oncology.vo.lookups.DeliveryCodeAllOtherDays voLookup4 = new ims.oncology.vo.lookups.DeliveryCodeAllOtherDays(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.oncology.vo.lookups.DeliveryCodeAllOtherDays parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.oncology.vo.lookups.DeliveryCodeAllOtherDays(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setDeliveryCodeAllOtherDays(voLookup4);
		}
				// Status
		ims.domain.lookups.LookupInstance instance5 = domainObject.getStatus();
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

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup5 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setStatus(voLookup5);
		}
				// RegimenDescription
		valueObject.setRegimenDescription(domainObject.getRegimenDescription());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.configuration.domain.objects.ChemoRegimensConfig extractChemoRegimensConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.ChemoRegimensConfigVo valueObject) 
	{
		return 	extractChemoRegimensConfig(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.configuration.domain.objects.ChemoRegimensConfig extractChemoRegimensConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.ChemoRegimensConfigVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ChemoRegimensConfig();
		ims.oncology.configuration.domain.objects.ChemoRegimensConfig domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.oncology.configuration.domain.objects.ChemoRegimensConfig)domMap.get(valueObject);
			}
			// ims.oncology.vo.ChemoRegimensConfigVo ID_ChemoRegimensConfig field is unknown
			domainObject = new ims.oncology.configuration.domain.objects.ChemoRegimensConfig();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ChemoRegimensConfig());
			if (domMap.get(key) != null)
			{
				return (ims.oncology.configuration.domain.objects.ChemoRegimensConfig)domMap.get(key);
			}
			domainObject = (ims.oncology.configuration.domain.objects.ChemoRegimensConfig) domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.ChemoRegimensConfig.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ChemoRegimensConfig());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getRegimen() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getRegimen().getID());
		}
		domainObject.setRegimen(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getProcurementCode() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getProcurementCode().getID());
		}
		domainObject.setProcurementCode(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getDayOneDeliveryCode() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getDayOneDeliveryCode().getID());
		}
		domainObject.setDayOneDeliveryCode(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getDeliveryCodeAllOtherDays() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getDeliveryCodeAllOtherDays().getID());
		}
		domainObject.setDeliveryCodeAllOtherDays(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value5);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getRegimenDescription() != null && valueObject.getRegimenDescription().equals(""))
		{
			valueObject.setRegimenDescription(null);
		}
		domainObject.setRegimenDescription(valueObject.getRegimenDescription());

		return domainObject;
	}

}
