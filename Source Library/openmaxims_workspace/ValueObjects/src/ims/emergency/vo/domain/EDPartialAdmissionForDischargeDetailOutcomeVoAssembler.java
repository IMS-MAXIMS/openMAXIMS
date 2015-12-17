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
package ims.emergency.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Florin Blindu
 */
public class EDPartialAdmissionForDischargeDetailOutcomeVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.EDPartialAdmissionForDischargeDetailOutcomeVo copy(ims.emergency.vo.EDPartialAdmissionForDischargeDetailOutcomeVo valueObjectDest, ims.emergency.vo.EDPartialAdmissionForDischargeDetailOutcomeVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_EDPartialAdmission(valueObjectSrc.getID_EDPartialAdmission());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// DecisionToAdmitDateTime
		valueObjectDest.setDecisionToAdmitDateTime(valueObjectSrc.getDecisionToAdmitDateTime());
		// Specialty
		valueObjectDest.setSpecialty(valueObjectSrc.getSpecialty());
		// AllocatedStatus
		valueObjectDest.setAllocatedStatus(valueObjectSrc.getAllocatedStatus());
		// AllocatedBedType
		valueObjectDest.setAllocatedBedType(valueObjectSrc.getAllocatedBedType());
		// AuthoringInfo
		valueObjectDest.setAuthoringInfo(valueObjectSrc.getAuthoringInfo());
		// AllocatedDateTime
		valueObjectDest.setAllocatedDateTime(valueObjectSrc.getAllocatedDateTime());
		// AdmittingConsultant
		valueObjectDest.setAdmittingConsultant(valueObjectSrc.getAdmittingConsultant());
		// AccomodationRequestedType
		valueObjectDest.setAccomodationRequestedType(valueObjectSrc.getAccomodationRequestedType());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createEDPartialAdmissionForDischargeDetailOutcomeVoCollectionFromEDPartialAdmission(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.emergency.domain.objects.EDPartialAdmission objects.
	 */
	public static ims.emergency.vo.EDPartialAdmissionForDischargeDetailOutcomeVoCollection createEDPartialAdmissionForDischargeDetailOutcomeVoCollectionFromEDPartialAdmission(java.util.Set domainObjectSet)	
	{
		return createEDPartialAdmissionForDischargeDetailOutcomeVoCollectionFromEDPartialAdmission(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.emergency.domain.objects.EDPartialAdmission objects.
	 */
	public static ims.emergency.vo.EDPartialAdmissionForDischargeDetailOutcomeVoCollection createEDPartialAdmissionForDischargeDetailOutcomeVoCollectionFromEDPartialAdmission(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.EDPartialAdmissionForDischargeDetailOutcomeVoCollection voList = new ims.emergency.vo.EDPartialAdmissionForDischargeDetailOutcomeVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.emergency.domain.objects.EDPartialAdmission domainObject = (ims.emergency.domain.objects.EDPartialAdmission) iterator.next();
			ims.emergency.vo.EDPartialAdmissionForDischargeDetailOutcomeVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.emergency.domain.objects.EDPartialAdmission objects.
	 */
	public static ims.emergency.vo.EDPartialAdmissionForDischargeDetailOutcomeVoCollection createEDPartialAdmissionForDischargeDetailOutcomeVoCollectionFromEDPartialAdmission(java.util.List domainObjectList) 
	{
		return createEDPartialAdmissionForDischargeDetailOutcomeVoCollectionFromEDPartialAdmission(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.emergency.domain.objects.EDPartialAdmission objects.
	 */
	public static ims.emergency.vo.EDPartialAdmissionForDischargeDetailOutcomeVoCollection createEDPartialAdmissionForDischargeDetailOutcomeVoCollectionFromEDPartialAdmission(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.EDPartialAdmissionForDischargeDetailOutcomeVoCollection voList = new ims.emergency.vo.EDPartialAdmissionForDischargeDetailOutcomeVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.emergency.domain.objects.EDPartialAdmission domainObject = (ims.emergency.domain.objects.EDPartialAdmission) domainObjectList.get(i);
			ims.emergency.vo.EDPartialAdmissionForDischargeDetailOutcomeVo vo = create(map, domainObject);

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
	 * Create the ims.emergency.domain.objects.EDPartialAdmission set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractEDPartialAdmissionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EDPartialAdmissionForDischargeDetailOutcomeVoCollection voCollection) 
	 {
	 	return extractEDPartialAdmissionSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractEDPartialAdmissionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EDPartialAdmissionForDischargeDetailOutcomeVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.EDPartialAdmissionForDischargeDetailOutcomeVo vo = voCollection.get(i);
			ims.emergency.domain.objects.EDPartialAdmission domainObject = EDPartialAdmissionForDischargeDetailOutcomeVoAssembler.extractEDPartialAdmission(domainFactory, vo, domMap);

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
	 * Create the ims.emergency.domain.objects.EDPartialAdmission list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractEDPartialAdmissionList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EDPartialAdmissionForDischargeDetailOutcomeVoCollection voCollection) 
	 {
	 	return extractEDPartialAdmissionList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractEDPartialAdmissionList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EDPartialAdmissionForDischargeDetailOutcomeVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.EDPartialAdmissionForDischargeDetailOutcomeVo vo = voCollection.get(i);
			ims.emergency.domain.objects.EDPartialAdmission domainObject = EDPartialAdmissionForDischargeDetailOutcomeVoAssembler.extractEDPartialAdmission(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.emergency.domain.objects.EDPartialAdmission object.
	 * @param domainObject ims.emergency.domain.objects.EDPartialAdmission
	 */
	 public static ims.emergency.vo.EDPartialAdmissionForDischargeDetailOutcomeVo create(ims.emergency.domain.objects.EDPartialAdmission domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.emergency.domain.objects.EDPartialAdmission object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.emergency.vo.EDPartialAdmissionForDischargeDetailOutcomeVo create(DomainObjectMap map, ims.emergency.domain.objects.EDPartialAdmission domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.EDPartialAdmissionForDischargeDetailOutcomeVo valueObject = (ims.emergency.vo.EDPartialAdmissionForDischargeDetailOutcomeVo) map.getValueObject(domainObject, ims.emergency.vo.EDPartialAdmissionForDischargeDetailOutcomeVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.EDPartialAdmissionForDischargeDetailOutcomeVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.emergency.domain.objects.EDPartialAdmission
	 */
	 public static ims.emergency.vo.EDPartialAdmissionForDischargeDetailOutcomeVo insert(ims.emergency.vo.EDPartialAdmissionForDischargeDetailOutcomeVo valueObject, ims.emergency.domain.objects.EDPartialAdmission domainObject) 
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
	 * @param domainObject ims.emergency.domain.objects.EDPartialAdmission
	 */
	 public static ims.emergency.vo.EDPartialAdmissionForDischargeDetailOutcomeVo insert(DomainObjectMap map, ims.emergency.vo.EDPartialAdmissionForDischargeDetailOutcomeVo valueObject, ims.emergency.domain.objects.EDPartialAdmission domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_EDPartialAdmission(domainObject.getId());
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
			
		// DecisionToAdmitDateTime
		java.util.Date DecisionToAdmitDateTime = domainObject.getDecisionToAdmitDateTime();
		if ( null != DecisionToAdmitDateTime ) 
		{
			valueObject.setDecisionToAdmitDateTime(new ims.framework.utils.DateTime(DecisionToAdmitDateTime) );
		}
		// Specialty
		ims.domain.lookups.LookupInstance instance2 = domainObject.getSpecialty();
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

			ims.core.vo.lookups.Specialty voLookup2 = new ims.core.vo.lookups.Specialty(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.Specialty(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setSpecialty(voLookup2);
		}
				// AllocatedStatus
		ims.domain.lookups.LookupInstance instance3 = domainObject.getAllocatedStatus();
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

			ims.emergency.vo.lookups.AllocationStatus voLookup3 = new ims.emergency.vo.lookups.AllocationStatus(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.emergency.vo.lookups.AllocationStatus parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.emergency.vo.lookups.AllocationStatus(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setAllocatedStatus(voLookup3);
		}
				// AllocatedBedType
		ims.domain.lookups.LookupInstance instance4 = domainObject.getAllocatedBedType();
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

			ims.emergency.vo.lookups.AllocatedBedType voLookup4 = new ims.emergency.vo.lookups.AllocatedBedType(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.emergency.vo.lookups.AllocatedBedType parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.emergency.vo.lookups.AllocatedBedType(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setAllocatedBedType(voLookup4);
		}
				// AuthoringInfo
		valueObject.setAuthoringInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInfo()) );
		// AllocatedDateTime
		java.util.Date AllocatedDateTime = domainObject.getAllocatedDateTime();
		if ( null != AllocatedDateTime ) 
		{
			valueObject.setAllocatedDateTime(new ims.framework.utils.DateTime(AllocatedDateTime) );
		}
		// AdmittingConsultant
		valueObject.setAdmittingConsultant(ims.core.vo.domain.HcpMinVoAssembler.create(map, domainObject.getAdmittingConsultant()) );
		// AccomodationRequestedType
		ims.domain.lookups.LookupInstance instance8 = domainObject.getAccomodationRequestedType();
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

			ims.core.vo.lookups.AccomodationRequestedType voLookup8 = new ims.core.vo.lookups.AccomodationRequestedType(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.AccomodationRequestedType parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.AccomodationRequestedType(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setAccomodationRequestedType(voLookup8);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.emergency.domain.objects.EDPartialAdmission extractEDPartialAdmission(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EDPartialAdmissionForDischargeDetailOutcomeVo valueObject) 
	{
		return 	extractEDPartialAdmission(domainFactory, valueObject, new HashMap());
	}

	public static ims.emergency.domain.objects.EDPartialAdmission extractEDPartialAdmission(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EDPartialAdmissionForDischargeDetailOutcomeVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_EDPartialAdmission();
		ims.emergency.domain.objects.EDPartialAdmission domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.emergency.domain.objects.EDPartialAdmission)domMap.get(valueObject);
			}
			// ims.emergency.vo.EDPartialAdmissionForDischargeDetailOutcomeVo ID_EDPartialAdmission field is unknown
			domainObject = new ims.emergency.domain.objects.EDPartialAdmission();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_EDPartialAdmission());
			if (domMap.get(key) != null)
			{
				return (ims.emergency.domain.objects.EDPartialAdmission)domMap.get(key);
			}
			domainObject = (ims.emergency.domain.objects.EDPartialAdmission) domainFactory.getDomainObject(ims.emergency.domain.objects.EDPartialAdmission.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_EDPartialAdmission());

		ims.framework.utils.DateTime dateTime1 = valueObject.getDecisionToAdmitDateTime();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setDecisionToAdmitDateTime(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getAllocatedStatus() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getAllocatedStatus().getID());
		}
		domainObject.setAllocatedStatus(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getAllocatedBedType() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getAllocatedBedType().getID());
		}
		domainObject.setAllocatedBedType(value4);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.AuthoringInformation value5 = null;
		if ( null != valueObject.getAuthoringInfo() ) 
		{
			if (valueObject.getAuthoringInfo().getBoId() == null)
			{
				if (domMap.get(valueObject.getAuthoringInfo()) != null)
				{
					value5 = (ims.core.clinical.domain.objects.AuthoringInformation)domMap.get(valueObject.getAuthoringInfo());
				}
			}
			else
			{
				value5 = (ims.core.clinical.domain.objects.AuthoringInformation)domainFactory.getDomainObject(ims.core.clinical.domain.objects.AuthoringInformation.class, valueObject.getAuthoringInfo().getBoId());
			}
		}
		domainObject.setAuthoringInfo(value5);
		ims.framework.utils.DateTime dateTime6 = valueObject.getAllocatedDateTime();
		java.util.Date value6 = null;
		if ( dateTime6 != null ) 
		{
			value6 = dateTime6.getJavaDate();
		}
		domainObject.setAllocatedDateTime(value6);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value7 = null;
		if ( null != valueObject.getAdmittingConsultant() ) 
		{
			if (valueObject.getAdmittingConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getAdmittingConsultant()) != null)
				{
					value7 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getAdmittingConsultant());
				}
			}
			else
			{
				value7 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getAdmittingConsultant().getBoId());
			}
		}
		domainObject.setAdmittingConsultant(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getAccomodationRequestedType() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getAccomodationRequestedType().getID());
		}
		domainObject.setAccomodationRequestedType(value8);

		return domainObject;
	}

}
