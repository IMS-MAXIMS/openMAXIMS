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
package ims.ocrr.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class PathologyResultDetailsForCumulateResultsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.PathologyResultDetailsForCumulateResultsVo copy(ims.ocrr.vo.PathologyResultDetailsForCumulateResultsVo valueObjectDest, ims.ocrr.vo.PathologyResultDetailsForCumulateResultsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PathResultDetails(valueObjectSrc.getID_PathResultDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// isAbnormal
		valueObjectDest.setIsAbnormal(valueObjectSrc.getIsAbnormal());
		// ResultComponents
		valueObjectDest.setResultComponents(valueObjectSrc.getResultComponents());
		// OrderSpecimen
		valueObjectDest.setOrderSpecimen(valueObjectSrc.getOrderSpecimen());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPathologyResultDetailsForCumulateResultsVoCollectionFromPathResultDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.PathResultDetails objects.
	 */
	public static ims.ocrr.vo.PathologyResultDetailsForCumulateResultsVoCollection createPathologyResultDetailsForCumulateResultsVoCollectionFromPathResultDetails(java.util.Set domainObjectSet)	
	{
		return createPathologyResultDetailsForCumulateResultsVoCollectionFromPathResultDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.PathResultDetails objects.
	 */
	public static ims.ocrr.vo.PathologyResultDetailsForCumulateResultsVoCollection createPathologyResultDetailsForCumulateResultsVoCollectionFromPathResultDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.PathologyResultDetailsForCumulateResultsVoCollection voList = new ims.ocrr.vo.PathologyResultDetailsForCumulateResultsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ocrr.orderingresults.domain.objects.PathResultDetails domainObject = (ims.ocrr.orderingresults.domain.objects.PathResultDetails) iterator.next();
			ims.ocrr.vo.PathologyResultDetailsForCumulateResultsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.PathResultDetails objects.
	 */
	public static ims.ocrr.vo.PathologyResultDetailsForCumulateResultsVoCollection createPathologyResultDetailsForCumulateResultsVoCollectionFromPathResultDetails(java.util.List domainObjectList) 
	{
		return createPathologyResultDetailsForCumulateResultsVoCollectionFromPathResultDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.PathResultDetails objects.
	 */
	public static ims.ocrr.vo.PathologyResultDetailsForCumulateResultsVoCollection createPathologyResultDetailsForCumulateResultsVoCollectionFromPathResultDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.PathologyResultDetailsForCumulateResultsVoCollection voList = new ims.ocrr.vo.PathologyResultDetailsForCumulateResultsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.orderingresults.domain.objects.PathResultDetails domainObject = (ims.ocrr.orderingresults.domain.objects.PathResultDetails) domainObjectList.get(i);
			ims.ocrr.vo.PathologyResultDetailsForCumulateResultsVo vo = create(map, domainObject);

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
	 * Create the ims.ocrr.orderingresults.domain.objects.PathResultDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPathResultDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.PathologyResultDetailsForCumulateResultsVoCollection voCollection) 
	 {
	 	return extractPathResultDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPathResultDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.PathologyResultDetailsForCumulateResultsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.PathologyResultDetailsForCumulateResultsVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.PathResultDetails domainObject = PathologyResultDetailsForCumulateResultsVoAssembler.extractPathResultDetails(domainFactory, vo, domMap);

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
	 * Create the ims.ocrr.orderingresults.domain.objects.PathResultDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPathResultDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.PathologyResultDetailsForCumulateResultsVoCollection voCollection) 
	 {
	 	return extractPathResultDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPathResultDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.PathologyResultDetailsForCumulateResultsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.PathologyResultDetailsForCumulateResultsVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.PathResultDetails domainObject = PathologyResultDetailsForCumulateResultsVoAssembler.extractPathResultDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.PathResultDetails object.
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.PathResultDetails
	 */
	 public static ims.ocrr.vo.PathologyResultDetailsForCumulateResultsVo create(ims.ocrr.orderingresults.domain.objects.PathResultDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.PathResultDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ocrr.vo.PathologyResultDetailsForCumulateResultsVo create(DomainObjectMap map, ims.ocrr.orderingresults.domain.objects.PathResultDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.PathologyResultDetailsForCumulateResultsVo valueObject = (ims.ocrr.vo.PathologyResultDetailsForCumulateResultsVo) map.getValueObject(domainObject, ims.ocrr.vo.PathologyResultDetailsForCumulateResultsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.PathologyResultDetailsForCumulateResultsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.PathResultDetails
	 */
	 public static ims.ocrr.vo.PathologyResultDetailsForCumulateResultsVo insert(ims.ocrr.vo.PathologyResultDetailsForCumulateResultsVo valueObject, ims.ocrr.orderingresults.domain.objects.PathResultDetails domainObject) 
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
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.PathResultDetails
	 */
	 public static ims.ocrr.vo.PathologyResultDetailsForCumulateResultsVo insert(DomainObjectMap map, ims.ocrr.vo.PathologyResultDetailsForCumulateResultsVo valueObject, ims.ocrr.orderingresults.domain.objects.PathResultDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PathResultDetails(domainObject.getId());
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
			
		// isAbnormal
		valueObject.setIsAbnormal( domainObject.isIsAbnormal() );
		// ResultComponents
		valueObject.setResultComponents(ims.core.vo.domain.ChartResultVoAssembler.createChartResultVoCollectionFromResultComponent(map, domainObject.getResultComponents()) );
		// OrderSpecimen
		valueObject.setOrderSpecimen(ims.ocrr.vo.domain.OrderSpecimenLabSpecCommentsVoAssembler.create(map, domainObject.getOrderSpecimen()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.orderingresults.domain.objects.PathResultDetails extractPathResultDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.PathologyResultDetailsForCumulateResultsVo valueObject) 
	{
		return 	extractPathResultDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.orderingresults.domain.objects.PathResultDetails extractPathResultDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.PathologyResultDetailsForCumulateResultsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PathResultDetails();
		ims.ocrr.orderingresults.domain.objects.PathResultDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.PathResultDetails)domMap.get(valueObject);
			}
			// ims.ocrr.vo.PathologyResultDetailsForCumulateResultsVo ID_PathResultDetails field is unknown
			domainObject = new ims.ocrr.orderingresults.domain.objects.PathResultDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PathResultDetails());
			if (domMap.get(key) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.PathResultDetails)domMap.get(key);
			}
			domainObject = (ims.ocrr.orderingresults.domain.objects.PathResultDetails) domainFactory.getDomainObject(ims.ocrr.orderingresults.domain.objects.PathResultDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PathResultDetails());

		domainObject.setIsAbnormal(valueObject.getIsAbnormal());

		// SaveAsRefVO treated as RefValueObject
		ims.ocrr.orderingresults.vo.ResultComponentRefVoCollection refCollection2 = new ims.ocrr.orderingresults.vo.ResultComponentRefVoCollection();
		if (valueObject.getResultComponents() != null)
		{
			for (int i2=0; i2<valueObject.getResultComponents().size(); i2++)
			{
				ims.ocrr.orderingresults.vo.ResultComponentRefVo ref2 = (ims.ocrr.orderingresults.vo.ResultComponentRefVo)valueObject.getResultComponents().get(i2);
				refCollection2.add(ref2);
			}
		}
		int size2 = (null == refCollection2) ? 0 : refCollection2.size();		
		java.util.List domainResultComponents2 = domainObject.getResultComponents();
		if (domainResultComponents2 == null)
		{
			domainResultComponents2 = new java.util.ArrayList();
		}
		for(int i=0; i < size2; i++) 
		{
			ims.ocrr.orderingresults.vo.ResultComponentRefVo vo = refCollection2.get(i);			
			ims.ocrr.orderingresults.domain.objects.ResultComponent dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.ocrr.orderingresults.domain.objects.ResultComponent)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.ocrr.orderingresults.domain.objects.ResultComponent)domainFactory.getDomainObject( ims.ocrr.orderingresults.domain.objects.ResultComponent.class, vo.getBoId());
				}
			}

			int domIdx = domainResultComponents2.indexOf(dom);
			if (domIdx == -1)
			{
				domainResultComponents2.add(i, dom);
			}
			else if (i != domIdx && i < domainResultComponents2.size())
			{
				Object tmp = domainResultComponents2.get(i);
				domainResultComponents2.set(i, domainResultComponents2.get(domIdx));
				domainResultComponents2.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i2 = domainResultComponents2.size();
		while (i2 > size2)
		{
			domainResultComponents2.remove(i2-1);
			i2 = domainResultComponents2.size();
		}
		
		domainObject.setResultComponents(domainResultComponents2);		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.ocrr.orderingresults.domain.objects.OrderSpecimen value3 = null;
		if ( null != valueObject.getOrderSpecimen() ) 
		{
			if (valueObject.getOrderSpecimen().getBoId() == null)
			{
				if (domMap.get(valueObject.getOrderSpecimen()) != null)
				{
					value3 = (ims.ocrr.orderingresults.domain.objects.OrderSpecimen)domMap.get(valueObject.getOrderSpecimen());
				}
			}
			else
			{
				value3 = (ims.ocrr.orderingresults.domain.objects.OrderSpecimen)domainFactory.getDomainObject(ims.ocrr.orderingresults.domain.objects.OrderSpecimen.class, valueObject.getOrderSpecimen().getBoId());
			}
		}
		domainObject.setOrderSpecimen(value3);

		return domainObject;
	}

}
