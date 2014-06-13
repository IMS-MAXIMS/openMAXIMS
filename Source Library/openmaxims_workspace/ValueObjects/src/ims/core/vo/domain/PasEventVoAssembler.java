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
 * @author John MacEnri
 */
public class PasEventVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PasEventVo copy(ims.core.vo.PasEventVo valueObjectDest, ims.core.vo.PasEventVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PASEvent(valueObjectSrc.getID_PASEvent());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// sourceOfReferral
		valueObjectDest.setSourceOfReferral(valueObjectSrc.getSourceOfReferral());
		// isVip
		valueObjectDest.setIsVip(valueObjectSrc.getIsVip());
		// referringGP
		valueObjectDest.setReferringGP(valueObjectSrc.getReferringGP());
		// referringGpSurgery
		valueObjectDest.setReferringGpSurgery(valueObjectSrc.getReferringGpSurgery());
		// CspDocumentStatus
		valueObjectDest.setCspDocumentStatus(valueObjectSrc.getCspDocumentStatus());
		// PASSpecialty
		valueObjectDest.setPASSpecialty(valueObjectSrc.getPASSpecialty());
		// AttendingHCP
		valueObjectDest.setAttendingHCP(valueObjectSrc.getAttendingHCP());
		// patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// Specialty
		valueObjectDest.setSpecialty(valueObjectSrc.getSpecialty());
		// Location
		valueObjectDest.setLocation(valueObjectSrc.getLocation());
		// EpisodeFinancialClass
		valueObjectDest.setEpisodeFinancialClass(valueObjectSrc.getEpisodeFinancialClass());
		// eventDateTime
		valueObjectDest.setEventDateTime(valueObjectSrc.getEventDateTime());
		// pasEventId
		valueObjectDest.setPasEventId(valueObjectSrc.getPasEventId());
		// Consultant
		valueObjectDest.setConsultant(valueObjectSrc.getConsultant());
		// EventType
		valueObjectDest.setEventType(valueObjectSrc.getEventType());
		// pasEpisodeId
		valueObjectDest.setPasEpisodeId(valueObjectSrc.getPasEpisodeId());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPasEventVoCollectionFromPASEvent(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.PASEvent objects.
	 */
	public static ims.core.vo.PasEventVoCollection createPasEventVoCollectionFromPASEvent(java.util.Set domainObjectSet)	
	{
		return createPasEventVoCollectionFromPASEvent(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.PASEvent objects.
	 */
	public static ims.core.vo.PasEventVoCollection createPasEventVoCollectionFromPASEvent(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PasEventVoCollection voList = new ims.core.vo.PasEventVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.pas.domain.objects.PASEvent domainObject = (ims.core.admin.pas.domain.objects.PASEvent) iterator.next();
			ims.core.vo.PasEventVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.PASEvent objects.
	 */
	public static ims.core.vo.PasEventVoCollection createPasEventVoCollectionFromPASEvent(java.util.List domainObjectList) 
	{
		return createPasEventVoCollectionFromPASEvent(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.PASEvent objects.
	 */
	public static ims.core.vo.PasEventVoCollection createPasEventVoCollectionFromPASEvent(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PasEventVoCollection voList = new ims.core.vo.PasEventVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.PASEvent domainObject = (ims.core.admin.pas.domain.objects.PASEvent) domainObjectList.get(i);
			ims.core.vo.PasEventVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.pas.domain.objects.PASEvent set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPASEventSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PasEventVoCollection voCollection) 
	 {
	 	return extractPASEventSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPASEventSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PasEventVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PasEventVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.PASEvent domainObject = PasEventVoAssembler.extractPASEvent(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.pas.domain.objects.PASEvent list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPASEventList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PasEventVoCollection voCollection) 
	 {
	 	return extractPASEventList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPASEventList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PasEventVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PasEventVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.PASEvent domainObject = PasEventVoAssembler.extractPASEvent(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.pas.domain.objects.PASEvent object.
	 * @param domainObject ims.core.admin.pas.domain.objects.PASEvent
	 */
	 public static ims.core.vo.PasEventVo create(ims.core.admin.pas.domain.objects.PASEvent domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.pas.domain.objects.PASEvent object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PasEventVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.PASEvent domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PasEventVo valueObject = (ims.core.vo.PasEventVo) map.getValueObject(domainObject, ims.core.vo.PasEventVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PasEventVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.pas.domain.objects.PASEvent
	 */
	 public static ims.core.vo.PasEventVo insert(ims.core.vo.PasEventVo valueObject, ims.core.admin.pas.domain.objects.PASEvent domainObject) 
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
	 * @param domainObject ims.core.admin.pas.domain.objects.PASEvent
	 */
	 public static ims.core.vo.PasEventVo insert(DomainObjectMap map, ims.core.vo.PasEventVo valueObject, ims.core.admin.pas.domain.objects.PASEvent domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PASEvent(domainObject.getId());
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
			
		// sourceOfReferral
		ims.domain.lookups.LookupInstance instance1 = domainObject.getSourceOfReferral();
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

			ims.core.vo.lookups.SourceOfReferral voLookup1 = new ims.core.vo.lookups.SourceOfReferral(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.SourceOfReferral parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.core.vo.lookups.SourceOfReferral(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setSourceOfReferral(voLookup1);
		}
				// isVip
		valueObject.setIsVip( domainObject.isIsVip() );
		// referringGP
		valueObject.setReferringGP(ims.core.vo.domain.GpLiteVoAssembler.create(map, domainObject.getReferringGP()) );
		// referringGpSurgery
		valueObject.setReferringGpSurgery(ims.core.vo.domain.LocSiteShortVoAssembler.create(map, domainObject.getReferringGpSurgery()) );
		// CspDocumentStatus
		ims.domain.lookups.LookupInstance instance5 = domainObject.getCspDocumentStatus();
		if ( null != instance5 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance5.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance5.getImage().getImageId(), instance5.getImage().getImagePath());
			}
			color = instance5.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.DocumentStatus voLookup5 = new ims.core.vo.lookups.DocumentStatus(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.DocumentStatus parentVoLookup5 = voLookup5;
			ims.domain.lookups.LookupInstance parent5 = instance5.getParent();
			while (parent5 != null)
			{
				if (parent5.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent5.getImage().getImageId(), parent5.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent5.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup5.setParent(new ims.core.vo.lookups.DocumentStatus(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setCspDocumentStatus(voLookup5);
		}
				// PASSpecialty
		ims.domain.lookups.LookupInstance instance6 = domainObject.getPASSpecialty();
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

			ims.core.vo.lookups.PASSpecialty voLookup6 = new ims.core.vo.lookups.PASSpecialty(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.PASSpecialty parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.PASSpecialty(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setPASSpecialty(voLookup6);
		}
				// AttendingHCP
		valueObject.setAttendingHCP(ims.core.vo.domain.HcpMinVoAssembler.create(map, domainObject.getAttendingHCP()) );
		// patient
		valueObject.setPatient(ims.core.vo.domain.PatientShortAssembler.create(map, domainObject.getPatient()) );
		// Specialty
		ims.domain.lookups.LookupInstance instance9 = domainObject.getSpecialty();
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

			ims.core.vo.lookups.Specialty voLookup9 = new ims.core.vo.lookups.Specialty(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.core.vo.lookups.Specialty(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setSpecialty(voLookup9);
		}
				// Location
		valueObject.setLocation(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getLocation()) );
		// EpisodeFinancialClass
		ims.domain.lookups.LookupInstance instance11 = domainObject.getEpisodeFinancialClass();
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

			ims.ocrr.vo.lookups.OrderCategory voLookup11 = new ims.ocrr.vo.lookups.OrderCategory(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.ocrr.vo.lookups.OrderCategory parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.ocrr.vo.lookups.OrderCategory(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setEpisodeFinancialClass(voLookup11);
		}
				// eventDateTime
		java.util.Date eventDateTime = domainObject.getEventDateTime();
		if ( null != eventDateTime ) 
		{
			valueObject.setEventDateTime(new ims.framework.utils.DateTime(eventDateTime) );
		}
		// pasEventId
		valueObject.setPasEventId(domainObject.getPasEventId());
		// Consultant
		valueObject.setConsultant(ims.core.vo.domain.MedicWithMappingsLiteVoAssembler.create(map, domainObject.getConsultant()) );
		// EventType
		ims.domain.lookups.LookupInstance instance15 = domainObject.getEventType();
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

			ims.core.vo.lookups.PasEventType voLookup15 = new ims.core.vo.lookups.PasEventType(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.core.vo.lookups.PasEventType parentVoLookup15 = voLookup15;
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
								parentVoLookup15.setParent(new ims.core.vo.lookups.PasEventType(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setEventType(voLookup15);
		}
				// pasEpisodeId
		valueObject.setPasEpisodeId(domainObject.getPasEpisodeId());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.pas.domain.objects.PASEvent extractPASEvent(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PasEventVo valueObject) 
	{
		return 	extractPASEvent(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.PASEvent extractPASEvent(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PasEventVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PASEvent();
		ims.core.admin.pas.domain.objects.PASEvent domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.pas.domain.objects.PASEvent)domMap.get(valueObject);
			}
			// ims.core.vo.PasEventVo ID_PASEvent field is unknown
			domainObject = new ims.core.admin.pas.domain.objects.PASEvent();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PASEvent());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.pas.domain.objects.PASEvent)domMap.get(key);
			}
			domainObject = (ims.core.admin.pas.domain.objects.PASEvent) domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.PASEvent.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PASEvent());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getSourceOfReferral() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getSourceOfReferral().getID());
		}
		domainObject.setSourceOfReferral(value1);
		domainObject.setIsVip(valueObject.getIsVip());
		domainObject.setReferringGP(ims.core.vo.domain.GpLiteVoAssembler.extractGp(domainFactory, valueObject.getReferringGP(), domMap));
		domainObject.setReferringGpSurgery(ims.core.vo.domain.LocSiteShortVoAssembler.extractLocSite(domainFactory, valueObject.getReferringGpSurgery(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getCspDocumentStatus() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getCspDocumentStatus().getID());
		}
		domainObject.setCspDocumentStatus(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getPASSpecialty() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getPASSpecialty().getID());
		}
		domainObject.setPASSpecialty(value6);
		domainObject.setAttendingHCP(ims.core.vo.domain.HcpMinVoAssembler.extractHcp(domainFactory, valueObject.getAttendingHCP(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.patient.domain.objects.Patient value8 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value8 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else
			{
				value8 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value9);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value10 = null;
		if ( null != valueObject.getLocation() ) 
		{
			if (valueObject.getLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getLocation()) != null)
				{
					value10 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getLocation());
				}
			}
			else
			{
				value10 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getLocation().getBoId());
			}
		}
		domainObject.setLocation(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getEpisodeFinancialClass() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getEpisodeFinancialClass().getID());
		}
		domainObject.setEpisodeFinancialClass(value11);
		ims.framework.utils.DateTime dateTime12 = valueObject.getEventDateTime();
		java.util.Date value12 = null;
		if ( dateTime12 != null ) 
		{
			value12 = dateTime12.getJavaDate();
		}
		domainObject.setEventDateTime(value12);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPasEventId() != null && valueObject.getPasEventId().equals(""))
		{
			valueObject.setPasEventId(null);
		}
		domainObject.setPasEventId(valueObject.getPasEventId());
		domainObject.setConsultant(ims.core.vo.domain.MedicWithMappingsLiteVoAssembler.extractMedic(domainFactory, valueObject.getConsultant(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getEventType() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getEventType().getID());
		}
		domainObject.setEventType(value15);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPasEpisodeId() != null && valueObject.getPasEpisodeId().equals(""))
		{
			valueObject.setPasEpisodeId(null);
		}
		domainObject.setPasEpisodeId(valueObject.getPasEpisodeId());

		return domainObject;
	}

}
