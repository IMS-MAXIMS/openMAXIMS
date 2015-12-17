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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Silviu Checherita
 */
public class PDSBackOfficeItemVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PDSBackOfficeItemVo copy(ims.core.vo.PDSBackOfficeItemVo valueObjectDest, ims.core.vo.PDSBackOfficeItemVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PDSBackOfficeItem(valueObjectSrc.getID_PDSBackOfficeItem());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// type
		valueObjectDest.setType(valueObjectSrc.getType());
		// description
		valueObjectDest.setDescription(valueObjectSrc.getDescription());
		// source
		valueObjectDest.setSource(valueObjectSrc.getSource());
		// priority
		valueObjectDest.setPriority(valueObjectSrc.getPriority());
		// currentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// statusHistory
		valueObjectDest.setStatusHistory(valueObjectSrc.getStatusHistory());
		// NHSNumber
		valueObjectDest.setNHSNumber(valueObjectSrc.getNHSNumber());
		// NHSNumberSuperseded
		valueObjectDest.setNHSNumberSuperseded(valueObjectSrc.getNHSNumberSuperseded());
		// outcome
		valueObjectDest.setOutcome(valueObjectSrc.getOutcome());
		// updateType
		valueObjectDest.setUpdateType(valueObjectSrc.getUpdateType());
		// registeryAuthorityType
		valueObjectDest.setRegisteryAuthorityType(valueObjectSrc.getRegisteryAuthorityType());
		// patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// notifications
		valueObjectDest.setNotifications(valueObjectSrc.getNotifications());
		// SystemInformation
		valueObjectDest.setSystemInformation(valueObjectSrc.getSystemInformation());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPDSBackOfficeItemVoCollectionFromPDSBackOfficeItem(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.PDSBackOfficeItem objects.
	 */
	public static ims.core.vo.PDSBackOfficeItemVoCollection createPDSBackOfficeItemVoCollectionFromPDSBackOfficeItem(java.util.Set domainObjectSet)	
	{
		return createPDSBackOfficeItemVoCollectionFromPDSBackOfficeItem(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.PDSBackOfficeItem objects.
	 */
	public static ims.core.vo.PDSBackOfficeItemVoCollection createPDSBackOfficeItemVoCollectionFromPDSBackOfficeItem(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PDSBackOfficeItemVoCollection voList = new ims.core.vo.PDSBackOfficeItemVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.domain.objects.PDSBackOfficeItem domainObject = (ims.core.admin.domain.objects.PDSBackOfficeItem) iterator.next();
			ims.core.vo.PDSBackOfficeItemVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.domain.objects.PDSBackOfficeItem objects.
	 */
	public static ims.core.vo.PDSBackOfficeItemVoCollection createPDSBackOfficeItemVoCollectionFromPDSBackOfficeItem(java.util.List domainObjectList) 
	{
		return createPDSBackOfficeItemVoCollectionFromPDSBackOfficeItem(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.PDSBackOfficeItem objects.
	 */
	public static ims.core.vo.PDSBackOfficeItemVoCollection createPDSBackOfficeItemVoCollectionFromPDSBackOfficeItem(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PDSBackOfficeItemVoCollection voList = new ims.core.vo.PDSBackOfficeItemVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.PDSBackOfficeItem domainObject = (ims.core.admin.domain.objects.PDSBackOfficeItem) domainObjectList.get(i);
			ims.core.vo.PDSBackOfficeItemVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.domain.objects.PDSBackOfficeItem set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPDSBackOfficeItemSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSBackOfficeItemVoCollection voCollection) 
	 {
	 	return extractPDSBackOfficeItemSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPDSBackOfficeItemSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSBackOfficeItemVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PDSBackOfficeItemVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.PDSBackOfficeItem domainObject = PDSBackOfficeItemVoAssembler.extractPDSBackOfficeItem(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.domain.objects.PDSBackOfficeItem list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPDSBackOfficeItemList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSBackOfficeItemVoCollection voCollection) 
	 {
	 	return extractPDSBackOfficeItemList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPDSBackOfficeItemList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSBackOfficeItemVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PDSBackOfficeItemVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.PDSBackOfficeItem domainObject = PDSBackOfficeItemVoAssembler.extractPDSBackOfficeItem(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.domain.objects.PDSBackOfficeItem object.
	 * @param domainObject ims.core.admin.domain.objects.PDSBackOfficeItem
	 */
	 public static ims.core.vo.PDSBackOfficeItemVo create(ims.core.admin.domain.objects.PDSBackOfficeItem domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.domain.objects.PDSBackOfficeItem object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PDSBackOfficeItemVo create(DomainObjectMap map, ims.core.admin.domain.objects.PDSBackOfficeItem domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PDSBackOfficeItemVo valueObject = (ims.core.vo.PDSBackOfficeItemVo) map.getValueObject(domainObject, ims.core.vo.PDSBackOfficeItemVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PDSBackOfficeItemVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.domain.objects.PDSBackOfficeItem
	 */
	 public static ims.core.vo.PDSBackOfficeItemVo insert(ims.core.vo.PDSBackOfficeItemVo valueObject, ims.core.admin.domain.objects.PDSBackOfficeItem domainObject) 
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
	 * @param domainObject ims.core.admin.domain.objects.PDSBackOfficeItem
	 */
	 public static ims.core.vo.PDSBackOfficeItemVo insert(DomainObjectMap map, ims.core.vo.PDSBackOfficeItemVo valueObject, ims.core.admin.domain.objects.PDSBackOfficeItem domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PDSBackOfficeItem(domainObject.getId());
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
			
		// type
		ims.domain.lookups.LookupInstance instance1 = domainObject.getType();
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

			ims.core.vo.lookups.PDSBackOfficeType voLookup1 = new ims.core.vo.lookups.PDSBackOfficeType(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.PDSBackOfficeType parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.core.vo.lookups.PDSBackOfficeType(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setType(voLookup1);
		}
				// description
		valueObject.setDescription(domainObject.getDescription());
		// source
		valueObject.setSource(domainObject.getSource());
		// priority
		ims.domain.lookups.LookupInstance instance4 = domainObject.getPriority();
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

			ims.core.vo.lookups.PDSBackOfficeWorkPriority voLookup4 = new ims.core.vo.lookups.PDSBackOfficeWorkPriority(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.PDSBackOfficeWorkPriority parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.PDSBackOfficeWorkPriority(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setPriority(voLookup4);
		}
				// currentStatus
		ims.domain.lookups.LookupInstance instance5 = domainObject.getCurrentStatus();
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

			ims.core.vo.lookups.PDSBackOfficeWorkStatus voLookup5 = new ims.core.vo.lookups.PDSBackOfficeWorkStatus(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.PDSBackOfficeWorkStatus parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.PDSBackOfficeWorkStatus(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setCurrentStatus(voLookup5);
		}
				// statusHistory
		valueObject.setStatusHistory(ims.core.vo.domain.PDSBackOfficeStatusVoAssembler.createPDSBackOfficeStatusVoCollectionFromPDSBackOfficeStatus(map, domainObject.getStatusHistory()) );
		// NHSNumber
		valueObject.setNHSNumber(domainObject.getNHSNumber());
		// NHSNumberSuperseded
		valueObject.setNHSNumberSuperseded(domainObject.getNHSNumberSuperseded());
		// outcome
		ims.domain.lookups.LookupInstance instance9 = domainObject.getOutcome();
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

			ims.core.vo.lookups.PDSBackOfficeOutcome voLookup9 = new ims.core.vo.lookups.PDSBackOfficeOutcome(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.PDSBackOfficeOutcome parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.core.vo.lookups.PDSBackOfficeOutcome(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setOutcome(voLookup9);
		}
				// updateType
		ims.domain.lookups.LookupInstance instance10 = domainObject.getUpdateType();
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

			ims.core.vo.lookups.PDSUpdateType voLookup10 = new ims.core.vo.lookups.PDSUpdateType(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.PDSUpdateType parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.core.vo.lookups.PDSUpdateType(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setUpdateType(voLookup10);
		}
				// registeryAuthorityType
		ims.domain.lookups.LookupInstance instance11 = domainObject.getRegisteryAuthorityType();
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

			ims.core.vo.lookups.PDSRegisteringAuthorityType voLookup11 = new ims.core.vo.lookups.PDSRegisteringAuthorityType(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.core.vo.lookups.PDSRegisteringAuthorityType parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.core.vo.lookups.PDSRegisteringAuthorityType(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setRegisteryAuthorityType(voLookup11);
		}
				// patient
		if (domainObject.getPatient() != null)
		{
			if(domainObject.getPatient() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPatient();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPatient(new ims.core.patient.vo.PatientRefVo(id, -1));				
			}
			else
			{
				valueObject.setPatient(new ims.core.patient.vo.PatientRefVo(domainObject.getPatient().getId(), domainObject.getPatient().getVersion()));
			}
		}
		// notifications
		valueObject.setNotifications(ims.core.vo.domain.NotificationVoAssembler.createNotificationVoCollectionFromNotifications(map, domainObject.getNotifications()) );
		// SystemInformation
		// set system information
		valueObject.setSystemInformation(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.PDSBackOfficeItem extractPDSBackOfficeItem(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSBackOfficeItemVo valueObject) 
	{
		return 	extractPDSBackOfficeItem(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.PDSBackOfficeItem extractPDSBackOfficeItem(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSBackOfficeItemVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PDSBackOfficeItem();
		ims.core.admin.domain.objects.PDSBackOfficeItem domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.domain.objects.PDSBackOfficeItem)domMap.get(valueObject);
			}
			// ims.core.vo.PDSBackOfficeItemVo ID_PDSBackOfficeItem field is unknown
			domainObject = new ims.core.admin.domain.objects.PDSBackOfficeItem();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PDSBackOfficeItem());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.domain.objects.PDSBackOfficeItem)domMap.get(key);
			}
			domainObject = (ims.core.admin.domain.objects.PDSBackOfficeItem) domainFactory.getDomainObject(ims.core.admin.domain.objects.PDSBackOfficeItem.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PDSBackOfficeItem());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getType() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getType().getID());
		}
		domainObject.setType(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDescription() != null && valueObject.getDescription().equals(""))
		{
			valueObject.setDescription(null);
		}
		domainObject.setDescription(valueObject.getDescription());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSource() != null && valueObject.getSource().equals(""))
		{
			valueObject.setSource(null);
		}
		domainObject.setSource(valueObject.getSource());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getPriority() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getPriority().getID());
		}
		domainObject.setPriority(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getCurrentStatus() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getCurrentStatus().getID());
		}
		domainObject.setCurrentStatus(value5);
		domainObject.setStatusHistory(ims.core.vo.domain.PDSBackOfficeStatusVoAssembler.extractPDSBackOfficeStatusList(domainFactory, valueObject.getStatusHistory(), domainObject.getStatusHistory(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNHSNumber() != null && valueObject.getNHSNumber().equals(""))
		{
			valueObject.setNHSNumber(null);
		}
		domainObject.setNHSNumber(valueObject.getNHSNumber());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNHSNumberSuperseded() != null && valueObject.getNHSNumberSuperseded().equals(""))
		{
			valueObject.setNHSNumberSuperseded(null);
		}
		domainObject.setNHSNumberSuperseded(valueObject.getNHSNumberSuperseded());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getOutcome() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getOutcome().getID());
		}
		domainObject.setOutcome(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getUpdateType() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getUpdateType().getID());
		}
		domainObject.setUpdateType(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getRegisteryAuthorityType() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getRegisteryAuthorityType().getID());
		}
		domainObject.setRegisteryAuthorityType(value11);
		ims.core.patient.domain.objects.Patient value12 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value12 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value12 = domainObject.getPatient();	
			}
			else
			{
				value12 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value12);
		domainObject.setNotifications(ims.core.vo.domain.NotificationVoAssembler.extractNotificationsList(domainFactory, valueObject.getNotifications(), domainObject.getNotifications(), domMap));		

		return domainObject;
	}

}
