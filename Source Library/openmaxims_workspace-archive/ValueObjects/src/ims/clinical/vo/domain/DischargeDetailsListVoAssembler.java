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
 * @author Rory Fitzpatrick
 */
public class DischargeDetailsListVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.DischargeDetailsListVo copy(ims.clinical.vo.DischargeDetailsListVo valueObjectDest, ims.clinical.vo.DischargeDetailsListVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_DischargeDetails(valueObjectSrc.getID_DischargeDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// DateOfDischarge
		valueObjectDest.setDateOfDischarge(valueObjectSrc.getDateOfDischarge());
		// DischargingWard
		valueObjectDest.setDischargingWard(valueObjectSrc.getDischargingWard());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createDischargeDetailsListVoCollectionFromDischargeDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.edischarge.domain.objects.DischargeDetails objects.
	 */
	public static ims.clinical.vo.DischargeDetailsListVoCollection createDischargeDetailsListVoCollectionFromDischargeDetails(java.util.Set domainObjectSet)	
	{
		return createDischargeDetailsListVoCollectionFromDischargeDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.edischarge.domain.objects.DischargeDetails objects.
	 */
	public static ims.clinical.vo.DischargeDetailsListVoCollection createDischargeDetailsListVoCollectionFromDischargeDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.DischargeDetailsListVoCollection voList = new ims.clinical.vo.DischargeDetailsListVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.edischarge.domain.objects.DischargeDetails domainObject = (ims.edischarge.domain.objects.DischargeDetails) iterator.next();
			ims.clinical.vo.DischargeDetailsListVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.edischarge.domain.objects.DischargeDetails objects.
	 */
	public static ims.clinical.vo.DischargeDetailsListVoCollection createDischargeDetailsListVoCollectionFromDischargeDetails(java.util.List domainObjectList) 
	{
		return createDischargeDetailsListVoCollectionFromDischargeDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.edischarge.domain.objects.DischargeDetails objects.
	 */
	public static ims.clinical.vo.DischargeDetailsListVoCollection createDischargeDetailsListVoCollectionFromDischargeDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.DischargeDetailsListVoCollection voList = new ims.clinical.vo.DischargeDetailsListVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.edischarge.domain.objects.DischargeDetails domainObject = (ims.edischarge.domain.objects.DischargeDetails) domainObjectList.get(i);
			ims.clinical.vo.DischargeDetailsListVo vo = create(map, domainObject);

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
	 * Create the ims.edischarge.domain.objects.DischargeDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractDischargeDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeDetailsListVoCollection voCollection) 
	 {
	 	return extractDischargeDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractDischargeDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeDetailsListVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.DischargeDetailsListVo vo = voCollection.get(i);
			ims.edischarge.domain.objects.DischargeDetails domainObject = DischargeDetailsListVoAssembler.extractDischargeDetails(domainFactory, vo, domMap);

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
	 * Create the ims.edischarge.domain.objects.DischargeDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractDischargeDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeDetailsListVoCollection voCollection) 
	 {
	 	return extractDischargeDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractDischargeDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeDetailsListVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.DischargeDetailsListVo vo = voCollection.get(i);
			ims.edischarge.domain.objects.DischargeDetails domainObject = DischargeDetailsListVoAssembler.extractDischargeDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.edischarge.domain.objects.DischargeDetails object.
	 * @param domainObject ims.edischarge.domain.objects.DischargeDetails
	 */
	 public static ims.clinical.vo.DischargeDetailsListVo create(ims.edischarge.domain.objects.DischargeDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.edischarge.domain.objects.DischargeDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.DischargeDetailsListVo create(DomainObjectMap map, ims.edischarge.domain.objects.DischargeDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.DischargeDetailsListVo valueObject = (ims.clinical.vo.DischargeDetailsListVo) map.getValueObject(domainObject, ims.clinical.vo.DischargeDetailsListVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.DischargeDetailsListVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.edischarge.domain.objects.DischargeDetails
	 */
	 public static ims.clinical.vo.DischargeDetailsListVo insert(ims.clinical.vo.DischargeDetailsListVo valueObject, ims.edischarge.domain.objects.DischargeDetails domainObject) 
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
	 * @param domainObject ims.edischarge.domain.objects.DischargeDetails
	 */
	 public static ims.clinical.vo.DischargeDetailsListVo insert(DomainObjectMap map, ims.clinical.vo.DischargeDetailsListVo valueObject, ims.edischarge.domain.objects.DischargeDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_DischargeDetails(domainObject.getId());
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
			
		// DateOfDischarge
		java.util.Date DateOfDischarge = domainObject.getDateOfDischarge();
		if ( null != DateOfDischarge ) 
		{
			valueObject.setDateOfDischarge(new ims.framework.utils.DateTime(DateOfDischarge) );
		}
		// DischargingWard
		valueObject.setDischargingWard(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getDischargingWard()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.edischarge.domain.objects.DischargeDetails extractDischargeDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeDetailsListVo valueObject) 
	{
		return 	extractDischargeDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.edischarge.domain.objects.DischargeDetails extractDischargeDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeDetailsListVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_DischargeDetails();
		ims.edischarge.domain.objects.DischargeDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.edischarge.domain.objects.DischargeDetails)domMap.get(valueObject);
			}
			// ims.clinical.vo.DischargeDetailsListVo ID_DischargeDetails field is unknown
			domainObject = new ims.edischarge.domain.objects.DischargeDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_DischargeDetails());
			if (domMap.get(key) != null)
			{
				return (ims.edischarge.domain.objects.DischargeDetails)domMap.get(key);
			}
			domainObject = (ims.edischarge.domain.objects.DischargeDetails) domainFactory.getDomainObject(ims.edischarge.domain.objects.DischargeDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_DischargeDetails());

		ims.framework.utils.DateTime dateTime1 = valueObject.getDateOfDischarge();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setDateOfDischarge(value1);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value2 = null;
		if ( null != valueObject.getDischargingWard() ) 
		{
			if (valueObject.getDischargingWard().getBoId() == null)
			{
				if (domMap.get(valueObject.getDischargingWard()) != null)
				{
					value2 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getDischargingWard());
				}
			}
			else
			{
				value2 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getDischargingWard().getBoId());
			}
		}
		domainObject.setDischargingWard(value2);

		return domainObject;
	}

}
