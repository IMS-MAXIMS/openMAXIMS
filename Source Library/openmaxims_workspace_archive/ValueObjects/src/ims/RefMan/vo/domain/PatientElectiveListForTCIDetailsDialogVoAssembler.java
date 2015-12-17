/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 16/04/2014, 12:31
 *
 */
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cornel Ventuneac
 */
public class PatientElectiveListForTCIDetailsDialogVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.PatientElectiveListForTCIDetailsDialogVo copy(ims.RefMan.vo.PatientElectiveListForTCIDetailsDialogVo valueObjectDest, ims.RefMan.vo.PatientElectiveListForTCIDetailsDialogVo valueObjectSrc) 
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
		// Ward
		valueObjectDest.setWard(valueObjectSrc.getWard());
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
		// TCIDetails
		valueObjectDest.setTCIDetails(valueObjectSrc.getTCIDetails());
		// TCIHistory
		valueObjectDest.setTCIHistory(valueObjectSrc.getTCIHistory());
		// InterpretatorRequired
		valueObjectDest.setInterpretatorRequired(valueObjectSrc.getInterpretatorRequired());
		// Transport
		valueObjectDest.setTransport(valueObjectSrc.getTransport());
		// Notes
		valueObjectDest.setNotes(valueObjectSrc.getNotes());
		// EROD
		valueObjectDest.setEROD(valueObjectSrc.getEROD());
		// ERODHistory
		valueObjectDest.setERODHistory(valueObjectSrc.getERODHistory());
		// PathwayClock
		valueObjectDest.setPathwayClock(valueObjectSrc.getPathwayClock());
		// PatientStatus
		valueObjectDest.setPatientStatus(valueObjectSrc.getPatientStatus());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientElectiveListForTCIDetailsDialogVoCollectionFromPatientElectiveList(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListForTCIDetailsDialogVoCollection createPatientElectiveListForTCIDetailsDialogVoCollectionFromPatientElectiveList(java.util.Set domainObjectSet)	
	{
		return createPatientElectiveListForTCIDetailsDialogVoCollectionFromPatientElectiveList(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListForTCIDetailsDialogVoCollection createPatientElectiveListForTCIDetailsDialogVoCollectionFromPatientElectiveList(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.PatientElectiveListForTCIDetailsDialogVoCollection voList = new ims.RefMan.vo.PatientElectiveListForTCIDetailsDialogVoCollection();
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
			ims.RefMan.vo.PatientElectiveListForTCIDetailsDialogVo vo = create(map, domainObject);
			
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
	public static ims.RefMan.vo.PatientElectiveListForTCIDetailsDialogVoCollection createPatientElectiveListForTCIDetailsDialogVoCollectionFromPatientElectiveList(java.util.List domainObjectList) 
	{
		return createPatientElectiveListForTCIDetailsDialogVoCollectionFromPatientElectiveList(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListForTCIDetailsDialogVoCollection createPatientElectiveListForTCIDetailsDialogVoCollectionFromPatientElectiveList(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.PatientElectiveListForTCIDetailsDialogVoCollection voList = new ims.RefMan.vo.PatientElectiveListForTCIDetailsDialogVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.PatientElectiveList domainObject = (ims.RefMan.domain.objects.PatientElectiveList) domainObjectList.get(i);
			ims.RefMan.vo.PatientElectiveListForTCIDetailsDialogVo vo = create(map, domainObject);

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
	 public static java.util.Set extractPatientElectiveListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListForTCIDetailsDialogVoCollection voCollection) 
	 {
	 	return extractPatientElectiveListSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientElectiveListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListForTCIDetailsDialogVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientElectiveListForTCIDetailsDialogVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.PatientElectiveList domainObject = PatientElectiveListForTCIDetailsDialogVoAssembler.extractPatientElectiveList(domainFactory, vo, domMap);

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
	 public static java.util.List extractPatientElectiveListList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListForTCIDetailsDialogVoCollection voCollection) 
	 {
	 	return extractPatientElectiveListList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientElectiveListList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListForTCIDetailsDialogVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientElectiveListForTCIDetailsDialogVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.PatientElectiveList domainObject = PatientElectiveListForTCIDetailsDialogVoAssembler.extractPatientElectiveList(domainFactory, vo, domMap);

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
	 public static ims.RefMan.vo.PatientElectiveListForTCIDetailsDialogVo create(ims.RefMan.domain.objects.PatientElectiveList domainObject) 
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
	  public static ims.RefMan.vo.PatientElectiveListForTCIDetailsDialogVo create(DomainObjectMap map, ims.RefMan.domain.objects.PatientElectiveList domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.PatientElectiveListForTCIDetailsDialogVo valueObject = (ims.RefMan.vo.PatientElectiveListForTCIDetailsDialogVo) map.getValueObject(domainObject, ims.RefMan.vo.PatientElectiveListForTCIDetailsDialogVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.PatientElectiveListForTCIDetailsDialogVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.RefMan.vo.PatientElectiveListForTCIDetailsDialogVo insert(ims.RefMan.vo.PatientElectiveListForTCIDetailsDialogVo valueObject, ims.RefMan.domain.objects.PatientElectiveList domainObject) 
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
	 public static ims.RefMan.vo.PatientElectiveListForTCIDetailsDialogVo insert(DomainObjectMap map, ims.RefMan.vo.PatientElectiveListForTCIDetailsDialogVo valueObject, ims.RefMan.domain.objects.PatientElectiveList domainObject) 
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
		// Ward
		if (domainObject.getWard() != null)
		{
			if(domainObject.getWard() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getWard();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setWard(new ims.core.resource.place.vo.LocationRefVo(id, -1));				
			}
			else
			{
				valueObject.setWard(new ims.core.resource.place.vo.LocationRefVo(domainObject.getWard().getId(), domainObject.getWard().getVersion()));
			}
		}
		// Consultant
		if (domainObject.getConsultant() != null)
		{
			if(domainObject.getConsultant() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getConsultant();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setConsultant(new ims.core.resource.people.vo.HcpRefVo(id, -1));				
			}
			else
			{
				valueObject.setConsultant(new ims.core.resource.people.vo.HcpRefVo(domainObject.getConsultant().getId(), domainObject.getConsultant().getVersion()));
			}
		}
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
		// Priority
		ims.domain.lookups.LookupInstance instance15 = domainObject.getPriority();
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

			ims.RefMan.vo.lookups.ReferralUrgency voLookup15 = new ims.RefMan.vo.lookups.ReferralUrgency(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ReferralUrgency parentVoLookup15 = voLookup15;
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
								parentVoLookup15.setParent(new ims.RefMan.vo.lookups.ReferralUrgency(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setPriority(voLookup15);
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
		if (domainObject.getPrimaryProcedure() != null)
		{
			if(domainObject.getPrimaryProcedure() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPrimaryProcedure();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPrimaryProcedure(new ims.core.clinical.vo.ProcedureRefVo(id, -1));				
			}
			else
			{
				valueObject.setPrimaryProcedure(new ims.core.clinical.vo.ProcedureRefVo(domainObject.getPrimaryProcedure().getId(), domainObject.getPrimaryProcedure().getVersion()));
			}
		}
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
		// Transport
		ims.domain.lookups.LookupInstance instance23 = domainObject.getTransport();
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

			ims.scheduling.vo.lookups.ApptTransportType voLookup23 = new ims.scheduling.vo.lookups.ApptTransportType(instance23.getId(),instance23.getText(), instance23.isActive(), null, img, color);
			ims.scheduling.vo.lookups.ApptTransportType parentVoLookup23 = voLookup23;
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
								parentVoLookup23.setParent(new ims.scheduling.vo.lookups.ApptTransportType(parent23.getId(),parent23.getText(), parent23.isActive(), null, img, color));
				parentVoLookup23 = parentVoLookup23.getParent();
								parent23 = parent23.getParent();
			}			
			valueObject.setTransport(voLookup23);
		}
				// Notes
		ims.RefMan.vo.NotesForPatientElectiveListRefVoCollection Notes = new ims.RefMan.vo.NotesForPatientElectiveListRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getNotes().iterator(); iterator.hasNext(); ) 
		{
			ims.RefMan.domain.objects.NotesForPatientElectiveList tmp = (ims.RefMan.domain.objects.NotesForPatientElectiveList)iterator.next();
			if (tmp != null)
				Notes.add(new ims.RefMan.vo.NotesForPatientElectiveListRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setNotes(Notes);
		// EROD
		valueObject.setEROD(ims.RefMan.vo.domain.ReferralERODVoAssembler.create(map, domainObject.getEROD()) );
		// ERODHistory
		valueObject.setERODHistory(ims.RefMan.vo.domain.ReferralERODVoAssembler.createReferralERODVoCollectionFromReferralEROD(map, domainObject.getERODHistory()) );
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
		// PatientStatus
		ims.domain.lookups.LookupInstance instance28 = domainObject.getPatientStatus();
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

			ims.RefMan.vo.lookups.CatsReferralCategory voLookup28 = new ims.RefMan.vo.lookups.CatsReferralCategory(instance28.getId(),instance28.getText(), instance28.isActive(), null, img, color);
			ims.RefMan.vo.lookups.CatsReferralCategory parentVoLookup28 = voLookup28;
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
								parentVoLookup28.setParent(new ims.RefMan.vo.lookups.CatsReferralCategory(parent28.getId(),parent28.getText(), parent28.isActive(), null, img, color));
				parentVoLookup28 = parentVoLookup28.getParent();
								parent28 = parent28.getParent();
			}			
			valueObject.setPatientStatus(voLookup28);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.PatientElectiveList extractPatientElectiveList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListForTCIDetailsDialogVo valueObject) 
	{
		return 	extractPatientElectiveList(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.PatientElectiveList extractPatientElectiveList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListForTCIDetailsDialogVo valueObject, HashMap domMap) 
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
			// ims.RefMan.vo.PatientElectiveListForTCIDetailsDialogVo ID_PatientElectiveList field is unknown
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

		domainObject.setElectiveList(ims.admin.vo.domain.ElectiveListConfigurationVoAssembler.extractElectiveListConfiguration(domainFactory, valueObject.getElectiveList(), domMap));
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
		ims.core.resource.place.domain.objects.Location value7 = null;
		if ( null != valueObject.getWard() ) 
		{
			if (valueObject.getWard().getBoId() == null)
			{
				if (domMap.get(valueObject.getWard()) != null)
				{
					value7 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getWard());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value7 = domainObject.getWard();	
			}
			else
			{
				value7 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getWard().getBoId());
			}
		}
		domainObject.setWard(value7);
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
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value8 = domainObject.getConsultant();	
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
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getPriority() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getPriority().getID());
		}
		domainObject.setPriority(value15);

		ims.RefMan.vo.SuspensionDetailsForPatientElectiveListRefVoCollection refCollection16 = valueObject.getSuspensions();
		int size16 = (null == refCollection16) ? 0 : refCollection16.size();		
		java.util.List domainSuspensions16 = domainObject.getSuspensions();
		if (domainSuspensions16 == null)
		{
			domainSuspensions16 = new java.util.ArrayList();
		}
		for(int i=0; i < size16; i++) 
		{
			ims.RefMan.vo.SuspensionDetailsForPatientElectiveListRefVo vo = refCollection16.get(i);			
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

			int domIdx = domainSuspensions16.indexOf(dom);
			if (domIdx == -1)
			{
				domainSuspensions16.add(i, dom);
			}
			else if (i != domIdx && i < domainSuspensions16.size())
			{
				Object tmp = domainSuspensions16.get(i);
				domainSuspensions16.set(i, domainSuspensions16.get(domIdx));
				domainSuspensions16.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i16 = domainSuspensions16.size();
		while (i16 > size16)
		{
			domainSuspensions16.remove(i16-1);
			i16 = domainSuspensions16.size();
		}
		
		domainObject.setSuspensions(domainSuspensions16);		
		domainObject.setOperativeProcedureStatus(valueObject.getOperativeProcedureStatus());
		ims.core.clinical.domain.objects.Procedure value18 = null;
		if ( null != valueObject.getPrimaryProcedure() ) 
		{
			if (valueObject.getPrimaryProcedure().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrimaryProcedure()) != null)
				{
					value18 = (ims.core.clinical.domain.objects.Procedure)domMap.get(valueObject.getPrimaryProcedure());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value18 = domainObject.getPrimaryProcedure();	
			}
			else
			{
				value18 = (ims.core.clinical.domain.objects.Procedure)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Procedure.class, valueObject.getPrimaryProcedure().getBoId());
			}
		}
		domainObject.setPrimaryProcedure(value18);

		ims.core.clinical.vo.ProcedureRefVoCollection refCollection19 = valueObject.getOtherProcedures();
		int size19 = (null == refCollection19) ? 0 : refCollection19.size();		
		java.util.List domainOtherProcedures19 = domainObject.getOtherProcedures();
		if (domainOtherProcedures19 == null)
		{
			domainOtherProcedures19 = new java.util.ArrayList();
		}
		for(int i=0; i < size19; i++) 
		{
			ims.core.clinical.vo.ProcedureRefVo vo = refCollection19.get(i);			
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

			int domIdx = domainOtherProcedures19.indexOf(dom);
			if (domIdx == -1)
			{
				domainOtherProcedures19.add(i, dom);
			}
			else if (i != domIdx && i < domainOtherProcedures19.size())
			{
				Object tmp = domainOtherProcedures19.get(i);
				domainOtherProcedures19.set(i, domainOtherProcedures19.get(domIdx));
				domainOtherProcedures19.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i19 = domainOtherProcedures19.size();
		while (i19 > size19)
		{
			domainOtherProcedures19.remove(i19-1);
			i19 = domainOtherProcedures19.size();
		}
		
		domainObject.setOtherProcedures(domainOtherProcedures19);		
		domainObject.setTCIDetails(ims.RefMan.vo.domain.PatientElectiveListTCIVoAssembler.extractTCIForPatientElectiveList(domainFactory, valueObject.getTCIDetails(), domMap));
		domainObject.setTCIHistory(ims.RefMan.vo.domain.PatientElectiveListTCIVoAssembler.extractTCIForPatientElectiveListList(domainFactory, valueObject.getTCIHistory(), domainObject.getTCIHistory(), domMap));		
		domainObject.setInterpretatorRequired(valueObject.getInterpretatorRequired());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value23 = null;
		if ( null != valueObject.getTransport() ) 
		{
			value23 =
				domainFactory.getLookupInstance(valueObject.getTransport().getID());
		}
		domainObject.setTransport(value23);

		ims.RefMan.vo.NotesForPatientElectiveListRefVoCollection refCollection24 = valueObject.getNotes();
		int size24 = (null == refCollection24) ? 0 : refCollection24.size();		
		java.util.Set domainNotes24 = domainObject.getNotes();
		if (domainNotes24 == null)
		{
			domainNotes24 = new java.util.HashSet();
		}
		java.util.Set newSet24  = new java.util.HashSet();
		for(int i=0; i<size24; i++) 
		{
			ims.RefMan.vo.NotesForPatientElectiveListRefVo vo = refCollection24.get(i);					
			ims.RefMan.domain.objects.NotesForPatientElectiveList dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.RefMan.domain.objects.NotesForPatientElectiveList)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.RefMan.domain.objects.NotesForPatientElectiveList)domainFactory.getDomainObject( ims.RefMan.domain.objects.NotesForPatientElectiveList.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainNotes24.contains(dom))
			{
				domainNotes24.add(dom);
			}
			newSet24.add(dom);			
		}
		java.util.Set removedSet24 = new java.util.HashSet();
		java.util.Iterator iter24 = domainNotes24.iterator();
		//Find out which objects need to be removed
		while (iter24.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter24.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet24.contains(o))
			{
				removedSet24.add(o);
			}
		}
		iter24 = removedSet24.iterator();
		//Remove the unwanted objects
		while (iter24.hasNext())
		{
			domainNotes24.remove(iter24.next());
		}		
		
		domainObject.setNotes(domainNotes24);		
		domainObject.setEROD(ims.RefMan.vo.domain.ReferralERODVoAssembler.extractReferralEROD(domainFactory, valueObject.getEROD(), domMap));
		domainObject.setERODHistory(ims.RefMan.vo.domain.ReferralERODVoAssembler.extractReferralERODList(domainFactory, valueObject.getERODHistory(), domainObject.getERODHistory(), domMap));		
		ims.pathways.domain.objects.PathwayClock value27 = null;
		if ( null != valueObject.getPathwayClock() ) 
		{
			if (valueObject.getPathwayClock().getBoId() == null)
			{
				if (domMap.get(valueObject.getPathwayClock()) != null)
				{
					value27 = (ims.pathways.domain.objects.PathwayClock)domMap.get(valueObject.getPathwayClock());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value27 = domainObject.getPathwayClock();	
			}
			else
			{
				value27 = (ims.pathways.domain.objects.PathwayClock)domainFactory.getDomainObject(ims.pathways.domain.objects.PathwayClock.class, valueObject.getPathwayClock().getBoId());
			}
		}
		domainObject.setPathwayClock(value27);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value28 = null;
		if ( null != valueObject.getPatientStatus() ) 
		{
			value28 =
				domainFactory.getLookupInstance(valueObject.getPatientStatus().getID());
		}
		domainObject.setPatientStatus(value28);

		return domainObject;
	}

}
