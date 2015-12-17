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
 * Generated on 12/10/2015, 13:24
 *
 */
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class SECSVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.SECSVo copy(ims.clinical.vo.SECSVo valueObjectDest, ims.clinical.vo.SECSVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_SECS(valueObjectSrc.getID_SECS());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Configuration
		valueObjectDest.setConfiguration(valueObjectSrc.getConfiguration());
		// EWSTriggerScore
		valueObjectDest.setEWSTriggerScore(valueObjectSrc.getEWSTriggerScore());
		// EWSProtocol
		valueObjectDest.setEWSProtocol(valueObjectSrc.getEWSProtocol());
		// OBSProtocolType
		valueObjectDest.setOBSProtocolType(valueObjectSrc.getOBSProtocolType());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSECSVoCollectionFromSECS(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.configuration.domain.objects.SECS objects.
	 */
	public static ims.clinical.vo.SECSVoCollection createSECSVoCollectionFromSECS(java.util.Set domainObjectSet)	
	{
		return createSECSVoCollectionFromSECS(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.configuration.domain.objects.SECS objects.
	 */
	public static ims.clinical.vo.SECSVoCollection createSECSVoCollectionFromSECS(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.SECSVoCollection voList = new ims.clinical.vo.SECSVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.configuration.domain.objects.SECS domainObject = (ims.clinical.configuration.domain.objects.SECS) iterator.next();
			ims.clinical.vo.SECSVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.configuration.domain.objects.SECS objects.
	 */
	public static ims.clinical.vo.SECSVoCollection createSECSVoCollectionFromSECS(java.util.List domainObjectList) 
	{
		return createSECSVoCollectionFromSECS(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.configuration.domain.objects.SECS objects.
	 */
	public static ims.clinical.vo.SECSVoCollection createSECSVoCollectionFromSECS(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.SECSVoCollection voList = new ims.clinical.vo.SECSVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.configuration.domain.objects.SECS domainObject = (ims.clinical.configuration.domain.objects.SECS) domainObjectList.get(i);
			ims.clinical.vo.SECSVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.configuration.domain.objects.SECS set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractSECSSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SECSVoCollection voCollection) 
	 {
	 	return extractSECSSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSECSSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SECSVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.SECSVo vo = voCollection.get(i);
			ims.clinical.configuration.domain.objects.SECS domainObject = SECSVoAssembler.extractSECS(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.configuration.domain.objects.SECS list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractSECSList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SECSVoCollection voCollection) 
	 {
	 	return extractSECSList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSECSList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SECSVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.SECSVo vo = voCollection.get(i);
			ims.clinical.configuration.domain.objects.SECS domainObject = SECSVoAssembler.extractSECS(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.configuration.domain.objects.SECS object.
	 * @param domainObject ims.clinical.configuration.domain.objects.SECS
	 */
	 public static ims.clinical.vo.SECSVo create(ims.clinical.configuration.domain.objects.SECS domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.configuration.domain.objects.SECS object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.SECSVo create(DomainObjectMap map, ims.clinical.configuration.domain.objects.SECS domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.SECSVo valueObject = (ims.clinical.vo.SECSVo) map.getValueObject(domainObject, ims.clinical.vo.SECSVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.SECSVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.configuration.domain.objects.SECS
	 */
	 public static ims.clinical.vo.SECSVo insert(ims.clinical.vo.SECSVo valueObject, ims.clinical.configuration.domain.objects.SECS domainObject) 
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
	 * @param domainObject ims.clinical.configuration.domain.objects.SECS
	 */
	 public static ims.clinical.vo.SECSVo insert(DomainObjectMap map, ims.clinical.vo.SECSVo valueObject, ims.clinical.configuration.domain.objects.SECS domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_SECS(domainObject.getId());
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
			
		// Configuration
		valueObject.setConfiguration(ims.clinical.vo.domain.SECSConfigurationVoAssembler.createSECSConfigurationVoCollectionFromSECSConfiguration(map, domainObject.getConfiguration()) );
		// EWSTriggerScore
		valueObject.setEWSTriggerScore(domainObject.getEWSTriggerScore());
		// EWSProtocol
		valueObject.setEWSProtocol(ims.assessment.vo.domain.UserAssessmentLiteVoAssembler.create(map, domainObject.getEWSProtocol()) );
		// OBSProtocolType
		ims.domain.lookups.LookupInstance instance4 = domainObject.getOBSProtocolType();
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

			ims.core.vo.lookups.OBSProtocolType voLookup4 = new ims.core.vo.lookups.OBSProtocolType(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.OBSProtocolType parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.OBSProtocolType(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setOBSProtocolType(voLookup4);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.configuration.domain.objects.SECS extractSECS(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SECSVo valueObject) 
	{
		return 	extractSECS(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.configuration.domain.objects.SECS extractSECS(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SECSVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_SECS();
		ims.clinical.configuration.domain.objects.SECS domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.configuration.domain.objects.SECS)domMap.get(valueObject);
			}
			// ims.clinical.vo.SECSVo ID_SECS field is unknown
			domainObject = new ims.clinical.configuration.domain.objects.SECS();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_SECS());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.configuration.domain.objects.SECS)domMap.get(key);
			}
			domainObject = (ims.clinical.configuration.domain.objects.SECS) domainFactory.getDomainObject(ims.clinical.configuration.domain.objects.SECS.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_SECS());

		domainObject.setConfiguration(ims.clinical.vo.domain.SECSConfigurationVoAssembler.extractSECSConfigurationList(domainFactory, valueObject.getConfiguration(), domainObject.getConfiguration(), domMap));		
		domainObject.setEWSTriggerScore(valueObject.getEWSTriggerScore());
		domainObject.setEWSProtocol(ims.assessment.vo.domain.UserAssessmentLiteVoAssembler.extractUserAssessment(domainFactory, valueObject.getEWSProtocol(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getOBSProtocolType() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getOBSProtocolType().getID());
		}
		domainObject.setOBSProtocolType(value4);

		return domainObject;
	}

}
