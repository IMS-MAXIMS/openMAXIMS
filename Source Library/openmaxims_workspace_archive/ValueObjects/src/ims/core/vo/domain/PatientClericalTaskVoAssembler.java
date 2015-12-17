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
 * @author Florin Blindu
 */
public class PatientClericalTaskVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PatientClericalTaskVo copy(ims.core.vo.PatientClericalTaskVo valueObjectDest, ims.core.vo.PatientClericalTaskVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientClericalTask(valueObjectSrc.getID_PatientClericalTask());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// Investigation
		valueObjectDest.setInvestigation(valueObjectSrc.getInvestigation());
		// Requestor
		valueObjectDest.setRequestor(valueObjectSrc.getRequestor());
		// RequestedDateTime
		valueObjectDest.setRequestedDateTime(valueObjectSrc.getRequestedDateTime());
		// AllocatedTo
		valueObjectDest.setAllocatedTo(valueObjectSrc.getAllocatedTo());
		// Comment
		valueObjectDest.setComment(valueObjectSrc.getComment());
		// CompletedBy
		valueObjectDest.setCompletedBy(valueObjectSrc.getCompletedBy());
		// CompletedDateTime
		valueObjectDest.setCompletedDateTime(valueObjectSrc.getCompletedDateTime());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientClericalTaskVoCollectionFromPatientClericalTask(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.PatientClericalTask objects.
	 */
	public static ims.core.vo.PatientClericalTaskVoCollection createPatientClericalTaskVoCollectionFromPatientClericalTask(java.util.Set domainObjectSet)	
	{
		return createPatientClericalTaskVoCollectionFromPatientClericalTask(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.PatientClericalTask objects.
	 */
	public static ims.core.vo.PatientClericalTaskVoCollection createPatientClericalTaskVoCollectionFromPatientClericalTask(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatientClericalTaskVoCollection voList = new ims.core.vo.PatientClericalTaskVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ocrr.orderingresults.domain.objects.PatientClericalTask domainObject = (ims.ocrr.orderingresults.domain.objects.PatientClericalTask) iterator.next();
			ims.core.vo.PatientClericalTaskVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.PatientClericalTask objects.
	 */
	public static ims.core.vo.PatientClericalTaskVoCollection createPatientClericalTaskVoCollectionFromPatientClericalTask(java.util.List domainObjectList) 
	{
		return createPatientClericalTaskVoCollectionFromPatientClericalTask(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.PatientClericalTask objects.
	 */
	public static ims.core.vo.PatientClericalTaskVoCollection createPatientClericalTaskVoCollectionFromPatientClericalTask(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatientClericalTaskVoCollection voList = new ims.core.vo.PatientClericalTaskVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.orderingresults.domain.objects.PatientClericalTask domainObject = (ims.ocrr.orderingresults.domain.objects.PatientClericalTask) domainObjectList.get(i);
			ims.core.vo.PatientClericalTaskVo vo = create(map, domainObject);

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
	 * Create the ims.ocrr.orderingresults.domain.objects.PatientClericalTask set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientClericalTaskSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientClericalTaskVoCollection voCollection) 
	 {
	 	return extractPatientClericalTaskSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientClericalTaskSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientClericalTaskVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientClericalTaskVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.PatientClericalTask domainObject = PatientClericalTaskVoAssembler.extractPatientClericalTask(domainFactory, vo, domMap);

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
	 * Create the ims.ocrr.orderingresults.domain.objects.PatientClericalTask list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientClericalTaskList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientClericalTaskVoCollection voCollection) 
	 {
	 	return extractPatientClericalTaskList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientClericalTaskList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientClericalTaskVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientClericalTaskVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.PatientClericalTask domainObject = PatientClericalTaskVoAssembler.extractPatientClericalTask(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.PatientClericalTask object.
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.PatientClericalTask
	 */
	 public static ims.core.vo.PatientClericalTaskVo create(ims.ocrr.orderingresults.domain.objects.PatientClericalTask domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.PatientClericalTask object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PatientClericalTaskVo create(DomainObjectMap map, ims.ocrr.orderingresults.domain.objects.PatientClericalTask domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PatientClericalTaskVo valueObject = (ims.core.vo.PatientClericalTaskVo) map.getValueObject(domainObject, ims.core.vo.PatientClericalTaskVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PatientClericalTaskVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.PatientClericalTask
	 */
	 public static ims.core.vo.PatientClericalTaskVo insert(ims.core.vo.PatientClericalTaskVo valueObject, ims.ocrr.orderingresults.domain.objects.PatientClericalTask domainObject) 
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
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.PatientClericalTask
	 */
	 public static ims.core.vo.PatientClericalTaskVo insert(DomainObjectMap map, ims.core.vo.PatientClericalTaskVo valueObject, ims.ocrr.orderingresults.domain.objects.PatientClericalTask domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientClericalTask(domainObject.getId());
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
			
		// Patient
		valueObject.setPatient(ims.core.vo.domain.PatientListVoAssembler.create(map, domainObject.getPatient()) );
		// Investigation
		if (domainObject.getInvestigation() != null)
		{
			if(domainObject.getInvestigation() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getInvestigation();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setInvestigation(new ims.ocrr.orderingresults.vo.OrderInvestigationRefVo(id, -1));				
			}
			else
			{
				valueObject.setInvestigation(new ims.ocrr.orderingresults.vo.OrderInvestigationRefVo(domainObject.getInvestigation().getId(), domainObject.getInvestigation().getVersion()));
			}
		}
		// Requestor
		valueObject.setRequestor(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getRequestor()) );
		// RequestedDateTime
		java.util.Date RequestedDateTime = domainObject.getRequestedDateTime();
		if ( null != RequestedDateTime ) 
		{
			valueObject.setRequestedDateTime(new ims.framework.utils.DateTime(RequestedDateTime) );
		}
		// AllocatedTo
		valueObject.setAllocatedTo(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getAllocatedTo()) );
		// Comment
		valueObject.setComment(domainObject.getComment());
		// CompletedBy
		valueObject.setCompletedBy(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getCompletedBy()) );
		// CompletedDateTime
		java.util.Date CompletedDateTime = domainObject.getCompletedDateTime();
		if ( null != CompletedDateTime ) 
		{
			valueObject.setCompletedDateTime(new ims.framework.utils.DateTime(CompletedDateTime) );
		}
		// Status
		ims.domain.lookups.LookupInstance instance9 = domainObject.getStatus();
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

			ims.ocrr.vo.lookups.PatientClericalTaskStatus voLookup9 = new ims.ocrr.vo.lookups.PatientClericalTaskStatus(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.ocrr.vo.lookups.PatientClericalTaskStatus parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.ocrr.vo.lookups.PatientClericalTaskStatus(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setStatus(voLookup9);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.orderingresults.domain.objects.PatientClericalTask extractPatientClericalTask(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientClericalTaskVo valueObject) 
	{
		return 	extractPatientClericalTask(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.orderingresults.domain.objects.PatientClericalTask extractPatientClericalTask(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientClericalTaskVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientClericalTask();
		ims.ocrr.orderingresults.domain.objects.PatientClericalTask domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.PatientClericalTask)domMap.get(valueObject);
			}
			// ims.core.vo.PatientClericalTaskVo ID_PatientClericalTask field is unknown
			domainObject = new ims.ocrr.orderingresults.domain.objects.PatientClericalTask();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientClericalTask());
			if (domMap.get(key) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.PatientClericalTask)domMap.get(key);
			}
			domainObject = (ims.ocrr.orderingresults.domain.objects.PatientClericalTask) domainFactory.getDomainObject(ims.ocrr.orderingresults.domain.objects.PatientClericalTask.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientClericalTask());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.patient.domain.objects.Patient value1 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value1 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else
			{
				value1 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value1);
		ims.ocrr.orderingresults.domain.objects.OrderInvestigation value2 = null;
		if ( null != valueObject.getInvestigation() ) 
		{
			if (valueObject.getInvestigation().getBoId() == null)
			{
				if (domMap.get(valueObject.getInvestigation()) != null)
				{
					value2 = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation)domMap.get(valueObject.getInvestigation());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getInvestigation();	
			}
			else
			{
				value2 = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation)domainFactory.getDomainObject(ims.ocrr.orderingresults.domain.objects.OrderInvestigation.class, valueObject.getInvestigation().getBoId());
			}
		}
		domainObject.setInvestigation(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value3 = null;
		if ( null != valueObject.getRequestor() ) 
		{
			if (valueObject.getRequestor().getBoId() == null)
			{
				if (domMap.get(valueObject.getRequestor()) != null)
				{
					value3 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getRequestor());
				}
			}
			else
			{
				value3 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getRequestor().getBoId());
			}
		}
		domainObject.setRequestor(value3);
		ims.framework.utils.DateTime dateTime4 = valueObject.getRequestedDateTime();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setRequestedDateTime(value4);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value5 = null;
		if ( null != valueObject.getAllocatedTo() ) 
		{
			if (valueObject.getAllocatedTo().getBoId() == null)
			{
				if (domMap.get(valueObject.getAllocatedTo()) != null)
				{
					value5 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getAllocatedTo());
				}
			}
			else
			{
				value5 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getAllocatedTo().getBoId());
			}
		}
		domainObject.setAllocatedTo(value5);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComment() != null && valueObject.getComment().equals(""))
		{
			valueObject.setComment(null);
		}
		domainObject.setComment(valueObject.getComment());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value7 = null;
		if ( null != valueObject.getCompletedBy() ) 
		{
			if (valueObject.getCompletedBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getCompletedBy()) != null)
				{
					value7 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getCompletedBy());
				}
			}
			else
			{
				value7 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getCompletedBy().getBoId());
			}
		}
		domainObject.setCompletedBy(value7);
		ims.framework.utils.DateTime dateTime8 = valueObject.getCompletedDateTime();
		java.util.Date value8 = null;
		if ( dateTime8 != null ) 
		{
			value8 = dateTime8.getJavaDate();
		}
		domainObject.setCompletedDateTime(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value9);

		return domainObject;
	}

}
