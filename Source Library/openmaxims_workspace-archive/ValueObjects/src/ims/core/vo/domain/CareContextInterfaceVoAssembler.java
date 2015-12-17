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
 * @author Daniel Laffan
 */
public class CareContextInterfaceVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.CareContextInterfaceVo copy(ims.core.vo.CareContextInterfaceVo valueObjectDest, ims.core.vo.CareContextInterfaceVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CareContext(valueObjectSrc.getID_CareContext());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// StartDateTime
		valueObjectDest.setStartDateTime(valueObjectSrc.getStartDateTime());
		// EndDateTime
		valueObjectDest.setEndDateTime(valueObjectSrc.getEndDateTime());
		// ResponsibleHCP
		valueObjectDest.setResponsibleHCP(valueObjectSrc.getResponsibleHCP());
		// OrderingHospital
		valueObjectDest.setOrderingHospital(valueObjectSrc.getOrderingHospital());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// StatusHistory
		valueObjectDest.setStatusHistory(valueObjectSrc.getStatusHistory());
		// EpisodeOfCare
		valueObjectDest.setEpisodeOfCare(valueObjectSrc.getEpisodeOfCare());
		// BedNumber
		valueObjectDest.setBedNumber(valueObjectSrc.getBedNumber());
		// EstimatedDischargeDate
		valueObjectDest.setEstimatedDischargeDate(valueObjectSrc.getEstimatedDischargeDate());
		// Context
		valueObjectDest.setContext(valueObjectSrc.getContext());
		// LocationType
		valueObjectDest.setLocationType(valueObjectSrc.getLocationType());
		// pasEvent
		valueObjectDest.setPasEvent(valueObjectSrc.getPasEvent());
		// CareContextHistory
		valueObjectDest.setCareContextHistory(valueObjectSrc.getCareContextHistory());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCareContextInterfaceVoCollectionFromCareContext(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.CareContext objects.
	 */
	public static ims.core.vo.CareContextInterfaceVoCollection createCareContextInterfaceVoCollectionFromCareContext(java.util.Set domainObjectSet)	
	{
		return createCareContextInterfaceVoCollectionFromCareContext(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.CareContext objects.
	 */
	public static ims.core.vo.CareContextInterfaceVoCollection createCareContextInterfaceVoCollectionFromCareContext(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.CareContextInterfaceVoCollection voList = new ims.core.vo.CareContextInterfaceVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.domain.objects.CareContext domainObject = (ims.core.admin.domain.objects.CareContext) iterator.next();
			ims.core.vo.CareContextInterfaceVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.domain.objects.CareContext objects.
	 */
	public static ims.core.vo.CareContextInterfaceVoCollection createCareContextInterfaceVoCollectionFromCareContext(java.util.List domainObjectList) 
	{
		return createCareContextInterfaceVoCollectionFromCareContext(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.CareContext objects.
	 */
	public static ims.core.vo.CareContextInterfaceVoCollection createCareContextInterfaceVoCollectionFromCareContext(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.CareContextInterfaceVoCollection voList = new ims.core.vo.CareContextInterfaceVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.CareContext domainObject = (ims.core.admin.domain.objects.CareContext) domainObjectList.get(i);
			ims.core.vo.CareContextInterfaceVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.domain.objects.CareContext set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractCareContextSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CareContextInterfaceVoCollection voCollection) 
	 {
	 	return extractCareContextSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCareContextSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CareContextInterfaceVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.CareContextInterfaceVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.CareContext domainObject = CareContextInterfaceVoAssembler.extractCareContext(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.domain.objects.CareContext list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractCareContextList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CareContextInterfaceVoCollection voCollection) 
	 {
	 	return extractCareContextList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCareContextList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CareContextInterfaceVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.CareContextInterfaceVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.CareContext domainObject = CareContextInterfaceVoAssembler.extractCareContext(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.domain.objects.CareContext object.
	 * @param domainObject ims.core.admin.domain.objects.CareContext
	 */
	 public static ims.core.vo.CareContextInterfaceVo create(ims.core.admin.domain.objects.CareContext domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.domain.objects.CareContext object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.CareContextInterfaceVo create(DomainObjectMap map, ims.core.admin.domain.objects.CareContext domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.CareContextInterfaceVo valueObject = (ims.core.vo.CareContextInterfaceVo) map.getValueObject(domainObject, ims.core.vo.CareContextInterfaceVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.CareContextInterfaceVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.domain.objects.CareContext
	 */
	 public static ims.core.vo.CareContextInterfaceVo insert(ims.core.vo.CareContextInterfaceVo valueObject, ims.core.admin.domain.objects.CareContext domainObject) 
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
	 * @param domainObject ims.core.admin.domain.objects.CareContext
	 */
	 public static ims.core.vo.CareContextInterfaceVo insert(DomainObjectMap map, ims.core.vo.CareContextInterfaceVo valueObject, ims.core.admin.domain.objects.CareContext domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_CareContext(domainObject.getId());
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
			
		// StartDateTime
		java.util.Date StartDateTime = domainObject.getStartDateTime();
		if ( null != StartDateTime ) 
		{
			valueObject.setStartDateTime(new ims.framework.utils.DateTime(StartDateTime) );
		}
		// EndDateTime
		java.util.Date EndDateTime = domainObject.getEndDateTime();
		if ( null != EndDateTime ) 
		{
			valueObject.setEndDateTime(new ims.framework.utils.DateTime(EndDateTime) );
		}
		// ResponsibleHCP
		if (domainObject.getResponsibleHCP() != null)
		{
			if(domainObject.getResponsibleHCP() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getResponsibleHCP();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setResponsibleHCP(new ims.core.resource.people.vo.HcpRefVo(id, -1));				
			}
			else
			{
				valueObject.setResponsibleHCP(new ims.core.resource.people.vo.HcpRefVo(domainObject.getResponsibleHCP().getId(), domainObject.getResponsibleHCP().getVersion()));
			}
		}
		// OrderingHospital
		if (domainObject.getOrderingHospital() != null)
		{
			if(domainObject.getOrderingHospital() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getOrderingHospital();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setOrderingHospital(new ims.core.resource.place.vo.LocSiteRefVo(id, -1));				
			}
			else
			{
				valueObject.setOrderingHospital(new ims.core.resource.place.vo.LocSiteRefVo(domainObject.getOrderingHospital().getId(), domainObject.getOrderingHospital().getVersion()));
			}
		}
		// CurrentStatus
		valueObject.setCurrentStatus(ims.core.vo.domain.CareContextStatusHistoryVoAssembler.create(map, domainObject.getCurrentStatus()) );
		// StatusHistory
		valueObject.setStatusHistory(ims.core.vo.domain.CareContextStatusHistoryVoAssembler.createCareContextStatusHistoryVoCollectionFromCareContextStatusHistory(map, domainObject.getStatusHistory()) );
		// EpisodeOfCare
		valueObject.setEpisodeOfCare(ims.core.vo.domain.EpisodeOfCareInterfaceVoAssembler.create(map, domainObject.getEpisodeOfCare()) );
		// BedNumber
		valueObject.setBedNumber(domainObject.getBedNumber());
		// EstimatedDischargeDate
		java.util.Date EstimatedDischargeDate = domainObject.getEstimatedDischargeDate();
		if ( null != EstimatedDischargeDate ) 
		{
			valueObject.setEstimatedDischargeDate(new ims.framework.utils.Date(EstimatedDischargeDate) );
		}
		// Context
		ims.domain.lookups.LookupInstance instance10 = domainObject.getContext();
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

			ims.core.vo.lookups.ContextType voLookup10 = new ims.core.vo.lookups.ContextType(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.ContextType parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.core.vo.lookups.ContextType(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setContext(voLookup10);
		}
				// LocationType
		ims.domain.lookups.LookupInstance instance11 = domainObject.getLocationType();
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

			ims.core.vo.lookups.ContactLocation voLookup11 = new ims.core.vo.lookups.ContactLocation(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.core.vo.lookups.ContactLocation parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.core.vo.lookups.ContactLocation(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setLocationType(voLookup11);
		}
				// pasEvent
		valueObject.setPasEvent(ims.core.vo.domain.PasEventLiteVoAssembler.create(map, domainObject.getPasEvent()) );
		// CareContextHistory
		valueObject.setCareContextHistory(ims.core.vo.domain.CareContextHistoryVoAssembler.createCareContextHistoryVoCollectionFromCareContextHistory(map, domainObject.getCareContextHistory()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.CareContext extractCareContext(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CareContextInterfaceVo valueObject) 
	{
		return 	extractCareContext(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.CareContext extractCareContext(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CareContextInterfaceVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_CareContext();
		ims.core.admin.domain.objects.CareContext domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject);
			}
			// ims.core.vo.CareContextInterfaceVo ID_CareContext field is unknown
			domainObject = new ims.core.admin.domain.objects.CareContext();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_CareContext());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.domain.objects.CareContext)domMap.get(key);
			}
			domainObject = (ims.core.admin.domain.objects.CareContext) domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_CareContext());

		ims.framework.utils.DateTime dateTime1 = valueObject.getStartDateTime();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setStartDateTime(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getEndDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setEndDateTime(value2);
		ims.core.resource.people.domain.objects.Hcp value3 = null;
		if ( null != valueObject.getResponsibleHCP() ) 
		{
			if (valueObject.getResponsibleHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getResponsibleHCP()) != null)
				{
					value3 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getResponsibleHCP());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getResponsibleHCP();	
			}
			else
			{
				value3 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getResponsibleHCP().getBoId());
			}
		}
		domainObject.setResponsibleHCP(value3);
		ims.core.resource.place.domain.objects.LocSite value4 = null;
		if ( null != valueObject.getOrderingHospital() ) 
		{
			if (valueObject.getOrderingHospital().getBoId() == null)
			{
				if (domMap.get(valueObject.getOrderingHospital()) != null)
				{
					value4 = (ims.core.resource.place.domain.objects.LocSite)domMap.get(valueObject.getOrderingHospital());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getOrderingHospital();	
			}
			else
			{
				value4 = (ims.core.resource.place.domain.objects.LocSite)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.LocSite.class, valueObject.getOrderingHospital().getBoId());
			}
		}
		domainObject.setOrderingHospital(value4);
		domainObject.setCurrentStatus(ims.core.vo.domain.CareContextStatusHistoryVoAssembler.extractCareContextStatusHistory(domainFactory, valueObject.getCurrentStatus(), domMap));
		domainObject.setStatusHistory(ims.core.vo.domain.CareContextStatusHistoryVoAssembler.extractCareContextStatusHistoryList(domainFactory, valueObject.getStatusHistory(), domainObject.getStatusHistory(), domMap));		
		domainObject.setEpisodeOfCare(ims.core.vo.domain.EpisodeOfCareInterfaceVoAssembler.extractEpisodeOfCare(domainFactory, valueObject.getEpisodeOfCare(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getBedNumber() != null && valueObject.getBedNumber().equals(""))
		{
			valueObject.setBedNumber(null);
		}
		domainObject.setBedNumber(valueObject.getBedNumber());
		java.util.Date value9 = null;
		ims.framework.utils.Date date9 = valueObject.getEstimatedDischargeDate();		
		if ( date9 != null ) 
		{
			value9 = date9.getDate();
		}
		domainObject.setEstimatedDischargeDate(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getContext() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getContext().getID());
		}
		domainObject.setContext(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getLocationType() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getLocationType().getID());
		}
		domainObject.setLocationType(value11);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.pas.domain.objects.PASEvent value12 = null;
		if ( null != valueObject.getPasEvent() ) 
		{
			if (valueObject.getPasEvent().getBoId() == null)
			{
				if (domMap.get(valueObject.getPasEvent()) != null)
				{
					value12 = (ims.core.admin.pas.domain.objects.PASEvent)domMap.get(valueObject.getPasEvent());
				}
			}
			else
			{
				value12 = (ims.core.admin.pas.domain.objects.PASEvent)domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.PASEvent.class, valueObject.getPasEvent().getBoId());
			}
		}
		domainObject.setPasEvent(value12);
		domainObject.setCareContextHistory(ims.core.vo.domain.CareContextHistoryVoAssembler.extractCareContextHistorySet(domainFactory, valueObject.getCareContextHistory(), domainObject.getCareContextHistory(), domMap));		

		return domainObject;
	}

}
