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
public class PatientProcedureForAppointmentOutcomeVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.PatientProcedureForAppointmentOutcomeVo copy(ims.RefMan.vo.PatientProcedureForAppointmentOutcomeVo valueObjectDest, ims.RefMan.vo.PatientProcedureForAppointmentOutcomeVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientProcedure(valueObjectSrc.getID_PatientProcedure());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Procedure
		valueObjectDest.setProcedure(valueObjectSrc.getProcedure());
		// ProcedureDescription
		valueObjectDest.setProcedureDescription(valueObjectSrc.getProcedureDescription());
		// SiteText
		valueObjectDest.setSiteText(valueObjectSrc.getSiteText());
		// ProcLaterality
		valueObjectDest.setProcLaterality(valueObjectSrc.getProcLaterality());
		// ProcDate
		valueObjectDest.setProcDate(valueObjectSrc.getProcDate());
		// PeformedBy
		valueObjectDest.setPeformedBy(valueObjectSrc.getPeformedBy());
		// InfoSource
		valueObjectDest.setInfoSource(valueObjectSrc.getInfoSource());
		// EpisodeOfCare
		valueObjectDest.setEpisodeOfCare(valueObjectSrc.getEpisodeOfCare());
		// isPrimary
		valueObjectDest.setIsPrimary(valueObjectSrc.getIsPrimary());
		// ProcedureStatus
		valueObjectDest.setProcedureStatus(valueObjectSrc.getProcedureStatus());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientProcedureForAppointmentOutcomeVoCollectionFromPatientProcedure(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientProcedure objects.
	 */
	public static ims.RefMan.vo.PatientProcedureForAppointmentOutcomeVoCollection createPatientProcedureForAppointmentOutcomeVoCollectionFromPatientProcedure(java.util.Set domainObjectSet)	
	{
		return createPatientProcedureForAppointmentOutcomeVoCollectionFromPatientProcedure(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientProcedure objects.
	 */
	public static ims.RefMan.vo.PatientProcedureForAppointmentOutcomeVoCollection createPatientProcedureForAppointmentOutcomeVoCollectionFromPatientProcedure(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.PatientProcedureForAppointmentOutcomeVoCollection voList = new ims.RefMan.vo.PatientProcedureForAppointmentOutcomeVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.PatientProcedure domainObject = (ims.core.clinical.domain.objects.PatientProcedure) iterator.next();
			ims.RefMan.vo.PatientProcedureForAppointmentOutcomeVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientProcedure objects.
	 */
	public static ims.RefMan.vo.PatientProcedureForAppointmentOutcomeVoCollection createPatientProcedureForAppointmentOutcomeVoCollectionFromPatientProcedure(java.util.List domainObjectList) 
	{
		return createPatientProcedureForAppointmentOutcomeVoCollectionFromPatientProcedure(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientProcedure objects.
	 */
	public static ims.RefMan.vo.PatientProcedureForAppointmentOutcomeVoCollection createPatientProcedureForAppointmentOutcomeVoCollectionFromPatientProcedure(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.PatientProcedureForAppointmentOutcomeVoCollection voList = new ims.RefMan.vo.PatientProcedureForAppointmentOutcomeVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.PatientProcedure domainObject = (ims.core.clinical.domain.objects.PatientProcedure) domainObjectList.get(i);
			ims.RefMan.vo.PatientProcedureForAppointmentOutcomeVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.PatientProcedure set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientProcedureSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientProcedureForAppointmentOutcomeVoCollection voCollection) 
	 {
	 	return extractPatientProcedureSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientProcedureSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientProcedureForAppointmentOutcomeVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientProcedureForAppointmentOutcomeVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientProcedure domainObject = PatientProcedureForAppointmentOutcomeVoAssembler.extractPatientProcedure(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.PatientProcedure list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientProcedureList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientProcedureForAppointmentOutcomeVoCollection voCollection) 
	 {
	 	return extractPatientProcedureList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientProcedureList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientProcedureForAppointmentOutcomeVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientProcedureForAppointmentOutcomeVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientProcedure domainObject = PatientProcedureForAppointmentOutcomeVoAssembler.extractPatientProcedure(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.PatientProcedure object.
	 * @param domainObject ims.core.clinical.domain.objects.PatientProcedure
	 */
	 public static ims.RefMan.vo.PatientProcedureForAppointmentOutcomeVo create(ims.core.clinical.domain.objects.PatientProcedure domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.PatientProcedure object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.PatientProcedureForAppointmentOutcomeVo create(DomainObjectMap map, ims.core.clinical.domain.objects.PatientProcedure domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.PatientProcedureForAppointmentOutcomeVo valueObject = (ims.RefMan.vo.PatientProcedureForAppointmentOutcomeVo) map.getValueObject(domainObject, ims.RefMan.vo.PatientProcedureForAppointmentOutcomeVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.PatientProcedureForAppointmentOutcomeVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.PatientProcedure
	 */
	 public static ims.RefMan.vo.PatientProcedureForAppointmentOutcomeVo insert(ims.RefMan.vo.PatientProcedureForAppointmentOutcomeVo valueObject, ims.core.clinical.domain.objects.PatientProcedure domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.PatientProcedure
	 */
	 public static ims.RefMan.vo.PatientProcedureForAppointmentOutcomeVo insert(DomainObjectMap map, ims.RefMan.vo.PatientProcedureForAppointmentOutcomeVo valueObject, ims.core.clinical.domain.objects.PatientProcedure domainObject) 
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
			
		// Procedure
		valueObject.setProcedure(ims.core.vo.domain.ProcedureLiteVoAssembler.create(map, domainObject.getProcedure()) );
		// ProcedureDescription
		valueObject.setProcedureDescription(domainObject.getProcedureDescription());
		// SiteText
		valueObject.setSiteText(domainObject.getSiteText());
		// ProcLaterality
		ims.domain.lookups.LookupInstance instance4 = domainObject.getProcLaterality();
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

			ims.core.vo.lookups.LateralityLRB voLookup4 = new ims.core.vo.lookups.LateralityLRB(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.LateralityLRB parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.LateralityLRB(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setProcLaterality(voLookup4);
		}
				// ProcDate
		Integer ProcDate = domainObject.getProcDate();
		if ( null != ProcDate ) 
		{
			valueObject.setProcDate(new ims.framework.utils.PartialDate(ProcDate) );
		}
		// PeformedBy
		valueObject.setPeformedBy(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getPeformedBy()) );
		// InfoSource
		ims.domain.lookups.LookupInstance instance7 = domainObject.getInfoSource();
		if ( null != instance7 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance7.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance7.getImage().getImageId(), instance7.getImage().getImagePath());
			}
			color = instance7.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.SourceofInformation voLookup7 = new ims.core.vo.lookups.SourceofInformation(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.SourceofInformation parentVoLookup7 = voLookup7;
			ims.domain.lookups.LookupInstance parent7 = instance7.getParent();
			while (parent7 != null)
			{
				if (parent7.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent7.getImage().getImageId(), parent7.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent7.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup7.setParent(new ims.core.vo.lookups.SourceofInformation(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setInfoSource(voLookup7);
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
		// isPrimary
		valueObject.setIsPrimary( domainObject.isIsPrimary() );
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
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.PatientProcedure extractPatientProcedure(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientProcedureForAppointmentOutcomeVo valueObject) 
	{
		return 	extractPatientProcedure(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.PatientProcedure extractPatientProcedure(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientProcedureForAppointmentOutcomeVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientProcedure();
		ims.core.clinical.domain.objects.PatientProcedure domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.PatientProcedure)domMap.get(valueObject);
			}
			// ims.RefMan.vo.PatientProcedureForAppointmentOutcomeVo ID_PatientProcedure field is unknown
			domainObject = new ims.core.clinical.domain.objects.PatientProcedure();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientProcedure());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.PatientProcedure)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.PatientProcedure) domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientProcedure.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientProcedure());

		domainObject.setProcedure(ims.core.vo.domain.ProcedureLiteVoAssembler.extractProcedure(domainFactory, valueObject.getProcedure(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getProcedureDescription() != null && valueObject.getProcedureDescription().equals(""))
		{
			valueObject.setProcedureDescription(null);
		}
		domainObject.setProcedureDescription(valueObject.getProcedureDescription());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSiteText() != null && valueObject.getSiteText().equals(""))
		{
			valueObject.setSiteText(null);
		}
		domainObject.setSiteText(valueObject.getSiteText());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getProcLaterality() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getProcLaterality().getID());
		}
		domainObject.setProcLaterality(value4);
		ims.framework.utils.PartialDate ProcDate = valueObject.getProcDate();
		Integer value5 = null;
		if ( null != ProcDate ) 
		{
			value5 = ProcDate.toInteger();
		}
		domainObject.setProcDate(value5);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value6 = null;
		if ( null != valueObject.getPeformedBy() ) 
		{
			if (valueObject.getPeformedBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getPeformedBy()) != null)
				{
					value6 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getPeformedBy());
				}
			}
			else
			{
				value6 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getPeformedBy().getBoId());
			}
		}
		domainObject.setPeformedBy(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getInfoSource() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getInfoSource().getID());
		}
		domainObject.setInfoSource(value7);
		ims.core.admin.domain.objects.EpisodeOfCare value8 = null;
		if ( null != valueObject.getEpisodeOfCare() ) 
		{
			if (valueObject.getEpisodeOfCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisodeOfCare()) != null)
				{
					value8 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisodeOfCare());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value8 = domainObject.getEpisodeOfCare();	
			}
			else
			{
				value8 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisodeOfCare().getBoId());
			}
		}
		domainObject.setEpisodeOfCare(value8);
		domainObject.setIsPrimary(valueObject.getIsPrimary());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getProcedureStatus() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getProcedureStatus().getID());
		}
		domainObject.setProcedureStatus(value10);
		ims.core.admin.domain.objects.CareContext value11 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value11 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value11 = domainObject.getCareContext();	
			}
			else
			{
				value11 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value11);

		return domainObject;
	}

}
