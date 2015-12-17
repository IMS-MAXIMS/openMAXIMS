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
package ims.therapies.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class RemedialMaterialVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.therapies.vo.RemedialMaterialVo copy(ims.therapies.vo.RemedialMaterialVo valueObjectDest, ims.therapies.vo.RemedialMaterialVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_RemedialMaterial(valueObjectSrc.getID_RemedialMaterial());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Material
		valueObjectDest.setMaterial(valueObjectSrc.getMaterial());
		// Size
		valueObjectDest.setSize(valueObjectSrc.getSize());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createRemedialMaterialVoCollectionFromRemedialMaterial(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.therapies.treatment.domain.objects.RemedialMaterial objects.
	 */
	public static ims.therapies.vo.RemedialMaterialVoCollection createRemedialMaterialVoCollectionFromRemedialMaterial(java.util.Set domainObjectSet)	
	{
		return createRemedialMaterialVoCollectionFromRemedialMaterial(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.therapies.treatment.domain.objects.RemedialMaterial objects.
	 */
	public static ims.therapies.vo.RemedialMaterialVoCollection createRemedialMaterialVoCollectionFromRemedialMaterial(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.therapies.vo.RemedialMaterialVoCollection voList = new ims.therapies.vo.RemedialMaterialVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.therapies.treatment.domain.objects.RemedialMaterial domainObject = (ims.therapies.treatment.domain.objects.RemedialMaterial) iterator.next();
			ims.therapies.vo.RemedialMaterialVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.therapies.treatment.domain.objects.RemedialMaterial objects.
	 */
	public static ims.therapies.vo.RemedialMaterialVoCollection createRemedialMaterialVoCollectionFromRemedialMaterial(java.util.List domainObjectList) 
	{
		return createRemedialMaterialVoCollectionFromRemedialMaterial(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.therapies.treatment.domain.objects.RemedialMaterial objects.
	 */
	public static ims.therapies.vo.RemedialMaterialVoCollection createRemedialMaterialVoCollectionFromRemedialMaterial(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.therapies.vo.RemedialMaterialVoCollection voList = new ims.therapies.vo.RemedialMaterialVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.therapies.treatment.domain.objects.RemedialMaterial domainObject = (ims.therapies.treatment.domain.objects.RemedialMaterial) domainObjectList.get(i);
			ims.therapies.vo.RemedialMaterialVo vo = create(map, domainObject);

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
	 * Create the ims.therapies.treatment.domain.objects.RemedialMaterial set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractRemedialMaterialSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.RemedialMaterialVoCollection voCollection) 
	 {
	 	return extractRemedialMaterialSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractRemedialMaterialSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.RemedialMaterialVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.RemedialMaterialVo vo = voCollection.get(i);
			ims.therapies.treatment.domain.objects.RemedialMaterial domainObject = RemedialMaterialVoAssembler.extractRemedialMaterial(domainFactory, vo, domMap);

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
	 * Create the ims.therapies.treatment.domain.objects.RemedialMaterial list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractRemedialMaterialList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.RemedialMaterialVoCollection voCollection) 
	 {
	 	return extractRemedialMaterialList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractRemedialMaterialList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.RemedialMaterialVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.RemedialMaterialVo vo = voCollection.get(i);
			ims.therapies.treatment.domain.objects.RemedialMaterial domainObject = RemedialMaterialVoAssembler.extractRemedialMaterial(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.therapies.treatment.domain.objects.RemedialMaterial object.
	 * @param domainObject ims.therapies.treatment.domain.objects.RemedialMaterial
	 */
	 public static ims.therapies.vo.RemedialMaterialVo create(ims.therapies.treatment.domain.objects.RemedialMaterial domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.therapies.treatment.domain.objects.RemedialMaterial object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.therapies.vo.RemedialMaterialVo create(DomainObjectMap map, ims.therapies.treatment.domain.objects.RemedialMaterial domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.therapies.vo.RemedialMaterialVo valueObject = (ims.therapies.vo.RemedialMaterialVo) map.getValueObject(domainObject, ims.therapies.vo.RemedialMaterialVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.therapies.vo.RemedialMaterialVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.therapies.treatment.domain.objects.RemedialMaterial
	 */
	 public static ims.therapies.vo.RemedialMaterialVo insert(ims.therapies.vo.RemedialMaterialVo valueObject, ims.therapies.treatment.domain.objects.RemedialMaterial domainObject) 
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
	 * @param domainObject ims.therapies.treatment.domain.objects.RemedialMaterial
	 */
	 public static ims.therapies.vo.RemedialMaterialVo insert(DomainObjectMap map, ims.therapies.vo.RemedialMaterialVo valueObject, ims.therapies.treatment.domain.objects.RemedialMaterial domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_RemedialMaterial(domainObject.getId());
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
			
		// Material
		ims.domain.lookups.LookupInstance instance1 = domainObject.getMaterial();
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

			ims.spinalinjuries.vo.lookups.Material voLookup1 = new ims.spinalinjuries.vo.lookups.Material(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.Material parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.spinalinjuries.vo.lookups.Material(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setMaterial(voLookup1);
		}
				// Size
		valueObject.setSize(domainObject.getSize());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.therapies.treatment.domain.objects.RemedialMaterial extractRemedialMaterial(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.RemedialMaterialVo valueObject) 
	{
		return 	extractRemedialMaterial(domainFactory, valueObject, new HashMap());
	}

	public static ims.therapies.treatment.domain.objects.RemedialMaterial extractRemedialMaterial(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.RemedialMaterialVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_RemedialMaterial();
		ims.therapies.treatment.domain.objects.RemedialMaterial domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.therapies.treatment.domain.objects.RemedialMaterial)domMap.get(valueObject);
			}
			// ims.therapies.vo.RemedialMaterialVo ID_RemedialMaterial field is unknown
			domainObject = new ims.therapies.treatment.domain.objects.RemedialMaterial();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_RemedialMaterial());
			if (domMap.get(key) != null)
			{
				return (ims.therapies.treatment.domain.objects.RemedialMaterial)domMap.get(key);
			}
			domainObject = (ims.therapies.treatment.domain.objects.RemedialMaterial) domainFactory.getDomainObject(ims.therapies.treatment.domain.objects.RemedialMaterial.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_RemedialMaterial());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getMaterial() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getMaterial().getID());
		}
		domainObject.setMaterial(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSize() != null && valueObject.getSize().equals(""))
		{
			valueObject.setSize(null);
		}
		domainObject.setSize(valueObject.getSize());

		return domainObject;
	}

}
