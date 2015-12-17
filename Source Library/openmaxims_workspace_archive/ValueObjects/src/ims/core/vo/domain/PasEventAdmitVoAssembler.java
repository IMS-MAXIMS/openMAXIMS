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
 * @author Daniel Laffan
 */
public class PasEventAdmitVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PasEventAdmitVo copy(ims.core.vo.PasEventAdmitVo valueObjectDest, ims.core.vo.PasEventAdmitVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PASEvent(valueObjectSrc.getID_PASEvent());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// eventDateTime
		valueObjectDest.setEventDateTime(valueObjectSrc.getEventDateTime());
		// patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// pasEventId
		valueObjectDest.setPasEventId(valueObjectSrc.getPasEventId());
		// EventType
		valueObjectDest.setEventType(valueObjectSrc.getEventType());
		// Consultant
		valueObjectDest.setConsultant(valueObjectSrc.getConsultant());
		// Specialty
		valueObjectDest.setSpecialty(valueObjectSrc.getSpecialty());
		// Location
		valueObjectDest.setLocation(valueObjectSrc.getLocation());
		// sourceOfReferral
		valueObjectDest.setSourceOfReferral(valueObjectSrc.getSourceOfReferral());
		// PASSpecialty
		valueObjectDest.setPASSpecialty(valueObjectSrc.getPASSpecialty());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPasEventAdmitVoCollectionFromPASEvent(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.PASEvent objects.
	 */
	public static ims.core.vo.PasEventAdmitVoCollection createPasEventAdmitVoCollectionFromPASEvent(java.util.Set domainObjectSet)	
	{
		return createPasEventAdmitVoCollectionFromPASEvent(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.PASEvent objects.
	 */
	public static ims.core.vo.PasEventAdmitVoCollection createPasEventAdmitVoCollectionFromPASEvent(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PasEventAdmitVoCollection voList = new ims.core.vo.PasEventAdmitVoCollection();
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
			ims.core.vo.PasEventAdmitVo vo = create(map, domainObject);
			
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
	public static ims.core.vo.PasEventAdmitVoCollection createPasEventAdmitVoCollectionFromPASEvent(java.util.List domainObjectList) 
	{
		return createPasEventAdmitVoCollectionFromPASEvent(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.PASEvent objects.
	 */
	public static ims.core.vo.PasEventAdmitVoCollection createPasEventAdmitVoCollectionFromPASEvent(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PasEventAdmitVoCollection voList = new ims.core.vo.PasEventAdmitVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.PASEvent domainObject = (ims.core.admin.pas.domain.objects.PASEvent) domainObjectList.get(i);
			ims.core.vo.PasEventAdmitVo vo = create(map, domainObject);

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
	 public static java.util.Set extractPASEventSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PasEventAdmitVoCollection voCollection) 
	 {
	 	return extractPASEventSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPASEventSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PasEventAdmitVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PasEventAdmitVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.PASEvent domainObject = PasEventAdmitVoAssembler.extractPASEvent(domainFactory, vo, domMap);

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
	 public static java.util.List extractPASEventList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PasEventAdmitVoCollection voCollection) 
	 {
	 	return extractPASEventList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPASEventList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PasEventAdmitVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PasEventAdmitVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.PASEvent domainObject = PasEventAdmitVoAssembler.extractPASEvent(domainFactory, vo, domMap);

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
	 public static ims.core.vo.PasEventAdmitVo create(ims.core.admin.pas.domain.objects.PASEvent domainObject) 
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
	  public static ims.core.vo.PasEventAdmitVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.PASEvent domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PasEventAdmitVo valueObject = (ims.core.vo.PasEventAdmitVo) map.getValueObject(domainObject, ims.core.vo.PasEventAdmitVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PasEventAdmitVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.core.vo.PasEventAdmitVo insert(ims.core.vo.PasEventAdmitVo valueObject, ims.core.admin.pas.domain.objects.PASEvent domainObject) 
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
	 public static ims.core.vo.PasEventAdmitVo insert(DomainObjectMap map, ims.core.vo.PasEventAdmitVo valueObject, ims.core.admin.pas.domain.objects.PASEvent domainObject) 
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
			
		// eventDateTime
		java.util.Date eventDateTime = domainObject.getEventDateTime();
		if ( null != eventDateTime ) 
		{
			valueObject.setEventDateTime(new ims.framework.utils.DateTime(eventDateTime) );
		}
		// patient
		valueObject.setPatient(ims.core.vo.domain.PatientShortAssembler.create(map, domainObject.getPatient()) );
		// pasEventId
		valueObject.setPasEventId(domainObject.getPasEventId());
		// EventType
		ims.domain.lookups.LookupInstance instance4 = domainObject.getEventType();
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

			ims.core.vo.lookups.PasEventType voLookup4 = new ims.core.vo.lookups.PasEventType(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.PasEventType parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.PasEventType(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setEventType(voLookup4);
		}
				// Consultant
		valueObject.setConsultant((ims.core.vo.MedicVo)ims.core.vo.domain.MedicVoAssembler.create(map, domainObject.getConsultant()) );
		// Specialty
		ims.domain.lookups.LookupInstance instance6 = domainObject.getSpecialty();
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

			ims.core.vo.lookups.Specialty voLookup6 = new ims.core.vo.lookups.Specialty(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.Specialty(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setSpecialty(voLookup6);
		}
				// Location
		if (domainObject.getLocation() != null)
		{
			if(domainObject.getLocation() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getLocation();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setLocation(new ims.core.resource.place.vo.LocationRefVo(id, -1));				
			}
			else
			{
				valueObject.setLocation(new ims.core.resource.place.vo.LocationRefVo(domainObject.getLocation().getId(), domainObject.getLocation().getVersion()));
			}
		}
		// sourceOfReferral
		ims.domain.lookups.LookupInstance instance8 = domainObject.getSourceOfReferral();
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

			ims.core.vo.lookups.SourceOfReferral voLookup8 = new ims.core.vo.lookups.SourceOfReferral(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.SourceOfReferral parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.SourceOfReferral(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setSourceOfReferral(voLookup8);
		}
				// PASSpecialty
		ims.domain.lookups.LookupInstance instance9 = domainObject.getPASSpecialty();
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

			ims.core.vo.lookups.PASSpecialty voLookup9 = new ims.core.vo.lookups.PASSpecialty(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.PASSpecialty parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.core.vo.lookups.PASSpecialty(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setPASSpecialty(voLookup9);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.pas.domain.objects.PASEvent extractPASEvent(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PasEventAdmitVo valueObject) 
	{
		return 	extractPASEvent(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.PASEvent extractPASEvent(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PasEventAdmitVo valueObject, HashMap domMap) 
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
			// ims.core.vo.PasEventAdmitVo ID_PASEvent field is unknown
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

		ims.framework.utils.DateTime dateTime1 = valueObject.getEventDateTime();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setEventDateTime(value1);
		domainObject.setPatient(ims.core.vo.domain.PatientShortAssembler.extractPatient(domainFactory, valueObject.getPatient(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPasEventId() != null && valueObject.getPasEventId().equals(""))
		{
			valueObject.setPasEventId(null);
		}
		domainObject.setPasEventId(valueObject.getPasEventId());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getEventType() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getEventType().getID());
		}
		domainObject.setEventType(value4);
		domainObject.setConsultant(ims.core.vo.domain.MedicVoAssembler.extractMedic(domainFactory, (ims.core.vo.MedicVo)valueObject.getConsultant(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value6);
		ims.core.resource.place.domain.objects.Location value7 = null;
		if ( null != valueObject.getLocation() ) 
		{
			if (valueObject.getLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getLocation()) != null)
				{
					value7 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getLocation());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value7 = domainObject.getLocation();	
			}
			else
			{
				value7 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getLocation().getBoId());
			}
		}
		domainObject.setLocation(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getSourceOfReferral() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getSourceOfReferral().getID());
		}
		domainObject.setSourceOfReferral(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getPASSpecialty() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getPASSpecialty().getID());
		}
		domainObject.setPASSpecialty(value9);

		return domainObject;
	}

}
