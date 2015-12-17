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
public class DischargeEpiosdeForPatientCodingListVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.DischargeEpiosdeForPatientCodingListVo copy(ims.RefMan.vo.DischargeEpiosdeForPatientCodingListVo valueObjectDest, ims.RefMan.vo.DischargeEpiosdeForPatientCodingListVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_DischargedEpisode(valueObjectSrc.getID_DischargedEpisode());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// pasEvent
		valueObjectDest.setPasEvent(valueObjectSrc.getPasEvent());
		// wardStays
		valueObjectDest.setWardStays(valueObjectSrc.getWardStays());
		// consultantStays
		valueObjectDest.setConsultantStays(valueObjectSrc.getConsultantStays());
		// dischargeDateTime
		valueObjectDest.setDischargeDateTime(valueObjectSrc.getDischargeDateTime());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// DischargeDestination
		valueObjectDest.setDischargeDestination(valueObjectSrc.getDischargeDestination());
		// MethodOfDischarge
		valueObjectDest.setMethodOfDischarge(valueObjectSrc.getMethodOfDischarge());
		// AdmissionDetail
		valueObjectDest.setAdmissionDetail(valueObjectSrc.getAdmissionDetail());
		// AdmissionType
		valueObjectDest.setAdmissionType(valueObjectSrc.getAdmissionType());
		// ReadmissionType
		valueObjectDest.setReadmissionType(valueObjectSrc.getReadmissionType());
		// DischargeReadyDate
		valueObjectDest.setDischargeReadyDate(valueObjectSrc.getDischargeReadyDate());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createDischargeEpiosdeForPatientCodingListVoCollectionFromDischargedEpisode(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.DischargedEpisode objects.
	 */
	public static ims.RefMan.vo.DischargeEpiosdeForPatientCodingListVoCollection createDischargeEpiosdeForPatientCodingListVoCollectionFromDischargedEpisode(java.util.Set domainObjectSet)	
	{
		return createDischargeEpiosdeForPatientCodingListVoCollectionFromDischargedEpisode(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.DischargedEpisode objects.
	 */
	public static ims.RefMan.vo.DischargeEpiosdeForPatientCodingListVoCollection createDischargeEpiosdeForPatientCodingListVoCollectionFromDischargedEpisode(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.DischargeEpiosdeForPatientCodingListVoCollection voList = new ims.RefMan.vo.DischargeEpiosdeForPatientCodingListVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.pas.domain.objects.DischargedEpisode domainObject = (ims.core.admin.pas.domain.objects.DischargedEpisode) iterator.next();
			ims.RefMan.vo.DischargeEpiosdeForPatientCodingListVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.DischargedEpisode objects.
	 */
	public static ims.RefMan.vo.DischargeEpiosdeForPatientCodingListVoCollection createDischargeEpiosdeForPatientCodingListVoCollectionFromDischargedEpisode(java.util.List domainObjectList) 
	{
		return createDischargeEpiosdeForPatientCodingListVoCollectionFromDischargedEpisode(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.DischargedEpisode objects.
	 */
	public static ims.RefMan.vo.DischargeEpiosdeForPatientCodingListVoCollection createDischargeEpiosdeForPatientCodingListVoCollectionFromDischargedEpisode(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.DischargeEpiosdeForPatientCodingListVoCollection voList = new ims.RefMan.vo.DischargeEpiosdeForPatientCodingListVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.DischargedEpisode domainObject = (ims.core.admin.pas.domain.objects.DischargedEpisode) domainObjectList.get(i);
			ims.RefMan.vo.DischargeEpiosdeForPatientCodingListVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.pas.domain.objects.DischargedEpisode set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractDischargedEpisodeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.DischargeEpiosdeForPatientCodingListVoCollection voCollection) 
	 {
	 	return extractDischargedEpisodeSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractDischargedEpisodeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.DischargeEpiosdeForPatientCodingListVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.DischargeEpiosdeForPatientCodingListVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.DischargedEpisode domainObject = DischargeEpiosdeForPatientCodingListVoAssembler.extractDischargedEpisode(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.pas.domain.objects.DischargedEpisode list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractDischargedEpisodeList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.DischargeEpiosdeForPatientCodingListVoCollection voCollection) 
	 {
	 	return extractDischargedEpisodeList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractDischargedEpisodeList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.DischargeEpiosdeForPatientCodingListVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.DischargeEpiosdeForPatientCodingListVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.DischargedEpisode domainObject = DischargeEpiosdeForPatientCodingListVoAssembler.extractDischargedEpisode(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.pas.domain.objects.DischargedEpisode object.
	 * @param domainObject ims.core.admin.pas.domain.objects.DischargedEpisode
	 */
	 public static ims.RefMan.vo.DischargeEpiosdeForPatientCodingListVo create(ims.core.admin.pas.domain.objects.DischargedEpisode domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.pas.domain.objects.DischargedEpisode object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.DischargeEpiosdeForPatientCodingListVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.DischargedEpisode domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.DischargeEpiosdeForPatientCodingListVo valueObject = (ims.RefMan.vo.DischargeEpiosdeForPatientCodingListVo) map.getValueObject(domainObject, ims.RefMan.vo.DischargeEpiosdeForPatientCodingListVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.DischargeEpiosdeForPatientCodingListVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.pas.domain.objects.DischargedEpisode
	 */
	 public static ims.RefMan.vo.DischargeEpiosdeForPatientCodingListVo insert(ims.RefMan.vo.DischargeEpiosdeForPatientCodingListVo valueObject, ims.core.admin.pas.domain.objects.DischargedEpisode domainObject) 
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
	 * @param domainObject ims.core.admin.pas.domain.objects.DischargedEpisode
	 */
	 public static ims.RefMan.vo.DischargeEpiosdeForPatientCodingListVo insert(DomainObjectMap map, ims.RefMan.vo.DischargeEpiosdeForPatientCodingListVo valueObject, ims.core.admin.pas.domain.objects.DischargedEpisode domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_DischargedEpisode(domainObject.getId());
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
			
		// pasEvent
		valueObject.setPasEvent(ims.RefMan.vo.domain.PasEventForClinicalCodingWorklistVoAssembler.create(map, domainObject.getPasEvent()) );
		// wardStays
		valueObject.setWardStays(ims.RefMan.vo.domain.WardStayForPatientCodingListVoAssembler.createWardStayForPatientCodingListVoCollectionFromWardStay(map, domainObject.getWardStays()) );
		// consultantStays
		valueObject.setConsultantStays(ims.RefMan.vo.domain.ConsultantStayForPatientCodingListVoAssembler.createConsultantStayForPatientCodingListVoCollectionFromConsultantStay(map, domainObject.getConsultantStays()) );
		// dischargeDateTime
		java.util.Date dischargeDateTime = domainObject.getDischargeDateTime();
		if ( null != dischargeDateTime ) 
		{
			valueObject.setDischargeDateTime(new ims.framework.utils.DateTime(dischargeDateTime) );
		}
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// DischargeDestination
		ims.domain.lookups.LookupInstance instance6 = domainObject.getDischargeDestination();
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

			ims.coe.vo.lookups.DischargeDestination voLookup6 = new ims.coe.vo.lookups.DischargeDestination(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.coe.vo.lookups.DischargeDestination parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.coe.vo.lookups.DischargeDestination(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setDischargeDestination(voLookup6);
		}
				// MethodOfDischarge
		ims.domain.lookups.LookupInstance instance7 = domainObject.getMethodOfDischarge();
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

			ims.core.vo.lookups.MethodOfDischarge voLookup7 = new ims.core.vo.lookups.MethodOfDischarge(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.MethodOfDischarge parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.core.vo.lookups.MethodOfDischarge(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setMethodOfDischarge(voLookup7);
		}
				// AdmissionDetail
		valueObject.setAdmissionDetail(ims.RefMan.vo.domain.AdmissionDetailForPatientCodingListVoAssembler.create(map, domainObject.getAdmissionDetail()) );
		// AdmissionType
		ims.domain.lookups.LookupInstance instance9 = domainObject.getAdmissionType();
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

			ims.core.vo.lookups.AdmissionType voLookup9 = new ims.core.vo.lookups.AdmissionType(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.AdmissionType parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.core.vo.lookups.AdmissionType(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setAdmissionType(voLookup9);
		}
				// ReadmissionType
		ims.domain.lookups.LookupInstance instance10 = domainObject.getReadmissionType();
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

			ims.core.vo.lookups.ReadmissionType voLookup10 = new ims.core.vo.lookups.ReadmissionType(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.ReadmissionType parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.core.vo.lookups.ReadmissionType(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setReadmissionType(voLookup10);
		}
				// DischargeReadyDate
		java.util.Date DischargeReadyDate = domainObject.getDischargeReadyDate();
		if ( null != DischargeReadyDate ) 
		{
			valueObject.setDischargeReadyDate(new ims.framework.utils.Date(DischargeReadyDate) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.pas.domain.objects.DischargedEpisode extractDischargedEpisode(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.DischargeEpiosdeForPatientCodingListVo valueObject) 
	{
		return 	extractDischargedEpisode(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.DischargedEpisode extractDischargedEpisode(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.DischargeEpiosdeForPatientCodingListVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_DischargedEpisode();
		ims.core.admin.pas.domain.objects.DischargedEpisode domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.pas.domain.objects.DischargedEpisode)domMap.get(valueObject);
			}
			// ims.RefMan.vo.DischargeEpiosdeForPatientCodingListVo ID_DischargedEpisode field is unknown
			domainObject = new ims.core.admin.pas.domain.objects.DischargedEpisode();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_DischargedEpisode());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.pas.domain.objects.DischargedEpisode)domMap.get(key);
			}
			domainObject = (ims.core.admin.pas.domain.objects.DischargedEpisode) domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.DischargedEpisode.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_DischargedEpisode());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.pas.domain.objects.PASEvent value1 = null;
		if ( null != valueObject.getPasEvent() ) 
		{
			if (valueObject.getPasEvent().getBoId() == null)
			{
				if (domMap.get(valueObject.getPasEvent()) != null)
				{
					value1 = (ims.core.admin.pas.domain.objects.PASEvent)domMap.get(valueObject.getPasEvent());
				}
			}
			else
			{
				value1 = (ims.core.admin.pas.domain.objects.PASEvent)domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.PASEvent.class, valueObject.getPasEvent().getBoId());
			}
		}
		domainObject.setPasEvent(value1);
		domainObject.setWardStays(ims.RefMan.vo.domain.WardStayForPatientCodingListVoAssembler.extractWardStaySet(domainFactory, valueObject.getWardStays(), domainObject.getWardStays(), domMap));		
		domainObject.setConsultantStays(ims.RefMan.vo.domain.ConsultantStayForPatientCodingListVoAssembler.extractConsultantStaySet(domainFactory, valueObject.getConsultantStays(), domainObject.getConsultantStays(), domMap));		
		ims.framework.utils.DateTime dateTime4 = valueObject.getDischargeDateTime();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setDischargeDateTime(value4);
		domainObject.setIsActive(valueObject.getIsActive());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getDischargeDestination() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getDischargeDestination().getID());
		}
		domainObject.setDischargeDestination(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getMethodOfDischarge() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getMethodOfDischarge().getID());
		}
		domainObject.setMethodOfDischarge(value7);
		domainObject.setAdmissionDetail(ims.RefMan.vo.domain.AdmissionDetailForPatientCodingListVoAssembler.extractAdmissionDetail(domainFactory, valueObject.getAdmissionDetail(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getAdmissionType() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getAdmissionType().getID());
		}
		domainObject.setAdmissionType(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getReadmissionType() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getReadmissionType().getID());
		}
		domainObject.setReadmissionType(value10);
		java.util.Date value11 = null;
		ims.framework.utils.Date date11 = valueObject.getDischargeReadyDate();		
		if ( date11 != null ) 
		{
			value11 = date11.getDate();
		}
		domainObject.setDischargeReadyDate(value11);

		return domainObject;
	}

}
