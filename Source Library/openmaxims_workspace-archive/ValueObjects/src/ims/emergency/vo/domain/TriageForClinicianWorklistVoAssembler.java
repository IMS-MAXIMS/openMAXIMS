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
package ims.emergency.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class TriageForClinicianWorklistVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.TriageForClinicianWorklistVo copy(ims.emergency.vo.TriageForClinicianWorklistVo valueObjectDest, ims.emergency.vo.TriageForClinicianWorklistVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Triage(valueObjectSrc.getID_Triage());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// Episode
		valueObjectDest.setEpisode(valueObjectSrc.getEpisode());
		// Attendance
		valueObjectDest.setAttendance(valueObjectSrc.getAttendance());
		// TrackingArea
		valueObjectDest.setTrackingArea(valueObjectSrc.getTrackingArea());
		// TriageCompletionTime
		valueObjectDest.setTriageCompletionTime(valueObjectSrc.getTriageCompletionTime());
		// CurrentTriageAssessment
		valueObjectDest.setCurrentTriageAssessment(valueObjectSrc.getCurrentTriageAssessment());
		// CurrentTriagePathway
		valueObjectDest.setCurrentTriagePathway(valueObjectSrc.getCurrentTriagePathway());
		// CurrentTriagePriority
		valueObjectDest.setCurrentTriagePriority(valueObjectSrc.getCurrentTriagePriority());
		// MainPresentingProblem
		valueObjectDest.setMainPresentingProblem(valueObjectSrc.getMainPresentingProblem());
		// TriageStartDateTime
		valueObjectDest.setTriageStartDateTime(valueObjectSrc.getTriageStartDateTime());
		// MedicInterventionStartDateTime
		valueObjectDest.setMedicInterventionStartDateTime(valueObjectSrc.getMedicInterventionStartDateTime());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTriageForClinicianWorklistVoCollectionFromTriage(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.emergency.domain.objects.Triage objects.
	 */
	public static ims.emergency.vo.TriageForClinicianWorklistVoCollection createTriageForClinicianWorklistVoCollectionFromTriage(java.util.Set domainObjectSet)	
	{
		return createTriageForClinicianWorklistVoCollectionFromTriage(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.emergency.domain.objects.Triage objects.
	 */
	public static ims.emergency.vo.TriageForClinicianWorklistVoCollection createTriageForClinicianWorklistVoCollectionFromTriage(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.TriageForClinicianWorklistVoCollection voList = new ims.emergency.vo.TriageForClinicianWorklistVoCollection();
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
			ims.emergency.vo.TriageForClinicianWorklistVo vo = create(map, domainObject);
			
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
	public static ims.emergency.vo.TriageForClinicianWorklistVoCollection createTriageForClinicianWorklistVoCollectionFromTriage(java.util.List domainObjectList) 
	{
		return createTriageForClinicianWorklistVoCollectionFromTriage(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.emergency.domain.objects.Triage objects.
	 */
	public static ims.emergency.vo.TriageForClinicianWorklistVoCollection createTriageForClinicianWorklistVoCollectionFromTriage(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.TriageForClinicianWorklistVoCollection voList = new ims.emergency.vo.TriageForClinicianWorklistVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.emergency.domain.objects.Triage domainObject = (ims.emergency.domain.objects.Triage) domainObjectList.get(i);
			ims.emergency.vo.TriageForClinicianWorklistVo vo = create(map, domainObject);

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
	 public static java.util.Set extractTriageSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TriageForClinicianWorklistVoCollection voCollection) 
	 {
	 	return extractTriageSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTriageSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TriageForClinicianWorklistVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.TriageForClinicianWorklistVo vo = voCollection.get(i);
			ims.emergency.domain.objects.Triage domainObject = TriageForClinicianWorklistVoAssembler.extractTriage(domainFactory, vo, domMap);

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
	 public static java.util.List extractTriageList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TriageForClinicianWorklistVoCollection voCollection) 
	 {
	 	return extractTriageList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTriageList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TriageForClinicianWorklistVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.TriageForClinicianWorklistVo vo = voCollection.get(i);
			ims.emergency.domain.objects.Triage domainObject = TriageForClinicianWorklistVoAssembler.extractTriage(domainFactory, vo, domMap);

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
	 public static ims.emergency.vo.TriageForClinicianWorklistVo create(ims.emergency.domain.objects.Triage domainObject) 
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
	  public static ims.emergency.vo.TriageForClinicianWorklistVo create(DomainObjectMap map, ims.emergency.domain.objects.Triage domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.TriageForClinicianWorklistVo valueObject = (ims.emergency.vo.TriageForClinicianWorklistVo) map.getValueObject(domainObject, ims.emergency.vo.TriageForClinicianWorklistVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.TriageForClinicianWorklistVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.emergency.vo.TriageForClinicianWorklistVo insert(ims.emergency.vo.TriageForClinicianWorklistVo valueObject, ims.emergency.domain.objects.Triage domainObject) 
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
	 public static ims.emergency.vo.TriageForClinicianWorklistVo insert(DomainObjectMap map, ims.emergency.vo.TriageForClinicianWorklistVo valueObject, ims.emergency.domain.objects.Triage domainObject) 
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
		// TrackingArea
		if (domainObject.getTrackingArea() != null)
		{
			if(domainObject.getTrackingArea() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getTrackingArea();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setTrackingArea(new ims.emergency.configuration.vo.TrackingAreaRefVo(id, -1));				
			}
			else
			{
				valueObject.setTrackingArea(new ims.emergency.configuration.vo.TrackingAreaRefVo(domainObject.getTrackingArea().getId(), domainObject.getTrackingArea().getVersion()));
			}
		}
		// TriageCompletionTime
		java.util.Date TriageCompletionTime = domainObject.getTriageCompletionTime();
		if ( null != TriageCompletionTime ) 
		{
			valueObject.setTriageCompletionTime(new ims.framework.utils.DateTime(TriageCompletionTime) );
		}
		// CurrentTriageAssessment
		valueObject.setCurrentTriageAssessment(ims.emergency.vo.domain.TriageProtocolAssessmentForTriageVoAssembler.create(map, domainObject.getCurrentTriageAssessment()) );
		// CurrentTriagePathway
		if (domainObject.getCurrentTriagePathway() != null)
		{
			if(domainObject.getCurrentTriagePathway() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCurrentTriagePathway();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCurrentTriagePathway(new ims.icps.instantiation.vo.PatientICPRefVo(id, -1));				
			}
			else
			{
				valueObject.setCurrentTriagePathway(new ims.icps.instantiation.vo.PatientICPRefVo(domainObject.getCurrentTriagePathway().getId(), domainObject.getCurrentTriagePathway().getVersion()));
			}
		}
		// CurrentTriagePriority
		ims.domain.lookups.LookupInstance instance8 = domainObject.getCurrentTriagePriority();
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

			ims.emergency.vo.lookups.TriagePriority voLookup8 = new ims.emergency.vo.lookups.TriagePriority(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.emergency.vo.lookups.TriagePriority parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.emergency.vo.lookups.TriagePriority(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setCurrentTriagePriority(voLookup8);
		}
				// MainPresentingProblem
		valueObject.setMainPresentingProblem(ims.emergency.vo.domain.PatientProblemForClinicianWorklistVoAssembler.create(map, domainObject.getMainPresentingProblem()) );
		// TriageStartDateTime
		java.util.Date TriageStartDateTime = domainObject.getTriageStartDateTime();
		if ( null != TriageStartDateTime ) 
		{
			valueObject.setTriageStartDateTime(new ims.framework.utils.DateTime(TriageStartDateTime) );
		}
		// MedicInterventionStartDateTime
		java.util.Date MedicInterventionStartDateTime = domainObject.getMedicInterventionStartDateTime();
		if ( null != MedicInterventionStartDateTime ) 
		{
			valueObject.setMedicInterventionStartDateTime(new ims.framework.utils.DateTime(MedicInterventionStartDateTime) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.emergency.domain.objects.Triage extractTriage(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TriageForClinicianWorklistVo valueObject) 
	{
		return 	extractTriage(domainFactory, valueObject, new HashMap());
	}

	public static ims.emergency.domain.objects.Triage extractTriage(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TriageForClinicianWorklistVo valueObject, HashMap domMap) 
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
			// ims.emergency.vo.TriageForClinicianWorklistVo ID_Triage field is unknown
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
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getPatient();	
			}
			else
			{
				value1 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value1);
		ims.core.admin.domain.objects.EpisodeOfCare value2 = null;
		if ( null != valueObject.getEpisode() ) 
		{
			if (valueObject.getEpisode().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisode()) != null)
				{
					value2 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisode());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getEpisode();	
			}
			else
			{
				value2 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisode().getBoId());
			}
		}
		domainObject.setEpisode(value2);
		ims.core.admin.domain.objects.CareContext value3 = null;
		if ( null != valueObject.getAttendance() ) 
		{
			if (valueObject.getAttendance().getBoId() == null)
			{
				if (domMap.get(valueObject.getAttendance()) != null)
				{
					value3 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getAttendance());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getAttendance();	
			}
			else
			{
				value3 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getAttendance().getBoId());
			}
		}
		domainObject.setAttendance(value3);
		ims.emergency.configuration.domain.objects.TrackingArea value4 = null;
		if ( null != valueObject.getTrackingArea() ) 
		{
			if (valueObject.getTrackingArea().getBoId() == null)
			{
				if (domMap.get(valueObject.getTrackingArea()) != null)
				{
					value4 = (ims.emergency.configuration.domain.objects.TrackingArea)domMap.get(valueObject.getTrackingArea());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getTrackingArea();	
			}
			else
			{
				value4 = (ims.emergency.configuration.domain.objects.TrackingArea)domainFactory.getDomainObject(ims.emergency.configuration.domain.objects.TrackingArea.class, valueObject.getTrackingArea().getBoId());
			}
		}
		domainObject.setTrackingArea(value4);
		ims.framework.utils.DateTime dateTime5 = valueObject.getTriageCompletionTime();
		java.util.Date value5 = null;
		if ( dateTime5 != null ) 
		{
			value5 = dateTime5.getJavaDate();
		}
		domainObject.setTriageCompletionTime(value5);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.emergency.domain.objects.TriageProtocolAssessment value6 = null;
		if ( null != valueObject.getCurrentTriageAssessment() ) 
		{
			if (valueObject.getCurrentTriageAssessment().getBoId() == null)
			{
				if (domMap.get(valueObject.getCurrentTriageAssessment()) != null)
				{
					value6 = (ims.emergency.domain.objects.TriageProtocolAssessment)domMap.get(valueObject.getCurrentTriageAssessment());
				}
			}
			else
			{
				value6 = (ims.emergency.domain.objects.TriageProtocolAssessment)domainFactory.getDomainObject(ims.emergency.domain.objects.TriageProtocolAssessment.class, valueObject.getCurrentTriageAssessment().getBoId());
			}
		}
		domainObject.setCurrentTriageAssessment(value6);
		ims.icps.instantiation.domain.objects.PatientICP value7 = null;
		if ( null != valueObject.getCurrentTriagePathway() ) 
		{
			if (valueObject.getCurrentTriagePathway().getBoId() == null)
			{
				if (domMap.get(valueObject.getCurrentTriagePathway()) != null)
				{
					value7 = (ims.icps.instantiation.domain.objects.PatientICP)domMap.get(valueObject.getCurrentTriagePathway());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value7 = domainObject.getCurrentTriagePathway();	
			}
			else
			{
				value7 = (ims.icps.instantiation.domain.objects.PatientICP)domainFactory.getDomainObject(ims.icps.instantiation.domain.objects.PatientICP.class, valueObject.getCurrentTriagePathway().getBoId());
			}
		}
		domainObject.setCurrentTriagePathway(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getCurrentTriagePriority() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getCurrentTriagePriority().getID());
		}
		domainObject.setCurrentTriagePriority(value8);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.PatientProblem value9 = null;
		if ( null != valueObject.getMainPresentingProblem() ) 
		{
			if (valueObject.getMainPresentingProblem().getBoId() == null)
			{
				if (domMap.get(valueObject.getMainPresentingProblem()) != null)
				{
					value9 = (ims.core.clinical.domain.objects.PatientProblem)domMap.get(valueObject.getMainPresentingProblem());
				}
			}
			else
			{
				value9 = (ims.core.clinical.domain.objects.PatientProblem)domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientProblem.class, valueObject.getMainPresentingProblem().getBoId());
			}
		}
		domainObject.setMainPresentingProblem(value9);
		ims.framework.utils.DateTime dateTime10 = valueObject.getTriageStartDateTime();
		java.util.Date value10 = null;
		if ( dateTime10 != null ) 
		{
			value10 = dateTime10.getJavaDate();
		}
		domainObject.setTriageStartDateTime(value10);
		ims.framework.utils.DateTime dateTime11 = valueObject.getMedicInterventionStartDateTime();
		java.util.Date value11 = null;
		if ( dateTime11 != null ) 
		{
			value11 = dateTime11.getJavaDate();
		}
		domainObject.setMedicInterventionStartDateTime(value11);

		return domainObject;
	}

}
