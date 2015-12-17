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
package ims.ocs_if.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author John MacEnri
 */
public class IfOutOcsOrderVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocs_if.vo.IfOutOcsOrderVo copy(ims.ocs_if.vo.IfOutOcsOrderVo valueObjectDest, ims.ocs_if.vo.IfOutOcsOrderVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_OcsOrderSession(valueObjectSrc.getID_OcsOrderSession());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Investigations
		valueObjectDest.setInvestigations(valueObjectSrc.getInvestigations());
		// OrderedBy
		valueObjectDest.setOrderedBy(valueObjectSrc.getOrderedBy());
		// ResponsibleClinician
		valueObjectDest.setResponsibleClinician(valueObjectSrc.getResponsibleClinician());
		// ResponsibleGp
		valueObjectDest.setResponsibleGp(valueObjectSrc.getResponsibleGp());
		// ClinicalTrial
		valueObjectDest.setClinicalTrial(valueObjectSrc.getClinicalTrial());
		// ClinicalTrialTxt
		valueObjectDest.setClinicalTrialTxt(valueObjectSrc.getClinicalTrialTxt());
		// AdditClinNotes
		valueObjectDest.setAdditClinNotes(valueObjectSrc.getAdditClinNotes());
		// PatMobility
		valueObjectDest.setPatMobility(valueObjectSrc.getPatMobility());
		// OrderCategory
		valueObjectDest.setOrderCategory(valueObjectSrc.getOrderCategory());
		// specimens
		valueObjectDest.setSpecimens(valueObjectSrc.getSpecimens());
		// wasProcessed
		valueObjectDest.setWasProcessed(valueObjectSrc.getWasProcessed());
		// PatientClinic
		valueObjectDest.setPatientClinic(valueObjectSrc.getPatientClinic());
		// PatientLocation
		valueObjectDest.setPatientLocation(valueObjectSrc.getPatientLocation());
		// ReportTo
		valueObjectDest.setReportTo(valueObjectSrc.getReportTo());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// CareContextPas
		valueObjectDest.setCareContextPas(valueObjectSrc.getCareContextPas());
		// OrderingHospital
		valueObjectDest.setOrderingHospital(valueObjectSrc.getOrderingHospital());
		// SendNumber
		valueObjectDest.setSendNumber(valueObjectSrc.getSendNumber());
		// OutpatientDept
		valueObjectDest.setOutpatientDept(valueObjectSrc.getOutpatientDept());
		// SummaryClinicalInformation
		valueObjectDest.setSummaryClinicalInformation(valueObjectSrc.getSummaryClinicalInformation());
		// BleepExtNumber
		valueObjectDest.setBleepExtNumber(valueObjectSrc.getBleepExtNumber());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createIfOutOcsOrderVoCollectionFromOcsOrderSession(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OcsOrderSession objects.
	 */
	public static ims.ocs_if.vo.IfOutOcsOrderVoCollection createIfOutOcsOrderVoCollectionFromOcsOrderSession(java.util.Set domainObjectSet)	
	{
		return createIfOutOcsOrderVoCollectionFromOcsOrderSession(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OcsOrderSession objects.
	 */
	public static ims.ocs_if.vo.IfOutOcsOrderVoCollection createIfOutOcsOrderVoCollectionFromOcsOrderSession(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocs_if.vo.IfOutOcsOrderVoCollection voList = new ims.ocs_if.vo.IfOutOcsOrderVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ocrr.orderingresults.domain.objects.OcsOrderSession domainObject = (ims.ocrr.orderingresults.domain.objects.OcsOrderSession) iterator.next();
			ims.ocs_if.vo.IfOutOcsOrderVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.OcsOrderSession objects.
	 */
	public static ims.ocs_if.vo.IfOutOcsOrderVoCollection createIfOutOcsOrderVoCollectionFromOcsOrderSession(java.util.List domainObjectList) 
	{
		return createIfOutOcsOrderVoCollectionFromOcsOrderSession(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.OcsOrderSession objects.
	 */
	public static ims.ocs_if.vo.IfOutOcsOrderVoCollection createIfOutOcsOrderVoCollectionFromOcsOrderSession(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocs_if.vo.IfOutOcsOrderVoCollection voList = new ims.ocs_if.vo.IfOutOcsOrderVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.orderingresults.domain.objects.OcsOrderSession domainObject = (ims.ocrr.orderingresults.domain.objects.OcsOrderSession) domainObjectList.get(i);
			ims.ocs_if.vo.IfOutOcsOrderVo vo = create(map, domainObject);

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
	 * Create the ims.ocrr.orderingresults.domain.objects.OcsOrderSession set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractOcsOrderSessionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOutOcsOrderVoCollection voCollection) 
	 {
	 	return extractOcsOrderSessionSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOcsOrderSessionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOutOcsOrderVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocs_if.vo.IfOutOcsOrderVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OcsOrderSession domainObject = IfOutOcsOrderVoAssembler.extractOcsOrderSession(domainFactory, vo, domMap);

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
	 * Create the ims.ocrr.orderingresults.domain.objects.OcsOrderSession list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractOcsOrderSessionList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOutOcsOrderVoCollection voCollection) 
	 {
	 	return extractOcsOrderSessionList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOcsOrderSessionList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOutOcsOrderVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocs_if.vo.IfOutOcsOrderVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OcsOrderSession domainObject = IfOutOcsOrderVoAssembler.extractOcsOrderSession(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.OcsOrderSession object.
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.OcsOrderSession
	 */
	 public static ims.ocs_if.vo.IfOutOcsOrderVo create(ims.ocrr.orderingresults.domain.objects.OcsOrderSession domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.OcsOrderSession object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ocs_if.vo.IfOutOcsOrderVo create(DomainObjectMap map, ims.ocrr.orderingresults.domain.objects.OcsOrderSession domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocs_if.vo.IfOutOcsOrderVo valueObject = (ims.ocs_if.vo.IfOutOcsOrderVo) map.getValueObject(domainObject, ims.ocs_if.vo.IfOutOcsOrderVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocs_if.vo.IfOutOcsOrderVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.OcsOrderSession
	 */
	 public static ims.ocs_if.vo.IfOutOcsOrderVo insert(ims.ocs_if.vo.IfOutOcsOrderVo valueObject, ims.ocrr.orderingresults.domain.objects.OcsOrderSession domainObject) 
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
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.OcsOrderSession
	 */
	 public static ims.ocs_if.vo.IfOutOcsOrderVo insert(DomainObjectMap map, ims.ocs_if.vo.IfOutOcsOrderVo valueObject, ims.ocrr.orderingresults.domain.objects.OcsOrderSession domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_OcsOrderSession(domainObject.getId());
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
			
		// Investigations
		valueObject.setInvestigations(ims.ocs_if.vo.domain.IfOrderInvestigationVoAssembler.createIfOrderInvestigationVoCollectionFromOrderInvestigation(map, domainObject.getInvestigations()) );
		// OrderedBy
		valueObject.setOrderedBy(ims.core.vo.domain.MemberOfStaffShortVoAssembler.create(map, domainObject.getOrderedBy()) );
		// ResponsibleClinician
		valueObject.setResponsibleClinician(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getResponsibleClinician()) );
		// ResponsibleGp
		valueObject.setResponsibleGp(ims.core.vo.domain.GpShortVoAssembler.create(map, domainObject.getResponsibleGp()) );
		// ClinicalTrial
		valueObject.setClinicalTrial( domainObject.isClinicalTrial() );
		// ClinicalTrialTxt
		valueObject.setClinicalTrialTxt(domainObject.getClinicalTrialTxt());
		// AdditClinNotes
		valueObject.setAdditClinNotes(domainObject.getAdditClinNotes());
		// PatMobility
		ims.domain.lookups.LookupInstance instance8 = domainObject.getPatMobility();
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

			ims.ocrr.vo.lookups.OrderPatMobility voLookup8 = new ims.ocrr.vo.lookups.OrderPatMobility(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.ocrr.vo.lookups.OrderPatMobility parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.ocrr.vo.lookups.OrderPatMobility(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setPatMobility(voLookup8);
		}
				// OrderCategory
		ims.domain.lookups.LookupInstance instance9 = domainObject.getOrderCategory();
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

			ims.ocrr.vo.lookups.OrderCategory voLookup9 = new ims.ocrr.vo.lookups.OrderCategory(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.ocrr.vo.lookups.OrderCategory parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.ocrr.vo.lookups.OrderCategory(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setOrderCategory(voLookup9);
		}
				// specimens
		valueObject.setSpecimens(ims.ocs_if.vo.domain.IfOrderSpecimenVoAssembler.createIfOrderSpecimenVoCollectionFromOrderSpecimen(map, domainObject.getSpecimens()) );
		// wasProcessed
		valueObject.setWasProcessed( domainObject.isWasProcessed() );
		// PatientClinic
		valueObject.setPatientClinic(ims.core.vo.domain.ClinicLiteVoAssembler.create(map, domainObject.getPatientClinic()) );
		// PatientLocation
		valueObject.setPatientLocation(ims.core.vo.domain.LocShortMappingsVoAssembler.create(map, domainObject.getPatientLocation()) );
		// ReportTo
		valueObject.setReportTo(ims.ocrr.vo.domain.OcsReportToVoAssembler.createOcsReportToVoCollectionFromOcsReportTo(map, domainObject.getReportTo()) );
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
		// CareContextPas
		valueObject.setCareContextPas(ims.core.vo.domain.CareContextPasVoAssembler.create(map, domainObject.getCareContext()) );
		// OrderingHospital
		if (domainObject.getOrderingHospital() != null)
		{
			if(domainObject.getOrderingHospital() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getOrderingHospital();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setOrderingHospital(new ims.core.resource.place.vo.LocSiteRefVo(id, -1));				
			}
			else
			{
				valueObject.setOrderingHospital(new ims.core.resource.place.vo.LocSiteRefVo(domainObject.getOrderingHospital().getId(), domainObject.getOrderingHospital().getVersion()));
			}
		}
		// SendNumber
		valueObject.setSendNumber( domainObject.isSendNumber() );
		// OutpatientDept
		valueObject.setOutpatientDept(ims.core.vo.domain.LocShortMappingsVoAssembler.create(map, domainObject.getOutpatientDept()) );
		// SummaryClinicalInformation
		valueObject.setSummaryClinicalInformation(domainObject.getSummaryClinicalInformation());
		// BleepExtNumber
		valueObject.setBleepExtNumber(domainObject.getBleepExtNumber());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.orderingresults.domain.objects.OcsOrderSession extractOcsOrderSession(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOutOcsOrderVo valueObject) 
	{
		return 	extractOcsOrderSession(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.orderingresults.domain.objects.OcsOrderSession extractOcsOrderSession(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOutOcsOrderVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_OcsOrderSession();
		ims.ocrr.orderingresults.domain.objects.OcsOrderSession domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.OcsOrderSession)domMap.get(valueObject);
			}
			// ims.ocs_if.vo.IfOutOcsOrderVo ID_OcsOrderSession field is unknown
			domainObject = new ims.ocrr.orderingresults.domain.objects.OcsOrderSession();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_OcsOrderSession());
			if (domMap.get(key) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.OcsOrderSession)domMap.get(key);
			}
			domainObject = (ims.ocrr.orderingresults.domain.objects.OcsOrderSession) domainFactory.getDomainObject(ims.ocrr.orderingresults.domain.objects.OcsOrderSession.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_OcsOrderSession());

		domainObject.setInvestigations(ims.ocs_if.vo.domain.IfOrderInvestigationVoAssembler.extractOrderInvestigationSet(domainFactory, valueObject.getInvestigations(), domainObject.getInvestigations(), domMap));		
		domainObject.setOrderedBy(ims.core.vo.domain.MemberOfStaffShortVoAssembler.extractMemberOfStaff(domainFactory, valueObject.getOrderedBy(), domMap));
		domainObject.setResponsibleClinician(ims.core.vo.domain.HcpAssembler.extractHcp(domainFactory, valueObject.getResponsibleClinician(), domMap));
		domainObject.setResponsibleGp(ims.core.vo.domain.GpShortVoAssembler.extractGp(domainFactory, valueObject.getResponsibleGp(), domMap));
		domainObject.setClinicalTrial(valueObject.getClinicalTrial());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getClinicalTrialTxt() != null && valueObject.getClinicalTrialTxt().equals(""))
		{
			valueObject.setClinicalTrialTxt(null);
		}
		domainObject.setClinicalTrialTxt(valueObject.getClinicalTrialTxt());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAdditClinNotes() != null && valueObject.getAdditClinNotes().equals(""))
		{
			valueObject.setAdditClinNotes(null);
		}
		domainObject.setAdditClinNotes(valueObject.getAdditClinNotes());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getPatMobility() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getPatMobility().getID());
		}
		domainObject.setPatMobility(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getOrderCategory() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getOrderCategory().getID());
		}
		domainObject.setOrderCategory(value9);
		domainObject.setSpecimens(ims.ocs_if.vo.domain.IfOrderSpecimenVoAssembler.extractOrderSpecimenSet(domainFactory, valueObject.getSpecimens(), domainObject.getSpecimens(), domMap));		
		domainObject.setWasProcessed(valueObject.getWasProcessed());
		domainObject.setPatientClinic(ims.core.vo.domain.ClinicLiteVoAssembler.extractClinic(domainFactory, valueObject.getPatientClinic(), domMap));
		domainObject.setPatientLocation(ims.core.vo.domain.LocShortMappingsVoAssembler.extractLocation(domainFactory, valueObject.getPatientLocation(), domMap));
		domainObject.setReportTo(ims.ocrr.vo.domain.OcsReportToVoAssembler.extractOcsReportToList(domainFactory, valueObject.getReportTo(), domainObject.getReportTo(), domMap));		
		ims.core.patient.domain.objects.Patient value15 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value15 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value15 = domainObject.getPatient();	
			}
			else
			{
				value15 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value15);
		domainObject.setCareContext(ims.core.vo.domain.CareContextPasVoAssembler.extractCareContext(domainFactory, valueObject.getCareContextPas(), domMap));
		ims.core.resource.place.domain.objects.LocSite value17 = null;
		if ( null != valueObject.getOrderingHospital() ) 
		{
			if (valueObject.getOrderingHospital().getBoId() == null)
			{
				if (domMap.get(valueObject.getOrderingHospital()) != null)
				{
					value17 = (ims.core.resource.place.domain.objects.LocSite)domMap.get(valueObject.getOrderingHospital());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value17 = domainObject.getOrderingHospital();	
			}
			else
			{
				value17 = (ims.core.resource.place.domain.objects.LocSite)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.LocSite.class, valueObject.getOrderingHospital().getBoId());
			}
		}
		domainObject.setOrderingHospital(value17);
		domainObject.setSendNumber(valueObject.getSendNumber());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value19 = null;
		if ( null != valueObject.getOutpatientDept() ) 
		{
			if (valueObject.getOutpatientDept().getBoId() == null)
			{
				if (domMap.get(valueObject.getOutpatientDept()) != null)
				{
					value19 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getOutpatientDept());
				}
			}
			else
			{
				value19 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getOutpatientDept().getBoId());
			}
		}
		domainObject.setOutpatientDept(value19);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSummaryClinicalInformation() != null && valueObject.getSummaryClinicalInformation().equals(""))
		{
			valueObject.setSummaryClinicalInformation(null);
		}
		domainObject.setSummaryClinicalInformation(valueObject.getSummaryClinicalInformation());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getBleepExtNumber() != null && valueObject.getBleepExtNumber().equals(""))
		{
			valueObject.setBleepExtNumber(null);
		}
		domainObject.setBleepExtNumber(valueObject.getBleepExtNumber());

		return domainObject;
	}

}
