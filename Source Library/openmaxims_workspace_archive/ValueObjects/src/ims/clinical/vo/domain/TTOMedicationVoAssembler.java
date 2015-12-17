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
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class TTOMedicationVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.TTOMedicationVo copy(ims.clinical.vo.TTOMedicationVo valueObjectDest, ims.clinical.vo.TTOMedicationVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_TTAMedication(valueObjectSrc.getID_TTAMedication());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// DispenseGiveCode
		valueObjectDest.setDispenseGiveCode(valueObjectSrc.getDispenseGiveCode());
		// DateDispensed
		valueObjectDest.setDateDispensed(valueObjectSrc.getDateDispensed());
		// ActualDispenseAmount
		valueObjectDest.setActualDispenseAmount(valueObjectSrc.getActualDispenseAmount());
		// ActualDispenseUnits
		valueObjectDest.setActualDispenseUnits(valueObjectSrc.getActualDispenseUnits());
		// NoOfRefillsRemaining
		valueObjectDest.setNoOfRefillsRemaining(valueObjectSrc.getNoOfRefillsRemaining());
		// DispenseNotes
		valueObjectDest.setDispenseNotes(valueObjectSrc.getDispenseNotes());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTTOMedicationVoCollectionFromTTAMedication(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.edischarge.domain.objects.TTAMedication objects.
	 */
	public static ims.clinical.vo.TTOMedicationVoCollection createTTOMedicationVoCollectionFromTTAMedication(java.util.Set domainObjectSet)	
	{
		return createTTOMedicationVoCollectionFromTTAMedication(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.edischarge.domain.objects.TTAMedication objects.
	 */
	public static ims.clinical.vo.TTOMedicationVoCollection createTTOMedicationVoCollectionFromTTAMedication(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.TTOMedicationVoCollection voList = new ims.clinical.vo.TTOMedicationVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.edischarge.domain.objects.TTAMedication domainObject = (ims.edischarge.domain.objects.TTAMedication) iterator.next();
			ims.clinical.vo.TTOMedicationVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.edischarge.domain.objects.TTAMedication objects.
	 */
	public static ims.clinical.vo.TTOMedicationVoCollection createTTOMedicationVoCollectionFromTTAMedication(java.util.List domainObjectList) 
	{
		return createTTOMedicationVoCollectionFromTTAMedication(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.edischarge.domain.objects.TTAMedication objects.
	 */
	public static ims.clinical.vo.TTOMedicationVoCollection createTTOMedicationVoCollectionFromTTAMedication(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.TTOMedicationVoCollection voList = new ims.clinical.vo.TTOMedicationVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.edischarge.domain.objects.TTAMedication domainObject = (ims.edischarge.domain.objects.TTAMedication) domainObjectList.get(i);
			ims.clinical.vo.TTOMedicationVo vo = create(map, domainObject);

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
	 * Create the ims.edischarge.domain.objects.TTAMedication set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTTAMedicationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TTOMedicationVoCollection voCollection) 
	 {
	 	return extractTTAMedicationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTTAMedicationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TTOMedicationVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.TTOMedicationVo vo = voCollection.get(i);
			ims.edischarge.domain.objects.TTAMedication domainObject = TTOMedicationVoAssembler.extractTTAMedication(domainFactory, vo, domMap);

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
	 * Create the ims.edischarge.domain.objects.TTAMedication list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTTAMedicationList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TTOMedicationVoCollection voCollection) 
	 {
	 	return extractTTAMedicationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTTAMedicationList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TTOMedicationVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.TTOMedicationVo vo = voCollection.get(i);
			ims.edischarge.domain.objects.TTAMedication domainObject = TTOMedicationVoAssembler.extractTTAMedication(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.edischarge.domain.objects.TTAMedication object.
	 * @param domainObject ims.edischarge.domain.objects.TTAMedication
	 */
	 public static ims.clinical.vo.TTOMedicationVo create(ims.edischarge.domain.objects.TTAMedication domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.edischarge.domain.objects.TTAMedication object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.TTOMedicationVo create(DomainObjectMap map, ims.edischarge.domain.objects.TTAMedication domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.TTOMedicationVo valueObject = (ims.clinical.vo.TTOMedicationVo) map.getValueObject(domainObject, ims.clinical.vo.TTOMedicationVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.TTOMedicationVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.edischarge.domain.objects.TTAMedication
	 */
	 public static ims.clinical.vo.TTOMedicationVo insert(ims.clinical.vo.TTOMedicationVo valueObject, ims.edischarge.domain.objects.TTAMedication domainObject) 
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
	 * @param domainObject ims.edischarge.domain.objects.TTAMedication
	 */
	 public static ims.clinical.vo.TTOMedicationVo insert(DomainObjectMap map, ims.clinical.vo.TTOMedicationVo valueObject, ims.edischarge.domain.objects.TTAMedication domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_TTAMedication(domainObject.getId());
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
			
		// DispenseGiveCode
		valueObject.setDispenseGiveCode(domainObject.getMedication());
		// DateDispensed
		java.util.Date DateDispensed = domainObject.getDateDispensed();
		if ( null != DateDispensed ) 
		{
			valueObject.setDateDispensed(new ims.framework.utils.DateTime(DateDispensed) );
		}
		// ActualDispenseAmount
		valueObject.setActualDispenseAmount(domainObject.getDoseAmount());
		// ActualDispenseUnits
		ims.domain.lookups.LookupInstance instance4 = domainObject.getDoseUnit();
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

			ims.core.vo.lookups.MedicationDoseUnit voLookup4 = new ims.core.vo.lookups.MedicationDoseUnit(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.MedicationDoseUnit parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.MedicationDoseUnit(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setActualDispenseUnits(voLookup4);
		}
				// NoOfRefillsRemaining
		valueObject.setNoOfRefillsRemaining(domainObject.getDaysSupply());
		// DispenseNotes
		valueObject.setDispenseNotes(domainObject.getFrequency());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.edischarge.domain.objects.TTAMedication extractTTAMedication(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TTOMedicationVo valueObject) 
	{
		return 	extractTTAMedication(domainFactory, valueObject, new HashMap());
	}

	public static ims.edischarge.domain.objects.TTAMedication extractTTAMedication(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TTOMedicationVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_TTAMedication();
		ims.edischarge.domain.objects.TTAMedication domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.edischarge.domain.objects.TTAMedication)domMap.get(valueObject);
			}
			// ims.clinical.vo.TTOMedicationVo ID_TTAMedication field is unknown
			domainObject = new ims.edischarge.domain.objects.TTAMedication();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_TTAMedication());
			if (domMap.get(key) != null)
			{
				return (ims.edischarge.domain.objects.TTAMedication)domMap.get(key);
			}
			domainObject = (ims.edischarge.domain.objects.TTAMedication) domainFactory.getDomainObject(ims.edischarge.domain.objects.TTAMedication.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_TTAMedication());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDispenseGiveCode() != null && valueObject.getDispenseGiveCode().equals(""))
		{
			valueObject.setDispenseGiveCode(null);
		}
		domainObject.setMedication(valueObject.getDispenseGiveCode());
		ims.framework.utils.DateTime dateTime2 = valueObject.getDateDispensed();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setDateDispensed(value2);
		domainObject.setDoseAmount(valueObject.getActualDispenseAmount());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getActualDispenseUnits() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getActualDispenseUnits().getID());
		}
		domainObject.setDoseUnit(value4);
		domainObject.setDaysSupply(valueObject.getNoOfRefillsRemaining());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDispenseNotes() != null && valueObject.getDispenseNotes().equals(""))
		{
			valueObject.setDispenseNotes(null);
		}
		domainObject.setFrequency(valueObject.getDispenseNotes());

		return domainObject;
	}

}
