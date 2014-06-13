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
 * @author Marius Mihalec
 */
public class NewResultsListVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.NewResultsListVo copy(ims.ocrr.vo.NewResultsListVo valueObjectDest, ims.ocrr.vo.NewResultsListVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_OrderInvestigation(valueObjectSrc.getID_OrderInvestigation());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// DisplayDateTime
		valueObjectDest.setDisplayDateTime(valueObjectSrc.getDisplayDateTime());
		// OrderDetails
		valueObjectDest.setOrderDetails(valueObjectSrc.getOrderDetails());
		// Investigation
		valueObjectDest.setInvestigation(valueObjectSrc.getInvestigation());
		// OrdInvCurrentStatus
		valueObjectDest.setOrdInvCurrentStatus(valueObjectSrc.getOrdInvCurrentStatus());
		// Specimen
		valueObjectDest.setSpecimen(valueObjectSrc.getSpecimen());
		// RepDateTime
		valueObjectDest.setRepDateTime(valueObjectSrc.getRepDateTime());
		// ResultStatus
		valueObjectDest.setResultStatus(valueObjectSrc.getResultStatus());
		// OrdInvXOStatusHistory
		valueObjectDest.setOrdInvXOStatusHistory(valueObjectSrc.getOrdInvXOStatusHistory());
		// ResultConclusionComments
		valueObjectDest.setResultConclusionComments(valueObjectSrc.getResultConclusionComments());
		// ResultDetails
		valueObjectDest.setResultDetails(valueObjectSrc.getResultDetails());
		// AllocatedHCPforReview
		valueObjectDest.setAllocatedHCPforReview(valueObjectSrc.getAllocatedHCPforReview());
		// AllocatedDateForReview
		valueObjectDest.setAllocatedDateForReview(valueObjectSrc.getAllocatedDateForReview());
		// ordInvSeq
		valueObjectDest.setOrdInvSeq(valueObjectSrc.getOrdInvSeq());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createNewResultsListVoCollectionFromOrderInvestigation(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OrderInvestigation objects.
	 */
	public static ims.ocrr.vo.NewResultsListVoCollection createNewResultsListVoCollectionFromOrderInvestigation(java.util.Set domainObjectSet)	
	{
		return createNewResultsListVoCollectionFromOrderInvestigation(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OrderInvestigation objects.
	 */
	public static ims.ocrr.vo.NewResultsListVoCollection createNewResultsListVoCollectionFromOrderInvestigation(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.NewResultsListVoCollection voList = new ims.ocrr.vo.NewResultsListVoCollection();
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
			ims.ocrr.vo.NewResultsListVo vo = create(map, domainObject);
			
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
	public static ims.ocrr.vo.NewResultsListVoCollection createNewResultsListVoCollectionFromOrderInvestigation(java.util.List domainObjectList) 
	{
		return createNewResultsListVoCollectionFromOrderInvestigation(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.OrderInvestigation objects.
	 */
	public static ims.ocrr.vo.NewResultsListVoCollection createNewResultsListVoCollectionFromOrderInvestigation(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.NewResultsListVoCollection voList = new ims.ocrr.vo.NewResultsListVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation) domainObjectList.get(i);
			ims.ocrr.vo.NewResultsListVo vo = create(map, domainObject);

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
	 public static java.util.Set extractOrderInvestigationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.NewResultsListVoCollection voCollection) 
	 {
	 	return extractOrderInvestigationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOrderInvestigationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.NewResultsListVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.NewResultsListVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject = NewResultsListVoAssembler.extractOrderInvestigation(domainFactory, vo, domMap);

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
	 public static java.util.List extractOrderInvestigationList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.NewResultsListVoCollection voCollection) 
	 {
	 	return extractOrderInvestigationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOrderInvestigationList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.NewResultsListVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.NewResultsListVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject = NewResultsListVoAssembler.extractOrderInvestigation(domainFactory, vo, domMap);

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
	 public static ims.ocrr.vo.NewResultsListVo create(ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject) 
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
	  public static ims.ocrr.vo.NewResultsListVo create(DomainObjectMap map, ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.NewResultsListVo valueObject = (ims.ocrr.vo.NewResultsListVo) map.getValueObject(domainObject, ims.ocrr.vo.NewResultsListVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.NewResultsListVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.ocrr.vo.NewResultsListVo insert(ims.ocrr.vo.NewResultsListVo valueObject, ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject) 
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
	 public static ims.ocrr.vo.NewResultsListVo insert(DomainObjectMap map, ims.ocrr.vo.NewResultsListVo valueObject, ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject) 
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
			
		// DisplayDateTime
		java.util.Date DisplayDateTime = domainObject.getDisplayDateTime();
		if ( null != DisplayDateTime ) 
		{
			valueObject.setDisplayDateTime(new ims.framework.utils.DateTime(DisplayDateTime) );
		}
		// OrderDetails
		valueObject.setOrderDetails(ims.ocrr.vo.domain.NewResultsListOrderDetailsVoAssembler.create(map, domainObject.getOrderDetails()) );
		// Investigation
		valueObject.setInvestigation(ims.ocrr.vo.domain.NewResultsListInvestigationVoAssembler.create(map, domainObject.getInvestigation()) );
		// OrdInvCurrentStatus
		valueObject.setOrdInvCurrentStatus(ims.ocrr.vo.domain.NewResultsListOrderInvestigationStatusVoAssembler.create(map, domainObject.getOrdInvCurrentStatus()) );
		// Specimen
		valueObject.setSpecimen(ims.ocrr.vo.domain.OrderSpecimenCommentsVoAssembler.createOrderSpecimenCommentsVoCollectionFromOrderSpecimen(map, domainObject.getSpecimen()) );
		// RepDateTime
		java.util.Date RepDateTime = domainObject.getRepDateTime();
		if ( null != RepDateTime ) 
		{
			valueObject.setRepDateTime(new ims.framework.utils.DateTime(RepDateTime) );
		}
		// ResultStatus
		ims.domain.lookups.LookupInstance instance7 = domainObject.getResultStatus();
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

			ims.ocrr.vo.lookups.ResultStatus voLookup7 = new ims.ocrr.vo.lookups.ResultStatus(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.ocrr.vo.lookups.ResultStatus parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.ocrr.vo.lookups.ResultStatus(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setResultStatus(voLookup7);
		}
				// OrdInvXOStatusHistory
		valueObject.setOrdInvXOStatusHistory(ims.ocrr.vo.domain.OrdInvXOStatusHistoryLiteVoAssembler.createOrdInvXOStatusHistoryLiteVoCollectionFromOrderedInvestigationStatus(map, domainObject.getOrdInvXOStatusHistory()) );
		// ResultConclusionComments
		valueObject.setResultConclusionComments(ims.ocrr.vo.domain.ResultCommentsLiteVoAssembler.createResultCommentsLiteVoCollectionFromResultConclusionAndActionComment(map, domainObject.getResultConclusionComments()) );
		// ResultDetails
		valueObject.setResultDetails(ims.ocrr.vo.domain.ResultDetailsForNewResultsListVoAssembler.create(map, domainObject.getResultDetails()) );
		// AllocatedHCPforReview
		valueObject.setAllocatedHCPforReview(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getAllocatedHCPforReview()) );
		// AllocatedDateForReview
		java.util.Date AllocatedDateForReview = domainObject.getAllocatedDateForReview();
		if ( null != AllocatedDateForReview ) 
		{
			valueObject.setAllocatedDateForReview(new ims.framework.utils.DateTime(AllocatedDateForReview) );
		}
		// ordInvSeq
		valueObject.setOrdInvSeq(domainObject.getOrdInvSeq());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.orderingresults.domain.objects.OrderInvestigation extractOrderInvestigation(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.NewResultsListVo valueObject) 
	{
		return 	extractOrderInvestigation(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.orderingresults.domain.objects.OrderInvestigation extractOrderInvestigation(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.NewResultsListVo valueObject, HashMap domMap) 
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
			// ims.ocrr.vo.NewResultsListVo ID_OrderInvestigation field is unknown
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

		ims.framework.utils.DateTime dateTime1 = valueObject.getDisplayDateTime();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setDisplayDateTime(value1);
		domainObject.setOrderDetails(ims.ocrr.vo.domain.NewResultsListOrderDetailsVoAssembler.extractOcsOrderSession(domainFactory, valueObject.getOrderDetails(), domMap));
		domainObject.setInvestigation(ims.ocrr.vo.domain.NewResultsListInvestigationVoAssembler.extractInvestigation(domainFactory, valueObject.getInvestigation(), domMap));
		domainObject.setOrdInvCurrentStatus(ims.ocrr.vo.domain.NewResultsListOrderInvestigationStatusVoAssembler.extractOrderedInvestigationStatus(domainFactory, valueObject.getOrdInvCurrentStatus(), domMap));
		domainObject.setSpecimen(ims.ocrr.vo.domain.OrderSpecimenCommentsVoAssembler.extractOrderSpecimenList(domainFactory, valueObject.getSpecimen(), domainObject.getSpecimen(), domMap));		
		ims.framework.utils.DateTime dateTime6 = valueObject.getRepDateTime();
		java.util.Date value6 = null;
		if ( dateTime6 != null ) 
		{
			value6 = dateTime6.getJavaDate();
		}
		domainObject.setRepDateTime(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getResultStatus() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getResultStatus().getID());
		}
		domainObject.setResultStatus(value7);

		// SaveAsRefVO treated as RefValueObject
		ims.ocrr.orderingresults.vo.OrderedInvestigationStatusRefVoCollection refCollection8 = new ims.ocrr.orderingresults.vo.OrderedInvestigationStatusRefVoCollection();
		if (valueObject.getOrdInvXOStatusHistory() != null)
		{
			for (int i8=0; i8<valueObject.getOrdInvXOStatusHistory().size(); i8++)
			{
				ims.ocrr.orderingresults.vo.OrderedInvestigationStatusRefVo ref8 = (ims.ocrr.orderingresults.vo.OrderedInvestigationStatusRefVo)valueObject.getOrdInvXOStatusHistory().get(i8);
				refCollection8.add(ref8);
			}
		}
		int size8 = (null == refCollection8) ? 0 : refCollection8.size();		
		java.util.List domainOrdInvXOStatusHistory8 = domainObject.getOrdInvXOStatusHistory();
		if (domainOrdInvXOStatusHistory8 == null)
		{
			domainOrdInvXOStatusHistory8 = new java.util.ArrayList();
		}
		for(int i=0; i < size8; i++) 
		{
			ims.ocrr.orderingresults.vo.OrderedInvestigationStatusRefVo vo = refCollection8.get(i);			
			ims.ocrr.orderingresults.domain.objects.OrderedInvestigationStatus dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.ocrr.orderingresults.domain.objects.OrderedInvestigationStatus)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.ocrr.orderingresults.domain.objects.OrderedInvestigationStatus)domainFactory.getDomainObject( ims.ocrr.orderingresults.domain.objects.OrderedInvestigationStatus.class, vo.getBoId());
				}
			}

			int domIdx = domainOrdInvXOStatusHistory8.indexOf(dom);
			if (domIdx == -1)
			{
				domainOrdInvXOStatusHistory8.add(i, dom);
			}
			else if (i != domIdx && i < domainOrdInvXOStatusHistory8.size())
			{
				Object tmp = domainOrdInvXOStatusHistory8.get(i);
				domainOrdInvXOStatusHistory8.set(i, domainOrdInvXOStatusHistory8.get(domIdx));
				domainOrdInvXOStatusHistory8.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i8 = domainOrdInvXOStatusHistory8.size();
		while (i8 > size8)
		{
			domainOrdInvXOStatusHistory8.remove(i8-1);
			i8 = domainOrdInvXOStatusHistory8.size();
		}
		
		domainObject.setOrdInvXOStatusHistory(domainOrdInvXOStatusHistory8);		

		// SaveAsRefVO treated as RefValueObject
		ims.ocrr.orderingresults.vo.ResultConclusionAndActionCommentRefVoCollection refCollection9 = new ims.ocrr.orderingresults.vo.ResultConclusionAndActionCommentRefVoCollection();
		if (valueObject.getResultConclusionComments() != null)
		{
			for (int i9=0; i9<valueObject.getResultConclusionComments().size(); i9++)
			{
				ims.ocrr.orderingresults.vo.ResultConclusionAndActionCommentRefVo ref9 = (ims.ocrr.orderingresults.vo.ResultConclusionAndActionCommentRefVo)valueObject.getResultConclusionComments().get(i9);
				refCollection9.add(ref9);
			}
		}
		int size9 = (null == refCollection9) ? 0 : refCollection9.size();		
		java.util.List domainResultConclusionComments9 = domainObject.getResultConclusionComments();
		if (domainResultConclusionComments9 == null)
		{
			domainResultConclusionComments9 = new java.util.ArrayList();
		}
		for(int i=0; i < size9; i++) 
		{
			ims.ocrr.orderingresults.vo.ResultConclusionAndActionCommentRefVo vo = refCollection9.get(i);			
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

			int domIdx = domainResultConclusionComments9.indexOf(dom);
			if (domIdx == -1)
			{
				domainResultConclusionComments9.add(i, dom);
			}
			else if (i != domIdx && i < domainResultConclusionComments9.size())
			{
				Object tmp = domainResultConclusionComments9.get(i);
				domainResultConclusionComments9.set(i, domainResultConclusionComments9.get(domIdx));
				domainResultConclusionComments9.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i9 = domainResultConclusionComments9.size();
		while (i9 > size9)
		{
			domainResultConclusionComments9.remove(i9-1);
			i9 = domainResultConclusionComments9.size();
		}
		
		domainObject.setResultConclusionComments(domainResultConclusionComments9);		
		domainObject.setResultDetails(ims.ocrr.vo.domain.ResultDetailsForNewResultsListVoAssembler.extractResultDetails(domainFactory, valueObject.getResultDetails(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value11 = null;
		if ( null != valueObject.getAllocatedHCPforReview() ) 
		{
			if (valueObject.getAllocatedHCPforReview().getBoId() == null)
			{
				if (domMap.get(valueObject.getAllocatedHCPforReview()) != null)
				{
					value11 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getAllocatedHCPforReview());
				}
			}
			else
			{
				value11 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getAllocatedHCPforReview().getBoId());
			}
		}
		domainObject.setAllocatedHCPforReview(value11);
		ims.framework.utils.DateTime dateTime12 = valueObject.getAllocatedDateForReview();
		java.util.Date value12 = null;
		if ( dateTime12 != null ) 
		{
			value12 = dateTime12.getJavaDate();
		}
		domainObject.setAllocatedDateForReview(value12);
		domainObject.setOrdInvSeq(valueObject.getOrdInvSeq());

		return domainObject;
	}

}
