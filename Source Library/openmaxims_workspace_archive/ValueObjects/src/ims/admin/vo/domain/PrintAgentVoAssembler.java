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
 * @author Vasile Purdila
 */
public class PrintAgentVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.admin.vo.PrintAgentVo copy(ims.admin.vo.PrintAgentVo valueObjectDest, ims.admin.vo.PrintAgentVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PrintAgent(valueObjectSrc.getID_PrintAgent());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// QueryServerUrl
		valueObjectDest.setQueryServerUrl(valueObjectSrc.getQueryServerUrl());
		// ReportServerUrl
		valueObjectDest.setReportServerUrl(valueObjectSrc.getReportServerUrl());
		// TemplatesToPrint
		valueObjectDest.setTemplatesToPrint(valueObjectSrc.getTemplatesToPrint());
		// Description
		valueObjectDest.setDescription(valueObjectSrc.getDescription());
		// Trigger
		valueObjectDest.setTrigger(valueObjectSrc.getTrigger());
		// LastSuccessfulRunDateTime
		valueObjectDest.setLastSuccessfulRunDateTime(valueObjectSrc.getLastSuccessfulRunDateTime());
		// LastRunDateTime
		valueObjectDest.setLastRunDateTime(valueObjectSrc.getLastRunDateTime());
		// JobType
		valueObjectDest.setJobType(valueObjectSrc.getJobType());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// SysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
		// DNAApptsInLastXhrs
		valueObjectDest.setDNAApptsInLastXhrs(valueObjectSrc.getDNAApptsInLastXhrs());
		// NoOfRecordsUpdated
		valueObjectDest.setNoOfRecordsUpdated(valueObjectSrc.getNoOfRecordsUpdated());
		// LocationToPrintFor
		valueObjectDest.setLocationToPrintFor(valueObjectSrc.getLocationToPrintFor());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPrintAgentVoCollectionFromPrintAgent(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.PrintAgent objects.
	 */
	public static ims.admin.vo.PrintAgentVoCollection createPrintAgentVoCollectionFromPrintAgent(java.util.Set domainObjectSet)	
	{
		return createPrintAgentVoCollectionFromPrintAgent(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.PrintAgent objects.
	 */
	public static ims.admin.vo.PrintAgentVoCollection createPrintAgentVoCollectionFromPrintAgent(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.admin.vo.PrintAgentVoCollection voList = new ims.admin.vo.PrintAgentVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.domain.objects.PrintAgent domainObject = (ims.core.admin.domain.objects.PrintAgent) iterator.next();
			ims.admin.vo.PrintAgentVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.domain.objects.PrintAgent objects.
	 */
	public static ims.admin.vo.PrintAgentVoCollection createPrintAgentVoCollectionFromPrintAgent(java.util.List domainObjectList) 
	{
		return createPrintAgentVoCollectionFromPrintAgent(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.PrintAgent objects.
	 */
	public static ims.admin.vo.PrintAgentVoCollection createPrintAgentVoCollectionFromPrintAgent(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.admin.vo.PrintAgentVoCollection voList = new ims.admin.vo.PrintAgentVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.PrintAgent domainObject = (ims.core.admin.domain.objects.PrintAgent) domainObjectList.get(i);
			ims.admin.vo.PrintAgentVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.domain.objects.PrintAgent set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPrintAgentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.PrintAgentVoCollection voCollection) 
	 {
	 	return extractPrintAgentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPrintAgentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.PrintAgentVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.PrintAgentVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.PrintAgent domainObject = PrintAgentVoAssembler.extractPrintAgent(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.domain.objects.PrintAgent list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPrintAgentList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.PrintAgentVoCollection voCollection) 
	 {
	 	return extractPrintAgentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPrintAgentList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.PrintAgentVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.PrintAgentVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.PrintAgent domainObject = PrintAgentVoAssembler.extractPrintAgent(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.domain.objects.PrintAgent object.
	 * @param domainObject ims.core.admin.domain.objects.PrintAgent
	 */
	 public static ims.admin.vo.PrintAgentVo create(ims.core.admin.domain.objects.PrintAgent domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.domain.objects.PrintAgent object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.admin.vo.PrintAgentVo create(DomainObjectMap map, ims.core.admin.domain.objects.PrintAgent domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.admin.vo.PrintAgentVo valueObject = (ims.admin.vo.PrintAgentVo) map.getValueObject(domainObject, ims.admin.vo.PrintAgentVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.admin.vo.PrintAgentVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.domain.objects.PrintAgent
	 */
	 public static ims.admin.vo.PrintAgentVo insert(ims.admin.vo.PrintAgentVo valueObject, ims.core.admin.domain.objects.PrintAgent domainObject) 
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
	 * @param domainObject ims.core.admin.domain.objects.PrintAgent
	 */
	 public static ims.admin.vo.PrintAgentVo insert(DomainObjectMap map, ims.admin.vo.PrintAgentVo valueObject, ims.core.admin.domain.objects.PrintAgent domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PrintAgent(domainObject.getId());
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
			
		// QueryServerUrl
		valueObject.setQueryServerUrl(domainObject.getQueryServerUrl());
		// ReportServerUrl
		valueObject.setReportServerUrl(domainObject.getReportServerUrl());
		// TemplatesToPrint
		valueObject.setTemplatesToPrint(ims.admin.vo.domain.TemplatePrinterVoAssembler.createTemplatePrinterVoCollectionFromTemplatePrinter(map, domainObject.getTemplatePrinters()) );
		// Description
		valueObject.setDescription(domainObject.getDescription());
		// Trigger
		valueObject.setTrigger(domainObject.getTrigger());
		// LastSuccessfulRunDateTime
		java.util.Date LastSuccessfulRunDateTime = domainObject.getLastSuccessfulRunDateTime();
		if ( null != LastSuccessfulRunDateTime ) 
		{
			valueObject.setLastSuccessfulRunDateTime(new ims.framework.utils.DateTime(LastSuccessfulRunDateTime) );
		}
		// LastRunDateTime
		java.util.Date LastRunDateTime = domainObject.getLastRunDateTime();
		if ( null != LastRunDateTime ) 
		{
			valueObject.setLastRunDateTime(new ims.framework.utils.DateTime(LastRunDateTime) );
		}
		// JobType
		ims.domain.lookups.LookupInstance instance8 = domainObject.getJobType();
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

			ims.ntpf.vo.lookups.JobType voLookup8 = new ims.ntpf.vo.lookups.JobType(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.ntpf.vo.lookups.JobType parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.ntpf.vo.lookups.JobType(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setJobType(voLookup8);
		}
				// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// SysInfo
		// set system information
		valueObject.setSysInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// DNAApptsInLastXhrs
		valueObject.setDNAApptsInLastXhrs(domainObject.getDNAApptsInLastXhrs());
		// NoOfRecordsUpdated
		valueObject.setNoOfRecordsUpdated(domainObject.getNoOfRecordsUpdated());
		// LocationToPrintFor
		valueObject.setLocationToPrintFor(ims.core.vo.domain.LocSiteLiteVoAssembler.create(map, domainObject.getLocationToPrintFor()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.PrintAgent extractPrintAgent(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.PrintAgentVo valueObject) 
	{
		return 	extractPrintAgent(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.PrintAgent extractPrintAgent(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.PrintAgentVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PrintAgent();
		ims.core.admin.domain.objects.PrintAgent domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.domain.objects.PrintAgent)domMap.get(valueObject);
			}
			// ims.admin.vo.PrintAgentVo ID_PrintAgent field is unknown
			domainObject = new ims.core.admin.domain.objects.PrintAgent();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PrintAgent());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.domain.objects.PrintAgent)domMap.get(key);
			}
			domainObject = (ims.core.admin.domain.objects.PrintAgent) domainFactory.getDomainObject(ims.core.admin.domain.objects.PrintAgent.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PrintAgent());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getQueryServerUrl() != null && valueObject.getQueryServerUrl().equals(""))
		{
			valueObject.setQueryServerUrl(null);
		}
		domainObject.setQueryServerUrl(valueObject.getQueryServerUrl());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReportServerUrl() != null && valueObject.getReportServerUrl().equals(""))
		{
			valueObject.setReportServerUrl(null);
		}
		domainObject.setReportServerUrl(valueObject.getReportServerUrl());
		domainObject.setTemplatePrinters(ims.admin.vo.domain.TemplatePrinterVoAssembler.extractTemplatePrinterSet(domainFactory, valueObject.getTemplatesToPrint(), domainObject.getTemplatePrinters(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDescription() != null && valueObject.getDescription().equals(""))
		{
			valueObject.setDescription(null);
		}
		domainObject.setDescription(valueObject.getDescription());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTrigger() != null && valueObject.getTrigger().equals(""))
		{
			valueObject.setTrigger(null);
		}
		domainObject.setTrigger(valueObject.getTrigger());
		ims.framework.utils.DateTime dateTime6 = valueObject.getLastSuccessfulRunDateTime();
		java.util.Date value6 = null;
		if ( dateTime6 != null ) 
		{
			value6 = dateTime6.getJavaDate();
		}
		domainObject.setLastSuccessfulRunDateTime(value6);
		ims.framework.utils.DateTime dateTime7 = valueObject.getLastRunDateTime();
		java.util.Date value7 = null;
		if ( dateTime7 != null ) 
		{
			value7 = dateTime7.getJavaDate();
		}
		domainObject.setLastRunDateTime(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getJobType() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getJobType().getID());
		}
		domainObject.setJobType(value8);
		domainObject.setIsActive(valueObject.getIsActive());
		domainObject.setDNAApptsInLastXhrs(valueObject.getDNAApptsInLastXhrs());
		domainObject.setNoOfRecordsUpdated(valueObject.getNoOfRecordsUpdated());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.LocSite value13 = null;
		if ( null != valueObject.getLocationToPrintFor() ) 
		{
			if (valueObject.getLocationToPrintFor().getBoId() == null)
			{
				if (domMap.get(valueObject.getLocationToPrintFor()) != null)
				{
					value13 = (ims.core.resource.place.domain.objects.LocSite)domMap.get(valueObject.getLocationToPrintFor());
				}
			}
			else
			{
				value13 = (ims.core.resource.place.domain.objects.LocSite)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.LocSite.class, valueObject.getLocationToPrintFor().getBoId());
			}
		}
		domainObject.setLocationToPrintFor(value13);

		return domainObject;
	}

}
