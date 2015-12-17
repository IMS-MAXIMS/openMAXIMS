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
 * @author Catalin Tomozei
 */
public class InPatientEpisodeADTVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.InPatientEpisodeADTVo copy(ims.core.vo.InPatientEpisodeADTVo valueObjectDest, ims.core.vo.InPatientEpisodeADTVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_InpatientEpisode(valueObjectSrc.getID_InpatientEpisode());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// wardStays
		valueObjectDest.setWardStays(valueObjectSrc.getWardStays());
		// consultantStays
		valueObjectDest.setConsultantStays(valueObjectSrc.getConsultantStays());
		// isOnLeave
		valueObjectDest.setIsOnLeave(valueObjectSrc.getIsOnLeave());
		// pasEvent
		valueObjectDest.setPasEvent(valueObjectSrc.getPasEvent());
		// Bed
		valueObjectDest.setBed(valueObjectSrc.getBed());
		// AdmissionDateTime
		valueObjectDest.setAdmissionDateTime(valueObjectSrc.getAdmissionDateTime());
		// EstDischargeDate
		valueObjectDest.setEstDischargeDate(valueObjectSrc.getEstDischargeDate());
		// Comments
		valueObjectDest.setComments(valueObjectSrc.getComments());
		// WardType
		valueObjectDest.setWardType(valueObjectSrc.getWardType());
		// isOnHomeLeave
		valueObjectDest.setIsOnHomeLeave(valueObjectSrc.getIsOnHomeLeave());
		// DateOnHomeLeave
		valueObjectDest.setDateOnHomeLeave(valueObjectSrc.getDateOnHomeLeave());
		// TimeOnHomeLeave
		valueObjectDest.setTimeOnHomeLeave(valueObjectSrc.getTimeOnHomeLeave());
		// ExpectedDateOfReturn
		valueObjectDest.setExpectedDateOfReturn(valueObjectSrc.getExpectedDateOfReturn());
		// ExpectedTimeOfReturn
		valueObjectDest.setExpectedTimeOfReturn(valueObjectSrc.getExpectedTimeOfReturn());
		// HomeLeaves
		valueObjectDest.setHomeLeaves(valueObjectSrc.getHomeLeaves());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createInPatientEpisodeADTVoCollectionFromInpatientEpisode(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.InpatientEpisode objects.
	 */
	public static ims.core.vo.InPatientEpisodeADTVoCollection createInPatientEpisodeADTVoCollectionFromInpatientEpisode(java.util.Set domainObjectSet)	
	{
		return createInPatientEpisodeADTVoCollectionFromInpatientEpisode(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.InpatientEpisode objects.
	 */
	public static ims.core.vo.InPatientEpisodeADTVoCollection createInPatientEpisodeADTVoCollectionFromInpatientEpisode(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.InPatientEpisodeADTVoCollection voList = new ims.core.vo.InPatientEpisodeADTVoCollection();
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
			ims.core.vo.InPatientEpisodeADTVo vo = create(map, domainObject);
			
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
	public static ims.core.vo.InPatientEpisodeADTVoCollection createInPatientEpisodeADTVoCollectionFromInpatientEpisode(java.util.List domainObjectList) 
	{
		return createInPatientEpisodeADTVoCollectionFromInpatientEpisode(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.InpatientEpisode objects.
	 */
	public static ims.core.vo.InPatientEpisodeADTVoCollection createInPatientEpisodeADTVoCollectionFromInpatientEpisode(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.InPatientEpisodeADTVoCollection voList = new ims.core.vo.InPatientEpisodeADTVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.InpatientEpisode domainObject = (ims.core.admin.pas.domain.objects.InpatientEpisode) domainObjectList.get(i);
			ims.core.vo.InPatientEpisodeADTVo vo = create(map, domainObject);

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
	 public static java.util.Set extractInpatientEpisodeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.InPatientEpisodeADTVoCollection voCollection) 
	 {
	 	return extractInpatientEpisodeSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractInpatientEpisodeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.InPatientEpisodeADTVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.InPatientEpisodeADTVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.InpatientEpisode domainObject = InPatientEpisodeADTVoAssembler.extractInpatientEpisode(domainFactory, vo, domMap);

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
	 public static java.util.List extractInpatientEpisodeList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.InPatientEpisodeADTVoCollection voCollection) 
	 {
	 	return extractInpatientEpisodeList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractInpatientEpisodeList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.InPatientEpisodeADTVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.InPatientEpisodeADTVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.InpatientEpisode domainObject = InPatientEpisodeADTVoAssembler.extractInpatientEpisode(domainFactory, vo, domMap);

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
	 public static ims.core.vo.InPatientEpisodeADTVo create(ims.core.admin.pas.domain.objects.InpatientEpisode domainObject) 
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
	  public static ims.core.vo.InPatientEpisodeADTVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.InpatientEpisode domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.InPatientEpisodeADTVo valueObject = (ims.core.vo.InPatientEpisodeADTVo) map.getValueObject(domainObject, ims.core.vo.InPatientEpisodeADTVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.InPatientEpisodeADTVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.core.vo.InPatientEpisodeADTVo insert(ims.core.vo.InPatientEpisodeADTVo valueObject, ims.core.admin.pas.domain.objects.InpatientEpisode domainObject) 
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
	 public static ims.core.vo.InPatientEpisodeADTVo insert(DomainObjectMap map, ims.core.vo.InPatientEpisodeADTVo valueObject, ims.core.admin.pas.domain.objects.InpatientEpisode domainObject) 
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
			
		// wardStays
		valueObject.setWardStays(ims.core.vo.domain.WardStayVoAssembler.createWardStayVoCollectionFromWardStay(map, domainObject.getWardStays()) );
		// consultantStays
		ims.core.admin.pas.vo.ConsultantStayRefVoCollection consultantStays = new ims.core.admin.pas.vo.ConsultantStayRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getConsultantStays().iterator(); iterator.hasNext(); ) 
		{
			ims.core.admin.pas.domain.objects.ConsultantStay tmp = (ims.core.admin.pas.domain.objects.ConsultantStay)iterator.next();
			if (tmp != null)
				consultantStays.add(new ims.core.admin.pas.vo.ConsultantStayRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setConsultantStays(consultantStays);
		// isOnLeave
		valueObject.setIsOnLeave( domainObject.isIsOnLeave() );
		// pasEvent
		valueObject.setPasEvent(ims.core.vo.domain.PasEventADTVoAssembler.create(map, domainObject.getPasEvent()) );
		// Bed
		valueObject.setBed(ims.core.vo.domain.BedSpaceStateLiteVoAssembler.create(map, domainObject.getBed()) );
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
		// Comments
		valueObject.setComments(domainObject.getComments());
		// WardType
		ims.domain.lookups.LookupInstance instance9 = domainObject.getWardType();
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

			ims.core.vo.lookups.WardType voLookup9 = new ims.core.vo.lookups.WardType(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.WardType parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.core.vo.lookups.WardType(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setWardType(voLookup9);
		}
				// isOnHomeLeave
		valueObject.setIsOnHomeLeave( domainObject.isIsOnHomeLeave() );
		// DateOnHomeLeave
		java.util.Date DateOnHomeLeave = domainObject.getDateOnHomeLeave();
		if ( null != DateOnHomeLeave ) 
		{
			valueObject.setDateOnHomeLeave(new ims.framework.utils.Date(DateOnHomeLeave) );
		}
		// TimeOnHomeLeave
		String TimeOnHomeLeave = domainObject.getTimeOnHomeLeave();
		if ( null != TimeOnHomeLeave ) 
		{
			valueObject.setTimeOnHomeLeave(new ims.framework.utils.Time(TimeOnHomeLeave) );
		}
		// ExpectedDateOfReturn
		java.util.Date ExpectedDateOfReturn = domainObject.getExpectedDateOfReturn();
		if ( null != ExpectedDateOfReturn ) 
		{
			valueObject.setExpectedDateOfReturn(new ims.framework.utils.Date(ExpectedDateOfReturn) );
		}
		// ExpectedTimeOfReturn
		String ExpectedTimeOfReturn = domainObject.getExpectedTimeOfReturn();
		if ( null != ExpectedTimeOfReturn ) 
		{
			valueObject.setExpectedTimeOfReturn(new ims.framework.utils.Time(ExpectedTimeOfReturn) );
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
	public static ims.core.admin.pas.domain.objects.InpatientEpisode extractInpatientEpisode(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.InPatientEpisodeADTVo valueObject) 
	{
		return 	extractInpatientEpisode(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.InpatientEpisode extractInpatientEpisode(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.InPatientEpisodeADTVo valueObject, HashMap domMap) 
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
			// ims.core.vo.InPatientEpisodeADTVo ID_InpatientEpisode field is unknown
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

		domainObject.setWardStays(ims.core.vo.domain.WardStayVoAssembler.extractWardStaySet(domainFactory, valueObject.getWardStays(), domainObject.getWardStays(), domMap));		

		ims.core.admin.pas.vo.ConsultantStayRefVoCollection refCollection2 = valueObject.getConsultantStays();
		int size2 = (null == refCollection2) ? 0 : refCollection2.size();		
		java.util.Set domainConsultantStays2 = domainObject.getConsultantStays();
		if (domainConsultantStays2 == null)
		{
			domainConsultantStays2 = new java.util.HashSet();
		}
		java.util.Set newSet2  = new java.util.HashSet();
		for(int i=0; i<size2; i++) 
		{
			ims.core.admin.pas.vo.ConsultantStayRefVo vo = refCollection2.get(i);					
			ims.core.admin.pas.domain.objects.ConsultantStay dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.admin.pas.domain.objects.ConsultantStay)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.admin.pas.domain.objects.ConsultantStay)domainFactory.getDomainObject( ims.core.admin.pas.domain.objects.ConsultantStay.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainConsultantStays2.contains(dom))
			{
				domainConsultantStays2.add(dom);
			}
			newSet2.add(dom);			
		}
		java.util.Set removedSet2 = new java.util.HashSet();
		java.util.Iterator iter2 = domainConsultantStays2.iterator();
		//Find out which objects need to be removed
		while (iter2.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter2.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet2.contains(o))
			{
				removedSet2.add(o);
			}
		}
		iter2 = removedSet2.iterator();
		//Remove the unwanted objects
		while (iter2.hasNext())
		{
			domainConsultantStays2.remove(iter2.next());
		}		
		
		domainObject.setConsultantStays(domainConsultantStays2);		
		domainObject.setIsOnLeave(valueObject.getIsOnLeave());
		domainObject.setPasEvent(ims.core.vo.domain.PasEventADTVoAssembler.extractPASEvent(domainFactory, valueObject.getPasEvent(), domMap));
		domainObject.setBed(ims.core.vo.domain.BedSpaceStateLiteVoAssembler.extractBedSpaceState(domainFactory, valueObject.getBed(), domMap));
		ims.framework.utils.DateTime dateTime6 = valueObject.getAdmissionDateTime();
		java.util.Date value6 = null;
		if ( dateTime6 != null ) 
		{
			value6 = dateTime6.getJavaDate();
		}
		domainObject.setAdmissionDateTime(value6);
		java.util.Date value7 = null;
		ims.framework.utils.Date date7 = valueObject.getEstDischargeDate();		
		if ( date7 != null ) 
		{
			value7 = date7.getDate();
		}
		domainObject.setEstDischargeDate(value7);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComments() != null && valueObject.getComments().equals(""))
		{
			valueObject.setComments(null);
		}
		domainObject.setComments(valueObject.getComments());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getWardType() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getWardType().getID());
		}
		domainObject.setWardType(value9);
		domainObject.setIsOnHomeLeave(valueObject.getIsOnHomeLeave());
		java.util.Date value11 = null;
		ims.framework.utils.Date date11 = valueObject.getDateOnHomeLeave();		
		if ( date11 != null ) 
		{
			value11 = date11.getDate();
		}
		domainObject.setDateOnHomeLeave(value11);
		ims.framework.utils.Time time12 = valueObject.getTimeOnHomeLeave();
		String value12 = null;
		if ( time12 != null ) 
		{
			value12 = time12.toString();
		}
		domainObject.setTimeOnHomeLeave(value12);
		java.util.Date value13 = null;
		ims.framework.utils.Date date13 = valueObject.getExpectedDateOfReturn();		
		if ( date13 != null ) 
		{
			value13 = date13.getDate();
		}
		domainObject.setExpectedDateOfReturn(value13);
		ims.framework.utils.Time time14 = valueObject.getExpectedTimeOfReturn();
		String value14 = null;
		if ( time14 != null ) 
		{
			value14 = time14.toString();
		}
		domainObject.setExpectedTimeOfReturn(value14);

		// SaveAsRefVO treated as RefValueObject
		ims.core.admin.pas.vo.HomeLeaveRefVoCollection refCollection15 = new ims.core.admin.pas.vo.HomeLeaveRefVoCollection();
		if (valueObject.getHomeLeaves() != null)
		{
			for (int i15=0; i15<valueObject.getHomeLeaves().size(); i15++)
			{
				ims.core.admin.pas.vo.HomeLeaveRefVo ref15 = (ims.core.admin.pas.vo.HomeLeaveRefVo)valueObject.getHomeLeaves().get(i15);
				refCollection15.add(ref15);
			}
		}
		int size15 = (null == refCollection15) ? 0 : refCollection15.size();		
		java.util.List domainHomeLeaves15 = domainObject.getHomeLeaves();
		if (domainHomeLeaves15 == null)
		{
			domainHomeLeaves15 = new java.util.ArrayList();
		}
		for(int i=0; i < size15; i++) 
		{
			ims.core.admin.pas.vo.HomeLeaveRefVo vo = refCollection15.get(i);			
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

			int domIdx = domainHomeLeaves15.indexOf(dom);
			if (domIdx == -1)
			{
				domainHomeLeaves15.add(i, dom);
			}
			else if (i != domIdx && i < domainHomeLeaves15.size())
			{
				Object tmp = domainHomeLeaves15.get(i);
				domainHomeLeaves15.set(i, domainHomeLeaves15.get(domIdx));
				domainHomeLeaves15.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i15 = domainHomeLeaves15.size();
		while (i15 > size15)
		{
			domainHomeLeaves15.remove(i15-1);
			i15 = domainHomeLeaves15.size();
		}
		
		domainObject.setHomeLeaves(domainHomeLeaves15);		

		return domainObject;
	}

}
