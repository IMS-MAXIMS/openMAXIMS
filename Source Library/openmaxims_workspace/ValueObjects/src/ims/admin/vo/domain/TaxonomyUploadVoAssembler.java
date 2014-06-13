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
package ims.admin.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Sean Nesbitt
 */
public class TaxonomyUploadVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.admin.vo.TaxonomyUploadVo copy(ims.admin.vo.TaxonomyUploadVo valueObjectDest, ims.admin.vo.TaxonomyUploadVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_TaxonomyUpload(valueObjectSrc.getID_TaxonomyUpload());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TaxonomyColumnMapFilename
		valueObjectDest.setTaxonomyColumnMapFilename(valueObjectSrc.getTaxonomyColumnMapFilename());
		// TaxonomyCode
		valueObjectDest.setTaxonomyCode(valueObjectSrc.getTaxonomyCode());
		// TaxonomyFilename
		valueObjectDest.setTaxonomyFilename(valueObjectSrc.getTaxonomyFilename());
		// FileType
		valueObjectDest.setFileType(valueObjectSrc.getFileType());
		// TaxonomyElement
		valueObjectDest.setTaxonomyElement(valueObjectSrc.getTaxonomyElement());
		// Delimeter
		valueObjectDest.setDelimeter(valueObjectSrc.getDelimeter());
		// Qualifier
		valueObjectDest.setQualifier(valueObjectSrc.getQualifier());
		// deleteFirst
		valueObjectDest.setDeleteFirst(valueObjectSrc.getDeleteFirst());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTaxonomyUploadVoCollectionFromTaxonomyUpload(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.TaxonomyUpload objects.
	 */
	public static ims.admin.vo.TaxonomyUploadVoCollection createTaxonomyUploadVoCollectionFromTaxonomyUpload(java.util.Set domainObjectSet)	
	{
		return createTaxonomyUploadVoCollectionFromTaxonomyUpload(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.TaxonomyUpload objects.
	 */
	public static ims.admin.vo.TaxonomyUploadVoCollection createTaxonomyUploadVoCollectionFromTaxonomyUpload(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.admin.vo.TaxonomyUploadVoCollection voList = new ims.admin.vo.TaxonomyUploadVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.domain.objects.TaxonomyUpload domainObject = (ims.core.admin.domain.objects.TaxonomyUpload) iterator.next();
			ims.admin.vo.TaxonomyUploadVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.domain.objects.TaxonomyUpload objects.
	 */
	public static ims.admin.vo.TaxonomyUploadVoCollection createTaxonomyUploadVoCollectionFromTaxonomyUpload(java.util.List domainObjectList) 
	{
		return createTaxonomyUploadVoCollectionFromTaxonomyUpload(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.TaxonomyUpload objects.
	 */
	public static ims.admin.vo.TaxonomyUploadVoCollection createTaxonomyUploadVoCollectionFromTaxonomyUpload(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.admin.vo.TaxonomyUploadVoCollection voList = new ims.admin.vo.TaxonomyUploadVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.TaxonomyUpload domainObject = (ims.core.admin.domain.objects.TaxonomyUpload) domainObjectList.get(i);
			ims.admin.vo.TaxonomyUploadVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.domain.objects.TaxonomyUpload set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTaxonomyUploadSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.TaxonomyUploadVoCollection voCollection) 
	 {
	 	return extractTaxonomyUploadSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTaxonomyUploadSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.TaxonomyUploadVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.TaxonomyUploadVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.TaxonomyUpload domainObject = TaxonomyUploadVoAssembler.extractTaxonomyUpload(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.domain.objects.TaxonomyUpload list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTaxonomyUploadList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.TaxonomyUploadVoCollection voCollection) 
	 {
	 	return extractTaxonomyUploadList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTaxonomyUploadList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.TaxonomyUploadVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.TaxonomyUploadVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.TaxonomyUpload domainObject = TaxonomyUploadVoAssembler.extractTaxonomyUpload(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.domain.objects.TaxonomyUpload object.
	 * @param domainObject ims.core.admin.domain.objects.TaxonomyUpload
	 */
	 public static ims.admin.vo.TaxonomyUploadVo create(ims.core.admin.domain.objects.TaxonomyUpload domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.domain.objects.TaxonomyUpload object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.admin.vo.TaxonomyUploadVo create(DomainObjectMap map, ims.core.admin.domain.objects.TaxonomyUpload domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.admin.vo.TaxonomyUploadVo valueObject = (ims.admin.vo.TaxonomyUploadVo) map.getValueObject(domainObject, ims.admin.vo.TaxonomyUploadVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.admin.vo.TaxonomyUploadVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.domain.objects.TaxonomyUpload
	 */
	 public static ims.admin.vo.TaxonomyUploadVo insert(ims.admin.vo.TaxonomyUploadVo valueObject, ims.core.admin.domain.objects.TaxonomyUpload domainObject) 
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
	 * @param domainObject ims.core.admin.domain.objects.TaxonomyUpload
	 */
	 public static ims.admin.vo.TaxonomyUploadVo insert(DomainObjectMap map, ims.admin.vo.TaxonomyUploadVo valueObject, ims.core.admin.domain.objects.TaxonomyUpload domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_TaxonomyUpload(domainObject.getId());
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
			
		// TaxonomyColumnMapFilename
		valueObject.setTaxonomyColumnMapFilename(domainObject.getTaxonomyColumnMapFilename());
		// TaxonomyCode
		ims.domain.lookups.LookupInstance instance2 = domainObject.getTaxonomyCode();
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

			ims.core.vo.lookups.TaxonomyType voLookup2 = new ims.core.vo.lookups.TaxonomyType(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.TaxonomyType parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.TaxonomyType(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setTaxonomyCode(voLookup2);
		}
				// TaxonomyFilename
		valueObject.setTaxonomyFilename(domainObject.getTaxonomyFilename());
		// FileType
		ims.domain.lookups.LookupInstance instance4 = domainObject.getFileType();
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

			ims.admin.vo.lookups.FileFormatType voLookup4 = new ims.admin.vo.lookups.FileFormatType(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.admin.vo.lookups.FileFormatType parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.admin.vo.lookups.FileFormatType(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setFileType(voLookup4);
		}
				// TaxonomyElement
		ims.domain.lookups.LookupInstance instance5 = domainObject.getTaxonomyElement();
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

			ims.core.vo.lookups.TaxonomyElement voLookup5 = new ims.core.vo.lookups.TaxonomyElement(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.TaxonomyElement parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.TaxonomyElement(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setTaxonomyElement(voLookup5);
		}
				// Delimeter
		valueObject.setDelimeter(domainObject.getDelimeter());
		// Qualifier
		valueObject.setQualifier(domainObject.getQualifier());
		// deleteFirst
		valueObject.setDeleteFirst( domainObject.isDeleteFirst() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.TaxonomyUpload extractTaxonomyUpload(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.TaxonomyUploadVo valueObject) 
	{
		return 	extractTaxonomyUpload(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.TaxonomyUpload extractTaxonomyUpload(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.TaxonomyUploadVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_TaxonomyUpload();
		ims.core.admin.domain.objects.TaxonomyUpload domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.domain.objects.TaxonomyUpload)domMap.get(valueObject);
			}
			// ims.admin.vo.TaxonomyUploadVo ID_TaxonomyUpload field is unknown
			domainObject = new ims.core.admin.domain.objects.TaxonomyUpload();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_TaxonomyUpload());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.domain.objects.TaxonomyUpload)domMap.get(key);
			}
			domainObject = (ims.core.admin.domain.objects.TaxonomyUpload) domainFactory.getDomainObject(ims.core.admin.domain.objects.TaxonomyUpload.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_TaxonomyUpload());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTaxonomyColumnMapFilename() != null && valueObject.getTaxonomyColumnMapFilename().equals(""))
		{
			valueObject.setTaxonomyColumnMapFilename(null);
		}
		domainObject.setTaxonomyColumnMapFilename(valueObject.getTaxonomyColumnMapFilename());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getTaxonomyCode() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getTaxonomyCode().getID());
		}
		domainObject.setTaxonomyCode(value2);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTaxonomyFilename() != null && valueObject.getTaxonomyFilename().equals(""))
		{
			valueObject.setTaxonomyFilename(null);
		}
		domainObject.setTaxonomyFilename(valueObject.getTaxonomyFilename());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getFileType() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getFileType().getID());
		}
		domainObject.setFileType(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getTaxonomyElement() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getTaxonomyElement().getID());
		}
		domainObject.setTaxonomyElement(value5);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDelimeter() != null && valueObject.getDelimeter().equals(""))
		{
			valueObject.setDelimeter(null);
		}
		domainObject.setDelimeter(valueObject.getDelimeter());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getQualifier() != null && valueObject.getQualifier().equals(""))
		{
			valueObject.setQualifier(null);
		}
		domainObject.setQualifier(valueObject.getQualifier());
		domainObject.setDeleteFirst(valueObject.getDeleteFirst());

		return domainObject;
	}

}
