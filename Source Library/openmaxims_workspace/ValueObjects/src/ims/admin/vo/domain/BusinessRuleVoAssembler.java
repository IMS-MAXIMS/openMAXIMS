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
 * @author Catalin Tomozei
 */
public class BusinessRuleVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.admin.vo.BusinessRuleVo copy(ims.admin.vo.BusinessRuleVo valueObjectDest, ims.admin.vo.BusinessRuleVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_BusinessRule(valueObjectSrc.getID_BusinessRule());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// Description
		valueObjectDest.setDescription(valueObjectSrc.getDescription());
		// Category
		valueObjectDest.setCategory(valueObjectSrc.getCategory());
		// ValidFrom
		valueObjectDest.setValidFrom(valueObjectSrc.getValidFrom());
		// ValidTo
		valueObjectDest.setValidTo(valueObjectSrc.getValidTo());
		// Priority
		valueObjectDest.setPriority(valueObjectSrc.getPriority());
		// XmlContent
		valueObjectDest.setXmlContent(valueObjectSrc.getXmlContent());
		// Active
		valueObjectDest.setActive(valueObjectSrc.getActive());
		// RootEntity
		valueObjectDest.setRootEntity(valueObjectSrc.getRootEntity());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createBusinessRuleVoCollectionFromBusinessRule(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.BusinessRule objects.
	 */
	public static ims.admin.vo.BusinessRuleVoCollection createBusinessRuleVoCollectionFromBusinessRule(java.util.Set domainObjectSet)	
	{
		return createBusinessRuleVoCollectionFromBusinessRule(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.BusinessRule objects.
	 */
	public static ims.admin.vo.BusinessRuleVoCollection createBusinessRuleVoCollectionFromBusinessRule(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.admin.vo.BusinessRuleVoCollection voList = new ims.admin.vo.BusinessRuleVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.domain.objects.BusinessRule domainObject = (ims.core.admin.domain.objects.BusinessRule) iterator.next();
			ims.admin.vo.BusinessRuleVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.domain.objects.BusinessRule objects.
	 */
	public static ims.admin.vo.BusinessRuleVoCollection createBusinessRuleVoCollectionFromBusinessRule(java.util.List domainObjectList) 
	{
		return createBusinessRuleVoCollectionFromBusinessRule(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.BusinessRule objects.
	 */
	public static ims.admin.vo.BusinessRuleVoCollection createBusinessRuleVoCollectionFromBusinessRule(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.admin.vo.BusinessRuleVoCollection voList = new ims.admin.vo.BusinessRuleVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.BusinessRule domainObject = (ims.core.admin.domain.objects.BusinessRule) domainObjectList.get(i);
			ims.admin.vo.BusinessRuleVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.domain.objects.BusinessRule set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractBusinessRuleSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.BusinessRuleVoCollection voCollection) 
	 {
	 	return extractBusinessRuleSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractBusinessRuleSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.BusinessRuleVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.BusinessRuleVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.BusinessRule domainObject = BusinessRuleVoAssembler.extractBusinessRule(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.domain.objects.BusinessRule list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractBusinessRuleList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.BusinessRuleVoCollection voCollection) 
	 {
	 	return extractBusinessRuleList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractBusinessRuleList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.BusinessRuleVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.BusinessRuleVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.BusinessRule domainObject = BusinessRuleVoAssembler.extractBusinessRule(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.domain.objects.BusinessRule object.
	 * @param domainObject ims.core.admin.domain.objects.BusinessRule
	 */
	 public static ims.admin.vo.BusinessRuleVo create(ims.core.admin.domain.objects.BusinessRule domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.domain.objects.BusinessRule object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.admin.vo.BusinessRuleVo create(DomainObjectMap map, ims.core.admin.domain.objects.BusinessRule domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.admin.vo.BusinessRuleVo valueObject = (ims.admin.vo.BusinessRuleVo) map.getValueObject(domainObject, ims.admin.vo.BusinessRuleVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.admin.vo.BusinessRuleVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.domain.objects.BusinessRule
	 */
	 public static ims.admin.vo.BusinessRuleVo insert(ims.admin.vo.BusinessRuleVo valueObject, ims.core.admin.domain.objects.BusinessRule domainObject) 
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
	 * @param domainObject ims.core.admin.domain.objects.BusinessRule
	 */
	 public static ims.admin.vo.BusinessRuleVo insert(DomainObjectMap map, ims.admin.vo.BusinessRuleVo valueObject, ims.core.admin.domain.objects.BusinessRule domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_BusinessRule(domainObject.getId());
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
		// Description
		valueObject.setDescription(domainObject.getDescription());
		// Category
		ims.domain.lookups.LookupInstance instance3 = domainObject.getCategory();
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

			ims.admin.vo.lookups.BusinessRuleCategory voLookup3 = new ims.admin.vo.lookups.BusinessRuleCategory(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.admin.vo.lookups.BusinessRuleCategory parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.admin.vo.lookups.BusinessRuleCategory(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setCategory(voLookup3);
		}
				// ValidFrom
		java.util.Date ValidFrom = domainObject.getValidFrom();
		if ( null != ValidFrom ) 
		{
			valueObject.setValidFrom(new ims.framework.utils.Date(ValidFrom) );
		}
		// ValidTo
		java.util.Date ValidTo = domainObject.getValidTo();
		if ( null != ValidTo ) 
		{
			valueObject.setValidTo(new ims.framework.utils.Date(ValidTo) );
		}
		// Priority
		valueObject.setPriority(domainObject.getPriority());
		// XmlContent
		valueObject.setXmlContent(domainObject.getXmlContent());
		// Active
		valueObject.setActive( domainObject.isActive() );
		// RootEntity
		valueObject.setRootEntity(domainObject.getRootEntity());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.BusinessRule extractBusinessRule(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.BusinessRuleVo valueObject) 
	{
		return 	extractBusinessRule(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.BusinessRule extractBusinessRule(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.BusinessRuleVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_BusinessRule();
		ims.core.admin.domain.objects.BusinessRule domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.domain.objects.BusinessRule)domMap.get(valueObject);
			}
			// ims.admin.vo.BusinessRuleVo ID_BusinessRule field is unknown
			domainObject = new ims.core.admin.domain.objects.BusinessRule();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_BusinessRule());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.domain.objects.BusinessRule)domMap.get(key);
			}
			domainObject = (ims.core.admin.domain.objects.BusinessRule) domainFactory.getDomainObject(ims.core.admin.domain.objects.BusinessRule.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_BusinessRule());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDescription() != null && valueObject.getDescription().equals(""))
		{
			valueObject.setDescription(null);
		}
		domainObject.setDescription(valueObject.getDescription());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getCategory() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getCategory().getID());
		}
		domainObject.setCategory(value3);
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getValidFrom();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setValidFrom(value4);
		java.util.Date value5 = null;
		ims.framework.utils.Date date5 = valueObject.getValidTo();		
		if ( date5 != null ) 
		{
			value5 = date5.getDate();
		}
		domainObject.setValidTo(value5);
		domainObject.setPriority(valueObject.getPriority());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getXmlContent() != null && valueObject.getXmlContent().equals(""))
		{
			valueObject.setXmlContent(null);
		}
		domainObject.setXmlContent(valueObject.getXmlContent());
		domainObject.setActive(valueObject.getActive());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getRootEntity() != null && valueObject.getRootEntity().equals(""))
		{
			valueObject.setRootEntity(null);
		}
		domainObject.setRootEntity(valueObject.getRootEntity());

		return domainObject;
	}

}
