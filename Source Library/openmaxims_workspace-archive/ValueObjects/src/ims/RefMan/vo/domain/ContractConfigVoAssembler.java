/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 16/04/2014, 12:32
 *
 */
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Calin Perebiceanu
 */
public class ContractConfigVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.ContractConfigVo copy(ims.RefMan.vo.ContractConfigVo valueObjectDest, ims.RefMan.vo.ContractConfigVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ContractConfig(valueObjectSrc.getID_ContractConfig());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// daysTo1stAppt
		valueObjectDest.setDaysTo1stAppt(valueObjectSrc.getDaysTo1stAppt());
		// ContractKPIHistory
		valueObjectDest.setContractKPIHistory(valueObjectSrc.getContractKPIHistory());
		// ServiceLocations
		valueObjectDest.setServiceLocations(valueObjectSrc.getServiceLocations());
		// CCGsForContract
		valueObjectDest.setCCGsForContract(valueObjectSrc.getCCGsForContract());
		// ContractOrganisation
		valueObjectDest.setContractOrganisation(valueObjectSrc.getContractOrganisation());
		// DaysToRTTBreachDate
		valueObjectDest.setDaysToRTTBreachDate(valueObjectSrc.getDaysToRTTBreachDate());
		// ContractType
		valueObjectDest.setContractType(valueObjectSrc.getContractType());
		// ContractId
		valueObjectDest.setContractId(valueObjectSrc.getContractId());
		// ContractName
		valueObjectDest.setContractName(valueObjectSrc.getContractName());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createContractConfigVoCollectionFromContractConfig(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.configuration.domain.objects.ContractConfig objects.
	 */
	public static ims.RefMan.vo.ContractConfigVoCollection createContractConfigVoCollectionFromContractConfig(java.util.Set domainObjectSet)	
	{
		return createContractConfigVoCollectionFromContractConfig(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.configuration.domain.objects.ContractConfig objects.
	 */
	public static ims.RefMan.vo.ContractConfigVoCollection createContractConfigVoCollectionFromContractConfig(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.ContractConfigVoCollection voList = new ims.RefMan.vo.ContractConfigVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.configuration.domain.objects.ContractConfig domainObject = (ims.core.configuration.domain.objects.ContractConfig) iterator.next();
			ims.RefMan.vo.ContractConfigVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.configuration.domain.objects.ContractConfig objects.
	 */
	public static ims.RefMan.vo.ContractConfigVoCollection createContractConfigVoCollectionFromContractConfig(java.util.List domainObjectList) 
	{
		return createContractConfigVoCollectionFromContractConfig(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.configuration.domain.objects.ContractConfig objects.
	 */
	public static ims.RefMan.vo.ContractConfigVoCollection createContractConfigVoCollectionFromContractConfig(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.ContractConfigVoCollection voList = new ims.RefMan.vo.ContractConfigVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.configuration.domain.objects.ContractConfig domainObject = (ims.core.configuration.domain.objects.ContractConfig) domainObjectList.get(i);
			ims.RefMan.vo.ContractConfigVo vo = create(map, domainObject);

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
	 * Create the ims.core.configuration.domain.objects.ContractConfig set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractContractConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ContractConfigVoCollection voCollection) 
	 {
	 	return extractContractConfigSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractContractConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ContractConfigVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ContractConfigVo vo = voCollection.get(i);
			ims.core.configuration.domain.objects.ContractConfig domainObject = ContractConfigVoAssembler.extractContractConfig(domainFactory, vo, domMap);

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
	 * Create the ims.core.configuration.domain.objects.ContractConfig list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractContractConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ContractConfigVoCollection voCollection) 
	 {
	 	return extractContractConfigList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractContractConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ContractConfigVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ContractConfigVo vo = voCollection.get(i);
			ims.core.configuration.domain.objects.ContractConfig domainObject = ContractConfigVoAssembler.extractContractConfig(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.configuration.domain.objects.ContractConfig object.
	 * @param domainObject ims.core.configuration.domain.objects.ContractConfig
	 */
	 public static ims.RefMan.vo.ContractConfigVo create(ims.core.configuration.domain.objects.ContractConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.configuration.domain.objects.ContractConfig object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.ContractConfigVo create(DomainObjectMap map, ims.core.configuration.domain.objects.ContractConfig domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.ContractConfigVo valueObject = (ims.RefMan.vo.ContractConfigVo) map.getValueObject(domainObject, ims.RefMan.vo.ContractConfigVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.ContractConfigVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.configuration.domain.objects.ContractConfig
	 */
	 public static ims.RefMan.vo.ContractConfigVo insert(ims.RefMan.vo.ContractConfigVo valueObject, ims.core.configuration.domain.objects.ContractConfig domainObject) 
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
	 * @param domainObject ims.core.configuration.domain.objects.ContractConfig
	 */
	 public static ims.RefMan.vo.ContractConfigVo insert(DomainObjectMap map, ims.RefMan.vo.ContractConfigVo valueObject, ims.core.configuration.domain.objects.ContractConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ContractConfig(domainObject.getId());
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
			
		// daysTo1stAppt
		valueObject.setDaysTo1stAppt(domainObject.getDaysTo1stAppt());
		// ContractKPIHistory
		valueObject.setContractKPIHistory(ims.RefMan.vo.domain.ContractConfigKPIHistoryVoAssembler.createContractConfigKPIHistoryVoCollectionFromContractConfigKPIHistory(map, domainObject.getContractKPIHistory()) );
		// ServiceLocations
		valueObject.setServiceLocations(ims.RefMan.vo.domain.ContractServiceLocationsConfigVoAssembler.createContractServiceLocationsConfigVoCollectionFromContractServiceLocationsConfig(map, domainObject.getServiceLocations()) );
		// CCGsForContract
		valueObject.setCCGsForContract(ims.RefMan.vo.domain.CCGToContractConfigVoAssembler.createCCGToContractConfigVoCollectionFromCCGToContractConfig(map, domainObject.getCCGsForContract()) );
		// ContractOrganisation
		valueObject.setContractOrganisation(ims.core.vo.domain.OrganisationLiteVoAssembler.create(map, domainObject.getContractOrganisation()) );
		// DaysToRTTBreachDate
		valueObject.setDaysToRTTBreachDate(domainObject.getDaysToRTTBreachDate());
		// ContractType
		ims.domain.lookups.LookupInstance instance7 = domainObject.getContractType();
		if ( null != instance7 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance7.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance7.getImage().getImageId(), instance7.getImage().getImagePath());
			}
			color = instance7.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.ReferralManagementContractType voLookup7 = new ims.core.vo.lookups.ReferralManagementContractType(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.ReferralManagementContractType parentVoLookup7 = voLookup7;
			ims.domain.lookups.LookupInstance parent7 = instance7.getParent();
			while (parent7 != null)
			{
				if (parent7.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent7.getImage().getImageId(), parent7.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent7.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup7.setParent(new ims.core.vo.lookups.ReferralManagementContractType(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setContractType(voLookup7);
		}
				// ContractId
		valueObject.setContractId(domainObject.getContractId());
		// ContractName
		valueObject.setContractName(domainObject.getContractName());
		// Status
		ims.domain.lookups.LookupInstance instance10 = domainObject.getStatus();
		if ( null != instance10 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance10.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance10.getImage().getImageId(), instance10.getImage().getImagePath());
			}
			color = instance10.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup10 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup10 = voLookup10;
			ims.domain.lookups.LookupInstance parent10 = instance10.getParent();
			while (parent10 != null)
			{
				if (parent10.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent10.getImage().getImageId(), parent10.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent10.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup10.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setStatus(voLookup10);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.configuration.domain.objects.ContractConfig extractContractConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ContractConfigVo valueObject) 
	{
		return 	extractContractConfig(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.configuration.domain.objects.ContractConfig extractContractConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ContractConfigVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ContractConfig();
		ims.core.configuration.domain.objects.ContractConfig domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.configuration.domain.objects.ContractConfig)domMap.get(valueObject);
			}
			// ims.RefMan.vo.ContractConfigVo ID_ContractConfig field is unknown
			domainObject = new ims.core.configuration.domain.objects.ContractConfig();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ContractConfig());
			if (domMap.get(key) != null)
			{
				return (ims.core.configuration.domain.objects.ContractConfig)domMap.get(key);
			}
			domainObject = (ims.core.configuration.domain.objects.ContractConfig) domainFactory.getDomainObject(ims.core.configuration.domain.objects.ContractConfig.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ContractConfig());

		domainObject.setDaysTo1stAppt(valueObject.getDaysTo1stAppt());
		domainObject.setContractKPIHistory(ims.RefMan.vo.domain.ContractConfigKPIHistoryVoAssembler.extractContractConfigKPIHistoryList(domainFactory, valueObject.getContractKPIHistory(), domainObject.getContractKPIHistory(), domMap));		
		domainObject.setServiceLocations(ims.RefMan.vo.domain.ContractServiceLocationsConfigVoAssembler.extractContractServiceLocationsConfigList(domainFactory, valueObject.getServiceLocations(), domainObject.getServiceLocations(), domMap));		
		domainObject.setCCGsForContract(ims.RefMan.vo.domain.CCGToContractConfigVoAssembler.extractCCGToContractConfigList(domainFactory, valueObject.getCCGsForContract(), domainObject.getCCGsForContract(), domMap));		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Organisation value5 = null;
		if ( null != valueObject.getContractOrganisation() ) 
		{
			if (valueObject.getContractOrganisation().getBoId() == null)
			{
				if (domMap.get(valueObject.getContractOrganisation()) != null)
				{
					value5 = (ims.core.resource.place.domain.objects.Organisation)domMap.get(valueObject.getContractOrganisation());
				}
			}
			else
			{
				value5 = (ims.core.resource.place.domain.objects.Organisation)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Organisation.class, valueObject.getContractOrganisation().getBoId());
			}
		}
		domainObject.setContractOrganisation(value5);
		domainObject.setDaysToRTTBreachDate(valueObject.getDaysToRTTBreachDate());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getContractType() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getContractType().getID());
		}
		domainObject.setContractType(value7);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getContractId() != null && valueObject.getContractId().equals(""))
		{
			valueObject.setContractId(null);
		}
		domainObject.setContractId(valueObject.getContractId());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getContractName() != null && valueObject.getContractName().equals(""))
		{
			valueObject.setContractName(null);
		}
		domainObject.setContractName(valueObject.getContractName());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value10);

		return domainObject;
	}

}
