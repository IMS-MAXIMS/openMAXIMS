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
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class DischargeFuturePlanFollowUpVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.DischargeFuturePlanFollowUpVo copy(ims.clinical.vo.DischargeFuturePlanFollowUpVo valueObjectDest, ims.clinical.vo.DischargeFuturePlanFollowUpVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_FuturePlanFollowUp(valueObjectSrc.getID_FuturePlanFollowUp());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// FollowUpInValue
		valueObjectDest.setFollowUpInValue(valueObjectSrc.getFollowUpInValue());
		// FollowUpInUnit
		valueObjectDest.setFollowUpInUnit(valueObjectSrc.getFollowUpInUnit());
		// FollowUpHCP
		valueObjectDest.setFollowUpHCP(valueObjectSrc.getFollowUpHCP());
		// FollowUpSpecialty
		valueObjectDest.setFollowUpSpecialty(valueObjectSrc.getFollowUpSpecialty());
		// Location
		valueObjectDest.setLocation(valueObjectSrc.getLocation());
		// HospitalFollowUp
		valueObjectDest.setHospitalFollowUp(valueObjectSrc.getHospitalFollowUp());
		// HospitalToFollowUp
		valueObjectDest.setHospitalToFollowUp(valueObjectSrc.getHospitalToFollowUp());
		// FollowUpType
		valueObjectDest.setFollowUpType(valueObjectSrc.getFollowUpType());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createDischargeFuturePlanFollowUpVoCollectionFromFuturePlanFollowUp(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.edischarge.domain.objects.FuturePlanFollowUp objects.
	 */
	public static ims.clinical.vo.DischargeFuturePlanFollowUpVoCollection createDischargeFuturePlanFollowUpVoCollectionFromFuturePlanFollowUp(java.util.Set domainObjectSet)	
	{
		return createDischargeFuturePlanFollowUpVoCollectionFromFuturePlanFollowUp(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.edischarge.domain.objects.FuturePlanFollowUp objects.
	 */
	public static ims.clinical.vo.DischargeFuturePlanFollowUpVoCollection createDischargeFuturePlanFollowUpVoCollectionFromFuturePlanFollowUp(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.DischargeFuturePlanFollowUpVoCollection voList = new ims.clinical.vo.DischargeFuturePlanFollowUpVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.edischarge.domain.objects.FuturePlanFollowUp domainObject = (ims.edischarge.domain.objects.FuturePlanFollowUp) iterator.next();
			ims.clinical.vo.DischargeFuturePlanFollowUpVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.edischarge.domain.objects.FuturePlanFollowUp objects.
	 */
	public static ims.clinical.vo.DischargeFuturePlanFollowUpVoCollection createDischargeFuturePlanFollowUpVoCollectionFromFuturePlanFollowUp(java.util.List domainObjectList) 
	{
		return createDischargeFuturePlanFollowUpVoCollectionFromFuturePlanFollowUp(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.edischarge.domain.objects.FuturePlanFollowUp objects.
	 */
	public static ims.clinical.vo.DischargeFuturePlanFollowUpVoCollection createDischargeFuturePlanFollowUpVoCollectionFromFuturePlanFollowUp(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.DischargeFuturePlanFollowUpVoCollection voList = new ims.clinical.vo.DischargeFuturePlanFollowUpVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.edischarge.domain.objects.FuturePlanFollowUp domainObject = (ims.edischarge.domain.objects.FuturePlanFollowUp) domainObjectList.get(i);
			ims.clinical.vo.DischargeFuturePlanFollowUpVo vo = create(map, domainObject);

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
	 * Create the ims.edischarge.domain.objects.FuturePlanFollowUp set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractFuturePlanFollowUpSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeFuturePlanFollowUpVoCollection voCollection) 
	 {
	 	return extractFuturePlanFollowUpSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractFuturePlanFollowUpSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeFuturePlanFollowUpVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.DischargeFuturePlanFollowUpVo vo = voCollection.get(i);
			ims.edischarge.domain.objects.FuturePlanFollowUp domainObject = DischargeFuturePlanFollowUpVoAssembler.extractFuturePlanFollowUp(domainFactory, vo, domMap);

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
	 * Create the ims.edischarge.domain.objects.FuturePlanFollowUp list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractFuturePlanFollowUpList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeFuturePlanFollowUpVoCollection voCollection) 
	 {
	 	return extractFuturePlanFollowUpList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractFuturePlanFollowUpList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeFuturePlanFollowUpVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.DischargeFuturePlanFollowUpVo vo = voCollection.get(i);
			ims.edischarge.domain.objects.FuturePlanFollowUp domainObject = DischargeFuturePlanFollowUpVoAssembler.extractFuturePlanFollowUp(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.edischarge.domain.objects.FuturePlanFollowUp object.
	 * @param domainObject ims.edischarge.domain.objects.FuturePlanFollowUp
	 */
	 public static ims.clinical.vo.DischargeFuturePlanFollowUpVo create(ims.edischarge.domain.objects.FuturePlanFollowUp domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.edischarge.domain.objects.FuturePlanFollowUp object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.DischargeFuturePlanFollowUpVo create(DomainObjectMap map, ims.edischarge.domain.objects.FuturePlanFollowUp domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.DischargeFuturePlanFollowUpVo valueObject = (ims.clinical.vo.DischargeFuturePlanFollowUpVo) map.getValueObject(domainObject, ims.clinical.vo.DischargeFuturePlanFollowUpVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.DischargeFuturePlanFollowUpVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.edischarge.domain.objects.FuturePlanFollowUp
	 */
	 public static ims.clinical.vo.DischargeFuturePlanFollowUpVo insert(ims.clinical.vo.DischargeFuturePlanFollowUpVo valueObject, ims.edischarge.domain.objects.FuturePlanFollowUp domainObject) 
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
	 * @param domainObject ims.edischarge.domain.objects.FuturePlanFollowUp
	 */
	 public static ims.clinical.vo.DischargeFuturePlanFollowUpVo insert(DomainObjectMap map, ims.clinical.vo.DischargeFuturePlanFollowUpVo valueObject, ims.edischarge.domain.objects.FuturePlanFollowUp domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_FuturePlanFollowUp(domainObject.getId());
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
			
		// FollowUpInValue
		valueObject.setFollowUpInValue(domainObject.getFollowUpInValue());
		// FollowUpInUnit
		ims.domain.lookups.LookupInstance instance2 = domainObject.getFollowUpInUnit();
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

			ims.core.vo.lookups.TimeDaystoYears voLookup2 = new ims.core.vo.lookups.TimeDaystoYears(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.TimeDaystoYears parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.TimeDaystoYears(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setFollowUpInUnit(voLookup2);
		}
				// FollowUpHCP
		valueObject.setFollowUpHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getFollowUpHCP()) );
		// FollowUpSpecialty
		ims.domain.lookups.LookupInstance instance4 = domainObject.getFollowUpSpecialty();
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

			ims.core.vo.lookups.Specialty voLookup4 = new ims.core.vo.lookups.Specialty(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.Specialty(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setFollowUpSpecialty(voLookup4);
		}
				// Location
		valueObject.setLocation(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getLocation()) );
		// HospitalFollowUp
		ims.domain.lookups.LookupInstance instance6 = domainObject.getHospitalFollowUp();
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

			ims.core.vo.lookups.YesNo voLookup6 = new ims.core.vo.lookups.YesNo(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.YesNo(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setHospitalFollowUp(voLookup6);
		}
				// HospitalToFollowUp
		if (domainObject.getHospitalToFollowUp() != null)
		{
			if(domainObject.getHospitalToFollowUp() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getHospitalToFollowUp();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setHospitalToFollowUp(new ims.core.resource.place.vo.LocationRefVo(id, -1));				
			}
			else
			{
				valueObject.setHospitalToFollowUp(new ims.core.resource.place.vo.LocationRefVo(domainObject.getHospitalToFollowUp().getId(), domainObject.getHospitalToFollowUp().getVersion()));
			}
		}
		// FollowUpType
		ims.domain.lookups.LookupInstance instance8 = domainObject.getFollowUpType();
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

			ims.core.vo.lookups.FollowUpType voLookup8 = new ims.core.vo.lookups.FollowUpType(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.FollowUpType parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.FollowUpType(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setFollowUpType(voLookup8);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.edischarge.domain.objects.FuturePlanFollowUp extractFuturePlanFollowUp(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeFuturePlanFollowUpVo valueObject) 
	{
		return 	extractFuturePlanFollowUp(domainFactory, valueObject, new HashMap());
	}

	public static ims.edischarge.domain.objects.FuturePlanFollowUp extractFuturePlanFollowUp(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeFuturePlanFollowUpVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_FuturePlanFollowUp();
		ims.edischarge.domain.objects.FuturePlanFollowUp domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.edischarge.domain.objects.FuturePlanFollowUp)domMap.get(valueObject);
			}
			// ims.clinical.vo.DischargeFuturePlanFollowUpVo ID_FuturePlanFollowUp field is unknown
			domainObject = new ims.edischarge.domain.objects.FuturePlanFollowUp();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_FuturePlanFollowUp());
			if (domMap.get(key) != null)
			{
				return (ims.edischarge.domain.objects.FuturePlanFollowUp)domMap.get(key);
			}
			domainObject = (ims.edischarge.domain.objects.FuturePlanFollowUp) domainFactory.getDomainObject(ims.edischarge.domain.objects.FuturePlanFollowUp.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_FuturePlanFollowUp());

		domainObject.setFollowUpInValue(valueObject.getFollowUpInValue());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getFollowUpInUnit() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getFollowUpInUnit().getID());
		}
		domainObject.setFollowUpInUnit(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value3 = null;
		if ( null != valueObject.getFollowUpHCP() ) 
		{
			if (valueObject.getFollowUpHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getFollowUpHCP()) != null)
				{
					value3 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getFollowUpHCP());
				}
			}
			else
			{
				value3 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getFollowUpHCP().getBoId());
			}
		}
		domainObject.setFollowUpHCP(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getFollowUpSpecialty() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getFollowUpSpecialty().getID());
		}
		domainObject.setFollowUpSpecialty(value4);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value5 = null;
		if ( null != valueObject.getLocation() ) 
		{
			if (valueObject.getLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getLocation()) != null)
				{
					value5 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getLocation());
				}
			}
			else
			{
				value5 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getLocation().getBoId());
			}
		}
		domainObject.setLocation(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getHospitalFollowUp() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getHospitalFollowUp().getID());
		}
		domainObject.setHospitalFollowUp(value6);
		ims.core.resource.place.domain.objects.Location value7 = null;
		if ( null != valueObject.getHospitalToFollowUp() ) 
		{
			if (valueObject.getHospitalToFollowUp().getBoId() == null)
			{
				if (domMap.get(valueObject.getHospitalToFollowUp()) != null)
				{
					value7 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getHospitalToFollowUp());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value7 = domainObject.getHospitalToFollowUp();	
			}
			else
			{
				value7 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getHospitalToFollowUp().getBoId());
			}
		}
		domainObject.setHospitalToFollowUp(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getFollowUpType() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getFollowUpType().getID());
		}
		domainObject.setFollowUpType(value8);

		return domainObject;
	}

}
