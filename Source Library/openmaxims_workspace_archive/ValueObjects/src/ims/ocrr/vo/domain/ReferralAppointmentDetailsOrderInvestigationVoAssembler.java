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
package ims.ocrr.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class ReferralAppointmentDetailsOrderInvestigationVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.ReferralAppointmentDetailsOrderInvestigationVo copy(ims.ocrr.vo.ReferralAppointmentDetailsOrderInvestigationVo valueObjectDest, ims.ocrr.vo.ReferralAppointmentDetailsOrderInvestigationVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_OrderInvestigation(valueObjectSrc.getID_OrderInvestigation());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Specimen
		valueObjectDest.setSpecimen(valueObjectSrc.getSpecimen());
		// AppointmentDate
		valueObjectDest.setAppointmentDate(valueObjectSrc.getAppointmentDate());
		// SysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
		// Investigation
		valueObjectDest.setInvestigation(valueObjectSrc.getInvestigation());
		// OrdInvCurrentStatus
		valueObjectDest.setOrdInvCurrentStatus(valueObjectSrc.getOrdInvCurrentStatus());
		// DisplayDateTime
		valueObjectDest.setDisplayDateTime(valueObjectSrc.getDisplayDateTime());
		// OrderDetails
		valueObjectDest.setOrderDetails(valueObjectSrc.getOrderDetails());
		// RepDateTime
		valueObjectDest.setRepDateTime(valueObjectSrc.getRepDateTime());
		// RepTimeSupplied
		valueObjectDest.setRepTimeSupplied(valueObjectSrc.getRepTimeSupplied());
		// DisplayTimeSupplied
		valueObjectDest.setDisplayTimeSupplied(valueObjectSrc.getDisplayTimeSupplied());
		// DisplayFlag
		valueObjectDest.setDisplayFlag(valueObjectSrc.getDisplayFlag());
		// ResultStatus
		valueObjectDest.setResultStatus(valueObjectSrc.getResultStatus());
		// OrdInvStatusHistory
		valueObjectDest.setOrdInvStatusHistory(valueObjectSrc.getOrdInvStatusHistory());
		// FillerOrdNum
		valueObjectDest.setFillerOrdNum(valueObjectSrc.getFillerOrdNum());
		// PerformedLocation
		valueObjectDest.setPerformedLocation(valueObjectSrc.getPerformedLocation());
		// InvestigationDateTime
		valueObjectDest.setInvestigationDateTime(valueObjectSrc.getInvestigationDateTime());
		// ResultDetails
		valueObjectDest.setResultDetails(valueObjectSrc.getResultDetails());
		// ResultSortDate
		valueObjectDest.setResultSortDate(valueObjectSrc.getResultSortDate());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createReferralAppointmentDetailsOrderInvestigationVoCollectionFromOrderInvestigation(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OrderInvestigation objects.
	 */
	public static ims.ocrr.vo.ReferralAppointmentDetailsOrderInvestigationVoCollection createReferralAppointmentDetailsOrderInvestigationVoCollectionFromOrderInvestigation(java.util.Set domainObjectSet)	
	{
		return createReferralAppointmentDetailsOrderInvestigationVoCollectionFromOrderInvestigation(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OrderInvestigation objects.
	 */
	public static ims.ocrr.vo.ReferralAppointmentDetailsOrderInvestigationVoCollection createReferralAppointmentDetailsOrderInvestigationVoCollectionFromOrderInvestigation(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.ReferralAppointmentDetailsOrderInvestigationVoCollection voList = new ims.ocrr.vo.ReferralAppointmentDetailsOrderInvestigationVoCollection();
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
			ims.ocrr.vo.ReferralAppointmentDetailsOrderInvestigationVo vo = create(map, domainObject);
			
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
	public static ims.ocrr.vo.ReferralAppointmentDetailsOrderInvestigationVoCollection createReferralAppointmentDetailsOrderInvestigationVoCollectionFromOrderInvestigation(java.util.List domainObjectList) 
	{
		return createReferralAppointmentDetailsOrderInvestigationVoCollectionFromOrderInvestigation(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.OrderInvestigation objects.
	 */
	public static ims.ocrr.vo.ReferralAppointmentDetailsOrderInvestigationVoCollection createReferralAppointmentDetailsOrderInvestigationVoCollectionFromOrderInvestigation(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.ReferralAppointmentDetailsOrderInvestigationVoCollection voList = new ims.ocrr.vo.ReferralAppointmentDetailsOrderInvestigationVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation) domainObjectList.get(i);
			ims.ocrr.vo.ReferralAppointmentDetailsOrderInvestigationVo vo = create(map, domainObject);

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
	 public static java.util.Set extractOrderInvestigationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ReferralAppointmentDetailsOrderInvestigationVoCollection voCollection) 
	 {
	 	return extractOrderInvestigationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOrderInvestigationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ReferralAppointmentDetailsOrderInvestigationVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.ReferralAppointmentDetailsOrderInvestigationVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject = ReferralAppointmentDetailsOrderInvestigationVoAssembler.extractOrderInvestigation(domainFactory, vo, domMap);

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
	 public static java.util.List extractOrderInvestigationList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ReferralAppointmentDetailsOrderInvestigationVoCollection voCollection) 
	 {
	 	return extractOrderInvestigationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOrderInvestigationList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ReferralAppointmentDetailsOrderInvestigationVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.ReferralAppointmentDetailsOrderInvestigationVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject = ReferralAppointmentDetailsOrderInvestigationVoAssembler.extractOrderInvestigation(domainFactory, vo, domMap);

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
	 public static ims.ocrr.vo.ReferralAppointmentDetailsOrderInvestigationVo create(ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject) 
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
	  public static ims.ocrr.vo.ReferralAppointmentDetailsOrderInvestigationVo create(DomainObjectMap map, ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.ReferralAppointmentDetailsOrderInvestigationVo valueObject = (ims.ocrr.vo.ReferralAppointmentDetailsOrderInvestigationVo) map.getValueObject(domainObject, ims.ocrr.vo.ReferralAppointmentDetailsOrderInvestigationVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.ReferralAppointmentDetailsOrderInvestigationVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.ocrr.vo.ReferralAppointmentDetailsOrderInvestigationVo insert(ims.ocrr.vo.ReferralAppointmentDetailsOrderInvestigationVo valueObject, ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject) 
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
	 public static ims.ocrr.vo.ReferralAppointmentDetailsOrderInvestigationVo insert(DomainObjectMap map, ims.ocrr.vo.ReferralAppointmentDetailsOrderInvestigationVo valueObject, ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject) 
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
			
		// Specimen
		valueObject.setSpecimen(ims.ocrr.vo.domain.OrderSpecimenLiteVoAssembler.createOrderSpecimenLiteVoCollectionFromOrderSpecimen(map, domainObject.getSpecimen()) );
		// AppointmentDate
		java.util.Date AppointmentDate = domainObject.getAppointmentDate();
		if ( null != AppointmentDate ) 
		{
			valueObject.setAppointmentDate(new ims.framework.utils.DateTime(AppointmentDate) );
		}
		// SysInfo
		// set system information
		valueObject.setSysInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// Investigation
		valueObject.setInvestigation(ims.ocrr.vo.domain.InvestigationListVoAssembler.create(map, domainObject.getInvestigation()) );
		// OrdInvCurrentStatus
		valueObject.setOrdInvCurrentStatus(ims.ocrr.vo.domain.OrderedInvestigationStatusVoAssembler.create(map, domainObject.getOrdInvCurrentStatus()) );
		// DisplayDateTime
		java.util.Date DisplayDateTime = domainObject.getDisplayDateTime();
		if ( null != DisplayDateTime ) 
		{
			valueObject.setDisplayDateTime(new ims.framework.utils.DateTime(DisplayDateTime) );
		}
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
		// RepDateTime
		java.util.Date RepDateTime = domainObject.getRepDateTime();
		if ( null != RepDateTime ) 
		{
			valueObject.setRepDateTime(new ims.framework.utils.DateTime(RepDateTime) );
		}
		// RepTimeSupplied
		valueObject.setRepTimeSupplied( domainObject.isRepTimeSupplied() );
		// DisplayTimeSupplied
		valueObject.setDisplayTimeSupplied( domainObject.isDisplayTimeSupplied() );
		// DisplayFlag
		ims.domain.lookups.LookupInstance instance11 = domainObject.getDisplayFlag();
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

			ims.ocrr.vo.lookups.OcsDisplayFlag voLookup11 = new ims.ocrr.vo.lookups.OcsDisplayFlag(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.ocrr.vo.lookups.OcsDisplayFlag parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.ocrr.vo.lookups.OcsDisplayFlag(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setDisplayFlag(voLookup11);
		}
				// ResultStatus
		ims.domain.lookups.LookupInstance instance12 = domainObject.getResultStatus();
		if ( null != instance12 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance12.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance12.getImage().getImageId(), instance12.getImage().getImagePath());
			}
			color = instance12.getColor();
			if (color != null) 
				color.getValue();

			ims.ocrr.vo.lookups.ResultStatus voLookup12 = new ims.ocrr.vo.lookups.ResultStatus(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.ocrr.vo.lookups.ResultStatus parentVoLookup12 = voLookup12;
			ims.domain.lookups.LookupInstance parent12 = instance12.getParent();
			while (parent12 != null)
			{
				if (parent12.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent12.getImage().getImageId(), parent12.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent12.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup12.setParent(new ims.ocrr.vo.lookups.ResultStatus(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setResultStatus(voLookup12);
		}
				// OrdInvStatusHistory
		valueObject.setOrdInvStatusHistory(ims.ocrr.vo.domain.OrderedInvestigationStatusVoAssembler.createOrderedInvestigationStatusVoCollectionFromOrderedInvestigationStatus(map, domainObject.getOrdInvStatusHistory()) );
		// FillerOrdNum
		valueObject.setFillerOrdNum(domainObject.getFillerOrdNum());
		// PerformedLocation
		if (domainObject.getPerformedLocation() != null)
		{
			if(domainObject.getPerformedLocation() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPerformedLocation();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPerformedLocation(new ims.core.resource.place.vo.LocationRefVo(id, -1));				
			}
			else
			{
				valueObject.setPerformedLocation(new ims.core.resource.place.vo.LocationRefVo(domainObject.getPerformedLocation().getId(), domainObject.getPerformedLocation().getVersion()));
			}
		}
		// InvestigationDateTime
		java.util.Date InvestigationDateTime = domainObject.getInvestigationDateTime();
		if ( null != InvestigationDateTime ) 
		{
			valueObject.setInvestigationDateTime(new ims.framework.utils.DateTime(InvestigationDateTime) );
		}
		// ResultDetails
		valueObject.setResultDetails(ims.ocrr.vo.domain.ResultDetailsForReferralAppointmentDetailsOrderInvestigationVoAssembler.create(map, domainObject.getResultDetails()) );
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
	public static ims.ocrr.orderingresults.domain.objects.OrderInvestigation extractOrderInvestigation(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ReferralAppointmentDetailsOrderInvestigationVo valueObject) 
	{
		return 	extractOrderInvestigation(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.orderingresults.domain.objects.OrderInvestigation extractOrderInvestigation(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ReferralAppointmentDetailsOrderInvestigationVo valueObject, HashMap domMap) 
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
			// ims.ocrr.vo.ReferralAppointmentDetailsOrderInvestigationVo ID_OrderInvestigation field is unknown
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

		domainObject.setSpecimen(ims.ocrr.vo.domain.OrderSpecimenLiteVoAssembler.extractOrderSpecimenList(domainFactory, valueObject.getSpecimen(), domainObject.getSpecimen(), domMap));		
		ims.framework.utils.DateTime dateTime2 = valueObject.getAppointmentDate();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setAppointmentDate(value2);
		domainObject.setInvestigation(ims.ocrr.vo.domain.InvestigationListVoAssembler.extractInvestigation(domainFactory, valueObject.getInvestigation(), domMap));
		domainObject.setOrdInvCurrentStatus(ims.ocrr.vo.domain.OrderedInvestigationStatusVoAssembler.extractOrderedInvestigationStatus(domainFactory, valueObject.getOrdInvCurrentStatus(), domMap));
		ims.framework.utils.DateTime dateTime6 = valueObject.getDisplayDateTime();
		java.util.Date value6 = null;
		if ( dateTime6 != null ) 
		{
			value6 = dateTime6.getJavaDate();
		}
		domainObject.setDisplayDateTime(value6);
		ims.ocrr.orderingresults.domain.objects.OcsOrderSession value7 = null;
		if ( null != valueObject.getOrderDetails() ) 
		{
			if (valueObject.getOrderDetails().getBoId() == null)
			{
				if (domMap.get(valueObject.getOrderDetails()) != null)
				{
					value7 = (ims.ocrr.orderingresults.domain.objects.OcsOrderSession)domMap.get(valueObject.getOrderDetails());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value7 = domainObject.getOrderDetails();	
			}
			else
			{
				value7 = (ims.ocrr.orderingresults.domain.objects.OcsOrderSession)domainFactory.getDomainObject(ims.ocrr.orderingresults.domain.objects.OcsOrderSession.class, valueObject.getOrderDetails().getBoId());
			}
		}
		domainObject.setOrderDetails(value7);
		ims.framework.utils.DateTime dateTime8 = valueObject.getRepDateTime();
		java.util.Date value8 = null;
		if ( dateTime8 != null ) 
		{
			value8 = dateTime8.getJavaDate();
		}
		domainObject.setRepDateTime(value8);
		domainObject.setRepTimeSupplied(valueObject.getRepTimeSupplied());
		domainObject.setDisplayTimeSupplied(valueObject.getDisplayTimeSupplied());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getDisplayFlag() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getDisplayFlag().getID());
		}
		domainObject.setDisplayFlag(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getResultStatus() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getResultStatus().getID());
		}
		domainObject.setResultStatus(value12);
		domainObject.setOrdInvStatusHistory(ims.ocrr.vo.domain.OrderedInvestigationStatusVoAssembler.extractOrderedInvestigationStatusList(domainFactory, valueObject.getOrdInvStatusHistory(), domainObject.getOrdInvStatusHistory(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getFillerOrdNum() != null && valueObject.getFillerOrdNum().equals(""))
		{
			valueObject.setFillerOrdNum(null);
		}
		domainObject.setFillerOrdNum(valueObject.getFillerOrdNum());
		ims.core.resource.place.domain.objects.Location value15 = null;
		if ( null != valueObject.getPerformedLocation() ) 
		{
			if (valueObject.getPerformedLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getPerformedLocation()) != null)
				{
					value15 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getPerformedLocation());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value15 = domainObject.getPerformedLocation();	
			}
			else
			{
				value15 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getPerformedLocation().getBoId());
			}
		}
		domainObject.setPerformedLocation(value15);
		ims.framework.utils.DateTime dateTime16 = valueObject.getInvestigationDateTime();
		java.util.Date value16 = null;
		if ( dateTime16 != null ) 
		{
			value16 = dateTime16.getJavaDate();
		}
		domainObject.setInvestigationDateTime(value16);
		domainObject.setResultDetails(ims.ocrr.vo.domain.ResultDetailsForReferralAppointmentDetailsOrderInvestigationVoAssembler.extractResultDetails(domainFactory, valueObject.getResultDetails(), domMap));
		ims.framework.utils.DateTime dateTime18 = valueObject.getResultSortDate();
		java.util.Date value18 = null;
		if ( dateTime18 != null ) 
		{
			value18 = dateTime18.getJavaDate();
		}
		domainObject.setResultSortDate(value18);

		return domainObject;
	}

}
