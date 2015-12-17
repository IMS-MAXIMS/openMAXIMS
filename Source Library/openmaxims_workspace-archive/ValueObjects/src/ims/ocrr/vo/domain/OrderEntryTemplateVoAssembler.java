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
package ims.ocrr.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Marius Mihalec
 */
public class OrderEntryTemplateVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.OrderEntryTemplateVo copy(ims.ocrr.vo.OrderEntryTemplateVo valueObjectDest, ims.ocrr.vo.OrderEntryTemplateVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_OrderEntryTemplate(valueObjectSrc.getID_OrderEntryTemplate());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// MenuName
		valueObjectDest.setMenuName(valueObjectSrc.getMenuName());
		// Description
		valueObjectDest.setDescription(valueObjectSrc.getDescription());
		// Components
		valueObjectDest.setComponents(valueObjectSrc.getComponents());
		// TemplateCategory
		valueObjectDest.setTemplateCategory(valueObjectSrc.getTemplateCategory());
		// ActiveStatus
		valueObjectDest.setActiveStatus(valueObjectSrc.getActiveStatus());
		// TemplatesLocations
		valueObjectDest.setTemplatesLocations(valueObjectSrc.getTemplatesLocations());
		// Columns
		valueObjectDest.setColumns(valueObjectSrc.getColumns());
		// TemplateRoles
		valueObjectDest.setTemplateRoles(valueObjectSrc.getTemplateRoles());
		// FormText
		valueObjectDest.setFormText(valueObjectSrc.getFormText());
		// FormName
		valueObjectDest.setFormName(valueObjectSrc.getFormName());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createOrderEntryTemplateVoCollectionFromOrderEntryTemplate(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.configuration.domain.objects.OrderEntryTemplate objects.
	 */
	public static ims.ocrr.vo.OrderEntryTemplateVoCollection createOrderEntryTemplateVoCollectionFromOrderEntryTemplate(java.util.Set domainObjectSet)	
	{
		return createOrderEntryTemplateVoCollectionFromOrderEntryTemplate(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.configuration.domain.objects.OrderEntryTemplate objects.
	 */
	public static ims.ocrr.vo.OrderEntryTemplateVoCollection createOrderEntryTemplateVoCollectionFromOrderEntryTemplate(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.OrderEntryTemplateVoCollection voList = new ims.ocrr.vo.OrderEntryTemplateVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ocrr.configuration.domain.objects.OrderEntryTemplate domainObject = (ims.ocrr.configuration.domain.objects.OrderEntryTemplate) iterator.next();
			ims.ocrr.vo.OrderEntryTemplateVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.ocrr.configuration.domain.objects.OrderEntryTemplate objects.
	 */
	public static ims.ocrr.vo.OrderEntryTemplateVoCollection createOrderEntryTemplateVoCollectionFromOrderEntryTemplate(java.util.List domainObjectList) 
	{
		return createOrderEntryTemplateVoCollectionFromOrderEntryTemplate(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.configuration.domain.objects.OrderEntryTemplate objects.
	 */
	public static ims.ocrr.vo.OrderEntryTemplateVoCollection createOrderEntryTemplateVoCollectionFromOrderEntryTemplate(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.OrderEntryTemplateVoCollection voList = new ims.ocrr.vo.OrderEntryTemplateVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.configuration.domain.objects.OrderEntryTemplate domainObject = (ims.ocrr.configuration.domain.objects.OrderEntryTemplate) domainObjectList.get(i);
			ims.ocrr.vo.OrderEntryTemplateVo vo = create(map, domainObject);

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
	 * Create the ims.ocrr.configuration.domain.objects.OrderEntryTemplate set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractOrderEntryTemplateSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderEntryTemplateVoCollection voCollection) 
	 {
	 	return extractOrderEntryTemplateSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOrderEntryTemplateSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderEntryTemplateVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.OrderEntryTemplateVo vo = voCollection.get(i);
			ims.ocrr.configuration.domain.objects.OrderEntryTemplate domainObject = OrderEntryTemplateVoAssembler.extractOrderEntryTemplate(domainFactory, vo, domMap);

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
	 * Create the ims.ocrr.configuration.domain.objects.OrderEntryTemplate list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractOrderEntryTemplateList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderEntryTemplateVoCollection voCollection) 
	 {
	 	return extractOrderEntryTemplateList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOrderEntryTemplateList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderEntryTemplateVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.OrderEntryTemplateVo vo = voCollection.get(i);
			ims.ocrr.configuration.domain.objects.OrderEntryTemplate domainObject = OrderEntryTemplateVoAssembler.extractOrderEntryTemplate(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.ocrr.configuration.domain.objects.OrderEntryTemplate object.
	 * @param domainObject ims.ocrr.configuration.domain.objects.OrderEntryTemplate
	 */
	 public static ims.ocrr.vo.OrderEntryTemplateVo create(ims.ocrr.configuration.domain.objects.OrderEntryTemplate domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ocrr.configuration.domain.objects.OrderEntryTemplate object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ocrr.vo.OrderEntryTemplateVo create(DomainObjectMap map, ims.ocrr.configuration.domain.objects.OrderEntryTemplate domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.OrderEntryTemplateVo valueObject = (ims.ocrr.vo.OrderEntryTemplateVo) map.getValueObject(domainObject, ims.ocrr.vo.OrderEntryTemplateVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.OrderEntryTemplateVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ocrr.configuration.domain.objects.OrderEntryTemplate
	 */
	 public static ims.ocrr.vo.OrderEntryTemplateVo insert(ims.ocrr.vo.OrderEntryTemplateVo valueObject, ims.ocrr.configuration.domain.objects.OrderEntryTemplate domainObject) 
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
	 * @param domainObject ims.ocrr.configuration.domain.objects.OrderEntryTemplate
	 */
	 public static ims.ocrr.vo.OrderEntryTemplateVo insert(DomainObjectMap map, ims.ocrr.vo.OrderEntryTemplateVo valueObject, ims.ocrr.configuration.domain.objects.OrderEntryTemplate domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_OrderEntryTemplate(domainObject.getId());
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
			
		// MenuName
		valueObject.setMenuName(domainObject.getMenuName());
		// Description
		valueObject.setDescription(domainObject.getDescription());
		// Components
		valueObject.setComponents(ims.ocrr.vo.domain.OrderEntryTemplateComponentShortVoAssembler.createOrderEntryTemplateComponentShortVoCollectionFromOrderEntryTemplateComponent(map, domainObject.getComponents()) );
		// TemplateCategory
		ims.domain.lookups.LookupInstance instance4 = domainObject.getTemplateCategory();
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

			ims.ocrr.vo.lookups.TemplateCategories voLookup4 = new ims.ocrr.vo.lookups.TemplateCategories(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.ocrr.vo.lookups.TemplateCategories parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.ocrr.vo.lookups.TemplateCategories(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setTemplateCategory(voLookup4);
		}
				// ActiveStatus
		ims.domain.lookups.LookupInstance instance5 = domainObject.getActiveStatus();
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
			valueObject.setActiveStatus(voLookup5);
		}
				// TemplatesLocations
		valueObject.setTemplatesLocations(ims.ocrr.vo.domain.TemplateLocationShortVoAssembler.createTemplateLocationShortVoCollectionFromTemplateLocation(map, domainObject.getTemplatesLocations()) );
		// Columns
		valueObject.setColumns(ims.ocrr.vo.domain.OrderEntryTemplateColumnVoAssembler.createOrderEntryTemplateColumnVoCollectionFromOrderEntryTemplateColumn(map, domainObject.getColumns()) );
		// TemplateRoles
		valueObject.setTemplateRoles(ims.ocrr.vo.domain.TemplateRoleShortVoAssembler.createTemplateRoleShortVoCollectionFromTemplateRole(map, domainObject.getTemplateRoles()) );
		// FormText
		valueObject.setFormText(domainObject.getFormText());
		// FormName
		valueObject.setFormName(domainObject.getFormName());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.configuration.domain.objects.OrderEntryTemplate extractOrderEntryTemplate(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderEntryTemplateVo valueObject) 
	{
		return 	extractOrderEntryTemplate(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.configuration.domain.objects.OrderEntryTemplate extractOrderEntryTemplate(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderEntryTemplateVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_OrderEntryTemplate();
		ims.ocrr.configuration.domain.objects.OrderEntryTemplate domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ocrr.configuration.domain.objects.OrderEntryTemplate)domMap.get(valueObject);
			}
			// ims.ocrr.vo.OrderEntryTemplateVo ID_OrderEntryTemplate field is unknown
			domainObject = new ims.ocrr.configuration.domain.objects.OrderEntryTemplate();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_OrderEntryTemplate());
			if (domMap.get(key) != null)
			{
				return (ims.ocrr.configuration.domain.objects.OrderEntryTemplate)domMap.get(key);
			}
			domainObject = (ims.ocrr.configuration.domain.objects.OrderEntryTemplate) domainFactory.getDomainObject(ims.ocrr.configuration.domain.objects.OrderEntryTemplate.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_OrderEntryTemplate());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getMenuName() != null && valueObject.getMenuName().equals(""))
		{
			valueObject.setMenuName(null);
		}
		domainObject.setMenuName(valueObject.getMenuName());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDescription() != null && valueObject.getDescription().equals(""))
		{
			valueObject.setDescription(null);
		}
		domainObject.setDescription(valueObject.getDescription());
		domainObject.setComponents(ims.ocrr.vo.domain.OrderEntryTemplateComponentShortVoAssembler.extractOrderEntryTemplateComponentSet(domainFactory, valueObject.getComponents(), domainObject.getComponents(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getTemplateCategory() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getTemplateCategory().getID());
		}
		domainObject.setTemplateCategory(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getActiveStatus() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getActiveStatus().getID());
		}
		domainObject.setActiveStatus(value5);
		domainObject.setTemplatesLocations(ims.ocrr.vo.domain.TemplateLocationShortVoAssembler.extractTemplateLocationSet(domainFactory, valueObject.getTemplatesLocations(), domainObject.getTemplatesLocations(), domMap));		
		domainObject.setColumns(ims.ocrr.vo.domain.OrderEntryTemplateColumnVoAssembler.extractOrderEntryTemplateColumnSet(domainFactory, valueObject.getColumns(), domainObject.getColumns(), domMap));		
		domainObject.setTemplateRoles(ims.ocrr.vo.domain.TemplateRoleShortVoAssembler.extractTemplateRoleSet(domainFactory, valueObject.getTemplateRoles(), domainObject.getTemplateRoles(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getFormText() != null && valueObject.getFormText().equals(""))
		{
			valueObject.setFormText(null);
		}
		domainObject.setFormText(valueObject.getFormText());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getFormName() != null && valueObject.getFormName().equals(""))
		{
			valueObject.setFormName(null);
		}
		domainObject.setFormName(valueObject.getFormName());

		return domainObject;
	}

}
