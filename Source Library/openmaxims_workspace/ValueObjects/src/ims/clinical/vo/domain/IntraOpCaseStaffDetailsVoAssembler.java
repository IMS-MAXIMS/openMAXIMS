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
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class IntraOpCaseStaffDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.IntraOpCaseStaffDetailsVo copy(ims.clinical.vo.IntraOpCaseStaffDetailsVo valueObjectDest, ims.clinical.vo.IntraOpCaseStaffDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_IntraOpCaseStaffDetails(valueObjectSrc.getID_IntraOpCaseStaffDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TheatreAppointment
		valueObjectDest.setTheatreAppointment(valueObjectSrc.getTheatreAppointment());
		// AnaestheticType
		valueObjectDest.setAnaestheticType(valueObjectSrc.getAnaestheticType());
		// Anaesthetist
		valueObjectDest.setAnaesthetist(valueObjectSrc.getAnaesthetist());
		// AssistingAnaesthetist
		valueObjectDest.setAssistingAnaesthetist(valueObjectSrc.getAssistingAnaesthetist());
		// SupervisingAnaesthetist
		valueObjectDest.setSupervisingAnaesthetist(valueObjectSrc.getSupervisingAnaesthetist());
		// AnaestheticPractioner
		valueObjectDest.setAnaestheticPractioner(valueObjectSrc.getAnaestheticPractioner());
		// ResponsibleHCP
		valueObjectDest.setResponsibleHCP(valueObjectSrc.getResponsibleHCP());
		// OperatingSurgeon
		valueObjectDest.setOperatingSurgeon(valueObjectSrc.getOperatingSurgeon());
		// SupervisingSurgeon
		valueObjectDest.setSupervisingSurgeon(valueObjectSrc.getSupervisingSurgeon());
		// AssistingSurgeons
		valueObjectDest.setAssistingSurgeons(valueObjectSrc.getAssistingSurgeons());
		// ScrubPractitioner1
		valueObjectDest.setScrubPractitioner1(valueObjectSrc.getScrubPractitioner1());
		// ScrubPractitioner2
		valueObjectDest.setScrubPractitioner2(valueObjectSrc.getScrubPractitioner2());
		// Other
		valueObjectDest.setOther(valueObjectSrc.getOther());
		// CirculatorScrubNurseRoles
		valueObjectDest.setCirculatorScrubNurseRoles(valueObjectSrc.getCirculatorScrubNurseRoles());
		// displayDiathermyandLaser
		valueObjectDest.setDisplayDiathermyandLaser(valueObjectSrc.getDisplayDiathermyandLaser());
		// displayIrrigationCathetersDrainsTubes
		valueObjectDest.setDisplayIrrigationCathetersDrainsTubes(valueObjectSrc.getDisplayIrrigationCathetersDrainsTubes());
		// displaySpecimensWoundPackingSkinClosure
		valueObjectDest.setDisplaySpecimensWoundPackingSkinClosure(valueObjectSrc.getDisplaySpecimensWoundPackingSkinClosure());
		// displayImplantsArterialClampsOtherEquipment
		valueObjectDest.setDisplayImplantsArterialClampsOtherEquipment(valueObjectSrc.getDisplayImplantsArterialClampsOtherEquipment());
		// displayTourniquet
		valueObjectDest.setDisplayTourniquet(valueObjectSrc.getDisplayTourniquet());
		// displayRecoveryDetails
		valueObjectDest.setDisplayRecoveryDetails(valueObjectSrc.getDisplayRecoveryDetails());
		// isRecoveryInTheatre
		valueObjectDest.setIsRecoveryInTheatre(valueObjectSrc.getIsRecoveryInTheatre());
		// PatientAssessment
		valueObjectDest.setPatientAssessment(valueObjectSrc.getPatientAssessment());
		// CaseService
		valueObjectDest.setCaseService(valueObjectSrc.getCaseService());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createIntraOpCaseStaffDetailsVoCollectionFromIntraOpCaseStaffDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.IntraOpCaseStaffDetails objects.
	 */
	public static ims.clinical.vo.IntraOpCaseStaffDetailsVoCollection createIntraOpCaseStaffDetailsVoCollectionFromIntraOpCaseStaffDetails(java.util.Set domainObjectSet)	
	{
		return createIntraOpCaseStaffDetailsVoCollectionFromIntraOpCaseStaffDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.IntraOpCaseStaffDetails objects.
	 */
	public static ims.clinical.vo.IntraOpCaseStaffDetailsVoCollection createIntraOpCaseStaffDetailsVoCollectionFromIntraOpCaseStaffDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.IntraOpCaseStaffDetailsVoCollection voList = new ims.clinical.vo.IntraOpCaseStaffDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.IntraOpCaseStaffDetails domainObject = (ims.clinical.domain.objects.IntraOpCaseStaffDetails) iterator.next();
			ims.clinical.vo.IntraOpCaseStaffDetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.IntraOpCaseStaffDetails objects.
	 */
	public static ims.clinical.vo.IntraOpCaseStaffDetailsVoCollection createIntraOpCaseStaffDetailsVoCollectionFromIntraOpCaseStaffDetails(java.util.List domainObjectList) 
	{
		return createIntraOpCaseStaffDetailsVoCollectionFromIntraOpCaseStaffDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.IntraOpCaseStaffDetails objects.
	 */
	public static ims.clinical.vo.IntraOpCaseStaffDetailsVoCollection createIntraOpCaseStaffDetailsVoCollectionFromIntraOpCaseStaffDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.IntraOpCaseStaffDetailsVoCollection voList = new ims.clinical.vo.IntraOpCaseStaffDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.IntraOpCaseStaffDetails domainObject = (ims.clinical.domain.objects.IntraOpCaseStaffDetails) domainObjectList.get(i);
			ims.clinical.vo.IntraOpCaseStaffDetailsVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.IntraOpCaseStaffDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractIntraOpCaseStaffDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.IntraOpCaseStaffDetailsVoCollection voCollection) 
	 {
	 	return extractIntraOpCaseStaffDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractIntraOpCaseStaffDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.IntraOpCaseStaffDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.IntraOpCaseStaffDetailsVo vo = voCollection.get(i);
			ims.clinical.domain.objects.IntraOpCaseStaffDetails domainObject = IntraOpCaseStaffDetailsVoAssembler.extractIntraOpCaseStaffDetails(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.IntraOpCaseStaffDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractIntraOpCaseStaffDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.IntraOpCaseStaffDetailsVoCollection voCollection) 
	 {
	 	return extractIntraOpCaseStaffDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractIntraOpCaseStaffDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.IntraOpCaseStaffDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.IntraOpCaseStaffDetailsVo vo = voCollection.get(i);
			ims.clinical.domain.objects.IntraOpCaseStaffDetails domainObject = IntraOpCaseStaffDetailsVoAssembler.extractIntraOpCaseStaffDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.IntraOpCaseStaffDetails object.
	 * @param domainObject ims.clinical.domain.objects.IntraOpCaseStaffDetails
	 */
	 public static ims.clinical.vo.IntraOpCaseStaffDetailsVo create(ims.clinical.domain.objects.IntraOpCaseStaffDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.IntraOpCaseStaffDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.IntraOpCaseStaffDetailsVo create(DomainObjectMap map, ims.clinical.domain.objects.IntraOpCaseStaffDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.IntraOpCaseStaffDetailsVo valueObject = (ims.clinical.vo.IntraOpCaseStaffDetailsVo) map.getValueObject(domainObject, ims.clinical.vo.IntraOpCaseStaffDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.IntraOpCaseStaffDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.IntraOpCaseStaffDetails
	 */
	 public static ims.clinical.vo.IntraOpCaseStaffDetailsVo insert(ims.clinical.vo.IntraOpCaseStaffDetailsVo valueObject, ims.clinical.domain.objects.IntraOpCaseStaffDetails domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.IntraOpCaseStaffDetails
	 */
	 public static ims.clinical.vo.IntraOpCaseStaffDetailsVo insert(DomainObjectMap map, ims.clinical.vo.IntraOpCaseStaffDetailsVo valueObject, ims.clinical.domain.objects.IntraOpCaseStaffDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_IntraOpCaseStaffDetails(domainObject.getId());
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
			
		// TheatreAppointment
		if (domainObject.getTheatreAppointment() != null)
		{
			if(domainObject.getTheatreAppointment() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getTheatreAppointment();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setTheatreAppointment(new ims.scheduling.vo.Booking_AppointmentRefVo(id, -1));				
			}
			else
			{
				valueObject.setTheatreAppointment(new ims.scheduling.vo.Booking_AppointmentRefVo(domainObject.getTheatreAppointment().getId(), domainObject.getTheatreAppointment().getVersion()));
			}
		}
		// AnaestheticType
		ims.domain.lookups.LookupInstance instance2 = domainObject.getAnaestheticType();
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

			ims.clinical.vo.lookups.AnaestheticType voLookup2 = new ims.clinical.vo.lookups.AnaestheticType(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.clinical.vo.lookups.AnaestheticType parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.clinical.vo.lookups.AnaestheticType(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setAnaestheticType(voLookup2);
		}
				// Anaesthetist
		valueObject.setAnaesthetist((ims.core.vo.MedicLiteVo)ims.core.vo.domain.MedicLiteVoAssembler.create(map, domainObject.getAnaesthetist()) );
		// AssistingAnaesthetist
		valueObject.setAssistingAnaesthetist((ims.core.vo.MedicLiteVo)ims.core.vo.domain.MedicLiteVoAssembler.create(map, domainObject.getAssistingAnaesthetist()) );
		// SupervisingAnaesthetist
		valueObject.setSupervisingAnaesthetist((ims.core.vo.MedicLiteVo)ims.core.vo.domain.MedicLiteVoAssembler.create(map, domainObject.getSupervisingAnaesthetist()) );
		// AnaestheticPractioner
		valueObject.setAnaestheticPractioner((ims.core.vo.MedicVo)ims.core.vo.domain.MedicVoAssembler.create(map, domainObject.getAnaestheticPractioner()) );
		// ResponsibleHCP
		valueObject.setResponsibleHCP((ims.core.vo.MedicVo)ims.core.vo.domain.MedicVoAssembler.create(map, domainObject.getResponsibleHCP()) );
		// OperatingSurgeon
		valueObject.setOperatingSurgeon((ims.core.vo.MedicVo)ims.core.vo.domain.MedicVoAssembler.create(map, domainObject.getOperatingSurgeon()) );
		// SupervisingSurgeon
		valueObject.setSupervisingSurgeon((ims.core.vo.MedicVo)ims.core.vo.domain.MedicVoAssembler.create(map, domainObject.getSupervisingSurgeon()) );
		// AssistingSurgeons
		valueObject.setAssistingSurgeons(ims.core.vo.domain.MedicLiteVoAssembler.createMedicLiteVoCollectionFromMedic(map, domainObject.getAssistingSurgeons()) );
		// ScrubPractitioner1
		valueObject.setScrubPractitioner1(ims.core.vo.domain.NurseLiteVoAssembler.create(map, domainObject.getScrubPractitioner1()) );
		// ScrubPractitioner2
		valueObject.setScrubPractitioner2(ims.core.vo.domain.NurseLiteVoAssembler.create(map, domainObject.getScrubPractitioner2()) );
		// Other
		valueObject.setOther(domainObject.getOther());
		// CirculatorScrubNurseRoles
		valueObject.setCirculatorScrubNurseRoles(ims.clinical.vo.domain.CirculatorScrubNurseRoleVoAssembler.createCirculatorScrubNurseRoleVoCollectionFromCirculatorScrubNurseRole(map, domainObject.getCirculatorScrubNurseRoles()) );
		// displayDiathermyandLaser
		valueObject.setDisplayDiathermyandLaser( domainObject.isDisplayDiathermyandLaser() );
		// displayIrrigationCathetersDrainsTubes
		valueObject.setDisplayIrrigationCathetersDrainsTubes( domainObject.isDisplayIrrigationCathetersDrainsTubes() );
		// displaySpecimensWoundPackingSkinClosure
		valueObject.setDisplaySpecimensWoundPackingSkinClosure( domainObject.isDisplaySpecimensWoundPackingSkinClosure() );
		// displayImplantsArterialClampsOtherEquipment
		valueObject.setDisplayImplantsArterialClampsOtherEquipment( domainObject.isDisplayImplantsArterialClampsOtherEquipment() );
		// displayTourniquet
		valueObject.setDisplayTourniquet( domainObject.isDisplayTourniquet() );
		// displayRecoveryDetails
		valueObject.setDisplayRecoveryDetails( domainObject.isDisplayRecoveryDetails() );
		// isRecoveryInTheatre
		valueObject.setIsRecoveryInTheatre( domainObject.isIsRecoveryInTheatre() );
		// PatientAssessment
		valueObject.setPatientAssessment(ims.assessment.vo.domain.Patient_AssessmentVoAssembler.create(map, domainObject.getPatientAssessment()) );
		// CaseService
		if (domainObject.getCaseService() != null)
		{
			if(domainObject.getCaseService() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCaseService();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCaseService(new ims.core.clinical.vo.ServiceRefVo(id, -1));				
			}
			else
			{
				valueObject.setCaseService(new ims.core.clinical.vo.ServiceRefVo(domainObject.getCaseService().getId(), domainObject.getCaseService().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.IntraOpCaseStaffDetails extractIntraOpCaseStaffDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.IntraOpCaseStaffDetailsVo valueObject) 
	{
		return 	extractIntraOpCaseStaffDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.IntraOpCaseStaffDetails extractIntraOpCaseStaffDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.IntraOpCaseStaffDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_IntraOpCaseStaffDetails();
		ims.clinical.domain.objects.IntraOpCaseStaffDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.IntraOpCaseStaffDetails)domMap.get(valueObject);
			}
			// ims.clinical.vo.IntraOpCaseStaffDetailsVo ID_IntraOpCaseStaffDetails field is unknown
			domainObject = new ims.clinical.domain.objects.IntraOpCaseStaffDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_IntraOpCaseStaffDetails());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.IntraOpCaseStaffDetails)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.IntraOpCaseStaffDetails) domainFactory.getDomainObject(ims.clinical.domain.objects.IntraOpCaseStaffDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_IntraOpCaseStaffDetails());

		ims.scheduling.domain.objects.Booking_Appointment value1 = null;
		if ( null != valueObject.getTheatreAppointment() ) 
		{
			if (valueObject.getTheatreAppointment().getBoId() == null)
			{
				if (domMap.get(valueObject.getTheatreAppointment()) != null)
				{
					value1 = (ims.scheduling.domain.objects.Booking_Appointment)domMap.get(valueObject.getTheatreAppointment());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getTheatreAppointment();	
			}
			else
			{
				value1 = (ims.scheduling.domain.objects.Booking_Appointment)domainFactory.getDomainObject(ims.scheduling.domain.objects.Booking_Appointment.class, valueObject.getTheatreAppointment().getBoId());
			}
		}
		domainObject.setTheatreAppointment(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getAnaestheticType() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getAnaestheticType().getID());
		}
		domainObject.setAnaestheticType(value2);
		domainObject.setAnaesthetist(ims.core.vo.domain.MedicLiteVoAssembler.extractMedic(domainFactory, (ims.core.vo.MedicLiteVo)valueObject.getAnaesthetist(), domMap));
		domainObject.setAssistingAnaesthetist(ims.core.vo.domain.MedicLiteVoAssembler.extractMedic(domainFactory, (ims.core.vo.MedicLiteVo)valueObject.getAssistingAnaesthetist(), domMap));
		domainObject.setSupervisingAnaesthetist(ims.core.vo.domain.MedicLiteVoAssembler.extractMedic(domainFactory, (ims.core.vo.MedicLiteVo)valueObject.getSupervisingAnaesthetist(), domMap));
		domainObject.setAnaestheticPractioner(ims.core.vo.domain.MedicVoAssembler.extractMedic(domainFactory, (ims.core.vo.MedicVo)valueObject.getAnaestheticPractioner(), domMap));
		domainObject.setResponsibleHCP(ims.core.vo.domain.MedicVoAssembler.extractMedic(domainFactory, (ims.core.vo.MedicVo)valueObject.getResponsibleHCP(), domMap));
		domainObject.setOperatingSurgeon(ims.core.vo.domain.MedicVoAssembler.extractMedic(domainFactory, (ims.core.vo.MedicVo)valueObject.getOperatingSurgeon(), domMap));
		domainObject.setSupervisingSurgeon(ims.core.vo.domain.MedicVoAssembler.extractMedic(domainFactory, (ims.core.vo.MedicVo)valueObject.getSupervisingSurgeon(), domMap));
		domainObject.setAssistingSurgeons(ims.core.vo.domain.MedicLiteVoAssembler.extractMedicList(domainFactory, valueObject.getAssistingSurgeons(), domainObject.getAssistingSurgeons(), domMap));		
		domainObject.setScrubPractitioner1(ims.core.vo.domain.NurseLiteVoAssembler.extractNurse(domainFactory, valueObject.getScrubPractitioner1(), domMap));
		domainObject.setScrubPractitioner2(ims.core.vo.domain.NurseLiteVoAssembler.extractNurse(domainFactory, valueObject.getScrubPractitioner2(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOther() != null && valueObject.getOther().equals(""))
		{
			valueObject.setOther(null);
		}
		domainObject.setOther(valueObject.getOther());
		domainObject.setCirculatorScrubNurseRoles(ims.clinical.vo.domain.CirculatorScrubNurseRoleVoAssembler.extractCirculatorScrubNurseRoleList(domainFactory, valueObject.getCirculatorScrubNurseRoles(), domainObject.getCirculatorScrubNurseRoles(), domMap));		
		domainObject.setDisplayDiathermyandLaser(valueObject.getDisplayDiathermyandLaser());
		domainObject.setDisplayIrrigationCathetersDrainsTubes(valueObject.getDisplayIrrigationCathetersDrainsTubes());
		domainObject.setDisplaySpecimensWoundPackingSkinClosure(valueObject.getDisplaySpecimensWoundPackingSkinClosure());
		domainObject.setDisplayImplantsArterialClampsOtherEquipment(valueObject.getDisplayImplantsArterialClampsOtherEquipment());
		domainObject.setDisplayTourniquet(valueObject.getDisplayTourniquet());
		domainObject.setDisplayRecoveryDetails(valueObject.getDisplayRecoveryDetails());
		domainObject.setIsRecoveryInTheatre(valueObject.getIsRecoveryInTheatre());
		domainObject.setPatientAssessment(ims.assessment.vo.domain.Patient_AssessmentVoAssembler.extractPatientAssessment(domainFactory, valueObject.getPatientAssessment(), domMap));
		ims.core.clinical.domain.objects.Service value23 = null;
		if ( null != valueObject.getCaseService() ) 
		{
			if (valueObject.getCaseService().getBoId() == null)
			{
				if (domMap.get(valueObject.getCaseService()) != null)
				{
					value23 = (ims.core.clinical.domain.objects.Service)domMap.get(valueObject.getCaseService());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value23 = domainObject.getCaseService();	
			}
			else
			{
				value23 = (ims.core.clinical.domain.objects.Service)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Service.class, valueObject.getCaseService().getBoId());
			}
		}
		domainObject.setCaseService(value23);

		return domainObject;
	}

}
