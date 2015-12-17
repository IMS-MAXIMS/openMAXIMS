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
 * Generated on 12/10/2015, 13:25
 *
 */
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Sean Nesbitt
 */
public class PDSBatchTraceItemsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PDSBatchTraceItemsVo copy(ims.core.vo.PDSBatchTraceItemsVo valueObjectDest, ims.core.vo.PDSBatchTraceItemsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PDSBatchTraceParams(valueObjectSrc.getID_PDSBatchTraceParams());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// NHSNumber
		valueObjectDest.setNHSNumber(valueObjectSrc.getNHSNumber());
		// surname
		valueObjectDest.setSurname(valueObjectSrc.getSurname());
		// forename
		valueObjectDest.setForename(valueObjectSrc.getForename());
		// dateOfBirth
		valueObjectDest.setDateOfBirth(valueObjectSrc.getDateOfBirth());
		// gender
		valueObjectDest.setGender(valueObjectSrc.getGender());
		// dateOfDeathFrom
		valueObjectDest.setDateOfDeathFrom(valueObjectSrc.getDateOfDeathFrom());
		// dateOfDeathTo
		valueObjectDest.setDateOfDeathTo(valueObjectSrc.getDateOfDeathTo());
		// postCode
		valueObjectDest.setPostCode(valueObjectSrc.getPostCode());
		// pafKey
		valueObjectDest.setPafKey(valueObjectSrc.getPafKey());
		// addressLines
		valueObjectDest.setAddressLines(valueObjectSrc.getAddressLines());
		// gpPracticeCode
		valueObjectDest.setGpPracticeCode(valueObjectSrc.getGpPracticeCode());
		// status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// errorReason
		valueObjectDest.setErrorReason(valueObjectSrc.getErrorReason());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPDSBatchTraceItemsVoCollectionFromPDSBatchTraceParams(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.PDSBatchTraceParams objects.
	 */
	public static ims.core.vo.PDSBatchTraceItemsVoCollection createPDSBatchTraceItemsVoCollectionFromPDSBatchTraceParams(java.util.Set domainObjectSet)	
	{
		return createPDSBatchTraceItemsVoCollectionFromPDSBatchTraceParams(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.PDSBatchTraceParams objects.
	 */
	public static ims.core.vo.PDSBatchTraceItemsVoCollection createPDSBatchTraceItemsVoCollectionFromPDSBatchTraceParams(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PDSBatchTraceItemsVoCollection voList = new ims.core.vo.PDSBatchTraceItemsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.patient.domain.objects.PDSBatchTraceParams domainObject = (ims.core.patient.domain.objects.PDSBatchTraceParams) iterator.next();
			ims.core.vo.PDSBatchTraceItemsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.patient.domain.objects.PDSBatchTraceParams objects.
	 */
	public static ims.core.vo.PDSBatchTraceItemsVoCollection createPDSBatchTraceItemsVoCollectionFromPDSBatchTraceParams(java.util.List domainObjectList) 
	{
		return createPDSBatchTraceItemsVoCollectionFromPDSBatchTraceParams(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.patient.domain.objects.PDSBatchTraceParams objects.
	 */
	public static ims.core.vo.PDSBatchTraceItemsVoCollection createPDSBatchTraceItemsVoCollectionFromPDSBatchTraceParams(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PDSBatchTraceItemsVoCollection voList = new ims.core.vo.PDSBatchTraceItemsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.patient.domain.objects.PDSBatchTraceParams domainObject = (ims.core.patient.domain.objects.PDSBatchTraceParams) domainObjectList.get(i);
			ims.core.vo.PDSBatchTraceItemsVo vo = create(map, domainObject);

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
	 * Create the ims.core.patient.domain.objects.PDSBatchTraceParams set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPDSBatchTraceParamsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSBatchTraceItemsVoCollection voCollection) 
	 {
	 	return extractPDSBatchTraceParamsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPDSBatchTraceParamsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSBatchTraceItemsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PDSBatchTraceItemsVo vo = voCollection.get(i);
			ims.core.patient.domain.objects.PDSBatchTraceParams domainObject = PDSBatchTraceItemsVoAssembler.extractPDSBatchTraceParams(domainFactory, vo, domMap);

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
	 * Create the ims.core.patient.domain.objects.PDSBatchTraceParams list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPDSBatchTraceParamsList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSBatchTraceItemsVoCollection voCollection) 
	 {
	 	return extractPDSBatchTraceParamsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPDSBatchTraceParamsList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSBatchTraceItemsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PDSBatchTraceItemsVo vo = voCollection.get(i);
			ims.core.patient.domain.objects.PDSBatchTraceParams domainObject = PDSBatchTraceItemsVoAssembler.extractPDSBatchTraceParams(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.patient.domain.objects.PDSBatchTraceParams object.
	 * @param domainObject ims.core.patient.domain.objects.PDSBatchTraceParams
	 */
	 public static ims.core.vo.PDSBatchTraceItemsVo create(ims.core.patient.domain.objects.PDSBatchTraceParams domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.patient.domain.objects.PDSBatchTraceParams object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PDSBatchTraceItemsVo create(DomainObjectMap map, ims.core.patient.domain.objects.PDSBatchTraceParams domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PDSBatchTraceItemsVo valueObject = (ims.core.vo.PDSBatchTraceItemsVo) map.getValueObject(domainObject, ims.core.vo.PDSBatchTraceItemsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PDSBatchTraceItemsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.patient.domain.objects.PDSBatchTraceParams
	 */
	 public static ims.core.vo.PDSBatchTraceItemsVo insert(ims.core.vo.PDSBatchTraceItemsVo valueObject, ims.core.patient.domain.objects.PDSBatchTraceParams domainObject) 
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
	 * @param domainObject ims.core.patient.domain.objects.PDSBatchTraceParams
	 */
	 public static ims.core.vo.PDSBatchTraceItemsVo insert(DomainObjectMap map, ims.core.vo.PDSBatchTraceItemsVo valueObject, ims.core.patient.domain.objects.PDSBatchTraceParams domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PDSBatchTraceParams(domainObject.getId());
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
		// surname
		valueObject.setSurname(domainObject.getSurname());
		// forename
		valueObject.setForename(domainObject.getForename());
		// dateOfBirth
		java.util.Date dateOfBirth = domainObject.getDateOfBirth();
		if ( null != dateOfBirth ) 
		{
			valueObject.setDateOfBirth(new ims.framework.utils.Date(dateOfBirth) );
		}
		// gender
		ims.domain.lookups.LookupInstance instance5 = domainObject.getGender();
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

			ims.core.vo.lookups.Sex voLookup5 = new ims.core.vo.lookups.Sex(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.Sex parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.Sex(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setGender(voLookup5);
		}
				// dateOfDeathFrom
		java.util.Date dateOfDeathFrom = domainObject.getDateOfDeathFrom();
		if ( null != dateOfDeathFrom ) 
		{
			valueObject.setDateOfDeathFrom(new ims.framework.utils.Date(dateOfDeathFrom) );
		}
		// dateOfDeathTo
		java.util.Date dateOfDeathTo = domainObject.getDateOfDeathTo();
		if ( null != dateOfDeathTo ) 
		{
			valueObject.setDateOfDeathTo(new ims.framework.utils.Date(dateOfDeathTo) );
		}
		// postCode
		valueObject.setPostCode(domainObject.getPostCode());
		// pafKey
		valueObject.setPafKey(domainObject.getPafKey());
		// addressLines
		if (domainObject.getAddressLines() != null)
		{
			if(domainObject.getAddressLines() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAddressLines();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAddressLines(new ims.core.patient.vo.PDSAddrRefVo(id, -1));				
			}
			else
			{
				valueObject.setAddressLines(new ims.core.patient.vo.PDSAddrRefVo(domainObject.getAddressLines().getId(), domainObject.getAddressLines().getVersion()));
			}
		}
		// gpPracticeCode
		valueObject.setGpPracticeCode(domainObject.getGpPracticeCode());
		// status
		ims.domain.lookups.LookupInstance instance12 = domainObject.getStatus();
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

			ims.core.vo.lookups.PDSSearchStatus voLookup12 = new ims.core.vo.lookups.PDSSearchStatus(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.core.vo.lookups.PDSSearchStatus parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.core.vo.lookups.PDSSearchStatus(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setStatus(voLookup12);
		}
				// errorReason
		valueObject.setErrorReason(domainObject.getErrorReason());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.patient.domain.objects.PDSBatchTraceParams extractPDSBatchTraceParams(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSBatchTraceItemsVo valueObject) 
	{
		return 	extractPDSBatchTraceParams(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.patient.domain.objects.PDSBatchTraceParams extractPDSBatchTraceParams(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSBatchTraceItemsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PDSBatchTraceParams();
		ims.core.patient.domain.objects.PDSBatchTraceParams domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.patient.domain.objects.PDSBatchTraceParams)domMap.get(valueObject);
			}
			// ims.core.vo.PDSBatchTraceItemsVo ID_PDSBatchTraceParams field is unknown
			domainObject = new ims.core.patient.domain.objects.PDSBatchTraceParams();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PDSBatchTraceParams());
			if (domMap.get(key) != null)
			{
				return (ims.core.patient.domain.objects.PDSBatchTraceParams)domMap.get(key);
			}
			domainObject = (ims.core.patient.domain.objects.PDSBatchTraceParams) domainFactory.getDomainObject(ims.core.patient.domain.objects.PDSBatchTraceParams.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PDSBatchTraceParams());

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
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getDateOfBirth();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setDateOfBirth(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getGender() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getGender().getID());
		}
		domainObject.setGender(value5);
		java.util.Date value6 = null;
		ims.framework.utils.Date date6 = valueObject.getDateOfDeathFrom();		
		if ( date6 != null ) 
		{
			value6 = date6.getDate();
		}
		domainObject.setDateOfDeathFrom(value6);
		java.util.Date value7 = null;
		ims.framework.utils.Date date7 = valueObject.getDateOfDeathTo();		
		if ( date7 != null ) 
		{
			value7 = date7.getDate();
		}
		domainObject.setDateOfDeathTo(value7);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPostCode() != null && valueObject.getPostCode().equals(""))
		{
			valueObject.setPostCode(null);
		}
		domainObject.setPostCode(valueObject.getPostCode());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPafKey() != null && valueObject.getPafKey().equals(""))
		{
			valueObject.setPafKey(null);
		}
		domainObject.setPafKey(valueObject.getPafKey());
		ims.core.patient.domain.objects.PDSAddr value10 = null;
		if ( null != valueObject.getAddressLines() ) 
		{
			if (valueObject.getAddressLines().getBoId() == null)
			{
				if (domMap.get(valueObject.getAddressLines()) != null)
				{
					value10 = (ims.core.patient.domain.objects.PDSAddr)domMap.get(valueObject.getAddressLines());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value10 = domainObject.getAddressLines();	
			}
			else
			{
				value10 = (ims.core.patient.domain.objects.PDSAddr)domainFactory.getDomainObject(ims.core.patient.domain.objects.PDSAddr.class, valueObject.getAddressLines().getBoId());
			}
		}
		domainObject.setAddressLines(value10);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getGpPracticeCode() != null && valueObject.getGpPracticeCode().equals(""))
		{
			valueObject.setGpPracticeCode(null);
		}
		domainObject.setGpPracticeCode(valueObject.getGpPracticeCode());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value12);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getErrorReason() != null && valueObject.getErrorReason().equals(""))
		{
			valueObject.setErrorReason(null);
		}
		domainObject.setErrorReason(valueObject.getErrorReason());

		return domainObject;
	}

}
