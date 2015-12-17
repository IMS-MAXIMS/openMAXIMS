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
package ims.oncology.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Billy Mahon
 */
public class CancerCarePlanVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.oncology.vo.CancerCarePlanVo copy(ims.oncology.vo.CancerCarePlanVo valueObjectDest, ims.oncology.vo.CancerCarePlanVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CancerCarePlan(valueObjectSrc.getID_CancerCarePlan());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TreatmentModalities
		valueObjectDest.setTreatmentModalities(valueObjectSrc.getTreatmentModalities());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// AgreedDate
		valueObjectDest.setAgreedDate(valueObjectSrc.getAgreedDate());
		// ReasonPatientPlanDiffMDT
		valueObjectDest.setReasonPatientPlanDiffMDT(valueObjectSrc.getReasonPatientPlanDiffMDT());
		// NoAntiCancerTxReason
		valueObjectDest.setNoAntiCancerTxReason(valueObjectSrc.getNoAntiCancerTxReason());
		// hasAssociatedMDTMeeting
		valueObjectDest.setHasAssociatedMDTMeeting(valueObjectSrc.getHasAssociatedMDTMeeting());
		// ReasonForRevision
		valueObjectDest.setReasonForRevision(valueObjectSrc.getReasonForRevision());
		// CarePlanNotes
		valueObjectDest.setCarePlanNotes(valueObjectSrc.getCarePlanNotes());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// CarePlanDate
		valueObjectDest.setCarePlanDate(valueObjectSrc.getCarePlanDate());
		// ConsultantInCharge
		valueObjectDest.setConsultantInCharge(valueObjectSrc.getConsultantInCharge());
		// CarePlanIntent
		valueObjectDest.setCarePlanIntent(valueObjectSrc.getCarePlanIntent());
		// RecurrenceIndicator
		valueObjectDest.setRecurrenceIndicator(valueObjectSrc.getRecurrenceIndicator());
		// IsCurrent
		valueObjectDest.setIsCurrent(valueObjectSrc.getIsCurrent());
		// mdtMeeting
		valueObjectDest.setMdtMeeting(valueObjectSrc.getMdtMeeting());
		// EpisodeOfCare
		valueObjectDest.setEpisodeOfCare(valueObjectSrc.getEpisodeOfCare());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCancerCarePlanVoCollectionFromCancerCarePlan(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.CancerCarePlan objects.
	 */
	public static ims.oncology.vo.CancerCarePlanVoCollection createCancerCarePlanVoCollectionFromCancerCarePlan(java.util.Set domainObjectSet)	
	{
		return createCancerCarePlanVoCollectionFromCancerCarePlan(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.CancerCarePlan objects.
	 */
	public static ims.oncology.vo.CancerCarePlanVoCollection createCancerCarePlanVoCollectionFromCancerCarePlan(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.oncology.vo.CancerCarePlanVoCollection voList = new ims.oncology.vo.CancerCarePlanVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.oncology.domain.objects.CancerCarePlan domainObject = (ims.oncology.domain.objects.CancerCarePlan) iterator.next();
			ims.oncology.vo.CancerCarePlanVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.oncology.domain.objects.CancerCarePlan objects.
	 */
	public static ims.oncology.vo.CancerCarePlanVoCollection createCancerCarePlanVoCollectionFromCancerCarePlan(java.util.List domainObjectList) 
	{
		return createCancerCarePlanVoCollectionFromCancerCarePlan(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.domain.objects.CancerCarePlan objects.
	 */
	public static ims.oncology.vo.CancerCarePlanVoCollection createCancerCarePlanVoCollectionFromCancerCarePlan(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.oncology.vo.CancerCarePlanVoCollection voList = new ims.oncology.vo.CancerCarePlanVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.domain.objects.CancerCarePlan domainObject = (ims.oncology.domain.objects.CancerCarePlan) domainObjectList.get(i);
			ims.oncology.vo.CancerCarePlanVo vo = create(map, domainObject);

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
	 * Create the ims.oncology.domain.objects.CancerCarePlan set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractCancerCarePlanSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.CancerCarePlanVoCollection voCollection) 
	 {
	 	return extractCancerCarePlanSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCancerCarePlanSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.CancerCarePlanVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.CancerCarePlanVo vo = voCollection.get(i);
			ims.oncology.domain.objects.CancerCarePlan domainObject = CancerCarePlanVoAssembler.extractCancerCarePlan(domainFactory, vo, domMap);

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
	 * Create the ims.oncology.domain.objects.CancerCarePlan list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractCancerCarePlanList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.CancerCarePlanVoCollection voCollection) 
	 {
	 	return extractCancerCarePlanList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCancerCarePlanList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.CancerCarePlanVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.CancerCarePlanVo vo = voCollection.get(i);
			ims.oncology.domain.objects.CancerCarePlan domainObject = CancerCarePlanVoAssembler.extractCancerCarePlan(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.oncology.domain.objects.CancerCarePlan object.
	 * @param domainObject ims.oncology.domain.objects.CancerCarePlan
	 */
	 public static ims.oncology.vo.CancerCarePlanVo create(ims.oncology.domain.objects.CancerCarePlan domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.oncology.domain.objects.CancerCarePlan object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.oncology.vo.CancerCarePlanVo create(DomainObjectMap map, ims.oncology.domain.objects.CancerCarePlan domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.oncology.vo.CancerCarePlanVo valueObject = (ims.oncology.vo.CancerCarePlanVo) map.getValueObject(domainObject, ims.oncology.vo.CancerCarePlanVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.oncology.vo.CancerCarePlanVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.oncology.domain.objects.CancerCarePlan
	 */
	 public static ims.oncology.vo.CancerCarePlanVo insert(ims.oncology.vo.CancerCarePlanVo valueObject, ims.oncology.domain.objects.CancerCarePlan domainObject) 
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
	 * @param domainObject ims.oncology.domain.objects.CancerCarePlan
	 */
	 public static ims.oncology.vo.CancerCarePlanVo insert(DomainObjectMap map, ims.oncology.vo.CancerCarePlanVo valueObject, ims.oncology.domain.objects.CancerCarePlan domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_CancerCarePlan(domainObject.getId());
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
			
		// TreatmentModalities
		valueObject.setTreatmentModalities(ims.oncology.vo.domain.TreatmentModalitiesVoAssembler.createTreatmentModalitiesVoCollectionFromCarePlanModality(map, domainObject.getTreatmentModalities()) );
		// CurrentStatus
		ims.domain.lookups.LookupInstance instance2 = domainObject.getCurrentStatus();
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

			ims.oncology.vo.lookups.CarePlanCurrentStatus voLookup2 = new ims.oncology.vo.lookups.CarePlanCurrentStatus(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.oncology.vo.lookups.CarePlanCurrentStatus parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.oncology.vo.lookups.CarePlanCurrentStatus(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setCurrentStatus(voLookup2);
		}
				// AgreedDate
		java.util.Date AgreedDate = domainObject.getAgreedDate();
		if ( null != AgreedDate ) 
		{
			valueObject.setAgreedDate(new ims.framework.utils.Date(AgreedDate) );
		}
		// ReasonPatientPlanDiffMDT
		valueObject.setReasonPatientPlanDiffMDT(domainObject.getReasonPatientPlanDiffMDT());
		// NoAntiCancerTxReason
		java.util.List listNoAntiCancerTxReason = domainObject.getNoAntiCancerTxReason();
		ims.oncology.vo.lookups.NoAntiCancerTxReasonCollection NoAntiCancerTxReason = new ims.oncology.vo.lookups.NoAntiCancerTxReasonCollection();
		for(java.util.Iterator iterator = listNoAntiCancerTxReason.iterator(); iterator.hasNext(); ) 
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
			ims.oncology.vo.lookups.NoAntiCancerTxReason voInstance = new ims.oncology.vo.lookups.NoAntiCancerTxReason(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.oncology.vo.lookups.NoAntiCancerTxReason parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.oncology.vo.lookups.NoAntiCancerTxReason(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			NoAntiCancerTxReason.add(voInstance);
		}
		valueObject.setNoAntiCancerTxReason( NoAntiCancerTxReason );
		// hasAssociatedMDTMeeting
		valueObject.setHasAssociatedMDTMeeting( domainObject.isHasAssociatedMDTMeeting() );
		// ReasonForRevision
		valueObject.setReasonForRevision(domainObject.getReasonForRevision());
		// CarePlanNotes
		valueObject.setCarePlanNotes(domainObject.getCarePlanNotes());
		// ClinicalContact
		valueObject.setClinicalContact(ims.core.vo.domain.ClinicalContactShortVoAssembler.create(map, domainObject.getClinicalContact()) );
		// CareContext
		valueObject.setCareContext(ims.core.vo.domain.CareContextShortVoAssembler.create(map, domainObject.getCareContext()) );
		// CarePlanDate
		java.util.Date CarePlanDate = domainObject.getCarePlanDate();
		if ( null != CarePlanDate ) 
		{
			valueObject.setCarePlanDate(new ims.framework.utils.Date(CarePlanDate) );
		}
		// ConsultantInCharge
		valueObject.setConsultantInCharge(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getConsultantInCharge()) );
		// CarePlanIntent
		ims.domain.lookups.LookupInstance instance13 = domainObject.getCarePlanIntent();
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

			ims.oncology.vo.lookups.CarePlanIntent voLookup13 = new ims.oncology.vo.lookups.CarePlanIntent(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.oncology.vo.lookups.CarePlanIntent parentVoLookup13 = voLookup13;
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
								parentVoLookup13.setParent(new ims.oncology.vo.lookups.CarePlanIntent(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setCarePlanIntent(voLookup13);
		}
				// RecurrenceIndicator
		ims.domain.lookups.LookupInstance instance14 = domainObject.getRecurrenceIndicator();
		if ( null != instance14 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance14.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance14.getImage().getImageId(), instance14.getImage().getImagePath());
			}
			color = instance14.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.RecurrenceIndicator voLookup14 = new ims.oncology.vo.lookups.RecurrenceIndicator(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.oncology.vo.lookups.RecurrenceIndicator parentVoLookup14 = voLookup14;
			ims.domain.lookups.LookupInstance parent14 = instance14.getParent();
			while (parent14 != null)
			{
				if (parent14.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent14.getImage().getImageId(), parent14.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent14.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup14.setParent(new ims.oncology.vo.lookups.RecurrenceIndicator(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setRecurrenceIndicator(voLookup14);
		}
				// IsCurrent
		valueObject.setIsCurrent( domainObject.isIsCurrent() );
		// mdtMeeting
		valueObject.setMdtMeeting(ims.oncology.vo.domain.CancerMDTMeetingVoAssembler.create(map, domainObject.getMdtMeeting()) );
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
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.domain.objects.CancerCarePlan extractCancerCarePlan(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.CancerCarePlanVo valueObject) 
	{
		return 	extractCancerCarePlan(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.domain.objects.CancerCarePlan extractCancerCarePlan(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.CancerCarePlanVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_CancerCarePlan();
		ims.oncology.domain.objects.CancerCarePlan domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.oncology.domain.objects.CancerCarePlan)domMap.get(valueObject);
			}
			// ims.oncology.vo.CancerCarePlanVo ID_CancerCarePlan field is unknown
			domainObject = new ims.oncology.domain.objects.CancerCarePlan();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_CancerCarePlan());
			if (domMap.get(key) != null)
			{
				return (ims.oncology.domain.objects.CancerCarePlan)domMap.get(key);
			}
			domainObject = (ims.oncology.domain.objects.CancerCarePlan) domainFactory.getDomainObject(ims.oncology.domain.objects.CancerCarePlan.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_CancerCarePlan());

		domainObject.setTreatmentModalities(ims.oncology.vo.domain.TreatmentModalitiesVoAssembler.extractCarePlanModalityList(domainFactory, valueObject.getTreatmentModalities(), domainObject.getTreatmentModalities(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getCurrentStatus() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getCurrentStatus().getID());
		}
		domainObject.setCurrentStatus(value2);
		java.util.Date value3 = null;
		ims.framework.utils.Date date3 = valueObject.getAgreedDate();		
		if ( date3 != null ) 
		{
			value3 = date3.getDate();
		}
		domainObject.setAgreedDate(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReasonPatientPlanDiffMDT() != null && valueObject.getReasonPatientPlanDiffMDT().equals(""))
		{
			valueObject.setReasonPatientPlanDiffMDT(null);
		}
		domainObject.setReasonPatientPlanDiffMDT(valueObject.getReasonPatientPlanDiffMDT());
		ims.oncology.vo.lookups.NoAntiCancerTxReasonCollection collection5 =
	valueObject.getNoAntiCancerTxReason();
	    java.util.List domainNoAntiCancerTxReason = domainObject.getNoAntiCancerTxReason();;			
	    int collection5Size=0;
		if (collection5 == null)
		{
			domainNoAntiCancerTxReason = new java.util.ArrayList(0);
		}
		else
		{
			collection5Size = collection5.size();
		}
		
		for(int i=0; i<collection5Size; i++) 
		{
			int instanceId = collection5.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainNoAntiCancerTxReason.indexOf(dom);
			if (domIdx == -1)
			{
				domainNoAntiCancerTxReason.add(i, dom);
			}
			else if (i != domIdx && i < domainNoAntiCancerTxReason.size())
			{
				Object tmp = domainNoAntiCancerTxReason.get(i);
				domainNoAntiCancerTxReason.set(i, domainNoAntiCancerTxReason.get(domIdx));
				domainNoAntiCancerTxReason.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j5 = domainNoAntiCancerTxReason.size();
		while (j5 > collection5Size)
		{
			domainNoAntiCancerTxReason.remove(j5-1);
			j5 = domainNoAntiCancerTxReason.size();
		}

		domainObject.setNoAntiCancerTxReason(domainNoAntiCancerTxReason);		
		domainObject.setHasAssociatedMDTMeeting(valueObject.getHasAssociatedMDTMeeting());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReasonForRevision() != null && valueObject.getReasonForRevision().equals(""))
		{
			valueObject.setReasonForRevision(null);
		}
		domainObject.setReasonForRevision(valueObject.getReasonForRevision());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCarePlanNotes() != null && valueObject.getCarePlanNotes().equals(""))
		{
			valueObject.setCarePlanNotes(null);
		}
		domainObject.setCarePlanNotes(valueObject.getCarePlanNotes());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.ClinicalContact value9 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value9 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else
			{
				value9 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value9);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.CareContext value10 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value10 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else
			{
				value10 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value10);
		java.util.Date value11 = null;
		ims.framework.utils.Date date11 = valueObject.getCarePlanDate();		
		if ( date11 != null ) 
		{
			value11 = date11.getDate();
		}
		domainObject.setCarePlanDate(value11);
		domainObject.setConsultantInCharge(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getConsultantInCharge(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getCarePlanIntent() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getCarePlanIntent().getID());
		}
		domainObject.setCarePlanIntent(value13);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getRecurrenceIndicator() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getRecurrenceIndicator().getID());
		}
		domainObject.setRecurrenceIndicator(value14);
		domainObject.setIsCurrent(valueObject.getIsCurrent());
		domainObject.setMdtMeeting(ims.oncology.vo.domain.CancerMDTMeetingVoAssembler.extractCancerMDTMeeting(domainFactory, valueObject.getMdtMeeting(), domMap));
		ims.core.admin.domain.objects.EpisodeOfCare value17 = null;
		if ( null != valueObject.getEpisodeOfCare() ) 
		{
			if (valueObject.getEpisodeOfCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisodeOfCare()) != null)
				{
					value17 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisodeOfCare());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value17 = domainObject.getEpisodeOfCare();	
			}
			else
			{
				value17 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisodeOfCare().getBoId());
			}
		}
		domainObject.setEpisodeOfCare(value17);

		return domainObject;
	}

}
