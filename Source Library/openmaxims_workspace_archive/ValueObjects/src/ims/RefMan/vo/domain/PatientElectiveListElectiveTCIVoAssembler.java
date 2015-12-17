/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 16/04/2014, 12:31
 *
 */
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Florin Blindu
 */
public class PatientElectiveListElectiveTCIVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.PatientElectiveListElectiveTCIVo copy(ims.RefMan.vo.PatientElectiveListElectiveTCIVo valueObjectDest, ims.RefMan.vo.PatientElectiveListElectiveTCIVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_TCIForPatientElectiveList(valueObjectSrc.getID_TCIForPatientElectiveList());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TCIDate
		valueObjectDest.setTCIDate(valueObjectSrc.getTCIDate());
		// TCITime
		valueObjectDest.setTCITime(valueObjectSrc.getTCITime());
		// TCIOfferMethod
		valueObjectDest.setTCIOfferMethod(valueObjectSrc.getTCIOfferMethod());
		// DateTCIOffered
		valueObjectDest.setDateTCIOffered(valueObjectSrc.getDateTCIOffered());
		// DateTCIAccepted
		valueObjectDest.setDateTCIAccepted(valueObjectSrc.getDateTCIAccepted());
		// Appointment
		valueObjectDest.setAppointment(valueObjectSrc.getAppointment());
		// Session
		valueObjectDest.setSession(valueObjectSrc.getSession());
		// Comments
		valueObjectDest.setComments(valueObjectSrc.getComments());
		// PlanningElective
		valueObjectDest.setPlanningElective(valueObjectSrc.getPlanningElective());
		// TCIWard
		valueObjectDest.setTCIWard(valueObjectSrc.getTCIWard());
		// TCIBed
		valueObjectDest.setTCIBed(valueObjectSrc.getTCIBed());
		// TCIConsultant
		valueObjectDest.setTCIConsultant(valueObjectSrc.getTCIConsultant());
		// CurrentOutcome
		valueObjectDest.setCurrentOutcome(valueObjectSrc.getCurrentOutcome());
		// OutcomeHistory
		valueObjectDest.setOutcomeHistory(valueObjectSrc.getOutcomeHistory());
		// IsActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// KPIExceededReason
		valueObjectDest.setKPIExceededReason(valueObjectSrc.getKPIExceededReason());
		// TCIHospital
		valueObjectDest.setTCIHospital(valueObjectSrc.getTCIHospital());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientElectiveListElectiveTCIVoCollectionFromTCIForPatientElectiveList(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.TCIForPatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListElectiveTCIVoCollection createPatientElectiveListElectiveTCIVoCollectionFromTCIForPatientElectiveList(java.util.Set domainObjectSet)	
	{
		return createPatientElectiveListElectiveTCIVoCollectionFromTCIForPatientElectiveList(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.TCIForPatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListElectiveTCIVoCollection createPatientElectiveListElectiveTCIVoCollectionFromTCIForPatientElectiveList(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.PatientElectiveListElectiveTCIVoCollection voList = new ims.RefMan.vo.PatientElectiveListElectiveTCIVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.TCIForPatientElectiveList domainObject = (ims.RefMan.domain.objects.TCIForPatientElectiveList) iterator.next();
			ims.RefMan.vo.PatientElectiveListElectiveTCIVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.TCIForPatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListElectiveTCIVoCollection createPatientElectiveListElectiveTCIVoCollectionFromTCIForPatientElectiveList(java.util.List domainObjectList) 
	{
		return createPatientElectiveListElectiveTCIVoCollectionFromTCIForPatientElectiveList(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.TCIForPatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListElectiveTCIVoCollection createPatientElectiveListElectiveTCIVoCollectionFromTCIForPatientElectiveList(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.PatientElectiveListElectiveTCIVoCollection voList = new ims.RefMan.vo.PatientElectiveListElectiveTCIVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.TCIForPatientElectiveList domainObject = (ims.RefMan.domain.objects.TCIForPatientElectiveList) domainObjectList.get(i);
			ims.RefMan.vo.PatientElectiveListElectiveTCIVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.TCIForPatientElectiveList set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTCIForPatientElectiveListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListElectiveTCIVoCollection voCollection) 
	 {
	 	return extractTCIForPatientElectiveListSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTCIForPatientElectiveListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListElectiveTCIVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientElectiveListElectiveTCIVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.TCIForPatientElectiveList domainObject = PatientElectiveListElectiveTCIVoAssembler.extractTCIForPatientElectiveList(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.TCIForPatientElectiveList list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTCIForPatientElectiveListList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListElectiveTCIVoCollection voCollection) 
	 {
	 	return extractTCIForPatientElectiveListList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTCIForPatientElectiveListList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListElectiveTCIVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientElectiveListElectiveTCIVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.TCIForPatientElectiveList domainObject = PatientElectiveListElectiveTCIVoAssembler.extractTCIForPatientElectiveList(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.TCIForPatientElectiveList object.
	 * @param domainObject ims.RefMan.domain.objects.TCIForPatientElectiveList
	 */
	 public static ims.RefMan.vo.PatientElectiveListElectiveTCIVo create(ims.RefMan.domain.objects.TCIForPatientElectiveList domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.TCIForPatientElectiveList object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.PatientElectiveListElectiveTCIVo create(DomainObjectMap map, ims.RefMan.domain.objects.TCIForPatientElectiveList domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.PatientElectiveListElectiveTCIVo valueObject = (ims.RefMan.vo.PatientElectiveListElectiveTCIVo) map.getValueObject(domainObject, ims.RefMan.vo.PatientElectiveListElectiveTCIVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.PatientElectiveListElectiveTCIVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.TCIForPatientElectiveList
	 */
	 public static ims.RefMan.vo.PatientElectiveListElectiveTCIVo insert(ims.RefMan.vo.PatientElectiveListElectiveTCIVo valueObject, ims.RefMan.domain.objects.TCIForPatientElectiveList domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.TCIForPatientElectiveList
	 */
	 public static ims.RefMan.vo.PatientElectiveListElectiveTCIVo insert(DomainObjectMap map, ims.RefMan.vo.PatientElectiveListElectiveTCIVo valueObject, ims.RefMan.domain.objects.TCIForPatientElectiveList domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_TCIForPatientElectiveList(domainObject.getId());
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
			
		// TCIDate
		java.util.Date TCIDate = domainObject.getTCIDate();
		if ( null != TCIDate ) 
		{
			valueObject.setTCIDate(new ims.framework.utils.Date(TCIDate) );
		}
		// TCITime
		String TCITime = domainObject.getTCITime();
		if ( null != TCITime ) 
		{
			valueObject.setTCITime(new ims.framework.utils.Time(TCITime) );
		}
		// TCIOfferMethod
		ims.domain.lookups.LookupInstance instance3 = domainObject.getTCIOfferMethod();
		if ( null != instance3 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance3.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance3.getImage().getImageId(), instance3.getImage().getImagePath());
			}
			color = instance3.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.TCIOfferMethod voLookup3 = new ims.core.vo.lookups.TCIOfferMethod(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.TCIOfferMethod parentVoLookup3 = voLookup3;
			ims.domain.lookups.LookupInstance parent3 = instance3.getParent();
			while (parent3 != null)
			{
				if (parent3.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent3.getImage().getImageId(), parent3.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent3.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup3.setParent(new ims.core.vo.lookups.TCIOfferMethod(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setTCIOfferMethod(voLookup3);
		}
				// DateTCIOffered
		java.util.Date DateTCIOffered = domainObject.getDateTCIOffered();
		if ( null != DateTCIOffered ) 
		{
			valueObject.setDateTCIOffered(new ims.framework.utils.Date(DateTCIOffered) );
		}
		// DateTCIAccepted
		java.util.Date DateTCIAccepted = domainObject.getDateTCIAccepted();
		if ( null != DateTCIAccepted ) 
		{
			valueObject.setDateTCIAccepted(new ims.framework.utils.Date(DateTCIAccepted) );
		}
		// Appointment
		valueObject.setAppointment(ims.scheduling.vo.domain.BookingAppointmentTheatreVoAssembler.create(map, domainObject.getAppointment()) );
		// Session
		if (domainObject.getSession() != null)
		{
			if(domainObject.getSession() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getSession();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setSession(new ims.scheduling.vo.Sch_SessionRefVo(id, -1));				
			}
			else
			{
				valueObject.setSession(new ims.scheduling.vo.Sch_SessionRefVo(domainObject.getSession().getId(), domainObject.getSession().getVersion()));
			}
		}
		// Comments
		valueObject.setComments(domainObject.getComments());
		// PlanningElective
		ims.domain.lookups.LookupInstance instance9 = domainObject.getPlanningElective();
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

			ims.RefMan.vo.lookups.PlanningElective voLookup9 = new ims.RefMan.vo.lookups.PlanningElective(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.RefMan.vo.lookups.PlanningElective parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.RefMan.vo.lookups.PlanningElective(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setPlanningElective(voLookup9);
		}
				// TCIWard
		if (domainObject.getTCIWard() != null)
		{
			if(domainObject.getTCIWard() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getTCIWard();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setTCIWard(new ims.core.resource.place.vo.LocationRefVo(id, -1));				
			}
			else
			{
				valueObject.setTCIWard(new ims.core.resource.place.vo.LocationRefVo(domainObject.getTCIWard().getId(), domainObject.getTCIWard().getVersion()));
			}
		}
		// TCIBed
		valueObject.setTCIBed(domainObject.getTCIBed());
		// TCIConsultant
		if (domainObject.getTCIConsultant() != null)
		{
			if(domainObject.getTCIConsultant() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getTCIConsultant();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setTCIConsultant(new ims.core.resource.people.vo.HcpRefVo(id, -1));				
			}
			else
			{
				valueObject.setTCIConsultant(new ims.core.resource.people.vo.HcpRefVo(domainObject.getTCIConsultant().getId(), domainObject.getTCIConsultant().getVersion()));
			}
		}
		// CurrentOutcome
		valueObject.setCurrentOutcome(ims.RefMan.vo.domain.TCIOutcomeForPatientElectiveListVoAssembler.create(map, domainObject.getCurrentOutcome()) );
		// OutcomeHistory
		valueObject.setOutcomeHistory(ims.RefMan.vo.domain.TCIOutcomeForPatientElectiveListVoAssembler.createTCIOutcomeForPatientElectiveListVoCollectionFromTCIOutcomeForPatientElectiveList(map, domainObject.getOutcomeHistory()) );
		// IsActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// KPIExceededReason
		ims.domain.lookups.LookupInstance instance16 = domainObject.getKPIExceededReason();
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

			ims.RefMan.vo.lookups.KPIExceededReason voLookup16 = new ims.RefMan.vo.lookups.KPIExceededReason(instance16.getId(),instance16.getText(), instance16.isActive(), null, img, color);
			ims.RefMan.vo.lookups.KPIExceededReason parentVoLookup16 = voLookup16;
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
								parentVoLookup16.setParent(new ims.RefMan.vo.lookups.KPIExceededReason(parent16.getId(),parent16.getText(), parent16.isActive(), null, img, color));
				parentVoLookup16 = parentVoLookup16.getParent();
								parent16 = parent16.getParent();
			}			
			valueObject.setKPIExceededReason(voLookup16);
		}
				// TCIHospital
		if (domainObject.getTCIHospital() != null)
		{
			if(domainObject.getTCIHospital() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getTCIHospital();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setTCIHospital(new ims.core.resource.place.vo.LocationRefVo(id, -1));				
			}
			else
			{
				valueObject.setTCIHospital(new ims.core.resource.place.vo.LocationRefVo(domainObject.getTCIHospital().getId(), domainObject.getTCIHospital().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.TCIForPatientElectiveList extractTCIForPatientElectiveList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListElectiveTCIVo valueObject) 
	{
		return 	extractTCIForPatientElectiveList(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.TCIForPatientElectiveList extractTCIForPatientElectiveList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListElectiveTCIVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_TCIForPatientElectiveList();
		ims.RefMan.domain.objects.TCIForPatientElectiveList domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.TCIForPatientElectiveList)domMap.get(valueObject);
			}
			// ims.RefMan.vo.PatientElectiveListElectiveTCIVo ID_TCIForPatientElectiveList field is unknown
			domainObject = new ims.RefMan.domain.objects.TCIForPatientElectiveList();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_TCIForPatientElectiveList());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.TCIForPatientElectiveList)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.TCIForPatientElectiveList) domainFactory.getDomainObject(ims.RefMan.domain.objects.TCIForPatientElectiveList.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_TCIForPatientElectiveList());

		java.util.Date value1 = null;
		ims.framework.utils.Date date1 = valueObject.getTCIDate();		
		if ( date1 != null ) 
		{
			value1 = date1.getDate();
		}
		domainObject.setTCIDate(value1);
		ims.framework.utils.Time time2 = valueObject.getTCITime();
		String value2 = null;
		if ( time2 != null ) 
		{
			value2 = time2.toString();
		}
		domainObject.setTCITime(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getTCIOfferMethod() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getTCIOfferMethod().getID());
		}
		domainObject.setTCIOfferMethod(value3);
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getDateTCIOffered();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setDateTCIOffered(value4);
		java.util.Date value5 = null;
		ims.framework.utils.Date date5 = valueObject.getDateTCIAccepted();		
		if ( date5 != null ) 
		{
			value5 = date5.getDate();
		}
		domainObject.setDateTCIAccepted(value5);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.scheduling.domain.objects.Booking_Appointment value6 = null;
		if ( null != valueObject.getAppointment() ) 
		{
			if (valueObject.getAppointment().getBoId() == null)
			{
				if (domMap.get(valueObject.getAppointment()) != null)
				{
					value6 = (ims.scheduling.domain.objects.Booking_Appointment)domMap.get(valueObject.getAppointment());
				}
			}
			else
			{
				value6 = (ims.scheduling.domain.objects.Booking_Appointment)domainFactory.getDomainObject(ims.scheduling.domain.objects.Booking_Appointment.class, valueObject.getAppointment().getBoId());
			}
		}
		domainObject.setAppointment(value6);
		ims.scheduling.domain.objects.Sch_Session value7 = null;
		if ( null != valueObject.getSession() ) 
		{
			if (valueObject.getSession().getBoId() == null)
			{
				if (domMap.get(valueObject.getSession()) != null)
				{
					value7 = (ims.scheduling.domain.objects.Sch_Session)domMap.get(valueObject.getSession());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value7 = domainObject.getSession();	
			}
			else
			{
				value7 = (ims.scheduling.domain.objects.Sch_Session)domainFactory.getDomainObject(ims.scheduling.domain.objects.Sch_Session.class, valueObject.getSession().getBoId());
			}
		}
		domainObject.setSession(value7);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComments() != null && valueObject.getComments().equals(""))
		{
			valueObject.setComments(null);
		}
		domainObject.setComments(valueObject.getComments());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getPlanningElective() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getPlanningElective().getID());
		}
		domainObject.setPlanningElective(value9);
		ims.core.resource.place.domain.objects.Location value10 = null;
		if ( null != valueObject.getTCIWard() ) 
		{
			if (valueObject.getTCIWard().getBoId() == null)
			{
				if (domMap.get(valueObject.getTCIWard()) != null)
				{
					value10 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getTCIWard());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value10 = domainObject.getTCIWard();	
			}
			else
			{
				value10 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getTCIWard().getBoId());
			}
		}
		domainObject.setTCIWard(value10);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTCIBed() != null && valueObject.getTCIBed().equals(""))
		{
			valueObject.setTCIBed(null);
		}
		domainObject.setTCIBed(valueObject.getTCIBed());
		ims.core.resource.people.domain.objects.Hcp value12 = null;
		if ( null != valueObject.getTCIConsultant() ) 
		{
			if (valueObject.getTCIConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getTCIConsultant()) != null)
				{
					value12 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getTCIConsultant());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value12 = domainObject.getTCIConsultant();	
			}
			else
			{
				value12 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getTCIConsultant().getBoId());
			}
		}
		domainObject.setTCIConsultant(value12);
		domainObject.setCurrentOutcome(ims.RefMan.vo.domain.TCIOutcomeForPatientElectiveListVoAssembler.extractTCIOutcomeForPatientElectiveList(domainFactory, valueObject.getCurrentOutcome(), domMap));
		domainObject.setOutcomeHistory(ims.RefMan.vo.domain.TCIOutcomeForPatientElectiveListVoAssembler.extractTCIOutcomeForPatientElectiveListList(domainFactory, valueObject.getOutcomeHistory(), domainObject.getOutcomeHistory(), domMap));		
		domainObject.setIsActive(valueObject.getIsActive());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getKPIExceededReason() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getKPIExceededReason().getID());
		}
		domainObject.setKPIExceededReason(value16);
		ims.core.resource.place.domain.objects.Location value17 = null;
		if ( null != valueObject.getTCIHospital() ) 
		{
			if (valueObject.getTCIHospital().getBoId() == null)
			{
				if (domMap.get(valueObject.getTCIHospital()) != null)
				{
					value17 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getTCIHospital());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value17 = domainObject.getTCIHospital();	
			}
			else
			{
				value17 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getTCIHospital().getBoId());
			}
		}
		domainObject.setTCIHospital(value17);

		return domainObject;
	}

}
