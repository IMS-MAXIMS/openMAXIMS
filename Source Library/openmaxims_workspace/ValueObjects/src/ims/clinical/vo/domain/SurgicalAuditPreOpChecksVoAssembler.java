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
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Florin Blindu
 */
public class SurgicalAuditPreOpChecksVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.SurgicalAuditPreOpChecksVo copy(ims.clinical.vo.SurgicalAuditPreOpChecksVo valueObjectDest, ims.clinical.vo.SurgicalAuditPreOpChecksVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_SurgicalAuditPreOpChecks(valueObjectSrc.getID_SurgicalAuditPreOpChecks());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// PlannedProcedures
		valueObjectDest.setPlannedProcedures(valueObjectSrc.getPlannedProcedures());
		// Consultant
		valueObjectDest.setConsultant(valueObjectSrc.getConsultant());
		// SentForTime
		valueObjectDest.setSentForTime(valueObjectSrc.getSentForTime());
		// ArrivalTime
		valueObjectDest.setArrivalTime(valueObjectSrc.getArrivalTime());
		// LeaveHoldingTime
		valueObjectDest.setLeaveHoldingTime(valueObjectSrc.getLeaveHoldingTime());
		// AccompanyingNurse
		valueObjectDest.setAccompanyingNurse(valueObjectSrc.getAccompanyingNurse());
		// TransferredFrom
		valueObjectDest.setTransferredFrom(valueObjectSrc.getTransferredFrom());
		// ASAGrade
		valueObjectDest.setASAGrade(valueObjectSrc.getASAGrade());
		// ConsentReceived
		valueObjectDest.setConsentReceived(valueObjectSrc.getConsentReceived());
		// ConsentAuthBy
		valueObjectDest.setConsentAuthBy(valueObjectSrc.getConsentAuthBy());
		// BMI
		valueObjectDest.setBMI(valueObjectSrc.getBMI());
		// SiteMarked
		valueObjectDest.setSiteMarked(valueObjectSrc.getSiteMarked());
		// ActionTaken
		valueObjectDest.setActionTaken(valueObjectSrc.getActionTaken());
		// ConfirmPatientDetails
		valueObjectDest.setConfirmPatientDetails(valueObjectSrc.getConfirmPatientDetails());
		// PreOpCheckDone
		valueObjectDest.setPreOpCheckDone(valueObjectSrc.getPreOpCheckDone());
		// AccompanyingLocumBool
		valueObjectDest.setAccompanyingLocumBool(valueObjectSrc.getAccompanyingLocumBool());
		// AccompanyingLocumNurse
		valueObjectDest.setAccompanyingLocumNurse(valueObjectSrc.getAccompanyingLocumNurse());
		// TheatreNurse
		valueObjectDest.setTheatreNurse(valueObjectSrc.getTheatreNurse());
		// TheatreNurseLocumBool
		valueObjectDest.setTheatreNurseLocumBool(valueObjectSrc.getTheatreNurseLocumBool());
		// TheatreNurseLocumNurse
		valueObjectDest.setTheatreNurseLocumNurse(valueObjectSrc.getTheatreNurseLocumNurse());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSurgicalAuditPreOpChecksVoCollectionFromSurgicalAuditPreOpChecks(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.SurgicalAuditPreOpChecks objects.
	 */
	public static ims.clinical.vo.SurgicalAuditPreOpChecksVoCollection createSurgicalAuditPreOpChecksVoCollectionFromSurgicalAuditPreOpChecks(java.util.Set domainObjectSet)	
	{
		return createSurgicalAuditPreOpChecksVoCollectionFromSurgicalAuditPreOpChecks(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.SurgicalAuditPreOpChecks objects.
	 */
	public static ims.clinical.vo.SurgicalAuditPreOpChecksVoCollection createSurgicalAuditPreOpChecksVoCollectionFromSurgicalAuditPreOpChecks(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.SurgicalAuditPreOpChecksVoCollection voList = new ims.clinical.vo.SurgicalAuditPreOpChecksVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.SurgicalAuditPreOpChecks domainObject = (ims.clinical.domain.objects.SurgicalAuditPreOpChecks) iterator.next();
			ims.clinical.vo.SurgicalAuditPreOpChecksVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.SurgicalAuditPreOpChecks objects.
	 */
	public static ims.clinical.vo.SurgicalAuditPreOpChecksVoCollection createSurgicalAuditPreOpChecksVoCollectionFromSurgicalAuditPreOpChecks(java.util.List domainObjectList) 
	{
		return createSurgicalAuditPreOpChecksVoCollectionFromSurgicalAuditPreOpChecks(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.SurgicalAuditPreOpChecks objects.
	 */
	public static ims.clinical.vo.SurgicalAuditPreOpChecksVoCollection createSurgicalAuditPreOpChecksVoCollectionFromSurgicalAuditPreOpChecks(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.SurgicalAuditPreOpChecksVoCollection voList = new ims.clinical.vo.SurgicalAuditPreOpChecksVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.SurgicalAuditPreOpChecks domainObject = (ims.clinical.domain.objects.SurgicalAuditPreOpChecks) domainObjectList.get(i);
			ims.clinical.vo.SurgicalAuditPreOpChecksVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.SurgicalAuditPreOpChecks set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractSurgicalAuditPreOpChecksSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalAuditPreOpChecksVoCollection voCollection) 
	 {
	 	return extractSurgicalAuditPreOpChecksSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSurgicalAuditPreOpChecksSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalAuditPreOpChecksVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.SurgicalAuditPreOpChecksVo vo = voCollection.get(i);
			ims.clinical.domain.objects.SurgicalAuditPreOpChecks domainObject = SurgicalAuditPreOpChecksVoAssembler.extractSurgicalAuditPreOpChecks(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.SurgicalAuditPreOpChecks list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractSurgicalAuditPreOpChecksList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalAuditPreOpChecksVoCollection voCollection) 
	 {
	 	return extractSurgicalAuditPreOpChecksList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSurgicalAuditPreOpChecksList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalAuditPreOpChecksVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.SurgicalAuditPreOpChecksVo vo = voCollection.get(i);
			ims.clinical.domain.objects.SurgicalAuditPreOpChecks domainObject = SurgicalAuditPreOpChecksVoAssembler.extractSurgicalAuditPreOpChecks(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.SurgicalAuditPreOpChecks object.
	 * @param domainObject ims.clinical.domain.objects.SurgicalAuditPreOpChecks
	 */
	 public static ims.clinical.vo.SurgicalAuditPreOpChecksVo create(ims.clinical.domain.objects.SurgicalAuditPreOpChecks domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.SurgicalAuditPreOpChecks object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.SurgicalAuditPreOpChecksVo create(DomainObjectMap map, ims.clinical.domain.objects.SurgicalAuditPreOpChecks domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.SurgicalAuditPreOpChecksVo valueObject = (ims.clinical.vo.SurgicalAuditPreOpChecksVo) map.getValueObject(domainObject, ims.clinical.vo.SurgicalAuditPreOpChecksVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.SurgicalAuditPreOpChecksVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.SurgicalAuditPreOpChecks
	 */
	 public static ims.clinical.vo.SurgicalAuditPreOpChecksVo insert(ims.clinical.vo.SurgicalAuditPreOpChecksVo valueObject, ims.clinical.domain.objects.SurgicalAuditPreOpChecks domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.SurgicalAuditPreOpChecks
	 */
	 public static ims.clinical.vo.SurgicalAuditPreOpChecksVo insert(DomainObjectMap map, ims.clinical.vo.SurgicalAuditPreOpChecksVo valueObject, ims.clinical.domain.objects.SurgicalAuditPreOpChecks domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_SurgicalAuditPreOpChecks(domainObject.getId());
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
		// CareContext
		if (domainObject.getCareContext() != null)
		{
			if(domainObject.getCareContext() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCareContext();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(id, -1));				
			}
			else
			{
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(domainObject.getCareContext().getId(), domainObject.getCareContext().getVersion()));
			}
		}
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// PlannedProcedures
		valueObject.setPlannedProcedures(ims.clinical.vo.domain.PatientProcedureForSurgicalAuditPreOpChecksVoAssembler.createPatientProcedureForSurgicalAuditPreOpChecksVoCollectionFromPatientProcedure(map, domainObject.getPlannedProcedures()) );
		// Consultant
		valueObject.setConsultant(ims.core.vo.domain.MedicVoAssembler.create(map, domainObject.getConsultant()) );
		// SentForTime
		java.util.Date SentForTime = domainObject.getSentForTime();
		if ( null != SentForTime ) 
		{
			valueObject.setSentForTime(new ims.framework.utils.DateTime(SentForTime) );
		}
		// ArrivalTime
		java.util.Date ArrivalTime = domainObject.getArrivalTime();
		if ( null != ArrivalTime ) 
		{
			valueObject.setArrivalTime(new ims.framework.utils.DateTime(ArrivalTime) );
		}
		// LeaveHoldingTime
		java.util.Date LeaveHoldingTime = domainObject.getLeaveHoldingTime();
		if ( null != LeaveHoldingTime ) 
		{
			valueObject.setLeaveHoldingTime(new ims.framework.utils.DateTime(LeaveHoldingTime) );
		}
		// AccompanyingNurse
		valueObject.setAccompanyingNurse(ims.core.vo.domain.NurseVoAssembler.create(map, domainObject.getAccompanyingNurse()) );
		// TransferredFrom
		valueObject.setTransferredFrom(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getTransferredFrom()) );
		// ASAGrade
		ims.domain.lookups.LookupInstance instance11 = domainObject.getASAGrade();
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

			ims.core.vo.lookups.SurgeryASAGrade voLookup11 = new ims.core.vo.lookups.SurgeryASAGrade(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.core.vo.lookups.SurgeryASAGrade parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.core.vo.lookups.SurgeryASAGrade(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setASAGrade(voLookup11);
		}
				// ConsentReceived
		ims.domain.lookups.LookupInstance instance12 = domainObject.getConsentReceived();
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

			ims.core.vo.lookups.YesNo voLookup12 = new ims.core.vo.lookups.YesNo(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.core.vo.lookups.YesNo(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setConsentReceived(voLookup12);
		}
				// ConsentAuthBy
		valueObject.setConsentAuthBy(domainObject.getConsentAuthBy());
		// BMI
		valueObject.setBMI(ims.clinical.vo.domain.VitalSignsForSurgicalAuditPreOpChecksVoAssembler.create(map, domainObject.getBMI()) );
		// SiteMarked
		ims.domain.lookups.LookupInstance instance15 = domainObject.getSiteMarked();
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

			ims.core.vo.lookups.YesNo voLookup15 = new ims.core.vo.lookups.YesNo(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup15 = voLookup15;
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
								parentVoLookup15.setParent(new ims.core.vo.lookups.YesNo(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setSiteMarked(voLookup15);
		}
				// ActionTaken
		ims.domain.lookups.LookupInstance instance16 = domainObject.getActionTaken();
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

			ims.clinical.vo.lookups.SiteMarkedActionTaken voLookup16 = new ims.clinical.vo.lookups.SiteMarkedActionTaken(instance16.getId(),instance16.getText(), instance16.isActive(), null, img, color);
			ims.clinical.vo.lookups.SiteMarkedActionTaken parentVoLookup16 = voLookup16;
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
								parentVoLookup16.setParent(new ims.clinical.vo.lookups.SiteMarkedActionTaken(parent16.getId(),parent16.getText(), parent16.isActive(), null, img, color));
				parentVoLookup16 = parentVoLookup16.getParent();
								parent16 = parent16.getParent();
			}			
			valueObject.setActionTaken(voLookup16);
		}
				// ConfirmPatientDetails
		ims.domain.lookups.LookupInstance instance17 = domainObject.getConfirmPatientDetails();
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

			ims.core.vo.lookups.YesNo voLookup17 = new ims.core.vo.lookups.YesNo(instance17.getId(),instance17.getText(), instance17.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup17 = voLookup17;
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
								parentVoLookup17.setParent(new ims.core.vo.lookups.YesNo(parent17.getId(),parent17.getText(), parent17.isActive(), null, img, color));
				parentVoLookup17 = parentVoLookup17.getParent();
								parent17 = parent17.getParent();
			}			
			valueObject.setConfirmPatientDetails(voLookup17);
		}
				// PreOpCheckDone
		ims.domain.lookups.LookupInstance instance18 = domainObject.getPreOpCheckDone();
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

			ims.core.vo.lookups.YesNo voLookup18 = new ims.core.vo.lookups.YesNo(instance18.getId(),instance18.getText(), instance18.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup18 = voLookup18;
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
								parentVoLookup18.setParent(new ims.core.vo.lookups.YesNo(parent18.getId(),parent18.getText(), parent18.isActive(), null, img, color));
				parentVoLookup18 = parentVoLookup18.getParent();
								parent18 = parent18.getParent();
			}			
			valueObject.setPreOpCheckDone(voLookup18);
		}
				// AccompanyingLocumBool
		valueObject.setAccompanyingLocumBool( domainObject.isAccompanyingLocumBool() );
		// AccompanyingLocumNurse
		valueObject.setAccompanyingLocumNurse(domainObject.getAccompanyingLocumNurse());
		// TheatreNurse
		valueObject.setTheatreNurse(ims.core.vo.domain.NurseVoAssembler.create(map, domainObject.getTheatreNurse()) );
		// TheatreNurseLocumBool
		valueObject.setTheatreNurseLocumBool( domainObject.isTheatreNurseLocumBool() );
		// TheatreNurseLocumNurse
		valueObject.setTheatreNurseLocumNurse(domainObject.getTheatreNurseLocumNurse());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.SurgicalAuditPreOpChecks extractSurgicalAuditPreOpChecks(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalAuditPreOpChecksVo valueObject) 
	{
		return 	extractSurgicalAuditPreOpChecks(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.SurgicalAuditPreOpChecks extractSurgicalAuditPreOpChecks(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalAuditPreOpChecksVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_SurgicalAuditPreOpChecks();
		ims.clinical.domain.objects.SurgicalAuditPreOpChecks domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.SurgicalAuditPreOpChecks)domMap.get(valueObject);
			}
			// ims.clinical.vo.SurgicalAuditPreOpChecksVo ID_SurgicalAuditPreOpChecks field is unknown
			domainObject = new ims.clinical.domain.objects.SurgicalAuditPreOpChecks();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_SurgicalAuditPreOpChecks());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.SurgicalAuditPreOpChecks)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.SurgicalAuditPreOpChecks) domainFactory.getDomainObject(ims.clinical.domain.objects.SurgicalAuditPreOpChecks.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_SurgicalAuditPreOpChecks());

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
		ims.core.admin.domain.objects.CareContext value2 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value2 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getCareContext();	
			}
			else
			{
				value2 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value2);
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		domainObject.setPlannedProcedures(ims.clinical.vo.domain.PatientProcedureForSurgicalAuditPreOpChecksVoAssembler.extractPatientProcedureList(domainFactory, valueObject.getPlannedProcedures(), domainObject.getPlannedProcedures(), domMap));		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Medic value5 = null;
		if ( null != valueObject.getConsultant() ) 
		{
			if (valueObject.getConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getConsultant()) != null)
				{
					value5 = (ims.core.resource.people.domain.objects.Medic)domMap.get(valueObject.getConsultant());
				}
			}
			else
			{
				value5 = (ims.core.resource.people.domain.objects.Medic)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Medic.class, valueObject.getConsultant().getBoId());
			}
		}
		domainObject.setConsultant(value5);
		ims.framework.utils.DateTime dateTime6 = valueObject.getSentForTime();
		java.util.Date value6 = null;
		if ( dateTime6 != null ) 
		{
			value6 = dateTime6.getJavaDate();
		}
		domainObject.setSentForTime(value6);
		ims.framework.utils.DateTime dateTime7 = valueObject.getArrivalTime();
		java.util.Date value7 = null;
		if ( dateTime7 != null ) 
		{
			value7 = dateTime7.getJavaDate();
		}
		domainObject.setArrivalTime(value7);
		ims.framework.utils.DateTime dateTime8 = valueObject.getLeaveHoldingTime();
		java.util.Date value8 = null;
		if ( dateTime8 != null ) 
		{
			value8 = dateTime8.getJavaDate();
		}
		domainObject.setLeaveHoldingTime(value8);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Nurse value9 = null;
		if ( null != valueObject.getAccompanyingNurse() ) 
		{
			if (valueObject.getAccompanyingNurse().getBoId() == null)
			{
				if (domMap.get(valueObject.getAccompanyingNurse()) != null)
				{
					value9 = (ims.core.resource.people.domain.objects.Nurse)domMap.get(valueObject.getAccompanyingNurse());
				}
			}
			else
			{
				value9 = (ims.core.resource.people.domain.objects.Nurse)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Nurse.class, valueObject.getAccompanyingNurse().getBoId());
			}
		}
		domainObject.setAccompanyingNurse(value9);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value10 = null;
		if ( null != valueObject.getTransferredFrom() ) 
		{
			if (valueObject.getTransferredFrom().getBoId() == null)
			{
				if (domMap.get(valueObject.getTransferredFrom()) != null)
				{
					value10 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getTransferredFrom());
				}
			}
			else
			{
				value10 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getTransferredFrom().getBoId());
			}
		}
		domainObject.setTransferredFrom(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getASAGrade() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getASAGrade().getID());
		}
		domainObject.setASAGrade(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getConsentReceived() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getConsentReceived().getID());
		}
		domainObject.setConsentReceived(value12);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getConsentAuthBy() != null && valueObject.getConsentAuthBy().equals(""))
		{
			valueObject.setConsentAuthBy(null);
		}
		domainObject.setConsentAuthBy(valueObject.getConsentAuthBy());
		domainObject.setBMI(ims.clinical.vo.domain.VitalSignsForSurgicalAuditPreOpChecksVoAssembler.extractVitalSigns(domainFactory, valueObject.getBMI(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getSiteMarked() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getSiteMarked().getID());
		}
		domainObject.setSiteMarked(value15);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getActionTaken() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getActionTaken().getID());
		}
		domainObject.setActionTaken(value16);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value17 = null;
		if ( null != valueObject.getConfirmPatientDetails() ) 
		{
			value17 =
				domainFactory.getLookupInstance(valueObject.getConfirmPatientDetails().getID());
		}
		domainObject.setConfirmPatientDetails(value17);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value18 = null;
		if ( null != valueObject.getPreOpCheckDone() ) 
		{
			value18 =
				domainFactory.getLookupInstance(valueObject.getPreOpCheckDone().getID());
		}
		domainObject.setPreOpCheckDone(value18);
		domainObject.setAccompanyingLocumBool(valueObject.getAccompanyingLocumBool());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAccompanyingLocumNurse() != null && valueObject.getAccompanyingLocumNurse().equals(""))
		{
			valueObject.setAccompanyingLocumNurse(null);
		}
		domainObject.setAccompanyingLocumNurse(valueObject.getAccompanyingLocumNurse());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Nurse value21 = null;
		if ( null != valueObject.getTheatreNurse() ) 
		{
			if (valueObject.getTheatreNurse().getBoId() == null)
			{
				if (domMap.get(valueObject.getTheatreNurse()) != null)
				{
					value21 = (ims.core.resource.people.domain.objects.Nurse)domMap.get(valueObject.getTheatreNurse());
				}
			}
			else
			{
				value21 = (ims.core.resource.people.domain.objects.Nurse)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Nurse.class, valueObject.getTheatreNurse().getBoId());
			}
		}
		domainObject.setTheatreNurse(value21);
		domainObject.setTheatreNurseLocumBool(valueObject.getTheatreNurseLocumBool());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTheatreNurseLocumNurse() != null && valueObject.getTheatreNurseLocumNurse().equals(""))
		{
			valueObject.setTheatreNurseLocumNurse(null);
		}
		domainObject.setTheatreNurseLocumNurse(valueObject.getTheatreNurseLocumNurse());

		return domainObject;
	}

}
