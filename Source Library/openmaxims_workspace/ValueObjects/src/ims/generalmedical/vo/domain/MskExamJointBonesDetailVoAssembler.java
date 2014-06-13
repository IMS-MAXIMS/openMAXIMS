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
 * @author Charlotte Murphy
 */
public class MskExamJointBonesDetailVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.generalmedical.vo.MskExamJointBonesDetailVo copy(ims.generalmedical.vo.MskExamJointBonesDetailVo valueObjectDest, ims.generalmedical.vo.MskExamJointBonesDetailVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_MSkExamJointBonesDetail(valueObjectSrc.getID_MSkExamJointBonesDetail());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Group
		valueObjectDest.setGroup(valueObjectSrc.getGroup());
		// isJoint
		valueObjectDest.setIsJoint(valueObjectSrc.getIsJoint());
		// Joint
		valueObjectDest.setJoint(valueObjectSrc.getJoint());
		// Bone
		valueObjectDest.setBone(valueObjectSrc.getBone());
		// Laterality
		valueObjectDest.setLaterality(valueObjectSrc.getLaterality());
		// GeneralFindingsBone
		valueObjectDest.setGeneralFindingsBone(valueObjectSrc.getGeneralFindingsBone());
		// GeneralFindingsJoint
		valueObjectDest.setGeneralFindingsJoint(valueObjectSrc.getGeneralFindingsJoint());
		// LigamentsTests
		valueObjectDest.setLigamentsTests(valueObjectSrc.getLigamentsTests());
		// Interpretation
		valueObjectDest.setInterpretation(valueObjectSrc.getInterpretation());
		// SelectedMovements
		valueObjectDest.setSelectedMovements(valueObjectSrc.getSelectedMovements());
		// isProblem
		valueObjectDest.setIsProblem(valueObjectSrc.getIsProblem());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createMskExamJointBonesDetailVoCollectionFromMSkExamJointBonesDetail(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.medical.domain.objects.MSkExamJointBonesDetail objects.
	 */
	public static ims.generalmedical.vo.MskExamJointBonesDetailVoCollection createMskExamJointBonesDetailVoCollectionFromMSkExamJointBonesDetail(java.util.Set domainObjectSet)	
	{
		return createMskExamJointBonesDetailVoCollectionFromMSkExamJointBonesDetail(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.medical.domain.objects.MSkExamJointBonesDetail objects.
	 */
	public static ims.generalmedical.vo.MskExamJointBonesDetailVoCollection createMskExamJointBonesDetailVoCollectionFromMSkExamJointBonesDetail(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.generalmedical.vo.MskExamJointBonesDetailVoCollection voList = new ims.generalmedical.vo.MskExamJointBonesDetailVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.medical.domain.objects.MSkExamJointBonesDetail domainObject = (ims.medical.domain.objects.MSkExamJointBonesDetail) iterator.next();
			ims.generalmedical.vo.MskExamJointBonesDetailVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.medical.domain.objects.MSkExamJointBonesDetail objects.
	 */
	public static ims.generalmedical.vo.MskExamJointBonesDetailVoCollection createMskExamJointBonesDetailVoCollectionFromMSkExamJointBonesDetail(java.util.List domainObjectList) 
	{
		return createMskExamJointBonesDetailVoCollectionFromMSkExamJointBonesDetail(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.medical.domain.objects.MSkExamJointBonesDetail objects.
	 */
	public static ims.generalmedical.vo.MskExamJointBonesDetailVoCollection createMskExamJointBonesDetailVoCollectionFromMSkExamJointBonesDetail(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.generalmedical.vo.MskExamJointBonesDetailVoCollection voList = new ims.generalmedical.vo.MskExamJointBonesDetailVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.medical.domain.objects.MSkExamJointBonesDetail domainObject = (ims.medical.domain.objects.MSkExamJointBonesDetail) domainObjectList.get(i);
			ims.generalmedical.vo.MskExamJointBonesDetailVo vo = create(map, domainObject);

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
	 * Create the ims.medical.domain.objects.MSkExamJointBonesDetail set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractMSkExamJointBonesDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.MskExamJointBonesDetailVoCollection voCollection) 
	 {
	 	return extractMSkExamJointBonesDetailSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractMSkExamJointBonesDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.MskExamJointBonesDetailVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.generalmedical.vo.MskExamJointBonesDetailVo vo = voCollection.get(i);
			ims.medical.domain.objects.MSkExamJointBonesDetail domainObject = MskExamJointBonesDetailVoAssembler.extractMSkExamJointBonesDetail(domainFactory, vo, domMap);

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
	 * Create the ims.medical.domain.objects.MSkExamJointBonesDetail list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractMSkExamJointBonesDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.MskExamJointBonesDetailVoCollection voCollection) 
	 {
	 	return extractMSkExamJointBonesDetailList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractMSkExamJointBonesDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.MskExamJointBonesDetailVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.generalmedical.vo.MskExamJointBonesDetailVo vo = voCollection.get(i);
			ims.medical.domain.objects.MSkExamJointBonesDetail domainObject = MskExamJointBonesDetailVoAssembler.extractMSkExamJointBonesDetail(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.medical.domain.objects.MSkExamJointBonesDetail object.
	 * @param domainObject ims.medical.domain.objects.MSkExamJointBonesDetail
	 */
	 public static ims.generalmedical.vo.MskExamJointBonesDetailVo create(ims.medical.domain.objects.MSkExamJointBonesDetail domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.medical.domain.objects.MSkExamJointBonesDetail object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.generalmedical.vo.MskExamJointBonesDetailVo create(DomainObjectMap map, ims.medical.domain.objects.MSkExamJointBonesDetail domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.generalmedical.vo.MskExamJointBonesDetailVo valueObject = (ims.generalmedical.vo.MskExamJointBonesDetailVo) map.getValueObject(domainObject, ims.generalmedical.vo.MskExamJointBonesDetailVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.generalmedical.vo.MskExamJointBonesDetailVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.medical.domain.objects.MSkExamJointBonesDetail
	 */
	 public static ims.generalmedical.vo.MskExamJointBonesDetailVo insert(ims.generalmedical.vo.MskExamJointBonesDetailVo valueObject, ims.medical.domain.objects.MSkExamJointBonesDetail domainObject) 
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
	 * @param domainObject ims.medical.domain.objects.MSkExamJointBonesDetail
	 */
	 public static ims.generalmedical.vo.MskExamJointBonesDetailVo insert(DomainObjectMap map, ims.generalmedical.vo.MskExamJointBonesDetailVo valueObject, ims.medical.domain.objects.MSkExamJointBonesDetail domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_MSkExamJointBonesDetail(domainObject.getId());
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
			
		// Group
		valueObject.setGroup(ims.core.vo.domain.MskGroupVoAssembler.create(map, domainObject.getGroup()) );
		// isJoint
		valueObject.setIsJoint( domainObject.isIsJoint() );
		// Joint
		valueObject.setJoint(ims.core.vo.domain.MskJointVoAssembler.create(map, domainObject.getJoint()) );
		// Bone
		ims.domain.lookups.LookupInstance instance4 = domainObject.getBone();
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

			ims.spinalinjuries.vo.lookups.MskBones voLookup4 = new ims.spinalinjuries.vo.lookups.MskBones(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.MskBones parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.spinalinjuries.vo.lookups.MskBones(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setBone(voLookup4);
		}
				// Laterality
		ims.domain.lookups.LookupInstance instance5 = domainObject.getLaterality();
		if ( null != instance5 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance5.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance5.getImage().getImageId(), instance5.getImage().getImagePath());
			}
			color = instance5.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.LateralityLRonly voLookup5 = new ims.core.vo.lookups.LateralityLRonly(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.LateralityLRonly parentVoLookup5 = voLookup5;
			ims.domain.lookups.LookupInstance parent5 = instance5.getParent();
			while (parent5 != null)
			{
				if (parent5.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent5.getImage().getImageId(), parent5.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent5.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup5.setParent(new ims.core.vo.lookups.LateralityLRonly(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setLaterality(voLookup5);
		}
				// GeneralFindingsBone
		java.util.List listGeneralFindingsBone = domainObject.getGeneralFindingsBone();
		ims.spinalinjuries.vo.lookups.GeneralFindingsBoneCollection GeneralFindingsBone = new ims.spinalinjuries.vo.lookups.GeneralFindingsBoneCollection();
		for(java.util.Iterator iterator = listGeneralFindingsBone.iterator(); iterator.hasNext(); ) 
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
			GeneralFindingsBone.add(voInstance);
		}
		valueObject.setGeneralFindingsBone( GeneralFindingsBone );
		// GeneralFindingsJoint
		java.util.List listGeneralFindingsJoint = domainObject.getGeneralFindingsJoint();
		ims.spinalinjuries.vo.lookups.GeneralFindingsJointCollection GeneralFindingsJoint = new ims.spinalinjuries.vo.lookups.GeneralFindingsJointCollection();
		for(java.util.Iterator iterator = listGeneralFindingsJoint.iterator(); iterator.hasNext(); ) 
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
			GeneralFindingsJoint.add(voInstance);
		}
		valueObject.setGeneralFindingsJoint( GeneralFindingsJoint );
		// LigamentsTests
		valueObject.setLigamentsTests(domainObject.getLigamentsTests());
		// Interpretation
		valueObject.setInterpretation(domainObject.getInterpretation());
		// SelectedMovements
		valueObject.setSelectedMovements(ims.core.vo.domain.MskJointMovementVoAssembler.createMskJointMovementVoCollectionFromMskJointMovement(map, domainObject.getSelectedMovements()) );
		// isProblem
		valueObject.setIsProblem( domainObject.isIsProblem() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.medical.domain.objects.MSkExamJointBonesDetail extractMSkExamJointBonesDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.MskExamJointBonesDetailVo valueObject) 
	{
		return 	extractMSkExamJointBonesDetail(domainFactory, valueObject, new HashMap());
	}

	public static ims.medical.domain.objects.MSkExamJointBonesDetail extractMSkExamJointBonesDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.MskExamJointBonesDetailVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_MSkExamJointBonesDetail();
		ims.medical.domain.objects.MSkExamJointBonesDetail domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.medical.domain.objects.MSkExamJointBonesDetail)domMap.get(valueObject);
			}
			// ims.generalmedical.vo.MskExamJointBonesDetailVo ID_MSkExamJointBonesDetail field is unknown
			domainObject = new ims.medical.domain.objects.MSkExamJointBonesDetail();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_MSkExamJointBonesDetail());
			if (domMap.get(key) != null)
			{
				return (ims.medical.domain.objects.MSkExamJointBonesDetail)domMap.get(key);
			}
			domainObject = (ims.medical.domain.objects.MSkExamJointBonesDetail) domainFactory.getDomainObject(ims.medical.domain.objects.MSkExamJointBonesDetail.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_MSkExamJointBonesDetail());

		domainObject.setGroup(ims.core.vo.domain.MskGroupVoAssembler.extractMskGroups(domainFactory, valueObject.getGroup(), domMap));
		domainObject.setIsJoint(valueObject.getIsJoint());
		domainObject.setJoint(ims.core.vo.domain.MskJointVoAssembler.extractMskJoints(domainFactory, valueObject.getJoint(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getBone() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getBone().getID());
		}
		domainObject.setBone(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getLaterality() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getLaterality().getID());
		}
		domainObject.setLaterality(value5);
		ims.spinalinjuries.vo.lookups.GeneralFindingsBoneCollection collection6 =
	valueObject.getGeneralFindingsBone();
	    java.util.List domainGeneralFindingsBone = domainObject.getGeneralFindingsBone();;			
	    int collection6Size=0;
		if (collection6 == null)
		{
			domainGeneralFindingsBone = new java.util.ArrayList(0);
		}
		else
		{
			collection6Size = collection6.size();
		}
		
		for(int i=0; i<collection6Size; i++) 
		{
			int instanceId = collection6.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainGeneralFindingsBone.indexOf(dom);
			if (domIdx == -1)
			{
				domainGeneralFindingsBone.add(i, dom);
			}
			else if (i != domIdx && i < domainGeneralFindingsBone.size())
			{
				Object tmp = domainGeneralFindingsBone.get(i);
				domainGeneralFindingsBone.set(i, domainGeneralFindingsBone.get(domIdx));
				domainGeneralFindingsBone.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j6 = domainGeneralFindingsBone.size();
		while (j6 > collection6Size)
		{
			domainGeneralFindingsBone.remove(j6-1);
			j6 = domainGeneralFindingsBone.size();
		}

		domainObject.setGeneralFindingsBone(domainGeneralFindingsBone);		
		ims.spinalinjuries.vo.lookups.GeneralFindingsJointCollection collection7 =
	valueObject.getGeneralFindingsJoint();
	    java.util.List domainGeneralFindingsJoint = domainObject.getGeneralFindingsJoint();;			
	    int collection7Size=0;
		if (collection7 == null)
		{
			domainGeneralFindingsJoint = new java.util.ArrayList(0);
		}
		else
		{
			collection7Size = collection7.size();
		}
		
		for(int i=0; i<collection7Size; i++) 
		{
			int instanceId = collection7.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainGeneralFindingsJoint.indexOf(dom);
			if (domIdx == -1)
			{
				domainGeneralFindingsJoint.add(i, dom);
			}
			else if (i != domIdx && i < domainGeneralFindingsJoint.size())
			{
				Object tmp = domainGeneralFindingsJoint.get(i);
				domainGeneralFindingsJoint.set(i, domainGeneralFindingsJoint.get(domIdx));
				domainGeneralFindingsJoint.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j7 = domainGeneralFindingsJoint.size();
		while (j7 > collection7Size)
		{
			domainGeneralFindingsJoint.remove(j7-1);
			j7 = domainGeneralFindingsJoint.size();
		}

		domainObject.setGeneralFindingsJoint(domainGeneralFindingsJoint);		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLigamentsTests() != null && valueObject.getLigamentsTests().equals(""))
		{
			valueObject.setLigamentsTests(null);
		}
		domainObject.setLigamentsTests(valueObject.getLigamentsTests());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getInterpretation() != null && valueObject.getInterpretation().equals(""))
		{
			valueObject.setInterpretation(null);
		}
		domainObject.setInterpretation(valueObject.getInterpretation());
		domainObject.setSelectedMovements(ims.core.vo.domain.MskJointMovementVoAssembler.extractMskJointMovementSet(domainFactory, valueObject.getSelectedMovements(), domainObject.getSelectedMovements(), domMap));		
		domainObject.setIsProblem(valueObject.getIsProblem());

		return domainObject;
	}

}
