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
package ims.scheduling.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Ander Telleria
 */
public class DnaBatchUpdateVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.DnaBatchUpdateVo copy(ims.scheduling.vo.DnaBatchUpdateVo valueObjectDest, ims.scheduling.vo.DnaBatchUpdateVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_DnaBactchJob(valueObjectSrc.getID_DnaBactchJob());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// CreationDate
		valueObjectDest.setCreationDate(valueObjectSrc.getCreationDate());
		// TriggerFrecuency
		valueObjectDest.setTriggerFrecuency(valueObjectSrc.getTriggerFrecuency());
		// LastRun
		valueObjectDest.setLastRun(valueObjectSrc.getLastRun());
		// NextRun
		valueObjectDest.setNextRun(valueObjectSrc.getNextRun());
		// numAppointmentsUpdated
		valueObjectDest.setNumAppointmentsUpdated(valueObjectSrc.getNumAppointmentsUpdated());
		// PrintAgentTo
		valueObjectDest.setPrintAgentTo(valueObjectSrc.getPrintAgentTo());
		// jobDetail
		valueObjectDest.setJobDetail(valueObjectSrc.getJobDetail());
		// Cron
		valueObjectDest.setCron(valueObjectSrc.getCron());
		// CronFebruary
		valueObjectDest.setCronFebruary(valueObjectSrc.getCronFebruary());
		// isSimpleCron
		valueObjectDest.setIsSimpleCron(valueObjectSrc.getIsSimpleCron());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createDnaBatchUpdateVoCollectionFromDnaBactchJob(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.DnaBactchJob objects.
	 */
	public static ims.scheduling.vo.DnaBatchUpdateVoCollection createDnaBatchUpdateVoCollectionFromDnaBactchJob(java.util.Set domainObjectSet)	
	{
		return createDnaBatchUpdateVoCollectionFromDnaBactchJob(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.DnaBactchJob objects.
	 */
	public static ims.scheduling.vo.DnaBatchUpdateVoCollection createDnaBatchUpdateVoCollectionFromDnaBactchJob(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.DnaBatchUpdateVoCollection voList = new ims.scheduling.vo.DnaBatchUpdateVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.scheduling.domain.objects.DnaBactchJob domainObject = (ims.scheduling.domain.objects.DnaBactchJob) iterator.next();
			ims.scheduling.vo.DnaBatchUpdateVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.scheduling.domain.objects.DnaBactchJob objects.
	 */
	public static ims.scheduling.vo.DnaBatchUpdateVoCollection createDnaBatchUpdateVoCollectionFromDnaBactchJob(java.util.List domainObjectList) 
	{
		return createDnaBatchUpdateVoCollectionFromDnaBactchJob(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.DnaBactchJob objects.
	 */
	public static ims.scheduling.vo.DnaBatchUpdateVoCollection createDnaBatchUpdateVoCollectionFromDnaBactchJob(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.DnaBatchUpdateVoCollection voList = new ims.scheduling.vo.DnaBatchUpdateVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.DnaBactchJob domainObject = (ims.scheduling.domain.objects.DnaBactchJob) domainObjectList.get(i);
			ims.scheduling.vo.DnaBatchUpdateVo vo = create(map, domainObject);

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
	 * Create the ims.scheduling.domain.objects.DnaBactchJob set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractDnaBactchJobSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.DnaBatchUpdateVoCollection voCollection) 
	 {
	 	return extractDnaBactchJobSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractDnaBactchJobSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.DnaBatchUpdateVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.DnaBatchUpdateVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.DnaBactchJob domainObject = DnaBatchUpdateVoAssembler.extractDnaBactchJob(domainFactory, vo, domMap);

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
	 * Create the ims.scheduling.domain.objects.DnaBactchJob list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractDnaBactchJobList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.DnaBatchUpdateVoCollection voCollection) 
	 {
	 	return extractDnaBactchJobList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractDnaBactchJobList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.DnaBatchUpdateVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.DnaBatchUpdateVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.DnaBactchJob domainObject = DnaBatchUpdateVoAssembler.extractDnaBactchJob(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.scheduling.domain.objects.DnaBactchJob object.
	 * @param domainObject ims.scheduling.domain.objects.DnaBactchJob
	 */
	 public static ims.scheduling.vo.DnaBatchUpdateVo create(ims.scheduling.domain.objects.DnaBactchJob domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.scheduling.domain.objects.DnaBactchJob object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.scheduling.vo.DnaBatchUpdateVo create(DomainObjectMap map, ims.scheduling.domain.objects.DnaBactchJob domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.DnaBatchUpdateVo valueObject = (ims.scheduling.vo.DnaBatchUpdateVo) map.getValueObject(domainObject, ims.scheduling.vo.DnaBatchUpdateVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.DnaBatchUpdateVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.scheduling.domain.objects.DnaBactchJob
	 */
	 public static ims.scheduling.vo.DnaBatchUpdateVo insert(ims.scheduling.vo.DnaBatchUpdateVo valueObject, ims.scheduling.domain.objects.DnaBactchJob domainObject) 
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
	 * @param domainObject ims.scheduling.domain.objects.DnaBactchJob
	 */
	 public static ims.scheduling.vo.DnaBatchUpdateVo insert(DomainObjectMap map, ims.scheduling.vo.DnaBatchUpdateVo valueObject, ims.scheduling.domain.objects.DnaBactchJob domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_DnaBactchJob(domainObject.getId());
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
			
		// Name
		valueObject.setName(domainObject.getName());
		// CreationDate
		java.util.Date CreationDate = domainObject.getCreationDate();
		if ( null != CreationDate ) 
		{
			valueObject.setCreationDate(new ims.framework.utils.Date(CreationDate) );
		}
		// TriggerFrecuency
		valueObject.setTriggerFrecuency(domainObject.getTriggerFrecuency());
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
		// numAppointmentsUpdated
		valueObject.setNumAppointmentsUpdated(domainObject.getNumAppointmentsUpdated());
		// PrintAgentTo
		valueObject.setPrintAgentTo(domainObject.getPrintAgentTo());
		// jobDetail
		valueObject.setJobDetail(domainObject.getJobDetail());
		// Cron
		valueObject.setCron(domainObject.getCron());
		// CronFebruary
		valueObject.setCronFebruary(domainObject.getCronFebruary());
		// isSimpleCron
		valueObject.setIsSimpleCron( domainObject.isIsSimpleCron() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.DnaBactchJob extractDnaBactchJob(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.DnaBatchUpdateVo valueObject) 
	{
		return 	extractDnaBactchJob(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.DnaBactchJob extractDnaBactchJob(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.DnaBatchUpdateVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_DnaBactchJob();
		ims.scheduling.domain.objects.DnaBactchJob domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.scheduling.domain.objects.DnaBactchJob)domMap.get(valueObject);
			}
			// ims.scheduling.vo.DnaBatchUpdateVo ID_DnaBactchJob field is unknown
			domainObject = new ims.scheduling.domain.objects.DnaBactchJob();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_DnaBactchJob());
			if (domMap.get(key) != null)
			{
				return (ims.scheduling.domain.objects.DnaBactchJob)domMap.get(key);
			}
			domainObject = (ims.scheduling.domain.objects.DnaBactchJob) domainFactory.getDomainObject(ims.scheduling.domain.objects.DnaBactchJob.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_DnaBactchJob());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());
		java.util.Date value2 = null;
		ims.framework.utils.Date date2 = valueObject.getCreationDate();		
		if ( date2 != null ) 
		{
			value2 = date2.getDate();
		}
		domainObject.setCreationDate(value2);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTriggerFrecuency() != null && valueObject.getTriggerFrecuency().equals(""))
		{
			valueObject.setTriggerFrecuency(null);
		}
		domainObject.setTriggerFrecuency(valueObject.getTriggerFrecuency());
		ims.framework.utils.DateTime dateTime4 = valueObject.getLastRun();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setLastRun(value4);
		ims.framework.utils.DateTime dateTime5 = valueObject.getNextRun();
		java.util.Date value5 = null;
		if ( dateTime5 != null ) 
		{
			value5 = dateTime5.getJavaDate();
		}
		domainObject.setNextRun(value5);
		domainObject.setNumAppointmentsUpdated(valueObject.getNumAppointmentsUpdated());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPrintAgentTo() != null && valueObject.getPrintAgentTo().equals(""))
		{
			valueObject.setPrintAgentTo(null);
		}
		domainObject.setPrintAgentTo(valueObject.getPrintAgentTo());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getJobDetail() != null && valueObject.getJobDetail().equals(""))
		{
			valueObject.setJobDetail(null);
		}
		domainObject.setJobDetail(valueObject.getJobDetail());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCron() != null && valueObject.getCron().equals(""))
		{
			valueObject.setCron(null);
		}
		domainObject.setCron(valueObject.getCron());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCronFebruary() != null && valueObject.getCronFebruary().equals(""))
		{
			valueObject.setCronFebruary(null);
		}
		domainObject.setCronFebruary(valueObject.getCronFebruary());
		domainObject.setIsSimpleCron(valueObject.getIsSimpleCron());

		return domainObject;
	}

}
