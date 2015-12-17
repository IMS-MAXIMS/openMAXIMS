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
public class CatsReferralMasterVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.CatsReferralMasterVo copy(ims.RefMan.vo.CatsReferralMasterVo valueObjectDest, ims.RefMan.vo.CatsReferralMasterVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CatsReferral(valueObjectSrc.getID_CatsReferral());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// ReferralDetails
		valueObjectDest.setReferralDetails(valueObjectSrc.getReferralDetails());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// LinkedReferrals
		valueObjectDest.setLinkedReferrals(valueObjectSrc.getLinkedReferrals());
		// Contract
		valueObjectDest.setContract(valueObjectSrc.getContract());
		// RTTClockImpact
		valueObjectDest.setRTTClockImpact(valueObjectSrc.getRTTClockImpact());
		// CurrentRTTStatus
		valueObjectDest.setCurrentRTTStatus(valueObjectSrc.getCurrentRTTStatus());
		// Journey
		valueObjectDest.setJourney(valueObjectSrc.getJourney());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// StatusHistory
		valueObjectDest.setStatusHistory(valueObjectSrc.getStatusHistory());
		// Urgency
		valueObjectDest.setUrgency(valueObjectSrc.getUrgency());
		// PathwayID
		valueObjectDest.setPathwayID(valueObjectSrc.getPathwayID());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCatsReferralMasterVoCollectionFromCatsReferral(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.CatsReferral objects.
	 */
	public static ims.RefMan.vo.CatsReferralMasterVoCollection createCatsReferralMasterVoCollectionFromCatsReferral(java.util.Set domainObjectSet)	
	{
		return createCatsReferralMasterVoCollectionFromCatsReferral(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.CatsReferral objects.
	 */
	public static ims.RefMan.vo.CatsReferralMasterVoCollection createCatsReferralMasterVoCollectionFromCatsReferral(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.CatsReferralMasterVoCollection voList = new ims.RefMan.vo.CatsReferralMasterVoCollection();
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
			ims.RefMan.vo.CatsReferralMasterVo vo = create(map, domainObject);
			
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
	public static ims.RefMan.vo.CatsReferralMasterVoCollection createCatsReferralMasterVoCollectionFromCatsReferral(java.util.List domainObjectList) 
	{
		return createCatsReferralMasterVoCollectionFromCatsReferral(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.CatsReferral objects.
	 */
	public static ims.RefMan.vo.CatsReferralMasterVoCollection createCatsReferralMasterVoCollectionFromCatsReferral(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.CatsReferralMasterVoCollection voList = new ims.RefMan.vo.CatsReferralMasterVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.CatsReferral domainObject = (ims.RefMan.domain.objects.CatsReferral) domainObjectList.get(i);
			ims.RefMan.vo.CatsReferralMasterVo vo = create(map, domainObject);

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
	 public static java.util.Set extractCatsReferralSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralMasterVoCollection voCollection) 
	 {
	 	return extractCatsReferralSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCatsReferralSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralMasterVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.CatsReferralMasterVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.CatsReferral domainObject = CatsReferralMasterVoAssembler.extractCatsReferral(domainFactory, vo, domMap);

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
	 public static java.util.List extractCatsReferralList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralMasterVoCollection voCollection) 
	 {
	 	return extractCatsReferralList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCatsReferralList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralMasterVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.CatsReferralMasterVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.CatsReferral domainObject = CatsReferralMasterVoAssembler.extractCatsReferral(domainFactory, vo, domMap);

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
	 public static ims.RefMan.vo.CatsReferralMasterVo create(ims.RefMan.domain.objects.CatsReferral domainObject) 
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
	  public static ims.RefMan.vo.CatsReferralMasterVo create(DomainObjectMap map, ims.RefMan.domain.objects.CatsReferral domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.CatsReferralMasterVo valueObject = (ims.RefMan.vo.CatsReferralMasterVo) map.getValueObject(domainObject, ims.RefMan.vo.CatsReferralMasterVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.CatsReferralMasterVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.RefMan.vo.CatsReferralMasterVo insert(ims.RefMan.vo.CatsReferralMasterVo valueObject, ims.RefMan.domain.objects.CatsReferral domainObject) 
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
	 public static ims.RefMan.vo.CatsReferralMasterVo insert(DomainObjectMap map, ims.RefMan.vo.CatsReferralMasterVo valueObject, ims.RefMan.domain.objects.CatsReferral domainObject) 
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
		// ReferralDetails
		valueObject.setReferralDetails(ims.clinical.vo.domain.ReferralLetterDetailsVoAssembler.create(map, domainObject.getReferralDetails()) );
		// CareContext
		valueObject.setCareContext(ims.RefMan.vo.domain.CareContextForRequestServiceShortVoAssembler.create(map, domainObject.getCareContext()) );
		// LinkedReferrals
		valueObject.setLinkedReferrals(ims.RefMan.vo.domain.LinkedCatsReferralForOutcomeVoAssembler.createLinkedCatsReferralForOutcomeVoCollectionFromLinkedCatsReferral(map, domainObject.getLinkedReferrals()) );
		// Contract
		valueObject.setContract(ims.RefMan.vo.domain.ContractConfigForReferralDetailsComponentVoAssembler.create(map, domainObject.getContract()) );
		// RTTClockImpact
		valueObject.setRTTClockImpact( domainObject.isRTTClockImpact() );
		// CurrentRTTStatus
		valueObject.setCurrentRTTStatus(ims.pathways.vo.domain.PathwayRTTStatusVoAssembler.create(map, domainObject.getCurrentRTTStatus()) );
		// Journey
		valueObject.setJourney(ims.RefMan.vo.domain.PatientPathwayJourneyForTransferOfCareVoAssembler.create(map, domainObject.getJourney()) );
		// CurrentStatus
		valueObject.setCurrentStatus(ims.RefMan.vo.domain.CatsReferralStatusVoAssembler.create(map, domainObject.getCurrentStatus()) );
		// StatusHistory
		valueObject.setStatusHistory(ims.RefMan.vo.domain.CatsReferralStatusVoAssembler.createCatsReferralStatusVoCollectionFromCATSReferralStatus(map, domainObject.getStatusHistory()) );
		// Urgency
		ims.domain.lookups.LookupInstance instance11 = domainObject.getUrgency();
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

			ims.RefMan.vo.lookups.ReferralUrgency voLookup11 = new ims.RefMan.vo.lookups.ReferralUrgency(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ReferralUrgency parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.RefMan.vo.lookups.ReferralUrgency(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setUrgency(voLookup11);
		}
				// PathwayID
		valueObject.setPathwayID(domainObject.getPathwayID());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.CatsReferral extractCatsReferral(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralMasterVo valueObject) 
	{
		return 	extractCatsReferral(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.CatsReferral extractCatsReferral(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralMasterVo valueObject, HashMap domMap) 
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
			// ims.RefMan.vo.CatsReferralMasterVo ID_CatsReferral field is unknown
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
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.ReferralLetterDetails value2 = null;
		if ( null != valueObject.getReferralDetails() ) 
		{
			if (valueObject.getReferralDetails().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferralDetails()) != null)
				{
					value2 = (ims.core.clinical.domain.objects.ReferralLetterDetails)domMap.get(valueObject.getReferralDetails());
				}
			}
			else
			{
				value2 = (ims.core.clinical.domain.objects.ReferralLetterDetails)domainFactory.getDomainObject(ims.core.clinical.domain.objects.ReferralLetterDetails.class, valueObject.getReferralDetails().getBoId());
			}
		}
		domainObject.setReferralDetails(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.CareContext value3 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value3 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else
			{
				value3 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value3);
		domainObject.setLinkedReferrals(ims.RefMan.vo.domain.LinkedCatsReferralForOutcomeVoAssembler.extractLinkedCatsReferralList(domainFactory, valueObject.getLinkedReferrals(), domainObject.getLinkedReferrals(), domMap));		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.configuration.domain.objects.ContractConfig value5 = null;
		if ( null != valueObject.getContract() ) 
		{
			if (valueObject.getContract().getBoId() == null)
			{
				if (domMap.get(valueObject.getContract()) != null)
				{
					value5 = (ims.core.configuration.domain.objects.ContractConfig)domMap.get(valueObject.getContract());
				}
			}
			else
			{
				value5 = (ims.core.configuration.domain.objects.ContractConfig)domainFactory.getDomainObject(ims.core.configuration.domain.objects.ContractConfig.class, valueObject.getContract().getBoId());
			}
		}
		domainObject.setContract(value5);
		domainObject.setRTTClockImpact(valueObject.getRTTClockImpact());
		domainObject.setCurrentRTTStatus(ims.pathways.vo.domain.PathwayRTTStatusVoAssembler.extractPathwayRTTStatus(domainFactory, valueObject.getCurrentRTTStatus(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.pathways.domain.objects.PatientPathwayJourney value8 = null;
		if ( null != valueObject.getJourney() ) 
		{
			if (valueObject.getJourney().getBoId() == null)
			{
				if (domMap.get(valueObject.getJourney()) != null)
				{
					value8 = (ims.pathways.domain.objects.PatientPathwayJourney)domMap.get(valueObject.getJourney());
				}
			}
			else
			{
				value8 = (ims.pathways.domain.objects.PatientPathwayJourney)domainFactory.getDomainObject(ims.pathways.domain.objects.PatientPathwayJourney.class, valueObject.getJourney().getBoId());
			}
		}
		domainObject.setJourney(value8);
		domainObject.setCurrentStatus(ims.RefMan.vo.domain.CatsReferralStatusVoAssembler.extractCATSReferralStatus(domainFactory, valueObject.getCurrentStatus(), domMap));
		domainObject.setStatusHistory(ims.RefMan.vo.domain.CatsReferralStatusVoAssembler.extractCATSReferralStatusSet(domainFactory, valueObject.getStatusHistory(), domainObject.getStatusHistory(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getUrgency() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getUrgency().getID());
		}
		domainObject.setUrgency(value11);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPathwayID() != null && valueObject.getPathwayID().equals(""))
		{
			valueObject.setPathwayID(null);
		}
		domainObject.setPathwayID(valueObject.getPathwayID());

		return domainObject;
	}

}
