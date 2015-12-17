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
 * @author Cristian Belciug
 */
public class IntraOperativeCareRecordVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.IntraOperativeCareRecordVo copy(ims.clinical.vo.IntraOperativeCareRecordVo valueObjectDest, ims.clinical.vo.IntraOperativeCareRecordVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_IntraOperativeCareRecord(valueObjectSrc.getID_IntraOperativeCareRecord());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// PlannedProcedure
		valueObjectDest.setPlannedProcedure(valueObjectSrc.getPlannedProcedure());
		// ActualProcedure
		valueObjectDest.setActualProcedure(valueObjectSrc.getActualProcedure());
		// ProcedureDate
		valueObjectDest.setProcedureDate(valueObjectSrc.getProcedureDate());
		// InTheatreTime
		valueObjectDest.setInTheatreTime(valueObjectSrc.getInTheatreTime());
		// SurgeryStartTime
		valueObjectDest.setSurgeryStartTime(valueObjectSrc.getSurgeryStartTime());
		// SurgeryEndTime
		valueObjectDest.setSurgeryEndTime(valueObjectSrc.getSurgeryEndTime());
		// AnaesthetistStartTime
		valueObjectDest.setAnaesthetistStartTime(valueObjectSrc.getAnaesthetistStartTime());
		// Surgeon
		valueObjectDest.setSurgeon(valueObjectSrc.getSurgeon());
		// SurgeonAssistant
		valueObjectDest.setSurgeonAssistant(valueObjectSrc.getSurgeonAssistant());
		// Anaesthetist
		valueObjectDest.setAnaesthetist(valueObjectSrc.getAnaesthetist());
		// ODA
		valueObjectDest.setODA(valueObjectSrc.getODA());
		// ScrubNurse
		valueObjectDest.setScrubNurse(valueObjectSrc.getScrubNurse());
		// CirculatingNurse
		valueObjectDest.setCirculatingNurse(valueObjectSrc.getCirculatingNurse());
		// Other
		valueObjectDest.setOther(valueObjectSrc.getOther());
		// IntraOperativeDetails
		valueObjectDest.setIntraOperativeDetails(valueObjectSrc.getIntraOperativeDetails());
		// wasPlannedProcedure
		valueObjectDest.setWasPlannedProcedure(valueObjectSrc.getWasPlannedProcedure());
		// wasUnplannedProcedure
		valueObjectDest.setWasUnplannedProcedure(valueObjectSrc.getWasUnplannedProcedure());
		// Theatre
		valueObjectDest.setTheatre(valueObjectSrc.getTheatre());
		// CataractIntraOperativeDetail
		valueObjectDest.setCataractIntraOperativeDetail(valueObjectSrc.getCataractIntraOperativeDetail());
		// AdmissionType
		valueObjectDest.setAdmissionType(valueObjectSrc.getAdmissionType());
		// ReadmissionType
		valueObjectDest.setReadmissionType(valueObjectSrc.getReadmissionType());
		// PasEvent
		valueObjectDest.setPasEvent(valueObjectSrc.getPasEvent());
		// IntoPacuTime
		valueObjectDest.setIntoPacuTime(valueObjectSrc.getIntoPacuTime());
		// TimeIntoRecovery
		valueObjectDest.setTimeIntoRecovery(valueObjectSrc.getTimeIntoRecovery());
		// TimeOutOfRecovery
		valueObjectDest.setTimeOutOfRecovery(valueObjectSrc.getTimeOutOfRecovery());
		// AnaestheticUsed
		valueObjectDest.setAnaestheticUsed(valueObjectSrc.getAnaestheticUsed());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createIntraOperativeCareRecordVoCollectionFromIntraOperativeCareRecord(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.IntraOperativeCareRecord objects.
	 */
	public static ims.clinical.vo.IntraOperativeCareRecordVoCollection createIntraOperativeCareRecordVoCollectionFromIntraOperativeCareRecord(java.util.Set domainObjectSet)	
	{
		return createIntraOperativeCareRecordVoCollectionFromIntraOperativeCareRecord(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.IntraOperativeCareRecord objects.
	 */
	public static ims.clinical.vo.IntraOperativeCareRecordVoCollection createIntraOperativeCareRecordVoCollectionFromIntraOperativeCareRecord(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.IntraOperativeCareRecordVoCollection voList = new ims.clinical.vo.IntraOperativeCareRecordVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.IntraOperativeCareRecord domainObject = (ims.core.clinical.domain.objects.IntraOperativeCareRecord) iterator.next();
			ims.clinical.vo.IntraOperativeCareRecordVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.IntraOperativeCareRecord objects.
	 */
	public static ims.clinical.vo.IntraOperativeCareRecordVoCollection createIntraOperativeCareRecordVoCollectionFromIntraOperativeCareRecord(java.util.List domainObjectList) 
	{
		return createIntraOperativeCareRecordVoCollectionFromIntraOperativeCareRecord(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.IntraOperativeCareRecord objects.
	 */
	public static ims.clinical.vo.IntraOperativeCareRecordVoCollection createIntraOperativeCareRecordVoCollectionFromIntraOperativeCareRecord(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.IntraOperativeCareRecordVoCollection voList = new ims.clinical.vo.IntraOperativeCareRecordVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.IntraOperativeCareRecord domainObject = (ims.core.clinical.domain.objects.IntraOperativeCareRecord) domainObjectList.get(i);
			ims.clinical.vo.IntraOperativeCareRecordVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.IntraOperativeCareRecord set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractIntraOperativeCareRecordSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.IntraOperativeCareRecordVoCollection voCollection) 
	 {
	 	return extractIntraOperativeCareRecordSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractIntraOperativeCareRecordSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.IntraOperativeCareRecordVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.IntraOperativeCareRecordVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.IntraOperativeCareRecord domainObject = IntraOperativeCareRecordVoAssembler.extractIntraOperativeCareRecord(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.IntraOperativeCareRecord list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractIntraOperativeCareRecordList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.IntraOperativeCareRecordVoCollection voCollection) 
	 {
	 	return extractIntraOperativeCareRecordList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractIntraOperativeCareRecordList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.IntraOperativeCareRecordVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.IntraOperativeCareRecordVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.IntraOperativeCareRecord domainObject = IntraOperativeCareRecordVoAssembler.extractIntraOperativeCareRecord(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.IntraOperativeCareRecord object.
	 * @param domainObject ims.core.clinical.domain.objects.IntraOperativeCareRecord
	 */
	 public static ims.clinical.vo.IntraOperativeCareRecordVo create(ims.core.clinical.domain.objects.IntraOperativeCareRecord domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.IntraOperativeCareRecord object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.IntraOperativeCareRecordVo create(DomainObjectMap map, ims.core.clinical.domain.objects.IntraOperativeCareRecord domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.IntraOperativeCareRecordVo valueObject = (ims.clinical.vo.IntraOperativeCareRecordVo) map.getValueObject(domainObject, ims.clinical.vo.IntraOperativeCareRecordVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.IntraOperativeCareRecordVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.IntraOperativeCareRecord
	 */
	 public static ims.clinical.vo.IntraOperativeCareRecordVo insert(ims.clinical.vo.IntraOperativeCareRecordVo valueObject, ims.core.clinical.domain.objects.IntraOperativeCareRecord domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.IntraOperativeCareRecord
	 */
	 public static ims.clinical.vo.IntraOperativeCareRecordVo insert(DomainObjectMap map, ims.clinical.vo.IntraOperativeCareRecordVo valueObject, ims.core.clinical.domain.objects.IntraOperativeCareRecord domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_IntraOperativeCareRecord(domainObject.getId());
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
			
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// PlannedProcedure
		valueObject.setPlannedProcedure(ims.core.vo.domain.PatientProcedureShortVoAssembler.create(map, domainObject.getPlannedProcedure()) );
		// ActualProcedure
		valueObject.setActualProcedure(ims.core.vo.domain.PatientProcedureLiteVoAssembler.create(map, domainObject.getActualProcedure()) );
		// ProcedureDate
		java.util.Date ProcedureDate = domainObject.getProcedureDate();
		if ( null != ProcedureDate ) 
		{
			valueObject.setProcedureDate(new ims.framework.utils.Date(ProcedureDate) );
		}
		// InTheatreTime
		java.util.Date InTheatreTime = domainObject.getInTheatreTime();
		if ( null != InTheatreTime ) 
		{
			valueObject.setInTheatreTime(new ims.framework.utils.DateTime(InTheatreTime) );
		}
		// SurgeryStartTime
		java.util.Date SurgeryStartTime = domainObject.getSurgeryStartTime();
		if ( null != SurgeryStartTime ) 
		{
			valueObject.setSurgeryStartTime(new ims.framework.utils.DateTime(SurgeryStartTime) );
		}
		// SurgeryEndTime
		java.util.Date SurgeryEndTime = domainObject.getSurgeryEndTime();
		if ( null != SurgeryEndTime ) 
		{
			valueObject.setSurgeryEndTime(new ims.framework.utils.DateTime(SurgeryEndTime) );
		}
		// AnaesthetistStartTime
		java.util.Date AnaesthetistStartTime = domainObject.getAnaesthetistStartTime();
		if ( null != AnaesthetistStartTime ) 
		{
			valueObject.setAnaesthetistStartTime(new ims.framework.utils.DateTime(AnaesthetistStartTime) );
		}
		// Surgeon
		valueObject.setSurgeon(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getSurgeon()) );
		// SurgeonAssistant
		valueObject.setSurgeonAssistant(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getSurgeonAssistant()) );
		// Anaesthetist
		valueObject.setAnaesthetist(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getAnaesthetist()) );
		// ODA
		valueObject.setODA(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getODA()) );
		// ScrubNurse
		valueObject.setScrubNurse(ims.core.vo.domain.NurseVoAssembler.create(map, domainObject.getScrubNurse()) );
		// CirculatingNurse
		valueObject.setCirculatingNurse(ims.core.vo.domain.NurseVoAssembler.create(map, domainObject.getCirculatingNurse()) );
		// Other
		valueObject.setOther(domainObject.getOther());
		// IntraOperativeDetails
		valueObject.setIntraOperativeDetails(ims.clinical.vo.domain.IntraOperativeDetailsVoAssembler.create(map, domainObject.getIntraOperativeDetails()) );
		// wasPlannedProcedure
		valueObject.setWasPlannedProcedure( domainObject.isWasPlannedProcedure() );
		// wasUnplannedProcedure
		valueObject.setWasUnplannedProcedure( domainObject.isWasUnplannedProcedure() );
		// Theatre
		valueObject.setTheatre(ims.core.vo.domain.LocShortVoAssembler.create(map, domainObject.getTheatre()) );
		// CataractIntraOperativeDetail
		valueObject.setCataractIntraOperativeDetail(ims.clinical.vo.domain.CataractIntraOperativeDetailVoAssembler.create(map, domainObject.getCataractIntraOperativeDetail()) );
		// AdmissionType
		ims.domain.lookups.LookupInstance instance21 = domainObject.getAdmissionType();
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

			ims.core.vo.lookups.AdmissionType voLookup21 = new ims.core.vo.lookups.AdmissionType(instance21.getId(),instance21.getText(), instance21.isActive(), null, img, color);
			ims.core.vo.lookups.AdmissionType parentVoLookup21 = voLookup21;
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
								parentVoLookup21.setParent(new ims.core.vo.lookups.AdmissionType(parent21.getId(),parent21.getText(), parent21.isActive(), null, img, color));
				parentVoLookup21 = parentVoLookup21.getParent();
								parent21 = parent21.getParent();
			}			
			valueObject.setAdmissionType(voLookup21);
		}
				// ReadmissionType
		ims.domain.lookups.LookupInstance instance22 = domainObject.getReadmissionType();
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

			ims.core.vo.lookups.ReadmissionType voLookup22 = new ims.core.vo.lookups.ReadmissionType(instance22.getId(),instance22.getText(), instance22.isActive(), null, img, color);
			ims.core.vo.lookups.ReadmissionType parentVoLookup22 = voLookup22;
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
								parentVoLookup22.setParent(new ims.core.vo.lookups.ReadmissionType(parent22.getId(),parent22.getText(), parent22.isActive(), null, img, color));
				parentVoLookup22 = parentVoLookup22.getParent();
								parent22 = parent22.getParent();
			}			
			valueObject.setReadmissionType(voLookup22);
		}
				// PasEvent
		if (domainObject.getPasEvent() != null)
		{
			if(domainObject.getPasEvent() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPasEvent();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPasEvent(new ims.core.admin.pas.vo.PASEventRefVo(id, -1));				
			}
			else
			{
				valueObject.setPasEvent(new ims.core.admin.pas.vo.PASEventRefVo(domainObject.getPasEvent().getId(), domainObject.getPasEvent().getVersion()));
			}
		}
		// IntoPacuTime
		java.util.Date IntoPacuTime = domainObject.getIntoPacuTime();
		if ( null != IntoPacuTime ) 
		{
			valueObject.setIntoPacuTime(new ims.framework.utils.DateTime(IntoPacuTime) );
		}
		// TimeIntoRecovery
		java.util.Date TimeIntoRecovery = domainObject.getTimeIntoRecovery();
		if ( null != TimeIntoRecovery ) 
		{
			valueObject.setTimeIntoRecovery(new ims.framework.utils.DateTime(TimeIntoRecovery) );
		}
		// TimeOutOfRecovery
		java.util.Date TimeOutOfRecovery = domainObject.getTimeOutOfRecovery();
		if ( null != TimeOutOfRecovery ) 
		{
			valueObject.setTimeOutOfRecovery(new ims.framework.utils.DateTime(TimeOutOfRecovery) );
		}
		// AnaestheticUsed
		ims.domain.lookups.LookupInstance instance27 = domainObject.getAnaestheticUsed();
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

			ims.clinical.vo.lookups.AnaestheticUsed voLookup27 = new ims.clinical.vo.lookups.AnaestheticUsed(instance27.getId(),instance27.getText(), instance27.isActive(), null, img, color);
			ims.clinical.vo.lookups.AnaestheticUsed parentVoLookup27 = voLookup27;
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
								parentVoLookup27.setParent(new ims.clinical.vo.lookups.AnaestheticUsed(parent27.getId(),parent27.getText(), parent27.isActive(), null, img, color));
				parentVoLookup27 = parentVoLookup27.getParent();
								parent27 = parent27.getParent();
			}			
			valueObject.setAnaestheticUsed(voLookup27);
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
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.IntraOperativeCareRecord extractIntraOperativeCareRecord(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.IntraOperativeCareRecordVo valueObject) 
	{
		return 	extractIntraOperativeCareRecord(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.IntraOperativeCareRecord extractIntraOperativeCareRecord(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.IntraOperativeCareRecordVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_IntraOperativeCareRecord();
		ims.core.clinical.domain.objects.IntraOperativeCareRecord domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.IntraOperativeCareRecord)domMap.get(valueObject);
			}
			// ims.clinical.vo.IntraOperativeCareRecordVo ID_IntraOperativeCareRecord field is unknown
			domainObject = new ims.core.clinical.domain.objects.IntraOperativeCareRecord();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_IntraOperativeCareRecord());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.IntraOperativeCareRecord)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.IntraOperativeCareRecord) domainFactory.getDomainObject(ims.core.clinical.domain.objects.IntraOperativeCareRecord.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_IntraOperativeCareRecord());

		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		domainObject.setPlannedProcedure(ims.core.vo.domain.PatientProcedureShortVoAssembler.extractPatientProcedure(domainFactory, valueObject.getPlannedProcedure(), domMap));
		domainObject.setActualProcedure(ims.core.vo.domain.PatientProcedureLiteVoAssembler.extractPatientProcedure(domainFactory, valueObject.getActualProcedure(), domMap));
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getProcedureDate();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setProcedureDate(value4);
		ims.framework.utils.DateTime dateTime5 = valueObject.getInTheatreTime();
		java.util.Date value5 = null;
		if ( dateTime5 != null ) 
		{
			value5 = dateTime5.getJavaDate();
		}
		domainObject.setInTheatreTime(value5);
		ims.framework.utils.DateTime dateTime6 = valueObject.getSurgeryStartTime();
		java.util.Date value6 = null;
		if ( dateTime6 != null ) 
		{
			value6 = dateTime6.getJavaDate();
		}
		domainObject.setSurgeryStartTime(value6);
		ims.framework.utils.DateTime dateTime7 = valueObject.getSurgeryEndTime();
		java.util.Date value7 = null;
		if ( dateTime7 != null ) 
		{
			value7 = dateTime7.getJavaDate();
		}
		domainObject.setSurgeryEndTime(value7);
		ims.framework.utils.DateTime dateTime8 = valueObject.getAnaesthetistStartTime();
		java.util.Date value8 = null;
		if ( dateTime8 != null ) 
		{
			value8 = dateTime8.getJavaDate();
		}
		domainObject.setAnaesthetistStartTime(value8);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value9 = null;
		if ( null != valueObject.getSurgeon() ) 
		{
			if (valueObject.getSurgeon().getBoId() == null)
			{
				if (domMap.get(valueObject.getSurgeon()) != null)
				{
					value9 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getSurgeon());
				}
			}
			else
			{
				value9 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getSurgeon().getBoId());
			}
		}
		domainObject.setSurgeon(value9);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value10 = null;
		if ( null != valueObject.getSurgeonAssistant() ) 
		{
			if (valueObject.getSurgeonAssistant().getBoId() == null)
			{
				if (domMap.get(valueObject.getSurgeonAssistant()) != null)
				{
					value10 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getSurgeonAssistant());
				}
			}
			else
			{
				value10 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getSurgeonAssistant().getBoId());
			}
		}
		domainObject.setSurgeonAssistant(value10);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value11 = null;
		if ( null != valueObject.getAnaesthetist() ) 
		{
			if (valueObject.getAnaesthetist().getBoId() == null)
			{
				if (domMap.get(valueObject.getAnaesthetist()) != null)
				{
					value11 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getAnaesthetist());
				}
			}
			else
			{
				value11 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getAnaesthetist().getBoId());
			}
		}
		domainObject.setAnaesthetist(value11);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value12 = null;
		if ( null != valueObject.getODA() ) 
		{
			if (valueObject.getODA().getBoId() == null)
			{
				if (domMap.get(valueObject.getODA()) != null)
				{
					value12 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getODA());
				}
			}
			else
			{
				value12 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getODA().getBoId());
			}
		}
		domainObject.setODA(value12);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Nurse value13 = null;
		if ( null != valueObject.getScrubNurse() ) 
		{
			if (valueObject.getScrubNurse().getBoId() == null)
			{
				if (domMap.get(valueObject.getScrubNurse()) != null)
				{
					value13 = (ims.core.resource.people.domain.objects.Nurse)domMap.get(valueObject.getScrubNurse());
				}
			}
			else
			{
				value13 = (ims.core.resource.people.domain.objects.Nurse)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Nurse.class, valueObject.getScrubNurse().getBoId());
			}
		}
		domainObject.setScrubNurse(value13);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Nurse value14 = null;
		if ( null != valueObject.getCirculatingNurse() ) 
		{
			if (valueObject.getCirculatingNurse().getBoId() == null)
			{
				if (domMap.get(valueObject.getCirculatingNurse()) != null)
				{
					value14 = (ims.core.resource.people.domain.objects.Nurse)domMap.get(valueObject.getCirculatingNurse());
				}
			}
			else
			{
				value14 = (ims.core.resource.people.domain.objects.Nurse)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Nurse.class, valueObject.getCirculatingNurse().getBoId());
			}
		}
		domainObject.setCirculatingNurse(value14);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOther() != null && valueObject.getOther().equals(""))
		{
			valueObject.setOther(null);
		}
		domainObject.setOther(valueObject.getOther());
		domainObject.setIntraOperativeDetails(ims.clinical.vo.domain.IntraOperativeDetailsVoAssembler.extractIntraOperativeDetails(domainFactory, valueObject.getIntraOperativeDetails(), domMap));
		domainObject.setWasPlannedProcedure(valueObject.getWasPlannedProcedure());
		domainObject.setWasUnplannedProcedure(valueObject.getWasUnplannedProcedure());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value19 = null;
		if ( null != valueObject.getTheatre() ) 
		{
			if (valueObject.getTheatre().getBoId() == null)
			{
				if (domMap.get(valueObject.getTheatre()) != null)
				{
					value19 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getTheatre());
				}
			}
			else
			{
				value19 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getTheatre().getBoId());
			}
		}
		domainObject.setTheatre(value19);
		domainObject.setCataractIntraOperativeDetail(ims.clinical.vo.domain.CataractIntraOperativeDetailVoAssembler.extractCataractIntraOperative(domainFactory, valueObject.getCataractIntraOperativeDetail(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value21 = null;
		if ( null != valueObject.getAdmissionType() ) 
		{
			value21 =
				domainFactory.getLookupInstance(valueObject.getAdmissionType().getID());
		}
		domainObject.setAdmissionType(value21);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value22 = null;
		if ( null != valueObject.getReadmissionType() ) 
		{
			value22 =
				domainFactory.getLookupInstance(valueObject.getReadmissionType().getID());
		}
		domainObject.setReadmissionType(value22);
		ims.core.admin.pas.domain.objects.PASEvent value23 = null;
		if ( null != valueObject.getPasEvent() ) 
		{
			if (valueObject.getPasEvent().getBoId() == null)
			{
				if (domMap.get(valueObject.getPasEvent()) != null)
				{
					value23 = (ims.core.admin.pas.domain.objects.PASEvent)domMap.get(valueObject.getPasEvent());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value23 = domainObject.getPasEvent();	
			}
			else
			{
				value23 = (ims.core.admin.pas.domain.objects.PASEvent)domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.PASEvent.class, valueObject.getPasEvent().getBoId());
			}
		}
		domainObject.setPasEvent(value23);
		ims.framework.utils.DateTime dateTime24 = valueObject.getIntoPacuTime();
		java.util.Date value24 = null;
		if ( dateTime24 != null ) 
		{
			value24 = dateTime24.getJavaDate();
		}
		domainObject.setIntoPacuTime(value24);
		ims.framework.utils.DateTime dateTime25 = valueObject.getTimeIntoRecovery();
		java.util.Date value25 = null;
		if ( dateTime25 != null ) 
		{
			value25 = dateTime25.getJavaDate();
		}
		domainObject.setTimeIntoRecovery(value25);
		ims.framework.utils.DateTime dateTime26 = valueObject.getTimeOutOfRecovery();
		java.util.Date value26 = null;
		if ( dateTime26 != null ) 
		{
			value26 = dateTime26.getJavaDate();
		}
		domainObject.setTimeOutOfRecovery(value26);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value27 = null;
		if ( null != valueObject.getAnaestheticUsed() ) 
		{
			value27 =
				domainFactory.getLookupInstance(valueObject.getAnaestheticUsed().getID());
		}
		domainObject.setAnaestheticUsed(value27);
		ims.core.admin.domain.objects.CareContext value28 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value28 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value28 = domainObject.getCareContext();	
			}
			else
			{
				value28 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value28);

		return domainObject;
	}

}
