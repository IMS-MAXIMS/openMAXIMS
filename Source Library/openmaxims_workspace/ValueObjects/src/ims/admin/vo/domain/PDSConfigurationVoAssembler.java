//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 12/10/2015, 13:24
 *
 */
package ims.admin.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Silviu Checherita
 */
public class PDSConfigurationVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.admin.vo.PDSConfigurationVo copy(ims.admin.vo.PDSConfigurationVo valueObjectDest, ims.admin.vo.PDSConfigurationVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PDSConfiguration(valueObjectSrc.getID_PDSConfiguration());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// DOB_DATE_RANGE
		valueObjectDest.setDOB_DATE_RANGE(valueObjectSrc.getDOB_DATE_RANGE());
		// DOD_DATE_RANGE
		valueObjectDest.setDOD_DATE_RANGE(valueObjectSrc.getDOD_DATE_RANGE());
		// TRACE_ADVANCED_IGNORE_HISTORY
		valueObjectDest.setTRACE_ADVANCED_IGNORE_HISTORY(valueObjectSrc.getTRACE_ADVANCED_IGNORE_HISTORY());
		// TRACE_HISTORY_DATA_INDICATOR
		valueObjectDest.setTRACE_HISTORY_DATA_INDICATOR(valueObjectSrc.getTRACE_HISTORY_DATA_INDICATOR());
		// USE_LPI_CROSSCHECK
		valueObjectDest.setUSE_LPI_CROSSCHECK(valueObjectSrc.getUSE_LPI_CROSSCHECK());
		// NO_FIXED_ABODE_POSTCODE
		valueObjectDest.setNO_FIXED_ABODE_POSTCODE(valueObjectSrc.getNO_FIXED_ABODE_POSTCODE());
		// ADVANCED_SEARCH_TIMER_INTERVAL
		valueObjectDest.setADVANCED_SEARCH_TIMER_INTERVAL(valueObjectSrc.getADVANCED_SEARCH_TIMER_INTERVAL());
		// PDS_BACKOFFICE_NOTIFICATI
		valueObjectDest.setPDS_BACKOFFICE_NOTIFICATI(valueObjectSrc.getPDS_BACKOFFICE_NOTIFICATI());
		// NumOfDaysAppointBatchTrace
		valueObjectDest.setNumOfDaysAppointBatchTrace(valueObjectSrc.getNumOfDaysAppointBatchTrace());
		// NumOfDaysTCIBatchTrace
		valueObjectDest.setNumOfDaysTCIBatchTrace(valueObjectSrc.getNumOfDaysTCIBatchTrace());
		// NumOfDaysForNextPDSCheck
		valueObjectDest.setNumOfDaysForNextPDSCheck(valueObjectSrc.getNumOfDaysForNextPDSCheck());
		// SYNCHRONISE_WITH_BACKOFFICE
		valueObjectDest.setSYNCHRONISE_WITH_BACKOFFICE(valueObjectSrc.getSYNCHRONISE_WITH_BACKOFFICE());
		// FromPDSAccreditedSystemId
		valueObjectDest.setFromPDSAccreditedSystemId(valueObjectSrc.getFromPDSAccreditedSystemId());
		// ToPDSAccreditedSystemId
		valueObjectDest.setToPDSAccreditedSystemId(valueObjectSrc.getToPDSAccreditedSystemId());
		// PDS_CONFIG_FILE
		valueObjectDest.setPDS_CONFIG_FILE(valueObjectSrc.getPDS_CONFIG_FILE());
		// PDS_STORE_MESSAGE_LOC
		valueObjectDest.setPDS_STORE_MESSAGE_LOC(valueObjectSrc.getPDS_STORE_MESSAGE_LOC());
		// PDS_STORE_MESSAGE
		valueObjectDest.setPDS_STORE_MESSAGE(valueObjectSrc.getPDS_STORE_MESSAGE());
		// START_PDS_GATEWAY
		valueObjectDest.setSTART_PDS_GATEWAY(valueObjectSrc.getSTART_PDS_GATEWAY());
		// PDS_MSH_REPOSITORY
		valueObjectDest.setPDS_MSH_REPOSITORY(valueObjectSrc.getPDS_MSH_REPOSITORY());
		// PDS_MSH_URL
		valueObjectDest.setPDS_MSH_URL(valueObjectSrc.getPDS_MSH_URL());
		// CREATE_BO_NOTIFICATIONS
		valueObjectDest.setCREATE_BO_NOTIFICATIONS(valueObjectSrc.getCREATE_BO_NOTIFICATIONS());
		// SDSHost
		valueObjectDest.setSDSHost(valueObjectSrc.getSDSHost());
		// SDSPort
		valueObjectDest.setSDSPort(valueObjectSrc.getSDSPort());
		// PDS_URL
		valueObjectDest.setPDS_URL(valueObjectSrc.getPDS_URL());
		// PDS_HOST
		valueObjectDest.setPDS_HOST(valueObjectSrc.getPDS_HOST());
		// PDS_STORE_SYNC_MESSAGE
		valueObjectDest.setPDS_STORE_SYNC_MESSAGE(valueObjectSrc.getPDS_STORE_SYNC_MESSAGE());
		// PDS_STORE_SYNC_MESSAGE_LOC
		valueObjectDest.setPDS_STORE_SYNC_MESSAGE_LOC(valueObjectSrc.getPDS_STORE_SYNC_MESSAGE_LOC());
		// ConsentChangeMessage
		valueObjectDest.setConsentChangeMessage(valueObjectSrc.getConsentChangeMessage());
		// InactivePatientRecordBgColour
		valueObjectDest.setInactivePatientRecordBgColour(valueObjectSrc.getInactivePatientRecordBgColour());
		// DECOUPLE_ON_DECEASE
		valueObjectDest.setDECOUPLE_ON_DECEASE(valueObjectSrc.getDECOUPLE_ON_DECEASE());
		// NOTIFY_ON_DECEASE
		valueObjectDest.setNOTIFY_ON_DECEASE(valueObjectSrc.getNOTIFY_ON_DECEASE());
		// DECOUPLE_ON_SYNC_REQUIRED
		valueObjectDest.setDECOUPLE_ON_SYNC_REQUIRED(valueObjectSrc.getDECOUPLE_ON_SYNC_REQUIRED());
		// PDS_AUTHENTICATION
		valueObjectDest.setPDS_AUTHENTICATION(valueObjectSrc.getPDS_AUTHENTICATION());
		// RBAC_PdsSearchForPatient
		valueObjectDest.setRBAC_PdsSearchForPatient(valueObjectSrc.getRBAC_PdsSearchForPatient());
		// RBAC_PdsSearchPatientAdvanced
		valueObjectDest.setRBAC_PdsSearchPatientAdvanced(valueObjectSrc.getRBAC_PdsSearchPatientAdvanced());
		// RBAC_PdsRetrieval
		valueObjectDest.setRBAC_PdsRetrieval(valueObjectSrc.getRBAC_PdsRetrieval());
		// RBAC_AccessSensitiveData
		valueObjectDest.setRBAC_AccessSensitiveData(valueObjectSrc.getRBAC_AccessSensitiveData());
		// RBAC_AmendPatient
		valueObjectDest.setRBAC_AmendPatient(valueObjectSrc.getRBAC_AmendPatient());
		// RBAC_ControlConsent
		valueObjectDest.setRBAC_ControlConsent(valueObjectSrc.getRBAC_ControlConsent());
		// RBAC_AmendPatientDecease
		valueObjectDest.setRBAC_AmendPatientDecease(valueObjectSrc.getRBAC_AmendPatientDecease());
		// RBAC_PostcodeSearch
		valueObjectDest.setRBAC_PostcodeSearch(valueObjectSrc.getRBAC_PostcodeSearch());
		// PDS_DISPLAY_CONSENT
		valueObjectDest.setPDS_DISPLAY_CONSENT(valueObjectSrc.getPDS_DISPLAY_CONSENT());
		// DOB_DATE_RANGE_TYPE
		valueObjectDest.setDOB_DATE_RANGE_TYPE(valueObjectSrc.getDOB_DATE_RANGE_TYPE());
		// DOD_DATE_RANGE_TYPE
		valueObjectDest.setDOD_DATE_RANGE_TYPE(valueObjectSrc.getDOD_DATE_RANGE_TYPE());
		// TP_BookOutpatientAppt
		valueObjectDest.setTP_BookOutpatientAppt(valueObjectSrc.getTP_BookOutpatientAppt());
		// TP_BookWardAttenderAppt
		valueObjectDest.setTP_BookWardAttenderAppt(valueObjectSrc.getTP_BookWardAttenderAppt());
		// TP_CreateTCIAndTheatreBooking
		valueObjectDest.setTP_CreateTCIAndTheatreBooking(valueObjectSrc.getTP_CreateTCIAndTheatreBooking());
		// TP_AnyAdmission
		valueObjectDest.setTP_AnyAdmission(valueObjectSrc.getTP_AnyAdmission());
		// TP_AnyApptArrival
		valueObjectDest.setTP_AnyApptArrival(valueObjectSrc.getTP_AnyApptArrival());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPDSConfigurationVoCollectionFromPDSConfiguration(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.PDSConfiguration objects.
	 */
	public static ims.admin.vo.PDSConfigurationVoCollection createPDSConfigurationVoCollectionFromPDSConfiguration(java.util.Set domainObjectSet)	
	{
		return createPDSConfigurationVoCollectionFromPDSConfiguration(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.PDSConfiguration objects.
	 */
	public static ims.admin.vo.PDSConfigurationVoCollection createPDSConfigurationVoCollectionFromPDSConfiguration(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.admin.vo.PDSConfigurationVoCollection voList = new ims.admin.vo.PDSConfigurationVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.domain.objects.PDSConfiguration domainObject = (ims.core.admin.domain.objects.PDSConfiguration) iterator.next();
			ims.admin.vo.PDSConfigurationVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.domain.objects.PDSConfiguration objects.
	 */
	public static ims.admin.vo.PDSConfigurationVoCollection createPDSConfigurationVoCollectionFromPDSConfiguration(java.util.List domainObjectList) 
	{
		return createPDSConfigurationVoCollectionFromPDSConfiguration(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.PDSConfiguration objects.
	 */
	public static ims.admin.vo.PDSConfigurationVoCollection createPDSConfigurationVoCollectionFromPDSConfiguration(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.admin.vo.PDSConfigurationVoCollection voList = new ims.admin.vo.PDSConfigurationVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.PDSConfiguration domainObject = (ims.core.admin.domain.objects.PDSConfiguration) domainObjectList.get(i);
			ims.admin.vo.PDSConfigurationVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.domain.objects.PDSConfiguration set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPDSConfigurationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.PDSConfigurationVoCollection voCollection) 
	 {
	 	return extractPDSConfigurationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPDSConfigurationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.PDSConfigurationVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.PDSConfigurationVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.PDSConfiguration domainObject = PDSConfigurationVoAssembler.extractPDSConfiguration(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.domain.objects.PDSConfiguration list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPDSConfigurationList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.PDSConfigurationVoCollection voCollection) 
	 {
	 	return extractPDSConfigurationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPDSConfigurationList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.PDSConfigurationVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.PDSConfigurationVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.PDSConfiguration domainObject = PDSConfigurationVoAssembler.extractPDSConfiguration(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.domain.objects.PDSConfiguration object.
	 * @param domainObject ims.core.admin.domain.objects.PDSConfiguration
	 */
	 public static ims.admin.vo.PDSConfigurationVo create(ims.core.admin.domain.objects.PDSConfiguration domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.domain.objects.PDSConfiguration object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.admin.vo.PDSConfigurationVo create(DomainObjectMap map, ims.core.admin.domain.objects.PDSConfiguration domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.admin.vo.PDSConfigurationVo valueObject = (ims.admin.vo.PDSConfigurationVo) map.getValueObject(domainObject, ims.admin.vo.PDSConfigurationVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.admin.vo.PDSConfigurationVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.domain.objects.PDSConfiguration
	 */
	 public static ims.admin.vo.PDSConfigurationVo insert(ims.admin.vo.PDSConfigurationVo valueObject, ims.core.admin.domain.objects.PDSConfiguration domainObject) 
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
	 * @param domainObject ims.core.admin.domain.objects.PDSConfiguration
	 */
	 public static ims.admin.vo.PDSConfigurationVo insert(DomainObjectMap map, ims.admin.vo.PDSConfigurationVo valueObject, ims.core.admin.domain.objects.PDSConfiguration domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PDSConfiguration(domainObject.getId());
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
			
		// DOB_DATE_RANGE
		valueObject.setDOB_DATE_RANGE(domainObject.getDOB_DATE_RANGE());
		// DOD_DATE_RANGE
		valueObject.setDOD_DATE_RANGE(domainObject.getDOD_DATE_RANGE());
		// TRACE_ADVANCED_IGNORE_HISTORY
		valueObject.setTRACE_ADVANCED_IGNORE_HISTORY( domainObject.isTRACE_ADVANCED_IGNORE_HISTORY() );
		// TRACE_HISTORY_DATA_INDICATOR
		valueObject.setTRACE_HISTORY_DATA_INDICATOR( domainObject.isTRACE_HISTORY_DATA_INDICATOR() );
		// USE_LPI_CROSSCHECK
		valueObject.setUSE_LPI_CROSSCHECK( domainObject.isUSE_LPI_CROSSCHECK() );
		// NO_FIXED_ABODE_POSTCODE
		valueObject.setNO_FIXED_ABODE_POSTCODE(domainObject.getNO_FIXED_ABODE_POSTCODE());
		// ADVANCED_SEARCH_TIMER_INTERVAL
		valueObject.setADVANCED_SEARCH_TIMER_INTERVAL(domainObject.getADVANCED_SEARCH_TIMER_INTERVAL());
		// PDS_BACKOFFICE_NOTIFICATI
		if (domainObject.getPDS_BACKOFFICE_NOTIFICATI() != null)
		{
			if(domainObject.getPDS_BACKOFFICE_NOTIFICATI() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPDS_BACKOFFICE_NOTIFICATI();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPDS_BACKOFFICE_NOTIFICATI(new ims.core.configuration.vo.AppUserRefVo(id, -1));				
			}
			else
			{
				valueObject.setPDS_BACKOFFICE_NOTIFICATI(new ims.core.configuration.vo.AppUserRefVo(domainObject.getPDS_BACKOFFICE_NOTIFICATI().getId(), domainObject.getPDS_BACKOFFICE_NOTIFICATI().getVersion()));
			}
		}
		// NumOfDaysAppointBatchTrace
		valueObject.setNumOfDaysAppointBatchTrace(domainObject.getNumOfDaysAppointBatchTrace());
		// NumOfDaysTCIBatchTrace
		valueObject.setNumOfDaysTCIBatchTrace(domainObject.getNumOfDaysTCIBatchTrace());
		// NumOfDaysForNextPDSCheck
		valueObject.setNumOfDaysForNextPDSCheck(domainObject.getNumOfDaysForNextPDSCheck());
		// SYNCHRONISE_WITH_BACKOFFICE
		valueObject.setSYNCHRONISE_WITH_BACKOFFICE( domainObject.isSYNCHRONISE_WITH_BACKOFFICE() );
		// FromPDSAccreditedSystemId
		valueObject.setFromPDSAccreditedSystemId(domainObject.getFromPDSAccreditedSystemId());
		// ToPDSAccreditedSystemId
		valueObject.setToPDSAccreditedSystemId(domainObject.getToPDSAccreditedSystemId());
		// PDS_CONFIG_FILE
		valueObject.setPDS_CONFIG_FILE(domainObject.getPDS_CONFIG_FILE());
		// PDS_STORE_MESSAGE_LOC
		valueObject.setPDS_STORE_MESSAGE_LOC(domainObject.getPDS_STORE_MESSAGE_LOC());
		// PDS_STORE_MESSAGE
		valueObject.setPDS_STORE_MESSAGE( domainObject.isPDS_STORE_MESSAGE() );
		// START_PDS_GATEWAY
		valueObject.setSTART_PDS_GATEWAY( domainObject.isSTART_PDS_GATEWAY() );
		// PDS_MSH_REPOSITORY
		valueObject.setPDS_MSH_REPOSITORY(domainObject.getPDS_MSH_REPOSITORY());
		// PDS_MSH_URL
		valueObject.setPDS_MSH_URL(domainObject.getPDS_MSH_URL());
		// CREATE_BO_NOTIFICATIONS
		valueObject.setCREATE_BO_NOTIFICATIONS( domainObject.isCREATE_BO_NOTIFICATIONS() );
		// SDSHost
		valueObject.setSDSHost(domainObject.getSDSHost());
		// SDSPort
		valueObject.setSDSPort(domainObject.getSDSPort());
		// PDS_URL
		valueObject.setPDS_URL(domainObject.getPDS_URL());
		// PDS_HOST
		valueObject.setPDS_HOST(domainObject.getPDS_HOST());
		// PDS_STORE_SYNC_MESSAGE
		valueObject.setPDS_STORE_SYNC_MESSAGE( domainObject.isPDS_STORE_SYNC_MESSAGE() );
		// PDS_STORE_SYNC_MESSAGE_LOC
		valueObject.setPDS_STORE_SYNC_MESSAGE_LOC(domainObject.getPDS_STORE_SYNC_MESSAGE_LOC());
		// ConsentChangeMessage
		valueObject.setConsentChangeMessage(domainObject.getConsentChangeMessage());
		// InactivePatientRecordBgColour
		valueObject.setInactivePatientRecordBgColour(domainObject.getInactivePatientRecordBgColour());
		// DECOUPLE_ON_DECEASE
		valueObject.setDECOUPLE_ON_DECEASE( domainObject.isDECOUPLE_ON_DECEASE() );
		// NOTIFY_ON_DECEASE
		valueObject.setNOTIFY_ON_DECEASE( domainObject.isNOTIFY_ON_DECEASE() );
		// DECOUPLE_ON_SYNC_REQUIRED
		valueObject.setDECOUPLE_ON_SYNC_REQUIRED( domainObject.isDECOUPLE_ON_SYNC_REQUIRED() );
		// PDS_AUTHENTICATION
		valueObject.setPDS_AUTHENTICATION( domainObject.isPDS_AUTHENTICATION() );
		// RBAC_PdsSearchForPatient
		valueObject.setRBAC_PdsSearchForPatient(domainObject.getRBAC_PdsSearchForPatient());
		// RBAC_PdsSearchPatientAdvanced
		valueObject.setRBAC_PdsSearchPatientAdvanced(domainObject.getRBAC_PdsSearchPatientAdvanced());
		// RBAC_PdsRetrieval
		valueObject.setRBAC_PdsRetrieval(domainObject.getRBAC_PdsRetrieval());
		// RBAC_AccessSensitiveData
		valueObject.setRBAC_AccessSensitiveData(domainObject.getRBAC_AccessSensitiveData());
		// RBAC_AmendPatient
		valueObject.setRBAC_AmendPatient(domainObject.getRBAC_AmendPatient());
		// RBAC_ControlConsent
		valueObject.setRBAC_ControlConsent(domainObject.getRBAC_ControlConsent());
		// RBAC_AmendPatientDecease
		valueObject.setRBAC_AmendPatientDecease(domainObject.getRBAC_AmendPatientDecease());
		// RBAC_PostcodeSearch
		valueObject.setRBAC_PostcodeSearch(domainObject.getRBAC_PostcodeSearch());
		// PDS_DISPLAY_CONSENT
		valueObject.setPDS_DISPLAY_CONSENT( domainObject.isPDS_DISPLAY_CONSENT() );
		// DOB_DATE_RANGE_TYPE
		ims.domain.lookups.LookupInstance instance43 = domainObject.getDOB_DATE_RANGE_TYPE();
		if ( null != instance43 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance43.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance43.getImage().getImageId(), instance43.getImage().getImagePath());
			}
			color = instance43.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.TimeUnitsSecondsToYears voLookup43 = new ims.core.vo.lookups.TimeUnitsSecondsToYears(instance43.getId(),instance43.getText(), instance43.isActive(), null, img, color);
			ims.core.vo.lookups.TimeUnitsSecondsToYears parentVoLookup43 = voLookup43;
			ims.domain.lookups.LookupInstance parent43 = instance43.getParent();
			while (parent43 != null)
			{
				if (parent43.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent43.getImage().getImageId(), parent43.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent43.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup43.setParent(new ims.core.vo.lookups.TimeUnitsSecondsToYears(parent43.getId(),parent43.getText(), parent43.isActive(), null, img, color));
				parentVoLookup43 = parentVoLookup43.getParent();
								parent43 = parent43.getParent();
			}			
			valueObject.setDOB_DATE_RANGE_TYPE(voLookup43);
		}
				// DOD_DATE_RANGE_TYPE
		ims.domain.lookups.LookupInstance instance44 = domainObject.getDOD_DATE_RANGE_TYPE();
		if ( null != instance44 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance44.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance44.getImage().getImageId(), instance44.getImage().getImagePath());
			}
			color = instance44.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.TimeUnitsSecondsToYears voLookup44 = new ims.core.vo.lookups.TimeUnitsSecondsToYears(instance44.getId(),instance44.getText(), instance44.isActive(), null, img, color);
			ims.core.vo.lookups.TimeUnitsSecondsToYears parentVoLookup44 = voLookup44;
			ims.domain.lookups.LookupInstance parent44 = instance44.getParent();
			while (parent44 != null)
			{
				if (parent44.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent44.getImage().getImageId(), parent44.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent44.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup44.setParent(new ims.core.vo.lookups.TimeUnitsSecondsToYears(parent44.getId(),parent44.getText(), parent44.isActive(), null, img, color));
				parentVoLookup44 = parentVoLookup44.getParent();
								parent44 = parent44.getParent();
			}			
			valueObject.setDOD_DATE_RANGE_TYPE(voLookup44);
		}
				// TP_BookOutpatientAppt
		valueObject.setTP_BookOutpatientAppt( domainObject.isTP_BookOutpatientAppt() );
		// TP_BookWardAttenderAppt
		valueObject.setTP_BookWardAttenderAppt( domainObject.isTP_BookWardAttenderAppt() );
		// TP_CreateTCIAndTheatreBooking
		valueObject.setTP_CreateTCIAndTheatreBooking( domainObject.isTP_CreateTCIAndTheatreBooking() );
		// TP_AnyAdmission
		valueObject.setTP_AnyAdmission( domainObject.isTP_AnyAdmission() );
		// TP_AnyApptArrival
		valueObject.setTP_AnyApptArrival( domainObject.isTP_AnyApptArrival() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.PDSConfiguration extractPDSConfiguration(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.PDSConfigurationVo valueObject) 
	{
		return 	extractPDSConfiguration(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.PDSConfiguration extractPDSConfiguration(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.PDSConfigurationVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PDSConfiguration();
		ims.core.admin.domain.objects.PDSConfiguration domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.domain.objects.PDSConfiguration)domMap.get(valueObject);
			}
			// ims.admin.vo.PDSConfigurationVo ID_PDSConfiguration field is unknown
			domainObject = new ims.core.admin.domain.objects.PDSConfiguration();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PDSConfiguration());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.domain.objects.PDSConfiguration)domMap.get(key);
			}
			domainObject = (ims.core.admin.domain.objects.PDSConfiguration) domainFactory.getDomainObject(ims.core.admin.domain.objects.PDSConfiguration.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PDSConfiguration());

		domainObject.setDOB_DATE_RANGE(valueObject.getDOB_DATE_RANGE());
		domainObject.setDOD_DATE_RANGE(valueObject.getDOD_DATE_RANGE());
		domainObject.setTRACE_ADVANCED_IGNORE_HISTORY(valueObject.getTRACE_ADVANCED_IGNORE_HISTORY());
		domainObject.setTRACE_HISTORY_DATA_INDICATOR(valueObject.getTRACE_HISTORY_DATA_INDICATOR());
		domainObject.setUSE_LPI_CROSSCHECK(valueObject.getUSE_LPI_CROSSCHECK());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNO_FIXED_ABODE_POSTCODE() != null && valueObject.getNO_FIXED_ABODE_POSTCODE().equals(""))
		{
			valueObject.setNO_FIXED_ABODE_POSTCODE(null);
		}
		domainObject.setNO_FIXED_ABODE_POSTCODE(valueObject.getNO_FIXED_ABODE_POSTCODE());
		domainObject.setADVANCED_SEARCH_TIMER_INTERVAL(valueObject.getADVANCED_SEARCH_TIMER_INTERVAL());
		ims.core.configuration.domain.objects.AppUser value8 = null;
		if ( null != valueObject.getPDS_BACKOFFICE_NOTIFICATI() ) 
		{
			if (valueObject.getPDS_BACKOFFICE_NOTIFICATI().getBoId() == null)
			{
				if (domMap.get(valueObject.getPDS_BACKOFFICE_NOTIFICATI()) != null)
				{
					value8 = (ims.core.configuration.domain.objects.AppUser)domMap.get(valueObject.getPDS_BACKOFFICE_NOTIFICATI());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value8 = domainObject.getPDS_BACKOFFICE_NOTIFICATI();	
			}
			else
			{
				value8 = (ims.core.configuration.domain.objects.AppUser)domainFactory.getDomainObject(ims.core.configuration.domain.objects.AppUser.class, valueObject.getPDS_BACKOFFICE_NOTIFICATI().getBoId());
			}
		}
		domainObject.setPDS_BACKOFFICE_NOTIFICATI(value8);
		domainObject.setNumOfDaysAppointBatchTrace(valueObject.getNumOfDaysAppointBatchTrace());
		domainObject.setNumOfDaysTCIBatchTrace(valueObject.getNumOfDaysTCIBatchTrace());
		domainObject.setNumOfDaysForNextPDSCheck(valueObject.getNumOfDaysForNextPDSCheck());
		domainObject.setSYNCHRONISE_WITH_BACKOFFICE(valueObject.getSYNCHRONISE_WITH_BACKOFFICE());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getFromPDSAccreditedSystemId() != null && valueObject.getFromPDSAccreditedSystemId().equals(""))
		{
			valueObject.setFromPDSAccreditedSystemId(null);
		}
		domainObject.setFromPDSAccreditedSystemId(valueObject.getFromPDSAccreditedSystemId());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getToPDSAccreditedSystemId() != null && valueObject.getToPDSAccreditedSystemId().equals(""))
		{
			valueObject.setToPDSAccreditedSystemId(null);
		}
		domainObject.setToPDSAccreditedSystemId(valueObject.getToPDSAccreditedSystemId());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPDS_CONFIG_FILE() != null && valueObject.getPDS_CONFIG_FILE().equals(""))
		{
			valueObject.setPDS_CONFIG_FILE(null);
		}
		domainObject.setPDS_CONFIG_FILE(valueObject.getPDS_CONFIG_FILE());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPDS_STORE_MESSAGE_LOC() != null && valueObject.getPDS_STORE_MESSAGE_LOC().equals(""))
		{
			valueObject.setPDS_STORE_MESSAGE_LOC(null);
		}
		domainObject.setPDS_STORE_MESSAGE_LOC(valueObject.getPDS_STORE_MESSAGE_LOC());
		domainObject.setPDS_STORE_MESSAGE(valueObject.getPDS_STORE_MESSAGE());
		domainObject.setSTART_PDS_GATEWAY(valueObject.getSTART_PDS_GATEWAY());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPDS_MSH_REPOSITORY() != null && valueObject.getPDS_MSH_REPOSITORY().equals(""))
		{
			valueObject.setPDS_MSH_REPOSITORY(null);
		}
		domainObject.setPDS_MSH_REPOSITORY(valueObject.getPDS_MSH_REPOSITORY());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPDS_MSH_URL() != null && valueObject.getPDS_MSH_URL().equals(""))
		{
			valueObject.setPDS_MSH_URL(null);
		}
		domainObject.setPDS_MSH_URL(valueObject.getPDS_MSH_URL());
		domainObject.setCREATE_BO_NOTIFICATIONS(valueObject.getCREATE_BO_NOTIFICATIONS());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSDSHost() != null && valueObject.getSDSHost().equals(""))
		{
			valueObject.setSDSHost(null);
		}
		domainObject.setSDSHost(valueObject.getSDSHost());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSDSPort() != null && valueObject.getSDSPort().equals(""))
		{
			valueObject.setSDSPort(null);
		}
		domainObject.setSDSPort(valueObject.getSDSPort());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPDS_URL() != null && valueObject.getPDS_URL().equals(""))
		{
			valueObject.setPDS_URL(null);
		}
		domainObject.setPDS_URL(valueObject.getPDS_URL());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPDS_HOST() != null && valueObject.getPDS_HOST().equals(""))
		{
			valueObject.setPDS_HOST(null);
		}
		domainObject.setPDS_HOST(valueObject.getPDS_HOST());
		domainObject.setPDS_STORE_SYNC_MESSAGE(valueObject.getPDS_STORE_SYNC_MESSAGE());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPDS_STORE_SYNC_MESSAGE_LOC() != null && valueObject.getPDS_STORE_SYNC_MESSAGE_LOC().equals(""))
		{
			valueObject.setPDS_STORE_SYNC_MESSAGE_LOC(null);
		}
		domainObject.setPDS_STORE_SYNC_MESSAGE_LOC(valueObject.getPDS_STORE_SYNC_MESSAGE_LOC());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getConsentChangeMessage() != null && valueObject.getConsentChangeMessage().equals(""))
		{
			valueObject.setConsentChangeMessage(null);
		}
		domainObject.setConsentChangeMessage(valueObject.getConsentChangeMessage());
		domainObject.setInactivePatientRecordBgColour(valueObject.getInactivePatientRecordBgColour());
		domainObject.setDECOUPLE_ON_DECEASE(valueObject.getDECOUPLE_ON_DECEASE());
		domainObject.setNOTIFY_ON_DECEASE(valueObject.getNOTIFY_ON_DECEASE());
		domainObject.setDECOUPLE_ON_SYNC_REQUIRED(valueObject.getDECOUPLE_ON_SYNC_REQUIRED());
		domainObject.setPDS_AUTHENTICATION(valueObject.getPDS_AUTHENTICATION());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getRBAC_PdsSearchForPatient() != null && valueObject.getRBAC_PdsSearchForPatient().equals(""))
		{
			valueObject.setRBAC_PdsSearchForPatient(null);
		}
		domainObject.setRBAC_PdsSearchForPatient(valueObject.getRBAC_PdsSearchForPatient());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getRBAC_PdsSearchPatientAdvanced() != null && valueObject.getRBAC_PdsSearchPatientAdvanced().equals(""))
		{
			valueObject.setRBAC_PdsSearchPatientAdvanced(null);
		}
		domainObject.setRBAC_PdsSearchPatientAdvanced(valueObject.getRBAC_PdsSearchPatientAdvanced());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getRBAC_PdsRetrieval() != null && valueObject.getRBAC_PdsRetrieval().equals(""))
		{
			valueObject.setRBAC_PdsRetrieval(null);
		}
		domainObject.setRBAC_PdsRetrieval(valueObject.getRBAC_PdsRetrieval());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getRBAC_AccessSensitiveData() != null && valueObject.getRBAC_AccessSensitiveData().equals(""))
		{
			valueObject.setRBAC_AccessSensitiveData(null);
		}
		domainObject.setRBAC_AccessSensitiveData(valueObject.getRBAC_AccessSensitiveData());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getRBAC_AmendPatient() != null && valueObject.getRBAC_AmendPatient().equals(""))
		{
			valueObject.setRBAC_AmendPatient(null);
		}
		domainObject.setRBAC_AmendPatient(valueObject.getRBAC_AmendPatient());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getRBAC_ControlConsent() != null && valueObject.getRBAC_ControlConsent().equals(""))
		{
			valueObject.setRBAC_ControlConsent(null);
		}
		domainObject.setRBAC_ControlConsent(valueObject.getRBAC_ControlConsent());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getRBAC_AmendPatientDecease() != null && valueObject.getRBAC_AmendPatientDecease().equals(""))
		{
			valueObject.setRBAC_AmendPatientDecease(null);
		}
		domainObject.setRBAC_AmendPatientDecease(valueObject.getRBAC_AmendPatientDecease());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getRBAC_PostcodeSearch() != null && valueObject.getRBAC_PostcodeSearch().equals(""))
		{
			valueObject.setRBAC_PostcodeSearch(null);
		}
		domainObject.setRBAC_PostcodeSearch(valueObject.getRBAC_PostcodeSearch());
		domainObject.setPDS_DISPLAY_CONSENT(valueObject.getPDS_DISPLAY_CONSENT());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value43 = null;
		if ( null != valueObject.getDOB_DATE_RANGE_TYPE() ) 
		{
			value43 =
				domainFactory.getLookupInstance(valueObject.getDOB_DATE_RANGE_TYPE().getID());
		}
		domainObject.setDOB_DATE_RANGE_TYPE(value43);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value44 = null;
		if ( null != valueObject.getDOD_DATE_RANGE_TYPE() ) 
		{
			value44 =
				domainFactory.getLookupInstance(valueObject.getDOD_DATE_RANGE_TYPE().getID());
		}
		domainObject.setDOD_DATE_RANGE_TYPE(value44);
		domainObject.setTP_BookOutpatientAppt(valueObject.getTP_BookOutpatientAppt());
		domainObject.setTP_BookWardAttenderAppt(valueObject.getTP_BookWardAttenderAppt());
		domainObject.setTP_CreateTCIAndTheatreBooking(valueObject.getTP_CreateTCIAndTheatreBooking());
		domainObject.setTP_AnyAdmission(valueObject.getTP_AnyAdmission());
		domainObject.setTP_AnyApptArrival(valueObject.getTP_AnyApptArrival());

		return domainObject;
	}

}
