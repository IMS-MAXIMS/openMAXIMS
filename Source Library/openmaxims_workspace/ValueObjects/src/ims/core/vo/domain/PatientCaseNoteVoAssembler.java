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
 * @author Cristian Belciug
 */
public class PatientCaseNoteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PatientCaseNoteVo copy(ims.core.vo.PatientCaseNoteVo valueObjectDest, ims.core.vo.PatientCaseNoteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientCaseNote(valueObjectSrc.getID_PatientCaseNote());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CreatedBy
		valueObjectDest.setCreatedBy(valueObjectSrc.getCreatedBy());
		// CreationDate
		valueObjectDest.setCreationDate(valueObjectSrc.getCreationDate());
		// CurrentComment
		valueObjectDest.setCurrentComment(valueObjectSrc.getCurrentComment());
		// ArchivedBy
		valueObjectDest.setArchivedBy(valueObjectSrc.getArchivedBy());
		// ArchivedDate
		valueObjectDest.setArchivedDate(valueObjectSrc.getArchivedDate());
		// ArchivedComment
		valueObjectDest.setArchivedComment(valueObjectSrc.getArchivedComment());
		// DestroyedBy
		valueObjectDest.setDestroyedBy(valueObjectSrc.getDestroyedBy());
		// DestroyedDate
		valueObjectDest.setDestroyedDate(valueObjectSrc.getDestroyedDate());
		// DestroyedComment
		valueObjectDest.setDestroyedComment(valueObjectSrc.getDestroyedComment());
		// MergedBy
		valueObjectDest.setMergedBy(valueObjectSrc.getMergedBy());
		// MergedDate
		valueObjectDest.setMergedDate(valueObjectSrc.getMergedDate());
		// MergedFrom
		valueObjectDest.setMergedFrom(valueObjectSrc.getMergedFrom());
		// ScannedBy
		valueObjectDest.setScannedBy(valueObjectSrc.getScannedBy());
		// ScannedDate
		valueObjectDest.setScannedDate(valueObjectSrc.getScannedDate());
		// ScannedComment
		valueObjectDest.setScannedComment(valueObjectSrc.getScannedComment());
		// LastTransferDate
		valueObjectDest.setLastTransferDate(valueObjectSrc.getLastTransferDate());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// OpenRequests
		valueObjectDest.setOpenRequests(valueObjectSrc.getOpenRequests());
		// Type
		valueObjectDest.setType(valueObjectSrc.getType());
		// CurrentLocation
		valueObjectDest.setCurrentLocation(valueObjectSrc.getCurrentLocation());
		// Folder
		valueObjectDest.setFolder(valueObjectSrc.getFolder());
		// TrackingID
		valueObjectDest.setTrackingID(valueObjectSrc.getTrackingID());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientCaseNoteVoCollectionFromPatientCaseNote(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientCaseNote objects.
	 */
	public static ims.core.vo.PatientCaseNoteVoCollection createPatientCaseNoteVoCollectionFromPatientCaseNote(java.util.Set domainObjectSet)	
	{
		return createPatientCaseNoteVoCollectionFromPatientCaseNote(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientCaseNote objects.
	 */
	public static ims.core.vo.PatientCaseNoteVoCollection createPatientCaseNoteVoCollectionFromPatientCaseNote(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatientCaseNoteVoCollection voList = new ims.core.vo.PatientCaseNoteVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.PatientCaseNote domainObject = (ims.core.clinical.domain.objects.PatientCaseNote) iterator.next();
			ims.core.vo.PatientCaseNoteVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientCaseNote objects.
	 */
	public static ims.core.vo.PatientCaseNoteVoCollection createPatientCaseNoteVoCollectionFromPatientCaseNote(java.util.List domainObjectList) 
	{
		return createPatientCaseNoteVoCollectionFromPatientCaseNote(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientCaseNote objects.
	 */
	public static ims.core.vo.PatientCaseNoteVoCollection createPatientCaseNoteVoCollectionFromPatientCaseNote(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatientCaseNoteVoCollection voList = new ims.core.vo.PatientCaseNoteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.PatientCaseNote domainObject = (ims.core.clinical.domain.objects.PatientCaseNote) domainObjectList.get(i);
			ims.core.vo.PatientCaseNoteVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.PatientCaseNote set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientCaseNoteSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteVoCollection voCollection) 
	 {
	 	return extractPatientCaseNoteSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientCaseNoteSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientCaseNoteVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientCaseNote domainObject = PatientCaseNoteVoAssembler.extractPatientCaseNote(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.PatientCaseNote list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientCaseNoteList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteVoCollection voCollection) 
	 {
	 	return extractPatientCaseNoteList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientCaseNoteList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientCaseNoteVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientCaseNote domainObject = PatientCaseNoteVoAssembler.extractPatientCaseNote(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.PatientCaseNote object.
	 * @param domainObject ims.core.clinical.domain.objects.PatientCaseNote
	 */
	 public static ims.core.vo.PatientCaseNoteVo create(ims.core.clinical.domain.objects.PatientCaseNote domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.PatientCaseNote object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PatientCaseNoteVo create(DomainObjectMap map, ims.core.clinical.domain.objects.PatientCaseNote domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PatientCaseNoteVo valueObject = (ims.core.vo.PatientCaseNoteVo) map.getValueObject(domainObject, ims.core.vo.PatientCaseNoteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PatientCaseNoteVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.PatientCaseNote
	 */
	 public static ims.core.vo.PatientCaseNoteVo insert(ims.core.vo.PatientCaseNoteVo valueObject, ims.core.clinical.domain.objects.PatientCaseNote domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.PatientCaseNote
	 */
	 public static ims.core.vo.PatientCaseNoteVo insert(DomainObjectMap map, ims.core.vo.PatientCaseNoteVo valueObject, ims.core.clinical.domain.objects.PatientCaseNote domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientCaseNote(domainObject.getId());
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
			
		// CreatedBy
		if (domainObject.getCreatedBy() != null)
		{
			if(domainObject.getCreatedBy() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCreatedBy();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCreatedBy(new ims.core.resource.people.vo.MemberOfStaffRefVo(id, -1));				
			}
			else
			{
				valueObject.setCreatedBy(new ims.core.resource.people.vo.MemberOfStaffRefVo(domainObject.getCreatedBy().getId(), domainObject.getCreatedBy().getVersion()));
			}
		}
		// CreationDate
		java.util.Date CreationDate = domainObject.getCreationDate();
		if ( null != CreationDate ) 
		{
			valueObject.setCreationDate(new ims.framework.utils.DateTime(CreationDate) );
		}
		// CurrentComment
		valueObject.setCurrentComment(ims.core.vo.domain.PatientCaseNoteCommentSaveVoAssembler.create(map, domainObject.getCurrentComment()) );
		// ArchivedBy
		valueObject.setArchivedBy(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getArchivedBy()) );
		// ArchivedDate
		java.util.Date ArchivedDate = domainObject.getArchivedDate();
		if ( null != ArchivedDate ) 
		{
			valueObject.setArchivedDate(new ims.framework.utils.DateTime(ArchivedDate) );
		}
		// ArchivedComment
		valueObject.setArchivedComment(domainObject.getArchivedComment());
		// DestroyedBy
		valueObject.setDestroyedBy(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getDestroyedBy()) );
		// DestroyedDate
		java.util.Date DestroyedDate = domainObject.getDestroyedDate();
		if ( null != DestroyedDate ) 
		{
			valueObject.setDestroyedDate(new ims.framework.utils.DateTime(DestroyedDate) );
		}
		// DestroyedComment
		valueObject.setDestroyedComment(domainObject.getDestroyedComment());
		// MergedBy
		valueObject.setMergedBy(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getMergedBy()) );
		// MergedDate
		java.util.Date MergedDate = domainObject.getMergedDate();
		if ( null != MergedDate ) 
		{
			valueObject.setMergedDate(new ims.framework.utils.DateTime(MergedDate) );
		}
		// MergedFrom
		if (domainObject.getMergedFrom() != null)
		{
			if(domainObject.getMergedFrom() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getMergedFrom();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setMergedFrom(new ims.core.clinical.vo.PatientCaseNoteRefVo(id, -1));				
			}
			else
			{
				valueObject.setMergedFrom(new ims.core.clinical.vo.PatientCaseNoteRefVo(domainObject.getMergedFrom().getId(), domainObject.getMergedFrom().getVersion()));
			}
		}
		// ScannedBy
		valueObject.setScannedBy(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getScannedBy()) );
		// ScannedDate
		java.util.Date ScannedDate = domainObject.getScannedDate();
		if ( null != ScannedDate ) 
		{
			valueObject.setScannedDate(new ims.framework.utils.DateTime(ScannedDate) );
		}
		// ScannedComment
		valueObject.setScannedComment(domainObject.getScannedComment());
		// LastTransferDate
		java.util.Date LastTransferDate = domainObject.getLastTransferDate();
		if ( null != LastTransferDate ) 
		{
			valueObject.setLastTransferDate(new ims.framework.utils.DateTime(LastTransferDate) );
		}
		// Patient
		if (domainObject.getPatient() != null)
		{
			if(domainObject.getPatient() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPatient();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPatient(new ims.core.patient.vo.PatientRefVo(id, -1));				
			}
			else
			{
				valueObject.setPatient(new ims.core.patient.vo.PatientRefVo(domainObject.getPatient().getId(), domainObject.getPatient().getVersion()));
			}
		}
		// Status
		ims.domain.lookups.LookupInstance instance18 = domainObject.getStatus();
		if ( null != instance18 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance18.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance18.getImage().getImageId(), instance18.getImage().getImagePath());
			}
			color = instance18.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.CaseNoteStatus voLookup18 = new ims.core.vo.lookups.CaseNoteStatus(instance18.getId(),instance18.getText(), instance18.isActive(), null, img, color);
			ims.core.vo.lookups.CaseNoteStatus parentVoLookup18 = voLookup18;
			ims.domain.lookups.LookupInstance parent18 = instance18.getParent();
			while (parent18 != null)
			{
				if (parent18.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent18.getImage().getImageId(), parent18.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent18.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup18.setParent(new ims.core.vo.lookups.CaseNoteStatus(parent18.getId(),parent18.getText(), parent18.isActive(), null, img, color));
				parentVoLookup18 = parentVoLookup18.getParent();
								parent18 = parent18.getParent();
			}			
			valueObject.setStatus(voLookup18);
		}
				// OpenRequests
		ims.core.clinical.vo.PatientCaseNoteRequestRefVoCollection OpenRequests = new ims.core.clinical.vo.PatientCaseNoteRequestRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getOpenRequests().iterator(); iterator.hasNext(); ) 
		{
			ims.core.clinical.domain.objects.PatientCaseNoteRequest tmp = (ims.core.clinical.domain.objects.PatientCaseNoteRequest)iterator.next();
			if (tmp != null)
				OpenRequests.add(new ims.core.clinical.vo.PatientCaseNoteRequestRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setOpenRequests(OpenRequests);
		// Type
		ims.domain.lookups.LookupInstance instance20 = domainObject.getType();
		if ( null != instance20 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance20.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance20.getImage().getImageId(), instance20.getImage().getImagePath());
			}
			color = instance20.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.CaseNoteType voLookup20 = new ims.core.vo.lookups.CaseNoteType(instance20.getId(),instance20.getText(), instance20.isActive(), null, img, color);
			ims.core.vo.lookups.CaseNoteType parentVoLookup20 = voLookup20;
			ims.domain.lookups.LookupInstance parent20 = instance20.getParent();
			while (parent20 != null)
			{
				if (parent20.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent20.getImage().getImageId(), parent20.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent20.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup20.setParent(new ims.core.vo.lookups.CaseNoteType(parent20.getId(),parent20.getText(), parent20.isActive(), null, img, color));
				parentVoLookup20 = parentVoLookup20.getParent();
								parent20 = parent20.getParent();
			}			
			valueObject.setType(voLookup20);
		}
				// CurrentLocation
		valueObject.setCurrentLocation(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getCurrentLocation()) );
		// Folder
		ims.domain.lookups.LookupInstance instance22 = domainObject.getFolder();
		if ( null != instance22 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance22.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance22.getImage().getImageId(), instance22.getImage().getImagePath());
			}
			color = instance22.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.FolderCaseNote voLookup22 = new ims.core.vo.lookups.FolderCaseNote(instance22.getId(),instance22.getText(), instance22.isActive(), null, img, color);
			ims.core.vo.lookups.FolderCaseNote parentVoLookup22 = voLookup22;
			ims.domain.lookups.LookupInstance parent22 = instance22.getParent();
			while (parent22 != null)
			{
				if (parent22.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent22.getImage().getImageId(), parent22.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent22.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup22.setParent(new ims.core.vo.lookups.FolderCaseNote(parent22.getId(),parent22.getText(), parent22.isActive(), null, img, color));
				parentVoLookup22 = parentVoLookup22.getParent();
								parent22 = parent22.getParent();
			}			
			valueObject.setFolder(voLookup22);
		}
				// TrackingID
		valueObject.setTrackingID(domainObject.getTrackingID());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.PatientCaseNote extractPatientCaseNote(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteVo valueObject) 
	{
		return 	extractPatientCaseNote(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.PatientCaseNote extractPatientCaseNote(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientCaseNote();
		ims.core.clinical.domain.objects.PatientCaseNote domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.PatientCaseNote)domMap.get(valueObject);
			}
			// ims.core.vo.PatientCaseNoteVo ID_PatientCaseNote field is unknown
			domainObject = new ims.core.clinical.domain.objects.PatientCaseNote();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientCaseNote());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.PatientCaseNote)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.PatientCaseNote) domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientCaseNote.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientCaseNote());

		ims.core.resource.people.domain.objects.MemberOfStaff value1 = null;
		if ( null != valueObject.getCreatedBy() ) 
		{
			if (valueObject.getCreatedBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getCreatedBy()) != null)
				{
					value1 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getCreatedBy());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getCreatedBy();	
			}
			else
			{
				value1 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getCreatedBy().getBoId());
			}
		}
		domainObject.setCreatedBy(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getCreationDate();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setCreationDate(value2);
		domainObject.setCurrentComment(ims.core.vo.domain.PatientCaseNoteCommentSaveVoAssembler.extractPatientCaseNoteComment(domainFactory, valueObject.getCurrentComment(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value4 = null;
		if ( null != valueObject.getArchivedBy() ) 
		{
			if (valueObject.getArchivedBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getArchivedBy()) != null)
				{
					value4 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getArchivedBy());
				}
			}
			else
			{
				value4 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getArchivedBy().getBoId());
			}
		}
		domainObject.setArchivedBy(value4);
		ims.framework.utils.DateTime dateTime5 = valueObject.getArchivedDate();
		java.util.Date value5 = null;
		if ( dateTime5 != null ) 
		{
			value5 = dateTime5.getJavaDate();
		}
		domainObject.setArchivedDate(value5);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getArchivedComment() != null && valueObject.getArchivedComment().equals(""))
		{
			valueObject.setArchivedComment(null);
		}
		domainObject.setArchivedComment(valueObject.getArchivedComment());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value7 = null;
		if ( null != valueObject.getDestroyedBy() ) 
		{
			if (valueObject.getDestroyedBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getDestroyedBy()) != null)
				{
					value7 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getDestroyedBy());
				}
			}
			else
			{
				value7 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getDestroyedBy().getBoId());
			}
		}
		domainObject.setDestroyedBy(value7);
		ims.framework.utils.DateTime dateTime8 = valueObject.getDestroyedDate();
		java.util.Date value8 = null;
		if ( dateTime8 != null ) 
		{
			value8 = dateTime8.getJavaDate();
		}
		domainObject.setDestroyedDate(value8);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDestroyedComment() != null && valueObject.getDestroyedComment().equals(""))
		{
			valueObject.setDestroyedComment(null);
		}
		domainObject.setDestroyedComment(valueObject.getDestroyedComment());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value10 = null;
		if ( null != valueObject.getMergedBy() ) 
		{
			if (valueObject.getMergedBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getMergedBy()) != null)
				{
					value10 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getMergedBy());
				}
			}
			else
			{
				value10 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getMergedBy().getBoId());
			}
		}
		domainObject.setMergedBy(value10);
		ims.framework.utils.DateTime dateTime11 = valueObject.getMergedDate();
		java.util.Date value11 = null;
		if ( dateTime11 != null ) 
		{
			value11 = dateTime11.getJavaDate();
		}
		domainObject.setMergedDate(value11);
		ims.core.clinical.domain.objects.PatientCaseNote value12 = null;
		if ( null != valueObject.getMergedFrom() ) 
		{
			if (valueObject.getMergedFrom().getBoId() == null)
			{
				if (domMap.get(valueObject.getMergedFrom()) != null)
				{
					value12 = (ims.core.clinical.domain.objects.PatientCaseNote)domMap.get(valueObject.getMergedFrom());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value12 = domainObject.getMergedFrom();	
			}
			else
			{
				value12 = (ims.core.clinical.domain.objects.PatientCaseNote)domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientCaseNote.class, valueObject.getMergedFrom().getBoId());
			}
		}
		domainObject.setMergedFrom(value12);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value13 = null;
		if ( null != valueObject.getScannedBy() ) 
		{
			if (valueObject.getScannedBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getScannedBy()) != null)
				{
					value13 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getScannedBy());
				}
			}
			else
			{
				value13 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getScannedBy().getBoId());
			}
		}
		domainObject.setScannedBy(value13);
		ims.framework.utils.DateTime dateTime14 = valueObject.getScannedDate();
		java.util.Date value14 = null;
		if ( dateTime14 != null ) 
		{
			value14 = dateTime14.getJavaDate();
		}
		domainObject.setScannedDate(value14);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getScannedComment() != null && valueObject.getScannedComment().equals(""))
		{
			valueObject.setScannedComment(null);
		}
		domainObject.setScannedComment(valueObject.getScannedComment());
		ims.framework.utils.DateTime dateTime16 = valueObject.getLastTransferDate();
		java.util.Date value16 = null;
		if ( dateTime16 != null ) 
		{
			value16 = dateTime16.getJavaDate();
		}
		domainObject.setLastTransferDate(value16);
		ims.core.patient.domain.objects.Patient value17 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value17 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value17 = domainObject.getPatient();	
			}
			else
			{
				value17 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value17);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value18 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value18 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value18);

		ims.core.clinical.vo.PatientCaseNoteRequestRefVoCollection refCollection19 = valueObject.getOpenRequests();
		int size19 = (null == refCollection19) ? 0 : refCollection19.size();		
		java.util.List domainOpenRequests19 = domainObject.getOpenRequests();
		if (domainOpenRequests19 == null)
		{
			domainOpenRequests19 = new java.util.ArrayList();
		}
		for(int i=0; i < size19; i++) 
		{
			ims.core.clinical.vo.PatientCaseNoteRequestRefVo vo = refCollection19.get(i);			
			ims.core.clinical.domain.objects.PatientCaseNoteRequest dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.clinical.domain.objects.PatientCaseNoteRequest)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.clinical.domain.objects.PatientCaseNoteRequest)domainFactory.getDomainObject( ims.core.clinical.domain.objects.PatientCaseNoteRequest.class, vo.getBoId());
				}
			}

			int domIdx = domainOpenRequests19.indexOf(dom);
			if (domIdx == -1)
			{
				domainOpenRequests19.add(i, dom);
			}
			else if (i != domIdx && i < domainOpenRequests19.size())
			{
				Object tmp = domainOpenRequests19.get(i);
				domainOpenRequests19.set(i, domainOpenRequests19.get(domIdx));
				domainOpenRequests19.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i19 = domainOpenRequests19.size();
		while (i19 > size19)
		{
			domainOpenRequests19.remove(i19-1);
			i19 = domainOpenRequests19.size();
		}
		
		domainObject.setOpenRequests(domainOpenRequests19);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value20 = null;
		if ( null != valueObject.getType() ) 
		{
			value20 =
				domainFactory.getLookupInstance(valueObject.getType().getID());
		}
		domainObject.setType(value20);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value21 = null;
		if ( null != valueObject.getCurrentLocation() ) 
		{
			if (valueObject.getCurrentLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getCurrentLocation()) != null)
				{
					value21 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getCurrentLocation());
				}
			}
			else
			{
				value21 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getCurrentLocation().getBoId());
			}
		}
		domainObject.setCurrentLocation(value21);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value22 = null;
		if ( null != valueObject.getFolder() ) 
		{
			value22 =
				domainFactory.getLookupInstance(valueObject.getFolder().getID());
		}
		domainObject.setFolder(value22);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTrackingID() != null && valueObject.getTrackingID().equals(""))
		{
			valueObject.setTrackingID(null);
		}
		domainObject.setTrackingID(valueObject.getTrackingID());

		return domainObject;
	}

}
