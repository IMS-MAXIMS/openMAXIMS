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
 * @author Cristian Belciug
 */
public class TourniquetDetailVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.TourniquetDetailVo copy(ims.clinical.vo.TourniquetDetailVo valueObjectDest, ims.clinical.vo.TourniquetDetailVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_TourniquetDetail(valueObjectSrc.getID_TourniquetDetail());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Tourniquet
		valueObjectDest.setTourniquet(valueObjectSrc.getTourniquet());
		// TourniquetPosition
		valueObjectDest.setTourniquetPosition(valueObjectSrc.getTourniquetPosition());
		// TourniquetPressure
		valueObjectDest.setTourniquetPressure(valueObjectSrc.getTourniquetPressure());
		// TimeOn
		valueObjectDest.setTimeOn(valueObjectSrc.getTimeOn());
		// TimeOff
		valueObjectDest.setTimeOff(valueObjectSrc.getTimeOff());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTourniquetDetailVoCollectionFromTourniquetDetail(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.TourniquetDetail objects.
	 */
	public static ims.clinical.vo.TourniquetDetailVoCollection createTourniquetDetailVoCollectionFromTourniquetDetail(java.util.Set domainObjectSet)	
	{
		return createTourniquetDetailVoCollectionFromTourniquetDetail(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.TourniquetDetail objects.
	 */
	public static ims.clinical.vo.TourniquetDetailVoCollection createTourniquetDetailVoCollectionFromTourniquetDetail(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.TourniquetDetailVoCollection voList = new ims.clinical.vo.TourniquetDetailVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.TourniquetDetail domainObject = (ims.core.clinical.domain.objects.TourniquetDetail) iterator.next();
			ims.clinical.vo.TourniquetDetailVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.TourniquetDetail objects.
	 */
	public static ims.clinical.vo.TourniquetDetailVoCollection createTourniquetDetailVoCollectionFromTourniquetDetail(java.util.List domainObjectList) 
	{
		return createTourniquetDetailVoCollectionFromTourniquetDetail(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.TourniquetDetail objects.
	 */
	public static ims.clinical.vo.TourniquetDetailVoCollection createTourniquetDetailVoCollectionFromTourniquetDetail(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.TourniquetDetailVoCollection voList = new ims.clinical.vo.TourniquetDetailVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.TourniquetDetail domainObject = (ims.core.clinical.domain.objects.TourniquetDetail) domainObjectList.get(i);
			ims.clinical.vo.TourniquetDetailVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.TourniquetDetail set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTourniquetDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TourniquetDetailVoCollection voCollection) 
	 {
	 	return extractTourniquetDetailSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTourniquetDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TourniquetDetailVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.TourniquetDetailVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.TourniquetDetail domainObject = TourniquetDetailVoAssembler.extractTourniquetDetail(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.TourniquetDetail list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTourniquetDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TourniquetDetailVoCollection voCollection) 
	 {
	 	return extractTourniquetDetailList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTourniquetDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TourniquetDetailVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.TourniquetDetailVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.TourniquetDetail domainObject = TourniquetDetailVoAssembler.extractTourniquetDetail(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.TourniquetDetail object.
	 * @param domainObject ims.core.clinical.domain.objects.TourniquetDetail
	 */
	 public static ims.clinical.vo.TourniquetDetailVo create(ims.core.clinical.domain.objects.TourniquetDetail domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.TourniquetDetail object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.TourniquetDetailVo create(DomainObjectMap map, ims.core.clinical.domain.objects.TourniquetDetail domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.TourniquetDetailVo valueObject = (ims.clinical.vo.TourniquetDetailVo) map.getValueObject(domainObject, ims.clinical.vo.TourniquetDetailVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.TourniquetDetailVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.TourniquetDetail
	 */
	 public static ims.clinical.vo.TourniquetDetailVo insert(ims.clinical.vo.TourniquetDetailVo valueObject, ims.core.clinical.domain.objects.TourniquetDetail domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.TourniquetDetail
	 */
	 public static ims.clinical.vo.TourniquetDetailVo insert(DomainObjectMap map, ims.clinical.vo.TourniquetDetailVo valueObject, ims.core.clinical.domain.objects.TourniquetDetail domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_TourniquetDetail(domainObject.getId());
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
			
		// Tourniquet
		ims.domain.lookups.LookupInstance instance1 = domainObject.getTourniquet();
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

			ims.core.vo.lookups.YesNo voLookup1 = new ims.core.vo.lookups.YesNo(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.core.vo.lookups.YesNo(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setTourniquet(voLookup1);
		}
				// TourniquetPosition
		ims.domain.lookups.LookupInstance instance2 = domainObject.getTourniquetPosition();
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

			ims.clinical.vo.lookups.TourniquetPosition voLookup2 = new ims.clinical.vo.lookups.TourniquetPosition(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.clinical.vo.lookups.TourniquetPosition parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.clinical.vo.lookups.TourniquetPosition(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setTourniquetPosition(voLookup2);
		}
				// TourniquetPressure
		ims.domain.lookups.LookupInstance instance3 = domainObject.getTourniquetPressure();
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

			ims.clinical.vo.lookups.TourniquetPressure voLookup3 = new ims.clinical.vo.lookups.TourniquetPressure(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.clinical.vo.lookups.TourniquetPressure parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.clinical.vo.lookups.TourniquetPressure(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setTourniquetPressure(voLookup3);
		}
				// TimeOn
		java.util.Date TimeOn = domainObject.getTimeOn();
		if ( null != TimeOn ) 
		{
			valueObject.setTimeOn(new ims.framework.utils.DateTime(TimeOn) );
		}
		// TimeOff
		java.util.Date TimeOff = domainObject.getTimeOff();
		if ( null != TimeOff ) 
		{
			valueObject.setTimeOff(new ims.framework.utils.DateTime(TimeOff) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.TourniquetDetail extractTourniquetDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TourniquetDetailVo valueObject) 
	{
		return 	extractTourniquetDetail(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.TourniquetDetail extractTourniquetDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TourniquetDetailVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_TourniquetDetail();
		ims.core.clinical.domain.objects.TourniquetDetail domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.TourniquetDetail)domMap.get(valueObject);
			}
			// ims.clinical.vo.TourniquetDetailVo ID_TourniquetDetail field is unknown
			domainObject = new ims.core.clinical.domain.objects.TourniquetDetail();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_TourniquetDetail());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.TourniquetDetail)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.TourniquetDetail) domainFactory.getDomainObject(ims.core.clinical.domain.objects.TourniquetDetail.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_TourniquetDetail());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getTourniquet() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getTourniquet().getID());
		}
		domainObject.setTourniquet(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getTourniquetPosition() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getTourniquetPosition().getID());
		}
		domainObject.setTourniquetPosition(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getTourniquetPressure() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getTourniquetPressure().getID());
		}
		domainObject.setTourniquetPressure(value3);
		ims.framework.utils.DateTime dateTime4 = valueObject.getTimeOn();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setTimeOn(value4);
		ims.framework.utils.DateTime dateTime5 = valueObject.getTimeOff();
		java.util.Date value5 = null;
		if ( dateTime5 != null ) 
		{
			value5 = dateTime5.getJavaDate();
		}
		domainObject.setTimeOff(value5);

		return domainObject;
	}

}
