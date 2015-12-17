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
public class OrganisationConfigVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.OrganisationConfigVo copy(ims.RefMan.vo.OrganisationConfigVo valueObjectDest, ims.RefMan.vo.OrganisationConfigVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Organisation(valueObjectSrc.getID_Organisation());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// LocationSites
		valueObjectDest.setLocationSites(valueObjectSrc.getLocationSites());
		// UpperName
		valueObjectDest.setUpperName(valueObjectSrc.getUpperName());
		// Comment
		valueObjectDest.setComment(valueObjectSrc.getComment());
		// relatedOrganisations
		valueObjectDest.setRelatedOrganisations(valueObjectSrc.getRelatedOrganisations());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createOrganisationConfigVoCollectionFromOrganisation(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.resource.place.domain.objects.Organisation objects.
	 */
	public static ims.RefMan.vo.OrganisationConfigVoCollection createOrganisationConfigVoCollectionFromOrganisation(java.util.Set domainObjectSet)	
	{
		return createOrganisationConfigVoCollectionFromOrganisation(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.resource.place.domain.objects.Organisation objects.
	 */
	public static ims.RefMan.vo.OrganisationConfigVoCollection createOrganisationConfigVoCollectionFromOrganisation(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.OrganisationConfigVoCollection voList = new ims.RefMan.vo.OrganisationConfigVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.resource.place.domain.objects.Organisation domainObject = (ims.core.resource.place.domain.objects.Organisation) iterator.next();
			ims.RefMan.vo.OrganisationConfigVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.resource.place.domain.objects.Organisation objects.
	 */
	public static ims.RefMan.vo.OrganisationConfigVoCollection createOrganisationConfigVoCollectionFromOrganisation(java.util.List domainObjectList) 
	{
		return createOrganisationConfigVoCollectionFromOrganisation(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.resource.place.domain.objects.Organisation objects.
	 */
	public static ims.RefMan.vo.OrganisationConfigVoCollection createOrganisationConfigVoCollectionFromOrganisation(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.OrganisationConfigVoCollection voList = new ims.RefMan.vo.OrganisationConfigVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.resource.place.domain.objects.Organisation domainObject = (ims.core.resource.place.domain.objects.Organisation) domainObjectList.get(i);
			ims.RefMan.vo.OrganisationConfigVo vo = create(map, domainObject);

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
	 * Create the ims.core.resource.place.domain.objects.Organisation set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractOrganisationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.OrganisationConfigVoCollection voCollection) 
	 {
	 	return extractOrganisationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOrganisationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.OrganisationConfigVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.OrganisationConfigVo vo = voCollection.get(i);
			ims.core.resource.place.domain.objects.Organisation domainObject = OrganisationConfigVoAssembler.extractOrganisation(domainFactory, vo, domMap);

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
	 * Create the ims.core.resource.place.domain.objects.Organisation list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractOrganisationList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.OrganisationConfigVoCollection voCollection) 
	 {
	 	return extractOrganisationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOrganisationList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.OrganisationConfigVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.OrganisationConfigVo vo = voCollection.get(i);
			ims.core.resource.place.domain.objects.Organisation domainObject = OrganisationConfigVoAssembler.extractOrganisation(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.resource.place.domain.objects.Organisation object.
	 * @param domainObject ims.core.resource.place.domain.objects.Organisation
	 */
	 public static ims.RefMan.vo.OrganisationConfigVo create(ims.core.resource.place.domain.objects.Organisation domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.resource.place.domain.objects.Organisation object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.OrganisationConfigVo create(DomainObjectMap map, ims.core.resource.place.domain.objects.Organisation domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.OrganisationConfigVo valueObject = (ims.RefMan.vo.OrganisationConfigVo) map.getValueObject(domainObject, ims.RefMan.vo.OrganisationConfigVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.OrganisationConfigVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.resource.place.domain.objects.Organisation
	 */
	 public static ims.RefMan.vo.OrganisationConfigVo insert(ims.RefMan.vo.OrganisationConfigVo valueObject, ims.core.resource.place.domain.objects.Organisation domainObject) 
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
	 * @param domainObject ims.core.resource.place.domain.objects.Organisation
	 */
	 public static ims.RefMan.vo.OrganisationConfigVo insert(DomainObjectMap map, ims.RefMan.vo.OrganisationConfigVo valueObject, ims.core.resource.place.domain.objects.Organisation domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Organisation(domainObject.getId());
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
			
		// Name
		valueObject.setName(domainObject.getName());
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// LocationSites
		valueObject.setLocationSites(ims.RefMan.vo.domain.LocationSiteConfigVoAssembler.createLocationSiteConfigVoCollectionFromLocSite(map, domainObject.getLocationSites()) );
		// UpperName
		valueObject.setUpperName(domainObject.getUpperName());
		// Comment
		valueObject.setComment(domainObject.getComment());
		// relatedOrganisations
		valueObject.setRelatedOrganisations(ims.RefMan.vo.domain.OrganisationConfigVoAssembler.createOrganisationConfigVoCollectionFromOrganisation(map, domainObject.getRelatedOrganisations()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.resource.place.domain.objects.Organisation extractOrganisation(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.OrganisationConfigVo valueObject) 
	{
		return 	extractOrganisation(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.resource.place.domain.objects.Organisation extractOrganisation(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.OrganisationConfigVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Organisation();
		ims.core.resource.place.domain.objects.Organisation domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.resource.place.domain.objects.Organisation)domMap.get(valueObject);
			}
			// ims.RefMan.vo.OrganisationConfigVo ID_Organisation field is unknown
			domainObject = new ims.core.resource.place.domain.objects.Organisation();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Organisation());
			if (domMap.get(key) != null)
			{
				return (ims.core.resource.place.domain.objects.Organisation)domMap.get(key);
			}
			domainObject = (ims.core.resource.place.domain.objects.Organisation) domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Organisation.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Organisation());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());
		domainObject.setIsActive(valueObject.getIsActive());
		domainObject.setLocationSites(ims.RefMan.vo.domain.LocationSiteConfigVoAssembler.extractLocSiteSet(domainFactory, valueObject.getLocationSites(), domainObject.getLocationSites(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getUpperName() != null && valueObject.getUpperName().equals(""))
		{
			valueObject.setUpperName(null);
		}
		domainObject.setUpperName(valueObject.getUpperName());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComment() != null && valueObject.getComment().equals(""))
		{
			valueObject.setComment(null);
		}
		domainObject.setComment(valueObject.getComment());

		// SaveAsRefVO treated as RefValueObject
		ims.core.resource.place.vo.OrganisationRefVoCollection refCollection6 = new ims.core.resource.place.vo.OrganisationRefVoCollection();
		if (valueObject.getRelatedOrganisations() != null)
		{
			for (int i6=0; i6<valueObject.getRelatedOrganisations().size(); i6++)
			{
				ims.core.resource.place.vo.OrganisationRefVo ref6 = (ims.core.resource.place.vo.OrganisationRefVo)valueObject.getRelatedOrganisations().get(i6);
				refCollection6.add(ref6);
			}
		}
		int size6 = (null == refCollection6) ? 0 : refCollection6.size();		
		java.util.Set domainRelatedOrganisations6 = domainObject.getRelatedOrganisations();
		if (domainRelatedOrganisations6 == null)
		{
			domainRelatedOrganisations6 = new java.util.HashSet();
		}
		java.util.Set newSet6  = new java.util.HashSet();
		for(int i=0; i<size6; i++) 
		{
			ims.core.resource.place.vo.OrganisationRefVo vo = refCollection6.get(i);					
			ims.core.resource.place.domain.objects.Organisation dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.resource.place.domain.objects.Organisation)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.resource.place.domain.objects.Organisation)domainFactory.getDomainObject( ims.core.resource.place.domain.objects.Organisation.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainRelatedOrganisations6.contains(dom))
			{
				domainRelatedOrganisations6.add(dom);
			}
			newSet6.add(dom);			
		}
		java.util.Set removedSet6 = new java.util.HashSet();
		java.util.Iterator iter6 = domainRelatedOrganisations6.iterator();
		//Find out which objects need to be removed
		while (iter6.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter6.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet6.contains(o))
			{
				removedSet6.add(o);
			}
		}
		iter6 = removedSet6.iterator();
		//Remove the unwanted objects
		while (iter6.hasNext())
		{
			domainRelatedOrganisations6.remove(iter6.next());
		}		
		
		domainObject.setRelatedOrganisations(domainRelatedOrganisations6);		

		return domainObject;
	}

}
