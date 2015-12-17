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
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Florin Blindu
 */
public class PatientElectiveListVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.PatientElectiveListVo copy(ims.RefMan.vo.PatientElectiveListVo valueObjectDest, ims.RefMan.vo.PatientElectiveListVo valueObjectSrc) 
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
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// Referral
		valueObjectDest.setReferral(valueObjectSrc.getReferral());
		// EpisodeOfCare
		valueObjectDest.setEpisodeOfCare(valueObjectSrc.getEpisodeOfCare());
		// Consultant
		valueObjectDest.setConsultant(valueObjectSrc.getConsultant());
		// DateOnList
		valueObjectDest.setDateOnList(valueObjectSrc.getDateOnList());
		// OriginalDecisionDate
		valueObjectDest.setOriginalDecisionDate(valueObjectSrc.getOriginalDecisionDate());
		// IntendedManagement
		valueObjectDest.setIntendedManagement(valueObjectSrc.getIntendedManagement());
		// AnticipatedStay
		valueObjectDest.setAnticipatedStay(valueObjectSrc.getAnticipatedStay());
		// Priority
		valueObjectDest.setPriority(valueObjectSrc.getPriority());
		// Suspensions
		valueObjectDest.setSuspensions(valueObjectSrc.getSuspensions());
		// OperativeProcedureStatus
		valueObjectDest.setOperativeProcedureStatus(valueObjectSrc.getOperativeProcedureStatus());
		// PrimaryProcedure
		valueObjectDest.setPrimaryProcedure(valueObjectSrc.getPrimaryProcedure());
		// OtherProcedures
		valueObjectDest.setOtherProcedures(valueObjectSrc.getOtherProcedures());
		// TCIHistory
		valueObjectDest.setTCIHistory(valueObjectSrc.getTCIHistory());
		// InterpretatorRequired
		valueObjectDest.setInterpretatorRequired(valueObjectSrc.getInterpretatorRequired());
		// Transport
		valueObjectDest.setTransport(valueObjectSrc.getTransport());
		// Notes
		valueObjectDest.setNotes(valueObjectSrc.getNotes());
		// ElectiveAdmissionType
		valueObjectDest.setElectiveAdmissionType(valueObjectSrc.getElectiveAdmissionType());
		// EROD
		valueObjectDest.setEROD(valueObjectSrc.getEROD());
		// TCIDetails
		valueObjectDest.setTCIDetails(valueObjectSrc.getTCIDetails());
		// ElectiveListStatusHistory
		valueObjectDest.setElectiveListStatusHistory(valueObjectSrc.getElectiveListStatusHistory());
		// ElectiveListReason
		valueObjectDest.setElectiveListReason(valueObjectSrc.getElectiveListReason());
		// PathwayClock
		valueObjectDest.setPathwayClock(valueObjectSrc.getPathwayClock());
		// ERODHistory
		valueObjectDest.setERODHistory(valueObjectSrc.getERODHistory());
		// TCICancelledByProvider
		valueObjectDest.setTCICancelledByProvider(valueObjectSrc.getTCICancelledByProvider());
		// Bed
		valueObjectDest.setBed(valueObjectSrc.getBed());
		// TransportRequired
		valueObjectDest.setTransportRequired(valueObjectSrc.getTransportRequired());
		// ProcedureDescription
		valueObjectDest.setProcedureDescription(valueObjectSrc.getProcedureDescription());
		// Language
		valueObjectDest.setLanguage(valueObjectSrc.getLanguage());
		// PatientStatus
		valueObjectDest.setPatientStatus(valueObjectSrc.getPatientStatus());
		// was28DayRuleApplied
		valueObjectDest.setWas28DayRuleApplied(valueObjectSrc.getWas28DayRuleApplied());
		// SubjectTo28DayRule
		valueObjectDest.setSubjectTo28DayRule(valueObjectSrc.getSubjectTo28DayRule());
		// Rule28DayStatus
		valueObjectDest.setRule28DayStatus(valueObjectSrc.getRule28DayStatus());
		// Rule28DayPeriodStart
		valueObjectDest.setRule28DayPeriodStart(valueObjectSrc.getRule28DayPeriodStart());
		// PreOperativeOvernightStayRequired
		valueObjectDest.setPreOperativeOvernightStayRequired(valueObjectSrc.getPreOperativeOvernightStayRequired());
		// NoOfPreOperativeNights
		valueObjectDest.setNoOfPreOperativeNights(valueObjectSrc.getNoOfPreOperativeNights());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientElectiveListVoCollectionFromPatientElectiveList(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListVoCollection createPatientElectiveListVoCollectionFromPatientElectiveList(java.util.Set domainObjectSet)	
	{
		return createPatientElectiveListVoCollectionFromPatientElectiveList(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListVoCollection createPatientElectiveListVoCollectionFromPatientElectiveList(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.PatientElectiveListVoCollection voList = new ims.RefMan.vo.PatientElectiveListVoCollection();
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
			ims.RefMan.vo.PatientElectiveListVo vo = create(map, domainObject);
			
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
	public static ims.RefMan.vo.PatientElectiveListVoCollection createPatientElectiveListVoCollectionFromPatientElectiveList(java.util.List domainObjectList) 
	{
		return createPatientElectiveListVoCollectionFromPatientElectiveList(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListVoCollection createPatientElectiveListVoCollectionFromPatientElectiveList(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.PatientElectiveListVoCollection voList = new ims.RefMan.vo.PatientElectiveListVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.PatientElectiveList domainObject = (ims.RefMan.domain.objects.PatientElectiveList) domainObjectList.get(i);
			ims.RefMan.vo.PatientElectiveListVo vo = create(map, domainObject);

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
	 public static java.util.Set extractPatientElectiveListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListVoCollection voCollection) 
	 {
	 	return extractPatientElectiveListSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientElectiveListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientElectiveListVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.PatientElectiveList domainObject = PatientElectiveListVoAssembler.extractPatientElectiveList(domainFactory, vo, domMap);

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
	 public static java.util.List extractPatientElectiveListList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListVoCollection voCollection) 
	 {
	 	return extractPatientElectiveListList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientElectiveListList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientElectiveListVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.PatientElectiveList domainObject = PatientElectiveListVoAssembler.extractPatientElectiveList(domainFactory, vo, domMap);

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
	 public static ims.RefMan.vo.PatientElectiveListVo create(ims.RefMan.domain.objects.PatientElectiveList domainObject) 
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
	  public static ims.RefMan.vo.PatientElectiveListVo create(DomainObjectMap map, ims.RefMan.domain.objects.PatientElectiveList domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.PatientElectiveListVo valueObject = (ims.RefMan.vo.PatientElectiveListVo) map.getValueObject(domainObject, ims.RefMan.vo.PatientElectiveListVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.PatientElectiveListVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.RefMan.vo.PatientElectiveListVo insert(ims.RefMan.vo.PatientElectiveListVo valueObject, ims.RefMan.domain.objects.PatientElectiveList domainObject) 
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
	 public static ims.RefMan.vo.PatientElectiveListVo insert(DomainObjectMap map, ims.RefMan.vo.PatientElectiveListVo valueObject, ims.RefMan.domain.objects.PatientElectiveList domainObject) 
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
		// Consultant
		valueObject.setConsultant(ims.core.vo.domain.HcpMinVoAssembler.create(map, domainObject.getConsultant()) );
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
		// IntendedManagement
		ims.domain.lookups.LookupInstance instance9 = domainObject.getIntendedManagement();
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

			ims.core.vo.lookups.ManagementIntention voLookup9 = new ims.core.vo.lookups.ManagementIntention(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.ManagementIntention parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.core.vo.lookups.ManagementIntention(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setIntendedManagement(voLookup9);
		}
				// AnticipatedStay
		valueObject.setAnticipatedStay(domainObject.getAnticipatedStay());
		// Priority
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

			ims.RefMan.vo.lookups.ReferralUrgency voLookup11 = new ims.RefMan.vo.lookups.ReferralUrgency(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ReferralUrgency parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.RefMan.vo.lookups.ReferralUrgency(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setPriority(voLookup11);
		}
				// Suspensions
		valueObject.setSuspensions(ims.RefMan.vo.domain.SuspensionDetailsForPatientElectiveListVoAssembler.createSuspensionDetailsForPatientElectiveListVoCollectionFromSuspensionDetailsForPatientElectiveList(map, domainObject.getSuspensions()) );
		// OperativeProcedureStatus
		valueObject.setOperativeProcedureStatus( domainObject.isOperativeProcedureStatus() );
		// PrimaryProcedure
		valueObject.setPrimaryProcedure(ims.core.vo.domain.ProcedureLiteVoAssembler.create(map, domainObject.getPrimaryProcedure()) );
		// OtherProcedures
		valueObject.setOtherProcedures(ims.core.vo.domain.ProcedureLiteVoAssembler.createProcedureLiteVoCollectionFromProcedure(map, domainObject.getOtherProcedures()) );
		// TCIHistory
		valueObject.setTCIHistory(ims.RefMan.vo.domain.PatientElectiveListElectiveTCIVoAssembler.createPatientElectiveListElectiveTCIVoCollectionFromTCIForPatientElectiveList(map, domainObject.getTCIHistory()) );
		// InterpretatorRequired
		valueObject.setInterpretatorRequired( domainObject.isInterpretatorRequired() );
		// Transport
		ims.domain.lookups.LookupInstance instance18 = domainObject.getTransport();
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

			ims.scheduling.vo.lookups.ApptTransportType voLookup18 = new ims.scheduling.vo.lookups.ApptTransportType(instance18.getId(),instance18.getText(), instance18.isActive(), null, img, color);
			ims.scheduling.vo.lookups.ApptTransportType parentVoLookup18 = voLookup18;
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
								parentVoLookup18.setParent(new ims.scheduling.vo.lookups.ApptTransportType(parent18.getId(),parent18.getText(), parent18.isActive(), null, img, color));
				parentVoLookup18 = parentVoLookup18.getParent();
								parent18 = parent18.getParent();
			}			
			valueObject.setTransport(voLookup18);
		}
				// Notes
		valueObject.setNotes(ims.RefMan.vo.domain.PatientElectiveListNotesVoAssembler.createPatientElectiveListNotesVoCollectionFromNotesForPatientElectiveList(map, domainObject.getNotes()) );
		// ElectiveAdmissionType
		ims.domain.lookups.LookupInstance instance20 = domainObject.getElectiveAdmissionType();
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

			ims.RefMan.vo.lookups.ElectiveAdmissionType voLookup20 = new ims.RefMan.vo.lookups.ElectiveAdmissionType(instance20.getId(),instance20.getText(), instance20.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ElectiveAdmissionType parentVoLookup20 = voLookup20;
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
								parentVoLookup20.setParent(new ims.RefMan.vo.lookups.ElectiveAdmissionType(parent20.getId(),parent20.getText(), parent20.isActive(), null, img, color));
				parentVoLookup20 = parentVoLookup20.getParent();
								parent20 = parent20.getParent();
			}			
			valueObject.setElectiveAdmissionType(voLookup20);
		}
				// EROD
		if (domainObject.getEROD() != null)
		{
			if(domainObject.getEROD() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getEROD();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setEROD(new ims.RefMan.vo.ReferralERODRefVo(id, -1));				
			}
			else
			{
				valueObject.setEROD(new ims.RefMan.vo.ReferralERODRefVo(domainObject.getEROD().getId(), domainObject.getEROD().getVersion()));
			}
		}
		// TCIDetails
		valueObject.setTCIDetails(ims.RefMan.vo.domain.PatientElectiveListElectiveTCIVoAssembler.create(map, domainObject.getTCIDetails()) );
		// ElectiveListStatusHistory
		valueObject.setElectiveListStatusHistory(ims.RefMan.vo.domain.ElectiveListStatusVoAssembler.createElectiveListStatusVoCollectionFromElectiveListStatus(map, domainObject.getElectiveListStatusHistory()) );
		// ElectiveListReason
		ims.domain.lookups.LookupInstance instance24 = domainObject.getElectiveListReason();
		if ( null != instance24 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance24.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance24.getImage().getImageId(), instance24.getImage().getImagePath());
			}
			color = instance24.getColor();
			if (color != null) 
				color.getValue();

			ims.emergency.vo.lookups.ElectiveListReason voLookup24 = new ims.emergency.vo.lookups.ElectiveListReason(instance24.getId(),instance24.getText(), instance24.isActive(), null, img, color);
			ims.emergency.vo.lookups.ElectiveListReason parentVoLookup24 = voLookup24;
			ims.domain.lookups.LookupInstance parent24 = instance24.getParent();
			while (parent24 != null)
			{
				if (parent24.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent24.getImage().getImageId(), parent24.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent24.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup24.setParent(new ims.emergency.vo.lookups.ElectiveListReason(parent24.getId(),parent24.getText(), parent24.isActive(), null, img, color));
				parentVoLookup24 = parentVoLookup24.getParent();
								parent24 = parent24.getParent();
			}			
			valueObject.setElectiveListReason(voLookup24);
		}
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
		// ERODHistory
		ims.RefMan.vo.ReferralERODRefVoCollection ERODHistory = new ims.RefMan.vo.ReferralERODRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getERODHistory().iterator(); iterator.hasNext(); ) 
		{
			ims.RefMan.domain.objects.ReferralEROD tmp = (ims.RefMan.domain.objects.ReferralEROD)iterator.next();
			if (tmp != null)
				ERODHistory.add(new ims.RefMan.vo.ReferralERODRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setERODHistory(ERODHistory);
		// TCICancelledByProvider
		valueObject.setTCICancelledByProvider( domainObject.isTCICancelledByProvider() );
		// Bed
		valueObject.setBed(domainObject.getBed());
		// TransportRequired
		valueObject.setTransportRequired( domainObject.isTransportRequired() );
		// ProcedureDescription
		valueObject.setProcedureDescription(domainObject.getProcedureDescription());
		// Language
		ims.domain.lookups.LookupInstance instance31 = domainObject.getLanguage();
		if ( null != instance31 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance31.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance31.getImage().getImageId(), instance31.getImage().getImagePath());
			}
			color = instance31.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.Language voLookup31 = new ims.core.vo.lookups.Language(instance31.getId(),instance31.getText(), instance31.isActive(), null, img, color);
			ims.core.vo.lookups.Language parentVoLookup31 = voLookup31;
			ims.domain.lookups.LookupInstance parent31 = instance31.getParent();
			while (parent31 != null)
			{
				if (parent31.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent31.getImage().getImageId(), parent31.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent31.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup31.setParent(new ims.core.vo.lookups.Language(parent31.getId(),parent31.getText(), parent31.isActive(), null, img, color));
				parentVoLookup31 = parentVoLookup31.getParent();
								parent31 = parent31.getParent();
			}			
			valueObject.setLanguage(voLookup31);
		}
				// PatientStatus
		ims.domain.lookups.LookupInstance instance32 = domainObject.getPatientStatus();
		if ( null != instance32 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance32.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance32.getImage().getImageId(), instance32.getImage().getImagePath());
			}
			color = instance32.getColor();
			if (color != null) 
				color.getValue();

			ims.RefMan.vo.lookups.CatsReferralCategory voLookup32 = new ims.RefMan.vo.lookups.CatsReferralCategory(instance32.getId(),instance32.getText(), instance32.isActive(), null, img, color);
			ims.RefMan.vo.lookups.CatsReferralCategory parentVoLookup32 = voLookup32;
			ims.domain.lookups.LookupInstance parent32 = instance32.getParent();
			while (parent32 != null)
			{
				if (parent32.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent32.getImage().getImageId(), parent32.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent32.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup32.setParent(new ims.RefMan.vo.lookups.CatsReferralCategory(parent32.getId(),parent32.getText(), parent32.isActive(), null, img, color));
				parentVoLookup32 = parentVoLookup32.getParent();
								parent32 = parent32.getParent();
			}			
			valueObject.setPatientStatus(voLookup32);
		}
				// was28DayRuleApplied
		valueObject.setWas28DayRuleApplied( domainObject.isWas28DayRuleApplied() );
		// SubjectTo28DayRule
		valueObject.setSubjectTo28DayRule( domainObject.isSubjectTo28DayRule() );
		// Rule28DayStatus
		ims.domain.lookups.LookupInstance instance35 = domainObject.getRule28DayStatus();
		if ( null != instance35 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance35.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance35.getImage().getImageId(), instance35.getImage().getImagePath());
			}
			color = instance35.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.Rule28DayStatus voLookup35 = new ims.scheduling.vo.lookups.Rule28DayStatus(instance35.getId(),instance35.getText(), instance35.isActive(), null, img, color);
			ims.scheduling.vo.lookups.Rule28DayStatus parentVoLookup35 = voLookup35;
			ims.domain.lookups.LookupInstance parent35 = instance35.getParent();
			while (parent35 != null)
			{
				if (parent35.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent35.getImage().getImageId(), parent35.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent35.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup35.setParent(new ims.scheduling.vo.lookups.Rule28DayStatus(parent35.getId(),parent35.getText(), parent35.isActive(), null, img, color));
				parentVoLookup35 = parentVoLookup35.getParent();
								parent35 = parent35.getParent();
			}			
			valueObject.setRule28DayStatus(voLookup35);
		}
				// Rule28DayPeriodStart
		java.util.Date Rule28DayPeriodStart = domainObject.getRule28DayPeriodStart();
		if ( null != Rule28DayPeriodStart ) 
		{
			valueObject.setRule28DayPeriodStart(new ims.framework.utils.Date(Rule28DayPeriodStart) );
		}
		// PreOperativeOvernightStayRequired
		valueObject.setPreOperativeOvernightStayRequired( domainObject.isPreOperativeOvernightStayRequired() );
		// NoOfPreOperativeNights
		valueObject.setNoOfPreOperativeNights(domainObject.getNoOfPreOperativeNights());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.PatientElectiveList extractPatientElectiveList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListVo valueObject) 
	{
		return 	extractPatientElectiveList(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.PatientElectiveList extractPatientElectiveList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListVo valueObject, HashMap domMap) 
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
			// ims.RefMan.vo.PatientElectiveListVo ID_PatientElectiveList field is unknown
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
		ims.core.patient.domain.objects.Patient value3 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value3 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getPatient();	
			}
			else
			{
				value3 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value3);
		ims.RefMan.domain.objects.CatsReferral value4 = null;
		if ( null != valueObject.getReferral() ) 
		{
			if (valueObject.getReferral().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferral()) != null)
				{
					value4 = (ims.RefMan.domain.objects.CatsReferral)domMap.get(valueObject.getReferral());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getReferral();	
			}
			else
			{
				value4 = (ims.RefMan.domain.objects.CatsReferral)domainFactory.getDomainObject(ims.RefMan.domain.objects.CatsReferral.class, valueObject.getReferral().getBoId());
			}
		}
		domainObject.setReferral(value4);
		ims.core.admin.domain.objects.EpisodeOfCare value5 = null;
		if ( null != valueObject.getEpisodeOfCare() ) 
		{
			if (valueObject.getEpisodeOfCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisodeOfCare()) != null)
				{
					value5 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisodeOfCare());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value5 = domainObject.getEpisodeOfCare();	
			}
			else
			{
				value5 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisodeOfCare().getBoId());
			}
		}
		domainObject.setEpisodeOfCare(value5);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value6 = null;
		if ( null != valueObject.getConsultant() ) 
		{
			if (valueObject.getConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getConsultant()) != null)
				{
					value6 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getConsultant());
				}
			}
			else
			{
				value6 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getConsultant().getBoId());
			}
		}
		domainObject.setConsultant(value6);
		java.util.Date value7 = null;
		ims.framework.utils.Date date7 = valueObject.getDateOnList();		
		if ( date7 != null ) 
		{
			value7 = date7.getDate();
		}
		domainObject.setDateOnList(value7);
		java.util.Date value8 = null;
		ims.framework.utils.Date date8 = valueObject.getOriginalDecisionDate();		
		if ( date8 != null ) 
		{
			value8 = date8.getDate();
		}
		domainObject.setOriginalDecisionDate(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getIntendedManagement() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getIntendedManagement().getID());
		}
		domainObject.setIntendedManagement(value9);
		domainObject.setAnticipatedStay(valueObject.getAnticipatedStay());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getPriority() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getPriority().getID());
		}
		domainObject.setPriority(value11);
		domainObject.setSuspensions(ims.RefMan.vo.domain.SuspensionDetailsForPatientElectiveListVoAssembler.extractSuspensionDetailsForPatientElectiveListList(domainFactory, valueObject.getSuspensions(), domainObject.getSuspensions(), domMap));		
		domainObject.setOperativeProcedureStatus(valueObject.getOperativeProcedureStatus());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Procedure value14 = null;
		if ( null != valueObject.getPrimaryProcedure() ) 
		{
			if (valueObject.getPrimaryProcedure().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrimaryProcedure()) != null)
				{
					value14 = (ims.core.clinical.domain.objects.Procedure)domMap.get(valueObject.getPrimaryProcedure());
				}
			}
			else
			{
				value14 = (ims.core.clinical.domain.objects.Procedure)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Procedure.class, valueObject.getPrimaryProcedure().getBoId());
			}
		}
		domainObject.setPrimaryProcedure(value14);

		// SaveAsRefVO treated as RefValueObject
		ims.core.clinical.vo.ProcedureRefVoCollection refCollection15 = new ims.core.clinical.vo.ProcedureRefVoCollection();
		if (valueObject.getOtherProcedures() != null)
		{
			for (int i15=0; i15<valueObject.getOtherProcedures().size(); i15++)
			{
				ims.core.clinical.vo.ProcedureRefVo ref15 = (ims.core.clinical.vo.ProcedureRefVo)valueObject.getOtherProcedures().get(i15);
				refCollection15.add(ref15);
			}
		}
		int size15 = (null == refCollection15) ? 0 : refCollection15.size();		
		java.util.List domainOtherProcedures15 = domainObject.getOtherProcedures();
		if (domainOtherProcedures15 == null)
		{
			domainOtherProcedures15 = new java.util.ArrayList();
		}
		for(int i=0; i < size15; i++) 
		{
			ims.core.clinical.vo.ProcedureRefVo vo = refCollection15.get(i);			
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

			int domIdx = domainOtherProcedures15.indexOf(dom);
			if (domIdx == -1)
			{
				domainOtherProcedures15.add(i, dom);
			}
			else if (i != domIdx && i < domainOtherProcedures15.size())
			{
				Object tmp = domainOtherProcedures15.get(i);
				domainOtherProcedures15.set(i, domainOtherProcedures15.get(domIdx));
				domainOtherProcedures15.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i15 = domainOtherProcedures15.size();
		while (i15 > size15)
		{
			domainOtherProcedures15.remove(i15-1);
			i15 = domainOtherProcedures15.size();
		}
		
		domainObject.setOtherProcedures(domainOtherProcedures15);		
		domainObject.setTCIHistory(ims.RefMan.vo.domain.PatientElectiveListElectiveTCIVoAssembler.extractTCIForPatientElectiveListList(domainFactory, valueObject.getTCIHistory(), domainObject.getTCIHistory(), domMap));		
		domainObject.setInterpretatorRequired(valueObject.getInterpretatorRequired());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value18 = null;
		if ( null != valueObject.getTransport() ) 
		{
			value18 =
				domainFactory.getLookupInstance(valueObject.getTransport().getID());
		}
		domainObject.setTransport(value18);
		domainObject.setNotes(ims.RefMan.vo.domain.PatientElectiveListNotesVoAssembler.extractNotesForPatientElectiveListSet(domainFactory, valueObject.getNotes(), domainObject.getNotes(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value20 = null;
		if ( null != valueObject.getElectiveAdmissionType() ) 
		{
			value20 =
				domainFactory.getLookupInstance(valueObject.getElectiveAdmissionType().getID());
		}
		domainObject.setElectiveAdmissionType(value20);
		ims.RefMan.domain.objects.ReferralEROD value21 = null;
		if ( null != valueObject.getEROD() ) 
		{
			if (valueObject.getEROD().getBoId() == null)
			{
				if (domMap.get(valueObject.getEROD()) != null)
				{
					value21 = (ims.RefMan.domain.objects.ReferralEROD)domMap.get(valueObject.getEROD());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value21 = domainObject.getEROD();	
			}
			else
			{
				value21 = (ims.RefMan.domain.objects.ReferralEROD)domainFactory.getDomainObject(ims.RefMan.domain.objects.ReferralEROD.class, valueObject.getEROD().getBoId());
			}
		}
		domainObject.setEROD(value21);
		domainObject.setTCIDetails(ims.RefMan.vo.domain.PatientElectiveListElectiveTCIVoAssembler.extractTCIForPatientElectiveList(domainFactory, valueObject.getTCIDetails(), domMap));
		domainObject.setElectiveListStatusHistory(ims.RefMan.vo.domain.ElectiveListStatusVoAssembler.extractElectiveListStatusList(domainFactory, valueObject.getElectiveListStatusHistory(), domainObject.getElectiveListStatusHistory(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value24 = null;
		if ( null != valueObject.getElectiveListReason() ) 
		{
			value24 =
				domainFactory.getLookupInstance(valueObject.getElectiveListReason().getID());
		}
		domainObject.setElectiveListReason(value24);
		ims.pathways.domain.objects.PathwayClock value25 = null;
		if ( null != valueObject.getPathwayClock() ) 
		{
			if (valueObject.getPathwayClock().getBoId() == null)
			{
				if (domMap.get(valueObject.getPathwayClock()) != null)
				{
					value25 = (ims.pathways.domain.objects.PathwayClock)domMap.get(valueObject.getPathwayClock());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value25 = domainObject.getPathwayClock();	
			}
			else
			{
				value25 = (ims.pathways.domain.objects.PathwayClock)domainFactory.getDomainObject(ims.pathways.domain.objects.PathwayClock.class, valueObject.getPathwayClock().getBoId());
			}
		}
		domainObject.setPathwayClock(value25);

		ims.RefMan.vo.ReferralERODRefVoCollection refCollection26 = valueObject.getERODHistory();
		int size26 = (null == refCollection26) ? 0 : refCollection26.size();		
		java.util.List domainERODHistory26 = domainObject.getERODHistory();
		if (domainERODHistory26 == null)
		{
			domainERODHistory26 = new java.util.ArrayList();
		}
		for(int i=0; i < size26; i++) 
		{
			ims.RefMan.vo.ReferralERODRefVo vo = refCollection26.get(i);			
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

			int domIdx = domainERODHistory26.indexOf(dom);
			if (domIdx == -1)
			{
				domainERODHistory26.add(i, dom);
			}
			else if (i != domIdx && i < domainERODHistory26.size())
			{
				Object tmp = domainERODHistory26.get(i);
				domainERODHistory26.set(i, domainERODHistory26.get(domIdx));
				domainERODHistory26.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i26 = domainERODHistory26.size();
		while (i26 > size26)
		{
			domainERODHistory26.remove(i26-1);
			i26 = domainERODHistory26.size();
		}
		
		domainObject.setERODHistory(domainERODHistory26);		
		domainObject.setTCICancelledByProvider(valueObject.getTCICancelledByProvider());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getBed() != null && valueObject.getBed().equals(""))
		{
			valueObject.setBed(null);
		}
		domainObject.setBed(valueObject.getBed());
		domainObject.setTransportRequired(valueObject.getTransportRequired());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getProcedureDescription() != null && valueObject.getProcedureDescription().equals(""))
		{
			valueObject.setProcedureDescription(null);
		}
		domainObject.setProcedureDescription(valueObject.getProcedureDescription());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value31 = null;
		if ( null != valueObject.getLanguage() ) 
		{
			value31 =
				domainFactory.getLookupInstance(valueObject.getLanguage().getID());
		}
		domainObject.setLanguage(value31);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value32 = null;
		if ( null != valueObject.getPatientStatus() ) 
		{
			value32 =
				domainFactory.getLookupInstance(valueObject.getPatientStatus().getID());
		}
		domainObject.setPatientStatus(value32);
		domainObject.setWas28DayRuleApplied(valueObject.getWas28DayRuleApplied());
		domainObject.setSubjectTo28DayRule(valueObject.getSubjectTo28DayRule());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value35 = null;
		if ( null != valueObject.getRule28DayStatus() ) 
		{
			value35 =
				domainFactory.getLookupInstance(valueObject.getRule28DayStatus().getID());
		}
		domainObject.setRule28DayStatus(value35);
		java.util.Date value36 = null;
		ims.framework.utils.Date date36 = valueObject.getRule28DayPeriodStart();		
		if ( date36 != null ) 
		{
			value36 = date36.getDate();
		}
		domainObject.setRule28DayPeriodStart(value36);
		domainObject.setPreOperativeOvernightStayRequired(valueObject.getPreOperativeOvernightStayRequired());
		domainObject.setNoOfPreOperativeNights(valueObject.getNoOfPreOperativeNights());

		return domainObject;
	}

}
