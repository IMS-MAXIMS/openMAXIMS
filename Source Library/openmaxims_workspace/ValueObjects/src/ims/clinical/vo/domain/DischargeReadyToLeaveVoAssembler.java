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
 * Generated on 16/04/2014, 12:31
 *
 */
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class DischargeReadyToLeaveVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.DischargeReadyToLeaveVo copy(ims.clinical.vo.DischargeReadyToLeaveVo valueObjectDest, ims.clinical.vo.DischargeReadyToLeaveVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ReadyToLeave(valueObjectSrc.getID_ReadyToLeave());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// AuthoringInfo
		valueObjectDest.setAuthoringInfo(valueObjectSrc.getAuthoringInfo());
		// NurseEnabledDischargeConfirmation
		valueObjectDest.setNurseEnabledDischargeConfirmation(valueObjectSrc.getNurseEnabledDischargeConfirmation());
		// CompletedOn
		valueObjectDest.setCompletedOn(valueObjectSrc.getCompletedOn());
		// CompletedBy
		valueObjectDest.setCompletedBy(valueObjectSrc.getCompletedBy());
		// DischargeDetails
		valueObjectDest.setDischargeDetails(valueObjectSrc.getDischargeDetails());
		// hasPatientReceivedCopyOfDischarge
		valueObjectDest.setHasPatientReceivedCopyOfDischarge(valueObjectSrc.getHasPatientReceivedCopyOfDischarge());
		// CommentsFromPatient
		valueObjectDest.setCommentsFromPatient(valueObjectSrc.getCommentsFromPatient());
		// DischargingNurse
		valueObjectDest.setDischargingNurse(valueObjectSrc.getDischargingNurse());
		// AdmittedOn
		valueObjectDest.setAdmittedOn(valueObjectSrc.getAdmittedOn());
		// ClinicalDischargeDateTime
		valueObjectDest.setClinicalDischargeDateTime(valueObjectSrc.getClinicalDischargeDateTime());
		// AdmittedTime
		valueObjectDest.setAdmittedTime(valueObjectSrc.getAdmittedTime());
		// IsComplete
		valueObjectDest.setIsComplete(valueObjectSrc.getIsComplete());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createDischargeReadyToLeaveVoCollectionFromReadyToLeave(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.edischarge.domain.objects.ReadyToLeave objects.
	 */
	public static ims.clinical.vo.DischargeReadyToLeaveVoCollection createDischargeReadyToLeaveVoCollectionFromReadyToLeave(java.util.Set domainObjectSet)	
	{
		return createDischargeReadyToLeaveVoCollectionFromReadyToLeave(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.edischarge.domain.objects.ReadyToLeave objects.
	 */
	public static ims.clinical.vo.DischargeReadyToLeaveVoCollection createDischargeReadyToLeaveVoCollectionFromReadyToLeave(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.DischargeReadyToLeaveVoCollection voList = new ims.clinical.vo.DischargeReadyToLeaveVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.edischarge.domain.objects.ReadyToLeave domainObject = (ims.edischarge.domain.objects.ReadyToLeave) iterator.next();
			ims.clinical.vo.DischargeReadyToLeaveVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.edischarge.domain.objects.ReadyToLeave objects.
	 */
	public static ims.clinical.vo.DischargeReadyToLeaveVoCollection createDischargeReadyToLeaveVoCollectionFromReadyToLeave(java.util.List domainObjectList) 
	{
		return createDischargeReadyToLeaveVoCollectionFromReadyToLeave(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.edischarge.domain.objects.ReadyToLeave objects.
	 */
	public static ims.clinical.vo.DischargeReadyToLeaveVoCollection createDischargeReadyToLeaveVoCollectionFromReadyToLeave(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.DischargeReadyToLeaveVoCollection voList = new ims.clinical.vo.DischargeReadyToLeaveVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.edischarge.domain.objects.ReadyToLeave domainObject = (ims.edischarge.domain.objects.ReadyToLeave) domainObjectList.get(i);
			ims.clinical.vo.DischargeReadyToLeaveVo vo = create(map, domainObject);

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
	 * Create the ims.edischarge.domain.objects.ReadyToLeave set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractReadyToLeaveSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeReadyToLeaveVoCollection voCollection) 
	 {
	 	return extractReadyToLeaveSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractReadyToLeaveSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeReadyToLeaveVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.DischargeReadyToLeaveVo vo = voCollection.get(i);
			ims.edischarge.domain.objects.ReadyToLeave domainObject = DischargeReadyToLeaveVoAssembler.extractReadyToLeave(domainFactory, vo, domMap);

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
	 * Create the ims.edischarge.domain.objects.ReadyToLeave list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractReadyToLeaveList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeReadyToLeaveVoCollection voCollection) 
	 {
	 	return extractReadyToLeaveList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractReadyToLeaveList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeReadyToLeaveVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.DischargeReadyToLeaveVo vo = voCollection.get(i);
			ims.edischarge.domain.objects.ReadyToLeave domainObject = DischargeReadyToLeaveVoAssembler.extractReadyToLeave(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.edischarge.domain.objects.ReadyToLeave object.
	 * @param domainObject ims.edischarge.domain.objects.ReadyToLeave
	 */
	 public static ims.clinical.vo.DischargeReadyToLeaveVo create(ims.edischarge.domain.objects.ReadyToLeave domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.edischarge.domain.objects.ReadyToLeave object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.DischargeReadyToLeaveVo create(DomainObjectMap map, ims.edischarge.domain.objects.ReadyToLeave domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.DischargeReadyToLeaveVo valueObject = (ims.clinical.vo.DischargeReadyToLeaveVo) map.getValueObject(domainObject, ims.clinical.vo.DischargeReadyToLeaveVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.DischargeReadyToLeaveVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.edischarge.domain.objects.ReadyToLeave
	 */
	 public static ims.clinical.vo.DischargeReadyToLeaveVo insert(ims.clinical.vo.DischargeReadyToLeaveVo valueObject, ims.edischarge.domain.objects.ReadyToLeave domainObject) 
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
	 * @param domainObject ims.edischarge.domain.objects.ReadyToLeave
	 */
	 public static ims.clinical.vo.DischargeReadyToLeaveVo insert(DomainObjectMap map, ims.clinical.vo.DischargeReadyToLeaveVo valueObject, ims.edischarge.domain.objects.ReadyToLeave domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ReadyToLeave(domainObject.getId());
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
		// AuthoringInfo
		valueObject.setAuthoringInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInfo()) );
		// NurseEnabledDischargeConfirmation
		valueObject.setNurseEnabledDischargeConfirmation(domainObject.getNurseEnabledDischargeConfirmation());
		// CompletedOn
		java.util.Date CompletedOn = domainObject.getCompletedOn();
		if ( null != CompletedOn ) 
		{
			valueObject.setCompletedOn(new ims.framework.utils.DateTime(CompletedOn) );
		}
		// CompletedBy
		if (domainObject.getCompletedBy() != null)
		{
			if(domainObject.getCompletedBy() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCompletedBy();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCompletedBy(new ims.core.resource.people.vo.HcpRefVo(id, -1));				
			}
			else
			{
				valueObject.setCompletedBy(new ims.core.resource.people.vo.HcpRefVo(domainObject.getCompletedBy().getId(), domainObject.getCompletedBy().getVersion()));
			}
		}
		// DischargeDetails
		valueObject.setDischargeDetails(ims.clinical.vo.domain.DischargeDetailsVoAssembler.create(map, domainObject.getDischargeDetails()) );
		// hasPatientReceivedCopyOfDischarge
		valueObject.setHasPatientReceivedCopyOfDischarge( domainObject.isHasPatientReceivedCopyOfDischarge() );
		// CommentsFromPatient
		valueObject.setCommentsFromPatient(domainObject.getCommentsFromPatient());
		// DischargingNurse
		valueObject.setDischargingNurse(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getDischargingNurse()) );
		// AdmittedOn
		java.util.Date AdmittedOn = domainObject.getAdmittedOn();
		if ( null != AdmittedOn ) 
		{
			valueObject.setAdmittedOn(new ims.framework.utils.Date(AdmittedOn) );
		}
		// ClinicalDischargeDateTime
		java.util.Date ClinicalDischargeDateTime = domainObject.getClinicalDischargeDateTime();
		if ( null != ClinicalDischargeDateTime ) 
		{
			valueObject.setClinicalDischargeDateTime(new ims.framework.utils.DateTime(ClinicalDischargeDateTime) );
		}
		// AdmittedTime
		String AdmittedTime = domainObject.getAdmittedTime();
		if ( null != AdmittedTime ) 
		{
			valueObject.setAdmittedTime(new ims.framework.utils.Time(AdmittedTime) );
		}
		// IsComplete
		valueObject.setIsComplete( domainObject.isIsComplete() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.edischarge.domain.objects.ReadyToLeave extractReadyToLeave(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeReadyToLeaveVo valueObject) 
	{
		return 	extractReadyToLeave(domainFactory, valueObject, new HashMap());
	}

	public static ims.edischarge.domain.objects.ReadyToLeave extractReadyToLeave(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeReadyToLeaveVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ReadyToLeave();
		ims.edischarge.domain.objects.ReadyToLeave domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.edischarge.domain.objects.ReadyToLeave)domMap.get(valueObject);
			}
			// ims.clinical.vo.DischargeReadyToLeaveVo ID_ReadyToLeave field is unknown
			domainObject = new ims.edischarge.domain.objects.ReadyToLeave();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ReadyToLeave());
			if (domMap.get(key) != null)
			{
				return (ims.edischarge.domain.objects.ReadyToLeave)domMap.get(key);
			}
			domainObject = (ims.edischarge.domain.objects.ReadyToLeave) domainFactory.getDomainObject(ims.edischarge.domain.objects.ReadyToLeave.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ReadyToLeave());

		ims.core.admin.domain.objects.CareContext value1 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value1 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getCareContext();	
			}
			else
			{
				value1 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value1);
		domainObject.setAuthoringInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInfo(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNurseEnabledDischargeConfirmation() != null && valueObject.getNurseEnabledDischargeConfirmation().equals(""))
		{
			valueObject.setNurseEnabledDischargeConfirmation(null);
		}
		domainObject.setNurseEnabledDischargeConfirmation(valueObject.getNurseEnabledDischargeConfirmation());
		ims.framework.utils.DateTime dateTime4 = valueObject.getCompletedOn();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setCompletedOn(value4);
		ims.core.resource.people.domain.objects.Hcp value5 = null;
		if ( null != valueObject.getCompletedBy() ) 
		{
			if (valueObject.getCompletedBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getCompletedBy()) != null)
				{
					value5 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getCompletedBy());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value5 = domainObject.getCompletedBy();	
			}
			else
			{
				value5 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getCompletedBy().getBoId());
			}
		}
		domainObject.setCompletedBy(value5);
		domainObject.setDischargeDetails(ims.clinical.vo.domain.DischargeDetailsVoAssembler.extractDischargeDetails(domainFactory, valueObject.getDischargeDetails(), domMap));
		domainObject.setHasPatientReceivedCopyOfDischarge(valueObject.getHasPatientReceivedCopyOfDischarge());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCommentsFromPatient() != null && valueObject.getCommentsFromPatient().equals(""))
		{
			valueObject.setCommentsFromPatient(null);
		}
		domainObject.setCommentsFromPatient(valueObject.getCommentsFromPatient());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value9 = null;
		if ( null != valueObject.getDischargingNurse() ) 
		{
			if (valueObject.getDischargingNurse().getBoId() == null)
			{
				if (domMap.get(valueObject.getDischargingNurse()) != null)
				{
					value9 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getDischargingNurse());
				}
			}
			else
			{
				value9 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getDischargingNurse().getBoId());
			}
		}
		domainObject.setDischargingNurse(value9);
		java.util.Date value10 = null;
		ims.framework.utils.Date date10 = valueObject.getAdmittedOn();		
		if ( date10 != null ) 
		{
			value10 = date10.getDate();
		}
		domainObject.setAdmittedOn(value10);
		ims.framework.utils.DateTime dateTime11 = valueObject.getClinicalDischargeDateTime();
		java.util.Date value11 = null;
		if ( dateTime11 != null ) 
		{
			value11 = dateTime11.getJavaDate();
		}
		domainObject.setClinicalDischargeDateTime(value11);
		ims.framework.utils.Time time12 = valueObject.getAdmittedTime();
		String value12 = null;
		if ( time12 != null ) 
		{
			value12 = time12.toString();
		}
		domainObject.setAdmittedTime(value12);
		domainObject.setIsComplete(valueObject.getIsComplete());

		return domainObject;
	}

}
