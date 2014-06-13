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
 * @author Barbara Worwood
 */
public class HL7ReferralVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.HL7ReferralVo copy(ims.core.vo.HL7ReferralVo valueObjectDest, ims.core.vo.HL7ReferralVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Referral(valueObjectSrc.getID_Referral());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AuthoringCP
		valueObjectDest.setAuthoringCP(valueObjectSrc.getAuthoringCP());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// FirstApptDate
		valueObjectDest.setFirstApptDate(valueObjectSrc.getFirstApptDate());
		// SourceOfReferral
		valueObjectDest.setSourceOfReferral(valueObjectSrc.getSourceOfReferral());
		// ReferringGP
		valueObjectDest.setReferringGP(valueObjectSrc.getReferringGP());
		// ReferringClinician
		valueObjectDest.setReferringClinician(valueObjectSrc.getReferringClinician());
		// ReferralPriority
		valueObjectDest.setReferralPriority(valueObjectSrc.getReferralPriority());
		// ReferredTo
		valueObjectDest.setReferredTo(valueObjectSrc.getReferredTo());
		// Specialty
		valueObjectDest.setSpecialty(valueObjectSrc.getSpecialty());
		// ReferralDetails
		valueObjectDest.setReferralDetails(valueObjectSrc.getReferralDetails());
		// DateOfReferral
		valueObjectDest.setDateOfReferral(valueObjectSrc.getDateOfReferral());
		// ReferralLocation
		valueObjectDest.setReferralLocation(valueObjectSrc.getReferralLocation());
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
 	 * If more than one call to an Assembler is made then #createHL7ReferralVoCollectionFromReferral(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.Referral objects.
	 */
	public static ims.core.vo.HL7ReferralVoCollection createHL7ReferralVoCollectionFromReferral(java.util.Set domainObjectSet)	
	{
		return createHL7ReferralVoCollectionFromReferral(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.Referral objects.
	 */
	public static ims.core.vo.HL7ReferralVoCollection createHL7ReferralVoCollectionFromReferral(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.HL7ReferralVoCollection voList = new ims.core.vo.HL7ReferralVoCollection();
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
			ims.core.vo.HL7ReferralVo vo = create(map, domainObject);
			
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
	public static ims.core.vo.HL7ReferralVoCollection createHL7ReferralVoCollectionFromReferral(java.util.List domainObjectList) 
	{
		return createHL7ReferralVoCollectionFromReferral(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.Referral objects.
	 */
	public static ims.core.vo.HL7ReferralVoCollection createHL7ReferralVoCollectionFromReferral(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.HL7ReferralVoCollection voList = new ims.core.vo.HL7ReferralVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.Referral domainObject = (ims.core.admin.domain.objects.Referral) domainObjectList.get(i);
			ims.core.vo.HL7ReferralVo vo = create(map, domainObject);

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
	 public static java.util.Set extractReferralSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.HL7ReferralVoCollection voCollection) 
	 {
	 	return extractReferralSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractReferralSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.HL7ReferralVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.HL7ReferralVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.Referral domainObject = HL7ReferralVoAssembler.extractReferral(domainFactory, vo, domMap);

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
	 public static java.util.List extractReferralList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.HL7ReferralVoCollection voCollection) 
	 {
	 	return extractReferralList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractReferralList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.HL7ReferralVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.HL7ReferralVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.Referral domainObject = HL7ReferralVoAssembler.extractReferral(domainFactory, vo, domMap);

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
	 public static ims.core.vo.HL7ReferralVo create(ims.core.admin.domain.objects.Referral domainObject) 
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
	  public static ims.core.vo.HL7ReferralVo create(DomainObjectMap map, ims.core.admin.domain.objects.Referral domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.HL7ReferralVo valueObject = (ims.core.vo.HL7ReferralVo) map.getValueObject(domainObject, ims.core.vo.HL7ReferralVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.HL7ReferralVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.core.vo.HL7ReferralVo insert(ims.core.vo.HL7ReferralVo valueObject, ims.core.admin.domain.objects.Referral domainObject) 
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
	 public static ims.core.vo.HL7ReferralVo insert(DomainObjectMap map, ims.core.vo.HL7ReferralVo valueObject, ims.core.admin.domain.objects.Referral domainObject) 
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
			
		// AuthoringCP
		if (domainObject.getAuthoringCP() != null)
		{
			if(domainObject.getAuthoringCP() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAuthoringCP();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAuthoringCP(new ims.core.resource.people.vo.HcpRefVo(id, -1));				
			}
			else
			{
				valueObject.setAuthoringCP(new ims.core.resource.people.vo.HcpRefVo(domainObject.getAuthoringCP().getId(), domainObject.getAuthoringCP().getVersion()));
			}
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
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// FirstApptDate
		java.util.Date FirstApptDate = domainObject.getFirstApptDate();
		if ( null != FirstApptDate ) 
		{
			valueObject.setFirstApptDate(new ims.framework.utils.DateTime(FirstApptDate) );
		}
		// SourceOfReferral
		ims.domain.lookups.LookupInstance instance6 = domainObject.getSourceOfReferral();
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

			ims.core.vo.lookups.SourceOfReferral voLookup6 = new ims.core.vo.lookups.SourceOfReferral(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.SourceOfReferral parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.SourceOfReferral(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setSourceOfReferral(voLookup6);
		}
				// ReferringGP
		if (domainObject.getReferringGP() != null)
		{
			if(domainObject.getReferringGP() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getReferringGP();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setReferringGP(new ims.core.resource.people.vo.GpRefVo(id, -1));				
			}
			else
			{
				valueObject.setReferringGP(new ims.core.resource.people.vo.GpRefVo(domainObject.getReferringGP().getId(), domainObject.getReferringGP().getVersion()));
			}
		}
		// ReferringClinician
		if (domainObject.getReferringClinician() != null)
		{
			if(domainObject.getReferringClinician() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getReferringClinician();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setReferringClinician(new ims.core.resource.people.vo.HcpRefVo(id, -1));				
			}
			else
			{
				valueObject.setReferringClinician(new ims.core.resource.people.vo.HcpRefVo(domainObject.getReferringClinician().getId(), domainObject.getReferringClinician().getVersion()));
			}
		}
		// ReferralPriority
		ims.domain.lookups.LookupInstance instance9 = domainObject.getReferralPriority();
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

			ims.core.vo.lookups.ReferralPriority voLookup9 = new ims.core.vo.lookups.ReferralPriority(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.ReferralPriority parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.core.vo.lookups.ReferralPriority(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setReferralPriority(voLookup9);
		}
				// ReferredTo
		if (domainObject.getReferredTo() != null)
		{
			if(domainObject.getReferredTo() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getReferredTo();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setReferredTo(new ims.core.resource.people.vo.HcpRefVo(id, -1));				
			}
			else
			{
				valueObject.setReferredTo(new ims.core.resource.people.vo.HcpRefVo(domainObject.getReferredTo().getId(), domainObject.getReferredTo().getVersion()));
			}
		}
		// Specialty
		ims.domain.lookups.LookupInstance instance11 = domainObject.getSpecialty();
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

			ims.core.vo.lookups.Specialty voLookup11 = new ims.core.vo.lookups.Specialty(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.core.vo.lookups.Specialty(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setSpecialty(voLookup11);
		}
				// ReferralDetails
		valueObject.setReferralDetails(domainObject.getReferralDetails());
		// DateOfReferral
		java.util.Date DateOfReferral = domainObject.getDateOfReferral();
		if ( null != DateOfReferral ) 
		{
			valueObject.setDateOfReferral(new ims.framework.utils.Date(DateOfReferral) );
		}
		// ReferralLocation
		valueObject.setReferralLocation(domainObject.getReferralLocation());
		// ReferralType
		ims.domain.lookups.LookupInstance instance15 = domainObject.getReferralType();
		if ( null != instance15 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance15.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance15.getImage().getImageId(), instance15.getImage().getImagePath());
			}
			color = instance15.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.ReferralType voLookup15 = new ims.core.vo.lookups.ReferralType(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.core.vo.lookups.ReferralType parentVoLookup15 = voLookup15;
			ims.domain.lookups.LookupInstance parent15 = instance15.getParent();
			while (parent15 != null)
			{
				if (parent15.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent15.getImage().getImageId(), parent15.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent15.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup15.setParent(new ims.core.vo.lookups.ReferralType(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setReferralType(voLookup15);
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
	public static ims.core.admin.domain.objects.Referral extractReferral(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.HL7ReferralVo valueObject) 
	{
		return 	extractReferral(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.Referral extractReferral(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.HL7ReferralVo valueObject, HashMap domMap) 
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
			// ims.core.vo.HL7ReferralVo ID_Referral field is unknown
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

		ims.core.resource.people.domain.objects.Hcp value1 = null;
		if ( null != valueObject.getAuthoringCP() ) 
		{
			if (valueObject.getAuthoringCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getAuthoringCP()) != null)
				{
					value1 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getAuthoringCP());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getAuthoringCP();	
			}
			else
			{
				value1 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getAuthoringCP().getBoId());
			}
		}
		domainObject.setAuthoringCP(value1);
		ims.core.admin.domain.objects.ClinicalContact value2 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value2 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getClinicalContact();	
			}
			else
			{
				value2 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value2);
		ims.core.admin.domain.objects.CareContext value3 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value3 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getCareContext();	
			}
			else
			{
				value3 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value3);
		domainObject.setIsActive(valueObject.getIsActive());
		ims.framework.utils.DateTime dateTime5 = valueObject.getFirstApptDate();
		java.util.Date value5 = null;
		if ( dateTime5 != null ) 
		{
			value5 = dateTime5.getJavaDate();
		}
		domainObject.setFirstApptDate(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getSourceOfReferral() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getSourceOfReferral().getID());
		}
		domainObject.setSourceOfReferral(value6);
		ims.core.resource.people.domain.objects.Gp value7 = null;
		if ( null != valueObject.getReferringGP() ) 
		{
			if (valueObject.getReferringGP().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferringGP()) != null)
				{
					value7 = (ims.core.resource.people.domain.objects.Gp)domMap.get(valueObject.getReferringGP());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value7 = domainObject.getReferringGP();	
			}
			else
			{
				value7 = (ims.core.resource.people.domain.objects.Gp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Gp.class, valueObject.getReferringGP().getBoId());
			}
		}
		domainObject.setReferringGP(value7);
		ims.core.resource.people.domain.objects.Hcp value8 = null;
		if ( null != valueObject.getReferringClinician() ) 
		{
			if (valueObject.getReferringClinician().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferringClinician()) != null)
				{
					value8 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getReferringClinician());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value8 = domainObject.getReferringClinician();	
			}
			else
			{
				value8 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getReferringClinician().getBoId());
			}
		}
		domainObject.setReferringClinician(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getReferralPriority() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getReferralPriority().getID());
		}
		domainObject.setReferralPriority(value9);
		ims.core.resource.people.domain.objects.Hcp value10 = null;
		if ( null != valueObject.getReferredTo() ) 
		{
			if (valueObject.getReferredTo().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferredTo()) != null)
				{
					value10 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getReferredTo());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value10 = domainObject.getReferredTo();	
			}
			else
			{
				value10 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getReferredTo().getBoId());
			}
		}
		domainObject.setReferredTo(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value11);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReferralDetails() != null && valueObject.getReferralDetails().equals(""))
		{
			valueObject.setReferralDetails(null);
		}
		domainObject.setReferralDetails(valueObject.getReferralDetails());
		java.util.Date value13 = null;
		ims.framework.utils.Date date13 = valueObject.getDateOfReferral();		
		if ( date13 != null ) 
		{
			value13 = date13.getDate();
		}
		domainObject.setDateOfReferral(value13);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReferralLocation() != null && valueObject.getReferralLocation().equals(""))
		{
			valueObject.setReferralLocation(null);
		}
		domainObject.setReferralLocation(valueObject.getReferralLocation());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getReferralType() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getReferralType().getID());
		}
		domainObject.setReferralType(value15);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDetails() != null && valueObject.getDetails().equals(""))
		{
			valueObject.setDetails(null);
		}
		domainObject.setDetails(valueObject.getDetails());
		ims.core.patient.domain.objects.Patient value17 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value17 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value17 = domainObject.getPatient();	
			}
			else
			{
				value17 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value17);
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
		ims.framework.utils.DateTime dateTime20 = valueObject.getAuthoringDateTime();
		java.util.Date value20 = null;
		if ( dateTime20 != null ) 
		{
			value20 = dateTime20.getJavaDate();
		}
		domainObject.setAuthoringDateTime(value20);
		java.util.Date value21 = null;
		ims.framework.utils.Date date21 = valueObject.getReferralReceivedDate();		
		if ( date21 != null ) 
		{
			value21 = date21.getDate();
		}
		domainObject.setReferralReceivedDate(value21);
		java.util.Date value22 = null;
		ims.framework.utils.Date date22 = valueObject.getOriginalReferralDate();		
		if ( date22 != null ) 
		{
			value22 = date22.getDate();
		}
		domainObject.setOriginalReferralDate(value22);

		return domainObject;
	}

}
