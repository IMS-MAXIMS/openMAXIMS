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
 * @author Rory Fitzpatrick
 */
public class PASReferralVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PASReferralVo copy(ims.core.vo.PASReferralVo valueObjectDest, ims.core.vo.PASReferralVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Referral(valueObjectSrc.getID_Referral());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Details
		valueObjectDest.setDetails(valueObjectSrc.getDetails());
		// ReferralReceivedDate
		valueObjectDest.setReferralReceivedDate(valueObjectSrc.getReferralReceivedDate());
		// OriginalReferralDate
		valueObjectDest.setOriginalReferralDate(valueObjectSrc.getOriginalReferralDate());
		// FirstApptDate
		valueObjectDest.setFirstApptDate(valueObjectSrc.getFirstApptDate());
		// SourceOfReferral
		valueObjectDest.setSourceOfReferral(valueObjectSrc.getSourceOfReferral());
		// ReferringGP
		valueObjectDest.setReferringGP(valueObjectSrc.getReferringGP());
		// ReferringClinician
		valueObjectDest.setReferringClinician(valueObjectSrc.getReferringClinician());
		// ReferredTo
		valueObjectDest.setReferredTo(valueObjectSrc.getReferredTo());
		// ReferralDetails
		valueObjectDest.setReferralDetails(valueObjectSrc.getReferralDetails());
		// DateOfReferral
		valueObjectDest.setDateOfReferral(valueObjectSrc.getDateOfReferral());
		// ReferralLocation
		valueObjectDest.setReferralLocation(valueObjectSrc.getReferralLocation());
		// ReferralType
		valueObjectDest.setReferralType(valueObjectSrc.getReferralType());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPASReferralVoCollectionFromReferral(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.Referral objects.
	 */
	public static ims.core.vo.PASReferralVoCollection createPASReferralVoCollectionFromReferral(java.util.Set domainObjectSet)	
	{
		return createPASReferralVoCollectionFromReferral(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.Referral objects.
	 */
	public static ims.core.vo.PASReferralVoCollection createPASReferralVoCollectionFromReferral(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PASReferralVoCollection voList = new ims.core.vo.PASReferralVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.domain.objects.Referral domainObject = (ims.core.admin.domain.objects.Referral) iterator.next();
			ims.core.vo.PASReferralVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.domain.objects.Referral objects.
	 */
	public static ims.core.vo.PASReferralVoCollection createPASReferralVoCollectionFromReferral(java.util.List domainObjectList) 
	{
		return createPASReferralVoCollectionFromReferral(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.Referral objects.
	 */
	public static ims.core.vo.PASReferralVoCollection createPASReferralVoCollectionFromReferral(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PASReferralVoCollection voList = new ims.core.vo.PASReferralVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.Referral domainObject = (ims.core.admin.domain.objects.Referral) domainObjectList.get(i);
			ims.core.vo.PASReferralVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.domain.objects.Referral set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractReferralSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PASReferralVoCollection voCollection) 
	 {
	 	return extractReferralSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractReferralSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PASReferralVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PASReferralVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.Referral domainObject = PASReferralVoAssembler.extractReferral(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.domain.objects.Referral list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractReferralList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PASReferralVoCollection voCollection) 
	 {
	 	return extractReferralList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractReferralList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PASReferralVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PASReferralVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.Referral domainObject = PASReferralVoAssembler.extractReferral(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.domain.objects.Referral object.
	 * @param domainObject ims.core.admin.domain.objects.Referral
	 */
	 public static ims.core.vo.PASReferralVo create(ims.core.admin.domain.objects.Referral domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.domain.objects.Referral object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PASReferralVo create(DomainObjectMap map, ims.core.admin.domain.objects.Referral domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PASReferralVo valueObject = (ims.core.vo.PASReferralVo) map.getValueObject(domainObject, ims.core.vo.PASReferralVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PASReferralVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.domain.objects.Referral
	 */
	 public static ims.core.vo.PASReferralVo insert(ims.core.vo.PASReferralVo valueObject, ims.core.admin.domain.objects.Referral domainObject) 
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
	 * @param domainObject ims.core.admin.domain.objects.Referral
	 */
	 public static ims.core.vo.PASReferralVo insert(DomainObjectMap map, ims.core.vo.PASReferralVo valueObject, ims.core.admin.domain.objects.Referral domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Referral(domainObject.getId());
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
			
		// Details
		valueObject.setDetails(domainObject.getDetails());
		// ReferralReceivedDate
		java.util.Date ReferralReceivedDate = domainObject.getReferralReceivedDate();
		if ( null != ReferralReceivedDate ) 
		{
			valueObject.setReferralReceivedDate(new ims.framework.utils.Date(ReferralReceivedDate) );
		}
		// OriginalReferralDate
		java.util.Date OriginalReferralDate = domainObject.getOriginalReferralDate();
		if ( null != OriginalReferralDate ) 
		{
			valueObject.setOriginalReferralDate(new ims.framework.utils.Date(OriginalReferralDate) );
		}
		// FirstApptDate
		java.util.Date FirstApptDate = domainObject.getFirstApptDate();
		if ( null != FirstApptDate ) 
		{
			valueObject.setFirstApptDate(new ims.framework.utils.DateTime(FirstApptDate) );
		}
		// SourceOfReferral
		ims.domain.lookups.LookupInstance instance5 = domainObject.getSourceOfReferral();
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

			ims.core.vo.lookups.SourceOfReferral voLookup5 = new ims.core.vo.lookups.SourceOfReferral(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.SourceOfReferral parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.SourceOfReferral(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setSourceOfReferral(voLookup5);
		}
				// ReferringGP
		valueObject.setReferringGP(ims.core.vo.domain.GpLiteVoAssembler.create(map, domainObject.getReferringGP()) );
		// ReferringClinician
		valueObject.setReferringClinician(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getReferringClinician()) );
		// ReferredTo
		valueObject.setReferredTo(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getReferredTo()) );
		// ReferralDetails
		valueObject.setReferralDetails(domainObject.getReferralDetails());
		// DateOfReferral
		java.util.Date DateOfReferral = domainObject.getDateOfReferral();
		if ( null != DateOfReferral ) 
		{
			valueObject.setDateOfReferral(new ims.framework.utils.Date(DateOfReferral) );
		}
		// ReferralLocation
		valueObject.setReferralLocation(domainObject.getReferralLocation());
		// ReferralType
		ims.domain.lookups.LookupInstance instance12 = domainObject.getReferralType();
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

			ims.core.vo.lookups.ReferralType voLookup12 = new ims.core.vo.lookups.ReferralType(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.core.vo.lookups.ReferralType parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.core.vo.lookups.ReferralType(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setReferralType(voLookup12);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.Referral extractReferral(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PASReferralVo valueObject) 
	{
		return 	extractReferral(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.Referral extractReferral(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PASReferralVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Referral();
		ims.core.admin.domain.objects.Referral domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.domain.objects.Referral)domMap.get(valueObject);
			}
			// ims.core.vo.PASReferralVo ID_Referral field is unknown
			domainObject = new ims.core.admin.domain.objects.Referral();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Referral());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.domain.objects.Referral)domMap.get(key);
			}
			domainObject = (ims.core.admin.domain.objects.Referral) domainFactory.getDomainObject(ims.core.admin.domain.objects.Referral.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Referral());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDetails() != null && valueObject.getDetails().equals(""))
		{
			valueObject.setDetails(null);
		}
		domainObject.setDetails(valueObject.getDetails());
		java.util.Date value2 = null;
		ims.framework.utils.Date date2 = valueObject.getReferralReceivedDate();		
		if ( date2 != null ) 
		{
			value2 = date2.getDate();
		}
		domainObject.setReferralReceivedDate(value2);
		java.util.Date value3 = null;
		ims.framework.utils.Date date3 = valueObject.getOriginalReferralDate();		
		if ( date3 != null ) 
		{
			value3 = date3.getDate();
		}
		domainObject.setOriginalReferralDate(value3);
		ims.framework.utils.DateTime dateTime4 = valueObject.getFirstApptDate();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setFirstApptDate(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getSourceOfReferral() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getSourceOfReferral().getID());
		}
		domainObject.setSourceOfReferral(value5);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Gp value6 = null;
		if ( null != valueObject.getReferringGP() ) 
		{
			if (valueObject.getReferringGP().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferringGP()) != null)
				{
					value6 = (ims.core.resource.people.domain.objects.Gp)domMap.get(valueObject.getReferringGP());
				}
			}
			else
			{
				value6 = (ims.core.resource.people.domain.objects.Gp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Gp.class, valueObject.getReferringGP().getBoId());
			}
		}
		domainObject.setReferringGP(value6);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value7 = null;
		if ( null != valueObject.getReferringClinician() ) 
		{
			if (valueObject.getReferringClinician().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferringClinician()) != null)
				{
					value7 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getReferringClinician());
				}
			}
			else
			{
				value7 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getReferringClinician().getBoId());
			}
		}
		domainObject.setReferringClinician(value7);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value8 = null;
		if ( null != valueObject.getReferredTo() ) 
		{
			if (valueObject.getReferredTo().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferredTo()) != null)
				{
					value8 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getReferredTo());
				}
			}
			else
			{
				value8 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getReferredTo().getBoId());
			}
		}
		domainObject.setReferredTo(value8);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReferralDetails() != null && valueObject.getReferralDetails().equals(""))
		{
			valueObject.setReferralDetails(null);
		}
		domainObject.setReferralDetails(valueObject.getReferralDetails());
		java.util.Date value10 = null;
		ims.framework.utils.Date date10 = valueObject.getDateOfReferral();		
		if ( date10 != null ) 
		{
			value10 = date10.getDate();
		}
		domainObject.setDateOfReferral(value10);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReferralLocation() != null && valueObject.getReferralLocation().equals(""))
		{
			valueObject.setReferralLocation(null);
		}
		domainObject.setReferralLocation(valueObject.getReferralLocation());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getReferralType() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getReferralType().getID());
		}
		domainObject.setReferralType(value12);

		return domainObject;
	}

}
