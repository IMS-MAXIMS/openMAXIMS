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
 * @author Cornel Ventuneac
 */
public class PatientPathwayJourneyForTransferOfCareVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.PatientPathwayJourneyForTransferOfCareVo copy(ims.RefMan.vo.PatientPathwayJourneyForTransferOfCareVo valueObjectDest, ims.RefMan.vo.PatientPathwayJourneyForTransferOfCareVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientPathwayJourney(valueObjectSrc.getID_PatientPathwayJourney());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// Pathway
		valueObjectDest.setPathway(valueObjectSrc.getPathway());
		// PatientTargets
		valueObjectDest.setPatientTargets(valueObjectSrc.getPatientTargets());
		// Referral
		valueObjectDest.setReferral(valueObjectSrc.getReferral());
		// StartDate
		valueObjectDest.setStartDate(valueObjectSrc.getStartDate());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// StatusHistory
		valueObjectDest.setStatusHistory(valueObjectSrc.getStatusHistory());
		// EndedOnDate
		valueObjectDest.setEndedOnDate(valueObjectSrc.getEndedOnDate());
		// CurrentClock
		valueObjectDest.setCurrentClock(valueObjectSrc.getCurrentClock());
		// ClockHistory
		valueObjectDest.setClockHistory(valueObjectSrc.getClockHistory());
		// ExtReferralKey
		valueObjectDest.setExtReferralKey(valueObjectSrc.getExtReferralKey());
		// PathwayHistory
		valueObjectDest.setPathwayHistory(valueObjectSrc.getPathwayHistory());
		// ResponsibleConsultant
		valueObjectDest.setResponsibleConsultant(valueObjectSrc.getResponsibleConsultant());
		// isCancerPathway
		valueObjectDest.setIsCancerPathway(valueObjectSrc.getIsCancerPathway());
		// cancerPathwayDate
		valueObjectDest.setCancerPathwayDate(valueObjectSrc.getCancerPathwayDate());
		// LinkedComments
		valueObjectDest.setLinkedComments(valueObjectSrc.getLinkedComments());
		// LastValidationDate
		valueObjectDest.setLastValidationDate(valueObjectSrc.getLastValidationDate());
		// NextValidationDate
		valueObjectDest.setNextValidationDate(valueObjectSrc.getNextValidationDate());
		// PatientJourneyBreachReason
		valueObjectDest.setPatientJourneyBreachReason(valueObjectSrc.getPatientJourneyBreachReason());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientPathwayJourneyForTransferOfCareVoCollectionFromPatientPathwayJourney(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.pathways.domain.objects.PatientPathwayJourney objects.
	 */
	public static ims.RefMan.vo.PatientPathwayJourneyForTransferOfCareVoCollection createPatientPathwayJourneyForTransferOfCareVoCollectionFromPatientPathwayJourney(java.util.Set domainObjectSet)	
	{
		return createPatientPathwayJourneyForTransferOfCareVoCollectionFromPatientPathwayJourney(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.pathways.domain.objects.PatientPathwayJourney objects.
	 */
	public static ims.RefMan.vo.PatientPathwayJourneyForTransferOfCareVoCollection createPatientPathwayJourneyForTransferOfCareVoCollectionFromPatientPathwayJourney(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.PatientPathwayJourneyForTransferOfCareVoCollection voList = new ims.RefMan.vo.PatientPathwayJourneyForTransferOfCareVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.pathways.domain.objects.PatientPathwayJourney domainObject = (ims.pathways.domain.objects.PatientPathwayJourney) iterator.next();
			ims.RefMan.vo.PatientPathwayJourneyForTransferOfCareVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.pathways.domain.objects.PatientPathwayJourney objects.
	 */
	public static ims.RefMan.vo.PatientPathwayJourneyForTransferOfCareVoCollection createPatientPathwayJourneyForTransferOfCareVoCollectionFromPatientPathwayJourney(java.util.List domainObjectList) 
	{
		return createPatientPathwayJourneyForTransferOfCareVoCollectionFromPatientPathwayJourney(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.pathways.domain.objects.PatientPathwayJourney objects.
	 */
	public static ims.RefMan.vo.PatientPathwayJourneyForTransferOfCareVoCollection createPatientPathwayJourneyForTransferOfCareVoCollectionFromPatientPathwayJourney(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.PatientPathwayJourneyForTransferOfCareVoCollection voList = new ims.RefMan.vo.PatientPathwayJourneyForTransferOfCareVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.pathways.domain.objects.PatientPathwayJourney domainObject = (ims.pathways.domain.objects.PatientPathwayJourney) domainObjectList.get(i);
			ims.RefMan.vo.PatientPathwayJourneyForTransferOfCareVo vo = create(map, domainObject);

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
	 * Create the ims.pathways.domain.objects.PatientPathwayJourney set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientPathwayJourneySet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientPathwayJourneyForTransferOfCareVoCollection voCollection) 
	 {
	 	return extractPatientPathwayJourneySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientPathwayJourneySet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientPathwayJourneyForTransferOfCareVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientPathwayJourneyForTransferOfCareVo vo = voCollection.get(i);
			ims.pathways.domain.objects.PatientPathwayJourney domainObject = PatientPathwayJourneyForTransferOfCareVoAssembler.extractPatientPathwayJourney(domainFactory, vo, domMap);

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
	 * Create the ims.pathways.domain.objects.PatientPathwayJourney list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientPathwayJourneyList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientPathwayJourneyForTransferOfCareVoCollection voCollection) 
	 {
	 	return extractPatientPathwayJourneyList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientPathwayJourneyList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientPathwayJourneyForTransferOfCareVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientPathwayJourneyForTransferOfCareVo vo = voCollection.get(i);
			ims.pathways.domain.objects.PatientPathwayJourney domainObject = PatientPathwayJourneyForTransferOfCareVoAssembler.extractPatientPathwayJourney(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.pathways.domain.objects.PatientPathwayJourney object.
	 * @param domainObject ims.pathways.domain.objects.PatientPathwayJourney
	 */
	 public static ims.RefMan.vo.PatientPathwayJourneyForTransferOfCareVo create(ims.pathways.domain.objects.PatientPathwayJourney domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.pathways.domain.objects.PatientPathwayJourney object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.PatientPathwayJourneyForTransferOfCareVo create(DomainObjectMap map, ims.pathways.domain.objects.PatientPathwayJourney domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.PatientPathwayJourneyForTransferOfCareVo valueObject = (ims.RefMan.vo.PatientPathwayJourneyForTransferOfCareVo) map.getValueObject(domainObject, ims.RefMan.vo.PatientPathwayJourneyForTransferOfCareVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.PatientPathwayJourneyForTransferOfCareVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.pathways.domain.objects.PatientPathwayJourney
	 */
	 public static ims.RefMan.vo.PatientPathwayJourneyForTransferOfCareVo insert(ims.RefMan.vo.PatientPathwayJourneyForTransferOfCareVo valueObject, ims.pathways.domain.objects.PatientPathwayJourney domainObject) 
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
	 * @param domainObject ims.pathways.domain.objects.PatientPathwayJourney
	 */
	 public static ims.RefMan.vo.PatientPathwayJourneyForTransferOfCareVo insert(DomainObjectMap map, ims.RefMan.vo.PatientPathwayJourneyForTransferOfCareVo valueObject, ims.pathways.domain.objects.PatientPathwayJourney domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientPathwayJourney(domainObject.getId());
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
		// Pathway
		if (domainObject.getPathway() != null)
		{
			if(domainObject.getPathway() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPathway();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPathway(new ims.pathways.configuration.vo.PathwayRefVo(id, -1));				
			}
			else
			{
				valueObject.setPathway(new ims.pathways.configuration.vo.PathwayRefVo(domainObject.getPathway().getId(), domainObject.getPathway().getVersion()));
			}
		}
		// PatientTargets
		valueObject.setPatientTargets(ims.RefMan.vo.domain.PatientJournayTargetForTransferOfCareVoAssembler.createPatientJournayTargetForTransferOfCareVoCollectionFromPatientJourneyTarget(map, domainObject.getPatientTargets()) );
		// Referral
		valueObject.setReferral(ims.RefMan.vo.domain.ReferralForTransferOfCareVoAssembler.create(map, domainObject.getReferral()) );
		// StartDate
		java.util.Date StartDate = domainObject.getStartDate();
		if ( null != StartDate ) 
		{
			valueObject.setStartDate(new ims.framework.utils.Date(StartDate) );
		}
		// CurrentStatus
		valueObject.setCurrentStatus(ims.pathways.vo.domain.PatientJourneyStatusVoAssembler.create(map, domainObject.getCurrentStatus()) );
		// StatusHistory
		valueObject.setStatusHistory(ims.pathways.vo.domain.PatientJourneyStatusVoAssembler.createPatientJourneyStatusVoCollectionFromPatientJourneyStatus(map, domainObject.getStatusHistory()) );
		// EndedOnDate
		java.util.Date EndedOnDate = domainObject.getEndedOnDate();
		if ( null != EndedOnDate ) 
		{
			valueObject.setEndedOnDate(new ims.framework.utils.Date(EndedOnDate) );
		}
		// CurrentClock
		valueObject.setCurrentClock(ims.RefMan.vo.domain.PathwayClockForTransferOfCareVoAssembler.create(map, domainObject.getCurrentClock()) );
		// ClockHistory
		valueObject.setClockHistory(ims.RefMan.vo.domain.PathwayClockForTransferOfCareVoAssembler.createPathwayClockForTransferOfCareVoCollectionFromPathwayClock(map, domainObject.getClockHistory()) );
		// ExtReferralKey
		valueObject.setExtReferralKey(domainObject.getExtReferralKey());
		// PathwayHistory
		valueObject.setPathwayHistory(ims.pathways.vo.domain.PathwayHistoryVoAssembler.createPathwayHistoryVoCollectionFromPathwayHistory(map, domainObject.getPathwayHistory()) );
		// ResponsibleConsultant
		if (domainObject.getResponsibleConsultant() != null)
		{
			if(domainObject.getResponsibleConsultant() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getResponsibleConsultant();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setResponsibleConsultant(new ims.core.resource.people.vo.HcpRefVo(id, -1));				
			}
			else
			{
				valueObject.setResponsibleConsultant(new ims.core.resource.people.vo.HcpRefVo(domainObject.getResponsibleConsultant().getId(), domainObject.getResponsibleConsultant().getVersion()));
			}
		}
		// isCancerPathway
		valueObject.setIsCancerPathway( domainObject.isIsCancerPathway() );
		// cancerPathwayDate
		java.util.Date cancerPathwayDate = domainObject.getCancerPathwayDate();
		if ( null != cancerPathwayDate ) 
		{
			valueObject.setCancerPathwayDate(new ims.framework.utils.Date(cancerPathwayDate) );
		}
		// LinkedComments
		valueObject.setLinkedComments(ims.RefMan.vo.domain.PatientJourneyCommentForTransferOfCareVoAssembler.createPatientJourneyCommentForTransferOfCareVoCollectionFromPatientJourneyComment(map, domainObject.getLinkedComments()) );
		// LastValidationDate
		java.util.Date LastValidationDate = domainObject.getLastValidationDate();
		if ( null != LastValidationDate ) 
		{
			valueObject.setLastValidationDate(new ims.framework.utils.Date(LastValidationDate) );
		}
		// NextValidationDate
		java.util.Date NextValidationDate = domainObject.getNextValidationDate();
		if ( null != NextValidationDate ) 
		{
			valueObject.setNextValidationDate(new ims.framework.utils.Date(NextValidationDate) );
		}
		// PatientJourneyBreachReason
		valueObject.setPatientJourneyBreachReason(ims.RefMan.vo.domain.PatientJourneyBreachForTransferOfCareVoAssembler.createPatientJourneyBreachForTransferOfCareVoCollectionFromPatientJourneyBreach(map, domainObject.getPatientJourneyBreachReason()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.pathways.domain.objects.PatientPathwayJourney extractPatientPathwayJourney(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientPathwayJourneyForTransferOfCareVo valueObject) 
	{
		return 	extractPatientPathwayJourney(domainFactory, valueObject, new HashMap());
	}

	public static ims.pathways.domain.objects.PatientPathwayJourney extractPatientPathwayJourney(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientPathwayJourneyForTransferOfCareVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientPathwayJourney();
		ims.pathways.domain.objects.PatientPathwayJourney domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.pathways.domain.objects.PatientPathwayJourney)domMap.get(valueObject);
			}
			// ims.RefMan.vo.PatientPathwayJourneyForTransferOfCareVo ID_PatientPathwayJourney field is unknown
			domainObject = new ims.pathways.domain.objects.PatientPathwayJourney();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientPathwayJourney());
			if (domMap.get(key) != null)
			{
				return (ims.pathways.domain.objects.PatientPathwayJourney)domMap.get(key);
			}
			domainObject = (ims.pathways.domain.objects.PatientPathwayJourney) domainFactory.getDomainObject(ims.pathways.domain.objects.PatientPathwayJourney.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientPathwayJourney());

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
		ims.pathways.configuration.domain.objects.Pathway value2 = null;
		if ( null != valueObject.getPathway() ) 
		{
			if (valueObject.getPathway().getBoId() == null)
			{
				if (domMap.get(valueObject.getPathway()) != null)
				{
					value2 = (ims.pathways.configuration.domain.objects.Pathway)domMap.get(valueObject.getPathway());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getPathway();	
			}
			else
			{
				value2 = (ims.pathways.configuration.domain.objects.Pathway)domainFactory.getDomainObject(ims.pathways.configuration.domain.objects.Pathway.class, valueObject.getPathway().getBoId());
			}
		}
		domainObject.setPathway(value2);
		domainObject.setPatientTargets(ims.RefMan.vo.domain.PatientJournayTargetForTransferOfCareVoAssembler.extractPatientJourneyTargetSet(domainFactory, valueObject.getPatientTargets(), domainObject.getPatientTargets(), domMap));		
		domainObject.setReferral(ims.RefMan.vo.domain.ReferralForTransferOfCareVoAssembler.extractReferral(domainFactory, valueObject.getReferral(), domMap));
		java.util.Date value5 = null;
		ims.framework.utils.Date date5 = valueObject.getStartDate();		
		if ( date5 != null ) 
		{
			value5 = date5.getDate();
		}
		domainObject.setStartDate(value5);
		domainObject.setCurrentStatus(ims.pathways.vo.domain.PatientJourneyStatusVoAssembler.extractPatientJourneyStatus(domainFactory, valueObject.getCurrentStatus(), domMap));
		domainObject.setStatusHistory(ims.pathways.vo.domain.PatientJourneyStatusVoAssembler.extractPatientJourneyStatusSet(domainFactory, valueObject.getStatusHistory(), domainObject.getStatusHistory(), domMap));		
		java.util.Date value8 = null;
		ims.framework.utils.Date date8 = valueObject.getEndedOnDate();		
		if ( date8 != null ) 
		{
			value8 = date8.getDate();
		}
		domainObject.setEndedOnDate(value8);
		domainObject.setCurrentClock(ims.RefMan.vo.domain.PathwayClockForTransferOfCareVoAssembler.extractPathwayClock(domainFactory, valueObject.getCurrentClock(), domMap));
		domainObject.setClockHistory(ims.RefMan.vo.domain.PathwayClockForTransferOfCareVoAssembler.extractPathwayClockSet(domainFactory, valueObject.getClockHistory(), domainObject.getClockHistory(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getExtReferralKey() != null && valueObject.getExtReferralKey().equals(""))
		{
			valueObject.setExtReferralKey(null);
		}
		domainObject.setExtReferralKey(valueObject.getExtReferralKey());
		domainObject.setPathwayHistory(ims.pathways.vo.domain.PathwayHistoryVoAssembler.extractPathwayHistorySet(domainFactory, valueObject.getPathwayHistory(), domainObject.getPathwayHistory(), domMap));		
		ims.core.resource.people.domain.objects.Hcp value13 = null;
		if ( null != valueObject.getResponsibleConsultant() ) 
		{
			if (valueObject.getResponsibleConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getResponsibleConsultant()) != null)
				{
					value13 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getResponsibleConsultant());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value13 = domainObject.getResponsibleConsultant();	
			}
			else
			{
				value13 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getResponsibleConsultant().getBoId());
			}
		}
		domainObject.setResponsibleConsultant(value13);
		domainObject.setIsCancerPathway(valueObject.getIsCancerPathway());
		java.util.Date value15 = null;
		ims.framework.utils.Date date15 = valueObject.getCancerPathwayDate();		
		if ( date15 != null ) 
		{
			value15 = date15.getDate();
		}
		domainObject.setCancerPathwayDate(value15);
		domainObject.setLinkedComments(ims.RefMan.vo.domain.PatientJourneyCommentForTransferOfCareVoAssembler.extractPatientJourneyCommentList(domainFactory, valueObject.getLinkedComments(), domainObject.getLinkedComments(), domMap));		
		java.util.Date value17 = null;
		ims.framework.utils.Date date17 = valueObject.getLastValidationDate();		
		if ( date17 != null ) 
		{
			value17 = date17.getDate();
		}
		domainObject.setLastValidationDate(value17);
		java.util.Date value18 = null;
		ims.framework.utils.Date date18 = valueObject.getNextValidationDate();		
		if ( date18 != null ) 
		{
			value18 = date18.getDate();
		}
		domainObject.setNextValidationDate(value18);
		domainObject.setPatientJourneyBreachReason(ims.RefMan.vo.domain.PatientJourneyBreachForTransferOfCareVoAssembler.extractPatientJourneyBreachList(domainFactory, valueObject.getPatientJourneyBreachReason(), domainObject.getPatientJourneyBreachReason(), domMap));		

		return domainObject;
	}

}
