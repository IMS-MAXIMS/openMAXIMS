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
 * @author Vasile Purdila
 */
public class DataSetTypeVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.DataSetTypeVo copy(ims.core.vo.DataSetTypeVo valueObjectDest, ims.core.vo.DataSetTypeVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_DatasetType(valueObjectSrc.getID_DatasetType());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// Category
		valueObjectDest.setCategory(valueObjectSrc.getCategory());
		// MaxFactor
		valueObjectDest.setMaxFactor(valueObjectSrc.getMaxFactor());
		// MinFactor
		valueObjectDest.setMinFactor(valueObjectSrc.getMinFactor());
		// DefaultLineType
		valueObjectDest.setDefaultLineType(valueObjectSrc.getDefaultLineType());
		// DefLineColPtIcon
		valueObjectDest.setDefLineColPtIcon(valueObjectSrc.getDefLineColPtIcon());
		// NormalBandMaxValueMale
		valueObjectDest.setNormalBandMaxValueMale(valueObjectSrc.getNormalBandMaxValueMale());
		// NormalBandMinValueMale
		valueObjectDest.setNormalBandMinValueMale(valueObjectSrc.getNormalBandMinValueMale());
		// NormalBandMaxValueFemale
		valueObjectDest.setNormalBandMaxValueFemale(valueObjectSrc.getNormalBandMaxValueFemale());
		// NormalBandMinValueFemale
		valueObjectDest.setNormalBandMinValueFemale(valueObjectSrc.getNormalBandMinValueFemale());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// UnitOfMeasure
		valueObjectDest.setUnitOfMeasure(valueObjectSrc.getUnitOfMeasure());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createDataSetTypeVoCollectionFromDatasetType(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.charting.domain.objects.DatasetType objects.
	 */
	public static ims.core.vo.DataSetTypeVoCollection createDataSetTypeVoCollectionFromDatasetType(java.util.Set domainObjectSet)	
	{
		return createDataSetTypeVoCollectionFromDatasetType(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.charting.domain.objects.DatasetType objects.
	 */
	public static ims.core.vo.DataSetTypeVoCollection createDataSetTypeVoCollectionFromDatasetType(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.DataSetTypeVoCollection voList = new ims.core.vo.DataSetTypeVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.charting.domain.objects.DatasetType domainObject = (ims.core.charting.domain.objects.DatasetType) iterator.next();
			ims.core.vo.DataSetTypeVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.charting.domain.objects.DatasetType objects.
	 */
	public static ims.core.vo.DataSetTypeVoCollection createDataSetTypeVoCollectionFromDatasetType(java.util.List domainObjectList) 
	{
		return createDataSetTypeVoCollectionFromDatasetType(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.charting.domain.objects.DatasetType objects.
	 */
	public static ims.core.vo.DataSetTypeVoCollection createDataSetTypeVoCollectionFromDatasetType(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.DataSetTypeVoCollection voList = new ims.core.vo.DataSetTypeVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.charting.domain.objects.DatasetType domainObject = (ims.core.charting.domain.objects.DatasetType) domainObjectList.get(i);
			ims.core.vo.DataSetTypeVo vo = create(map, domainObject);

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
	 * Create the ims.core.charting.domain.objects.DatasetType set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractDatasetTypeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.DataSetTypeVoCollection voCollection) 
	 {
	 	return extractDatasetTypeSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractDatasetTypeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.DataSetTypeVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.DataSetTypeVo vo = voCollection.get(i);
			ims.core.charting.domain.objects.DatasetType domainObject = DataSetTypeVoAssembler.extractDatasetType(domainFactory, vo, domMap);

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
	 * Create the ims.core.charting.domain.objects.DatasetType list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractDatasetTypeList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.DataSetTypeVoCollection voCollection) 
	 {
	 	return extractDatasetTypeList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractDatasetTypeList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.DataSetTypeVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.DataSetTypeVo vo = voCollection.get(i);
			ims.core.charting.domain.objects.DatasetType domainObject = DataSetTypeVoAssembler.extractDatasetType(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.charting.domain.objects.DatasetType object.
	 * @param domainObject ims.core.charting.domain.objects.DatasetType
	 */
	 public static ims.core.vo.DataSetTypeVo create(ims.core.charting.domain.objects.DatasetType domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.charting.domain.objects.DatasetType object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.DataSetTypeVo create(DomainObjectMap map, ims.core.charting.domain.objects.DatasetType domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.DataSetTypeVo valueObject = (ims.core.vo.DataSetTypeVo) map.getValueObject(domainObject, ims.core.vo.DataSetTypeVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.DataSetTypeVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.charting.domain.objects.DatasetType
	 */
	 public static ims.core.vo.DataSetTypeVo insert(ims.core.vo.DataSetTypeVo valueObject, ims.core.charting.domain.objects.DatasetType domainObject) 
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
	 * @param domainObject ims.core.charting.domain.objects.DatasetType
	 */
	 public static ims.core.vo.DataSetTypeVo insert(DomainObjectMap map, ims.core.vo.DataSetTypeVo valueObject, ims.core.charting.domain.objects.DatasetType domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_DatasetType(domainObject.getId());
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
			
		// Name
		valueObject.setName(domainObject.getName());
		// Category
		ims.domain.lookups.LookupInstance instance2 = domainObject.getCategory();
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

			ims.core.vo.lookups.DataSetCategory voLookup2 = new ims.core.vo.lookups.DataSetCategory(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.DataSetCategory parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.DataSetCategory(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setCategory(voLookup2);
		}
				// MaxFactor
		valueObject.setMaxFactor(domainObject.getMaxFactor());
		// MinFactor
		valueObject.setMinFactor(domainObject.getMinFactor());
		// DefaultLineType
		ims.domain.lookups.LookupInstance instance5 = domainObject.getDefaultLineType();
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

			ims.core.vo.lookups.LineType voLookup5 = new ims.core.vo.lookups.LineType(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.LineType parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.LineType(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setDefaultLineType(voLookup5);
		}
				// DefLineColPtIcon
		ims.domain.lookups.LookupInstance instance6 = domainObject.getDefLineColPtIcon();
		if ( null != instance6 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance6.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance6.getImage().getImageId(), instance6.getImage().getImagePath());
			}
			color = instance6.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.LineColourPointIcon voLookup6 = new ims.core.vo.lookups.LineColourPointIcon(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.LineColourPointIcon parentVoLookup6 = voLookup6;
			ims.domain.lookups.LookupInstance parent6 = instance6.getParent();
			while (parent6 != null)
			{
				if (parent6.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent6.getImage().getImageId(), parent6.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent6.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup6.setParent(new ims.core.vo.lookups.LineColourPointIcon(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setDefLineColPtIcon(voLookup6);
		}
				// NormalBandMaxValueMale
		valueObject.setNormalBandMaxValueMale(domainObject.getNormalBandMaxValueMale());
		// NormalBandMinValueMale
		valueObject.setNormalBandMinValueMale(domainObject.getNormalBandMinValueMale());
		// NormalBandMaxValueFemale
		valueObject.setNormalBandMaxValueFemale(domainObject.getNormalBandMaxValueFemale());
		// NormalBandMinValueFemale
		valueObject.setNormalBandMinValueFemale(domainObject.getNormalBandMinValueFemale());
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// UnitOfMeasure
		ims.domain.lookups.LookupInstance instance12 = domainObject.getUnitOfMeasure();
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

			ims.ocrr.vo.lookups.ResultUnitOfMeasure voLookup12 = new ims.ocrr.vo.lookups.ResultUnitOfMeasure(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.ocrr.vo.lookups.ResultUnitOfMeasure parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.ocrr.vo.lookups.ResultUnitOfMeasure(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setUnitOfMeasure(voLookup12);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.charting.domain.objects.DatasetType extractDatasetType(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.DataSetTypeVo valueObject) 
	{
		return 	extractDatasetType(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.charting.domain.objects.DatasetType extractDatasetType(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.DataSetTypeVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_DatasetType();
		ims.core.charting.domain.objects.DatasetType domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.charting.domain.objects.DatasetType)domMap.get(valueObject);
			}
			// ims.core.vo.DataSetTypeVo ID_DatasetType field is unknown
			domainObject = new ims.core.charting.domain.objects.DatasetType();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_DatasetType());
			if (domMap.get(key) != null)
			{
				return (ims.core.charting.domain.objects.DatasetType)domMap.get(key);
			}
			domainObject = (ims.core.charting.domain.objects.DatasetType) domainFactory.getDomainObject(ims.core.charting.domain.objects.DatasetType.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_DatasetType());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getCategory() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getCategory().getID());
		}
		domainObject.setCategory(value2);
		domainObject.setMaxFactor(valueObject.getMaxFactor());
		domainObject.setMinFactor(valueObject.getMinFactor());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getDefaultLineType() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getDefaultLineType().getID());
		}
		domainObject.setDefaultLineType(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getDefLineColPtIcon() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getDefLineColPtIcon().getID());
		}
		domainObject.setDefLineColPtIcon(value6);
		domainObject.setNormalBandMaxValueMale(valueObject.getNormalBandMaxValueMale());
		domainObject.setNormalBandMinValueMale(valueObject.getNormalBandMinValueMale());
		domainObject.setNormalBandMaxValueFemale(valueObject.getNormalBandMaxValueFemale());
		domainObject.setNormalBandMinValueFemale(valueObject.getNormalBandMinValueFemale());
		domainObject.setIsActive(valueObject.getIsActive());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getUnitOfMeasure() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getUnitOfMeasure().getID());
		}
		domainObject.setUnitOfMeasure(value12);

		return domainObject;
	}

}
