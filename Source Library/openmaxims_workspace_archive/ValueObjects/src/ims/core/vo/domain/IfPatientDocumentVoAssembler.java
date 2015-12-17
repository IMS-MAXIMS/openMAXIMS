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
 * @author Michael Noonan
 */
public class IfPatientDocumentVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.IfPatientDocumentVo copy(ims.core.vo.IfPatientDocumentVo valueObjectDest, ims.core.vo.IfPatientDocumentVo valueObjectSrc) 
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
		// Category
		valueObjectDest.setCategory(valueObjectSrc.getCategory());
		// RecordingUser
		valueObjectDest.setRecordingUser(valueObjectSrc.getRecordingUser());
		// RecordingDateTime
		valueObjectDest.setRecordingDateTime(valueObjectSrc.getRecordingDateTime());
		// AuthoringHCP
		valueObjectDest.setAuthoringHCP(valueObjectSrc.getAuthoringHCP());
		// AuthoringDateTime
		valueObjectDest.setAuthoringDateTime(valueObjectSrc.getAuthoringDateTime());
		// Specialty
		valueObjectDest.setSpecialty(valueObjectSrc.getSpecialty());
		// ResponsibleHCP
		valueObjectDest.setResponsibleHCP(valueObjectSrc.getResponsibleHCP());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createIfPatientDocumentVoCollectionFromPatientDocument(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.documents.domain.objects.PatientDocument objects.
	 */
	public static ims.core.vo.IfPatientDocumentVoCollection createIfPatientDocumentVoCollectionFromPatientDocument(java.util.Set domainObjectSet)	
	{
		return createIfPatientDocumentVoCollectionFromPatientDocument(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.documents.domain.objects.PatientDocument objects.
	 */
	public static ims.core.vo.IfPatientDocumentVoCollection createIfPatientDocumentVoCollectionFromPatientDocument(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.IfPatientDocumentVoCollection voList = new ims.core.vo.IfPatientDocumentVoCollection();
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
			ims.core.vo.IfPatientDocumentVo vo = create(map, domainObject);
			
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
	public static ims.core.vo.IfPatientDocumentVoCollection createIfPatientDocumentVoCollectionFromPatientDocument(java.util.List domainObjectList) 
	{
		return createIfPatientDocumentVoCollectionFromPatientDocument(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.documents.domain.objects.PatientDocument objects.
	 */
	public static ims.core.vo.IfPatientDocumentVoCollection createIfPatientDocumentVoCollectionFromPatientDocument(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.IfPatientDocumentVoCollection voList = new ims.core.vo.IfPatientDocumentVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.documents.domain.objects.PatientDocument domainObject = (ims.core.documents.domain.objects.PatientDocument) domainObjectList.get(i);
			ims.core.vo.IfPatientDocumentVo vo = create(map, domainObject);

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
	 public static java.util.Set extractPatientDocumentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.IfPatientDocumentVoCollection voCollection) 
	 {
	 	return extractPatientDocumentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientDocumentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.IfPatientDocumentVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.IfPatientDocumentVo vo = voCollection.get(i);
			ims.core.documents.domain.objects.PatientDocument domainObject = IfPatientDocumentVoAssembler.extractPatientDocument(domainFactory, vo, domMap);

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
	 public static java.util.List extractPatientDocumentList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.IfPatientDocumentVoCollection voCollection) 
	 {
	 	return extractPatientDocumentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientDocumentList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.IfPatientDocumentVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.IfPatientDocumentVo vo = voCollection.get(i);
			ims.core.documents.domain.objects.PatientDocument domainObject = IfPatientDocumentVoAssembler.extractPatientDocument(domainFactory, vo, domMap);

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
	 public static ims.core.vo.IfPatientDocumentVo create(ims.core.documents.domain.objects.PatientDocument domainObject) 
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
	  public static ims.core.vo.IfPatientDocumentVo create(DomainObjectMap map, ims.core.documents.domain.objects.PatientDocument domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.IfPatientDocumentVo valueObject = (ims.core.vo.IfPatientDocumentVo) map.getValueObject(domainObject, ims.core.vo.IfPatientDocumentVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.IfPatientDocumentVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.core.vo.IfPatientDocumentVo insert(ims.core.vo.IfPatientDocumentVo valueObject, ims.core.documents.domain.objects.PatientDocument domainObject) 
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
	 public static ims.core.vo.IfPatientDocumentVo insert(DomainObjectMap map, ims.core.vo.IfPatientDocumentVo valueObject, ims.core.documents.domain.objects.PatientDocument domainObject) 
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
		valueObject.setPatient(ims.core.vo.domain.PatientAssembler.create(map, domainObject.getPatient()) );
		// Name
		valueObject.setName(domainObject.getName());
		// ServerDocument
		valueObject.setServerDocument(ims.core.vo.domain.ServerDocumentVoAssembler.create(map, domainObject.getServerDocument()) );
		// Category
		ims.domain.lookups.LookupInstance instance4 = domainObject.getCategory();
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

			ims.core.vo.lookups.DocumentCategory voLookup4 = new ims.core.vo.lookups.DocumentCategory(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.DocumentCategory parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.DocumentCategory(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setCategory(voLookup4);
		}
				// RecordingUser
		valueObject.setRecordingUser(ims.core.vo.domain.MemberOfStaffShortVoAssembler.create(map, domainObject.getRecordingUser()) );
		// RecordingDateTime
		java.util.Date RecordingDateTime = domainObject.getRecordingDateTime();
		if ( null != RecordingDateTime ) 
		{
			valueObject.setRecordingDateTime(new ims.framework.utils.DateTime(RecordingDateTime) );
		}
		// AuthoringHCP
		valueObject.setAuthoringHCP(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getAuthoringHCP()) );
		// AuthoringDateTime
		java.util.Date AuthoringDateTime = domainObject.getAuthoringDateTime();
		if ( null != AuthoringDateTime ) 
		{
			valueObject.setAuthoringDateTime(new ims.framework.utils.DateTime(AuthoringDateTime) );
		}
		// Specialty
		ims.domain.lookups.LookupInstance instance9 = domainObject.getSpecialty();
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

			ims.core.vo.lookups.Specialty voLookup9 = new ims.core.vo.lookups.Specialty(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.core.vo.lookups.Specialty(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setSpecialty(voLookup9);
		}
				// ResponsibleHCP
		valueObject.setResponsibleHCP(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getResponsibleHCP()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.documents.domain.objects.PatientDocument extractPatientDocument(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.IfPatientDocumentVo valueObject) 
	{
		return 	extractPatientDocument(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.documents.domain.objects.PatientDocument extractPatientDocument(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.IfPatientDocumentVo valueObject, HashMap domMap) 
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
			// ims.core.vo.IfPatientDocumentVo ID_PatientDocument field is unknown
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

	// SaveAsRefVO - treated as a refVo in extract methods
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
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.documents.domain.objects.ServerDocument value3 = null;
		if ( null != valueObject.getServerDocument() ) 
		{
			if (valueObject.getServerDocument().getBoId() == null)
			{
				if (domMap.get(valueObject.getServerDocument()) != null)
				{
					value3 = (ims.core.documents.domain.objects.ServerDocument)domMap.get(valueObject.getServerDocument());
				}
			}
			else
			{
				value3 = (ims.core.documents.domain.objects.ServerDocument)domainFactory.getDomainObject(ims.core.documents.domain.objects.ServerDocument.class, valueObject.getServerDocument().getBoId());
			}
		}
		domainObject.setServerDocument(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getCategory() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getCategory().getID());
		}
		domainObject.setCategory(value4);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value5 = null;
		if ( null != valueObject.getRecordingUser() ) 
		{
			if (valueObject.getRecordingUser().getBoId() == null)
			{
				if (domMap.get(valueObject.getRecordingUser()) != null)
				{
					value5 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getRecordingUser());
				}
			}
			else
			{
				value5 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getRecordingUser().getBoId());
			}
		}
		domainObject.setRecordingUser(value5);
		ims.framework.utils.DateTime dateTime6 = valueObject.getRecordingDateTime();
		java.util.Date value6 = null;
		if ( dateTime6 != null ) 
		{
			value6 = dateTime6.getJavaDate();
		}
		domainObject.setRecordingDateTime(value6);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value7 = null;
		if ( null != valueObject.getAuthoringHCP() ) 
		{
			if (valueObject.getAuthoringHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getAuthoringHCP()) != null)
				{
					value7 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getAuthoringHCP());
				}
			}
			else
			{
				value7 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getAuthoringHCP().getBoId());
			}
		}
		domainObject.setAuthoringHCP(value7);
		ims.framework.utils.DateTime dateTime8 = valueObject.getAuthoringDateTime();
		java.util.Date value8 = null;
		if ( dateTime8 != null ) 
		{
			value8 = dateTime8.getJavaDate();
		}
		domainObject.setAuthoringDateTime(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value9);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value10 = null;
		if ( null != valueObject.getResponsibleHCP() ) 
		{
			if (valueObject.getResponsibleHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getResponsibleHCP()) != null)
				{
					value10 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getResponsibleHCP());
				}
			}
			else
			{
				value10 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getResponsibleHCP().getBoId());
			}
		}
		domainObject.setResponsibleHCP(value10);

		return domainObject;
	}

}
