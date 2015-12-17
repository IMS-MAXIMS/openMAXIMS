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
 * @author Billy Mahon
 */
public class SocialHistoryVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.SocialHistoryVo copy(ims.core.vo.SocialHistoryVo valueObjectDest, ims.core.vo.SocialHistoryVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_SocialHistory(valueObjectSrc.getID_SocialHistory());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// SmokingStatus
		valueObjectDest.setSmokingStatus(valueObjectSrc.getSmokingStatus());
		// SmokingDetails
		valueObjectDest.setSmokingDetails(valueObjectSrc.getSmokingDetails());
		// Alcohol
		valueObjectDest.setAlcohol(valueObjectSrc.getAlcohol());
		// IllicitDrugs
		valueObjectDest.setIllicitDrugs(valueObjectSrc.getIllicitDrugs());
		// Occupation
		valueObjectDest.setOccupation(valueObjectSrc.getOccupation());
		// LivesWith
		valueObjectDest.setLivesWith(valueObjectSrc.getLivesWith());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// FitToCareForPatient
		valueObjectDest.setFitToCareForPatient(valueObjectSrc.getFitToCareForPatient());
		// FitToTakeHome
		valueObjectDest.setFitToTakeHome(valueObjectSrc.getFitToTakeHome());
		// OccupationText
		valueObjectDest.setOccupationText(valueObjectSrc.getOccupationText());
		// SocialHistoryNotes
		valueObjectDest.setSocialHistoryNotes(valueObjectSrc.getSocialHistoryNotes());
		// MaritalStatus
		valueObjectDest.setMaritalStatus(valueObjectSrc.getMaritalStatus());
		// MobilityIndependence
		valueObjectDest.setMobilityIndependence(valueObjectSrc.getMobilityIndependence());
		// OccupationStatus
		valueObjectDest.setOccupationStatus(valueObjectSrc.getOccupationStatus());
		// Diet
		valueObjectDest.setDiet(valueObjectSrc.getDiet());
		// IllicitDrugsList
		valueObjectDest.setIllicitDrugsList(valueObjectSrc.getIllicitDrugsList());
		// RecordingInformation
		valueObjectDest.setRecordingInformation(valueObjectSrc.getRecordingInformation());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSocialHistoryVoCollectionFromSocialHistory(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.SocialHistory objects.
	 */
	public static ims.core.vo.SocialHistoryVoCollection createSocialHistoryVoCollectionFromSocialHistory(java.util.Set domainObjectSet)	
	{
		return createSocialHistoryVoCollectionFromSocialHistory(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.SocialHistory objects.
	 */
	public static ims.core.vo.SocialHistoryVoCollection createSocialHistoryVoCollectionFromSocialHistory(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.SocialHistoryVoCollection voList = new ims.core.vo.SocialHistoryVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.SocialHistory domainObject = (ims.core.clinical.domain.objects.SocialHistory) iterator.next();
			ims.core.vo.SocialHistoryVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.SocialHistory objects.
	 */
	public static ims.core.vo.SocialHistoryVoCollection createSocialHistoryVoCollectionFromSocialHistory(java.util.List domainObjectList) 
	{
		return createSocialHistoryVoCollectionFromSocialHistory(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.SocialHistory objects.
	 */
	public static ims.core.vo.SocialHistoryVoCollection createSocialHistoryVoCollectionFromSocialHistory(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.SocialHistoryVoCollection voList = new ims.core.vo.SocialHistoryVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.SocialHistory domainObject = (ims.core.clinical.domain.objects.SocialHistory) domainObjectList.get(i);
			ims.core.vo.SocialHistoryVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.SocialHistory set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractSocialHistorySet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.SocialHistoryVoCollection voCollection) 
	 {
	 	return extractSocialHistorySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSocialHistorySet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.SocialHistoryVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.SocialHistoryVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.SocialHistory domainObject = SocialHistoryVoAssembler.extractSocialHistory(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.SocialHistory list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractSocialHistoryList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.SocialHistoryVoCollection voCollection) 
	 {
	 	return extractSocialHistoryList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSocialHistoryList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.SocialHistoryVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.SocialHistoryVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.SocialHistory domainObject = SocialHistoryVoAssembler.extractSocialHistory(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.SocialHistory object.
	 * @param domainObject ims.core.clinical.domain.objects.SocialHistory
	 */
	 public static ims.core.vo.SocialHistoryVo create(ims.core.clinical.domain.objects.SocialHistory domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.SocialHistory object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.SocialHistoryVo create(DomainObjectMap map, ims.core.clinical.domain.objects.SocialHistory domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.SocialHistoryVo valueObject = (ims.core.vo.SocialHistoryVo) map.getValueObject(domainObject, ims.core.vo.SocialHistoryVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.SocialHistoryVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.SocialHistory
	 */
	 public static ims.core.vo.SocialHistoryVo insert(ims.core.vo.SocialHistoryVo valueObject, ims.core.clinical.domain.objects.SocialHistory domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.SocialHistory
	 */
	 public static ims.core.vo.SocialHistoryVo insert(DomainObjectMap map, ims.core.vo.SocialHistoryVo valueObject, ims.core.clinical.domain.objects.SocialHistory domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_SocialHistory(domainObject.getId());
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
			
		// SmokingStatus
		ims.domain.lookups.LookupInstance instance1 = domainObject.getSmokingStatus();
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

			ims.core.vo.lookups.SmokingStatus voLookup1 = new ims.core.vo.lookups.SmokingStatus(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.SmokingStatus parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.core.vo.lookups.SmokingStatus(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setSmokingStatus(voLookup1);
		}
				// SmokingDetails
		valueObject.setSmokingDetails(ims.core.vo.domain.SmokingDetailsAssembler.createSmokingDetailsCollectionFromSmokingDetails(map, domainObject.getSmokingDetails()) );
		// Alcohol
		valueObject.setAlcohol(ims.core.vo.domain.AlcoholVoAssembler.create(map, domainObject.getAlcohol()) );
		// IllicitDrugs
		valueObject.setIllicitDrugs(domainObject.getIllicitDrugs());
		// Occupation
		ims.domain.lookups.LookupInstance instance5 = domainObject.getOccupation();
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

			ims.core.vo.lookups.Occupation voLookup5 = new ims.core.vo.lookups.Occupation(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.Occupation parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.Occupation(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setOccupation(voLookup5);
		}
				// LivesWith
		ims.domain.lookups.LookupInstance instance6 = domainObject.getLivesWith();
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

			ims.core.vo.lookups.LivesWith voLookup6 = new ims.core.vo.lookups.LivesWith(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.LivesWith parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.LivesWith(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setLivesWith(voLookup6);
		}
				// ClinicalContact
		valueObject.setClinicalContact(ims.core.vo.domain.ClinicalContactShortVoAssembler.create(map, domainObject.getClinicalContact()) );
		// FitToCareForPatient
		ims.domain.lookups.LookupInstance instance8 = domainObject.getFitToCareForPatient();
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

			ims.core.vo.lookups.YesNoUnknown voLookup8 = new ims.core.vo.lookups.YesNoUnknown(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.YesNoUnknown(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setFitToCareForPatient(voLookup8);
		}
				// FitToTakeHome
		ims.domain.lookups.LookupInstance instance9 = domainObject.getFitToTakeHome();
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

			ims.core.vo.lookups.YesNoUnknown voLookup9 = new ims.core.vo.lookups.YesNoUnknown(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.core.vo.lookups.YesNoUnknown(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setFitToTakeHome(voLookup9);
		}
				// OccupationText
		valueObject.setOccupationText(domainObject.getOccupationText());
		// SocialHistoryNotes
		valueObject.setSocialHistoryNotes(domainObject.getSocialHistoryNotes());
		// MaritalStatus
		valueObject.setMaritalStatus(ims.core.vo.domain.SocialHistoryMaritalStatusVoAssembler.create(map, domainObject.getMaritalStatus()) );
		// MobilityIndependence
		valueObject.setMobilityIndependence(domainObject.getMobilityIndependence());
		// OccupationStatus
		ims.domain.lookups.LookupInstance instance14 = domainObject.getOccupationStatus();
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

			ims.core.vo.lookups.OccupationStatus voLookup14 = new ims.core.vo.lookups.OccupationStatus(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.core.vo.lookups.OccupationStatus parentVoLookup14 = voLookup14;
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
								parentVoLookup14.setParent(new ims.core.vo.lookups.OccupationStatus(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setOccupationStatus(voLookup14);
		}
				// Diet
		ims.domain.lookups.LookupInstance instance15 = domainObject.getDiet();
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

			ims.core.vo.lookups.SocialHistoryDiet voLookup15 = new ims.core.vo.lookups.SocialHistoryDiet(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.core.vo.lookups.SocialHistoryDiet parentVoLookup15 = voLookup15;
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
								parentVoLookup15.setParent(new ims.core.vo.lookups.SocialHistoryDiet(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setDiet(voLookup15);
		}
				// IllicitDrugsList
		valueObject.setIllicitDrugsList(ims.core.vo.domain.IllicitDrugsVoAssembler.create(map, domainObject.getIllicitDrugsList()) );
		// RecordingInformation
		valueObject.setRecordingInformation(ims.core.vo.domain.RecordingUserInformationVoAssembler.create(map, domainObject.getRecordingInformation()) );
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
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.SocialHistory extractSocialHistory(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.SocialHistoryVo valueObject) 
	{
		return 	extractSocialHistory(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.SocialHistory extractSocialHistory(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.SocialHistoryVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_SocialHistory();
		ims.core.clinical.domain.objects.SocialHistory domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.SocialHistory)domMap.get(valueObject);
			}
			// ims.core.vo.SocialHistoryVo ID_SocialHistory field is unknown
			domainObject = new ims.core.clinical.domain.objects.SocialHistory();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_SocialHistory());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.SocialHistory)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.SocialHistory) domainFactory.getDomainObject(ims.core.clinical.domain.objects.SocialHistory.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_SocialHistory());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getSmokingStatus() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getSmokingStatus().getID());
		}
		domainObject.setSmokingStatus(value1);
		domainObject.setSmokingDetails(ims.core.vo.domain.SmokingDetailsAssembler.extractSmokingDetailsSet(domainFactory, valueObject.getSmokingDetails(), domainObject.getSmokingDetails(), domMap));		
		domainObject.setAlcohol(ims.core.vo.domain.AlcoholVoAssembler.extractAlcohol(domainFactory, valueObject.getAlcohol(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getIllicitDrugs() != null && valueObject.getIllicitDrugs().equals(""))
		{
			valueObject.setIllicitDrugs(null);
		}
		domainObject.setIllicitDrugs(valueObject.getIllicitDrugs());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getOccupation() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getOccupation().getID());
		}
		domainObject.setOccupation(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getLivesWith() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getLivesWith().getID());
		}
		domainObject.setLivesWith(value6);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.ClinicalContact value7 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value7 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else
			{
				value7 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getFitToCareForPatient() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getFitToCareForPatient().getID());
		}
		domainObject.setFitToCareForPatient(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getFitToTakeHome() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getFitToTakeHome().getID());
		}
		domainObject.setFitToTakeHome(value9);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOccupationText() != null && valueObject.getOccupationText().equals(""))
		{
			valueObject.setOccupationText(null);
		}
		domainObject.setOccupationText(valueObject.getOccupationText());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSocialHistoryNotes() != null && valueObject.getSocialHistoryNotes().equals(""))
		{
			valueObject.setSocialHistoryNotes(null);
		}
		domainObject.setSocialHistoryNotes(valueObject.getSocialHistoryNotes());
		domainObject.setMaritalStatus(ims.core.vo.domain.SocialHistoryMaritalStatusVoAssembler.extractSocialHistoryMaritalStatus(domainFactory, valueObject.getMaritalStatus(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getMobilityIndependence() != null && valueObject.getMobilityIndependence().equals(""))
		{
			valueObject.setMobilityIndependence(null);
		}
		domainObject.setMobilityIndependence(valueObject.getMobilityIndependence());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getOccupationStatus() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getOccupationStatus().getID());
		}
		domainObject.setOccupationStatus(value14);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getDiet() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getDiet().getID());
		}
		domainObject.setDiet(value15);
		domainObject.setIllicitDrugsList(ims.core.vo.domain.IllicitDrugsVoAssembler.extractIllicitDrugs(domainFactory, valueObject.getIllicitDrugsList(), domMap));
		domainObject.setRecordingInformation(ims.core.vo.domain.RecordingUserInformationVoAssembler.extractRecordingUserInformation(domainFactory, valueObject.getRecordingInformation(), domMap));
		ims.core.admin.domain.objects.CareContext value18 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value18 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value18 = domainObject.getCareContext();	
			}
			else
			{
				value18 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value18);
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));

		return domainObject;
	}

}
