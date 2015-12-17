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
package ims.ocrr.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author George Cristian Josan
 */
public class NewResultsSearchListVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.NewResultsSearchListVo copy(ims.ocrr.vo.NewResultsSearchListVo valueObjectDest, ims.ocrr.vo.NewResultsSearchListVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_OrderInvestigation(valueObjectSrc.getID_OrderInvestigation());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Investigation
		valueObjectDest.setInvestigation(valueObjectSrc.getInvestigation());
		// Specimen
		valueObjectDest.setSpecimen(valueObjectSrc.getSpecimen());
		// OrderDetails
		valueObjectDest.setOrderDetails(valueObjectSrc.getOrderDetails());
		// ResultStatus
		valueObjectDest.setResultStatus(valueObjectSrc.getResultStatus());
		// RepDateTime
		valueObjectDest.setRepDateTime(valueObjectSrc.getRepDateTime());
		// AllocatedDateForReview
		valueObjectDest.setAllocatedDateForReview(valueObjectSrc.getAllocatedDateForReview());
		// ResultSortDate
		valueObjectDest.setResultSortDate(valueObjectSrc.getResultSortDate());
		// OrdInvCurrentStatus
		valueObjectDest.setOrdInvCurrentStatus(valueObjectSrc.getOrdInvCurrentStatus());
		// AllocatedHCPforReview
		valueObjectDest.setAllocatedHCPforReview(valueObjectSrc.getAllocatedHCPforReview());
		// ForReview
		valueObjectDest.setForReview(valueObjectSrc.getForReview());
		// reviewRequestedBy
		valueObjectDest.setReviewRequestedBy(valueObjectSrc.getReviewRequestedBy());
		// ResultDetails
		valueObjectDest.setResultDetails(valueObjectSrc.getResultDetails());
		// ResultConclusionComments
		valueObjectDest.setResultConclusionComments(valueObjectSrc.getResultConclusionComments());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createNewResultsSearchListVoCollectionFromOrderInvestigation(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OrderInvestigation objects.
	 */
	public static ims.ocrr.vo.NewResultsSearchListVoCollection createNewResultsSearchListVoCollectionFromOrderInvestigation(java.util.Set domainObjectSet)	
	{
		return createNewResultsSearchListVoCollectionFromOrderInvestigation(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OrderInvestigation objects.
	 */
	public static ims.ocrr.vo.NewResultsSearchListVoCollection createNewResultsSearchListVoCollectionFromOrderInvestigation(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.NewResultsSearchListVoCollection voList = new ims.ocrr.vo.NewResultsSearchListVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation) iterator.next();
			ims.ocrr.vo.NewResultsSearchListVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.OrderInvestigation objects.
	 */
	public static ims.ocrr.vo.NewResultsSearchListVoCollection createNewResultsSearchListVoCollectionFromOrderInvestigation(java.util.List domainObjectList) 
	{
		return createNewResultsSearchListVoCollectionFromOrderInvestigation(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.OrderInvestigation objects.
	 */
	public static ims.ocrr.vo.NewResultsSearchListVoCollection createNewResultsSearchListVoCollectionFromOrderInvestigation(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.NewResultsSearchListVoCollection voList = new ims.ocrr.vo.NewResultsSearchListVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation) domainObjectList.get(i);
			ims.ocrr.vo.NewResultsSearchListVo vo = create(map, domainObject);

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
	 * Create the ims.ocrr.orderingresults.domain.objects.OrderInvestigation set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractOrderInvestigationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.NewResultsSearchListVoCollection voCollection) 
	 {
	 	return extractOrderInvestigationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOrderInvestigationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.NewResultsSearchListVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.NewResultsSearchListVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject = NewResultsSearchListVoAssembler.extractOrderInvestigation(domainFactory, vo, domMap);

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
	 * Create the ims.ocrr.orderingresults.domain.objects.OrderInvestigation list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractOrderInvestigationList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.NewResultsSearchListVoCollection voCollection) 
	 {
	 	return extractOrderInvestigationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOrderInvestigationList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.NewResultsSearchListVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.NewResultsSearchListVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject = NewResultsSearchListVoAssembler.extractOrderInvestigation(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.OrderInvestigation object.
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.OrderInvestigation
	 */
	 public static ims.ocrr.vo.NewResultsSearchListVo create(ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.OrderInvestigation object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ocrr.vo.NewResultsSearchListVo create(DomainObjectMap map, ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.NewResultsSearchListVo valueObject = (ims.ocrr.vo.NewResultsSearchListVo) map.getValueObject(domainObject, ims.ocrr.vo.NewResultsSearchListVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.NewResultsSearchListVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.OrderInvestigation
	 */
	 public static ims.ocrr.vo.NewResultsSearchListVo insert(ims.ocrr.vo.NewResultsSearchListVo valueObject, ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject) 
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
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.OrderInvestigation
	 */
	 public static ims.ocrr.vo.NewResultsSearchListVo insert(DomainObjectMap map, ims.ocrr.vo.NewResultsSearchListVo valueObject, ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_OrderInvestigation(domainObject.getId());
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
			
		// Investigation
		valueObject.setInvestigation(ims.ocrr.vo.domain.NewResultsSearchInvestigationVoAssembler.create(map, domainObject.getInvestigation()) );
		// Specimen
		valueObject.setSpecimen(ims.ocrr.vo.domain.OrderSpecimenCommentsVoAssembler.createOrderSpecimenCommentsVoCollectionFromOrderSpecimen(map, domainObject.getSpecimen()) );
		// OrderDetails
		valueObject.setOrderDetails(ims.ocrr.vo.domain.NewResultsSearchOrderSessionVoAssembler.create(map, domainObject.getOrderDetails()) );
		// ResultStatus
		ims.domain.lookups.LookupInstance instance4 = domainObject.getResultStatus();
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

			ims.ocrr.vo.lookups.ResultStatus voLookup4 = new ims.ocrr.vo.lookups.ResultStatus(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.ocrr.vo.lookups.ResultStatus parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.ocrr.vo.lookups.ResultStatus(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setResultStatus(voLookup4);
		}
				// RepDateTime
		java.util.Date RepDateTime = domainObject.getRepDateTime();
		if ( null != RepDateTime ) 
		{
			valueObject.setRepDateTime(new ims.framework.utils.DateTime(RepDateTime) );
		}
		// AllocatedDateForReview
		java.util.Date AllocatedDateForReview = domainObject.getAllocatedDateForReview();
		if ( null != AllocatedDateForReview ) 
		{
			valueObject.setAllocatedDateForReview(new ims.framework.utils.DateTime(AllocatedDateForReview) );
		}
		// ResultSortDate
		java.util.Date ResultSortDate = domainObject.getResultSortDate();
		if ( null != ResultSortDate ) 
		{
			valueObject.setResultSortDate(new ims.framework.utils.DateTime(ResultSortDate) );
		}
		// OrdInvCurrentStatus
		valueObject.setOrdInvCurrentStatus(ims.ocrr.vo.domain.OrderedInvestigationStatusVoAssembler.create(map, domainObject.getOrdInvCurrentStatus()) );
		// AllocatedHCPforReview
		valueObject.setAllocatedHCPforReview(ims.core.vo.domain.HcpMinVoAssembler.create(map, domainObject.getAllocatedHCPforReview()) );
		// ForReview
		valueObject.setForReview( domainObject.isForReview() );
		// reviewRequestedBy
		valueObject.setReviewRequestedBy(domainObject.getReviewRequestedBy());
		// ResultDetails
		valueObject.setResultDetails(ims.ocrr.vo.domain.ResultDetailsForNewResultsListVoAssembler.create(map, domainObject.getResultDetails()) );
		// ResultConclusionComments
		valueObject.setResultConclusionComments(ims.ocrr.vo.domain.ResultCommentsLiteVoAssembler.createResultCommentsLiteVoCollectionFromResultConclusionAndActionComment(map, domainObject.getResultConclusionComments()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.orderingresults.domain.objects.OrderInvestigation extractOrderInvestigation(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.NewResultsSearchListVo valueObject) 
	{
		return 	extractOrderInvestigation(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.orderingresults.domain.objects.OrderInvestigation extractOrderInvestigation(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.NewResultsSearchListVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_OrderInvestigation();
		ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.OrderInvestigation)domMap.get(valueObject);
			}
			// ims.ocrr.vo.NewResultsSearchListVo ID_OrderInvestigation field is unknown
			domainObject = new ims.ocrr.orderingresults.domain.objects.OrderInvestigation();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_OrderInvestigation());
			if (domMap.get(key) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.OrderInvestigation)domMap.get(key);
			}
			domainObject = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation) domainFactory.getDomainObject(ims.ocrr.orderingresults.domain.objects.OrderInvestigation.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_OrderInvestigation());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.ocrr.configuration.domain.objects.Investigation value1 = null;
		if ( null != valueObject.getInvestigation() ) 
		{
			if (valueObject.getInvestigation().getBoId() == null)
			{
				if (domMap.get(valueObject.getInvestigation()) != null)
				{
					value1 = (ims.ocrr.configuration.domain.objects.Investigation)domMap.get(valueObject.getInvestigation());
				}
			}
			else
			{
				value1 = (ims.ocrr.configuration.domain.objects.Investigation)domainFactory.getDomainObject(ims.ocrr.configuration.domain.objects.Investigation.class, valueObject.getInvestigation().getBoId());
			}
		}
		domainObject.setInvestigation(value1);
		domainObject.setSpecimen(ims.ocrr.vo.domain.OrderSpecimenCommentsVoAssembler.extractOrderSpecimenList(domainFactory, valueObject.getSpecimen(), domainObject.getSpecimen(), domMap));		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.ocrr.orderingresults.domain.objects.OcsOrderSession value3 = null;
		if ( null != valueObject.getOrderDetails() ) 
		{
			if (valueObject.getOrderDetails().getBoId() == null)
			{
				if (domMap.get(valueObject.getOrderDetails()) != null)
				{
					value3 = (ims.ocrr.orderingresults.domain.objects.OcsOrderSession)domMap.get(valueObject.getOrderDetails());
				}
			}
			else
			{
				value3 = (ims.ocrr.orderingresults.domain.objects.OcsOrderSession)domainFactory.getDomainObject(ims.ocrr.orderingresults.domain.objects.OcsOrderSession.class, valueObject.getOrderDetails().getBoId());
			}
		}
		domainObject.setOrderDetails(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getResultStatus() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getResultStatus().getID());
		}
		domainObject.setResultStatus(value4);
		ims.framework.utils.DateTime dateTime5 = valueObject.getRepDateTime();
		java.util.Date value5 = null;
		if ( dateTime5 != null ) 
		{
			value5 = dateTime5.getJavaDate();
		}
		domainObject.setRepDateTime(value5);
		ims.framework.utils.DateTime dateTime6 = valueObject.getAllocatedDateForReview();
		java.util.Date value6 = null;
		if ( dateTime6 != null ) 
		{
			value6 = dateTime6.getJavaDate();
		}
		domainObject.setAllocatedDateForReview(value6);
		ims.framework.utils.DateTime dateTime7 = valueObject.getResultSortDate();
		java.util.Date value7 = null;
		if ( dateTime7 != null ) 
		{
			value7 = dateTime7.getJavaDate();
		}
		domainObject.setResultSortDate(value7);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.ocrr.orderingresults.domain.objects.OrderedInvestigationStatus value8 = null;
		if ( null != valueObject.getOrdInvCurrentStatus() ) 
		{
			if (valueObject.getOrdInvCurrentStatus().getBoId() == null)
			{
				if (domMap.get(valueObject.getOrdInvCurrentStatus()) != null)
				{
					value8 = (ims.ocrr.orderingresults.domain.objects.OrderedInvestigationStatus)domMap.get(valueObject.getOrdInvCurrentStatus());
				}
			}
			else
			{
				value8 = (ims.ocrr.orderingresults.domain.objects.OrderedInvestigationStatus)domainFactory.getDomainObject(ims.ocrr.orderingresults.domain.objects.OrderedInvestigationStatus.class, valueObject.getOrdInvCurrentStatus().getBoId());
			}
		}
		domainObject.setOrdInvCurrentStatus(value8);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value9 = null;
		if ( null != valueObject.getAllocatedHCPforReview() ) 
		{
			if (valueObject.getAllocatedHCPforReview().getBoId() == null)
			{
				if (domMap.get(valueObject.getAllocatedHCPforReview()) != null)
				{
					value9 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getAllocatedHCPforReview());
				}
			}
			else
			{
				value9 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getAllocatedHCPforReview().getBoId());
			}
		}
		domainObject.setAllocatedHCPforReview(value9);
		domainObject.setForReview(valueObject.getForReview());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReviewRequestedBy() != null && valueObject.getReviewRequestedBy().equals(""))
		{
			valueObject.setReviewRequestedBy(null);
		}
		domainObject.setReviewRequestedBy(valueObject.getReviewRequestedBy());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.ocrr.orderingresults.domain.objects.ResultDetails value12 = null;
		if ( null != valueObject.getResultDetails() ) 
		{
			if (valueObject.getResultDetails().getBoId() == null)
			{
				if (domMap.get(valueObject.getResultDetails()) != null)
				{
					value12 = (ims.ocrr.orderingresults.domain.objects.ResultDetails)domMap.get(valueObject.getResultDetails());
				}
			}
			else
			{
				value12 = (ims.ocrr.orderingresults.domain.objects.ResultDetails)domainFactory.getDomainObject(ims.ocrr.orderingresults.domain.objects.ResultDetails.class, valueObject.getResultDetails().getBoId());
			}
		}
		domainObject.setResultDetails(value12);

		// SaveAsRefVO treated as RefValueObject
		ims.ocrr.orderingresults.vo.ResultConclusionAndActionCommentRefVoCollection refCollection13 = new ims.ocrr.orderingresults.vo.ResultConclusionAndActionCommentRefVoCollection();
		if (valueObject.getResultConclusionComments() != null)
		{
			for (int i13=0; i13<valueObject.getResultConclusionComments().size(); i13++)
			{
				ims.ocrr.orderingresults.vo.ResultConclusionAndActionCommentRefVo ref13 = (ims.ocrr.orderingresults.vo.ResultConclusionAndActionCommentRefVo)valueObject.getResultConclusionComments().get(i13);
				refCollection13.add(ref13);
			}
		}
		int size13 = (null == refCollection13) ? 0 : refCollection13.size();		
		java.util.List domainResultConclusionComments13 = domainObject.getResultConclusionComments();
		if (domainResultConclusionComments13 == null)
		{
			domainResultConclusionComments13 = new java.util.ArrayList();
		}
		for(int i=0; i < size13; i++) 
		{
			ims.ocrr.orderingresults.vo.ResultConclusionAndActionCommentRefVo vo = refCollection13.get(i);			
			ims.ocrr.orderingresults.domain.objects.ResultConclusionAndActionComment dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.ocrr.orderingresults.domain.objects.ResultConclusionAndActionComment)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.ocrr.orderingresults.domain.objects.ResultConclusionAndActionComment)domainFactory.getDomainObject( ims.ocrr.orderingresults.domain.objects.ResultConclusionAndActionComment.class, vo.getBoId());
				}
			}

			int domIdx = domainResultConclusionComments13.indexOf(dom);
			if (domIdx == -1)
			{
				domainResultConclusionComments13.add(i, dom);
			}
			else if (i != domIdx && i < domainResultConclusionComments13.size())
			{
				Object tmp = domainResultConclusionComments13.get(i);
				domainResultConclusionComments13.set(i, domainResultConclusionComments13.get(domIdx));
				domainResultConclusionComments13.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i13 = domainResultConclusionComments13.size();
		while (i13 > size13)
		{
			domainResultConclusionComments13.remove(i13-1);
			i13 = domainResultConclusionComments13.size();
		}
		
		domainObject.setResultConclusionComments(domainResultConclusionComments13);		

		return domainObject;
	}

}
