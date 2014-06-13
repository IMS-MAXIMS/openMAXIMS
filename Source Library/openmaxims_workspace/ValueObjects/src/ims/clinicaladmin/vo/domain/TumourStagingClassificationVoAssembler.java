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
package ims.clinicaladmin.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Catalin Tomozei
 */
public class TumourStagingClassificationVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinicaladmin.vo.TumourStagingClassificationVo copy(ims.clinicaladmin.vo.TumourStagingClassificationVo valueObjectDest, ims.clinicaladmin.vo.TumourStagingClassificationVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_StagingClassification(valueObjectSrc.getID_StagingClassification());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// Values
		valueObjectDest.setValues(valueObjectSrc.getValues());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTumourStagingClassificationVoCollectionFromStagingClassification(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.configuration.domain.objects.StagingClassification objects.
	 */
	public static ims.clinicaladmin.vo.TumourStagingClassificationVoCollection createTumourStagingClassificationVoCollectionFromStagingClassification(java.util.Set domainObjectSet)	
	{
		return createTumourStagingClassificationVoCollectionFromStagingClassification(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.configuration.domain.objects.StagingClassification objects.
	 */
	public static ims.clinicaladmin.vo.TumourStagingClassificationVoCollection createTumourStagingClassificationVoCollectionFromStagingClassification(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinicaladmin.vo.TumourStagingClassificationVoCollection voList = new ims.clinicaladmin.vo.TumourStagingClassificationVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.oncology.configuration.domain.objects.StagingClassification domainObject = (ims.oncology.configuration.domain.objects.StagingClassification) iterator.next();
			ims.clinicaladmin.vo.TumourStagingClassificationVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.oncology.configuration.domain.objects.StagingClassification objects.
	 */
	public static ims.clinicaladmin.vo.TumourStagingClassificationVoCollection createTumourStagingClassificationVoCollectionFromStagingClassification(java.util.List domainObjectList) 
	{
		return createTumourStagingClassificationVoCollectionFromStagingClassification(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.configuration.domain.objects.StagingClassification objects.
	 */
	public static ims.clinicaladmin.vo.TumourStagingClassificationVoCollection createTumourStagingClassificationVoCollectionFromStagingClassification(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinicaladmin.vo.TumourStagingClassificationVoCollection voList = new ims.clinicaladmin.vo.TumourStagingClassificationVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.configuration.domain.objects.StagingClassification domainObject = (ims.oncology.configuration.domain.objects.StagingClassification) domainObjectList.get(i);
			ims.clinicaladmin.vo.TumourStagingClassificationVo vo = create(map, domainObject);

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
	 * Create the ims.oncology.configuration.domain.objects.StagingClassification set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractStagingClassificationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.TumourStagingClassificationVoCollection voCollection) 
	 {
	 	return extractStagingClassificationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractStagingClassificationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.TumourStagingClassificationVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinicaladmin.vo.TumourStagingClassificationVo vo = voCollection.get(i);
			ims.oncology.configuration.domain.objects.StagingClassification domainObject = TumourStagingClassificationVoAssembler.extractStagingClassification(domainFactory, vo, domMap);

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
	 * Create the ims.oncology.configuration.domain.objects.StagingClassification list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractStagingClassificationList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.TumourStagingClassificationVoCollection voCollection) 
	 {
	 	return extractStagingClassificationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractStagingClassificationList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.TumourStagingClassificationVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinicaladmin.vo.TumourStagingClassificationVo vo = voCollection.get(i);
			ims.oncology.configuration.domain.objects.StagingClassification domainObject = TumourStagingClassificationVoAssembler.extractStagingClassification(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.oncology.configuration.domain.objects.StagingClassification object.
	 * @param domainObject ims.oncology.configuration.domain.objects.StagingClassification
	 */
	 public static ims.clinicaladmin.vo.TumourStagingClassificationVo create(ims.oncology.configuration.domain.objects.StagingClassification domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.oncology.configuration.domain.objects.StagingClassification object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinicaladmin.vo.TumourStagingClassificationVo create(DomainObjectMap map, ims.oncology.configuration.domain.objects.StagingClassification domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinicaladmin.vo.TumourStagingClassificationVo valueObject = (ims.clinicaladmin.vo.TumourStagingClassificationVo) map.getValueObject(domainObject, ims.clinicaladmin.vo.TumourStagingClassificationVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinicaladmin.vo.TumourStagingClassificationVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.oncology.configuration.domain.objects.StagingClassification
	 */
	 public static ims.clinicaladmin.vo.TumourStagingClassificationVo insert(ims.clinicaladmin.vo.TumourStagingClassificationVo valueObject, ims.oncology.configuration.domain.objects.StagingClassification domainObject) 
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
	 * @param domainObject ims.oncology.configuration.domain.objects.StagingClassification
	 */
	 public static ims.clinicaladmin.vo.TumourStagingClassificationVo insert(DomainObjectMap map, ims.clinicaladmin.vo.TumourStagingClassificationVo valueObject, ims.oncology.configuration.domain.objects.StagingClassification domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_StagingClassification(domainObject.getId());
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
			
		// Name
		valueObject.setName(domainObject.getName());
		// Values
		valueObject.setValues(ims.clinicaladmin.vo.domain.OtherClassificationValueListVoAssembler.createOtherClassificationValueListVoCollectionFromOtherClassificationValue(map, domainObject.getValues()) );
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.configuration.domain.objects.StagingClassification extractStagingClassification(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.TumourStagingClassificationVo valueObject) 
	{
		return 	extractStagingClassification(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.configuration.domain.objects.StagingClassification extractStagingClassification(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.TumourStagingClassificationVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_StagingClassification();
		ims.oncology.configuration.domain.objects.StagingClassification domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.oncology.configuration.domain.objects.StagingClassification)domMap.get(valueObject);
			}
			// ims.clinicaladmin.vo.TumourStagingClassificationVo ID_StagingClassification field is unknown
			domainObject = new ims.oncology.configuration.domain.objects.StagingClassification();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_StagingClassification());
			if (domMap.get(key) != null)
			{
				return (ims.oncology.configuration.domain.objects.StagingClassification)domMap.get(key);
			}
			domainObject = (ims.oncology.configuration.domain.objects.StagingClassification) domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.StagingClassification.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_StagingClassification());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());

		// SaveAsRefVO treated as RefValueObject
		ims.oncology.configuration.vo.OtherClassificationValueRefVoCollection refCollection2 = new ims.oncology.configuration.vo.OtherClassificationValueRefVoCollection();
		if (valueObject.getValues() != null)
		{
			for (int i2=0; i2<valueObject.getValues().size(); i2++)
			{
				ims.oncology.configuration.vo.OtherClassificationValueRefVo ref2 = (ims.oncology.configuration.vo.OtherClassificationValueRefVo)valueObject.getValues().get(i2);
				refCollection2.add(ref2);
			}
		}
		int size2 = (null == refCollection2) ? 0 : refCollection2.size();		
		java.util.List domainValues2 = domainObject.getValues();
		if (domainValues2 == null)
		{
			domainValues2 = new java.util.ArrayList();
		}
		for(int i=0; i < size2; i++) 
		{
			ims.oncology.configuration.vo.OtherClassificationValueRefVo vo = refCollection2.get(i);			
			ims.oncology.configuration.domain.objects.OtherClassificationValue dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.oncology.configuration.domain.objects.OtherClassificationValue)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.oncology.configuration.domain.objects.OtherClassificationValue)domainFactory.getDomainObject( ims.oncology.configuration.domain.objects.OtherClassificationValue.class, vo.getBoId());
				}
			}

			int domIdx = domainValues2.indexOf(dom);
			if (domIdx == -1)
			{
				domainValues2.add(i, dom);
			}
			else if (i != domIdx && i < domainValues2.size())
			{
				Object tmp = domainValues2.get(i);
				domainValues2.set(i, domainValues2.get(domIdx));
				domainValues2.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i2 = domainValues2.size();
		while (i2 > size2)
		{
			domainValues2.remove(i2-1);
			i2 = domainValues2.size();
		}
		
		domainObject.setValues(domainValues2);		
		domainObject.setIsActive(valueObject.getIsActive());

		return domainObject;
	}

}
