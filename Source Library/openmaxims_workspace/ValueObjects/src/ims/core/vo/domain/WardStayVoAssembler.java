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
 * @author Peter Martin
 */
public class WardStayVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.WardStayVo copy(ims.core.vo.WardStayVo valueObjectDest, ims.core.vo.WardStayVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_WardStay(valueObjectSrc.getID_WardStay());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ward
		valueObjectDest.setWard(valueObjectSrc.getWard());
		// transferDateTime
		valueObjectDest.setTransferDateTime(valueObjectSrc.getTransferDateTime());
		// transferOutDateTime
		valueObjectDest.setTransferOutDateTime(valueObjectSrc.getTransferOutDateTime());
		// WardType
		valueObjectDest.setWardType(valueObjectSrc.getWardType());
		// BedSpace
		valueObjectDest.setBedSpace(valueObjectSrc.getBedSpace());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createWardStayVoCollectionFromWardStay(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.WardStay objects.
	 */
	public static ims.core.vo.WardStayVoCollection createWardStayVoCollectionFromWardStay(java.util.Set domainObjectSet)	
	{
		return createWardStayVoCollectionFromWardStay(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.WardStay objects.
	 */
	public static ims.core.vo.WardStayVoCollection createWardStayVoCollectionFromWardStay(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.WardStayVoCollection voList = new ims.core.vo.WardStayVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.pas.domain.objects.WardStay domainObject = (ims.core.admin.pas.domain.objects.WardStay) iterator.next();
			ims.core.vo.WardStayVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.WardStay objects.
	 */
	public static ims.core.vo.WardStayVoCollection createWardStayVoCollectionFromWardStay(java.util.List domainObjectList) 
	{
		return createWardStayVoCollectionFromWardStay(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.WardStay objects.
	 */
	public static ims.core.vo.WardStayVoCollection createWardStayVoCollectionFromWardStay(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.WardStayVoCollection voList = new ims.core.vo.WardStayVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.WardStay domainObject = (ims.core.admin.pas.domain.objects.WardStay) domainObjectList.get(i);
			ims.core.vo.WardStayVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.pas.domain.objects.WardStay set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractWardStaySet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.WardStayVoCollection voCollection) 
	 {
	 	return extractWardStaySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractWardStaySet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.WardStayVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.WardStayVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.WardStay domainObject = WardStayVoAssembler.extractWardStay(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.pas.domain.objects.WardStay list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractWardStayList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.WardStayVoCollection voCollection) 
	 {
	 	return extractWardStayList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractWardStayList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.WardStayVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.WardStayVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.WardStay domainObject = WardStayVoAssembler.extractWardStay(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.pas.domain.objects.WardStay object.
	 * @param domainObject ims.core.admin.pas.domain.objects.WardStay
	 */
	 public static ims.core.vo.WardStayVo create(ims.core.admin.pas.domain.objects.WardStay domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.pas.domain.objects.WardStay object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.WardStayVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.WardStay domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.WardStayVo valueObject = (ims.core.vo.WardStayVo) map.getValueObject(domainObject, ims.core.vo.WardStayVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.WardStayVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.pas.domain.objects.WardStay
	 */
	 public static ims.core.vo.WardStayVo insert(ims.core.vo.WardStayVo valueObject, ims.core.admin.pas.domain.objects.WardStay domainObject) 
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
	 * @param domainObject ims.core.admin.pas.domain.objects.WardStay
	 */
	 public static ims.core.vo.WardStayVo insert(DomainObjectMap map, ims.core.vo.WardStayVo valueObject, ims.core.admin.pas.domain.objects.WardStay domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_WardStay(domainObject.getId());
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
			
		// ward
		valueObject.setWard(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getWard()) );
		// transferDateTime
		java.util.Date transferDateTime = domainObject.getTransferDateTime();
		if ( null != transferDateTime ) 
		{
			valueObject.setTransferDateTime(new ims.framework.utils.DateTime(transferDateTime) );
		}
		// transferOutDateTime
		java.util.Date transferOutDateTime = domainObject.getTransferOutDateTime();
		if ( null != transferOutDateTime ) 
		{
			valueObject.setTransferOutDateTime(new ims.framework.utils.DateTime(transferOutDateTime) );
		}
		// WardType
		ims.domain.lookups.LookupInstance instance4 = domainObject.getWardType();
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

			ims.core.vo.lookups.WardType voLookup4 = new ims.core.vo.lookups.WardType(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.WardType parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.WardType(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setWardType(voLookup4);
		}
				// BedSpace
		if (domainObject.getBedSpace() != null)
		{
			if(domainObject.getBedSpace() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getBedSpace();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setBedSpace(new ims.core.layout.vo.BedSpaceRefVo(id, -1));				
			}
			else
			{
				valueObject.setBedSpace(new ims.core.layout.vo.BedSpaceRefVo(domainObject.getBedSpace().getId(), domainObject.getBedSpace().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.pas.domain.objects.WardStay extractWardStay(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.WardStayVo valueObject) 
	{
		return 	extractWardStay(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.WardStay extractWardStay(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.WardStayVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_WardStay();
		ims.core.admin.pas.domain.objects.WardStay domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.pas.domain.objects.WardStay)domMap.get(valueObject);
			}
			// ims.core.vo.WardStayVo ID_WardStay field is unknown
			domainObject = new ims.core.admin.pas.domain.objects.WardStay();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_WardStay());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.pas.domain.objects.WardStay)domMap.get(key);
			}
			domainObject = (ims.core.admin.pas.domain.objects.WardStay) domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.WardStay.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_WardStay());

		domainObject.setWard(ims.core.vo.domain.LocationLiteVoAssembler.extractLocation(domainFactory, valueObject.getWard(), domMap));
		ims.framework.utils.DateTime dateTime2 = valueObject.getTransferDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setTransferDateTime(value2);
		ims.framework.utils.DateTime dateTime3 = valueObject.getTransferOutDateTime();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setTransferOutDateTime(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getWardType() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getWardType().getID());
		}
		domainObject.setWardType(value4);
		ims.core.layout.domain.objects.BedSpace value5 = null;
		if ( null != valueObject.getBedSpace() ) 
		{
			if (valueObject.getBedSpace().getBoId() == null)
			{
				if (domMap.get(valueObject.getBedSpace()) != null)
				{
					value5 = (ims.core.layout.domain.objects.BedSpace)domMap.get(valueObject.getBedSpace());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value5 = domainObject.getBedSpace();	
			}
			else
			{
				value5 = (ims.core.layout.domain.objects.BedSpace)domainFactory.getDomainObject(ims.core.layout.domain.objects.BedSpace.class, valueObject.getBedSpace().getBoId());
			}
		}
		domainObject.setBedSpace(value5);

		return domainObject;
	}

}
