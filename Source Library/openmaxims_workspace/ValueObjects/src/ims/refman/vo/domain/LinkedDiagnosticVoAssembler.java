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
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class LinkedDiagnosticVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.LinkedDiagnosticVo copy(ims.RefMan.vo.LinkedDiagnosticVo valueObjectDest, ims.RefMan.vo.LinkedDiagnosticVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_LinkedDiagnostic(valueObjectSrc.getID_LinkedDiagnostic());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Diagnostics
		valueObjectDest.setDiagnostics(valueObjectSrc.getDiagnostics());
		// PeriodValue
		valueObjectDest.setPeriodValue(valueObjectSrc.getPeriodValue());
		// PeriodType
		valueObjectDest.setPeriodType(valueObjectSrc.getPeriodType());
		// SameDay
		valueObjectDest.setSameDay(valueObjectSrc.getSameDay());
		// RequestedDate
		valueObjectDest.setRequestedDate(valueObjectSrc.getRequestedDate());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createLinkedDiagnosticVoCollectionFromLinkedDiagnostic(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.LinkedDiagnostic objects.
	 */
	public static ims.RefMan.vo.LinkedDiagnosticVoCollection createLinkedDiagnosticVoCollectionFromLinkedDiagnostic(java.util.Set domainObjectSet)	
	{
		return createLinkedDiagnosticVoCollectionFromLinkedDiagnostic(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.LinkedDiagnostic objects.
	 */
	public static ims.RefMan.vo.LinkedDiagnosticVoCollection createLinkedDiagnosticVoCollectionFromLinkedDiagnostic(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.LinkedDiagnosticVoCollection voList = new ims.RefMan.vo.LinkedDiagnosticVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.LinkedDiagnostic domainObject = (ims.RefMan.domain.objects.LinkedDiagnostic) iterator.next();
			ims.RefMan.vo.LinkedDiagnosticVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.LinkedDiagnostic objects.
	 */
	public static ims.RefMan.vo.LinkedDiagnosticVoCollection createLinkedDiagnosticVoCollectionFromLinkedDiagnostic(java.util.List domainObjectList) 
	{
		return createLinkedDiagnosticVoCollectionFromLinkedDiagnostic(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.LinkedDiagnostic objects.
	 */
	public static ims.RefMan.vo.LinkedDiagnosticVoCollection createLinkedDiagnosticVoCollectionFromLinkedDiagnostic(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.LinkedDiagnosticVoCollection voList = new ims.RefMan.vo.LinkedDiagnosticVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.LinkedDiagnostic domainObject = (ims.RefMan.domain.objects.LinkedDiagnostic) domainObjectList.get(i);
			ims.RefMan.vo.LinkedDiagnosticVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.LinkedDiagnostic set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractLinkedDiagnosticSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.LinkedDiagnosticVoCollection voCollection) 
	 {
	 	return extractLinkedDiagnosticSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractLinkedDiagnosticSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.LinkedDiagnosticVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.LinkedDiagnosticVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.LinkedDiagnostic domainObject = LinkedDiagnosticVoAssembler.extractLinkedDiagnostic(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.LinkedDiagnostic list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractLinkedDiagnosticList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.LinkedDiagnosticVoCollection voCollection) 
	 {
	 	return extractLinkedDiagnosticList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractLinkedDiagnosticList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.LinkedDiagnosticVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.LinkedDiagnosticVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.LinkedDiagnostic domainObject = LinkedDiagnosticVoAssembler.extractLinkedDiagnostic(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.LinkedDiagnostic object.
	 * @param domainObject ims.RefMan.domain.objects.LinkedDiagnostic
	 */
	 public static ims.RefMan.vo.LinkedDiagnosticVo create(ims.RefMan.domain.objects.LinkedDiagnostic domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.LinkedDiagnostic object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.LinkedDiagnosticVo create(DomainObjectMap map, ims.RefMan.domain.objects.LinkedDiagnostic domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.LinkedDiagnosticVo valueObject = (ims.RefMan.vo.LinkedDiagnosticVo) map.getValueObject(domainObject, ims.RefMan.vo.LinkedDiagnosticVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.LinkedDiagnosticVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.LinkedDiagnostic
	 */
	 public static ims.RefMan.vo.LinkedDiagnosticVo insert(ims.RefMan.vo.LinkedDiagnosticVo valueObject, ims.RefMan.domain.objects.LinkedDiagnostic domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.LinkedDiagnostic
	 */
	 public static ims.RefMan.vo.LinkedDiagnosticVo insert(DomainObjectMap map, ims.RefMan.vo.LinkedDiagnosticVo valueObject, ims.RefMan.domain.objects.LinkedDiagnostic domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_LinkedDiagnostic(domainObject.getId());
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
			
		// Diagnostics
		ims.domain.lookups.LookupInstance instance1 = domainObject.getDiagnostics();
		if ( null != instance1 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance1.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance1.getImage().getImageId(), instance1.getImage().getImagePath());
			}
			color = instance1.getColor();
			if (color != null) 
				color.getValue();

			ims.admin.vo.lookups.Diagnostic voLookup1 = new ims.admin.vo.lookups.Diagnostic(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.admin.vo.lookups.Diagnostic parentVoLookup1 = voLookup1;
			ims.domain.lookups.LookupInstance parent1 = instance1.getParent();
			while (parent1 != null)
			{
				if (parent1.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent1.getImage().getImageId(), parent1.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent1.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup1.setParent(new ims.admin.vo.lookups.Diagnostic(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setDiagnostics(voLookup1);
		}
				// PeriodValue
		valueObject.setPeriodValue(domainObject.getPeriodValue());
		// PeriodType
		ims.domain.lookups.LookupInstance instance3 = domainObject.getPeriodType();
		if ( null != instance3 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance3.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance3.getImage().getImageId(), instance3.getImage().getImagePath());
			}
			color = instance3.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.TimeUnitsSecondsToMonths voLookup3 = new ims.core.vo.lookups.TimeUnitsSecondsToMonths(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.TimeUnitsSecondsToMonths parentVoLookup3 = voLookup3;
			ims.domain.lookups.LookupInstance parent3 = instance3.getParent();
			while (parent3 != null)
			{
				if (parent3.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent3.getImage().getImageId(), parent3.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent3.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup3.setParent(new ims.core.vo.lookups.TimeUnitsSecondsToMonths(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setPeriodType(voLookup3);
		}
				// SameDay
		ims.domain.lookups.LookupInstance instance4 = domainObject.getSameDay();
		if ( null != instance4 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance4.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance4.getImage().getImageId(), instance4.getImage().getImagePath());
			}
			color = instance4.getColor();
			if (color != null) 
				color.getValue();

			ims.RefMan.vo.lookups.TriageOutcomeAppointmentDay voLookup4 = new ims.RefMan.vo.lookups.TriageOutcomeAppointmentDay(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.RefMan.vo.lookups.TriageOutcomeAppointmentDay parentVoLookup4 = voLookup4;
			ims.domain.lookups.LookupInstance parent4 = instance4.getParent();
			while (parent4 != null)
			{
				if (parent4.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent4.getImage().getImageId(), parent4.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent4.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup4.setParent(new ims.RefMan.vo.lookups.TriageOutcomeAppointmentDay(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setSameDay(voLookup4);
		}
				// RequestedDate
		java.util.Date RequestedDate = domainObject.getRequestedDate();
		if ( null != RequestedDate ) 
		{
			valueObject.setRequestedDate(new ims.framework.utils.Date(RequestedDate) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.LinkedDiagnostic extractLinkedDiagnostic(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.LinkedDiagnosticVo valueObject) 
	{
		return 	extractLinkedDiagnostic(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.LinkedDiagnostic extractLinkedDiagnostic(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.LinkedDiagnosticVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_LinkedDiagnostic();
		ims.RefMan.domain.objects.LinkedDiagnostic domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.LinkedDiagnostic)domMap.get(valueObject);
			}
			// ims.RefMan.vo.LinkedDiagnosticVo ID_LinkedDiagnostic field is unknown
			domainObject = new ims.RefMan.domain.objects.LinkedDiagnostic();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_LinkedDiagnostic());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.LinkedDiagnostic)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.LinkedDiagnostic) domainFactory.getDomainObject(ims.RefMan.domain.objects.LinkedDiagnostic.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_LinkedDiagnostic());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getDiagnostics() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getDiagnostics().getID());
		}
		domainObject.setDiagnostics(value1);
		domainObject.setPeriodValue(valueObject.getPeriodValue());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getPeriodType() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getPeriodType().getID());
		}
		domainObject.setPeriodType(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getSameDay() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getSameDay().getID());
		}
		domainObject.setSameDay(value4);
		java.util.Date value5 = null;
		ims.framework.utils.Date date5 = valueObject.getRequestedDate();		
		if ( date5 != null ) 
		{
			value5 = date5.getDate();
		}
		domainObject.setRequestedDate(value5);

		return domainObject;
	}

}
