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
package ims.eas.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Sean Nesbitt
 */
public class PrimaryTumourInsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.eas.vo.PrimaryTumourInsVo copy(ims.eas.vo.PrimaryTumourInsVo valueObjectDest, ims.eas.vo.PrimaryTumourInsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PrimaryTumour(valueObjectSrc.getID_PrimaryTumour());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// TreatmentSites
		valueObjectDest.setTreatmentSites(valueObjectSrc.getTreatmentSites());
		// ClinicalTrials
		valueObjectDest.setClinicalTrials(valueObjectSrc.getClinicalTrials());
		// PrimaryTumour
		valueObjectDest.setPrimaryTumour(valueObjectSrc.getPrimaryTumour());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPrimaryTumourInsVoCollectionFromPrimaryTumour(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.eas.configuration.domain.objects.PrimaryTumour objects.
	 */
	public static ims.eas.vo.PrimaryTumourInsVoCollection createPrimaryTumourInsVoCollectionFromPrimaryTumour(java.util.Set domainObjectSet)	
	{
		return createPrimaryTumourInsVoCollectionFromPrimaryTumour(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.eas.configuration.domain.objects.PrimaryTumour objects.
	 */
	public static ims.eas.vo.PrimaryTumourInsVoCollection createPrimaryTumourInsVoCollectionFromPrimaryTumour(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.eas.vo.PrimaryTumourInsVoCollection voList = new ims.eas.vo.PrimaryTumourInsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.eas.configuration.domain.objects.PrimaryTumour domainObject = (ims.eas.configuration.domain.objects.PrimaryTumour) iterator.next();
			ims.eas.vo.PrimaryTumourInsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.eas.configuration.domain.objects.PrimaryTumour objects.
	 */
	public static ims.eas.vo.PrimaryTumourInsVoCollection createPrimaryTumourInsVoCollectionFromPrimaryTumour(java.util.List domainObjectList) 
	{
		return createPrimaryTumourInsVoCollectionFromPrimaryTumour(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.eas.configuration.domain.objects.PrimaryTumour objects.
	 */
	public static ims.eas.vo.PrimaryTumourInsVoCollection createPrimaryTumourInsVoCollectionFromPrimaryTumour(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.eas.vo.PrimaryTumourInsVoCollection voList = new ims.eas.vo.PrimaryTumourInsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.eas.configuration.domain.objects.PrimaryTumour domainObject = (ims.eas.configuration.domain.objects.PrimaryTumour) domainObjectList.get(i);
			ims.eas.vo.PrimaryTumourInsVo vo = create(map, domainObject);

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
	 * Create the ims.eas.configuration.domain.objects.PrimaryTumour set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPrimaryTumourSet(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.PrimaryTumourInsVoCollection voCollection) 
	 {
	 	return extractPrimaryTumourSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPrimaryTumourSet(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.PrimaryTumourInsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.eas.vo.PrimaryTumourInsVo vo = voCollection.get(i);
			ims.eas.configuration.domain.objects.PrimaryTumour domainObject = PrimaryTumourInsVoAssembler.extractPrimaryTumour(domainFactory, vo, domMap);

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
	 * Create the ims.eas.configuration.domain.objects.PrimaryTumour list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPrimaryTumourList(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.PrimaryTumourInsVoCollection voCollection) 
	 {
	 	return extractPrimaryTumourList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPrimaryTumourList(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.PrimaryTumourInsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.eas.vo.PrimaryTumourInsVo vo = voCollection.get(i);
			ims.eas.configuration.domain.objects.PrimaryTumour domainObject = PrimaryTumourInsVoAssembler.extractPrimaryTumour(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.eas.configuration.domain.objects.PrimaryTumour object.
	 * @param domainObject ims.eas.configuration.domain.objects.PrimaryTumour
	 */
	 public static ims.eas.vo.PrimaryTumourInsVo create(ims.eas.configuration.domain.objects.PrimaryTumour domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.eas.configuration.domain.objects.PrimaryTumour object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.eas.vo.PrimaryTumourInsVo create(DomainObjectMap map, ims.eas.configuration.domain.objects.PrimaryTumour domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.eas.vo.PrimaryTumourInsVo valueObject = (ims.eas.vo.PrimaryTumourInsVo) map.getValueObject(domainObject, ims.eas.vo.PrimaryTumourInsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.eas.vo.PrimaryTumourInsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.eas.configuration.domain.objects.PrimaryTumour
	 */
	 public static ims.eas.vo.PrimaryTumourInsVo insert(ims.eas.vo.PrimaryTumourInsVo valueObject, ims.eas.configuration.domain.objects.PrimaryTumour domainObject) 
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
	 * @param domainObject ims.eas.configuration.domain.objects.PrimaryTumour
	 */
	 public static ims.eas.vo.PrimaryTumourInsVo insert(DomainObjectMap map, ims.eas.vo.PrimaryTumourInsVo valueObject, ims.eas.configuration.domain.objects.PrimaryTumour domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PrimaryTumour(domainObject.getId());
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
			
		// Status
		ims.domain.lookups.LookupInstance instance1 = domainObject.getStatus();
		if ( null != instance1 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance1.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance1.getImage().getImageId(), instance1.getImage().getImagePath());
			}
			color = instance1.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup1 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup1 = voLookup1;
			ims.domain.lookups.LookupInstance parent1 = instance1.getParent();
			while (parent1 != null)
			{
				if (parent1.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent1.getImage().getImageId(), parent1.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent1.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup1.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setStatus(voLookup1);
		}
				// TreatmentSites
		valueObject.setTreatmentSites(ims.eas.vo.domain.TreatmentSiteInsVoAssembler.createTreatmentSiteInsVoCollectionFromTreatmentSites(map, domainObject.getTreatmentSites()) );
		// ClinicalTrials
		valueObject.setClinicalTrials(ims.eas.vo.domain.ClinicalTrialLinkVoAssembler.createClinicalTrialLinkVoCollectionFromClinicalTrialsLink(map, domainObject.getClinicalTrials()) );
		// PrimaryTumour
		ims.domain.lookups.LookupInstance instance4 = domainObject.getPrimaryTumour();
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

			ims.eas.vo.lookups.PrimaryTumour voLookup4 = new ims.eas.vo.lookups.PrimaryTumour(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.eas.vo.lookups.PrimaryTumour parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.eas.vo.lookups.PrimaryTumour(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setPrimaryTumour(voLookup4);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.eas.configuration.domain.objects.PrimaryTumour extractPrimaryTumour(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.PrimaryTumourInsVo valueObject) 
	{
		return 	extractPrimaryTumour(domainFactory, valueObject, new HashMap());
	}

	public static ims.eas.configuration.domain.objects.PrimaryTumour extractPrimaryTumour(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.PrimaryTumourInsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PrimaryTumour();
		ims.eas.configuration.domain.objects.PrimaryTumour domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.eas.configuration.domain.objects.PrimaryTumour)domMap.get(valueObject);
			}
			// ims.eas.vo.PrimaryTumourInsVo ID_PrimaryTumour field is unknown
			domainObject = new ims.eas.configuration.domain.objects.PrimaryTumour();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PrimaryTumour());
			if (domMap.get(key) != null)
			{
				return (ims.eas.configuration.domain.objects.PrimaryTumour)domMap.get(key);
			}
			domainObject = (ims.eas.configuration.domain.objects.PrimaryTumour) domainFactory.getDomainObject(ims.eas.configuration.domain.objects.PrimaryTumour.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PrimaryTumour());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value1);

		// SaveAsRefVO treated as RefValueObject
		ims.eas.configuration.vo.TreatmentSitesRefVoCollection refCollection2 = new ims.eas.configuration.vo.TreatmentSitesRefVoCollection();
		if (valueObject.getTreatmentSites() != null)
		{
			for (int i2=0; i2<valueObject.getTreatmentSites().size(); i2++)
			{
				ims.eas.configuration.vo.TreatmentSitesRefVo ref2 = (ims.eas.configuration.vo.TreatmentSitesRefVo)valueObject.getTreatmentSites().get(i2);
				refCollection2.add(ref2);
			}
		}
		int size2 = (null == refCollection2) ? 0 : refCollection2.size();		
		java.util.List domainTreatmentSites2 = domainObject.getTreatmentSites();
		if (domainTreatmentSites2 == null)
		{
			domainTreatmentSites2 = new java.util.ArrayList();
		}
		for(int i=0; i < size2; i++) 
		{
			ims.eas.configuration.vo.TreatmentSitesRefVo vo = refCollection2.get(i);			
			ims.eas.configuration.domain.objects.TreatmentSites dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.eas.configuration.domain.objects.TreatmentSites)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.eas.configuration.domain.objects.TreatmentSites)domainFactory.getDomainObject( ims.eas.configuration.domain.objects.TreatmentSites.class, vo.getBoId());
				}
			}

			int domIdx = domainTreatmentSites2.indexOf(dom);
			if (domIdx == -1)
			{
				domainTreatmentSites2.add(i, dom);
			}
			else if (i != domIdx && i < domainTreatmentSites2.size())
			{
				Object tmp = domainTreatmentSites2.get(i);
				domainTreatmentSites2.set(i, domainTreatmentSites2.get(domIdx));
				domainTreatmentSites2.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i2 = domainTreatmentSites2.size();
		while (i2 > size2)
		{
			domainTreatmentSites2.remove(i2-1);
			i2 = domainTreatmentSites2.size();
		}
		
		domainObject.setTreatmentSites(domainTreatmentSites2);		

		// SaveAsRefVO treated as RefValueObject
		ims.eas.configuration.vo.ClinicalTrialsLinkRefVoCollection refCollection3 = new ims.eas.configuration.vo.ClinicalTrialsLinkRefVoCollection();
		if (valueObject.getClinicalTrials() != null)
		{
			for (int i3=0; i3<valueObject.getClinicalTrials().size(); i3++)
			{
				ims.eas.configuration.vo.ClinicalTrialsLinkRefVo ref3 = (ims.eas.configuration.vo.ClinicalTrialsLinkRefVo)valueObject.getClinicalTrials().get(i3);
				refCollection3.add(ref3);
			}
		}
		int size3 = (null == refCollection3) ? 0 : refCollection3.size();		
		java.util.List domainClinicalTrials3 = domainObject.getClinicalTrials();
		if (domainClinicalTrials3 == null)
		{
			domainClinicalTrials3 = new java.util.ArrayList();
		}
		for(int i=0; i < size3; i++) 
		{
			ims.eas.configuration.vo.ClinicalTrialsLinkRefVo vo = refCollection3.get(i);			
			ims.eas.configuration.domain.objects.ClinicalTrialsLink dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.eas.configuration.domain.objects.ClinicalTrialsLink)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.eas.configuration.domain.objects.ClinicalTrialsLink)domainFactory.getDomainObject( ims.eas.configuration.domain.objects.ClinicalTrialsLink.class, vo.getBoId());
				}
			}

			int domIdx = domainClinicalTrials3.indexOf(dom);
			if (domIdx == -1)
			{
				domainClinicalTrials3.add(i, dom);
			}
			else if (i != domIdx && i < domainClinicalTrials3.size())
			{
				Object tmp = domainClinicalTrials3.get(i);
				domainClinicalTrials3.set(i, domainClinicalTrials3.get(domIdx));
				domainClinicalTrials3.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i3 = domainClinicalTrials3.size();
		while (i3 > size3)
		{
			domainClinicalTrials3.remove(i3-1);
			i3 = domainClinicalTrials3.size();
		}
		
		domainObject.setClinicalTrials(domainClinicalTrials3);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getPrimaryTumour() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getPrimaryTumour().getID());
		}
		domainObject.setPrimaryTumour(value4);

		return domainObject;
	}

}
