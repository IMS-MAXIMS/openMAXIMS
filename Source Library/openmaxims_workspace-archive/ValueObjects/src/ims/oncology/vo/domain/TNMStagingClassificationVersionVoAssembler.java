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
package ims.oncology.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Andrei Stefan Bondar
 */
public class TNMStagingClassificationVersionVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.oncology.vo.TNMStagingClassificationVersionVo copy(ims.oncology.vo.TNMStagingClassificationVersionVo valueObjectDest, ims.oncology.vo.TNMStagingClassificationVersionVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_TNMStagingClassificationVersion(valueObjectSrc.getID_TNMStagingClassificationVersion());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// VersionNumber
		valueObjectDest.setVersionNumber(valueObjectSrc.getVersionNumber());
		// VersionDescription
		valueObjectDest.setVersionDescription(valueObjectSrc.getVersionDescription());
		// ActiveFrom
		valueObjectDest.setActiveFrom(valueObjectSrc.getActiveFrom());
		// ActiveTo
		valueObjectDest.setActiveTo(valueObjectSrc.getActiveTo());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTNMStagingClassificationVersionVoCollectionFromTNMStagingClassificationVersion(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion objects.
	 */
	public static ims.oncology.vo.TNMStagingClassificationVersionVoCollection createTNMStagingClassificationVersionVoCollectionFromTNMStagingClassificationVersion(java.util.Set domainObjectSet)	
	{
		return createTNMStagingClassificationVersionVoCollectionFromTNMStagingClassificationVersion(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion objects.
	 */
	public static ims.oncology.vo.TNMStagingClassificationVersionVoCollection createTNMStagingClassificationVersionVoCollectionFromTNMStagingClassificationVersion(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.oncology.vo.TNMStagingClassificationVersionVoCollection voList = new ims.oncology.vo.TNMStagingClassificationVersionVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion domainObject = (ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion) iterator.next();
			ims.oncology.vo.TNMStagingClassificationVersionVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion objects.
	 */
	public static ims.oncology.vo.TNMStagingClassificationVersionVoCollection createTNMStagingClassificationVersionVoCollectionFromTNMStagingClassificationVersion(java.util.List domainObjectList) 
	{
		return createTNMStagingClassificationVersionVoCollectionFromTNMStagingClassificationVersion(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion objects.
	 */
	public static ims.oncology.vo.TNMStagingClassificationVersionVoCollection createTNMStagingClassificationVersionVoCollectionFromTNMStagingClassificationVersion(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.oncology.vo.TNMStagingClassificationVersionVoCollection voList = new ims.oncology.vo.TNMStagingClassificationVersionVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion domainObject = (ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion) domainObjectList.get(i);
			ims.oncology.vo.TNMStagingClassificationVersionVo vo = create(map, domainObject);

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
	 * Create the ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTNMStagingClassificationVersionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.TNMStagingClassificationVersionVoCollection voCollection) 
	 {
	 	return extractTNMStagingClassificationVersionSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTNMStagingClassificationVersionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.TNMStagingClassificationVersionVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.TNMStagingClassificationVersionVo vo = voCollection.get(i);
			ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion domainObject = TNMStagingClassificationVersionVoAssembler.extractTNMStagingClassificationVersion(domainFactory, vo, domMap);

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
	 * Create the ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTNMStagingClassificationVersionList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.TNMStagingClassificationVersionVoCollection voCollection) 
	 {
	 	return extractTNMStagingClassificationVersionList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTNMStagingClassificationVersionList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.TNMStagingClassificationVersionVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.TNMStagingClassificationVersionVo vo = voCollection.get(i);
			ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion domainObject = TNMStagingClassificationVersionVoAssembler.extractTNMStagingClassificationVersion(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion object.
	 * @param domainObject ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion
	 */
	 public static ims.oncology.vo.TNMStagingClassificationVersionVo create(ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.oncology.vo.TNMStagingClassificationVersionVo create(DomainObjectMap map, ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.oncology.vo.TNMStagingClassificationVersionVo valueObject = (ims.oncology.vo.TNMStagingClassificationVersionVo) map.getValueObject(domainObject, ims.oncology.vo.TNMStagingClassificationVersionVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.oncology.vo.TNMStagingClassificationVersionVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion
	 */
	 public static ims.oncology.vo.TNMStagingClassificationVersionVo insert(ims.oncology.vo.TNMStagingClassificationVersionVo valueObject, ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion domainObject) 
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
	 * @param domainObject ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion
	 */
	 public static ims.oncology.vo.TNMStagingClassificationVersionVo insert(DomainObjectMap map, ims.oncology.vo.TNMStagingClassificationVersionVo valueObject, ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_TNMStagingClassificationVersion(domainObject.getId());
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
			
		// VersionNumber
		valueObject.setVersionNumber(domainObject.getVersionNumber());
		// VersionDescription
		valueObject.setVersionDescription(domainObject.getVersionDescription());
		// ActiveFrom
		java.util.Date ActiveFrom = domainObject.getActiveFrom();
		if ( null != ActiveFrom ) 
		{
			valueObject.setActiveFrom(new ims.framework.utils.Date(ActiveFrom) );
		}
		// ActiveTo
		java.util.Date ActiveTo = domainObject.getActiveTo();
		if ( null != ActiveTo ) 
		{
			valueObject.setActiveTo(new ims.framework.utils.Date(ActiveTo) );
		}
		// Status
		ims.domain.lookups.LookupInstance instance5 = domainObject.getStatus();
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

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup5 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setStatus(voLookup5);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion extractTNMStagingClassificationVersion(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.TNMStagingClassificationVersionVo valueObject) 
	{
		return 	extractTNMStagingClassificationVersion(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion extractTNMStagingClassificationVersion(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.TNMStagingClassificationVersionVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_TNMStagingClassificationVersion();
		ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion)domMap.get(valueObject);
			}
			// ims.oncology.vo.TNMStagingClassificationVersionVo ID_TNMStagingClassificationVersion field is unknown
			domainObject = new ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_TNMStagingClassificationVersion());
			if (domMap.get(key) != null)
			{
				return (ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion)domMap.get(key);
			}
			domainObject = (ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion) domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_TNMStagingClassificationVersion());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getVersionNumber() != null && valueObject.getVersionNumber().equals(""))
		{
			valueObject.setVersionNumber(null);
		}
		domainObject.setVersionNumber(valueObject.getVersionNumber());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getVersionDescription() != null && valueObject.getVersionDescription().equals(""))
		{
			valueObject.setVersionDescription(null);
		}
		domainObject.setVersionDescription(valueObject.getVersionDescription());
		java.util.Date value3 = null;
		ims.framework.utils.Date date3 = valueObject.getActiveFrom();		
		if ( date3 != null ) 
		{
			value3 = date3.getDate();
		}
		domainObject.setActiveFrom(value3);
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getActiveTo();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setActiveTo(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value5);

		return domainObject;
	}

}
