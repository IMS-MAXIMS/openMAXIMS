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
 * @author Cristian Belciug
 */
public class MergedPatientVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.MergedPatientVo copy(ims.core.vo.MergedPatientVo valueObjectDest, ims.core.vo.MergedPatientVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_MergedPatient(valueObjectSrc.getID_MergedPatient());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// name
		valueObjectDest.setName(valueObjectSrc.getName());
		// sex
		valueObjectDest.setSex(valueObjectSrc.getSex());
		// dob
		valueObjectDest.setDob(valueObjectSrc.getDob());
		// dod
		valueObjectDest.setDod(valueObjectSrc.getDod());
		// address
		valueObjectDest.setAddress(valueObjectSrc.getAddress());
		// identifiers
		valueObjectDest.setIdentifiers(valueObjectSrc.getIdentifiers());
		// gp
		valueObjectDest.setGp(valueObjectSrc.getGp());
		// gpSurgery
		valueObjectDest.setGpSurgery(valueObjectSrc.getGpSurgery());
		// nok
		valueObjectDest.setNok(valueObjectSrc.getNok());
		// ethnicOrigin
		valueObjectDest.setEthnicOrigin(valueObjectSrc.getEthnicOrigin());
		// religion
		valueObjectDest.setReligion(valueObjectSrc.getReligion());
		// maritalStatus
		valueObjectDest.setMaritalStatus(valueObjectSrc.getMaritalStatus());
		// occupation
		valueObjectDest.setOccupation(valueObjectSrc.getOccupation());
		// language
		valueObjectDest.setLanguage(valueObjectSrc.getLanguage());
		// CommChannels
		valueObjectDest.setCommChannels(valueObjectSrc.getCommChannels());
		// Insurance
		valueObjectDest.setInsurance(valueObjectSrc.getInsurance());
		// addresses
		valueObjectDest.setAddresses(valueObjectSrc.getAddresses());
		// DestiantionPatient
		valueObjectDest.setDestiantionPatient(valueObjectSrc.getDestiantionPatient());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createMergedPatientVoCollectionFromMergedPatient(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.MergedPatient objects.
	 */
	public static ims.core.vo.MergedPatientVoCollection createMergedPatientVoCollectionFromMergedPatient(java.util.Set domainObjectSet)	
	{
		return createMergedPatientVoCollectionFromMergedPatient(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.MergedPatient objects.
	 */
	public static ims.core.vo.MergedPatientVoCollection createMergedPatientVoCollectionFromMergedPatient(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.MergedPatientVoCollection voList = new ims.core.vo.MergedPatientVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.patient.domain.objects.MergedPatient domainObject = (ims.core.patient.domain.objects.MergedPatient) iterator.next();
			ims.core.vo.MergedPatientVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.patient.domain.objects.MergedPatient objects.
	 */
	public static ims.core.vo.MergedPatientVoCollection createMergedPatientVoCollectionFromMergedPatient(java.util.List domainObjectList) 
	{
		return createMergedPatientVoCollectionFromMergedPatient(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.patient.domain.objects.MergedPatient objects.
	 */
	public static ims.core.vo.MergedPatientVoCollection createMergedPatientVoCollectionFromMergedPatient(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.MergedPatientVoCollection voList = new ims.core.vo.MergedPatientVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.patient.domain.objects.MergedPatient domainObject = (ims.core.patient.domain.objects.MergedPatient) domainObjectList.get(i);
			ims.core.vo.MergedPatientVo vo = create(map, domainObject);

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
	 * Create the ims.core.patient.domain.objects.MergedPatient set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractMergedPatientSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MergedPatientVoCollection voCollection) 
	 {
	 	return extractMergedPatientSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractMergedPatientSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MergedPatientVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.MergedPatientVo vo = voCollection.get(i);
			ims.core.patient.domain.objects.MergedPatient domainObject = MergedPatientVoAssembler.extractMergedPatient(domainFactory, vo, domMap);

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
	 * Create the ims.core.patient.domain.objects.MergedPatient list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractMergedPatientList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MergedPatientVoCollection voCollection) 
	 {
	 	return extractMergedPatientList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractMergedPatientList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MergedPatientVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.MergedPatientVo vo = voCollection.get(i);
			ims.core.patient.domain.objects.MergedPatient domainObject = MergedPatientVoAssembler.extractMergedPatient(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.patient.domain.objects.MergedPatient object.
	 * @param domainObject ims.core.patient.domain.objects.MergedPatient
	 */
	 public static ims.core.vo.MergedPatientVo create(ims.core.patient.domain.objects.MergedPatient domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.patient.domain.objects.MergedPatient object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.MergedPatientVo create(DomainObjectMap map, ims.core.patient.domain.objects.MergedPatient domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.MergedPatientVo valueObject = (ims.core.vo.MergedPatientVo) map.getValueObject(domainObject, ims.core.vo.MergedPatientVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.MergedPatientVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.patient.domain.objects.MergedPatient
	 */
	 public static ims.core.vo.MergedPatientVo insert(ims.core.vo.MergedPatientVo valueObject, ims.core.patient.domain.objects.MergedPatient domainObject) 
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
	 * @param domainObject ims.core.patient.domain.objects.MergedPatient
	 */
	 public static ims.core.vo.MergedPatientVo insert(DomainObjectMap map, ims.core.vo.MergedPatientVo valueObject, ims.core.patient.domain.objects.MergedPatient domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_MergedPatient(domainObject.getId());
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
			
		// name
		valueObject.setName(ims.core.vo.domain.PersonNameAssembler.create(map, domainObject.getName()) );
		// sex
		ims.domain.lookups.LookupInstance instance2 = domainObject.getSex();
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

			ims.core.vo.lookups.Sex voLookup2 = new ims.core.vo.lookups.Sex(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.Sex parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.Sex(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setSex(voLookup2);
		}
				// dob
		Integer dob = domainObject.getDob();
		if ( null != dob ) 
		{
			valueObject.setDob(new ims.framework.utils.PartialDate(dob) );
		}
		// dod
		java.util.Date dod = domainObject.getDod();
		if ( null != dod ) 
		{
			valueObject.setDod(new ims.framework.utils.Date(dod) );
		}
		// address
		valueObject.setAddress(ims.core.vo.domain.PersonAddressAssembler.create(map, domainObject.getAddress()) );
		// identifiers
		valueObject.setIdentifiers(ims.core.vo.domain.PatientIdAssembler.createPatientIdCollectionFromPatientId(map, domainObject.getIdentifiers()) );
		// gp
		if (domainObject.getGp() != null)
		{
			if(domainObject.getGp() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getGp();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setGp(new ims.core.resource.people.vo.GpRefVo(id, -1));				
			}
			else
			{
				valueObject.setGp(new ims.core.resource.people.vo.GpRefVo(domainObject.getGp().getId(), domainObject.getGp().getVersion()));
			}
		}
		// gpSurgery
		if (domainObject.getGpSurgery() != null)
		{
			if(domainObject.getGpSurgery() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getGpSurgery();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setGpSurgery(new ims.core.resource.place.vo.LocSiteRefVo(id, -1));				
			}
			else
			{
				valueObject.setGpSurgery(new ims.core.resource.place.vo.LocSiteRefVo(domainObject.getGpSurgery().getId(), domainObject.getGpSurgery().getVersion()));
			}
		}
		// nok
		valueObject.setNok(ims.core.vo.domain.NextOfKinAssembler.create(map, domainObject.getNok()) );
		// ethnicOrigin
		ims.domain.lookups.LookupInstance instance10 = domainObject.getEthnicOrigin();
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

			ims.core.vo.lookups.EthnicOrigin voLookup10 = new ims.core.vo.lookups.EthnicOrigin(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.EthnicOrigin parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.core.vo.lookups.EthnicOrigin(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setEthnicOrigin(voLookup10);
		}
				// religion
		ims.domain.lookups.LookupInstance instance11 = domainObject.getReligion();
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

			ims.core.vo.lookups.Religion voLookup11 = new ims.core.vo.lookups.Religion(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.core.vo.lookups.Religion parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.core.vo.lookups.Religion(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setReligion(voLookup11);
		}
				// maritalStatus
		ims.domain.lookups.LookupInstance instance12 = domainObject.getMaritalStatus();
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

			ims.core.vo.lookups.MaritalStatus voLookup12 = new ims.core.vo.lookups.MaritalStatus(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.core.vo.lookups.MaritalStatus parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.core.vo.lookups.MaritalStatus(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setMaritalStatus(voLookup12);
		}
				// occupation
		ims.domain.lookups.LookupInstance instance13 = domainObject.getOccupation();
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

			ims.core.vo.lookups.Occupation voLookup13 = new ims.core.vo.lookups.Occupation(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.core.vo.lookups.Occupation parentVoLookup13 = voLookup13;
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
								parentVoLookup13.setParent(new ims.core.vo.lookups.Occupation(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setOccupation(voLookup13);
		}
				// language
		ims.domain.lookups.LookupInstance instance14 = domainObject.getLanguage();
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

			ims.core.vo.lookups.Language voLookup14 = new ims.core.vo.lookups.Language(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.core.vo.lookups.Language parentVoLookup14 = voLookup14;
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
								parentVoLookup14.setParent(new ims.core.vo.lookups.Language(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setLanguage(voLookup14);
		}
				// CommChannels
		valueObject.setCommChannels(ims.core.vo.domain.CommChannelVoAssembler.createCommChannelVoCollectionFromCommunicationChannel(map, domainObject.getCommChannels()) );
		// Insurance
		valueObject.setInsurance(ims.core.vo.domain.InsuranceVoAssembler.create(map, domainObject.getInsurance()) );
		// addresses
		valueObject.setAddresses(ims.core.vo.domain.PersonAddressAssembler.createPersonAddressCollectionFromAddress(map, domainObject.getAddresses()) );
		// DestiantionPatient
		if (domainObject.getDestiantionPatient() != null)
		{
			if(domainObject.getDestiantionPatient() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getDestiantionPatient();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setDestiantionPatient(new ims.core.patient.vo.PatientRefVo(id, -1));				
			}
			else
			{
				valueObject.setDestiantionPatient(new ims.core.patient.vo.PatientRefVo(domainObject.getDestiantionPatient().getId(), domainObject.getDestiantionPatient().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.patient.domain.objects.MergedPatient extractMergedPatient(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MergedPatientVo valueObject) 
	{
		return 	extractMergedPatient(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.patient.domain.objects.MergedPatient extractMergedPatient(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MergedPatientVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_MergedPatient();
		ims.core.patient.domain.objects.MergedPatient domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.patient.domain.objects.MergedPatient)domMap.get(valueObject);
			}
			// ims.core.vo.MergedPatientVo ID_MergedPatient field is unknown
			domainObject = new ims.core.patient.domain.objects.MergedPatient();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_MergedPatient());
			if (domMap.get(key) != null)
			{
				return (ims.core.patient.domain.objects.MergedPatient)domMap.get(key);
			}
			domainObject = (ims.core.patient.domain.objects.MergedPatient) domainFactory.getDomainObject(ims.core.patient.domain.objects.MergedPatient.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_MergedPatient());

		domainObject.setName(ims.core.vo.domain.PersonNameAssembler.extractPersonName(domainFactory, valueObject.getName(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getSex() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getSex().getID());
		}
		domainObject.setSex(value2);
		ims.framework.utils.PartialDate dob = valueObject.getDob();
		Integer value3 = null;
		if ( null != dob ) 
		{
			value3 = dob.toInteger();
		}
		domainObject.setDob(value3);
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getDod();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setDod(value4);
		domainObject.setAddress(ims.core.vo.domain.PersonAddressAssembler.extractAddress(domainFactory, valueObject.getAddress(), domMap));
		domainObject.setIdentifiers(ims.core.vo.domain.PatientIdAssembler.extractPatientIdList(domainFactory, valueObject.getIdentifiers(), domainObject.getIdentifiers(), domMap));		
		ims.core.resource.people.domain.objects.Gp value7 = null;
		if ( null != valueObject.getGp() ) 
		{
			if (valueObject.getGp().getBoId() == null)
			{
				if (domMap.get(valueObject.getGp()) != null)
				{
					value7 = (ims.core.resource.people.domain.objects.Gp)domMap.get(valueObject.getGp());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value7 = domainObject.getGp();	
			}
			else
			{
				value7 = (ims.core.resource.people.domain.objects.Gp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Gp.class, valueObject.getGp().getBoId());
			}
		}
		domainObject.setGp(value7);
		ims.core.resource.place.domain.objects.LocSite value8 = null;
		if ( null != valueObject.getGpSurgery() ) 
		{
			if (valueObject.getGpSurgery().getBoId() == null)
			{
				if (domMap.get(valueObject.getGpSurgery()) != null)
				{
					value8 = (ims.core.resource.place.domain.objects.LocSite)domMap.get(valueObject.getGpSurgery());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value8 = domainObject.getGpSurgery();	
			}
			else
			{
				value8 = (ims.core.resource.place.domain.objects.LocSite)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.LocSite.class, valueObject.getGpSurgery().getBoId());
			}
		}
		domainObject.setGpSurgery(value8);
		domainObject.setNok(ims.core.vo.domain.NextOfKinAssembler.extractNextOfKin(domainFactory, valueObject.getNok(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getEthnicOrigin() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getEthnicOrigin().getID());
		}
		domainObject.setEthnicOrigin(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getReligion() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getReligion().getID());
		}
		domainObject.setReligion(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getMaritalStatus() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getMaritalStatus().getID());
		}
		domainObject.setMaritalStatus(value12);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getOccupation() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getOccupation().getID());
		}
		domainObject.setOccupation(value13);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getLanguage() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getLanguage().getID());
		}
		domainObject.setLanguage(value14);
		domainObject.setCommChannels(ims.core.vo.domain.CommChannelVoAssembler.extractCommunicationChannelList(domainFactory, valueObject.getCommChannels(), domainObject.getCommChannels(), domMap));		
		domainObject.setInsurance(ims.core.vo.domain.InsuranceVoAssembler.extractInsurance(domainFactory, valueObject.getInsurance(), domMap));
		domainObject.setAddresses(ims.core.vo.domain.PersonAddressAssembler.extractAddressList(domainFactory, valueObject.getAddresses(), domainObject.getAddresses(), domMap));		
		ims.core.patient.domain.objects.Patient value18 = null;
		if ( null != valueObject.getDestiantionPatient() ) 
		{
			if (valueObject.getDestiantionPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getDestiantionPatient()) != null)
				{
					value18 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getDestiantionPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value18 = domainObject.getDestiantionPatient();	
			}
			else
			{
				value18 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getDestiantionPatient().getBoId());
			}
		}
		domainObject.setDestiantionPatient(value18);

		return domainObject;
	}

}
