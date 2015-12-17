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
package ims.ocrr.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class OcsOrderVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.OcsOrderVo copy(ims.ocrr.vo.OcsOrderVo valueObjectDest, ims.ocrr.vo.OcsOrderVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_OcsOrderSession(valueObjectSrc.getID_OcsOrderSession());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ClinicalTrial
		valueObjectDest.setClinicalTrial(valueObjectSrc.getClinicalTrial());
		// ClinicalTrialTxt
		valueObjectDest.setClinicalTrialTxt(valueObjectSrc.getClinicalTrialTxt());
		// PatMobility
		valueObjectDest.setPatMobility(valueObjectSrc.getPatMobility());
		// OrderCategory
		valueObjectDest.setOrderCategory(valueObjectSrc.getOrderCategory());
		// specimens
		valueObjectDest.setSpecimens(valueObjectSrc.getSpecimens());
		// Investigations
		valueObjectDest.setInvestigations(valueObjectSrc.getInvestigations());
		// wasProcessed
		valueObjectDest.setWasProcessed(valueObjectSrc.getWasProcessed());
		// ClinicalInfo
		valueObjectDest.setClinicalInfo(valueObjectSrc.getClinicalInfo());
		// ReportTo
		valueObjectDest.setReportTo(valueObjectSrc.getReportTo());
		// SummaryClinicalInformation
		valueObjectDest.setSummaryClinicalInformation(valueObjectSrc.getSummaryClinicalInformation());
		// BleepExtNumber
		valueObjectDest.setBleepExtNumber(valueObjectSrc.getBleepExtNumber());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// OrderedBy
		valueObjectDest.setOrderedBy(valueObjectSrc.getOrderedBy());
		// ResponsibleClinician
		valueObjectDest.setResponsibleClinician(valueObjectSrc.getResponsibleClinician());
		// ResponsibleGp
		valueObjectDest.setResponsibleGp(valueObjectSrc.getResponsibleGp());
		// PatientLocation
		valueObjectDest.setPatientLocation(valueObjectSrc.getPatientLocation());
		// PatientClinic
		valueObjectDest.setPatientClinic(valueObjectSrc.getPatientClinic());
		// AdditClinNotes
		valueObjectDest.setAdditClinNotes(valueObjectSrc.getAdditClinNotes());
		// SysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// OrderingHospital
		valueObjectDest.setOrderingHospital(valueObjectSrc.getOrderingHospital());
		// OutpatientDept
		valueObjectDest.setOutpatientDept(valueObjectSrc.getOutpatientDept());
		// AuthorisationOrderStatus
		valueObjectDest.setAuthorisationOrderStatus(valueObjectSrc.getAuthorisationOrderStatus());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createOcsOrderVoCollectionFromOcsOrderSession(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OcsOrderSession objects.
	 */
	public static ims.ocrr.vo.OcsOrderVoCollection createOcsOrderVoCollectionFromOcsOrderSession(java.util.Set domainObjectSet)	
	{
		return createOcsOrderVoCollectionFromOcsOrderSession(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OcsOrderSession objects.
	 */
	public static ims.ocrr.vo.OcsOrderVoCollection createOcsOrderVoCollectionFromOcsOrderSession(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.OcsOrderVoCollection voList = new ims.ocrr.vo.OcsOrderVoCollection();
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
			ims.ocrr.vo.OcsOrderVo vo = create(map, domainObject);
			
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
	public static ims.ocrr.vo.OcsOrderVoCollection createOcsOrderVoCollectionFromOcsOrderSession(java.util.List domainObjectList) 
	{
		return createOcsOrderVoCollectionFromOcsOrderSession(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.OcsOrderSession objects.
	 */
	public static ims.ocrr.vo.OcsOrderVoCollection createOcsOrderVoCollectionFromOcsOrderSession(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.OcsOrderVoCollection voList = new ims.ocrr.vo.OcsOrderVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.orderingresults.domain.objects.OcsOrderSession domainObject = (ims.ocrr.orderingresults.domain.objects.OcsOrderSession) domainObjectList.get(i);
			ims.ocrr.vo.OcsOrderVo vo = create(map, domainObject);

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
	 public static java.util.Set extractOcsOrderSessionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OcsOrderVoCollection voCollection) 
	 {
	 	return extractOcsOrderSessionSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOcsOrderSessionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OcsOrderVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.OcsOrderVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OcsOrderSession domainObject = OcsOrderVoAssembler.extractOcsOrderSession(domainFactory, vo, domMap);

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
	 public static java.util.List extractOcsOrderSessionList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OcsOrderVoCollection voCollection) 
	 {
	 	return extractOcsOrderSessionList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOcsOrderSessionList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OcsOrderVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.OcsOrderVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OcsOrderSession domainObject = OcsOrderVoAssembler.extractOcsOrderSession(domainFactory, vo, domMap);

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
	 public static ims.ocrr.vo.OcsOrderVo create(ims.ocrr.orderingresults.domain.objects.OcsOrderSession domainObject) 
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
	  public static ims.ocrr.vo.OcsOrderVo create(DomainObjectMap map, ims.ocrr.orderingresults.domain.objects.OcsOrderSession domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.OcsOrderVo valueObject = (ims.ocrr.vo.OcsOrderVo) map.getValueObject(domainObject, ims.ocrr.vo.OcsOrderVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.OcsOrderVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.ocrr.vo.OcsOrderVo insert(ims.ocrr.vo.OcsOrderVo valueObject, ims.ocrr.orderingresults.domain.objects.OcsOrderSession domainObject) 
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
	 public static ims.ocrr.vo.OcsOrderVo insert(DomainObjectMap map, ims.ocrr.vo.OcsOrderVo valueObject, ims.ocrr.orderingresults.domain.objects.OcsOrderSession domainObject) 
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
			
		// ClinicalTrial
		valueObject.setClinicalTrial( domainObject.isClinicalTrial() );
		// ClinicalTrialTxt
		valueObject.setClinicalTrialTxt(domainObject.getClinicalTrialTxt());
		// PatMobility
		ims.domain.lookups.LookupInstance instance3 = domainObject.getPatMobility();
		if ( null != instance3 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance3.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance3.getImage().getImageId(), instance3.getImage().getImagePath());
			}
			color = instance3.getColor();
			if (color != null) 
				color.getValue();

			ims.ocrr.vo.lookups.OrderPatMobility voLookup3 = new ims.ocrr.vo.lookups.OrderPatMobility(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.ocrr.vo.lookups.OrderPatMobility parentVoLookup3 = voLookup3;
			ims.domain.lookups.LookupInstance parent3 = instance3.getParent();
			while (parent3 != null)
			{
				if (parent3.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent3.getImage().getImageId(), parent3.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent3.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup3.setParent(new ims.ocrr.vo.lookups.OrderPatMobility(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setPatMobility(voLookup3);
		}
				// OrderCategory
		ims.domain.lookups.LookupInstance instance4 = domainObject.getOrderCategory();
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

			ims.ocrr.vo.lookups.OrderCategory voLookup4 = new ims.ocrr.vo.lookups.OrderCategory(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.ocrr.vo.lookups.OrderCategory parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.ocrr.vo.lookups.OrderCategory(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setOrderCategory(voLookup4);
		}
				// specimens
		valueObject.setSpecimens(ims.ocrr.vo.domain.OrderSpecimenVoAssembler.createOrderSpecimenVoCollectionFromOrderSpecimen(map, domainObject.getSpecimens()) );
		// Investigations
		valueObject.setInvestigations(ims.ocrr.vo.domain.OrderInvestigationVoAssembler.createOrderInvestigationVoCollectionFromOrderInvestigation(map, domainObject.getInvestigations()) );
		// wasProcessed
		valueObject.setWasProcessed( domainObject.isWasProcessed() );
		// ClinicalInfo
		valueObject.setClinicalInfo(ims.ocrr.vo.domain.OcsQASessionVoAssembler.create(map, domainObject.getClinicalInfo()) );
		// ReportTo
		valueObject.setReportTo(ims.ocrr.vo.domain.OcsReportToVoAssembler.createOcsReportToVoCollectionFromOcsReportTo(map, domainObject.getReportTo()) );
		// SummaryClinicalInformation
		valueObject.setSummaryClinicalInformation(domainObject.getSummaryClinicalInformation());
		// BleepExtNumber
		valueObject.setBleepExtNumber(domainObject.getBleepExtNumber());
		// ClinicalContact
		if (domainObject.getClinicalContact() != null)
		{
			if(domainObject.getClinicalContact() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getClinicalContact();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(id, -1));				
			}
			else
			{
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(domainObject.getClinicalContact().getId(), domainObject.getClinicalContact().getVersion()));
			}
		}
		// Patient
		valueObject.setPatient(ims.core.vo.domain.PatientShortAssembler.create(map, domainObject.getPatient()) );
		// OrderedBy
		valueObject.setOrderedBy(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getOrderedBy()) );
		// ResponsibleClinician
		valueObject.setResponsibleClinician(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getResponsibleClinician()) );
		// ResponsibleGp
		valueObject.setResponsibleGp(ims.core.vo.domain.GpLiteVoAssembler.create(map, domainObject.getResponsibleGp()) );
		// PatientLocation
		valueObject.setPatientLocation(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getPatientLocation()) );
		// PatientClinic
		valueObject.setPatientClinic(ims.core.vo.domain.ClinicLiteVoAssembler.create(map, domainObject.getPatientClinic()) );
		// AdditClinNotes
		valueObject.setAdditClinNotes(domainObject.getAdditClinNotes());
		// SysInfo
		// set system information
		valueObject.setSysInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// CareContext
		valueObject.setCareContext(ims.core.vo.domain.CareContextPasVoAssembler.create(map, domainObject.getCareContext()) );
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
		// OutpatientDept
		valueObject.setOutpatientDept(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getOutpatientDept()) );
		// AuthorisationOrderStatus
		ims.domain.lookups.LookupInstance instance24 = domainObject.getAuthorisationOrderStatus();
		if ( null != instance24 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance24.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance24.getImage().getImageId(), instance24.getImage().getImagePath());
			}
			color = instance24.getColor();
			if (color != null) 
				color.getValue();

			ims.ocrr.vo.lookups.AuthorisationOrderStatus voLookup24 = new ims.ocrr.vo.lookups.AuthorisationOrderStatus(instance24.getId(),instance24.getText(), instance24.isActive(), null, img, color);
			ims.ocrr.vo.lookups.AuthorisationOrderStatus parentVoLookup24 = voLookup24;
			ims.domain.lookups.LookupInstance parent24 = instance24.getParent();
			while (parent24 != null)
			{
				if (parent24.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent24.getImage().getImageId(), parent24.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent24.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup24.setParent(new ims.ocrr.vo.lookups.AuthorisationOrderStatus(parent24.getId(),parent24.getText(), parent24.isActive(), null, img, color));
				parentVoLookup24 = parentVoLookup24.getParent();
								parent24 = parent24.getParent();
			}			
			valueObject.setAuthorisationOrderStatus(voLookup24);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.orderingresults.domain.objects.OcsOrderSession extractOcsOrderSession(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OcsOrderVo valueObject) 
	{
		return 	extractOcsOrderSession(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.orderingresults.domain.objects.OcsOrderSession extractOcsOrderSession(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OcsOrderVo valueObject, HashMap domMap) 
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
			// ims.ocrr.vo.OcsOrderVo ID_OcsOrderSession field is unknown
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

		domainObject.setClinicalTrial(valueObject.getClinicalTrial());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getClinicalTrialTxt() != null && valueObject.getClinicalTrialTxt().equals(""))
		{
			valueObject.setClinicalTrialTxt(null);
		}
		domainObject.setClinicalTrialTxt(valueObject.getClinicalTrialTxt());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getPatMobility() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getPatMobility().getID());
		}
		domainObject.setPatMobility(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getOrderCategory() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getOrderCategory().getID());
		}
		domainObject.setOrderCategory(value4);
		domainObject.setSpecimens(ims.ocrr.vo.domain.OrderSpecimenVoAssembler.extractOrderSpecimenSet(domainFactory, valueObject.getSpecimens(), domainObject.getSpecimens(), domMap));		
		domainObject.setInvestigations(ims.ocrr.vo.domain.OrderInvestigationVoAssembler.extractOrderInvestigationSet(domainFactory, valueObject.getInvestigations(), domainObject.getInvestigations(), domMap));		
		domainObject.setWasProcessed(valueObject.getWasProcessed());
		domainObject.setClinicalInfo(ims.ocrr.vo.domain.OcsQASessionVoAssembler.extractOcsQASession(domainFactory, valueObject.getClinicalInfo(), domMap));
		domainObject.setReportTo(ims.ocrr.vo.domain.OcsReportToVoAssembler.extractOcsReportToList(domainFactory, valueObject.getReportTo(), domainObject.getReportTo(), domMap));		
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
		ims.core.admin.domain.objects.ClinicalContact value12 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value12 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value12 = domainObject.getClinicalContact();	
			}
			else
			{
				value12 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value12);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.patient.domain.objects.Patient value13 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value13 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else
			{
				value13 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value13);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value14 = null;
		if ( null != valueObject.getOrderedBy() ) 
		{
			if (valueObject.getOrderedBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getOrderedBy()) != null)
				{
					value14 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getOrderedBy());
				}
			}
			else
			{
				value14 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getOrderedBy().getBoId());
			}
		}
		domainObject.setOrderedBy(value14);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value15 = null;
		if ( null != valueObject.getResponsibleClinician() ) 
		{
			if (valueObject.getResponsibleClinician().getBoId() == null)
			{
				if (domMap.get(valueObject.getResponsibleClinician()) != null)
				{
					value15 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getResponsibleClinician());
				}
			}
			else
			{
				value15 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getResponsibleClinician().getBoId());
			}
		}
		domainObject.setResponsibleClinician(value15);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Gp value16 = null;
		if ( null != valueObject.getResponsibleGp() ) 
		{
			if (valueObject.getResponsibleGp().getBoId() == null)
			{
				if (domMap.get(valueObject.getResponsibleGp()) != null)
				{
					value16 = (ims.core.resource.people.domain.objects.Gp)domMap.get(valueObject.getResponsibleGp());
				}
			}
			else
			{
				value16 = (ims.core.resource.people.domain.objects.Gp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Gp.class, valueObject.getResponsibleGp().getBoId());
			}
		}
		domainObject.setResponsibleGp(value16);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value17 = null;
		if ( null != valueObject.getPatientLocation() ) 
		{
			if (valueObject.getPatientLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatientLocation()) != null)
				{
					value17 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getPatientLocation());
				}
			}
			else
			{
				value17 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getPatientLocation().getBoId());
			}
		}
		domainObject.setPatientLocation(value17);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Clinic value18 = null;
		if ( null != valueObject.getPatientClinic() ) 
		{
			if (valueObject.getPatientClinic().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatientClinic()) != null)
				{
					value18 = (ims.core.resource.place.domain.objects.Clinic)domMap.get(valueObject.getPatientClinic());
				}
			}
			else
			{
				value18 = (ims.core.resource.place.domain.objects.Clinic)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Clinic.class, valueObject.getPatientClinic().getBoId());
			}
		}
		domainObject.setPatientClinic(value18);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAdditClinNotes() != null && valueObject.getAdditClinNotes().equals(""))
		{
			valueObject.setAdditClinNotes(null);
		}
		domainObject.setAdditClinNotes(valueObject.getAdditClinNotes());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.CareContext value21 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value21 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else
			{
				value21 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value21);
		ims.core.resource.place.domain.objects.LocSite value22 = null;
		if ( null != valueObject.getOrderingHospital() ) 
		{
			if (valueObject.getOrderingHospital().getBoId() == null)
			{
				if (domMap.get(valueObject.getOrderingHospital()) != null)
				{
					value22 = (ims.core.resource.place.domain.objects.LocSite)domMap.get(valueObject.getOrderingHospital());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value22 = domainObject.getOrderingHospital();	
			}
			else
			{
				value22 = (ims.core.resource.place.domain.objects.LocSite)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.LocSite.class, valueObject.getOrderingHospital().getBoId());
			}
		}
		domainObject.setOrderingHospital(value22);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value23 = null;
		if ( null != valueObject.getOutpatientDept() ) 
		{
			if (valueObject.getOutpatientDept().getBoId() == null)
			{
				if (domMap.get(valueObject.getOutpatientDept()) != null)
				{
					value23 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getOutpatientDept());
				}
			}
			else
			{
				value23 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getOutpatientDept().getBoId());
			}
		}
		domainObject.setOutpatientDept(value23);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value24 = null;
		if ( null != valueObject.getAuthorisationOrderStatus() ) 
		{
			value24 =
				domainFactory.getLookupInstance(valueObject.getAuthorisationOrderStatus().getID());
		}
		domainObject.setAuthorisationOrderStatus(value24);

		return domainObject;
	}

}
