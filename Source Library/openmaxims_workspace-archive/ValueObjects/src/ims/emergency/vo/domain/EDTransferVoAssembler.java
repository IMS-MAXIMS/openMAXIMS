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
package ims.emergency.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cornel Ventuneac
 */
public class EDTransferVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.EDTransferVo copy(ims.emergency.vo.EDTransferVo valueObjectDest, ims.emergency.vo.EDTransferVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_EDTransfer(valueObjectSrc.getID_EDTransfer());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ReferredDateTime
		valueObjectDest.setReferredDateTime(valueObjectSrc.getReferredDateTime());
		// AcceptedDateTime
		valueObjectDest.setAcceptedDateTime(valueObjectSrc.getAcceptedDateTime());
		// ToHospital
		valueObjectDest.setToHospital(valueObjectSrc.getToHospital());
		// OtherHospital
		valueObjectDest.setOtherHospital(valueObjectSrc.getOtherHospital());
		// TransferMode
		valueObjectDest.setTransferMode(valueObjectSrc.getTransferMode());
		// TransferEscort
		valueObjectDest.setTransferEscort(valueObjectSrc.getTransferEscort());
		// Comment
		valueObjectDest.setComment(valueObjectSrc.getComment());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createEDTransferVoCollectionFromEDTransfer(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.emergency.domain.objects.EDTransfer objects.
	 */
	public static ims.emergency.vo.EDTransferVoCollection createEDTransferVoCollectionFromEDTransfer(java.util.Set domainObjectSet)	
	{
		return createEDTransferVoCollectionFromEDTransfer(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.emergency.domain.objects.EDTransfer objects.
	 */
	public static ims.emergency.vo.EDTransferVoCollection createEDTransferVoCollectionFromEDTransfer(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.EDTransferVoCollection voList = new ims.emergency.vo.EDTransferVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.emergency.domain.objects.EDTransfer domainObject = (ims.emergency.domain.objects.EDTransfer) iterator.next();
			ims.emergency.vo.EDTransferVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.emergency.domain.objects.EDTransfer objects.
	 */
	public static ims.emergency.vo.EDTransferVoCollection createEDTransferVoCollectionFromEDTransfer(java.util.List domainObjectList) 
	{
		return createEDTransferVoCollectionFromEDTransfer(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.emergency.domain.objects.EDTransfer objects.
	 */
	public static ims.emergency.vo.EDTransferVoCollection createEDTransferVoCollectionFromEDTransfer(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.EDTransferVoCollection voList = new ims.emergency.vo.EDTransferVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.emergency.domain.objects.EDTransfer domainObject = (ims.emergency.domain.objects.EDTransfer) domainObjectList.get(i);
			ims.emergency.vo.EDTransferVo vo = create(map, domainObject);

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
	 * Create the ims.emergency.domain.objects.EDTransfer set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractEDTransferSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EDTransferVoCollection voCollection) 
	 {
	 	return extractEDTransferSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractEDTransferSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EDTransferVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.EDTransferVo vo = voCollection.get(i);
			ims.emergency.domain.objects.EDTransfer domainObject = EDTransferVoAssembler.extractEDTransfer(domainFactory, vo, domMap);

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
	 * Create the ims.emergency.domain.objects.EDTransfer list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractEDTransferList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EDTransferVoCollection voCollection) 
	 {
	 	return extractEDTransferList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractEDTransferList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EDTransferVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.EDTransferVo vo = voCollection.get(i);
			ims.emergency.domain.objects.EDTransfer domainObject = EDTransferVoAssembler.extractEDTransfer(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.emergency.domain.objects.EDTransfer object.
	 * @param domainObject ims.emergency.domain.objects.EDTransfer
	 */
	 public static ims.emergency.vo.EDTransferVo create(ims.emergency.domain.objects.EDTransfer domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.emergency.domain.objects.EDTransfer object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.emergency.vo.EDTransferVo create(DomainObjectMap map, ims.emergency.domain.objects.EDTransfer domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.EDTransferVo valueObject = (ims.emergency.vo.EDTransferVo) map.getValueObject(domainObject, ims.emergency.vo.EDTransferVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.EDTransferVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.emergency.domain.objects.EDTransfer
	 */
	 public static ims.emergency.vo.EDTransferVo insert(ims.emergency.vo.EDTransferVo valueObject, ims.emergency.domain.objects.EDTransfer domainObject) 
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
	 * @param domainObject ims.emergency.domain.objects.EDTransfer
	 */
	 public static ims.emergency.vo.EDTransferVo insert(DomainObjectMap map, ims.emergency.vo.EDTransferVo valueObject, ims.emergency.domain.objects.EDTransfer domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_EDTransfer(domainObject.getId());
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
			
		// ReferredDateTime
		java.util.Date ReferredDateTime = domainObject.getReferredDateTime();
		if ( null != ReferredDateTime ) 
		{
			valueObject.setReferredDateTime(new ims.framework.utils.DateTime(ReferredDateTime) );
		}
		// AcceptedDateTime
		java.util.Date AcceptedDateTime = domainObject.getAcceptedDateTime();
		if ( null != AcceptedDateTime ) 
		{
			valueObject.setAcceptedDateTime(new ims.framework.utils.DateTime(AcceptedDateTime) );
		}
		// ToHospital
		ims.domain.lookups.LookupInstance instance3 = domainObject.getToHospital();
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

			ims.emergency.vo.lookups.TransferToHospital voLookup3 = new ims.emergency.vo.lookups.TransferToHospital(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.emergency.vo.lookups.TransferToHospital parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.emergency.vo.lookups.TransferToHospital(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setToHospital(voLookup3);
		}
				// OtherHospital
		valueObject.setOtherHospital(domainObject.getOtherHospital());
		// TransferMode
		ims.domain.lookups.LookupInstance instance5 = domainObject.getTransferMode();
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

			ims.emergency.vo.lookups.ModeOfArrival voLookup5 = new ims.emergency.vo.lookups.ModeOfArrival(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.emergency.vo.lookups.ModeOfArrival parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.emergency.vo.lookups.ModeOfArrival(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setTransferMode(voLookup5);
		}
				// TransferEscort
		ims.domain.lookups.LookupInstance instance6 = domainObject.getTransferEscort();
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

			ims.emergency.vo.lookups.TransferEscort voLookup6 = new ims.emergency.vo.lookups.TransferEscort(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.emergency.vo.lookups.TransferEscort parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.emergency.vo.lookups.TransferEscort(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setTransferEscort(voLookup6);
		}
				// Comment
		valueObject.setComment(domainObject.getComment());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.emergency.domain.objects.EDTransfer extractEDTransfer(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EDTransferVo valueObject) 
	{
		return 	extractEDTransfer(domainFactory, valueObject, new HashMap());
	}

	public static ims.emergency.domain.objects.EDTransfer extractEDTransfer(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EDTransferVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_EDTransfer();
		ims.emergency.domain.objects.EDTransfer domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.emergency.domain.objects.EDTransfer)domMap.get(valueObject);
			}
			// ims.emergency.vo.EDTransferVo ID_EDTransfer field is unknown
			domainObject = new ims.emergency.domain.objects.EDTransfer();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_EDTransfer());
			if (domMap.get(key) != null)
			{
				return (ims.emergency.domain.objects.EDTransfer)domMap.get(key);
			}
			domainObject = (ims.emergency.domain.objects.EDTransfer) domainFactory.getDomainObject(ims.emergency.domain.objects.EDTransfer.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_EDTransfer());

		ims.framework.utils.DateTime dateTime1 = valueObject.getReferredDateTime();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setReferredDateTime(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getAcceptedDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setAcceptedDateTime(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getToHospital() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getToHospital().getID());
		}
		domainObject.setToHospital(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOtherHospital() != null && valueObject.getOtherHospital().equals(""))
		{
			valueObject.setOtherHospital(null);
		}
		domainObject.setOtherHospital(valueObject.getOtherHospital());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getTransferMode() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getTransferMode().getID());
		}
		domainObject.setTransferMode(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getTransferEscort() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getTransferEscort().getID());
		}
		domainObject.setTransferEscort(value6);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComment() != null && valueObject.getComment().equals(""))
		{
			valueObject.setComment(null);
		}
		domainObject.setComment(valueObject.getComment());

		return domainObject;
	}

}
