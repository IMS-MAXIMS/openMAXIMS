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
 * @author George Cristian Josan
 */
public class CATSReferral_ClockImpactVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.CATSReferral_ClockImpactVo copy(ims.RefMan.vo.CATSReferral_ClockImpactVo valueObjectDest, ims.RefMan.vo.CATSReferral_ClockImpactVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CatsReferral(valueObjectSrc.getID_CatsReferral());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// Journey
		valueObjectDest.setJourney(valueObjectSrc.getJourney());
		// PathwayID
		valueObjectDest.setPathwayID(valueObjectSrc.getPathwayID());
		// RTTClockImpact
		valueObjectDest.setRTTClockImpact(valueObjectSrc.getRTTClockImpact());
		// CurrentRTTStatus
		valueObjectDest.setCurrentRTTStatus(valueObjectSrc.getCurrentRTTStatus());
		// Urgency
		valueObjectDest.setUrgency(valueObjectSrc.getUrgency());
		// RTTClockImpacts
		valueObjectDest.setRTTClockImpacts(valueObjectSrc.getRTTClockImpacts());
		// EndOfCareDate
		valueObjectDest.setEndOfCareDate(valueObjectSrc.getEndOfCareDate());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// StatusHistory
		valueObjectDest.setStatusHistory(valueObjectSrc.getStatusHistory());
		// DOS
		valueObjectDest.setDOS(valueObjectSrc.getDOS());
		// ReferralDetails
		valueObjectDest.setReferralDetails(valueObjectSrc.getReferralDetails());
		// Contract
		valueObjectDest.setContract(valueObjectSrc.getContract());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCATSReferral_ClockImpactVoCollectionFromCatsReferral(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.CatsReferral objects.
	 */
	public static ims.RefMan.vo.CATSReferral_ClockImpactVoCollection createCATSReferral_ClockImpactVoCollectionFromCatsReferral(java.util.Set domainObjectSet)	
	{
		return createCATSReferral_ClockImpactVoCollectionFromCatsReferral(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.CatsReferral objects.
	 */
	public static ims.RefMan.vo.CATSReferral_ClockImpactVoCollection createCATSReferral_ClockImpactVoCollectionFromCatsReferral(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.CATSReferral_ClockImpactVoCollection voList = new ims.RefMan.vo.CATSReferral_ClockImpactVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.CatsReferral domainObject = (ims.RefMan.domain.objects.CatsReferral) iterator.next();
			ims.RefMan.vo.CATSReferral_ClockImpactVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.CatsReferral objects.
	 */
	public static ims.RefMan.vo.CATSReferral_ClockImpactVoCollection createCATSReferral_ClockImpactVoCollectionFromCatsReferral(java.util.List domainObjectList) 
	{
		return createCATSReferral_ClockImpactVoCollectionFromCatsReferral(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.CatsReferral objects.
	 */
	public static ims.RefMan.vo.CATSReferral_ClockImpactVoCollection createCATSReferral_ClockImpactVoCollectionFromCatsReferral(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.CATSReferral_ClockImpactVoCollection voList = new ims.RefMan.vo.CATSReferral_ClockImpactVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.CatsReferral domainObject = (ims.RefMan.domain.objects.CatsReferral) domainObjectList.get(i);
			ims.RefMan.vo.CATSReferral_ClockImpactVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.CatsReferral set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractCatsReferralSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CATSReferral_ClockImpactVoCollection voCollection) 
	 {
	 	return extractCatsReferralSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCatsReferralSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CATSReferral_ClockImpactVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.CATSReferral_ClockImpactVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.CatsReferral domainObject = CATSReferral_ClockImpactVoAssembler.extractCatsReferral(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.CatsReferral list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractCatsReferralList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CATSReferral_ClockImpactVoCollection voCollection) 
	 {
	 	return extractCatsReferralList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCatsReferralList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CATSReferral_ClockImpactVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.CATSReferral_ClockImpactVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.CatsReferral domainObject = CATSReferral_ClockImpactVoAssembler.extractCatsReferral(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.CatsReferral object.
	 * @param domainObject ims.RefMan.domain.objects.CatsReferral
	 */
	 public static ims.RefMan.vo.CATSReferral_ClockImpactVo create(ims.RefMan.domain.objects.CatsReferral domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.CatsReferral object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.CATSReferral_ClockImpactVo create(DomainObjectMap map, ims.RefMan.domain.objects.CatsReferral domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.CATSReferral_ClockImpactVo valueObject = (ims.RefMan.vo.CATSReferral_ClockImpactVo) map.getValueObject(domainObject, ims.RefMan.vo.CATSReferral_ClockImpactVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.CATSReferral_ClockImpactVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.CatsReferral
	 */
	 public static ims.RefMan.vo.CATSReferral_ClockImpactVo insert(ims.RefMan.vo.CATSReferral_ClockImpactVo valueObject, ims.RefMan.domain.objects.CatsReferral domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.CatsReferral
	 */
	 public static ims.RefMan.vo.CATSReferral_ClockImpactVo insert(DomainObjectMap map, ims.RefMan.vo.CATSReferral_ClockImpactVo valueObject, ims.RefMan.domain.objects.CatsReferral domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_CatsReferral(domainObject.getId());
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
		// Journey
		valueObject.setJourney(ims.pathways.vo.domain.PatientJourneyVoAssembler.create(map, domainObject.getJourney()) );
		// PathwayID
		valueObject.setPathwayID(domainObject.getPathwayID());
		// RTTClockImpact
		valueObject.setRTTClockImpact( domainObject.isRTTClockImpact() );
		// CurrentRTTStatus
		valueObject.setCurrentRTTStatus(ims.pathways.vo.domain.PathwayRTTStatusVoAssembler.create(map, domainObject.getCurrentRTTStatus()) );
		// Urgency
		ims.domain.lookups.LookupInstance instance6 = domainObject.getUrgency();
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

			ims.RefMan.vo.lookups.ReferralUrgency voLookup6 = new ims.RefMan.vo.lookups.ReferralUrgency(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ReferralUrgency parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.RefMan.vo.lookups.ReferralUrgency(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setUrgency(voLookup6);
		}
				// RTTClockImpacts
		valueObject.setRTTClockImpacts(ims.pathways.vo.domain.PathwayRTTClockImpactVoAssembler.createPathwayRTTClockImpactVoCollectionFromPathwaysRTTClockImpact(map, domainObject.getRTTClockImpacts()) );
		// EndOfCareDate
		java.util.Date EndOfCareDate = domainObject.getEndOfCareDate();
		if ( null != EndOfCareDate ) 
		{
			valueObject.setEndOfCareDate(new ims.framework.utils.Date(EndOfCareDate) );
		}
		// CurrentStatus
		valueObject.setCurrentStatus(ims.RefMan.vo.domain.CatsReferralStatusVoAssembler.create(map, domainObject.getCurrentStatus()) );
		// StatusHistory
		ims.RefMan.vo.CATSReferralStatusRefVoCollection StatusHistory = new ims.RefMan.vo.CATSReferralStatusRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getStatusHistory().iterator(); iterator.hasNext(); ) 
		{
			ims.RefMan.domain.objects.CATSReferralStatus tmp = (ims.RefMan.domain.objects.CATSReferralStatus)iterator.next();
			if (tmp != null)
				StatusHistory.add(new ims.RefMan.vo.CATSReferralStatusRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setStatusHistory(StatusHistory);
		// DOS
		valueObject.setDOS(ims.scheduling.vo.domain.DirectoryOfServiceLiteVoAssembler.create(map, domainObject.getDOS()) );
		// ReferralDetails
		valueObject.setReferralDetails(ims.RefMan.vo.domain.ReferralLetterDetailsLiteVoAssembler.create(map, domainObject.getReferralDetails()) );
		// Contract
		valueObject.setContract(ims.RefMan.vo.domain.ContractConfigShortVoAssembler.create(map, domainObject.getContract()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.CatsReferral extractCatsReferral(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CATSReferral_ClockImpactVo valueObject) 
	{
		return 	extractCatsReferral(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.CatsReferral extractCatsReferral(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CATSReferral_ClockImpactVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_CatsReferral();
		ims.RefMan.domain.objects.CatsReferral domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.CatsReferral)domMap.get(valueObject);
			}
			// ims.RefMan.vo.CATSReferral_ClockImpactVo ID_CatsReferral field is unknown
			domainObject = new ims.RefMan.domain.objects.CatsReferral();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_CatsReferral());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.CatsReferral)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.CatsReferral) domainFactory.getDomainObject(ims.RefMan.domain.objects.CatsReferral.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_CatsReferral());

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
		domainObject.setJourney(ims.pathways.vo.domain.PatientJourneyVoAssembler.extractPatientPathwayJourney(domainFactory, valueObject.getJourney(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPathwayID() != null && valueObject.getPathwayID().equals(""))
		{
			valueObject.setPathwayID(null);
		}
		domainObject.setPathwayID(valueObject.getPathwayID());
		domainObject.setRTTClockImpact(valueObject.getRTTClockImpact());
		domainObject.setCurrentRTTStatus(ims.pathways.vo.domain.PathwayRTTStatusVoAssembler.extractPathwayRTTStatus(domainFactory, valueObject.getCurrentRTTStatus(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getUrgency() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getUrgency().getID());
		}
		domainObject.setUrgency(value6);
		domainObject.setRTTClockImpacts(ims.pathways.vo.domain.PathwayRTTClockImpactVoAssembler.extractPathwaysRTTClockImpactList(domainFactory, valueObject.getRTTClockImpacts(), domainObject.getRTTClockImpacts(), domMap));		
		java.util.Date value8 = null;
		ims.framework.utils.Date date8 = valueObject.getEndOfCareDate();		
		if ( date8 != null ) 
		{
			value8 = date8.getDate();
		}
		domainObject.setEndOfCareDate(value8);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.RefMan.domain.objects.CATSReferralStatus value9 = null;
		if ( null != valueObject.getCurrentStatus() ) 
		{
			if (valueObject.getCurrentStatus().getBoId() == null)
			{
				if (domMap.get(valueObject.getCurrentStatus()) != null)
				{
					value9 = (ims.RefMan.domain.objects.CATSReferralStatus)domMap.get(valueObject.getCurrentStatus());
				}
			}
			else
			{
				value9 = (ims.RefMan.domain.objects.CATSReferralStatus)domainFactory.getDomainObject(ims.RefMan.domain.objects.CATSReferralStatus.class, valueObject.getCurrentStatus().getBoId());
			}
		}
		domainObject.setCurrentStatus(value9);

		ims.RefMan.vo.CATSReferralStatusRefVoCollection refCollection10 = valueObject.getStatusHistory();
		int size10 = (null == refCollection10) ? 0 : refCollection10.size();		
		java.util.Set domainStatusHistory10 = domainObject.getStatusHistory();
		if (domainStatusHistory10 == null)
		{
			domainStatusHistory10 = new java.util.HashSet();
		}
		java.util.Set newSet10  = new java.util.HashSet();
		for(int i=0; i<size10; i++) 
		{
			ims.RefMan.vo.CATSReferralStatusRefVo vo = refCollection10.get(i);					
			ims.RefMan.domain.objects.CATSReferralStatus dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.RefMan.domain.objects.CATSReferralStatus)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.RefMan.domain.objects.CATSReferralStatus)domainFactory.getDomainObject( ims.RefMan.domain.objects.CATSReferralStatus.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainStatusHistory10.contains(dom))
			{
				domainStatusHistory10.add(dom);
			}
			newSet10.add(dom);			
		}
		java.util.Set removedSet10 = new java.util.HashSet();
		java.util.Iterator iter10 = domainStatusHistory10.iterator();
		//Find out which objects need to be removed
		while (iter10.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter10.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet10.contains(o))
			{
				removedSet10.add(o);
			}
		}
		iter10 = removedSet10.iterator();
		//Remove the unwanted objects
		while (iter10.hasNext())
		{
			domainStatusHistory10.remove(iter10.next());
		}		
		
		domainObject.setStatusHistory(domainStatusHistory10);		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.scheduling.domain.objects.DirectoryofService value11 = null;
		if ( null != valueObject.getDOS() ) 
		{
			if (valueObject.getDOS().getBoId() == null)
			{
				if (domMap.get(valueObject.getDOS()) != null)
				{
					value11 = (ims.scheduling.domain.objects.DirectoryofService)domMap.get(valueObject.getDOS());
				}
			}
			else
			{
				value11 = (ims.scheduling.domain.objects.DirectoryofService)domainFactory.getDomainObject(ims.scheduling.domain.objects.DirectoryofService.class, valueObject.getDOS().getBoId());
			}
		}
		domainObject.setDOS(value11);
		domainObject.setReferralDetails(ims.RefMan.vo.domain.ReferralLetterDetailsLiteVoAssembler.extractReferralLetterDetails(domainFactory, valueObject.getReferralDetails(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.configuration.domain.objects.ContractConfig value13 = null;
		if ( null != valueObject.getContract() ) 
		{
			if (valueObject.getContract().getBoId() == null)
			{
				if (domMap.get(valueObject.getContract()) != null)
				{
					value13 = (ims.core.configuration.domain.objects.ContractConfig)domMap.get(valueObject.getContract());
				}
			}
			else
			{
				value13 = (ims.core.configuration.domain.objects.ContractConfig)domainFactory.getDomainObject(ims.core.configuration.domain.objects.ContractConfig.class, valueObject.getContract().getBoId());
			}
		}
		domainObject.setContract(value13);

		return domainObject;
	}

}
