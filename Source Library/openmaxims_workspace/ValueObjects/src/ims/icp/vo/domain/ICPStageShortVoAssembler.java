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
 * @author George Cristian Josan
 */
public class ICPStageShortVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.icp.vo.ICPStageShortVo copy(ims.icp.vo.ICPStageShortVo valueObjectDest, ims.icp.vo.ICPStageShortVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ICPStage(valueObjectSrc.getID_ICPStage());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
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
 	 * If more than one call to an Assembler is made then #createICPStageShortVoCollectionFromICPStage(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.icps.configuration.domain.objects.ICPStage objects.
	 */
	public static ims.icp.vo.ICPStageShortVoCollection createICPStageShortVoCollectionFromICPStage(java.util.Set domainObjectSet)	
	{
		return createICPStageShortVoCollectionFromICPStage(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.icps.configuration.domain.objects.ICPStage objects.
	 */
	public static ims.icp.vo.ICPStageShortVoCollection createICPStageShortVoCollectionFromICPStage(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.icp.vo.ICPStageShortVoCollection voList = new ims.icp.vo.ICPStageShortVoCollection();
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
			ims.icp.vo.ICPStageShortVo vo = create(map, domainObject);
			
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
	public static ims.icp.vo.ICPStageShortVoCollection createICPStageShortVoCollectionFromICPStage(java.util.List domainObjectList) 
	{
		return createICPStageShortVoCollectionFromICPStage(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.icps.configuration.domain.objects.ICPStage objects.
	 */
	public static ims.icp.vo.ICPStageShortVoCollection createICPStageShortVoCollectionFromICPStage(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.icp.vo.ICPStageShortVoCollection voList = new ims.icp.vo.ICPStageShortVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.icps.configuration.domain.objects.ICPStage domainObject = (ims.icps.configuration.domain.objects.ICPStage) domainObjectList.get(i);
			ims.icp.vo.ICPStageShortVo vo = create(map, domainObject);

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
	 public static java.util.Set extractICPStageSet(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.ICPStageShortVoCollection voCollection) 
	 {
	 	return extractICPStageSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractICPStageSet(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.ICPStageShortVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.icp.vo.ICPStageShortVo vo = voCollection.get(i);
			ims.icps.configuration.domain.objects.ICPStage domainObject = ICPStageShortVoAssembler.extractICPStage(domainFactory, vo, domMap);

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
	 public static java.util.List extractICPStageList(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.ICPStageShortVoCollection voCollection) 
	 {
	 	return extractICPStageList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractICPStageList(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.ICPStageShortVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.icp.vo.ICPStageShortVo vo = voCollection.get(i);
			ims.icps.configuration.domain.objects.ICPStage domainObject = ICPStageShortVoAssembler.extractICPStage(domainFactory, vo, domMap);

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
	 public static ims.icp.vo.ICPStageShortVo create(ims.icps.configuration.domain.objects.ICPStage domainObject) 
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
	  public static ims.icp.vo.ICPStageShortVo create(DomainObjectMap map, ims.icps.configuration.domain.objects.ICPStage domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.icp.vo.ICPStageShortVo valueObject = (ims.icp.vo.ICPStageShortVo) map.getValueObject(domainObject, ims.icp.vo.ICPStageShortVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.icp.vo.ICPStageShortVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.icp.vo.ICPStageShortVo insert(ims.icp.vo.ICPStageShortVo valueObject, ims.icps.configuration.domain.objects.ICPStage domainObject) 
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
	 public static ims.icp.vo.ICPStageShortVo insert(DomainObjectMap map, ims.icp.vo.ICPStageShortVo valueObject, ims.icps.configuration.domain.objects.ICPStage domainObject) 
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
			
		// Phases
		valueObject.setPhases(ims.icp.vo.domain.ICPPhaseLiteVoAssembler.createICPPhaseLiteVoCollectionFromICPPhase(map, domainObject.getPhases()) );
		// Name
		valueObject.setName(domainObject.getName());
		// Description
		valueObject.setDescription(domainObject.getDescription());
		// Sequence
		valueObject.setSequence(domainObject.getSequence());
		// Status
		ims.domain.lookups.LookupInstance instance5 = domainObject.getStatus();
		if ( null != instance5 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance5.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance5.getImage().getImageId(), instance5.getImage().getImagePath());
			}
			color = instance5.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup5 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup5 = voLookup5;
			ims.domain.lookups.LookupInstance parent5 = instance5.getParent();
			while (parent5 != null)
			{
				if (parent5.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent5.getImage().getImageId(), parent5.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent5.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup5.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setStatus(voLookup5);
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
	public static ims.icps.configuration.domain.objects.ICPStage extractICPStage(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.ICPStageShortVo valueObject) 
	{
		return 	extractICPStage(domainFactory, valueObject, new HashMap());
	}

	public static ims.icps.configuration.domain.objects.ICPStage extractICPStage(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.ICPStageShortVo valueObject, HashMap domMap) 
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
			// ims.icp.vo.ICPStageShortVo ID_ICPStage field is unknown
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


		// SaveAsRefVO treated as RefValueObject
		ims.icps.configuration.vo.ICPPhaseRefVoCollection refCollection1 = new ims.icps.configuration.vo.ICPPhaseRefVoCollection();
		if (valueObject.getPhases() != null)
		{
			for (int i1=0; i1<valueObject.getPhases().size(); i1++)
			{
				ims.icps.configuration.vo.ICPPhaseRefVo ref1 = (ims.icps.configuration.vo.ICPPhaseRefVo)valueObject.getPhases().get(i1);
				refCollection1.add(ref1);
			}
		}
		int size1 = (null == refCollection1) ? 0 : refCollection1.size();		
		java.util.List domainPhases1 = domainObject.getPhases();
		if (domainPhases1 == null)
		{
			domainPhases1 = new java.util.ArrayList();
		}
		for(int i=0; i < size1; i++) 
		{
			ims.icps.configuration.vo.ICPPhaseRefVo vo = refCollection1.get(i);			
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

			int domIdx = domainPhases1.indexOf(dom);
			if (domIdx == -1)
			{
				domainPhases1.add(i, dom);
			}
			else if (i != domIdx && i < domainPhases1.size())
			{
				Object tmp = domainPhases1.get(i);
				domainPhases1.set(i, domainPhases1.get(domIdx));
				domainPhases1.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1 = domainPhases1.size();
		while (i1 > size1)
		{
			domainPhases1.remove(i1-1);
			i1 = domainPhases1.size();
		}
		
		domainObject.setPhases(domainPhases1);		
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
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value5);
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
