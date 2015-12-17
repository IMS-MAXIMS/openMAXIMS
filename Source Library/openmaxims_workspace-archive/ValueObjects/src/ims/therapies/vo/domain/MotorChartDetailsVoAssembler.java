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
package ims.therapies.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class MotorChartDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.therapies.vo.MotorChartDetailsVo copy(ims.therapies.vo.MotorChartDetailsVo valueObjectDest, ims.therapies.vo.MotorChartDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_MotorChartDetails(valueObjectSrc.getID_MotorChartDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// MuscleGroup
		valueObjectDest.setMuscleGroup(valueObjectSrc.getMuscleGroup());
		// Muscle
		valueObjectDest.setMuscle(valueObjectSrc.getMuscle());
		// Laterality
		valueObjectDest.setLaterality(valueObjectSrc.getLaterality());
		// Score
		valueObjectDest.setScore(valueObjectSrc.getScore());
		// MotorArea
		valueObjectDest.setMotorArea(valueObjectSrc.getMotorArea());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createMotorChartDetailsVoCollectionFromMotorChartDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.spinalinjuries.therapies.domain.objects.MotorChartDetails objects.
	 */
	public static ims.therapies.vo.MotorChartDetailsVoCollection createMotorChartDetailsVoCollectionFromMotorChartDetails(java.util.Set domainObjectSet)	
	{
		return createMotorChartDetailsVoCollectionFromMotorChartDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.spinalinjuries.therapies.domain.objects.MotorChartDetails objects.
	 */
	public static ims.therapies.vo.MotorChartDetailsVoCollection createMotorChartDetailsVoCollectionFromMotorChartDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.therapies.vo.MotorChartDetailsVoCollection voList = new ims.therapies.vo.MotorChartDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.spinalinjuries.therapies.domain.objects.MotorChartDetails domainObject = (ims.spinalinjuries.therapies.domain.objects.MotorChartDetails) iterator.next();
			ims.therapies.vo.MotorChartDetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.spinalinjuries.therapies.domain.objects.MotorChartDetails objects.
	 */
	public static ims.therapies.vo.MotorChartDetailsVoCollection createMotorChartDetailsVoCollectionFromMotorChartDetails(java.util.List domainObjectList) 
	{
		return createMotorChartDetailsVoCollectionFromMotorChartDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.spinalinjuries.therapies.domain.objects.MotorChartDetails objects.
	 */
	public static ims.therapies.vo.MotorChartDetailsVoCollection createMotorChartDetailsVoCollectionFromMotorChartDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.therapies.vo.MotorChartDetailsVoCollection voList = new ims.therapies.vo.MotorChartDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.spinalinjuries.therapies.domain.objects.MotorChartDetails domainObject = (ims.spinalinjuries.therapies.domain.objects.MotorChartDetails) domainObjectList.get(i);
			ims.therapies.vo.MotorChartDetailsVo vo = create(map, domainObject);

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
	 * Create the ims.spinalinjuries.therapies.domain.objects.MotorChartDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractMotorChartDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.MotorChartDetailsVoCollection voCollection) 
	 {
	 	return extractMotorChartDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractMotorChartDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.MotorChartDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.MotorChartDetailsVo vo = voCollection.get(i);
			ims.spinalinjuries.therapies.domain.objects.MotorChartDetails domainObject = MotorChartDetailsVoAssembler.extractMotorChartDetails(domainFactory, vo, domMap);

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
	 * Create the ims.spinalinjuries.therapies.domain.objects.MotorChartDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractMotorChartDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.MotorChartDetailsVoCollection voCollection) 
	 {
	 	return extractMotorChartDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractMotorChartDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.MotorChartDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.MotorChartDetailsVo vo = voCollection.get(i);
			ims.spinalinjuries.therapies.domain.objects.MotorChartDetails domainObject = MotorChartDetailsVoAssembler.extractMotorChartDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.spinalinjuries.therapies.domain.objects.MotorChartDetails object.
	 * @param domainObject ims.spinalinjuries.therapies.domain.objects.MotorChartDetails
	 */
	 public static ims.therapies.vo.MotorChartDetailsVo create(ims.spinalinjuries.therapies.domain.objects.MotorChartDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.spinalinjuries.therapies.domain.objects.MotorChartDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.therapies.vo.MotorChartDetailsVo create(DomainObjectMap map, ims.spinalinjuries.therapies.domain.objects.MotorChartDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.therapies.vo.MotorChartDetailsVo valueObject = (ims.therapies.vo.MotorChartDetailsVo) map.getValueObject(domainObject, ims.therapies.vo.MotorChartDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.therapies.vo.MotorChartDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.spinalinjuries.therapies.domain.objects.MotorChartDetails
	 */
	 public static ims.therapies.vo.MotorChartDetailsVo insert(ims.therapies.vo.MotorChartDetailsVo valueObject, ims.spinalinjuries.therapies.domain.objects.MotorChartDetails domainObject) 
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
	 * @param domainObject ims.spinalinjuries.therapies.domain.objects.MotorChartDetails
	 */
	 public static ims.therapies.vo.MotorChartDetailsVo insert(DomainObjectMap map, ims.therapies.vo.MotorChartDetailsVo valueObject, ims.spinalinjuries.therapies.domain.objects.MotorChartDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_MotorChartDetails(domainObject.getId());
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
			
		// MuscleGroup
		if (domainObject.getMuscleGroup() != null)
		{
			if(domainObject.getMuscleGroup() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getMuscleGroup();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setMuscleGroup(new ims.therapies.vo.MuscleGroupRefVo(id, -1));				
			}
			else
			{
				valueObject.setMuscleGroup(new ims.therapies.vo.MuscleGroupRefVo(domainObject.getMuscleGroup().getId(), domainObject.getMuscleGroup().getVersion()));
			}
		}
		// Muscle
		if (domainObject.getMuscle() != null)
		{
			if(domainObject.getMuscle() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getMuscle();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setMuscle(new ims.therapies.vo.MuscleRefVo(id, -1));				
			}
			else
			{
				valueObject.setMuscle(new ims.therapies.vo.MuscleRefVo(domainObject.getMuscle().getId(), domainObject.getMuscle().getVersion()));
			}
		}
		// Laterality
		ims.domain.lookups.LookupInstance instance3 = domainObject.getLaterality();
		if ( null != instance3 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance3.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance3.getImage().getImageId(), instance3.getImage().getImagePath());
			}
			color = instance3.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.LateralityLRonly voLookup3 = new ims.core.vo.lookups.LateralityLRonly(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.LateralityLRonly parentVoLookup3 = voLookup3;
			ims.domain.lookups.LookupInstance parent3 = instance3.getParent();
			while (parent3 != null)
			{
				if (parent3.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent3.getImage().getImageId(), parent3.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent3.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup3.setParent(new ims.core.vo.lookups.LateralityLRonly(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setLaterality(voLookup3);
		}
				// Score
		valueObject.setScore(domainObject.getScore());
		// MotorArea
		if (domainObject.getMotorArea() != null)
		{
			if(domainObject.getMotorArea() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getMotorArea();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setMotorArea(new ims.therapies.vo.MotorAreaRefVo(id, -1));				
			}
			else
			{
				valueObject.setMotorArea(new ims.therapies.vo.MotorAreaRefVo(domainObject.getMotorArea().getId(), domainObject.getMotorArea().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.spinalinjuries.therapies.domain.objects.MotorChartDetails extractMotorChartDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.MotorChartDetailsVo valueObject) 
	{
		return 	extractMotorChartDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.spinalinjuries.therapies.domain.objects.MotorChartDetails extractMotorChartDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.MotorChartDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_MotorChartDetails();
		ims.spinalinjuries.therapies.domain.objects.MotorChartDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.spinalinjuries.therapies.domain.objects.MotorChartDetails)domMap.get(valueObject);
			}
			// ims.therapies.vo.MotorChartDetailsVo ID_MotorChartDetails field is unknown
			domainObject = new ims.spinalinjuries.therapies.domain.objects.MotorChartDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_MotorChartDetails());
			if (domMap.get(key) != null)
			{
				return (ims.spinalinjuries.therapies.domain.objects.MotorChartDetails)domMap.get(key);
			}
			domainObject = (ims.spinalinjuries.therapies.domain.objects.MotorChartDetails) domainFactory.getDomainObject(ims.spinalinjuries.therapies.domain.objects.MotorChartDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_MotorChartDetails());

		ims.therapies.domain.objects.MuscleGroup value1 = null;
		if ( null != valueObject.getMuscleGroup() ) 
		{
			if (valueObject.getMuscleGroup().getBoId() == null)
			{
				if (domMap.get(valueObject.getMuscleGroup()) != null)
				{
					value1 = (ims.therapies.domain.objects.MuscleGroup)domMap.get(valueObject.getMuscleGroup());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getMuscleGroup();	
			}
			else
			{
				value1 = (ims.therapies.domain.objects.MuscleGroup)domainFactory.getDomainObject(ims.therapies.domain.objects.MuscleGroup.class, valueObject.getMuscleGroup().getBoId());
			}
		}
		domainObject.setMuscleGroup(value1);
		ims.therapies.domain.objects.Muscle value2 = null;
		if ( null != valueObject.getMuscle() ) 
		{
			if (valueObject.getMuscle().getBoId() == null)
			{
				if (domMap.get(valueObject.getMuscle()) != null)
				{
					value2 = (ims.therapies.domain.objects.Muscle)domMap.get(valueObject.getMuscle());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getMuscle();	
			}
			else
			{
				value2 = (ims.therapies.domain.objects.Muscle)domainFactory.getDomainObject(ims.therapies.domain.objects.Muscle.class, valueObject.getMuscle().getBoId());
			}
		}
		domainObject.setMuscle(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getLaterality() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getLaterality().getID());
		}
		domainObject.setLaterality(value3);
		domainObject.setScore(valueObject.getScore());
		ims.therapies.domain.objects.MotorArea value5 = null;
		if ( null != valueObject.getMotorArea() ) 
		{
			if (valueObject.getMotorArea().getBoId() == null)
			{
				if (domMap.get(valueObject.getMotorArea()) != null)
				{
					value5 = (ims.therapies.domain.objects.MotorArea)domMap.get(valueObject.getMotorArea());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value5 = domainObject.getMotorArea();	
			}
			else
			{
				value5 = (ims.therapies.domain.objects.MotorArea)domainFactory.getDomainObject(ims.therapies.domain.objects.MotorArea.class, valueObject.getMotorArea().getBoId());
			}
		}
		domainObject.setMotorArea(value5);

		return domainObject;
	}

}
