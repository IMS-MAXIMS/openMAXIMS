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
package ims.generalmedical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Kevin O'Carroll
 */
public class NeuroSensationRootValueVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.generalmedical.vo.NeuroSensationRootValueVo copy(ims.generalmedical.vo.NeuroSensationRootValueVo valueObjectDest, ims.generalmedical.vo.NeuroSensationRootValueVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_NeuRootSensFinding(valueObjectSrc.getID_NeuRootSensFinding());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// RootValue
		valueObjectDest.setRootValue(valueObjectSrc.getRootValue());
		// rightFinding
		valueObjectDest.setRightFinding(valueObjectSrc.getRightFinding());
		// leftFinding
		valueObjectDest.setLeftFinding(valueObjectSrc.getLeftFinding());
		// SensationType
		valueObjectDest.setSensationType(valueObjectSrc.getSensationType());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createNeuroSensationRootValueVoCollectionFromNeuRootSensFinding(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.medical.domain.objects.NeuRootSensFinding objects.
	 */
	public static ims.generalmedical.vo.NeuroSensationRootValueVoCollection createNeuroSensationRootValueVoCollectionFromNeuRootSensFinding(java.util.Set domainObjectSet)	
	{
		return createNeuroSensationRootValueVoCollectionFromNeuRootSensFinding(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.medical.domain.objects.NeuRootSensFinding objects.
	 */
	public static ims.generalmedical.vo.NeuroSensationRootValueVoCollection createNeuroSensationRootValueVoCollectionFromNeuRootSensFinding(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.generalmedical.vo.NeuroSensationRootValueVoCollection voList = new ims.generalmedical.vo.NeuroSensationRootValueVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.medical.domain.objects.NeuRootSensFinding domainObject = (ims.medical.domain.objects.NeuRootSensFinding) iterator.next();
			ims.generalmedical.vo.NeuroSensationRootValueVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.medical.domain.objects.NeuRootSensFinding objects.
	 */
	public static ims.generalmedical.vo.NeuroSensationRootValueVoCollection createNeuroSensationRootValueVoCollectionFromNeuRootSensFinding(java.util.List domainObjectList) 
	{
		return createNeuroSensationRootValueVoCollectionFromNeuRootSensFinding(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.medical.domain.objects.NeuRootSensFinding objects.
	 */
	public static ims.generalmedical.vo.NeuroSensationRootValueVoCollection createNeuroSensationRootValueVoCollectionFromNeuRootSensFinding(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.generalmedical.vo.NeuroSensationRootValueVoCollection voList = new ims.generalmedical.vo.NeuroSensationRootValueVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.medical.domain.objects.NeuRootSensFinding domainObject = (ims.medical.domain.objects.NeuRootSensFinding) domainObjectList.get(i);
			ims.generalmedical.vo.NeuroSensationRootValueVo vo = create(map, domainObject);

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
	 * Create the ims.medical.domain.objects.NeuRootSensFinding set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractNeuRootSensFindingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.NeuroSensationRootValueVoCollection voCollection) 
	 {
	 	return extractNeuRootSensFindingSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractNeuRootSensFindingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.NeuroSensationRootValueVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.generalmedical.vo.NeuroSensationRootValueVo vo = voCollection.get(i);
			ims.medical.domain.objects.NeuRootSensFinding domainObject = NeuroSensationRootValueVoAssembler.extractNeuRootSensFinding(domainFactory, vo, domMap);

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
	 * Create the ims.medical.domain.objects.NeuRootSensFinding list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractNeuRootSensFindingList(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.NeuroSensationRootValueVoCollection voCollection) 
	 {
	 	return extractNeuRootSensFindingList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractNeuRootSensFindingList(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.NeuroSensationRootValueVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.generalmedical.vo.NeuroSensationRootValueVo vo = voCollection.get(i);
			ims.medical.domain.objects.NeuRootSensFinding domainObject = NeuroSensationRootValueVoAssembler.extractNeuRootSensFinding(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.medical.domain.objects.NeuRootSensFinding object.
	 * @param domainObject ims.medical.domain.objects.NeuRootSensFinding
	 */
	 public static ims.generalmedical.vo.NeuroSensationRootValueVo create(ims.medical.domain.objects.NeuRootSensFinding domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.medical.domain.objects.NeuRootSensFinding object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.generalmedical.vo.NeuroSensationRootValueVo create(DomainObjectMap map, ims.medical.domain.objects.NeuRootSensFinding domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.generalmedical.vo.NeuroSensationRootValueVo valueObject = (ims.generalmedical.vo.NeuroSensationRootValueVo) map.getValueObject(domainObject, ims.generalmedical.vo.NeuroSensationRootValueVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.generalmedical.vo.NeuroSensationRootValueVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.medical.domain.objects.NeuRootSensFinding
	 */
	 public static ims.generalmedical.vo.NeuroSensationRootValueVo insert(ims.generalmedical.vo.NeuroSensationRootValueVo valueObject, ims.medical.domain.objects.NeuRootSensFinding domainObject) 
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
	 * @param domainObject ims.medical.domain.objects.NeuRootSensFinding
	 */
	 public static ims.generalmedical.vo.NeuroSensationRootValueVo insert(DomainObjectMap map, ims.generalmedical.vo.NeuroSensationRootValueVo valueObject, ims.medical.domain.objects.NeuRootSensFinding domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_NeuRootSensFinding(domainObject.getId());
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
			
		// RootValue
		valueObject.setRootValue(ims.core.vo.domain.VertebrallevelVoAssembler.create(map, domainObject.getRootValue()) );
		// rightFinding
		valueObject.setRightFinding(domainObject.getRightFinding());
		// leftFinding
		valueObject.setLeftFinding(domainObject.getLeftFinding());
		// SensationType
		ims.domain.lookups.LookupInstance instance4 = domainObject.getSensationType();
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

			ims.spinalinjuries.vo.lookups.MSKSenstionModality voLookup4 = new ims.spinalinjuries.vo.lookups.MSKSenstionModality(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.MSKSenstionModality parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.spinalinjuries.vo.lookups.MSKSenstionModality(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setSensationType(voLookup4);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.medical.domain.objects.NeuRootSensFinding extractNeuRootSensFinding(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.NeuroSensationRootValueVo valueObject) 
	{
		return 	extractNeuRootSensFinding(domainFactory, valueObject, new HashMap());
	}

	public static ims.medical.domain.objects.NeuRootSensFinding extractNeuRootSensFinding(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.NeuroSensationRootValueVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_NeuRootSensFinding();
		ims.medical.domain.objects.NeuRootSensFinding domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.medical.domain.objects.NeuRootSensFinding)domMap.get(valueObject);
			}
			// ims.generalmedical.vo.NeuroSensationRootValueVo ID_NeuRootSensFinding field is unknown
			domainObject = new ims.medical.domain.objects.NeuRootSensFinding();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_NeuRootSensFinding());
			if (domMap.get(key) != null)
			{
				return (ims.medical.domain.objects.NeuRootSensFinding)domMap.get(key);
			}
			domainObject = (ims.medical.domain.objects.NeuRootSensFinding) domainFactory.getDomainObject(ims.medical.domain.objects.NeuRootSensFinding.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_NeuRootSensFinding());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.VertebralLevels value1 = null;
		if ( null != valueObject.getRootValue() ) 
		{
			if (valueObject.getRootValue().getBoId() == null)
			{
				if (domMap.get(valueObject.getRootValue()) != null)
				{
					value1 = (ims.core.clinical.domain.objects.VertebralLevels)domMap.get(valueObject.getRootValue());
				}
			}
			else
			{
				value1 = (ims.core.clinical.domain.objects.VertebralLevels)domainFactory.getDomainObject(ims.core.clinical.domain.objects.VertebralLevels.class, valueObject.getRootValue().getBoId());
			}
		}
		domainObject.setRootValue(value1);
		domainObject.setRightFinding(valueObject.getRightFinding());
		domainObject.setLeftFinding(valueObject.getLeftFinding());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getSensationType() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getSensationType().getID());
		}
		domainObject.setSensationType(value4);

		return domainObject;
	}

}
