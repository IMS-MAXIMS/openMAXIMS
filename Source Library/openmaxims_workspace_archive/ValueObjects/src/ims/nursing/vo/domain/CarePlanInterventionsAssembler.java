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
 * Generated on 16/04/2014, 12:32
 *
 */
package ims.nursing.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Sinead McDermott
 */
public class CarePlanInterventionsAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.nursing.vo.CarePlanInterventions copy(ims.nursing.vo.CarePlanInterventions valueObjectDest, ims.nursing.vo.CarePlanInterventions valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CarePlanIntervention(valueObjectSrc.getID_CarePlanIntervention());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Description
		valueObjectDest.setDescription(valueObjectSrc.getDescription());
		// StartDate
		valueObjectDest.setStartDate(valueObjectSrc.getStartDate());
		// StartBy
		valueObjectDest.setStartBy(valueObjectSrc.getStartBy());
		// StopDate
		valueObjectDest.setStopDate(valueObjectSrc.getStopDate());
		// StopBy
		valueObjectDest.setStopBy(valueObjectSrc.getStopBy());
		// Active
		valueObjectDest.setActive(valueObjectSrc.getActive());
		// Order
		valueObjectDest.setOrder(valueObjectSrc.getOrder());
		// InterventionType
		valueObjectDest.setInterventionType(valueObjectSrc.getInterventionType());
		// Frequency
		valueObjectDest.setFrequency(valueObjectSrc.getFrequency());
		// AdditionalInfo
		valueObjectDest.setAdditionalInfo(valueObjectSrc.getAdditionalInfo());
		// isRemoved
		valueObjectDest.setIsRemoved(valueObjectSrc.getIsRemoved());
		// RemovedDate
		valueObjectDest.setRemovedDate(valueObjectSrc.getRemovedDate());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCarePlanInterventionsCollectionFromCarePlanIntervention(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.nursing.careplans.domain.objects.CarePlanIntervention objects.
	 */
	public static ims.nursing.vo.CarePlanInterventionsCollection createCarePlanInterventionsCollectionFromCarePlanIntervention(java.util.Set domainObjectSet)	
	{
		return createCarePlanInterventionsCollectionFromCarePlanIntervention(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.nursing.careplans.domain.objects.CarePlanIntervention objects.
	 */
	public static ims.nursing.vo.CarePlanInterventionsCollection createCarePlanInterventionsCollectionFromCarePlanIntervention(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.nursing.vo.CarePlanInterventionsCollection voList = new ims.nursing.vo.CarePlanInterventionsCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.nursing.careplans.domain.objects.CarePlanIntervention domainObject = (ims.nursing.careplans.domain.objects.CarePlanIntervention) iterator.next();
			ims.nursing.vo.CarePlanInterventions vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.nursing.careplans.domain.objects.CarePlanIntervention objects.
	 */
	public static ims.nursing.vo.CarePlanInterventionsCollection createCarePlanInterventionsCollectionFromCarePlanIntervention(java.util.List domainObjectList) 
	{
		return createCarePlanInterventionsCollectionFromCarePlanIntervention(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.nursing.careplans.domain.objects.CarePlanIntervention objects.
	 */
	public static ims.nursing.vo.CarePlanInterventionsCollection createCarePlanInterventionsCollectionFromCarePlanIntervention(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.nursing.vo.CarePlanInterventionsCollection voList = new ims.nursing.vo.CarePlanInterventionsCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.nursing.careplans.domain.objects.CarePlanIntervention domainObject = (ims.nursing.careplans.domain.objects.CarePlanIntervention) domainObjectList.get(i);
			ims.nursing.vo.CarePlanInterventions vo = create(map, domainObject);

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
	 * Create the ims.nursing.careplans.domain.objects.CarePlanIntervention set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractCarePlanInterventionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.CarePlanInterventionsCollection voCollection) 
	 {
	 	return extractCarePlanInterventionSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCarePlanInterventionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.CarePlanInterventionsCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.CarePlanInterventions vo = voCollection.get(i);
			ims.nursing.careplans.domain.objects.CarePlanIntervention domainObject = CarePlanInterventionsAssembler.extractCarePlanIntervention(domainFactory, vo, domMap);

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
	 * Create the ims.nursing.careplans.domain.objects.CarePlanIntervention list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractCarePlanInterventionList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.CarePlanInterventionsCollection voCollection) 
	 {
	 	return extractCarePlanInterventionList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCarePlanInterventionList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.CarePlanInterventionsCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.CarePlanInterventions vo = voCollection.get(i);
			ims.nursing.careplans.domain.objects.CarePlanIntervention domainObject = CarePlanInterventionsAssembler.extractCarePlanIntervention(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.nursing.careplans.domain.objects.CarePlanIntervention object.
	 * @param domainObject ims.nursing.careplans.domain.objects.CarePlanIntervention
	 */
	 public static ims.nursing.vo.CarePlanInterventions create(ims.nursing.careplans.domain.objects.CarePlanIntervention domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.nursing.careplans.domain.objects.CarePlanIntervention object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.nursing.vo.CarePlanInterventions create(DomainObjectMap map, ims.nursing.careplans.domain.objects.CarePlanIntervention domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.nursing.vo.CarePlanInterventions valueObject = (ims.nursing.vo.CarePlanInterventions) map.getValueObject(domainObject, ims.nursing.vo.CarePlanInterventions.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.nursing.vo.CarePlanInterventions(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.nursing.careplans.domain.objects.CarePlanIntervention
	 */
	 public static ims.nursing.vo.CarePlanInterventions insert(ims.nursing.vo.CarePlanInterventions valueObject, ims.nursing.careplans.domain.objects.CarePlanIntervention domainObject) 
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
	 * @param domainObject ims.nursing.careplans.domain.objects.CarePlanIntervention
	 */
	 public static ims.nursing.vo.CarePlanInterventions insert(DomainObjectMap map, ims.nursing.vo.CarePlanInterventions valueObject, ims.nursing.careplans.domain.objects.CarePlanIntervention domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_CarePlanIntervention(domainObject.getId());
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
			
		// Description
		valueObject.setDescription(domainObject.getDescription());
		// StartDate
		java.util.Date StartDate = domainObject.getStartDate();
		if ( null != StartDate ) 
		{
			valueObject.setStartDate(new ims.framework.utils.Date(StartDate) );
		}
		// StartBy
		valueObject.setStartBy(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getStartBy()) );
		// StopDate
		java.util.Date StopDate = domainObject.getStopDate();
		if ( null != StopDate ) 
		{
			valueObject.setStopDate(new ims.framework.utils.Date(StopDate) );
		}
		// StopBy
		valueObject.setStopBy(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getStopBy()) );
		// Active
		valueObject.setActive( domainObject.isActive() );
		// Order
		valueObject.setOrder(domainObject.getOrder());
		// InterventionType
		ims.domain.lookups.LookupInstance instance8 = domainObject.getInterventionType();
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

			ims.nursing.vo.lookups.CarePlanInterventionManOpt voLookup8 = new ims.nursing.vo.lookups.CarePlanInterventionManOpt(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.nursing.vo.lookups.CarePlanInterventionManOpt parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.nursing.vo.lookups.CarePlanInterventionManOpt(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setInterventionType(voLookup8);
		}
				// Frequency
		ims.domain.lookups.LookupInstance instance9 = domainObject.getFrequency();
		if ( null != instance9 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance9.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance9.getImage().getImageId(), instance9.getImage().getImagePath());
			}
			color = instance9.getColor();
			if (color != null) 
				color.getValue();

			ims.nursing.vo.lookups.CPActionFrequency voLookup9 = new ims.nursing.vo.lookups.CPActionFrequency(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.nursing.vo.lookups.CPActionFrequency parentVoLookup9 = voLookup9;
			ims.domain.lookups.LookupInstance parent9 = instance9.getParent();
			while (parent9 != null)
			{
				if (parent9.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent9.getImage().getImageId(), parent9.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent9.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup9.setParent(new ims.nursing.vo.lookups.CPActionFrequency(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setFrequency(voLookup9);
		}
				// AdditionalInfo
		valueObject.setAdditionalInfo(domainObject.getAdditionalInfo());
		// isRemoved
		valueObject.setIsRemoved( domainObject.isIsRemoved() );
		// RemovedDate
		java.util.Date RemovedDate = domainObject.getRemovedDate();
		if ( null != RemovedDate ) 
		{
			valueObject.setRemovedDate(new ims.framework.utils.Date(RemovedDate) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.nursing.careplans.domain.objects.CarePlanIntervention extractCarePlanIntervention(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.CarePlanInterventions valueObject) 
	{
		return 	extractCarePlanIntervention(domainFactory, valueObject, new HashMap());
	}

	public static ims.nursing.careplans.domain.objects.CarePlanIntervention extractCarePlanIntervention(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.CarePlanInterventions valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_CarePlanIntervention();
		ims.nursing.careplans.domain.objects.CarePlanIntervention domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.nursing.careplans.domain.objects.CarePlanIntervention)domMap.get(valueObject);
			}
			// ims.nursing.vo.CarePlanInterventions ID_CarePlanIntervention field is unknown
			domainObject = new ims.nursing.careplans.domain.objects.CarePlanIntervention();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_CarePlanIntervention());
			if (domMap.get(key) != null)
			{
				return (ims.nursing.careplans.domain.objects.CarePlanIntervention)domMap.get(key);
			}
			domainObject = (ims.nursing.careplans.domain.objects.CarePlanIntervention) domainFactory.getDomainObject(ims.nursing.careplans.domain.objects.CarePlanIntervention.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_CarePlanIntervention());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDescription() != null && valueObject.getDescription().equals(""))
		{
			valueObject.setDescription(null);
		}
		domainObject.setDescription(valueObject.getDescription());
		java.util.Date value2 = null;
		ims.framework.utils.Date date2 = valueObject.getStartDate();		
		if ( date2 != null ) 
		{
			value2 = date2.getDate();
		}
		domainObject.setStartDate(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value3 = null;
		if ( null != valueObject.getStartBy() ) 
		{
			if (valueObject.getStartBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getStartBy()) != null)
				{
					value3 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getStartBy());
				}
			}
			else
			{
				value3 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getStartBy().getBoId());
			}
		}
		domainObject.setStartBy(value3);
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getStopDate();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setStopDate(value4);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value5 = null;
		if ( null != valueObject.getStopBy() ) 
		{
			if (valueObject.getStopBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getStopBy()) != null)
				{
					value5 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getStopBy());
				}
			}
			else
			{
				value5 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getStopBy().getBoId());
			}
		}
		domainObject.setStopBy(value5);
		domainObject.setActive(valueObject.getActive());
		domainObject.setOrder(valueObject.getOrder());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getInterventionType() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getInterventionType().getID());
		}
		domainObject.setInterventionType(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getFrequency() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getFrequency().getID());
		}
		domainObject.setFrequency(value9);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAdditionalInfo() != null && valueObject.getAdditionalInfo().equals(""))
		{
			valueObject.setAdditionalInfo(null);
		}
		domainObject.setAdditionalInfo(valueObject.getAdditionalInfo());
		domainObject.setIsRemoved(valueObject.getIsRemoved());
		java.util.Date value12 = null;
		ims.framework.utils.Date date12 = valueObject.getRemovedDate();		
		if ( date12 != null ) 
		{
			value12 = date12.getDate();
		}
		domainObject.setRemovedDate(value12);

		return domainObject;
	}

}
