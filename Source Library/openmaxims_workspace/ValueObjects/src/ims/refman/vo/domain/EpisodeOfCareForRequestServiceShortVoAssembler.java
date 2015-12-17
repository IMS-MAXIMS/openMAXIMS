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
public class EpisodeOfCareForRequestServiceShortVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.EpisodeOfCareForRequestServiceShortVo copy(ims.RefMan.vo.EpisodeOfCareForRequestServiceShortVo valueObjectDest, ims.RefMan.vo.EpisodeOfCareForRequestServiceShortVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_EpisodeOfCare(valueObjectSrc.getID_EpisodeOfCare());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CareContexts
		valueObjectDest.setCareContexts(valueObjectSrc.getCareContexts());
		// CareSpell
		valueObjectDest.setCareSpell(valueObjectSrc.getCareSpell());
		// Specialty
		valueObjectDest.setSpecialty(valueObjectSrc.getSpecialty());
		// StartDate
		valueObjectDest.setStartDate(valueObjectSrc.getStartDate());
		// Relationship
		valueObjectDest.setRelationship(valueObjectSrc.getRelationship());
		// ResponsibleHCP
		valueObjectDest.setResponsibleHCP(valueObjectSrc.getResponsibleHCP());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// StatusHistory
		valueObjectDest.setStatusHistory(valueObjectSrc.getStatusHistory());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createEpisodeOfCareForRequestServiceShortVoCollectionFromEpisodeOfCare(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.EpisodeOfCare objects.
	 */
	public static ims.RefMan.vo.EpisodeOfCareForRequestServiceShortVoCollection createEpisodeOfCareForRequestServiceShortVoCollectionFromEpisodeOfCare(java.util.Set domainObjectSet)	
	{
		return createEpisodeOfCareForRequestServiceShortVoCollectionFromEpisodeOfCare(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.EpisodeOfCare objects.
	 */
	public static ims.RefMan.vo.EpisodeOfCareForRequestServiceShortVoCollection createEpisodeOfCareForRequestServiceShortVoCollectionFromEpisodeOfCare(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.EpisodeOfCareForRequestServiceShortVoCollection voList = new ims.RefMan.vo.EpisodeOfCareForRequestServiceShortVoCollection();
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
			ims.RefMan.vo.EpisodeOfCareForRequestServiceShortVo vo = create(map, domainObject);
			
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
	public static ims.RefMan.vo.EpisodeOfCareForRequestServiceShortVoCollection createEpisodeOfCareForRequestServiceShortVoCollectionFromEpisodeOfCare(java.util.List domainObjectList) 
	{
		return createEpisodeOfCareForRequestServiceShortVoCollectionFromEpisodeOfCare(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.EpisodeOfCare objects.
	 */
	public static ims.RefMan.vo.EpisodeOfCareForRequestServiceShortVoCollection createEpisodeOfCareForRequestServiceShortVoCollectionFromEpisodeOfCare(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.EpisodeOfCareForRequestServiceShortVoCollection voList = new ims.RefMan.vo.EpisodeOfCareForRequestServiceShortVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.EpisodeOfCare domainObject = (ims.core.admin.domain.objects.EpisodeOfCare) domainObjectList.get(i);
			ims.RefMan.vo.EpisodeOfCareForRequestServiceShortVo vo = create(map, domainObject);

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
	 public static java.util.Set extractEpisodeOfCareSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.EpisodeOfCareForRequestServiceShortVoCollection voCollection) 
	 {
	 	return extractEpisodeOfCareSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractEpisodeOfCareSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.EpisodeOfCareForRequestServiceShortVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.EpisodeOfCareForRequestServiceShortVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.EpisodeOfCare domainObject = EpisodeOfCareForRequestServiceShortVoAssembler.extractEpisodeOfCare(domainFactory, vo, domMap);

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
	 public static java.util.List extractEpisodeOfCareList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.EpisodeOfCareForRequestServiceShortVoCollection voCollection) 
	 {
	 	return extractEpisodeOfCareList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractEpisodeOfCareList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.EpisodeOfCareForRequestServiceShortVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.EpisodeOfCareForRequestServiceShortVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.EpisodeOfCare domainObject = EpisodeOfCareForRequestServiceShortVoAssembler.extractEpisodeOfCare(domainFactory, vo, domMap);

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
	 public static ims.RefMan.vo.EpisodeOfCareForRequestServiceShortVo create(ims.core.admin.domain.objects.EpisodeOfCare domainObject) 
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
	  public static ims.RefMan.vo.EpisodeOfCareForRequestServiceShortVo create(DomainObjectMap map, ims.core.admin.domain.objects.EpisodeOfCare domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.EpisodeOfCareForRequestServiceShortVo valueObject = (ims.RefMan.vo.EpisodeOfCareForRequestServiceShortVo) map.getValueObject(domainObject, ims.RefMan.vo.EpisodeOfCareForRequestServiceShortVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.EpisodeOfCareForRequestServiceShortVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.RefMan.vo.EpisodeOfCareForRequestServiceShortVo insert(ims.RefMan.vo.EpisodeOfCareForRequestServiceShortVo valueObject, ims.core.admin.domain.objects.EpisodeOfCare domainObject) 
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
	 public static ims.RefMan.vo.EpisodeOfCareForRequestServiceShortVo insert(DomainObjectMap map, ims.RefMan.vo.EpisodeOfCareForRequestServiceShortVo valueObject, ims.core.admin.domain.objects.EpisodeOfCare domainObject) 
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
			
		// CareContexts
		valueObject.setCareContexts(ims.RefMan.vo.domain.CareContextForRequestServiceShortVoAssembler.createCareContextForRequestServiceShortVoCollectionFromCareContext(map, domainObject.getCareContexts()) );
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
		// Specialty
		ims.domain.lookups.LookupInstance instance3 = domainObject.getSpecialty();
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

			ims.core.vo.lookups.Specialty voLookup3 = new ims.core.vo.lookups.Specialty(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.Specialty(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setSpecialty(voLookup3);
		}
				// StartDate
		java.util.Date StartDate = domainObject.getStartDate();
		if ( null != StartDate ) 
		{
			valueObject.setStartDate(new ims.framework.utils.Date(StartDate) );
		}
		// Relationship
		ims.domain.lookups.LookupInstance instance5 = domainObject.getRelationship();
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

			ims.core.vo.lookups.CareSpelltoEpisodeRelationship voLookup5 = new ims.core.vo.lookups.CareSpelltoEpisodeRelationship(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.CareSpelltoEpisodeRelationship parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.CareSpelltoEpisodeRelationship(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setRelationship(voLookup5);
		}
				// ResponsibleHCP
		if (domainObject.getResponsibleHCP() != null)
		{
			if(domainObject.getResponsibleHCP() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getResponsibleHCP();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setResponsibleHCP(new ims.core.resource.people.vo.HcpRefVo(id, -1));				
			}
			else
			{
				valueObject.setResponsibleHCP(new ims.core.resource.people.vo.HcpRefVo(domainObject.getResponsibleHCP().getId(), domainObject.getResponsibleHCP().getVersion()));
			}
		}
		// CurrentStatus
		if (domainObject.getCurrentStatus() != null)
		{
			if(domainObject.getCurrentStatus() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCurrentStatus();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCurrentStatus(new ims.core.admin.vo.EpisodeOfCareStatusHistoryRefVo(id, -1));				
			}
			else
			{
				valueObject.setCurrentStatus(new ims.core.admin.vo.EpisodeOfCareStatusHistoryRefVo(domainObject.getCurrentStatus().getId(), domainObject.getCurrentStatus().getVersion()));
			}
		}
		// StatusHistory
		ims.core.admin.vo.EpisodeOfCareStatusHistoryRefVoCollection StatusHistory = new ims.core.admin.vo.EpisodeOfCareStatusHistoryRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getStatusHistory().iterator(); iterator.hasNext(); ) 
		{
			ims.core.admin.domain.objects.EpisodeOfCareStatusHistory tmp = (ims.core.admin.domain.objects.EpisodeOfCareStatusHistory)iterator.next();
			if (tmp != null)
				StatusHistory.add(new ims.core.admin.vo.EpisodeOfCareStatusHistoryRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setStatusHistory(StatusHistory);
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.EpisodeOfCare extractEpisodeOfCare(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.EpisodeOfCareForRequestServiceShortVo valueObject) 
	{
		return 	extractEpisodeOfCare(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.EpisodeOfCare extractEpisodeOfCare(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.EpisodeOfCareForRequestServiceShortVo valueObject, HashMap domMap) 
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
			// ims.RefMan.vo.EpisodeOfCareForRequestServiceShortVo ID_EpisodeOfCare field is unknown
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

		domainObject.setCareContexts(ims.RefMan.vo.domain.CareContextForRequestServiceShortVoAssembler.extractCareContextSet(domainFactory, valueObject.getCareContexts(), domainObject.getCareContexts(), domMap));		
		ims.core.admin.domain.objects.CareSpell value2 = null;
		if ( null != valueObject.getCareSpell() ) 
		{
			if (valueObject.getCareSpell().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareSpell()) != null)
				{
					value2 = (ims.core.admin.domain.objects.CareSpell)domMap.get(valueObject.getCareSpell());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getCareSpell();	
			}
			else
			{
				value2 = (ims.core.admin.domain.objects.CareSpell)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareSpell.class, valueObject.getCareSpell().getBoId());
			}
		}
		domainObject.setCareSpell(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value3);
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getStartDate();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setStartDate(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getRelationship() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getRelationship().getID());
		}
		domainObject.setRelationship(value5);
		ims.core.resource.people.domain.objects.Hcp value6 = null;
		if ( null != valueObject.getResponsibleHCP() ) 
		{
			if (valueObject.getResponsibleHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getResponsibleHCP()) != null)
				{
					value6 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getResponsibleHCP());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value6 = domainObject.getResponsibleHCP();	
			}
			else
			{
				value6 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getResponsibleHCP().getBoId());
			}
		}
		domainObject.setResponsibleHCP(value6);
		ims.core.admin.domain.objects.EpisodeOfCareStatusHistory value7 = null;
		if ( null != valueObject.getCurrentStatus() ) 
		{
			if (valueObject.getCurrentStatus().getBoId() == null)
			{
				if (domMap.get(valueObject.getCurrentStatus()) != null)
				{
					value7 = (ims.core.admin.domain.objects.EpisodeOfCareStatusHistory)domMap.get(valueObject.getCurrentStatus());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value7 = domainObject.getCurrentStatus();	
			}
			else
			{
				value7 = (ims.core.admin.domain.objects.EpisodeOfCareStatusHistory)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCareStatusHistory.class, valueObject.getCurrentStatus().getBoId());
			}
		}
		domainObject.setCurrentStatus(value7);

		ims.core.admin.vo.EpisodeOfCareStatusHistoryRefVoCollection refCollection8 = valueObject.getStatusHistory();
		int size8 = (null == refCollection8) ? 0 : refCollection8.size();		
		java.util.List domainStatusHistory8 = domainObject.getStatusHistory();
		if (domainStatusHistory8 == null)
		{
			domainStatusHistory8 = new java.util.ArrayList();
		}
		for(int i=0; i < size8; i++) 
		{
			ims.core.admin.vo.EpisodeOfCareStatusHistoryRefVo vo = refCollection8.get(i);			
			ims.core.admin.domain.objects.EpisodeOfCareStatusHistory dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.admin.domain.objects.EpisodeOfCareStatusHistory)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.admin.domain.objects.EpisodeOfCareStatusHistory)domainFactory.getDomainObject( ims.core.admin.domain.objects.EpisodeOfCareStatusHistory.class, vo.getBoId());
				}
			}

			int domIdx = domainStatusHistory8.indexOf(dom);
			if (domIdx == -1)
			{
				domainStatusHistory8.add(i, dom);
			}
			else if (i != domIdx && i < domainStatusHistory8.size())
			{
				Object tmp = domainStatusHistory8.get(i);
				domainStatusHistory8.set(i, domainStatusHistory8.get(domIdx));
				domainStatusHistory8.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i8 = domainStatusHistory8.size();
		while (i8 > size8)
		{
			domainStatusHistory8.remove(i8-1);
			i8 = domainStatusHistory8.size();
		}
		
		domainObject.setStatusHistory(domainStatusHistory8);		

		return domainObject;
	}

}
