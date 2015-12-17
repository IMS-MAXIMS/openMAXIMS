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
package ims.therapies.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Bogdan Tofei
 */
public class TherapiesContactVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.therapies.vo.TherapiesContactVo copy(ims.therapies.vo.TherapiesContactVo valueObjectDest, ims.therapies.vo.TherapiesContactVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Contact(valueObjectSrc.getID_Contact());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// ContactHCP
		valueObjectDest.setContactHCP(valueObjectSrc.getContactHCP());
		// HCPDiscipline
		valueObjectDest.setHCPDiscipline(valueObjectSrc.getHCPDiscipline());
		// ContactDateTime
		valueObjectDest.setContactDateTime(valueObjectSrc.getContactDateTime());
		// EpisodeOfCare
		valueObjectDest.setEpisodeOfCare(valueObjectSrc.getEpisodeOfCare());
		// RecordingInfo
		valueObjectDest.setRecordingInfo(valueObjectSrc.getRecordingInfo());
		// ContactType
		valueObjectDest.setContactType(valueObjectSrc.getContactType());
		// ReferringProblem
		valueObjectDest.setReferringProblem(valueObjectSrc.getReferringProblem());
		// ConsentReason
		valueObjectDest.setConsentReason(valueObjectSrc.getConsentReason());
		// isFirstContact
		valueObjectDest.setIsFirstContact(valueObjectSrc.getIsFirstContact());
		// Activities
		valueObjectDest.setActivities(valueObjectSrc.getActivities());
		// PatientConsentToTreatment
		valueObjectDest.setPatientConsentToTreatment(valueObjectSrc.getPatientConsentToTreatment());
		// numOfAdditionalHCPs
		valueObjectDest.setNumOfAdditionalHCPs(valueObjectSrc.getNumOfAdditionalHCPs());
		// ResponsibleHCP
		valueObjectDest.setResponsibleHCP(valueObjectSrc.getResponsibleHCP());
		// noActivityUndertaken
		valueObjectDest.setNoActivityUndertaken(valueObjectSrc.getNoActivityUndertaken());
		// AdditionalHCPs
		valueObjectDest.setAdditionalHCPs(valueObjectSrc.getAdditionalHCPs());
		// Caseload
		valueObjectDest.setCaseload(valueObjectSrc.getCaseload());
		// TimeRequired
		valueObjectDest.setTimeRequired(valueObjectSrc.getTimeRequired());
		// TimeSpent
		valueObjectDest.setTimeSpent(valueObjectSrc.getTimeSpent());
		// SystemInformation
		valueObjectDest.setSystemInformation(valueObjectSrc.getSystemInformation());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTherapiesContactVoCollectionFromContact(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.therapies.domain.objects.Contact objects.
	 */
	public static ims.therapies.vo.TherapiesContactVoCollection createTherapiesContactVoCollectionFromContact(java.util.Set domainObjectSet)	
	{
		return createTherapiesContactVoCollectionFromContact(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.therapies.domain.objects.Contact objects.
	 */
	public static ims.therapies.vo.TherapiesContactVoCollection createTherapiesContactVoCollectionFromContact(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.therapies.vo.TherapiesContactVoCollection voList = new ims.therapies.vo.TherapiesContactVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.therapies.domain.objects.Contact domainObject = (ims.therapies.domain.objects.Contact) iterator.next();
			ims.therapies.vo.TherapiesContactVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.therapies.domain.objects.Contact objects.
	 */
	public static ims.therapies.vo.TherapiesContactVoCollection createTherapiesContactVoCollectionFromContact(java.util.List domainObjectList) 
	{
		return createTherapiesContactVoCollectionFromContact(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.therapies.domain.objects.Contact objects.
	 */
	public static ims.therapies.vo.TherapiesContactVoCollection createTherapiesContactVoCollectionFromContact(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.therapies.vo.TherapiesContactVoCollection voList = new ims.therapies.vo.TherapiesContactVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.therapies.domain.objects.Contact domainObject = (ims.therapies.domain.objects.Contact) domainObjectList.get(i);
			ims.therapies.vo.TherapiesContactVo vo = create(map, domainObject);

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
	 * Create the ims.therapies.domain.objects.Contact set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractContactSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.TherapiesContactVoCollection voCollection) 
	 {
	 	return extractContactSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractContactSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.TherapiesContactVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.TherapiesContactVo vo = voCollection.get(i);
			ims.therapies.domain.objects.Contact domainObject = TherapiesContactVoAssembler.extractContact(domainFactory, vo, domMap);

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
	 * Create the ims.therapies.domain.objects.Contact list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractContactList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.TherapiesContactVoCollection voCollection) 
	 {
	 	return extractContactList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractContactList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.TherapiesContactVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.TherapiesContactVo vo = voCollection.get(i);
			ims.therapies.domain.objects.Contact domainObject = TherapiesContactVoAssembler.extractContact(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.therapies.domain.objects.Contact object.
	 * @param domainObject ims.therapies.domain.objects.Contact
	 */
	 public static ims.therapies.vo.TherapiesContactVo create(ims.therapies.domain.objects.Contact domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.therapies.domain.objects.Contact object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.therapies.vo.TherapiesContactVo create(DomainObjectMap map, ims.therapies.domain.objects.Contact domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.therapies.vo.TherapiesContactVo valueObject = (ims.therapies.vo.TherapiesContactVo) map.getValueObject(domainObject, ims.therapies.vo.TherapiesContactVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.therapies.vo.TherapiesContactVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.therapies.domain.objects.Contact
	 */
	 public static ims.therapies.vo.TherapiesContactVo insert(ims.therapies.vo.TherapiesContactVo valueObject, ims.therapies.domain.objects.Contact domainObject) 
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
	 * @param domainObject ims.therapies.domain.objects.Contact
	 */
	 public static ims.therapies.vo.TherapiesContactVo insert(DomainObjectMap map, ims.therapies.vo.TherapiesContactVo valueObject, ims.therapies.domain.objects.Contact domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Contact(domainObject.getId());
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
			
		// CareContext
		if (domainObject.getCareContext() != null)
		{
			if(domainObject.getCareContext() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCareContext();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(id, -1));				
			}
			else
			{
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(domainObject.getCareContext().getId(), domainObject.getCareContext().getVersion()));
			}
		}
		// ContactHCP
		valueObject.setContactHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getContactHCP()) );
		// HCPDiscipline
		ims.domain.lookups.LookupInstance instance3 = domainObject.getHCPDiscipline();
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

			ims.core.vo.lookups.HcpDisType voLookup3 = new ims.core.vo.lookups.HcpDisType(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.HcpDisType parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.HcpDisType(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setHCPDiscipline(voLookup3);
		}
				// ContactDateTime
		java.util.Date ContactDateTime = domainObject.getContactDateTime();
		if ( null != ContactDateTime ) 
		{
			valueObject.setContactDateTime(new ims.framework.utils.DateTime(ContactDateTime) );
		}
		// EpisodeOfCare
		if (domainObject.getEpisodeOfCare() != null)
		{
			if(domainObject.getEpisodeOfCare() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getEpisodeOfCare();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setEpisodeOfCare(new ims.core.admin.vo.EpisodeOfCareRefVo(id, -1));				
			}
			else
			{
				valueObject.setEpisodeOfCare(new ims.core.admin.vo.EpisodeOfCareRefVo(domainObject.getEpisodeOfCare().getId(), domainObject.getEpisodeOfCare().getVersion()));
			}
		}
		// RecordingInfo
		valueObject.setRecordingInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getRecordingInfo()) );
		// ContactType
		ims.domain.lookups.LookupInstance instance7 = domainObject.getContactType();
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

			ims.therapies.vo.lookups.TherapiesContactType voLookup7 = new ims.therapies.vo.lookups.TherapiesContactType(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.therapies.vo.lookups.TherapiesContactType parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.therapies.vo.lookups.TherapiesContactType(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setContactType(voLookup7);
		}
				// ReferringProblem
		ims.domain.lookups.LookupInstance instance8 = domainObject.getReferringProblem();
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

			ims.therapies.vo.lookups.Caseload voLookup8 = new ims.therapies.vo.lookups.Caseload(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.therapies.vo.lookups.Caseload parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.therapies.vo.lookups.Caseload(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setReferringProblem(voLookup8);
		}
				// ConsentReason
		ims.domain.lookups.LookupInstance instance9 = domainObject.getConsentReason();
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

			ims.therapies.vo.lookups.ConsentReason voLookup9 = new ims.therapies.vo.lookups.ConsentReason(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.therapies.vo.lookups.ConsentReason parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.therapies.vo.lookups.ConsentReason(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setConsentReason(voLookup9);
		}
				// isFirstContact
		valueObject.setIsFirstContact( domainObject.isIsFirstContact() );
		// Activities
		ims.oncology.vo.ContactTypesByDisciplineItemRefVoCollection Activities = new ims.oncology.vo.ContactTypesByDisciplineItemRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getActivities().iterator(); iterator.hasNext(); ) 
		{
			ims.oncology.domain.objects.ContactTypesByDisciplineItem tmp = (ims.oncology.domain.objects.ContactTypesByDisciplineItem)iterator.next();
			if (tmp != null)
				Activities.add(new ims.oncology.vo.ContactTypesByDisciplineItemRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setActivities(Activities);
		// PatientConsentToTreatment
		valueObject.setPatientConsentToTreatment( domainObject.isPatientConsentToTreatment() );
		// numOfAdditionalHCPs
		valueObject.setNumOfAdditionalHCPs(domainObject.getNumOfAdditionalHCPs());
		// ResponsibleHCP
		valueObject.setResponsibleHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getResponsibleHCP()) );
		// noActivityUndertaken
		valueObject.setNoActivityUndertaken( domainObject.isNoActivityUndertaken() );
		// AdditionalHCPs
		valueObject.setAdditionalHCPs(ims.therapies.vo.domain.AdditionalHCPVoAssembler.createAdditionalHCPVoCollectionFromAdditionalHCP(map, domainObject.getAdditionalHCPs()) );
		// Caseload
		ims.domain.lookups.LookupInstance instance17 = domainObject.getCaseload();
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

			ims.therapies.vo.lookups.Caseload voLookup17 = new ims.therapies.vo.lookups.Caseload(instance17.getId(),instance17.getText(), instance17.isActive(), null, img, color);
			ims.therapies.vo.lookups.Caseload parentVoLookup17 = voLookup17;
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
								parentVoLookup17.setParent(new ims.therapies.vo.lookups.Caseload(parent17.getId(),parent17.getText(), parent17.isActive(), null, img, color));
				parentVoLookup17 = parentVoLookup17.getParent();
								parent17 = parent17.getParent();
			}			
			valueObject.setCaseload(voLookup17);
		}
				// TimeRequired
		valueObject.setTimeRequired(domainObject.getTimeRequired());
		// TimeSpent
		valueObject.setTimeSpent(domainObject.getTimeSpent());
		// SystemInformation
		// set system information
		valueObject.setSystemInformation(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.therapies.domain.objects.Contact extractContact(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.TherapiesContactVo valueObject) 
	{
		return 	extractContact(domainFactory, valueObject, new HashMap());
	}

	public static ims.therapies.domain.objects.Contact extractContact(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.TherapiesContactVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Contact();
		ims.therapies.domain.objects.Contact domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.therapies.domain.objects.Contact)domMap.get(valueObject);
			}
			// ims.therapies.vo.TherapiesContactVo ID_Contact field is unknown
			domainObject = new ims.therapies.domain.objects.Contact();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Contact());
			if (domMap.get(key) != null)
			{
				return (ims.therapies.domain.objects.Contact)domMap.get(key);
			}
			domainObject = (ims.therapies.domain.objects.Contact) domainFactory.getDomainObject(ims.therapies.domain.objects.Contact.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Contact());

		ims.core.admin.domain.objects.CareContext value1 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value1 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getCareContext();	
			}
			else
			{
				value1 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value1);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value2 = null;
		if ( null != valueObject.getContactHCP() ) 
		{
			if (valueObject.getContactHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getContactHCP()) != null)
				{
					value2 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getContactHCP());
				}
			}
			else
			{
				value2 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getContactHCP().getBoId());
			}
		}
		domainObject.setContactHCP(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getHCPDiscipline() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getHCPDiscipline().getID());
		}
		domainObject.setHCPDiscipline(value3);
		ims.framework.utils.DateTime dateTime4 = valueObject.getContactDateTime();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setContactDateTime(value4);
		ims.core.admin.domain.objects.EpisodeOfCare value5 = null;
		if ( null != valueObject.getEpisodeOfCare() ) 
		{
			if (valueObject.getEpisodeOfCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisodeOfCare()) != null)
				{
					value5 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisodeOfCare());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value5 = domainObject.getEpisodeOfCare();	
			}
			else
			{
				value5 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisodeOfCare().getBoId());
			}
		}
		domainObject.setEpisodeOfCare(value5);
		domainObject.setRecordingInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getRecordingInfo(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getContactType() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getContactType().getID());
		}
		domainObject.setContactType(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getReferringProblem() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getReferringProblem().getID());
		}
		domainObject.setReferringProblem(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getConsentReason() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getConsentReason().getID());
		}
		domainObject.setConsentReason(value9);
		domainObject.setIsFirstContact(valueObject.getIsFirstContact());

		ims.oncology.vo.ContactTypesByDisciplineItemRefVoCollection refCollection11 = valueObject.getActivities();
		int size11 = (null == refCollection11) ? 0 : refCollection11.size();		
		java.util.List domainActivities11 = domainObject.getActivities();
		if (domainActivities11 == null)
		{
			domainActivities11 = new java.util.ArrayList();
		}
		for(int i=0; i < size11; i++) 
		{
			ims.oncology.vo.ContactTypesByDisciplineItemRefVo vo = refCollection11.get(i);			
			ims.oncology.domain.objects.ContactTypesByDisciplineItem dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.oncology.domain.objects.ContactTypesByDisciplineItem)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.oncology.domain.objects.ContactTypesByDisciplineItem)domainFactory.getDomainObject( ims.oncology.domain.objects.ContactTypesByDisciplineItem.class, vo.getBoId());
				}
			}

			int domIdx = domainActivities11.indexOf(dom);
			if (domIdx == -1)
			{
				domainActivities11.add(i, dom);
			}
			else if (i != domIdx && i < domainActivities11.size())
			{
				Object tmp = domainActivities11.get(i);
				domainActivities11.set(i, domainActivities11.get(domIdx));
				domainActivities11.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i11 = domainActivities11.size();
		while (i11 > size11)
		{
			domainActivities11.remove(i11-1);
			i11 = domainActivities11.size();
		}
		
		domainObject.setActivities(domainActivities11);		
		domainObject.setPatientConsentToTreatment(valueObject.getPatientConsentToTreatment());
		domainObject.setNumOfAdditionalHCPs(valueObject.getNumOfAdditionalHCPs());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value14 = null;
		if ( null != valueObject.getResponsibleHCP() ) 
		{
			if (valueObject.getResponsibleHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getResponsibleHCP()) != null)
				{
					value14 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getResponsibleHCP());
				}
			}
			else
			{
				value14 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getResponsibleHCP().getBoId());
			}
		}
		domainObject.setResponsibleHCP(value14);
		domainObject.setNoActivityUndertaken(valueObject.getNoActivityUndertaken());
		domainObject.setAdditionalHCPs(ims.therapies.vo.domain.AdditionalHCPVoAssembler.extractAdditionalHCPList(domainFactory, valueObject.getAdditionalHCPs(), domainObject.getAdditionalHCPs(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value17 = null;
		if ( null != valueObject.getCaseload() ) 
		{
			value17 =
				domainFactory.getLookupInstance(valueObject.getCaseload().getID());
		}
		domainObject.setCaseload(value17);
		domainObject.setTimeRequired(valueObject.getTimeRequired());
		domainObject.setTimeSpent(valueObject.getTimeSpent());

		return domainObject;
	}

}
