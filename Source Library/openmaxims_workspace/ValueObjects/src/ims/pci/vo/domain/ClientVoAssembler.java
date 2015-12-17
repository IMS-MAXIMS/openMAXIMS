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
package ims.pci.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Marius Mihalec
 */
public class ClientVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.pci.vo.ClientVo copy(ims.pci.vo.ClientVo valueObjectDest, ims.pci.vo.ClientVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Patient(valueObjectSrc.getID_Patient());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// addresses
		valueObjectDest.setAddresses(valueObjectSrc.getAddresses());
		// gp
		valueObjectDest.setGp(valueObjectSrc.getGp());
		// gpSurgery
		valueObjectDest.setGpSurgery(valueObjectSrc.getGpSurgery());
		// clientParent
		valueObjectDest.setClientParent(valueObjectSrc.getClientParent());
		// CommunityCare
		valueObjectDest.setCommunityCare(valueObjectSrc.getCommunityCare());
		// otherNames
		valueObjectDest.setOtherNames(valueObjectSrc.getOtherNames());
		// ConfidentialReason
		valueObjectDest.setConfidentialReason(valueObjectSrc.getConfidentialReason());
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
 	 * If more than one call to an Assembler is made then #createClientVoCollectionFromPatient(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.Patient objects.
	 */
	public static ims.pci.vo.ClientVoCollection createClientVoCollectionFromPatient(java.util.Set domainObjectSet)	
	{
		return createClientVoCollectionFromPatient(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.Patient objects.
	 */
	public static ims.pci.vo.ClientVoCollection createClientVoCollectionFromPatient(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.pci.vo.ClientVoCollection voList = new ims.pci.vo.ClientVoCollection();
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
			ims.pci.vo.ClientVo vo = create(map, domainObject);
			
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
	public static ims.pci.vo.ClientVoCollection createClientVoCollectionFromPatient(java.util.List domainObjectList) 
	{
		return createClientVoCollectionFromPatient(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.patient.domain.objects.Patient objects.
	 */
	public static ims.pci.vo.ClientVoCollection createClientVoCollectionFromPatient(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.pci.vo.ClientVoCollection voList = new ims.pci.vo.ClientVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.patient.domain.objects.Patient domainObject = (ims.core.patient.domain.objects.Patient) domainObjectList.get(i);
			ims.pci.vo.ClientVo vo = create(map, domainObject);

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
	 public static java.util.Set extractPatientSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ClientVoCollection voCollection) 
	 {
	 	return extractPatientSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ClientVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.pci.vo.ClientVo vo = voCollection.get(i);
			ims.core.patient.domain.objects.Patient domainObject = ClientVoAssembler.extractPatient(domainFactory, vo, domMap);

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
	 public static java.util.List extractPatientList(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ClientVoCollection voCollection) 
	 {
	 	return extractPatientList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientList(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ClientVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.pci.vo.ClientVo vo = voCollection.get(i);
			ims.core.patient.domain.objects.Patient domainObject = ClientVoAssembler.extractPatient(domainFactory, vo, domMap);

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
	 public static ims.pci.vo.ClientVo create(ims.core.patient.domain.objects.Patient domainObject) 
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
	  public static ims.pci.vo.ClientVo create(DomainObjectMap map, ims.core.patient.domain.objects.Patient domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.pci.vo.ClientVo valueObject = (ims.pci.vo.ClientVo) map.getValueObject(domainObject, ims.pci.vo.ClientVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.pci.vo.ClientVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.pci.vo.ClientVo insert(ims.pci.vo.ClientVo valueObject, ims.core.patient.domain.objects.Patient domainObject) 
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
	 public static ims.pci.vo.ClientVo insert(DomainObjectMap map, ims.pci.vo.ClientVo valueObject, ims.core.patient.domain.objects.Patient domainObject) 
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
			
		// addresses
		valueObject.setAddresses(ims.core.vo.domain.PersonAddressAssembler.createPersonAddressCollectionFromAddress(map, domainObject.getAddresses()) );
		// gp
		valueObject.setGp(ims.core.vo.domain.GpShortVoAssembler.create(map, domainObject.getGp()) );
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
		// clientParent
		if (domainObject.getClientParent() != null)
		{
			if(domainObject.getClientParent() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getClientParent();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setClientParent(new ims.core.patient.vo.PatientRefVo(id, -1));				
			}
			else
			{
				valueObject.setClientParent(new ims.core.patient.vo.PatientRefVo(domainObject.getClientParent().getId(), domainObject.getClientParent().getVersion()));
			}
		}
		// CommunityCare
		valueObject.setCommunityCare(ims.pci.vo.domain.CommunityCareVoAssembler.create(map, domainObject.getCommunityCare()) );
		// otherNames
		valueObject.setOtherNames(ims.core.vo.domain.PersonNameAssembler.createPersonNameCollectionFromPersonName(map, domainObject.getOtherNames()) );
		// ConfidentialReason
		ims.domain.lookups.LookupInstance instance7 = domainObject.getConfidentialReason();
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

			ims.core.vo.lookups.ConfidentialReason voLookup7 = new ims.core.vo.lookups.ConfidentialReason(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.ConfidentialReason parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.core.vo.lookups.ConfidentialReason(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setConfidentialReason(voLookup7);
		}
				// isChild
		valueObject.setIsChild( domainObject.isIsChild() );
		// Nationality
		ims.domain.lookups.LookupInstance instance9 = domainObject.getNationality();
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

			ims.core.vo.lookups.Nationality voLookup9 = new ims.core.vo.lookups.Nationality(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.Nationality parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.core.vo.lookups.Nationality(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setNationality(voLookup9);
		}
				// DodSource
		ims.domain.lookups.LookupInstance instance10 = domainObject.getDodSource();
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

			ims.core.vo.lookups.DodSource voLookup10 = new ims.core.vo.lookups.DodSource(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.DodSource parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.core.vo.lookups.DodSource(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setDodSource(voLookup10);
		}
				// name
		valueObject.setName(ims.core.vo.domain.PersonNameAssembler.create(map, domainObject.getName()) );
		// sex
		ims.domain.lookups.LookupInstance instance12 = domainObject.getSex();
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

			ims.core.vo.lookups.Sex voLookup12 = new ims.core.vo.lookups.Sex(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.core.vo.lookups.Sex parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.core.vo.lookups.Sex(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setSex(voLookup12);
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
		ims.domain.lookups.LookupInstance instance17 = domainObject.getReligion();
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

			ims.core.vo.lookups.Religion voLookup17 = new ims.core.vo.lookups.Religion(instance17.getId(),instance17.getText(), instance17.isActive(), null, img, color);
			ims.core.vo.lookups.Religion parentVoLookup17 = voLookup17;
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
								parentVoLookup17.setParent(new ims.core.vo.lookups.Religion(parent17.getId(),parent17.getText(), parent17.isActive(), null, img, color));
				parentVoLookup17 = parentVoLookup17.getParent();
								parent17 = parent17.getParent();
			}			
			valueObject.setReligion(voLookup17);
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
		ims.domain.lookups.LookupInstance instance22 = domainObject.getEthnicOrigin();
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

			ims.core.vo.lookups.EthnicOrigin voLookup22 = new ims.core.vo.lookups.EthnicOrigin(instance22.getId(),instance22.getText(), instance22.isActive(), null, img, color);
			ims.core.vo.lookups.EthnicOrigin parentVoLookup22 = voLookup22;
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
								parentVoLookup22.setParent(new ims.core.vo.lookups.EthnicOrigin(parent22.getId(),parent22.getText(), parent22.isActive(), null, img, color));
				parentVoLookup22 = parentVoLookup22.getParent();
								parent22 = parent22.getParent();
			}			
			valueObject.setEthnicOrigin(voLookup22);
		}
				// maritalStatus
		ims.domain.lookups.LookupInstance instance23 = domainObject.getMaritalStatus();
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

			ims.core.vo.lookups.MaritalStatus voLookup23 = new ims.core.vo.lookups.MaritalStatus(instance23.getId(),instance23.getText(), instance23.isActive(), null, img, color);
			ims.core.vo.lookups.MaritalStatus parentVoLookup23 = voLookup23;
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
								parentVoLookup23.setParent(new ims.core.vo.lookups.MaritalStatus(parent23.getId(),parent23.getText(), parent23.isActive(), null, img, color));
				parentVoLookup23 = parentVoLookup23.getParent();
								parent23 = parent23.getParent();
			}			
			valueObject.setMaritalStatus(voLookup23);
		}
				// SCN
		valueObject.setSCN(domainObject.getSCN());
		// SourceOfInformation
		ims.domain.lookups.LookupInstance instance25 = domainObject.getSourceOfInformation();
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

			ims.core.vo.lookups.RegistrationSourceOfInfo voLookup25 = new ims.core.vo.lookups.RegistrationSourceOfInfo(instance25.getId(),instance25.getText(), instance25.isActive(), null, img, color);
			ims.core.vo.lookups.RegistrationSourceOfInfo parentVoLookup25 = voLookup25;
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
								parentVoLookup25.setParent(new ims.core.vo.lookups.RegistrationSourceOfInfo(parent25.getId(),parent25.getText(), parent25.isActive(), null, img, color));
				parentVoLookup25 = parentVoLookup25.getParent();
								parent25 = parent25.getParent();
			}			
			valueObject.setSourceOfInformation(voLookup25);
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
		ims.domain.lookups.LookupInstance instance32 = domainObject.getDementiaWorklistStatus();
		if ( null != instance32 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance32.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance32.getImage().getImageId(), instance32.getImage().getImagePath());
			}
			color = instance32.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.DementiaWorklistStatus voLookup32 = new ims.core.vo.lookups.DementiaWorklistStatus(instance32.getId(),instance32.getText(), instance32.isActive(), null, img, color);
			ims.core.vo.lookups.DementiaWorklistStatus parentVoLookup32 = voLookup32;
			ims.domain.lookups.LookupInstance parent32 = instance32.getParent();
			while (parent32 != null)
			{
				if (parent32.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent32.getImage().getImageId(), parent32.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent32.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup32.setParent(new ims.core.vo.lookups.DementiaWorklistStatus(parent32.getId(),parent32.getText(), parent32.isActive(), null, img, color));
				parentVoLookup32 = parentVoLookup32.getParent();
								parent32 = parent32.getParent();
			}			
			valueObject.setDementiaWorklistStatus(voLookup32);
		}
				// MRNStatus
		ims.domain.lookups.LookupInstance instance33 = domainObject.getMRNStatus();
		if ( null != instance33 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance33.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance33.getImage().getImageId(), instance33.getImage().getImagePath());
			}
			color = instance33.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.MRNStatus voLookup33 = new ims.core.vo.lookups.MRNStatus(instance33.getId(),instance33.getText(), instance33.isActive(), null, img, color);
			ims.core.vo.lookups.MRNStatus parentVoLookup33 = voLookup33;
			ims.domain.lookups.LookupInstance parent33 = instance33.getParent();
			while (parent33 != null)
			{
				if (parent33.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent33.getImage().getImageId(), parent33.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent33.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup33.setParent(new ims.core.vo.lookups.MRNStatus(parent33.getId(),parent33.getText(), parent33.isActive(), null, img, color));
				parentVoLookup33 = parentVoLookup33.getParent();
								parent33 = parent33.getParent();
			}			
			valueObject.setMRNStatus(voLookup33);
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
		ims.domain.lookups.LookupInstance instance37 = domainObject.getPatientCategory();
		if ( null != instance37 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance37.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance37.getImage().getImageId(), instance37.getImage().getImagePath());
			}
			color = instance37.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PatientStatus voLookup37 = new ims.core.vo.lookups.PatientStatus(instance37.getId(),instance37.getText(), instance37.isActive(), null, img, color);
			ims.core.vo.lookups.PatientStatus parentVoLookup37 = voLookup37;
			ims.domain.lookups.LookupInstance parent37 = instance37.getParent();
			while (parent37 != null)
			{
				if (parent37.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent37.getImage().getImageId(), parent37.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent37.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup37.setParent(new ims.core.vo.lookups.PatientStatus(parent37.getId(),parent37.getText(), parent37.isActive(), null, img, color));
				parentVoLookup37 = parentVoLookup37.getParent();
								parent37 = parent37.getParent();
			}			
			valueObject.setPatientCategory(voLookup37);
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
	public static ims.core.patient.domain.objects.Patient extractPatient(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ClientVo valueObject) 
	{
		return 	extractPatient(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.patient.domain.objects.Patient extractPatient(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ClientVo valueObject, HashMap domMap) 
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
			// ims.pci.vo.ClientVo ID_Patient field is unknown
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

		domainObject.setAddresses(ims.core.vo.domain.PersonAddressAssembler.extractAddressList(domainFactory, valueObject.getAddresses(), domainObject.getAddresses(), domMap));		
		domainObject.setGp(ims.core.vo.domain.GpShortVoAssembler.extractGp(domainFactory, valueObject.getGp(), domMap));
		ims.core.resource.place.domain.objects.LocSite value3 = null;
		if ( null != valueObject.getGpSurgery() ) 
		{
			if (valueObject.getGpSurgery().getBoId() == null)
			{
				if (domMap.get(valueObject.getGpSurgery()) != null)
				{
					value3 = (ims.core.resource.place.domain.objects.LocSite)domMap.get(valueObject.getGpSurgery());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getGpSurgery();	
			}
			else
			{
				value3 = (ims.core.resource.place.domain.objects.LocSite)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.LocSite.class, valueObject.getGpSurgery().getBoId());
			}
		}
		domainObject.setGpSurgery(value3);
		ims.core.patient.domain.objects.Patient value4 = null;
		if ( null != valueObject.getClientParent() ) 
		{
			if (valueObject.getClientParent().getBoId() == null)
			{
				if (domMap.get(valueObject.getClientParent()) != null)
				{
					value4 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getClientParent());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getClientParent();	
			}
			else
			{
				value4 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getClientParent().getBoId());
			}
		}
		domainObject.setClientParent(value4);
		domainObject.setCommunityCare(ims.pci.vo.domain.CommunityCareVoAssembler.extractCommunityCareDetail(domainFactory, valueObject.getCommunityCare(), domMap));
		domainObject.setOtherNames(ims.core.vo.domain.PersonNameAssembler.extractPersonNameList(domainFactory, valueObject.getOtherNames(), domainObject.getOtherNames(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getConfidentialReason() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getConfidentialReason().getID());
		}
		domainObject.setConfidentialReason(value7);
		domainObject.setIsChild(valueObject.getIsChild());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getNationality() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getNationality().getID());
		}
		domainObject.setNationality(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getDodSource() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getDodSource().getID());
		}
		domainObject.setDodSource(value10);
		domainObject.setName(ims.core.vo.domain.PersonNameAssembler.extractPersonName(domainFactory, valueObject.getName(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getSex() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getSex().getID());
		}
		domainObject.setSex(value12);
		domainObject.setAddress(ims.core.vo.domain.PersonAddressAssembler.extractAddress(domainFactory, valueObject.getAddress(), domMap));
		ims.framework.utils.PartialDate dob = valueObject.getDob();
		Integer value14 = null;
		if ( null != dob ) 
		{
			value14 = dob.toInteger();
		}
		domainObject.setDob(value14);
		java.util.Date value15 = null;
		ims.framework.utils.Date date15 = valueObject.getDod();		
		if ( date15 != null ) 
		{
			value15 = date15.getDate();
		}
		domainObject.setDod(value15);
		domainObject.setWard(ims.core.vo.domain.LocationLiteVoAssembler.extractLocation(domainFactory, valueObject.getWard(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value17 = null;
		if ( null != valueObject.getReligion() ) 
		{
			value17 =
				domainFactory.getLookupInstance(valueObject.getReligion().getID());
		}
		domainObject.setReligion(value17);
		domainObject.setIdentifiers(ims.core.vo.domain.PatientIdAssembler.extractPatientIdList(domainFactory, valueObject.getIdentifiers(), domainObject.getIdentifiers(), domMap));		
		domainObject.setIsActive(valueObject.getIsActive());
		domainObject.setAssociatedPatient(ims.core.vo.domain.PatientShortAssembler.extractPatient(domainFactory, valueObject.getAssociatedPatient(), domMap));
		domainObject.setCommChannels(ims.core.vo.domain.CommChannelVoAssembler.extractCommunicationChannelList(domainFactory, valueObject.getCommChannels(), domainObject.getCommChannels(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value22 = null;
		if ( null != valueObject.getEthnicOrigin() ) 
		{
			value22 =
				domainFactory.getLookupInstance(valueObject.getEthnicOrigin().getID());
		}
		domainObject.setEthnicOrigin(value22);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value23 = null;
		if ( null != valueObject.getMaritalStatus() ) 
		{
			value23 =
				domainFactory.getLookupInstance(valueObject.getMaritalStatus().getID());
		}
		domainObject.setMaritalStatus(value23);
		domainObject.setSCN(valueObject.getSCN());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value25 = null;
		if ( null != valueObject.getSourceOfInformation() ) 
		{
			value25 =
				domainFactory.getLookupInstance(valueObject.getSourceOfInformation().getID());
		}
		domainObject.setSourceOfInformation(value25);
		ims.framework.utils.Time time27 = valueObject.getTimeOfDeath();
		String value27 = null;
		if ( time27 != null ) 
		{
			value27 = time27.toString();
		}
		domainObject.setTimeOfDeath(value27);
		domainObject.setIsQuickRegistrationPatient(valueObject.getIsQuickRegistrationPatient());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.PatientNotification value29 = null;
		if ( null != valueObject.getOCSNotification() ) 
		{
			if (valueObject.getOCSNotification().getBoId() == null)
			{
				if (domMap.get(valueObject.getOCSNotification()) != null)
				{
					value29 = (ims.core.clinical.domain.objects.PatientNotification)domMap.get(valueObject.getOCSNotification());
				}
			}
			else
			{
				value29 = (ims.core.clinical.domain.objects.PatientNotification)domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientNotification.class, valueObject.getOCSNotification().getBoId());
			}
		}
		domainObject.setOCSNotification(value29);
		ims.core.resource.people.domain.objects.Medic value30 = null;
		if ( null != valueObject.getCurrentResponsibleConsultant() ) 
		{
			if (valueObject.getCurrentResponsibleConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getCurrentResponsibleConsultant()) != null)
				{
					value30 = (ims.core.resource.people.domain.objects.Medic)domMap.get(valueObject.getCurrentResponsibleConsultant());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value30 = domainObject.getCurrentResponsibleConsultant();	
			}
			else
			{
				value30 = (ims.core.resource.people.domain.objects.Medic)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Medic.class, valueObject.getCurrentResponsibleConsultant().getBoId());
			}
		}
		domainObject.setCurrentResponsibleConsultant(value30);
		ims.framework.utils.DateTime dateTime31 = valueObject.getDementiaBreachDateTime();
		java.util.Date value31 = null;
		if ( dateTime31 != null ) 
		{
			value31 = dateTime31.getJavaDate();
		}
		domainObject.setDementiaBreachDateTime(value31);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value32 = null;
		if ( null != valueObject.getDementiaWorklistStatus() ) 
		{
			value32 =
				domainFactory.getLookupInstance(valueObject.getDementiaWorklistStatus().getID());
		}
		domainObject.setDementiaWorklistStatus(value32);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value33 = null;
		if ( null != valueObject.getMRNStatus() ) 
		{
			value33 =
				domainFactory.getLookupInstance(valueObject.getMRNStatus().getID());
		}
		domainObject.setMRNStatus(value33);
		domainObject.setHasScannedCaseNoteFolders(valueObject.getHasScannedCaseNoteFolders());
		domainObject.setIsConfidential(valueObject.getIsConfidential());
		ims.framework.utils.Time time36 = valueObject.getTimeOfBirth();
		String value36 = null;
		if ( time36 != null ) 
		{
			value36 = time36.toString();
		}
		domainObject.setTimeOfBirth(value36);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value37 = null;
		if ( null != valueObject.getPatientCategory() ) 
		{
			value37 =
				domainFactory.getLookupInstance(valueObject.getPatientCategory().getID());
		}
		domainObject.setPatientCategory(value37);
		domainObject.setPDSPatientGP(ims.core.vo.domain.PDSPatientGPVoAssembler.extractPatientGP(domainFactory, valueObject.getPDSPatientGP(), domMap));

		return domainObject;
	}

}
