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
public class RadiotherapyDetailsShortVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.oncology.vo.RadiotherapyDetailsShortVo copy(ims.oncology.vo.RadiotherapyDetailsShortVo valueObjectDest, ims.oncology.vo.RadiotherapyDetailsShortVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_RadiotherapyDetails(valueObjectSrc.getID_RadiotherapyDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// RadiotherapyType
		valueObjectDest.setRadiotherapyType(valueObjectSrc.getRadiotherapyType());
		// TreatingConsultant
		valueObjectDest.setTreatingConsultant(valueObjectSrc.getTreatingConsultant());
		// TreatementIntent
		valueObjectDest.setTreatementIntent(valueObjectSrc.getTreatementIntent());
		// AnatomicalTreatmentSite
		valueObjectDest.setAnatomicalTreatmentSite(valueObjectSrc.getAnatomicalTreatmentSite());
		// DateDecisionToTreat
		valueObjectDest.setDateDecisionToTreat(valueObjectSrc.getDateDecisionToTreat());
		// StartDate
		valueObjectDest.setStartDate(valueObjectSrc.getStartDate());
		// EpisodeOfCare
		valueObjectDest.setEpisodeOfCare(valueObjectSrc.getEpisodeOfCare());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createRadiotherapyDetailsShortVoCollectionFromRadiotherapyDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.RadiotherapyDetails objects.
	 */
	public static ims.oncology.vo.RadiotherapyDetailsShortVoCollection createRadiotherapyDetailsShortVoCollectionFromRadiotherapyDetails(java.util.Set domainObjectSet)	
	{
		return createRadiotherapyDetailsShortVoCollectionFromRadiotherapyDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.RadiotherapyDetails objects.
	 */
	public static ims.oncology.vo.RadiotherapyDetailsShortVoCollection createRadiotherapyDetailsShortVoCollectionFromRadiotherapyDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.oncology.vo.RadiotherapyDetailsShortVoCollection voList = new ims.oncology.vo.RadiotherapyDetailsShortVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.oncology.domain.objects.RadiotherapyDetails domainObject = (ims.oncology.domain.objects.RadiotherapyDetails) iterator.next();
			ims.oncology.vo.RadiotherapyDetailsShortVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.oncology.domain.objects.RadiotherapyDetails objects.
	 */
	public static ims.oncology.vo.RadiotherapyDetailsShortVoCollection createRadiotherapyDetailsShortVoCollectionFromRadiotherapyDetails(java.util.List domainObjectList) 
	{
		return createRadiotherapyDetailsShortVoCollectionFromRadiotherapyDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.domain.objects.RadiotherapyDetails objects.
	 */
	public static ims.oncology.vo.RadiotherapyDetailsShortVoCollection createRadiotherapyDetailsShortVoCollectionFromRadiotherapyDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.oncology.vo.RadiotherapyDetailsShortVoCollection voList = new ims.oncology.vo.RadiotherapyDetailsShortVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.domain.objects.RadiotherapyDetails domainObject = (ims.oncology.domain.objects.RadiotherapyDetails) domainObjectList.get(i);
			ims.oncology.vo.RadiotherapyDetailsShortVo vo = create(map, domainObject);

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
	 * Create the ims.oncology.domain.objects.RadiotherapyDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractRadiotherapyDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.RadiotherapyDetailsShortVoCollection voCollection) 
	 {
	 	return extractRadiotherapyDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractRadiotherapyDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.RadiotherapyDetailsShortVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.RadiotherapyDetailsShortVo vo = voCollection.get(i);
			ims.oncology.domain.objects.RadiotherapyDetails domainObject = RadiotherapyDetailsShortVoAssembler.extractRadiotherapyDetails(domainFactory, vo, domMap);

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
	 * Create the ims.oncology.domain.objects.RadiotherapyDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractRadiotherapyDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.RadiotherapyDetailsShortVoCollection voCollection) 
	 {
	 	return extractRadiotherapyDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractRadiotherapyDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.RadiotherapyDetailsShortVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.RadiotherapyDetailsShortVo vo = voCollection.get(i);
			ims.oncology.domain.objects.RadiotherapyDetails domainObject = RadiotherapyDetailsShortVoAssembler.extractRadiotherapyDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.oncology.domain.objects.RadiotherapyDetails object.
	 * @param domainObject ims.oncology.domain.objects.RadiotherapyDetails
	 */
	 public static ims.oncology.vo.RadiotherapyDetailsShortVo create(ims.oncology.domain.objects.RadiotherapyDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.oncology.domain.objects.RadiotherapyDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.oncology.vo.RadiotherapyDetailsShortVo create(DomainObjectMap map, ims.oncology.domain.objects.RadiotherapyDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.oncology.vo.RadiotherapyDetailsShortVo valueObject = (ims.oncology.vo.RadiotherapyDetailsShortVo) map.getValueObject(domainObject, ims.oncology.vo.RadiotherapyDetailsShortVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.oncology.vo.RadiotherapyDetailsShortVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.oncology.domain.objects.RadiotherapyDetails
	 */
	 public static ims.oncology.vo.RadiotherapyDetailsShortVo insert(ims.oncology.vo.RadiotherapyDetailsShortVo valueObject, ims.oncology.domain.objects.RadiotherapyDetails domainObject) 
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
	 * @param domainObject ims.oncology.domain.objects.RadiotherapyDetails
	 */
	 public static ims.oncology.vo.RadiotherapyDetailsShortVo insert(DomainObjectMap map, ims.oncology.vo.RadiotherapyDetailsShortVo valueObject, ims.oncology.domain.objects.RadiotherapyDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_RadiotherapyDetails(domainObject.getId());
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
		valueObject.setCareContext(ims.core.vo.domain.CareContextShortVoAssembler.create(map, domainObject.getCareContext()) );
		// RadiotherapyType
		ims.domain.lookups.LookupInstance instance2 = domainObject.getRadiotherapyType();
		if ( null != instance2 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance2.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance2.getImage().getImageId(), instance2.getImage().getImagePath());
			}
			color = instance2.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.RadiotherapyType voLookup2 = new ims.oncology.vo.lookups.RadiotherapyType(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.oncology.vo.lookups.RadiotherapyType parentVoLookup2 = voLookup2;
			ims.domain.lookups.LookupInstance parent2 = instance2.getParent();
			while (parent2 != null)
			{
				if (parent2.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent2.getImage().getImageId(), parent2.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent2.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup2.setParent(new ims.oncology.vo.lookups.RadiotherapyType(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setRadiotherapyType(voLookup2);
		}
				// TreatingConsultant
		valueObject.setTreatingConsultant((ims.core.vo.Hcp)ims.core.vo.domain.HcpAssembler.create(map, domainObject.getTreatingConsultant()) );
		// TreatementIntent
		ims.domain.lookups.LookupInstance instance4 = domainObject.getTreatementIntent();
		if ( null != instance4 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance4.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance4.getImage().getImageId(), instance4.getImage().getImagePath());
			}
			color = instance4.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.CancerTreatmentIntent voLookup4 = new ims.oncology.vo.lookups.CancerTreatmentIntent(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.oncology.vo.lookups.CancerTreatmentIntent parentVoLookup4 = voLookup4;
			ims.domain.lookups.LookupInstance parent4 = instance4.getParent();
			while (parent4 != null)
			{
				if (parent4.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent4.getImage().getImageId(), parent4.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent4.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup4.setParent(new ims.oncology.vo.lookups.CancerTreatmentIntent(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setTreatementIntent(voLookup4);
		}
				// AnatomicalTreatmentSite
		ims.domain.lookups.LookupInstance instance5 = domainObject.getAnatomicalTreatmentSite();
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

			ims.oncology.vo.lookups.AnatomicalTreatmentSite voLookup5 = new ims.oncology.vo.lookups.AnatomicalTreatmentSite(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.oncology.vo.lookups.AnatomicalTreatmentSite parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.oncology.vo.lookups.AnatomicalTreatmentSite(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setAnatomicalTreatmentSite(voLookup5);
		}
				// DateDecisionToTreat
		java.util.Date DateDecisionToTreat = domainObject.getDateDecisionToTreat();
		if ( null != DateDecisionToTreat ) 
		{
			valueObject.setDateDecisionToTreat(new ims.framework.utils.Date(DateDecisionToTreat) );
		}
		// StartDate
		java.util.Date StartDate = domainObject.getStartDate();
		if ( null != StartDate ) 
		{
			valueObject.setStartDate(new ims.framework.utils.Date(StartDate) );
		}
		// EpisodeOfCare
		if (domainObject.getEpisodeOfCare() != null)
		{
			if(domainObject.getEpisodeOfCare() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getEpisodeOfCare();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setEpisodeOfCare(new ims.core.admin.vo.EpisodeOfCareRefVo(id, -1));				
			}
			else
			{
				valueObject.setEpisodeOfCare(new ims.core.admin.vo.EpisodeOfCareRefVo(domainObject.getEpisodeOfCare().getId(), domainObject.getEpisodeOfCare().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.domain.objects.RadiotherapyDetails extractRadiotherapyDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.RadiotherapyDetailsShortVo valueObject) 
	{
		return 	extractRadiotherapyDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.domain.objects.RadiotherapyDetails extractRadiotherapyDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.RadiotherapyDetailsShortVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_RadiotherapyDetails();
		ims.oncology.domain.objects.RadiotherapyDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.oncology.domain.objects.RadiotherapyDetails)domMap.get(valueObject);
			}
			// ims.oncology.vo.RadiotherapyDetailsShortVo ID_RadiotherapyDetails field is unknown
			domainObject = new ims.oncology.domain.objects.RadiotherapyDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_RadiotherapyDetails());
			if (domMap.get(key) != null)
			{
				return (ims.oncology.domain.objects.RadiotherapyDetails)domMap.get(key);
			}
			domainObject = (ims.oncology.domain.objects.RadiotherapyDetails) domainFactory.getDomainObject(ims.oncology.domain.objects.RadiotherapyDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_RadiotherapyDetails());

	// SaveAsRefVO - treated as a refVo in extract methods
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
			else
			{
				value1 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getRadiotherapyType() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getRadiotherapyType().getID());
		}
		domainObject.setRadiotherapyType(value2);
		domainObject.setTreatingConsultant(ims.core.vo.domain.HcpAssembler.extractHcp(domainFactory, (ims.core.vo.Hcp)valueObject.getTreatingConsultant(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getTreatementIntent() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getTreatementIntent().getID());
		}
		domainObject.setTreatementIntent(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getAnatomicalTreatmentSite() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getAnatomicalTreatmentSite().getID());
		}
		domainObject.setAnatomicalTreatmentSite(value5);
		java.util.Date value6 = null;
		ims.framework.utils.Date date6 = valueObject.getDateDecisionToTreat();		
		if ( date6 != null ) 
		{
			value6 = date6.getDate();
		}
		domainObject.setDateDecisionToTreat(value6);
		java.util.Date value7 = null;
		ims.framework.utils.Date date7 = valueObject.getStartDate();		
		if ( date7 != null ) 
		{
			value7 = date7.getDate();
		}
		domainObject.setStartDate(value7);
		ims.core.admin.domain.objects.EpisodeOfCare value8 = null;
		if ( null != valueObject.getEpisodeOfCare() ) 
		{
			if (valueObject.getEpisodeOfCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisodeOfCare()) != null)
				{
					value8 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisodeOfCare());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value8 = domainObject.getEpisodeOfCare();	
			}
			else
			{
				value8 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisodeOfCare().getBoId());
			}
		}
		domainObject.setEpisodeOfCare(value8);

		return domainObject;
	}

}
