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
package ims.oncology.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Catalin Tomozei
 */
public class WaitingTimesAdjustmentsAndReasonsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.oncology.vo.WaitingTimesAdjustmentsAndReasonsVo copy(ims.oncology.vo.WaitingTimesAdjustmentsAndReasonsVo valueObjectDest, ims.oncology.vo.WaitingTimesAdjustmentsAndReasonsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_WaitingTimesAdjustmentsandReasons(valueObjectSrc.getID_WaitingTimesAdjustmentsandReasons());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// AdjReferralFirstSeen
		valueObjectDest.setAdjReferralFirstSeen(valueObjectSrc.getAdjReferralFirstSeen());
		// ReasReferralFirstSeen
		valueObjectDest.setReasReferralFirstSeen(valueObjectSrc.getReasReferralFirstSeen());
		// AdjFirstSeenDecTreat
		valueObjectDest.setAdjFirstSeenDecTreat(valueObjectSrc.getAdjFirstSeenDecTreat());
		// ReasFirstSeenDecTreat
		valueObjectDest.setReasFirstSeenDecTreat(valueObjectSrc.getReasFirstSeenDecTreat());
		// AdjDecTreatTreatment
		valueObjectDest.setAdjDecTreatTreatment(valueObjectSrc.getAdjDecTreatTreatment());
		// ReasDecTreatTreatment
		valueObjectDest.setReasDecTreatTreatment(valueObjectSrc.getReasDecTreatTreatment());
		// DelayReasReferralTreat
		valueObjectDest.setDelayReasReferralTreat(valueObjectSrc.getDelayReasReferralTreat());
		// NotesReferralTreat
		valueObjectDest.setNotesReferralTreat(valueObjectSrc.getNotesReferralTreat());
		// DelayReasDecTreatTreat
		valueObjectDest.setDelayReasDecTreatTreat(valueObjectSrc.getDelayReasDecTreatTreat());
		// NotesDecTreatTreat
		valueObjectDest.setNotesDecTreatTreat(valueObjectSrc.getNotesDecTreatTreat());
		// EpisodeofCare
		valueObjectDest.setEpisodeofCare(valueObjectSrc.getEpisodeofCare());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createWaitingTimesAdjustmentsAndReasonsVoCollectionFromWaitingTimesAdjustmentsandReasons(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.WaitingTimesAdjustmentsandReasons objects.
	 */
	public static ims.oncology.vo.WaitingTimesAdjustmentsAndReasonsVoCollection createWaitingTimesAdjustmentsAndReasonsVoCollectionFromWaitingTimesAdjustmentsandReasons(java.util.Set domainObjectSet)	
	{
		return createWaitingTimesAdjustmentsAndReasonsVoCollectionFromWaitingTimesAdjustmentsandReasons(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.WaitingTimesAdjustmentsandReasons objects.
	 */
	public static ims.oncology.vo.WaitingTimesAdjustmentsAndReasonsVoCollection createWaitingTimesAdjustmentsAndReasonsVoCollectionFromWaitingTimesAdjustmentsandReasons(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.oncology.vo.WaitingTimesAdjustmentsAndReasonsVoCollection voList = new ims.oncology.vo.WaitingTimesAdjustmentsAndReasonsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.oncology.domain.objects.WaitingTimesAdjustmentsandReasons domainObject = (ims.oncology.domain.objects.WaitingTimesAdjustmentsandReasons) iterator.next();
			ims.oncology.vo.WaitingTimesAdjustmentsAndReasonsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.oncology.domain.objects.WaitingTimesAdjustmentsandReasons objects.
	 */
	public static ims.oncology.vo.WaitingTimesAdjustmentsAndReasonsVoCollection createWaitingTimesAdjustmentsAndReasonsVoCollectionFromWaitingTimesAdjustmentsandReasons(java.util.List domainObjectList) 
	{
		return createWaitingTimesAdjustmentsAndReasonsVoCollectionFromWaitingTimesAdjustmentsandReasons(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.domain.objects.WaitingTimesAdjustmentsandReasons objects.
	 */
	public static ims.oncology.vo.WaitingTimesAdjustmentsAndReasonsVoCollection createWaitingTimesAdjustmentsAndReasonsVoCollectionFromWaitingTimesAdjustmentsandReasons(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.oncology.vo.WaitingTimesAdjustmentsAndReasonsVoCollection voList = new ims.oncology.vo.WaitingTimesAdjustmentsAndReasonsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.domain.objects.WaitingTimesAdjustmentsandReasons domainObject = (ims.oncology.domain.objects.WaitingTimesAdjustmentsandReasons) domainObjectList.get(i);
			ims.oncology.vo.WaitingTimesAdjustmentsAndReasonsVo vo = create(map, domainObject);

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
	 * Create the ims.oncology.domain.objects.WaitingTimesAdjustmentsandReasons set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractWaitingTimesAdjustmentsandReasonsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.WaitingTimesAdjustmentsAndReasonsVoCollection voCollection) 
	 {
	 	return extractWaitingTimesAdjustmentsandReasonsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractWaitingTimesAdjustmentsandReasonsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.WaitingTimesAdjustmentsAndReasonsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.WaitingTimesAdjustmentsAndReasonsVo vo = voCollection.get(i);
			ims.oncology.domain.objects.WaitingTimesAdjustmentsandReasons domainObject = WaitingTimesAdjustmentsAndReasonsVoAssembler.extractWaitingTimesAdjustmentsandReasons(domainFactory, vo, domMap);

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
	 * Create the ims.oncology.domain.objects.WaitingTimesAdjustmentsandReasons list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractWaitingTimesAdjustmentsandReasonsList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.WaitingTimesAdjustmentsAndReasonsVoCollection voCollection) 
	 {
	 	return extractWaitingTimesAdjustmentsandReasonsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractWaitingTimesAdjustmentsandReasonsList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.WaitingTimesAdjustmentsAndReasonsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.WaitingTimesAdjustmentsAndReasonsVo vo = voCollection.get(i);
			ims.oncology.domain.objects.WaitingTimesAdjustmentsandReasons domainObject = WaitingTimesAdjustmentsAndReasonsVoAssembler.extractWaitingTimesAdjustmentsandReasons(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.oncology.domain.objects.WaitingTimesAdjustmentsandReasons object.
	 * @param domainObject ims.oncology.domain.objects.WaitingTimesAdjustmentsandReasons
	 */
	 public static ims.oncology.vo.WaitingTimesAdjustmentsAndReasonsVo create(ims.oncology.domain.objects.WaitingTimesAdjustmentsandReasons domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.oncology.domain.objects.WaitingTimesAdjustmentsandReasons object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.oncology.vo.WaitingTimesAdjustmentsAndReasonsVo create(DomainObjectMap map, ims.oncology.domain.objects.WaitingTimesAdjustmentsandReasons domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.oncology.vo.WaitingTimesAdjustmentsAndReasonsVo valueObject = (ims.oncology.vo.WaitingTimesAdjustmentsAndReasonsVo) map.getValueObject(domainObject, ims.oncology.vo.WaitingTimesAdjustmentsAndReasonsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.oncology.vo.WaitingTimesAdjustmentsAndReasonsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.oncology.domain.objects.WaitingTimesAdjustmentsandReasons
	 */
	 public static ims.oncology.vo.WaitingTimesAdjustmentsAndReasonsVo insert(ims.oncology.vo.WaitingTimesAdjustmentsAndReasonsVo valueObject, ims.oncology.domain.objects.WaitingTimesAdjustmentsandReasons domainObject) 
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
	 * @param domainObject ims.oncology.domain.objects.WaitingTimesAdjustmentsandReasons
	 */
	 public static ims.oncology.vo.WaitingTimesAdjustmentsAndReasonsVo insert(DomainObjectMap map, ims.oncology.vo.WaitingTimesAdjustmentsAndReasonsVo valueObject, ims.oncology.domain.objects.WaitingTimesAdjustmentsandReasons domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_WaitingTimesAdjustmentsandReasons(domainObject.getId());
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
		// AdjReferralFirstSeen
		valueObject.setAdjReferralFirstSeen(domainObject.getAdjReferralFirstSeen());
		// ReasReferralFirstSeen
		ims.domain.lookups.LookupInstance instance3 = domainObject.getReasReferralFirstSeen();
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

			ims.oncology.vo.lookups.DateReferralDateFirstSeenReason voLookup3 = new ims.oncology.vo.lookups.DateReferralDateFirstSeenReason(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.oncology.vo.lookups.DateReferralDateFirstSeenReason parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.oncology.vo.lookups.DateReferralDateFirstSeenReason(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setReasReferralFirstSeen(voLookup3);
		}
				// AdjFirstSeenDecTreat
		valueObject.setAdjFirstSeenDecTreat(domainObject.getAdjFirstSeenDecTreat());
		// ReasFirstSeenDecTreat
		ims.domain.lookups.LookupInstance instance5 = domainObject.getReasFirstSeenDecTreat();
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

			ims.oncology.vo.lookups.DateFirstSeenDateDecTreatReas voLookup5 = new ims.oncology.vo.lookups.DateFirstSeenDateDecTreatReas(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.oncology.vo.lookups.DateFirstSeenDateDecTreatReas parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.oncology.vo.lookups.DateFirstSeenDateDecTreatReas(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setReasFirstSeenDecTreat(voLookup5);
		}
				// AdjDecTreatTreatment
		valueObject.setAdjDecTreatTreatment(domainObject.getAdjDecTreatTreatment());
		// ReasDecTreatTreatment
		ims.domain.lookups.LookupInstance instance7 = domainObject.getReasDecTreatTreatment();
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

			ims.oncology.vo.lookups.ReasDateDecTreatTreatment voLookup7 = new ims.oncology.vo.lookups.ReasDateDecTreatTreatment(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.oncology.vo.lookups.ReasDateDecTreatTreatment parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.oncology.vo.lookups.ReasDateDecTreatTreatment(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setReasDecTreatTreatment(voLookup7);
		}
				// DelayReasReferralTreat
		ims.domain.lookups.LookupInstance instance8 = domainObject.getDelayReasReferralTreat();
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

			ims.oncology.vo.lookups.DelayReasReferralTreat voLookup8 = new ims.oncology.vo.lookups.DelayReasReferralTreat(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.oncology.vo.lookups.DelayReasReferralTreat parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.oncology.vo.lookups.DelayReasReferralTreat(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setDelayReasReferralTreat(voLookup8);
		}
				// NotesReferralTreat
		valueObject.setNotesReferralTreat(domainObject.getNotesReferralTreat());
		// DelayReasDecTreatTreat
		ims.domain.lookups.LookupInstance instance10 = domainObject.getDelayReasDecTreatTreat();
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

			ims.oncology.vo.lookups.DelayReasDecTreatTreat voLookup10 = new ims.oncology.vo.lookups.DelayReasDecTreatTreat(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.oncology.vo.lookups.DelayReasDecTreatTreat parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.oncology.vo.lookups.DelayReasDecTreatTreat(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setDelayReasDecTreatTreat(voLookup10);
		}
				// NotesDecTreatTreat
		valueObject.setNotesDecTreatTreat(domainObject.getNotesDecTreatTreat());
		// EpisodeofCare
		if (domainObject.getEpisodeofCare() != null)
		{
			if(domainObject.getEpisodeofCare() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getEpisodeofCare();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setEpisodeofCare(new ims.core.admin.vo.EpisodeOfCareRefVo(id, -1));				
			}
			else
			{
				valueObject.setEpisodeofCare(new ims.core.admin.vo.EpisodeOfCareRefVo(domainObject.getEpisodeofCare().getId(), domainObject.getEpisodeofCare().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.domain.objects.WaitingTimesAdjustmentsandReasons extractWaitingTimesAdjustmentsandReasons(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.WaitingTimesAdjustmentsAndReasonsVo valueObject) 
	{
		return 	extractWaitingTimesAdjustmentsandReasons(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.domain.objects.WaitingTimesAdjustmentsandReasons extractWaitingTimesAdjustmentsandReasons(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.WaitingTimesAdjustmentsAndReasonsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_WaitingTimesAdjustmentsandReasons();
		ims.oncology.domain.objects.WaitingTimesAdjustmentsandReasons domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.oncology.domain.objects.WaitingTimesAdjustmentsandReasons)domMap.get(valueObject);
			}
			// ims.oncology.vo.WaitingTimesAdjustmentsAndReasonsVo ID_WaitingTimesAdjustmentsandReasons field is unknown
			domainObject = new ims.oncology.domain.objects.WaitingTimesAdjustmentsandReasons();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_WaitingTimesAdjustmentsandReasons());
			if (domMap.get(key) != null)
			{
				return (ims.oncology.domain.objects.WaitingTimesAdjustmentsandReasons)domMap.get(key);
			}
			domainObject = (ims.oncology.domain.objects.WaitingTimesAdjustmentsandReasons) domainFactory.getDomainObject(ims.oncology.domain.objects.WaitingTimesAdjustmentsandReasons.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_WaitingTimesAdjustmentsandReasons());

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
		domainObject.setAdjReferralFirstSeen(valueObject.getAdjReferralFirstSeen());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getReasReferralFirstSeen() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getReasReferralFirstSeen().getID());
		}
		domainObject.setReasReferralFirstSeen(value3);
		domainObject.setAdjFirstSeenDecTreat(valueObject.getAdjFirstSeenDecTreat());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getReasFirstSeenDecTreat() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getReasFirstSeenDecTreat().getID());
		}
		domainObject.setReasFirstSeenDecTreat(value5);
		domainObject.setAdjDecTreatTreatment(valueObject.getAdjDecTreatTreatment());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getReasDecTreatTreatment() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getReasDecTreatTreatment().getID());
		}
		domainObject.setReasDecTreatTreatment(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getDelayReasReferralTreat() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getDelayReasReferralTreat().getID());
		}
		domainObject.setDelayReasReferralTreat(value8);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNotesReferralTreat() != null && valueObject.getNotesReferralTreat().equals(""))
		{
			valueObject.setNotesReferralTreat(null);
		}
		domainObject.setNotesReferralTreat(valueObject.getNotesReferralTreat());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getDelayReasDecTreatTreat() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getDelayReasDecTreatTreat().getID());
		}
		domainObject.setDelayReasDecTreatTreat(value10);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNotesDecTreatTreat() != null && valueObject.getNotesDecTreatTreat().equals(""))
		{
			valueObject.setNotesDecTreatTreat(null);
		}
		domainObject.setNotesDecTreatTreat(valueObject.getNotesDecTreatTreat());
		ims.core.admin.domain.objects.EpisodeOfCare value12 = null;
		if ( null != valueObject.getEpisodeofCare() ) 
		{
			if (valueObject.getEpisodeofCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisodeofCare()) != null)
				{
					value12 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisodeofCare());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value12 = domainObject.getEpisodeofCare();	
			}
			else
			{
				value12 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisodeofCare().getBoId());
			}
		}
		domainObject.setEpisodeofCare(value12);

		return domainObject;
	}

}
