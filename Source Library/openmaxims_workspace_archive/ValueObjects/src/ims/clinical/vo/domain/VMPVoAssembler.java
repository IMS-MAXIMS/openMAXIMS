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
 * @author Sean Nesbitt
 */
public class VMPVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.VMPVo copy(ims.clinical.vo.VMPVo valueObjectDest, ims.clinical.vo.VMPVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_VMP(valueObjectSrc.getID_VMP());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ProductIdentifier
		valueObjectDest.setProductIdentifier(valueObjectSrc.getProductIdentifier());
		// VTM
		valueObjectDest.setVTM(valueObjectSrc.getVTM());
		// Invalid
		valueObjectDest.setInvalid(valueObjectSrc.getInvalid());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// AbbreviatedName
		valueObjectDest.setAbbreviatedName(valueObjectSrc.getAbbreviatedName());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createVMPVoCollectionFromVMP(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.configuration.domain.objects.VMP objects.
	 */
	public static ims.clinical.vo.VMPVoCollection createVMPVoCollectionFromVMP(java.util.Set domainObjectSet)	
	{
		return createVMPVoCollectionFromVMP(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.configuration.domain.objects.VMP objects.
	 */
	public static ims.clinical.vo.VMPVoCollection createVMPVoCollectionFromVMP(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.VMPVoCollection voList = new ims.clinical.vo.VMPVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.configuration.domain.objects.VMP domainObject = (ims.clinical.configuration.domain.objects.VMP) iterator.next();
			ims.clinical.vo.VMPVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.configuration.domain.objects.VMP objects.
	 */
	public static ims.clinical.vo.VMPVoCollection createVMPVoCollectionFromVMP(java.util.List domainObjectList) 
	{
		return createVMPVoCollectionFromVMP(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.configuration.domain.objects.VMP objects.
	 */
	public static ims.clinical.vo.VMPVoCollection createVMPVoCollectionFromVMP(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.VMPVoCollection voList = new ims.clinical.vo.VMPVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.configuration.domain.objects.VMP domainObject = (ims.clinical.configuration.domain.objects.VMP) domainObjectList.get(i);
			ims.clinical.vo.VMPVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.configuration.domain.objects.VMP set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractVMPSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.VMPVoCollection voCollection) 
	 {
	 	return extractVMPSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractVMPSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.VMPVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.VMPVo vo = voCollection.get(i);
			ims.clinical.configuration.domain.objects.VMP domainObject = VMPVoAssembler.extractVMP(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.configuration.domain.objects.VMP list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractVMPList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.VMPVoCollection voCollection) 
	 {
	 	return extractVMPList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractVMPList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.VMPVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.VMPVo vo = voCollection.get(i);
			ims.clinical.configuration.domain.objects.VMP domainObject = VMPVoAssembler.extractVMP(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.configuration.domain.objects.VMP object.
	 * @param domainObject ims.clinical.configuration.domain.objects.VMP
	 */
	 public static ims.clinical.vo.VMPVo create(ims.clinical.configuration.domain.objects.VMP domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.configuration.domain.objects.VMP object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.VMPVo create(DomainObjectMap map, ims.clinical.configuration.domain.objects.VMP domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.VMPVo valueObject = (ims.clinical.vo.VMPVo) map.getValueObject(domainObject, ims.clinical.vo.VMPVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.VMPVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.configuration.domain.objects.VMP
	 */
	 public static ims.clinical.vo.VMPVo insert(ims.clinical.vo.VMPVo valueObject, ims.clinical.configuration.domain.objects.VMP domainObject) 
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
	 * @param domainObject ims.clinical.configuration.domain.objects.VMP
	 */
	 public static ims.clinical.vo.VMPVo insert(DomainObjectMap map, ims.clinical.vo.VMPVo valueObject, ims.clinical.configuration.domain.objects.VMP domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_VMP(domainObject.getId());
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
			
		// ProductIdentifier
		valueObject.setProductIdentifier(domainObject.getProductIdentifier());
		// VTM
		if (domainObject.getVTM() != null)
		{
			if(domainObject.getVTM() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getVTM();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setVTM(new ims.clinical.configuration.vo.VTMRefVo(id, -1));				
			}
			else
			{
				valueObject.setVTM(new ims.clinical.configuration.vo.VTMRefVo(domainObject.getVTM().getId(), domainObject.getVTM().getVersion()));
			}
		}
		// Invalid
		valueObject.setInvalid( domainObject.isInvalid() );
		// Name
		valueObject.setName(domainObject.getName());
		// AbbreviatedName
		valueObject.setAbbreviatedName(domainObject.getAbbreviatedName());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.configuration.domain.objects.VMP extractVMP(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.VMPVo valueObject) 
	{
		return 	extractVMP(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.configuration.domain.objects.VMP extractVMP(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.VMPVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_VMP();
		ims.clinical.configuration.domain.objects.VMP domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.configuration.domain.objects.VMP)domMap.get(valueObject);
			}
			// ims.clinical.vo.VMPVo ID_VMP field is unknown
			domainObject = new ims.clinical.configuration.domain.objects.VMP();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_VMP());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.configuration.domain.objects.VMP)domMap.get(key);
			}
			domainObject = (ims.clinical.configuration.domain.objects.VMP) domainFactory.getDomainObject(ims.clinical.configuration.domain.objects.VMP.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_VMP());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getProductIdentifier() != null && valueObject.getProductIdentifier().equals(""))
		{
			valueObject.setProductIdentifier(null);
		}
		domainObject.setProductIdentifier(valueObject.getProductIdentifier());
		ims.clinical.configuration.domain.objects.VTM value2 = null;
		if ( null != valueObject.getVTM() ) 
		{
			if (valueObject.getVTM().getBoId() == null)
			{
				if (domMap.get(valueObject.getVTM()) != null)
				{
					value2 = (ims.clinical.configuration.domain.objects.VTM)domMap.get(valueObject.getVTM());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getVTM();	
			}
			else
			{
				value2 = (ims.clinical.configuration.domain.objects.VTM)domainFactory.getDomainObject(ims.clinical.configuration.domain.objects.VTM.class, valueObject.getVTM().getBoId());
			}
		}
		domainObject.setVTM(value2);
		domainObject.setInvalid(valueObject.getInvalid());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAbbreviatedName() != null && valueObject.getAbbreviatedName().equals(""))
		{
			valueObject.setAbbreviatedName(null);
		}
		domainObject.setAbbreviatedName(valueObject.getAbbreviatedName());

		return domainObject;
	}

}
