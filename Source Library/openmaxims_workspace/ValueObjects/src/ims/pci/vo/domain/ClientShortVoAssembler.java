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
 * Generated on 12/10/2015, 13:25
 *
 */
package ims.pci.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Michael Noonan
 */
public class ClientShortVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.pci.vo.ClientShortVo copy(ims.pci.vo.ClientShortVo valueObjectDest, ims.pci.vo.ClientShortVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Patient(valueObjectSrc.getID_Patient());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// isChild
		valueObjectDest.setIsChild(valueObjectSrc.getIsChild());
		// Nationality
		valueObjectDest.setNationality(valueObjectSrc.getNationality());
		// DodSource
		valueObjectDest.setDodSource(valueObjectSrc.getDodSource());
		// name
		valueObjectDest.setName(valueObjectSrc.getName());
		// sex
		valueObjectDest.setSex(valueObjectSrc.getSex());
		// address
		valueObjectDest.setAddress(valueObjectSrc.getAddress());
		// dob
		valueObjectDest.setDob(valueObjectSrc.getDob());
		// dod
		valueObjectDest.setDod(valueObjectSrc.getDod());
		// ward
		valueObjectDest.setWard(valueObjectSrc.getWard());
		// religion
		valueObjectDest.setReligion(valueObjectSrc.getReligion());
		// identifiers
		valueObjectDest.setIdentifiers(valueObjectSrc.getIdentifiers());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// associatedPatient
		valueObjectDest.setAssociatedPatient(valueObjectSrc.getAssociatedPatient());
		// CommChannels
		valueObjectDest.setCommChannels(valueObjectSrc.getCommChannels());
		// ethnicOrigin
		valueObjectDest.setEthnicOrigin(valueObjectSrc.getEthnicOrigin());
		// maritalStatus
		valueObjectDest.setMaritalStatus(valueObjectSrc.getMaritalStatus());
		// SCN
		valueObjectDest.setSCN(valueObjectSrc.getSCN());
		// SourceOfInformation
		valueObjectDest.setSourceOfInformation(valueObjectSrc.getSourceOfInformation());
		// SysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
		// TimeOfDeath
		valueObjectDest.setTimeOfDeath(valueObjectSrc.getTimeOfDeath());
		// IsQuickRegistrationPatient
		valueObjectDest.setIsQuickRegistrationPatient(valueObjectSrc.getIsQuickRegistrationPatient());
		// OCSNotification
		valueObjectDest.setOCSNotification(valueObjectSrc.getOCSNotification());
		// CurrentResponsibleConsultant
		valueObjectDest.setCurrentResponsibleConsultant(valueObjectSrc.getCurrentResponsibleConsultant());
		// DementiaBreachDateTime
		valueObjectDest.setDementiaBreachDateTime(valueObjectSrc.getDementiaBreachDateTime());
		// DementiaWorklistStatus
		valueObjectDest.setDementiaWorklistStatus(valueObjectSrc.getDementiaWorklistStatus());
		// MRNStatus
		valueObjectDest.setMRNStatus(valueObjectSrc.getMRNStatus());
		// hasScannedCaseNoteFolders
		valueObjectDest.setHasScannedCaseNoteFolders(valueObjectSrc.getHasScannedCaseNoteFolders());
		// IsConfidential
		valueObjectDest.setIsConfidential(valueObjectSrc.getIsConfidential());
		// TimeOfBirth
		valueObjectDest.setTimeOfBirth(valueObjectSrc.getTimeOfBirth());
		// PatientCategory
		valueObjectDest.setPatientCategory(valueObjectSrc.getPatientCategory());
		// PDSPatientGP
		valueObjectDest.setPDSPatientGP(valueObjectSrc.getPDSPatientGP());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createClientShortVoCollectionFromPatient(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.Patient objects.
	 */
	public static ims.pci.vo.ClientShortVoCollection createClientShortVoCollectionFromPatient(java.util.Set domainObjectSet)	
	{
		return createClientShortVoCollectionFromPatient(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.Patient objects.
	 */
	public static ims.pci.vo.ClientShortVoCollection createClientShortVoCollectionFromPatient(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.pci.vo.ClientShortVoCollection voList = new ims.pci.vo.ClientShortVoCollection();
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
			ims.pci.vo.ClientShortVo vo = create(map, domainObject);
			
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
	public static ims.pci.vo.ClientShortVoCollection createClientShortVoCollectionFromPatient(java.util.List domainObjectList) 
	{
		return createClientShortVoCollectionFromPatient(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.patient.domain.objects.Patient objects.
	 */
	public static ims.pci.vo.ClientShortVoCollection createClientShortVoCollectionFromPatient(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.pci.vo.ClientShortVoCollection voList = new ims.pci.vo.ClientShortVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.patient.domain.objects.Patient domainObject = (ims.core.patient.domain.objects.Patient) domainObjectList.get(i);
			ims.pci.vo.ClientShortVo vo = create(map, domainObject);

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
	 public static java.util.Set extractPatientSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ClientShortVoCollection voCollection) 
	 {
	 	return extractPatientSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ClientShortVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.pci.vo.ClientShortVo vo = voCollection.get(i);
			ims.core.patient.domain.objects.Patient domainObject = ClientShortVoAssembler.extractPatient(domainFactory, vo, domMap);

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
	 public static java.util.List extractPatientList(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ClientShortVoCollection voCollection) 
	 {
	 	return extractPatientList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientList(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ClientShortVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.pci.vo.ClientShortVo vo = voCollection.get(i);
			ims.core.patient.domain.objects.Patient domainObject = ClientShortVoAssembler.extractPatient(domainFactory, vo, domMap);

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
	 public static ims.pci.vo.ClientShortVo create(ims.core.patient.domain.objects.Patient domainObject) 
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
	  public static ims.pci.vo.ClientShortVo create(DomainObjectMap map, ims.core.patient.domain.objects.Patient domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.pci.vo.ClientShortVo valueObject = (ims.pci.vo.ClientShortVo) map.getValueObject(domainObject, ims.pci.vo.ClientShortVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.pci.vo.ClientShortVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.pci.vo.ClientShortVo insert(ims.pci.vo.ClientShortVo valueObject, ims.core.patient.domain.objects.Patient domainObject) 
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
	 public static ims.pci.vo.ClientShortVo insert(DomainObjectMap map, ims.pci.vo.ClientShortVo valueObject, ims.core.patient.domain.objects.Patient domainObject) 
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
			
		// isChild
		valueObject.setIsChild( domainObject.isIsChild() );
		// Nationality
		ims.domain.lookups.LookupInstance instance2 = domainObject.getNationality();
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

			ims.core.vo.lookups.Nationality voLookup2 = new ims.core.vo.lookups.Nationality(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.Nationality parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.Nationality(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setNationality(voLookup2);
		}
				// DodSource
		ims.domain.lookups.LookupInstance instance3 = domainObject.getDodSource();
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

			ims.core.vo.lookups.DodSource voLookup3 = new ims.core.vo.lookups.DodSource(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.DodSource parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.DodSource(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setDodSource(voLookup3);
		}
				// name
		valueObject.setName(ims.core.vo.domain.PersonNameAssembler.create(map, domainObject.getName()) );
		// sex
		ims.domain.lookups.LookupInstance instance5 = domainObject.getSex();
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

			ims.core.vo.lookups.Sex voLookup5 = new ims.core.vo.lookups.Sex(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.Sex parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.Sex(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setSex(voLookup5);
		}
				// address
		valueObject.setAddress(ims.core.vo.domain.PersonAddressAssembler.create(map, domainObject.getAddress()) );
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
		// ward
		valueObject.setWard(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getWard()) );
		// religion
		ims.domain.lookups.LookupInstance instance10 = domainObject.getReligion();
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

			ims.core.vo.lookups.Religion voLookup10 = new ims.core.vo.lookups.Religion(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.Religion parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.core.vo.lookups.Religion(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setReligion(voLookup10);
		}
				// identifiers
		valueObject.setIdentifiers(ims.core.vo.domain.PatientIdAssembler.createPatientIdCollectionFromPatientId(map, domainObject.getIdentifiers()) );
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// associatedPatient
		valueObject.setAssociatedPatient(ims.core.vo.domain.PatientShortAssembler.create(map, domainObject.getAssociatedPatient()) );
		// CommChannels
		valueObject.setCommChannels(ims.core.vo.domain.CommChannelVoAssembler.createCommChannelVoCollectionFromCommunicationChannel(map, domainObject.getCommChannels()) );
		// ethnicOrigin
		ims.domain.lookups.LookupInstance instance15 = domainObject.getEthnicOrigin();
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

			ims.core.vo.lookups.EthnicOrigin voLookup15 = new ims.core.vo.lookups.EthnicOrigin(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.core.vo.lookups.EthnicOrigin parentVoLookup15 = voLookup15;
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
								parentVoLookup15.setParent(new ims.core.vo.lookups.EthnicOrigin(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setEthnicOrigin(voLookup15);
		}
				// maritalStatus
		ims.domain.lookups.LookupInstance instance16 = domainObject.getMaritalStatus();
		if ( null != instance16 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance16.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance16.getImage().getImageId(), instance16.getImage().getImagePath());
			}
			color = instance16.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.MaritalStatus voLookup16 = new ims.core.vo.lookups.MaritalStatus(instance16.getId(),instance16.getText(), instance16.isActive(), null, img, color);
			ims.core.vo.lookups.MaritalStatus parentVoLookup16 = voLookup16;
			ims.domain.lookups.LookupInstance parent16 = instance16.getParent();
			while (parent16 != null)
			{
				if (parent16.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent16.getImage().getImageId(), parent16.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent16.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup16.setParent(new ims.core.vo.lookups.MaritalStatus(parent16.getId(),parent16.getText(), parent16.isActive(), null, img, color));
				parentVoLookup16 = parentVoLookup16.getParent();
								parent16 = parent16.getParent();
			}			
			valueObject.setMaritalStatus(voLookup16);
		}
				// SCN
		valueObject.setSCN(domainObject.getSCN());
		// SourceOfInformation
		ims.domain.lookups.LookupInstance instance18 = domainObject.getSourceOfInformation();
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

			ims.core.vo.lookups.RegistrationSourceOfInfo voLookup18 = new ims.core.vo.lookups.RegistrationSourceOfInfo(instance18.getId(),instance18.getText(), instance18.isActive(), null, img, color);
			ims.core.vo.lookups.RegistrationSourceOfInfo parentVoLookup18 = voLookup18;
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
								parentVoLookup18.setParent(new ims.core.vo.lookups.RegistrationSourceOfInfo(parent18.getId(),parent18.getText(), parent18.isActive(), null, img, color));
				parentVoLookup18 = parentVoLookup18.getParent();
								parent18 = parent18.getParent();
			}			
			valueObject.setSourceOfInformation(voLookup18);
		}
				// SysInfo
		// set system information
		valueObject.setSysInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// TimeOfDeath
		String TimeOfDeath = domainObject.getTimeOfDeath();
		if ( null != TimeOfDeath ) 
		{
			valueObject.setTimeOfDeath(new ims.framework.utils.Time(TimeOfDeath) );
		}
		// IsQuickRegistrationPatient
		valueObject.setIsQuickRegistrationPatient( domainObject.isIsQuickRegistrationPatient() );
		// OCSNotification
		valueObject.setOCSNotification(ims.core.vo.domain.PatientNotificationsFillerOnlyVoAssembler.create(map, domainObject.getOCSNotification()) );
		// CurrentResponsibleConsultant
		if (domainObject.getCurrentResponsibleConsultant() != null)
		{
			if(domainObject.getCurrentResponsibleConsultant() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCurrentResponsibleConsultant();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCurrentResponsibleConsultant(new ims.core.resource.people.vo.MedicRefVo(id, -1));				
			}
			else
			{
				valueObject.setCurrentResponsibleConsultant(new ims.core.resource.people.vo.MedicRefVo(domainObject.getCurrentResponsibleConsultant().getId(), domainObject.getCurrentResponsibleConsultant().getVersion()));
			}
		}
		// DementiaBreachDateTime
		java.util.Date DementiaBreachDateTime = domainObject.getDementiaBreachDateTime();
		if ( null != DementiaBreachDateTime ) 
		{
			valueObject.setDementiaBreachDateTime(new ims.framework.utils.DateTime(DementiaBreachDateTime) );
		}
		// DementiaWorklistStatus
		ims.domain.lookups.LookupInstance instance25 = domainObject.getDementiaWorklistStatus();
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

			ims.core.vo.lookups.DementiaWorklistStatus voLookup25 = new ims.core.vo.lookups.DementiaWorklistStatus(instance25.getId(),instance25.getText(), instance25.isActive(), null, img, color);
			ims.core.vo.lookups.DementiaWorklistStatus parentVoLookup25 = voLookup25;
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
								parentVoLookup25.setParent(new ims.core.vo.lookups.DementiaWorklistStatus(parent25.getId(),parent25.getText(), parent25.isActive(), null, img, color));
				parentVoLookup25 = parentVoLookup25.getParent();
								parent25 = parent25.getParent();
			}			
			valueObject.setDementiaWorklistStatus(voLookup25);
		}
				// MRNStatus
		ims.domain.lookups.LookupInstance instance26 = domainObject.getMRNStatus();
		if ( null != instance26 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance26.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance26.getImage().getImageId(), instance26.getImage().getImagePath());
			}
			color = instance26.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.MRNStatus voLookup26 = new ims.core.vo.lookups.MRNStatus(instance26.getId(),instance26.getText(), instance26.isActive(), null, img, color);
			ims.core.vo.lookups.MRNStatus parentVoLookup26 = voLookup26;
			ims.domain.lookups.LookupInstance parent26 = instance26.getParent();
			while (parent26 != null)
			{
				if (parent26.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent26.getImage().getImageId(), parent26.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent26.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup26.setParent(new ims.core.vo.lookups.MRNStatus(parent26.getId(),parent26.getText(), parent26.isActive(), null, img, color));
				parentVoLookup26 = parentVoLookup26.getParent();
								parent26 = parent26.getParent();
			}			
			valueObject.setMRNStatus(voLookup26);
		}
				// hasScannedCaseNoteFolders
		valueObject.setHasScannedCaseNoteFolders( domainObject.isHasScannedCaseNoteFolders() );
		// IsConfidential
		valueObject.setIsConfidential( domainObject.isIsConfidential() );
		// TimeOfBirth
		String TimeOfBirth = domainObject.getTimeOfBirth();
		if ( null != TimeOfBirth ) 
		{
			valueObject.setTimeOfBirth(new ims.framework.utils.Time(TimeOfBirth) );
		}
		// PatientCategory
		ims.domain.lookups.LookupInstance instance30 = domainObject.getPatientCategory();
		if ( null != instance30 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance30.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance30.getImage().getImageId(), instance30.getImage().getImagePath());
			}
			color = instance30.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PatientStatus voLookup30 = new ims.core.vo.lookups.PatientStatus(instance30.getId(),instance30.getText(), instance30.isActive(), null, img, color);
			ims.core.vo.lookups.PatientStatus parentVoLookup30 = voLookup30;
			ims.domain.lookups.LookupInstance parent30 = instance30.getParent();
			while (parent30 != null)
			{
				if (parent30.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent30.getImage().getImageId(), parent30.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent30.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup30.setParent(new ims.core.vo.lookups.PatientStatus(parent30.getId(),parent30.getText(), parent30.isActive(), null, img, color));
				parentVoLookup30 = parentVoLookup30.getParent();
								parent30 = parent30.getParent();
			}			
			valueObject.setPatientCategory(voLookup30);
		}
				// PDSPatientGP
		valueObject.setPDSPatientGP(ims.core.vo.domain.PDSPatientGPVoAssembler.create(map, domainObject.getPDSPatientGP()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.patient.domain.objects.Patient extractPatient(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ClientShortVo valueObject) 
	{
		return 	extractPatient(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.patient.domain.objects.Patient extractPatient(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ClientShortVo valueObject, HashMap domMap) 
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
			// ims.pci.vo.ClientShortVo ID_Patient field is unknown
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

		domainObject.setIsChild(valueObject.getIsChild());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getNationality() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getNationality().getID());
		}
		domainObject.setNationality(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getDodSource() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getDodSource().getID());
		}
		domainObject.setDodSource(value3);
		domainObject.setName(ims.core.vo.domain.PersonNameAssembler.extractPersonName(domainFactory, valueObject.getName(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getSex() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getSex().getID());
		}
		domainObject.setSex(value5);
		domainObject.setAddress(ims.core.vo.domain.PersonAddressAssembler.extractAddress(domainFactory, valueObject.getAddress(), domMap));
		ims.framework.utils.PartialDate dob = valueObject.getDob();
		Integer value7 = null;
		if ( null != dob ) 
		{
			value7 = dob.toInteger();
		}
		domainObject.setDob(value7);
		java.util.Date value8 = null;
		ims.framework.utils.Date date8 = valueObject.getDod();		
		if ( date8 != null ) 
		{
			value8 = date8.getDate();
		}
		domainObject.setDod(value8);
		domainObject.setWard(ims.core.vo.domain.LocationLiteVoAssembler.extractLocation(domainFactory, valueObject.getWard(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getReligion() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getReligion().getID());
		}
		domainObject.setReligion(value10);
		domainObject.setIdentifiers(ims.core.vo.domain.PatientIdAssembler.extractPatientIdList(domainFactory, valueObject.getIdentifiers(), domainObject.getIdentifiers(), domMap));		
		domainObject.setIsActive(valueObject.getIsActive());
		domainObject.setAssociatedPatient(ims.core.vo.domain.PatientShortAssembler.extractPatient(domainFactory, valueObject.getAssociatedPatient(), domMap));
		domainObject.setCommChannels(ims.core.vo.domain.CommChannelVoAssembler.extractCommunicationChannelList(domainFactory, valueObject.getCommChannels(), domainObject.getCommChannels(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getEthnicOrigin() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getEthnicOrigin().getID());
		}
		domainObject.setEthnicOrigin(value15);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getMaritalStatus() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getMaritalStatus().getID());
		}
		domainObject.setMaritalStatus(value16);
		domainObject.setSCN(valueObject.getSCN());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value18 = null;
		if ( null != valueObject.getSourceOfInformation() ) 
		{
			value18 =
				domainFactory.getLookupInstance(valueObject.getSourceOfInformation().getID());
		}
		domainObject.setSourceOfInformation(value18);
		ims.framework.utils.Time time20 = valueObject.getTimeOfDeath();
		String value20 = null;
		if ( time20 != null ) 
		{
			value20 = time20.toString();
		}
		domainObject.setTimeOfDeath(value20);
		domainObject.setIsQuickRegistrationPatient(valueObject.getIsQuickRegistrationPatient());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.PatientNotification value22 = null;
		if ( null != valueObject.getOCSNotification() ) 
		{
			if (valueObject.getOCSNotification().getBoId() == null)
			{
				if (domMap.get(valueObject.getOCSNotification()) != null)
				{
					value22 = (ims.core.clinical.domain.objects.PatientNotification)domMap.get(valueObject.getOCSNotification());
				}
			}
			else
			{
				value22 = (ims.core.clinical.domain.objects.PatientNotification)domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientNotification.class, valueObject.getOCSNotification().getBoId());
			}
		}
		domainObject.setOCSNotification(value22);
		ims.core.resource.people.domain.objects.Medic value23 = null;
		if ( null != valueObject.getCurrentResponsibleConsultant() ) 
		{
			if (valueObject.getCurrentResponsibleConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getCurrentResponsibleConsultant()) != null)
				{
					value23 = (ims.core.resource.people.domain.objects.Medic)domMap.get(valueObject.getCurrentResponsibleConsultant());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value23 = domainObject.getCurrentResponsibleConsultant();	
			}
			else
			{
				value23 = (ims.core.resource.people.domain.objects.Medic)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Medic.class, valueObject.getCurrentResponsibleConsultant().getBoId());
			}
		}
		domainObject.setCurrentResponsibleConsultant(value23);
		ims.framework.utils.DateTime dateTime24 = valueObject.getDementiaBreachDateTime();
		java.util.Date value24 = null;
		if ( dateTime24 != null ) 
		{
			value24 = dateTime24.getJavaDate();
		}
		domainObject.setDementiaBreachDateTime(value24);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value25 = null;
		if ( null != valueObject.getDementiaWorklistStatus() ) 
		{
			value25 =
				domainFactory.getLookupInstance(valueObject.getDementiaWorklistStatus().getID());
		}
		domainObject.setDementiaWorklistStatus(value25);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value26 = null;
		if ( null != valueObject.getMRNStatus() ) 
		{
			value26 =
				domainFactory.getLookupInstance(valueObject.getMRNStatus().getID());
		}
		domainObject.setMRNStatus(value26);
		domainObject.setHasScannedCaseNoteFolders(valueObject.getHasScannedCaseNoteFolders());
		domainObject.setIsConfidential(valueObject.getIsConfidential());
		ims.framework.utils.Time time29 = valueObject.getTimeOfBirth();
		String value29 = null;
		if ( time29 != null ) 
		{
			value29 = time29.toString();
		}
		domainObject.setTimeOfBirth(value29);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value30 = null;
		if ( null != valueObject.getPatientCategory() ) 
		{
			value30 =
				domainFactory.getLookupInstance(valueObject.getPatientCategory().getID());
		}
		domainObject.setPatientCategory(value30);
		domainObject.setPDSPatientGP(ims.core.vo.domain.PDSPatientGPVoAssembler.extractPatientGP(domainFactory, valueObject.getPDSPatientGP(), domMap));

		return domainObject;
	}

}
