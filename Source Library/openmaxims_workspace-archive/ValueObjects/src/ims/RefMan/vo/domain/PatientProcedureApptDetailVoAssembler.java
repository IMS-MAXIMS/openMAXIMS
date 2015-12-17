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
public class PatientProcedureApptDetailVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.PatientProcedureApptDetailVo copy(ims.RefMan.vo.PatientProcedureApptDetailVo valueObjectDest, ims.RefMan.vo.PatientProcedureApptDetailVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientProcedure(valueObjectSrc.getID_PatientProcedure());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Appointment
		valueObjectDest.setAppointment(valueObjectSrc.getAppointment());
		// isPrimaryProcedure
		valueObjectDest.setIsPrimaryProcedure(valueObjectSrc.getIsPrimaryProcedure());
		// Procedure
		valueObjectDest.setProcedure(valueObjectSrc.getProcedure());
		// ProcedureDescription
		valueObjectDest.setProcedureDescription(valueObjectSrc.getProcedureDescription());
		// InfoSource
		valueObjectDest.setInfoSource(valueObjectSrc.getInfoSource());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// EpisodeOfCare
		valueObjectDest.setEpisodeOfCare(valueObjectSrc.getEpisodeOfCare());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// ProcDate
		valueObjectDest.setProcDate(valueObjectSrc.getProcDate());
		// ProcedureStatus
		valueObjectDest.setProcedureStatus(valueObjectSrc.getProcedureStatus());
		// IncompleteReason
		valueObjectDest.setIncompleteReason(valueObjectSrc.getIncompleteReason());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientProcedureApptDetailVoCollectionFromPatientProcedureApptDetail(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.PatientProcedureApptDetail objects.
	 */
	public static ims.RefMan.vo.PatientProcedureApptDetailVoCollection createPatientProcedureApptDetailVoCollectionFromPatientProcedureApptDetail(java.util.Set domainObjectSet)	
	{
		return createPatientProcedureApptDetailVoCollectionFromPatientProcedureApptDetail(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.PatientProcedureApptDetail objects.
	 */
	public static ims.RefMan.vo.PatientProcedureApptDetailVoCollection createPatientProcedureApptDetailVoCollectionFromPatientProcedureApptDetail(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.PatientProcedureApptDetailVoCollection voList = new ims.RefMan.vo.PatientProcedureApptDetailVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.PatientProcedureApptDetail domainObject = (ims.RefMan.domain.objects.PatientProcedureApptDetail) iterator.next();
			ims.RefMan.vo.PatientProcedureApptDetailVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.PatientProcedureApptDetail objects.
	 */
	public static ims.RefMan.vo.PatientProcedureApptDetailVoCollection createPatientProcedureApptDetailVoCollectionFromPatientProcedureApptDetail(java.util.List domainObjectList) 
	{
		return createPatientProcedureApptDetailVoCollectionFromPatientProcedureApptDetail(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.PatientProcedureApptDetail objects.
	 */
	public static ims.RefMan.vo.PatientProcedureApptDetailVoCollection createPatientProcedureApptDetailVoCollectionFromPatientProcedureApptDetail(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.PatientProcedureApptDetailVoCollection voList = new ims.RefMan.vo.PatientProcedureApptDetailVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.PatientProcedureApptDetail domainObject = (ims.RefMan.domain.objects.PatientProcedureApptDetail) domainObjectList.get(i);
			ims.RefMan.vo.PatientProcedureApptDetailVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.PatientProcedureApptDetail set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientProcedureApptDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientProcedureApptDetailVoCollection voCollection) 
	 {
	 	return extractPatientProcedureApptDetailSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientProcedureApptDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientProcedureApptDetailVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientProcedureApptDetailVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.PatientProcedureApptDetail domainObject = PatientProcedureApptDetailVoAssembler.extractPatientProcedureApptDetail(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.PatientProcedureApptDetail list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientProcedureApptDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientProcedureApptDetailVoCollection voCollection) 
	 {
	 	return extractPatientProcedureApptDetailList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientProcedureApptDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientProcedureApptDetailVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientProcedureApptDetailVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.PatientProcedureApptDetail domainObject = PatientProcedureApptDetailVoAssembler.extractPatientProcedureApptDetail(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.PatientProcedureApptDetail object.
	 * @param domainObject ims.RefMan.domain.objects.PatientProcedureApptDetail
	 */
	 public static ims.RefMan.vo.PatientProcedureApptDetailVo create(ims.RefMan.domain.objects.PatientProcedureApptDetail domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.PatientProcedureApptDetail object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.PatientProcedureApptDetailVo create(DomainObjectMap map, ims.RefMan.domain.objects.PatientProcedureApptDetail domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.PatientProcedureApptDetailVo valueObject = (ims.RefMan.vo.PatientProcedureApptDetailVo) map.getValueObject(domainObject, ims.RefMan.vo.PatientProcedureApptDetailVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.PatientProcedureApptDetailVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.PatientProcedureApptDetail
	 */
	 public static ims.RefMan.vo.PatientProcedureApptDetailVo insert(ims.RefMan.vo.PatientProcedureApptDetailVo valueObject, ims.RefMan.domain.objects.PatientProcedureApptDetail domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.PatientProcedureApptDetail
	 */
	 public static ims.RefMan.vo.PatientProcedureApptDetailVo insert(DomainObjectMap map, ims.RefMan.vo.PatientProcedureApptDetailVo valueObject, ims.RefMan.domain.objects.PatientProcedureApptDetail domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientProcedure(domainObject.getId());
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
		// isPrimaryProcedure
		valueObject.setIsPrimaryProcedure( domainObject.isIsPrimaryProcedure() );
		// Procedure
		valueObject.setProcedure(ims.core.vo.domain.ProcedureLiteVoAssembler.create(map, domainObject.getProcedure()) );
		// ProcedureDescription
		valueObject.setProcedureDescription(domainObject.getProcedureDescription());
		// InfoSource
		ims.domain.lookups.LookupInstance instance5 = domainObject.getInfoSource();
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

			ims.core.vo.lookups.SourceofInformation voLookup5 = new ims.core.vo.lookups.SourceofInformation(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.SourceofInformation parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.SourceofInformation(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setInfoSource(voLookup5);
		}
				// CareContext
		if (domainObject.getCareContext() != null)
		{
			if(domainObject.getCareContext() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCareContext();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(id, -1));				
			}
			else
			{
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(domainObject.getCareContext().getId(), domainObject.getCareContext().getVersion()));
			}
		}
		// EpisodeOfCare
		if (domainObject.getEpisodeOfCare() != null)
		{
			if(domainObject.getEpisodeOfCare() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getEpisodeOfCare();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setEpisodeOfCare(new ims.core.admin.vo.EpisodeOfCareRefVo(id, -1));				
			}
			else
			{
				valueObject.setEpisodeOfCare(new ims.core.admin.vo.EpisodeOfCareRefVo(domainObject.getEpisodeOfCare().getId(), domainObject.getEpisodeOfCare().getVersion()));
			}
		}
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// ProcDate
		Integer ProcDate = domainObject.getProcDate();
		if ( null != ProcDate ) 
		{
			valueObject.setProcDate(new ims.framework.utils.PartialDate(ProcDate) );
		}
		// ProcedureStatus
		ims.domain.lookups.LookupInstance instance10 = domainObject.getProcedureStatus();
		if ( null != instance10 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance10.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance10.getImage().getImageId(), instance10.getImage().getImagePath());
			}
			color = instance10.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PatientProcedureStatus voLookup10 = new ims.core.vo.lookups.PatientProcedureStatus(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.PatientProcedureStatus parentVoLookup10 = voLookup10;
			ims.domain.lookups.LookupInstance parent10 = instance10.getParent();
			while (parent10 != null)
			{
				if (parent10.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent10.getImage().getImageId(), parent10.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent10.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup10.setParent(new ims.core.vo.lookups.PatientProcedureStatus(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setProcedureStatus(voLookup10);
		}
				// IncompleteReason
		ims.domain.lookups.LookupInstance instance11 = domainObject.getIncompleteReason();
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

			ims.core.vo.lookups.ProcedureIncompleteReason voLookup11 = new ims.core.vo.lookups.ProcedureIncompleteReason(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.core.vo.lookups.ProcedureIncompleteReason parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.core.vo.lookups.ProcedureIncompleteReason(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setIncompleteReason(voLookup11);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.PatientProcedureApptDetail extractPatientProcedureApptDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientProcedureApptDetailVo valueObject) 
	{
		return 	extractPatientProcedureApptDetail(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.PatientProcedureApptDetail extractPatientProcedureApptDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientProcedureApptDetailVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientProcedure();
		ims.RefMan.domain.objects.PatientProcedureApptDetail domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.PatientProcedureApptDetail)domMap.get(valueObject);
			}
			// ims.RefMan.vo.PatientProcedureApptDetailVo ID_PatientProcedureApptDetail field is unknown
			domainObject = new ims.RefMan.domain.objects.PatientProcedureApptDetail();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientProcedure());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.PatientProcedureApptDetail)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.PatientProcedureApptDetail) domainFactory.getDomainObject(ims.RefMan.domain.objects.PatientProcedureApptDetail.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientProcedure());

		ims.scheduling.domain.objects.Booking_Appointment value1 = null;
		if ( null != valueObject.getAppointment() ) 
		{
			if (valueObject.getAppointment().getBoId() == null)
			{
				if (domMap.get(valueObject.getAppointment()) != null)
				{
					value1 = (ims.scheduling.domain.objects.Booking_Appointment)domMap.get(valueObject.getAppointment());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getAppointment();	
			}
			else
			{
				value1 = (ims.scheduling.domain.objects.Booking_Appointment)domainFactory.getDomainObject(ims.scheduling.domain.objects.Booking_Appointment.class, valueObject.getAppointment().getBoId());
			}
		}
		domainObject.setAppointment(value1);
		domainObject.setIsPrimaryProcedure(valueObject.getIsPrimaryProcedure());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Procedure value3 = null;
		if ( null != valueObject.getProcedure() ) 
		{
			if (valueObject.getProcedure().getBoId() == null)
			{
				if (domMap.get(valueObject.getProcedure()) != null)
				{
					value3 = (ims.core.clinical.domain.objects.Procedure)domMap.get(valueObject.getProcedure());
				}
			}
			else
			{
				value3 = (ims.core.clinical.domain.objects.Procedure)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Procedure.class, valueObject.getProcedure().getBoId());
			}
		}
		domainObject.setProcedure(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getProcedureDescription() != null && valueObject.getProcedureDescription().equals(""))
		{
			valueObject.setProcedureDescription(null);
		}
		domainObject.setProcedureDescription(valueObject.getProcedureDescription());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getInfoSource() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getInfoSource().getID());
		}
		domainObject.setInfoSource(value5);
		ims.core.admin.domain.objects.CareContext value6 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value6 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value6 = domainObject.getCareContext();	
			}
			else
			{
				value6 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value6);
		ims.core.admin.domain.objects.EpisodeOfCare value7 = null;
		if ( null != valueObject.getEpisodeOfCare() ) 
		{
			if (valueObject.getEpisodeOfCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisodeOfCare()) != null)
				{
					value7 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisodeOfCare());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value7 = domainObject.getEpisodeOfCare();	
			}
			else
			{
				value7 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisodeOfCare().getBoId());
			}
		}
		domainObject.setEpisodeOfCare(value7);
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		ims.framework.utils.PartialDate ProcDate = valueObject.getProcDate();
		Integer value9 = null;
		if ( null != ProcDate ) 
		{
			value9 = ProcDate.toInteger();
		}
		domainObject.setProcDate(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getProcedureStatus() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getProcedureStatus().getID());
		}
		domainObject.setProcedureStatus(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getIncompleteReason() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getIncompleteReason().getID());
		}
		domainObject.setIncompleteReason(value11);

		return domainObject;
	}

}
