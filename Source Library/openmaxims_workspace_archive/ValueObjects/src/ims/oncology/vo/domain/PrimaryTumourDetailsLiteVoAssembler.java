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
 * @author George Cristian Josan
 */
public class PrimaryTumourDetailsLiteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.oncology.vo.PrimaryTumourDetailsLiteVo copy(ims.oncology.vo.PrimaryTumourDetailsLiteVo valueObjectDest, ims.oncology.vo.PrimaryTumourDetailsLiteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PrimaryTumourDetails(valueObjectSrc.getID_PrimaryTumourDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// TumourGroup
		valueObjectDest.setTumourGroup(valueObjectSrc.getTumourGroup());
		// TumourSite
		valueObjectDest.setTumourSite(valueObjectSrc.getTumourSite());
		// TumourLaterality
		valueObjectDest.setTumourLaterality(valueObjectSrc.getTumourLaterality());
		// isCurrent
		valueObjectDest.setIsCurrent(valueObjectSrc.getIsCurrent());
		// EndDate
		valueObjectDest.setEndDate(valueObjectSrc.getEndDate());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPrimaryTumourDetailsLiteVoCollectionFromPrimaryTumourDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.PrimaryTumourDetails objects.
	 */
	public static ims.oncology.vo.PrimaryTumourDetailsLiteVoCollection createPrimaryTumourDetailsLiteVoCollectionFromPrimaryTumourDetails(java.util.Set domainObjectSet)	
	{
		return createPrimaryTumourDetailsLiteVoCollectionFromPrimaryTumourDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.PrimaryTumourDetails objects.
	 */
	public static ims.oncology.vo.PrimaryTumourDetailsLiteVoCollection createPrimaryTumourDetailsLiteVoCollectionFromPrimaryTumourDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.oncology.vo.PrimaryTumourDetailsLiteVoCollection voList = new ims.oncology.vo.PrimaryTumourDetailsLiteVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.oncology.domain.objects.PrimaryTumourDetails domainObject = (ims.oncology.domain.objects.PrimaryTumourDetails) iterator.next();
			ims.oncology.vo.PrimaryTumourDetailsLiteVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.oncology.domain.objects.PrimaryTumourDetails objects.
	 */
	public static ims.oncology.vo.PrimaryTumourDetailsLiteVoCollection createPrimaryTumourDetailsLiteVoCollectionFromPrimaryTumourDetails(java.util.List domainObjectList) 
	{
		return createPrimaryTumourDetailsLiteVoCollectionFromPrimaryTumourDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.domain.objects.PrimaryTumourDetails objects.
	 */
	public static ims.oncology.vo.PrimaryTumourDetailsLiteVoCollection createPrimaryTumourDetailsLiteVoCollectionFromPrimaryTumourDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.oncology.vo.PrimaryTumourDetailsLiteVoCollection voList = new ims.oncology.vo.PrimaryTumourDetailsLiteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.domain.objects.PrimaryTumourDetails domainObject = (ims.oncology.domain.objects.PrimaryTumourDetails) domainObjectList.get(i);
			ims.oncology.vo.PrimaryTumourDetailsLiteVo vo = create(map, domainObject);

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
	 * Create the ims.oncology.domain.objects.PrimaryTumourDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPrimaryTumourDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.PrimaryTumourDetailsLiteVoCollection voCollection) 
	 {
	 	return extractPrimaryTumourDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPrimaryTumourDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.PrimaryTumourDetailsLiteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.PrimaryTumourDetailsLiteVo vo = voCollection.get(i);
			ims.oncology.domain.objects.PrimaryTumourDetails domainObject = PrimaryTumourDetailsLiteVoAssembler.extractPrimaryTumourDetails(domainFactory, vo, domMap);

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
	 * Create the ims.oncology.domain.objects.PrimaryTumourDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPrimaryTumourDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.PrimaryTumourDetailsLiteVoCollection voCollection) 
	 {
	 	return extractPrimaryTumourDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPrimaryTumourDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.PrimaryTumourDetailsLiteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.PrimaryTumourDetailsLiteVo vo = voCollection.get(i);
			ims.oncology.domain.objects.PrimaryTumourDetails domainObject = PrimaryTumourDetailsLiteVoAssembler.extractPrimaryTumourDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.oncology.domain.objects.PrimaryTumourDetails object.
	 * @param domainObject ims.oncology.domain.objects.PrimaryTumourDetails
	 */
	 public static ims.oncology.vo.PrimaryTumourDetailsLiteVo create(ims.oncology.domain.objects.PrimaryTumourDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.oncology.domain.objects.PrimaryTumourDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.oncology.vo.PrimaryTumourDetailsLiteVo create(DomainObjectMap map, ims.oncology.domain.objects.PrimaryTumourDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.oncology.vo.PrimaryTumourDetailsLiteVo valueObject = (ims.oncology.vo.PrimaryTumourDetailsLiteVo) map.getValueObject(domainObject, ims.oncology.vo.PrimaryTumourDetailsLiteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.oncology.vo.PrimaryTumourDetailsLiteVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.oncology.domain.objects.PrimaryTumourDetails
	 */
	 public static ims.oncology.vo.PrimaryTumourDetailsLiteVo insert(ims.oncology.vo.PrimaryTumourDetailsLiteVo valueObject, ims.oncology.domain.objects.PrimaryTumourDetails domainObject) 
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
	 * @param domainObject ims.oncology.domain.objects.PrimaryTumourDetails
	 */
	 public static ims.oncology.vo.PrimaryTumourDetailsLiteVo insert(DomainObjectMap map, ims.oncology.vo.PrimaryTumourDetailsLiteVo valueObject, ims.oncology.domain.objects.PrimaryTumourDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PrimaryTumourDetails(domainObject.getId());
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
			
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// TumourGroup
		valueObject.setTumourGroup(ims.clinicaladmin.vo.domain.TumourGroupLiteVoAssembler.create(map, domainObject.getTumourGroup()) );
		// TumourSite
		valueObject.setTumourSite(ims.clinicaladmin.vo.domain.TumourSiteLiteVoAssembler.create(map, domainObject.getTumourSite()) );
		// TumourLaterality
		ims.domain.lookups.LookupInstance instance4 = domainObject.getTumourLaterality();
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

			ims.core.vo.lookups.LateralityLRB voLookup4 = new ims.core.vo.lookups.LateralityLRB(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.LateralityLRB parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.LateralityLRB(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setTumourLaterality(voLookup4);
		}
				// isCurrent
		valueObject.setIsCurrent( domainObject.isIsCurrent() );
		// EndDate
		java.util.Date EndDate = domainObject.getEndDate();
		if ( null != EndDate ) 
		{
			valueObject.setEndDate(new ims.framework.utils.Date(EndDate) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.domain.objects.PrimaryTumourDetails extractPrimaryTumourDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.PrimaryTumourDetailsLiteVo valueObject) 
	{
		return 	extractPrimaryTumourDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.domain.objects.PrimaryTumourDetails extractPrimaryTumourDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.PrimaryTumourDetailsLiteVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PrimaryTumourDetails();
		ims.oncology.domain.objects.PrimaryTumourDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.oncology.domain.objects.PrimaryTumourDetails)domMap.get(valueObject);
			}
			// ims.oncology.vo.PrimaryTumourDetailsLiteVo ID_PrimaryTumourDetails field is unknown
			domainObject = new ims.oncology.domain.objects.PrimaryTumourDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PrimaryTumourDetails());
			if (domMap.get(key) != null)
			{
				return (ims.oncology.domain.objects.PrimaryTumourDetails)domMap.get(key);
			}
			domainObject = (ims.oncology.domain.objects.PrimaryTumourDetails) domainFactory.getDomainObject(ims.oncology.domain.objects.PrimaryTumourDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PrimaryTumourDetails());

		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.TumourGroup value2 = null;
		if ( null != valueObject.getTumourGroup() ) 
		{
			if (valueObject.getTumourGroup().getBoId() == null)
			{
				if (domMap.get(valueObject.getTumourGroup()) != null)
				{
					value2 = (ims.oncology.configuration.domain.objects.TumourGroup)domMap.get(valueObject.getTumourGroup());
				}
			}
			else
			{
				value2 = (ims.oncology.configuration.domain.objects.TumourGroup)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.TumourGroup.class, valueObject.getTumourGroup().getBoId());
			}
		}
		domainObject.setTumourGroup(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.TumourSite value3 = null;
		if ( null != valueObject.getTumourSite() ) 
		{
			if (valueObject.getTumourSite().getBoId() == null)
			{
				if (domMap.get(valueObject.getTumourSite()) != null)
				{
					value3 = (ims.oncology.configuration.domain.objects.TumourSite)domMap.get(valueObject.getTumourSite());
				}
			}
			else
			{
				value3 = (ims.oncology.configuration.domain.objects.TumourSite)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.TumourSite.class, valueObject.getTumourSite().getBoId());
			}
		}
		domainObject.setTumourSite(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getTumourLaterality() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getTumourLaterality().getID());
		}
		domainObject.setTumourLaterality(value4);
		domainObject.setIsCurrent(valueObject.getIsCurrent());
		java.util.Date value6 = null;
		ims.framework.utils.Date date6 = valueObject.getEndDate();		
		if ( date6 != null ) 
		{
			value6 = date6.getDate();
		}
		domainObject.setEndDate(value6);

		return domainObject;
	}

}
