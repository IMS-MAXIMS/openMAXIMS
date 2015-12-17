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
 * @author Cornel Ventuneac
 */
public class PatientContactPreferenceVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PatientContactPreferenceVo copy(ims.core.vo.PatientContactPreferenceVo valueObjectDest, ims.core.vo.PatientContactPreferenceVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientContactPreference(valueObjectSrc.getID_PatientContactPreference());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ContactName
		valueObjectDest.setContactName(valueObjectSrc.getContactName());
		// PreferredContactTimes
		valueObjectDest.setPreferredContactTimes(valueObjectSrc.getPreferredContactTimes());
		// PatientCallBackConsent
		valueObjectDest.setPatientCallBackConsent(valueObjectSrc.getPatientCallBackConsent());
		// pdsPreferredContactTimes
		valueObjectDest.setPdsPreferredContactTimes(valueObjectSrc.getPdsPreferredContactTimes());
		// pdsPreferredWrittenComm
		valueObjectDest.setPdsPreferredWrittenComm(valueObjectSrc.getPdsPreferredWrittenComm());
		// pdsConsent
		valueObjectDest.setPdsConsent(valueObjectSrc.getPdsConsent());
		// pdsDateLastChanged
		valueObjectDest.setPdsDateLastChanged(valueObjectSrc.getPdsDateLastChanged());
		// PreferredContactMethod
		valueObjectDest.setPreferredContactMethod(valueObjectSrc.getPreferredContactMethod());
		// pdsPreferredContactMethod
		valueObjectDest.setPdsPreferredContactMethod(valueObjectSrc.getPdsPreferredContactMethod());
		// OptOutOfReminders
		valueObjectDest.setOptOutOfReminders(valueObjectSrc.getOptOutOfReminders());
		// pdsConsentType
		valueObjectDest.setPdsConsentType(valueObjectSrc.getPdsConsentType());
		// pdsUpdateMode
		valueObjectDest.setPdsUpdateMode(valueObjectSrc.getPdsUpdateMode());
		// comment
		valueObjectDest.setComment(valueObjectSrc.getComment());
		// consentHistory
		valueObjectDest.setConsentHistory(valueObjectSrc.getConsentHistory());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientContactPreferenceVoCollectionFromPatientContactPreference(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.PatientContactPreference objects.
	 */
	public static ims.core.vo.PatientContactPreferenceVoCollection createPatientContactPreferenceVoCollectionFromPatientContactPreference(java.util.Set domainObjectSet)	
	{
		return createPatientContactPreferenceVoCollectionFromPatientContactPreference(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.PatientContactPreference objects.
	 */
	public static ims.core.vo.PatientContactPreferenceVoCollection createPatientContactPreferenceVoCollectionFromPatientContactPreference(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatientContactPreferenceVoCollection voList = new ims.core.vo.PatientContactPreferenceVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.patient.domain.objects.PatientContactPreference domainObject = (ims.core.patient.domain.objects.PatientContactPreference) iterator.next();
			ims.core.vo.PatientContactPreferenceVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.patient.domain.objects.PatientContactPreference objects.
	 */
	public static ims.core.vo.PatientContactPreferenceVoCollection createPatientContactPreferenceVoCollectionFromPatientContactPreference(java.util.List domainObjectList) 
	{
		return createPatientContactPreferenceVoCollectionFromPatientContactPreference(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.patient.domain.objects.PatientContactPreference objects.
	 */
	public static ims.core.vo.PatientContactPreferenceVoCollection createPatientContactPreferenceVoCollectionFromPatientContactPreference(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatientContactPreferenceVoCollection voList = new ims.core.vo.PatientContactPreferenceVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.patient.domain.objects.PatientContactPreference domainObject = (ims.core.patient.domain.objects.PatientContactPreference) domainObjectList.get(i);
			ims.core.vo.PatientContactPreferenceVo vo = create(map, domainObject);

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
	 * Create the ims.core.patient.domain.objects.PatientContactPreference set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientContactPreferenceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientContactPreferenceVoCollection voCollection) 
	 {
	 	return extractPatientContactPreferenceSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientContactPreferenceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientContactPreferenceVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientContactPreferenceVo vo = voCollection.get(i);
			ims.core.patient.domain.objects.PatientContactPreference domainObject = PatientContactPreferenceVoAssembler.extractPatientContactPreference(domainFactory, vo, domMap);

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
	 * Create the ims.core.patient.domain.objects.PatientContactPreference list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientContactPreferenceList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientContactPreferenceVoCollection voCollection) 
	 {
	 	return extractPatientContactPreferenceList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientContactPreferenceList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientContactPreferenceVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientContactPreferenceVo vo = voCollection.get(i);
			ims.core.patient.domain.objects.PatientContactPreference domainObject = PatientContactPreferenceVoAssembler.extractPatientContactPreference(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.patient.domain.objects.PatientContactPreference object.
	 * @param domainObject ims.core.patient.domain.objects.PatientContactPreference
	 */
	 public static ims.core.vo.PatientContactPreferenceVo create(ims.core.patient.domain.objects.PatientContactPreference domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.patient.domain.objects.PatientContactPreference object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PatientContactPreferenceVo create(DomainObjectMap map, ims.core.patient.domain.objects.PatientContactPreference domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PatientContactPreferenceVo valueObject = (ims.core.vo.PatientContactPreferenceVo) map.getValueObject(domainObject, ims.core.vo.PatientContactPreferenceVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PatientContactPreferenceVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.patient.domain.objects.PatientContactPreference
	 */
	 public static ims.core.vo.PatientContactPreferenceVo insert(ims.core.vo.PatientContactPreferenceVo valueObject, ims.core.patient.domain.objects.PatientContactPreference domainObject) 
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
	 * @param domainObject ims.core.patient.domain.objects.PatientContactPreference
	 */
	 public static ims.core.vo.PatientContactPreferenceVo insert(DomainObjectMap map, ims.core.vo.PatientContactPreferenceVo valueObject, ims.core.patient.domain.objects.PatientContactPreference domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientContactPreference(domainObject.getId());
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
			
		// ContactName
		valueObject.setContactName(domainObject.getContactName());
		// PreferredContactTimes
		ims.domain.lookups.LookupInstance instance2 = domainObject.getPreferredContactTimes();
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

			ims.core.vo.lookups.PreferredContactTime voLookup2 = new ims.core.vo.lookups.PreferredContactTime(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.PreferredContactTime parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.PreferredContactTime(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setPreferredContactTimes(voLookup2);
		}
				// PatientCallBackConsent
		valueObject.setPatientCallBackConsent( domainObject.isPatientCallBackConsent() );
		// pdsPreferredContactTimes
		valueObject.setPdsPreferredContactTimes(domainObject.getPdsPreferredContactTimes());
		// pdsPreferredWrittenComm
		ims.domain.lookups.LookupInstance instance5 = domainObject.getPdsPreferredWrittenComm();
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

			ims.core.vo.lookups.PreferredWrittenCommunication voLookup5 = new ims.core.vo.lookups.PreferredWrittenCommunication(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.PreferredWrittenCommunication parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.PreferredWrittenCommunication(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setPdsPreferredWrittenComm(voLookup5);
		}
				// pdsConsent
		ims.domain.lookups.LookupInstance instance6 = domainObject.getPdsConsent();
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

			ims.core.vo.lookups.PDSConsent voLookup6 = new ims.core.vo.lookups.PDSConsent(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.PDSConsent parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.PDSConsent(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setPdsConsent(voLookup6);
		}
				// pdsDateLastChanged
		java.util.Date pdsDateLastChanged = domainObject.getPdsDateLastChanged();
		if ( null != pdsDateLastChanged ) 
		{
			valueObject.setPdsDateLastChanged(new ims.framework.utils.Date(pdsDateLastChanged) );
		}
		// PreferredContactMethod
		ims.domain.lookups.LookupInstance instance8 = domainObject.getPreferredContactMethod();
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

			ims.core.vo.lookups.ContactMethod voLookup8 = new ims.core.vo.lookups.ContactMethod(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.ContactMethod parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.ContactMethod(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setPreferredContactMethod(voLookup8);
		}
				// pdsPreferredContactMethod
		ims.domain.lookups.LookupInstance instance9 = domainObject.getPdsPreferredContactMethod();
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

			ims.core.vo.lookups.PDSContactMethod voLookup9 = new ims.core.vo.lookups.PDSContactMethod(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.PDSContactMethod parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.core.vo.lookups.PDSContactMethod(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setPdsPreferredContactMethod(voLookup9);
		}
				// OptOutOfReminders
		valueObject.setOptOutOfReminders( domainObject.isOptOutOfReminders() );
		// pdsConsentType
		ims.domain.lookups.LookupInstance instance11 = domainObject.getPdsConsentType();
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

			ims.core.vo.lookups.PDSConsentType voLookup11 = new ims.core.vo.lookups.PDSConsentType(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.core.vo.lookups.PDSConsentType parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.core.vo.lookups.PDSConsentType(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setPdsConsentType(voLookup11);
		}
				// pdsUpdateMode
		ims.domain.lookups.LookupInstance instance12 = domainObject.getPdsUpdateMode();
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
			valueObject.setPdsUpdateMode(voLookup12);
		}
				// comment
		valueObject.setComment(domainObject.getComment());
		// consentHistory
		valueObject.setConsentHistory(ims.core.vo.domain.PDSConsentHistoryVoAssembler.createPDSConsentHistoryVoCollectionFrompdsConsentHistory(map, domainObject.getConsentHistory()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.patient.domain.objects.PatientContactPreference extractPatientContactPreference(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientContactPreferenceVo valueObject) 
	{
		return 	extractPatientContactPreference(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.patient.domain.objects.PatientContactPreference extractPatientContactPreference(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientContactPreferenceVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientContactPreference();
		ims.core.patient.domain.objects.PatientContactPreference domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.patient.domain.objects.PatientContactPreference)domMap.get(valueObject);
			}
			// ims.core.vo.PatientContactPreferenceVo ID_PatientContactPreference field is unknown
			domainObject = new ims.core.patient.domain.objects.PatientContactPreference();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientContactPreference());
			if (domMap.get(key) != null)
			{
				return (ims.core.patient.domain.objects.PatientContactPreference)domMap.get(key);
			}
			domainObject = (ims.core.patient.domain.objects.PatientContactPreference) domainFactory.getDomainObject(ims.core.patient.domain.objects.PatientContactPreference.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientContactPreference());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getContactName() != null && valueObject.getContactName().equals(""))
		{
			valueObject.setContactName(null);
		}
		domainObject.setContactName(valueObject.getContactName());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getPreferredContactTimes() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getPreferredContactTimes().getID());
		}
		domainObject.setPreferredContactTimes(value2);
		domainObject.setPatientCallBackConsent(valueObject.getPatientCallBackConsent());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPdsPreferredContactTimes() != null && valueObject.getPdsPreferredContactTimes().equals(""))
		{
			valueObject.setPdsPreferredContactTimes(null);
		}
		domainObject.setPdsPreferredContactTimes(valueObject.getPdsPreferredContactTimes());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getPdsPreferredWrittenComm() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getPdsPreferredWrittenComm().getID());
		}
		domainObject.setPdsPreferredWrittenComm(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getPdsConsent() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getPdsConsent().getID());
		}
		domainObject.setPdsConsent(value6);
		java.util.Date value7 = null;
		ims.framework.utils.Date date7 = valueObject.getPdsDateLastChanged();		
		if ( date7 != null ) 
		{
			value7 = date7.getDate();
		}
		domainObject.setPdsDateLastChanged(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getPreferredContactMethod() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getPreferredContactMethod().getID());
		}
		domainObject.setPreferredContactMethod(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getPdsPreferredContactMethod() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getPdsPreferredContactMethod().getID());
		}
		domainObject.setPdsPreferredContactMethod(value9);
		domainObject.setOptOutOfReminders(valueObject.getOptOutOfReminders());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getPdsConsentType() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getPdsConsentType().getID());
		}
		domainObject.setPdsConsentType(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getPdsUpdateMode() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getPdsUpdateMode().getID());
		}
		domainObject.setPdsUpdateMode(value12);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComment() != null && valueObject.getComment().equals(""))
		{
			valueObject.setComment(null);
		}
		domainObject.setComment(valueObject.getComment());
		domainObject.setConsentHistory(ims.core.vo.domain.PDSConsentHistoryVoAssembler.extractpdsConsentHistoryList(domainFactory, valueObject.getConsentHistory(), domainObject.getConsentHistory(), domMap));		

		return domainObject;
	}

}
