/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 16/04/2014, 12:31
 *
 */
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cornel Ventuneac
 */
public class ContractConfigurationVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.ContractConfigurationVo copy(ims.RefMan.vo.ContractConfigurationVo valueObjectDest, ims.RefMan.vo.ContractConfigurationVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ContractConfig(valueObjectSrc.getID_ContractConfig());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ContractId
		valueObjectDest.setContractId(valueObjectSrc.getContractId());
		// ContractOrganisation
		valueObjectDest.setContractOrganisation(valueObjectSrc.getContractOrganisation());
		// ContractName
		valueObjectDest.setContractName(valueObjectSrc.getContractName());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// ServiceLocations
		valueObjectDest.setServiceLocations(valueObjectSrc.getServiceLocations());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createContractConfigurationVoCollectionFromContractConfig(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.configuration.domain.objects.ContractConfig objects.
	 */
	public static ims.RefMan.vo.ContractConfigurationVoCollection createContractConfigurationVoCollectionFromContractConfig(java.util.Set domainObjectSet)	
	{
		return createContractConfigurationVoCollectionFromContractConfig(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.configuration.domain.objects.ContractConfig objects.
	 */
	public static ims.RefMan.vo.ContractConfigurationVoCollection createContractConfigurationVoCollectionFromContractConfig(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.ContractConfigurationVoCollection voList = new ims.RefMan.vo.ContractConfigurationVoCollection();
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
			ims.RefMan.vo.ContractConfigurationVo vo = create(map, domainObject);
			
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
	public static ims.RefMan.vo.ContractConfigurationVoCollection createContractConfigurationVoCollectionFromContractConfig(java.util.List domainObjectList) 
	{
		return createContractConfigurationVoCollectionFromContractConfig(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.configuration.domain.objects.ContractConfig objects.
	 */
	public static ims.RefMan.vo.ContractConfigurationVoCollection createContractConfigurationVoCollectionFromContractConfig(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.ContractConfigurationVoCollection voList = new ims.RefMan.vo.ContractConfigurationVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.configuration.domain.objects.ContractConfig domainObject = (ims.core.configuration.domain.objects.ContractConfig) domainObjectList.get(i);
			ims.RefMan.vo.ContractConfigurationVo vo = create(map, domainObject);

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
	 public static java.util.Set extractContractConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ContractConfigurationVoCollection voCollection) 
	 {
	 	return extractContractConfigSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractContractConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ContractConfigurationVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ContractConfigurationVo vo = voCollection.get(i);
			ims.core.configuration.domain.objects.ContractConfig domainObject = ContractConfigurationVoAssembler.extractContractConfig(domainFactory, vo, domMap);

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
	 public static java.util.List extractContractConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ContractConfigurationVoCollection voCollection) 
	 {
	 	return extractContractConfigList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractContractConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ContractConfigurationVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ContractConfigurationVo vo = voCollection.get(i);
			ims.core.configuration.domain.objects.ContractConfig domainObject = ContractConfigurationVoAssembler.extractContractConfig(domainFactory, vo, domMap);

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
	 public static ims.RefMan.vo.ContractConfigurationVo create(ims.core.configuration.domain.objects.ContractConfig domainObject) 
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
	  public static ims.RefMan.vo.ContractConfigurationVo create(DomainObjectMap map, ims.core.configuration.domain.objects.ContractConfig domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.ContractConfigurationVo valueObject = (ims.RefMan.vo.ContractConfigurationVo) map.getValueObject(domainObject, ims.RefMan.vo.ContractConfigurationVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.ContractConfigurationVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.RefMan.vo.ContractConfigurationVo insert(ims.RefMan.vo.ContractConfigurationVo valueObject, ims.core.configuration.domain.objects.ContractConfig domainObject) 
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
	 public static ims.RefMan.vo.ContractConfigurationVo insert(DomainObjectMap map, ims.RefMan.vo.ContractConfigurationVo valueObject, ims.core.configuration.domain.objects.ContractConfig domainObject) 
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
			
		// ContractId
		valueObject.setContractId(domainObject.getContractId());
		// ContractOrganisation
		if (domainObject.getContractOrganisation() != null)
		{
			if(domainObject.getContractOrganisation() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getContractOrganisation();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setContractOrganisation(new ims.core.resource.place.vo.OrganisationRefVo(id, -1));				
			}
			else
			{
				valueObject.setContractOrganisation(new ims.core.resource.place.vo.OrganisationRefVo(domainObject.getContractOrganisation().getId(), domainObject.getContractOrganisation().getVersion()));
			}
		}
		// ContractName
		valueObject.setContractName(domainObject.getContractName());
		// Status
		ims.domain.lookups.LookupInstance instance4 = domainObject.getStatus();
		if ( null != instance4 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance4.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance4.getImage().getImageId(), instance4.getImage().getImagePath());
			}
			color = instance4.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup4 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup4 = voLookup4;
			ims.domain.lookups.LookupInstance parent4 = instance4.getParent();
			while (parent4 != null)
			{
				if (parent4.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent4.getImage().getImageId(), parent4.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent4.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup4.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setStatus(voLookup4);
		}
				// ServiceLocations
		valueObject.setServiceLocations(ims.RefMan.vo.domain.ContractServiceLocationsConfigVoAssembler.createContractServiceLocationsConfigVoCollectionFromContractServiceLocationsConfig(map, domainObject.getServiceLocations()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.configuration.domain.objects.ContractConfig extractContractConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ContractConfigurationVo valueObject) 
	{
		return 	extractContractConfig(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.configuration.domain.objects.ContractConfig extractContractConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ContractConfigurationVo valueObject, HashMap domMap) 
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
			// ims.RefMan.vo.ContractConfigurationVo ID_ContractConfig field is unknown
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

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getContractId() != null && valueObject.getContractId().equals(""))
		{
			valueObject.setContractId(null);
		}
		domainObject.setContractId(valueObject.getContractId());
		ims.core.resource.place.domain.objects.Organisation value2 = null;
		if ( null != valueObject.getContractOrganisation() ) 
		{
			if (valueObject.getContractOrganisation().getBoId() == null)
			{
				if (domMap.get(valueObject.getContractOrganisation()) != null)
				{
					value2 = (ims.core.resource.place.domain.objects.Organisation)domMap.get(valueObject.getContractOrganisation());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getContractOrganisation();	
			}
			else
			{
				value2 = (ims.core.resource.place.domain.objects.Organisation)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Organisation.class, valueObject.getContractOrganisation().getBoId());
			}
		}
		domainObject.setContractOrganisation(value2);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getContractName() != null && valueObject.getContractName().equals(""))
		{
			valueObject.setContractName(null);
		}
		domainObject.setContractName(valueObject.getContractName());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value4);
		domainObject.setServiceLocations(ims.RefMan.vo.domain.ContractServiceLocationsConfigVoAssembler.extractContractServiceLocationsConfigList(domainFactory, valueObject.getServiceLocations(), domainObject.getServiceLocations(), domMap));		

		return domainObject;
	}

}
