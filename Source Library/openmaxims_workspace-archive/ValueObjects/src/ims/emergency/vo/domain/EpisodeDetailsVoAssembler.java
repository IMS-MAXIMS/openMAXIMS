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
package ims.emergency.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Neil McAnaspie
 */
public class EpisodeDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.EpisodeDetailsVo copy(ims.emergency.vo.EpisodeDetailsVo valueObjectDest, ims.emergency.vo.EpisodeDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_EmergencyEpisode(valueObjectSrc.getID_EmergencyEpisode());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// InjuryDateTime
		valueObjectDest.setInjuryDateTime(valueObjectSrc.getInjuryDateTime());
		// SourceOfReferral
		valueObjectDest.setSourceOfReferral(valueObjectSrc.getSourceOfReferral());
		// IncidentLocation
		valueObjectDest.setIncidentLocation(valueObjectSrc.getIncidentLocation());
		// LocationDetails
		valueObjectDest.setLocationDetails(valueObjectSrc.getLocationDetails());
		// ElapsedTime
		valueObjectDest.setElapsedTime(valueObjectSrc.getElapsedTime());
		// ElapsedPeriod
		valueObjectDest.setElapsedPeriod(valueObjectSrc.getElapsedPeriod());
		// Category
		valueObjectDest.setCategory(valueObjectSrc.getCategory());
		// Mobility
		valueObjectDest.setMobility(valueObjectSrc.getMobility());
		// ReferringGP
		valueObjectDest.setReferringGP(valueObjectSrc.getReferringGP());
		// PresentingComplaint
		valueObjectDest.setPresentingComplaint(valueObjectSrc.getPresentingComplaint());
		// EpisodeOfCare
		valueObjectDest.setEpisodeOfCare(valueObjectSrc.getEpisodeOfCare());
		// EmergencyAttendances
		valueObjectDest.setEmergencyAttendances(valueObjectSrc.getEmergencyAttendances());
		// School
		valueObjectDest.setSchool(valueObjectSrc.getSchool());
		// Occupation
		valueObjectDest.setOccupation(valueObjectSrc.getOccupation());
		// OccupationStatus
		valueObjectDest.setOccupationStatus(valueObjectSrc.getOccupationStatus());
		// PlaceofEmployment
		valueObjectDest.setPlaceofEmployment(valueObjectSrc.getPlaceofEmployment());
		// SpecialInterestDetails
		valueObjectDest.setSpecialInterestDetails(valueObjectSrc.getSpecialInterestDetails());
		// TriageCategoryType
		valueObjectDest.setTriageCategoryType(valueObjectSrc.getTriageCategoryType());
		// RTADetails
		valueObjectDest.setRTADetails(valueObjectSrc.getRTADetails());
		// Tiig
		valueObjectDest.setTiig(valueObjectSrc.getTiig());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// OtherReferral
		valueObjectDest.setOtherReferral(valueObjectSrc.getOtherReferral());
		// MedPatientConsent
		valueObjectDest.setMedPatientConsent(valueObjectSrc.getMedPatientConsent());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createEpisodeDetailsVoCollectionFromEmergencyEpisode(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.EmergencyEpisode objects.
	 */
	public static ims.emergency.vo.EpisodeDetailsVoCollection createEpisodeDetailsVoCollectionFromEmergencyEpisode(java.util.Set domainObjectSet)	
	{
		return createEpisodeDetailsVoCollectionFromEmergencyEpisode(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.EmergencyEpisode objects.
	 */
	public static ims.emergency.vo.EpisodeDetailsVoCollection createEpisodeDetailsVoCollectionFromEmergencyEpisode(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.EpisodeDetailsVoCollection voList = new ims.emergency.vo.EpisodeDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.domain.objects.EmergencyEpisode domainObject = (ims.core.admin.domain.objects.EmergencyEpisode) iterator.next();
			ims.emergency.vo.EpisodeDetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.domain.objects.EmergencyEpisode objects.
	 */
	public static ims.emergency.vo.EpisodeDetailsVoCollection createEpisodeDetailsVoCollectionFromEmergencyEpisode(java.util.List domainObjectList) 
	{
		return createEpisodeDetailsVoCollectionFromEmergencyEpisode(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.EmergencyEpisode objects.
	 */
	public static ims.emergency.vo.EpisodeDetailsVoCollection createEpisodeDetailsVoCollectionFromEmergencyEpisode(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.EpisodeDetailsVoCollection voList = new ims.emergency.vo.EpisodeDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.EmergencyEpisode domainObject = (ims.core.admin.domain.objects.EmergencyEpisode) domainObjectList.get(i);
			ims.emergency.vo.EpisodeDetailsVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.domain.objects.EmergencyEpisode set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractEmergencyEpisodeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EpisodeDetailsVoCollection voCollection) 
	 {
	 	return extractEmergencyEpisodeSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractEmergencyEpisodeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EpisodeDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.EpisodeDetailsVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.EmergencyEpisode domainObject = EpisodeDetailsVoAssembler.extractEmergencyEpisode(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.domain.objects.EmergencyEpisode list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractEmergencyEpisodeList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EpisodeDetailsVoCollection voCollection) 
	 {
	 	return extractEmergencyEpisodeList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractEmergencyEpisodeList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EpisodeDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.EpisodeDetailsVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.EmergencyEpisode domainObject = EpisodeDetailsVoAssembler.extractEmergencyEpisode(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.domain.objects.EmergencyEpisode object.
	 * @param domainObject ims.core.admin.domain.objects.EmergencyEpisode
	 */
	 public static ims.emergency.vo.EpisodeDetailsVo create(ims.core.admin.domain.objects.EmergencyEpisode domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.domain.objects.EmergencyEpisode object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.emergency.vo.EpisodeDetailsVo create(DomainObjectMap map, ims.core.admin.domain.objects.EmergencyEpisode domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.EpisodeDetailsVo valueObject = (ims.emergency.vo.EpisodeDetailsVo) map.getValueObject(domainObject, ims.emergency.vo.EpisodeDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.EpisodeDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.domain.objects.EmergencyEpisode
	 */
	 public static ims.emergency.vo.EpisodeDetailsVo insert(ims.emergency.vo.EpisodeDetailsVo valueObject, ims.core.admin.domain.objects.EmergencyEpisode domainObject) 
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
	 * @param domainObject ims.core.admin.domain.objects.EmergencyEpisode
	 */
	 public static ims.emergency.vo.EpisodeDetailsVo insert(DomainObjectMap map, ims.emergency.vo.EpisodeDetailsVo valueObject, ims.core.admin.domain.objects.EmergencyEpisode domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_EmergencyEpisode(domainObject.getId());
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
			
		// InjuryDateTime
		java.util.Date InjuryDateTime = domainObject.getInjuryDateTime();
		if ( null != InjuryDateTime ) 
		{
			valueObject.setInjuryDateTime(new ims.framework.utils.DateTime(InjuryDateTime) );
		}
		// SourceOfReferral
		ims.domain.lookups.LookupInstance instance2 = domainObject.getSourceOfReferral();
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

			ims.emergency.vo.lookups.ReferredBy voLookup2 = new ims.emergency.vo.lookups.ReferredBy(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.emergency.vo.lookups.ReferredBy parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.emergency.vo.lookups.ReferredBy(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setSourceOfReferral(voLookup2);
		}
				// IncidentLocation
		ims.domain.lookups.LookupInstance instance3 = domainObject.getIncidentLocation();
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

			ims.emergency.vo.lookups.IncidentLocation voLookup3 = new ims.emergency.vo.lookups.IncidentLocation(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.emergency.vo.lookups.IncidentLocation parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.emergency.vo.lookups.IncidentLocation(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setIncidentLocation(voLookup3);
		}
				// LocationDetails
		valueObject.setLocationDetails(domainObject.getLocationDetails());
		// ElapsedTime
		valueObject.setElapsedTime(domainObject.getElapsedTime());
		// ElapsedPeriod
		ims.domain.lookups.LookupInstance instance6 = domainObject.getElapsedPeriod();
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

			ims.emergency.vo.lookups.ElapsedInjuryPeriod voLookup6 = new ims.emergency.vo.lookups.ElapsedInjuryPeriod(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.emergency.vo.lookups.ElapsedInjuryPeriod parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.emergency.vo.lookups.ElapsedInjuryPeriod(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setElapsedPeriod(voLookup6);
		}
				// Category
		ims.domain.lookups.LookupInstance instance7 = domainObject.getCategory();
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

			ims.emergency.vo.lookups.PatientCategory voLookup7 = new ims.emergency.vo.lookups.PatientCategory(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.emergency.vo.lookups.PatientCategory parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.emergency.vo.lookups.PatientCategory(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setCategory(voLookup7);
		}
				// Mobility
		ims.domain.lookups.LookupInstance instance8 = domainObject.getMobility();
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

			ims.core.vo.lookups.PatientMobility voLookup8 = new ims.core.vo.lookups.PatientMobility(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.PatientMobility parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.PatientMobility(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setMobility(voLookup8);
		}
				// ReferringGP
		if (domainObject.getReferringGP() != null)
		{
			if(domainObject.getReferringGP() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getReferringGP();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setReferringGP(new ims.core.resource.people.vo.GpRefVo(id, -1));				
			}
			else
			{
				valueObject.setReferringGP(new ims.core.resource.people.vo.GpRefVo(domainObject.getReferringGP().getId(), domainObject.getReferringGP().getVersion()));
			}
		}
		// PresentingComplaint
		ims.domain.lookups.LookupInstance instance10 = domainObject.getPresentingComplaint();
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

			ims.emergency.vo.lookups.PresentingComplaint voLookup10 = new ims.emergency.vo.lookups.PresentingComplaint(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.emergency.vo.lookups.PresentingComplaint parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.emergency.vo.lookups.PresentingComplaint(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setPresentingComplaint(voLookup10);
		}
				// EpisodeOfCare
		if (domainObject.getEpisodeOfCare() != null)
		{
			if(domainObject.getEpisodeOfCare() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getEpisodeOfCare();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setEpisodeOfCare(new ims.core.admin.vo.EpisodeOfCareRefVo(id, -1));				
			}
			else
			{
				valueObject.setEpisodeOfCare(new ims.core.admin.vo.EpisodeOfCareRefVo(domainObject.getEpisodeOfCare().getId(), domainObject.getEpisodeOfCare().getVersion()));
			}
		}
		// EmergencyAttendances
		valueObject.setEmergencyAttendances(ims.emergency.vo.domain.AttendanceDetailsVoAssembler.createAttendanceDetailsVoCollectionFromEmergencyAttendance(map, domainObject.getEmergencyAttendances()) );
		// School
		ims.domain.lookups.LookupInstance instance13 = domainObject.getSchool();
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

			ims.emergency.vo.lookups.School voLookup13 = new ims.emergency.vo.lookups.School(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.emergency.vo.lookups.School parentVoLookup13 = voLookup13;
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
								parentVoLookup13.setParent(new ims.emergency.vo.lookups.School(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setSchool(voLookup13);
		}
				// Occupation
		ims.domain.lookups.LookupInstance instance14 = domainObject.getOccupation();
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

			ims.core.vo.lookups.Occupation voLookup14 = new ims.core.vo.lookups.Occupation(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.core.vo.lookups.Occupation parentVoLookup14 = voLookup14;
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
								parentVoLookup14.setParent(new ims.core.vo.lookups.Occupation(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setOccupation(voLookup14);
		}
				// OccupationStatus
		ims.domain.lookups.LookupInstance instance15 = domainObject.getOccupationStatus();
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

			ims.core.vo.lookups.OccupationStatus voLookup15 = new ims.core.vo.lookups.OccupationStatus(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.core.vo.lookups.OccupationStatus parentVoLookup15 = voLookup15;
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
								parentVoLookup15.setParent(new ims.core.vo.lookups.OccupationStatus(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setOccupationStatus(voLookup15);
		}
				// PlaceofEmployment
		valueObject.setPlaceofEmployment(domainObject.getPlaceofEmployment());
		// SpecialInterestDetails
		valueObject.setSpecialInterestDetails(ims.emergency.vo.domain.SpecialInterestDetailsVoAssembler.createSpecialInterestDetailsVoCollectionFromSpecialInterestDetail(map, domainObject.getSpecialInterestDetails()) );
		// TriageCategoryType
		ims.domain.lookups.LookupInstance instance18 = domainObject.getTriageCategoryType();
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

			ims.emergency.vo.lookups.TriageCategoryType voLookup18 = new ims.emergency.vo.lookups.TriageCategoryType(instance18.getId(),instance18.getText(), instance18.isActive(), null, img, color);
			ims.emergency.vo.lookups.TriageCategoryType parentVoLookup18 = voLookup18;
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
								parentVoLookup18.setParent(new ims.emergency.vo.lookups.TriageCategoryType(parent18.getId(),parent18.getText(), parent18.isActive(), null, img, color));
				parentVoLookup18 = parentVoLookup18.getParent();
								parent18 = parent18.getParent();
			}			
			valueObject.setTriageCategoryType(voLookup18);
		}
				// RTADetails
		valueObject.setRTADetails(ims.emergency.vo.domain.RTAVoAssembler.create(map, domainObject.getRTADetails()) );
		// Tiig
		valueObject.setTiig(ims.emergency.vo.domain.TIIGVoAssembler.create(map, domainObject.getTiig()) );
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
		// OtherReferral
		valueObject.setOtherReferral(domainObject.getOtherReferral());
		// MedPatientConsent
		valueObject.setMedPatientConsent( domainObject.isMedPatientConsent() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.EmergencyEpisode extractEmergencyEpisode(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EpisodeDetailsVo valueObject) 
	{
		return 	extractEmergencyEpisode(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.EmergencyEpisode extractEmergencyEpisode(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EpisodeDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_EmergencyEpisode();
		ims.core.admin.domain.objects.EmergencyEpisode domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.domain.objects.EmergencyEpisode)domMap.get(valueObject);
			}
			// ims.emergency.vo.EpisodeDetailsVo ID_EmergencyEpisode field is unknown
			domainObject = new ims.core.admin.domain.objects.EmergencyEpisode();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_EmergencyEpisode());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.domain.objects.EmergencyEpisode)domMap.get(key);
			}
			domainObject = (ims.core.admin.domain.objects.EmergencyEpisode) domainFactory.getDomainObject(ims.core.admin.domain.objects.EmergencyEpisode.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_EmergencyEpisode());

		ims.framework.utils.DateTime dateTime1 = valueObject.getInjuryDateTime();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setInjuryDateTime(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getSourceOfReferral() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getSourceOfReferral().getID());
		}
		domainObject.setSourceOfReferral(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getIncidentLocation() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getIncidentLocation().getID());
		}
		domainObject.setIncidentLocation(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLocationDetails() != null && valueObject.getLocationDetails().equals(""))
		{
			valueObject.setLocationDetails(null);
		}
		domainObject.setLocationDetails(valueObject.getLocationDetails());
		domainObject.setElapsedTime(valueObject.getElapsedTime());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getElapsedPeriod() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getElapsedPeriod().getID());
		}
		domainObject.setElapsedPeriod(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getCategory() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getCategory().getID());
		}
		domainObject.setCategory(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getMobility() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getMobility().getID());
		}
		domainObject.setMobility(value8);
		ims.core.resource.people.domain.objects.Gp value9 = null;
		if ( null != valueObject.getReferringGP() ) 
		{
			if (valueObject.getReferringGP().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferringGP()) != null)
				{
					value9 = (ims.core.resource.people.domain.objects.Gp)domMap.get(valueObject.getReferringGP());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value9 = domainObject.getReferringGP();	
			}
			else
			{
				value9 = (ims.core.resource.people.domain.objects.Gp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Gp.class, valueObject.getReferringGP().getBoId());
			}
		}
		domainObject.setReferringGP(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getPresentingComplaint() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getPresentingComplaint().getID());
		}
		domainObject.setPresentingComplaint(value10);
		ims.core.admin.domain.objects.EpisodeOfCare value11 = null;
		if ( null != valueObject.getEpisodeOfCare() ) 
		{
			if (valueObject.getEpisodeOfCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisodeOfCare()) != null)
				{
					value11 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisodeOfCare());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value11 = domainObject.getEpisodeOfCare();	
			}
			else
			{
				value11 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisodeOfCare().getBoId());
			}
		}
		domainObject.setEpisodeOfCare(value11);
		domainObject.setEmergencyAttendances(ims.emergency.vo.domain.AttendanceDetailsVoAssembler.extractEmergencyAttendanceSet(domainFactory, valueObject.getEmergencyAttendances(), domainObject.getEmergencyAttendances(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getSchool() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getSchool().getID());
		}
		domainObject.setSchool(value13);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getOccupation() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getOccupation().getID());
		}
		domainObject.setOccupation(value14);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getOccupationStatus() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getOccupationStatus().getID());
		}
		domainObject.setOccupationStatus(value15);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPlaceofEmployment() != null && valueObject.getPlaceofEmployment().equals(""))
		{
			valueObject.setPlaceofEmployment(null);
		}
		domainObject.setPlaceofEmployment(valueObject.getPlaceofEmployment());
		domainObject.setSpecialInterestDetails(ims.emergency.vo.domain.SpecialInterestDetailsVoAssembler.extractSpecialInterestDetailList(domainFactory, valueObject.getSpecialInterestDetails(), domainObject.getSpecialInterestDetails(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value18 = null;
		if ( null != valueObject.getTriageCategoryType() ) 
		{
			value18 =
				domainFactory.getLookupInstance(valueObject.getTriageCategoryType().getID());
		}
		domainObject.setTriageCategoryType(value18);
		domainObject.setRTADetails(ims.emergency.vo.domain.RTAVoAssembler.extractRTA(domainFactory, valueObject.getRTADetails(), domMap));
		domainObject.setTiig(ims.emergency.vo.domain.TIIGVoAssembler.extractTIIG(domainFactory, valueObject.getTiig(), domMap));
		ims.core.patient.domain.objects.Patient value21 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value21 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value21 = domainObject.getPatient();	
			}
			else
			{
				value21 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value21);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOtherReferral() != null && valueObject.getOtherReferral().equals(""))
		{
			valueObject.setOtherReferral(null);
		}
		domainObject.setOtherReferral(valueObject.getOtherReferral());
		domainObject.setMedPatientConsent(valueObject.getMedPatientConsent());

		return domainObject;
	}

}
