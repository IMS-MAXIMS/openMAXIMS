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
 * @author George Cristian Josan
 */
public class AdmissionDetailShortVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.AdmissionDetailShortVo copy(ims.core.vo.AdmissionDetailShortVo valueObjectDest, ims.core.vo.AdmissionDetailShortVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_AdmissionDetail(valueObjectSrc.getID_AdmissionDetail());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// PasEvent
		valueObjectDest.setPasEvent(valueObjectSrc.getPasEvent());
		// AdmissionDateTime
		valueObjectDest.setAdmissionDateTime(valueObjectSrc.getAdmissionDateTime());
		// AnticipatedStay
		valueObjectDest.setAnticipatedStay(valueObjectSrc.getAnticipatedStay());
		// EstDischargeDate
		valueObjectDest.setEstDischargeDate(valueObjectSrc.getEstDischargeDate());
		// Ward
		valueObjectDest.setWard(valueObjectSrc.getWard());
		// Bed
		valueObjectDest.setBed(valueObjectSrc.getBed());
		// Service
		valueObjectDest.setService(valueObjectSrc.getService());
		// Specialty
		valueObjectDest.setSpecialty(valueObjectSrc.getSpecialty());
		// Consultant
		valueObjectDest.setConsultant(valueObjectSrc.getConsultant());
		// WardType
		valueObjectDest.setWardType(valueObjectSrc.getWardType());
		// SourceOfAdmission
		valueObjectDest.setSourceOfAdmission(valueObjectSrc.getSourceOfAdmission());
		// MethodOfAdmission
		valueObjectDest.setMethodOfAdmission(valueObjectSrc.getMethodOfAdmission());
		// PatientCategory
		valueObjectDest.setPatientCategory(valueObjectSrc.getPatientCategory());
		// SourceOfEmergencyReferral
		valueObjectDest.setSourceOfEmergencyReferral(valueObjectSrc.getSourceOfEmergencyReferral());
		// isChaplainRequired
		valueObjectDest.setIsChaplainRequired(valueObjectSrc.getIsChaplainRequired());
		// ReasonForAdmission
		valueObjectDest.setReasonForAdmission(valueObjectSrc.getReasonForAdmission());
		// ReferringConsultant
		valueObjectDest.setReferringConsultant(valueObjectSrc.getReferringConsultant());
		// SelfAdmitPatient
		valueObjectDest.setSelfAdmitPatient(valueObjectSrc.getSelfAdmitPatient());
		// UpdateCFL
		valueObjectDest.setUpdateCFL(valueObjectSrc.getUpdateCFL());
		// CaseFolderComments
		valueObjectDest.setCaseFolderComments(valueObjectSrc.getCaseFolderComments());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createAdmissionDetailShortVoCollectionFromAdmissionDetail(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.AdmissionDetail objects.
	 */
	public static ims.core.vo.AdmissionDetailShortVoCollection createAdmissionDetailShortVoCollectionFromAdmissionDetail(java.util.Set domainObjectSet)	
	{
		return createAdmissionDetailShortVoCollectionFromAdmissionDetail(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.AdmissionDetail objects.
	 */
	public static ims.core.vo.AdmissionDetailShortVoCollection createAdmissionDetailShortVoCollectionFromAdmissionDetail(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.AdmissionDetailShortVoCollection voList = new ims.core.vo.AdmissionDetailShortVoCollection();
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
			ims.core.vo.AdmissionDetailShortVo vo = create(map, domainObject);
			
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
	public static ims.core.vo.AdmissionDetailShortVoCollection createAdmissionDetailShortVoCollectionFromAdmissionDetail(java.util.List domainObjectList) 
	{
		return createAdmissionDetailShortVoCollectionFromAdmissionDetail(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.AdmissionDetail objects.
	 */
	public static ims.core.vo.AdmissionDetailShortVoCollection createAdmissionDetailShortVoCollectionFromAdmissionDetail(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.AdmissionDetailShortVoCollection voList = new ims.core.vo.AdmissionDetailShortVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.AdmissionDetail domainObject = (ims.core.admin.pas.domain.objects.AdmissionDetail) domainObjectList.get(i);
			ims.core.vo.AdmissionDetailShortVo vo = create(map, domainObject);

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
	 public static java.util.Set extractAdmissionDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.AdmissionDetailShortVoCollection voCollection) 
	 {
	 	return extractAdmissionDetailSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractAdmissionDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.AdmissionDetailShortVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.AdmissionDetailShortVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.AdmissionDetail domainObject = AdmissionDetailShortVoAssembler.extractAdmissionDetail(domainFactory, vo, domMap);

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
	 public static java.util.List extractAdmissionDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.AdmissionDetailShortVoCollection voCollection) 
	 {
	 	return extractAdmissionDetailList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractAdmissionDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.AdmissionDetailShortVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.AdmissionDetailShortVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.AdmissionDetail domainObject = AdmissionDetailShortVoAssembler.extractAdmissionDetail(domainFactory, vo, domMap);

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
	 public static ims.core.vo.AdmissionDetailShortVo create(ims.core.admin.pas.domain.objects.AdmissionDetail domainObject) 
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
	  public static ims.core.vo.AdmissionDetailShortVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.AdmissionDetail domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.AdmissionDetailShortVo valueObject = (ims.core.vo.AdmissionDetailShortVo) map.getValueObject(domainObject, ims.core.vo.AdmissionDetailShortVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.AdmissionDetailShortVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.core.vo.AdmissionDetailShortVo insert(ims.core.vo.AdmissionDetailShortVo valueObject, ims.core.admin.pas.domain.objects.AdmissionDetail domainObject) 
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
	 public static ims.core.vo.AdmissionDetailShortVo insert(DomainObjectMap map, ims.core.vo.AdmissionDetailShortVo valueObject, ims.core.admin.pas.domain.objects.AdmissionDetail domainObject) 
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
			
		// PasEvent
		valueObject.setPasEvent(ims.core.vo.domain.PasEventShortAdmitVoAssembler.create(map, domainObject.getPasEvent()) );
		// AdmissionDateTime
		java.util.Date AdmissionDateTime = domainObject.getAdmissionDateTime();
		if ( null != AdmissionDateTime ) 
		{
			valueObject.setAdmissionDateTime(new ims.framework.utils.DateTime(AdmissionDateTime) );
		}
		// AnticipatedStay
		valueObject.setAnticipatedStay(domainObject.getAnticipatedStay());
		// EstDischargeDate
		java.util.Date EstDischargeDate = domainObject.getEstDischargeDate();
		if ( null != EstDischargeDate ) 
		{
			valueObject.setEstDischargeDate(new ims.framework.utils.DateTime(EstDischargeDate) );
		}
		// Ward
		valueObject.setWard(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getWard()) );
		// Bed
		valueObject.setBed(ims.core.vo.domain.BedSpaceLiteVoAssembler.create(map, domainObject.getBed()) );
		// Service
		valueObject.setService(ims.core.vo.domain.ServiceLiteVoAssembler.create(map, domainObject.getService()) );
		// Specialty
		ims.domain.lookups.LookupInstance instance8 = domainObject.getSpecialty();
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

			ims.core.vo.lookups.Specialty voLookup8 = new ims.core.vo.lookups.Specialty(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.Specialty(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setSpecialty(voLookup8);
		}
				// Consultant
		valueObject.setConsultant(ims.core.vo.domain.MedicLiteVoAssembler.create(map, domainObject.getConsultant()) );
		// WardType
		ims.domain.lookups.LookupInstance instance10 = domainObject.getWardType();
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

			ims.core.vo.lookups.WardType voLookup10 = new ims.core.vo.lookups.WardType(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.WardType parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.core.vo.lookups.WardType(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setWardType(voLookup10);
		}
				// SourceOfAdmission
		ims.domain.lookups.LookupInstance instance11 = domainObject.getSourceOfAdmission();
		if ( null != instance11 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance11.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance11.getImage().getImageId(), instance11.getImage().getImagePath());
			}
			color = instance11.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.SourceOfAdmission voLookup11 = new ims.core.vo.lookups.SourceOfAdmission(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.core.vo.lookups.SourceOfAdmission parentVoLookup11 = voLookup11;
			ims.domain.lookups.LookupInstance parent11 = instance11.getParent();
			while (parent11 != null)
			{
				if (parent11.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent11.getImage().getImageId(), parent11.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent11.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup11.setParent(new ims.core.vo.lookups.SourceOfAdmission(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setSourceOfAdmission(voLookup11);
		}
				// MethodOfAdmission
		ims.domain.lookups.LookupInstance instance12 = domainObject.getMethodOfAdmission();
		if ( null != instance12 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance12.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance12.getImage().getImageId(), instance12.getImage().getImagePath());
			}
			color = instance12.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.MethodOfAdmission voLookup12 = new ims.core.vo.lookups.MethodOfAdmission(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.core.vo.lookups.MethodOfAdmission parentVoLookup12 = voLookup12;
			ims.domain.lookups.LookupInstance parent12 = instance12.getParent();
			while (parent12 != null)
			{
				if (parent12.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent12.getImage().getImageId(), parent12.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent12.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup12.setParent(new ims.core.vo.lookups.MethodOfAdmission(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setMethodOfAdmission(voLookup12);
		}
				// PatientCategory
		ims.domain.lookups.LookupInstance instance13 = domainObject.getPatientStatus();
		if ( null != instance13 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance13.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance13.getImage().getImageId(), instance13.getImage().getImagePath());
			}
			color = instance13.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PatientStatus voLookup13 = new ims.core.vo.lookups.PatientStatus(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.core.vo.lookups.PatientStatus parentVoLookup13 = voLookup13;
			ims.domain.lookups.LookupInstance parent13 = instance13.getParent();
			while (parent13 != null)
			{
				if (parent13.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent13.getImage().getImageId(), parent13.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent13.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup13.setParent(new ims.core.vo.lookups.PatientStatus(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setPatientCategory(voLookup13);
		}
				// SourceOfEmergencyReferral
		ims.domain.lookups.LookupInstance instance14 = domainObject.getSourceOfEmergencyReferral();
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

			ims.core.vo.lookups.SourceOfEmergencyReferral voLookup14 = new ims.core.vo.lookups.SourceOfEmergencyReferral(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.core.vo.lookups.SourceOfEmergencyReferral parentVoLookup14 = voLookup14;
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
								parentVoLookup14.setParent(new ims.core.vo.lookups.SourceOfEmergencyReferral(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setSourceOfEmergencyReferral(voLookup14);
		}
				// isChaplainRequired
		valueObject.setIsChaplainRequired( domainObject.isIsChaplainRequired() );
		// ReasonForAdmission
		valueObject.setReasonForAdmission(domainObject.getReasonForAdmission());
		// ReferringConsultant
		valueObject.setReferringConsultant(ims.core.vo.domain.MedicLiteVoAssembler.create(map, domainObject.getReferringConsultant()) );
		// SelfAdmitPatient
		valueObject.setSelfAdmitPatient( domainObject.isSelfAdmitPatient() );
		// UpdateCFL
		valueObject.setUpdateCFL( domainObject.isUpdateCFL() );
		// CaseFolderComments
		valueObject.setCaseFolderComments(domainObject.getCaseFolderComments());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.pas.domain.objects.AdmissionDetail extractAdmissionDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.AdmissionDetailShortVo valueObject) 
	{
		return 	extractAdmissionDetail(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.AdmissionDetail extractAdmissionDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.AdmissionDetailShortVo valueObject, HashMap domMap) 
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
			// ims.core.vo.AdmissionDetailShortVo ID_AdmissionDetail field is unknown
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

		domainObject.setPasEvent(ims.core.vo.domain.PasEventShortAdmitVoAssembler.extractPASEvent(domainFactory, valueObject.getPasEvent(), domMap));
		ims.framework.utils.DateTime dateTime2 = valueObject.getAdmissionDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setAdmissionDateTime(value2);
		domainObject.setAnticipatedStay(valueObject.getAnticipatedStay());
		ims.framework.utils.DateTime dateTime4 = valueObject.getEstDischargeDate();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setEstDischargeDate(value4);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value5 = null;
		if ( null != valueObject.getWard() ) 
		{
			if (valueObject.getWard().getBoId() == null)
			{
				if (domMap.get(valueObject.getWard()) != null)
				{
					value5 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getWard());
				}
			}
			else
			{
				value5 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getWard().getBoId());
			}
		}
		domainObject.setWard(value5);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.layout.domain.objects.BedSpace value6 = null;
		if ( null != valueObject.getBed() ) 
		{
			if (valueObject.getBed().getBoId() == null)
			{
				if (domMap.get(valueObject.getBed()) != null)
				{
					value6 = (ims.core.layout.domain.objects.BedSpace)domMap.get(valueObject.getBed());
				}
			}
			else
			{
				value6 = (ims.core.layout.domain.objects.BedSpace)domainFactory.getDomainObject(ims.core.layout.domain.objects.BedSpace.class, valueObject.getBed().getBoId());
			}
		}
		domainObject.setBed(value6);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Service value7 = null;
		if ( null != valueObject.getService() ) 
		{
			if (valueObject.getService().getBoId() == null)
			{
				if (domMap.get(valueObject.getService()) != null)
				{
					value7 = (ims.core.clinical.domain.objects.Service)domMap.get(valueObject.getService());
				}
			}
			else
			{
				value7 = (ims.core.clinical.domain.objects.Service)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Service.class, valueObject.getService().getBoId());
			}
		}
		domainObject.setService(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value8);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Medic value9 = null;
		if ( null != valueObject.getConsultant() ) 
		{
			if (valueObject.getConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getConsultant()) != null)
				{
					value9 = (ims.core.resource.people.domain.objects.Medic)domMap.get(valueObject.getConsultant());
				}
			}
			else
			{
				value9 = (ims.core.resource.people.domain.objects.Medic)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Medic.class, valueObject.getConsultant().getBoId());
			}
		}
		domainObject.setConsultant(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getWardType() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getWardType().getID());
		}
		domainObject.setWardType(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getSourceOfAdmission() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getSourceOfAdmission().getID());
		}
		domainObject.setSourceOfAdmission(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getMethodOfAdmission() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getMethodOfAdmission().getID());
		}
		domainObject.setMethodOfAdmission(value12);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getPatientCategory() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getPatientCategory().getID());
		}
		domainObject.setPatientStatus(value13);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getSourceOfEmergencyReferral() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getSourceOfEmergencyReferral().getID());
		}
		domainObject.setSourceOfEmergencyReferral(value14);
		domainObject.setIsChaplainRequired(valueObject.getIsChaplainRequired());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReasonForAdmission() != null && valueObject.getReasonForAdmission().equals(""))
		{
			valueObject.setReasonForAdmission(null);
		}
		domainObject.setReasonForAdmission(valueObject.getReasonForAdmission());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Medic value17 = null;
		if ( null != valueObject.getReferringConsultant() ) 
		{
			if (valueObject.getReferringConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferringConsultant()) != null)
				{
					value17 = (ims.core.resource.people.domain.objects.Medic)domMap.get(valueObject.getReferringConsultant());
				}
			}
			else
			{
				value17 = (ims.core.resource.people.domain.objects.Medic)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Medic.class, valueObject.getReferringConsultant().getBoId());
			}
		}
		domainObject.setReferringConsultant(value17);
		domainObject.setSelfAdmitPatient(valueObject.getSelfAdmitPatient());
		domainObject.setUpdateCFL(valueObject.getUpdateCFL());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCaseFolderComments() != null && valueObject.getCaseFolderComments().equals(""))
		{
			valueObject.setCaseFolderComments(null);
		}
		domainObject.setCaseFolderComments(valueObject.getCaseFolderComments());

		return domainObject;
	}

}
