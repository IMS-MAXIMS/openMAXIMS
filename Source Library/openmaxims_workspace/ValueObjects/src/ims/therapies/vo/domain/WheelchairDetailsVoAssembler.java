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
 * @author Peter Martin
 */
public class WheelchairDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.therapies.vo.WheelchairDetailsVo copy(ims.therapies.vo.WheelchairDetailsVo valueObjectDest, ims.therapies.vo.WheelchairDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_WheelchairDetails(valueObjectSrc.getID_WheelchairDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AuthoringDateTime
		valueObjectDest.setAuthoringDateTime(valueObjectSrc.getAuthoringDateTime());
		// WheelchairType
		valueObjectDest.setWheelchairType(valueObjectSrc.getWheelchairType());
		// WheelchairModel
		valueObjectDest.setWheelchairModel(valueObjectSrc.getWheelchairModel());
		// WheelchairFrame
		valueObjectDest.setWheelchairFrame(valueObjectSrc.getWheelchairFrame());
		// WheelchairFootplates
		valueObjectDest.setWheelchairFootplates(valueObjectSrc.getWheelchairFootplates());
		// SeatWidth
		valueObjectDest.setSeatWidth(valueObjectSrc.getSeatWidth());
		// SeatDepth
		valueObjectDest.setSeatDepth(valueObjectSrc.getSeatDepth());
		// SeatOverallWidth
		valueObjectDest.setSeatOverallWidth(valueObjectSrc.getSeatOverallWidth());
		// TrialStartDate
		valueObjectDest.setTrialStartDate(valueObjectSrc.getTrialStartDate());
		// TrialEndDate
		valueObjectDest.setTrialEndDate(valueObjectSrc.getTrialEndDate());
		// WheelchairAccessories
		valueObjectDest.setWheelchairAccessories(valueObjectSrc.getWheelchairAccessories());
		// WheelchairComments
		valueObjectDest.setWheelchairComments(valueObjectSrc.getWheelchairComments());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// AuthoringHCP
		valueObjectDest.setAuthoringHCP(valueObjectSrc.getAuthoringHCP());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createWheelchairDetailsVoCollectionFromWheelchairDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.therapies.mobilitytransfers.domain.objects.WheelchairDetails objects.
	 */
	public static ims.therapies.vo.WheelchairDetailsVoCollection createWheelchairDetailsVoCollectionFromWheelchairDetails(java.util.Set domainObjectSet)	
	{
		return createWheelchairDetailsVoCollectionFromWheelchairDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.therapies.mobilitytransfers.domain.objects.WheelchairDetails objects.
	 */
	public static ims.therapies.vo.WheelchairDetailsVoCollection createWheelchairDetailsVoCollectionFromWheelchairDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.therapies.vo.WheelchairDetailsVoCollection voList = new ims.therapies.vo.WheelchairDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.therapies.mobilitytransfers.domain.objects.WheelchairDetails domainObject = (ims.therapies.mobilitytransfers.domain.objects.WheelchairDetails) iterator.next();
			ims.therapies.vo.WheelchairDetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.therapies.mobilitytransfers.domain.objects.WheelchairDetails objects.
	 */
	public static ims.therapies.vo.WheelchairDetailsVoCollection createWheelchairDetailsVoCollectionFromWheelchairDetails(java.util.List domainObjectList) 
	{
		return createWheelchairDetailsVoCollectionFromWheelchairDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.therapies.mobilitytransfers.domain.objects.WheelchairDetails objects.
	 */
	public static ims.therapies.vo.WheelchairDetailsVoCollection createWheelchairDetailsVoCollectionFromWheelchairDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.therapies.vo.WheelchairDetailsVoCollection voList = new ims.therapies.vo.WheelchairDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.therapies.mobilitytransfers.domain.objects.WheelchairDetails domainObject = (ims.therapies.mobilitytransfers.domain.objects.WheelchairDetails) domainObjectList.get(i);
			ims.therapies.vo.WheelchairDetailsVo vo = create(map, domainObject);

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
	 * Create the ims.therapies.mobilitytransfers.domain.objects.WheelchairDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractWheelchairDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.WheelchairDetailsVoCollection voCollection) 
	 {
	 	return extractWheelchairDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractWheelchairDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.WheelchairDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.WheelchairDetailsVo vo = voCollection.get(i);
			ims.therapies.mobilitytransfers.domain.objects.WheelchairDetails domainObject = WheelchairDetailsVoAssembler.extractWheelchairDetails(domainFactory, vo, domMap);

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
	 * Create the ims.therapies.mobilitytransfers.domain.objects.WheelchairDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractWheelchairDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.WheelchairDetailsVoCollection voCollection) 
	 {
	 	return extractWheelchairDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractWheelchairDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.WheelchairDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.WheelchairDetailsVo vo = voCollection.get(i);
			ims.therapies.mobilitytransfers.domain.objects.WheelchairDetails domainObject = WheelchairDetailsVoAssembler.extractWheelchairDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.therapies.mobilitytransfers.domain.objects.WheelchairDetails object.
	 * @param domainObject ims.therapies.mobilitytransfers.domain.objects.WheelchairDetails
	 */
	 public static ims.therapies.vo.WheelchairDetailsVo create(ims.therapies.mobilitytransfers.domain.objects.WheelchairDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.therapies.mobilitytransfers.domain.objects.WheelchairDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.therapies.vo.WheelchairDetailsVo create(DomainObjectMap map, ims.therapies.mobilitytransfers.domain.objects.WheelchairDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.therapies.vo.WheelchairDetailsVo valueObject = (ims.therapies.vo.WheelchairDetailsVo) map.getValueObject(domainObject, ims.therapies.vo.WheelchairDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.therapies.vo.WheelchairDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.therapies.mobilitytransfers.domain.objects.WheelchairDetails
	 */
	 public static ims.therapies.vo.WheelchairDetailsVo insert(ims.therapies.vo.WheelchairDetailsVo valueObject, ims.therapies.mobilitytransfers.domain.objects.WheelchairDetails domainObject) 
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
	 * @param domainObject ims.therapies.mobilitytransfers.domain.objects.WheelchairDetails
	 */
	 public static ims.therapies.vo.WheelchairDetailsVo insert(DomainObjectMap map, ims.therapies.vo.WheelchairDetailsVo valueObject, ims.therapies.mobilitytransfers.domain.objects.WheelchairDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_WheelchairDetails(domainObject.getId());
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
			
		// AuthoringDateTime
		java.util.Date AuthoringDateTime = domainObject.getAuthoringDateTime();
		if ( null != AuthoringDateTime ) 
		{
			valueObject.setAuthoringDateTime(new ims.framework.utils.DateTime(AuthoringDateTime) );
		}
		// WheelchairType
		ims.domain.lookups.LookupInstance instance2 = domainObject.getWheelchairType();
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

			ims.spinalinjuries.vo.lookups.WheelchairType voLookup2 = new ims.spinalinjuries.vo.lookups.WheelchairType(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.WheelchairType parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.spinalinjuries.vo.lookups.WheelchairType(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setWheelchairType(voLookup2);
		}
				// WheelchairModel
		ims.domain.lookups.LookupInstance instance3 = domainObject.getWheelchairModel();
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

			ims.spinalinjuries.vo.lookups.WheelchairType voLookup3 = new ims.spinalinjuries.vo.lookups.WheelchairType(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.WheelchairType parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.spinalinjuries.vo.lookups.WheelchairType(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setWheelchairModel(voLookup3);
		}
				// WheelchairFrame
		ims.domain.lookups.LookupInstance instance4 = domainObject.getWheelchairFrame();
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

			ims.spinalinjuries.vo.lookups.WheelchairFrame voLookup4 = new ims.spinalinjuries.vo.lookups.WheelchairFrame(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.WheelchairFrame parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.spinalinjuries.vo.lookups.WheelchairFrame(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setWheelchairFrame(voLookup4);
		}
				// WheelchairFootplates
		ims.domain.lookups.LookupInstance instance5 = domainObject.getWheelchairFootplates();
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

			ims.spinalinjuries.vo.lookups.WheelchairFootplates voLookup5 = new ims.spinalinjuries.vo.lookups.WheelchairFootplates(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.WheelchairFootplates parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.spinalinjuries.vo.lookups.WheelchairFootplates(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setWheelchairFootplates(voLookup5);
		}
				// SeatWidth
		valueObject.setSeatWidth(domainObject.getSeatWidth());
		// SeatDepth
		valueObject.setSeatDepth(domainObject.getSeatDepth());
		// SeatOverallWidth
		valueObject.setSeatOverallWidth(domainObject.getSeatOverallWidth());
		// TrialStartDate
		java.util.Date TrialStartDate = domainObject.getTrialStartDate();
		if ( null != TrialStartDate ) 
		{
			valueObject.setTrialStartDate(new ims.framework.utils.Date(TrialStartDate) );
		}
		// TrialEndDate
		java.util.Date TrialEndDate = domainObject.getTrialEndDate();
		if ( null != TrialEndDate ) 
		{
			valueObject.setTrialEndDate(new ims.framework.utils.Date(TrialEndDate) );
		}
		// WheelchairAccessories
		valueObject.setWheelchairAccessories(domainObject.getWheelchairAccessories());
		// WheelchairComments
		valueObject.setWheelchairComments(domainObject.getWheelchairComments());
		// CareContext
		if (domainObject.getCareContext() != null)
		{
			if(domainObject.getCareContext() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCareContext();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(id, -1));				
			}
			else
			{
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(domainObject.getCareContext().getId(), domainObject.getCareContext().getVersion()));
			}
		}
		// ClinicalContact
		if (domainObject.getClinicalContact() != null)
		{
			if(domainObject.getClinicalContact() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getClinicalContact();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(id, -1));				
			}
			else
			{
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(domainObject.getClinicalContact().getId(), domainObject.getClinicalContact().getVersion()));
			}
		}
		// AuthoringHCP
		valueObject.setAuthoringHCP(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getAuthoringHCP()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.therapies.mobilitytransfers.domain.objects.WheelchairDetails extractWheelchairDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.WheelchairDetailsVo valueObject) 
	{
		return 	extractWheelchairDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.therapies.mobilitytransfers.domain.objects.WheelchairDetails extractWheelchairDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.WheelchairDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_WheelchairDetails();
		ims.therapies.mobilitytransfers.domain.objects.WheelchairDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.therapies.mobilitytransfers.domain.objects.WheelchairDetails)domMap.get(valueObject);
			}
			// ims.therapies.vo.WheelchairDetailsVo ID_WheelchairDetails field is unknown
			domainObject = new ims.therapies.mobilitytransfers.domain.objects.WheelchairDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_WheelchairDetails());
			if (domMap.get(key) != null)
			{
				return (ims.therapies.mobilitytransfers.domain.objects.WheelchairDetails)domMap.get(key);
			}
			domainObject = (ims.therapies.mobilitytransfers.domain.objects.WheelchairDetails) domainFactory.getDomainObject(ims.therapies.mobilitytransfers.domain.objects.WheelchairDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_WheelchairDetails());

		ims.framework.utils.DateTime dateTime1 = valueObject.getAuthoringDateTime();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setAuthoringDateTime(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getWheelchairType() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getWheelchairType().getID());
		}
		domainObject.setWheelchairType(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getWheelchairModel() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getWheelchairModel().getID());
		}
		domainObject.setWheelchairModel(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getWheelchairFrame() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getWheelchairFrame().getID());
		}
		domainObject.setWheelchairFrame(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getWheelchairFootplates() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getWheelchairFootplates().getID());
		}
		domainObject.setWheelchairFootplates(value5);
		domainObject.setSeatWidth(valueObject.getSeatWidth());
		domainObject.setSeatDepth(valueObject.getSeatDepth());
		domainObject.setSeatOverallWidth(valueObject.getSeatOverallWidth());
		java.util.Date value9 = null;
		ims.framework.utils.Date date9 = valueObject.getTrialStartDate();		
		if ( date9 != null ) 
		{
			value9 = date9.getDate();
		}
		domainObject.setTrialStartDate(value9);
		java.util.Date value10 = null;
		ims.framework.utils.Date date10 = valueObject.getTrialEndDate();		
		if ( date10 != null ) 
		{
			value10 = date10.getDate();
		}
		domainObject.setTrialEndDate(value10);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getWheelchairAccessories() != null && valueObject.getWheelchairAccessories().equals(""))
		{
			valueObject.setWheelchairAccessories(null);
		}
		domainObject.setWheelchairAccessories(valueObject.getWheelchairAccessories());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getWheelchairComments() != null && valueObject.getWheelchairComments().equals(""))
		{
			valueObject.setWheelchairComments(null);
		}
		domainObject.setWheelchairComments(valueObject.getWheelchairComments());
		ims.core.admin.domain.objects.CareContext value13 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value13 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value13 = domainObject.getCareContext();	
			}
			else
			{
				value13 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value13);
		ims.core.admin.domain.objects.ClinicalContact value14 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value14 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value14 = domainObject.getClinicalContact();	
			}
			else
			{
				value14 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value14);
		domainObject.setAuthoringHCP(ims.core.vo.domain.HcpAssembler.extractHcp(domainFactory, valueObject.getAuthoringHCP(), domMap));

		return domainObject;
	}

}
