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
 * @author Cornel Ventuneac
 */
public class TIIGVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.TIIGVo copy(ims.emergency.vo.TIIGVo valueObjectDest, ims.emergency.vo.TIIGVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_TIIG(valueObjectSrc.getID_TIIG());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// Episode
		valueObjectDest.setEpisode(valueObjectSrc.getEpisode());
		// Attendance
		valueObjectDest.setAttendance(valueObjectSrc.getAttendance());
		// HadPatientConsumedAlcohol
		valueObjectDest.setHadPatientConsumedAlcohol(valueObjectSrc.getHadPatientConsumedAlcohol());
		// AssaultWeapon
		valueObjectDest.setAssaultWeapon(valueObjectSrc.getAssaultWeapon());
		// AssaultLocation
		valueObjectDest.setAssaultLocation(valueObjectSrc.getAssaultLocation());
		// RelationshipToAttacker
		valueObjectDest.setRelationshipToAttacker(valueObjectSrc.getRelationshipToAttacker());
		// IntendToInformPolice
		valueObjectDest.setIntendToInformPolice(valueObjectSrc.getIntendToInformPolice());
		// ConsumedOrPurchasedAlcoholFrom
		valueObjectDest.setConsumedOrPurchasedAlcoholFrom(valueObjectSrc.getConsumedOrPurchasedAlcoholFrom());
		// NumberOfAttackers
		valueObjectDest.setNumberOfAttackers(valueObjectSrc.getNumberOfAttackers());
		// GenderofAttacker
		valueObjectDest.setGenderofAttacker(valueObjectSrc.getGenderofAttacker());
		// PreviouslyAssulatedByAttacker
		valueObjectDest.setPreviouslyAssulatedByAttacker(valueObjectSrc.getPreviouslyAssulatedByAttacker());
		// AssaultLocationDetails
		valueObjectDest.setAssaultLocationDetails(valueObjectSrc.getAssaultLocationDetails());
		// RelationshipToAttackerDetails
		valueObjectDest.setRelationshipToAttackerDetails(valueObjectSrc.getRelationshipToAttackerDetails());
		// AssaultWeaponDetails
		valueObjectDest.setAssaultWeaponDetails(valueObjectSrc.getAssaultWeaponDetails());
		// LastDrinkLocationDetails
		valueObjectDest.setLastDrinkLocationDetails(valueObjectSrc.getLastDrinkLocationDetails());
		// AttackerHadConsumedAlcohol
		valueObjectDest.setAttackerHadConsumedAlcohol(valueObjectSrc.getAttackerHadConsumedAlcohol());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTIIGVoCollectionFromTIIG(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.TIIG objects.
	 */
	public static ims.emergency.vo.TIIGVoCollection createTIIGVoCollectionFromTIIG(java.util.Set domainObjectSet)	
	{
		return createTIIGVoCollectionFromTIIG(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.TIIG objects.
	 */
	public static ims.emergency.vo.TIIGVoCollection createTIIGVoCollectionFromTIIG(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.TIIGVoCollection voList = new ims.emergency.vo.TIIGVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.domain.objects.TIIG domainObject = (ims.core.admin.domain.objects.TIIG) iterator.next();
			ims.emergency.vo.TIIGVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.domain.objects.TIIG objects.
	 */
	public static ims.emergency.vo.TIIGVoCollection createTIIGVoCollectionFromTIIG(java.util.List domainObjectList) 
	{
		return createTIIGVoCollectionFromTIIG(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.TIIG objects.
	 */
	public static ims.emergency.vo.TIIGVoCollection createTIIGVoCollectionFromTIIG(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.TIIGVoCollection voList = new ims.emergency.vo.TIIGVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.TIIG domainObject = (ims.core.admin.domain.objects.TIIG) domainObjectList.get(i);
			ims.emergency.vo.TIIGVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.domain.objects.TIIG set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTIIGSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TIIGVoCollection voCollection) 
	 {
	 	return extractTIIGSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTIIGSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TIIGVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.TIIGVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.TIIG domainObject = TIIGVoAssembler.extractTIIG(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.domain.objects.TIIG list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTIIGList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TIIGVoCollection voCollection) 
	 {
	 	return extractTIIGList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTIIGList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TIIGVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.TIIGVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.TIIG domainObject = TIIGVoAssembler.extractTIIG(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.domain.objects.TIIG object.
	 * @param domainObject ims.core.admin.domain.objects.TIIG
	 */
	 public static ims.emergency.vo.TIIGVo create(ims.core.admin.domain.objects.TIIG domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.domain.objects.TIIG object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.emergency.vo.TIIGVo create(DomainObjectMap map, ims.core.admin.domain.objects.TIIG domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.TIIGVo valueObject = (ims.emergency.vo.TIIGVo) map.getValueObject(domainObject, ims.emergency.vo.TIIGVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.TIIGVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.domain.objects.TIIG
	 */
	 public static ims.emergency.vo.TIIGVo insert(ims.emergency.vo.TIIGVo valueObject, ims.core.admin.domain.objects.TIIG domainObject) 
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
	 * @param domainObject ims.core.admin.domain.objects.TIIG
	 */
	 public static ims.emergency.vo.TIIGVo insert(DomainObjectMap map, ims.emergency.vo.TIIGVo valueObject, ims.core.admin.domain.objects.TIIG domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_TIIG(domainObject.getId());
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
		// Episode
		if (domainObject.getEpisode() != null)
		{
			if(domainObject.getEpisode() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getEpisode();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setEpisode(new ims.core.admin.vo.EpisodeOfCareRefVo(id, -1));				
			}
			else
			{
				valueObject.setEpisode(new ims.core.admin.vo.EpisodeOfCareRefVo(domainObject.getEpisode().getId(), domainObject.getEpisode().getVersion()));
			}
		}
		// Attendance
		if (domainObject.getAttendance() != null)
		{
			if(domainObject.getAttendance() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAttendance();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAttendance(new ims.core.admin.vo.CareContextRefVo(id, -1));				
			}
			else
			{
				valueObject.setAttendance(new ims.core.admin.vo.CareContextRefVo(domainObject.getAttendance().getId(), domainObject.getAttendance().getVersion()));
			}
		}
		// HadPatientConsumedAlcohol
		ims.domain.lookups.LookupInstance instance4 = domainObject.getHadPatientConsumedAlcohol();
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

			ims.emergency.vo.lookups.ConsumedAlcoholThreeHoursPriorToIncident voLookup4 = new ims.emergency.vo.lookups.ConsumedAlcoholThreeHoursPriorToIncident(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.emergency.vo.lookups.ConsumedAlcoholThreeHoursPriorToIncident parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.emergency.vo.lookups.ConsumedAlcoholThreeHoursPriorToIncident(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setHadPatientConsumedAlcohol(voLookup4);
		}
				// AssaultWeapon
		ims.domain.lookups.LookupInstance instance5 = domainObject.getAssaultWeapon();
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

			ims.emergency.vo.lookups.AssaultWeapon voLookup5 = new ims.emergency.vo.lookups.AssaultWeapon(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.emergency.vo.lookups.AssaultWeapon parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.emergency.vo.lookups.AssaultWeapon(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setAssaultWeapon(voLookup5);
		}
				// AssaultLocation
		ims.domain.lookups.LookupInstance instance6 = domainObject.getAssaultLocation();
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

			ims.emergency.vo.lookups.AssaultLocation voLookup6 = new ims.emergency.vo.lookups.AssaultLocation(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.emergency.vo.lookups.AssaultLocation parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.emergency.vo.lookups.AssaultLocation(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setAssaultLocation(voLookup6);
		}
				// RelationshipToAttacker
		ims.domain.lookups.LookupInstance instance7 = domainObject.getRelationshipToAttacker();
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

			ims.emergency.vo.lookups.RelationshipToAttacker voLookup7 = new ims.emergency.vo.lookups.RelationshipToAttacker(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.emergency.vo.lookups.RelationshipToAttacker parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.emergency.vo.lookups.RelationshipToAttacker(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setRelationshipToAttacker(voLookup7);
		}
				// IntendToInformPolice
		ims.domain.lookups.LookupInstance instance8 = domainObject.getIntendToInformPolice();
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

			ims.emergency.vo.lookups.PoliceInformed voLookup8 = new ims.emergency.vo.lookups.PoliceInformed(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.emergency.vo.lookups.PoliceInformed parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.emergency.vo.lookups.PoliceInformed(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setIntendToInformPolice(voLookup8);
		}
				// ConsumedOrPurchasedAlcoholFrom
		ims.domain.lookups.LookupInstance instance9 = domainObject.getConsumedOrPurchasedAlcoholFrom();
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

			ims.emergency.vo.lookups.ConsumedOrPurchasedAlcoholFrom voLookup9 = new ims.emergency.vo.lookups.ConsumedOrPurchasedAlcoholFrom(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.emergency.vo.lookups.ConsumedOrPurchasedAlcoholFrom parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.emergency.vo.lookups.ConsumedOrPurchasedAlcoholFrom(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setConsumedOrPurchasedAlcoholFrom(voLookup9);
		}
				// NumberOfAttackers
		ims.domain.lookups.LookupInstance instance10 = domainObject.getNumberOfAttackers();
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

			ims.emergency.vo.lookups.NumberOfAttackers voLookup10 = new ims.emergency.vo.lookups.NumberOfAttackers(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.emergency.vo.lookups.NumberOfAttackers parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.emergency.vo.lookups.NumberOfAttackers(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setNumberOfAttackers(voLookup10);
		}
				// GenderofAttacker
		ims.domain.lookups.LookupInstance instance11 = domainObject.getGenderofAttacker();
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

			ims.emergency.vo.lookups.GenderofAttacker voLookup11 = new ims.emergency.vo.lookups.GenderofAttacker(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.emergency.vo.lookups.GenderofAttacker parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.emergency.vo.lookups.GenderofAttacker(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setGenderofAttacker(voLookup11);
		}
				// PreviouslyAssulatedByAttacker
		ims.domain.lookups.LookupInstance instance12 = domainObject.getPreviouslyAssulatedByAttacker();
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

			ims.emergency.vo.lookups.PatientPreviouslyAssaultedByAttacker voLookup12 = new ims.emergency.vo.lookups.PatientPreviouslyAssaultedByAttacker(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.emergency.vo.lookups.PatientPreviouslyAssaultedByAttacker parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.emergency.vo.lookups.PatientPreviouslyAssaultedByAttacker(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setPreviouslyAssulatedByAttacker(voLookup12);
		}
				// AssaultLocationDetails
		valueObject.setAssaultLocationDetails(domainObject.getAssaultLocationDetails());
		// RelationshipToAttackerDetails
		valueObject.setRelationshipToAttackerDetails(domainObject.getRelationshipToAttackerDetails());
		// AssaultWeaponDetails
		valueObject.setAssaultWeaponDetails(domainObject.getAssaultWeaponDetails());
		// LastDrinkLocationDetails
		valueObject.setLastDrinkLocationDetails(domainObject.getLastDrinkLocationDetails());
		// AttackerHadConsumedAlcohol
		ims.domain.lookups.LookupInstance instance17 = domainObject.getAttackerHadConsumedAlcohol();
		if ( null != instance17 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance17.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance17.getImage().getImageId(), instance17.getImage().getImagePath());
			}
			color = instance17.getColor();
			if (color != null) 
				color.getValue();

			ims.emergency.vo.lookups.AttackerHadConsumedAlcohol voLookup17 = new ims.emergency.vo.lookups.AttackerHadConsumedAlcohol(instance17.getId(),instance17.getText(), instance17.isActive(), null, img, color);
			ims.emergency.vo.lookups.AttackerHadConsumedAlcohol parentVoLookup17 = voLookup17;
			ims.domain.lookups.LookupInstance parent17 = instance17.getParent();
			while (parent17 != null)
			{
				if (parent17.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent17.getImage().getImageId(), parent17.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent17.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup17.setParent(new ims.emergency.vo.lookups.AttackerHadConsumedAlcohol(parent17.getId(),parent17.getText(), parent17.isActive(), null, img, color));
				parentVoLookup17 = parentVoLookup17.getParent();
								parent17 = parent17.getParent();
			}			
			valueObject.setAttackerHadConsumedAlcohol(voLookup17);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.TIIG extractTIIG(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TIIGVo valueObject) 
	{
		return 	extractTIIG(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.TIIG extractTIIG(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TIIGVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_TIIG();
		ims.core.admin.domain.objects.TIIG domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.domain.objects.TIIG)domMap.get(valueObject);
			}
			// ims.emergency.vo.TIIGVo ID_TIIG field is unknown
			domainObject = new ims.core.admin.domain.objects.TIIG();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_TIIG());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.domain.objects.TIIG)domMap.get(key);
			}
			domainObject = (ims.core.admin.domain.objects.TIIG) domainFactory.getDomainObject(ims.core.admin.domain.objects.TIIG.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_TIIG());

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
		if ( null != valueObject.getEpisode() ) 
		{
			if (valueObject.getEpisode().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisode()) != null)
				{
					value2 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisode());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getEpisode();	
			}
			else
			{
				value2 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisode().getBoId());
			}
		}
		domainObject.setEpisode(value2);
		ims.core.admin.domain.objects.CareContext value3 = null;
		if ( null != valueObject.getAttendance() ) 
		{
			if (valueObject.getAttendance().getBoId() == null)
			{
				if (domMap.get(valueObject.getAttendance()) != null)
				{
					value3 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getAttendance());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getAttendance();	
			}
			else
			{
				value3 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getAttendance().getBoId());
			}
		}
		domainObject.setAttendance(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getHadPatientConsumedAlcohol() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getHadPatientConsumedAlcohol().getID());
		}
		domainObject.setHadPatientConsumedAlcohol(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getAssaultWeapon() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getAssaultWeapon().getID());
		}
		domainObject.setAssaultWeapon(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getAssaultLocation() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getAssaultLocation().getID());
		}
		domainObject.setAssaultLocation(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getRelationshipToAttacker() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getRelationshipToAttacker().getID());
		}
		domainObject.setRelationshipToAttacker(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getIntendToInformPolice() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getIntendToInformPolice().getID());
		}
		domainObject.setIntendToInformPolice(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getConsumedOrPurchasedAlcoholFrom() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getConsumedOrPurchasedAlcoholFrom().getID());
		}
		domainObject.setConsumedOrPurchasedAlcoholFrom(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getNumberOfAttackers() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getNumberOfAttackers().getID());
		}
		domainObject.setNumberOfAttackers(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getGenderofAttacker() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getGenderofAttacker().getID());
		}
		domainObject.setGenderofAttacker(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getPreviouslyAssulatedByAttacker() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getPreviouslyAssulatedByAttacker().getID());
		}
		domainObject.setPreviouslyAssulatedByAttacker(value12);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAssaultLocationDetails() != null && valueObject.getAssaultLocationDetails().equals(""))
		{
			valueObject.setAssaultLocationDetails(null);
		}
		domainObject.setAssaultLocationDetails(valueObject.getAssaultLocationDetails());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getRelationshipToAttackerDetails() != null && valueObject.getRelationshipToAttackerDetails().equals(""))
		{
			valueObject.setRelationshipToAttackerDetails(null);
		}
		domainObject.setRelationshipToAttackerDetails(valueObject.getRelationshipToAttackerDetails());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAssaultWeaponDetails() != null && valueObject.getAssaultWeaponDetails().equals(""))
		{
			valueObject.setAssaultWeaponDetails(null);
		}
		domainObject.setAssaultWeaponDetails(valueObject.getAssaultWeaponDetails());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLastDrinkLocationDetails() != null && valueObject.getLastDrinkLocationDetails().equals(""))
		{
			valueObject.setLastDrinkLocationDetails(null);
		}
		domainObject.setLastDrinkLocationDetails(valueObject.getLastDrinkLocationDetails());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value17 = null;
		if ( null != valueObject.getAttackerHadConsumedAlcohol() ) 
		{
			value17 =
				domainFactory.getLookupInstance(valueObject.getAttackerHadConsumedAlcohol().getID());
		}
		domainObject.setAttackerHadConsumedAlcohol(value17);

		return domainObject;
	}

}
