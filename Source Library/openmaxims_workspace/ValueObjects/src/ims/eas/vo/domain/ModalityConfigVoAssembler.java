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
package ims.eas.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Barbara Worwood
 */
public class ModalityConfigVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.eas.vo.ModalityConfigVo copy(ims.eas.vo.ModalityConfigVo valueObjectDest, ims.eas.vo.ModalityConfigVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ModalityConfig(valueObjectSrc.getID_ModalityConfig());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Modality
		valueObjectDest.setModality(valueObjectSrc.getModality());
		// Energy
		valueObjectDest.setEnergy(valueObjectSrc.getEnergy());
		// Unit
		valueObjectDest.setUnit(valueObjectSrc.getUnit());
		// active
		valueObjectDest.setActive(valueObjectSrc.getActive());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createModalityConfigVoCollectionFromModalityConfig(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.eas.configuration.domain.objects.ModalityConfig objects.
	 */
	public static ims.eas.vo.ModalityConfigVoCollection createModalityConfigVoCollectionFromModalityConfig(java.util.Set domainObjectSet)	
	{
		return createModalityConfigVoCollectionFromModalityConfig(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.eas.configuration.domain.objects.ModalityConfig objects.
	 */
	public static ims.eas.vo.ModalityConfigVoCollection createModalityConfigVoCollectionFromModalityConfig(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.eas.vo.ModalityConfigVoCollection voList = new ims.eas.vo.ModalityConfigVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.eas.configuration.domain.objects.ModalityConfig domainObject = (ims.eas.configuration.domain.objects.ModalityConfig) iterator.next();
			ims.eas.vo.ModalityConfigVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.eas.configuration.domain.objects.ModalityConfig objects.
	 */
	public static ims.eas.vo.ModalityConfigVoCollection createModalityConfigVoCollectionFromModalityConfig(java.util.List domainObjectList) 
	{
		return createModalityConfigVoCollectionFromModalityConfig(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.eas.configuration.domain.objects.ModalityConfig objects.
	 */
	public static ims.eas.vo.ModalityConfigVoCollection createModalityConfigVoCollectionFromModalityConfig(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.eas.vo.ModalityConfigVoCollection voList = new ims.eas.vo.ModalityConfigVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.eas.configuration.domain.objects.ModalityConfig domainObject = (ims.eas.configuration.domain.objects.ModalityConfig) domainObjectList.get(i);
			ims.eas.vo.ModalityConfigVo vo = create(map, domainObject);

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
	 * Create the ims.eas.configuration.domain.objects.ModalityConfig set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractModalityConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.ModalityConfigVoCollection voCollection) 
	 {
	 	return extractModalityConfigSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractModalityConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.ModalityConfigVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.eas.vo.ModalityConfigVo vo = voCollection.get(i);
			ims.eas.configuration.domain.objects.ModalityConfig domainObject = ModalityConfigVoAssembler.extractModalityConfig(domainFactory, vo, domMap);

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
	 * Create the ims.eas.configuration.domain.objects.ModalityConfig list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractModalityConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.ModalityConfigVoCollection voCollection) 
	 {
	 	return extractModalityConfigList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractModalityConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.ModalityConfigVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.eas.vo.ModalityConfigVo vo = voCollection.get(i);
			ims.eas.configuration.domain.objects.ModalityConfig domainObject = ModalityConfigVoAssembler.extractModalityConfig(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.eas.configuration.domain.objects.ModalityConfig object.
	 * @param domainObject ims.eas.configuration.domain.objects.ModalityConfig
	 */
	 public static ims.eas.vo.ModalityConfigVo create(ims.eas.configuration.domain.objects.ModalityConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.eas.configuration.domain.objects.ModalityConfig object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.eas.vo.ModalityConfigVo create(DomainObjectMap map, ims.eas.configuration.domain.objects.ModalityConfig domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.eas.vo.ModalityConfigVo valueObject = (ims.eas.vo.ModalityConfigVo) map.getValueObject(domainObject, ims.eas.vo.ModalityConfigVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.eas.vo.ModalityConfigVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.eas.configuration.domain.objects.ModalityConfig
	 */
	 public static ims.eas.vo.ModalityConfigVo insert(ims.eas.vo.ModalityConfigVo valueObject, ims.eas.configuration.domain.objects.ModalityConfig domainObject) 
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
	 * @param domainObject ims.eas.configuration.domain.objects.ModalityConfig
	 */
	 public static ims.eas.vo.ModalityConfigVo insert(DomainObjectMap map, ims.eas.vo.ModalityConfigVo valueObject, ims.eas.configuration.domain.objects.ModalityConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ModalityConfig(domainObject.getId());
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
			
		// Modality
		ims.domain.lookups.LookupInstance instance1 = domainObject.getModality();
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

			ims.ccosched.vo.lookups.Modality voLookup1 = new ims.ccosched.vo.lookups.Modality(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.ccosched.vo.lookups.Modality parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.ccosched.vo.lookups.Modality(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setModality(voLookup1);
		}
				// Energy
		valueObject.setEnergy(domainObject.getEnergy());
		// Unit
		ims.domain.lookups.LookupInstance instance3 = domainObject.getUnit();
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

			ims.ccosched.vo.lookups.Unit voLookup3 = new ims.ccosched.vo.lookups.Unit(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.ccosched.vo.lookups.Unit parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.ccosched.vo.lookups.Unit(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setUnit(voLookup3);
		}
				// active
		valueObject.setActive( domainObject.isActive() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.eas.configuration.domain.objects.ModalityConfig extractModalityConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.ModalityConfigVo valueObject) 
	{
		return 	extractModalityConfig(domainFactory, valueObject, new HashMap());
	}

	public static ims.eas.configuration.domain.objects.ModalityConfig extractModalityConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.ModalityConfigVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ModalityConfig();
		ims.eas.configuration.domain.objects.ModalityConfig domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.eas.configuration.domain.objects.ModalityConfig)domMap.get(valueObject);
			}
			// ims.eas.vo.ModalityConfigVo ID_ModalityConfig field is unknown
			domainObject = new ims.eas.configuration.domain.objects.ModalityConfig();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ModalityConfig());
			if (domMap.get(key) != null)
			{
				return (ims.eas.configuration.domain.objects.ModalityConfig)domMap.get(key);
			}
			domainObject = (ims.eas.configuration.domain.objects.ModalityConfig) domainFactory.getDomainObject(ims.eas.configuration.domain.objects.ModalityConfig.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ModalityConfig());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getModality() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getModality().getID());
		}
		domainObject.setModality(value1);
		domainObject.setEnergy(valueObject.getEnergy());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getUnit() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getUnit().getID());
		}
		domainObject.setUnit(value3);
		domainObject.setActive(valueObject.getActive());

		return domainObject;
	}

}
