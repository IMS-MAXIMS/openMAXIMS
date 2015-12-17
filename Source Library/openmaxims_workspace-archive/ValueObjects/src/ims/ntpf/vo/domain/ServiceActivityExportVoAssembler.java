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
package ims.ntpf.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Vasile Purdila
 */
public class ServiceActivityExportVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ntpf.vo.ServiceActivityExportVo copy(ims.ntpf.vo.ServiceActivityExportVo valueObjectDest, ims.ntpf.vo.ServiceActivityExportVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ServiceActivityExport(valueObjectSrc.getID_ServiceActivityExport());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ServiceActivity
		valueObjectDest.setServiceActivity(valueObjectSrc.getServiceActivity());
		// ReadyForExport
		valueObjectDest.setReadyForExport(valueObjectSrc.getReadyForExport());
		// DateLastExported
		valueObjectDest.setDateLastExported(valueObjectSrc.getDateLastExported());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createServiceActivityExportVoCollectionFromServiceActivityExport(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.resource.domain.objects.ServiceActivityExport objects.
	 */
	public static ims.ntpf.vo.ServiceActivityExportVoCollection createServiceActivityExportVoCollectionFromServiceActivityExport(java.util.Set domainObjectSet)	
	{
		return createServiceActivityExportVoCollectionFromServiceActivityExport(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.resource.domain.objects.ServiceActivityExport objects.
	 */
	public static ims.ntpf.vo.ServiceActivityExportVoCollection createServiceActivityExportVoCollectionFromServiceActivityExport(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ntpf.vo.ServiceActivityExportVoCollection voList = new ims.ntpf.vo.ServiceActivityExportVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.resource.domain.objects.ServiceActivityExport domainObject = (ims.core.resource.domain.objects.ServiceActivityExport) iterator.next();
			ims.ntpf.vo.ServiceActivityExportVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.resource.domain.objects.ServiceActivityExport objects.
	 */
	public static ims.ntpf.vo.ServiceActivityExportVoCollection createServiceActivityExportVoCollectionFromServiceActivityExport(java.util.List domainObjectList) 
	{
		return createServiceActivityExportVoCollectionFromServiceActivityExport(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.resource.domain.objects.ServiceActivityExport objects.
	 */
	public static ims.ntpf.vo.ServiceActivityExportVoCollection createServiceActivityExportVoCollectionFromServiceActivityExport(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ntpf.vo.ServiceActivityExportVoCollection voList = new ims.ntpf.vo.ServiceActivityExportVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.resource.domain.objects.ServiceActivityExport domainObject = (ims.core.resource.domain.objects.ServiceActivityExport) domainObjectList.get(i);
			ims.ntpf.vo.ServiceActivityExportVo vo = create(map, domainObject);

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
	 * Create the ims.core.resource.domain.objects.ServiceActivityExport set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractServiceActivityExportSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ntpf.vo.ServiceActivityExportVoCollection voCollection) 
	 {
	 	return extractServiceActivityExportSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractServiceActivityExportSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ntpf.vo.ServiceActivityExportVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ntpf.vo.ServiceActivityExportVo vo = voCollection.get(i);
			ims.core.resource.domain.objects.ServiceActivityExport domainObject = ServiceActivityExportVoAssembler.extractServiceActivityExport(domainFactory, vo, domMap);

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
	 * Create the ims.core.resource.domain.objects.ServiceActivityExport list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractServiceActivityExportList(ims.domain.ILightweightDomainFactory domainFactory, ims.ntpf.vo.ServiceActivityExportVoCollection voCollection) 
	 {
	 	return extractServiceActivityExportList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractServiceActivityExportList(ims.domain.ILightweightDomainFactory domainFactory, ims.ntpf.vo.ServiceActivityExportVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ntpf.vo.ServiceActivityExportVo vo = voCollection.get(i);
			ims.core.resource.domain.objects.ServiceActivityExport domainObject = ServiceActivityExportVoAssembler.extractServiceActivityExport(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.resource.domain.objects.ServiceActivityExport object.
	 * @param domainObject ims.core.resource.domain.objects.ServiceActivityExport
	 */
	 public static ims.ntpf.vo.ServiceActivityExportVo create(ims.core.resource.domain.objects.ServiceActivityExport domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.resource.domain.objects.ServiceActivityExport object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ntpf.vo.ServiceActivityExportVo create(DomainObjectMap map, ims.core.resource.domain.objects.ServiceActivityExport domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ntpf.vo.ServiceActivityExportVo valueObject = (ims.ntpf.vo.ServiceActivityExportVo) map.getValueObject(domainObject, ims.ntpf.vo.ServiceActivityExportVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ntpf.vo.ServiceActivityExportVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.resource.domain.objects.ServiceActivityExport
	 */
	 public static ims.ntpf.vo.ServiceActivityExportVo insert(ims.ntpf.vo.ServiceActivityExportVo valueObject, ims.core.resource.domain.objects.ServiceActivityExport domainObject) 
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
	 * @param domainObject ims.core.resource.domain.objects.ServiceActivityExport
	 */
	 public static ims.ntpf.vo.ServiceActivityExportVo insert(DomainObjectMap map, ims.ntpf.vo.ServiceActivityExportVo valueObject, ims.core.resource.domain.objects.ServiceActivityExport domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ServiceActivityExport(domainObject.getId());
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
			
		// ServiceActivity
		if (domainObject.getServiceActivity() != null)
		{
			if(domainObject.getServiceActivity() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getServiceActivity();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setServiceActivity(new ims.core.resource.vo.ServiceActivityRefVo(id, -1));				
			}
			else
			{
				valueObject.setServiceActivity(new ims.core.resource.vo.ServiceActivityRefVo(domainObject.getServiceActivity().getId(), domainObject.getServiceActivity().getVersion()));
			}
		}
		// ReadyForExport
		valueObject.setReadyForExport( domainObject.isReadyForExport() );
		// DateLastExported
		java.util.Date DateLastExported = domainObject.getDateLastExported();
		if ( null != DateLastExported ) 
		{
			valueObject.setDateLastExported(new ims.framework.utils.DateTime(DateLastExported) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.resource.domain.objects.ServiceActivityExport extractServiceActivityExport(ims.domain.ILightweightDomainFactory domainFactory, ims.ntpf.vo.ServiceActivityExportVo valueObject) 
	{
		return 	extractServiceActivityExport(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.resource.domain.objects.ServiceActivityExport extractServiceActivityExport(ims.domain.ILightweightDomainFactory domainFactory, ims.ntpf.vo.ServiceActivityExportVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ServiceActivityExport();
		ims.core.resource.domain.objects.ServiceActivityExport domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.resource.domain.objects.ServiceActivityExport)domMap.get(valueObject);
			}
			// ims.ntpf.vo.ServiceActivityExportVo ID_ServiceActivityExport field is unknown
			domainObject = new ims.core.resource.domain.objects.ServiceActivityExport();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ServiceActivityExport());
			if (domMap.get(key) != null)
			{
				return (ims.core.resource.domain.objects.ServiceActivityExport)domMap.get(key);
			}
			domainObject = (ims.core.resource.domain.objects.ServiceActivityExport) domainFactory.getDomainObject(ims.core.resource.domain.objects.ServiceActivityExport.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ServiceActivityExport());

		ims.core.resource.domain.objects.ServiceActivity value1 = null;
		if ( null != valueObject.getServiceActivity() ) 
		{
			if (valueObject.getServiceActivity().getBoId() == null)
			{
				if (domMap.get(valueObject.getServiceActivity()) != null)
				{
					value1 = (ims.core.resource.domain.objects.ServiceActivity)domMap.get(valueObject.getServiceActivity());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getServiceActivity();	
			}
			else
			{
				value1 = (ims.core.resource.domain.objects.ServiceActivity)domainFactory.getDomainObject(ims.core.resource.domain.objects.ServiceActivity.class, valueObject.getServiceActivity().getBoId());
			}
		}
		domainObject.setServiceActivity(value1);
		domainObject.setReadyForExport(valueObject.getReadyForExport());
		ims.framework.utils.DateTime dateTime3 = valueObject.getDateLastExported();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setDateLastExported(value3);

		return domainObject;
	}

}
