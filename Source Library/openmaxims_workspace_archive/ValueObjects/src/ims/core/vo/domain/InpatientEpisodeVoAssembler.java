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
public class InpatientEpisodeVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.InpatientEpisodeVo copy(ims.core.vo.InpatientEpisodeVo valueObjectDest, ims.core.vo.InpatientEpisodeVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_InpatientEpisode(valueObjectSrc.getID_InpatientEpisode());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// isOnLeave
		valueObjectDest.setIsOnLeave(valueObjectSrc.getIsOnLeave());
		// pasEvent
		valueObjectDest.setPasEvent(valueObjectSrc.getPasEvent());
		// Comments
		valueObjectDest.setComments(valueObjectSrc.getComments());
		// wardStays
		valueObjectDest.setWardStays(valueObjectSrc.getWardStays());
		// AdmissionDateTime
		valueObjectDest.setAdmissionDateTime(valueObjectSrc.getAdmissionDateTime());
		// EstDischargeDate
		valueObjectDest.setEstDischargeDate(valueObjectSrc.getEstDischargeDate());
		// BedNo
		valueObjectDest.setBedNo(valueObjectSrc.getBedNo());
		// AdmissionType
		valueObjectDest.setAdmissionType(valueObjectSrc.getAdmissionType());
		// isMaternityInpatient
		valueObjectDest.setIsMaternityInpatient(valueObjectSrc.getIsMaternityInpatient());
		// ReasonForAdmission
		valueObjectDest.setReasonForAdmission(valueObjectSrc.getReasonForAdmission());
		// WardType
		valueObjectDest.setWardType(valueObjectSrc.getWardType());
		// ReadmissionType
		valueObjectDest.setReadmissionType(valueObjectSrc.getReadmissionType());
		// DischargeReadyDate
		valueObjectDest.setDischargeReadyDate(valueObjectSrc.getDischargeReadyDate());
		// HomeLeaves
		valueObjectDest.setHomeLeaves(valueObjectSrc.getHomeLeaves());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createInpatientEpisodeVoCollectionFromInpatientEpisode(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.InpatientEpisode objects.
	 */
	public static ims.core.vo.InpatientEpisodeVoCollection createInpatientEpisodeVoCollectionFromInpatientEpisode(java.util.Set domainObjectSet)	
	{
		return createInpatientEpisodeVoCollectionFromInpatientEpisode(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.InpatientEpisode objects.
	 */
	public static ims.core.vo.InpatientEpisodeVoCollection createInpatientEpisodeVoCollectionFromInpatientEpisode(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.InpatientEpisodeVoCollection voList = new ims.core.vo.InpatientEpisodeVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.pas.domain.objects.InpatientEpisode domainObject = (ims.core.admin.pas.domain.objects.InpatientEpisode) iterator.next();
			ims.core.vo.InpatientEpisodeVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.InpatientEpisode objects.
	 */
	public static ims.core.vo.InpatientEpisodeVoCollection createInpatientEpisodeVoCollectionFromInpatientEpisode(java.util.List domainObjectList) 
	{
		return createInpatientEpisodeVoCollectionFromInpatientEpisode(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.InpatientEpisode objects.
	 */
	public static ims.core.vo.InpatientEpisodeVoCollection createInpatientEpisodeVoCollectionFromInpatientEpisode(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.InpatientEpisodeVoCollection voList = new ims.core.vo.InpatientEpisodeVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.InpatientEpisode domainObject = (ims.core.admin.pas.domain.objects.InpatientEpisode) domainObjectList.get(i);
			ims.core.vo.InpatientEpisodeVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.pas.domain.objects.InpatientEpisode set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractInpatientEpisodeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.InpatientEpisodeVoCollection voCollection) 
	 {
	 	return extractInpatientEpisodeSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractInpatientEpisodeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.InpatientEpisodeVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.InpatientEpisodeVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.InpatientEpisode domainObject = InpatientEpisodeVoAssembler.extractInpatientEpisode(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.pas.domain.objects.InpatientEpisode list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractInpatientEpisodeList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.InpatientEpisodeVoCollection voCollection) 
	 {
	 	return extractInpatientEpisodeList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractInpatientEpisodeList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.InpatientEpisodeVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.InpatientEpisodeVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.InpatientEpisode domainObject = InpatientEpisodeVoAssembler.extractInpatientEpisode(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.pas.domain.objects.InpatientEpisode object.
	 * @param domainObject ims.core.admin.pas.domain.objects.InpatientEpisode
	 */
	 public static ims.core.vo.InpatientEpisodeVo create(ims.core.admin.pas.domain.objects.InpatientEpisode domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.pas.domain.objects.InpatientEpisode object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.InpatientEpisodeVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.InpatientEpisode domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.InpatientEpisodeVo valueObject = (ims.core.vo.InpatientEpisodeVo) map.getValueObject(domainObject, ims.core.vo.InpatientEpisodeVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.InpatientEpisodeVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.pas.domain.objects.InpatientEpisode
	 */
	 public static ims.core.vo.InpatientEpisodeVo insert(ims.core.vo.InpatientEpisodeVo valueObject, ims.core.admin.pas.domain.objects.InpatientEpisode domainObject) 
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
	 * @param domainObject ims.core.admin.pas.domain.objects.InpatientEpisode
	 */
	 public static ims.core.vo.InpatientEpisodeVo insert(DomainObjectMap map, ims.core.vo.InpatientEpisodeVo valueObject, ims.core.admin.pas.domain.objects.InpatientEpisode domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_InpatientEpisode(domainObject.getId());
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
			
		// isOnLeave
		valueObject.setIsOnLeave( domainObject.isIsOnLeave() );
		// pasEvent
		valueObject.setPasEvent(ims.core.vo.domain.PasEventVoAssembler.create(map, domainObject.getPasEvent()) );
		// Comments
		valueObject.setComments(domainObject.getComments());
		// wardStays
		valueObject.setWardStays(ims.core.vo.domain.WardStayVoAssembler.createWardStayVoCollectionFromWardStay(map, domainObject.getWardStays()) );
		// AdmissionDateTime
		java.util.Date AdmissionDateTime = domainObject.getAdmissionDateTime();
		if ( null != AdmissionDateTime ) 
		{
			valueObject.setAdmissionDateTime(new ims.framework.utils.DateTime(AdmissionDateTime) );
		}
		// EstDischargeDate
		java.util.Date EstDischargeDate = domainObject.getEstDischargeDate();
		if ( null != EstDischargeDate ) 
		{
			valueObject.setEstDischargeDate(new ims.framework.utils.Date(EstDischargeDate) );
		}
		// BedNo
		valueObject.setBedNo(domainObject.getBedNo());
		// AdmissionType
		ims.domain.lookups.LookupInstance instance8 = domainObject.getAdmissionType();
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

			ims.core.vo.lookups.AdmissionType voLookup8 = new ims.core.vo.lookups.AdmissionType(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.AdmissionType parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.AdmissionType(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setAdmissionType(voLookup8);
		}
				// isMaternityInpatient
		valueObject.setIsMaternityInpatient( domainObject.isIsMaternityInpatient() );
		// ReasonForAdmission
		valueObject.setReasonForAdmission(domainObject.getReasonForAdmission());
		// WardType
		ims.domain.lookups.LookupInstance instance11 = domainObject.getWardType();
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

			ims.core.vo.lookups.WardType voLookup11 = new ims.core.vo.lookups.WardType(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.core.vo.lookups.WardType parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.core.vo.lookups.WardType(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setWardType(voLookup11);
		}
				// ReadmissionType
		ims.domain.lookups.LookupInstance instance12 = domainObject.getReadmissionType();
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

			ims.core.vo.lookups.ReadmissionType voLookup12 = new ims.core.vo.lookups.ReadmissionType(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.core.vo.lookups.ReadmissionType parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.core.vo.lookups.ReadmissionType(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setReadmissionType(voLookup12);
		}
				// DischargeReadyDate
		java.util.Date DischargeReadyDate = domainObject.getDischargeReadyDate();
		if ( null != DischargeReadyDate ) 
		{
			valueObject.setDischargeReadyDate(new ims.framework.utils.Date(DischargeReadyDate) );
		}
		// HomeLeaves
		valueObject.setHomeLeaves(ims.core.vo.domain.HomeLeaveVoAssembler.createHomeLeaveVoCollectionFromHomeLeave(map, domainObject.getHomeLeaves()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.pas.domain.objects.InpatientEpisode extractInpatientEpisode(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.InpatientEpisodeVo valueObject) 
	{
		return 	extractInpatientEpisode(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.InpatientEpisode extractInpatientEpisode(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.InpatientEpisodeVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_InpatientEpisode();
		ims.core.admin.pas.domain.objects.InpatientEpisode domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.pas.domain.objects.InpatientEpisode)domMap.get(valueObject);
			}
			// ims.core.vo.InpatientEpisodeVo ID_InpatientEpisode field is unknown
			domainObject = new ims.core.admin.pas.domain.objects.InpatientEpisode();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_InpatientEpisode());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.pas.domain.objects.InpatientEpisode)domMap.get(key);
			}
			domainObject = (ims.core.admin.pas.domain.objects.InpatientEpisode) domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.InpatientEpisode.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_InpatientEpisode());

		domainObject.setIsOnLeave(valueObject.getIsOnLeave());
		domainObject.setPasEvent(ims.core.vo.domain.PasEventVoAssembler.extractPASEvent(domainFactory, valueObject.getPasEvent(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComments() != null && valueObject.getComments().equals(""))
		{
			valueObject.setComments(null);
		}
		domainObject.setComments(valueObject.getComments());
		domainObject.setWardStays(ims.core.vo.domain.WardStayVoAssembler.extractWardStaySet(domainFactory, valueObject.getWardStays(), domainObject.getWardStays(), domMap));		
		ims.framework.utils.DateTime dateTime5 = valueObject.getAdmissionDateTime();
		java.util.Date value5 = null;
		if ( dateTime5 != null ) 
		{
			value5 = dateTime5.getJavaDate();
		}
		domainObject.setAdmissionDateTime(value5);
		java.util.Date value6 = null;
		ims.framework.utils.Date date6 = valueObject.getEstDischargeDate();		
		if ( date6 != null ) 
		{
			value6 = date6.getDate();
		}
		domainObject.setEstDischargeDate(value6);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getBedNo() != null && valueObject.getBedNo().equals(""))
		{
			valueObject.setBedNo(null);
		}
		domainObject.setBedNo(valueObject.getBedNo());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getAdmissionType() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getAdmissionType().getID());
		}
		domainObject.setAdmissionType(value8);
		domainObject.setIsMaternityInpatient(valueObject.getIsMaternityInpatient());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReasonForAdmission() != null && valueObject.getReasonForAdmission().equals(""))
		{
			valueObject.setReasonForAdmission(null);
		}
		domainObject.setReasonForAdmission(valueObject.getReasonForAdmission());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getWardType() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getWardType().getID());
		}
		domainObject.setWardType(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getReadmissionType() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getReadmissionType().getID());
		}
		domainObject.setReadmissionType(value12);
		java.util.Date value13 = null;
		ims.framework.utils.Date date13 = valueObject.getDischargeReadyDate();		
		if ( date13 != null ) 
		{
			value13 = date13.getDate();
		}
		domainObject.setDischargeReadyDate(value13);

		// SaveAsRefVO treated as RefValueObject
		ims.core.admin.pas.vo.HomeLeaveRefVoCollection refCollection14 = new ims.core.admin.pas.vo.HomeLeaveRefVoCollection();
		if (valueObject.getHomeLeaves() != null)
		{
			for (int i14=0; i14<valueObject.getHomeLeaves().size(); i14++)
			{
				ims.core.admin.pas.vo.HomeLeaveRefVo ref14 = (ims.core.admin.pas.vo.HomeLeaveRefVo)valueObject.getHomeLeaves().get(i14);
				refCollection14.add(ref14);
			}
		}
		int size14 = (null == refCollection14) ? 0 : refCollection14.size();		
		java.util.List domainHomeLeaves14 = domainObject.getHomeLeaves();
		if (domainHomeLeaves14 == null)
		{
			domainHomeLeaves14 = new java.util.ArrayList();
		}
		for(int i=0; i < size14; i++) 
		{
			ims.core.admin.pas.vo.HomeLeaveRefVo vo = refCollection14.get(i);			
			ims.core.admin.pas.domain.objects.HomeLeave dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.admin.pas.domain.objects.HomeLeave)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.admin.pas.domain.objects.HomeLeave)domainFactory.getDomainObject( ims.core.admin.pas.domain.objects.HomeLeave.class, vo.getBoId());
				}
			}

			int domIdx = domainHomeLeaves14.indexOf(dom);
			if (domIdx == -1)
			{
				domainHomeLeaves14.add(i, dom);
			}
			else if (i != domIdx && i < domainHomeLeaves14.size())
			{
				Object tmp = domainHomeLeaves14.get(i);
				domainHomeLeaves14.set(i, domainHomeLeaves14.get(domIdx));
				domainHomeLeaves14.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i14 = domainHomeLeaves14.size();
		while (i14 > size14)
		{
			domainHomeLeaves14.remove(i14-1);
			i14 = domainHomeLeaves14.size();
		}
		
		domainObject.setHomeLeaves(domainHomeLeaves14);		

		return domainObject;
	}

}
