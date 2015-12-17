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
 * @author Cristian Belciug
 */
public class AppointmentClinicalNotesVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.AppointmentClinicalNotesVo copy(ims.RefMan.vo.AppointmentClinicalNotesVo valueObjectDest, ims.RefMan.vo.AppointmentClinicalNotesVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_AppointmentClinicalNotes(valueObjectSrc.getID_AppointmentClinicalNotes());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CatsReferral
		valueObjectDest.setCatsReferral(valueObjectSrc.getCatsReferral());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// ClinicalNote
		valueObjectDest.setClinicalNote(valueObjectSrc.getClinicalNote());
		// ClinicalNoteType
		valueObjectDest.setClinicalNoteType(valueObjectSrc.getClinicalNoteType());
		// Appointment
		valueObjectDest.setAppointment(valueObjectSrc.getAppointment());
		// AuthoringUser
		valueObjectDest.setAuthoringUser(valueObjectSrc.getAuthoringUser());
		// SysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
		// NoteType
		valueObjectDest.setNoteType(valueObjectSrc.getNoteType());
		// NoteStatus
		valueObjectDest.setNoteStatus(valueObjectSrc.getNoteStatus());
		// copyToGP
		valueObjectDest.setCopyToGP(valueObjectSrc.getCopyToGP());
		// copyToPatient
		valueObjectDest.setCopyToPatient(valueObjectSrc.getCopyToPatient());
		// copyToSecondaryCare
		valueObjectDest.setCopyToSecondaryCare(valueObjectSrc.getCopyToSecondaryCare());
		// CorrespondenceMadeActiveDateTime
		valueObjectDest.setCorrespondenceMadeActiveDateTime(valueObjectSrc.getCorrespondenceMadeActiveDateTime());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createAppointmentClinicalNotesVoCollectionFromAppointmentClinicalNotes(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.AppointmentClinicalNotes objects.
	 */
	public static ims.RefMan.vo.AppointmentClinicalNotesVoCollection createAppointmentClinicalNotesVoCollectionFromAppointmentClinicalNotes(java.util.Set domainObjectSet)	
	{
		return createAppointmentClinicalNotesVoCollectionFromAppointmentClinicalNotes(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.AppointmentClinicalNotes objects.
	 */
	public static ims.RefMan.vo.AppointmentClinicalNotesVoCollection createAppointmentClinicalNotesVoCollectionFromAppointmentClinicalNotes(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.AppointmentClinicalNotesVoCollection voList = new ims.RefMan.vo.AppointmentClinicalNotesVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.AppointmentClinicalNotes domainObject = (ims.RefMan.domain.objects.AppointmentClinicalNotes) iterator.next();
			ims.RefMan.vo.AppointmentClinicalNotesVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.AppointmentClinicalNotes objects.
	 */
	public static ims.RefMan.vo.AppointmentClinicalNotesVoCollection createAppointmentClinicalNotesVoCollectionFromAppointmentClinicalNotes(java.util.List domainObjectList) 
	{
		return createAppointmentClinicalNotesVoCollectionFromAppointmentClinicalNotes(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.AppointmentClinicalNotes objects.
	 */
	public static ims.RefMan.vo.AppointmentClinicalNotesVoCollection createAppointmentClinicalNotesVoCollectionFromAppointmentClinicalNotes(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.AppointmentClinicalNotesVoCollection voList = new ims.RefMan.vo.AppointmentClinicalNotesVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.AppointmentClinicalNotes domainObject = (ims.RefMan.domain.objects.AppointmentClinicalNotes) domainObjectList.get(i);
			ims.RefMan.vo.AppointmentClinicalNotesVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.AppointmentClinicalNotes set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractAppointmentClinicalNotesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.AppointmentClinicalNotesVoCollection voCollection) 
	 {
	 	return extractAppointmentClinicalNotesSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractAppointmentClinicalNotesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.AppointmentClinicalNotesVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.AppointmentClinicalNotesVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.AppointmentClinicalNotes domainObject = AppointmentClinicalNotesVoAssembler.extractAppointmentClinicalNotes(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.AppointmentClinicalNotes list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractAppointmentClinicalNotesList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.AppointmentClinicalNotesVoCollection voCollection) 
	 {
	 	return extractAppointmentClinicalNotesList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractAppointmentClinicalNotesList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.AppointmentClinicalNotesVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.AppointmentClinicalNotesVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.AppointmentClinicalNotes domainObject = AppointmentClinicalNotesVoAssembler.extractAppointmentClinicalNotes(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.AppointmentClinicalNotes object.
	 * @param domainObject ims.RefMan.domain.objects.AppointmentClinicalNotes
	 */
	 public static ims.RefMan.vo.AppointmentClinicalNotesVo create(ims.RefMan.domain.objects.AppointmentClinicalNotes domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.AppointmentClinicalNotes object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.AppointmentClinicalNotesVo create(DomainObjectMap map, ims.RefMan.domain.objects.AppointmentClinicalNotes domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.AppointmentClinicalNotesVo valueObject = (ims.RefMan.vo.AppointmentClinicalNotesVo) map.getValueObject(domainObject, ims.RefMan.vo.AppointmentClinicalNotesVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.AppointmentClinicalNotesVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.AppointmentClinicalNotes
	 */
	 public static ims.RefMan.vo.AppointmentClinicalNotesVo insert(ims.RefMan.vo.AppointmentClinicalNotesVo valueObject, ims.RefMan.domain.objects.AppointmentClinicalNotes domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.AppointmentClinicalNotes
	 */
	 public static ims.RefMan.vo.AppointmentClinicalNotesVo insert(DomainObjectMap map, ims.RefMan.vo.AppointmentClinicalNotesVo valueObject, ims.RefMan.domain.objects.AppointmentClinicalNotes domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_AppointmentClinicalNotes(domainObject.getId());
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
			
		// CatsReferral
		if (domainObject.getCatsReferral() != null)
		{
			if(domainObject.getCatsReferral() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCatsReferral();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCatsReferral(new ims.RefMan.vo.CatsReferralRefVo(id, -1));				
			}
			else
			{
				valueObject.setCatsReferral(new ims.RefMan.vo.CatsReferralRefVo(domainObject.getCatsReferral().getId(), domainObject.getCatsReferral().getVersion()));
			}
		}
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// ClinicalNote
		valueObject.setClinicalNote(domainObject.getClinicalNote());
		// ClinicalNoteType
		ims.domain.lookups.LookupInstance instance4 = domainObject.getClinicalNoteType();
		if ( null != instance4 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance4.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance4.getImage().getImageId(), instance4.getImage().getImagePath());
			}
			color = instance4.getColor();
			if (color != null) 
				color.getValue();

			ims.RefMan.vo.lookups.ClinicalNoteTypeForAnAppointment voLookup4 = new ims.RefMan.vo.lookups.ClinicalNoteTypeForAnAppointment(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ClinicalNoteTypeForAnAppointment parentVoLookup4 = voLookup4;
			ims.domain.lookups.LookupInstance parent4 = instance4.getParent();
			while (parent4 != null)
			{
				if (parent4.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent4.getImage().getImageId(), parent4.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent4.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup4.setParent(new ims.RefMan.vo.lookups.ClinicalNoteTypeForAnAppointment(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setClinicalNoteType(voLookup4);
		}
				// Appointment
		if (domainObject.getAppointment() != null)
		{
			if(domainObject.getAppointment() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAppointment();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAppointment(new ims.scheduling.vo.Booking_AppointmentRefVo(id, -1));				
			}
			else
			{
				valueObject.setAppointment(new ims.scheduling.vo.Booking_AppointmentRefVo(domainObject.getAppointment().getId(), domainObject.getAppointment().getVersion()));
			}
		}
		// AuthoringUser
		if (domainObject.getAuthoringUser() != null)
		{
			if(domainObject.getAuthoringUser() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAuthoringUser();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAuthoringUser(new ims.core.resource.people.vo.MemberOfStaffRefVo(id, -1));				
			}
			else
			{
				valueObject.setAuthoringUser(new ims.core.resource.people.vo.MemberOfStaffRefVo(domainObject.getAuthoringUser().getId(), domainObject.getAuthoringUser().getVersion()));
			}
		}
		// SysInfo
		// set system information
		valueObject.setSysInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// NoteType
		ims.domain.lookups.LookupInstance instance8 = domainObject.getNoteType();
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

			ims.RefMan.vo.lookups.ReportNoteType voLookup8 = new ims.RefMan.vo.lookups.ReportNoteType(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ReportNoteType parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.RefMan.vo.lookups.ReportNoteType(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setNoteType(voLookup8);
		}
				// NoteStatus
		ims.domain.lookups.LookupInstance instance9 = domainObject.getNoteStatus();
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

			ims.RefMan.vo.lookups.ReportNoteStatus voLookup9 = new ims.RefMan.vo.lookups.ReportNoteStatus(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ReportNoteStatus parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.RefMan.vo.lookups.ReportNoteStatus(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setNoteStatus(voLookup9);
		}
				// copyToGP
		valueObject.setCopyToGP( domainObject.isCopyToGP() );
		// copyToPatient
		valueObject.setCopyToPatient( domainObject.isCopyToPatient() );
		// copyToSecondaryCare
		valueObject.setCopyToSecondaryCare( domainObject.isCopyToSecondaryCare() );
		// CorrespondenceMadeActiveDateTime
		java.util.Date CorrespondenceMadeActiveDateTime = domainObject.getCorrespondenceMadeActiveDateTime();
		if ( null != CorrespondenceMadeActiveDateTime ) 
		{
			valueObject.setCorrespondenceMadeActiveDateTime(new ims.framework.utils.DateTime(CorrespondenceMadeActiveDateTime) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.AppointmentClinicalNotes extractAppointmentClinicalNotes(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.AppointmentClinicalNotesVo valueObject) 
	{
		return 	extractAppointmentClinicalNotes(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.AppointmentClinicalNotes extractAppointmentClinicalNotes(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.AppointmentClinicalNotesVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_AppointmentClinicalNotes();
		ims.RefMan.domain.objects.AppointmentClinicalNotes domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.AppointmentClinicalNotes)domMap.get(valueObject);
			}
			// ims.RefMan.vo.AppointmentClinicalNotesVo ID_AppointmentClinicalNotes field is unknown
			domainObject = new ims.RefMan.domain.objects.AppointmentClinicalNotes();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_AppointmentClinicalNotes());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.AppointmentClinicalNotes)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.AppointmentClinicalNotes) domainFactory.getDomainObject(ims.RefMan.domain.objects.AppointmentClinicalNotes.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_AppointmentClinicalNotes());

		ims.RefMan.domain.objects.CatsReferral value1 = null;
		if ( null != valueObject.getCatsReferral() ) 
		{
			if (valueObject.getCatsReferral().getBoId() == null)
			{
				if (domMap.get(valueObject.getCatsReferral()) != null)
				{
					value1 = (ims.RefMan.domain.objects.CatsReferral)domMap.get(valueObject.getCatsReferral());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getCatsReferral();	
			}
			else
			{
				value1 = (ims.RefMan.domain.objects.CatsReferral)domainFactory.getDomainObject(ims.RefMan.domain.objects.CatsReferral.class, valueObject.getCatsReferral().getBoId());
			}
		}
		domainObject.setCatsReferral(value1);
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getClinicalNote() != null && valueObject.getClinicalNote().equals(""))
		{
			valueObject.setClinicalNote(null);
		}
		domainObject.setClinicalNote(valueObject.getClinicalNote());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getClinicalNoteType() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getClinicalNoteType().getID());
		}
		domainObject.setClinicalNoteType(value4);
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
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value5 = domainObject.getAppointment();	
			}
			else
			{
				value5 = (ims.scheduling.domain.objects.Booking_Appointment)domainFactory.getDomainObject(ims.scheduling.domain.objects.Booking_Appointment.class, valueObject.getAppointment().getBoId());
			}
		}
		domainObject.setAppointment(value5);
		ims.core.resource.people.domain.objects.MemberOfStaff value6 = null;
		if ( null != valueObject.getAuthoringUser() ) 
		{
			if (valueObject.getAuthoringUser().getBoId() == null)
			{
				if (domMap.get(valueObject.getAuthoringUser()) != null)
				{
					value6 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getAuthoringUser());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value6 = domainObject.getAuthoringUser();	
			}
			else
			{
				value6 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getAuthoringUser().getBoId());
			}
		}
		domainObject.setAuthoringUser(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getNoteType() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getNoteType().getID());
		}
		domainObject.setNoteType(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getNoteStatus() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getNoteStatus().getID());
		}
		domainObject.setNoteStatus(value9);
		domainObject.setCopyToGP(valueObject.getCopyToGP());
		domainObject.setCopyToPatient(valueObject.getCopyToPatient());
		domainObject.setCopyToSecondaryCare(valueObject.getCopyToSecondaryCare());
		ims.framework.utils.DateTime dateTime13 = valueObject.getCorrespondenceMadeActiveDateTime();
		java.util.Date value13 = null;
		if ( dateTime13 != null ) 
		{
			value13 = dateTime13.getJavaDate();
		}
		domainObject.setCorrespondenceMadeActiveDateTime(value13);

		return domainObject;
	}

}
