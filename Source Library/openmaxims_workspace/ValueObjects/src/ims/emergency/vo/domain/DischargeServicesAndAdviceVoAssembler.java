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
package ims.emergency.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author George Cristian Josan
 */
public class DischargeServicesAndAdviceVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.DischargeServicesAndAdviceVo copy(ims.emergency.vo.DischargeServicesAndAdviceVo valueObjectDest, ims.emergency.vo.DischargeServicesAndAdviceVo valueObjectSrc) 
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
		// SupportNetworkFamily
		valueObjectDest.setSupportNetworkFamily(valueObjectSrc.getSupportNetworkFamily());
		// SupportNetworkProfessionals
		valueObjectDest.setSupportNetworkProfessionals(valueObjectSrc.getSupportNetworkProfessionals());
		// SupportNetworkServices
		valueObjectDest.setSupportNetworkServices(valueObjectSrc.getSupportNetworkServices());
		// Equipment
		valueObjectDest.setEquipment(valueObjectSrc.getEquipment());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createDischargeServicesAndAdviceVoCollectionFromDischargeServicesAndAdvice(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.emergency.domain.objects.DischargeServicesAndAdvice objects.
	 */
	public static ims.emergency.vo.DischargeServicesAndAdviceVoCollection createDischargeServicesAndAdviceVoCollectionFromDischargeServicesAndAdvice(java.util.Set domainObjectSet)	
	{
		return createDischargeServicesAndAdviceVoCollectionFromDischargeServicesAndAdvice(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.emergency.domain.objects.DischargeServicesAndAdvice objects.
	 */
	public static ims.emergency.vo.DischargeServicesAndAdviceVoCollection createDischargeServicesAndAdviceVoCollectionFromDischargeServicesAndAdvice(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.DischargeServicesAndAdviceVoCollection voList = new ims.emergency.vo.DischargeServicesAndAdviceVoCollection();
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
			ims.emergency.vo.DischargeServicesAndAdviceVo vo = create(map, domainObject);
			
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
	public static ims.emergency.vo.DischargeServicesAndAdviceVoCollection createDischargeServicesAndAdviceVoCollectionFromDischargeServicesAndAdvice(java.util.List domainObjectList) 
	{
		return createDischargeServicesAndAdviceVoCollectionFromDischargeServicesAndAdvice(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.emergency.domain.objects.DischargeServicesAndAdvice objects.
	 */
	public static ims.emergency.vo.DischargeServicesAndAdviceVoCollection createDischargeServicesAndAdviceVoCollectionFromDischargeServicesAndAdvice(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.DischargeServicesAndAdviceVoCollection voList = new ims.emergency.vo.DischargeServicesAndAdviceVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.emergency.domain.objects.DischargeServicesAndAdvice domainObject = (ims.emergency.domain.objects.DischargeServicesAndAdvice) domainObjectList.get(i);
			ims.emergency.vo.DischargeServicesAndAdviceVo vo = create(map, domainObject);

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
	 public static java.util.Set extractDischargeServicesAndAdviceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.DischargeServicesAndAdviceVoCollection voCollection) 
	 {
	 	return extractDischargeServicesAndAdviceSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractDischargeServicesAndAdviceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.DischargeServicesAndAdviceVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.DischargeServicesAndAdviceVo vo = voCollection.get(i);
			ims.emergency.domain.objects.DischargeServicesAndAdvice domainObject = DischargeServicesAndAdviceVoAssembler.extractDischargeServicesAndAdvice(domainFactory, vo, domMap);

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
	 public static java.util.List extractDischargeServicesAndAdviceList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.DischargeServicesAndAdviceVoCollection voCollection) 
	 {
	 	return extractDischargeServicesAndAdviceList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractDischargeServicesAndAdviceList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.DischargeServicesAndAdviceVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.DischargeServicesAndAdviceVo vo = voCollection.get(i);
			ims.emergency.domain.objects.DischargeServicesAndAdvice domainObject = DischargeServicesAndAdviceVoAssembler.extractDischargeServicesAndAdvice(domainFactory, vo, domMap);

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
	 public static ims.emergency.vo.DischargeServicesAndAdviceVo create(ims.emergency.domain.objects.DischargeServicesAndAdvice domainObject) 
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
	  public static ims.emergency.vo.DischargeServicesAndAdviceVo create(DomainObjectMap map, ims.emergency.domain.objects.DischargeServicesAndAdvice domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.DischargeServicesAndAdviceVo valueObject = (ims.emergency.vo.DischargeServicesAndAdviceVo) map.getValueObject(domainObject, ims.emergency.vo.DischargeServicesAndAdviceVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.DischargeServicesAndAdviceVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.emergency.vo.DischargeServicesAndAdviceVo insert(ims.emergency.vo.DischargeServicesAndAdviceVo valueObject, ims.emergency.domain.objects.DischargeServicesAndAdvice domainObject) 
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
	 public static ims.emergency.vo.DischargeServicesAndAdviceVo insert(DomainObjectMap map, ims.emergency.vo.DischargeServicesAndAdviceVo valueObject, ims.emergency.domain.objects.DischargeServicesAndAdvice domainObject) 
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
		ims.domain.lookups.LookupInstance instance5 = domainObject.getTransportArrangedType();
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

			ims.scheduling.vo.lookups.ApptTransportType voLookup5 = new ims.scheduling.vo.lookups.ApptTransportType(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.scheduling.vo.lookups.ApptTransportType parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.scheduling.vo.lookups.ApptTransportType(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setTransportArrangedType(voLookup5);
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
		// SupportNetworkFamily
		valueObject.setSupportNetworkFamily(ims.core.vo.domain.SupportNetworkFamilyAssembler.createSupportNetworkFamilyCollectionFromSupportNetworkFamily(map, domainObject.getSupportNetworkFamily()) );
		// SupportNetworkProfessionals
		valueObject.setSupportNetworkProfessionals(ims.core.vo.domain.SupportNetworkProfessionalVoAssembler.createSupportNetworkProfessionalVoCollectionFromSupportNetworkProfessional(map, domainObject.getSupportNetworkProfessionals()) );
		// SupportNetworkServices
		valueObject.setSupportNetworkServices(ims.core.vo.domain.SupportNetworkServicesVoAssembler.createSupportNetworkServicesVoCollectionFromSupportNetworkServices(map, domainObject.getSupportNetworkServices()) );
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
	public static ims.emergency.domain.objects.DischargeServicesAndAdvice extractDischargeServicesAndAdvice(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.DischargeServicesAndAdviceVo valueObject) 
	{
		return 	extractDischargeServicesAndAdvice(domainFactory, valueObject, new HashMap());
	}

	public static ims.emergency.domain.objects.DischargeServicesAndAdvice extractDischargeServicesAndAdvice(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.DischargeServicesAndAdviceVo valueObject, HashMap domMap) 
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
			// ims.emergency.vo.DischargeServicesAndAdviceVo ID_DischargeServicesAndAdvice field is unknown
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
		ims.core.vo.lookups.PatientMobilityCollection collection4 =
	valueObject.getPatientMobility();
	    java.util.List domainPatientMobility = domainObject.getPatientMobility();;			
	    int collection4Size=0;
		if (collection4 == null)
		{
			domainPatientMobility = new java.util.ArrayList(0);
		}
		else
		{
			collection4Size = collection4.size();
		}
		
		for(int i=0; i<collection4Size; i++) 
		{
			int instanceId = collection4.get(i).getID();
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
		int j4 = domainPatientMobility.size();
		while (j4 > collection4Size)
		{
			domainPatientMobility.remove(j4-1);
			j4 = domainPatientMobility.size();
		}

		domainObject.setPatientMobility(domainPatientMobility);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getTransportArrangedType() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getTransportArrangedType().getID());
		}
		domainObject.setTransportArrangedType(value5);
		ims.framework.utils.DateTime dateTime6 = valueObject.getTransportDateTime();
		java.util.Date value6 = null;
		if ( dateTime6 != null ) 
		{
			value6 = dateTime6.getJavaDate();
		}
		domainObject.setTransportDateTime(value6);
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
		domainObject.setSupportNetworkFamily(ims.core.vo.domain.SupportNetworkFamilyAssembler.extractSupportNetworkFamilyList(domainFactory, valueObject.getSupportNetworkFamily(), domainObject.getSupportNetworkFamily(), domMap));		
		domainObject.setSupportNetworkProfessionals(ims.core.vo.domain.SupportNetworkProfessionalVoAssembler.extractSupportNetworkProfessionalList(domainFactory, valueObject.getSupportNetworkProfessionals(), domainObject.getSupportNetworkProfessionals(), domMap));		
		domainObject.setSupportNetworkServices(ims.core.vo.domain.SupportNetworkServicesVoAssembler.extractSupportNetworkServicesList(domainFactory, valueObject.getSupportNetworkServices(), domainObject.getSupportNetworkServices(), domMap));		
		ims.emergency.vo.lookups.DischargequipmentCollection collection12 =
	valueObject.getEquipment();
	    java.util.List domainEquipment = domainObject.getEquipment();;			
	    int collection12Size=0;
		if (collection12 == null)
		{
			domainEquipment = new java.util.ArrayList(0);
		}
		else
		{
			collection12Size = collection12.size();
		}
		
		for(int i=0; i<collection12Size; i++) 
		{
			int instanceId = collection12.get(i).getID();
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
		int j12 = domainEquipment.size();
		while (j12 > collection12Size)
		{
			domainEquipment.remove(j12-1);
			j12 = domainEquipment.size();
		}

		domainObject.setEquipment(domainEquipment);		

		return domainObject;
	}

}
