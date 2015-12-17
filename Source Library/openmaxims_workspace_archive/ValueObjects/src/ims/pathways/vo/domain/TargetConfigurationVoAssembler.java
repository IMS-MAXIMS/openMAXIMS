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
package ims.pathways.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Catalin Tomozei
 */
public class TargetConfigurationVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.pathways.vo.TargetConfigurationVo copy(ims.pathways.vo.TargetConfigurationVo valueObjectDest, ims.pathways.vo.TargetConfigurationVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Target(valueObjectSrc.getID_Target());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TaxonomyMaps
		valueObjectDest.setTaxonomyMaps(valueObjectSrc.getTaxonomyMaps());
		// EventLinkType
		valueObjectDest.setEventLinkType(valueObjectSrc.getEventLinkType());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// sysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
		// TargetDateCalculation
		valueObjectDest.setTargetDateCalculation(valueObjectSrc.getTargetDateCalculation());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// Description
		valueObjectDest.setDescription(valueObjectSrc.getDescription());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTargetConfigurationVoCollectionFromTarget(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.pathways.configuration.domain.objects.Target objects.
	 */
	public static ims.pathways.vo.TargetConfigurationVoCollection createTargetConfigurationVoCollectionFromTarget(java.util.Set domainObjectSet)	
	{
		return createTargetConfigurationVoCollectionFromTarget(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.pathways.configuration.domain.objects.Target objects.
	 */
	public static ims.pathways.vo.TargetConfigurationVoCollection createTargetConfigurationVoCollectionFromTarget(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.pathways.vo.TargetConfigurationVoCollection voList = new ims.pathways.vo.TargetConfigurationVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.pathways.configuration.domain.objects.Target domainObject = (ims.pathways.configuration.domain.objects.Target) iterator.next();
			ims.pathways.vo.TargetConfigurationVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.pathways.configuration.domain.objects.Target objects.
	 */
	public static ims.pathways.vo.TargetConfigurationVoCollection createTargetConfigurationVoCollectionFromTarget(java.util.List domainObjectList) 
	{
		return createTargetConfigurationVoCollectionFromTarget(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.pathways.configuration.domain.objects.Target objects.
	 */
	public static ims.pathways.vo.TargetConfigurationVoCollection createTargetConfigurationVoCollectionFromTarget(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.pathways.vo.TargetConfigurationVoCollection voList = new ims.pathways.vo.TargetConfigurationVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.pathways.configuration.domain.objects.Target domainObject = (ims.pathways.configuration.domain.objects.Target) domainObjectList.get(i);
			ims.pathways.vo.TargetConfigurationVo vo = create(map, domainObject);

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
	 * Create the ims.pathways.configuration.domain.objects.Target set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTargetSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.TargetConfigurationVoCollection voCollection) 
	 {
	 	return extractTargetSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTargetSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.TargetConfigurationVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.pathways.vo.TargetConfigurationVo vo = voCollection.get(i);
			ims.pathways.configuration.domain.objects.Target domainObject = TargetConfigurationVoAssembler.extractTarget(domainFactory, vo, domMap);

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
	 * Create the ims.pathways.configuration.domain.objects.Target list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTargetList(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.TargetConfigurationVoCollection voCollection) 
	 {
	 	return extractTargetList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTargetList(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.TargetConfigurationVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.pathways.vo.TargetConfigurationVo vo = voCollection.get(i);
			ims.pathways.configuration.domain.objects.Target domainObject = TargetConfigurationVoAssembler.extractTarget(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.pathways.configuration.domain.objects.Target object.
	 * @param domainObject ims.pathways.configuration.domain.objects.Target
	 */
	 public static ims.pathways.vo.TargetConfigurationVo create(ims.pathways.configuration.domain.objects.Target domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.pathways.configuration.domain.objects.Target object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.pathways.vo.TargetConfigurationVo create(DomainObjectMap map, ims.pathways.configuration.domain.objects.Target domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.pathways.vo.TargetConfigurationVo valueObject = (ims.pathways.vo.TargetConfigurationVo) map.getValueObject(domainObject, ims.pathways.vo.TargetConfigurationVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.pathways.vo.TargetConfigurationVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.pathways.configuration.domain.objects.Target
	 */
	 public static ims.pathways.vo.TargetConfigurationVo insert(ims.pathways.vo.TargetConfigurationVo valueObject, ims.pathways.configuration.domain.objects.Target domainObject) 
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
	 * @param domainObject ims.pathways.configuration.domain.objects.Target
	 */
	 public static ims.pathways.vo.TargetConfigurationVo insert(DomainObjectMap map, ims.pathways.vo.TargetConfigurationVo valueObject, ims.pathways.configuration.domain.objects.Target domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Target(domainObject.getId());
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
			
		// TaxonomyMaps
		valueObject.setTaxonomyMaps(ims.core.vo.domain.TaxonomyMapAssembler.createTaxonomyMapCollectionFromTaxonomyMap(map, domainObject.getTaxonomyMaps()) );
		// EventLinkType
		ims.domain.lookups.LookupInstance instance2 = domainObject.getEventLinkType();
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

			ims.pathways.vo.lookups.EventLinkType voLookup2 = new ims.pathways.vo.lookups.EventLinkType(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.pathways.vo.lookups.EventLinkType parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.pathways.vo.lookups.EventLinkType(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setEventLinkType(voLookup2);
		}
				// Status
		ims.domain.lookups.LookupInstance instance3 = domainObject.getStatus();
		if ( null != instance3 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance3.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance3.getImage().getImageId(), instance3.getImage().getImagePath());
			}
			color = instance3.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup3 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup3 = voLookup3;
			ims.domain.lookups.LookupInstance parent3 = instance3.getParent();
			while (parent3 != null)
			{
				if (parent3.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent3.getImage().getImageId(), parent3.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent3.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup3.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setStatus(voLookup3);
		}
				// sysInfo
		// set system information
		valueObject.setSysInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// TargetDateCalculation
		ims.domain.lookups.LookupInstance instance5 = domainObject.getTargetDateCalculation();
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

			ims.pathways.vo.lookups.TargetDateCalculation voLookup5 = new ims.pathways.vo.lookups.TargetDateCalculation(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.pathways.vo.lookups.TargetDateCalculation parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.pathways.vo.lookups.TargetDateCalculation(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setTargetDateCalculation(voLookup5);
		}
				// Name
		valueObject.setName(domainObject.getName());
		// Description
		valueObject.setDescription(domainObject.getDescription());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.pathways.configuration.domain.objects.Target extractTarget(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.TargetConfigurationVo valueObject) 
	{
		return 	extractTarget(domainFactory, valueObject, new HashMap());
	}

	public static ims.pathways.configuration.domain.objects.Target extractTarget(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.TargetConfigurationVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Target();
		ims.pathways.configuration.domain.objects.Target domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.pathways.configuration.domain.objects.Target)domMap.get(valueObject);
			}
			// ims.pathways.vo.TargetConfigurationVo ID_Target field is unknown
			domainObject = new ims.pathways.configuration.domain.objects.Target();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Target());
			if (domMap.get(key) != null)
			{
				return (ims.pathways.configuration.domain.objects.Target)domMap.get(key);
			}
			domainObject = (ims.pathways.configuration.domain.objects.Target) domainFactory.getDomainObject(ims.pathways.configuration.domain.objects.Target.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Target());

		domainObject.setTaxonomyMaps(ims.core.vo.domain.TaxonomyMapAssembler.extractTaxonomyMapList(domainFactory, valueObject.getTaxonomyMaps(), domainObject.getTaxonomyMaps(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getEventLinkType() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getEventLinkType().getID());
		}
		domainObject.setEventLinkType(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getTargetDateCalculation() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getTargetDateCalculation().getID());
		}
		domainObject.setTargetDateCalculation(value5);
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

		return domainObject;
	}

}
