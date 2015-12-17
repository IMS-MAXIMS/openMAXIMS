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
 * @author Catalin Tomozei
 */
public class DischargeSummaryScheduleVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.DischargeSummaryScheduleVo copy(ims.clinical.vo.DischargeSummaryScheduleVo valueObjectDest, ims.clinical.vo.DischargeSummaryScheduleVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_DischargeSummarySchedule(valueObjectSrc.getID_DischargeSummarySchedule());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CreationDate
		valueObjectDest.setCreationDate(valueObjectSrc.getCreationDate());
		// LastRun
		valueObjectDest.setLastRun(valueObjectSrc.getLastRun());
		// NextRun
		valueObjectDest.setNextRun(valueObjectSrc.getNextRun());
		// PrintAgentTo
		valueObjectDest.setPrintAgentTo(valueObjectSrc.getPrintAgentTo());
		// TriggerFrequency
		valueObjectDest.setTriggerFrequency(valueObjectSrc.getTriggerFrequency());
		// RepeatInterval
		valueObjectDest.setRepeatInterval(valueObjectSrc.getRepeatInterval());
		// JobType
		valueObjectDest.setJobType(valueObjectSrc.getJobType());
		// GeneratedLeettersNo
		valueObjectDest.setGeneratedLeettersNo(valueObjectSrc.getGeneratedLeettersNo());
		// SuccessfulEmailsNo
		valueObjectDest.setSuccessfulEmailsNo(valueObjectSrc.getSuccessfulEmailsNo());
		// FailedEmailsNo
		valueObjectDest.setFailedEmailsNo(valueObjectSrc.getFailedEmailsNo());
		// PrintedLettersNo
		valueObjectDest.setPrintedLettersNo(valueObjectSrc.getPrintedLettersNo());
		// FailedEmails
		valueObjectDest.setFailedEmails(valueObjectSrc.getFailedEmails());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createDischargeSummaryScheduleVoCollectionFromDischargeSummarySchedule(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.edischarge.domain.objects.DischargeSummarySchedule objects.
	 */
	public static ims.clinical.vo.DischargeSummaryScheduleVoCollection createDischargeSummaryScheduleVoCollectionFromDischargeSummarySchedule(java.util.Set domainObjectSet)	
	{
		return createDischargeSummaryScheduleVoCollectionFromDischargeSummarySchedule(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.edischarge.domain.objects.DischargeSummarySchedule objects.
	 */
	public static ims.clinical.vo.DischargeSummaryScheduleVoCollection createDischargeSummaryScheduleVoCollectionFromDischargeSummarySchedule(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.DischargeSummaryScheduleVoCollection voList = new ims.clinical.vo.DischargeSummaryScheduleVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.edischarge.domain.objects.DischargeSummarySchedule domainObject = (ims.edischarge.domain.objects.DischargeSummarySchedule) iterator.next();
			ims.clinical.vo.DischargeSummaryScheduleVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.edischarge.domain.objects.DischargeSummarySchedule objects.
	 */
	public static ims.clinical.vo.DischargeSummaryScheduleVoCollection createDischargeSummaryScheduleVoCollectionFromDischargeSummarySchedule(java.util.List domainObjectList) 
	{
		return createDischargeSummaryScheduleVoCollectionFromDischargeSummarySchedule(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.edischarge.domain.objects.DischargeSummarySchedule objects.
	 */
	public static ims.clinical.vo.DischargeSummaryScheduleVoCollection createDischargeSummaryScheduleVoCollectionFromDischargeSummarySchedule(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.DischargeSummaryScheduleVoCollection voList = new ims.clinical.vo.DischargeSummaryScheduleVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.edischarge.domain.objects.DischargeSummarySchedule domainObject = (ims.edischarge.domain.objects.DischargeSummarySchedule) domainObjectList.get(i);
			ims.clinical.vo.DischargeSummaryScheduleVo vo = create(map, domainObject);

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
	 * Create the ims.edischarge.domain.objects.DischargeSummarySchedule set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractDischargeSummaryScheduleSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeSummaryScheduleVoCollection voCollection) 
	 {
	 	return extractDischargeSummaryScheduleSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractDischargeSummaryScheduleSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeSummaryScheduleVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.DischargeSummaryScheduleVo vo = voCollection.get(i);
			ims.edischarge.domain.objects.DischargeSummarySchedule domainObject = DischargeSummaryScheduleVoAssembler.extractDischargeSummarySchedule(domainFactory, vo, domMap);

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
	 * Create the ims.edischarge.domain.objects.DischargeSummarySchedule list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractDischargeSummaryScheduleList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeSummaryScheduleVoCollection voCollection) 
	 {
	 	return extractDischargeSummaryScheduleList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractDischargeSummaryScheduleList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeSummaryScheduleVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.DischargeSummaryScheduleVo vo = voCollection.get(i);
			ims.edischarge.domain.objects.DischargeSummarySchedule domainObject = DischargeSummaryScheduleVoAssembler.extractDischargeSummarySchedule(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.edischarge.domain.objects.DischargeSummarySchedule object.
	 * @param domainObject ims.edischarge.domain.objects.DischargeSummarySchedule
	 */
	 public static ims.clinical.vo.DischargeSummaryScheduleVo create(ims.edischarge.domain.objects.DischargeSummarySchedule domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.edischarge.domain.objects.DischargeSummarySchedule object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.DischargeSummaryScheduleVo create(DomainObjectMap map, ims.edischarge.domain.objects.DischargeSummarySchedule domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.DischargeSummaryScheduleVo valueObject = (ims.clinical.vo.DischargeSummaryScheduleVo) map.getValueObject(domainObject, ims.clinical.vo.DischargeSummaryScheduleVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.DischargeSummaryScheduleVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.edischarge.domain.objects.DischargeSummarySchedule
	 */
	 public static ims.clinical.vo.DischargeSummaryScheduleVo insert(ims.clinical.vo.DischargeSummaryScheduleVo valueObject, ims.edischarge.domain.objects.DischargeSummarySchedule domainObject) 
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
	 * @param domainObject ims.edischarge.domain.objects.DischargeSummarySchedule
	 */
	 public static ims.clinical.vo.DischargeSummaryScheduleVo insert(DomainObjectMap map, ims.clinical.vo.DischargeSummaryScheduleVo valueObject, ims.edischarge.domain.objects.DischargeSummarySchedule domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_DischargeSummarySchedule(domainObject.getId());
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
			
		// CreationDate
		java.util.Date CreationDate = domainObject.getCreationDate();
		if ( null != CreationDate ) 
		{
			valueObject.setCreationDate(new ims.framework.utils.Date(CreationDate) );
		}
		// LastRun
		java.util.Date LastRun = domainObject.getLastRun();
		if ( null != LastRun ) 
		{
			valueObject.setLastRun(new ims.framework.utils.DateTime(LastRun) );
		}
		// NextRun
		java.util.Date NextRun = domainObject.getNextRun();
		if ( null != NextRun ) 
		{
			valueObject.setNextRun(new ims.framework.utils.DateTime(NextRun) );
		}
		// PrintAgentTo
		valueObject.setPrintAgentTo(domainObject.getPrintAgentTo());
		// TriggerFrequency
		valueObject.setTriggerFrequency(domainObject.getTriggerFrequency());
		// RepeatInterval
		valueObject.setRepeatInterval(domainObject.getRepeatInterval());
		// JobType
		ims.domain.lookups.LookupInstance instance7 = domainObject.getJobType();
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

			ims.clinical.vo.lookups.DischargeSummaryJobType voLookup7 = new ims.clinical.vo.lookups.DischargeSummaryJobType(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.clinical.vo.lookups.DischargeSummaryJobType parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.clinical.vo.lookups.DischargeSummaryJobType(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setJobType(voLookup7);
		}
				// GeneratedLeettersNo
		valueObject.setGeneratedLeettersNo(domainObject.getGeneratedLeettersNo());
		// SuccessfulEmailsNo
		valueObject.setSuccessfulEmailsNo(domainObject.getSuccessfulEmailsNo());
		// FailedEmailsNo
		valueObject.setFailedEmailsNo(domainObject.getFailedEmailsNo());
		// PrintedLettersNo
		valueObject.setPrintedLettersNo(domainObject.getPrintedLettersNo());
		// FailedEmails
		valueObject.setFailedEmails(ims.clinical.vo.domain.FailedEmailsDetailsVoAssembler.createFailedEmailsDetailsVoCollectionFromFailedEmailsDetails(map, domainObject.getFailedEmails()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.edischarge.domain.objects.DischargeSummarySchedule extractDischargeSummarySchedule(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeSummaryScheduleVo valueObject) 
	{
		return 	extractDischargeSummarySchedule(domainFactory, valueObject, new HashMap());
	}

	public static ims.edischarge.domain.objects.DischargeSummarySchedule extractDischargeSummarySchedule(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeSummaryScheduleVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_DischargeSummarySchedule();
		ims.edischarge.domain.objects.DischargeSummarySchedule domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.edischarge.domain.objects.DischargeSummarySchedule)domMap.get(valueObject);
			}
			// ims.clinical.vo.DischargeSummaryScheduleVo ID_DischargeSummarySchedule field is unknown
			domainObject = new ims.edischarge.domain.objects.DischargeSummarySchedule();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_DischargeSummarySchedule());
			if (domMap.get(key) != null)
			{
				return (ims.edischarge.domain.objects.DischargeSummarySchedule)domMap.get(key);
			}
			domainObject = (ims.edischarge.domain.objects.DischargeSummarySchedule) domainFactory.getDomainObject(ims.edischarge.domain.objects.DischargeSummarySchedule.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_DischargeSummarySchedule());

		java.util.Date value1 = null;
		ims.framework.utils.Date date1 = valueObject.getCreationDate();		
		if ( date1 != null ) 
		{
			value1 = date1.getDate();
		}
		domainObject.setCreationDate(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getLastRun();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setLastRun(value2);
		ims.framework.utils.DateTime dateTime3 = valueObject.getNextRun();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setNextRun(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPrintAgentTo() != null && valueObject.getPrintAgentTo().equals(""))
		{
			valueObject.setPrintAgentTo(null);
		}
		domainObject.setPrintAgentTo(valueObject.getPrintAgentTo());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTriggerFrequency() != null && valueObject.getTriggerFrequency().equals(""))
		{
			valueObject.setTriggerFrequency(null);
		}
		domainObject.setTriggerFrequency(valueObject.getTriggerFrequency());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getRepeatInterval() != null && valueObject.getRepeatInterval().equals(""))
		{
			valueObject.setRepeatInterval(null);
		}
		domainObject.setRepeatInterval(valueObject.getRepeatInterval());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getJobType() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getJobType().getID());
		}
		domainObject.setJobType(value7);
		domainObject.setGeneratedLeettersNo(valueObject.getGeneratedLeettersNo());
		domainObject.setSuccessfulEmailsNo(valueObject.getSuccessfulEmailsNo());
		domainObject.setFailedEmailsNo(valueObject.getFailedEmailsNo());
		domainObject.setPrintedLettersNo(valueObject.getPrintedLettersNo());
		domainObject.setFailedEmails(ims.clinical.vo.domain.FailedEmailsDetailsVoAssembler.extractFailedEmailsDetailsList(domainFactory, valueObject.getFailedEmails(), domainObject.getFailedEmails(), domMap));		

		return domainObject;
	}

}
