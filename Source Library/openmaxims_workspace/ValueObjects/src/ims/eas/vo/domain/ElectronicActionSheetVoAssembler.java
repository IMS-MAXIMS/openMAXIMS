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
package ims.eas.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Sean Nesbitt
 */
public class ElectronicActionSheetVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.eas.vo.ElectronicActionSheetVo copy(ims.eas.vo.ElectronicActionSheetVo valueObjectDest, ims.eas.vo.ElectronicActionSheetVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ElectronicActionSheet(valueObjectSrc.getID_ElectronicActionSheet());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// EasStatus
		valueObjectDest.setEasStatus(valueObjectSrc.getEasStatus());
		// StatusHistory
		valueObjectDest.setStatusHistory(valueObjectSrc.getStatusHistory());
		// RecordingInfo
		valueObjectDest.setRecordingInfo(valueObjectSrc.getRecordingInfo());
		// AuthorisedBy
		valueObjectDest.setAuthorisedBy(valueObjectSrc.getAuthorisedBy());
		// AuthorisedDateTime
		valueObjectDest.setAuthorisedDateTime(valueObjectSrc.getAuthorisedDateTime());
		// ResponsibleHcp
		valueObjectDest.setResponsibleHcp(valueObjectSrc.getResponsibleHcp());
		// TPCreated
		valueObjectDest.setTPCreated(valueObjectSrc.getTPCreated());
		// ActionRequired
		valueObjectDest.setActionRequired(valueObjectSrc.getActionRequired());
		// RemovedStat
		valueObjectDest.setRemovedStat(valueObjectSrc.getRemovedStat());
		// RemovalReason
		valueObjectDest.setRemovalReason(valueObjectSrc.getRemovalReason());
		// SeenBy
		valueObjectDest.setSeenBy(valueObjectSrc.getSeenBy());
		// DateSeen
		valueObjectDest.setDateSeen(valueObjectSrc.getDateSeen());
		// DateDecisionToTreat
		valueObjectDest.setDateDecisionToTreat(valueObjectSrc.getDateDecisionToTreat());
		// PrimaryTumour
		valueObjectDest.setPrimaryTumour(valueObjectSrc.getPrimaryTumour());
		// TreatmentSite
		valueObjectDest.setTreatmentSite(valueObjectSrc.getTreatmentSite());
		// FirstTherapeuticIntervention
		valueObjectDest.setFirstTherapeuticIntervention(valueObjectSrc.getFirstTherapeuticIntervention());
		// ClinicalTrialPatient
		valueObjectDest.setClinicalTrialPatient(valueObjectSrc.getClinicalTrialPatient());
		// ProtocolUsed
		valueObjectDest.setProtocolUsed(valueObjectSrc.getProtocolUsed());
		// PatientConsent
		valueObjectDest.setPatientConsent(valueObjectSrc.getPatientConsent());
		// PlanConsSession
		valueObjectDest.setPlanConsSession(valueObjectSrc.getPlanConsSession());
		// AppropCCCL
		valueObjectDest.setAppropCCCL(valueObjectSrc.getAppropCCCL());
		// ImageTransfer
		valueObjectDest.setImageTransfer(valueObjectSrc.getImageTransfer());
		// Phases
		valueObjectDest.setPhases(valueObjectSrc.getPhases());
		// ConcurrentSystemicTreatment
		valueObjectDest.setConcurrentSystemicTreatment(valueObjectSrc.getConcurrentSystemicTreatment());
		// SeenAt
		valueObjectDest.setSeenAt(valueObjectSrc.getSeenAt());
		// Intent
		valueObjectDest.setIntent(valueObjectSrc.getIntent());
		// Priority
		valueObjectDest.setPriority(valueObjectSrc.getPriority());
		// Delayed
		valueObjectDest.setDelayed(valueObjectSrc.getDelayed());
		// DelayedComment
		valueObjectDest.setDelayedComment(valueObjectSrc.getDelayedComment());
		// ReadyToTreatDate
		valueObjectDest.setReadyToTreatDate(valueObjectSrc.getReadyToTreatDate());
		// DelayedReason
		valueObjectDest.setDelayedReason(valueObjectSrc.getDelayedReason());
		// TreatSiteLaterality
		valueObjectDest.setTreatSiteLaterality(valueObjectSrc.getTreatSiteLaterality());
		// AnatomicalSite
		valueObjectDest.setAnatomicalSite(valueObjectSrc.getAnatomicalSite());
		// ClinicalTrial
		valueObjectDest.setClinicalTrial(valueObjectSrc.getClinicalTrial());
		// Protocol
		valueObjectDest.setProtocol(valueObjectSrc.getProtocol());
		// OffProtocolReason
		valueObjectDest.setOffProtocolReason(valueObjectSrc.getOffProtocolReason());
		// EasComment
		valueObjectDest.setEasComment(valueObjectSrc.getEasComment());
		// ImageTransfers
		valueObjectDest.setImageTransfers(valueObjectSrc.getImageTransfers());
		// PlanningCT
		valueObjectDest.setPlanningCT(valueObjectSrc.getPlanningCT());
		// PlanningCTText
		valueObjectDest.setPlanningCTText(valueObjectSrc.getPlanningCTText());
		// MRIforCoReg
		valueObjectDest.setMRIforCoReg(valueObjectSrc.getMRIforCoReg());
		// DentistRequired
		valueObjectDest.setDentistRequired(valueObjectSrc.getDentistRequired());
		// PegRequired
		valueObjectDest.setPegRequired(valueObjectSrc.getPegRequired());
		// SimulationRequired
		valueObjectDest.setSimulationRequired(valueObjectSrc.getSimulationRequired());
		// IVContrast
		valueObjectDest.setIVContrast(valueObjectSrc.getIVContrast());
		// InvestigationDate
		valueObjectDest.setInvestigationDate(valueObjectSrc.getInvestigationDate());
		// CreatinineLevel
		valueObjectDest.setCreatinineLevel(valueObjectSrc.getCreatinineLevel());
		// OralContrast
		valueObjectDest.setOralContrast(valueObjectSrc.getOralContrast());
		// GatingOptions
		valueObjectDest.setGatingOptions(valueObjectSrc.getGatingOptions());
		// IMRT
		valueObjectDest.setIMRT(valueObjectSrc.getIMRT());
		// PetCT
		valueObjectDest.setPetCT(valueObjectSrc.getPetCT());
		// ImmobType
		valueObjectDest.setImmobType(valueObjectSrc.getImmobType());
		// MouldRoomActivity
		valueObjectDest.setMouldRoomActivity(valueObjectSrc.getMouldRoomActivity());
		// Agent
		valueObjectDest.setAgent(valueObjectSrc.getAgent());
		// PlanningApptDate
		valueObjectDest.setPlanningApptDate(valueObjectSrc.getPlanningApptDate());
		// PlanningTransport
		valueObjectDest.setPlanningTransport(valueObjectSrc.getPlanningTransport());
		// TreatmentTransport
		valueObjectDest.setTreatmentTransport(valueObjectSrc.getTreatmentTransport());
		// IP_OP_Planning
		valueObjectDest.setIP_OP_Planning(valueObjectSrc.getIP_OP_Planning());
		// IP_OP_Treatment
		valueObjectDest.setIP_OP_Treatment(valueObjectSrc.getIP_OP_Treatment());
		// PatientStatus
		valueObjectDest.setPatientStatus(valueObjectSrc.getPatientStatus());
		// GeneratedDocument
		valueObjectDest.setGeneratedDocument(valueObjectSrc.getGeneratedDocument());
		// Annotation
		valueObjectDest.setAnnotation(valueObjectSrc.getAnnotation());
		// GraphicAssessment
		valueObjectDest.setGraphicAssessment(valueObjectSrc.getGraphicAssessment());
		// RecentCreatinine
		valueObjectDest.setRecentCreatinine(valueObjectSrc.getRecentCreatinine());
		// PlanningCTRequired
		valueObjectDest.setPlanningCTRequired(valueObjectSrc.getPlanningCTRequired());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createElectronicActionSheetVoCollectionFromElectronicActionSheet(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.eas.domain.objects.ElectronicActionSheet objects.
	 */
	public static ims.eas.vo.ElectronicActionSheetVoCollection createElectronicActionSheetVoCollectionFromElectronicActionSheet(java.util.Set domainObjectSet)	
	{
		return createElectronicActionSheetVoCollectionFromElectronicActionSheet(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.eas.domain.objects.ElectronicActionSheet objects.
	 */
	public static ims.eas.vo.ElectronicActionSheetVoCollection createElectronicActionSheetVoCollectionFromElectronicActionSheet(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.eas.vo.ElectronicActionSheetVoCollection voList = new ims.eas.vo.ElectronicActionSheetVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.eas.domain.objects.ElectronicActionSheet domainObject = (ims.eas.domain.objects.ElectronicActionSheet) iterator.next();
			ims.eas.vo.ElectronicActionSheetVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.eas.domain.objects.ElectronicActionSheet objects.
	 */
	public static ims.eas.vo.ElectronicActionSheetVoCollection createElectronicActionSheetVoCollectionFromElectronicActionSheet(java.util.List domainObjectList) 
	{
		return createElectronicActionSheetVoCollectionFromElectronicActionSheet(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.eas.domain.objects.ElectronicActionSheet objects.
	 */
	public static ims.eas.vo.ElectronicActionSheetVoCollection createElectronicActionSheetVoCollectionFromElectronicActionSheet(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.eas.vo.ElectronicActionSheetVoCollection voList = new ims.eas.vo.ElectronicActionSheetVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.eas.domain.objects.ElectronicActionSheet domainObject = (ims.eas.domain.objects.ElectronicActionSheet) domainObjectList.get(i);
			ims.eas.vo.ElectronicActionSheetVo vo = create(map, domainObject);

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
	 * Create the ims.eas.domain.objects.ElectronicActionSheet set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractElectronicActionSheetSet(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.ElectronicActionSheetVoCollection voCollection) 
	 {
	 	return extractElectronicActionSheetSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractElectronicActionSheetSet(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.ElectronicActionSheetVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.eas.vo.ElectronicActionSheetVo vo = voCollection.get(i);
			ims.eas.domain.objects.ElectronicActionSheet domainObject = ElectronicActionSheetVoAssembler.extractElectronicActionSheet(domainFactory, vo, domMap);

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
	 * Create the ims.eas.domain.objects.ElectronicActionSheet list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractElectronicActionSheetList(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.ElectronicActionSheetVoCollection voCollection) 
	 {
	 	return extractElectronicActionSheetList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractElectronicActionSheetList(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.ElectronicActionSheetVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.eas.vo.ElectronicActionSheetVo vo = voCollection.get(i);
			ims.eas.domain.objects.ElectronicActionSheet domainObject = ElectronicActionSheetVoAssembler.extractElectronicActionSheet(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.eas.domain.objects.ElectronicActionSheet object.
	 * @param domainObject ims.eas.domain.objects.ElectronicActionSheet
	 */
	 public static ims.eas.vo.ElectronicActionSheetVo create(ims.eas.domain.objects.ElectronicActionSheet domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.eas.domain.objects.ElectronicActionSheet object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.eas.vo.ElectronicActionSheetVo create(DomainObjectMap map, ims.eas.domain.objects.ElectronicActionSheet domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.eas.vo.ElectronicActionSheetVo valueObject = (ims.eas.vo.ElectronicActionSheetVo) map.getValueObject(domainObject, ims.eas.vo.ElectronicActionSheetVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.eas.vo.ElectronicActionSheetVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.eas.domain.objects.ElectronicActionSheet
	 */
	 public static ims.eas.vo.ElectronicActionSheetVo insert(ims.eas.vo.ElectronicActionSheetVo valueObject, ims.eas.domain.objects.ElectronicActionSheet domainObject) 
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
	 * @param domainObject ims.eas.domain.objects.ElectronicActionSheet
	 */
	 public static ims.eas.vo.ElectronicActionSheetVo insert(DomainObjectMap map, ims.eas.vo.ElectronicActionSheetVo valueObject, ims.eas.domain.objects.ElectronicActionSheet domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ElectronicActionSheet(domainObject.getId());
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
		// EasStatus
		valueObject.setEasStatus(ims.eas.vo.domain.EASStatusRecordVoAssembler.create(map, domainObject.getEasStatus()) );
		// StatusHistory
		valueObject.setStatusHistory(ims.eas.vo.domain.EASStatusRecordVoAssembler.createEASStatusRecordVoCollectionFromEASStatusRecord(map, domainObject.getStatusHistory()) );
		// RecordingInfo
		valueObject.setRecordingInfo(ims.core.vo.domain.RecordingUserInformationVoAssembler.create(map, domainObject.getRecordingInfo()) );
		// AuthorisedBy
		valueObject.setAuthorisedBy(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getAuthorisedBy()) );
		// AuthorisedDateTime
		java.util.Date AuthorisedDateTime = domainObject.getAuthorisedDateTime();
		if ( null != AuthorisedDateTime ) 
		{
			valueObject.setAuthorisedDateTime(new ims.framework.utils.DateTime(AuthorisedDateTime) );
		}
		// ResponsibleHcp
		valueObject.setResponsibleHcp(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getResponsibleHcp()) );
		// TPCreated
		valueObject.setTPCreated( domainObject.isTPCreated() );
		// ActionRequired
		valueObject.setActionRequired( domainObject.isActionRequired() );
		// RemovedStat
		valueObject.setRemovedStat( domainObject.isRemovedStat() );
		// RemovalReason
		ims.domain.lookups.LookupInstance instance11 = domainObject.getRemovalReason();
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

			ims.eas.vo.lookups.RemovalReason voLookup11 = new ims.eas.vo.lookups.RemovalReason(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.eas.vo.lookups.RemovalReason parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.eas.vo.lookups.RemovalReason(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setRemovalReason(voLookup11);
		}
				// SeenBy
		valueObject.setSeenBy(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getSeenBy()) );
		// DateSeen
		java.util.Date DateSeen = domainObject.getDateSeen();
		if ( null != DateSeen ) 
		{
			valueObject.setDateSeen(new ims.framework.utils.Date(DateSeen) );
		}
		// DateDecisionToTreat
		java.util.Date DateDecisionToTreat = domainObject.getDateDecisionToTreat();
		if ( null != DateDecisionToTreat ) 
		{
			valueObject.setDateDecisionToTreat(new ims.framework.utils.Date(DateDecisionToTreat) );
		}
		// PrimaryTumour
		valueObject.setPrimaryTumour(ims.eas.vo.domain.PrimaryTumourInsVoAssembler.create(map, domainObject.getPrimaryTumour()) );
		// TreatmentSite
		valueObject.setTreatmentSite(ims.eas.vo.domain.TreatmentSiteInsVoAssembler.create(map, domainObject.getTreatmentSite()) );
		// FirstTherapeuticIntervention
		valueObject.setFirstTherapeuticIntervention( domainObject.isFirstTherapeuticIntervention() );
		// ClinicalTrialPatient
		valueObject.setClinicalTrialPatient( domainObject.isClinicalTrialPatient() );
		// ProtocolUsed
		valueObject.setProtocolUsed( domainObject.isProtocolUsed() );
		// PatientConsent
		ims.domain.lookups.LookupInstance instance20 = domainObject.getPatientConsent();
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

			ims.core.vo.lookups.YesNo voLookup20 = new ims.core.vo.lookups.YesNo(instance20.getId(),instance20.getText(), instance20.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup20 = voLookup20;
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
								parentVoLookup20.setParent(new ims.core.vo.lookups.YesNo(parent20.getId(),parent20.getText(), parent20.isActive(), null, img, color));
				parentVoLookup20 = parentVoLookup20.getParent();
								parent20 = parent20.getParent();
			}			
			valueObject.setPatientConsent(voLookup20);
		}
				// PlanConsSession
		ims.domain.lookups.LookupInstance instance21 = domainObject.getPlanConsSession();
		if ( null != instance21 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance21.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance21.getImage().getImageId(), instance21.getImage().getImagePath());
			}
			color = instance21.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup21 = new ims.core.vo.lookups.YesNo(instance21.getId(),instance21.getText(), instance21.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup21 = voLookup21;
			ims.domain.lookups.LookupInstance parent21 = instance21.getParent();
			while (parent21 != null)
			{
				if (parent21.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent21.getImage().getImageId(), parent21.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent21.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup21.setParent(new ims.core.vo.lookups.YesNo(parent21.getId(),parent21.getText(), parent21.isActive(), null, img, color));
				parentVoLookup21 = parentVoLookup21.getParent();
								parent21 = parent21.getParent();
			}			
			valueObject.setPlanConsSession(voLookup21);
		}
				// AppropCCCL
		ims.domain.lookups.LookupInstance instance22 = domainObject.getAppropCCCL();
		if ( null != instance22 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance22.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance22.getImage().getImageId(), instance22.getImage().getImagePath());
			}
			color = instance22.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup22 = new ims.core.vo.lookups.YesNo(instance22.getId(),instance22.getText(), instance22.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup22 = voLookup22;
			ims.domain.lookups.LookupInstance parent22 = instance22.getParent();
			while (parent22 != null)
			{
				if (parent22.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent22.getImage().getImageId(), parent22.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent22.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup22.setParent(new ims.core.vo.lookups.YesNo(parent22.getId(),parent22.getText(), parent22.isActive(), null, img, color));
				parentVoLookup22 = parentVoLookup22.getParent();
								parent22 = parent22.getParent();
			}			
			valueObject.setAppropCCCL(voLookup22);
		}
				// ImageTransfer
		ims.domain.lookups.LookupInstance instance23 = domainObject.getImageTransfer();
		if ( null != instance23 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance23.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance23.getImage().getImageId(), instance23.getImage().getImagePath());
			}
			color = instance23.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup23 = new ims.core.vo.lookups.YesNo(instance23.getId(),instance23.getText(), instance23.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup23 = voLookup23;
			ims.domain.lookups.LookupInstance parent23 = instance23.getParent();
			while (parent23 != null)
			{
				if (parent23.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent23.getImage().getImageId(), parent23.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent23.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup23.setParent(new ims.core.vo.lookups.YesNo(parent23.getId(),parent23.getText(), parent23.isActive(), null, img, color));
				parentVoLookup23 = parentVoLookup23.getParent();
								parent23 = parent23.getParent();
			}			
			valueObject.setImageTransfer(voLookup23);
		}
				// Phases
		valueObject.setPhases(ims.eas.vo.domain.EASPhaseVoAssembler.createEASPhaseVoCollectionFromEASPhase(map, domainObject.getPhases()) );
		// ConcurrentSystemicTreatment
		ims.domain.lookups.LookupInstance instance25 = domainObject.getConcurrentSystemicTreatment();
		if ( null != instance25 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance25.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance25.getImage().getImageId(), instance25.getImage().getImagePath());
			}
			color = instance25.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup25 = new ims.core.vo.lookups.YesNo(instance25.getId(),instance25.getText(), instance25.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup25 = voLookup25;
			ims.domain.lookups.LookupInstance parent25 = instance25.getParent();
			while (parent25 != null)
			{
				if (parent25.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent25.getImage().getImageId(), parent25.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent25.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup25.setParent(new ims.core.vo.lookups.YesNo(parent25.getId(),parent25.getText(), parent25.isActive(), null, img, color));
				parentVoLookup25 = parentVoLookup25.getParent();
								parent25 = parent25.getParent();
			}			
			valueObject.setConcurrentSystemicTreatment(voLookup25);
		}
				// SeenAt
		ims.domain.lookups.LookupInstance instance26 = domainObject.getSeenAt();
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

			ims.ccosched.vo.lookups.SeenAt voLookup26 = new ims.ccosched.vo.lookups.SeenAt(instance26.getId(),instance26.getText(), instance26.isActive(), null, img, color);
			ims.ccosched.vo.lookups.SeenAt parentVoLookup26 = voLookup26;
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
								parentVoLookup26.setParent(new ims.ccosched.vo.lookups.SeenAt(parent26.getId(),parent26.getText(), parent26.isActive(), null, img, color));
				parentVoLookup26 = parentVoLookup26.getParent();
								parent26 = parent26.getParent();
			}			
			valueObject.setSeenAt(voLookup26);
		}
				// Intent
		ims.domain.lookups.LookupInstance instance27 = domainObject.getIntent();
		if ( null != instance27 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance27.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance27.getImage().getImageId(), instance27.getImage().getImagePath());
			}
			color = instance27.getColor();
			if (color != null) 
				color.getValue();

			ims.ccosched.vo.lookups.TreatmentIntent voLookup27 = new ims.ccosched.vo.lookups.TreatmentIntent(instance27.getId(),instance27.getText(), instance27.isActive(), null, img, color);
			ims.ccosched.vo.lookups.TreatmentIntent parentVoLookup27 = voLookup27;
			ims.domain.lookups.LookupInstance parent27 = instance27.getParent();
			while (parent27 != null)
			{
				if (parent27.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent27.getImage().getImageId(), parent27.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent27.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup27.setParent(new ims.ccosched.vo.lookups.TreatmentIntent(parent27.getId(),parent27.getText(), parent27.isActive(), null, img, color));
				parentVoLookup27 = parentVoLookup27.getParent();
								parent27 = parent27.getParent();
			}			
			valueObject.setIntent(voLookup27);
		}
				// Priority
		ims.domain.lookups.LookupInstance instance28 = domainObject.getPriority();
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

			ims.ccosched.vo.lookups.Priority voLookup28 = new ims.ccosched.vo.lookups.Priority(instance28.getId(),instance28.getText(), instance28.isActive(), null, img, color);
			ims.ccosched.vo.lookups.Priority parentVoLookup28 = voLookup28;
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
								parentVoLookup28.setParent(new ims.ccosched.vo.lookups.Priority(parent28.getId(),parent28.getText(), parent28.isActive(), null, img, color));
				parentVoLookup28 = parentVoLookup28.getParent();
								parent28 = parent28.getParent();
			}			
			valueObject.setPriority(voLookup28);
		}
				// Delayed
		valueObject.setDelayed( domainObject.isDelayed() );
		// DelayedComment
		valueObject.setDelayedComment(domainObject.getDelayedComment());
		// ReadyToTreatDate
		Integer ReadyToTreatDate = domainObject.getReadyToTreatDate();
		if ( null != ReadyToTreatDate ) 
		{
			valueObject.setReadyToTreatDate(new ims.framework.utils.PartialDate(ReadyToTreatDate) );
		}
		// DelayedReason
		ims.domain.lookups.LookupInstance instance32 = domainObject.getDelayedReason();
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

			ims.ccosched.vo.lookups.ActionStatusReason voLookup32 = new ims.ccosched.vo.lookups.ActionStatusReason(instance32.getId(),instance32.getText(), instance32.isActive(), null, img, color);
			ims.ccosched.vo.lookups.ActionStatusReason parentVoLookup32 = voLookup32;
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
								parentVoLookup32.setParent(new ims.ccosched.vo.lookups.ActionStatusReason(parent32.getId(),parent32.getText(), parent32.isActive(), null, img, color));
				parentVoLookup32 = parentVoLookup32.getParent();
								parent32 = parent32.getParent();
			}			
			valueObject.setDelayedReason(voLookup32);
		}
				// TreatSiteLaterality
		ims.domain.lookups.LookupInstance instance33 = domainObject.getTreatSiteLaterality();
		if ( null != instance33 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance33.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance33.getImage().getImageId(), instance33.getImage().getImagePath());
			}
			color = instance33.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.LateralityLRonly voLookup33 = new ims.core.vo.lookups.LateralityLRonly(instance33.getId(),instance33.getText(), instance33.isActive(), null, img, color);
			ims.core.vo.lookups.LateralityLRonly parentVoLookup33 = voLookup33;
			ims.domain.lookups.LookupInstance parent33 = instance33.getParent();
			while (parent33 != null)
			{
				if (parent33.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent33.getImage().getImageId(), parent33.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent33.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup33.setParent(new ims.core.vo.lookups.LateralityLRonly(parent33.getId(),parent33.getText(), parent33.isActive(), null, img, color));
				parentVoLookup33 = parentVoLookup33.getParent();
								parent33 = parent33.getParent();
			}			
			valueObject.setTreatSiteLaterality(voLookup33);
		}
				// AnatomicalSite
		valueObject.setAnatomicalSite(domainObject.getAnatomicalSite());
		// ClinicalTrial
		ims.domain.lookups.LookupInstance instance35 = domainObject.getClinicalTrial();
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

			ims.oncology.vo.lookups.ClinicalTrialName voLookup35 = new ims.oncology.vo.lookups.ClinicalTrialName(instance35.getId(),instance35.getText(), instance35.isActive(), null, img, color);
			ims.oncology.vo.lookups.ClinicalTrialName parentVoLookup35 = voLookup35;
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
								parentVoLookup35.setParent(new ims.oncology.vo.lookups.ClinicalTrialName(parent35.getId(),parent35.getText(), parent35.isActive(), null, img, color));
				parentVoLookup35 = parentVoLookup35.getParent();
								parent35 = parent35.getParent();
			}			
			valueObject.setClinicalTrial(voLookup35);
		}
				// Protocol
		valueObject.setProtocol(ims.eas.vo.domain.ProtocolLiteInsVoAssembler.create(map, domainObject.getProtocol()) );
		// OffProtocolReason
		valueObject.setOffProtocolReason(domainObject.getOffProtocolReason());
		// EasComment
		valueObject.setEasComment(domainObject.getEasComment());
		// ImageTransfers
		valueObject.setImageTransfers(ims.eas.vo.domain.EASImageTransferVoAssembler.createEASImageTransferVoCollectionFromImageTransfer(map, domainObject.getImageTransfers()) );
		// PlanningCT
		ims.domain.lookups.LookupInstance instance40 = domainObject.getPlanningCT();
		if ( null != instance40 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance40.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance40.getImage().getImageId(), instance40.getImage().getImagePath());
			}
			color = instance40.getColor();
			if (color != null) 
				color.getValue();

			ims.eas.vo.lookups.ScanLimits voLookup40 = new ims.eas.vo.lookups.ScanLimits(instance40.getId(),instance40.getText(), instance40.isActive(), null, img, color);
			ims.eas.vo.lookups.ScanLimits parentVoLookup40 = voLookup40;
			ims.domain.lookups.LookupInstance parent40 = instance40.getParent();
			while (parent40 != null)
			{
				if (parent40.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent40.getImage().getImageId(), parent40.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent40.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup40.setParent(new ims.eas.vo.lookups.ScanLimits(parent40.getId(),parent40.getText(), parent40.isActive(), null, img, color));
				parentVoLookup40 = parentVoLookup40.getParent();
								parent40 = parent40.getParent();
			}			
			valueObject.setPlanningCT(voLookup40);
		}
				// PlanningCTText
		valueObject.setPlanningCTText(domainObject.getPlanningCTText());
		// MRIforCoReg
		ims.domain.lookups.LookupInstance instance42 = domainObject.getMRIforCoReg();
		if ( null != instance42 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance42.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance42.getImage().getImageId(), instance42.getImage().getImagePath());
			}
			color = instance42.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup42 = new ims.core.vo.lookups.YesNo(instance42.getId(),instance42.getText(), instance42.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup42 = voLookup42;
			ims.domain.lookups.LookupInstance parent42 = instance42.getParent();
			while (parent42 != null)
			{
				if (parent42.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent42.getImage().getImageId(), parent42.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent42.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup42.setParent(new ims.core.vo.lookups.YesNo(parent42.getId(),parent42.getText(), parent42.isActive(), null, img, color));
				parentVoLookup42 = parentVoLookup42.getParent();
								parent42 = parent42.getParent();
			}			
			valueObject.setMRIforCoReg(voLookup42);
		}
				// DentistRequired
		ims.domain.lookups.LookupInstance instance43 = domainObject.getDentistRequired();
		if ( null != instance43 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance43.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance43.getImage().getImageId(), instance43.getImage().getImagePath());
			}
			color = instance43.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup43 = new ims.core.vo.lookups.YesNo(instance43.getId(),instance43.getText(), instance43.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup43 = voLookup43;
			ims.domain.lookups.LookupInstance parent43 = instance43.getParent();
			while (parent43 != null)
			{
				if (parent43.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent43.getImage().getImageId(), parent43.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent43.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup43.setParent(new ims.core.vo.lookups.YesNo(parent43.getId(),parent43.getText(), parent43.isActive(), null, img, color));
				parentVoLookup43 = parentVoLookup43.getParent();
								parent43 = parent43.getParent();
			}			
			valueObject.setDentistRequired(voLookup43);
		}
				// PegRequired
		ims.domain.lookups.LookupInstance instance44 = domainObject.getPegRequired();
		if ( null != instance44 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance44.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance44.getImage().getImageId(), instance44.getImage().getImagePath());
			}
			color = instance44.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup44 = new ims.core.vo.lookups.YesNo(instance44.getId(),instance44.getText(), instance44.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup44 = voLookup44;
			ims.domain.lookups.LookupInstance parent44 = instance44.getParent();
			while (parent44 != null)
			{
				if (parent44.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent44.getImage().getImageId(), parent44.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent44.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup44.setParent(new ims.core.vo.lookups.YesNo(parent44.getId(),parent44.getText(), parent44.isActive(), null, img, color));
				parentVoLookup44 = parentVoLookup44.getParent();
								parent44 = parent44.getParent();
			}			
			valueObject.setPegRequired(voLookup44);
		}
				// SimulationRequired
		ims.domain.lookups.LookupInstance instance45 = domainObject.getSimulationRequired();
		if ( null != instance45 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance45.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance45.getImage().getImageId(), instance45.getImage().getImagePath());
			}
			color = instance45.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup45 = new ims.core.vo.lookups.YesNo(instance45.getId(),instance45.getText(), instance45.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup45 = voLookup45;
			ims.domain.lookups.LookupInstance parent45 = instance45.getParent();
			while (parent45 != null)
			{
				if (parent45.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent45.getImage().getImageId(), parent45.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent45.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup45.setParent(new ims.core.vo.lookups.YesNo(parent45.getId(),parent45.getText(), parent45.isActive(), null, img, color));
				parentVoLookup45 = parentVoLookup45.getParent();
								parent45 = parent45.getParent();
			}			
			valueObject.setSimulationRequired(voLookup45);
		}
				// IVContrast
		ims.domain.lookups.LookupInstance instance46 = domainObject.getIVContrast();
		if ( null != instance46 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance46.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance46.getImage().getImageId(), instance46.getImage().getImagePath());
			}
			color = instance46.getColor();
			if (color != null) 
				color.getValue();

			ims.eas.vo.lookups.IVContrast voLookup46 = new ims.eas.vo.lookups.IVContrast(instance46.getId(),instance46.getText(), instance46.isActive(), null, img, color);
			ims.eas.vo.lookups.IVContrast parentVoLookup46 = voLookup46;
			ims.domain.lookups.LookupInstance parent46 = instance46.getParent();
			while (parent46 != null)
			{
				if (parent46.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent46.getImage().getImageId(), parent46.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent46.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup46.setParent(new ims.eas.vo.lookups.IVContrast(parent46.getId(),parent46.getText(), parent46.isActive(), null, img, color));
				parentVoLookup46 = parentVoLookup46.getParent();
								parent46 = parent46.getParent();
			}			
			valueObject.setIVContrast(voLookup46);
		}
				// InvestigationDate
		java.util.Date InvestigationDate = domainObject.getInvestigationDate();
		if ( null != InvestigationDate ) 
		{
			valueObject.setInvestigationDate(new ims.framework.utils.Date(InvestigationDate) );
		}
		// CreatinineLevel
		valueObject.setCreatinineLevel(domainObject.getCreatinineLevel());
		// OralContrast
		java.util.List listOralContrast = domainObject.getOralContrast();
		ims.eas.vo.lookups.OralContrastCollection OralContrast = new ims.eas.vo.lookups.OralContrastCollection();
		for(java.util.Iterator iterator = listOralContrast.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.eas.vo.lookups.OralContrast voInstance = new ims.eas.vo.lookups.OralContrast(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.eas.vo.lookups.OralContrast parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.eas.vo.lookups.OralContrast(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			OralContrast.add(voInstance);
		}
		valueObject.setOralContrast( OralContrast );
		// GatingOptions
		ims.domain.lookups.LookupInstance instance50 = domainObject.getGatingOptions();
		if ( null != instance50 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance50.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance50.getImage().getImageId(), instance50.getImage().getImagePath());
			}
			color = instance50.getColor();
			if (color != null) 
				color.getValue();

			ims.eas.vo.lookups.GatingOptions voLookup50 = new ims.eas.vo.lookups.GatingOptions(instance50.getId(),instance50.getText(), instance50.isActive(), null, img, color);
			ims.eas.vo.lookups.GatingOptions parentVoLookup50 = voLookup50;
			ims.domain.lookups.LookupInstance parent50 = instance50.getParent();
			while (parent50 != null)
			{
				if (parent50.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent50.getImage().getImageId(), parent50.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent50.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup50.setParent(new ims.eas.vo.lookups.GatingOptions(parent50.getId(),parent50.getText(), parent50.isActive(), null, img, color));
				parentVoLookup50 = parentVoLookup50.getParent();
								parent50 = parent50.getParent();
			}			
			valueObject.setGatingOptions(voLookup50);
		}
				// IMRT
		ims.domain.lookups.LookupInstance instance51 = domainObject.getIMRT();
		if ( null != instance51 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance51.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance51.getImage().getImageId(), instance51.getImage().getImagePath());
			}
			color = instance51.getColor();
			if (color != null) 
				color.getValue();

			ims.eas.vo.lookups.IMRT voLookup51 = new ims.eas.vo.lookups.IMRT(instance51.getId(),instance51.getText(), instance51.isActive(), null, img, color);
			ims.eas.vo.lookups.IMRT parentVoLookup51 = voLookup51;
			ims.domain.lookups.LookupInstance parent51 = instance51.getParent();
			while (parent51 != null)
			{
				if (parent51.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent51.getImage().getImageId(), parent51.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent51.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup51.setParent(new ims.eas.vo.lookups.IMRT(parent51.getId(),parent51.getText(), parent51.isActive(), null, img, color));
				parentVoLookup51 = parentVoLookup51.getParent();
								parent51 = parent51.getParent();
			}			
			valueObject.setIMRT(voLookup51);
		}
				// PetCT
		ims.domain.lookups.LookupInstance instance52 = domainObject.getPetCT();
		if ( null != instance52 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance52.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance52.getImage().getImageId(), instance52.getImage().getImagePath());
			}
			color = instance52.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup52 = new ims.core.vo.lookups.YesNo(instance52.getId(),instance52.getText(), instance52.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup52 = voLookup52;
			ims.domain.lookups.LookupInstance parent52 = instance52.getParent();
			while (parent52 != null)
			{
				if (parent52.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent52.getImage().getImageId(), parent52.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent52.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup52.setParent(new ims.core.vo.lookups.YesNo(parent52.getId(),parent52.getText(), parent52.isActive(), null, img, color));
				parentVoLookup52 = parentVoLookup52.getParent();
								parent52 = parent52.getParent();
			}			
			valueObject.setPetCT(voLookup52);
		}
				// ImmobType
		ims.domain.lookups.LookupInstance instance53 = domainObject.getImmobType();
		if ( null != instance53 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance53.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance53.getImage().getImageId(), instance53.getImage().getImagePath());
			}
			color = instance53.getColor();
			if (color != null) 
				color.getValue();

			ims.eas.vo.lookups.ImmobilisationType voLookup53 = new ims.eas.vo.lookups.ImmobilisationType(instance53.getId(),instance53.getText(), instance53.isActive(), null, img, color);
			ims.eas.vo.lookups.ImmobilisationType parentVoLookup53 = voLookup53;
			ims.domain.lookups.LookupInstance parent53 = instance53.getParent();
			while (parent53 != null)
			{
				if (parent53.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent53.getImage().getImageId(), parent53.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent53.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup53.setParent(new ims.eas.vo.lookups.ImmobilisationType(parent53.getId(),parent53.getText(), parent53.isActive(), null, img, color));
				parentVoLookup53 = parentVoLookup53.getParent();
								parent53 = parent53.getParent();
			}			
			valueObject.setImmobType(voLookup53);
		}
				// MouldRoomActivity
		ims.domain.lookups.LookupInstance instance54 = domainObject.getMouldRoomActivity();
		if ( null != instance54 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance54.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance54.getImage().getImageId(), instance54.getImage().getImagePath());
			}
			color = instance54.getColor();
			if (color != null) 
				color.getValue();

			ims.eas.vo.lookups.MouldRoomActivity voLookup54 = new ims.eas.vo.lookups.MouldRoomActivity(instance54.getId(),instance54.getText(), instance54.isActive(), null, img, color);
			ims.eas.vo.lookups.MouldRoomActivity parentVoLookup54 = voLookup54;
			ims.domain.lookups.LookupInstance parent54 = instance54.getParent();
			while (parent54 != null)
			{
				if (parent54.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent54.getImage().getImageId(), parent54.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent54.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup54.setParent(new ims.eas.vo.lookups.MouldRoomActivity(parent54.getId(),parent54.getText(), parent54.isActive(), null, img, color));
				parentVoLookup54 = parentVoLookup54.getParent();
								parent54 = parent54.getParent();
			}			
			valueObject.setMouldRoomActivity(voLookup54);
		}
				// Agent
		ims.domain.lookups.LookupInstance instance55 = domainObject.getAgent();
		if ( null != instance55 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance55.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance55.getImage().getImageId(), instance55.getImage().getImagePath());
			}
			color = instance55.getColor();
			if (color != null) 
				color.getValue();

			ims.eas.vo.lookups.Agents voLookup55 = new ims.eas.vo.lookups.Agents(instance55.getId(),instance55.getText(), instance55.isActive(), null, img, color);
			ims.eas.vo.lookups.Agents parentVoLookup55 = voLookup55;
			ims.domain.lookups.LookupInstance parent55 = instance55.getParent();
			while (parent55 != null)
			{
				if (parent55.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent55.getImage().getImageId(), parent55.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent55.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup55.setParent(new ims.eas.vo.lookups.Agents(parent55.getId(),parent55.getText(), parent55.isActive(), null, img, color));
				parentVoLookup55 = parentVoLookup55.getParent();
								parent55 = parent55.getParent();
			}			
			valueObject.setAgent(voLookup55);
		}
				// PlanningApptDate
		java.util.Date PlanningApptDate = domainObject.getPlanningApptDate();
		if ( null != PlanningApptDate ) 
		{
			valueObject.setPlanningApptDate(new ims.framework.utils.DateTime(PlanningApptDate) );
		}
		// PlanningTransport
		ims.domain.lookups.LookupInstance instance57 = domainObject.getPlanningTransport();
		if ( null != instance57 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance57.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance57.getImage().getImageId(), instance57.getImage().getImagePath());
			}
			color = instance57.getColor();
			if (color != null) 
				color.getValue();

			ims.ccosched.vo.lookups.Transport voLookup57 = new ims.ccosched.vo.lookups.Transport(instance57.getId(),instance57.getText(), instance57.isActive(), null, img, color);
			ims.ccosched.vo.lookups.Transport parentVoLookup57 = voLookup57;
			ims.domain.lookups.LookupInstance parent57 = instance57.getParent();
			while (parent57 != null)
			{
				if (parent57.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent57.getImage().getImageId(), parent57.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent57.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup57.setParent(new ims.ccosched.vo.lookups.Transport(parent57.getId(),parent57.getText(), parent57.isActive(), null, img, color));
				parentVoLookup57 = parentVoLookup57.getParent();
								parent57 = parent57.getParent();
			}			
			valueObject.setPlanningTransport(voLookup57);
		}
				// TreatmentTransport
		ims.domain.lookups.LookupInstance instance58 = domainObject.getTreatmentTransport();
		if ( null != instance58 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance58.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance58.getImage().getImageId(), instance58.getImage().getImagePath());
			}
			color = instance58.getColor();
			if (color != null) 
				color.getValue();

			ims.ccosched.vo.lookups.Transport voLookup58 = new ims.ccosched.vo.lookups.Transport(instance58.getId(),instance58.getText(), instance58.isActive(), null, img, color);
			ims.ccosched.vo.lookups.Transport parentVoLookup58 = voLookup58;
			ims.domain.lookups.LookupInstance parent58 = instance58.getParent();
			while (parent58 != null)
			{
				if (parent58.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent58.getImage().getImageId(), parent58.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent58.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup58.setParent(new ims.ccosched.vo.lookups.Transport(parent58.getId(),parent58.getText(), parent58.isActive(), null, img, color));
				parentVoLookup58 = parentVoLookup58.getParent();
								parent58 = parent58.getParent();
			}			
			valueObject.setTreatmentTransport(voLookup58);
		}
				// IP_OP_Planning
		ims.domain.lookups.LookupInstance instance59 = domainObject.getIP_OP_Planning();
		if ( null != instance59 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance59.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance59.getImage().getImageId(), instance59.getImage().getImagePath());
			}
			color = instance59.getColor();
			if (color != null) 
				color.getValue();

			ims.ccosched.vo.lookups.AttendingAs voLookup59 = new ims.ccosched.vo.lookups.AttendingAs(instance59.getId(),instance59.getText(), instance59.isActive(), null, img, color);
			ims.ccosched.vo.lookups.AttendingAs parentVoLookup59 = voLookup59;
			ims.domain.lookups.LookupInstance parent59 = instance59.getParent();
			while (parent59 != null)
			{
				if (parent59.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent59.getImage().getImageId(), parent59.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent59.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup59.setParent(new ims.ccosched.vo.lookups.AttendingAs(parent59.getId(),parent59.getText(), parent59.isActive(), null, img, color));
				parentVoLookup59 = parentVoLookup59.getParent();
								parent59 = parent59.getParent();
			}			
			valueObject.setIP_OP_Planning(voLookup59);
		}
				// IP_OP_Treatment
		ims.domain.lookups.LookupInstance instance60 = domainObject.getIP_OP_Treatment();
		if ( null != instance60 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance60.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance60.getImage().getImageId(), instance60.getImage().getImagePath());
			}
			color = instance60.getColor();
			if (color != null) 
				color.getValue();

			ims.ccosched.vo.lookups.AttendingAs voLookup60 = new ims.ccosched.vo.lookups.AttendingAs(instance60.getId(),instance60.getText(), instance60.isActive(), null, img, color);
			ims.ccosched.vo.lookups.AttendingAs parentVoLookup60 = voLookup60;
			ims.domain.lookups.LookupInstance parent60 = instance60.getParent();
			while (parent60 != null)
			{
				if (parent60.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent60.getImage().getImageId(), parent60.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent60.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup60.setParent(new ims.ccosched.vo.lookups.AttendingAs(parent60.getId(),parent60.getText(), parent60.isActive(), null, img, color));
				parentVoLookup60 = parentVoLookup60.getParent();
								parent60 = parent60.getParent();
			}			
			valueObject.setIP_OP_Treatment(voLookup60);
		}
				// PatientStatus
		ims.domain.lookups.LookupInstance instance61 = domainObject.getPatientStatus();
		if ( null != instance61 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance61.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance61.getImage().getImageId(), instance61.getImage().getImagePath());
			}
			color = instance61.getColor();
			if (color != null) 
				color.getValue();

			ims.ccosched.vo.lookups.Status voLookup61 = new ims.ccosched.vo.lookups.Status(instance61.getId(),instance61.getText(), instance61.isActive(), null, img, color);
			ims.ccosched.vo.lookups.Status parentVoLookup61 = voLookup61;
			ims.domain.lookups.LookupInstance parent61 = instance61.getParent();
			while (parent61 != null)
			{
				if (parent61.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent61.getImage().getImageId(), parent61.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent61.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup61.setParent(new ims.ccosched.vo.lookups.Status(parent61.getId(),parent61.getText(), parent61.isActive(), null, img, color));
				parentVoLookup61 = parentVoLookup61.getParent();
								parent61 = parent61.getParent();
			}			
			valueObject.setPatientStatus(voLookup61);
		}
				// GeneratedDocument
		valueObject.setGeneratedDocument(ims.core.vo.domain.ServerDocumentVoAssembler.create(map, domainObject.getGeneratedDocument()) );
		// Annotation
		valueObject.setAnnotation(ims.eas.vo.domain.EASAnnotationVoAssembler.createEASAnnotationVoCollectionFromEASAnnotationNote(map, domainObject.getAnnotation()) );
		// GraphicAssessment
		if (domainObject.getGraphicAssessment() != null)
		{
			if(domainObject.getGraphicAssessment() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getGraphicAssessment();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setGraphicAssessment(new ims.assessment.instantiation.vo.PatientAssessmentRefVo(id, -1));				
			}
			else
			{
				valueObject.setGraphicAssessment(new ims.assessment.instantiation.vo.PatientAssessmentRefVo(domainObject.getGraphicAssessment().getId(), domainObject.getGraphicAssessment().getVersion()));
			}
		}
		// RecentCreatinine
		valueObject.setRecentCreatinine( domainObject.isRecentCreatinine() );
		// PlanningCTRequired
		valueObject.setPlanningCTRequired( domainObject.isPlanningCTRequired() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.eas.domain.objects.ElectronicActionSheet extractElectronicActionSheet(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.ElectronicActionSheetVo valueObject) 
	{
		return 	extractElectronicActionSheet(domainFactory, valueObject, new HashMap());
	}

	public static ims.eas.domain.objects.ElectronicActionSheet extractElectronicActionSheet(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.ElectronicActionSheetVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ElectronicActionSheet();
		ims.eas.domain.objects.ElectronicActionSheet domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.eas.domain.objects.ElectronicActionSheet)domMap.get(valueObject);
			}
			// ims.eas.vo.ElectronicActionSheetVo ID_ElectronicActionSheet field is unknown
			domainObject = new ims.eas.domain.objects.ElectronicActionSheet();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ElectronicActionSheet());
			if (domMap.get(key) != null)
			{
				return (ims.eas.domain.objects.ElectronicActionSheet)domMap.get(key);
			}
			domainObject = (ims.eas.domain.objects.ElectronicActionSheet) domainFactory.getDomainObject(ims.eas.domain.objects.ElectronicActionSheet.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ElectronicActionSheet());

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
		domainObject.setEasStatus(ims.eas.vo.domain.EASStatusRecordVoAssembler.extractEASStatusRecord(domainFactory, valueObject.getEasStatus(), domMap));
		domainObject.setStatusHistory(ims.eas.vo.domain.EASStatusRecordVoAssembler.extractEASStatusRecordList(domainFactory, valueObject.getStatusHistory(), domainObject.getStatusHistory(), domMap));		
		domainObject.setRecordingInfo(ims.core.vo.domain.RecordingUserInformationVoAssembler.extractRecordingUserInformation(domainFactory, valueObject.getRecordingInfo(), domMap));
		domainObject.setAuthorisedBy(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.extractMemberOfStaff(domainFactory, valueObject.getAuthorisedBy(), domMap));
		ims.framework.utils.DateTime dateTime6 = valueObject.getAuthorisedDateTime();
		java.util.Date value6 = null;
		if ( dateTime6 != null ) 
		{
			value6 = dateTime6.getJavaDate();
		}
		domainObject.setAuthorisedDateTime(value6);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value7 = null;
		if ( null != valueObject.getResponsibleHcp() ) 
		{
			if (valueObject.getResponsibleHcp().getBoId() == null)
			{
				if (domMap.get(valueObject.getResponsibleHcp()) != null)
				{
					value7 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getResponsibleHcp());
				}
			}
			else
			{
				value7 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getResponsibleHcp().getBoId());
			}
		}
		domainObject.setResponsibleHcp(value7);
		domainObject.setTPCreated(valueObject.getTPCreated());
		domainObject.setActionRequired(valueObject.getActionRequired());
		domainObject.setRemovedStat(valueObject.getRemovedStat());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getRemovalReason() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getRemovalReason().getID());
		}
		domainObject.setRemovalReason(value11);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value12 = null;
		if ( null != valueObject.getSeenBy() ) 
		{
			if (valueObject.getSeenBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getSeenBy()) != null)
				{
					value12 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getSeenBy());
				}
			}
			else
			{
				value12 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getSeenBy().getBoId());
			}
		}
		domainObject.setSeenBy(value12);
		java.util.Date value13 = null;
		ims.framework.utils.Date date13 = valueObject.getDateSeen();		
		if ( date13 != null ) 
		{
			value13 = date13.getDate();
		}
		domainObject.setDateSeen(value13);
		java.util.Date value14 = null;
		ims.framework.utils.Date date14 = valueObject.getDateDecisionToTreat();		
		if ( date14 != null ) 
		{
			value14 = date14.getDate();
		}
		domainObject.setDateDecisionToTreat(value14);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.eas.configuration.domain.objects.PrimaryTumour value15 = null;
		if ( null != valueObject.getPrimaryTumour() ) 
		{
			if (valueObject.getPrimaryTumour().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrimaryTumour()) != null)
				{
					value15 = (ims.eas.configuration.domain.objects.PrimaryTumour)domMap.get(valueObject.getPrimaryTumour());
				}
			}
			else
			{
				value15 = (ims.eas.configuration.domain.objects.PrimaryTumour)domainFactory.getDomainObject(ims.eas.configuration.domain.objects.PrimaryTumour.class, valueObject.getPrimaryTumour().getBoId());
			}
		}
		domainObject.setPrimaryTumour(value15);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.eas.configuration.domain.objects.TreatmentSites value16 = null;
		if ( null != valueObject.getTreatmentSite() ) 
		{
			if (valueObject.getTreatmentSite().getBoId() == null)
			{
				if (domMap.get(valueObject.getTreatmentSite()) != null)
				{
					value16 = (ims.eas.configuration.domain.objects.TreatmentSites)domMap.get(valueObject.getTreatmentSite());
				}
			}
			else
			{
				value16 = (ims.eas.configuration.domain.objects.TreatmentSites)domainFactory.getDomainObject(ims.eas.configuration.domain.objects.TreatmentSites.class, valueObject.getTreatmentSite().getBoId());
			}
		}
		domainObject.setTreatmentSite(value16);
		domainObject.setFirstTherapeuticIntervention(valueObject.getFirstTherapeuticIntervention());
		domainObject.setClinicalTrialPatient(valueObject.getClinicalTrialPatient());
		domainObject.setProtocolUsed(valueObject.getProtocolUsed());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value20 = null;
		if ( null != valueObject.getPatientConsent() ) 
		{
			value20 =
				domainFactory.getLookupInstance(valueObject.getPatientConsent().getID());
		}
		domainObject.setPatientConsent(value20);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value21 = null;
		if ( null != valueObject.getPlanConsSession() ) 
		{
			value21 =
				domainFactory.getLookupInstance(valueObject.getPlanConsSession().getID());
		}
		domainObject.setPlanConsSession(value21);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value22 = null;
		if ( null != valueObject.getAppropCCCL() ) 
		{
			value22 =
				domainFactory.getLookupInstance(valueObject.getAppropCCCL().getID());
		}
		domainObject.setAppropCCCL(value22);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value23 = null;
		if ( null != valueObject.getImageTransfer() ) 
		{
			value23 =
				domainFactory.getLookupInstance(valueObject.getImageTransfer().getID());
		}
		domainObject.setImageTransfer(value23);
		domainObject.setPhases(ims.eas.vo.domain.EASPhaseVoAssembler.extractEASPhaseList(domainFactory, valueObject.getPhases(), domainObject.getPhases(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value25 = null;
		if ( null != valueObject.getConcurrentSystemicTreatment() ) 
		{
			value25 =
				domainFactory.getLookupInstance(valueObject.getConcurrentSystemicTreatment().getID());
		}
		domainObject.setConcurrentSystemicTreatment(value25);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value26 = null;
		if ( null != valueObject.getSeenAt() ) 
		{
			value26 =
				domainFactory.getLookupInstance(valueObject.getSeenAt().getID());
		}
		domainObject.setSeenAt(value26);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value27 = null;
		if ( null != valueObject.getIntent() ) 
		{
			value27 =
				domainFactory.getLookupInstance(valueObject.getIntent().getID());
		}
		domainObject.setIntent(value27);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value28 = null;
		if ( null != valueObject.getPriority() ) 
		{
			value28 =
				domainFactory.getLookupInstance(valueObject.getPriority().getID());
		}
		domainObject.setPriority(value28);
		domainObject.setDelayed(valueObject.getDelayed());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDelayedComment() != null && valueObject.getDelayedComment().equals(""))
		{
			valueObject.setDelayedComment(null);
		}
		domainObject.setDelayedComment(valueObject.getDelayedComment());
		ims.framework.utils.PartialDate ReadyToTreatDate = valueObject.getReadyToTreatDate();
		Integer value31 = null;
		if ( null != ReadyToTreatDate ) 
		{
			value31 = ReadyToTreatDate.toInteger();
		}
		domainObject.setReadyToTreatDate(value31);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value32 = null;
		if ( null != valueObject.getDelayedReason() ) 
		{
			value32 =
				domainFactory.getLookupInstance(valueObject.getDelayedReason().getID());
		}
		domainObject.setDelayedReason(value32);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value33 = null;
		if ( null != valueObject.getTreatSiteLaterality() ) 
		{
			value33 =
				domainFactory.getLookupInstance(valueObject.getTreatSiteLaterality().getID());
		}
		domainObject.setTreatSiteLaterality(value33);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAnatomicalSite() != null && valueObject.getAnatomicalSite().equals(""))
		{
			valueObject.setAnatomicalSite(null);
		}
		domainObject.setAnatomicalSite(valueObject.getAnatomicalSite());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value35 = null;
		if ( null != valueObject.getClinicalTrial() ) 
		{
			value35 =
				domainFactory.getLookupInstance(valueObject.getClinicalTrial().getID());
		}
		domainObject.setClinicalTrial(value35);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.eas.configuration.domain.objects.Protocol value36 = null;
		if ( null != valueObject.getProtocol() ) 
		{
			if (valueObject.getProtocol().getBoId() == null)
			{
				if (domMap.get(valueObject.getProtocol()) != null)
				{
					value36 = (ims.eas.configuration.domain.objects.Protocol)domMap.get(valueObject.getProtocol());
				}
			}
			else
			{
				value36 = (ims.eas.configuration.domain.objects.Protocol)domainFactory.getDomainObject(ims.eas.configuration.domain.objects.Protocol.class, valueObject.getProtocol().getBoId());
			}
		}
		domainObject.setProtocol(value36);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOffProtocolReason() != null && valueObject.getOffProtocolReason().equals(""))
		{
			valueObject.setOffProtocolReason(null);
		}
		domainObject.setOffProtocolReason(valueObject.getOffProtocolReason());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getEasComment() != null && valueObject.getEasComment().equals(""))
		{
			valueObject.setEasComment(null);
		}
		domainObject.setEasComment(valueObject.getEasComment());
		domainObject.setImageTransfers(ims.eas.vo.domain.EASImageTransferVoAssembler.extractImageTransferList(domainFactory, valueObject.getImageTransfers(), domainObject.getImageTransfers(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value40 = null;
		if ( null != valueObject.getPlanningCT() ) 
		{
			value40 =
				domainFactory.getLookupInstance(valueObject.getPlanningCT().getID());
		}
		domainObject.setPlanningCT(value40);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPlanningCTText() != null && valueObject.getPlanningCTText().equals(""))
		{
			valueObject.setPlanningCTText(null);
		}
		domainObject.setPlanningCTText(valueObject.getPlanningCTText());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value42 = null;
		if ( null != valueObject.getMRIforCoReg() ) 
		{
			value42 =
				domainFactory.getLookupInstance(valueObject.getMRIforCoReg().getID());
		}
		domainObject.setMRIforCoReg(value42);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value43 = null;
		if ( null != valueObject.getDentistRequired() ) 
		{
			value43 =
				domainFactory.getLookupInstance(valueObject.getDentistRequired().getID());
		}
		domainObject.setDentistRequired(value43);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value44 = null;
		if ( null != valueObject.getPegRequired() ) 
		{
			value44 =
				domainFactory.getLookupInstance(valueObject.getPegRequired().getID());
		}
		domainObject.setPegRequired(value44);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value45 = null;
		if ( null != valueObject.getSimulationRequired() ) 
		{
			value45 =
				domainFactory.getLookupInstance(valueObject.getSimulationRequired().getID());
		}
		domainObject.setSimulationRequired(value45);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value46 = null;
		if ( null != valueObject.getIVContrast() ) 
		{
			value46 =
				domainFactory.getLookupInstance(valueObject.getIVContrast().getID());
		}
		domainObject.setIVContrast(value46);
		java.util.Date value47 = null;
		ims.framework.utils.Date date47 = valueObject.getInvestigationDate();		
		if ( date47 != null ) 
		{
			value47 = date47.getDate();
		}
		domainObject.setInvestigationDate(value47);
		domainObject.setCreatinineLevel(valueObject.getCreatinineLevel());
		ims.eas.vo.lookups.OralContrastCollection collection49 =
	valueObject.getOralContrast();
	    java.util.List domainOralContrast = domainObject.getOralContrast();;			
	    int collection49Size=0;
		if (collection49 == null)
		{
			domainOralContrast = new java.util.ArrayList(0);
		}
		else
		{
			collection49Size = collection49.size();
		}
		
		for(int i=0; i<collection49Size; i++) 
		{
			int instanceId = collection49.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainOralContrast.indexOf(dom);
			if (domIdx == -1)
			{
				domainOralContrast.add(i, dom);
			}
			else if (i != domIdx && i < domainOralContrast.size())
			{
				Object tmp = domainOralContrast.get(i);
				domainOralContrast.set(i, domainOralContrast.get(domIdx));
				domainOralContrast.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j49 = domainOralContrast.size();
		while (j49 > collection49Size)
		{
			domainOralContrast.remove(j49-1);
			j49 = domainOralContrast.size();
		}

		domainObject.setOralContrast(domainOralContrast);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value50 = null;
		if ( null != valueObject.getGatingOptions() ) 
		{
			value50 =
				domainFactory.getLookupInstance(valueObject.getGatingOptions().getID());
		}
		domainObject.setGatingOptions(value50);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value51 = null;
		if ( null != valueObject.getIMRT() ) 
		{
			value51 =
				domainFactory.getLookupInstance(valueObject.getIMRT().getID());
		}
		domainObject.setIMRT(value51);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value52 = null;
		if ( null != valueObject.getPetCT() ) 
		{
			value52 =
				domainFactory.getLookupInstance(valueObject.getPetCT().getID());
		}
		domainObject.setPetCT(value52);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value53 = null;
		if ( null != valueObject.getImmobType() ) 
		{
			value53 =
				domainFactory.getLookupInstance(valueObject.getImmobType().getID());
		}
		domainObject.setImmobType(value53);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value54 = null;
		if ( null != valueObject.getMouldRoomActivity() ) 
		{
			value54 =
				domainFactory.getLookupInstance(valueObject.getMouldRoomActivity().getID());
		}
		domainObject.setMouldRoomActivity(value54);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value55 = null;
		if ( null != valueObject.getAgent() ) 
		{
			value55 =
				domainFactory.getLookupInstance(valueObject.getAgent().getID());
		}
		domainObject.setAgent(value55);
		ims.framework.utils.DateTime dateTime56 = valueObject.getPlanningApptDate();
		java.util.Date value56 = null;
		if ( dateTime56 != null ) 
		{
			value56 = dateTime56.getJavaDate();
		}
		domainObject.setPlanningApptDate(value56);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value57 = null;
		if ( null != valueObject.getPlanningTransport() ) 
		{
			value57 =
				domainFactory.getLookupInstance(valueObject.getPlanningTransport().getID());
		}
		domainObject.setPlanningTransport(value57);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value58 = null;
		if ( null != valueObject.getTreatmentTransport() ) 
		{
			value58 =
				domainFactory.getLookupInstance(valueObject.getTreatmentTransport().getID());
		}
		domainObject.setTreatmentTransport(value58);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value59 = null;
		if ( null != valueObject.getIP_OP_Planning() ) 
		{
			value59 =
				domainFactory.getLookupInstance(valueObject.getIP_OP_Planning().getID());
		}
		domainObject.setIP_OP_Planning(value59);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value60 = null;
		if ( null != valueObject.getIP_OP_Treatment() ) 
		{
			value60 =
				domainFactory.getLookupInstance(valueObject.getIP_OP_Treatment().getID());
		}
		domainObject.setIP_OP_Treatment(value60);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value61 = null;
		if ( null != valueObject.getPatientStatus() ) 
		{
			value61 =
				domainFactory.getLookupInstance(valueObject.getPatientStatus().getID());
		}
		domainObject.setPatientStatus(value61);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.documents.domain.objects.ServerDocument value62 = null;
		if ( null != valueObject.getGeneratedDocument() ) 
		{
			if (valueObject.getGeneratedDocument().getBoId() == null)
			{
				if (domMap.get(valueObject.getGeneratedDocument()) != null)
				{
					value62 = (ims.core.documents.domain.objects.ServerDocument)domMap.get(valueObject.getGeneratedDocument());
				}
			}
			else
			{
				value62 = (ims.core.documents.domain.objects.ServerDocument)domainFactory.getDomainObject(ims.core.documents.domain.objects.ServerDocument.class, valueObject.getGeneratedDocument().getBoId());
			}
		}
		domainObject.setGeneratedDocument(value62);
		domainObject.setAnnotation(ims.eas.vo.domain.EASAnnotationVoAssembler.extractEASAnnotationNoteList(domainFactory, valueObject.getAnnotation(), domainObject.getAnnotation(), domMap));		
		ims.assessment.instantiation.domain.objects.PatientAssessment value64 = null;
		if ( null != valueObject.getGraphicAssessment() ) 
		{
			if (valueObject.getGraphicAssessment().getBoId() == null)
			{
				if (domMap.get(valueObject.getGraphicAssessment()) != null)
				{
					value64 = (ims.assessment.instantiation.domain.objects.PatientAssessment)domMap.get(valueObject.getGraphicAssessment());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value64 = domainObject.getGraphicAssessment();	
			}
			else
			{
				value64 = (ims.assessment.instantiation.domain.objects.PatientAssessment)domainFactory.getDomainObject(ims.assessment.instantiation.domain.objects.PatientAssessment.class, valueObject.getGraphicAssessment().getBoId());
			}
		}
		domainObject.setGraphicAssessment(value64);
		domainObject.setRecentCreatinine(valueObject.getRecentCreatinine());
		domainObject.setPlanningCTRequired(valueObject.getPlanningCTRequired());

		return domainObject;
	}

}
