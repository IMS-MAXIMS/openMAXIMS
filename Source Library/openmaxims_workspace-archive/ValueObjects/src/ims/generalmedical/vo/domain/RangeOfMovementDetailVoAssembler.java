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
 * @author Dara Hickey
 */
public class RangeOfMovementDetailVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.generalmedical.vo.RangeOfMovementDetailVo copy(ims.generalmedical.vo.RangeOfMovementDetailVo valueObjectDest, ims.generalmedical.vo.RangeOfMovementDetailVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_MSkExamJointBonesDetail(valueObjectSrc.getID_MSkExamJointBonesDetail());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Joint
		valueObjectDest.setJoint(valueObjectSrc.getJoint());
		// SelectedMovements
		valueObjectDest.setSelectedMovements(valueObjectSrc.getSelectedMovements());
		// Laterality
		valueObjectDest.setLaterality(valueObjectSrc.getLaterality());
		// Group
		valueObjectDest.setGroup(valueObjectSrc.getGroup());
		// isJoint
		valueObjectDest.setIsJoint(valueObjectSrc.getIsJoint());
		// SysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createRangeOfMovementDetailVoCollectionFromMSkExamJointBonesDetail(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.medical.domain.objects.MSkExamJointBonesDetail objects.
	 */
	public static ims.generalmedical.vo.RangeOfMovementDetailVoCollection createRangeOfMovementDetailVoCollectionFromMSkExamJointBonesDetail(java.util.Set domainObjectSet)	
	{
		return createRangeOfMovementDetailVoCollectionFromMSkExamJointBonesDetail(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.medical.domain.objects.MSkExamJointBonesDetail objects.
	 */
	public static ims.generalmedical.vo.RangeOfMovementDetailVoCollection createRangeOfMovementDetailVoCollectionFromMSkExamJointBonesDetail(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.generalmedical.vo.RangeOfMovementDetailVoCollection voList = new ims.generalmedical.vo.RangeOfMovementDetailVoCollection();
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
			ims.generalmedical.vo.RangeOfMovementDetailVo vo = create(map, domainObject);
			
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
	public static ims.generalmedical.vo.RangeOfMovementDetailVoCollection createRangeOfMovementDetailVoCollectionFromMSkExamJointBonesDetail(java.util.List domainObjectList) 
	{
		return createRangeOfMovementDetailVoCollectionFromMSkExamJointBonesDetail(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.medical.domain.objects.MSkExamJointBonesDetail objects.
	 */
	public static ims.generalmedical.vo.RangeOfMovementDetailVoCollection createRangeOfMovementDetailVoCollectionFromMSkExamJointBonesDetail(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.generalmedical.vo.RangeOfMovementDetailVoCollection voList = new ims.generalmedical.vo.RangeOfMovementDetailVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.medical.domain.objects.MSkExamJointBonesDetail domainObject = (ims.medical.domain.objects.MSkExamJointBonesDetail) domainObjectList.get(i);
			ims.generalmedical.vo.RangeOfMovementDetailVo vo = create(map, domainObject);

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
	 public static java.util.Set extractMSkExamJointBonesDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.RangeOfMovementDetailVoCollection voCollection) 
	 {
	 	return extractMSkExamJointBonesDetailSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractMSkExamJointBonesDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.RangeOfMovementDetailVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.generalmedical.vo.RangeOfMovementDetailVo vo = voCollection.get(i);
			ims.medical.domain.objects.MSkExamJointBonesDetail domainObject = RangeOfMovementDetailVoAssembler.extractMSkExamJointBonesDetail(domainFactory, vo, domMap);

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
	 public static java.util.List extractMSkExamJointBonesDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.RangeOfMovementDetailVoCollection voCollection) 
	 {
	 	return extractMSkExamJointBonesDetailList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractMSkExamJointBonesDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.RangeOfMovementDetailVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.generalmedical.vo.RangeOfMovementDetailVo vo = voCollection.get(i);
			ims.medical.domain.objects.MSkExamJointBonesDetail domainObject = RangeOfMovementDetailVoAssembler.extractMSkExamJointBonesDetail(domainFactory, vo, domMap);

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
	 public static ims.generalmedical.vo.RangeOfMovementDetailVo create(ims.medical.domain.objects.MSkExamJointBonesDetail domainObject) 
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
	  public static ims.generalmedical.vo.RangeOfMovementDetailVo create(DomainObjectMap map, ims.medical.domain.objects.MSkExamJointBonesDetail domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.generalmedical.vo.RangeOfMovementDetailVo valueObject = (ims.generalmedical.vo.RangeOfMovementDetailVo) map.getValueObject(domainObject, ims.generalmedical.vo.RangeOfMovementDetailVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.generalmedical.vo.RangeOfMovementDetailVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.generalmedical.vo.RangeOfMovementDetailVo insert(ims.generalmedical.vo.RangeOfMovementDetailVo valueObject, ims.medical.domain.objects.MSkExamJointBonesDetail domainObject) 
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
	 public static ims.generalmedical.vo.RangeOfMovementDetailVo insert(DomainObjectMap map, ims.generalmedical.vo.RangeOfMovementDetailVo valueObject, ims.medical.domain.objects.MSkExamJointBonesDetail domainObject) 
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
			
		// Joint
		valueObject.setJoint(ims.core.vo.domain.MskJointVoAssembler.create(map, domainObject.getJoint()) );
		// SelectedMovements
		valueObject.setSelectedMovements(ims.core.vo.domain.MskJointMovementVoAssembler.createMskJointMovementVoCollectionFromMskJointMovement(map, domainObject.getSelectedMovements()) );
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
				// Group
		valueObject.setGroup(ims.core.vo.domain.MskGroupLiteVoAssembler.create(map, domainObject.getGroup()) );
		// isJoint
		valueObject.setIsJoint( domainObject.isIsJoint() );
		// SysInfo
		// set system information
		valueObject.setSysInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.medical.domain.objects.MSkExamJointBonesDetail extractMSkExamJointBonesDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.RangeOfMovementDetailVo valueObject) 
	{
		return 	extractMSkExamJointBonesDetail(domainFactory, valueObject, new HashMap());
	}

	public static ims.medical.domain.objects.MSkExamJointBonesDetail extractMSkExamJointBonesDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.RangeOfMovementDetailVo valueObject, HashMap domMap) 
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
			// ims.generalmedical.vo.RangeOfMovementDetailVo ID_MSkExamJointBonesDetail field is unknown
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

		domainObject.setJoint(ims.core.vo.domain.MskJointVoAssembler.extractMskJoints(domainFactory, valueObject.getJoint(), domMap));
		domainObject.setSelectedMovements(ims.core.vo.domain.MskJointMovementVoAssembler.extractMskJointMovementSet(domainFactory, valueObject.getSelectedMovements(), domainObject.getSelectedMovements(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getLaterality() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getLaterality().getID());
		}
		domainObject.setLaterality(value3);
		domainObject.setGroup(ims.core.vo.domain.MskGroupLiteVoAssembler.extractMskGroups(domainFactory, valueObject.getGroup(), domMap));
		domainObject.setIsJoint(valueObject.getIsJoint());

		return domainObject;
	}

}
