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
package ims.scheduling.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Bogdan Tofei
 */
public class FutureAppointmentListVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.FutureAppointmentListVo copy(ims.scheduling.vo.FutureAppointmentListVo valueObjectDest, ims.scheduling.vo.FutureAppointmentListVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_FutureAppointmentDetails(valueObjectSrc.getID_FutureAppointmentDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Referral
		valueObjectDest.setReferral(valueObjectSrc.getReferral());
		// FirstApptService
		valueObjectDest.setFirstApptService(valueObjectSrc.getFirstApptService());
		// FirstApptFunction
		valueObjectDest.setFirstApptFunction(valueObjectSrc.getFirstApptFunction());
		// FirstApptPeriodValue
		valueObjectDest.setFirstApptPeriodValue(valueObjectSrc.getFirstApptPeriodValue());
		// FirstApptPeriodType
		valueObjectDest.setFirstApptPeriodType(valueObjectSrc.getFirstApptPeriodType());
		// FirstApptFutureApptByDate
		valueObjectDest.setFirstApptFutureApptByDate(valueObjectSrc.getFirstApptFutureApptByDate());
		// FirstApptToSee
		valueObjectDest.setFirstApptToSee(valueObjectSrc.getFirstApptToSee());
		// RequestToSchedule
		valueObjectDest.setRequestToSchedule(valueObjectSrc.getRequestToSchedule());
		// NumberOfLinkedRecurringApptsToBook
		valueObjectDest.setNumberOfLinkedRecurringApptsToBook(valueObjectSrc.getNumberOfLinkedRecurringApptsToBook());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// StartingWeek
		valueObjectDest.setStartingWeek(valueObjectSrc.getStartingWeek());
		// DoNotMoveDate
		valueObjectDest.setDoNotMoveDate(valueObjectSrc.getDoNotMoveDate());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createFutureAppointmentListVoCollectionFromFutureAppointmentDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.FutureAppointmentDetails objects.
	 */
	public static ims.scheduling.vo.FutureAppointmentListVoCollection createFutureAppointmentListVoCollectionFromFutureAppointmentDetails(java.util.Set domainObjectSet)	
	{
		return createFutureAppointmentListVoCollectionFromFutureAppointmentDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.FutureAppointmentDetails objects.
	 */
	public static ims.scheduling.vo.FutureAppointmentListVoCollection createFutureAppointmentListVoCollectionFromFutureAppointmentDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.FutureAppointmentListVoCollection voList = new ims.scheduling.vo.FutureAppointmentListVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.scheduling.domain.objects.FutureAppointmentDetails domainObject = (ims.scheduling.domain.objects.FutureAppointmentDetails) iterator.next();
			ims.scheduling.vo.FutureAppointmentListVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.scheduling.domain.objects.FutureAppointmentDetails objects.
	 */
	public static ims.scheduling.vo.FutureAppointmentListVoCollection createFutureAppointmentListVoCollectionFromFutureAppointmentDetails(java.util.List domainObjectList) 
	{
		return createFutureAppointmentListVoCollectionFromFutureAppointmentDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.FutureAppointmentDetails objects.
	 */
	public static ims.scheduling.vo.FutureAppointmentListVoCollection createFutureAppointmentListVoCollectionFromFutureAppointmentDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.FutureAppointmentListVoCollection voList = new ims.scheduling.vo.FutureAppointmentListVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.FutureAppointmentDetails domainObject = (ims.scheduling.domain.objects.FutureAppointmentDetails) domainObjectList.get(i);
			ims.scheduling.vo.FutureAppointmentListVo vo = create(map, domainObject);

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
	 * Create the ims.scheduling.domain.objects.FutureAppointmentDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractFutureAppointmentDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.FutureAppointmentListVoCollection voCollection) 
	 {
	 	return extractFutureAppointmentDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractFutureAppointmentDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.FutureAppointmentListVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.FutureAppointmentListVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.FutureAppointmentDetails domainObject = FutureAppointmentListVoAssembler.extractFutureAppointmentDetails(domainFactory, vo, domMap);

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
	 * Create the ims.scheduling.domain.objects.FutureAppointmentDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractFutureAppointmentDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.FutureAppointmentListVoCollection voCollection) 
	 {
	 	return extractFutureAppointmentDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractFutureAppointmentDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.FutureAppointmentListVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.FutureAppointmentListVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.FutureAppointmentDetails domainObject = FutureAppointmentListVoAssembler.extractFutureAppointmentDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.scheduling.domain.objects.FutureAppointmentDetails object.
	 * @param domainObject ims.scheduling.domain.objects.FutureAppointmentDetails
	 */
	 public static ims.scheduling.vo.FutureAppointmentListVo create(ims.scheduling.domain.objects.FutureAppointmentDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.scheduling.domain.objects.FutureAppointmentDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.scheduling.vo.FutureAppointmentListVo create(DomainObjectMap map, ims.scheduling.domain.objects.FutureAppointmentDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.FutureAppointmentListVo valueObject = (ims.scheduling.vo.FutureAppointmentListVo) map.getValueObject(domainObject, ims.scheduling.vo.FutureAppointmentListVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.FutureAppointmentListVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.scheduling.domain.objects.FutureAppointmentDetails
	 */
	 public static ims.scheduling.vo.FutureAppointmentListVo insert(ims.scheduling.vo.FutureAppointmentListVo valueObject, ims.scheduling.domain.objects.FutureAppointmentDetails domainObject) 
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
	 * @param domainObject ims.scheduling.domain.objects.FutureAppointmentDetails
	 */
	 public static ims.scheduling.vo.FutureAppointmentListVo insert(DomainObjectMap map, ims.scheduling.vo.FutureAppointmentListVo valueObject, ims.scheduling.domain.objects.FutureAppointmentDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_FutureAppointmentDetails(domainObject.getId());
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
			
		// Referral
		valueObject.setReferral(ims.RefMan.vo.domain.CatsReferralPatientVoAssembler.create(map, domainObject.getReferral()) );
		// FirstApptService
		valueObject.setFirstApptService(ims.core.vo.domain.ServiceLiteVoAssembler.create(map, domainObject.get_1stApptService()) );
		// FirstApptFunction
		ims.domain.lookups.LookupInstance instance3 = domainObject.get_1stApptFunction();
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

			ims.core.vo.lookups.ServiceFunction voLookup3 = new ims.core.vo.lookups.ServiceFunction(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.ServiceFunction parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.ServiceFunction(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setFirstApptFunction(voLookup3);
		}
				// FirstApptPeriodValue
		valueObject.setFirstApptPeriodValue(domainObject.get_1stApptPeriodValue());
		// FirstApptPeriodType
		ims.domain.lookups.LookupInstance instance5 = domainObject.get_1stApptPeriodType();
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

			ims.core.vo.lookups.TimeUnitsSecondsToMonths voLookup5 = new ims.core.vo.lookups.TimeUnitsSecondsToMonths(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.TimeUnitsSecondsToMonths parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.TimeUnitsSecondsToMonths(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setFirstApptPeriodType(voLookup5);
		}
				// FirstApptFutureApptByDate
		java.util.Date FirstApptFutureApptByDate = domainObject.get_1stApptFutureApptByDate();
		if ( null != FirstApptFutureApptByDate ) 
		{
			valueObject.setFirstApptFutureApptByDate(new ims.framework.utils.Date(FirstApptFutureApptByDate) );
		}
		// FirstApptToSee
		valueObject.setFirstApptToSee(ims.RefMan.vo.domain.OPAVoAssembler.create(map, domainObject.get_1stApptToSee()) );
		// RequestToSchedule
		ims.domain.lookups.LookupInstance instance8 = domainObject.getRequestToSchedule();
		if ( null != instance8 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance8.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance8.getImage().getImageId(), instance8.getImage().getImagePath());
			}
			color = instance8.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.RequestToSchedule voLookup8 = new ims.scheduling.vo.lookups.RequestToSchedule(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.scheduling.vo.lookups.RequestToSchedule parentVoLookup8 = voLookup8;
			ims.domain.lookups.LookupInstance parent8 = instance8.getParent();
			while (parent8 != null)
			{
				if (parent8.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent8.getImage().getImageId(), parent8.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent8.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup8.setParent(new ims.scheduling.vo.lookups.RequestToSchedule(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setRequestToSchedule(voLookup8);
		}
				// NumberOfLinkedRecurringApptsToBook
		valueObject.setNumberOfLinkedRecurringApptsToBook(domainObject.getNumberOfLinkedRecurringApptsToBook());
		// CurrentStatus
		valueObject.setCurrentStatus(ims.RefMan.vo.domain.FutureAppointmentStatusVoAssembler.create(map, domainObject.getCurrentStatus()) );
		// StartingWeek
		java.util.Date StartingWeek = domainObject.getStartingWeek();
		if ( null != StartingWeek ) 
		{
			valueObject.setStartingWeek(new ims.framework.utils.Date(StartingWeek) );
		}
		// DoNotMoveDate
		valueObject.setDoNotMoveDate( domainObject.isDoNotMoveDate() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.FutureAppointmentDetails extractFutureAppointmentDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.FutureAppointmentListVo valueObject) 
	{
		return 	extractFutureAppointmentDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.FutureAppointmentDetails extractFutureAppointmentDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.FutureAppointmentListVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_FutureAppointmentDetails();
		ims.scheduling.domain.objects.FutureAppointmentDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.scheduling.domain.objects.FutureAppointmentDetails)domMap.get(valueObject);
			}
			// ims.scheduling.vo.FutureAppointmentListVo ID_FutureAppointmentDetails field is unknown
			domainObject = new ims.scheduling.domain.objects.FutureAppointmentDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_FutureAppointmentDetails());
			if (domMap.get(key) != null)
			{
				return (ims.scheduling.domain.objects.FutureAppointmentDetails)domMap.get(key);
			}
			domainObject = (ims.scheduling.domain.objects.FutureAppointmentDetails) domainFactory.getDomainObject(ims.scheduling.domain.objects.FutureAppointmentDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_FutureAppointmentDetails());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.RefMan.domain.objects.CatsReferral value1 = null;
		if ( null != valueObject.getReferral() ) 
		{
			if (valueObject.getReferral().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferral()) != null)
				{
					value1 = (ims.RefMan.domain.objects.CatsReferral)domMap.get(valueObject.getReferral());
				}
			}
			else
			{
				value1 = (ims.RefMan.domain.objects.CatsReferral)domainFactory.getDomainObject(ims.RefMan.domain.objects.CatsReferral.class, valueObject.getReferral().getBoId());
			}
		}
		domainObject.setReferral(value1);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Service value2 = null;
		if ( null != valueObject.getFirstApptService() ) 
		{
			if (valueObject.getFirstApptService().getBoId() == null)
			{
				if (domMap.get(valueObject.getFirstApptService()) != null)
				{
					value2 = (ims.core.clinical.domain.objects.Service)domMap.get(valueObject.getFirstApptService());
				}
			}
			else
			{
				value2 = (ims.core.clinical.domain.objects.Service)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Service.class, valueObject.getFirstApptService().getBoId());
			}
		}
		domainObject.set_1stApptService(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getFirstApptFunction() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getFirstApptFunction().getID());
		}
		domainObject.set_1stApptFunction(value3);
		domainObject.set_1stApptPeriodValue(valueObject.getFirstApptPeriodValue());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getFirstApptPeriodType() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getFirstApptPeriodType().getID());
		}
		domainObject.set_1stApptPeriodType(value5);
		java.util.Date value6 = null;
		ims.framework.utils.Date date6 = valueObject.getFirstApptFutureApptByDate();		
		if ( date6 != null ) 
		{
			value6 = date6.getDate();
		}
		domainObject.set_1stApptFutureApptByDate(value6);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.RefMan.domain.objects.OPA value7 = null;
		if ( null != valueObject.getFirstApptToSee() ) 
		{
			if (valueObject.getFirstApptToSee().getBoId() == null)
			{
				if (domMap.get(valueObject.getFirstApptToSee()) != null)
				{
					value7 = (ims.RefMan.domain.objects.OPA)domMap.get(valueObject.getFirstApptToSee());
				}
			}
			else
			{
				value7 = (ims.RefMan.domain.objects.OPA)domainFactory.getDomainObject(ims.RefMan.domain.objects.OPA.class, valueObject.getFirstApptToSee().getBoId());
			}
		}
		domainObject.set_1stApptToSee(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getRequestToSchedule() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getRequestToSchedule().getID());
		}
		domainObject.setRequestToSchedule(value8);
		domainObject.setNumberOfLinkedRecurringApptsToBook(valueObject.getNumberOfLinkedRecurringApptsToBook());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.scheduling.domain.objects.FutureAppointmentStatus value10 = null;
		if ( null != valueObject.getCurrentStatus() ) 
		{
			if (valueObject.getCurrentStatus().getBoId() == null)
			{
				if (domMap.get(valueObject.getCurrentStatus()) != null)
				{
					value10 = (ims.scheduling.domain.objects.FutureAppointmentStatus)domMap.get(valueObject.getCurrentStatus());
				}
			}
			else
			{
				value10 = (ims.scheduling.domain.objects.FutureAppointmentStatus)domainFactory.getDomainObject(ims.scheduling.domain.objects.FutureAppointmentStatus.class, valueObject.getCurrentStatus().getBoId());
			}
		}
		domainObject.setCurrentStatus(value10);
		java.util.Date value11 = null;
		ims.framework.utils.Date date11 = valueObject.getStartingWeek();		
		if ( date11 != null ) 
		{
			value11 = date11.getDate();
		}
		domainObject.setStartingWeek(value11);
		domainObject.setDoNotMoveDate(valueObject.getDoNotMoveDate());

		return domainObject;
	}

}
