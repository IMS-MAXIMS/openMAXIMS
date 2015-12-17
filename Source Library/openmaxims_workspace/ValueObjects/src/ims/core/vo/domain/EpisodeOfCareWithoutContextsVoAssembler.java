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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cornel Ventuneac
 */
public class EpisodeOfCareWithoutContextsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.EpisodeOfCareWithoutContextsVo copy(ims.core.vo.EpisodeOfCareWithoutContextsVo valueObjectDest, ims.core.vo.EpisodeOfCareWithoutContextsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_EpisodeOfCare(valueObjectSrc.getID_EpisodeOfCare());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// LinkedReferrals
		valueObjectDest.setLinkedReferrals(valueObjectSrc.getLinkedReferrals());
		// LinkedReferralsHistory
		valueObjectDest.setLinkedReferralsHistory(valueObjectSrc.getLinkedReferralsHistory());
		// CurrentReferral
		valueObjectDest.setCurrentReferral(valueObjectSrc.getCurrentReferral());
		// EpisodeOfCareHistory
		valueObjectDest.setEpisodeOfCareHistory(valueObjectSrc.getEpisodeOfCareHistory());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// StatusHistory
		valueObjectDest.setStatusHistory(valueObjectSrc.getStatusHistory());
		// Relationship
		valueObjectDest.setRelationship(valueObjectSrc.getRelationship());
		// StartDate
		valueObjectDest.setStartDate(valueObjectSrc.getStartDate());
		// EndDate
		valueObjectDest.setEndDate(valueObjectSrc.getEndDate());
		// CareSpell
		valueObjectDest.setCareSpell(valueObjectSrc.getCareSpell());
		// ResponsibleHCP
		valueObjectDest.setResponsibleHCP(valueObjectSrc.getResponsibleHCP());
		// Specialty
		valueObjectDest.setSpecialty(valueObjectSrc.getSpecialty());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createEpisodeOfCareWithoutContextsVoCollectionFromEpisodeOfCare(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.EpisodeOfCare objects.
	 */
	public static ims.core.vo.EpisodeOfCareWithoutContextsVoCollection createEpisodeOfCareWithoutContextsVoCollectionFromEpisodeOfCare(java.util.Set domainObjectSet)	
	{
		return createEpisodeOfCareWithoutContextsVoCollectionFromEpisodeOfCare(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.EpisodeOfCare objects.
	 */
	public static ims.core.vo.EpisodeOfCareWithoutContextsVoCollection createEpisodeOfCareWithoutContextsVoCollectionFromEpisodeOfCare(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.EpisodeOfCareWithoutContextsVoCollection voList = new ims.core.vo.EpisodeOfCareWithoutContextsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.domain.objects.EpisodeOfCare domainObject = (ims.core.admin.domain.objects.EpisodeOfCare) iterator.next();
			ims.core.vo.EpisodeOfCareWithoutContextsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.domain.objects.EpisodeOfCare objects.
	 */
	public static ims.core.vo.EpisodeOfCareWithoutContextsVoCollection createEpisodeOfCareWithoutContextsVoCollectionFromEpisodeOfCare(java.util.List domainObjectList) 
	{
		return createEpisodeOfCareWithoutContextsVoCollectionFromEpisodeOfCare(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.EpisodeOfCare objects.
	 */
	public static ims.core.vo.EpisodeOfCareWithoutContextsVoCollection createEpisodeOfCareWithoutContextsVoCollectionFromEpisodeOfCare(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.EpisodeOfCareWithoutContextsVoCollection voList = new ims.core.vo.EpisodeOfCareWithoutContextsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.EpisodeOfCare domainObject = (ims.core.admin.domain.objects.EpisodeOfCare) domainObjectList.get(i);
			ims.core.vo.EpisodeOfCareWithoutContextsVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.domain.objects.EpisodeOfCare set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractEpisodeOfCareSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.EpisodeOfCareWithoutContextsVoCollection voCollection) 
	 {
	 	return extractEpisodeOfCareSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractEpisodeOfCareSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.EpisodeOfCareWithoutContextsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.EpisodeOfCareWithoutContextsVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.EpisodeOfCare domainObject = EpisodeOfCareWithoutContextsVoAssembler.extractEpisodeOfCare(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.domain.objects.EpisodeOfCare list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractEpisodeOfCareList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.EpisodeOfCareWithoutContextsVoCollection voCollection) 
	 {
	 	return extractEpisodeOfCareList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractEpisodeOfCareList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.EpisodeOfCareWithoutContextsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.EpisodeOfCareWithoutContextsVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.EpisodeOfCare domainObject = EpisodeOfCareWithoutContextsVoAssembler.extractEpisodeOfCare(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.domain.objects.EpisodeOfCare object.
	 * @param domainObject ims.core.admin.domain.objects.EpisodeOfCare
	 */
	 public static ims.core.vo.EpisodeOfCareWithoutContextsVo create(ims.core.admin.domain.objects.EpisodeOfCare domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.domain.objects.EpisodeOfCare object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.EpisodeOfCareWithoutContextsVo create(DomainObjectMap map, ims.core.admin.domain.objects.EpisodeOfCare domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.EpisodeOfCareWithoutContextsVo valueObject = (ims.core.vo.EpisodeOfCareWithoutContextsVo) map.getValueObject(domainObject, ims.core.vo.EpisodeOfCareWithoutContextsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.EpisodeOfCareWithoutContextsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.domain.objects.EpisodeOfCare
	 */
	 public static ims.core.vo.EpisodeOfCareWithoutContextsVo insert(ims.core.vo.EpisodeOfCareWithoutContextsVo valueObject, ims.core.admin.domain.objects.EpisodeOfCare domainObject) 
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
	 * @param domainObject ims.core.admin.domain.objects.EpisodeOfCare
	 */
	 public static ims.core.vo.EpisodeOfCareWithoutContextsVo insert(DomainObjectMap map, ims.core.vo.EpisodeOfCareWithoutContextsVo valueObject, ims.core.admin.domain.objects.EpisodeOfCare domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_EpisodeOfCare(domainObject.getId());
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
			
		// LinkedReferrals
		ims.core.admin.vo.ReferralRefVoCollection LinkedReferrals = new ims.core.admin.vo.ReferralRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getLinkedReferrals().iterator(); iterator.hasNext(); ) 
		{
			ims.core.admin.domain.objects.Referral tmp = (ims.core.admin.domain.objects.Referral)iterator.next();
			if (tmp != null)
				LinkedReferrals.add(new ims.core.admin.vo.ReferralRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setLinkedReferrals(LinkedReferrals);
		// LinkedReferralsHistory
		ims.core.admin.vo.ReferralRefVoCollection LinkedReferralsHistory = new ims.core.admin.vo.ReferralRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getLinkedReferralsHistory().iterator(); iterator.hasNext(); ) 
		{
			ims.core.admin.domain.objects.Referral tmp = (ims.core.admin.domain.objects.Referral)iterator.next();
			if (tmp != null)
				LinkedReferralsHistory.add(new ims.core.admin.vo.ReferralRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setLinkedReferralsHistory(LinkedReferralsHistory);
		// CurrentReferral
		if (domainObject.getCurrentReferral() != null)
		{
			if(domainObject.getCurrentReferral() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCurrentReferral();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCurrentReferral(new ims.core.admin.vo.ReferralRefVo(id, -1));				
			}
			else
			{
				valueObject.setCurrentReferral(new ims.core.admin.vo.ReferralRefVo(domainObject.getCurrentReferral().getId(), domainObject.getCurrentReferral().getVersion()));
			}
		}
		// EpisodeOfCareHistory
		valueObject.setEpisodeOfCareHistory(ims.core.vo.domain.EpisodeOfCareHistoryVoAssembler.createEpisodeOfCareHistoryVoCollectionFromEpisodeOfCareHistory(map, domainObject.getEpisodeOfCareHistory()) );
		// CurrentStatus
		valueObject.setCurrentStatus(ims.core.vo.domain.EpisodeOfCareStatusHistoryVoAssembler.create(map, domainObject.getCurrentStatus()) );
		// StatusHistory
		valueObject.setStatusHistory(ims.core.vo.domain.EpisodeOfCareStatusHistoryVoAssembler.createEpisodeOfCareStatusHistoryVoCollectionFromEpisodeOfCareStatusHistory(map, domainObject.getStatusHistory()) );
		// Relationship
		ims.domain.lookups.LookupInstance instance7 = domainObject.getRelationship();
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

			ims.core.vo.lookups.CareSpelltoEpisodeRelationship voLookup7 = new ims.core.vo.lookups.CareSpelltoEpisodeRelationship(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.CareSpelltoEpisodeRelationship parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.core.vo.lookups.CareSpelltoEpisodeRelationship(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setRelationship(voLookup7);
		}
				// StartDate
		java.util.Date StartDate = domainObject.getStartDate();
		if ( null != StartDate ) 
		{
			valueObject.setStartDate(new ims.framework.utils.Date(StartDate) );
		}
		// EndDate
		java.util.Date EndDate = domainObject.getEndDate();
		if ( null != EndDate ) 
		{
			valueObject.setEndDate(new ims.framework.utils.Date(EndDate) );
		}
		// CareSpell
		if (domainObject.getCareSpell() != null)
		{
			if(domainObject.getCareSpell() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCareSpell();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCareSpell(new ims.core.admin.vo.CareSpellRefVo(id, -1));				
			}
			else
			{
				valueObject.setCareSpell(new ims.core.admin.vo.CareSpellRefVo(domainObject.getCareSpell().getId(), domainObject.getCareSpell().getVersion()));
			}
		}
		// ResponsibleHCP
		valueObject.setResponsibleHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getResponsibleHCP()) );
		// Specialty
		ims.domain.lookups.LookupInstance instance12 = domainObject.getSpecialty();
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

			ims.core.vo.lookups.Specialty voLookup12 = new ims.core.vo.lookups.Specialty(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.core.vo.lookups.Specialty(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setSpecialty(voLookup12);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.EpisodeOfCare extractEpisodeOfCare(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.EpisodeOfCareWithoutContextsVo valueObject) 
	{
		return 	extractEpisodeOfCare(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.EpisodeOfCare extractEpisodeOfCare(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.EpisodeOfCareWithoutContextsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_EpisodeOfCare();
		ims.core.admin.domain.objects.EpisodeOfCare domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject);
			}
			// ims.core.vo.EpisodeOfCareWithoutContextsVo ID_EpisodeOfCare field is unknown
			domainObject = new ims.core.admin.domain.objects.EpisodeOfCare();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_EpisodeOfCare());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(key);
			}
			domainObject = (ims.core.admin.domain.objects.EpisodeOfCare) domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_EpisodeOfCare());


		ims.core.admin.vo.ReferralRefVoCollection refCollection1 = valueObject.getLinkedReferrals();
		int size1 = (null == refCollection1) ? 0 : refCollection1.size();		
		java.util.List domainLinkedReferrals1 = domainObject.getLinkedReferrals();
		if (domainLinkedReferrals1 == null)
		{
			domainLinkedReferrals1 = new java.util.ArrayList();
		}
		for(int i=0; i < size1; i++) 
		{
			ims.core.admin.vo.ReferralRefVo vo = refCollection1.get(i);			
			ims.core.admin.domain.objects.Referral dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.admin.domain.objects.Referral)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.admin.domain.objects.Referral)domainFactory.getDomainObject( ims.core.admin.domain.objects.Referral.class, vo.getBoId());
				}
			}

			int domIdx = domainLinkedReferrals1.indexOf(dom);
			if (domIdx == -1)
			{
				domainLinkedReferrals1.add(i, dom);
			}
			else if (i != domIdx && i < domainLinkedReferrals1.size())
			{
				Object tmp = domainLinkedReferrals1.get(i);
				domainLinkedReferrals1.set(i, domainLinkedReferrals1.get(domIdx));
				domainLinkedReferrals1.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1 = domainLinkedReferrals1.size();
		while (i1 > size1)
		{
			domainLinkedReferrals1.remove(i1-1);
			i1 = domainLinkedReferrals1.size();
		}
		
		domainObject.setLinkedReferrals(domainLinkedReferrals1);		

		ims.core.admin.vo.ReferralRefVoCollection refCollection2 = valueObject.getLinkedReferralsHistory();
		int size2 = (null == refCollection2) ? 0 : refCollection2.size();		
		java.util.List domainLinkedReferralsHistory2 = domainObject.getLinkedReferralsHistory();
		if (domainLinkedReferralsHistory2 == null)
		{
			domainLinkedReferralsHistory2 = new java.util.ArrayList();
		}
		for(int i=0; i < size2; i++) 
		{
			ims.core.admin.vo.ReferralRefVo vo = refCollection2.get(i);			
			ims.core.admin.domain.objects.Referral dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.admin.domain.objects.Referral)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.admin.domain.objects.Referral)domainFactory.getDomainObject( ims.core.admin.domain.objects.Referral.class, vo.getBoId());
				}
			}

			int domIdx = domainLinkedReferralsHistory2.indexOf(dom);
			if (domIdx == -1)
			{
				domainLinkedReferralsHistory2.add(i, dom);
			}
			else if (i != domIdx && i < domainLinkedReferralsHistory2.size())
			{
				Object tmp = domainLinkedReferralsHistory2.get(i);
				domainLinkedReferralsHistory2.set(i, domainLinkedReferralsHistory2.get(domIdx));
				domainLinkedReferralsHistory2.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i2 = domainLinkedReferralsHistory2.size();
		while (i2 > size2)
		{
			domainLinkedReferralsHistory2.remove(i2-1);
			i2 = domainLinkedReferralsHistory2.size();
		}
		
		domainObject.setLinkedReferralsHistory(domainLinkedReferralsHistory2);		
		ims.core.admin.domain.objects.Referral value3 = null;
		if ( null != valueObject.getCurrentReferral() ) 
		{
			if (valueObject.getCurrentReferral().getBoId() == null)
			{
				if (domMap.get(valueObject.getCurrentReferral()) != null)
				{
					value3 = (ims.core.admin.domain.objects.Referral)domMap.get(valueObject.getCurrentReferral());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getCurrentReferral();	
			}
			else
			{
				value3 = (ims.core.admin.domain.objects.Referral)domainFactory.getDomainObject(ims.core.admin.domain.objects.Referral.class, valueObject.getCurrentReferral().getBoId());
			}
		}
		domainObject.setCurrentReferral(value3);
		domainObject.setEpisodeOfCareHistory(ims.core.vo.domain.EpisodeOfCareHistoryVoAssembler.extractEpisodeOfCareHistorySet(domainFactory, valueObject.getEpisodeOfCareHistory(), domainObject.getEpisodeOfCareHistory(), domMap));		
		domainObject.setCurrentStatus(ims.core.vo.domain.EpisodeOfCareStatusHistoryVoAssembler.extractEpisodeOfCareStatusHistory(domainFactory, valueObject.getCurrentStatus(), domMap));
		domainObject.setStatusHistory(ims.core.vo.domain.EpisodeOfCareStatusHistoryVoAssembler.extractEpisodeOfCareStatusHistoryList(domainFactory, valueObject.getStatusHistory(), domainObject.getStatusHistory(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getRelationship() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getRelationship().getID());
		}
		domainObject.setRelationship(value7);
		java.util.Date value8 = null;
		ims.framework.utils.Date date8 = valueObject.getStartDate();		
		if ( date8 != null ) 
		{
			value8 = date8.getDate();
		}
		domainObject.setStartDate(value8);
		java.util.Date value9 = null;
		ims.framework.utils.Date date9 = valueObject.getEndDate();		
		if ( date9 != null ) 
		{
			value9 = date9.getDate();
		}
		domainObject.setEndDate(value9);
		ims.core.admin.domain.objects.CareSpell value10 = null;
		if ( null != valueObject.getCareSpell() ) 
		{
			if (valueObject.getCareSpell().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareSpell()) != null)
				{
					value10 = (ims.core.admin.domain.objects.CareSpell)domMap.get(valueObject.getCareSpell());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value10 = domainObject.getCareSpell();	
			}
			else
			{
				value10 = (ims.core.admin.domain.objects.CareSpell)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareSpell.class, valueObject.getCareSpell().getBoId());
			}
		}
		domainObject.setCareSpell(value10);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value11 = null;
		if ( null != valueObject.getResponsibleHCP() ) 
		{
			if (valueObject.getResponsibleHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getResponsibleHCP()) != null)
				{
					value11 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getResponsibleHCP());
				}
			}
			else
			{
				value11 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getResponsibleHCP().getBoId());
			}
		}
		domainObject.setResponsibleHCP(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value12);

		return domainObject;
	}

}
