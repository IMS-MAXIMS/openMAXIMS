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
 * @author Florin Blindu
 */
public class DementiaConfigurationVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.admin.vo.DementiaConfigurationVo copy(ims.admin.vo.DementiaConfigurationVo valueObjectDest, ims.admin.vo.DementiaConfigurationVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_DementiaConfiguration(valueObjectSrc.getID_DementiaConfiguration());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Age
		valueObjectDest.setAge(valueObjectSrc.getAge());
		// ExcludeFAIRPeriod
		valueObjectDest.setExcludeFAIRPeriod(valueObjectSrc.getExcludeFAIRPeriod());
		// StepOnePeriod
		valueObjectDest.setStepOnePeriod(valueObjectSrc.getStepOnePeriod());
		// RemoveTimePeriod
		valueObjectDest.setRemoveTimePeriod(valueObjectSrc.getRemoveTimePeriod());
		// ColourConfig
		valueObjectDest.setColourConfig(valueObjectSrc.getColourConfig());
		// AMTSThresholdScore
		valueObjectDest.setAMTSThresholdScore(valueObjectSrc.getAMTSThresholdScore());
		// AdmissionTypes
		valueObjectDest.setAdmissionTypes(valueObjectSrc.getAdmissionTypes());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createDementiaConfigurationVoCollectionFromDementiaConfiguration(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.DementiaConfiguration objects.
	 */
	public static ims.admin.vo.DementiaConfigurationVoCollection createDementiaConfigurationVoCollectionFromDementiaConfiguration(java.util.Set domainObjectSet)	
	{
		return createDementiaConfigurationVoCollectionFromDementiaConfiguration(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.DementiaConfiguration objects.
	 */
	public static ims.admin.vo.DementiaConfigurationVoCollection createDementiaConfigurationVoCollectionFromDementiaConfiguration(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.admin.vo.DementiaConfigurationVoCollection voList = new ims.admin.vo.DementiaConfigurationVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.domain.objects.DementiaConfiguration domainObject = (ims.core.admin.domain.objects.DementiaConfiguration) iterator.next();
			ims.admin.vo.DementiaConfigurationVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.domain.objects.DementiaConfiguration objects.
	 */
	public static ims.admin.vo.DementiaConfigurationVoCollection createDementiaConfigurationVoCollectionFromDementiaConfiguration(java.util.List domainObjectList) 
	{
		return createDementiaConfigurationVoCollectionFromDementiaConfiguration(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.DementiaConfiguration objects.
	 */
	public static ims.admin.vo.DementiaConfigurationVoCollection createDementiaConfigurationVoCollectionFromDementiaConfiguration(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.admin.vo.DementiaConfigurationVoCollection voList = new ims.admin.vo.DementiaConfigurationVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.DementiaConfiguration domainObject = (ims.core.admin.domain.objects.DementiaConfiguration) domainObjectList.get(i);
			ims.admin.vo.DementiaConfigurationVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.domain.objects.DementiaConfiguration set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractDementiaConfigurationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.DementiaConfigurationVoCollection voCollection) 
	 {
	 	return extractDementiaConfigurationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractDementiaConfigurationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.DementiaConfigurationVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.DementiaConfigurationVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.DementiaConfiguration domainObject = DementiaConfigurationVoAssembler.extractDementiaConfiguration(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.domain.objects.DementiaConfiguration list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractDementiaConfigurationList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.DementiaConfigurationVoCollection voCollection) 
	 {
	 	return extractDementiaConfigurationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractDementiaConfigurationList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.DementiaConfigurationVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.DementiaConfigurationVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.DementiaConfiguration domainObject = DementiaConfigurationVoAssembler.extractDementiaConfiguration(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.domain.objects.DementiaConfiguration object.
	 * @param domainObject ims.core.admin.domain.objects.DementiaConfiguration
	 */
	 public static ims.admin.vo.DementiaConfigurationVo create(ims.core.admin.domain.objects.DementiaConfiguration domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.domain.objects.DementiaConfiguration object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.admin.vo.DementiaConfigurationVo create(DomainObjectMap map, ims.core.admin.domain.objects.DementiaConfiguration domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.admin.vo.DementiaConfigurationVo valueObject = (ims.admin.vo.DementiaConfigurationVo) map.getValueObject(domainObject, ims.admin.vo.DementiaConfigurationVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.admin.vo.DementiaConfigurationVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.domain.objects.DementiaConfiguration
	 */
	 public static ims.admin.vo.DementiaConfigurationVo insert(ims.admin.vo.DementiaConfigurationVo valueObject, ims.core.admin.domain.objects.DementiaConfiguration domainObject) 
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
	 * @param domainObject ims.core.admin.domain.objects.DementiaConfiguration
	 */
	 public static ims.admin.vo.DementiaConfigurationVo insert(DomainObjectMap map, ims.admin.vo.DementiaConfigurationVo valueObject, ims.core.admin.domain.objects.DementiaConfiguration domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_DementiaConfiguration(domainObject.getId());
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
			
		// Age
		valueObject.setAge(domainObject.getAge());
		// ExcludeFAIRPeriod
		valueObject.setExcludeFAIRPeriod(domainObject.getExcludeFAIRPeriod());
		// StepOnePeriod
		valueObject.setStepOnePeriod(domainObject.getStepOnePeriod());
		// RemoveTimePeriod
		valueObject.setRemoveTimePeriod(domainObject.getRemoveTimePeriod());
		// ColourConfig
		valueObject.setColourConfig(ims.admin.vo.domain.DementiaColourConfigVoAssembler.createDementiaColourConfigVoCollectionFromDementiaColourConfig(map, domainObject.getColourConfig()) );
		// AMTSThresholdScore
		valueObject.setAMTSThresholdScore(domainObject.getAMTSThresholdScore());
		// AdmissionTypes
		java.util.List listAdmissionTypes = domainObject.getAdmissionTypes();
		ims.core.vo.lookups.MethodOfAdmissionCollection AdmissionTypes = new ims.core.vo.lookups.MethodOfAdmissionCollection();
		for(java.util.Iterator iterator = listAdmissionTypes.iterator(); iterator.hasNext(); ) 
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
			ims.core.vo.lookups.MethodOfAdmission voInstance = new ims.core.vo.lookups.MethodOfAdmission(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.core.vo.lookups.MethodOfAdmission parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.core.vo.lookups.MethodOfAdmission(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			AdmissionTypes.add(voInstance);
		}
		valueObject.setAdmissionTypes( AdmissionTypes );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.DementiaConfiguration extractDementiaConfiguration(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.DementiaConfigurationVo valueObject) 
	{
		return 	extractDementiaConfiguration(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.DementiaConfiguration extractDementiaConfiguration(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.DementiaConfigurationVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_DementiaConfiguration();
		ims.core.admin.domain.objects.DementiaConfiguration domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.domain.objects.DementiaConfiguration)domMap.get(valueObject);
			}
			// ims.admin.vo.DementiaConfigurationVo ID_DementiaConfiguration field is unknown
			domainObject = new ims.core.admin.domain.objects.DementiaConfiguration();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_DementiaConfiguration());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.domain.objects.DementiaConfiguration)domMap.get(key);
			}
			domainObject = (ims.core.admin.domain.objects.DementiaConfiguration) domainFactory.getDomainObject(ims.core.admin.domain.objects.DementiaConfiguration.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_DementiaConfiguration());

		domainObject.setAge(valueObject.getAge());
		domainObject.setExcludeFAIRPeriod(valueObject.getExcludeFAIRPeriod());
		domainObject.setStepOnePeriod(valueObject.getStepOnePeriod());
		domainObject.setRemoveTimePeriod(valueObject.getRemoveTimePeriod());
		domainObject.setColourConfig(ims.admin.vo.domain.DementiaColourConfigVoAssembler.extractDementiaColourConfigList(domainFactory, valueObject.getColourConfig(), domainObject.getColourConfig(), domMap));		
		domainObject.setAMTSThresholdScore(valueObject.getAMTSThresholdScore());
		ims.core.vo.lookups.MethodOfAdmissionCollection collection7 =
	valueObject.getAdmissionTypes();
	    java.util.List domainAdmissionTypes = domainObject.getAdmissionTypes();;			
	    int collection7Size=0;
		if (collection7 == null)
		{
			domainAdmissionTypes = new java.util.ArrayList(0);
		}
		else
		{
			collection7Size = collection7.size();
		}
		
		for(int i=0; i<collection7Size; i++) 
		{
			int instanceId = collection7.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainAdmissionTypes.indexOf(dom);
			if (domIdx == -1)
			{
				domainAdmissionTypes.add(i, dom);
			}
			else if (i != domIdx && i < domainAdmissionTypes.size())
			{
				Object tmp = domainAdmissionTypes.get(i);
				domainAdmissionTypes.set(i, domainAdmissionTypes.get(domIdx));
				domainAdmissionTypes.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j7 = domainAdmissionTypes.size();
		while (j7 > collection7Size)
		{
			domainAdmissionTypes.remove(j7-1);
			j7 = domainAdmissionTypes.size();
		}

		domainObject.setAdmissionTypes(domainAdmissionTypes);		

		return domainObject;
	}

}
