/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 16/04/2014, 12:32
 *
 */
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Barbara Worwood
 */
public class CatsReferralVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.CatsReferralVo copy(ims.RefMan.vo.CatsReferralVo valueObjectDest, ims.RefMan.vo.CatsReferralVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CatsReferral(valueObjectSrc.getID_CatsReferral());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// ICABReferral
		valueObjectDest.setICABReferral(valueObjectSrc.getICABReferral());
		// ReferralDetails
		valueObjectDest.setReferralDetails(valueObjectSrc.getReferralDetails());
		// InvestigationOrders
		valueObjectDest.setInvestigationOrders(valueObjectSrc.getInvestigationOrders());
		// Appointments
		valueObjectDest.setAppointments(valueObjectSrc.getAppointments());
		// hasDocuments
		valueObjectDest.setHasDocuments(valueObjectSrc.getHasDocuments());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// StatusHistory
		valueObjectDest.setStatusHistory(valueObjectSrc.getStatusHistory());
		// CallAttempts
		valueObjectDest.setCallAttempts(valueObjectSrc.getCallAttempts());
		// ConsultationAppt
		valueObjectDest.setConsultationAppt(valueObjectSrc.getConsultationAppt());
		// isSuitableForSurgery
		valueObjectDest.setIsSuitableForSurgery(valueObjectSrc.getIsSuitableForSurgery());
		// isFitForSurgery
		valueObjectDest.setIsFitForSurgery(valueObjectSrc.getIsFitForSurgery());
		// hasTheatreAppt
		valueObjectDest.setHasTheatreAppt(valueObjectSrc.getHasTheatreAppt());
		// hasDNAApptsForReview
		valueObjectDest.setHasDNAApptsForReview(valueObjectSrc.getHasDNAApptsForReview());
		// hasCancelledApptsForReview
		valueObjectDest.setHasCancelledApptsForReview(valueObjectSrc.getHasCancelledApptsForReview());
		// isAwaitingClinicalInfo
		valueObjectDest.setIsAwaitingClinicalInfo(valueObjectSrc.getIsAwaitingClinicalInfo());
		// hasRejectedInv
		valueObjectDest.setHasRejectedInv(valueObjectSrc.getHasRejectedInv());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCatsReferralVoCollectionFromCatsReferral(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.CatsReferral objects.
	 */
	public static ims.RefMan.vo.CatsReferralVoCollection createCatsReferralVoCollectionFromCatsReferral(java.util.Set domainObjectSet)	
	{
		return createCatsReferralVoCollectionFromCatsReferral(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.CatsReferral objects.
	 */
	public static ims.RefMan.vo.CatsReferralVoCollection createCatsReferralVoCollectionFromCatsReferral(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.CatsReferralVoCollection voList = new ims.RefMan.vo.CatsReferralVoCollection();
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
			ims.RefMan.vo.CatsReferralVo vo = create(map, domainObject);
			
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
	public static ims.RefMan.vo.CatsReferralVoCollection createCatsReferralVoCollectionFromCatsReferral(java.util.List domainObjectList) 
	{
		return createCatsReferralVoCollectionFromCatsReferral(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.CatsReferral objects.
	 */
	public static ims.RefMan.vo.CatsReferralVoCollection createCatsReferralVoCollectionFromCatsReferral(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.CatsReferralVoCollection voList = new ims.RefMan.vo.CatsReferralVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.CatsReferral domainObject = (ims.RefMan.domain.objects.CatsReferral) domainObjectList.get(i);
			ims.RefMan.vo.CatsReferralVo vo = create(map, domainObject);

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
	 public static java.util.Set extractCatsReferralSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralVoCollection voCollection) 
	 {
	 	return extractCatsReferralSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCatsReferralSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.CatsReferralVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.CatsReferral domainObject = CatsReferralVoAssembler.extractCatsReferral(domainFactory, vo, domMap);

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
	 public static java.util.List extractCatsReferralList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralVoCollection voCollection) 
	 {
	 	return extractCatsReferralList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCatsReferralList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.CatsReferralVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.CatsReferral domainObject = CatsReferralVoAssembler.extractCatsReferral(domainFactory, vo, domMap);

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
	 public static ims.RefMan.vo.CatsReferralVo create(ims.RefMan.domain.objects.CatsReferral domainObject) 
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
	  public static ims.RefMan.vo.CatsReferralVo create(DomainObjectMap map, ims.RefMan.domain.objects.CatsReferral domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.CatsReferralVo valueObject = (ims.RefMan.vo.CatsReferralVo) map.getValueObject(domainObject, ims.RefMan.vo.CatsReferralVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.CatsReferralVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.RefMan.vo.CatsReferralVo insert(ims.RefMan.vo.CatsReferralVo valueObject, ims.RefMan.domain.objects.CatsReferral domainObject) 
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
	 public static ims.RefMan.vo.CatsReferralVo insert(DomainObjectMap map, ims.RefMan.vo.CatsReferralVo valueObject, ims.RefMan.domain.objects.CatsReferral domainObject) 
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
		// ICABReferral
		valueObject.setICABReferral(ims.core.vo.domain.ICABReferralVoAssembler.create(map, domainObject.getICABReferral()) );
		// ReferralDetails
		valueObject.setReferralDetails(ims.clinical.vo.domain.ReferralLetterDetailsVoAssembler.create(map, domainObject.getReferralDetails()) );
		// InvestigationOrders
		valueObject.setInvestigationOrders(ims.ocrr.vo.domain.OcsOrderVoAssembler.createOcsOrderVoCollectionFromOcsOrderSession(map, domainObject.getInvestigationOrders()) );
		// Appointments
		valueObject.setAppointments(ims.scheduling.vo.domain.Booking_AppointmentVoAssembler.createBooking_AppointmentVoCollectionFromBooking_Appointment(map, domainObject.getAppointments()) );
		// hasDocuments
		valueObject.setHasDocuments( domainObject.isHasDocuments() );
		// CurrentStatus
		valueObject.setCurrentStatus(ims.RefMan.vo.domain.CatsReferralStatusVoAssembler.create(map, domainObject.getCurrentStatus()) );
		// StatusHistory
		valueObject.setStatusHistory(ims.RefMan.vo.domain.CatsReferralStatusVoAssembler.createCatsReferralStatusVoCollectionFromCATSReferralStatus(map, domainObject.getStatusHistory()) );
		// CallAttempts
		valueObject.setCallAttempts(ims.RefMan.vo.domain.AppointmentCallAttemptsVoAssembler.createAppointmentCallAttemptsVoCollectionFromAppointmentCallAttempts(map, domainObject.getCallAttempts()) );
		// ConsultationAppt
		valueObject.setConsultationAppt(ims.scheduling.vo.domain.Booking_AppointmentVoAssembler.create(map, domainObject.getConsultationAppt()) );
		// isSuitableForSurgery
		valueObject.setIsSuitableForSurgery( domainObject.isIsSuitableForSurgery() );
		// isFitForSurgery
		valueObject.setIsFitForSurgery( domainObject.isIsFitForSurgery() );
		// hasTheatreAppt
		valueObject.setHasTheatreAppt( domainObject.isHasTheatreAppt() );
		// hasDNAApptsForReview
		valueObject.setHasDNAApptsForReview( domainObject.isHasDNAApptsForReview() );
		// hasCancelledApptsForReview
		valueObject.setHasCancelledApptsForReview( domainObject.isHasCancelledApptsForReview() );
		// isAwaitingClinicalInfo
		valueObject.setIsAwaitingClinicalInfo( domainObject.isIsAwaitingClinicalInfo() );
		// hasRejectedInv
		valueObject.setHasRejectedInv( domainObject.isHasRejectedInv() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.CatsReferral extractCatsReferral(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralVo valueObject) 
	{
		return 	extractCatsReferral(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.CatsReferral extractCatsReferral(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralVo valueObject, HashMap domMap) 
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
			// ims.RefMan.vo.CatsReferralVo ID_CatsReferral field is unknown
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
		domainObject.setICABReferral(ims.core.vo.domain.ICABReferralVoAssembler.extractICABReferral(domainFactory, valueObject.getICABReferral(), domMap));
		domainObject.setReferralDetails(ims.clinical.vo.domain.ReferralLetterDetailsVoAssembler.extractReferralLetterDetails(domainFactory, valueObject.getReferralDetails(), domMap));
		domainObject.setInvestigationOrders(ims.ocrr.vo.domain.OcsOrderVoAssembler.extractOcsOrderSessionSet(domainFactory, valueObject.getInvestigationOrders(), domainObject.getInvestigationOrders(), domMap));		
		domainObject.setAppointments(ims.scheduling.vo.domain.Booking_AppointmentVoAssembler.extractBooking_AppointmentSet(domainFactory, valueObject.getAppointments(), domainObject.getAppointments(), domMap));		
		domainObject.setHasDocuments(valueObject.getHasDocuments());
		domainObject.setCurrentStatus(ims.RefMan.vo.domain.CatsReferralStatusVoAssembler.extractCATSReferralStatus(domainFactory, valueObject.getCurrentStatus(), domMap));
		domainObject.setStatusHistory(ims.RefMan.vo.domain.CatsReferralStatusVoAssembler.extractCATSReferralStatusSet(domainFactory, valueObject.getStatusHistory(), domainObject.getStatusHistory(), domMap));		
		domainObject.setCallAttempts(ims.RefMan.vo.domain.AppointmentCallAttemptsVoAssembler.extractAppointmentCallAttemptsSet(domainFactory, valueObject.getCallAttempts(), domainObject.getCallAttempts(), domMap));		
		domainObject.setConsultationAppt(ims.scheduling.vo.domain.Booking_AppointmentVoAssembler.extractBooking_Appointment(domainFactory, valueObject.getConsultationAppt(), domMap));
		domainObject.setIsSuitableForSurgery(valueObject.getIsSuitableForSurgery());
		domainObject.setIsFitForSurgery(valueObject.getIsFitForSurgery());
		domainObject.setHasTheatreAppt(valueObject.getHasTheatreAppt());
		domainObject.setHasDNAApptsForReview(valueObject.getHasDNAApptsForReview());
		domainObject.setHasCancelledApptsForReview(valueObject.getHasCancelledApptsForReview());
		domainObject.setIsAwaitingClinicalInfo(valueObject.getIsAwaitingClinicalInfo());
		domainObject.setHasRejectedInv(valueObject.getHasRejectedInv());

		return domainObject;
	}

}
