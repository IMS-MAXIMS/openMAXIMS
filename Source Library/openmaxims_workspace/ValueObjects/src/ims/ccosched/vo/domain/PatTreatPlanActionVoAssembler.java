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
package ims.ccosched.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Sean Nesbitt
 */
public class PatTreatPlanActionVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ccosched.vo.PatTreatPlanActionVo copy(ims.ccosched.vo.PatTreatPlanActionVo valueObjectDest, ims.ccosched.vo.PatTreatPlanActionVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatAction(valueObjectSrc.getID_PatAction());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// BookedDate
		valueObjectDest.setBookedDate(valueObjectSrc.getBookedDate());
		// BookedTime
		valueObjectDest.setBookedTime(valueObjectSrc.getBookedTime());
		// action
		valueObjectDest.setAction(valueObjectSrc.getAction());
		// apptHeadId
		valueObjectDest.setApptHeadId(valueObjectSrc.getApptHeadId());
		// Dose
		valueObjectDest.setDose(valueObjectSrc.getDose());
		// apptId
		valueObjectDest.setApptId(valueObjectSrc.getApptId());
		// pretreatmentPlan
		valueObjectDest.setPretreatmentPlan(valueObjectSrc.getPretreatmentPlan());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// activityGroup
		valueObjectDest.setActivityGroup(valueObjectSrc.getActivityGroup());
		// activity
		valueObjectDest.setActivity(valueObjectSrc.getActivity());
		// priority
		valueObjectDest.setPriority(valueObjectSrc.getPriority());
		// patientStatus
		valueObjectDest.setPatientStatus(valueObjectSrc.getPatientStatus());
		// attendingAs
		valueObjectDest.setAttendingAs(valueObjectSrc.getAttendingAs());
		// transport
		valueObjectDest.setTransport(valueObjectSrc.getTransport());
		// reason
		valueObjectDest.setReason(valueObjectSrc.getReason());
		// category
		valueObjectDest.setCategory(valueObjectSrc.getCategory());
		// unit
		valueObjectDest.setUnit(valueObjectSrc.getUnit());
		// modality
		valueObjectDest.setModality(valueObjectSrc.getModality());
		// Aneasthetic
		valueObjectDest.setAneasthetic(valueObjectSrc.getAneasthetic());
		// plannedRegime
		valueObjectDest.setPlannedRegime(valueObjectSrc.getPlannedRegime());
		// treatingConsultant
		valueObjectDest.setTreatingConsultant(valueObjectSrc.getTreatingConsultant());
		// active
		valueObjectDest.setActive(valueObjectSrc.getActive());
		// EstartDate
		valueObjectDest.setEstartDate(valueObjectSrc.getEstartDate());
		// EendDate
		valueObjectDest.setEendDate(valueObjectSrc.getEendDate());
		// actionStatusDate
		valueObjectDest.setActionStatusDate(valueObjectSrc.getActionStatusDate());
		// waitingList
		valueObjectDest.setWaitingList(valueObjectSrc.getWaitingList());
		// modalEnergy
		valueObjectDest.setModalEnergy(valueObjectSrc.getModalEnergy());
		// imagingDate
		valueObjectDest.setImagingDate(valueObjectSrc.getImagingDate());
		// startDateRegime
		valueObjectDest.setStartDateRegime(valueObjectSrc.getStartDateRegime());
		// Action_OrderNumber
		valueObjectDest.setAction_OrderNumber(valueObjectSrc.getAction_OrderNumber());
		// treatmenAction
		valueObjectDest.setTreatmenAction(valueObjectSrc.getTreatmenAction());
		// lastAppointmentDate
		valueObjectDest.setLastAppointmentDate(valueObjectSrc.getLastAppointmentDate());
		// AppDate
		valueObjectDest.setAppDate(valueObjectSrc.getAppDate());
		// ChemPlanStartDate
		valueObjectDest.setChemPlanStartDate(valueObjectSrc.getChemPlanStartDate());
		// OPAClinic
		valueObjectDest.setOPAClinic(valueObjectSrc.getOPAClinic());
		// OPADate
		valueObjectDest.setOPADate(valueObjectSrc.getOPADate());
		// OPATime
		valueObjectDest.setOPATime(valueObjectSrc.getOPATime());
		// WLId
		valueObjectDest.setWLId(valueObjectSrc.getWLId());
		// SchedAppDate
		valueObjectDest.setSchedAppDate(valueObjectSrc.getSchedAppDate());
		// SchedAppTIme
		valueObjectDest.setSchedAppTIme(valueObjectSrc.getSchedAppTIme());
		// treatmentaction
		valueObjectDest.setTreatmentaction(valueObjectSrc.getTreatmentaction());
		// actionStatusPoint
		valueObjectDest.setActionStatusPoint(valueObjectSrc.getActionStatusPoint());
		// tl_dose
		valueObjectDest.setTl_dose(valueObjectSrc.getTl_dose());
		// tl_fractions
		valueObjectDest.setTl_fractions(valueObjectSrc.getTl_fractions());
		// tl_duration
		valueObjectDest.setTl_duration(valueObjectSrc.getTl_duration());
		// groupSiteTech
		valueObjectDest.setGroupSiteTech(valueObjectSrc.getGroupSiteTech());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatTreatPlanActionVoCollectionFromPatAction(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.PatAction objects.
	 */
	public static ims.ccosched.vo.PatTreatPlanActionVoCollection createPatTreatPlanActionVoCollectionFromPatAction(java.util.Set domainObjectSet)	
	{
		return createPatTreatPlanActionVoCollectionFromPatAction(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.PatAction objects.
	 */
	public static ims.ccosched.vo.PatTreatPlanActionVoCollection createPatTreatPlanActionVoCollectionFromPatAction(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ccosched.vo.PatTreatPlanActionVoCollection voList = new ims.ccosched.vo.PatTreatPlanActionVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.oncology.domain.objects.PatAction domainObject = (ims.oncology.domain.objects.PatAction) iterator.next();
			ims.ccosched.vo.PatTreatPlanActionVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.oncology.domain.objects.PatAction objects.
	 */
	public static ims.ccosched.vo.PatTreatPlanActionVoCollection createPatTreatPlanActionVoCollectionFromPatAction(java.util.List domainObjectList) 
	{
		return createPatTreatPlanActionVoCollectionFromPatAction(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.domain.objects.PatAction objects.
	 */
	public static ims.ccosched.vo.PatTreatPlanActionVoCollection createPatTreatPlanActionVoCollectionFromPatAction(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ccosched.vo.PatTreatPlanActionVoCollection voList = new ims.ccosched.vo.PatTreatPlanActionVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.domain.objects.PatAction domainObject = (ims.oncology.domain.objects.PatAction) domainObjectList.get(i);
			ims.ccosched.vo.PatTreatPlanActionVo vo = create(map, domainObject);

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
	 * Create the ims.oncology.domain.objects.PatAction set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatActionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ccosched.vo.PatTreatPlanActionVoCollection voCollection) 
	 {
	 	return extractPatActionSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatActionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ccosched.vo.PatTreatPlanActionVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ccosched.vo.PatTreatPlanActionVo vo = voCollection.get(i);
			ims.oncology.domain.objects.PatAction domainObject = PatTreatPlanActionVoAssembler.extractPatAction(domainFactory, vo, domMap);

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
	 * Create the ims.oncology.domain.objects.PatAction list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatActionList(ims.domain.ILightweightDomainFactory domainFactory, ims.ccosched.vo.PatTreatPlanActionVoCollection voCollection) 
	 {
	 	return extractPatActionList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatActionList(ims.domain.ILightweightDomainFactory domainFactory, ims.ccosched.vo.PatTreatPlanActionVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ccosched.vo.PatTreatPlanActionVo vo = voCollection.get(i);
			ims.oncology.domain.objects.PatAction domainObject = PatTreatPlanActionVoAssembler.extractPatAction(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.oncology.domain.objects.PatAction object.
	 * @param domainObject ims.oncology.domain.objects.PatAction
	 */
	 public static ims.ccosched.vo.PatTreatPlanActionVo create(ims.oncology.domain.objects.PatAction domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.oncology.domain.objects.PatAction object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ccosched.vo.PatTreatPlanActionVo create(DomainObjectMap map, ims.oncology.domain.objects.PatAction domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ccosched.vo.PatTreatPlanActionVo valueObject = (ims.ccosched.vo.PatTreatPlanActionVo) map.getValueObject(domainObject, ims.ccosched.vo.PatTreatPlanActionVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ccosched.vo.PatTreatPlanActionVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.oncology.domain.objects.PatAction
	 */
	 public static ims.ccosched.vo.PatTreatPlanActionVo insert(ims.ccosched.vo.PatTreatPlanActionVo valueObject, ims.oncology.domain.objects.PatAction domainObject) 
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
	 * @param domainObject ims.oncology.domain.objects.PatAction
	 */
	 public static ims.ccosched.vo.PatTreatPlanActionVo insert(DomainObjectMap map, ims.ccosched.vo.PatTreatPlanActionVo valueObject, ims.oncology.domain.objects.PatAction domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatAction(domainObject.getId());
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
			
		// BookedDate
		java.util.Date BookedDate = domainObject.getBookedDate();
		if ( null != BookedDate ) 
		{
			valueObject.setBookedDate(new ims.framework.utils.Date(BookedDate) );
		}
		// BookedTime
		String BookedTime = domainObject.getBookedTime();
		if ( null != BookedTime ) 
		{
			valueObject.setBookedTime(new ims.framework.utils.Time(BookedTime) );
		}
		// action
		valueObject.setAction(ims.dtomove.vo.domain.ActivityActionVoAssembler.create(map, domainObject.getAction()) );
		// apptHeadId
		valueObject.setApptHeadId(domainObject.getApptHeadId());
		// Dose
		valueObject.setDose(ims.dtomove.vo.domain.PatTreatPlanActionDoseVoAssembler.createPatTreatPlanActionDoseVoCollectionFromPatTreatmentPlanDose(map, domainObject.getDose()) );
		// apptId
		valueObject.setApptId(domainObject.getApptId());
		// pretreatmentPlan
		if (domainObject.getPretreatmentPlan() != null)
		{
			if(domainObject.getPretreatmentPlan() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPretreatmentPlan();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPretreatmentPlan(new ims.oncology.vo.PreTreatmentPlanRefVo(id, -1));				
			}
			else
			{
				valueObject.setPretreatmentPlan(new ims.oncology.vo.PreTreatmentPlanRefVo(domainObject.getPretreatmentPlan().getId(), domainObject.getPretreatmentPlan().getVersion()));
			}
		}
		// Status
		ims.domain.lookups.LookupInstance instance8 = domainObject.getStatus();
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

			ims.ccosched.vo.lookups.ActionStatusReason voLookup8 = new ims.ccosched.vo.lookups.ActionStatusReason(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.ccosched.vo.lookups.ActionStatusReason parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.ccosched.vo.lookups.ActionStatusReason(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setStatus(voLookup8);
		}
				// activityGroup
		valueObject.setActivityGroup(ims.dtomove.vo.domain.ActivityGroupVoAssembler.create(map, domainObject.getActivityGroup()) );
		// activity
		valueObject.setActivity(ims.dtomove.vo.domain.SchedActivityVoAssembler.create(map, domainObject.getActivity()) );
		// priority
		ims.domain.lookups.LookupInstance instance11 = domainObject.getPriority();
		if ( null != instance11 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance11.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance11.getImage().getImageId(), instance11.getImage().getImagePath());
			}
			color = instance11.getColor();
			if (color != null) 
				color.getValue();

			ims.ccosched.vo.lookups.Priority voLookup11 = new ims.ccosched.vo.lookups.Priority(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.ccosched.vo.lookups.Priority parentVoLookup11 = voLookup11;
			ims.domain.lookups.LookupInstance parent11 = instance11.getParent();
			while (parent11 != null)
			{
				if (parent11.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent11.getImage().getImageId(), parent11.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent11.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup11.setParent(new ims.ccosched.vo.lookups.Priority(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setPriority(voLookup11);
		}
				// patientStatus
		ims.domain.lookups.LookupInstance instance12 = domainObject.getPatientStatus();
		if ( null != instance12 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance12.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance12.getImage().getImageId(), instance12.getImage().getImagePath());
			}
			color = instance12.getColor();
			if (color != null) 
				color.getValue();

			ims.ccosched.vo.lookups.Status voLookup12 = new ims.ccosched.vo.lookups.Status(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.ccosched.vo.lookups.Status parentVoLookup12 = voLookup12;
			ims.domain.lookups.LookupInstance parent12 = instance12.getParent();
			while (parent12 != null)
			{
				if (parent12.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent12.getImage().getImageId(), parent12.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent12.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup12.setParent(new ims.ccosched.vo.lookups.Status(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setPatientStatus(voLookup12);
		}
				// attendingAs
		ims.domain.lookups.LookupInstance instance13 = domainObject.getAttendingAs();
		if ( null != instance13 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance13.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance13.getImage().getImageId(), instance13.getImage().getImagePath());
			}
			color = instance13.getColor();
			if (color != null) 
				color.getValue();

			ims.ccosched.vo.lookups.AttendingAs voLookup13 = new ims.ccosched.vo.lookups.AttendingAs(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.ccosched.vo.lookups.AttendingAs parentVoLookup13 = voLookup13;
			ims.domain.lookups.LookupInstance parent13 = instance13.getParent();
			while (parent13 != null)
			{
				if (parent13.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent13.getImage().getImageId(), parent13.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent13.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup13.setParent(new ims.ccosched.vo.lookups.AttendingAs(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setAttendingAs(voLookup13);
		}
				// transport
		ims.domain.lookups.LookupInstance instance14 = domainObject.getTransport();
		if ( null != instance14 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance14.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance14.getImage().getImageId(), instance14.getImage().getImagePath());
			}
			color = instance14.getColor();
			if (color != null) 
				color.getValue();

			ims.ccosched.vo.lookups.Transport voLookup14 = new ims.ccosched.vo.lookups.Transport(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.ccosched.vo.lookups.Transport parentVoLookup14 = voLookup14;
			ims.domain.lookups.LookupInstance parent14 = instance14.getParent();
			while (parent14 != null)
			{
				if (parent14.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent14.getImage().getImageId(), parent14.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent14.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup14.setParent(new ims.ccosched.vo.lookups.Transport(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setTransport(voLookup14);
		}
				// reason
		ims.domain.lookups.LookupInstance instance15 = domainObject.getReason();
		if ( null != instance15 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance15.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance15.getImage().getImageId(), instance15.getImage().getImagePath());
			}
			color = instance15.getColor();
			if (color != null) 
				color.getValue();

			ims.ccosched.vo.lookups.ActionStatusReason voLookup15 = new ims.ccosched.vo.lookups.ActionStatusReason(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.ccosched.vo.lookups.ActionStatusReason parentVoLookup15 = voLookup15;
			ims.domain.lookups.LookupInstance parent15 = instance15.getParent();
			while (parent15 != null)
			{
				if (parent15.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent15.getImage().getImageId(), parent15.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent15.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup15.setParent(new ims.ccosched.vo.lookups.ActionStatusReason(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setReason(voLookup15);
		}
				// category
		ims.domain.lookups.LookupInstance instance16 = domainObject.getCategory();
		if ( null != instance16 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance16.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance16.getImage().getImageId(), instance16.getImage().getImagePath());
			}
			color = instance16.getColor();
			if (color != null) 
				color.getValue();

			ims.ccosched.vo.lookups.SchedCategory voLookup16 = new ims.ccosched.vo.lookups.SchedCategory(instance16.getId(),instance16.getText(), instance16.isActive(), null, img, color);
			ims.ccosched.vo.lookups.SchedCategory parentVoLookup16 = voLookup16;
			ims.domain.lookups.LookupInstance parent16 = instance16.getParent();
			while (parent16 != null)
			{
				if (parent16.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent16.getImage().getImageId(), parent16.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent16.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup16.setParent(new ims.ccosched.vo.lookups.SchedCategory(parent16.getId(),parent16.getText(), parent16.isActive(), null, img, color));
				parentVoLookup16 = parentVoLookup16.getParent();
								parent16 = parent16.getParent();
			}			
			valueObject.setCategory(voLookup16);
		}
				// unit
		ims.domain.lookups.LookupInstance instance17 = domainObject.getUnit();
		if ( null != instance17 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance17.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance17.getImage().getImageId(), instance17.getImage().getImagePath());
			}
			color = instance17.getColor();
			if (color != null) 
				color.getValue();

			ims.ccosched.vo.lookups.Unit voLookup17 = new ims.ccosched.vo.lookups.Unit(instance17.getId(),instance17.getText(), instance17.isActive(), null, img, color);
			ims.ccosched.vo.lookups.Unit parentVoLookup17 = voLookup17;
			ims.domain.lookups.LookupInstance parent17 = instance17.getParent();
			while (parent17 != null)
			{
				if (parent17.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent17.getImage().getImageId(), parent17.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent17.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup17.setParent(new ims.ccosched.vo.lookups.Unit(parent17.getId(),parent17.getText(), parent17.isActive(), null, img, color));
				parentVoLookup17 = parentVoLookup17.getParent();
								parent17 = parent17.getParent();
			}			
			valueObject.setUnit(voLookup17);
		}
				// modality
		ims.domain.lookups.LookupInstance instance18 = domainObject.getModality();
		if ( null != instance18 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance18.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance18.getImage().getImageId(), instance18.getImage().getImagePath());
			}
			color = instance18.getColor();
			if (color != null) 
				color.getValue();

			ims.ccosched.vo.lookups.Modality voLookup18 = new ims.ccosched.vo.lookups.Modality(instance18.getId(),instance18.getText(), instance18.isActive(), null, img, color);
			ims.ccosched.vo.lookups.Modality parentVoLookup18 = voLookup18;
			ims.domain.lookups.LookupInstance parent18 = instance18.getParent();
			while (parent18 != null)
			{
				if (parent18.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent18.getImage().getImageId(), parent18.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent18.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup18.setParent(new ims.ccosched.vo.lookups.Modality(parent18.getId(),parent18.getText(), parent18.isActive(), null, img, color));
				parentVoLookup18 = parentVoLookup18.getParent();
								parent18 = parent18.getParent();
			}			
			valueObject.setModality(voLookup18);
		}
				// Aneasthetic
		ims.domain.lookups.LookupInstance instance19 = domainObject.getAneasthetic();
		if ( null != instance19 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance19.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance19.getImage().getImageId(), instance19.getImage().getImagePath());
			}
			color = instance19.getColor();
			if (color != null) 
				color.getValue();

			ims.ccosched.vo.lookups.Anaesthetic voLookup19 = new ims.ccosched.vo.lookups.Anaesthetic(instance19.getId(),instance19.getText(), instance19.isActive(), null, img, color);
			ims.ccosched.vo.lookups.Anaesthetic parentVoLookup19 = voLookup19;
			ims.domain.lookups.LookupInstance parent19 = instance19.getParent();
			while (parent19 != null)
			{
				if (parent19.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent19.getImage().getImageId(), parent19.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent19.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup19.setParent(new ims.ccosched.vo.lookups.Anaesthetic(parent19.getId(),parent19.getText(), parent19.isActive(), null, img, color));
				parentVoLookup19 = parentVoLookup19.getParent();
								parent19 = parent19.getParent();
			}			
			valueObject.setAneasthetic(voLookup19);
		}
				// plannedRegime
		ims.domain.lookups.LookupInstance instance20 = domainObject.getPlannedRegime();
		if ( null != instance20 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance20.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance20.getImage().getImageId(), instance20.getImage().getImagePath());
			}
			color = instance20.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.RegimenAcronym voLookup20 = new ims.oncology.vo.lookups.RegimenAcronym(instance20.getId(),instance20.getText(), instance20.isActive(), null, img, color);
			ims.oncology.vo.lookups.RegimenAcronym parentVoLookup20 = voLookup20;
			ims.domain.lookups.LookupInstance parent20 = instance20.getParent();
			while (parent20 != null)
			{
				if (parent20.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent20.getImage().getImageId(), parent20.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent20.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup20.setParent(new ims.oncology.vo.lookups.RegimenAcronym(parent20.getId(),parent20.getText(), parent20.isActive(), null, img, color));
				parentVoLookup20 = parentVoLookup20.getParent();
								parent20 = parent20.getParent();
			}			
			valueObject.setPlannedRegime(voLookup20);
		}
				// treatingConsultant
		valueObject.setTreatingConsultant(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getTreatingConsultant()) );
		// active
		valueObject.setActive( domainObject.isActive() );
		// EstartDate
		java.util.Date EstartDate = domainObject.getEstartDate();
		if ( null != EstartDate ) 
		{
			valueObject.setEstartDate(new ims.framework.utils.Date(EstartDate) );
		}
		// EendDate
		java.util.Date EendDate = domainObject.getEendDate();
		if ( null != EendDate ) 
		{
			valueObject.setEendDate(new ims.framework.utils.Date(EendDate) );
		}
		// actionStatusDate
		java.util.Date actionStatusDate = domainObject.getActionStatusDate();
		if ( null != actionStatusDate ) 
		{
			valueObject.setActionStatusDate(new ims.framework.utils.Date(actionStatusDate) );
		}
		// waitingList
		valueObject.setWaitingList(domainObject.getWaitingList());
		// modalEnergy
		valueObject.setModalEnergy(domainObject.getModalEnergy());
		// imagingDate
		java.util.Date imagingDate = domainObject.getImagingDate();
		if ( null != imagingDate ) 
		{
			valueObject.setImagingDate(new ims.framework.utils.Date(imagingDate) );
		}
		// startDateRegime
		java.util.Date startDateRegime = domainObject.getStartDateRegime();
		if ( null != startDateRegime ) 
		{
			valueObject.setStartDateRegime(new ims.framework.utils.Date(startDateRegime) );
		}
		// Action_OrderNumber
		valueObject.setAction_OrderNumber(domainObject.getAction_OrderNumber());
		// treatmenAction
		valueObject.setTreatmenAction(domainObject.getTreatmenAction());
		// lastAppointmentDate
		java.util.Date lastAppointmentDate = domainObject.getLastAppointmentDate();
		if ( null != lastAppointmentDate ) 
		{
			valueObject.setLastAppointmentDate(new ims.framework.utils.Date(lastAppointmentDate) );
		}
		// AppDate
		java.util.Date AppDate = domainObject.getAppDate();
		if ( null != AppDate ) 
		{
			valueObject.setAppDate(new ims.framework.utils.Date(AppDate) );
		}
		// ChemPlanStartDate
		java.util.Date ChemPlanStartDate = domainObject.getChemPlanStartDate();
		if ( null != ChemPlanStartDate ) 
		{
			valueObject.setChemPlanStartDate(new ims.framework.utils.Date(ChemPlanStartDate) );
		}
		// OPAClinic
		valueObject.setOPAClinic(domainObject.getOPAClinic());
		// OPADate
		java.util.Date OPADate = domainObject.getOPADate();
		if ( null != OPADate ) 
		{
			valueObject.setOPADate(new ims.framework.utils.Date(OPADate) );
		}
		// OPATime
		String OPATime = domainObject.getOPATime();
		if ( null != OPATime ) 
		{
			valueObject.setOPATime(new ims.framework.utils.Time(OPATime) );
		}
		// WLId
		valueObject.setWLId(domainObject.getWLId());
		// SchedAppDate
		java.util.Date SchedAppDate = domainObject.getSchedAppDate();
		if ( null != SchedAppDate ) 
		{
			valueObject.setSchedAppDate(new ims.framework.utils.Date(SchedAppDate) );
		}
		// SchedAppTIme
		String SchedAppTIme = domainObject.getSchedAppTIme();
		if ( null != SchedAppTIme ) 
		{
			valueObject.setSchedAppTIme(new ims.framework.utils.Time(SchedAppTIme) );
		}
		// treatmentaction
		valueObject.setTreatmentaction(domainObject.getTreatmentaction());
		// actionStatusPoint
		valueObject.setActionStatusPoint(ims.ccosched.vo.domain.PatActionStatusPointVoAssembler.createPatActionStatusPointVoCollectionFromPatActionStatusPoint(map, domainObject.getActionStatusPoint()) );
		// tl_dose
		valueObject.setTl_dose(domainObject.getTl_dose());
		// tl_fractions
		valueObject.setTl_fractions(domainObject.getTl_fractions());
		// tl_duration
		valueObject.setTl_duration(domainObject.getTl_duration());
		// groupSiteTech
		valueObject.setGroupSiteTech(ims.ccosched.vo.domain.PatTrPlanGroupSiteTechVoAssembler.createPatTrPlanGroupSiteTechVoCollectionFromPatTreatmentPlanGroupSiteTech(map, domainObject.getGroupSiteTech()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.domain.objects.PatAction extractPatAction(ims.domain.ILightweightDomainFactory domainFactory, ims.ccosched.vo.PatTreatPlanActionVo valueObject) 
	{
		return 	extractPatAction(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.domain.objects.PatAction extractPatAction(ims.domain.ILightweightDomainFactory domainFactory, ims.ccosched.vo.PatTreatPlanActionVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatAction();
		ims.oncology.domain.objects.PatAction domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.oncology.domain.objects.PatAction)domMap.get(valueObject);
			}
			// ims.ccosched.vo.PatTreatPlanActionVo ID_PatAction field is unknown
			domainObject = new ims.oncology.domain.objects.PatAction();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatAction());
			if (domMap.get(key) != null)
			{
				return (ims.oncology.domain.objects.PatAction)domMap.get(key);
			}
			domainObject = (ims.oncology.domain.objects.PatAction) domainFactory.getDomainObject(ims.oncology.domain.objects.PatAction.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatAction());

		java.util.Date value1 = null;
		ims.framework.utils.Date date1 = valueObject.getBookedDate();		
		if ( date1 != null ) 
		{
			value1 = date1.getDate();
		}
		domainObject.setBookedDate(value1);
		ims.framework.utils.Time time2 = valueObject.getBookedTime();
		String value2 = null;
		if ( time2 != null ) 
		{
			value2 = time2.toString();
		}
		domainObject.setBookedTime(value2);
		domainObject.setAction(ims.dtomove.vo.domain.ActivityActionVoAssembler.extractActivityAction(domainFactory, valueObject.getAction(), domMap));
		domainObject.setApptHeadId(valueObject.getApptHeadId());
		domainObject.setDose(ims.dtomove.vo.domain.PatTreatPlanActionDoseVoAssembler.extractPatTreatmentPlanDoseList(domainFactory, valueObject.getDose(), domainObject.getDose(), domMap));		
		domainObject.setApptId(valueObject.getApptId());
		ims.oncology.domain.objects.PreTreatmentPlan value7 = null;
		if ( null != valueObject.getPretreatmentPlan() ) 
		{
			if (valueObject.getPretreatmentPlan().getBoId() == null)
			{
				if (domMap.get(valueObject.getPretreatmentPlan()) != null)
				{
					value7 = (ims.oncology.domain.objects.PreTreatmentPlan)domMap.get(valueObject.getPretreatmentPlan());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value7 = domainObject.getPretreatmentPlan();	
			}
			else
			{
				value7 = (ims.oncology.domain.objects.PreTreatmentPlan)domainFactory.getDomainObject(ims.oncology.domain.objects.PreTreatmentPlan.class, valueObject.getPretreatmentPlan().getBoId());
			}
		}
		domainObject.setPretreatmentPlan(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value8);
		domainObject.setActivityGroup(ims.dtomove.vo.domain.ActivityGroupVoAssembler.extractActivityGroup(domainFactory, valueObject.getActivityGroup(), domMap));
		domainObject.setActivity(ims.dtomove.vo.domain.SchedActivityVoAssembler.extractSchedActivity(domainFactory, valueObject.getActivity(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getPriority() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getPriority().getID());
		}
		domainObject.setPriority(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getPatientStatus() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getPatientStatus().getID());
		}
		domainObject.setPatientStatus(value12);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getAttendingAs() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getAttendingAs().getID());
		}
		domainObject.setAttendingAs(value13);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getTransport() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getTransport().getID());
		}
		domainObject.setTransport(value14);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getReason() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getReason().getID());
		}
		domainObject.setReason(value15);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getCategory() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getCategory().getID());
		}
		domainObject.setCategory(value16);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value17 = null;
		if ( null != valueObject.getUnit() ) 
		{
			value17 =
				domainFactory.getLookupInstance(valueObject.getUnit().getID());
		}
		domainObject.setUnit(value17);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value18 = null;
		if ( null != valueObject.getModality() ) 
		{
			value18 =
				domainFactory.getLookupInstance(valueObject.getModality().getID());
		}
		domainObject.setModality(value18);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value19 = null;
		if ( null != valueObject.getAneasthetic() ) 
		{
			value19 =
				domainFactory.getLookupInstance(valueObject.getAneasthetic().getID());
		}
		domainObject.setAneasthetic(value19);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value20 = null;
		if ( null != valueObject.getPlannedRegime() ) 
		{
			value20 =
				domainFactory.getLookupInstance(valueObject.getPlannedRegime().getID());
		}
		domainObject.setPlannedRegime(value20);
		domainObject.setTreatingConsultant(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getTreatingConsultant(), domMap));
		domainObject.setActive(valueObject.getActive());
		java.util.Date value23 = null;
		ims.framework.utils.Date date23 = valueObject.getEstartDate();		
		if ( date23 != null ) 
		{
			value23 = date23.getDate();
		}
		domainObject.setEstartDate(value23);
		java.util.Date value24 = null;
		ims.framework.utils.Date date24 = valueObject.getEendDate();		
		if ( date24 != null ) 
		{
			value24 = date24.getDate();
		}
		domainObject.setEendDate(value24);
		java.util.Date value25 = null;
		ims.framework.utils.Date date25 = valueObject.getActionStatusDate();		
		if ( date25 != null ) 
		{
			value25 = date25.getDate();
		}
		domainObject.setActionStatusDate(value25);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getWaitingList() != null && valueObject.getWaitingList().equals(""))
		{
			valueObject.setWaitingList(null);
		}
		domainObject.setWaitingList(valueObject.getWaitingList());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getModalEnergy() != null && valueObject.getModalEnergy().equals(""))
		{
			valueObject.setModalEnergy(null);
		}
		domainObject.setModalEnergy(valueObject.getModalEnergy());
		java.util.Date value28 = null;
		ims.framework.utils.Date date28 = valueObject.getImagingDate();		
		if ( date28 != null ) 
		{
			value28 = date28.getDate();
		}
		domainObject.setImagingDate(value28);
		java.util.Date value29 = null;
		ims.framework.utils.Date date29 = valueObject.getStartDateRegime();		
		if ( date29 != null ) 
		{
			value29 = date29.getDate();
		}
		domainObject.setStartDateRegime(value29);
		domainObject.setAction_OrderNumber(valueObject.getAction_OrderNumber());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTreatmenAction() != null && valueObject.getTreatmenAction().equals(""))
		{
			valueObject.setTreatmenAction(null);
		}
		domainObject.setTreatmenAction(valueObject.getTreatmenAction());
		java.util.Date value32 = null;
		ims.framework.utils.Date date32 = valueObject.getLastAppointmentDate();		
		if ( date32 != null ) 
		{
			value32 = date32.getDate();
		}
		domainObject.setLastAppointmentDate(value32);
		java.util.Date value33 = null;
		ims.framework.utils.Date date33 = valueObject.getAppDate();		
		if ( date33 != null ) 
		{
			value33 = date33.getDate();
		}
		domainObject.setAppDate(value33);
		java.util.Date value34 = null;
		ims.framework.utils.Date date34 = valueObject.getChemPlanStartDate();		
		if ( date34 != null ) 
		{
			value34 = date34.getDate();
		}
		domainObject.setChemPlanStartDate(value34);
		domainObject.setOPAClinic(valueObject.getOPAClinic());
		java.util.Date value36 = null;
		ims.framework.utils.Date date36 = valueObject.getOPADate();		
		if ( date36 != null ) 
		{
			value36 = date36.getDate();
		}
		domainObject.setOPADate(value36);
		ims.framework.utils.Time time37 = valueObject.getOPATime();
		String value37 = null;
		if ( time37 != null ) 
		{
			value37 = time37.toString();
		}
		domainObject.setOPATime(value37);
		domainObject.setWLId(valueObject.getWLId());
		java.util.Date value39 = null;
		ims.framework.utils.Date date39 = valueObject.getSchedAppDate();		
		if ( date39 != null ) 
		{
			value39 = date39.getDate();
		}
		domainObject.setSchedAppDate(value39);
		ims.framework.utils.Time time40 = valueObject.getSchedAppTIme();
		String value40 = null;
		if ( time40 != null ) 
		{
			value40 = time40.toString();
		}
		domainObject.setSchedAppTIme(value40);
		domainObject.setTreatmentaction(valueObject.getTreatmentaction());
		domainObject.setActionStatusPoint(ims.ccosched.vo.domain.PatActionStatusPointVoAssembler.extractPatActionStatusPointList(domainFactory, valueObject.getActionStatusPoint(), domainObject.getActionStatusPoint(), domMap));		
		domainObject.setTl_dose(valueObject.getTl_dose());
		domainObject.setTl_fractions(valueObject.getTl_fractions());
		domainObject.setTl_duration(valueObject.getTl_duration());
		domainObject.setGroupSiteTech(ims.ccosched.vo.domain.PatTrPlanGroupSiteTechVoAssembler.extractPatTreatmentPlanGroupSiteTechList(domainFactory, valueObject.getGroupSiteTech(), domainObject.getGroupSiteTech(), domMap));		

		return domainObject;
	}

}
