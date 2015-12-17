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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Catalin Tomozei
 */
public class PatientDocumentVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PatientDocumentVo copy(ims.core.vo.PatientDocumentVo valueObjectDest, ims.core.vo.PatientDocumentVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientDocument(valueObjectSrc.getID_PatientDocument());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// EpisodeofCare
		valueObjectDest.setEpisodeofCare(valueObjectSrc.getEpisodeofCare());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// Referral
		valueObjectDest.setReferral(valueObjectSrc.getReferral());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// ServerDocument
		valueObjectDest.setServerDocument(valueObjectSrc.getServerDocument());
		// CreationType
		valueObjectDest.setCreationType(valueObjectSrc.getCreationType());
		// Category
		valueObjectDest.setCategory(valueObjectSrc.getCategory());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// RecordingUser
		valueObjectDest.setRecordingUser(valueObjectSrc.getRecordingUser());
		// RecordingDateTime
		valueObjectDest.setRecordingDateTime(valueObjectSrc.getRecordingDateTime());
		// AuthoringHCP
		valueObjectDest.setAuthoringHCP(valueObjectSrc.getAuthoringHCP());
		// AuthoringDateTime
		valueObjectDest.setAuthoringDateTime(valueObjectSrc.getAuthoringDateTime());
		// Specialty
		valueObjectDest.setSpecialty(valueObjectSrc.getSpecialty());
		// CorrespondenceStatus
		valueObjectDest.setCorrespondenceStatus(valueObjectSrc.getCorrespondenceStatus());
		// CurrentDocumentStatus
		valueObjectDest.setCurrentDocumentStatus(valueObjectSrc.getCurrentDocumentStatus());
		// DocumentStatusHistory
		valueObjectDest.setDocumentStatusHistory(valueObjectSrc.getDocumentStatusHistory());
		// DocumentDate
		valueObjectDest.setDocumentDate(valueObjectSrc.getDocumentDate());
		// Clinic
		valueObjectDest.setClinic(valueObjectSrc.getClinic());
		// isLockedForEditing
		valueObjectDest.setIsLockedForEditing(valueObjectSrc.getIsLockedForEditing());
		// LockedByUser
		valueObjectDest.setLockedByUser(valueObjectSrc.getLockedByUser());
		// LockedOnDateTime
		valueObjectDest.setLockedOnDateTime(valueObjectSrc.getLockedOnDateTime());
		// ResponsibleHCP
		valueObjectDest.setResponsibleHCP(valueObjectSrc.getResponsibleHCP());
		// NoOfCopies
		valueObjectDest.setNoOfCopies(valueObjectSrc.getNoOfCopies());
		// HistoricalFileName
		valueObjectDest.setHistoricalFileName(valueObjectSrc.getHistoricalFileName());
		// HistoricDocId
		valueObjectDest.setHistoricDocId(valueObjectSrc.getHistoricDocId());
		// Services
		valueObjectDest.setServices(valueObjectSrc.getServices());
		// wasPrinted
		valueObjectDest.setWasPrinted(valueObjectSrc.getWasPrinted());
		// EmailStatus
		valueObjectDest.setEmailStatus(valueObjectSrc.getEmailStatus());
		// copyPatientOnCorrespondence
		valueObjectDest.setCopyPatientOnCorrespondence(valueObjectSrc.getCopyPatientOnCorrespondence());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientDocumentVoCollectionFromPatientDocument(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.documents.domain.objects.PatientDocument objects.
	 */
	public static ims.core.vo.PatientDocumentVoCollection createPatientDocumentVoCollectionFromPatientDocument(java.util.Set domainObjectSet)	
	{
		return createPatientDocumentVoCollectionFromPatientDocument(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.documents.domain.objects.PatientDocument objects.
	 */
	public static ims.core.vo.PatientDocumentVoCollection createPatientDocumentVoCollectionFromPatientDocument(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatientDocumentVoCollection voList = new ims.core.vo.PatientDocumentVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.documents.domain.objects.PatientDocument domainObject = (ims.core.documents.domain.objects.PatientDocument) iterator.next();
			ims.core.vo.PatientDocumentVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.documents.domain.objects.PatientDocument objects.
	 */
	public static ims.core.vo.PatientDocumentVoCollection createPatientDocumentVoCollectionFromPatientDocument(java.util.List domainObjectList) 
	{
		return createPatientDocumentVoCollectionFromPatientDocument(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.documents.domain.objects.PatientDocument objects.
	 */
	public static ims.core.vo.PatientDocumentVoCollection createPatientDocumentVoCollectionFromPatientDocument(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatientDocumentVoCollection voList = new ims.core.vo.PatientDocumentVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.documents.domain.objects.PatientDocument domainObject = (ims.core.documents.domain.objects.PatientDocument) domainObjectList.get(i);
			ims.core.vo.PatientDocumentVo vo = create(map, domainObject);

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
	 * Create the ims.core.documents.domain.objects.PatientDocument set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientDocumentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientDocumentVoCollection voCollection) 
	 {
	 	return extractPatientDocumentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientDocumentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientDocumentVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientDocumentVo vo = voCollection.get(i);
			ims.core.documents.domain.objects.PatientDocument domainObject = PatientDocumentVoAssembler.extractPatientDocument(domainFactory, vo, domMap);

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
	 * Create the ims.core.documents.domain.objects.PatientDocument list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientDocumentList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientDocumentVoCollection voCollection) 
	 {
	 	return extractPatientDocumentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientDocumentList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientDocumentVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientDocumentVo vo = voCollection.get(i);
			ims.core.documents.domain.objects.PatientDocument domainObject = PatientDocumentVoAssembler.extractPatientDocument(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.documents.domain.objects.PatientDocument object.
	 * @param domainObject ims.core.documents.domain.objects.PatientDocument
	 */
	 public static ims.core.vo.PatientDocumentVo create(ims.core.documents.domain.objects.PatientDocument domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.documents.domain.objects.PatientDocument object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PatientDocumentVo create(DomainObjectMap map, ims.core.documents.domain.objects.PatientDocument domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PatientDocumentVo valueObject = (ims.core.vo.PatientDocumentVo) map.getValueObject(domainObject, ims.core.vo.PatientDocumentVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PatientDocumentVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.documents.domain.objects.PatientDocument
	 */
	 public static ims.core.vo.PatientDocumentVo insert(ims.core.vo.PatientDocumentVo valueObject, ims.core.documents.domain.objects.PatientDocument domainObject) 
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
	 * @param domainObject ims.core.documents.domain.objects.PatientDocument
	 */
	 public static ims.core.vo.PatientDocumentVo insert(DomainObjectMap map, ims.core.vo.PatientDocumentVo valueObject, ims.core.documents.domain.objects.PatientDocument domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientDocument(domainObject.getId());
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
		// EpisodeofCare
		if (domainObject.getEpisodeofCare() != null)
		{
			if(domainObject.getEpisodeofCare() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getEpisodeofCare();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setEpisodeofCare(new ims.core.admin.vo.EpisodeOfCareRefVo(id, -1));				
			}
			else
			{
				valueObject.setEpisodeofCare(new ims.core.admin.vo.EpisodeOfCareRefVo(domainObject.getEpisodeofCare().getId(), domainObject.getEpisodeofCare().getVersion()));
			}
		}
		// CareContext
		if (domainObject.getCareContext() != null)
		{
			if(domainObject.getCareContext() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCareContext();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(id, -1));				
			}
			else
			{
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(domainObject.getCareContext().getId(), domainObject.getCareContext().getVersion()));
			}
		}
		// ClinicalContact
		if (domainObject.getClinicalContact() != null)
		{
			if(domainObject.getClinicalContact() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getClinicalContact();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(id, -1));				
			}
			else
			{
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(domainObject.getClinicalContact().getId(), domainObject.getClinicalContact().getVersion()));
			}
		}
		// Referral
		if (domainObject.getReferral() != null)
		{
			if(domainObject.getReferral() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getReferral();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setReferral(new ims.core.admin.vo.ReferralRefVo(id, -1));				
			}
			else
			{
				valueObject.setReferral(new ims.core.admin.vo.ReferralRefVo(domainObject.getReferral().getId(), domainObject.getReferral().getVersion()));
			}
		}
		// Name
		valueObject.setName(domainObject.getName());
		// ServerDocument
		valueObject.setServerDocument(ims.core.vo.domain.ServerDocumentVoAssembler.create(map, domainObject.getServerDocument()) );
		// CreationType
		ims.domain.lookups.LookupInstance instance8 = domainObject.getCreationType();
		if ( null != instance8 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance8.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance8.getImage().getImageId(), instance8.getImage().getImagePath());
			}
			color = instance8.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.DocumentCreationType voLookup8 = new ims.core.vo.lookups.DocumentCreationType(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.DocumentCreationType parentVoLookup8 = voLookup8;
			ims.domain.lookups.LookupInstance parent8 = instance8.getParent();
			while (parent8 != null)
			{
				if (parent8.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent8.getImage().getImageId(), parent8.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent8.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup8.setParent(new ims.core.vo.lookups.DocumentCreationType(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setCreationType(voLookup8);
		}
				// Category
		ims.domain.lookups.LookupInstance instance9 = domainObject.getCategory();
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

			ims.core.vo.lookups.DocumentCategory voLookup9 = new ims.core.vo.lookups.DocumentCategory(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.DocumentCategory parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.core.vo.lookups.DocumentCategory(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setCategory(voLookup9);
		}
				// Status
		ims.domain.lookups.LookupInstance instance10 = domainObject.getStatus();
		if ( null != instance10 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance10.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance10.getImage().getImageId(), instance10.getImage().getImagePath());
			}
			color = instance10.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup10 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup10 = voLookup10;
			ims.domain.lookups.LookupInstance parent10 = instance10.getParent();
			while (parent10 != null)
			{
				if (parent10.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent10.getImage().getImageId(), parent10.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent10.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup10.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setStatus(voLookup10);
		}
				// RecordingUser
		if (domainObject.getRecordingUser() != null)
		{
			if(domainObject.getRecordingUser() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getRecordingUser();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setRecordingUser(new ims.core.resource.people.vo.MemberOfStaffRefVo(id, -1));				
			}
			else
			{
				valueObject.setRecordingUser(new ims.core.resource.people.vo.MemberOfStaffRefVo(domainObject.getRecordingUser().getId(), domainObject.getRecordingUser().getVersion()));
			}
		}
		// RecordingDateTime
		java.util.Date RecordingDateTime = domainObject.getRecordingDateTime();
		if ( null != RecordingDateTime ) 
		{
			valueObject.setRecordingDateTime(new ims.framework.utils.DateTime(RecordingDateTime) );
		}
		// AuthoringHCP
		if (domainObject.getAuthoringHCP() != null)
		{
			if(domainObject.getAuthoringHCP() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAuthoringHCP();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAuthoringHCP(new ims.core.resource.people.vo.HcpRefVo(id, -1));				
			}
			else
			{
				valueObject.setAuthoringHCP(new ims.core.resource.people.vo.HcpRefVo(domainObject.getAuthoringHCP().getId(), domainObject.getAuthoringHCP().getVersion()));
			}
		}
		// AuthoringDateTime
		java.util.Date AuthoringDateTime = domainObject.getAuthoringDateTime();
		if ( null != AuthoringDateTime ) 
		{
			valueObject.setAuthoringDateTime(new ims.framework.utils.DateTime(AuthoringDateTime) );
		}
		// Specialty
		ims.domain.lookups.LookupInstance instance15 = domainObject.getSpecialty();
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

			ims.core.vo.lookups.Specialty voLookup15 = new ims.core.vo.lookups.Specialty(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup15 = voLookup15;
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
								parentVoLookup15.setParent(new ims.core.vo.lookups.Specialty(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setSpecialty(voLookup15);
		}
				// CorrespondenceStatus
		ims.domain.lookups.LookupInstance instance16 = domainObject.getCorrespondenceStatus();
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

			ims.core.vo.lookups.DocumentStatus voLookup16 = new ims.core.vo.lookups.DocumentStatus(instance16.getId(),instance16.getText(), instance16.isActive(), null, img, color);
			ims.core.vo.lookups.DocumentStatus parentVoLookup16 = voLookup16;
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
								parentVoLookup16.setParent(new ims.core.vo.lookups.DocumentStatus(parent16.getId(),parent16.getText(), parent16.isActive(), null, img, color));
				parentVoLookup16 = parentVoLookup16.getParent();
								parent16 = parent16.getParent();
			}			
			valueObject.setCorrespondenceStatus(voLookup16);
		}
				// CurrentDocumentStatus
		valueObject.setCurrentDocumentStatus(ims.core.vo.domain.PatientDocumentStatusVoAssembler.create(map, domainObject.getCurrentDocumentStatus()) );
		// DocumentStatusHistory
		valueObject.setDocumentStatusHistory(ims.core.vo.domain.PatientDocumentStatusVoAssembler.createPatientDocumentStatusVoCollectionFromDocumentStatus(map, domainObject.getDocumentStatusHistory()) );
		// DocumentDate
		java.util.Date DocumentDate = domainObject.getDocumentDate();
		if ( null != DocumentDate ) 
		{
			valueObject.setDocumentDate(new ims.framework.utils.Date(DocumentDate) );
		}
		// Clinic
		if (domainObject.getClinic() != null)
		{
			if(domainObject.getClinic() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getClinic();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setClinic(new ims.core.resource.place.vo.ClinicRefVo(id, -1));				
			}
			else
			{
				valueObject.setClinic(new ims.core.resource.place.vo.ClinicRefVo(domainObject.getClinic().getId(), domainObject.getClinic().getVersion()));
			}
		}
		// isLockedForEditing
		valueObject.setIsLockedForEditing( domainObject.isIsLockedForEditing() );
		// LockedByUser
		if (domainObject.getLockedByUser() != null)
		{
			if(domainObject.getLockedByUser() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getLockedByUser();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setLockedByUser(new ims.core.resource.people.vo.MemberOfStaffRefVo(id, -1));				
			}
			else
			{
				valueObject.setLockedByUser(new ims.core.resource.people.vo.MemberOfStaffRefVo(domainObject.getLockedByUser().getId(), domainObject.getLockedByUser().getVersion()));
			}
		}
		// LockedOnDateTime
		java.util.Date LockedOnDateTime = domainObject.getLockedOnDateTime();
		if ( null != LockedOnDateTime ) 
		{
			valueObject.setLockedOnDateTime(new ims.framework.utils.DateTime(LockedOnDateTime) );
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
		// NoOfCopies
		valueObject.setNoOfCopies(domainObject.getNoOfCopies());
		// HistoricalFileName
		valueObject.setHistoricalFileName(domainObject.getHistoricalFileName());
		// HistoricDocId
		valueObject.setHistoricDocId(domainObject.getHistoricDocId());
		// Services
		ims.core.clinical.vo.ServiceRefVoCollection Services = new ims.core.clinical.vo.ServiceRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getServices().iterator(); iterator.hasNext(); ) 
		{
			ims.core.clinical.domain.objects.Service tmp = (ims.core.clinical.domain.objects.Service)iterator.next();
			if (tmp != null)
				Services.add(new ims.core.clinical.vo.ServiceRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setServices(Services);
		// wasPrinted
		valueObject.setWasPrinted( domainObject.isWasPrinted() );
		// EmailStatus
		ims.domain.lookups.LookupInstance instance30 = domainObject.getEmailStatus();
		if ( null != instance30 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance30.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance30.getImage().getImageId(), instance30.getImage().getImagePath());
			}
			color = instance30.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.DocumentEmailStatus voLookup30 = new ims.core.vo.lookups.DocumentEmailStatus(instance30.getId(),instance30.getText(), instance30.isActive(), null, img, color);
			ims.core.vo.lookups.DocumentEmailStatus parentVoLookup30 = voLookup30;
			ims.domain.lookups.LookupInstance parent30 = instance30.getParent();
			while (parent30 != null)
			{
				if (parent30.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent30.getImage().getImageId(), parent30.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent30.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup30.setParent(new ims.core.vo.lookups.DocumentEmailStatus(parent30.getId(),parent30.getText(), parent30.isActive(), null, img, color));
				parentVoLookup30 = parentVoLookup30.getParent();
								parent30 = parent30.getParent();
			}			
			valueObject.setEmailStatus(voLookup30);
		}
				// copyPatientOnCorrespondence
		valueObject.setCopyPatientOnCorrespondence( domainObject.isCopyPatientOnCorrespondence() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.documents.domain.objects.PatientDocument extractPatientDocument(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientDocumentVo valueObject) 
	{
		return 	extractPatientDocument(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.documents.domain.objects.PatientDocument extractPatientDocument(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientDocumentVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientDocument();
		ims.core.documents.domain.objects.PatientDocument domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.documents.domain.objects.PatientDocument)domMap.get(valueObject);
			}
			// ims.core.vo.PatientDocumentVo ID_PatientDocument field is unknown
			domainObject = new ims.core.documents.domain.objects.PatientDocument();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientDocument());
			if (domMap.get(key) != null)
			{
				return (ims.core.documents.domain.objects.PatientDocument)domMap.get(key);
			}
			domainObject = (ims.core.documents.domain.objects.PatientDocument) domainFactory.getDomainObject(ims.core.documents.domain.objects.PatientDocument.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientDocument());

		ims.core.patient.domain.objects.Patient value1 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value1 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getPatient();	
			}
			else
			{
				value1 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value1);
		ims.core.admin.domain.objects.EpisodeOfCare value2 = null;
		if ( null != valueObject.getEpisodeofCare() ) 
		{
			if (valueObject.getEpisodeofCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisodeofCare()) != null)
				{
					value2 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisodeofCare());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getEpisodeofCare();	
			}
			else
			{
				value2 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisodeofCare().getBoId());
			}
		}
		domainObject.setEpisodeofCare(value2);
		ims.core.admin.domain.objects.CareContext value3 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value3 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getCareContext();	
			}
			else
			{
				value3 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value3);
		ims.core.admin.domain.objects.ClinicalContact value4 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value4 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getClinicalContact();	
			}
			else
			{
				value4 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value4);
		ims.core.admin.domain.objects.Referral value5 = null;
		if ( null != valueObject.getReferral() ) 
		{
			if (valueObject.getReferral().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferral()) != null)
				{
					value5 = (ims.core.admin.domain.objects.Referral)domMap.get(valueObject.getReferral());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value5 = domainObject.getReferral();	
			}
			else
			{
				value5 = (ims.core.admin.domain.objects.Referral)domainFactory.getDomainObject(ims.core.admin.domain.objects.Referral.class, valueObject.getReferral().getBoId());
			}
		}
		domainObject.setReferral(value5);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());
		domainObject.setServerDocument(ims.core.vo.domain.ServerDocumentVoAssembler.extractServerDocument(domainFactory, valueObject.getServerDocument(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getCreationType() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getCreationType().getID());
		}
		domainObject.setCreationType(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getCategory() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getCategory().getID());
		}
		domainObject.setCategory(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value10);
		ims.core.resource.people.domain.objects.MemberOfStaff value11 = null;
		if ( null != valueObject.getRecordingUser() ) 
		{
			if (valueObject.getRecordingUser().getBoId() == null)
			{
				if (domMap.get(valueObject.getRecordingUser()) != null)
				{
					value11 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getRecordingUser());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value11 = domainObject.getRecordingUser();	
			}
			else
			{
				value11 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getRecordingUser().getBoId());
			}
		}
		domainObject.setRecordingUser(value11);
		ims.framework.utils.DateTime dateTime12 = valueObject.getRecordingDateTime();
		java.util.Date value12 = null;
		if ( dateTime12 != null ) 
		{
			value12 = dateTime12.getJavaDate();
		}
		domainObject.setRecordingDateTime(value12);
		ims.core.resource.people.domain.objects.Hcp value13 = null;
		if ( null != valueObject.getAuthoringHCP() ) 
		{
			if (valueObject.getAuthoringHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getAuthoringHCP()) != null)
				{
					value13 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getAuthoringHCP());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value13 = domainObject.getAuthoringHCP();	
			}
			else
			{
				value13 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getAuthoringHCP().getBoId());
			}
		}
		domainObject.setAuthoringHCP(value13);
		ims.framework.utils.DateTime dateTime14 = valueObject.getAuthoringDateTime();
		java.util.Date value14 = null;
		if ( dateTime14 != null ) 
		{
			value14 = dateTime14.getJavaDate();
		}
		domainObject.setAuthoringDateTime(value14);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value15);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getCorrespondenceStatus() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getCorrespondenceStatus().getID());
		}
		domainObject.setCorrespondenceStatus(value16);
		domainObject.setCurrentDocumentStatus(ims.core.vo.domain.PatientDocumentStatusVoAssembler.extractDocumentStatus(domainFactory, valueObject.getCurrentDocumentStatus(), domMap));
		domainObject.setDocumentStatusHistory(ims.core.vo.domain.PatientDocumentStatusVoAssembler.extractDocumentStatusList(domainFactory, valueObject.getDocumentStatusHistory(), domainObject.getDocumentStatusHistory(), domMap));		
		java.util.Date value19 = null;
		ims.framework.utils.Date date19 = valueObject.getDocumentDate();		
		if ( date19 != null ) 
		{
			value19 = date19.getDate();
		}
		domainObject.setDocumentDate(value19);
		ims.core.resource.place.domain.objects.Clinic value20 = null;
		if ( null != valueObject.getClinic() ) 
		{
			if (valueObject.getClinic().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinic()) != null)
				{
					value20 = (ims.core.resource.place.domain.objects.Clinic)domMap.get(valueObject.getClinic());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value20 = domainObject.getClinic();	
			}
			else
			{
				value20 = (ims.core.resource.place.domain.objects.Clinic)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Clinic.class, valueObject.getClinic().getBoId());
			}
		}
		domainObject.setClinic(value20);
		domainObject.setIsLockedForEditing(valueObject.getIsLockedForEditing());
		ims.core.resource.people.domain.objects.MemberOfStaff value22 = null;
		if ( null != valueObject.getLockedByUser() ) 
		{
			if (valueObject.getLockedByUser().getBoId() == null)
			{
				if (domMap.get(valueObject.getLockedByUser()) != null)
				{
					value22 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getLockedByUser());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value22 = domainObject.getLockedByUser();	
			}
			else
			{
				value22 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getLockedByUser().getBoId());
			}
		}
		domainObject.setLockedByUser(value22);
		ims.framework.utils.DateTime dateTime23 = valueObject.getLockedOnDateTime();
		java.util.Date value23 = null;
		if ( dateTime23 != null ) 
		{
			value23 = dateTime23.getJavaDate();
		}
		domainObject.setLockedOnDateTime(value23);
		ims.core.resource.people.domain.objects.Hcp value24 = null;
		if ( null != valueObject.getResponsibleHCP() ) 
		{
			if (valueObject.getResponsibleHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getResponsibleHCP()) != null)
				{
					value24 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getResponsibleHCP());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value24 = domainObject.getResponsibleHCP();	
			}
			else
			{
				value24 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getResponsibleHCP().getBoId());
			}
		}
		domainObject.setResponsibleHCP(value24);
		domainObject.setNoOfCopies(valueObject.getNoOfCopies());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getHistoricalFileName() != null && valueObject.getHistoricalFileName().equals(""))
		{
			valueObject.setHistoricalFileName(null);
		}
		domainObject.setHistoricalFileName(valueObject.getHistoricalFileName());
		domainObject.setHistoricDocId(valueObject.getHistoricDocId());

		ims.core.clinical.vo.ServiceRefVoCollection refCollection28 = valueObject.getServices();
		int size28 = (null == refCollection28) ? 0 : refCollection28.size();		
		java.util.List domainServices28 = domainObject.getServices();
		if (domainServices28 == null)
		{
			domainServices28 = new java.util.ArrayList();
		}
		for(int i=0; i < size28; i++) 
		{
			ims.core.clinical.vo.ServiceRefVo vo = refCollection28.get(i);			
			ims.core.clinical.domain.objects.Service dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.clinical.domain.objects.Service)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.clinical.domain.objects.Service)domainFactory.getDomainObject( ims.core.clinical.domain.objects.Service.class, vo.getBoId());
				}
			}

			int domIdx = domainServices28.indexOf(dom);
			if (domIdx == -1)
			{
				domainServices28.add(i, dom);
			}
			else if (i != domIdx && i < domainServices28.size())
			{
				Object tmp = domainServices28.get(i);
				domainServices28.set(i, domainServices28.get(domIdx));
				domainServices28.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i28 = domainServices28.size();
		while (i28 > size28)
		{
			domainServices28.remove(i28-1);
			i28 = domainServices28.size();
		}
		
		domainObject.setServices(domainServices28);		
		domainObject.setWasPrinted(valueObject.getWasPrinted());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value30 = null;
		if ( null != valueObject.getEmailStatus() ) 
		{
			value30 =
				domainFactory.getLookupInstance(valueObject.getEmailStatus().getID());
		}
		domainObject.setEmailStatus(value30);
		domainObject.setCopyPatientOnCorrespondence(valueObject.getCopyPatientOnCorrespondence());

		return domainObject;
	}

}
