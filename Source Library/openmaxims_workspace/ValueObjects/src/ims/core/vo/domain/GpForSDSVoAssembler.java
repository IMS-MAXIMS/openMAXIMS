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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class GpForSDSVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.GpForSDSVo copy(ims.core.vo.GpForSDSVo valueObjectDest, ims.core.vo.GpForSDSVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Gp(valueObjectSrc.getID_Gp());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CodeMappings
		valueObjectDest.setCodeMappings(valueObjectSrc.getCodeMappings());
		// name
		valueObjectDest.setName(valueObjectSrc.getName());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createGpForSDSVoCollectionFromGp(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.resource.people.domain.objects.Gp objects.
	 */
	public static ims.core.vo.GpForSDSVoCollection createGpForSDSVoCollectionFromGp(java.util.Set domainObjectSet)	
	{
		return createGpForSDSVoCollectionFromGp(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.resource.people.domain.objects.Gp objects.
	 */
	public static ims.core.vo.GpForSDSVoCollection createGpForSDSVoCollectionFromGp(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.GpForSDSVoCollection voList = new ims.core.vo.GpForSDSVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.resource.people.domain.objects.Gp domainObject = (ims.core.resource.people.domain.objects.Gp) iterator.next();
			ims.core.vo.GpForSDSVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.resource.people.domain.objects.Gp objects.
	 */
	public static ims.core.vo.GpForSDSVoCollection createGpForSDSVoCollectionFromGp(java.util.List domainObjectList) 
	{
		return createGpForSDSVoCollectionFromGp(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.resource.people.domain.objects.Gp objects.
	 */
	public static ims.core.vo.GpForSDSVoCollection createGpForSDSVoCollectionFromGp(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.GpForSDSVoCollection voList = new ims.core.vo.GpForSDSVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.resource.people.domain.objects.Gp domainObject = (ims.core.resource.people.domain.objects.Gp) domainObjectList.get(i);
			ims.core.vo.GpForSDSVo vo = create(map, domainObject);

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
	 * Create the ims.core.resource.people.domain.objects.Gp set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractGpSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.GpForSDSVoCollection voCollection) 
	 {
	 	return extractGpSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractGpSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.GpForSDSVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.GpForSDSVo vo = voCollection.get(i);
			ims.core.resource.people.domain.objects.Gp domainObject = GpForSDSVoAssembler.extractGp(domainFactory, vo, domMap);

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
	 * Create the ims.core.resource.people.domain.objects.Gp list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractGpList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.GpForSDSVoCollection voCollection) 
	 {
	 	return extractGpList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractGpList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.GpForSDSVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.GpForSDSVo vo = voCollection.get(i);
			ims.core.resource.people.domain.objects.Gp domainObject = GpForSDSVoAssembler.extractGp(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.resource.people.domain.objects.Gp object.
	 * @param domainObject ims.core.resource.people.domain.objects.Gp
	 */
	 public static ims.core.vo.GpForSDSVo create(ims.core.resource.people.domain.objects.Gp domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.resource.people.domain.objects.Gp object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.GpForSDSVo create(DomainObjectMap map, ims.core.resource.people.domain.objects.Gp domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.GpForSDSVo valueObject = (ims.core.vo.GpForSDSVo) map.getValueObject(domainObject, ims.core.vo.GpForSDSVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.GpForSDSVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.resource.people.domain.objects.Gp
	 */
	 public static ims.core.vo.GpForSDSVo insert(ims.core.vo.GpForSDSVo valueObject, ims.core.resource.people.domain.objects.Gp domainObject) 
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
	 * @param domainObject ims.core.resource.people.domain.objects.Gp
	 */
	 public static ims.core.vo.GpForSDSVo insert(DomainObjectMap map, ims.core.vo.GpForSDSVo valueObject, ims.core.resource.people.domain.objects.Gp domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Gp(domainObject.getId());
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
			
		// CodeMappings
		valueObject.setCodeMappings(ims.core.vo.domain.TaxonomyMapAssembler.createTaxonomyMapCollectionFromTaxonomyMap(map, domainObject.getCodeMappings()) );
		// name
		valueObject.setName(ims.core.vo.domain.PersonNameAssembler.create(map, domainObject.getName()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.resource.people.domain.objects.Gp extractGp(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.GpForSDSVo valueObject) 
	{
		return 	extractGp(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.resource.people.domain.objects.Gp extractGp(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.GpForSDSVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Gp();
		ims.core.resource.people.domain.objects.Gp domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.resource.people.domain.objects.Gp)domMap.get(valueObject);
			}
			// ims.core.vo.GpForSDSVo ID_Gp field is unknown
			domainObject = new ims.core.resource.people.domain.objects.Gp();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Gp());
			if (domMap.get(key) != null)
			{
				return (ims.core.resource.people.domain.objects.Gp)domMap.get(key);
			}
			domainObject = (ims.core.resource.people.domain.objects.Gp) domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Gp.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Gp());


		// SaveAsRefVO treated as RefValueObject
		ims.core.clinical.vo.TaxonomyMapRefVoCollection refCollection1 = new ims.core.clinical.vo.TaxonomyMapRefVoCollection();
		if (valueObject.getCodeMappings() != null)
		{
			for (int i1=0; i1<valueObject.getCodeMappings().size(); i1++)
			{
				ims.core.clinical.vo.TaxonomyMapRefVo ref1 = (ims.core.clinical.vo.TaxonomyMapRefVo)valueObject.getCodeMappings().get(i1);
				refCollection1.add(ref1);
			}
		}
		int size1 = (null == refCollection1) ? 0 : refCollection1.size();		
		java.util.List domainCodeMappings1 = domainObject.getCodeMappings();
		if (domainCodeMappings1 == null)
		{
			domainCodeMappings1 = new java.util.ArrayList();
		}
		for(int i=0; i < size1; i++) 
		{
			ims.core.clinical.vo.TaxonomyMapRefVo vo = refCollection1.get(i);			
			ims.core.clinical.domain.objects.TaxonomyMap dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.clinical.domain.objects.TaxonomyMap)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.clinical.domain.objects.TaxonomyMap)domainFactory.getDomainObject( ims.core.clinical.domain.objects.TaxonomyMap.class, vo.getBoId());
				}
			}

			int domIdx = domainCodeMappings1.indexOf(dom);
			if (domIdx == -1)
			{
				domainCodeMappings1.add(i, dom);
			}
			else if (i != domIdx && i < domainCodeMappings1.size())
			{
				Object tmp = domainCodeMappings1.get(i);
				domainCodeMappings1.set(i, domainCodeMappings1.get(domIdx));
				domainCodeMappings1.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1 = domainCodeMappings1.size();
		while (i1 > size1)
		{
			domainCodeMappings1.remove(i1-1);
			i1 = domainCodeMappings1.size();
		}
		
		domainObject.setCodeMappings(domainCodeMappings1);		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.generic.domain.objects.PersonName value2 = null;
		if ( null != valueObject.getName() ) 
		{
			if (valueObject.getName().getBoId() == null)
			{
				if (domMap.get(valueObject.getName()) != null)
				{
					value2 = (ims.core.generic.domain.objects.PersonName)domMap.get(valueObject.getName());
				}
			}
			else
			{
				value2 = (ims.core.generic.domain.objects.PersonName)domainFactory.getDomainObject(ims.core.generic.domain.objects.PersonName.class, valueObject.getName().getBoId());
			}
		}
		domainObject.setName(value2);

		return domainObject;
	}

}
