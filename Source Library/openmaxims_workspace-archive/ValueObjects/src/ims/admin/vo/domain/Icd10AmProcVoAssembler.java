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
package ims.admin.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author John MacEnri
 */
public class Icd10AmProcVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.admin.vo.Icd10AmProcVo copy(ims.admin.vo.Icd10AmProcVo valueObjectDest, ims.admin.vo.Icd10AmProcVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Icd10AmProc(valueObjectSrc.getID_Icd10AmProc());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// code_id
		valueObjectDest.setCode_id(valueObjectSrc.getCode_id());
		// block
		valueObjectDest.setBlock(valueObjectSrc.getBlock());
		// ascii_desc
		valueObjectDest.setAscii_desc(valueObjectSrc.getAscii_desc());
		// ascii_short_desc
		valueObjectDest.setAscii_short_desc(valueObjectSrc.getAscii_short_desc());
		// effective_from
		valueObjectDest.setEffective_from(valueObjectSrc.getEffective_from());
		// inactive
		valueObjectDest.setInactive(valueObjectSrc.getInactive());
		// sex
		valueObjectDest.setSex(valueObjectSrc.getSex());
		// stype
		valueObjectDest.setStype(valueObjectSrc.getStype());
		// ageL
		valueObjectDest.setAgeL(valueObjectSrc.getAgeL());
		// agelH
		valueObjectDest.setAgelH(valueObjectSrc.getAgelH());
		// atype
		valueObjectDest.setAtype(valueObjectSrc.getAtype());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createIcd10AmProcVoCollectionFromIcd10AmProc(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.coding.domain.objects.Icd10AmProc objects.
	 */
	public static ims.admin.vo.Icd10AmProcVoCollection createIcd10AmProcVoCollectionFromIcd10AmProc(java.util.Set domainObjectSet)	
	{
		return createIcd10AmProcVoCollectionFromIcd10AmProc(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.coding.domain.objects.Icd10AmProc objects.
	 */
	public static ims.admin.vo.Icd10AmProcVoCollection createIcd10AmProcVoCollectionFromIcd10AmProc(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.admin.vo.Icd10AmProcVoCollection voList = new ims.admin.vo.Icd10AmProcVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.coding.domain.objects.Icd10AmProc domainObject = (ims.core.clinical.coding.domain.objects.Icd10AmProc) iterator.next();
			ims.admin.vo.Icd10AmProcVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.coding.domain.objects.Icd10AmProc objects.
	 */
	public static ims.admin.vo.Icd10AmProcVoCollection createIcd10AmProcVoCollectionFromIcd10AmProc(java.util.List domainObjectList) 
	{
		return createIcd10AmProcVoCollectionFromIcd10AmProc(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.coding.domain.objects.Icd10AmProc objects.
	 */
	public static ims.admin.vo.Icd10AmProcVoCollection createIcd10AmProcVoCollectionFromIcd10AmProc(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.admin.vo.Icd10AmProcVoCollection voList = new ims.admin.vo.Icd10AmProcVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.coding.domain.objects.Icd10AmProc domainObject = (ims.core.clinical.coding.domain.objects.Icd10AmProc) domainObjectList.get(i);
			ims.admin.vo.Icd10AmProcVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.coding.domain.objects.Icd10AmProc set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractIcd10AmProcSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.Icd10AmProcVoCollection voCollection) 
	 {
	 	return extractIcd10AmProcSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractIcd10AmProcSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.Icd10AmProcVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.Icd10AmProcVo vo = voCollection.get(i);
			ims.core.clinical.coding.domain.objects.Icd10AmProc domainObject = Icd10AmProcVoAssembler.extractIcd10AmProc(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.coding.domain.objects.Icd10AmProc list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractIcd10AmProcList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.Icd10AmProcVoCollection voCollection) 
	 {
	 	return extractIcd10AmProcList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractIcd10AmProcList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.Icd10AmProcVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.Icd10AmProcVo vo = voCollection.get(i);
			ims.core.clinical.coding.domain.objects.Icd10AmProc domainObject = Icd10AmProcVoAssembler.extractIcd10AmProc(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.coding.domain.objects.Icd10AmProc object.
	 * @param domainObject ims.core.clinical.coding.domain.objects.Icd10AmProc
	 */
	 public static ims.admin.vo.Icd10AmProcVo create(ims.core.clinical.coding.domain.objects.Icd10AmProc domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.coding.domain.objects.Icd10AmProc object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.admin.vo.Icd10AmProcVo create(DomainObjectMap map, ims.core.clinical.coding.domain.objects.Icd10AmProc domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.admin.vo.Icd10AmProcVo valueObject = (ims.admin.vo.Icd10AmProcVo) map.getValueObject(domainObject, ims.admin.vo.Icd10AmProcVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.admin.vo.Icd10AmProcVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.coding.domain.objects.Icd10AmProc
	 */
	 public static ims.admin.vo.Icd10AmProcVo insert(ims.admin.vo.Icd10AmProcVo valueObject, ims.core.clinical.coding.domain.objects.Icd10AmProc domainObject) 
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
	 * @param domainObject ims.core.clinical.coding.domain.objects.Icd10AmProc
	 */
	 public static ims.admin.vo.Icd10AmProcVo insert(DomainObjectMap map, ims.admin.vo.Icd10AmProcVo valueObject, ims.core.clinical.coding.domain.objects.Icd10AmProc domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Icd10AmProc(domainObject.getId());
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
			
		// code_id
		valueObject.setCode_id(domainObject.getCode_id());
		// block
		valueObject.setBlock(ims.admin.vo.domain.Icd10AmBlockVoAssembler.create(map, domainObject.getBlock()) );
		// ascii_desc
		valueObject.setAscii_desc(domainObject.getAscii_desc());
		// ascii_short_desc
		valueObject.setAscii_short_desc(domainObject.getAscii_short_desc());
		// effective_from
		java.util.Date effective_from = domainObject.getEffective_from();
		if ( null != effective_from ) 
		{
			valueObject.setEffective_from(new ims.framework.utils.Date(effective_from) );
		}
		// inactive
		java.util.Date inactive = domainObject.getInactive();
		if ( null != inactive ) 
		{
			valueObject.setInactive(new ims.framework.utils.Date(inactive) );
		}
		// sex
		valueObject.setSex(domainObject.getSex());
		// stype
		valueObject.setStype(domainObject.getStype());
		// ageL
		valueObject.setAgeL(domainObject.getAgeL());
		// agelH
		valueObject.setAgelH(domainObject.getAgelH());
		// atype
		valueObject.setAtype(domainObject.getAtype());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.coding.domain.objects.Icd10AmProc extractIcd10AmProc(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.Icd10AmProcVo valueObject) 
	{
		return 	extractIcd10AmProc(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.coding.domain.objects.Icd10AmProc extractIcd10AmProc(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.Icd10AmProcVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Icd10AmProc();
		ims.core.clinical.coding.domain.objects.Icd10AmProc domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.coding.domain.objects.Icd10AmProc)domMap.get(valueObject);
			}
			// ims.admin.vo.Icd10AmProcVo ID_Icd10AmProc field is unknown
			domainObject = new ims.core.clinical.coding.domain.objects.Icd10AmProc();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Icd10AmProc());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.coding.domain.objects.Icd10AmProc)domMap.get(key);
			}
			domainObject = (ims.core.clinical.coding.domain.objects.Icd10AmProc) domainFactory.getDomainObject(ims.core.clinical.coding.domain.objects.Icd10AmProc.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Icd10AmProc());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCode_id() != null && valueObject.getCode_id().equals(""))
		{
			valueObject.setCode_id(null);
		}
		domainObject.setCode_id(valueObject.getCode_id());
		domainObject.setBlock(ims.admin.vo.domain.Icd10AmBlockVoAssembler.extractIcd10AmBlock(domainFactory, valueObject.getBlock(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAscii_desc() != null && valueObject.getAscii_desc().equals(""))
		{
			valueObject.setAscii_desc(null);
		}
		domainObject.setAscii_desc(valueObject.getAscii_desc());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAscii_short_desc() != null && valueObject.getAscii_short_desc().equals(""))
		{
			valueObject.setAscii_short_desc(null);
		}
		domainObject.setAscii_short_desc(valueObject.getAscii_short_desc());
		java.util.Date value5 = null;
		ims.framework.utils.Date date5 = valueObject.getEffective_from();		
		if ( date5 != null ) 
		{
			value5 = date5.getDate();
		}
		domainObject.setEffective_from(value5);
		java.util.Date value6 = null;
		ims.framework.utils.Date date6 = valueObject.getInactive();		
		if ( date6 != null ) 
		{
			value6 = date6.getDate();
		}
		domainObject.setInactive(value6);
		domainObject.setSex(valueObject.getSex());
		domainObject.setStype(valueObject.getStype());
		domainObject.setAgeL(valueObject.getAgeL());
		domainObject.setAgelH(valueObject.getAgelH());
		domainObject.setAtype(valueObject.getAtype());

		return domainObject;
	}

}
