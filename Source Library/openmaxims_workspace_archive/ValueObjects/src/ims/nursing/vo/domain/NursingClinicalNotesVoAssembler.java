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
package ims.nursing.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author John MacEnri
 */
public class NursingClinicalNotesVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.nursing.vo.NursingClinicalNotesVo copy(ims.nursing.vo.NursingClinicalNotesVo valueObjectDest, ims.nursing.vo.NursingClinicalNotesVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ClinicalNotes(valueObjectSrc.getID_ClinicalNotes());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// carePlans
		valueObjectDest.setCarePlans(valueObjectSrc.getCarePlans());
		// InHospitalReport
		valueObjectDest.setInHospitalReport(valueObjectSrc.getInHospitalReport());
		// Ward
		valueObjectDest.setWard(valueObjectSrc.getWard());
		// StatusHistory
		valueObjectDest.setStatusHistory(valueObjectSrc.getStatusHistory());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// NoteClassification
		valueObjectDest.setNoteClassification(valueObjectSrc.getNoteClassification());
		// NoteType
		valueObjectDest.setNoteType(valueObjectSrc.getNoteType());
		// Discipline
		valueObjectDest.setDiscipline(valueObjectSrc.getDiscipline());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// AuthoringInfo
		valueObjectDest.setAuthoringInfo(valueObjectSrc.getAuthoringInfo());
		// isDerivedNote
		valueObjectDest.setIsDerivedNote(valueObjectSrc.getIsDerivedNote());
		// ForReview
		valueObjectDest.setForReview(valueObjectSrc.getForReview());
		// ForReviewDiscipline
		valueObjectDest.setForReviewDiscipline(valueObjectSrc.getForReviewDiscipline());
		// ReviewingHCP
		valueObjectDest.setReviewingHCP(valueObjectSrc.getReviewingHCP());
		// ReviewingDateTime
		valueObjectDest.setReviewingDateTime(valueObjectSrc.getReviewingDateTime());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// isCorrected
		valueObjectDest.setIsCorrected(valueObjectSrc.getIsCorrected());
		// isTranscribed
		valueObjectDest.setIsTranscribed(valueObjectSrc.getIsTranscribed());
		// SourceOfNote
		valueObjectDest.setSourceOfNote(valueObjectSrc.getSourceOfNote());
		// RecordingUser
		valueObjectDest.setRecordingUser(valueObjectSrc.getRecordingUser());
		// RecordingDateTime
		valueObjectDest.setRecordingDateTime(valueObjectSrc.getRecordingDateTime());
		// SystemInfo
		valueObjectDest.setSystemInfo(valueObjectSrc.getSystemInfo());
		// ClinicalNote
		valueObjectDest.setClinicalNote(valueObjectSrc.getClinicalNote());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createNursingClinicalNotesVoCollectionFromNursingClinicalNotes(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.nursing.domain.objects.NursingClinicalNotes objects.
	 */
	public static ims.nursing.vo.NursingClinicalNotesVoCollection createNursingClinicalNotesVoCollectionFromNursingClinicalNotes(java.util.Set domainObjectSet)	
	{
		return createNursingClinicalNotesVoCollectionFromNursingClinicalNotes(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.nursing.domain.objects.NursingClinicalNotes objects.
	 */
	public static ims.nursing.vo.NursingClinicalNotesVoCollection createNursingClinicalNotesVoCollectionFromNursingClinicalNotes(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.nursing.vo.NursingClinicalNotesVoCollection voList = new ims.nursing.vo.NursingClinicalNotesVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.nursing.domain.objects.NursingClinicalNotes domainObject = (ims.nursing.domain.objects.NursingClinicalNotes) iterator.next();
			ims.nursing.vo.NursingClinicalNotesVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.nursing.domain.objects.NursingClinicalNotes objects.
	 */
	public static ims.nursing.vo.NursingClinicalNotesVoCollection createNursingClinicalNotesVoCollectionFromNursingClinicalNotes(java.util.List domainObjectList) 
	{
		return createNursingClinicalNotesVoCollectionFromNursingClinicalNotes(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.nursing.domain.objects.NursingClinicalNotes objects.
	 */
	public static ims.nursing.vo.NursingClinicalNotesVoCollection createNursingClinicalNotesVoCollectionFromNursingClinicalNotes(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.nursing.vo.NursingClinicalNotesVoCollection voList = new ims.nursing.vo.NursingClinicalNotesVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.nursing.domain.objects.NursingClinicalNotes domainObject = (ims.nursing.domain.objects.NursingClinicalNotes) domainObjectList.get(i);
			ims.nursing.vo.NursingClinicalNotesVo vo = create(map, domainObject);

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
	 * Create the ims.nursing.domain.objects.NursingClinicalNotes set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractNursingClinicalNotesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.NursingClinicalNotesVoCollection voCollection) 
	 {
	 	return extractNursingClinicalNotesSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractNursingClinicalNotesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.NursingClinicalNotesVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.NursingClinicalNotesVo vo = voCollection.get(i);
			ims.nursing.domain.objects.NursingClinicalNotes domainObject = NursingClinicalNotesVoAssembler.extractNursingClinicalNotes(domainFactory, vo, domMap);

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
	 * Create the ims.nursing.domain.objects.NursingClinicalNotes list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractNursingClinicalNotesList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.NursingClinicalNotesVoCollection voCollection) 
	 {
	 	return extractNursingClinicalNotesList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractNursingClinicalNotesList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.NursingClinicalNotesVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.NursingClinicalNotesVo vo = voCollection.get(i);
			ims.nursing.domain.objects.NursingClinicalNotes domainObject = NursingClinicalNotesVoAssembler.extractNursingClinicalNotes(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.nursing.domain.objects.NursingClinicalNotes object.
	 * @param domainObject ims.nursing.domain.objects.NursingClinicalNotes
	 */
	 public static ims.nursing.vo.NursingClinicalNotesVo create(ims.nursing.domain.objects.NursingClinicalNotes domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.nursing.domain.objects.NursingClinicalNotes object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.nursing.vo.NursingClinicalNotesVo create(DomainObjectMap map, ims.nursing.domain.objects.NursingClinicalNotes domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.nursing.vo.NursingClinicalNotesVo valueObject = (ims.nursing.vo.NursingClinicalNotesVo) map.getValueObject(domainObject, ims.nursing.vo.NursingClinicalNotesVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.nursing.vo.NursingClinicalNotesVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.nursing.domain.objects.NursingClinicalNotes
	 */
	 public static ims.nursing.vo.NursingClinicalNotesVo insert(ims.nursing.vo.NursingClinicalNotesVo valueObject, ims.nursing.domain.objects.NursingClinicalNotes domainObject) 
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
	 * @param domainObject ims.nursing.domain.objects.NursingClinicalNotes
	 */
	 public static ims.nursing.vo.NursingClinicalNotesVo insert(DomainObjectMap map, ims.nursing.vo.NursingClinicalNotesVo valueObject, ims.nursing.domain.objects.NursingClinicalNotes domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ClinicalNotes(domainObject.getId());
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
			
		// carePlans
		valueObject.setCarePlans(ims.nursing.vo.domain.CarePlanTitleAssembler.createCarePlanTitleCollectionFromCarePlan(map, domainObject.getCarePlans()) );
		// InHospitalReport
		valueObject.setInHospitalReport( domainObject.isInHospitalReport() );
		// Ward
		valueObject.setWard(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getWard()) );
		// StatusHistory
		valueObject.setStatusHistory(ims.core.vo.domain.ClinicalNoteStatusVoAssembler.createClinicalNoteStatusVoCollectionFromClinicalNoteNoteStatus(map, domainObject.getStatusHistory()) );
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
		// NoteClassification
		ims.domain.lookups.LookupInstance instance6 = domainObject.getNoteClassification();
		if ( null != instance6 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance6.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance6.getImage().getImageId(), instance6.getImage().getImagePath());
			}
			color = instance6.getColor();
			if (color != null) 
				color.getValue();

			ims.clinical.vo.lookups.ClinicalNoteClassification voLookup6 = new ims.clinical.vo.lookups.ClinicalNoteClassification(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.clinical.vo.lookups.ClinicalNoteClassification parentVoLookup6 = voLookup6;
			ims.domain.lookups.LookupInstance parent6 = instance6.getParent();
			while (parent6 != null)
			{
				if (parent6.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent6.getImage().getImageId(), parent6.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent6.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup6.setParent(new ims.clinical.vo.lookups.ClinicalNoteClassification(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setNoteClassification(voLookup6);
		}
				// NoteType
		ims.domain.lookups.LookupInstance instance7 = domainObject.getNoteType();
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

			ims.core.vo.lookups.ClinicalNoteType voLookup7 = new ims.core.vo.lookups.ClinicalNoteType(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.ClinicalNoteType parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.core.vo.lookups.ClinicalNoteType(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setNoteType(voLookup7);
		}
				// Discipline
		ims.domain.lookups.LookupInstance instance8 = domainObject.getDiscipline();
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

			ims.core.vo.lookups.HcpDisType voLookup8 = new ims.core.vo.lookups.HcpDisType(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.HcpDisType parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.HcpDisType(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setDiscipline(voLookup8);
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
		// AuthoringInfo
		valueObject.setAuthoringInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// isDerivedNote
		valueObject.setIsDerivedNote( domainObject.isIsDerivedNote() );
		// ForReview
		valueObject.setForReview( domainObject.isForReview() );
		// ForReviewDiscipline
		ims.domain.lookups.LookupInstance instance13 = domainObject.getForReviewDiscipline();
		if ( null != instance13 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance13.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance13.getImage().getImageId(), instance13.getImage().getImagePath());
			}
			color = instance13.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.HcpDisType voLookup13 = new ims.core.vo.lookups.HcpDisType(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.core.vo.lookups.HcpDisType parentVoLookup13 = voLookup13;
			ims.domain.lookups.LookupInstance parent13 = instance13.getParent();
			while (parent13 != null)
			{
				if (parent13.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent13.getImage().getImageId(), parent13.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent13.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup13.setParent(new ims.core.vo.lookups.HcpDisType(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setForReviewDiscipline(voLookup13);
		}
				// ReviewingHCP
		valueObject.setReviewingHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getReviewingHCP()) );
		// ReviewingDateTime
		java.util.Date ReviewingDateTime = domainObject.getReviewingDateTime();
		if ( null != ReviewingDateTime ) 
		{
			valueObject.setReviewingDateTime(new ims.framework.utils.DateTime(ReviewingDateTime) );
		}
		// CurrentStatus
		valueObject.setCurrentStatus(ims.core.vo.domain.ClinicalNoteStatusVoAssembler.create(map, domainObject.getCurrentStatus()) );
		// isCorrected
		valueObject.setIsCorrected( domainObject.isIsCorrected() );
		// isTranscribed
		valueObject.setIsTranscribed( domainObject.isIsTranscribed() );
		// SourceOfNote
		ims.domain.lookups.LookupInstance instance19 = domainObject.getSourceOfNote();
		if ( null != instance19 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance19.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance19.getImage().getImageId(), instance19.getImage().getImagePath());
			}
			color = instance19.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.SourceOfNote voLookup19 = new ims.core.vo.lookups.SourceOfNote(instance19.getId(),instance19.getText(), instance19.isActive(), null, img, color);
			ims.core.vo.lookups.SourceOfNote parentVoLookup19 = voLookup19;
			ims.domain.lookups.LookupInstance parent19 = instance19.getParent();
			while (parent19 != null)
			{
				if (parent19.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent19.getImage().getImageId(), parent19.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent19.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup19.setParent(new ims.core.vo.lookups.SourceOfNote(parent19.getId(),parent19.getText(), parent19.isActive(), null, img, color));
				parentVoLookup19 = parentVoLookup19.getParent();
								parent19 = parent19.getParent();
			}			
			valueObject.setSourceOfNote(voLookup19);
		}
				// RecordingUser
		valueObject.setRecordingUser(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getRecordingUser()) );
		// RecordingDateTime
		java.util.Date RecordingDateTime = domainObject.getRecordingDateTime();
		if ( null != RecordingDateTime ) 
		{
			valueObject.setRecordingDateTime(new ims.framework.utils.DateTime(RecordingDateTime) );
		}
		// SystemInfo
		// set system information
		valueObject.setSystemInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// ClinicalNote
		valueObject.setClinicalNote(domainObject.getClinicalNote());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.nursing.domain.objects.NursingClinicalNotes extractNursingClinicalNotes(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.NursingClinicalNotesVo valueObject) 
	{
		return 	extractNursingClinicalNotes(domainFactory, valueObject, new HashMap());
	}

	public static ims.nursing.domain.objects.NursingClinicalNotes extractNursingClinicalNotes(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.NursingClinicalNotesVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ClinicalNotes();
		ims.nursing.domain.objects.NursingClinicalNotes domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.nursing.domain.objects.NursingClinicalNotes)domMap.get(valueObject);
			}
			// ims.nursing.vo.NursingClinicalNotesVo ID_NursingClinicalNotes field is unknown
			domainObject = new ims.nursing.domain.objects.NursingClinicalNotes();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ClinicalNotes());
			if (domMap.get(key) != null)
			{
				return (ims.nursing.domain.objects.NursingClinicalNotes)domMap.get(key);
			}
			domainObject = (ims.nursing.domain.objects.NursingClinicalNotes) domainFactory.getDomainObject(ims.nursing.domain.objects.NursingClinicalNotes.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ClinicalNotes());


		// SaveAsRefVO treated as RefValueObject
		ims.nursing.careplans.vo.CarePlanRefVoCollection refCollection1 = new ims.nursing.careplans.vo.CarePlanRefVoCollection();
		if (valueObject.getCarePlans() != null)
		{
			for (int i1=0; i1<valueObject.getCarePlans().size(); i1++)
			{
				ims.nursing.careplans.vo.CarePlanRefVo ref1 = (ims.nursing.careplans.vo.CarePlanRefVo)valueObject.getCarePlans().get(i1);
				refCollection1.add(ref1);
			}
		}
		int size1 = (null == refCollection1) ? 0 : refCollection1.size();		
		java.util.Set domainCarePlans1 = domainObject.getCarePlans();
		if (domainCarePlans1 == null)
		{
			domainCarePlans1 = new java.util.HashSet();
		}
		java.util.Set newSet1  = new java.util.HashSet();
		for(int i=0; i<size1; i++) 
		{
			ims.nursing.careplans.vo.CarePlanRefVo vo = refCollection1.get(i);					
			ims.nursing.careplans.domain.objects.CarePlan dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.nursing.careplans.domain.objects.CarePlan)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.nursing.careplans.domain.objects.CarePlan)domainFactory.getDomainObject( ims.nursing.careplans.domain.objects.CarePlan.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainCarePlans1.contains(dom))
			{
				domainCarePlans1.add(dom);
			}
			newSet1.add(dom);			
		}
		java.util.Set removedSet1 = new java.util.HashSet();
		java.util.Iterator iter1 = domainCarePlans1.iterator();
		//Find out which objects need to be removed
		while (iter1.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter1.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet1.contains(o))
			{
				removedSet1.add(o);
			}
		}
		iter1 = removedSet1.iterator();
		//Remove the unwanted objects
		while (iter1.hasNext())
		{
			domainCarePlans1.remove(iter1.next());
		}		
		
		domainObject.setCarePlans(domainCarePlans1);		
		domainObject.setInHospitalReport(valueObject.getInHospitalReport());
		domainObject.setWard(ims.core.vo.domain.LocationLiteVoAssembler.extractLocation(domainFactory, valueObject.getWard(), domMap));
		domainObject.setStatusHistory(ims.core.vo.domain.ClinicalNoteStatusVoAssembler.extractClinicalNoteNoteStatusList(domainFactory, valueObject.getStatusHistory(), domainObject.getStatusHistory(), domMap));		
		ims.core.admin.domain.objects.CareContext value5 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value5 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value5 = domainObject.getCareContext();	
			}
			else
			{
				value5 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getNoteClassification() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getNoteClassification().getID());
		}
		domainObject.setNoteClassification(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getNoteType() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getNoteType().getID());
		}
		domainObject.setNoteType(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getDiscipline() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getDiscipline().getID());
		}
		domainObject.setDiscipline(value8);
		ims.core.admin.domain.objects.ClinicalContact value9 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value9 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value9 = domainObject.getClinicalContact();	
			}
			else
			{
				value9 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value9);
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInfo(), domMap));
		domainObject.setIsDerivedNote(valueObject.getIsDerivedNote());
		domainObject.setForReview(valueObject.getForReview());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getForReviewDiscipline() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getForReviewDiscipline().getID());
		}
		domainObject.setForReviewDiscipline(value13);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value14 = null;
		if ( null != valueObject.getReviewingHCP() ) 
		{
			if (valueObject.getReviewingHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getReviewingHCP()) != null)
				{
					value14 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getReviewingHCP());
				}
			}
			else
			{
				value14 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getReviewingHCP().getBoId());
			}
		}
		domainObject.setReviewingHCP(value14);
		ims.framework.utils.DateTime dateTime15 = valueObject.getReviewingDateTime();
		java.util.Date value15 = null;
		if ( dateTime15 != null ) 
		{
			value15 = dateTime15.getJavaDate();
		}
		domainObject.setReviewingDateTime(value15);
		domainObject.setCurrentStatus(ims.core.vo.domain.ClinicalNoteStatusVoAssembler.extractClinicalNoteNoteStatus(domainFactory, valueObject.getCurrentStatus(), domMap));
		domainObject.setIsCorrected(valueObject.getIsCorrected());
		domainObject.setIsTranscribed(valueObject.getIsTranscribed());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value19 = null;
		if ( null != valueObject.getSourceOfNote() ) 
		{
			value19 =
				domainFactory.getLookupInstance(valueObject.getSourceOfNote().getID());
		}
		domainObject.setSourceOfNote(value19);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value20 = null;
		if ( null != valueObject.getRecordingUser() ) 
		{
			if (valueObject.getRecordingUser().getBoId() == null)
			{
				if (domMap.get(valueObject.getRecordingUser()) != null)
				{
					value20 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getRecordingUser());
				}
			}
			else
			{
				value20 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getRecordingUser().getBoId());
			}
		}
		domainObject.setRecordingUser(value20);
		ims.framework.utils.DateTime dateTime21 = valueObject.getRecordingDateTime();
		java.util.Date value21 = null;
		if ( dateTime21 != null ) 
		{
			value21 = dateTime21.getJavaDate();
		}
		domainObject.setRecordingDateTime(value21);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getClinicalNote() != null && valueObject.getClinicalNote().equals(""))
		{
			valueObject.setClinicalNote(null);
		}
		domainObject.setClinicalNote(valueObject.getClinicalNote());

		return domainObject;
	}

}
