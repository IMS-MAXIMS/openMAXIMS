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
 * @author Daniel Laffan
 */
public class NursingClinicalNotesListVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.nursing.vo.NursingClinicalNotesListVo copy(ims.nursing.vo.NursingClinicalNotesListVo valueObjectDest, ims.nursing.vo.NursingClinicalNotesListVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ClinicalNotes(valueObjectSrc.getID_ClinicalNotes());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ClinicalNote
		valueObjectDest.setClinicalNote(valueObjectSrc.getClinicalNote());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// RecordingDateTime
		valueObjectDest.setRecordingDateTime(valueObjectSrc.getRecordingDateTime());
		// isCorrected
		valueObjectDest.setIsCorrected(valueObjectSrc.getIsCorrected());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createNursingClinicalNotesListVoCollectionFromNursingClinicalNotes(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.nursing.domain.objects.NursingClinicalNotes objects.
	 */
	public static ims.nursing.vo.NursingClinicalNotesListVoCollection createNursingClinicalNotesListVoCollectionFromNursingClinicalNotes(java.util.Set domainObjectSet)	
	{
		return createNursingClinicalNotesListVoCollectionFromNursingClinicalNotes(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.nursing.domain.objects.NursingClinicalNotes objects.
	 */
	public static ims.nursing.vo.NursingClinicalNotesListVoCollection createNursingClinicalNotesListVoCollectionFromNursingClinicalNotes(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.nursing.vo.NursingClinicalNotesListVoCollection voList = new ims.nursing.vo.NursingClinicalNotesListVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.nursing.domain.objects.NursingClinicalNotes domainObject = (ims.nursing.domain.objects.NursingClinicalNotes) iterator.next();
			ims.nursing.vo.NursingClinicalNotesListVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.nursing.domain.objects.NursingClinicalNotes objects.
	 */
	public static ims.nursing.vo.NursingClinicalNotesListVoCollection createNursingClinicalNotesListVoCollectionFromNursingClinicalNotes(java.util.List domainObjectList) 
	{
		return createNursingClinicalNotesListVoCollectionFromNursingClinicalNotes(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.nursing.domain.objects.NursingClinicalNotes objects.
	 */
	public static ims.nursing.vo.NursingClinicalNotesListVoCollection createNursingClinicalNotesListVoCollectionFromNursingClinicalNotes(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.nursing.vo.NursingClinicalNotesListVoCollection voList = new ims.nursing.vo.NursingClinicalNotesListVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.nursing.domain.objects.NursingClinicalNotes domainObject = (ims.nursing.domain.objects.NursingClinicalNotes) domainObjectList.get(i);
			ims.nursing.vo.NursingClinicalNotesListVo vo = create(map, domainObject);

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
	 * Create the ims.nursing.domain.objects.NursingClinicalNotes set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractNursingClinicalNotesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.NursingClinicalNotesListVoCollection voCollection) 
	 {
	 	return extractNursingClinicalNotesSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractNursingClinicalNotesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.NursingClinicalNotesListVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.NursingClinicalNotesListVo vo = voCollection.get(i);
			ims.nursing.domain.objects.NursingClinicalNotes domainObject = NursingClinicalNotesListVoAssembler.extractNursingClinicalNotes(domainFactory, vo, domMap);

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
	 * Create the ims.nursing.domain.objects.NursingClinicalNotes list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractNursingClinicalNotesList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.NursingClinicalNotesListVoCollection voCollection) 
	 {
	 	return extractNursingClinicalNotesList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractNursingClinicalNotesList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.NursingClinicalNotesListVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.NursingClinicalNotesListVo vo = voCollection.get(i);
			ims.nursing.domain.objects.NursingClinicalNotes domainObject = NursingClinicalNotesListVoAssembler.extractNursingClinicalNotes(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.nursing.domain.objects.NursingClinicalNotes object.
	 * @param domainObject ims.nursing.domain.objects.NursingClinicalNotes
	 */
	 public static ims.nursing.vo.NursingClinicalNotesListVo create(ims.nursing.domain.objects.NursingClinicalNotes domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.nursing.domain.objects.NursingClinicalNotes object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.nursing.vo.NursingClinicalNotesListVo create(DomainObjectMap map, ims.nursing.domain.objects.NursingClinicalNotes domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.nursing.vo.NursingClinicalNotesListVo valueObject = (ims.nursing.vo.NursingClinicalNotesListVo) map.getValueObject(domainObject, ims.nursing.vo.NursingClinicalNotesListVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.nursing.vo.NursingClinicalNotesListVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.nursing.domain.objects.NursingClinicalNotes
	 */
	 public static ims.nursing.vo.NursingClinicalNotesListVo insert(ims.nursing.vo.NursingClinicalNotesListVo valueObject, ims.nursing.domain.objects.NursingClinicalNotes domainObject) 
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
	 * @param domainObject ims.nursing.domain.objects.NursingClinicalNotes
	 */
	 public static ims.nursing.vo.NursingClinicalNotesListVo insert(DomainObjectMap map, ims.nursing.vo.NursingClinicalNotesListVo valueObject, ims.nursing.domain.objects.NursingClinicalNotes domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ClinicalNotes(domainObject.getId());
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
			
		// ClinicalNote
		valueObject.setClinicalNote(domainObject.getClinicalNote());
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// CurrentStatus
		valueObject.setCurrentStatus(ims.core.vo.domain.ClinicalNoteStatusLiteVoAssembler.create(map, domainObject.getCurrentStatus()) );
		// RecordingDateTime
		java.util.Date RecordingDateTime = domainObject.getRecordingDateTime();
		if ( null != RecordingDateTime ) 
		{
			valueObject.setRecordingDateTime(new ims.framework.utils.DateTime(RecordingDateTime) );
		}
		// isCorrected
		valueObject.setIsCorrected( domainObject.isIsCorrected() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.nursing.domain.objects.NursingClinicalNotes extractNursingClinicalNotes(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.NursingClinicalNotesListVo valueObject) 
	{
		return 	extractNursingClinicalNotes(domainFactory, valueObject, new HashMap());
	}

	public static ims.nursing.domain.objects.NursingClinicalNotes extractNursingClinicalNotes(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.NursingClinicalNotesListVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ClinicalNotes();
		ims.nursing.domain.objects.NursingClinicalNotes domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.nursing.domain.objects.NursingClinicalNotes)domMap.get(valueObject);
			}
			// ims.nursing.vo.NursingClinicalNotesListVo ID_NursingClinicalNotes field is unknown
			domainObject = new ims.nursing.domain.objects.NursingClinicalNotes();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ClinicalNotes());
			if (domMap.get(key) != null)
			{
				return (ims.nursing.domain.objects.NursingClinicalNotes)domMap.get(key);
			}
			domainObject = (ims.nursing.domain.objects.NursingClinicalNotes) domainFactory.getDomainObject(ims.nursing.domain.objects.NursingClinicalNotes.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ClinicalNotes());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getClinicalNote() != null && valueObject.getClinicalNote().equals(""))
		{
			valueObject.setClinicalNote(null);
		}
		domainObject.setClinicalNote(valueObject.getClinicalNote());
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		domainObject.setCurrentStatus(ims.core.vo.domain.ClinicalNoteStatusLiteVoAssembler.extractClinicalNoteNoteStatus(domainFactory, valueObject.getCurrentStatus(), domMap));
		ims.framework.utils.DateTime dateTime4 = valueObject.getRecordingDateTime();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setRecordingDateTime(value4);
		domainObject.setIsCorrected(valueObject.getIsCorrected());

		return domainObject;
	}

}
