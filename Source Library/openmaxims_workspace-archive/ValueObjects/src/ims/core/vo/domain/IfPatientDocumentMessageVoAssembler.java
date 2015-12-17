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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Michael Noonan
 */
public class IfPatientDocumentMessageVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.IfPatientDocumentMessageVo copy(ims.core.vo.IfPatientDocumentMessageVo valueObjectDest, ims.core.vo.IfPatientDocumentMessageVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientDocumentMessageQueue(valueObjectSrc.getID_PatientDocumentMessageQueue());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// wasProcessed
		valueObjectDest.setWasProcessed(valueObjectSrc.getWasProcessed());
		// wasDiscarded
		valueObjectDest.setWasDiscarded(valueObjectSrc.getWasDiscarded());
		// msgText
		valueObjectDest.setMsgText(valueObjectSrc.getMsgText());
		// ackText
		valueObjectDest.setAckText(valueObjectSrc.getAckText());
		// failureMsg
		valueObjectDest.setFailureMsg(valueObjectSrc.getFailureMsg());
		// messageStatus
		valueObjectDest.setMessageStatus(valueObjectSrc.getMessageStatus());
		// queueType
		valueObjectDest.setQueueType(valueObjectSrc.getQueueType());
		// providerSystem
		valueObjectDest.setProviderSystem(valueObjectSrc.getProviderSystem());
		// patientDocument
		valueObjectDest.setPatientDocument(valueObjectSrc.getPatientDocument());
		// msgType
		valueObjectDest.setMsgType(valueObjectSrc.getMsgType());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createIfPatientDocumentMessageVoCollectionFromPatientDocumentMessageQueue(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.hl7adtout.domain.objects.PatientDocumentMessageQueue objects.
	 */
	public static ims.core.vo.IfPatientDocumentMessageVoCollection createIfPatientDocumentMessageVoCollectionFromPatientDocumentMessageQueue(java.util.Set domainObjectSet)	
	{
		return createIfPatientDocumentMessageVoCollectionFromPatientDocumentMessageQueue(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.hl7adtout.domain.objects.PatientDocumentMessageQueue objects.
	 */
	public static ims.core.vo.IfPatientDocumentMessageVoCollection createIfPatientDocumentMessageVoCollectionFromPatientDocumentMessageQueue(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.IfPatientDocumentMessageVoCollection voList = new ims.core.vo.IfPatientDocumentMessageVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.hl7adtout.domain.objects.PatientDocumentMessageQueue domainObject = (ims.hl7adtout.domain.objects.PatientDocumentMessageQueue) iterator.next();
			ims.core.vo.IfPatientDocumentMessageVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.hl7adtout.domain.objects.PatientDocumentMessageQueue objects.
	 */
	public static ims.core.vo.IfPatientDocumentMessageVoCollection createIfPatientDocumentMessageVoCollectionFromPatientDocumentMessageQueue(java.util.List domainObjectList) 
	{
		return createIfPatientDocumentMessageVoCollectionFromPatientDocumentMessageQueue(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.hl7adtout.domain.objects.PatientDocumentMessageQueue objects.
	 */
	public static ims.core.vo.IfPatientDocumentMessageVoCollection createIfPatientDocumentMessageVoCollectionFromPatientDocumentMessageQueue(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.IfPatientDocumentMessageVoCollection voList = new ims.core.vo.IfPatientDocumentMessageVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.hl7adtout.domain.objects.PatientDocumentMessageQueue domainObject = (ims.hl7adtout.domain.objects.PatientDocumentMessageQueue) domainObjectList.get(i);
			ims.core.vo.IfPatientDocumentMessageVo vo = create(map, domainObject);

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
	 * Create the ims.hl7adtout.domain.objects.PatientDocumentMessageQueue set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientDocumentMessageQueueSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.IfPatientDocumentMessageVoCollection voCollection) 
	 {
	 	return extractPatientDocumentMessageQueueSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientDocumentMessageQueueSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.IfPatientDocumentMessageVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.IfPatientDocumentMessageVo vo = voCollection.get(i);
			ims.hl7adtout.domain.objects.PatientDocumentMessageQueue domainObject = IfPatientDocumentMessageVoAssembler.extractPatientDocumentMessageQueue(domainFactory, vo, domMap);

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
	 * Create the ims.hl7adtout.domain.objects.PatientDocumentMessageQueue list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientDocumentMessageQueueList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.IfPatientDocumentMessageVoCollection voCollection) 
	 {
	 	return extractPatientDocumentMessageQueueList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientDocumentMessageQueueList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.IfPatientDocumentMessageVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.IfPatientDocumentMessageVo vo = voCollection.get(i);
			ims.hl7adtout.domain.objects.PatientDocumentMessageQueue domainObject = IfPatientDocumentMessageVoAssembler.extractPatientDocumentMessageQueue(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.hl7adtout.domain.objects.PatientDocumentMessageQueue object.
	 * @param domainObject ims.hl7adtout.domain.objects.PatientDocumentMessageQueue
	 */
	 public static ims.core.vo.IfPatientDocumentMessageVo create(ims.hl7adtout.domain.objects.PatientDocumentMessageQueue domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.hl7adtout.domain.objects.PatientDocumentMessageQueue object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.IfPatientDocumentMessageVo create(DomainObjectMap map, ims.hl7adtout.domain.objects.PatientDocumentMessageQueue domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.IfPatientDocumentMessageVo valueObject = (ims.core.vo.IfPatientDocumentMessageVo) map.getValueObject(domainObject, ims.core.vo.IfPatientDocumentMessageVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.IfPatientDocumentMessageVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.hl7adtout.domain.objects.PatientDocumentMessageQueue
	 */
	 public static ims.core.vo.IfPatientDocumentMessageVo insert(ims.core.vo.IfPatientDocumentMessageVo valueObject, ims.hl7adtout.domain.objects.PatientDocumentMessageQueue domainObject) 
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
	 * @param domainObject ims.hl7adtout.domain.objects.PatientDocumentMessageQueue
	 */
	 public static ims.core.vo.IfPatientDocumentMessageVo insert(DomainObjectMap map, ims.core.vo.IfPatientDocumentMessageVo valueObject, ims.hl7adtout.domain.objects.PatientDocumentMessageQueue domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientDocumentMessageQueue(domainObject.getId());
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
			
		// wasProcessed
		valueObject.setWasProcessed( domainObject.isWasProcessed() );
		// wasDiscarded
		valueObject.setWasDiscarded( domainObject.isWasDiscarded() );
		// msgText
		valueObject.setMsgText(domainObject.getMsgText());
		// ackText
		valueObject.setAckText(domainObject.getAckText());
		// failureMsg
		valueObject.setFailureMsg(domainObject.getFailureMsg());
		// messageStatus
		ims.domain.lookups.LookupInstance instance6 = domainObject.getMessageStatus();
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

			ims.ocrr.vo.lookups.OrderMessageStatus voLookup6 = new ims.ocrr.vo.lookups.OrderMessageStatus(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.ocrr.vo.lookups.OrderMessageStatus parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.ocrr.vo.lookups.OrderMessageStatus(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setMessageStatus(voLookup6);
		}
				// queueType
		ims.domain.lookups.LookupInstance instance7 = domainObject.getQueueType();
		if ( null != instance7 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance7.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance7.getImage().getImageId(), instance7.getImage().getImagePath());
			}
			color = instance7.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.QueueType voLookup7 = new ims.core.vo.lookups.QueueType(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.QueueType parentVoLookup7 = voLookup7;
			ims.domain.lookups.LookupInstance parent7 = instance7.getParent();
			while (parent7 != null)
			{
				if (parent7.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent7.getImage().getImageId(), parent7.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent7.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup7.setParent(new ims.core.vo.lookups.QueueType(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setQueueType(voLookup7);
		}
				// providerSystem
		valueObject.setProviderSystem(ims.ocrr.vo.domain.ProviderSystemVoAssembler.create(map, domainObject.getProviderSystem()) );
		// patientDocument
		valueObject.setPatientDocument(ims.core.vo.domain.IfPatientDocumentVoAssembler.create(map, domainObject.getPatientDocument()) );
		// msgType
		ims.domain.lookups.LookupInstance instance10 = domainObject.getMsgType();
		if ( null != instance10 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance10.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance10.getImage().getImageId(), instance10.getImage().getImagePath());
			}
			color = instance10.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.MsgEventType voLookup10 = new ims.core.vo.lookups.MsgEventType(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.MsgEventType parentVoLookup10 = voLookup10;
			ims.domain.lookups.LookupInstance parent10 = instance10.getParent();
			while (parent10 != null)
			{
				if (parent10.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent10.getImage().getImageId(), parent10.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent10.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup10.setParent(new ims.core.vo.lookups.MsgEventType(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setMsgType(voLookup10);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.hl7adtout.domain.objects.PatientDocumentMessageQueue extractPatientDocumentMessageQueue(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.IfPatientDocumentMessageVo valueObject) 
	{
		return 	extractPatientDocumentMessageQueue(domainFactory, valueObject, new HashMap());
	}

	public static ims.hl7adtout.domain.objects.PatientDocumentMessageQueue extractPatientDocumentMessageQueue(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.IfPatientDocumentMessageVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientDocumentMessageQueue();
		ims.hl7adtout.domain.objects.PatientDocumentMessageQueue domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.hl7adtout.domain.objects.PatientDocumentMessageQueue)domMap.get(valueObject);
			}
			// ims.core.vo.IfPatientDocumentMessageVo ID_PatientDocumentMessageQueue field is unknown
			domainObject = new ims.hl7adtout.domain.objects.PatientDocumentMessageQueue();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientDocumentMessageQueue());
			if (domMap.get(key) != null)
			{
				return (ims.hl7adtout.domain.objects.PatientDocumentMessageQueue)domMap.get(key);
			}
			domainObject = (ims.hl7adtout.domain.objects.PatientDocumentMessageQueue) domainFactory.getDomainObject(ims.hl7adtout.domain.objects.PatientDocumentMessageQueue.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientDocumentMessageQueue());

		domainObject.setWasProcessed(valueObject.getWasProcessed());
		domainObject.setWasDiscarded(valueObject.getWasDiscarded());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getMsgText() != null && valueObject.getMsgText().equals(""))
		{
			valueObject.setMsgText(null);
		}
		domainObject.setMsgText(valueObject.getMsgText());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAckText() != null && valueObject.getAckText().equals(""))
		{
			valueObject.setAckText(null);
		}
		domainObject.setAckText(valueObject.getAckText());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getFailureMsg() != null && valueObject.getFailureMsg().equals(""))
		{
			valueObject.setFailureMsg(null);
		}
		domainObject.setFailureMsg(valueObject.getFailureMsg());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getMessageStatus() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getMessageStatus().getID());
		}
		domainObject.setMessageStatus(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getQueueType() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getQueueType().getID());
		}
		domainObject.setQueueType(value7);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.ProviderSystem value8 = null;
		if ( null != valueObject.getProviderSystem() ) 
		{
			if (valueObject.getProviderSystem().getBoId() == null)
			{
				if (domMap.get(valueObject.getProviderSystem()) != null)
				{
					value8 = (ims.core.admin.domain.objects.ProviderSystem)domMap.get(valueObject.getProviderSystem());
				}
			}
			else
			{
				value8 = (ims.core.admin.domain.objects.ProviderSystem)domainFactory.getDomainObject(ims.core.admin.domain.objects.ProviderSystem.class, valueObject.getProviderSystem().getBoId());
			}
		}
		domainObject.setProviderSystem(value8);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.documents.domain.objects.PatientDocument value9 = null;
		if ( null != valueObject.getPatientDocument() ) 
		{
			if (valueObject.getPatientDocument().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatientDocument()) != null)
				{
					value9 = (ims.core.documents.domain.objects.PatientDocument)domMap.get(valueObject.getPatientDocument());
				}
			}
			else
			{
				value9 = (ims.core.documents.domain.objects.PatientDocument)domainFactory.getDomainObject(ims.core.documents.domain.objects.PatientDocument.class, valueObject.getPatientDocument().getBoId());
			}
		}
		domainObject.setPatientDocument(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getMsgType() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getMsgType().getID());
		}
		domainObject.setMsgType(value10);

		return domainObject;
	}

}
