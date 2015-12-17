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
 * @author Sinead McDermott
 */
public class NutritionalMethodVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.nursing.vo.NutritionalMethodVo copy(ims.nursing.vo.NutritionalMethodVo valueObjectDest, ims.nursing.vo.NutritionalMethodVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_NutritionalMethod(valueObjectSrc.getID_NutritionalMethod());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// NutritionalMethod
		valueObjectDest.setNutritionalMethod(valueObjectSrc.getNutritionalMethod());
		// Site
		valueObjectDest.setSite(valueObjectSrc.getSite());
		// Size
		valueObjectDest.setSize(valueObjectSrc.getSize());
		// Type
		valueObjectDest.setType(valueObjectSrc.getType());
		// DateInserted
		valueObjectDest.setDateInserted(valueObjectSrc.getDateInserted());
		// DateChangeDue
		valueObjectDest.setDateChangeDue(valueObjectSrc.getDateChangeDue());
		// Details
		valueObjectDest.setDetails(valueObjectSrc.getDetails());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createNutritionalMethodVoCollectionFromNutritionalMethod(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.nursing.assessment.domain.objects.NutritionalMethod objects.
	 */
	public static ims.nursing.vo.NutritionalMethodVoCollection createNutritionalMethodVoCollectionFromNutritionalMethod(java.util.Set domainObjectSet)	
	{
		return createNutritionalMethodVoCollectionFromNutritionalMethod(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.nursing.assessment.domain.objects.NutritionalMethod objects.
	 */
	public static ims.nursing.vo.NutritionalMethodVoCollection createNutritionalMethodVoCollectionFromNutritionalMethod(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.nursing.vo.NutritionalMethodVoCollection voList = new ims.nursing.vo.NutritionalMethodVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.nursing.assessment.domain.objects.NutritionalMethod domainObject = (ims.nursing.assessment.domain.objects.NutritionalMethod) iterator.next();
			ims.nursing.vo.NutritionalMethodVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.nursing.assessment.domain.objects.NutritionalMethod objects.
	 */
	public static ims.nursing.vo.NutritionalMethodVoCollection createNutritionalMethodVoCollectionFromNutritionalMethod(java.util.List domainObjectList) 
	{
		return createNutritionalMethodVoCollectionFromNutritionalMethod(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.nursing.assessment.domain.objects.NutritionalMethod objects.
	 */
	public static ims.nursing.vo.NutritionalMethodVoCollection createNutritionalMethodVoCollectionFromNutritionalMethod(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.nursing.vo.NutritionalMethodVoCollection voList = new ims.nursing.vo.NutritionalMethodVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.nursing.assessment.domain.objects.NutritionalMethod domainObject = (ims.nursing.assessment.domain.objects.NutritionalMethod) domainObjectList.get(i);
			ims.nursing.vo.NutritionalMethodVo vo = create(map, domainObject);

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
	 * Create the ims.nursing.assessment.domain.objects.NutritionalMethod set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractNutritionalMethodSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.NutritionalMethodVoCollection voCollection) 
	 {
	 	return extractNutritionalMethodSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractNutritionalMethodSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.NutritionalMethodVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.NutritionalMethodVo vo = voCollection.get(i);
			ims.nursing.assessment.domain.objects.NutritionalMethod domainObject = NutritionalMethodVoAssembler.extractNutritionalMethod(domainFactory, vo, domMap);

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
	 * Create the ims.nursing.assessment.domain.objects.NutritionalMethod list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractNutritionalMethodList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.NutritionalMethodVoCollection voCollection) 
	 {
	 	return extractNutritionalMethodList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractNutritionalMethodList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.NutritionalMethodVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.NutritionalMethodVo vo = voCollection.get(i);
			ims.nursing.assessment.domain.objects.NutritionalMethod domainObject = NutritionalMethodVoAssembler.extractNutritionalMethod(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.nursing.assessment.domain.objects.NutritionalMethod object.
	 * @param domainObject ims.nursing.assessment.domain.objects.NutritionalMethod
	 */
	 public static ims.nursing.vo.NutritionalMethodVo create(ims.nursing.assessment.domain.objects.NutritionalMethod domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.nursing.assessment.domain.objects.NutritionalMethod object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.nursing.vo.NutritionalMethodVo create(DomainObjectMap map, ims.nursing.assessment.domain.objects.NutritionalMethod domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.nursing.vo.NutritionalMethodVo valueObject = (ims.nursing.vo.NutritionalMethodVo) map.getValueObject(domainObject, ims.nursing.vo.NutritionalMethodVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.nursing.vo.NutritionalMethodVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.nursing.assessment.domain.objects.NutritionalMethod
	 */
	 public static ims.nursing.vo.NutritionalMethodVo insert(ims.nursing.vo.NutritionalMethodVo valueObject, ims.nursing.assessment.domain.objects.NutritionalMethod domainObject) 
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
	 * @param domainObject ims.nursing.assessment.domain.objects.NutritionalMethod
	 */
	 public static ims.nursing.vo.NutritionalMethodVo insert(DomainObjectMap map, ims.nursing.vo.NutritionalMethodVo valueObject, ims.nursing.assessment.domain.objects.NutritionalMethod domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_NutritionalMethod(domainObject.getId());
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
			
		// NutritionalMethod
		ims.domain.lookups.LookupInstance instance1 = domainObject.getNutritionalMethod();
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

			ims.nursing.vo.lookups.NutritionalMethod voLookup1 = new ims.nursing.vo.lookups.NutritionalMethod(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.nursing.vo.lookups.NutritionalMethod parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.nursing.vo.lookups.NutritionalMethod(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setNutritionalMethod(voLookup1);
		}
				// Site
		ims.domain.lookups.LookupInstance instance2 = domainObject.getSite();
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

			ims.nursing.vo.lookups.NutritionalMethodSite voLookup2 = new ims.nursing.vo.lookups.NutritionalMethodSite(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.nursing.vo.lookups.NutritionalMethodSite parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.nursing.vo.lookups.NutritionalMethodSite(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setSite(voLookup2);
		}
				// Size
		valueObject.setSize(domainObject.getSize());
		// Type
		ims.domain.lookups.LookupInstance instance4 = domainObject.getType();
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

			ims.nursing.vo.lookups.NutritionalMethodType voLookup4 = new ims.nursing.vo.lookups.NutritionalMethodType(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.nursing.vo.lookups.NutritionalMethodType parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.nursing.vo.lookups.NutritionalMethodType(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setType(voLookup4);
		}
				// DateInserted
		java.util.Date DateInserted = domainObject.getDateInserted();
		if ( null != DateInserted ) 
		{
			valueObject.setDateInserted(new ims.framework.utils.Date(DateInserted) );
		}
		// DateChangeDue
		java.util.Date DateChangeDue = domainObject.getDateChangeDue();
		if ( null != DateChangeDue ) 
		{
			valueObject.setDateChangeDue(new ims.framework.utils.Date(DateChangeDue) );
		}
		// Details
		valueObject.setDetails(domainObject.getDetails());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.nursing.assessment.domain.objects.NutritionalMethod extractNutritionalMethod(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.NutritionalMethodVo valueObject) 
	{
		return 	extractNutritionalMethod(domainFactory, valueObject, new HashMap());
	}

	public static ims.nursing.assessment.domain.objects.NutritionalMethod extractNutritionalMethod(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.NutritionalMethodVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_NutritionalMethod();
		ims.nursing.assessment.domain.objects.NutritionalMethod domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.nursing.assessment.domain.objects.NutritionalMethod)domMap.get(valueObject);
			}
			// ims.nursing.vo.NutritionalMethodVo ID_NutritionalMethod field is unknown
			domainObject = new ims.nursing.assessment.domain.objects.NutritionalMethod();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_NutritionalMethod());
			if (domMap.get(key) != null)
			{
				return (ims.nursing.assessment.domain.objects.NutritionalMethod)domMap.get(key);
			}
			domainObject = (ims.nursing.assessment.domain.objects.NutritionalMethod) domainFactory.getDomainObject(ims.nursing.assessment.domain.objects.NutritionalMethod.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_NutritionalMethod());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getNutritionalMethod() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getNutritionalMethod().getID());
		}
		domainObject.setNutritionalMethod(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getSite() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getSite().getID());
		}
		domainObject.setSite(value2);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSize() != null && valueObject.getSize().equals(""))
		{
			valueObject.setSize(null);
		}
		domainObject.setSize(valueObject.getSize());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getType() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getType().getID());
		}
		domainObject.setType(value4);
		java.util.Date value5 = null;
		ims.framework.utils.Date date5 = valueObject.getDateInserted();		
		if ( date5 != null ) 
		{
			value5 = date5.getDate();
		}
		domainObject.setDateInserted(value5);
		java.util.Date value6 = null;
		ims.framework.utils.Date date6 = valueObject.getDateChangeDue();		
		if ( date6 != null ) 
		{
			value6 = date6.getDate();
		}
		domainObject.setDateChangeDue(value6);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDetails() != null && valueObject.getDetails().equals(""))
		{
			valueObject.setDetails(null);
		}
		domainObject.setDetails(valueObject.getDetails());

		return domainObject;
	}

}
