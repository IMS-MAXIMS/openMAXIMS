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
 * @author Rory Fitzpatrick
 */
public class ColumnDetailVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.ColumnDetailVo copy(ims.emergency.vo.ColumnDetailVo valueObjectDest, ims.emergency.vo.ColumnDetailVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ColumnDetail(valueObjectSrc.getID_ColumnDetail());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ColHeader
		valueObjectDest.setColHeader(valueObjectSrc.getColHeader());
		// ColWidth
		valueObjectDest.setColWidth(valueObjectSrc.getColWidth());
		// DisplayImage
		valueObjectDest.setDisplayImage(valueObjectSrc.getDisplayImage());
		// Image
		valueObjectDest.setImage(valueObjectSrc.getImage());
		// Column
		valueObjectDest.setColumn(valueObjectSrc.getColumn());
		// MaskInPublicArea
		valueObjectDest.setMaskInPublicArea(valueObjectSrc.getMaskInPublicArea());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createColumnDetailVoCollectionFromColumnDetail(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.emergency.configuration.domain.objects.ColumnDetail objects.
	 */
	public static ims.emergency.vo.ColumnDetailVoCollection createColumnDetailVoCollectionFromColumnDetail(java.util.Set domainObjectSet)	
	{
		return createColumnDetailVoCollectionFromColumnDetail(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.emergency.configuration.domain.objects.ColumnDetail objects.
	 */
	public static ims.emergency.vo.ColumnDetailVoCollection createColumnDetailVoCollectionFromColumnDetail(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.ColumnDetailVoCollection voList = new ims.emergency.vo.ColumnDetailVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.emergency.configuration.domain.objects.ColumnDetail domainObject = (ims.emergency.configuration.domain.objects.ColumnDetail) iterator.next();
			ims.emergency.vo.ColumnDetailVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.emergency.configuration.domain.objects.ColumnDetail objects.
	 */
	public static ims.emergency.vo.ColumnDetailVoCollection createColumnDetailVoCollectionFromColumnDetail(java.util.List domainObjectList) 
	{
		return createColumnDetailVoCollectionFromColumnDetail(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.emergency.configuration.domain.objects.ColumnDetail objects.
	 */
	public static ims.emergency.vo.ColumnDetailVoCollection createColumnDetailVoCollectionFromColumnDetail(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.ColumnDetailVoCollection voList = new ims.emergency.vo.ColumnDetailVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.emergency.configuration.domain.objects.ColumnDetail domainObject = (ims.emergency.configuration.domain.objects.ColumnDetail) domainObjectList.get(i);
			ims.emergency.vo.ColumnDetailVo vo = create(map, domainObject);

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
	 * Create the ims.emergency.configuration.domain.objects.ColumnDetail set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractColumnDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.ColumnDetailVoCollection voCollection) 
	 {
	 	return extractColumnDetailSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractColumnDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.ColumnDetailVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.ColumnDetailVo vo = voCollection.get(i);
			ims.emergency.configuration.domain.objects.ColumnDetail domainObject = ColumnDetailVoAssembler.extractColumnDetail(domainFactory, vo, domMap);

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
	 * Create the ims.emergency.configuration.domain.objects.ColumnDetail list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractColumnDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.ColumnDetailVoCollection voCollection) 
	 {
	 	return extractColumnDetailList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractColumnDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.ColumnDetailVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.ColumnDetailVo vo = voCollection.get(i);
			ims.emergency.configuration.domain.objects.ColumnDetail domainObject = ColumnDetailVoAssembler.extractColumnDetail(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.emergency.configuration.domain.objects.ColumnDetail object.
	 * @param domainObject ims.emergency.configuration.domain.objects.ColumnDetail
	 */
	 public static ims.emergency.vo.ColumnDetailVo create(ims.emergency.configuration.domain.objects.ColumnDetail domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.emergency.configuration.domain.objects.ColumnDetail object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.emergency.vo.ColumnDetailVo create(DomainObjectMap map, ims.emergency.configuration.domain.objects.ColumnDetail domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.ColumnDetailVo valueObject = (ims.emergency.vo.ColumnDetailVo) map.getValueObject(domainObject, ims.emergency.vo.ColumnDetailVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.ColumnDetailVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.emergency.configuration.domain.objects.ColumnDetail
	 */
	 public static ims.emergency.vo.ColumnDetailVo insert(ims.emergency.vo.ColumnDetailVo valueObject, ims.emergency.configuration.domain.objects.ColumnDetail domainObject) 
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
	 * @param domainObject ims.emergency.configuration.domain.objects.ColumnDetail
	 */
	 public static ims.emergency.vo.ColumnDetailVo insert(DomainObjectMap map, ims.emergency.vo.ColumnDetailVo valueObject, ims.emergency.configuration.domain.objects.ColumnDetail domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ColumnDetail(domainObject.getId());
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
			
		// ColHeader
		valueObject.setColHeader(domainObject.getColHeader());
		// ColWidth
		valueObject.setColWidth(domainObject.getColWidth());
		// DisplayImage
		valueObject.setDisplayImage( domainObject.isDisplayImage() );
		// Image
		if (domainObject.getImage() != null)
		{
			if(domainObject.getImage() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getImage();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setImage(new ims.core.configuration.vo.AppImageRefVo(id, -1));				
			}
			else
			{
				valueObject.setImage(new ims.core.configuration.vo.AppImageRefVo(domainObject.getImage().getId(), domainObject.getImage().getVersion()));
			}
		}
		// Column
		ims.domain.lookups.LookupInstance instance5 = domainObject.getColumn();
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

			ims.emergency.vo.lookups.TrackingAreaColumn voLookup5 = new ims.emergency.vo.lookups.TrackingAreaColumn(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.emergency.vo.lookups.TrackingAreaColumn parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.emergency.vo.lookups.TrackingAreaColumn(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setColumn(voLookup5);
		}
				// MaskInPublicArea
		valueObject.setMaskInPublicArea( domainObject.isMaskInPublicArea() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.emergency.configuration.domain.objects.ColumnDetail extractColumnDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.ColumnDetailVo valueObject) 
	{
		return 	extractColumnDetail(domainFactory, valueObject, new HashMap());
	}

	public static ims.emergency.configuration.domain.objects.ColumnDetail extractColumnDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.ColumnDetailVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ColumnDetail();
		ims.emergency.configuration.domain.objects.ColumnDetail domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.emergency.configuration.domain.objects.ColumnDetail)domMap.get(valueObject);
			}
			// ims.emergency.vo.ColumnDetailVo ID_ColumnDetail field is unknown
			domainObject = new ims.emergency.configuration.domain.objects.ColumnDetail();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ColumnDetail());
			if (domMap.get(key) != null)
			{
				return (ims.emergency.configuration.domain.objects.ColumnDetail)domMap.get(key);
			}
			domainObject = (ims.emergency.configuration.domain.objects.ColumnDetail) domainFactory.getDomainObject(ims.emergency.configuration.domain.objects.ColumnDetail.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ColumnDetail());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getColHeader() != null && valueObject.getColHeader().equals(""))
		{
			valueObject.setColHeader(null);
		}
		domainObject.setColHeader(valueObject.getColHeader());
		domainObject.setColWidth(valueObject.getColWidth());
		domainObject.setDisplayImage(valueObject.getDisplayImage());
		ims.core.configuration.domain.objects.AppImage value4 = null;
		if ( null != valueObject.getImage() ) 
		{
			if (valueObject.getImage().getBoId() == null)
			{
				if (domMap.get(valueObject.getImage()) != null)
				{
					value4 = (ims.core.configuration.domain.objects.AppImage)domMap.get(valueObject.getImage());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getImage();	
			}
			else
			{
				value4 = (ims.core.configuration.domain.objects.AppImage)domainFactory.getDomainObject(ims.core.configuration.domain.objects.AppImage.class, valueObject.getImage().getBoId());
			}
		}
		domainObject.setImage(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getColumn() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getColumn().getID());
		}
		domainObject.setColumn(value5);
		domainObject.setMaskInPublicArea(valueObject.getMaskInPublicArea());

		return domainObject;
	}

}
