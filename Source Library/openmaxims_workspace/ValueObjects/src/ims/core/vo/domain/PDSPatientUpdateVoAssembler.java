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
 * Generated on 12/10/2015, 13:24
 *
 */
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Sean Nesbitt
 */
public class PDSPatientUpdateVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PDSPatientUpdateVo copy(ims.core.vo.PDSPatientUpdateVo valueObjectDest, ims.core.vo.PDSPatientUpdateVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PDSPatientUpdate(valueObjectSrc.getID_PDSPatientUpdate());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// administrativeGenderCode
		valueObjectDest.setAdministrativeGenderCode(valueObjectSrc.getAdministrativeGenderCode());
		// birthTime
		valueObjectDest.setBirthTime(valueObjectSrc.getBirthTime());
		// deceasedTime
		valueObjectDest.setDeceasedTime(valueObjectSrc.getDeceasedTime());
		// languageCodeUpdateMode
		valueObjectDest.setLanguageCodeUpdateMode(valueObjectSrc.getLanguageCodeUpdateMode());
		// proficiencyLevelCodeUpdateMode
		valueObjectDest.setProficiencyLevelCodeUpdateMode(valueObjectSrc.getProficiencyLevelCodeUpdateMode());
		// preferredContactMethodUpdateMode
		valueObjectDest.setPreferredContactMethodUpdateMode(valueObjectSrc.getPreferredContactMethodUpdateMode());
		// PreferredContactTimesUpdateMode
		valueObjectDest.setPreferredContactTimesUpdateMode(valueObjectSrc.getPreferredContactTimesUpdateMode());
		// CallCentreCallBackConsentUpdateMode
		valueObjectDest.setCallCentreCallBackConsentUpdateMode(valueObjectSrc.getCallCentreCallBackConsentUpdateMode());
		// nokRelationshipUpdateMode
		valueObjectDest.setNokRelationshipUpdateMode(valueObjectSrc.getNokRelationshipUpdateMode());
		// nokEffectiveDatesUpdateMode
		valueObjectDest.setNokEffectiveDatesUpdateMode(valueObjectSrc.getNokEffectiveDatesUpdateMode());
		// nokContactRankUpdateMode
		valueObjectDest.setNokContactRankUpdateMode(valueObjectSrc.getNokContactRankUpdateMode());
		// nokUpdateMode
		valueObjectDest.setNokUpdateMode(valueObjectSrc.getNokUpdateMode());
		// NokLanguageCommunicationUpdateMode
		valueObjectDest.setNokLanguageCommunicationUpdateMode(valueObjectSrc.getNokLanguageCommunicationUpdateMode());
		// commChannels
		valueObjectDest.setCommChannels(valueObjectSrc.getCommChannels());
		// address
		valueObjectDest.setAddress(valueObjectSrc.getAddress());
		// names
		valueObjectDest.setNames(valueObjectSrc.getNames());
		// nokAddress
		valueObjectDest.setNokAddress(valueObjectSrc.getNokAddress());
		// nokCommChannels
		valueObjectDest.setNokCommChannels(valueObjectSrc.getNokCommChannels());
		// PDSUpdateRequest
		valueObjectDest.setPDSUpdateRequest(valueObjectSrc.getPDSUpdateRequest());
		// relatives
		valueObjectDest.setRelatives(valueObjectSrc.getRelatives());
		// genderUpdateMode
		valueObjectDest.setGenderUpdateMode(valueObjectSrc.getGenderUpdateMode());
		// dateOfBirthUpdateMode
		valueObjectDest.setDateOfBirthUpdateMode(valueObjectSrc.getDateOfBirthUpdateMode());
		// dateOfDeathUpdateMode
		valueObjectDest.setDateOfDeathUpdateMode(valueObjectSrc.getDateOfDeathUpdateMode());
		// consentUpdateMode
		valueObjectDest.setConsentUpdateMode(valueObjectSrc.getConsentUpdateMode());
		// PreferredWrittenCommFormatUpdateMode
		valueObjectDest.setPreferredWrittenCommFormatUpdateMode(valueObjectSrc.getPreferredWrittenCommFormatUpdateMode());
		// deathNotificationUpdateMode
		valueObjectDest.setDeathNotificationUpdateMode(valueObjectSrc.getDeathNotificationUpdateMode());
		// SCN
		valueObjectDest.setSCN(valueObjectSrc.getSCN());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPDSPatientUpdateVoCollectionFromPDSPatientUpdate(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.PDSPatientUpdate objects.
	 */
	public static ims.core.vo.PDSPatientUpdateVoCollection createPDSPatientUpdateVoCollectionFromPDSPatientUpdate(java.util.Set domainObjectSet)	
	{
		return createPDSPatientUpdateVoCollectionFromPDSPatientUpdate(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.PDSPatientUpdate objects.
	 */
	public static ims.core.vo.PDSPatientUpdateVoCollection createPDSPatientUpdateVoCollectionFromPDSPatientUpdate(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PDSPatientUpdateVoCollection voList = new ims.core.vo.PDSPatientUpdateVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.patient.domain.objects.PDSPatientUpdate domainObject = (ims.core.patient.domain.objects.PDSPatientUpdate) iterator.next();
			ims.core.vo.PDSPatientUpdateVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.patient.domain.objects.PDSPatientUpdate objects.
	 */
	public static ims.core.vo.PDSPatientUpdateVoCollection createPDSPatientUpdateVoCollectionFromPDSPatientUpdate(java.util.List domainObjectList) 
	{
		return createPDSPatientUpdateVoCollectionFromPDSPatientUpdate(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.patient.domain.objects.PDSPatientUpdate objects.
	 */
	public static ims.core.vo.PDSPatientUpdateVoCollection createPDSPatientUpdateVoCollectionFromPDSPatientUpdate(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PDSPatientUpdateVoCollection voList = new ims.core.vo.PDSPatientUpdateVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.patient.domain.objects.PDSPatientUpdate domainObject = (ims.core.patient.domain.objects.PDSPatientUpdate) domainObjectList.get(i);
			ims.core.vo.PDSPatientUpdateVo vo = create(map, domainObject);

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
	 * Create the ims.core.patient.domain.objects.PDSPatientUpdate set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPDSPatientUpdateSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSPatientUpdateVoCollection voCollection) 
	 {
	 	return extractPDSPatientUpdateSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPDSPatientUpdateSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSPatientUpdateVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PDSPatientUpdateVo vo = voCollection.get(i);
			ims.core.patient.domain.objects.PDSPatientUpdate domainObject = PDSPatientUpdateVoAssembler.extractPDSPatientUpdate(domainFactory, vo, domMap);

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
	 * Create the ims.core.patient.domain.objects.PDSPatientUpdate list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPDSPatientUpdateList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSPatientUpdateVoCollection voCollection) 
	 {
	 	return extractPDSPatientUpdateList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPDSPatientUpdateList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSPatientUpdateVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PDSPatientUpdateVo vo = voCollection.get(i);
			ims.core.patient.domain.objects.PDSPatientUpdate domainObject = PDSPatientUpdateVoAssembler.extractPDSPatientUpdate(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.patient.domain.objects.PDSPatientUpdate object.
	 * @param domainObject ims.core.patient.domain.objects.PDSPatientUpdate
	 */
	 public static ims.core.vo.PDSPatientUpdateVo create(ims.core.patient.domain.objects.PDSPatientUpdate domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.patient.domain.objects.PDSPatientUpdate object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PDSPatientUpdateVo create(DomainObjectMap map, ims.core.patient.domain.objects.PDSPatientUpdate domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PDSPatientUpdateVo valueObject = (ims.core.vo.PDSPatientUpdateVo) map.getValueObject(domainObject, ims.core.vo.PDSPatientUpdateVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PDSPatientUpdateVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.patient.domain.objects.PDSPatientUpdate
	 */
	 public static ims.core.vo.PDSPatientUpdateVo insert(ims.core.vo.PDSPatientUpdateVo valueObject, ims.core.patient.domain.objects.PDSPatientUpdate domainObject) 
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
	 * @param domainObject ims.core.patient.domain.objects.PDSPatientUpdate
	 */
	 public static ims.core.vo.PDSPatientUpdateVo insert(DomainObjectMap map, ims.core.vo.PDSPatientUpdateVo valueObject, ims.core.patient.domain.objects.PDSPatientUpdate domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PDSPatientUpdate(domainObject.getId());
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
			
		// administrativeGenderCode
		ims.domain.lookups.LookupInstance instance1 = domainObject.getAdministrativeGenderCode();
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

			ims.core.vo.lookups.PDSUpdateMode voLookup1 = new ims.core.vo.lookups.PDSUpdateMode(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.PDSUpdateMode parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.core.vo.lookups.PDSUpdateMode(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setAdministrativeGenderCode(voLookup1);
		}
				// birthTime
		ims.domain.lookups.LookupInstance instance2 = domainObject.getBirthTime();
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

			ims.core.vo.lookups.PDSUpdateMode voLookup2 = new ims.core.vo.lookups.PDSUpdateMode(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.PDSUpdateMode parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.PDSUpdateMode(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setBirthTime(voLookup2);
		}
				// deceasedTime
		ims.domain.lookups.LookupInstance instance3 = domainObject.getDeceasedTime();
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

			ims.core.vo.lookups.PDSUpdateMode voLookup3 = new ims.core.vo.lookups.PDSUpdateMode(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.PDSUpdateMode parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.PDSUpdateMode(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setDeceasedTime(voLookup3);
		}
				// languageCodeUpdateMode
		ims.domain.lookups.LookupInstance instance4 = domainObject.getLanguageCodeUpdateMode();
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

			ims.core.vo.lookups.PDSUpdateMode voLookup4 = new ims.core.vo.lookups.PDSUpdateMode(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.PDSUpdateMode parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.PDSUpdateMode(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setLanguageCodeUpdateMode(voLookup4);
		}
				// proficiencyLevelCodeUpdateMode
		ims.domain.lookups.LookupInstance instance5 = domainObject.getProficiencyLevelCodeUpdateMode();
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

			ims.core.vo.lookups.PDSUpdateMode voLookup5 = new ims.core.vo.lookups.PDSUpdateMode(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.PDSUpdateMode parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.PDSUpdateMode(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setProficiencyLevelCodeUpdateMode(voLookup5);
		}
				// preferredContactMethodUpdateMode
		ims.domain.lookups.LookupInstance instance6 = domainObject.getPreferredContactMethodUpdateMode();
		if ( null != instance6 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance6.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance6.getImage().getImageId(), instance6.getImage().getImagePath());
			}
			color = instance6.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PDSUpdateMode voLookup6 = new ims.core.vo.lookups.PDSUpdateMode(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.PDSUpdateMode parentVoLookup6 = voLookup6;
			ims.domain.lookups.LookupInstance parent6 = instance6.getParent();
			while (parent6 != null)
			{
				if (parent6.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent6.getImage().getImageId(), parent6.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent6.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup6.setParent(new ims.core.vo.lookups.PDSUpdateMode(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setPreferredContactMethodUpdateMode(voLookup6);
		}
				// PreferredContactTimesUpdateMode
		ims.domain.lookups.LookupInstance instance7 = domainObject.getPreferredContactTimesUpdateMode();
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

			ims.core.vo.lookups.PDSUpdateMode voLookup7 = new ims.core.vo.lookups.PDSUpdateMode(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.PDSUpdateMode parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.core.vo.lookups.PDSUpdateMode(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setPreferredContactTimesUpdateMode(voLookup7);
		}
				// CallCentreCallBackConsentUpdateMode
		ims.domain.lookups.LookupInstance instance8 = domainObject.getCallCentreCallBackConsentUpdateMode();
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

			ims.core.vo.lookups.PDSUpdateMode voLookup8 = new ims.core.vo.lookups.PDSUpdateMode(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.PDSUpdateMode parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.PDSUpdateMode(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setCallCentreCallBackConsentUpdateMode(voLookup8);
		}
				// nokRelationshipUpdateMode
		ims.domain.lookups.LookupInstance instance9 = domainObject.getNokRelationshipUpdateMode();
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

			ims.core.vo.lookups.PDSUpdateMode voLookup9 = new ims.core.vo.lookups.PDSUpdateMode(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.PDSUpdateMode parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.core.vo.lookups.PDSUpdateMode(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setNokRelationshipUpdateMode(voLookup9);
		}
				// nokEffectiveDatesUpdateMode
		ims.domain.lookups.LookupInstance instance10 = domainObject.getNokEffectiveDatesUpdateMode();
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

			ims.core.vo.lookups.PDSUpdateMode voLookup10 = new ims.core.vo.lookups.PDSUpdateMode(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.PDSUpdateMode parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.core.vo.lookups.PDSUpdateMode(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setNokEffectiveDatesUpdateMode(voLookup10);
		}
				// nokContactRankUpdateMode
		ims.domain.lookups.LookupInstance instance11 = domainObject.getNokContactRankUpdateMode();
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

			ims.core.vo.lookups.PDSUpdateMode voLookup11 = new ims.core.vo.lookups.PDSUpdateMode(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.core.vo.lookups.PDSUpdateMode parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.core.vo.lookups.PDSUpdateMode(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setNokContactRankUpdateMode(voLookup11);
		}
				// nokUpdateMode
		ims.domain.lookups.LookupInstance instance12 = domainObject.getNokUpdateMode();
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

			ims.core.vo.lookups.PDSUpdateMode voLookup12 = new ims.core.vo.lookups.PDSUpdateMode(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.core.vo.lookups.PDSUpdateMode parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.core.vo.lookups.PDSUpdateMode(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setNokUpdateMode(voLookup12);
		}
				// NokLanguageCommunicationUpdateMode
		ims.domain.lookups.LookupInstance instance13 = domainObject.getNokLanguageCommunicationUpdateMode();
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

			ims.core.vo.lookups.PDSUpdateMode voLookup13 = new ims.core.vo.lookups.PDSUpdateMode(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.core.vo.lookups.PDSUpdateMode parentVoLookup13 = voLookup13;
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
								parentVoLookup13.setParent(new ims.core.vo.lookups.PDSUpdateMode(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setNokLanguageCommunicationUpdateMode(voLookup13);
		}
				// commChannels
		valueObject.setCommChannels(ims.core.vo.domain.PDSCommChannelRemovedVoAssembler.createPDSCommChannelRemovedVoCollectionFromPDSCommChannelRemoved(map, domainObject.getCommChannels()) );
		// address
		valueObject.setAddress(ims.core.vo.domain.PDSAddrVoAssembler.createPDSAddrVoCollectionFromPDSAddr(map, domainObject.getAddress()) );
		// names
		valueObject.setNames(ims.core.vo.domain.PDSNamesRemovedVoAssembler.createPDSNamesRemovedVoCollectionFromPDSNamesRemoved(map, domainObject.getNames()) );
		// nokAddress
		valueObject.setNokAddress(ims.core.vo.domain.PDSAddrVoAssembler.create(map, domainObject.getNokAddress()) );
		// nokCommChannels
		valueObject.setNokCommChannels(ims.core.vo.domain.PDSCommChannelRemovedVoAssembler.createPDSCommChannelRemovedVoCollectionFromPDSCommChannelRemoved(map, domainObject.getNokCommChannels()) );
		// PDSUpdateRequest
		valueObject.setPDSUpdateRequest(ims.core.vo.domain.PDSGeneralUpdateRequestVoAssembler.create(map, domainObject.getPDSUpdateRequest()) );
		// relatives
		valueObject.setRelatives(ims.core.vo.domain.PDSRelativeRemoveVoAssembler.createPDSRelativeRemoveVoCollectionFromPDSRelativeRemove(map, domainObject.getRelatives()) );
		// genderUpdateMode
		ims.domain.lookups.LookupInstance instance21 = domainObject.getGenderUpdateMode();
		if ( null != instance21 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance21.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance21.getImage().getImageId(), instance21.getImage().getImagePath());
			}
			color = instance21.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PDSUpdateMode voLookup21 = new ims.core.vo.lookups.PDSUpdateMode(instance21.getId(),instance21.getText(), instance21.isActive(), null, img, color);
			ims.core.vo.lookups.PDSUpdateMode parentVoLookup21 = voLookup21;
			ims.domain.lookups.LookupInstance parent21 = instance21.getParent();
			while (parent21 != null)
			{
				if (parent21.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent21.getImage().getImageId(), parent21.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent21.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup21.setParent(new ims.core.vo.lookups.PDSUpdateMode(parent21.getId(),parent21.getText(), parent21.isActive(), null, img, color));
				parentVoLookup21 = parentVoLookup21.getParent();
								parent21 = parent21.getParent();
			}			
			valueObject.setGenderUpdateMode(voLookup21);
		}
				// dateOfBirthUpdateMode
		ims.domain.lookups.LookupInstance instance22 = domainObject.getDateOfBirthUpdateMode();
		if ( null != instance22 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance22.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance22.getImage().getImageId(), instance22.getImage().getImagePath());
			}
			color = instance22.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PDSUpdateMode voLookup22 = new ims.core.vo.lookups.PDSUpdateMode(instance22.getId(),instance22.getText(), instance22.isActive(), null, img, color);
			ims.core.vo.lookups.PDSUpdateMode parentVoLookup22 = voLookup22;
			ims.domain.lookups.LookupInstance parent22 = instance22.getParent();
			while (parent22 != null)
			{
				if (parent22.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent22.getImage().getImageId(), parent22.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent22.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup22.setParent(new ims.core.vo.lookups.PDSUpdateMode(parent22.getId(),parent22.getText(), parent22.isActive(), null, img, color));
				parentVoLookup22 = parentVoLookup22.getParent();
								parent22 = parent22.getParent();
			}			
			valueObject.setDateOfBirthUpdateMode(voLookup22);
		}
				// dateOfDeathUpdateMode
		ims.domain.lookups.LookupInstance instance23 = domainObject.getDateOfDeathUpdateMode();
		if ( null != instance23 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance23.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance23.getImage().getImageId(), instance23.getImage().getImagePath());
			}
			color = instance23.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PDSUpdateMode voLookup23 = new ims.core.vo.lookups.PDSUpdateMode(instance23.getId(),instance23.getText(), instance23.isActive(), null, img, color);
			ims.core.vo.lookups.PDSUpdateMode parentVoLookup23 = voLookup23;
			ims.domain.lookups.LookupInstance parent23 = instance23.getParent();
			while (parent23 != null)
			{
				if (parent23.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent23.getImage().getImageId(), parent23.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent23.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup23.setParent(new ims.core.vo.lookups.PDSUpdateMode(parent23.getId(),parent23.getText(), parent23.isActive(), null, img, color));
				parentVoLookup23 = parentVoLookup23.getParent();
								parent23 = parent23.getParent();
			}			
			valueObject.setDateOfDeathUpdateMode(voLookup23);
		}
				// consentUpdateMode
		ims.domain.lookups.LookupInstance instance24 = domainObject.getConsentUpdateMode();
		if ( null != instance24 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance24.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance24.getImage().getImageId(), instance24.getImage().getImagePath());
			}
			color = instance24.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PDSUpdateMode voLookup24 = new ims.core.vo.lookups.PDSUpdateMode(instance24.getId(),instance24.getText(), instance24.isActive(), null, img, color);
			ims.core.vo.lookups.PDSUpdateMode parentVoLookup24 = voLookup24;
			ims.domain.lookups.LookupInstance parent24 = instance24.getParent();
			while (parent24 != null)
			{
				if (parent24.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent24.getImage().getImageId(), parent24.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent24.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup24.setParent(new ims.core.vo.lookups.PDSUpdateMode(parent24.getId(),parent24.getText(), parent24.isActive(), null, img, color));
				parentVoLookup24 = parentVoLookup24.getParent();
								parent24 = parent24.getParent();
			}			
			valueObject.setConsentUpdateMode(voLookup24);
		}
				// PreferredWrittenCommFormatUpdateMode
		ims.domain.lookups.LookupInstance instance25 = domainObject.getPreferredWrittenCommFormatUpdateMode();
		if ( null != instance25 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance25.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance25.getImage().getImageId(), instance25.getImage().getImagePath());
			}
			color = instance25.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PDSUpdateMode voLookup25 = new ims.core.vo.lookups.PDSUpdateMode(instance25.getId(),instance25.getText(), instance25.isActive(), null, img, color);
			ims.core.vo.lookups.PDSUpdateMode parentVoLookup25 = voLookup25;
			ims.domain.lookups.LookupInstance parent25 = instance25.getParent();
			while (parent25 != null)
			{
				if (parent25.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent25.getImage().getImageId(), parent25.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent25.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup25.setParent(new ims.core.vo.lookups.PDSUpdateMode(parent25.getId(),parent25.getText(), parent25.isActive(), null, img, color));
				parentVoLookup25 = parentVoLookup25.getParent();
								parent25 = parent25.getParent();
			}			
			valueObject.setPreferredWrittenCommFormatUpdateMode(voLookup25);
		}
				// deathNotificationUpdateMode
		ims.domain.lookups.LookupInstance instance26 = domainObject.getDeathNotificationUpdateMode();
		if ( null != instance26 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance26.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance26.getImage().getImageId(), instance26.getImage().getImagePath());
			}
			color = instance26.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PDSUpdateMode voLookup26 = new ims.core.vo.lookups.PDSUpdateMode(instance26.getId(),instance26.getText(), instance26.isActive(), null, img, color);
			ims.core.vo.lookups.PDSUpdateMode parentVoLookup26 = voLookup26;
			ims.domain.lookups.LookupInstance parent26 = instance26.getParent();
			while (parent26 != null)
			{
				if (parent26.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent26.getImage().getImageId(), parent26.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent26.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup26.setParent(new ims.core.vo.lookups.PDSUpdateMode(parent26.getId(),parent26.getText(), parent26.isActive(), null, img, color));
				parentVoLookup26 = parentVoLookup26.getParent();
								parent26 = parent26.getParent();
			}			
			valueObject.setDeathNotificationUpdateMode(voLookup26);
		}
				// SCN
		valueObject.setSCN(domainObject.getSCN());
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
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.patient.domain.objects.PDSPatientUpdate extractPDSPatientUpdate(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSPatientUpdateVo valueObject) 
	{
		return 	extractPDSPatientUpdate(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.patient.domain.objects.PDSPatientUpdate extractPDSPatientUpdate(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSPatientUpdateVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PDSPatientUpdate();
		ims.core.patient.domain.objects.PDSPatientUpdate domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.patient.domain.objects.PDSPatientUpdate)domMap.get(valueObject);
			}
			// ims.core.vo.PDSPatientUpdateVo ID_PDSPatientUpdate field is unknown
			domainObject = new ims.core.patient.domain.objects.PDSPatientUpdate();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PDSPatientUpdate());
			if (domMap.get(key) != null)
			{
				return (ims.core.patient.domain.objects.PDSPatientUpdate)domMap.get(key);
			}
			domainObject = (ims.core.patient.domain.objects.PDSPatientUpdate) domainFactory.getDomainObject(ims.core.patient.domain.objects.PDSPatientUpdate.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PDSPatientUpdate());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getAdministrativeGenderCode() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getAdministrativeGenderCode().getID());
		}
		domainObject.setAdministrativeGenderCode(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getBirthTime() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getBirthTime().getID());
		}
		domainObject.setBirthTime(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getDeceasedTime() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getDeceasedTime().getID());
		}
		domainObject.setDeceasedTime(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getLanguageCodeUpdateMode() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getLanguageCodeUpdateMode().getID());
		}
		domainObject.setLanguageCodeUpdateMode(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getProficiencyLevelCodeUpdateMode() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getProficiencyLevelCodeUpdateMode().getID());
		}
		domainObject.setProficiencyLevelCodeUpdateMode(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getPreferredContactMethodUpdateMode() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getPreferredContactMethodUpdateMode().getID());
		}
		domainObject.setPreferredContactMethodUpdateMode(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getPreferredContactTimesUpdateMode() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getPreferredContactTimesUpdateMode().getID());
		}
		domainObject.setPreferredContactTimesUpdateMode(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getCallCentreCallBackConsentUpdateMode() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getCallCentreCallBackConsentUpdateMode().getID());
		}
		domainObject.setCallCentreCallBackConsentUpdateMode(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getNokRelationshipUpdateMode() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getNokRelationshipUpdateMode().getID());
		}
		domainObject.setNokRelationshipUpdateMode(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getNokEffectiveDatesUpdateMode() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getNokEffectiveDatesUpdateMode().getID());
		}
		domainObject.setNokEffectiveDatesUpdateMode(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getNokContactRankUpdateMode() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getNokContactRankUpdateMode().getID());
		}
		domainObject.setNokContactRankUpdateMode(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getNokUpdateMode() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getNokUpdateMode().getID());
		}
		domainObject.setNokUpdateMode(value12);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getNokLanguageCommunicationUpdateMode() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getNokLanguageCommunicationUpdateMode().getID());
		}
		domainObject.setNokLanguageCommunicationUpdateMode(value13);
		domainObject.setCommChannels(ims.core.vo.domain.PDSCommChannelRemovedVoAssembler.extractPDSCommChannelRemovedList(domainFactory, valueObject.getCommChannels(), domainObject.getCommChannels(), domMap));		
		domainObject.setAddress(ims.core.vo.domain.PDSAddrVoAssembler.extractPDSAddrList(domainFactory, valueObject.getAddress(), domainObject.getAddress(), domMap));		
		domainObject.setNames(ims.core.vo.domain.PDSNamesRemovedVoAssembler.extractPDSNamesRemovedList(domainFactory, valueObject.getNames(), domainObject.getNames(), domMap));		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.patient.domain.objects.PDSAddr value17 = null;
		if ( null != valueObject.getNokAddress() ) 
		{
			if (valueObject.getNokAddress().getBoId() == null)
			{
				if (domMap.get(valueObject.getNokAddress()) != null)
				{
					value17 = (ims.core.patient.domain.objects.PDSAddr)domMap.get(valueObject.getNokAddress());
				}
			}
			else
			{
				value17 = (ims.core.patient.domain.objects.PDSAddr)domainFactory.getDomainObject(ims.core.patient.domain.objects.PDSAddr.class, valueObject.getNokAddress().getBoId());
			}
		}
		domainObject.setNokAddress(value17);
		domainObject.setNokCommChannels(ims.core.vo.domain.PDSCommChannelRemovedVoAssembler.extractPDSCommChannelRemovedList(domainFactory, valueObject.getNokCommChannels(), domainObject.getNokCommChannels(), domMap));		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.patient.domain.objects.PDSGeneralUpdateRequest value19 = null;
		if ( null != valueObject.getPDSUpdateRequest() ) 
		{
			if (valueObject.getPDSUpdateRequest().getBoId() == null)
			{
				if (domMap.get(valueObject.getPDSUpdateRequest()) != null)
				{
					value19 = (ims.core.patient.domain.objects.PDSGeneralUpdateRequest)domMap.get(valueObject.getPDSUpdateRequest());
				}
			}
			else
			{
				value19 = (ims.core.patient.domain.objects.PDSGeneralUpdateRequest)domainFactory.getDomainObject(ims.core.patient.domain.objects.PDSGeneralUpdateRequest.class, valueObject.getPDSUpdateRequest().getBoId());
			}
		}
		domainObject.setPDSUpdateRequest(value19);
		domainObject.setRelatives(ims.core.vo.domain.PDSRelativeRemoveVoAssembler.extractPDSRelativeRemoveList(domainFactory, valueObject.getRelatives(), domainObject.getRelatives(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value21 = null;
		if ( null != valueObject.getGenderUpdateMode() ) 
		{
			value21 =
				domainFactory.getLookupInstance(valueObject.getGenderUpdateMode().getID());
		}
		domainObject.setGenderUpdateMode(value21);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value22 = null;
		if ( null != valueObject.getDateOfBirthUpdateMode() ) 
		{
			value22 =
				domainFactory.getLookupInstance(valueObject.getDateOfBirthUpdateMode().getID());
		}
		domainObject.setDateOfBirthUpdateMode(value22);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value23 = null;
		if ( null != valueObject.getDateOfDeathUpdateMode() ) 
		{
			value23 =
				domainFactory.getLookupInstance(valueObject.getDateOfDeathUpdateMode().getID());
		}
		domainObject.setDateOfDeathUpdateMode(value23);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value24 = null;
		if ( null != valueObject.getConsentUpdateMode() ) 
		{
			value24 =
				domainFactory.getLookupInstance(valueObject.getConsentUpdateMode().getID());
		}
		domainObject.setConsentUpdateMode(value24);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value25 = null;
		if ( null != valueObject.getPreferredWrittenCommFormatUpdateMode() ) 
		{
			value25 =
				domainFactory.getLookupInstance(valueObject.getPreferredWrittenCommFormatUpdateMode().getID());
		}
		domainObject.setPreferredWrittenCommFormatUpdateMode(value25);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value26 = null;
		if ( null != valueObject.getDeathNotificationUpdateMode() ) 
		{
			value26 =
				domainFactory.getLookupInstance(valueObject.getDeathNotificationUpdateMode().getID());
		}
		domainObject.setDeathNotificationUpdateMode(value26);
		domainObject.setSCN(valueObject.getSCN());
		ims.core.patient.domain.objects.Patient value28 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value28 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value28 = domainObject.getPatient();	
			}
			else
			{
				value28 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value28);

		return domainObject;
	}

}
