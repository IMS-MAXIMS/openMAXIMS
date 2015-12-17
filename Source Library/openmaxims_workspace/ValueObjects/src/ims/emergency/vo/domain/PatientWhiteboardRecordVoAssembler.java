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
package ims.emergency.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Florin Blindu
 */
public class PatientWhiteboardRecordVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.PatientWhiteboardRecordVo copy(ims.emergency.vo.PatientWhiteboardRecordVo valueObjectDest, ims.emergency.vo.PatientWhiteboardRecordVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientWhiteboardRecord(valueObjectSrc.getID_PatientWhiteboardRecord());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// Episode
		valueObjectDest.setEpisode(valueObjectSrc.getEpisode());
		// Attendance
		valueObjectDest.setAttendance(valueObjectSrc.getAttendance());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// ClinicalNote
		valueObjectDest.setClinicalNote(valueObjectSrc.getClinicalNote());
		// CurrentActions
		valueObjectDest.setCurrentActions(valueObjectSrc.getCurrentActions());
		// ActionHistory
		valueObjectDest.setActionHistory(valueObjectSrc.getActionHistory());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientWhiteboardRecordVoCollectionFromPatientWhiteboardRecord(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.emergency.domain.objects.PatientWhiteboardRecord objects.
	 */
	public static ims.emergency.vo.PatientWhiteboardRecordVoCollection createPatientWhiteboardRecordVoCollectionFromPatientWhiteboardRecord(java.util.Set domainObjectSet)	
	{
		return createPatientWhiteboardRecordVoCollectionFromPatientWhiteboardRecord(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.emergency.domain.objects.PatientWhiteboardRecord objects.
	 */
	public static ims.emergency.vo.PatientWhiteboardRecordVoCollection createPatientWhiteboardRecordVoCollectionFromPatientWhiteboardRecord(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.PatientWhiteboardRecordVoCollection voList = new ims.emergency.vo.PatientWhiteboardRecordVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.emergency.domain.objects.PatientWhiteboardRecord domainObject = (ims.emergency.domain.objects.PatientWhiteboardRecord) iterator.next();
			ims.emergency.vo.PatientWhiteboardRecordVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.emergency.domain.objects.PatientWhiteboardRecord objects.
	 */
	public static ims.emergency.vo.PatientWhiteboardRecordVoCollection createPatientWhiteboardRecordVoCollectionFromPatientWhiteboardRecord(java.util.List domainObjectList) 
	{
		return createPatientWhiteboardRecordVoCollectionFromPatientWhiteboardRecord(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.emergency.domain.objects.PatientWhiteboardRecord objects.
	 */
	public static ims.emergency.vo.PatientWhiteboardRecordVoCollection createPatientWhiteboardRecordVoCollectionFromPatientWhiteboardRecord(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.PatientWhiteboardRecordVoCollection voList = new ims.emergency.vo.PatientWhiteboardRecordVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.emergency.domain.objects.PatientWhiteboardRecord domainObject = (ims.emergency.domain.objects.PatientWhiteboardRecord) domainObjectList.get(i);
			ims.emergency.vo.PatientWhiteboardRecordVo vo = create(map, domainObject);

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
	 * Create the ims.emergency.domain.objects.PatientWhiteboardRecord set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientWhiteboardRecordSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.PatientWhiteboardRecordVoCollection voCollection) 
	 {
	 	return extractPatientWhiteboardRecordSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientWhiteboardRecordSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.PatientWhiteboardRecordVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.PatientWhiteboardRecordVo vo = voCollection.get(i);
			ims.emergency.domain.objects.PatientWhiteboardRecord domainObject = PatientWhiteboardRecordVoAssembler.extractPatientWhiteboardRecord(domainFactory, vo, domMap);

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
	 * Create the ims.emergency.domain.objects.PatientWhiteboardRecord list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientWhiteboardRecordList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.PatientWhiteboardRecordVoCollection voCollection) 
	 {
	 	return extractPatientWhiteboardRecordList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientWhiteboardRecordList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.PatientWhiteboardRecordVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.PatientWhiteboardRecordVo vo = voCollection.get(i);
			ims.emergency.domain.objects.PatientWhiteboardRecord domainObject = PatientWhiteboardRecordVoAssembler.extractPatientWhiteboardRecord(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.emergency.domain.objects.PatientWhiteboardRecord object.
	 * @param domainObject ims.emergency.domain.objects.PatientWhiteboardRecord
	 */
	 public static ims.emergency.vo.PatientWhiteboardRecordVo create(ims.emergency.domain.objects.PatientWhiteboardRecord domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.emergency.domain.objects.PatientWhiteboardRecord object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.emergency.vo.PatientWhiteboardRecordVo create(DomainObjectMap map, ims.emergency.domain.objects.PatientWhiteboardRecord domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.PatientWhiteboardRecordVo valueObject = (ims.emergency.vo.PatientWhiteboardRecordVo) map.getValueObject(domainObject, ims.emergency.vo.PatientWhiteboardRecordVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.PatientWhiteboardRecordVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.emergency.domain.objects.PatientWhiteboardRecord
	 */
	 public static ims.emergency.vo.PatientWhiteboardRecordVo insert(ims.emergency.vo.PatientWhiteboardRecordVo valueObject, ims.emergency.domain.objects.PatientWhiteboardRecord domainObject) 
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
	 * @param domainObject ims.emergency.domain.objects.PatientWhiteboardRecord
	 */
	 public static ims.emergency.vo.PatientWhiteboardRecordVo insert(DomainObjectMap map, ims.emergency.vo.PatientWhiteboardRecordVo valueObject, ims.emergency.domain.objects.PatientWhiteboardRecord domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientWhiteboardRecord(domainObject.getId());
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
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// ClinicalNote
		valueObject.setClinicalNote(ims.emergency.vo.domain.AttendanceClinicalNotesForWhiteBoardVoAssembler.create(map, domainObject.getClinicalNote()) );
		// CurrentActions
		valueObject.setCurrentActions(ims.emergency.vo.domain.PatientWhiteboardActionsVoAssembler.createPatientWhiteboardActionsVoCollectionFromPatientWhiteboardActions(map, domainObject.getCurrentActions()) );
		// ActionHistory
		valueObject.setActionHistory(ims.emergency.vo.domain.PatientWhiteboardActionsVoAssembler.createPatientWhiteboardActionsVoCollectionFromPatientWhiteboardActions(map, domainObject.getActionHistory()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.emergency.domain.objects.PatientWhiteboardRecord extractPatientWhiteboardRecord(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.PatientWhiteboardRecordVo valueObject) 
	{
		return 	extractPatientWhiteboardRecord(domainFactory, valueObject, new HashMap());
	}

	public static ims.emergency.domain.objects.PatientWhiteboardRecord extractPatientWhiteboardRecord(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.PatientWhiteboardRecordVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientWhiteboardRecord();
		ims.emergency.domain.objects.PatientWhiteboardRecord domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.emergency.domain.objects.PatientWhiteboardRecord)domMap.get(valueObject);
			}
			// ims.emergency.vo.PatientWhiteboardRecordVo ID_PatientWhiteboardRecord field is unknown
			domainObject = new ims.emergency.domain.objects.PatientWhiteboardRecord();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientWhiteboardRecord());
			if (domMap.get(key) != null)
			{
				return (ims.emergency.domain.objects.PatientWhiteboardRecord)domMap.get(key);
			}
			domainObject = (ims.emergency.domain.objects.PatientWhiteboardRecord) domainFactory.getDomainObject(ims.emergency.domain.objects.PatientWhiteboardRecord.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientWhiteboardRecord());

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
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		domainObject.setClinicalNote(ims.emergency.vo.domain.AttendanceClinicalNotesForWhiteBoardVoAssembler.extractAttendanceClinicalNotes(domainFactory, valueObject.getClinicalNote(), domMap));
		domainObject.setCurrentActions(ims.emergency.vo.domain.PatientWhiteboardActionsVoAssembler.extractPatientWhiteboardActionsSet(domainFactory, valueObject.getCurrentActions(), domainObject.getCurrentActions(), domMap));		
		domainObject.setActionHistory(ims.emergency.vo.domain.PatientWhiteboardActionsVoAssembler.extractPatientWhiteboardActionsSet(domainFactory, valueObject.getActionHistory(), domainObject.getActionHistory(), domMap));		

		return domainObject;
	}

}
