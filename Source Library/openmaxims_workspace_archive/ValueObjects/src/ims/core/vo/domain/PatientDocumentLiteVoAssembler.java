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
 * @author Catalin Tomozei
 */
public class PatientDocumentLiteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PatientDocumentLiteVo copy(ims.core.vo.PatientDocumentLiteVo valueObjectDest, ims.core.vo.PatientDocumentLiteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientDocument(valueObjectSrc.getID_PatientDocument());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ServerDocument
		valueObjectDest.setServerDocument(valueObjectSrc.getServerDocument());
		// RecordingUser
		valueObjectDest.setRecordingUser(valueObjectSrc.getRecordingUser());
		// RecordingDateTime
		valueObjectDest.setRecordingDateTime(valueObjectSrc.getRecordingDateTime());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientDocumentLiteVoCollectionFromPatientDocument(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.documents.domain.objects.PatientDocument objects.
	 */
	public static ims.core.vo.PatientDocumentLiteVoCollection createPatientDocumentLiteVoCollectionFromPatientDocument(java.util.Set domainObjectSet)	
	{
		return createPatientDocumentLiteVoCollectionFromPatientDocument(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.documents.domain.objects.PatientDocument objects.
	 */
	public static ims.core.vo.PatientDocumentLiteVoCollection createPatientDocumentLiteVoCollectionFromPatientDocument(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatientDocumentLiteVoCollection voList = new ims.core.vo.PatientDocumentLiteVoCollection();
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
			ims.core.vo.PatientDocumentLiteVo vo = create(map, domainObject);
			
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
	public static ims.core.vo.PatientDocumentLiteVoCollection createPatientDocumentLiteVoCollectionFromPatientDocument(java.util.List domainObjectList) 
	{
		return createPatientDocumentLiteVoCollectionFromPatientDocument(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.documents.domain.objects.PatientDocument objects.
	 */
	public static ims.core.vo.PatientDocumentLiteVoCollection createPatientDocumentLiteVoCollectionFromPatientDocument(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatientDocumentLiteVoCollection voList = new ims.core.vo.PatientDocumentLiteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.documents.domain.objects.PatientDocument domainObject = (ims.core.documents.domain.objects.PatientDocument) domainObjectList.get(i);
			ims.core.vo.PatientDocumentLiteVo vo = create(map, domainObject);

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
	 public static java.util.Set extractPatientDocumentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientDocumentLiteVoCollection voCollection) 
	 {
	 	return extractPatientDocumentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientDocumentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientDocumentLiteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientDocumentLiteVo vo = voCollection.get(i);
			ims.core.documents.domain.objects.PatientDocument domainObject = PatientDocumentLiteVoAssembler.extractPatientDocument(domainFactory, vo, domMap);

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
	 public static java.util.List extractPatientDocumentList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientDocumentLiteVoCollection voCollection) 
	 {
	 	return extractPatientDocumentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientDocumentList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientDocumentLiteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientDocumentLiteVo vo = voCollection.get(i);
			ims.core.documents.domain.objects.PatientDocument domainObject = PatientDocumentLiteVoAssembler.extractPatientDocument(domainFactory, vo, domMap);

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
	 public static ims.core.vo.PatientDocumentLiteVo create(ims.core.documents.domain.objects.PatientDocument domainObject) 
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
	  public static ims.core.vo.PatientDocumentLiteVo create(DomainObjectMap map, ims.core.documents.domain.objects.PatientDocument domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PatientDocumentLiteVo valueObject = (ims.core.vo.PatientDocumentLiteVo) map.getValueObject(domainObject, ims.core.vo.PatientDocumentLiteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PatientDocumentLiteVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.core.vo.PatientDocumentLiteVo insert(ims.core.vo.PatientDocumentLiteVo valueObject, ims.core.documents.domain.objects.PatientDocument domainObject) 
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
	 public static ims.core.vo.PatientDocumentLiteVo insert(DomainObjectMap map, ims.core.vo.PatientDocumentLiteVo valueObject, ims.core.documents.domain.objects.PatientDocument domainObject) 
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
			
		// ServerDocument
		valueObject.setServerDocument(ims.core.vo.domain.ServerDocumentVoAssembler.create(map, domainObject.getServerDocument()) );
		// RecordingUser
		valueObject.setRecordingUser(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getRecordingUser()) );
		// RecordingDateTime
		java.util.Date RecordingDateTime = domainObject.getRecordingDateTime();
		if ( null != RecordingDateTime ) 
		{
			valueObject.setRecordingDateTime(new ims.framework.utils.DateTime(RecordingDateTime) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.documents.domain.objects.PatientDocument extractPatientDocument(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientDocumentLiteVo valueObject) 
	{
		return 	extractPatientDocument(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.documents.domain.objects.PatientDocument extractPatientDocument(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientDocumentLiteVo valueObject, HashMap domMap) 
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
			// ims.core.vo.PatientDocumentLiteVo ID_PatientDocument field is unknown
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
	ims.core.documents.domain.objects.ServerDocument value1 = null;
		if ( null != valueObject.getServerDocument() ) 
		{
			if (valueObject.getServerDocument().getBoId() == null)
			{
				if (domMap.get(valueObject.getServerDocument()) != null)
				{
					value1 = (ims.core.documents.domain.objects.ServerDocument)domMap.get(valueObject.getServerDocument());
				}
			}
			else
			{
				value1 = (ims.core.documents.domain.objects.ServerDocument)domainFactory.getDomainObject(ims.core.documents.domain.objects.ServerDocument.class, valueObject.getServerDocument().getBoId());
			}
		}
		domainObject.setServerDocument(value1);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value2 = null;
		if ( null != valueObject.getRecordingUser() ) 
		{
			if (valueObject.getRecordingUser().getBoId() == null)
			{
				if (domMap.get(valueObject.getRecordingUser()) != null)
				{
					value2 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getRecordingUser());
				}
			}
			else
			{
				value2 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getRecordingUser().getBoId());
			}
		}
		domainObject.setRecordingUser(value2);
		ims.framework.utils.DateTime dateTime3 = valueObject.getRecordingDateTime();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setRecordingDateTime(value3);

		return domainObject;
	}

}
