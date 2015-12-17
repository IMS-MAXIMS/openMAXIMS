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
 * @author Cristian Belciug
 */
public class OrderSetForHelpTextVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.OrderSetForHelpTextVo copy(ims.ocrr.vo.OrderSetForHelpTextVo valueObjectDest, ims.ocrr.vo.OrderSetForHelpTextVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_OrderSet(valueObjectSrc.getID_OrderSet());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Component
		valueObjectDest.setComponent(valueObjectSrc.getComponent());
		// HelpText
		valueObjectDest.setHelpText(valueObjectSrc.getHelpText());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// Description
		valueObjectDest.setDescription(valueObjectSrc.getDescription());
		// ActiveStatus
		valueObjectDest.setActiveStatus(valueObjectSrc.getActiveStatus());
		// Color
		valueObjectDest.setColor(valueObjectSrc.getColor());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createOrderSetForHelpTextVoCollectionFromOrderSet(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.configuration.domain.objects.OrderSet objects.
	 */
	public static ims.ocrr.vo.OrderSetForHelpTextVoCollection createOrderSetForHelpTextVoCollectionFromOrderSet(java.util.Set domainObjectSet)	
	{
		return createOrderSetForHelpTextVoCollectionFromOrderSet(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.configuration.domain.objects.OrderSet objects.
	 */
	public static ims.ocrr.vo.OrderSetForHelpTextVoCollection createOrderSetForHelpTextVoCollectionFromOrderSet(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.OrderSetForHelpTextVoCollection voList = new ims.ocrr.vo.OrderSetForHelpTextVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ocrr.configuration.domain.objects.OrderSet domainObject = (ims.ocrr.configuration.domain.objects.OrderSet) iterator.next();
			ims.ocrr.vo.OrderSetForHelpTextVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.ocrr.configuration.domain.objects.OrderSet objects.
	 */
	public static ims.ocrr.vo.OrderSetForHelpTextVoCollection createOrderSetForHelpTextVoCollectionFromOrderSet(java.util.List domainObjectList) 
	{
		return createOrderSetForHelpTextVoCollectionFromOrderSet(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.configuration.domain.objects.OrderSet objects.
	 */
	public static ims.ocrr.vo.OrderSetForHelpTextVoCollection createOrderSetForHelpTextVoCollectionFromOrderSet(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.OrderSetForHelpTextVoCollection voList = new ims.ocrr.vo.OrderSetForHelpTextVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.configuration.domain.objects.OrderSet domainObject = (ims.ocrr.configuration.domain.objects.OrderSet) domainObjectList.get(i);
			ims.ocrr.vo.OrderSetForHelpTextVo vo = create(map, domainObject);

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
	 * Create the ims.ocrr.configuration.domain.objects.OrderSet set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractOrderSetSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderSetForHelpTextVoCollection voCollection) 
	 {
	 	return extractOrderSetSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOrderSetSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderSetForHelpTextVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.OrderSetForHelpTextVo vo = voCollection.get(i);
			ims.ocrr.configuration.domain.objects.OrderSet domainObject = OrderSetForHelpTextVoAssembler.extractOrderSet(domainFactory, vo, domMap);

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
	 * Create the ims.ocrr.configuration.domain.objects.OrderSet list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractOrderSetList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderSetForHelpTextVoCollection voCollection) 
	 {
	 	return extractOrderSetList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOrderSetList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderSetForHelpTextVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.OrderSetForHelpTextVo vo = voCollection.get(i);
			ims.ocrr.configuration.domain.objects.OrderSet domainObject = OrderSetForHelpTextVoAssembler.extractOrderSet(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.ocrr.configuration.domain.objects.OrderSet object.
	 * @param domainObject ims.ocrr.configuration.domain.objects.OrderSet
	 */
	 public static ims.ocrr.vo.OrderSetForHelpTextVo create(ims.ocrr.configuration.domain.objects.OrderSet domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ocrr.configuration.domain.objects.OrderSet object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ocrr.vo.OrderSetForHelpTextVo create(DomainObjectMap map, ims.ocrr.configuration.domain.objects.OrderSet domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.OrderSetForHelpTextVo valueObject = (ims.ocrr.vo.OrderSetForHelpTextVo) map.getValueObject(domainObject, ims.ocrr.vo.OrderSetForHelpTextVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.OrderSetForHelpTextVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ocrr.configuration.domain.objects.OrderSet
	 */
	 public static ims.ocrr.vo.OrderSetForHelpTextVo insert(ims.ocrr.vo.OrderSetForHelpTextVo valueObject, ims.ocrr.configuration.domain.objects.OrderSet domainObject) 
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
	 * @param domainObject ims.ocrr.configuration.domain.objects.OrderSet
	 */
	 public static ims.ocrr.vo.OrderSetForHelpTextVo insert(DomainObjectMap map, ims.ocrr.vo.OrderSetForHelpTextVo valueObject, ims.ocrr.configuration.domain.objects.OrderSet domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_OrderSet(domainObject.getId());
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
			
		// Component
		valueObject.setComponent(ims.ocrr.vo.domain.OrderSetComponentForHelpTextVoAssembler.createOrderSetComponentForHelpTextVoCollectionFromOrderSetComponent(map, domainObject.getComponent()) );
		// HelpText
		valueObject.setHelpText(ims.ocrr.vo.domain.HelpTextVoAssembler.createHelpTextVoCollectionFromHelpText(map, domainObject.getHelpText()) );
		// Name
		valueObject.setName(domainObject.getName());
		// Description
		valueObject.setDescription(domainObject.getDescription());
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
				// Color
		valueObject.setColor(domainObject.getColor());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.configuration.domain.objects.OrderSet extractOrderSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderSetForHelpTextVo valueObject) 
	{
		return 	extractOrderSet(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.configuration.domain.objects.OrderSet extractOrderSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderSetForHelpTextVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_OrderSet();
		ims.ocrr.configuration.domain.objects.OrderSet domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ocrr.configuration.domain.objects.OrderSet)domMap.get(valueObject);
			}
			// ims.ocrr.vo.OrderSetForHelpTextVo ID_OrderSet field is unknown
			domainObject = new ims.ocrr.configuration.domain.objects.OrderSet();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_OrderSet());
			if (domMap.get(key) != null)
			{
				return (ims.ocrr.configuration.domain.objects.OrderSet)domMap.get(key);
			}
			domainObject = (ims.ocrr.configuration.domain.objects.OrderSet) domainFactory.getDomainObject(ims.ocrr.configuration.domain.objects.OrderSet.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_OrderSet());


		// SaveAsRefVO treated as RefValueObject
		ims.ocrr.configuration.vo.OrderSetComponentRefVoCollection refCollection1 = new ims.ocrr.configuration.vo.OrderSetComponentRefVoCollection();
		if (valueObject.getComponent() != null)
		{
			for (int i1=0; i1<valueObject.getComponent().size(); i1++)
			{
				ims.ocrr.configuration.vo.OrderSetComponentRefVo ref1 = (ims.ocrr.configuration.vo.OrderSetComponentRefVo)valueObject.getComponent().get(i1);
				refCollection1.add(ref1);
			}
		}
		int size1 = (null == refCollection1) ? 0 : refCollection1.size();		
		java.util.Set domainComponent1 = domainObject.getComponent();
		if (domainComponent1 == null)
		{
			domainComponent1 = new java.util.HashSet();
		}
		java.util.Set newSet1  = new java.util.HashSet();
		for(int i=0; i<size1; i++) 
		{
			ims.ocrr.configuration.vo.OrderSetComponentRefVo vo = refCollection1.get(i);					
			ims.ocrr.configuration.domain.objects.OrderSetComponent dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.ocrr.configuration.domain.objects.OrderSetComponent)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.ocrr.configuration.domain.objects.OrderSetComponent)domainFactory.getDomainObject( ims.ocrr.configuration.domain.objects.OrderSetComponent.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainComponent1.contains(dom))
			{
				domainComponent1.add(dom);
			}
			newSet1.add(dom);			
		}
		java.util.Set removedSet1 = new java.util.HashSet();
		java.util.Iterator iter1 = domainComponent1.iterator();
		//Find out which objects need to be removed
		while (iter1.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter1.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet1.contains(o))
			{
				removedSet1.add(o);
			}
		}
		iter1 = removedSet1.iterator();
		//Remove the unwanted objects
		while (iter1.hasNext())
		{
			domainComponent1.remove(iter1.next());
		}		
		
		domainObject.setComponent(domainComponent1);		

		// SaveAsRefVO treated as RefValueObject
		ims.ocrr.configuration.vo.HelpTextRefVoCollection refCollection2 = new ims.ocrr.configuration.vo.HelpTextRefVoCollection();
		if (valueObject.getHelpText() != null)
		{
			for (int i2=0; i2<valueObject.getHelpText().size(); i2++)
			{
				ims.ocrr.configuration.vo.HelpTextRefVo ref2 = (ims.ocrr.configuration.vo.HelpTextRefVo)valueObject.getHelpText().get(i2);
				refCollection2.add(ref2);
			}
		}
		int size2 = (null == refCollection2) ? 0 : refCollection2.size();		
		java.util.List domainHelpText2 = domainObject.getHelpText();
		if (domainHelpText2 == null)
		{
			domainHelpText2 = new java.util.ArrayList();
		}
		for(int i=0; i < size2; i++) 
		{
			ims.ocrr.configuration.vo.HelpTextRefVo vo = refCollection2.get(i);			
			ims.ocrr.configuration.domain.objects.HelpText dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.ocrr.configuration.domain.objects.HelpText)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.ocrr.configuration.domain.objects.HelpText)domainFactory.getDomainObject( ims.ocrr.configuration.domain.objects.HelpText.class, vo.getBoId());
				}
			}

			int domIdx = domainHelpText2.indexOf(dom);
			if (domIdx == -1)
			{
				domainHelpText2.add(i, dom);
			}
			else if (i != domIdx && i < domainHelpText2.size())
			{
				Object tmp = domainHelpText2.get(i);
				domainHelpText2.set(i, domainHelpText2.get(domIdx));
				domainHelpText2.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i2 = domainHelpText2.size();
		while (i2 > size2)
		{
			domainHelpText2.remove(i2-1);
			i2 = domainHelpText2.size();
		}
		
		domainObject.setHelpText(domainHelpText2);		
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
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getActiveStatus() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getActiveStatus().getID());
		}
		domainObject.setActiveStatus(value5);
		domainObject.setColor(valueObject.getColor());

		return domainObject;
	}

}
