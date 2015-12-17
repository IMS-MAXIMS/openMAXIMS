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
package ims.ocrr.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class PACSLaunchAuditVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.PACSLaunchAuditVo copy(ims.ocrr.vo.PACSLaunchAuditVo valueObjectDest, ims.ocrr.vo.PACSLaunchAuditVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PACSLaunchAudit(valueObjectSrc.getID_PACSLaunchAudit());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AccessionNo
		valueObjectDest.setAccessionNo(valueObjectSrc.getAccessionNo());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// LaunchingUser
		valueObjectDest.setLaunchingUser(valueObjectSrc.getLaunchingUser());
		// LaunchDateTime
		valueObjectDest.setLaunchDateTime(valueObjectSrc.getLaunchDateTime());
		// PACSClientType
		valueObjectDest.setPACSClientType(valueObjectSrc.getPACSClientType());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPACSLaunchAuditVoCollectionFromPACSLaunchAudit(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.PACSLaunchAudit objects.
	 */
	public static ims.ocrr.vo.PACSLaunchAuditVoCollection createPACSLaunchAuditVoCollectionFromPACSLaunchAudit(java.util.Set domainObjectSet)	
	{
		return createPACSLaunchAuditVoCollectionFromPACSLaunchAudit(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.PACSLaunchAudit objects.
	 */
	public static ims.ocrr.vo.PACSLaunchAuditVoCollection createPACSLaunchAuditVoCollectionFromPACSLaunchAudit(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.PACSLaunchAuditVoCollection voList = new ims.ocrr.vo.PACSLaunchAuditVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ocrr.orderingresults.domain.objects.PACSLaunchAudit domainObject = (ims.ocrr.orderingresults.domain.objects.PACSLaunchAudit) iterator.next();
			ims.ocrr.vo.PACSLaunchAuditVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.PACSLaunchAudit objects.
	 */
	public static ims.ocrr.vo.PACSLaunchAuditVoCollection createPACSLaunchAuditVoCollectionFromPACSLaunchAudit(java.util.List domainObjectList) 
	{
		return createPACSLaunchAuditVoCollectionFromPACSLaunchAudit(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.PACSLaunchAudit objects.
	 */
	public static ims.ocrr.vo.PACSLaunchAuditVoCollection createPACSLaunchAuditVoCollectionFromPACSLaunchAudit(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.PACSLaunchAuditVoCollection voList = new ims.ocrr.vo.PACSLaunchAuditVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.orderingresults.domain.objects.PACSLaunchAudit domainObject = (ims.ocrr.orderingresults.domain.objects.PACSLaunchAudit) domainObjectList.get(i);
			ims.ocrr.vo.PACSLaunchAuditVo vo = create(map, domainObject);

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
	 * Create the ims.ocrr.orderingresults.domain.objects.PACSLaunchAudit set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPACSLaunchAuditSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.PACSLaunchAuditVoCollection voCollection) 
	 {
	 	return extractPACSLaunchAuditSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPACSLaunchAuditSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.PACSLaunchAuditVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.PACSLaunchAuditVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.PACSLaunchAudit domainObject = PACSLaunchAuditVoAssembler.extractPACSLaunchAudit(domainFactory, vo, domMap);

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
	 * Create the ims.ocrr.orderingresults.domain.objects.PACSLaunchAudit list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPACSLaunchAuditList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.PACSLaunchAuditVoCollection voCollection) 
	 {
	 	return extractPACSLaunchAuditList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPACSLaunchAuditList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.PACSLaunchAuditVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.PACSLaunchAuditVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.PACSLaunchAudit domainObject = PACSLaunchAuditVoAssembler.extractPACSLaunchAudit(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.PACSLaunchAudit object.
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.PACSLaunchAudit
	 */
	 public static ims.ocrr.vo.PACSLaunchAuditVo create(ims.ocrr.orderingresults.domain.objects.PACSLaunchAudit domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.PACSLaunchAudit object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ocrr.vo.PACSLaunchAuditVo create(DomainObjectMap map, ims.ocrr.orderingresults.domain.objects.PACSLaunchAudit domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.PACSLaunchAuditVo valueObject = (ims.ocrr.vo.PACSLaunchAuditVo) map.getValueObject(domainObject, ims.ocrr.vo.PACSLaunchAuditVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.PACSLaunchAuditVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.PACSLaunchAudit
	 */
	 public static ims.ocrr.vo.PACSLaunchAuditVo insert(ims.ocrr.vo.PACSLaunchAuditVo valueObject, ims.ocrr.orderingresults.domain.objects.PACSLaunchAudit domainObject) 
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
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.PACSLaunchAudit
	 */
	 public static ims.ocrr.vo.PACSLaunchAuditVo insert(DomainObjectMap map, ims.ocrr.vo.PACSLaunchAuditVo valueObject, ims.ocrr.orderingresults.domain.objects.PACSLaunchAudit domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PACSLaunchAudit(domainObject.getId());
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
			
		// AccessionNo
		valueObject.setAccessionNo(domainObject.getAccessionNo());
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
		// LaunchingUser
		if (domainObject.getLaunchingUser() != null)
		{
			if(domainObject.getLaunchingUser() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getLaunchingUser();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setLaunchingUser(new ims.core.resource.people.vo.MemberOfStaffRefVo(id, -1));				
			}
			else
			{
				valueObject.setLaunchingUser(new ims.core.resource.people.vo.MemberOfStaffRefVo(domainObject.getLaunchingUser().getId(), domainObject.getLaunchingUser().getVersion()));
			}
		}
		// LaunchDateTime
		java.util.Date LaunchDateTime = domainObject.getLaunchDateTime();
		if ( null != LaunchDateTime ) 
		{
			valueObject.setLaunchDateTime(new ims.framework.utils.DateTime(LaunchDateTime) );
		}
		// PACSClientType
		ims.domain.lookups.LookupInstance instance5 = domainObject.getPACSClientType();
		if ( null != instance5 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance5.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance5.getImage().getImageId(), instance5.getImage().getImagePath());
			}
			color = instance5.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PACSClientType voLookup5 = new ims.core.vo.lookups.PACSClientType(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.PACSClientType parentVoLookup5 = voLookup5;
			ims.domain.lookups.LookupInstance parent5 = instance5.getParent();
			while (parent5 != null)
			{
				if (parent5.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent5.getImage().getImageId(), parent5.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent5.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup5.setParent(new ims.core.vo.lookups.PACSClientType(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setPACSClientType(voLookup5);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.orderingresults.domain.objects.PACSLaunchAudit extractPACSLaunchAudit(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.PACSLaunchAuditVo valueObject) 
	{
		return 	extractPACSLaunchAudit(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.orderingresults.domain.objects.PACSLaunchAudit extractPACSLaunchAudit(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.PACSLaunchAuditVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PACSLaunchAudit();
		ims.ocrr.orderingresults.domain.objects.PACSLaunchAudit domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.PACSLaunchAudit)domMap.get(valueObject);
			}
			// ims.ocrr.vo.PACSLaunchAuditVo ID_PACSLaunchAudit field is unknown
			domainObject = new ims.ocrr.orderingresults.domain.objects.PACSLaunchAudit();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PACSLaunchAudit());
			if (domMap.get(key) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.PACSLaunchAudit)domMap.get(key);
			}
			domainObject = (ims.ocrr.orderingresults.domain.objects.PACSLaunchAudit) domainFactory.getDomainObject(ims.ocrr.orderingresults.domain.objects.PACSLaunchAudit.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PACSLaunchAudit());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAccessionNo() != null && valueObject.getAccessionNo().equals(""))
		{
			valueObject.setAccessionNo(null);
		}
		domainObject.setAccessionNo(valueObject.getAccessionNo());
		ims.core.patient.domain.objects.Patient value2 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value2 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getPatient();	
			}
			else
			{
				value2 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value2);
		ims.core.resource.people.domain.objects.MemberOfStaff value3 = null;
		if ( null != valueObject.getLaunchingUser() ) 
		{
			if (valueObject.getLaunchingUser().getBoId() == null)
			{
				if (domMap.get(valueObject.getLaunchingUser()) != null)
				{
					value3 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getLaunchingUser());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getLaunchingUser();	
			}
			else
			{
				value3 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getLaunchingUser().getBoId());
			}
		}
		domainObject.setLaunchingUser(value3);
		ims.framework.utils.DateTime dateTime4 = valueObject.getLaunchDateTime();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setLaunchDateTime(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getPACSClientType() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getPACSClientType().getID());
		}
		domainObject.setPACSClientType(value5);

		return domainObject;
	}

}
