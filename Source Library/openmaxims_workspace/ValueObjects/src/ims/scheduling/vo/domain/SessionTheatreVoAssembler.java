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
 * Generated on 12/10/2015, 13:25
 *
 */
package ims.scheduling.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class SessionTheatreVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.SessionTheatreVo copy(ims.scheduling.vo.SessionTheatreVo valueObjectDest, ims.scheduling.vo.SessionTheatreVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Sch_Session(valueObjectSrc.getID_Sch_Session());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// SessionDate
		valueObjectDest.setSessionDate(valueObjectSrc.getSessionDate());
		// StartTm
		valueObjectDest.setStartTm(valueObjectSrc.getStartTm());
		// EndTm
		valueObjectDest.setEndTm(valueObjectSrc.getEndTm());
		// RemainingTime
		valueObjectDest.setRemainingTime(valueObjectSrc.getRemainingTime());
		// SchLocation
		valueObjectDest.setSchLocation(valueObjectSrc.getSchLocation());
		// ListOwners
		valueObjectDest.setListOwners(valueObjectSrc.getListOwners());
		// TheatreType
		valueObjectDest.setTheatreType(valueObjectSrc.getTheatreType());
		// TheatreProceduresRemaining
		valueObjectDest.setTheatreProceduresRemaining(valueObjectSrc.getTheatreProceduresRemaining());
		// TheatreSlots
		valueObjectDest.setTheatreSlots(valueObjectSrc.getTheatreSlots());
		// AnaestheticType
		valueObjectDest.setAnaestheticType(valueObjectSrc.getAnaestheticType());
		// Service
		valueObjectDest.setService(valueObjectSrc.getService());
		// ExclusionTimes
		valueObjectDest.setExclusionTimes(valueObjectSrc.getExclusionTimes());
		// SessionComment
		valueObjectDest.setSessionComment(valueObjectSrc.getSessionComment());
		// SessionProfileType
		valueObjectDest.setSessionProfileType(valueObjectSrc.getSessionProfileType());
		// ListType
		valueObjectDest.setListType(valueObjectSrc.getListType());
		// ParentChildSlots
		valueObjectDest.setParentChildSlots(valueObjectSrc.getParentChildSlots());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSessionTheatreVoCollectionFromSch_Session(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Sch_Session objects.
	 */
	public static ims.scheduling.vo.SessionTheatreVoCollection createSessionTheatreVoCollectionFromSch_Session(java.util.Set domainObjectSet)	
	{
		return createSessionTheatreVoCollectionFromSch_Session(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Sch_Session objects.
	 */
	public static ims.scheduling.vo.SessionTheatreVoCollection createSessionTheatreVoCollectionFromSch_Session(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.SessionTheatreVoCollection voList = new ims.scheduling.vo.SessionTheatreVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.scheduling.domain.objects.Sch_Session domainObject = (ims.scheduling.domain.objects.Sch_Session) iterator.next();
			ims.scheduling.vo.SessionTheatreVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Sch_Session objects.
	 */
	public static ims.scheduling.vo.SessionTheatreVoCollection createSessionTheatreVoCollectionFromSch_Session(java.util.List domainObjectList) 
	{
		return createSessionTheatreVoCollectionFromSch_Session(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Sch_Session objects.
	 */
	public static ims.scheduling.vo.SessionTheatreVoCollection createSessionTheatreVoCollectionFromSch_Session(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.SessionTheatreVoCollection voList = new ims.scheduling.vo.SessionTheatreVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.Sch_Session domainObject = (ims.scheduling.domain.objects.Sch_Session) domainObjectList.get(i);
			ims.scheduling.vo.SessionTheatreVo vo = create(map, domainObject);

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
	 * Create the ims.scheduling.domain.objects.Sch_Session set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractSch_SessionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionTheatreVoCollection voCollection) 
	 {
	 	return extractSch_SessionSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSch_SessionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionTheatreVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.SessionTheatreVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Sch_Session domainObject = SessionTheatreVoAssembler.extractSch_Session(domainFactory, vo, domMap);

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
	 * Create the ims.scheduling.domain.objects.Sch_Session list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractSch_SessionList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionTheatreVoCollection voCollection) 
	 {
	 	return extractSch_SessionList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSch_SessionList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionTheatreVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.SessionTheatreVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Sch_Session domainObject = SessionTheatreVoAssembler.extractSch_Session(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.scheduling.domain.objects.Sch_Session object.
	 * @param domainObject ims.scheduling.domain.objects.Sch_Session
	 */
	 public static ims.scheduling.vo.SessionTheatreVo create(ims.scheduling.domain.objects.Sch_Session domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.scheduling.domain.objects.Sch_Session object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.scheduling.vo.SessionTheatreVo create(DomainObjectMap map, ims.scheduling.domain.objects.Sch_Session domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.SessionTheatreVo valueObject = (ims.scheduling.vo.SessionTheatreVo) map.getValueObject(domainObject, ims.scheduling.vo.SessionTheatreVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.SessionTheatreVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.scheduling.domain.objects.Sch_Session
	 */
	 public static ims.scheduling.vo.SessionTheatreVo insert(ims.scheduling.vo.SessionTheatreVo valueObject, ims.scheduling.domain.objects.Sch_Session domainObject) 
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
	 * @param domainObject ims.scheduling.domain.objects.Sch_Session
	 */
	 public static ims.scheduling.vo.SessionTheatreVo insert(DomainObjectMap map, ims.scheduling.vo.SessionTheatreVo valueObject, ims.scheduling.domain.objects.Sch_Session domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Sch_Session(domainObject.getId());
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
			
		// Name
		valueObject.setName(domainObject.getName());
		// SessionDate
		java.util.Date SessionDate = domainObject.getSessionDate();
		if ( null != SessionDate ) 
		{
			valueObject.setSessionDate(new ims.framework.utils.Date(SessionDate) );
		}
		// StartTm
		String StartTm = domainObject.getStartTm();
		if ( null != StartTm ) 
		{
			valueObject.setStartTm(new ims.framework.utils.Time(StartTm) );
		}
		// EndTm
		String EndTm = domainObject.getEndTm();
		if ( null != EndTm ) 
		{
			valueObject.setEndTm(new ims.framework.utils.Time(EndTm) );
		}
		// RemainingTime
		valueObject.setRemainingTime(domainObject.getRemainingTime());
		// SchLocation
		valueObject.setSchLocation(ims.scheduling.vo.domain.LocationForTheatreSessionVoAssembler.create(map, domainObject.getSchLocation()) );
		// ListOwners
		valueObject.setListOwners(ims.scheduling.vo.domain.Session_ListOwnerVoAssembler.createSession_ListOwnerVoCollectionFromSession_ListOwner(map, domainObject.getListOwners()) );
		// TheatreType
		ims.domain.lookups.LookupInstance instance8 = domainObject.getTheatreType();
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

			ims.scheduling.vo.lookups.TheatreType voLookup8 = new ims.scheduling.vo.lookups.TheatreType(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.scheduling.vo.lookups.TheatreType parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.scheduling.vo.lookups.TheatreType(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setTheatreType(voLookup8);
		}
				// TheatreProceduresRemaining
		valueObject.setTheatreProceduresRemaining(ims.scheduling.vo.domain.SessionTheatreProceduresRemainingVoAssembler.create(map, domainObject.getTheatreProceduresRemaining()) );
		// TheatreSlots
		valueObject.setTheatreSlots(ims.scheduling.vo.domain.SessionTheatreTCISlotLiteVoAssembler.createSessionTheatreTCISlotLiteVoCollectionFromSessionTheatreTCISlot(map, domainObject.getTheatreSlots()) );
		// AnaestheticType
		java.util.List listAnaestheticType = domainObject.getAnaestheticType();
		ims.clinical.vo.lookups.AnaestheticTypeCollection AnaestheticType = new ims.clinical.vo.lookups.AnaestheticTypeCollection();
		for(java.util.Iterator iterator = listAnaestheticType.iterator(); iterator.hasNext(); ) 
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
			ims.clinical.vo.lookups.AnaestheticType voInstance = new ims.clinical.vo.lookups.AnaestheticType(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.clinical.vo.lookups.AnaestheticType parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.clinical.vo.lookups.AnaestheticType(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			AnaestheticType.add(voInstance);
		}
		valueObject.setAnaestheticType( AnaestheticType );
		// Service
		if (domainObject.getService() != null)
		{
			if(domainObject.getService() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getService();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setService(new ims.core.clinical.vo.ServiceRefVo(id, -1));				
			}
			else
			{
				valueObject.setService(new ims.core.clinical.vo.ServiceRefVo(domainObject.getService().getId(), domainObject.getService().getVersion()));
			}
		}
		// ExclusionTimes
		valueObject.setExclusionTimes(ims.scheduling.vo.domain.ExclusionTimesVoAssembler.createExclusionTimesVoCollectionFromSession_Exc_Time(map, domainObject.getExclusionTimes()) );
		// SessionComment
		valueObject.setSessionComment(domainObject.getSessionComment());
		// SessionProfileType
		ims.domain.lookups.LookupInstance instance15 = domainObject.getSessionProfileType();
		if ( null != instance15 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance15.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance15.getImage().getImageId(), instance15.getImage().getImagePath());
			}
			color = instance15.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.SchProfileType voLookup15 = new ims.scheduling.vo.lookups.SchProfileType(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.scheduling.vo.lookups.SchProfileType parentVoLookup15 = voLookup15;
			ims.domain.lookups.LookupInstance parent15 = instance15.getParent();
			while (parent15 != null)
			{
				if (parent15.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent15.getImage().getImageId(), parent15.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent15.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup15.setParent(new ims.scheduling.vo.lookups.SchProfileType(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setSessionProfileType(voLookup15);
		}
				// ListType
		ims.domain.lookups.LookupInstance instance16 = domainObject.getListType();
		if ( null != instance16 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance16.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance16.getImage().getImageId(), instance16.getImage().getImagePath());
			}
			color = instance16.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.ProfileListType voLookup16 = new ims.scheduling.vo.lookups.ProfileListType(instance16.getId(),instance16.getText(), instance16.isActive(), null, img, color);
			ims.scheduling.vo.lookups.ProfileListType parentVoLookup16 = voLookup16;
			ims.domain.lookups.LookupInstance parent16 = instance16.getParent();
			while (parent16 != null)
			{
				if (parent16.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent16.getImage().getImageId(), parent16.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent16.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup16.setParent(new ims.scheduling.vo.lookups.ProfileListType(parent16.getId(),parent16.getText(), parent16.isActive(), null, img, color));
				parentVoLookup16 = parentVoLookup16.getParent();
								parent16 = parent16.getParent();
			}			
			valueObject.setListType(voLookup16);
		}
				// ParentChildSlots
		valueObject.setParentChildSlots(ims.scheduling.vo.domain.SessionParentChildSlotVoAssembler.createSessionParentChildSlotVoCollectionFromSessionParentChildSlot(map, domainObject.getParentChildSlots()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.Sch_Session extractSch_Session(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionTheatreVo valueObject) 
	{
		return 	extractSch_Session(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.Sch_Session extractSch_Session(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionTheatreVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Sch_Session();
		ims.scheduling.domain.objects.Sch_Session domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.scheduling.domain.objects.Sch_Session)domMap.get(valueObject);
			}
			// ims.scheduling.vo.SessionTheatreVo ID_Sch_Session field is unknown
			domainObject = new ims.scheduling.domain.objects.Sch_Session();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Sch_Session());
			if (domMap.get(key) != null)
			{
				return (ims.scheduling.domain.objects.Sch_Session)domMap.get(key);
			}
			domainObject = (ims.scheduling.domain.objects.Sch_Session) domainFactory.getDomainObject(ims.scheduling.domain.objects.Sch_Session.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Sch_Session());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());
		java.util.Date value2 = null;
		ims.framework.utils.Date date2 = valueObject.getSessionDate();		
		if ( date2 != null ) 
		{
			value2 = date2.getDate();
		}
		domainObject.setSessionDate(value2);
		ims.framework.utils.Time time3 = valueObject.getStartTm();
		String value3 = null;
		if ( time3 != null ) 
		{
			value3 = time3.toString();
		}
		domainObject.setStartTm(value3);
		ims.framework.utils.Time time4 = valueObject.getEndTm();
		String value4 = null;
		if ( time4 != null ) 
		{
			value4 = time4.toString();
		}
		domainObject.setEndTm(value4);
		domainObject.setRemainingTime(valueObject.getRemainingTime());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value6 = null;
		if ( null != valueObject.getSchLocation() ) 
		{
			if (valueObject.getSchLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getSchLocation()) != null)
				{
					value6 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getSchLocation());
				}
			}
			else
			{
				value6 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getSchLocation().getBoId());
			}
		}
		domainObject.setSchLocation(value6);

		// SaveAsRefVO treated as RefValueObject
		ims.scheduling.vo.Session_ListOwnerRefVoCollection refCollection7 = new ims.scheduling.vo.Session_ListOwnerRefVoCollection();
		if (valueObject.getListOwners() != null)
		{
			for (int i7=0; i7<valueObject.getListOwners().size(); i7++)
			{
				ims.scheduling.vo.Session_ListOwnerRefVo ref7 = (ims.scheduling.vo.Session_ListOwnerRefVo)valueObject.getListOwners().get(i7);
				refCollection7.add(ref7);
			}
		}
		int size7 = (null == refCollection7) ? 0 : refCollection7.size();		
		java.util.Set domainListOwners7 = domainObject.getListOwners();
		if (domainListOwners7 == null)
		{
			domainListOwners7 = new java.util.HashSet();
		}
		java.util.Set newSet7  = new java.util.HashSet();
		for(int i=0; i<size7; i++) 
		{
			ims.scheduling.vo.Session_ListOwnerRefVo vo = refCollection7.get(i);					
			ims.scheduling.domain.objects.Session_ListOwner dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.scheduling.domain.objects.Session_ListOwner)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.scheduling.domain.objects.Session_ListOwner)domainFactory.getDomainObject( ims.scheduling.domain.objects.Session_ListOwner.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainListOwners7.contains(dom))
			{
				domainListOwners7.add(dom);
			}
			newSet7.add(dom);			
		}
		java.util.Set removedSet7 = new java.util.HashSet();
		java.util.Iterator iter7 = domainListOwners7.iterator();
		//Find out which objects need to be removed
		while (iter7.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter7.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet7.contains(o))
			{
				removedSet7.add(o);
			}
		}
		iter7 = removedSet7.iterator();
		//Remove the unwanted objects
		while (iter7.hasNext())
		{
			domainListOwners7.remove(iter7.next());
		}		
		
		domainObject.setListOwners(domainListOwners7);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getTheatreType() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getTheatreType().getID());
		}
		domainObject.setTheatreType(value8);
		domainObject.setTheatreProceduresRemaining(ims.scheduling.vo.domain.SessionTheatreProceduresRemainingVoAssembler.extractSessionTheatreProceduresRemanining(domainFactory, valueObject.getTheatreProceduresRemaining(), domMap));

		// SaveAsRefVO treated as RefValueObject
		ims.scheduling.vo.SessionTheatreTCISlotRefVoCollection refCollection10 = new ims.scheduling.vo.SessionTheatreTCISlotRefVoCollection();
		if (valueObject.getTheatreSlots() != null)
		{
			for (int i10=0; i10<valueObject.getTheatreSlots().size(); i10++)
			{
				ims.scheduling.vo.SessionTheatreTCISlotRefVo ref10 = (ims.scheduling.vo.SessionTheatreTCISlotRefVo)valueObject.getTheatreSlots().get(i10);
				refCollection10.add(ref10);
			}
		}
		int size10 = (null == refCollection10) ? 0 : refCollection10.size();		
		java.util.Set domainTheatreSlots10 = domainObject.getTheatreSlots();
		if (domainTheatreSlots10 == null)
		{
			domainTheatreSlots10 = new java.util.HashSet();
		}
		java.util.Set newSet10  = new java.util.HashSet();
		for(int i=0; i<size10; i++) 
		{
			ims.scheduling.vo.SessionTheatreTCISlotRefVo vo = refCollection10.get(i);					
			ims.scheduling.domain.objects.SessionTheatreTCISlot dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.scheduling.domain.objects.SessionTheatreTCISlot)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.scheduling.domain.objects.SessionTheatreTCISlot)domainFactory.getDomainObject( ims.scheduling.domain.objects.SessionTheatreTCISlot.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainTheatreSlots10.contains(dom))
			{
				domainTheatreSlots10.add(dom);
			}
			newSet10.add(dom);			
		}
		java.util.Set removedSet10 = new java.util.HashSet();
		java.util.Iterator iter10 = domainTheatreSlots10.iterator();
		//Find out which objects need to be removed
		while (iter10.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter10.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet10.contains(o))
			{
				removedSet10.add(o);
			}
		}
		iter10 = removedSet10.iterator();
		//Remove the unwanted objects
		while (iter10.hasNext())
		{
			domainTheatreSlots10.remove(iter10.next());
		}		
		
		domainObject.setTheatreSlots(domainTheatreSlots10);		
		ims.clinical.vo.lookups.AnaestheticTypeCollection collection11 =
	valueObject.getAnaestheticType();
	    java.util.List domainAnaestheticType = domainObject.getAnaestheticType();;			
	    int collection11Size=0;
		if (collection11 == null)
		{
			domainAnaestheticType = new java.util.ArrayList(0);
		}
		else
		{
			collection11Size = collection11.size();
		}
		
		for(int i=0; i<collection11Size; i++) 
		{
			int instanceId = collection11.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainAnaestheticType.indexOf(dom);
			if (domIdx == -1)
			{
				domainAnaestheticType.add(i, dom);
			}
			else if (i != domIdx && i < domainAnaestheticType.size())
			{
				Object tmp = domainAnaestheticType.get(i);
				domainAnaestheticType.set(i, domainAnaestheticType.get(domIdx));
				domainAnaestheticType.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j11 = domainAnaestheticType.size();
		while (j11 > collection11Size)
		{
			domainAnaestheticType.remove(j11-1);
			j11 = domainAnaestheticType.size();
		}

		domainObject.setAnaestheticType(domainAnaestheticType);		
		ims.core.clinical.domain.objects.Service value12 = null;
		if ( null != valueObject.getService() ) 
		{
			if (valueObject.getService().getBoId() == null)
			{
				if (domMap.get(valueObject.getService()) != null)
				{
					value12 = (ims.core.clinical.domain.objects.Service)domMap.get(valueObject.getService());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value12 = domainObject.getService();	
			}
			else
			{
				value12 = (ims.core.clinical.domain.objects.Service)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Service.class, valueObject.getService().getBoId());
			}
		}
		domainObject.setService(value12);

		// SaveAsRefVO treated as RefValueObject
		ims.scheduling.vo.Session_Exc_TimeRefVoCollection refCollection13 = new ims.scheduling.vo.Session_Exc_TimeRefVoCollection();
		if (valueObject.getExclusionTimes() != null)
		{
			for (int i13=0; i13<valueObject.getExclusionTimes().size(); i13++)
			{
				ims.scheduling.vo.Session_Exc_TimeRefVo ref13 = (ims.scheduling.vo.Session_Exc_TimeRefVo)valueObject.getExclusionTimes().get(i13);
				refCollection13.add(ref13);
			}
		}
		int size13 = (null == refCollection13) ? 0 : refCollection13.size();		
		java.util.Set domainExclusionTimes13 = domainObject.getExclusionTimes();
		if (domainExclusionTimes13 == null)
		{
			domainExclusionTimes13 = new java.util.HashSet();
		}
		java.util.Set newSet13  = new java.util.HashSet();
		for(int i=0; i<size13; i++) 
		{
			ims.scheduling.vo.Session_Exc_TimeRefVo vo = refCollection13.get(i);					
			ims.scheduling.domain.objects.Session_Exc_Time dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.scheduling.domain.objects.Session_Exc_Time)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.scheduling.domain.objects.Session_Exc_Time)domainFactory.getDomainObject( ims.scheduling.domain.objects.Session_Exc_Time.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainExclusionTimes13.contains(dom))
			{
				domainExclusionTimes13.add(dom);
			}
			newSet13.add(dom);			
		}
		java.util.Set removedSet13 = new java.util.HashSet();
		java.util.Iterator iter13 = domainExclusionTimes13.iterator();
		//Find out which objects need to be removed
		while (iter13.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter13.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet13.contains(o))
			{
				removedSet13.add(o);
			}
		}
		iter13 = removedSet13.iterator();
		//Remove the unwanted objects
		while (iter13.hasNext())
		{
			domainExclusionTimes13.remove(iter13.next());
		}		
		
		domainObject.setExclusionTimes(domainExclusionTimes13);		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSessionComment() != null && valueObject.getSessionComment().equals(""))
		{
			valueObject.setSessionComment(null);
		}
		domainObject.setSessionComment(valueObject.getSessionComment());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getSessionProfileType() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getSessionProfileType().getID());
		}
		domainObject.setSessionProfileType(value15);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getListType() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getListType().getID());
		}
		domainObject.setListType(value16);
		domainObject.setParentChildSlots(ims.scheduling.vo.domain.SessionParentChildSlotVoAssembler.extractSessionParentChildSlotSet(domainFactory, valueObject.getParentChildSlots(), domainObject.getParentChildSlots(), domMap));		

		return domainObject;
	}

}
