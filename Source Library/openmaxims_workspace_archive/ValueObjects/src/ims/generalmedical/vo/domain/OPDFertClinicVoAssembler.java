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
package ims.generalmedical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Kevin O'Carroll
 */
public class OPDFertClinicVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.generalmedical.vo.OPDFertClinicVo copy(ims.generalmedical.vo.OPDFertClinicVo valueObjectDest, ims.generalmedical.vo.OPDFertClinicVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_OPDFertClinic(valueObjectSrc.getID_OPDFertClinic());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AchieveErection
		valueObjectDest.setAchieveErection(valueObjectSrc.getAchieveErection());
		// ErectDysfxTreatments
		valueObjectDest.setErectDysfxTreatments(valueObjectSrc.getErectDysfxTreatments());
		// SexDrive
		valueObjectDest.setSexDrive(valueObjectSrc.getSexDrive());
		// Ejaculation
		valueObjectDest.setEjaculation(valueObjectSrc.getEjaculation());
		// BladderDrainage
		valueObjectDest.setBladderDrainage(valueObjectSrc.getBladderDrainage());
		// BladderDrainagetxt
		valueObjectDest.setBladderDrainagetxt(valueObjectSrc.getBladderDrainagetxt());
		// TestAtrophy
		valueObjectDest.setTestAtrophy(valueObjectSrc.getTestAtrophy());
		// EndoEvalPerf
		valueObjectDest.setEndoEvalPerf(valueObjectSrc.getEndoEvalPerf());
		// InfxnScreening
		valueObjectDest.setInfxnScreening(valueObjectSrc.getInfxnScreening());
		// ScreenConsent
		valueObjectDest.setScreenConsent(valueObjectSrc.getScreenConsent());
		// SemenCulture
		valueObjectDest.setSemenCulture(valueObjectSrc.getSemenCulture());
		// SemenFindings
		valueObjectDest.setSemenFindings(valueObjectSrc.getSemenFindings());
		// Elisa
		valueObjectDest.setElisa(valueObjectSrc.getElisa());
		// MethodssuccessWith
		valueObjectDest.setMethodssuccessWith(valueObjectSrc.getMethodssuccessWith());
		// spermFrozen
		valueObjectDest.setSpermFrozen(valueObjectSrc.getSpermFrozen());
		// Treatmentsoffered
		valueObjectDest.setTreatmentsoffered(valueObjectSrc.getTreatmentsoffered());
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
 	 * If more than one call to an Assembler is made then #createOPDFertClinicVoCollectionFromOPDFertClinic(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.medical.domain.objects.OPDFertClinic objects.
	 */
	public static ims.generalmedical.vo.OPDFertClinicVoCollection createOPDFertClinicVoCollectionFromOPDFertClinic(java.util.Set domainObjectSet)	
	{
		return createOPDFertClinicVoCollectionFromOPDFertClinic(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.medical.domain.objects.OPDFertClinic objects.
	 */
	public static ims.generalmedical.vo.OPDFertClinicVoCollection createOPDFertClinicVoCollectionFromOPDFertClinic(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.generalmedical.vo.OPDFertClinicVoCollection voList = new ims.generalmedical.vo.OPDFertClinicVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.medical.domain.objects.OPDFertClinic domainObject = (ims.medical.domain.objects.OPDFertClinic) iterator.next();
			ims.generalmedical.vo.OPDFertClinicVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.medical.domain.objects.OPDFertClinic objects.
	 */
	public static ims.generalmedical.vo.OPDFertClinicVoCollection createOPDFertClinicVoCollectionFromOPDFertClinic(java.util.List domainObjectList) 
	{
		return createOPDFertClinicVoCollectionFromOPDFertClinic(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.medical.domain.objects.OPDFertClinic objects.
	 */
	public static ims.generalmedical.vo.OPDFertClinicVoCollection createOPDFertClinicVoCollectionFromOPDFertClinic(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.generalmedical.vo.OPDFertClinicVoCollection voList = new ims.generalmedical.vo.OPDFertClinicVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.medical.domain.objects.OPDFertClinic domainObject = (ims.medical.domain.objects.OPDFertClinic) domainObjectList.get(i);
			ims.generalmedical.vo.OPDFertClinicVo vo = create(map, domainObject);

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
	 * Create the ims.medical.domain.objects.OPDFertClinic set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractOPDFertClinicSet(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.OPDFertClinicVoCollection voCollection) 
	 {
	 	return extractOPDFertClinicSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOPDFertClinicSet(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.OPDFertClinicVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.generalmedical.vo.OPDFertClinicVo vo = voCollection.get(i);
			ims.medical.domain.objects.OPDFertClinic domainObject = OPDFertClinicVoAssembler.extractOPDFertClinic(domainFactory, vo, domMap);

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
	 * Create the ims.medical.domain.objects.OPDFertClinic list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractOPDFertClinicList(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.OPDFertClinicVoCollection voCollection) 
	 {
	 	return extractOPDFertClinicList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOPDFertClinicList(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.OPDFertClinicVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.generalmedical.vo.OPDFertClinicVo vo = voCollection.get(i);
			ims.medical.domain.objects.OPDFertClinic domainObject = OPDFertClinicVoAssembler.extractOPDFertClinic(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.medical.domain.objects.OPDFertClinic object.
	 * @param domainObject ims.medical.domain.objects.OPDFertClinic
	 */
	 public static ims.generalmedical.vo.OPDFertClinicVo create(ims.medical.domain.objects.OPDFertClinic domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.medical.domain.objects.OPDFertClinic object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.generalmedical.vo.OPDFertClinicVo create(DomainObjectMap map, ims.medical.domain.objects.OPDFertClinic domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.generalmedical.vo.OPDFertClinicVo valueObject = (ims.generalmedical.vo.OPDFertClinicVo) map.getValueObject(domainObject, ims.generalmedical.vo.OPDFertClinicVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.generalmedical.vo.OPDFertClinicVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.medical.domain.objects.OPDFertClinic
	 */
	 public static ims.generalmedical.vo.OPDFertClinicVo insert(ims.generalmedical.vo.OPDFertClinicVo valueObject, ims.medical.domain.objects.OPDFertClinic domainObject) 
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
	 * @param domainObject ims.medical.domain.objects.OPDFertClinic
	 */
	 public static ims.generalmedical.vo.OPDFertClinicVo insert(DomainObjectMap map, ims.generalmedical.vo.OPDFertClinicVo valueObject, ims.medical.domain.objects.OPDFertClinic domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_OPDFertClinic(domainObject.getId());
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
			
		// AchieveErection
		ims.domain.lookups.LookupInstance instance1 = domainObject.getAchieveErection();
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

			ims.spinalinjuries.vo.lookups.FCAchieveErection voLookup1 = new ims.spinalinjuries.vo.lookups.FCAchieveErection(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.FCAchieveErection parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.spinalinjuries.vo.lookups.FCAchieveErection(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setAchieveErection(voLookup1);
		}
				// ErectDysfxTreatments
		java.util.List listErectDysfxTreatments = domainObject.getErectDysfxTreatments();
		ims.spinalinjuries.vo.lookups.FCErectDysTreatmentsCollection ErectDysfxTreatments = new ims.spinalinjuries.vo.lookups.FCErectDysTreatmentsCollection();
		for(java.util.Iterator iterator = listErectDysfxTreatments.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.spinalinjuries.vo.lookups.FCErectDysTreatments voInstance = new ims.spinalinjuries.vo.lookups.FCErectDysTreatments(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.FCErectDysTreatments parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.spinalinjuries.vo.lookups.FCErectDysTreatments(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			ErectDysfxTreatments.add(voInstance);
		}
		valueObject.setErectDysfxTreatments( ErectDysfxTreatments );
		// SexDrive
		ims.domain.lookups.LookupInstance instance3 = domainObject.getSexDrive();
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

			ims.spinalinjuries.vo.lookups.FCSexDrive voLookup3 = new ims.spinalinjuries.vo.lookups.FCSexDrive(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.FCSexDrive parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.spinalinjuries.vo.lookups.FCSexDrive(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setSexDrive(voLookup3);
		}
				// Ejaculation
		ims.domain.lookups.LookupInstance instance4 = domainObject.getEjaculation();
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

			ims.spinalinjuries.vo.lookups.FCEjaculation voLookup4 = new ims.spinalinjuries.vo.lookups.FCEjaculation(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.FCEjaculation parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.spinalinjuries.vo.lookups.FCEjaculation(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setEjaculation(voLookup4);
		}
				// BladderDrainage
		java.util.List listBladderDrainage = domainObject.getBladderDrainage();
		ims.spinalinjuries.vo.lookups.FCBladderDrainageCollection BladderDrainage = new ims.spinalinjuries.vo.lookups.FCBladderDrainageCollection();
		for(java.util.Iterator iterator = listBladderDrainage.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.spinalinjuries.vo.lookups.FCBladderDrainage voInstance = new ims.spinalinjuries.vo.lookups.FCBladderDrainage(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.FCBladderDrainage parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.spinalinjuries.vo.lookups.FCBladderDrainage(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			BladderDrainage.add(voInstance);
		}
		valueObject.setBladderDrainage( BladderDrainage );
		// BladderDrainagetxt
		valueObject.setBladderDrainagetxt(domainObject.getBladderDrainagetxt());
		// TestAtrophy
		ims.domain.lookups.LookupInstance instance7 = domainObject.getTestAtrophy();
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

			ims.spinalinjuries.vo.lookups.FCTestAtrophy voLookup7 = new ims.spinalinjuries.vo.lookups.FCTestAtrophy(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.FCTestAtrophy parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.spinalinjuries.vo.lookups.FCTestAtrophy(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setTestAtrophy(voLookup7);
		}
				// EndoEvalPerf
		java.util.List listEndoEvalPerf = domainObject.getEndoEvalPerf();
		ims.spinalinjuries.vo.lookups.FCEndoEvalCollection EndoEvalPerf = new ims.spinalinjuries.vo.lookups.FCEndoEvalCollection();
		for(java.util.Iterator iterator = listEndoEvalPerf.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.spinalinjuries.vo.lookups.FCEndoEval voInstance = new ims.spinalinjuries.vo.lookups.FCEndoEval(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.FCEndoEval parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.spinalinjuries.vo.lookups.FCEndoEval(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			EndoEvalPerf.add(voInstance);
		}
		valueObject.setEndoEvalPerf( EndoEvalPerf );
		// InfxnScreening
		java.util.List listInfxnScreening = domainObject.getInfxnScreening();
		ims.spinalinjuries.vo.lookups.FCInfectionScreeningCollection InfxnScreening = new ims.spinalinjuries.vo.lookups.FCInfectionScreeningCollection();
		for(java.util.Iterator iterator = listInfxnScreening.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.spinalinjuries.vo.lookups.FCInfectionScreening voInstance = new ims.spinalinjuries.vo.lookups.FCInfectionScreening(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.FCInfectionScreening parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.spinalinjuries.vo.lookups.FCInfectionScreening(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			InfxnScreening.add(voInstance);
		}
		valueObject.setInfxnScreening( InfxnScreening );
		// ScreenConsent
		ims.domain.lookups.LookupInstance instance10 = domainObject.getScreenConsent();
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

			ims.spinalinjuries.vo.lookups.FCConsentForScreen voLookup10 = new ims.spinalinjuries.vo.lookups.FCConsentForScreen(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.FCConsentForScreen parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.spinalinjuries.vo.lookups.FCConsentForScreen(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setScreenConsent(voLookup10);
		}
				// SemenCulture
		ims.domain.lookups.LookupInstance instance11 = domainObject.getSemenCulture();
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

			ims.spinalinjuries.vo.lookups.FCSemenCulture voLookup11 = new ims.spinalinjuries.vo.lookups.FCSemenCulture(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.FCSemenCulture parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.spinalinjuries.vo.lookups.FCSemenCulture(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setSemenCulture(voLookup11);
		}
				// SemenFindings
		valueObject.setSemenFindings(ims.generalmedical.vo.domain.OPDFertCLinicSemenAnaAssembler.createOPDFertCLinicSemenAnaCollectionFromOPDFertClinicSemenAna(map, domainObject.getSemenFindings()) );
		// Elisa
		ims.domain.lookups.LookupInstance instance13 = domainObject.getElisa();
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

			ims.spinalinjuries.vo.lookups.FCElisa voLookup13 = new ims.spinalinjuries.vo.lookups.FCElisa(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.FCElisa parentVoLookup13 = voLookup13;
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
								parentVoLookup13.setParent(new ims.spinalinjuries.vo.lookups.FCElisa(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setElisa(voLookup13);
		}
				// MethodssuccessWith
		java.util.List listMethodssuccessWith = domainObject.getMethodssuccessWith();
		ims.spinalinjuries.vo.lookups.FCmethodsSuccessWithCollection MethodssuccessWith = new ims.spinalinjuries.vo.lookups.FCmethodsSuccessWithCollection();
		for(java.util.Iterator iterator = listMethodssuccessWith.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.spinalinjuries.vo.lookups.FCmethodsSuccessWith voInstance = new ims.spinalinjuries.vo.lookups.FCmethodsSuccessWith(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.FCmethodsSuccessWith parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.spinalinjuries.vo.lookups.FCmethodsSuccessWith(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			MethodssuccessWith.add(voInstance);
		}
		valueObject.setMethodssuccessWith( MethodssuccessWith );
		// spermFrozen
		ims.domain.lookups.LookupInstance instance15 = domainObject.getSpermFrozen();
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

			ims.spinalinjuries.vo.lookups.FCSpermfrozen voLookup15 = new ims.spinalinjuries.vo.lookups.FCSpermfrozen(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.FCSpermfrozen parentVoLookup15 = voLookup15;
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
								parentVoLookup15.setParent(new ims.spinalinjuries.vo.lookups.FCSpermfrozen(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setSpermFrozen(voLookup15);
		}
				// Treatmentsoffered
		java.util.List listTreatmentsoffered = domainObject.getTreatmentsoffered();
		ims.spinalinjuries.vo.lookups.FCTreatmentsOfferedCollection Treatmentsoffered = new ims.spinalinjuries.vo.lookups.FCTreatmentsOfferedCollection();
		for(java.util.Iterator iterator = listTreatmentsoffered.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.spinalinjuries.vo.lookups.FCTreatmentsOffered voInstance = new ims.spinalinjuries.vo.lookups.FCTreatmentsOffered(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.FCTreatmentsOffered parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.spinalinjuries.vo.lookups.FCTreatmentsOffered(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			Treatmentsoffered.add(voInstance);
		}
		valueObject.setTreatmentsoffered( Treatmentsoffered );
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
	public static ims.medical.domain.objects.OPDFertClinic extractOPDFertClinic(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.OPDFertClinicVo valueObject) 
	{
		return 	extractOPDFertClinic(domainFactory, valueObject, new HashMap());
	}

	public static ims.medical.domain.objects.OPDFertClinic extractOPDFertClinic(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.OPDFertClinicVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_OPDFertClinic();
		ims.medical.domain.objects.OPDFertClinic domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.medical.domain.objects.OPDFertClinic)domMap.get(valueObject);
			}
			// ims.generalmedical.vo.OPDFertClinicVo ID_OPDFertClinic field is unknown
			domainObject = new ims.medical.domain.objects.OPDFertClinic();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_OPDFertClinic());
			if (domMap.get(key) != null)
			{
				return (ims.medical.domain.objects.OPDFertClinic)domMap.get(key);
			}
			domainObject = (ims.medical.domain.objects.OPDFertClinic) domainFactory.getDomainObject(ims.medical.domain.objects.OPDFertClinic.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_OPDFertClinic());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getAchieveErection() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getAchieveErection().getID());
		}
		domainObject.setAchieveErection(value1);
		ims.spinalinjuries.vo.lookups.FCErectDysTreatmentsCollection collection2 =
	valueObject.getErectDysfxTreatments();
	    java.util.List domainErectDysfxTreatments = domainObject.getErectDysfxTreatments();;			
	    int collection2Size=0;
		if (collection2 == null)
		{
			domainErectDysfxTreatments = new java.util.ArrayList(0);
		}
		else
		{
			collection2Size = collection2.size();
		}
		
		for(int i=0; i<collection2Size; i++) 
		{
			int instanceId = collection2.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainErectDysfxTreatments.indexOf(dom);
			if (domIdx == -1)
			{
				domainErectDysfxTreatments.add(i, dom);
			}
			else if (i != domIdx && i < domainErectDysfxTreatments.size())
			{
				Object tmp = domainErectDysfxTreatments.get(i);
				domainErectDysfxTreatments.set(i, domainErectDysfxTreatments.get(domIdx));
				domainErectDysfxTreatments.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j2 = domainErectDysfxTreatments.size();
		while (j2 > collection2Size)
		{
			domainErectDysfxTreatments.remove(j2-1);
			j2 = domainErectDysfxTreatments.size();
		}

		domainObject.setErectDysfxTreatments(domainErectDysfxTreatments);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getSexDrive() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getSexDrive().getID());
		}
		domainObject.setSexDrive(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getEjaculation() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getEjaculation().getID());
		}
		domainObject.setEjaculation(value4);
		ims.spinalinjuries.vo.lookups.FCBladderDrainageCollection collection5 =
	valueObject.getBladderDrainage();
	    java.util.List domainBladderDrainage = domainObject.getBladderDrainage();;			
	    int collection5Size=0;
		if (collection5 == null)
		{
			domainBladderDrainage = new java.util.ArrayList(0);
		}
		else
		{
			collection5Size = collection5.size();
		}
		
		for(int i=0; i<collection5Size; i++) 
		{
			int instanceId = collection5.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainBladderDrainage.indexOf(dom);
			if (domIdx == -1)
			{
				domainBladderDrainage.add(i, dom);
			}
			else if (i != domIdx && i < domainBladderDrainage.size())
			{
				Object tmp = domainBladderDrainage.get(i);
				domainBladderDrainage.set(i, domainBladderDrainage.get(domIdx));
				domainBladderDrainage.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j5 = domainBladderDrainage.size();
		while (j5 > collection5Size)
		{
			domainBladderDrainage.remove(j5-1);
			j5 = domainBladderDrainage.size();
		}

		domainObject.setBladderDrainage(domainBladderDrainage);		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getBladderDrainagetxt() != null && valueObject.getBladderDrainagetxt().equals(""))
		{
			valueObject.setBladderDrainagetxt(null);
		}
		domainObject.setBladderDrainagetxt(valueObject.getBladderDrainagetxt());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getTestAtrophy() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getTestAtrophy().getID());
		}
		domainObject.setTestAtrophy(value7);
		ims.spinalinjuries.vo.lookups.FCEndoEvalCollection collection8 =
	valueObject.getEndoEvalPerf();
	    java.util.List domainEndoEvalPerf = domainObject.getEndoEvalPerf();;			
	    int collection8Size=0;
		if (collection8 == null)
		{
			domainEndoEvalPerf = new java.util.ArrayList(0);
		}
		else
		{
			collection8Size = collection8.size();
		}
		
		for(int i=0; i<collection8Size; i++) 
		{
			int instanceId = collection8.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainEndoEvalPerf.indexOf(dom);
			if (domIdx == -1)
			{
				domainEndoEvalPerf.add(i, dom);
			}
			else if (i != domIdx && i < domainEndoEvalPerf.size())
			{
				Object tmp = domainEndoEvalPerf.get(i);
				domainEndoEvalPerf.set(i, domainEndoEvalPerf.get(domIdx));
				domainEndoEvalPerf.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j8 = domainEndoEvalPerf.size();
		while (j8 > collection8Size)
		{
			domainEndoEvalPerf.remove(j8-1);
			j8 = domainEndoEvalPerf.size();
		}

		domainObject.setEndoEvalPerf(domainEndoEvalPerf);		
		ims.spinalinjuries.vo.lookups.FCInfectionScreeningCollection collection9 =
	valueObject.getInfxnScreening();
	    java.util.List domainInfxnScreening = domainObject.getInfxnScreening();;			
	    int collection9Size=0;
		if (collection9 == null)
		{
			domainInfxnScreening = new java.util.ArrayList(0);
		}
		else
		{
			collection9Size = collection9.size();
		}
		
		for(int i=0; i<collection9Size; i++) 
		{
			int instanceId = collection9.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainInfxnScreening.indexOf(dom);
			if (domIdx == -1)
			{
				domainInfxnScreening.add(i, dom);
			}
			else if (i != domIdx && i < domainInfxnScreening.size())
			{
				Object tmp = domainInfxnScreening.get(i);
				domainInfxnScreening.set(i, domainInfxnScreening.get(domIdx));
				domainInfxnScreening.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j9 = domainInfxnScreening.size();
		while (j9 > collection9Size)
		{
			domainInfxnScreening.remove(j9-1);
			j9 = domainInfxnScreening.size();
		}

		domainObject.setInfxnScreening(domainInfxnScreening);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getScreenConsent() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getScreenConsent().getID());
		}
		domainObject.setScreenConsent(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getSemenCulture() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getSemenCulture().getID());
		}
		domainObject.setSemenCulture(value11);
		domainObject.setSemenFindings(ims.generalmedical.vo.domain.OPDFertCLinicSemenAnaAssembler.extractOPDFertClinicSemenAnaSet(domainFactory, valueObject.getSemenFindings(), domainObject.getSemenFindings(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getElisa() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getElisa().getID());
		}
		domainObject.setElisa(value13);
		ims.spinalinjuries.vo.lookups.FCmethodsSuccessWithCollection collection14 =
	valueObject.getMethodssuccessWith();
	    java.util.List domainMethodssuccessWith = domainObject.getMethodssuccessWith();;			
	    int collection14Size=0;
		if (collection14 == null)
		{
			domainMethodssuccessWith = new java.util.ArrayList(0);
		}
		else
		{
			collection14Size = collection14.size();
		}
		
		for(int i=0; i<collection14Size; i++) 
		{
			int instanceId = collection14.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainMethodssuccessWith.indexOf(dom);
			if (domIdx == -1)
			{
				domainMethodssuccessWith.add(i, dom);
			}
			else if (i != domIdx && i < domainMethodssuccessWith.size())
			{
				Object tmp = domainMethodssuccessWith.get(i);
				domainMethodssuccessWith.set(i, domainMethodssuccessWith.get(domIdx));
				domainMethodssuccessWith.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j14 = domainMethodssuccessWith.size();
		while (j14 > collection14Size)
		{
			domainMethodssuccessWith.remove(j14-1);
			j14 = domainMethodssuccessWith.size();
		}

		domainObject.setMethodssuccessWith(domainMethodssuccessWith);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getSpermFrozen() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getSpermFrozen().getID());
		}
		domainObject.setSpermFrozen(value15);
		ims.spinalinjuries.vo.lookups.FCTreatmentsOfferedCollection collection16 =
	valueObject.getTreatmentsoffered();
	    java.util.List domainTreatmentsoffered = domainObject.getTreatmentsoffered();;			
	    int collection16Size=0;
		if (collection16 == null)
		{
			domainTreatmentsoffered = new java.util.ArrayList(0);
		}
		else
		{
			collection16Size = collection16.size();
		}
		
		for(int i=0; i<collection16Size; i++) 
		{
			int instanceId = collection16.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainTreatmentsoffered.indexOf(dom);
			if (domIdx == -1)
			{
				domainTreatmentsoffered.add(i, dom);
			}
			else if (i != domIdx && i < domainTreatmentsoffered.size())
			{
				Object tmp = domainTreatmentsoffered.get(i);
				domainTreatmentsoffered.set(i, domainTreatmentsoffered.get(domIdx));
				domainTreatmentsoffered.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j16 = domainTreatmentsoffered.size();
		while (j16 > collection16Size)
		{
			domainTreatmentsoffered.remove(j16-1);
			j16 = domainTreatmentsoffered.size();
		}

		domainObject.setTreatmentsoffered(domainTreatmentsoffered);		
		ims.core.admin.domain.objects.CareContext value17 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value17 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value17 = domainObject.getCareContext();	
			}
			else
			{
				value17 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value17);
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));

		return domainObject;
	}

}
