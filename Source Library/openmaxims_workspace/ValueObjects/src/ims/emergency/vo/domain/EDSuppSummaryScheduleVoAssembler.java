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
package ims.emergency.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Gabriel Maxim
 */
public class EDSuppSummaryScheduleVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.EDSuppSummaryScheduleVo copy(ims.emergency.vo.EDSuppSummaryScheduleVo valueObjectDest, ims.emergency.vo.EDSuppSummaryScheduleVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_EDSuppSummarySchedule(valueObjectSrc.getID_EDSuppSummarySchedule());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// GeneratedLettersNo
		valueObjectDest.setGeneratedLettersNo(valueObjectSrc.getGeneratedLettersNo());
		// PrintAgentTo
		valueObjectDest.setPrintAgentTo(valueObjectSrc.getPrintAgentTo());
		// SuccessfulEmailsNo
		valueObjectDest.setSuccessfulEmailsNo(valueObjectSrc.getSuccessfulEmailsNo());
		// FailedEmailsNo
		valueObjectDest.setFailedEmailsNo(valueObjectSrc.getFailedEmailsNo());
		// PrintedLettersNo
		valueObjectDest.setPrintedLettersNo(valueObjectSrc.getPrintedLettersNo());
		// ConfiguredJobDetails
		valueObjectDest.setConfiguredJobDetails(valueObjectSrc.getConfiguredJobDetails());
		// SystemInformation
		valueObjectDest.setSystemInformation(valueObjectSrc.getSystemInformation());
		// PrintLettersOnly
		valueObjectDest.setPrintLettersOnly(valueObjectSrc.getPrintLettersOnly());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createEDSuppSummaryScheduleVoCollectionFromEDSuppSummarySchedule(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.configuration.domain.objects.EDSuppSummarySchedule objects.
	 */
	public static ims.emergency.vo.EDSuppSummaryScheduleVoCollection createEDSuppSummaryScheduleVoCollectionFromEDSuppSummarySchedule(java.util.Set domainObjectSet)	
	{
		return createEDSuppSummaryScheduleVoCollectionFromEDSuppSummarySchedule(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.configuration.domain.objects.EDSuppSummarySchedule objects.
	 */
	public static ims.emergency.vo.EDSuppSummaryScheduleVoCollection createEDSuppSummaryScheduleVoCollectionFromEDSuppSummarySchedule(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.EDSuppSummaryScheduleVoCollection voList = new ims.emergency.vo.EDSuppSummaryScheduleVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.configuration.domain.objects.EDSuppSummarySchedule domainObject = (ims.core.configuration.domain.objects.EDSuppSummarySchedule) iterator.next();
			ims.emergency.vo.EDSuppSummaryScheduleVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.configuration.domain.objects.EDSuppSummarySchedule objects.
	 */
	public static ims.emergency.vo.EDSuppSummaryScheduleVoCollection createEDSuppSummaryScheduleVoCollectionFromEDSuppSummarySchedule(java.util.List domainObjectList) 
	{
		return createEDSuppSummaryScheduleVoCollectionFromEDSuppSummarySchedule(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.configuration.domain.objects.EDSuppSummarySchedule objects.
	 */
	public static ims.emergency.vo.EDSuppSummaryScheduleVoCollection createEDSuppSummaryScheduleVoCollectionFromEDSuppSummarySchedule(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.EDSuppSummaryScheduleVoCollection voList = new ims.emergency.vo.EDSuppSummaryScheduleVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.configuration.domain.objects.EDSuppSummarySchedule domainObject = (ims.core.configuration.domain.objects.EDSuppSummarySchedule) domainObjectList.get(i);
			ims.emergency.vo.EDSuppSummaryScheduleVo vo = create(map, domainObject);

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
	 * Create the ims.core.configuration.domain.objects.EDSuppSummarySchedule set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractEDSuppSummaryScheduleSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EDSuppSummaryScheduleVoCollection voCollection) 
	 {
	 	return extractEDSuppSummaryScheduleSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractEDSuppSummaryScheduleSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EDSuppSummaryScheduleVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.EDSuppSummaryScheduleVo vo = voCollection.get(i);
			ims.core.configuration.domain.objects.EDSuppSummarySchedule domainObject = EDSuppSummaryScheduleVoAssembler.extractEDSuppSummarySchedule(domainFactory, vo, domMap);

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
	 * Create the ims.core.configuration.domain.objects.EDSuppSummarySchedule list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractEDSuppSummaryScheduleList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EDSuppSummaryScheduleVoCollection voCollection) 
	 {
	 	return extractEDSuppSummaryScheduleList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractEDSuppSummaryScheduleList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EDSuppSummaryScheduleVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.EDSuppSummaryScheduleVo vo = voCollection.get(i);
			ims.core.configuration.domain.objects.EDSuppSummarySchedule domainObject = EDSuppSummaryScheduleVoAssembler.extractEDSuppSummarySchedule(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.configuration.domain.objects.EDSuppSummarySchedule object.
	 * @param domainObject ims.core.configuration.domain.objects.EDSuppSummarySchedule
	 */
	 public static ims.emergency.vo.EDSuppSummaryScheduleVo create(ims.core.configuration.domain.objects.EDSuppSummarySchedule domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.configuration.domain.objects.EDSuppSummarySchedule object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.emergency.vo.EDSuppSummaryScheduleVo create(DomainObjectMap map, ims.core.configuration.domain.objects.EDSuppSummarySchedule domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.EDSuppSummaryScheduleVo valueObject = (ims.emergency.vo.EDSuppSummaryScheduleVo) map.getValueObject(domainObject, ims.emergency.vo.EDSuppSummaryScheduleVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.EDSuppSummaryScheduleVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.configuration.domain.objects.EDSuppSummarySchedule
	 */
	 public static ims.emergency.vo.EDSuppSummaryScheduleVo insert(ims.emergency.vo.EDSuppSummaryScheduleVo valueObject, ims.core.configuration.domain.objects.EDSuppSummarySchedule domainObject) 
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
	 * @param domainObject ims.core.configuration.domain.objects.EDSuppSummarySchedule
	 */
	 public static ims.emergency.vo.EDSuppSummaryScheduleVo insert(DomainObjectMap map, ims.emergency.vo.EDSuppSummaryScheduleVo valueObject, ims.core.configuration.domain.objects.EDSuppSummarySchedule domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_EDSuppSummarySchedule(domainObject.getId());
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
			
		// GeneratedLettersNo
		valueObject.setGeneratedLettersNo(domainObject.getGeneratedLettersNo());
		// PrintAgentTo
		valueObject.setPrintAgentTo(domainObject.getPrintAgentTo());
		// SuccessfulEmailsNo
		valueObject.setSuccessfulEmailsNo(domainObject.getSuccessfulEmailsNo());
		// FailedEmailsNo
		valueObject.setFailedEmailsNo(domainObject.getFailedEmailsNo());
		// PrintedLettersNo
		valueObject.setPrintedLettersNo(domainObject.getPrintedLettersNo());
		// ConfiguredJobDetails
		if (domainObject.getConfiguredJobDetails() != null)
		{
			if(domainObject.getConfiguredJobDetails() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getConfiguredJobDetails();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setConfiguredJobDetails(new ims.core.configuration.vo.ConfiguredJobRefVo(id, -1));				
			}
			else
			{
				valueObject.setConfiguredJobDetails(new ims.core.configuration.vo.ConfiguredJobRefVo(domainObject.getConfiguredJobDetails().getId(), domainObject.getConfiguredJobDetails().getVersion()));
			}
		}
		// SystemInformation
		// set system information
		valueObject.setSystemInformation(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// PrintLettersOnly
		valueObject.setPrintLettersOnly( domainObject.isPrintLettersOnly() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.configuration.domain.objects.EDSuppSummarySchedule extractEDSuppSummarySchedule(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EDSuppSummaryScheduleVo valueObject) 
	{
		return 	extractEDSuppSummarySchedule(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.configuration.domain.objects.EDSuppSummarySchedule extractEDSuppSummarySchedule(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EDSuppSummaryScheduleVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_EDSuppSummarySchedule();
		ims.core.configuration.domain.objects.EDSuppSummarySchedule domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.configuration.domain.objects.EDSuppSummarySchedule)domMap.get(valueObject);
			}
			// ims.emergency.vo.EDSuppSummaryScheduleVo ID_EDSuppSummarySchedule field is unknown
			domainObject = new ims.core.configuration.domain.objects.EDSuppSummarySchedule();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_EDSuppSummarySchedule());
			if (domMap.get(key) != null)
			{
				return (ims.core.configuration.domain.objects.EDSuppSummarySchedule)domMap.get(key);
			}
			domainObject = (ims.core.configuration.domain.objects.EDSuppSummarySchedule) domainFactory.getDomainObject(ims.core.configuration.domain.objects.EDSuppSummarySchedule.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_EDSuppSummarySchedule());

		domainObject.setGeneratedLettersNo(valueObject.getGeneratedLettersNo());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPrintAgentTo() != null && valueObject.getPrintAgentTo().equals(""))
		{
			valueObject.setPrintAgentTo(null);
		}
		domainObject.setPrintAgentTo(valueObject.getPrintAgentTo());
		domainObject.setSuccessfulEmailsNo(valueObject.getSuccessfulEmailsNo());
		domainObject.setFailedEmailsNo(valueObject.getFailedEmailsNo());
		domainObject.setPrintedLettersNo(valueObject.getPrintedLettersNo());
		ims.core.configuration.domain.objects.ConfiguredJob value6 = null;
		if ( null != valueObject.getConfiguredJobDetails() ) 
		{
			if (valueObject.getConfiguredJobDetails().getBoId() == null)
			{
				if (domMap.get(valueObject.getConfiguredJobDetails()) != null)
				{
					value6 = (ims.core.configuration.domain.objects.ConfiguredJob)domMap.get(valueObject.getConfiguredJobDetails());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value6 = domainObject.getConfiguredJobDetails();	
			}
			else
			{
				value6 = (ims.core.configuration.domain.objects.ConfiguredJob)domainFactory.getDomainObject(ims.core.configuration.domain.objects.ConfiguredJob.class, valueObject.getConfiguredJobDetails().getBoId());
			}
		}
		domainObject.setConfiguredJobDetails(value6);
		domainObject.setPrintLettersOnly(valueObject.getPrintLettersOnly());

		return domainObject;
	}

}
