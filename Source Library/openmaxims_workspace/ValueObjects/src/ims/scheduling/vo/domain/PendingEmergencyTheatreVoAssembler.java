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
package ims.scheduling.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Bogdan Tofei
 */
public class PendingEmergencyTheatreVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.PendingEmergencyTheatreVo copy(ims.scheduling.vo.PendingEmergencyTheatreVo valueObjectDest, ims.scheduling.vo.PendingEmergencyTheatreVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PendingEmergencyTheatre(valueObjectSrc.getID_PendingEmergencyTheatre());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// CatsReferral
		valueObjectDest.setCatsReferral(valueObjectSrc.getCatsReferral());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// wasInpatientWhenAddedToList
		valueObjectDest.setWasInpatientWhenAddedToList(valueObjectSrc.getWasInpatientWhenAddedToList());
		// ResponsibleHCP
		valueObjectDest.setResponsibleHCP(valueObjectSrc.getResponsibleHCP());
		// UrgencyCategory
		valueObjectDest.setUrgencyCategory(valueObjectSrc.getUrgencyCategory());
		// Service
		valueObjectDest.setService(valueObjectSrc.getService());
		// PrimaryProcedure
		valueObjectDest.setPrimaryProcedure(valueObjectSrc.getPrimaryProcedure());
		// ProcLaterality
		valueObjectDest.setProcLaterality(valueObjectSrc.getProcLaterality());
		// SecondaryProcedure
		valueObjectDest.setSecondaryProcedure(valueObjectSrc.getSecondaryProcedure());
		// SecondaryProcLaterality
		valueObjectDest.setSecondaryProcLaterality(valueObjectSrc.getSecondaryProcLaterality());
		// ProcedureDetails
		valueObjectDest.setProcedureDetails(valueObjectSrc.getProcedureDetails());
		// isEndoscopyProcedure
		valueObjectDest.setIsEndoscopyProcedure(valueObjectSrc.getIsEndoscopyProcedure());
		// SurgeryTimeMins
		valueObjectDest.setSurgeryTimeMins(valueObjectSrc.getSurgeryTimeMins());
		// TheatreType
		valueObjectDest.setTheatreType(valueObjectSrc.getTheatreType());
		// CurrentLocationOfPatient
		valueObjectDest.setCurrentLocationOfPatient(valueObjectSrc.getCurrentLocationOfPatient());
		// ExpectedHospital
		valueObjectDest.setExpectedHospital(valueObjectSrc.getExpectedHospital());
		// ExpectedWard
		valueObjectDest.setExpectedWard(valueObjectSrc.getExpectedWard());
		// ExpectedDateTime
		valueObjectDest.setExpectedDateTime(valueObjectSrc.getExpectedDateTime());
		// TheatreAppointmentBooked
		valueObjectDest.setTheatreAppointmentBooked(valueObjectSrc.getTheatreAppointmentBooked());
		// RemovedBy
		valueObjectDest.setRemovedBy(valueObjectSrc.getRemovedBy());
		// RemovalReason
		valueObjectDest.setRemovalReason(valueObjectSrc.getRemovalReason());
		// RemovalDateTime
		valueObjectDest.setRemovalDateTime(valueObjectSrc.getRemovalDateTime());
		// isEndoscopySecondProcedure
		valueObjectDest.setIsEndoscopySecondProcedure(valueObjectSrc.getIsEndoscopySecondProcedure());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPendingEmergencyTheatreVoCollectionFromPendingEmergencyTheatre(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.PendingEmergencyTheatre objects.
	 */
	public static ims.scheduling.vo.PendingEmergencyTheatreVoCollection createPendingEmergencyTheatreVoCollectionFromPendingEmergencyTheatre(java.util.Set domainObjectSet)	
	{
		return createPendingEmergencyTheatreVoCollectionFromPendingEmergencyTheatre(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.PendingEmergencyTheatre objects.
	 */
	public static ims.scheduling.vo.PendingEmergencyTheatreVoCollection createPendingEmergencyTheatreVoCollectionFromPendingEmergencyTheatre(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.PendingEmergencyTheatreVoCollection voList = new ims.scheduling.vo.PendingEmergencyTheatreVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.scheduling.domain.objects.PendingEmergencyTheatre domainObject = (ims.scheduling.domain.objects.PendingEmergencyTheatre) iterator.next();
			ims.scheduling.vo.PendingEmergencyTheatreVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.scheduling.domain.objects.PendingEmergencyTheatre objects.
	 */
	public static ims.scheduling.vo.PendingEmergencyTheatreVoCollection createPendingEmergencyTheatreVoCollectionFromPendingEmergencyTheatre(java.util.List domainObjectList) 
	{
		return createPendingEmergencyTheatreVoCollectionFromPendingEmergencyTheatre(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.PendingEmergencyTheatre objects.
	 */
	public static ims.scheduling.vo.PendingEmergencyTheatreVoCollection createPendingEmergencyTheatreVoCollectionFromPendingEmergencyTheatre(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.PendingEmergencyTheatreVoCollection voList = new ims.scheduling.vo.PendingEmergencyTheatreVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.PendingEmergencyTheatre domainObject = (ims.scheduling.domain.objects.PendingEmergencyTheatre) domainObjectList.get(i);
			ims.scheduling.vo.PendingEmergencyTheatreVo vo = create(map, domainObject);

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
	 * Create the ims.scheduling.domain.objects.PendingEmergencyTheatre set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPendingEmergencyTheatreSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.PendingEmergencyTheatreVoCollection voCollection) 
	 {
	 	return extractPendingEmergencyTheatreSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPendingEmergencyTheatreSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.PendingEmergencyTheatreVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.PendingEmergencyTheatreVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.PendingEmergencyTheatre domainObject = PendingEmergencyTheatreVoAssembler.extractPendingEmergencyTheatre(domainFactory, vo, domMap);

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
	 * Create the ims.scheduling.domain.objects.PendingEmergencyTheatre list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPendingEmergencyTheatreList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.PendingEmergencyTheatreVoCollection voCollection) 
	 {
	 	return extractPendingEmergencyTheatreList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPendingEmergencyTheatreList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.PendingEmergencyTheatreVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.PendingEmergencyTheatreVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.PendingEmergencyTheatre domainObject = PendingEmergencyTheatreVoAssembler.extractPendingEmergencyTheatre(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.scheduling.domain.objects.PendingEmergencyTheatre object.
	 * @param domainObject ims.scheduling.domain.objects.PendingEmergencyTheatre
	 */
	 public static ims.scheduling.vo.PendingEmergencyTheatreVo create(ims.scheduling.domain.objects.PendingEmergencyTheatre domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.scheduling.domain.objects.PendingEmergencyTheatre object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.scheduling.vo.PendingEmergencyTheatreVo create(DomainObjectMap map, ims.scheduling.domain.objects.PendingEmergencyTheatre domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.PendingEmergencyTheatreVo valueObject = (ims.scheduling.vo.PendingEmergencyTheatreVo) map.getValueObject(domainObject, ims.scheduling.vo.PendingEmergencyTheatreVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.PendingEmergencyTheatreVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.scheduling.domain.objects.PendingEmergencyTheatre
	 */
	 public static ims.scheduling.vo.PendingEmergencyTheatreVo insert(ims.scheduling.vo.PendingEmergencyTheatreVo valueObject, ims.scheduling.domain.objects.PendingEmergencyTheatre domainObject) 
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
	 * @param domainObject ims.scheduling.domain.objects.PendingEmergencyTheatre
	 */
	 public static ims.scheduling.vo.PendingEmergencyTheatreVo insert(DomainObjectMap map, ims.scheduling.vo.PendingEmergencyTheatreVo valueObject, ims.scheduling.domain.objects.PendingEmergencyTheatre domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PendingEmergencyTheatre(domainObject.getId());
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
		// CatsReferral
		if (domainObject.getCatsReferral() != null)
		{
			if(domainObject.getCatsReferral() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCatsReferral();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCatsReferral(new ims.RefMan.vo.CatsReferralRefVo(id, -1));				
			}
			else
			{
				valueObject.setCatsReferral(new ims.RefMan.vo.CatsReferralRefVo(domainObject.getCatsReferral().getId(), domainObject.getCatsReferral().getVersion()));
			}
		}
		// CurrentStatus
		ims.domain.lookups.LookupInstance instance3 = domainObject.getCurrentStatus();
		if ( null != instance3 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance3.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance3.getImage().getImageId(), instance3.getImage().getImagePath());
			}
			color = instance3.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.PendingEmergencyTheatreStatus voLookup3 = new ims.scheduling.vo.lookups.PendingEmergencyTheatreStatus(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.scheduling.vo.lookups.PendingEmergencyTheatreStatus parentVoLookup3 = voLookup3;
			ims.domain.lookups.LookupInstance parent3 = instance3.getParent();
			while (parent3 != null)
			{
				if (parent3.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent3.getImage().getImageId(), parent3.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent3.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup3.setParent(new ims.scheduling.vo.lookups.PendingEmergencyTheatreStatus(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setCurrentStatus(voLookup3);
		}
				// wasInpatientWhenAddedToList
		valueObject.setWasInpatientWhenAddedToList( domainObject.isWasInpatientWhenAddedToList() );
		// ResponsibleHCP
		valueObject.setResponsibleHCP(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getResponsibleHCP()) );
		// UrgencyCategory
		ims.domain.lookups.LookupInstance instance6 = domainObject.getUrgencyCategory();
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

			ims.scheduling.vo.lookups.PendingTheatreUrgencyCategory voLookup6 = new ims.scheduling.vo.lookups.PendingTheatreUrgencyCategory(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.scheduling.vo.lookups.PendingTheatreUrgencyCategory parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.scheduling.vo.lookups.PendingTheatreUrgencyCategory(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setUrgencyCategory(voLookup6);
		}
				// Service
		valueObject.setService(ims.core.vo.domain.ServiceLiteVoAssembler.create(map, domainObject.getService()) );
		// PrimaryProcedure
		valueObject.setPrimaryProcedure(ims.core.vo.domain.ProcedureLiteVoAssembler.create(map, domainObject.getPrimaryProcedure()) );
		// ProcLaterality
		ims.domain.lookups.LookupInstance instance9 = domainObject.getProcLaterality();
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

			ims.core.vo.lookups.LateralityLRB voLookup9 = new ims.core.vo.lookups.LateralityLRB(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.LateralityLRB parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.core.vo.lookups.LateralityLRB(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setProcLaterality(voLookup9);
		}
				// SecondaryProcedure
		valueObject.setSecondaryProcedure(ims.core.vo.domain.ProcedureLiteVoAssembler.create(map, domainObject.getSecondaryProcedure()) );
		// SecondaryProcLaterality
		ims.domain.lookups.LookupInstance instance11 = domainObject.getSecondaryProcLaterality();
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

			ims.core.vo.lookups.LateralityLRB voLookup11 = new ims.core.vo.lookups.LateralityLRB(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.core.vo.lookups.LateralityLRB parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.core.vo.lookups.LateralityLRB(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setSecondaryProcLaterality(voLookup11);
		}
				// ProcedureDetails
		valueObject.setProcedureDetails(domainObject.getProcedureDetails());
		// isEndoscopyProcedure
		valueObject.setIsEndoscopyProcedure( domainObject.isIsEndoscopyProcedure() );
		// SurgeryTimeMins
		valueObject.setSurgeryTimeMins(domainObject.getSurgeryTimeMins());
		// TheatreType
		ims.domain.lookups.LookupInstance instance15 = domainObject.getTheatreType();
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

			ims.scheduling.vo.lookups.TheatreType voLookup15 = new ims.scheduling.vo.lookups.TheatreType(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.scheduling.vo.lookups.TheatreType parentVoLookup15 = voLookup15;
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
								parentVoLookup15.setParent(new ims.scheduling.vo.lookups.TheatreType(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setTheatreType(voLookup15);
		}
				// CurrentLocationOfPatient
		ims.domain.lookups.LookupInstance instance16 = domainObject.getCurrentLocationOfPatient();
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

			ims.scheduling.vo.lookups.PendingEmergencyCurrentPatientLocation voLookup16 = new ims.scheduling.vo.lookups.PendingEmergencyCurrentPatientLocation(instance16.getId(),instance16.getText(), instance16.isActive(), null, img, color);
			ims.scheduling.vo.lookups.PendingEmergencyCurrentPatientLocation parentVoLookup16 = voLookup16;
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
								parentVoLookup16.setParent(new ims.scheduling.vo.lookups.PendingEmergencyCurrentPatientLocation(parent16.getId(),parent16.getText(), parent16.isActive(), null, img, color));
				parentVoLookup16 = parentVoLookup16.getParent();
								parent16 = parent16.getParent();
			}			
			valueObject.setCurrentLocationOfPatient(voLookup16);
		}
				// ExpectedHospital
		valueObject.setExpectedHospital(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getExpectedHospital()) );
		// ExpectedWard
		valueObject.setExpectedWard(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getExpectedWard()) );
		// ExpectedDateTime
		java.util.Date ExpectedDateTime = domainObject.getExpectedDateTime();
		if ( null != ExpectedDateTime ) 
		{
			valueObject.setExpectedDateTime(new ims.framework.utils.DateTime(ExpectedDateTime) );
		}
		// TheatreAppointmentBooked
		if (domainObject.getTheatreAppointmentBooked() != null)
		{
			if(domainObject.getTheatreAppointmentBooked() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getTheatreAppointmentBooked();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setTheatreAppointmentBooked(new ims.scheduling.vo.Booking_AppointmentRefVo(id, -1));				
			}
			else
			{
				valueObject.setTheatreAppointmentBooked(new ims.scheduling.vo.Booking_AppointmentRefVo(domainObject.getTheatreAppointmentBooked().getId(), domainObject.getTheatreAppointmentBooked().getVersion()));
			}
		}
		// RemovedBy
		if (domainObject.getRemovedBy() != null)
		{
			if(domainObject.getRemovedBy() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getRemovedBy();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setRemovedBy(new ims.core.resource.people.vo.MemberOfStaffRefVo(id, -1));				
			}
			else
			{
				valueObject.setRemovedBy(new ims.core.resource.people.vo.MemberOfStaffRefVo(domainObject.getRemovedBy().getId(), domainObject.getRemovedBy().getVersion()));
			}
		}
		// RemovalReason
		ims.domain.lookups.LookupInstance instance22 = domainObject.getRemovalReason();
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

			ims.scheduling.vo.lookups.PendingEmergencyTheatreRemovalReason voLookup22 = new ims.scheduling.vo.lookups.PendingEmergencyTheatreRemovalReason(instance22.getId(),instance22.getText(), instance22.isActive(), null, img, color);
			ims.scheduling.vo.lookups.PendingEmergencyTheatreRemovalReason parentVoLookup22 = voLookup22;
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
								parentVoLookup22.setParent(new ims.scheduling.vo.lookups.PendingEmergencyTheatreRemovalReason(parent22.getId(),parent22.getText(), parent22.isActive(), null, img, color));
				parentVoLookup22 = parentVoLookup22.getParent();
								parent22 = parent22.getParent();
			}			
			valueObject.setRemovalReason(voLookup22);
		}
				// RemovalDateTime
		java.util.Date RemovalDateTime = domainObject.getRemovalDateTime();
		if ( null != RemovalDateTime ) 
		{
			valueObject.setRemovalDateTime(new ims.framework.utils.DateTime(RemovalDateTime) );
		}
		// isEndoscopySecondProcedure
		valueObject.setIsEndoscopySecondProcedure( domainObject.isIsEndoscopySecondProcedure() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.PendingEmergencyTheatre extractPendingEmergencyTheatre(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.PendingEmergencyTheatreVo valueObject) 
	{
		return 	extractPendingEmergencyTheatre(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.PendingEmergencyTheatre extractPendingEmergencyTheatre(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.PendingEmergencyTheatreVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PendingEmergencyTheatre();
		ims.scheduling.domain.objects.PendingEmergencyTheatre domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.scheduling.domain.objects.PendingEmergencyTheatre)domMap.get(valueObject);
			}
			// ims.scheduling.vo.PendingEmergencyTheatreVo ID_PendingEmergencyTheatre field is unknown
			domainObject = new ims.scheduling.domain.objects.PendingEmergencyTheatre();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PendingEmergencyTheatre());
			if (domMap.get(key) != null)
			{
				return (ims.scheduling.domain.objects.PendingEmergencyTheatre)domMap.get(key);
			}
			domainObject = (ims.scheduling.domain.objects.PendingEmergencyTheatre) domainFactory.getDomainObject(ims.scheduling.domain.objects.PendingEmergencyTheatre.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PendingEmergencyTheatre());

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
		ims.RefMan.domain.objects.CatsReferral value2 = null;
		if ( null != valueObject.getCatsReferral() ) 
		{
			if (valueObject.getCatsReferral().getBoId() == null)
			{
				if (domMap.get(valueObject.getCatsReferral()) != null)
				{
					value2 = (ims.RefMan.domain.objects.CatsReferral)domMap.get(valueObject.getCatsReferral());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getCatsReferral();	
			}
			else
			{
				value2 = (ims.RefMan.domain.objects.CatsReferral)domainFactory.getDomainObject(ims.RefMan.domain.objects.CatsReferral.class, valueObject.getCatsReferral().getBoId());
			}
		}
		domainObject.setCatsReferral(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getCurrentStatus() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getCurrentStatus().getID());
		}
		domainObject.setCurrentStatus(value3);
		domainObject.setWasInpatientWhenAddedToList(valueObject.getWasInpatientWhenAddedToList());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value5 = null;
		if ( null != valueObject.getResponsibleHCP() ) 
		{
			if (valueObject.getResponsibleHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getResponsibleHCP()) != null)
				{
					value5 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getResponsibleHCP());
				}
			}
			else
			{
				value5 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getResponsibleHCP().getBoId());
			}
		}
		domainObject.setResponsibleHCP(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getUrgencyCategory() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getUrgencyCategory().getID());
		}
		domainObject.setUrgencyCategory(value6);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Service value7 = null;
		if ( null != valueObject.getService() ) 
		{
			if (valueObject.getService().getBoId() == null)
			{
				if (domMap.get(valueObject.getService()) != null)
				{
					value7 = (ims.core.clinical.domain.objects.Service)domMap.get(valueObject.getService());
				}
			}
			else
			{
				value7 = (ims.core.clinical.domain.objects.Service)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Service.class, valueObject.getService().getBoId());
			}
		}
		domainObject.setService(value7);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Procedure value8 = null;
		if ( null != valueObject.getPrimaryProcedure() ) 
		{
			if (valueObject.getPrimaryProcedure().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrimaryProcedure()) != null)
				{
					value8 = (ims.core.clinical.domain.objects.Procedure)domMap.get(valueObject.getPrimaryProcedure());
				}
			}
			else
			{
				value8 = (ims.core.clinical.domain.objects.Procedure)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Procedure.class, valueObject.getPrimaryProcedure().getBoId());
			}
		}
		domainObject.setPrimaryProcedure(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getProcLaterality() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getProcLaterality().getID());
		}
		domainObject.setProcLaterality(value9);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Procedure value10 = null;
		if ( null != valueObject.getSecondaryProcedure() ) 
		{
			if (valueObject.getSecondaryProcedure().getBoId() == null)
			{
				if (domMap.get(valueObject.getSecondaryProcedure()) != null)
				{
					value10 = (ims.core.clinical.domain.objects.Procedure)domMap.get(valueObject.getSecondaryProcedure());
				}
			}
			else
			{
				value10 = (ims.core.clinical.domain.objects.Procedure)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Procedure.class, valueObject.getSecondaryProcedure().getBoId());
			}
		}
		domainObject.setSecondaryProcedure(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getSecondaryProcLaterality() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getSecondaryProcLaterality().getID());
		}
		domainObject.setSecondaryProcLaterality(value11);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getProcedureDetails() != null && valueObject.getProcedureDetails().equals(""))
		{
			valueObject.setProcedureDetails(null);
		}
		domainObject.setProcedureDetails(valueObject.getProcedureDetails());
		domainObject.setIsEndoscopyProcedure(valueObject.getIsEndoscopyProcedure());
		domainObject.setSurgeryTimeMins(valueObject.getSurgeryTimeMins());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getTheatreType() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getTheatreType().getID());
		}
		domainObject.setTheatreType(value15);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getCurrentLocationOfPatient() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getCurrentLocationOfPatient().getID());
		}
		domainObject.setCurrentLocationOfPatient(value16);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value17 = null;
		if ( null != valueObject.getExpectedHospital() ) 
		{
			if (valueObject.getExpectedHospital().getBoId() == null)
			{
				if (domMap.get(valueObject.getExpectedHospital()) != null)
				{
					value17 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getExpectedHospital());
				}
			}
			else
			{
				value17 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getExpectedHospital().getBoId());
			}
		}
		domainObject.setExpectedHospital(value17);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value18 = null;
		if ( null != valueObject.getExpectedWard() ) 
		{
			if (valueObject.getExpectedWard().getBoId() == null)
			{
				if (domMap.get(valueObject.getExpectedWard()) != null)
				{
					value18 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getExpectedWard());
				}
			}
			else
			{
				value18 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getExpectedWard().getBoId());
			}
		}
		domainObject.setExpectedWard(value18);
		ims.framework.utils.DateTime dateTime19 = valueObject.getExpectedDateTime();
		java.util.Date value19 = null;
		if ( dateTime19 != null ) 
		{
			value19 = dateTime19.getJavaDate();
		}
		domainObject.setExpectedDateTime(value19);
		ims.scheduling.domain.objects.Booking_Appointment value20 = null;
		if ( null != valueObject.getTheatreAppointmentBooked() ) 
		{
			if (valueObject.getTheatreAppointmentBooked().getBoId() == null)
			{
				if (domMap.get(valueObject.getTheatreAppointmentBooked()) != null)
				{
					value20 = (ims.scheduling.domain.objects.Booking_Appointment)domMap.get(valueObject.getTheatreAppointmentBooked());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value20 = domainObject.getTheatreAppointmentBooked();	
			}
			else
			{
				value20 = (ims.scheduling.domain.objects.Booking_Appointment)domainFactory.getDomainObject(ims.scheduling.domain.objects.Booking_Appointment.class, valueObject.getTheatreAppointmentBooked().getBoId());
			}
		}
		domainObject.setTheatreAppointmentBooked(value20);
		ims.core.resource.people.domain.objects.MemberOfStaff value21 = null;
		if ( null != valueObject.getRemovedBy() ) 
		{
			if (valueObject.getRemovedBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getRemovedBy()) != null)
				{
					value21 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getRemovedBy());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value21 = domainObject.getRemovedBy();	
			}
			else
			{
				value21 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getRemovedBy().getBoId());
			}
		}
		domainObject.setRemovedBy(value21);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value22 = null;
		if ( null != valueObject.getRemovalReason() ) 
		{
			value22 =
				domainFactory.getLookupInstance(valueObject.getRemovalReason().getID());
		}
		domainObject.setRemovalReason(value22);
		ims.framework.utils.DateTime dateTime23 = valueObject.getRemovalDateTime();
		java.util.Date value23 = null;
		if ( dateTime23 != null ) 
		{
			value23 = dateTime23.getJavaDate();
		}
		domainObject.setRemovalDateTime(value23);
		domainObject.setIsEndoscopySecondProcedure(valueObject.getIsEndoscopySecondProcedure());

		return domainObject;
	}

}
