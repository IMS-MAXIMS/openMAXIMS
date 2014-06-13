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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Catalin Tomozei
 */
public class BedSpaceStateVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.BedSpaceStateVo copy(ims.core.vo.BedSpaceStateVo valueObjectDest, ims.core.vo.BedSpaceStateVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_BedSpaceState(valueObjectSrc.getID_BedSpaceState());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CurrentBedStatus
		valueObjectDest.setCurrentBedStatus(valueObjectSrc.getCurrentBedStatus());
		// isMaternity
		valueObjectDest.setIsMaternity(valueObjectSrc.getIsMaternity());
		// NoOfInfants
		valueObjectDest.setNoOfInfants(valueObjectSrc.getNoOfInfants());
		// BedSpace
		valueObjectDest.setBedSpace(valueObjectSrc.getBedSpace());
		// Ward
		valueObjectDest.setWard(valueObjectSrc.getWard());
		// InpatientEpisode
		valueObjectDest.setInpatientEpisode(valueObjectSrc.getInpatientEpisode());
		// PreviousBedStatus
		valueObjectDest.setPreviousBedStatus(valueObjectSrc.getPreviousBedStatus());
		// Comment
		valueObjectDest.setComment(valueObjectSrc.getComment());
		// Bay
		valueObjectDest.setBay(valueObjectSrc.getBay());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createBedSpaceStateVoCollectionFromBedSpaceState(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.BedSpaceState objects.
	 */
	public static ims.core.vo.BedSpaceStateVoCollection createBedSpaceStateVoCollectionFromBedSpaceState(java.util.Set domainObjectSet)	
	{
		return createBedSpaceStateVoCollectionFromBedSpaceState(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.BedSpaceState objects.
	 */
	public static ims.core.vo.BedSpaceStateVoCollection createBedSpaceStateVoCollectionFromBedSpaceState(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.BedSpaceStateVoCollection voList = new ims.core.vo.BedSpaceStateVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.pas.domain.objects.BedSpaceState domainObject = (ims.core.admin.pas.domain.objects.BedSpaceState) iterator.next();
			ims.core.vo.BedSpaceStateVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.BedSpaceState objects.
	 */
	public static ims.core.vo.BedSpaceStateVoCollection createBedSpaceStateVoCollectionFromBedSpaceState(java.util.List domainObjectList) 
	{
		return createBedSpaceStateVoCollectionFromBedSpaceState(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.BedSpaceState objects.
	 */
	public static ims.core.vo.BedSpaceStateVoCollection createBedSpaceStateVoCollectionFromBedSpaceState(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.BedSpaceStateVoCollection voList = new ims.core.vo.BedSpaceStateVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.BedSpaceState domainObject = (ims.core.admin.pas.domain.objects.BedSpaceState) domainObjectList.get(i);
			ims.core.vo.BedSpaceStateVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.pas.domain.objects.BedSpaceState set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractBedSpaceStateSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.BedSpaceStateVoCollection voCollection) 
	 {
	 	return extractBedSpaceStateSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractBedSpaceStateSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.BedSpaceStateVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.BedSpaceStateVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.BedSpaceState domainObject = BedSpaceStateVoAssembler.extractBedSpaceState(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.pas.domain.objects.BedSpaceState list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractBedSpaceStateList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.BedSpaceStateVoCollection voCollection) 
	 {
	 	return extractBedSpaceStateList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractBedSpaceStateList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.BedSpaceStateVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.BedSpaceStateVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.BedSpaceState domainObject = BedSpaceStateVoAssembler.extractBedSpaceState(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.pas.domain.objects.BedSpaceState object.
	 * @param domainObject ims.core.admin.pas.domain.objects.BedSpaceState
	 */
	 public static ims.core.vo.BedSpaceStateVo create(ims.core.admin.pas.domain.objects.BedSpaceState domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.pas.domain.objects.BedSpaceState object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.BedSpaceStateVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.BedSpaceState domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.BedSpaceStateVo valueObject = (ims.core.vo.BedSpaceStateVo) map.getValueObject(domainObject, ims.core.vo.BedSpaceStateVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.BedSpaceStateVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.pas.domain.objects.BedSpaceState
	 */
	 public static ims.core.vo.BedSpaceStateVo insert(ims.core.vo.BedSpaceStateVo valueObject, ims.core.admin.pas.domain.objects.BedSpaceState domainObject) 
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
	 * @param domainObject ims.core.admin.pas.domain.objects.BedSpaceState
	 */
	 public static ims.core.vo.BedSpaceStateVo insert(DomainObjectMap map, ims.core.vo.BedSpaceStateVo valueObject, ims.core.admin.pas.domain.objects.BedSpaceState domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_BedSpaceState(domainObject.getId());
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
			
		// CurrentBedStatus
		valueObject.setCurrentBedStatus(ims.core.vo.domain.BedSpaceStateStatusLiteVoAssembler.create(map, domainObject.getCurrentBedStatus()) );
		// isMaternity
		valueObject.setIsMaternity( domainObject.isIsMaternity() );
		// NoOfInfants
		valueObject.setNoOfInfants(domainObject.getNoOfInfants());
		// BedSpace
		valueObject.setBedSpace(ims.core.vo.domain.BedSpaceVoAssembler.create(map, domainObject.getBedSpace()) );
		// Ward
		valueObject.setWard(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getWard()) );
		// InpatientEpisode
		valueObject.setInpatientEpisode(ims.core.vo.domain.InpatientEpisodeLiteVoAssembler.create(map, domainObject.getInpatientEpisode()) );
		// PreviousBedStatus
		valueObject.setPreviousBedStatus(ims.core.vo.domain.BedSpaceStateStatusLiteVoAssembler.create(map, domainObject.getPreviousBedStatus()) );
		// Comment
		valueObject.setComment(domainObject.getComment());
		// Bay
		valueObject.setBay(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getBay()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.pas.domain.objects.BedSpaceState extractBedSpaceState(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.BedSpaceStateVo valueObject) 
	{
		return 	extractBedSpaceState(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.BedSpaceState extractBedSpaceState(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.BedSpaceStateVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_BedSpaceState();
		ims.core.admin.pas.domain.objects.BedSpaceState domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.pas.domain.objects.BedSpaceState)domMap.get(valueObject);
			}
			// ims.core.vo.BedSpaceStateVo ID_BedSpaceState field is unknown
			domainObject = new ims.core.admin.pas.domain.objects.BedSpaceState();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_BedSpaceState());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.pas.domain.objects.BedSpaceState)domMap.get(key);
			}
			domainObject = (ims.core.admin.pas.domain.objects.BedSpaceState) domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.BedSpaceState.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_BedSpaceState());

		domainObject.setCurrentBedStatus(ims.core.vo.domain.BedSpaceStateStatusLiteVoAssembler.extractBedSpaceStateStatus(domainFactory, valueObject.getCurrentBedStatus(), domMap));
		domainObject.setIsMaternity(valueObject.getIsMaternity());
		domainObject.setNoOfInfants(valueObject.getNoOfInfants());
		domainObject.setBedSpace(ims.core.vo.domain.BedSpaceVoAssembler.extractBedSpace(domainFactory, valueObject.getBedSpace(), domMap));
		domainObject.setWard(ims.core.vo.domain.LocationLiteVoAssembler.extractLocation(domainFactory, valueObject.getWard(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.pas.domain.objects.InpatientEpisode value6 = null;
		if ( null != valueObject.getInpatientEpisode() ) 
		{
			if (valueObject.getInpatientEpisode().getBoId() == null)
			{
				if (domMap.get(valueObject.getInpatientEpisode()) != null)
				{
					value6 = (ims.core.admin.pas.domain.objects.InpatientEpisode)domMap.get(valueObject.getInpatientEpisode());
				}
			}
			else
			{
				value6 = (ims.core.admin.pas.domain.objects.InpatientEpisode)domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.InpatientEpisode.class, valueObject.getInpatientEpisode().getBoId());
			}
		}
		domainObject.setInpatientEpisode(value6);
		domainObject.setPreviousBedStatus(ims.core.vo.domain.BedSpaceStateStatusLiteVoAssembler.extractBedSpaceStateStatus(domainFactory, valueObject.getPreviousBedStatus(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComment() != null && valueObject.getComment().equals(""))
		{
			valueObject.setComment(null);
		}
		domainObject.setComment(valueObject.getComment());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value9 = null;
		if ( null != valueObject.getBay() ) 
		{
			if (valueObject.getBay().getBoId() == null)
			{
				if (domMap.get(valueObject.getBay()) != null)
				{
					value9 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getBay());
				}
			}
			else
			{
				value9 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getBay().getBoId());
			}
		}
		domainObject.setBay(value9);

		return domainObject;
	}

}
