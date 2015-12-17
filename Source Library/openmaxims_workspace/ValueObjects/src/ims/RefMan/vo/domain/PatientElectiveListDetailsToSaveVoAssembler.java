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
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Bogdan Tofei
 */
public class PatientElectiveListDetailsToSaveVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.PatientElectiveListDetailsToSaveVo copy(ims.RefMan.vo.PatientElectiveListDetailsToSaveVo valueObjectDest, ims.RefMan.vo.PatientElectiveListDetailsToSaveVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientElectiveList(valueObjectSrc.getID_PatientElectiveList());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ElectiveList
		valueObjectDest.setElectiveList(valueObjectSrc.getElectiveList());
		// ElectiveListStatus
		valueObjectDest.setElectiveListStatus(valueObjectSrc.getElectiveListStatus());
		// ElectiveListStatusHistory
		valueObjectDest.setElectiveListStatusHistory(valueObjectSrc.getElectiveListStatusHistory());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// Referral
		valueObjectDest.setReferral(valueObjectSrc.getReferral());
		// EpisodeOfCare
		valueObjectDest.setEpisodeOfCare(valueObjectSrc.getEpisodeOfCare());
		// Bed
		valueObjectDest.setBed(valueObjectSrc.getBed());
		// Consultant
		valueObjectDest.setConsultant(valueObjectSrc.getConsultant());
		// DateOnList
		valueObjectDest.setDateOnList(valueObjectSrc.getDateOnList());
		// OriginalDecisionDate
		valueObjectDest.setOriginalDecisionDate(valueObjectSrc.getOriginalDecisionDate());
		// ElectiveListReason
		valueObjectDest.setElectiveListReason(valueObjectSrc.getElectiveListReason());
		// ElectiveAdmissionType
		valueObjectDest.setElectiveAdmissionType(valueObjectSrc.getElectiveAdmissionType());
		// IntendedManagement
		valueObjectDest.setIntendedManagement(valueObjectSrc.getIntendedManagement());
		// AnticipatedStay
		valueObjectDest.setAnticipatedStay(valueObjectSrc.getAnticipatedStay());
		// AvailableAtShortNotice
		valueObjectDest.setAvailableAtShortNotice(valueObjectSrc.getAvailableAtShortNotice());
		// AvailableAtShortNoticePeriod
		valueObjectDest.setAvailableAtShortNoticePeriod(valueObjectSrc.getAvailableAtShortNoticePeriod());
		// Priority
		valueObjectDest.setPriority(valueObjectSrc.getPriority());
		// Suspensions
		valueObjectDest.setSuspensions(valueObjectSrc.getSuspensions());
		// OperativeProcedureStatus
		valueObjectDest.setOperativeProcedureStatus(valueObjectSrc.getOperativeProcedureStatus());
		// PrimaryProcedure
		valueObjectDest.setPrimaryProcedure(valueObjectSrc.getPrimaryProcedure());
		// ProcedureDescription
		valueObjectDest.setProcedureDescription(valueObjectSrc.getProcedureDescription());
		// OtherProcedures
		valueObjectDest.setOtherProcedures(valueObjectSrc.getOtherProcedures());
		// TCIDetails
		valueObjectDest.setTCIDetails(valueObjectSrc.getTCIDetails());
		// TCIHistory
		valueObjectDest.setTCIHistory(valueObjectSrc.getTCIHistory());
		// InterpretatorRequired
		valueObjectDest.setInterpretatorRequired(valueObjectSrc.getInterpretatorRequired());
		// Language
		valueObjectDest.setLanguage(valueObjectSrc.getLanguage());
		// TransportRequired
		valueObjectDest.setTransportRequired(valueObjectSrc.getTransportRequired());
		// Transport
		valueObjectDest.setTransport(valueObjectSrc.getTransport());
		// SpecialRequirements
		valueObjectDest.setSpecialRequirements(valueObjectSrc.getSpecialRequirements());
		// SpecialRequirementsDetails
		valueObjectDest.setSpecialRequirementsDetails(valueObjectSrc.getSpecialRequirementsDetails());
		// Notes
		valueObjectDest.setNotes(valueObjectSrc.getNotes());
		// EROD
		valueObjectDest.setEROD(valueObjectSrc.getEROD());
		// ERODHistory
		valueObjectDest.setERODHistory(valueObjectSrc.getERODHistory());
		// PathwayClock
		valueObjectDest.setPathwayClock(valueObjectSrc.getPathwayClock());
		// TCICancelledByProvider
		valueObjectDest.setTCICancelledByProvider(valueObjectSrc.getTCICancelledByProvider());
		// Reviews
		valueObjectDest.setReviews(valueObjectSrc.getReviews());
		// CurrentSuspensionEndDate
		valueObjectDest.setCurrentSuspensionEndDate(valueObjectSrc.getCurrentSuspensionEndDate());
		// PatientStatus
		valueObjectDest.setPatientStatus(valueObjectSrc.getPatientStatus());
		// ProcLaterality
		valueObjectDest.setProcLaterality(valueObjectSrc.getProcLaterality());
		// isConsultantPerformingProcedure
		valueObjectDest.setIsConsultantPerformingProcedure(valueObjectSrc.getIsConsultantPerformingProcedure());
		// CreatingAppointment
		valueObjectDest.setCreatingAppointment(valueObjectSrc.getCreatingAppointment());
		// AppointmentOutcomeAction
		valueObjectDest.setAppointmentOutcomeAction(valueObjectSrc.getAppointmentOutcomeAction());
		// numberOfProviderTCICancellations
		valueObjectDest.setNumberOfProviderTCICancellations(valueObjectSrc.getNumberOfProviderTCICancellations());
		// was28DayRuleApplied
		valueObjectDest.setWas28DayRuleApplied(valueObjectSrc.getWas28DayRuleApplied());
		// PreOperativeOvernightStayRequired
		valueObjectDest.setPreOperativeOvernightStayRequired(valueObjectSrc.getPreOperativeOvernightStayRequired());
		// WLPreOperativeOvernightStayRequired
		valueObjectDest.setWLPreOperativeOvernightStayRequired(valueObjectSrc.getWLPreOperativeOvernightStayRequired());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientElectiveListDetailsToSaveVoCollectionFromPatientElectiveList(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListDetailsToSaveVoCollection createPatientElectiveListDetailsToSaveVoCollectionFromPatientElectiveList(java.util.Set domainObjectSet)	
	{
		return createPatientElectiveListDetailsToSaveVoCollectionFromPatientElectiveList(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListDetailsToSaveVoCollection createPatientElectiveListDetailsToSaveVoCollectionFromPatientElectiveList(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.PatientElectiveListDetailsToSaveVoCollection voList = new ims.RefMan.vo.PatientElectiveListDetailsToSaveVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.PatientElectiveList domainObject = (ims.RefMan.domain.objects.PatientElectiveList) iterator.next();
			ims.RefMan.vo.PatientElectiveListDetailsToSaveVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListDetailsToSaveVoCollection createPatientElectiveListDetailsToSaveVoCollectionFromPatientElectiveList(java.util.List domainObjectList) 
	{
		return createPatientElectiveListDetailsToSaveVoCollectionFromPatientElectiveList(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListDetailsToSaveVoCollection createPatientElectiveListDetailsToSaveVoCollectionFromPatientElectiveList(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.PatientElectiveListDetailsToSaveVoCollection voList = new ims.RefMan.vo.PatientElectiveListDetailsToSaveVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.PatientElectiveList domainObject = (ims.RefMan.domain.objects.PatientElectiveList) domainObjectList.get(i);
			ims.RefMan.vo.PatientElectiveListDetailsToSaveVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.PatientElectiveList set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientElectiveListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListDetailsToSaveVoCollection voCollection) 
	 {
	 	return extractPatientElectiveListSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientElectiveListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListDetailsToSaveVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientElectiveListDetailsToSaveVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.PatientElectiveList domainObject = PatientElectiveListDetailsToSaveVoAssembler.extractPatientElectiveList(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.PatientElectiveList list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientElectiveListList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListDetailsToSaveVoCollection voCollection) 
	 {
	 	return extractPatientElectiveListList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientElectiveListList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListDetailsToSaveVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientElectiveListDetailsToSaveVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.PatientElectiveList domainObject = PatientElectiveListDetailsToSaveVoAssembler.extractPatientElectiveList(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.PatientElectiveList object.
	 * @param domainObject ims.RefMan.domain.objects.PatientElectiveList
	 */
	 public static ims.RefMan.vo.PatientElectiveListDetailsToSaveVo create(ims.RefMan.domain.objects.PatientElectiveList domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.PatientElectiveList object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.PatientElectiveListDetailsToSaveVo create(DomainObjectMap map, ims.RefMan.domain.objects.PatientElectiveList domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.PatientElectiveListDetailsToSaveVo valueObject = (ims.RefMan.vo.PatientElectiveListDetailsToSaveVo) map.getValueObject(domainObject, ims.RefMan.vo.PatientElectiveListDetailsToSaveVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.PatientElectiveListDetailsToSaveVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.PatientElectiveList
	 */
	 public static ims.RefMan.vo.PatientElectiveListDetailsToSaveVo insert(ims.RefMan.vo.PatientElectiveListDetailsToSaveVo valueObject, ims.RefMan.domain.objects.PatientElectiveList domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.PatientElectiveList
	 */
	 public static ims.RefMan.vo.PatientElectiveListDetailsToSaveVo insert(DomainObjectMap map, ims.RefMan.vo.PatientElectiveListDetailsToSaveVo valueObject, ims.RefMan.domain.objects.PatientElectiveList domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientElectiveList(domainObject.getId());
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
			
		// ElectiveList
		valueObject.setElectiveList(ims.admin.vo.domain.ElectiveListConfigurationVoAssembler.create(map, domainObject.getElectiveList()) );
		// ElectiveListStatus
		valueObject.setElectiveListStatus(ims.RefMan.vo.domain.ElectiveListStatusVoAssembler.create(map, domainObject.getElectiveListStatus()) );
		// ElectiveListStatusHistory
		valueObject.setElectiveListStatusHistory(ims.RefMan.vo.domain.ElectiveListStatusVoAssembler.createElectiveListStatusVoCollectionFromElectiveListStatus(map, domainObject.getElectiveListStatusHistory()) );
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
		// Referral
		if (domainObject.getReferral() != null)
		{
			if(domainObject.getReferral() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getReferral();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setReferral(new ims.RefMan.vo.CatsReferralRefVo(id, -1));				
			}
			else
			{
				valueObject.setReferral(new ims.RefMan.vo.CatsReferralRefVo(domainObject.getReferral().getId(), domainObject.getReferral().getVersion()));
			}
		}
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
		// Bed
		valueObject.setBed(domainObject.getBed());
		// Consultant
		valueObject.setConsultant(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getConsultant()) );
		// DateOnList
		java.util.Date DateOnList = domainObject.getDateOnList();
		if ( null != DateOnList ) 
		{
			valueObject.setDateOnList(new ims.framework.utils.Date(DateOnList) );
		}
		// OriginalDecisionDate
		java.util.Date OriginalDecisionDate = domainObject.getOriginalDecisionDate();
		if ( null != OriginalDecisionDate ) 
		{
			valueObject.setOriginalDecisionDate(new ims.framework.utils.Date(OriginalDecisionDate) );
		}
		// ElectiveListReason
		ims.domain.lookups.LookupInstance instance11 = domainObject.getElectiveListReason();
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

			ims.emergency.vo.lookups.ElectiveListReason voLookup11 = new ims.emergency.vo.lookups.ElectiveListReason(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.emergency.vo.lookups.ElectiveListReason parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.emergency.vo.lookups.ElectiveListReason(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setElectiveListReason(voLookup11);
		}
				// ElectiveAdmissionType
		ims.domain.lookups.LookupInstance instance12 = domainObject.getElectiveAdmissionType();
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

			ims.RefMan.vo.lookups.ElectiveAdmissionType voLookup12 = new ims.RefMan.vo.lookups.ElectiveAdmissionType(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ElectiveAdmissionType parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.RefMan.vo.lookups.ElectiveAdmissionType(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setElectiveAdmissionType(voLookup12);
		}
				// IntendedManagement
		ims.domain.lookups.LookupInstance instance13 = domainObject.getIntendedManagement();
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

			ims.core.vo.lookups.ManagementIntention voLookup13 = new ims.core.vo.lookups.ManagementIntention(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.core.vo.lookups.ManagementIntention parentVoLookup13 = voLookup13;
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
								parentVoLookup13.setParent(new ims.core.vo.lookups.ManagementIntention(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setIntendedManagement(voLookup13);
		}
				// AnticipatedStay
		valueObject.setAnticipatedStay(domainObject.getAnticipatedStay());
		// AvailableAtShortNotice
		valueObject.setAvailableAtShortNotice( domainObject.isAvailableAtShortNotice() );
		// AvailableAtShortNoticePeriod
		valueObject.setAvailableAtShortNoticePeriod(domainObject.getAvailableAtShortNoticePeriod());
		// Priority
		ims.domain.lookups.LookupInstance instance17 = domainObject.getPriority();
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

			ims.RefMan.vo.lookups.ReferralUrgency voLookup17 = new ims.RefMan.vo.lookups.ReferralUrgency(instance17.getId(),instance17.getText(), instance17.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ReferralUrgency parentVoLookup17 = voLookup17;
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
								parentVoLookup17.setParent(new ims.RefMan.vo.lookups.ReferralUrgency(parent17.getId(),parent17.getText(), parent17.isActive(), null, img, color));
				parentVoLookup17 = parentVoLookup17.getParent();
								parent17 = parent17.getParent();
			}			
			valueObject.setPriority(voLookup17);
		}
				// Suspensions
		ims.RefMan.vo.SuspensionDetailsForPatientElectiveListRefVoCollection Suspensions = new ims.RefMan.vo.SuspensionDetailsForPatientElectiveListRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getSuspensions().iterator(); iterator.hasNext(); ) 
		{
			ims.RefMan.domain.objects.SuspensionDetailsForPatientElectiveList tmp = (ims.RefMan.domain.objects.SuspensionDetailsForPatientElectiveList)iterator.next();
			if (tmp != null)
				Suspensions.add(new ims.RefMan.vo.SuspensionDetailsForPatientElectiveListRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setSuspensions(Suspensions);
		// OperativeProcedureStatus
		valueObject.setOperativeProcedureStatus( domainObject.isOperativeProcedureStatus() );
		// PrimaryProcedure
		valueObject.setPrimaryProcedure(ims.core.vo.domain.ProcedureLiteVoAssembler.create(map, domainObject.getPrimaryProcedure()) );
		// ProcedureDescription
		valueObject.setProcedureDescription(domainObject.getProcedureDescription());
		// OtherProcedures
		ims.core.clinical.vo.ProcedureRefVoCollection OtherProcedures = new ims.core.clinical.vo.ProcedureRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getOtherProcedures().iterator(); iterator.hasNext(); ) 
		{
			ims.core.clinical.domain.objects.Procedure tmp = (ims.core.clinical.domain.objects.Procedure)iterator.next();
			if (tmp != null)
				OtherProcedures.add(new ims.core.clinical.vo.ProcedureRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setOtherProcedures(OtherProcedures);
		// TCIDetails
		valueObject.setTCIDetails(ims.RefMan.vo.domain.PatientElectiveListTCIVoAssembler.create(map, domainObject.getTCIDetails()) );
		// TCIHistory
		valueObject.setTCIHistory(ims.RefMan.vo.domain.PatientElectiveListTCIVoAssembler.createPatientElectiveListTCIVoCollectionFromTCIForPatientElectiveList(map, domainObject.getTCIHistory()) );
		// InterpretatorRequired
		valueObject.setInterpretatorRequired( domainObject.isInterpretatorRequired() );
		// Language
		ims.domain.lookups.LookupInstance instance26 = domainObject.getLanguage();
		if ( null != instance26 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance26.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance26.getImage().getImageId(), instance26.getImage().getImagePath());
			}
			color = instance26.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.Language voLookup26 = new ims.core.vo.lookups.Language(instance26.getId(),instance26.getText(), instance26.isActive(), null, img, color);
			ims.core.vo.lookups.Language parentVoLookup26 = voLookup26;
			ims.domain.lookups.LookupInstance parent26 = instance26.getParent();
			while (parent26 != null)
			{
				if (parent26.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent26.getImage().getImageId(), parent26.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent26.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup26.setParent(new ims.core.vo.lookups.Language(parent26.getId(),parent26.getText(), parent26.isActive(), null, img, color));
				parentVoLookup26 = parentVoLookup26.getParent();
								parent26 = parent26.getParent();
			}			
			valueObject.setLanguage(voLookup26);
		}
				// TransportRequired
		valueObject.setTransportRequired( domainObject.isTransportRequired() );
		// Transport
		ims.domain.lookups.LookupInstance instance28 = domainObject.getTransport();
		if ( null != instance28 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance28.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance28.getImage().getImageId(), instance28.getImage().getImagePath());
			}
			color = instance28.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.ApptTransportType voLookup28 = new ims.scheduling.vo.lookups.ApptTransportType(instance28.getId(),instance28.getText(), instance28.isActive(), null, img, color);
			ims.scheduling.vo.lookups.ApptTransportType parentVoLookup28 = voLookup28;
			ims.domain.lookups.LookupInstance parent28 = instance28.getParent();
			while (parent28 != null)
			{
				if (parent28.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent28.getImage().getImageId(), parent28.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent28.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup28.setParent(new ims.scheduling.vo.lookups.ApptTransportType(parent28.getId(),parent28.getText(), parent28.isActive(), null, img, color));
				parentVoLookup28 = parentVoLookup28.getParent();
								parent28 = parent28.getParent();
			}			
			valueObject.setTransport(voLookup28);
		}
				// SpecialRequirements
		valueObject.setSpecialRequirements( domainObject.isSpecialRequirements() );
		// SpecialRequirementsDetails
		valueObject.setSpecialRequirementsDetails(domainObject.getSpecialRequirementsDetails());
		// Notes
		valueObject.setNotes(ims.RefMan.vo.domain.PatientElectiveListNotesVoAssembler.createPatientElectiveListNotesVoCollectionFromNotesForPatientElectiveList(map, domainObject.getNotes()) );
		// EROD
		valueObject.setEROD(ims.RefMan.vo.domain.ReferralERODVoAssembler.create(map, domainObject.getEROD()) );
		// ERODHistory
		ims.RefMan.vo.ReferralERODRefVoCollection ERODHistory = new ims.RefMan.vo.ReferralERODRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getERODHistory().iterator(); iterator.hasNext(); ) 
		{
			ims.RefMan.domain.objects.ReferralEROD tmp = (ims.RefMan.domain.objects.ReferralEROD)iterator.next();
			if (tmp != null)
				ERODHistory.add(new ims.RefMan.vo.ReferralERODRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setERODHistory(ERODHistory);
		// PathwayClock
		if (domainObject.getPathwayClock() != null)
		{
			if(domainObject.getPathwayClock() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPathwayClock();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPathwayClock(new ims.pathways.vo.PathwayClockRefVo(id, -1));				
			}
			else
			{
				valueObject.setPathwayClock(new ims.pathways.vo.PathwayClockRefVo(domainObject.getPathwayClock().getId(), domainObject.getPathwayClock().getVersion()));
			}
		}
		// TCICancelledByProvider
		valueObject.setTCICancelledByProvider( domainObject.isTCICancelledByProvider() );
		// Reviews
		valueObject.setReviews(ims.RefMan.vo.domain.ReviewPatientElectiveListVoAssembler.createReviewPatientElectiveListVoCollectionFromReviewPatientElectiveList(map, domainObject.getReviews()) );
		// CurrentSuspensionEndDate
		java.util.Date CurrentSuspensionEndDate = domainObject.getCurrentSuspensionEndDate();
		if ( null != CurrentSuspensionEndDate ) 
		{
			valueObject.setCurrentSuspensionEndDate(new ims.framework.utils.DateTime(CurrentSuspensionEndDate) );
		}
		// PatientStatus
		ims.domain.lookups.LookupInstance instance38 = domainObject.getPatientStatus();
		if ( null != instance38 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance38.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance38.getImage().getImageId(), instance38.getImage().getImagePath());
			}
			color = instance38.getColor();
			if (color != null) 
				color.getValue();

			ims.RefMan.vo.lookups.CatsReferralCategory voLookup38 = new ims.RefMan.vo.lookups.CatsReferralCategory(instance38.getId(),instance38.getText(), instance38.isActive(), null, img, color);
			ims.RefMan.vo.lookups.CatsReferralCategory parentVoLookup38 = voLookup38;
			ims.domain.lookups.LookupInstance parent38 = instance38.getParent();
			while (parent38 != null)
			{
				if (parent38.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent38.getImage().getImageId(), parent38.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent38.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup38.setParent(new ims.RefMan.vo.lookups.CatsReferralCategory(parent38.getId(),parent38.getText(), parent38.isActive(), null, img, color));
				parentVoLookup38 = parentVoLookup38.getParent();
								parent38 = parent38.getParent();
			}			
			valueObject.setPatientStatus(voLookup38);
		}
				// ProcLaterality
		ims.domain.lookups.LookupInstance instance39 = domainObject.getProcLaterality();
		if ( null != instance39 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance39.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance39.getImage().getImageId(), instance39.getImage().getImagePath());
			}
			color = instance39.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.LateralityLRB voLookup39 = new ims.core.vo.lookups.LateralityLRB(instance39.getId(),instance39.getText(), instance39.isActive(), null, img, color);
			ims.core.vo.lookups.LateralityLRB parentVoLookup39 = voLookup39;
			ims.domain.lookups.LookupInstance parent39 = instance39.getParent();
			while (parent39 != null)
			{
				if (parent39.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent39.getImage().getImageId(), parent39.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent39.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup39.setParent(new ims.core.vo.lookups.LateralityLRB(parent39.getId(),parent39.getText(), parent39.isActive(), null, img, color));
				parentVoLookup39 = parentVoLookup39.getParent();
								parent39 = parent39.getParent();
			}			
			valueObject.setProcLaterality(voLookup39);
		}
				// isConsultantPerformingProcedure
		valueObject.setIsConsultantPerformingProcedure( domainObject.isIsConsultantPerformingProcedure() );
		// CreatingAppointment
		if (domainObject.getCreatingAppointment() != null)
		{
			if(domainObject.getCreatingAppointment() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCreatingAppointment();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCreatingAppointment(new ims.scheduling.vo.Booking_AppointmentRefVo(id, -1));				
			}
			else
			{
				valueObject.setCreatingAppointment(new ims.scheduling.vo.Booking_AppointmentRefVo(domainObject.getCreatingAppointment().getId(), domainObject.getCreatingAppointment().getVersion()));
			}
		}
		// AppointmentOutcomeAction
		if (domainObject.getAppointmentOutcomeAction() != null)
		{
			if(domainObject.getAppointmentOutcomeAction() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAppointmentOutcomeAction();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAppointmentOutcomeAction(new ims.scheduling.vo.AppointmentOutcomeActionRefVo(id, -1));				
			}
			else
			{
				valueObject.setAppointmentOutcomeAction(new ims.scheduling.vo.AppointmentOutcomeActionRefVo(domainObject.getAppointmentOutcomeAction().getId(), domainObject.getAppointmentOutcomeAction().getVersion()));
			}
		}
		// numberOfProviderTCICancellations
		valueObject.setNumberOfProviderTCICancellations(domainObject.getNumberOfProviderTCICancellations());
		// was28DayRuleApplied
		valueObject.setWas28DayRuleApplied( domainObject.isWas28DayRuleApplied() );
		// PreOperativeOvernightStayRequired
		valueObject.setPreOperativeOvernightStayRequired( domainObject.isPreOperativeOvernightStayRequired() );
		// WLPreOperativeOvernightStayRequired
		valueObject.setWLPreOperativeOvernightStayRequired( domainObject.isWLPreOperativeOvernightStayRequired() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.PatientElectiveList extractPatientElectiveList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListDetailsToSaveVo valueObject) 
	{
		return 	extractPatientElectiveList(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.PatientElectiveList extractPatientElectiveList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListDetailsToSaveVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientElectiveList();
		ims.RefMan.domain.objects.PatientElectiveList domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.PatientElectiveList)domMap.get(valueObject);
			}
			// ims.RefMan.vo.PatientElectiveListDetailsToSaveVo ID_PatientElectiveList field is unknown
			domainObject = new ims.RefMan.domain.objects.PatientElectiveList();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientElectiveList());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.PatientElectiveList)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.PatientElectiveList) domainFactory.getDomainObject(ims.RefMan.domain.objects.PatientElectiveList.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientElectiveList());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.configuration.domain.objects.ElectiveListConfiguration value1 = null;
		if ( null != valueObject.getElectiveList() ) 
		{
			if (valueObject.getElectiveList().getBoId() == null)
			{
				if (domMap.get(valueObject.getElectiveList()) != null)
				{
					value1 = (ims.core.configuration.domain.objects.ElectiveListConfiguration)domMap.get(valueObject.getElectiveList());
				}
			}
			else
			{
				value1 = (ims.core.configuration.domain.objects.ElectiveListConfiguration)domainFactory.getDomainObject(ims.core.configuration.domain.objects.ElectiveListConfiguration.class, valueObject.getElectiveList().getBoId());
			}
		}
		domainObject.setElectiveList(value1);
		domainObject.setElectiveListStatus(ims.RefMan.vo.domain.ElectiveListStatusVoAssembler.extractElectiveListStatus(domainFactory, valueObject.getElectiveListStatus(), domMap));
		domainObject.setElectiveListStatusHistory(ims.RefMan.vo.domain.ElectiveListStatusVoAssembler.extractElectiveListStatusList(domainFactory, valueObject.getElectiveListStatusHistory(), domainObject.getElectiveListStatusHistory(), domMap));		
		ims.core.patient.domain.objects.Patient value4 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value4 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getPatient();	
			}
			else
			{
				value4 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value4);
		ims.RefMan.domain.objects.CatsReferral value5 = null;
		if ( null != valueObject.getReferral() ) 
		{
			if (valueObject.getReferral().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferral()) != null)
				{
					value5 = (ims.RefMan.domain.objects.CatsReferral)domMap.get(valueObject.getReferral());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value5 = domainObject.getReferral();	
			}
			else
			{
				value5 = (ims.RefMan.domain.objects.CatsReferral)domainFactory.getDomainObject(ims.RefMan.domain.objects.CatsReferral.class, valueObject.getReferral().getBoId());
			}
		}
		domainObject.setReferral(value5);
		ims.core.admin.domain.objects.EpisodeOfCare value6 = null;
		if ( null != valueObject.getEpisodeOfCare() ) 
		{
			if (valueObject.getEpisodeOfCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisodeOfCare()) != null)
				{
					value6 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisodeOfCare());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value6 = domainObject.getEpisodeOfCare();	
			}
			else
			{
				value6 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisodeOfCare().getBoId());
			}
		}
		domainObject.setEpisodeOfCare(value6);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getBed() != null && valueObject.getBed().equals(""))
		{
			valueObject.setBed(null);
		}
		domainObject.setBed(valueObject.getBed());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value8 = null;
		if ( null != valueObject.getConsultant() ) 
		{
			if (valueObject.getConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getConsultant()) != null)
				{
					value8 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getConsultant());
				}
			}
			else
			{
				value8 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getConsultant().getBoId());
			}
		}
		domainObject.setConsultant(value8);
		java.util.Date value9 = null;
		ims.framework.utils.Date date9 = valueObject.getDateOnList();		
		if ( date9 != null ) 
		{
			value9 = date9.getDate();
		}
		domainObject.setDateOnList(value9);
		java.util.Date value10 = null;
		ims.framework.utils.Date date10 = valueObject.getOriginalDecisionDate();		
		if ( date10 != null ) 
		{
			value10 = date10.getDate();
		}
		domainObject.setOriginalDecisionDate(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getElectiveListReason() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getElectiveListReason().getID());
		}
		domainObject.setElectiveListReason(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getElectiveAdmissionType() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getElectiveAdmissionType().getID());
		}
		domainObject.setElectiveAdmissionType(value12);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getIntendedManagement() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getIntendedManagement().getID());
		}
		domainObject.setIntendedManagement(value13);
		domainObject.setAnticipatedStay(valueObject.getAnticipatedStay());
		domainObject.setAvailableAtShortNotice(valueObject.getAvailableAtShortNotice());
		domainObject.setAvailableAtShortNoticePeriod(valueObject.getAvailableAtShortNoticePeriod());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value17 = null;
		if ( null != valueObject.getPriority() ) 
		{
			value17 =
				domainFactory.getLookupInstance(valueObject.getPriority().getID());
		}
		domainObject.setPriority(value17);

		ims.RefMan.vo.SuspensionDetailsForPatientElectiveListRefVoCollection refCollection18 = valueObject.getSuspensions();
		int size18 = (null == refCollection18) ? 0 : refCollection18.size();		
		java.util.List domainSuspensions18 = domainObject.getSuspensions();
		if (domainSuspensions18 == null)
		{
			domainSuspensions18 = new java.util.ArrayList();
		}
		for(int i=0; i < size18; i++) 
		{
			ims.RefMan.vo.SuspensionDetailsForPatientElectiveListRefVo vo = refCollection18.get(i);			
			ims.RefMan.domain.objects.SuspensionDetailsForPatientElectiveList dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.RefMan.domain.objects.SuspensionDetailsForPatientElectiveList)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.RefMan.domain.objects.SuspensionDetailsForPatientElectiveList)domainFactory.getDomainObject( ims.RefMan.domain.objects.SuspensionDetailsForPatientElectiveList.class, vo.getBoId());
				}
			}

			int domIdx = domainSuspensions18.indexOf(dom);
			if (domIdx == -1)
			{
				domainSuspensions18.add(i, dom);
			}
			else if (i != domIdx && i < domainSuspensions18.size())
			{
				Object tmp = domainSuspensions18.get(i);
				domainSuspensions18.set(i, domainSuspensions18.get(domIdx));
				domainSuspensions18.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i18 = domainSuspensions18.size();
		while (i18 > size18)
		{
			domainSuspensions18.remove(i18-1);
			i18 = domainSuspensions18.size();
		}
		
		domainObject.setSuspensions(domainSuspensions18);		
		domainObject.setOperativeProcedureStatus(valueObject.getOperativeProcedureStatus());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Procedure value20 = null;
		if ( null != valueObject.getPrimaryProcedure() ) 
		{
			if (valueObject.getPrimaryProcedure().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrimaryProcedure()) != null)
				{
					value20 = (ims.core.clinical.domain.objects.Procedure)domMap.get(valueObject.getPrimaryProcedure());
				}
			}
			else
			{
				value20 = (ims.core.clinical.domain.objects.Procedure)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Procedure.class, valueObject.getPrimaryProcedure().getBoId());
			}
		}
		domainObject.setPrimaryProcedure(value20);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getProcedureDescription() != null && valueObject.getProcedureDescription().equals(""))
		{
			valueObject.setProcedureDescription(null);
		}
		domainObject.setProcedureDescription(valueObject.getProcedureDescription());

		ims.core.clinical.vo.ProcedureRefVoCollection refCollection22 = valueObject.getOtherProcedures();
		int size22 = (null == refCollection22) ? 0 : refCollection22.size();		
		java.util.List domainOtherProcedures22 = domainObject.getOtherProcedures();
		if (domainOtherProcedures22 == null)
		{
			domainOtherProcedures22 = new java.util.ArrayList();
		}
		for(int i=0; i < size22; i++) 
		{
			ims.core.clinical.vo.ProcedureRefVo vo = refCollection22.get(i);			
			ims.core.clinical.domain.objects.Procedure dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.clinical.domain.objects.Procedure)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.clinical.domain.objects.Procedure)domainFactory.getDomainObject( ims.core.clinical.domain.objects.Procedure.class, vo.getBoId());
				}
			}

			int domIdx = domainOtherProcedures22.indexOf(dom);
			if (domIdx == -1)
			{
				domainOtherProcedures22.add(i, dom);
			}
			else if (i != domIdx && i < domainOtherProcedures22.size())
			{
				Object tmp = domainOtherProcedures22.get(i);
				domainOtherProcedures22.set(i, domainOtherProcedures22.get(domIdx));
				domainOtherProcedures22.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i22 = domainOtherProcedures22.size();
		while (i22 > size22)
		{
			domainOtherProcedures22.remove(i22-1);
			i22 = domainOtherProcedures22.size();
		}
		
		domainObject.setOtherProcedures(domainOtherProcedures22);		
		domainObject.setTCIDetails(ims.RefMan.vo.domain.PatientElectiveListTCIVoAssembler.extractTCIForPatientElectiveList(domainFactory, valueObject.getTCIDetails(), domMap));
		domainObject.setTCIHistory(ims.RefMan.vo.domain.PatientElectiveListTCIVoAssembler.extractTCIForPatientElectiveListList(domainFactory, valueObject.getTCIHistory(), domainObject.getTCIHistory(), domMap));		
		domainObject.setInterpretatorRequired(valueObject.getInterpretatorRequired());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value26 = null;
		if ( null != valueObject.getLanguage() ) 
		{
			value26 =
				domainFactory.getLookupInstance(valueObject.getLanguage().getID());
		}
		domainObject.setLanguage(value26);
		domainObject.setTransportRequired(valueObject.getTransportRequired());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value28 = null;
		if ( null != valueObject.getTransport() ) 
		{
			value28 =
				domainFactory.getLookupInstance(valueObject.getTransport().getID());
		}
		domainObject.setTransport(value28);
		domainObject.setSpecialRequirements(valueObject.getSpecialRequirements());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSpecialRequirementsDetails() != null && valueObject.getSpecialRequirementsDetails().equals(""))
		{
			valueObject.setSpecialRequirementsDetails(null);
		}
		domainObject.setSpecialRequirementsDetails(valueObject.getSpecialRequirementsDetails());
		domainObject.setNotes(ims.RefMan.vo.domain.PatientElectiveListNotesVoAssembler.extractNotesForPatientElectiveListSet(domainFactory, valueObject.getNotes(), domainObject.getNotes(), domMap));		
		domainObject.setEROD(ims.RefMan.vo.domain.ReferralERODVoAssembler.extractReferralEROD(domainFactory, valueObject.getEROD(), domMap));

		ims.RefMan.vo.ReferralERODRefVoCollection refCollection33 = valueObject.getERODHistory();
		int size33 = (null == refCollection33) ? 0 : refCollection33.size();		
		java.util.List domainERODHistory33 = domainObject.getERODHistory();
		if (domainERODHistory33 == null)
		{
			domainERODHistory33 = new java.util.ArrayList();
		}
		for(int i=0; i < size33; i++) 
		{
			ims.RefMan.vo.ReferralERODRefVo vo = refCollection33.get(i);			
			ims.RefMan.domain.objects.ReferralEROD dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.RefMan.domain.objects.ReferralEROD)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.RefMan.domain.objects.ReferralEROD)domainFactory.getDomainObject( ims.RefMan.domain.objects.ReferralEROD.class, vo.getBoId());
				}
			}

			int domIdx = domainERODHistory33.indexOf(dom);
			if (domIdx == -1)
			{
				domainERODHistory33.add(i, dom);
			}
			else if (i != domIdx && i < domainERODHistory33.size())
			{
				Object tmp = domainERODHistory33.get(i);
				domainERODHistory33.set(i, domainERODHistory33.get(domIdx));
				domainERODHistory33.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i33 = domainERODHistory33.size();
		while (i33 > size33)
		{
			domainERODHistory33.remove(i33-1);
			i33 = domainERODHistory33.size();
		}
		
		domainObject.setERODHistory(domainERODHistory33);		
		ims.pathways.domain.objects.PathwayClock value34 = null;
		if ( null != valueObject.getPathwayClock() ) 
		{
			if (valueObject.getPathwayClock().getBoId() == null)
			{
				if (domMap.get(valueObject.getPathwayClock()) != null)
				{
					value34 = (ims.pathways.domain.objects.PathwayClock)domMap.get(valueObject.getPathwayClock());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value34 = domainObject.getPathwayClock();	
			}
			else
			{
				value34 = (ims.pathways.domain.objects.PathwayClock)domainFactory.getDomainObject(ims.pathways.domain.objects.PathwayClock.class, valueObject.getPathwayClock().getBoId());
			}
		}
		domainObject.setPathwayClock(value34);
		domainObject.setTCICancelledByProvider(valueObject.getTCICancelledByProvider());
		domainObject.setReviews(ims.RefMan.vo.domain.ReviewPatientElectiveListVoAssembler.extractReviewPatientElectiveListSet(domainFactory, valueObject.getReviews(), domainObject.getReviews(), domMap));		
		ims.framework.utils.DateTime dateTime37 = valueObject.getCurrentSuspensionEndDate();
		java.util.Date value37 = null;
		if ( dateTime37 != null ) 
		{
			value37 = dateTime37.getJavaDate();
		}
		domainObject.setCurrentSuspensionEndDate(value37);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value38 = null;
		if ( null != valueObject.getPatientStatus() ) 
		{
			value38 =
				domainFactory.getLookupInstance(valueObject.getPatientStatus().getID());
		}
		domainObject.setPatientStatus(value38);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value39 = null;
		if ( null != valueObject.getProcLaterality() ) 
		{
			value39 =
				domainFactory.getLookupInstance(valueObject.getProcLaterality().getID());
		}
		domainObject.setProcLaterality(value39);
		domainObject.setIsConsultantPerformingProcedure(valueObject.getIsConsultantPerformingProcedure());
		ims.scheduling.domain.objects.Booking_Appointment value41 = null;
		if ( null != valueObject.getCreatingAppointment() ) 
		{
			if (valueObject.getCreatingAppointment().getBoId() == null)
			{
				if (domMap.get(valueObject.getCreatingAppointment()) != null)
				{
					value41 = (ims.scheduling.domain.objects.Booking_Appointment)domMap.get(valueObject.getCreatingAppointment());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value41 = domainObject.getCreatingAppointment();	
			}
			else
			{
				value41 = (ims.scheduling.domain.objects.Booking_Appointment)domainFactory.getDomainObject(ims.scheduling.domain.objects.Booking_Appointment.class, valueObject.getCreatingAppointment().getBoId());
			}
		}
		domainObject.setCreatingAppointment(value41);
		ims.scheduling.domain.objects.AppointmentOutcomeAction value42 = null;
		if ( null != valueObject.getAppointmentOutcomeAction() ) 
		{
			if (valueObject.getAppointmentOutcomeAction().getBoId() == null)
			{
				if (domMap.get(valueObject.getAppointmentOutcomeAction()) != null)
				{
					value42 = (ims.scheduling.domain.objects.AppointmentOutcomeAction)domMap.get(valueObject.getAppointmentOutcomeAction());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value42 = domainObject.getAppointmentOutcomeAction();	
			}
			else
			{
				value42 = (ims.scheduling.domain.objects.AppointmentOutcomeAction)domainFactory.getDomainObject(ims.scheduling.domain.objects.AppointmentOutcomeAction.class, valueObject.getAppointmentOutcomeAction().getBoId());
			}
		}
		domainObject.setAppointmentOutcomeAction(value42);
		domainObject.setNumberOfProviderTCICancellations(valueObject.getNumberOfProviderTCICancellations());
		domainObject.setWas28DayRuleApplied(valueObject.getWas28DayRuleApplied());
		domainObject.setPreOperativeOvernightStayRequired(valueObject.getPreOperativeOvernightStayRequired());
		domainObject.setWLPreOperativeOvernightStayRequired(valueObject.getWLPreOperativeOvernightStayRequired());

		return domainObject;
	}

}
