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
package ims.admin.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Marius Mihalec
 */
public class DocumentConversionSettingsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.admin.vo.DocumentConversionSettingsVo copy(ims.admin.vo.DocumentConversionSettingsVo valueObjectDest, ims.admin.vo.DocumentConversionSettingsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_DocumentConversionSettings(valueObjectSrc.getID_DocumentConversionSettings());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ConfiguredJob
		valueObjectDest.setConfiguredJob(valueObjectSrc.getConfiguredJob());
		// Server
		valueObjectDest.setServer(valueObjectSrc.getServer());
		// ServerPort
		valueObjectDest.setServerPort(valueObjectSrc.getServerPort());
		// DatabaseName
		valueObjectDest.setDatabaseName(valueObjectSrc.getDatabaseName());
		// DatabaseUsername
		valueObjectDest.setDatabaseUsername(valueObjectSrc.getDatabaseUsername());
		// DatabasePassword
		valueObjectDest.setDatabasePassword(valueObjectSrc.getDatabasePassword());
		// FilesPath
		valueObjectDest.setFilesPath(valueObjectSrc.getFilesPath());
		// AllRecords
		valueObjectDest.setAllRecords(valueObjectSrc.getAllRecords());
		// FromDate
		valueObjectDest.setFromDate(valueObjectSrc.getFromDate());
		// ToDate
		valueObjectDest.setToDate(valueObjectSrc.getToDate());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createDocumentConversionSettingsVoCollectionFromDocumentConversionSettings(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.configuration.domain.objects.DocumentConversionSettings objects.
	 */
	public static ims.admin.vo.DocumentConversionSettingsVoCollection createDocumentConversionSettingsVoCollectionFromDocumentConversionSettings(java.util.Set domainObjectSet)	
	{
		return createDocumentConversionSettingsVoCollectionFromDocumentConversionSettings(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.configuration.domain.objects.DocumentConversionSettings objects.
	 */
	public static ims.admin.vo.DocumentConversionSettingsVoCollection createDocumentConversionSettingsVoCollectionFromDocumentConversionSettings(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.admin.vo.DocumentConversionSettingsVoCollection voList = new ims.admin.vo.DocumentConversionSettingsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.configuration.domain.objects.DocumentConversionSettings domainObject = (ims.core.configuration.domain.objects.DocumentConversionSettings) iterator.next();
			ims.admin.vo.DocumentConversionSettingsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.configuration.domain.objects.DocumentConversionSettings objects.
	 */
	public static ims.admin.vo.DocumentConversionSettingsVoCollection createDocumentConversionSettingsVoCollectionFromDocumentConversionSettings(java.util.List domainObjectList) 
	{
		return createDocumentConversionSettingsVoCollectionFromDocumentConversionSettings(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.configuration.domain.objects.DocumentConversionSettings objects.
	 */
	public static ims.admin.vo.DocumentConversionSettingsVoCollection createDocumentConversionSettingsVoCollectionFromDocumentConversionSettings(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.admin.vo.DocumentConversionSettingsVoCollection voList = new ims.admin.vo.DocumentConversionSettingsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.configuration.domain.objects.DocumentConversionSettings domainObject = (ims.core.configuration.domain.objects.DocumentConversionSettings) domainObjectList.get(i);
			ims.admin.vo.DocumentConversionSettingsVo vo = create(map, domainObject);

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
	 * Create the ims.core.configuration.domain.objects.DocumentConversionSettings set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractDocumentConversionSettingsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.DocumentConversionSettingsVoCollection voCollection) 
	 {
	 	return extractDocumentConversionSettingsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractDocumentConversionSettingsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.DocumentConversionSettingsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.DocumentConversionSettingsVo vo = voCollection.get(i);
			ims.core.configuration.domain.objects.DocumentConversionSettings domainObject = DocumentConversionSettingsVoAssembler.extractDocumentConversionSettings(domainFactory, vo, domMap);

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
	 * Create the ims.core.configuration.domain.objects.DocumentConversionSettings list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractDocumentConversionSettingsList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.DocumentConversionSettingsVoCollection voCollection) 
	 {
	 	return extractDocumentConversionSettingsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractDocumentConversionSettingsList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.DocumentConversionSettingsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.DocumentConversionSettingsVo vo = voCollection.get(i);
			ims.core.configuration.domain.objects.DocumentConversionSettings domainObject = DocumentConversionSettingsVoAssembler.extractDocumentConversionSettings(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.configuration.domain.objects.DocumentConversionSettings object.
	 * @param domainObject ims.core.configuration.domain.objects.DocumentConversionSettings
	 */
	 public static ims.admin.vo.DocumentConversionSettingsVo create(ims.core.configuration.domain.objects.DocumentConversionSettings domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.configuration.domain.objects.DocumentConversionSettings object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.admin.vo.DocumentConversionSettingsVo create(DomainObjectMap map, ims.core.configuration.domain.objects.DocumentConversionSettings domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.admin.vo.DocumentConversionSettingsVo valueObject = (ims.admin.vo.DocumentConversionSettingsVo) map.getValueObject(domainObject, ims.admin.vo.DocumentConversionSettingsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.admin.vo.DocumentConversionSettingsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.configuration.domain.objects.DocumentConversionSettings
	 */
	 public static ims.admin.vo.DocumentConversionSettingsVo insert(ims.admin.vo.DocumentConversionSettingsVo valueObject, ims.core.configuration.domain.objects.DocumentConversionSettings domainObject) 
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
	 * @param domainObject ims.core.configuration.domain.objects.DocumentConversionSettings
	 */
	 public static ims.admin.vo.DocumentConversionSettingsVo insert(DomainObjectMap map, ims.admin.vo.DocumentConversionSettingsVo valueObject, ims.core.configuration.domain.objects.DocumentConversionSettings domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_DocumentConversionSettings(domainObject.getId());
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
			
		// ConfiguredJob
		if (domainObject.getConfiguredJob() != null)
		{
			if(domainObject.getConfiguredJob() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getConfiguredJob();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setConfiguredJob(new ims.core.configuration.vo.ConfiguredJobRefVo(id, -1));				
			}
			else
			{
				valueObject.setConfiguredJob(new ims.core.configuration.vo.ConfiguredJobRefVo(domainObject.getConfiguredJob().getId(), domainObject.getConfiguredJob().getVersion()));
			}
		}
		// Server
		valueObject.setServer(domainObject.getServer());
		// ServerPort
		valueObject.setServerPort(domainObject.getServerPort());
		// DatabaseName
		valueObject.setDatabaseName(domainObject.getDatabaseName());
		// DatabaseUsername
		valueObject.setDatabaseUsername(domainObject.getDatabaseUsername());
		// DatabasePassword
		valueObject.setDatabasePassword(domainObject.getDatabasePassword());
		// FilesPath
		valueObject.setFilesPath(domainObject.getFilesPath());
		// AllRecords
		valueObject.setAllRecords( domainObject.isAllRecords() );
		// FromDate
		java.util.Date FromDate = domainObject.getFromDate();
		if ( null != FromDate ) 
		{
			valueObject.setFromDate(new ims.framework.utils.DateTime(FromDate) );
		}
		// ToDate
		java.util.Date ToDate = domainObject.getToDate();
		if ( null != ToDate ) 
		{
			valueObject.setToDate(new ims.framework.utils.DateTime(ToDate) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.configuration.domain.objects.DocumentConversionSettings extractDocumentConversionSettings(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.DocumentConversionSettingsVo valueObject) 
	{
		return 	extractDocumentConversionSettings(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.configuration.domain.objects.DocumentConversionSettings extractDocumentConversionSettings(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.DocumentConversionSettingsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_DocumentConversionSettings();
		ims.core.configuration.domain.objects.DocumentConversionSettings domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.configuration.domain.objects.DocumentConversionSettings)domMap.get(valueObject);
			}
			// ims.admin.vo.DocumentConversionSettingsVo ID_DocumentConversionSettings field is unknown
			domainObject = new ims.core.configuration.domain.objects.DocumentConversionSettings();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_DocumentConversionSettings());
			if (domMap.get(key) != null)
			{
				return (ims.core.configuration.domain.objects.DocumentConversionSettings)domMap.get(key);
			}
			domainObject = (ims.core.configuration.domain.objects.DocumentConversionSettings) domainFactory.getDomainObject(ims.core.configuration.domain.objects.DocumentConversionSettings.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_DocumentConversionSettings());

		ims.core.configuration.domain.objects.ConfiguredJob value1 = null;
		if ( null != valueObject.getConfiguredJob() ) 
		{
			if (valueObject.getConfiguredJob().getBoId() == null)
			{
				if (domMap.get(valueObject.getConfiguredJob()) != null)
				{
					value1 = (ims.core.configuration.domain.objects.ConfiguredJob)domMap.get(valueObject.getConfiguredJob());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getConfiguredJob();	
			}
			else
			{
				value1 = (ims.core.configuration.domain.objects.ConfiguredJob)domainFactory.getDomainObject(ims.core.configuration.domain.objects.ConfiguredJob.class, valueObject.getConfiguredJob().getBoId());
			}
		}
		domainObject.setConfiguredJob(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getServer() != null && valueObject.getServer().equals(""))
		{
			valueObject.setServer(null);
		}
		domainObject.setServer(valueObject.getServer());
		domainObject.setServerPort(valueObject.getServerPort());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDatabaseName() != null && valueObject.getDatabaseName().equals(""))
		{
			valueObject.setDatabaseName(null);
		}
		domainObject.setDatabaseName(valueObject.getDatabaseName());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDatabaseUsername() != null && valueObject.getDatabaseUsername().equals(""))
		{
			valueObject.setDatabaseUsername(null);
		}
		domainObject.setDatabaseUsername(valueObject.getDatabaseUsername());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDatabasePassword() != null && valueObject.getDatabasePassword().equals(""))
		{
			valueObject.setDatabasePassword(null);
		}
		domainObject.setDatabasePassword(valueObject.getDatabasePassword());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getFilesPath() != null && valueObject.getFilesPath().equals(""))
		{
			valueObject.setFilesPath(null);
		}
		domainObject.setFilesPath(valueObject.getFilesPath());
		domainObject.setAllRecords(valueObject.getAllRecords());
		ims.framework.utils.DateTime dateTime9 = valueObject.getFromDate();
		java.util.Date value9 = null;
		if ( dateTime9 != null ) 
		{
			value9 = dateTime9.getJavaDate();
		}
		domainObject.setFromDate(value9);
		ims.framework.utils.DateTime dateTime10 = valueObject.getToDate();
		java.util.Date value10 = null;
		if ( dateTime10 != null ) 
		{
			value10 = dateTime10.getJavaDate();
		}
		domainObject.setToDate(value10);

		return domainObject;
	}

}
