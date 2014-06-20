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
 * @author Bogdan Tofei
 */
public class WaitingListConfigVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.WaitingListConfigVo copy(ims.RefMan.vo.WaitingListConfigVo valueObjectDest, ims.RefMan.vo.WaitingListConfigVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ElectiveListConfiguration(valueObjectSrc.getID_ElectiveListConfiguration());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// WaitingListName
		valueObjectDest.setWaitingListName(valueObjectSrc.getWaitingListName());
		// StartDate
		valueObjectDest.setStartDate(valueObjectSrc.getStartDate());
		// EndDate
		valueObjectDest.setEndDate(valueObjectSrc.getEndDate());
		// Service
		valueObjectDest.setService(valueObjectSrc.getService());
		// WaitingListCode
		valueObjectDest.setWaitingListCode(valueObjectSrc.getWaitingListCode());
		// IsActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// HCPs
		valueObjectDest.setHCPs(valueObjectSrc.getHCPs());
		// ListLocations
		valueObjectDest.setListLocations(valueObjectSrc.getListLocations());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createWaitingListConfigVoCollectionFromElectiveListConfiguration(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.configuration.domain.objects.ElectiveListConfiguration objects.
	 */
	public static ims.RefMan.vo.WaitingListConfigVoCollection createWaitingListConfigVoCollectionFromElectiveListConfiguration(java.util.Set domainObjectSet)	
	{
		return createWaitingListConfigVoCollectionFromElectiveListConfiguration(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.configuration.domain.objects.ElectiveListConfiguration objects.
	 */
	public static ims.RefMan.vo.WaitingListConfigVoCollection createWaitingListConfigVoCollectionFromElectiveListConfiguration(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.WaitingListConfigVoCollection voList = new ims.RefMan.vo.WaitingListConfigVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.configuration.domain.objects.ElectiveListConfiguration domainObject = (ims.core.configuration.domain.objects.ElectiveListConfiguration) iterator.next();
			ims.RefMan.vo.WaitingListConfigVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.configuration.domain.objects.ElectiveListConfiguration objects.
	 */
	public static ims.RefMan.vo.WaitingListConfigVoCollection createWaitingListConfigVoCollectionFromElectiveListConfiguration(java.util.List domainObjectList) 
	{
		return createWaitingListConfigVoCollectionFromElectiveListConfiguration(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.configuration.domain.objects.ElectiveListConfiguration objects.
	 */
	public static ims.RefMan.vo.WaitingListConfigVoCollection createWaitingListConfigVoCollectionFromElectiveListConfiguration(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.WaitingListConfigVoCollection voList = new ims.RefMan.vo.WaitingListConfigVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.configuration.domain.objects.ElectiveListConfiguration domainObject = (ims.core.configuration.domain.objects.ElectiveListConfiguration) domainObjectList.get(i);
			ims.RefMan.vo.WaitingListConfigVo vo = create(map, domainObject);

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
	 * Create the ims.core.configuration.domain.objects.ElectiveListConfiguration set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractElectiveListConfigurationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.WaitingListConfigVoCollection voCollection) 
	 {
	 	return extractElectiveListConfigurationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractElectiveListConfigurationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.WaitingListConfigVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.WaitingListConfigVo vo = voCollection.get(i);
			ims.core.configuration.domain.objects.ElectiveListConfiguration domainObject = WaitingListConfigVoAssembler.extractElectiveListConfiguration(domainFactory, vo, domMap);

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
	 * Create the ims.core.configuration.domain.objects.ElectiveListConfiguration list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractElectiveListConfigurationList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.WaitingListConfigVoCollection voCollection) 
	 {
	 	return extractElectiveListConfigurationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractElectiveListConfigurationList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.WaitingListConfigVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.WaitingListConfigVo vo = voCollection.get(i);
			ims.core.configuration.domain.objects.ElectiveListConfiguration domainObject = WaitingListConfigVoAssembler.extractElectiveListConfiguration(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.configuration.domain.objects.ElectiveListConfiguration object.
	 * @param domainObject ims.core.configuration.domain.objects.ElectiveListConfiguration
	 */
	 public static ims.RefMan.vo.WaitingListConfigVo create(ims.core.configuration.domain.objects.ElectiveListConfiguration domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.configuration.domain.objects.ElectiveListConfiguration object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.WaitingListConfigVo create(DomainObjectMap map, ims.core.configuration.domain.objects.ElectiveListConfiguration domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.WaitingListConfigVo valueObject = (ims.RefMan.vo.WaitingListConfigVo) map.getValueObject(domainObject, ims.RefMan.vo.WaitingListConfigVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.WaitingListConfigVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.configuration.domain.objects.ElectiveListConfiguration
	 */
	 public static ims.RefMan.vo.WaitingListConfigVo insert(ims.RefMan.vo.WaitingListConfigVo valueObject, ims.core.configuration.domain.objects.ElectiveListConfiguration domainObject) 
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
	 * @param domainObject ims.core.configuration.domain.objects.ElectiveListConfiguration
	 */
	 public static ims.RefMan.vo.WaitingListConfigVo insert(DomainObjectMap map, ims.RefMan.vo.WaitingListConfigVo valueObject, ims.core.configuration.domain.objects.ElectiveListConfiguration domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ElectiveListConfiguration(domainObject.getId());
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
			
		// WaitingListName
		valueObject.setWaitingListName(domainObject.getWaitingListName());
		// StartDate
		java.util.Date StartDate = domainObject.getStartDate();
		if ( null != StartDate ) 
		{
			valueObject.setStartDate(new ims.framework.utils.Date(StartDate) );
		}
		// EndDate
		java.util.Date EndDate = domainObject.getEndDate();
		if ( null != EndDate ) 
		{
			valueObject.setEndDate(new ims.framework.utils.Date(EndDate) );
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
		// WaitingListCode
		valueObject.setWaitingListCode(domainObject.getWaitingListCode());
		// IsActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// HCPs
		ims.core.configuration.vo.ElectiveListConsultationConfigurationRefVoCollection HCPs = new ims.core.configuration.vo.ElectiveListConsultationConfigurationRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getHCPs().iterator(); iterator.hasNext(); ) 
		{
			ims.core.configuration.domain.objects.ElectiveListConsultationConfiguration tmp = (ims.core.configuration.domain.objects.ElectiveListConsultationConfiguration)iterator.next();
			if (tmp != null)
				HCPs.add(new ims.core.configuration.vo.ElectiveListConsultationConfigurationRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setHCPs(HCPs);
		// ListLocations
		ims.core.configuration.vo.ElectiveListHospitalConfigurationRefVoCollection ListLocations = new ims.core.configuration.vo.ElectiveListHospitalConfigurationRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getListLocations().iterator(); iterator.hasNext(); ) 
		{
			ims.core.configuration.domain.objects.ElectiveListHospitalConfiguration tmp = (ims.core.configuration.domain.objects.ElectiveListHospitalConfiguration)iterator.next();
			if (tmp != null)
				ListLocations.add(new ims.core.configuration.vo.ElectiveListHospitalConfigurationRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setListLocations(ListLocations);
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.configuration.domain.objects.ElectiveListConfiguration extractElectiveListConfiguration(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.WaitingListConfigVo valueObject) 
	{
		return 	extractElectiveListConfiguration(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.configuration.domain.objects.ElectiveListConfiguration extractElectiveListConfiguration(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.WaitingListConfigVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ElectiveListConfiguration();
		ims.core.configuration.domain.objects.ElectiveListConfiguration domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.configuration.domain.objects.ElectiveListConfiguration)domMap.get(valueObject);
			}
			// ims.RefMan.vo.WaitingListConfigVo ID_ElectiveListConfiguration field is unknown
			domainObject = new ims.core.configuration.domain.objects.ElectiveListConfiguration();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ElectiveListConfiguration());
			if (domMap.get(key) != null)
			{
				return (ims.core.configuration.domain.objects.ElectiveListConfiguration)domMap.get(key);
			}
			domainObject = (ims.core.configuration.domain.objects.ElectiveListConfiguration) domainFactory.getDomainObject(ims.core.configuration.domain.objects.ElectiveListConfiguration.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ElectiveListConfiguration());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getWaitingListName() != null && valueObject.getWaitingListName().equals(""))
		{
			valueObject.setWaitingListName(null);
		}
		domainObject.setWaitingListName(valueObject.getWaitingListName());
		java.util.Date value2 = null;
		ims.framework.utils.Date date2 = valueObject.getStartDate();		
		if ( date2 != null ) 
		{
			value2 = date2.getDate();
		}
		domainObject.setStartDate(value2);
		java.util.Date value3 = null;
		ims.framework.utils.Date date3 = valueObject.getEndDate();		
		if ( date3 != null ) 
		{
			value3 = date3.getDate();
		}
		domainObject.setEndDate(value3);
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
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getService();	
			}
			else
			{
				value4 = (ims.core.clinical.domain.objects.Service)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Service.class, valueObject.getService().getBoId());
			}
		}
		domainObject.setService(value4);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getWaitingListCode() != null && valueObject.getWaitingListCode().equals(""))
		{
			valueObject.setWaitingListCode(null);
		}
		domainObject.setWaitingListCode(valueObject.getWaitingListCode());
		domainObject.setIsActive(valueObject.getIsActive());

		ims.core.configuration.vo.ElectiveListConsultationConfigurationRefVoCollection refCollection7 = valueObject.getHCPs();
		int size7 = (null == refCollection7) ? 0 : refCollection7.size();		
		java.util.List domainHCPs7 = domainObject.getHCPs();
		if (domainHCPs7 == null)
		{
			domainHCPs7 = new java.util.ArrayList();
		}
		for(int i=0; i < size7; i++) 
		{
			ims.core.configuration.vo.ElectiveListConsultationConfigurationRefVo vo = refCollection7.get(i);			
			ims.core.configuration.domain.objects.ElectiveListConsultationConfiguration dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.configuration.domain.objects.ElectiveListConsultationConfiguration)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.configuration.domain.objects.ElectiveListConsultationConfiguration)domainFactory.getDomainObject( ims.core.configuration.domain.objects.ElectiveListConsultationConfiguration.class, vo.getBoId());
				}
			}

			int domIdx = domainHCPs7.indexOf(dom);
			if (domIdx == -1)
			{
				domainHCPs7.add(i, dom);
			}
			else if (i != domIdx && i < domainHCPs7.size())
			{
				Object tmp = domainHCPs7.get(i);
				domainHCPs7.set(i, domainHCPs7.get(domIdx));
				domainHCPs7.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i7 = domainHCPs7.size();
		while (i7 > size7)
		{
			domainHCPs7.remove(i7-1);
			i7 = domainHCPs7.size();
		}
		
		domainObject.setHCPs(domainHCPs7);		

		ims.core.configuration.vo.ElectiveListHospitalConfigurationRefVoCollection refCollection8 = valueObject.getListLocations();
		int size8 = (null == refCollection8) ? 0 : refCollection8.size();		
		java.util.List domainListLocations8 = domainObject.getListLocations();
		if (domainListLocations8 == null)
		{
			domainListLocations8 = new java.util.ArrayList();
		}
		for(int i=0; i < size8; i++) 
		{
			ims.core.configuration.vo.ElectiveListHospitalConfigurationRefVo vo = refCollection8.get(i);			
			ims.core.configuration.domain.objects.ElectiveListHospitalConfiguration dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.configuration.domain.objects.ElectiveListHospitalConfiguration)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.configuration.domain.objects.ElectiveListHospitalConfiguration)domainFactory.getDomainObject( ims.core.configuration.domain.objects.ElectiveListHospitalConfiguration.class, vo.getBoId());
				}
			}

			int domIdx = domainListLocations8.indexOf(dom);
			if (domIdx == -1)
			{
				domainListLocations8.add(i, dom);
			}
			else if (i != domIdx && i < domainListLocations8.size())
			{
				Object tmp = domainListLocations8.get(i);
				domainListLocations8.set(i, domainListLocations8.get(domIdx));
				domainListLocations8.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i8 = domainListLocations8.size();
		while (i8 > size8)
		{
			domainListLocations8.remove(i8-1);
			i8 = domainListLocations8.size();
		}
		
		domainObject.setListLocations(domainListLocations8);		

		return domainObject;
	}

}
