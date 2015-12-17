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
 * @author Billy Mahon
 */
public class GoalPlanningVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.GoalPlanningVo copy(ims.clinical.vo.GoalPlanningVo valueObjectDest, ims.clinical.vo.GoalPlanningVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_GoalPlanning(valueObjectSrc.getID_GoalPlanning());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// GoalPlanningDate
		valueObjectDest.setGoalPlanningDate(valueObjectSrc.getGoalPlanningDate());
		// PredicatedDischargeDate
		valueObjectDest.setPredicatedDischargeDate(valueObjectSrc.getPredicatedDischargeDate());
		// GoalPlanningOutcome
		valueObjectDest.setGoalPlanningOutcome(valueObjectSrc.getGoalPlanningOutcome());
		// PrimeCancelReason
		valueObjectDest.setPrimeCancelReason(valueObjectSrc.getPrimeCancelReason());
		// PredictedNextGoalPlanning
		valueObjectDest.setPredictedNextGoalPlanning(valueObjectSrc.getPredictedNextGoalPlanning());
		// DischargeDelayValue
		valueObjectDest.setDischargeDelayValue(valueObjectSrc.getDischargeDelayValue());
		// DischargeDelayUnit
		valueObjectDest.setDischargeDelayUnit(valueObjectSrc.getDischargeDelayUnit());
		// isGoalPlanningConf
		valueObjectDest.setIsGoalPlanningConf(valueObjectSrc.getIsGoalPlanningConf());
		// Minutes
		valueObjectDest.setMinutes(valueObjectSrc.getMinutes());
		// Comments
		valueObjectDest.setComments(valueObjectSrc.getComments());
		// Invitees
		valueObjectDest.setInvitees(valueObjectSrc.getInvitees());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createGoalPlanningVoCollectionFromGoalPlanning(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.GoalPlanning objects.
	 */
	public static ims.clinical.vo.GoalPlanningVoCollection createGoalPlanningVoCollectionFromGoalPlanning(java.util.Set domainObjectSet)	
	{
		return createGoalPlanningVoCollectionFromGoalPlanning(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.GoalPlanning objects.
	 */
	public static ims.clinical.vo.GoalPlanningVoCollection createGoalPlanningVoCollectionFromGoalPlanning(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.GoalPlanningVoCollection voList = new ims.clinical.vo.GoalPlanningVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.GoalPlanning domainObject = (ims.clinical.domain.objects.GoalPlanning) iterator.next();
			ims.clinical.vo.GoalPlanningVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.GoalPlanning objects.
	 */
	public static ims.clinical.vo.GoalPlanningVoCollection createGoalPlanningVoCollectionFromGoalPlanning(java.util.List domainObjectList) 
	{
		return createGoalPlanningVoCollectionFromGoalPlanning(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.GoalPlanning objects.
	 */
	public static ims.clinical.vo.GoalPlanningVoCollection createGoalPlanningVoCollectionFromGoalPlanning(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.GoalPlanningVoCollection voList = new ims.clinical.vo.GoalPlanningVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.GoalPlanning domainObject = (ims.clinical.domain.objects.GoalPlanning) domainObjectList.get(i);
			ims.clinical.vo.GoalPlanningVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.GoalPlanning set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractGoalPlanningSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.GoalPlanningVoCollection voCollection) 
	 {
	 	return extractGoalPlanningSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractGoalPlanningSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.GoalPlanningVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.GoalPlanningVo vo = voCollection.get(i);
			ims.clinical.domain.objects.GoalPlanning domainObject = GoalPlanningVoAssembler.extractGoalPlanning(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.GoalPlanning list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractGoalPlanningList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.GoalPlanningVoCollection voCollection) 
	 {
	 	return extractGoalPlanningList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractGoalPlanningList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.GoalPlanningVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.GoalPlanningVo vo = voCollection.get(i);
			ims.clinical.domain.objects.GoalPlanning domainObject = GoalPlanningVoAssembler.extractGoalPlanning(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.GoalPlanning object.
	 * @param domainObject ims.clinical.domain.objects.GoalPlanning
	 */
	 public static ims.clinical.vo.GoalPlanningVo create(ims.clinical.domain.objects.GoalPlanning domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.GoalPlanning object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.GoalPlanningVo create(DomainObjectMap map, ims.clinical.domain.objects.GoalPlanning domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.GoalPlanningVo valueObject = (ims.clinical.vo.GoalPlanningVo) map.getValueObject(domainObject, ims.clinical.vo.GoalPlanningVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.GoalPlanningVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.GoalPlanning
	 */
	 public static ims.clinical.vo.GoalPlanningVo insert(ims.clinical.vo.GoalPlanningVo valueObject, ims.clinical.domain.objects.GoalPlanning domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.GoalPlanning
	 */
	 public static ims.clinical.vo.GoalPlanningVo insert(DomainObjectMap map, ims.clinical.vo.GoalPlanningVo valueObject, ims.clinical.domain.objects.GoalPlanning domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_GoalPlanning(domainObject.getId());
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
			
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// ClinicalContact
		valueObject.setClinicalContact(ims.core.vo.domain.ClinicalContactShortVoAssembler.create(map, domainObject.getClinicalContact()) );
		// CareContext
		valueObject.setCareContext(ims.core.vo.domain.CareContextShortVoAssembler.create(map, domainObject.getCareContext()) );
		// GoalPlanningDate
		java.util.Date GoalPlanningDate = domainObject.getGoalPlanningDate();
		if ( null != GoalPlanningDate ) 
		{
			valueObject.setGoalPlanningDate(new ims.framework.utils.Date(GoalPlanningDate) );
		}
		// PredicatedDischargeDate
		Integer PredicatedDischargeDate = domainObject.getPredicatedDischargeDate();
		if ( null != PredicatedDischargeDate ) 
		{
			valueObject.setPredicatedDischargeDate(new ims.framework.utils.PartialDate(PredicatedDischargeDate) );
		}
		// GoalPlanningOutcome
		ims.domain.lookups.LookupInstance instance6 = domainObject.getGoalPlanningOutcome();
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

			ims.clinical.vo.lookups.GoalPlanningOutcome voLookup6 = new ims.clinical.vo.lookups.GoalPlanningOutcome(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.clinical.vo.lookups.GoalPlanningOutcome parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.clinical.vo.lookups.GoalPlanningOutcome(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setGoalPlanningOutcome(voLookup6);
		}
				// PrimeCancelReason
		ims.domain.lookups.LookupInstance instance7 = domainObject.getPrimeCancelReason();
		if ( null != instance7 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance7.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance7.getImage().getImageId(), instance7.getImage().getImagePath());
			}
			color = instance7.getColor();
			if (color != null) 
				color.getValue();

			ims.clinical.vo.lookups.GoalPlanningCancellationReason voLookup7 = new ims.clinical.vo.lookups.GoalPlanningCancellationReason(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.clinical.vo.lookups.GoalPlanningCancellationReason parentVoLookup7 = voLookup7;
			ims.domain.lookups.LookupInstance parent7 = instance7.getParent();
			while (parent7 != null)
			{
				if (parent7.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent7.getImage().getImageId(), parent7.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent7.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup7.setParent(new ims.clinical.vo.lookups.GoalPlanningCancellationReason(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setPrimeCancelReason(voLookup7);
		}
				// PredictedNextGoalPlanning
		Integer PredictedNextGoalPlanning = domainObject.getPredictedNextGoalPlanning();
		if ( null != PredictedNextGoalPlanning ) 
		{
			valueObject.setPredictedNextGoalPlanning(new ims.framework.utils.PartialDate(PredictedNextGoalPlanning) );
		}
		// DischargeDelayValue
		valueObject.setDischargeDelayValue(domainObject.getDischargeDelayValue());
		// DischargeDelayUnit
		ims.domain.lookups.LookupInstance instance10 = domainObject.getDischargeDelayUnit();
		if ( null != instance10 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance10.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance10.getImage().getImageId(), instance10.getImage().getImagePath());
			}
			color = instance10.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.TimeDaystoYears voLookup10 = new ims.core.vo.lookups.TimeDaystoYears(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.TimeDaystoYears parentVoLookup10 = voLookup10;
			ims.domain.lookups.LookupInstance parent10 = instance10.getParent();
			while (parent10 != null)
			{
				if (parent10.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent10.getImage().getImageId(), parent10.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent10.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup10.setParent(new ims.core.vo.lookups.TimeDaystoYears(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setDischargeDelayUnit(voLookup10);
		}
				// isGoalPlanningConf
		valueObject.setIsGoalPlanningConf( domainObject.isIsGoalPlanningConf() );
		// Minutes
		valueObject.setMinutes(domainObject.getMinutes());
		// Comments
		valueObject.setComments(domainObject.getComments());
		// Invitees
		valueObject.setInvitees(ims.clinical.vo.domain.GoalPlanningMeetingAttendeeVoAssembler.createGoalPlanningMeetingAttendeeVoCollectionFromGoalPlanningMeetingAttendee(map, domainObject.getInvitees()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.GoalPlanning extractGoalPlanning(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.GoalPlanningVo valueObject) 
	{
		return 	extractGoalPlanning(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.GoalPlanning extractGoalPlanning(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.GoalPlanningVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_GoalPlanning();
		ims.clinical.domain.objects.GoalPlanning domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.GoalPlanning)domMap.get(valueObject);
			}
			// ims.clinical.vo.GoalPlanningVo ID_GoalPlanning field is unknown
			domainObject = new ims.clinical.domain.objects.GoalPlanning();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_GoalPlanning());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.GoalPlanning)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.GoalPlanning) domainFactory.getDomainObject(ims.clinical.domain.objects.GoalPlanning.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_GoalPlanning());

		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		domainObject.setClinicalContact(ims.core.vo.domain.ClinicalContactShortVoAssembler.extractClinicalContact(domainFactory, valueObject.getClinicalContact(), domMap));
		domainObject.setCareContext(ims.core.vo.domain.CareContextShortVoAssembler.extractCareContext(domainFactory, valueObject.getCareContext(), domMap));
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getGoalPlanningDate();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setGoalPlanningDate(value4);
		ims.framework.utils.PartialDate PredicatedDischargeDate = valueObject.getPredicatedDischargeDate();
		Integer value5 = null;
		if ( null != PredicatedDischargeDate ) 
		{
			value5 = PredicatedDischargeDate.toInteger();
		}
		domainObject.setPredicatedDischargeDate(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getGoalPlanningOutcome() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getGoalPlanningOutcome().getID());
		}
		domainObject.setGoalPlanningOutcome(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getPrimeCancelReason() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getPrimeCancelReason().getID());
		}
		domainObject.setPrimeCancelReason(value7);
		ims.framework.utils.PartialDate PredictedNextGoalPlanning = valueObject.getPredictedNextGoalPlanning();
		Integer value8 = null;
		if ( null != PredictedNextGoalPlanning ) 
		{
			value8 = PredictedNextGoalPlanning.toInteger();
		}
		domainObject.setPredictedNextGoalPlanning(value8);
		domainObject.setDischargeDelayValue(valueObject.getDischargeDelayValue());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getDischargeDelayUnit() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getDischargeDelayUnit().getID());
		}
		domainObject.setDischargeDelayUnit(value10);
		domainObject.setIsGoalPlanningConf(valueObject.getIsGoalPlanningConf());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getMinutes() != null && valueObject.getMinutes().equals(""))
		{
			valueObject.setMinutes(null);
		}
		domainObject.setMinutes(valueObject.getMinutes());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComments() != null && valueObject.getComments().equals(""))
		{
			valueObject.setComments(null);
		}
		domainObject.setComments(valueObject.getComments());
		domainObject.setInvitees(ims.clinical.vo.domain.GoalPlanningMeetingAttendeeVoAssembler.extractGoalPlanningMeetingAttendeeSet(domainFactory, valueObject.getInvitees(), domainObject.getInvitees(), domMap));		

		return domainObject;
	}

}
