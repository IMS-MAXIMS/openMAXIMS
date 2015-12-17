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
 * @author John MacEnri
 */
public class PatientAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.Patient copy(ims.core.vo.Patient valueObjectDest, ims.core.vo.Patient valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Patient(valueObjectSrc.getID_Patient());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// gp
		valueObjectDest.setGp(valueObjectSrc.getGp());
		// occupation
		valueObjectDest.setOccupation(valueObjectSrc.getOccupation());
		// language
		valueObjectDest.setLanguage(valueObjectSrc.getLanguage());
		// nok
		valueObjectDest.setNok(valueObjectSrc.getNok());
		// Insurance
		valueObjectDest.setInsurance(valueObjectSrc.getInsurance());
		// otherNames
		valueObjectDest.setOtherNames(valueObjectSrc.getOtherNames());
		// addresses
		valueObjectDest.setAddresses(valueObjectSrc.getAddresses());
		// gpSurgery
		valueObjectDest.setGpSurgery(valueObjectSrc.getGpSurgery());
		// PatientAlerts
		valueObjectDest.setPatientAlerts(valueObjectSrc.getPatientAlerts());
		// clientParent
		valueObjectDest.setClientParent(valueObjectSrc.getClientParent());
		// Photo
		valueObjectDest.setPhoto(valueObjectSrc.getPhoto());
		// HomeFolderLocation
		valueObjectDest.setHomeFolderLocation(valueObjectSrc.getHomeFolderLocation());
		// PrefCommLanguage
		valueObjectDest.setPrefCommLanguage(valueObjectSrc.getPrefCommLanguage());
		// practice
		valueObjectDest.setPractice(valueObjectSrc.getPractice());
		// copyPatientOnCorrespondence
		valueObjectDest.setCopyPatientOnCorrespondence(valueObjectSrc.getCopyPatientOnCorrespondence());
		// copyPatientOnCorrespondenceDate
		valueObjectDest.setCopyPatientOnCorrespondenceDate(valueObjectSrc.getCopyPatientOnCorrespondenceDate());
		// currentMedicalInsurance
		valueObjectDest.setCurrentMedicalInsurance(valueObjectSrc.getCurrentMedicalInsurance());
		// MRNStatus
		valueObjectDest.setMRNStatus(valueObjectSrc.getMRNStatus());
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
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientCollectionFromPatient(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.Patient objects.
	 */
	public static ims.core.vo.PatientCollection createPatientCollectionFromPatient(java.util.Set domainObjectSet)	
	{
		return createPatientCollectionFromPatient(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.Patient objects.
	 */
	public static ims.core.vo.PatientCollection createPatientCollectionFromPatient(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatientCollection voList = new ims.core.vo.PatientCollection();
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
			ims.core.vo.Patient vo = create(map, domainObject);
			
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
	public static ims.core.vo.PatientCollection createPatientCollectionFromPatient(java.util.List domainObjectList) 
	{
		return createPatientCollectionFromPatient(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.patient.domain.objects.Patient objects.
	 */
	public static ims.core.vo.PatientCollection createPatientCollectionFromPatient(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatientCollection voList = new ims.core.vo.PatientCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.patient.domain.objects.Patient domainObject = (ims.core.patient.domain.objects.Patient) domainObjectList.get(i);
			ims.core.vo.Patient vo = create(map, domainObject);

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
	 public static java.util.Set extractPatientSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCollection voCollection) 
	 {
	 	return extractPatientSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.Patient vo = voCollection.get(i);
			ims.core.patient.domain.objects.Patient domainObject = PatientAssembler.extractPatient(domainFactory, vo, domMap);

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
	 public static java.util.List extractPatientList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCollection voCollection) 
	 {
	 	return extractPatientList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.Patient vo = voCollection.get(i);
			ims.core.patient.domain.objects.Patient domainObject = PatientAssembler.extractPatient(domainFactory, vo, domMap);

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
	 public static ims.core.vo.Patient create(ims.core.patient.domain.objects.Patient domainObject) 
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
	  public static ims.core.vo.Patient create(DomainObjectMap map, ims.core.patient.domain.objects.Patient domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.Patient valueObject = (ims.core.vo.Patient) map.getValueObject(domainObject, ims.core.vo.Patient.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.Patient(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.core.vo.Patient insert(ims.core.vo.Patient valueObject, ims.core.patient.domain.objects.Patient domainObject) 
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
	 public static ims.core.vo.Patient insert(DomainObjectMap map, ims.core.vo.Patient valueObject, ims.core.patient.domain.objects.Patient domainObject) 
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
			
		// gp
		valueObject.setGp(ims.core.vo.domain.GpShortVoAssembler.create(map, domainObject.getGp()) );
		// occupation
		ims.domain.lookups.LookupInstance instance2 = domainObject.getOccupation();
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

			ims.core.vo.lookups.Occupation voLookup2 = new ims.core.vo.lookups.Occupation(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.Occupation parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.Occupation(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setOccupation(voLookup2);
		}
				// language
		ims.domain.lookups.LookupInstance instance3 = domainObject.getLanguage();
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

			ims.core.vo.lookups.Language voLookup3 = new ims.core.vo.lookups.Language(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.Language parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.Language(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setLanguage(voLookup3);
		}
				// nok
		valueObject.setNok(ims.core.vo.domain.NextOfKinAssembler.create(map, domainObject.getNok()) );
		// Insurance
		valueObject.setInsurance(ims.core.vo.domain.InsuranceVoAssembler.create(map, domainObject.getInsurance()) );
		// otherNames
		valueObject.setOtherNames(ims.core.vo.domain.PersonNameAssembler.createPersonNameCollectionFromPersonName(map, domainObject.getOtherNames()) );
		// addresses
		valueObject.setAddresses(ims.core.vo.domain.PersonAddressAssembler.createPersonAddressCollectionFromAddress(map, domainObject.getAddresses()) );
		// gpSurgery
		valueObject.setGpSurgery(ims.core.vo.domain.LocSiteShortVoAssembler.create(map, domainObject.getGpSurgery()) );
		// PatientAlerts
		valueObject.setPatientAlerts(ims.core.vo.domain.PatientAlertLiteVoAssembler.createPatientAlertLiteVoCollectionFromPatientAlert(map, domainObject.getPatientAlerts()) );
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
		// Photo
		valueObject.setPhoto(ims.core.vo.domain.AppDBImageVoAssembler.create(map, domainObject.getPhoto()) );
		// HomeFolderLocation
		ims.domain.lookups.LookupInstance instance12 = domainObject.getHomeFolderLocation();
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

			ims.core.vo.lookups.HomeFolderLocation voLookup12 = new ims.core.vo.lookups.HomeFolderLocation(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.core.vo.lookups.HomeFolderLocation parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.core.vo.lookups.HomeFolderLocation(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setHomeFolderLocation(voLookup12);
		}
				// PrefCommLanguage
		ims.domain.lookups.LookupInstance instance13 = domainObject.getPrefCommLanguage();
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

			ims.core.vo.lookups.PreferredCommunicationLanguage voLookup13 = new ims.core.vo.lookups.PreferredCommunicationLanguage(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.core.vo.lookups.PreferredCommunicationLanguage parentVoLookup13 = voLookup13;
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
								parentVoLookup13.setParent(new ims.core.vo.lookups.PreferredCommunicationLanguage(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setPrefCommLanguage(voLookup13);
		}
				// practice
		valueObject.setPractice(ims.core.vo.domain.OrganisationWithSitesVoAssembler.create(map, domainObject.getPractice()) );
		// copyPatientOnCorrespondence
		valueObject.setCopyPatientOnCorrespondence( domainObject.isCopyPatientOnCorrespondence() );
		// copyPatientOnCorrespondenceDate
		java.util.Date copyPatientOnCorrespondenceDate = domainObject.getCopyPatientOnCorrespondenceDate();
		if ( null != copyPatientOnCorrespondenceDate ) 
		{
			valueObject.setCopyPatientOnCorrespondenceDate(new ims.framework.utils.Date(copyPatientOnCorrespondenceDate) );
		}
		// currentMedicalInsurance
		valueObject.setCurrentMedicalInsurance(ims.core.vo.domain.PatientMedicalInsuranceVoAssembler.create(map, domainObject.getCurrentMedicalInsurance()) );
		// MRNStatus
		ims.domain.lookups.LookupInstance instance18 = domainObject.getMRNStatus();
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

			ims.core.vo.lookups.MRNStatus voLookup18 = new ims.core.vo.lookups.MRNStatus(instance18.getId(),instance18.getText(), instance18.isActive(), null, img, color);
			ims.core.vo.lookups.MRNStatus parentVoLookup18 = voLookup18;
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
								parentVoLookup18.setParent(new ims.core.vo.lookups.MRNStatus(parent18.getId(),parent18.getText(), parent18.isActive(), null, img, color));
				parentVoLookup18 = parentVoLookup18.getParent();
								parent18 = parent18.getParent();
			}			
			valueObject.setMRNStatus(voLookup18);
		}
				// name
		valueObject.setName(ims.core.vo.domain.PersonNameAssembler.create(map, domainObject.getName()) );
		// sex
		ims.domain.lookups.LookupInstance instance20 = domainObject.getSex();
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

			ims.core.vo.lookups.Sex voLookup20 = new ims.core.vo.lookups.Sex(instance20.getId(),instance20.getText(), instance20.isActive(), null, img, color);
			ims.core.vo.lookups.Sex parentVoLookup20 = voLookup20;
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
								parentVoLookup20.setParent(new ims.core.vo.lookups.Sex(parent20.getId(),parent20.getText(), parent20.isActive(), null, img, color));
				parentVoLookup20 = parentVoLookup20.getParent();
								parent20 = parent20.getParent();
			}			
			valueObject.setSex(voLookup20);
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
		ims.domain.lookups.LookupInstance instance25 = domainObject.getReligion();
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

			ims.core.vo.lookups.Religion voLookup25 = new ims.core.vo.lookups.Religion(instance25.getId(),instance25.getText(), instance25.isActive(), null, img, color);
			ims.core.vo.lookups.Religion parentVoLookup25 = voLookup25;
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
								parentVoLookup25.setParent(new ims.core.vo.lookups.Religion(parent25.getId(),parent25.getText(), parent25.isActive(), null, img, color));
				parentVoLookup25 = parentVoLookup25.getParent();
								parent25 = parent25.getParent();
			}			
			valueObject.setReligion(voLookup25);
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
		ims.domain.lookups.LookupInstance instance30 = domainObject.getEthnicOrigin();
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

			ims.core.vo.lookups.EthnicOrigin voLookup30 = new ims.core.vo.lookups.EthnicOrigin(instance30.getId(),instance30.getText(), instance30.isActive(), null, img, color);
			ims.core.vo.lookups.EthnicOrigin parentVoLookup30 = voLookup30;
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
								parentVoLookup30.setParent(new ims.core.vo.lookups.EthnicOrigin(parent30.getId(),parent30.getText(), parent30.isActive(), null, img, color));
				parentVoLookup30 = parentVoLookup30.getParent();
								parent30 = parent30.getParent();
			}			
			valueObject.setEthnicOrigin(voLookup30);
		}
				// maritalStatus
		ims.domain.lookups.LookupInstance instance31 = domainObject.getMaritalStatus();
		if ( null != instance31 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance31.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance31.getImage().getImageId(), instance31.getImage().getImagePath());
			}
			color = instance31.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.MaritalStatus voLookup31 = new ims.core.vo.lookups.MaritalStatus(instance31.getId(),instance31.getText(), instance31.isActive(), null, img, color);
			ims.core.vo.lookups.MaritalStatus parentVoLookup31 = voLookup31;
			ims.domain.lookups.LookupInstance parent31 = instance31.getParent();
			while (parent31 != null)
			{
				if (parent31.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent31.getImage().getImageId(), parent31.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent31.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup31.setParent(new ims.core.vo.lookups.MaritalStatus(parent31.getId(),parent31.getText(), parent31.isActive(), null, img, color));
				parentVoLookup31 = parentVoLookup31.getParent();
								parent31 = parent31.getParent();
			}			
			valueObject.setMaritalStatus(voLookup31);
		}
				// SCN
		valueObject.setSCN(domainObject.getSCN());
		// SourceOfInformation
		ims.domain.lookups.LookupInstance instance33 = domainObject.getSourceOfInformation();
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

			ims.core.vo.lookups.RegistrationSourceOfInfo voLookup33 = new ims.core.vo.lookups.RegistrationSourceOfInfo(instance33.getId(),instance33.getText(), instance33.isActive(), null, img, color);
			ims.core.vo.lookups.RegistrationSourceOfInfo parentVoLookup33 = voLookup33;
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
								parentVoLookup33.setParent(new ims.core.vo.lookups.RegistrationSourceOfInfo(parent33.getId(),parent33.getText(), parent33.isActive(), null, img, color));
				parentVoLookup33 = parentVoLookup33.getParent();
								parent33 = parent33.getParent();
			}			
			valueObject.setSourceOfInformation(voLookup33);
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
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.patient.domain.objects.Patient extractPatient(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.Patient valueObject) 
	{
		return 	extractPatient(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.patient.domain.objects.Patient extractPatient(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.Patient valueObject, HashMap domMap) 
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
			// ims.core.vo.Patient ID_Patient field is unknown
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

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Gp value1 = null;
		if ( null != valueObject.getGp() ) 
		{
			if (valueObject.getGp().getBoId() == null)
			{
				if (domMap.get(valueObject.getGp()) != null)
				{
					value1 = (ims.core.resource.people.domain.objects.Gp)domMap.get(valueObject.getGp());
				}
			}
			else
			{
				value1 = (ims.core.resource.people.domain.objects.Gp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Gp.class, valueObject.getGp().getBoId());
			}
		}
		domainObject.setGp(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getOccupation() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getOccupation().getID());
		}
		domainObject.setOccupation(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getLanguage() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getLanguage().getID());
		}
		domainObject.setLanguage(value3);
		domainObject.setNok(ims.core.vo.domain.NextOfKinAssembler.extractNextOfKin(domainFactory, valueObject.getNok(), domMap));
		domainObject.setInsurance(ims.core.vo.domain.InsuranceVoAssembler.extractInsurance(domainFactory, valueObject.getInsurance(), domMap));
		domainObject.setOtherNames(ims.core.vo.domain.PersonNameAssembler.extractPersonNameList(domainFactory, valueObject.getOtherNames(), domainObject.getOtherNames(), domMap));		
		domainObject.setAddresses(ims.core.vo.domain.PersonAddressAssembler.extractAddressList(domainFactory, valueObject.getAddresses(), domainObject.getAddresses(), domMap));		
	// SaveAsRefVO - treated as a refVo in extract methods
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
			else
			{
				value8 = (ims.core.resource.place.domain.objects.LocSite)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.LocSite.class, valueObject.getGpSurgery().getBoId());
			}
		}
		domainObject.setGpSurgery(value8);
		domainObject.setPatientAlerts(ims.core.vo.domain.PatientAlertLiteVoAssembler.extractPatientAlertSet(domainFactory, valueObject.getPatientAlerts(), domainObject.getPatientAlerts(), domMap));		
		ims.core.patient.domain.objects.Patient value10 = null;
		if ( null != valueObject.getClientParent() ) 
		{
			if (valueObject.getClientParent().getBoId() == null)
			{
				if (domMap.get(valueObject.getClientParent()) != null)
				{
					value10 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getClientParent());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value10 = domainObject.getClientParent();	
			}
			else
			{
				value10 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getClientParent().getBoId());
			}
		}
		domainObject.setClientParent(value10);
		domainObject.setPhoto(ims.core.vo.domain.AppDBImageVoAssembler.extractAppDBImage(domainFactory, valueObject.getPhoto(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getHomeFolderLocation() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getHomeFolderLocation().getID());
		}
		domainObject.setHomeFolderLocation(value12);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getPrefCommLanguage() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getPrefCommLanguage().getID());
		}
		domainObject.setPrefCommLanguage(value13);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Organisation value14 = null;
		if ( null != valueObject.getPractice() ) 
		{
			if (valueObject.getPractice().getBoId() == null)
			{
				if (domMap.get(valueObject.getPractice()) != null)
				{
					value14 = (ims.core.resource.place.domain.objects.Organisation)domMap.get(valueObject.getPractice());
				}
			}
			else
			{
				value14 = (ims.core.resource.place.domain.objects.Organisation)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Organisation.class, valueObject.getPractice().getBoId());
			}
		}
		domainObject.setPractice(value14);
		domainObject.setCopyPatientOnCorrespondence(valueObject.getCopyPatientOnCorrespondence());
		java.util.Date value16 = null;
		ims.framework.utils.Date date16 = valueObject.getCopyPatientOnCorrespondenceDate();		
		if ( date16 != null ) 
		{
			value16 = date16.getDate();
		}
		domainObject.setCopyPatientOnCorrespondenceDate(value16);
		domainObject.setCurrentMedicalInsurance(ims.core.vo.domain.PatientMedicalInsuranceVoAssembler.extractPatientMedicalInsurance(domainFactory, valueObject.getCurrentMedicalInsurance(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value18 = null;
		if ( null != valueObject.getMRNStatus() ) 
		{
			value18 =
				domainFactory.getLookupInstance(valueObject.getMRNStatus().getID());
		}
		domainObject.setMRNStatus(value18);
		domainObject.setName(ims.core.vo.domain.PersonNameAssembler.extractPersonName(domainFactory, valueObject.getName(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value20 = null;
		if ( null != valueObject.getSex() ) 
		{
			value20 =
				domainFactory.getLookupInstance(valueObject.getSex().getID());
		}
		domainObject.setSex(value20);
		domainObject.setAddress(ims.core.vo.domain.PersonAddressAssembler.extractAddress(domainFactory, valueObject.getAddress(), domMap));
		ims.framework.utils.PartialDate dob = valueObject.getDob();
		Integer value22 = null;
		if ( null != dob ) 
		{
			value22 = dob.toInteger();
		}
		domainObject.setDob(value22);
		java.util.Date value23 = null;
		ims.framework.utils.Date date23 = valueObject.getDod();		
		if ( date23 != null ) 
		{
			value23 = date23.getDate();
		}
		domainObject.setDod(value23);
		domainObject.setWard(ims.core.vo.domain.LocationLiteVoAssembler.extractLocation(domainFactory, valueObject.getWard(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value25 = null;
		if ( null != valueObject.getReligion() ) 
		{
			value25 =
				domainFactory.getLookupInstance(valueObject.getReligion().getID());
		}
		domainObject.setReligion(value25);
		domainObject.setIdentifiers(ims.core.vo.domain.PatientIdAssembler.extractPatientIdList(domainFactory, valueObject.getIdentifiers(), domainObject.getIdentifiers(), domMap));		
		domainObject.setIsActive(valueObject.getIsActive());
		domainObject.setAssociatedPatient(ims.core.vo.domain.PatientShortAssembler.extractPatient(domainFactory, valueObject.getAssociatedPatient(), domMap));
		domainObject.setCommChannels(ims.core.vo.domain.CommChannelVoAssembler.extractCommunicationChannelList(domainFactory, valueObject.getCommChannels(), domainObject.getCommChannels(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value30 = null;
		if ( null != valueObject.getEthnicOrigin() ) 
		{
			value30 =
				domainFactory.getLookupInstance(valueObject.getEthnicOrigin().getID());
		}
		domainObject.setEthnicOrigin(value30);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value31 = null;
		if ( null != valueObject.getMaritalStatus() ) 
		{
			value31 =
				domainFactory.getLookupInstance(valueObject.getMaritalStatus().getID());
		}
		domainObject.setMaritalStatus(value31);
		domainObject.setSCN(valueObject.getSCN());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value33 = null;
		if ( null != valueObject.getSourceOfInformation() ) 
		{
			value33 =
				domainFactory.getLookupInstance(valueObject.getSourceOfInformation().getID());
		}
		domainObject.setSourceOfInformation(value33);
		ims.framework.utils.Time time35 = valueObject.getTimeOfDeath();
		String value35 = null;
		if ( time35 != null ) 
		{
			value35 = time35.toString();
		}
		domainObject.setTimeOfDeath(value35);
		domainObject.setIsQuickRegistrationPatient(valueObject.getIsQuickRegistrationPatient());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.PatientNotification value37 = null;
		if ( null != valueObject.getOCSNotification() ) 
		{
			if (valueObject.getOCSNotification().getBoId() == null)
			{
				if (domMap.get(valueObject.getOCSNotification()) != null)
				{
					value37 = (ims.core.clinical.domain.objects.PatientNotification)domMap.get(valueObject.getOCSNotification());
				}
			}
			else
			{
				value37 = (ims.core.clinical.domain.objects.PatientNotification)domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientNotification.class, valueObject.getOCSNotification().getBoId());
			}
		}
		domainObject.setOCSNotification(value37);
		ims.core.resource.people.domain.objects.Medic value38 = null;
		if ( null != valueObject.getCurrentResponsibleConsultant() ) 
		{
			if (valueObject.getCurrentResponsibleConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getCurrentResponsibleConsultant()) != null)
				{
					value38 = (ims.core.resource.people.domain.objects.Medic)domMap.get(valueObject.getCurrentResponsibleConsultant());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value38 = domainObject.getCurrentResponsibleConsultant();	
			}
			else
			{
				value38 = (ims.core.resource.people.domain.objects.Medic)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Medic.class, valueObject.getCurrentResponsibleConsultant().getBoId());
			}
		}
		domainObject.setCurrentResponsibleConsultant(value38);

		return domainObject;
	}

}
