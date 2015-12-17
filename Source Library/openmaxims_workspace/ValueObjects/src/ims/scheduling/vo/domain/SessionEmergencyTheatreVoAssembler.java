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
 * @author Bogdan Tofei
 */
public class SessionEmergencyTheatreVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.SessionEmergencyTheatreVo copy(ims.scheduling.vo.SessionEmergencyTheatreVo valueObjectDest, ims.scheduling.vo.SessionEmergencyTheatreVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Sch_Session(valueObjectSrc.getID_Sch_Session());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// SessionDate
		valueObjectDest.setSessionDate(valueObjectSrc.getSessionDate());
		// SchLocation
		valueObjectDest.setSchLocation(valueObjectSrc.getSchLocation());
		// ListOwners
		valueObjectDest.setListOwners(valueObjectSrc.getListOwners());
		// TheatreProceduresRemaining
		valueObjectDest.setTheatreProceduresRemaining(valueObjectSrc.getTheatreProceduresRemaining());
		// ListType
		valueObjectDest.setListType(valueObjectSrc.getListType());
		// SessionComment
		valueObjectDest.setSessionComment(valueObjectSrc.getSessionComment());
		// EndTm
		valueObjectDest.setEndTm(valueObjectSrc.getEndTm());
		// ParentChildSlots
		valueObjectDest.setParentChildSlots(valueObjectSrc.getParentChildSlots());
		// TheatreType
		valueObjectDest.setTheatreType(valueObjectSrc.getTheatreType());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSessionEmergencyTheatreVoCollectionFromSch_Session(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Sch_Session objects.
	 */
	public static ims.scheduling.vo.SessionEmergencyTheatreVoCollection createSessionEmergencyTheatreVoCollectionFromSch_Session(java.util.Set domainObjectSet)	
	{
		return createSessionEmergencyTheatreVoCollectionFromSch_Session(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Sch_Session objects.
	 */
	public static ims.scheduling.vo.SessionEmergencyTheatreVoCollection createSessionEmergencyTheatreVoCollectionFromSch_Session(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.SessionEmergencyTheatreVoCollection voList = new ims.scheduling.vo.SessionEmergencyTheatreVoCollection();
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
			ims.scheduling.vo.SessionEmergencyTheatreVo vo = create(map, domainObject);
			
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
	public static ims.scheduling.vo.SessionEmergencyTheatreVoCollection createSessionEmergencyTheatreVoCollectionFromSch_Session(java.util.List domainObjectList) 
	{
		return createSessionEmergencyTheatreVoCollectionFromSch_Session(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Sch_Session objects.
	 */
	public static ims.scheduling.vo.SessionEmergencyTheatreVoCollection createSessionEmergencyTheatreVoCollectionFromSch_Session(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.SessionEmergencyTheatreVoCollection voList = new ims.scheduling.vo.SessionEmergencyTheatreVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.Sch_Session domainObject = (ims.scheduling.domain.objects.Sch_Session) domainObjectList.get(i);
			ims.scheduling.vo.SessionEmergencyTheatreVo vo = create(map, domainObject);

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
	 public static java.util.Set extractSch_SessionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionEmergencyTheatreVoCollection voCollection) 
	 {
	 	return extractSch_SessionSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSch_SessionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionEmergencyTheatreVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.SessionEmergencyTheatreVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Sch_Session domainObject = SessionEmergencyTheatreVoAssembler.extractSch_Session(domainFactory, vo, domMap);

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
	 public static java.util.List extractSch_SessionList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionEmergencyTheatreVoCollection voCollection) 
	 {
	 	return extractSch_SessionList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSch_SessionList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionEmergencyTheatreVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.SessionEmergencyTheatreVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Sch_Session domainObject = SessionEmergencyTheatreVoAssembler.extractSch_Session(domainFactory, vo, domMap);

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
	 public static ims.scheduling.vo.SessionEmergencyTheatreVo create(ims.scheduling.domain.objects.Sch_Session domainObject) 
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
	  public static ims.scheduling.vo.SessionEmergencyTheatreVo create(DomainObjectMap map, ims.scheduling.domain.objects.Sch_Session domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.SessionEmergencyTheatreVo valueObject = (ims.scheduling.vo.SessionEmergencyTheatreVo) map.getValueObject(domainObject, ims.scheduling.vo.SessionEmergencyTheatreVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.SessionEmergencyTheatreVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.scheduling.vo.SessionEmergencyTheatreVo insert(ims.scheduling.vo.SessionEmergencyTheatreVo valueObject, ims.scheduling.domain.objects.Sch_Session domainObject) 
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
	 public static ims.scheduling.vo.SessionEmergencyTheatreVo insert(DomainObjectMap map, ims.scheduling.vo.SessionEmergencyTheatreVo valueObject, ims.scheduling.domain.objects.Sch_Session domainObject) 
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
			
		// SessionDate
		java.util.Date SessionDate = domainObject.getSessionDate();
		if ( null != SessionDate ) 
		{
			valueObject.setSessionDate(new ims.framework.utils.Date(SessionDate) );
		}
		// SchLocation
		valueObject.setSchLocation(ims.core.vo.domain.LocationMinVoAssembler.create(map, domainObject.getSchLocation()) );
		// ListOwners
		valueObject.setListOwners(ims.scheduling.vo.domain.SessionListOwnerLiteVoAssembler.createSessionListOwnerLiteVoCollectionFromSession_ListOwner(map, domainObject.getListOwners()) );
		// TheatreProceduresRemaining
		valueObject.setTheatreProceduresRemaining(ims.scheduling.vo.domain.TheatreProceduresRemainingTimeVoAssembler.create(map, domainObject.getTheatreProceduresRemaining()) );
		// ListType
		ims.domain.lookups.LookupInstance instance5 = domainObject.getListType();
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

			ims.scheduling.vo.lookups.ProfileListType voLookup5 = new ims.scheduling.vo.lookups.ProfileListType(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.scheduling.vo.lookups.ProfileListType parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.scheduling.vo.lookups.ProfileListType(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setListType(voLookup5);
		}
				// SessionComment
		valueObject.setSessionComment(domainObject.getSessionComment());
		// EndTm
		String EndTm = domainObject.getEndTm();
		if ( null != EndTm ) 
		{
			valueObject.setEndTm(new ims.framework.utils.Time(EndTm) );
		}
		// ParentChildSlots
		valueObject.setParentChildSlots(ims.scheduling.vo.domain.SessionParentChildSlotDurationVoAssembler.createSessionParentChildSlotDurationVoCollectionFromSessionParentChildSlot(map, domainObject.getParentChildSlots()) );
		// TheatreType
		ims.domain.lookups.LookupInstance instance9 = domainObject.getTheatreType();
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

			ims.scheduling.vo.lookups.TheatreType voLookup9 = new ims.scheduling.vo.lookups.TheatreType(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.scheduling.vo.lookups.TheatreType parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.scheduling.vo.lookups.TheatreType(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setTheatreType(voLookup9);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.Sch_Session extractSch_Session(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionEmergencyTheatreVo valueObject) 
	{
		return 	extractSch_Session(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.Sch_Session extractSch_Session(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionEmergencyTheatreVo valueObject, HashMap domMap) 
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
			// ims.scheduling.vo.SessionEmergencyTheatreVo ID_Sch_Session field is unknown
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

		java.util.Date value1 = null;
		ims.framework.utils.Date date1 = valueObject.getSessionDate();		
		if ( date1 != null ) 
		{
			value1 = date1.getDate();
		}
		domainObject.setSessionDate(value1);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value2 = null;
		if ( null != valueObject.getSchLocation() ) 
		{
			if (valueObject.getSchLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getSchLocation()) != null)
				{
					value2 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getSchLocation());
				}
			}
			else
			{
				value2 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getSchLocation().getBoId());
			}
		}
		domainObject.setSchLocation(value2);

		// SaveAsRefVO treated as RefValueObject
		ims.scheduling.vo.Session_ListOwnerRefVoCollection refCollection3 = new ims.scheduling.vo.Session_ListOwnerRefVoCollection();
		if (valueObject.getListOwners() != null)
		{
			for (int i3=0; i3<valueObject.getListOwners().size(); i3++)
			{
				ims.scheduling.vo.Session_ListOwnerRefVo ref3 = (ims.scheduling.vo.Session_ListOwnerRefVo)valueObject.getListOwners().get(i3);
				refCollection3.add(ref3);
			}
		}
		int size3 = (null == refCollection3) ? 0 : refCollection3.size();		
		java.util.Set domainListOwners3 = domainObject.getListOwners();
		if (domainListOwners3 == null)
		{
			domainListOwners3 = new java.util.HashSet();
		}
		java.util.Set newSet3  = new java.util.HashSet();
		for(int i=0; i<size3; i++) 
		{
			ims.scheduling.vo.Session_ListOwnerRefVo vo = refCollection3.get(i);					
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
			if (!domainListOwners3.contains(dom))
			{
				domainListOwners3.add(dom);
			}
			newSet3.add(dom);			
		}
		java.util.Set removedSet3 = new java.util.HashSet();
		java.util.Iterator iter3 = domainListOwners3.iterator();
		//Find out which objects need to be removed
		while (iter3.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter3.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet3.contains(o))
			{
				removedSet3.add(o);
			}
		}
		iter3 = removedSet3.iterator();
		//Remove the unwanted objects
		while (iter3.hasNext())
		{
			domainListOwners3.remove(iter3.next());
		}		
		
		domainObject.setListOwners(domainListOwners3);		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.scheduling.domain.objects.SessionTheatreProceduresRemanining value4 = null;
		if ( null != valueObject.getTheatreProceduresRemaining() ) 
		{
			if (valueObject.getTheatreProceduresRemaining().getBoId() == null)
			{
				if (domMap.get(valueObject.getTheatreProceduresRemaining()) != null)
				{
					value4 = (ims.scheduling.domain.objects.SessionTheatreProceduresRemanining)domMap.get(valueObject.getTheatreProceduresRemaining());
				}
			}
			else
			{
				value4 = (ims.scheduling.domain.objects.SessionTheatreProceduresRemanining)domainFactory.getDomainObject(ims.scheduling.domain.objects.SessionTheatreProceduresRemanining.class, valueObject.getTheatreProceduresRemaining().getBoId());
			}
		}
		domainObject.setTheatreProceduresRemaining(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getListType() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getListType().getID());
		}
		domainObject.setListType(value5);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSessionComment() != null && valueObject.getSessionComment().equals(""))
		{
			valueObject.setSessionComment(null);
		}
		domainObject.setSessionComment(valueObject.getSessionComment());
		ims.framework.utils.Time time7 = valueObject.getEndTm();
		String value7 = null;
		if ( time7 != null ) 
		{
			value7 = time7.toString();
		}
		domainObject.setEndTm(value7);

		// SaveAsRefVO treated as RefValueObject
		ims.scheduling.vo.SessionParentChildSlotRefVoCollection refCollection8 = new ims.scheduling.vo.SessionParentChildSlotRefVoCollection();
		if (valueObject.getParentChildSlots() != null)
		{
			for (int i8=0; i8<valueObject.getParentChildSlots().size(); i8++)
			{
				ims.scheduling.vo.SessionParentChildSlotRefVo ref8 = (ims.scheduling.vo.SessionParentChildSlotRefVo)valueObject.getParentChildSlots().get(i8);
				refCollection8.add(ref8);
			}
		}
		int size8 = (null == refCollection8) ? 0 : refCollection8.size();		
		java.util.Set domainParentChildSlots8 = domainObject.getParentChildSlots();
		if (domainParentChildSlots8 == null)
		{
			domainParentChildSlots8 = new java.util.HashSet();
		}
		java.util.Set newSet8  = new java.util.HashSet();
		for(int i=0; i<size8; i++) 
		{
			ims.scheduling.vo.SessionParentChildSlotRefVo vo = refCollection8.get(i);					
			ims.scheduling.domain.objects.SessionParentChildSlot dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.scheduling.domain.objects.SessionParentChildSlot)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.scheduling.domain.objects.SessionParentChildSlot)domainFactory.getDomainObject( ims.scheduling.domain.objects.SessionParentChildSlot.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainParentChildSlots8.contains(dom))
			{
				domainParentChildSlots8.add(dom);
			}
			newSet8.add(dom);			
		}
		java.util.Set removedSet8 = new java.util.HashSet();
		java.util.Iterator iter8 = domainParentChildSlots8.iterator();
		//Find out which objects need to be removed
		while (iter8.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter8.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet8.contains(o))
			{
				removedSet8.add(o);
			}
		}
		iter8 = removedSet8.iterator();
		//Remove the unwanted objects
		while (iter8.hasNext())
		{
			domainParentChildSlots8.remove(iter8.next());
		}		
		
		domainObject.setParentChildSlots(domainParentChildSlots8);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getTheatreType() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getTheatreType().getID());
		}
		domainObject.setTheatreType(value9);

		return domainObject;
	}

}
