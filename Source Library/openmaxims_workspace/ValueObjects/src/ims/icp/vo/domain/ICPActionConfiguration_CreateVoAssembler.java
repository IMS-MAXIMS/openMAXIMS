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
package ims.icp.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author George Cristian Josan
 */
public class ICPActionConfiguration_CreateVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.icp.vo.ICPActionConfiguration_CreateVo copy(ims.icp.vo.ICPActionConfiguration_CreateVo valueObjectDest, ims.icp.vo.ICPActionConfiguration_CreateVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ICPAction(valueObjectSrc.getID_ICPAction());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// Discipline
		valueObjectDest.setDiscipline(valueObjectSrc.getDiscipline());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createICPActionConfiguration_CreateVoCollectionFromICPAction(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.icps.configuration.domain.objects.ICPAction objects.
	 */
	public static ims.icp.vo.ICPActionConfiguration_CreateVoCollection createICPActionConfiguration_CreateVoCollectionFromICPAction(java.util.Set domainObjectSet)	
	{
		return createICPActionConfiguration_CreateVoCollectionFromICPAction(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.icps.configuration.domain.objects.ICPAction objects.
	 */
	public static ims.icp.vo.ICPActionConfiguration_CreateVoCollection createICPActionConfiguration_CreateVoCollectionFromICPAction(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.icp.vo.ICPActionConfiguration_CreateVoCollection voList = new ims.icp.vo.ICPActionConfiguration_CreateVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.icps.configuration.domain.objects.ICPAction domainObject = (ims.icps.configuration.domain.objects.ICPAction) iterator.next();
			ims.icp.vo.ICPActionConfiguration_CreateVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.icps.configuration.domain.objects.ICPAction objects.
	 */
	public static ims.icp.vo.ICPActionConfiguration_CreateVoCollection createICPActionConfiguration_CreateVoCollectionFromICPAction(java.util.List domainObjectList) 
	{
		return createICPActionConfiguration_CreateVoCollectionFromICPAction(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.icps.configuration.domain.objects.ICPAction objects.
	 */
	public static ims.icp.vo.ICPActionConfiguration_CreateVoCollection createICPActionConfiguration_CreateVoCollectionFromICPAction(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.icp.vo.ICPActionConfiguration_CreateVoCollection voList = new ims.icp.vo.ICPActionConfiguration_CreateVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.icps.configuration.domain.objects.ICPAction domainObject = (ims.icps.configuration.domain.objects.ICPAction) domainObjectList.get(i);
			ims.icp.vo.ICPActionConfiguration_CreateVo vo = create(map, domainObject);

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
	 * Create the ims.icps.configuration.domain.objects.ICPAction set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractICPActionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.ICPActionConfiguration_CreateVoCollection voCollection) 
	 {
	 	return extractICPActionSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractICPActionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.ICPActionConfiguration_CreateVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.icp.vo.ICPActionConfiguration_CreateVo vo = voCollection.get(i);
			ims.icps.configuration.domain.objects.ICPAction domainObject = ICPActionConfiguration_CreateVoAssembler.extractICPAction(domainFactory, vo, domMap);

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
	 * Create the ims.icps.configuration.domain.objects.ICPAction list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractICPActionList(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.ICPActionConfiguration_CreateVoCollection voCollection) 
	 {
	 	return extractICPActionList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractICPActionList(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.ICPActionConfiguration_CreateVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.icp.vo.ICPActionConfiguration_CreateVo vo = voCollection.get(i);
			ims.icps.configuration.domain.objects.ICPAction domainObject = ICPActionConfiguration_CreateVoAssembler.extractICPAction(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.icps.configuration.domain.objects.ICPAction object.
	 * @param domainObject ims.icps.configuration.domain.objects.ICPAction
	 */
	 public static ims.icp.vo.ICPActionConfiguration_CreateVo create(ims.icps.configuration.domain.objects.ICPAction domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.icps.configuration.domain.objects.ICPAction object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.icp.vo.ICPActionConfiguration_CreateVo create(DomainObjectMap map, ims.icps.configuration.domain.objects.ICPAction domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.icp.vo.ICPActionConfiguration_CreateVo valueObject = (ims.icp.vo.ICPActionConfiguration_CreateVo) map.getValueObject(domainObject, ims.icp.vo.ICPActionConfiguration_CreateVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.icp.vo.ICPActionConfiguration_CreateVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.icps.configuration.domain.objects.ICPAction
	 */
	 public static ims.icp.vo.ICPActionConfiguration_CreateVo insert(ims.icp.vo.ICPActionConfiguration_CreateVo valueObject, ims.icps.configuration.domain.objects.ICPAction domainObject) 
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
	 * @param domainObject ims.icps.configuration.domain.objects.ICPAction
	 */
	 public static ims.icp.vo.ICPActionConfiguration_CreateVo insert(DomainObjectMap map, ims.icp.vo.ICPActionConfiguration_CreateVo valueObject, ims.icps.configuration.domain.objects.ICPAction domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ICPAction(domainObject.getId());
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
			
		// Name
		valueObject.setName(domainObject.getName());
		// Status
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

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup2 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setStatus(voLookup2);
		}
				// Discipline
		java.util.List listDiscipline = domainObject.getDiscipline();
		ims.core.vo.lookups.HcpDisTypeCollection Discipline = new ims.core.vo.lookups.HcpDisTypeCollection();
		for(java.util.Iterator iterator = listDiscipline.iterator(); iterator.hasNext(); ) 
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
			ims.core.vo.lookups.HcpDisType voInstance = new ims.core.vo.lookups.HcpDisType(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.core.vo.lookups.HcpDisType parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.core.vo.lookups.HcpDisType(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			Discipline.add(voInstance);
		}
		valueObject.setDiscipline( Discipline );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.icps.configuration.domain.objects.ICPAction extractICPAction(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.ICPActionConfiguration_CreateVo valueObject) 
	{
		return 	extractICPAction(domainFactory, valueObject, new HashMap());
	}

	public static ims.icps.configuration.domain.objects.ICPAction extractICPAction(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.ICPActionConfiguration_CreateVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ICPAction();
		ims.icps.configuration.domain.objects.ICPAction domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.icps.configuration.domain.objects.ICPAction)domMap.get(valueObject);
			}
			// ims.icp.vo.ICPActionConfiguration_CreateVo ID_ICPAction field is unknown
			domainObject = new ims.icps.configuration.domain.objects.ICPAction();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ICPAction());
			if (domMap.get(key) != null)
			{
				return (ims.icps.configuration.domain.objects.ICPAction)domMap.get(key);
			}
			domainObject = (ims.icps.configuration.domain.objects.ICPAction) domainFactory.getDomainObject(ims.icps.configuration.domain.objects.ICPAction.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ICPAction());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value2);
		ims.core.vo.lookups.HcpDisTypeCollection collection3 =
	valueObject.getDiscipline();
	    java.util.List domainDiscipline = domainObject.getDiscipline();;			
	    int collection3Size=0;
		if (collection3 == null)
		{
			domainDiscipline = new java.util.ArrayList(0);
		}
		else
		{
			collection3Size = collection3.size();
		}
		
		for(int i=0; i<collection3Size; i++) 
		{
			int instanceId = collection3.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainDiscipline.indexOf(dom);
			if (domIdx == -1)
			{
				domainDiscipline.add(i, dom);
			}
			else if (i != domIdx && i < domainDiscipline.size())
			{
				Object tmp = domainDiscipline.get(i);
				domainDiscipline.set(i, domainDiscipline.get(domIdx));
				domainDiscipline.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j3 = domainDiscipline.size();
		while (j3 > collection3Size)
		{
			domainDiscipline.remove(j3-1);
			j3 = domainDiscipline.size();
		}

		domainObject.setDiscipline(domainDiscipline);		

		return domainObject;
	}

}
