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
public class PlasticSurgeryAndBurnsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.PlasticSurgeryAndBurnsVo copy(ims.clinical.vo.PlasticSurgeryAndBurnsVo valueObjectDest, ims.clinical.vo.PlasticSurgeryAndBurnsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PlasticSurgeryAndBurns(valueObjectSrc.getID_PlasticSurgeryAndBurns());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// AnaestheticType
		valueObjectDest.setAnaestheticType(valueObjectSrc.getAnaestheticType());
		// SkinForStorage
		valueObjectDest.setSkinForStorage(valueObjectSrc.getSkinForStorage());
		// ScheduledFirstDressingDate
		valueObjectDest.setScheduledFirstDressingDate(valueObjectSrc.getScheduledFirstDressingDate());
		// ScheduledSutureRemoval
		valueObjectDest.setScheduledSutureRemoval(valueObjectSrc.getScheduledSutureRemoval());
		// Surgeon
		valueObjectDest.setSurgeon(valueObjectSrc.getSurgeon());
		// isComplete
		valueObjectDest.setIsComplete(valueObjectSrc.getIsComplete());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPlasticSurgeryAndBurnsVoCollectionFromPlasticSurgeryAndBurns(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.edischarge.domain.objects.PlasticSurgeryAndBurns objects.
	 */
	public static ims.clinical.vo.PlasticSurgeryAndBurnsVoCollection createPlasticSurgeryAndBurnsVoCollectionFromPlasticSurgeryAndBurns(java.util.Set domainObjectSet)	
	{
		return createPlasticSurgeryAndBurnsVoCollectionFromPlasticSurgeryAndBurns(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.edischarge.domain.objects.PlasticSurgeryAndBurns objects.
	 */
	public static ims.clinical.vo.PlasticSurgeryAndBurnsVoCollection createPlasticSurgeryAndBurnsVoCollectionFromPlasticSurgeryAndBurns(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.PlasticSurgeryAndBurnsVoCollection voList = new ims.clinical.vo.PlasticSurgeryAndBurnsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.edischarge.domain.objects.PlasticSurgeryAndBurns domainObject = (ims.edischarge.domain.objects.PlasticSurgeryAndBurns) iterator.next();
			ims.clinical.vo.PlasticSurgeryAndBurnsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.edischarge.domain.objects.PlasticSurgeryAndBurns objects.
	 */
	public static ims.clinical.vo.PlasticSurgeryAndBurnsVoCollection createPlasticSurgeryAndBurnsVoCollectionFromPlasticSurgeryAndBurns(java.util.List domainObjectList) 
	{
		return createPlasticSurgeryAndBurnsVoCollectionFromPlasticSurgeryAndBurns(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.edischarge.domain.objects.PlasticSurgeryAndBurns objects.
	 */
	public static ims.clinical.vo.PlasticSurgeryAndBurnsVoCollection createPlasticSurgeryAndBurnsVoCollectionFromPlasticSurgeryAndBurns(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.PlasticSurgeryAndBurnsVoCollection voList = new ims.clinical.vo.PlasticSurgeryAndBurnsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.edischarge.domain.objects.PlasticSurgeryAndBurns domainObject = (ims.edischarge.domain.objects.PlasticSurgeryAndBurns) domainObjectList.get(i);
			ims.clinical.vo.PlasticSurgeryAndBurnsVo vo = create(map, domainObject);

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
	 * Create the ims.edischarge.domain.objects.PlasticSurgeryAndBurns set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPlasticSurgeryAndBurnsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PlasticSurgeryAndBurnsVoCollection voCollection) 
	 {
	 	return extractPlasticSurgeryAndBurnsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPlasticSurgeryAndBurnsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PlasticSurgeryAndBurnsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.PlasticSurgeryAndBurnsVo vo = voCollection.get(i);
			ims.edischarge.domain.objects.PlasticSurgeryAndBurns domainObject = PlasticSurgeryAndBurnsVoAssembler.extractPlasticSurgeryAndBurns(domainFactory, vo, domMap);

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
	 * Create the ims.edischarge.domain.objects.PlasticSurgeryAndBurns list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPlasticSurgeryAndBurnsList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PlasticSurgeryAndBurnsVoCollection voCollection) 
	 {
	 	return extractPlasticSurgeryAndBurnsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPlasticSurgeryAndBurnsList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PlasticSurgeryAndBurnsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.PlasticSurgeryAndBurnsVo vo = voCollection.get(i);
			ims.edischarge.domain.objects.PlasticSurgeryAndBurns domainObject = PlasticSurgeryAndBurnsVoAssembler.extractPlasticSurgeryAndBurns(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.edischarge.domain.objects.PlasticSurgeryAndBurns object.
	 * @param domainObject ims.edischarge.domain.objects.PlasticSurgeryAndBurns
	 */
	 public static ims.clinical.vo.PlasticSurgeryAndBurnsVo create(ims.edischarge.domain.objects.PlasticSurgeryAndBurns domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.edischarge.domain.objects.PlasticSurgeryAndBurns object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.PlasticSurgeryAndBurnsVo create(DomainObjectMap map, ims.edischarge.domain.objects.PlasticSurgeryAndBurns domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.PlasticSurgeryAndBurnsVo valueObject = (ims.clinical.vo.PlasticSurgeryAndBurnsVo) map.getValueObject(domainObject, ims.clinical.vo.PlasticSurgeryAndBurnsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.PlasticSurgeryAndBurnsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.edischarge.domain.objects.PlasticSurgeryAndBurns
	 */
	 public static ims.clinical.vo.PlasticSurgeryAndBurnsVo insert(ims.clinical.vo.PlasticSurgeryAndBurnsVo valueObject, ims.edischarge.domain.objects.PlasticSurgeryAndBurns domainObject) 
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
	 * @param domainObject ims.edischarge.domain.objects.PlasticSurgeryAndBurns
	 */
	 public static ims.clinical.vo.PlasticSurgeryAndBurnsVo insert(DomainObjectMap map, ims.clinical.vo.PlasticSurgeryAndBurnsVo valueObject, ims.edischarge.domain.objects.PlasticSurgeryAndBurns domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PlasticSurgeryAndBurns(domainObject.getId());
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
		// AnaestheticType
		ims.domain.lookups.LookupInstance instance2 = domainObject.getAnaestheticType();
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

			ims.clinical.vo.lookups.AnaestheticType voLookup2 = new ims.clinical.vo.lookups.AnaestheticType(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.clinical.vo.lookups.AnaestheticType parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.clinical.vo.lookups.AnaestheticType(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setAnaestheticType(voLookup2);
		}
				// SkinForStorage
		ims.domain.lookups.LookupInstance instance3 = domainObject.getSkinForStorage();
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

			ims.core.vo.lookups.YesNo voLookup3 = new ims.core.vo.lookups.YesNo(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.YesNo(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setSkinForStorage(voLookup3);
		}
				// ScheduledFirstDressingDate
		java.util.Date ScheduledFirstDressingDate = domainObject.getScheduledFirstDressingDate();
		if ( null != ScheduledFirstDressingDate ) 
		{
			valueObject.setScheduledFirstDressingDate(new ims.framework.utils.Date(ScheduledFirstDressingDate) );
		}
		// ScheduledSutureRemoval
		java.util.Date ScheduledSutureRemoval = domainObject.getScheduledSutureRemoval();
		if ( null != ScheduledSutureRemoval ) 
		{
			valueObject.setScheduledSutureRemoval(new ims.framework.utils.Date(ScheduledSutureRemoval) );
		}
		// Surgeon
		valueObject.setSurgeon(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getSurgeon()) );
		// isComplete
		valueObject.setIsComplete( domainObject.isIsComplete() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.edischarge.domain.objects.PlasticSurgeryAndBurns extractPlasticSurgeryAndBurns(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PlasticSurgeryAndBurnsVo valueObject) 
	{
		return 	extractPlasticSurgeryAndBurns(domainFactory, valueObject, new HashMap());
	}

	public static ims.edischarge.domain.objects.PlasticSurgeryAndBurns extractPlasticSurgeryAndBurns(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PlasticSurgeryAndBurnsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PlasticSurgeryAndBurns();
		ims.edischarge.domain.objects.PlasticSurgeryAndBurns domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.edischarge.domain.objects.PlasticSurgeryAndBurns)domMap.get(valueObject);
			}
			// ims.clinical.vo.PlasticSurgeryAndBurnsVo ID_PlasticSurgeryAndBurns field is unknown
			domainObject = new ims.edischarge.domain.objects.PlasticSurgeryAndBurns();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PlasticSurgeryAndBurns());
			if (domMap.get(key) != null)
			{
				return (ims.edischarge.domain.objects.PlasticSurgeryAndBurns)domMap.get(key);
			}
			domainObject = (ims.edischarge.domain.objects.PlasticSurgeryAndBurns) domainFactory.getDomainObject(ims.edischarge.domain.objects.PlasticSurgeryAndBurns.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PlasticSurgeryAndBurns());

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
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getAnaestheticType() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getAnaestheticType().getID());
		}
		domainObject.setAnaestheticType(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getSkinForStorage() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getSkinForStorage().getID());
		}
		domainObject.setSkinForStorage(value3);
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getScheduledFirstDressingDate();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setScheduledFirstDressingDate(value4);
		java.util.Date value5 = null;
		ims.framework.utils.Date date5 = valueObject.getScheduledSutureRemoval();		
		if ( date5 != null ) 
		{
			value5 = date5.getDate();
		}
		domainObject.setScheduledSutureRemoval(value5);
		domainObject.setSurgeon(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getSurgeon(), domMap));
		domainObject.setIsComplete(valueObject.getIsComplete());

		return domainObject;
	}

}
