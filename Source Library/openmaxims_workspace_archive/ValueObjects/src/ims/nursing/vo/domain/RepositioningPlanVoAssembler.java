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
 * @author Charlotte Murphy
 */
public class RepositioningPlanVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.nursing.vo.RepositioningPlanVo copy(ims.nursing.vo.RepositioningPlanVo valueObjectDest, ims.nursing.vo.RepositioningPlanVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_RepositioningPlan(valueObjectSrc.getID_RepositioningPlan());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// PositioningFreq
		valueObjectDest.setPositioningFreq(valueObjectSrc.getPositioningFreq());
		// Position
		valueObjectDest.setPosition(valueObjectSrc.getPosition());
		// SkinToleranceTest
		valueObjectDest.setSkinToleranceTest(valueObjectSrc.getSkinToleranceTest());
		// Blanching
		valueObjectDest.setBlanching(valueObjectSrc.getBlanching());
		// PositioningSuitable
		valueObjectDest.setPositioningSuitable(valueObjectSrc.getPositioningSuitable());
		// Comment
		valueObjectDest.setComment(valueObjectSrc.getComment());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createRepositioningPlanVoCollectionFromRepositioningPlan(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.nursing.domain.objects.RepositioningPlan objects.
	 */
	public static ims.nursing.vo.RepositioningPlanVoCollection createRepositioningPlanVoCollectionFromRepositioningPlan(java.util.Set domainObjectSet)	
	{
		return createRepositioningPlanVoCollectionFromRepositioningPlan(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.nursing.domain.objects.RepositioningPlan objects.
	 */
	public static ims.nursing.vo.RepositioningPlanVoCollection createRepositioningPlanVoCollectionFromRepositioningPlan(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.nursing.vo.RepositioningPlanVoCollection voList = new ims.nursing.vo.RepositioningPlanVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.nursing.domain.objects.RepositioningPlan domainObject = (ims.nursing.domain.objects.RepositioningPlan) iterator.next();
			ims.nursing.vo.RepositioningPlanVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.nursing.domain.objects.RepositioningPlan objects.
	 */
	public static ims.nursing.vo.RepositioningPlanVoCollection createRepositioningPlanVoCollectionFromRepositioningPlan(java.util.List domainObjectList) 
	{
		return createRepositioningPlanVoCollectionFromRepositioningPlan(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.nursing.domain.objects.RepositioningPlan objects.
	 */
	public static ims.nursing.vo.RepositioningPlanVoCollection createRepositioningPlanVoCollectionFromRepositioningPlan(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.nursing.vo.RepositioningPlanVoCollection voList = new ims.nursing.vo.RepositioningPlanVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.nursing.domain.objects.RepositioningPlan domainObject = (ims.nursing.domain.objects.RepositioningPlan) domainObjectList.get(i);
			ims.nursing.vo.RepositioningPlanVo vo = create(map, domainObject);

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
	 * Create the ims.nursing.domain.objects.RepositioningPlan set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractRepositioningPlanSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.RepositioningPlanVoCollection voCollection) 
	 {
	 	return extractRepositioningPlanSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractRepositioningPlanSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.RepositioningPlanVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.RepositioningPlanVo vo = voCollection.get(i);
			ims.nursing.domain.objects.RepositioningPlan domainObject = RepositioningPlanVoAssembler.extractRepositioningPlan(domainFactory, vo, domMap);

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
	 * Create the ims.nursing.domain.objects.RepositioningPlan list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractRepositioningPlanList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.RepositioningPlanVoCollection voCollection) 
	 {
	 	return extractRepositioningPlanList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractRepositioningPlanList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.RepositioningPlanVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.RepositioningPlanVo vo = voCollection.get(i);
			ims.nursing.domain.objects.RepositioningPlan domainObject = RepositioningPlanVoAssembler.extractRepositioningPlan(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.nursing.domain.objects.RepositioningPlan object.
	 * @param domainObject ims.nursing.domain.objects.RepositioningPlan
	 */
	 public static ims.nursing.vo.RepositioningPlanVo create(ims.nursing.domain.objects.RepositioningPlan domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.nursing.domain.objects.RepositioningPlan object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.nursing.vo.RepositioningPlanVo create(DomainObjectMap map, ims.nursing.domain.objects.RepositioningPlan domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.nursing.vo.RepositioningPlanVo valueObject = (ims.nursing.vo.RepositioningPlanVo) map.getValueObject(domainObject, ims.nursing.vo.RepositioningPlanVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.nursing.vo.RepositioningPlanVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.nursing.domain.objects.RepositioningPlan
	 */
	 public static ims.nursing.vo.RepositioningPlanVo insert(ims.nursing.vo.RepositioningPlanVo valueObject, ims.nursing.domain.objects.RepositioningPlan domainObject) 
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
	 * @param domainObject ims.nursing.domain.objects.RepositioningPlan
	 */
	 public static ims.nursing.vo.RepositioningPlanVo insert(DomainObjectMap map, ims.nursing.vo.RepositioningPlanVo valueObject, ims.nursing.domain.objects.RepositioningPlan domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_RepositioningPlan(domainObject.getId());
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
			
		// ClinicalContact
		if (domainObject.getClinicalContact() != null)
		{
			if(domainObject.getClinicalContact() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getClinicalContact();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(id, -1));				
			}
			else
			{
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(domainObject.getClinicalContact().getId(), domainObject.getClinicalContact().getVersion()));
			}
		}
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
		// PositioningFreq
		ims.domain.lookups.LookupInstance instance4 = domainObject.getPositioningFreq();
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

			ims.nursing.vo.lookups.TurnsDuration voLookup4 = new ims.nursing.vo.lookups.TurnsDuration(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.nursing.vo.lookups.TurnsDuration parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.nursing.vo.lookups.TurnsDuration(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setPositioningFreq(voLookup4);
		}
				// Position
		java.util.List listPosition = domainObject.getPosition();
		ims.core.vo.lookups.PatientPositionCollection Position = new ims.core.vo.lookups.PatientPositionCollection();
		for(java.util.Iterator iterator = listPosition.iterator(); iterator.hasNext(); ) 
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
			ims.core.vo.lookups.PatientPosition voInstance = new ims.core.vo.lookups.PatientPosition(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.core.vo.lookups.PatientPosition parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.core.vo.lookups.PatientPosition(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			Position.add(voInstance);
		}
		valueObject.setPosition( Position );
		// SkinToleranceTest
		ims.domain.lookups.LookupInstance instance6 = domainObject.getSkinToleranceTest();
		if ( null != instance6 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance6.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance6.getImage().getImageId(), instance6.getImage().getImagePath());
			}
			color = instance6.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup6 = new ims.core.vo.lookups.YesNo(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup6 = voLookup6;
			ims.domain.lookups.LookupInstance parent6 = instance6.getParent();
			while (parent6 != null)
			{
				if (parent6.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent6.getImage().getImageId(), parent6.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent6.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup6.setParent(new ims.core.vo.lookups.YesNo(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setSkinToleranceTest(voLookup6);
		}
				// Blanching
		ims.domain.lookups.LookupInstance instance7 = domainObject.getBlanching();
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

			ims.nursing.vo.lookups.Blanching voLookup7 = new ims.nursing.vo.lookups.Blanching(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.nursing.vo.lookups.Blanching parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.nursing.vo.lookups.Blanching(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setBlanching(voLookup7);
		}
				// PositioningSuitable
		ims.domain.lookups.LookupInstance instance8 = domainObject.getPositioningSuitable();
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

			ims.core.vo.lookups.YesNo voLookup8 = new ims.core.vo.lookups.YesNo(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.YesNo(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setPositioningSuitable(voLookup8);
		}
				// Comment
		valueObject.setComment(domainObject.getComment());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.nursing.domain.objects.RepositioningPlan extractRepositioningPlan(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.RepositioningPlanVo valueObject) 
	{
		return 	extractRepositioningPlan(domainFactory, valueObject, new HashMap());
	}

	public static ims.nursing.domain.objects.RepositioningPlan extractRepositioningPlan(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.RepositioningPlanVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_RepositioningPlan();
		ims.nursing.domain.objects.RepositioningPlan domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.nursing.domain.objects.RepositioningPlan)domMap.get(valueObject);
			}
			// ims.nursing.vo.RepositioningPlanVo ID_RepositioningPlan field is unknown
			domainObject = new ims.nursing.domain.objects.RepositioningPlan();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_RepositioningPlan());
			if (domMap.get(key) != null)
			{
				return (ims.nursing.domain.objects.RepositioningPlan)domMap.get(key);
			}
			domainObject = (ims.nursing.domain.objects.RepositioningPlan) domainFactory.getDomainObject(ims.nursing.domain.objects.RepositioningPlan.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_RepositioningPlan());

		ims.core.admin.domain.objects.ClinicalContact value1 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value1 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getClinicalContact();	
			}
			else
			{
				value1 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value1);
		ims.core.admin.domain.objects.CareContext value2 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value2 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getCareContext();	
			}
			else
			{
				value2 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value2);
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getPositioningFreq() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getPositioningFreq().getID());
		}
		domainObject.setPositioningFreq(value4);
		ims.core.vo.lookups.PatientPositionCollection collection5 =
	valueObject.getPosition();
	    java.util.List domainPosition = domainObject.getPosition();;			
	    int collection5Size=0;
		if (collection5 == null)
		{
			domainPosition = new java.util.ArrayList(0);
		}
		else
		{
			collection5Size = collection5.size();
		}
		
		for(int i=0; i<collection5Size; i++) 
		{
			int instanceId = collection5.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainPosition.indexOf(dom);
			if (domIdx == -1)
			{
				domainPosition.add(i, dom);
			}
			else if (i != domIdx && i < domainPosition.size())
			{
				Object tmp = domainPosition.get(i);
				domainPosition.set(i, domainPosition.get(domIdx));
				domainPosition.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j5 = domainPosition.size();
		while (j5 > collection5Size)
		{
			domainPosition.remove(j5-1);
			j5 = domainPosition.size();
		}

		domainObject.setPosition(domainPosition);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getSkinToleranceTest() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getSkinToleranceTest().getID());
		}
		domainObject.setSkinToleranceTest(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getBlanching() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getBlanching().getID());
		}
		domainObject.setBlanching(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getPositioningSuitable() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getPositioningSuitable().getID());
		}
		domainObject.setPositioningSuitable(value8);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComment() != null && valueObject.getComment().equals(""))
		{
			valueObject.setComment(null);
		}
		domainObject.setComment(valueObject.getComment());

		return domainObject;
	}

}
