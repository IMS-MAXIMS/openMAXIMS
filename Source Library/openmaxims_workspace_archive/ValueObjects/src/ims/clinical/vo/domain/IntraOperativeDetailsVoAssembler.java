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
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class IntraOperativeDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.IntraOperativeDetailsVo copy(ims.clinical.vo.IntraOperativeDetailsVo valueObjectDest, ims.clinical.vo.IntraOperativeDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_IntraOperativeDetails(valueObjectSrc.getID_IntraOperativeDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// SkinPreparationUsed
		valueObjectDest.setSkinPreparationUsed(valueObjectSrc.getSkinPreparationUsed());
		// Dressing
		valueObjectDest.setDressing(valueObjectSrc.getDressing());
		// MlsOfWaterIballoon
		valueObjectDest.setMlsOfWaterIballoon(valueObjectSrc.getMlsOfWaterIballoon());
		// NationalJointRegistryCompleted
		valueObjectDest.setNationalJointRegistryCompleted(valueObjectSrc.getNationalJointRegistryCompleted());
		// DiathermyPlateDetail
		valueObjectDest.setDiathermyPlateDetail(valueObjectSrc.getDiathermyPlateDetail());
		// LimbCare
		valueObjectDest.setLimbCare(valueObjectSrc.getLimbCare());
		// Drains
		valueObjectDest.setDrains(valueObjectSrc.getDrains());
		// SkinClosure
		valueObjectDest.setSkinClosure(valueObjectSrc.getSkinClosure());
		// LocalAnastheticUsed
		valueObjectDest.setLocalAnastheticUsed(valueObjectSrc.getLocalAnastheticUsed());
		// PatientPosition
		valueObjectDest.setPatientPosition(valueObjectSrc.getPatientPosition());
		// TourniquetDetail
		valueObjectDest.setTourniquetDetail(valueObjectSrc.getTourniquetDetail());
		// SpecimenType
		valueObjectDest.setSpecimenType(valueObjectSrc.getSpecimenType());
		// Histopathology
		valueObjectDest.setHistopathology(valueObjectSrc.getHistopathology());
		// Microbiology
		valueObjectDest.setMicrobiology(valueObjectSrc.getMicrobiology());
		// Haematology
		valueObjectDest.setHaematology(valueObjectSrc.getHaematology());
		// Cytology
		valueObjectDest.setCytology(valueObjectSrc.getCytology());
		// CatheterDetail
		valueObjectDest.setCatheterDetail(valueObjectSrc.getCatheterDetail());
		// OtherSkinPreparationUsed
		valueObjectDest.setOtherSkinPreparationUsed(valueObjectSrc.getOtherSkinPreparationUsed());
		// NationalJointRegistryCompletedBy
		valueObjectDest.setNationalJointRegistryCompletedBy(valueObjectSrc.getNationalJointRegistryCompletedBy());
		// DiathermyPlateDetailSiteTwo
		valueObjectDest.setDiathermyPlateDetailSiteTwo(valueObjectSrc.getDiathermyPlateDetailSiteTwo());
		// SwabCount
		valueObjectDest.setSwabCount(valueObjectSrc.getSwabCount());
		// NeedleCount
		valueObjectDest.setNeedleCount(valueObjectSrc.getNeedleCount());
		// InstrumentCount
		valueObjectDest.setInstrumentCount(valueObjectSrc.getInstrumentCount());
		// ScrubNurse
		valueObjectDest.setScrubNurse(valueObjectSrc.getScrubNurse());
		// CirculatingNurse
		valueObjectDest.setCirculatingNurse(valueObjectSrc.getCirculatingNurse());
		// CountComments
		valueObjectDest.setCountComments(valueObjectSrc.getCountComments());
		// TableDevices
		valueObjectDest.setTableDevices(valueObjectSrc.getTableDevices());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createIntraOperativeDetailsVoCollectionFromIntraOperativeDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.IntraOperativeDetails objects.
	 */
	public static ims.clinical.vo.IntraOperativeDetailsVoCollection createIntraOperativeDetailsVoCollectionFromIntraOperativeDetails(java.util.Set domainObjectSet)	
	{
		return createIntraOperativeDetailsVoCollectionFromIntraOperativeDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.IntraOperativeDetails objects.
	 */
	public static ims.clinical.vo.IntraOperativeDetailsVoCollection createIntraOperativeDetailsVoCollectionFromIntraOperativeDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.IntraOperativeDetailsVoCollection voList = new ims.clinical.vo.IntraOperativeDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.IntraOperativeDetails domainObject = (ims.core.clinical.domain.objects.IntraOperativeDetails) iterator.next();
			ims.clinical.vo.IntraOperativeDetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.IntraOperativeDetails objects.
	 */
	public static ims.clinical.vo.IntraOperativeDetailsVoCollection createIntraOperativeDetailsVoCollectionFromIntraOperativeDetails(java.util.List domainObjectList) 
	{
		return createIntraOperativeDetailsVoCollectionFromIntraOperativeDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.IntraOperativeDetails objects.
	 */
	public static ims.clinical.vo.IntraOperativeDetailsVoCollection createIntraOperativeDetailsVoCollectionFromIntraOperativeDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.IntraOperativeDetailsVoCollection voList = new ims.clinical.vo.IntraOperativeDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.IntraOperativeDetails domainObject = (ims.core.clinical.domain.objects.IntraOperativeDetails) domainObjectList.get(i);
			ims.clinical.vo.IntraOperativeDetailsVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.IntraOperativeDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractIntraOperativeDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.IntraOperativeDetailsVoCollection voCollection) 
	 {
	 	return extractIntraOperativeDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractIntraOperativeDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.IntraOperativeDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.IntraOperativeDetailsVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.IntraOperativeDetails domainObject = IntraOperativeDetailsVoAssembler.extractIntraOperativeDetails(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.IntraOperativeDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractIntraOperativeDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.IntraOperativeDetailsVoCollection voCollection) 
	 {
	 	return extractIntraOperativeDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractIntraOperativeDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.IntraOperativeDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.IntraOperativeDetailsVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.IntraOperativeDetails domainObject = IntraOperativeDetailsVoAssembler.extractIntraOperativeDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.IntraOperativeDetails object.
	 * @param domainObject ims.core.clinical.domain.objects.IntraOperativeDetails
	 */
	 public static ims.clinical.vo.IntraOperativeDetailsVo create(ims.core.clinical.domain.objects.IntraOperativeDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.IntraOperativeDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.IntraOperativeDetailsVo create(DomainObjectMap map, ims.core.clinical.domain.objects.IntraOperativeDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.IntraOperativeDetailsVo valueObject = (ims.clinical.vo.IntraOperativeDetailsVo) map.getValueObject(domainObject, ims.clinical.vo.IntraOperativeDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.IntraOperativeDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.IntraOperativeDetails
	 */
	 public static ims.clinical.vo.IntraOperativeDetailsVo insert(ims.clinical.vo.IntraOperativeDetailsVo valueObject, ims.core.clinical.domain.objects.IntraOperativeDetails domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.IntraOperativeDetails
	 */
	 public static ims.clinical.vo.IntraOperativeDetailsVo insert(DomainObjectMap map, ims.clinical.vo.IntraOperativeDetailsVo valueObject, ims.core.clinical.domain.objects.IntraOperativeDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_IntraOperativeDetails(domainObject.getId());
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
			
		// SkinPreparationUsed
		java.util.List listSkinPreparationUsed = domainObject.getSkinPreparationUsed();
		ims.clinical.vo.lookups.SkinPreparationusedCollection SkinPreparationUsed = new ims.clinical.vo.lookups.SkinPreparationusedCollection();
		for(java.util.Iterator iterator = listSkinPreparationUsed.iterator(); iterator.hasNext(); ) 
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
			ims.clinical.vo.lookups.SkinPreparationused voInstance = new ims.clinical.vo.lookups.SkinPreparationused(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.clinical.vo.lookups.SkinPreparationused parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.clinical.vo.lookups.SkinPreparationused(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			SkinPreparationUsed.add(voInstance);
		}
		valueObject.setSkinPreparationUsed( SkinPreparationUsed );
		// Dressing
		java.util.List listDressing = domainObject.getDressing();
		ims.clinical.vo.lookups.DressingCollection Dressing = new ims.clinical.vo.lookups.DressingCollection();
		for(java.util.Iterator iterator = listDressing.iterator(); iterator.hasNext(); ) 
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
			ims.clinical.vo.lookups.Dressing voInstance = new ims.clinical.vo.lookups.Dressing(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.clinical.vo.lookups.Dressing parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.clinical.vo.lookups.Dressing(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			Dressing.add(voInstance);
		}
		valueObject.setDressing( Dressing );
		// MlsOfWaterIballoon
		valueObject.setMlsOfWaterIballoon(domainObject.getMlsOfWaterIballoon());
		// NationalJointRegistryCompleted
		ims.domain.lookups.LookupInstance instance4 = domainObject.getNationalJointRegistryCompleted();
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

			ims.core.vo.lookups.YesNo voLookup4 = new ims.core.vo.lookups.YesNo(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.YesNo(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setNationalJointRegistryCompleted(voLookup4);
		}
				// DiathermyPlateDetail
		valueObject.setDiathermyPlateDetail(ims.clinical.vo.domain.DiathermyPlateDetailVoAssembler.create(map, domainObject.getDiathermyPlateDetail()) );
		// LimbCare
		valueObject.setLimbCare(ims.clinical.vo.domain.LimbCareVoAssembler.create(map, domainObject.getLimbCare()) );
		// Drains
		valueObject.setDrains(ims.clinical.vo.domain.DrainsVoAssembler.create(map, domainObject.getDrains()) );
		// SkinClosure
		java.util.List listSkinClosure = domainObject.getSkinClosure();
		ims.clinical.vo.lookups.SkinClosureCollection SkinClosure = new ims.clinical.vo.lookups.SkinClosureCollection();
		for(java.util.Iterator iterator = listSkinClosure.iterator(); iterator.hasNext(); ) 
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
			ims.clinical.vo.lookups.SkinClosure voInstance = new ims.clinical.vo.lookups.SkinClosure(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.clinical.vo.lookups.SkinClosure parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.clinical.vo.lookups.SkinClosure(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			SkinClosure.add(voInstance);
		}
		valueObject.setSkinClosure( SkinClosure );
		// LocalAnastheticUsed
		valueObject.setLocalAnastheticUsed(ims.clinical.vo.domain.LocalAnaestheticAdministeredVoAssembler.createLocalAnaestheticAdministeredVoCollectionFromLocalAnaestheticAdministered(map, domainObject.getLocalAnastheticUsed()) );
		// PatientPosition
		ims.domain.lookups.LookupInstance instance10 = domainObject.getPatientPosition();
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

			ims.core.vo.lookups.PatientPosition voLookup10 = new ims.core.vo.lookups.PatientPosition(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.PatientPosition parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.core.vo.lookups.PatientPosition(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setPatientPosition(voLookup10);
		}
				// TourniquetDetail
		valueObject.setTourniquetDetail(ims.clinical.vo.domain.TourniquetDetailVoAssembler.create(map, domainObject.getTourniquetDetail()) );
		// SpecimenType
		valueObject.setSpecimenType(domainObject.getSpecimenType());
		// Histopathology
		valueObject.setHistopathology( domainObject.isHistopathology() );
		// Microbiology
		valueObject.setMicrobiology( domainObject.isMicrobiology() );
		// Haematology
		valueObject.setHaematology( domainObject.isHaematology() );
		// Cytology
		valueObject.setCytology( domainObject.isCytology() );
		// CatheterDetail
		valueObject.setCatheterDetail(ims.clinical.vo.domain.CatheterDetailVoAssembler.create(map, domainObject.getCatheterDetail()) );
		// OtherSkinPreparationUsed
		valueObject.setOtherSkinPreparationUsed(domainObject.getOtherSkinPreparationUsed());
		// NationalJointRegistryCompletedBy
		valueObject.setNationalJointRegistryCompletedBy(ims.core.vo.domain.NurseVoAssembler.create(map, domainObject.getNationalJointRegistryCompletedBy()) );
		// DiathermyPlateDetailSiteTwo
		valueObject.setDiathermyPlateDetailSiteTwo(ims.clinical.vo.domain.DiathermyPlateDetailVoAssembler.create(map, domainObject.getDiathermyPlateDetailSiteTwo()) );
		// SwabCount
		ims.domain.lookups.LookupInstance instance21 = domainObject.getSwabCount();
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

			ims.core.vo.lookups.YesNo voLookup21 = new ims.core.vo.lookups.YesNo(instance21.getId(),instance21.getText(), instance21.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup21 = voLookup21;
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
								parentVoLookup21.setParent(new ims.core.vo.lookups.YesNo(parent21.getId(),parent21.getText(), parent21.isActive(), null, img, color));
				parentVoLookup21 = parentVoLookup21.getParent();
								parent21 = parent21.getParent();
			}			
			valueObject.setSwabCount(voLookup21);
		}
				// NeedleCount
		ims.domain.lookups.LookupInstance instance22 = domainObject.getNeedleCount();
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

			ims.core.vo.lookups.YesNo voLookup22 = new ims.core.vo.lookups.YesNo(instance22.getId(),instance22.getText(), instance22.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup22 = voLookup22;
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
								parentVoLookup22.setParent(new ims.core.vo.lookups.YesNo(parent22.getId(),parent22.getText(), parent22.isActive(), null, img, color));
				parentVoLookup22 = parentVoLookup22.getParent();
								parent22 = parent22.getParent();
			}			
			valueObject.setNeedleCount(voLookup22);
		}
				// InstrumentCount
		ims.domain.lookups.LookupInstance instance23 = domainObject.getInstrumentCount();
		if ( null != instance23 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance23.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance23.getImage().getImageId(), instance23.getImage().getImagePath());
			}
			color = instance23.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup23 = new ims.core.vo.lookups.YesNo(instance23.getId(),instance23.getText(), instance23.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup23 = voLookup23;
			ims.domain.lookups.LookupInstance parent23 = instance23.getParent();
			while (parent23 != null)
			{
				if (parent23.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent23.getImage().getImageId(), parent23.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent23.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup23.setParent(new ims.core.vo.lookups.YesNo(parent23.getId(),parent23.getText(), parent23.isActive(), null, img, color));
				parentVoLookup23 = parentVoLookup23.getParent();
								parent23 = parent23.getParent();
			}			
			valueObject.setInstrumentCount(voLookup23);
		}
				// ScrubNurse
		valueObject.setScrubNurse(ims.core.vo.domain.NurseVoAssembler.create(map, domainObject.getScrubNurse()) );
		// CirculatingNurse
		valueObject.setCirculatingNurse(ims.core.vo.domain.NurseVoAssembler.create(map, domainObject.getCirculatingNurse()) );
		// CountComments
		valueObject.setCountComments(domainObject.getCountComments());
		// TableDevices
		valueObject.setTableDevices(ims.clinical.vo.domain.TableDeviceVoAssembler.createTableDeviceVoCollectionFromTableDevice(map, domainObject.getTableDevices()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.IntraOperativeDetails extractIntraOperativeDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.IntraOperativeDetailsVo valueObject) 
	{
		return 	extractIntraOperativeDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.IntraOperativeDetails extractIntraOperativeDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.IntraOperativeDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_IntraOperativeDetails();
		ims.core.clinical.domain.objects.IntraOperativeDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.IntraOperativeDetails)domMap.get(valueObject);
			}
			// ims.clinical.vo.IntraOperativeDetailsVo ID_IntraOperativeDetails field is unknown
			domainObject = new ims.core.clinical.domain.objects.IntraOperativeDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_IntraOperativeDetails());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.IntraOperativeDetails)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.IntraOperativeDetails) domainFactory.getDomainObject(ims.core.clinical.domain.objects.IntraOperativeDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_IntraOperativeDetails());

		ims.clinical.vo.lookups.SkinPreparationusedCollection collection1 =
	valueObject.getSkinPreparationUsed();
	    java.util.List domainSkinPreparationUsed = domainObject.getSkinPreparationUsed();;			
	    int collection1Size=0;
		if (collection1 == null)
		{
			domainSkinPreparationUsed = new java.util.ArrayList(0);
		}
		else
		{
			collection1Size = collection1.size();
		}
		
		for(int i=0; i<collection1Size; i++) 
		{
			int instanceId = collection1.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainSkinPreparationUsed.indexOf(dom);
			if (domIdx == -1)
			{
				domainSkinPreparationUsed.add(i, dom);
			}
			else if (i != domIdx && i < domainSkinPreparationUsed.size())
			{
				Object tmp = domainSkinPreparationUsed.get(i);
				domainSkinPreparationUsed.set(i, domainSkinPreparationUsed.get(domIdx));
				domainSkinPreparationUsed.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j1 = domainSkinPreparationUsed.size();
		while (j1 > collection1Size)
		{
			domainSkinPreparationUsed.remove(j1-1);
			j1 = domainSkinPreparationUsed.size();
		}

		domainObject.setSkinPreparationUsed(domainSkinPreparationUsed);		
		ims.clinical.vo.lookups.DressingCollection collection2 =
	valueObject.getDressing();
	    java.util.List domainDressing = domainObject.getDressing();;			
	    int collection2Size=0;
		if (collection2 == null)
		{
			domainDressing = new java.util.ArrayList(0);
		}
		else
		{
			collection2Size = collection2.size();
		}
		
		for(int i=0; i<collection2Size; i++) 
		{
			int instanceId = collection2.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainDressing.indexOf(dom);
			if (domIdx == -1)
			{
				domainDressing.add(i, dom);
			}
			else if (i != domIdx && i < domainDressing.size())
			{
				Object tmp = domainDressing.get(i);
				domainDressing.set(i, domainDressing.get(domIdx));
				domainDressing.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j2 = domainDressing.size();
		while (j2 > collection2Size)
		{
			domainDressing.remove(j2-1);
			j2 = domainDressing.size();
		}

		domainObject.setDressing(domainDressing);		
		domainObject.setMlsOfWaterIballoon(valueObject.getMlsOfWaterIballoon());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getNationalJointRegistryCompleted() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getNationalJointRegistryCompleted().getID());
		}
		domainObject.setNationalJointRegistryCompleted(value4);
		domainObject.setDiathermyPlateDetail(ims.clinical.vo.domain.DiathermyPlateDetailVoAssembler.extractDiathermyPlateDetail(domainFactory, valueObject.getDiathermyPlateDetail(), domMap));
		domainObject.setLimbCare(ims.clinical.vo.domain.LimbCareVoAssembler.extractLimbCare(domainFactory, valueObject.getLimbCare(), domMap));
		domainObject.setDrains(ims.clinical.vo.domain.DrainsVoAssembler.extractDrains(domainFactory, valueObject.getDrains(), domMap));
		ims.clinical.vo.lookups.SkinClosureCollection collection8 =
	valueObject.getSkinClosure();
	    java.util.List domainSkinClosure = domainObject.getSkinClosure();;			
	    int collection8Size=0;
		if (collection8 == null)
		{
			domainSkinClosure = new java.util.ArrayList(0);
		}
		else
		{
			collection8Size = collection8.size();
		}
		
		for(int i=0; i<collection8Size; i++) 
		{
			int instanceId = collection8.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainSkinClosure.indexOf(dom);
			if (domIdx == -1)
			{
				domainSkinClosure.add(i, dom);
			}
			else if (i != domIdx && i < domainSkinClosure.size())
			{
				Object tmp = domainSkinClosure.get(i);
				domainSkinClosure.set(i, domainSkinClosure.get(domIdx));
				domainSkinClosure.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j8 = domainSkinClosure.size();
		while (j8 > collection8Size)
		{
			domainSkinClosure.remove(j8-1);
			j8 = domainSkinClosure.size();
		}

		domainObject.setSkinClosure(domainSkinClosure);		
		domainObject.setLocalAnastheticUsed(ims.clinical.vo.domain.LocalAnaestheticAdministeredVoAssembler.extractLocalAnaestheticAdministeredList(domainFactory, valueObject.getLocalAnastheticUsed(), domainObject.getLocalAnastheticUsed(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getPatientPosition() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getPatientPosition().getID());
		}
		domainObject.setPatientPosition(value10);
		domainObject.setTourniquetDetail(ims.clinical.vo.domain.TourniquetDetailVoAssembler.extractTourniquetDetail(domainFactory, valueObject.getTourniquetDetail(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSpecimenType() != null && valueObject.getSpecimenType().equals(""))
		{
			valueObject.setSpecimenType(null);
		}
		domainObject.setSpecimenType(valueObject.getSpecimenType());
		domainObject.setHistopathology(valueObject.getHistopathology());
		domainObject.setMicrobiology(valueObject.getMicrobiology());
		domainObject.setHaematology(valueObject.getHaematology());
		domainObject.setCytology(valueObject.getCytology());
		domainObject.setCatheterDetail(ims.clinical.vo.domain.CatheterDetailVoAssembler.extractCatheterDetail(domainFactory, valueObject.getCatheterDetail(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOtherSkinPreparationUsed() != null && valueObject.getOtherSkinPreparationUsed().equals(""))
		{
			valueObject.setOtherSkinPreparationUsed(null);
		}
		domainObject.setOtherSkinPreparationUsed(valueObject.getOtherSkinPreparationUsed());
		domainObject.setNationalJointRegistryCompletedBy(ims.core.vo.domain.NurseVoAssembler.extractNurse(domainFactory, valueObject.getNationalJointRegistryCompletedBy(), domMap));
		domainObject.setDiathermyPlateDetailSiteTwo(ims.clinical.vo.domain.DiathermyPlateDetailVoAssembler.extractDiathermyPlateDetail(domainFactory, valueObject.getDiathermyPlateDetailSiteTwo(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value21 = null;
		if ( null != valueObject.getSwabCount() ) 
		{
			value21 =
				domainFactory.getLookupInstance(valueObject.getSwabCount().getID());
		}
		domainObject.setSwabCount(value21);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value22 = null;
		if ( null != valueObject.getNeedleCount() ) 
		{
			value22 =
				domainFactory.getLookupInstance(valueObject.getNeedleCount().getID());
		}
		domainObject.setNeedleCount(value22);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value23 = null;
		if ( null != valueObject.getInstrumentCount() ) 
		{
			value23 =
				domainFactory.getLookupInstance(valueObject.getInstrumentCount().getID());
		}
		domainObject.setInstrumentCount(value23);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Nurse value24 = null;
		if ( null != valueObject.getScrubNurse() ) 
		{
			if (valueObject.getScrubNurse().getBoId() == null)
			{
				if (domMap.get(valueObject.getScrubNurse()) != null)
				{
					value24 = (ims.core.resource.people.domain.objects.Nurse)domMap.get(valueObject.getScrubNurse());
				}
			}
			else
			{
				value24 = (ims.core.resource.people.domain.objects.Nurse)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Nurse.class, valueObject.getScrubNurse().getBoId());
			}
		}
		domainObject.setScrubNurse(value24);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Nurse value25 = null;
		if ( null != valueObject.getCirculatingNurse() ) 
		{
			if (valueObject.getCirculatingNurse().getBoId() == null)
			{
				if (domMap.get(valueObject.getCirculatingNurse()) != null)
				{
					value25 = (ims.core.resource.people.domain.objects.Nurse)domMap.get(valueObject.getCirculatingNurse());
				}
			}
			else
			{
				value25 = (ims.core.resource.people.domain.objects.Nurse)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Nurse.class, valueObject.getCirculatingNurse().getBoId());
			}
		}
		domainObject.setCirculatingNurse(value25);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCountComments() != null && valueObject.getCountComments().equals(""))
		{
			valueObject.setCountComments(null);
		}
		domainObject.setCountComments(valueObject.getCountComments());
		domainObject.setTableDevices(ims.clinical.vo.domain.TableDeviceVoAssembler.extractTableDeviceList(domainFactory, valueObject.getTableDevices(), domainObject.getTableDevices(), domMap));		

		return domainObject;
	}

}
