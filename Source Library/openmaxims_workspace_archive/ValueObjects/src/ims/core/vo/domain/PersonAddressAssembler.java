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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author John MacEnri
 */
public class PersonAddressAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PersonAddress copy(ims.core.vo.PersonAddress valueObjectDest, ims.core.vo.PersonAddress valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Address(valueObjectSrc.getID_Address());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// line1
		valueObjectDest.setLine1(valueObjectSrc.getLine1());
		// line2
		valueObjectDest.setLine2(valueObjectSrc.getLine2());
		// line3
		valueObjectDest.setLine3(valueObjectSrc.getLine3());
		// line4
		valueObjectDest.setLine4(valueObjectSrc.getLine4());
		// line5
		valueObjectDest.setLine5(valueObjectSrc.getLine5());
		// postCode
		valueObjectDest.setPostCode(valueObjectSrc.getPostCode());
		// phone
		valueObjectDest.setPhone(valueObjectSrc.getPhone());
		// county
		valueObjectDest.setCounty(valueObjectSrc.getCounty());
		// fax
		valueObjectDest.setFax(valueObjectSrc.getFax());
		// UpdateDate
		valueObjectDest.setUpdateDate(valueObjectSrc.getUpdateDate());
		// NotificationDate
		valueObjectDest.setNotificationDate(valueObjectSrc.getNotificationDate());
		// AddressType
		valueObjectDest.setAddressType(valueObjectSrc.getAddressType());
		// PCT
		valueObjectDest.setPCT(valueObjectSrc.getPCT());
		// Otherphone
		valueObjectDest.setOtherphone(valueObjectSrc.getOtherphone());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPersonAddressCollectionFromAddress(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.generic.domain.objects.Address objects.
	 */
	public static ims.core.vo.PersonAddressCollection createPersonAddressCollectionFromAddress(java.util.Set domainObjectSet)	
	{
		return createPersonAddressCollectionFromAddress(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.generic.domain.objects.Address objects.
	 */
	public static ims.core.vo.PersonAddressCollection createPersonAddressCollectionFromAddress(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PersonAddressCollection voList = new ims.core.vo.PersonAddressCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.generic.domain.objects.Address domainObject = (ims.core.generic.domain.objects.Address) iterator.next();
			ims.core.vo.PersonAddress vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.generic.domain.objects.Address objects.
	 */
	public static ims.core.vo.PersonAddressCollection createPersonAddressCollectionFromAddress(java.util.List domainObjectList) 
	{
		return createPersonAddressCollectionFromAddress(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.generic.domain.objects.Address objects.
	 */
	public static ims.core.vo.PersonAddressCollection createPersonAddressCollectionFromAddress(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PersonAddressCollection voList = new ims.core.vo.PersonAddressCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.generic.domain.objects.Address domainObject = (ims.core.generic.domain.objects.Address) domainObjectList.get(i);
			ims.core.vo.PersonAddress vo = create(map, domainObject);

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
	 * Create the ims.core.generic.domain.objects.Address set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractAddressSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PersonAddressCollection voCollection) 
	 {
	 	return extractAddressSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractAddressSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PersonAddressCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PersonAddress vo = voCollection.get(i);
			ims.core.generic.domain.objects.Address domainObject = PersonAddressAssembler.extractAddress(domainFactory, vo, domMap);

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
	 * Create the ims.core.generic.domain.objects.Address list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractAddressList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PersonAddressCollection voCollection) 
	 {
	 	return extractAddressList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractAddressList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PersonAddressCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PersonAddress vo = voCollection.get(i);
			ims.core.generic.domain.objects.Address domainObject = PersonAddressAssembler.extractAddress(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.generic.domain.objects.Address object.
	 * @param domainObject ims.core.generic.domain.objects.Address
	 */
	 public static ims.core.vo.PersonAddress create(ims.core.generic.domain.objects.Address domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.generic.domain.objects.Address object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PersonAddress create(DomainObjectMap map, ims.core.generic.domain.objects.Address domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PersonAddress valueObject = (ims.core.vo.PersonAddress) map.getValueObject(domainObject, ims.core.vo.PersonAddress.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PersonAddress(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.generic.domain.objects.Address
	 */
	 public static ims.core.vo.PersonAddress insert(ims.core.vo.PersonAddress valueObject, ims.core.generic.domain.objects.Address domainObject) 
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
	 * @param domainObject ims.core.generic.domain.objects.Address
	 */
	 public static ims.core.vo.PersonAddress insert(DomainObjectMap map, ims.core.vo.PersonAddress valueObject, ims.core.generic.domain.objects.Address domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Address(domainObject.getId());
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
			
		// line1
		valueObject.setLine1(domainObject.getLine1());
		// line2
		valueObject.setLine2(domainObject.getLine2());
		// line3
		valueObject.setLine3(domainObject.getLine3());
		// line4
		valueObject.setLine4(domainObject.getLine4());
		// line5
		valueObject.setLine5(domainObject.getLine5());
		// postCode
		valueObject.setPostCode(domainObject.getPostCode());
		// phone
		valueObject.setPhone(domainObject.getPhone());
		// county
		ims.domain.lookups.LookupInstance instance8 = domainObject.getCounty();
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

			ims.ntpf.vo.lookups.County voLookup8 = new ims.ntpf.vo.lookups.County(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.ntpf.vo.lookups.County parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.ntpf.vo.lookups.County(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setCounty(voLookup8);
		}
				// fax
		valueObject.setFax(domainObject.getFax());
		// UpdateDate
		java.util.Date UpdateDate = domainObject.getUpdateDate();
		if ( null != UpdateDate ) 
		{
			valueObject.setUpdateDate(new ims.framework.utils.DateTime(UpdateDate) );
		}
		// NotificationDate
		java.util.Date NotificationDate = domainObject.getNotificationDate();
		if ( null != NotificationDate ) 
		{
			valueObject.setNotificationDate(new ims.framework.utils.Date(NotificationDate) );
		}
		// AddressType
		ims.domain.lookups.LookupInstance instance12 = domainObject.getAddressType();
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

			ims.core.vo.lookups.AddressType voLookup12 = new ims.core.vo.lookups.AddressType(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.core.vo.lookups.AddressType parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.core.vo.lookups.AddressType(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setAddressType(voLookup12);
		}
				// PCT
		valueObject.setPCT(domainObject.getPCT());
		// Otherphone
		valueObject.setOtherphone(domainObject.getOtherphone());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.generic.domain.objects.Address extractAddress(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PersonAddress valueObject) 
	{
		return 	extractAddress(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.generic.domain.objects.Address extractAddress(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PersonAddress valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Address();
		ims.core.generic.domain.objects.Address domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.generic.domain.objects.Address)domMap.get(valueObject);
			}
			// ims.core.vo.PersonAddress ID_Address field is unknown
			domainObject = new ims.core.generic.domain.objects.Address();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Address());
			if (domMap.get(key) != null)
			{
				return (ims.core.generic.domain.objects.Address)domMap.get(key);
			}
			domainObject = (ims.core.generic.domain.objects.Address) domainFactory.getDomainObject(ims.core.generic.domain.objects.Address.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Address());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLine1() != null && valueObject.getLine1().equals(""))
		{
			valueObject.setLine1(null);
		}
		domainObject.setLine1(valueObject.getLine1());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLine2() != null && valueObject.getLine2().equals(""))
		{
			valueObject.setLine2(null);
		}
		domainObject.setLine2(valueObject.getLine2());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLine3() != null && valueObject.getLine3().equals(""))
		{
			valueObject.setLine3(null);
		}
		domainObject.setLine3(valueObject.getLine3());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLine4() != null && valueObject.getLine4().equals(""))
		{
			valueObject.setLine4(null);
		}
		domainObject.setLine4(valueObject.getLine4());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLine5() != null && valueObject.getLine5().equals(""))
		{
			valueObject.setLine5(null);
		}
		domainObject.setLine5(valueObject.getLine5());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPostCode() != null && valueObject.getPostCode().equals(""))
		{
			valueObject.setPostCode(null);
		}
		domainObject.setPostCode(valueObject.getPostCode());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPhone() != null && valueObject.getPhone().equals(""))
		{
			valueObject.setPhone(null);
		}
		domainObject.setPhone(valueObject.getPhone());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getCounty() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getCounty().getID());
		}
		domainObject.setCounty(value8);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getFax() != null && valueObject.getFax().equals(""))
		{
			valueObject.setFax(null);
		}
		domainObject.setFax(valueObject.getFax());
		ims.framework.utils.DateTime dateTime10 = valueObject.getUpdateDate();
		java.util.Date value10 = null;
		if ( dateTime10 != null ) 
		{
			value10 = dateTime10.getJavaDate();
		}
		domainObject.setUpdateDate(value10);
		java.util.Date value11 = null;
		ims.framework.utils.Date date11 = valueObject.getNotificationDate();		
		if ( date11 != null ) 
		{
			value11 = date11.getDate();
		}
		domainObject.setNotificationDate(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getAddressType() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getAddressType().getID());
		}
		domainObject.setAddressType(value12);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPCT() != null && valueObject.getPCT().equals(""))
		{
			valueObject.setPCT(null);
		}
		domainObject.setPCT(valueObject.getPCT());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOtherphone() != null && valueObject.getOtherphone().equals(""))
		{
			valueObject.setOtherphone(null);
		}
		domainObject.setOtherphone(valueObject.getOtherphone());

		return domainObject;
	}

}
