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
package ims.therapies.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Billy Mahon
 */
public class EnvironmentalVisitVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.therapies.vo.EnvironmentalVisitVo copy(ims.therapies.vo.EnvironmentalVisitVo valueObjectDest, ims.therapies.vo.EnvironmentalVisitVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_EnvironmentalVisit(valueObjectSrc.getID_EnvironmentalVisit());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// VisitDate
		valueObjectDest.setVisitDate(valueObjectSrc.getVisitDate());
		// TherapistPresent
		valueObjectDest.setTherapistPresent(valueObjectSrc.getTherapistPresent());
		// OthersPresent
		valueObjectDest.setOthersPresent(valueObjectSrc.getOthersPresent());
		// Occupation
		valueObjectDest.setOccupation(valueObjectSrc.getOccupation());
		// JobRole
		valueObjectDest.setJobRole(valueObjectSrc.getJobRole());
		// Location
		valueObjectDest.setLocation(valueObjectSrc.getLocation());
		// Rooms
		valueObjectDest.setRooms(valueObjectSrc.getRooms());
		// HouseDetails
		valueObjectDest.setHouseDetails(valueObjectSrc.getHouseDetails());
		// VisitSummary
		valueObjectDest.setVisitSummary(valueObjectSrc.getVisitSummary());
		// VisitAssessmentDetails
		valueObjectDest.setVisitAssessmentDetails(valueObjectSrc.getVisitAssessmentDetails());
		// SysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
		// AuthoringCP
		valueObjectDest.setAuthoringCP(valueObjectSrc.getAuthoringCP());
		// AuthoringDateTime
		valueObjectDest.setAuthoringDateTime(valueObjectSrc.getAuthoringDateTime());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createEnvironmentalVisitVoCollectionFromEnvironmentalVisit(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.therapies.homeandenvironmentalvisit.domain.objects.EnvironmentalVisit objects.
	 */
	public static ims.therapies.vo.EnvironmentalVisitVoCollection createEnvironmentalVisitVoCollectionFromEnvironmentalVisit(java.util.Set domainObjectSet)	
	{
		return createEnvironmentalVisitVoCollectionFromEnvironmentalVisit(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.therapies.homeandenvironmentalvisit.domain.objects.EnvironmentalVisit objects.
	 */
	public static ims.therapies.vo.EnvironmentalVisitVoCollection createEnvironmentalVisitVoCollectionFromEnvironmentalVisit(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.therapies.vo.EnvironmentalVisitVoCollection voList = new ims.therapies.vo.EnvironmentalVisitVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.therapies.homeandenvironmentalvisit.domain.objects.EnvironmentalVisit domainObject = (ims.therapies.homeandenvironmentalvisit.domain.objects.EnvironmentalVisit) iterator.next();
			ims.therapies.vo.EnvironmentalVisitVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.therapies.homeandenvironmentalvisit.domain.objects.EnvironmentalVisit objects.
	 */
	public static ims.therapies.vo.EnvironmentalVisitVoCollection createEnvironmentalVisitVoCollectionFromEnvironmentalVisit(java.util.List domainObjectList) 
	{
		return createEnvironmentalVisitVoCollectionFromEnvironmentalVisit(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.therapies.homeandenvironmentalvisit.domain.objects.EnvironmentalVisit objects.
	 */
	public static ims.therapies.vo.EnvironmentalVisitVoCollection createEnvironmentalVisitVoCollectionFromEnvironmentalVisit(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.therapies.vo.EnvironmentalVisitVoCollection voList = new ims.therapies.vo.EnvironmentalVisitVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.therapies.homeandenvironmentalvisit.domain.objects.EnvironmentalVisit domainObject = (ims.therapies.homeandenvironmentalvisit.domain.objects.EnvironmentalVisit) domainObjectList.get(i);
			ims.therapies.vo.EnvironmentalVisitVo vo = create(map, domainObject);

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
	 * Create the ims.therapies.homeandenvironmentalvisit.domain.objects.EnvironmentalVisit set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractEnvironmentalVisitSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.EnvironmentalVisitVoCollection voCollection) 
	 {
	 	return extractEnvironmentalVisitSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractEnvironmentalVisitSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.EnvironmentalVisitVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.EnvironmentalVisitVo vo = voCollection.get(i);
			ims.therapies.homeandenvironmentalvisit.domain.objects.EnvironmentalVisit domainObject = EnvironmentalVisitVoAssembler.extractEnvironmentalVisit(domainFactory, vo, domMap);

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
	 * Create the ims.therapies.homeandenvironmentalvisit.domain.objects.EnvironmentalVisit list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractEnvironmentalVisitList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.EnvironmentalVisitVoCollection voCollection) 
	 {
	 	return extractEnvironmentalVisitList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractEnvironmentalVisitList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.EnvironmentalVisitVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.EnvironmentalVisitVo vo = voCollection.get(i);
			ims.therapies.homeandenvironmentalvisit.domain.objects.EnvironmentalVisit domainObject = EnvironmentalVisitVoAssembler.extractEnvironmentalVisit(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.therapies.homeandenvironmentalvisit.domain.objects.EnvironmentalVisit object.
	 * @param domainObject ims.therapies.homeandenvironmentalvisit.domain.objects.EnvironmentalVisit
	 */
	 public static ims.therapies.vo.EnvironmentalVisitVo create(ims.therapies.homeandenvironmentalvisit.domain.objects.EnvironmentalVisit domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.therapies.homeandenvironmentalvisit.domain.objects.EnvironmentalVisit object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.therapies.vo.EnvironmentalVisitVo create(DomainObjectMap map, ims.therapies.homeandenvironmentalvisit.domain.objects.EnvironmentalVisit domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.therapies.vo.EnvironmentalVisitVo valueObject = (ims.therapies.vo.EnvironmentalVisitVo) map.getValueObject(domainObject, ims.therapies.vo.EnvironmentalVisitVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.therapies.vo.EnvironmentalVisitVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.therapies.homeandenvironmentalvisit.domain.objects.EnvironmentalVisit
	 */
	 public static ims.therapies.vo.EnvironmentalVisitVo insert(ims.therapies.vo.EnvironmentalVisitVo valueObject, ims.therapies.homeandenvironmentalvisit.domain.objects.EnvironmentalVisit domainObject) 
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
	 * @param domainObject ims.therapies.homeandenvironmentalvisit.domain.objects.EnvironmentalVisit
	 */
	 public static ims.therapies.vo.EnvironmentalVisitVo insert(DomainObjectMap map, ims.therapies.vo.EnvironmentalVisitVo valueObject, ims.therapies.homeandenvironmentalvisit.domain.objects.EnvironmentalVisit domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_EnvironmentalVisit(domainObject.getId());
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
			
		// VisitDate
		java.util.Date VisitDate = domainObject.getVisitDate();
		if ( null != VisitDate ) 
		{
			valueObject.setVisitDate(new ims.framework.utils.Date(VisitDate) );
		}
		// TherapistPresent
		valueObject.setTherapistPresent(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getTherapistPresent()) );
		// OthersPresent
		valueObject.setOthersPresent(domainObject.getOthersPresent());
		// Occupation
		valueObject.setOccupation(domainObject.getOccupation());
		// JobRole
		valueObject.setJobRole(domainObject.getJobRole());
		// Location
		ims.domain.lookups.LookupInstance instance6 = domainObject.getLocation();
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

			ims.spinalinjuries.vo.lookups.EnvironmentalVisitLocation voLookup6 = new ims.spinalinjuries.vo.lookups.EnvironmentalVisitLocation(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.EnvironmentalVisitLocation parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.spinalinjuries.vo.lookups.EnvironmentalVisitLocation(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setLocation(voLookup6);
		}
				// Rooms
		valueObject.setRooms(ims.therapies.vo.domain.RoomDetailsVoAssembler.createRoomDetailsVoCollectionFromRoomDetails(map, domainObject.getRooms()) );
		// HouseDetails
		valueObject.setHouseDetails(ims.therapies.vo.domain.HomeDetailsVoAssembler.create(map, domainObject.getHouseDetails()) );
		// VisitSummary
		valueObject.setVisitSummary(ims.therapies.vo.domain.VisitSummaryVoAssembler.create(map, domainObject.getVisitSummary()) );
		// VisitAssessmentDetails
		valueObject.setVisitAssessmentDetails(ims.therapies.vo.domain.VisitAssessmentComponentVoAssembler.createVisitAssessmentComponentVoCollectionFromVisitAssessmentComponent(map, domainObject.getVisitAssessmentDetails()) );
		// SysInfo
		// set system information
		valueObject.setSysInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// AuthoringCP
		valueObject.setAuthoringCP(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getAuthoringCP()) );
		// AuthoringDateTime
		java.util.Date AuthoringDateTime = domainObject.getAuthoringDateTime();
		if ( null != AuthoringDateTime ) 
		{
			valueObject.setAuthoringDateTime(new ims.framework.utils.DateTime(AuthoringDateTime) );
		}
		// CareContext
		if (domainObject.getCareContext() != null)
		{
			if(domainObject.getCareContext() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCareContext();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(id, -1));				
			}
			else
			{
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(domainObject.getCareContext().getId(), domainObject.getCareContext().getVersion()));
			}
		}
		// ClinicalContact
		if (domainObject.getClinicalContact() != null)
		{
			if(domainObject.getClinicalContact() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getClinicalContact();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(id, -1));				
			}
			else
			{
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(domainObject.getClinicalContact().getId(), domainObject.getClinicalContact().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.therapies.homeandenvironmentalvisit.domain.objects.EnvironmentalVisit extractEnvironmentalVisit(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.EnvironmentalVisitVo valueObject) 
	{
		return 	extractEnvironmentalVisit(domainFactory, valueObject, new HashMap());
	}

	public static ims.therapies.homeandenvironmentalvisit.domain.objects.EnvironmentalVisit extractEnvironmentalVisit(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.EnvironmentalVisitVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_EnvironmentalVisit();
		ims.therapies.homeandenvironmentalvisit.domain.objects.EnvironmentalVisit domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.therapies.homeandenvironmentalvisit.domain.objects.EnvironmentalVisit)domMap.get(valueObject);
			}
			// ims.therapies.vo.EnvironmentalVisitVo ID_EnvironmentalVisit field is unknown
			domainObject = new ims.therapies.homeandenvironmentalvisit.domain.objects.EnvironmentalVisit();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_EnvironmentalVisit());
			if (domMap.get(key) != null)
			{
				return (ims.therapies.homeandenvironmentalvisit.domain.objects.EnvironmentalVisit)domMap.get(key);
			}
			domainObject = (ims.therapies.homeandenvironmentalvisit.domain.objects.EnvironmentalVisit) domainFactory.getDomainObject(ims.therapies.homeandenvironmentalvisit.domain.objects.EnvironmentalVisit.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_EnvironmentalVisit());

		java.util.Date value1 = null;
		ims.framework.utils.Date date1 = valueObject.getVisitDate();		
		if ( date1 != null ) 
		{
			value1 = date1.getDate();
		}
		domainObject.setVisitDate(value1);
		domainObject.setTherapistPresent(ims.core.vo.domain.HcpAssembler.extractHcp(domainFactory, valueObject.getTherapistPresent(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOthersPresent() != null && valueObject.getOthersPresent().equals(""))
		{
			valueObject.setOthersPresent(null);
		}
		domainObject.setOthersPresent(valueObject.getOthersPresent());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOccupation() != null && valueObject.getOccupation().equals(""))
		{
			valueObject.setOccupation(null);
		}
		domainObject.setOccupation(valueObject.getOccupation());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getJobRole() != null && valueObject.getJobRole().equals(""))
		{
			valueObject.setJobRole(null);
		}
		domainObject.setJobRole(valueObject.getJobRole());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getLocation() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getLocation().getID());
		}
		domainObject.setLocation(value6);
		domainObject.setRooms(ims.therapies.vo.domain.RoomDetailsVoAssembler.extractRoomDetailsSet(domainFactory, valueObject.getRooms(), domainObject.getRooms(), domMap));		
		domainObject.setHouseDetails(ims.therapies.vo.domain.HomeDetailsVoAssembler.extractHomeDetails(domainFactory, valueObject.getHouseDetails(), domMap));
		domainObject.setVisitSummary(ims.therapies.vo.domain.VisitSummaryVoAssembler.extractVisitSummary(domainFactory, valueObject.getVisitSummary(), domMap));
		domainObject.setVisitAssessmentDetails(ims.therapies.vo.domain.VisitAssessmentComponentVoAssembler.extractVisitAssessmentComponentSet(domainFactory, valueObject.getVisitAssessmentDetails(), domainObject.getVisitAssessmentDetails(), domMap));		
		domainObject.setAuthoringCP(ims.core.vo.domain.HcpAssembler.extractHcp(domainFactory, valueObject.getAuthoringCP(), domMap));
		ims.framework.utils.DateTime dateTime13 = valueObject.getAuthoringDateTime();
		java.util.Date value13 = null;
		if ( dateTime13 != null ) 
		{
			value13 = dateTime13.getJavaDate();
		}
		domainObject.setAuthoringDateTime(value13);
		ims.core.admin.domain.objects.CareContext value14 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value14 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value14 = domainObject.getCareContext();	
			}
			else
			{
				value14 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value14);
		ims.core.admin.domain.objects.ClinicalContact value15 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value15 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value15 = domainObject.getClinicalContact();	
			}
			else
			{
				value15 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value15);

		return domainObject;
	}

}
