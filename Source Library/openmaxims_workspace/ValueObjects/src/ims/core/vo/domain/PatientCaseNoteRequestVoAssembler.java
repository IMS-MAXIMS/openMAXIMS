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
public class PatientCaseNoteRequestVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PatientCaseNoteRequestVo copy(ims.core.vo.PatientCaseNoteRequestVo valueObjectDest, ims.core.vo.PatientCaseNoteRequestVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientCaseNoteRequest(valueObjectSrc.getID_PatientCaseNoteRequest());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CancelledBy
		valueObjectDest.setCancelledBy(valueObjectSrc.getCancelledBy());
		// TransferThatCompletedRequest
		valueObjectDest.setTransferThatCompletedRequest(valueObjectSrc.getTransferThatCompletedRequest());
		// Appointment
		valueObjectDest.setAppointment(valueObjectSrc.getAppointment());
		// TCIDetail
		valueObjectDest.setTCIDetail(valueObjectSrc.getTCIDetail());
		// SystemInformation
		valueObjectDest.setSystemInformation(valueObjectSrc.getSystemInformation());
		// CaseNote
		valueObjectDest.setCaseNote(valueObjectSrc.getCaseNote());
		// RequestedForLocation
		valueObjectDest.setRequestedForLocation(valueObjectSrc.getRequestedForLocation());
		// RequestedBy
		valueObjectDest.setRequestedBy(valueObjectSrc.getRequestedBy());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// RequestComment
		valueObjectDest.setRequestComment(valueObjectSrc.getRequestComment());
		// CreationDate
		valueObjectDest.setCreationDate(valueObjectSrc.getCreationDate());
		// RequestStatus
		valueObjectDest.setRequestStatus(valueObjectSrc.getRequestStatus());
		// RequiredByDate
		valueObjectDest.setRequiredByDate(valueObjectSrc.getRequiredByDate());
		// ReasonForRequest
		valueObjectDest.setReasonForRequest(valueObjectSrc.getReasonForRequest());
		// CancelledDate
		valueObjectDest.setCancelledDate(valueObjectSrc.getCancelledDate());
		// CancellationReason
		valueObjectDest.setCancellationReason(valueObjectSrc.getCancellationReason());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientCaseNoteRequestVoCollectionFromPatientCaseNoteRequest(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientCaseNoteRequest objects.
	 */
	public static ims.core.vo.PatientCaseNoteRequestVoCollection createPatientCaseNoteRequestVoCollectionFromPatientCaseNoteRequest(java.util.Set domainObjectSet)	
	{
		return createPatientCaseNoteRequestVoCollectionFromPatientCaseNoteRequest(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientCaseNoteRequest objects.
	 */
	public static ims.core.vo.PatientCaseNoteRequestVoCollection createPatientCaseNoteRequestVoCollectionFromPatientCaseNoteRequest(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatientCaseNoteRequestVoCollection voList = new ims.core.vo.PatientCaseNoteRequestVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.PatientCaseNoteRequest domainObject = (ims.core.clinical.domain.objects.PatientCaseNoteRequest) iterator.next();
			ims.core.vo.PatientCaseNoteRequestVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientCaseNoteRequest objects.
	 */
	public static ims.core.vo.PatientCaseNoteRequestVoCollection createPatientCaseNoteRequestVoCollectionFromPatientCaseNoteRequest(java.util.List domainObjectList) 
	{
		return createPatientCaseNoteRequestVoCollectionFromPatientCaseNoteRequest(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientCaseNoteRequest objects.
	 */
	public static ims.core.vo.PatientCaseNoteRequestVoCollection createPatientCaseNoteRequestVoCollectionFromPatientCaseNoteRequest(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatientCaseNoteRequestVoCollection voList = new ims.core.vo.PatientCaseNoteRequestVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.PatientCaseNoteRequest domainObject = (ims.core.clinical.domain.objects.PatientCaseNoteRequest) domainObjectList.get(i);
			ims.core.vo.PatientCaseNoteRequestVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.PatientCaseNoteRequest set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientCaseNoteRequestSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteRequestVoCollection voCollection) 
	 {
	 	return extractPatientCaseNoteRequestSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientCaseNoteRequestSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteRequestVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientCaseNoteRequestVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientCaseNoteRequest domainObject = PatientCaseNoteRequestVoAssembler.extractPatientCaseNoteRequest(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.PatientCaseNoteRequest list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientCaseNoteRequestList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteRequestVoCollection voCollection) 
	 {
	 	return extractPatientCaseNoteRequestList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientCaseNoteRequestList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteRequestVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientCaseNoteRequestVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientCaseNoteRequest domainObject = PatientCaseNoteRequestVoAssembler.extractPatientCaseNoteRequest(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.PatientCaseNoteRequest object.
	 * @param domainObject ims.core.clinical.domain.objects.PatientCaseNoteRequest
	 */
	 public static ims.core.vo.PatientCaseNoteRequestVo create(ims.core.clinical.domain.objects.PatientCaseNoteRequest domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.PatientCaseNoteRequest object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PatientCaseNoteRequestVo create(DomainObjectMap map, ims.core.clinical.domain.objects.PatientCaseNoteRequest domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PatientCaseNoteRequestVo valueObject = (ims.core.vo.PatientCaseNoteRequestVo) map.getValueObject(domainObject, ims.core.vo.PatientCaseNoteRequestVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PatientCaseNoteRequestVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.PatientCaseNoteRequest
	 */
	 public static ims.core.vo.PatientCaseNoteRequestVo insert(ims.core.vo.PatientCaseNoteRequestVo valueObject, ims.core.clinical.domain.objects.PatientCaseNoteRequest domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.PatientCaseNoteRequest
	 */
	 public static ims.core.vo.PatientCaseNoteRequestVo insert(DomainObjectMap map, ims.core.vo.PatientCaseNoteRequestVo valueObject, ims.core.clinical.domain.objects.PatientCaseNoteRequest domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientCaseNoteRequest(domainObject.getId());
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
			
		// CancelledBy
		if (domainObject.getCancelledBy() != null)
		{
			if(domainObject.getCancelledBy() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCancelledBy();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCancelledBy(new ims.core.resource.people.vo.MemberOfStaffRefVo(id, -1));				
			}
			else
			{
				valueObject.setCancelledBy(new ims.core.resource.people.vo.MemberOfStaffRefVo(domainObject.getCancelledBy().getId(), domainObject.getCancelledBy().getVersion()));
			}
		}
		// TransferThatCompletedRequest
		if (domainObject.getTransferThatCompletedRequest() != null)
		{
			if(domainObject.getTransferThatCompletedRequest() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getTransferThatCompletedRequest();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setTransferThatCompletedRequest(new ims.core.clinical.vo.PatientCaseNoteTransferRefVo(id, -1));				
			}
			else
			{
				valueObject.setTransferThatCompletedRequest(new ims.core.clinical.vo.PatientCaseNoteTransferRefVo(domainObject.getTransferThatCompletedRequest().getId(), domainObject.getTransferThatCompletedRequest().getVersion()));
			}
		}
		// Appointment
		if (domainObject.getAppointment() != null)
		{
			if(domainObject.getAppointment() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAppointment();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAppointment(new ims.scheduling.vo.Booking_AppointmentRefVo(id, -1));				
			}
			else
			{
				valueObject.setAppointment(new ims.scheduling.vo.Booking_AppointmentRefVo(domainObject.getAppointment().getId(), domainObject.getAppointment().getVersion()));
			}
		}
		// TCIDetail
		if (domainObject.getTCIDetail() != null)
		{
			if(domainObject.getTCIDetail() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getTCIDetail();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setTCIDetail(new ims.RefMan.vo.TCIForPatientElectiveListRefVo(id, -1));				
			}
			else
			{
				valueObject.setTCIDetail(new ims.RefMan.vo.TCIForPatientElectiveListRefVo(domainObject.getTCIDetail().getId(), domainObject.getTCIDetail().getVersion()));
			}
		}
		// SystemInformation
		// set system information
		valueObject.setSystemInformation(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// CaseNote
		valueObject.setCaseNote(ims.core.vo.domain.PatientCaseNoteTypeVoAssembler.create(map, domainObject.getCaseNote()) );
		// RequestedForLocation
		valueObject.setRequestedForLocation(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getRequestedForLocation()) );
		// RequestedBy
		valueObject.setRequestedBy(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getRequestedBy()) );
		// Patient
		valueObject.setPatient(ims.core.vo.domain.PatientLite_IdentifiersVoAssembler.create(map, domainObject.getPatient()) );
		// RequestComment
		valueObject.setRequestComment(ims.core.vo.domain.PatientCaseNoteCommentSaveVoAssembler.create(map, domainObject.getRequestComment()) );
		// CreationDate
		java.util.Date CreationDate = domainObject.getCreationDate();
		if ( null != CreationDate ) 
		{
			valueObject.setCreationDate(new ims.framework.utils.DateTime(CreationDate) );
		}
		// RequestStatus
		ims.domain.lookups.LookupInstance instance12 = domainObject.getRequestStatus();
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

			ims.core.vo.lookups.CaseNoteRequestStatus voLookup12 = new ims.core.vo.lookups.CaseNoteRequestStatus(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.core.vo.lookups.CaseNoteRequestStatus parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.core.vo.lookups.CaseNoteRequestStatus(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setRequestStatus(voLookup12);
		}
				// RequiredByDate
		java.util.Date RequiredByDate = domainObject.getRequiredByDate();
		if ( null != RequiredByDate ) 
		{
			valueObject.setRequiredByDate(new ims.framework.utils.DateTime(RequiredByDate) );
		}
		// ReasonForRequest
		ims.domain.lookups.LookupInstance instance14 = domainObject.getReasonForRequest();
		if ( null != instance14 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance14.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance14.getImage().getImageId(), instance14.getImage().getImagePath());
			}
			color = instance14.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.CaseNoteReasonForRequest voLookup14 = new ims.core.vo.lookups.CaseNoteReasonForRequest(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.core.vo.lookups.CaseNoteReasonForRequest parentVoLookup14 = voLookup14;
			ims.domain.lookups.LookupInstance parent14 = instance14.getParent();
			while (parent14 != null)
			{
				if (parent14.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent14.getImage().getImageId(), parent14.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent14.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup14.setParent(new ims.core.vo.lookups.CaseNoteReasonForRequest(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setReasonForRequest(voLookup14);
		}
				// CancelledDate
		java.util.Date CancelledDate = domainObject.getCancelledDate();
		if ( null != CancelledDate ) 
		{
			valueObject.setCancelledDate(new ims.framework.utils.DateTime(CancelledDate) );
		}
		// CancellationReason
		ims.domain.lookups.LookupInstance instance16 = domainObject.getCancellationReason();
		if ( null != instance16 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance16.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance16.getImage().getImageId(), instance16.getImage().getImagePath());
			}
			color = instance16.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.CaseNoteRequestCancellationReason voLookup16 = new ims.core.vo.lookups.CaseNoteRequestCancellationReason(instance16.getId(),instance16.getText(), instance16.isActive(), null, img, color);
			ims.core.vo.lookups.CaseNoteRequestCancellationReason parentVoLookup16 = voLookup16;
			ims.domain.lookups.LookupInstance parent16 = instance16.getParent();
			while (parent16 != null)
			{
				if (parent16.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent16.getImage().getImageId(), parent16.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent16.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup16.setParent(new ims.core.vo.lookups.CaseNoteRequestCancellationReason(parent16.getId(),parent16.getText(), parent16.isActive(), null, img, color));
				parentVoLookup16 = parentVoLookup16.getParent();
								parent16 = parent16.getParent();
			}			
			valueObject.setCancellationReason(voLookup16);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.PatientCaseNoteRequest extractPatientCaseNoteRequest(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteRequestVo valueObject) 
	{
		return 	extractPatientCaseNoteRequest(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.PatientCaseNoteRequest extractPatientCaseNoteRequest(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteRequestVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientCaseNoteRequest();
		ims.core.clinical.domain.objects.PatientCaseNoteRequest domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.PatientCaseNoteRequest)domMap.get(valueObject);
			}
			// ims.core.vo.PatientCaseNoteRequestVo ID_PatientCaseNoteRequest field is unknown
			domainObject = new ims.core.clinical.domain.objects.PatientCaseNoteRequest();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientCaseNoteRequest());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.PatientCaseNoteRequest)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.PatientCaseNoteRequest) domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientCaseNoteRequest.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientCaseNoteRequest());

		ims.core.resource.people.domain.objects.MemberOfStaff value1 = null;
		if ( null != valueObject.getCancelledBy() ) 
		{
			if (valueObject.getCancelledBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getCancelledBy()) != null)
				{
					value1 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getCancelledBy());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getCancelledBy();	
			}
			else
			{
				value1 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getCancelledBy().getBoId());
			}
		}
		domainObject.setCancelledBy(value1);
		ims.core.clinical.domain.objects.PatientCaseNoteTransfer value2 = null;
		if ( null != valueObject.getTransferThatCompletedRequest() ) 
		{
			if (valueObject.getTransferThatCompletedRequest().getBoId() == null)
			{
				if (domMap.get(valueObject.getTransferThatCompletedRequest()) != null)
				{
					value2 = (ims.core.clinical.domain.objects.PatientCaseNoteTransfer)domMap.get(valueObject.getTransferThatCompletedRequest());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getTransferThatCompletedRequest();	
			}
			else
			{
				value2 = (ims.core.clinical.domain.objects.PatientCaseNoteTransfer)domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientCaseNoteTransfer.class, valueObject.getTransferThatCompletedRequest().getBoId());
			}
		}
		domainObject.setTransferThatCompletedRequest(value2);
		ims.scheduling.domain.objects.Booking_Appointment value3 = null;
		if ( null != valueObject.getAppointment() ) 
		{
			if (valueObject.getAppointment().getBoId() == null)
			{
				if (domMap.get(valueObject.getAppointment()) != null)
				{
					value3 = (ims.scheduling.domain.objects.Booking_Appointment)domMap.get(valueObject.getAppointment());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getAppointment();	
			}
			else
			{
				value3 = (ims.scheduling.domain.objects.Booking_Appointment)domainFactory.getDomainObject(ims.scheduling.domain.objects.Booking_Appointment.class, valueObject.getAppointment().getBoId());
			}
		}
		domainObject.setAppointment(value3);
		ims.RefMan.domain.objects.TCIForPatientElectiveList value4 = null;
		if ( null != valueObject.getTCIDetail() ) 
		{
			if (valueObject.getTCIDetail().getBoId() == null)
			{
				if (domMap.get(valueObject.getTCIDetail()) != null)
				{
					value4 = (ims.RefMan.domain.objects.TCIForPatientElectiveList)domMap.get(valueObject.getTCIDetail());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getTCIDetail();	
			}
			else
			{
				value4 = (ims.RefMan.domain.objects.TCIForPatientElectiveList)domainFactory.getDomainObject(ims.RefMan.domain.objects.TCIForPatientElectiveList.class, valueObject.getTCIDetail().getBoId());
			}
		}
		domainObject.setTCIDetail(value4);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.PatientCaseNote value6 = null;
		if ( null != valueObject.getCaseNote() ) 
		{
			if (valueObject.getCaseNote().getBoId() == null)
			{
				if (domMap.get(valueObject.getCaseNote()) != null)
				{
					value6 = (ims.core.clinical.domain.objects.PatientCaseNote)domMap.get(valueObject.getCaseNote());
				}
			}
			else
			{
				value6 = (ims.core.clinical.domain.objects.PatientCaseNote)domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientCaseNote.class, valueObject.getCaseNote().getBoId());
			}
		}
		domainObject.setCaseNote(value6);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value7 = null;
		if ( null != valueObject.getRequestedForLocation() ) 
		{
			if (valueObject.getRequestedForLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getRequestedForLocation()) != null)
				{
					value7 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getRequestedForLocation());
				}
			}
			else
			{
				value7 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getRequestedForLocation().getBoId());
			}
		}
		domainObject.setRequestedForLocation(value7);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value8 = null;
		if ( null != valueObject.getRequestedBy() ) 
		{
			if (valueObject.getRequestedBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getRequestedBy()) != null)
				{
					value8 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getRequestedBy());
				}
			}
			else
			{
				value8 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getRequestedBy().getBoId());
			}
		}
		domainObject.setRequestedBy(value8);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.patient.domain.objects.Patient value9 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value9 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else
			{
				value9 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value9);
		domainObject.setRequestComment(ims.core.vo.domain.PatientCaseNoteCommentSaveVoAssembler.extractPatientCaseNoteComment(domainFactory, valueObject.getRequestComment(), domMap));
		ims.framework.utils.DateTime dateTime11 = valueObject.getCreationDate();
		java.util.Date value11 = null;
		if ( dateTime11 != null ) 
		{
			value11 = dateTime11.getJavaDate();
		}
		domainObject.setCreationDate(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getRequestStatus() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getRequestStatus().getID());
		}
		domainObject.setRequestStatus(value12);
		ims.framework.utils.DateTime dateTime13 = valueObject.getRequiredByDate();
		java.util.Date value13 = null;
		if ( dateTime13 != null ) 
		{
			value13 = dateTime13.getJavaDate();
		}
		domainObject.setRequiredByDate(value13);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getReasonForRequest() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getReasonForRequest().getID());
		}
		domainObject.setReasonForRequest(value14);
		ims.framework.utils.DateTime dateTime15 = valueObject.getCancelledDate();
		java.util.Date value15 = null;
		if ( dateTime15 != null ) 
		{
			value15 = dateTime15.getJavaDate();
		}
		domainObject.setCancelledDate(value15);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getCancellationReason() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getCancellationReason().getID());
		}
		domainObject.setCancellationReason(value16);

		return domainObject;
	}

}
