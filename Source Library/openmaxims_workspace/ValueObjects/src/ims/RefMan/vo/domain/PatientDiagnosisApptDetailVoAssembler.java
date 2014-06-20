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
public class PatientDiagnosisApptDetailVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.PatientDiagnosisApptDetailVo copy(ims.RefMan.vo.PatientDiagnosisApptDetailVo valueObjectDest, ims.RefMan.vo.PatientDiagnosisApptDetailVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientDiagnosis(valueObjectSrc.getID_PatientDiagnosis());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Appointment
		valueObjectDest.setAppointment(valueObjectSrc.getAppointment());
		// Diagnosis
		valueObjectDest.setDiagnosis(valueObjectSrc.getDiagnosis());
		// DiagnosisDescription
		valueObjectDest.setDiagnosisDescription(valueObjectSrc.getDiagnosisDescription());
		// SourceofInformation
		valueObjectDest.setSourceofInformation(valueObjectSrc.getSourceofInformation());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// EpisodeOfCare
		valueObjectDest.setEpisodeOfCare(valueObjectSrc.getEpisodeOfCare());
		// AuthoringInfo
		valueObjectDest.setAuthoringInfo(valueObjectSrc.getAuthoringInfo());
		// PrimaryForCareSpells
		valueObjectDest.setPrimaryForCareSpells(valueObjectSrc.getPrimaryForCareSpells());
		// DiagnosedDate
		valueObjectDest.setDiagnosedDate(valueObjectSrc.getDiagnosedDate());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientDiagnosisApptDetailVoCollectionFromPatientDiagnosisApptDetail(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.PatientDiagnosisApptDetail objects.
	 */
	public static ims.RefMan.vo.PatientDiagnosisApptDetailVoCollection createPatientDiagnosisApptDetailVoCollectionFromPatientDiagnosisApptDetail(java.util.Set domainObjectSet)	
	{
		return createPatientDiagnosisApptDetailVoCollectionFromPatientDiagnosisApptDetail(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.PatientDiagnosisApptDetail objects.
	 */
	public static ims.RefMan.vo.PatientDiagnosisApptDetailVoCollection createPatientDiagnosisApptDetailVoCollectionFromPatientDiagnosisApptDetail(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.PatientDiagnosisApptDetailVoCollection voList = new ims.RefMan.vo.PatientDiagnosisApptDetailVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.PatientDiagnosisApptDetail domainObject = (ims.RefMan.domain.objects.PatientDiagnosisApptDetail) iterator.next();
			ims.RefMan.vo.PatientDiagnosisApptDetailVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.PatientDiagnosisApptDetail objects.
	 */
	public static ims.RefMan.vo.PatientDiagnosisApptDetailVoCollection createPatientDiagnosisApptDetailVoCollectionFromPatientDiagnosisApptDetail(java.util.List domainObjectList) 
	{
		return createPatientDiagnosisApptDetailVoCollectionFromPatientDiagnosisApptDetail(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.PatientDiagnosisApptDetail objects.
	 */
	public static ims.RefMan.vo.PatientDiagnosisApptDetailVoCollection createPatientDiagnosisApptDetailVoCollectionFromPatientDiagnosisApptDetail(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.PatientDiagnosisApptDetailVoCollection voList = new ims.RefMan.vo.PatientDiagnosisApptDetailVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.PatientDiagnosisApptDetail domainObject = (ims.RefMan.domain.objects.PatientDiagnosisApptDetail) domainObjectList.get(i);
			ims.RefMan.vo.PatientDiagnosisApptDetailVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.PatientDiagnosisApptDetail set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientDiagnosisApptDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientDiagnosisApptDetailVoCollection voCollection) 
	 {
	 	return extractPatientDiagnosisApptDetailSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientDiagnosisApptDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientDiagnosisApptDetailVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientDiagnosisApptDetailVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.PatientDiagnosisApptDetail domainObject = PatientDiagnosisApptDetailVoAssembler.extractPatientDiagnosisApptDetail(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.PatientDiagnosisApptDetail list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientDiagnosisApptDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientDiagnosisApptDetailVoCollection voCollection) 
	 {
	 	return extractPatientDiagnosisApptDetailList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientDiagnosisApptDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientDiagnosisApptDetailVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientDiagnosisApptDetailVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.PatientDiagnosisApptDetail domainObject = PatientDiagnosisApptDetailVoAssembler.extractPatientDiagnosisApptDetail(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.PatientDiagnosisApptDetail object.
	 * @param domainObject ims.RefMan.domain.objects.PatientDiagnosisApptDetail
	 */
	 public static ims.RefMan.vo.PatientDiagnosisApptDetailVo create(ims.RefMan.domain.objects.PatientDiagnosisApptDetail domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.PatientDiagnosisApptDetail object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.PatientDiagnosisApptDetailVo create(DomainObjectMap map, ims.RefMan.domain.objects.PatientDiagnosisApptDetail domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.PatientDiagnosisApptDetailVo valueObject = (ims.RefMan.vo.PatientDiagnosisApptDetailVo) map.getValueObject(domainObject, ims.RefMan.vo.PatientDiagnosisApptDetailVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.PatientDiagnosisApptDetailVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.PatientDiagnosisApptDetail
	 */
	 public static ims.RefMan.vo.PatientDiagnosisApptDetailVo insert(ims.RefMan.vo.PatientDiagnosisApptDetailVo valueObject, ims.RefMan.domain.objects.PatientDiagnosisApptDetail domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.PatientDiagnosisApptDetail
	 */
	 public static ims.RefMan.vo.PatientDiagnosisApptDetailVo insert(DomainObjectMap map, ims.RefMan.vo.PatientDiagnosisApptDetailVo valueObject, ims.RefMan.domain.objects.PatientDiagnosisApptDetail domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientDiagnosis(domainObject.getId());
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
		// Diagnosis
		valueObject.setDiagnosis(ims.core.vo.domain.DiagLiteVoAssembler.create(map, domainObject.getDiagnosis()) );
		// DiagnosisDescription
		valueObject.setDiagnosisDescription(domainObject.getDiagnosisDescription());
		// SourceofInformation
		ims.domain.lookups.LookupInstance instance4 = domainObject.getSourceofInformation();
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

			ims.core.vo.lookups.SourceofInformation voLookup4 = new ims.core.vo.lookups.SourceofInformation(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.SourceofInformation parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.SourceofInformation(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setSourceofInformation(voLookup4);
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
		// AuthoringInfo
		valueObject.setAuthoringInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInfo()) );
		// PrimaryForCareSpells
		valueObject.setPrimaryForCareSpells(ims.RefMan.vo.domain.CSPrimaryDiagnosisForClinicalNotesVoAssembler.createCSPrimaryDiagnosisForClinicalNotesVoCollectionFromCsPrimaryDiagnosis(map, domainObject.getPrimaryForCareSpells()) );
		// DiagnosedDate
		Integer DiagnosedDate = domainObject.getDiagnosedDate();
		if ( null != DiagnosedDate ) 
		{
			valueObject.setDiagnosedDate(new ims.framework.utils.PartialDate(DiagnosedDate) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.PatientDiagnosisApptDetail extractPatientDiagnosisApptDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientDiagnosisApptDetailVo valueObject) 
	{
		return 	extractPatientDiagnosisApptDetail(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.PatientDiagnosisApptDetail extractPatientDiagnosisApptDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientDiagnosisApptDetailVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientDiagnosis();
		ims.RefMan.domain.objects.PatientDiagnosisApptDetail domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.PatientDiagnosisApptDetail)domMap.get(valueObject);
			}
			// ims.RefMan.vo.PatientDiagnosisApptDetailVo ID_PatientDiagnosisApptDetail field is unknown
			domainObject = new ims.RefMan.domain.objects.PatientDiagnosisApptDetail();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientDiagnosis());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.PatientDiagnosisApptDetail)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.PatientDiagnosisApptDetail) domainFactory.getDomainObject(ims.RefMan.domain.objects.PatientDiagnosisApptDetail.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientDiagnosis());

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
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Diagnosis value2 = null;
		if ( null != valueObject.getDiagnosis() ) 
		{
			if (valueObject.getDiagnosis().getBoId() == null)
			{
				if (domMap.get(valueObject.getDiagnosis()) != null)
				{
					value2 = (ims.core.clinical.domain.objects.Diagnosis)domMap.get(valueObject.getDiagnosis());
				}
			}
			else
			{
				value2 = (ims.core.clinical.domain.objects.Diagnosis)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Diagnosis.class, valueObject.getDiagnosis().getBoId());
			}
		}
		domainObject.setDiagnosis(value2);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDiagnosisDescription() != null && valueObject.getDiagnosisDescription().equals(""))
		{
			valueObject.setDiagnosisDescription(null);
		}
		domainObject.setDiagnosisDescription(valueObject.getDiagnosisDescription());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getSourceofInformation() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getSourceofInformation().getID());
		}
		domainObject.setSourceofInformation(value4);
		ims.core.admin.domain.objects.CareContext value5 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value5 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value5 = domainObject.getCareContext();	
			}
			else
			{
				value5 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value5);
		ims.core.admin.domain.objects.EpisodeOfCare value6 = null;
		if ( null != valueObject.getEpisodeOfCare() ) 
		{
			if (valueObject.getEpisodeOfCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisodeOfCare()) != null)
				{
					value6 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisodeOfCare());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value6 = domainObject.getEpisodeOfCare();	
			}
			else
			{
				value6 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisodeOfCare().getBoId());
			}
		}
		domainObject.setEpisodeOfCare(value6);
		domainObject.setAuthoringInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInfo(), domMap));
		domainObject.setPrimaryForCareSpells(ims.RefMan.vo.domain.CSPrimaryDiagnosisForClinicalNotesVoAssembler.extractCsPrimaryDiagnosisSet(domainFactory, valueObject.getPrimaryForCareSpells(), domainObject.getPrimaryForCareSpells(), domMap));		
		ims.framework.utils.PartialDate DiagnosedDate = valueObject.getDiagnosedDate();
		Integer value9 = null;
		if ( null != DiagnosedDate ) 
		{
			value9 = DiagnosedDate.toInteger();
		}
		domainObject.setDiagnosedDate(value9);

		return domainObject;
	}

}
