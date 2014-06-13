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
 * @author Sinead McDermott
 */
public class SupportNetworkFamilyAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.SupportNetworkFamily copy(ims.core.vo.SupportNetworkFamily valueObjectDest, ims.core.vo.SupportNetworkFamily valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_SupportNetworkFamily(valueObjectSrc.getID_SupportNetworkFamily());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CarerName
		valueObjectDest.setCarerName(valueObjectSrc.getCarerName());
		// CarerRelationship
		valueObjectDest.setCarerRelationship(valueObjectSrc.getCarerRelationship());
		// CarerAddress
		valueObjectDest.setCarerAddress(valueObjectSrc.getCarerAddress());
		// CarerHomePhone
		valueObjectDest.setCarerHomePhone(valueObjectSrc.getCarerHomePhone());
		// CarerMobilePhone
		valueObjectDest.setCarerMobilePhone(valueObjectSrc.getCarerMobilePhone());
		// CarerWorkPhone
		valueObjectDest.setCarerWorkPhone(valueObjectSrc.getCarerWorkPhone());
		// CarerEmail
		valueObjectDest.setCarerEmail(valueObjectSrc.getCarerEmail());
		// isMainCarer
		valueObjectDest.setIsMainCarer(valueObjectSrc.getIsMainCarer());
		// EmergencyContactOrder
		valueObjectDest.setEmergencyContactOrder(valueObjectSrc.getEmergencyContactOrder());
		// isCurrentlyActiveFamilySupport
		valueObjectDest.setIsCurrentlyActiveFamilySupport(valueObjectSrc.getIsCurrentlyActiveFamilySupport());
		// SysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
		// DiscussProgress
		valueObjectDest.setDiscussProgress(valueObjectSrc.getDiscussProgress());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// AuthoringInfo
		valueObjectDest.setAuthoringInfo(valueObjectSrc.getAuthoringInfo());
		// FitAndWell
		valueObjectDest.setFitAndWell(valueObjectSrc.getFitAndWell());
		// AwareClientPosition
		valueObjectDest.setAwareClientPosition(valueObjectSrc.getAwareClientPosition());
		// PermissionToContact
		valueObjectDest.setPermissionToContact(valueObjectSrc.getPermissionToContact());
		// RecordingInformation
		valueObjectDest.setRecordingInformation(valueObjectSrc.getRecordingInformation());
		// InactivatingUser
		valueObjectDest.setInactivatingUser(valueObjectSrc.getInactivatingUser());
		// InactivatingDateTime
		valueObjectDest.setInactivatingDateTime(valueObjectSrc.getInactivatingDateTime());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSupportNetworkFamilyCollectionFromSupportNetworkFamily(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.SupportNetworkFamily objects.
	 */
	public static ims.core.vo.SupportNetworkFamilyCollection createSupportNetworkFamilyCollectionFromSupportNetworkFamily(java.util.Set domainObjectSet)	
	{
		return createSupportNetworkFamilyCollectionFromSupportNetworkFamily(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.SupportNetworkFamily objects.
	 */
	public static ims.core.vo.SupportNetworkFamilyCollection createSupportNetworkFamilyCollectionFromSupportNetworkFamily(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.SupportNetworkFamilyCollection voList = new ims.core.vo.SupportNetworkFamilyCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.SupportNetworkFamily domainObject = (ims.core.clinical.domain.objects.SupportNetworkFamily) iterator.next();
			ims.core.vo.SupportNetworkFamily vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.SupportNetworkFamily objects.
	 */
	public static ims.core.vo.SupportNetworkFamilyCollection createSupportNetworkFamilyCollectionFromSupportNetworkFamily(java.util.List domainObjectList) 
	{
		return createSupportNetworkFamilyCollectionFromSupportNetworkFamily(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.SupportNetworkFamily objects.
	 */
	public static ims.core.vo.SupportNetworkFamilyCollection createSupportNetworkFamilyCollectionFromSupportNetworkFamily(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.SupportNetworkFamilyCollection voList = new ims.core.vo.SupportNetworkFamilyCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.SupportNetworkFamily domainObject = (ims.core.clinical.domain.objects.SupportNetworkFamily) domainObjectList.get(i);
			ims.core.vo.SupportNetworkFamily vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.SupportNetworkFamily set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractSupportNetworkFamilySet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.SupportNetworkFamilyCollection voCollection) 
	 {
	 	return extractSupportNetworkFamilySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSupportNetworkFamilySet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.SupportNetworkFamilyCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.SupportNetworkFamily vo = voCollection.get(i);
			ims.core.clinical.domain.objects.SupportNetworkFamily domainObject = SupportNetworkFamilyAssembler.extractSupportNetworkFamily(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.SupportNetworkFamily list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractSupportNetworkFamilyList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.SupportNetworkFamilyCollection voCollection) 
	 {
	 	return extractSupportNetworkFamilyList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSupportNetworkFamilyList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.SupportNetworkFamilyCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.SupportNetworkFamily vo = voCollection.get(i);
			ims.core.clinical.domain.objects.SupportNetworkFamily domainObject = SupportNetworkFamilyAssembler.extractSupportNetworkFamily(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.SupportNetworkFamily object.
	 * @param domainObject ims.core.clinical.domain.objects.SupportNetworkFamily
	 */
	 public static ims.core.vo.SupportNetworkFamily create(ims.core.clinical.domain.objects.SupportNetworkFamily domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.SupportNetworkFamily object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.SupportNetworkFamily create(DomainObjectMap map, ims.core.clinical.domain.objects.SupportNetworkFamily domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.SupportNetworkFamily valueObject = (ims.core.vo.SupportNetworkFamily) map.getValueObject(domainObject, ims.core.vo.SupportNetworkFamily.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.SupportNetworkFamily(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.SupportNetworkFamily
	 */
	 public static ims.core.vo.SupportNetworkFamily insert(ims.core.vo.SupportNetworkFamily valueObject, ims.core.clinical.domain.objects.SupportNetworkFamily domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.SupportNetworkFamily
	 */
	 public static ims.core.vo.SupportNetworkFamily insert(DomainObjectMap map, ims.core.vo.SupportNetworkFamily valueObject, ims.core.clinical.domain.objects.SupportNetworkFamily domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_SupportNetworkFamily(domainObject.getId());
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
			
		// CarerName
		valueObject.setCarerName(domainObject.getCarerName());
		// CarerRelationship
		ims.domain.lookups.LookupInstance instance2 = domainObject.getCarerRelationship();
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

			ims.core.vo.lookups.SupportNetworkRelationship voLookup2 = new ims.core.vo.lookups.SupportNetworkRelationship(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.SupportNetworkRelationship parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.SupportNetworkRelationship(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setCarerRelationship(voLookup2);
		}
				// CarerAddress
		valueObject.setCarerAddress(domainObject.getCarerAddress());
		// CarerHomePhone
		valueObject.setCarerHomePhone(domainObject.getCarerHomePhone());
		// CarerMobilePhone
		valueObject.setCarerMobilePhone(domainObject.getCarerMobilePhone());
		// CarerWorkPhone
		valueObject.setCarerWorkPhone(domainObject.getCarerWorkPhone());
		// CarerEmail
		valueObject.setCarerEmail(domainObject.getCarerEmail());
		// isMainCarer
		valueObject.setIsMainCarer( domainObject.isIsMainCarer() );
		// EmergencyContactOrder
		ims.domain.lookups.LookupInstance instance9 = domainObject.getEmergencyContactOrder();
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

			ims.core.vo.lookups.SupportNetworkEmergencyContact voLookup9 = new ims.core.vo.lookups.SupportNetworkEmergencyContact(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.SupportNetworkEmergencyContact parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.core.vo.lookups.SupportNetworkEmergencyContact(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setEmergencyContactOrder(voLookup9);
		}
				// isCurrentlyActiveFamilySupport
		valueObject.setIsCurrentlyActiveFamilySupport( domainObject.isIsCurrentlyActiveFamilySupport() );
		// SysInfo
		// set system information
		valueObject.setSysInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// DiscussProgress
		valueObject.setDiscussProgress( domainObject.isDiscussProgress() );
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
		// AuthoringInfo
		valueObject.setAuthoringInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInfo()) );
		// FitAndWell
		valueObject.setFitAndWell( domainObject.isFitAndWell() );
		// AwareClientPosition
		valueObject.setAwareClientPosition( domainObject.isAwareClientPosition() );
		// PermissionToContact
		valueObject.setPermissionToContact( domainObject.isPermissionToContact() );
		// RecordingInformation
		valueObject.setRecordingInformation(ims.core.vo.domain.RecordingUserInformationVoAssembler.create(map, domainObject.getRecordingInformation()) );
		// InactivatingUser
		valueObject.setInactivatingUser(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getInactivatingUser()) );
		// InactivatingDateTime
		java.util.Date InactivatingDateTime = domainObject.getInactivatingDateTime();
		if ( null != InactivatingDateTime ) 
		{
			valueObject.setInactivatingDateTime(new ims.framework.utils.DateTime(InactivatingDateTime) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.SupportNetworkFamily extractSupportNetworkFamily(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.SupportNetworkFamily valueObject) 
	{
		return 	extractSupportNetworkFamily(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.SupportNetworkFamily extractSupportNetworkFamily(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.SupportNetworkFamily valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_SupportNetworkFamily();
		ims.core.clinical.domain.objects.SupportNetworkFamily domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.SupportNetworkFamily)domMap.get(valueObject);
			}
			// ims.core.vo.SupportNetworkFamily ID_SupportNetworkFamily field is unknown
			domainObject = new ims.core.clinical.domain.objects.SupportNetworkFamily();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_SupportNetworkFamily());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.SupportNetworkFamily)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.SupportNetworkFamily) domainFactory.getDomainObject(ims.core.clinical.domain.objects.SupportNetworkFamily.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_SupportNetworkFamily());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCarerName() != null && valueObject.getCarerName().equals(""))
		{
			valueObject.setCarerName(null);
		}
		domainObject.setCarerName(valueObject.getCarerName());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getCarerRelationship() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getCarerRelationship().getID());
		}
		domainObject.setCarerRelationship(value2);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCarerAddress() != null && valueObject.getCarerAddress().equals(""))
		{
			valueObject.setCarerAddress(null);
		}
		domainObject.setCarerAddress(valueObject.getCarerAddress());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCarerHomePhone() != null && valueObject.getCarerHomePhone().equals(""))
		{
			valueObject.setCarerHomePhone(null);
		}
		domainObject.setCarerHomePhone(valueObject.getCarerHomePhone());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCarerMobilePhone() != null && valueObject.getCarerMobilePhone().equals(""))
		{
			valueObject.setCarerMobilePhone(null);
		}
		domainObject.setCarerMobilePhone(valueObject.getCarerMobilePhone());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCarerWorkPhone() != null && valueObject.getCarerWorkPhone().equals(""))
		{
			valueObject.setCarerWorkPhone(null);
		}
		domainObject.setCarerWorkPhone(valueObject.getCarerWorkPhone());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCarerEmail() != null && valueObject.getCarerEmail().equals(""))
		{
			valueObject.setCarerEmail(null);
		}
		domainObject.setCarerEmail(valueObject.getCarerEmail());
		domainObject.setIsMainCarer(valueObject.getIsMainCarer());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getEmergencyContactOrder() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getEmergencyContactOrder().getID());
		}
		domainObject.setEmergencyContactOrder(value9);
		domainObject.setIsCurrentlyActiveFamilySupport(valueObject.getIsCurrentlyActiveFamilySupport());
		domainObject.setDiscussProgress(valueObject.getDiscussProgress());
		ims.core.patient.domain.objects.Patient value13 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value13 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value13 = domainObject.getPatient();	
			}
			else
			{
				value13 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value13);
		domainObject.setAuthoringInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInfo(), domMap));
		domainObject.setFitAndWell(valueObject.getFitAndWell());
		domainObject.setAwareClientPosition(valueObject.getAwareClientPosition());
		domainObject.setPermissionToContact(valueObject.getPermissionToContact());
		domainObject.setRecordingInformation(ims.core.vo.domain.RecordingUserInformationVoAssembler.extractRecordingUserInformation(domainFactory, valueObject.getRecordingInformation(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value19 = null;
		if ( null != valueObject.getInactivatingUser() ) 
		{
			if (valueObject.getInactivatingUser().getBoId() == null)
			{
				if (domMap.get(valueObject.getInactivatingUser()) != null)
				{
					value19 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getInactivatingUser());
				}
			}
			else
			{
				value19 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getInactivatingUser().getBoId());
			}
		}
		domainObject.setInactivatingUser(value19);
		ims.framework.utils.DateTime dateTime20 = valueObject.getInactivatingDateTime();
		java.util.Date value20 = null;
		if ( dateTime20 != null ) 
		{
			value20 = dateTime20.getJavaDate();
		}
		domainObject.setInactivatingDateTime(value20);

		return domainObject;
	}

}
