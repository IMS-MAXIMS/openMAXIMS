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
package ims.emergency.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Bogdan Tofei
 */
public class EmergencyAttendanceForTimeAmendmentsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.EmergencyAttendanceForTimeAmendmentsVo copy(ims.emergency.vo.EmergencyAttendanceForTimeAmendmentsVo valueObjectDest, ims.emergency.vo.EmergencyAttendanceForTimeAmendmentsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_EmergencyAttendance(valueObjectSrc.getID_EmergencyAttendance());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ArrivalDateTime
		valueObjectDest.setArrivalDateTime(valueObjectSrc.getArrivalDateTime());
		// TriageDateTime
		valueObjectDest.setTriageDateTime(valueObjectSrc.getTriageDateTime());
		// AmbulanceArrivalDateTime
		valueObjectDest.setAmbulanceArrivalDateTime(valueObjectSrc.getAmbulanceArrivalDateTime());
		// ConclusionDateTime
		valueObjectDest.setConclusionDateTime(valueObjectSrc.getConclusionDateTime());
		// ExpectedArrivalDateTime
		valueObjectDest.setExpectedArrivalDateTime(valueObjectSrc.getExpectedArrivalDateTime());
		// Outcome
		valueObjectDest.setOutcome(valueObjectSrc.getOutcome());
		// EndOfRegistrationDateTime
		valueObjectDest.setEndOfRegistrationDateTime(valueObjectSrc.getEndOfRegistrationDateTime());
		// RegistrationDateTime
		valueObjectDest.setRegistrationDateTime(valueObjectSrc.getRegistrationDateTime());
		// DischargeDateTime
		valueObjectDest.setDischargeDateTime(valueObjectSrc.getDischargeDateTime());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// customID
		valueObjectDest.setCustomID(valueObjectSrc.getCustomID());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createEmergencyAttendanceForTimeAmendmentsVoCollectionFromEmergencyAttendance(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.EmergencyAttendance objects.
	 */
	public static ims.emergency.vo.EmergencyAttendanceForTimeAmendmentsVoCollection createEmergencyAttendanceForTimeAmendmentsVoCollectionFromEmergencyAttendance(java.util.Set domainObjectSet)	
	{
		return createEmergencyAttendanceForTimeAmendmentsVoCollectionFromEmergencyAttendance(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.EmergencyAttendance objects.
	 */
	public static ims.emergency.vo.EmergencyAttendanceForTimeAmendmentsVoCollection createEmergencyAttendanceForTimeAmendmentsVoCollectionFromEmergencyAttendance(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.EmergencyAttendanceForTimeAmendmentsVoCollection voList = new ims.emergency.vo.EmergencyAttendanceForTimeAmendmentsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.domain.objects.EmergencyAttendance domainObject = (ims.core.admin.domain.objects.EmergencyAttendance) iterator.next();
			ims.emergency.vo.EmergencyAttendanceForTimeAmendmentsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.domain.objects.EmergencyAttendance objects.
	 */
	public static ims.emergency.vo.EmergencyAttendanceForTimeAmendmentsVoCollection createEmergencyAttendanceForTimeAmendmentsVoCollectionFromEmergencyAttendance(java.util.List domainObjectList) 
	{
		return createEmergencyAttendanceForTimeAmendmentsVoCollectionFromEmergencyAttendance(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.EmergencyAttendance objects.
	 */
	public static ims.emergency.vo.EmergencyAttendanceForTimeAmendmentsVoCollection createEmergencyAttendanceForTimeAmendmentsVoCollectionFromEmergencyAttendance(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.EmergencyAttendanceForTimeAmendmentsVoCollection voList = new ims.emergency.vo.EmergencyAttendanceForTimeAmendmentsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.EmergencyAttendance domainObject = (ims.core.admin.domain.objects.EmergencyAttendance) domainObjectList.get(i);
			ims.emergency.vo.EmergencyAttendanceForTimeAmendmentsVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.domain.objects.EmergencyAttendance set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractEmergencyAttendanceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EmergencyAttendanceForTimeAmendmentsVoCollection voCollection) 
	 {
	 	return extractEmergencyAttendanceSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractEmergencyAttendanceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EmergencyAttendanceForTimeAmendmentsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.EmergencyAttendanceForTimeAmendmentsVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.EmergencyAttendance domainObject = EmergencyAttendanceForTimeAmendmentsVoAssembler.extractEmergencyAttendance(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.domain.objects.EmergencyAttendance list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractEmergencyAttendanceList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EmergencyAttendanceForTimeAmendmentsVoCollection voCollection) 
	 {
	 	return extractEmergencyAttendanceList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractEmergencyAttendanceList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EmergencyAttendanceForTimeAmendmentsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.EmergencyAttendanceForTimeAmendmentsVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.EmergencyAttendance domainObject = EmergencyAttendanceForTimeAmendmentsVoAssembler.extractEmergencyAttendance(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.domain.objects.EmergencyAttendance object.
	 * @param domainObject ims.core.admin.domain.objects.EmergencyAttendance
	 */
	 public static ims.emergency.vo.EmergencyAttendanceForTimeAmendmentsVo create(ims.core.admin.domain.objects.EmergencyAttendance domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.domain.objects.EmergencyAttendance object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.emergency.vo.EmergencyAttendanceForTimeAmendmentsVo create(DomainObjectMap map, ims.core.admin.domain.objects.EmergencyAttendance domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.EmergencyAttendanceForTimeAmendmentsVo valueObject = (ims.emergency.vo.EmergencyAttendanceForTimeAmendmentsVo) map.getValueObject(domainObject, ims.emergency.vo.EmergencyAttendanceForTimeAmendmentsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.EmergencyAttendanceForTimeAmendmentsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.domain.objects.EmergencyAttendance
	 */
	 public static ims.emergency.vo.EmergencyAttendanceForTimeAmendmentsVo insert(ims.emergency.vo.EmergencyAttendanceForTimeAmendmentsVo valueObject, ims.core.admin.domain.objects.EmergencyAttendance domainObject) 
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
	 * @param domainObject ims.core.admin.domain.objects.EmergencyAttendance
	 */
	 public static ims.emergency.vo.EmergencyAttendanceForTimeAmendmentsVo insert(DomainObjectMap map, ims.emergency.vo.EmergencyAttendanceForTimeAmendmentsVo valueObject, ims.core.admin.domain.objects.EmergencyAttendance domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_EmergencyAttendance(domainObject.getId());
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
			
		// ArrivalDateTime
		java.util.Date ArrivalDateTime = domainObject.getArrivalDateTime();
		if ( null != ArrivalDateTime ) 
		{
			valueObject.setArrivalDateTime(new ims.framework.utils.DateTime(ArrivalDateTime) );
		}
		// TriageDateTime
		java.util.Date TriageDateTime = domainObject.getTriageDateTime();
		if ( null != TriageDateTime ) 
		{
			valueObject.setTriageDateTime(new ims.framework.utils.DateTime(TriageDateTime) );
		}
		// AmbulanceArrivalDateTime
		java.util.Date AmbulanceArrivalDateTime = domainObject.getAmbulanceArrivalDateTime();
		if ( null != AmbulanceArrivalDateTime ) 
		{
			valueObject.setAmbulanceArrivalDateTime(new ims.framework.utils.DateTime(AmbulanceArrivalDateTime) );
		}
		// ConclusionDateTime
		java.util.Date ConclusionDateTime = domainObject.getConclusionDateTime();
		if ( null != ConclusionDateTime ) 
		{
			valueObject.setConclusionDateTime(new ims.framework.utils.DateTime(ConclusionDateTime) );
		}
		// ExpectedArrivalDateTime
		java.util.Date ExpectedArrivalDateTime = domainObject.getExpectedArrivalDateTime();
		if ( null != ExpectedArrivalDateTime ) 
		{
			valueObject.setExpectedArrivalDateTime(new ims.framework.utils.DateTime(ExpectedArrivalDateTime) );
		}
		// Outcome
		ims.domain.lookups.LookupInstance instance6 = domainObject.getOutcome();
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

			ims.emergency.vo.lookups.AttendanceOutcome voLookup6 = new ims.emergency.vo.lookups.AttendanceOutcome(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.emergency.vo.lookups.AttendanceOutcome parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.emergency.vo.lookups.AttendanceOutcome(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setOutcome(voLookup6);
		}
				// EndOfRegistrationDateTime
		java.util.Date EndOfRegistrationDateTime = domainObject.getEndOfRegistrationDateTime();
		if ( null != EndOfRegistrationDateTime ) 
		{
			valueObject.setEndOfRegistrationDateTime(new ims.framework.utils.DateTime(EndOfRegistrationDateTime) );
		}
		// RegistrationDateTime
		java.util.Date RegistrationDateTime = domainObject.getRegistrationDateTime();
		if ( null != RegistrationDateTime ) 
		{
			valueObject.setRegistrationDateTime(new ims.framework.utils.DateTime(RegistrationDateTime) );
		}
		// DischargeDateTime
		java.util.Date DischargeDateTime = domainObject.getDischargeDateTime();
		if ( null != DischargeDateTime ) 
		{
			valueObject.setDischargeDateTime(new ims.framework.utils.DateTime(DischargeDateTime) );
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
		// customID
		valueObject.setCustomID(domainObject.getCustomID());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.EmergencyAttendance extractEmergencyAttendance(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EmergencyAttendanceForTimeAmendmentsVo valueObject) 
	{
		return 	extractEmergencyAttendance(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.EmergencyAttendance extractEmergencyAttendance(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EmergencyAttendanceForTimeAmendmentsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_EmergencyAttendance();
		ims.core.admin.domain.objects.EmergencyAttendance domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.domain.objects.EmergencyAttendance)domMap.get(valueObject);
			}
			// ims.emergency.vo.EmergencyAttendanceForTimeAmendmentsVo ID_EmergencyAttendance field is unknown
			domainObject = new ims.core.admin.domain.objects.EmergencyAttendance();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_EmergencyAttendance());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.domain.objects.EmergencyAttendance)domMap.get(key);
			}
			domainObject = (ims.core.admin.domain.objects.EmergencyAttendance) domainFactory.getDomainObject(ims.core.admin.domain.objects.EmergencyAttendance.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_EmergencyAttendance());

		ims.framework.utils.DateTime dateTime1 = valueObject.getArrivalDateTime();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setArrivalDateTime(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getTriageDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setTriageDateTime(value2);
		ims.framework.utils.DateTime dateTime3 = valueObject.getAmbulanceArrivalDateTime();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setAmbulanceArrivalDateTime(value3);
		ims.framework.utils.DateTime dateTime4 = valueObject.getConclusionDateTime();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setConclusionDateTime(value4);
		ims.framework.utils.DateTime dateTime5 = valueObject.getExpectedArrivalDateTime();
		java.util.Date value5 = null;
		if ( dateTime5 != null ) 
		{
			value5 = dateTime5.getJavaDate();
		}
		domainObject.setExpectedArrivalDateTime(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getOutcome() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getOutcome().getID());
		}
		domainObject.setOutcome(value6);
		ims.framework.utils.DateTime dateTime7 = valueObject.getEndOfRegistrationDateTime();
		java.util.Date value7 = null;
		if ( dateTime7 != null ) 
		{
			value7 = dateTime7.getJavaDate();
		}
		domainObject.setEndOfRegistrationDateTime(value7);
		ims.framework.utils.DateTime dateTime8 = valueObject.getRegistrationDateTime();
		java.util.Date value8 = null;
		if ( dateTime8 != null ) 
		{
			value8 = dateTime8.getJavaDate();
		}
		domainObject.setRegistrationDateTime(value8);
		ims.framework.utils.DateTime dateTime9 = valueObject.getDischargeDateTime();
		java.util.Date value9 = null;
		if ( dateTime9 != null ) 
		{
			value9 = dateTime9.getJavaDate();
		}
		domainObject.setDischargeDateTime(value9);
		ims.core.admin.domain.objects.CareContext value10 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value10 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value10 = domainObject.getCareContext();	
			}
			else
			{
				value10 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value10);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCustomID() != null && valueObject.getCustomID().equals(""))
		{
			valueObject.setCustomID(null);
		}
		domainObject.setCustomID(valueObject.getCustomID());

		return domainObject;
	}

}
