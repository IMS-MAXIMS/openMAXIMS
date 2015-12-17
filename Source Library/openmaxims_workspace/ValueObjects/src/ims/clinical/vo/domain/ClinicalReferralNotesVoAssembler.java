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
 * @author Bogdan Tofei
 */
public class ClinicalReferralNotesVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.ClinicalReferralNotesVo copy(ims.clinical.vo.ClinicalReferralNotesVo valueObjectDest, ims.clinical.vo.ClinicalReferralNotesVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ClinicalReferralNotes(valueObjectSrc.getID_ClinicalReferralNotes());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// RecordingInfo
		valueObjectDest.setRecordingInfo(valueObjectSrc.getRecordingInfo());
		// Note
		valueObjectDest.setNote(valueObjectSrc.getNote());
		// NoteType
		valueObjectDest.setNoteType(valueObjectSrc.getNoteType());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createClinicalReferralNotesVoCollectionFromClinicalReferralNotes(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.ClinicalReferralNotes objects.
	 */
	public static ims.clinical.vo.ClinicalReferralNotesVoCollection createClinicalReferralNotesVoCollectionFromClinicalReferralNotes(java.util.Set domainObjectSet)	
	{
		return createClinicalReferralNotesVoCollectionFromClinicalReferralNotes(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.ClinicalReferralNotes objects.
	 */
	public static ims.clinical.vo.ClinicalReferralNotesVoCollection createClinicalReferralNotesVoCollectionFromClinicalReferralNotes(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.ClinicalReferralNotesVoCollection voList = new ims.clinical.vo.ClinicalReferralNotesVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.ClinicalReferralNotes domainObject = (ims.clinical.domain.objects.ClinicalReferralNotes) iterator.next();
			ims.clinical.vo.ClinicalReferralNotesVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.ClinicalReferralNotes objects.
	 */
	public static ims.clinical.vo.ClinicalReferralNotesVoCollection createClinicalReferralNotesVoCollectionFromClinicalReferralNotes(java.util.List domainObjectList) 
	{
		return createClinicalReferralNotesVoCollectionFromClinicalReferralNotes(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.ClinicalReferralNotes objects.
	 */
	public static ims.clinical.vo.ClinicalReferralNotesVoCollection createClinicalReferralNotesVoCollectionFromClinicalReferralNotes(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.ClinicalReferralNotesVoCollection voList = new ims.clinical.vo.ClinicalReferralNotesVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.ClinicalReferralNotes domainObject = (ims.clinical.domain.objects.ClinicalReferralNotes) domainObjectList.get(i);
			ims.clinical.vo.ClinicalReferralNotesVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.ClinicalReferralNotes set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractClinicalReferralNotesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ClinicalReferralNotesVoCollection voCollection) 
	 {
	 	return extractClinicalReferralNotesSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractClinicalReferralNotesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ClinicalReferralNotesVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.ClinicalReferralNotesVo vo = voCollection.get(i);
			ims.clinical.domain.objects.ClinicalReferralNotes domainObject = ClinicalReferralNotesVoAssembler.extractClinicalReferralNotes(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.ClinicalReferralNotes list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractClinicalReferralNotesList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ClinicalReferralNotesVoCollection voCollection) 
	 {
	 	return extractClinicalReferralNotesList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractClinicalReferralNotesList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ClinicalReferralNotesVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.ClinicalReferralNotesVo vo = voCollection.get(i);
			ims.clinical.domain.objects.ClinicalReferralNotes domainObject = ClinicalReferralNotesVoAssembler.extractClinicalReferralNotes(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.ClinicalReferralNotes object.
	 * @param domainObject ims.clinical.domain.objects.ClinicalReferralNotes
	 */
	 public static ims.clinical.vo.ClinicalReferralNotesVo create(ims.clinical.domain.objects.ClinicalReferralNotes domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.ClinicalReferralNotes object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.ClinicalReferralNotesVo create(DomainObjectMap map, ims.clinical.domain.objects.ClinicalReferralNotes domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.ClinicalReferralNotesVo valueObject = (ims.clinical.vo.ClinicalReferralNotesVo) map.getValueObject(domainObject, ims.clinical.vo.ClinicalReferralNotesVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.ClinicalReferralNotesVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.ClinicalReferralNotes
	 */
	 public static ims.clinical.vo.ClinicalReferralNotesVo insert(ims.clinical.vo.ClinicalReferralNotesVo valueObject, ims.clinical.domain.objects.ClinicalReferralNotes domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.ClinicalReferralNotes
	 */
	 public static ims.clinical.vo.ClinicalReferralNotesVo insert(DomainObjectMap map, ims.clinical.vo.ClinicalReferralNotesVo valueObject, ims.clinical.domain.objects.ClinicalReferralNotes domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ClinicalReferralNotes(domainObject.getId());
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
			
		// RecordingInfo
		valueObject.setRecordingInfo(ims.core.vo.domain.RecordingUserInformationVoAssembler.create(map, domainObject.getRecordingInfo()) );
		// Note
		valueObject.setNote(domainObject.getNote());
		// NoteType
		ims.domain.lookups.LookupInstance instance3 = domainObject.getNoteType();
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

			ims.clinical.vo.lookups.ClinicalReferralNoteType voLookup3 = new ims.clinical.vo.lookups.ClinicalReferralNoteType(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.clinical.vo.lookups.ClinicalReferralNoteType parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.clinical.vo.lookups.ClinicalReferralNoteType(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setNoteType(voLookup3);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.ClinicalReferralNotes extractClinicalReferralNotes(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ClinicalReferralNotesVo valueObject) 
	{
		return 	extractClinicalReferralNotes(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.ClinicalReferralNotes extractClinicalReferralNotes(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ClinicalReferralNotesVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ClinicalReferralNotes();
		ims.clinical.domain.objects.ClinicalReferralNotes domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.ClinicalReferralNotes)domMap.get(valueObject);
			}
			// ims.clinical.vo.ClinicalReferralNotesVo ID_ClinicalReferralNotes field is unknown
			domainObject = new ims.clinical.domain.objects.ClinicalReferralNotes();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ClinicalReferralNotes());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.ClinicalReferralNotes)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.ClinicalReferralNotes) domainFactory.getDomainObject(ims.clinical.domain.objects.ClinicalReferralNotes.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ClinicalReferralNotes());

		domainObject.setRecordingInfo(ims.core.vo.domain.RecordingUserInformationVoAssembler.extractRecordingUserInformation(domainFactory, valueObject.getRecordingInfo(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNote() != null && valueObject.getNote().equals(""))
		{
			valueObject.setNote(null);
		}
		domainObject.setNote(valueObject.getNote());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getNoteType() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getNoteType().getID());
		}
		domainObject.setNoteType(value3);

		return domainObject;
	}

}
