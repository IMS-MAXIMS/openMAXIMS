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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class AdmissionDetailVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.AdmissionDetailVo copy(ims.core.vo.AdmissionDetailVo valueObjectDest, ims.core.vo.AdmissionDetailVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_AdmissionDetail(valueObjectSrc.getID_AdmissionDetail());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// pasEvent
		valueObjectDest.setPasEvent(valueObjectSrc.getPasEvent());
		// AdmissionDateTime
		valueObjectDest.setAdmissionDateTime(valueObjectSrc.getAdmissionDateTime());
		// Ward
		valueObjectDest.setWard(valueObjectSrc.getWard());
		// Bed
		valueObjectDest.setBed(valueObjectSrc.getBed());
		// Consultant
		valueObjectDest.setConsultant(valueObjectSrc.getConsultant());
		// Specialty
		valueObjectDest.setSpecialty(valueObjectSrc.getSpecialty());
		// WardType
		valueObjectDest.setWardType(valueObjectSrc.getWardType());
		// MethodOfAdmission
		valueObjectDest.setMethodOfAdmission(valueObjectSrc.getMethodOfAdmission());
		// SourceOfAdmission
		valueObjectDest.setSourceOfAdmission(valueObjectSrc.getSourceOfAdmission());
		// ReasonForAdmission
		valueObjectDest.setReasonForAdmission(valueObjectSrc.getReasonForAdmission());
		// EstDischargeDate
		valueObjectDest.setEstDischargeDate(valueObjectSrc.getEstDischargeDate());
		// isChaplainRequired
		valueObjectDest.setIsChaplainRequired(valueObjectSrc.getIsChaplainRequired());
		// ReferringConsultant
		valueObjectDest.setReferringConsultant(valueObjectSrc.getReferringConsultant());
		// PatientStatus
		valueObjectDest.setPatientStatus(valueObjectSrc.getPatientStatus());
		// UpdateCFL
		valueObjectDest.setUpdateCFL(valueObjectSrc.getUpdateCFL());
		// AnticipatedStay
		valueObjectDest.setAnticipatedStay(valueObjectSrc.getAnticipatedStay());
		// CaseFolderComments
		valueObjectDest.setCaseFolderComments(valueObjectSrc.getCaseFolderComments());
		// AdmissionEpisode
		valueObjectDest.setAdmissionEpisode(valueObjectSrc.getAdmissionEpisode());
		// ExtendedDetails
		valueObjectDest.setExtendedDetails(valueObjectSrc.getExtendedDetails());
		// TransferHistory
		valueObjectDest.setTransferHistory(valueObjectSrc.getTransferHistory());
		// Service
		valueObjectDest.setService(valueObjectSrc.getService());
		// ExtendedLengthOfStayReason
		valueObjectDest.setExtendedLengthOfStayReason(valueObjectSrc.getExtendedLengthOfStayReason());
		// MedicallyFitForDischarge
		valueObjectDest.setMedicallyFitForDischarge(valueObjectSrc.getMedicallyFitForDischarge());
		// ReasonDelayedDischarge
		valueObjectDest.setReasonDelayedDischarge(valueObjectSrc.getReasonDelayedDischarge());
		// PatientRequiresTransport
		valueObjectDest.setPatientRequiresTransport(valueObjectSrc.getPatientRequiresTransport());
		// TransportDetails
		valueObjectDest.setTransportDetails(valueObjectSrc.getTransportDetails());
		// AbleToGoDischargeLounge
		valueObjectDest.setAbleToGoDischargeLounge(valueObjectSrc.getAbleToGoDischargeLounge());
		// ReasonCannotGoDischargeLounge
		valueObjectDest.setReasonCannotGoDischargeLounge(valueObjectSrc.getReasonCannotGoDischargeLounge());
		// SelfAdmitPatient
		valueObjectDest.setSelfAdmitPatient(valueObjectSrc.getSelfAdmitPatient());
		// SourceOfEmergencyReferral
		valueObjectDest.setSourceOfEmergencyReferral(valueObjectSrc.getSourceOfEmergencyReferral());
		// HealthyLodgerDetails
		valueObjectDest.setHealthyLodgerDetails(valueObjectSrc.getHealthyLodgerDetails());
		// AdmissionWard
		valueObjectDest.setAdmissionWard(valueObjectSrc.getAdmissionWard());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createAdmissionDetailVoCollectionFromAdmissionDetail(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.AdmissionDetail objects.
	 */
	public static ims.core.vo.AdmissionDetailVoCollection createAdmissionDetailVoCollectionFromAdmissionDetail(java.util.Set domainObjectSet)	
	{
		return createAdmissionDetailVoCollectionFromAdmissionDetail(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.AdmissionDetail objects.
	 */
	public static ims.core.vo.AdmissionDetailVoCollection createAdmissionDetailVoCollectionFromAdmissionDetail(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.AdmissionDetailVoCollection voList = new ims.core.vo.AdmissionDetailVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.pas.domain.objects.AdmissionDetail domainObject = (ims.core.admin.pas.domain.objects.AdmissionDetail) iterator.next();
			ims.core.vo.AdmissionDetailVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.AdmissionDetail objects.
	 */
	public static ims.core.vo.AdmissionDetailVoCollection createAdmissionDetailVoCollectionFromAdmissionDetail(java.util.List domainObjectList) 
	{
		return createAdmissionDetailVoCollectionFromAdmissionDetail(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.AdmissionDetail objects.
	 */
	public static ims.core.vo.AdmissionDetailVoCollection createAdmissionDetailVoCollectionFromAdmissionDetail(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.AdmissionDetailVoCollection voList = new ims.core.vo.AdmissionDetailVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.AdmissionDetail domainObject = (ims.core.admin.pas.domain.objects.AdmissionDetail) domainObjectList.get(i);
			ims.core.vo.AdmissionDetailVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.pas.domain.objects.AdmissionDetail set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractAdmissionDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.AdmissionDetailVoCollection voCollection) 
	 {
	 	return extractAdmissionDetailSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractAdmissionDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.AdmissionDetailVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.AdmissionDetailVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.AdmissionDetail domainObject = AdmissionDetailVoAssembler.extractAdmissionDetail(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.pas.domain.objects.AdmissionDetail list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractAdmissionDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.AdmissionDetailVoCollection voCollection) 
	 {
	 	return extractAdmissionDetailList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractAdmissionDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.AdmissionDetailVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.AdmissionDetailVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.AdmissionDetail domainObject = AdmissionDetailVoAssembler.extractAdmissionDetail(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.pas.domain.objects.AdmissionDetail object.
	 * @param domainObject ims.core.admin.pas.domain.objects.AdmissionDetail
	 */
	 public static ims.core.vo.AdmissionDetailVo create(ims.core.admin.pas.domain.objects.AdmissionDetail domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.pas.domain.objects.AdmissionDetail object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.AdmissionDetailVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.AdmissionDetail domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.AdmissionDetailVo valueObject = (ims.core.vo.AdmissionDetailVo) map.getValueObject(domainObject, ims.core.vo.AdmissionDetailVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.AdmissionDetailVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.pas.domain.objects.AdmissionDetail
	 */
	 public static ims.core.vo.AdmissionDetailVo insert(ims.core.vo.AdmissionDetailVo valueObject, ims.core.admin.pas.domain.objects.AdmissionDetail domainObject) 
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
	 * @param domainObject ims.core.admin.pas.domain.objects.AdmissionDetail
	 */
	 public static ims.core.vo.AdmissionDetailVo insert(DomainObjectMap map, ims.core.vo.AdmissionDetailVo valueObject, ims.core.admin.pas.domain.objects.AdmissionDetail domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_AdmissionDetail(domainObject.getId());
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
			
		// pasEvent
		valueObject.setPasEvent(ims.core.vo.domain.PasEventAdmitVoAssembler.create(map, domainObject.getPasEvent()) );
		// AdmissionDateTime
		java.util.Date AdmissionDateTime = domainObject.getAdmissionDateTime();
		if ( null != AdmissionDateTime ) 
		{
			valueObject.setAdmissionDateTime(new ims.framework.utils.DateTime(AdmissionDateTime) );
		}
		// Ward
		valueObject.setWard(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getWard()) );
		// Bed
		if (domainObject.getBed() != null)
		{
			if(domainObject.getBed() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getBed();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setBed(new ims.core.layout.vo.BedSpaceRefVo(id, -1));				
			}
			else
			{
				valueObject.setBed(new ims.core.layout.vo.BedSpaceRefVo(domainObject.getBed().getId(), domainObject.getBed().getVersion()));
			}
		}
		// Consultant
		valueObject.setConsultant(ims.core.vo.domain.MedicVoAssembler.create(map, domainObject.getConsultant()) );
		// Specialty
		ims.domain.lookups.LookupInstance instance6 = domainObject.getSpecialty();
		if ( null != instance6 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance6.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance6.getImage().getImageId(), instance6.getImage().getImagePath());
			}
			color = instance6.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.Specialty voLookup6 = new ims.core.vo.lookups.Specialty(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup6 = voLookup6;
			ims.domain.lookups.LookupInstance parent6 = instance6.getParent();
			while (parent6 != null)
			{
				if (parent6.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent6.getImage().getImageId(), parent6.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent6.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup6.setParent(new ims.core.vo.lookups.Specialty(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setSpecialty(voLookup6);
		}
				// WardType
		ims.domain.lookups.LookupInstance instance7 = domainObject.getWardType();
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

			ims.core.vo.lookups.WardType voLookup7 = new ims.core.vo.lookups.WardType(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.WardType parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.core.vo.lookups.WardType(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setWardType(voLookup7);
		}
				// MethodOfAdmission
		ims.domain.lookups.LookupInstance instance8 = domainObject.getMethodOfAdmission();
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

			ims.core.vo.lookups.MethodOfAdmission voLookup8 = new ims.core.vo.lookups.MethodOfAdmission(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.MethodOfAdmission parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.MethodOfAdmission(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setMethodOfAdmission(voLookup8);
		}
				// SourceOfAdmission
		ims.domain.lookups.LookupInstance instance9 = domainObject.getSourceOfAdmission();
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

			ims.core.vo.lookups.SourceOfAdmission voLookup9 = new ims.core.vo.lookups.SourceOfAdmission(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.SourceOfAdmission parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.core.vo.lookups.SourceOfAdmission(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setSourceOfAdmission(voLookup9);
		}
				// ReasonForAdmission
		valueObject.setReasonForAdmission(domainObject.getReasonForAdmission());
		// EstDischargeDate
		java.util.Date EstDischargeDate = domainObject.getEstDischargeDate();
		if ( null != EstDischargeDate ) 
		{
			valueObject.setEstDischargeDate(new ims.framework.utils.DateTime(EstDischargeDate) );
		}
		// isChaplainRequired
		valueObject.setIsChaplainRequired( domainObject.isIsChaplainRequired() );
		// ReferringConsultant
		valueObject.setReferringConsultant(ims.core.vo.domain.MedicVoAssembler.create(map, domainObject.getReferringConsultant()) );
		// PatientStatus
		ims.domain.lookups.LookupInstance instance14 = domainObject.getPatientStatus();
		if ( null != instance14 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance14.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance14.getImage().getImageId(), instance14.getImage().getImagePath());
			}
			color = instance14.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PatientStatus voLookup14 = new ims.core.vo.lookups.PatientStatus(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.core.vo.lookups.PatientStatus parentVoLookup14 = voLookup14;
			ims.domain.lookups.LookupInstance parent14 = instance14.getParent();
			while (parent14 != null)
			{
				if (parent14.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent14.getImage().getImageId(), parent14.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent14.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup14.setParent(new ims.core.vo.lookups.PatientStatus(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setPatientStatus(voLookup14);
		}
				// UpdateCFL
		valueObject.setUpdateCFL( domainObject.isUpdateCFL() );
		// AnticipatedStay
		valueObject.setAnticipatedStay(domainObject.getAnticipatedStay());
		// CaseFolderComments
		valueObject.setCaseFolderComments(domainObject.getCaseFolderComments());
		// AdmissionEpisode
		valueObject.setAdmissionEpisode(ims.core.vo.domain.EpisodeOfCareWithPrimaryDiagnosisVoAssembler.create(map, domainObject.getAdmissionEpisode()) );
		// ExtendedDetails
		valueObject.setExtendedDetails(ims.core.vo.domain.ExtendedAdmissionDetailVoAssembler.create(map, domainObject.getExtendedDetails()) );
		// TransferHistory
		valueObject.setTransferHistory(ims.core.vo.domain.TransferHistoryVoAssembler.createTransferHistoryVoCollectionFromTransferHistory(map, domainObject.getTransferHistory()) );
		// Service
		valueObject.setService(ims.core.vo.domain.ServiceLiteVoAssembler.create(map, domainObject.getService()) );
		// ExtendedLengthOfStayReason
		ims.domain.lookups.LookupInstance instance22 = domainObject.getExtendedLengthOfStayReason();
		if ( null != instance22 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance22.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance22.getImage().getImageId(), instance22.getImage().getImagePath());
			}
			color = instance22.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.ExtendedLengthOfStayReason voLookup22 = new ims.core.vo.lookups.ExtendedLengthOfStayReason(instance22.getId(),instance22.getText(), instance22.isActive(), null, img, color);
			ims.core.vo.lookups.ExtendedLengthOfStayReason parentVoLookup22 = voLookup22;
			ims.domain.lookups.LookupInstance parent22 = instance22.getParent();
			while (parent22 != null)
			{
				if (parent22.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent22.getImage().getImageId(), parent22.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent22.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup22.setParent(new ims.core.vo.lookups.ExtendedLengthOfStayReason(parent22.getId(),parent22.getText(), parent22.isActive(), null, img, color));
				parentVoLookup22 = parentVoLookup22.getParent();
								parent22 = parent22.getParent();
			}			
			valueObject.setExtendedLengthOfStayReason(voLookup22);
		}
				// MedicallyFitForDischarge
		ims.domain.lookups.LookupInstance instance23 = domainObject.getMedicallyFitForDischarge();
		if ( null != instance23 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance23.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance23.getImage().getImageId(), instance23.getImage().getImagePath());
			}
			color = instance23.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup23 = new ims.core.vo.lookups.YesNo(instance23.getId(),instance23.getText(), instance23.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup23 = voLookup23;
			ims.domain.lookups.LookupInstance parent23 = instance23.getParent();
			while (parent23 != null)
			{
				if (parent23.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent23.getImage().getImageId(), parent23.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent23.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup23.setParent(new ims.core.vo.lookups.YesNo(parent23.getId(),parent23.getText(), parent23.isActive(), null, img, color));
				parentVoLookup23 = parentVoLookup23.getParent();
								parent23 = parent23.getParent();
			}			
			valueObject.setMedicallyFitForDischarge(voLookup23);
		}
				// ReasonDelayedDischarge
		valueObject.setReasonDelayedDischarge(ims.core.vo.domain.ReasonForDelayedDischargeVoAssembler.createReasonForDelayedDischargeVoCollectionFromReasonForDelayedDischarge(map, domainObject.getReasonDelayedDischarge()) );
		// PatientRequiresTransport
		valueObject.setPatientRequiresTransport( domainObject.isPatientRequiresTransport() );
		// TransportDetails
		valueObject.setTransportDetails(ims.core.vo.domain.PatientTransportRequirementsVoAssembler.create(map, domainObject.getTransportDetails()) );
		// AbleToGoDischargeLounge
		valueObject.setAbleToGoDischargeLounge( domainObject.isAbleToGoDischargeLounge() );
		// ReasonCannotGoDischargeLounge
		ims.domain.lookups.LookupInstance instance28 = domainObject.getReasonCannotGoDischargeLounge();
		if ( null != instance28 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance28.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance28.getImage().getImageId(), instance28.getImage().getImagePath());
			}
			color = instance28.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.ReasonCannotGoDischargeLounge voLookup28 = new ims.core.vo.lookups.ReasonCannotGoDischargeLounge(instance28.getId(),instance28.getText(), instance28.isActive(), null, img, color);
			ims.core.vo.lookups.ReasonCannotGoDischargeLounge parentVoLookup28 = voLookup28;
			ims.domain.lookups.LookupInstance parent28 = instance28.getParent();
			while (parent28 != null)
			{
				if (parent28.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent28.getImage().getImageId(), parent28.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent28.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup28.setParent(new ims.core.vo.lookups.ReasonCannotGoDischargeLounge(parent28.getId(),parent28.getText(), parent28.isActive(), null, img, color));
				parentVoLookup28 = parentVoLookup28.getParent();
								parent28 = parent28.getParent();
			}			
			valueObject.setReasonCannotGoDischargeLounge(voLookup28);
		}
				// SelfAdmitPatient
		valueObject.setSelfAdmitPatient( domainObject.isSelfAdmitPatient() );
		// SourceOfEmergencyReferral
		ims.domain.lookups.LookupInstance instance30 = domainObject.getSourceOfEmergencyReferral();
		if ( null != instance30 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance30.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance30.getImage().getImageId(), instance30.getImage().getImagePath());
			}
			color = instance30.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.SourceOfEmergencyReferral voLookup30 = new ims.core.vo.lookups.SourceOfEmergencyReferral(instance30.getId(),instance30.getText(), instance30.isActive(), null, img, color);
			ims.core.vo.lookups.SourceOfEmergencyReferral parentVoLookup30 = voLookup30;
			ims.domain.lookups.LookupInstance parent30 = instance30.getParent();
			while (parent30 != null)
			{
				if (parent30.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent30.getImage().getImageId(), parent30.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent30.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup30.setParent(new ims.core.vo.lookups.SourceOfEmergencyReferral(parent30.getId(),parent30.getText(), parent30.isActive(), null, img, color));
				parentVoLookup30 = parentVoLookup30.getParent();
								parent30 = parent30.getParent();
			}			
			valueObject.setSourceOfEmergencyReferral(voLookup30);
		}
				// HealthyLodgerDetails
		valueObject.setHealthyLodgerDetails(ims.core.vo.domain.HealthyLodgerVoAssembler.create(map, domainObject.getHealthyLodger()) );
		// AdmissionWard
		valueObject.setAdmissionWard(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getAdmissionWard()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.pas.domain.objects.AdmissionDetail extractAdmissionDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.AdmissionDetailVo valueObject) 
	{
		return 	extractAdmissionDetail(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.AdmissionDetail extractAdmissionDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.AdmissionDetailVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_AdmissionDetail();
		ims.core.admin.pas.domain.objects.AdmissionDetail domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.pas.domain.objects.AdmissionDetail)domMap.get(valueObject);
			}
			// ims.core.vo.AdmissionDetailVo ID_AdmissionDetail field is unknown
			domainObject = new ims.core.admin.pas.domain.objects.AdmissionDetail();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_AdmissionDetail());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.pas.domain.objects.AdmissionDetail)domMap.get(key);
			}
			domainObject = (ims.core.admin.pas.domain.objects.AdmissionDetail) domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.AdmissionDetail.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_AdmissionDetail());

		domainObject.setPasEvent(ims.core.vo.domain.PasEventAdmitVoAssembler.extractPASEvent(domainFactory, valueObject.getPasEvent(), domMap));
		ims.framework.utils.DateTime dateTime2 = valueObject.getAdmissionDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setAdmissionDateTime(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value3 = null;
		if ( null != valueObject.getWard() ) 
		{
			if (valueObject.getWard().getBoId() == null)
			{
				if (domMap.get(valueObject.getWard()) != null)
				{
					value3 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getWard());
				}
			}
			else
			{
				value3 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getWard().getBoId());
			}
		}
		domainObject.setWard(value3);
		ims.core.layout.domain.objects.BedSpace value4 = null;
		if ( null != valueObject.getBed() ) 
		{
			if (valueObject.getBed().getBoId() == null)
			{
				if (domMap.get(valueObject.getBed()) != null)
				{
					value4 = (ims.core.layout.domain.objects.BedSpace)domMap.get(valueObject.getBed());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getBed();	
			}
			else
			{
				value4 = (ims.core.layout.domain.objects.BedSpace)domainFactory.getDomainObject(ims.core.layout.domain.objects.BedSpace.class, valueObject.getBed().getBoId());
			}
		}
		domainObject.setBed(value4);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Medic value5 = null;
		if ( null != valueObject.getConsultant() ) 
		{
			if (valueObject.getConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getConsultant()) != null)
				{
					value5 = (ims.core.resource.people.domain.objects.Medic)domMap.get(valueObject.getConsultant());
				}
			}
			else
			{
				value5 = (ims.core.resource.people.domain.objects.Medic)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Medic.class, valueObject.getConsultant().getBoId());
			}
		}
		domainObject.setConsultant(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getWardType() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getWardType().getID());
		}
		domainObject.setWardType(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getMethodOfAdmission() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getMethodOfAdmission().getID());
		}
		domainObject.setMethodOfAdmission(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getSourceOfAdmission() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getSourceOfAdmission().getID());
		}
		domainObject.setSourceOfAdmission(value9);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReasonForAdmission() != null && valueObject.getReasonForAdmission().equals(""))
		{
			valueObject.setReasonForAdmission(null);
		}
		domainObject.setReasonForAdmission(valueObject.getReasonForAdmission());
		ims.framework.utils.DateTime dateTime11 = valueObject.getEstDischargeDate();
		java.util.Date value11 = null;
		if ( dateTime11 != null ) 
		{
			value11 = dateTime11.getJavaDate();
		}
		domainObject.setEstDischargeDate(value11);
		domainObject.setIsChaplainRequired(valueObject.getIsChaplainRequired());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Medic value13 = null;
		if ( null != valueObject.getReferringConsultant() ) 
		{
			if (valueObject.getReferringConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferringConsultant()) != null)
				{
					value13 = (ims.core.resource.people.domain.objects.Medic)domMap.get(valueObject.getReferringConsultant());
				}
			}
			else
			{
				value13 = (ims.core.resource.people.domain.objects.Medic)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Medic.class, valueObject.getReferringConsultant().getBoId());
			}
		}
		domainObject.setReferringConsultant(value13);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getPatientStatus() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getPatientStatus().getID());
		}
		domainObject.setPatientStatus(value14);
		domainObject.setUpdateCFL(valueObject.getUpdateCFL());
		domainObject.setAnticipatedStay(valueObject.getAnticipatedStay());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCaseFolderComments() != null && valueObject.getCaseFolderComments().equals(""))
		{
			valueObject.setCaseFolderComments(null);
		}
		domainObject.setCaseFolderComments(valueObject.getCaseFolderComments());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.EpisodeOfCare value18 = null;
		if ( null != valueObject.getAdmissionEpisode() ) 
		{
			if (valueObject.getAdmissionEpisode().getBoId() == null)
			{
				if (domMap.get(valueObject.getAdmissionEpisode()) != null)
				{
					value18 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getAdmissionEpisode());
				}
			}
			else
			{
				value18 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getAdmissionEpisode().getBoId());
			}
		}
		domainObject.setAdmissionEpisode(value18);
		domainObject.setExtendedDetails(ims.core.vo.domain.ExtendedAdmissionDetailVoAssembler.extractExtendedAdmissionDetail(domainFactory, valueObject.getExtendedDetails(), domMap));

		// SaveAsRefVO treated as RefValueObject
		ims.core.admin.pas.vo.TransferHistoryRefVoCollection refCollection20 = new ims.core.admin.pas.vo.TransferHistoryRefVoCollection();
		if (valueObject.getTransferHistory() != null)
		{
			for (int i20=0; i20<valueObject.getTransferHistory().size(); i20++)
			{
				ims.core.admin.pas.vo.TransferHistoryRefVo ref20 = (ims.core.admin.pas.vo.TransferHistoryRefVo)valueObject.getTransferHistory().get(i20);
				refCollection20.add(ref20);
			}
		}
		int size20 = (null == refCollection20) ? 0 : refCollection20.size();		
		java.util.List domainTransferHistory20 = domainObject.getTransferHistory();
		if (domainTransferHistory20 == null)
		{
			domainTransferHistory20 = new java.util.ArrayList();
		}
		for(int i=0; i < size20; i++) 
		{
			ims.core.admin.pas.vo.TransferHistoryRefVo vo = refCollection20.get(i);			
			ims.core.admin.pas.domain.objects.TransferHistory dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.admin.pas.domain.objects.TransferHistory)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.admin.pas.domain.objects.TransferHistory)domainFactory.getDomainObject( ims.core.admin.pas.domain.objects.TransferHistory.class, vo.getBoId());
				}
			}

			int domIdx = domainTransferHistory20.indexOf(dom);
			if (domIdx == -1)
			{
				domainTransferHistory20.add(i, dom);
			}
			else if (i != domIdx && i < domainTransferHistory20.size())
			{
				Object tmp = domainTransferHistory20.get(i);
				domainTransferHistory20.set(i, domainTransferHistory20.get(domIdx));
				domainTransferHistory20.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i20 = domainTransferHistory20.size();
		while (i20 > size20)
		{
			domainTransferHistory20.remove(i20-1);
			i20 = domainTransferHistory20.size();
		}
		
		domainObject.setTransferHistory(domainTransferHistory20);		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Service value21 = null;
		if ( null != valueObject.getService() ) 
		{
			if (valueObject.getService().getBoId() == null)
			{
				if (domMap.get(valueObject.getService()) != null)
				{
					value21 = (ims.core.clinical.domain.objects.Service)domMap.get(valueObject.getService());
				}
			}
			else
			{
				value21 = (ims.core.clinical.domain.objects.Service)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Service.class, valueObject.getService().getBoId());
			}
		}
		domainObject.setService(value21);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value22 = null;
		if ( null != valueObject.getExtendedLengthOfStayReason() ) 
		{
			value22 =
				domainFactory.getLookupInstance(valueObject.getExtendedLengthOfStayReason().getID());
		}
		domainObject.setExtendedLengthOfStayReason(value22);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value23 = null;
		if ( null != valueObject.getMedicallyFitForDischarge() ) 
		{
			value23 =
				domainFactory.getLookupInstance(valueObject.getMedicallyFitForDischarge().getID());
		}
		domainObject.setMedicallyFitForDischarge(value23);

		// SaveAsRefVO treated as RefValueObject
		ims.core.admin.pas.vo.ReasonForDelayedDischargeRefVoCollection refCollection24 = new ims.core.admin.pas.vo.ReasonForDelayedDischargeRefVoCollection();
		if (valueObject.getReasonDelayedDischarge() != null)
		{
			for (int i24=0; i24<valueObject.getReasonDelayedDischarge().size(); i24++)
			{
				ims.core.admin.pas.vo.ReasonForDelayedDischargeRefVo ref24 = (ims.core.admin.pas.vo.ReasonForDelayedDischargeRefVo)valueObject.getReasonDelayedDischarge().get(i24);
				refCollection24.add(ref24);
			}
		}
		int size24 = (null == refCollection24) ? 0 : refCollection24.size();		
		java.util.List domainReasonDelayedDischarge24 = domainObject.getReasonDelayedDischarge();
		if (domainReasonDelayedDischarge24 == null)
		{
			domainReasonDelayedDischarge24 = new java.util.ArrayList();
		}
		for(int i=0; i < size24; i++) 
		{
			ims.core.admin.pas.vo.ReasonForDelayedDischargeRefVo vo = refCollection24.get(i);			
			ims.core.admin.pas.domain.objects.ReasonForDelayedDischarge dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.admin.pas.domain.objects.ReasonForDelayedDischarge)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.admin.pas.domain.objects.ReasonForDelayedDischarge)domainFactory.getDomainObject( ims.core.admin.pas.domain.objects.ReasonForDelayedDischarge.class, vo.getBoId());
				}
			}

			int domIdx = domainReasonDelayedDischarge24.indexOf(dom);
			if (domIdx == -1)
			{
				domainReasonDelayedDischarge24.add(i, dom);
			}
			else if (i != domIdx && i < domainReasonDelayedDischarge24.size())
			{
				Object tmp = domainReasonDelayedDischarge24.get(i);
				domainReasonDelayedDischarge24.set(i, domainReasonDelayedDischarge24.get(domIdx));
				domainReasonDelayedDischarge24.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i24 = domainReasonDelayedDischarge24.size();
		while (i24 > size24)
		{
			domainReasonDelayedDischarge24.remove(i24-1);
			i24 = domainReasonDelayedDischarge24.size();
		}
		
		domainObject.setReasonDelayedDischarge(domainReasonDelayedDischarge24);		
		domainObject.setPatientRequiresTransport(valueObject.getPatientRequiresTransport());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.domain.objects.PatientTransportRequirements value26 = null;
		if ( null != valueObject.getTransportDetails() ) 
		{
			if (valueObject.getTransportDetails().getBoId() == null)
			{
				if (domMap.get(valueObject.getTransportDetails()) != null)
				{
					value26 = (ims.core.domain.objects.PatientTransportRequirements)domMap.get(valueObject.getTransportDetails());
				}
			}
			else
			{
				value26 = (ims.core.domain.objects.PatientTransportRequirements)domainFactory.getDomainObject(ims.core.domain.objects.PatientTransportRequirements.class, valueObject.getTransportDetails().getBoId());
			}
		}
		domainObject.setTransportDetails(value26);
		domainObject.setAbleToGoDischargeLounge(valueObject.getAbleToGoDischargeLounge());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value28 = null;
		if ( null != valueObject.getReasonCannotGoDischargeLounge() ) 
		{
			value28 =
				domainFactory.getLookupInstance(valueObject.getReasonCannotGoDischargeLounge().getID());
		}
		domainObject.setReasonCannotGoDischargeLounge(value28);
		domainObject.setSelfAdmitPatient(valueObject.getSelfAdmitPatient());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value30 = null;
		if ( null != valueObject.getSourceOfEmergencyReferral() ) 
		{
			value30 =
				domainFactory.getLookupInstance(valueObject.getSourceOfEmergencyReferral().getID());
		}
		domainObject.setSourceOfEmergencyReferral(value30);
		domainObject.setHealthyLodger(ims.core.vo.domain.HealthyLodgerVoAssembler.extractHealthyLodger(domainFactory, valueObject.getHealthyLodgerDetails(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value32 = null;
		if ( null != valueObject.getAdmissionWard() ) 
		{
			if (valueObject.getAdmissionWard().getBoId() == null)
			{
				if (domMap.get(valueObject.getAdmissionWard()) != null)
				{
					value32 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getAdmissionWard());
				}
			}
			else
			{
				value32 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getAdmissionWard().getBoId());
			}
		}
		domainObject.setAdmissionWard(value32);

		return domainObject;
	}

}
