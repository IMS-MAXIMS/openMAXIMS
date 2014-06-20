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
 * @author Rory Fitzpatrick
 */
public class ChangeOfServiceVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.ChangeOfServiceVo copy(ims.RefMan.vo.ChangeOfServiceVo valueObjectDest, ims.RefMan.vo.ChangeOfServiceVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ChangeOfService(valueObjectSrc.getID_ChangeOfService());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CatsReferral
		valueObjectDest.setCatsReferral(valueObjectSrc.getCatsReferral());
		// NewService
		valueObjectDest.setNewService(valueObjectSrc.getNewService());
		// OriginalService
		valueObjectDest.setOriginalService(valueObjectSrc.getOriginalService());
		// ChangingUser
		valueObjectDest.setChangingUser(valueObjectSrc.getChangingUser());
		// ChangingDateTime
		valueObjectDest.setChangingDateTime(valueObjectSrc.getChangingDateTime());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createChangeOfServiceVoCollectionFromChangeOfService(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.ChangeOfService objects.
	 */
	public static ims.RefMan.vo.ChangeOfServiceVoCollection createChangeOfServiceVoCollectionFromChangeOfService(java.util.Set domainObjectSet)	
	{
		return createChangeOfServiceVoCollectionFromChangeOfService(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.ChangeOfService objects.
	 */
	public static ims.RefMan.vo.ChangeOfServiceVoCollection createChangeOfServiceVoCollectionFromChangeOfService(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.ChangeOfServiceVoCollection voList = new ims.RefMan.vo.ChangeOfServiceVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.ChangeOfService domainObject = (ims.RefMan.domain.objects.ChangeOfService) iterator.next();
			ims.RefMan.vo.ChangeOfServiceVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.ChangeOfService objects.
	 */
	public static ims.RefMan.vo.ChangeOfServiceVoCollection createChangeOfServiceVoCollectionFromChangeOfService(java.util.List domainObjectList) 
	{
		return createChangeOfServiceVoCollectionFromChangeOfService(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.ChangeOfService objects.
	 */
	public static ims.RefMan.vo.ChangeOfServiceVoCollection createChangeOfServiceVoCollectionFromChangeOfService(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.ChangeOfServiceVoCollection voList = new ims.RefMan.vo.ChangeOfServiceVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.ChangeOfService domainObject = (ims.RefMan.domain.objects.ChangeOfService) domainObjectList.get(i);
			ims.RefMan.vo.ChangeOfServiceVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.ChangeOfService set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractChangeOfServiceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ChangeOfServiceVoCollection voCollection) 
	 {
	 	return extractChangeOfServiceSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractChangeOfServiceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ChangeOfServiceVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ChangeOfServiceVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.ChangeOfService domainObject = ChangeOfServiceVoAssembler.extractChangeOfService(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.ChangeOfService list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractChangeOfServiceList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ChangeOfServiceVoCollection voCollection) 
	 {
	 	return extractChangeOfServiceList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractChangeOfServiceList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ChangeOfServiceVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ChangeOfServiceVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.ChangeOfService domainObject = ChangeOfServiceVoAssembler.extractChangeOfService(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.ChangeOfService object.
	 * @param domainObject ims.RefMan.domain.objects.ChangeOfService
	 */
	 public static ims.RefMan.vo.ChangeOfServiceVo create(ims.RefMan.domain.objects.ChangeOfService domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.ChangeOfService object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.ChangeOfServiceVo create(DomainObjectMap map, ims.RefMan.domain.objects.ChangeOfService domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.ChangeOfServiceVo valueObject = (ims.RefMan.vo.ChangeOfServiceVo) map.getValueObject(domainObject, ims.RefMan.vo.ChangeOfServiceVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.ChangeOfServiceVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.ChangeOfService
	 */
	 public static ims.RefMan.vo.ChangeOfServiceVo insert(ims.RefMan.vo.ChangeOfServiceVo valueObject, ims.RefMan.domain.objects.ChangeOfService domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.ChangeOfService
	 */
	 public static ims.RefMan.vo.ChangeOfServiceVo insert(DomainObjectMap map, ims.RefMan.vo.ChangeOfServiceVo valueObject, ims.RefMan.domain.objects.ChangeOfService domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ChangeOfService(domainObject.getId());
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
			
		// CatsReferral
		if (domainObject.getCatsReferral() != null)
		{
			if(domainObject.getCatsReferral() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCatsReferral();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCatsReferral(new ims.RefMan.vo.CatsReferralRefVo(id, -1));				
			}
			else
			{
				valueObject.setCatsReferral(new ims.RefMan.vo.CatsReferralRefVo(domainObject.getCatsReferral().getId(), domainObject.getCatsReferral().getVersion()));
			}
		}
		// NewService
		valueObject.setNewService(ims.core.vo.domain.ServiceLiteVoAssembler.create(map, domainObject.getNewService()) );
		// OriginalService
		valueObject.setOriginalService(ims.core.vo.domain.ServiceLiteVoAssembler.create(map, domainObject.getOriginalService()) );
		// ChangingUser
		valueObject.setChangingUser(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getChangingUser()) );
		// ChangingDateTime
		java.util.Date ChangingDateTime = domainObject.getChangingDateTime();
		if ( null != ChangingDateTime ) 
		{
			valueObject.setChangingDateTime(new ims.framework.utils.DateTime(ChangingDateTime) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.ChangeOfService extractChangeOfService(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ChangeOfServiceVo valueObject) 
	{
		return 	extractChangeOfService(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.ChangeOfService extractChangeOfService(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ChangeOfServiceVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ChangeOfService();
		ims.RefMan.domain.objects.ChangeOfService domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.ChangeOfService)domMap.get(valueObject);
			}
			// ims.RefMan.vo.ChangeOfServiceVo ID_ChangeOfService field is unknown
			domainObject = new ims.RefMan.domain.objects.ChangeOfService();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ChangeOfService());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.ChangeOfService)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.ChangeOfService) domainFactory.getDomainObject(ims.RefMan.domain.objects.ChangeOfService.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ChangeOfService());

		ims.RefMan.domain.objects.CatsReferral value1 = null;
		if ( null != valueObject.getCatsReferral() ) 
		{
			if (valueObject.getCatsReferral().getBoId() == null)
			{
				if (domMap.get(valueObject.getCatsReferral()) != null)
				{
					value1 = (ims.RefMan.domain.objects.CatsReferral)domMap.get(valueObject.getCatsReferral());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getCatsReferral();	
			}
			else
			{
				value1 = (ims.RefMan.domain.objects.CatsReferral)domainFactory.getDomainObject(ims.RefMan.domain.objects.CatsReferral.class, valueObject.getCatsReferral().getBoId());
			}
		}
		domainObject.setCatsReferral(value1);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Service value2 = null;
		if ( null != valueObject.getNewService() ) 
		{
			if (valueObject.getNewService().getBoId() == null)
			{
				if (domMap.get(valueObject.getNewService()) != null)
				{
					value2 = (ims.core.clinical.domain.objects.Service)domMap.get(valueObject.getNewService());
				}
			}
			else
			{
				value2 = (ims.core.clinical.domain.objects.Service)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Service.class, valueObject.getNewService().getBoId());
			}
		}
		domainObject.setNewService(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Service value3 = null;
		if ( null != valueObject.getOriginalService() ) 
		{
			if (valueObject.getOriginalService().getBoId() == null)
			{
				if (domMap.get(valueObject.getOriginalService()) != null)
				{
					value3 = (ims.core.clinical.domain.objects.Service)domMap.get(valueObject.getOriginalService());
				}
			}
			else
			{
				value3 = (ims.core.clinical.domain.objects.Service)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Service.class, valueObject.getOriginalService().getBoId());
			}
		}
		domainObject.setOriginalService(value3);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value4 = null;
		if ( null != valueObject.getChangingUser() ) 
		{
			if (valueObject.getChangingUser().getBoId() == null)
			{
				if (domMap.get(valueObject.getChangingUser()) != null)
				{
					value4 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getChangingUser());
				}
			}
			else
			{
				value4 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getChangingUser().getBoId());
			}
		}
		domainObject.setChangingUser(value4);
		ims.framework.utils.DateTime dateTime5 = valueObject.getChangingDateTime();
		java.util.Date value5 = null;
		if ( dateTime5 != null ) 
		{
			value5 = dateTime5.getJavaDate();
		}
		domainObject.setChangingDateTime(value5);

		return domainObject;
	}

}
