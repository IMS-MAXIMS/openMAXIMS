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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author John MacEnri
 */
public class CommChannelVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.CommChannelVo copy(ims.core.vo.CommChannelVo valueObjectDest, ims.core.vo.CommChannelVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CommunicationChannel(valueObjectSrc.getID_CommunicationChannel());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ChannelType
		valueObjectDest.setChannelType(valueObjectSrc.getChannelType());
		// CommValue
		valueObjectDest.setCommValue(valueObjectSrc.getCommValue());
		// SystemInformation
		valueObjectDest.setSystemInformation(valueObjectSrc.getSystemInformation());
		// objectidentifier
		valueObjectDest.setObjectidentifier(valueObjectSrc.getObjectidentifier());
		// beffdate
		valueObjectDest.setBeffdate(valueObjectSrc.getBeffdate());
		// beffdatecnf
		valueObjectDest.setBeffdatecnf(valueObjectSrc.getBeffdatecnf());
		// betdate
		valueObjectDest.setBetdate(valueObjectSrc.getBetdate());
		// betdatecnf
		valueObjectDest.setBetdatecnf(valueObjectSrc.getBetdatecnf());
		// pdsUpdateMode
		valueObjectDest.setPdsUpdateMode(valueObjectSrc.getPdsUpdateMode());
		// ChannelUsage
		valueObjectDest.setChannelUsage(valueObjectSrc.getChannelUsage());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCommChannelVoCollectionFromCommunicationChannel(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.generic.domain.objects.CommunicationChannel objects.
	 */
	public static ims.core.vo.CommChannelVoCollection createCommChannelVoCollectionFromCommunicationChannel(java.util.Set domainObjectSet)	
	{
		return createCommChannelVoCollectionFromCommunicationChannel(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.generic.domain.objects.CommunicationChannel objects.
	 */
	public static ims.core.vo.CommChannelVoCollection createCommChannelVoCollectionFromCommunicationChannel(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.CommChannelVoCollection voList = new ims.core.vo.CommChannelVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.generic.domain.objects.CommunicationChannel domainObject = (ims.core.generic.domain.objects.CommunicationChannel) iterator.next();
			ims.core.vo.CommChannelVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.generic.domain.objects.CommunicationChannel objects.
	 */
	public static ims.core.vo.CommChannelVoCollection createCommChannelVoCollectionFromCommunicationChannel(java.util.List domainObjectList) 
	{
		return createCommChannelVoCollectionFromCommunicationChannel(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.generic.domain.objects.CommunicationChannel objects.
	 */
	public static ims.core.vo.CommChannelVoCollection createCommChannelVoCollectionFromCommunicationChannel(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.CommChannelVoCollection voList = new ims.core.vo.CommChannelVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.generic.domain.objects.CommunicationChannel domainObject = (ims.core.generic.domain.objects.CommunicationChannel) domainObjectList.get(i);
			ims.core.vo.CommChannelVo vo = create(map, domainObject);

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
	 * Create the ims.core.generic.domain.objects.CommunicationChannel set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractCommunicationChannelSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CommChannelVoCollection voCollection) 
	 {
	 	return extractCommunicationChannelSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCommunicationChannelSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CommChannelVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.CommChannelVo vo = voCollection.get(i);
			ims.core.generic.domain.objects.CommunicationChannel domainObject = CommChannelVoAssembler.extractCommunicationChannel(domainFactory, vo, domMap);

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
	 * Create the ims.core.generic.domain.objects.CommunicationChannel list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractCommunicationChannelList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CommChannelVoCollection voCollection) 
	 {
	 	return extractCommunicationChannelList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCommunicationChannelList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CommChannelVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.CommChannelVo vo = voCollection.get(i);
			ims.core.generic.domain.objects.CommunicationChannel domainObject = CommChannelVoAssembler.extractCommunicationChannel(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.generic.domain.objects.CommunicationChannel object.
	 * @param domainObject ims.core.generic.domain.objects.CommunicationChannel
	 */
	 public static ims.core.vo.CommChannelVo create(ims.core.generic.domain.objects.CommunicationChannel domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.generic.domain.objects.CommunicationChannel object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.CommChannelVo create(DomainObjectMap map, ims.core.generic.domain.objects.CommunicationChannel domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.CommChannelVo valueObject = (ims.core.vo.CommChannelVo) map.getValueObject(domainObject, ims.core.vo.CommChannelVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.CommChannelVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.generic.domain.objects.CommunicationChannel
	 */
	 public static ims.core.vo.CommChannelVo insert(ims.core.vo.CommChannelVo valueObject, ims.core.generic.domain.objects.CommunicationChannel domainObject) 
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
	 * @param domainObject ims.core.generic.domain.objects.CommunicationChannel
	 */
	 public static ims.core.vo.CommChannelVo insert(DomainObjectMap map, ims.core.vo.CommChannelVo valueObject, ims.core.generic.domain.objects.CommunicationChannel domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_CommunicationChannel(domainObject.getId());
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
			
		// ChannelType
		ims.domain.lookups.LookupInstance instance1 = domainObject.getChannelType();
		if ( null != instance1 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance1.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance1.getImage().getImageId(), instance1.getImage().getImagePath());
			}
			color = instance1.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.ChannelType voLookup1 = new ims.core.vo.lookups.ChannelType(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.ChannelType parentVoLookup1 = voLookup1;
			ims.domain.lookups.LookupInstance parent1 = instance1.getParent();
			while (parent1 != null)
			{
				if (parent1.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent1.getImage().getImageId(), parent1.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent1.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup1.setParent(new ims.core.vo.lookups.ChannelType(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setChannelType(voLookup1);
		}
				// CommValue
		valueObject.setCommValue(domainObject.getCommValue());
		// SystemInformation
		// set system information
		valueObject.setSystemInformation(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// objectidentifier
		valueObject.setObjectidentifier(domainObject.getObjectidentifier());
		// beffdate
		java.util.Date beffdate = domainObject.getBeffdate();
		if ( null != beffdate ) 
		{
			valueObject.setBeffdate(new ims.framework.utils.Date(beffdate) );
		}
		// beffdatecnf
		valueObject.setBeffdatecnf( domainObject.isBeffdatecnf() );
		// betdate
		java.util.Date betdate = domainObject.getBetdate();
		if ( null != betdate ) 
		{
			valueObject.setBetdate(new ims.framework.utils.Date(betdate) );
		}
		// betdatecnf
		valueObject.setBetdatecnf( domainObject.isBetdatecnf() );
		// pdsUpdateMode
		ims.domain.lookups.LookupInstance instance9 = domainObject.getPdsUpdateMode();
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

			ims.core.vo.lookups.PDSUpdateMode voLookup9 = new ims.core.vo.lookups.PDSUpdateMode(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.PDSUpdateMode parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.core.vo.lookups.PDSUpdateMode(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setPdsUpdateMode(voLookup9);
		}
				// ChannelUsage
		ims.domain.lookups.LookupInstance instance10 = domainObject.getChannelUsage();
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

			ims.core.vo.lookups.PDSChannelUsage voLookup10 = new ims.core.vo.lookups.PDSChannelUsage(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.PDSChannelUsage parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.core.vo.lookups.PDSChannelUsage(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setChannelUsage(voLookup10);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.generic.domain.objects.CommunicationChannel extractCommunicationChannel(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CommChannelVo valueObject) 
	{
		return 	extractCommunicationChannel(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.generic.domain.objects.CommunicationChannel extractCommunicationChannel(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CommChannelVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_CommunicationChannel();
		ims.core.generic.domain.objects.CommunicationChannel domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.generic.domain.objects.CommunicationChannel)domMap.get(valueObject);
			}
			// ims.core.vo.CommChannelVo ID_CommunicationChannel field is unknown
			domainObject = new ims.core.generic.domain.objects.CommunicationChannel();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_CommunicationChannel());
			if (domMap.get(key) != null)
			{
				return (ims.core.generic.domain.objects.CommunicationChannel)domMap.get(key);
			}
			domainObject = (ims.core.generic.domain.objects.CommunicationChannel) domainFactory.getDomainObject(ims.core.generic.domain.objects.CommunicationChannel.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_CommunicationChannel());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getChannelType() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getChannelType().getID());
		}
		domainObject.setChannelType(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCommValue() != null && valueObject.getCommValue().equals(""))
		{
			valueObject.setCommValue(null);
		}
		domainObject.setCommValue(valueObject.getCommValue());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getObjectidentifier() != null && valueObject.getObjectidentifier().equals(""))
		{
			valueObject.setObjectidentifier(null);
		}
		domainObject.setObjectidentifier(valueObject.getObjectidentifier());
		java.util.Date value5 = null;
		ims.framework.utils.Date date5 = valueObject.getBeffdate();		
		if ( date5 != null ) 
		{
			value5 = date5.getDate();
		}
		domainObject.setBeffdate(value5);
		domainObject.setBeffdatecnf(valueObject.getBeffdatecnf());
		java.util.Date value7 = null;
		ims.framework.utils.Date date7 = valueObject.getBetdate();		
		if ( date7 != null ) 
		{
			value7 = date7.getDate();
		}
		domainObject.setBetdate(value7);
		domainObject.setBetdatecnf(valueObject.getBetdatecnf());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getPdsUpdateMode() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getPdsUpdateMode().getID());
		}
		domainObject.setPdsUpdateMode(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getChannelUsage() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getChannelUsage().getID());
		}
		domainObject.setChannelUsage(value10);

		return domainObject;
	}

}
