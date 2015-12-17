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
 * Generated on 16/04/2014, 12:32
 *
 */
package ims.nursing.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Catalin Tomozei
 */
public class PlanOfCareNotingVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.nursing.vo.PlanOfCareNotingVo copy(ims.nursing.vo.PlanOfCareNotingVo valueObjectDest, ims.nursing.vo.PlanOfCareNotingVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PlanOfCareNoting(valueObjectSrc.getID_PlanOfCareNoting());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// ReviewingDateTime
		valueObjectDest.setReviewingDateTime(valueObjectSrc.getReviewingDateTime());
		// ReviewingHCP
		valueObjectDest.setReviewingHCP(valueObjectSrc.getReviewingHCP());
		// ActionStatus
		valueObjectDest.setActionStatus(valueObjectSrc.getActionStatus());
		// Actions
		valueObjectDest.setActions(valueObjectSrc.getActions());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPlanOfCareNotingVoCollectionFromPlanOfCareNoting(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.nursing.domain.objects.PlanOfCareNoting objects.
	 */
	public static ims.nursing.vo.PlanOfCareNotingVoCollection createPlanOfCareNotingVoCollectionFromPlanOfCareNoting(java.util.Set domainObjectSet)	
	{
		return createPlanOfCareNotingVoCollectionFromPlanOfCareNoting(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.nursing.domain.objects.PlanOfCareNoting objects.
	 */
	public static ims.nursing.vo.PlanOfCareNotingVoCollection createPlanOfCareNotingVoCollectionFromPlanOfCareNoting(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.nursing.vo.PlanOfCareNotingVoCollection voList = new ims.nursing.vo.PlanOfCareNotingVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.nursing.domain.objects.PlanOfCareNoting domainObject = (ims.nursing.domain.objects.PlanOfCareNoting) iterator.next();
			ims.nursing.vo.PlanOfCareNotingVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.nursing.domain.objects.PlanOfCareNoting objects.
	 */
	public static ims.nursing.vo.PlanOfCareNotingVoCollection createPlanOfCareNotingVoCollectionFromPlanOfCareNoting(java.util.List domainObjectList) 
	{
		return createPlanOfCareNotingVoCollectionFromPlanOfCareNoting(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.nursing.domain.objects.PlanOfCareNoting objects.
	 */
	public static ims.nursing.vo.PlanOfCareNotingVoCollection createPlanOfCareNotingVoCollectionFromPlanOfCareNoting(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.nursing.vo.PlanOfCareNotingVoCollection voList = new ims.nursing.vo.PlanOfCareNotingVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.nursing.domain.objects.PlanOfCareNoting domainObject = (ims.nursing.domain.objects.PlanOfCareNoting) domainObjectList.get(i);
			ims.nursing.vo.PlanOfCareNotingVo vo = create(map, domainObject);

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
	 * Create the ims.nursing.domain.objects.PlanOfCareNoting set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPlanOfCareNotingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PlanOfCareNotingVoCollection voCollection) 
	 {
	 	return extractPlanOfCareNotingSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPlanOfCareNotingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PlanOfCareNotingVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.PlanOfCareNotingVo vo = voCollection.get(i);
			ims.nursing.domain.objects.PlanOfCareNoting domainObject = PlanOfCareNotingVoAssembler.extractPlanOfCareNoting(domainFactory, vo, domMap);

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
	 * Create the ims.nursing.domain.objects.PlanOfCareNoting list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPlanOfCareNotingList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PlanOfCareNotingVoCollection voCollection) 
	 {
	 	return extractPlanOfCareNotingList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPlanOfCareNotingList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PlanOfCareNotingVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.PlanOfCareNotingVo vo = voCollection.get(i);
			ims.nursing.domain.objects.PlanOfCareNoting domainObject = PlanOfCareNotingVoAssembler.extractPlanOfCareNoting(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.nursing.domain.objects.PlanOfCareNoting object.
	 * @param domainObject ims.nursing.domain.objects.PlanOfCareNoting
	 */
	 public static ims.nursing.vo.PlanOfCareNotingVo create(ims.nursing.domain.objects.PlanOfCareNoting domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.nursing.domain.objects.PlanOfCareNoting object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.nursing.vo.PlanOfCareNotingVo create(DomainObjectMap map, ims.nursing.domain.objects.PlanOfCareNoting domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.nursing.vo.PlanOfCareNotingVo valueObject = (ims.nursing.vo.PlanOfCareNotingVo) map.getValueObject(domainObject, ims.nursing.vo.PlanOfCareNotingVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.nursing.vo.PlanOfCareNotingVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.nursing.domain.objects.PlanOfCareNoting
	 */
	 public static ims.nursing.vo.PlanOfCareNotingVo insert(ims.nursing.vo.PlanOfCareNotingVo valueObject, ims.nursing.domain.objects.PlanOfCareNoting domainObject) 
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
	 * @param domainObject ims.nursing.domain.objects.PlanOfCareNoting
	 */
	 public static ims.nursing.vo.PlanOfCareNotingVo insert(DomainObjectMap map, ims.nursing.vo.PlanOfCareNotingVo valueObject, ims.nursing.domain.objects.PlanOfCareNoting domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PlanOfCareNoting(domainObject.getId());
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
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// ReviewingDateTime
		java.util.Date ReviewingDateTime = domainObject.getReviewingDateTime();
		if ( null != ReviewingDateTime ) 
		{
			valueObject.setReviewingDateTime(new ims.framework.utils.DateTime(ReviewingDateTime) );
		}
		// ReviewingHCP
		valueObject.setReviewingHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getReviewingHCP()) );
		// ActionStatus
		ims.domain.lookups.LookupInstance instance5 = domainObject.getActionStatus();
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

			ims.nursing.vo.lookups.PlanOfCareActionStatus voLookup5 = new ims.nursing.vo.lookups.PlanOfCareActionStatus(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.nursing.vo.lookups.PlanOfCareActionStatus parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.nursing.vo.lookups.PlanOfCareActionStatus(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setActionStatus(voLookup5);
		}
				// Actions
		valueObject.setActions(ims.nursing.vo.domain.PlanOfCareActionsVoAssembler.createPlanOfCareActionsVoCollectionFromPlanOfCareActions(map, domainObject.getActions()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.nursing.domain.objects.PlanOfCareNoting extractPlanOfCareNoting(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PlanOfCareNotingVo valueObject) 
	{
		return 	extractPlanOfCareNoting(domainFactory, valueObject, new HashMap());
	}

	public static ims.nursing.domain.objects.PlanOfCareNoting extractPlanOfCareNoting(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PlanOfCareNotingVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PlanOfCareNoting();
		ims.nursing.domain.objects.PlanOfCareNoting domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.nursing.domain.objects.PlanOfCareNoting)domMap.get(valueObject);
			}
			// ims.nursing.vo.PlanOfCareNotingVo ID_PlanOfCareNoting field is unknown
			domainObject = new ims.nursing.domain.objects.PlanOfCareNoting();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PlanOfCareNoting());
			if (domMap.get(key) != null)
			{
				return (ims.nursing.domain.objects.PlanOfCareNoting)domMap.get(key);
			}
			domainObject = (ims.nursing.domain.objects.PlanOfCareNoting) domainFactory.getDomainObject(ims.nursing.domain.objects.PlanOfCareNoting.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PlanOfCareNoting());

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
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		ims.framework.utils.DateTime dateTime3 = valueObject.getReviewingDateTime();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setReviewingDateTime(value3);
		domainObject.setReviewingHCP(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getReviewingHCP(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getActionStatus() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getActionStatus().getID());
		}
		domainObject.setActionStatus(value5);
		domainObject.setActions(ims.nursing.vo.domain.PlanOfCareActionsVoAssembler.extractPlanOfCareActionsList(domainFactory, valueObject.getActions(), domainObject.getActions(), domMap));		

		return domainObject;
	}

}
