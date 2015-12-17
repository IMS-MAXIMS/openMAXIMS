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
 * @author Marius Mihalec
 */
public class OrderInvestigationWebServiceVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.OrderInvestigationWebServiceVo copy(ims.ocrr.vo.OrderInvestigationWebServiceVo valueObjectDest, ims.ocrr.vo.OrderInvestigationWebServiceVo valueObjectSrc) 
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
		// ResponsibleClinician
		valueObjectDest.setResponsibleClinician(valueObjectSrc.getResponsibleClinician());
		// ResponsibleGp
		valueObjectDest.setResponsibleGp(valueObjectSrc.getResponsibleGp());
		// PatientLocation
		valueObjectDest.setPatientLocation(valueObjectSrc.getPatientLocation());
		// PatientClinic
		valueObjectDest.setPatientClinic(valueObjectSrc.getPatientClinic());
		// OrderPriority
		valueObjectDest.setOrderPriority(valueObjectSrc.getOrderPriority());
		// RepDateTime
		valueObjectDest.setRepDateTime(valueObjectSrc.getRepDateTime());
		// RepTimeSupplied
		valueObjectDest.setRepTimeSupplied(valueObjectSrc.getRepTimeSupplied());
		// DisplayDateTime
		valueObjectDest.setDisplayDateTime(valueObjectSrc.getDisplayDateTime());
		// DisplayTimeSupplied
		valueObjectDest.setDisplayTimeSupplied(valueObjectSrc.getDisplayTimeSupplied());
		// DisplayFlag
		valueObjectDest.setDisplayFlag(valueObjectSrc.getDisplayFlag());
		// wasOrdered
		valueObjectDest.setWasOrdered(valueObjectSrc.getWasOrdered());
		// ResultDemographics
		valueObjectDest.setResultDemographics(valueObjectSrc.getResultDemographics());
		// ResultStatus
		valueObjectDest.setResultStatus(valueObjectSrc.getResultStatus());
		// OrdInvCurrentStatus
		valueObjectDest.setOrdInvCurrentStatus(valueObjectSrc.getOrdInvCurrentStatus());
		// OrdInvStatusHistory
		valueObjectDest.setOrdInvStatusHistory(valueObjectSrc.getOrdInvStatusHistory());
		// FillerOrdNum
		valueObjectDest.setFillerOrdNum(valueObjectSrc.getFillerOrdNum());
		// RadAttendanceId
		valueObjectDest.setRadAttendanceId(valueObjectSrc.getRadAttendanceId());
		// AppointmentDate
		valueObjectDest.setAppointmentDate(valueObjectSrc.getAppointmentDate());
		// ReasonForStudy
		valueObjectDest.setReasonForStudy(valueObjectSrc.getReasonForStudy());
		// ordInvSeq
		valueObjectDest.setOrdInvSeq(valueObjectSrc.getOrdInvSeq());
		// ExamReqOnAfterDate
		valueObjectDest.setExamReqOnAfterDate(valueObjectSrc.getExamReqOnAfterDate());
		// RequestedLocation
		valueObjectDest.setRequestedLocation(valueObjectSrc.getRequestedLocation());
		// PerformedLocation
		valueObjectDest.setPerformedLocation(valueObjectSrc.getPerformedLocation());
		// wasProcessed
		valueObjectDest.setWasProcessed(valueObjectSrc.getWasProcessed());
		// ResultHistory
		valueObjectDest.setResultHistory(valueObjectSrc.getResultHistory());
		// EnterTheatreDate
		valueObjectDest.setEnterTheatreDate(valueObjectSrc.getEnterTheatreDate());
		// StartProcedureDate
		valueObjectDest.setStartProcedureDate(valueObjectSrc.getStartProcedureDate());
		// EndProcedureDate
		valueObjectDest.setEndProcedureDate(valueObjectSrc.getEndProcedureDate());
		// LeaveRecoveryDate
		valueObjectDest.setLeaveRecoveryDate(valueObjectSrc.getLeaveRecoveryDate());
		// ReportUrl
		valueObjectDest.setReportUrl(valueObjectSrc.getReportUrl());
		// ReportDocumentUrl
		valueObjectDest.setReportDocumentUrl(valueObjectSrc.getReportDocumentUrl());
		// InvestigationDateTime
		valueObjectDest.setInvestigationDateTime(valueObjectSrc.getInvestigationDateTime());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createOrderInvestigationWebServiceVoCollectionFromOrderInvestigation(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OrderInvestigation objects.
	 */
	public static ims.ocrr.vo.OrderInvestigationWebServiceVoCollection createOrderInvestigationWebServiceVoCollectionFromOrderInvestigation(java.util.Set domainObjectSet)	
	{
		return createOrderInvestigationWebServiceVoCollectionFromOrderInvestigation(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OrderInvestigation objects.
	 */
	public static ims.ocrr.vo.OrderInvestigationWebServiceVoCollection createOrderInvestigationWebServiceVoCollectionFromOrderInvestigation(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.OrderInvestigationWebServiceVoCollection voList = new ims.ocrr.vo.OrderInvestigationWebServiceVoCollection();
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
			ims.ocrr.vo.OrderInvestigationWebServiceVo vo = create(map, domainObject);
			
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
	public static ims.ocrr.vo.OrderInvestigationWebServiceVoCollection createOrderInvestigationWebServiceVoCollectionFromOrderInvestigation(java.util.List domainObjectList) 
	{
		return createOrderInvestigationWebServiceVoCollectionFromOrderInvestigation(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.OrderInvestigation objects.
	 */
	public static ims.ocrr.vo.OrderInvestigationWebServiceVoCollection createOrderInvestigationWebServiceVoCollectionFromOrderInvestigation(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.OrderInvestigationWebServiceVoCollection voList = new ims.ocrr.vo.OrderInvestigationWebServiceVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation) domainObjectList.get(i);
			ims.ocrr.vo.OrderInvestigationWebServiceVo vo = create(map, domainObject);

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
	 public static java.util.Set extractOrderInvestigationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderInvestigationWebServiceVoCollection voCollection) 
	 {
	 	return extractOrderInvestigationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOrderInvestigationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderInvestigationWebServiceVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.OrderInvestigationWebServiceVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject = OrderInvestigationWebServiceVoAssembler.extractOrderInvestigation(domainFactory, vo, domMap);

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
	 public static java.util.List extractOrderInvestigationList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderInvestigationWebServiceVoCollection voCollection) 
	 {
	 	return extractOrderInvestigationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOrderInvestigationList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderInvestigationWebServiceVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.OrderInvestigationWebServiceVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject = OrderInvestigationWebServiceVoAssembler.extractOrderInvestigation(domainFactory, vo, domMap);

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
	 public static ims.ocrr.vo.OrderInvestigationWebServiceVo create(ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject) 
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
	  public static ims.ocrr.vo.OrderInvestigationWebServiceVo create(DomainObjectMap map, ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.OrderInvestigationWebServiceVo valueObject = (ims.ocrr.vo.OrderInvestigationWebServiceVo) map.getValueObject(domainObject, ims.ocrr.vo.OrderInvestigationWebServiceVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.OrderInvestigationWebServiceVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.ocrr.vo.OrderInvestigationWebServiceVo insert(ims.ocrr.vo.OrderInvestigationWebServiceVo valueObject, ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject) 
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
	 public static ims.ocrr.vo.OrderInvestigationWebServiceVo insert(DomainObjectMap map, ims.ocrr.vo.OrderInvestigationWebServiceVo valueObject, ims.ocrr.orderingresults.domain.objects.OrderInvestigation domainObject) 
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
		valueObject.setInvestigation(ims.ocrr.vo.domain.InvestigationUnderSpecimenVoAssembler.create(map, domainObject.getInvestigation()) );
		// Specimen
		ims.ocrr.orderingresults.vo.OrderSpecimenRefVoCollection Specimen = new ims.ocrr.orderingresults.vo.OrderSpecimenRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getSpecimen().iterator(); iterator.hasNext(); ) 
		{
			ims.ocrr.orderingresults.domain.objects.OrderSpecimen tmp = (ims.ocrr.orderingresults.domain.objects.OrderSpecimen)iterator.next();
			if (tmp != null)
				Specimen.add(new ims.ocrr.orderingresults.vo.OrderSpecimenRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setSpecimen(Specimen);
		// ResponsibleClinician
		if (domainObject.getResponsibleClinician() != null)
		{
			if(domainObject.getResponsibleClinician() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getResponsibleClinician();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setResponsibleClinician(new ims.core.resource.people.vo.HcpRefVo(id, -1));				
			}
			else
			{
				valueObject.setResponsibleClinician(new ims.core.resource.people.vo.HcpRefVo(domainObject.getResponsibleClinician().getId(), domainObject.getResponsibleClinician().getVersion()));
			}
		}
		// ResponsibleGp
		if (domainObject.getResponsibleGp() != null)
		{
			if(domainObject.getResponsibleGp() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getResponsibleGp();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setResponsibleGp(new ims.core.resource.people.vo.GpRefVo(id, -1));				
			}
			else
			{
				valueObject.setResponsibleGp(new ims.core.resource.people.vo.GpRefVo(domainObject.getResponsibleGp().getId(), domainObject.getResponsibleGp().getVersion()));
			}
		}
		// PatientLocation
		if (domainObject.getPatientLocation() != null)
		{
			if(domainObject.getPatientLocation() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPatientLocation();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPatientLocation(new ims.core.resource.place.vo.LocationRefVo(id, -1));				
			}
			else
			{
				valueObject.setPatientLocation(new ims.core.resource.place.vo.LocationRefVo(domainObject.getPatientLocation().getId(), domainObject.getPatientLocation().getVersion()));
			}
		}
		// PatientClinic
		if (domainObject.getPatientClinic() != null)
		{
			if(domainObject.getPatientClinic() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPatientClinic();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPatientClinic(new ims.core.resource.place.vo.ClinicRefVo(id, -1));				
			}
			else
			{
				valueObject.setPatientClinic(new ims.core.resource.place.vo.ClinicRefVo(domainObject.getPatientClinic().getId(), domainObject.getPatientClinic().getVersion()));
			}
		}
		// OrderPriority
		ims.domain.lookups.LookupInstance instance7 = domainObject.getOrderPriority();
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

			ims.ocrr.vo.lookups.OrderPriority voLookup7 = new ims.ocrr.vo.lookups.OrderPriority(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.ocrr.vo.lookups.OrderPriority parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.ocrr.vo.lookups.OrderPriority(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setOrderPriority(voLookup7);
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
		// DisplayTimeSupplied
		valueObject.setDisplayTimeSupplied( domainObject.isDisplayTimeSupplied() );
		// DisplayFlag
		ims.domain.lookups.LookupInstance instance12 = domainObject.getDisplayFlag();
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

			ims.ocrr.vo.lookups.OcsDisplayFlag voLookup12 = new ims.ocrr.vo.lookups.OcsDisplayFlag(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.ocrr.vo.lookups.OcsDisplayFlag parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.ocrr.vo.lookups.OcsDisplayFlag(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setDisplayFlag(voLookup12);
		}
				// wasOrdered
		valueObject.setWasOrdered( domainObject.isWasOrdered() );
		// ResultDemographics
		if (domainObject.getResultDemographics() != null)
		{
			if(domainObject.getResultDemographics() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getResultDemographics();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setResultDemographics(new ims.core.patient.vo.MinDemographicsRefVo(id, -1));				
			}
			else
			{
				valueObject.setResultDemographics(new ims.core.patient.vo.MinDemographicsRefVo(domainObject.getResultDemographics().getId(), domainObject.getResultDemographics().getVersion()));
			}
		}
		// ResultStatus
		ims.domain.lookups.LookupInstance instance15 = domainObject.getResultStatus();
		if ( null != instance15 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance15.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance15.getImage().getImageId(), instance15.getImage().getImagePath());
			}
			color = instance15.getColor();
			if (color != null) 
				color.getValue();

			ims.ocrr.vo.lookups.ResultStatus voLookup15 = new ims.ocrr.vo.lookups.ResultStatus(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.ocrr.vo.lookups.ResultStatus parentVoLookup15 = voLookup15;
			ims.domain.lookups.LookupInstance parent15 = instance15.getParent();
			while (parent15 != null)
			{
				if (parent15.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent15.getImage().getImageId(), parent15.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent15.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup15.setParent(new ims.ocrr.vo.lookups.ResultStatus(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setResultStatus(voLookup15);
		}
				// OrdInvCurrentStatus
		valueObject.setOrdInvCurrentStatus(ims.ocrr.vo.domain.OrderedInvestigationStatusVoAssembler.create(map, domainObject.getOrdInvCurrentStatus()) );
		// OrdInvStatusHistory
		ims.ocrr.orderingresults.vo.OrderedInvestigationStatusRefVoCollection OrdInvStatusHistory = new ims.ocrr.orderingresults.vo.OrderedInvestigationStatusRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getOrdInvStatusHistory().iterator(); iterator.hasNext(); ) 
		{
			ims.ocrr.orderingresults.domain.objects.OrderedInvestigationStatus tmp = (ims.ocrr.orderingresults.domain.objects.OrderedInvestigationStatus)iterator.next();
			if (tmp != null)
				OrdInvStatusHistory.add(new ims.ocrr.orderingresults.vo.OrderedInvestigationStatusRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setOrdInvStatusHistory(OrdInvStatusHistory);
		// FillerOrdNum
		valueObject.setFillerOrdNum(domainObject.getFillerOrdNum());
		// RadAttendanceId
		valueObject.setRadAttendanceId(domainObject.getRadAttendanceId());
		// AppointmentDate
		java.util.Date AppointmentDate = domainObject.getAppointmentDate();
		if ( null != AppointmentDate ) 
		{
			valueObject.setAppointmentDate(new ims.framework.utils.DateTime(AppointmentDate) );
		}
		// ReasonForStudy
		valueObject.setReasonForStudy(domainObject.getReasonForStudy());
		// ordInvSeq
		valueObject.setOrdInvSeq(domainObject.getOrdInvSeq());
		// ExamReqOnAfterDate
		java.util.Date ExamReqOnAfterDate = domainObject.getExamReqOnAfterDate();
		if ( null != ExamReqOnAfterDate ) 
		{
			valueObject.setExamReqOnAfterDate(new ims.framework.utils.Date(ExamReqOnAfterDate) );
		}
		// RequestedLocation
		if (domainObject.getRequestedLocation() != null)
		{
			if(domainObject.getRequestedLocation() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getRequestedLocation();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setRequestedLocation(new ims.core.resource.place.vo.LocationRefVo(id, -1));				
			}
			else
			{
				valueObject.setRequestedLocation(new ims.core.resource.place.vo.LocationRefVo(domainObject.getRequestedLocation().getId(), domainObject.getRequestedLocation().getVersion()));
			}
		}
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
		// wasProcessed
		valueObject.setWasProcessed( domainObject.isWasProcessed() );
		// ResultHistory
		ims.ocrr.orderingresults.vo.OrderResultHistoryRefVoCollection ResultHistory = new ims.ocrr.orderingresults.vo.OrderResultHistoryRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getResultHistory().iterator(); iterator.hasNext(); ) 
		{
			ims.ocrr.orderingresults.domain.objects.OrderResultHistory tmp = (ims.ocrr.orderingresults.domain.objects.OrderResultHistory)iterator.next();
			if (tmp != null)
				ResultHistory.add(new ims.ocrr.orderingresults.vo.OrderResultHistoryRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setResultHistory(ResultHistory);
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
		// ReportUrl
		valueObject.setReportUrl(domainObject.getReportUrl());
		// ReportDocumentUrl
		valueObject.setReportDocumentUrl(domainObject.getReportDocumentUrl());
		// InvestigationDateTime
		java.util.Date InvestigationDateTime = domainObject.getInvestigationDateTime();
		if ( null != InvestigationDateTime ) 
		{
			valueObject.setInvestigationDateTime(new ims.framework.utils.DateTime(InvestigationDateTime) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.orderingresults.domain.objects.OrderInvestigation extractOrderInvestigation(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderInvestigationWebServiceVo valueObject) 
	{
		return 	extractOrderInvestigation(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.orderingresults.domain.objects.OrderInvestigation extractOrderInvestigation(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderInvestigationWebServiceVo valueObject, HashMap domMap) 
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
			// ims.ocrr.vo.OrderInvestigationWebServiceVo ID_OrderInvestigation field is unknown
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

		domainObject.setInvestigation(ims.ocrr.vo.domain.InvestigationUnderSpecimenVoAssembler.extractInvestigation(domainFactory, valueObject.getInvestigation(), domMap));

		ims.ocrr.orderingresults.vo.OrderSpecimenRefVoCollection refCollection2 = valueObject.getSpecimen();
		int size2 = (null == refCollection2) ? 0 : refCollection2.size();		
		java.util.List domainSpecimen2 = domainObject.getSpecimen();
		if (domainSpecimen2 == null)
		{
			domainSpecimen2 = new java.util.ArrayList();
		}
		for(int i=0; i < size2; i++) 
		{
			ims.ocrr.orderingresults.vo.OrderSpecimenRefVo vo = refCollection2.get(i);			
			ims.ocrr.orderingresults.domain.objects.OrderSpecimen dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.ocrr.orderingresults.domain.objects.OrderSpecimen)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.ocrr.orderingresults.domain.objects.OrderSpecimen)domainFactory.getDomainObject( ims.ocrr.orderingresults.domain.objects.OrderSpecimen.class, vo.getBoId());
				}
			}

			int domIdx = domainSpecimen2.indexOf(dom);
			if (domIdx == -1)
			{
				domainSpecimen2.add(i, dom);
			}
			else if (i != domIdx && i < domainSpecimen2.size())
			{
				Object tmp = domainSpecimen2.get(i);
				domainSpecimen2.set(i, domainSpecimen2.get(domIdx));
				domainSpecimen2.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i2 = domainSpecimen2.size();
		while (i2 > size2)
		{
			domainSpecimen2.remove(i2-1);
			i2 = domainSpecimen2.size();
		}
		
		domainObject.setSpecimen(domainSpecimen2);		
		ims.core.resource.people.domain.objects.Hcp value3 = null;
		if ( null != valueObject.getResponsibleClinician() ) 
		{
			if (valueObject.getResponsibleClinician().getBoId() == null)
			{
				if (domMap.get(valueObject.getResponsibleClinician()) != null)
				{
					value3 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getResponsibleClinician());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getResponsibleClinician();	
			}
			else
			{
				value3 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getResponsibleClinician().getBoId());
			}
		}
		domainObject.setResponsibleClinician(value3);
		ims.core.resource.people.domain.objects.Gp value4 = null;
		if ( null != valueObject.getResponsibleGp() ) 
		{
			if (valueObject.getResponsibleGp().getBoId() == null)
			{
				if (domMap.get(valueObject.getResponsibleGp()) != null)
				{
					value4 = (ims.core.resource.people.domain.objects.Gp)domMap.get(valueObject.getResponsibleGp());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getResponsibleGp();	
			}
			else
			{
				value4 = (ims.core.resource.people.domain.objects.Gp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Gp.class, valueObject.getResponsibleGp().getBoId());
			}
		}
		domainObject.setResponsibleGp(value4);
		ims.core.resource.place.domain.objects.Location value5 = null;
		if ( null != valueObject.getPatientLocation() ) 
		{
			if (valueObject.getPatientLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatientLocation()) != null)
				{
					value5 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getPatientLocation());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value5 = domainObject.getPatientLocation();	
			}
			else
			{
				value5 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getPatientLocation().getBoId());
			}
		}
		domainObject.setPatientLocation(value5);
		ims.core.resource.place.domain.objects.Clinic value6 = null;
		if ( null != valueObject.getPatientClinic() ) 
		{
			if (valueObject.getPatientClinic().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatientClinic()) != null)
				{
					value6 = (ims.core.resource.place.domain.objects.Clinic)domMap.get(valueObject.getPatientClinic());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value6 = domainObject.getPatientClinic();	
			}
			else
			{
				value6 = (ims.core.resource.place.domain.objects.Clinic)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Clinic.class, valueObject.getPatientClinic().getBoId());
			}
		}
		domainObject.setPatientClinic(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getOrderPriority() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getOrderPriority().getID());
		}
		domainObject.setOrderPriority(value7);
		ims.framework.utils.DateTime dateTime8 = valueObject.getRepDateTime();
		java.util.Date value8 = null;
		if ( dateTime8 != null ) 
		{
			value8 = dateTime8.getJavaDate();
		}
		domainObject.setRepDateTime(value8);
		domainObject.setRepTimeSupplied(valueObject.getRepTimeSupplied());
		ims.framework.utils.DateTime dateTime10 = valueObject.getDisplayDateTime();
		java.util.Date value10 = null;
		if ( dateTime10 != null ) 
		{
			value10 = dateTime10.getJavaDate();
		}
		domainObject.setDisplayDateTime(value10);
		domainObject.setDisplayTimeSupplied(valueObject.getDisplayTimeSupplied());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getDisplayFlag() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getDisplayFlag().getID());
		}
		domainObject.setDisplayFlag(value12);
		domainObject.setWasOrdered(valueObject.getWasOrdered());
		ims.core.patient.domain.objects.MinDemographics value14 = null;
		if ( null != valueObject.getResultDemographics() ) 
		{
			if (valueObject.getResultDemographics().getBoId() == null)
			{
				if (domMap.get(valueObject.getResultDemographics()) != null)
				{
					value14 = (ims.core.patient.domain.objects.MinDemographics)domMap.get(valueObject.getResultDemographics());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value14 = domainObject.getResultDemographics();	
			}
			else
			{
				value14 = (ims.core.patient.domain.objects.MinDemographics)domainFactory.getDomainObject(ims.core.patient.domain.objects.MinDemographics.class, valueObject.getResultDemographics().getBoId());
			}
		}
		domainObject.setResultDemographics(value14);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getResultStatus() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getResultStatus().getID());
		}
		domainObject.setResultStatus(value15);
		domainObject.setOrdInvCurrentStatus(ims.ocrr.vo.domain.OrderedInvestigationStatusVoAssembler.extractOrderedInvestigationStatus(domainFactory, valueObject.getOrdInvCurrentStatus(), domMap));

		ims.ocrr.orderingresults.vo.OrderedInvestigationStatusRefVoCollection refCollection17 = valueObject.getOrdInvStatusHistory();
		int size17 = (null == refCollection17) ? 0 : refCollection17.size();		
		java.util.List domainOrdInvStatusHistory17 = domainObject.getOrdInvStatusHistory();
		if (domainOrdInvStatusHistory17 == null)
		{
			domainOrdInvStatusHistory17 = new java.util.ArrayList();
		}
		for(int i=0; i < size17; i++) 
		{
			ims.ocrr.orderingresults.vo.OrderedInvestigationStatusRefVo vo = refCollection17.get(i);			
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

			int domIdx = domainOrdInvStatusHistory17.indexOf(dom);
			if (domIdx == -1)
			{
				domainOrdInvStatusHistory17.add(i, dom);
			}
			else if (i != domIdx && i < domainOrdInvStatusHistory17.size())
			{
				Object tmp = domainOrdInvStatusHistory17.get(i);
				domainOrdInvStatusHistory17.set(i, domainOrdInvStatusHistory17.get(domIdx));
				domainOrdInvStatusHistory17.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i17 = domainOrdInvStatusHistory17.size();
		while (i17 > size17)
		{
			domainOrdInvStatusHistory17.remove(i17-1);
			i17 = domainOrdInvStatusHistory17.size();
		}
		
		domainObject.setOrdInvStatusHistory(domainOrdInvStatusHistory17);		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getFillerOrdNum() != null && valueObject.getFillerOrdNum().equals(""))
		{
			valueObject.setFillerOrdNum(null);
		}
		domainObject.setFillerOrdNum(valueObject.getFillerOrdNum());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getRadAttendanceId() != null && valueObject.getRadAttendanceId().equals(""))
		{
			valueObject.setRadAttendanceId(null);
		}
		domainObject.setRadAttendanceId(valueObject.getRadAttendanceId());
		ims.framework.utils.DateTime dateTime20 = valueObject.getAppointmentDate();
		java.util.Date value20 = null;
		if ( dateTime20 != null ) 
		{
			value20 = dateTime20.getJavaDate();
		}
		domainObject.setAppointmentDate(value20);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReasonForStudy() != null && valueObject.getReasonForStudy().equals(""))
		{
			valueObject.setReasonForStudy(null);
		}
		domainObject.setReasonForStudy(valueObject.getReasonForStudy());
		domainObject.setOrdInvSeq(valueObject.getOrdInvSeq());
		java.util.Date value23 = null;
		ims.framework.utils.Date date23 = valueObject.getExamReqOnAfterDate();		
		if ( date23 != null ) 
		{
			value23 = date23.getDate();
		}
		domainObject.setExamReqOnAfterDate(value23);
		ims.core.resource.place.domain.objects.Location value24 = null;
		if ( null != valueObject.getRequestedLocation() ) 
		{
			if (valueObject.getRequestedLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getRequestedLocation()) != null)
				{
					value24 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getRequestedLocation());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value24 = domainObject.getRequestedLocation();	
			}
			else
			{
				value24 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getRequestedLocation().getBoId());
			}
		}
		domainObject.setRequestedLocation(value24);
		ims.core.resource.place.domain.objects.Location value25 = null;
		if ( null != valueObject.getPerformedLocation() ) 
		{
			if (valueObject.getPerformedLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getPerformedLocation()) != null)
				{
					value25 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getPerformedLocation());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value25 = domainObject.getPerformedLocation();	
			}
			else
			{
				value25 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getPerformedLocation().getBoId());
			}
		}
		domainObject.setPerformedLocation(value25);
		domainObject.setWasProcessed(valueObject.getWasProcessed());

		ims.ocrr.orderingresults.vo.OrderResultHistoryRefVoCollection refCollection27 = valueObject.getResultHistory();
		int size27 = (null == refCollection27) ? 0 : refCollection27.size();		
		java.util.Set domainResultHistory27 = domainObject.getResultHistory();
		if (domainResultHistory27 == null)
		{
			domainResultHistory27 = new java.util.HashSet();
		}
		java.util.Set newSet27  = new java.util.HashSet();
		for(int i=0; i<size27; i++) 
		{
			ims.ocrr.orderingresults.vo.OrderResultHistoryRefVo vo = refCollection27.get(i);					
			ims.ocrr.orderingresults.domain.objects.OrderResultHistory dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.ocrr.orderingresults.domain.objects.OrderResultHistory)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.ocrr.orderingresults.domain.objects.OrderResultHistory)domainFactory.getDomainObject( ims.ocrr.orderingresults.domain.objects.OrderResultHistory.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainResultHistory27.contains(dom))
			{
				domainResultHistory27.add(dom);
			}
			newSet27.add(dom);			
		}
		java.util.Set removedSet27 = new java.util.HashSet();
		java.util.Iterator iter27 = domainResultHistory27.iterator();
		//Find out which objects need to be removed
		while (iter27.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter27.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet27.contains(o))
			{
				removedSet27.add(o);
			}
		}
		iter27 = removedSet27.iterator();
		//Remove the unwanted objects
		while (iter27.hasNext())
		{
			domainResultHistory27.remove(iter27.next());
		}		
		
		domainObject.setResultHistory(domainResultHistory27);		
		ims.framework.utils.DateTime dateTime28 = valueObject.getEnterTheatreDate();
		java.util.Date value28 = null;
		if ( dateTime28 != null ) 
		{
			value28 = dateTime28.getJavaDate();
		}
		domainObject.setEnterTheatreDate(value28);
		ims.framework.utils.DateTime dateTime29 = valueObject.getStartProcedureDate();
		java.util.Date value29 = null;
		if ( dateTime29 != null ) 
		{
			value29 = dateTime29.getJavaDate();
		}
		domainObject.setStartProcedureDate(value29);
		ims.framework.utils.DateTime dateTime30 = valueObject.getEndProcedureDate();
		java.util.Date value30 = null;
		if ( dateTime30 != null ) 
		{
			value30 = dateTime30.getJavaDate();
		}
		domainObject.setEndProcedureDate(value30);
		ims.framework.utils.DateTime dateTime31 = valueObject.getLeaveRecoveryDate();
		java.util.Date value31 = null;
		if ( dateTime31 != null ) 
		{
			value31 = dateTime31.getJavaDate();
		}
		domainObject.setLeaveRecoveryDate(value31);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReportUrl() != null && valueObject.getReportUrl().equals(""))
		{
			valueObject.setReportUrl(null);
		}
		domainObject.setReportUrl(valueObject.getReportUrl());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReportDocumentUrl() != null && valueObject.getReportDocumentUrl().equals(""))
		{
			valueObject.setReportDocumentUrl(null);
		}
		domainObject.setReportDocumentUrl(valueObject.getReportDocumentUrl());
		ims.framework.utils.DateTime dateTime34 = valueObject.getInvestigationDateTime();
		java.util.Date value34 = null;
		if ( dateTime34 != null ) 
		{
			value34 = dateTime34.getJavaDate();
		}
		domainObject.setInvestigationDateTime(value34);

		return domainObject;
	}

}
