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
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class PatientDocumentForClinicalReferralVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.PatientDocumentForClinicalReferralVo copy(ims.clinical.vo.PatientDocumentForClinicalReferralVo valueObjectDest, ims.clinical.vo.PatientDocumentForClinicalReferralVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientDocument(valueObjectSrc.getID_PatientDocument());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// ServerDocument
		valueObjectDest.setServerDocument(valueObjectSrc.getServerDocument());
		// CreationType
		valueObjectDest.setCreationType(valueObjectSrc.getCreationType());
		// Category
		valueObjectDest.setCategory(valueObjectSrc.getCategory());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// RecordingUser
		valueObjectDest.setRecordingUser(valueObjectSrc.getRecordingUser());
		// RecordingDateTime
		valueObjectDest.setRecordingDateTime(valueObjectSrc.getRecordingDateTime());
		// DocumentDate
		valueObjectDest.setDocumentDate(valueObjectSrc.getDocumentDate());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientDocumentForClinicalReferralVoCollectionFromPatientDocument(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.documents.domain.objects.PatientDocument objects.
	 */
	public static ims.clinical.vo.PatientDocumentForClinicalReferralVoCollection createPatientDocumentForClinicalReferralVoCollectionFromPatientDocument(java.util.Set domainObjectSet)	
	{
		return createPatientDocumentForClinicalReferralVoCollectionFromPatientDocument(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.documents.domain.objects.PatientDocument objects.
	 */
	public static ims.clinical.vo.PatientDocumentForClinicalReferralVoCollection createPatientDocumentForClinicalReferralVoCollectionFromPatientDocument(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.PatientDocumentForClinicalReferralVoCollection voList = new ims.clinical.vo.PatientDocumentForClinicalReferralVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.documents.domain.objects.PatientDocument domainObject = (ims.core.documents.domain.objects.PatientDocument) iterator.next();
			ims.clinical.vo.PatientDocumentForClinicalReferralVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.documents.domain.objects.PatientDocument objects.
	 */
	public static ims.clinical.vo.PatientDocumentForClinicalReferralVoCollection createPatientDocumentForClinicalReferralVoCollectionFromPatientDocument(java.util.List domainObjectList) 
	{
		return createPatientDocumentForClinicalReferralVoCollectionFromPatientDocument(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.documents.domain.objects.PatientDocument objects.
	 */
	public static ims.clinical.vo.PatientDocumentForClinicalReferralVoCollection createPatientDocumentForClinicalReferralVoCollectionFromPatientDocument(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.PatientDocumentForClinicalReferralVoCollection voList = new ims.clinical.vo.PatientDocumentForClinicalReferralVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.documents.domain.objects.PatientDocument domainObject = (ims.core.documents.domain.objects.PatientDocument) domainObjectList.get(i);
			ims.clinical.vo.PatientDocumentForClinicalReferralVo vo = create(map, domainObject);

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
	 * Create the ims.core.documents.domain.objects.PatientDocument set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientDocumentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientDocumentForClinicalReferralVoCollection voCollection) 
	 {
	 	return extractPatientDocumentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientDocumentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientDocumentForClinicalReferralVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.PatientDocumentForClinicalReferralVo vo = voCollection.get(i);
			ims.core.documents.domain.objects.PatientDocument domainObject = PatientDocumentForClinicalReferralVoAssembler.extractPatientDocument(domainFactory, vo, domMap);

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
	 * Create the ims.core.documents.domain.objects.PatientDocument list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientDocumentList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientDocumentForClinicalReferralVoCollection voCollection) 
	 {
	 	return extractPatientDocumentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientDocumentList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientDocumentForClinicalReferralVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.PatientDocumentForClinicalReferralVo vo = voCollection.get(i);
			ims.core.documents.domain.objects.PatientDocument domainObject = PatientDocumentForClinicalReferralVoAssembler.extractPatientDocument(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.documents.domain.objects.PatientDocument object.
	 * @param domainObject ims.core.documents.domain.objects.PatientDocument
	 */
	 public static ims.clinical.vo.PatientDocumentForClinicalReferralVo create(ims.core.documents.domain.objects.PatientDocument domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.documents.domain.objects.PatientDocument object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.PatientDocumentForClinicalReferralVo create(DomainObjectMap map, ims.core.documents.domain.objects.PatientDocument domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.PatientDocumentForClinicalReferralVo valueObject = (ims.clinical.vo.PatientDocumentForClinicalReferralVo) map.getValueObject(domainObject, ims.clinical.vo.PatientDocumentForClinicalReferralVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.PatientDocumentForClinicalReferralVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.documents.domain.objects.PatientDocument
	 */
	 public static ims.clinical.vo.PatientDocumentForClinicalReferralVo insert(ims.clinical.vo.PatientDocumentForClinicalReferralVo valueObject, ims.core.documents.domain.objects.PatientDocument domainObject) 
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
	 * @param domainObject ims.core.documents.domain.objects.PatientDocument
	 */
	 public static ims.clinical.vo.PatientDocumentForClinicalReferralVo insert(DomainObjectMap map, ims.clinical.vo.PatientDocumentForClinicalReferralVo valueObject, ims.core.documents.domain.objects.PatientDocument domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientDocument(domainObject.getId());
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
			
		// Patient
		if (domainObject.getPatient() != null)
		{
			if(domainObject.getPatient() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPatient();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPatient(new ims.core.patient.vo.PatientRefVo(id, -1));				
			}
			else
			{
				valueObject.setPatient(new ims.core.patient.vo.PatientRefVo(domainObject.getPatient().getId(), domainObject.getPatient().getVersion()));
			}
		}
		// Name
		valueObject.setName(domainObject.getName());
		// ServerDocument
		valueObject.setServerDocument(ims.core.vo.domain.ServerDocumentVoAssembler.create(map, domainObject.getServerDocument()) );
		// CreationType
		ims.domain.lookups.LookupInstance instance4 = domainObject.getCreationType();
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

			ims.core.vo.lookups.DocumentCreationType voLookup4 = new ims.core.vo.lookups.DocumentCreationType(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.DocumentCreationType parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.DocumentCreationType(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setCreationType(voLookup4);
		}
				// Category
		ims.domain.lookups.LookupInstance instance5 = domainObject.getCategory();
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

			ims.core.vo.lookups.DocumentCategory voLookup5 = new ims.core.vo.lookups.DocumentCategory(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.DocumentCategory parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.DocumentCategory(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setCategory(voLookup5);
		}
				// Status
		ims.domain.lookups.LookupInstance instance6 = domainObject.getStatus();
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

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup6 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setStatus(voLookup6);
		}
				// RecordingUser
		if (domainObject.getRecordingUser() != null)
		{
			if(domainObject.getRecordingUser() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getRecordingUser();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setRecordingUser(new ims.core.resource.people.vo.MemberOfStaffRefVo(id, -1));				
			}
			else
			{
				valueObject.setRecordingUser(new ims.core.resource.people.vo.MemberOfStaffRefVo(domainObject.getRecordingUser().getId(), domainObject.getRecordingUser().getVersion()));
			}
		}
		// RecordingDateTime
		java.util.Date RecordingDateTime = domainObject.getRecordingDateTime();
		if ( null != RecordingDateTime ) 
		{
			valueObject.setRecordingDateTime(new ims.framework.utils.DateTime(RecordingDateTime) );
		}
		// DocumentDate
		java.util.Date DocumentDate = domainObject.getDocumentDate();
		if ( null != DocumentDate ) 
		{
			valueObject.setDocumentDate(new ims.framework.utils.Date(DocumentDate) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.documents.domain.objects.PatientDocument extractPatientDocument(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientDocumentForClinicalReferralVo valueObject) 
	{
		return 	extractPatientDocument(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.documents.domain.objects.PatientDocument extractPatientDocument(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientDocumentForClinicalReferralVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientDocument();
		ims.core.documents.domain.objects.PatientDocument domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.documents.domain.objects.PatientDocument)domMap.get(valueObject);
			}
			// ims.clinical.vo.PatientDocumentForClinicalReferralVo ID_PatientDocument field is unknown
			domainObject = new ims.core.documents.domain.objects.PatientDocument();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientDocument());
			if (domMap.get(key) != null)
			{
				return (ims.core.documents.domain.objects.PatientDocument)domMap.get(key);
			}
			domainObject = (ims.core.documents.domain.objects.PatientDocument) domainFactory.getDomainObject(ims.core.documents.domain.objects.PatientDocument.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientDocument());

		ims.core.patient.domain.objects.Patient value1 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value1 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getPatient();	
			}
			else
			{
				value1 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());
		domainObject.setServerDocument(ims.core.vo.domain.ServerDocumentVoAssembler.extractServerDocument(domainFactory, valueObject.getServerDocument(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getCreationType() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getCreationType().getID());
		}
		domainObject.setCreationType(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getCategory() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getCategory().getID());
		}
		domainObject.setCategory(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value6);
		ims.core.resource.people.domain.objects.MemberOfStaff value7 = null;
		if ( null != valueObject.getRecordingUser() ) 
		{
			if (valueObject.getRecordingUser().getBoId() == null)
			{
				if (domMap.get(valueObject.getRecordingUser()) != null)
				{
					value7 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getRecordingUser());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value7 = domainObject.getRecordingUser();	
			}
			else
			{
				value7 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getRecordingUser().getBoId());
			}
		}
		domainObject.setRecordingUser(value7);
		ims.framework.utils.DateTime dateTime8 = valueObject.getRecordingDateTime();
		java.util.Date value8 = null;
		if ( dateTime8 != null ) 
		{
			value8 = dateTime8.getJavaDate();
		}
		domainObject.setRecordingDateTime(value8);
		java.util.Date value9 = null;
		ims.framework.utils.Date date9 = valueObject.getDocumentDate();		
		if ( date9 != null ) 
		{
			value9 = date9.getDate();
		}
		domainObject.setDocumentDate(value9);

		return domainObject;
	}

}
