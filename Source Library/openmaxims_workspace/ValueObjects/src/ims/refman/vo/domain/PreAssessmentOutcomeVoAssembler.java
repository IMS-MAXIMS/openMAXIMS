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
 * @author Barbara Worwood
 */
public class PreAssessmentOutcomeVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.PreAssessmentOutcomeVo copy(ims.RefMan.vo.PreAssessmentOutcomeVo valueObjectDest, ims.RefMan.vo.PreAssessmentOutcomeVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PreAssessmentOutcome(valueObjectSrc.getID_PreAssessmentOutcome());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// recordingInformation
		valueObjectDest.setRecordingInformation(valueObjectSrc.getRecordingInformation());
		// lastUpdatingInformation
		valueObjectDest.setLastUpdatingInformation(valueObjectSrc.getLastUpdatingInformation());
		// PrimaryProcedure
		valueObjectDest.setPrimaryProcedure(valueObjectSrc.getPrimaryProcedure());
		// ProcedureDescription
		valueObjectDest.setProcedureDescription(valueObjectSrc.getProcedureDescription());
		// ProcLaterality
		valueObjectDest.setProcLaterality(valueObjectSrc.getProcLaterality());
		// AnaestheticType
		valueObjectDest.setAnaestheticType(valueObjectSrc.getAnaestheticType());
		// SecondaryProcedure
		valueObjectDest.setSecondaryProcedure(valueObjectSrc.getSecondaryProcedure());
		// SecondaryDescription
		valueObjectDest.setSecondaryDescription(valueObjectSrc.getSecondaryDescription());
		// SecondaryProcLaterality
		valueObjectDest.setSecondaryProcLaterality(valueObjectSrc.getSecondaryProcLaterality());
		// Metrics
		valueObjectDest.setMetrics(valueObjectSrc.getMetrics());
		// PatientDiabetic
		valueObjectDest.setPatientDiabetic(valueObjectSrc.getPatientDiabetic());
		// PaceMakerDefib
		valueObjectDest.setPaceMakerDefib(valueObjectSrc.getPaceMakerDefib());
		// PaceMakerType
		valueObjectDest.setPaceMakerType(valueObjectSrc.getPaceMakerType());
		// DateLastCheckPacemaker
		valueObjectDest.setDateLastCheckPacemaker(valueObjectSrc.getDateLastCheckPacemaker());
		// ReceivingAntiCoag
		valueObjectDest.setReceivingAntiCoag(valueObjectSrc.getReceivingAntiCoag());
		// TherapyAction
		valueObjectDest.setTherapyAction(valueObjectSrc.getTherapyAction());
		// MobilityConsideration
		valueObjectDest.setMobilityConsideration(valueObjectSrc.getMobilityConsideration());
		// MobilityComment
		valueObjectDest.setMobilityComment(valueObjectSrc.getMobilityComment());
		// ElectricBedNeeded
		valueObjectDest.setElectricBedNeeded(valueObjectSrc.getElectricBedNeeded());
		// ShortNotice
		valueObjectDest.setShortNotice(valueObjectSrc.getShortNotice());
		// NoticePeriodValue
		valueObjectDest.setNoticePeriodValue(valueObjectSrc.getNoticePeriodValue());
		// NoticePeriodType
		valueObjectDest.setNoticePeriodType(valueObjectSrc.getNoticePeriodType());
		// PreOpOvernight
		valueObjectDest.setPreOpOvernight(valueObjectSrc.getPreOpOvernight());
		// Nights
		valueObjectDest.setNights(valueObjectSrc.getNights());
		// PostOpStay
		valueObjectDest.setPostOpStay(valueObjectSrc.getPostOpStay());
		// TheatreType
		valueObjectDest.setTheatreType(valueObjectSrc.getTheatreType());
		// PostOpComments
		valueObjectDest.setPostOpComments(valueObjectSrc.getPostOpComments());
		// SeniorAnaestRequired
		valueObjectDest.setSeniorAnaestRequired(valueObjectSrc.getSeniorAnaestRequired());
		// SeniorAnaestComments
		valueObjectDest.setSeniorAnaestComments(valueObjectSrc.getSeniorAnaestComments());
		// CriticalCareBedRequired
		valueObjectDest.setCriticalCareBedRequired(valueObjectSrc.getCriticalCareBedRequired());
		// HduCriticalCareBed
		valueObjectDest.setHduCriticalCareBed(valueObjectSrc.getHduCriticalCareBed());
		// ItuCriticalCareBed
		valueObjectDest.setItuCriticalCareBed(valueObjectSrc.getItuCriticalCareBed());
		// AnaestheticHazards
		valueObjectDest.setAnaestheticHazards(valueObjectSrc.getAnaestheticHazards());
		// WaitingForDetails
		valueObjectDest.setWaitingForDetails(valueObjectSrc.getWaitingForDetails());
		// DetailsOutstanding
		valueObjectDest.setDetailsOutstanding(valueObjectSrc.getDetailsOutstanding());
		// CrossmatchRequired
		valueObjectDest.setCrossmatchRequired(valueObjectSrc.getCrossmatchRequired());
		// CrossmatchComments
		valueObjectDest.setCrossmatchComments(valueObjectSrc.getCrossmatchComments());
		// FitToProceed
		valueObjectDest.setFitToProceed(valueObjectSrc.getFitToProceed());
		// GeneralComments
		valueObjectDest.setGeneralComments(valueObjectSrc.getGeneralComments());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPreAssessmentOutcomeVoCollectionFromPreAssessmentOutcome(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.PreAssessmentOutcome objects.
	 */
	public static ims.RefMan.vo.PreAssessmentOutcomeVoCollection createPreAssessmentOutcomeVoCollectionFromPreAssessmentOutcome(java.util.Set domainObjectSet)	
	{
		return createPreAssessmentOutcomeVoCollectionFromPreAssessmentOutcome(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.PreAssessmentOutcome objects.
	 */
	public static ims.RefMan.vo.PreAssessmentOutcomeVoCollection createPreAssessmentOutcomeVoCollectionFromPreAssessmentOutcome(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.PreAssessmentOutcomeVoCollection voList = new ims.RefMan.vo.PreAssessmentOutcomeVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.PreAssessmentOutcome domainObject = (ims.RefMan.domain.objects.PreAssessmentOutcome) iterator.next();
			ims.RefMan.vo.PreAssessmentOutcomeVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.PreAssessmentOutcome objects.
	 */
	public static ims.RefMan.vo.PreAssessmentOutcomeVoCollection createPreAssessmentOutcomeVoCollectionFromPreAssessmentOutcome(java.util.List domainObjectList) 
	{
		return createPreAssessmentOutcomeVoCollectionFromPreAssessmentOutcome(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.PreAssessmentOutcome objects.
	 */
	public static ims.RefMan.vo.PreAssessmentOutcomeVoCollection createPreAssessmentOutcomeVoCollectionFromPreAssessmentOutcome(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.PreAssessmentOutcomeVoCollection voList = new ims.RefMan.vo.PreAssessmentOutcomeVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.PreAssessmentOutcome domainObject = (ims.RefMan.domain.objects.PreAssessmentOutcome) domainObjectList.get(i);
			ims.RefMan.vo.PreAssessmentOutcomeVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.PreAssessmentOutcome set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPreAssessmentOutcomeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PreAssessmentOutcomeVoCollection voCollection) 
	 {
	 	return extractPreAssessmentOutcomeSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPreAssessmentOutcomeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PreAssessmentOutcomeVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PreAssessmentOutcomeVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.PreAssessmentOutcome domainObject = PreAssessmentOutcomeVoAssembler.extractPreAssessmentOutcome(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.PreAssessmentOutcome list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPreAssessmentOutcomeList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PreAssessmentOutcomeVoCollection voCollection) 
	 {
	 	return extractPreAssessmentOutcomeList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPreAssessmentOutcomeList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PreAssessmentOutcomeVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PreAssessmentOutcomeVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.PreAssessmentOutcome domainObject = PreAssessmentOutcomeVoAssembler.extractPreAssessmentOutcome(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.PreAssessmentOutcome object.
	 * @param domainObject ims.RefMan.domain.objects.PreAssessmentOutcome
	 */
	 public static ims.RefMan.vo.PreAssessmentOutcomeVo create(ims.RefMan.domain.objects.PreAssessmentOutcome domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.PreAssessmentOutcome object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.PreAssessmentOutcomeVo create(DomainObjectMap map, ims.RefMan.domain.objects.PreAssessmentOutcome domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.PreAssessmentOutcomeVo valueObject = (ims.RefMan.vo.PreAssessmentOutcomeVo) map.getValueObject(domainObject, ims.RefMan.vo.PreAssessmentOutcomeVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.PreAssessmentOutcomeVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.PreAssessmentOutcome
	 */
	 public static ims.RefMan.vo.PreAssessmentOutcomeVo insert(ims.RefMan.vo.PreAssessmentOutcomeVo valueObject, ims.RefMan.domain.objects.PreAssessmentOutcome domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.PreAssessmentOutcome
	 */
	 public static ims.RefMan.vo.PreAssessmentOutcomeVo insert(DomainObjectMap map, ims.RefMan.vo.PreAssessmentOutcomeVo valueObject, ims.RefMan.domain.objects.PreAssessmentOutcome domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PreAssessmentOutcome(domainObject.getId());
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
			
		// recordingInformation
		valueObject.setRecordingInformation(ims.RefMan.vo.domain.RecordingUserInformationForPreassessOutCVoAssembler.create(map, domainObject.getRecordingInformation()) );
		// lastUpdatingInformation
		valueObject.setLastUpdatingInformation(ims.RefMan.vo.domain.RecordingUserInformationForPreassessOutCVoAssembler.create(map, domainObject.getLastUpdatingInformation()) );
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
		// ProcedureDescription
		valueObject.setProcedureDescription(domainObject.getProcedureDescription());
		// ProcLaterality
		ims.domain.lookups.LookupInstance instance5 = domainObject.getProcLaterality();
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

			ims.core.vo.lookups.LateralityLRB voLookup5 = new ims.core.vo.lookups.LateralityLRB(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.LateralityLRB parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.LateralityLRB(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setProcLaterality(voLookup5);
		}
				// AnaestheticType
		ims.domain.lookups.LookupInstance instance6 = domainObject.getAnaestheticType();
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

			ims.clinical.vo.lookups.AnaestheticType voLookup6 = new ims.clinical.vo.lookups.AnaestheticType(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.clinical.vo.lookups.AnaestheticType parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.clinical.vo.lookups.AnaestheticType(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setAnaestheticType(voLookup6);
		}
				// SecondaryProcedure
		if (domainObject.getSecondaryProcedure() != null)
		{
			if(domainObject.getSecondaryProcedure() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getSecondaryProcedure();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setSecondaryProcedure(new ims.core.clinical.vo.ProcedureRefVo(id, -1));				
			}
			else
			{
				valueObject.setSecondaryProcedure(new ims.core.clinical.vo.ProcedureRefVo(domainObject.getSecondaryProcedure().getId(), domainObject.getSecondaryProcedure().getVersion()));
			}
		}
		// SecondaryDescription
		valueObject.setSecondaryDescription(domainObject.getSecondaryDescription());
		// SecondaryProcLaterality
		ims.domain.lookups.LookupInstance instance9 = domainObject.getSecondaryProcLaterality();
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
			valueObject.setSecondaryProcLaterality(voLookup9);
		}
				// Metrics
		valueObject.setMetrics(ims.RefMan.vo.domain.VSMetricsForPreassesOutcVoAssembler.create(map, domainObject.getMetrics()) );
		// PatientDiabetic
		ims.domain.lookups.LookupInstance instance11 = domainObject.getPatientDiabetic();
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

			ims.core.vo.lookups.YesNo voLookup11 = new ims.core.vo.lookups.YesNo(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.core.vo.lookups.YesNo(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setPatientDiabetic(voLookup11);
		}
				// PaceMakerDefib
		ims.domain.lookups.LookupInstance instance12 = domainObject.getPaceMakerDefib();
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
			valueObject.setPaceMakerDefib(voLookup12);
		}
				// PaceMakerType
		ims.domain.lookups.LookupInstance instance13 = domainObject.getPaceMakerType();
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

			ims.clinical.vo.lookups.PacemakerDefibrillatorType voLookup13 = new ims.clinical.vo.lookups.PacemakerDefibrillatorType(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.clinical.vo.lookups.PacemakerDefibrillatorType parentVoLookup13 = voLookup13;
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
								parentVoLookup13.setParent(new ims.clinical.vo.lookups.PacemakerDefibrillatorType(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setPaceMakerType(voLookup13);
		}
				// DateLastCheckPacemaker
		java.util.Date DateLastCheckPacemaker = domainObject.getDateLastCheckPacemaker();
		if ( null != DateLastCheckPacemaker ) 
		{
			valueObject.setDateLastCheckPacemaker(new ims.framework.utils.Date(DateLastCheckPacemaker) );
		}
		// ReceivingAntiCoag
		ims.domain.lookups.LookupInstance instance15 = domainObject.getReceivingAntiCoag();
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

			ims.core.vo.lookups.YesNoUnknown voLookup15 = new ims.core.vo.lookups.YesNoUnknown(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup15 = voLookup15;
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
								parentVoLookup15.setParent(new ims.core.vo.lookups.YesNoUnknown(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setReceivingAntiCoag(voLookup15);
		}
				// TherapyAction
		ims.domain.lookups.LookupInstance instance16 = domainObject.getTherapyAction();
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

			ims.clinical.vo.lookups.AntiCoagTherapyAction voLookup16 = new ims.clinical.vo.lookups.AntiCoagTherapyAction(instance16.getId(),instance16.getText(), instance16.isActive(), null, img, color);
			ims.clinical.vo.lookups.AntiCoagTherapyAction parentVoLookup16 = voLookup16;
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
								parentVoLookup16.setParent(new ims.clinical.vo.lookups.AntiCoagTherapyAction(parent16.getId(),parent16.getText(), parent16.isActive(), null, img, color));
				parentVoLookup16 = parentVoLookup16.getParent();
								parent16 = parent16.getParent();
			}			
			valueObject.setTherapyAction(voLookup16);
		}
				// MobilityConsideration
		valueObject.setMobilityConsideration( domainObject.isMobilityConsideration() );
		// MobilityComment
		valueObject.setMobilityComment(domainObject.getMobilityComment());
		// ElectricBedNeeded
		valueObject.setElectricBedNeeded( domainObject.isElectricBedNeeded() );
		// ShortNotice
		valueObject.setShortNotice( domainObject.isShortNotice() );
		// NoticePeriodValue
		valueObject.setNoticePeriodValue(domainObject.getNoticePeriodValue());
		// NoticePeriodType
		ims.domain.lookups.LookupInstance instance22 = domainObject.getNoticePeriodType();
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

			ims.core.vo.lookups.TimeUnitsSecondsToMonths voLookup22 = new ims.core.vo.lookups.TimeUnitsSecondsToMonths(instance22.getId(),instance22.getText(), instance22.isActive(), null, img, color);
			ims.core.vo.lookups.TimeUnitsSecondsToMonths parentVoLookup22 = voLookup22;
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
								parentVoLookup22.setParent(new ims.core.vo.lookups.TimeUnitsSecondsToMonths(parent22.getId(),parent22.getText(), parent22.isActive(), null, img, color));
				parentVoLookup22 = parentVoLookup22.getParent();
								parent22 = parent22.getParent();
			}			
			valueObject.setNoticePeriodType(voLookup22);
		}
				// PreOpOvernight
		valueObject.setPreOpOvernight( domainObject.isPreOpOvernight() );
		// Nights
		valueObject.setNights(domainObject.getNights());
		// PostOpStay
		valueObject.setPostOpStay(domainObject.getPostOpStay());
		// TheatreType
		ims.domain.lookups.LookupInstance instance26 = domainObject.getTheatreType();
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

			ims.scheduling.vo.lookups.TheatreType voLookup26 = new ims.scheduling.vo.lookups.TheatreType(instance26.getId(),instance26.getText(), instance26.isActive(), null, img, color);
			ims.scheduling.vo.lookups.TheatreType parentVoLookup26 = voLookup26;
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
								parentVoLookup26.setParent(new ims.scheduling.vo.lookups.TheatreType(parent26.getId(),parent26.getText(), parent26.isActive(), null, img, color));
				parentVoLookup26 = parentVoLookup26.getParent();
								parent26 = parent26.getParent();
			}			
			valueObject.setTheatreType(voLookup26);
		}
				// PostOpComments
		valueObject.setPostOpComments(domainObject.getPostOpComments());
		// SeniorAnaestRequired
		valueObject.setSeniorAnaestRequired( domainObject.isSeniorAnaestRequired() );
		// SeniorAnaestComments
		valueObject.setSeniorAnaestComments(domainObject.getSeniorAnaestComments());
		// CriticalCareBedRequired
		valueObject.setCriticalCareBedRequired( domainObject.isCriticalCareBedRequired() );
		// HduCriticalCareBed
		valueObject.setHduCriticalCareBed( domainObject.isHduCriticalCareBed() );
		// ItuCriticalCareBed
		valueObject.setItuCriticalCareBed( domainObject.isItuCriticalCareBed() );
		// AnaestheticHazards
		valueObject.setAnaestheticHazards(ims.core.vo.domain.PatientAlertLiteVoAssembler.createPatientAlertLiteVoCollectionFromPatientAlert(map, domainObject.getAnaestheticHazards()) );
		// WaitingForDetails
		valueObject.setWaitingForDetails(ims.RefMan.vo.domain.PreAssessmentInformationVoAssembler.createPreAssessmentInformationVoCollectionFromPreAssessmentInformation(map, domainObject.getWaitingForDetails()) );
		// DetailsOutstanding
		valueObject.setDetailsOutstanding( domainObject.isDetailsOutstanding() );
		// CrossmatchRequired
		valueObject.setCrossmatchRequired( domainObject.isCrossmatchRequired() );
		// CrossmatchComments
		valueObject.setCrossmatchComments(domainObject.getCrossmatchComments());
		// FitToProceed
		valueObject.setFitToProceed( domainObject.isFitToProceed() );
		// GeneralComments
		valueObject.setGeneralComments(domainObject.getGeneralComments());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.PreAssessmentOutcome extractPreAssessmentOutcome(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PreAssessmentOutcomeVo valueObject) 
	{
		return 	extractPreAssessmentOutcome(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.PreAssessmentOutcome extractPreAssessmentOutcome(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PreAssessmentOutcomeVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PreAssessmentOutcome();
		ims.RefMan.domain.objects.PreAssessmentOutcome domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.PreAssessmentOutcome)domMap.get(valueObject);
			}
			// ims.RefMan.vo.PreAssessmentOutcomeVo ID_PreAssessmentOutcome field is unknown
			domainObject = new ims.RefMan.domain.objects.PreAssessmentOutcome();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PreAssessmentOutcome());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.PreAssessmentOutcome)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.PreAssessmentOutcome) domainFactory.getDomainObject(ims.RefMan.domain.objects.PreAssessmentOutcome.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PreAssessmentOutcome());

		domainObject.setRecordingInformation(ims.RefMan.vo.domain.RecordingUserInformationForPreassessOutCVoAssembler.extractRecordingUserInformation(domainFactory, valueObject.getRecordingInformation(), domMap));
		domainObject.setLastUpdatingInformation(ims.RefMan.vo.domain.RecordingUserInformationForPreassessOutCVoAssembler.extractRecordingUserInformation(domainFactory, valueObject.getLastUpdatingInformation(), domMap));
		ims.core.clinical.domain.objects.Procedure value3 = null;
		if ( null != valueObject.getPrimaryProcedure() ) 
		{
			if (valueObject.getPrimaryProcedure().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrimaryProcedure()) != null)
				{
					value3 = (ims.core.clinical.domain.objects.Procedure)domMap.get(valueObject.getPrimaryProcedure());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getPrimaryProcedure();	
			}
			else
			{
				value3 = (ims.core.clinical.domain.objects.Procedure)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Procedure.class, valueObject.getPrimaryProcedure().getBoId());
			}
		}
		domainObject.setPrimaryProcedure(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getProcedureDescription() != null && valueObject.getProcedureDescription().equals(""))
		{
			valueObject.setProcedureDescription(null);
		}
		domainObject.setProcedureDescription(valueObject.getProcedureDescription());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getProcLaterality() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getProcLaterality().getID());
		}
		domainObject.setProcLaterality(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getAnaestheticType() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getAnaestheticType().getID());
		}
		domainObject.setAnaestheticType(value6);
		ims.core.clinical.domain.objects.Procedure value7 = null;
		if ( null != valueObject.getSecondaryProcedure() ) 
		{
			if (valueObject.getSecondaryProcedure().getBoId() == null)
			{
				if (domMap.get(valueObject.getSecondaryProcedure()) != null)
				{
					value7 = (ims.core.clinical.domain.objects.Procedure)domMap.get(valueObject.getSecondaryProcedure());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value7 = domainObject.getSecondaryProcedure();	
			}
			else
			{
				value7 = (ims.core.clinical.domain.objects.Procedure)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Procedure.class, valueObject.getSecondaryProcedure().getBoId());
			}
		}
		domainObject.setSecondaryProcedure(value7);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSecondaryDescription() != null && valueObject.getSecondaryDescription().equals(""))
		{
			valueObject.setSecondaryDescription(null);
		}
		domainObject.setSecondaryDescription(valueObject.getSecondaryDescription());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getSecondaryProcLaterality() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getSecondaryProcLaterality().getID());
		}
		domainObject.setSecondaryProcLaterality(value9);
		domainObject.setMetrics(ims.RefMan.vo.domain.VSMetricsForPreassesOutcVoAssembler.extractMetrics(domainFactory, valueObject.getMetrics(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getPatientDiabetic() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getPatientDiabetic().getID());
		}
		domainObject.setPatientDiabetic(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getPaceMakerDefib() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getPaceMakerDefib().getID());
		}
		domainObject.setPaceMakerDefib(value12);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getPaceMakerType() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getPaceMakerType().getID());
		}
		domainObject.setPaceMakerType(value13);
		java.util.Date value14 = null;
		ims.framework.utils.Date date14 = valueObject.getDateLastCheckPacemaker();		
		if ( date14 != null ) 
		{
			value14 = date14.getDate();
		}
		domainObject.setDateLastCheckPacemaker(value14);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getReceivingAntiCoag() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getReceivingAntiCoag().getID());
		}
		domainObject.setReceivingAntiCoag(value15);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getTherapyAction() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getTherapyAction().getID());
		}
		domainObject.setTherapyAction(value16);
		domainObject.setMobilityConsideration(valueObject.getMobilityConsideration());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getMobilityComment() != null && valueObject.getMobilityComment().equals(""))
		{
			valueObject.setMobilityComment(null);
		}
		domainObject.setMobilityComment(valueObject.getMobilityComment());
		domainObject.setElectricBedNeeded(valueObject.getElectricBedNeeded());
		domainObject.setShortNotice(valueObject.getShortNotice());
		domainObject.setNoticePeriodValue(valueObject.getNoticePeriodValue());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value22 = null;
		if ( null != valueObject.getNoticePeriodType() ) 
		{
			value22 =
				domainFactory.getLookupInstance(valueObject.getNoticePeriodType().getID());
		}
		domainObject.setNoticePeriodType(value22);
		domainObject.setPreOpOvernight(valueObject.getPreOpOvernight());
		domainObject.setNights(valueObject.getNights());
		domainObject.setPostOpStay(valueObject.getPostOpStay());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value26 = null;
		if ( null != valueObject.getTheatreType() ) 
		{
			value26 =
				domainFactory.getLookupInstance(valueObject.getTheatreType().getID());
		}
		domainObject.setTheatreType(value26);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPostOpComments() != null && valueObject.getPostOpComments().equals(""))
		{
			valueObject.setPostOpComments(null);
		}
		domainObject.setPostOpComments(valueObject.getPostOpComments());
		domainObject.setSeniorAnaestRequired(valueObject.getSeniorAnaestRequired());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSeniorAnaestComments() != null && valueObject.getSeniorAnaestComments().equals(""))
		{
			valueObject.setSeniorAnaestComments(null);
		}
		domainObject.setSeniorAnaestComments(valueObject.getSeniorAnaestComments());
		domainObject.setCriticalCareBedRequired(valueObject.getCriticalCareBedRequired());
		domainObject.setHduCriticalCareBed(valueObject.getHduCriticalCareBed());
		domainObject.setItuCriticalCareBed(valueObject.getItuCriticalCareBed());
		domainObject.setAnaestheticHazards(ims.core.vo.domain.PatientAlertLiteVoAssembler.extractPatientAlertList(domainFactory, valueObject.getAnaestheticHazards(), domainObject.getAnaestheticHazards(), domMap));		
		domainObject.setWaitingForDetails(ims.RefMan.vo.domain.PreAssessmentInformationVoAssembler.extractPreAssessmentInformationList(domainFactory, valueObject.getWaitingForDetails(), domainObject.getWaitingForDetails(), domMap));		
		domainObject.setDetailsOutstanding(valueObject.getDetailsOutstanding());
		domainObject.setCrossmatchRequired(valueObject.getCrossmatchRequired());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCrossmatchComments() != null && valueObject.getCrossmatchComments().equals(""))
		{
			valueObject.setCrossmatchComments(null);
		}
		domainObject.setCrossmatchComments(valueObject.getCrossmatchComments());
		domainObject.setFitToProceed(valueObject.getFitToProceed());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getGeneralComments() != null && valueObject.getGeneralComments().equals(""))
		{
			valueObject.setGeneralComments(null);
		}
		domainObject.setGeneralComments(valueObject.getGeneralComments());

		return domainObject;
	}

}
