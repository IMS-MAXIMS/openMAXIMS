//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 12/10/2015, 13:25
 *
 */
package ims.hl7.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Richard Reynolds
 */
public class ifGPMessageQueueVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.hl7.vo.ifGPMessageQueueVo copy(ims.hl7.vo.ifGPMessageQueueVo valueObjectDest, ims.hl7.vo.ifGPMessageQueueVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Gp(valueObjectSrc.getID_Gp());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// name
		valueObjectDest.setName(valueObjectSrc.getName());
		// status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// practices
		valueObjectDest.setPractices(valueObjectSrc.getPractices());
		// CommChannels
		valueObjectDest.setCommChannels(valueObjectSrc.getCommChannels());
		// CodeMappings
		valueObjectDest.setCodeMappings(valueObjectSrc.getCodeMappings());
		// address
		valueObjectDest.setAddress(valueObjectSrc.getAddress());
		// systemInformation
		valueObjectDest.setSystemInformation(valueObjectSrc.getSystemInformation());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createifGPMessageQueueVoCollectionFromGp(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.resource.people.domain.objects.Gp objects.
	 */
	public static ims.hl7.vo.ifGPMessageQueueVoCollection createifGPMessageQueueVoCollectionFromGp(java.util.Set domainObjectSet)	
	{
		return createifGPMessageQueueVoCollectionFromGp(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.resource.people.domain.objects.Gp objects.
	 */
	public static ims.hl7.vo.ifGPMessageQueueVoCollection createifGPMessageQueueVoCollectionFromGp(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.hl7.vo.ifGPMessageQueueVoCollection voList = new ims.hl7.vo.ifGPMessageQueueVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.resource.people.domain.objects.Gp domainObject = (ims.core.resource.people.domain.objects.Gp) iterator.next();
			ims.hl7.vo.ifGPMessageQueueVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.resource.people.domain.objects.Gp objects.
	 */
	public static ims.hl7.vo.ifGPMessageQueueVoCollection createifGPMessageQueueVoCollectionFromGp(java.util.List domainObjectList) 
	{
		return createifGPMessageQueueVoCollectionFromGp(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.resource.people.domain.objects.Gp objects.
	 */
	public static ims.hl7.vo.ifGPMessageQueueVoCollection createifGPMessageQueueVoCollectionFromGp(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.hl7.vo.ifGPMessageQueueVoCollection voList = new ims.hl7.vo.ifGPMessageQueueVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.resource.people.domain.objects.Gp domainObject = (ims.core.resource.people.domain.objects.Gp) domainObjectList.get(i);
			ims.hl7.vo.ifGPMessageQueueVo vo = create(map, domainObject);

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
	 * Create the ims.core.resource.people.domain.objects.Gp set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractGpSet(ims.domain.ILightweightDomainFactory domainFactory, ims.hl7.vo.ifGPMessageQueueVoCollection voCollection) 
	 {
	 	return extractGpSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractGpSet(ims.domain.ILightweightDomainFactory domainFactory, ims.hl7.vo.ifGPMessageQueueVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.hl7.vo.ifGPMessageQueueVo vo = voCollection.get(i);
			ims.core.resource.people.domain.objects.Gp domainObject = ifGPMessageQueueVoAssembler.extractGp(domainFactory, vo, domMap);

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
	 * Create the ims.core.resource.people.domain.objects.Gp list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractGpList(ims.domain.ILightweightDomainFactory domainFactory, ims.hl7.vo.ifGPMessageQueueVoCollection voCollection) 
	 {
	 	return extractGpList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractGpList(ims.domain.ILightweightDomainFactory domainFactory, ims.hl7.vo.ifGPMessageQueueVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.hl7.vo.ifGPMessageQueueVo vo = voCollection.get(i);
			ims.core.resource.people.domain.objects.Gp domainObject = ifGPMessageQueueVoAssembler.extractGp(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.resource.people.domain.objects.Gp object.
	 * @param domainObject ims.core.resource.people.domain.objects.Gp
	 */
	 public static ims.hl7.vo.ifGPMessageQueueVo create(ims.core.resource.people.domain.objects.Gp domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.resource.people.domain.objects.Gp object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.hl7.vo.ifGPMessageQueueVo create(DomainObjectMap map, ims.core.resource.people.domain.objects.Gp domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.hl7.vo.ifGPMessageQueueVo valueObject = (ims.hl7.vo.ifGPMessageQueueVo) map.getValueObject(domainObject, ims.hl7.vo.ifGPMessageQueueVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.hl7.vo.ifGPMessageQueueVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.resource.people.domain.objects.Gp
	 */
	 public static ims.hl7.vo.ifGPMessageQueueVo insert(ims.hl7.vo.ifGPMessageQueueVo valueObject, ims.core.resource.people.domain.objects.Gp domainObject) 
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
	 * @param domainObject ims.core.resource.people.domain.objects.Gp
	 */
	 public static ims.hl7.vo.ifGPMessageQueueVo insert(DomainObjectMap map, ims.hl7.vo.ifGPMessageQueueVo valueObject, ims.core.resource.people.domain.objects.Gp domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Gp(domainObject.getId());
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
			
		// name
		valueObject.setName(ims.core.vo.domain.PersonNameAssembler.create(map, domainObject.getName()) );
		// status
		ims.domain.lookups.LookupInstance instance2 = domainObject.getStatus();
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

			ims.core.vo.lookups.GPStatus voLookup2 = new ims.core.vo.lookups.GPStatus(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.GPStatus parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.GPStatus(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setStatus(voLookup2);
		}
				// practices
		valueObject.setPractices(ims.core.vo.domain.Gp_PracticesVoAssembler.createGp_PracticesVoCollectionFromGpToPractice(map, domainObject.getPractices()) );
		// CommChannels
		valueObject.setCommChannels(ims.core.vo.domain.CommChannelVoAssembler.createCommChannelVoCollectionFromCommunicationChannel(map, domainObject.getCommChannels()) );
		// CodeMappings
		valueObject.setCodeMappings(ims.core.vo.domain.TaxonomyMapAssembler.createTaxonomyMapCollectionFromTaxonomyMap(map, domainObject.getCodeMappings()) );
		// address
		valueObject.setAddress(ims.core.vo.domain.AddressVoAssembler.create(map, domainObject.getAddress()) );
		// systemInformation
		// set system information
		valueObject.setSystemInformation(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.resource.people.domain.objects.Gp extractGp(ims.domain.ILightweightDomainFactory domainFactory, ims.hl7.vo.ifGPMessageQueueVo valueObject) 
	{
		return 	extractGp(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.resource.people.domain.objects.Gp extractGp(ims.domain.ILightweightDomainFactory domainFactory, ims.hl7.vo.ifGPMessageQueueVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Gp();
		ims.core.resource.people.domain.objects.Gp domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.resource.people.domain.objects.Gp)domMap.get(valueObject);
			}
			// ims.hl7.vo.ifGPMessageQueueVo ID_Gp field is unknown
			domainObject = new ims.core.resource.people.domain.objects.Gp();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Gp());
			if (domMap.get(key) != null)
			{
				return (ims.core.resource.people.domain.objects.Gp)domMap.get(key);
			}
			domainObject = (ims.core.resource.people.domain.objects.Gp) domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Gp.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Gp());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.generic.domain.objects.PersonName value1 = null;
		if ( null != valueObject.getName() ) 
		{
			if (valueObject.getName().getBoId() == null)
			{
				if (domMap.get(valueObject.getName()) != null)
				{
					value1 = (ims.core.generic.domain.objects.PersonName)domMap.get(valueObject.getName());
				}
			}
			else
			{
				value1 = (ims.core.generic.domain.objects.PersonName)domainFactory.getDomainObject(ims.core.generic.domain.objects.PersonName.class, valueObject.getName().getBoId());
			}
		}
		domainObject.setName(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value2);

		// SaveAsRefVO treated as RefValueObject
		ims.core.resource.vo.GpToPracticeRefVoCollection refCollection3 = new ims.core.resource.vo.GpToPracticeRefVoCollection();
		if (valueObject.getPractices() != null)
		{
			for (int i3=0; i3<valueObject.getPractices().size(); i3++)
			{
				ims.core.resource.vo.GpToPracticeRefVo ref3 = (ims.core.resource.vo.GpToPracticeRefVo)valueObject.getPractices().get(i3);
				refCollection3.add(ref3);
			}
		}
		int size3 = (null == refCollection3) ? 0 : refCollection3.size();		
		java.util.Set domainPractices3 = domainObject.getPractices();
		if (domainPractices3 == null)
		{
			domainPractices3 = new java.util.HashSet();
		}
		java.util.Set newSet3  = new java.util.HashSet();
		for(int i=0; i<size3; i++) 
		{
			ims.core.resource.vo.GpToPracticeRefVo vo = refCollection3.get(i);					
			ims.core.resource.domain.objects.GpToPractice dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.resource.domain.objects.GpToPractice)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.resource.domain.objects.GpToPractice)domainFactory.getDomainObject( ims.core.resource.domain.objects.GpToPractice.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainPractices3.contains(dom))
			{
				domainPractices3.add(dom);
			}
			newSet3.add(dom);			
		}
		java.util.Set removedSet3 = new java.util.HashSet();
		java.util.Iterator iter3 = domainPractices3.iterator();
		//Find out which objects need to be removed
		while (iter3.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter3.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet3.contains(o))
			{
				removedSet3.add(o);
			}
		}
		iter3 = removedSet3.iterator();
		//Remove the unwanted objects
		while (iter3.hasNext())
		{
			domainPractices3.remove(iter3.next());
		}		
		
		domainObject.setPractices(domainPractices3);		

		// SaveAsRefVO treated as RefValueObject
		ims.core.generic.vo.CommunicationChannelRefVoCollection refCollection4 = new ims.core.generic.vo.CommunicationChannelRefVoCollection();
		if (valueObject.getCommChannels() != null)
		{
			for (int i4=0; i4<valueObject.getCommChannels().size(); i4++)
			{
				ims.core.generic.vo.CommunicationChannelRefVo ref4 = (ims.core.generic.vo.CommunicationChannelRefVo)valueObject.getCommChannels().get(i4);
				refCollection4.add(ref4);
			}
		}
		int size4 = (null == refCollection4) ? 0 : refCollection4.size();		
		java.util.List domainCommChannels4 = domainObject.getCommChannels();
		if (domainCommChannels4 == null)
		{
			domainCommChannels4 = new java.util.ArrayList();
		}
		for(int i=0; i < size4; i++) 
		{
			ims.core.generic.vo.CommunicationChannelRefVo vo = refCollection4.get(i);			
			ims.core.generic.domain.objects.CommunicationChannel dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.generic.domain.objects.CommunicationChannel)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.generic.domain.objects.CommunicationChannel)domainFactory.getDomainObject( ims.core.generic.domain.objects.CommunicationChannel.class, vo.getBoId());
				}
			}

			int domIdx = domainCommChannels4.indexOf(dom);
			if (domIdx == -1)
			{
				domainCommChannels4.add(i, dom);
			}
			else if (i != domIdx && i < domainCommChannels4.size())
			{
				Object tmp = domainCommChannels4.get(i);
				domainCommChannels4.set(i, domainCommChannels4.get(domIdx));
				domainCommChannels4.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i4 = domainCommChannels4.size();
		while (i4 > size4)
		{
			domainCommChannels4.remove(i4-1);
			i4 = domainCommChannels4.size();
		}
		
		domainObject.setCommChannels(domainCommChannels4);		

		// SaveAsRefVO treated as RefValueObject
		ims.core.clinical.vo.TaxonomyMapRefVoCollection refCollection5 = new ims.core.clinical.vo.TaxonomyMapRefVoCollection();
		if (valueObject.getCodeMappings() != null)
		{
			for (int i5=0; i5<valueObject.getCodeMappings().size(); i5++)
			{
				ims.core.clinical.vo.TaxonomyMapRefVo ref5 = (ims.core.clinical.vo.TaxonomyMapRefVo)valueObject.getCodeMappings().get(i5);
				refCollection5.add(ref5);
			}
		}
		int size5 = (null == refCollection5) ? 0 : refCollection5.size();		
		java.util.List domainCodeMappings5 = domainObject.getCodeMappings();
		if (domainCodeMappings5 == null)
		{
			domainCodeMappings5 = new java.util.ArrayList();
		}
		for(int i=0; i < size5; i++) 
		{
			ims.core.clinical.vo.TaxonomyMapRefVo vo = refCollection5.get(i);			
			ims.core.clinical.domain.objects.TaxonomyMap dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.clinical.domain.objects.TaxonomyMap)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.clinical.domain.objects.TaxonomyMap)domainFactory.getDomainObject( ims.core.clinical.domain.objects.TaxonomyMap.class, vo.getBoId());
				}
			}

			int domIdx = domainCodeMappings5.indexOf(dom);
			if (domIdx == -1)
			{
				domainCodeMappings5.add(i, dom);
			}
			else if (i != domIdx && i < domainCodeMappings5.size())
			{
				Object tmp = domainCodeMappings5.get(i);
				domainCodeMappings5.set(i, domainCodeMappings5.get(domIdx));
				domainCodeMappings5.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i5 = domainCodeMappings5.size();
		while (i5 > size5)
		{
			domainCodeMappings5.remove(i5-1);
			i5 = domainCodeMappings5.size();
		}
		
		domainObject.setCodeMappings(domainCodeMappings5);		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.generic.domain.objects.Address value6 = null;
		if ( null != valueObject.getAddress() ) 
		{
			if (valueObject.getAddress().getBoId() == null)
			{
				if (domMap.get(valueObject.getAddress()) != null)
				{
					value6 = (ims.core.generic.domain.objects.Address)domMap.get(valueObject.getAddress());
				}
			}
			else
			{
				value6 = (ims.core.generic.domain.objects.Address)domainFactory.getDomainObject(ims.core.generic.domain.objects.Address.class, valueObject.getAddress().getBoId());
			}
		}
		domainObject.setAddress(value6);

		return domainObject;
	}

}
