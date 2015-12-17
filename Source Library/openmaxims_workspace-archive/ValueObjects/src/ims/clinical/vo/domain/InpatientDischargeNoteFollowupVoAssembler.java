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
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Vasile Purdila
 */
public class InpatientDischargeNoteFollowupVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.InpatientDischargeNoteFollowupVo copy(ims.clinical.vo.InpatientDischargeNoteFollowupVo valueObjectDest, ims.clinical.vo.InpatientDischargeNoteFollowupVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_InpatientDischargeNoteFollowup(valueObjectSrc.getID_InpatientDischargeNoteFollowup());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ClinicalNote
		valueObjectDest.setClinicalNote(valueObjectSrc.getClinicalNote());
		// Outcome
		valueObjectDest.setOutcome(valueObjectSrc.getOutcome());
		// ReviewIn
		valueObjectDest.setReviewIn(valueObjectSrc.getReviewIn());
		// ReviewinUnits
		valueObjectDest.setReviewinUnits(valueObjectSrc.getReviewinUnits());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createInpatientDischargeNoteFollowupVoCollectionFromInpatientDischargeNoteFollowup(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.InpatientDischargeNoteFollowup objects.
	 */
	public static ims.clinical.vo.InpatientDischargeNoteFollowupVoCollection createInpatientDischargeNoteFollowupVoCollectionFromInpatientDischargeNoteFollowup(java.util.Set domainObjectSet)	
	{
		return createInpatientDischargeNoteFollowupVoCollectionFromInpatientDischargeNoteFollowup(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.InpatientDischargeNoteFollowup objects.
	 */
	public static ims.clinical.vo.InpatientDischargeNoteFollowupVoCollection createInpatientDischargeNoteFollowupVoCollectionFromInpatientDischargeNoteFollowup(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.InpatientDischargeNoteFollowupVoCollection voList = new ims.clinical.vo.InpatientDischargeNoteFollowupVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.InpatientDischargeNoteFollowup domainObject = (ims.clinical.domain.objects.InpatientDischargeNoteFollowup) iterator.next();
			ims.clinical.vo.InpatientDischargeNoteFollowupVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.InpatientDischargeNoteFollowup objects.
	 */
	public static ims.clinical.vo.InpatientDischargeNoteFollowupVoCollection createInpatientDischargeNoteFollowupVoCollectionFromInpatientDischargeNoteFollowup(java.util.List domainObjectList) 
	{
		return createInpatientDischargeNoteFollowupVoCollectionFromInpatientDischargeNoteFollowup(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.InpatientDischargeNoteFollowup objects.
	 */
	public static ims.clinical.vo.InpatientDischargeNoteFollowupVoCollection createInpatientDischargeNoteFollowupVoCollectionFromInpatientDischargeNoteFollowup(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.InpatientDischargeNoteFollowupVoCollection voList = new ims.clinical.vo.InpatientDischargeNoteFollowupVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.InpatientDischargeNoteFollowup domainObject = (ims.clinical.domain.objects.InpatientDischargeNoteFollowup) domainObjectList.get(i);
			ims.clinical.vo.InpatientDischargeNoteFollowupVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.InpatientDischargeNoteFollowup set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractInpatientDischargeNoteFollowupSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.InpatientDischargeNoteFollowupVoCollection voCollection) 
	 {
	 	return extractInpatientDischargeNoteFollowupSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractInpatientDischargeNoteFollowupSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.InpatientDischargeNoteFollowupVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.InpatientDischargeNoteFollowupVo vo = voCollection.get(i);
			ims.clinical.domain.objects.InpatientDischargeNoteFollowup domainObject = InpatientDischargeNoteFollowupVoAssembler.extractInpatientDischargeNoteFollowup(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.InpatientDischargeNoteFollowup list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractInpatientDischargeNoteFollowupList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.InpatientDischargeNoteFollowupVoCollection voCollection) 
	 {
	 	return extractInpatientDischargeNoteFollowupList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractInpatientDischargeNoteFollowupList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.InpatientDischargeNoteFollowupVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.InpatientDischargeNoteFollowupVo vo = voCollection.get(i);
			ims.clinical.domain.objects.InpatientDischargeNoteFollowup domainObject = InpatientDischargeNoteFollowupVoAssembler.extractInpatientDischargeNoteFollowup(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.InpatientDischargeNoteFollowup object.
	 * @param domainObject ims.clinical.domain.objects.InpatientDischargeNoteFollowup
	 */
	 public static ims.clinical.vo.InpatientDischargeNoteFollowupVo create(ims.clinical.domain.objects.InpatientDischargeNoteFollowup domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.InpatientDischargeNoteFollowup object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.InpatientDischargeNoteFollowupVo create(DomainObjectMap map, ims.clinical.domain.objects.InpatientDischargeNoteFollowup domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.InpatientDischargeNoteFollowupVo valueObject = (ims.clinical.vo.InpatientDischargeNoteFollowupVo) map.getValueObject(domainObject, ims.clinical.vo.InpatientDischargeNoteFollowupVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.InpatientDischargeNoteFollowupVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.InpatientDischargeNoteFollowup
	 */
	 public static ims.clinical.vo.InpatientDischargeNoteFollowupVo insert(ims.clinical.vo.InpatientDischargeNoteFollowupVo valueObject, ims.clinical.domain.objects.InpatientDischargeNoteFollowup domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.InpatientDischargeNoteFollowup
	 */
	 public static ims.clinical.vo.InpatientDischargeNoteFollowupVo insert(DomainObjectMap map, ims.clinical.vo.InpatientDischargeNoteFollowupVo valueObject, ims.clinical.domain.objects.InpatientDischargeNoteFollowup domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_InpatientDischargeNoteFollowup(domainObject.getId());
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
		valueObject.setClinicalNote(ims.core.vo.domain.ClinicalNotesVoAssembler.create(map, domainObject.getClinicalNote()) );
		// Outcome
		ims.domain.lookups.LookupInstance instance2 = domainObject.getOutcome();
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

			ims.clinical.vo.lookups.InpatientFollowUp voLookup2 = new ims.clinical.vo.lookups.InpatientFollowUp(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.clinical.vo.lookups.InpatientFollowUp parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.clinical.vo.lookups.InpatientFollowUp(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setOutcome(voLookup2);
		}
				// ReviewIn
		valueObject.setReviewIn(domainObject.getReviewIn());
		// ReviewinUnits
		ims.domain.lookups.LookupInstance instance4 = domainObject.getReviewinUnits();
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

			ims.clinical.vo.lookups.ReviewInDuration voLookup4 = new ims.clinical.vo.lookups.ReviewInDuration(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.clinical.vo.lookups.ReviewInDuration parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.clinical.vo.lookups.ReviewInDuration(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setReviewinUnits(voLookup4);
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
	public static ims.clinical.domain.objects.InpatientDischargeNoteFollowup extractInpatientDischargeNoteFollowup(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.InpatientDischargeNoteFollowupVo valueObject) 
	{
		return 	extractInpatientDischargeNoteFollowup(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.InpatientDischargeNoteFollowup extractInpatientDischargeNoteFollowup(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.InpatientDischargeNoteFollowupVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_InpatientDischargeNoteFollowup();
		ims.clinical.domain.objects.InpatientDischargeNoteFollowup domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.InpatientDischargeNoteFollowup)domMap.get(valueObject);
			}
			// ims.clinical.vo.InpatientDischargeNoteFollowupVo ID_InpatientDischargeNoteFollowup field is unknown
			domainObject = new ims.clinical.domain.objects.InpatientDischargeNoteFollowup();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_InpatientDischargeNoteFollowup());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.InpatientDischargeNoteFollowup)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.InpatientDischargeNoteFollowup) domainFactory.getDomainObject(ims.clinical.domain.objects.InpatientDischargeNoteFollowup.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_InpatientDischargeNoteFollowup());

		domainObject.setClinicalNote(ims.core.vo.domain.ClinicalNotesVoAssembler.extractClinicalNotes(domainFactory, valueObject.getClinicalNote(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getOutcome() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getOutcome().getID());
		}
		domainObject.setOutcome(value2);
		domainObject.setReviewIn(valueObject.getReviewIn());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getReviewinUnits() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getReviewinUnits().getID());
		}
		domainObject.setReviewinUnits(value4);
		ims.core.admin.domain.objects.CareContext value5 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value5 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value5 = domainObject.getCareContext();	
			}
			else
			{
				value5 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value5);

		return domainObject;
	}

}
