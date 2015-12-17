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
 * Generated on 12/10/2015, 13:23
 *
 */
package ims.pathways.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author George Cristian Josan
 */
public class PathwayRTTClockImpactVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.pathways.vo.PathwayRTTClockImpactVo copy(ims.pathways.vo.PathwayRTTClockImpactVo valueObjectDest, ims.pathways.vo.PathwayRTTClockImpactVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PathwaysRTTClockImpact(valueObjectSrc.getID_PathwaysRTTClockImpact());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// InitialClock
		valueObjectDest.setInitialClock(valueObjectSrc.getInitialClock());
		// FinalClock
		valueObjectDest.setFinalClock(valueObjectSrc.getFinalClock());
		// InitialRTTStatus
		valueObjectDest.setInitialRTTStatus(valueObjectSrc.getInitialRTTStatus());
		// FinalRTTStatus
		valueObjectDest.setFinalRTTStatus(valueObjectSrc.getFinalRTTStatus());
		// ClockStarted
		valueObjectDest.setClockStarted(valueObjectSrc.getClockStarted());
		// ClockStopped
		valueObjectDest.setClockStopped(valueObjectSrc.getClockStopped());
		// Journey
		valueObjectDest.setJourney(valueObjectSrc.getJourney());
		// Source
		valueObjectDest.setSource(valueObjectSrc.getSource());
		// OutcomeEvent
		valueObjectDest.setOutcomeEvent(valueObjectSrc.getOutcomeEvent());
		// InitialClockState
		valueObjectDest.setInitialClockState(valueObjectSrc.getInitialClockState());
		// FinalClockState
		valueObjectDest.setFinalClockState(valueObjectSrc.getFinalClockState());
		// OutcomeDescription
		valueObjectDest.setOutcomeDescription(valueObjectSrc.getOutcomeDescription());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPathwayRTTClockImpactVoCollectionFromPathwaysRTTClockImpact(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.pathways.domain.objects.PathwaysRTTClockImpact objects.
	 */
	public static ims.pathways.vo.PathwayRTTClockImpactVoCollection createPathwayRTTClockImpactVoCollectionFromPathwaysRTTClockImpact(java.util.Set domainObjectSet)	
	{
		return createPathwayRTTClockImpactVoCollectionFromPathwaysRTTClockImpact(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.pathways.domain.objects.PathwaysRTTClockImpact objects.
	 */
	public static ims.pathways.vo.PathwayRTTClockImpactVoCollection createPathwayRTTClockImpactVoCollectionFromPathwaysRTTClockImpact(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.pathways.vo.PathwayRTTClockImpactVoCollection voList = new ims.pathways.vo.PathwayRTTClockImpactVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.pathways.domain.objects.PathwaysRTTClockImpact domainObject = (ims.pathways.domain.objects.PathwaysRTTClockImpact) iterator.next();
			ims.pathways.vo.PathwayRTTClockImpactVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.pathways.domain.objects.PathwaysRTTClockImpact objects.
	 */
	public static ims.pathways.vo.PathwayRTTClockImpactVoCollection createPathwayRTTClockImpactVoCollectionFromPathwaysRTTClockImpact(java.util.List domainObjectList) 
	{
		return createPathwayRTTClockImpactVoCollectionFromPathwaysRTTClockImpact(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.pathways.domain.objects.PathwaysRTTClockImpact objects.
	 */
	public static ims.pathways.vo.PathwayRTTClockImpactVoCollection createPathwayRTTClockImpactVoCollectionFromPathwaysRTTClockImpact(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.pathways.vo.PathwayRTTClockImpactVoCollection voList = new ims.pathways.vo.PathwayRTTClockImpactVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.pathways.domain.objects.PathwaysRTTClockImpact domainObject = (ims.pathways.domain.objects.PathwaysRTTClockImpact) domainObjectList.get(i);
			ims.pathways.vo.PathwayRTTClockImpactVo vo = create(map, domainObject);

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
	 * Create the ims.pathways.domain.objects.PathwaysRTTClockImpact set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPathwaysRTTClockImpactSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PathwayRTTClockImpactVoCollection voCollection) 
	 {
	 	return extractPathwaysRTTClockImpactSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPathwaysRTTClockImpactSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PathwayRTTClockImpactVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.pathways.vo.PathwayRTTClockImpactVo vo = voCollection.get(i);
			ims.pathways.domain.objects.PathwaysRTTClockImpact domainObject = PathwayRTTClockImpactVoAssembler.extractPathwaysRTTClockImpact(domainFactory, vo, domMap);

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
	 * Create the ims.pathways.domain.objects.PathwaysRTTClockImpact list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPathwaysRTTClockImpactList(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PathwayRTTClockImpactVoCollection voCollection) 
	 {
	 	return extractPathwaysRTTClockImpactList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPathwaysRTTClockImpactList(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PathwayRTTClockImpactVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.pathways.vo.PathwayRTTClockImpactVo vo = voCollection.get(i);
			ims.pathways.domain.objects.PathwaysRTTClockImpact domainObject = PathwayRTTClockImpactVoAssembler.extractPathwaysRTTClockImpact(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.pathways.domain.objects.PathwaysRTTClockImpact object.
	 * @param domainObject ims.pathways.domain.objects.PathwaysRTTClockImpact
	 */
	 public static ims.pathways.vo.PathwayRTTClockImpactVo create(ims.pathways.domain.objects.PathwaysRTTClockImpact domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.pathways.domain.objects.PathwaysRTTClockImpact object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.pathways.vo.PathwayRTTClockImpactVo create(DomainObjectMap map, ims.pathways.domain.objects.PathwaysRTTClockImpact domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.pathways.vo.PathwayRTTClockImpactVo valueObject = (ims.pathways.vo.PathwayRTTClockImpactVo) map.getValueObject(domainObject, ims.pathways.vo.PathwayRTTClockImpactVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.pathways.vo.PathwayRTTClockImpactVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.pathways.domain.objects.PathwaysRTTClockImpact
	 */
	 public static ims.pathways.vo.PathwayRTTClockImpactVo insert(ims.pathways.vo.PathwayRTTClockImpactVo valueObject, ims.pathways.domain.objects.PathwaysRTTClockImpact domainObject) 
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
	 * @param domainObject ims.pathways.domain.objects.PathwaysRTTClockImpact
	 */
	 public static ims.pathways.vo.PathwayRTTClockImpactVo insert(DomainObjectMap map, ims.pathways.vo.PathwayRTTClockImpactVo valueObject, ims.pathways.domain.objects.PathwaysRTTClockImpact domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PathwaysRTTClockImpact(domainObject.getId());
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
			
		// InitialClock
		if (domainObject.getInitialClock() != null)
		{
			if(domainObject.getInitialClock() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getInitialClock();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setInitialClock(new ims.pathways.vo.PathwayClockRefVo(id, -1));				
			}
			else
			{
				valueObject.setInitialClock(new ims.pathways.vo.PathwayClockRefVo(domainObject.getInitialClock().getId(), domainObject.getInitialClock().getVersion()));
			}
		}
		// FinalClock
		if (domainObject.getFinalClock() != null)
		{
			if(domainObject.getFinalClock() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getFinalClock();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setFinalClock(new ims.pathways.vo.PathwayClockRefVo(id, -1));				
			}
			else
			{
				valueObject.setFinalClock(new ims.pathways.vo.PathwayClockRefVo(domainObject.getFinalClock().getId(), domainObject.getFinalClock().getVersion()));
			}
		}
		// InitialRTTStatus
		if (domainObject.getInitialRTTStatus() != null)
		{
			if(domainObject.getInitialRTTStatus() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getInitialRTTStatus();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setInitialRTTStatus(new ims.pathways.vo.PathwayRTTStatusRefVo(id, -1));				
			}
			else
			{
				valueObject.setInitialRTTStatus(new ims.pathways.vo.PathwayRTTStatusRefVo(domainObject.getInitialRTTStatus().getId(), domainObject.getInitialRTTStatus().getVersion()));
			}
		}
		// FinalRTTStatus
		if (domainObject.getFinalRTTStatus() != null)
		{
			if(domainObject.getFinalRTTStatus() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getFinalRTTStatus();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setFinalRTTStatus(new ims.pathways.vo.PathwayRTTStatusRefVo(id, -1));				
			}
			else
			{
				valueObject.setFinalRTTStatus(new ims.pathways.vo.PathwayRTTStatusRefVo(domainObject.getFinalRTTStatus().getId(), domainObject.getFinalRTTStatus().getVersion()));
			}
		}
		// ClockStarted
		valueObject.setClockStarted( domainObject.isClockStarted() );
		// ClockStopped
		valueObject.setClockStopped( domainObject.isClockStopped() );
		// Journey
		if (domainObject.getJourney() != null)
		{
			if(domainObject.getJourney() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getJourney();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setJourney(new ims.pathways.vo.PatientPathwayJourneyRefVo(id, -1));				
			}
			else
			{
				valueObject.setJourney(new ims.pathways.vo.PatientPathwayJourneyRefVo(domainObject.getJourney().getId(), domainObject.getJourney().getVersion()));
			}
		}
		// Source
		ims.domain.lookups.LookupInstance instance8 = domainObject.getSource();
		if ( null != instance8 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance8.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance8.getImage().getImageId(), instance8.getImage().getImagePath());
			}
			color = instance8.getColor();
			if (color != null) 
				color.getValue();

			ims.pathways.vo.lookups.RTTClockImpactSource voLookup8 = new ims.pathways.vo.lookups.RTTClockImpactSource(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.pathways.vo.lookups.RTTClockImpactSource parentVoLookup8 = voLookup8;
			ims.domain.lookups.LookupInstance parent8 = instance8.getParent();
			while (parent8 != null)
			{
				if (parent8.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent8.getImage().getImageId(), parent8.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent8.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup8.setParent(new ims.pathways.vo.lookups.RTTClockImpactSource(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setSource(voLookup8);
		}
				// OutcomeEvent
		if (domainObject.getOutcomeEvent() != null)
		{
			if(domainObject.getOutcomeEvent() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getOutcomeEvent();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setOutcomeEvent(new ims.pathways.vo.RTTStatusEventMapRefVo(id, -1));				
			}
			else
			{
				valueObject.setOutcomeEvent(new ims.pathways.vo.RTTStatusEventMapRefVo(domainObject.getOutcomeEvent().getId(), domainObject.getOutcomeEvent().getVersion()));
			}
		}
		// InitialClockState
		ims.domain.lookups.LookupInstance instance10 = domainObject.getInitialClockState();
		if ( null != instance10 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance10.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance10.getImage().getImageId(), instance10.getImage().getImagePath());
			}
			color = instance10.getColor();
			if (color != null) 
				color.getValue();

			ims.pathways.vo.lookups.RTTClockState voLookup10 = new ims.pathways.vo.lookups.RTTClockState(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.pathways.vo.lookups.RTTClockState parentVoLookup10 = voLookup10;
			ims.domain.lookups.LookupInstance parent10 = instance10.getParent();
			while (parent10 != null)
			{
				if (parent10.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent10.getImage().getImageId(), parent10.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent10.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup10.setParent(new ims.pathways.vo.lookups.RTTClockState(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setInitialClockState(voLookup10);
		}
				// FinalClockState
		ims.domain.lookups.LookupInstance instance11 = domainObject.getFinalClockState();
		if ( null != instance11 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance11.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance11.getImage().getImageId(), instance11.getImage().getImagePath());
			}
			color = instance11.getColor();
			if (color != null) 
				color.getValue();

			ims.pathways.vo.lookups.RTTClockState voLookup11 = new ims.pathways.vo.lookups.RTTClockState(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.pathways.vo.lookups.RTTClockState parentVoLookup11 = voLookup11;
			ims.domain.lookups.LookupInstance parent11 = instance11.getParent();
			while (parent11 != null)
			{
				if (parent11.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent11.getImage().getImageId(), parent11.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent11.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup11.setParent(new ims.pathways.vo.lookups.RTTClockState(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setFinalClockState(voLookup11);
		}
				// OutcomeDescription
		valueObject.setOutcomeDescription(domainObject.getOutcomeDescription());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.pathways.domain.objects.PathwaysRTTClockImpact extractPathwaysRTTClockImpact(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PathwayRTTClockImpactVo valueObject) 
	{
		return 	extractPathwaysRTTClockImpact(domainFactory, valueObject, new HashMap());
	}

	public static ims.pathways.domain.objects.PathwaysRTTClockImpact extractPathwaysRTTClockImpact(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PathwayRTTClockImpactVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PathwaysRTTClockImpact();
		ims.pathways.domain.objects.PathwaysRTTClockImpact domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.pathways.domain.objects.PathwaysRTTClockImpact)domMap.get(valueObject);
			}
			// ims.pathways.vo.PathwayRTTClockImpactVo ID_PathwaysRTTClockImpact field is unknown
			domainObject = new ims.pathways.domain.objects.PathwaysRTTClockImpact();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PathwaysRTTClockImpact());
			if (domMap.get(key) != null)
			{
				return (ims.pathways.domain.objects.PathwaysRTTClockImpact)domMap.get(key);
			}
			domainObject = (ims.pathways.domain.objects.PathwaysRTTClockImpact) domainFactory.getDomainObject(ims.pathways.domain.objects.PathwaysRTTClockImpact.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PathwaysRTTClockImpact());

		ims.pathways.domain.objects.PathwayClock value1 = null;
		if ( null != valueObject.getInitialClock() ) 
		{
			if (valueObject.getInitialClock().getBoId() == null)
			{
				if (domMap.get(valueObject.getInitialClock()) != null)
				{
					value1 = (ims.pathways.domain.objects.PathwayClock)domMap.get(valueObject.getInitialClock());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getInitialClock();	
			}
			else
			{
				value1 = (ims.pathways.domain.objects.PathwayClock)domainFactory.getDomainObject(ims.pathways.domain.objects.PathwayClock.class, valueObject.getInitialClock().getBoId());
			}
		}
		domainObject.setInitialClock(value1);
		ims.pathways.domain.objects.PathwayClock value2 = null;
		if ( null != valueObject.getFinalClock() ) 
		{
			if (valueObject.getFinalClock().getBoId() == null)
			{
				if (domMap.get(valueObject.getFinalClock()) != null)
				{
					value2 = (ims.pathways.domain.objects.PathwayClock)domMap.get(valueObject.getFinalClock());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getFinalClock();	
			}
			else
			{
				value2 = (ims.pathways.domain.objects.PathwayClock)domainFactory.getDomainObject(ims.pathways.domain.objects.PathwayClock.class, valueObject.getFinalClock().getBoId());
			}
		}
		domainObject.setFinalClock(value2);
		ims.pathways.domain.objects.PathwayRTTStatus value3 = null;
		if ( null != valueObject.getInitialRTTStatus() ) 
		{
			if (valueObject.getInitialRTTStatus().getBoId() == null)
			{
				if (domMap.get(valueObject.getInitialRTTStatus()) != null)
				{
					value3 = (ims.pathways.domain.objects.PathwayRTTStatus)domMap.get(valueObject.getInitialRTTStatus());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getInitialRTTStatus();	
			}
			else
			{
				value3 = (ims.pathways.domain.objects.PathwayRTTStatus)domainFactory.getDomainObject(ims.pathways.domain.objects.PathwayRTTStatus.class, valueObject.getInitialRTTStatus().getBoId());
			}
		}
		domainObject.setInitialRTTStatus(value3);
		ims.pathways.domain.objects.PathwayRTTStatus value4 = null;
		if ( null != valueObject.getFinalRTTStatus() ) 
		{
			if (valueObject.getFinalRTTStatus().getBoId() == null)
			{
				if (domMap.get(valueObject.getFinalRTTStatus()) != null)
				{
					value4 = (ims.pathways.domain.objects.PathwayRTTStatus)domMap.get(valueObject.getFinalRTTStatus());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getFinalRTTStatus();	
			}
			else
			{
				value4 = (ims.pathways.domain.objects.PathwayRTTStatus)domainFactory.getDomainObject(ims.pathways.domain.objects.PathwayRTTStatus.class, valueObject.getFinalRTTStatus().getBoId());
			}
		}
		domainObject.setFinalRTTStatus(value4);
		domainObject.setClockStarted(valueObject.getClockStarted());
		domainObject.setClockStopped(valueObject.getClockStopped());
		ims.pathways.domain.objects.PatientPathwayJourney value7 = null;
		if ( null != valueObject.getJourney() ) 
		{
			if (valueObject.getJourney().getBoId() == null)
			{
				if (domMap.get(valueObject.getJourney()) != null)
				{
					value7 = (ims.pathways.domain.objects.PatientPathwayJourney)domMap.get(valueObject.getJourney());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value7 = domainObject.getJourney();	
			}
			else
			{
				value7 = (ims.pathways.domain.objects.PatientPathwayJourney)domainFactory.getDomainObject(ims.pathways.domain.objects.PatientPathwayJourney.class, valueObject.getJourney().getBoId());
			}
		}
		domainObject.setJourney(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getSource() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getSource().getID());
		}
		domainObject.setSource(value8);
		ims.pathways.domain.objects.RTTStatusEventMap value9 = null;
		if ( null != valueObject.getOutcomeEvent() ) 
		{
			if (valueObject.getOutcomeEvent().getBoId() == null)
			{
				if (domMap.get(valueObject.getOutcomeEvent()) != null)
				{
					value9 = (ims.pathways.domain.objects.RTTStatusEventMap)domMap.get(valueObject.getOutcomeEvent());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value9 = domainObject.getOutcomeEvent();	
			}
			else
			{
				value9 = (ims.pathways.domain.objects.RTTStatusEventMap)domainFactory.getDomainObject(ims.pathways.domain.objects.RTTStatusEventMap.class, valueObject.getOutcomeEvent().getBoId());
			}
		}
		domainObject.setOutcomeEvent(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getInitialClockState() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getInitialClockState().getID());
		}
		domainObject.setInitialClockState(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getFinalClockState() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getFinalClockState().getID());
		}
		domainObject.setFinalClockState(value11);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOutcomeDescription() != null && valueObject.getOutcomeDescription().equals(""))
		{
			valueObject.setOutcomeDescription(null);
		}
		domainObject.setOutcomeDescription(valueObject.getOutcomeDescription());

		return domainObject;
	}

}
