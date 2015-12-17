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
package ims.ocs_if.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author John MacEnri
 */
public class IfAnalyteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocs_if.vo.IfAnalyteVo copy(ims.ocs_if.vo.IfAnalyteVo valueObjectDest, ims.ocs_if.vo.IfAnalyteVo valueObjectSrc) 
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
		// LocationService
		valueObjectDest.setLocationService(valueObjectSrc.getLocationService());
		// Service
		valueObjectDest.setService(valueObjectSrc.getService());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createIfAnalyteVoCollectionFromAnalyte(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.configuration.domain.objects.Analyte objects.
	 */
	public static ims.ocs_if.vo.IfAnalyteVoCollection createIfAnalyteVoCollectionFromAnalyte(java.util.Set domainObjectSet)	
	{
		return createIfAnalyteVoCollectionFromAnalyte(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.configuration.domain.objects.Analyte objects.
	 */
	public static ims.ocs_if.vo.IfAnalyteVoCollection createIfAnalyteVoCollectionFromAnalyte(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocs_if.vo.IfAnalyteVoCollection voList = new ims.ocs_if.vo.IfAnalyteVoCollection();
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
			ims.ocs_if.vo.IfAnalyteVo vo = create(map, domainObject);
			
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
	public static ims.ocs_if.vo.IfAnalyteVoCollection createIfAnalyteVoCollectionFromAnalyte(java.util.List domainObjectList) 
	{
		return createIfAnalyteVoCollectionFromAnalyte(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.configuration.domain.objects.Analyte objects.
	 */
	public static ims.ocs_if.vo.IfAnalyteVoCollection createIfAnalyteVoCollectionFromAnalyte(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocs_if.vo.IfAnalyteVoCollection voList = new ims.ocs_if.vo.IfAnalyteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.configuration.domain.objects.Analyte domainObject = (ims.ocrr.configuration.domain.objects.Analyte) domainObjectList.get(i);
			ims.ocs_if.vo.IfAnalyteVo vo = create(map, domainObject);

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
	 public static java.util.Set extractAnalyteSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfAnalyteVoCollection voCollection) 
	 {
	 	return extractAnalyteSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractAnalyteSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfAnalyteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocs_if.vo.IfAnalyteVo vo = voCollection.get(i);
			ims.ocrr.configuration.domain.objects.Analyte domainObject = IfAnalyteVoAssembler.extractAnalyte(domainFactory, vo, domMap);

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
	 public static java.util.List extractAnalyteList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfAnalyteVoCollection voCollection) 
	 {
	 	return extractAnalyteList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractAnalyteList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfAnalyteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocs_if.vo.IfAnalyteVo vo = voCollection.get(i);
			ims.ocrr.configuration.domain.objects.Analyte domainObject = IfAnalyteVoAssembler.extractAnalyte(domainFactory, vo, domMap);

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
	 public static ims.ocs_if.vo.IfAnalyteVo create(ims.ocrr.configuration.domain.objects.Analyte domainObject) 
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
	  public static ims.ocs_if.vo.IfAnalyteVo create(DomainObjectMap map, ims.ocrr.configuration.domain.objects.Analyte domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocs_if.vo.IfAnalyteVo valueObject = (ims.ocs_if.vo.IfAnalyteVo) map.getValueObject(domainObject, ims.ocs_if.vo.IfAnalyteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocs_if.vo.IfAnalyteVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.ocs_if.vo.IfAnalyteVo insert(ims.ocs_if.vo.IfAnalyteVo valueObject, ims.ocrr.configuration.domain.objects.Analyte domainObject) 
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
	 public static ims.ocs_if.vo.IfAnalyteVo insert(DomainObjectMap map, ims.ocs_if.vo.IfAnalyteVo valueObject, ims.ocrr.configuration.domain.objects.Analyte domainObject) 
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
		if (domainObject.getProviderSystem() != null)
		{
			if(domainObject.getProviderSystem() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getProviderSystem();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setProviderSystem(new ims.core.admin.vo.ProviderSystemRefVo(id, -1));				
			}
			else
			{
				valueObject.setProviderSystem(new ims.core.admin.vo.ProviderSystemRefVo(domainObject.getProviderSystem().getId(), domainObject.getProviderSystem().getVersion()));
			}
		}
		// LocationService
		if (domainObject.getLocationService() != null)
		{
			if(domainObject.getLocationService() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getLocationService();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setLocationService(new ims.core.resource.place.vo.LocationServiceRefVo(id, -1));				
			}
			else
			{
				valueObject.setLocationService(new ims.core.resource.place.vo.LocationServiceRefVo(domainObject.getLocationService().getId(), domainObject.getLocationService().getVersion()));
			}
		}
		// Service
		if (domainObject.getService() != null)
		{
			if(domainObject.getService() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getService();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setService(new ims.core.clinical.vo.ServiceRefVo(id, -1));				
			}
			else
			{
				valueObject.setService(new ims.core.clinical.vo.ServiceRefVo(domainObject.getService().getId(), domainObject.getService().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.configuration.domain.objects.Analyte extractAnalyte(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfAnalyteVo valueObject) 
	{
		return 	extractAnalyte(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.configuration.domain.objects.Analyte extractAnalyte(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfAnalyteVo valueObject, HashMap domMap) 
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
			// ims.ocs_if.vo.IfAnalyteVo ID_Analyte field is unknown
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
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getProviderSystem();	
			}
			else
			{
				value3 = (ims.core.admin.domain.objects.ProviderSystem)domainFactory.getDomainObject(ims.core.admin.domain.objects.ProviderSystem.class, valueObject.getProviderSystem().getBoId());
			}
		}
		domainObject.setProviderSystem(value3);
		ims.core.resource.place.domain.objects.LocationService value4 = null;
		if ( null != valueObject.getLocationService() ) 
		{
			if (valueObject.getLocationService().getBoId() == null)
			{
				if (domMap.get(valueObject.getLocationService()) != null)
				{
					value4 = (ims.core.resource.place.domain.objects.LocationService)domMap.get(valueObject.getLocationService());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getLocationService();	
			}
			else
			{
				value4 = (ims.core.resource.place.domain.objects.LocationService)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.LocationService.class, valueObject.getLocationService().getBoId());
			}
		}
		domainObject.setLocationService(value4);
		ims.core.clinical.domain.objects.Service value5 = null;
		if ( null != valueObject.getService() ) 
		{
			if (valueObject.getService().getBoId() == null)
			{
				if (domMap.get(valueObject.getService()) != null)
				{
					value5 = (ims.core.clinical.domain.objects.Service)domMap.get(valueObject.getService());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value5 = domainObject.getService();	
			}
			else
			{
				value5 = (ims.core.clinical.domain.objects.Service)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Service.class, valueObject.getService().getBoId());
			}
		}
		domainObject.setService(value5);

		return domainObject;
	}

}
