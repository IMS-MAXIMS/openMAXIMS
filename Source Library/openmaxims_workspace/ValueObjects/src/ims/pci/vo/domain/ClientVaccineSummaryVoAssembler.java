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
 * Generated on 12/10/2015, 13:23
 *
 */
package ims.pci.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author George Cristian Josan
 */
public class ClientVaccineSummaryVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.pci.vo.ClientVaccineSummaryVo copy(ims.pci.vo.ClientVaccineSummaryVo valueObjectDest, ims.pci.vo.ClientVaccineSummaryVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ClientVaccineSummary(valueObjectSrc.getID_ClientVaccineSummary());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Vaccine
		valueObjectDest.setVaccine(valueObjectSrc.getVaccine());
		// StatusHistory
		valueObjectDest.setStatusHistory(valueObjectSrc.getStatusHistory());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createClientVaccineSummaryVoCollectionFromClientVaccineSummary(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.pci.domain.objects.ClientVaccineSummary objects.
	 */
	public static ims.pci.vo.ClientVaccineSummaryVoCollection createClientVaccineSummaryVoCollectionFromClientVaccineSummary(java.util.Set domainObjectSet)	
	{
		return createClientVaccineSummaryVoCollectionFromClientVaccineSummary(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.pci.domain.objects.ClientVaccineSummary objects.
	 */
	public static ims.pci.vo.ClientVaccineSummaryVoCollection createClientVaccineSummaryVoCollectionFromClientVaccineSummary(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.pci.vo.ClientVaccineSummaryVoCollection voList = new ims.pci.vo.ClientVaccineSummaryVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.pci.domain.objects.ClientVaccineSummary domainObject = (ims.pci.domain.objects.ClientVaccineSummary) iterator.next();
			ims.pci.vo.ClientVaccineSummaryVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.pci.domain.objects.ClientVaccineSummary objects.
	 */
	public static ims.pci.vo.ClientVaccineSummaryVoCollection createClientVaccineSummaryVoCollectionFromClientVaccineSummary(java.util.List domainObjectList) 
	{
		return createClientVaccineSummaryVoCollectionFromClientVaccineSummary(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.pci.domain.objects.ClientVaccineSummary objects.
	 */
	public static ims.pci.vo.ClientVaccineSummaryVoCollection createClientVaccineSummaryVoCollectionFromClientVaccineSummary(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.pci.vo.ClientVaccineSummaryVoCollection voList = new ims.pci.vo.ClientVaccineSummaryVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.pci.domain.objects.ClientVaccineSummary domainObject = (ims.pci.domain.objects.ClientVaccineSummary) domainObjectList.get(i);
			ims.pci.vo.ClientVaccineSummaryVo vo = create(map, domainObject);

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
	 * Create the ims.pci.domain.objects.ClientVaccineSummary set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractClientVaccineSummarySet(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ClientVaccineSummaryVoCollection voCollection) 
	 {
	 	return extractClientVaccineSummarySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractClientVaccineSummarySet(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ClientVaccineSummaryVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.pci.vo.ClientVaccineSummaryVo vo = voCollection.get(i);
			ims.pci.domain.objects.ClientVaccineSummary domainObject = ClientVaccineSummaryVoAssembler.extractClientVaccineSummary(domainFactory, vo, domMap);

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
	 * Create the ims.pci.domain.objects.ClientVaccineSummary list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractClientVaccineSummaryList(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ClientVaccineSummaryVoCollection voCollection) 
	 {
	 	return extractClientVaccineSummaryList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractClientVaccineSummaryList(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ClientVaccineSummaryVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.pci.vo.ClientVaccineSummaryVo vo = voCollection.get(i);
			ims.pci.domain.objects.ClientVaccineSummary domainObject = ClientVaccineSummaryVoAssembler.extractClientVaccineSummary(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.pci.domain.objects.ClientVaccineSummary object.
	 * @param domainObject ims.pci.domain.objects.ClientVaccineSummary
	 */
	 public static ims.pci.vo.ClientVaccineSummaryVo create(ims.pci.domain.objects.ClientVaccineSummary domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.pci.domain.objects.ClientVaccineSummary object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.pci.vo.ClientVaccineSummaryVo create(DomainObjectMap map, ims.pci.domain.objects.ClientVaccineSummary domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.pci.vo.ClientVaccineSummaryVo valueObject = (ims.pci.vo.ClientVaccineSummaryVo) map.getValueObject(domainObject, ims.pci.vo.ClientVaccineSummaryVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.pci.vo.ClientVaccineSummaryVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.pci.domain.objects.ClientVaccineSummary
	 */
	 public static ims.pci.vo.ClientVaccineSummaryVo insert(ims.pci.vo.ClientVaccineSummaryVo valueObject, ims.pci.domain.objects.ClientVaccineSummary domainObject) 
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
	 * @param domainObject ims.pci.domain.objects.ClientVaccineSummary
	 */
	 public static ims.pci.vo.ClientVaccineSummaryVo insert(DomainObjectMap map, ims.pci.vo.ClientVaccineSummaryVo valueObject, ims.pci.domain.objects.ClientVaccineSummary domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ClientVaccineSummary(domainObject.getId());
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
			
		// Vaccine
		valueObject.setVaccine(ims.core.vo.domain.VaccineLiteVoAssembler.create(map, domainObject.getVaccine()) );
		// StatusHistory
		valueObject.setStatusHistory(ims.pci.vo.domain.VaccineStatusLiteVoAssembler.createVaccineStatusLiteVoCollectionFromVaccineStatus(map, domainObject.getStatusHistory()) );
		// CurrentStatus
		valueObject.setCurrentStatus(ims.pci.vo.domain.VaccineStatusLiteVoAssembler.create(map, domainObject.getCurrentStatus()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.pci.domain.objects.ClientVaccineSummary extractClientVaccineSummary(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ClientVaccineSummaryVo valueObject) 
	{
		return 	extractClientVaccineSummary(domainFactory, valueObject, new HashMap());
	}

	public static ims.pci.domain.objects.ClientVaccineSummary extractClientVaccineSummary(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ClientVaccineSummaryVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ClientVaccineSummary();
		ims.pci.domain.objects.ClientVaccineSummary domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.pci.domain.objects.ClientVaccineSummary)domMap.get(valueObject);
			}
			// ims.pci.vo.ClientVaccineSummaryVo ID_ClientVaccineSummary field is unknown
			domainObject = new ims.pci.domain.objects.ClientVaccineSummary();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ClientVaccineSummary());
			if (domMap.get(key) != null)
			{
				return (ims.pci.domain.objects.ClientVaccineSummary)domMap.get(key);
			}
			domainObject = (ims.pci.domain.objects.ClientVaccineSummary) domainFactory.getDomainObject(ims.pci.domain.objects.ClientVaccineSummary.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ClientVaccineSummary());

		domainObject.setVaccine(ims.core.vo.domain.VaccineLiteVoAssembler.extractVaccine(domainFactory, valueObject.getVaccine(), domMap));
		domainObject.setStatusHistory(ims.pci.vo.domain.VaccineStatusLiteVoAssembler.extractVaccineStatusSet(domainFactory, valueObject.getStatusHistory(), domainObject.getStatusHistory(), domMap));		
		domainObject.setCurrentStatus(ims.pci.vo.domain.VaccineStatusLiteVoAssembler.extractVaccineStatus(domainFactory, valueObject.getCurrentStatus(), domMap));

		return domainObject;
	}

}
