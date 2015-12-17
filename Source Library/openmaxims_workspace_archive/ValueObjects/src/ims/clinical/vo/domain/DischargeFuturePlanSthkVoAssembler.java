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
 * @author George Cristian Josan
 */
public class DischargeFuturePlanSthkVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.DischargeFuturePlanSthkVo copy(ims.clinical.vo.DischargeFuturePlanSthkVo valueObjectDest, ims.clinical.vo.DischargeFuturePlanSthkVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_FuturePlan(valueObjectSrc.getID_FuturePlan());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// FollowUpDetails
		valueObjectDest.setFollowUpDetails(valueObjectSrc.getFollowUpDetails());
		// HospitalPlan
		valueObjectDest.setHospitalPlan(valueObjectSrc.getHospitalPlan());
		// ActionsforGPandCommunity
		valueObjectDest.setActionsforGPandCommunity(valueObjectSrc.getActionsforGPandCommunity());
		// LivesAlone
		valueObjectDest.setLivesAlone(valueObjectSrc.getLivesAlone());
		// MedicalCertificationIssued
		valueObjectDest.setMedicalCertificationIssued(valueObjectSrc.getMedicalCertificationIssued());
		// StatementOfFitnessToWorkIssue
		valueObjectDest.setStatementOfFitnessToWorkIssue(valueObjectSrc.getStatementOfFitnessToWorkIssue());
		// CertificateExpiresDate
		valueObjectDest.setCertificateExpiresDate(valueObjectSrc.getCertificateExpiresDate());
		// CertificateStartsDate
		valueObjectDest.setCertificateStartsDate(valueObjectSrc.getCertificateStartsDate());
		// FitToReturnToWork
		valueObjectDest.setFitToReturnToWork(valueObjectSrc.getFitToReturnToWork());
		// ReturnToWorkAdvice
		valueObjectDest.setReturnToWorkAdvice(valueObjectSrc.getReturnToWorkAdvice());
		// AdviceApplicatiableFor
		valueObjectDest.setAdviceApplicatiableFor(valueObjectSrc.getAdviceApplicatiableFor());
		// AdviceApplicatiableForUnit
		valueObjectDest.setAdviceApplicatiableForUnit(valueObjectSrc.getAdviceApplicatiableForUnit());
		// Comments
		valueObjectDest.setComments(valueObjectSrc.getComments());
		// wasNurseEnabledDischarge
		valueObjectDest.setWasNurseEnabledDischarge(valueObjectSrc.getWasNurseEnabledDischarge());
		// NurseEnabledInstructions
		valueObjectDest.setNurseEnabledInstructions(valueObjectSrc.getNurseEnabledInstructions());
		// isComplete
		valueObjectDest.setIsComplete(valueObjectSrc.getIsComplete());
		// HospitalFollowUp
		valueObjectDest.setHospitalFollowUp(valueObjectSrc.getHospitalFollowUp());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createDischargeFuturePlanSthkVoCollectionFromFuturePlan(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.edischarge.domain.objects.FuturePlan objects.
	 */
	public static ims.clinical.vo.DischargeFuturePlanSthkVoCollection createDischargeFuturePlanSthkVoCollectionFromFuturePlan(java.util.Set domainObjectSet)	
	{
		return createDischargeFuturePlanSthkVoCollectionFromFuturePlan(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.edischarge.domain.objects.FuturePlan objects.
	 */
	public static ims.clinical.vo.DischargeFuturePlanSthkVoCollection createDischargeFuturePlanSthkVoCollectionFromFuturePlan(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.DischargeFuturePlanSthkVoCollection voList = new ims.clinical.vo.DischargeFuturePlanSthkVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.edischarge.domain.objects.FuturePlan domainObject = (ims.edischarge.domain.objects.FuturePlan) iterator.next();
			ims.clinical.vo.DischargeFuturePlanSthkVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.edischarge.domain.objects.FuturePlan objects.
	 */
	public static ims.clinical.vo.DischargeFuturePlanSthkVoCollection createDischargeFuturePlanSthkVoCollectionFromFuturePlan(java.util.List domainObjectList) 
	{
		return createDischargeFuturePlanSthkVoCollectionFromFuturePlan(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.edischarge.domain.objects.FuturePlan objects.
	 */
	public static ims.clinical.vo.DischargeFuturePlanSthkVoCollection createDischargeFuturePlanSthkVoCollectionFromFuturePlan(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.DischargeFuturePlanSthkVoCollection voList = new ims.clinical.vo.DischargeFuturePlanSthkVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.edischarge.domain.objects.FuturePlan domainObject = (ims.edischarge.domain.objects.FuturePlan) domainObjectList.get(i);
			ims.clinical.vo.DischargeFuturePlanSthkVo vo = create(map, domainObject);

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
	 * Create the ims.edischarge.domain.objects.FuturePlan set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractFuturePlanSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeFuturePlanSthkVoCollection voCollection) 
	 {
	 	return extractFuturePlanSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractFuturePlanSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeFuturePlanSthkVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.DischargeFuturePlanSthkVo vo = voCollection.get(i);
			ims.edischarge.domain.objects.FuturePlan domainObject = DischargeFuturePlanSthkVoAssembler.extractFuturePlan(domainFactory, vo, domMap);

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
	 * Create the ims.edischarge.domain.objects.FuturePlan list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractFuturePlanList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeFuturePlanSthkVoCollection voCollection) 
	 {
	 	return extractFuturePlanList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractFuturePlanList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeFuturePlanSthkVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.DischargeFuturePlanSthkVo vo = voCollection.get(i);
			ims.edischarge.domain.objects.FuturePlan domainObject = DischargeFuturePlanSthkVoAssembler.extractFuturePlan(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.edischarge.domain.objects.FuturePlan object.
	 * @param domainObject ims.edischarge.domain.objects.FuturePlan
	 */
	 public static ims.clinical.vo.DischargeFuturePlanSthkVo create(ims.edischarge.domain.objects.FuturePlan domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.edischarge.domain.objects.FuturePlan object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.DischargeFuturePlanSthkVo create(DomainObjectMap map, ims.edischarge.domain.objects.FuturePlan domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.DischargeFuturePlanSthkVo valueObject = (ims.clinical.vo.DischargeFuturePlanSthkVo) map.getValueObject(domainObject, ims.clinical.vo.DischargeFuturePlanSthkVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.DischargeFuturePlanSthkVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.edischarge.domain.objects.FuturePlan
	 */
	 public static ims.clinical.vo.DischargeFuturePlanSthkVo insert(ims.clinical.vo.DischargeFuturePlanSthkVo valueObject, ims.edischarge.domain.objects.FuturePlan domainObject) 
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
	 * @param domainObject ims.edischarge.domain.objects.FuturePlan
	 */
	 public static ims.clinical.vo.DischargeFuturePlanSthkVo insert(DomainObjectMap map, ims.clinical.vo.DischargeFuturePlanSthkVo valueObject, ims.edischarge.domain.objects.FuturePlan domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_FuturePlan(domainObject.getId());
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
		// FollowUpDetails
		valueObject.setFollowUpDetails(ims.clinical.vo.domain.DischargeFuturePlanFollowUpVoAssembler.createDischargeFuturePlanFollowUpVoCollectionFromFuturePlanFollowUp(map, domainObject.getFollowUpDetails()) );
		// HospitalPlan
		valueObject.setHospitalPlan(domainObject.getHospitalPlan());
		// ActionsforGPandCommunity
		valueObject.setActionsforGPandCommunity(domainObject.getActionsforGPandCommunity());
		// LivesAlone
		ims.domain.lookups.LookupInstance instance5 = domainObject.getLivesAlone();
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

			ims.core.vo.lookups.YesNo voLookup5 = new ims.core.vo.lookups.YesNo(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.YesNo(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setLivesAlone(voLookup5);
		}
				// MedicalCertificationIssued
		ims.domain.lookups.LookupInstance instance6 = domainObject.getMedicalCertificationIssued();
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

			ims.core.vo.lookups.YesNo voLookup6 = new ims.core.vo.lookups.YesNo(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.YesNo(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setMedicalCertificationIssued(voLookup6);
		}
				// StatementOfFitnessToWorkIssue
		ims.domain.lookups.LookupInstance instance7 = domainObject.getStatementOfFitnessToWorkIssue();
		if ( null != instance7 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance7.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance7.getImage().getImageId(), instance7.getImage().getImagePath());
			}
			color = instance7.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup7 = new ims.core.vo.lookups.YesNo(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup7 = voLookup7;
			ims.domain.lookups.LookupInstance parent7 = instance7.getParent();
			while (parent7 != null)
			{
				if (parent7.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent7.getImage().getImageId(), parent7.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent7.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup7.setParent(new ims.core.vo.lookups.YesNo(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setStatementOfFitnessToWorkIssue(voLookup7);
		}
				// CertificateExpiresDate
		java.util.Date CertificateExpiresDate = domainObject.getCertificateExpiresDate();
		if ( null != CertificateExpiresDate ) 
		{
			valueObject.setCertificateExpiresDate(new ims.framework.utils.Date(CertificateExpiresDate) );
		}
		// CertificateStartsDate
		java.util.Date CertificateStartsDate = domainObject.getCertificateStartsDate();
		if ( null != CertificateStartsDate ) 
		{
			valueObject.setCertificateStartsDate(new ims.framework.utils.Date(CertificateStartsDate) );
		}
		// FitToReturnToWork
		ims.domain.lookups.LookupInstance instance10 = domainObject.getFitToReturnToWork();
		if ( null != instance10 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance10.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance10.getImage().getImageId(), instance10.getImage().getImagePath());
			}
			color = instance10.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup10 = new ims.core.vo.lookups.YesNo(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup10 = voLookup10;
			ims.domain.lookups.LookupInstance parent10 = instance10.getParent();
			while (parent10 != null)
			{
				if (parent10.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent10.getImage().getImageId(), parent10.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent10.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup10.setParent(new ims.core.vo.lookups.YesNo(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setFitToReturnToWork(voLookup10);
		}
				// ReturnToWorkAdvice
		ims.domain.lookups.LookupInstance instance11 = domainObject.getReturnToWorkAdvice();
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

			ims.clinical.vo.lookups.ReturnToWorkAdvice voLookup11 = new ims.clinical.vo.lookups.ReturnToWorkAdvice(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.clinical.vo.lookups.ReturnToWorkAdvice parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.clinical.vo.lookups.ReturnToWorkAdvice(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setReturnToWorkAdvice(voLookup11);
		}
				// AdviceApplicatiableFor
		valueObject.setAdviceApplicatiableFor(domainObject.getAdviceApplicatiableFor());
		// AdviceApplicatiableForUnit
		ims.domain.lookups.LookupInstance instance13 = domainObject.getAdviceApplicatiableForUnit();
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

			ims.clinical.vo.lookups.AdviceApplicatiableForUnit voLookup13 = new ims.clinical.vo.lookups.AdviceApplicatiableForUnit(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.clinical.vo.lookups.AdviceApplicatiableForUnit parentVoLookup13 = voLookup13;
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
								parentVoLookup13.setParent(new ims.clinical.vo.lookups.AdviceApplicatiableForUnit(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setAdviceApplicatiableForUnit(voLookup13);
		}
				// Comments
		valueObject.setComments(domainObject.getComments());
		// wasNurseEnabledDischarge
		valueObject.setWasNurseEnabledDischarge( domainObject.isWasNurseEnabledDischarge() );
		// NurseEnabledInstructions
		valueObject.setNurseEnabledInstructions(ims.clinical.vo.domain.NurseEnabledInstructionsVoAssembler.create(map, domainObject.getNurseEnabledInstructions()) );
		// isComplete
		valueObject.setIsComplete( domainObject.isIsComplete() );
		// HospitalFollowUp
		ims.domain.lookups.LookupInstance instance18 = domainObject.getHospitalFollowUp();
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
			valueObject.setHospitalFollowUp(voLookup18);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.edischarge.domain.objects.FuturePlan extractFuturePlan(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeFuturePlanSthkVo valueObject) 
	{
		return 	extractFuturePlan(domainFactory, valueObject, new HashMap());
	}

	public static ims.edischarge.domain.objects.FuturePlan extractFuturePlan(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeFuturePlanSthkVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_FuturePlan();
		ims.edischarge.domain.objects.FuturePlan domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.edischarge.domain.objects.FuturePlan)domMap.get(valueObject);
			}
			// ims.clinical.vo.DischargeFuturePlanSthkVo ID_FuturePlan field is unknown
			domainObject = new ims.edischarge.domain.objects.FuturePlan();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_FuturePlan());
			if (domMap.get(key) != null)
			{
				return (ims.edischarge.domain.objects.FuturePlan)domMap.get(key);
			}
			domainObject = (ims.edischarge.domain.objects.FuturePlan) domainFactory.getDomainObject(ims.edischarge.domain.objects.FuturePlan.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_FuturePlan());

		ims.core.admin.domain.objects.CareContext value1 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value1 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getCareContext();	
			}
			else
			{
				value1 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value1);
		domainObject.setFollowUpDetails(ims.clinical.vo.domain.DischargeFuturePlanFollowUpVoAssembler.extractFuturePlanFollowUpSet(domainFactory, valueObject.getFollowUpDetails(), domainObject.getFollowUpDetails(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getHospitalPlan() != null && valueObject.getHospitalPlan().equals(""))
		{
			valueObject.setHospitalPlan(null);
		}
		domainObject.setHospitalPlan(valueObject.getHospitalPlan());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getActionsforGPandCommunity() != null && valueObject.getActionsforGPandCommunity().equals(""))
		{
			valueObject.setActionsforGPandCommunity(null);
		}
		domainObject.setActionsforGPandCommunity(valueObject.getActionsforGPandCommunity());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getLivesAlone() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getLivesAlone().getID());
		}
		domainObject.setLivesAlone(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getMedicalCertificationIssued() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getMedicalCertificationIssued().getID());
		}
		domainObject.setMedicalCertificationIssued(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getStatementOfFitnessToWorkIssue() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getStatementOfFitnessToWorkIssue().getID());
		}
		domainObject.setStatementOfFitnessToWorkIssue(value7);
		java.util.Date value8 = null;
		ims.framework.utils.Date date8 = valueObject.getCertificateExpiresDate();		
		if ( date8 != null ) 
		{
			value8 = date8.getDate();
		}
		domainObject.setCertificateExpiresDate(value8);
		java.util.Date value9 = null;
		ims.framework.utils.Date date9 = valueObject.getCertificateStartsDate();		
		if ( date9 != null ) 
		{
			value9 = date9.getDate();
		}
		domainObject.setCertificateStartsDate(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getFitToReturnToWork() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getFitToReturnToWork().getID());
		}
		domainObject.setFitToReturnToWork(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getReturnToWorkAdvice() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getReturnToWorkAdvice().getID());
		}
		domainObject.setReturnToWorkAdvice(value11);
		domainObject.setAdviceApplicatiableFor(valueObject.getAdviceApplicatiableFor());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getAdviceApplicatiableForUnit() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getAdviceApplicatiableForUnit().getID());
		}
		domainObject.setAdviceApplicatiableForUnit(value13);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComments() != null && valueObject.getComments().equals(""))
		{
			valueObject.setComments(null);
		}
		domainObject.setComments(valueObject.getComments());
		domainObject.setWasNurseEnabledDischarge(valueObject.getWasNurseEnabledDischarge());
		domainObject.setNurseEnabledInstructions(ims.clinical.vo.domain.NurseEnabledInstructionsVoAssembler.extractNurseEnabledInstructions(domainFactory, valueObject.getNurseEnabledInstructions(), domMap));
		domainObject.setIsComplete(valueObject.getIsComplete());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value18 = null;
		if ( null != valueObject.getHospitalFollowUp() ) 
		{
			value18 =
				domainFactory.getLookupInstance(valueObject.getHospitalFollowUp().getID());
		}
		domainObject.setHospitalFollowUp(value18);

		return domainObject;
	}

}
