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
 * @author Barbara Worwood
 */
public class MedicVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.MedicVo copy(ims.core.vo.MedicVo valueObjectDest, ims.core.vo.MedicVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Hcp(valueObjectSrc.getID_Hcp());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// medicType
		valueObjectDest.setMedicType(valueObjectSrc.getMedicType());
		// grade
		valueObjectDest.setGrade(valueObjectSrc.getGrade());
		// specialty
		valueObjectDest.setSpecialty(valueObjectSrc.getSpecialty());
		// secondSpecialty
		valueObjectDest.setSecondSpecialty(valueObjectSrc.getSecondSpecialty());
		// thirdSpecialty
		valueObjectDest.setThirdSpecialty(valueObjectSrc.getThirdSpecialty());
		// inpatientHandling
		valueObjectDest.setInpatientHandling(valueObjectSrc.getInpatientHandling());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// Mos
		valueObjectDest.setMos(valueObjectSrc.getMos());
		// isHCPaResponsibleHCP
		valueObjectDest.setIsHCPaResponsibleHCP(valueObjectSrc.getIsHCPaResponsibleHCP());
		// isALocalConsultant
		valueObjectDest.setIsALocalConsultant(valueObjectSrc.getIsALocalConsultant());
		// isAResponsibleEDClinician
		valueObjectDest.setIsAResponsibleEDClinician(valueObjectSrc.getIsAResponsibleEDClinician());
		// hcpType
		valueObjectDest.setHcpType(valueObjectSrc.getHcpType());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createMedicVoCollectionFromMedic(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.resource.people.domain.objects.Medic objects.
	 */
	public static ims.core.vo.MedicVoCollection createMedicVoCollectionFromMedic(java.util.Set domainObjectSet)	
	{
		return createMedicVoCollectionFromMedic(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.resource.people.domain.objects.Medic objects.
	 */
	public static ims.core.vo.MedicVoCollection createMedicVoCollectionFromMedic(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.MedicVoCollection voList = new ims.core.vo.MedicVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.resource.people.domain.objects.Medic domainObject = (ims.core.resource.people.domain.objects.Medic) iterator.next();
			ims.core.vo.MedicVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.resource.people.domain.objects.Medic objects.
	 */
	public static ims.core.vo.MedicVoCollection createMedicVoCollectionFromMedic(java.util.List domainObjectList) 
	{
		return createMedicVoCollectionFromMedic(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.resource.people.domain.objects.Medic objects.
	 */
	public static ims.core.vo.MedicVoCollection createMedicVoCollectionFromMedic(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.MedicVoCollection voList = new ims.core.vo.MedicVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.resource.people.domain.objects.Medic domainObject = (ims.core.resource.people.domain.objects.Medic) domainObjectList.get(i);
			ims.core.vo.MedicVo vo = create(map, domainObject);

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
	 * Create the ims.core.resource.people.domain.objects.Medic set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractMedicSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MedicVoCollection voCollection) 
	 {
	 	return extractMedicSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractMedicSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MedicVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.MedicVo vo = voCollection.get(i);
			ims.core.resource.people.domain.objects.Medic domainObject = MedicVoAssembler.extractMedic(domainFactory, vo, domMap);

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
	 * Create the ims.core.resource.people.domain.objects.Medic list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractMedicList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MedicVoCollection voCollection) 
	 {
	 	return extractMedicList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractMedicList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MedicVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.MedicVo vo = voCollection.get(i);
			ims.core.resource.people.domain.objects.Medic domainObject = MedicVoAssembler.extractMedic(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.resource.people.domain.objects.Medic object.
	 * @param domainObject ims.core.resource.people.domain.objects.Medic
	 */
	 public static ims.core.vo.MedicVo create(ims.core.resource.people.domain.objects.Medic domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.resource.people.domain.objects.Medic object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.MedicVo create(DomainObjectMap map, ims.core.resource.people.domain.objects.Medic domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.MedicVo valueObject = (ims.core.vo.MedicVo) map.getValueObject(domainObject, ims.core.vo.MedicVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.MedicVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.resource.people.domain.objects.Medic
	 */
	 public static ims.core.vo.MedicVo insert(ims.core.vo.MedicVo valueObject, ims.core.resource.people.domain.objects.Medic domainObject) 
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
	 * @param domainObject ims.core.resource.people.domain.objects.Medic
	 */
	 public static ims.core.vo.MedicVo insert(DomainObjectMap map, ims.core.vo.MedicVo valueObject, ims.core.resource.people.domain.objects.Medic domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Hcp(domainObject.getId());
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
			
		// medicType
		ims.domain.lookups.LookupInstance instance1 = domainObject.getMedicType();
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

			ims.core.vo.lookups.HcpDisType voLookup1 = new ims.core.vo.lookups.HcpDisType(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.HcpDisType parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.core.vo.lookups.HcpDisType(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setMedicType(voLookup1);
		}
				// grade
		ims.domain.lookups.LookupInstance instance2 = domainObject.getGrade();
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

			ims.core.vo.lookups.MedicGrade voLookup2 = new ims.core.vo.lookups.MedicGrade(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.MedicGrade parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.MedicGrade(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setGrade(voLookup2);
		}
				// specialty
		ims.domain.lookups.LookupInstance instance3 = domainObject.getSpecialty();
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

			ims.core.vo.lookups.Specialty voLookup3 = new ims.core.vo.lookups.Specialty(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.Specialty(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setSpecialty(voLookup3);
		}
				// secondSpecialty
		ims.domain.lookups.LookupInstance instance4 = domainObject.getSecondSpecialty();
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

			ims.core.vo.lookups.Specialty voLookup4 = new ims.core.vo.lookups.Specialty(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.Specialty(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setSecondSpecialty(voLookup4);
		}
				// thirdSpecialty
		ims.domain.lookups.LookupInstance instance5 = domainObject.getThirdSpecialty();
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

			ims.core.vo.lookups.Specialty voLookup5 = new ims.core.vo.lookups.Specialty(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.Specialty(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setThirdSpecialty(voLookup5);
		}
				// inpatientHandling
		valueObject.setInpatientHandling( domainObject.isInpatientHandling() );
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// Mos
		valueObject.setMos(ims.core.vo.domain.MemberOfStaffShortVoAssembler.create(map, domainObject.getMos()) );
		// isHCPaResponsibleHCP
		valueObject.setIsHCPaResponsibleHCP( domainObject.isIsHCPaResponsibleHCP() );
		// isALocalConsultant
		valueObject.setIsALocalConsultant( domainObject.isIsALocalConsultant() );
		// isAResponsibleEDClinician
		valueObject.setIsAResponsibleEDClinician( domainObject.isIsAResponsibleEDClinician() );
		// hcpType
		ims.domain.lookups.LookupInstance instance12 = domainObject.getHcpType();
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

			ims.core.vo.lookups.HcpDisType voLookup12 = new ims.core.vo.lookups.HcpDisType(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.core.vo.lookups.HcpDisType parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.core.vo.lookups.HcpDisType(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setHcpType(voLookup12);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.resource.people.domain.objects.Medic extractMedic(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MedicVo valueObject) 
	{
		return 	extractMedic(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.resource.people.domain.objects.Medic extractMedic(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MedicVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Hcp();
		ims.core.resource.people.domain.objects.Medic domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.resource.people.domain.objects.Medic)domMap.get(valueObject);
			}
			// ims.core.vo.MedicVo ID_Medic field is unknown
			domainObject = new ims.core.resource.people.domain.objects.Medic();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Hcp());
			if (domMap.get(key) != null)
			{
				return (ims.core.resource.people.domain.objects.Medic)domMap.get(key);
			}
			domainObject = (ims.core.resource.people.domain.objects.Medic) domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Medic.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Hcp());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getMedicType() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getMedicType().getID());
		}
		domainObject.setMedicType(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getGrade() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getGrade().getID());
		}
		domainObject.setGrade(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getSecondSpecialty() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getSecondSpecialty().getID());
		}
		domainObject.setSecondSpecialty(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getThirdSpecialty() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getThirdSpecialty().getID());
		}
		domainObject.setThirdSpecialty(value5);
		domainObject.setInpatientHandling(valueObject.getInpatientHandling());
		domainObject.setIsActive(valueObject.getIsActive());
		domainObject.setMos(ims.core.vo.domain.MemberOfStaffShortVoAssembler.extractMemberOfStaff(domainFactory, valueObject.getMos(), domMap));
		domainObject.setIsHCPaResponsibleHCP(valueObject.getIsHCPaResponsibleHCP());
		domainObject.setIsALocalConsultant(valueObject.getIsALocalConsultant());
		domainObject.setIsAResponsibleEDClinician(valueObject.getIsAResponsibleEDClinician());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getHcpType() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getHcpType().getID());
		}
		domainObject.setHcpType(value12);

		return domainObject;
	}

}
