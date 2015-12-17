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
 * @author Dara Hickey
 */
public class MemberOfStaffShortVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.MemberOfStaffShortVo copy(ims.core.vo.MemberOfStaffShortVo valueObjectDest, ims.core.vo.MemberOfStaffShortVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_MemberOfStaff(valueObjectSrc.getID_MemberOfStaff());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// hcp
		valueObjectDest.setHcp(valueObjectSrc.getHcp());
		// StaffType
		valueObjectDest.setStaffType(valueObjectSrc.getStaffType());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// CommChannels
		valueObjectDest.setCommChannels(valueObjectSrc.getCommChannels());
		// sdsRoleId
		valueObjectDest.setSdsRoleId(valueObjectSrc.getSdsRoleId());
		// canReferPatient
		valueObjectDest.setCanReferPatient(valueObjectSrc.getCanReferPatient());
		// CodeMappings
		valueObjectDest.setCodeMappings(valueObjectSrc.getCodeMappings());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// Initials
		valueObjectDest.setInitials(valueObjectSrc.getInitials());
		// SignatureBlock
		valueObjectDest.setSignatureBlock(valueObjectSrc.getSignatureBlock());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createMemberOfStaffShortVoCollectionFromMemberOfStaff(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.resource.people.domain.objects.MemberOfStaff objects.
	 */
	public static ims.core.vo.MemberOfStaffShortVoCollection createMemberOfStaffShortVoCollectionFromMemberOfStaff(java.util.Set domainObjectSet)	
	{
		return createMemberOfStaffShortVoCollectionFromMemberOfStaff(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.resource.people.domain.objects.MemberOfStaff objects.
	 */
	public static ims.core.vo.MemberOfStaffShortVoCollection createMemberOfStaffShortVoCollectionFromMemberOfStaff(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.MemberOfStaffShortVoCollection voList = new ims.core.vo.MemberOfStaffShortVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.resource.people.domain.objects.MemberOfStaff domainObject = (ims.core.resource.people.domain.objects.MemberOfStaff) iterator.next();
			ims.core.vo.MemberOfStaffShortVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.resource.people.domain.objects.MemberOfStaff objects.
	 */
	public static ims.core.vo.MemberOfStaffShortVoCollection createMemberOfStaffShortVoCollectionFromMemberOfStaff(java.util.List domainObjectList) 
	{
		return createMemberOfStaffShortVoCollectionFromMemberOfStaff(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.resource.people.domain.objects.MemberOfStaff objects.
	 */
	public static ims.core.vo.MemberOfStaffShortVoCollection createMemberOfStaffShortVoCollectionFromMemberOfStaff(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.MemberOfStaffShortVoCollection voList = new ims.core.vo.MemberOfStaffShortVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.resource.people.domain.objects.MemberOfStaff domainObject = (ims.core.resource.people.domain.objects.MemberOfStaff) domainObjectList.get(i);
			ims.core.vo.MemberOfStaffShortVo vo = create(map, domainObject);

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
	 * Create the ims.core.resource.people.domain.objects.MemberOfStaff set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractMemberOfStaffSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MemberOfStaffShortVoCollection voCollection) 
	 {
	 	return extractMemberOfStaffSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractMemberOfStaffSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MemberOfStaffShortVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.MemberOfStaffShortVo vo = voCollection.get(i);
			ims.core.resource.people.domain.objects.MemberOfStaff domainObject = MemberOfStaffShortVoAssembler.extractMemberOfStaff(domainFactory, vo, domMap);

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
	 * Create the ims.core.resource.people.domain.objects.MemberOfStaff list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractMemberOfStaffList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MemberOfStaffShortVoCollection voCollection) 
	 {
	 	return extractMemberOfStaffList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractMemberOfStaffList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MemberOfStaffShortVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.MemberOfStaffShortVo vo = voCollection.get(i);
			ims.core.resource.people.domain.objects.MemberOfStaff domainObject = MemberOfStaffShortVoAssembler.extractMemberOfStaff(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.resource.people.domain.objects.MemberOfStaff object.
	 * @param domainObject ims.core.resource.people.domain.objects.MemberOfStaff
	 */
	 public static ims.core.vo.MemberOfStaffShortVo create(ims.core.resource.people.domain.objects.MemberOfStaff domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.resource.people.domain.objects.MemberOfStaff object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.MemberOfStaffShortVo create(DomainObjectMap map, ims.core.resource.people.domain.objects.MemberOfStaff domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.MemberOfStaffShortVo valueObject = (ims.core.vo.MemberOfStaffShortVo) map.getValueObject(domainObject, ims.core.vo.MemberOfStaffShortVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.MemberOfStaffShortVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.resource.people.domain.objects.MemberOfStaff
	 */
	 public static ims.core.vo.MemberOfStaffShortVo insert(ims.core.vo.MemberOfStaffShortVo valueObject, ims.core.resource.people.domain.objects.MemberOfStaff domainObject) 
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
	 * @param domainObject ims.core.resource.people.domain.objects.MemberOfStaff
	 */
	 public static ims.core.vo.MemberOfStaffShortVo insert(DomainObjectMap map, ims.core.vo.MemberOfStaffShortVo valueObject, ims.core.resource.people.domain.objects.MemberOfStaff domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_MemberOfStaff(domainObject.getId());
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
			
		// hcp
		valueObject.setHcp(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getHcp()) );
		// StaffType
		ims.domain.lookups.LookupInstance instance2 = domainObject.getStaffType();
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

			ims.core.vo.lookups.StaffType voLookup2 = new ims.core.vo.lookups.StaffType(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.StaffType parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.StaffType(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setStaffType(voLookup2);
		}
				// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// CommChannels
		valueObject.setCommChannels(ims.core.vo.domain.CommChannelVoAssembler.createCommChannelVoCollectionFromCommunicationChannel(map, domainObject.getCommChannels()) );
		// sdsRoleId
		valueObject.setSdsRoleId(domainObject.getSdsRoleId());
		// canReferPatient
		valueObject.setCanReferPatient( domainObject.isCanReferPatient() );
		// CodeMappings
		valueObject.setCodeMappings(ims.core.vo.domain.TaxonomyMapAssembler.createTaxonomyMapCollectionFromTaxonomyMap(map, domainObject.getCodeMappings()) );
		// Name
		valueObject.setName(ims.core.vo.domain.PersonNameAssembler.create(map, domainObject.getName()) );
		// Initials
		valueObject.setInitials(domainObject.getInitials());
		// SignatureBlock
		valueObject.setSignatureBlock(domainObject.getSignatureBlock());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.resource.people.domain.objects.MemberOfStaff extractMemberOfStaff(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MemberOfStaffShortVo valueObject) 
	{
		return 	extractMemberOfStaff(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.resource.people.domain.objects.MemberOfStaff extractMemberOfStaff(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MemberOfStaffShortVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_MemberOfStaff();
		ims.core.resource.people.domain.objects.MemberOfStaff domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject);
			}
			// ims.core.vo.MemberOfStaffShortVo ID_MemberOfStaff field is unknown
			domainObject = new ims.core.resource.people.domain.objects.MemberOfStaff();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_MemberOfStaff());
			if (domMap.get(key) != null)
			{
				return (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(key);
			}
			domainObject = (ims.core.resource.people.domain.objects.MemberOfStaff) domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_MemberOfStaff());

		domainObject.setHcp(ims.core.vo.domain.HcpAssembler.extractHcp(domainFactory, valueObject.getHcp(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getStaffType() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getStaffType().getID());
		}
		domainObject.setStaffType(value2);
		domainObject.setIsActive(valueObject.getIsActive());
		domainObject.setCommChannels(ims.core.vo.domain.CommChannelVoAssembler.extractCommunicationChannelList(domainFactory, valueObject.getCommChannels(), domainObject.getCommChannels(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSdsRoleId() != null && valueObject.getSdsRoleId().equals(""))
		{
			valueObject.setSdsRoleId(null);
		}
		domainObject.setSdsRoleId(valueObject.getSdsRoleId());
		domainObject.setCanReferPatient(valueObject.getCanReferPatient());
		domainObject.setCodeMappings(ims.core.vo.domain.TaxonomyMapAssembler.extractTaxonomyMapList(domainFactory, valueObject.getCodeMappings(), domainObject.getCodeMappings(), domMap));		
		domainObject.setName(ims.core.vo.domain.PersonNameAssembler.extractPersonName(domainFactory, valueObject.getName(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getInitials() != null && valueObject.getInitials().equals(""))
		{
			valueObject.setInitials(null);
		}
		domainObject.setInitials(valueObject.getInitials());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSignatureBlock() != null && valueObject.getSignatureBlock().equals(""))
		{
			valueObject.setSignatureBlock(null);
		}
		domainObject.setSignatureBlock(valueObject.getSignatureBlock());

		return domainObject;
	}

}
