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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class ActivitySchedVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.ActivitySchedVo copy(ims.core.vo.ActivitySchedVo valueObjectDest, ims.core.vo.ActivitySchedVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Activity(valueObjectSrc.getID_Activity());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// IntReq
		valueObjectDest.setIntReq(valueObjectSrc.getIntReq());
		// isPatReq
		valueObjectDest.setIsPatReq(valueObjectSrc.getIsPatReq());
		// isScheduled
		valueObjectDest.setIsScheduled(valueObjectSrc.getIsScheduled());
		// Reason
		valueObjectDest.setReason(valueObjectSrc.getReason());
		// ActivityImage
		valueObjectDest.setActivityImage(valueObjectSrc.getActivityImage());
		// SpecialRequirements
		valueObjectDest.setSpecialRequirements(valueObjectSrc.getSpecialRequirements());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// ActivityType
		valueObjectDest.setActivityType(valueObjectSrc.getActivityType());
		// isWorkQueue
		valueObjectDest.setIsWorkQueue(valueObjectSrc.getIsWorkQueue());
		// Description
		valueObjectDest.setDescription(valueObjectSrc.getDescription());
		// status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// CodeMappings
		valueObjectDest.setCodeMappings(valueObjectSrc.getCodeMappings());
		// FirstAppointment
		valueObjectDest.setFirstAppointment(valueObjectSrc.getFirstAppointment());
		// Diagnostic
		valueObjectDest.setDiagnostic(valueObjectSrc.getDiagnostic());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// TmReq
		valueObjectDest.setTmReq(valueObjectSrc.getTmReq());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createActivitySchedVoCollectionFromActivity(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.resource.place.domain.objects.Activity objects.
	 */
	public static ims.core.vo.ActivitySchedVoCollection createActivitySchedVoCollectionFromActivity(java.util.Set domainObjectSet)	
	{
		return createActivitySchedVoCollectionFromActivity(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.resource.place.domain.objects.Activity objects.
	 */
	public static ims.core.vo.ActivitySchedVoCollection createActivitySchedVoCollectionFromActivity(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.ActivitySchedVoCollection voList = new ims.core.vo.ActivitySchedVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.resource.place.domain.objects.Activity domainObject = (ims.core.resource.place.domain.objects.Activity) iterator.next();
			ims.core.vo.ActivitySchedVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.resource.place.domain.objects.Activity objects.
	 */
	public static ims.core.vo.ActivitySchedVoCollection createActivitySchedVoCollectionFromActivity(java.util.List domainObjectList) 
	{
		return createActivitySchedVoCollectionFromActivity(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.resource.place.domain.objects.Activity objects.
	 */
	public static ims.core.vo.ActivitySchedVoCollection createActivitySchedVoCollectionFromActivity(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.ActivitySchedVoCollection voList = new ims.core.vo.ActivitySchedVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.resource.place.domain.objects.Activity domainObject = (ims.core.resource.place.domain.objects.Activity) domainObjectList.get(i);
			ims.core.vo.ActivitySchedVo vo = create(map, domainObject);

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
	 * Create the ims.core.resource.place.domain.objects.Activity set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractActivitySet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ActivitySchedVoCollection voCollection) 
	 {
	 	return extractActivitySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractActivitySet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ActivitySchedVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.ActivitySchedVo vo = voCollection.get(i);
			ims.core.resource.place.domain.objects.Activity domainObject = ActivitySchedVoAssembler.extractActivity(domainFactory, vo, domMap);

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
	 * Create the ims.core.resource.place.domain.objects.Activity list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractActivityList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ActivitySchedVoCollection voCollection) 
	 {
	 	return extractActivityList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractActivityList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ActivitySchedVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.ActivitySchedVo vo = voCollection.get(i);
			ims.core.resource.place.domain.objects.Activity domainObject = ActivitySchedVoAssembler.extractActivity(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.resource.place.domain.objects.Activity object.
	 * @param domainObject ims.core.resource.place.domain.objects.Activity
	 */
	 public static ims.core.vo.ActivitySchedVo create(ims.core.resource.place.domain.objects.Activity domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.resource.place.domain.objects.Activity object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.ActivitySchedVo create(DomainObjectMap map, ims.core.resource.place.domain.objects.Activity domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.ActivitySchedVo valueObject = (ims.core.vo.ActivitySchedVo) map.getValueObject(domainObject, ims.core.vo.ActivitySchedVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.ActivitySchedVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.resource.place.domain.objects.Activity
	 */
	 public static ims.core.vo.ActivitySchedVo insert(ims.core.vo.ActivitySchedVo valueObject, ims.core.resource.place.domain.objects.Activity domainObject) 
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
	 * @param domainObject ims.core.resource.place.domain.objects.Activity
	 */
	 public static ims.core.vo.ActivitySchedVo insert(DomainObjectMap map, ims.core.vo.ActivitySchedVo valueObject, ims.core.resource.place.domain.objects.Activity domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Activity(domainObject.getId());
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
			
		// IntReq
		valueObject.setIntReq(domainObject.getIntReq());
		// isPatReq
		valueObject.setIsPatReq( domainObject.isIsPatReq() );
		// isScheduled
		valueObject.setIsScheduled( domainObject.isIsScheduled() );
		// Reason
		ims.domain.lookups.LookupInstance instance4 = domainObject.getReason();
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

			ims.core.vo.lookups.ActivityReason voLookup4 = new ims.core.vo.lookups.ActivityReason(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.ActivityReason parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.ActivityReason(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setReason(voLookup4);
		}
				// ActivityImage
		valueObject.setActivityImage(ims.admin.vo.domain.AppImageVoAssembler.create(map, domainObject.getActivityImage()) );
		// SpecialRequirements
		java.util.List listSpecialRequirements = domainObject.getSpecialRequirements();
		ims.core.vo.lookups.ActivitySpecRequirementsCollection SpecialRequirements = new ims.core.vo.lookups.ActivitySpecRequirementsCollection();
		for(java.util.Iterator iterator = listSpecialRequirements.iterator(); iterator.hasNext(); ) 
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
			ims.core.vo.lookups.ActivitySpecRequirements voInstance = new ims.core.vo.lookups.ActivitySpecRequirements(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.core.vo.lookups.ActivitySpecRequirements parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.core.vo.lookups.ActivitySpecRequirements(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			SpecialRequirements.add(voInstance);
		}
		valueObject.setSpecialRequirements( SpecialRequirements );
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// ActivityType
		ims.domain.lookups.LookupInstance instance8 = domainObject.getActivityType();
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

			ims.core.vo.lookups.ActivityType voLookup8 = new ims.core.vo.lookups.ActivityType(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.ActivityType parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.ActivityType(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setActivityType(voLookup8);
		}
				// isWorkQueue
		valueObject.setIsWorkQueue( domainObject.isIsWorkQueue() );
		// Description
		valueObject.setDescription(domainObject.getDescription());
		// status
		ims.domain.lookups.LookupInstance instance11 = domainObject.getStatus();
		if ( null != instance11 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance11.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance11.getImage().getImageId(), instance11.getImage().getImagePath());
			}
			color = instance11.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.ActivityStatus voLookup11 = new ims.core.vo.lookups.ActivityStatus(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.core.vo.lookups.ActivityStatus parentVoLookup11 = voLookup11;
			ims.domain.lookups.LookupInstance parent11 = instance11.getParent();
			while (parent11 != null)
			{
				if (parent11.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent11.getImage().getImageId(), parent11.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent11.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup11.setParent(new ims.core.vo.lookups.ActivityStatus(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setStatus(voLookup11);
		}
				// CodeMappings
		valueObject.setCodeMappings(ims.core.vo.domain.TaxonomyMapAssembler.createTaxonomyMapCollectionFromTaxonomyMap(map, domainObject.getCodeMappings()) );
		// FirstAppointment
		valueObject.setFirstAppointment( domainObject.isFirstAppointment() );
		// Diagnostic
		valueObject.setDiagnostic( domainObject.isDiagnostic() );
		// Name
		valueObject.setName(domainObject.getName());
		// TmReq
		valueObject.setTmReq(domainObject.getTmReq());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.resource.place.domain.objects.Activity extractActivity(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ActivitySchedVo valueObject) 
	{
		return 	extractActivity(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.resource.place.domain.objects.Activity extractActivity(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ActivitySchedVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Activity();
		ims.core.resource.place.domain.objects.Activity domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.resource.place.domain.objects.Activity)domMap.get(valueObject);
			}
			// ims.core.vo.ActivitySchedVo ID_Activity field is unknown
			domainObject = new ims.core.resource.place.domain.objects.Activity();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Activity());
			if (domMap.get(key) != null)
			{
				return (ims.core.resource.place.domain.objects.Activity)domMap.get(key);
			}
			domainObject = (ims.core.resource.place.domain.objects.Activity) domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Activity.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Activity());

		domainObject.setIntReq(valueObject.getIntReq());
		domainObject.setIsPatReq(valueObject.getIsPatReq());
		domainObject.setIsScheduled(valueObject.getIsScheduled());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getReason() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getReason().getID());
		}
		domainObject.setReason(value4);
		domainObject.setActivityImage(ims.admin.vo.domain.AppImageVoAssembler.extractAppImage(domainFactory, valueObject.getActivityImage(), domMap));
		ims.core.vo.lookups.ActivitySpecRequirementsCollection collection6 =
	valueObject.getSpecialRequirements();
	    java.util.List domainSpecialRequirements = domainObject.getSpecialRequirements();;			
	    int collection6Size=0;
		if (collection6 == null)
		{
			domainSpecialRequirements = new java.util.ArrayList(0);
		}
		else
		{
			collection6Size = collection6.size();
		}
		
		for(int i=0; i<collection6Size; i++) 
		{
			int instanceId = collection6.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainSpecialRequirements.indexOf(dom);
			if (domIdx == -1)
			{
				domainSpecialRequirements.add(i, dom);
			}
			else if (i != domIdx && i < domainSpecialRequirements.size())
			{
				Object tmp = domainSpecialRequirements.get(i);
				domainSpecialRequirements.set(i, domainSpecialRequirements.get(domIdx));
				domainSpecialRequirements.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j6 = domainSpecialRequirements.size();
		while (j6 > collection6Size)
		{
			domainSpecialRequirements.remove(j6-1);
			j6 = domainSpecialRequirements.size();
		}

		domainObject.setSpecialRequirements(domainSpecialRequirements);		
		domainObject.setIsActive(valueObject.getIsActive());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getActivityType() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getActivityType().getID());
		}
		domainObject.setActivityType(value8);
		domainObject.setIsWorkQueue(valueObject.getIsWorkQueue());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDescription() != null && valueObject.getDescription().equals(""))
		{
			valueObject.setDescription(null);
		}
		domainObject.setDescription(valueObject.getDescription());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value11);
		domainObject.setCodeMappings(ims.core.vo.domain.TaxonomyMapAssembler.extractTaxonomyMapList(domainFactory, valueObject.getCodeMappings(), domainObject.getCodeMappings(), domMap));		
		domainObject.setFirstAppointment(valueObject.getFirstAppointment());
		domainObject.setDiagnostic(valueObject.getDiagnostic());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());
		domainObject.setTmReq(valueObject.getTmReq());

		return domainObject;
	}

}
