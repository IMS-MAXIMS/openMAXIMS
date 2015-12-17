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
package ims.ocrr.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Bogdan Tofei
 */
public class AnalyteConfigurationVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.AnalyteConfigurationVo copy(ims.ocrr.vo.AnalyteConfigurationVo valueObjectDest, ims.ocrr.vo.AnalyteConfigurationVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Analyte(valueObjectSrc.getID_Analyte());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// analyteExtCode
		valueObjectDest.setAnalyteExtCode(valueObjectSrc.getAnalyteExtCode());
		// analyteExtText
		valueObjectDest.setAnalyteExtText(valueObjectSrc.getAnalyteExtText());
		// ProviderSystem
		valueObjectDest.setProviderSystem(valueObjectSrc.getProviderSystem());
		// Service
		valueObjectDest.setService(valueObjectSrc.getService());
		// DatasetType
		valueObjectDest.setDatasetType(valueObjectSrc.getDatasetType());
		// LocationService
		valueObjectDest.setLocationService(valueObjectSrc.getLocationService());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createAnalyteConfigurationVoCollectionFromAnalyte(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.configuration.domain.objects.Analyte objects.
	 */
	public static ims.ocrr.vo.AnalyteConfigurationVoCollection createAnalyteConfigurationVoCollectionFromAnalyte(java.util.Set domainObjectSet)	
	{
		return createAnalyteConfigurationVoCollectionFromAnalyte(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.configuration.domain.objects.Analyte objects.
	 */
	public static ims.ocrr.vo.AnalyteConfigurationVoCollection createAnalyteConfigurationVoCollectionFromAnalyte(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.AnalyteConfigurationVoCollection voList = new ims.ocrr.vo.AnalyteConfigurationVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ocrr.configuration.domain.objects.Analyte domainObject = (ims.ocrr.configuration.domain.objects.Analyte) iterator.next();
			ims.ocrr.vo.AnalyteConfigurationVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.ocrr.configuration.domain.objects.Analyte objects.
	 */
	public static ims.ocrr.vo.AnalyteConfigurationVoCollection createAnalyteConfigurationVoCollectionFromAnalyte(java.util.List domainObjectList) 
	{
		return createAnalyteConfigurationVoCollectionFromAnalyte(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.configuration.domain.objects.Analyte objects.
	 */
	public static ims.ocrr.vo.AnalyteConfigurationVoCollection createAnalyteConfigurationVoCollectionFromAnalyte(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.AnalyteConfigurationVoCollection voList = new ims.ocrr.vo.AnalyteConfigurationVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.configuration.domain.objects.Analyte domainObject = (ims.ocrr.configuration.domain.objects.Analyte) domainObjectList.get(i);
			ims.ocrr.vo.AnalyteConfigurationVo vo = create(map, domainObject);

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
	 * Create the ims.ocrr.configuration.domain.objects.Analyte set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractAnalyteSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.AnalyteConfigurationVoCollection voCollection) 
	 {
	 	return extractAnalyteSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractAnalyteSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.AnalyteConfigurationVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.AnalyteConfigurationVo vo = voCollection.get(i);
			ims.ocrr.configuration.domain.objects.Analyte domainObject = AnalyteConfigurationVoAssembler.extractAnalyte(domainFactory, vo, domMap);

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
	 * Create the ims.ocrr.configuration.domain.objects.Analyte list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractAnalyteList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.AnalyteConfigurationVoCollection voCollection) 
	 {
	 	return extractAnalyteList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractAnalyteList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.AnalyteConfigurationVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.AnalyteConfigurationVo vo = voCollection.get(i);
			ims.ocrr.configuration.domain.objects.Analyte domainObject = AnalyteConfigurationVoAssembler.extractAnalyte(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.ocrr.configuration.domain.objects.Analyte object.
	 * @param domainObject ims.ocrr.configuration.domain.objects.Analyte
	 */
	 public static ims.ocrr.vo.AnalyteConfigurationVo create(ims.ocrr.configuration.domain.objects.Analyte domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ocrr.configuration.domain.objects.Analyte object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ocrr.vo.AnalyteConfigurationVo create(DomainObjectMap map, ims.ocrr.configuration.domain.objects.Analyte domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.AnalyteConfigurationVo valueObject = (ims.ocrr.vo.AnalyteConfigurationVo) map.getValueObject(domainObject, ims.ocrr.vo.AnalyteConfigurationVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.AnalyteConfigurationVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ocrr.configuration.domain.objects.Analyte
	 */
	 public static ims.ocrr.vo.AnalyteConfigurationVo insert(ims.ocrr.vo.AnalyteConfigurationVo valueObject, ims.ocrr.configuration.domain.objects.Analyte domainObject) 
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
	 * @param domainObject ims.ocrr.configuration.domain.objects.Analyte
	 */
	 public static ims.ocrr.vo.AnalyteConfigurationVo insert(DomainObjectMap map, ims.ocrr.vo.AnalyteConfigurationVo valueObject, ims.ocrr.configuration.domain.objects.Analyte domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Analyte(domainObject.getId());
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
			
		// analyteExtCode
		valueObject.setAnalyteExtCode(domainObject.getAnalyteExtCode());
		// analyteExtText
		valueObject.setAnalyteExtText(domainObject.getAnalyteExtText());
		// ProviderSystem
		valueObject.setProviderSystem(ims.ocrr.vo.domain.ProviderSystemLiteVoAssembler.create(map, domainObject.getProviderSystem()) );
		// Service
		valueObject.setService(ims.core.vo.domain.ServiceLiteVoAssembler.create(map, domainObject.getService()) );
		// DatasetType
		valueObject.setDatasetType(ims.core.vo.domain.DataSetTypeForAnalyteConfigVoAssembler.create(map, domainObject.getDatasetType()) );
		// LocationService
		valueObject.setLocationService(ims.core.vo.domain.LocationServiceLiteVoAssembler.create(map, domainObject.getLocationService()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.configuration.domain.objects.Analyte extractAnalyte(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.AnalyteConfigurationVo valueObject) 
	{
		return 	extractAnalyte(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.configuration.domain.objects.Analyte extractAnalyte(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.AnalyteConfigurationVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Analyte();
		ims.ocrr.configuration.domain.objects.Analyte domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ocrr.configuration.domain.objects.Analyte)domMap.get(valueObject);
			}
			// ims.ocrr.vo.AnalyteConfigurationVo ID_Analyte field is unknown
			domainObject = new ims.ocrr.configuration.domain.objects.Analyte();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Analyte());
			if (domMap.get(key) != null)
			{
				return (ims.ocrr.configuration.domain.objects.Analyte)domMap.get(key);
			}
			domainObject = (ims.ocrr.configuration.domain.objects.Analyte) domainFactory.getDomainObject(ims.ocrr.configuration.domain.objects.Analyte.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Analyte());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAnalyteExtCode() != null && valueObject.getAnalyteExtCode().equals(""))
		{
			valueObject.setAnalyteExtCode(null);
		}
		domainObject.setAnalyteExtCode(valueObject.getAnalyteExtCode());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAnalyteExtText() != null && valueObject.getAnalyteExtText().equals(""))
		{
			valueObject.setAnalyteExtText(null);
		}
		domainObject.setAnalyteExtText(valueObject.getAnalyteExtText());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.ProviderSystem value3 = null;
		if ( null != valueObject.getProviderSystem() ) 
		{
			if (valueObject.getProviderSystem().getBoId() == null)
			{
				if (domMap.get(valueObject.getProviderSystem()) != null)
				{
					value3 = (ims.core.admin.domain.objects.ProviderSystem)domMap.get(valueObject.getProviderSystem());
				}
			}
			else
			{
				value3 = (ims.core.admin.domain.objects.ProviderSystem)domainFactory.getDomainObject(ims.core.admin.domain.objects.ProviderSystem.class, valueObject.getProviderSystem().getBoId());
			}
		}
		domainObject.setProviderSystem(value3);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Service value4 = null;
		if ( null != valueObject.getService() ) 
		{
			if (valueObject.getService().getBoId() == null)
			{
				if (domMap.get(valueObject.getService()) != null)
				{
					value4 = (ims.core.clinical.domain.objects.Service)domMap.get(valueObject.getService());
				}
			}
			else
			{
				value4 = (ims.core.clinical.domain.objects.Service)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Service.class, valueObject.getService().getBoId());
			}
		}
		domainObject.setService(value4);
		domainObject.setDatasetType(ims.core.vo.domain.DataSetTypeForAnalyteConfigVoAssembler.extractDatasetType(domainFactory, valueObject.getDatasetType(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.LocationService value6 = null;
		if ( null != valueObject.getLocationService() ) 
		{
			if (valueObject.getLocationService().getBoId() == null)
			{
				if (domMap.get(valueObject.getLocationService()) != null)
				{
					value6 = (ims.core.resource.place.domain.objects.LocationService)domMap.get(valueObject.getLocationService());
				}
			}
			else
			{
				value6 = (ims.core.resource.place.domain.objects.LocationService)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.LocationService.class, valueObject.getLocationService().getBoId());
			}
		}
		domainObject.setLocationService(value6);

		return domainObject;
	}

}
