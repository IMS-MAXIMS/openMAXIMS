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
package ims.nursing.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Billy Mahon
 */
public class AdmissionDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.nursing.vo.AdmissionDetailsVo copy(ims.nursing.vo.AdmissionDetailsVo valueObjectDest, ims.nursing.vo.AdmissionDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_AdmissionDetails(valueObjectSrc.getID_AdmissionDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// PatientAdmReason
		valueObjectDest.setPatientAdmReason(valueObjectSrc.getPatientAdmReason());
		// NursingAdmReason
		valueObjectDest.setNursingAdmReason(valueObjectSrc.getNursingAdmReason());
		// ResusStatus
		valueObjectDest.setResusStatus(valueObjectSrc.getResusStatus());
		// IsDnrFormCompleted
		valueObjectDest.setIsDnrFormCompleted(valueObjectSrc.getIsDnrFormCompleted());
		// AdmQuestionsAns
		valueObjectDest.setAdmQuestionsAns(valueObjectSrc.getAdmQuestionsAns());
		// WasDiagnosisDiscussed
		valueObjectDest.setWasDiagnosisDiscussed(valueObjectSrc.getWasDiagnosisDiscussed());
		// CommunicationNeeds
		valueObjectDest.setCommunicationNeeds(valueObjectSrc.getCommunicationNeeds());
		// PreferredLang
		valueObjectDest.setPreferredLang(valueObjectSrc.getPreferredLang());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createAdmissionDetailsVoCollectionFromAdmissionDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.nursing.domain.objects.AdmissionDetails objects.
	 */
	public static ims.nursing.vo.AdmissionDetailsVoCollection createAdmissionDetailsVoCollectionFromAdmissionDetails(java.util.Set domainObjectSet)	
	{
		return createAdmissionDetailsVoCollectionFromAdmissionDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.nursing.domain.objects.AdmissionDetails objects.
	 */
	public static ims.nursing.vo.AdmissionDetailsVoCollection createAdmissionDetailsVoCollectionFromAdmissionDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.nursing.vo.AdmissionDetailsVoCollection voList = new ims.nursing.vo.AdmissionDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.nursing.domain.objects.AdmissionDetails domainObject = (ims.nursing.domain.objects.AdmissionDetails) iterator.next();
			ims.nursing.vo.AdmissionDetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.nursing.domain.objects.AdmissionDetails objects.
	 */
	public static ims.nursing.vo.AdmissionDetailsVoCollection createAdmissionDetailsVoCollectionFromAdmissionDetails(java.util.List domainObjectList) 
	{
		return createAdmissionDetailsVoCollectionFromAdmissionDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.nursing.domain.objects.AdmissionDetails objects.
	 */
	public static ims.nursing.vo.AdmissionDetailsVoCollection createAdmissionDetailsVoCollectionFromAdmissionDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.nursing.vo.AdmissionDetailsVoCollection voList = new ims.nursing.vo.AdmissionDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.nursing.domain.objects.AdmissionDetails domainObject = (ims.nursing.domain.objects.AdmissionDetails) domainObjectList.get(i);
			ims.nursing.vo.AdmissionDetailsVo vo = create(map, domainObject);

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
	 * Create the ims.nursing.domain.objects.AdmissionDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractAdmissionDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.AdmissionDetailsVoCollection voCollection) 
	 {
	 	return extractAdmissionDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractAdmissionDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.AdmissionDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.AdmissionDetailsVo vo = voCollection.get(i);
			ims.nursing.domain.objects.AdmissionDetails domainObject = AdmissionDetailsVoAssembler.extractAdmissionDetails(domainFactory, vo, domMap);

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
	 * Create the ims.nursing.domain.objects.AdmissionDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractAdmissionDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.AdmissionDetailsVoCollection voCollection) 
	 {
	 	return extractAdmissionDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractAdmissionDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.AdmissionDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.AdmissionDetailsVo vo = voCollection.get(i);
			ims.nursing.domain.objects.AdmissionDetails domainObject = AdmissionDetailsVoAssembler.extractAdmissionDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.nursing.domain.objects.AdmissionDetails object.
	 * @param domainObject ims.nursing.domain.objects.AdmissionDetails
	 */
	 public static ims.nursing.vo.AdmissionDetailsVo create(ims.nursing.domain.objects.AdmissionDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.nursing.domain.objects.AdmissionDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.nursing.vo.AdmissionDetailsVo create(DomainObjectMap map, ims.nursing.domain.objects.AdmissionDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.nursing.vo.AdmissionDetailsVo valueObject = (ims.nursing.vo.AdmissionDetailsVo) map.getValueObject(domainObject, ims.nursing.vo.AdmissionDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.nursing.vo.AdmissionDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.nursing.domain.objects.AdmissionDetails
	 */
	 public static ims.nursing.vo.AdmissionDetailsVo insert(ims.nursing.vo.AdmissionDetailsVo valueObject, ims.nursing.domain.objects.AdmissionDetails domainObject) 
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
	 * @param domainObject ims.nursing.domain.objects.AdmissionDetails
	 */
	 public static ims.nursing.vo.AdmissionDetailsVo insert(DomainObjectMap map, ims.nursing.vo.AdmissionDetailsVo valueObject, ims.nursing.domain.objects.AdmissionDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_AdmissionDetails(domainObject.getId());
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
			
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
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
		// ClinicalContact
		if (domainObject.getClinicalContact() != null)
		{
			if(domainObject.getClinicalContact() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getClinicalContact();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(id, -1));				
			}
			else
			{
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(domainObject.getClinicalContact().getId(), domainObject.getClinicalContact().getVersion()));
			}
		}
		// PatientAdmReason
		valueObject.setPatientAdmReason(domainObject.getPatientAdmReason());
		// NursingAdmReason
		valueObject.setNursingAdmReason(domainObject.getNursingAdmReason());
		// ResusStatus
		ims.domain.lookups.LookupInstance instance6 = domainObject.getResusStatus();
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

			ims.core.vo.lookups.ResuscitationStatus voLookup6 = new ims.core.vo.lookups.ResuscitationStatus(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.ResuscitationStatus parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.ResuscitationStatus(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setResusStatus(voLookup6);
		}
				// IsDnrFormCompleted
		valueObject.setIsDnrFormCompleted( domainObject.isIsDnrFormCompleted() );
		// AdmQuestionsAns
		valueObject.setAdmQuestionsAns(ims.nursing.vo.domain.AdmissionDetailsQuestionsVoAssembler.createAdmissionDetailsQuestionsVoCollectionFromAdmissionDetailsQuestions(map, domainObject.getAdmQuestionsAns()) );
		// WasDiagnosisDiscussed
		valueObject.setWasDiagnosisDiscussed( domainObject.isWasDiagnosisDiscussed() );
		// CommunicationNeeds
		valueObject.setCommunicationNeeds(domainObject.getCommunicationNeeds());
		// PreferredLang
		ims.domain.lookups.LookupInstance instance11 = domainObject.getPreferredLang();
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

			ims.nursing.vo.lookups.PreferredLanguage voLookup11 = new ims.nursing.vo.lookups.PreferredLanguage(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.nursing.vo.lookups.PreferredLanguage parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.nursing.vo.lookups.PreferredLanguage(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setPreferredLang(voLookup11);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.nursing.domain.objects.AdmissionDetails extractAdmissionDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.AdmissionDetailsVo valueObject) 
	{
		return 	extractAdmissionDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.nursing.domain.objects.AdmissionDetails extractAdmissionDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.AdmissionDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_AdmissionDetails();
		ims.nursing.domain.objects.AdmissionDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.nursing.domain.objects.AdmissionDetails)domMap.get(valueObject);
			}
			// ims.nursing.vo.AdmissionDetailsVo ID_AdmissionDetails field is unknown
			domainObject = new ims.nursing.domain.objects.AdmissionDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_AdmissionDetails());
			if (domMap.get(key) != null)
			{
				return (ims.nursing.domain.objects.AdmissionDetails)domMap.get(key);
			}
			domainObject = (ims.nursing.domain.objects.AdmissionDetails) domainFactory.getDomainObject(ims.nursing.domain.objects.AdmissionDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_AdmissionDetails());

		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		ims.core.admin.domain.objects.CareContext value2 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value2 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getCareContext();	
			}
			else
			{
				value2 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value2);
		ims.core.admin.domain.objects.ClinicalContact value3 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value3 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getClinicalContact();	
			}
			else
			{
				value3 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPatientAdmReason() != null && valueObject.getPatientAdmReason().equals(""))
		{
			valueObject.setPatientAdmReason(null);
		}
		domainObject.setPatientAdmReason(valueObject.getPatientAdmReason());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNursingAdmReason() != null && valueObject.getNursingAdmReason().equals(""))
		{
			valueObject.setNursingAdmReason(null);
		}
		domainObject.setNursingAdmReason(valueObject.getNursingAdmReason());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getResusStatus() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getResusStatus().getID());
		}
		domainObject.setResusStatus(value6);
		domainObject.setIsDnrFormCompleted(valueObject.getIsDnrFormCompleted());
		domainObject.setAdmQuestionsAns(ims.nursing.vo.domain.AdmissionDetailsQuestionsVoAssembler.extractAdmissionDetailsQuestionsSet(domainFactory, valueObject.getAdmQuestionsAns(), domainObject.getAdmQuestionsAns(), domMap));		
		domainObject.setWasDiagnosisDiscussed(valueObject.getWasDiagnosisDiscussed());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCommunicationNeeds() != null && valueObject.getCommunicationNeeds().equals(""))
		{
			valueObject.setCommunicationNeeds(null);
		}
		domainObject.setCommunicationNeeds(valueObject.getCommunicationNeeds());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getPreferredLang() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getPreferredLang().getID());
		}
		domainObject.setPreferredLang(value11);

		return domainObject;
	}

}
