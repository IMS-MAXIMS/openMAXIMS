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
 * @author Billy Mahon
 */
public class FunctionalTransfersTechniqueVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.therapies.vo.FunctionalTransfersTechniqueVo copy(ims.therapies.vo.FunctionalTransfersTechniqueVo valueObjectDest, ims.therapies.vo.FunctionalTransfersTechniqueVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_FunctionalTransfersTechnique(valueObjectSrc.getID_FunctionalTransfersTechnique());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// StartPosition
		valueObjectDest.setStartPosition(valueObjectSrc.getStartPosition());
		// StartHeight
		valueObjectDest.setStartHeight(valueObjectSrc.getStartHeight());
		// StartTarget
		valueObjectDest.setStartTarget(valueObjectSrc.getStartTarget());
		// FinishPosition
		valueObjectDest.setFinishPosition(valueObjectSrc.getFinishPosition());
		// FinishHeight
		valueObjectDest.setFinishHeight(valueObjectSrc.getFinishHeight());
		// FinishTarget
		valueObjectDest.setFinishTarget(valueObjectSrc.getFinishTarget());
		// FIMScore
		valueObjectDest.setFIMScore(valueObjectSrc.getFIMScore());
		// Risk
		valueObjectDest.setRisk(valueObjectSrc.getRisk());
		// Equipment
		valueObjectDest.setEquipment(valueObjectSrc.getEquipment());
		// Technique
		valueObjectDest.setTechnique(valueObjectSrc.getTechnique());
		// SysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createFunctionalTransfersTechniqueVoCollectionFromFunctionalTransfersTechnique(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.therapies.treatment.domain.objects.FunctionalTransfersTechnique objects.
	 */
	public static ims.therapies.vo.FunctionalTransfersTechniqueVoCollection createFunctionalTransfersTechniqueVoCollectionFromFunctionalTransfersTechnique(java.util.Set domainObjectSet)	
	{
		return createFunctionalTransfersTechniqueVoCollectionFromFunctionalTransfersTechnique(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.therapies.treatment.domain.objects.FunctionalTransfersTechnique objects.
	 */
	public static ims.therapies.vo.FunctionalTransfersTechniqueVoCollection createFunctionalTransfersTechniqueVoCollectionFromFunctionalTransfersTechnique(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.therapies.vo.FunctionalTransfersTechniqueVoCollection voList = new ims.therapies.vo.FunctionalTransfersTechniqueVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.therapies.treatment.domain.objects.FunctionalTransfersTechnique domainObject = (ims.therapies.treatment.domain.objects.FunctionalTransfersTechnique) iterator.next();
			ims.therapies.vo.FunctionalTransfersTechniqueVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.therapies.treatment.domain.objects.FunctionalTransfersTechnique objects.
	 */
	public static ims.therapies.vo.FunctionalTransfersTechniqueVoCollection createFunctionalTransfersTechniqueVoCollectionFromFunctionalTransfersTechnique(java.util.List domainObjectList) 
	{
		return createFunctionalTransfersTechniqueVoCollectionFromFunctionalTransfersTechnique(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.therapies.treatment.domain.objects.FunctionalTransfersTechnique objects.
	 */
	public static ims.therapies.vo.FunctionalTransfersTechniqueVoCollection createFunctionalTransfersTechniqueVoCollectionFromFunctionalTransfersTechnique(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.therapies.vo.FunctionalTransfersTechniqueVoCollection voList = new ims.therapies.vo.FunctionalTransfersTechniqueVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.therapies.treatment.domain.objects.FunctionalTransfersTechnique domainObject = (ims.therapies.treatment.domain.objects.FunctionalTransfersTechnique) domainObjectList.get(i);
			ims.therapies.vo.FunctionalTransfersTechniqueVo vo = create(map, domainObject);

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
	 * Create the ims.therapies.treatment.domain.objects.FunctionalTransfersTechnique set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractFunctionalTransfersTechniqueSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.FunctionalTransfersTechniqueVoCollection voCollection) 
	 {
	 	return extractFunctionalTransfersTechniqueSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractFunctionalTransfersTechniqueSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.FunctionalTransfersTechniqueVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.FunctionalTransfersTechniqueVo vo = voCollection.get(i);
			ims.therapies.treatment.domain.objects.FunctionalTransfersTechnique domainObject = FunctionalTransfersTechniqueVoAssembler.extractFunctionalTransfersTechnique(domainFactory, vo, domMap);

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
	 * Create the ims.therapies.treatment.domain.objects.FunctionalTransfersTechnique list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractFunctionalTransfersTechniqueList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.FunctionalTransfersTechniqueVoCollection voCollection) 
	 {
	 	return extractFunctionalTransfersTechniqueList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractFunctionalTransfersTechniqueList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.FunctionalTransfersTechniqueVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.FunctionalTransfersTechniqueVo vo = voCollection.get(i);
			ims.therapies.treatment.domain.objects.FunctionalTransfersTechnique domainObject = FunctionalTransfersTechniqueVoAssembler.extractFunctionalTransfersTechnique(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.therapies.treatment.domain.objects.FunctionalTransfersTechnique object.
	 * @param domainObject ims.therapies.treatment.domain.objects.FunctionalTransfersTechnique
	 */
	 public static ims.therapies.vo.FunctionalTransfersTechniqueVo create(ims.therapies.treatment.domain.objects.FunctionalTransfersTechnique domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.therapies.treatment.domain.objects.FunctionalTransfersTechnique object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.therapies.vo.FunctionalTransfersTechniqueVo create(DomainObjectMap map, ims.therapies.treatment.domain.objects.FunctionalTransfersTechnique domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.therapies.vo.FunctionalTransfersTechniqueVo valueObject = (ims.therapies.vo.FunctionalTransfersTechniqueVo) map.getValueObject(domainObject, ims.therapies.vo.FunctionalTransfersTechniqueVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.therapies.vo.FunctionalTransfersTechniqueVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.therapies.treatment.domain.objects.FunctionalTransfersTechnique
	 */
	 public static ims.therapies.vo.FunctionalTransfersTechniqueVo insert(ims.therapies.vo.FunctionalTransfersTechniqueVo valueObject, ims.therapies.treatment.domain.objects.FunctionalTransfersTechnique domainObject) 
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
	 * @param domainObject ims.therapies.treatment.domain.objects.FunctionalTransfersTechnique
	 */
	 public static ims.therapies.vo.FunctionalTransfersTechniqueVo insert(DomainObjectMap map, ims.therapies.vo.FunctionalTransfersTechniqueVo valueObject, ims.therapies.treatment.domain.objects.FunctionalTransfersTechnique domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_FunctionalTransfersTechnique(domainObject.getId());
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
			
		// StartPosition
		ims.domain.lookups.LookupInstance instance1 = domainObject.getStartPosition();
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

			ims.spinalinjuries.vo.lookups.FunctionalTransferPosition voLookup1 = new ims.spinalinjuries.vo.lookups.FunctionalTransferPosition(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.FunctionalTransferPosition parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.spinalinjuries.vo.lookups.FunctionalTransferPosition(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setStartPosition(voLookup1);
		}
				// StartHeight
		valueObject.setStartHeight(domainObject.getStartHeight());
		// StartTarget
		valueObject.setStartTarget(domainObject.getStartTarget());
		// FinishPosition
		ims.domain.lookups.LookupInstance instance4 = domainObject.getFinishPosition();
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

			ims.spinalinjuries.vo.lookups.FunctionalTransferPosition voLookup4 = new ims.spinalinjuries.vo.lookups.FunctionalTransferPosition(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.FunctionalTransferPosition parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.spinalinjuries.vo.lookups.FunctionalTransferPosition(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setFinishPosition(voLookup4);
		}
				// FinishHeight
		valueObject.setFinishHeight(domainObject.getFinishHeight());
		// FinishTarget
		valueObject.setFinishTarget(domainObject.getFinishTarget());
		// FIMScore
		valueObject.setFIMScore(domainObject.getFIMScore());
		// Risk
		ims.domain.lookups.LookupInstance instance8 = domainObject.getRisk();
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

			ims.spinalinjuries.vo.lookups.FunctionalTransferRisk voLookup8 = new ims.spinalinjuries.vo.lookups.FunctionalTransferRisk(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.FunctionalTransferRisk parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.spinalinjuries.vo.lookups.FunctionalTransferRisk(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setRisk(voLookup8);
		}
				// Equipment
		java.util.List listEquipment = domainObject.getEquipment();
		ims.spinalinjuries.vo.lookups.FunctionalTransferEquipmentCollection Equipment = new ims.spinalinjuries.vo.lookups.FunctionalTransferEquipmentCollection();
		for(java.util.Iterator iterator = listEquipment.iterator(); iterator.hasNext(); ) 
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
			ims.spinalinjuries.vo.lookups.FunctionalTransferEquipment voInstance = new ims.spinalinjuries.vo.lookups.FunctionalTransferEquipment(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.FunctionalTransferEquipment parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.spinalinjuries.vo.lookups.FunctionalTransferEquipment(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			Equipment.add(voInstance);
		}
		valueObject.setEquipment( Equipment );
		// Technique
		java.util.List listTechnique = domainObject.getTechnique();
		ims.spinalinjuries.vo.lookups.FunctionalTransferTechniqueCollection Technique = new ims.spinalinjuries.vo.lookups.FunctionalTransferTechniqueCollection();
		for(java.util.Iterator iterator = listTechnique.iterator(); iterator.hasNext(); ) 
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
			ims.spinalinjuries.vo.lookups.FunctionalTransferTechnique voInstance = new ims.spinalinjuries.vo.lookups.FunctionalTransferTechnique(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.FunctionalTransferTechnique parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.spinalinjuries.vo.lookups.FunctionalTransferTechnique(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			Technique.add(voInstance);
		}
		valueObject.setTechnique( Technique );
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
	public static ims.therapies.treatment.domain.objects.FunctionalTransfersTechnique extractFunctionalTransfersTechnique(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.FunctionalTransfersTechniqueVo valueObject) 
	{
		return 	extractFunctionalTransfersTechnique(domainFactory, valueObject, new HashMap());
	}

	public static ims.therapies.treatment.domain.objects.FunctionalTransfersTechnique extractFunctionalTransfersTechnique(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.FunctionalTransfersTechniqueVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_FunctionalTransfersTechnique();
		ims.therapies.treatment.domain.objects.FunctionalTransfersTechnique domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.therapies.treatment.domain.objects.FunctionalTransfersTechnique)domMap.get(valueObject);
			}
			// ims.therapies.vo.FunctionalTransfersTechniqueVo ID_FunctionalTransfersTechnique field is unknown
			domainObject = new ims.therapies.treatment.domain.objects.FunctionalTransfersTechnique();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_FunctionalTransfersTechnique());
			if (domMap.get(key) != null)
			{
				return (ims.therapies.treatment.domain.objects.FunctionalTransfersTechnique)domMap.get(key);
			}
			domainObject = (ims.therapies.treatment.domain.objects.FunctionalTransfersTechnique) domainFactory.getDomainObject(ims.therapies.treatment.domain.objects.FunctionalTransfersTechnique.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_FunctionalTransfersTechnique());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getStartPosition() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getStartPosition().getID());
		}
		domainObject.setStartPosition(value1);
		domainObject.setStartHeight(valueObject.getStartHeight());
		domainObject.setStartTarget(valueObject.getStartTarget());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getFinishPosition() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getFinishPosition().getID());
		}
		domainObject.setFinishPosition(value4);
		domainObject.setFinishHeight(valueObject.getFinishHeight());
		domainObject.setFinishTarget(valueObject.getFinishTarget());
		domainObject.setFIMScore(valueObject.getFIMScore());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getRisk() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getRisk().getID());
		}
		domainObject.setRisk(value8);
		ims.spinalinjuries.vo.lookups.FunctionalTransferEquipmentCollection collection9 =
	valueObject.getEquipment();
	    java.util.List domainEquipment = domainObject.getEquipment();;			
	    int collection9Size=0;
		if (collection9 == null)
		{
			domainEquipment = new java.util.ArrayList(0);
		}
		else
		{
			collection9Size = collection9.size();
		}
		
		for(int i=0; i<collection9Size; i++) 
		{
			int instanceId = collection9.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainEquipment.indexOf(dom);
			if (domIdx == -1)
			{
				domainEquipment.add(i, dom);
			}
			else if (i != domIdx && i < domainEquipment.size())
			{
				Object tmp = domainEquipment.get(i);
				domainEquipment.set(i, domainEquipment.get(domIdx));
				domainEquipment.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j9 = domainEquipment.size();
		while (j9 > collection9Size)
		{
			domainEquipment.remove(j9-1);
			j9 = domainEquipment.size();
		}

		domainObject.setEquipment(domainEquipment);		
		ims.spinalinjuries.vo.lookups.FunctionalTransferTechniqueCollection collection10 =
	valueObject.getTechnique();
	    java.util.List domainTechnique = domainObject.getTechnique();;			
	    int collection10Size=0;
		if (collection10 == null)
		{
			domainTechnique = new java.util.ArrayList(0);
		}
		else
		{
			collection10Size = collection10.size();
		}
		
		for(int i=0; i<collection10Size; i++) 
		{
			int instanceId = collection10.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainTechnique.indexOf(dom);
			if (domIdx == -1)
			{
				domainTechnique.add(i, dom);
			}
			else if (i != domIdx && i < domainTechnique.size())
			{
				Object tmp = domainTechnique.get(i);
				domainTechnique.set(i, domainTechnique.get(domIdx));
				domainTechnique.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j10 = domainTechnique.size();
		while (j10 > collection10Size)
		{
			domainTechnique.remove(j10-1);
			j10 = domainTechnique.size();
		}

		domainObject.setTechnique(domainTechnique);		

		return domainObject;
	}

}
