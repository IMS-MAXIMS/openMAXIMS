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
package ims.ocs_if.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author John MacEnri
 */
public class IfOrderInvestigationVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocs_if.vo.IfOrderInvestigationVo copy(ims.ocs_if.vo.IfOrderInvestigationVo valueObjectDest, ims.ocs_if.vo.IfOrderInvestigationVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_OrderInvestigation(valueObjectSrc.getID_OrderInvestigation());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// OrderPriority
		valueObjectDest.setOrderPriority(valueObjectSrc.getOrderPriority());
		// RepDateTime
		valueObjectDest.setRepDateTime(valueObjectSrc.getRepDateTime());
		// RepTimeSupplied
		valueObjectDest.setRepTimeSupplied(valueObjectSrc.getRepTimeSupplied());
		// DisplayDateTime
		valueObjectDest.setDisplayDateTime(valueObjectSrc.getDisplayDateTime());
		// DisplayFlag
		valueObjectDest.setDisplayFlag(valueObjectSrc.getDisplayFlag());
		// wasOrdered
		valueObjectDest.setWasOrdered(valueObjectSrc.getWasOrdered());
		// ResultStatus
		valueObjectDest.setResultStatus(valueObjectSrc.getResultStatus());
		// OrdInvCurrentStatus
		valueObjectDest.setOrdInvCurrentStatus(valueObjectSrc.getOrdInvCurrentStatus());
		// FillerOrdNum
		valueObjectDest.setFillerOrdNum(valueObjectSrc.getFillerOrdNum());
		// Specimen
		valueObjectDest.setSpecimen(valueObjectSrc.getSpecimen());
		// AppointmentDate
		valueObjectDest.setAppointmentDate(valueObjectSrc.getAppointmentDate());
		// ReasonForStudy
		valueObjectDest.setReasonForStudy(valueObjectSrc.getReasonForStudy());
		// Investigation
		valueObjectDest.setInvestigation(valueObjectSrc.getInvestigation());
		// OrderDetails
		valueObjectDest.setOrderDetails(valueObjectSrc.getOrderDetails());
		// DisplayTimeSupplied
		valueObjectDest.setDisplayTimeSupplied(valueObjectSrc.getDisplayTimeSupplied());
		// ordInvSeq
		valueObjectDest.setOrdInvSeq(valueObjectSrc.getOrdInvSeq());
		// ExamReqOnAfterDate
		valueObjectDest.setExamReqOnAfterDate(valueObjectSrc.getExamReqOnAfterDate());
		// EnterTheatreDate
		valueObjectDest.setEnterTheatreDate(valueObjectSrc.getEnterTheatreDate());
		// StartProcedureDate
		valueObjectDest.setStartProcedureDate(valueObjectSrc.getStartProcedureDate());
		// EndProcedureDate
		valueObjectDest.setEndProcedureDate(valueObjectSrc.getEndProcedureDate());
		// LeaveRecoveryDate
		valueObjectDest.setLeaveRecoveryDate(valueObjectSrc.getLeaveRecoveryDate());
		// AccessionNumber
		valueObjectDest.setAccessionNumber(valueObjectSrc.getAccessionNumber());
		// wasSecondaryMatchingUsed
		valueObjectDest.setWasSecondaryMatchingUsed(valueObjectSrc.getWasSecondaryMatchingUsed());
		// ResultSpecimenType
		valueObjectDest.setResultSpecimenType(valueObjectSrc.getResultSpecimenType());
		// ResultDemographics
		valueObjectDest.setResultDemographics(valueObjectSrc.getResultDemographics());
		// ResultDetails
		valueObjectDest.setResultDetails(valueObjectSrc.getResultDetails());
		// ExpectedDateTime
		valueObjectDest.setExpectedDateTime(valueObjectSrc.getExpectedDateTime());
		// ReorderReason
		valueObjectDest.setReorderReason(valueObjectSrc.getReorderReason());
		// ResultSortDate
		valueObjectDest.setResultSortDate(valueObjectSrc.getResultSortDate());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createIfOrderInvestigationVoCollectionFromOrderInvestigation(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OrderInvestigation objects.
	 */
	public static ims.ocs_if.vo.IfOrderInvestigationVoCollection createIfOrderInvestigationVoCollectionFromOrderInvestigation(java.util.Set domainObjectSet)	
	{
		return createIfOrderInvestigationVoCollectionFromOrderInvestigation(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OrderInvestigation objects.
	 */
	public static ims.ocs_if.vo.IfOrderInvestigationVoCollection createIfOrderInvestigationVoCollectionFromOrderInvestigation(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocs_if.vo.IfOrderInvestigationVoCollection voList = new ims.ocs_if.vo.IfOrderInvestigationVoCollection();
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
			ims.ocs_if.vo.IfOrderInvestigationVo vo = create(map, domainObject);
			
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
	public static ims.ocs_if.vo.IfOrderInvestigationVoCollection createIfOrderInvestigationVoCollectionFromOrderInvestigation(java.util.List domainObjectList) 
	{
		return createIfOrderInvestigationVoCollectionFromOrderInvestigation(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.OrderInvestigation objects.
	 */
	public static ims.ocs_if.vo.IfOrderInvestigationVoCollection createIfOrderInvestigationVoCollectionFromOrderInvestigation(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocs_if.vo.IfOrderInvestigationVoCollection voList = new ims.ocs_if.vo.IfOrderInvestigationVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation) domainObjectList.get(i);
			ims.ocs_if.vo.IfOrderInvestigationVo vo = create(map, domainObject);

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
	 public static java.util.Set extractOrderInvestigationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOrderInvestigationVoCollection voCollection) 
	 {
	 	return extractOrderInvestigationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOrderInvestigationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOrderInvestigationVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocs_if.vo.IfOrderInvestigationVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject = IfOrderInvestigationVoAssembler.extractOrderInvestigation(domainFactory, vo, domMap);

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
	 public static java.util.List extractOrderInvestigationList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOrderInvestigationVoCollection voCollection) 
	 {
	 	return extractOrderInvestigationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOrderInvestigationList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOrderInvestigationVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocs_if.vo.IfOrderInvestigationVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject = IfOrderInvestigationVoAssembler.extractOrderInvestigation(domainFactory, vo, domMap);

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
	 public static ims.ocs_if.vo.IfOrderInvestigationVo create(ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject) 
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
	  public static ims.ocs_if.vo.IfOrderInvestigationVo create(DomainObjectMap map, ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocs_if.vo.IfOrderInvestigationVo valueObject = (ims.ocs_if.vo.IfOrderInvestigationVo) map.getValueObject(domainObject, ims.ocs_if.vo.IfOrderInvestigationVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocs_if.vo.IfOrderInvestigationVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.ocs_if.vo.IfOrderInvestigationVo insert(ims.ocs_if.vo.IfOrderInvestigationVo valueObject, ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject) 
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
	 public static ims.ocs_if.vo.IfOrderInvestigationVo insert(DomainObjectMap map, ims.ocs_if.vo.IfOrderInvestigationVo valueObject, ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject) 
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
			
		// OrderPriority
		ims.domain.lookups.LookupInstance instance1 = domainObject.getOrderPriority();
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

			ims.ocrr.vo.lookups.OrderPriority voLookup1 = new ims.ocrr.vo.lookups.OrderPriority(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.ocrr.vo.lookups.OrderPriority parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.ocrr.vo.lookups.OrderPriority(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setOrderPriority(voLookup1);
		}
				// RepDateTime
		java.util.Date RepDateTime = domainObject.getRepDateTime();
		if ( null != RepDateTime ) 
		{
			valueObject.setRepDateTime(new ims.framework.utils.DateTime(RepDateTime) );
		}
		// RepTimeSupplied
		valueObject.setRepTimeSupplied( domainObject.isRepTimeSupplied() );
		// DisplayDateTime
		java.util.Date DisplayDateTime = domainObject.getDisplayDateTime();
		if ( null != DisplayDateTime ) 
		{
			valueObject.setDisplayDateTime(new ims.framework.utils.DateTime(DisplayDateTime) );
		}
		// DisplayFlag
		ims.domain.lookups.LookupInstance instance5 = domainObject.getDisplayFlag();
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

			ims.ocrr.vo.lookups.OcsDisplayFlag voLookup5 = new ims.ocrr.vo.lookups.OcsDisplayFlag(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.ocrr.vo.lookups.OcsDisplayFlag parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.ocrr.vo.lookups.OcsDisplayFlag(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setDisplayFlag(voLookup5);
		}
				// wasOrdered
		valueObject.setWasOrdered( domainObject.isWasOrdered() );
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
				// OrdInvCurrentStatus
		valueObject.setOrdInvCurrentStatus(ims.ocs_if.vo.domain.IfOrderInvCurrentStatusVoAssembler.create(map, domainObject.getOrdInvCurrentStatus()) );
		// FillerOrdNum
		valueObject.setFillerOrdNum(domainObject.getFillerOrdNum());
		// Specimen
		valueObject.setSpecimen(ims.ocs_if.vo.domain.IfOrderSpecimenVoAssembler.createIfOrderSpecimenVoCollectionFromOrderSpecimen(map, domainObject.getSpecimen()) );
		// AppointmentDate
		java.util.Date AppointmentDate = domainObject.getAppointmentDate();
		if ( null != AppointmentDate ) 
		{
			valueObject.setAppointmentDate(new ims.framework.utils.DateTime(AppointmentDate) );
		}
		// ReasonForStudy
		valueObject.setReasonForStudy(domainObject.getReasonForStudy());
		// Investigation
		valueObject.setInvestigation(ims.ocs_if.vo.domain.IfInvestigationLiteVoAssembler.create(map, domainObject.getInvestigation()) );
		// OrderDetails
		if (domainObject.getOrderDetails() != null)
		{
			if(domainObject.getOrderDetails() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getOrderDetails();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setOrderDetails(new ims.ocrr.orderingresults.vo.OcsOrderSessionRefVo(id, -1));				
			}
			else
			{
				valueObject.setOrderDetails(new ims.ocrr.orderingresults.vo.OcsOrderSessionRefVo(domainObject.getOrderDetails().getId(), domainObject.getOrderDetails().getVersion()));
			}
		}
		// DisplayTimeSupplied
		valueObject.setDisplayTimeSupplied( domainObject.isDisplayTimeSupplied() );
		// ordInvSeq
		valueObject.setOrdInvSeq(domainObject.getOrdInvSeq());
		// ExamReqOnAfterDate
		java.util.Date ExamReqOnAfterDate = domainObject.getExamReqOnAfterDate();
		if ( null != ExamReqOnAfterDate ) 
		{
			valueObject.setExamReqOnAfterDate(new ims.framework.utils.Date(ExamReqOnAfterDate) );
		}
		// EnterTheatreDate
		java.util.Date EnterTheatreDate = domainObject.getEnterTheatreDate();
		if ( null != EnterTheatreDate ) 
		{
			valueObject.setEnterTheatreDate(new ims.framework.utils.DateTime(EnterTheatreDate) );
		}
		// StartProcedureDate
		java.util.Date StartProcedureDate = domainObject.getStartProcedureDate();
		if ( null != StartProcedureDate ) 
		{
			valueObject.setStartProcedureDate(new ims.framework.utils.DateTime(StartProcedureDate) );
		}
		// EndProcedureDate
		java.util.Date EndProcedureDate = domainObject.getEndProcedureDate();
		if ( null != EndProcedureDate ) 
		{
			valueObject.setEndProcedureDate(new ims.framework.utils.DateTime(EndProcedureDate) );
		}
		// LeaveRecoveryDate
		java.util.Date LeaveRecoveryDate = domainObject.getLeaveRecoveryDate();
		if ( null != LeaveRecoveryDate ) 
		{
			valueObject.setLeaveRecoveryDate(new ims.framework.utils.DateTime(LeaveRecoveryDate) );
		}
		// AccessionNumber
		valueObject.setAccessionNumber(domainObject.getAccessionNumber());
		// wasSecondaryMatchingUsed
		valueObject.setWasSecondaryMatchingUsed( domainObject.isWasSecondaryMatchingUsed() );
		// ResultSpecimenType
		ims.domain.lookups.LookupInstance instance24 = domainObject.getResultSpecimenType();
		if ( null != instance24 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance24.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance24.getImage().getImageId(), instance24.getImage().getImagePath());
			}
			color = instance24.getColor();
			if (color != null) 
				color.getValue();

			ims.vo.LookupInstVo voLookup24 = new ims.vo.LookupInstVo(instance24.getId(),instance24.getText(), instance24.isActive(), null, img, color);
			ims.vo.LookupInstVo parentVoLookup24 = voLookup24;
			ims.domain.lookups.LookupInstance parent24 = instance24.getParent();
			while (parent24 != null)
			{
				if (parent24.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent24.getImage().getImageId(), parent24.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent24.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup24.setParentInstance(new ims.vo.LookupInstVo(parent24.getId(),parent24.getText(), parent24.isActive(), null, img, color));
				parentVoLookup24 = parentVoLookup24.getParentInstance();
								parent24 = parent24.getParent();
			}			
			valueObject.setResultSpecimenType(voLookup24);
		}
				// ResultDemographics
		valueObject.setResultDemographics(ims.ocrr.vo.domain.ResultDemographicsVoAssembler.create(map, domainObject.getResultDemographics()) );
		// ResultDetails
		valueObject.setResultDetails(ims.ocs_if.vo.domain.IfResultDetailsVoAssembler.create(map, domainObject.getResultDetails()) );
		// ExpectedDateTime
		java.util.Date ExpectedDateTime = domainObject.getExpectedDateTime();
		if ( null != ExpectedDateTime ) 
		{
			valueObject.setExpectedDateTime(new ims.framework.utils.DateTime(ExpectedDateTime) );
		}
		// ReorderReason
		valueObject.setReorderReason(domainObject.getReorderReason());
		// ResultSortDate
		java.util.Date ResultSortDate = domainObject.getResultSortDate();
		if ( null != ResultSortDate ) 
		{
			valueObject.setResultSortDate(new ims.framework.utils.DateTime(ResultSortDate) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.orderingresults.domain.objects.OrderInvestigation extractOrderInvestigation(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOrderInvestigationVo valueObject) 
	{
		return 	extractOrderInvestigation(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.orderingresults.domain.objects.OrderInvestigation extractOrderInvestigation(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOrderInvestigationVo valueObject, HashMap domMap) 
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
			// ims.ocs_if.vo.IfOrderInvestigationVo ID_OrderInvestigation field is unknown
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

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getOrderPriority() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getOrderPriority().getID());
		}
		domainObject.setOrderPriority(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getRepDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setRepDateTime(value2);
		domainObject.setRepTimeSupplied(valueObject.getRepTimeSupplied());
		ims.framework.utils.DateTime dateTime4 = valueObject.getDisplayDateTime();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setDisplayDateTime(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getDisplayFlag() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getDisplayFlag().getID());
		}
		domainObject.setDisplayFlag(value5);
		domainObject.setWasOrdered(valueObject.getWasOrdered());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getResultStatus() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getResultStatus().getID());
		}
		domainObject.setResultStatus(value7);
		domainObject.setOrdInvCurrentStatus(ims.ocs_if.vo.domain.IfOrderInvCurrentStatusVoAssembler.extractOrderedInvestigationStatus(domainFactory, valueObject.getOrdInvCurrentStatus(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getFillerOrdNum() != null && valueObject.getFillerOrdNum().equals(""))
		{
			valueObject.setFillerOrdNum(null);
		}
		domainObject.setFillerOrdNum(valueObject.getFillerOrdNum());
		domainObject.setSpecimen(ims.ocs_if.vo.domain.IfOrderSpecimenVoAssembler.extractOrderSpecimenList(domainFactory, valueObject.getSpecimen(), domainObject.getSpecimen(), domMap));		
		ims.framework.utils.DateTime dateTime11 = valueObject.getAppointmentDate();
		java.util.Date value11 = null;
		if ( dateTime11 != null ) 
		{
			value11 = dateTime11.getJavaDate();
		}
		domainObject.setAppointmentDate(value11);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReasonForStudy() != null && valueObject.getReasonForStudy().equals(""))
		{
			valueObject.setReasonForStudy(null);
		}
		domainObject.setReasonForStudy(valueObject.getReasonForStudy());
		domainObject.setInvestigation(ims.ocs_if.vo.domain.IfInvestigationLiteVoAssembler.extractInvestigation(domainFactory, valueObject.getInvestigation(), domMap));
		ims.ocrr.orderingresults.domain.objects.OcsOrderSession value14 = null;
		if ( null != valueObject.getOrderDetails() ) 
		{
			if (valueObject.getOrderDetails().getBoId() == null)
			{
				if (domMap.get(valueObject.getOrderDetails()) != null)
				{
					value14 = (ims.ocrr.orderingresults.domain.objects.OcsOrderSession)domMap.get(valueObject.getOrderDetails());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value14 = domainObject.getOrderDetails();	
			}
			else
			{
				value14 = (ims.ocrr.orderingresults.domain.objects.OcsOrderSession)domainFactory.getDomainObject(ims.ocrr.orderingresults.domain.objects.OcsOrderSession.class, valueObject.getOrderDetails().getBoId());
			}
		}
		domainObject.setOrderDetails(value14);
		domainObject.setDisplayTimeSupplied(valueObject.getDisplayTimeSupplied());
		domainObject.setOrdInvSeq(valueObject.getOrdInvSeq());
		java.util.Date value17 = null;
		ims.framework.utils.Date date17 = valueObject.getExamReqOnAfterDate();		
		if ( date17 != null ) 
		{
			value17 = date17.getDate();
		}
		domainObject.setExamReqOnAfterDate(value17);
		ims.framework.utils.DateTime dateTime18 = valueObject.getEnterTheatreDate();
		java.util.Date value18 = null;
		if ( dateTime18 != null ) 
		{
			value18 = dateTime18.getJavaDate();
		}
		domainObject.setEnterTheatreDate(value18);
		ims.framework.utils.DateTime dateTime19 = valueObject.getStartProcedureDate();
		java.util.Date value19 = null;
		if ( dateTime19 != null ) 
		{
			value19 = dateTime19.getJavaDate();
		}
		domainObject.setStartProcedureDate(value19);
		ims.framework.utils.DateTime dateTime20 = valueObject.getEndProcedureDate();
		java.util.Date value20 = null;
		if ( dateTime20 != null ) 
		{
			value20 = dateTime20.getJavaDate();
		}
		domainObject.setEndProcedureDate(value20);
		ims.framework.utils.DateTime dateTime21 = valueObject.getLeaveRecoveryDate();
		java.util.Date value21 = null;
		if ( dateTime21 != null ) 
		{
			value21 = dateTime21.getJavaDate();
		}
		domainObject.setLeaveRecoveryDate(value21);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAccessionNumber() != null && valueObject.getAccessionNumber().equals(""))
		{
			valueObject.setAccessionNumber(null);
		}
		domainObject.setAccessionNumber(valueObject.getAccessionNumber());
		domainObject.setWasSecondaryMatchingUsed(valueObject.getWasSecondaryMatchingUsed());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value24 = null;
		if ( null != valueObject.getResultSpecimenType() ) 
		{
			value24 =
				domainFactory.getLookupInstance(valueObject.getResultSpecimenType().getID());
		}
		domainObject.setResultSpecimenType(value24);
		domainObject.setResultDemographics(ims.ocrr.vo.domain.ResultDemographicsVoAssembler.extractMinDemographics(domainFactory, valueObject.getResultDemographics(), domMap));
		domainObject.setResultDetails(ims.ocs_if.vo.domain.IfResultDetailsVoAssembler.extractResultDetails(domainFactory, valueObject.getResultDetails(), domMap));
		ims.framework.utils.DateTime dateTime27 = valueObject.getExpectedDateTime();
		java.util.Date value27 = null;
		if ( dateTime27 != null ) 
		{
			value27 = dateTime27.getJavaDate();
		}
		domainObject.setExpectedDateTime(value27);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReorderReason() != null && valueObject.getReorderReason().equals(""))
		{
			valueObject.setReorderReason(null);
		}
		domainObject.setReorderReason(valueObject.getReorderReason());
		ims.framework.utils.DateTime dateTime29 = valueObject.getResultSortDate();
		java.util.Date value29 = null;
		if ( dateTime29 != null ) 
		{
			value29 = dateTime29.getJavaDate();
		}
		domainObject.setResultSortDate(value29);

		return domainObject;
	}

}
