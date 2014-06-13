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
 * Generated on 16/04/2014, 12:32
 *
 */
package ims.icp.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Kevin O'Carroll
 */
public class ICPStageVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.icp.vo.ICPStageVo copy(ims.icp.vo.ICPStageVo valueObjectDest, ims.icp.vo.ICPStageVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ICPStage(valueObjectSrc.getID_ICPStage());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Rules
		valueObjectDest.setRules(valueObjectSrc.getRules());
		// Phases
		valueObjectDest.setPhases(valueObjectSrc.getPhases());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// Description
		valueObjectDest.setDescription(valueObjectSrc.getDescription());
		// Sequence
		valueObjectDest.setSequence(valueObjectSrc.getSequence());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// HelpURL
		valueObjectDest.setHelpURL(valueObjectSrc.getHelpURL());
		// IsActivatedOnInitiation
		valueObjectDest.setIsActivatedOnInitiation(valueObjectSrc.getIsActivatedOnInitiation());
		// HasPhase
		valueObjectDest.setHasPhase(valueObjectSrc.getHasPhase());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createICPStageVoCollectionFromICPStage(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.icps.configuration.domain.objects.ICPStage objects.
	 */
	public static ims.icp.vo.ICPStageVoCollection createICPStageVoCollectionFromICPStage(java.util.Set domainObjectSet)	
	{
		return createICPStageVoCollectionFromICPStage(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.icps.configuration.domain.objects.ICPStage objects.
	 */
	public static ims.icp.vo.ICPStageVoCollection createICPStageVoCollectionFromICPStage(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.icp.vo.ICPStageVoCollection voList = new ims.icp.vo.ICPStageVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.icps.configuration.domain.objects.ICPStage domainObject = (ims.icps.configuration.domain.objects.ICPStage) iterator.next();
			ims.icp.vo.ICPStageVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.icps.configuration.domain.objects.ICPStage objects.
	 */
	public static ims.icp.vo.ICPStageVoCollection createICPStageVoCollectionFromICPStage(java.util.List domainObjectList) 
	{
		return createICPStageVoCollectionFromICPStage(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.icps.configuration.domain.objects.ICPStage objects.
	 */
	public static ims.icp.vo.ICPStageVoCollection createICPStageVoCollectionFromICPStage(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.icp.vo.ICPStageVoCollection voList = new ims.icp.vo.ICPStageVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.icps.configuration.domain.objects.ICPStage domainObject = (ims.icps.configuration.domain.objects.ICPStage) domainObjectList.get(i);
			ims.icp.vo.ICPStageVo vo = create(map, domainObject);

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
	 * Create the ims.icps.configuration.domain.objects.ICPStage set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractICPStageSet(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.ICPStageVoCollection voCollection) 
	 {
	 	return extractICPStageSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractICPStageSet(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.ICPStageVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.icp.vo.ICPStageVo vo = voCollection.get(i);
			ims.icps.configuration.domain.objects.ICPStage domainObject = ICPStageVoAssembler.extractICPStage(domainFactory, vo, domMap);

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
	 * Create the ims.icps.configuration.domain.objects.ICPStage list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractICPStageList(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.ICPStageVoCollection voCollection) 
	 {
	 	return extractICPStageList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractICPStageList(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.ICPStageVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.icp.vo.ICPStageVo vo = voCollection.get(i);
			ims.icps.configuration.domain.objects.ICPStage domainObject = ICPStageVoAssembler.extractICPStage(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.icps.configuration.domain.objects.ICPStage object.
	 * @param domainObject ims.icps.configuration.domain.objects.ICPStage
	 */
	 public static ims.icp.vo.ICPStageVo create(ims.icps.configuration.domain.objects.ICPStage domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.icps.configuration.domain.objects.ICPStage object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.icp.vo.ICPStageVo create(DomainObjectMap map, ims.icps.configuration.domain.objects.ICPStage domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.icp.vo.ICPStageVo valueObject = (ims.icp.vo.ICPStageVo) map.getValueObject(domainObject, ims.icp.vo.ICPStageVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.icp.vo.ICPStageVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.icps.configuration.domain.objects.ICPStage
	 */
	 public static ims.icp.vo.ICPStageVo insert(ims.icp.vo.ICPStageVo valueObject, ims.icps.configuration.domain.objects.ICPStage domainObject) 
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
	 * @param domainObject ims.icps.configuration.domain.objects.ICPStage
	 */
	 public static ims.icp.vo.ICPStageVo insert(DomainObjectMap map, ims.icp.vo.ICPStageVo valueObject, ims.icps.configuration.domain.objects.ICPStage domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ICPStage(domainObject.getId());
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
			
		// Rules
		valueObject.setRules(ims.admin.vo.domain.BusinessRuleVoAssembler.createBusinessRuleVoCollectionFromBusinessRule(map, domainObject.getRules()) );
		// Phases
		valueObject.setPhases(ims.icp.vo.domain.ICPPhaseLiteVoAssembler.createICPPhaseLiteVoCollectionFromICPPhase(map, domainObject.getPhases()) );
		// Name
		valueObject.setName(domainObject.getName());
		// Description
		valueObject.setDescription(domainObject.getDescription());
		// Sequence
		valueObject.setSequence(domainObject.getSequence());
		// Status
		ims.domain.lookups.LookupInstance instance6 = domainObject.getStatus();
		if ( null != instance6 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance6.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance6.getImage().getImageId(), instance6.getImage().getImagePath());
			}
			color = instance6.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup6 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup6 = voLookup6;
			ims.domain.lookups.LookupInstance parent6 = instance6.getParent();
			while (parent6 != null)
			{
				if (parent6.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent6.getImage().getImageId(), parent6.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent6.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup6.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setStatus(voLookup6);
		}
				// HelpURL
		valueObject.setHelpURL(domainObject.getHelpURL());
		// IsActivatedOnInitiation
		valueObject.setIsActivatedOnInitiation( domainObject.isIsActivatedOnInitiation() );
		// HasPhase
		valueObject.setHasPhase( domainObject.isHasPhase() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.icps.configuration.domain.objects.ICPStage extractICPStage(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.ICPStageVo valueObject) 
	{
		return 	extractICPStage(domainFactory, valueObject, new HashMap());
	}

	public static ims.icps.configuration.domain.objects.ICPStage extractICPStage(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.ICPStageVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ICPStage();
		ims.icps.configuration.domain.objects.ICPStage domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.icps.configuration.domain.objects.ICPStage)domMap.get(valueObject);
			}
			// ims.icp.vo.ICPStageVo ID_ICPStage field is unknown
			domainObject = new ims.icps.configuration.domain.objects.ICPStage();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ICPStage());
			if (domMap.get(key) != null)
			{
				return (ims.icps.configuration.domain.objects.ICPStage)domMap.get(key);
			}
			domainObject = (ims.icps.configuration.domain.objects.ICPStage) domainFactory.getDomainObject(ims.icps.configuration.domain.objects.ICPStage.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ICPStage());

		domainObject.setRules(ims.admin.vo.domain.BusinessRuleVoAssembler.extractBusinessRuleSet(domainFactory, valueObject.getRules(), domainObject.getRules(), domMap));		

		// SaveAsRefVO treated as RefValueObject
		ims.icps.configuration.vo.ICPPhaseRefVoCollection refCollection2 = new ims.icps.configuration.vo.ICPPhaseRefVoCollection();
		if (valueObject.getPhases() != null)
		{
			for (int i2=0; i2<valueObject.getPhases().size(); i2++)
			{
				ims.icps.configuration.vo.ICPPhaseRefVo ref2 = (ims.icps.configuration.vo.ICPPhaseRefVo)valueObject.getPhases().get(i2);
				refCollection2.add(ref2);
			}
		}
		int size2 = (null == refCollection2) ? 0 : refCollection2.size();		
		java.util.List domainPhases2 = domainObject.getPhases();
		if (domainPhases2 == null)
		{
			domainPhases2 = new java.util.ArrayList();
		}
		for(int i=0; i < size2; i++) 
		{
			ims.icps.configuration.vo.ICPPhaseRefVo vo = refCollection2.get(i);			
			ims.icps.configuration.domain.objects.ICPPhase dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.icps.configuration.domain.objects.ICPPhase)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.icps.configuration.domain.objects.ICPPhase)domainFactory.getDomainObject( ims.icps.configuration.domain.objects.ICPPhase.class, vo.getBoId());
				}
			}

			int domIdx = domainPhases2.indexOf(dom);
			if (domIdx == -1)
			{
				domainPhases2.add(i, dom);
			}
			else if (i != domIdx && i < domainPhases2.size())
			{
				Object tmp = domainPhases2.get(i);
				domainPhases2.set(i, domainPhases2.get(domIdx));
				domainPhases2.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i2 = domainPhases2.size();
		while (i2 > size2)
		{
			domainPhases2.remove(i2-1);
			i2 = domainPhases2.size();
		}
		
		domainObject.setPhases(domainPhases2);		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDescription() != null && valueObject.getDescription().equals(""))
		{
			valueObject.setDescription(null);
		}
		domainObject.setDescription(valueObject.getDescription());
		domainObject.setSequence(valueObject.getSequence());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value6);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getHelpURL() != null && valueObject.getHelpURL().equals(""))
		{
			valueObject.setHelpURL(null);
		}
		domainObject.setHelpURL(valueObject.getHelpURL());
		domainObject.setIsActivatedOnInitiation(valueObject.getIsActivatedOnInitiation());
		domainObject.setHasPhase(valueObject.getHasPhase());

		return domainObject;
	}

}
