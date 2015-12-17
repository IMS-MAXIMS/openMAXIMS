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
 * @author John MacEnri
 */
public class QryOrderMsgVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.admin.vo.QryOrderMsgVo copy(ims.admin.vo.QryOrderMsgVo valueObjectDest, ims.admin.vo.QryOrderMsgVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_OrderMessage(valueObjectSrc.getID_OrderMessage());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// OrderDetails
		valueObjectDest.setOrderDetails(valueObjectSrc.getOrderDetails());
		// messageStatus
		valueObjectDest.setMessageStatus(valueObjectSrc.getMessageStatus());
		// ProviderSystem
		valueObjectDest.setProviderSystem(valueObjectSrc.getProviderSystem());
		// PlacerOrdNum
		valueObjectDest.setPlacerOrdNum(valueObjectSrc.getPlacerOrdNum());
		// HL7Message
		valueObjectDest.setHL7Message(valueObjectSrc.getHL7Message());
		// OrderCategory
		valueObjectDest.setOrderCategory(valueObjectSrc.getOrderCategory());
		// failureMessage
		valueObjectDest.setFailureMessage(valueObjectSrc.getFailureMessage());
		// SysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createQryOrderMsgVoCollectionFromOrderMessage(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OrderMessage objects.
	 */
	public static ims.admin.vo.QryOrderMsgVoCollection createQryOrderMsgVoCollectionFromOrderMessage(java.util.Set domainObjectSet)	
	{
		return createQryOrderMsgVoCollectionFromOrderMessage(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OrderMessage objects.
	 */
	public static ims.admin.vo.QryOrderMsgVoCollection createQryOrderMsgVoCollectionFromOrderMessage(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.admin.vo.QryOrderMsgVoCollection voList = new ims.admin.vo.QryOrderMsgVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ocrr.orderingresults.domain.objects.OrderMessage domainObject = (ims.ocrr.orderingresults.domain.objects.OrderMessage) iterator.next();
			ims.admin.vo.QryOrderMsgVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.OrderMessage objects.
	 */
	public static ims.admin.vo.QryOrderMsgVoCollection createQryOrderMsgVoCollectionFromOrderMessage(java.util.List domainObjectList) 
	{
		return createQryOrderMsgVoCollectionFromOrderMessage(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.OrderMessage objects.
	 */
	public static ims.admin.vo.QryOrderMsgVoCollection createQryOrderMsgVoCollectionFromOrderMessage(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.admin.vo.QryOrderMsgVoCollection voList = new ims.admin.vo.QryOrderMsgVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.orderingresults.domain.objects.OrderMessage domainObject = (ims.ocrr.orderingresults.domain.objects.OrderMessage) domainObjectList.get(i);
			ims.admin.vo.QryOrderMsgVo vo = create(map, domainObject);

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
	 * Create the ims.ocrr.orderingresults.domain.objects.OrderMessage set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractOrderMessageSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.QryOrderMsgVoCollection voCollection) 
	 {
	 	return extractOrderMessageSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOrderMessageSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.QryOrderMsgVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.QryOrderMsgVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OrderMessage domainObject = QryOrderMsgVoAssembler.extractOrderMessage(domainFactory, vo, domMap);

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
	 * Create the ims.ocrr.orderingresults.domain.objects.OrderMessage list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractOrderMessageList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.QryOrderMsgVoCollection voCollection) 
	 {
	 	return extractOrderMessageList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOrderMessageList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.QryOrderMsgVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.QryOrderMsgVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OrderMessage domainObject = QryOrderMsgVoAssembler.extractOrderMessage(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.OrderMessage object.
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.OrderMessage
	 */
	 public static ims.admin.vo.QryOrderMsgVo create(ims.ocrr.orderingresults.domain.objects.OrderMessage domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.OrderMessage object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.admin.vo.QryOrderMsgVo create(DomainObjectMap map, ims.ocrr.orderingresults.domain.objects.OrderMessage domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.admin.vo.QryOrderMsgVo valueObject = (ims.admin.vo.QryOrderMsgVo) map.getValueObject(domainObject, ims.admin.vo.QryOrderMsgVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.admin.vo.QryOrderMsgVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.OrderMessage
	 */
	 public static ims.admin.vo.QryOrderMsgVo insert(ims.admin.vo.QryOrderMsgVo valueObject, ims.ocrr.orderingresults.domain.objects.OrderMessage domainObject) 
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
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.OrderMessage
	 */
	 public static ims.admin.vo.QryOrderMsgVo insert(DomainObjectMap map, ims.admin.vo.QryOrderMsgVo valueObject, ims.ocrr.orderingresults.domain.objects.OrderMessage domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_OrderMessage(domainObject.getId());
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
			
		// OrderDetails
		valueObject.setOrderDetails(ims.ocrr.vo.domain.OcsOrderListVoAssembler.create(map, domainObject.getOrderDetails()) );
		// messageStatus
		ims.domain.lookups.LookupInstance instance2 = domainObject.getMessageStatus();
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

			ims.ocrr.vo.lookups.OrderMessageStatus voLookup2 = new ims.ocrr.vo.lookups.OrderMessageStatus(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.ocrr.vo.lookups.OrderMessageStatus parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.ocrr.vo.lookups.OrderMessageStatus(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setMessageStatus(voLookup2);
		}
				// ProviderSystem
		valueObject.setProviderSystem(ims.ocrr.vo.domain.ProviderSystemLiteVoAssembler.create(map, domainObject.getProviderSystem()) );
		// PlacerOrdNum
		valueObject.setPlacerOrdNum(domainObject.getPlacerOrdNum());
		// HL7Message
		valueObject.setHL7Message(domainObject.getHL7Message());
		// OrderCategory
		ims.domain.lookups.LookupInstance instance6 = domainObject.getOrderCategory();
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

			ims.ocrr.vo.lookups.Category voLookup6 = new ims.ocrr.vo.lookups.Category(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.ocrr.vo.lookups.Category parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.ocrr.vo.lookups.Category(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setOrderCategory(voLookup6);
		}
				// failureMessage
		valueObject.setFailureMessage(domainObject.getFailureMessage());
		// SysInfo
		// set system information
		valueObject.setSysInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.orderingresults.domain.objects.OrderMessage extractOrderMessage(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.QryOrderMsgVo valueObject) 
	{
		return 	extractOrderMessage(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.orderingresults.domain.objects.OrderMessage extractOrderMessage(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.QryOrderMsgVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_OrderMessage();
		ims.ocrr.orderingresults.domain.objects.OrderMessage domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.OrderMessage)domMap.get(valueObject);
			}
			// ims.admin.vo.QryOrderMsgVo ID_OrderMessage field is unknown
			domainObject = new ims.ocrr.orderingresults.domain.objects.OrderMessage();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_OrderMessage());
			if (domMap.get(key) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.OrderMessage)domMap.get(key);
			}
			domainObject = (ims.ocrr.orderingresults.domain.objects.OrderMessage) domainFactory.getDomainObject(ims.ocrr.orderingresults.domain.objects.OrderMessage.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_OrderMessage());

		domainObject.setOrderDetails(ims.ocrr.vo.domain.OcsOrderListVoAssembler.extractOcsOrderSession(domainFactory, valueObject.getOrderDetails(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getMessageStatus() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getMessageStatus().getID());
		}
		domainObject.setMessageStatus(value2);
		domainObject.setProviderSystem(ims.ocrr.vo.domain.ProviderSystemLiteVoAssembler.extractProviderSystem(domainFactory, valueObject.getProviderSystem(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPlacerOrdNum() != null && valueObject.getPlacerOrdNum().equals(""))
		{
			valueObject.setPlacerOrdNum(null);
		}
		domainObject.setPlacerOrdNum(valueObject.getPlacerOrdNum());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getHL7Message() != null && valueObject.getHL7Message().equals(""))
		{
			valueObject.setHL7Message(null);
		}
		domainObject.setHL7Message(valueObject.getHL7Message());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getOrderCategory() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getOrderCategory().getID());
		}
		domainObject.setOrderCategory(value6);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getFailureMessage() != null && valueObject.getFailureMessage().equals(""))
		{
			valueObject.setFailureMessage(null);
		}
		domainObject.setFailureMessage(valueObject.getFailureMessage());

		return domainObject;
	}

}
