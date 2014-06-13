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
public class CarePlanTemplateInterventionAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.nursing.vo.CarePlanTemplateIntervention copy(ims.nursing.vo.CarePlanTemplateIntervention valueObjectDest, ims.nursing.vo.CarePlanTemplateIntervention valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CarePlanTemplateIntervention(valueObjectSrc.getID_CarePlanTemplateIntervention());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Intervention
		valueObjectDest.setIntervention(valueObjectSrc.getIntervention());
		// InterventionType
		valueObjectDest.setInterventionType(valueObjectSrc.getInterventionType());
		// InterventionNumber
		valueObjectDest.setInterventionNumber(valueObjectSrc.getInterventionNumber());
		// Active
		valueObjectDest.setActive(valueObjectSrc.getActive());
		// DateInactive
		valueObjectDest.setDateInactive(valueObjectSrc.getDateInactive());
		// Frequency
		valueObjectDest.setFrequency(valueObjectSrc.getFrequency());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCarePlanTemplateInterventionCollectionFromCarePlanTemplateIntervention(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.nursing.careplans.domain.objects.CarePlanTemplateIntervention objects.
	 */
	public static ims.nursing.vo.CarePlanTemplateInterventionCollection createCarePlanTemplateInterventionCollectionFromCarePlanTemplateIntervention(java.util.Set domainObjectSet)	
	{
		return createCarePlanTemplateInterventionCollectionFromCarePlanTemplateIntervention(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.nursing.careplans.domain.objects.CarePlanTemplateIntervention objects.
	 */
	public static ims.nursing.vo.CarePlanTemplateInterventionCollection createCarePlanTemplateInterventionCollectionFromCarePlanTemplateIntervention(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.nursing.vo.CarePlanTemplateInterventionCollection voList = new ims.nursing.vo.CarePlanTemplateInterventionCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.nursing.careplans.domain.objects.CarePlanTemplateIntervention domainObject = (ims.nursing.careplans.domain.objects.CarePlanTemplateIntervention) iterator.next();
			ims.nursing.vo.CarePlanTemplateIntervention vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.nursing.careplans.domain.objects.CarePlanTemplateIntervention objects.
	 */
	public static ims.nursing.vo.CarePlanTemplateInterventionCollection createCarePlanTemplateInterventionCollectionFromCarePlanTemplateIntervention(java.util.List domainObjectList) 
	{
		return createCarePlanTemplateInterventionCollectionFromCarePlanTemplateIntervention(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.nursing.careplans.domain.objects.CarePlanTemplateIntervention objects.
	 */
	public static ims.nursing.vo.CarePlanTemplateInterventionCollection createCarePlanTemplateInterventionCollectionFromCarePlanTemplateIntervention(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.nursing.vo.CarePlanTemplateInterventionCollection voList = new ims.nursing.vo.CarePlanTemplateInterventionCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.nursing.careplans.domain.objects.CarePlanTemplateIntervention domainObject = (ims.nursing.careplans.domain.objects.CarePlanTemplateIntervention) domainObjectList.get(i);
			ims.nursing.vo.CarePlanTemplateIntervention vo = create(map, domainObject);

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
	 * Create the ims.nursing.careplans.domain.objects.CarePlanTemplateIntervention set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractCarePlanTemplateInterventionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.CarePlanTemplateInterventionCollection voCollection) 
	 {
	 	return extractCarePlanTemplateInterventionSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCarePlanTemplateInterventionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.CarePlanTemplateInterventionCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.CarePlanTemplateIntervention vo = voCollection.get(i);
			ims.nursing.careplans.domain.objects.CarePlanTemplateIntervention domainObject = CarePlanTemplateInterventionAssembler.extractCarePlanTemplateIntervention(domainFactory, vo, domMap);

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
	 * Create the ims.nursing.careplans.domain.objects.CarePlanTemplateIntervention list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractCarePlanTemplateInterventionList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.CarePlanTemplateInterventionCollection voCollection) 
	 {
	 	return extractCarePlanTemplateInterventionList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCarePlanTemplateInterventionList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.CarePlanTemplateInterventionCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.CarePlanTemplateIntervention vo = voCollection.get(i);
			ims.nursing.careplans.domain.objects.CarePlanTemplateIntervention domainObject = CarePlanTemplateInterventionAssembler.extractCarePlanTemplateIntervention(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.nursing.careplans.domain.objects.CarePlanTemplateIntervention object.
	 * @param domainObject ims.nursing.careplans.domain.objects.CarePlanTemplateIntervention
	 */
	 public static ims.nursing.vo.CarePlanTemplateIntervention create(ims.nursing.careplans.domain.objects.CarePlanTemplateIntervention domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.nursing.careplans.domain.objects.CarePlanTemplateIntervention object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.nursing.vo.CarePlanTemplateIntervention create(DomainObjectMap map, ims.nursing.careplans.domain.objects.CarePlanTemplateIntervention domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.nursing.vo.CarePlanTemplateIntervention valueObject = (ims.nursing.vo.CarePlanTemplateIntervention) map.getValueObject(domainObject, ims.nursing.vo.CarePlanTemplateIntervention.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.nursing.vo.CarePlanTemplateIntervention(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.nursing.careplans.domain.objects.CarePlanTemplateIntervention
	 */
	 public static ims.nursing.vo.CarePlanTemplateIntervention insert(ims.nursing.vo.CarePlanTemplateIntervention valueObject, ims.nursing.careplans.domain.objects.CarePlanTemplateIntervention domainObject) 
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
	 * @param domainObject ims.nursing.careplans.domain.objects.CarePlanTemplateIntervention
	 */
	 public static ims.nursing.vo.CarePlanTemplateIntervention insert(DomainObjectMap map, ims.nursing.vo.CarePlanTemplateIntervention valueObject, ims.nursing.careplans.domain.objects.CarePlanTemplateIntervention domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_CarePlanTemplateIntervention(domainObject.getId());
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
			
		// Intervention
		valueObject.setIntervention(domainObject.getIntervention());
		// InterventionType
		ims.domain.lookups.LookupInstance instance2 = domainObject.getInterventionType();
		if ( null != instance2 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance2.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance2.getImage().getImageId(), instance2.getImage().getImagePath());
			}
			color = instance2.getColor();
			if (color != null) 
				color.getValue();

			ims.nursing.vo.lookups.CarePlanInterventionManOpt voLookup2 = new ims.nursing.vo.lookups.CarePlanInterventionManOpt(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.nursing.vo.lookups.CarePlanInterventionManOpt parentVoLookup2 = voLookup2;
			ims.domain.lookups.LookupInstance parent2 = instance2.getParent();
			while (parent2 != null)
			{
				if (parent2.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent2.getImage().getImageId(), parent2.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent2.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup2.setParent(new ims.nursing.vo.lookups.CarePlanInterventionManOpt(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setInterventionType(voLookup2);
		}
				// InterventionNumber
		valueObject.setInterventionNumber(domainObject.getInterventionNumber());
		// Active
		valueObject.setActive( domainObject.isActive() );
		// DateInactive
		java.util.Date DateInactive = domainObject.getDateInactive();
		if ( null != DateInactive ) 
		{
			valueObject.setDateInactive(new ims.framework.utils.Date(DateInactive) );
		}
		// Frequency
		ims.domain.lookups.LookupInstance instance6 = domainObject.getFrequency();
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

			ims.nursing.vo.lookups.CPActionFrequency voLookup6 = new ims.nursing.vo.lookups.CPActionFrequency(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.nursing.vo.lookups.CPActionFrequency parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.nursing.vo.lookups.CPActionFrequency(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setFrequency(voLookup6);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.nursing.careplans.domain.objects.CarePlanTemplateIntervention extractCarePlanTemplateIntervention(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.CarePlanTemplateIntervention valueObject) 
	{
		return 	extractCarePlanTemplateIntervention(domainFactory, valueObject, new HashMap());
	}

	public static ims.nursing.careplans.domain.objects.CarePlanTemplateIntervention extractCarePlanTemplateIntervention(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.CarePlanTemplateIntervention valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_CarePlanTemplateIntervention();
		ims.nursing.careplans.domain.objects.CarePlanTemplateIntervention domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.nursing.careplans.domain.objects.CarePlanTemplateIntervention)domMap.get(valueObject);
			}
			// ims.nursing.vo.CarePlanTemplateIntervention ID_CarePlanTemplateIntervention field is unknown
			domainObject = new ims.nursing.careplans.domain.objects.CarePlanTemplateIntervention();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_CarePlanTemplateIntervention());
			if (domMap.get(key) != null)
			{
				return (ims.nursing.careplans.domain.objects.CarePlanTemplateIntervention)domMap.get(key);
			}
			domainObject = (ims.nursing.careplans.domain.objects.CarePlanTemplateIntervention) domainFactory.getDomainObject(ims.nursing.careplans.domain.objects.CarePlanTemplateIntervention.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_CarePlanTemplateIntervention());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getIntervention() != null && valueObject.getIntervention().equals(""))
		{
			valueObject.setIntervention(null);
		}
		domainObject.setIntervention(valueObject.getIntervention());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getInterventionType() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getInterventionType().getID());
		}
		domainObject.setInterventionType(value2);
		domainObject.setInterventionNumber(valueObject.getInterventionNumber());
		domainObject.setActive(valueObject.getActive());
		java.util.Date value5 = null;
		ims.framework.utils.Date date5 = valueObject.getDateInactive();		
		if ( date5 != null ) 
		{
			value5 = date5.getDate();
		}
		domainObject.setDateInactive(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getFrequency() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getFrequency().getID());
		}
		domainObject.setFrequency(value6);

		return domainObject;
	}

}
