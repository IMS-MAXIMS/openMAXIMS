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
 * @author George Cristian Josan
 */
public class ClinicalOutcomeLiteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.ClinicalOutcomeLiteVo copy(ims.RefMan.vo.ClinicalOutcomeLiteVo valueObjectDest, ims.RefMan.vo.ClinicalOutcomeLiteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ClinicalOutcome(valueObjectSrc.getID_ClinicalOutcome());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ClinicalOutcome
		valueObjectDest.setClinicalOutcome(valueObjectSrc.getClinicalOutcome());
		// Date
		valueObjectDest.setDate(valueObjectSrc.getDate());
		// Procedure
		valueObjectDest.setProcedure(valueObjectSrc.getProcedure());
		// ClinicalOutcomeContext
		valueObjectDest.setClinicalOutcomeContext(valueObjectSrc.getClinicalOutcomeContext());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createClinicalOutcomeLiteVoCollectionFromClinicalOutcome(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.ClinicalOutcome objects.
	 */
	public static ims.RefMan.vo.ClinicalOutcomeLiteVoCollection createClinicalOutcomeLiteVoCollectionFromClinicalOutcome(java.util.Set domainObjectSet)	
	{
		return createClinicalOutcomeLiteVoCollectionFromClinicalOutcome(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.ClinicalOutcome objects.
	 */
	public static ims.RefMan.vo.ClinicalOutcomeLiteVoCollection createClinicalOutcomeLiteVoCollectionFromClinicalOutcome(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.ClinicalOutcomeLiteVoCollection voList = new ims.RefMan.vo.ClinicalOutcomeLiteVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.ClinicalOutcome domainObject = (ims.RefMan.domain.objects.ClinicalOutcome) iterator.next();
			ims.RefMan.vo.ClinicalOutcomeLiteVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.ClinicalOutcome objects.
	 */
	public static ims.RefMan.vo.ClinicalOutcomeLiteVoCollection createClinicalOutcomeLiteVoCollectionFromClinicalOutcome(java.util.List domainObjectList) 
	{
		return createClinicalOutcomeLiteVoCollectionFromClinicalOutcome(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.ClinicalOutcome objects.
	 */
	public static ims.RefMan.vo.ClinicalOutcomeLiteVoCollection createClinicalOutcomeLiteVoCollectionFromClinicalOutcome(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.ClinicalOutcomeLiteVoCollection voList = new ims.RefMan.vo.ClinicalOutcomeLiteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.ClinicalOutcome domainObject = (ims.RefMan.domain.objects.ClinicalOutcome) domainObjectList.get(i);
			ims.RefMan.vo.ClinicalOutcomeLiteVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.ClinicalOutcome set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractClinicalOutcomeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ClinicalOutcomeLiteVoCollection voCollection) 
	 {
	 	return extractClinicalOutcomeSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractClinicalOutcomeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ClinicalOutcomeLiteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ClinicalOutcomeLiteVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.ClinicalOutcome domainObject = ClinicalOutcomeLiteVoAssembler.extractClinicalOutcome(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.ClinicalOutcome list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractClinicalOutcomeList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ClinicalOutcomeLiteVoCollection voCollection) 
	 {
	 	return extractClinicalOutcomeList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractClinicalOutcomeList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ClinicalOutcomeLiteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ClinicalOutcomeLiteVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.ClinicalOutcome domainObject = ClinicalOutcomeLiteVoAssembler.extractClinicalOutcome(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.ClinicalOutcome object.
	 * @param domainObject ims.RefMan.domain.objects.ClinicalOutcome
	 */
	 public static ims.RefMan.vo.ClinicalOutcomeLiteVo create(ims.RefMan.domain.objects.ClinicalOutcome domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.ClinicalOutcome object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.ClinicalOutcomeLiteVo create(DomainObjectMap map, ims.RefMan.domain.objects.ClinicalOutcome domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.ClinicalOutcomeLiteVo valueObject = (ims.RefMan.vo.ClinicalOutcomeLiteVo) map.getValueObject(domainObject, ims.RefMan.vo.ClinicalOutcomeLiteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.ClinicalOutcomeLiteVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.ClinicalOutcome
	 */
	 public static ims.RefMan.vo.ClinicalOutcomeLiteVo insert(ims.RefMan.vo.ClinicalOutcomeLiteVo valueObject, ims.RefMan.domain.objects.ClinicalOutcome domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.ClinicalOutcome
	 */
	 public static ims.RefMan.vo.ClinicalOutcomeLiteVo insert(DomainObjectMap map, ims.RefMan.vo.ClinicalOutcomeLiteVo valueObject, ims.RefMan.domain.objects.ClinicalOutcome domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ClinicalOutcome(domainObject.getId());
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
			
		// ClinicalOutcome
		valueObject.setClinicalOutcome(ims.clinicaladmin.vo.domain.ClinicalOutcomeConfigLiteVoAssembler.create(map, domainObject.getClinicalOutcome()) );
		// Date
		java.util.Date Date = domainObject.getDate();
		if ( null != Date ) 
		{
			valueObject.setDate(new ims.framework.utils.Date(Date) );
		}
		// Procedure
		valueObject.setProcedure(ims.RefMan.vo.domain.ClinicalOutcomeProcedureVoAssembler.create(map, domainObject.getProcedure()) );
		// ClinicalOutcomeContext
		ims.domain.lookups.LookupInstance instance4 = domainObject.getClinicalOutcomeContext();
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

			ims.RefMan.vo.lookups.ClinicalOutcomeContext voLookup4 = new ims.RefMan.vo.lookups.ClinicalOutcomeContext(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ClinicalOutcomeContext parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.RefMan.vo.lookups.ClinicalOutcomeContext(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setClinicalOutcomeContext(voLookup4);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.ClinicalOutcome extractClinicalOutcome(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ClinicalOutcomeLiteVo valueObject) 
	{
		return 	extractClinicalOutcome(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.ClinicalOutcome extractClinicalOutcome(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ClinicalOutcomeLiteVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ClinicalOutcome();
		ims.RefMan.domain.objects.ClinicalOutcome domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.ClinicalOutcome)domMap.get(valueObject);
			}
			// ims.RefMan.vo.ClinicalOutcomeLiteVo ID_ClinicalOutcome field is unknown
			domainObject = new ims.RefMan.domain.objects.ClinicalOutcome();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ClinicalOutcome());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.ClinicalOutcome)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.ClinicalOutcome) domainFactory.getDomainObject(ims.RefMan.domain.objects.ClinicalOutcome.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ClinicalOutcome());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.clinical.configuration.domain.objects.ClinicalOutcomeConfig value1 = null;
		if ( null != valueObject.getClinicalOutcome() ) 
		{
			if (valueObject.getClinicalOutcome().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalOutcome()) != null)
				{
					value1 = (ims.clinical.configuration.domain.objects.ClinicalOutcomeConfig)domMap.get(valueObject.getClinicalOutcome());
				}
			}
			else
			{
				value1 = (ims.clinical.configuration.domain.objects.ClinicalOutcomeConfig)domainFactory.getDomainObject(ims.clinical.configuration.domain.objects.ClinicalOutcomeConfig.class, valueObject.getClinicalOutcome().getBoId());
			}
		}
		domainObject.setClinicalOutcome(value1);
		java.util.Date value2 = null;
		ims.framework.utils.Date date2 = valueObject.getDate();		
		if ( date2 != null ) 
		{
			value2 = date2.getDate();
		}
		domainObject.setDate(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.IntraOperativeCareRecord value3 = null;
		if ( null != valueObject.getProcedure() ) 
		{
			if (valueObject.getProcedure().getBoId() == null)
			{
				if (domMap.get(valueObject.getProcedure()) != null)
				{
					value3 = (ims.core.clinical.domain.objects.IntraOperativeCareRecord)domMap.get(valueObject.getProcedure());
				}
			}
			else
			{
				value3 = (ims.core.clinical.domain.objects.IntraOperativeCareRecord)domainFactory.getDomainObject(ims.core.clinical.domain.objects.IntraOperativeCareRecord.class, valueObject.getProcedure().getBoId());
			}
		}
		domainObject.setProcedure(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getClinicalOutcomeContext() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getClinicalOutcomeContext().getID());
		}
		domainObject.setClinicalOutcomeContext(value4);

		return domainObject;
	}

}
