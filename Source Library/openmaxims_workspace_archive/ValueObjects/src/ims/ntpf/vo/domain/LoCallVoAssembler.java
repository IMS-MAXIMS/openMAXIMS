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
public class LoCallVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ntpf.vo.LoCallVo copy(ims.ntpf.vo.LoCallVo valueObjectDest, ims.ntpf.vo.LoCallVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_LoCall(valueObjectSrc.getID_LoCall());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// LoCallNumber
		valueObjectDest.setLoCallNumber(valueObjectSrc.getLoCallNumber());
		// WhereHeard
		valueObjectDest.setWhereHeard(valueObjectSrc.getWhereHeard());
		// CallerName
		valueObjectDest.setCallerName(valueObjectSrc.getCallerName());
		// CallerNumber
		valueObjectDest.setCallerNumber(valueObjectSrc.getCallerNumber());
		// PatientCheckList
		valueObjectDest.setPatientCheckList(valueObjectSrc.getPatientCheckList());
		// CallerRelationship
		valueObjectDest.setCallerRelationship(valueObjectSrc.getCallerRelationship());
		// CallType
		valueObjectDest.setCallType(valueObjectSrc.getCallType());
		// MedicalInsurance
		valueObjectDest.setMedicalInsurance(valueObjectSrc.getMedicalInsurance());
		// InsuranceType
		valueObjectDest.setInsuranceType(valueObjectSrc.getInsuranceType());
		// sysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
		// GPDetails
		valueObjectDest.setGPDetails(valueObjectSrc.getGPDetails());
		// LoCallComments
		valueObjectDest.setLoCallComments(valueObjectSrc.getLoCallComments());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// LoCallDate
		valueObjectDest.setLoCallDate(valueObjectSrc.getLoCallDate());
		// WaitingListDetails
		valueObjectDest.setWaitingListDetails(valueObjectSrc.getWaitingListDetails());
		// hasComments
		valueObjectDest.setHasComments(valueObjectSrc.getHasComments());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createLoCallVoCollectionFromLoCall(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ntpf.locall.domain.objects.LoCall objects.
	 */
	public static ims.ntpf.vo.LoCallVoCollection createLoCallVoCollectionFromLoCall(java.util.Set domainObjectSet)	
	{
		return createLoCallVoCollectionFromLoCall(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ntpf.locall.domain.objects.LoCall objects.
	 */
	public static ims.ntpf.vo.LoCallVoCollection createLoCallVoCollectionFromLoCall(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ntpf.vo.LoCallVoCollection voList = new ims.ntpf.vo.LoCallVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ntpf.locall.domain.objects.LoCall domainObject = (ims.ntpf.locall.domain.objects.LoCall) iterator.next();
			ims.ntpf.vo.LoCallVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.ntpf.locall.domain.objects.LoCall objects.
	 */
	public static ims.ntpf.vo.LoCallVoCollection createLoCallVoCollectionFromLoCall(java.util.List domainObjectList) 
	{
		return createLoCallVoCollectionFromLoCall(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ntpf.locall.domain.objects.LoCall objects.
	 */
	public static ims.ntpf.vo.LoCallVoCollection createLoCallVoCollectionFromLoCall(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ntpf.vo.LoCallVoCollection voList = new ims.ntpf.vo.LoCallVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ntpf.locall.domain.objects.LoCall domainObject = (ims.ntpf.locall.domain.objects.LoCall) domainObjectList.get(i);
			ims.ntpf.vo.LoCallVo vo = create(map, domainObject);

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
	 * Create the ims.ntpf.locall.domain.objects.LoCall set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractLoCallSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ntpf.vo.LoCallVoCollection voCollection) 
	 {
	 	return extractLoCallSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractLoCallSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ntpf.vo.LoCallVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ntpf.vo.LoCallVo vo = voCollection.get(i);
			ims.ntpf.locall.domain.objects.LoCall domainObject = LoCallVoAssembler.extractLoCall(domainFactory, vo, domMap);

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
	 * Create the ims.ntpf.locall.domain.objects.LoCall list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractLoCallList(ims.domain.ILightweightDomainFactory domainFactory, ims.ntpf.vo.LoCallVoCollection voCollection) 
	 {
	 	return extractLoCallList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractLoCallList(ims.domain.ILightweightDomainFactory domainFactory, ims.ntpf.vo.LoCallVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ntpf.vo.LoCallVo vo = voCollection.get(i);
			ims.ntpf.locall.domain.objects.LoCall domainObject = LoCallVoAssembler.extractLoCall(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.ntpf.locall.domain.objects.LoCall object.
	 * @param domainObject ims.ntpf.locall.domain.objects.LoCall
	 */
	 public static ims.ntpf.vo.LoCallVo create(ims.ntpf.locall.domain.objects.LoCall domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ntpf.locall.domain.objects.LoCall object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ntpf.vo.LoCallVo create(DomainObjectMap map, ims.ntpf.locall.domain.objects.LoCall domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ntpf.vo.LoCallVo valueObject = (ims.ntpf.vo.LoCallVo) map.getValueObject(domainObject, ims.ntpf.vo.LoCallVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ntpf.vo.LoCallVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ntpf.locall.domain.objects.LoCall
	 */
	 public static ims.ntpf.vo.LoCallVo insert(ims.ntpf.vo.LoCallVo valueObject, ims.ntpf.locall.domain.objects.LoCall domainObject) 
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
	 * @param domainObject ims.ntpf.locall.domain.objects.LoCall
	 */
	 public static ims.ntpf.vo.LoCallVo insert(DomainObjectMap map, ims.ntpf.vo.LoCallVo valueObject, ims.ntpf.locall.domain.objects.LoCall domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_LoCall(domainObject.getId());
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
			
		// LoCallNumber
		valueObject.setLoCallNumber(domainObject.getLoCallNumber());
		// WhereHeard
		ims.domain.lookups.LookupInstance instance2 = domainObject.getWhereHeard();
		if ( null != instance2 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance2.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance2.getImage().getImageId(), instance2.getImage().getImagePath());
			}
			color = instance2.getColor();
			if (color != null) 
				color.getValue();

			ims.ntpf.vo.lookups.WhereHeard voLookup2 = new ims.ntpf.vo.lookups.WhereHeard(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.ntpf.vo.lookups.WhereHeard parentVoLookup2 = voLookup2;
			ims.domain.lookups.LookupInstance parent2 = instance2.getParent();
			while (parent2 != null)
			{
				if (parent2.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent2.getImage().getImageId(), parent2.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent2.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup2.setParent(new ims.ntpf.vo.lookups.WhereHeard(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setWhereHeard(voLookup2);
		}
				// CallerName
		valueObject.setCallerName(domainObject.getCallerName());
		// CallerNumber
		valueObject.setCallerNumber(domainObject.getCallerNumber());
		// PatientCheckList
		valueObject.setPatientCheckList(ims.ntpf.vo.domain.PatientCheckListVoAssembler.createPatientCheckListVoCollectionFromPatientCheckList(map, domainObject.getPatientCheckList()) );
		// CallerRelationship
		ims.domain.lookups.LookupInstance instance6 = domainObject.getCallerRelationship();
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

			ims.ntpf.vo.lookups.CallerRelationship voLookup6 = new ims.ntpf.vo.lookups.CallerRelationship(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.ntpf.vo.lookups.CallerRelationship parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.ntpf.vo.lookups.CallerRelationship(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setCallerRelationship(voLookup6);
		}
				// CallType
		ims.domain.lookups.LookupInstance instance7 = domainObject.getCallType();
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

			ims.ntpf.vo.lookups.CallType voLookup7 = new ims.ntpf.vo.lookups.CallType(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.ntpf.vo.lookups.CallType parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.ntpf.vo.lookups.CallType(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setCallType(voLookup7);
		}
				// MedicalInsurance
		ims.domain.lookups.LookupInstance instance8 = domainObject.getMedicalInsurance();
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

			ims.core.vo.lookups.YesNo voLookup8 = new ims.core.vo.lookups.YesNo(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.YesNo(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setMedicalInsurance(voLookup8);
		}
				// InsuranceType
		ims.domain.lookups.LookupInstance instance9 = domainObject.getInsuranceType();
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

			ims.ntpf.vo.lookups.InsuranceType voLookup9 = new ims.ntpf.vo.lookups.InsuranceType(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.ntpf.vo.lookups.InsuranceType parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.ntpf.vo.lookups.InsuranceType(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setInsuranceType(voLookup9);
		}
				// sysInfo
		// set system information
		valueObject.setSysInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// GPDetails
		valueObject.setGPDetails(ims.ntpf.vo.domain.GPDetailsNTPFVoAssembler.create(map, domainObject.getGPDetails()) );
		// LoCallComments
		valueObject.setLoCallComments(ims.ntpf.vo.domain.CommentVoAssembler.createCommentVoCollectionFromComment(map, domainObject.getLoCallComments()) );
		// Patient
		valueObject.setPatient(ims.core.vo.domain.PatientAssembler.create(map, domainObject.getPatient()) );
		// LoCallDate
		java.util.Date LoCallDate = domainObject.getLoCallDate();
		if ( null != LoCallDate ) 
		{
			valueObject.setLoCallDate(new ims.framework.utils.Date(LoCallDate) );
		}
		// WaitingListDetails
		valueObject.setWaitingListDetails(ims.ntpf.vo.domain.LoCallWaitingListDetailsVoAssembler.createLoCallWaitingListDetailsVoCollectionFromLoCallWaitingListDetails(map, domainObject.getWaitingListDetails()) );
		// hasComments
		valueObject.setHasComments( domainObject.isHasComments() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ntpf.locall.domain.objects.LoCall extractLoCall(ims.domain.ILightweightDomainFactory domainFactory, ims.ntpf.vo.LoCallVo valueObject) 
	{
		return 	extractLoCall(domainFactory, valueObject, new HashMap());
	}

	public static ims.ntpf.locall.domain.objects.LoCall extractLoCall(ims.domain.ILightweightDomainFactory domainFactory, ims.ntpf.vo.LoCallVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_LoCall();
		ims.ntpf.locall.domain.objects.LoCall domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ntpf.locall.domain.objects.LoCall)domMap.get(valueObject);
			}
			// ims.ntpf.vo.LoCallVo ID_LoCall field is unknown
			domainObject = new ims.ntpf.locall.domain.objects.LoCall();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_LoCall());
			if (domMap.get(key) != null)
			{
				return (ims.ntpf.locall.domain.objects.LoCall)domMap.get(key);
			}
			domainObject = (ims.ntpf.locall.domain.objects.LoCall) domainFactory.getDomainObject(ims.ntpf.locall.domain.objects.LoCall.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_LoCall());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLoCallNumber() != null && valueObject.getLoCallNumber().equals(""))
		{
			valueObject.setLoCallNumber(null);
		}
		domainObject.setLoCallNumber(valueObject.getLoCallNumber());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getWhereHeard() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getWhereHeard().getID());
		}
		domainObject.setWhereHeard(value2);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCallerName() != null && valueObject.getCallerName().equals(""))
		{
			valueObject.setCallerName(null);
		}
		domainObject.setCallerName(valueObject.getCallerName());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCallerNumber() != null && valueObject.getCallerNumber().equals(""))
		{
			valueObject.setCallerNumber(null);
		}
		domainObject.setCallerNumber(valueObject.getCallerNumber());
		domainObject.setPatientCheckList(ims.ntpf.vo.domain.PatientCheckListVoAssembler.extractPatientCheckListSet(domainFactory, valueObject.getPatientCheckList(), domainObject.getPatientCheckList(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getCallerRelationship() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getCallerRelationship().getID());
		}
		domainObject.setCallerRelationship(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getCallType() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getCallType().getID());
		}
		domainObject.setCallType(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getMedicalInsurance() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getMedicalInsurance().getID());
		}
		domainObject.setMedicalInsurance(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getInsuranceType() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getInsuranceType().getID());
		}
		domainObject.setInsuranceType(value9);
		domainObject.setGPDetails(ims.ntpf.vo.domain.GPDetailsNTPFVoAssembler.extractGPDetails(domainFactory, valueObject.getGPDetails(), domMap));
		domainObject.setLoCallComments(ims.ntpf.vo.domain.CommentVoAssembler.extractCommentSet(domainFactory, valueObject.getLoCallComments(), domainObject.getLoCallComments(), domMap));		
		domainObject.setPatient(ims.core.vo.domain.PatientAssembler.extractPatient(domainFactory, valueObject.getPatient(), domMap));
		java.util.Date value14 = null;
		ims.framework.utils.Date date14 = valueObject.getLoCallDate();		
		if ( date14 != null ) 
		{
			value14 = date14.getDate();
		}
		domainObject.setLoCallDate(value14);
		domainObject.setWaitingListDetails(ims.ntpf.vo.domain.LoCallWaitingListDetailsVoAssembler.extractLoCallWaitingListDetailsSet(domainFactory, valueObject.getWaitingListDetails(), domainObject.getWaitingListDetails(), domMap));		
		domainObject.setHasComments(valueObject.getHasComments());

		return domainObject;
	}

}
