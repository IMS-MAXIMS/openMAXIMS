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
 * @author Kevin O'Carroll
 */
public class MskGroupVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.MskGroupVo copy(ims.core.vo.MskGroupVo valueObjectDest, ims.core.vo.MskGroupVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_MskGroups(valueObjectSrc.getID_MskGroups());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// Description
		valueObjectDest.setDescription(valueObjectSrc.getDescription());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// isJoint
		valueObjectDest.setIsJoint(valueObjectSrc.getIsJoint());
		// BoneGeneralFindings
		valueObjectDest.setBoneGeneralFindings(valueObjectSrc.getBoneGeneralFindings());
		// JointGeneralFindings
		valueObjectDest.setJointGeneralFindings(valueObjectSrc.getJointGeneralFindings());
		// Bones
		valueObjectDest.setBones(valueObjectSrc.getBones());
		// Joints
		valueObjectDest.setJoints(valueObjectSrc.getJoints());
		// GroupType
		valueObjectDest.setGroupType(valueObjectSrc.getGroupType());
		// HandMovementTests
		valueObjectDest.setHandMovementTests(valueObjectSrc.getHandMovementTests());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createMskGroupVoCollectionFromMskGroups(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.MskGroups objects.
	 */
	public static ims.core.vo.MskGroupVoCollection createMskGroupVoCollectionFromMskGroups(java.util.Set domainObjectSet)	
	{
		return createMskGroupVoCollectionFromMskGroups(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.MskGroups objects.
	 */
	public static ims.core.vo.MskGroupVoCollection createMskGroupVoCollectionFromMskGroups(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.MskGroupVoCollection voList = new ims.core.vo.MskGroupVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.MskGroups domainObject = (ims.core.clinical.domain.objects.MskGroups) iterator.next();
			ims.core.vo.MskGroupVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.MskGroups objects.
	 */
	public static ims.core.vo.MskGroupVoCollection createMskGroupVoCollectionFromMskGroups(java.util.List domainObjectList) 
	{
		return createMskGroupVoCollectionFromMskGroups(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.MskGroups objects.
	 */
	public static ims.core.vo.MskGroupVoCollection createMskGroupVoCollectionFromMskGroups(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.MskGroupVoCollection voList = new ims.core.vo.MskGroupVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.MskGroups domainObject = (ims.core.clinical.domain.objects.MskGroups) domainObjectList.get(i);
			ims.core.vo.MskGroupVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.MskGroups set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractMskGroupsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MskGroupVoCollection voCollection) 
	 {
	 	return extractMskGroupsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractMskGroupsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MskGroupVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.MskGroupVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.MskGroups domainObject = MskGroupVoAssembler.extractMskGroups(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.MskGroups list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractMskGroupsList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MskGroupVoCollection voCollection) 
	 {
	 	return extractMskGroupsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractMskGroupsList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MskGroupVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.MskGroupVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.MskGroups domainObject = MskGroupVoAssembler.extractMskGroups(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.MskGroups object.
	 * @param domainObject ims.core.clinical.domain.objects.MskGroups
	 */
	 public static ims.core.vo.MskGroupVo create(ims.core.clinical.domain.objects.MskGroups domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.MskGroups object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.MskGroupVo create(DomainObjectMap map, ims.core.clinical.domain.objects.MskGroups domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.MskGroupVo valueObject = (ims.core.vo.MskGroupVo) map.getValueObject(domainObject, ims.core.vo.MskGroupVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.MskGroupVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.MskGroups
	 */
	 public static ims.core.vo.MskGroupVo insert(ims.core.vo.MskGroupVo valueObject, ims.core.clinical.domain.objects.MskGroups domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.MskGroups
	 */
	 public static ims.core.vo.MskGroupVo insert(DomainObjectMap map, ims.core.vo.MskGroupVo valueObject, ims.core.clinical.domain.objects.MskGroups domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_MskGroups(domainObject.getId());
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
			
		// Name
		valueObject.setName(domainObject.getName());
		// Description
		valueObject.setDescription(domainObject.getDescription());
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// isJoint
		valueObject.setIsJoint( domainObject.isIsJoint() );
		// BoneGeneralFindings
		java.util.List listBoneGeneralFindings = domainObject.getBoneGeneralFindings();
		ims.spinalinjuries.vo.lookups.GeneralFindingsBoneCollection BoneGeneralFindings = new ims.spinalinjuries.vo.lookups.GeneralFindingsBoneCollection();
		for(java.util.Iterator iterator = listBoneGeneralFindings.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.spinalinjuries.vo.lookups.GeneralFindingsBone voInstance = new ims.spinalinjuries.vo.lookups.GeneralFindingsBone(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.GeneralFindingsBone parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.spinalinjuries.vo.lookups.GeneralFindingsBone(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			BoneGeneralFindings.add(voInstance);
		}
		valueObject.setBoneGeneralFindings( BoneGeneralFindings );
		// JointGeneralFindings
		java.util.List listJointGeneralFindings = domainObject.getJointGeneralFindings();
		ims.spinalinjuries.vo.lookups.GeneralFindingsJointCollection JointGeneralFindings = new ims.spinalinjuries.vo.lookups.GeneralFindingsJointCollection();
		for(java.util.Iterator iterator = listJointGeneralFindings.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.spinalinjuries.vo.lookups.GeneralFindingsJoint voInstance = new ims.spinalinjuries.vo.lookups.GeneralFindingsJoint(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.GeneralFindingsJoint parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.spinalinjuries.vo.lookups.GeneralFindingsJoint(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			JointGeneralFindings.add(voInstance);
		}
		valueObject.setJointGeneralFindings( JointGeneralFindings );
		// Bones
		java.util.List listBones = domainObject.getBones();
		ims.spinalinjuries.vo.lookups.MskBonesCollection Bones = new ims.spinalinjuries.vo.lookups.MskBonesCollection();
		for(java.util.Iterator iterator = listBones.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.spinalinjuries.vo.lookups.MskBones voInstance = new ims.spinalinjuries.vo.lookups.MskBones(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.MskBones parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.spinalinjuries.vo.lookups.MskBones(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			Bones.add(voInstance);
		}
		valueObject.setBones( Bones );
		// Joints
		valueObject.setJoints(ims.core.vo.domain.MskJointVoAssembler.createMskJointVoCollectionFromMskJoints(map, domainObject.getJoints()) );
		// GroupType
		ims.domain.lookups.LookupInstance instance9 = domainObject.getGroupType();
		if ( null != instance9 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance9.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance9.getImage().getImageId(), instance9.getImage().getImagePath());
			}
			color = instance9.getColor();
			if (color != null) 
				color.getValue();

			ims.spinalinjuries.vo.lookups.MSKGroupType voLookup9 = new ims.spinalinjuries.vo.lookups.MSKGroupType(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.MSKGroupType parentVoLookup9 = voLookup9;
			ims.domain.lookups.LookupInstance parent9 = instance9.getParent();
			while (parent9 != null)
			{
				if (parent9.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent9.getImage().getImageId(), parent9.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent9.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup9.setParent(new ims.spinalinjuries.vo.lookups.MSKGroupType(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setGroupType(voLookup9);
		}
				// HandMovementTests
		java.util.List listHandMovementTests = domainObject.getHandMovementTests();
		ims.spinalinjuries.vo.lookups.HandMovementsTestsCollection HandMovementTests = new ims.spinalinjuries.vo.lookups.HandMovementsTestsCollection();
		for(java.util.Iterator iterator = listHandMovementTests.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.spinalinjuries.vo.lookups.HandMovementsTests voInstance = new ims.spinalinjuries.vo.lookups.HandMovementsTests(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.HandMovementsTests parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.spinalinjuries.vo.lookups.HandMovementsTests(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			HandMovementTests.add(voInstance);
		}
		valueObject.setHandMovementTests( HandMovementTests );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.MskGroups extractMskGroups(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MskGroupVo valueObject) 
	{
		return 	extractMskGroups(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.MskGroups extractMskGroups(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MskGroupVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_MskGroups();
		ims.core.clinical.domain.objects.MskGroups domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.MskGroups)domMap.get(valueObject);
			}
			// ims.core.vo.MskGroupVo ID_MskGroups field is unknown
			domainObject = new ims.core.clinical.domain.objects.MskGroups();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_MskGroups());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.MskGroups)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.MskGroups) domainFactory.getDomainObject(ims.core.clinical.domain.objects.MskGroups.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_MskGroups());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDescription() != null && valueObject.getDescription().equals(""))
		{
			valueObject.setDescription(null);
		}
		domainObject.setDescription(valueObject.getDescription());
		domainObject.setIsActive(valueObject.getIsActive());
		domainObject.setIsJoint(valueObject.getIsJoint());
		ims.spinalinjuries.vo.lookups.GeneralFindingsBoneCollection collection5 =
	valueObject.getBoneGeneralFindings();
	    java.util.List domainBoneGeneralFindings = domainObject.getBoneGeneralFindings();;			
	    int collection5Size=0;
		if (collection5 == null)
		{
			domainBoneGeneralFindings = new java.util.ArrayList(0);
		}
		else
		{
			collection5Size = collection5.size();
		}
		
		for(int i=0; i<collection5Size; i++) 
		{
			int instanceId = collection5.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainBoneGeneralFindings.indexOf(dom);
			if (domIdx == -1)
			{
				domainBoneGeneralFindings.add(i, dom);
			}
			else if (i != domIdx && i < domainBoneGeneralFindings.size())
			{
				Object tmp = domainBoneGeneralFindings.get(i);
				domainBoneGeneralFindings.set(i, domainBoneGeneralFindings.get(domIdx));
				domainBoneGeneralFindings.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j5 = domainBoneGeneralFindings.size();
		while (j5 > collection5Size)
		{
			domainBoneGeneralFindings.remove(j5-1);
			j5 = domainBoneGeneralFindings.size();
		}

		domainObject.setBoneGeneralFindings(domainBoneGeneralFindings);		
		ims.spinalinjuries.vo.lookups.GeneralFindingsJointCollection collection6 =
	valueObject.getJointGeneralFindings();
	    java.util.List domainJointGeneralFindings = domainObject.getJointGeneralFindings();;			
	    int collection6Size=0;
		if (collection6 == null)
		{
			domainJointGeneralFindings = new java.util.ArrayList(0);
		}
		else
		{
			collection6Size = collection6.size();
		}
		
		for(int i=0; i<collection6Size; i++) 
		{
			int instanceId = collection6.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainJointGeneralFindings.indexOf(dom);
			if (domIdx == -1)
			{
				domainJointGeneralFindings.add(i, dom);
			}
			else if (i != domIdx && i < domainJointGeneralFindings.size())
			{
				Object tmp = domainJointGeneralFindings.get(i);
				domainJointGeneralFindings.set(i, domainJointGeneralFindings.get(domIdx));
				domainJointGeneralFindings.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j6 = domainJointGeneralFindings.size();
		while (j6 > collection6Size)
		{
			domainJointGeneralFindings.remove(j6-1);
			j6 = domainJointGeneralFindings.size();
		}

		domainObject.setJointGeneralFindings(domainJointGeneralFindings);		
		ims.spinalinjuries.vo.lookups.MskBonesCollection collection7 =
	valueObject.getBones();
	    java.util.List domainBones = domainObject.getBones();;			
	    int collection7Size=0;
		if (collection7 == null)
		{
			domainBones = new java.util.ArrayList(0);
		}
		else
		{
			collection7Size = collection7.size();
		}
		
		for(int i=0; i<collection7Size; i++) 
		{
			int instanceId = collection7.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainBones.indexOf(dom);
			if (domIdx == -1)
			{
				domainBones.add(i, dom);
			}
			else if (i != domIdx && i < domainBones.size())
			{
				Object tmp = domainBones.get(i);
				domainBones.set(i, domainBones.get(domIdx));
				domainBones.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j7 = domainBones.size();
		while (j7 > collection7Size)
		{
			domainBones.remove(j7-1);
			j7 = domainBones.size();
		}

		domainObject.setBones(domainBones);		
		domainObject.setJoints(ims.core.vo.domain.MskJointVoAssembler.extractMskJointsSet(domainFactory, valueObject.getJoints(), domainObject.getJoints(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getGroupType() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getGroupType().getID());
		}
		domainObject.setGroupType(value9);
		ims.spinalinjuries.vo.lookups.HandMovementsTestsCollection collection10 =
	valueObject.getHandMovementTests();
	    java.util.List domainHandMovementTests = domainObject.getHandMovementTests();;			
	    int collection10Size=0;
		if (collection10 == null)
		{
			domainHandMovementTests = new java.util.ArrayList(0);
		}
		else
		{
			collection10Size = collection10.size();
		}
		
		for(int i=0; i<collection10Size; i++) 
		{
			int instanceId = collection10.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainHandMovementTests.indexOf(dom);
			if (domIdx == -1)
			{
				domainHandMovementTests.add(i, dom);
			}
			else if (i != domIdx && i < domainHandMovementTests.size())
			{
				Object tmp = domainHandMovementTests.get(i);
				domainHandMovementTests.set(i, domainHandMovementTests.get(domIdx));
				domainHandMovementTests.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j10 = domainHandMovementTests.size();
		while (j10 > collection10Size)
		{
			domainHandMovementTests.remove(j10-1);
			j10 = domainHandMovementTests.size();
		}

		domainObject.setHandMovementTests(domainHandMovementTests);		

		return domainObject;
	}

}
