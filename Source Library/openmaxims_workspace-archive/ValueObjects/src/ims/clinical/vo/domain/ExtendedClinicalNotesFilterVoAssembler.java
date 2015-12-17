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
 * Generated on 16/04/2014, 12:31
 *
 */
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class ExtendedClinicalNotesFilterVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.ExtendedClinicalNotesFilterVo copy(ims.clinical.vo.ExtendedClinicalNotesFilterVo valueObjectDest, ims.clinical.vo.ExtendedClinicalNotesFilterVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ClinicalNotes(valueObjectSrc.getID_ClinicalNotes());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ForReview
		valueObjectDest.setForReview(valueObjectSrc.getForReview());
		// ForReviewDiscipline
		valueObjectDest.setForReviewDiscipline(valueObjectSrc.getForReviewDiscipline());
		// NoteClassification
		valueObjectDest.setNoteClassification(valueObjectSrc.getNoteClassification());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createExtendedClinicalNotesFilterVoCollectionFromClinicalNotes(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.ClinicalNotes objects.
	 */
	public static ims.clinical.vo.ExtendedClinicalNotesFilterVoCollection createExtendedClinicalNotesFilterVoCollectionFromClinicalNotes(java.util.Set domainObjectSet)	
	{
		return createExtendedClinicalNotesFilterVoCollectionFromClinicalNotes(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.ClinicalNotes objects.
	 */
	public static ims.clinical.vo.ExtendedClinicalNotesFilterVoCollection createExtendedClinicalNotesFilterVoCollectionFromClinicalNotes(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.ExtendedClinicalNotesFilterVoCollection voList = new ims.clinical.vo.ExtendedClinicalNotesFilterVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.ClinicalNotes domainObject = (ims.core.clinical.domain.objects.ClinicalNotes) iterator.next();
			ims.clinical.vo.ExtendedClinicalNotesFilterVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.ClinicalNotes objects.
	 */
	public static ims.clinical.vo.ExtendedClinicalNotesFilterVoCollection createExtendedClinicalNotesFilterVoCollectionFromClinicalNotes(java.util.List domainObjectList) 
	{
		return createExtendedClinicalNotesFilterVoCollectionFromClinicalNotes(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.ClinicalNotes objects.
	 */
	public static ims.clinical.vo.ExtendedClinicalNotesFilterVoCollection createExtendedClinicalNotesFilterVoCollectionFromClinicalNotes(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.ExtendedClinicalNotesFilterVoCollection voList = new ims.clinical.vo.ExtendedClinicalNotesFilterVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.ClinicalNotes domainObject = (ims.core.clinical.domain.objects.ClinicalNotes) domainObjectList.get(i);
			ims.clinical.vo.ExtendedClinicalNotesFilterVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.ClinicalNotes set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractClinicalNotesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ExtendedClinicalNotesFilterVoCollection voCollection) 
	 {
	 	return extractClinicalNotesSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractClinicalNotesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ExtendedClinicalNotesFilterVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.ExtendedClinicalNotesFilterVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.ClinicalNotes domainObject = ExtendedClinicalNotesFilterVoAssembler.extractClinicalNotes(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.ClinicalNotes list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractClinicalNotesList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ExtendedClinicalNotesFilterVoCollection voCollection) 
	 {
	 	return extractClinicalNotesList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractClinicalNotesList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ExtendedClinicalNotesFilterVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.ExtendedClinicalNotesFilterVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.ClinicalNotes domainObject = ExtendedClinicalNotesFilterVoAssembler.extractClinicalNotes(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.ClinicalNotes object.
	 * @param domainObject ims.core.clinical.domain.objects.ClinicalNotes
	 */
	 public static ims.clinical.vo.ExtendedClinicalNotesFilterVo create(ims.core.clinical.domain.objects.ClinicalNotes domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.ClinicalNotes object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.ExtendedClinicalNotesFilterVo create(DomainObjectMap map, ims.core.clinical.domain.objects.ClinicalNotes domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.ExtendedClinicalNotesFilterVo valueObject = (ims.clinical.vo.ExtendedClinicalNotesFilterVo) map.getValueObject(domainObject, ims.clinical.vo.ExtendedClinicalNotesFilterVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.ExtendedClinicalNotesFilterVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.ClinicalNotes
	 */
	 public static ims.clinical.vo.ExtendedClinicalNotesFilterVo insert(ims.clinical.vo.ExtendedClinicalNotesFilterVo valueObject, ims.core.clinical.domain.objects.ClinicalNotes domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.ClinicalNotes
	 */
	 public static ims.clinical.vo.ExtendedClinicalNotesFilterVo insert(DomainObjectMap map, ims.clinical.vo.ExtendedClinicalNotesFilterVo valueObject, ims.core.clinical.domain.objects.ClinicalNotes domainObject) 
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
			
		// ForReview
		valueObject.setForReview( domainObject.isForReview() );
		// ForReviewDiscipline
		ims.domain.lookups.LookupInstance instance2 = domainObject.getForReviewDiscipline();
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

			ims.core.vo.lookups.HcpDisType voLookup2 = new ims.core.vo.lookups.HcpDisType(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.HcpDisType parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.HcpDisType(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setForReviewDiscipline(voLookup2);
		}
				// NoteClassification
		ims.domain.lookups.LookupInstance instance3 = domainObject.getNoteClassification();
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

			ims.clinical.vo.lookups.ClinicalNoteClassification voLookup3 = new ims.clinical.vo.lookups.ClinicalNoteClassification(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.clinical.vo.lookups.ClinicalNoteClassification parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.clinical.vo.lookups.ClinicalNoteClassification(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setNoteClassification(voLookup3);
		}
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
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.ClinicalNotes extractClinicalNotes(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ExtendedClinicalNotesFilterVo valueObject) 
	{
		return 	extractClinicalNotes(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.ClinicalNotes extractClinicalNotes(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ExtendedClinicalNotesFilterVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ClinicalNotes();
		ims.core.clinical.domain.objects.ClinicalNotes domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.ClinicalNotes)domMap.get(valueObject);
			}
			// ims.clinical.vo.ExtendedClinicalNotesFilterVo ID_ClinicalNotes field is unknown
			domainObject = new ims.core.clinical.domain.objects.ClinicalNotes();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ClinicalNotes());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.ClinicalNotes)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.ClinicalNotes) domainFactory.getDomainObject(ims.core.clinical.domain.objects.ClinicalNotes.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ClinicalNotes());

		domainObject.setForReview(valueObject.getForReview());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getForReviewDiscipline() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getForReviewDiscipline().getID());
		}
		domainObject.setForReviewDiscipline(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getNoteClassification() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getNoteClassification().getID());
		}
		domainObject.setNoteClassification(value3);
		ims.core.admin.domain.objects.CareContext value4 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value4 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getCareContext();	
			}
			else
			{
				value4 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value4);

		return domainObject;
	}

}
