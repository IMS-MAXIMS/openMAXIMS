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
public class PendingEmergencyAdmissionRepatriationVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PendingEmergencyAdmissionRepatriationVo copy(ims.core.vo.PendingEmergencyAdmissionRepatriationVo valueObjectDest, ims.core.vo.PendingEmergencyAdmissionRepatriationVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PendingNoEDEmergencyAdmit(valueObjectSrc.getID_PendingNoEDEmergencyAdmit());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Type
		valueObjectDest.setType(valueObjectSrc.getType());
		// Category
		valueObjectDest.setCategory(valueObjectSrc.getCategory());
		// SourceOfReferral
		valueObjectDest.setSourceOfReferral(valueObjectSrc.getSourceOfReferral());
		// TransferReason
		valueObjectDest.setTransferReason(valueObjectSrc.getTransferReason());
		// Service
		valueObjectDest.setService(valueObjectSrc.getService());
		// Hospital
		valueObjectDest.setHospital(valueObjectSrc.getHospital());
		// Ward
		valueObjectDest.setWard(valueObjectSrc.getWard());
		// ReferredLocation
		valueObjectDest.setReferredLocation(valueObjectSrc.getReferredLocation());
		// ContactDetails
		valueObjectDest.setContactDetails(valueObjectSrc.getContactDetails());
		// Comments
		valueObjectDest.setComments(valueObjectSrc.getComments());
		// ProposedTransferDate
		valueObjectDest.setProposedTransferDate(valueObjectSrc.getProposedTransferDate());
		// RecordedBy
		valueObjectDest.setRecordedBy(valueObjectSrc.getRecordedBy());
		// RecordedDateTime
		valueObjectDest.setRecordedDateTime(valueObjectSrc.getRecordedDateTime());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// StatusHistory
		valueObjectDest.setStatusHistory(valueObjectSrc.getStatusHistory());
		// SourceOfEmergencyReferral
		valueObjectDest.setSourceOfEmergencyReferral(valueObjectSrc.getSourceOfEmergencyReferral());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPendingEmergencyAdmissionRepatriationVoCollectionFromPendingNoEDEmergencyAdmit(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit objects.
	 */
	public static ims.core.vo.PendingEmergencyAdmissionRepatriationVoCollection createPendingEmergencyAdmissionRepatriationVoCollectionFromPendingNoEDEmergencyAdmit(java.util.Set domainObjectSet)	
	{
		return createPendingEmergencyAdmissionRepatriationVoCollectionFromPendingNoEDEmergencyAdmit(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit objects.
	 */
	public static ims.core.vo.PendingEmergencyAdmissionRepatriationVoCollection createPendingEmergencyAdmissionRepatriationVoCollectionFromPendingNoEDEmergencyAdmit(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PendingEmergencyAdmissionRepatriationVoCollection voList = new ims.core.vo.PendingEmergencyAdmissionRepatriationVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit domainObject = (ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit) iterator.next();
			ims.core.vo.PendingEmergencyAdmissionRepatriationVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit objects.
	 */
	public static ims.core.vo.PendingEmergencyAdmissionRepatriationVoCollection createPendingEmergencyAdmissionRepatriationVoCollectionFromPendingNoEDEmergencyAdmit(java.util.List domainObjectList) 
	{
		return createPendingEmergencyAdmissionRepatriationVoCollectionFromPendingNoEDEmergencyAdmit(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit objects.
	 */
	public static ims.core.vo.PendingEmergencyAdmissionRepatriationVoCollection createPendingEmergencyAdmissionRepatriationVoCollectionFromPendingNoEDEmergencyAdmit(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PendingEmergencyAdmissionRepatriationVoCollection voList = new ims.core.vo.PendingEmergencyAdmissionRepatriationVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit domainObject = (ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit) domainObjectList.get(i);
			ims.core.vo.PendingEmergencyAdmissionRepatriationVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPendingNoEDEmergencyAdmitSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PendingEmergencyAdmissionRepatriationVoCollection voCollection) 
	 {
	 	return extractPendingNoEDEmergencyAdmitSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPendingNoEDEmergencyAdmitSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PendingEmergencyAdmissionRepatriationVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PendingEmergencyAdmissionRepatriationVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit domainObject = PendingEmergencyAdmissionRepatriationVoAssembler.extractPendingNoEDEmergencyAdmit(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPendingNoEDEmergencyAdmitList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PendingEmergencyAdmissionRepatriationVoCollection voCollection) 
	 {
	 	return extractPendingNoEDEmergencyAdmitList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPendingNoEDEmergencyAdmitList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PendingEmergencyAdmissionRepatriationVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PendingEmergencyAdmissionRepatriationVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit domainObject = PendingEmergencyAdmissionRepatriationVoAssembler.extractPendingNoEDEmergencyAdmit(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit object.
	 * @param domainObject ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit
	 */
	 public static ims.core.vo.PendingEmergencyAdmissionRepatriationVo create(ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PendingEmergencyAdmissionRepatriationVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PendingEmergencyAdmissionRepatriationVo valueObject = (ims.core.vo.PendingEmergencyAdmissionRepatriationVo) map.getValueObject(domainObject, ims.core.vo.PendingEmergencyAdmissionRepatriationVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PendingEmergencyAdmissionRepatriationVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit
	 */
	 public static ims.core.vo.PendingEmergencyAdmissionRepatriationVo insert(ims.core.vo.PendingEmergencyAdmissionRepatriationVo valueObject, ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit domainObject) 
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
	 * @param domainObject ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit
	 */
	 public static ims.core.vo.PendingEmergencyAdmissionRepatriationVo insert(DomainObjectMap map, ims.core.vo.PendingEmergencyAdmissionRepatriationVo valueObject, ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PendingNoEDEmergencyAdmit(domainObject.getId());
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
			
		// Type
		ims.domain.lookups.LookupInstance instance1 = domainObject.getType();
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

			ims.core.vo.lookups.PendingEmergencyAdmissionType voLookup1 = new ims.core.vo.lookups.PendingEmergencyAdmissionType(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.PendingEmergencyAdmissionType parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.core.vo.lookups.PendingEmergencyAdmissionType(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setType(voLookup1);
		}
				// Category
		ims.domain.lookups.LookupInstance instance2 = domainObject.getCategory();
		if ( null != instance2 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance2.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance2.getImage().getImageId(), instance2.getImage().getImagePath());
			}
			color = instance2.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PatientStatus voLookup2 = new ims.core.vo.lookups.PatientStatus(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.PatientStatus parentVoLookup2 = voLookup2;
			ims.domain.lookups.LookupInstance parent2 = instance2.getParent();
			while (parent2 != null)
			{
				if (parent2.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent2.getImage().getImageId(), parent2.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent2.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup2.setParent(new ims.core.vo.lookups.PatientStatus(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setCategory(voLookup2);
		}
				// SourceOfReferral
		ims.domain.lookups.LookupInstance instance3 = domainObject.getSourceOfReferral();
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

			ims.core.vo.lookups.SourceOfReferral voLookup3 = new ims.core.vo.lookups.SourceOfReferral(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.SourceOfReferral parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.SourceOfReferral(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setSourceOfReferral(voLookup3);
		}
				// TransferReason
		ims.domain.lookups.LookupInstance instance4 = domainObject.getTransferReason();
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

			ims.core.vo.lookups.TransferReasonForPendingEmergencyAdmissionRequest voLookup4 = new ims.core.vo.lookups.TransferReasonForPendingEmergencyAdmissionRequest(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.TransferReasonForPendingEmergencyAdmissionRequest parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.TransferReasonForPendingEmergencyAdmissionRequest(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setTransferReason(voLookup4);
		}
				// Service
		valueObject.setService(ims.core.vo.domain.ServiceLiteVoAssembler.create(map, domainObject.getService()) );
		// Hospital
		valueObject.setHospital(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getHospital()) );
		// Ward
		valueObject.setWard(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getWard()) );
		// ReferredLocation
		valueObject.setReferredLocation(domainObject.getReferredLocation());
		// ContactDetails
		valueObject.setContactDetails(domainObject.getContactDetails());
		// Comments
		valueObject.setComments(domainObject.getComments());
		// ProposedTransferDate
		java.util.Date ProposedTransferDate = domainObject.getProposedTransferDate();
		if ( null != ProposedTransferDate ) 
		{
			valueObject.setProposedTransferDate(new ims.framework.utils.Date(ProposedTransferDate) );
		}
		// RecordedBy
		valueObject.setRecordedBy(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getRecordedBy()) );
		// RecordedDateTime
		java.util.Date RecordedDateTime = domainObject.getRecordedDateTime();
		if ( null != RecordedDateTime ) 
		{
			valueObject.setRecordedDateTime(new ims.framework.utils.DateTime(RecordedDateTime) );
		}
		// CurrentStatus
		valueObject.setCurrentStatus(ims.core.vo.domain.PendingEmergencyAdmissionStatusVoAssembler.create(map, domainObject.getCurrentStatus()) );
		// StatusHistory
		valueObject.setStatusHistory(ims.core.vo.domain.PendingEmergencyAdmissionStatusVoAssembler.createPendingEmergencyAdmissionStatusVoCollectionFromPendingAdmissionStatus(map, domainObject.getStatusHistory()) );
		// SourceOfEmergencyReferral
		ims.domain.lookups.LookupInstance instance16 = domainObject.getSourceOfEmergencyReferral();
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

			ims.core.vo.lookups.SourceOfEmergencyReferral voLookup16 = new ims.core.vo.lookups.SourceOfEmergencyReferral(instance16.getId(),instance16.getText(), instance16.isActive(), null, img, color);
			ims.core.vo.lookups.SourceOfEmergencyReferral parentVoLookup16 = voLookup16;
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
								parentVoLookup16.setParent(new ims.core.vo.lookups.SourceOfEmergencyReferral(parent16.getId(),parent16.getText(), parent16.isActive(), null, img, color));
				parentVoLookup16 = parentVoLookup16.getParent();
								parent16 = parent16.getParent();
			}			
			valueObject.setSourceOfEmergencyReferral(voLookup16);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit extractPendingNoEDEmergencyAdmit(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PendingEmergencyAdmissionRepatriationVo valueObject) 
	{
		return 	extractPendingNoEDEmergencyAdmit(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit extractPendingNoEDEmergencyAdmit(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PendingEmergencyAdmissionRepatriationVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PendingNoEDEmergencyAdmit();
		ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit)domMap.get(valueObject);
			}
			// ims.core.vo.PendingEmergencyAdmissionRepatriationVo ID_PendingNoEDEmergencyAdmit field is unknown
			domainObject = new ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PendingNoEDEmergencyAdmit());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit)domMap.get(key);
			}
			domainObject = (ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit) domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PendingNoEDEmergencyAdmit());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getType() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getType().getID());
		}
		domainObject.setType(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getCategory() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getCategory().getID());
		}
		domainObject.setCategory(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getSourceOfReferral() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getSourceOfReferral().getID());
		}
		domainObject.setSourceOfReferral(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getTransferReason() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getTransferReason().getID());
		}
		domainObject.setTransferReason(value4);
		domainObject.setService(ims.core.vo.domain.ServiceLiteVoAssembler.extractService(domainFactory, valueObject.getService(), domMap));
		domainObject.setHospital(ims.core.vo.domain.LocationLiteVoAssembler.extractLocation(domainFactory, valueObject.getHospital(), domMap));
		domainObject.setWard(ims.core.vo.domain.LocationLiteVoAssembler.extractLocation(domainFactory, valueObject.getWard(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReferredLocation() != null && valueObject.getReferredLocation().equals(""))
		{
			valueObject.setReferredLocation(null);
		}
		domainObject.setReferredLocation(valueObject.getReferredLocation());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getContactDetails() != null && valueObject.getContactDetails().equals(""))
		{
			valueObject.setContactDetails(null);
		}
		domainObject.setContactDetails(valueObject.getContactDetails());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComments() != null && valueObject.getComments().equals(""))
		{
			valueObject.setComments(null);
		}
		domainObject.setComments(valueObject.getComments());
		java.util.Date value11 = null;
		ims.framework.utils.Date date11 = valueObject.getProposedTransferDate();		
		if ( date11 != null ) 
		{
			value11 = date11.getDate();
		}
		domainObject.setProposedTransferDate(value11);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value12 = null;
		if ( null != valueObject.getRecordedBy() ) 
		{
			if (valueObject.getRecordedBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getRecordedBy()) != null)
				{
					value12 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getRecordedBy());
				}
			}
			else
			{
				value12 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getRecordedBy().getBoId());
			}
		}
		domainObject.setRecordedBy(value12);
		ims.framework.utils.DateTime dateTime13 = valueObject.getRecordedDateTime();
		java.util.Date value13 = null;
		if ( dateTime13 != null ) 
		{
			value13 = dateTime13.getJavaDate();
		}
		domainObject.setRecordedDateTime(value13);
		domainObject.setCurrentStatus(ims.core.vo.domain.PendingEmergencyAdmissionStatusVoAssembler.extractPendingAdmissionStatus(domainFactory, valueObject.getCurrentStatus(), domMap));
		domainObject.setStatusHistory(ims.core.vo.domain.PendingEmergencyAdmissionStatusVoAssembler.extractPendingAdmissionStatusList(domainFactory, valueObject.getStatusHistory(), domainObject.getStatusHistory(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getSourceOfEmergencyReferral() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getSourceOfEmergencyReferral().getID());
		}
		domainObject.setSourceOfEmergencyReferral(value16);

		return domainObject;
	}

}
