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
package ims.dtomove.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Sean Nesbitt
 */
public class SessionVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.dtomove.vo.SessionVo copy(ims.dtomove.vo.SessionVo valueObjectDest, ims.dtomove.vo.SessionVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Session(valueObjectSrc.getID_Session());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// profile_id
		valueObjectDest.setProfile_id(valueObjectSrc.getProfile_id());
		// group_id
		valueObjectDest.setGroup_id(valueObjectSrc.getGroup_id());
		// activityId
		valueObjectDest.setActivityId(valueObjectSrc.getActivityId());
		// session_date
		valueObjectDest.setSession_date(valueObjectSrc.getSession_date());
		// start_time
		valueObjectDest.setStart_time(valueObjectSrc.getStart_time());
		// end_time
		valueObjectDest.setEnd_time(valueObjectSrc.getEnd_time());
		// max_appts
		valueObjectDest.setMax_appts(valueObjectSrc.getMax_appts());
		// lastApptInterval
		valueObjectDest.setLastApptInterval(valueObjectSrc.getLastApptInterval());
		// remAppts
		valueObjectDest.setRemAppts(valueObjectSrc.getRemAppts());
		// internalLocId
		valueObjectDest.setInternalLocId(valueObjectSrc.getInternalLocId());
		// tci_rounding
		valueObjectDest.setTci_rounding(valueObjectSrc.getTci_rounding());
		// timeRem
		valueObjectDest.setTimeRem(valueObjectSrc.getTimeRem());
		// active
		valueObjectDest.setActive(valueObjectSrc.getActive());
		// state
		valueObjectDest.setState(valueObjectSrc.getState());
		// duration
		valueObjectDest.setDuration(valueObjectSrc.getDuration());
		// reason
		valueObjectDest.setReason(valueObjectSrc.getReason());
		// modIndicator
		valueObjectDest.setModIndicator(valueObjectSrc.getModIndicator());
		// minInterval
		valueObjectDest.setMinInterval(valueObjectSrc.getMinInterval());
		// description
		valueObjectDest.setDescription(valueObjectSrc.getDescription());
		// ad_hoc
		valueObjectDest.setAd_hoc(valueObjectSrc.getAd_hoc());
		// booking_rights
		valueObjectDest.setBooking_rights(valueObjectSrc.getBooking_rights());
		// exclTimes
		valueObjectDest.setExclTimes(valueObjectSrc.getExclTimes());
		// sessionDetail
		valueObjectDest.setSessionDetail(valueObjectSrc.getSessionDetail());
		// actions
		valueObjectDest.setActions(valueObjectSrc.getActions());
		// listOwner
		valueObjectDest.setListOwner(valueObjectSrc.getListOwner());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSessionVoCollectionFromSession(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.dto_move.domain.objects.Session objects.
	 */
	public static ims.dtomove.vo.SessionVoCollection createSessionVoCollectionFromSession(java.util.Set domainObjectSet)	
	{
		return createSessionVoCollectionFromSession(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.dto_move.domain.objects.Session objects.
	 */
	public static ims.dtomove.vo.SessionVoCollection createSessionVoCollectionFromSession(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.dtomove.vo.SessionVoCollection voList = new ims.dtomove.vo.SessionVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.dto_move.domain.objects.Session domainObject = (ims.dto_move.domain.objects.Session) iterator.next();
			ims.dtomove.vo.SessionVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.dto_move.domain.objects.Session objects.
	 */
	public static ims.dtomove.vo.SessionVoCollection createSessionVoCollectionFromSession(java.util.List domainObjectList) 
	{
		return createSessionVoCollectionFromSession(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.dto_move.domain.objects.Session objects.
	 */
	public static ims.dtomove.vo.SessionVoCollection createSessionVoCollectionFromSession(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.dtomove.vo.SessionVoCollection voList = new ims.dtomove.vo.SessionVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.dto_move.domain.objects.Session domainObject = (ims.dto_move.domain.objects.Session) domainObjectList.get(i);
			ims.dtomove.vo.SessionVo vo = create(map, domainObject);

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
	 * Create the ims.dto_move.domain.objects.Session set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractSessionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.SessionVoCollection voCollection) 
	 {
	 	return extractSessionSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSessionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.SessionVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.dtomove.vo.SessionVo vo = voCollection.get(i);
			ims.dto_move.domain.objects.Session domainObject = SessionVoAssembler.extractSession(domainFactory, vo, domMap);

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
	 * Create the ims.dto_move.domain.objects.Session list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractSessionList(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.SessionVoCollection voCollection) 
	 {
	 	return extractSessionList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSessionList(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.SessionVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.dtomove.vo.SessionVo vo = voCollection.get(i);
			ims.dto_move.domain.objects.Session domainObject = SessionVoAssembler.extractSession(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.dto_move.domain.objects.Session object.
	 * @param domainObject ims.dto_move.domain.objects.Session
	 */
	 public static ims.dtomove.vo.SessionVo create(ims.dto_move.domain.objects.Session domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.dto_move.domain.objects.Session object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.dtomove.vo.SessionVo create(DomainObjectMap map, ims.dto_move.domain.objects.Session domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.dtomove.vo.SessionVo valueObject = (ims.dtomove.vo.SessionVo) map.getValueObject(domainObject, ims.dtomove.vo.SessionVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.dtomove.vo.SessionVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.dto_move.domain.objects.Session
	 */
	 public static ims.dtomove.vo.SessionVo insert(ims.dtomove.vo.SessionVo valueObject, ims.dto_move.domain.objects.Session domainObject) 
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
	 * @param domainObject ims.dto_move.domain.objects.Session
	 */
	 public static ims.dtomove.vo.SessionVo insert(DomainObjectMap map, ims.dtomove.vo.SessionVo valueObject, ims.dto_move.domain.objects.Session domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Session(domainObject.getId());
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
			
		// profile_id
		valueObject.setProfile_id(domainObject.getProfile_id());
		// group_id
		valueObject.setGroup_id(domainObject.getGroup_id());
		// activityId
		valueObject.setActivityId(domainObject.getActivityId());
		// session_date
		java.util.Date session_date = domainObject.getSession_date();
		if ( null != session_date ) 
		{
			valueObject.setSession_date(new ims.framework.utils.Date(session_date) );
		}
		// start_time
		valueObject.setStart_time(domainObject.getStart_time());
		// end_time
		valueObject.setEnd_time(domainObject.getEnd_time());
		// max_appts
		valueObject.setMax_appts(domainObject.getMax_appts());
		// lastApptInterval
		valueObject.setLastApptInterval(domainObject.getLastApptInterval());
		// remAppts
		valueObject.setRemAppts(domainObject.getRemAppts());
		// internalLocId
		valueObject.setInternalLocId(domainObject.getInternalLocId());
		// tci_rounding
		valueObject.setTci_rounding(domainObject.getTci_rounding());
		// timeRem
		valueObject.setTimeRem(domainObject.getTimeRem());
		// active
		valueObject.setActive(domainObject.getActive());
		// state
		valueObject.setState(domainObject.getState());
		// duration
		valueObject.setDuration(domainObject.getDuration());
		// reason
		valueObject.setReason(domainObject.getReason());
		// modIndicator
		valueObject.setModIndicator(domainObject.getModIndicator());
		// minInterval
		valueObject.setMinInterval(domainObject.getMinInterval());
		// description
		valueObject.setDescription(domainObject.getDescription());
		// ad_hoc
		valueObject.setAd_hoc(domainObject.getAd_hoc());
		// booking_rights
		ims.dto_move.vo.SessionUserRefVoCollection booking_rights = new ims.dto_move.vo.SessionUserRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getBooking_rights().iterator(); iterator.hasNext(); ) 
		{
			ims.dto_move.domain.objects.SessionUser tmp = (ims.dto_move.domain.objects.SessionUser)iterator.next();
			if (tmp != null)
				booking_rights.add(new ims.dto_move.vo.SessionUserRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setBooking_rights(booking_rights);
		// exclTimes
		ims.dto_move.vo.SessionExclusionTimeRefVoCollection exclTimes = new ims.dto_move.vo.SessionExclusionTimeRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getExclTimes().iterator(); iterator.hasNext(); ) 
		{
			ims.dto_move.domain.objects.SessionExclusionTime tmp = (ims.dto_move.domain.objects.SessionExclusionTime)iterator.next();
			if (tmp != null)
				exclTimes.add(new ims.dto_move.vo.SessionExclusionTimeRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setExclTimes(exclTimes);
		// sessionDetail
		valueObject.setSessionDetail(ims.dtomove.vo.domain.SessionDetailVoAssembler.createSessionDetailVoCollectionFromSessionDetail(map, domainObject.getSessionDetail()) );
		// actions
		ims.dto_move.vo.SessionActionRefVoCollection actions = new ims.dto_move.vo.SessionActionRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getActions().iterator(); iterator.hasNext(); ) 
		{
			ims.dto_move.domain.objects.SessionAction tmp = (ims.dto_move.domain.objects.SessionAction)iterator.next();
			if (tmp != null)
				actions.add(new ims.dto_move.vo.SessionActionRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setActions(actions);
		// listOwner
		ims.dto_move.vo.SessionListOwnerRefVoCollection listOwner = new ims.dto_move.vo.SessionListOwnerRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getListOwner().iterator(); iterator.hasNext(); ) 
		{
			ims.dto_move.domain.objects.SessionListOwner tmp = (ims.dto_move.domain.objects.SessionListOwner)iterator.next();
			if (tmp != null)
				listOwner.add(new ims.dto_move.vo.SessionListOwnerRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setListOwner(listOwner);
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.dto_move.domain.objects.Session extractSession(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.SessionVo valueObject) 
	{
		return 	extractSession(domainFactory, valueObject, new HashMap());
	}

	public static ims.dto_move.domain.objects.Session extractSession(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.SessionVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Session();
		ims.dto_move.domain.objects.Session domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.dto_move.domain.objects.Session)domMap.get(valueObject);
			}
			// ims.dtomove.vo.SessionVo ID_Session field is unknown
			domainObject = new ims.dto_move.domain.objects.Session();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Session());
			if (domMap.get(key) != null)
			{
				return (ims.dto_move.domain.objects.Session)domMap.get(key);
			}
			domainObject = (ims.dto_move.domain.objects.Session) domainFactory.getDomainObject(ims.dto_move.domain.objects.Session.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Session());

		domainObject.setProfile_id(valueObject.getProfile_id());
		domainObject.setGroup_id(valueObject.getGroup_id());
		domainObject.setActivityId(valueObject.getActivityId());
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getSession_date();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setSession_date(value4);
		domainObject.setStart_time(valueObject.getStart_time());
		domainObject.setEnd_time(valueObject.getEnd_time());
		domainObject.setMax_appts(valueObject.getMax_appts());
		domainObject.setLastApptInterval(valueObject.getLastApptInterval());
		domainObject.setRemAppts(valueObject.getRemAppts());
		domainObject.setInternalLocId(valueObject.getInternalLocId());
		domainObject.setTci_rounding(valueObject.getTci_rounding());
		domainObject.setTimeRem(valueObject.getTimeRem());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getActive() != null && valueObject.getActive().equals(""))
		{
			valueObject.setActive(null);
		}
		domainObject.setActive(valueObject.getActive());
		domainObject.setState(valueObject.getState());
		domainObject.setDuration(valueObject.getDuration());
		domainObject.setReason(valueObject.getReason());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getModIndicator() != null && valueObject.getModIndicator().equals(""))
		{
			valueObject.setModIndicator(null);
		}
		domainObject.setModIndicator(valueObject.getModIndicator());
		domainObject.setMinInterval(valueObject.getMinInterval());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDescription() != null && valueObject.getDescription().equals(""))
		{
			valueObject.setDescription(null);
		}
		domainObject.setDescription(valueObject.getDescription());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAd_hoc() != null && valueObject.getAd_hoc().equals(""))
		{
			valueObject.setAd_hoc(null);
		}
		domainObject.setAd_hoc(valueObject.getAd_hoc());

		ims.dto_move.vo.SessionUserRefVoCollection refCollection21 = valueObject.getBooking_rights();
		int size21 = (null == refCollection21) ? 0 : refCollection21.size();		
		java.util.List domainBooking_rights21 = domainObject.getBooking_rights();
		if (domainBooking_rights21 == null)
		{
			domainBooking_rights21 = new java.util.ArrayList();
		}
		for(int i=0; i < size21; i++) 
		{
			ims.dto_move.vo.SessionUserRefVo vo = refCollection21.get(i);			
			ims.dto_move.domain.objects.SessionUser dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.dto_move.domain.objects.SessionUser)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.dto_move.domain.objects.SessionUser)domainFactory.getDomainObject( ims.dto_move.domain.objects.SessionUser.class, vo.getBoId());
				}
			}

			int domIdx = domainBooking_rights21.indexOf(dom);
			if (domIdx == -1)
			{
				domainBooking_rights21.add(i, dom);
			}
			else if (i != domIdx && i < domainBooking_rights21.size())
			{
				Object tmp = domainBooking_rights21.get(i);
				domainBooking_rights21.set(i, domainBooking_rights21.get(domIdx));
				domainBooking_rights21.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i21 = domainBooking_rights21.size();
		while (i21 > size21)
		{
			domainBooking_rights21.remove(i21-1);
			i21 = domainBooking_rights21.size();
		}
		
		domainObject.setBooking_rights(domainBooking_rights21);		

		ims.dto_move.vo.SessionExclusionTimeRefVoCollection refCollection22 = valueObject.getExclTimes();
		int size22 = (null == refCollection22) ? 0 : refCollection22.size();		
		java.util.List domainExclTimes22 = domainObject.getExclTimes();
		if (domainExclTimes22 == null)
		{
			domainExclTimes22 = new java.util.ArrayList();
		}
		for(int i=0; i < size22; i++) 
		{
			ims.dto_move.vo.SessionExclusionTimeRefVo vo = refCollection22.get(i);			
			ims.dto_move.domain.objects.SessionExclusionTime dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.dto_move.domain.objects.SessionExclusionTime)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.dto_move.domain.objects.SessionExclusionTime)domainFactory.getDomainObject( ims.dto_move.domain.objects.SessionExclusionTime.class, vo.getBoId());
				}
			}

			int domIdx = domainExclTimes22.indexOf(dom);
			if (domIdx == -1)
			{
				domainExclTimes22.add(i, dom);
			}
			else if (i != domIdx && i < domainExclTimes22.size())
			{
				Object tmp = domainExclTimes22.get(i);
				domainExclTimes22.set(i, domainExclTimes22.get(domIdx));
				domainExclTimes22.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i22 = domainExclTimes22.size();
		while (i22 > size22)
		{
			domainExclTimes22.remove(i22-1);
			i22 = domainExclTimes22.size();
		}
		
		domainObject.setExclTimes(domainExclTimes22);		
		domainObject.setSessionDetail(ims.dtomove.vo.domain.SessionDetailVoAssembler.extractSessionDetailList(domainFactory, valueObject.getSessionDetail(), domainObject.getSessionDetail(), domMap));		

		ims.dto_move.vo.SessionActionRefVoCollection refCollection24 = valueObject.getActions();
		int size24 = (null == refCollection24) ? 0 : refCollection24.size();		
		java.util.List domainActions24 = domainObject.getActions();
		if (domainActions24 == null)
		{
			domainActions24 = new java.util.ArrayList();
		}
		for(int i=0; i < size24; i++) 
		{
			ims.dto_move.vo.SessionActionRefVo vo = refCollection24.get(i);			
			ims.dto_move.domain.objects.SessionAction dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.dto_move.domain.objects.SessionAction)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.dto_move.domain.objects.SessionAction)domainFactory.getDomainObject( ims.dto_move.domain.objects.SessionAction.class, vo.getBoId());
				}
			}

			int domIdx = domainActions24.indexOf(dom);
			if (domIdx == -1)
			{
				domainActions24.add(i, dom);
			}
			else if (i != domIdx && i < domainActions24.size())
			{
				Object tmp = domainActions24.get(i);
				domainActions24.set(i, domainActions24.get(domIdx));
				domainActions24.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i24 = domainActions24.size();
		while (i24 > size24)
		{
			domainActions24.remove(i24-1);
			i24 = domainActions24.size();
		}
		
		domainObject.setActions(domainActions24);		

		ims.dto_move.vo.SessionListOwnerRefVoCollection refCollection25 = valueObject.getListOwner();
		int size25 = (null == refCollection25) ? 0 : refCollection25.size();		
		java.util.List domainListOwner25 = domainObject.getListOwner();
		if (domainListOwner25 == null)
		{
			domainListOwner25 = new java.util.ArrayList();
		}
		for(int i=0; i < size25; i++) 
		{
			ims.dto_move.vo.SessionListOwnerRefVo vo = refCollection25.get(i);			
			ims.dto_move.domain.objects.SessionListOwner dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.dto_move.domain.objects.SessionListOwner)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.dto_move.domain.objects.SessionListOwner)domainFactory.getDomainObject( ims.dto_move.domain.objects.SessionListOwner.class, vo.getBoId());
				}
			}

			int domIdx = domainListOwner25.indexOf(dom);
			if (domIdx == -1)
			{
				domainListOwner25.add(i, dom);
			}
			else if (i != domIdx && i < domainListOwner25.size())
			{
				Object tmp = domainListOwner25.get(i);
				domainListOwner25.set(i, domainListOwner25.get(domIdx));
				domainListOwner25.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i25 = domainListOwner25.size();
		while (i25 > size25)
		{
			domainListOwner25.remove(i25-1);
			i25 = domainListOwner25.size();
		}
		
		domainObject.setListOwner(domainListOwner25);		

		return domainObject;
	}

}
