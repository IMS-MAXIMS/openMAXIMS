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
package ims.emergency.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Florin Blindu
 */
public class MandatoryEDOutcomeCodingVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.MandatoryEDOutcomeCodingVo copy(ims.emergency.vo.MandatoryEDOutcomeCodingVo valueObjectDest, ims.emergency.vo.MandatoryEDOutcomeCodingVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_MandatoryEDOutcomeCoding(valueObjectSrc.getID_MandatoryEDOutcomeCoding());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CodingOutcomes
		valueObjectDest.setCodingOutcomes(valueObjectSrc.getCodingOutcomes());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createMandatoryEDOutcomeCodingVoCollectionFromMandatoryEDOutcomeCoding(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.emergency.configuration.domain.objects.MandatoryEDOutcomeCoding objects.
	 */
	public static ims.emergency.vo.MandatoryEDOutcomeCodingVoCollection createMandatoryEDOutcomeCodingVoCollectionFromMandatoryEDOutcomeCoding(java.util.Set domainObjectSet)	
	{
		return createMandatoryEDOutcomeCodingVoCollectionFromMandatoryEDOutcomeCoding(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.emergency.configuration.domain.objects.MandatoryEDOutcomeCoding objects.
	 */
	public static ims.emergency.vo.MandatoryEDOutcomeCodingVoCollection createMandatoryEDOutcomeCodingVoCollectionFromMandatoryEDOutcomeCoding(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.MandatoryEDOutcomeCodingVoCollection voList = new ims.emergency.vo.MandatoryEDOutcomeCodingVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.emergency.configuration.domain.objects.MandatoryEDOutcomeCoding domainObject = (ims.emergency.configuration.domain.objects.MandatoryEDOutcomeCoding) iterator.next();
			ims.emergency.vo.MandatoryEDOutcomeCodingVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.emergency.configuration.domain.objects.MandatoryEDOutcomeCoding objects.
	 */
	public static ims.emergency.vo.MandatoryEDOutcomeCodingVoCollection createMandatoryEDOutcomeCodingVoCollectionFromMandatoryEDOutcomeCoding(java.util.List domainObjectList) 
	{
		return createMandatoryEDOutcomeCodingVoCollectionFromMandatoryEDOutcomeCoding(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.emergency.configuration.domain.objects.MandatoryEDOutcomeCoding objects.
	 */
	public static ims.emergency.vo.MandatoryEDOutcomeCodingVoCollection createMandatoryEDOutcomeCodingVoCollectionFromMandatoryEDOutcomeCoding(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.MandatoryEDOutcomeCodingVoCollection voList = new ims.emergency.vo.MandatoryEDOutcomeCodingVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.emergency.configuration.domain.objects.MandatoryEDOutcomeCoding domainObject = (ims.emergency.configuration.domain.objects.MandatoryEDOutcomeCoding) domainObjectList.get(i);
			ims.emergency.vo.MandatoryEDOutcomeCodingVo vo = create(map, domainObject);

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
	 * Create the ims.emergency.configuration.domain.objects.MandatoryEDOutcomeCoding set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractMandatoryEDOutcomeCodingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.MandatoryEDOutcomeCodingVoCollection voCollection) 
	 {
	 	return extractMandatoryEDOutcomeCodingSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractMandatoryEDOutcomeCodingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.MandatoryEDOutcomeCodingVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.MandatoryEDOutcomeCodingVo vo = voCollection.get(i);
			ims.emergency.configuration.domain.objects.MandatoryEDOutcomeCoding domainObject = MandatoryEDOutcomeCodingVoAssembler.extractMandatoryEDOutcomeCoding(domainFactory, vo, domMap);

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
	 * Create the ims.emergency.configuration.domain.objects.MandatoryEDOutcomeCoding list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractMandatoryEDOutcomeCodingList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.MandatoryEDOutcomeCodingVoCollection voCollection) 
	 {
	 	return extractMandatoryEDOutcomeCodingList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractMandatoryEDOutcomeCodingList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.MandatoryEDOutcomeCodingVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.MandatoryEDOutcomeCodingVo vo = voCollection.get(i);
			ims.emergency.configuration.domain.objects.MandatoryEDOutcomeCoding domainObject = MandatoryEDOutcomeCodingVoAssembler.extractMandatoryEDOutcomeCoding(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.emergency.configuration.domain.objects.MandatoryEDOutcomeCoding object.
	 * @param domainObject ims.emergency.configuration.domain.objects.MandatoryEDOutcomeCoding
	 */
	 public static ims.emergency.vo.MandatoryEDOutcomeCodingVo create(ims.emergency.configuration.domain.objects.MandatoryEDOutcomeCoding domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.emergency.configuration.domain.objects.MandatoryEDOutcomeCoding object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.emergency.vo.MandatoryEDOutcomeCodingVo create(DomainObjectMap map, ims.emergency.configuration.domain.objects.MandatoryEDOutcomeCoding domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.MandatoryEDOutcomeCodingVo valueObject = (ims.emergency.vo.MandatoryEDOutcomeCodingVo) map.getValueObject(domainObject, ims.emergency.vo.MandatoryEDOutcomeCodingVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.MandatoryEDOutcomeCodingVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.emergency.configuration.domain.objects.MandatoryEDOutcomeCoding
	 */
	 public static ims.emergency.vo.MandatoryEDOutcomeCodingVo insert(ims.emergency.vo.MandatoryEDOutcomeCodingVo valueObject, ims.emergency.configuration.domain.objects.MandatoryEDOutcomeCoding domainObject) 
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
	 * @param domainObject ims.emergency.configuration.domain.objects.MandatoryEDOutcomeCoding
	 */
	 public static ims.emergency.vo.MandatoryEDOutcomeCodingVo insert(DomainObjectMap map, ims.emergency.vo.MandatoryEDOutcomeCodingVo valueObject, ims.emergency.configuration.domain.objects.MandatoryEDOutcomeCoding domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_MandatoryEDOutcomeCoding(domainObject.getId());
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
			
		// CodingOutcomes
		java.util.List listCodingOutcomes = domainObject.getCodingOutcomes();
		ims.emergency.vo.lookups.AttendanceOutcomeCollection CodingOutcomes = new ims.emergency.vo.lookups.AttendanceOutcomeCollection();
		for(java.util.Iterator iterator = listCodingOutcomes.iterator(); iterator.hasNext(); ) 
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
			ims.emergency.vo.lookups.AttendanceOutcome voInstance = new ims.emergency.vo.lookups.AttendanceOutcome(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.emergency.vo.lookups.AttendanceOutcome parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.emergency.vo.lookups.AttendanceOutcome(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			CodingOutcomes.add(voInstance);
		}
		valueObject.setCodingOutcomes( CodingOutcomes );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.emergency.configuration.domain.objects.MandatoryEDOutcomeCoding extractMandatoryEDOutcomeCoding(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.MandatoryEDOutcomeCodingVo valueObject) 
	{
		return 	extractMandatoryEDOutcomeCoding(domainFactory, valueObject, new HashMap());
	}

	public static ims.emergency.configuration.domain.objects.MandatoryEDOutcomeCoding extractMandatoryEDOutcomeCoding(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.MandatoryEDOutcomeCodingVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_MandatoryEDOutcomeCoding();
		ims.emergency.configuration.domain.objects.MandatoryEDOutcomeCoding domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.emergency.configuration.domain.objects.MandatoryEDOutcomeCoding)domMap.get(valueObject);
			}
			// ims.emergency.vo.MandatoryEDOutcomeCodingVo ID_MandatoryEDOutcomeCoding field is unknown
			domainObject = new ims.emergency.configuration.domain.objects.MandatoryEDOutcomeCoding();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_MandatoryEDOutcomeCoding());
			if (domMap.get(key) != null)
			{
				return (ims.emergency.configuration.domain.objects.MandatoryEDOutcomeCoding)domMap.get(key);
			}
			domainObject = (ims.emergency.configuration.domain.objects.MandatoryEDOutcomeCoding) domainFactory.getDomainObject(ims.emergency.configuration.domain.objects.MandatoryEDOutcomeCoding.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_MandatoryEDOutcomeCoding());

		ims.emergency.vo.lookups.AttendanceOutcomeCollection collection1 =
	valueObject.getCodingOutcomes();
	    java.util.List domainCodingOutcomes = domainObject.getCodingOutcomes();;			
	    int collection1Size=0;
		if (collection1 == null)
		{
			domainCodingOutcomes = new java.util.ArrayList(0);
		}
		else
		{
			collection1Size = collection1.size();
		}
		
		for(int i=0; i<collection1Size; i++) 
		{
			int instanceId = collection1.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainCodingOutcomes.indexOf(dom);
			if (domIdx == -1)
			{
				domainCodingOutcomes.add(i, dom);
			}
			else if (i != domIdx && i < domainCodingOutcomes.size())
			{
				Object tmp = domainCodingOutcomes.get(i);
				domainCodingOutcomes.set(i, domainCodingOutcomes.get(domIdx));
				domainCodingOutcomes.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j1 = domainCodingOutcomes.size();
		while (j1 > collection1Size)
		{
			domainCodingOutcomes.remove(j1-1);
			j1 = domainCodingOutcomes.size();
		}

		domainObject.setCodingOutcomes(domainCodingOutcomes);		

		return domainObject;
	}

}
