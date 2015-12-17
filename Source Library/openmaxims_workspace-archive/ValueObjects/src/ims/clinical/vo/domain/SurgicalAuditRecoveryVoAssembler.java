//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
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
//#############################################################################
//#EOH
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 16/04/2014, 12:32
 *
 */
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Florin Blindu
 */
public class SurgicalAuditRecoveryVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.SurgicalAuditRecoveryVo copy(ims.clinical.vo.SurgicalAuditRecoveryVo valueObjectDest, ims.clinical.vo.SurgicalAuditRecoveryVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_SurgicalAuditRecovery(valueObjectSrc.getID_SurgicalAuditRecovery());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// RecoveryRoomNurse
		valueObjectDest.setRecoveryRoomNurse(valueObjectSrc.getRecoveryRoomNurse());
		// ConfirmPatientArrival
		valueObjectDest.setConfirmPatientArrival(valueObjectSrc.getConfirmPatientArrival());
		// TimeArrivesInRecovery
		valueObjectDest.setTimeArrivesInRecovery(valueObjectSrc.getTimeArrivesInRecovery());
		// TimeWardNotified
		valueObjectDest.setTimeWardNotified(valueObjectSrc.getTimeWardNotified());
		// TimeLeavesRecovery
		valueObjectDest.setTimeLeavesRecovery(valueObjectSrc.getTimeLeavesRecovery());
		// SentTo
		valueObjectDest.setSentTo(valueObjectSrc.getSentTo());
		// HandoverfromRecoveryNurse
		valueObjectDest.setHandoverfromRecoveryNurse(valueObjectSrc.getHandoverfromRecoveryNurse());
		// WardUnitNurse
		valueObjectDest.setWardUnitNurse(valueObjectSrc.getWardUnitNurse());
		// RecoveryLocumBool
		valueObjectDest.setRecoveryLocumBool(valueObjectSrc.getRecoveryLocumBool());
		// RecoveryLocumNurse
		valueObjectDest.setRecoveryLocumNurse(valueObjectSrc.getRecoveryLocumNurse());
		// RecoveryHandoverLocumBool
		valueObjectDest.setRecoveryHandoverLocumBool(valueObjectSrc.getRecoveryHandoverLocumBool());
		// RecoveryHandoverLocumNurse
		valueObjectDest.setRecoveryHandoverLocumNurse(valueObjectSrc.getRecoveryHandoverLocumNurse());
		// WardLocumBool
		valueObjectDest.setWardLocumBool(valueObjectSrc.getWardLocumBool());
		// WardLocumNurse
		valueObjectDest.setWardLocumNurse(valueObjectSrc.getWardLocumNurse());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSurgicalAuditRecoveryVoCollectionFromSurgicalAuditRecovery(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.SurgicalAuditRecovery objects.
	 */
	public static ims.clinical.vo.SurgicalAuditRecoveryVoCollection createSurgicalAuditRecoveryVoCollectionFromSurgicalAuditRecovery(java.util.Set domainObjectSet)	
	{
		return createSurgicalAuditRecoveryVoCollectionFromSurgicalAuditRecovery(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.SurgicalAuditRecovery objects.
	 */
	public static ims.clinical.vo.SurgicalAuditRecoveryVoCollection createSurgicalAuditRecoveryVoCollectionFromSurgicalAuditRecovery(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.SurgicalAuditRecoveryVoCollection voList = new ims.clinical.vo.SurgicalAuditRecoveryVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.SurgicalAuditRecovery domainObject = (ims.clinical.domain.objects.SurgicalAuditRecovery) iterator.next();
			ims.clinical.vo.SurgicalAuditRecoveryVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.SurgicalAuditRecovery objects.
	 */
	public static ims.clinical.vo.SurgicalAuditRecoveryVoCollection createSurgicalAuditRecoveryVoCollectionFromSurgicalAuditRecovery(java.util.List domainObjectList) 
	{
		return createSurgicalAuditRecoveryVoCollectionFromSurgicalAuditRecovery(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.SurgicalAuditRecovery objects.
	 */
	public static ims.clinical.vo.SurgicalAuditRecoveryVoCollection createSurgicalAuditRecoveryVoCollectionFromSurgicalAuditRecovery(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.SurgicalAuditRecoveryVoCollection voList = new ims.clinical.vo.SurgicalAuditRecoveryVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.SurgicalAuditRecovery domainObject = (ims.clinical.domain.objects.SurgicalAuditRecovery) domainObjectList.get(i);
			ims.clinical.vo.SurgicalAuditRecoveryVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.SurgicalAuditRecovery set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractSurgicalAuditRecoverySet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalAuditRecoveryVoCollection voCollection) 
	 {
	 	return extractSurgicalAuditRecoverySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSurgicalAuditRecoverySet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalAuditRecoveryVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.SurgicalAuditRecoveryVo vo = voCollection.get(i);
			ims.clinical.domain.objects.SurgicalAuditRecovery domainObject = SurgicalAuditRecoveryVoAssembler.extractSurgicalAuditRecovery(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.SurgicalAuditRecovery list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractSurgicalAuditRecoveryList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalAuditRecoveryVoCollection voCollection) 
	 {
	 	return extractSurgicalAuditRecoveryList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSurgicalAuditRecoveryList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalAuditRecoveryVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.SurgicalAuditRecoveryVo vo = voCollection.get(i);
			ims.clinical.domain.objects.SurgicalAuditRecovery domainObject = SurgicalAuditRecoveryVoAssembler.extractSurgicalAuditRecovery(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.SurgicalAuditRecovery object.
	 * @param domainObject ims.clinical.domain.objects.SurgicalAuditRecovery
	 */
	 public static ims.clinical.vo.SurgicalAuditRecoveryVo create(ims.clinical.domain.objects.SurgicalAuditRecovery domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.SurgicalAuditRecovery object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.SurgicalAuditRecoveryVo create(DomainObjectMap map, ims.clinical.domain.objects.SurgicalAuditRecovery domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.SurgicalAuditRecoveryVo valueObject = (ims.clinical.vo.SurgicalAuditRecoveryVo) map.getValueObject(domainObject, ims.clinical.vo.SurgicalAuditRecoveryVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.SurgicalAuditRecoveryVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.SurgicalAuditRecovery
	 */
	 public static ims.clinical.vo.SurgicalAuditRecoveryVo insert(ims.clinical.vo.SurgicalAuditRecoveryVo valueObject, ims.clinical.domain.objects.SurgicalAuditRecovery domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.SurgicalAuditRecovery
	 */
	 public static ims.clinical.vo.SurgicalAuditRecoveryVo insert(DomainObjectMap map, ims.clinical.vo.SurgicalAuditRecoveryVo valueObject, ims.clinical.domain.objects.SurgicalAuditRecovery domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_SurgicalAuditRecovery(domainObject.getId());
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
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// RecoveryRoomNurse
		valueObject.setRecoveryRoomNurse(ims.core.vo.domain.NurseVoAssembler.create(map, domainObject.getRecoveryRoomNurse()) );
		// ConfirmPatientArrival
		ims.domain.lookups.LookupInstance instance5 = domainObject.getConfirmPatientArrival();
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

			ims.core.vo.lookups.YesNo voLookup5 = new ims.core.vo.lookups.YesNo(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.YesNo(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setConfirmPatientArrival(voLookup5);
		}
				// TimeArrivesInRecovery
		java.util.Date TimeArrivesInRecovery = domainObject.getTimeArrivesInRecovery();
		if ( null != TimeArrivesInRecovery ) 
		{
			valueObject.setTimeArrivesInRecovery(new ims.framework.utils.DateTime(TimeArrivesInRecovery) );
		}
		// TimeWardNotified
		java.util.Date TimeWardNotified = domainObject.getTimeWardNotified();
		if ( null != TimeWardNotified ) 
		{
			valueObject.setTimeWardNotified(new ims.framework.utils.DateTime(TimeWardNotified) );
		}
		// TimeLeavesRecovery
		java.util.Date TimeLeavesRecovery = domainObject.getTimeLeavesRecovery();
		if ( null != TimeLeavesRecovery ) 
		{
			valueObject.setTimeLeavesRecovery(new ims.framework.utils.DateTime(TimeLeavesRecovery) );
		}
		// SentTo
		valueObject.setSentTo(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getSentTo()) );
		// HandoverfromRecoveryNurse
		valueObject.setHandoverfromRecoveryNurse(ims.core.vo.domain.NurseVoAssembler.create(map, domainObject.getHandoverfromRecoveryNurse()) );
		// WardUnitNurse
		valueObject.setWardUnitNurse(ims.core.vo.domain.NurseVoAssembler.create(map, domainObject.getWardUnitNurse()) );
		// RecoveryLocumBool
		valueObject.setRecoveryLocumBool( domainObject.isRecoveryLocumBool() );
		// RecoveryLocumNurse
		valueObject.setRecoveryLocumNurse(domainObject.getRecoveryLocumNurse());
		// RecoveryHandoverLocumBool
		valueObject.setRecoveryHandoverLocumBool( domainObject.isRecoveryHandoverLocumBool() );
		// RecoveryHandoverLocumNurse
		valueObject.setRecoveryHandoverLocumNurse(domainObject.getRecoveryHandoverLocumNurse());
		// WardLocumBool
		valueObject.setWardLocumBool( domainObject.isWardLocumBool() );
		// WardLocumNurse
		valueObject.setWardLocumNurse(domainObject.getWardLocumNurse());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.SurgicalAuditRecovery extractSurgicalAuditRecovery(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalAuditRecoveryVo valueObject) 
	{
		return 	extractSurgicalAuditRecovery(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.SurgicalAuditRecovery extractSurgicalAuditRecovery(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalAuditRecoveryVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_SurgicalAuditRecovery();
		ims.clinical.domain.objects.SurgicalAuditRecovery domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.SurgicalAuditRecovery)domMap.get(valueObject);
			}
			// ims.clinical.vo.SurgicalAuditRecoveryVo ID_SurgicalAuditRecovery field is unknown
			domainObject = new ims.clinical.domain.objects.SurgicalAuditRecovery();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_SurgicalAuditRecovery());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.SurgicalAuditRecovery)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.SurgicalAuditRecovery) domainFactory.getDomainObject(ims.clinical.domain.objects.SurgicalAuditRecovery.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_SurgicalAuditRecovery());

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
		ims.core.admin.domain.objects.CareContext value2 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value2 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getCareContext();	
			}
			else
			{
				value2 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value2);
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Nurse value4 = null;
		if ( null != valueObject.getRecoveryRoomNurse() ) 
		{
			if (valueObject.getRecoveryRoomNurse().getBoId() == null)
			{
				if (domMap.get(valueObject.getRecoveryRoomNurse()) != null)
				{
					value4 = (ims.core.resource.people.domain.objects.Nurse)domMap.get(valueObject.getRecoveryRoomNurse());
				}
			}
			else
			{
				value4 = (ims.core.resource.people.domain.objects.Nurse)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Nurse.class, valueObject.getRecoveryRoomNurse().getBoId());
			}
		}
		domainObject.setRecoveryRoomNurse(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getConfirmPatientArrival() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getConfirmPatientArrival().getID());
		}
		domainObject.setConfirmPatientArrival(value5);
		ims.framework.utils.DateTime dateTime6 = valueObject.getTimeArrivesInRecovery();
		java.util.Date value6 = null;
		if ( dateTime6 != null ) 
		{
			value6 = dateTime6.getJavaDate();
		}
		domainObject.setTimeArrivesInRecovery(value6);
		ims.framework.utils.DateTime dateTime7 = valueObject.getTimeWardNotified();
		java.util.Date value7 = null;
		if ( dateTime7 != null ) 
		{
			value7 = dateTime7.getJavaDate();
		}
		domainObject.setTimeWardNotified(value7);
		ims.framework.utils.DateTime dateTime8 = valueObject.getTimeLeavesRecovery();
		java.util.Date value8 = null;
		if ( dateTime8 != null ) 
		{
			value8 = dateTime8.getJavaDate();
		}
		domainObject.setTimeLeavesRecovery(value8);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value9 = null;
		if ( null != valueObject.getSentTo() ) 
		{
			if (valueObject.getSentTo().getBoId() == null)
			{
				if (domMap.get(valueObject.getSentTo()) != null)
				{
					value9 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getSentTo());
				}
			}
			else
			{
				value9 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getSentTo().getBoId());
			}
		}
		domainObject.setSentTo(value9);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Nurse value10 = null;
		if ( null != valueObject.getHandoverfromRecoveryNurse() ) 
		{
			if (valueObject.getHandoverfromRecoveryNurse().getBoId() == null)
			{
				if (domMap.get(valueObject.getHandoverfromRecoveryNurse()) != null)
				{
					value10 = (ims.core.resource.people.domain.objects.Nurse)domMap.get(valueObject.getHandoverfromRecoveryNurse());
				}
			}
			else
			{
				value10 = (ims.core.resource.people.domain.objects.Nurse)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Nurse.class, valueObject.getHandoverfromRecoveryNurse().getBoId());
			}
		}
		domainObject.setHandoverfromRecoveryNurse(value10);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Nurse value11 = null;
		if ( null != valueObject.getWardUnitNurse() ) 
		{
			if (valueObject.getWardUnitNurse().getBoId() == null)
			{
				if (domMap.get(valueObject.getWardUnitNurse()) != null)
				{
					value11 = (ims.core.resource.people.domain.objects.Nurse)domMap.get(valueObject.getWardUnitNurse());
				}
			}
			else
			{
				value11 = (ims.core.resource.people.domain.objects.Nurse)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Nurse.class, valueObject.getWardUnitNurse().getBoId());
			}
		}
		domainObject.setWardUnitNurse(value11);
		domainObject.setRecoveryLocumBool(valueObject.getRecoveryLocumBool());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getRecoveryLocumNurse() != null && valueObject.getRecoveryLocumNurse().equals(""))
		{
			valueObject.setRecoveryLocumNurse(null);
		}
		domainObject.setRecoveryLocumNurse(valueObject.getRecoveryLocumNurse());
		domainObject.setRecoveryHandoverLocumBool(valueObject.getRecoveryHandoverLocumBool());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getRecoveryHandoverLocumNurse() != null && valueObject.getRecoveryHandoverLocumNurse().equals(""))
		{
			valueObject.setRecoveryHandoverLocumNurse(null);
		}
		domainObject.setRecoveryHandoverLocumNurse(valueObject.getRecoveryHandoverLocumNurse());
		domainObject.setWardLocumBool(valueObject.getWardLocumBool());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getWardLocumNurse() != null && valueObject.getWardLocumNurse().equals(""))
		{
			valueObject.setWardLocumNurse(null);
		}
		domainObject.setWardLocumNurse(valueObject.getWardLocumNurse());

		return domainObject;
	}

}
