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
package ims.oncology.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Catalin Tomozei
 */
public class TeletherapyDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.oncology.vo.TeletherapyDetailsVo copy(ims.oncology.vo.TeletherapyDetailsVo valueObjectDest, ims.oncology.vo.TeletherapyDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_TeletherapyDetails(valueObjectSrc.getID_TeletherapyDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ActualDose
		valueObjectDest.setActualDose(valueObjectSrc.getActualDose());
		// ActualFractions
		valueObjectDest.setActualFractions(valueObjectSrc.getActualFractions());
		// BeamType
		valueObjectDest.setBeamType(valueObjectSrc.getBeamType());
		// BeamEnergy
		valueObjectDest.setBeamEnergy(valueObjectSrc.getBeamEnergy());
		// NoOfFields
		valueObjectDest.setNoOfFields(valueObjectSrc.getNoOfFields());
		// ComplexityGroup
		valueObjectDest.setComplexityGroup(valueObjectSrc.getComplexityGroup());
		// MultiplePlanning
		valueObjectDest.setMultiplePlanning(valueObjectSrc.getMultiplePlanning());
		// Hyperfractionation
		valueObjectDest.setHyperfractionation(valueObjectSrc.getHyperfractionation());
		// PhaseDetails
		valueObjectDest.setPhaseDetails(valueObjectSrc.getPhaseDetails());
		// PerscriptionPoint
		valueObjectDest.setPerscriptionPoint(valueObjectSrc.getPerscriptionPoint());
		// ActualPhases
		valueObjectDest.setActualPhases(valueObjectSrc.getActualPhases());
		// Anterior
		valueObjectDest.setAnterior(valueObjectSrc.getAnterior());
		// AnteriorDose
		valueObjectDest.setAnteriorDose(valueObjectSrc.getAnteriorDose());
		// AnteriorFractions
		valueObjectDest.setAnteriorFractions(valueObjectSrc.getAnteriorFractions());
		// hasAdjacentFields
		valueObjectDest.setHasAdjacentFields(valueObjectSrc.getHasAdjacentFields());
		// AdjacentFieldDetails
		valueObjectDest.setAdjacentFieldDetails(valueObjectSrc.getAdjacentFieldDetails());
		// Retreatment
		valueObjectDest.setRetreatment(valueObjectSrc.getRetreatment());
		// SpecialTechnique
		valueObjectDest.setSpecialTechnique(valueObjectSrc.getSpecialTechnique());
		// Preoperative
		valueObjectDest.setPreoperative(valueObjectSrc.getPreoperative());
		// GeneralAnaesthetic
		valueObjectDest.setGeneralAnaesthetic(valueObjectSrc.getGeneralAnaesthetic());
		// ActualDuration
		valueObjectDest.setActualDuration(valueObjectSrc.getActualDuration());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTeletherapyDetailsVoCollectionFromTeletherapyDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.TeletherapyDetails objects.
	 */
	public static ims.oncology.vo.TeletherapyDetailsVoCollection createTeletherapyDetailsVoCollectionFromTeletherapyDetails(java.util.Set domainObjectSet)	
	{
		return createTeletherapyDetailsVoCollectionFromTeletherapyDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.TeletherapyDetails objects.
	 */
	public static ims.oncology.vo.TeletherapyDetailsVoCollection createTeletherapyDetailsVoCollectionFromTeletherapyDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.oncology.vo.TeletherapyDetailsVoCollection voList = new ims.oncology.vo.TeletherapyDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.oncology.domain.objects.TeletherapyDetails domainObject = (ims.oncology.domain.objects.TeletherapyDetails) iterator.next();
			ims.oncology.vo.TeletherapyDetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.oncology.domain.objects.TeletherapyDetails objects.
	 */
	public static ims.oncology.vo.TeletherapyDetailsVoCollection createTeletherapyDetailsVoCollectionFromTeletherapyDetails(java.util.List domainObjectList) 
	{
		return createTeletherapyDetailsVoCollectionFromTeletherapyDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.domain.objects.TeletherapyDetails objects.
	 */
	public static ims.oncology.vo.TeletherapyDetailsVoCollection createTeletherapyDetailsVoCollectionFromTeletherapyDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.oncology.vo.TeletherapyDetailsVoCollection voList = new ims.oncology.vo.TeletherapyDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.domain.objects.TeletherapyDetails domainObject = (ims.oncology.domain.objects.TeletherapyDetails) domainObjectList.get(i);
			ims.oncology.vo.TeletherapyDetailsVo vo = create(map, domainObject);

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
	 * Create the ims.oncology.domain.objects.TeletherapyDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTeletherapyDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.TeletherapyDetailsVoCollection voCollection) 
	 {
	 	return extractTeletherapyDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTeletherapyDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.TeletherapyDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.TeletherapyDetailsVo vo = voCollection.get(i);
			ims.oncology.domain.objects.TeletherapyDetails domainObject = TeletherapyDetailsVoAssembler.extractTeletherapyDetails(domainFactory, vo, domMap);

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
	 * Create the ims.oncology.domain.objects.TeletherapyDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTeletherapyDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.TeletherapyDetailsVoCollection voCollection) 
	 {
	 	return extractTeletherapyDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTeletherapyDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.TeletherapyDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.TeletherapyDetailsVo vo = voCollection.get(i);
			ims.oncology.domain.objects.TeletherapyDetails domainObject = TeletherapyDetailsVoAssembler.extractTeletherapyDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.oncology.domain.objects.TeletherapyDetails object.
	 * @param domainObject ims.oncology.domain.objects.TeletherapyDetails
	 */
	 public static ims.oncology.vo.TeletherapyDetailsVo create(ims.oncology.domain.objects.TeletherapyDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.oncology.domain.objects.TeletherapyDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.oncology.vo.TeletherapyDetailsVo create(DomainObjectMap map, ims.oncology.domain.objects.TeletherapyDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.oncology.vo.TeletherapyDetailsVo valueObject = (ims.oncology.vo.TeletherapyDetailsVo) map.getValueObject(domainObject, ims.oncology.vo.TeletherapyDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.oncology.vo.TeletherapyDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.oncology.domain.objects.TeletherapyDetails
	 */
	 public static ims.oncology.vo.TeletherapyDetailsVo insert(ims.oncology.vo.TeletherapyDetailsVo valueObject, ims.oncology.domain.objects.TeletherapyDetails domainObject) 
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
	 * @param domainObject ims.oncology.domain.objects.TeletherapyDetails
	 */
	 public static ims.oncology.vo.TeletherapyDetailsVo insert(DomainObjectMap map, ims.oncology.vo.TeletherapyDetailsVo valueObject, ims.oncology.domain.objects.TeletherapyDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_TeletherapyDetails(domainObject.getId());
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
			
		// ActualDose
		valueObject.setActualDose(domainObject.getActualDose());
		// ActualFractions
		valueObject.setActualFractions(domainObject.getActualFractions());
		// BeamType
		ims.domain.lookups.LookupInstance instance3 = domainObject.getBeamType();
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

			ims.oncology.vo.lookups.BeamType voLookup3 = new ims.oncology.vo.lookups.BeamType(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.oncology.vo.lookups.BeamType parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.oncology.vo.lookups.BeamType(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setBeamType(voLookup3);
		}
				// BeamEnergy
		ims.domain.lookups.LookupInstance instance4 = domainObject.getBeamEnergy();
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

			ims.oncology.vo.lookups.BeamEnergy voLookup4 = new ims.oncology.vo.lookups.BeamEnergy(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.oncology.vo.lookups.BeamEnergy parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.oncology.vo.lookups.BeamEnergy(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setBeamEnergy(voLookup4);
		}
				// NoOfFields
		ims.domain.lookups.LookupInstance instance5 = domainObject.getNoOfFields();
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

			ims.oncology.vo.lookups.NoOfFields voLookup5 = new ims.oncology.vo.lookups.NoOfFields(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.oncology.vo.lookups.NoOfFields parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.oncology.vo.lookups.NoOfFields(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setNoOfFields(voLookup5);
		}
				// ComplexityGroup
		ims.domain.lookups.LookupInstance instance6 = domainObject.getComplexityGroup();
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

			ims.oncology.vo.lookups.ComplexityGroup voLookup6 = new ims.oncology.vo.lookups.ComplexityGroup(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.oncology.vo.lookups.ComplexityGroup parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.oncology.vo.lookups.ComplexityGroup(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setComplexityGroup(voLookup6);
		}
				// MultiplePlanning
		ims.domain.lookups.LookupInstance instance7 = domainObject.getMultiplePlanning();
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

			ims.core.vo.lookups.YesNo voLookup7 = new ims.core.vo.lookups.YesNo(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.core.vo.lookups.YesNo(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setMultiplePlanning(voLookup7);
		}
				// Hyperfractionation
		ims.domain.lookups.LookupInstance instance8 = domainObject.getHyperfractionation();
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

			ims.core.vo.lookups.YesNo voLookup8 = new ims.core.vo.lookups.YesNo(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.YesNo(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setHyperfractionation(voLookup8);
		}
				// PhaseDetails
		valueObject.setPhaseDetails(ims.oncology.vo.domain.TeletherapyPhaseVoAssembler.createTeletherapyPhaseVoCollectionFromTeletherapyPhase(map, domainObject.getPhaseDetails()) );
		// PerscriptionPoint
		valueObject.setPerscriptionPoint(domainObject.getPerscriptionPoint());
		// ActualPhases
		valueObject.setActualPhases(domainObject.getActualPhases());
		// Anterior
		ims.domain.lookups.LookupInstance instance12 = domainObject.getAnterior();
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

			ims.core.vo.lookups.YesNo voLookup12 = new ims.core.vo.lookups.YesNo(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.core.vo.lookups.YesNo(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setAnterior(voLookup12);
		}
				// AnteriorDose
		valueObject.setAnteriorDose(domainObject.getAnteriorDose());
		// AnteriorFractions
		valueObject.setAnteriorFractions(domainObject.getAnteriorFractions());
		// hasAdjacentFields
		ims.domain.lookups.LookupInstance instance15 = domainObject.getHasAdjacentFields();
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

			ims.core.vo.lookups.YesNo voLookup15 = new ims.core.vo.lookups.YesNo(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup15 = voLookup15;
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
								parentVoLookup15.setParent(new ims.core.vo.lookups.YesNo(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setHasAdjacentFields(voLookup15);
		}
				// AdjacentFieldDetails
		valueObject.setAdjacentFieldDetails(ims.oncology.vo.domain.AdjacentFieldPhaseVoAssembler.createAdjacentFieldPhaseVoCollectionFromAdjacentFieldPhase(map, domainObject.getAdjacentFieldDetails()) );
		// Retreatment
		ims.domain.lookups.LookupInstance instance17 = domainObject.getRetreatment();
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

			ims.core.vo.lookups.YesNo voLookup17 = new ims.core.vo.lookups.YesNo(instance17.getId(),instance17.getText(), instance17.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup17 = voLookup17;
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
								parentVoLookup17.setParent(new ims.core.vo.lookups.YesNo(parent17.getId(),parent17.getText(), parent17.isActive(), null, img, color));
				parentVoLookup17 = parentVoLookup17.getParent();
								parent17 = parent17.getParent();
			}			
			valueObject.setRetreatment(voLookup17);
		}
				// SpecialTechnique
		ims.domain.lookups.LookupInstance instance18 = domainObject.getSpecialTechnique();
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

			ims.oncology.vo.lookups.SpecialTechnique voLookup18 = new ims.oncology.vo.lookups.SpecialTechnique(instance18.getId(),instance18.getText(), instance18.isActive(), null, img, color);
			ims.oncology.vo.lookups.SpecialTechnique parentVoLookup18 = voLookup18;
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
								parentVoLookup18.setParent(new ims.oncology.vo.lookups.SpecialTechnique(parent18.getId(),parent18.getText(), parent18.isActive(), null, img, color));
				parentVoLookup18 = parentVoLookup18.getParent();
								parent18 = parent18.getParent();
			}			
			valueObject.setSpecialTechnique(voLookup18);
		}
				// Preoperative
		ims.domain.lookups.LookupInstance instance19 = domainObject.getPreoperative();
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

			ims.core.vo.lookups.YesNo voLookup19 = new ims.core.vo.lookups.YesNo(instance19.getId(),instance19.getText(), instance19.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup19 = voLookup19;
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
								parentVoLookup19.setParent(new ims.core.vo.lookups.YesNo(parent19.getId(),parent19.getText(), parent19.isActive(), null, img, color));
				parentVoLookup19 = parentVoLookup19.getParent();
								parent19 = parent19.getParent();
			}			
			valueObject.setPreoperative(voLookup19);
		}
				// GeneralAnaesthetic
		ims.domain.lookups.LookupInstance instance20 = domainObject.getGeneralAnaesthetic();
		if ( null != instance20 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance20.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance20.getImage().getImageId(), instance20.getImage().getImagePath());
			}
			color = instance20.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup20 = new ims.core.vo.lookups.YesNo(instance20.getId(),instance20.getText(), instance20.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup20 = voLookup20;
			ims.domain.lookups.LookupInstance parent20 = instance20.getParent();
			while (parent20 != null)
			{
				if (parent20.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent20.getImage().getImageId(), parent20.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent20.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup20.setParent(new ims.core.vo.lookups.YesNo(parent20.getId(),parent20.getText(), parent20.isActive(), null, img, color));
				parentVoLookup20 = parentVoLookup20.getParent();
								parent20 = parent20.getParent();
			}			
			valueObject.setGeneralAnaesthetic(voLookup20);
		}
				// ActualDuration
		valueObject.setActualDuration(domainObject.getActualDuration());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.domain.objects.TeletherapyDetails extractTeletherapyDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.TeletherapyDetailsVo valueObject) 
	{
		return 	extractTeletherapyDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.domain.objects.TeletherapyDetails extractTeletherapyDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.TeletherapyDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_TeletherapyDetails();
		ims.oncology.domain.objects.TeletherapyDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.oncology.domain.objects.TeletherapyDetails)domMap.get(valueObject);
			}
			// ims.oncology.vo.TeletherapyDetailsVo ID_TeletherapyDetails field is unknown
			domainObject = new ims.oncology.domain.objects.TeletherapyDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_TeletherapyDetails());
			if (domMap.get(key) != null)
			{
				return (ims.oncology.domain.objects.TeletherapyDetails)domMap.get(key);
			}
			domainObject = (ims.oncology.domain.objects.TeletherapyDetails) domainFactory.getDomainObject(ims.oncology.domain.objects.TeletherapyDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_TeletherapyDetails());

		domainObject.setActualDose(valueObject.getActualDose());
		domainObject.setActualFractions(valueObject.getActualFractions());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getBeamType() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getBeamType().getID());
		}
		domainObject.setBeamType(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getBeamEnergy() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getBeamEnergy().getID());
		}
		domainObject.setBeamEnergy(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getNoOfFields() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getNoOfFields().getID());
		}
		domainObject.setNoOfFields(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getComplexityGroup() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getComplexityGroup().getID());
		}
		domainObject.setComplexityGroup(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getMultiplePlanning() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getMultiplePlanning().getID());
		}
		domainObject.setMultiplePlanning(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getHyperfractionation() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getHyperfractionation().getID());
		}
		domainObject.setHyperfractionation(value8);
		domainObject.setPhaseDetails(ims.oncology.vo.domain.TeletherapyPhaseVoAssembler.extractTeletherapyPhaseList(domainFactory, valueObject.getPhaseDetails(), domainObject.getPhaseDetails(), domMap));		
		domainObject.setPerscriptionPoint(valueObject.getPerscriptionPoint());
		domainObject.setActualPhases(valueObject.getActualPhases());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getAnterior() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getAnterior().getID());
		}
		domainObject.setAnterior(value12);
		domainObject.setAnteriorDose(valueObject.getAnteriorDose());
		domainObject.setAnteriorFractions(valueObject.getAnteriorFractions());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getHasAdjacentFields() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getHasAdjacentFields().getID());
		}
		domainObject.setHasAdjacentFields(value15);
		domainObject.setAdjacentFieldDetails(ims.oncology.vo.domain.AdjacentFieldPhaseVoAssembler.extractAdjacentFieldPhaseList(domainFactory, valueObject.getAdjacentFieldDetails(), domainObject.getAdjacentFieldDetails(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value17 = null;
		if ( null != valueObject.getRetreatment() ) 
		{
			value17 =
				domainFactory.getLookupInstance(valueObject.getRetreatment().getID());
		}
		domainObject.setRetreatment(value17);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value18 = null;
		if ( null != valueObject.getSpecialTechnique() ) 
		{
			value18 =
				domainFactory.getLookupInstance(valueObject.getSpecialTechnique().getID());
		}
		domainObject.setSpecialTechnique(value18);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value19 = null;
		if ( null != valueObject.getPreoperative() ) 
		{
			value19 =
				domainFactory.getLookupInstance(valueObject.getPreoperative().getID());
		}
		domainObject.setPreoperative(value19);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value20 = null;
		if ( null != valueObject.getGeneralAnaesthetic() ) 
		{
			value20 =
				domainFactory.getLookupInstance(valueObject.getGeneralAnaesthetic().getID());
		}
		domainObject.setGeneralAnaesthetic(value20);
		domainObject.setActualDuration(valueObject.getActualDuration());

		return domainObject;
	}

}
