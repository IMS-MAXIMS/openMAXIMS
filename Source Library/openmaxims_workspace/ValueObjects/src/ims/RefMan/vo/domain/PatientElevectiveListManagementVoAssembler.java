/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 16/04/2014, 12:32
 *
 */
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cornel Ventuneac
 */
public class PatientElevectiveListManagementVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.PatientElevectiveListManagementVo copy(ims.RefMan.vo.PatientElevectiveListManagementVo valueObjectDest, ims.RefMan.vo.PatientElevectiveListManagementVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientElectiveList(valueObjectSrc.getID_PatientElectiveList());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// Referral
		valueObjectDest.setReferral(valueObjectSrc.getReferral());
		// Consultant
		valueObjectDest.setConsultant(valueObjectSrc.getConsultant());
		// DateOnList
		valueObjectDest.setDateOnList(valueObjectSrc.getDateOnList());
		// ElectiveAdmissionType
		valueObjectDest.setElectiveAdmissionType(valueObjectSrc.getElectiveAdmissionType());
		// IntendedManagement
		valueObjectDest.setIntendedManagement(valueObjectSrc.getIntendedManagement());
		// AnticipatedStay
		valueObjectDest.setAnticipatedStay(valueObjectSrc.getAnticipatedStay());
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
		// Notes
		valueObjectDest.setNotes(valueObjectSrc.getNotes());
		// EROD
		valueObjectDest.setEROD(valueObjectSrc.getEROD());
		// ERODHistory
		valueObjectDest.setERODHistory(valueObjectSrc.getERODHistory());
		// TCIDetails
		valueObjectDest.setTCIDetails(valueObjectSrc.getTCIDetails());
		// ElectiveList
		valueObjectDest.setElectiveList(valueObjectSrc.getElectiveList());
		// ElectiveListStatus
		valueObjectDest.setElectiveListStatus(valueObjectSrc.getElectiveListStatus());
		// PatientStatus
		valueObjectDest.setPatientStatus(valueObjectSrc.getPatientStatus());
		// RequiresTCIBy
		valueObjectDest.setRequiresTCIBy(valueObjectSrc.getRequiresTCIBy());
		// ElectiveListReason
		valueObjectDest.setElectiveListReason(valueObjectSrc.getElectiveListReason());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientElevectiveListManagementVoCollectionFromPatientElectiveList(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElevectiveListManagementVoCollection createPatientElevectiveListManagementVoCollectionFromPatientElectiveList(java.util.Set domainObjectSet)	
	{
		return createPatientElevectiveListManagementVoCollectionFromPatientElectiveList(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElevectiveListManagementVoCollection createPatientElevectiveListManagementVoCollectionFromPatientElectiveList(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.PatientElevectiveListManagementVoCollection voList = new ims.RefMan.vo.PatientElevectiveListManagementVoCollection();
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
			ims.RefMan.vo.PatientElevectiveListManagementVo vo = create(map, domainObject);
			
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
	public static ims.RefMan.vo.PatientElevectiveListManagementVoCollection createPatientElevectiveListManagementVoCollectionFromPatientElectiveList(java.util.List domainObjectList) 
	{
		return createPatientElevectiveListManagementVoCollectionFromPatientElectiveList(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElevectiveListManagementVoCollection createPatientElevectiveListManagementVoCollectionFromPatientElectiveList(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.PatientElevectiveListManagementVoCollection voList = new ims.RefMan.vo.PatientElevectiveListManagementVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.PatientElectiveList domainObject = (ims.RefMan.domain.objects.PatientElectiveList) domainObjectList.get(i);
			ims.RefMan.vo.PatientElevectiveListManagementVo vo = create(map, domainObject);

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
	 public static java.util.Set extractPatientElectiveListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElevectiveListManagementVoCollection voCollection) 
	 {
	 	return extractPatientElectiveListSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientElectiveListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElevectiveListManagementVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientElevectiveListManagementVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.PatientElectiveList domainObject = PatientElevectiveListManagementVoAssembler.extractPatientElectiveList(domainFactory, vo, domMap);

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
	 public static java.util.List extractPatientElectiveListList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElevectiveListManagementVoCollection voCollection) 
	 {
	 	return extractPatientElectiveListList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientElectiveListList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElevectiveListManagementVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientElevectiveListManagementVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.PatientElectiveList domainObject = PatientElevectiveListManagementVoAssembler.extractPatientElectiveList(domainFactory, vo, domMap);

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
	 public static ims.RefMan.vo.PatientElevectiveListManagementVo create(ims.RefMan.domain.objects.PatientElectiveList domainObject) 
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
	  public static ims.RefMan.vo.PatientElevectiveListManagementVo create(DomainObjectMap map, ims.RefMan.domain.objects.PatientElectiveList domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.PatientElevectiveListManagementVo valueObject = (ims.RefMan.vo.PatientElevectiveListManagementVo) map.getValueObject(domainObject, ims.RefMan.vo.PatientElevectiveListManagementVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.PatientElevectiveListManagementVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.RefMan.vo.PatientElevectiveListManagementVo insert(ims.RefMan.vo.PatientElevectiveListManagementVo valueObject, ims.RefMan.domain.objects.PatientElectiveList domainObject) 
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
	 public static ims.RefMan.vo.PatientElevectiveListManagementVo insert(DomainObjectMap map, ims.RefMan.vo.PatientElevectiveListManagementVo valueObject, ims.RefMan.domain.objects.PatientElectiveList domainObject) 
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
			
		// Patient
		valueObject.setPatient(ims.core.vo.domain.PatientLite_IdentifiersVoAssembler.create(map, domainObject.getPatient()) );
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
		// Consultant
		valueObject.setConsultant(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getConsultant()) );
		// DateOnList
		java.util.Date DateOnList = domainObject.getDateOnList();
		if ( null != DateOnList ) 
		{
			valueObject.setDateOnList(new ims.framework.utils.Date(DateOnList) );
		}
		// ElectiveAdmissionType
		ims.domain.lookups.LookupInstance instance5 = domainObject.getElectiveAdmissionType();
		if ( null != instance5 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance5.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance5.getImage().getImageId(), instance5.getImage().getImagePath());
			}
			color = instance5.getColor();
			if (color != null) 
				color.getValue();

			ims.RefMan.vo.lookups.ElectiveAdmissionType voLookup5 = new ims.RefMan.vo.lookups.ElectiveAdmissionType(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ElectiveAdmissionType parentVoLookup5 = voLookup5;
			ims.domain.lookups.LookupInstance parent5 = instance5.getParent();
			while (parent5 != null)
			{
				if (parent5.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent5.getImage().getImageId(), parent5.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent5.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup5.setParent(new ims.RefMan.vo.lookups.ElectiveAdmissionType(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setElectiveAdmissionType(voLookup5);
		}
				// IntendedManagement
		ims.domain.lookups.LookupInstance instance6 = domainObject.getIntendedManagement();
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

			ims.core.vo.lookups.ManagementIntention voLookup6 = new ims.core.vo.lookups.ManagementIntention(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.ManagementIntention parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.ManagementIntention(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setIntendedManagement(voLookup6);
		}
				// AnticipatedStay
		valueObject.setAnticipatedStay(domainObject.getAnticipatedStay());
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
		// OtherProcedures
		ims.core.clinical.vo.ProcedureRefVoCollection OtherProcedures = new ims.core.clinical.vo.ProcedureRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getOtherProcedures().iterator(); iterator.hasNext(); ) 
		{
			ims.core.clinical.domain.objects.Procedure tmp = (ims.core.clinical.domain.objects.Procedure)iterator.next();
			if (tmp != null)
				OtherProcedures.add(new ims.core.clinical.vo.ProcedureRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setOtherProcedures(OtherProcedures);
		// TCIHistory
		ims.RefMan.vo.TCIForPatientElectiveListRefVoCollection TCIHistory = new ims.RefMan.vo.TCIForPatientElectiveListRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getTCIHistory().iterator(); iterator.hasNext(); ) 
		{
			ims.RefMan.domain.objects.TCIForPatientElectiveList tmp = (ims.RefMan.domain.objects.TCIForPatientElectiveList)iterator.next();
			if (tmp != null)
				TCIHistory.add(new ims.RefMan.vo.TCIForPatientElectiveListRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setTCIHistory(TCIHistory);
		// InterpretatorRequired
		valueObject.setInterpretatorRequired( domainObject.isInterpretatorRequired() );
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
		// ERODHistory
		ims.RefMan.vo.ReferralERODRefVoCollection ERODHistory = new ims.RefMan.vo.ReferralERODRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getERODHistory().iterator(); iterator.hasNext(); ) 
		{
			ims.RefMan.domain.objects.ReferralEROD tmp = (ims.RefMan.domain.objects.ReferralEROD)iterator.next();
			if (tmp != null)
				ERODHistory.add(new ims.RefMan.vo.ReferralERODRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setERODHistory(ERODHistory);
		// TCIDetails
		valueObject.setTCIDetails(ims.RefMan.vo.domain.PatientElectiveListTCIVoAssembler.create(map, domainObject.getTCIDetails()) );
		// ElectiveList
		valueObject.setElectiveList(ims.admin.vo.domain.ElectiveListConfigurationVoAssembler.create(map, domainObject.getElectiveList()) );
		// ElectiveListStatus
		valueObject.setElectiveListStatus(ims.RefMan.vo.domain.ElectiveListStatusVoAssembler.create(map, domainObject.getElectiveListStatus()) );
		// PatientStatus
		ims.domain.lookups.LookupInstance instance20 = domainObject.getPatientStatus();
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

			ims.RefMan.vo.lookups.CatsReferralCategory voLookup20 = new ims.RefMan.vo.lookups.CatsReferralCategory(instance20.getId(),instance20.getText(), instance20.isActive(), null, img, color);
			ims.RefMan.vo.lookups.CatsReferralCategory parentVoLookup20 = voLookup20;
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
								parentVoLookup20.setParent(new ims.RefMan.vo.lookups.CatsReferralCategory(parent20.getId(),parent20.getText(), parent20.isActive(), null, img, color));
				parentVoLookup20 = parentVoLookup20.getParent();
								parent20 = parent20.getParent();
			}			
			valueObject.setPatientStatus(voLookup20);
		}
				// RequiresTCIBy
		java.util.Date RequiresTCIBy = domainObject.getRequiresTCIBy();
		if ( null != RequiresTCIBy ) 
		{
			valueObject.setRequiresTCIBy(new ims.framework.utils.Date(RequiresTCIBy) );
		}
		// ElectiveListReason
		ims.domain.lookups.LookupInstance instance22 = domainObject.getElectiveListReason();
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

			ims.emergency.vo.lookups.ElectiveListReason voLookup22 = new ims.emergency.vo.lookups.ElectiveListReason(instance22.getId(),instance22.getText(), instance22.isActive(), null, img, color);
			ims.emergency.vo.lookups.ElectiveListReason parentVoLookup22 = voLookup22;
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
								parentVoLookup22.setParent(new ims.emergency.vo.lookups.ElectiveListReason(parent22.getId(),parent22.getText(), parent22.isActive(), null, img, color));
				parentVoLookup22 = parentVoLookup22.getParent();
								parent22 = parent22.getParent();
			}			
			valueObject.setElectiveListReason(voLookup22);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.PatientElectiveList extractPatientElectiveList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElevectiveListManagementVo valueObject) 
	{
		return 	extractPatientElectiveList(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.PatientElectiveList extractPatientElectiveList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElevectiveListManagementVo valueObject, HashMap domMap) 
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
			// ims.RefMan.vo.PatientElevectiveListManagementVo ID_PatientElectiveList field is unknown
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
			else
			{
				value1 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value1);
		ims.RefMan.domain.objects.CatsReferral value2 = null;
		if ( null != valueObject.getReferral() ) 
		{
			if (valueObject.getReferral().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferral()) != null)
				{
					value2 = (ims.RefMan.domain.objects.CatsReferral)domMap.get(valueObject.getReferral());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getReferral();	
			}
			else
			{
				value2 = (ims.RefMan.domain.objects.CatsReferral)domainFactory.getDomainObject(ims.RefMan.domain.objects.CatsReferral.class, valueObject.getReferral().getBoId());
			}
		}
		domainObject.setReferral(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value3 = null;
		if ( null != valueObject.getConsultant() ) 
		{
			if (valueObject.getConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getConsultant()) != null)
				{
					value3 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getConsultant());
				}
			}
			else
			{
				value3 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getConsultant().getBoId());
			}
		}
		domainObject.setConsultant(value3);
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getDateOnList();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setDateOnList(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getElectiveAdmissionType() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getElectiveAdmissionType().getID());
		}
		domainObject.setElectiveAdmissionType(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getIntendedManagement() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getIntendedManagement().getID());
		}
		domainObject.setIntendedManagement(value6);
		domainObject.setAnticipatedStay(valueObject.getAnticipatedStay());

		ims.RefMan.vo.SuspensionDetailsForPatientElectiveListRefVoCollection refCollection8 = valueObject.getSuspensions();
		int size8 = (null == refCollection8) ? 0 : refCollection8.size();		
		java.util.List domainSuspensions8 = domainObject.getSuspensions();
		if (domainSuspensions8 == null)
		{
			domainSuspensions8 = new java.util.ArrayList();
		}
		for(int i=0; i < size8; i++) 
		{
			ims.RefMan.vo.SuspensionDetailsForPatientElectiveListRefVo vo = refCollection8.get(i);			
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

			int domIdx = domainSuspensions8.indexOf(dom);
			if (domIdx == -1)
			{
				domainSuspensions8.add(i, dom);
			}
			else if (i != domIdx && i < domainSuspensions8.size())
			{
				Object tmp = domainSuspensions8.get(i);
				domainSuspensions8.set(i, domainSuspensions8.get(domIdx));
				domainSuspensions8.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i8 = domainSuspensions8.size();
		while (i8 > size8)
		{
			domainSuspensions8.remove(i8-1);
			i8 = domainSuspensions8.size();
		}
		
		domainObject.setSuspensions(domainSuspensions8);		
		domainObject.setOperativeProcedureStatus(valueObject.getOperativeProcedureStatus());
		domainObject.setPrimaryProcedure(ims.core.vo.domain.ProcedureLiteVoAssembler.extractProcedure(domainFactory, valueObject.getPrimaryProcedure(), domMap));

		ims.core.clinical.vo.ProcedureRefVoCollection refCollection11 = valueObject.getOtherProcedures();
		int size11 = (null == refCollection11) ? 0 : refCollection11.size();		
		java.util.List domainOtherProcedures11 = domainObject.getOtherProcedures();
		if (domainOtherProcedures11 == null)
		{
			domainOtherProcedures11 = new java.util.ArrayList();
		}
		for(int i=0; i < size11; i++) 
		{
			ims.core.clinical.vo.ProcedureRefVo vo = refCollection11.get(i);			
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

			int domIdx = domainOtherProcedures11.indexOf(dom);
			if (domIdx == -1)
			{
				domainOtherProcedures11.add(i, dom);
			}
			else if (i != domIdx && i < domainOtherProcedures11.size())
			{
				Object tmp = domainOtherProcedures11.get(i);
				domainOtherProcedures11.set(i, domainOtherProcedures11.get(domIdx));
				domainOtherProcedures11.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i11 = domainOtherProcedures11.size();
		while (i11 > size11)
		{
			domainOtherProcedures11.remove(i11-1);
			i11 = domainOtherProcedures11.size();
		}
		
		domainObject.setOtherProcedures(domainOtherProcedures11);		

		ims.RefMan.vo.TCIForPatientElectiveListRefVoCollection refCollection12 = valueObject.getTCIHistory();
		int size12 = (null == refCollection12) ? 0 : refCollection12.size();		
		java.util.List domainTCIHistory12 = domainObject.getTCIHistory();
		if (domainTCIHistory12 == null)
		{
			domainTCIHistory12 = new java.util.ArrayList();
		}
		for(int i=0; i < size12; i++) 
		{
			ims.RefMan.vo.TCIForPatientElectiveListRefVo vo = refCollection12.get(i);			
			ims.RefMan.domain.objects.TCIForPatientElectiveList dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.RefMan.domain.objects.TCIForPatientElectiveList)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.RefMan.domain.objects.TCIForPatientElectiveList)domainFactory.getDomainObject( ims.RefMan.domain.objects.TCIForPatientElectiveList.class, vo.getBoId());
				}
			}

			int domIdx = domainTCIHistory12.indexOf(dom);
			if (domIdx == -1)
			{
				domainTCIHistory12.add(i, dom);
			}
			else if (i != domIdx && i < domainTCIHistory12.size())
			{
				Object tmp = domainTCIHistory12.get(i);
				domainTCIHistory12.set(i, domainTCIHistory12.get(domIdx));
				domainTCIHistory12.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i12 = domainTCIHistory12.size();
		while (i12 > size12)
		{
			domainTCIHistory12.remove(i12-1);
			i12 = domainTCIHistory12.size();
		}
		
		domainObject.setTCIHistory(domainTCIHistory12);		
		domainObject.setInterpretatorRequired(valueObject.getInterpretatorRequired());

		ims.RefMan.vo.NotesForPatientElectiveListRefVoCollection refCollection14 = valueObject.getNotes();
		int size14 = (null == refCollection14) ? 0 : refCollection14.size();		
		java.util.Set domainNotes14 = domainObject.getNotes();
		if (domainNotes14 == null)
		{
			domainNotes14 = new java.util.HashSet();
		}
		java.util.Set newSet14  = new java.util.HashSet();
		for(int i=0; i<size14; i++) 
		{
			ims.RefMan.vo.NotesForPatientElectiveListRefVo vo = refCollection14.get(i);					
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
			if (!domainNotes14.contains(dom))
			{
				domainNotes14.add(dom);
			}
			newSet14.add(dom);			
		}
		java.util.Set removedSet14 = new java.util.HashSet();
		java.util.Iterator iter14 = domainNotes14.iterator();
		//Find out which objects need to be removed
		while (iter14.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter14.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet14.contains(o))
			{
				removedSet14.add(o);
			}
		}
		iter14 = removedSet14.iterator();
		//Remove the unwanted objects
		while (iter14.hasNext())
		{
			domainNotes14.remove(iter14.next());
		}		
		
		domainObject.setNotes(domainNotes14);		
		ims.RefMan.domain.objects.ReferralEROD value15 = null;
		if ( null != valueObject.getEROD() ) 
		{
			if (valueObject.getEROD().getBoId() == null)
			{
				if (domMap.get(valueObject.getEROD()) != null)
				{
					value15 = (ims.RefMan.domain.objects.ReferralEROD)domMap.get(valueObject.getEROD());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value15 = domainObject.getEROD();	
			}
			else
			{
				value15 = (ims.RefMan.domain.objects.ReferralEROD)domainFactory.getDomainObject(ims.RefMan.domain.objects.ReferralEROD.class, valueObject.getEROD().getBoId());
			}
		}
		domainObject.setEROD(value15);

		ims.RefMan.vo.ReferralERODRefVoCollection refCollection16 = valueObject.getERODHistory();
		int size16 = (null == refCollection16) ? 0 : refCollection16.size();		
		java.util.List domainERODHistory16 = domainObject.getERODHistory();
		if (domainERODHistory16 == null)
		{
			domainERODHistory16 = new java.util.ArrayList();
		}
		for(int i=0; i < size16; i++) 
		{
			ims.RefMan.vo.ReferralERODRefVo vo = refCollection16.get(i);			
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

			int domIdx = domainERODHistory16.indexOf(dom);
			if (domIdx == -1)
			{
				domainERODHistory16.add(i, dom);
			}
			else if (i != domIdx && i < domainERODHistory16.size())
			{
				Object tmp = domainERODHistory16.get(i);
				domainERODHistory16.set(i, domainERODHistory16.get(domIdx));
				domainERODHistory16.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i16 = domainERODHistory16.size();
		while (i16 > size16)
		{
			domainERODHistory16.remove(i16-1);
			i16 = domainERODHistory16.size();
		}
		
		domainObject.setERODHistory(domainERODHistory16);		
		domainObject.setTCIDetails(ims.RefMan.vo.domain.PatientElectiveListTCIVoAssembler.extractTCIForPatientElectiveList(domainFactory, valueObject.getTCIDetails(), domMap));
		domainObject.setElectiveList(ims.admin.vo.domain.ElectiveListConfigurationVoAssembler.extractElectiveListConfiguration(domainFactory, valueObject.getElectiveList(), domMap));
		domainObject.setElectiveListStatus(ims.RefMan.vo.domain.ElectiveListStatusVoAssembler.extractElectiveListStatus(domainFactory, valueObject.getElectiveListStatus(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value20 = null;
		if ( null != valueObject.getPatientStatus() ) 
		{
			value20 =
				domainFactory.getLookupInstance(valueObject.getPatientStatus().getID());
		}
		domainObject.setPatientStatus(value20);
		java.util.Date value21 = null;
		ims.framework.utils.Date date21 = valueObject.getRequiresTCIBy();		
		if ( date21 != null ) 
		{
			value21 = date21.getDate();
		}
		domainObject.setRequiresTCIBy(value21);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value22 = null;
		if ( null != valueObject.getElectiveListReason() ) 
		{
			value22 =
				domainFactory.getLookupInstance(valueObject.getElectiveListReason().getID());
		}
		domainObject.setElectiveListReason(value22);

		return domainObject;
	}

}
