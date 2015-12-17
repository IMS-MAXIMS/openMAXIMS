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
 * Generated on 12/10/2015, 13:25
 *
 */
package ims.emergency.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cornel Ventuneac
 */
public class TriageForTrackingWhiteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.TriageForTrackingWhiteVo copy(ims.emergency.vo.TriageForTrackingWhiteVo valueObjectDest, ims.emergency.vo.TriageForTrackingWhiteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Triage(valueObjectSrc.getID_Triage());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// MainPresentingProblem
		valueObjectDest.setMainPresentingProblem(valueObjectSrc.getMainPresentingProblem());
		// Attendance
		valueObjectDest.setAttendance(valueObjectSrc.getAttendance());
		// Episode
		valueObjectDest.setEpisode(valueObjectSrc.getEpisode());
		// CurrentTriagePriority
		valueObjectDest.setCurrentTriagePriority(valueObjectSrc.getCurrentTriagePriority());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTriageForTrackingWhiteVoCollectionFromTriage(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.emergency.domain.objects.Triage objects.
	 */
	public static ims.emergency.vo.TriageForTrackingWhiteVoCollection createTriageForTrackingWhiteVoCollectionFromTriage(java.util.Set domainObjectSet)	
	{
		return createTriageForTrackingWhiteVoCollectionFromTriage(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.emergency.domain.objects.Triage objects.
	 */
	public static ims.emergency.vo.TriageForTrackingWhiteVoCollection createTriageForTrackingWhiteVoCollectionFromTriage(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.TriageForTrackingWhiteVoCollection voList = new ims.emergency.vo.TriageForTrackingWhiteVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.emergency.domain.objects.Triage domainObject = (ims.emergency.domain.objects.Triage) iterator.next();
			ims.emergency.vo.TriageForTrackingWhiteVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.emergency.domain.objects.Triage objects.
	 */
	public static ims.emergency.vo.TriageForTrackingWhiteVoCollection createTriageForTrackingWhiteVoCollectionFromTriage(java.util.List domainObjectList) 
	{
		return createTriageForTrackingWhiteVoCollectionFromTriage(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.emergency.domain.objects.Triage objects.
	 */
	public static ims.emergency.vo.TriageForTrackingWhiteVoCollection createTriageForTrackingWhiteVoCollectionFromTriage(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.TriageForTrackingWhiteVoCollection voList = new ims.emergency.vo.TriageForTrackingWhiteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.emergency.domain.objects.Triage domainObject = (ims.emergency.domain.objects.Triage) domainObjectList.get(i);
			ims.emergency.vo.TriageForTrackingWhiteVo vo = create(map, domainObject);

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
	 * Create the ims.emergency.domain.objects.Triage set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTriageSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TriageForTrackingWhiteVoCollection voCollection) 
	 {
	 	return extractTriageSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTriageSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TriageForTrackingWhiteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.TriageForTrackingWhiteVo vo = voCollection.get(i);
			ims.emergency.domain.objects.Triage domainObject = TriageForTrackingWhiteVoAssembler.extractTriage(domainFactory, vo, domMap);

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
	 * Create the ims.emergency.domain.objects.Triage list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTriageList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TriageForTrackingWhiteVoCollection voCollection) 
	 {
	 	return extractTriageList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTriageList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TriageForTrackingWhiteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.TriageForTrackingWhiteVo vo = voCollection.get(i);
			ims.emergency.domain.objects.Triage domainObject = TriageForTrackingWhiteVoAssembler.extractTriage(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.emergency.domain.objects.Triage object.
	 * @param domainObject ims.emergency.domain.objects.Triage
	 */
	 public static ims.emergency.vo.TriageForTrackingWhiteVo create(ims.emergency.domain.objects.Triage domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.emergency.domain.objects.Triage object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.emergency.vo.TriageForTrackingWhiteVo create(DomainObjectMap map, ims.emergency.domain.objects.Triage domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.TriageForTrackingWhiteVo valueObject = (ims.emergency.vo.TriageForTrackingWhiteVo) map.getValueObject(domainObject, ims.emergency.vo.TriageForTrackingWhiteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.TriageForTrackingWhiteVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.emergency.domain.objects.Triage
	 */
	 public static ims.emergency.vo.TriageForTrackingWhiteVo insert(ims.emergency.vo.TriageForTrackingWhiteVo valueObject, ims.emergency.domain.objects.Triage domainObject) 
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
	 * @param domainObject ims.emergency.domain.objects.Triage
	 */
	 public static ims.emergency.vo.TriageForTrackingWhiteVo insert(DomainObjectMap map, ims.emergency.vo.TriageForTrackingWhiteVo valueObject, ims.emergency.domain.objects.Triage domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Triage(domainObject.getId());
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
			
		// MainPresentingProblem
		valueObject.setMainPresentingProblem(ims.emergency.vo.domain.PatientProblemForClinicianWorklistVoAssembler.create(map, domainObject.getMainPresentingProblem()) );
		// Attendance
		if (domainObject.getAttendance() != null)
		{
			if(domainObject.getAttendance() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAttendance();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAttendance(new ims.core.admin.vo.CareContextRefVo(id, -1));				
			}
			else
			{
				valueObject.setAttendance(new ims.core.admin.vo.CareContextRefVo(domainObject.getAttendance().getId(), domainObject.getAttendance().getVersion()));
			}
		}
		// Episode
		if (domainObject.getEpisode() != null)
		{
			if(domainObject.getEpisode() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getEpisode();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setEpisode(new ims.core.admin.vo.EpisodeOfCareRefVo(id, -1));				
			}
			else
			{
				valueObject.setEpisode(new ims.core.admin.vo.EpisodeOfCareRefVo(domainObject.getEpisode().getId(), domainObject.getEpisode().getVersion()));
			}
		}
		// CurrentTriagePriority
		ims.domain.lookups.LookupInstance instance4 = domainObject.getCurrentTriagePriority();
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

			ims.emergency.vo.lookups.TriagePriority voLookup4 = new ims.emergency.vo.lookups.TriagePriority(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.emergency.vo.lookups.TriagePriority parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.emergency.vo.lookups.TriagePriority(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setCurrentTriagePriority(voLookup4);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.emergency.domain.objects.Triage extractTriage(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TriageForTrackingWhiteVo valueObject) 
	{
		return 	extractTriage(domainFactory, valueObject, new HashMap());
	}

	public static ims.emergency.domain.objects.Triage extractTriage(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TriageForTrackingWhiteVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Triage();
		ims.emergency.domain.objects.Triage domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.emergency.domain.objects.Triage)domMap.get(valueObject);
			}
			// ims.emergency.vo.TriageForTrackingWhiteVo ID_Triage field is unknown
			domainObject = new ims.emergency.domain.objects.Triage();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Triage());
			if (domMap.get(key) != null)
			{
				return (ims.emergency.domain.objects.Triage)domMap.get(key);
			}
			domainObject = (ims.emergency.domain.objects.Triage) domainFactory.getDomainObject(ims.emergency.domain.objects.Triage.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Triage());

		domainObject.setMainPresentingProblem(ims.emergency.vo.domain.PatientProblemForClinicianWorklistVoAssembler.extractPatientProblem(domainFactory, valueObject.getMainPresentingProblem(), domMap));
		ims.core.admin.domain.objects.CareContext value2 = null;
		if ( null != valueObject.getAttendance() ) 
		{
			if (valueObject.getAttendance().getBoId() == null)
			{
				if (domMap.get(valueObject.getAttendance()) != null)
				{
					value2 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getAttendance());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getAttendance();	
			}
			else
			{
				value2 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getAttendance().getBoId());
			}
		}
		domainObject.setAttendance(value2);
		ims.core.admin.domain.objects.EpisodeOfCare value3 = null;
		if ( null != valueObject.getEpisode() ) 
		{
			if (valueObject.getEpisode().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisode()) != null)
				{
					value3 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisode());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getEpisode();	
			}
			else
			{
				value3 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisode().getBoId());
			}
		}
		domainObject.setEpisode(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getCurrentTriagePriority() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getCurrentTriagePriority().getID());
		}
		domainObject.setCurrentTriagePriority(value4);

		return domainObject;
	}

}
