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
 * @author George Cristian Josan
 */
public class PatientElectiveListBedAdmissionVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.PatientElectiveListBedAdmissionVo copy(ims.RefMan.vo.PatientElectiveListBedAdmissionVo valueObjectDest, ims.RefMan.vo.PatientElectiveListBedAdmissionVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientElectiveList(valueObjectSrc.getID_PatientElectiveList());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ElectiveList
		valueObjectDest.setElectiveList(valueObjectSrc.getElectiveList());
		// Ward
		valueObjectDest.setWard(valueObjectSrc.getWard());
		// Bed
		valueObjectDest.setBed(valueObjectSrc.getBed());
		// Consultant
		valueObjectDest.setConsultant(valueObjectSrc.getConsultant());
		// AnticipatedStay
		valueObjectDest.setAnticipatedStay(valueObjectSrc.getAnticipatedStay());
		// TCIDetails
		valueObjectDest.setTCIDetails(valueObjectSrc.getTCIDetails());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// ElectiveListStatus
		valueObjectDest.setElectiveListStatus(valueObjectSrc.getElectiveListStatus());
		// ElectiveListStatusHistory
		valueObjectDest.setElectiveListStatusHistory(valueObjectSrc.getElectiveListStatusHistory());
		// ElectiveListReason
		valueObjectDest.setElectiveListReason(valueObjectSrc.getElectiveListReason());
		// Referral
		valueObjectDest.setReferral(valueObjectSrc.getReferral());
		// EROD
		valueObjectDest.setEROD(valueObjectSrc.getEROD());
		// ERODHistory
		valueObjectDest.setERODHistory(valueObjectSrc.getERODHistory());
		// PathwayClock
		valueObjectDest.setPathwayClock(valueObjectSrc.getPathwayClock());
		// DateOnList
		valueObjectDest.setDateOnList(valueObjectSrc.getDateOnList());
		// PrimaryProcedure
		valueObjectDest.setPrimaryProcedure(valueObjectSrc.getPrimaryProcedure());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientElectiveListBedAdmissionVoCollectionFromPatientElectiveList(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListBedAdmissionVoCollection createPatientElectiveListBedAdmissionVoCollectionFromPatientElectiveList(java.util.Set domainObjectSet)	
	{
		return createPatientElectiveListBedAdmissionVoCollectionFromPatientElectiveList(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListBedAdmissionVoCollection createPatientElectiveListBedAdmissionVoCollectionFromPatientElectiveList(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.PatientElectiveListBedAdmissionVoCollection voList = new ims.RefMan.vo.PatientElectiveListBedAdmissionVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.PatientElectiveList domainObject = (ims.RefMan.domain.objects.PatientElectiveList) iterator.next();
			ims.RefMan.vo.PatientElectiveListBedAdmissionVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListBedAdmissionVoCollection createPatientElectiveListBedAdmissionVoCollectionFromPatientElectiveList(java.util.List domainObjectList) 
	{
		return createPatientElectiveListBedAdmissionVoCollectionFromPatientElectiveList(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListBedAdmissionVoCollection createPatientElectiveListBedAdmissionVoCollectionFromPatientElectiveList(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.PatientElectiveListBedAdmissionVoCollection voList = new ims.RefMan.vo.PatientElectiveListBedAdmissionVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.PatientElectiveList domainObject = (ims.RefMan.domain.objects.PatientElectiveList) domainObjectList.get(i);
			ims.RefMan.vo.PatientElectiveListBedAdmissionVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.PatientElectiveList set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientElectiveListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListBedAdmissionVoCollection voCollection) 
	 {
	 	return extractPatientElectiveListSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientElectiveListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListBedAdmissionVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientElectiveListBedAdmissionVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.PatientElectiveList domainObject = PatientElectiveListBedAdmissionVoAssembler.extractPatientElectiveList(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.PatientElectiveList list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientElectiveListList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListBedAdmissionVoCollection voCollection) 
	 {
	 	return extractPatientElectiveListList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientElectiveListList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListBedAdmissionVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientElectiveListBedAdmissionVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.PatientElectiveList domainObject = PatientElectiveListBedAdmissionVoAssembler.extractPatientElectiveList(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.PatientElectiveList object.
	 * @param domainObject ims.RefMan.domain.objects.PatientElectiveList
	 */
	 public static ims.RefMan.vo.PatientElectiveListBedAdmissionVo create(ims.RefMan.domain.objects.PatientElectiveList domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.PatientElectiveList object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.PatientElectiveListBedAdmissionVo create(DomainObjectMap map, ims.RefMan.domain.objects.PatientElectiveList domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.PatientElectiveListBedAdmissionVo valueObject = (ims.RefMan.vo.PatientElectiveListBedAdmissionVo) map.getValueObject(domainObject, ims.RefMan.vo.PatientElectiveListBedAdmissionVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.PatientElectiveListBedAdmissionVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.PatientElectiveList
	 */
	 public static ims.RefMan.vo.PatientElectiveListBedAdmissionVo insert(ims.RefMan.vo.PatientElectiveListBedAdmissionVo valueObject, ims.RefMan.domain.objects.PatientElectiveList domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.PatientElectiveList
	 */
	 public static ims.RefMan.vo.PatientElectiveListBedAdmissionVo insert(DomainObjectMap map, ims.RefMan.vo.PatientElectiveListBedAdmissionVo valueObject, ims.RefMan.domain.objects.PatientElectiveList domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientElectiveList(domainObject.getId());
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
			
		// ElectiveList
		valueObject.setElectiveList(ims.RefMan.vo.domain.ElectiveListConfigurationLiteVoAssembler.create(map, domainObject.getElectiveList()) );
		// Ward
		valueObject.setWard(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getWard()) );
		// Bed
		valueObject.setBed(domainObject.getBed());
		// Consultant
		valueObject.setConsultant(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getConsultant()) );
		// AnticipatedStay
		valueObject.setAnticipatedStay(domainObject.getAnticipatedStay());
		// TCIDetails
		valueObject.setTCIDetails(ims.ccosched.vo.domain.TCIForPatientElectiveListBedInfoDetailsVoAssembler.create(map, domainObject.getTCIDetails()) );
		// Patient
		valueObject.setPatient(ims.core.vo.domain.PatientLite_IdentifiersVoAssembler.create(map, domainObject.getPatient()) );
		// ElectiveListStatus
		valueObject.setElectiveListStatus(ims.RefMan.vo.domain.ElectiveListStatusVoAssembler.create(map, domainObject.getElectiveListStatus()) );
		// ElectiveListStatusHistory
		ims.RefMan.vo.ElectiveListStatusRefVoCollection ElectiveListStatusHistory = new ims.RefMan.vo.ElectiveListStatusRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getElectiveListStatusHistory().iterator(); iterator.hasNext(); ) 
		{
			ims.RefMan.domain.objects.ElectiveListStatus tmp = (ims.RefMan.domain.objects.ElectiveListStatus)iterator.next();
			if (tmp != null)
				ElectiveListStatusHistory.add(new ims.RefMan.vo.ElectiveListStatusRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setElectiveListStatusHistory(ElectiveListStatusHistory);
		// ElectiveListReason
		ims.domain.lookups.LookupInstance instance10 = domainObject.getElectiveListReason();
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

			ims.emergency.vo.lookups.ElectiveListReason voLookup10 = new ims.emergency.vo.lookups.ElectiveListReason(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.emergency.vo.lookups.ElectiveListReason parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.emergency.vo.lookups.ElectiveListReason(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setElectiveListReason(voLookup10);
		}
				// Referral
		valueObject.setReferral(ims.RefMan.vo.domain.CATSReferralWithContextPasVoAssembler.create(map, domainObject.getReferral()) );
		// EROD
		valueObject.setEROD(ims.RefMan.vo.domain.ReferralErodForCancellationVoAssembler.create(map, domainObject.getEROD()) );
		// ERODHistory
		ims.RefMan.vo.ReferralERODRefVoCollection ERODHistory = new ims.RefMan.vo.ReferralERODRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getERODHistory().iterator(); iterator.hasNext(); ) 
		{
			ims.RefMan.domain.objects.ReferralEROD tmp = (ims.RefMan.domain.objects.ReferralEROD)iterator.next();
			if (tmp != null)
				ERODHistory.add(new ims.RefMan.vo.ReferralERODRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setERODHistory(ERODHistory);
		// PathwayClock
		valueObject.setPathwayClock(ims.pathways.vo.domain.PathwayClockVoAssembler.create(map, domainObject.getPathwayClock()) );
		// DateOnList
		java.util.Date DateOnList = domainObject.getDateOnList();
		if ( null != DateOnList ) 
		{
			valueObject.setDateOnList(new ims.framework.utils.Date(DateOnList) );
		}
		// PrimaryProcedure
		valueObject.setPrimaryProcedure(ims.core.vo.domain.ProcedureLiteVoAssembler.create(map, domainObject.getPrimaryProcedure()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.PatientElectiveList extractPatientElectiveList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListBedAdmissionVo valueObject) 
	{
		return 	extractPatientElectiveList(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.PatientElectiveList extractPatientElectiveList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListBedAdmissionVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientElectiveList();
		ims.RefMan.domain.objects.PatientElectiveList domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.PatientElectiveList)domMap.get(valueObject);
			}
			// ims.RefMan.vo.PatientElectiveListBedAdmissionVo ID_PatientElectiveList field is unknown
			domainObject = new ims.RefMan.domain.objects.PatientElectiveList();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientElectiveList());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.PatientElectiveList)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.PatientElectiveList) domainFactory.getDomainObject(ims.RefMan.domain.objects.PatientElectiveList.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientElectiveList());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.configuration.domain.objects.ElectiveListConfiguration value1 = null;
		if ( null != valueObject.getElectiveList() ) 
		{
			if (valueObject.getElectiveList().getBoId() == null)
			{
				if (domMap.get(valueObject.getElectiveList()) != null)
				{
					value1 = (ims.core.configuration.domain.objects.ElectiveListConfiguration)domMap.get(valueObject.getElectiveList());
				}
			}
			else
			{
				value1 = (ims.core.configuration.domain.objects.ElectiveListConfiguration)domainFactory.getDomainObject(ims.core.configuration.domain.objects.ElectiveListConfiguration.class, valueObject.getElectiveList().getBoId());
			}
		}
		domainObject.setElectiveList(value1);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value2 = null;
		if ( null != valueObject.getWard() ) 
		{
			if (valueObject.getWard().getBoId() == null)
			{
				if (domMap.get(valueObject.getWard()) != null)
				{
					value2 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getWard());
				}
			}
			else
			{
				value2 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getWard().getBoId());
			}
		}
		domainObject.setWard(value2);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getBed() != null && valueObject.getBed().equals(""))
		{
			valueObject.setBed(null);
		}
		domainObject.setBed(valueObject.getBed());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value4 = null;
		if ( null != valueObject.getConsultant() ) 
		{
			if (valueObject.getConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getConsultant()) != null)
				{
					value4 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getConsultant());
				}
			}
			else
			{
				value4 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getConsultant().getBoId());
			}
		}
		domainObject.setConsultant(value4);
		domainObject.setAnticipatedStay(valueObject.getAnticipatedStay());
		domainObject.setTCIDetails(ims.ccosched.vo.domain.TCIForPatientElectiveListBedInfoDetailsVoAssembler.extractTCIForPatientElectiveList(domainFactory, valueObject.getTCIDetails(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.patient.domain.objects.Patient value7 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value7 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else
			{
				value7 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value7);
		domainObject.setElectiveListStatus(ims.RefMan.vo.domain.ElectiveListStatusVoAssembler.extractElectiveListStatus(domainFactory, valueObject.getElectiveListStatus(), domMap));

		ims.RefMan.vo.ElectiveListStatusRefVoCollection refCollection9 = valueObject.getElectiveListStatusHistory();
		int size9 = (null == refCollection9) ? 0 : refCollection9.size();		
		java.util.List domainElectiveListStatusHistory9 = domainObject.getElectiveListStatusHistory();
		if (domainElectiveListStatusHistory9 == null)
		{
			domainElectiveListStatusHistory9 = new java.util.ArrayList();
		}
		for(int i=0; i < size9; i++) 
		{
			ims.RefMan.vo.ElectiveListStatusRefVo vo = refCollection9.get(i);			
			ims.RefMan.domain.objects.ElectiveListStatus dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.RefMan.domain.objects.ElectiveListStatus)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.RefMan.domain.objects.ElectiveListStatus)domainFactory.getDomainObject( ims.RefMan.domain.objects.ElectiveListStatus.class, vo.getBoId());
				}
			}

			int domIdx = domainElectiveListStatusHistory9.indexOf(dom);
			if (domIdx == -1)
			{
				domainElectiveListStatusHistory9.add(i, dom);
			}
			else if (i != domIdx && i < domainElectiveListStatusHistory9.size())
			{
				Object tmp = domainElectiveListStatusHistory9.get(i);
				domainElectiveListStatusHistory9.set(i, domainElectiveListStatusHistory9.get(domIdx));
				domainElectiveListStatusHistory9.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i9 = domainElectiveListStatusHistory9.size();
		while (i9 > size9)
		{
			domainElectiveListStatusHistory9.remove(i9-1);
			i9 = domainElectiveListStatusHistory9.size();
		}
		
		domainObject.setElectiveListStatusHistory(domainElectiveListStatusHistory9);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getElectiveListReason() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getElectiveListReason().getID());
		}
		domainObject.setElectiveListReason(value10);
		domainObject.setReferral(ims.RefMan.vo.domain.CATSReferralWithContextPasVoAssembler.extractCatsReferral(domainFactory, valueObject.getReferral(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.RefMan.domain.objects.ReferralEROD value12 = null;
		if ( null != valueObject.getEROD() ) 
		{
			if (valueObject.getEROD().getBoId() == null)
			{
				if (domMap.get(valueObject.getEROD()) != null)
				{
					value12 = (ims.RefMan.domain.objects.ReferralEROD)domMap.get(valueObject.getEROD());
				}
			}
			else
			{
				value12 = (ims.RefMan.domain.objects.ReferralEROD)domainFactory.getDomainObject(ims.RefMan.domain.objects.ReferralEROD.class, valueObject.getEROD().getBoId());
			}
		}
		domainObject.setEROD(value12);

		ims.RefMan.vo.ReferralERODRefVoCollection refCollection13 = valueObject.getERODHistory();
		int size13 = (null == refCollection13) ? 0 : refCollection13.size();		
		java.util.List domainERODHistory13 = domainObject.getERODHistory();
		if (domainERODHistory13 == null)
		{
			domainERODHistory13 = new java.util.ArrayList();
		}
		for(int i=0; i < size13; i++) 
		{
			ims.RefMan.vo.ReferralERODRefVo vo = refCollection13.get(i);			
			ims.RefMan.domain.objects.ReferralEROD dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.RefMan.domain.objects.ReferralEROD)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.RefMan.domain.objects.ReferralEROD)domainFactory.getDomainObject( ims.RefMan.domain.objects.ReferralEROD.class, vo.getBoId());
				}
			}

			int domIdx = domainERODHistory13.indexOf(dom);
			if (domIdx == -1)
			{
				domainERODHistory13.add(i, dom);
			}
			else if (i != domIdx && i < domainERODHistory13.size())
			{
				Object tmp = domainERODHistory13.get(i);
				domainERODHistory13.set(i, domainERODHistory13.get(domIdx));
				domainERODHistory13.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i13 = domainERODHistory13.size();
		while (i13 > size13)
		{
			domainERODHistory13.remove(i13-1);
			i13 = domainERODHistory13.size();
		}
		
		domainObject.setERODHistory(domainERODHistory13);		
		domainObject.setPathwayClock(ims.pathways.vo.domain.PathwayClockVoAssembler.extractPathwayClock(domainFactory, valueObject.getPathwayClock(), domMap));
		java.util.Date value15 = null;
		ims.framework.utils.Date date15 = valueObject.getDateOnList();		
		if ( date15 != null ) 
		{
			value15 = date15.getDate();
		}
		domainObject.setDateOnList(value15);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Procedure value16 = null;
		if ( null != valueObject.getPrimaryProcedure() ) 
		{
			if (valueObject.getPrimaryProcedure().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrimaryProcedure()) != null)
				{
					value16 = (ims.core.clinical.domain.objects.Procedure)domMap.get(valueObject.getPrimaryProcedure());
				}
			}
			else
			{
				value16 = (ims.core.clinical.domain.objects.Procedure)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Procedure.class, valueObject.getPrimaryProcedure().getBoId());
			}
		}
		domainObject.setPrimaryProcedure(value16);

		return domainObject;
	}

}
