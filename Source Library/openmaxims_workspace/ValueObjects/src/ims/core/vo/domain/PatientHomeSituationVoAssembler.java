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
 * @author Daniel Laffan
 */
public class PatientHomeSituationVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PatientHomeSituationVo copy(ims.core.vo.PatientHomeSituationVo valueObjectDest, ims.core.vo.PatientHomeSituationVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientHomeSituation(valueObjectSrc.getID_PatientHomeSituation());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// AccomType
		valueObjectDest.setAccomType(valueObjectSrc.getAccomType());
		// AccomTypeOther
		valueObjectDest.setAccomTypeOther(valueObjectSrc.getAccomTypeOther());
		// Ownership
		valueObjectDest.setOwnership(valueObjectSrc.getOwnership());
		// SupervisedBy
		valueObjectDest.setSupervisedBy(valueObjectSrc.getSupervisedBy());
		// SuperviseName
		valueObjectDest.setSuperviseName(valueObjectSrc.getSuperviseName());
		// SuperviseAddress
		valueObjectDest.setSuperviseAddress(valueObjectSrc.getSuperviseAddress());
		// SupervisePhoneNo
		valueObjectDest.setSupervisePhoneNo(valueObjectSrc.getSupervisePhoneNo());
		// FloorLevel
		valueObjectDest.setFloorLevel(valueObjectSrc.getFloorLevel());
		// Lift
		valueObjectDest.setLift(valueObjectSrc.getLift());
		// Stairs
		valueObjectDest.setStairs(valueObjectSrc.getStairs());
		// StairsLift
		valueObjectDest.setStairsLift(valueObjectSrc.getStairsLift());
		// Rails
		valueObjectDest.setRails(valueObjectSrc.getRails());
		// RailSide
		valueObjectDest.setRailSide(valueObjectSrc.getRailSide());
		// Bathroom
		valueObjectDest.setBathroom(valueObjectSrc.getBathroom());
		// BathroomLocation
		valueObjectDest.setBathroomLocation(valueObjectSrc.getBathroomLocation());
		// Toilet
		valueObjectDest.setToilet(valueObjectSrc.getToilet());
		// ToiletLocation
		valueObjectDest.setToiletLocation(valueObjectSrc.getToiletLocation());
		// Shower
		valueObjectDest.setShower(valueObjectSrc.getShower());
		// ShowerLocation
		valueObjectDest.setShowerLocation(valueObjectSrc.getShowerLocation());
		// HouseKeys
		valueObjectDest.setHouseKeys(valueObjectSrc.getHouseKeys());
		// SpareSet
		valueObjectDest.setSpareSet(valueObjectSrc.getSpareSet());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// LivesWith
		valueObjectDest.setLivesWith(valueObjectSrc.getLivesWith());
		// LivesWithDetails
		valueObjectDest.setLivesWithDetails(valueObjectSrc.getLivesWithDetails());
		// FitToCareForPatient
		valueObjectDest.setFitToCareForPatient(valueObjectSrc.getFitToCareForPatient());
		// FitToTakeHome
		valueObjectDest.setFitToTakeHome(valueObjectSrc.getFitToTakeHome());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientHomeSituationVoCollectionFromPatientHomeSituation(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.PatientHomeSituation objects.
	 */
	public static ims.core.vo.PatientHomeSituationVoCollection createPatientHomeSituationVoCollectionFromPatientHomeSituation(java.util.Set domainObjectSet)	
	{
		return createPatientHomeSituationVoCollectionFromPatientHomeSituation(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.PatientHomeSituation objects.
	 */
	public static ims.core.vo.PatientHomeSituationVoCollection createPatientHomeSituationVoCollectionFromPatientHomeSituation(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatientHomeSituationVoCollection voList = new ims.core.vo.PatientHomeSituationVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.PatientHomeSituation domainObject = (ims.clinical.domain.objects.PatientHomeSituation) iterator.next();
			ims.core.vo.PatientHomeSituationVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.PatientHomeSituation objects.
	 */
	public static ims.core.vo.PatientHomeSituationVoCollection createPatientHomeSituationVoCollectionFromPatientHomeSituation(java.util.List domainObjectList) 
	{
		return createPatientHomeSituationVoCollectionFromPatientHomeSituation(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.PatientHomeSituation objects.
	 */
	public static ims.core.vo.PatientHomeSituationVoCollection createPatientHomeSituationVoCollectionFromPatientHomeSituation(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatientHomeSituationVoCollection voList = new ims.core.vo.PatientHomeSituationVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.PatientHomeSituation domainObject = (ims.clinical.domain.objects.PatientHomeSituation) domainObjectList.get(i);
			ims.core.vo.PatientHomeSituationVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.PatientHomeSituation set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientHomeSituationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientHomeSituationVoCollection voCollection) 
	 {
	 	return extractPatientHomeSituationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientHomeSituationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientHomeSituationVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientHomeSituationVo vo = voCollection.get(i);
			ims.clinical.domain.objects.PatientHomeSituation domainObject = PatientHomeSituationVoAssembler.extractPatientHomeSituation(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.PatientHomeSituation list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientHomeSituationList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientHomeSituationVoCollection voCollection) 
	 {
	 	return extractPatientHomeSituationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientHomeSituationList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientHomeSituationVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientHomeSituationVo vo = voCollection.get(i);
			ims.clinical.domain.objects.PatientHomeSituation domainObject = PatientHomeSituationVoAssembler.extractPatientHomeSituation(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.PatientHomeSituation object.
	 * @param domainObject ims.clinical.domain.objects.PatientHomeSituation
	 */
	 public static ims.core.vo.PatientHomeSituationVo create(ims.clinical.domain.objects.PatientHomeSituation domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.PatientHomeSituation object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PatientHomeSituationVo create(DomainObjectMap map, ims.clinical.domain.objects.PatientHomeSituation domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PatientHomeSituationVo valueObject = (ims.core.vo.PatientHomeSituationVo) map.getValueObject(domainObject, ims.core.vo.PatientHomeSituationVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PatientHomeSituationVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.PatientHomeSituation
	 */
	 public static ims.core.vo.PatientHomeSituationVo insert(ims.core.vo.PatientHomeSituationVo valueObject, ims.clinical.domain.objects.PatientHomeSituation domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.PatientHomeSituation
	 */
	 public static ims.core.vo.PatientHomeSituationVo insert(DomainObjectMap map, ims.core.vo.PatientHomeSituationVo valueObject, ims.clinical.domain.objects.PatientHomeSituation domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientHomeSituation(domainObject.getId());
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
		// AccomType
		ims.domain.lookups.LookupInstance instance3 = domainObject.getAccomType();
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

			ims.clinical.vo.lookups.HSAccomType voLookup3 = new ims.clinical.vo.lookups.HSAccomType(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.clinical.vo.lookups.HSAccomType parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.clinical.vo.lookups.HSAccomType(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setAccomType(voLookup3);
		}
				// AccomTypeOther
		valueObject.setAccomTypeOther(domainObject.getAccomTypeOther());
		// Ownership
		ims.domain.lookups.LookupInstance instance5 = domainObject.getOwnership();
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

			ims.clinical.vo.lookups.HSOwnership voLookup5 = new ims.clinical.vo.lookups.HSOwnership(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.clinical.vo.lookups.HSOwnership parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.clinical.vo.lookups.HSOwnership(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setOwnership(voLookup5);
		}
				// SupervisedBy
		ims.domain.lookups.LookupInstance instance6 = domainObject.getSupervisedBy();
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

			ims.clinical.vo.lookups.HSSupervisedBy voLookup6 = new ims.clinical.vo.lookups.HSSupervisedBy(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.clinical.vo.lookups.HSSupervisedBy parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.clinical.vo.lookups.HSSupervisedBy(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setSupervisedBy(voLookup6);
		}
				// SuperviseName
		valueObject.setSuperviseName(domainObject.getSuperviseName());
		// SuperviseAddress
		valueObject.setSuperviseAddress(domainObject.getSuperviseAddress());
		// SupervisePhoneNo
		valueObject.setSupervisePhoneNo(domainObject.getSupervisePhoneNo());
		// FloorLevel
		ims.domain.lookups.LookupInstance instance10 = domainObject.getFloorLevel();
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

			ims.clinical.vo.lookups.HSFloorLevel voLookup10 = new ims.clinical.vo.lookups.HSFloorLevel(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.clinical.vo.lookups.HSFloorLevel parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.clinical.vo.lookups.HSFloorLevel(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setFloorLevel(voLookup10);
		}
				// Lift
		ims.domain.lookups.LookupInstance instance11 = domainObject.getLift();
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

			ims.clinical.vo.lookups.HSLift voLookup11 = new ims.clinical.vo.lookups.HSLift(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.clinical.vo.lookups.HSLift parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.clinical.vo.lookups.HSLift(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setLift(voLookup11);
		}
				// Stairs
		ims.domain.lookups.LookupInstance instance12 = domainObject.getStairs();
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

			ims.clinical.vo.lookups.HSStairs voLookup12 = new ims.clinical.vo.lookups.HSStairs(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.clinical.vo.lookups.HSStairs parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.clinical.vo.lookups.HSStairs(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setStairs(voLookup12);
		}
				// StairsLift
		valueObject.setStairsLift(domainObject.getStairsLift());
		// Rails
		ims.domain.lookups.LookupInstance instance14 = domainObject.getRails();
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

			ims.clinical.vo.lookups.HSRails voLookup14 = new ims.clinical.vo.lookups.HSRails(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.clinical.vo.lookups.HSRails parentVoLookup14 = voLookup14;
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
								parentVoLookup14.setParent(new ims.clinical.vo.lookups.HSRails(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setRails(voLookup14);
		}
				// RailSide
		ims.domain.lookups.LookupInstance instance15 = domainObject.getRailSide();
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

			ims.clinical.vo.lookups.HSRailsSide voLookup15 = new ims.clinical.vo.lookups.HSRailsSide(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.clinical.vo.lookups.HSRailsSide parentVoLookup15 = voLookup15;
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
								parentVoLookup15.setParent(new ims.clinical.vo.lookups.HSRailsSide(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setRailSide(voLookup15);
		}
				// Bathroom
		valueObject.setBathroom(domainObject.getBathroom());
		// BathroomLocation
		ims.domain.lookups.LookupInstance instance17 = domainObject.getBathroomLocation();
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

			ims.clinical.vo.lookups.HSBathroomLocation voLookup17 = new ims.clinical.vo.lookups.HSBathroomLocation(instance17.getId(),instance17.getText(), instance17.isActive(), null, img, color);
			ims.clinical.vo.lookups.HSBathroomLocation parentVoLookup17 = voLookup17;
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
								parentVoLookup17.setParent(new ims.clinical.vo.lookups.HSBathroomLocation(parent17.getId(),parent17.getText(), parent17.isActive(), null, img, color));
				parentVoLookup17 = parentVoLookup17.getParent();
								parent17 = parent17.getParent();
			}			
			valueObject.setBathroomLocation(voLookup17);
		}
				// Toilet
		valueObject.setToilet(domainObject.getToilet());
		// ToiletLocation
		ims.domain.lookups.LookupInstance instance19 = domainObject.getToiletLocation();
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

			ims.clinical.vo.lookups.HSToiletLocation voLookup19 = new ims.clinical.vo.lookups.HSToiletLocation(instance19.getId(),instance19.getText(), instance19.isActive(), null, img, color);
			ims.clinical.vo.lookups.HSToiletLocation parentVoLookup19 = voLookup19;
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
								parentVoLookup19.setParent(new ims.clinical.vo.lookups.HSToiletLocation(parent19.getId(),parent19.getText(), parent19.isActive(), null, img, color));
				parentVoLookup19 = parentVoLookup19.getParent();
								parent19 = parent19.getParent();
			}			
			valueObject.setToiletLocation(voLookup19);
		}
				// Shower
		valueObject.setShower(domainObject.getShower());
		// ShowerLocation
		ims.domain.lookups.LookupInstance instance21 = domainObject.getShowerLocation();
		if ( null != instance21 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance21.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance21.getImage().getImageId(), instance21.getImage().getImagePath());
			}
			color = instance21.getColor();
			if (color != null) 
				color.getValue();

			ims.clinical.vo.lookups.HSShowerLocation voLookup21 = new ims.clinical.vo.lookups.HSShowerLocation(instance21.getId(),instance21.getText(), instance21.isActive(), null, img, color);
			ims.clinical.vo.lookups.HSShowerLocation parentVoLookup21 = voLookup21;
			ims.domain.lookups.LookupInstance parent21 = instance21.getParent();
			while (parent21 != null)
			{
				if (parent21.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent21.getImage().getImageId(), parent21.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent21.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup21.setParent(new ims.clinical.vo.lookups.HSShowerLocation(parent21.getId(),parent21.getText(), parent21.isActive(), null, img, color));
				parentVoLookup21 = parentVoLookup21.getParent();
								parent21 = parent21.getParent();
			}			
			valueObject.setShowerLocation(voLookup21);
		}
				// HouseKeys
		valueObject.setHouseKeys(domainObject.getHouseKeys());
		// SpareSet
		valueObject.setSpareSet(domainObject.getSpareSet());
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// LivesWith
		ims.domain.lookups.LookupInstance instance25 = domainObject.getLivesWith();
		if ( null != instance25 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance25.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance25.getImage().getImageId(), instance25.getImage().getImagePath());
			}
			color = instance25.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.LivesWith voLookup25 = new ims.core.vo.lookups.LivesWith(instance25.getId(),instance25.getText(), instance25.isActive(), null, img, color);
			ims.core.vo.lookups.LivesWith parentVoLookup25 = voLookup25;
			ims.domain.lookups.LookupInstance parent25 = instance25.getParent();
			while (parent25 != null)
			{
				if (parent25.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent25.getImage().getImageId(), parent25.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent25.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup25.setParent(new ims.core.vo.lookups.LivesWith(parent25.getId(),parent25.getText(), parent25.isActive(), null, img, color));
				parentVoLookup25 = parentVoLookup25.getParent();
								parent25 = parent25.getParent();
			}			
			valueObject.setLivesWith(voLookup25);
		}
				// LivesWithDetails
		valueObject.setLivesWithDetails(domainObject.getLivesWithDetails());
		// FitToCareForPatient
		ims.domain.lookups.LookupInstance instance27 = domainObject.getFitToCareForPatient();
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

			ims.core.vo.lookups.YesNoUnknown voLookup27 = new ims.core.vo.lookups.YesNoUnknown(instance27.getId(),instance27.getText(), instance27.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup27 = voLookup27;
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
								parentVoLookup27.setParent(new ims.core.vo.lookups.YesNoUnknown(parent27.getId(),parent27.getText(), parent27.isActive(), null, img, color));
				parentVoLookup27 = parentVoLookup27.getParent();
								parent27 = parent27.getParent();
			}			
			valueObject.setFitToCareForPatient(voLookup27);
		}
				// FitToTakeHome
		ims.domain.lookups.LookupInstance instance28 = domainObject.getFitToTakeHome();
		if ( null != instance28 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance28.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance28.getImage().getImageId(), instance28.getImage().getImagePath());
			}
			color = instance28.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNoUnknown voLookup28 = new ims.core.vo.lookups.YesNoUnknown(instance28.getId(),instance28.getText(), instance28.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup28 = voLookup28;
			ims.domain.lookups.LookupInstance parent28 = instance28.getParent();
			while (parent28 != null)
			{
				if (parent28.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent28.getImage().getImageId(), parent28.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent28.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup28.setParent(new ims.core.vo.lookups.YesNoUnknown(parent28.getId(),parent28.getText(), parent28.isActive(), null, img, color));
				parentVoLookup28 = parentVoLookup28.getParent();
								parent28 = parent28.getParent();
			}			
			valueObject.setFitToTakeHome(voLookup28);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.PatientHomeSituation extractPatientHomeSituation(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientHomeSituationVo valueObject) 
	{
		return 	extractPatientHomeSituation(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.PatientHomeSituation extractPatientHomeSituation(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientHomeSituationVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientHomeSituation();
		ims.clinical.domain.objects.PatientHomeSituation domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.PatientHomeSituation)domMap.get(valueObject);
			}
			// ims.core.vo.PatientHomeSituationVo ID_PatientHomeSituation field is unknown
			domainObject = new ims.clinical.domain.objects.PatientHomeSituation();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientHomeSituation());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.PatientHomeSituation)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.PatientHomeSituation) domainFactory.getDomainObject(ims.clinical.domain.objects.PatientHomeSituation.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientHomeSituation());

		ims.core.admin.domain.objects.CareContext value1 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value1 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getCareContext();	
			}
			else
			{
				value1 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value1);
		ims.core.admin.domain.objects.ClinicalContact value2 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value2 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getClinicalContact();	
			}
			else
			{
				value2 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getAccomType() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getAccomType().getID());
		}
		domainObject.setAccomType(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAccomTypeOther() != null && valueObject.getAccomTypeOther().equals(""))
		{
			valueObject.setAccomTypeOther(null);
		}
		domainObject.setAccomTypeOther(valueObject.getAccomTypeOther());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getOwnership() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getOwnership().getID());
		}
		domainObject.setOwnership(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getSupervisedBy() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getSupervisedBy().getID());
		}
		domainObject.setSupervisedBy(value6);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSuperviseName() != null && valueObject.getSuperviseName().equals(""))
		{
			valueObject.setSuperviseName(null);
		}
		domainObject.setSuperviseName(valueObject.getSuperviseName());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSuperviseAddress() != null && valueObject.getSuperviseAddress().equals(""))
		{
			valueObject.setSuperviseAddress(null);
		}
		domainObject.setSuperviseAddress(valueObject.getSuperviseAddress());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSupervisePhoneNo() != null && valueObject.getSupervisePhoneNo().equals(""))
		{
			valueObject.setSupervisePhoneNo(null);
		}
		domainObject.setSupervisePhoneNo(valueObject.getSupervisePhoneNo());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getFloorLevel() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getFloorLevel().getID());
		}
		domainObject.setFloorLevel(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getLift() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getLift().getID());
		}
		domainObject.setLift(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getStairs() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getStairs().getID());
		}
		domainObject.setStairs(value12);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getStairsLift() != null && valueObject.getStairsLift().equals(""))
		{
			valueObject.setStairsLift(null);
		}
		domainObject.setStairsLift(valueObject.getStairsLift());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getRails() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getRails().getID());
		}
		domainObject.setRails(value14);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getRailSide() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getRailSide().getID());
		}
		domainObject.setRailSide(value15);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getBathroom() != null && valueObject.getBathroom().equals(""))
		{
			valueObject.setBathroom(null);
		}
		domainObject.setBathroom(valueObject.getBathroom());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value17 = null;
		if ( null != valueObject.getBathroomLocation() ) 
		{
			value17 =
				domainFactory.getLookupInstance(valueObject.getBathroomLocation().getID());
		}
		domainObject.setBathroomLocation(value17);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getToilet() != null && valueObject.getToilet().equals(""))
		{
			valueObject.setToilet(null);
		}
		domainObject.setToilet(valueObject.getToilet());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value19 = null;
		if ( null != valueObject.getToiletLocation() ) 
		{
			value19 =
				domainFactory.getLookupInstance(valueObject.getToiletLocation().getID());
		}
		domainObject.setToiletLocation(value19);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getShower() != null && valueObject.getShower().equals(""))
		{
			valueObject.setShower(null);
		}
		domainObject.setShower(valueObject.getShower());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value21 = null;
		if ( null != valueObject.getShowerLocation() ) 
		{
			value21 =
				domainFactory.getLookupInstance(valueObject.getShowerLocation().getID());
		}
		domainObject.setShowerLocation(value21);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getHouseKeys() != null && valueObject.getHouseKeys().equals(""))
		{
			valueObject.setHouseKeys(null);
		}
		domainObject.setHouseKeys(valueObject.getHouseKeys());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSpareSet() != null && valueObject.getSpareSet().equals(""))
		{
			valueObject.setSpareSet(null);
		}
		domainObject.setSpareSet(valueObject.getSpareSet());
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value25 = null;
		if ( null != valueObject.getLivesWith() ) 
		{
			value25 =
				domainFactory.getLookupInstance(valueObject.getLivesWith().getID());
		}
		domainObject.setLivesWith(value25);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLivesWithDetails() != null && valueObject.getLivesWithDetails().equals(""))
		{
			valueObject.setLivesWithDetails(null);
		}
		domainObject.setLivesWithDetails(valueObject.getLivesWithDetails());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value27 = null;
		if ( null != valueObject.getFitToCareForPatient() ) 
		{
			value27 =
				domainFactory.getLookupInstance(valueObject.getFitToCareForPatient().getID());
		}
		domainObject.setFitToCareForPatient(value27);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value28 = null;
		if ( null != valueObject.getFitToTakeHome() ) 
		{
			value28 =
				domainFactory.getLookupInstance(valueObject.getFitToTakeHome().getID());
		}
		domainObject.setFitToTakeHome(value28);

		return domainObject;
	}

}
