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
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class HospitalAtNightPatientDetailVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.HospitalAtNightPatientDetailVo copy(ims.clinical.vo.HospitalAtNightPatientDetailVo valueObjectDest, ims.clinical.vo.HospitalAtNightPatientDetailVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_HospitalAtNightPatientDetail(valueObjectSrc.getID_HospitalAtNightPatientDetail());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// Situation
		valueObjectDest.setSituation(valueObjectSrc.getSituation());
		// Background
		valueObjectDest.setBackground(valueObjectSrc.getBackground());
		// Assessment
		valueObjectDest.setAssessment(valueObjectSrc.getAssessment());
		// Recommendation
		valueObjectDest.setRecommendation(valueObjectSrc.getRecommendation());
		// MEWS
		valueObjectDest.setMEWS(valueObjectSrc.getMEWS());
		// TypeOfRequest
		valueObjectDest.setTypeOfRequest(valueObjectSrc.getTypeOfRequest());
		// ClinicalTasks
		valueObjectDest.setClinicalTasks(valueObjectSrc.getClinicalTasks());
		// RequestingDateTime
		valueObjectDest.setRequestingDateTime(valueObjectSrc.getRequestingDateTime());
		// RequestingHCP
		valueObjectDest.setRequestingHCP(valueObjectSrc.getRequestingHCP());
		// Notes
		valueObjectDest.setNotes(valueObjectSrc.getNotes());
		// WardWhenPlacedOnList
		valueObjectDest.setWardWhenPlacedOnList(valueObjectSrc.getWardWhenPlacedOnList());
		// HospitalAtNightListAndDates
		valueObjectDest.setHospitalAtNightListAndDates(valueObjectSrc.getHospitalAtNightListAndDates());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// StatusHistory
		valueObjectDest.setStatusHistory(valueObjectSrc.getStatusHistory());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createHospitalAtNightPatientDetailVoCollectionFromHospitalAtNightPatientDetail(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.HospitalAtNightPatientDetail objects.
	 */
	public static ims.clinical.vo.HospitalAtNightPatientDetailVoCollection createHospitalAtNightPatientDetailVoCollectionFromHospitalAtNightPatientDetail(java.util.Set domainObjectSet)	
	{
		return createHospitalAtNightPatientDetailVoCollectionFromHospitalAtNightPatientDetail(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.HospitalAtNightPatientDetail objects.
	 */
	public static ims.clinical.vo.HospitalAtNightPatientDetailVoCollection createHospitalAtNightPatientDetailVoCollectionFromHospitalAtNightPatientDetail(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.HospitalAtNightPatientDetailVoCollection voList = new ims.clinical.vo.HospitalAtNightPatientDetailVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.HospitalAtNightPatientDetail domainObject = (ims.clinical.domain.objects.HospitalAtNightPatientDetail) iterator.next();
			ims.clinical.vo.HospitalAtNightPatientDetailVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.HospitalAtNightPatientDetail objects.
	 */
	public static ims.clinical.vo.HospitalAtNightPatientDetailVoCollection createHospitalAtNightPatientDetailVoCollectionFromHospitalAtNightPatientDetail(java.util.List domainObjectList) 
	{
		return createHospitalAtNightPatientDetailVoCollectionFromHospitalAtNightPatientDetail(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.HospitalAtNightPatientDetail objects.
	 */
	public static ims.clinical.vo.HospitalAtNightPatientDetailVoCollection createHospitalAtNightPatientDetailVoCollectionFromHospitalAtNightPatientDetail(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.HospitalAtNightPatientDetailVoCollection voList = new ims.clinical.vo.HospitalAtNightPatientDetailVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.HospitalAtNightPatientDetail domainObject = (ims.clinical.domain.objects.HospitalAtNightPatientDetail) domainObjectList.get(i);
			ims.clinical.vo.HospitalAtNightPatientDetailVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.HospitalAtNightPatientDetail set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractHospitalAtNightPatientDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.HospitalAtNightPatientDetailVoCollection voCollection) 
	 {
	 	return extractHospitalAtNightPatientDetailSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractHospitalAtNightPatientDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.HospitalAtNightPatientDetailVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.HospitalAtNightPatientDetailVo vo = voCollection.get(i);
			ims.clinical.domain.objects.HospitalAtNightPatientDetail domainObject = HospitalAtNightPatientDetailVoAssembler.extractHospitalAtNightPatientDetail(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.HospitalAtNightPatientDetail list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractHospitalAtNightPatientDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.HospitalAtNightPatientDetailVoCollection voCollection) 
	 {
	 	return extractHospitalAtNightPatientDetailList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractHospitalAtNightPatientDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.HospitalAtNightPatientDetailVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.HospitalAtNightPatientDetailVo vo = voCollection.get(i);
			ims.clinical.domain.objects.HospitalAtNightPatientDetail domainObject = HospitalAtNightPatientDetailVoAssembler.extractHospitalAtNightPatientDetail(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.HospitalAtNightPatientDetail object.
	 * @param domainObject ims.clinical.domain.objects.HospitalAtNightPatientDetail
	 */
	 public static ims.clinical.vo.HospitalAtNightPatientDetailVo create(ims.clinical.domain.objects.HospitalAtNightPatientDetail domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.HospitalAtNightPatientDetail object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.HospitalAtNightPatientDetailVo create(DomainObjectMap map, ims.clinical.domain.objects.HospitalAtNightPatientDetail domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.HospitalAtNightPatientDetailVo valueObject = (ims.clinical.vo.HospitalAtNightPatientDetailVo) map.getValueObject(domainObject, ims.clinical.vo.HospitalAtNightPatientDetailVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.HospitalAtNightPatientDetailVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.HospitalAtNightPatientDetail
	 */
	 public static ims.clinical.vo.HospitalAtNightPatientDetailVo insert(ims.clinical.vo.HospitalAtNightPatientDetailVo valueObject, ims.clinical.domain.objects.HospitalAtNightPatientDetail domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.HospitalAtNightPatientDetail
	 */
	 public static ims.clinical.vo.HospitalAtNightPatientDetailVo insert(DomainObjectMap map, ims.clinical.vo.HospitalAtNightPatientDetailVo valueObject, ims.clinical.domain.objects.HospitalAtNightPatientDetail domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_HospitalAtNightPatientDetail(domainObject.getId());
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
		// Situation
		valueObject.setSituation(domainObject.getSituation());
		// Background
		valueObject.setBackground(domainObject.getBackground());
		// Assessment
		valueObject.setAssessment(domainObject.getAssessment());
		// Recommendation
		valueObject.setRecommendation(domainObject.getRecommendation());
		// MEWS
		ims.domain.lookups.LookupInstance instance7 = domainObject.getMEWS();
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

			ims.clinical.vo.lookups.MEWS voLookup7 = new ims.clinical.vo.lookups.MEWS(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.clinical.vo.lookups.MEWS parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.clinical.vo.lookups.MEWS(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setMEWS(voLookup7);
		}
				// TypeOfRequest
		ims.domain.lookups.LookupInstance instance8 = domainObject.getTypeOfRequest();
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

			ims.clinical.vo.lookups.HospitalAtNightRequestType voLookup8 = new ims.clinical.vo.lookups.HospitalAtNightRequestType(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.clinical.vo.lookups.HospitalAtNightRequestType parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.clinical.vo.lookups.HospitalAtNightRequestType(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setTypeOfRequest(voLookup8);
		}
				// ClinicalTasks
		java.util.List listClinicalTasks = domainObject.getClinicalTasks();
		ims.clinical.vo.lookups.HospitalAtNightClinicalTaskCollection ClinicalTasks = new ims.clinical.vo.lookups.HospitalAtNightClinicalTaskCollection();
		for(java.util.Iterator iterator = listClinicalTasks.iterator(); iterator.hasNext(); ) 
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
			ims.clinical.vo.lookups.HospitalAtNightClinicalTask voInstance = new ims.clinical.vo.lookups.HospitalAtNightClinicalTask(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.clinical.vo.lookups.HospitalAtNightClinicalTask parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.clinical.vo.lookups.HospitalAtNightClinicalTask(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			ClinicalTasks.add(voInstance);
		}
		valueObject.setClinicalTasks( ClinicalTasks );
		// RequestingDateTime
		java.util.Date RequestingDateTime = domainObject.getRequestingDateTime();
		if ( null != RequestingDateTime ) 
		{
			valueObject.setRequestingDateTime(new ims.framework.utils.DateTime(RequestingDateTime) );
		}
		// RequestingHCP
		valueObject.setRequestingHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getRequestingHCP()) );
		// Notes
		valueObject.setNotes(ims.clinical.vo.domain.HospitalAtNightNotesVoAssembler.createHospitalAtNightNotesVoCollectionFromHospitalAtNightNotes(map, domainObject.getNotes()) );
		// WardWhenPlacedOnList
		if (domainObject.getWardWhenPlacedOnList() != null)
		{
			if(domainObject.getWardWhenPlacedOnList() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getWardWhenPlacedOnList();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setWardWhenPlacedOnList(new ims.core.resource.place.vo.LocationRefVo(id, -1));				
			}
			else
			{
				valueObject.setWardWhenPlacedOnList(new ims.core.resource.place.vo.LocationRefVo(domainObject.getWardWhenPlacedOnList().getId(), domainObject.getWardWhenPlacedOnList().getVersion()));
			}
		}
		// HospitalAtNightListAndDates
		if (domainObject.getHospitalAtNightListAndDates() != null)
		{
			if(domainObject.getHospitalAtNightListAndDates() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getHospitalAtNightListAndDates();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setHospitalAtNightListAndDates(new ims.clinical.vo.HospitalAtNightListandDatesRefVo(id, -1));				
			}
			else
			{
				valueObject.setHospitalAtNightListAndDates(new ims.clinical.vo.HospitalAtNightListandDatesRefVo(domainObject.getHospitalAtNightListAndDates().getId(), domainObject.getHospitalAtNightListAndDates().getVersion()));
			}
		}
		// CurrentStatus
		valueObject.setCurrentStatus(ims.clinical.vo.domain.HospitalAtNightPatientDetailStatusVoAssembler.create(map, domainObject.getCurrentStatus()) );
		// StatusHistory
		valueObject.setStatusHistory(ims.clinical.vo.domain.HospitalAtNightPatientDetailStatusVoAssembler.createHospitalAtNightPatientDetailStatusVoCollectionFromHospitalAtNightPatientDetailStatus(map, domainObject.getStatusHistory()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.HospitalAtNightPatientDetail extractHospitalAtNightPatientDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.HospitalAtNightPatientDetailVo valueObject) 
	{
		return 	extractHospitalAtNightPatientDetail(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.HospitalAtNightPatientDetail extractHospitalAtNightPatientDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.HospitalAtNightPatientDetailVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_HospitalAtNightPatientDetail();
		ims.clinical.domain.objects.HospitalAtNightPatientDetail domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.HospitalAtNightPatientDetail)domMap.get(valueObject);
			}
			// ims.clinical.vo.HospitalAtNightPatientDetailVo ID_HospitalAtNightPatientDetail field is unknown
			domainObject = new ims.clinical.domain.objects.HospitalAtNightPatientDetail();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_HospitalAtNightPatientDetail());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.HospitalAtNightPatientDetail)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.HospitalAtNightPatientDetail) domainFactory.getDomainObject(ims.clinical.domain.objects.HospitalAtNightPatientDetail.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_HospitalAtNightPatientDetail());

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
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSituation() != null && valueObject.getSituation().equals(""))
		{
			valueObject.setSituation(null);
		}
		domainObject.setSituation(valueObject.getSituation());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getBackground() != null && valueObject.getBackground().equals(""))
		{
			valueObject.setBackground(null);
		}
		domainObject.setBackground(valueObject.getBackground());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAssessment() != null && valueObject.getAssessment().equals(""))
		{
			valueObject.setAssessment(null);
		}
		domainObject.setAssessment(valueObject.getAssessment());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getRecommendation() != null && valueObject.getRecommendation().equals(""))
		{
			valueObject.setRecommendation(null);
		}
		domainObject.setRecommendation(valueObject.getRecommendation());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getMEWS() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getMEWS().getID());
		}
		domainObject.setMEWS(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getTypeOfRequest() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getTypeOfRequest().getID());
		}
		domainObject.setTypeOfRequest(value8);
		ims.clinical.vo.lookups.HospitalAtNightClinicalTaskCollection collection9 =
	valueObject.getClinicalTasks();
	    java.util.List domainClinicalTasks = domainObject.getClinicalTasks();;			
	    int collection9Size=0;
		if (collection9 == null)
		{
			domainClinicalTasks = new java.util.ArrayList(0);
		}
		else
		{
			collection9Size = collection9.size();
		}
		
		for(int i=0; i<collection9Size; i++) 
		{
			int instanceId = collection9.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainClinicalTasks.indexOf(dom);
			if (domIdx == -1)
			{
				domainClinicalTasks.add(i, dom);
			}
			else if (i != domIdx && i < domainClinicalTasks.size())
			{
				Object tmp = domainClinicalTasks.get(i);
				domainClinicalTasks.set(i, domainClinicalTasks.get(domIdx));
				domainClinicalTasks.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j9 = domainClinicalTasks.size();
		while (j9 > collection9Size)
		{
			domainClinicalTasks.remove(j9-1);
			j9 = domainClinicalTasks.size();
		}

		domainObject.setClinicalTasks(domainClinicalTasks);		
		ims.framework.utils.DateTime dateTime10 = valueObject.getRequestingDateTime();
		java.util.Date value10 = null;
		if ( dateTime10 != null ) 
		{
			value10 = dateTime10.getJavaDate();
		}
		domainObject.setRequestingDateTime(value10);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value11 = null;
		if ( null != valueObject.getRequestingHCP() ) 
		{
			if (valueObject.getRequestingHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getRequestingHCP()) != null)
				{
					value11 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getRequestingHCP());
				}
			}
			else
			{
				value11 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getRequestingHCP().getBoId());
			}
		}
		domainObject.setRequestingHCP(value11);
		domainObject.setNotes(ims.clinical.vo.domain.HospitalAtNightNotesVoAssembler.extractHospitalAtNightNotesSet(domainFactory, valueObject.getNotes(), domainObject.getNotes(), domMap));		
		ims.core.resource.place.domain.objects.Location value13 = null;
		if ( null != valueObject.getWardWhenPlacedOnList() ) 
		{
			if (valueObject.getWardWhenPlacedOnList().getBoId() == null)
			{
				if (domMap.get(valueObject.getWardWhenPlacedOnList()) != null)
				{
					value13 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getWardWhenPlacedOnList());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value13 = domainObject.getWardWhenPlacedOnList();	
			}
			else
			{
				value13 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getWardWhenPlacedOnList().getBoId());
			}
		}
		domainObject.setWardWhenPlacedOnList(value13);
		ims.clinical.domain.objects.HospitalAtNightListandDates value14 = null;
		if ( null != valueObject.getHospitalAtNightListAndDates() ) 
		{
			if (valueObject.getHospitalAtNightListAndDates().getBoId() == null)
			{
				if (domMap.get(valueObject.getHospitalAtNightListAndDates()) != null)
				{
					value14 = (ims.clinical.domain.objects.HospitalAtNightListandDates)domMap.get(valueObject.getHospitalAtNightListAndDates());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value14 = domainObject.getHospitalAtNightListAndDates();	
			}
			else
			{
				value14 = (ims.clinical.domain.objects.HospitalAtNightListandDates)domainFactory.getDomainObject(ims.clinical.domain.objects.HospitalAtNightListandDates.class, valueObject.getHospitalAtNightListAndDates().getBoId());
			}
		}
		domainObject.setHospitalAtNightListAndDates(value14);
		domainObject.setCurrentStatus(ims.clinical.vo.domain.HospitalAtNightPatientDetailStatusVoAssembler.extractHospitalAtNightPatientDetailStatus(domainFactory, valueObject.getCurrentStatus(), domMap));
		domainObject.setStatusHistory(ims.clinical.vo.domain.HospitalAtNightPatientDetailStatusVoAssembler.extractHospitalAtNightPatientDetailStatusList(domainFactory, valueObject.getStatusHistory(), domainObject.getStatusHistory(), domMap));		

		return domainObject;
	}

}
