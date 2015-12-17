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
		// NationalHealthCover
		valueObjectDest.setNationalHealthCover(valueObjectSrc.getNationalHealthCover());
		// AlternativeContact
		valueObjectDest.setAlternativeContact(valueObjectSrc.getAlternativeContact());
		// HealthBoard
		valueObjectDest.setHealthBoard(valueObjectSrc.getHealthBoard());
		// SupportNetworkFamily
		valueObjectDest.setSupportNetworkFamily(valueObjectSrc.getSupportNetworkFamily());
		// PDSDeathNotificationStatus
		valueObjectDest.setPDSDeathNotificationStatus(valueObjectSrc.getPDSDeathNotificationStatus());
		// PDSInterpreterRequired
		valueObjectDest.setPDSInterpreterRequired(valueObjectSrc.getPDSInterpreterRequired());
		// PDSrelatives
		valueObjectDest.setPDSrelatives(valueObjectSrc.getPDSrelatives());
		// PDSPatientUpdate
		valueObjectDest.setPDSPatientUpdate(valueObjectSrc.getPDSPatientUpdate());
		// PDSPatientGPHistory
		valueObjectDest.setPDSPatientGPHistory(valueObjectSrc.getPDSPatientGPHistory());
		// School
		valueObjectDest.setSchool(valueObjectSrc.getSchool());
		// OverseasVisitor
		valueObjectDest.setOverseasVisitor(valueObjectSrc.getOverseasVisitor());
		// OverseasClassification
		valueObjectDest.setOverseasClassification(valueObjectSrc.getOverseasClassification());
		// HasLivedUK
		valueObjectDest.setHasLivedUK(valueObjectSrc.getHasLivedUK());
		// Decoupled
		valueObjectDest.setDecoupled(valueObjectSrc.getDecoupled());
		// PDSDateLastChecked
		valueObjectDest.setPDSDateLastChecked(valueObjectSrc.getPDSDateLastChecked());
		// SchoolOrCollege
		valueObjectDest.setSchoolOrCollege(valueObjectSrc.getSchoolOrCollege());
		// isChildInPublicCare
		valueObjectDest.setIsChildInPublicCare(valueObjectSrc.getIsChildInPublicCare());
		// PublicCareNeed
		valueObjectDest.setPublicCareNeed(valueObjectSrc.getPublicCareNeed());
		// txtOccupation
		valueObjectDest.setTxtOccupation(valueObjectSrc.getTxtOccupation());
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
		ims.domain.lookups.LookupInstance instance11 = domainObject.getHomeFolderLocation();
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

			ims.core.vo.lookups.HomeFolderLocation voLookup11 = new ims.core.vo.lookups.HomeFolderLocation(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.core.vo.lookups.HomeFolderLocation parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.core.vo.lookups.HomeFolderLocation(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setHomeFolderLocation(voLookup11);
		}
				// PrefCommLanguage
		ims.domain.lookups.LookupInstance instance12 = domainObject.getPrefCommLanguage();
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

			ims.core.vo.lookups.PDSPreferredCommunicationLanguage voLookup12 = new ims.core.vo.lookups.PDSPreferredCommunicationLanguage(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.core.vo.lookups.PDSPreferredCommunicationLanguage parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.core.vo.lookups.PDSPreferredCommunicationLanguage(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setPrefCommLanguage(voLookup12);
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
		// NationalHealthCover
		valueObject.setNationalHealthCover(ims.core.vo.domain.NationalHealthCoverVoAssembler.create(map, domainObject.getNationalHealthCover()) );
		// AlternativeContact
		valueObject.setAlternativeContact(ims.core.vo.domain.PatientContactPreferenceVoAssembler.create(map, domainObject.getAlternativeContact()) );
		// HealthBoard
		ims.domain.lookups.LookupInstance instance19 = domainObject.getHealthBoard();
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

			ims.core.vo.lookups.HealthBoard voLookup19 = new ims.core.vo.lookups.HealthBoard(instance19.getId(),instance19.getText(), instance19.isActive(), null, img, color);
			ims.core.vo.lookups.HealthBoard parentVoLookup19 = voLookup19;
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
								parentVoLookup19.setParent(new ims.core.vo.lookups.HealthBoard(parent19.getId(),parent19.getText(), parent19.isActive(), null, img, color));
				parentVoLookup19 = parentVoLookup19.getParent();
								parent19 = parent19.getParent();
			}			
			valueObject.setHealthBoard(voLookup19);
		}
				// SupportNetworkFamily
		valueObject.setSupportNetworkFamily(ims.core.vo.domain.SupportNetworkFamilyAssembler.createSupportNetworkFamilyCollectionFromSupportNetworkFamily(map, domainObject.getSupportNetworkFamily()) );
		// PDSDeathNotificationStatus
		ims.domain.lookups.LookupInstance instance21 = domainObject.getPDSDeathNotificationStatus();
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

			ims.admin.vo.lookups.PDSDeathNotificationStatus voLookup21 = new ims.admin.vo.lookups.PDSDeathNotificationStatus(instance21.getId(),instance21.getText(), instance21.isActive(), null, img, color);
			ims.admin.vo.lookups.PDSDeathNotificationStatus parentVoLookup21 = voLookup21;
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
								parentVoLookup21.setParent(new ims.admin.vo.lookups.PDSDeathNotificationStatus(parent21.getId(),parent21.getText(), parent21.isActive(), null, img, color));
				parentVoLookup21 = parentVoLookup21.getParent();
								parent21 = parent21.getParent();
			}			
			valueObject.setPDSDeathNotificationStatus(voLookup21);
		}
				// PDSInterpreterRequired
		valueObject.setPDSInterpreterRequired( domainObject.isPDSInterpreterRequired() );
		// PDSrelatives
		valueObject.setPDSrelatives(ims.core.vo.domain.PatRelativeAssembler.createPatRelativeCollectionFromRelative(map, domainObject.getPDSrelatives()) );
		// PDSPatientUpdate
		valueObject.setPDSPatientUpdate(ims.core.vo.domain.PDSPatientUpdateVoAssembler.create(map, domainObject.getPDSPatientUpdate()) );
		// PDSPatientGPHistory
		valueObject.setPDSPatientGPHistory(ims.core.vo.domain.PDSPatientGPVoAssembler.createPDSPatientGPVoCollectionFromPatientGP(map, domainObject.getPDSPatientGPHistory()) );
		// School
		if (domainObject.getSchool() != null)
		{
			if(domainObject.getSchool() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getSchool();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setSchool(new ims.core.resource.place.vo.SchoolRefVo(id, -1));				
			}
			else
			{
				valueObject.setSchool(new ims.core.resource.place.vo.SchoolRefVo(domainObject.getSchool().getId(), domainObject.getSchool().getVersion()));
			}
		}
		// OverseasVisitor
		valueObject.setOverseasVisitor( domainObject.isOverseasVisitor() );
		// OverseasClassification
		ims.domain.lookups.LookupInstance instance28 = domainObject.getOverseasClassification();
		if ( null != instance28 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance28.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance28.getImage().getImageId(), instance28.getImage().getImagePath());
			}
			color = instance28.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.OverseasVisitorStatusCassification voLookup28 = new ims.core.vo.lookups.OverseasVisitorStatusCassification(instance28.getId(),instance28.getText(), instance28.isActive(), null, img, color);
			ims.core.vo.lookups.OverseasVisitorStatusCassification parentVoLookup28 = voLookup28;
			ims.domain.lookups.LookupInstance parent28 = instance28.getParent();
			while (parent28 != null)
			{
				if (parent28.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent28.getImage().getImageId(), parent28.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent28.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup28.setParent(new ims.core.vo.lookups.OverseasVisitorStatusCassification(parent28.getId(),parent28.getText(), parent28.isActive(), null, img, color));
				parentVoLookup28 = parentVoLookup28.getParent();
								parent28 = parent28.getParent();
			}			
			valueObject.setOverseasClassification(voLookup28);
		}
				// HasLivedUK
		valueObject.setHasLivedUK( domainObject.isHasLivedUK() );
		// Decoupled
		valueObject.setDecoupled( domainObject.isDecoupled() );
		// PDSDateLastChecked
		java.util.Date PDSDateLastChecked = domainObject.getPDSDateLastChecked();
		if ( null != PDSDateLastChecked ) 
		{
			valueObject.setPDSDateLastChecked(new ims.framework.utils.Date(PDSDateLastChecked) );
		}
		// SchoolOrCollege
		ims.domain.lookups.LookupInstance instance32 = domainObject.getSchoolOrCollege();
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

			ims.emergency.vo.lookups.School voLookup32 = new ims.emergency.vo.lookups.School(instance32.getId(),instance32.getText(), instance32.isActive(), null, img, color);
			ims.emergency.vo.lookups.School parentVoLookup32 = voLookup32;
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
								parentVoLookup32.setParent(new ims.emergency.vo.lookups.School(parent32.getId(),parent32.getText(), parent32.isActive(), null, img, color));
				parentVoLookup32 = parentVoLookup32.getParent();
								parent32 = parent32.getParent();
			}			
			valueObject.setSchoolOrCollege(voLookup32);
		}
				// isChildInPublicCare
		valueObject.setIsChildInPublicCare( domainObject.isIsChildInPublicCare() );
		// PublicCareNeed
		ims.domain.lookups.LookupInstance instance34 = domainObject.getPublicCareNeed();
		if ( null != instance34 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance34.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance34.getImage().getImageId(), instance34.getImage().getImagePath());
			}
			color = instance34.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PublicCareNeed voLookup34 = new ims.core.vo.lookups.PublicCareNeed(instance34.getId(),instance34.getText(), instance34.isActive(), null, img, color);
			ims.core.vo.lookups.PublicCareNeed parentVoLookup34 = voLookup34;
			ims.domain.lookups.LookupInstance parent34 = instance34.getParent();
			while (parent34 != null)
			{
				if (parent34.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent34.getImage().getImageId(), parent34.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent34.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup34.setParent(new ims.core.vo.lookups.PublicCareNeed(parent34.getId(),parent34.getText(), parent34.isActive(), null, img, color));
				parentVoLookup34 = parentVoLookup34.getParent();
								parent34 = parent34.getParent();
			}			
			valueObject.setPublicCareNeed(voLookup34);
		}
				// txtOccupation
		valueObject.setTxtOccupation(domainObject.getTxtOccupation());
		// name
		valueObject.setName(ims.core.vo.domain.PersonNameAssembler.create(map, domainObject.getName()) );
		// sex
		ims.domain.lookups.LookupInstance instance37 = domainObject.getSex();
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

			ims.core.vo.lookups.Sex voLookup37 = new ims.core.vo.lookups.Sex(instance37.getId(),instance37.getText(), instance37.isActive(), null, img, color);
			ims.core.vo.lookups.Sex parentVoLookup37 = voLookup37;
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
								parentVoLookup37.setParent(new ims.core.vo.lookups.Sex(parent37.getId(),parent37.getText(), parent37.isActive(), null, img, color));
				parentVoLookup37 = parentVoLookup37.getParent();
								parent37 = parent37.getParent();
			}			
			valueObject.setSex(voLookup37);
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
		ims.domain.lookups.LookupInstance instance42 = domainObject.getReligion();
		if ( null != instance42 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance42.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance42.getImage().getImageId(), instance42.getImage().getImagePath());
			}
			color = instance42.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.Religion voLookup42 = new ims.core.vo.lookups.Religion(instance42.getId(),instance42.getText(), instance42.isActive(), null, img, color);
			ims.core.vo.lookups.Religion parentVoLookup42 = voLookup42;
			ims.domain.lookups.LookupInstance parent42 = instance42.getParent();
			while (parent42 != null)
			{
				if (parent42.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent42.getImage().getImageId(), parent42.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent42.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup42.setParent(new ims.core.vo.lookups.Religion(parent42.getId(),parent42.getText(), parent42.isActive(), null, img, color));
				parentVoLookup42 = parentVoLookup42.getParent();
								parent42 = parent42.getParent();
			}			
			valueObject.setReligion(voLookup42);
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
		ims.domain.lookups.LookupInstance instance47 = domainObject.getEthnicOrigin();
		if ( null != instance47 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance47.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance47.getImage().getImageId(), instance47.getImage().getImagePath());
			}
			color = instance47.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.EthnicOrigin voLookup47 = new ims.core.vo.lookups.EthnicOrigin(instance47.getId(),instance47.getText(), instance47.isActive(), null, img, color);
			ims.core.vo.lookups.EthnicOrigin parentVoLookup47 = voLookup47;
			ims.domain.lookups.LookupInstance parent47 = instance47.getParent();
			while (parent47 != null)
			{
				if (parent47.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent47.getImage().getImageId(), parent47.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent47.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup47.setParent(new ims.core.vo.lookups.EthnicOrigin(parent47.getId(),parent47.getText(), parent47.isActive(), null, img, color));
				parentVoLookup47 = parentVoLookup47.getParent();
								parent47 = parent47.getParent();
			}			
			valueObject.setEthnicOrigin(voLookup47);
		}
				// maritalStatus
		ims.domain.lookups.LookupInstance instance48 = domainObject.getMaritalStatus();
		if ( null != instance48 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance48.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance48.getImage().getImageId(), instance48.getImage().getImagePath());
			}
			color = instance48.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.MaritalStatus voLookup48 = new ims.core.vo.lookups.MaritalStatus(instance48.getId(),instance48.getText(), instance48.isActive(), null, img, color);
			ims.core.vo.lookups.MaritalStatus parentVoLookup48 = voLookup48;
			ims.domain.lookups.LookupInstance parent48 = instance48.getParent();
			while (parent48 != null)
			{
				if (parent48.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent48.getImage().getImageId(), parent48.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent48.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup48.setParent(new ims.core.vo.lookups.MaritalStatus(parent48.getId(),parent48.getText(), parent48.isActive(), null, img, color));
				parentVoLookup48 = parentVoLookup48.getParent();
								parent48 = parent48.getParent();
			}			
			valueObject.setMaritalStatus(voLookup48);
		}
				// SCN
		valueObject.setSCN(domainObject.getSCN());
		// SourceOfInformation
		ims.domain.lookups.LookupInstance instance50 = domainObject.getSourceOfInformation();
		if ( null != instance50 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance50.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance50.getImage().getImageId(), instance50.getImage().getImagePath());
			}
			color = instance50.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.RegistrationSourceOfInfo voLookup50 = new ims.core.vo.lookups.RegistrationSourceOfInfo(instance50.getId(),instance50.getText(), instance50.isActive(), null, img, color);
			ims.core.vo.lookups.RegistrationSourceOfInfo parentVoLookup50 = voLookup50;
			ims.domain.lookups.LookupInstance parent50 = instance50.getParent();
			while (parent50 != null)
			{
				if (parent50.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent50.getImage().getImageId(), parent50.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent50.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup50.setParent(new ims.core.vo.lookups.RegistrationSourceOfInfo(parent50.getId(),parent50.getText(), parent50.isActive(), null, img, color));
				parentVoLookup50 = parentVoLookup50.getParent();
								parent50 = parent50.getParent();
			}			
			valueObject.setSourceOfInformation(voLookup50);
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
		ims.domain.lookups.LookupInstance instance57 = domainObject.getDementiaWorklistStatus();
		if ( null != instance57 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance57.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance57.getImage().getImageId(), instance57.getImage().getImagePath());
			}
			color = instance57.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.DementiaWorklistStatus voLookup57 = new ims.core.vo.lookups.DementiaWorklistStatus(instance57.getId(),instance57.getText(), instance57.isActive(), null, img, color);
			ims.core.vo.lookups.DementiaWorklistStatus parentVoLookup57 = voLookup57;
			ims.domain.lookups.LookupInstance parent57 = instance57.getParent();
			while (parent57 != null)
			{
				if (parent57.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent57.getImage().getImageId(), parent57.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent57.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup57.setParent(new ims.core.vo.lookups.DementiaWorklistStatus(parent57.getId(),parent57.getText(), parent57.isActive(), null, img, color));
				parentVoLookup57 = parentVoLookup57.getParent();
								parent57 = parent57.getParent();
			}			
			valueObject.setDementiaWorklistStatus(voLookup57);
		}
				// MRNStatus
		ims.domain.lookups.LookupInstance instance58 = domainObject.getMRNStatus();
		if ( null != instance58 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance58.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance58.getImage().getImageId(), instance58.getImage().getImagePath());
			}
			color = instance58.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.MRNStatus voLookup58 = new ims.core.vo.lookups.MRNStatus(instance58.getId(),instance58.getText(), instance58.isActive(), null, img, color);
			ims.core.vo.lookups.MRNStatus parentVoLookup58 = voLookup58;
			ims.domain.lookups.LookupInstance parent58 = instance58.getParent();
			while (parent58 != null)
			{
				if (parent58.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent58.getImage().getImageId(), parent58.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent58.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup58.setParent(new ims.core.vo.lookups.MRNStatus(parent58.getId(),parent58.getText(), parent58.isActive(), null, img, color));
				parentVoLookup58 = parentVoLookup58.getParent();
								parent58 = parent58.getParent();
			}			
			valueObject.setMRNStatus(voLookup58);
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
		ims.domain.lookups.LookupInstance instance62 = domainObject.getPatientCategory();
		if ( null != instance62 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance62.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance62.getImage().getImageId(), instance62.getImage().getImagePath());
			}
			color = instance62.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PatientStatus voLookup62 = new ims.core.vo.lookups.PatientStatus(instance62.getId(),instance62.getText(), instance62.isActive(), null, img, color);
			ims.core.vo.lookups.PatientStatus parentVoLookup62 = voLookup62;
			ims.domain.lookups.LookupInstance parent62 = instance62.getParent();
			while (parent62 != null)
			{
				if (parent62.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent62.getImage().getImageId(), parent62.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent62.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup62.setParent(new ims.core.vo.lookups.PatientStatus(parent62.getId(),parent62.getText(), parent62.isActive(), null, img, color));
				parentVoLookup62 = parentVoLookup62.getParent();
								parent62 = parent62.getParent();
			}			
			valueObject.setPatientCategory(voLookup62);
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
		domainObject.setOtherNames(ims.core.vo.domain.PersonNameAssembler.extractPersonNameList(domainFactory, valueObject.getOtherNames(), domainObject.getOtherNames(), domMap));		
		domainObject.setAddresses(ims.core.vo.domain.PersonAddressAssembler.extractAddressList(domainFactory, valueObject.getAddresses(), domainObject.getAddresses(), domMap));		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.LocSite value7 = null;
		if ( null != valueObject.getGpSurgery() ) 
		{
			if (valueObject.getGpSurgery().getBoId() == null)
			{
				if (domMap.get(valueObject.getGpSurgery()) != null)
				{
					value7 = (ims.core.resource.place.domain.objects.LocSite)domMap.get(valueObject.getGpSurgery());
				}
			}
			else
			{
				value7 = (ims.core.resource.place.domain.objects.LocSite)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.LocSite.class, valueObject.getGpSurgery().getBoId());
			}
		}
		domainObject.setGpSurgery(value7);
		domainObject.setPatientAlerts(ims.core.vo.domain.PatientAlertLiteVoAssembler.extractPatientAlertSet(domainFactory, valueObject.getPatientAlerts(), domainObject.getPatientAlerts(), domMap));		
		ims.core.patient.domain.objects.Patient value9 = null;
		if ( null != valueObject.getClientParent() ) 
		{
			if (valueObject.getClientParent().getBoId() == null)
			{
				if (domMap.get(valueObject.getClientParent()) != null)
				{
					value9 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getClientParent());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value9 = domainObject.getClientParent();	
			}
			else
			{
				value9 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getClientParent().getBoId());
			}
		}
		domainObject.setClientParent(value9);
		domainObject.setPhoto(ims.core.vo.domain.AppDBImageVoAssembler.extractAppDBImage(domainFactory, valueObject.getPhoto(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getHomeFolderLocation() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getHomeFolderLocation().getID());
		}
		domainObject.setHomeFolderLocation(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getPrefCommLanguage() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getPrefCommLanguage().getID());
		}
		domainObject.setPrefCommLanguage(value12);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Organisation value13 = null;
		if ( null != valueObject.getPractice() ) 
		{
			if (valueObject.getPractice().getBoId() == null)
			{
				if (domMap.get(valueObject.getPractice()) != null)
				{
					value13 = (ims.core.resource.place.domain.objects.Organisation)domMap.get(valueObject.getPractice());
				}
			}
			else
			{
				value13 = (ims.core.resource.place.domain.objects.Organisation)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Organisation.class, valueObject.getPractice().getBoId());
			}
		}
		domainObject.setPractice(value13);
		domainObject.setCopyPatientOnCorrespondence(valueObject.getCopyPatientOnCorrespondence());
		java.util.Date value15 = null;
		ims.framework.utils.Date date15 = valueObject.getCopyPatientOnCorrespondenceDate();		
		if ( date15 != null ) 
		{
			value15 = date15.getDate();
		}
		domainObject.setCopyPatientOnCorrespondenceDate(value15);
		domainObject.setCurrentMedicalInsurance(ims.core.vo.domain.PatientMedicalInsuranceVoAssembler.extractPatientMedicalInsurance(domainFactory, valueObject.getCurrentMedicalInsurance(), domMap));
		domainObject.setNationalHealthCover(ims.core.vo.domain.NationalHealthCoverVoAssembler.extractNationalHealthCover(domainFactory, valueObject.getNationalHealthCover(), domMap));
		domainObject.setAlternativeContact(ims.core.vo.domain.PatientContactPreferenceVoAssembler.extractPatientContactPreference(domainFactory, valueObject.getAlternativeContact(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value19 = null;
		if ( null != valueObject.getHealthBoard() ) 
		{
			value19 =
				domainFactory.getLookupInstance(valueObject.getHealthBoard().getID());
		}
		domainObject.setHealthBoard(value19);

		// SaveAsRefVO treated as RefValueObject
		ims.core.clinical.vo.SupportNetworkFamilyRefVoCollection refCollection20 = new ims.core.clinical.vo.SupportNetworkFamilyRefVoCollection();
		if (valueObject.getSupportNetworkFamily() != null)
		{
			for (int i20=0; i20<valueObject.getSupportNetworkFamily().size(); i20++)
			{
				ims.core.clinical.vo.SupportNetworkFamilyRefVo ref20 = (ims.core.clinical.vo.SupportNetworkFamilyRefVo)valueObject.getSupportNetworkFamily().get(i20);
				refCollection20.add(ref20);
			}
		}
		int size20 = (null == refCollection20) ? 0 : refCollection20.size();		
		java.util.Set domainSupportNetworkFamily20 = domainObject.getSupportNetworkFamily();
		if (domainSupportNetworkFamily20 == null)
		{
			domainSupportNetworkFamily20 = new java.util.HashSet();
		}
		java.util.Set newSet20  = new java.util.HashSet();
		for(int i=0; i<size20; i++) 
		{
			ims.core.clinical.vo.SupportNetworkFamilyRefVo vo = refCollection20.get(i);					
			ims.core.clinical.domain.objects.SupportNetworkFamily dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.clinical.domain.objects.SupportNetworkFamily)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.clinical.domain.objects.SupportNetworkFamily)domainFactory.getDomainObject( ims.core.clinical.domain.objects.SupportNetworkFamily.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainSupportNetworkFamily20.contains(dom))
			{
				domainSupportNetworkFamily20.add(dom);
			}
			newSet20.add(dom);			
		}
		java.util.Set removedSet20 = new java.util.HashSet();
		java.util.Iterator iter20 = domainSupportNetworkFamily20.iterator();
		//Find out which objects need to be removed
		while (iter20.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter20.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet20.contains(o))
			{
				removedSet20.add(o);
			}
		}
		iter20 = removedSet20.iterator();
		//Remove the unwanted objects
		while (iter20.hasNext())
		{
			domainSupportNetworkFamily20.remove(iter20.next());
		}		
		
		domainObject.setSupportNetworkFamily(domainSupportNetworkFamily20);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value21 = null;
		if ( null != valueObject.getPDSDeathNotificationStatus() ) 
		{
			value21 =
				domainFactory.getLookupInstance(valueObject.getPDSDeathNotificationStatus().getID());
		}
		domainObject.setPDSDeathNotificationStatus(value21);
		domainObject.setPDSInterpreterRequired(valueObject.getPDSInterpreterRequired());
		domainObject.setPDSrelatives(ims.core.vo.domain.PatRelativeAssembler.extractRelativeList(domainFactory, valueObject.getPDSrelatives(), domainObject.getPDSrelatives(), domMap));		
		domainObject.setPDSPatientUpdate(ims.core.vo.domain.PDSPatientUpdateVoAssembler.extractPDSPatientUpdate(domainFactory, valueObject.getPDSPatientUpdate(), domMap));
		domainObject.setPDSPatientGPHistory(ims.core.vo.domain.PDSPatientGPVoAssembler.extractPatientGPList(domainFactory, valueObject.getPDSPatientGPHistory(), domainObject.getPDSPatientGPHistory(), domMap));		
		ims.core.resource.place.domain.objects.School value26 = null;
		if ( null != valueObject.getSchool() ) 
		{
			if (valueObject.getSchool().getBoId() == null)
			{
				if (domMap.get(valueObject.getSchool()) != null)
				{
					value26 = (ims.core.resource.place.domain.objects.School)domMap.get(valueObject.getSchool());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value26 = domainObject.getSchool();	
			}
			else
			{
				value26 = (ims.core.resource.place.domain.objects.School)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.School.class, valueObject.getSchool().getBoId());
			}
		}
		domainObject.setSchool(value26);
		domainObject.setOverseasVisitor(valueObject.getOverseasVisitor());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value28 = null;
		if ( null != valueObject.getOverseasClassification() ) 
		{
			value28 =
				domainFactory.getLookupInstance(valueObject.getOverseasClassification().getID());
		}
		domainObject.setOverseasClassification(value28);
		domainObject.setHasLivedUK(valueObject.getHasLivedUK());
		domainObject.setDecoupled(valueObject.getDecoupled());
		java.util.Date value31 = null;
		ims.framework.utils.Date date31 = valueObject.getPDSDateLastChecked();		
		if ( date31 != null ) 
		{
			value31 = date31.getDate();
		}
		domainObject.setPDSDateLastChecked(value31);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value32 = null;
		if ( null != valueObject.getSchoolOrCollege() ) 
		{
			value32 =
				domainFactory.getLookupInstance(valueObject.getSchoolOrCollege().getID());
		}
		domainObject.setSchoolOrCollege(value32);
		domainObject.setIsChildInPublicCare(valueObject.getIsChildInPublicCare());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value34 = null;
		if ( null != valueObject.getPublicCareNeed() ) 
		{
			value34 =
				domainFactory.getLookupInstance(valueObject.getPublicCareNeed().getID());
		}
		domainObject.setPublicCareNeed(value34);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTxtOccupation() != null && valueObject.getTxtOccupation().equals(""))
		{
			valueObject.setTxtOccupation(null);
		}
		domainObject.setTxtOccupation(valueObject.getTxtOccupation());
		domainObject.setName(ims.core.vo.domain.PersonNameAssembler.extractPersonName(domainFactory, valueObject.getName(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value37 = null;
		if ( null != valueObject.getSex() ) 
		{
			value37 =
				domainFactory.getLookupInstance(valueObject.getSex().getID());
		}
		domainObject.setSex(value37);
		domainObject.setAddress(ims.core.vo.domain.PersonAddressAssembler.extractAddress(domainFactory, valueObject.getAddress(), domMap));
		ims.framework.utils.PartialDate dob = valueObject.getDob();
		Integer value39 = null;
		if ( null != dob ) 
		{
			value39 = dob.toInteger();
		}
		domainObject.setDob(value39);
		java.util.Date value40 = null;
		ims.framework.utils.Date date40 = valueObject.getDod();		
		if ( date40 != null ) 
		{
			value40 = date40.getDate();
		}
		domainObject.setDod(value40);
		domainObject.setWard(ims.core.vo.domain.LocationLiteVoAssembler.extractLocation(domainFactory, valueObject.getWard(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value42 = null;
		if ( null != valueObject.getReligion() ) 
		{
			value42 =
				domainFactory.getLookupInstance(valueObject.getReligion().getID());
		}
		domainObject.setReligion(value42);
		domainObject.setIdentifiers(ims.core.vo.domain.PatientIdAssembler.extractPatientIdList(domainFactory, valueObject.getIdentifiers(), domainObject.getIdentifiers(), domMap));		
		domainObject.setIsActive(valueObject.getIsActive());
		domainObject.setAssociatedPatient(ims.core.vo.domain.PatientShortAssembler.extractPatient(domainFactory, valueObject.getAssociatedPatient(), domMap));
		domainObject.setCommChannels(ims.core.vo.domain.CommChannelVoAssembler.extractCommunicationChannelList(domainFactory, valueObject.getCommChannels(), domainObject.getCommChannels(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value47 = null;
		if ( null != valueObject.getEthnicOrigin() ) 
		{
			value47 =
				domainFactory.getLookupInstance(valueObject.getEthnicOrigin().getID());
		}
		domainObject.setEthnicOrigin(value47);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value48 = null;
		if ( null != valueObject.getMaritalStatus() ) 
		{
			value48 =
				domainFactory.getLookupInstance(valueObject.getMaritalStatus().getID());
		}
		domainObject.setMaritalStatus(value48);
		domainObject.setSCN(valueObject.getSCN());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value50 = null;
		if ( null != valueObject.getSourceOfInformation() ) 
		{
			value50 =
				domainFactory.getLookupInstance(valueObject.getSourceOfInformation().getID());
		}
		domainObject.setSourceOfInformation(value50);
		ims.framework.utils.Time time52 = valueObject.getTimeOfDeath();
		String value52 = null;
		if ( time52 != null ) 
		{
			value52 = time52.toString();
		}
		domainObject.setTimeOfDeath(value52);
		domainObject.setIsQuickRegistrationPatient(valueObject.getIsQuickRegistrationPatient());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.PatientNotification value54 = null;
		if ( null != valueObject.getOCSNotification() ) 
		{
			if (valueObject.getOCSNotification().getBoId() == null)
			{
				if (domMap.get(valueObject.getOCSNotification()) != null)
				{
					value54 = (ims.core.clinical.domain.objects.PatientNotification)domMap.get(valueObject.getOCSNotification());
				}
			}
			else
			{
				value54 = (ims.core.clinical.domain.objects.PatientNotification)domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientNotification.class, valueObject.getOCSNotification().getBoId());
			}
		}
		domainObject.setOCSNotification(value54);
		ims.core.resource.people.domain.objects.Medic value55 = null;
		if ( null != valueObject.getCurrentResponsibleConsultant() ) 
		{
			if (valueObject.getCurrentResponsibleConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getCurrentResponsibleConsultant()) != null)
				{
					value55 = (ims.core.resource.people.domain.objects.Medic)domMap.get(valueObject.getCurrentResponsibleConsultant());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value55 = domainObject.getCurrentResponsibleConsultant();	
			}
			else
			{
				value55 = (ims.core.resource.people.domain.objects.Medic)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Medic.class, valueObject.getCurrentResponsibleConsultant().getBoId());
			}
		}
		domainObject.setCurrentResponsibleConsultant(value55);
		ims.framework.utils.DateTime dateTime56 = valueObject.getDementiaBreachDateTime();
		java.util.Date value56 = null;
		if ( dateTime56 != null ) 
		{
			value56 = dateTime56.getJavaDate();
		}
		domainObject.setDementiaBreachDateTime(value56);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value57 = null;
		if ( null != valueObject.getDementiaWorklistStatus() ) 
		{
			value57 =
				domainFactory.getLookupInstance(valueObject.getDementiaWorklistStatus().getID());
		}
		domainObject.setDementiaWorklistStatus(value57);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value58 = null;
		if ( null != valueObject.getMRNStatus() ) 
		{
			value58 =
				domainFactory.getLookupInstance(valueObject.getMRNStatus().getID());
		}
		domainObject.setMRNStatus(value58);
		domainObject.setHasScannedCaseNoteFolders(valueObject.getHasScannedCaseNoteFolders());
		domainObject.setIsConfidential(valueObject.getIsConfidential());
		ims.framework.utils.Time time61 = valueObject.getTimeOfBirth();
		String value61 = null;
		if ( time61 != null ) 
		{
			value61 = time61.toString();
		}
		domainObject.setTimeOfBirth(value61);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value62 = null;
		if ( null != valueObject.getPatientCategory() ) 
		{
			value62 =
				domainFactory.getLookupInstance(valueObject.getPatientCategory().getID());
		}
		domainObject.setPatientCategory(value62);
		domainObject.setPDSPatientGP(ims.core.vo.domain.PDSPatientGPVoAssembler.extractPatientGP(domainFactory, valueObject.getPDSPatientGP(), domMap));

		return domainObject;
	}

}
