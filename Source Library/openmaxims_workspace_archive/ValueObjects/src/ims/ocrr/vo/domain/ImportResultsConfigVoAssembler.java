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
package ims.ocrr.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Peter Martin
 */
public class ImportResultsConfigVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.ImportResultsConfigVo copy(ims.ocrr.vo.ImportResultsConfigVo valueObjectDest, ims.ocrr.vo.ImportResultsConfigVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ImportResultsConfig(valueObjectSrc.getID_ImportResultsConfig());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Categories
		valueObjectDest.setCategories(valueObjectSrc.getCategories());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createImportResultsConfigVoCollectionFromImportResultsConfig(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.configuration.domain.objects.ImportResultsConfig objects.
	 */
	public static ims.ocrr.vo.ImportResultsConfigVoCollection createImportResultsConfigVoCollectionFromImportResultsConfig(java.util.Set domainObjectSet)	
	{
		return createImportResultsConfigVoCollectionFromImportResultsConfig(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.configuration.domain.objects.ImportResultsConfig objects.
	 */
	public static ims.ocrr.vo.ImportResultsConfigVoCollection createImportResultsConfigVoCollectionFromImportResultsConfig(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.ImportResultsConfigVoCollection voList = new ims.ocrr.vo.ImportResultsConfigVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ocrr.configuration.domain.objects.ImportResultsConfig domainObject = (ims.ocrr.configuration.domain.objects.ImportResultsConfig) iterator.next();
			ims.ocrr.vo.ImportResultsConfigVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.ocrr.configuration.domain.objects.ImportResultsConfig objects.
	 */
	public static ims.ocrr.vo.ImportResultsConfigVoCollection createImportResultsConfigVoCollectionFromImportResultsConfig(java.util.List domainObjectList) 
	{
		return createImportResultsConfigVoCollectionFromImportResultsConfig(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.configuration.domain.objects.ImportResultsConfig objects.
	 */
	public static ims.ocrr.vo.ImportResultsConfigVoCollection createImportResultsConfigVoCollectionFromImportResultsConfig(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.ImportResultsConfigVoCollection voList = new ims.ocrr.vo.ImportResultsConfigVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.configuration.domain.objects.ImportResultsConfig domainObject = (ims.ocrr.configuration.domain.objects.ImportResultsConfig) domainObjectList.get(i);
			ims.ocrr.vo.ImportResultsConfigVo vo = create(map, domainObject);

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
	 * Create the ims.ocrr.configuration.domain.objects.ImportResultsConfig set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractImportResultsConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ImportResultsConfigVoCollection voCollection) 
	 {
	 	return extractImportResultsConfigSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractImportResultsConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ImportResultsConfigVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.ImportResultsConfigVo vo = voCollection.get(i);
			ims.ocrr.configuration.domain.objects.ImportResultsConfig domainObject = ImportResultsConfigVoAssembler.extractImportResultsConfig(domainFactory, vo, domMap);

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
	 * Create the ims.ocrr.configuration.domain.objects.ImportResultsConfig list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractImportResultsConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ImportResultsConfigVoCollection voCollection) 
	 {
	 	return extractImportResultsConfigList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractImportResultsConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ImportResultsConfigVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.ImportResultsConfigVo vo = voCollection.get(i);
			ims.ocrr.configuration.domain.objects.ImportResultsConfig domainObject = ImportResultsConfigVoAssembler.extractImportResultsConfig(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.ocrr.configuration.domain.objects.ImportResultsConfig object.
	 * @param domainObject ims.ocrr.configuration.domain.objects.ImportResultsConfig
	 */
	 public static ims.ocrr.vo.ImportResultsConfigVo create(ims.ocrr.configuration.domain.objects.ImportResultsConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ocrr.configuration.domain.objects.ImportResultsConfig object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ocrr.vo.ImportResultsConfigVo create(DomainObjectMap map, ims.ocrr.configuration.domain.objects.ImportResultsConfig domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.ImportResultsConfigVo valueObject = (ims.ocrr.vo.ImportResultsConfigVo) map.getValueObject(domainObject, ims.ocrr.vo.ImportResultsConfigVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.ImportResultsConfigVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ocrr.configuration.domain.objects.ImportResultsConfig
	 */
	 public static ims.ocrr.vo.ImportResultsConfigVo insert(ims.ocrr.vo.ImportResultsConfigVo valueObject, ims.ocrr.configuration.domain.objects.ImportResultsConfig domainObject) 
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
	 * @param domainObject ims.ocrr.configuration.domain.objects.ImportResultsConfig
	 */
	 public static ims.ocrr.vo.ImportResultsConfigVo insert(DomainObjectMap map, ims.ocrr.vo.ImportResultsConfigVo valueObject, ims.ocrr.configuration.domain.objects.ImportResultsConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ImportResultsConfig(domainObject.getId());
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
			
		// Categories
		java.util.List listCategories = domainObject.getCategories();
		ims.ocrr.vo.lookups.CategoryCollection Categories = new ims.ocrr.vo.lookups.CategoryCollection();
		for(java.util.Iterator iterator = listCategories.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.ocrr.vo.lookups.Category voInstance = new ims.ocrr.vo.lookups.Category(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.ocrr.vo.lookups.Category parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.ocrr.vo.lookups.Category(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			Categories.add(voInstance);
		}
		valueObject.setCategories( Categories );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.configuration.domain.objects.ImportResultsConfig extractImportResultsConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ImportResultsConfigVo valueObject) 
	{
		return 	extractImportResultsConfig(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.configuration.domain.objects.ImportResultsConfig extractImportResultsConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ImportResultsConfigVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ImportResultsConfig();
		ims.ocrr.configuration.domain.objects.ImportResultsConfig domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ocrr.configuration.domain.objects.ImportResultsConfig)domMap.get(valueObject);
			}
			// ims.ocrr.vo.ImportResultsConfigVo ID_ImportResultsConfig field is unknown
			domainObject = new ims.ocrr.configuration.domain.objects.ImportResultsConfig();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ImportResultsConfig());
			if (domMap.get(key) != null)
			{
				return (ims.ocrr.configuration.domain.objects.ImportResultsConfig)domMap.get(key);
			}
			domainObject = (ims.ocrr.configuration.domain.objects.ImportResultsConfig) domainFactory.getDomainObject(ims.ocrr.configuration.domain.objects.ImportResultsConfig.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ImportResultsConfig());

		ims.ocrr.vo.lookups.CategoryCollection collection1 =
	valueObject.getCategories();
	    java.util.List domainCategories = domainObject.getCategories();;			
	    int collection1Size=0;
		if (collection1 == null)
		{
			domainCategories = new java.util.ArrayList(0);
		}
		else
		{
			collection1Size = collection1.size();
		}
		
		for(int i=0; i<collection1Size; i++) 
		{
			int instanceId = collection1.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainCategories.indexOf(dom);
			if (domIdx == -1)
			{
				domainCategories.add(i, dom);
			}
			else if (i != domIdx && i < domainCategories.size())
			{
				Object tmp = domainCategories.get(i);
				domainCategories.set(i, domainCategories.get(domIdx));
				domainCategories.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j1 = domainCategories.size();
		while (j1 > collection1Size)
		{
			domainCategories.remove(j1-1);
			j1 = domainCategories.size();
		}

		domainObject.setCategories(domainCategories);		

		return domainObject;
	}

}
