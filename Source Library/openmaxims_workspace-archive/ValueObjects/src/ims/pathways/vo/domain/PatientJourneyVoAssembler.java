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
package ims.pathways.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Barbara Worwood
 */
public class PatientJourneyVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.pathways.vo.PatientJourneyVo copy(ims.pathways.vo.PatientJourneyVo valueObjectDest, ims.pathways.vo.PatientJourneyVo valueObjectSrc) 
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
		// TargetEndDate
		valueObjectDest.setTargetEndDate(valueObjectSrc.getTargetEndDate());
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
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientJourneyVoCollectionFromPatientPathwayJourney(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.pathways.domain.objects.PatientPathwayJourney objects.
	 */
	public static ims.pathways.vo.PatientJourneyVoCollection createPatientJourneyVoCollectionFromPatientPathwayJourney(java.util.Set domainObjectSet)	
	{
		return createPatientJourneyVoCollectionFromPatientPathwayJourney(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.pathways.domain.objects.PatientPathwayJourney objects.
	 */
	public static ims.pathways.vo.PatientJourneyVoCollection createPatientJourneyVoCollectionFromPatientPathwayJourney(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.pathways.vo.PatientJourneyVoCollection voList = new ims.pathways.vo.PatientJourneyVoCollection();
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
			ims.pathways.vo.PatientJourneyVo vo = create(map, domainObject);
			
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
	public static ims.pathways.vo.PatientJourneyVoCollection createPatientJourneyVoCollectionFromPatientPathwayJourney(java.util.List domainObjectList) 
	{
		return createPatientJourneyVoCollectionFromPatientPathwayJourney(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.pathways.domain.objects.PatientPathwayJourney objects.
	 */
	public static ims.pathways.vo.PatientJourneyVoCollection createPatientJourneyVoCollectionFromPatientPathwayJourney(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.pathways.vo.PatientJourneyVoCollection voList = new ims.pathways.vo.PatientJourneyVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.pathways.domain.objects.PatientPathwayJourney domainObject = (ims.pathways.domain.objects.PatientPathwayJourney) domainObjectList.get(i);
			ims.pathways.vo.PatientJourneyVo vo = create(map, domainObject);

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
	 public static java.util.Set extractPatientPathwayJourneySet(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PatientJourneyVoCollection voCollection) 
	 {
	 	return extractPatientPathwayJourneySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientPathwayJourneySet(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PatientJourneyVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.pathways.vo.PatientJourneyVo vo = voCollection.get(i);
			ims.pathways.domain.objects.PatientPathwayJourney domainObject = PatientJourneyVoAssembler.extractPatientPathwayJourney(domainFactory, vo, domMap);

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
	 public static java.util.List extractPatientPathwayJourneyList(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PatientJourneyVoCollection voCollection) 
	 {
	 	return extractPatientPathwayJourneyList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientPathwayJourneyList(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PatientJourneyVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.pathways.vo.PatientJourneyVo vo = voCollection.get(i);
			ims.pathways.domain.objects.PatientPathwayJourney domainObject = PatientJourneyVoAssembler.extractPatientPathwayJourney(domainFactory, vo, domMap);

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
	 public static ims.pathways.vo.PatientJourneyVo create(ims.pathways.domain.objects.PatientPathwayJourney domainObject) 
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
	  public static ims.pathways.vo.PatientJourneyVo create(DomainObjectMap map, ims.pathways.domain.objects.PatientPathwayJourney domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.pathways.vo.PatientJourneyVo valueObject = (ims.pathways.vo.PatientJourneyVo) map.getValueObject(domainObject, ims.pathways.vo.PatientJourneyVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.pathways.vo.PatientJourneyVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.pathways.vo.PatientJourneyVo insert(ims.pathways.vo.PatientJourneyVo valueObject, ims.pathways.domain.objects.PatientPathwayJourney domainObject) 
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
	 public static ims.pathways.vo.PatientJourneyVo insert(DomainObjectMap map, ims.pathways.vo.PatientJourneyVo valueObject, ims.pathways.domain.objects.PatientPathwayJourney domainObject) 
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
		valueObject.setPatient(ims.core.vo.domain.PatientShortAssembler.create(map, domainObject.getPatient()) );
		// Pathway
		valueObject.setPathway(ims.pathways.vo.domain.PathwayLiteVoAssembler.create(map, domainObject.getPathway()) );
		// PatientTargets
		ims.pathways.vo.PatientJourneyTargetRefVoCollection PatientTargets = new ims.pathways.vo.PatientJourneyTargetRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getPatientTargets().iterator(); iterator.hasNext(); ) 
		{
			ims.pathways.domain.objects.PatientJourneyTarget tmp = (ims.pathways.domain.objects.PatientJourneyTarget)iterator.next();
			if (tmp != null)
				PatientTargets.add(new ims.pathways.vo.PatientJourneyTargetRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setPatientTargets(PatientTargets);
		// Referral
		if (domainObject.getReferral() != null)
		{
			if(domainObject.getReferral() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getReferral();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setReferral(new ims.core.admin.vo.ReferralRefVo(id, -1));				
			}
			else
			{
				valueObject.setReferral(new ims.core.admin.vo.ReferralRefVo(domainObject.getReferral().getId(), domainObject.getReferral().getVersion()));
			}
		}
		// StartDate
		java.util.Date StartDate = domainObject.getStartDate();
		if ( null != StartDate ) 
		{
			valueObject.setStartDate(new ims.framework.utils.Date(StartDate) );
		}
		// CurrentStatus
		if (domainObject.getCurrentStatus() != null)
		{
			if(domainObject.getCurrentStatus() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCurrentStatus();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCurrentStatus(new ims.pathways.vo.PatientJourneyStatusRefVo(id, -1));				
			}
			else
			{
				valueObject.setCurrentStatus(new ims.pathways.vo.PatientJourneyStatusRefVo(domainObject.getCurrentStatus().getId(), domainObject.getCurrentStatus().getVersion()));
			}
		}
		// StatusHistory
		ims.pathways.vo.PatientJourneyStatusRefVoCollection StatusHistory = new ims.pathways.vo.PatientJourneyStatusRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getStatusHistory().iterator(); iterator.hasNext(); ) 
		{
			ims.pathways.domain.objects.PatientJourneyStatus tmp = (ims.pathways.domain.objects.PatientJourneyStatus)iterator.next();
			if (tmp != null)
				StatusHistory.add(new ims.pathways.vo.PatientJourneyStatusRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setStatusHistory(StatusHistory);
		// TargetEndDate
		java.util.Date TargetEndDate = domainObject.getTargetEndDate();
		if ( null != TargetEndDate ) 
		{
			valueObject.setTargetEndDate(new ims.framework.utils.Date(TargetEndDate) );
		}
		// EndedOnDate
		java.util.Date EndedOnDate = domainObject.getEndedOnDate();
		if ( null != EndedOnDate ) 
		{
			valueObject.setEndedOnDate(new ims.framework.utils.Date(EndedOnDate) );
		}
		// CurrentClock
		valueObject.setCurrentClock(ims.pathways.vo.domain.PathwayClockVoAssembler.create(map, domainObject.getCurrentClock()) );
		// ClockHistory
		valueObject.setClockHistory(ims.pathways.vo.domain.PathwayClockVoAssembler.createPathwayClockVoCollectionFromPathwayClock(map, domainObject.getClockHistory()) );
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
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.pathways.domain.objects.PatientPathwayJourney extractPatientPathwayJourney(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PatientJourneyVo valueObject) 
	{
		return 	extractPatientPathwayJourney(domainFactory, valueObject, new HashMap());
	}

	public static ims.pathways.domain.objects.PatientPathwayJourney extractPatientPathwayJourney(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PatientJourneyVo valueObject, HashMap domMap) 
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
			// ims.pathways.vo.PatientJourneyVo ID_PatientPathwayJourney field is unknown
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
	// SaveAsRefVO - treated as a refVo in extract methods
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
			else
			{
				value2 = (ims.pathways.configuration.domain.objects.Pathway)domainFactory.getDomainObject(ims.pathways.configuration.domain.objects.Pathway.class, valueObject.getPathway().getBoId());
			}
		}
		domainObject.setPathway(value2);

		ims.pathways.vo.PatientJourneyTargetRefVoCollection refCollection3 = valueObject.getPatientTargets();
		int size3 = (null == refCollection3) ? 0 : refCollection3.size();		
		java.util.Set domainPatientTargets3 = domainObject.getPatientTargets();
		if (domainPatientTargets3 == null)
		{
			domainPatientTargets3 = new java.util.HashSet();
		}
		java.util.Set newSet3  = new java.util.HashSet();
		for(int i=0; i<size3; i++) 
		{
			ims.pathways.vo.PatientJourneyTargetRefVo vo = refCollection3.get(i);					
			ims.pathways.domain.objects.PatientJourneyTarget dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.pathways.domain.objects.PatientJourneyTarget)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.pathways.domain.objects.PatientJourneyTarget)domainFactory.getDomainObject( ims.pathways.domain.objects.PatientJourneyTarget.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainPatientTargets3.contains(dom))
			{
				domainPatientTargets3.add(dom);
			}
			newSet3.add(dom);			
		}
		java.util.Set removedSet3 = new java.util.HashSet();
		java.util.Iterator iter3 = domainPatientTargets3.iterator();
		//Find out which objects need to be removed
		while (iter3.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter3.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet3.contains(o))
			{
				removedSet3.add(o);
			}
		}
		iter3 = removedSet3.iterator();
		//Remove the unwanted objects
		while (iter3.hasNext())
		{
			domainPatientTargets3.remove(iter3.next());
		}		
		
		domainObject.setPatientTargets(domainPatientTargets3);		
		ims.core.admin.domain.objects.Referral value4 = null;
		if ( null != valueObject.getReferral() ) 
		{
			if (valueObject.getReferral().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferral()) != null)
				{
					value4 = (ims.core.admin.domain.objects.Referral)domMap.get(valueObject.getReferral());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getReferral();	
			}
			else
			{
				value4 = (ims.core.admin.domain.objects.Referral)domainFactory.getDomainObject(ims.core.admin.domain.objects.Referral.class, valueObject.getReferral().getBoId());
			}
		}
		domainObject.setReferral(value4);
		java.util.Date value5 = null;
		ims.framework.utils.Date date5 = valueObject.getStartDate();		
		if ( date5 != null ) 
		{
			value5 = date5.getDate();
		}
		domainObject.setStartDate(value5);
		ims.pathways.domain.objects.PatientJourneyStatus value6 = null;
		if ( null != valueObject.getCurrentStatus() ) 
		{
			if (valueObject.getCurrentStatus().getBoId() == null)
			{
				if (domMap.get(valueObject.getCurrentStatus()) != null)
				{
					value6 = (ims.pathways.domain.objects.PatientJourneyStatus)domMap.get(valueObject.getCurrentStatus());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value6 = domainObject.getCurrentStatus();	
			}
			else
			{
				value6 = (ims.pathways.domain.objects.PatientJourneyStatus)domainFactory.getDomainObject(ims.pathways.domain.objects.PatientJourneyStatus.class, valueObject.getCurrentStatus().getBoId());
			}
		}
		domainObject.setCurrentStatus(value6);

		ims.pathways.vo.PatientJourneyStatusRefVoCollection refCollection7 = valueObject.getStatusHistory();
		int size7 = (null == refCollection7) ? 0 : refCollection7.size();		
		java.util.Set domainStatusHistory7 = domainObject.getStatusHistory();
		if (domainStatusHistory7 == null)
		{
			domainStatusHistory7 = new java.util.HashSet();
		}
		java.util.Set newSet7  = new java.util.HashSet();
		for(int i=0; i<size7; i++) 
		{
			ims.pathways.vo.PatientJourneyStatusRefVo vo = refCollection7.get(i);					
			ims.pathways.domain.objects.PatientJourneyStatus dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.pathways.domain.objects.PatientJourneyStatus)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.pathways.domain.objects.PatientJourneyStatus)domainFactory.getDomainObject( ims.pathways.domain.objects.PatientJourneyStatus.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainStatusHistory7.contains(dom))
			{
				domainStatusHistory7.add(dom);
			}
			newSet7.add(dom);			
		}
		java.util.Set removedSet7 = new java.util.HashSet();
		java.util.Iterator iter7 = domainStatusHistory7.iterator();
		//Find out which objects need to be removed
		while (iter7.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter7.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet7.contains(o))
			{
				removedSet7.add(o);
			}
		}
		iter7 = removedSet7.iterator();
		//Remove the unwanted objects
		while (iter7.hasNext())
		{
			domainStatusHistory7.remove(iter7.next());
		}		
		
		domainObject.setStatusHistory(domainStatusHistory7);		
		java.util.Date value8 = null;
		ims.framework.utils.Date date8 = valueObject.getTargetEndDate();		
		if ( date8 != null ) 
		{
			value8 = date8.getDate();
		}
		domainObject.setTargetEndDate(value8);
		java.util.Date value9 = null;
		ims.framework.utils.Date date9 = valueObject.getEndedOnDate();		
		if ( date9 != null ) 
		{
			value9 = date9.getDate();
		}
		domainObject.setEndedOnDate(value9);
		domainObject.setCurrentClock(ims.pathways.vo.domain.PathwayClockVoAssembler.extractPathwayClock(domainFactory, valueObject.getCurrentClock(), domMap));
		domainObject.setClockHistory(ims.pathways.vo.domain.PathwayClockVoAssembler.extractPathwayClockSet(domainFactory, valueObject.getClockHistory(), domainObject.getClockHistory(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getExtReferralKey() != null && valueObject.getExtReferralKey().equals(""))
		{
			valueObject.setExtReferralKey(null);
		}
		domainObject.setExtReferralKey(valueObject.getExtReferralKey());
		domainObject.setPathwayHistory(ims.pathways.vo.domain.PathwayHistoryVoAssembler.extractPathwayHistorySet(domainFactory, valueObject.getPathwayHistory(), domainObject.getPathwayHistory(), domMap));		
		ims.core.resource.people.domain.objects.Hcp value14 = null;
		if ( null != valueObject.getResponsibleConsultant() ) 
		{
			if (valueObject.getResponsibleConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getResponsibleConsultant()) != null)
				{
					value14 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getResponsibleConsultant());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value14 = domainObject.getResponsibleConsultant();	
			}
			else
			{
				value14 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getResponsibleConsultant().getBoId());
			}
		}
		domainObject.setResponsibleConsultant(value14);

		return domainObject;
	}

}
