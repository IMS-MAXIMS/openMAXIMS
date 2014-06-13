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
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Peter Martin
 */
public class RACPPlanAdviceVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.RACPPlanAdviceVo copy(ims.clinical.vo.RACPPlanAdviceVo valueObjectDest, ims.clinical.vo.RACPPlanAdviceVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_RACPPlanAdvice(valueObjectSrc.getID_RACPPlanAdvice());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// PrimaryPlan
		valueObjectDest.setPrimaryPlan(valueObjectSrc.getPrimaryPlan());
		// OverallImpression
		valueObjectDest.setOverallImpression(valueObjectSrc.getOverallImpression());
		// OtherDetails
		valueObjectDest.setOtherDetails(valueObjectSrc.getOtherDetails());
		// SecondaryPlans
		valueObjectDest.setSecondaryPlans(valueObjectSrc.getSecondaryPlans());
		// AdviceGivenPatient
		valueObjectDest.setAdviceGivenPatient(valueObjectSrc.getAdviceGivenPatient());
		// AdviceGivenToGP
		valueObjectDest.setAdviceGivenToGP(valueObjectSrc.getAdviceGivenToGP());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createRACPPlanAdviceVoCollectionFromRACPPlanAdvice(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.RACPPlanAdvice objects.
	 */
	public static ims.clinical.vo.RACPPlanAdviceVoCollection createRACPPlanAdviceVoCollectionFromRACPPlanAdvice(java.util.Set domainObjectSet)	
	{
		return createRACPPlanAdviceVoCollectionFromRACPPlanAdvice(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.RACPPlanAdvice objects.
	 */
	public static ims.clinical.vo.RACPPlanAdviceVoCollection createRACPPlanAdviceVoCollectionFromRACPPlanAdvice(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.RACPPlanAdviceVoCollection voList = new ims.clinical.vo.RACPPlanAdviceVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.RACPPlanAdvice domainObject = (ims.clinical.domain.objects.RACPPlanAdvice) iterator.next();
			ims.clinical.vo.RACPPlanAdviceVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.RACPPlanAdvice objects.
	 */
	public static ims.clinical.vo.RACPPlanAdviceVoCollection createRACPPlanAdviceVoCollectionFromRACPPlanAdvice(java.util.List domainObjectList) 
	{
		return createRACPPlanAdviceVoCollectionFromRACPPlanAdvice(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.RACPPlanAdvice objects.
	 */
	public static ims.clinical.vo.RACPPlanAdviceVoCollection createRACPPlanAdviceVoCollectionFromRACPPlanAdvice(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.RACPPlanAdviceVoCollection voList = new ims.clinical.vo.RACPPlanAdviceVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.RACPPlanAdvice domainObject = (ims.clinical.domain.objects.RACPPlanAdvice) domainObjectList.get(i);
			ims.clinical.vo.RACPPlanAdviceVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.RACPPlanAdvice set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractRACPPlanAdviceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.RACPPlanAdviceVoCollection voCollection) 
	 {
	 	return extractRACPPlanAdviceSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractRACPPlanAdviceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.RACPPlanAdviceVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.RACPPlanAdviceVo vo = voCollection.get(i);
			ims.clinical.domain.objects.RACPPlanAdvice domainObject = RACPPlanAdviceVoAssembler.extractRACPPlanAdvice(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.RACPPlanAdvice list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractRACPPlanAdviceList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.RACPPlanAdviceVoCollection voCollection) 
	 {
	 	return extractRACPPlanAdviceList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractRACPPlanAdviceList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.RACPPlanAdviceVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.RACPPlanAdviceVo vo = voCollection.get(i);
			ims.clinical.domain.objects.RACPPlanAdvice domainObject = RACPPlanAdviceVoAssembler.extractRACPPlanAdvice(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.RACPPlanAdvice object.
	 * @param domainObject ims.clinical.domain.objects.RACPPlanAdvice
	 */
	 public static ims.clinical.vo.RACPPlanAdviceVo create(ims.clinical.domain.objects.RACPPlanAdvice domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.RACPPlanAdvice object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.RACPPlanAdviceVo create(DomainObjectMap map, ims.clinical.domain.objects.RACPPlanAdvice domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.RACPPlanAdviceVo valueObject = (ims.clinical.vo.RACPPlanAdviceVo) map.getValueObject(domainObject, ims.clinical.vo.RACPPlanAdviceVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.RACPPlanAdviceVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.RACPPlanAdvice
	 */
	 public static ims.clinical.vo.RACPPlanAdviceVo insert(ims.clinical.vo.RACPPlanAdviceVo valueObject, ims.clinical.domain.objects.RACPPlanAdvice domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.RACPPlanAdvice
	 */
	 public static ims.clinical.vo.RACPPlanAdviceVo insert(DomainObjectMap map, ims.clinical.vo.RACPPlanAdviceVo valueObject, ims.clinical.domain.objects.RACPPlanAdvice domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_RACPPlanAdvice(domainObject.getId());
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
			
		// PrimaryPlan
		ims.domain.lookups.LookupInstance instance1 = domainObject.getPrimaryPlan();
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

			ims.core.vo.lookups.PlanOfAction voLookup1 = new ims.core.vo.lookups.PlanOfAction(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.PlanOfAction parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.core.vo.lookups.PlanOfAction(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setPrimaryPlan(voLookup1);
		}
				// OverallImpression
		ims.domain.lookups.LookupInstance instance2 = domainObject.getOverallImpression();
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

			ims.core.vo.lookups.OverallImpression voLookup2 = new ims.core.vo.lookups.OverallImpression(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.OverallImpression parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.OverallImpression(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setOverallImpression(voLookup2);
		}
				// OtherDetails
		valueObject.setOtherDetails(domainObject.getOtherDetails());
		// SecondaryPlans
		java.util.List listSecondaryPlans = domainObject.getSecondaryPlans();
		ims.core.vo.lookups.PlanOfActionCollection SecondaryPlans = new ims.core.vo.lookups.PlanOfActionCollection();
		for(java.util.Iterator iterator = listSecondaryPlans.iterator(); iterator.hasNext(); ) 
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
			ims.core.vo.lookups.PlanOfAction voInstance = new ims.core.vo.lookups.PlanOfAction(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.core.vo.lookups.PlanOfAction parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.core.vo.lookups.PlanOfAction(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			SecondaryPlans.add(voInstance);
		}
		valueObject.setSecondaryPlans( SecondaryPlans );
		// AdviceGivenPatient
		java.util.List listAdviceGivenPatient = domainObject.getAdviceGivenPatient();
		ims.core.vo.lookups.AdviceToPatientCollection AdviceGivenPatient = new ims.core.vo.lookups.AdviceToPatientCollection();
		for(java.util.Iterator iterator = listAdviceGivenPatient.iterator(); iterator.hasNext(); ) 
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
			ims.core.vo.lookups.AdviceToPatient voInstance = new ims.core.vo.lookups.AdviceToPatient(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.core.vo.lookups.AdviceToPatient parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.core.vo.lookups.AdviceToPatient(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			AdviceGivenPatient.add(voInstance);
		}
		valueObject.setAdviceGivenPatient( AdviceGivenPatient );
		// AdviceGivenToGP
		java.util.List listAdviceGivenToGP = domainObject.getAdviceGivenToGP();
		ims.core.vo.lookups.AdviceToGPCollection AdviceGivenToGP = new ims.core.vo.lookups.AdviceToGPCollection();
		for(java.util.Iterator iterator = listAdviceGivenToGP.iterator(); iterator.hasNext(); ) 
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
			ims.core.vo.lookups.AdviceToGP voInstance = new ims.core.vo.lookups.AdviceToGP(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.core.vo.lookups.AdviceToGP parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.core.vo.lookups.AdviceToGP(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			AdviceGivenToGP.add(voInstance);
		}
		valueObject.setAdviceGivenToGP( AdviceGivenToGP );
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
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.RACPPlanAdvice extractRACPPlanAdvice(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.RACPPlanAdviceVo valueObject) 
	{
		return 	extractRACPPlanAdvice(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.RACPPlanAdvice extractRACPPlanAdvice(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.RACPPlanAdviceVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_RACPPlanAdvice();
		ims.clinical.domain.objects.RACPPlanAdvice domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.RACPPlanAdvice)domMap.get(valueObject);
			}
			// ims.clinical.vo.RACPPlanAdviceVo ID_RACPPlanAdvice field is unknown
			domainObject = new ims.clinical.domain.objects.RACPPlanAdvice();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_RACPPlanAdvice());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.RACPPlanAdvice)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.RACPPlanAdvice) domainFactory.getDomainObject(ims.clinical.domain.objects.RACPPlanAdvice.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_RACPPlanAdvice());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getPrimaryPlan() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getPrimaryPlan().getID());
		}
		domainObject.setPrimaryPlan(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getOverallImpression() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getOverallImpression().getID());
		}
		domainObject.setOverallImpression(value2);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOtherDetails() != null && valueObject.getOtherDetails().equals(""))
		{
			valueObject.setOtherDetails(null);
		}
		domainObject.setOtherDetails(valueObject.getOtherDetails());
		ims.core.vo.lookups.PlanOfActionCollection collection4 =
	valueObject.getSecondaryPlans();
	    java.util.List domainSecondaryPlans = domainObject.getSecondaryPlans();;			
	    int collection4Size=0;
		if (collection4 == null)
		{
			domainSecondaryPlans = new java.util.ArrayList(0);
		}
		else
		{
			collection4Size = collection4.size();
		}
		
		for(int i=0; i<collection4Size; i++) 
		{
			int instanceId = collection4.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainSecondaryPlans.indexOf(dom);
			if (domIdx == -1)
			{
				domainSecondaryPlans.add(i, dom);
			}
			else if (i != domIdx && i < domainSecondaryPlans.size())
			{
				Object tmp = domainSecondaryPlans.get(i);
				domainSecondaryPlans.set(i, domainSecondaryPlans.get(domIdx));
				domainSecondaryPlans.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j4 = domainSecondaryPlans.size();
		while (j4 > collection4Size)
		{
			domainSecondaryPlans.remove(j4-1);
			j4 = domainSecondaryPlans.size();
		}

		domainObject.setSecondaryPlans(domainSecondaryPlans);		
		ims.core.vo.lookups.AdviceToPatientCollection collection5 =
	valueObject.getAdviceGivenPatient();
	    java.util.List domainAdviceGivenPatient = domainObject.getAdviceGivenPatient();;			
	    int collection5Size=0;
		if (collection5 == null)
		{
			domainAdviceGivenPatient = new java.util.ArrayList(0);
		}
		else
		{
			collection5Size = collection5.size();
		}
		
		for(int i=0; i<collection5Size; i++) 
		{
			int instanceId = collection5.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainAdviceGivenPatient.indexOf(dom);
			if (domIdx == -1)
			{
				domainAdviceGivenPatient.add(i, dom);
			}
			else if (i != domIdx && i < domainAdviceGivenPatient.size())
			{
				Object tmp = domainAdviceGivenPatient.get(i);
				domainAdviceGivenPatient.set(i, domainAdviceGivenPatient.get(domIdx));
				domainAdviceGivenPatient.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j5 = domainAdviceGivenPatient.size();
		while (j5 > collection5Size)
		{
			domainAdviceGivenPatient.remove(j5-1);
			j5 = domainAdviceGivenPatient.size();
		}

		domainObject.setAdviceGivenPatient(domainAdviceGivenPatient);		
		ims.core.vo.lookups.AdviceToGPCollection collection6 =
	valueObject.getAdviceGivenToGP();
	    java.util.List domainAdviceGivenToGP = domainObject.getAdviceGivenToGP();;			
	    int collection6Size=0;
		if (collection6 == null)
		{
			domainAdviceGivenToGP = new java.util.ArrayList(0);
		}
		else
		{
			collection6Size = collection6.size();
		}
		
		for(int i=0; i<collection6Size; i++) 
		{
			int instanceId = collection6.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainAdviceGivenToGP.indexOf(dom);
			if (domIdx == -1)
			{
				domainAdviceGivenToGP.add(i, dom);
			}
			else if (i != domIdx && i < domainAdviceGivenToGP.size())
			{
				Object tmp = domainAdviceGivenToGP.get(i);
				domainAdviceGivenToGP.set(i, domainAdviceGivenToGP.get(domIdx));
				domainAdviceGivenToGP.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j6 = domainAdviceGivenToGP.size();
		while (j6 > collection6Size)
		{
			domainAdviceGivenToGP.remove(j6-1);
			j6 = domainAdviceGivenToGP.size();
		}

		domainObject.setAdviceGivenToGP(domainAdviceGivenToGP);		
		ims.core.admin.domain.objects.CareContext value7 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value7 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value7 = domainObject.getCareContext();	
			}
			else
			{
				value7 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value7);

		return domainObject;
	}

}
