/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 16/04/2014, 12:32
 *
 */
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class PathwayClockForReferralERODVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.PathwayClockForReferralERODVo copy(ims.RefMan.vo.PathwayClockForReferralERODVo valueObjectDest, ims.RefMan.vo.PathwayClockForReferralERODVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PathwayClock(valueObjectSrc.getID_PathwayClock());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// PauseDetails
		valueObjectDest.setPauseDetails(valueObjectSrc.getPauseDetails());
		// CurrentPause
		valueObjectDest.setCurrentPause(valueObjectSrc.getCurrentPause());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPathwayClockForReferralERODVoCollectionFromPathwayClock(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.pathways.domain.objects.PathwayClock objects.
	 */
	public static ims.RefMan.vo.PathwayClockForReferralERODVoCollection createPathwayClockForReferralERODVoCollectionFromPathwayClock(java.util.Set domainObjectSet)	
	{
		return createPathwayClockForReferralERODVoCollectionFromPathwayClock(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.pathways.domain.objects.PathwayClock objects.
	 */
	public static ims.RefMan.vo.PathwayClockForReferralERODVoCollection createPathwayClockForReferralERODVoCollectionFromPathwayClock(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.PathwayClockForReferralERODVoCollection voList = new ims.RefMan.vo.PathwayClockForReferralERODVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.pathways.domain.objects.PathwayClock domainObject = (ims.pathways.domain.objects.PathwayClock) iterator.next();
			ims.RefMan.vo.PathwayClockForReferralERODVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.pathways.domain.objects.PathwayClock objects.
	 */
	public static ims.RefMan.vo.PathwayClockForReferralERODVoCollection createPathwayClockForReferralERODVoCollectionFromPathwayClock(java.util.List domainObjectList) 
	{
		return createPathwayClockForReferralERODVoCollectionFromPathwayClock(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.pathways.domain.objects.PathwayClock objects.
	 */
	public static ims.RefMan.vo.PathwayClockForReferralERODVoCollection createPathwayClockForReferralERODVoCollectionFromPathwayClock(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.PathwayClockForReferralERODVoCollection voList = new ims.RefMan.vo.PathwayClockForReferralERODVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.pathways.domain.objects.PathwayClock domainObject = (ims.pathways.domain.objects.PathwayClock) domainObjectList.get(i);
			ims.RefMan.vo.PathwayClockForReferralERODVo vo = create(map, domainObject);

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
	 * Create the ims.pathways.domain.objects.PathwayClock set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPathwayClockSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PathwayClockForReferralERODVoCollection voCollection) 
	 {
	 	return extractPathwayClockSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPathwayClockSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PathwayClockForReferralERODVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PathwayClockForReferralERODVo vo = voCollection.get(i);
			ims.pathways.domain.objects.PathwayClock domainObject = PathwayClockForReferralERODVoAssembler.extractPathwayClock(domainFactory, vo, domMap);

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
	 * Create the ims.pathways.domain.objects.PathwayClock list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPathwayClockList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PathwayClockForReferralERODVoCollection voCollection) 
	 {
	 	return extractPathwayClockList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPathwayClockList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PathwayClockForReferralERODVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PathwayClockForReferralERODVo vo = voCollection.get(i);
			ims.pathways.domain.objects.PathwayClock domainObject = PathwayClockForReferralERODVoAssembler.extractPathwayClock(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.pathways.domain.objects.PathwayClock object.
	 * @param domainObject ims.pathways.domain.objects.PathwayClock
	 */
	 public static ims.RefMan.vo.PathwayClockForReferralERODVo create(ims.pathways.domain.objects.PathwayClock domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.pathways.domain.objects.PathwayClock object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.PathwayClockForReferralERODVo create(DomainObjectMap map, ims.pathways.domain.objects.PathwayClock domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.PathwayClockForReferralERODVo valueObject = (ims.RefMan.vo.PathwayClockForReferralERODVo) map.getValueObject(domainObject, ims.RefMan.vo.PathwayClockForReferralERODVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.PathwayClockForReferralERODVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.pathways.domain.objects.PathwayClock
	 */
	 public static ims.RefMan.vo.PathwayClockForReferralERODVo insert(ims.RefMan.vo.PathwayClockForReferralERODVo valueObject, ims.pathways.domain.objects.PathwayClock domainObject) 
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
	 * @param domainObject ims.pathways.domain.objects.PathwayClock
	 */
	 public static ims.RefMan.vo.PathwayClockForReferralERODVo insert(DomainObjectMap map, ims.RefMan.vo.PathwayClockForReferralERODVo valueObject, ims.pathways.domain.objects.PathwayClock domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PathwayClock(domainObject.getId());
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
			
		// PauseDetails
		ims.pathways.vo.PauseDetailsRefVoCollection PauseDetails = new ims.pathways.vo.PauseDetailsRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getPauseDetails().iterator(); iterator.hasNext(); ) 
		{
			ims.pathways.domain.objects.PauseDetails tmp = (ims.pathways.domain.objects.PauseDetails)iterator.next();
			if (tmp != null)
				PauseDetails.add(new ims.pathways.vo.PauseDetailsRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setPauseDetails(PauseDetails);
		// CurrentPause
		if (domainObject.getCurrentPause() != null)
		{
			if(domainObject.getCurrentPause() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCurrentPause();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCurrentPause(new ims.pathways.vo.PauseDetailsRefVo(id, -1));				
			}
			else
			{
				valueObject.setCurrentPause(new ims.pathways.vo.PauseDetailsRefVo(domainObject.getCurrentPause().getId(), domainObject.getCurrentPause().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.pathways.domain.objects.PathwayClock extractPathwayClock(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PathwayClockForReferralERODVo valueObject) 
	{
		return 	extractPathwayClock(domainFactory, valueObject, new HashMap());
	}

	public static ims.pathways.domain.objects.PathwayClock extractPathwayClock(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PathwayClockForReferralERODVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PathwayClock();
		ims.pathways.domain.objects.PathwayClock domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.pathways.domain.objects.PathwayClock)domMap.get(valueObject);
			}
			// ims.RefMan.vo.PathwayClockForReferralERODVo ID_PathwayClock field is unknown
			domainObject = new ims.pathways.domain.objects.PathwayClock();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PathwayClock());
			if (domMap.get(key) != null)
			{
				return (ims.pathways.domain.objects.PathwayClock)domMap.get(key);
			}
			domainObject = (ims.pathways.domain.objects.PathwayClock) domainFactory.getDomainObject(ims.pathways.domain.objects.PathwayClock.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PathwayClock());


		ims.pathways.vo.PauseDetailsRefVoCollection refCollection1 = valueObject.getPauseDetails();
		int size1 = (null == refCollection1) ? 0 : refCollection1.size();		
		java.util.List domainPauseDetails1 = domainObject.getPauseDetails();
		if (domainPauseDetails1 == null)
		{
			domainPauseDetails1 = new java.util.ArrayList();
		}
		for(int i=0; i < size1; i++) 
		{
			ims.pathways.vo.PauseDetailsRefVo vo = refCollection1.get(i);			
			ims.pathways.domain.objects.PauseDetails dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.pathways.domain.objects.PauseDetails)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.pathways.domain.objects.PauseDetails)domainFactory.getDomainObject( ims.pathways.domain.objects.PauseDetails.class, vo.getBoId());
				}
			}

			int domIdx = domainPauseDetails1.indexOf(dom);
			if (domIdx == -1)
			{
				domainPauseDetails1.add(i, dom);
			}
			else if (i != domIdx && i < domainPauseDetails1.size())
			{
				Object tmp = domainPauseDetails1.get(i);
				domainPauseDetails1.set(i, domainPauseDetails1.get(domIdx));
				domainPauseDetails1.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1 = domainPauseDetails1.size();
		while (i1 > size1)
		{
			domainPauseDetails1.remove(i1-1);
			i1 = domainPauseDetails1.size();
		}
		
		domainObject.setPauseDetails(domainPauseDetails1);		
		ims.pathways.domain.objects.PauseDetails value2 = null;
		if ( null != valueObject.getCurrentPause() ) 
		{
			if (valueObject.getCurrentPause().getBoId() == null)
			{
				if (domMap.get(valueObject.getCurrentPause()) != null)
				{
					value2 = (ims.pathways.domain.objects.PauseDetails)domMap.get(valueObject.getCurrentPause());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getCurrentPause();	
			}
			else
			{
				value2 = (ims.pathways.domain.objects.PauseDetails)domainFactory.getDomainObject(ims.pathways.domain.objects.PauseDetails.class, valueObject.getCurrentPause().getBoId());
			}
		}
		domainObject.setCurrentPause(value2);

		return domainObject;
	}

}
