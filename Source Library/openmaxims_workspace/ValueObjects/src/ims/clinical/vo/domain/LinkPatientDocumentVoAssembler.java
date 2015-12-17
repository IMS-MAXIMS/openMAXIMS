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
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class LinkPatientDocumentVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.LinkPatientDocumentVo copy(ims.clinical.vo.LinkPatientDocumentVo valueObjectDest, ims.clinical.vo.LinkPatientDocumentVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientDocument(valueObjectSrc.getID_PatientDocument());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CreationType
		valueObjectDest.setCreationType(valueObjectSrc.getCreationType());
		// Category
		valueObjectDest.setCategory(valueObjectSrc.getCategory());
		// AuthoringHCP
		valueObjectDest.setAuthoringHCP(valueObjectSrc.getAuthoringHCP());
		// RecordingDateTime
		valueObjectDest.setRecordingDateTime(valueObjectSrc.getRecordingDateTime());
		// Specialty
		valueObjectDest.setSpecialty(valueObjectSrc.getSpecialty());
		// CorrespondenceStatus
		valueObjectDest.setCorrespondenceStatus(valueObjectSrc.getCorrespondenceStatus());
		// CurrentDocumentStatus
		valueObjectDest.setCurrentDocumentStatus(valueObjectSrc.getCurrentDocumentStatus());
		// ServerDocument
		valueObjectDest.setServerDocument(valueObjectSrc.getServerDocument());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createLinkPatientDocumentVoCollectionFromPatientDocument(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.documents.domain.objects.PatientDocument objects.
	 */
	public static ims.clinical.vo.LinkPatientDocumentVoCollection createLinkPatientDocumentVoCollectionFromPatientDocument(java.util.Set domainObjectSet)	
	{
		return createLinkPatientDocumentVoCollectionFromPatientDocument(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.documents.domain.objects.PatientDocument objects.
	 */
	public static ims.clinical.vo.LinkPatientDocumentVoCollection createLinkPatientDocumentVoCollectionFromPatientDocument(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.LinkPatientDocumentVoCollection voList = new ims.clinical.vo.LinkPatientDocumentVoCollection();
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
			ims.clinical.vo.LinkPatientDocumentVo vo = create(map, domainObject);
			
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
	public static ims.clinical.vo.LinkPatientDocumentVoCollection createLinkPatientDocumentVoCollectionFromPatientDocument(java.util.List domainObjectList) 
	{
		return createLinkPatientDocumentVoCollectionFromPatientDocument(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.documents.domain.objects.PatientDocument objects.
	 */
	public static ims.clinical.vo.LinkPatientDocumentVoCollection createLinkPatientDocumentVoCollectionFromPatientDocument(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.LinkPatientDocumentVoCollection voList = new ims.clinical.vo.LinkPatientDocumentVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.documents.domain.objects.PatientDocument domainObject = (ims.core.documents.domain.objects.PatientDocument) domainObjectList.get(i);
			ims.clinical.vo.LinkPatientDocumentVo vo = create(map, domainObject);

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
	 public static java.util.Set extractPatientDocumentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.LinkPatientDocumentVoCollection voCollection) 
	 {
	 	return extractPatientDocumentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientDocumentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.LinkPatientDocumentVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.LinkPatientDocumentVo vo = voCollection.get(i);
			ims.core.documents.domain.objects.PatientDocument domainObject = LinkPatientDocumentVoAssembler.extractPatientDocument(domainFactory, vo, domMap);

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
	 public static java.util.List extractPatientDocumentList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.LinkPatientDocumentVoCollection voCollection) 
	 {
	 	return extractPatientDocumentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientDocumentList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.LinkPatientDocumentVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.LinkPatientDocumentVo vo = voCollection.get(i);
			ims.core.documents.domain.objects.PatientDocument domainObject = LinkPatientDocumentVoAssembler.extractPatientDocument(domainFactory, vo, domMap);

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
	 public static ims.clinical.vo.LinkPatientDocumentVo create(ims.core.documents.domain.objects.PatientDocument domainObject) 
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
	  public static ims.clinical.vo.LinkPatientDocumentVo create(DomainObjectMap map, ims.core.documents.domain.objects.PatientDocument domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.LinkPatientDocumentVo valueObject = (ims.clinical.vo.LinkPatientDocumentVo) map.getValueObject(domainObject, ims.clinical.vo.LinkPatientDocumentVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.LinkPatientDocumentVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.clinical.vo.LinkPatientDocumentVo insert(ims.clinical.vo.LinkPatientDocumentVo valueObject, ims.core.documents.domain.objects.PatientDocument domainObject) 
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
	 public static ims.clinical.vo.LinkPatientDocumentVo insert(DomainObjectMap map, ims.clinical.vo.LinkPatientDocumentVo valueObject, ims.core.documents.domain.objects.PatientDocument domainObject) 
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
			
		// CreationType
		ims.domain.lookups.LookupInstance instance1 = domainObject.getCreationType();
		if ( null != instance1 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance1.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance1.getImage().getImageId(), instance1.getImage().getImagePath());
			}
			color = instance1.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.DocumentCreationType voLookup1 = new ims.core.vo.lookups.DocumentCreationType(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.DocumentCreationType parentVoLookup1 = voLookup1;
			ims.domain.lookups.LookupInstance parent1 = instance1.getParent();
			while (parent1 != null)
			{
				if (parent1.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent1.getImage().getImageId(), parent1.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent1.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup1.setParent(new ims.core.vo.lookups.DocumentCreationType(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setCreationType(voLookup1);
		}
				// Category
		ims.domain.lookups.LookupInstance instance2 = domainObject.getCategory();
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

			ims.core.vo.lookups.DocumentCategory voLookup2 = new ims.core.vo.lookups.DocumentCategory(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.DocumentCategory parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.DocumentCategory(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setCategory(voLookup2);
		}
				// AuthoringHCP
		valueObject.setAuthoringHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getAuthoringHCP()) );
		// RecordingDateTime
		java.util.Date RecordingDateTime = domainObject.getRecordingDateTime();
		if ( null != RecordingDateTime ) 
		{
			valueObject.setRecordingDateTime(new ims.framework.utils.DateTime(RecordingDateTime) );
		}
		// Specialty
		ims.domain.lookups.LookupInstance instance5 = domainObject.getSpecialty();
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

			ims.core.vo.lookups.Specialty voLookup5 = new ims.core.vo.lookups.Specialty(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.Specialty(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setSpecialty(voLookup5);
		}
				// CorrespondenceStatus
		ims.domain.lookups.LookupInstance instance6 = domainObject.getCorrespondenceStatus();
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

			ims.core.vo.lookups.DocumentStatus voLookup6 = new ims.core.vo.lookups.DocumentStatus(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.DocumentStatus parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.DocumentStatus(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setCorrespondenceStatus(voLookup6);
		}
				// CurrentDocumentStatus
		valueObject.setCurrentDocumentStatus(ims.core.vo.domain.PatientDocumentStatusVoAssembler.create(map, domainObject.getCurrentDocumentStatus()) );
		// ServerDocument
		valueObject.setServerDocument(ims.core.vo.domain.ServerDocumentVoAssembler.create(map, domainObject.getServerDocument()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.documents.domain.objects.PatientDocument extractPatientDocument(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.LinkPatientDocumentVo valueObject) 
	{
		return 	extractPatientDocument(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.documents.domain.objects.PatientDocument extractPatientDocument(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.LinkPatientDocumentVo valueObject, HashMap domMap) 
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
			// ims.clinical.vo.LinkPatientDocumentVo ID_PatientDocument field is unknown
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

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getCreationType() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getCreationType().getID());
		}
		domainObject.setCreationType(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getCategory() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getCategory().getID());
		}
		domainObject.setCategory(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value3 = null;
		if ( null != valueObject.getAuthoringHCP() ) 
		{
			if (valueObject.getAuthoringHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getAuthoringHCP()) != null)
				{
					value3 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getAuthoringHCP());
				}
			}
			else
			{
				value3 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getAuthoringHCP().getBoId());
			}
		}
		domainObject.setAuthoringHCP(value3);
		ims.framework.utils.DateTime dateTime4 = valueObject.getRecordingDateTime();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setRecordingDateTime(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getCorrespondenceStatus() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getCorrespondenceStatus().getID());
		}
		domainObject.setCorrespondenceStatus(value6);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.documents.domain.objects.DocumentStatus value7 = null;
		if ( null != valueObject.getCurrentDocumentStatus() ) 
		{
			if (valueObject.getCurrentDocumentStatus().getBoId() == null)
			{
				if (domMap.get(valueObject.getCurrentDocumentStatus()) != null)
				{
					value7 = (ims.core.documents.domain.objects.DocumentStatus)domMap.get(valueObject.getCurrentDocumentStatus());
				}
			}
			else
			{
				value7 = (ims.core.documents.domain.objects.DocumentStatus)domainFactory.getDomainObject(ims.core.documents.domain.objects.DocumentStatus.class, valueObject.getCurrentDocumentStatus().getBoId());
			}
		}
		domainObject.setCurrentDocumentStatus(value7);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.documents.domain.objects.ServerDocument value8 = null;
		if ( null != valueObject.getServerDocument() ) 
		{
			if (valueObject.getServerDocument().getBoId() == null)
			{
				if (domMap.get(valueObject.getServerDocument()) != null)
				{
					value8 = (ims.core.documents.domain.objects.ServerDocument)domMap.get(valueObject.getServerDocument());
				}
			}
			else
			{
				value8 = (ims.core.documents.domain.objects.ServerDocument)domainFactory.getDomainObject(ims.core.documents.domain.objects.ServerDocument.class, valueObject.getServerDocument().getBoId());
			}
		}
		domainObject.setServerDocument(value8);

		return domainObject;
	}

}
