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
public class PatientCaseNoteRequestShortVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PatientCaseNoteRequestShortVo copy(ims.core.vo.PatientCaseNoteRequestShortVo valueObjectDest, ims.core.vo.PatientCaseNoteRequestShortVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientCaseNoteRequest(valueObjectSrc.getID_PatientCaseNoteRequest());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
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
 	 * If more than one call to an Assembler is made then #createPatientCaseNoteRequestShortVoCollectionFromPatientCaseNoteRequest(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientCaseNoteRequest objects.
	 */
	public static ims.core.vo.PatientCaseNoteRequestShortVoCollection createPatientCaseNoteRequestShortVoCollectionFromPatientCaseNoteRequest(java.util.Set domainObjectSet)	
	{
		return createPatientCaseNoteRequestShortVoCollectionFromPatientCaseNoteRequest(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientCaseNoteRequest objects.
	 */
	public static ims.core.vo.PatientCaseNoteRequestShortVoCollection createPatientCaseNoteRequestShortVoCollectionFromPatientCaseNoteRequest(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatientCaseNoteRequestShortVoCollection voList = new ims.core.vo.PatientCaseNoteRequestShortVoCollection();
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
			ims.core.vo.PatientCaseNoteRequestShortVo vo = create(map, domainObject);
			
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
	public static ims.core.vo.PatientCaseNoteRequestShortVoCollection createPatientCaseNoteRequestShortVoCollectionFromPatientCaseNoteRequest(java.util.List domainObjectList) 
	{
		return createPatientCaseNoteRequestShortVoCollectionFromPatientCaseNoteRequest(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientCaseNoteRequest objects.
	 */
	public static ims.core.vo.PatientCaseNoteRequestShortVoCollection createPatientCaseNoteRequestShortVoCollectionFromPatientCaseNoteRequest(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatientCaseNoteRequestShortVoCollection voList = new ims.core.vo.PatientCaseNoteRequestShortVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.PatientCaseNoteRequest domainObject = (ims.core.clinical.domain.objects.PatientCaseNoteRequest) domainObjectList.get(i);
			ims.core.vo.PatientCaseNoteRequestShortVo vo = create(map, domainObject);

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
	 public static java.util.Set extractPatientCaseNoteRequestSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteRequestShortVoCollection voCollection) 
	 {
	 	return extractPatientCaseNoteRequestSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientCaseNoteRequestSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteRequestShortVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientCaseNoteRequestShortVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientCaseNoteRequest domainObject = PatientCaseNoteRequestShortVoAssembler.extractPatientCaseNoteRequest(domainFactory, vo, domMap);

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
	 public static java.util.List extractPatientCaseNoteRequestList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteRequestShortVoCollection voCollection) 
	 {
	 	return extractPatientCaseNoteRequestList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientCaseNoteRequestList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteRequestShortVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientCaseNoteRequestShortVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientCaseNoteRequest domainObject = PatientCaseNoteRequestShortVoAssembler.extractPatientCaseNoteRequest(domainFactory, vo, domMap);

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
	 public static ims.core.vo.PatientCaseNoteRequestShortVo create(ims.core.clinical.domain.objects.PatientCaseNoteRequest domainObject) 
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
	  public static ims.core.vo.PatientCaseNoteRequestShortVo create(DomainObjectMap map, ims.core.clinical.domain.objects.PatientCaseNoteRequest domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PatientCaseNoteRequestShortVo valueObject = (ims.core.vo.PatientCaseNoteRequestShortVo) map.getValueObject(domainObject, ims.core.vo.PatientCaseNoteRequestShortVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PatientCaseNoteRequestShortVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.core.vo.PatientCaseNoteRequestShortVo insert(ims.core.vo.PatientCaseNoteRequestShortVo valueObject, ims.core.clinical.domain.objects.PatientCaseNoteRequest domainObject) 
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
	 public static ims.core.vo.PatientCaseNoteRequestShortVo insert(DomainObjectMap map, ims.core.vo.PatientCaseNoteRequestShortVo valueObject, ims.core.clinical.domain.objects.PatientCaseNoteRequest domainObject) 
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
		ims.domain.lookups.LookupInstance instance7 = domainObject.getRequestStatus();
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

			ims.core.vo.lookups.CaseNoteRequestStatus voLookup7 = new ims.core.vo.lookups.CaseNoteRequestStatus(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.CaseNoteRequestStatus parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.core.vo.lookups.CaseNoteRequestStatus(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setRequestStatus(voLookup7);
		}
				// RequiredByDate
		java.util.Date RequiredByDate = domainObject.getRequiredByDate();
		if ( null != RequiredByDate ) 
		{
			valueObject.setRequiredByDate(new ims.framework.utils.DateTime(RequiredByDate) );
		}
		// ReasonForRequest
		ims.domain.lookups.LookupInstance instance9 = domainObject.getReasonForRequest();
		if ( null != instance9 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance9.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance9.getImage().getImageId(), instance9.getImage().getImagePath());
			}
			color = instance9.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.CaseNoteReasonForRequest voLookup9 = new ims.core.vo.lookups.CaseNoteReasonForRequest(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.CaseNoteReasonForRequest parentVoLookup9 = voLookup9;
			ims.domain.lookups.LookupInstance parent9 = instance9.getParent();
			while (parent9 != null)
			{
				if (parent9.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent9.getImage().getImageId(), parent9.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent9.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup9.setParent(new ims.core.vo.lookups.CaseNoteReasonForRequest(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setReasonForRequest(voLookup9);
		}
				// CancelledDate
		java.util.Date CancelledDate = domainObject.getCancelledDate();
		if ( null != CancelledDate ) 
		{
			valueObject.setCancelledDate(new ims.framework.utils.DateTime(CancelledDate) );
		}
		// CancellationReason
		ims.domain.lookups.LookupInstance instance11 = domainObject.getCancellationReason();
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

			ims.core.vo.lookups.CaseNoteRequestCancellationReason voLookup11 = new ims.core.vo.lookups.CaseNoteRequestCancellationReason(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.core.vo.lookups.CaseNoteRequestCancellationReason parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.core.vo.lookups.CaseNoteRequestCancellationReason(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setCancellationReason(voLookup11);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.PatientCaseNoteRequest extractPatientCaseNoteRequest(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteRequestShortVo valueObject) 
	{
		return 	extractPatientCaseNoteRequest(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.PatientCaseNoteRequest extractPatientCaseNoteRequest(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteRequestShortVo valueObject, HashMap domMap) 
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
			// ims.core.vo.PatientCaseNoteRequestShortVo ID_PatientCaseNoteRequest field is unknown
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

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.PatientCaseNote value1 = null;
		if ( null != valueObject.getCaseNote() ) 
		{
			if (valueObject.getCaseNote().getBoId() == null)
			{
				if (domMap.get(valueObject.getCaseNote()) != null)
				{
					value1 = (ims.core.clinical.domain.objects.PatientCaseNote)domMap.get(valueObject.getCaseNote());
				}
			}
			else
			{
				value1 = (ims.core.clinical.domain.objects.PatientCaseNote)domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientCaseNote.class, valueObject.getCaseNote().getBoId());
			}
		}
		domainObject.setCaseNote(value1);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value2 = null;
		if ( null != valueObject.getRequestedForLocation() ) 
		{
			if (valueObject.getRequestedForLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getRequestedForLocation()) != null)
				{
					value2 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getRequestedForLocation());
				}
			}
			else
			{
				value2 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getRequestedForLocation().getBoId());
			}
		}
		domainObject.setRequestedForLocation(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value3 = null;
		if ( null != valueObject.getRequestedBy() ) 
		{
			if (valueObject.getRequestedBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getRequestedBy()) != null)
				{
					value3 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getRequestedBy());
				}
			}
			else
			{
				value3 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getRequestedBy().getBoId());
			}
		}
		domainObject.setRequestedBy(value3);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.patient.domain.objects.Patient value4 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value4 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else
			{
				value4 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value4);
		domainObject.setRequestComment(ims.core.vo.domain.PatientCaseNoteCommentSaveVoAssembler.extractPatientCaseNoteComment(domainFactory, valueObject.getRequestComment(), domMap));
		ims.framework.utils.DateTime dateTime6 = valueObject.getCreationDate();
		java.util.Date value6 = null;
		if ( dateTime6 != null ) 
		{
			value6 = dateTime6.getJavaDate();
		}
		domainObject.setCreationDate(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getRequestStatus() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getRequestStatus().getID());
		}
		domainObject.setRequestStatus(value7);
		ims.framework.utils.DateTime dateTime8 = valueObject.getRequiredByDate();
		java.util.Date value8 = null;
		if ( dateTime8 != null ) 
		{
			value8 = dateTime8.getJavaDate();
		}
		domainObject.setRequiredByDate(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getReasonForRequest() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getReasonForRequest().getID());
		}
		domainObject.setReasonForRequest(value9);
		ims.framework.utils.DateTime dateTime10 = valueObject.getCancelledDate();
		java.util.Date value10 = null;
		if ( dateTime10 != null ) 
		{
			value10 = dateTime10.getJavaDate();
		}
		domainObject.setCancelledDate(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getCancellationReason() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getCancellationReason().getID());
		}
		domainObject.setCancellationReason(value11);

		return domainObject;
	}

}
