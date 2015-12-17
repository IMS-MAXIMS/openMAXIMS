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
 * @author Sean Nesbitt
 */
public class OPDSpasAssLimbsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.generalmedical.vo.OPDSpasAssLimbsVo copy(ims.generalmedical.vo.OPDSpasAssLimbsVo valueObjectDest, ims.generalmedical.vo.OPDSpasAssLimbsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_OPDSpasAssLimbs(valueObjectSrc.getID_OPDSpasAssLimbs());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Joint
		valueObjectDest.setJoint(valueObjectSrc.getJoint());
		// Movement
		valueObjectDest.setMovement(valueObjectSrc.getMovement());
		// ActiveRomLeft
		valueObjectDest.setActiveRomLeft(valueObjectSrc.getActiveRomLeft());
		// ActiveRomRight
		valueObjectDest.setActiveRomRight(valueObjectSrc.getActiveRomRight());
		// PassiveRomLeft
		valueObjectDest.setPassiveRomLeft(valueObjectSrc.getPassiveRomLeft());
		// PassiveRomRight
		valueObjectDest.setPassiveRomRight(valueObjectSrc.getPassiveRomRight());
		// ToneLeft
		valueObjectDest.setToneLeft(valueObjectSrc.getToneLeft());
		// ToneRight
		valueObjectDest.setToneRight(valueObjectSrc.getToneRight());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createOPDSpasAssLimbsVoCollectionFromOPDSpasAssLimbs(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.medical.domain.objects.OPDSpasAssLimbs objects.
	 */
	public static ims.generalmedical.vo.OPDSpasAssLimbsVoCollection createOPDSpasAssLimbsVoCollectionFromOPDSpasAssLimbs(java.util.Set domainObjectSet)	
	{
		return createOPDSpasAssLimbsVoCollectionFromOPDSpasAssLimbs(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.medical.domain.objects.OPDSpasAssLimbs objects.
	 */
	public static ims.generalmedical.vo.OPDSpasAssLimbsVoCollection createOPDSpasAssLimbsVoCollectionFromOPDSpasAssLimbs(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.generalmedical.vo.OPDSpasAssLimbsVoCollection voList = new ims.generalmedical.vo.OPDSpasAssLimbsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.medical.domain.objects.OPDSpasAssLimbs domainObject = (ims.medical.domain.objects.OPDSpasAssLimbs) iterator.next();
			ims.generalmedical.vo.OPDSpasAssLimbsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.medical.domain.objects.OPDSpasAssLimbs objects.
	 */
	public static ims.generalmedical.vo.OPDSpasAssLimbsVoCollection createOPDSpasAssLimbsVoCollectionFromOPDSpasAssLimbs(java.util.List domainObjectList) 
	{
		return createOPDSpasAssLimbsVoCollectionFromOPDSpasAssLimbs(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.medical.domain.objects.OPDSpasAssLimbs objects.
	 */
	public static ims.generalmedical.vo.OPDSpasAssLimbsVoCollection createOPDSpasAssLimbsVoCollectionFromOPDSpasAssLimbs(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.generalmedical.vo.OPDSpasAssLimbsVoCollection voList = new ims.generalmedical.vo.OPDSpasAssLimbsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.medical.domain.objects.OPDSpasAssLimbs domainObject = (ims.medical.domain.objects.OPDSpasAssLimbs) domainObjectList.get(i);
			ims.generalmedical.vo.OPDSpasAssLimbsVo vo = create(map, domainObject);

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
	 * Create the ims.medical.domain.objects.OPDSpasAssLimbs set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractOPDSpasAssLimbsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.OPDSpasAssLimbsVoCollection voCollection) 
	 {
	 	return extractOPDSpasAssLimbsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOPDSpasAssLimbsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.OPDSpasAssLimbsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.generalmedical.vo.OPDSpasAssLimbsVo vo = voCollection.get(i);
			ims.medical.domain.objects.OPDSpasAssLimbs domainObject = OPDSpasAssLimbsVoAssembler.extractOPDSpasAssLimbs(domainFactory, vo, domMap);

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
	 * Create the ims.medical.domain.objects.OPDSpasAssLimbs list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractOPDSpasAssLimbsList(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.OPDSpasAssLimbsVoCollection voCollection) 
	 {
	 	return extractOPDSpasAssLimbsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOPDSpasAssLimbsList(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.OPDSpasAssLimbsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.generalmedical.vo.OPDSpasAssLimbsVo vo = voCollection.get(i);
			ims.medical.domain.objects.OPDSpasAssLimbs domainObject = OPDSpasAssLimbsVoAssembler.extractOPDSpasAssLimbs(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.medical.domain.objects.OPDSpasAssLimbs object.
	 * @param domainObject ims.medical.domain.objects.OPDSpasAssLimbs
	 */
	 public static ims.generalmedical.vo.OPDSpasAssLimbsVo create(ims.medical.domain.objects.OPDSpasAssLimbs domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.medical.domain.objects.OPDSpasAssLimbs object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.generalmedical.vo.OPDSpasAssLimbsVo create(DomainObjectMap map, ims.medical.domain.objects.OPDSpasAssLimbs domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.generalmedical.vo.OPDSpasAssLimbsVo valueObject = (ims.generalmedical.vo.OPDSpasAssLimbsVo) map.getValueObject(domainObject, ims.generalmedical.vo.OPDSpasAssLimbsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.generalmedical.vo.OPDSpasAssLimbsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.medical.domain.objects.OPDSpasAssLimbs
	 */
	 public static ims.generalmedical.vo.OPDSpasAssLimbsVo insert(ims.generalmedical.vo.OPDSpasAssLimbsVo valueObject, ims.medical.domain.objects.OPDSpasAssLimbs domainObject) 
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
	 * @param domainObject ims.medical.domain.objects.OPDSpasAssLimbs
	 */
	 public static ims.generalmedical.vo.OPDSpasAssLimbsVo insert(DomainObjectMap map, ims.generalmedical.vo.OPDSpasAssLimbsVo valueObject, ims.medical.domain.objects.OPDSpasAssLimbs domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_OPDSpasAssLimbs(domainObject.getId());
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
			
		// Joint
		valueObject.setJoint(ims.core.vo.domain.MskJointVoAssembler.create(map, domainObject.getJoint()) );
		// Movement
		ims.domain.lookups.LookupInstance instance2 = domainObject.getMovement();
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

			ims.spinalinjuries.vo.lookups.MskJointsMovements voLookup2 = new ims.spinalinjuries.vo.lookups.MskJointsMovements(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.MskJointsMovements parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.spinalinjuries.vo.lookups.MskJointsMovements(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setMovement(voLookup2);
		}
				// ActiveRomLeft
		valueObject.setActiveRomLeft(domainObject.getActiveRomLeft());
		// ActiveRomRight
		valueObject.setActiveRomRight(domainObject.getActiveRomRight());
		// PassiveRomLeft
		valueObject.setPassiveRomLeft(domainObject.getPassiveRomLeft());
		// PassiveRomRight
		valueObject.setPassiveRomRight(domainObject.getPassiveRomRight());
		// ToneLeft
		ims.domain.lookups.LookupInstance instance7 = domainObject.getToneLeft();
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

			ims.spinalinjuries.vo.lookups.SpasAssToneQualititative voLookup7 = new ims.spinalinjuries.vo.lookups.SpasAssToneQualititative(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.SpasAssToneQualititative parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.spinalinjuries.vo.lookups.SpasAssToneQualititative(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setToneLeft(voLookup7);
		}
				// ToneRight
		ims.domain.lookups.LookupInstance instance8 = domainObject.getToneRight();
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

			ims.spinalinjuries.vo.lookups.SpasAssToneQualititative voLookup8 = new ims.spinalinjuries.vo.lookups.SpasAssToneQualititative(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.SpasAssToneQualititative parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.spinalinjuries.vo.lookups.SpasAssToneQualititative(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setToneRight(voLookup8);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.medical.domain.objects.OPDSpasAssLimbs extractOPDSpasAssLimbs(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.OPDSpasAssLimbsVo valueObject) 
	{
		return 	extractOPDSpasAssLimbs(domainFactory, valueObject, new HashMap());
	}

	public static ims.medical.domain.objects.OPDSpasAssLimbs extractOPDSpasAssLimbs(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.OPDSpasAssLimbsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_OPDSpasAssLimbs();
		ims.medical.domain.objects.OPDSpasAssLimbs domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.medical.domain.objects.OPDSpasAssLimbs)domMap.get(valueObject);
			}
			// ims.generalmedical.vo.OPDSpasAssLimbsVo ID_OPDSpasAssLimbs field is unknown
			domainObject = new ims.medical.domain.objects.OPDSpasAssLimbs();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_OPDSpasAssLimbs());
			if (domMap.get(key) != null)
			{
				return (ims.medical.domain.objects.OPDSpasAssLimbs)domMap.get(key);
			}
			domainObject = (ims.medical.domain.objects.OPDSpasAssLimbs) domainFactory.getDomainObject(ims.medical.domain.objects.OPDSpasAssLimbs.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_OPDSpasAssLimbs());

		domainObject.setJoint(ims.core.vo.domain.MskJointVoAssembler.extractMskJoints(domainFactory, valueObject.getJoint(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getMovement() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getMovement().getID());
		}
		domainObject.setMovement(value2);
		domainObject.setActiveRomLeft(valueObject.getActiveRomLeft());
		domainObject.setActiveRomRight(valueObject.getActiveRomRight());
		domainObject.setPassiveRomLeft(valueObject.getPassiveRomLeft());
		domainObject.setPassiveRomRight(valueObject.getPassiveRomRight());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getToneLeft() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getToneLeft().getID());
		}
		domainObject.setToneLeft(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getToneRight() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getToneRight().getID());
		}
		domainObject.setToneRight(value8);

		return domainObject;
	}

}
