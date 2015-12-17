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
 * Generated on 12/10/2015, 13:23
 *
 */
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Sean Nesbitt
 */
public class PDSAdvancedSearchRequestVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PDSAdvancedSearchRequestVo copy(ims.core.vo.PDSAdvancedSearchRequestVo valueObjectDest, ims.core.vo.PDSAdvancedSearchRequestVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PDSAsyncRequest(valueObjectSrc.getID_PDSAsyncRequest());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// SDSRoleProfileId
		valueObjectDest.setSDSRoleProfileId(valueObjectSrc.getSDSRoleProfileId());
		// SDSUserId
		valueObjectDest.setSDSUserId(valueObjectSrc.getSDSUserId());
		// PDSAck
		valueObjectDest.setPDSAck(valueObjectSrc.getPDSAck());
		// PDSAckDetailType
		valueObjectDest.setPDSAckDetailType(valueObjectSrc.getPDSAckDetailType());
		// Active
		valueObjectDest.setActive(valueObjectSrc.getActive());
		// Comment
		valueObjectDest.setComment(valueObjectSrc.getComment());
		// requestType
		valueObjectDest.setRequestType(valueObjectSrc.getRequestType());
		// requestDate
		valueObjectDest.setRequestDate(valueObjectSrc.getRequestDate());
		// SearchStatus
		valueObjectDest.setSearchStatus(valueObjectSrc.getSearchStatus());
		// SearchType
		valueObjectDest.setSearchType(valueObjectSrc.getSearchType());
		// HistoricDataFlag
		valueObjectDest.setHistoricDataFlag(valueObjectSrc.getHistoricDataFlag());
		// IgnoreHistoryIndicator
		valueObjectDest.setIgnoreHistoryIndicator(valueObjectSrc.getIgnoreHistoryIndicator());
		// NHSNumber
		valueObjectDest.setNHSNumber(valueObjectSrc.getNHSNumber());
		// Surname
		valueObjectDest.setSurname(valueObjectSrc.getSurname());
		// Forename
		valueObjectDest.setForename(valueObjectSrc.getForename());
		// Gender
		valueObjectDest.setGender(valueObjectSrc.getGender());
		// FromDateOfBirth
		valueObjectDest.setFromDateOfBirth(valueObjectSrc.getFromDateOfBirth());
		// ToDateOfBirth
		valueObjectDest.setToDateOfBirth(valueObjectSrc.getToDateOfBirth());
		// FromDateOfDeath
		valueObjectDest.setFromDateOfDeath(valueObjectSrc.getFromDateOfDeath());
		// ToDateOfDeath
		valueObjectDest.setToDateOfDeath(valueObjectSrc.getToDateOfDeath());
		// SearchResult
		valueObjectDest.setSearchResult(valueObjectSrc.getSearchResult());
		// ConvId
		valueObjectDest.setConvId(valueObjectSrc.getConvId());
		// address
		valueObjectDest.setAddress(valueObjectSrc.getAddress());
		// gpPracticeCode
		valueObjectDest.setGpPracticeCode(valueObjectSrc.getGpPracticeCode());
		// SDSJobRoleCode
		valueObjectDest.setSDSJobRoleCode(valueObjectSrc.getSDSJobRoleCode());
		// postcode
		valueObjectDest.setPostcode(valueObjectSrc.getPostcode());
		// middleName
		valueObjectDest.setMiddleName(valueObjectSrc.getMiddleName());
		// DOBRangeUnit
		valueObjectDest.setDOBRangeUnit(valueObjectSrc.getDOBRangeUnit());
		// DODRangeUnit
		valueObjectDest.setDODRangeUnit(valueObjectSrc.getDODRangeUnit());
		// DOBRangeValue
		valueObjectDest.setDOBRangeValue(valueObjectSrc.getDOBRangeValue());
		// DODRangeValue
		valueObjectDest.setDODRangeValue(valueObjectSrc.getDODRangeValue());
		// DOBPartialSearchBy
		valueObjectDest.setDOBPartialSearchBy(valueObjectSrc.getDOBPartialSearchBy());
		// DODPartialSearchBy
		valueObjectDest.setDODPartialSearchBy(valueObjectSrc.getDODPartialSearchBy());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPDSAdvancedSearchRequestVoCollectionFromPDSAdvancedSearchRequest(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.PDSAdvancedSearchRequest objects.
	 */
	public static ims.core.vo.PDSAdvancedSearchRequestVoCollection createPDSAdvancedSearchRequestVoCollectionFromPDSAdvancedSearchRequest(java.util.Set domainObjectSet)	
	{
		return createPDSAdvancedSearchRequestVoCollectionFromPDSAdvancedSearchRequest(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.PDSAdvancedSearchRequest objects.
	 */
	public static ims.core.vo.PDSAdvancedSearchRequestVoCollection createPDSAdvancedSearchRequestVoCollectionFromPDSAdvancedSearchRequest(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PDSAdvancedSearchRequestVoCollection voList = new ims.core.vo.PDSAdvancedSearchRequestVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.patient.domain.objects.PDSAdvancedSearchRequest domainObject = (ims.core.patient.domain.objects.PDSAdvancedSearchRequest) iterator.next();
			ims.core.vo.PDSAdvancedSearchRequestVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.patient.domain.objects.PDSAdvancedSearchRequest objects.
	 */
	public static ims.core.vo.PDSAdvancedSearchRequestVoCollection createPDSAdvancedSearchRequestVoCollectionFromPDSAdvancedSearchRequest(java.util.List domainObjectList) 
	{
		return createPDSAdvancedSearchRequestVoCollectionFromPDSAdvancedSearchRequest(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.patient.domain.objects.PDSAdvancedSearchRequest objects.
	 */
	public static ims.core.vo.PDSAdvancedSearchRequestVoCollection createPDSAdvancedSearchRequestVoCollectionFromPDSAdvancedSearchRequest(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PDSAdvancedSearchRequestVoCollection voList = new ims.core.vo.PDSAdvancedSearchRequestVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.patient.domain.objects.PDSAdvancedSearchRequest domainObject = (ims.core.patient.domain.objects.PDSAdvancedSearchRequest) domainObjectList.get(i);
			ims.core.vo.PDSAdvancedSearchRequestVo vo = create(map, domainObject);

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
	 * Create the ims.core.patient.domain.objects.PDSAdvancedSearchRequest set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPDSAdvancedSearchRequestSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSAdvancedSearchRequestVoCollection voCollection) 
	 {
	 	return extractPDSAdvancedSearchRequestSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPDSAdvancedSearchRequestSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSAdvancedSearchRequestVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PDSAdvancedSearchRequestVo vo = voCollection.get(i);
			ims.core.patient.domain.objects.PDSAdvancedSearchRequest domainObject = PDSAdvancedSearchRequestVoAssembler.extractPDSAdvancedSearchRequest(domainFactory, vo, domMap);

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
	 * Create the ims.core.patient.domain.objects.PDSAdvancedSearchRequest list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPDSAdvancedSearchRequestList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSAdvancedSearchRequestVoCollection voCollection) 
	 {
	 	return extractPDSAdvancedSearchRequestList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPDSAdvancedSearchRequestList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSAdvancedSearchRequestVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PDSAdvancedSearchRequestVo vo = voCollection.get(i);
			ims.core.patient.domain.objects.PDSAdvancedSearchRequest domainObject = PDSAdvancedSearchRequestVoAssembler.extractPDSAdvancedSearchRequest(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.patient.domain.objects.PDSAdvancedSearchRequest object.
	 * @param domainObject ims.core.patient.domain.objects.PDSAdvancedSearchRequest
	 */
	 public static ims.core.vo.PDSAdvancedSearchRequestVo create(ims.core.patient.domain.objects.PDSAdvancedSearchRequest domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.patient.domain.objects.PDSAdvancedSearchRequest object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PDSAdvancedSearchRequestVo create(DomainObjectMap map, ims.core.patient.domain.objects.PDSAdvancedSearchRequest domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PDSAdvancedSearchRequestVo valueObject = (ims.core.vo.PDSAdvancedSearchRequestVo) map.getValueObject(domainObject, ims.core.vo.PDSAdvancedSearchRequestVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PDSAdvancedSearchRequestVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.patient.domain.objects.PDSAdvancedSearchRequest
	 */
	 public static ims.core.vo.PDSAdvancedSearchRequestVo insert(ims.core.vo.PDSAdvancedSearchRequestVo valueObject, ims.core.patient.domain.objects.PDSAdvancedSearchRequest domainObject) 
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
	 * @param domainObject ims.core.patient.domain.objects.PDSAdvancedSearchRequest
	 */
	 public static ims.core.vo.PDSAdvancedSearchRequestVo insert(DomainObjectMap map, ims.core.vo.PDSAdvancedSearchRequestVo valueObject, ims.core.patient.domain.objects.PDSAdvancedSearchRequest domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PDSAsyncRequest(domainObject.getId());
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
			
		// SDSRoleProfileId
		valueObject.setSDSRoleProfileId(domainObject.getSDSRoleProfileId());
		// SDSUserId
		valueObject.setSDSUserId(domainObject.getSDSUserId());
		// PDSAck
		ims.domain.lookups.LookupInstance instance3 = domainObject.getPDSAck();
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

			ims.core.vo.lookups.PDSRequestAckStatus voLookup3 = new ims.core.vo.lookups.PDSRequestAckStatus(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.PDSRequestAckStatus parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.PDSRequestAckStatus(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setPDSAck(voLookup3);
		}
				// PDSAckDetailType
		ims.domain.lookups.LookupInstance instance4 = domainObject.getPDSAckDetailType();
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

			ims.core.vo.lookups.PDSAckDetailType voLookup4 = new ims.core.vo.lookups.PDSAckDetailType(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.PDSAckDetailType parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.PDSAckDetailType(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setPDSAckDetailType(voLookup4);
		}
				// Active
		valueObject.setActive( domainObject.isActive() );
		// Comment
		valueObject.setComment(domainObject.getComment());
		// requestType
		ims.domain.lookups.LookupInstance instance7 = domainObject.getRequestType();
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

			ims.core.vo.lookups.PDSAsyncRequestType voLookup7 = new ims.core.vo.lookups.PDSAsyncRequestType(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.PDSAsyncRequestType parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.core.vo.lookups.PDSAsyncRequestType(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setRequestType(voLookup7);
		}
				// requestDate
		java.util.Date requestDate = domainObject.getRequestDate();
		if ( null != requestDate ) 
		{
			valueObject.setRequestDate(new ims.framework.utils.DateTime(requestDate) );
		}
		// SearchStatus
		ims.domain.lookups.LookupInstance instance9 = domainObject.getSearchStatus();
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

			ims.core.vo.lookups.PDSSearchStatus voLookup9 = new ims.core.vo.lookups.PDSSearchStatus(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.PDSSearchStatus parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.core.vo.lookups.PDSSearchStatus(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setSearchStatus(voLookup9);
		}
				// SearchType
		ims.domain.lookups.LookupInstance instance10 = domainObject.getSearchType();
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

			ims.core.vo.lookups.PDSSearchType voLookup10 = new ims.core.vo.lookups.PDSSearchType(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.PDSSearchType parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.core.vo.lookups.PDSSearchType(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setSearchType(voLookup10);
		}
				// HistoricDataFlag
		ims.domain.lookups.LookupInstance instance11 = domainObject.getHistoricDataFlag();
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

			ims.core.vo.lookups.PDSHistoryDataFlag voLookup11 = new ims.core.vo.lookups.PDSHistoryDataFlag(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.core.vo.lookups.PDSHistoryDataFlag parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.core.vo.lookups.PDSHistoryDataFlag(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setHistoricDataFlag(voLookup11);
		}
				// IgnoreHistoryIndicator
		ims.domain.lookups.LookupInstance instance12 = domainObject.getIgnoreHistoryIndicator();
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

			ims.core.vo.lookups.PDSIgnoreHistoryIndicator voLookup12 = new ims.core.vo.lookups.PDSIgnoreHistoryIndicator(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.core.vo.lookups.PDSIgnoreHistoryIndicator parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.core.vo.lookups.PDSIgnoreHistoryIndicator(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setIgnoreHistoryIndicator(voLookup12);
		}
				// NHSNumber
		valueObject.setNHSNumber(domainObject.getNHSNumber());
		// Surname
		valueObject.setSurname(domainObject.getSurname());
		// Forename
		valueObject.setForename(domainObject.getForename());
		// Gender
		ims.domain.lookups.LookupInstance instance16 = domainObject.getGender();
		if ( null != instance16 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance16.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance16.getImage().getImageId(), instance16.getImage().getImagePath());
			}
			color = instance16.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.Sex voLookup16 = new ims.core.vo.lookups.Sex(instance16.getId(),instance16.getText(), instance16.isActive(), null, img, color);
			ims.core.vo.lookups.Sex parentVoLookup16 = voLookup16;
			ims.domain.lookups.LookupInstance parent16 = instance16.getParent();
			while (parent16 != null)
			{
				if (parent16.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent16.getImage().getImageId(), parent16.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent16.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup16.setParent(new ims.core.vo.lookups.Sex(parent16.getId(),parent16.getText(), parent16.isActive(), null, img, color));
				parentVoLookup16 = parentVoLookup16.getParent();
								parent16 = parent16.getParent();
			}			
			valueObject.setGender(voLookup16);
		}
				// FromDateOfBirth
		java.util.Date FromDateOfBirth = domainObject.getFromDateOfBirth();
		if ( null != FromDateOfBirth ) 
		{
			valueObject.setFromDateOfBirth(new ims.framework.utils.Date(FromDateOfBirth) );
		}
		// ToDateOfBirth
		java.util.Date ToDateOfBirth = domainObject.getToDateOfBirth();
		if ( null != ToDateOfBirth ) 
		{
			valueObject.setToDateOfBirth(new ims.framework.utils.Date(ToDateOfBirth) );
		}
		// FromDateOfDeath
		java.util.Date FromDateOfDeath = domainObject.getFromDateOfDeath();
		if ( null != FromDateOfDeath ) 
		{
			valueObject.setFromDateOfDeath(new ims.framework.utils.Date(FromDateOfDeath) );
		}
		// ToDateOfDeath
		java.util.Date ToDateOfDeath = domainObject.getToDateOfDeath();
		if ( null != ToDateOfDeath ) 
		{
			valueObject.setToDateOfDeath(new ims.framework.utils.Date(ToDateOfDeath) );
		}
		// SearchResult
		valueObject.setSearchResult(ims.core.vo.domain.PDSAdvancedSearchResultVoAssembler.createPDSAdvancedSearchResultVoCollectionFromPDSAdvancedSearchResult(map, domainObject.getSearchResult()) );
		// ConvId
		if (domainObject.getConvId() != null)
		{
			if(domainObject.getConvId() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getConvId();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setConvId(new ims.choose_book.vo.PDSConvRefVo(id, -1));				
			}
			else
			{
				valueObject.setConvId(new ims.choose_book.vo.PDSConvRefVo(domainObject.getConvId().getId(), domainObject.getConvId().getVersion()));
			}
		}
		// address
		valueObject.setAddress(ims.core.vo.domain.AddressVoAssembler.create(map, domainObject.getAddress()) );
		// gpPracticeCode
		valueObject.setGpPracticeCode(domainObject.getGpPracticeCode());
		// SDSJobRoleCode
		valueObject.setSDSJobRoleCode(domainObject.getSDSJobRoleCode());
		// postcode
		valueObject.setPostcode(domainObject.getPostcode());
		// middleName
		valueObject.setMiddleName(domainObject.getMiddleName());
		// DOBRangeUnit
		ims.domain.lookups.LookupInstance instance28 = domainObject.getDOBRangeUnit();
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

			ims.core.vo.lookups.TimeUnitsSecondsToYears voLookup28 = new ims.core.vo.lookups.TimeUnitsSecondsToYears(instance28.getId(),instance28.getText(), instance28.isActive(), null, img, color);
			ims.core.vo.lookups.TimeUnitsSecondsToYears parentVoLookup28 = voLookup28;
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
								parentVoLookup28.setParent(new ims.core.vo.lookups.TimeUnitsSecondsToYears(parent28.getId(),parent28.getText(), parent28.isActive(), null, img, color));
				parentVoLookup28 = parentVoLookup28.getParent();
								parent28 = parent28.getParent();
			}			
			valueObject.setDOBRangeUnit(voLookup28);
		}
				// DODRangeUnit
		ims.domain.lookups.LookupInstance instance29 = domainObject.getDODRangeUnit();
		if ( null != instance29 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance29.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance29.getImage().getImageId(), instance29.getImage().getImagePath());
			}
			color = instance29.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.TimeUnitsSecondsToYears voLookup29 = new ims.core.vo.lookups.TimeUnitsSecondsToYears(instance29.getId(),instance29.getText(), instance29.isActive(), null, img, color);
			ims.core.vo.lookups.TimeUnitsSecondsToYears parentVoLookup29 = voLookup29;
			ims.domain.lookups.LookupInstance parent29 = instance29.getParent();
			while (parent29 != null)
			{
				if (parent29.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent29.getImage().getImageId(), parent29.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent29.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup29.setParent(new ims.core.vo.lookups.TimeUnitsSecondsToYears(parent29.getId(),parent29.getText(), parent29.isActive(), null, img, color));
				parentVoLookup29 = parentVoLookup29.getParent();
								parent29 = parent29.getParent();
			}			
			valueObject.setDODRangeUnit(voLookup29);
		}
				// DOBRangeValue
		valueObject.setDOBRangeValue(domainObject.getDOBRangeValue());
		// DODRangeValue
		valueObject.setDODRangeValue(domainObject.getDODRangeValue());
		// DOBPartialSearchBy
		ims.domain.lookups.LookupInstance instance32 = domainObject.getDOBPartialSearchBy();
		if ( null != instance32 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance32.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance32.getImage().getImageId(), instance32.getImage().getImagePath());
			}
			color = instance32.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.TimeUnitsSecondsToYears voLookup32 = new ims.core.vo.lookups.TimeUnitsSecondsToYears(instance32.getId(),instance32.getText(), instance32.isActive(), null, img, color);
			ims.core.vo.lookups.TimeUnitsSecondsToYears parentVoLookup32 = voLookup32;
			ims.domain.lookups.LookupInstance parent32 = instance32.getParent();
			while (parent32 != null)
			{
				if (parent32.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent32.getImage().getImageId(), parent32.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent32.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup32.setParent(new ims.core.vo.lookups.TimeUnitsSecondsToYears(parent32.getId(),parent32.getText(), parent32.isActive(), null, img, color));
				parentVoLookup32 = parentVoLookup32.getParent();
								parent32 = parent32.getParent();
			}			
			valueObject.setDOBPartialSearchBy(voLookup32);
		}
				// DODPartialSearchBy
		ims.domain.lookups.LookupInstance instance33 = domainObject.getDODPartialSearchBy();
		if ( null != instance33 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance33.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance33.getImage().getImageId(), instance33.getImage().getImagePath());
			}
			color = instance33.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.TimeUnitsSecondsToYears voLookup33 = new ims.core.vo.lookups.TimeUnitsSecondsToYears(instance33.getId(),instance33.getText(), instance33.isActive(), null, img, color);
			ims.core.vo.lookups.TimeUnitsSecondsToYears parentVoLookup33 = voLookup33;
			ims.domain.lookups.LookupInstance parent33 = instance33.getParent();
			while (parent33 != null)
			{
				if (parent33.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent33.getImage().getImageId(), parent33.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent33.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup33.setParent(new ims.core.vo.lookups.TimeUnitsSecondsToYears(parent33.getId(),parent33.getText(), parent33.isActive(), null, img, color));
				parentVoLookup33 = parentVoLookup33.getParent();
								parent33 = parent33.getParent();
			}			
			valueObject.setDODPartialSearchBy(voLookup33);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.patient.domain.objects.PDSAdvancedSearchRequest extractPDSAdvancedSearchRequest(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSAdvancedSearchRequestVo valueObject) 
	{
		return 	extractPDSAdvancedSearchRequest(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.patient.domain.objects.PDSAdvancedSearchRequest extractPDSAdvancedSearchRequest(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSAdvancedSearchRequestVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PDSAsyncRequest();
		ims.core.patient.domain.objects.PDSAdvancedSearchRequest domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.patient.domain.objects.PDSAdvancedSearchRequest)domMap.get(valueObject);
			}
			// ims.core.vo.PDSAdvancedSearchRequestVo ID_PDSAdvancedSearchRequest field is unknown
			domainObject = new ims.core.patient.domain.objects.PDSAdvancedSearchRequest();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PDSAsyncRequest());
			if (domMap.get(key) != null)
			{
				return (ims.core.patient.domain.objects.PDSAdvancedSearchRequest)domMap.get(key);
			}
			domainObject = (ims.core.patient.domain.objects.PDSAdvancedSearchRequest) domainFactory.getDomainObject(ims.core.patient.domain.objects.PDSAdvancedSearchRequest.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PDSAsyncRequest());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSDSRoleProfileId() != null && valueObject.getSDSRoleProfileId().equals(""))
		{
			valueObject.setSDSRoleProfileId(null);
		}
		domainObject.setSDSRoleProfileId(valueObject.getSDSRoleProfileId());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSDSUserId() != null && valueObject.getSDSUserId().equals(""))
		{
			valueObject.setSDSUserId(null);
		}
		domainObject.setSDSUserId(valueObject.getSDSUserId());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getPDSAck() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getPDSAck().getID());
		}
		domainObject.setPDSAck(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getPDSAckDetailType() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getPDSAckDetailType().getID());
		}
		domainObject.setPDSAckDetailType(value4);
		domainObject.setActive(valueObject.getActive());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComment() != null && valueObject.getComment().equals(""))
		{
			valueObject.setComment(null);
		}
		domainObject.setComment(valueObject.getComment());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getRequestType() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getRequestType().getID());
		}
		domainObject.setRequestType(value7);
		ims.framework.utils.DateTime dateTime8 = valueObject.getRequestDate();
		java.util.Date value8 = null;
		if ( dateTime8 != null ) 
		{
			value8 = dateTime8.getJavaDate();
		}
		domainObject.setRequestDate(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getSearchStatus() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getSearchStatus().getID());
		}
		domainObject.setSearchStatus(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getSearchType() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getSearchType().getID());
		}
		domainObject.setSearchType(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getHistoricDataFlag() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getHistoricDataFlag().getID());
		}
		domainObject.setHistoricDataFlag(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getIgnoreHistoryIndicator() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getIgnoreHistoryIndicator().getID());
		}
		domainObject.setIgnoreHistoryIndicator(value12);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNHSNumber() != null && valueObject.getNHSNumber().equals(""))
		{
			valueObject.setNHSNumber(null);
		}
		domainObject.setNHSNumber(valueObject.getNHSNumber());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSurname() != null && valueObject.getSurname().equals(""))
		{
			valueObject.setSurname(null);
		}
		domainObject.setSurname(valueObject.getSurname());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getForename() != null && valueObject.getForename().equals(""))
		{
			valueObject.setForename(null);
		}
		domainObject.setForename(valueObject.getForename());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getGender() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getGender().getID());
		}
		domainObject.setGender(value16);
		java.util.Date value17 = null;
		ims.framework.utils.Date date17 = valueObject.getFromDateOfBirth();		
		if ( date17 != null ) 
		{
			value17 = date17.getDate();
		}
		domainObject.setFromDateOfBirth(value17);
		java.util.Date value18 = null;
		ims.framework.utils.Date date18 = valueObject.getToDateOfBirth();		
		if ( date18 != null ) 
		{
			value18 = date18.getDate();
		}
		domainObject.setToDateOfBirth(value18);
		java.util.Date value19 = null;
		ims.framework.utils.Date date19 = valueObject.getFromDateOfDeath();		
		if ( date19 != null ) 
		{
			value19 = date19.getDate();
		}
		domainObject.setFromDateOfDeath(value19);
		java.util.Date value20 = null;
		ims.framework.utils.Date date20 = valueObject.getToDateOfDeath();		
		if ( date20 != null ) 
		{
			value20 = date20.getDate();
		}
		domainObject.setToDateOfDeath(value20);
		domainObject.setSearchResult(ims.core.vo.domain.PDSAdvancedSearchResultVoAssembler.extractPDSAdvancedSearchResultList(domainFactory, valueObject.getSearchResult(), domainObject.getSearchResult(), domMap));		
		ims.choose_book.domain.objects.PDSConv value22 = null;
		if ( null != valueObject.getConvId() ) 
		{
			if (valueObject.getConvId().getBoId() == null)
			{
				if (domMap.get(valueObject.getConvId()) != null)
				{
					value22 = (ims.choose_book.domain.objects.PDSConv)domMap.get(valueObject.getConvId());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value22 = domainObject.getConvId();	
			}
			else
			{
				value22 = (ims.choose_book.domain.objects.PDSConv)domainFactory.getDomainObject(ims.choose_book.domain.objects.PDSConv.class, valueObject.getConvId().getBoId());
			}
		}
		domainObject.setConvId(value22);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.generic.domain.objects.Address value23 = null;
		if ( null != valueObject.getAddress() ) 
		{
			if (valueObject.getAddress().getBoId() == null)
			{
				if (domMap.get(valueObject.getAddress()) != null)
				{
					value23 = (ims.core.generic.domain.objects.Address)domMap.get(valueObject.getAddress());
				}
			}
			else
			{
				value23 = (ims.core.generic.domain.objects.Address)domainFactory.getDomainObject(ims.core.generic.domain.objects.Address.class, valueObject.getAddress().getBoId());
			}
		}
		domainObject.setAddress(value23);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getGpPracticeCode() != null && valueObject.getGpPracticeCode().equals(""))
		{
			valueObject.setGpPracticeCode(null);
		}
		domainObject.setGpPracticeCode(valueObject.getGpPracticeCode());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSDSJobRoleCode() != null && valueObject.getSDSJobRoleCode().equals(""))
		{
			valueObject.setSDSJobRoleCode(null);
		}
		domainObject.setSDSJobRoleCode(valueObject.getSDSJobRoleCode());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPostcode() != null && valueObject.getPostcode().equals(""))
		{
			valueObject.setPostcode(null);
		}
		domainObject.setPostcode(valueObject.getPostcode());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getMiddleName() != null && valueObject.getMiddleName().equals(""))
		{
			valueObject.setMiddleName(null);
		}
		domainObject.setMiddleName(valueObject.getMiddleName());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value28 = null;
		if ( null != valueObject.getDOBRangeUnit() ) 
		{
			value28 =
				domainFactory.getLookupInstance(valueObject.getDOBRangeUnit().getID());
		}
		domainObject.setDOBRangeUnit(value28);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value29 = null;
		if ( null != valueObject.getDODRangeUnit() ) 
		{
			value29 =
				domainFactory.getLookupInstance(valueObject.getDODRangeUnit().getID());
		}
		domainObject.setDODRangeUnit(value29);
		domainObject.setDOBRangeValue(valueObject.getDOBRangeValue());
		domainObject.setDODRangeValue(valueObject.getDODRangeValue());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value32 = null;
		if ( null != valueObject.getDOBPartialSearchBy() ) 
		{
			value32 =
				domainFactory.getLookupInstance(valueObject.getDOBPartialSearchBy().getID());
		}
		domainObject.setDOBPartialSearchBy(value32);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value33 = null;
		if ( null != valueObject.getDODPartialSearchBy() ) 
		{
			value33 =
				domainFactory.getLookupInstance(valueObject.getDODPartialSearchBy().getID());
		}
		domainObject.setDODPartialSearchBy(value33);

		return domainObject;
	}

}
