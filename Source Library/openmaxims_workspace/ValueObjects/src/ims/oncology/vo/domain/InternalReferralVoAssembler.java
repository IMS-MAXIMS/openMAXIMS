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
 * Generated on 16/04/2014, 12:32
 *
 */
package ims.oncology.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class InternalReferralVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.oncology.vo.InternalReferralVo copy(ims.oncology.vo.InternalReferralVo valueObjectDest, ims.oncology.vo.InternalReferralVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_InternalReferral(valueObjectSrc.getID_InternalReferral());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// InternalReferralOutcome
		valueObjectDest.setInternalReferralOutcome(valueObjectSrc.getInternalReferralOutcome());
		// ReferralDate
		valueObjectDest.setReferralDate(valueObjectSrc.getReferralDate());
		// ReferralType
		valueObjectDest.setReferralType(valueObjectSrc.getReferralType());
		// ReferralSource
		valueObjectDest.setReferralSource(valueObjectSrc.getReferralSource());
		// ReferredBy
		valueObjectDest.setReferredBy(valueObjectSrc.getReferredBy());
		// DiagnosisText
		valueObjectDest.setDiagnosisText(valueObjectSrc.getDiagnosisText());
		// PlannedDischargeDate
		valueObjectDest.setPlannedDischargeDate(valueObjectSrc.getPlannedDischargeDate());
		// TreatmentStartDate
		valueObjectDest.setTreatmentStartDate(valueObjectSrc.getTreatmentStartDate());
		// TreatmentEndDate
		valueObjectDest.setTreatmentEndDate(valueObjectSrc.getTreatmentEndDate());
		// Comments
		valueObjectDest.setComments(valueObjectSrc.getComments());
		// ReferralReason
		valueObjectDest.setReferralReason(valueObjectSrc.getReferralReason());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// EpisodeOfCare
		valueObjectDest.setEpisodeOfCare(valueObjectSrc.getEpisodeOfCare());
		// ReferralSeen
		valueObjectDest.setReferralSeen(valueObjectSrc.getReferralSeen());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createInternalReferralVoCollectionFromInternalReferral(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.InternalReferral objects.
	 */
	public static ims.oncology.vo.InternalReferralVoCollection createInternalReferralVoCollectionFromInternalReferral(java.util.Set domainObjectSet)	
	{
		return createInternalReferralVoCollectionFromInternalReferral(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.InternalReferral objects.
	 */
	public static ims.oncology.vo.InternalReferralVoCollection createInternalReferralVoCollectionFromInternalReferral(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.oncology.vo.InternalReferralVoCollection voList = new ims.oncology.vo.InternalReferralVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.oncology.domain.objects.InternalReferral domainObject = (ims.oncology.domain.objects.InternalReferral) iterator.next();
			ims.oncology.vo.InternalReferralVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.oncology.domain.objects.InternalReferral objects.
	 */
	public static ims.oncology.vo.InternalReferralVoCollection createInternalReferralVoCollectionFromInternalReferral(java.util.List domainObjectList) 
	{
		return createInternalReferralVoCollectionFromInternalReferral(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.domain.objects.InternalReferral objects.
	 */
	public static ims.oncology.vo.InternalReferralVoCollection createInternalReferralVoCollectionFromInternalReferral(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.oncology.vo.InternalReferralVoCollection voList = new ims.oncology.vo.InternalReferralVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.domain.objects.InternalReferral domainObject = (ims.oncology.domain.objects.InternalReferral) domainObjectList.get(i);
			ims.oncology.vo.InternalReferralVo vo = create(map, domainObject);

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
	 * Create the ims.oncology.domain.objects.InternalReferral set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractInternalReferralSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.InternalReferralVoCollection voCollection) 
	 {
	 	return extractInternalReferralSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractInternalReferralSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.InternalReferralVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.InternalReferralVo vo = voCollection.get(i);
			ims.oncology.domain.objects.InternalReferral domainObject = InternalReferralVoAssembler.extractInternalReferral(domainFactory, vo, domMap);

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
	 * Create the ims.oncology.domain.objects.InternalReferral list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractInternalReferralList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.InternalReferralVoCollection voCollection) 
	 {
	 	return extractInternalReferralList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractInternalReferralList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.InternalReferralVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.InternalReferralVo vo = voCollection.get(i);
			ims.oncology.domain.objects.InternalReferral domainObject = InternalReferralVoAssembler.extractInternalReferral(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.oncology.domain.objects.InternalReferral object.
	 * @param domainObject ims.oncology.domain.objects.InternalReferral
	 */
	 public static ims.oncology.vo.InternalReferralVo create(ims.oncology.domain.objects.InternalReferral domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.oncology.domain.objects.InternalReferral object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.oncology.vo.InternalReferralVo create(DomainObjectMap map, ims.oncology.domain.objects.InternalReferral domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.oncology.vo.InternalReferralVo valueObject = (ims.oncology.vo.InternalReferralVo) map.getValueObject(domainObject, ims.oncology.vo.InternalReferralVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.oncology.vo.InternalReferralVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.oncology.domain.objects.InternalReferral
	 */
	 public static ims.oncology.vo.InternalReferralVo insert(ims.oncology.vo.InternalReferralVo valueObject, ims.oncology.domain.objects.InternalReferral domainObject) 
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
	 * @param domainObject ims.oncology.domain.objects.InternalReferral
	 */
	 public static ims.oncology.vo.InternalReferralVo insert(DomainObjectMap map, ims.oncology.vo.InternalReferralVo valueObject, ims.oncology.domain.objects.InternalReferral domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_InternalReferral(domainObject.getId());
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
			
		// Status
		ims.domain.lookups.LookupInstance instance1 = domainObject.getStatus();
		if ( null != instance1 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance1.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance1.getImage().getImageId(), instance1.getImage().getImagePath());
			}
			color = instance1.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup1 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup1 = voLookup1;
			ims.domain.lookups.LookupInstance parent1 = instance1.getParent();
			while (parent1 != null)
			{
				if (parent1.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent1.getImage().getImageId(), parent1.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent1.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup1.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setStatus(voLookup1);
		}
				// InternalReferralOutcome
		valueObject.setInternalReferralOutcome(ims.oncology.vo.domain.InternalReferralOutcomeVoAssembler.create(map, domainObject.getInternalReferralOutcome()) );
		// ReferralDate
		java.util.Date ReferralDate = domainObject.getReferralDate();
		if ( null != ReferralDate ) 
		{
			valueObject.setReferralDate(new ims.framework.utils.Date(ReferralDate) );
		}
		// ReferralType
		ims.domain.lookups.LookupInstance instance4 = domainObject.getReferralType();
		if ( null != instance4 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance4.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance4.getImage().getImageId(), instance4.getImage().getImagePath());
			}
			color = instance4.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.InternalReferralTypeAndReason voLookup4 = new ims.oncology.vo.lookups.InternalReferralTypeAndReason(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.oncology.vo.lookups.InternalReferralTypeAndReason parentVoLookup4 = voLookup4;
			ims.domain.lookups.LookupInstance parent4 = instance4.getParent();
			while (parent4 != null)
			{
				if (parent4.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent4.getImage().getImageId(), parent4.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent4.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup4.setParent(new ims.oncology.vo.lookups.InternalReferralTypeAndReason(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setReferralType(voLookup4);
		}
				// ReferralSource
		ims.domain.lookups.LookupInstance instance5 = domainObject.getReferralSource();
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

			ims.oncology.vo.lookups.InternalReferralSource voLookup5 = new ims.oncology.vo.lookups.InternalReferralSource(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.oncology.vo.lookups.InternalReferralSource parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.oncology.vo.lookups.InternalReferralSource(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setReferralSource(voLookup5);
		}
				// ReferredBy
		valueObject.setReferredBy(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getReferredBy()) );
		// DiagnosisText
		valueObject.setDiagnosisText(domainObject.getDiagnosisText());
		// PlannedDischargeDate
		java.util.Date PlannedDischargeDate = domainObject.getPlannedDischargeDate();
		if ( null != PlannedDischargeDate ) 
		{
			valueObject.setPlannedDischargeDate(new ims.framework.utils.Date(PlannedDischargeDate) );
		}
		// TreatmentStartDate
		java.util.Date TreatmentStartDate = domainObject.getTreatmentStartDate();
		if ( null != TreatmentStartDate ) 
		{
			valueObject.setTreatmentStartDate(new ims.framework.utils.Date(TreatmentStartDate) );
		}
		// TreatmentEndDate
		java.util.Date TreatmentEndDate = domainObject.getTreatmentEndDate();
		if ( null != TreatmentEndDate ) 
		{
			valueObject.setTreatmentEndDate(new ims.framework.utils.Date(TreatmentEndDate) );
		}
		// Comments
		valueObject.setComments(domainObject.getComments());
		// ReferralReason
		java.util.List listReferralReason = domainObject.getReferralReason();
		ims.oncology.vo.lookups.InternalReferralTypeAndReasonCollection ReferralReason = new ims.oncology.vo.lookups.InternalReferralTypeAndReasonCollection();
		for(java.util.Iterator iterator = listReferralReason.iterator(); iterator.hasNext(); ) 
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
			ims.oncology.vo.lookups.InternalReferralTypeAndReason voInstance = new ims.oncology.vo.lookups.InternalReferralTypeAndReason(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.oncology.vo.lookups.InternalReferralTypeAndReason parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.oncology.vo.lookups.InternalReferralTypeAndReason(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			ReferralReason.add(voInstance);
		}
		valueObject.setReferralReason( ReferralReason );
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
		// EpisodeOfCare
		valueObject.setEpisodeOfCare(ims.core.vo.domain.EpisodeOfCareForInternalReferralVoAssembler.create(map, domainObject.getEpisodeOfCare()) );
		// ReferralSeen
		valueObject.setReferralSeen( domainObject.isReferralSeen() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.domain.objects.InternalReferral extractInternalReferral(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.InternalReferralVo valueObject) 
	{
		return 	extractInternalReferral(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.domain.objects.InternalReferral extractInternalReferral(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.InternalReferralVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_InternalReferral();
		ims.oncology.domain.objects.InternalReferral domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.oncology.domain.objects.InternalReferral)domMap.get(valueObject);
			}
			// ims.oncology.vo.InternalReferralVo ID_InternalReferral field is unknown
			domainObject = new ims.oncology.domain.objects.InternalReferral();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_InternalReferral());
			if (domMap.get(key) != null)
			{
				return (ims.oncology.domain.objects.InternalReferral)domMap.get(key);
			}
			domainObject = (ims.oncology.domain.objects.InternalReferral) domainFactory.getDomainObject(ims.oncology.domain.objects.InternalReferral.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_InternalReferral());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value1);
		domainObject.setInternalReferralOutcome(ims.oncology.vo.domain.InternalReferralOutcomeVoAssembler.extractInternalReferralOutcome(domainFactory, valueObject.getInternalReferralOutcome(), domMap));
		java.util.Date value3 = null;
		ims.framework.utils.Date date3 = valueObject.getReferralDate();		
		if ( date3 != null ) 
		{
			value3 = date3.getDate();
		}
		domainObject.setReferralDate(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getReferralType() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getReferralType().getID());
		}
		domainObject.setReferralType(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getReferralSource() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getReferralSource().getID());
		}
		domainObject.setReferralSource(value5);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value6 = null;
		if ( null != valueObject.getReferredBy() ) 
		{
			if (valueObject.getReferredBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferredBy()) != null)
				{
					value6 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getReferredBy());
				}
			}
			else
			{
				value6 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getReferredBy().getBoId());
			}
		}
		domainObject.setReferredBy(value6);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDiagnosisText() != null && valueObject.getDiagnosisText().equals(""))
		{
			valueObject.setDiagnosisText(null);
		}
		domainObject.setDiagnosisText(valueObject.getDiagnosisText());
		java.util.Date value8 = null;
		ims.framework.utils.Date date8 = valueObject.getPlannedDischargeDate();		
		if ( date8 != null ) 
		{
			value8 = date8.getDate();
		}
		domainObject.setPlannedDischargeDate(value8);
		java.util.Date value9 = null;
		ims.framework.utils.Date date9 = valueObject.getTreatmentStartDate();		
		if ( date9 != null ) 
		{
			value9 = date9.getDate();
		}
		domainObject.setTreatmentStartDate(value9);
		java.util.Date value10 = null;
		ims.framework.utils.Date date10 = valueObject.getTreatmentEndDate();		
		if ( date10 != null ) 
		{
			value10 = date10.getDate();
		}
		domainObject.setTreatmentEndDate(value10);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComments() != null && valueObject.getComments().equals(""))
		{
			valueObject.setComments(null);
		}
		domainObject.setComments(valueObject.getComments());
		ims.oncology.vo.lookups.InternalReferralTypeAndReasonCollection collection12 =
	valueObject.getReferralReason();
	    java.util.List domainReferralReason = domainObject.getReferralReason();;			
	    int collection12Size=0;
		if (collection12 == null)
		{
			domainReferralReason = new java.util.ArrayList(0);
		}
		else
		{
			collection12Size = collection12.size();
		}
		
		for(int i=0; i<collection12Size; i++) 
		{
			int instanceId = collection12.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainReferralReason.indexOf(dom);
			if (domIdx == -1)
			{
				domainReferralReason.add(i, dom);
			}
			else if (i != domIdx && i < domainReferralReason.size())
			{
				Object tmp = domainReferralReason.get(i);
				domainReferralReason.set(i, domainReferralReason.get(domIdx));
				domainReferralReason.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j12 = domainReferralReason.size();
		while (j12 > collection12Size)
		{
			domainReferralReason.remove(j12-1);
			j12 = domainReferralReason.size();
		}

		domainObject.setReferralReason(domainReferralReason);		
		ims.core.patient.domain.objects.Patient value13 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value13 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value13 = domainObject.getPatient();	
			}
			else
			{
				value13 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value13);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.EpisodeOfCare value14 = null;
		if ( null != valueObject.getEpisodeOfCare() ) 
		{
			if (valueObject.getEpisodeOfCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisodeOfCare()) != null)
				{
					value14 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisodeOfCare());
				}
			}
			else
			{
				value14 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisodeOfCare().getBoId());
			}
		}
		domainObject.setEpisodeOfCare(value14);
		domainObject.setReferralSeen(valueObject.getReferralSeen());

		return domainObject;
	}

}
