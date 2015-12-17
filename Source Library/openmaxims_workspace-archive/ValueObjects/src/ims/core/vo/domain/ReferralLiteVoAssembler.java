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
 * @author Marius Mihalec
 */
public class ReferralLiteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.ReferralLiteVo copy(ims.core.vo.ReferralLiteVo valueObjectDest, ims.core.vo.ReferralLiteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Referral(valueObjectSrc.getID_Referral());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ReferralType
		valueObjectDest.setReferralType(valueObjectSrc.getReferralType());
		// Details
		valueObjectDest.setDetails(valueObjectSrc.getDetails());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// ExtReferralKey
		valueObjectDest.setExtReferralKey(valueObjectSrc.getExtReferralKey());
		// ClockId
		valueObjectDest.setClockId(valueObjectSrc.getClockId());
		// AuthoringDateTime
		valueObjectDest.setAuthoringDateTime(valueObjectSrc.getAuthoringDateTime());
		// ReferralReceivedDate
		valueObjectDest.setReferralReceivedDate(valueObjectSrc.getReferralReceivedDate());
		// OriginalReferralDate
		valueObjectDest.setOriginalReferralDate(valueObjectSrc.getOriginalReferralDate());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createReferralLiteVoCollectionFromReferral(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.Referral objects.
	 */
	public static ims.core.vo.ReferralLiteVoCollection createReferralLiteVoCollectionFromReferral(java.util.Set domainObjectSet)	
	{
		return createReferralLiteVoCollectionFromReferral(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.Referral objects.
	 */
	public static ims.core.vo.ReferralLiteVoCollection createReferralLiteVoCollectionFromReferral(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.ReferralLiteVoCollection voList = new ims.core.vo.ReferralLiteVoCollection();
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
			ims.core.vo.ReferralLiteVo vo = create(map, domainObject);
			
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
	public static ims.core.vo.ReferralLiteVoCollection createReferralLiteVoCollectionFromReferral(java.util.List domainObjectList) 
	{
		return createReferralLiteVoCollectionFromReferral(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.Referral objects.
	 */
	public static ims.core.vo.ReferralLiteVoCollection createReferralLiteVoCollectionFromReferral(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.ReferralLiteVoCollection voList = new ims.core.vo.ReferralLiteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.Referral domainObject = (ims.core.admin.domain.objects.Referral) domainObjectList.get(i);
			ims.core.vo.ReferralLiteVo vo = create(map, domainObject);

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
	 public static java.util.Set extractReferralSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ReferralLiteVoCollection voCollection) 
	 {
	 	return extractReferralSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractReferralSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ReferralLiteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.ReferralLiteVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.Referral domainObject = ReferralLiteVoAssembler.extractReferral(domainFactory, vo, domMap);

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
	 public static java.util.List extractReferralList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ReferralLiteVoCollection voCollection) 
	 {
	 	return extractReferralList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractReferralList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ReferralLiteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.ReferralLiteVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.Referral domainObject = ReferralLiteVoAssembler.extractReferral(domainFactory, vo, domMap);

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
	 public static ims.core.vo.ReferralLiteVo create(ims.core.admin.domain.objects.Referral domainObject) 
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
	  public static ims.core.vo.ReferralLiteVo create(DomainObjectMap map, ims.core.admin.domain.objects.Referral domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.ReferralLiteVo valueObject = (ims.core.vo.ReferralLiteVo) map.getValueObject(domainObject, ims.core.vo.ReferralLiteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.ReferralLiteVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.core.vo.ReferralLiteVo insert(ims.core.vo.ReferralLiteVo valueObject, ims.core.admin.domain.objects.Referral domainObject) 
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
	 public static ims.core.vo.ReferralLiteVo insert(DomainObjectMap map, ims.core.vo.ReferralLiteVo valueObject, ims.core.admin.domain.objects.Referral domainObject) 
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
			
		// ReferralType
		ims.domain.lookups.LookupInstance instance1 = domainObject.getReferralType();
		if ( null != instance1 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance1.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance1.getImage().getImageId(), instance1.getImage().getImagePath());
			}
			color = instance1.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.ReferralType voLookup1 = new ims.core.vo.lookups.ReferralType(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.ReferralType parentVoLookup1 = voLookup1;
			ims.domain.lookups.LookupInstance parent1 = instance1.getParent();
			while (parent1 != null)
			{
				if (parent1.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent1.getImage().getImageId(), parent1.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent1.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup1.setParent(new ims.core.vo.lookups.ReferralType(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setReferralType(voLookup1);
		}
				// Details
		valueObject.setDetails(domainObject.getDetails());
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
		// ExtReferralKey
		valueObject.setExtReferralKey(domainObject.getExtReferralKey());
		// ClockId
		valueObject.setClockId(domainObject.getClockId());
		// AuthoringDateTime
		java.util.Date AuthoringDateTime = domainObject.getAuthoringDateTime();
		if ( null != AuthoringDateTime ) 
		{
			valueObject.setAuthoringDateTime(new ims.framework.utils.DateTime(AuthoringDateTime) );
		}
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
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.Referral extractReferral(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ReferralLiteVo valueObject) 
	{
		return 	extractReferral(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.Referral extractReferral(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ReferralLiteVo valueObject, HashMap domMap) 
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
			// ims.core.vo.ReferralLiteVo ID_Referral field is unknown
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

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getReferralType() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getReferralType().getID());
		}
		domainObject.setReferralType(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDetails() != null && valueObject.getDetails().equals(""))
		{
			valueObject.setDetails(null);
		}
		domainObject.setDetails(valueObject.getDetails());
		ims.core.patient.domain.objects.Patient value3 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value3 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getPatient();	
			}
			else
			{
				value3 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getExtReferralKey() != null && valueObject.getExtReferralKey().equals(""))
		{
			valueObject.setExtReferralKey(null);
		}
		domainObject.setExtReferralKey(valueObject.getExtReferralKey());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getClockId() != null && valueObject.getClockId().equals(""))
		{
			valueObject.setClockId(null);
		}
		domainObject.setClockId(valueObject.getClockId());
		ims.framework.utils.DateTime dateTime6 = valueObject.getAuthoringDateTime();
		java.util.Date value6 = null;
		if ( dateTime6 != null ) 
		{
			value6 = dateTime6.getJavaDate();
		}
		domainObject.setAuthoringDateTime(value6);
		java.util.Date value7 = null;
		ims.framework.utils.Date date7 = valueObject.getReferralReceivedDate();		
		if ( date7 != null ) 
		{
			value7 = date7.getDate();
		}
		domainObject.setReferralReceivedDate(value7);
		java.util.Date value8 = null;
		ims.framework.utils.Date date8 = valueObject.getOriginalReferralDate();		
		if ( date8 != null ) 
		{
			value8 = date8.getDate();
		}
		domainObject.setOriginalReferralDate(value8);

		return domainObject;
	}

}
