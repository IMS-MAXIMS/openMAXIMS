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
public class ElectiveListHospitalConfigurationVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.admin.vo.ElectiveListHospitalConfigurationVo copy(ims.admin.vo.ElectiveListHospitalConfigurationVo valueObjectDest, ims.admin.vo.ElectiveListHospitalConfigurationVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ElectiveListHospitalConfiguration(valueObjectSrc.getID_ElectiveListHospitalConfiguration());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ListLocation
		valueObjectDest.setListLocation(valueObjectSrc.getListLocation());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createElectiveListHospitalConfigurationVoCollectionFromElectiveListHospitalConfiguration(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.configuration.domain.objects.ElectiveListHospitalConfiguration objects.
	 */
	public static ims.admin.vo.ElectiveListHospitalConfigurationVoCollection createElectiveListHospitalConfigurationVoCollectionFromElectiveListHospitalConfiguration(java.util.Set domainObjectSet)	
	{
		return createElectiveListHospitalConfigurationVoCollectionFromElectiveListHospitalConfiguration(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.configuration.domain.objects.ElectiveListHospitalConfiguration objects.
	 */
	public static ims.admin.vo.ElectiveListHospitalConfigurationVoCollection createElectiveListHospitalConfigurationVoCollectionFromElectiveListHospitalConfiguration(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.admin.vo.ElectiveListHospitalConfigurationVoCollection voList = new ims.admin.vo.ElectiveListHospitalConfigurationVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.configuration.domain.objects.ElectiveListHospitalConfiguration domainObject = (ims.core.configuration.domain.objects.ElectiveListHospitalConfiguration) iterator.next();
			ims.admin.vo.ElectiveListHospitalConfigurationVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.configuration.domain.objects.ElectiveListHospitalConfiguration objects.
	 */
	public static ims.admin.vo.ElectiveListHospitalConfigurationVoCollection createElectiveListHospitalConfigurationVoCollectionFromElectiveListHospitalConfiguration(java.util.List domainObjectList) 
	{
		return createElectiveListHospitalConfigurationVoCollectionFromElectiveListHospitalConfiguration(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.configuration.domain.objects.ElectiveListHospitalConfiguration objects.
	 */
	public static ims.admin.vo.ElectiveListHospitalConfigurationVoCollection createElectiveListHospitalConfigurationVoCollectionFromElectiveListHospitalConfiguration(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.admin.vo.ElectiveListHospitalConfigurationVoCollection voList = new ims.admin.vo.ElectiveListHospitalConfigurationVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.configuration.domain.objects.ElectiveListHospitalConfiguration domainObject = (ims.core.configuration.domain.objects.ElectiveListHospitalConfiguration) domainObjectList.get(i);
			ims.admin.vo.ElectiveListHospitalConfigurationVo vo = create(map, domainObject);

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
	 * Create the ims.core.configuration.domain.objects.ElectiveListHospitalConfiguration set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractElectiveListHospitalConfigurationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ElectiveListHospitalConfigurationVoCollection voCollection) 
	 {
	 	return extractElectiveListHospitalConfigurationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractElectiveListHospitalConfigurationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ElectiveListHospitalConfigurationVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.ElectiveListHospitalConfigurationVo vo = voCollection.get(i);
			ims.core.configuration.domain.objects.ElectiveListHospitalConfiguration domainObject = ElectiveListHospitalConfigurationVoAssembler.extractElectiveListHospitalConfiguration(domainFactory, vo, domMap);

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
	 * Create the ims.core.configuration.domain.objects.ElectiveListHospitalConfiguration list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractElectiveListHospitalConfigurationList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ElectiveListHospitalConfigurationVoCollection voCollection) 
	 {
	 	return extractElectiveListHospitalConfigurationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractElectiveListHospitalConfigurationList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ElectiveListHospitalConfigurationVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.ElectiveListHospitalConfigurationVo vo = voCollection.get(i);
			ims.core.configuration.domain.objects.ElectiveListHospitalConfiguration domainObject = ElectiveListHospitalConfigurationVoAssembler.extractElectiveListHospitalConfiguration(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.configuration.domain.objects.ElectiveListHospitalConfiguration object.
	 * @param domainObject ims.core.configuration.domain.objects.ElectiveListHospitalConfiguration
	 */
	 public static ims.admin.vo.ElectiveListHospitalConfigurationVo create(ims.core.configuration.domain.objects.ElectiveListHospitalConfiguration domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.configuration.domain.objects.ElectiveListHospitalConfiguration object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.admin.vo.ElectiveListHospitalConfigurationVo create(DomainObjectMap map, ims.core.configuration.domain.objects.ElectiveListHospitalConfiguration domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.admin.vo.ElectiveListHospitalConfigurationVo valueObject = (ims.admin.vo.ElectiveListHospitalConfigurationVo) map.getValueObject(domainObject, ims.admin.vo.ElectiveListHospitalConfigurationVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.admin.vo.ElectiveListHospitalConfigurationVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.configuration.domain.objects.ElectiveListHospitalConfiguration
	 */
	 public static ims.admin.vo.ElectiveListHospitalConfigurationVo insert(ims.admin.vo.ElectiveListHospitalConfigurationVo valueObject, ims.core.configuration.domain.objects.ElectiveListHospitalConfiguration domainObject) 
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
	 * @param domainObject ims.core.configuration.domain.objects.ElectiveListHospitalConfiguration
	 */
	 public static ims.admin.vo.ElectiveListHospitalConfigurationVo insert(DomainObjectMap map, ims.admin.vo.ElectiveListHospitalConfigurationVo valueObject, ims.core.configuration.domain.objects.ElectiveListHospitalConfiguration domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ElectiveListHospitalConfiguration(domainObject.getId());
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
			
		// ListLocation
		valueObject.setListLocation(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getListLocation()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.configuration.domain.objects.ElectiveListHospitalConfiguration extractElectiveListHospitalConfiguration(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ElectiveListHospitalConfigurationVo valueObject) 
	{
		return 	extractElectiveListHospitalConfiguration(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.configuration.domain.objects.ElectiveListHospitalConfiguration extractElectiveListHospitalConfiguration(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ElectiveListHospitalConfigurationVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ElectiveListHospitalConfiguration();
		ims.core.configuration.domain.objects.ElectiveListHospitalConfiguration domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.configuration.domain.objects.ElectiveListHospitalConfiguration)domMap.get(valueObject);
			}
			// ims.admin.vo.ElectiveListHospitalConfigurationVo ID_ElectiveListHospitalConfiguration field is unknown
			domainObject = new ims.core.configuration.domain.objects.ElectiveListHospitalConfiguration();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ElectiveListHospitalConfiguration());
			if (domMap.get(key) != null)
			{
				return (ims.core.configuration.domain.objects.ElectiveListHospitalConfiguration)domMap.get(key);
			}
			domainObject = (ims.core.configuration.domain.objects.ElectiveListHospitalConfiguration) domainFactory.getDomainObject(ims.core.configuration.domain.objects.ElectiveListHospitalConfiguration.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ElectiveListHospitalConfiguration());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value1 = null;
		if ( null != valueObject.getListLocation() ) 
		{
			if (valueObject.getListLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getListLocation()) != null)
				{
					value1 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getListLocation());
				}
			}
			else
			{
				value1 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getListLocation().getBoId());
			}
		}
		domainObject.setListLocation(value1);

		return domainObject;
	}

}
