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
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Sean Nesbitt
 */
public class StageCodeExportVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.StageCodeExportVo copy(ims.RefMan.vo.StageCodeExportVo valueObjectDest, ims.RefMan.vo.StageCodeExportVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_StagingCodeExport(valueObjectSrc.getID_StagingCodeExport());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ExportDateTime
		valueObjectDest.setExportDateTime(valueObjectSrc.getExportDateTime());
		// DataExport
		valueObjectDest.setDataExport(valueObjectSrc.getDataExport());
		// DataImport
		valueObjectDest.setDataImport(valueObjectSrc.getDataImport());
		// PushedCodingItems
		valueObjectDest.setPushedCodingItems(valueObjectSrc.getPushedCodingItems());
		// ImportDateTime
		valueObjectDest.setImportDateTime(valueObjectSrc.getImportDateTime());
		// ReceivedCodingItems
		valueObjectDest.setReceivedCodingItems(valueObjectSrc.getReceivedCodingItems());
		// ReceivedPatientId
		valueObjectDest.setReceivedPatientId(valueObjectSrc.getReceivedPatientId());
		// ReceivedFCEId
		valueObjectDest.setReceivedFCEId(valueObjectSrc.getReceivedFCEId());
		// CodingStatus
		valueObjectDest.setCodingStatus(valueObjectSrc.getCodingStatus());
		// ReceivedCodingStatus
		valueObjectDest.setReceivedCodingStatus(valueObjectSrc.getReceivedCodingStatus());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createStageCodeExportVoCollectionFromStagingCodeExport(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.StagingCodeExport objects.
	 */
	public static ims.RefMan.vo.StageCodeExportVoCollection createStageCodeExportVoCollectionFromStagingCodeExport(java.util.Set domainObjectSet)	
	{
		return createStageCodeExportVoCollectionFromStagingCodeExport(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.StagingCodeExport objects.
	 */
	public static ims.RefMan.vo.StageCodeExportVoCollection createStageCodeExportVoCollectionFromStagingCodeExport(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.StageCodeExportVoCollection voList = new ims.RefMan.vo.StageCodeExportVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.StagingCodeExport domainObject = (ims.RefMan.domain.objects.StagingCodeExport) iterator.next();
			ims.RefMan.vo.StageCodeExportVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.StagingCodeExport objects.
	 */
	public static ims.RefMan.vo.StageCodeExportVoCollection createStageCodeExportVoCollectionFromStagingCodeExport(java.util.List domainObjectList) 
	{
		return createStageCodeExportVoCollectionFromStagingCodeExport(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.StagingCodeExport objects.
	 */
	public static ims.RefMan.vo.StageCodeExportVoCollection createStageCodeExportVoCollectionFromStagingCodeExport(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.StageCodeExportVoCollection voList = new ims.RefMan.vo.StageCodeExportVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.StagingCodeExport domainObject = (ims.RefMan.domain.objects.StagingCodeExport) domainObjectList.get(i);
			ims.RefMan.vo.StageCodeExportVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.StagingCodeExport set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractStagingCodeExportSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.StageCodeExportVoCollection voCollection) 
	 {
	 	return extractStagingCodeExportSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractStagingCodeExportSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.StageCodeExportVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.StageCodeExportVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.StagingCodeExport domainObject = StageCodeExportVoAssembler.extractStagingCodeExport(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.StagingCodeExport list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractStagingCodeExportList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.StageCodeExportVoCollection voCollection) 
	 {
	 	return extractStagingCodeExportList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractStagingCodeExportList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.StageCodeExportVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.StageCodeExportVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.StagingCodeExport domainObject = StageCodeExportVoAssembler.extractStagingCodeExport(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.StagingCodeExport object.
	 * @param domainObject ims.RefMan.domain.objects.StagingCodeExport
	 */
	 public static ims.RefMan.vo.StageCodeExportVo create(ims.RefMan.domain.objects.StagingCodeExport domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.StagingCodeExport object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.StageCodeExportVo create(DomainObjectMap map, ims.RefMan.domain.objects.StagingCodeExport domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.StageCodeExportVo valueObject = (ims.RefMan.vo.StageCodeExportVo) map.getValueObject(domainObject, ims.RefMan.vo.StageCodeExportVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.StageCodeExportVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.StagingCodeExport
	 */
	 public static ims.RefMan.vo.StageCodeExportVo insert(ims.RefMan.vo.StageCodeExportVo valueObject, ims.RefMan.domain.objects.StagingCodeExport domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.StagingCodeExport
	 */
	 public static ims.RefMan.vo.StageCodeExportVo insert(DomainObjectMap map, ims.RefMan.vo.StageCodeExportVo valueObject, ims.RefMan.domain.objects.StagingCodeExport domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_StagingCodeExport(domainObject.getId());
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
			
		// ExportDateTime
		java.util.Date ExportDateTime = domainObject.getExportDateTime();
		if ( null != ExportDateTime ) 
		{
			valueObject.setExportDateTime(new ims.framework.utils.DateTime(ExportDateTime) );
		}
		// DataExport
		valueObject.setDataExport(domainObject.getDataExport());
		// DataImport
		valueObject.setDataImport(domainObject.getDataImport());
		// PushedCodingItems
		valueObject.setPushedCodingItems(ims.RefMan.vo.domain.ReferralCodingItemVoAssembler.createReferralCodingItemVoCollectionFromReferralCodingItem(map, domainObject.getPushedCodingItems()) );
		// ImportDateTime
		java.util.Date ImportDateTime = domainObject.getImportDateTime();
		if ( null != ImportDateTime ) 
		{
			valueObject.setImportDateTime(new ims.framework.utils.DateTime(ImportDateTime) );
		}
		// ReceivedCodingItems
		valueObject.setReceivedCodingItems(ims.RefMan.vo.domain.ReferralCodingItemVoAssembler.createReferralCodingItemVoCollectionFromReferralCodingItem(map, domainObject.getReceivedCodingItems()) );
		// ReceivedPatientId
		valueObject.setReceivedPatientId(domainObject.getReceivedPatientId());
		// ReceivedFCEId
		valueObject.setReceivedFCEId(domainObject.getReceivedFCEId());
		// CodingStatus
		ims.domain.lookups.LookupInstance instance9 = domainObject.getCodingStatus();
		if ( null != instance9 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance9.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance9.getImage().getImageId(), instance9.getImage().getImagePath());
			}
			color = instance9.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.CodingStatus voLookup9 = new ims.core.vo.lookups.CodingStatus(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.CodingStatus parentVoLookup9 = voLookup9;
			ims.domain.lookups.LookupInstance parent9 = instance9.getParent();
			while (parent9 != null)
			{
				if (parent9.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent9.getImage().getImageId(), parent9.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent9.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup9.setParent(new ims.core.vo.lookups.CodingStatus(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setCodingStatus(voLookup9);
		}
				// ReceivedCodingStatus
		valueObject.setReceivedCodingStatus(domainObject.getReceivedCodingStatus());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.StagingCodeExport extractStagingCodeExport(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.StageCodeExportVo valueObject) 
	{
		return 	extractStagingCodeExport(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.StagingCodeExport extractStagingCodeExport(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.StageCodeExportVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_StagingCodeExport();
		ims.RefMan.domain.objects.StagingCodeExport domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.StagingCodeExport)domMap.get(valueObject);
			}
			// ims.RefMan.vo.StageCodeExportVo ID_StagingCodeExport field is unknown
			domainObject = new ims.RefMan.domain.objects.StagingCodeExport();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_StagingCodeExport());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.StagingCodeExport)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.StagingCodeExport) domainFactory.getDomainObject(ims.RefMan.domain.objects.StagingCodeExport.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_StagingCodeExport());

		ims.framework.utils.DateTime dateTime1 = valueObject.getExportDateTime();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setExportDateTime(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDataExport() != null && valueObject.getDataExport().equals(""))
		{
			valueObject.setDataExport(null);
		}
		domainObject.setDataExport(valueObject.getDataExport());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDataImport() != null && valueObject.getDataImport().equals(""))
		{
			valueObject.setDataImport(null);
		}
		domainObject.setDataImport(valueObject.getDataImport());
		domainObject.setPushedCodingItems(ims.RefMan.vo.domain.ReferralCodingItemVoAssembler.extractReferralCodingItemList(domainFactory, valueObject.getPushedCodingItems(), domainObject.getPushedCodingItems(), domMap));		
		ims.framework.utils.DateTime dateTime5 = valueObject.getImportDateTime();
		java.util.Date value5 = null;
		if ( dateTime5 != null ) 
		{
			value5 = dateTime5.getJavaDate();
		}
		domainObject.setImportDateTime(value5);
		domainObject.setReceivedCodingItems(ims.RefMan.vo.domain.ReferralCodingItemVoAssembler.extractReferralCodingItemList(domainFactory, valueObject.getReceivedCodingItems(), domainObject.getReceivedCodingItems(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReceivedPatientId() != null && valueObject.getReceivedPatientId().equals(""))
		{
			valueObject.setReceivedPatientId(null);
		}
		domainObject.setReceivedPatientId(valueObject.getReceivedPatientId());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReceivedFCEId() != null && valueObject.getReceivedFCEId().equals(""))
		{
			valueObject.setReceivedFCEId(null);
		}
		domainObject.setReceivedFCEId(valueObject.getReceivedFCEId());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getCodingStatus() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getCodingStatus().getID());
		}
		domainObject.setCodingStatus(value9);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReceivedCodingStatus() != null && valueObject.getReceivedCodingStatus().equals(""))
		{
			valueObject.setReceivedCodingStatus(null);
		}
		domainObject.setReceivedCodingStatus(valueObject.getReceivedCodingStatus());

		return domainObject;
	}

}
