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
package ims.spinalinjuries.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Kevin O'Carroll
 */
public class SocialStatusVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.spinalinjuries.vo.SocialStatusVo copy(ims.spinalinjuries.vo.SocialStatusVo valueObjectDest, ims.spinalinjuries.vo.SocialStatusVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientSocialStatus(valueObjectSrc.getID_PatientSocialStatus());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AuthoringCP
		valueObjectDest.setAuthoringCP(valueObjectSrc.getAuthoringCP());
		// Modality
		valueObjectDest.setModality(valueObjectSrc.getModality());
		// Details
		valueObjectDest.setDetails(valueObjectSrc.getDetails());
		// AssessDate
		valueObjectDest.setAssessDate(valueObjectSrc.getAssessDate());
		// IsPreDischarge
		valueObjectDest.setIsPreDischarge(valueObjectSrc.getIsPreDischarge());
		// AuthoringDateTime
		valueObjectDest.setAuthoringDateTime(valueObjectSrc.getAuthoringDateTime());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSocialStatusVoCollectionFromPatientSocialStatus(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.spinalinjuries.domain.objects.PatientSocialStatus objects.
	 */
	public static ims.spinalinjuries.vo.SocialStatusVoCollection createSocialStatusVoCollectionFromPatientSocialStatus(java.util.Set domainObjectSet)	
	{
		return createSocialStatusVoCollectionFromPatientSocialStatus(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.spinalinjuries.domain.objects.PatientSocialStatus objects.
	 */
	public static ims.spinalinjuries.vo.SocialStatusVoCollection createSocialStatusVoCollectionFromPatientSocialStatus(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.spinalinjuries.vo.SocialStatusVoCollection voList = new ims.spinalinjuries.vo.SocialStatusVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.spinalinjuries.domain.objects.PatientSocialStatus domainObject = (ims.spinalinjuries.domain.objects.PatientSocialStatus) iterator.next();
			ims.spinalinjuries.vo.SocialStatusVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.spinalinjuries.domain.objects.PatientSocialStatus objects.
	 */
	public static ims.spinalinjuries.vo.SocialStatusVoCollection createSocialStatusVoCollectionFromPatientSocialStatus(java.util.List domainObjectList) 
	{
		return createSocialStatusVoCollectionFromPatientSocialStatus(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.spinalinjuries.domain.objects.PatientSocialStatus objects.
	 */
	public static ims.spinalinjuries.vo.SocialStatusVoCollection createSocialStatusVoCollectionFromPatientSocialStatus(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.spinalinjuries.vo.SocialStatusVoCollection voList = new ims.spinalinjuries.vo.SocialStatusVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.spinalinjuries.domain.objects.PatientSocialStatus domainObject = (ims.spinalinjuries.domain.objects.PatientSocialStatus) domainObjectList.get(i);
			ims.spinalinjuries.vo.SocialStatusVo vo = create(map, domainObject);

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
	 * Create the ims.spinalinjuries.domain.objects.PatientSocialStatus set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientSocialStatusSet(ims.domain.ILightweightDomainFactory domainFactory, ims.spinalinjuries.vo.SocialStatusVoCollection voCollection) 
	 {
	 	return extractPatientSocialStatusSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientSocialStatusSet(ims.domain.ILightweightDomainFactory domainFactory, ims.spinalinjuries.vo.SocialStatusVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.spinalinjuries.vo.SocialStatusVo vo = voCollection.get(i);
			ims.spinalinjuries.domain.objects.PatientSocialStatus domainObject = SocialStatusVoAssembler.extractPatientSocialStatus(domainFactory, vo, domMap);

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
	 * Create the ims.spinalinjuries.domain.objects.PatientSocialStatus list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientSocialStatusList(ims.domain.ILightweightDomainFactory domainFactory, ims.spinalinjuries.vo.SocialStatusVoCollection voCollection) 
	 {
	 	return extractPatientSocialStatusList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientSocialStatusList(ims.domain.ILightweightDomainFactory domainFactory, ims.spinalinjuries.vo.SocialStatusVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.spinalinjuries.vo.SocialStatusVo vo = voCollection.get(i);
			ims.spinalinjuries.domain.objects.PatientSocialStatus domainObject = SocialStatusVoAssembler.extractPatientSocialStatus(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.spinalinjuries.domain.objects.PatientSocialStatus object.
	 * @param domainObject ims.spinalinjuries.domain.objects.PatientSocialStatus
	 */
	 public static ims.spinalinjuries.vo.SocialStatusVo create(ims.spinalinjuries.domain.objects.PatientSocialStatus domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.spinalinjuries.domain.objects.PatientSocialStatus object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.spinalinjuries.vo.SocialStatusVo create(DomainObjectMap map, ims.spinalinjuries.domain.objects.PatientSocialStatus domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.spinalinjuries.vo.SocialStatusVo valueObject = (ims.spinalinjuries.vo.SocialStatusVo) map.getValueObject(domainObject, ims.spinalinjuries.vo.SocialStatusVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.spinalinjuries.vo.SocialStatusVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.spinalinjuries.domain.objects.PatientSocialStatus
	 */
	 public static ims.spinalinjuries.vo.SocialStatusVo insert(ims.spinalinjuries.vo.SocialStatusVo valueObject, ims.spinalinjuries.domain.objects.PatientSocialStatus domainObject) 
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
	 * @param domainObject ims.spinalinjuries.domain.objects.PatientSocialStatus
	 */
	 public static ims.spinalinjuries.vo.SocialStatusVo insert(DomainObjectMap map, ims.spinalinjuries.vo.SocialStatusVo valueObject, ims.spinalinjuries.domain.objects.PatientSocialStatus domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientSocialStatus(domainObject.getId());
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
			
		// AuthoringCP
		valueObject.setAuthoringCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getAuthoringCP()) );
		// Modality
		ims.domain.lookups.LookupInstance instance2 = domainObject.getModality();
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

			ims.spinalinjuries.vo.lookups.SocialStatusModality voLookup2 = new ims.spinalinjuries.vo.lookups.SocialStatusModality(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.SocialStatusModality parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.spinalinjuries.vo.lookups.SocialStatusModality(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setModality(voLookup2);
		}
				// Details
		valueObject.setDetails(domainObject.getDetails());
		// AssessDate
		java.util.Date AssessDate = domainObject.getAssessDate();
		if ( null != AssessDate ) 
		{
			valueObject.setAssessDate(new ims.framework.utils.Date(AssessDate) );
		}
		// IsPreDischarge
		valueObject.setIsPreDischarge( domainObject.isIsPreDischarge() );
		// AuthoringDateTime
		java.util.Date AuthoringDateTime = domainObject.getAuthoringDateTime();
		if ( null != AuthoringDateTime ) 
		{
			valueObject.setAuthoringDateTime(new ims.framework.utils.DateTime(AuthoringDateTime) );
		}
		// ClinicalContact
		valueObject.setClinicalContact(ims.core.vo.domain.ClinicalContactShortVoAssembler.create(map, domainObject.getClinicalContact()) );
		// CareContext
		valueObject.setCareContext(ims.core.vo.domain.CareContextShortVoAssembler.create(map, domainObject.getCareContext()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.spinalinjuries.domain.objects.PatientSocialStatus extractPatientSocialStatus(ims.domain.ILightweightDomainFactory domainFactory, ims.spinalinjuries.vo.SocialStatusVo valueObject) 
	{
		return 	extractPatientSocialStatus(domainFactory, valueObject, new HashMap());
	}

	public static ims.spinalinjuries.domain.objects.PatientSocialStatus extractPatientSocialStatus(ims.domain.ILightweightDomainFactory domainFactory, ims.spinalinjuries.vo.SocialStatusVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientSocialStatus();
		ims.spinalinjuries.domain.objects.PatientSocialStatus domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.spinalinjuries.domain.objects.PatientSocialStatus)domMap.get(valueObject);
			}
			// ims.spinalinjuries.vo.SocialStatusVo ID_PatientSocialStatus field is unknown
			domainObject = new ims.spinalinjuries.domain.objects.PatientSocialStatus();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientSocialStatus());
			if (domMap.get(key) != null)
			{
				return (ims.spinalinjuries.domain.objects.PatientSocialStatus)domMap.get(key);
			}
			domainObject = (ims.spinalinjuries.domain.objects.PatientSocialStatus) domainFactory.getDomainObject(ims.spinalinjuries.domain.objects.PatientSocialStatus.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientSocialStatus());

		domainObject.setAuthoringCP(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getAuthoringCP(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getModality() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getModality().getID());
		}
		domainObject.setModality(value2);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDetails() != null && valueObject.getDetails().equals(""))
		{
			valueObject.setDetails(null);
		}
		domainObject.setDetails(valueObject.getDetails());
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getAssessDate();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setAssessDate(value4);
		domainObject.setIsPreDischarge(valueObject.getIsPreDischarge());
		ims.framework.utils.DateTime dateTime6 = valueObject.getAuthoringDateTime();
		java.util.Date value6 = null;
		if ( dateTime6 != null ) 
		{
			value6 = dateTime6.getJavaDate();
		}
		domainObject.setAuthoringDateTime(value6);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.ClinicalContact value7 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value7 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else
			{
				value7 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value7);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.CareContext value8 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value8 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else
			{
				value8 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value8);

		return domainObject;
	}

}
