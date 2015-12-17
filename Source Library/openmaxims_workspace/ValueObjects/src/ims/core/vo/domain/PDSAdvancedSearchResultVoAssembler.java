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
public class PDSAdvancedSearchResultVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PDSAdvancedSearchResultVo copy(ims.core.vo.PDSAdvancedSearchResultVo valueObjectDest, ims.core.vo.PDSAdvancedSearchResultVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PDSAdvancedSearchResult(valueObjectSrc.getID_PDSAdvancedSearchResult());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// NHSNumber
		valueObjectDest.setNHSNumber(valueObjectSrc.getNHSNumber());
		// Surname
		valueObjectDest.setSurname(valueObjectSrc.getSurname());
		// UpperSurname
		valueObjectDest.setUpperSurname(valueObjectSrc.getUpperSurname());
		// Forename
		valueObjectDest.setForename(valueObjectSrc.getForename());
		// UpperForename
		valueObjectDest.setUpperForename(valueObjectSrc.getUpperForename());
		// PreferredName
		valueObjectDest.setPreferredName(valueObjectSrc.getPreferredName());
		// Gender
		valueObjectDest.setGender(valueObjectSrc.getGender());
		// DateOfBirth
		valueObjectDest.setDateOfBirth(valueObjectSrc.getDateOfBirth());
		// DateOfDeath
		valueObjectDest.setDateOfDeath(valueObjectSrc.getDateOfDeath());
		// PrimaryCareInfo
		valueObjectDest.setPrimaryCareInfo(valueObjectSrc.getPrimaryCareInfo());
		// confidentialityCode
		valueObjectDest.setConfidentialityCode(valueObjectSrc.getConfidentialityCode());
		// NHSNumberType
		valueObjectDest.setNHSNumberType(valueObjectSrc.getNHSNumberType());
		// Title
		valueObjectDest.setTitle(valueObjectSrc.getTitle());
		// nameType
		valueObjectDest.setNameType(valueObjectSrc.getNameType());
		// namesuffix
		valueObjectDest.setNamesuffix(valueObjectSrc.getNamesuffix());
		// PDSAddresses
		valueObjectDest.setPDSAddresses(valueObjectSrc.getPDSAddresses());
		// PDSTellecoms
		valueObjectDest.setPDSTellecoms(valueObjectSrc.getPDSTellecoms());
		// pdsErrCreationTime
		valueObjectDest.setPdsErrCreationTime(valueObjectSrc.getPdsErrCreationTime());
		// pdsErrInteractionId
		valueObjectDest.setPdsErrInteractionId(valueObjectSrc.getPdsErrInteractionId());
		// pdsErrProcessingCode
		valueObjectDest.setPdsErrProcessingCode(valueObjectSrc.getPdsErrProcessingCode());
		// pdsErrQueryResponseCode
		valueObjectDest.setPdsErrQueryResponseCode(valueObjectSrc.getPdsErrQueryResponseCode());
		// pdsErrId
		valueObjectDest.setPdsErrId(valueObjectSrc.getPdsErrId());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPDSAdvancedSearchResultVoCollectionFromPDSAdvancedSearchResult(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.PDSAdvancedSearchResult objects.
	 */
	public static ims.core.vo.PDSAdvancedSearchResultVoCollection createPDSAdvancedSearchResultVoCollectionFromPDSAdvancedSearchResult(java.util.Set domainObjectSet)	
	{
		return createPDSAdvancedSearchResultVoCollectionFromPDSAdvancedSearchResult(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.PDSAdvancedSearchResult objects.
	 */
	public static ims.core.vo.PDSAdvancedSearchResultVoCollection createPDSAdvancedSearchResultVoCollectionFromPDSAdvancedSearchResult(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PDSAdvancedSearchResultVoCollection voList = new ims.core.vo.PDSAdvancedSearchResultVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.patient.domain.objects.PDSAdvancedSearchResult domainObject = (ims.core.patient.domain.objects.PDSAdvancedSearchResult) iterator.next();
			ims.core.vo.PDSAdvancedSearchResultVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.patient.domain.objects.PDSAdvancedSearchResult objects.
	 */
	public static ims.core.vo.PDSAdvancedSearchResultVoCollection createPDSAdvancedSearchResultVoCollectionFromPDSAdvancedSearchResult(java.util.List domainObjectList) 
	{
		return createPDSAdvancedSearchResultVoCollectionFromPDSAdvancedSearchResult(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.patient.domain.objects.PDSAdvancedSearchResult objects.
	 */
	public static ims.core.vo.PDSAdvancedSearchResultVoCollection createPDSAdvancedSearchResultVoCollectionFromPDSAdvancedSearchResult(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PDSAdvancedSearchResultVoCollection voList = new ims.core.vo.PDSAdvancedSearchResultVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.patient.domain.objects.PDSAdvancedSearchResult domainObject = (ims.core.patient.domain.objects.PDSAdvancedSearchResult) domainObjectList.get(i);
			ims.core.vo.PDSAdvancedSearchResultVo vo = create(map, domainObject);

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
	 * Create the ims.core.patient.domain.objects.PDSAdvancedSearchResult set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPDSAdvancedSearchResultSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSAdvancedSearchResultVoCollection voCollection) 
	 {
	 	return extractPDSAdvancedSearchResultSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPDSAdvancedSearchResultSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSAdvancedSearchResultVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PDSAdvancedSearchResultVo vo = voCollection.get(i);
			ims.core.patient.domain.objects.PDSAdvancedSearchResult domainObject = PDSAdvancedSearchResultVoAssembler.extractPDSAdvancedSearchResult(domainFactory, vo, domMap);

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
	 * Create the ims.core.patient.domain.objects.PDSAdvancedSearchResult list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPDSAdvancedSearchResultList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSAdvancedSearchResultVoCollection voCollection) 
	 {
	 	return extractPDSAdvancedSearchResultList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPDSAdvancedSearchResultList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSAdvancedSearchResultVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PDSAdvancedSearchResultVo vo = voCollection.get(i);
			ims.core.patient.domain.objects.PDSAdvancedSearchResult domainObject = PDSAdvancedSearchResultVoAssembler.extractPDSAdvancedSearchResult(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.patient.domain.objects.PDSAdvancedSearchResult object.
	 * @param domainObject ims.core.patient.domain.objects.PDSAdvancedSearchResult
	 */
	 public static ims.core.vo.PDSAdvancedSearchResultVo create(ims.core.patient.domain.objects.PDSAdvancedSearchResult domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.patient.domain.objects.PDSAdvancedSearchResult object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PDSAdvancedSearchResultVo create(DomainObjectMap map, ims.core.patient.domain.objects.PDSAdvancedSearchResult domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PDSAdvancedSearchResultVo valueObject = (ims.core.vo.PDSAdvancedSearchResultVo) map.getValueObject(domainObject, ims.core.vo.PDSAdvancedSearchResultVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PDSAdvancedSearchResultVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.patient.domain.objects.PDSAdvancedSearchResult
	 */
	 public static ims.core.vo.PDSAdvancedSearchResultVo insert(ims.core.vo.PDSAdvancedSearchResultVo valueObject, ims.core.patient.domain.objects.PDSAdvancedSearchResult domainObject) 
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
	 * @param domainObject ims.core.patient.domain.objects.PDSAdvancedSearchResult
	 */
	 public static ims.core.vo.PDSAdvancedSearchResultVo insert(DomainObjectMap map, ims.core.vo.PDSAdvancedSearchResultVo valueObject, ims.core.patient.domain.objects.PDSAdvancedSearchResult domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PDSAdvancedSearchResult(domainObject.getId());
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
			
		// NHSNumber
		valueObject.setNHSNumber(domainObject.getNHSNumber());
		// Surname
		valueObject.setSurname(domainObject.getSurname());
		// UpperSurname
		valueObject.setUpperSurname(domainObject.getUpperSurname());
		// Forename
		valueObject.setForename(domainObject.getForename());
		// UpperForename
		valueObject.setUpperForename(domainObject.getUpperForename());
		// PreferredName
		valueObject.setPreferredName(domainObject.getPreferredName());
		// Gender
		ims.domain.lookups.LookupInstance instance7 = domainObject.getGender();
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

			ims.core.vo.lookups.Sex voLookup7 = new ims.core.vo.lookups.Sex(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.Sex parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.core.vo.lookups.Sex(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setGender(voLookup7);
		}
				// DateOfBirth
		java.util.Date DateOfBirth = domainObject.getDateOfBirth();
		if ( null != DateOfBirth ) 
		{
			valueObject.setDateOfBirth(new ims.framework.utils.Date(DateOfBirth) );
		}
		// DateOfDeath
		java.util.Date DateOfDeath = domainObject.getDateOfDeath();
		if ( null != DateOfDeath ) 
		{
			valueObject.setDateOfDeath(new ims.framework.utils.Date(DateOfDeath) );
		}
		// PrimaryCareInfo
		valueObject.setPrimaryCareInfo(domainObject.getPrimaryCareInfo());
		// confidentialityCode
		valueObject.setConfidentialityCode(domainObject.getConfidentialityCode());
		// NHSNumberType
		ims.domain.lookups.LookupInstance instance12 = domainObject.getNHSNumberType();
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

			ims.core.vo.lookups.PatIdType voLookup12 = new ims.core.vo.lookups.PatIdType(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.core.vo.lookups.PatIdType parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.core.vo.lookups.PatIdType(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setNHSNumberType(voLookup12);
		}
				// Title
		ims.domain.lookups.LookupInstance instance13 = domainObject.getTitle();
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

			ims.core.vo.lookups.PersonTitle voLookup13 = new ims.core.vo.lookups.PersonTitle(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.core.vo.lookups.PersonTitle parentVoLookup13 = voLookup13;
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
								parentVoLookup13.setParent(new ims.core.vo.lookups.PersonTitle(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setTitle(voLookup13);
		}
				// nameType
		ims.domain.lookups.LookupInstance instance14 = domainObject.getNameType();
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

			ims.core.vo.lookups.NameType voLookup14 = new ims.core.vo.lookups.NameType(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.core.vo.lookups.NameType parentVoLookup14 = voLookup14;
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
								parentVoLookup14.setParent(new ims.core.vo.lookups.NameType(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setNameType(voLookup14);
		}
				// namesuffix
		valueObject.setNamesuffix(domainObject.getNamesuffix());
		// PDSAddresses
		valueObject.setPDSAddresses(ims.core.vo.domain.PDSAddrVoAssembler.createPDSAddrVoCollectionFromPDSAddr(map, domainObject.getPDSAddresses()) );
		// PDSTellecoms
		valueObject.setPDSTellecoms(ims.core.vo.domain.PDSTelecomVoAssembler.createPDSTelecomVoCollectionFromPDSTel(map, domainObject.getPDSTellecoms()) );
		// pdsErrCreationTime
		java.util.Date pdsErrCreationTime = domainObject.getPdsErrCreationTime();
		if ( null != pdsErrCreationTime ) 
		{
			valueObject.setPdsErrCreationTime(new ims.framework.utils.DateTime(pdsErrCreationTime) );
		}
		// pdsErrInteractionId
		valueObject.setPdsErrInteractionId(domainObject.getPdsErrInteractionId());
		// pdsErrProcessingCode
		valueObject.setPdsErrProcessingCode(domainObject.getPdsErrProcessingCode());
		// pdsErrQueryResponseCode
		valueObject.setPdsErrQueryResponseCode(domainObject.getPdsErrQueryResponseCode());
		// pdsErrId
		valueObject.setPdsErrId(domainObject.getPdsErrId());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.patient.domain.objects.PDSAdvancedSearchResult extractPDSAdvancedSearchResult(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSAdvancedSearchResultVo valueObject) 
	{
		return 	extractPDSAdvancedSearchResult(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.patient.domain.objects.PDSAdvancedSearchResult extractPDSAdvancedSearchResult(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSAdvancedSearchResultVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PDSAdvancedSearchResult();
		ims.core.patient.domain.objects.PDSAdvancedSearchResult domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.patient.domain.objects.PDSAdvancedSearchResult)domMap.get(valueObject);
			}
			// ims.core.vo.PDSAdvancedSearchResultVo ID_PDSAdvancedSearchResult field is unknown
			domainObject = new ims.core.patient.domain.objects.PDSAdvancedSearchResult();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PDSAdvancedSearchResult());
			if (domMap.get(key) != null)
			{
				return (ims.core.patient.domain.objects.PDSAdvancedSearchResult)domMap.get(key);
			}
			domainObject = (ims.core.patient.domain.objects.PDSAdvancedSearchResult) domainFactory.getDomainObject(ims.core.patient.domain.objects.PDSAdvancedSearchResult.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PDSAdvancedSearchResult());

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
		if (valueObject.getUpperSurname() != null && valueObject.getUpperSurname().equals(""))
		{
			valueObject.setUpperSurname(null);
		}
		domainObject.setUpperSurname(valueObject.getUpperSurname());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getForename() != null && valueObject.getForename().equals(""))
		{
			valueObject.setForename(null);
		}
		domainObject.setForename(valueObject.getForename());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getUpperForename() != null && valueObject.getUpperForename().equals(""))
		{
			valueObject.setUpperForename(null);
		}
		domainObject.setUpperForename(valueObject.getUpperForename());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPreferredName() != null && valueObject.getPreferredName().equals(""))
		{
			valueObject.setPreferredName(null);
		}
		domainObject.setPreferredName(valueObject.getPreferredName());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getGender() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getGender().getID());
		}
		domainObject.setGender(value7);
		java.util.Date value8 = null;
		ims.framework.utils.Date date8 = valueObject.getDateOfBirth();		
		if ( date8 != null ) 
		{
			value8 = date8.getDate();
		}
		domainObject.setDateOfBirth(value8);
		java.util.Date value9 = null;
		ims.framework.utils.Date date9 = valueObject.getDateOfDeath();		
		if ( date9 != null ) 
		{
			value9 = date9.getDate();
		}
		domainObject.setDateOfDeath(value9);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPrimaryCareInfo() != null && valueObject.getPrimaryCareInfo().equals(""))
		{
			valueObject.setPrimaryCareInfo(null);
		}
		domainObject.setPrimaryCareInfo(valueObject.getPrimaryCareInfo());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getConfidentialityCode() != null && valueObject.getConfidentialityCode().equals(""))
		{
			valueObject.setConfidentialityCode(null);
		}
		domainObject.setConfidentialityCode(valueObject.getConfidentialityCode());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getNHSNumberType() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getNHSNumberType().getID());
		}
		domainObject.setNHSNumberType(value12);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getTitle() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getTitle().getID());
		}
		domainObject.setTitle(value13);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getNameType() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getNameType().getID());
		}
		domainObject.setNameType(value14);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNamesuffix() != null && valueObject.getNamesuffix().equals(""))
		{
			valueObject.setNamesuffix(null);
		}
		domainObject.setNamesuffix(valueObject.getNamesuffix());

		// SaveAsRefVO treated as RefValueObject
		ims.core.patient.vo.PDSAddrRefVoCollection refCollection16 = new ims.core.patient.vo.PDSAddrRefVoCollection();
		if (valueObject.getPDSAddresses() != null)
		{
			for (int i16=0; i16<valueObject.getPDSAddresses().size(); i16++)
			{
				ims.core.patient.vo.PDSAddrRefVo ref16 = (ims.core.patient.vo.PDSAddrRefVo)valueObject.getPDSAddresses().get(i16);
				refCollection16.add(ref16);
			}
		}
		int size16 = (null == refCollection16) ? 0 : refCollection16.size();		
		java.util.List domainPDSAddresses16 = domainObject.getPDSAddresses();
		if (domainPDSAddresses16 == null)
		{
			domainPDSAddresses16 = new java.util.ArrayList();
		}
		for(int i=0; i < size16; i++) 
		{
			ims.core.patient.vo.PDSAddrRefVo vo = refCollection16.get(i);			
			ims.core.patient.domain.objects.PDSAddr dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.patient.domain.objects.PDSAddr)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.patient.domain.objects.PDSAddr)domainFactory.getDomainObject( ims.core.patient.domain.objects.PDSAddr.class, vo.getBoId());
				}
			}

			int domIdx = domainPDSAddresses16.indexOf(dom);
			if (domIdx == -1)
			{
				domainPDSAddresses16.add(i, dom);
			}
			else if (i != domIdx && i < domainPDSAddresses16.size())
			{
				Object tmp = domainPDSAddresses16.get(i);
				domainPDSAddresses16.set(i, domainPDSAddresses16.get(domIdx));
				domainPDSAddresses16.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i16 = domainPDSAddresses16.size();
		while (i16 > size16)
		{
			domainPDSAddresses16.remove(i16-1);
			i16 = domainPDSAddresses16.size();
		}
		
		domainObject.setPDSAddresses(domainPDSAddresses16);		

		// SaveAsRefVO treated as RefValueObject
		ims.core.patient.vo.PDSTelRefVoCollection refCollection17 = new ims.core.patient.vo.PDSTelRefVoCollection();
		if (valueObject.getPDSTellecoms() != null)
		{
			for (int i17=0; i17<valueObject.getPDSTellecoms().size(); i17++)
			{
				ims.core.patient.vo.PDSTelRefVo ref17 = (ims.core.patient.vo.PDSTelRefVo)valueObject.getPDSTellecoms().get(i17);
				refCollection17.add(ref17);
			}
		}
		int size17 = (null == refCollection17) ? 0 : refCollection17.size();		
		java.util.List domainPDSTellecoms17 = domainObject.getPDSTellecoms();
		if (domainPDSTellecoms17 == null)
		{
			domainPDSTellecoms17 = new java.util.ArrayList();
		}
		for(int i=0; i < size17; i++) 
		{
			ims.core.patient.vo.PDSTelRefVo vo = refCollection17.get(i);			
			ims.core.patient.domain.objects.PDSTel dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.patient.domain.objects.PDSTel)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.patient.domain.objects.PDSTel)domainFactory.getDomainObject( ims.core.patient.domain.objects.PDSTel.class, vo.getBoId());
				}
			}

			int domIdx = domainPDSTellecoms17.indexOf(dom);
			if (domIdx == -1)
			{
				domainPDSTellecoms17.add(i, dom);
			}
			else if (i != domIdx && i < domainPDSTellecoms17.size())
			{
				Object tmp = domainPDSTellecoms17.get(i);
				domainPDSTellecoms17.set(i, domainPDSTellecoms17.get(domIdx));
				domainPDSTellecoms17.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i17 = domainPDSTellecoms17.size();
		while (i17 > size17)
		{
			domainPDSTellecoms17.remove(i17-1);
			i17 = domainPDSTellecoms17.size();
		}
		
		domainObject.setPDSTellecoms(domainPDSTellecoms17);		
		ims.framework.utils.DateTime dateTime18 = valueObject.getPdsErrCreationTime();
		java.util.Date value18 = null;
		if ( dateTime18 != null ) 
		{
			value18 = dateTime18.getJavaDate();
		}
		domainObject.setPdsErrCreationTime(value18);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPdsErrInteractionId() != null && valueObject.getPdsErrInteractionId().equals(""))
		{
			valueObject.setPdsErrInteractionId(null);
		}
		domainObject.setPdsErrInteractionId(valueObject.getPdsErrInteractionId());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPdsErrProcessingCode() != null && valueObject.getPdsErrProcessingCode().equals(""))
		{
			valueObject.setPdsErrProcessingCode(null);
		}
		domainObject.setPdsErrProcessingCode(valueObject.getPdsErrProcessingCode());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPdsErrQueryResponseCode() != null && valueObject.getPdsErrQueryResponseCode().equals(""))
		{
			valueObject.setPdsErrQueryResponseCode(null);
		}
		domainObject.setPdsErrQueryResponseCode(valueObject.getPdsErrQueryResponseCode());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPdsErrId() != null && valueObject.getPdsErrId().equals(""))
		{
			valueObject.setPdsErrId(null);
		}
		domainObject.setPdsErrId(valueObject.getPdsErrId());

		return domainObject;
	}

}
