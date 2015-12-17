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
package ims.pci.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class PciAddressHistoryVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.pci.vo.PciAddressHistoryVo copy(ims.pci.vo.PciAddressHistoryVo valueObjectDest, ims.pci.vo.PciAddressHistoryVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PciAddressHistory(valueObjectSrc.getID_PciAddressHistory());
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
		// Lho
		valueObjectDest.setLho(valueObjectSrc.getLho());
		// Cca
		valueObjectDest.setCca(valueObjectSrc.getCca());
		// Sector
		valueObjectDest.setSector(valueObjectSrc.getSector());
		// PhnDistrict
		valueObjectDest.setPhnDistrict(valueObjectSrc.getPhnDistrict());
		// DED
		valueObjectDest.setDED(valueObjectSrc.getDED());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPciAddressHistoryVoCollectionFromPciAddressHistory(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.resource.place.domain.objects.PciAddressHistory objects.
	 */
	public static ims.pci.vo.PciAddressHistoryVoCollection createPciAddressHistoryVoCollectionFromPciAddressHistory(java.util.Set domainObjectSet)	
	{
		return createPciAddressHistoryVoCollectionFromPciAddressHistory(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.resource.place.domain.objects.PciAddressHistory objects.
	 */
	public static ims.pci.vo.PciAddressHistoryVoCollection createPciAddressHistoryVoCollectionFromPciAddressHistory(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.pci.vo.PciAddressHistoryVoCollection voList = new ims.pci.vo.PciAddressHistoryVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.resource.place.domain.objects.PciAddressHistory domainObject = (ims.core.resource.place.domain.objects.PciAddressHistory) iterator.next();
			ims.pci.vo.PciAddressHistoryVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.resource.place.domain.objects.PciAddressHistory objects.
	 */
	public static ims.pci.vo.PciAddressHistoryVoCollection createPciAddressHistoryVoCollectionFromPciAddressHistory(java.util.List domainObjectList) 
	{
		return createPciAddressHistoryVoCollectionFromPciAddressHistory(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.resource.place.domain.objects.PciAddressHistory objects.
	 */
	public static ims.pci.vo.PciAddressHistoryVoCollection createPciAddressHistoryVoCollectionFromPciAddressHistory(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.pci.vo.PciAddressHistoryVoCollection voList = new ims.pci.vo.PciAddressHistoryVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.resource.place.domain.objects.PciAddressHistory domainObject = (ims.core.resource.place.domain.objects.PciAddressHistory) domainObjectList.get(i);
			ims.pci.vo.PciAddressHistoryVo vo = create(map, domainObject);

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
	 * Create the ims.core.resource.place.domain.objects.PciAddressHistory set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPciAddressHistorySet(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.PciAddressHistoryVoCollection voCollection) 
	 {
	 	return extractPciAddressHistorySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPciAddressHistorySet(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.PciAddressHistoryVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.pci.vo.PciAddressHistoryVo vo = voCollection.get(i);
			ims.core.resource.place.domain.objects.PciAddressHistory domainObject = PciAddressHistoryVoAssembler.extractPciAddressHistory(domainFactory, vo, domMap);

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
	 * Create the ims.core.resource.place.domain.objects.PciAddressHistory list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPciAddressHistoryList(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.PciAddressHistoryVoCollection voCollection) 
	 {
	 	return extractPciAddressHistoryList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPciAddressHistoryList(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.PciAddressHistoryVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.pci.vo.PciAddressHistoryVo vo = voCollection.get(i);
			ims.core.resource.place.domain.objects.PciAddressHistory domainObject = PciAddressHistoryVoAssembler.extractPciAddressHistory(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.resource.place.domain.objects.PciAddressHistory object.
	 * @param domainObject ims.core.resource.place.domain.objects.PciAddressHistory
	 */
	 public static ims.pci.vo.PciAddressHistoryVo create(ims.core.resource.place.domain.objects.PciAddressHistory domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.resource.place.domain.objects.PciAddressHistory object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.pci.vo.PciAddressHistoryVo create(DomainObjectMap map, ims.core.resource.place.domain.objects.PciAddressHistory domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.pci.vo.PciAddressHistoryVo valueObject = (ims.pci.vo.PciAddressHistoryVo) map.getValueObject(domainObject, ims.pci.vo.PciAddressHistoryVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.pci.vo.PciAddressHistoryVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.resource.place.domain.objects.PciAddressHistory
	 */
	 public static ims.pci.vo.PciAddressHistoryVo insert(ims.pci.vo.PciAddressHistoryVo valueObject, ims.core.resource.place.domain.objects.PciAddressHistory domainObject) 
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
	 * @param domainObject ims.core.resource.place.domain.objects.PciAddressHistory
	 */
	 public static ims.pci.vo.PciAddressHistoryVo insert(DomainObjectMap map, ims.pci.vo.PciAddressHistoryVo valueObject, ims.core.resource.place.domain.objects.PciAddressHistory domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PciAddressHistory(domainObject.getId());
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
		// Lho
		valueObject.setLho(ims.core.vo.domain.OrgLiteVoAssembler.create(map, domainObject.getLho()) );
		// Cca
		valueObject.setCca(ims.core.vo.domain.LocSiteLiteVoAssembler.create(map, domainObject.getCca()) );
		// Sector
		valueObject.setSector(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getSector()) );
		// PhnDistrict
		valueObject.setPhnDistrict(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getPhnDistrict()) );
		// DED
		valueObject.setDED(ims.core.vo.domain.DEDLiteVoAssembler.create(map, domainObject.getDED()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.resource.place.domain.objects.PciAddressHistory extractPciAddressHistory(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.PciAddressHistoryVo valueObject) 
	{
		return 	extractPciAddressHistory(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.resource.place.domain.objects.PciAddressHistory extractPciAddressHistory(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.PciAddressHistoryVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PciAddressHistory();
		ims.core.resource.place.domain.objects.PciAddressHistory domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.resource.place.domain.objects.PciAddressHistory)domMap.get(valueObject);
			}
			// ims.pci.vo.PciAddressHistoryVo ID_PciAddressHistory field is unknown
			domainObject = new ims.core.resource.place.domain.objects.PciAddressHistory();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PciAddressHistory());
			if (domMap.get(key) != null)
			{
				return (ims.core.resource.place.domain.objects.PciAddressHistory)domMap.get(key);
			}
			domainObject = (ims.core.resource.place.domain.objects.PciAddressHistory) domainFactory.getDomainObject(ims.core.resource.place.domain.objects.PciAddressHistory.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PciAddressHistory());

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
		domainObject.setLho(ims.core.vo.domain.OrgLiteVoAssembler.extractOrganisation(domainFactory, valueObject.getLho(), domMap));
		domainObject.setCca(ims.core.vo.domain.LocSiteLiteVoAssembler.extractLocSite(domainFactory, valueObject.getCca(), domMap));
		domainObject.setSector(ims.core.vo.domain.LocationLiteVoAssembler.extractLocation(domainFactory, valueObject.getSector(), domMap));
		domainObject.setPhnDistrict(ims.core.vo.domain.LocationLiteVoAssembler.extractLocation(domainFactory, valueObject.getPhnDistrict(), domMap));
		domainObject.setDED(ims.core.vo.domain.DEDLiteVoAssembler.extractDED(domainFactory, valueObject.getDED(), domMap));

		return domainObject;
	}

}
