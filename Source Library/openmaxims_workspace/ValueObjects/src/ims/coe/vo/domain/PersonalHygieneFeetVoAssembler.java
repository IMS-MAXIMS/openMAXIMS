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
 * @author John MacEnri
 */
public class PersonalHygieneFeetVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.coe.vo.PersonalHygieneFeetVo copy(ims.coe.vo.PersonalHygieneFeetVo valueObjectDest, ims.coe.vo.PersonalHygieneFeetVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PersonalHygieneFeet(valueObjectSrc.getID_PersonalHygieneFeet());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ConditionOfFeet
		valueObjectDest.setConditionOfFeet(valueObjectSrc.getConditionOfFeet());
		// PatientBatheFeet
		valueObjectDest.setPatientBatheFeet(valueObjectSrc.getPatientBatheFeet());
		// PatientAttendChiropodist
		valueObjectDest.setPatientAttendChiropodist(valueObjectSrc.getPatientAttendChiropodist());
		// ReferralToChiropodist
		valueObjectDest.setReferralToChiropodist(valueObjectSrc.getReferralToChiropodist());
		// FeetFindings
		valueObjectDest.setFeetFindings(valueObjectSrc.getFeetFindings());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPersonalHygieneFeetVoCollectionFromPersonalHygieneFeet(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.coe.assessment.domain.objects.PersonalHygieneFeet objects.
	 */
	public static ims.coe.vo.PersonalHygieneFeetVoCollection createPersonalHygieneFeetVoCollectionFromPersonalHygieneFeet(java.util.Set domainObjectSet)	
	{
		return createPersonalHygieneFeetVoCollectionFromPersonalHygieneFeet(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.coe.assessment.domain.objects.PersonalHygieneFeet objects.
	 */
	public static ims.coe.vo.PersonalHygieneFeetVoCollection createPersonalHygieneFeetVoCollectionFromPersonalHygieneFeet(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.coe.vo.PersonalHygieneFeetVoCollection voList = new ims.coe.vo.PersonalHygieneFeetVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.coe.assessment.domain.objects.PersonalHygieneFeet domainObject = (ims.coe.assessment.domain.objects.PersonalHygieneFeet) iterator.next();
			ims.coe.vo.PersonalHygieneFeetVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.coe.assessment.domain.objects.PersonalHygieneFeet objects.
	 */
	public static ims.coe.vo.PersonalHygieneFeetVoCollection createPersonalHygieneFeetVoCollectionFromPersonalHygieneFeet(java.util.List domainObjectList) 
	{
		return createPersonalHygieneFeetVoCollectionFromPersonalHygieneFeet(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.coe.assessment.domain.objects.PersonalHygieneFeet objects.
	 */
	public static ims.coe.vo.PersonalHygieneFeetVoCollection createPersonalHygieneFeetVoCollectionFromPersonalHygieneFeet(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.coe.vo.PersonalHygieneFeetVoCollection voList = new ims.coe.vo.PersonalHygieneFeetVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.coe.assessment.domain.objects.PersonalHygieneFeet domainObject = (ims.coe.assessment.domain.objects.PersonalHygieneFeet) domainObjectList.get(i);
			ims.coe.vo.PersonalHygieneFeetVo vo = create(map, domainObject);

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
	 * Create the ims.coe.assessment.domain.objects.PersonalHygieneFeet set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPersonalHygieneFeetSet(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.PersonalHygieneFeetVoCollection voCollection) 
	 {
	 	return extractPersonalHygieneFeetSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPersonalHygieneFeetSet(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.PersonalHygieneFeetVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.coe.vo.PersonalHygieneFeetVo vo = voCollection.get(i);
			ims.coe.assessment.domain.objects.PersonalHygieneFeet domainObject = PersonalHygieneFeetVoAssembler.extractPersonalHygieneFeet(domainFactory, vo, domMap);

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
	 * Create the ims.coe.assessment.domain.objects.PersonalHygieneFeet list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPersonalHygieneFeetList(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.PersonalHygieneFeetVoCollection voCollection) 
	 {
	 	return extractPersonalHygieneFeetList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPersonalHygieneFeetList(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.PersonalHygieneFeetVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.coe.vo.PersonalHygieneFeetVo vo = voCollection.get(i);
			ims.coe.assessment.domain.objects.PersonalHygieneFeet domainObject = PersonalHygieneFeetVoAssembler.extractPersonalHygieneFeet(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.coe.assessment.domain.objects.PersonalHygieneFeet object.
	 * @param domainObject ims.coe.assessment.domain.objects.PersonalHygieneFeet
	 */
	 public static ims.coe.vo.PersonalHygieneFeetVo create(ims.coe.assessment.domain.objects.PersonalHygieneFeet domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.coe.assessment.domain.objects.PersonalHygieneFeet object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.coe.vo.PersonalHygieneFeetVo create(DomainObjectMap map, ims.coe.assessment.domain.objects.PersonalHygieneFeet domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.coe.vo.PersonalHygieneFeetVo valueObject = (ims.coe.vo.PersonalHygieneFeetVo) map.getValueObject(domainObject, ims.coe.vo.PersonalHygieneFeetVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.coe.vo.PersonalHygieneFeetVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.coe.assessment.domain.objects.PersonalHygieneFeet
	 */
	 public static ims.coe.vo.PersonalHygieneFeetVo insert(ims.coe.vo.PersonalHygieneFeetVo valueObject, ims.coe.assessment.domain.objects.PersonalHygieneFeet domainObject) 
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
	 * @param domainObject ims.coe.assessment.domain.objects.PersonalHygieneFeet
	 */
	 public static ims.coe.vo.PersonalHygieneFeetVo insert(DomainObjectMap map, ims.coe.vo.PersonalHygieneFeetVo valueObject, ims.coe.assessment.domain.objects.PersonalHygieneFeet domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PersonalHygieneFeet(domainObject.getId());
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
			
		// ConditionOfFeet
		ims.domain.lookups.LookupInstance instance1 = domainObject.getConditionOfFeet();
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

			ims.coe.vo.lookups.ConditionOfFeet voLookup1 = new ims.coe.vo.lookups.ConditionOfFeet(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.coe.vo.lookups.ConditionOfFeet parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.coe.vo.lookups.ConditionOfFeet(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setConditionOfFeet(voLookup1);
		}
				// PatientBatheFeet
		ims.domain.lookups.LookupInstance instance2 = domainObject.getPatientBatheFeet();
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

			ims.core.vo.lookups.YesNoUnknown voLookup2 = new ims.core.vo.lookups.YesNoUnknown(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.YesNoUnknown(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setPatientBatheFeet(voLookup2);
		}
				// PatientAttendChiropodist
		ims.domain.lookups.LookupInstance instance3 = domainObject.getPatientAttendChiropodist();
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

			ims.core.vo.lookups.YesNoUnknown voLookup3 = new ims.core.vo.lookups.YesNoUnknown(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.YesNoUnknown(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setPatientAttendChiropodist(voLookup3);
		}
				// ReferralToChiropodist
		java.util.Date ReferralToChiropodist = domainObject.getReferralToChiropodist();
		if ( null != ReferralToChiropodist ) 
		{
			valueObject.setReferralToChiropodist(new ims.framework.utils.Date(ReferralToChiropodist) );
		}
		// FeetFindings
		valueObject.setFeetFindings(ims.coe.vo.domain.FeetFindingsAssembler.createFeetFindingsCollectionFromPersonalHygieneFeetFindings(map, domainObject.getFeetFindings()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.coe.assessment.domain.objects.PersonalHygieneFeet extractPersonalHygieneFeet(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.PersonalHygieneFeetVo valueObject) 
	{
		return 	extractPersonalHygieneFeet(domainFactory, valueObject, new HashMap());
	}

	public static ims.coe.assessment.domain.objects.PersonalHygieneFeet extractPersonalHygieneFeet(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.PersonalHygieneFeetVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PersonalHygieneFeet();
		ims.coe.assessment.domain.objects.PersonalHygieneFeet domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.coe.assessment.domain.objects.PersonalHygieneFeet)domMap.get(valueObject);
			}
			// ims.coe.vo.PersonalHygieneFeetVo ID_PersonalHygieneFeet field is unknown
			domainObject = new ims.coe.assessment.domain.objects.PersonalHygieneFeet();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PersonalHygieneFeet());
			if (domMap.get(key) != null)
			{
				return (ims.coe.assessment.domain.objects.PersonalHygieneFeet)domMap.get(key);
			}
			domainObject = (ims.coe.assessment.domain.objects.PersonalHygieneFeet) domainFactory.getDomainObject(ims.coe.assessment.domain.objects.PersonalHygieneFeet.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PersonalHygieneFeet());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getConditionOfFeet() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getConditionOfFeet().getID());
		}
		domainObject.setConditionOfFeet(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getPatientBatheFeet() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getPatientBatheFeet().getID());
		}
		domainObject.setPatientBatheFeet(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getPatientAttendChiropodist() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getPatientAttendChiropodist().getID());
		}
		domainObject.setPatientAttendChiropodist(value3);
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getReferralToChiropodist();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setReferralToChiropodist(value4);
		domainObject.setFeetFindings(ims.coe.vo.domain.FeetFindingsAssembler.extractPersonalHygieneFeetFindingsList(domainFactory, valueObject.getFeetFindings(), domainObject.getFeetFindings(), domMap));		

		return domainObject;
	}

}
