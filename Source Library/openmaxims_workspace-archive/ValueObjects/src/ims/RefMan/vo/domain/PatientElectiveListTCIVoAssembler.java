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
 * @author Cornel Ventuneac
 */
public class PatientElectiveListTCIVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.PatientElectiveListTCIVo copy(ims.RefMan.vo.PatientElectiveListTCIVo valueObjectDest, ims.RefMan.vo.PatientElectiveListTCIVo valueObjectSrc) 
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
		// DateTCIOffered
		valueObjectDest.setDateTCIOffered(valueObjectSrc.getDateTCIOffered());
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
 	 * If more than one call to an Assembler is made then #createPatientElectiveListTCIVoCollectionFromTCIForPatientElectiveList(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.TCIForPatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListTCIVoCollection createPatientElectiveListTCIVoCollectionFromTCIForPatientElectiveList(java.util.Set domainObjectSet)	
	{
		return createPatientElectiveListTCIVoCollectionFromTCIForPatientElectiveList(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.TCIForPatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListTCIVoCollection createPatientElectiveListTCIVoCollectionFromTCIForPatientElectiveList(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.PatientElectiveListTCIVoCollection voList = new ims.RefMan.vo.PatientElectiveListTCIVoCollection();
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
			ims.RefMan.vo.PatientElectiveListTCIVo vo = create(map, domainObject);
			
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
	public static ims.RefMan.vo.PatientElectiveListTCIVoCollection createPatientElectiveListTCIVoCollectionFromTCIForPatientElectiveList(java.util.List domainObjectList) 
	{
		return createPatientElectiveListTCIVoCollectionFromTCIForPatientElectiveList(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.TCIForPatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListTCIVoCollection createPatientElectiveListTCIVoCollectionFromTCIForPatientElectiveList(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.PatientElectiveListTCIVoCollection voList = new ims.RefMan.vo.PatientElectiveListTCIVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.TCIForPatientElectiveList domainObject = (ims.RefMan.domain.objects.TCIForPatientElectiveList) domainObjectList.get(i);
			ims.RefMan.vo.PatientElectiveListTCIVo vo = create(map, domainObject);

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
	 public static java.util.Set extractTCIForPatientElectiveListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListTCIVoCollection voCollection) 
	 {
	 	return extractTCIForPatientElectiveListSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTCIForPatientElectiveListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListTCIVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientElectiveListTCIVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.TCIForPatientElectiveList domainObject = PatientElectiveListTCIVoAssembler.extractTCIForPatientElectiveList(domainFactory, vo, domMap);

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
	 public static java.util.List extractTCIForPatientElectiveListList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListTCIVoCollection voCollection) 
	 {
	 	return extractTCIForPatientElectiveListList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTCIForPatientElectiveListList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListTCIVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientElectiveListTCIVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.TCIForPatientElectiveList domainObject = PatientElectiveListTCIVoAssembler.extractTCIForPatientElectiveList(domainFactory, vo, domMap);

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
	 public static ims.RefMan.vo.PatientElectiveListTCIVo create(ims.RefMan.domain.objects.TCIForPatientElectiveList domainObject) 
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
	  public static ims.RefMan.vo.PatientElectiveListTCIVo create(DomainObjectMap map, ims.RefMan.domain.objects.TCIForPatientElectiveList domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.PatientElectiveListTCIVo valueObject = (ims.RefMan.vo.PatientElectiveListTCIVo) map.getValueObject(domainObject, ims.RefMan.vo.PatientElectiveListTCIVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.PatientElectiveListTCIVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.RefMan.vo.PatientElectiveListTCIVo insert(ims.RefMan.vo.PatientElectiveListTCIVo valueObject, ims.RefMan.domain.objects.TCIForPatientElectiveList domainObject) 
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
	 public static ims.RefMan.vo.PatientElectiveListTCIVo insert(DomainObjectMap map, ims.RefMan.vo.PatientElectiveListTCIVo valueObject, ims.RefMan.domain.objects.TCIForPatientElectiveList domainObject) 
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
				// DateTCIAccepted
		java.util.Date DateTCIAccepted = domainObject.getDateTCIAccepted();
		if ( null != DateTCIAccepted ) 
		{
			valueObject.setDateTCIAccepted(new ims.framework.utils.Date(DateTCIAccepted) );
		}
		// Appointment
		valueObject.setAppointment(ims.RefMan.vo.domain.Booking_AppointmentElectiveListVoAssembler.create(map, domainObject.getAppointment()) );
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
		ims.domain.lookups.LookupInstance instance8 = domainObject.getPlanningElective();
		if ( null != instance8 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance8.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance8.getImage().getImageId(), instance8.getImage().getImagePath());
			}
			color = instance8.getColor();
			if (color != null) 
				color.getValue();

			ims.RefMan.vo.lookups.PlanningElective voLookup8 = new ims.RefMan.vo.lookups.PlanningElective(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.RefMan.vo.lookups.PlanningElective parentVoLookup8 = voLookup8;
			ims.domain.lookups.LookupInstance parent8 = instance8.getParent();
			while (parent8 != null)
			{
				if (parent8.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent8.getImage().getImageId(), parent8.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent8.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup8.setParent(new ims.RefMan.vo.lookups.PlanningElective(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setPlanningElective(voLookup8);
		}
				// TCIWard
		valueObject.setTCIWard(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getTCIWard()) );
		// TCIBed
		valueObject.setTCIBed(domainObject.getTCIBed());
		// TCIConsultant
		valueObject.setTCIConsultant(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getTCIConsultant()) );
		// DateTCIOffered
		java.util.Date DateTCIOffered = domainObject.getDateTCIOffered();
		if ( null != DateTCIOffered ) 
		{
			valueObject.setDateTCIOffered(new ims.framework.utils.Date(DateTCIOffered) );
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
		valueObject.setTCIHospital(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getTCIHospital()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.TCIForPatientElectiveList extractTCIForPatientElectiveList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListTCIVo valueObject) 
	{
		return 	extractTCIForPatientElectiveList(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.TCIForPatientElectiveList extractTCIForPatientElectiveList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListTCIVo valueObject, HashMap domMap) 
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
			// ims.RefMan.vo.PatientElectiveListTCIVo ID_TCIForPatientElectiveList field is unknown
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
		ims.framework.utils.Date date4 = valueObject.getDateTCIAccepted();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setDateTCIAccepted(value4);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.scheduling.domain.objects.Booking_Appointment value5 = null;
		if ( null != valueObject.getAppointment() ) 
		{
			if (valueObject.getAppointment().getBoId() == null)
			{
				if (domMap.get(valueObject.getAppointment()) != null)
				{
					value5 = (ims.scheduling.domain.objects.Booking_Appointment)domMap.get(valueObject.getAppointment());
				}
			}
			else
			{
				value5 = (ims.scheduling.domain.objects.Booking_Appointment)domainFactory.getDomainObject(ims.scheduling.domain.objects.Booking_Appointment.class, valueObject.getAppointment().getBoId());
			}
		}
		domainObject.setAppointment(value5);
		ims.scheduling.domain.objects.Sch_Session value6 = null;
		if ( null != valueObject.getSession() ) 
		{
			if (valueObject.getSession().getBoId() == null)
			{
				if (domMap.get(valueObject.getSession()) != null)
				{
					value6 = (ims.scheduling.domain.objects.Sch_Session)domMap.get(valueObject.getSession());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value6 = domainObject.getSession();	
			}
			else
			{
				value6 = (ims.scheduling.domain.objects.Sch_Session)domainFactory.getDomainObject(ims.scheduling.domain.objects.Sch_Session.class, valueObject.getSession().getBoId());
			}
		}
		domainObject.setSession(value6);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComments() != null && valueObject.getComments().equals(""))
		{
			valueObject.setComments(null);
		}
		domainObject.setComments(valueObject.getComments());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getPlanningElective() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getPlanningElective().getID());
		}
		domainObject.setPlanningElective(value8);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value9 = null;
		if ( null != valueObject.getTCIWard() ) 
		{
			if (valueObject.getTCIWard().getBoId() == null)
			{
				if (domMap.get(valueObject.getTCIWard()) != null)
				{
					value9 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getTCIWard());
				}
			}
			else
			{
				value9 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getTCIWard().getBoId());
			}
		}
		domainObject.setTCIWard(value9);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTCIBed() != null && valueObject.getTCIBed().equals(""))
		{
			valueObject.setTCIBed(null);
		}
		domainObject.setTCIBed(valueObject.getTCIBed());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value11 = null;
		if ( null != valueObject.getTCIConsultant() ) 
		{
			if (valueObject.getTCIConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getTCIConsultant()) != null)
				{
					value11 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getTCIConsultant());
				}
			}
			else
			{
				value11 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getTCIConsultant().getBoId());
			}
		}
		domainObject.setTCIConsultant(value11);
		java.util.Date value12 = null;
		ims.framework.utils.Date date12 = valueObject.getDateTCIOffered();		
		if ( date12 != null ) 
		{
			value12 = date12.getDate();
		}
		domainObject.setDateTCIOffered(value12);
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
	// SaveAsRefVO - treated as a refVo in extract methods
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
			else
			{
				value17 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getTCIHospital().getBoId());
			}
		}
		domainObject.setTCIHospital(value17);

		return domainObject;
	}

}
