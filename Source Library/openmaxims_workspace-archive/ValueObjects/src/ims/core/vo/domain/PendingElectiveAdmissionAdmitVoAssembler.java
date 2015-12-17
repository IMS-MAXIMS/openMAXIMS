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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class PendingElectiveAdmissionAdmitVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PendingElectiveAdmissionAdmitVo copy(ims.core.vo.PendingElectiveAdmissionAdmitVo valueObjectDest, ims.core.vo.PendingElectiveAdmissionAdmitVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PendingElectiveAdmission(valueObjectSrc.getID_PendingElectiveAdmission());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// pasEvent
		valueObjectDest.setPasEvent(valueObjectSrc.getPasEvent());
		// AllocatedWard
		valueObjectDest.setAllocatedWard(valueObjectSrc.getAllocatedWard());
		// ElectiveAdmissionStatus
		valueObjectDest.setElectiveAdmissionStatus(valueObjectSrc.getElectiveAdmissionStatus());
		// WardType
		valueObjectDest.setWardType(valueObjectSrc.getWardType());
		// TCIType
		valueObjectDest.setTCIType(valueObjectSrc.getTCIType());
		// TCIDate
		valueObjectDest.setTCIDate(valueObjectSrc.getTCIDate());
		// TCITime
		valueObjectDest.setTCITime(valueObjectSrc.getTCITime());
		// isMaternity
		valueObjectDest.setIsMaternity(valueObjectSrc.getIsMaternity());
		// ReasonForAdmission
		valueObjectDest.setReasonForAdmission(valueObjectSrc.getReasonForAdmission());
		// ExpectedStay
		valueObjectDest.setExpectedStay(valueObjectSrc.getExpectedStay());
		// AdmissionSource
		valueObjectDest.setAdmissionSource(valueObjectSrc.getAdmissionSource());
		// AdmissionMethod
		valueObjectDest.setAdmissionMethod(valueObjectSrc.getAdmissionMethod());
		// ReferringConsultant
		valueObjectDest.setReferringConsultant(valueObjectSrc.getReferringConsultant());
		// PatientStatus
		valueObjectDest.setPatientStatus(valueObjectSrc.getPatientStatus());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPendingElectiveAdmissionAdmitVoCollectionFromPendingElectiveAdmission(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.PendingElectiveAdmission objects.
	 */
	public static ims.core.vo.PendingElectiveAdmissionAdmitVoCollection createPendingElectiveAdmissionAdmitVoCollectionFromPendingElectiveAdmission(java.util.Set domainObjectSet)	
	{
		return createPendingElectiveAdmissionAdmitVoCollectionFromPendingElectiveAdmission(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.PendingElectiveAdmission objects.
	 */
	public static ims.core.vo.PendingElectiveAdmissionAdmitVoCollection createPendingElectiveAdmissionAdmitVoCollectionFromPendingElectiveAdmission(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PendingElectiveAdmissionAdmitVoCollection voList = new ims.core.vo.PendingElectiveAdmissionAdmitVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.pas.domain.objects.PendingElectiveAdmission domainObject = (ims.core.admin.pas.domain.objects.PendingElectiveAdmission) iterator.next();
			ims.core.vo.PendingElectiveAdmissionAdmitVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.PendingElectiveAdmission objects.
	 */
	public static ims.core.vo.PendingElectiveAdmissionAdmitVoCollection createPendingElectiveAdmissionAdmitVoCollectionFromPendingElectiveAdmission(java.util.List domainObjectList) 
	{
		return createPendingElectiveAdmissionAdmitVoCollectionFromPendingElectiveAdmission(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.PendingElectiveAdmission objects.
	 */
	public static ims.core.vo.PendingElectiveAdmissionAdmitVoCollection createPendingElectiveAdmissionAdmitVoCollectionFromPendingElectiveAdmission(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PendingElectiveAdmissionAdmitVoCollection voList = new ims.core.vo.PendingElectiveAdmissionAdmitVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.PendingElectiveAdmission domainObject = (ims.core.admin.pas.domain.objects.PendingElectiveAdmission) domainObjectList.get(i);
			ims.core.vo.PendingElectiveAdmissionAdmitVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.pas.domain.objects.PendingElectiveAdmission set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPendingElectiveAdmissionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PendingElectiveAdmissionAdmitVoCollection voCollection) 
	 {
	 	return extractPendingElectiveAdmissionSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPendingElectiveAdmissionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PendingElectiveAdmissionAdmitVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PendingElectiveAdmissionAdmitVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.PendingElectiveAdmission domainObject = PendingElectiveAdmissionAdmitVoAssembler.extractPendingElectiveAdmission(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.pas.domain.objects.PendingElectiveAdmission list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPendingElectiveAdmissionList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PendingElectiveAdmissionAdmitVoCollection voCollection) 
	 {
	 	return extractPendingElectiveAdmissionList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPendingElectiveAdmissionList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PendingElectiveAdmissionAdmitVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PendingElectiveAdmissionAdmitVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.PendingElectiveAdmission domainObject = PendingElectiveAdmissionAdmitVoAssembler.extractPendingElectiveAdmission(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.pas.domain.objects.PendingElectiveAdmission object.
	 * @param domainObject ims.core.admin.pas.domain.objects.PendingElectiveAdmission
	 */
	 public static ims.core.vo.PendingElectiveAdmissionAdmitVo create(ims.core.admin.pas.domain.objects.PendingElectiveAdmission domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.pas.domain.objects.PendingElectiveAdmission object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PendingElectiveAdmissionAdmitVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.PendingElectiveAdmission domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PendingElectiveAdmissionAdmitVo valueObject = (ims.core.vo.PendingElectiveAdmissionAdmitVo) map.getValueObject(domainObject, ims.core.vo.PendingElectiveAdmissionAdmitVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PendingElectiveAdmissionAdmitVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.pas.domain.objects.PendingElectiveAdmission
	 */
	 public static ims.core.vo.PendingElectiveAdmissionAdmitVo insert(ims.core.vo.PendingElectiveAdmissionAdmitVo valueObject, ims.core.admin.pas.domain.objects.PendingElectiveAdmission domainObject) 
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
	 * @param domainObject ims.core.admin.pas.domain.objects.PendingElectiveAdmission
	 */
	 public static ims.core.vo.PendingElectiveAdmissionAdmitVo insert(DomainObjectMap map, ims.core.vo.PendingElectiveAdmissionAdmitVo valueObject, ims.core.admin.pas.domain.objects.PendingElectiveAdmission domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PendingElectiveAdmission(domainObject.getId());
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
		// AllocatedWard
		valueObject.setAllocatedWard(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getAllocatedWard()) );
		// ElectiveAdmissionStatus
		ims.domain.lookups.LookupInstance instance3 = domainObject.getElectiveAdmissionStatus();
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

			ims.core.vo.lookups.ElectiveAdmissionStatus voLookup3 = new ims.core.vo.lookups.ElectiveAdmissionStatus(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.ElectiveAdmissionStatus parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.ElectiveAdmissionStatus(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setElectiveAdmissionStatus(voLookup3);
		}
				// WardType
		ims.domain.lookups.LookupInstance instance4 = domainObject.getWardType();
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

			ims.core.vo.lookups.WardType voLookup4 = new ims.core.vo.lookups.WardType(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.WardType parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.WardType(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setWardType(voLookup4);
		}
				// TCIType
		ims.domain.lookups.LookupInstance instance5 = domainObject.getTCIType();
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

			ims.core.vo.lookups.TCIType voLookup5 = new ims.core.vo.lookups.TCIType(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.TCIType parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.TCIType(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setTCIType(voLookup5);
		}
				// TCIDate
		java.util.Date TCIDate = domainObject.getTCIDate();
		if ( null != TCIDate ) 
		{
			valueObject.setTCIDate(new ims.framework.utils.Date(TCIDate) );
		}
		// TCITime
		String TCITime = domainObject.getTCITime();
		if ( null != TCITime ) 
		{
			valueObject.setTCITime(new ims.framework.utils.Time(TCITime) );
		}
		// isMaternity
		valueObject.setIsMaternity( domainObject.isIsMaternity() );
		// ReasonForAdmission
		valueObject.setReasonForAdmission(domainObject.getReasonForAdmission());
		// ExpectedStay
		valueObject.setExpectedStay(domainObject.getExpectedStay());
		// AdmissionSource
		ims.domain.lookups.LookupInstance instance11 = domainObject.getAdmissionSource();
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
			valueObject.setAdmissionSource(voLookup11);
		}
				// AdmissionMethod
		ims.domain.lookups.LookupInstance instance12 = domainObject.getAdmissionMethod();
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
			valueObject.setAdmissionMethod(voLookup12);
		}
				// ReferringConsultant
		valueObject.setReferringConsultant((ims.core.vo.MedicVo)ims.core.vo.domain.MedicVoAssembler.create(map, domainObject.getReferringConsultant()) );
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
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.pas.domain.objects.PendingElectiveAdmission extractPendingElectiveAdmission(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PendingElectiveAdmissionAdmitVo valueObject) 
	{
		return 	extractPendingElectiveAdmission(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.PendingElectiveAdmission extractPendingElectiveAdmission(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PendingElectiveAdmissionAdmitVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PendingElectiveAdmission();
		ims.core.admin.pas.domain.objects.PendingElectiveAdmission domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.pas.domain.objects.PendingElectiveAdmission)domMap.get(valueObject);
			}
			// ims.core.vo.PendingElectiveAdmissionAdmitVo ID_PendingElectiveAdmission field is unknown
			domainObject = new ims.core.admin.pas.domain.objects.PendingElectiveAdmission();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PendingElectiveAdmission());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.pas.domain.objects.PendingElectiveAdmission)domMap.get(key);
			}
			domainObject = (ims.core.admin.pas.domain.objects.PendingElectiveAdmission) domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.PendingElectiveAdmission.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PendingElectiveAdmission());

		domainObject.setPasEvent(ims.core.vo.domain.PasEventAdmitVoAssembler.extractPASEvent(domainFactory, valueObject.getPasEvent(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value2 = null;
		if ( null != valueObject.getAllocatedWard() ) 
		{
			if (valueObject.getAllocatedWard().getBoId() == null)
			{
				if (domMap.get(valueObject.getAllocatedWard()) != null)
				{
					value2 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getAllocatedWard());
				}
			}
			else
			{
				value2 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getAllocatedWard().getBoId());
			}
		}
		domainObject.setAllocatedWard(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getElectiveAdmissionStatus() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getElectiveAdmissionStatus().getID());
		}
		domainObject.setElectiveAdmissionStatus(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getWardType() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getWardType().getID());
		}
		domainObject.setWardType(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getTCIType() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getTCIType().getID());
		}
		domainObject.setTCIType(value5);
		java.util.Date value6 = null;
		ims.framework.utils.Date date6 = valueObject.getTCIDate();		
		if ( date6 != null ) 
		{
			value6 = date6.getDate();
		}
		domainObject.setTCIDate(value6);
		ims.framework.utils.Time time7 = valueObject.getTCITime();
		String value7 = null;
		if ( time7 != null ) 
		{
			value7 = time7.toString();
		}
		domainObject.setTCITime(value7);
		domainObject.setIsMaternity(valueObject.getIsMaternity());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReasonForAdmission() != null && valueObject.getReasonForAdmission().equals(""))
		{
			valueObject.setReasonForAdmission(null);
		}
		domainObject.setReasonForAdmission(valueObject.getReasonForAdmission());
		domainObject.setExpectedStay(valueObject.getExpectedStay());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getAdmissionSource() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getAdmissionSource().getID());
		}
		domainObject.setAdmissionSource(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getAdmissionMethod() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getAdmissionMethod().getID());
		}
		domainObject.setAdmissionMethod(value12);
		domainObject.setReferringConsultant(ims.core.vo.domain.MedicVoAssembler.extractMedic(domainFactory, (ims.core.vo.MedicVo)valueObject.getReferringConsultant(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getPatientStatus() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getPatientStatus().getID());
		}
		domainObject.setPatientStatus(value14);

		return domainObject;
	}

}
