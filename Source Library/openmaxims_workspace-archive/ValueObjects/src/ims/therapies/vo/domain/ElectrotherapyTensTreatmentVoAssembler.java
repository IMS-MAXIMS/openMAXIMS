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
public class ElectrotherapyTensTreatmentVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.therapies.vo.ElectrotherapyTensTreatmentVo copy(ims.therapies.vo.ElectrotherapyTensTreatmentVo valueObjectDest, ims.therapies.vo.ElectrotherapyTensTreatmentVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ElectrotherapyTensTreatment(valueObjectSrc.getID_ElectrotherapyTensTreatment());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Area
		valueObjectDest.setArea(valueObjectSrc.getArea());
		// Laterality
		valueObjectDest.setLaterality(valueObjectSrc.getLaterality());
		// Model
		valueObjectDest.setModel(valueObjectSrc.getModel());
		// SerialNr
		valueObjectDest.setSerialNr(valueObjectSrc.getSerialNr());
		// ProtocolFollowed
		valueObjectDest.setProtocolFollowed(valueObjectSrc.getProtocolFollowed());
		// Mode
		valueObjectDest.setMode(valueObjectSrc.getMode());
		// PulseRate
		valueObjectDest.setPulseRate(valueObjectSrc.getPulseRate());
		// PulseWidth
		valueObjectDest.setPulseWidth(valueObjectSrc.getPulseWidth());
		// Duration
		valueObjectDest.setDuration(valueObjectSrc.getDuration());
		// DailyUsage
		valueObjectDest.setDailyUsage(valueObjectSrc.getDailyUsage());
		// Electrodes
		valueObjectDest.setElectrodes(valueObjectSrc.getElectrodes());
		// Size
		valueObjectDest.setSize(valueObjectSrc.getSize());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createElectrotherapyTensTreatmentVoCollectionFromElectrotherapyTensTreatment(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.therapies.treatment.domain.objects.ElectrotherapyTensTreatment objects.
	 */
	public static ims.therapies.vo.ElectrotherapyTensTreatmentVoCollection createElectrotherapyTensTreatmentVoCollectionFromElectrotherapyTensTreatment(java.util.Set domainObjectSet)	
	{
		return createElectrotherapyTensTreatmentVoCollectionFromElectrotherapyTensTreatment(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.therapies.treatment.domain.objects.ElectrotherapyTensTreatment objects.
	 */
	public static ims.therapies.vo.ElectrotherapyTensTreatmentVoCollection createElectrotherapyTensTreatmentVoCollectionFromElectrotherapyTensTreatment(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.therapies.vo.ElectrotherapyTensTreatmentVoCollection voList = new ims.therapies.vo.ElectrotherapyTensTreatmentVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.therapies.treatment.domain.objects.ElectrotherapyTensTreatment domainObject = (ims.therapies.treatment.domain.objects.ElectrotherapyTensTreatment) iterator.next();
			ims.therapies.vo.ElectrotherapyTensTreatmentVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.therapies.treatment.domain.objects.ElectrotherapyTensTreatment objects.
	 */
	public static ims.therapies.vo.ElectrotherapyTensTreatmentVoCollection createElectrotherapyTensTreatmentVoCollectionFromElectrotherapyTensTreatment(java.util.List domainObjectList) 
	{
		return createElectrotherapyTensTreatmentVoCollectionFromElectrotherapyTensTreatment(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.therapies.treatment.domain.objects.ElectrotherapyTensTreatment objects.
	 */
	public static ims.therapies.vo.ElectrotherapyTensTreatmentVoCollection createElectrotherapyTensTreatmentVoCollectionFromElectrotherapyTensTreatment(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.therapies.vo.ElectrotherapyTensTreatmentVoCollection voList = new ims.therapies.vo.ElectrotherapyTensTreatmentVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.therapies.treatment.domain.objects.ElectrotherapyTensTreatment domainObject = (ims.therapies.treatment.domain.objects.ElectrotherapyTensTreatment) domainObjectList.get(i);
			ims.therapies.vo.ElectrotherapyTensTreatmentVo vo = create(map, domainObject);

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
	 * Create the ims.therapies.treatment.domain.objects.ElectrotherapyTensTreatment set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractElectrotherapyTensTreatmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.ElectrotherapyTensTreatmentVoCollection voCollection) 
	 {
	 	return extractElectrotherapyTensTreatmentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractElectrotherapyTensTreatmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.ElectrotherapyTensTreatmentVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.ElectrotherapyTensTreatmentVo vo = voCollection.get(i);
			ims.therapies.treatment.domain.objects.ElectrotherapyTensTreatment domainObject = ElectrotherapyTensTreatmentVoAssembler.extractElectrotherapyTensTreatment(domainFactory, vo, domMap);

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
	 * Create the ims.therapies.treatment.domain.objects.ElectrotherapyTensTreatment list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractElectrotherapyTensTreatmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.ElectrotherapyTensTreatmentVoCollection voCollection) 
	 {
	 	return extractElectrotherapyTensTreatmentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractElectrotherapyTensTreatmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.ElectrotherapyTensTreatmentVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.ElectrotherapyTensTreatmentVo vo = voCollection.get(i);
			ims.therapies.treatment.domain.objects.ElectrotherapyTensTreatment domainObject = ElectrotherapyTensTreatmentVoAssembler.extractElectrotherapyTensTreatment(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.therapies.treatment.domain.objects.ElectrotherapyTensTreatment object.
	 * @param domainObject ims.therapies.treatment.domain.objects.ElectrotherapyTensTreatment
	 */
	 public static ims.therapies.vo.ElectrotherapyTensTreatmentVo create(ims.therapies.treatment.domain.objects.ElectrotherapyTensTreatment domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.therapies.treatment.domain.objects.ElectrotherapyTensTreatment object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.therapies.vo.ElectrotherapyTensTreatmentVo create(DomainObjectMap map, ims.therapies.treatment.domain.objects.ElectrotherapyTensTreatment domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.therapies.vo.ElectrotherapyTensTreatmentVo valueObject = (ims.therapies.vo.ElectrotherapyTensTreatmentVo) map.getValueObject(domainObject, ims.therapies.vo.ElectrotherapyTensTreatmentVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.therapies.vo.ElectrotherapyTensTreatmentVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.therapies.treatment.domain.objects.ElectrotherapyTensTreatment
	 */
	 public static ims.therapies.vo.ElectrotherapyTensTreatmentVo insert(ims.therapies.vo.ElectrotherapyTensTreatmentVo valueObject, ims.therapies.treatment.domain.objects.ElectrotherapyTensTreatment domainObject) 
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
	 * @param domainObject ims.therapies.treatment.domain.objects.ElectrotherapyTensTreatment
	 */
	 public static ims.therapies.vo.ElectrotherapyTensTreatmentVo insert(DomainObjectMap map, ims.therapies.vo.ElectrotherapyTensTreatmentVo valueObject, ims.therapies.treatment.domain.objects.ElectrotherapyTensTreatment domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ElectrotherapyTensTreatment(domainObject.getId());
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
			
		// Area
		ims.domain.lookups.LookupInstance instance1 = domainObject.getArea();
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

			ims.spinalinjuries.vo.lookups.TENSArea voLookup1 = new ims.spinalinjuries.vo.lookups.TENSArea(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.TENSArea parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.spinalinjuries.vo.lookups.TENSArea(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setArea(voLookup1);
		}
				// Laterality
		ims.domain.lookups.LookupInstance instance2 = domainObject.getLaterality();
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
			valueObject.setLaterality(voLookup2);
		}
				// Model
		ims.domain.lookups.LookupInstance instance3 = domainObject.getModel();
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

			ims.spinalinjuries.vo.lookups.TENSModel voLookup3 = new ims.spinalinjuries.vo.lookups.TENSModel(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.TENSModel parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.spinalinjuries.vo.lookups.TENSModel(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setModel(voLookup3);
		}
				// SerialNr
		valueObject.setSerialNr(domainObject.getSerialNr());
		// ProtocolFollowed
		ims.domain.lookups.LookupInstance instance5 = domainObject.getProtocolFollowed();
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

			ims.core.vo.lookups.YesNoUnknown voLookup5 = new ims.core.vo.lookups.YesNoUnknown(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.YesNoUnknown(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setProtocolFollowed(voLookup5);
		}
				// Mode
		ims.domain.lookups.LookupInstance instance6 = domainObject.getMode();
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

			ims.spinalinjuries.vo.lookups.TENSMode voLookup6 = new ims.spinalinjuries.vo.lookups.TENSMode(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.TENSMode parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.spinalinjuries.vo.lookups.TENSMode(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setMode(voLookup6);
		}
				// PulseRate
		valueObject.setPulseRate(domainObject.getPulseRate());
		// PulseWidth
		valueObject.setPulseWidth(domainObject.getPulseWidth());
		// Duration
		valueObject.setDuration(domainObject.getDuration());
		// DailyUsage
		ims.domain.lookups.LookupInstance instance10 = domainObject.getDailyUsage();
		if ( null != instance10 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance10.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance10.getImage().getImageId(), instance10.getImage().getImagePath());
			}
			color = instance10.getColor();
			if (color != null) 
				color.getValue();

			ims.spinalinjuries.vo.lookups.TENSDailyUsage voLookup10 = new ims.spinalinjuries.vo.lookups.TENSDailyUsage(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.TENSDailyUsage parentVoLookup10 = voLookup10;
			ims.domain.lookups.LookupInstance parent10 = instance10.getParent();
			while (parent10 != null)
			{
				if (parent10.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent10.getImage().getImageId(), parent10.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent10.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup10.setParent(new ims.spinalinjuries.vo.lookups.TENSDailyUsage(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setDailyUsage(voLookup10);
		}
				// Electrodes
		ims.domain.lookups.LookupInstance instance11 = domainObject.getElectrodes();
		if ( null != instance11 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance11.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance11.getImage().getImageId(), instance11.getImage().getImagePath());
			}
			color = instance11.getColor();
			if (color != null) 
				color.getValue();

			ims.spinalinjuries.vo.lookups.TENSElectrodes voLookup11 = new ims.spinalinjuries.vo.lookups.TENSElectrodes(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.TENSElectrodes parentVoLookup11 = voLookup11;
			ims.domain.lookups.LookupInstance parent11 = instance11.getParent();
			while (parent11 != null)
			{
				if (parent11.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent11.getImage().getImageId(), parent11.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent11.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup11.setParent(new ims.spinalinjuries.vo.lookups.TENSElectrodes(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setElectrodes(voLookup11);
		}
				// Size
		ims.domain.lookups.LookupInstance instance12 = domainObject.getSize();
		if ( null != instance12 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance12.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance12.getImage().getImageId(), instance12.getImage().getImagePath());
			}
			color = instance12.getColor();
			if (color != null) 
				color.getValue();

			ims.spinalinjuries.vo.lookups.TENSSize voLookup12 = new ims.spinalinjuries.vo.lookups.TENSSize(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.TENSSize parentVoLookup12 = voLookup12;
			ims.domain.lookups.LookupInstance parent12 = instance12.getParent();
			while (parent12 != null)
			{
				if (parent12.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent12.getImage().getImageId(), parent12.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent12.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup12.setParent(new ims.spinalinjuries.vo.lookups.TENSSize(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setSize(voLookup12);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.therapies.treatment.domain.objects.ElectrotherapyTensTreatment extractElectrotherapyTensTreatment(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.ElectrotherapyTensTreatmentVo valueObject) 
	{
		return 	extractElectrotherapyTensTreatment(domainFactory, valueObject, new HashMap());
	}

	public static ims.therapies.treatment.domain.objects.ElectrotherapyTensTreatment extractElectrotherapyTensTreatment(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.ElectrotherapyTensTreatmentVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ElectrotherapyTensTreatment();
		ims.therapies.treatment.domain.objects.ElectrotherapyTensTreatment domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.therapies.treatment.domain.objects.ElectrotherapyTensTreatment)domMap.get(valueObject);
			}
			// ims.therapies.vo.ElectrotherapyTensTreatmentVo ID_ElectrotherapyTensTreatment field is unknown
			domainObject = new ims.therapies.treatment.domain.objects.ElectrotherapyTensTreatment();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ElectrotherapyTensTreatment());
			if (domMap.get(key) != null)
			{
				return (ims.therapies.treatment.domain.objects.ElectrotherapyTensTreatment)domMap.get(key);
			}
			domainObject = (ims.therapies.treatment.domain.objects.ElectrotherapyTensTreatment) domainFactory.getDomainObject(ims.therapies.treatment.domain.objects.ElectrotherapyTensTreatment.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ElectrotherapyTensTreatment());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getArea() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getArea().getID());
		}
		domainObject.setArea(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getLaterality() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getLaterality().getID());
		}
		domainObject.setLaterality(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getModel() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getModel().getID());
		}
		domainObject.setModel(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSerialNr() != null && valueObject.getSerialNr().equals(""))
		{
			valueObject.setSerialNr(null);
		}
		domainObject.setSerialNr(valueObject.getSerialNr());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getProtocolFollowed() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getProtocolFollowed().getID());
		}
		domainObject.setProtocolFollowed(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getMode() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getMode().getID());
		}
		domainObject.setMode(value6);
		domainObject.setPulseRate(valueObject.getPulseRate());
		domainObject.setPulseWidth(valueObject.getPulseWidth());
		domainObject.setDuration(valueObject.getDuration());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getDailyUsage() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getDailyUsage().getID());
		}
		domainObject.setDailyUsage(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getElectrodes() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getElectrodes().getID());
		}
		domainObject.setElectrodes(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getSize() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getSize().getID());
		}
		domainObject.setSize(value12);

		return domainObject;
	}

}
