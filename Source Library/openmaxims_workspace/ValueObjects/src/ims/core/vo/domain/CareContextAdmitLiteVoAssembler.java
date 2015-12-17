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
 * @author George Cristian Josan
 */
public class CareContextAdmitLiteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.CareContextAdmitLiteVo copy(ims.core.vo.CareContextAdmitLiteVo valueObjectDest, ims.core.vo.CareContextAdmitLiteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CareContext(valueObjectSrc.getID_CareContext());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Context
		valueObjectDest.setContext(valueObjectSrc.getContext());
		// StartDateTime
		valueObjectDest.setStartDateTime(valueObjectSrc.getStartDateTime());
		// EndDateTime
		valueObjectDest.setEndDateTime(valueObjectSrc.getEndDateTime());
		// ResponsibleHCP
		valueObjectDest.setResponsibleHCP(valueObjectSrc.getResponsibleHCP());
		// EpisodeOfCare
		valueObjectDest.setEpisodeOfCare(valueObjectSrc.getEpisodeOfCare());
		// pasEvent
		valueObjectDest.setPasEvent(valueObjectSrc.getPasEvent());
		// LocationType
		valueObjectDest.setLocationType(valueObjectSrc.getLocationType());
		// BedNumber
		valueObjectDest.setBedNumber(valueObjectSrc.getBedNumber());
		// EstimatedDischargeDate
		valueObjectDest.setEstimatedDischargeDate(valueObjectSrc.getEstimatedDischargeDate());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// StatusHistory
		valueObjectDest.setStatusHistory(valueObjectSrc.getStatusHistory());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCareContextAdmitLiteVoCollectionFromCareContext(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.CareContext objects.
	 */
	public static ims.core.vo.CareContextAdmitLiteVoCollection createCareContextAdmitLiteVoCollectionFromCareContext(java.util.Set domainObjectSet)	
	{
		return createCareContextAdmitLiteVoCollectionFromCareContext(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.CareContext objects.
	 */
	public static ims.core.vo.CareContextAdmitLiteVoCollection createCareContextAdmitLiteVoCollectionFromCareContext(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.CareContextAdmitLiteVoCollection voList = new ims.core.vo.CareContextAdmitLiteVoCollection();
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
			ims.core.vo.CareContextAdmitLiteVo vo = create(map, domainObject);
			
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
	public static ims.core.vo.CareContextAdmitLiteVoCollection createCareContextAdmitLiteVoCollectionFromCareContext(java.util.List domainObjectList) 
	{
		return createCareContextAdmitLiteVoCollectionFromCareContext(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.CareContext objects.
	 */
	public static ims.core.vo.CareContextAdmitLiteVoCollection createCareContextAdmitLiteVoCollectionFromCareContext(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.CareContextAdmitLiteVoCollection voList = new ims.core.vo.CareContextAdmitLiteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.CareContext domainObject = (ims.core.admin.domain.objects.CareContext) domainObjectList.get(i);
			ims.core.vo.CareContextAdmitLiteVo vo = create(map, domainObject);

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
	 public static java.util.Set extractCareContextSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CareContextAdmitLiteVoCollection voCollection) 
	 {
	 	return extractCareContextSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCareContextSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CareContextAdmitLiteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.CareContextAdmitLiteVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.CareContext domainObject = CareContextAdmitLiteVoAssembler.extractCareContext(domainFactory, vo, domMap);

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
	 public static java.util.List extractCareContextList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CareContextAdmitLiteVoCollection voCollection) 
	 {
	 	return extractCareContextList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCareContextList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CareContextAdmitLiteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.CareContextAdmitLiteVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.CareContext domainObject = CareContextAdmitLiteVoAssembler.extractCareContext(domainFactory, vo, domMap);

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
	 public static ims.core.vo.CareContextAdmitLiteVo create(ims.core.admin.domain.objects.CareContext domainObject) 
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
	  public static ims.core.vo.CareContextAdmitLiteVo create(DomainObjectMap map, ims.core.admin.domain.objects.CareContext domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.CareContextAdmitLiteVo valueObject = (ims.core.vo.CareContextAdmitLiteVo) map.getValueObject(domainObject, ims.core.vo.CareContextAdmitLiteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.CareContextAdmitLiteVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.core.vo.CareContextAdmitLiteVo insert(ims.core.vo.CareContextAdmitLiteVo valueObject, ims.core.admin.domain.objects.CareContext domainObject) 
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
	 public static ims.core.vo.CareContextAdmitLiteVo insert(DomainObjectMap map, ims.core.vo.CareContextAdmitLiteVo valueObject, ims.core.admin.domain.objects.CareContext domainObject) 
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
			
		// Context
		ims.domain.lookups.LookupInstance instance1 = domainObject.getContext();
		if ( null != instance1 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance1.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance1.getImage().getImageId(), instance1.getImage().getImagePath());
			}
			color = instance1.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.ContextType voLookup1 = new ims.core.vo.lookups.ContextType(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.ContextType parentVoLookup1 = voLookup1;
			ims.domain.lookups.LookupInstance parent1 = instance1.getParent();
			while (parent1 != null)
			{
				if (parent1.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent1.getImage().getImageId(), parent1.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent1.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup1.setParent(new ims.core.vo.lookups.ContextType(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setContext(voLookup1);
		}
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
		// EpisodeOfCare
		if (domainObject.getEpisodeOfCare() != null)
		{
			if(domainObject.getEpisodeOfCare() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getEpisodeOfCare();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setEpisodeOfCare(new ims.core.admin.vo.EpisodeOfCareRefVo(id, -1));				
			}
			else
			{
				valueObject.setEpisodeOfCare(new ims.core.admin.vo.EpisodeOfCareRefVo(domainObject.getEpisodeOfCare().getId(), domainObject.getEpisodeOfCare().getVersion()));
			}
		}
		// pasEvent
		valueObject.setPasEvent(ims.core.vo.domain.PasEventAdmitLiteVoAssembler.create(map, domainObject.getPasEvent()) );
		// LocationType
		ims.domain.lookups.LookupInstance instance7 = domainObject.getLocationType();
		if ( null != instance7 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance7.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance7.getImage().getImageId(), instance7.getImage().getImagePath());
			}
			color = instance7.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.ContactLocation voLookup7 = new ims.core.vo.lookups.ContactLocation(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.ContactLocation parentVoLookup7 = voLookup7;
			ims.domain.lookups.LookupInstance parent7 = instance7.getParent();
			while (parent7 != null)
			{
				if (parent7.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent7.getImage().getImageId(), parent7.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent7.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup7.setParent(new ims.core.vo.lookups.ContactLocation(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setLocationType(voLookup7);
		}
				// BedNumber
		valueObject.setBedNumber(domainObject.getBedNumber());
		// EstimatedDischargeDate
		java.util.Date EstimatedDischargeDate = domainObject.getEstimatedDischargeDate();
		if ( null != EstimatedDischargeDate ) 
		{
			valueObject.setEstimatedDischargeDate(new ims.framework.utils.Date(EstimatedDischargeDate) );
		}
		// CurrentStatus
		valueObject.setCurrentStatus(ims.core.vo.domain.CareContextStatusHistoryVoAssembler.create(map, domainObject.getCurrentStatus()) );
		// StatusHistory
		valueObject.setStatusHistory(ims.core.vo.domain.CareContextStatusHistoryVoAssembler.createCareContextStatusHistoryVoCollectionFromCareContextStatusHistory(map, domainObject.getStatusHistory()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.CareContext extractCareContext(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CareContextAdmitLiteVo valueObject) 
	{
		return 	extractCareContext(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.CareContext extractCareContext(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CareContextAdmitLiteVo valueObject, HashMap domMap) 
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
			// ims.core.vo.CareContextAdmitLiteVo ID_CareContext field is unknown
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

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getContext() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getContext().getID());
		}
		domainObject.setContext(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getStartDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setStartDateTime(value2);
		ims.framework.utils.DateTime dateTime3 = valueObject.getEndDateTime();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setEndDateTime(value3);
		ims.core.resource.people.domain.objects.Hcp value4 = null;
		if ( null != valueObject.getResponsibleHCP() ) 
		{
			if (valueObject.getResponsibleHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getResponsibleHCP()) != null)
				{
					value4 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getResponsibleHCP());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getResponsibleHCP();	
			}
			else
			{
				value4 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getResponsibleHCP().getBoId());
			}
		}
		domainObject.setResponsibleHCP(value4);
		ims.core.admin.domain.objects.EpisodeOfCare value5 = null;
		if ( null != valueObject.getEpisodeOfCare() ) 
		{
			if (valueObject.getEpisodeOfCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisodeOfCare()) != null)
				{
					value5 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisodeOfCare());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value5 = domainObject.getEpisodeOfCare();	
			}
			else
			{
				value5 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisodeOfCare().getBoId());
			}
		}
		domainObject.setEpisodeOfCare(value5);
		domainObject.setPasEvent(ims.core.vo.domain.PasEventAdmitLiteVoAssembler.extractPASEvent(domainFactory, valueObject.getPasEvent(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getLocationType() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getLocationType().getID());
		}
		domainObject.setLocationType(value7);
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
		domainObject.setCurrentStatus(ims.core.vo.domain.CareContextStatusHistoryVoAssembler.extractCareContextStatusHistory(domainFactory, valueObject.getCurrentStatus(), domMap));
		domainObject.setStatusHistory(ims.core.vo.domain.CareContextStatusHistoryVoAssembler.extractCareContextStatusHistoryList(domainFactory, valueObject.getStatusHistory(), domainObject.getStatusHistory(), domMap));		

		return domainObject;
	}

}
