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
package ims.eas.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Barbara Worwood
 */
public class ProtocolPhaseVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.eas.vo.ProtocolPhaseVo copy(ims.eas.vo.ProtocolPhaseVo valueObjectDest, ims.eas.vo.ProtocolPhaseVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ProtocolPhase(valueObjectSrc.getID_ProtocolPhase());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// PhaseName
		valueObjectDest.setPhaseName(valueObjectSrc.getPhaseName());
		// Dose
		valueObjectDest.setDose(valueObjectSrc.getDose());
		// Fractions
		valueObjectDest.setFractions(valueObjectSrc.getFractions());
		// Days
		valueObjectDest.setDays(valueObjectSrc.getDays());
		// Energy
		valueObjectDest.setEnergy(valueObjectSrc.getEnergy());
		// Units
		valueObjectDest.setUnits(valueObjectSrc.getUnits());
		// Modality
		valueObjectDest.setModality(valueObjectSrc.getModality());
		// Preferred
		valueObjectDest.setPreferred(valueObjectSrc.getPreferred());
		// Active
		valueObjectDest.setActive(valueObjectSrc.getActive());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createProtocolPhaseVoCollectionFromProtocolPhase(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.eas.configuration.domain.objects.ProtocolPhase objects.
	 */
	public static ims.eas.vo.ProtocolPhaseVoCollection createProtocolPhaseVoCollectionFromProtocolPhase(java.util.Set domainObjectSet)	
	{
		return createProtocolPhaseVoCollectionFromProtocolPhase(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.eas.configuration.domain.objects.ProtocolPhase objects.
	 */
	public static ims.eas.vo.ProtocolPhaseVoCollection createProtocolPhaseVoCollectionFromProtocolPhase(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.eas.vo.ProtocolPhaseVoCollection voList = new ims.eas.vo.ProtocolPhaseVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.eas.configuration.domain.objects.ProtocolPhase domainObject = (ims.eas.configuration.domain.objects.ProtocolPhase) iterator.next();
			ims.eas.vo.ProtocolPhaseVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.eas.configuration.domain.objects.ProtocolPhase objects.
	 */
	public static ims.eas.vo.ProtocolPhaseVoCollection createProtocolPhaseVoCollectionFromProtocolPhase(java.util.List domainObjectList) 
	{
		return createProtocolPhaseVoCollectionFromProtocolPhase(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.eas.configuration.domain.objects.ProtocolPhase objects.
	 */
	public static ims.eas.vo.ProtocolPhaseVoCollection createProtocolPhaseVoCollectionFromProtocolPhase(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.eas.vo.ProtocolPhaseVoCollection voList = new ims.eas.vo.ProtocolPhaseVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.eas.configuration.domain.objects.ProtocolPhase domainObject = (ims.eas.configuration.domain.objects.ProtocolPhase) domainObjectList.get(i);
			ims.eas.vo.ProtocolPhaseVo vo = create(map, domainObject);

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
	 * Create the ims.eas.configuration.domain.objects.ProtocolPhase set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractProtocolPhaseSet(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.ProtocolPhaseVoCollection voCollection) 
	 {
	 	return extractProtocolPhaseSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractProtocolPhaseSet(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.ProtocolPhaseVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.eas.vo.ProtocolPhaseVo vo = voCollection.get(i);
			ims.eas.configuration.domain.objects.ProtocolPhase domainObject = ProtocolPhaseVoAssembler.extractProtocolPhase(domainFactory, vo, domMap);

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
	 * Create the ims.eas.configuration.domain.objects.ProtocolPhase list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractProtocolPhaseList(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.ProtocolPhaseVoCollection voCollection) 
	 {
	 	return extractProtocolPhaseList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractProtocolPhaseList(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.ProtocolPhaseVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.eas.vo.ProtocolPhaseVo vo = voCollection.get(i);
			ims.eas.configuration.domain.objects.ProtocolPhase domainObject = ProtocolPhaseVoAssembler.extractProtocolPhase(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.eas.configuration.domain.objects.ProtocolPhase object.
	 * @param domainObject ims.eas.configuration.domain.objects.ProtocolPhase
	 */
	 public static ims.eas.vo.ProtocolPhaseVo create(ims.eas.configuration.domain.objects.ProtocolPhase domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.eas.configuration.domain.objects.ProtocolPhase object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.eas.vo.ProtocolPhaseVo create(DomainObjectMap map, ims.eas.configuration.domain.objects.ProtocolPhase domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.eas.vo.ProtocolPhaseVo valueObject = (ims.eas.vo.ProtocolPhaseVo) map.getValueObject(domainObject, ims.eas.vo.ProtocolPhaseVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.eas.vo.ProtocolPhaseVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.eas.configuration.domain.objects.ProtocolPhase
	 */
	 public static ims.eas.vo.ProtocolPhaseVo insert(ims.eas.vo.ProtocolPhaseVo valueObject, ims.eas.configuration.domain.objects.ProtocolPhase domainObject) 
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
	 * @param domainObject ims.eas.configuration.domain.objects.ProtocolPhase
	 */
	 public static ims.eas.vo.ProtocolPhaseVo insert(DomainObjectMap map, ims.eas.vo.ProtocolPhaseVo valueObject, ims.eas.configuration.domain.objects.ProtocolPhase domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ProtocolPhase(domainObject.getId());
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
			
		// PhaseName
		ims.domain.lookups.LookupInstance instance1 = domainObject.getPhaseName();
		if ( null != instance1 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance1.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance1.getImage().getImageId(), instance1.getImage().getImagePath());
			}
			color = instance1.getColor();
			if (color != null) 
				color.getValue();

			ims.eas.vo.lookups.PhaseNames voLookup1 = new ims.eas.vo.lookups.PhaseNames(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.eas.vo.lookups.PhaseNames parentVoLookup1 = voLookup1;
			ims.domain.lookups.LookupInstance parent1 = instance1.getParent();
			while (parent1 != null)
			{
				if (parent1.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent1.getImage().getImageId(), parent1.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent1.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup1.setParent(new ims.eas.vo.lookups.PhaseNames(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setPhaseName(voLookup1);
		}
				// Dose
		valueObject.setDose(domainObject.getDose());
		// Fractions
		valueObject.setFractions(domainObject.getFractions());
		// Days
		valueObject.setDays(domainObject.getDays());
		// Energy
		valueObject.setEnergy(domainObject.getEnergy());
		// Units
		ims.domain.lookups.LookupInstance instance6 = domainObject.getUnits();
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

			ims.ccosched.vo.lookups.Unit voLookup6 = new ims.ccosched.vo.lookups.Unit(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.ccosched.vo.lookups.Unit parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.ccosched.vo.lookups.Unit(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setUnits(voLookup6);
		}
				// Modality
		ims.domain.lookups.LookupInstance instance7 = domainObject.getModality();
		if ( null != instance7 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance7.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance7.getImage().getImageId(), instance7.getImage().getImagePath());
			}
			color = instance7.getColor();
			if (color != null) 
				color.getValue();

			ims.ccosched.vo.lookups.Modality voLookup7 = new ims.ccosched.vo.lookups.Modality(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.ccosched.vo.lookups.Modality parentVoLookup7 = voLookup7;
			ims.domain.lookups.LookupInstance parent7 = instance7.getParent();
			while (parent7 != null)
			{
				if (parent7.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent7.getImage().getImageId(), parent7.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent7.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup7.setParent(new ims.ccosched.vo.lookups.Modality(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setModality(voLookup7);
		}
				// Preferred
		valueObject.setPreferred( domainObject.isPreferred() );
		// Active
		valueObject.setActive( domainObject.isActive() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.eas.configuration.domain.objects.ProtocolPhase extractProtocolPhase(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.ProtocolPhaseVo valueObject) 
	{
		return 	extractProtocolPhase(domainFactory, valueObject, new HashMap());
	}

	public static ims.eas.configuration.domain.objects.ProtocolPhase extractProtocolPhase(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.ProtocolPhaseVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ProtocolPhase();
		ims.eas.configuration.domain.objects.ProtocolPhase domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.eas.configuration.domain.objects.ProtocolPhase)domMap.get(valueObject);
			}
			// ims.eas.vo.ProtocolPhaseVo ID_ProtocolPhase field is unknown
			domainObject = new ims.eas.configuration.domain.objects.ProtocolPhase();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ProtocolPhase());
			if (domMap.get(key) != null)
			{
				return (ims.eas.configuration.domain.objects.ProtocolPhase)domMap.get(key);
			}
			domainObject = (ims.eas.configuration.domain.objects.ProtocolPhase) domainFactory.getDomainObject(ims.eas.configuration.domain.objects.ProtocolPhase.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ProtocolPhase());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getPhaseName() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getPhaseName().getID());
		}
		domainObject.setPhaseName(value1);
		domainObject.setDose(valueObject.getDose());
		domainObject.setFractions(valueObject.getFractions());
		domainObject.setDays(valueObject.getDays());
		domainObject.setEnergy(valueObject.getEnergy());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getUnits() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getUnits().getID());
		}
		domainObject.setUnits(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getModality() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getModality().getID());
		}
		domainObject.setModality(value7);
		domainObject.setPreferred(valueObject.getPreferred());
		domainObject.setActive(valueObject.getActive());

		return domainObject;
	}

}
