//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 12/10/2015, 13:24
 *
 */
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Gabriel Maxim
 */
public class PatientPDSMergeVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PatientPDSMergeVo copy(ims.core.vo.PatientPDSMergeVo valueObjectDest, ims.core.vo.PatientPDSMergeVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Patient(valueObjectSrc.getID_Patient());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// SCN
		valueObjectDest.setSCN(valueObjectSrc.getSCN());
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
		// nok
		valueObjectDest.setNok(valueObjectSrc.getNok());
		// addresses
		valueObjectDest.setAddresses(valueObjectSrc.getAddresses());
		// NationalHealthCover
		valueObjectDest.setNationalHealthCover(valueObjectSrc.getNationalHealthCover());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientPDSMergeVoCollectionFromPatient(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.Patient objects.
	 */
	public static ims.core.vo.PatientPDSMergeVoCollection createPatientPDSMergeVoCollectionFromPatient(java.util.Set domainObjectSet)	
	{
		return createPatientPDSMergeVoCollectionFromPatient(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.Patient objects.
	 */
	public static ims.core.vo.PatientPDSMergeVoCollection createPatientPDSMergeVoCollectionFromPatient(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatientPDSMergeVoCollection voList = new ims.core.vo.PatientPDSMergeVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.patient.domain.objects.Patient domainObject = (ims.core.patient.domain.objects.Patient) iterator.next();
			ims.core.vo.PatientPDSMergeVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.patient.domain.objects.Patient objects.
	 */
	public static ims.core.vo.PatientPDSMergeVoCollection createPatientPDSMergeVoCollectionFromPatient(java.util.List domainObjectList) 
	{
		return createPatientPDSMergeVoCollectionFromPatient(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.patient.domain.objects.Patient objects.
	 */
	public static ims.core.vo.PatientPDSMergeVoCollection createPatientPDSMergeVoCollectionFromPatient(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatientPDSMergeVoCollection voList = new ims.core.vo.PatientPDSMergeVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.patient.domain.objects.Patient domainObject = (ims.core.patient.domain.objects.Patient) domainObjectList.get(i);
			ims.core.vo.PatientPDSMergeVo vo = create(map, domainObject);

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
	 * Create the ims.core.patient.domain.objects.Patient set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientPDSMergeVoCollection voCollection) 
	 {
	 	return extractPatientSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientPDSMergeVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientPDSMergeVo vo = voCollection.get(i);
			ims.core.patient.domain.objects.Patient domainObject = PatientPDSMergeVoAssembler.extractPatient(domainFactory, vo, domMap);

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
	 * Create the ims.core.patient.domain.objects.Patient list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientPDSMergeVoCollection voCollection) 
	 {
	 	return extractPatientList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientPDSMergeVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientPDSMergeVo vo = voCollection.get(i);
			ims.core.patient.domain.objects.Patient domainObject = PatientPDSMergeVoAssembler.extractPatient(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.patient.domain.objects.Patient object.
	 * @param domainObject ims.core.patient.domain.objects.Patient
	 */
	 public static ims.core.vo.PatientPDSMergeVo create(ims.core.patient.domain.objects.Patient domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.patient.domain.objects.Patient object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PatientPDSMergeVo create(DomainObjectMap map, ims.core.patient.domain.objects.Patient domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PatientPDSMergeVo valueObject = (ims.core.vo.PatientPDSMergeVo) map.getValueObject(domainObject, ims.core.vo.PatientPDSMergeVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PatientPDSMergeVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.patient.domain.objects.Patient
	 */
	 public static ims.core.vo.PatientPDSMergeVo insert(ims.core.vo.PatientPDSMergeVo valueObject, ims.core.patient.domain.objects.Patient domainObject) 
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
	 * @param domainObject ims.core.patient.domain.objects.Patient
	 */
	 public static ims.core.vo.PatientPDSMergeVo insert(DomainObjectMap map, ims.core.vo.PatientPDSMergeVo valueObject, ims.core.patient.domain.objects.Patient domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Patient(domainObject.getId());
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
			
		// SCN
		valueObject.setSCN(domainObject.getSCN());
		// name
		valueObject.setName(ims.core.vo.domain.PersonNameAssembler.create(map, domainObject.getName()) );
		// sex
		ims.domain.lookups.LookupInstance instance3 = domainObject.getSex();
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

			ims.core.vo.lookups.Sex voLookup3 = new ims.core.vo.lookups.Sex(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.Sex parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.Sex(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setSex(voLookup3);
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
		valueObject.setGp(ims.core.vo.domain.GpMergeVoAssembler.create(map, domainObject.getGp()) );
		// gpSurgery
		valueObject.setGpSurgery(ims.core.vo.domain.LocSiteLiteVoAssembler.create(map, domainObject.getGpSurgery()) );
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
		// nok
		valueObject.setNok(ims.core.vo.domain.NextOfKinAssembler.create(map, domainObject.getNok()) );
		// addresses
		valueObject.setAddresses(ims.core.vo.domain.PersonAddressAssembler.createPersonAddressCollectionFromAddress(map, domainObject.getAddresses()) );
		// NationalHealthCover
		valueObject.setNationalHealthCover(ims.core.vo.domain.NationalHealthCoverVoAssembler.create(map, domainObject.getNationalHealthCover()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.patient.domain.objects.Patient extractPatient(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientPDSMergeVo valueObject) 
	{
		return 	extractPatient(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.patient.domain.objects.Patient extractPatient(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientPDSMergeVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Patient();
		ims.core.patient.domain.objects.Patient domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.patient.domain.objects.Patient)domMap.get(valueObject);
			}
			// ims.core.vo.PatientPDSMergeVo ID_Patient field is unknown
			domainObject = new ims.core.patient.domain.objects.Patient();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Patient());
			if (domMap.get(key) != null)
			{
				return (ims.core.patient.domain.objects.Patient)domMap.get(key);
			}
			domainObject = (ims.core.patient.domain.objects.Patient) domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Patient());

		domainObject.setSCN(valueObject.getSCN());
		domainObject.setName(ims.core.vo.domain.PersonNameAssembler.extractPersonName(domainFactory, valueObject.getName(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getSex() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getSex().getID());
		}
		domainObject.setSex(value3);
		ims.framework.utils.PartialDate dob = valueObject.getDob();
		Integer value4 = null;
		if ( null != dob ) 
		{
			value4 = dob.toInteger();
		}
		domainObject.setDob(value4);
		java.util.Date value5 = null;
		ims.framework.utils.Date date5 = valueObject.getDod();		
		if ( date5 != null ) 
		{
			value5 = date5.getDate();
		}
		domainObject.setDod(value5);
		domainObject.setAddress(ims.core.vo.domain.PersonAddressAssembler.extractAddress(domainFactory, valueObject.getAddress(), domMap));
		domainObject.setIdentifiers(ims.core.vo.domain.PatientIdAssembler.extractPatientIdList(domainFactory, valueObject.getIdentifiers(), domainObject.getIdentifiers(), domMap));		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Gp value8 = null;
		if ( null != valueObject.getGp() ) 
		{
			if (valueObject.getGp().getBoId() == null)
			{
				if (domMap.get(valueObject.getGp()) != null)
				{
					value8 = (ims.core.resource.people.domain.objects.Gp)domMap.get(valueObject.getGp());
				}
			}
			else
			{
				value8 = (ims.core.resource.people.domain.objects.Gp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Gp.class, valueObject.getGp().getBoId());
			}
		}
		domainObject.setGp(value8);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.LocSite value9 = null;
		if ( null != valueObject.getGpSurgery() ) 
		{
			if (valueObject.getGpSurgery().getBoId() == null)
			{
				if (domMap.get(valueObject.getGpSurgery()) != null)
				{
					value9 = (ims.core.resource.place.domain.objects.LocSite)domMap.get(valueObject.getGpSurgery());
				}
			}
			else
			{
				value9 = (ims.core.resource.place.domain.objects.LocSite)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.LocSite.class, valueObject.getGpSurgery().getBoId());
			}
		}
		domainObject.setGpSurgery(value9);
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
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.patient.domain.objects.NextOfKin value16 = null;
		if ( null != valueObject.getNok() ) 
		{
			if (valueObject.getNok().getBoId() == null)
			{
				if (domMap.get(valueObject.getNok()) != null)
				{
					value16 = (ims.core.patient.domain.objects.NextOfKin)domMap.get(valueObject.getNok());
				}
			}
			else
			{
				value16 = (ims.core.patient.domain.objects.NextOfKin)domainFactory.getDomainObject(ims.core.patient.domain.objects.NextOfKin.class, valueObject.getNok().getBoId());
			}
		}
		domainObject.setNok(value16);

		// SaveAsRefVO treated as RefValueObject
		ims.core.generic.vo.AddressRefVoCollection refCollection17 = new ims.core.generic.vo.AddressRefVoCollection();
		if (valueObject.getAddresses() != null)
		{
			for (int i17=0; i17<valueObject.getAddresses().size(); i17++)
			{
				ims.core.generic.vo.AddressRefVo ref17 = (ims.core.generic.vo.AddressRefVo)valueObject.getAddresses().get(i17);
				refCollection17.add(ref17);
			}
		}
		int size17 = (null == refCollection17) ? 0 : refCollection17.size();		
		java.util.List domainAddresses17 = domainObject.getAddresses();
		if (domainAddresses17 == null)
		{
			domainAddresses17 = new java.util.ArrayList();
		}
		for(int i=0; i < size17; i++) 
		{
			ims.core.generic.vo.AddressRefVo vo = refCollection17.get(i);			
			ims.core.generic.domain.objects.Address dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.generic.domain.objects.Address)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.generic.domain.objects.Address)domainFactory.getDomainObject( ims.core.generic.domain.objects.Address.class, vo.getBoId());
				}
			}

			int domIdx = domainAddresses17.indexOf(dom);
			if (domIdx == -1)
			{
				domainAddresses17.add(i, dom);
			}
			else if (i != domIdx && i < domainAddresses17.size())
			{
				Object tmp = domainAddresses17.get(i);
				domainAddresses17.set(i, domainAddresses17.get(domIdx));
				domainAddresses17.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i17 = domainAddresses17.size();
		while (i17 > size17)
		{
			domainAddresses17.remove(i17-1);
			i17 = domainAddresses17.size();
		}
		
		domainObject.setAddresses(domainAddresses17);		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.patient.domain.objects.NationalHealthCover value18 = null;
		if ( null != valueObject.getNationalHealthCover() ) 
		{
			if (valueObject.getNationalHealthCover().getBoId() == null)
			{
				if (domMap.get(valueObject.getNationalHealthCover()) != null)
				{
					value18 = (ims.core.patient.domain.objects.NationalHealthCover)domMap.get(valueObject.getNationalHealthCover());
				}
			}
			else
			{
				value18 = (ims.core.patient.domain.objects.NationalHealthCover)domainFactory.getDomainObject(ims.core.patient.domain.objects.NationalHealthCover.class, valueObject.getNationalHealthCover().getBoId());
			}
		}
		domainObject.setNationalHealthCover(value18);

		return domainObject;
	}

}
