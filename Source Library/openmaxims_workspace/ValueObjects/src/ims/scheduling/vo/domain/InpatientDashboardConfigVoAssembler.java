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
package ims.scheduling.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Bogdan Tofei
 */
public class InpatientDashboardConfigVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.InpatientDashboardConfigVo copy(ims.scheduling.vo.InpatientDashboardConfigVo valueObjectDest, ims.scheduling.vo.InpatientDashboardConfigVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_InpatientDashboardConfig(valueObjectSrc.getID_InpatientDashboardConfig());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// WardDeptName
		valueObjectDest.setWardDeptName(valueObjectSrc.getWardDeptName());
		// Category
		valueObjectDest.setCategory(valueObjectSrc.getCategory());
		// WardLocations
		valueObjectDest.setWardLocations(valueObjectSrc.getWardLocations());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// SequenceNo
		valueObjectDest.setSequenceNo(valueObjectSrc.getSequenceNo());
		// Red
		valueObjectDest.setRed(valueObjectSrc.getRed());
		// Green
		valueObjectDest.setGreen(valueObjectSrc.getGreen());
		// Blue
		valueObjectDest.setBlue(valueObjectSrc.getBlue());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createInpatientDashboardConfigVoCollectionFromInpatientDashboardConfig(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.InpatientDashboardConfig objects.
	 */
	public static ims.scheduling.vo.InpatientDashboardConfigVoCollection createInpatientDashboardConfigVoCollectionFromInpatientDashboardConfig(java.util.Set domainObjectSet)	
	{
		return createInpatientDashboardConfigVoCollectionFromInpatientDashboardConfig(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.InpatientDashboardConfig objects.
	 */
	public static ims.scheduling.vo.InpatientDashboardConfigVoCollection createInpatientDashboardConfigVoCollectionFromInpatientDashboardConfig(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.InpatientDashboardConfigVoCollection voList = new ims.scheduling.vo.InpatientDashboardConfigVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.domain.objects.InpatientDashboardConfig domainObject = (ims.core.admin.domain.objects.InpatientDashboardConfig) iterator.next();
			ims.scheduling.vo.InpatientDashboardConfigVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.domain.objects.InpatientDashboardConfig objects.
	 */
	public static ims.scheduling.vo.InpatientDashboardConfigVoCollection createInpatientDashboardConfigVoCollectionFromInpatientDashboardConfig(java.util.List domainObjectList) 
	{
		return createInpatientDashboardConfigVoCollectionFromInpatientDashboardConfig(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.InpatientDashboardConfig objects.
	 */
	public static ims.scheduling.vo.InpatientDashboardConfigVoCollection createInpatientDashboardConfigVoCollectionFromInpatientDashboardConfig(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.InpatientDashboardConfigVoCollection voList = new ims.scheduling.vo.InpatientDashboardConfigVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.InpatientDashboardConfig domainObject = (ims.core.admin.domain.objects.InpatientDashboardConfig) domainObjectList.get(i);
			ims.scheduling.vo.InpatientDashboardConfigVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.domain.objects.InpatientDashboardConfig set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractInpatientDashboardConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.InpatientDashboardConfigVoCollection voCollection) 
	 {
	 	return extractInpatientDashboardConfigSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractInpatientDashboardConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.InpatientDashboardConfigVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.InpatientDashboardConfigVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.InpatientDashboardConfig domainObject = InpatientDashboardConfigVoAssembler.extractInpatientDashboardConfig(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.domain.objects.InpatientDashboardConfig list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractInpatientDashboardConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.InpatientDashboardConfigVoCollection voCollection) 
	 {
	 	return extractInpatientDashboardConfigList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractInpatientDashboardConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.InpatientDashboardConfigVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.InpatientDashboardConfigVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.InpatientDashboardConfig domainObject = InpatientDashboardConfigVoAssembler.extractInpatientDashboardConfig(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.domain.objects.InpatientDashboardConfig object.
	 * @param domainObject ims.core.admin.domain.objects.InpatientDashboardConfig
	 */
	 public static ims.scheduling.vo.InpatientDashboardConfigVo create(ims.core.admin.domain.objects.InpatientDashboardConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.domain.objects.InpatientDashboardConfig object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.scheduling.vo.InpatientDashboardConfigVo create(DomainObjectMap map, ims.core.admin.domain.objects.InpatientDashboardConfig domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.InpatientDashboardConfigVo valueObject = (ims.scheduling.vo.InpatientDashboardConfigVo) map.getValueObject(domainObject, ims.scheduling.vo.InpatientDashboardConfigVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.InpatientDashboardConfigVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.domain.objects.InpatientDashboardConfig
	 */
	 public static ims.scheduling.vo.InpatientDashboardConfigVo insert(ims.scheduling.vo.InpatientDashboardConfigVo valueObject, ims.core.admin.domain.objects.InpatientDashboardConfig domainObject) 
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
	 * @param domainObject ims.core.admin.domain.objects.InpatientDashboardConfig
	 */
	 public static ims.scheduling.vo.InpatientDashboardConfigVo insert(DomainObjectMap map, ims.scheduling.vo.InpatientDashboardConfigVo valueObject, ims.core.admin.domain.objects.InpatientDashboardConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_InpatientDashboardConfig(domainObject.getId());
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
			
		// WardDeptName
		valueObject.setWardDeptName(domainObject.getWardDeptName());
		// Category
		ims.domain.lookups.LookupInstance instance2 = domainObject.getCategory();
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

			ims.admin.vo.lookups.WardDeptCategory voLookup2 = new ims.admin.vo.lookups.WardDeptCategory(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.admin.vo.lookups.WardDeptCategory parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.admin.vo.lookups.WardDeptCategory(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setCategory(voLookup2);
		}
				// WardLocations
		valueObject.setWardLocations(ims.core.vo.domain.LocationLiteVoAssembler.createLocationLiteVoCollectionFromLocation(map, domainObject.getWardLocations()) );
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// SequenceNo
		valueObject.setSequenceNo(domainObject.getSequenceNo());
		// Red
		valueObject.setRed(domainObject.getRed());
		// Green
		valueObject.setGreen(domainObject.getGreen());
		// Blue
		valueObject.setBlue(domainObject.getBlue());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.InpatientDashboardConfig extractInpatientDashboardConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.InpatientDashboardConfigVo valueObject) 
	{
		return 	extractInpatientDashboardConfig(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.InpatientDashboardConfig extractInpatientDashboardConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.InpatientDashboardConfigVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_InpatientDashboardConfig();
		ims.core.admin.domain.objects.InpatientDashboardConfig domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.domain.objects.InpatientDashboardConfig)domMap.get(valueObject);
			}
			// ims.scheduling.vo.InpatientDashboardConfigVo ID_InpatientDashboardConfig field is unknown
			domainObject = new ims.core.admin.domain.objects.InpatientDashboardConfig();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_InpatientDashboardConfig());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.domain.objects.InpatientDashboardConfig)domMap.get(key);
			}
			domainObject = (ims.core.admin.domain.objects.InpatientDashboardConfig) domainFactory.getDomainObject(ims.core.admin.domain.objects.InpatientDashboardConfig.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_InpatientDashboardConfig());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getWardDeptName() != null && valueObject.getWardDeptName().equals(""))
		{
			valueObject.setWardDeptName(null);
		}
		domainObject.setWardDeptName(valueObject.getWardDeptName());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getCategory() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getCategory().getID());
		}
		domainObject.setCategory(value2);

		// SaveAsRefVO treated as RefValueObject
		ims.core.resource.place.vo.LocationRefVoCollection refCollection3 = new ims.core.resource.place.vo.LocationRefVoCollection();
		if (valueObject.getWardLocations() != null)
		{
			for (int i3=0; i3<valueObject.getWardLocations().size(); i3++)
			{
				ims.core.resource.place.vo.LocationRefVo ref3 = (ims.core.resource.place.vo.LocationRefVo)valueObject.getWardLocations().get(i3);
				refCollection3.add(ref3);
			}
		}
		int size3 = (null == refCollection3) ? 0 : refCollection3.size();		
		java.util.Set domainWardLocations3 = domainObject.getWardLocations();
		if (domainWardLocations3 == null)
		{
			domainWardLocations3 = new java.util.HashSet();
		}
		java.util.Set newSet3  = new java.util.HashSet();
		for(int i=0; i<size3; i++) 
		{
			ims.core.resource.place.vo.LocationRefVo vo = refCollection3.get(i);					
			ims.core.resource.place.domain.objects.Location dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.resource.place.domain.objects.Location)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject( ims.core.resource.place.domain.objects.Location.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainWardLocations3.contains(dom))
			{
				domainWardLocations3.add(dom);
			}
			newSet3.add(dom);			
		}
		java.util.Set removedSet3 = new java.util.HashSet();
		java.util.Iterator iter3 = domainWardLocations3.iterator();
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
			domainWardLocations3.remove(iter3.next());
		}		
		
		domainObject.setWardLocations(domainWardLocations3);		
		domainObject.setIsActive(valueObject.getIsActive());
		domainObject.setSequenceNo(valueObject.getSequenceNo());
		domainObject.setRed(valueObject.getRed());
		domainObject.setGreen(valueObject.getGreen());
		domainObject.setBlue(valueObject.getBlue());

		return domainObject;
	}

}
