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
 * @author Gabriel Maxim
 */
public class SpecialtyOutlierInpatientEpisodeListVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.SpecialtyOutlierInpatientEpisodeListVo copy(ims.core.vo.SpecialtyOutlierInpatientEpisodeListVo valueObjectDest, ims.core.vo.SpecialtyOutlierInpatientEpisodeListVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_InpatientEpisode(valueObjectSrc.getID_InpatientEpisode());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// EstDischargeDate
		valueObjectDest.setEstDischargeDate(valueObjectSrc.getEstDischargeDate());
		// Comments
		valueObjectDest.setComments(valueObjectSrc.getComments());
		// WardType
		valueObjectDest.setWardType(valueObjectSrc.getWardType());
		// Bed
		valueObjectDest.setBed(valueObjectSrc.getBed());
		// isConfirmedDischarge
		valueObjectDest.setIsConfirmedDischarge(valueObjectSrc.getIsConfirmedDischarge());
		// ConfirmedDischargeDateTime
		valueObjectDest.setConfirmedDischargeDateTime(valueObjectSrc.getConfirmedDischargeDateTime());
		// isOnHomeLeave
		valueObjectDest.setIsOnHomeLeave(valueObjectSrc.getIsOnHomeLeave());
		// ExpectedDateOfReturn
		valueObjectDest.setExpectedDateOfReturn(valueObjectSrc.getExpectedDateOfReturn());
		// ExpectedTimeOfReturn
		valueObjectDest.setExpectedTimeOfReturn(valueObjectSrc.getExpectedTimeOfReturn());
		// pasEvent
		valueObjectDest.setPasEvent(valueObjectSrc.getPasEvent());
		// DateOnHomeLeave
		valueObjectDest.setDateOnHomeLeave(valueObjectSrc.getDateOnHomeLeave());
		// TimeOnHomeLeave
		valueObjectDest.setTimeOnHomeLeave(valueObjectSrc.getTimeOnHomeLeave());
		// HomeLeaves
		valueObjectDest.setHomeLeaves(valueObjectSrc.getHomeLeaves());
		// CurrentTrackingMovement
		valueObjectDest.setCurrentTrackingMovement(valueObjectSrc.getCurrentTrackingMovement());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSpecialtyOutlierInpatientEpisodeListVoCollectionFromInpatientEpisode(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.InpatientEpisode objects.
	 */
	public static ims.core.vo.SpecialtyOutlierInpatientEpisodeListVoCollection createSpecialtyOutlierInpatientEpisodeListVoCollectionFromInpatientEpisode(java.util.Set domainObjectSet)	
	{
		return createSpecialtyOutlierInpatientEpisodeListVoCollectionFromInpatientEpisode(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.InpatientEpisode objects.
	 */
	public static ims.core.vo.SpecialtyOutlierInpatientEpisodeListVoCollection createSpecialtyOutlierInpatientEpisodeListVoCollectionFromInpatientEpisode(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.SpecialtyOutlierInpatientEpisodeListVoCollection voList = new ims.core.vo.SpecialtyOutlierInpatientEpisodeListVoCollection();
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
			ims.core.vo.SpecialtyOutlierInpatientEpisodeListVo vo = create(map, domainObject);
			
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
	public static ims.core.vo.SpecialtyOutlierInpatientEpisodeListVoCollection createSpecialtyOutlierInpatientEpisodeListVoCollectionFromInpatientEpisode(java.util.List domainObjectList) 
	{
		return createSpecialtyOutlierInpatientEpisodeListVoCollectionFromInpatientEpisode(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.InpatientEpisode objects.
	 */
	public static ims.core.vo.SpecialtyOutlierInpatientEpisodeListVoCollection createSpecialtyOutlierInpatientEpisodeListVoCollectionFromInpatientEpisode(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.SpecialtyOutlierInpatientEpisodeListVoCollection voList = new ims.core.vo.SpecialtyOutlierInpatientEpisodeListVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.InpatientEpisode domainObject = (ims.core.admin.pas.domain.objects.InpatientEpisode) domainObjectList.get(i);
			ims.core.vo.SpecialtyOutlierInpatientEpisodeListVo vo = create(map, domainObject);

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
	 public static java.util.Set extractInpatientEpisodeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.SpecialtyOutlierInpatientEpisodeListVoCollection voCollection) 
	 {
	 	return extractInpatientEpisodeSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractInpatientEpisodeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.SpecialtyOutlierInpatientEpisodeListVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.SpecialtyOutlierInpatientEpisodeListVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.InpatientEpisode domainObject = SpecialtyOutlierInpatientEpisodeListVoAssembler.extractInpatientEpisode(domainFactory, vo, domMap);

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
	 public static java.util.List extractInpatientEpisodeList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.SpecialtyOutlierInpatientEpisodeListVoCollection voCollection) 
	 {
	 	return extractInpatientEpisodeList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractInpatientEpisodeList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.SpecialtyOutlierInpatientEpisodeListVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.SpecialtyOutlierInpatientEpisodeListVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.InpatientEpisode domainObject = SpecialtyOutlierInpatientEpisodeListVoAssembler.extractInpatientEpisode(domainFactory, vo, domMap);

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
	 public static ims.core.vo.SpecialtyOutlierInpatientEpisodeListVo create(ims.core.admin.pas.domain.objects.InpatientEpisode domainObject) 
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
	  public static ims.core.vo.SpecialtyOutlierInpatientEpisodeListVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.InpatientEpisode domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.SpecialtyOutlierInpatientEpisodeListVo valueObject = (ims.core.vo.SpecialtyOutlierInpatientEpisodeListVo) map.getValueObject(domainObject, ims.core.vo.SpecialtyOutlierInpatientEpisodeListVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.SpecialtyOutlierInpatientEpisodeListVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.core.vo.SpecialtyOutlierInpatientEpisodeListVo insert(ims.core.vo.SpecialtyOutlierInpatientEpisodeListVo valueObject, ims.core.admin.pas.domain.objects.InpatientEpisode domainObject) 
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
	 public static ims.core.vo.SpecialtyOutlierInpatientEpisodeListVo insert(DomainObjectMap map, ims.core.vo.SpecialtyOutlierInpatientEpisodeListVo valueObject, ims.core.admin.pas.domain.objects.InpatientEpisode domainObject) 
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
			
		// EstDischargeDate
		java.util.Date EstDischargeDate = domainObject.getEstDischargeDate();
		if ( null != EstDischargeDate ) 
		{
			valueObject.setEstDischargeDate(new ims.framework.utils.DateTime(EstDischargeDate) );
		}
		// Comments
		valueObject.setComments(domainObject.getComments());
		// WardType
		ims.domain.lookups.LookupInstance instance3 = domainObject.getWardType();
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

			ims.core.vo.lookups.WardType voLookup3 = new ims.core.vo.lookups.WardType(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.WardType parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.WardType(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setWardType(voLookup3);
		}
				// Bed
		valueObject.setBed(ims.core.vo.domain.BedSpaceStateLiteVoAssembler.create(map, domainObject.getBed()) );
		// isConfirmedDischarge
		valueObject.setIsConfirmedDischarge( domainObject.isIsConfirmedDischarge() );
		// ConfirmedDischargeDateTime
		java.util.Date ConfirmedDischargeDateTime = domainObject.getConfirmedDischargeDateTime();
		if ( null != ConfirmedDischargeDateTime ) 
		{
			valueObject.setConfirmedDischargeDateTime(new ims.framework.utils.DateTime(ConfirmedDischargeDateTime) );
		}
		// isOnHomeLeave
		valueObject.setIsOnHomeLeave( domainObject.isIsOnHomeLeave() );
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
		// pasEvent
		valueObject.setPasEvent(ims.core.vo.domain.PasEventForSTHKListVoAssembler.create(map, domainObject.getPasEvent()) );
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
		// HomeLeaves
		ims.core.admin.pas.vo.HomeLeaveRefVoCollection HomeLeaves = new ims.core.admin.pas.vo.HomeLeaveRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getHomeLeaves().iterator(); iterator.hasNext(); ) 
		{
			ims.core.admin.pas.domain.objects.HomeLeave tmp = (ims.core.admin.pas.domain.objects.HomeLeave)iterator.next();
			if (tmp != null)
				HomeLeaves.add(new ims.core.admin.pas.vo.HomeLeaveRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setHomeLeaves(HomeLeaves);
		// CurrentTrackingMovement
		valueObject.setCurrentTrackingMovement(ims.core.vo.domain.TrackingMovementLiteVoAssembler.create(map, domainObject.getCurrentTrackingMovement()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.pas.domain.objects.InpatientEpisode extractInpatientEpisode(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.SpecialtyOutlierInpatientEpisodeListVo valueObject) 
	{
		return 	extractInpatientEpisode(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.InpatientEpisode extractInpatientEpisode(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.SpecialtyOutlierInpatientEpisodeListVo valueObject, HashMap domMap) 
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
			// ims.core.vo.SpecialtyOutlierInpatientEpisodeListVo ID_InpatientEpisode field is unknown
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

		ims.framework.utils.DateTime dateTime1 = valueObject.getEstDischargeDate();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setEstDischargeDate(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComments() != null && valueObject.getComments().equals(""))
		{
			valueObject.setComments(null);
		}
		domainObject.setComments(valueObject.getComments());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getWardType() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getWardType().getID());
		}
		domainObject.setWardType(value3);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.pas.domain.objects.BedSpaceState value4 = null;
		if ( null != valueObject.getBed() ) 
		{
			if (valueObject.getBed().getBoId() == null)
			{
				if (domMap.get(valueObject.getBed()) != null)
				{
					value4 = (ims.core.admin.pas.domain.objects.BedSpaceState)domMap.get(valueObject.getBed());
				}
			}
			else
			{
				value4 = (ims.core.admin.pas.domain.objects.BedSpaceState)domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.BedSpaceState.class, valueObject.getBed().getBoId());
			}
		}
		domainObject.setBed(value4);
		domainObject.setIsConfirmedDischarge(valueObject.getIsConfirmedDischarge());
		ims.framework.utils.DateTime dateTime6 = valueObject.getConfirmedDischargeDateTime();
		java.util.Date value6 = null;
		if ( dateTime6 != null ) 
		{
			value6 = dateTime6.getJavaDate();
		}
		domainObject.setConfirmedDischargeDateTime(value6);
		domainObject.setIsOnHomeLeave(valueObject.getIsOnHomeLeave());
		java.util.Date value8 = null;
		ims.framework.utils.Date date8 = valueObject.getExpectedDateOfReturn();		
		if ( date8 != null ) 
		{
			value8 = date8.getDate();
		}
		domainObject.setExpectedDateOfReturn(value8);
		ims.framework.utils.Time time9 = valueObject.getExpectedTimeOfReturn();
		String value9 = null;
		if ( time9 != null ) 
		{
			value9 = time9.toString();
		}
		domainObject.setExpectedTimeOfReturn(value9);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.pas.domain.objects.PASEvent value10 = null;
		if ( null != valueObject.getPasEvent() ) 
		{
			if (valueObject.getPasEvent().getBoId() == null)
			{
				if (domMap.get(valueObject.getPasEvent()) != null)
				{
					value10 = (ims.core.admin.pas.domain.objects.PASEvent)domMap.get(valueObject.getPasEvent());
				}
			}
			else
			{
				value10 = (ims.core.admin.pas.domain.objects.PASEvent)domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.PASEvent.class, valueObject.getPasEvent().getBoId());
			}
		}
		domainObject.setPasEvent(value10);
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

		ims.core.admin.pas.vo.HomeLeaveRefVoCollection refCollection13 = valueObject.getHomeLeaves();
		int size13 = (null == refCollection13) ? 0 : refCollection13.size();		
		java.util.List domainHomeLeaves13 = domainObject.getHomeLeaves();
		if (domainHomeLeaves13 == null)
		{
			domainHomeLeaves13 = new java.util.ArrayList();
		}
		for(int i=0; i < size13; i++) 
		{
			ims.core.admin.pas.vo.HomeLeaveRefVo vo = refCollection13.get(i);			
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

			int domIdx = domainHomeLeaves13.indexOf(dom);
			if (domIdx == -1)
			{
				domainHomeLeaves13.add(i, dom);
			}
			else if (i != domIdx && i < domainHomeLeaves13.size())
			{
				Object tmp = domainHomeLeaves13.get(i);
				domainHomeLeaves13.set(i, domainHomeLeaves13.get(domIdx));
				domainHomeLeaves13.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i13 = domainHomeLeaves13.size();
		while (i13 > size13)
		{
			domainHomeLeaves13.remove(i13-1);
			i13 = domainHomeLeaves13.size();
		}
		
		domainObject.setHomeLeaves(domainHomeLeaves13);		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.pas.domain.objects.TrackingMovement value14 = null;
		if ( null != valueObject.getCurrentTrackingMovement() ) 
		{
			if (valueObject.getCurrentTrackingMovement().getBoId() == null)
			{
				if (domMap.get(valueObject.getCurrentTrackingMovement()) != null)
				{
					value14 = (ims.core.admin.pas.domain.objects.TrackingMovement)domMap.get(valueObject.getCurrentTrackingMovement());
				}
			}
			else
			{
				value14 = (ims.core.admin.pas.domain.objects.TrackingMovement)domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.TrackingMovement.class, valueObject.getCurrentTrackingMovement().getBoId());
			}
		}
		domainObject.setCurrentTrackingMovement(value14);

		return domainObject;
	}

}
