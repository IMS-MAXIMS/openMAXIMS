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
 * Generated on 16/04/2014, 12:32
 *
 */
package ims.emergency.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cornel Ventuneac
 */
public class DischargeServicesAndAdviceForDischargePlanningVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.DischargeServicesAndAdviceForDischargePlanningVo copy(ims.emergency.vo.DischargeServicesAndAdviceForDischargePlanningVo valueObjectDest, ims.emergency.vo.DischargeServicesAndAdviceForDischargePlanningVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_DischargeServicesAndAdvice(valueObjectSrc.getID_DischargeServicesAndAdvice());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// Episode
		valueObjectDest.setEpisode(valueObjectSrc.getEpisode());
		// Attendance
		valueObjectDest.setAttendance(valueObjectSrc.getAttendance());
		// SupportNetworkFamily
		valueObjectDest.setSupportNetworkFamily(valueObjectSrc.getSupportNetworkFamily());
		// SupportNetworkProfessionals
		valueObjectDest.setSupportNetworkProfessionals(valueObjectSrc.getSupportNetworkProfessionals());
		// SupportNetworkServices
		valueObjectDest.setSupportNetworkServices(valueObjectSrc.getSupportNetworkServices());
		// PatientMobility
		valueObjectDest.setPatientMobility(valueObjectSrc.getPatientMobility());
		// TransportArrangedType
		valueObjectDest.setTransportArrangedType(valueObjectSrc.getTransportArrangedType());
		// TransportDateTime
		valueObjectDest.setTransportDateTime(valueObjectSrc.getTransportDateTime());
		// Comments
		valueObjectDest.setComments(valueObjectSrc.getComments());
		// BookingNo
		valueObjectDest.setBookingNo(valueObjectSrc.getBookingNo());
		// AdviceLeafletsPrinted
		valueObjectDest.setAdviceLeafletsPrinted(valueObjectSrc.getAdviceLeafletsPrinted());
		// Equipment
		valueObjectDest.setEquipment(valueObjectSrc.getEquipment());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createDischargeServicesAndAdviceForDischargePlanningVoCollectionFromDischargeServicesAndAdvice(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.emergency.domain.objects.DischargeServicesAndAdvice objects.
	 */
	public static ims.emergency.vo.DischargeServicesAndAdviceForDischargePlanningVoCollection createDischargeServicesAndAdviceForDischargePlanningVoCollectionFromDischargeServicesAndAdvice(java.util.Set domainObjectSet)	
	{
		return createDischargeServicesAndAdviceForDischargePlanningVoCollectionFromDischargeServicesAndAdvice(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.emergency.domain.objects.DischargeServicesAndAdvice objects.
	 */
	public static ims.emergency.vo.DischargeServicesAndAdviceForDischargePlanningVoCollection createDischargeServicesAndAdviceForDischargePlanningVoCollectionFromDischargeServicesAndAdvice(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.DischargeServicesAndAdviceForDischargePlanningVoCollection voList = new ims.emergency.vo.DischargeServicesAndAdviceForDischargePlanningVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.emergency.domain.objects.DischargeServicesAndAdvice domainObject = (ims.emergency.domain.objects.DischargeServicesAndAdvice) iterator.next();
			ims.emergency.vo.DischargeServicesAndAdviceForDischargePlanningVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.emergency.domain.objects.DischargeServicesAndAdvice objects.
	 */
	public static ims.emergency.vo.DischargeServicesAndAdviceForDischargePlanningVoCollection createDischargeServicesAndAdviceForDischargePlanningVoCollectionFromDischargeServicesAndAdvice(java.util.List domainObjectList) 
	{
		return createDischargeServicesAndAdviceForDischargePlanningVoCollectionFromDischargeServicesAndAdvice(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.emergency.domain.objects.DischargeServicesAndAdvice objects.
	 */
	public static ims.emergency.vo.DischargeServicesAndAdviceForDischargePlanningVoCollection createDischargeServicesAndAdviceForDischargePlanningVoCollectionFromDischargeServicesAndAdvice(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.DischargeServicesAndAdviceForDischargePlanningVoCollection voList = new ims.emergency.vo.DischargeServicesAndAdviceForDischargePlanningVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.emergency.domain.objects.DischargeServicesAndAdvice domainObject = (ims.emergency.domain.objects.DischargeServicesAndAdvice) domainObjectList.get(i);
			ims.emergency.vo.DischargeServicesAndAdviceForDischargePlanningVo vo = create(map, domainObject);

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
	 * Create the ims.emergency.domain.objects.DischargeServicesAndAdvice set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractDischargeServicesAndAdviceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.DischargeServicesAndAdviceForDischargePlanningVoCollection voCollection) 
	 {
	 	return extractDischargeServicesAndAdviceSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractDischargeServicesAndAdviceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.DischargeServicesAndAdviceForDischargePlanningVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.DischargeServicesAndAdviceForDischargePlanningVo vo = voCollection.get(i);
			ims.emergency.domain.objects.DischargeServicesAndAdvice domainObject = DischargeServicesAndAdviceForDischargePlanningVoAssembler.extractDischargeServicesAndAdvice(domainFactory, vo, domMap);

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
	 * Create the ims.emergency.domain.objects.DischargeServicesAndAdvice list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractDischargeServicesAndAdviceList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.DischargeServicesAndAdviceForDischargePlanningVoCollection voCollection) 
	 {
	 	return extractDischargeServicesAndAdviceList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractDischargeServicesAndAdviceList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.DischargeServicesAndAdviceForDischargePlanningVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.DischargeServicesAndAdviceForDischargePlanningVo vo = voCollection.get(i);
			ims.emergency.domain.objects.DischargeServicesAndAdvice domainObject = DischargeServicesAndAdviceForDischargePlanningVoAssembler.extractDischargeServicesAndAdvice(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.emergency.domain.objects.DischargeServicesAndAdvice object.
	 * @param domainObject ims.emergency.domain.objects.DischargeServicesAndAdvice
	 */
	 public static ims.emergency.vo.DischargeServicesAndAdviceForDischargePlanningVo create(ims.emergency.domain.objects.DischargeServicesAndAdvice domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.emergency.domain.objects.DischargeServicesAndAdvice object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.emergency.vo.DischargeServicesAndAdviceForDischargePlanningVo create(DomainObjectMap map, ims.emergency.domain.objects.DischargeServicesAndAdvice domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.DischargeServicesAndAdviceForDischargePlanningVo valueObject = (ims.emergency.vo.DischargeServicesAndAdviceForDischargePlanningVo) map.getValueObject(domainObject, ims.emergency.vo.DischargeServicesAndAdviceForDischargePlanningVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.DischargeServicesAndAdviceForDischargePlanningVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.emergency.domain.objects.DischargeServicesAndAdvice
	 */
	 public static ims.emergency.vo.DischargeServicesAndAdviceForDischargePlanningVo insert(ims.emergency.vo.DischargeServicesAndAdviceForDischargePlanningVo valueObject, ims.emergency.domain.objects.DischargeServicesAndAdvice domainObject) 
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
	 * @param domainObject ims.emergency.domain.objects.DischargeServicesAndAdvice
	 */
	 public static ims.emergency.vo.DischargeServicesAndAdviceForDischargePlanningVo insert(DomainObjectMap map, ims.emergency.vo.DischargeServicesAndAdviceForDischargePlanningVo valueObject, ims.emergency.domain.objects.DischargeServicesAndAdvice domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_DischargeServicesAndAdvice(domainObject.getId());
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
		// SupportNetworkFamily
		valueObject.setSupportNetworkFamily(ims.core.vo.domain.SupportNetworkFamilyAssembler.createSupportNetworkFamilyCollectionFromSupportNetworkFamily(map, domainObject.getSupportNetworkFamily()) );
		// SupportNetworkProfessionals
		valueObject.setSupportNetworkProfessionals(ims.core.vo.domain.SupportNetworkProfessionalVoAssembler.createSupportNetworkProfessionalVoCollectionFromSupportNetworkProfessional(map, domainObject.getSupportNetworkProfessionals()) );
		// SupportNetworkServices
		valueObject.setSupportNetworkServices(ims.core.vo.domain.SupportNetworkServicesVoAssembler.createSupportNetworkServicesVoCollectionFromSupportNetworkServices(map, domainObject.getSupportNetworkServices()) );
		// PatientMobility
		java.util.List listPatientMobility = domainObject.getPatientMobility();
		ims.core.vo.lookups.PatientMobilityCollection PatientMobility = new ims.core.vo.lookups.PatientMobilityCollection();
		for(java.util.Iterator iterator = listPatientMobility.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.core.vo.lookups.PatientMobility voInstance = new ims.core.vo.lookups.PatientMobility(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.core.vo.lookups.PatientMobility parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.core.vo.lookups.PatientMobility(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			PatientMobility.add(voInstance);
		}
		valueObject.setPatientMobility( PatientMobility );
		// TransportArrangedType
		ims.domain.lookups.LookupInstance instance8 = domainObject.getTransportArrangedType();
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

			ims.scheduling.vo.lookups.ApptTransportType voLookup8 = new ims.scheduling.vo.lookups.ApptTransportType(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.scheduling.vo.lookups.ApptTransportType parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.scheduling.vo.lookups.ApptTransportType(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setTransportArrangedType(voLookup8);
		}
				// TransportDateTime
		java.util.Date TransportDateTime = domainObject.getTransportDateTime();
		if ( null != TransportDateTime ) 
		{
			valueObject.setTransportDateTime(new ims.framework.utils.DateTime(TransportDateTime) );
		}
		// Comments
		valueObject.setComments(domainObject.getComments());
		// BookingNo
		valueObject.setBookingNo(domainObject.getBookingNo());
		// AdviceLeafletsPrinted
		valueObject.setAdviceLeafletsPrinted(ims.emergency.vo.domain.AdviceLeafletsForSelectAndPrinterVoAssembler.createAdviceLeafletsForSelectAndPrinterVoCollectionFromAdviceLeaflets(map, domainObject.getAdviceLeafletsPrinted()) );
		// Equipment
		java.util.List listEquipment = domainObject.getEquipment();
		ims.emergency.vo.lookups.DischargequipmentCollection Equipment = new ims.emergency.vo.lookups.DischargequipmentCollection();
		for(java.util.Iterator iterator = listEquipment.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.emergency.vo.lookups.Dischargequipment voInstance = new ims.emergency.vo.lookups.Dischargequipment(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.emergency.vo.lookups.Dischargequipment parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.emergency.vo.lookups.Dischargequipment(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			Equipment.add(voInstance);
		}
		valueObject.setEquipment( Equipment );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.emergency.domain.objects.DischargeServicesAndAdvice extractDischargeServicesAndAdvice(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.DischargeServicesAndAdviceForDischargePlanningVo valueObject) 
	{
		return 	extractDischargeServicesAndAdvice(domainFactory, valueObject, new HashMap());
	}

	public static ims.emergency.domain.objects.DischargeServicesAndAdvice extractDischargeServicesAndAdvice(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.DischargeServicesAndAdviceForDischargePlanningVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_DischargeServicesAndAdvice();
		ims.emergency.domain.objects.DischargeServicesAndAdvice domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.emergency.domain.objects.DischargeServicesAndAdvice)domMap.get(valueObject);
			}
			// ims.emergency.vo.DischargeServicesAndAdviceForDischargePlanningVo ID_DischargeServicesAndAdvice field is unknown
			domainObject = new ims.emergency.domain.objects.DischargeServicesAndAdvice();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_DischargeServicesAndAdvice());
			if (domMap.get(key) != null)
			{
				return (ims.emergency.domain.objects.DischargeServicesAndAdvice)domMap.get(key);
			}
			domainObject = (ims.emergency.domain.objects.DischargeServicesAndAdvice) domainFactory.getDomainObject(ims.emergency.domain.objects.DischargeServicesAndAdvice.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_DischargeServicesAndAdvice());

		ims.core.patient.domain.objects.Patient value1 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value1 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getPatient();	
			}
			else
			{
				value1 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value1);
		ims.core.admin.domain.objects.EpisodeOfCare value2 = null;
		if ( null != valueObject.getEpisode() ) 
		{
			if (valueObject.getEpisode().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisode()) != null)
				{
					value2 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisode());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getEpisode();	
			}
			else
			{
				value2 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisode().getBoId());
			}
		}
		domainObject.setEpisode(value2);
		ims.core.admin.domain.objects.CareContext value3 = null;
		if ( null != valueObject.getAttendance() ) 
		{
			if (valueObject.getAttendance().getBoId() == null)
			{
				if (domMap.get(valueObject.getAttendance()) != null)
				{
					value3 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getAttendance());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getAttendance();	
			}
			else
			{
				value3 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getAttendance().getBoId());
			}
		}
		domainObject.setAttendance(value3);

		// SaveAsRefVO treated as RefValueObject
		ims.core.clinical.vo.SupportNetworkFamilyRefVoCollection refCollection4 = new ims.core.clinical.vo.SupportNetworkFamilyRefVoCollection();
		if (valueObject.getSupportNetworkFamily() != null)
		{
			for (int i4=0; i4<valueObject.getSupportNetworkFamily().size(); i4++)
			{
				ims.core.clinical.vo.SupportNetworkFamilyRefVo ref4 = (ims.core.clinical.vo.SupportNetworkFamilyRefVo)valueObject.getSupportNetworkFamily().get(i4);
				refCollection4.add(ref4);
			}
		}
		int size4 = (null == refCollection4) ? 0 : refCollection4.size();		
		java.util.List domainSupportNetworkFamily4 = domainObject.getSupportNetworkFamily();
		if (domainSupportNetworkFamily4 == null)
		{
			domainSupportNetworkFamily4 = new java.util.ArrayList();
		}
		for(int i=0; i < size4; i++) 
		{
			ims.core.clinical.vo.SupportNetworkFamilyRefVo vo = refCollection4.get(i);			
			ims.core.clinical.domain.objects.SupportNetworkFamily dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.clinical.domain.objects.SupportNetworkFamily)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.clinical.domain.objects.SupportNetworkFamily)domainFactory.getDomainObject( ims.core.clinical.domain.objects.SupportNetworkFamily.class, vo.getBoId());
				}
			}

			int domIdx = domainSupportNetworkFamily4.indexOf(dom);
			if (domIdx == -1)
			{
				domainSupportNetworkFamily4.add(i, dom);
			}
			else if (i != domIdx && i < domainSupportNetworkFamily4.size())
			{
				Object tmp = domainSupportNetworkFamily4.get(i);
				domainSupportNetworkFamily4.set(i, domainSupportNetworkFamily4.get(domIdx));
				domainSupportNetworkFamily4.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i4 = domainSupportNetworkFamily4.size();
		while (i4 > size4)
		{
			domainSupportNetworkFamily4.remove(i4-1);
			i4 = domainSupportNetworkFamily4.size();
		}
		
		domainObject.setSupportNetworkFamily(domainSupportNetworkFamily4);		

		// SaveAsRefVO treated as RefValueObject
		ims.core.clinical.vo.SupportNetworkProfessionalRefVoCollection refCollection5 = new ims.core.clinical.vo.SupportNetworkProfessionalRefVoCollection();
		if (valueObject.getSupportNetworkProfessionals() != null)
		{
			for (int i5=0; i5<valueObject.getSupportNetworkProfessionals().size(); i5++)
			{
				ims.core.clinical.vo.SupportNetworkProfessionalRefVo ref5 = (ims.core.clinical.vo.SupportNetworkProfessionalRefVo)valueObject.getSupportNetworkProfessionals().get(i5);
				refCollection5.add(ref5);
			}
		}
		int size5 = (null == refCollection5) ? 0 : refCollection5.size();		
		java.util.List domainSupportNetworkProfessionals5 = domainObject.getSupportNetworkProfessionals();
		if (domainSupportNetworkProfessionals5 == null)
		{
			domainSupportNetworkProfessionals5 = new java.util.ArrayList();
		}
		for(int i=0; i < size5; i++) 
		{
			ims.core.clinical.vo.SupportNetworkProfessionalRefVo vo = refCollection5.get(i);			
			ims.core.clinical.domain.objects.SupportNetworkProfessional dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.clinical.domain.objects.SupportNetworkProfessional)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.clinical.domain.objects.SupportNetworkProfessional)domainFactory.getDomainObject( ims.core.clinical.domain.objects.SupportNetworkProfessional.class, vo.getBoId());
				}
			}

			int domIdx = domainSupportNetworkProfessionals5.indexOf(dom);
			if (domIdx == -1)
			{
				domainSupportNetworkProfessionals5.add(i, dom);
			}
			else if (i != domIdx && i < domainSupportNetworkProfessionals5.size())
			{
				Object tmp = domainSupportNetworkProfessionals5.get(i);
				domainSupportNetworkProfessionals5.set(i, domainSupportNetworkProfessionals5.get(domIdx));
				domainSupportNetworkProfessionals5.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i5 = domainSupportNetworkProfessionals5.size();
		while (i5 > size5)
		{
			domainSupportNetworkProfessionals5.remove(i5-1);
			i5 = domainSupportNetworkProfessionals5.size();
		}
		
		domainObject.setSupportNetworkProfessionals(domainSupportNetworkProfessionals5);		

		// SaveAsRefVO treated as RefValueObject
		ims.core.clinical.vo.SupportNetworkServicesRefVoCollection refCollection6 = new ims.core.clinical.vo.SupportNetworkServicesRefVoCollection();
		if (valueObject.getSupportNetworkServices() != null)
		{
			for (int i6=0; i6<valueObject.getSupportNetworkServices().size(); i6++)
			{
				ims.core.clinical.vo.SupportNetworkServicesRefVo ref6 = (ims.core.clinical.vo.SupportNetworkServicesRefVo)valueObject.getSupportNetworkServices().get(i6);
				refCollection6.add(ref6);
			}
		}
		int size6 = (null == refCollection6) ? 0 : refCollection6.size();		
		java.util.List domainSupportNetworkServices6 = domainObject.getSupportNetworkServices();
		if (domainSupportNetworkServices6 == null)
		{
			domainSupportNetworkServices6 = new java.util.ArrayList();
		}
		for(int i=0; i < size6; i++) 
		{
			ims.core.clinical.vo.SupportNetworkServicesRefVo vo = refCollection6.get(i);			
			ims.core.clinical.domain.objects.SupportNetworkServices dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.clinical.domain.objects.SupportNetworkServices)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.clinical.domain.objects.SupportNetworkServices)domainFactory.getDomainObject( ims.core.clinical.domain.objects.SupportNetworkServices.class, vo.getBoId());
				}
			}

			int domIdx = domainSupportNetworkServices6.indexOf(dom);
			if (domIdx == -1)
			{
				domainSupportNetworkServices6.add(i, dom);
			}
			else if (i != domIdx && i < domainSupportNetworkServices6.size())
			{
				Object tmp = domainSupportNetworkServices6.get(i);
				domainSupportNetworkServices6.set(i, domainSupportNetworkServices6.get(domIdx));
				domainSupportNetworkServices6.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i6 = domainSupportNetworkServices6.size();
		while (i6 > size6)
		{
			domainSupportNetworkServices6.remove(i6-1);
			i6 = domainSupportNetworkServices6.size();
		}
		
		domainObject.setSupportNetworkServices(domainSupportNetworkServices6);		
		ims.core.vo.lookups.PatientMobilityCollection collection7 =
	valueObject.getPatientMobility();
	    java.util.List domainPatientMobility = domainObject.getPatientMobility();;			
	    int collection7Size=0;
		if (collection7 == null)
		{
			domainPatientMobility = new java.util.ArrayList(0);
		}
		else
		{
			collection7Size = collection7.size();
		}
		
		for(int i=0; i<collection7Size; i++) 
		{
			int instanceId = collection7.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainPatientMobility.indexOf(dom);
			if (domIdx == -1)
			{
				domainPatientMobility.add(i, dom);
			}
			else if (i != domIdx && i < domainPatientMobility.size())
			{
				Object tmp = domainPatientMobility.get(i);
				domainPatientMobility.set(i, domainPatientMobility.get(domIdx));
				domainPatientMobility.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j7 = domainPatientMobility.size();
		while (j7 > collection7Size)
		{
			domainPatientMobility.remove(j7-1);
			j7 = domainPatientMobility.size();
		}

		domainObject.setPatientMobility(domainPatientMobility);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getTransportArrangedType() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getTransportArrangedType().getID());
		}
		domainObject.setTransportArrangedType(value8);
		ims.framework.utils.DateTime dateTime9 = valueObject.getTransportDateTime();
		java.util.Date value9 = null;
		if ( dateTime9 != null ) 
		{
			value9 = dateTime9.getJavaDate();
		}
		domainObject.setTransportDateTime(value9);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComments() != null && valueObject.getComments().equals(""))
		{
			valueObject.setComments(null);
		}
		domainObject.setComments(valueObject.getComments());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getBookingNo() != null && valueObject.getBookingNo().equals(""))
		{
			valueObject.setBookingNo(null);
		}
		domainObject.setBookingNo(valueObject.getBookingNo());
		domainObject.setAdviceLeafletsPrinted(ims.emergency.vo.domain.AdviceLeafletsForSelectAndPrinterVoAssembler.extractAdviceLeafletsList(domainFactory, valueObject.getAdviceLeafletsPrinted(), domainObject.getAdviceLeafletsPrinted(), domMap));		
		ims.emergency.vo.lookups.DischargequipmentCollection collection13 =
	valueObject.getEquipment();
	    java.util.List domainEquipment = domainObject.getEquipment();;			
	    int collection13Size=0;
		if (collection13 == null)
		{
			domainEquipment = new java.util.ArrayList(0);
		}
		else
		{
			collection13Size = collection13.size();
		}
		
		for(int i=0; i<collection13Size; i++) 
		{
			int instanceId = collection13.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainEquipment.indexOf(dom);
			if (domIdx == -1)
			{
				domainEquipment.add(i, dom);
			}
			else if (i != domIdx && i < domainEquipment.size())
			{
				Object tmp = domainEquipment.get(i);
				domainEquipment.set(i, domainEquipment.get(domIdx));
				domainEquipment.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j13 = domainEquipment.size();
		while (j13 > collection13Size)
		{
			domainEquipment.remove(j13-1);
			j13 = domainEquipment.size();
		}

		domainObject.setEquipment(domainEquipment);		

		return domainObject;
	}

}
