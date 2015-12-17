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
package ims.pci.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author George Cristian Josan
 */
public class ClientScheduleStageVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.pci.vo.ClientScheduleStageVo copy(ims.pci.vo.ClientScheduleStageVo valueObjectDest, ims.pci.vo.ClientScheduleStageVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ClientScheduleStage(valueObjectSrc.getID_ClientScheduleStage());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Stage
		valueObjectDest.setStage(valueObjectSrc.getStage());
		// Vaccines
		valueObjectDest.setVaccines(valueObjectSrc.getVaccines());
		// IsDeleted
		valueObjectDest.setIsDeleted(valueObjectSrc.getIsDeleted());
		// CampaignStartDate
		valueObjectDest.setCampaignStartDate(valueObjectSrc.getCampaignStartDate());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createClientScheduleStageVoCollectionFromClientScheduleStage(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.pci.domain.objects.ClientScheduleStage objects.
	 */
	public static ims.pci.vo.ClientScheduleStageVoCollection createClientScheduleStageVoCollectionFromClientScheduleStage(java.util.Set domainObjectSet)	
	{
		return createClientScheduleStageVoCollectionFromClientScheduleStage(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.pci.domain.objects.ClientScheduleStage objects.
	 */
	public static ims.pci.vo.ClientScheduleStageVoCollection createClientScheduleStageVoCollectionFromClientScheduleStage(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.pci.vo.ClientScheduleStageVoCollection voList = new ims.pci.vo.ClientScheduleStageVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.pci.domain.objects.ClientScheduleStage domainObject = (ims.pci.domain.objects.ClientScheduleStage) iterator.next();
			ims.pci.vo.ClientScheduleStageVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.pci.domain.objects.ClientScheduleStage objects.
	 */
	public static ims.pci.vo.ClientScheduleStageVoCollection createClientScheduleStageVoCollectionFromClientScheduleStage(java.util.List domainObjectList) 
	{
		return createClientScheduleStageVoCollectionFromClientScheduleStage(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.pci.domain.objects.ClientScheduleStage objects.
	 */
	public static ims.pci.vo.ClientScheduleStageVoCollection createClientScheduleStageVoCollectionFromClientScheduleStage(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.pci.vo.ClientScheduleStageVoCollection voList = new ims.pci.vo.ClientScheduleStageVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.pci.domain.objects.ClientScheduleStage domainObject = (ims.pci.domain.objects.ClientScheduleStage) domainObjectList.get(i);
			ims.pci.vo.ClientScheduleStageVo vo = create(map, domainObject);

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
	 * Create the ims.pci.domain.objects.ClientScheduleStage set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractClientScheduleStageSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ClientScheduleStageVoCollection voCollection) 
	 {
	 	return extractClientScheduleStageSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractClientScheduleStageSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ClientScheduleStageVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.pci.vo.ClientScheduleStageVo vo = voCollection.get(i);
			ims.pci.domain.objects.ClientScheduleStage domainObject = ClientScheduleStageVoAssembler.extractClientScheduleStage(domainFactory, vo, domMap);

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
	 * Create the ims.pci.domain.objects.ClientScheduleStage list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractClientScheduleStageList(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ClientScheduleStageVoCollection voCollection) 
	 {
	 	return extractClientScheduleStageList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractClientScheduleStageList(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ClientScheduleStageVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.pci.vo.ClientScheduleStageVo vo = voCollection.get(i);
			ims.pci.domain.objects.ClientScheduleStage domainObject = ClientScheduleStageVoAssembler.extractClientScheduleStage(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.pci.domain.objects.ClientScheduleStage object.
	 * @param domainObject ims.pci.domain.objects.ClientScheduleStage
	 */
	 public static ims.pci.vo.ClientScheduleStageVo create(ims.pci.domain.objects.ClientScheduleStage domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.pci.domain.objects.ClientScheduleStage object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.pci.vo.ClientScheduleStageVo create(DomainObjectMap map, ims.pci.domain.objects.ClientScheduleStage domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.pci.vo.ClientScheduleStageVo valueObject = (ims.pci.vo.ClientScheduleStageVo) map.getValueObject(domainObject, ims.pci.vo.ClientScheduleStageVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.pci.vo.ClientScheduleStageVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.pci.domain.objects.ClientScheduleStage
	 */
	 public static ims.pci.vo.ClientScheduleStageVo insert(ims.pci.vo.ClientScheduleStageVo valueObject, ims.pci.domain.objects.ClientScheduleStage domainObject) 
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
	 * @param domainObject ims.pci.domain.objects.ClientScheduleStage
	 */
	 public static ims.pci.vo.ClientScheduleStageVo insert(DomainObjectMap map, ims.pci.vo.ClientScheduleStageVo valueObject, ims.pci.domain.objects.ClientScheduleStage domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ClientScheduleStage(domainObject.getId());
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
			
		// Stage
		valueObject.setStage(ims.pci.vo.domain.StageConfigurationVoAssembler.create(map, domainObject.getStage()) );
		// Vaccines
		valueObject.setVaccines(ims.pci.vo.domain.ClientScheduleStageVaccineVoAssembler.createClientScheduleStageVaccineVoCollectionFromClientScheduleStageVaccine(map, domainObject.getVaccines()) );
		// IsDeleted
		valueObject.setIsDeleted( domainObject.isIsDeleted() );
		// CampaignStartDate
		java.util.Date CampaignStartDate = domainObject.getCampaignStartDate();
		if ( null != CampaignStartDate ) 
		{
			valueObject.setCampaignStartDate(new ims.framework.utils.Date(CampaignStartDate) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.pci.domain.objects.ClientScheduleStage extractClientScheduleStage(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ClientScheduleStageVo valueObject) 
	{
		return 	extractClientScheduleStage(domainFactory, valueObject, new HashMap());
	}

	public static ims.pci.domain.objects.ClientScheduleStage extractClientScheduleStage(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ClientScheduleStageVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ClientScheduleStage();
		ims.pci.domain.objects.ClientScheduleStage domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.pci.domain.objects.ClientScheduleStage)domMap.get(valueObject);
			}
			// ims.pci.vo.ClientScheduleStageVo ID_ClientScheduleStage field is unknown
			domainObject = new ims.pci.domain.objects.ClientScheduleStage();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ClientScheduleStage());
			if (domMap.get(key) != null)
			{
				return (ims.pci.domain.objects.ClientScheduleStage)domMap.get(key);
			}
			domainObject = (ims.pci.domain.objects.ClientScheduleStage) domainFactory.getDomainObject(ims.pci.domain.objects.ClientScheduleStage.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ClientScheduleStage());

		domainObject.setStage(ims.pci.vo.domain.StageConfigurationVoAssembler.extractStageConfiguration(domainFactory, valueObject.getStage(), domMap));
		domainObject.setVaccines(ims.pci.vo.domain.ClientScheduleStageVaccineVoAssembler.extractClientScheduleStageVaccineSet(domainFactory, valueObject.getVaccines(), domainObject.getVaccines(), domMap));		
		domainObject.setIsDeleted(valueObject.getIsDeleted());
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getCampaignStartDate();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setCampaignStartDate(value4);

		return domainObject;
	}

}
