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
 * @author Cristian Belciug
 */
public class PatientCaseNoteListVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PatientCaseNoteListVo copy(ims.core.vo.PatientCaseNoteListVo valueObjectDest, ims.core.vo.PatientCaseNoteListVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientCaseNote(valueObjectSrc.getID_PatientCaseNote());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// OpenRequests
		valueObjectDest.setOpenRequests(valueObjectSrc.getOpenRequests());
		// Type
		valueObjectDest.setType(valueObjectSrc.getType());
		// CurrentLocation
		valueObjectDest.setCurrentLocation(valueObjectSrc.getCurrentLocation());
		// Folder
		valueObjectDest.setFolder(valueObjectSrc.getFolder());
		// TrackingID
		valueObjectDest.setTrackingID(valueObjectSrc.getTrackingID());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientCaseNoteListVoCollectionFromPatientCaseNote(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientCaseNote objects.
	 */
	public static ims.core.vo.PatientCaseNoteListVoCollection createPatientCaseNoteListVoCollectionFromPatientCaseNote(java.util.Set domainObjectSet)	
	{
		return createPatientCaseNoteListVoCollectionFromPatientCaseNote(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientCaseNote objects.
	 */
	public static ims.core.vo.PatientCaseNoteListVoCollection createPatientCaseNoteListVoCollectionFromPatientCaseNote(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatientCaseNoteListVoCollection voList = new ims.core.vo.PatientCaseNoteListVoCollection();
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
			ims.core.vo.PatientCaseNoteListVo vo = create(map, domainObject);
			
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
	public static ims.core.vo.PatientCaseNoteListVoCollection createPatientCaseNoteListVoCollectionFromPatientCaseNote(java.util.List domainObjectList) 
	{
		return createPatientCaseNoteListVoCollectionFromPatientCaseNote(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientCaseNote objects.
	 */
	public static ims.core.vo.PatientCaseNoteListVoCollection createPatientCaseNoteListVoCollectionFromPatientCaseNote(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatientCaseNoteListVoCollection voList = new ims.core.vo.PatientCaseNoteListVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.PatientCaseNote domainObject = (ims.core.clinical.domain.objects.PatientCaseNote) domainObjectList.get(i);
			ims.core.vo.PatientCaseNoteListVo vo = create(map, domainObject);

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
	 public static java.util.Set extractPatientCaseNoteSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteListVoCollection voCollection) 
	 {
	 	return extractPatientCaseNoteSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientCaseNoteSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteListVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientCaseNoteListVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientCaseNote domainObject = PatientCaseNoteListVoAssembler.extractPatientCaseNote(domainFactory, vo, domMap);

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
	 public static java.util.List extractPatientCaseNoteList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteListVoCollection voCollection) 
	 {
	 	return extractPatientCaseNoteList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientCaseNoteList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteListVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientCaseNoteListVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientCaseNote domainObject = PatientCaseNoteListVoAssembler.extractPatientCaseNote(domainFactory, vo, domMap);

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
	 public static ims.core.vo.PatientCaseNoteListVo create(ims.core.clinical.domain.objects.PatientCaseNote domainObject) 
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
	  public static ims.core.vo.PatientCaseNoteListVo create(DomainObjectMap map, ims.core.clinical.domain.objects.PatientCaseNote domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PatientCaseNoteListVo valueObject = (ims.core.vo.PatientCaseNoteListVo) map.getValueObject(domainObject, ims.core.vo.PatientCaseNoteListVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PatientCaseNoteListVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.core.vo.PatientCaseNoteListVo insert(ims.core.vo.PatientCaseNoteListVo valueObject, ims.core.clinical.domain.objects.PatientCaseNote domainObject) 
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
	 public static ims.core.vo.PatientCaseNoteListVo insert(DomainObjectMap map, ims.core.vo.PatientCaseNoteListVo valueObject, ims.core.clinical.domain.objects.PatientCaseNote domainObject) 
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
		// Status
		ims.domain.lookups.LookupInstance instance2 = domainObject.getStatus();
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

			ims.core.vo.lookups.CaseNoteStatus voLookup2 = new ims.core.vo.lookups.CaseNoteStatus(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.CaseNoteStatus parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.CaseNoteStatus(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setStatus(voLookup2);
		}
				// OpenRequests
		ims.core.clinical.vo.PatientCaseNoteRequestRefVoCollection OpenRequests = new ims.core.clinical.vo.PatientCaseNoteRequestRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getOpenRequests().iterator(); iterator.hasNext(); ) 
		{
			ims.core.clinical.domain.objects.PatientCaseNoteRequest tmp = (ims.core.clinical.domain.objects.PatientCaseNoteRequest)iterator.next();
			if (tmp != null)
				OpenRequests.add(new ims.core.clinical.vo.PatientCaseNoteRequestRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setOpenRequests(OpenRequests);
		// Type
		ims.domain.lookups.LookupInstance instance4 = domainObject.getType();
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

			ims.core.vo.lookups.CaseNoteType voLookup4 = new ims.core.vo.lookups.CaseNoteType(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.CaseNoteType parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.CaseNoteType(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setType(voLookup4);
		}
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
				// TrackingID
		valueObject.setTrackingID(domainObject.getTrackingID());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.PatientCaseNote extractPatientCaseNote(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteListVo valueObject) 
	{
		return 	extractPatientCaseNote(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.PatientCaseNote extractPatientCaseNote(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteListVo valueObject, HashMap domMap) 
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
			// ims.core.vo.PatientCaseNoteListVo ID_PatientCaseNote field is unknown
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
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value2);

		ims.core.clinical.vo.PatientCaseNoteRequestRefVoCollection refCollection3 = valueObject.getOpenRequests();
		int size3 = (null == refCollection3) ? 0 : refCollection3.size();		
		java.util.List domainOpenRequests3 = domainObject.getOpenRequests();
		if (domainOpenRequests3 == null)
		{
			domainOpenRequests3 = new java.util.ArrayList();
		}
		for(int i=0; i < size3; i++) 
		{
			ims.core.clinical.vo.PatientCaseNoteRequestRefVo vo = refCollection3.get(i);			
			ims.core.clinical.domain.objects.PatientCaseNoteRequest dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.clinical.domain.objects.PatientCaseNoteRequest)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.clinical.domain.objects.PatientCaseNoteRequest)domainFactory.getDomainObject( ims.core.clinical.domain.objects.PatientCaseNoteRequest.class, vo.getBoId());
				}
			}

			int domIdx = domainOpenRequests3.indexOf(dom);
			if (domIdx == -1)
			{
				domainOpenRequests3.add(i, dom);
			}
			else if (i != domIdx && i < domainOpenRequests3.size())
			{
				Object tmp = domainOpenRequests3.get(i);
				domainOpenRequests3.set(i, domainOpenRequests3.get(domIdx));
				domainOpenRequests3.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i3 = domainOpenRequests3.size();
		while (i3 > size3)
		{
			domainOpenRequests3.remove(i3-1);
			i3 = domainOpenRequests3.size();
		}
		
		domainObject.setOpenRequests(domainOpenRequests3);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getType() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getType().getID());
		}
		domainObject.setType(value4);
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
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTrackingID() != null && valueObject.getTrackingID().equals(""))
		{
			valueObject.setTrackingID(null);
		}
		domainObject.setTrackingID(valueObject.getTrackingID());

		return domainObject;
	}

}
