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
 * @author Marius Mihalec
 */
public class OrderEntryTemplateComponentShortVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.OrderEntryTemplateComponentShortVo copy(ims.ocrr.vo.OrderEntryTemplateComponentShortVo valueObjectDest, ims.ocrr.vo.OrderEntryTemplateComponentShortVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_OrderEntryTemplateComponent(valueObjectSrc.getID_OrderEntryTemplateComponent());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Sequence
		valueObjectDest.setSequence(valueObjectSrc.getSequence());
		// Investigation
		valueObjectDest.setInvestigation(valueObjectSrc.getInvestigation());
		// OrderSet
		valueObjectDest.setOrderSet(valueObjectSrc.getOrderSet());
		// Divider
		valueObjectDest.setDivider(valueObjectSrc.getDivider());
		// DividerIsBold
		valueObjectDest.setDividerIsBold(valueObjectSrc.getDividerIsBold());
		// DividerText
		valueObjectDest.setDividerText(valueObjectSrc.getDividerText());
		// DividerColour
		valueObjectDest.setDividerColour(valueObjectSrc.getDividerColour());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createOrderEntryTemplateComponentShortVoCollectionFromOrderEntryTemplateComponent(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.configuration.domain.objects.OrderEntryTemplateComponent objects.
	 */
	public static ims.ocrr.vo.OrderEntryTemplateComponentShortVoCollection createOrderEntryTemplateComponentShortVoCollectionFromOrderEntryTemplateComponent(java.util.Set domainObjectSet)	
	{
		return createOrderEntryTemplateComponentShortVoCollectionFromOrderEntryTemplateComponent(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.configuration.domain.objects.OrderEntryTemplateComponent objects.
	 */
	public static ims.ocrr.vo.OrderEntryTemplateComponentShortVoCollection createOrderEntryTemplateComponentShortVoCollectionFromOrderEntryTemplateComponent(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.OrderEntryTemplateComponentShortVoCollection voList = new ims.ocrr.vo.OrderEntryTemplateComponentShortVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ocrr.configuration.domain.objects.OrderEntryTemplateComponent domainObject = (ims.ocrr.configuration.domain.objects.OrderEntryTemplateComponent) iterator.next();
			ims.ocrr.vo.OrderEntryTemplateComponentShortVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.ocrr.configuration.domain.objects.OrderEntryTemplateComponent objects.
	 */
	public static ims.ocrr.vo.OrderEntryTemplateComponentShortVoCollection createOrderEntryTemplateComponentShortVoCollectionFromOrderEntryTemplateComponent(java.util.List domainObjectList) 
	{
		return createOrderEntryTemplateComponentShortVoCollectionFromOrderEntryTemplateComponent(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.configuration.domain.objects.OrderEntryTemplateComponent objects.
	 */
	public static ims.ocrr.vo.OrderEntryTemplateComponentShortVoCollection createOrderEntryTemplateComponentShortVoCollectionFromOrderEntryTemplateComponent(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.OrderEntryTemplateComponentShortVoCollection voList = new ims.ocrr.vo.OrderEntryTemplateComponentShortVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.configuration.domain.objects.OrderEntryTemplateComponent domainObject = (ims.ocrr.configuration.domain.objects.OrderEntryTemplateComponent) domainObjectList.get(i);
			ims.ocrr.vo.OrderEntryTemplateComponentShortVo vo = create(map, domainObject);

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
	 * Create the ims.ocrr.configuration.domain.objects.OrderEntryTemplateComponent set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractOrderEntryTemplateComponentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderEntryTemplateComponentShortVoCollection voCollection) 
	 {
	 	return extractOrderEntryTemplateComponentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOrderEntryTemplateComponentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderEntryTemplateComponentShortVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.OrderEntryTemplateComponentShortVo vo = voCollection.get(i);
			ims.ocrr.configuration.domain.objects.OrderEntryTemplateComponent domainObject = OrderEntryTemplateComponentShortVoAssembler.extractOrderEntryTemplateComponent(domainFactory, vo, domMap);

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
	 * Create the ims.ocrr.configuration.domain.objects.OrderEntryTemplateComponent list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractOrderEntryTemplateComponentList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderEntryTemplateComponentShortVoCollection voCollection) 
	 {
	 	return extractOrderEntryTemplateComponentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOrderEntryTemplateComponentList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderEntryTemplateComponentShortVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.OrderEntryTemplateComponentShortVo vo = voCollection.get(i);
			ims.ocrr.configuration.domain.objects.OrderEntryTemplateComponent domainObject = OrderEntryTemplateComponentShortVoAssembler.extractOrderEntryTemplateComponent(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.ocrr.configuration.domain.objects.OrderEntryTemplateComponent object.
	 * @param domainObject ims.ocrr.configuration.domain.objects.OrderEntryTemplateComponent
	 */
	 public static ims.ocrr.vo.OrderEntryTemplateComponentShortVo create(ims.ocrr.configuration.domain.objects.OrderEntryTemplateComponent domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ocrr.configuration.domain.objects.OrderEntryTemplateComponent object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ocrr.vo.OrderEntryTemplateComponentShortVo create(DomainObjectMap map, ims.ocrr.configuration.domain.objects.OrderEntryTemplateComponent domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.OrderEntryTemplateComponentShortVo valueObject = (ims.ocrr.vo.OrderEntryTemplateComponentShortVo) map.getValueObject(domainObject, ims.ocrr.vo.OrderEntryTemplateComponentShortVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.OrderEntryTemplateComponentShortVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ocrr.configuration.domain.objects.OrderEntryTemplateComponent
	 */
	 public static ims.ocrr.vo.OrderEntryTemplateComponentShortVo insert(ims.ocrr.vo.OrderEntryTemplateComponentShortVo valueObject, ims.ocrr.configuration.domain.objects.OrderEntryTemplateComponent domainObject) 
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
	 * @param domainObject ims.ocrr.configuration.domain.objects.OrderEntryTemplateComponent
	 */
	 public static ims.ocrr.vo.OrderEntryTemplateComponentShortVo insert(DomainObjectMap map, ims.ocrr.vo.OrderEntryTemplateComponentShortVo valueObject, ims.ocrr.configuration.domain.objects.OrderEntryTemplateComponent domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_OrderEntryTemplateComponent(domainObject.getId());
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
			
		// Sequence
		valueObject.setSequence(domainObject.getSequence());
		// Investigation
		valueObject.setInvestigation(ims.ocrr.vo.domain.InvestShortVoAssembler.create(map, domainObject.getInvestigation()) );
		// OrderSet
		valueObject.setOrderSet(ims.ocrr.vo.domain.OrderSetForHelpTextVoAssembler.create(map, domainObject.getOrderSet()) );
		// Divider
		ims.domain.lookups.LookupInstance instance4 = domainObject.getDivider();
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

			ims.ocrr.vo.lookups.TemplateDividerType voLookup4 = new ims.ocrr.vo.lookups.TemplateDividerType(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.ocrr.vo.lookups.TemplateDividerType parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.ocrr.vo.lookups.TemplateDividerType(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setDivider(voLookup4);
		}
				// DividerIsBold
		valueObject.setDividerIsBold( domainObject.isDividerIsBold() );
		// DividerText
		valueObject.setDividerText(domainObject.getDividerText());
		// DividerColour
		valueObject.setDividerColour(domainObject.getDividerColour());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.configuration.domain.objects.OrderEntryTemplateComponent extractOrderEntryTemplateComponent(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderEntryTemplateComponentShortVo valueObject) 
	{
		return 	extractOrderEntryTemplateComponent(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.configuration.domain.objects.OrderEntryTemplateComponent extractOrderEntryTemplateComponent(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderEntryTemplateComponentShortVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_OrderEntryTemplateComponent();
		ims.ocrr.configuration.domain.objects.OrderEntryTemplateComponent domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ocrr.configuration.domain.objects.OrderEntryTemplateComponent)domMap.get(valueObject);
			}
			// ims.ocrr.vo.OrderEntryTemplateComponentShortVo ID_OrderEntryTemplateComponent field is unknown
			domainObject = new ims.ocrr.configuration.domain.objects.OrderEntryTemplateComponent();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_OrderEntryTemplateComponent());
			if (domMap.get(key) != null)
			{
				return (ims.ocrr.configuration.domain.objects.OrderEntryTemplateComponent)domMap.get(key);
			}
			domainObject = (ims.ocrr.configuration.domain.objects.OrderEntryTemplateComponent) domainFactory.getDomainObject(ims.ocrr.configuration.domain.objects.OrderEntryTemplateComponent.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_OrderEntryTemplateComponent());

		domainObject.setSequence(valueObject.getSequence());
		domainObject.setInvestigation(ims.ocrr.vo.domain.InvestShortVoAssembler.extractInvestigation(domainFactory, valueObject.getInvestigation(), domMap));
		domainObject.setOrderSet(ims.ocrr.vo.domain.OrderSetForHelpTextVoAssembler.extractOrderSet(domainFactory, valueObject.getOrderSet(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getDivider() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getDivider().getID());
		}
		domainObject.setDivider(value4);
		domainObject.setDividerIsBold(valueObject.getDividerIsBold());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDividerText() != null && valueObject.getDividerText().equals(""))
		{
			valueObject.setDividerText(null);
		}
		domainObject.setDividerText(valueObject.getDividerText());
		domainObject.setDividerColour(valueObject.getDividerColour());

		return domainObject;
	}

}
