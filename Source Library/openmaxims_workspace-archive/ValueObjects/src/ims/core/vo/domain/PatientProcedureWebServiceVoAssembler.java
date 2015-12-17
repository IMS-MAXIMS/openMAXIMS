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
 * @author Marius Mihalec
 */
public class PatientProcedureWebServiceVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PatientProcedureWebServiceVo copy(ims.core.vo.PatientProcedureWebServiceVo valueObjectDest, ims.core.vo.PatientProcedureWebServiceVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientProcedure(valueObjectSrc.getID_PatientProcedure());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// SiteText
		valueObjectDest.setSiteText(valueObjectSrc.getSiteText());
		// ProcedureOutcome
		valueObjectDest.setProcedureOutcome(valueObjectSrc.getProcedureOutcome());
		// PeformedBy
		valueObjectDest.setPeformedBy(valueObjectSrc.getPeformedBy());
		// SurgeonsGrade
		valueObjectDest.setSurgeonsGrade(valueObjectSrc.getSurgeonsGrade());
		// Location
		valueObjectDest.setLocation(valueObjectSrc.getLocation());
		// Specialty
		valueObjectDest.setSpecialty(valueObjectSrc.getSpecialty());
		// InfoSource
		valueObjectDest.setInfoSource(valueObjectSrc.getInfoSource());
		// ConfirmedStatus
		valueObjectDest.setConfirmedStatus(valueObjectSrc.getConfirmedStatus());
		// ConfirmedBy
		valueObjectDest.setConfirmedBy(valueObjectSrc.getConfirmedBy());
		// ConfirmedDateTime
		valueObjectDest.setConfirmedDateTime(valueObjectSrc.getConfirmedDateTime());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// ProcSite
		valueObjectDest.setProcSite(valueObjectSrc.getProcSite());
		// ProcLaterality
		valueObjectDest.setProcLaterality(valueObjectSrc.getProcLaterality());
		// ProcDate
		valueObjectDest.setProcDate(valueObjectSrc.getProcDate());
		// ProcTime
		valueObjectDest.setProcTime(valueObjectSrc.getProcTime());
		// CancelledDate
		valueObjectDest.setCancelledDate(valueObjectSrc.getCancelledDate());
		// CancelledReason
		valueObjectDest.setCancelledReason(valueObjectSrc.getCancelledReason());
		// Notes
		valueObjectDest.setNotes(valueObjectSrc.getNotes());
		// HCPPresent
		valueObjectDest.setHCPPresent(valueObjectSrc.getHCPPresent());
		// ProcEndDate
		valueObjectDest.setProcEndDate(valueObjectSrc.getProcEndDate());
		// ProcEndTime
		valueObjectDest.setProcEndTime(valueObjectSrc.getProcEndTime());
		// ProcedureIntent
		valueObjectDest.setProcedureIntent(valueObjectSrc.getProcedureIntent());
		// UniqueLineRefNo
		valueObjectDest.setUniqueLineRefNo(valueObjectSrc.getUniqueLineRefNo());
		// PlannedProc
		valueObjectDest.setPlannedProc(valueObjectSrc.getPlannedProc());
		// Procedure
		valueObjectDest.setProcedure(valueObjectSrc.getProcedure());
		// ProcedureDescription
		valueObjectDest.setProcedureDescription(valueObjectSrc.getProcedureDescription());
		// ProcedureStatus
		valueObjectDest.setProcedureStatus(valueObjectSrc.getProcedureStatus());
		// DatePlanned
		valueObjectDest.setDatePlanned(valueObjectSrc.getDatePlanned());
		// ProcedureUrgency
		valueObjectDest.setProcedureUrgency(valueObjectSrc.getProcedureUrgency());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientProcedureWebServiceVoCollectionFromPatientProcedure(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientProcedure objects.
	 */
	public static ims.core.vo.PatientProcedureWebServiceVoCollection createPatientProcedureWebServiceVoCollectionFromPatientProcedure(java.util.Set domainObjectSet)	
	{
		return createPatientProcedureWebServiceVoCollectionFromPatientProcedure(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientProcedure objects.
	 */
	public static ims.core.vo.PatientProcedureWebServiceVoCollection createPatientProcedureWebServiceVoCollectionFromPatientProcedure(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatientProcedureWebServiceVoCollection voList = new ims.core.vo.PatientProcedureWebServiceVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.PatientProcedure domainObject = (ims.core.clinical.domain.objects.PatientProcedure) iterator.next();
			ims.core.vo.PatientProcedureWebServiceVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientProcedure objects.
	 */
	public static ims.core.vo.PatientProcedureWebServiceVoCollection createPatientProcedureWebServiceVoCollectionFromPatientProcedure(java.util.List domainObjectList) 
	{
		return createPatientProcedureWebServiceVoCollectionFromPatientProcedure(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientProcedure objects.
	 */
	public static ims.core.vo.PatientProcedureWebServiceVoCollection createPatientProcedureWebServiceVoCollectionFromPatientProcedure(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatientProcedureWebServiceVoCollection voList = new ims.core.vo.PatientProcedureWebServiceVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.PatientProcedure domainObject = (ims.core.clinical.domain.objects.PatientProcedure) domainObjectList.get(i);
			ims.core.vo.PatientProcedureWebServiceVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.PatientProcedure set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientProcedureSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientProcedureWebServiceVoCollection voCollection) 
	 {
	 	return extractPatientProcedureSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientProcedureSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientProcedureWebServiceVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientProcedureWebServiceVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientProcedure domainObject = PatientProcedureWebServiceVoAssembler.extractPatientProcedure(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.PatientProcedure list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientProcedureList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientProcedureWebServiceVoCollection voCollection) 
	 {
	 	return extractPatientProcedureList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientProcedureList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientProcedureWebServiceVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientProcedureWebServiceVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientProcedure domainObject = PatientProcedureWebServiceVoAssembler.extractPatientProcedure(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.PatientProcedure object.
	 * @param domainObject ims.core.clinical.domain.objects.PatientProcedure
	 */
	 public static ims.core.vo.PatientProcedureWebServiceVo create(ims.core.clinical.domain.objects.PatientProcedure domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.PatientProcedure object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PatientProcedureWebServiceVo create(DomainObjectMap map, ims.core.clinical.domain.objects.PatientProcedure domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PatientProcedureWebServiceVo valueObject = (ims.core.vo.PatientProcedureWebServiceVo) map.getValueObject(domainObject, ims.core.vo.PatientProcedureWebServiceVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PatientProcedureWebServiceVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.PatientProcedure
	 */
	 public static ims.core.vo.PatientProcedureWebServiceVo insert(ims.core.vo.PatientProcedureWebServiceVo valueObject, ims.core.clinical.domain.objects.PatientProcedure domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.PatientProcedure
	 */
	 public static ims.core.vo.PatientProcedureWebServiceVo insert(DomainObjectMap map, ims.core.vo.PatientProcedureWebServiceVo valueObject, ims.core.clinical.domain.objects.PatientProcedure domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientProcedure(domainObject.getId());
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
			
		// SiteText
		valueObject.setSiteText(domainObject.getSiteText());
		// ProcedureOutcome
		ims.domain.lookups.LookupInstance instance2 = domainObject.getProcedureOutcome();
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

			ims.clinical.vo.lookups.PatientProcedureOutcome voLookup2 = new ims.clinical.vo.lookups.PatientProcedureOutcome(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.clinical.vo.lookups.PatientProcedureOutcome parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.clinical.vo.lookups.PatientProcedureOutcome(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setProcedureOutcome(voLookup2);
		}
				// PeformedBy
		valueObject.setPeformedBy(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getPeformedBy()) );
		// SurgeonsGrade
		ims.domain.lookups.LookupInstance instance4 = domainObject.getSurgeonsGrade();
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

			ims.core.vo.lookups.MedicGrade voLookup4 = new ims.core.vo.lookups.MedicGrade(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.MedicGrade parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.MedicGrade(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setSurgeonsGrade(voLookup4);
		}
				// Location
		valueObject.setLocation(domainObject.getLocation());
		// Specialty
		ims.domain.lookups.LookupInstance instance6 = domainObject.getSpecialty();
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

			ims.core.vo.lookups.Specialty voLookup6 = new ims.core.vo.lookups.Specialty(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.Specialty(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setSpecialty(voLookup6);
		}
				// InfoSource
		ims.domain.lookups.LookupInstance instance7 = domainObject.getInfoSource();
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

			ims.core.vo.lookups.SourceofInformation voLookup7 = new ims.core.vo.lookups.SourceofInformation(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.SourceofInformation parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.core.vo.lookups.SourceofInformation(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setInfoSource(voLookup7);
		}
				// ConfirmedStatus
		ims.domain.lookups.LookupInstance instance8 = domainObject.getConfirmedStatus();
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

			ims.core.vo.lookups.ConfirmedStatus voLookup8 = new ims.core.vo.lookups.ConfirmedStatus(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.ConfirmedStatus parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.ConfirmedStatus(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setConfirmedStatus(voLookup8);
		}
				// ConfirmedBy
		valueObject.setConfirmedBy(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getConfirmedBy()) );
		// ConfirmedDateTime
		java.util.Date ConfirmedDateTime = domainObject.getConfirmedDateTime();
		if ( null != ConfirmedDateTime ) 
		{
			valueObject.setConfirmedDateTime(new ims.framework.utils.DateTime(ConfirmedDateTime) );
		}
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// ProcSite
		ims.domain.lookups.LookupInstance instance12 = domainObject.getProcSite();
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

			ims.core.vo.lookups.MedicalHistoryProcedureSite voLookup12 = new ims.core.vo.lookups.MedicalHistoryProcedureSite(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.core.vo.lookups.MedicalHistoryProcedureSite parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.core.vo.lookups.MedicalHistoryProcedureSite(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setProcSite(voLookup12);
		}
				// ProcLaterality
		ims.domain.lookups.LookupInstance instance13 = domainObject.getProcLaterality();
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

			ims.core.vo.lookups.LateralityLRB voLookup13 = new ims.core.vo.lookups.LateralityLRB(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.core.vo.lookups.LateralityLRB parentVoLookup13 = voLookup13;
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
								parentVoLookup13.setParent(new ims.core.vo.lookups.LateralityLRB(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setProcLaterality(voLookup13);
		}
				// ProcDate
		Integer ProcDate = domainObject.getProcDate();
		if ( null != ProcDate ) 
		{
			valueObject.setProcDate(new ims.framework.utils.PartialDate(ProcDate) );
		}
		// ProcTime
		String ProcTime = domainObject.getProcTime();
		if ( null != ProcTime ) 
		{
			valueObject.setProcTime(new ims.framework.utils.Time(ProcTime) );
		}
		// CancelledDate
		java.util.Date CancelledDate = domainObject.getCancelledDate();
		if ( null != CancelledDate ) 
		{
			valueObject.setCancelledDate(new ims.framework.utils.Date(CancelledDate) );
		}
		// CancelledReason
		valueObject.setCancelledReason(domainObject.getCancelledReason());
		// Notes
		valueObject.setNotes(domainObject.getNotes());
		// HCPPresent
		valueObject.setHCPPresent(ims.core.vo.domain.HcpLiteVoAssembler.createHcpLiteVoCollectionFromHcp(map, domainObject.getHCPPresent()) );
		// ProcEndDate
		Integer ProcEndDate = domainObject.getProcEndDate();
		if ( null != ProcEndDate ) 
		{
			valueObject.setProcEndDate(new ims.framework.utils.PartialDate(ProcEndDate) );
		}
		// ProcEndTime
		String ProcEndTime = domainObject.getProcEndTime();
		if ( null != ProcEndTime ) 
		{
			valueObject.setProcEndTime(new ims.framework.utils.Time(ProcEndTime) );
		}
		// ProcedureIntent
		ims.domain.lookups.LookupInstance instance22 = domainObject.getProcedureIntent();
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

			ims.core.vo.lookups.ProcedureIntent voLookup22 = new ims.core.vo.lookups.ProcedureIntent(instance22.getId(),instance22.getText(), instance22.isActive(), null, img, color);
			ims.core.vo.lookups.ProcedureIntent parentVoLookup22 = voLookup22;
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
								parentVoLookup22.setParent(new ims.core.vo.lookups.ProcedureIntent(parent22.getId(),parent22.getText(), parent22.isActive(), null, img, color));
				parentVoLookup22 = parentVoLookup22.getParent();
								parent22 = parent22.getParent();
			}			
			valueObject.setProcedureIntent(voLookup22);
		}
				// UniqueLineRefNo
		valueObject.setUniqueLineRefNo(domainObject.getUniqueLineRefNo());
		// PlannedProc
		if (domainObject.getPlannedProc() != null)
		{
			if(domainObject.getPlannedProc() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPlannedProc();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPlannedProc(new ims.core.clinical.vo.PatientProcedureRefVo(id, -1));				
			}
			else
			{
				valueObject.setPlannedProc(new ims.core.clinical.vo.PatientProcedureRefVo(domainObject.getPlannedProc().getId(), domainObject.getPlannedProc().getVersion()));
			}
		}
		// Procedure
		valueObject.setProcedure(ims.core.vo.domain.ProcedureLiteVoAssembler.create(map, domainObject.getProcedure()) );
		// ProcedureDescription
		valueObject.setProcedureDescription(domainObject.getProcedureDescription());
		// ProcedureStatus
		ims.domain.lookups.LookupInstance instance27 = domainObject.getProcedureStatus();
		if ( null != instance27 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance27.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance27.getImage().getImageId(), instance27.getImage().getImagePath());
			}
			color = instance27.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PatientProcedureStatus voLookup27 = new ims.core.vo.lookups.PatientProcedureStatus(instance27.getId(),instance27.getText(), instance27.isActive(), null, img, color);
			ims.core.vo.lookups.PatientProcedureStatus parentVoLookup27 = voLookup27;
			ims.domain.lookups.LookupInstance parent27 = instance27.getParent();
			while (parent27 != null)
			{
				if (parent27.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent27.getImage().getImageId(), parent27.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent27.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup27.setParent(new ims.core.vo.lookups.PatientProcedureStatus(parent27.getId(),parent27.getText(), parent27.isActive(), null, img, color));
				parentVoLookup27 = parentVoLookup27.getParent();
								parent27 = parent27.getParent();
			}			
			valueObject.setProcedureStatus(voLookup27);
		}
				// DatePlanned
		Integer DatePlanned = domainObject.getDatePlanned();
		if ( null != DatePlanned ) 
		{
			valueObject.setDatePlanned(new ims.framework.utils.PartialDate(DatePlanned) );
		}
		// ProcedureUrgency
		ims.domain.lookups.LookupInstance instance29 = domainObject.getProcedureUrgency();
		if ( null != instance29 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance29.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance29.getImage().getImageId(), instance29.getImage().getImagePath());
			}
			color = instance29.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.ProcedureUrgency voLookup29 = new ims.core.vo.lookups.ProcedureUrgency(instance29.getId(),instance29.getText(), instance29.isActive(), null, img, color);
			ims.core.vo.lookups.ProcedureUrgency parentVoLookup29 = voLookup29;
			ims.domain.lookups.LookupInstance parent29 = instance29.getParent();
			while (parent29 != null)
			{
				if (parent29.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent29.getImage().getImageId(), parent29.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent29.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup29.setParent(new ims.core.vo.lookups.ProcedureUrgency(parent29.getId(),parent29.getText(), parent29.isActive(), null, img, color));
				parentVoLookup29 = parentVoLookup29.getParent();
								parent29 = parent29.getParent();
			}			
			valueObject.setProcedureUrgency(voLookup29);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.PatientProcedure extractPatientProcedure(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientProcedureWebServiceVo valueObject) 
	{
		return 	extractPatientProcedure(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.PatientProcedure extractPatientProcedure(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientProcedureWebServiceVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientProcedure();
		ims.core.clinical.domain.objects.PatientProcedure domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.PatientProcedure)domMap.get(valueObject);
			}
			// ims.core.vo.PatientProcedureWebServiceVo ID_PatientProcedure field is unknown
			domainObject = new ims.core.clinical.domain.objects.PatientProcedure();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientProcedure());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.PatientProcedure)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.PatientProcedure) domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientProcedure.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientProcedure());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSiteText() != null && valueObject.getSiteText().equals(""))
		{
			valueObject.setSiteText(null);
		}
		domainObject.setSiteText(valueObject.getSiteText());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getProcedureOutcome() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getProcedureOutcome().getID());
		}
		domainObject.setProcedureOutcome(value2);
		domainObject.setPeformedBy(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getPeformedBy(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getSurgeonsGrade() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getSurgeonsGrade().getID());
		}
		domainObject.setSurgeonsGrade(value4);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLocation() != null && valueObject.getLocation().equals(""))
		{
			valueObject.setLocation(null);
		}
		domainObject.setLocation(valueObject.getLocation());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getInfoSource() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getInfoSource().getID());
		}
		domainObject.setInfoSource(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getConfirmedStatus() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getConfirmedStatus().getID());
		}
		domainObject.setConfirmedStatus(value8);
		domainObject.setConfirmedBy(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getConfirmedBy(), domMap));
		ims.framework.utils.DateTime dateTime10 = valueObject.getConfirmedDateTime();
		java.util.Date value10 = null;
		if ( dateTime10 != null ) 
		{
			value10 = dateTime10.getJavaDate();
		}
		domainObject.setConfirmedDateTime(value10);
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getProcSite() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getProcSite().getID());
		}
		domainObject.setProcSite(value12);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getProcLaterality() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getProcLaterality().getID());
		}
		domainObject.setProcLaterality(value13);
		ims.framework.utils.PartialDate ProcDate = valueObject.getProcDate();
		Integer value14 = null;
		if ( null != ProcDate ) 
		{
			value14 = ProcDate.toInteger();
		}
		domainObject.setProcDate(value14);
		ims.framework.utils.Time time15 = valueObject.getProcTime();
		String value15 = null;
		if ( time15 != null ) 
		{
			value15 = time15.toString();
		}
		domainObject.setProcTime(value15);
		java.util.Date value16 = null;
		ims.framework.utils.Date date16 = valueObject.getCancelledDate();		
		if ( date16 != null ) 
		{
			value16 = date16.getDate();
		}
		domainObject.setCancelledDate(value16);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCancelledReason() != null && valueObject.getCancelledReason().equals(""))
		{
			valueObject.setCancelledReason(null);
		}
		domainObject.setCancelledReason(valueObject.getCancelledReason());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNotes() != null && valueObject.getNotes().equals(""))
		{
			valueObject.setNotes(null);
		}
		domainObject.setNotes(valueObject.getNotes());

		// SaveAsRefVO treated as RefValueObject
		ims.core.resource.people.vo.HcpRefVoCollection refCollection19 = new ims.core.resource.people.vo.HcpRefVoCollection();
		if (valueObject.getHCPPresent() != null)
		{
			for (int i19=0; i19<valueObject.getHCPPresent().size(); i19++)
			{
				ims.core.resource.people.vo.HcpRefVo ref19 = (ims.core.resource.people.vo.HcpRefVo)valueObject.getHCPPresent().get(i19);
				refCollection19.add(ref19);
			}
		}
		int size19 = (null == refCollection19) ? 0 : refCollection19.size();		
		java.util.Set domainHCPPresent19 = domainObject.getHCPPresent();
		if (domainHCPPresent19 == null)
		{
			domainHCPPresent19 = new java.util.HashSet();
		}
		java.util.Set newSet19  = new java.util.HashSet();
		for(int i=0; i<size19; i++) 
		{
			ims.core.resource.people.vo.HcpRefVo vo = refCollection19.get(i);					
			ims.core.resource.people.domain.objects.Hcp dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.resource.people.domain.objects.Hcp)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject( ims.core.resource.people.domain.objects.Hcp.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainHCPPresent19.contains(dom))
			{
				domainHCPPresent19.add(dom);
			}
			newSet19.add(dom);			
		}
		java.util.Set removedSet19 = new java.util.HashSet();
		java.util.Iterator iter19 = domainHCPPresent19.iterator();
		//Find out which objects need to be removed
		while (iter19.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter19.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet19.contains(o))
			{
				removedSet19.add(o);
			}
		}
		iter19 = removedSet19.iterator();
		//Remove the unwanted objects
		while (iter19.hasNext())
		{
			domainHCPPresent19.remove(iter19.next());
		}		
		
		domainObject.setHCPPresent(domainHCPPresent19);		
		ims.framework.utils.PartialDate ProcEndDate = valueObject.getProcEndDate();
		Integer value20 = null;
		if ( null != ProcEndDate ) 
		{
			value20 = ProcEndDate.toInteger();
		}
		domainObject.setProcEndDate(value20);
		ims.framework.utils.Time time21 = valueObject.getProcEndTime();
		String value21 = null;
		if ( time21 != null ) 
		{
			value21 = time21.toString();
		}
		domainObject.setProcEndTime(value21);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value22 = null;
		if ( null != valueObject.getProcedureIntent() ) 
		{
			value22 =
				domainFactory.getLookupInstance(valueObject.getProcedureIntent().getID());
		}
		domainObject.setProcedureIntent(value22);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getUniqueLineRefNo() != null && valueObject.getUniqueLineRefNo().equals(""))
		{
			valueObject.setUniqueLineRefNo(null);
		}
		domainObject.setUniqueLineRefNo(valueObject.getUniqueLineRefNo());
		ims.core.clinical.domain.objects.PatientProcedure value24 = null;
		if ( null != valueObject.getPlannedProc() ) 
		{
			if (valueObject.getPlannedProc().getBoId() == null)
			{
				if (domMap.get(valueObject.getPlannedProc()) != null)
				{
					value24 = (ims.core.clinical.domain.objects.PatientProcedure)domMap.get(valueObject.getPlannedProc());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value24 = domainObject.getPlannedProc();	
			}
			else
			{
				value24 = (ims.core.clinical.domain.objects.PatientProcedure)domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientProcedure.class, valueObject.getPlannedProc().getBoId());
			}
		}
		domainObject.setPlannedProc(value24);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Procedure value25 = null;
		if ( null != valueObject.getProcedure() ) 
		{
			if (valueObject.getProcedure().getBoId() == null)
			{
				if (domMap.get(valueObject.getProcedure()) != null)
				{
					value25 = (ims.core.clinical.domain.objects.Procedure)domMap.get(valueObject.getProcedure());
				}
			}
			else
			{
				value25 = (ims.core.clinical.domain.objects.Procedure)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Procedure.class, valueObject.getProcedure().getBoId());
			}
		}
		domainObject.setProcedure(value25);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getProcedureDescription() != null && valueObject.getProcedureDescription().equals(""))
		{
			valueObject.setProcedureDescription(null);
		}
		domainObject.setProcedureDescription(valueObject.getProcedureDescription());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value27 = null;
		if ( null != valueObject.getProcedureStatus() ) 
		{
			value27 =
				domainFactory.getLookupInstance(valueObject.getProcedureStatus().getID());
		}
		domainObject.setProcedureStatus(value27);
		ims.framework.utils.PartialDate DatePlanned = valueObject.getDatePlanned();
		Integer value28 = null;
		if ( null != DatePlanned ) 
		{
			value28 = DatePlanned.toInteger();
		}
		domainObject.setDatePlanned(value28);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value29 = null;
		if ( null != valueObject.getProcedureUrgency() ) 
		{
			value29 =
				domainFactory.getLookupInstance(valueObject.getProcedureUrgency().getID());
		}
		domainObject.setProcedureUrgency(value29);

		return domainObject;
	}

}
