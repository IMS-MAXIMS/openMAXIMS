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
package ims.therapies.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Peter Martin
 */
public class WheelchairReferralVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.therapies.vo.WheelchairReferralVo copy(ims.therapies.vo.WheelchairReferralVo valueObjectDest, ims.therapies.vo.WheelchairReferralVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_WheelchairReferral(valueObjectSrc.getID_WheelchairReferral());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// AuthoringDateTime
		valueObjectDest.setAuthoringDateTime(valueObjectSrc.getAuthoringDateTime());
		// AuthoringCP
		valueObjectDest.setAuthoringCP(valueObjectSrc.getAuthoringCP());
		// ReferralDate
		valueObjectDest.setReferralDate(valueObjectSrc.getReferralDate());
		// AssessmentDate
		valueObjectDest.setAssessmentDate(valueObjectSrc.getAssessmentDate());
		// ChairType
		valueObjectDest.setChairType(valueObjectSrc.getChairType());
		// WheelchairAuthority
		valueObjectDest.setWheelchairAuthority(valueObjectSrc.getWheelchairAuthority());
		// WheelchairTherapist
		valueObjectDest.setWheelchairTherapist(valueObjectSrc.getWheelchairTherapist());
		// OutcomeOfAssessment
		valueObjectDest.setOutcomeOfAssessment(valueObjectSrc.getOutcomeOfAssessment());
		// DischargeDate
		valueObjectDest.setDischargeDate(valueObjectSrc.getDischargeDate());
		// DischargeDetails
		valueObjectDest.setDischargeDetails(valueObjectSrc.getDischargeDetails());
		// OtherAssessmentInfo
		valueObjectDest.setOtherAssessmentInfo(valueObjectSrc.getOtherAssessmentInfo());
		// PatientInformed
		valueObjectDest.setPatientInformed(valueObjectSrc.getPatientInformed());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createWheelchairReferralVoCollectionFromWheelchairReferral(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.therapies.mobilitytransfers.domain.objects.WheelchairReferral objects.
	 */
	public static ims.therapies.vo.WheelchairReferralVoCollection createWheelchairReferralVoCollectionFromWheelchairReferral(java.util.Set domainObjectSet)	
	{
		return createWheelchairReferralVoCollectionFromWheelchairReferral(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.therapies.mobilitytransfers.domain.objects.WheelchairReferral objects.
	 */
	public static ims.therapies.vo.WheelchairReferralVoCollection createWheelchairReferralVoCollectionFromWheelchairReferral(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.therapies.vo.WheelchairReferralVoCollection voList = new ims.therapies.vo.WheelchairReferralVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.therapies.mobilitytransfers.domain.objects.WheelchairReferral domainObject = (ims.therapies.mobilitytransfers.domain.objects.WheelchairReferral) iterator.next();
			ims.therapies.vo.WheelchairReferralVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.therapies.mobilitytransfers.domain.objects.WheelchairReferral objects.
	 */
	public static ims.therapies.vo.WheelchairReferralVoCollection createWheelchairReferralVoCollectionFromWheelchairReferral(java.util.List domainObjectList) 
	{
		return createWheelchairReferralVoCollectionFromWheelchairReferral(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.therapies.mobilitytransfers.domain.objects.WheelchairReferral objects.
	 */
	public static ims.therapies.vo.WheelchairReferralVoCollection createWheelchairReferralVoCollectionFromWheelchairReferral(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.therapies.vo.WheelchairReferralVoCollection voList = new ims.therapies.vo.WheelchairReferralVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.therapies.mobilitytransfers.domain.objects.WheelchairReferral domainObject = (ims.therapies.mobilitytransfers.domain.objects.WheelchairReferral) domainObjectList.get(i);
			ims.therapies.vo.WheelchairReferralVo vo = create(map, domainObject);

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
	 * Create the ims.therapies.mobilitytransfers.domain.objects.WheelchairReferral set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractWheelchairReferralSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.WheelchairReferralVoCollection voCollection) 
	 {
	 	return extractWheelchairReferralSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractWheelchairReferralSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.WheelchairReferralVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.WheelchairReferralVo vo = voCollection.get(i);
			ims.therapies.mobilitytransfers.domain.objects.WheelchairReferral domainObject = WheelchairReferralVoAssembler.extractWheelchairReferral(domainFactory, vo, domMap);

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
	 * Create the ims.therapies.mobilitytransfers.domain.objects.WheelchairReferral list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractWheelchairReferralList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.WheelchairReferralVoCollection voCollection) 
	 {
	 	return extractWheelchairReferralList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractWheelchairReferralList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.WheelchairReferralVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.WheelchairReferralVo vo = voCollection.get(i);
			ims.therapies.mobilitytransfers.domain.objects.WheelchairReferral domainObject = WheelchairReferralVoAssembler.extractWheelchairReferral(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.therapies.mobilitytransfers.domain.objects.WheelchairReferral object.
	 * @param domainObject ims.therapies.mobilitytransfers.domain.objects.WheelchairReferral
	 */
	 public static ims.therapies.vo.WheelchairReferralVo create(ims.therapies.mobilitytransfers.domain.objects.WheelchairReferral domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.therapies.mobilitytransfers.domain.objects.WheelchairReferral object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.therapies.vo.WheelchairReferralVo create(DomainObjectMap map, ims.therapies.mobilitytransfers.domain.objects.WheelchairReferral domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.therapies.vo.WheelchairReferralVo valueObject = (ims.therapies.vo.WheelchairReferralVo) map.getValueObject(domainObject, ims.therapies.vo.WheelchairReferralVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.therapies.vo.WheelchairReferralVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.therapies.mobilitytransfers.domain.objects.WheelchairReferral
	 */
	 public static ims.therapies.vo.WheelchairReferralVo insert(ims.therapies.vo.WheelchairReferralVo valueObject, ims.therapies.mobilitytransfers.domain.objects.WheelchairReferral domainObject) 
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
	 * @param domainObject ims.therapies.mobilitytransfers.domain.objects.WheelchairReferral
	 */
	 public static ims.therapies.vo.WheelchairReferralVo insert(DomainObjectMap map, ims.therapies.vo.WheelchairReferralVo valueObject, ims.therapies.mobilitytransfers.domain.objects.WheelchairReferral domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_WheelchairReferral(domainObject.getId());
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
			
		// CareContext
		if (domainObject.getCareContext() != null)
		{
			if(domainObject.getCareContext() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCareContext();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(id, -1));				
			}
			else
			{
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(domainObject.getCareContext().getId(), domainObject.getCareContext().getVersion()));
			}
		}
		// AuthoringDateTime
		java.util.Date AuthoringDateTime = domainObject.getAuthoringDateTime();
		if ( null != AuthoringDateTime ) 
		{
			valueObject.setAuthoringDateTime(new ims.framework.utils.DateTime(AuthoringDateTime) );
		}
		// AuthoringCP
		valueObject.setAuthoringCP(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getAuthoringCP()) );
		// ReferralDate
		java.util.Date ReferralDate = domainObject.getReferralDate();
		if ( null != ReferralDate ) 
		{
			valueObject.setReferralDate(new ims.framework.utils.Date(ReferralDate) );
		}
		// AssessmentDate
		java.util.Date AssessmentDate = domainObject.getAssessmentDate();
		if ( null != AssessmentDate ) 
		{
			valueObject.setAssessmentDate(new ims.framework.utils.Date(AssessmentDate) );
		}
		// ChairType
		ims.domain.lookups.LookupInstance instance6 = domainObject.getChairType();
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

			ims.spinalinjuries.vo.lookups.WheelchairType voLookup6 = new ims.spinalinjuries.vo.lookups.WheelchairType(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.WheelchairType parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.spinalinjuries.vo.lookups.WheelchairType(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setChairType(voLookup6);
		}
				// WheelchairAuthority
		valueObject.setWheelchairAuthority(domainObject.getWheelchairAuthority());
		// WheelchairTherapist
		valueObject.setWheelchairTherapist(domainObject.getWheelchairTherapist());
		// OutcomeOfAssessment
		valueObject.setOutcomeOfAssessment(domainObject.getOutcomeOfAssessment());
		// DischargeDate
		java.util.Date DischargeDate = domainObject.getDischargeDate();
		if ( null != DischargeDate ) 
		{
			valueObject.setDischargeDate(new ims.framework.utils.Date(DischargeDate) );
		}
		// DischargeDetails
		valueObject.setDischargeDetails(domainObject.getDischargeDetails());
		// OtherAssessmentInfo
		valueObject.setOtherAssessmentInfo(domainObject.getOtherAssessmentInfo());
		// PatientInformed
		ims.domain.lookups.LookupInstance instance13 = domainObject.getPatientInformed();
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

			ims.core.vo.lookups.YesNoUnknown voLookup13 = new ims.core.vo.lookups.YesNoUnknown(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup13 = voLookup13;
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
								parentVoLookup13.setParent(new ims.core.vo.lookups.YesNoUnknown(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setPatientInformed(voLookup13);
		}
				// ClinicalContact
		if (domainObject.getClinicalContact() != null)
		{
			if(domainObject.getClinicalContact() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getClinicalContact();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(id, -1));				
			}
			else
			{
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(domainObject.getClinicalContact().getId(), domainObject.getClinicalContact().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.therapies.mobilitytransfers.domain.objects.WheelchairReferral extractWheelchairReferral(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.WheelchairReferralVo valueObject) 
	{
		return 	extractWheelchairReferral(domainFactory, valueObject, new HashMap());
	}

	public static ims.therapies.mobilitytransfers.domain.objects.WheelchairReferral extractWheelchairReferral(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.WheelchairReferralVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_WheelchairReferral();
		ims.therapies.mobilitytransfers.domain.objects.WheelchairReferral domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.therapies.mobilitytransfers.domain.objects.WheelchairReferral)domMap.get(valueObject);
			}
			// ims.therapies.vo.WheelchairReferralVo ID_WheelchairReferral field is unknown
			domainObject = new ims.therapies.mobilitytransfers.domain.objects.WheelchairReferral();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_WheelchairReferral());
			if (domMap.get(key) != null)
			{
				return (ims.therapies.mobilitytransfers.domain.objects.WheelchairReferral)domMap.get(key);
			}
			domainObject = (ims.therapies.mobilitytransfers.domain.objects.WheelchairReferral) domainFactory.getDomainObject(ims.therapies.mobilitytransfers.domain.objects.WheelchairReferral.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_WheelchairReferral());

		ims.core.admin.domain.objects.CareContext value1 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value1 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getCareContext();	
			}
			else
			{
				value1 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getAuthoringDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setAuthoringDateTime(value2);
		domainObject.setAuthoringCP(ims.core.vo.domain.HcpAssembler.extractHcp(domainFactory, valueObject.getAuthoringCP(), domMap));
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getReferralDate();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setReferralDate(value4);
		java.util.Date value5 = null;
		ims.framework.utils.Date date5 = valueObject.getAssessmentDate();		
		if ( date5 != null ) 
		{
			value5 = date5.getDate();
		}
		domainObject.setAssessmentDate(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getChairType() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getChairType().getID());
		}
		domainObject.setChairType(value6);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getWheelchairAuthority() != null && valueObject.getWheelchairAuthority().equals(""))
		{
			valueObject.setWheelchairAuthority(null);
		}
		domainObject.setWheelchairAuthority(valueObject.getWheelchairAuthority());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getWheelchairTherapist() != null && valueObject.getWheelchairTherapist().equals(""))
		{
			valueObject.setWheelchairTherapist(null);
		}
		domainObject.setWheelchairTherapist(valueObject.getWheelchairTherapist());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOutcomeOfAssessment() != null && valueObject.getOutcomeOfAssessment().equals(""))
		{
			valueObject.setOutcomeOfAssessment(null);
		}
		domainObject.setOutcomeOfAssessment(valueObject.getOutcomeOfAssessment());
		java.util.Date value10 = null;
		ims.framework.utils.Date date10 = valueObject.getDischargeDate();		
		if ( date10 != null ) 
		{
			value10 = date10.getDate();
		}
		domainObject.setDischargeDate(value10);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDischargeDetails() != null && valueObject.getDischargeDetails().equals(""))
		{
			valueObject.setDischargeDetails(null);
		}
		domainObject.setDischargeDetails(valueObject.getDischargeDetails());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOtherAssessmentInfo() != null && valueObject.getOtherAssessmentInfo().equals(""))
		{
			valueObject.setOtherAssessmentInfo(null);
		}
		domainObject.setOtherAssessmentInfo(valueObject.getOtherAssessmentInfo());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getPatientInformed() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getPatientInformed().getID());
		}
		domainObject.setPatientInformed(value13);
		ims.core.admin.domain.objects.ClinicalContact value14 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value14 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value14 = domainObject.getClinicalContact();	
			}
			else
			{
				value14 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value14);

		return domainObject;
	}

}
