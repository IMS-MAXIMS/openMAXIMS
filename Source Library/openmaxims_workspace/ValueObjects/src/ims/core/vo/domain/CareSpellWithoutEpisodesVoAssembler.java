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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cornel Ventuneac
 */
public class CareSpellWithoutEpisodesVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.CareSpellWithoutEpisodesVo copy(ims.core.vo.CareSpellWithoutEpisodesVo valueObjectDest, ims.core.vo.CareSpellWithoutEpisodesVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CareSpell(valueObjectSrc.getID_CareSpell());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// StatusHistory
		valueObjectDest.setStatusHistory(valueObjectSrc.getStatusHistory());
		// StartDate
		valueObjectDest.setStartDate(valueObjectSrc.getStartDate());
		// EndDate
		valueObjectDest.setEndDate(valueObjectSrc.getEndDate());
		// SysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCareSpellWithoutEpisodesVoCollectionFromCareSpell(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.CareSpell objects.
	 */
	public static ims.core.vo.CareSpellWithoutEpisodesVoCollection createCareSpellWithoutEpisodesVoCollectionFromCareSpell(java.util.Set domainObjectSet)	
	{
		return createCareSpellWithoutEpisodesVoCollectionFromCareSpell(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.CareSpell objects.
	 */
	public static ims.core.vo.CareSpellWithoutEpisodesVoCollection createCareSpellWithoutEpisodesVoCollectionFromCareSpell(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.CareSpellWithoutEpisodesVoCollection voList = new ims.core.vo.CareSpellWithoutEpisodesVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.domain.objects.CareSpell domainObject = (ims.core.admin.domain.objects.CareSpell) iterator.next();
			ims.core.vo.CareSpellWithoutEpisodesVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.domain.objects.CareSpell objects.
	 */
	public static ims.core.vo.CareSpellWithoutEpisodesVoCollection createCareSpellWithoutEpisodesVoCollectionFromCareSpell(java.util.List domainObjectList) 
	{
		return createCareSpellWithoutEpisodesVoCollectionFromCareSpell(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.CareSpell objects.
	 */
	public static ims.core.vo.CareSpellWithoutEpisodesVoCollection createCareSpellWithoutEpisodesVoCollectionFromCareSpell(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.CareSpellWithoutEpisodesVoCollection voList = new ims.core.vo.CareSpellWithoutEpisodesVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.CareSpell domainObject = (ims.core.admin.domain.objects.CareSpell) domainObjectList.get(i);
			ims.core.vo.CareSpellWithoutEpisodesVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.domain.objects.CareSpell set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractCareSpellSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CareSpellWithoutEpisodesVoCollection voCollection) 
	 {
	 	return extractCareSpellSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCareSpellSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CareSpellWithoutEpisodesVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.CareSpellWithoutEpisodesVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.CareSpell domainObject = CareSpellWithoutEpisodesVoAssembler.extractCareSpell(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.domain.objects.CareSpell list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractCareSpellList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CareSpellWithoutEpisodesVoCollection voCollection) 
	 {
	 	return extractCareSpellList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCareSpellList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CareSpellWithoutEpisodesVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.CareSpellWithoutEpisodesVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.CareSpell domainObject = CareSpellWithoutEpisodesVoAssembler.extractCareSpell(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.domain.objects.CareSpell object.
	 * @param domainObject ims.core.admin.domain.objects.CareSpell
	 */
	 public static ims.core.vo.CareSpellWithoutEpisodesVo create(ims.core.admin.domain.objects.CareSpell domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.domain.objects.CareSpell object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.CareSpellWithoutEpisodesVo create(DomainObjectMap map, ims.core.admin.domain.objects.CareSpell domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.CareSpellWithoutEpisodesVo valueObject = (ims.core.vo.CareSpellWithoutEpisodesVo) map.getValueObject(domainObject, ims.core.vo.CareSpellWithoutEpisodesVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.CareSpellWithoutEpisodesVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.domain.objects.CareSpell
	 */
	 public static ims.core.vo.CareSpellWithoutEpisodesVo insert(ims.core.vo.CareSpellWithoutEpisodesVo valueObject, ims.core.admin.domain.objects.CareSpell domainObject) 
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
	 * @param domainObject ims.core.admin.domain.objects.CareSpell
	 */
	 public static ims.core.vo.CareSpellWithoutEpisodesVo insert(DomainObjectMap map, ims.core.vo.CareSpellWithoutEpisodesVo valueObject, ims.core.admin.domain.objects.CareSpell domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_CareSpell(domainObject.getId());
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
			
		// CurrentStatus
		valueObject.setCurrentStatus(ims.core.vo.domain.CareSpellStatusHistoryVoAssembler.create(map, domainObject.getCurrentStatus()) );
		// StatusHistory
		valueObject.setStatusHistory(ims.core.vo.domain.CareSpellStatusHistoryVoAssembler.createCareSpellStatusHistoryVoCollectionFromCareSpellStatusHistory(map, domainObject.getStatusHistory()) );
		// StartDate
		java.util.Date StartDate = domainObject.getStartDate();
		if ( null != StartDate ) 
		{
			valueObject.setStartDate(new ims.framework.utils.Date(StartDate) );
		}
		// EndDate
		java.util.Date EndDate = domainObject.getEndDate();
		if ( null != EndDate ) 
		{
			valueObject.setEndDate(new ims.framework.utils.Date(EndDate) );
		}
		// SysInfo
		// set system information
		valueObject.setSysInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// Patient
		if (domainObject.getPatient() != null)
		{
			if(domainObject.getPatient() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPatient();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPatient(new ims.core.patient.vo.PatientRefVo(id, -1));				
			}
			else
			{
				valueObject.setPatient(new ims.core.patient.vo.PatientRefVo(domainObject.getPatient().getId(), domainObject.getPatient().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.CareSpell extractCareSpell(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CareSpellWithoutEpisodesVo valueObject) 
	{
		return 	extractCareSpell(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.CareSpell extractCareSpell(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CareSpellWithoutEpisodesVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_CareSpell();
		ims.core.admin.domain.objects.CareSpell domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.domain.objects.CareSpell)domMap.get(valueObject);
			}
			// ims.core.vo.CareSpellWithoutEpisodesVo ID_CareSpell field is unknown
			domainObject = new ims.core.admin.domain.objects.CareSpell();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_CareSpell());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.domain.objects.CareSpell)domMap.get(key);
			}
			domainObject = (ims.core.admin.domain.objects.CareSpell) domainFactory.getDomainObject(ims.core.admin.domain.objects.CareSpell.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_CareSpell());

		domainObject.setCurrentStatus(ims.core.vo.domain.CareSpellStatusHistoryVoAssembler.extractCareSpellStatusHistory(domainFactory, valueObject.getCurrentStatus(), domMap));
		domainObject.setStatusHistory(ims.core.vo.domain.CareSpellStatusHistoryVoAssembler.extractCareSpellStatusHistoryList(domainFactory, valueObject.getStatusHistory(), domainObject.getStatusHistory(), domMap));		
		java.util.Date value3 = null;
		ims.framework.utils.Date date3 = valueObject.getStartDate();		
		if ( date3 != null ) 
		{
			value3 = date3.getDate();
		}
		domainObject.setStartDate(value3);
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getEndDate();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setEndDate(value4);
		ims.core.patient.domain.objects.Patient value6 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value6 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value6 = domainObject.getPatient();	
			}
			else
			{
				value6 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value6);

		return domainObject;
	}

}
