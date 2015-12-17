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
 * @author Charlotte Murphy
 */
public class HydrotherapyVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.therapies.vo.HydrotherapyVo copy(ims.therapies.vo.HydrotherapyVo valueObjectDest, ims.therapies.vo.HydrotherapyVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Hydrotherapy(valueObjectSrc.getID_Hydrotherapy());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// AuthoringCP
		valueObjectDest.setAuthoringCP(valueObjectSrc.getAuthoringCP());
		// AuthoringDateTime
		valueObjectDest.setAuthoringDateTime(valueObjectSrc.getAuthoringDateTime());
		// LevelOfAssistance
		valueObjectDest.setLevelOfAssistance(valueObjectSrc.getLevelOfAssistance());
		// TransferIn
		valueObjectDest.setTransferIn(valueObjectSrc.getTransferIn());
		// TransferOut
		valueObjectDest.setTransferOut(valueObjectSrc.getTransferOut());
		// Comment
		valueObjectDest.setComment(valueObjectSrc.getComment());
		// Modalities
		valueObjectDest.setModalities(valueObjectSrc.getModalities());
		// Equipment
		valueObjectDest.setEquipment(valueObjectSrc.getEquipment());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createHydrotherapyVoCollectionFromHydrotherapy(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.therapies.treatment.domain.objects.Hydrotherapy objects.
	 */
	public static ims.therapies.vo.HydrotherapyVoCollection createHydrotherapyVoCollectionFromHydrotherapy(java.util.Set domainObjectSet)	
	{
		return createHydrotherapyVoCollectionFromHydrotherapy(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.therapies.treatment.domain.objects.Hydrotherapy objects.
	 */
	public static ims.therapies.vo.HydrotherapyVoCollection createHydrotherapyVoCollectionFromHydrotherapy(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.therapies.vo.HydrotherapyVoCollection voList = new ims.therapies.vo.HydrotherapyVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.therapies.treatment.domain.objects.Hydrotherapy domainObject = (ims.therapies.treatment.domain.objects.Hydrotherapy) iterator.next();
			ims.therapies.vo.HydrotherapyVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.therapies.treatment.domain.objects.Hydrotherapy objects.
	 */
	public static ims.therapies.vo.HydrotherapyVoCollection createHydrotherapyVoCollectionFromHydrotherapy(java.util.List domainObjectList) 
	{
		return createHydrotherapyVoCollectionFromHydrotherapy(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.therapies.treatment.domain.objects.Hydrotherapy objects.
	 */
	public static ims.therapies.vo.HydrotherapyVoCollection createHydrotherapyVoCollectionFromHydrotherapy(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.therapies.vo.HydrotherapyVoCollection voList = new ims.therapies.vo.HydrotherapyVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.therapies.treatment.domain.objects.Hydrotherapy domainObject = (ims.therapies.treatment.domain.objects.Hydrotherapy) domainObjectList.get(i);
			ims.therapies.vo.HydrotherapyVo vo = create(map, domainObject);

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
	 * Create the ims.therapies.treatment.domain.objects.Hydrotherapy set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractHydrotherapySet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.HydrotherapyVoCollection voCollection) 
	 {
	 	return extractHydrotherapySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractHydrotherapySet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.HydrotherapyVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.HydrotherapyVo vo = voCollection.get(i);
			ims.therapies.treatment.domain.objects.Hydrotherapy domainObject = HydrotherapyVoAssembler.extractHydrotherapy(domainFactory, vo, domMap);

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
	 * Create the ims.therapies.treatment.domain.objects.Hydrotherapy list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractHydrotherapyList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.HydrotherapyVoCollection voCollection) 
	 {
	 	return extractHydrotherapyList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractHydrotherapyList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.HydrotherapyVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.HydrotherapyVo vo = voCollection.get(i);
			ims.therapies.treatment.domain.objects.Hydrotherapy domainObject = HydrotherapyVoAssembler.extractHydrotherapy(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.therapies.treatment.domain.objects.Hydrotherapy object.
	 * @param domainObject ims.therapies.treatment.domain.objects.Hydrotherapy
	 */
	 public static ims.therapies.vo.HydrotherapyVo create(ims.therapies.treatment.domain.objects.Hydrotherapy domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.therapies.treatment.domain.objects.Hydrotherapy object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.therapies.vo.HydrotherapyVo create(DomainObjectMap map, ims.therapies.treatment.domain.objects.Hydrotherapy domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.therapies.vo.HydrotherapyVo valueObject = (ims.therapies.vo.HydrotherapyVo) map.getValueObject(domainObject, ims.therapies.vo.HydrotherapyVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.therapies.vo.HydrotherapyVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.therapies.treatment.domain.objects.Hydrotherapy
	 */
	 public static ims.therapies.vo.HydrotherapyVo insert(ims.therapies.vo.HydrotherapyVo valueObject, ims.therapies.treatment.domain.objects.Hydrotherapy domainObject) 
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
	 * @param domainObject ims.therapies.treatment.domain.objects.Hydrotherapy
	 */
	 public static ims.therapies.vo.HydrotherapyVo insert(DomainObjectMap map, ims.therapies.vo.HydrotherapyVo valueObject, ims.therapies.treatment.domain.objects.Hydrotherapy domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Hydrotherapy(domainObject.getId());
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
			
		// ClinicalContact
		valueObject.setClinicalContact(ims.core.vo.domain.ClinicalContactShortVoAssembler.create(map, domainObject.getClinicalContact()) );
		// AuthoringCP
		valueObject.setAuthoringCP(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getAuthoringCP()) );
		// AuthoringDateTime
		java.util.Date AuthoringDateTime = domainObject.getAuthoringDateTime();
		if ( null != AuthoringDateTime ) 
		{
			valueObject.setAuthoringDateTime(new ims.framework.utils.DateTime(AuthoringDateTime) );
		}
		// LevelOfAssistance
		ims.domain.lookups.LookupInstance instance4 = domainObject.getLevelOfAssistance();
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

			ims.spinalinjuries.vo.lookups.HydrotherapyLevelOfAssistance voLookup4 = new ims.spinalinjuries.vo.lookups.HydrotherapyLevelOfAssistance(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.HydrotherapyLevelOfAssistance parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.spinalinjuries.vo.lookups.HydrotherapyLevelOfAssistance(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setLevelOfAssistance(voLookup4);
		}
				// TransferIn
		ims.domain.lookups.LookupInstance instance5 = domainObject.getTransferIn();
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

			ims.spinalinjuries.vo.lookups.HydrotherapyTransferIn voLookup5 = new ims.spinalinjuries.vo.lookups.HydrotherapyTransferIn(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.HydrotherapyTransferIn parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.spinalinjuries.vo.lookups.HydrotherapyTransferIn(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setTransferIn(voLookup5);
		}
				// TransferOut
		ims.domain.lookups.LookupInstance instance6 = domainObject.getTransferOut();
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

			ims.spinalinjuries.vo.lookups.HydrotherapyTransferOut voLookup6 = new ims.spinalinjuries.vo.lookups.HydrotherapyTransferOut(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.HydrotherapyTransferOut parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.spinalinjuries.vo.lookups.HydrotherapyTransferOut(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setTransferOut(voLookup6);
		}
				// Comment
		valueObject.setComment(domainObject.getComment());
		// Modalities
		java.util.List listModalities = domainObject.getModalities();
		ims.spinalinjuries.vo.lookups.HydrotherapyModalitiesCollection Modalities = new ims.spinalinjuries.vo.lookups.HydrotherapyModalitiesCollection();
		for(java.util.Iterator iterator = listModalities.iterator(); iterator.hasNext(); ) 
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
			ims.spinalinjuries.vo.lookups.HydrotherapyModalities voInstance = new ims.spinalinjuries.vo.lookups.HydrotherapyModalities(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.HydrotherapyModalities parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.spinalinjuries.vo.lookups.HydrotherapyModalities(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			Modalities.add(voInstance);
		}
		valueObject.setModalities( Modalities );
		// Equipment
		java.util.List listEquipment = domainObject.getEquipment();
		ims.spinalinjuries.vo.lookups.HydrotherapyEquipmentCollection Equipment = new ims.spinalinjuries.vo.lookups.HydrotherapyEquipmentCollection();
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
			ims.spinalinjuries.vo.lookups.HydrotherapyEquipment voInstance = new ims.spinalinjuries.vo.lookups.HydrotherapyEquipment(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.HydrotherapyEquipment parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.spinalinjuries.vo.lookups.HydrotherapyEquipment(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			Equipment.add(voInstance);
		}
		valueObject.setEquipment( Equipment );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.therapies.treatment.domain.objects.Hydrotherapy extractHydrotherapy(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.HydrotherapyVo valueObject) 
	{
		return 	extractHydrotherapy(domainFactory, valueObject, new HashMap());
	}

	public static ims.therapies.treatment.domain.objects.Hydrotherapy extractHydrotherapy(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.HydrotherapyVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Hydrotherapy();
		ims.therapies.treatment.domain.objects.Hydrotherapy domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.therapies.treatment.domain.objects.Hydrotherapy)domMap.get(valueObject);
			}
			// ims.therapies.vo.HydrotherapyVo ID_Hydrotherapy field is unknown
			domainObject = new ims.therapies.treatment.domain.objects.Hydrotherapy();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Hydrotherapy());
			if (domMap.get(key) != null)
			{
				return (ims.therapies.treatment.domain.objects.Hydrotherapy)domMap.get(key);
			}
			domainObject = (ims.therapies.treatment.domain.objects.Hydrotherapy) domainFactory.getDomainObject(ims.therapies.treatment.domain.objects.Hydrotherapy.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Hydrotherapy());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.ClinicalContact value1 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value1 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else
			{
				value1 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value1);
		domainObject.setAuthoringCP(ims.core.vo.domain.HcpAssembler.extractHcp(domainFactory, valueObject.getAuthoringCP(), domMap));
		ims.framework.utils.DateTime dateTime3 = valueObject.getAuthoringDateTime();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setAuthoringDateTime(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getLevelOfAssistance() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getLevelOfAssistance().getID());
		}
		domainObject.setLevelOfAssistance(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getTransferIn() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getTransferIn().getID());
		}
		domainObject.setTransferIn(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getTransferOut() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getTransferOut().getID());
		}
		domainObject.setTransferOut(value6);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComment() != null && valueObject.getComment().equals(""))
		{
			valueObject.setComment(null);
		}
		domainObject.setComment(valueObject.getComment());
		ims.spinalinjuries.vo.lookups.HydrotherapyModalitiesCollection collection8 =
	valueObject.getModalities();
	    java.util.List domainModalities = domainObject.getModalities();;			
	    int collection8Size=0;
		if (collection8 == null)
		{
			domainModalities = new java.util.ArrayList(0);
		}
		else
		{
			collection8Size = collection8.size();
		}
		
		for(int i=0; i<collection8Size; i++) 
		{
			int instanceId = collection8.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainModalities.indexOf(dom);
			if (domIdx == -1)
			{
				domainModalities.add(i, dom);
			}
			else if (i != domIdx && i < domainModalities.size())
			{
				Object tmp = domainModalities.get(i);
				domainModalities.set(i, domainModalities.get(domIdx));
				domainModalities.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j8 = domainModalities.size();
		while (j8 > collection8Size)
		{
			domainModalities.remove(j8-1);
			j8 = domainModalities.size();
		}

		domainObject.setModalities(domainModalities);		
		ims.spinalinjuries.vo.lookups.HydrotherapyEquipmentCollection collection9 =
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

		return domainObject;
	}

}
