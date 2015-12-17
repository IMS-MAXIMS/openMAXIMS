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
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class CatsReferralForReferralTriageVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.CatsReferralForReferralTriageVo copy(ims.RefMan.vo.CatsReferralForReferralTriageVo valueObjectDest, ims.RefMan.vo.CatsReferralForReferralTriageVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CatsReferral(valueObjectSrc.getID_CatsReferral());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// ReferralDocuments
		valueObjectDest.setReferralDocuments(valueObjectSrc.getReferralDocuments());
		// ReferralDetails
		valueObjectDest.setReferralDetails(valueObjectSrc.getReferralDetails());
		// isCAB
		valueObjectDest.setIsCAB(valueObjectSrc.getIsCAB());
		// Urgency
		valueObjectDest.setUrgency(valueObjectSrc.getUrgency());
		// TriageDateTime
		valueObjectDest.setTriageDateTime(valueObjectSrc.getTriageDateTime());
		// isAcceptedOnCAB
		valueObjectDest.setIsAcceptedOnCAB(valueObjectSrc.getIsAcceptedOnCAB());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// StatusHistory
		valueObjectDest.setStatusHistory(valueObjectSrc.getStatusHistory());
		// TriageOutcome
		valueObjectDest.setTriageOutcome(valueObjectSrc.getTriageOutcome());
		// RejectReferralDetail
		valueObjectDest.setRejectReferralDetail(valueObjectSrc.getRejectReferralDetail());
		// AwaitingClinicalInfo
		valueObjectDest.setAwaitingClinicalInfo(valueObjectSrc.getAwaitingClinicalInfo());
		// Appointments
		valueObjectDest.setAppointments(valueObjectSrc.getAppointments());
		// isAwaitingClinicalInfo
		valueObjectDest.setIsAwaitingClinicalInfo(valueObjectSrc.getIsAwaitingClinicalInfo());
		// ConsultationActivityRequired
		valueObjectDest.setConsultationActivityRequired(valueObjectSrc.getConsultationActivityRequired());
		// PathwayID
		valueObjectDest.setPathwayID(valueObjectSrc.getPathwayID());
		// RTTClockImpact
		valueObjectDest.setRTTClockImpact(valueObjectSrc.getRTTClockImpact());
		// Contract
		valueObjectDest.setContract(valueObjectSrc.getContract());
		// changeCBAppointment
		valueObjectDest.setChangeCBAppointment(valueObjectSrc.getChangeCBAppointment());
		// redirectCAB
		valueObjectDest.setRedirectCAB(valueObjectSrc.getRedirectCAB());
		// ChangeCABOPAandDirectToList
		valueObjectDest.setChangeCABOPAandDirectToList(valueObjectSrc.getChangeCABOPAandDirectToList());
		// CABOPAandDirectToList
		valueObjectDest.setCABOPAandDirectToList(valueObjectSrc.getCABOPAandDirectToList());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCatsReferralForReferralTriageVoCollectionFromCatsReferral(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.CatsReferral objects.
	 */
	public static ims.RefMan.vo.CatsReferralForReferralTriageVoCollection createCatsReferralForReferralTriageVoCollectionFromCatsReferral(java.util.Set domainObjectSet)	
	{
		return createCatsReferralForReferralTriageVoCollectionFromCatsReferral(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.CatsReferral objects.
	 */
	public static ims.RefMan.vo.CatsReferralForReferralTriageVoCollection createCatsReferralForReferralTriageVoCollectionFromCatsReferral(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.CatsReferralForReferralTriageVoCollection voList = new ims.RefMan.vo.CatsReferralForReferralTriageVoCollection();
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
			ims.RefMan.vo.CatsReferralForReferralTriageVo vo = create(map, domainObject);
			
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
	public static ims.RefMan.vo.CatsReferralForReferralTriageVoCollection createCatsReferralForReferralTriageVoCollectionFromCatsReferral(java.util.List domainObjectList) 
	{
		return createCatsReferralForReferralTriageVoCollectionFromCatsReferral(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.CatsReferral objects.
	 */
	public static ims.RefMan.vo.CatsReferralForReferralTriageVoCollection createCatsReferralForReferralTriageVoCollectionFromCatsReferral(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.CatsReferralForReferralTriageVoCollection voList = new ims.RefMan.vo.CatsReferralForReferralTriageVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.CatsReferral domainObject = (ims.RefMan.domain.objects.CatsReferral) domainObjectList.get(i);
			ims.RefMan.vo.CatsReferralForReferralTriageVo vo = create(map, domainObject);

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
	 public static java.util.Set extractCatsReferralSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralForReferralTriageVoCollection voCollection) 
	 {
	 	return extractCatsReferralSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCatsReferralSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralForReferralTriageVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.CatsReferralForReferralTriageVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.CatsReferral domainObject = CatsReferralForReferralTriageVoAssembler.extractCatsReferral(domainFactory, vo, domMap);

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
	 public static java.util.List extractCatsReferralList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralForReferralTriageVoCollection voCollection) 
	 {
	 	return extractCatsReferralList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCatsReferralList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralForReferralTriageVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.CatsReferralForReferralTriageVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.CatsReferral domainObject = CatsReferralForReferralTriageVoAssembler.extractCatsReferral(domainFactory, vo, domMap);

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
	 public static ims.RefMan.vo.CatsReferralForReferralTriageVo create(ims.RefMan.domain.objects.CatsReferral domainObject) 
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
	  public static ims.RefMan.vo.CatsReferralForReferralTriageVo create(DomainObjectMap map, ims.RefMan.domain.objects.CatsReferral domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.CatsReferralForReferralTriageVo valueObject = (ims.RefMan.vo.CatsReferralForReferralTriageVo) map.getValueObject(domainObject, ims.RefMan.vo.CatsReferralForReferralTriageVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.CatsReferralForReferralTriageVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.RefMan.vo.CatsReferralForReferralTriageVo insert(ims.RefMan.vo.CatsReferralForReferralTriageVo valueObject, ims.RefMan.domain.objects.CatsReferral domainObject) 
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
	 public static ims.RefMan.vo.CatsReferralForReferralTriageVo insert(DomainObjectMap map, ims.RefMan.vo.CatsReferralForReferralTriageVo valueObject, ims.RefMan.domain.objects.CatsReferral domainObject) 
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
		// ReferralDocuments
		valueObject.setReferralDocuments(ims.RefMan.vo.domain.PatientDocumentForReferralTriageVoAssembler.createPatientDocumentForReferralTriageVoCollectionFromPatientDocument(map, domainObject.getReferralDocuments()) );
		// ReferralDetails
		valueObject.setReferralDetails(ims.RefMan.vo.domain.ReferralDetailsForReferralTriageVoAssembler.create(map, domainObject.getReferralDetails()) );
		// isCAB
		valueObject.setIsCAB( domainObject.isIsCAB() );
		// Urgency
		ims.domain.lookups.LookupInstance instance5 = domainObject.getUrgency();
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

			ims.RefMan.vo.lookups.ReferralUrgency voLookup5 = new ims.RefMan.vo.lookups.ReferralUrgency(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ReferralUrgency parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.RefMan.vo.lookups.ReferralUrgency(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setUrgency(voLookup5);
		}
				// TriageDateTime
		java.util.Date TriageDateTime = domainObject.getTriageDateTime();
		if ( null != TriageDateTime ) 
		{
			valueObject.setTriageDateTime(new ims.framework.utils.DateTime(TriageDateTime) );
		}
		// isAcceptedOnCAB
		valueObject.setIsAcceptedOnCAB( domainObject.isIsAcceptedOnCAB() );
		// CurrentStatus
		valueObject.setCurrentStatus(ims.RefMan.vo.domain.CatsReferralStatusVoAssembler.create(map, domainObject.getCurrentStatus()) );
		// StatusHistory
		valueObject.setStatusHistory(ims.RefMan.vo.domain.CatsReferralStatusVoAssembler.createCatsReferralStatusVoCollectionFromCATSReferralStatus(map, domainObject.getStatusHistory()) );
		// TriageOutcome
		valueObject.setTriageOutcome(ims.RefMan.vo.domain.TriageOutcomeVoAssembler.create(map, domainObject.getTriageOutcome()) );
		// RejectReferralDetail
		valueObject.setRejectReferralDetail(ims.RefMan.vo.domain.RejectReferralVoAssembler.create(map, domainObject.getRejectReferralDetail()) );
		// AwaitingClinicalInfo
		valueObject.setAwaitingClinicalInfo(ims.RefMan.vo.domain.AwaitingClinicalInfoVoAssembler.create(map, domainObject.getAwaitingClinicalInfo()) );
		// Appointments
		valueObject.setAppointments(ims.RefMan.vo.domain.BookAppointmentForReferralTriageVoAssembler.createBookAppointmentForReferralTriageVoCollectionFromBooking_Appointment(map, domainObject.getAppointments()) );
		// isAwaitingClinicalInfo
		valueObject.setIsAwaitingClinicalInfo( domainObject.isIsAwaitingClinicalInfo() );
		// ConsultationActivityRequired
		valueObject.setConsultationActivityRequired( domainObject.isConsultationActivityRequired() );
		// PathwayID
		valueObject.setPathwayID(domainObject.getPathwayID());
		// RTTClockImpact
		valueObject.setRTTClockImpact( domainObject.isRTTClockImpact() );
		// Contract
		if (domainObject.getContract() != null)
		{
			if(domainObject.getContract() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getContract();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setContract(new ims.core.configuration.vo.ContractConfigRefVo(id, -1));				
			}
			else
			{
				valueObject.setContract(new ims.core.configuration.vo.ContractConfigRefVo(domainObject.getContract().getId(), domainObject.getContract().getVersion()));
			}
		}
		// changeCBAppointment
		valueObject.setChangeCBAppointment( domainObject.isChangeCBAppointment() );
		// redirectCAB
		valueObject.setRedirectCAB( domainObject.isRedirectCAB() );
		// ChangeCABOPAandDirectToList
		valueObject.setChangeCABOPAandDirectToList( domainObject.isChangeCABOPAandDirectToList() );
		// CABOPAandDirectToList
		valueObject.setCABOPAandDirectToList( domainObject.isCABOPAandDirectToList() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.CatsReferral extractCatsReferral(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralForReferralTriageVo valueObject) 
	{
		return 	extractCatsReferral(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.CatsReferral extractCatsReferral(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralForReferralTriageVo valueObject, HashMap domMap) 
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
			// ims.RefMan.vo.CatsReferralForReferralTriageVo ID_CatsReferral field is unknown
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

		// SaveAsRefVO treated as RefValueObject
		ims.core.documents.vo.PatientDocumentRefVoCollection refCollection2 = new ims.core.documents.vo.PatientDocumentRefVoCollection();
		if (valueObject.getReferralDocuments() != null)
		{
			for (int i2=0; i2<valueObject.getReferralDocuments().size(); i2++)
			{
				ims.core.documents.vo.PatientDocumentRefVo ref2 = (ims.core.documents.vo.PatientDocumentRefVo)valueObject.getReferralDocuments().get(i2);
				refCollection2.add(ref2);
			}
		}
		int size2 = (null == refCollection2) ? 0 : refCollection2.size();		
		java.util.Set domainReferralDocuments2 = domainObject.getReferralDocuments();
		if (domainReferralDocuments2 == null)
		{
			domainReferralDocuments2 = new java.util.HashSet();
		}
		java.util.Set newSet2  = new java.util.HashSet();
		for(int i=0; i<size2; i++) 
		{
			ims.core.documents.vo.PatientDocumentRefVo vo = refCollection2.get(i);					
			ims.core.documents.domain.objects.PatientDocument dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.documents.domain.objects.PatientDocument)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.documents.domain.objects.PatientDocument)domainFactory.getDomainObject( ims.core.documents.domain.objects.PatientDocument.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainReferralDocuments2.contains(dom))
			{
				domainReferralDocuments2.add(dom);
			}
			newSet2.add(dom);			
		}
		java.util.Set removedSet2 = new java.util.HashSet();
		java.util.Iterator iter2 = domainReferralDocuments2.iterator();
		//Find out which objects need to be removed
		while (iter2.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter2.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet2.contains(o))
			{
				removedSet2.add(o);
			}
		}
		iter2 = removedSet2.iterator();
		//Remove the unwanted objects
		while (iter2.hasNext())
		{
			domainReferralDocuments2.remove(iter2.next());
		}		
		
		domainObject.setReferralDocuments(domainReferralDocuments2);		
		domainObject.setReferralDetails(ims.RefMan.vo.domain.ReferralDetailsForReferralTriageVoAssembler.extractReferralLetterDetails(domainFactory, valueObject.getReferralDetails(), domMap));
		domainObject.setIsCAB(valueObject.getIsCAB());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getUrgency() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getUrgency().getID());
		}
		domainObject.setUrgency(value5);
		ims.framework.utils.DateTime dateTime6 = valueObject.getTriageDateTime();
		java.util.Date value6 = null;
		if ( dateTime6 != null ) 
		{
			value6 = dateTime6.getJavaDate();
		}
		domainObject.setTriageDateTime(value6);
		domainObject.setIsAcceptedOnCAB(valueObject.getIsAcceptedOnCAB());
		domainObject.setCurrentStatus(ims.RefMan.vo.domain.CatsReferralStatusVoAssembler.extractCATSReferralStatus(domainFactory, valueObject.getCurrentStatus(), domMap));
		domainObject.setStatusHistory(ims.RefMan.vo.domain.CatsReferralStatusVoAssembler.extractCATSReferralStatusSet(domainFactory, valueObject.getStatusHistory(), domainObject.getStatusHistory(), domMap));		
		domainObject.setTriageOutcome(ims.RefMan.vo.domain.TriageOutcomeVoAssembler.extractTriageOutcome(domainFactory, valueObject.getTriageOutcome(), domMap));
		domainObject.setRejectReferralDetail(ims.RefMan.vo.domain.RejectReferralVoAssembler.extractReferralReject(domainFactory, valueObject.getRejectReferralDetail(), domMap));
		domainObject.setAwaitingClinicalInfo(ims.RefMan.vo.domain.AwaitingClinicalInfoVoAssembler.extractAwaitingClinicalInfo(domainFactory, valueObject.getAwaitingClinicalInfo(), domMap));

		// SaveAsRefVO treated as RefValueObject
		ims.scheduling.vo.Booking_AppointmentRefVoCollection refCollection13 = new ims.scheduling.vo.Booking_AppointmentRefVoCollection();
		if (valueObject.getAppointments() != null)
		{
			for (int i13=0; i13<valueObject.getAppointments().size(); i13++)
			{
				ims.scheduling.vo.Booking_AppointmentRefVo ref13 = (ims.scheduling.vo.Booking_AppointmentRefVo)valueObject.getAppointments().get(i13);
				refCollection13.add(ref13);
			}
		}
		int size13 = (null == refCollection13) ? 0 : refCollection13.size();		
		java.util.Set domainAppointments13 = domainObject.getAppointments();
		if (domainAppointments13 == null)
		{
			domainAppointments13 = new java.util.HashSet();
		}
		java.util.Set newSet13  = new java.util.HashSet();
		for(int i=0; i<size13; i++) 
		{
			ims.scheduling.vo.Booking_AppointmentRefVo vo = refCollection13.get(i);					
			ims.scheduling.domain.objects.Booking_Appointment dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.scheduling.domain.objects.Booking_Appointment)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.scheduling.domain.objects.Booking_Appointment)domainFactory.getDomainObject( ims.scheduling.domain.objects.Booking_Appointment.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainAppointments13.contains(dom))
			{
				domainAppointments13.add(dom);
			}
			newSet13.add(dom);			
		}
		java.util.Set removedSet13 = new java.util.HashSet();
		java.util.Iterator iter13 = domainAppointments13.iterator();
		//Find out which objects need to be removed
		while (iter13.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter13.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet13.contains(o))
			{
				removedSet13.add(o);
			}
		}
		iter13 = removedSet13.iterator();
		//Remove the unwanted objects
		while (iter13.hasNext())
		{
			domainAppointments13.remove(iter13.next());
		}		
		
		domainObject.setAppointments(domainAppointments13);		
		domainObject.setIsAwaitingClinicalInfo(valueObject.getIsAwaitingClinicalInfo());
		domainObject.setConsultationActivityRequired(valueObject.getConsultationActivityRequired());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPathwayID() != null && valueObject.getPathwayID().equals(""))
		{
			valueObject.setPathwayID(null);
		}
		domainObject.setPathwayID(valueObject.getPathwayID());
		domainObject.setRTTClockImpact(valueObject.getRTTClockImpact());
		ims.core.configuration.domain.objects.ContractConfig value18 = null;
		if ( null != valueObject.getContract() ) 
		{
			if (valueObject.getContract().getBoId() == null)
			{
				if (domMap.get(valueObject.getContract()) != null)
				{
					value18 = (ims.core.configuration.domain.objects.ContractConfig)domMap.get(valueObject.getContract());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value18 = domainObject.getContract();	
			}
			else
			{
				value18 = (ims.core.configuration.domain.objects.ContractConfig)domainFactory.getDomainObject(ims.core.configuration.domain.objects.ContractConfig.class, valueObject.getContract().getBoId());
			}
		}
		domainObject.setContract(value18);
		domainObject.setChangeCBAppointment(valueObject.getChangeCBAppointment());
		domainObject.setRedirectCAB(valueObject.getRedirectCAB());
		domainObject.setChangeCABOPAandDirectToList(valueObject.getChangeCABOPAandDirectToList());
		domainObject.setCABOPAandDirectToList(valueObject.getCABOPAandDirectToList());

		return domainObject;
	}

}
