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
 * @author George Cristian Josan
 */
public class InpatientEpisodeShortVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.InpatientEpisodeShortVo copy(ims.core.vo.InpatientEpisodeShortVo valueObjectDest, ims.core.vo.InpatientEpisodeShortVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_InpatientEpisode(valueObjectSrc.getID_InpatientEpisode());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// pasEvent
		valueObjectDest.setPasEvent(valueObjectSrc.getPasEvent());
		// AdmissionDateTime
		valueObjectDest.setAdmissionDateTime(valueObjectSrc.getAdmissionDateTime());
		// EstDischargeDate
		valueObjectDest.setEstDischargeDate(valueObjectSrc.getEstDischargeDate());
		// DischargeReadyDate
		valueObjectDest.setDischargeReadyDate(valueObjectSrc.getDischargeReadyDate());
		// isConfirmedDischarge
		valueObjectDest.setIsConfirmedDischarge(valueObjectSrc.getIsConfirmedDischarge());
		// ConfirmedDischargeDateTime
		valueObjectDest.setConfirmedDischargeDateTime(valueObjectSrc.getConfirmedDischargeDateTime());
		// isMaternityInpatient
		valueObjectDest.setIsMaternityInpatient(valueObjectSrc.getIsMaternityInpatient());
		// isOnHomeLeave
		valueObjectDest.setIsOnHomeLeave(valueObjectSrc.getIsOnHomeLeave());
		// DateOnHomeLeave
		valueObjectDest.setDateOnHomeLeave(valueObjectSrc.getDateOnHomeLeave());
		// TimeOnHomeLeave
		valueObjectDest.setTimeOnHomeLeave(valueObjectSrc.getTimeOnHomeLeave());
		// ExpectedDateOfReturn
		valueObjectDest.setExpectedDateOfReturn(valueObjectSrc.getExpectedDateOfReturn());
		// ExpectedTimeOfReturn
		valueObjectDest.setExpectedTimeOfReturn(valueObjectSrc.getExpectedTimeOfReturn());
		// VTEAssessmentStatus
		valueObjectDest.setVTEAssessmentStatus(valueObjectSrc.getVTEAssessmentStatus());
		// VTEAssessmentStatusReason
		valueObjectDest.setVTEAssessmentStatusReason(valueObjectSrc.getVTEAssessmentStatusReason());
		// LatestSECSScore
		valueObjectDest.setLatestSECSScore(valueObjectSrc.getLatestSECSScore());
		// CurrentTrackingMovement
		valueObjectDest.setCurrentTrackingMovement(valueObjectSrc.getCurrentTrackingMovement());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createInpatientEpisodeShortVoCollectionFromInpatientEpisode(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.InpatientEpisode objects.
	 */
	public static ims.core.vo.InpatientEpisodeShortVoCollection createInpatientEpisodeShortVoCollectionFromInpatientEpisode(java.util.Set domainObjectSet)	
	{
		return createInpatientEpisodeShortVoCollectionFromInpatientEpisode(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.InpatientEpisode objects.
	 */
	public static ims.core.vo.InpatientEpisodeShortVoCollection createInpatientEpisodeShortVoCollectionFromInpatientEpisode(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.InpatientEpisodeShortVoCollection voList = new ims.core.vo.InpatientEpisodeShortVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.pas.domain.objects.InpatientEpisode domainObject = (ims.core.admin.pas.domain.objects.InpatientEpisode) iterator.next();
			ims.core.vo.InpatientEpisodeShortVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.InpatientEpisode objects.
	 */
	public static ims.core.vo.InpatientEpisodeShortVoCollection createInpatientEpisodeShortVoCollectionFromInpatientEpisode(java.util.List domainObjectList) 
	{
		return createInpatientEpisodeShortVoCollectionFromInpatientEpisode(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.InpatientEpisode objects.
	 */
	public static ims.core.vo.InpatientEpisodeShortVoCollection createInpatientEpisodeShortVoCollectionFromInpatientEpisode(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.InpatientEpisodeShortVoCollection voList = new ims.core.vo.InpatientEpisodeShortVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.InpatientEpisode domainObject = (ims.core.admin.pas.domain.objects.InpatientEpisode) domainObjectList.get(i);
			ims.core.vo.InpatientEpisodeShortVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.pas.domain.objects.InpatientEpisode set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractInpatientEpisodeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.InpatientEpisodeShortVoCollection voCollection) 
	 {
	 	return extractInpatientEpisodeSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractInpatientEpisodeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.InpatientEpisodeShortVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.InpatientEpisodeShortVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.InpatientEpisode domainObject = InpatientEpisodeShortVoAssembler.extractInpatientEpisode(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.pas.domain.objects.InpatientEpisode list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractInpatientEpisodeList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.InpatientEpisodeShortVoCollection voCollection) 
	 {
	 	return extractInpatientEpisodeList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractInpatientEpisodeList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.InpatientEpisodeShortVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.InpatientEpisodeShortVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.InpatientEpisode domainObject = InpatientEpisodeShortVoAssembler.extractInpatientEpisode(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.pas.domain.objects.InpatientEpisode object.
	 * @param domainObject ims.core.admin.pas.domain.objects.InpatientEpisode
	 */
	 public static ims.core.vo.InpatientEpisodeShortVo create(ims.core.admin.pas.domain.objects.InpatientEpisode domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.pas.domain.objects.InpatientEpisode object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.InpatientEpisodeShortVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.InpatientEpisode domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.InpatientEpisodeShortVo valueObject = (ims.core.vo.InpatientEpisodeShortVo) map.getValueObject(domainObject, ims.core.vo.InpatientEpisodeShortVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.InpatientEpisodeShortVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.pas.domain.objects.InpatientEpisode
	 */
	 public static ims.core.vo.InpatientEpisodeShortVo insert(ims.core.vo.InpatientEpisodeShortVo valueObject, ims.core.admin.pas.domain.objects.InpatientEpisode domainObject) 
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
	 * @param domainObject ims.core.admin.pas.domain.objects.InpatientEpisode
	 */
	 public static ims.core.vo.InpatientEpisodeShortVo insert(DomainObjectMap map, ims.core.vo.InpatientEpisodeShortVo valueObject, ims.core.admin.pas.domain.objects.InpatientEpisode domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_InpatientEpisode(domainObject.getId());
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
			
		// pasEvent
		valueObject.setPasEvent(ims.core.vo.domain.PasEventPatientDetailsVoAssembler.create(map, domainObject.getPasEvent()) );
		// AdmissionDateTime
		java.util.Date AdmissionDateTime = domainObject.getAdmissionDateTime();
		if ( null != AdmissionDateTime ) 
		{
			valueObject.setAdmissionDateTime(new ims.framework.utils.DateTime(AdmissionDateTime) );
		}
		// EstDischargeDate
		java.util.Date EstDischargeDate = domainObject.getEstDischargeDate();
		if ( null != EstDischargeDate ) 
		{
			valueObject.setEstDischargeDate(new ims.framework.utils.DateTime(EstDischargeDate) );
		}
		// DischargeReadyDate
		java.util.Date DischargeReadyDate = domainObject.getDischargeReadyDate();
		if ( null != DischargeReadyDate ) 
		{
			valueObject.setDischargeReadyDate(new ims.framework.utils.Date(DischargeReadyDate) );
		}
		// isConfirmedDischarge
		valueObject.setIsConfirmedDischarge( domainObject.isIsConfirmedDischarge() );
		// ConfirmedDischargeDateTime
		java.util.Date ConfirmedDischargeDateTime = domainObject.getConfirmedDischargeDateTime();
		if ( null != ConfirmedDischargeDateTime ) 
		{
			valueObject.setConfirmedDischargeDateTime(new ims.framework.utils.DateTime(ConfirmedDischargeDateTime) );
		}
		// isMaternityInpatient
		valueObject.setIsMaternityInpatient( domainObject.isIsMaternityInpatient() );
		// isOnHomeLeave
		valueObject.setIsOnHomeLeave( domainObject.isIsOnHomeLeave() );
		// DateOnHomeLeave
		java.util.Date DateOnHomeLeave = domainObject.getDateOnHomeLeave();
		if ( null != DateOnHomeLeave ) 
		{
			valueObject.setDateOnHomeLeave(new ims.framework.utils.Date(DateOnHomeLeave) );
		}
		// TimeOnHomeLeave
		String TimeOnHomeLeave = domainObject.getTimeOnHomeLeave();
		if ( null != TimeOnHomeLeave ) 
		{
			valueObject.setTimeOnHomeLeave(new ims.framework.utils.Time(TimeOnHomeLeave) );
		}
		// ExpectedDateOfReturn
		java.util.Date ExpectedDateOfReturn = domainObject.getExpectedDateOfReturn();
		if ( null != ExpectedDateOfReturn ) 
		{
			valueObject.setExpectedDateOfReturn(new ims.framework.utils.Date(ExpectedDateOfReturn) );
		}
		// ExpectedTimeOfReturn
		String ExpectedTimeOfReturn = domainObject.getExpectedTimeOfReturn();
		if ( null != ExpectedTimeOfReturn ) 
		{
			valueObject.setExpectedTimeOfReturn(new ims.framework.utils.Time(ExpectedTimeOfReturn) );
		}
		// VTEAssessmentStatus
		ims.domain.lookups.LookupInstance instance13 = domainObject.getVTEAssessmentStatus();
		if ( null != instance13 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance13.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance13.getImage().getImageId(), instance13.getImage().getImagePath());
			}
			color = instance13.getColor();
			if (color != null) 
				color.getValue();

			ims.clinical.vo.lookups.VTEAsessmentStatus voLookup13 = new ims.clinical.vo.lookups.VTEAsessmentStatus(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.clinical.vo.lookups.VTEAsessmentStatus parentVoLookup13 = voLookup13;
			ims.domain.lookups.LookupInstance parent13 = instance13.getParent();
			while (parent13 != null)
			{
				if (parent13.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent13.getImage().getImageId(), parent13.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent13.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup13.setParent(new ims.clinical.vo.lookups.VTEAsessmentStatus(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setVTEAssessmentStatus(voLookup13);
		}
				// VTEAssessmentStatusReason
		ims.domain.lookups.LookupInstance instance14 = domainObject.getVTEAssessmentStatusReason();
		if ( null != instance14 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance14.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance14.getImage().getImageId(), instance14.getImage().getImagePath());
			}
			color = instance14.getColor();
			if (color != null) 
				color.getValue();

			ims.clinical.vo.lookups.VTEAssessmentStatusReason voLookup14 = new ims.clinical.vo.lookups.VTEAssessmentStatusReason(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.clinical.vo.lookups.VTEAssessmentStatusReason parentVoLookup14 = voLookup14;
			ims.domain.lookups.LookupInstance parent14 = instance14.getParent();
			while (parent14 != null)
			{
				if (parent14.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent14.getImage().getImageId(), parent14.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent14.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup14.setParent(new ims.clinical.vo.lookups.VTEAssessmentStatusReason(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setVTEAssessmentStatusReason(voLookup14);
		}
				// LatestSECSScore
		valueObject.setLatestSECSScore(ims.clinical.vo.domain.PatientSecsMinVoAssembler.create(map, domainObject.getLatestSECSScore()) );
		// CurrentTrackingMovement
		valueObject.setCurrentTrackingMovement(ims.core.vo.domain.TrackingMovementVoAssembler.create(map, domainObject.getCurrentTrackingMovement()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.pas.domain.objects.InpatientEpisode extractInpatientEpisode(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.InpatientEpisodeShortVo valueObject) 
	{
		return 	extractInpatientEpisode(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.InpatientEpisode extractInpatientEpisode(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.InpatientEpisodeShortVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_InpatientEpisode();
		ims.core.admin.pas.domain.objects.InpatientEpisode domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.pas.domain.objects.InpatientEpisode)domMap.get(valueObject);
			}
			// ims.core.vo.InpatientEpisodeShortVo ID_InpatientEpisode field is unknown
			domainObject = new ims.core.admin.pas.domain.objects.InpatientEpisode();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_InpatientEpisode());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.pas.domain.objects.InpatientEpisode)domMap.get(key);
			}
			domainObject = (ims.core.admin.pas.domain.objects.InpatientEpisode) domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.InpatientEpisode.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_InpatientEpisode());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.pas.domain.objects.PASEvent value1 = null;
		if ( null != valueObject.getPasEvent() ) 
		{
			if (valueObject.getPasEvent().getBoId() == null)
			{
				if (domMap.get(valueObject.getPasEvent()) != null)
				{
					value1 = (ims.core.admin.pas.domain.objects.PASEvent)domMap.get(valueObject.getPasEvent());
				}
			}
			else
			{
				value1 = (ims.core.admin.pas.domain.objects.PASEvent)domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.PASEvent.class, valueObject.getPasEvent().getBoId());
			}
		}
		domainObject.setPasEvent(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getAdmissionDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setAdmissionDateTime(value2);
		ims.framework.utils.DateTime dateTime3 = valueObject.getEstDischargeDate();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setEstDischargeDate(value3);
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getDischargeReadyDate();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setDischargeReadyDate(value4);
		domainObject.setIsConfirmedDischarge(valueObject.getIsConfirmedDischarge());
		ims.framework.utils.DateTime dateTime6 = valueObject.getConfirmedDischargeDateTime();
		java.util.Date value6 = null;
		if ( dateTime6 != null ) 
		{
			value6 = dateTime6.getJavaDate();
		}
		domainObject.setConfirmedDischargeDateTime(value6);
		domainObject.setIsMaternityInpatient(valueObject.getIsMaternityInpatient());
		domainObject.setIsOnHomeLeave(valueObject.getIsOnHomeLeave());
		java.util.Date value9 = null;
		ims.framework.utils.Date date9 = valueObject.getDateOnHomeLeave();		
		if ( date9 != null ) 
		{
			value9 = date9.getDate();
		}
		domainObject.setDateOnHomeLeave(value9);
		ims.framework.utils.Time time10 = valueObject.getTimeOnHomeLeave();
		String value10 = null;
		if ( time10 != null ) 
		{
			value10 = time10.toString();
		}
		domainObject.setTimeOnHomeLeave(value10);
		java.util.Date value11 = null;
		ims.framework.utils.Date date11 = valueObject.getExpectedDateOfReturn();		
		if ( date11 != null ) 
		{
			value11 = date11.getDate();
		}
		domainObject.setExpectedDateOfReturn(value11);
		ims.framework.utils.Time time12 = valueObject.getExpectedTimeOfReturn();
		String value12 = null;
		if ( time12 != null ) 
		{
			value12 = time12.toString();
		}
		domainObject.setExpectedTimeOfReturn(value12);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getVTEAssessmentStatus() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getVTEAssessmentStatus().getID());
		}
		domainObject.setVTEAssessmentStatus(value13);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getVTEAssessmentStatusReason() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getVTEAssessmentStatusReason().getID());
		}
		domainObject.setVTEAssessmentStatusReason(value14);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.clinical.domain.objects.PatientSECS value15 = null;
		if ( null != valueObject.getLatestSECSScore() ) 
		{
			if (valueObject.getLatestSECSScore().getBoId() == null)
			{
				if (domMap.get(valueObject.getLatestSECSScore()) != null)
				{
					value15 = (ims.clinical.domain.objects.PatientSECS)domMap.get(valueObject.getLatestSECSScore());
				}
			}
			else
			{
				value15 = (ims.clinical.domain.objects.PatientSECS)domainFactory.getDomainObject(ims.clinical.domain.objects.PatientSECS.class, valueObject.getLatestSECSScore().getBoId());
			}
		}
		domainObject.setLatestSECSScore(value15);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.pas.domain.objects.TrackingMovement value16 = null;
		if ( null != valueObject.getCurrentTrackingMovement() ) 
		{
			if (valueObject.getCurrentTrackingMovement().getBoId() == null)
			{
				if (domMap.get(valueObject.getCurrentTrackingMovement()) != null)
				{
					value16 = (ims.core.admin.pas.domain.objects.TrackingMovement)domMap.get(valueObject.getCurrentTrackingMovement());
				}
			}
			else
			{
				value16 = (ims.core.admin.pas.domain.objects.TrackingMovement)domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.TrackingMovement.class, valueObject.getCurrentTrackingMovement().getBoId());
			}
		}
		domainObject.setCurrentTrackingMovement(value16);

		return domainObject;
	}

}
