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
package ims.ntpf.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class LoCallWaitingListDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ntpf.vo.LoCallWaitingListDetailsVo copy(ims.ntpf.vo.LoCallWaitingListDetailsVo valueObjectDest, ims.ntpf.vo.LoCallWaitingListDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_LoCallWaitingListDetails(valueObjectSrc.getID_LoCallWaitingListDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Speciality
		valueObjectDest.setSpeciality(valueObjectSrc.getSpeciality());
		// ReferringHospital
		valueObjectDest.setReferringHospital(valueObjectSrc.getReferringHospital());
		// ReferringConsultant
		valueObjectDest.setReferringConsultant(valueObjectSrc.getReferringConsultant());
		// ReferringConsultantText
		valueObjectDest.setReferringConsultantText(valueObjectSrc.getReferringConsultantText());
		// Category
		valueObjectDest.setCategory(valueObjectSrc.getCategory());
		// WaitingListType
		valueObjectDest.setWaitingListType(valueObjectSrc.getWaitingListType());
		// WaitingListDate
		valueObjectDest.setWaitingListDate(valueObjectSrc.getWaitingListDate());
		// WaitingListMonthInterval
		valueObjectDest.setWaitingListMonthInterval(valueObjectSrc.getWaitingListMonthInterval());
		// WaitingListLengthQualifier
		valueObjectDest.setWaitingListLengthQualifier(valueObjectSrc.getWaitingListLengthQualifier());
		// FaxTo
		valueObjectDest.setFaxTo(valueObjectSrc.getFaxTo());
		// FaxDate
		valueObjectDest.setFaxDate(valueObjectSrc.getFaxDate());
		// LiaisonQuery
		valueObjectDest.setLiaisonQuery(valueObjectSrc.getLiaisonQuery());
		// isLinkedtoCase
		valueObjectDest.setIsLinkedtoCase(valueObjectSrc.getIsLinkedtoCase());
		// hospital
		valueObjectDest.setHospital(valueObjectSrc.getHospital());
		// mrn
		valueObjectDest.setMrn(valueObjectSrc.getMrn());
		// episodeNumber
		valueObjectDest.setEpisodeNumber(valueObjectSrc.getEpisodeNumber());
		// AssocLocall
		valueObjectDest.setAssocLocall(valueObjectSrc.getAssocLocall());
		// AssocCase
		valueObjectDest.setAssocCase(valueObjectSrc.getAssocCase());
		// StatusHistory
		valueObjectDest.setStatusHistory(valueObjectSrc.getStatusHistory());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// CurrentStatusReason
		valueObjectDest.setCurrentStatusReason(valueObjectSrc.getCurrentStatusReason());
		// Procedure
		valueObjectDest.setProcedure(valueObjectSrc.getProcedure());
		// ProcedureText
		valueObjectDest.setProcedureText(valueObjectSrc.getProcedureText());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createLoCallWaitingListDetailsVoCollectionFromLoCallWaitingListDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ntpf.locall.domain.objects.LoCallWaitingListDetails objects.
	 */
	public static ims.ntpf.vo.LoCallWaitingListDetailsVoCollection createLoCallWaitingListDetailsVoCollectionFromLoCallWaitingListDetails(java.util.Set domainObjectSet)	
	{
		return createLoCallWaitingListDetailsVoCollectionFromLoCallWaitingListDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ntpf.locall.domain.objects.LoCallWaitingListDetails objects.
	 */
	public static ims.ntpf.vo.LoCallWaitingListDetailsVoCollection createLoCallWaitingListDetailsVoCollectionFromLoCallWaitingListDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ntpf.vo.LoCallWaitingListDetailsVoCollection voList = new ims.ntpf.vo.LoCallWaitingListDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ntpf.locall.domain.objects.LoCallWaitingListDetails domainObject = (ims.ntpf.locall.domain.objects.LoCallWaitingListDetails) iterator.next();
			ims.ntpf.vo.LoCallWaitingListDetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.ntpf.locall.domain.objects.LoCallWaitingListDetails objects.
	 */
	public static ims.ntpf.vo.LoCallWaitingListDetailsVoCollection createLoCallWaitingListDetailsVoCollectionFromLoCallWaitingListDetails(java.util.List domainObjectList) 
	{
		return createLoCallWaitingListDetailsVoCollectionFromLoCallWaitingListDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ntpf.locall.domain.objects.LoCallWaitingListDetails objects.
	 */
	public static ims.ntpf.vo.LoCallWaitingListDetailsVoCollection createLoCallWaitingListDetailsVoCollectionFromLoCallWaitingListDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ntpf.vo.LoCallWaitingListDetailsVoCollection voList = new ims.ntpf.vo.LoCallWaitingListDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ntpf.locall.domain.objects.LoCallWaitingListDetails domainObject = (ims.ntpf.locall.domain.objects.LoCallWaitingListDetails) domainObjectList.get(i);
			ims.ntpf.vo.LoCallWaitingListDetailsVo vo = create(map, domainObject);

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
	 * Create the ims.ntpf.locall.domain.objects.LoCallWaitingListDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractLoCallWaitingListDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ntpf.vo.LoCallWaitingListDetailsVoCollection voCollection) 
	 {
	 	return extractLoCallWaitingListDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractLoCallWaitingListDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ntpf.vo.LoCallWaitingListDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ntpf.vo.LoCallWaitingListDetailsVo vo = voCollection.get(i);
			ims.ntpf.locall.domain.objects.LoCallWaitingListDetails domainObject = LoCallWaitingListDetailsVoAssembler.extractLoCallWaitingListDetails(domainFactory, vo, domMap);

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
	 * Create the ims.ntpf.locall.domain.objects.LoCallWaitingListDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractLoCallWaitingListDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.ntpf.vo.LoCallWaitingListDetailsVoCollection voCollection) 
	 {
	 	return extractLoCallWaitingListDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractLoCallWaitingListDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.ntpf.vo.LoCallWaitingListDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ntpf.vo.LoCallWaitingListDetailsVo vo = voCollection.get(i);
			ims.ntpf.locall.domain.objects.LoCallWaitingListDetails domainObject = LoCallWaitingListDetailsVoAssembler.extractLoCallWaitingListDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.ntpf.locall.domain.objects.LoCallWaitingListDetails object.
	 * @param domainObject ims.ntpf.locall.domain.objects.LoCallWaitingListDetails
	 */
	 public static ims.ntpf.vo.LoCallWaitingListDetailsVo create(ims.ntpf.locall.domain.objects.LoCallWaitingListDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ntpf.locall.domain.objects.LoCallWaitingListDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ntpf.vo.LoCallWaitingListDetailsVo create(DomainObjectMap map, ims.ntpf.locall.domain.objects.LoCallWaitingListDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ntpf.vo.LoCallWaitingListDetailsVo valueObject = (ims.ntpf.vo.LoCallWaitingListDetailsVo) map.getValueObject(domainObject, ims.ntpf.vo.LoCallWaitingListDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ntpf.vo.LoCallWaitingListDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ntpf.locall.domain.objects.LoCallWaitingListDetails
	 */
	 public static ims.ntpf.vo.LoCallWaitingListDetailsVo insert(ims.ntpf.vo.LoCallWaitingListDetailsVo valueObject, ims.ntpf.locall.domain.objects.LoCallWaitingListDetails domainObject) 
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
	 * @param domainObject ims.ntpf.locall.domain.objects.LoCallWaitingListDetails
	 */
	 public static ims.ntpf.vo.LoCallWaitingListDetailsVo insert(DomainObjectMap map, ims.ntpf.vo.LoCallWaitingListDetailsVo valueObject, ims.ntpf.locall.domain.objects.LoCallWaitingListDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_LoCallWaitingListDetails(domainObject.getId());
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
			
		// Speciality
		valueObject.setSpeciality(ims.core.vo.domain.ServiceVoAssembler.create(map, domainObject.getSpeciality()) );
		// ReferringHospital
		valueObject.setReferringHospital(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getReferringHospital()) );
		// ReferringConsultant
		valueObject.setReferringConsultant(ims.core.vo.domain.MedicVoAssembler.create(map, domainObject.getReferringConsultant()) );
		// ReferringConsultantText
		valueObject.setReferringConsultantText(domainObject.getReferringConsultantText());
		// Category
		ims.domain.lookups.LookupInstance instance5 = domainObject.getCategory();
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

			ims.ntpf.vo.lookups.PatientType voLookup5 = new ims.ntpf.vo.lookups.PatientType(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.ntpf.vo.lookups.PatientType parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.ntpf.vo.lookups.PatientType(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setCategory(voLookup5);
		}
				// WaitingListType
		ims.domain.lookups.LookupInstance instance6 = domainObject.getWaitingListType();
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

			ims.ntpf.vo.lookups.CaseType voLookup6 = new ims.ntpf.vo.lookups.CaseType(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.ntpf.vo.lookups.CaseType parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.ntpf.vo.lookups.CaseType(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setWaitingListType(voLookup6);
		}
				// WaitingListDate
		java.util.Date WaitingListDate = domainObject.getWaitingListDate();
		if ( null != WaitingListDate ) 
		{
			valueObject.setWaitingListDate(new ims.framework.utils.Date(WaitingListDate) );
		}
		// WaitingListMonthInterval
		valueObject.setWaitingListMonthInterval(domainObject.getWaitingListMonthInterval());
		// WaitingListLengthQualifier
		ims.domain.lookups.LookupInstance instance9 = domainObject.getWaitingListLengthQualifier();
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

			ims.ntpf.vo.lookups.WaitingListLengthQualifier voLookup9 = new ims.ntpf.vo.lookups.WaitingListLengthQualifier(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.ntpf.vo.lookups.WaitingListLengthQualifier parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.ntpf.vo.lookups.WaitingListLengthQualifier(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setWaitingListLengthQualifier(voLookup9);
		}
				// FaxTo
		valueObject.setFaxTo(ims.core.vo.domain.MemberOfStaffShortVoAssembler.create(map, domainObject.getFaxTo()) );
		// FaxDate
		java.util.Date FaxDate = domainObject.getFaxDate();
		if ( null != FaxDate ) 
		{
			valueObject.setFaxDate(new ims.framework.utils.Date(FaxDate) );
		}
		// LiaisonQuery
		valueObject.setLiaisonQuery(domainObject.getLiaisonQuery());
		// isLinkedtoCase
		valueObject.setIsLinkedtoCase( domainObject.isIsLinkedtoCase() );
		// hospital
		if (domainObject.getHospital() != null)
		{
			if(domainObject.getHospital() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getHospital();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setHospital(new ims.core.resource.place.vo.LocationRefVo(id, -1));				
			}
			else
			{
				valueObject.setHospital(new ims.core.resource.place.vo.LocationRefVo(domainObject.getHospital().getId(), domainObject.getHospital().getVersion()));
			}
		}
		// mrn
		valueObject.setMrn(domainObject.getMrn());
		// episodeNumber
		valueObject.setEpisodeNumber(domainObject.getEpisodeNumber());
		// AssocLocall
		if (domainObject.getAssocLocall() != null)
		{
			if(domainObject.getAssocLocall() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAssocLocall();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAssocLocall(new ims.ntpf.locall.vo.LoCallRefVo(id, -1));				
			}
			else
			{
				valueObject.setAssocLocall(new ims.ntpf.locall.vo.LoCallRefVo(domainObject.getAssocLocall().getId(), domainObject.getAssocLocall().getVersion()));
			}
		}
		// AssocCase
		if (domainObject.getAssocCase() != null)
		{
			if(domainObject.getAssocCase() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAssocCase();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAssocCase(new ims.ntpf.casereferral.vo.CaseReferralRefVo(id, -1));				
			}
			else
			{
				valueObject.setAssocCase(new ims.ntpf.casereferral.vo.CaseReferralRefVo(domainObject.getAssocCase().getId(), domainObject.getAssocCase().getVersion()));
			}
		}
		// StatusHistory
		valueObject.setStatusHistory(ims.ntpf.vo.domain.LoCallStatusVoAssembler.createLoCallStatusVoCollectionFromLoCallStatus(map, domainObject.getStatusHistory()) );
		// CurrentStatus
		ims.domain.lookups.LookupInstance instance20 = domainObject.getCurrentStatus();
		if ( null != instance20 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance20.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance20.getImage().getImageId(), instance20.getImage().getImagePath());
			}
			color = instance20.getColor();
			if (color != null) 
				color.getValue();

			ims.ntpf.vo.lookups.LoCallStatus voLookup20 = new ims.ntpf.vo.lookups.LoCallStatus(instance20.getId(),instance20.getText(), instance20.isActive(), null, img, color);
			ims.ntpf.vo.lookups.LoCallStatus parentVoLookup20 = voLookup20;
			ims.domain.lookups.LookupInstance parent20 = instance20.getParent();
			while (parent20 != null)
			{
				if (parent20.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent20.getImage().getImageId(), parent20.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent20.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup20.setParent(new ims.ntpf.vo.lookups.LoCallStatus(parent20.getId(),parent20.getText(), parent20.isActive(), null, img, color));
				parentVoLookup20 = parentVoLookup20.getParent();
								parent20 = parent20.getParent();
			}			
			valueObject.setCurrentStatus(voLookup20);
		}
				// CurrentStatusReason
		ims.domain.lookups.LookupInstance instance21 = domainObject.getCurrentStatusReason();
		if ( null != instance21 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance21.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance21.getImage().getImageId(), instance21.getImage().getImagePath());
			}
			color = instance21.getColor();
			if (color != null) 
				color.getValue();

			ims.ntpf.vo.lookups.LoCallStatus voLookup21 = new ims.ntpf.vo.lookups.LoCallStatus(instance21.getId(),instance21.getText(), instance21.isActive(), null, img, color);
			ims.ntpf.vo.lookups.LoCallStatus parentVoLookup21 = voLookup21;
			ims.domain.lookups.LookupInstance parent21 = instance21.getParent();
			while (parent21 != null)
			{
				if (parent21.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent21.getImage().getImageId(), parent21.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent21.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup21.setParent(new ims.ntpf.vo.lookups.LoCallStatus(parent21.getId(),parent21.getText(), parent21.isActive(), null, img, color));
				parentVoLookup21 = parentVoLookup21.getParent();
								parent21 = parent21.getParent();
			}			
			valueObject.setCurrentStatusReason(voLookup21);
		}
				// Procedure
		valueObject.setProcedure(ims.core.vo.domain.ActivityVoAssembler.create(map, domainObject.getProcedure()) );
		// ProcedureText
		valueObject.setProcedureText(domainObject.getProcedureText());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ntpf.locall.domain.objects.LoCallWaitingListDetails extractLoCallWaitingListDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.ntpf.vo.LoCallWaitingListDetailsVo valueObject) 
	{
		return 	extractLoCallWaitingListDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.ntpf.locall.domain.objects.LoCallWaitingListDetails extractLoCallWaitingListDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.ntpf.vo.LoCallWaitingListDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_LoCallWaitingListDetails();
		ims.ntpf.locall.domain.objects.LoCallWaitingListDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ntpf.locall.domain.objects.LoCallWaitingListDetails)domMap.get(valueObject);
			}
			// ims.ntpf.vo.LoCallWaitingListDetailsVo ID_LoCallWaitingListDetails field is unknown
			domainObject = new ims.ntpf.locall.domain.objects.LoCallWaitingListDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_LoCallWaitingListDetails());
			if (domMap.get(key) != null)
			{
				return (ims.ntpf.locall.domain.objects.LoCallWaitingListDetails)domMap.get(key);
			}
			domainObject = (ims.ntpf.locall.domain.objects.LoCallWaitingListDetails) domainFactory.getDomainObject(ims.ntpf.locall.domain.objects.LoCallWaitingListDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_LoCallWaitingListDetails());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Service value1 = null;
		if ( null != valueObject.getSpeciality() ) 
		{
			if (valueObject.getSpeciality().getBoId() == null)
			{
				if (domMap.get(valueObject.getSpeciality()) != null)
				{
					value1 = (ims.core.clinical.domain.objects.Service)domMap.get(valueObject.getSpeciality());
				}
			}
			else
			{
				value1 = (ims.core.clinical.domain.objects.Service)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Service.class, valueObject.getSpeciality().getBoId());
			}
		}
		domainObject.setSpeciality(value1);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value2 = null;
		if ( null != valueObject.getReferringHospital() ) 
		{
			if (valueObject.getReferringHospital().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferringHospital()) != null)
				{
					value2 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getReferringHospital());
				}
			}
			else
			{
				value2 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getReferringHospital().getBoId());
			}
		}
		domainObject.setReferringHospital(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Medic value3 = null;
		if ( null != valueObject.getReferringConsultant() ) 
		{
			if (valueObject.getReferringConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferringConsultant()) != null)
				{
					value3 = (ims.core.resource.people.domain.objects.Medic)domMap.get(valueObject.getReferringConsultant());
				}
			}
			else
			{
				value3 = (ims.core.resource.people.domain.objects.Medic)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Medic.class, valueObject.getReferringConsultant().getBoId());
			}
		}
		domainObject.setReferringConsultant(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReferringConsultantText() != null && valueObject.getReferringConsultantText().equals(""))
		{
			valueObject.setReferringConsultantText(null);
		}
		domainObject.setReferringConsultantText(valueObject.getReferringConsultantText());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getCategory() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getCategory().getID());
		}
		domainObject.setCategory(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getWaitingListType() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getWaitingListType().getID());
		}
		domainObject.setWaitingListType(value6);
		java.util.Date value7 = null;
		ims.framework.utils.Date date7 = valueObject.getWaitingListDate();		
		if ( date7 != null ) 
		{
			value7 = date7.getDate();
		}
		domainObject.setWaitingListDate(value7);
		domainObject.setWaitingListMonthInterval(valueObject.getWaitingListMonthInterval());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getWaitingListLengthQualifier() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getWaitingListLengthQualifier().getID());
		}
		domainObject.setWaitingListLengthQualifier(value9);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value10 = null;
		if ( null != valueObject.getFaxTo() ) 
		{
			if (valueObject.getFaxTo().getBoId() == null)
			{
				if (domMap.get(valueObject.getFaxTo()) != null)
				{
					value10 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getFaxTo());
				}
			}
			else
			{
				value10 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getFaxTo().getBoId());
			}
		}
		domainObject.setFaxTo(value10);
		java.util.Date value11 = null;
		ims.framework.utils.Date date11 = valueObject.getFaxDate();		
		if ( date11 != null ) 
		{
			value11 = date11.getDate();
		}
		domainObject.setFaxDate(value11);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLiaisonQuery() != null && valueObject.getLiaisonQuery().equals(""))
		{
			valueObject.setLiaisonQuery(null);
		}
		domainObject.setLiaisonQuery(valueObject.getLiaisonQuery());
		domainObject.setIsLinkedtoCase(valueObject.getIsLinkedtoCase());
		ims.core.resource.place.domain.objects.Location value14 = null;
		if ( null != valueObject.getHospital() ) 
		{
			if (valueObject.getHospital().getBoId() == null)
			{
				if (domMap.get(valueObject.getHospital()) != null)
				{
					value14 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getHospital());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value14 = domainObject.getHospital();	
			}
			else
			{
				value14 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getHospital().getBoId());
			}
		}
		domainObject.setHospital(value14);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getMrn() != null && valueObject.getMrn().equals(""))
		{
			valueObject.setMrn(null);
		}
		domainObject.setMrn(valueObject.getMrn());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getEpisodeNumber() != null && valueObject.getEpisodeNumber().equals(""))
		{
			valueObject.setEpisodeNumber(null);
		}
		domainObject.setEpisodeNumber(valueObject.getEpisodeNumber());
		ims.ntpf.locall.domain.objects.LoCall value17 = null;
		if ( null != valueObject.getAssocLocall() ) 
		{
			if (valueObject.getAssocLocall().getBoId() == null)
			{
				if (domMap.get(valueObject.getAssocLocall()) != null)
				{
					value17 = (ims.ntpf.locall.domain.objects.LoCall)domMap.get(valueObject.getAssocLocall());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value17 = domainObject.getAssocLocall();	
			}
			else
			{
				value17 = (ims.ntpf.locall.domain.objects.LoCall)domainFactory.getDomainObject(ims.ntpf.locall.domain.objects.LoCall.class, valueObject.getAssocLocall().getBoId());
			}
		}
		domainObject.setAssocLocall(value17);
		ims.ntpf.casereferral.domain.objects.CaseReferral value18 = null;
		if ( null != valueObject.getAssocCase() ) 
		{
			if (valueObject.getAssocCase().getBoId() == null)
			{
				if (domMap.get(valueObject.getAssocCase()) != null)
				{
					value18 = (ims.ntpf.casereferral.domain.objects.CaseReferral)domMap.get(valueObject.getAssocCase());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value18 = domainObject.getAssocCase();	
			}
			else
			{
				value18 = (ims.ntpf.casereferral.domain.objects.CaseReferral)domainFactory.getDomainObject(ims.ntpf.casereferral.domain.objects.CaseReferral.class, valueObject.getAssocCase().getBoId());
			}
		}
		domainObject.setAssocCase(value18);
		domainObject.setStatusHistory(ims.ntpf.vo.domain.LoCallStatusVoAssembler.extractLoCallStatusSet(domainFactory, valueObject.getStatusHistory(), domainObject.getStatusHistory(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value20 = null;
		if ( null != valueObject.getCurrentStatus() ) 
		{
			value20 =
				domainFactory.getLookupInstance(valueObject.getCurrentStatus().getID());
		}
		domainObject.setCurrentStatus(value20);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value21 = null;
		if ( null != valueObject.getCurrentStatusReason() ) 
		{
			value21 =
				domainFactory.getLookupInstance(valueObject.getCurrentStatusReason().getID());
		}
		domainObject.setCurrentStatusReason(value21);
		domainObject.setProcedure(ims.core.vo.domain.ActivityVoAssembler.extractActivity(domainFactory, valueObject.getProcedure(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getProcedureText() != null && valueObject.getProcedureText().equals(""))
		{
			valueObject.setProcedureText(null);
		}
		domainObject.setProcedureText(valueObject.getProcedureText());

		return domainObject;
	}

}
