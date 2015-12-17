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
public class ICPConfigurationDisplayVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.icp.vo.ICPConfigurationDisplayVo copy(ims.icp.vo.ICPConfigurationDisplayVo valueObjectDest, ims.icp.vo.ICPConfigurationDisplayVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ICP(valueObjectSrc.getID_ICP());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Stages
		valueObjectDest.setStages(valueObjectSrc.getStages());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// Description
		valueObjectDest.setDescription(valueObjectSrc.getDescription());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createICPConfigurationDisplayVoCollectionFromICP(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.icps.configuration.domain.objects.ICP objects.
	 */
	public static ims.icp.vo.ICPConfigurationDisplayVoCollection createICPConfigurationDisplayVoCollectionFromICP(java.util.Set domainObjectSet)	
	{
		return createICPConfigurationDisplayVoCollectionFromICP(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.icps.configuration.domain.objects.ICP objects.
	 */
	public static ims.icp.vo.ICPConfigurationDisplayVoCollection createICPConfigurationDisplayVoCollectionFromICP(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.icp.vo.ICPConfigurationDisplayVoCollection voList = new ims.icp.vo.ICPConfigurationDisplayVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.icps.configuration.domain.objects.ICP domainObject = (ims.icps.configuration.domain.objects.ICP) iterator.next();
			ims.icp.vo.ICPConfigurationDisplayVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.icps.configuration.domain.objects.ICP objects.
	 */
	public static ims.icp.vo.ICPConfigurationDisplayVoCollection createICPConfigurationDisplayVoCollectionFromICP(java.util.List domainObjectList) 
	{
		return createICPConfigurationDisplayVoCollectionFromICP(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.icps.configuration.domain.objects.ICP objects.
	 */
	public static ims.icp.vo.ICPConfigurationDisplayVoCollection createICPConfigurationDisplayVoCollectionFromICP(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.icp.vo.ICPConfigurationDisplayVoCollection voList = new ims.icp.vo.ICPConfigurationDisplayVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.icps.configuration.domain.objects.ICP domainObject = (ims.icps.configuration.domain.objects.ICP) domainObjectList.get(i);
			ims.icp.vo.ICPConfigurationDisplayVo vo = create(map, domainObject);

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
	 * Create the ims.icps.configuration.domain.objects.ICP set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractICPSet(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.ICPConfigurationDisplayVoCollection voCollection) 
	 {
	 	return extractICPSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractICPSet(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.ICPConfigurationDisplayVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.icp.vo.ICPConfigurationDisplayVo vo = voCollection.get(i);
			ims.icps.configuration.domain.objects.ICP domainObject = ICPConfigurationDisplayVoAssembler.extractICP(domainFactory, vo, domMap);

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
	 * Create the ims.icps.configuration.domain.objects.ICP list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractICPList(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.ICPConfigurationDisplayVoCollection voCollection) 
	 {
	 	return extractICPList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractICPList(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.ICPConfigurationDisplayVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.icp.vo.ICPConfigurationDisplayVo vo = voCollection.get(i);
			ims.icps.configuration.domain.objects.ICP domainObject = ICPConfigurationDisplayVoAssembler.extractICP(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.icps.configuration.domain.objects.ICP object.
	 * @param domainObject ims.icps.configuration.domain.objects.ICP
	 */
	 public static ims.icp.vo.ICPConfigurationDisplayVo create(ims.icps.configuration.domain.objects.ICP domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.icps.configuration.domain.objects.ICP object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.icp.vo.ICPConfigurationDisplayVo create(DomainObjectMap map, ims.icps.configuration.domain.objects.ICP domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.icp.vo.ICPConfigurationDisplayVo valueObject = (ims.icp.vo.ICPConfigurationDisplayVo) map.getValueObject(domainObject, ims.icp.vo.ICPConfigurationDisplayVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.icp.vo.ICPConfigurationDisplayVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.icps.configuration.domain.objects.ICP
	 */
	 public static ims.icp.vo.ICPConfigurationDisplayVo insert(ims.icp.vo.ICPConfigurationDisplayVo valueObject, ims.icps.configuration.domain.objects.ICP domainObject) 
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
	 * @param domainObject ims.icps.configuration.domain.objects.ICP
	 */
	 public static ims.icp.vo.ICPConfigurationDisplayVo insert(DomainObjectMap map, ims.icp.vo.ICPConfigurationDisplayVo valueObject, ims.icps.configuration.domain.objects.ICP domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ICP(domainObject.getId());
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
			
		// Stages
		valueObject.setStages(ims.icp.vo.domain.ICPStageDisplayVoAssembler.createICPStageDisplayVoCollectionFromICPStage(map, domainObject.getStages()) );
		// Name
		valueObject.setName(domainObject.getName());
		// Description
		valueObject.setDescription(domainObject.getDescription());
		// Status
		ims.domain.lookups.LookupInstance instance4 = domainObject.getStatus();
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

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup4 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setStatus(voLookup4);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.icps.configuration.domain.objects.ICP extractICP(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.ICPConfigurationDisplayVo valueObject) 
	{
		return 	extractICP(domainFactory, valueObject, new HashMap());
	}

	public static ims.icps.configuration.domain.objects.ICP extractICP(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.ICPConfigurationDisplayVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ICP();
		ims.icps.configuration.domain.objects.ICP domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.icps.configuration.domain.objects.ICP)domMap.get(valueObject);
			}
			// ims.icp.vo.ICPConfigurationDisplayVo ID_ICP field is unknown
			domainObject = new ims.icps.configuration.domain.objects.ICP();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ICP());
			if (domMap.get(key) != null)
			{
				return (ims.icps.configuration.domain.objects.ICP)domMap.get(key);
			}
			domainObject = (ims.icps.configuration.domain.objects.ICP) domainFactory.getDomainObject(ims.icps.configuration.domain.objects.ICP.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ICP());


		// SaveAsRefVO treated as RefValueObject
		ims.icps.configuration.vo.ICPStageRefVoCollection refCollection1 = new ims.icps.configuration.vo.ICPStageRefVoCollection();
		if (valueObject.getStages() != null)
		{
			for (int i1=0; i1<valueObject.getStages().size(); i1++)
			{
				ims.icps.configuration.vo.ICPStageRefVo ref1 = (ims.icps.configuration.vo.ICPStageRefVo)valueObject.getStages().get(i1);
				refCollection1.add(ref1);
			}
		}
		int size1 = (null == refCollection1) ? 0 : refCollection1.size();		
		java.util.List domainStages1 = domainObject.getStages();
		if (domainStages1 == null)
		{
			domainStages1 = new java.util.ArrayList();
		}
		for(int i=0; i < size1; i++) 
		{
			ims.icps.configuration.vo.ICPStageRefVo vo = refCollection1.get(i);			
			ims.icps.configuration.domain.objects.ICPStage dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.icps.configuration.domain.objects.ICPStage)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.icps.configuration.domain.objects.ICPStage)domainFactory.getDomainObject( ims.icps.configuration.domain.objects.ICPStage.class, vo.getBoId());
				}
			}

			int domIdx = domainStages1.indexOf(dom);
			if (domIdx == -1)
			{
				domainStages1.add(i, dom);
			}
			else if (i != domIdx && i < domainStages1.size())
			{
				Object tmp = domainStages1.get(i);
				domainStages1.set(i, domainStages1.get(domIdx));
				domainStages1.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1 = domainStages1.size();
		while (i1 > size1)
		{
			domainStages1.remove(i1-1);
			i1 = domainStages1.size();
		}
		
		domainObject.setStages(domainStages1);		
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
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value4);

		return domainObject;
	}

}
