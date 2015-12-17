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
package ims.coe.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Sinead McDermott
 */
public class DischargeAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.coe.vo.Discharge copy(ims.coe.vo.Discharge valueObjectDest, ims.coe.vo.Discharge valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Discharge(valueObjectSrc.getID_Discharge());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// DateCommenced
		valueObjectDest.setDateCommenced(valueObjectSrc.getDateCommenced());
		// Destination
		valueObjectDest.setDestination(valueObjectSrc.getDestination());
		// DateTimeDischarged
		valueObjectDest.setDateTimeDischarged(valueObjectSrc.getDateTimeDischarged());
		// HCP
		valueObjectDest.setHCP(valueObjectSrc.getHCP());
		// Notes
		valueObjectDest.setNotes(valueObjectSrc.getNotes());
		// Actions
		valueObjectDest.setActions(valueObjectSrc.getActions());
		// Assessment
		valueObjectDest.setAssessment(valueObjectSrc.getAssessment());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createDischargeCollectionFromDischarge(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.Discharge objects.
	 */
	public static ims.coe.vo.DischargeCollection createDischargeCollectionFromDischarge(java.util.Set domainObjectSet)	
	{
		return createDischargeCollectionFromDischarge(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.Discharge objects.
	 */
	public static ims.coe.vo.DischargeCollection createDischargeCollectionFromDischarge(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.coe.vo.DischargeCollection voList = new ims.coe.vo.DischargeCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.Discharge domainObject = (ims.clinical.domain.objects.Discharge) iterator.next();
			ims.coe.vo.Discharge vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.Discharge objects.
	 */
	public static ims.coe.vo.DischargeCollection createDischargeCollectionFromDischarge(java.util.List domainObjectList) 
	{
		return createDischargeCollectionFromDischarge(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.Discharge objects.
	 */
	public static ims.coe.vo.DischargeCollection createDischargeCollectionFromDischarge(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.coe.vo.DischargeCollection voList = new ims.coe.vo.DischargeCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.Discharge domainObject = (ims.clinical.domain.objects.Discharge) domainObjectList.get(i);
			ims.coe.vo.Discharge vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.Discharge set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractDischargeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.DischargeCollection voCollection) 
	 {
	 	return extractDischargeSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractDischargeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.DischargeCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.coe.vo.Discharge vo = voCollection.get(i);
			ims.clinical.domain.objects.Discharge domainObject = DischargeAssembler.extractDischarge(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.Discharge list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractDischargeList(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.DischargeCollection voCollection) 
	 {
	 	return extractDischargeList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractDischargeList(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.DischargeCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.coe.vo.Discharge vo = voCollection.get(i);
			ims.clinical.domain.objects.Discharge domainObject = DischargeAssembler.extractDischarge(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.Discharge object.
	 * @param domainObject ims.clinical.domain.objects.Discharge
	 */
	 public static ims.coe.vo.Discharge create(ims.clinical.domain.objects.Discharge domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.Discharge object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.coe.vo.Discharge create(DomainObjectMap map, ims.clinical.domain.objects.Discharge domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.coe.vo.Discharge valueObject = (ims.coe.vo.Discharge) map.getValueObject(domainObject, ims.coe.vo.Discharge.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.coe.vo.Discharge(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.Discharge
	 */
	 public static ims.coe.vo.Discharge insert(ims.coe.vo.Discharge valueObject, ims.clinical.domain.objects.Discharge domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.Discharge
	 */
	 public static ims.coe.vo.Discharge insert(DomainObjectMap map, ims.coe.vo.Discharge valueObject, ims.clinical.domain.objects.Discharge domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Discharge(domainObject.getId());
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
			
		// DateCommenced
		java.util.Date DateCommenced = domainObject.getDateCommenced();
		if ( null != DateCommenced ) 
		{
			valueObject.setDateCommenced(new ims.framework.utils.Date(DateCommenced) );
		}
		// Destination
		ims.domain.lookups.LookupInstance instance2 = domainObject.getDestination();
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

			ims.coe.vo.lookups.DischargeDestination voLookup2 = new ims.coe.vo.lookups.DischargeDestination(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.coe.vo.lookups.DischargeDestination parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.coe.vo.lookups.DischargeDestination(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setDestination(voLookup2);
		}
				// DateTimeDischarged
		java.util.Date DateTimeDischarged = domainObject.getDateTimeDischarged();
		if ( null != DateTimeDischarged ) 
		{
			valueObject.setDateTimeDischarged(new ims.framework.utils.DateTime(DateTimeDischarged) );
		}
		// HCP
		valueObject.setHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getHCP()) );
		// Notes
		valueObject.setNotes(domainObject.getNotes());
		// Actions
		valueObject.setActions(ims.coe.vo.domain.DischargeActionsAssembler.createDischargeActionsCollectionFromActions(map, domainObject.getActions()) );
		// Assessment
		valueObject.setAssessment(ims.coe.vo.domain.DischargeAssessmentAssembler.create(map, domainObject.getAssessment()) );
		// CareContext
		valueObject.setCareContext(ims.core.vo.domain.CareContextShortVoAssembler.create(map, domainObject.getCareContext()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.Discharge extractDischarge(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.Discharge valueObject) 
	{
		return 	extractDischarge(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.Discharge extractDischarge(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.Discharge valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Discharge();
		ims.clinical.domain.objects.Discharge domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.Discharge)domMap.get(valueObject);
			}
			// ims.coe.vo.Discharge ID_Discharge field is unknown
			domainObject = new ims.clinical.domain.objects.Discharge();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Discharge());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.Discharge)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.Discharge) domainFactory.getDomainObject(ims.clinical.domain.objects.Discharge.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Discharge());

		java.util.Date value1 = null;
		ims.framework.utils.Date date1 = valueObject.getDateCommenced();		
		if ( date1 != null ) 
		{
			value1 = date1.getDate();
		}
		domainObject.setDateCommenced(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getDestination() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getDestination().getID());
		}
		domainObject.setDestination(value2);
		ims.framework.utils.DateTime dateTime3 = valueObject.getDateTimeDischarged();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setDateTimeDischarged(value3);
		domainObject.setHCP(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getHCP(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNotes() != null && valueObject.getNotes().equals(""))
		{
			valueObject.setNotes(null);
		}
		domainObject.setNotes(valueObject.getNotes());
		domainObject.setActions(ims.coe.vo.domain.DischargeActionsAssembler.extractActionsSet(domainFactory, valueObject.getActions(), domainObject.getActions(), domMap));		
		domainObject.setAssessment(ims.coe.vo.domain.DischargeAssessmentAssembler.extractDischargeAssessment(domainFactory, valueObject.getAssessment(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.CareContext value8 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value8 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else
			{
				value8 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value8);

		return domainObject;
	}

}
