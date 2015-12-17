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
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cornel Ventuneac
 */
public class ReferralForTransferOfCareVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.ReferralForTransferOfCareVo copy(ims.RefMan.vo.ReferralForTransferOfCareVo valueObjectDest, ims.RefMan.vo.ReferralForTransferOfCareVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Referral(valueObjectSrc.getID_Referral());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AuthoringCP
		valueObjectDest.setAuthoringCP(valueObjectSrc.getAuthoringCP());
		// AuthoringDateTime
		valueObjectDest.setAuthoringDateTime(valueObjectSrc.getAuthoringDateTime());
		// ReferralType
		valueObjectDest.setReferralType(valueObjectSrc.getReferralType());
		// Details
		valueObjectDest.setDetails(valueObjectSrc.getDetails());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// ExtReferralKey
		valueObjectDest.setExtReferralKey(valueObjectSrc.getExtReferralKey());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// ReferralReceivedDate
		valueObjectDest.setReferralReceivedDate(valueObjectSrc.getReferralReceivedDate());
		// OriginalReferralDate
		valueObjectDest.setOriginalReferralDate(valueObjectSrc.getOriginalReferralDate());
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
		// ClockId
		valueObjectDest.setClockId(valueObjectSrc.getClockId());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createReferralForTransferOfCareVoCollectionFromReferral(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.Referral objects.
	 */
	public static ims.RefMan.vo.ReferralForTransferOfCareVoCollection createReferralForTransferOfCareVoCollectionFromReferral(java.util.Set domainObjectSet)	
	{
		return createReferralForTransferOfCareVoCollectionFromReferral(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.Referral objects.
	 */
	public static ims.RefMan.vo.ReferralForTransferOfCareVoCollection createReferralForTransferOfCareVoCollectionFromReferral(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.ReferralForTransferOfCareVoCollection voList = new ims.RefMan.vo.ReferralForTransferOfCareVoCollection();
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
			ims.RefMan.vo.ReferralForTransferOfCareVo vo = create(map, domainObject);
			
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
	public static ims.RefMan.vo.ReferralForTransferOfCareVoCollection createReferralForTransferOfCareVoCollectionFromReferral(java.util.List domainObjectList) 
	{
		return createReferralForTransferOfCareVoCollectionFromReferral(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.Referral objects.
	 */
	public static ims.RefMan.vo.ReferralForTransferOfCareVoCollection createReferralForTransferOfCareVoCollectionFromReferral(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.ReferralForTransferOfCareVoCollection voList = new ims.RefMan.vo.ReferralForTransferOfCareVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.Referral domainObject = (ims.core.admin.domain.objects.Referral) domainObjectList.get(i);
			ims.RefMan.vo.ReferralForTransferOfCareVo vo = create(map, domainObject);

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
	 public static java.util.Set extractReferralSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralForTransferOfCareVoCollection voCollection) 
	 {
	 	return extractReferralSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractReferralSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralForTransferOfCareVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ReferralForTransferOfCareVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.Referral domainObject = ReferralForTransferOfCareVoAssembler.extractReferral(domainFactory, vo, domMap);

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
	 public static java.util.List extractReferralList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralForTransferOfCareVoCollection voCollection) 
	 {
	 	return extractReferralList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractReferralList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralForTransferOfCareVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ReferralForTransferOfCareVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.Referral domainObject = ReferralForTransferOfCareVoAssembler.extractReferral(domainFactory, vo, domMap);

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
	 public static ims.RefMan.vo.ReferralForTransferOfCareVo create(ims.core.admin.domain.objects.Referral domainObject) 
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
	  public static ims.RefMan.vo.ReferralForTransferOfCareVo create(DomainObjectMap map, ims.core.admin.domain.objects.Referral domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.ReferralForTransferOfCareVo valueObject = (ims.RefMan.vo.ReferralForTransferOfCareVo) map.getValueObject(domainObject, ims.RefMan.vo.ReferralForTransferOfCareVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.ReferralForTransferOfCareVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.RefMan.vo.ReferralForTransferOfCareVo insert(ims.RefMan.vo.ReferralForTransferOfCareVo valueObject, ims.core.admin.domain.objects.Referral domainObject) 
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
	 public static ims.RefMan.vo.ReferralForTransferOfCareVo insert(DomainObjectMap map, ims.RefMan.vo.ReferralForTransferOfCareVo valueObject, ims.core.admin.domain.objects.Referral domainObject) 
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
		// AuthoringDateTime
		java.util.Date AuthoringDateTime = domainObject.getAuthoringDateTime();
		if ( null != AuthoringDateTime ) 
		{
			valueObject.setAuthoringDateTime(new ims.framework.utils.DateTime(AuthoringDateTime) );
		}
		// ReferralType
		ims.domain.lookups.LookupInstance instance3 = domainObject.getReferralType();
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

			ims.core.vo.lookups.ReferralType voLookup3 = new ims.core.vo.lookups.ReferralType(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.ReferralType parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.ReferralType(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setReferralType(voLookup3);
		}
				// Details
		valueObject.setDetails(domainObject.getDetails());
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
		// ExtReferralKey
		valueObject.setExtReferralKey(domainObject.getExtReferralKey());
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
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// FirstApptDate
		java.util.Date FirstApptDate = domainObject.getFirstApptDate();
		if ( null != FirstApptDate ) 
		{
			valueObject.setFirstApptDate(new ims.framework.utils.DateTime(FirstApptDate) );
		}
		// SourceOfReferral
		ims.domain.lookups.LookupInstance instance13 = domainObject.getSourceOfReferral();
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

			ims.core.vo.lookups.SourceOfReferral voLookup13 = new ims.core.vo.lookups.SourceOfReferral(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.core.vo.lookups.SourceOfReferral parentVoLookup13 = voLookup13;
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
								parentVoLookup13.setParent(new ims.core.vo.lookups.SourceOfReferral(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setSourceOfReferral(voLookup13);
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
		ims.domain.lookups.LookupInstance instance16 = domainObject.getReferralPriority();
		if ( null != instance16 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance16.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance16.getImage().getImageId(), instance16.getImage().getImagePath());
			}
			color = instance16.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.ReferralPriority voLookup16 = new ims.core.vo.lookups.ReferralPriority(instance16.getId(),instance16.getText(), instance16.isActive(), null, img, color);
			ims.core.vo.lookups.ReferralPriority parentVoLookup16 = voLookup16;
			ims.domain.lookups.LookupInstance parent16 = instance16.getParent();
			while (parent16 != null)
			{
				if (parent16.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent16.getImage().getImageId(), parent16.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent16.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup16.setParent(new ims.core.vo.lookups.ReferralPriority(parent16.getId(),parent16.getText(), parent16.isActive(), null, img, color));
				parentVoLookup16 = parentVoLookup16.getParent();
								parent16 = parent16.getParent();
			}			
			valueObject.setReferralPriority(voLookup16);
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
		ims.domain.lookups.LookupInstance instance18 = domainObject.getSpecialty();
		if ( null != instance18 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance18.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance18.getImage().getImageId(), instance18.getImage().getImagePath());
			}
			color = instance18.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.Specialty voLookup18 = new ims.core.vo.lookups.Specialty(instance18.getId(),instance18.getText(), instance18.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup18 = voLookup18;
			ims.domain.lookups.LookupInstance parent18 = instance18.getParent();
			while (parent18 != null)
			{
				if (parent18.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent18.getImage().getImageId(), parent18.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent18.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup18.setParent(new ims.core.vo.lookups.Specialty(parent18.getId(),parent18.getText(), parent18.isActive(), null, img, color));
				parentVoLookup18 = parentVoLookup18.getParent();
								parent18 = parent18.getParent();
			}			
			valueObject.setSpecialty(voLookup18);
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
		// ClockId
		valueObject.setClockId(domainObject.getClockId());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.Referral extractReferral(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralForTransferOfCareVo valueObject) 
	{
		return 	extractReferral(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.Referral extractReferral(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralForTransferOfCareVo valueObject, HashMap domMap) 
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
			// ims.RefMan.vo.ReferralForTransferOfCareVo ID_Referral field is unknown
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
		ims.framework.utils.DateTime dateTime2 = valueObject.getAuthoringDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setAuthoringDateTime(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getReferralType() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getReferralType().getID());
		}
		domainObject.setReferralType(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDetails() != null && valueObject.getDetails().equals(""))
		{
			valueObject.setDetails(null);
		}
		domainObject.setDetails(valueObject.getDetails());
		ims.core.admin.domain.objects.ClinicalContact value5 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value5 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value5 = domainObject.getClinicalContact();	
			}
			else
			{
				value5 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value5);
		ims.core.admin.domain.objects.CareContext value6 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value6 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value6 = domainObject.getCareContext();	
			}
			else
			{
				value6 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value6);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getExtReferralKey() != null && valueObject.getExtReferralKey().equals(""))
		{
			valueObject.setExtReferralKey(null);
		}
		domainObject.setExtReferralKey(valueObject.getExtReferralKey());
		ims.core.patient.domain.objects.Patient value8 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value8 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value8 = domainObject.getPatient();	
			}
			else
			{
				value8 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value8);
		java.util.Date value9 = null;
		ims.framework.utils.Date date9 = valueObject.getReferralReceivedDate();		
		if ( date9 != null ) 
		{
			value9 = date9.getDate();
		}
		domainObject.setReferralReceivedDate(value9);
		java.util.Date value10 = null;
		ims.framework.utils.Date date10 = valueObject.getOriginalReferralDate();		
		if ( date10 != null ) 
		{
			value10 = date10.getDate();
		}
		domainObject.setOriginalReferralDate(value10);
		domainObject.setIsActive(valueObject.getIsActive());
		ims.framework.utils.DateTime dateTime12 = valueObject.getFirstApptDate();
		java.util.Date value12 = null;
		if ( dateTime12 != null ) 
		{
			value12 = dateTime12.getJavaDate();
		}
		domainObject.setFirstApptDate(value12);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getSourceOfReferral() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getSourceOfReferral().getID());
		}
		domainObject.setSourceOfReferral(value13);
		ims.core.resource.people.domain.objects.Gp value14 = null;
		if ( null != valueObject.getReferringGP() ) 
		{
			if (valueObject.getReferringGP().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferringGP()) != null)
				{
					value14 = (ims.core.resource.people.domain.objects.Gp)domMap.get(valueObject.getReferringGP());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value14 = domainObject.getReferringGP();	
			}
			else
			{
				value14 = (ims.core.resource.people.domain.objects.Gp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Gp.class, valueObject.getReferringGP().getBoId());
			}
		}
		domainObject.setReferringGP(value14);
		ims.core.resource.people.domain.objects.Hcp value15 = null;
		if ( null != valueObject.getReferringClinician() ) 
		{
			if (valueObject.getReferringClinician().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferringClinician()) != null)
				{
					value15 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getReferringClinician());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value15 = domainObject.getReferringClinician();	
			}
			else
			{
				value15 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getReferringClinician().getBoId());
			}
		}
		domainObject.setReferringClinician(value15);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getReferralPriority() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getReferralPriority().getID());
		}
		domainObject.setReferralPriority(value16);
		ims.core.resource.people.domain.objects.Hcp value17 = null;
		if ( null != valueObject.getReferredTo() ) 
		{
			if (valueObject.getReferredTo().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferredTo()) != null)
				{
					value17 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getReferredTo());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value17 = domainObject.getReferredTo();	
			}
			else
			{
				value17 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getReferredTo().getBoId());
			}
		}
		domainObject.setReferredTo(value17);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value18 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value18 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value18);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReferralDetails() != null && valueObject.getReferralDetails().equals(""))
		{
			valueObject.setReferralDetails(null);
		}
		domainObject.setReferralDetails(valueObject.getReferralDetails());
		java.util.Date value20 = null;
		ims.framework.utils.Date date20 = valueObject.getDateOfReferral();		
		if ( date20 != null ) 
		{
			value20 = date20.getDate();
		}
		domainObject.setDateOfReferral(value20);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReferralLocation() != null && valueObject.getReferralLocation().equals(""))
		{
			valueObject.setReferralLocation(null);
		}
		domainObject.setReferralLocation(valueObject.getReferralLocation());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getClockId() != null && valueObject.getClockId().equals(""))
		{
			valueObject.setClockId(null);
		}
		domainObject.setClockId(valueObject.getClockId());

		return domainObject;
	}

}
