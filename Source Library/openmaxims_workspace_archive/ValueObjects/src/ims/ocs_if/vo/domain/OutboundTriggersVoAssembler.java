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
package ims.ocs_if.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Michael Noonan
 */
public class OutboundTriggersVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocs_if.vo.OutboundTriggersVo copy(ims.ocs_if.vo.OutboundTriggersVo valueObjectDest, ims.ocs_if.vo.OutboundTriggersVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_OutboundTriggers(valueObjectSrc.getID_OutboundTriggers());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ProviderSystem
		valueObjectDest.setProviderSystem(valueObjectSrc.getProviderSystem());
		// QueueType
		valueObjectDest.setQueueType(valueObjectSrc.getQueueType());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createOutboundTriggersVoCollectionFromOutboundTriggers(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.hl7interface.domain.objects.OutboundTriggers objects.
	 */
	public static ims.ocs_if.vo.OutboundTriggersVoCollection createOutboundTriggersVoCollectionFromOutboundTriggers(java.util.Set domainObjectSet)	
	{
		return createOutboundTriggersVoCollectionFromOutboundTriggers(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.hl7interface.domain.objects.OutboundTriggers objects.
	 */
	public static ims.ocs_if.vo.OutboundTriggersVoCollection createOutboundTriggersVoCollectionFromOutboundTriggers(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocs_if.vo.OutboundTriggersVoCollection voList = new ims.ocs_if.vo.OutboundTriggersVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.hl7interface.domain.objects.OutboundTriggers domainObject = (ims.core.hl7interface.domain.objects.OutboundTriggers) iterator.next();
			ims.ocs_if.vo.OutboundTriggersVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.hl7interface.domain.objects.OutboundTriggers objects.
	 */
	public static ims.ocs_if.vo.OutboundTriggersVoCollection createOutboundTriggersVoCollectionFromOutboundTriggers(java.util.List domainObjectList) 
	{
		return createOutboundTriggersVoCollectionFromOutboundTriggers(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.hl7interface.domain.objects.OutboundTriggers objects.
	 */
	public static ims.ocs_if.vo.OutboundTriggersVoCollection createOutboundTriggersVoCollectionFromOutboundTriggers(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocs_if.vo.OutboundTriggersVoCollection voList = new ims.ocs_if.vo.OutboundTriggersVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.hl7interface.domain.objects.OutboundTriggers domainObject = (ims.core.hl7interface.domain.objects.OutboundTriggers) domainObjectList.get(i);
			ims.ocs_if.vo.OutboundTriggersVo vo = create(map, domainObject);

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
	 * Create the ims.core.hl7interface.domain.objects.OutboundTriggers set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractOutboundTriggersSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.OutboundTriggersVoCollection voCollection) 
	 {
	 	return extractOutboundTriggersSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOutboundTriggersSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.OutboundTriggersVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocs_if.vo.OutboundTriggersVo vo = voCollection.get(i);
			ims.core.hl7interface.domain.objects.OutboundTriggers domainObject = OutboundTriggersVoAssembler.extractOutboundTriggers(domainFactory, vo, domMap);

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
	 * Create the ims.core.hl7interface.domain.objects.OutboundTriggers list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractOutboundTriggersList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.OutboundTriggersVoCollection voCollection) 
	 {
	 	return extractOutboundTriggersList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOutboundTriggersList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.OutboundTriggersVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocs_if.vo.OutboundTriggersVo vo = voCollection.get(i);
			ims.core.hl7interface.domain.objects.OutboundTriggers domainObject = OutboundTriggersVoAssembler.extractOutboundTriggers(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.hl7interface.domain.objects.OutboundTriggers object.
	 * @param domainObject ims.core.hl7interface.domain.objects.OutboundTriggers
	 */
	 public static ims.ocs_if.vo.OutboundTriggersVo create(ims.core.hl7interface.domain.objects.OutboundTriggers domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.hl7interface.domain.objects.OutboundTriggers object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ocs_if.vo.OutboundTriggersVo create(DomainObjectMap map, ims.core.hl7interface.domain.objects.OutboundTriggers domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocs_if.vo.OutboundTriggersVo valueObject = (ims.ocs_if.vo.OutboundTriggersVo) map.getValueObject(domainObject, ims.ocs_if.vo.OutboundTriggersVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocs_if.vo.OutboundTriggersVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.hl7interface.domain.objects.OutboundTriggers
	 */
	 public static ims.ocs_if.vo.OutboundTriggersVo insert(ims.ocs_if.vo.OutboundTriggersVo valueObject, ims.core.hl7interface.domain.objects.OutboundTriggers domainObject) 
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
	 * @param domainObject ims.core.hl7interface.domain.objects.OutboundTriggers
	 */
	 public static ims.ocs_if.vo.OutboundTriggersVo insert(DomainObjectMap map, ims.ocs_if.vo.OutboundTriggersVo valueObject, ims.core.hl7interface.domain.objects.OutboundTriggers domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_OutboundTriggers(domainObject.getId());
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
			
		// ProviderSystem
		if (domainObject.getProviderSystem() != null)
		{
			if(domainObject.getProviderSystem() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getProviderSystem();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setProviderSystem(new ims.core.admin.vo.ProviderSystemRefVo(id, -1));				
			}
			else
			{
				valueObject.setProviderSystem(new ims.core.admin.vo.ProviderSystemRefVo(domainObject.getProviderSystem().getId(), domainObject.getProviderSystem().getVersion()));
			}
		}
		// QueueType
		java.util.List listQueueType = domainObject.getQueueType();
		ims.core.vo.lookups.QueueTypeCollection QueueType = new ims.core.vo.lookups.QueueTypeCollection();
		for(java.util.Iterator iterator = listQueueType.iterator(); iterator.hasNext(); ) 
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
			ims.core.vo.lookups.QueueType voInstance = new ims.core.vo.lookups.QueueType(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.core.vo.lookups.QueueType parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.core.vo.lookups.QueueType(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			QueueType.add(voInstance);
		}
		valueObject.setQueueType( QueueType );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.hl7interface.domain.objects.OutboundTriggers extractOutboundTriggers(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.OutboundTriggersVo valueObject) 
	{
		return 	extractOutboundTriggers(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.hl7interface.domain.objects.OutboundTriggers extractOutboundTriggers(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.OutboundTriggersVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_OutboundTriggers();
		ims.core.hl7interface.domain.objects.OutboundTriggers domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.hl7interface.domain.objects.OutboundTriggers)domMap.get(valueObject);
			}
			// ims.ocs_if.vo.OutboundTriggersVo ID_OutboundTriggers field is unknown
			domainObject = new ims.core.hl7interface.domain.objects.OutboundTriggers();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_OutboundTriggers());
			if (domMap.get(key) != null)
			{
				return (ims.core.hl7interface.domain.objects.OutboundTriggers)domMap.get(key);
			}
			domainObject = (ims.core.hl7interface.domain.objects.OutboundTriggers) domainFactory.getDomainObject(ims.core.hl7interface.domain.objects.OutboundTriggers.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_OutboundTriggers());

		ims.core.admin.domain.objects.ProviderSystem value1 = null;
		if ( null != valueObject.getProviderSystem() ) 
		{
			if (valueObject.getProviderSystem().getBoId() == null)
			{
				if (domMap.get(valueObject.getProviderSystem()) != null)
				{
					value1 = (ims.core.admin.domain.objects.ProviderSystem)domMap.get(valueObject.getProviderSystem());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getProviderSystem();	
			}
			else
			{
				value1 = (ims.core.admin.domain.objects.ProviderSystem)domainFactory.getDomainObject(ims.core.admin.domain.objects.ProviderSystem.class, valueObject.getProviderSystem().getBoId());
			}
		}
		domainObject.setProviderSystem(value1);
		ims.core.vo.lookups.QueueTypeCollection collection2 =
	valueObject.getQueueType();
	    java.util.List domainQueueType = domainObject.getQueueType();;			
	    int collection2Size=0;
		if (collection2 == null)
		{
			domainQueueType = new java.util.ArrayList(0);
		}
		else
		{
			collection2Size = collection2.size();
		}
		
		for(int i=0; i<collection2Size; i++) 
		{
			int instanceId = collection2.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainQueueType.indexOf(dom);
			if (domIdx == -1)
			{
				domainQueueType.add(i, dom);
			}
			else if (i != domIdx && i < domainQueueType.size())
			{
				Object tmp = domainQueueType.get(i);
				domainQueueType.set(i, domainQueueType.get(domIdx));
				domainQueueType.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j2 = domainQueueType.size();
		while (j2 > collection2Size)
		{
			domainQueueType.remove(j2-1);
			j2 = domainQueueType.size();
		}

		domainObject.setQueueType(domainQueueType);		

		return domainObject;
	}

}
