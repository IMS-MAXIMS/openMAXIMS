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
public class IfOcsOrderVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocs_if.vo.IfOcsOrderVo copy(ims.ocs_if.vo.IfOcsOrderVo valueObjectDest, ims.ocs_if.vo.IfOcsOrderVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_OcsOrderSession(valueObjectSrc.getID_OcsOrderSession());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Investigations
		valueObjectDest.setInvestigations(valueObjectSrc.getInvestigations());
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
		// wasProcessed
		valueObjectDest.setWasProcessed(valueObjectSrc.getWasProcessed());
		// OrderingHospital
		valueObjectDest.setOrderingHospital(valueObjectSrc.getOrderingHospital());
		// AuthorisationOrderStatus
		valueObjectDest.setAuthorisationOrderStatus(valueObjectSrc.getAuthorisationOrderStatus());
		// OutpatientDept
		valueObjectDest.setOutpatientDept(valueObjectSrc.getOutpatientDept());
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
		// SendNumber
		valueObjectDest.setSendNumber(valueObjectSrc.getSendNumber());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createIfOcsOrderVoCollectionFromOcsOrderSession(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OcsOrderSession objects.
	 */
	public static ims.ocs_if.vo.IfOcsOrderVoCollection createIfOcsOrderVoCollectionFromOcsOrderSession(java.util.Set domainObjectSet)	
	{
		return createIfOcsOrderVoCollectionFromOcsOrderSession(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OcsOrderSession objects.
	 */
	public static ims.ocs_if.vo.IfOcsOrderVoCollection createIfOcsOrderVoCollectionFromOcsOrderSession(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocs_if.vo.IfOcsOrderVoCollection voList = new ims.ocs_if.vo.IfOcsOrderVoCollection();
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
			ims.ocs_if.vo.IfOcsOrderVo vo = create(map, domainObject);
			
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
	public static ims.ocs_if.vo.IfOcsOrderVoCollection createIfOcsOrderVoCollectionFromOcsOrderSession(java.util.List domainObjectList) 
	{
		return createIfOcsOrderVoCollectionFromOcsOrderSession(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.OcsOrderSession objects.
	 */
	public static ims.ocs_if.vo.IfOcsOrderVoCollection createIfOcsOrderVoCollectionFromOcsOrderSession(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocs_if.vo.IfOcsOrderVoCollection voList = new ims.ocs_if.vo.IfOcsOrderVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.orderingresults.domain.objects.OcsOrderSession domainObject = (ims.ocrr.orderingresults.domain.objects.OcsOrderSession) domainObjectList.get(i);
			ims.ocs_if.vo.IfOcsOrderVo vo = create(map, domainObject);

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
	 public static java.util.Set extractOcsOrderSessionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOcsOrderVoCollection voCollection) 
	 {
	 	return extractOcsOrderSessionSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOcsOrderSessionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOcsOrderVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocs_if.vo.IfOcsOrderVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OcsOrderSession domainObject = IfOcsOrderVoAssembler.extractOcsOrderSession(domainFactory, vo, domMap);

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
	 public static java.util.List extractOcsOrderSessionList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOcsOrderVoCollection voCollection) 
	 {
	 	return extractOcsOrderSessionList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOcsOrderSessionList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOcsOrderVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocs_if.vo.IfOcsOrderVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OcsOrderSession domainObject = IfOcsOrderVoAssembler.extractOcsOrderSession(domainFactory, vo, domMap);

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
	 public static ims.ocs_if.vo.IfOcsOrderVo create(ims.ocrr.orderingresults.domain.objects.OcsOrderSession domainObject) 
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
	  public static ims.ocs_if.vo.IfOcsOrderVo create(DomainObjectMap map, ims.ocrr.orderingresults.domain.objects.OcsOrderSession domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocs_if.vo.IfOcsOrderVo valueObject = (ims.ocs_if.vo.IfOcsOrderVo) map.getValueObject(domainObject, ims.ocs_if.vo.IfOcsOrderVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocs_if.vo.IfOcsOrderVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.ocs_if.vo.IfOcsOrderVo insert(ims.ocs_if.vo.IfOcsOrderVo valueObject, ims.ocrr.orderingresults.domain.objects.OcsOrderSession domainObject) 
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
	 public static ims.ocs_if.vo.IfOcsOrderVo insert(DomainObjectMap map, ims.ocs_if.vo.IfOcsOrderVo valueObject, ims.ocrr.orderingresults.domain.objects.OcsOrderSession domainObject) 
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
		// ClinicalTrial
		valueObject.setClinicalTrial( domainObject.isClinicalTrial() );
		// ClinicalTrialTxt
		valueObject.setClinicalTrialTxt(domainObject.getClinicalTrialTxt());
		// PatMobility
		ims.domain.lookups.LookupInstance instance4 = domainObject.getPatMobility();
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

			ims.ocrr.vo.lookups.OrderPatMobility voLookup4 = new ims.ocrr.vo.lookups.OrderPatMobility(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.ocrr.vo.lookups.OrderPatMobility parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.ocrr.vo.lookups.OrderPatMobility(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setPatMobility(voLookup4);
		}
				// OrderCategory
		ims.domain.lookups.LookupInstance instance5 = domainObject.getOrderCategory();
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

			ims.ocrr.vo.lookups.OrderCategory voLookup5 = new ims.ocrr.vo.lookups.OrderCategory(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.ocrr.vo.lookups.OrderCategory parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.ocrr.vo.lookups.OrderCategory(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setOrderCategory(voLookup5);
		}
				// specimens
		valueObject.setSpecimens(ims.ocs_if.vo.domain.IfOrderSpecimenVoAssembler.createIfOrderSpecimenVoCollectionFromOrderSpecimen(map, domainObject.getSpecimens()) );
		// wasProcessed
		valueObject.setWasProcessed( domainObject.isWasProcessed() );
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
		// AuthorisationOrderStatus
		ims.domain.lookups.LookupInstance instance9 = domainObject.getAuthorisationOrderStatus();
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

			ims.ocrr.vo.lookups.AuthorisationOrderStatus voLookup9 = new ims.ocrr.vo.lookups.AuthorisationOrderStatus(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.ocrr.vo.lookups.AuthorisationOrderStatus parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.ocrr.vo.lookups.AuthorisationOrderStatus(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setAuthorisationOrderStatus(voLookup9);
		}
				// OutpatientDept
		if (domainObject.getOutpatientDept() != null)
		{
			if(domainObject.getOutpatientDept() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getOutpatientDept();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setOutpatientDept(new ims.core.resource.place.vo.LocationRefVo(id, -1));				
			}
			else
			{
				valueObject.setOutpatientDept(new ims.core.resource.place.vo.LocationRefVo(domainObject.getOutpatientDept().getId(), domainObject.getOutpatientDept().getVersion()));
			}
		}
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
		// OrderedBy
		valueObject.setOrderedBy(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getOrderedBy()) );
		// ResponsibleClinician
		valueObject.setResponsibleClinician(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getResponsibleClinician()) );
		// ResponsibleGp
		valueObject.setResponsibleGp(ims.core.vo.domain.GpLiteVoAssembler.create(map, domainObject.getResponsibleGp()) );
		// PatientLocation
		if (domainObject.getPatientLocation() != null)
		{
			if(domainObject.getPatientLocation() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPatientLocation();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPatientLocation(new ims.core.resource.place.vo.LocationRefVo(id, -1));				
			}
			else
			{
				valueObject.setPatientLocation(new ims.core.resource.place.vo.LocationRefVo(domainObject.getPatientLocation().getId(), domainObject.getPatientLocation().getVersion()));
			}
		}
		// PatientClinic
		if (domainObject.getPatientClinic() != null)
		{
			if(domainObject.getPatientClinic() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPatientClinic();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPatientClinic(new ims.core.resource.place.vo.ClinicRefVo(id, -1));				
			}
			else
			{
				valueObject.setPatientClinic(new ims.core.resource.place.vo.ClinicRefVo(domainObject.getPatientClinic().getId(), domainObject.getPatientClinic().getVersion()));
			}
		}
		// AdditClinNotes
		valueObject.setAdditClinNotes(domainObject.getAdditClinNotes());
		// SendNumber
		valueObject.setSendNumber( domainObject.isSendNumber() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.orderingresults.domain.objects.OcsOrderSession extractOcsOrderSession(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOcsOrderVo valueObject) 
	{
		return 	extractOcsOrderSession(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.orderingresults.domain.objects.OcsOrderSession extractOcsOrderSession(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOcsOrderVo valueObject, HashMap domMap) 
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
			// ims.ocs_if.vo.IfOcsOrderVo ID_OcsOrderSession field is unknown
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
		domainObject.setClinicalTrial(valueObject.getClinicalTrial());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getClinicalTrialTxt() != null && valueObject.getClinicalTrialTxt().equals(""))
		{
			valueObject.setClinicalTrialTxt(null);
		}
		domainObject.setClinicalTrialTxt(valueObject.getClinicalTrialTxt());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getPatMobility() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getPatMobility().getID());
		}
		domainObject.setPatMobility(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getOrderCategory() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getOrderCategory().getID());
		}
		domainObject.setOrderCategory(value5);
		domainObject.setSpecimens(ims.ocs_if.vo.domain.IfOrderSpecimenVoAssembler.extractOrderSpecimenSet(domainFactory, valueObject.getSpecimens(), domainObject.getSpecimens(), domMap));		
		domainObject.setWasProcessed(valueObject.getWasProcessed());
		ims.core.resource.place.domain.objects.LocSite value8 = null;
		if ( null != valueObject.getOrderingHospital() ) 
		{
			if (valueObject.getOrderingHospital().getBoId() == null)
			{
				if (domMap.get(valueObject.getOrderingHospital()) != null)
				{
					value8 = (ims.core.resource.place.domain.objects.LocSite)domMap.get(valueObject.getOrderingHospital());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value8 = domainObject.getOrderingHospital();	
			}
			else
			{
				value8 = (ims.core.resource.place.domain.objects.LocSite)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.LocSite.class, valueObject.getOrderingHospital().getBoId());
			}
		}
		domainObject.setOrderingHospital(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getAuthorisationOrderStatus() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getAuthorisationOrderStatus().getID());
		}
		domainObject.setAuthorisationOrderStatus(value9);
		ims.core.resource.place.domain.objects.Location value10 = null;
		if ( null != valueObject.getOutpatientDept() ) 
		{
			if (valueObject.getOutpatientDept().getBoId() == null)
			{
				if (domMap.get(valueObject.getOutpatientDept()) != null)
				{
					value10 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getOutpatientDept());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value10 = domainObject.getOutpatientDept();	
			}
			else
			{
				value10 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getOutpatientDept().getBoId());
			}
		}
		domainObject.setOutpatientDept(value10);
		ims.core.patient.domain.objects.Patient value11 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value11 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value11 = domainObject.getPatient();	
			}
			else
			{
				value11 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value11);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value12 = null;
		if ( null != valueObject.getOrderedBy() ) 
		{
			if (valueObject.getOrderedBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getOrderedBy()) != null)
				{
					value12 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getOrderedBy());
				}
			}
			else
			{
				value12 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getOrderedBy().getBoId());
			}
		}
		domainObject.setOrderedBy(value12);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value13 = null;
		if ( null != valueObject.getResponsibleClinician() ) 
		{
			if (valueObject.getResponsibleClinician().getBoId() == null)
			{
				if (domMap.get(valueObject.getResponsibleClinician()) != null)
				{
					value13 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getResponsibleClinician());
				}
			}
			else
			{
				value13 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getResponsibleClinician().getBoId());
			}
		}
		domainObject.setResponsibleClinician(value13);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Gp value14 = null;
		if ( null != valueObject.getResponsibleGp() ) 
		{
			if (valueObject.getResponsibleGp().getBoId() == null)
			{
				if (domMap.get(valueObject.getResponsibleGp()) != null)
				{
					value14 = (ims.core.resource.people.domain.objects.Gp)domMap.get(valueObject.getResponsibleGp());
				}
			}
			else
			{
				value14 = (ims.core.resource.people.domain.objects.Gp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Gp.class, valueObject.getResponsibleGp().getBoId());
			}
		}
		domainObject.setResponsibleGp(value14);
		ims.core.resource.place.domain.objects.Location value15 = null;
		if ( null != valueObject.getPatientLocation() ) 
		{
			if (valueObject.getPatientLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatientLocation()) != null)
				{
					value15 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getPatientLocation());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value15 = domainObject.getPatientLocation();	
			}
			else
			{
				value15 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getPatientLocation().getBoId());
			}
		}
		domainObject.setPatientLocation(value15);
		ims.core.resource.place.domain.objects.Clinic value16 = null;
		if ( null != valueObject.getPatientClinic() ) 
		{
			if (valueObject.getPatientClinic().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatientClinic()) != null)
				{
					value16 = (ims.core.resource.place.domain.objects.Clinic)domMap.get(valueObject.getPatientClinic());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value16 = domainObject.getPatientClinic();	
			}
			else
			{
				value16 = (ims.core.resource.place.domain.objects.Clinic)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Clinic.class, valueObject.getPatientClinic().getBoId());
			}
		}
		domainObject.setPatientClinic(value16);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAdditClinNotes() != null && valueObject.getAdditClinNotes().equals(""))
		{
			valueObject.setAdditClinNotes(null);
		}
		domainObject.setAdditClinNotes(valueObject.getAdditClinNotes());
		domainObject.setSendNumber(valueObject.getSendNumber());

		return domainObject;
	}

}
