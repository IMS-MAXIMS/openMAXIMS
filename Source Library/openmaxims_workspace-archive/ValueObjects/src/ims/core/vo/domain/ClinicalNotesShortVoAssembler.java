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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class ClinicalNotesShortVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.ClinicalNotesShortVo copy(ims.core.vo.ClinicalNotesShortVo valueObjectDest, ims.core.vo.ClinicalNotesShortVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ClinicalNotes(valueObjectSrc.getID_ClinicalNotes());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
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
 	 * If more than one call to an Assembler is made then #createClinicalNotesShortVoCollectionFromClinicalNotes(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.ClinicalNotes objects.
	 */
	public static ims.core.vo.ClinicalNotesShortVoCollection createClinicalNotesShortVoCollectionFromClinicalNotes(java.util.Set domainObjectSet)	
	{
		return createClinicalNotesShortVoCollectionFromClinicalNotes(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.ClinicalNotes objects.
	 */
	public static ims.core.vo.ClinicalNotesShortVoCollection createClinicalNotesShortVoCollectionFromClinicalNotes(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.ClinicalNotesShortVoCollection voList = new ims.core.vo.ClinicalNotesShortVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.ClinicalNotes domainObject = (ims.core.clinical.domain.objects.ClinicalNotes) iterator.next();
			ims.core.vo.ClinicalNotesShortVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.ClinicalNotes objects.
	 */
	public static ims.core.vo.ClinicalNotesShortVoCollection createClinicalNotesShortVoCollectionFromClinicalNotes(java.util.List domainObjectList) 
	{
		return createClinicalNotesShortVoCollectionFromClinicalNotes(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.ClinicalNotes objects.
	 */
	public static ims.core.vo.ClinicalNotesShortVoCollection createClinicalNotesShortVoCollectionFromClinicalNotes(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.ClinicalNotesShortVoCollection voList = new ims.core.vo.ClinicalNotesShortVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.ClinicalNotes domainObject = (ims.core.clinical.domain.objects.ClinicalNotes) domainObjectList.get(i);
			ims.core.vo.ClinicalNotesShortVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.ClinicalNotes set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractClinicalNotesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ClinicalNotesShortVoCollection voCollection) 
	 {
	 	return extractClinicalNotesSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractClinicalNotesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ClinicalNotesShortVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.ClinicalNotesShortVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.ClinicalNotes domainObject = ClinicalNotesShortVoAssembler.extractClinicalNotes(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.ClinicalNotes list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractClinicalNotesList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ClinicalNotesShortVoCollection voCollection) 
	 {
	 	return extractClinicalNotesList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractClinicalNotesList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ClinicalNotesShortVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.ClinicalNotesShortVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.ClinicalNotes domainObject = ClinicalNotesShortVoAssembler.extractClinicalNotes(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.ClinicalNotes object.
	 * @param domainObject ims.core.clinical.domain.objects.ClinicalNotes
	 */
	 public static ims.core.vo.ClinicalNotesShortVo create(ims.core.clinical.domain.objects.ClinicalNotes domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.ClinicalNotes object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.ClinicalNotesShortVo create(DomainObjectMap map, ims.core.clinical.domain.objects.ClinicalNotes domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.ClinicalNotesShortVo valueObject = (ims.core.vo.ClinicalNotesShortVo) map.getValueObject(domainObject, ims.core.vo.ClinicalNotesShortVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.ClinicalNotesShortVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.ClinicalNotes
	 */
	 public static ims.core.vo.ClinicalNotesShortVo insert(ims.core.vo.ClinicalNotesShortVo valueObject, ims.core.clinical.domain.objects.ClinicalNotes domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.ClinicalNotes
	 */
	 public static ims.core.vo.ClinicalNotesShortVo insert(DomainObjectMap map, ims.core.vo.ClinicalNotesShortVo valueObject, ims.core.clinical.domain.objects.ClinicalNotes domainObject) 
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
			
		// CareContext
		valueObject.setCareContext(ims.core.vo.domain.CareContextListVoAssembler.create(map, domainObject.getCareContext()) );
		// NoteClassification
		ims.domain.lookups.LookupInstance instance2 = domainObject.getNoteClassification();
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

			ims.clinical.vo.lookups.ClinicalNoteClassification voLookup2 = new ims.clinical.vo.lookups.ClinicalNoteClassification(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.clinical.vo.lookups.ClinicalNoteClassification parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.clinical.vo.lookups.ClinicalNoteClassification(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setNoteClassification(voLookup2);
		}
				// NoteType
		ims.domain.lookups.LookupInstance instance3 = domainObject.getNoteType();
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

			ims.core.vo.lookups.ClinicalNoteType voLookup3 = new ims.core.vo.lookups.ClinicalNoteType(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.ClinicalNoteType parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.ClinicalNoteType(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setNoteType(voLookup3);
		}
				// Discipline
		ims.domain.lookups.LookupInstance instance4 = domainObject.getDiscipline();
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

			ims.core.vo.lookups.HcpDisType voLookup4 = new ims.core.vo.lookups.HcpDisType(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.HcpDisType parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.HcpDisType(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setDiscipline(voLookup4);
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
		ims.domain.lookups.LookupInstance instance9 = domainObject.getForReviewDiscipline();
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

			ims.core.vo.lookups.HcpDisType voLookup9 = new ims.core.vo.lookups.HcpDisType(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.HcpDisType parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.core.vo.lookups.HcpDisType(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setForReviewDiscipline(voLookup9);
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
		ims.domain.lookups.LookupInstance instance15 = domainObject.getSourceOfNote();
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

			ims.core.vo.lookups.SourceOfNote voLookup15 = new ims.core.vo.lookups.SourceOfNote(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.core.vo.lookups.SourceOfNote parentVoLookup15 = voLookup15;
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
								parentVoLookup15.setParent(new ims.core.vo.lookups.SourceOfNote(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setSourceOfNote(voLookup15);
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
	public static ims.core.clinical.domain.objects.ClinicalNotes extractClinicalNotes(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ClinicalNotesShortVo valueObject) 
	{
		return 	extractClinicalNotes(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.ClinicalNotes extractClinicalNotes(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ClinicalNotesShortVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ClinicalNotes();
		ims.core.clinical.domain.objects.ClinicalNotes domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.ClinicalNotes)domMap.get(valueObject);
			}
			// ims.core.vo.ClinicalNotesShortVo ID_ClinicalNotes field is unknown
			domainObject = new ims.core.clinical.domain.objects.ClinicalNotes();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ClinicalNotes());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.ClinicalNotes)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.ClinicalNotes) domainFactory.getDomainObject(ims.core.clinical.domain.objects.ClinicalNotes.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ClinicalNotes());

		domainObject.setCareContext(ims.core.vo.domain.CareContextListVoAssembler.extractCareContext(domainFactory, valueObject.getCareContext(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getNoteClassification() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getNoteClassification().getID());
		}
		domainObject.setNoteClassification(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getNoteType() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getNoteType().getID());
		}
		domainObject.setNoteType(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getDiscipline() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getDiscipline().getID());
		}
		domainObject.setDiscipline(value4);
		ims.core.admin.domain.objects.ClinicalContact value5 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value5 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value5 = domainObject.getClinicalContact();	
			}
			else
			{
				value5 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value5);
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInfo(), domMap));
		domainObject.setIsDerivedNote(valueObject.getIsDerivedNote());
		domainObject.setForReview(valueObject.getForReview());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getForReviewDiscipline() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getForReviewDiscipline().getID());
		}
		domainObject.setForReviewDiscipline(value9);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value10 = null;
		if ( null != valueObject.getReviewingHCP() ) 
		{
			if (valueObject.getReviewingHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getReviewingHCP()) != null)
				{
					value10 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getReviewingHCP());
				}
			}
			else
			{
				value10 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getReviewingHCP().getBoId());
			}
		}
		domainObject.setReviewingHCP(value10);
		ims.framework.utils.DateTime dateTime11 = valueObject.getReviewingDateTime();
		java.util.Date value11 = null;
		if ( dateTime11 != null ) 
		{
			value11 = dateTime11.getJavaDate();
		}
		domainObject.setReviewingDateTime(value11);
		domainObject.setCurrentStatus(ims.core.vo.domain.ClinicalNoteStatusVoAssembler.extractClinicalNoteNoteStatus(domainFactory, valueObject.getCurrentStatus(), domMap));
		domainObject.setIsCorrected(valueObject.getIsCorrected());
		domainObject.setIsTranscribed(valueObject.getIsTranscribed());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getSourceOfNote() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getSourceOfNote().getID());
		}
		domainObject.setSourceOfNote(value15);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value16 = null;
		if ( null != valueObject.getRecordingUser() ) 
		{
			if (valueObject.getRecordingUser().getBoId() == null)
			{
				if (domMap.get(valueObject.getRecordingUser()) != null)
				{
					value16 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getRecordingUser());
				}
			}
			else
			{
				value16 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getRecordingUser().getBoId());
			}
		}
		domainObject.setRecordingUser(value16);
		ims.framework.utils.DateTime dateTime17 = valueObject.getRecordingDateTime();
		java.util.Date value17 = null;
		if ( dateTime17 != null ) 
		{
			value17 = dateTime17.getJavaDate();
		}
		domainObject.setRecordingDateTime(value17);
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
