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
 * Generated on 16/04/2014, 12:32
 *
 */
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author John MacEnri
 */
public class LocSiteShortVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.LocSiteShortVo copy(ims.core.vo.LocSiteShortVo valueObjectDest, ims.core.vo.LocSiteShortVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Location(valueObjectSrc.getID_Location());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AllSecureAccommodation
		valueObjectDest.setAllSecureAccommodation(valueObjectSrc.getAllSecureAccommodation());
		// CommChannels
		valueObjectDest.setCommChannels(valueObjectSrc.getCommChannels());
		// CodeMappings
		valueObjectDest.setCodeMappings(valueObjectSrc.getCodeMappings());
		// Address
		valueObjectDest.setAddress(valueObjectSrc.getAddress());
		// SecureAccommodation
		valueObjectDest.setSecureAccommodation(valueObjectSrc.getSecureAccommodation());
		// TreatingHosp
		valueObjectDest.setTreatingHosp(valueObjectSrc.getTreatingHosp());
		// ReferringHospital
		valueObjectDest.setReferringHospital(valueObjectSrc.getReferringHospital());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// IsVirtual
		valueObjectDest.setIsVirtual(valueObjectSrc.getIsVirtual());
		// Type
		valueObjectDest.setType(valueObjectSrc.getType());
		// DisplayInEDTracking
		valueObjectDest.setDisplayInEDTracking(valueObjectSrc.getDisplayInEDTracking());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createLocSiteShortVoCollectionFromLocSite(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.resource.place.domain.objects.LocSite objects.
	 */
	public static ims.core.vo.LocSiteShortVoCollection createLocSiteShortVoCollectionFromLocSite(java.util.Set domainObjectSet)	
	{
		return createLocSiteShortVoCollectionFromLocSite(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.resource.place.domain.objects.LocSite objects.
	 */
	public static ims.core.vo.LocSiteShortVoCollection createLocSiteShortVoCollectionFromLocSite(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.LocSiteShortVoCollection voList = new ims.core.vo.LocSiteShortVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.resource.place.domain.objects.LocSite domainObject = (ims.core.resource.place.domain.objects.LocSite) iterator.next();
			ims.core.vo.LocSiteShortVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.resource.place.domain.objects.LocSite objects.
	 */
	public static ims.core.vo.LocSiteShortVoCollection createLocSiteShortVoCollectionFromLocSite(java.util.List domainObjectList) 
	{
		return createLocSiteShortVoCollectionFromLocSite(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.resource.place.domain.objects.LocSite objects.
	 */
	public static ims.core.vo.LocSiteShortVoCollection createLocSiteShortVoCollectionFromLocSite(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.LocSiteShortVoCollection voList = new ims.core.vo.LocSiteShortVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.resource.place.domain.objects.LocSite domainObject = (ims.core.resource.place.domain.objects.LocSite) domainObjectList.get(i);
			ims.core.vo.LocSiteShortVo vo = create(map, domainObject);

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
	 * Create the ims.core.resource.place.domain.objects.LocSite set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractLocSiteSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.LocSiteShortVoCollection voCollection) 
	 {
	 	return extractLocSiteSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractLocSiteSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.LocSiteShortVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.LocSiteShortVo vo = voCollection.get(i);
			ims.core.resource.place.domain.objects.LocSite domainObject = LocSiteShortVoAssembler.extractLocSite(domainFactory, vo, domMap);

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
	 * Create the ims.core.resource.place.domain.objects.LocSite list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractLocSiteList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.LocSiteShortVoCollection voCollection) 
	 {
	 	return extractLocSiteList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractLocSiteList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.LocSiteShortVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.LocSiteShortVo vo = voCollection.get(i);
			ims.core.resource.place.domain.objects.LocSite domainObject = LocSiteShortVoAssembler.extractLocSite(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.resource.place.domain.objects.LocSite object.
	 * @param domainObject ims.core.resource.place.domain.objects.LocSite
	 */
	 public static ims.core.vo.LocSiteShortVo create(ims.core.resource.place.domain.objects.LocSite domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.resource.place.domain.objects.LocSite object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.LocSiteShortVo create(DomainObjectMap map, ims.core.resource.place.domain.objects.LocSite domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.LocSiteShortVo valueObject = (ims.core.vo.LocSiteShortVo) map.getValueObject(domainObject, ims.core.vo.LocSiteShortVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.LocSiteShortVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.resource.place.domain.objects.LocSite
	 */
	 public static ims.core.vo.LocSiteShortVo insert(ims.core.vo.LocSiteShortVo valueObject, ims.core.resource.place.domain.objects.LocSite domainObject) 
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
	 * @param domainObject ims.core.resource.place.domain.objects.LocSite
	 */
	 public static ims.core.vo.LocSiteShortVo insert(DomainObjectMap map, ims.core.vo.LocSiteShortVo valueObject, ims.core.resource.place.domain.objects.LocSite domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Location(domainObject.getId());
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
			
		// AllSecureAccommodation
		valueObject.setAllSecureAccommodation( domainObject.isAllSecureAccommodation() );
		// CommChannels
		valueObject.setCommChannels(ims.core.vo.domain.CommChannelVoAssembler.createCommChannelVoCollectionFromCommunicationChannel(map, domainObject.getCommChannels()) );
		// CodeMappings
		valueObject.setCodeMappings(ims.core.vo.domain.TaxonomyMapAssembler.createTaxonomyMapCollectionFromTaxonomyMap(map, domainObject.getCodeMappings()) );
		// Address
		valueObject.setAddress(ims.core.vo.domain.PersonAddressAssembler.create(map, domainObject.getAddress()) );
		// SecureAccommodation
		valueObject.setSecureAccommodation( domainObject.isSecureAccommodation() );
		// TreatingHosp
		valueObject.setTreatingHosp( domainObject.isTreatingHosp() );
		// ReferringHospital
		valueObject.setReferringHospital( domainObject.isReferringHospital() );
		// Name
		valueObject.setName(domainObject.getName());
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// IsVirtual
		valueObject.setIsVirtual( domainObject.isIsVirtual() );
		// Type
		ims.domain.lookups.LookupInstance instance11 = domainObject.getType();
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

			ims.core.vo.lookups.LocationType voLookup11 = new ims.core.vo.lookups.LocationType(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.core.vo.lookups.LocationType parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.core.vo.lookups.LocationType(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setType(voLookup11);
		}
				// DisplayInEDTracking
		valueObject.setDisplayInEDTracking( domainObject.isDisplayInEDTracking() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.resource.place.domain.objects.LocSite extractLocSite(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.LocSiteShortVo valueObject) 
	{
		return 	extractLocSite(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.resource.place.domain.objects.LocSite extractLocSite(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.LocSiteShortVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Location();
		ims.core.resource.place.domain.objects.LocSite domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.resource.place.domain.objects.LocSite)domMap.get(valueObject);
			}
			// ims.core.vo.LocSiteShortVo ID_LocSite field is unknown
			domainObject = new ims.core.resource.place.domain.objects.LocSite();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Location());
			if (domMap.get(key) != null)
			{
				return (ims.core.resource.place.domain.objects.LocSite)domMap.get(key);
			}
			domainObject = (ims.core.resource.place.domain.objects.LocSite) domainFactory.getDomainObject(ims.core.resource.place.domain.objects.LocSite.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Location());

		domainObject.setAllSecureAccommodation(valueObject.getAllSecureAccommodation());

		// SaveAsRefVO treated as RefValueObject
		ims.core.generic.vo.CommunicationChannelRefVoCollection refCollection2 = new ims.core.generic.vo.CommunicationChannelRefVoCollection();
		if (valueObject.getCommChannels() != null)
		{
			for (int i2=0; i2<valueObject.getCommChannels().size(); i2++)
			{
				ims.core.generic.vo.CommunicationChannelRefVo ref2 = (ims.core.generic.vo.CommunicationChannelRefVo)valueObject.getCommChannels().get(i2);
				refCollection2.add(ref2);
			}
		}
		int size2 = (null == refCollection2) ? 0 : refCollection2.size();		
		java.util.List domainCommChannels2 = domainObject.getCommChannels();
		if (domainCommChannels2 == null)
		{
			domainCommChannels2 = new java.util.ArrayList();
		}
		for(int i=0; i < size2; i++) 
		{
			ims.core.generic.vo.CommunicationChannelRefVo vo = refCollection2.get(i);			
			ims.core.generic.domain.objects.CommunicationChannel dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.generic.domain.objects.CommunicationChannel)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.generic.domain.objects.CommunicationChannel)domainFactory.getDomainObject( ims.core.generic.domain.objects.CommunicationChannel.class, vo.getBoId());
				}
			}

			int domIdx = domainCommChannels2.indexOf(dom);
			if (domIdx == -1)
			{
				domainCommChannels2.add(i, dom);
			}
			else if (i != domIdx && i < domainCommChannels2.size())
			{
				Object tmp = domainCommChannels2.get(i);
				domainCommChannels2.set(i, domainCommChannels2.get(domIdx));
				domainCommChannels2.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i2 = domainCommChannels2.size();
		while (i2 > size2)
		{
			domainCommChannels2.remove(i2-1);
			i2 = domainCommChannels2.size();
		}
		
		domainObject.setCommChannels(domainCommChannels2);		
		domainObject.setCodeMappings(ims.core.vo.domain.TaxonomyMapAssembler.extractTaxonomyMapList(domainFactory, valueObject.getCodeMappings(), domainObject.getCodeMappings(), domMap));		
		domainObject.setAddress(ims.core.vo.domain.PersonAddressAssembler.extractAddress(domainFactory, valueObject.getAddress(), domMap));
		domainObject.setSecureAccommodation(valueObject.getSecureAccommodation());
		domainObject.setTreatingHosp(valueObject.getTreatingHosp());
		domainObject.setReferringHospital(valueObject.getReferringHospital());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());
		domainObject.setIsActive(valueObject.getIsActive());
		domainObject.setIsVirtual(valueObject.getIsVirtual());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getType() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getType().getID());
		}
		domainObject.setType(value11);
		domainObject.setDisplayInEDTracking(valueObject.getDisplayInEDTracking());

		return domainObject;
	}

}
