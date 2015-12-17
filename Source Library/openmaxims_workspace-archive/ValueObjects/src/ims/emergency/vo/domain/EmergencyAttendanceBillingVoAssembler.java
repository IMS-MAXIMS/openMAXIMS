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
package ims.emergency.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Florin Blindu
 */
public class EmergencyAttendanceBillingVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.EmergencyAttendanceBillingVo copy(ims.emergency.vo.EmergencyAttendanceBillingVo valueObjectDest, ims.emergency.vo.EmergencyAttendanceBillingVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_EmergencyAttendanceBilling(valueObjectSrc.getID_EmergencyAttendanceBilling());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// EmergencyAttendence
		valueObjectDest.setEmergencyAttendence(valueObjectSrc.getEmergencyAttendence());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// Episode
		valueObjectDest.setEpisode(valueObjectSrc.getEpisode());
		// Attendance
		valueObjectDest.setAttendance(valueObjectSrc.getAttendance());
		// IsPatientExempt
		valueObjectDest.setIsPatientExempt(valueObjectSrc.getIsPatientExempt());
		// ExemptionReason
		valueObjectDest.setExemptionReason(valueObjectSrc.getExemptionReason());
		// ExemptionReasonOther
		valueObjectDest.setExemptionReasonOther(valueObjectSrc.getExemptionReasonOther());
		// PaymentMade
		valueObjectDest.setPaymentMade(valueObjectSrc.getPaymentMade());
		// PaymentType
		valueObjectDest.setPaymentType(valueObjectSrc.getPaymentType());
		// InvoiceAmount
		valueObjectDest.setInvoiceAmount(valueObjectSrc.getInvoiceAmount());
		// ReasonForNonPayment
		valueObjectDest.setReasonForNonPayment(valueObjectSrc.getReasonForNonPayment());
		// PaymentRefunded
		valueObjectDest.setPaymentRefunded(valueObjectSrc.getPaymentRefunded());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createEmergencyAttendanceBillingVoCollectionFromEmergencyAttendanceBilling(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.EmergencyAttendanceBilling objects.
	 */
	public static ims.emergency.vo.EmergencyAttendanceBillingVoCollection createEmergencyAttendanceBillingVoCollectionFromEmergencyAttendanceBilling(java.util.Set domainObjectSet)	
	{
		return createEmergencyAttendanceBillingVoCollectionFromEmergencyAttendanceBilling(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.EmergencyAttendanceBilling objects.
	 */
	public static ims.emergency.vo.EmergencyAttendanceBillingVoCollection createEmergencyAttendanceBillingVoCollectionFromEmergencyAttendanceBilling(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.EmergencyAttendanceBillingVoCollection voList = new ims.emergency.vo.EmergencyAttendanceBillingVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.domain.objects.EmergencyAttendanceBilling domainObject = (ims.core.admin.domain.objects.EmergencyAttendanceBilling) iterator.next();
			ims.emergency.vo.EmergencyAttendanceBillingVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.domain.objects.EmergencyAttendanceBilling objects.
	 */
	public static ims.emergency.vo.EmergencyAttendanceBillingVoCollection createEmergencyAttendanceBillingVoCollectionFromEmergencyAttendanceBilling(java.util.List domainObjectList) 
	{
		return createEmergencyAttendanceBillingVoCollectionFromEmergencyAttendanceBilling(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.EmergencyAttendanceBilling objects.
	 */
	public static ims.emergency.vo.EmergencyAttendanceBillingVoCollection createEmergencyAttendanceBillingVoCollectionFromEmergencyAttendanceBilling(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.EmergencyAttendanceBillingVoCollection voList = new ims.emergency.vo.EmergencyAttendanceBillingVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.EmergencyAttendanceBilling domainObject = (ims.core.admin.domain.objects.EmergencyAttendanceBilling) domainObjectList.get(i);
			ims.emergency.vo.EmergencyAttendanceBillingVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.domain.objects.EmergencyAttendanceBilling set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractEmergencyAttendanceBillingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EmergencyAttendanceBillingVoCollection voCollection) 
	 {
	 	return extractEmergencyAttendanceBillingSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractEmergencyAttendanceBillingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EmergencyAttendanceBillingVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.EmergencyAttendanceBillingVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.EmergencyAttendanceBilling domainObject = EmergencyAttendanceBillingVoAssembler.extractEmergencyAttendanceBilling(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.domain.objects.EmergencyAttendanceBilling list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractEmergencyAttendanceBillingList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EmergencyAttendanceBillingVoCollection voCollection) 
	 {
	 	return extractEmergencyAttendanceBillingList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractEmergencyAttendanceBillingList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EmergencyAttendanceBillingVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.EmergencyAttendanceBillingVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.EmergencyAttendanceBilling domainObject = EmergencyAttendanceBillingVoAssembler.extractEmergencyAttendanceBilling(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.domain.objects.EmergencyAttendanceBilling object.
	 * @param domainObject ims.core.admin.domain.objects.EmergencyAttendanceBilling
	 */
	 public static ims.emergency.vo.EmergencyAttendanceBillingVo create(ims.core.admin.domain.objects.EmergencyAttendanceBilling domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.domain.objects.EmergencyAttendanceBilling object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.emergency.vo.EmergencyAttendanceBillingVo create(DomainObjectMap map, ims.core.admin.domain.objects.EmergencyAttendanceBilling domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.EmergencyAttendanceBillingVo valueObject = (ims.emergency.vo.EmergencyAttendanceBillingVo) map.getValueObject(domainObject, ims.emergency.vo.EmergencyAttendanceBillingVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.EmergencyAttendanceBillingVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.domain.objects.EmergencyAttendanceBilling
	 */
	 public static ims.emergency.vo.EmergencyAttendanceBillingVo insert(ims.emergency.vo.EmergencyAttendanceBillingVo valueObject, ims.core.admin.domain.objects.EmergencyAttendanceBilling domainObject) 
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
	 * @param domainObject ims.core.admin.domain.objects.EmergencyAttendanceBilling
	 */
	 public static ims.emergency.vo.EmergencyAttendanceBillingVo insert(DomainObjectMap map, ims.emergency.vo.EmergencyAttendanceBillingVo valueObject, ims.core.admin.domain.objects.EmergencyAttendanceBilling domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_EmergencyAttendanceBilling(domainObject.getId());
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
			
		// EmergencyAttendence
		if (domainObject.getEmergencyAttendence() != null)
		{
			if(domainObject.getEmergencyAttendence() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getEmergencyAttendence();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setEmergencyAttendence(new ims.core.admin.vo.EmergencyAttendanceRefVo(id, -1));				
			}
			else
			{
				valueObject.setEmergencyAttendence(new ims.core.admin.vo.EmergencyAttendanceRefVo(domainObject.getEmergencyAttendence().getId(), domainObject.getEmergencyAttendence().getVersion()));
			}
		}
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
		// Episode
		if (domainObject.getEpisode() != null)
		{
			if(domainObject.getEpisode() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getEpisode();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setEpisode(new ims.core.admin.vo.EpisodeOfCareRefVo(id, -1));				
			}
			else
			{
				valueObject.setEpisode(new ims.core.admin.vo.EpisodeOfCareRefVo(domainObject.getEpisode().getId(), domainObject.getEpisode().getVersion()));
			}
		}
		// Attendance
		if (domainObject.getAttendance() != null)
		{
			if(domainObject.getAttendance() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAttendance();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAttendance(new ims.core.admin.vo.CareContextRefVo(id, -1));				
			}
			else
			{
				valueObject.setAttendance(new ims.core.admin.vo.CareContextRefVo(domainObject.getAttendance().getId(), domainObject.getAttendance().getVersion()));
			}
		}
		// IsPatientExempt
		ims.domain.lookups.LookupInstance instance5 = domainObject.getIsPatientExempt();
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

			ims.core.vo.lookups.YesNo voLookup5 = new ims.core.vo.lookups.YesNo(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.YesNo(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setIsPatientExempt(voLookup5);
		}
				// ExemptionReason
		ims.domain.lookups.LookupInstance instance6 = domainObject.getExemptionReason();
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

			ims.emergency.vo.lookups.ExemptionReason voLookup6 = new ims.emergency.vo.lookups.ExemptionReason(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.emergency.vo.lookups.ExemptionReason parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.emergency.vo.lookups.ExemptionReason(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setExemptionReason(voLookup6);
		}
				// ExemptionReasonOther
		valueObject.setExemptionReasonOther(domainObject.getExemptionReasonOther());
		// PaymentMade
		ims.domain.lookups.LookupInstance instance8 = domainObject.getPaymentMade();
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

			ims.core.vo.lookups.YesNo voLookup8 = new ims.core.vo.lookups.YesNo(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.YesNo(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setPaymentMade(voLookup8);
		}
				// PaymentType
		ims.domain.lookups.LookupInstance instance9 = domainObject.getPaymentType();
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

			ims.pci.vo.lookups.PaymentType voLookup9 = new ims.pci.vo.lookups.PaymentType(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.pci.vo.lookups.PaymentType parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.pci.vo.lookups.PaymentType(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setPaymentType(voLookup9);
		}
				// InvoiceAmount
		valueObject.setInvoiceAmount(domainObject.getInvoiceAmount());
		// ReasonForNonPayment
		ims.domain.lookups.LookupInstance instance11 = domainObject.getReasonForNonPayment();
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

			ims.billing.vo.lookups.ReasonForNonPayment voLookup11 = new ims.billing.vo.lookups.ReasonForNonPayment(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.billing.vo.lookups.ReasonForNonPayment parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.billing.vo.lookups.ReasonForNonPayment(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setReasonForNonPayment(voLookup11);
		}
				// PaymentRefunded
		ims.domain.lookups.LookupInstance instance12 = domainObject.getPaymentRefunded();
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

			ims.core.vo.lookups.YesNo voLookup12 = new ims.core.vo.lookups.YesNo(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.core.vo.lookups.YesNo(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setPaymentRefunded(voLookup12);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.EmergencyAttendanceBilling extractEmergencyAttendanceBilling(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EmergencyAttendanceBillingVo valueObject) 
	{
		return 	extractEmergencyAttendanceBilling(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.EmergencyAttendanceBilling extractEmergencyAttendanceBilling(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EmergencyAttendanceBillingVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_EmergencyAttendanceBilling();
		ims.core.admin.domain.objects.EmergencyAttendanceBilling domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.domain.objects.EmergencyAttendanceBilling)domMap.get(valueObject);
			}
			// ims.emergency.vo.EmergencyAttendanceBillingVo ID_EmergencyAttendanceBilling field is unknown
			domainObject = new ims.core.admin.domain.objects.EmergencyAttendanceBilling();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_EmergencyAttendanceBilling());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.domain.objects.EmergencyAttendanceBilling)domMap.get(key);
			}
			domainObject = (ims.core.admin.domain.objects.EmergencyAttendanceBilling) domainFactory.getDomainObject(ims.core.admin.domain.objects.EmergencyAttendanceBilling.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_EmergencyAttendanceBilling());

		ims.core.admin.domain.objects.EmergencyAttendance value1 = null;
		if ( null != valueObject.getEmergencyAttendence() ) 
		{
			if (valueObject.getEmergencyAttendence().getBoId() == null)
			{
				if (domMap.get(valueObject.getEmergencyAttendence()) != null)
				{
					value1 = (ims.core.admin.domain.objects.EmergencyAttendance)domMap.get(valueObject.getEmergencyAttendence());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getEmergencyAttendence();	
			}
			else
			{
				value1 = (ims.core.admin.domain.objects.EmergencyAttendance)domainFactory.getDomainObject(ims.core.admin.domain.objects.EmergencyAttendance.class, valueObject.getEmergencyAttendence().getBoId());
			}
		}
		domainObject.setEmergencyAttendence(value1);
		ims.core.patient.domain.objects.Patient value2 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value2 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getPatient();	
			}
			else
			{
				value2 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value2);
		ims.core.admin.domain.objects.EpisodeOfCare value3 = null;
		if ( null != valueObject.getEpisode() ) 
		{
			if (valueObject.getEpisode().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisode()) != null)
				{
					value3 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisode());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getEpisode();	
			}
			else
			{
				value3 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisode().getBoId());
			}
		}
		domainObject.setEpisode(value3);
		ims.core.admin.domain.objects.CareContext value4 = null;
		if ( null != valueObject.getAttendance() ) 
		{
			if (valueObject.getAttendance().getBoId() == null)
			{
				if (domMap.get(valueObject.getAttendance()) != null)
				{
					value4 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getAttendance());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getAttendance();	
			}
			else
			{
				value4 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getAttendance().getBoId());
			}
		}
		domainObject.setAttendance(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getIsPatientExempt() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getIsPatientExempt().getID());
		}
		domainObject.setIsPatientExempt(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getExemptionReason() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getExemptionReason().getID());
		}
		domainObject.setExemptionReason(value6);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getExemptionReasonOther() != null && valueObject.getExemptionReasonOther().equals(""))
		{
			valueObject.setExemptionReasonOther(null);
		}
		domainObject.setExemptionReasonOther(valueObject.getExemptionReasonOther());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getPaymentMade() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getPaymentMade().getID());
		}
		domainObject.setPaymentMade(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getPaymentType() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getPaymentType().getID());
		}
		domainObject.setPaymentType(value9);
		domainObject.setInvoiceAmount(valueObject.getInvoiceAmount());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getReasonForNonPayment() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getReasonForNonPayment().getID());
		}
		domainObject.setReasonForNonPayment(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getPaymentRefunded() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getPaymentRefunded().getID());
		}
		domainObject.setPaymentRefunded(value12);

		return domainObject;
	}

}
