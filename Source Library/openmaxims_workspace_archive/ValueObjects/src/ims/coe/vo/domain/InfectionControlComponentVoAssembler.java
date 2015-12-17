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
package ims.coe.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Peter Martin
 */
public class InfectionControlComponentVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.coe.vo.InfectionControlComponentVo copy(ims.coe.vo.InfectionControlComponentVo valueObjectDest, ims.coe.vo.InfectionControlComponentVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_AssessmentComponent(valueObjectSrc.getID_AssessmentComponent());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// MRSA
		valueObjectDest.setMRSA(valueObjectSrc.getMRSA());
		// MRSAComment
		valueObjectDest.setMRSAComment(valueObjectSrc.getMRSAComment());
		// Clostridium
		valueObjectDest.setClostridium(valueObjectSrc.getClostridium());
		// ClostridiumComment
		valueObjectDest.setClostridiumComment(valueObjectSrc.getClostridiumComment());
		// VRE
		valueObjectDest.setVRE(valueObjectSrc.getVRE());
		// VREComment
		valueObjectDest.setVREComment(valueObjectSrc.getVREComment());
		// ESBC
		valueObjectDest.setESBC(valueObjectSrc.getESBC());
		// ESBCComment
		valueObjectDest.setESBCComment(valueObjectSrc.getESBCComment());
		// TB
		valueObjectDest.setTB(valueObjectSrc.getTB());
		// TBComment
		valueObjectDest.setTBComment(valueObjectSrc.getTBComment());
		// Norovirus
		valueObjectDest.setNorovirus(valueObjectSrc.getNorovirus());
		// NorovirusComment
		valueObjectDest.setNorovirusComment(valueObjectSrc.getNorovirusComment());
		// ControlRequirement
		valueObjectDest.setControlRequirement(valueObjectSrc.getControlRequirement());
		// Notes
		valueObjectDest.setNotes(valueObjectSrc.getNotes());
		// InfectionControlAssessment
		valueObjectDest.setInfectionControlAssessment(valueObjectSrc.getInfectionControlAssessment());
		// isComplete
		valueObjectDest.setIsComplete(valueObjectSrc.getIsComplete());
		// AssessmentInfo
		valueObjectDest.setAssessmentInfo(valueObjectSrc.getAssessmentInfo());
		// Copy
		valueObjectDest.setCopy(valueObjectSrc.getCopy());
		// ComponentType
		valueObjectDest.setComponentType(valueObjectSrc.getComponentType());
		// CarePlanTemplate
		valueObjectDest.setCarePlanTemplate(valueObjectSrc.getCarePlanTemplate());
		// CarePlans
		valueObjectDest.setCarePlans(valueObjectSrc.getCarePlans());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createInfectionControlComponentVoCollectionFromInfectionControlComponent(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.coe.assessment.domain.objects.InfectionControlComponent objects.
	 */
	public static ims.coe.vo.InfectionControlComponentVoCollection createInfectionControlComponentVoCollectionFromInfectionControlComponent(java.util.Set domainObjectSet)	
	{
		return createInfectionControlComponentVoCollectionFromInfectionControlComponent(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.coe.assessment.domain.objects.InfectionControlComponent objects.
	 */
	public static ims.coe.vo.InfectionControlComponentVoCollection createInfectionControlComponentVoCollectionFromInfectionControlComponent(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.coe.vo.InfectionControlComponentVoCollection voList = new ims.coe.vo.InfectionControlComponentVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.coe.assessment.domain.objects.InfectionControlComponent domainObject = (ims.coe.assessment.domain.objects.InfectionControlComponent) iterator.next();
			ims.coe.vo.InfectionControlComponentVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.coe.assessment.domain.objects.InfectionControlComponent objects.
	 */
	public static ims.coe.vo.InfectionControlComponentVoCollection createInfectionControlComponentVoCollectionFromInfectionControlComponent(java.util.List domainObjectList) 
	{
		return createInfectionControlComponentVoCollectionFromInfectionControlComponent(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.coe.assessment.domain.objects.InfectionControlComponent objects.
	 */
	public static ims.coe.vo.InfectionControlComponentVoCollection createInfectionControlComponentVoCollectionFromInfectionControlComponent(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.coe.vo.InfectionControlComponentVoCollection voList = new ims.coe.vo.InfectionControlComponentVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.coe.assessment.domain.objects.InfectionControlComponent domainObject = (ims.coe.assessment.domain.objects.InfectionControlComponent) domainObjectList.get(i);
			ims.coe.vo.InfectionControlComponentVo vo = create(map, domainObject);

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
	 * Create the ims.coe.assessment.domain.objects.InfectionControlComponent set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractInfectionControlComponentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.InfectionControlComponentVoCollection voCollection) 
	 {
	 	return extractInfectionControlComponentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractInfectionControlComponentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.InfectionControlComponentVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.coe.vo.InfectionControlComponentVo vo = voCollection.get(i);
			ims.coe.assessment.domain.objects.InfectionControlComponent domainObject = InfectionControlComponentVoAssembler.extractInfectionControlComponent(domainFactory, vo, domMap);

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
	 * Create the ims.coe.assessment.domain.objects.InfectionControlComponent list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractInfectionControlComponentList(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.InfectionControlComponentVoCollection voCollection) 
	 {
	 	return extractInfectionControlComponentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractInfectionControlComponentList(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.InfectionControlComponentVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.coe.vo.InfectionControlComponentVo vo = voCollection.get(i);
			ims.coe.assessment.domain.objects.InfectionControlComponent domainObject = InfectionControlComponentVoAssembler.extractInfectionControlComponent(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.coe.assessment.domain.objects.InfectionControlComponent object.
	 * @param domainObject ims.coe.assessment.domain.objects.InfectionControlComponent
	 */
	 public static ims.coe.vo.InfectionControlComponentVo create(ims.coe.assessment.domain.objects.InfectionControlComponent domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.coe.assessment.domain.objects.InfectionControlComponent object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.coe.vo.InfectionControlComponentVo create(DomainObjectMap map, ims.coe.assessment.domain.objects.InfectionControlComponent domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.coe.vo.InfectionControlComponentVo valueObject = (ims.coe.vo.InfectionControlComponentVo) map.getValueObject(domainObject, ims.coe.vo.InfectionControlComponentVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.coe.vo.InfectionControlComponentVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.coe.assessment.domain.objects.InfectionControlComponent
	 */
	 public static ims.coe.vo.InfectionControlComponentVo insert(ims.coe.vo.InfectionControlComponentVo valueObject, ims.coe.assessment.domain.objects.InfectionControlComponent domainObject) 
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
	 * @param domainObject ims.coe.assessment.domain.objects.InfectionControlComponent
	 */
	 public static ims.coe.vo.InfectionControlComponentVo insert(DomainObjectMap map, ims.coe.vo.InfectionControlComponentVo valueObject, ims.coe.assessment.domain.objects.InfectionControlComponent domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_AssessmentComponent(domainObject.getId());
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
			
		// MRSA
		ims.domain.lookups.LookupInstance instance1 = domainObject.getMRSA();
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

			ims.core.vo.lookups.YesNoUnknown voLookup1 = new ims.core.vo.lookups.YesNoUnknown(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.core.vo.lookups.YesNoUnknown(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setMRSA(voLookup1);
		}
				// MRSAComment
		valueObject.setMRSAComment(domainObject.getMRSAComment());
		// Clostridium
		ims.domain.lookups.LookupInstance instance3 = domainObject.getClostridium();
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

			ims.core.vo.lookups.YesNoUnknown voLookup3 = new ims.core.vo.lookups.YesNoUnknown(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.YesNoUnknown(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setClostridium(voLookup3);
		}
				// ClostridiumComment
		valueObject.setClostridiumComment(domainObject.getClostridiumComment());
		// VRE
		ims.domain.lookups.LookupInstance instance5 = domainObject.getVRE();
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

			ims.core.vo.lookups.YesNoUnknown voLookup5 = new ims.core.vo.lookups.YesNoUnknown(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.YesNoUnknown(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setVRE(voLookup5);
		}
				// VREComment
		valueObject.setVREComment(domainObject.getVREComment());
		// ESBC
		ims.domain.lookups.LookupInstance instance7 = domainObject.getESBC();
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

			ims.core.vo.lookups.YesNoUnknown voLookup7 = new ims.core.vo.lookups.YesNoUnknown(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.core.vo.lookups.YesNoUnknown(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setESBC(voLookup7);
		}
				// ESBCComment
		valueObject.setESBCComment(domainObject.getESBCComment());
		// TB
		ims.domain.lookups.LookupInstance instance9 = domainObject.getTB();
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
			valueObject.setTB(voLookup9);
		}
				// TBComment
		valueObject.setTBComment(domainObject.getTBComment());
		// Norovirus
		ims.domain.lookups.LookupInstance instance11 = domainObject.getNorovirus();
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

			ims.core.vo.lookups.YesNoUnknown voLookup11 = new ims.core.vo.lookups.YesNoUnknown(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.core.vo.lookups.YesNoUnknown(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setNorovirus(voLookup11);
		}
				// NorovirusComment
		valueObject.setNorovirusComment(domainObject.getNorovirusComment());
		// ControlRequirement
		ims.domain.lookups.LookupInstance instance13 = domainObject.getControlRequirement();
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

			ims.core.vo.lookups.YesNoUnknown voLookup13 = new ims.core.vo.lookups.YesNoUnknown(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup13 = voLookup13;
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
								parentVoLookup13.setParent(new ims.core.vo.lookups.YesNoUnknown(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setControlRequirement(voLookup13);
		}
				// Notes
		valueObject.setNotes(domainObject.getNotes());
		// InfectionControlAssessment
		valueObject.setInfectionControlAssessment(ims.coe.vo.domain.InfectionControlRepeatableAssessmentVoAssembler.create(map, domainObject.getInfectionControlAssessment()) );
		// isComplete
		valueObject.setIsComplete( domainObject.isIsComplete() );
		// AssessmentInfo
		valueObject.setAssessmentInfo(ims.nursing.vo.domain.AssessmentInfoAssembler.createAssessmentInfoCollectionFromAssessmentInfo(map, domainObject.getAssessmentInfo()) );
		// Copy
		valueObject.setCopy( domainObject.isCopy() );
		// ComponentType
		ims.domain.lookups.LookupInstance instance19 = domainObject.getComponentType();
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

			ims.nursing.vo.lookups.AssessmentComponentType voLookup19 = new ims.nursing.vo.lookups.AssessmentComponentType(instance19.getId(),instance19.getText(), instance19.isActive(), null, img, color);
			ims.nursing.vo.lookups.AssessmentComponentType parentVoLookup19 = voLookup19;
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
								parentVoLookup19.setParent(new ims.nursing.vo.lookups.AssessmentComponentType(parent19.getId(),parent19.getText(), parent19.isActive(), null, img, color));
				parentVoLookup19 = parentVoLookup19.getParent();
								parent19 = parent19.getParent();
			}			
			valueObject.setComponentType(voLookup19);
		}
				// CarePlanTemplate
		valueObject.setCarePlanTemplate(ims.nursing.vo.domain.CarePlanTemplateAssembler.createCarePlanTemplateCollectionFromCarePlanTemplate(map, domainObject.getCarePlanTemplate()) );
		// CarePlans
		valueObject.setCarePlans(ims.nursing.vo.domain.CarePlanAssembler.createCarePlanCollectionFromCarePlan(map, domainObject.getCarePlans()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.coe.assessment.domain.objects.InfectionControlComponent extractInfectionControlComponent(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.InfectionControlComponentVo valueObject) 
	{
		return 	extractInfectionControlComponent(domainFactory, valueObject, new HashMap());
	}

	public static ims.coe.assessment.domain.objects.InfectionControlComponent extractInfectionControlComponent(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.InfectionControlComponentVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_AssessmentComponent();
		ims.coe.assessment.domain.objects.InfectionControlComponent domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.coe.assessment.domain.objects.InfectionControlComponent)domMap.get(valueObject);
			}
			// ims.coe.vo.InfectionControlComponentVo ID_InfectionControlComponent field is unknown
			domainObject = new ims.coe.assessment.domain.objects.InfectionControlComponent();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_AssessmentComponent());
			if (domMap.get(key) != null)
			{
				return (ims.coe.assessment.domain.objects.InfectionControlComponent)domMap.get(key);
			}
			domainObject = (ims.coe.assessment.domain.objects.InfectionControlComponent) domainFactory.getDomainObject(ims.coe.assessment.domain.objects.InfectionControlComponent.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_AssessmentComponent());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getMRSA() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getMRSA().getID());
		}
		domainObject.setMRSA(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getMRSAComment() != null && valueObject.getMRSAComment().equals(""))
		{
			valueObject.setMRSAComment(null);
		}
		domainObject.setMRSAComment(valueObject.getMRSAComment());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getClostridium() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getClostridium().getID());
		}
		domainObject.setClostridium(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getClostridiumComment() != null && valueObject.getClostridiumComment().equals(""))
		{
			valueObject.setClostridiumComment(null);
		}
		domainObject.setClostridiumComment(valueObject.getClostridiumComment());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getVRE() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getVRE().getID());
		}
		domainObject.setVRE(value5);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getVREComment() != null && valueObject.getVREComment().equals(""))
		{
			valueObject.setVREComment(null);
		}
		domainObject.setVREComment(valueObject.getVREComment());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getESBC() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getESBC().getID());
		}
		domainObject.setESBC(value7);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getESBCComment() != null && valueObject.getESBCComment().equals(""))
		{
			valueObject.setESBCComment(null);
		}
		domainObject.setESBCComment(valueObject.getESBCComment());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getTB() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getTB().getID());
		}
		domainObject.setTB(value9);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTBComment() != null && valueObject.getTBComment().equals(""))
		{
			valueObject.setTBComment(null);
		}
		domainObject.setTBComment(valueObject.getTBComment());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getNorovirus() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getNorovirus().getID());
		}
		domainObject.setNorovirus(value11);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNorovirusComment() != null && valueObject.getNorovirusComment().equals(""))
		{
			valueObject.setNorovirusComment(null);
		}
		domainObject.setNorovirusComment(valueObject.getNorovirusComment());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getControlRequirement() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getControlRequirement().getID());
		}
		domainObject.setControlRequirement(value13);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNotes() != null && valueObject.getNotes().equals(""))
		{
			valueObject.setNotes(null);
		}
		domainObject.setNotes(valueObject.getNotes());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.coe.assessmenttools.domain.objects.InfectionControlRepeatableAssessment value15 = null;
		if ( null != valueObject.getInfectionControlAssessment() ) 
		{
			if (valueObject.getInfectionControlAssessment().getBoId() == null)
			{
				if (domMap.get(valueObject.getInfectionControlAssessment()) != null)
				{
					value15 = (ims.coe.assessmenttools.domain.objects.InfectionControlRepeatableAssessment)domMap.get(valueObject.getInfectionControlAssessment());
				}
			}
			else
			{
				value15 = (ims.coe.assessmenttools.domain.objects.InfectionControlRepeatableAssessment)domainFactory.getDomainObject(ims.coe.assessmenttools.domain.objects.InfectionControlRepeatableAssessment.class, valueObject.getInfectionControlAssessment().getBoId());
			}
		}
		domainObject.setInfectionControlAssessment(value15);
		domainObject.setIsComplete(valueObject.getIsComplete());
		domainObject.setAssessmentInfo(ims.nursing.vo.domain.AssessmentInfoAssembler.extractAssessmentInfoList(domainFactory, valueObject.getAssessmentInfo(), domainObject.getAssessmentInfo(), domMap));		
		domainObject.setCopy(valueObject.getCopy());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value19 = null;
		if ( null != valueObject.getComponentType() ) 
		{
			value19 =
				domainFactory.getLookupInstance(valueObject.getComponentType().getID());
		}
		domainObject.setComponentType(value19);
		domainObject.setCarePlanTemplate(ims.nursing.vo.domain.CarePlanTemplateAssembler.extractCarePlanTemplateSet(domainFactory, valueObject.getCarePlanTemplate(), domainObject.getCarePlanTemplate(), domMap));		
		domainObject.setCarePlans(ims.nursing.vo.domain.CarePlanAssembler.extractCarePlanSet(domainFactory, valueObject.getCarePlans(), domainObject.getCarePlans(), domMap));		

		return domainObject;
	}

}
