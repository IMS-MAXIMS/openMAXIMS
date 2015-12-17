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
 * @author Michael Noonan
 */
public class DemographicFeedVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.admin.vo.DemographicFeedVo copy(ims.admin.vo.DemographicFeedVo valueObjectDest, ims.admin.vo.DemographicFeedVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_DemographicsMessageQueue(valueObjectSrc.getID_DemographicsMessageQueue());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// ProviderSystem
		valueObjectDest.setProviderSystem(valueObjectSrc.getProviderSystem());
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
		// msgType
		valueObjectDest.setMsgType(valueObjectSrc.getMsgType());
		// queueType
		valueObjectDest.setQueueType(valueObjectSrc.getQueueType());
		// PriorPatient
		valueObjectDest.setPriorPatient(valueObjectSrc.getPriorPatient());
		// systemInformation
		valueObjectDest.setSystemInformation(valueObjectSrc.getSystemInformation());
		// MergeHistory
		valueObjectDest.setMergeHistory(valueObjectSrc.getMergeHistory());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createDemographicFeedVoCollectionFromDemographicsMessageQueue(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.hl7adtout.domain.objects.DemographicsMessageQueue objects.
	 */
	public static ims.admin.vo.DemographicFeedVoCollection createDemographicFeedVoCollectionFromDemographicsMessageQueue(java.util.Set domainObjectSet)	
	{
		return createDemographicFeedVoCollectionFromDemographicsMessageQueue(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.hl7adtout.domain.objects.DemographicsMessageQueue objects.
	 */
	public static ims.admin.vo.DemographicFeedVoCollection createDemographicFeedVoCollectionFromDemographicsMessageQueue(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.admin.vo.DemographicFeedVoCollection voList = new ims.admin.vo.DemographicFeedVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.hl7adtout.domain.objects.DemographicsMessageQueue domainObject = (ims.hl7adtout.domain.objects.DemographicsMessageQueue) iterator.next();
			ims.admin.vo.DemographicFeedVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.hl7adtout.domain.objects.DemographicsMessageQueue objects.
	 */
	public static ims.admin.vo.DemographicFeedVoCollection createDemographicFeedVoCollectionFromDemographicsMessageQueue(java.util.List domainObjectList) 
	{
		return createDemographicFeedVoCollectionFromDemographicsMessageQueue(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.hl7adtout.domain.objects.DemographicsMessageQueue objects.
	 */
	public static ims.admin.vo.DemographicFeedVoCollection createDemographicFeedVoCollectionFromDemographicsMessageQueue(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.admin.vo.DemographicFeedVoCollection voList = new ims.admin.vo.DemographicFeedVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.hl7adtout.domain.objects.DemographicsMessageQueue domainObject = (ims.hl7adtout.domain.objects.DemographicsMessageQueue) domainObjectList.get(i);
			ims.admin.vo.DemographicFeedVo vo = create(map, domainObject);

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
	 * Create the ims.hl7adtout.domain.objects.DemographicsMessageQueue set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractDemographicsMessageQueueSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.DemographicFeedVoCollection voCollection) 
	 {
	 	return extractDemographicsMessageQueueSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractDemographicsMessageQueueSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.DemographicFeedVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.DemographicFeedVo vo = voCollection.get(i);
			ims.hl7adtout.domain.objects.DemographicsMessageQueue domainObject = DemographicFeedVoAssembler.extractDemographicsMessageQueue(domainFactory, vo, domMap);

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
	 * Create the ims.hl7adtout.domain.objects.DemographicsMessageQueue list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractDemographicsMessageQueueList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.DemographicFeedVoCollection voCollection) 
	 {
	 	return extractDemographicsMessageQueueList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractDemographicsMessageQueueList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.DemographicFeedVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.DemographicFeedVo vo = voCollection.get(i);
			ims.hl7adtout.domain.objects.DemographicsMessageQueue domainObject = DemographicFeedVoAssembler.extractDemographicsMessageQueue(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.hl7adtout.domain.objects.DemographicsMessageQueue object.
	 * @param domainObject ims.hl7adtout.domain.objects.DemographicsMessageQueue
	 */
	 public static ims.admin.vo.DemographicFeedVo create(ims.hl7adtout.domain.objects.DemographicsMessageQueue domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.hl7adtout.domain.objects.DemographicsMessageQueue object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.admin.vo.DemographicFeedVo create(DomainObjectMap map, ims.hl7adtout.domain.objects.DemographicsMessageQueue domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.admin.vo.DemographicFeedVo valueObject = (ims.admin.vo.DemographicFeedVo) map.getValueObject(domainObject, ims.admin.vo.DemographicFeedVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.admin.vo.DemographicFeedVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.hl7adtout.domain.objects.DemographicsMessageQueue
	 */
	 public static ims.admin.vo.DemographicFeedVo insert(ims.admin.vo.DemographicFeedVo valueObject, ims.hl7adtout.domain.objects.DemographicsMessageQueue domainObject) 
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
	 * @param domainObject ims.hl7adtout.domain.objects.DemographicsMessageQueue
	 */
	 public static ims.admin.vo.DemographicFeedVo insert(DomainObjectMap map, ims.admin.vo.DemographicFeedVo valueObject, ims.hl7adtout.domain.objects.DemographicsMessageQueue domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_DemographicsMessageQueue(domainObject.getId());
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
			
		// Patient
		valueObject.setPatient(ims.core.vo.domain.PatientShortAssembler.create(map, domainObject.getPatient()) );
		// ProviderSystem
		valueObject.setProviderSystem(ims.ocrr.vo.domain.ProviderSystemVoAssembler.create(map, domainObject.getProviderSystem()) );
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
		ims.domain.lookups.LookupInstance instance8 = domainObject.getMessageStatus();
		if ( null != instance8 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance8.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance8.getImage().getImageId(), instance8.getImage().getImagePath());
			}
			color = instance8.getColor();
			if (color != null) 
				color.getValue();

			ims.ocrr.vo.lookups.OrderMessageStatus voLookup8 = new ims.ocrr.vo.lookups.OrderMessageStatus(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.ocrr.vo.lookups.OrderMessageStatus parentVoLookup8 = voLookup8;
			ims.domain.lookups.LookupInstance parent8 = instance8.getParent();
			while (parent8 != null)
			{
				if (parent8.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent8.getImage().getImageId(), parent8.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent8.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup8.setParent(new ims.ocrr.vo.lookups.OrderMessageStatus(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setMessageStatus(voLookup8);
		}
				// msgType
		ims.domain.lookups.LookupInstance instance9 = domainObject.getMsgType();
		if ( null != instance9 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance9.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance9.getImage().getImageId(), instance9.getImage().getImagePath());
			}
			color = instance9.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.MsgEventType voLookup9 = new ims.core.vo.lookups.MsgEventType(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.MsgEventType parentVoLookup9 = voLookup9;
			ims.domain.lookups.LookupInstance parent9 = instance9.getParent();
			while (parent9 != null)
			{
				if (parent9.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent9.getImage().getImageId(), parent9.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent9.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup9.setParent(new ims.core.vo.lookups.MsgEventType(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setMsgType(voLookup9);
		}
				// queueType
		ims.domain.lookups.LookupInstance instance10 = domainObject.getQueueType();
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

			ims.core.vo.lookups.QueueType voLookup10 = new ims.core.vo.lookups.QueueType(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.QueueType parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.core.vo.lookups.QueueType(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setQueueType(voLookup10);
		}
				// PriorPatient
		if (domainObject.getPriorPatient() != null)
		{
			if(domainObject.getPriorPatient() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPriorPatient();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPriorPatient(new ims.core.patient.vo.PatientRefVo(id, -1));				
			}
			else
			{
				valueObject.setPriorPatient(new ims.core.patient.vo.PatientRefVo(domainObject.getPriorPatient().getId(), domainObject.getPriorPatient().getVersion()));
			}
		}
		// systemInformation
		// set system information
		valueObject.setSystemInformation(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// MergeHistory
		valueObject.setMergeHistory(ims.core.vo.domain.PatientMergeHistoryVoAssembler.create(map, domainObject.getMergeHistory()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.hl7adtout.domain.objects.DemographicsMessageQueue extractDemographicsMessageQueue(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.DemographicFeedVo valueObject) 
	{
		return 	extractDemographicsMessageQueue(domainFactory, valueObject, new HashMap());
	}

	public static ims.hl7adtout.domain.objects.DemographicsMessageQueue extractDemographicsMessageQueue(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.DemographicFeedVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_DemographicsMessageQueue();
		ims.hl7adtout.domain.objects.DemographicsMessageQueue domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.hl7adtout.domain.objects.DemographicsMessageQueue)domMap.get(valueObject);
			}
			// ims.admin.vo.DemographicFeedVo ID_DemographicsMessageQueue field is unknown
			domainObject = new ims.hl7adtout.domain.objects.DemographicsMessageQueue();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_DemographicsMessageQueue());
			if (domMap.get(key) != null)
			{
				return (ims.hl7adtout.domain.objects.DemographicsMessageQueue)domMap.get(key);
			}
			domainObject = (ims.hl7adtout.domain.objects.DemographicsMessageQueue) domainFactory.getDomainObject(ims.hl7adtout.domain.objects.DemographicsMessageQueue.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_DemographicsMessageQueue());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.patient.domain.objects.Patient value1 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value1 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else
			{
				value1 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value1);
		domainObject.setProviderSystem(ims.ocrr.vo.domain.ProviderSystemVoAssembler.extractProviderSystem(domainFactory, valueObject.getProviderSystem(), domMap));
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
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getMessageStatus() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getMessageStatus().getID());
		}
		domainObject.setMessageStatus(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getMsgType() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getMsgType().getID());
		}
		domainObject.setMsgType(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getQueueType() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getQueueType().getID());
		}
		domainObject.setQueueType(value10);
		ims.core.patient.domain.objects.Patient value11 = null;
		if ( null != valueObject.getPriorPatient() ) 
		{
			if (valueObject.getPriorPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPriorPatient()) != null)
				{
					value11 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPriorPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value11 = domainObject.getPriorPatient();	
			}
			else
			{
				value11 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPriorPatient().getBoId());
			}
		}
		domainObject.setPriorPatient(value11);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.patient.domain.objects.PatientMergeHistory value13 = null;
		if ( null != valueObject.getMergeHistory() ) 
		{
			if (valueObject.getMergeHistory().getBoId() == null)
			{
				if (domMap.get(valueObject.getMergeHistory()) != null)
				{
					value13 = (ims.core.patient.domain.objects.PatientMergeHistory)domMap.get(valueObject.getMergeHistory());
				}
			}
			else
			{
				value13 = (ims.core.patient.domain.objects.PatientMergeHistory)domainFactory.getDomainObject(ims.core.patient.domain.objects.PatientMergeHistory.class, valueObject.getMergeHistory().getBoId());
			}
		}
		domainObject.setMergeHistory(value13);

		return domainObject;
	}

}
