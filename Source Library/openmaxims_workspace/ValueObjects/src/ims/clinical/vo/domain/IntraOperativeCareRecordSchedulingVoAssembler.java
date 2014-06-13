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
 * @author Daniel Laffan
 */
public class IntraOperativeCareRecordSchedulingVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.IntraOperativeCareRecordSchedulingVo copy(ims.clinical.vo.IntraOperativeCareRecordSchedulingVo valueObjectDest, ims.clinical.vo.IntraOperativeCareRecordSchedulingVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_IntraOperativeCareRecord(valueObjectSrc.getID_IntraOperativeCareRecord());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// IntoPacuTime
		valueObjectDest.setIntoPacuTime(valueObjectSrc.getIntoPacuTime());
		// AnaesthetistStartTime
		valueObjectDest.setAnaesthetistStartTime(valueObjectSrc.getAnaesthetistStartTime());
		// InTheatreTime
		valueObjectDest.setInTheatreTime(valueObjectSrc.getInTheatreTime());
		// SurgeryStartTime
		valueObjectDest.setSurgeryStartTime(valueObjectSrc.getSurgeryStartTime());
		// SurgeryEndTime
		valueObjectDest.setSurgeryEndTime(valueObjectSrc.getSurgeryEndTime());
		// TimeIntoRecovery
		valueObjectDest.setTimeIntoRecovery(valueObjectSrc.getTimeIntoRecovery());
		// TimeOutOfRecovery
		valueObjectDest.setTimeOutOfRecovery(valueObjectSrc.getTimeOutOfRecovery());
		// ProcedureDate
		valueObjectDest.setProcedureDate(valueObjectSrc.getProcedureDate());
		// SysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createIntraOperativeCareRecordSchedulingVoCollectionFromIntraOperativeCareRecord(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.IntraOperativeCareRecord objects.
	 */
	public static ims.clinical.vo.IntraOperativeCareRecordSchedulingVoCollection createIntraOperativeCareRecordSchedulingVoCollectionFromIntraOperativeCareRecord(java.util.Set domainObjectSet)	
	{
		return createIntraOperativeCareRecordSchedulingVoCollectionFromIntraOperativeCareRecord(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.IntraOperativeCareRecord objects.
	 */
	public static ims.clinical.vo.IntraOperativeCareRecordSchedulingVoCollection createIntraOperativeCareRecordSchedulingVoCollectionFromIntraOperativeCareRecord(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.IntraOperativeCareRecordSchedulingVoCollection voList = new ims.clinical.vo.IntraOperativeCareRecordSchedulingVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.IntraOperativeCareRecord domainObject = (ims.core.clinical.domain.objects.IntraOperativeCareRecord) iterator.next();
			ims.clinical.vo.IntraOperativeCareRecordSchedulingVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.IntraOperativeCareRecord objects.
	 */
	public static ims.clinical.vo.IntraOperativeCareRecordSchedulingVoCollection createIntraOperativeCareRecordSchedulingVoCollectionFromIntraOperativeCareRecord(java.util.List domainObjectList) 
	{
		return createIntraOperativeCareRecordSchedulingVoCollectionFromIntraOperativeCareRecord(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.IntraOperativeCareRecord objects.
	 */
	public static ims.clinical.vo.IntraOperativeCareRecordSchedulingVoCollection createIntraOperativeCareRecordSchedulingVoCollectionFromIntraOperativeCareRecord(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.IntraOperativeCareRecordSchedulingVoCollection voList = new ims.clinical.vo.IntraOperativeCareRecordSchedulingVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.IntraOperativeCareRecord domainObject = (ims.core.clinical.domain.objects.IntraOperativeCareRecord) domainObjectList.get(i);
			ims.clinical.vo.IntraOperativeCareRecordSchedulingVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.IntraOperativeCareRecord set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractIntraOperativeCareRecordSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.IntraOperativeCareRecordSchedulingVoCollection voCollection) 
	 {
	 	return extractIntraOperativeCareRecordSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractIntraOperativeCareRecordSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.IntraOperativeCareRecordSchedulingVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.IntraOperativeCareRecordSchedulingVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.IntraOperativeCareRecord domainObject = IntraOperativeCareRecordSchedulingVoAssembler.extractIntraOperativeCareRecord(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.IntraOperativeCareRecord list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractIntraOperativeCareRecordList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.IntraOperativeCareRecordSchedulingVoCollection voCollection) 
	 {
	 	return extractIntraOperativeCareRecordList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractIntraOperativeCareRecordList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.IntraOperativeCareRecordSchedulingVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.IntraOperativeCareRecordSchedulingVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.IntraOperativeCareRecord domainObject = IntraOperativeCareRecordSchedulingVoAssembler.extractIntraOperativeCareRecord(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.IntraOperativeCareRecord object.
	 * @param domainObject ims.core.clinical.domain.objects.IntraOperativeCareRecord
	 */
	 public static ims.clinical.vo.IntraOperativeCareRecordSchedulingVo create(ims.core.clinical.domain.objects.IntraOperativeCareRecord domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.IntraOperativeCareRecord object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.IntraOperativeCareRecordSchedulingVo create(DomainObjectMap map, ims.core.clinical.domain.objects.IntraOperativeCareRecord domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.IntraOperativeCareRecordSchedulingVo valueObject = (ims.clinical.vo.IntraOperativeCareRecordSchedulingVo) map.getValueObject(domainObject, ims.clinical.vo.IntraOperativeCareRecordSchedulingVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.IntraOperativeCareRecordSchedulingVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.IntraOperativeCareRecord
	 */
	 public static ims.clinical.vo.IntraOperativeCareRecordSchedulingVo insert(ims.clinical.vo.IntraOperativeCareRecordSchedulingVo valueObject, ims.core.clinical.domain.objects.IntraOperativeCareRecord domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.IntraOperativeCareRecord
	 */
	 public static ims.clinical.vo.IntraOperativeCareRecordSchedulingVo insert(DomainObjectMap map, ims.clinical.vo.IntraOperativeCareRecordSchedulingVo valueObject, ims.core.clinical.domain.objects.IntraOperativeCareRecord domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_IntraOperativeCareRecord(domainObject.getId());
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
			
		// IntoPacuTime
		java.util.Date IntoPacuTime = domainObject.getIntoPacuTime();
		if ( null != IntoPacuTime ) 
		{
			valueObject.setIntoPacuTime(new ims.framework.utils.DateTime(IntoPacuTime) );
		}
		// AnaesthetistStartTime
		java.util.Date AnaesthetistStartTime = domainObject.getAnaesthetistStartTime();
		if ( null != AnaesthetistStartTime ) 
		{
			valueObject.setAnaesthetistStartTime(new ims.framework.utils.DateTime(AnaesthetistStartTime) );
		}
		// InTheatreTime
		java.util.Date InTheatreTime = domainObject.getInTheatreTime();
		if ( null != InTheatreTime ) 
		{
			valueObject.setInTheatreTime(new ims.framework.utils.DateTime(InTheatreTime) );
		}
		// SurgeryStartTime
		java.util.Date SurgeryStartTime = domainObject.getSurgeryStartTime();
		if ( null != SurgeryStartTime ) 
		{
			valueObject.setSurgeryStartTime(new ims.framework.utils.DateTime(SurgeryStartTime) );
		}
		// SurgeryEndTime
		java.util.Date SurgeryEndTime = domainObject.getSurgeryEndTime();
		if ( null != SurgeryEndTime ) 
		{
			valueObject.setSurgeryEndTime(new ims.framework.utils.DateTime(SurgeryEndTime) );
		}
		// TimeIntoRecovery
		java.util.Date TimeIntoRecovery = domainObject.getTimeIntoRecovery();
		if ( null != TimeIntoRecovery ) 
		{
			valueObject.setTimeIntoRecovery(new ims.framework.utils.DateTime(TimeIntoRecovery) );
		}
		// TimeOutOfRecovery
		java.util.Date TimeOutOfRecovery = domainObject.getTimeOutOfRecovery();
		if ( null != TimeOutOfRecovery ) 
		{
			valueObject.setTimeOutOfRecovery(new ims.framework.utils.DateTime(TimeOutOfRecovery) );
		}
		// ProcedureDate
		java.util.Date ProcedureDate = domainObject.getProcedureDate();
		if ( null != ProcedureDate ) 
		{
			valueObject.setProcedureDate(new ims.framework.utils.Date(ProcedureDate) );
		}
		// SysInfo
		// set system information
		valueObject.setSysInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.IntraOperativeCareRecord extractIntraOperativeCareRecord(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.IntraOperativeCareRecordSchedulingVo valueObject) 
	{
		return 	extractIntraOperativeCareRecord(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.IntraOperativeCareRecord extractIntraOperativeCareRecord(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.IntraOperativeCareRecordSchedulingVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_IntraOperativeCareRecord();
		ims.core.clinical.domain.objects.IntraOperativeCareRecord domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.IntraOperativeCareRecord)domMap.get(valueObject);
			}
			// ims.clinical.vo.IntraOperativeCareRecordSchedulingVo ID_IntraOperativeCareRecord field is unknown
			domainObject = new ims.core.clinical.domain.objects.IntraOperativeCareRecord();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_IntraOperativeCareRecord());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.IntraOperativeCareRecord)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.IntraOperativeCareRecord) domainFactory.getDomainObject(ims.core.clinical.domain.objects.IntraOperativeCareRecord.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_IntraOperativeCareRecord());

		ims.framework.utils.DateTime dateTime1 = valueObject.getIntoPacuTime();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setIntoPacuTime(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getAnaesthetistStartTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setAnaesthetistStartTime(value2);
		ims.framework.utils.DateTime dateTime3 = valueObject.getInTheatreTime();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setInTheatreTime(value3);
		ims.framework.utils.DateTime dateTime4 = valueObject.getSurgeryStartTime();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setSurgeryStartTime(value4);
		ims.framework.utils.DateTime dateTime5 = valueObject.getSurgeryEndTime();
		java.util.Date value5 = null;
		if ( dateTime5 != null ) 
		{
			value5 = dateTime5.getJavaDate();
		}
		domainObject.setSurgeryEndTime(value5);
		ims.framework.utils.DateTime dateTime6 = valueObject.getTimeIntoRecovery();
		java.util.Date value6 = null;
		if ( dateTime6 != null ) 
		{
			value6 = dateTime6.getJavaDate();
		}
		domainObject.setTimeIntoRecovery(value6);
		ims.framework.utils.DateTime dateTime7 = valueObject.getTimeOutOfRecovery();
		java.util.Date value7 = null;
		if ( dateTime7 != null ) 
		{
			value7 = dateTime7.getJavaDate();
		}
		domainObject.setTimeOutOfRecovery(value7);
		java.util.Date value8 = null;
		ims.framework.utils.Date date8 = valueObject.getProcedureDate();		
		if ( date8 != null ) 
		{
			value8 = date8.getDate();
		}
		domainObject.setProcedureDate(value8);

		return domainObject;
	}

}
