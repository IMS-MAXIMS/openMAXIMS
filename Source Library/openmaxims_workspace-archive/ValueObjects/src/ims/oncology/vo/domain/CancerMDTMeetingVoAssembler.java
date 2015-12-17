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
package ims.oncology.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Billy Mahon
 */
public class CancerMDTMeetingVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.oncology.vo.CancerMDTMeetingVo copy(ims.oncology.vo.CancerMDTMeetingVo valueObjectDest, ims.oncology.vo.CancerMDTMeetingVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CancerMDTMeeting(valueObjectSrc.getID_CancerMDTMeeting());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// Date
		valueObjectDest.setDate(valueObjectSrc.getDate());
		// CoMorbidityAssessment
		valueObjectDest.setCoMorbidityAssessment(valueObjectSrc.getCoMorbidityAssessment());
		// Notes
		valueObjectDest.setNotes(valueObjectSrc.getNotes());
		// PatientPerformanceStatus
		valueObjectDest.setPatientPerformanceStatus(valueObjectSrc.getPatientPerformanceStatus());
		// MDTLocation
		valueObjectDest.setMDTLocation(valueObjectSrc.getMDTLocation());
		// AssociatedCarePlan
		valueObjectDest.setAssociatedCarePlan(valueObjectSrc.getAssociatedCarePlan());
		// OthersPresent
		valueObjectDest.setOthersPresent(valueObjectSrc.getOthersPresent());
		// InvitedHCP
		valueObjectDest.setInvitedHCP(valueObjectSrc.getInvitedHCP());
		// EpisodeOfCare
		valueObjectDest.setEpisodeOfCare(valueObjectSrc.getEpisodeOfCare());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCancerMDTMeetingVoCollectionFromCancerMDTMeeting(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.CancerMDTMeeting objects.
	 */
	public static ims.oncology.vo.CancerMDTMeetingVoCollection createCancerMDTMeetingVoCollectionFromCancerMDTMeeting(java.util.Set domainObjectSet)	
	{
		return createCancerMDTMeetingVoCollectionFromCancerMDTMeeting(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.CancerMDTMeeting objects.
	 */
	public static ims.oncology.vo.CancerMDTMeetingVoCollection createCancerMDTMeetingVoCollectionFromCancerMDTMeeting(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.oncology.vo.CancerMDTMeetingVoCollection voList = new ims.oncology.vo.CancerMDTMeetingVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.oncology.domain.objects.CancerMDTMeeting domainObject = (ims.oncology.domain.objects.CancerMDTMeeting) iterator.next();
			ims.oncology.vo.CancerMDTMeetingVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.oncology.domain.objects.CancerMDTMeeting objects.
	 */
	public static ims.oncology.vo.CancerMDTMeetingVoCollection createCancerMDTMeetingVoCollectionFromCancerMDTMeeting(java.util.List domainObjectList) 
	{
		return createCancerMDTMeetingVoCollectionFromCancerMDTMeeting(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.domain.objects.CancerMDTMeeting objects.
	 */
	public static ims.oncology.vo.CancerMDTMeetingVoCollection createCancerMDTMeetingVoCollectionFromCancerMDTMeeting(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.oncology.vo.CancerMDTMeetingVoCollection voList = new ims.oncology.vo.CancerMDTMeetingVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.domain.objects.CancerMDTMeeting domainObject = (ims.oncology.domain.objects.CancerMDTMeeting) domainObjectList.get(i);
			ims.oncology.vo.CancerMDTMeetingVo vo = create(map, domainObject);

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
	 * Create the ims.oncology.domain.objects.CancerMDTMeeting set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractCancerMDTMeetingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.CancerMDTMeetingVoCollection voCollection) 
	 {
	 	return extractCancerMDTMeetingSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCancerMDTMeetingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.CancerMDTMeetingVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.CancerMDTMeetingVo vo = voCollection.get(i);
			ims.oncology.domain.objects.CancerMDTMeeting domainObject = CancerMDTMeetingVoAssembler.extractCancerMDTMeeting(domainFactory, vo, domMap);

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
	 * Create the ims.oncology.domain.objects.CancerMDTMeeting list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractCancerMDTMeetingList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.CancerMDTMeetingVoCollection voCollection) 
	 {
	 	return extractCancerMDTMeetingList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCancerMDTMeetingList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.CancerMDTMeetingVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.CancerMDTMeetingVo vo = voCollection.get(i);
			ims.oncology.domain.objects.CancerMDTMeeting domainObject = CancerMDTMeetingVoAssembler.extractCancerMDTMeeting(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.oncology.domain.objects.CancerMDTMeeting object.
	 * @param domainObject ims.oncology.domain.objects.CancerMDTMeeting
	 */
	 public static ims.oncology.vo.CancerMDTMeetingVo create(ims.oncology.domain.objects.CancerMDTMeeting domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.oncology.domain.objects.CancerMDTMeeting object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.oncology.vo.CancerMDTMeetingVo create(DomainObjectMap map, ims.oncology.domain.objects.CancerMDTMeeting domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.oncology.vo.CancerMDTMeetingVo valueObject = (ims.oncology.vo.CancerMDTMeetingVo) map.getValueObject(domainObject, ims.oncology.vo.CancerMDTMeetingVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.oncology.vo.CancerMDTMeetingVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.oncology.domain.objects.CancerMDTMeeting
	 */
	 public static ims.oncology.vo.CancerMDTMeetingVo insert(ims.oncology.vo.CancerMDTMeetingVo valueObject, ims.oncology.domain.objects.CancerMDTMeeting domainObject) 
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
	 * @param domainObject ims.oncology.domain.objects.CancerMDTMeeting
	 */
	 public static ims.oncology.vo.CancerMDTMeetingVo insert(DomainObjectMap map, ims.oncology.vo.CancerMDTMeetingVo valueObject, ims.oncology.domain.objects.CancerMDTMeeting domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_CancerMDTMeeting(domainObject.getId());
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
		// Date
		java.util.Date Date = domainObject.getDate();
		if ( null != Date ) 
		{
			valueObject.setDate(new ims.framework.utils.Date(Date) );
		}
		// CoMorbidityAssessment
		ims.domain.lookups.LookupInstance instance4 = domainObject.getCoMorbidityAssessment();
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

			ims.oncology.vo.lookups.CoMorbidityAssessment voLookup4 = new ims.oncology.vo.lookups.CoMorbidityAssessment(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.oncology.vo.lookups.CoMorbidityAssessment parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.oncology.vo.lookups.CoMorbidityAssessment(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setCoMorbidityAssessment(voLookup4);
		}
				// Notes
		valueObject.setNotes(domainObject.getNotes());
		// PatientPerformanceStatus
		ims.domain.lookups.LookupInstance instance6 = domainObject.getPatientPerformanceStatus();
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

			ims.oncology.vo.lookups.PatientPerformanceStatus voLookup6 = new ims.oncology.vo.lookups.PatientPerformanceStatus(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.oncology.vo.lookups.PatientPerformanceStatus parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.oncology.vo.lookups.PatientPerformanceStatus(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setPatientPerformanceStatus(voLookup6);
		}
				// MDTLocation
		valueObject.setMDTLocation(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getMDTLocation()) );
		// AssociatedCarePlan
		valueObject.setAssociatedCarePlan(ims.oncology.vo.domain.CancerCarePlanShortVoAssembler.create(map, domainObject.getAssociatedCarePlan()) );
		// OthersPresent
		java.util.List listOthersPresent = domainObject.getOthersPresent();
		String[] OthersPresent = (String[]) listOthersPresent.toArray( new String[listOthersPresent.size()] );
		valueObject.setOthersPresent( OthersPresent );
		// InvitedHCP
		valueObject.setInvitedHCP(ims.oncology.vo.domain.InvitedHCPVoAssembler.createInvitedHCPVoCollectionFromInvitedHCP(map, domainObject.getInvitedHCP()) );
		// EpisodeOfCare
		if (domainObject.getEpisodeOfCare() != null)
		{
			if(domainObject.getEpisodeOfCare() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getEpisodeOfCare();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setEpisodeOfCare(new ims.core.admin.vo.EpisodeOfCareRefVo(id, -1));				
			}
			else
			{
				valueObject.setEpisodeOfCare(new ims.core.admin.vo.EpisodeOfCareRefVo(domainObject.getEpisodeOfCare().getId(), domainObject.getEpisodeOfCare().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.domain.objects.CancerMDTMeeting extractCancerMDTMeeting(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.CancerMDTMeetingVo valueObject) 
	{
		return 	extractCancerMDTMeeting(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.domain.objects.CancerMDTMeeting extractCancerMDTMeeting(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.CancerMDTMeetingVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_CancerMDTMeeting();
		ims.oncology.domain.objects.CancerMDTMeeting domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.oncology.domain.objects.CancerMDTMeeting)domMap.get(valueObject);
			}
			// ims.oncology.vo.CancerMDTMeetingVo ID_CancerMDTMeeting field is unknown
			domainObject = new ims.oncology.domain.objects.CancerMDTMeeting();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_CancerMDTMeeting());
			if (domMap.get(key) != null)
			{
				return (ims.oncology.domain.objects.CancerMDTMeeting)domMap.get(key);
			}
			domainObject = (ims.oncology.domain.objects.CancerMDTMeeting) domainFactory.getDomainObject(ims.oncology.domain.objects.CancerMDTMeeting.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_CancerMDTMeeting());

		ims.core.admin.domain.objects.CareContext value1 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value1 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getCareContext();	
			}
			else
			{
				value1 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value1);
		ims.core.admin.domain.objects.ClinicalContact value2 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value2 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getClinicalContact();	
			}
			else
			{
				value2 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value2);
		java.util.Date value3 = null;
		ims.framework.utils.Date date3 = valueObject.getDate();		
		if ( date3 != null ) 
		{
			value3 = date3.getDate();
		}
		domainObject.setDate(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getCoMorbidityAssessment() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getCoMorbidityAssessment().getID());
		}
		domainObject.setCoMorbidityAssessment(value4);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNotes() != null && valueObject.getNotes().equals(""))
		{
			valueObject.setNotes(null);
		}
		domainObject.setNotes(valueObject.getNotes());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getPatientPerformanceStatus() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getPatientPerformanceStatus().getID());
		}
		domainObject.setPatientPerformanceStatus(value6);
		domainObject.setMDTLocation(ims.core.vo.domain.LocationLiteVoAssembler.extractLocation(domainFactory, valueObject.getMDTLocation(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.domain.objects.CancerCarePlan value8 = null;
		if ( null != valueObject.getAssociatedCarePlan() ) 
		{
			if (valueObject.getAssociatedCarePlan().getBoId() == null)
			{
				if (domMap.get(valueObject.getAssociatedCarePlan()) != null)
				{
					value8 = (ims.oncology.domain.objects.CancerCarePlan)domMap.get(valueObject.getAssociatedCarePlan());
				}
			}
			else
			{
				value8 = (ims.oncology.domain.objects.CancerCarePlan)domainFactory.getDomainObject(ims.oncology.domain.objects.CancerCarePlan.class, valueObject.getAssociatedCarePlan().getBoId());
			}
		}
		domainObject.setAssociatedCarePlan(value8);
		if (valueObject.getOthersPresent() == null)
		{
			valueObject.setOthersPresent(new String[0]);
		}
		
		java.util.List array9 = domainObject.getOthersPresent();
		int i9;
		for (i9=0; i9 < valueObject.getOthersPresent().length; i9++)
		{
			String lstValue = valueObject.getOthersPresent()[i9];
			int idx = array9.indexOf(lstValue);
			if (idx == -1)
				array9.add(i9, lstValue);
			else if (i9 != idx && i9 < array9.size())
			{
				String tmp = (String) array9.get(i9);
				array9.set(i9, lstValue);
				array9.set(idx,tmp);
				
			}
		}
		i9 = array9.size();
		while (i9 > valueObject.getOthersPresent().length)
		{
			array9.remove(i9-1);
			i9 = array9.size();
		}		
		
		domainObject.setOthersPresent(array9);		
		domainObject.setInvitedHCP(ims.oncology.vo.domain.InvitedHCPVoAssembler.extractInvitedHCPSet(domainFactory, valueObject.getInvitedHCP(), domainObject.getInvitedHCP(), domMap));		
		ims.core.admin.domain.objects.EpisodeOfCare value11 = null;
		if ( null != valueObject.getEpisodeOfCare() ) 
		{
			if (valueObject.getEpisodeOfCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisodeOfCare()) != null)
				{
					value11 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisodeOfCare());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value11 = domainObject.getEpisodeOfCare();	
			}
			else
			{
				value11 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisodeOfCare().getBoId());
			}
		}
		domainObject.setEpisodeOfCare(value11);

		return domainObject;
	}

}
