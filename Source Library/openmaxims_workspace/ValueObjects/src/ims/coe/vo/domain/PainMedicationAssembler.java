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
package ims.coe.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Sinead McDermott
 */
public class PainMedicationAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.coe.vo.PainMedication copy(ims.coe.vo.PainMedication valueObjectDest, ims.coe.vo.PainMedication valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PainMedication(valueObjectSrc.getID_PainMedication());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Medication
		valueObjectDest.setMedication(valueObjectSrc.getMedication());
		// Other
		valueObjectDest.setOther(valueObjectSrc.getOther());
		// Route
		valueObjectDest.setRoute(valueObjectSrc.getRoute());
		// Dose
		valueObjectDest.setDose(valueObjectSrc.getDose());
		// Frequency
		valueObjectDest.setFrequency(valueObjectSrc.getFrequency());
		// TakenWithAnything
		valueObjectDest.setTakenWithAnything(valueObjectSrc.getTakenWithAnything());
		// EffectiveFor
		valueObjectDest.setEffectiveFor(valueObjectSrc.getEffectiveFor());
		// isCurrentlyActive
		valueObjectDest.setIsCurrentlyActive(valueObjectSrc.getIsCurrentlyActive());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPainMedicationCollectionFromPainMedication(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.coe.assessment.domain.objects.PainMedication objects.
	 */
	public static ims.coe.vo.PainMedicationCollection createPainMedicationCollectionFromPainMedication(java.util.Set domainObjectSet)	
	{
		return createPainMedicationCollectionFromPainMedication(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.coe.assessment.domain.objects.PainMedication objects.
	 */
	public static ims.coe.vo.PainMedicationCollection createPainMedicationCollectionFromPainMedication(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.coe.vo.PainMedicationCollection voList = new ims.coe.vo.PainMedicationCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.coe.assessment.domain.objects.PainMedication domainObject = (ims.coe.assessment.domain.objects.PainMedication) iterator.next();
			ims.coe.vo.PainMedication vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.coe.assessment.domain.objects.PainMedication objects.
	 */
	public static ims.coe.vo.PainMedicationCollection createPainMedicationCollectionFromPainMedication(java.util.List domainObjectList) 
	{
		return createPainMedicationCollectionFromPainMedication(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.coe.assessment.domain.objects.PainMedication objects.
	 */
	public static ims.coe.vo.PainMedicationCollection createPainMedicationCollectionFromPainMedication(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.coe.vo.PainMedicationCollection voList = new ims.coe.vo.PainMedicationCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.coe.assessment.domain.objects.PainMedication domainObject = (ims.coe.assessment.domain.objects.PainMedication) domainObjectList.get(i);
			ims.coe.vo.PainMedication vo = create(map, domainObject);

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
	 * Create the ims.coe.assessment.domain.objects.PainMedication set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPainMedicationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.PainMedicationCollection voCollection) 
	 {
	 	return extractPainMedicationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPainMedicationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.PainMedicationCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.coe.vo.PainMedication vo = voCollection.get(i);
			ims.coe.assessment.domain.objects.PainMedication domainObject = PainMedicationAssembler.extractPainMedication(domainFactory, vo, domMap);

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
	 * Create the ims.coe.assessment.domain.objects.PainMedication list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPainMedicationList(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.PainMedicationCollection voCollection) 
	 {
	 	return extractPainMedicationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPainMedicationList(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.PainMedicationCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.coe.vo.PainMedication vo = voCollection.get(i);
			ims.coe.assessment.domain.objects.PainMedication domainObject = PainMedicationAssembler.extractPainMedication(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.coe.assessment.domain.objects.PainMedication object.
	 * @param domainObject ims.coe.assessment.domain.objects.PainMedication
	 */
	 public static ims.coe.vo.PainMedication create(ims.coe.assessment.domain.objects.PainMedication domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.coe.assessment.domain.objects.PainMedication object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.coe.vo.PainMedication create(DomainObjectMap map, ims.coe.assessment.domain.objects.PainMedication domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.coe.vo.PainMedication valueObject = (ims.coe.vo.PainMedication) map.getValueObject(domainObject, ims.coe.vo.PainMedication.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.coe.vo.PainMedication(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.coe.assessment.domain.objects.PainMedication
	 */
	 public static ims.coe.vo.PainMedication insert(ims.coe.vo.PainMedication valueObject, ims.coe.assessment.domain.objects.PainMedication domainObject) 
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
	 * @param domainObject ims.coe.assessment.domain.objects.PainMedication
	 */
	 public static ims.coe.vo.PainMedication insert(DomainObjectMap map, ims.coe.vo.PainMedication valueObject, ims.coe.assessment.domain.objects.PainMedication domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PainMedication(domainObject.getId());
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
			
		// Medication
		ims.domain.lookups.LookupInstance instance1 = domainObject.getMedication();
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

			ims.coe.vo.lookups.PainMedication voLookup1 = new ims.coe.vo.lookups.PainMedication(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.coe.vo.lookups.PainMedication parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.coe.vo.lookups.PainMedication(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setMedication(voLookup1);
		}
				// Other
		valueObject.setOther(domainObject.getOther());
		// Route
		ims.domain.lookups.LookupInstance instance3 = domainObject.getRoute();
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

			ims.core.vo.lookups.MedicationRoute voLookup3 = new ims.core.vo.lookups.MedicationRoute(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.MedicationRoute parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.MedicationRoute(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setRoute(voLookup3);
		}
				// Dose
		valueObject.setDose(domainObject.getDose());
		// Frequency
		ims.domain.lookups.LookupInstance instance5 = domainObject.getFrequency();
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

			ims.core.vo.lookups.MedicationFrequency voLookup5 = new ims.core.vo.lookups.MedicationFrequency(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.MedicationFrequency parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.MedicationFrequency(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setFrequency(voLookup5);
		}
				// TakenWithAnything
		valueObject.setTakenWithAnything(domainObject.getTakenWithAnything());
		// EffectiveFor
		valueObject.setEffectiveFor(domainObject.getEffectiveFor());
		// isCurrentlyActive
		valueObject.setIsCurrentlyActive( domainObject.isIsCurrentlyActive() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.coe.assessment.domain.objects.PainMedication extractPainMedication(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.PainMedication valueObject) 
	{
		return 	extractPainMedication(domainFactory, valueObject, new HashMap());
	}

	public static ims.coe.assessment.domain.objects.PainMedication extractPainMedication(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.PainMedication valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PainMedication();
		ims.coe.assessment.domain.objects.PainMedication domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.coe.assessment.domain.objects.PainMedication)domMap.get(valueObject);
			}
			// ims.coe.vo.PainMedication ID_PainMedication field is unknown
			domainObject = new ims.coe.assessment.domain.objects.PainMedication();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PainMedication());
			if (domMap.get(key) != null)
			{
				return (ims.coe.assessment.domain.objects.PainMedication)domMap.get(key);
			}
			domainObject = (ims.coe.assessment.domain.objects.PainMedication) domainFactory.getDomainObject(ims.coe.assessment.domain.objects.PainMedication.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PainMedication());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getMedication() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getMedication().getID());
		}
		domainObject.setMedication(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOther() != null && valueObject.getOther().equals(""))
		{
			valueObject.setOther(null);
		}
		domainObject.setOther(valueObject.getOther());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getRoute() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getRoute().getID());
		}
		domainObject.setRoute(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDose() != null && valueObject.getDose().equals(""))
		{
			valueObject.setDose(null);
		}
		domainObject.setDose(valueObject.getDose());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getFrequency() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getFrequency().getID());
		}
		domainObject.setFrequency(value5);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTakenWithAnything() != null && valueObject.getTakenWithAnything().equals(""))
		{
			valueObject.setTakenWithAnything(null);
		}
		domainObject.setTakenWithAnything(valueObject.getTakenWithAnything());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getEffectiveFor() != null && valueObject.getEffectiveFor().equals(""))
		{
			valueObject.setEffectiveFor(null);
		}
		domainObject.setEffectiveFor(valueObject.getEffectiveFor());
		domainObject.setIsCurrentlyActive(valueObject.getIsCurrentlyActive());

		return domainObject;
	}

}
