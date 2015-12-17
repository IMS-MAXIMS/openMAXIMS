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
package ims.ocrr.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class InvestigationLiteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.InvestigationLiteVo copy(ims.ocrr.vo.InvestigationLiteVo valueObjectDest, ims.ocrr.vo.InvestigationLiteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Investigation(valueObjectSrc.getID_Investigation());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// InvestigationIndex
		valueObjectDest.setInvestigationIndex(valueObjectSrc.getInvestigationIndex());
		// ProviderService
		valueObjectDest.setProviderService(valueObjectSrc.getProviderService());
		// PathInvDetails
		valueObjectDest.setPathInvDetails(valueObjectSrc.getPathInvDetails());
		// EventType
		valueObjectDest.setEventType(valueObjectSrc.getEventType());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createInvestigationLiteVoCollectionFromInvestigation(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.configuration.domain.objects.Investigation objects.
	 */
	public static ims.ocrr.vo.InvestigationLiteVoCollection createInvestigationLiteVoCollectionFromInvestigation(java.util.Set domainObjectSet)	
	{
		return createInvestigationLiteVoCollectionFromInvestigation(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.configuration.domain.objects.Investigation objects.
	 */
	public static ims.ocrr.vo.InvestigationLiteVoCollection createInvestigationLiteVoCollectionFromInvestigation(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.InvestigationLiteVoCollection voList = new ims.ocrr.vo.InvestigationLiteVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ocrr.configuration.domain.objects.Investigation domainObject = (ims.ocrr.configuration.domain.objects.Investigation) iterator.next();
			ims.ocrr.vo.InvestigationLiteVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.ocrr.configuration.domain.objects.Investigation objects.
	 */
	public static ims.ocrr.vo.InvestigationLiteVoCollection createInvestigationLiteVoCollectionFromInvestigation(java.util.List domainObjectList) 
	{
		return createInvestigationLiteVoCollectionFromInvestigation(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.configuration.domain.objects.Investigation objects.
	 */
	public static ims.ocrr.vo.InvestigationLiteVoCollection createInvestigationLiteVoCollectionFromInvestigation(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.InvestigationLiteVoCollection voList = new ims.ocrr.vo.InvestigationLiteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.configuration.domain.objects.Investigation domainObject = (ims.ocrr.configuration.domain.objects.Investigation) domainObjectList.get(i);
			ims.ocrr.vo.InvestigationLiteVo vo = create(map, domainObject);

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
	 * Create the ims.ocrr.configuration.domain.objects.Investigation set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractInvestigationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.InvestigationLiteVoCollection voCollection) 
	 {
	 	return extractInvestigationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractInvestigationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.InvestigationLiteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.InvestigationLiteVo vo = voCollection.get(i);
			ims.ocrr.configuration.domain.objects.Investigation domainObject = InvestigationLiteVoAssembler.extractInvestigation(domainFactory, vo, domMap);

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
	 * Create the ims.ocrr.configuration.domain.objects.Investigation list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractInvestigationList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.InvestigationLiteVoCollection voCollection) 
	 {
	 	return extractInvestigationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractInvestigationList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.InvestigationLiteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.InvestigationLiteVo vo = voCollection.get(i);
			ims.ocrr.configuration.domain.objects.Investigation domainObject = InvestigationLiteVoAssembler.extractInvestigation(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.ocrr.configuration.domain.objects.Investigation object.
	 * @param domainObject ims.ocrr.configuration.domain.objects.Investigation
	 */
	 public static ims.ocrr.vo.InvestigationLiteVo create(ims.ocrr.configuration.domain.objects.Investigation domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ocrr.configuration.domain.objects.Investigation object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ocrr.vo.InvestigationLiteVo create(DomainObjectMap map, ims.ocrr.configuration.domain.objects.Investigation domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.InvestigationLiteVo valueObject = (ims.ocrr.vo.InvestigationLiteVo) map.getValueObject(domainObject, ims.ocrr.vo.InvestigationLiteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.InvestigationLiteVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ocrr.configuration.domain.objects.Investigation
	 */
	 public static ims.ocrr.vo.InvestigationLiteVo insert(ims.ocrr.vo.InvestigationLiteVo valueObject, ims.ocrr.configuration.domain.objects.Investigation domainObject) 
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
	 * @param domainObject ims.ocrr.configuration.domain.objects.Investigation
	 */
	 public static ims.ocrr.vo.InvestigationLiteVo insert(DomainObjectMap map, ims.ocrr.vo.InvestigationLiteVo valueObject, ims.ocrr.configuration.domain.objects.Investigation domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Investigation(domainObject.getId());
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
			
		// InvestigationIndex
		valueObject.setInvestigationIndex(ims.ocrr.vo.domain.InvestigationIndexLiteVoAssembler.create(map, domainObject.getInvestigationIndex()) );
		// ProviderService
		valueObject.setProviderService(ims.ocrr.vo.domain.ProviderServiceOcsVoAssembler.create(map, domainObject.getProviderService()) );
		// PathInvDetails
		valueObject.setPathInvDetails(ims.ocrr.vo.domain.PathInvDetailsForNewResultInvestigationVoAssembler.create(map, domainObject.getPathInvDetails()) );
		// EventType
		ims.domain.lookups.LookupInstance instance4 = domainObject.getEventType();
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

			ims.ocrr.vo.lookups.InvEventType voLookup4 = new ims.ocrr.vo.lookups.InvEventType(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.ocrr.vo.lookups.InvEventType parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.ocrr.vo.lookups.InvEventType(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setEventType(voLookup4);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.configuration.domain.objects.Investigation extractInvestigation(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.InvestigationLiteVo valueObject) 
	{
		return 	extractInvestigation(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.configuration.domain.objects.Investigation extractInvestigation(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.InvestigationLiteVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Investigation();
		ims.ocrr.configuration.domain.objects.Investigation domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ocrr.configuration.domain.objects.Investigation)domMap.get(valueObject);
			}
			// ims.ocrr.vo.InvestigationLiteVo ID_Investigation field is unknown
			domainObject = new ims.ocrr.configuration.domain.objects.Investigation();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Investigation());
			if (domMap.get(key) != null)
			{
				return (ims.ocrr.configuration.domain.objects.Investigation)domMap.get(key);
			}
			domainObject = (ims.ocrr.configuration.domain.objects.Investigation) domainFactory.getDomainObject(ims.ocrr.configuration.domain.objects.Investigation.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Investigation());

		domainObject.setInvestigationIndex(ims.ocrr.vo.domain.InvestigationIndexLiteVoAssembler.extractInvestigationIndex(domainFactory, valueObject.getInvestigationIndex(), domMap));
		domainObject.setProviderService(ims.ocrr.vo.domain.ProviderServiceOcsVoAssembler.extractLocSvcProviderSys(domainFactory, valueObject.getProviderService(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.ocrr.configuration.domain.objects.PathInvDetails value3 = null;
		if ( null != valueObject.getPathInvDetails() ) 
		{
			if (valueObject.getPathInvDetails().getBoId() == null)
			{
				if (domMap.get(valueObject.getPathInvDetails()) != null)
				{
					value3 = (ims.ocrr.configuration.domain.objects.PathInvDetails)domMap.get(valueObject.getPathInvDetails());
				}
			}
			else
			{
				value3 = (ims.ocrr.configuration.domain.objects.PathInvDetails)domainFactory.getDomainObject(ims.ocrr.configuration.domain.objects.PathInvDetails.class, valueObject.getPathInvDetails().getBoId());
			}
		}
		domainObject.setPathInvDetails(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getEventType() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getEventType().getID());
		}
		domainObject.setEventType(value4);

		return domainObject;
	}

}
