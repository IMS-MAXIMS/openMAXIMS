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
 * Generated on 12/10/2015, 13:24
 *
 */
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Bogdan Tofei
 */
public class PendingEmergencyTheatreForBookVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.PendingEmergencyTheatreForBookVo copy(ims.RefMan.vo.PendingEmergencyTheatreForBookVo valueObjectDest, ims.RefMan.vo.PendingEmergencyTheatreForBookVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PendingEmergencyTheatre(valueObjectSrc.getID_PendingEmergencyTheatre());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// PrimaryProcedure
		valueObjectDest.setPrimaryProcedure(valueObjectSrc.getPrimaryProcedure());
		// ProcLaterality
		valueObjectDest.setProcLaterality(valueObjectSrc.getProcLaterality());
		// SecondaryProcedure
		valueObjectDest.setSecondaryProcedure(valueObjectSrc.getSecondaryProcedure());
		// SecondaryProcLaterality
		valueObjectDest.setSecondaryProcLaterality(valueObjectSrc.getSecondaryProcLaterality());
		// SurgeryTimeMins
		valueObjectDest.setSurgeryTimeMins(valueObjectSrc.getSurgeryTimeMins());
		// TheatreType
		valueObjectDest.setTheatreType(valueObjectSrc.getTheatreType());
		// ExpectedHospital
		valueObjectDest.setExpectedHospital(valueObjectSrc.getExpectedHospital());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPendingEmergencyTheatreForBookVoCollectionFromPendingEmergencyTheatre(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.PendingEmergencyTheatre objects.
	 */
	public static ims.RefMan.vo.PendingEmergencyTheatreForBookVoCollection createPendingEmergencyTheatreForBookVoCollectionFromPendingEmergencyTheatre(java.util.Set domainObjectSet)	
	{
		return createPendingEmergencyTheatreForBookVoCollectionFromPendingEmergencyTheatre(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.PendingEmergencyTheatre objects.
	 */
	public static ims.RefMan.vo.PendingEmergencyTheatreForBookVoCollection createPendingEmergencyTheatreForBookVoCollectionFromPendingEmergencyTheatre(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.PendingEmergencyTheatreForBookVoCollection voList = new ims.RefMan.vo.PendingEmergencyTheatreForBookVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.scheduling.domain.objects.PendingEmergencyTheatre domainObject = (ims.scheduling.domain.objects.PendingEmergencyTheatre) iterator.next();
			ims.RefMan.vo.PendingEmergencyTheatreForBookVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.scheduling.domain.objects.PendingEmergencyTheatre objects.
	 */
	public static ims.RefMan.vo.PendingEmergencyTheatreForBookVoCollection createPendingEmergencyTheatreForBookVoCollectionFromPendingEmergencyTheatre(java.util.List domainObjectList) 
	{
		return createPendingEmergencyTheatreForBookVoCollectionFromPendingEmergencyTheatre(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.PendingEmergencyTheatre objects.
	 */
	public static ims.RefMan.vo.PendingEmergencyTheatreForBookVoCollection createPendingEmergencyTheatreForBookVoCollectionFromPendingEmergencyTheatre(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.PendingEmergencyTheatreForBookVoCollection voList = new ims.RefMan.vo.PendingEmergencyTheatreForBookVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.PendingEmergencyTheatre domainObject = (ims.scheduling.domain.objects.PendingEmergencyTheatre) domainObjectList.get(i);
			ims.RefMan.vo.PendingEmergencyTheatreForBookVo vo = create(map, domainObject);

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
	 * Create the ims.scheduling.domain.objects.PendingEmergencyTheatre set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPendingEmergencyTheatreSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PendingEmergencyTheatreForBookVoCollection voCollection) 
	 {
	 	return extractPendingEmergencyTheatreSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPendingEmergencyTheatreSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PendingEmergencyTheatreForBookVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PendingEmergencyTheatreForBookVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.PendingEmergencyTheatre domainObject = PendingEmergencyTheatreForBookVoAssembler.extractPendingEmergencyTheatre(domainFactory, vo, domMap);

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
	 * Create the ims.scheduling.domain.objects.PendingEmergencyTheatre list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPendingEmergencyTheatreList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PendingEmergencyTheatreForBookVoCollection voCollection) 
	 {
	 	return extractPendingEmergencyTheatreList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPendingEmergencyTheatreList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PendingEmergencyTheatreForBookVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PendingEmergencyTheatreForBookVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.PendingEmergencyTheatre domainObject = PendingEmergencyTheatreForBookVoAssembler.extractPendingEmergencyTheatre(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.scheduling.domain.objects.PendingEmergencyTheatre object.
	 * @param domainObject ims.scheduling.domain.objects.PendingEmergencyTheatre
	 */
	 public static ims.RefMan.vo.PendingEmergencyTheatreForBookVo create(ims.scheduling.domain.objects.PendingEmergencyTheatre domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.scheduling.domain.objects.PendingEmergencyTheatre object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.PendingEmergencyTheatreForBookVo create(DomainObjectMap map, ims.scheduling.domain.objects.PendingEmergencyTheatre domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.PendingEmergencyTheatreForBookVo valueObject = (ims.RefMan.vo.PendingEmergencyTheatreForBookVo) map.getValueObject(domainObject, ims.RefMan.vo.PendingEmergencyTheatreForBookVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.PendingEmergencyTheatreForBookVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.scheduling.domain.objects.PendingEmergencyTheatre
	 */
	 public static ims.RefMan.vo.PendingEmergencyTheatreForBookVo insert(ims.RefMan.vo.PendingEmergencyTheatreForBookVo valueObject, ims.scheduling.domain.objects.PendingEmergencyTheatre domainObject) 
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
	 * @param domainObject ims.scheduling.domain.objects.PendingEmergencyTheatre
	 */
	 public static ims.RefMan.vo.PendingEmergencyTheatreForBookVo insert(DomainObjectMap map, ims.RefMan.vo.PendingEmergencyTheatreForBookVo valueObject, ims.scheduling.domain.objects.PendingEmergencyTheatre domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PendingEmergencyTheatre(domainObject.getId());
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
			
		// PrimaryProcedure
		valueObject.setPrimaryProcedure(ims.core.vo.domain.ProcedureLiteVoAssembler.create(map, domainObject.getPrimaryProcedure()) );
		// ProcLaterality
		ims.domain.lookups.LookupInstance instance2 = domainObject.getProcLaterality();
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

			ims.core.vo.lookups.LateralityLRB voLookup2 = new ims.core.vo.lookups.LateralityLRB(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.LateralityLRB parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.LateralityLRB(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setProcLaterality(voLookup2);
		}
				// SecondaryProcedure
		valueObject.setSecondaryProcedure(ims.core.vo.domain.ProcedureLiteVoAssembler.create(map, domainObject.getSecondaryProcedure()) );
		// SecondaryProcLaterality
		ims.domain.lookups.LookupInstance instance4 = domainObject.getSecondaryProcLaterality();
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
			valueObject.setSecondaryProcLaterality(voLookup4);
		}
				// SurgeryTimeMins
		valueObject.setSurgeryTimeMins(domainObject.getSurgeryTimeMins());
		// TheatreType
		ims.domain.lookups.LookupInstance instance6 = domainObject.getTheatreType();
		if ( null != instance6 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance6.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance6.getImage().getImageId(), instance6.getImage().getImagePath());
			}
			color = instance6.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.TheatreType voLookup6 = new ims.scheduling.vo.lookups.TheatreType(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.scheduling.vo.lookups.TheatreType parentVoLookup6 = voLookup6;
			ims.domain.lookups.LookupInstance parent6 = instance6.getParent();
			while (parent6 != null)
			{
				if (parent6.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent6.getImage().getImageId(), parent6.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent6.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup6.setParent(new ims.scheduling.vo.lookups.TheatreType(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setTheatreType(voLookup6);
		}
				// ExpectedHospital
		valueObject.setExpectedHospital(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getExpectedHospital()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.PendingEmergencyTheatre extractPendingEmergencyTheatre(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PendingEmergencyTheatreForBookVo valueObject) 
	{
		return 	extractPendingEmergencyTheatre(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.PendingEmergencyTheatre extractPendingEmergencyTheatre(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PendingEmergencyTheatreForBookVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PendingEmergencyTheatre();
		ims.scheduling.domain.objects.PendingEmergencyTheatre domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.scheduling.domain.objects.PendingEmergencyTheatre)domMap.get(valueObject);
			}
			// ims.RefMan.vo.PendingEmergencyTheatreForBookVo ID_PendingEmergencyTheatre field is unknown
			domainObject = new ims.scheduling.domain.objects.PendingEmergencyTheatre();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PendingEmergencyTheatre());
			if (domMap.get(key) != null)
			{
				return (ims.scheduling.domain.objects.PendingEmergencyTheatre)domMap.get(key);
			}
			domainObject = (ims.scheduling.domain.objects.PendingEmergencyTheatre) domainFactory.getDomainObject(ims.scheduling.domain.objects.PendingEmergencyTheatre.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PendingEmergencyTheatre());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Procedure value1 = null;
		if ( null != valueObject.getPrimaryProcedure() ) 
		{
			if (valueObject.getPrimaryProcedure().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrimaryProcedure()) != null)
				{
					value1 = (ims.core.clinical.domain.objects.Procedure)domMap.get(valueObject.getPrimaryProcedure());
				}
			}
			else
			{
				value1 = (ims.core.clinical.domain.objects.Procedure)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Procedure.class, valueObject.getPrimaryProcedure().getBoId());
			}
		}
		domainObject.setPrimaryProcedure(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getProcLaterality() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getProcLaterality().getID());
		}
		domainObject.setProcLaterality(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Procedure value3 = null;
		if ( null != valueObject.getSecondaryProcedure() ) 
		{
			if (valueObject.getSecondaryProcedure().getBoId() == null)
			{
				if (domMap.get(valueObject.getSecondaryProcedure()) != null)
				{
					value3 = (ims.core.clinical.domain.objects.Procedure)domMap.get(valueObject.getSecondaryProcedure());
				}
			}
			else
			{
				value3 = (ims.core.clinical.domain.objects.Procedure)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Procedure.class, valueObject.getSecondaryProcedure().getBoId());
			}
		}
		domainObject.setSecondaryProcedure(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getSecondaryProcLaterality() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getSecondaryProcLaterality().getID());
		}
		domainObject.setSecondaryProcLaterality(value4);
		domainObject.setSurgeryTimeMins(valueObject.getSurgeryTimeMins());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getTheatreType() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getTheatreType().getID());
		}
		domainObject.setTheatreType(value6);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value7 = null;
		if ( null != valueObject.getExpectedHospital() ) 
		{
			if (valueObject.getExpectedHospital().getBoId() == null)
			{
				if (domMap.get(valueObject.getExpectedHospital()) != null)
				{
					value7 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getExpectedHospital());
				}
			}
			else
			{
				value7 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getExpectedHospital().getBoId());
			}
		}
		domainObject.setExpectedHospital(value7);

		return domainObject;
	}

}
