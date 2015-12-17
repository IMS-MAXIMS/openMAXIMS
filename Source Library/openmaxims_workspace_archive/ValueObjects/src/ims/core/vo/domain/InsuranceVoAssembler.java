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
 * @author John MacEnri
 */
public class InsuranceVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.InsuranceVo copy(ims.core.vo.InsuranceVo valueObjectDest, ims.core.vo.InsuranceVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Insurance(valueObjectSrc.getID_Insurance());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// MedicalCardNo
		valueObjectDest.setMedicalCardNo(valueObjectSrc.getMedicalCardNo());
		// HealthActCategory
		valueObjectDest.setHealthActCategory(valueObjectSrc.getHealthActCategory());
		// EHICNumber
		valueObjectDest.setEHICNumber(valueObjectSrc.getEHICNumber());
		// EHICExpiryDate
		valueObjectDest.setEHICExpiryDate(valueObjectSrc.getEHICExpiryDate());
		// EHICCountry
		valueObjectDest.setEHICCountry(valueObjectSrc.getEHICCountry());
		// EHICInstitution
		valueObjectDest.setEHICInstitution(valueObjectSrc.getEHICInstitution());
		// MedicalCardProved
		valueObjectDest.setMedicalCardProved(valueObjectSrc.getMedicalCardProved());
		// EligibilityProof
		valueObjectDest.setEligibilityProof(valueObjectSrc.getEligibilityProof());
		// MedicalCardExpiryDate
		valueObjectDest.setMedicalCardExpiryDate(valueObjectSrc.getMedicalCardExpiryDate());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createInsuranceVoCollectionFromInsurance(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.Insurance objects.
	 */
	public static ims.core.vo.InsuranceVoCollection createInsuranceVoCollectionFromInsurance(java.util.Set domainObjectSet)	
	{
		return createInsuranceVoCollectionFromInsurance(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.Insurance objects.
	 */
	public static ims.core.vo.InsuranceVoCollection createInsuranceVoCollectionFromInsurance(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.InsuranceVoCollection voList = new ims.core.vo.InsuranceVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.patient.domain.objects.Insurance domainObject = (ims.core.patient.domain.objects.Insurance) iterator.next();
			ims.core.vo.InsuranceVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.patient.domain.objects.Insurance objects.
	 */
	public static ims.core.vo.InsuranceVoCollection createInsuranceVoCollectionFromInsurance(java.util.List domainObjectList) 
	{
		return createInsuranceVoCollectionFromInsurance(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.patient.domain.objects.Insurance objects.
	 */
	public static ims.core.vo.InsuranceVoCollection createInsuranceVoCollectionFromInsurance(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.InsuranceVoCollection voList = new ims.core.vo.InsuranceVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.patient.domain.objects.Insurance domainObject = (ims.core.patient.domain.objects.Insurance) domainObjectList.get(i);
			ims.core.vo.InsuranceVo vo = create(map, domainObject);

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
	 * Create the ims.core.patient.domain.objects.Insurance set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractInsuranceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.InsuranceVoCollection voCollection) 
	 {
	 	return extractInsuranceSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractInsuranceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.InsuranceVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.InsuranceVo vo = voCollection.get(i);
			ims.core.patient.domain.objects.Insurance domainObject = InsuranceVoAssembler.extractInsurance(domainFactory, vo, domMap);

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
	 * Create the ims.core.patient.domain.objects.Insurance list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractInsuranceList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.InsuranceVoCollection voCollection) 
	 {
	 	return extractInsuranceList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractInsuranceList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.InsuranceVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.InsuranceVo vo = voCollection.get(i);
			ims.core.patient.domain.objects.Insurance domainObject = InsuranceVoAssembler.extractInsurance(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.patient.domain.objects.Insurance object.
	 * @param domainObject ims.core.patient.domain.objects.Insurance
	 */
	 public static ims.core.vo.InsuranceVo create(ims.core.patient.domain.objects.Insurance domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.patient.domain.objects.Insurance object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.InsuranceVo create(DomainObjectMap map, ims.core.patient.domain.objects.Insurance domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.InsuranceVo valueObject = (ims.core.vo.InsuranceVo) map.getValueObject(domainObject, ims.core.vo.InsuranceVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.InsuranceVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.patient.domain.objects.Insurance
	 */
	 public static ims.core.vo.InsuranceVo insert(ims.core.vo.InsuranceVo valueObject, ims.core.patient.domain.objects.Insurance domainObject) 
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
	 * @param domainObject ims.core.patient.domain.objects.Insurance
	 */
	 public static ims.core.vo.InsuranceVo insert(DomainObjectMap map, ims.core.vo.InsuranceVo valueObject, ims.core.patient.domain.objects.Insurance domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Insurance(domainObject.getId());
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
			
		// MedicalCardNo
		valueObject.setMedicalCardNo(domainObject.getMedicalCardNo());
		// HealthActCategory
		ims.domain.lookups.LookupInstance instance2 = domainObject.getHealthActCategory();
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

			ims.core.vo.lookups.PersonHealthActCategory voLookup2 = new ims.core.vo.lookups.PersonHealthActCategory(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.PersonHealthActCategory parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.PersonHealthActCategory(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setHealthActCategory(voLookup2);
		}
				// EHICNumber
		valueObject.setEHICNumber(domainObject.getEHICNumber());
		// EHICExpiryDate
		Integer EHICExpiryDate = domainObject.getEHICExpiryDate();
		if ( null != EHICExpiryDate ) 
		{
			valueObject.setEHICExpiryDate(new ims.framework.utils.PartialDate(EHICExpiryDate) );
		}
		// EHICCountry
		ims.domain.lookups.LookupInstance instance5 = domainObject.getEHICCountry();
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

			ims.core.vo.lookups.Country voLookup5 = new ims.core.vo.lookups.Country(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.Country parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.Country(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setEHICCountry(voLookup5);
		}
				// EHICInstitution
		valueObject.setEHICInstitution(domainObject.getEHICInstitution());
		// MedicalCardProved
		ims.domain.lookups.LookupInstance instance7 = domainObject.getMedicalCardProved();
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

			ims.core.vo.lookups.YesNo voLookup7 = new ims.core.vo.lookups.YesNo(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.core.vo.lookups.YesNo(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setMedicalCardProved(voLookup7);
		}
				// EligibilityProof
		valueObject.setEligibilityProof(domainObject.getEligibilityProof());
		// MedicalCardExpiryDate
		Integer MedicalCardExpiryDate = domainObject.getMedicalCardExpiryDate();
		if ( null != MedicalCardExpiryDate ) 
		{
			valueObject.setMedicalCardExpiryDate(new ims.framework.utils.PartialDate(MedicalCardExpiryDate) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.patient.domain.objects.Insurance extractInsurance(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.InsuranceVo valueObject) 
	{
		return 	extractInsurance(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.patient.domain.objects.Insurance extractInsurance(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.InsuranceVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Insurance();
		ims.core.patient.domain.objects.Insurance domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.patient.domain.objects.Insurance)domMap.get(valueObject);
			}
			// ims.core.vo.InsuranceVo ID_Insurance field is unknown
			domainObject = new ims.core.patient.domain.objects.Insurance();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Insurance());
			if (domMap.get(key) != null)
			{
				return (ims.core.patient.domain.objects.Insurance)domMap.get(key);
			}
			domainObject = (ims.core.patient.domain.objects.Insurance) domainFactory.getDomainObject(ims.core.patient.domain.objects.Insurance.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Insurance());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getMedicalCardNo() != null && valueObject.getMedicalCardNo().equals(""))
		{
			valueObject.setMedicalCardNo(null);
		}
		domainObject.setMedicalCardNo(valueObject.getMedicalCardNo());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getHealthActCategory() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getHealthActCategory().getID());
		}
		domainObject.setHealthActCategory(value2);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getEHICNumber() != null && valueObject.getEHICNumber().equals(""))
		{
			valueObject.setEHICNumber(null);
		}
		domainObject.setEHICNumber(valueObject.getEHICNumber());
		ims.framework.utils.PartialDate EHICExpiryDate = valueObject.getEHICExpiryDate();
		Integer value4 = null;
		if ( null != EHICExpiryDate ) 
		{
			value4 = EHICExpiryDate.toInteger();
		}
		domainObject.setEHICExpiryDate(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getEHICCountry() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getEHICCountry().getID());
		}
		domainObject.setEHICCountry(value5);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getEHICInstitution() != null && valueObject.getEHICInstitution().equals(""))
		{
			valueObject.setEHICInstitution(null);
		}
		domainObject.setEHICInstitution(valueObject.getEHICInstitution());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getMedicalCardProved() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getMedicalCardProved().getID());
		}
		domainObject.setMedicalCardProved(value7);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getEligibilityProof() != null && valueObject.getEligibilityProof().equals(""))
		{
			valueObject.setEligibilityProof(null);
		}
		domainObject.setEligibilityProof(valueObject.getEligibilityProof());
		ims.framework.utils.PartialDate MedicalCardExpiryDate = valueObject.getMedicalCardExpiryDate();
		Integer value9 = null;
		if ( null != MedicalCardExpiryDate ) 
		{
			value9 = MedicalCardExpiryDate.toInteger();
		}
		domainObject.setMedicalCardExpiryDate(value9);

		return domainObject;
	}

}
