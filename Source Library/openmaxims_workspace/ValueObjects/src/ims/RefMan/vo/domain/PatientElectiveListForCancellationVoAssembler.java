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
public class PatientElectiveListForCancellationVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.PatientElectiveListForCancellationVo copy(ims.RefMan.vo.PatientElectiveListForCancellationVo valueObjectDest, ims.RefMan.vo.PatientElectiveListForCancellationVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientElectiveList(valueObjectSrc.getID_PatientElectiveList());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ElectiveListStatus
		valueObjectDest.setElectiveListStatus(valueObjectSrc.getElectiveListStatus());
		// ElectiveListStatusHistory
		valueObjectDest.setElectiveListStatusHistory(valueObjectSrc.getElectiveListStatusHistory());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// Referral
		valueObjectDest.setReferral(valueObjectSrc.getReferral());
		// TCIDetails
		valueObjectDest.setTCIDetails(valueObjectSrc.getTCIDetails());
		// TCIHistory
		valueObjectDest.setTCIHistory(valueObjectSrc.getTCIHistory());
		// EROD
		valueObjectDest.setEROD(valueObjectSrc.getEROD());
		// ERODHistory
		valueObjectDest.setERODHistory(valueObjectSrc.getERODHistory());
		// PatientStatus
		valueObjectDest.setPatientStatus(valueObjectSrc.getPatientStatus());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientElectiveListForCancellationVoCollectionFromPatientElectiveList(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListForCancellationVoCollection createPatientElectiveListForCancellationVoCollectionFromPatientElectiveList(java.util.Set domainObjectSet)	
	{
		return createPatientElectiveListForCancellationVoCollectionFromPatientElectiveList(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListForCancellationVoCollection createPatientElectiveListForCancellationVoCollectionFromPatientElectiveList(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.PatientElectiveListForCancellationVoCollection voList = new ims.RefMan.vo.PatientElectiveListForCancellationVoCollection();
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
			ims.RefMan.vo.PatientElectiveListForCancellationVo vo = create(map, domainObject);
			
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
	public static ims.RefMan.vo.PatientElectiveListForCancellationVoCollection createPatientElectiveListForCancellationVoCollectionFromPatientElectiveList(java.util.List domainObjectList) 
	{
		return createPatientElectiveListForCancellationVoCollectionFromPatientElectiveList(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListForCancellationVoCollection createPatientElectiveListForCancellationVoCollectionFromPatientElectiveList(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.PatientElectiveListForCancellationVoCollection voList = new ims.RefMan.vo.PatientElectiveListForCancellationVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.PatientElectiveList domainObject = (ims.RefMan.domain.objects.PatientElectiveList) domainObjectList.get(i);
			ims.RefMan.vo.PatientElectiveListForCancellationVo vo = create(map, domainObject);

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
	 public static java.util.Set extractPatientElectiveListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListForCancellationVoCollection voCollection) 
	 {
	 	return extractPatientElectiveListSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientElectiveListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListForCancellationVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientElectiveListForCancellationVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.PatientElectiveList domainObject = PatientElectiveListForCancellationVoAssembler.extractPatientElectiveList(domainFactory, vo, domMap);

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
	 public static java.util.List extractPatientElectiveListList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListForCancellationVoCollection voCollection) 
	 {
	 	return extractPatientElectiveListList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientElectiveListList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListForCancellationVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientElectiveListForCancellationVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.PatientElectiveList domainObject = PatientElectiveListForCancellationVoAssembler.extractPatientElectiveList(domainFactory, vo, domMap);

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
	 public static ims.RefMan.vo.PatientElectiveListForCancellationVo create(ims.RefMan.domain.objects.PatientElectiveList domainObject) 
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
	  public static ims.RefMan.vo.PatientElectiveListForCancellationVo create(DomainObjectMap map, ims.RefMan.domain.objects.PatientElectiveList domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.PatientElectiveListForCancellationVo valueObject = (ims.RefMan.vo.PatientElectiveListForCancellationVo) map.getValueObject(domainObject, ims.RefMan.vo.PatientElectiveListForCancellationVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.PatientElectiveListForCancellationVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.RefMan.vo.PatientElectiveListForCancellationVo insert(ims.RefMan.vo.PatientElectiveListForCancellationVo valueObject, ims.RefMan.domain.objects.PatientElectiveList domainObject) 
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
	 public static ims.RefMan.vo.PatientElectiveListForCancellationVo insert(DomainObjectMap map, ims.RefMan.vo.PatientElectiveListForCancellationVo valueObject, ims.RefMan.domain.objects.PatientElectiveList domainObject) 
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
			
		// ElectiveListStatus
		valueObject.setElectiveListStatus(ims.RefMan.vo.domain.ElectiveListStatusVoAssembler.create(map, domainObject.getElectiveListStatus()) );
		// ElectiveListStatusHistory
		valueObject.setElectiveListStatusHistory(ims.RefMan.vo.domain.ElectiveListStatusVoAssembler.createElectiveListStatusVoCollectionFromElectiveListStatus(map, domainObject.getElectiveListStatusHistory()) );
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
		// Referral
		if (domainObject.getReferral() != null)
		{
			if(domainObject.getReferral() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getReferral();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setReferral(new ims.RefMan.vo.CatsReferralRefVo(id, -1));				
			}
			else
			{
				valueObject.setReferral(new ims.RefMan.vo.CatsReferralRefVo(domainObject.getReferral().getId(), domainObject.getReferral().getVersion()));
			}
		}
		// TCIDetails
		valueObject.setTCIDetails(ims.RefMan.vo.domain.PatientElectiveListTCIForCancelationVoAssembler.create(map, domainObject.getTCIDetails()) );
		// TCIHistory
		valueObject.setTCIHistory(ims.RefMan.vo.domain.PatientElectiveListTCIForCancelationVoAssembler.createPatientElectiveListTCIForCancelationVoCollectionFromTCIForPatientElectiveList(map, domainObject.getTCIHistory()) );
		// EROD
		valueObject.setEROD(ims.RefMan.vo.domain.ReferralErodForCancellationVoAssembler.create(map, domainObject.getEROD()) );
		// ERODHistory
		valueObject.setERODHistory(ims.RefMan.vo.domain.ReferralErodForCancellationVoAssembler.createReferralErodForCancellationVoCollectionFromReferralEROD(map, domainObject.getERODHistory()) );
		// PatientStatus
		ims.domain.lookups.LookupInstance instance9 = domainObject.getPatientStatus();
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

			ims.RefMan.vo.lookups.CatsReferralCategory voLookup9 = new ims.RefMan.vo.lookups.CatsReferralCategory(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.RefMan.vo.lookups.CatsReferralCategory parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.RefMan.vo.lookups.CatsReferralCategory(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setPatientStatus(voLookup9);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.PatientElectiveList extractPatientElectiveList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListForCancellationVo valueObject) 
	{
		return 	extractPatientElectiveList(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.PatientElectiveList extractPatientElectiveList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListForCancellationVo valueObject, HashMap domMap) 
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
			// ims.RefMan.vo.PatientElectiveListForCancellationVo ID_PatientElectiveList field is unknown
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

		domainObject.setElectiveListStatus(ims.RefMan.vo.domain.ElectiveListStatusVoAssembler.extractElectiveListStatus(domainFactory, valueObject.getElectiveListStatus(), domMap));
		domainObject.setElectiveListStatusHistory(ims.RefMan.vo.domain.ElectiveListStatusVoAssembler.extractElectiveListStatusList(domainFactory, valueObject.getElectiveListStatusHistory(), domainObject.getElectiveListStatusHistory(), domMap));		
		ims.core.patient.domain.objects.Patient value3 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value3 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getPatient();	
			}
			else
			{
				value3 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value3);
		ims.RefMan.domain.objects.CatsReferral value4 = null;
		if ( null != valueObject.getReferral() ) 
		{
			if (valueObject.getReferral().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferral()) != null)
				{
					value4 = (ims.RefMan.domain.objects.CatsReferral)domMap.get(valueObject.getReferral());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getReferral();	
			}
			else
			{
				value4 = (ims.RefMan.domain.objects.CatsReferral)domainFactory.getDomainObject(ims.RefMan.domain.objects.CatsReferral.class, valueObject.getReferral().getBoId());
			}
		}
		domainObject.setReferral(value4);
		domainObject.setTCIDetails(ims.RefMan.vo.domain.PatientElectiveListTCIForCancelationVoAssembler.extractTCIForPatientElectiveList(domainFactory, valueObject.getTCIDetails(), domMap));
		domainObject.setTCIHistory(ims.RefMan.vo.domain.PatientElectiveListTCIForCancelationVoAssembler.extractTCIForPatientElectiveListList(domainFactory, valueObject.getTCIHistory(), domainObject.getTCIHistory(), domMap));		
		domainObject.setEROD(ims.RefMan.vo.domain.ReferralErodForCancellationVoAssembler.extractReferralEROD(domainFactory, valueObject.getEROD(), domMap));
		domainObject.setERODHistory(ims.RefMan.vo.domain.ReferralErodForCancellationVoAssembler.extractReferralERODList(domainFactory, valueObject.getERODHistory(), domainObject.getERODHistory(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getPatientStatus() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getPatientStatus().getID());
		}
		domainObject.setPatientStatus(value9);

		return domainObject;
	}

}
