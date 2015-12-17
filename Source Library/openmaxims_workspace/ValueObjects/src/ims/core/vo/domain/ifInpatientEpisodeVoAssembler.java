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
 * @author Richard Reynolds
 */
public class ifInpatientEpisodeVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.ifInpatientEpisodeVo copy(ims.core.vo.ifInpatientEpisodeVo valueObjectDest, ims.core.vo.ifInpatientEpisodeVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PASEvent(valueObjectSrc.getID_PASEvent());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// pasEventId
		valueObjectDest.setPasEventId(valueObjectSrc.getPasEventId());
		// Consultant
		valueObjectDest.setConsultant(valueObjectSrc.getConsultant());
		// Specialty
		valueObjectDest.setSpecialty(valueObjectSrc.getSpecialty());
		// sourceOfReferral
		valueObjectDest.setSourceOfReferral(valueObjectSrc.getSourceOfReferral());
		// isVip
		valueObjectDest.setIsVip(valueObjectSrc.getIsVip());
		// referringGP
		valueObjectDest.setReferringGP(valueObjectSrc.getReferringGP());
		// EventType
		valueObjectDest.setEventType(valueObjectSrc.getEventType());
		// pasEpisodeId
		valueObjectDest.setPasEpisodeId(valueObjectSrc.getPasEpisodeId());
		// EpisodeFinancialClass
		valueObjectDest.setEpisodeFinancialClass(valueObjectSrc.getEpisodeFinancialClass());
		// AttendingHCP
		valueObjectDest.setAttendingHCP(valueObjectSrc.getAttendingHCP());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createifInpatientEpisodeVoCollectionFromPASEvent(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.PASEvent objects.
	 */
	public static ims.core.vo.ifInpatientEpisodeVoCollection createifInpatientEpisodeVoCollectionFromPASEvent(java.util.Set domainObjectSet)	
	{
		return createifInpatientEpisodeVoCollectionFromPASEvent(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.PASEvent objects.
	 */
	public static ims.core.vo.ifInpatientEpisodeVoCollection createifInpatientEpisodeVoCollectionFromPASEvent(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.ifInpatientEpisodeVoCollection voList = new ims.core.vo.ifInpatientEpisodeVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.pas.domain.objects.PASEvent domainObject = (ims.core.admin.pas.domain.objects.PASEvent) iterator.next();
			ims.core.vo.ifInpatientEpisodeVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.PASEvent objects.
	 */
	public static ims.core.vo.ifInpatientEpisodeVoCollection createifInpatientEpisodeVoCollectionFromPASEvent(java.util.List domainObjectList) 
	{
		return createifInpatientEpisodeVoCollectionFromPASEvent(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.PASEvent objects.
	 */
	public static ims.core.vo.ifInpatientEpisodeVoCollection createifInpatientEpisodeVoCollectionFromPASEvent(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.ifInpatientEpisodeVoCollection voList = new ims.core.vo.ifInpatientEpisodeVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.PASEvent domainObject = (ims.core.admin.pas.domain.objects.PASEvent) domainObjectList.get(i);
			ims.core.vo.ifInpatientEpisodeVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.pas.domain.objects.PASEvent set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPASEventSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ifInpatientEpisodeVoCollection voCollection) 
	 {
	 	return extractPASEventSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPASEventSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ifInpatientEpisodeVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.ifInpatientEpisodeVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.PASEvent domainObject = ifInpatientEpisodeVoAssembler.extractPASEvent(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.pas.domain.objects.PASEvent list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPASEventList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ifInpatientEpisodeVoCollection voCollection) 
	 {
	 	return extractPASEventList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPASEventList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ifInpatientEpisodeVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.ifInpatientEpisodeVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.PASEvent domainObject = ifInpatientEpisodeVoAssembler.extractPASEvent(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.pas.domain.objects.PASEvent object.
	 * @param domainObject ims.core.admin.pas.domain.objects.PASEvent
	 */
	 public static ims.core.vo.ifInpatientEpisodeVo create(ims.core.admin.pas.domain.objects.PASEvent domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.pas.domain.objects.PASEvent object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.ifInpatientEpisodeVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.PASEvent domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.ifInpatientEpisodeVo valueObject = (ims.core.vo.ifInpatientEpisodeVo) map.getValueObject(domainObject, ims.core.vo.ifInpatientEpisodeVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.ifInpatientEpisodeVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.pas.domain.objects.PASEvent
	 */
	 public static ims.core.vo.ifInpatientEpisodeVo insert(ims.core.vo.ifInpatientEpisodeVo valueObject, ims.core.admin.pas.domain.objects.PASEvent domainObject) 
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
	 * @param domainObject ims.core.admin.pas.domain.objects.PASEvent
	 */
	 public static ims.core.vo.ifInpatientEpisodeVo insert(DomainObjectMap map, ims.core.vo.ifInpatientEpisodeVo valueObject, ims.core.admin.pas.domain.objects.PASEvent domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PASEvent(domainObject.getId());
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
			
		// patient
		valueObject.setPatient(ims.core.vo.domain.PatientAssembler.create(map, domainObject.getPatient()) );
		// pasEventId
		valueObject.setPasEventId(domainObject.getPasEventId());
		// Consultant
		valueObject.setConsultant(ims.core.vo.domain.MedicWithMappingsLiteVoAssembler.create(map, domainObject.getConsultant()) );
		// Specialty
		ims.domain.lookups.LookupInstance instance4 = domainObject.getSpecialty();
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

			ims.core.vo.lookups.Specialty voLookup4 = new ims.core.vo.lookups.Specialty(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.Specialty(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setSpecialty(voLookup4);
		}
				// sourceOfReferral
		ims.domain.lookups.LookupInstance instance5 = domainObject.getSourceOfReferral();
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

			ims.core.vo.lookups.SourceOfReferral voLookup5 = new ims.core.vo.lookups.SourceOfReferral(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.SourceOfReferral parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.SourceOfReferral(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setSourceOfReferral(voLookup5);
		}
				// isVip
		valueObject.setIsVip( domainObject.isIsVip() );
		// referringGP
		valueObject.setReferringGP(ims.core.vo.domain.GpLiteVoAssembler.create(map, domainObject.getReferringGP()) );
		// EventType
		ims.domain.lookups.LookupInstance instance8 = domainObject.getEventType();
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

			ims.core.vo.lookups.PasEventType voLookup8 = new ims.core.vo.lookups.PasEventType(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.PasEventType parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.PasEventType(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setEventType(voLookup8);
		}
				// pasEpisodeId
		valueObject.setPasEpisodeId(domainObject.getPasEpisodeId());
		// EpisodeFinancialClass
		ims.domain.lookups.LookupInstance instance10 = domainObject.getEpisodeFinancialClass();
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

			ims.ocrr.vo.lookups.OrderCategory voLookup10 = new ims.ocrr.vo.lookups.OrderCategory(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.ocrr.vo.lookups.OrderCategory parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.ocrr.vo.lookups.OrderCategory(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setEpisodeFinancialClass(voLookup10);
		}
				// AttendingHCP
		valueObject.setAttendingHCP(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getAttendingHCP()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.pas.domain.objects.PASEvent extractPASEvent(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ifInpatientEpisodeVo valueObject) 
	{
		return 	extractPASEvent(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.PASEvent extractPASEvent(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ifInpatientEpisodeVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PASEvent();
		ims.core.admin.pas.domain.objects.PASEvent domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.pas.domain.objects.PASEvent)domMap.get(valueObject);
			}
			// ims.core.vo.ifInpatientEpisodeVo ID_PASEvent field is unknown
			domainObject = new ims.core.admin.pas.domain.objects.PASEvent();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PASEvent());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.pas.domain.objects.PASEvent)domMap.get(key);
			}
			domainObject = (ims.core.admin.pas.domain.objects.PASEvent) domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.PASEvent.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PASEvent());

	// SaveAsRefVO - treated as a refVo in extract methods
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
			else
			{
				value1 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPasEventId() != null && valueObject.getPasEventId().equals(""))
		{
			valueObject.setPasEventId(null);
		}
		domainObject.setPasEventId(valueObject.getPasEventId());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Medic value3 = null;
		if ( null != valueObject.getConsultant() ) 
		{
			if (valueObject.getConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getConsultant()) != null)
				{
					value3 = (ims.core.resource.people.domain.objects.Medic)domMap.get(valueObject.getConsultant());
				}
			}
			else
			{
				value3 = (ims.core.resource.people.domain.objects.Medic)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Medic.class, valueObject.getConsultant().getBoId());
			}
		}
		domainObject.setConsultant(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getSourceOfReferral() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getSourceOfReferral().getID());
		}
		domainObject.setSourceOfReferral(value5);
		domainObject.setIsVip(valueObject.getIsVip());
	// SaveAsRefVO - treated as a refVo in extract methods
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
			else
			{
				value7 = (ims.core.resource.people.domain.objects.Gp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Gp.class, valueObject.getReferringGP().getBoId());
			}
		}
		domainObject.setReferringGP(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getEventType() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getEventType().getID());
		}
		domainObject.setEventType(value8);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPasEpisodeId() != null && valueObject.getPasEpisodeId().equals(""))
		{
			valueObject.setPasEpisodeId(null);
		}
		domainObject.setPasEpisodeId(valueObject.getPasEpisodeId());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getEpisodeFinancialClass() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getEpisodeFinancialClass().getID());
		}
		domainObject.setEpisodeFinancialClass(value10);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value11 = null;
		if ( null != valueObject.getAttendingHCP() ) 
		{
			if (valueObject.getAttendingHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getAttendingHCP()) != null)
				{
					value11 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getAttendingHCP());
				}
			}
			else
			{
				value11 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getAttendingHCP().getBoId());
			}
		}
		domainObject.setAttendingHCP(value11);

		return domainObject;
	}

}
