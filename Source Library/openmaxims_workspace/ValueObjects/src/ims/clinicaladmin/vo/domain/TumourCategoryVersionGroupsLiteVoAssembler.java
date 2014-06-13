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
package ims.clinicaladmin.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author George Cristian Josan
 */
public class TumourCategoryVersionGroupsLiteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinicaladmin.vo.TumourCategoryVersionGroupsLiteVo copy(ims.clinicaladmin.vo.TumourCategoryVersionGroupsLiteVo valueObjectDest, ims.clinicaladmin.vo.TumourCategoryVersionGroupsLiteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_TumourCategoryVersionGroups(valueObjectSrc.getID_TumourCategoryVersionGroups());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TNMVersion
		valueObjectDest.setTNMVersion(valueObjectSrc.getTNMVersion());
		// Groups
		valueObjectDest.setGroups(valueObjectSrc.getGroups());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTumourCategoryVersionGroupsLiteVoCollectionFromTumourCategoryVersionGroups(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.configuration.domain.objects.TumourCategoryVersionGroups objects.
	 */
	public static ims.clinicaladmin.vo.TumourCategoryVersionGroupsLiteVoCollection createTumourCategoryVersionGroupsLiteVoCollectionFromTumourCategoryVersionGroups(java.util.Set domainObjectSet)	
	{
		return createTumourCategoryVersionGroupsLiteVoCollectionFromTumourCategoryVersionGroups(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.configuration.domain.objects.TumourCategoryVersionGroups objects.
	 */
	public static ims.clinicaladmin.vo.TumourCategoryVersionGroupsLiteVoCollection createTumourCategoryVersionGroupsLiteVoCollectionFromTumourCategoryVersionGroups(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinicaladmin.vo.TumourCategoryVersionGroupsLiteVoCollection voList = new ims.clinicaladmin.vo.TumourCategoryVersionGroupsLiteVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.oncology.configuration.domain.objects.TumourCategoryVersionGroups domainObject = (ims.oncology.configuration.domain.objects.TumourCategoryVersionGroups) iterator.next();
			ims.clinicaladmin.vo.TumourCategoryVersionGroupsLiteVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.oncology.configuration.domain.objects.TumourCategoryVersionGroups objects.
	 */
	public static ims.clinicaladmin.vo.TumourCategoryVersionGroupsLiteVoCollection createTumourCategoryVersionGroupsLiteVoCollectionFromTumourCategoryVersionGroups(java.util.List domainObjectList) 
	{
		return createTumourCategoryVersionGroupsLiteVoCollectionFromTumourCategoryVersionGroups(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.configuration.domain.objects.TumourCategoryVersionGroups objects.
	 */
	public static ims.clinicaladmin.vo.TumourCategoryVersionGroupsLiteVoCollection createTumourCategoryVersionGroupsLiteVoCollectionFromTumourCategoryVersionGroups(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinicaladmin.vo.TumourCategoryVersionGroupsLiteVoCollection voList = new ims.clinicaladmin.vo.TumourCategoryVersionGroupsLiteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.configuration.domain.objects.TumourCategoryVersionGroups domainObject = (ims.oncology.configuration.domain.objects.TumourCategoryVersionGroups) domainObjectList.get(i);
			ims.clinicaladmin.vo.TumourCategoryVersionGroupsLiteVo vo = create(map, domainObject);

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
	 * Create the ims.oncology.configuration.domain.objects.TumourCategoryVersionGroups set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTumourCategoryVersionGroupsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.TumourCategoryVersionGroupsLiteVoCollection voCollection) 
	 {
	 	return extractTumourCategoryVersionGroupsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTumourCategoryVersionGroupsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.TumourCategoryVersionGroupsLiteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinicaladmin.vo.TumourCategoryVersionGroupsLiteVo vo = voCollection.get(i);
			ims.oncology.configuration.domain.objects.TumourCategoryVersionGroups domainObject = TumourCategoryVersionGroupsLiteVoAssembler.extractTumourCategoryVersionGroups(domainFactory, vo, domMap);

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
	 * Create the ims.oncology.configuration.domain.objects.TumourCategoryVersionGroups list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTumourCategoryVersionGroupsList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.TumourCategoryVersionGroupsLiteVoCollection voCollection) 
	 {
	 	return extractTumourCategoryVersionGroupsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTumourCategoryVersionGroupsList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.TumourCategoryVersionGroupsLiteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinicaladmin.vo.TumourCategoryVersionGroupsLiteVo vo = voCollection.get(i);
			ims.oncology.configuration.domain.objects.TumourCategoryVersionGroups domainObject = TumourCategoryVersionGroupsLiteVoAssembler.extractTumourCategoryVersionGroups(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.oncology.configuration.domain.objects.TumourCategoryVersionGroups object.
	 * @param domainObject ims.oncology.configuration.domain.objects.TumourCategoryVersionGroups
	 */
	 public static ims.clinicaladmin.vo.TumourCategoryVersionGroupsLiteVo create(ims.oncology.configuration.domain.objects.TumourCategoryVersionGroups domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.oncology.configuration.domain.objects.TumourCategoryVersionGroups object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinicaladmin.vo.TumourCategoryVersionGroupsLiteVo create(DomainObjectMap map, ims.oncology.configuration.domain.objects.TumourCategoryVersionGroups domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinicaladmin.vo.TumourCategoryVersionGroupsLiteVo valueObject = (ims.clinicaladmin.vo.TumourCategoryVersionGroupsLiteVo) map.getValueObject(domainObject, ims.clinicaladmin.vo.TumourCategoryVersionGroupsLiteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinicaladmin.vo.TumourCategoryVersionGroupsLiteVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.oncology.configuration.domain.objects.TumourCategoryVersionGroups
	 */
	 public static ims.clinicaladmin.vo.TumourCategoryVersionGroupsLiteVo insert(ims.clinicaladmin.vo.TumourCategoryVersionGroupsLiteVo valueObject, ims.oncology.configuration.domain.objects.TumourCategoryVersionGroups domainObject) 
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
	 * @param domainObject ims.oncology.configuration.domain.objects.TumourCategoryVersionGroups
	 */
	 public static ims.clinicaladmin.vo.TumourCategoryVersionGroupsLiteVo insert(DomainObjectMap map, ims.clinicaladmin.vo.TumourCategoryVersionGroupsLiteVo valueObject, ims.oncology.configuration.domain.objects.TumourCategoryVersionGroups domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_TumourCategoryVersionGroups(domainObject.getId());
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
			
		// TNMVersion
		valueObject.setTNMVersion(ims.clinicaladmin.vo.domain.TNMStagingClassificationVersionLiteVoAssembler.create(map, domainObject.getTNMVersion()) );
		// Groups
		ims.oncology.configuration.vo.TumourGroupRefVoCollection Groups = new ims.oncology.configuration.vo.TumourGroupRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getGroups().iterator(); iterator.hasNext(); ) 
		{
			ims.oncology.configuration.domain.objects.TumourGroup tmp = (ims.oncology.configuration.domain.objects.TumourGroup)iterator.next();
			if (tmp != null)
				Groups.add(new ims.oncology.configuration.vo.TumourGroupRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setGroups(Groups);
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.configuration.domain.objects.TumourCategoryVersionGroups extractTumourCategoryVersionGroups(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.TumourCategoryVersionGroupsLiteVo valueObject) 
	{
		return 	extractTumourCategoryVersionGroups(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.configuration.domain.objects.TumourCategoryVersionGroups extractTumourCategoryVersionGroups(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.TumourCategoryVersionGroupsLiteVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_TumourCategoryVersionGroups();
		ims.oncology.configuration.domain.objects.TumourCategoryVersionGroups domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.oncology.configuration.domain.objects.TumourCategoryVersionGroups)domMap.get(valueObject);
			}
			// ims.clinicaladmin.vo.TumourCategoryVersionGroupsLiteVo ID_TumourCategoryVersionGroups field is unknown
			domainObject = new ims.oncology.configuration.domain.objects.TumourCategoryVersionGroups();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_TumourCategoryVersionGroups());
			if (domMap.get(key) != null)
			{
				return (ims.oncology.configuration.domain.objects.TumourCategoryVersionGroups)domMap.get(key);
			}
			domainObject = (ims.oncology.configuration.domain.objects.TumourCategoryVersionGroups) domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.TumourCategoryVersionGroups.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_TumourCategoryVersionGroups());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion value1 = null;
		if ( null != valueObject.getTNMVersion() ) 
		{
			if (valueObject.getTNMVersion().getBoId() == null)
			{
				if (domMap.get(valueObject.getTNMVersion()) != null)
				{
					value1 = (ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion)domMap.get(valueObject.getTNMVersion());
				}
			}
			else
			{
				value1 = (ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion.class, valueObject.getTNMVersion().getBoId());
			}
		}
		domainObject.setTNMVersion(value1);

		ims.oncology.configuration.vo.TumourGroupRefVoCollection refCollection2 = valueObject.getGroups();
		int size2 = (null == refCollection2) ? 0 : refCollection2.size();		
		java.util.List domainGroups2 = domainObject.getGroups();
		if (domainGroups2 == null)
		{
			domainGroups2 = new java.util.ArrayList();
		}
		for(int i=0; i < size2; i++) 
		{
			ims.oncology.configuration.vo.TumourGroupRefVo vo = refCollection2.get(i);			
			ims.oncology.configuration.domain.objects.TumourGroup dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.oncology.configuration.domain.objects.TumourGroup)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.oncology.configuration.domain.objects.TumourGroup)domainFactory.getDomainObject( ims.oncology.configuration.domain.objects.TumourGroup.class, vo.getBoId());
				}
			}

			int domIdx = domainGroups2.indexOf(dom);
			if (domIdx == -1)
			{
				domainGroups2.add(i, dom);
			}
			else if (i != domIdx && i < domainGroups2.size())
			{
				Object tmp = domainGroups2.get(i);
				domainGroups2.set(i, domainGroups2.get(domIdx));
				domainGroups2.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i2 = domainGroups2.size();
		while (i2 > size2)
		{
			domainGroups2.remove(i2-1);
			i2 = domainGroups2.size();
		}
		
		domainObject.setGroups(domainGroups2);		

		return domainObject;
	}

}
