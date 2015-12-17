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
public class TrackingAreaVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.TrackingAreaVo copy(ims.emergency.vo.TrackingAreaVo valueObjectDest, ims.emergency.vo.TrackingAreaVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_TrackingArea(valueObjectSrc.getID_TrackingArea());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AreaNameDescription
		valueObjectDest.setAreaNameDescription(valueObjectSrc.getAreaNameDescription());
		// AreaDisplayName
		valueObjectDest.setAreaDisplayName(valueObjectSrc.getAreaDisplayName());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// isOverallView
		valueObjectDest.setIsOverallView(valueObjectSrc.getIsOverallView());
		// isRegistrationArea
		valueObjectDest.setIsRegistrationArea(valueObjectSrc.getIsRegistrationArea());
		// PatientRefreshRate
		valueObjectDest.setPatientRefreshRate(valueObjectSrc.getPatientRefreshRate());
		// SendToAreas
		valueObjectDest.setSendToAreas(valueObjectSrc.getSendToAreas());
		// EDLocation
		valueObjectDest.setEDLocation(valueObjectSrc.getEDLocation());
		// Columns
		valueObjectDest.setColumns(valueObjectSrc.getColumns());
		// AreaType
		valueObjectDest.setAreaType(valueObjectSrc.getAreaType());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTrackingAreaVoCollectionFromTrackingArea(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.emergency.configuration.domain.objects.TrackingArea objects.
	 */
	public static ims.emergency.vo.TrackingAreaVoCollection createTrackingAreaVoCollectionFromTrackingArea(java.util.Set domainObjectSet)	
	{
		return createTrackingAreaVoCollectionFromTrackingArea(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.emergency.configuration.domain.objects.TrackingArea objects.
	 */
	public static ims.emergency.vo.TrackingAreaVoCollection createTrackingAreaVoCollectionFromTrackingArea(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.TrackingAreaVoCollection voList = new ims.emergency.vo.TrackingAreaVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.emergency.configuration.domain.objects.TrackingArea domainObject = (ims.emergency.configuration.domain.objects.TrackingArea) iterator.next();
			ims.emergency.vo.TrackingAreaVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.emergency.configuration.domain.objects.TrackingArea objects.
	 */
	public static ims.emergency.vo.TrackingAreaVoCollection createTrackingAreaVoCollectionFromTrackingArea(java.util.List domainObjectList) 
	{
		return createTrackingAreaVoCollectionFromTrackingArea(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.emergency.configuration.domain.objects.TrackingArea objects.
	 */
	public static ims.emergency.vo.TrackingAreaVoCollection createTrackingAreaVoCollectionFromTrackingArea(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.TrackingAreaVoCollection voList = new ims.emergency.vo.TrackingAreaVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.emergency.configuration.domain.objects.TrackingArea domainObject = (ims.emergency.configuration.domain.objects.TrackingArea) domainObjectList.get(i);
			ims.emergency.vo.TrackingAreaVo vo = create(map, domainObject);

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
	 * Create the ims.emergency.configuration.domain.objects.TrackingArea set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTrackingAreaSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TrackingAreaVoCollection voCollection) 
	 {
	 	return extractTrackingAreaSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTrackingAreaSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TrackingAreaVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.TrackingAreaVo vo = voCollection.get(i);
			ims.emergency.configuration.domain.objects.TrackingArea domainObject = TrackingAreaVoAssembler.extractTrackingArea(domainFactory, vo, domMap);

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
	 * Create the ims.emergency.configuration.domain.objects.TrackingArea list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTrackingAreaList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TrackingAreaVoCollection voCollection) 
	 {
	 	return extractTrackingAreaList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTrackingAreaList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TrackingAreaVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.TrackingAreaVo vo = voCollection.get(i);
			ims.emergency.configuration.domain.objects.TrackingArea domainObject = TrackingAreaVoAssembler.extractTrackingArea(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.emergency.configuration.domain.objects.TrackingArea object.
	 * @param domainObject ims.emergency.configuration.domain.objects.TrackingArea
	 */
	 public static ims.emergency.vo.TrackingAreaVo create(ims.emergency.configuration.domain.objects.TrackingArea domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.emergency.configuration.domain.objects.TrackingArea object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.emergency.vo.TrackingAreaVo create(DomainObjectMap map, ims.emergency.configuration.domain.objects.TrackingArea domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.TrackingAreaVo valueObject = (ims.emergency.vo.TrackingAreaVo) map.getValueObject(domainObject, ims.emergency.vo.TrackingAreaVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.TrackingAreaVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.emergency.configuration.domain.objects.TrackingArea
	 */
	 public static ims.emergency.vo.TrackingAreaVo insert(ims.emergency.vo.TrackingAreaVo valueObject, ims.emergency.configuration.domain.objects.TrackingArea domainObject) 
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
	 * @param domainObject ims.emergency.configuration.domain.objects.TrackingArea
	 */
	 public static ims.emergency.vo.TrackingAreaVo insert(DomainObjectMap map, ims.emergency.vo.TrackingAreaVo valueObject, ims.emergency.configuration.domain.objects.TrackingArea domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_TrackingArea(domainObject.getId());
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
			
		// AreaNameDescription
		valueObject.setAreaNameDescription(domainObject.getAreaNameDescription());
		// AreaDisplayName
		valueObject.setAreaDisplayName(domainObject.getAreaDisplayName());
		// Status
		ims.domain.lookups.LookupInstance instance3 = domainObject.getStatus();
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

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup3 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setStatus(voLookup3);
		}
				// isOverallView
		valueObject.setIsOverallView( domainObject.isIsOverallView() );
		// isRegistrationArea
		valueObject.setIsRegistrationArea( domainObject.isIsRegistrationArea() );
		// PatientRefreshRate
		valueObject.setPatientRefreshRate(domainObject.getPatientRefreshRate());
		// SendToAreas
		valueObject.setSendToAreas(ims.emergency.vo.domain.TrackingAreaVoAssembler.createTrackingAreaVoCollectionFromTrackingArea(map, domainObject.getSendToAreas()) );
		// EDLocation
		valueObject.setEDLocation(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getEDLocation()) );
		// Columns
		valueObject.setColumns(ims.emergency.vo.domain.ColumnDetailVoAssembler.createColumnDetailVoCollectionFromColumnDetail(map, domainObject.getColumns()) );
		// AreaType
		ims.domain.lookups.LookupInstance instance10 = domainObject.getAreaType();
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

			ims.emergency.vo.lookups.AreaType voLookup10 = new ims.emergency.vo.lookups.AreaType(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.emergency.vo.lookups.AreaType parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.emergency.vo.lookups.AreaType(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setAreaType(voLookup10);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.emergency.configuration.domain.objects.TrackingArea extractTrackingArea(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TrackingAreaVo valueObject) 
	{
		return 	extractTrackingArea(domainFactory, valueObject, new HashMap());
	}

	public static ims.emergency.configuration.domain.objects.TrackingArea extractTrackingArea(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TrackingAreaVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_TrackingArea();
		ims.emergency.configuration.domain.objects.TrackingArea domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.emergency.configuration.domain.objects.TrackingArea)domMap.get(valueObject);
			}
			// ims.emergency.vo.TrackingAreaVo ID_TrackingArea field is unknown
			domainObject = new ims.emergency.configuration.domain.objects.TrackingArea();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_TrackingArea());
			if (domMap.get(key) != null)
			{
				return (ims.emergency.configuration.domain.objects.TrackingArea)domMap.get(key);
			}
			domainObject = (ims.emergency.configuration.domain.objects.TrackingArea) domainFactory.getDomainObject(ims.emergency.configuration.domain.objects.TrackingArea.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_TrackingArea());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAreaNameDescription() != null && valueObject.getAreaNameDescription().equals(""))
		{
			valueObject.setAreaNameDescription(null);
		}
		domainObject.setAreaNameDescription(valueObject.getAreaNameDescription());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAreaDisplayName() != null && valueObject.getAreaDisplayName().equals(""))
		{
			valueObject.setAreaDisplayName(null);
		}
		domainObject.setAreaDisplayName(valueObject.getAreaDisplayName());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value3);
		domainObject.setIsOverallView(valueObject.getIsOverallView());
		domainObject.setIsRegistrationArea(valueObject.getIsRegistrationArea());
		domainObject.setPatientRefreshRate(valueObject.getPatientRefreshRate());

		// SaveAsRefVO treated as RefValueObject
		ims.emergency.configuration.vo.TrackingAreaRefVoCollection refCollection7 = new ims.emergency.configuration.vo.TrackingAreaRefVoCollection();
		if (valueObject.getSendToAreas() != null)
		{
			for (int i7=0; i7<valueObject.getSendToAreas().size(); i7++)
			{
				ims.emergency.configuration.vo.TrackingAreaRefVo ref7 = (ims.emergency.configuration.vo.TrackingAreaRefVo)valueObject.getSendToAreas().get(i7);
				refCollection7.add(ref7);
			}
		}
		int size7 = (null == refCollection7) ? 0 : refCollection7.size();		
		java.util.List domainSendToAreas7 = domainObject.getSendToAreas();
		if (domainSendToAreas7 == null)
		{
			domainSendToAreas7 = new java.util.ArrayList();
		}
		for(int i=0; i < size7; i++) 
		{
			ims.emergency.configuration.vo.TrackingAreaRefVo vo = refCollection7.get(i);			
			ims.emergency.configuration.domain.objects.TrackingArea dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.emergency.configuration.domain.objects.TrackingArea)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.emergency.configuration.domain.objects.TrackingArea)domainFactory.getDomainObject( ims.emergency.configuration.domain.objects.TrackingArea.class, vo.getBoId());
				}
			}

			int domIdx = domainSendToAreas7.indexOf(dom);
			if (domIdx == -1)
			{
				domainSendToAreas7.add(i, dom);
			}
			else if (i != domIdx && i < domainSendToAreas7.size())
			{
				Object tmp = domainSendToAreas7.get(i);
				domainSendToAreas7.set(i, domainSendToAreas7.get(domIdx));
				domainSendToAreas7.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i7 = domainSendToAreas7.size();
		while (i7 > size7)
		{
			domainSendToAreas7.remove(i7-1);
			i7 = domainSendToAreas7.size();
		}
		
		domainObject.setSendToAreas(domainSendToAreas7);		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value8 = null;
		if ( null != valueObject.getEDLocation() ) 
		{
			if (valueObject.getEDLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getEDLocation()) != null)
				{
					value8 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getEDLocation());
				}
			}
			else
			{
				value8 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getEDLocation().getBoId());
			}
		}
		domainObject.setEDLocation(value8);
		domainObject.setColumns(ims.emergency.vo.domain.ColumnDetailVoAssembler.extractColumnDetailList(domainFactory, valueObject.getColumns(), domainObject.getColumns(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getAreaType() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getAreaType().getID());
		}
		domainObject.setAreaType(value10);

		return domainObject;
	}

}
