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
 * @author Sean Nesbitt
 */
public class PDSAddrVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PDSAddrVo copy(ims.core.vo.PDSAddrVo valueObjectDest, ims.core.vo.PDSAddrVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PDSAddr(valueObjectSrc.getID_PDSAddr());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AddressLines
		valueObjectDest.setAddressLines(valueObjectSrc.getAddressLines());
		// Postcode
		valueObjectDest.setPostcode(valueObjectSrc.getPostcode());
		// AddressKey
		valueObjectDest.setAddressKey(valueObjectSrc.getAddressKey());
		// Description
		valueObjectDest.setDescription(valueObjectSrc.getDescription());
		// AddressType
		valueObjectDest.setAddressType(valueObjectSrc.getAddressType());
		// beffdate
		valueObjectDest.setBeffdate(valueObjectSrc.getBeffdate());
		// beffdatecnf
		valueObjectDest.setBeffdatecnf(valueObjectSrc.getBeffdatecnf());
		// betdate
		valueObjectDest.setBetdate(valueObjectSrc.getBetdate());
		// betdatecnf
		valueObjectDest.setBetdatecnf(valueObjectSrc.getBetdatecnf());
		// pdsUpdateMode
		valueObjectDest.setPdsUpdateMode(valueObjectSrc.getPdsUpdateMode());
		// objectIdentifier
		valueObjectDest.setObjectIdentifier(valueObjectSrc.getObjectIdentifier());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPDSAddrVoCollectionFromPDSAddr(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.PDSAddr objects.
	 */
	public static ims.core.vo.PDSAddrVoCollection createPDSAddrVoCollectionFromPDSAddr(java.util.Set domainObjectSet)	
	{
		return createPDSAddrVoCollectionFromPDSAddr(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.PDSAddr objects.
	 */
	public static ims.core.vo.PDSAddrVoCollection createPDSAddrVoCollectionFromPDSAddr(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PDSAddrVoCollection voList = new ims.core.vo.PDSAddrVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.patient.domain.objects.PDSAddr domainObject = (ims.core.patient.domain.objects.PDSAddr) iterator.next();
			ims.core.vo.PDSAddrVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.patient.domain.objects.PDSAddr objects.
	 */
	public static ims.core.vo.PDSAddrVoCollection createPDSAddrVoCollectionFromPDSAddr(java.util.List domainObjectList) 
	{
		return createPDSAddrVoCollectionFromPDSAddr(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.patient.domain.objects.PDSAddr objects.
	 */
	public static ims.core.vo.PDSAddrVoCollection createPDSAddrVoCollectionFromPDSAddr(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PDSAddrVoCollection voList = new ims.core.vo.PDSAddrVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.patient.domain.objects.PDSAddr domainObject = (ims.core.patient.domain.objects.PDSAddr) domainObjectList.get(i);
			ims.core.vo.PDSAddrVo vo = create(map, domainObject);

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
	 * Create the ims.core.patient.domain.objects.PDSAddr set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPDSAddrSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSAddrVoCollection voCollection) 
	 {
	 	return extractPDSAddrSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPDSAddrSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSAddrVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PDSAddrVo vo = voCollection.get(i);
			ims.core.patient.domain.objects.PDSAddr domainObject = PDSAddrVoAssembler.extractPDSAddr(domainFactory, vo, domMap);

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
	 * Create the ims.core.patient.domain.objects.PDSAddr list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPDSAddrList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSAddrVoCollection voCollection) 
	 {
	 	return extractPDSAddrList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPDSAddrList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSAddrVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PDSAddrVo vo = voCollection.get(i);
			ims.core.patient.domain.objects.PDSAddr domainObject = PDSAddrVoAssembler.extractPDSAddr(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.patient.domain.objects.PDSAddr object.
	 * @param domainObject ims.core.patient.domain.objects.PDSAddr
	 */
	 public static ims.core.vo.PDSAddrVo create(ims.core.patient.domain.objects.PDSAddr domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.patient.domain.objects.PDSAddr object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PDSAddrVo create(DomainObjectMap map, ims.core.patient.domain.objects.PDSAddr domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PDSAddrVo valueObject = (ims.core.vo.PDSAddrVo) map.getValueObject(domainObject, ims.core.vo.PDSAddrVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PDSAddrVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.patient.domain.objects.PDSAddr
	 */
	 public static ims.core.vo.PDSAddrVo insert(ims.core.vo.PDSAddrVo valueObject, ims.core.patient.domain.objects.PDSAddr domainObject) 
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
	 * @param domainObject ims.core.patient.domain.objects.PDSAddr
	 */
	 public static ims.core.vo.PDSAddrVo insert(DomainObjectMap map, ims.core.vo.PDSAddrVo valueObject, ims.core.patient.domain.objects.PDSAddr domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PDSAddr(domainObject.getId());
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
			
		// AddressLines
		valueObject.setAddressLines(domainObject.getAddressLines());
		// Postcode
		valueObject.setPostcode(domainObject.getPostcode());
		// AddressKey
		valueObject.setAddressKey(domainObject.getAddressKey());
		// Description
		valueObject.setDescription(domainObject.getDescription());
		// AddressType
		ims.domain.lookups.LookupInstance instance5 = domainObject.getAddressType();
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

			ims.core.vo.lookups.AddressType voLookup5 = new ims.core.vo.lookups.AddressType(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.AddressType parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.AddressType(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setAddressType(voLookup5);
		}
				// beffdate
		valueObject.setBeffdate( domainObject.isBeffdate() );
		// beffdatecnf
		valueObject.setBeffdatecnf( domainObject.isBeffdatecnf() );
		// betdate
		java.util.Date betdate = domainObject.getBetdate();
		if ( null != betdate ) 
		{
			valueObject.setBetdate(new ims.framework.utils.Date(betdate) );
		}
		// betdatecnf
		valueObject.setBetdatecnf( domainObject.isBetdatecnf() );
		// pdsUpdateMode
		ims.domain.lookups.LookupInstance instance10 = domainObject.getPdsUpdateMode();
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

			ims.core.vo.lookups.PDSUpdateMode voLookup10 = new ims.core.vo.lookups.PDSUpdateMode(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.PDSUpdateMode parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.core.vo.lookups.PDSUpdateMode(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setPdsUpdateMode(voLookup10);
		}
				// objectIdentifier
		valueObject.setObjectIdentifier(domainObject.getObjectIdentifier());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.patient.domain.objects.PDSAddr extractPDSAddr(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSAddrVo valueObject) 
	{
		return 	extractPDSAddr(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.patient.domain.objects.PDSAddr extractPDSAddr(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSAddrVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PDSAddr();
		ims.core.patient.domain.objects.PDSAddr domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.patient.domain.objects.PDSAddr)domMap.get(valueObject);
			}
			// ims.core.vo.PDSAddrVo ID_PDSAddr field is unknown
			domainObject = new ims.core.patient.domain.objects.PDSAddr();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PDSAddr());
			if (domMap.get(key) != null)
			{
				return (ims.core.patient.domain.objects.PDSAddr)domMap.get(key);
			}
			domainObject = (ims.core.patient.domain.objects.PDSAddr) domainFactory.getDomainObject(ims.core.patient.domain.objects.PDSAddr.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PDSAddr());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAddressLines() != null && valueObject.getAddressLines().equals(""))
		{
			valueObject.setAddressLines(null);
		}
		domainObject.setAddressLines(valueObject.getAddressLines());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPostcode() != null && valueObject.getPostcode().equals(""))
		{
			valueObject.setPostcode(null);
		}
		domainObject.setPostcode(valueObject.getPostcode());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAddressKey() != null && valueObject.getAddressKey().equals(""))
		{
			valueObject.setAddressKey(null);
		}
		domainObject.setAddressKey(valueObject.getAddressKey());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDescription() != null && valueObject.getDescription().equals(""))
		{
			valueObject.setDescription(null);
		}
		domainObject.setDescription(valueObject.getDescription());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getAddressType() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getAddressType().getID());
		}
		domainObject.setAddressType(value5);
		domainObject.setBeffdate(valueObject.getBeffdate());
		domainObject.setBeffdatecnf(valueObject.getBeffdatecnf());
		java.util.Date value8 = null;
		ims.framework.utils.Date date8 = valueObject.getBetdate();		
		if ( date8 != null ) 
		{
			value8 = date8.getDate();
		}
		domainObject.setBetdate(value8);
		domainObject.setBetdatecnf(valueObject.getBetdatecnf());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getPdsUpdateMode() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getPdsUpdateMode().getID());
		}
		domainObject.setPdsUpdateMode(value10);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getObjectIdentifier() != null && valueObject.getObjectIdentifier().equals(""))
		{
			valueObject.setObjectIdentifier(null);
		}
		domainObject.setObjectIdentifier(valueObject.getObjectIdentifier());

		return domainObject;
	}

}
