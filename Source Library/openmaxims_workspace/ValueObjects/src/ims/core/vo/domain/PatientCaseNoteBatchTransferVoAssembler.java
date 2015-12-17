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
 * @author Bogdan Tofei
 */
public class PatientCaseNoteBatchTransferVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PatientCaseNoteBatchTransferVo copy(ims.core.vo.PatientCaseNoteBatchTransferVo valueObjectDest, ims.core.vo.PatientCaseNoteBatchTransferVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientCaseNote(valueObjectSrc.getID_PatientCaseNote());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// Type
		valueObjectDest.setType(valueObjectSrc.getType());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// TrackingID
		valueObjectDest.setTrackingID(valueObjectSrc.getTrackingID());
		// CurrentLocation
		valueObjectDest.setCurrentLocation(valueObjectSrc.getCurrentLocation());
		// Folder
		valueObjectDest.setFolder(valueObjectSrc.getFolder());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientCaseNoteBatchTransferVoCollectionFromPatientCaseNote(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientCaseNote objects.
	 */
	public static ims.core.vo.PatientCaseNoteBatchTransferVoCollection createPatientCaseNoteBatchTransferVoCollectionFromPatientCaseNote(java.util.Set domainObjectSet)	
	{
		return createPatientCaseNoteBatchTransferVoCollectionFromPatientCaseNote(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientCaseNote objects.
	 */
	public static ims.core.vo.PatientCaseNoteBatchTransferVoCollection createPatientCaseNoteBatchTransferVoCollectionFromPatientCaseNote(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatientCaseNoteBatchTransferVoCollection voList = new ims.core.vo.PatientCaseNoteBatchTransferVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.PatientCaseNote domainObject = (ims.core.clinical.domain.objects.PatientCaseNote) iterator.next();
			ims.core.vo.PatientCaseNoteBatchTransferVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientCaseNote objects.
	 */
	public static ims.core.vo.PatientCaseNoteBatchTransferVoCollection createPatientCaseNoteBatchTransferVoCollectionFromPatientCaseNote(java.util.List domainObjectList) 
	{
		return createPatientCaseNoteBatchTransferVoCollectionFromPatientCaseNote(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientCaseNote objects.
	 */
	public static ims.core.vo.PatientCaseNoteBatchTransferVoCollection createPatientCaseNoteBatchTransferVoCollectionFromPatientCaseNote(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatientCaseNoteBatchTransferVoCollection voList = new ims.core.vo.PatientCaseNoteBatchTransferVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.PatientCaseNote domainObject = (ims.core.clinical.domain.objects.PatientCaseNote) domainObjectList.get(i);
			ims.core.vo.PatientCaseNoteBatchTransferVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.PatientCaseNote set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientCaseNoteSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteBatchTransferVoCollection voCollection) 
	 {
	 	return extractPatientCaseNoteSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientCaseNoteSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteBatchTransferVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientCaseNoteBatchTransferVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientCaseNote domainObject = PatientCaseNoteBatchTransferVoAssembler.extractPatientCaseNote(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.PatientCaseNote list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientCaseNoteList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteBatchTransferVoCollection voCollection) 
	 {
	 	return extractPatientCaseNoteList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientCaseNoteList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteBatchTransferVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientCaseNoteBatchTransferVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientCaseNote domainObject = PatientCaseNoteBatchTransferVoAssembler.extractPatientCaseNote(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.PatientCaseNote object.
	 * @param domainObject ims.core.clinical.domain.objects.PatientCaseNote
	 */
	 public static ims.core.vo.PatientCaseNoteBatchTransferVo create(ims.core.clinical.domain.objects.PatientCaseNote domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.PatientCaseNote object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PatientCaseNoteBatchTransferVo create(DomainObjectMap map, ims.core.clinical.domain.objects.PatientCaseNote domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PatientCaseNoteBatchTransferVo valueObject = (ims.core.vo.PatientCaseNoteBatchTransferVo) map.getValueObject(domainObject, ims.core.vo.PatientCaseNoteBatchTransferVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PatientCaseNoteBatchTransferVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.PatientCaseNote
	 */
	 public static ims.core.vo.PatientCaseNoteBatchTransferVo insert(ims.core.vo.PatientCaseNoteBatchTransferVo valueObject, ims.core.clinical.domain.objects.PatientCaseNote domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.PatientCaseNote
	 */
	 public static ims.core.vo.PatientCaseNoteBatchTransferVo insert(DomainObjectMap map, ims.core.vo.PatientCaseNoteBatchTransferVo valueObject, ims.core.clinical.domain.objects.PatientCaseNote domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientCaseNote(domainObject.getId());
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
		valueObject.setPatient(ims.core.vo.domain.PatientLite_IdentifiersVoAssembler.create(map, domainObject.getPatient()) );
		// Type
		ims.domain.lookups.LookupInstance instance2 = domainObject.getType();
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

			ims.core.vo.lookups.CaseNoteType voLookup2 = new ims.core.vo.lookups.CaseNoteType(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.CaseNoteType parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.CaseNoteType(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setType(voLookup2);
		}
				// Status
		ims.domain.lookups.LookupInstance instance3 = domainObject.getStatus();
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

			ims.core.vo.lookups.CaseNoteStatus voLookup3 = new ims.core.vo.lookups.CaseNoteStatus(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.CaseNoteStatus parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.CaseNoteStatus(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setStatus(voLookup3);
		}
				// TrackingID
		valueObject.setTrackingID(domainObject.getTrackingID());
		// CurrentLocation
		valueObject.setCurrentLocation(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getCurrentLocation()) );
		// Folder
		ims.domain.lookups.LookupInstance instance6 = domainObject.getFolder();
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

			ims.core.vo.lookups.FolderCaseNote voLookup6 = new ims.core.vo.lookups.FolderCaseNote(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.FolderCaseNote parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.FolderCaseNote(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setFolder(voLookup6);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.PatientCaseNote extractPatientCaseNote(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteBatchTransferVo valueObject) 
	{
		return 	extractPatientCaseNote(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.PatientCaseNote extractPatientCaseNote(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteBatchTransferVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientCaseNote();
		ims.core.clinical.domain.objects.PatientCaseNote domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.PatientCaseNote)domMap.get(valueObject);
			}
			// ims.core.vo.PatientCaseNoteBatchTransferVo ID_PatientCaseNote field is unknown
			domainObject = new ims.core.clinical.domain.objects.PatientCaseNote();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientCaseNote());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.PatientCaseNote)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.PatientCaseNote) domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientCaseNote.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientCaseNote());

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
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getType() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getType().getID());
		}
		domainObject.setType(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTrackingID() != null && valueObject.getTrackingID().equals(""))
		{
			valueObject.setTrackingID(null);
		}
		domainObject.setTrackingID(valueObject.getTrackingID());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value5 = null;
		if ( null != valueObject.getCurrentLocation() ) 
		{
			if (valueObject.getCurrentLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getCurrentLocation()) != null)
				{
					value5 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getCurrentLocation());
				}
			}
			else
			{
				value5 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getCurrentLocation().getBoId());
			}
		}
		domainObject.setCurrentLocation(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getFolder() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getFolder().getID());
		}
		domainObject.setFolder(value6);

		return domainObject;
	}

}
