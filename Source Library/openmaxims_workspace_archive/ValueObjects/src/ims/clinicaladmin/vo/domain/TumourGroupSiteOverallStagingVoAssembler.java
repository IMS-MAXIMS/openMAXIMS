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
package ims.clinicaladmin.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class TumourGroupSiteOverallStagingVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinicaladmin.vo.TumourGroupSiteOverallStagingVo copy(ims.clinicaladmin.vo.TumourGroupSiteOverallStagingVo valueObjectDest, ims.clinicaladmin.vo.TumourGroupSiteOverallStagingVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_TumourGroupSiteOverallStaging(valueObjectSrc.getID_TumourGroupSiteOverallStaging());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TGroup
		valueObjectDest.setTGroup(valueObjectSrc.getTGroup());
		// TSite
		valueObjectDest.setTSite(valueObjectSrc.getTSite());
		// TVal
		valueObjectDest.setTVal(valueObjectSrc.getTVal());
		// NVal
		valueObjectDest.setNVal(valueObjectSrc.getNVal());
		// MVal
		valueObjectDest.setMVal(valueObjectSrc.getMVal());
		// HistVal
		valueObjectDest.setHistVal(valueObjectSrc.getHistVal());
		// SerumMarkerVal
		valueObjectDest.setSerumMarkerVal(valueObjectSrc.getSerumMarkerVal());
		// DiffVal
		valueObjectDest.setDiffVal(valueObjectSrc.getDiffVal());
		// OverallStageDescription
		valueObjectDest.setOverallStageDescription(valueObjectSrc.getOverallStageDescription());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// O45
		valueObjectDest.setO45(valueObjectSrc.getO45());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTumourGroupSiteOverallStagingVoCollectionFromTumourGroupSiteOverallStaging(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging objects.
	 */
	public static ims.clinicaladmin.vo.TumourGroupSiteOverallStagingVoCollection createTumourGroupSiteOverallStagingVoCollectionFromTumourGroupSiteOverallStaging(java.util.Set domainObjectSet)	
	{
		return createTumourGroupSiteOverallStagingVoCollectionFromTumourGroupSiteOverallStaging(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging objects.
	 */
	public static ims.clinicaladmin.vo.TumourGroupSiteOverallStagingVoCollection createTumourGroupSiteOverallStagingVoCollectionFromTumourGroupSiteOverallStaging(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinicaladmin.vo.TumourGroupSiteOverallStagingVoCollection voList = new ims.clinicaladmin.vo.TumourGroupSiteOverallStagingVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging domainObject = (ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging) iterator.next();
			ims.clinicaladmin.vo.TumourGroupSiteOverallStagingVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging objects.
	 */
	public static ims.clinicaladmin.vo.TumourGroupSiteOverallStagingVoCollection createTumourGroupSiteOverallStagingVoCollectionFromTumourGroupSiteOverallStaging(java.util.List domainObjectList) 
	{
		return createTumourGroupSiteOverallStagingVoCollectionFromTumourGroupSiteOverallStaging(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging objects.
	 */
	public static ims.clinicaladmin.vo.TumourGroupSiteOverallStagingVoCollection createTumourGroupSiteOverallStagingVoCollectionFromTumourGroupSiteOverallStaging(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinicaladmin.vo.TumourGroupSiteOverallStagingVoCollection voList = new ims.clinicaladmin.vo.TumourGroupSiteOverallStagingVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging domainObject = (ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging) domainObjectList.get(i);
			ims.clinicaladmin.vo.TumourGroupSiteOverallStagingVo vo = create(map, domainObject);

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
	 * Create the ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTumourGroupSiteOverallStagingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.TumourGroupSiteOverallStagingVoCollection voCollection) 
	 {
	 	return extractTumourGroupSiteOverallStagingSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTumourGroupSiteOverallStagingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.TumourGroupSiteOverallStagingVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinicaladmin.vo.TumourGroupSiteOverallStagingVo vo = voCollection.get(i);
			ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging domainObject = TumourGroupSiteOverallStagingVoAssembler.extractTumourGroupSiteOverallStaging(domainFactory, vo, domMap);

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
	 * Create the ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTumourGroupSiteOverallStagingList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.TumourGroupSiteOverallStagingVoCollection voCollection) 
	 {
	 	return extractTumourGroupSiteOverallStagingList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTumourGroupSiteOverallStagingList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.TumourGroupSiteOverallStagingVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinicaladmin.vo.TumourGroupSiteOverallStagingVo vo = voCollection.get(i);
			ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging domainObject = TumourGroupSiteOverallStagingVoAssembler.extractTumourGroupSiteOverallStaging(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging object.
	 * @param domainObject ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging
	 */
	 public static ims.clinicaladmin.vo.TumourGroupSiteOverallStagingVo create(ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinicaladmin.vo.TumourGroupSiteOverallStagingVo create(DomainObjectMap map, ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinicaladmin.vo.TumourGroupSiteOverallStagingVo valueObject = (ims.clinicaladmin.vo.TumourGroupSiteOverallStagingVo) map.getValueObject(domainObject, ims.clinicaladmin.vo.TumourGroupSiteOverallStagingVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinicaladmin.vo.TumourGroupSiteOverallStagingVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging
	 */
	 public static ims.clinicaladmin.vo.TumourGroupSiteOverallStagingVo insert(ims.clinicaladmin.vo.TumourGroupSiteOverallStagingVo valueObject, ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging domainObject) 
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
	 * @param domainObject ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging
	 */
	 public static ims.clinicaladmin.vo.TumourGroupSiteOverallStagingVo insert(DomainObjectMap map, ims.clinicaladmin.vo.TumourGroupSiteOverallStagingVo valueObject, ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_TumourGroupSiteOverallStaging(domainObject.getId());
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
			
		// TGroup
		if (domainObject.getTGroup() != null)
		{
			if(domainObject.getTGroup() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getTGroup();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setTGroup(new ims.oncology.configuration.vo.TumourGroupRefVo(id, -1));				
			}
			else
			{
				valueObject.setTGroup(new ims.oncology.configuration.vo.TumourGroupRefVo(domainObject.getTGroup().getId(), domainObject.getTGroup().getVersion()));
			}
		}
		// TSite
		if (domainObject.getTSite() != null)
		{
			if(domainObject.getTSite() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getTSite();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setTSite(new ims.oncology.configuration.vo.TumourSiteRefVo(id, -1));				
			}
			else
			{
				valueObject.setTSite(new ims.oncology.configuration.vo.TumourSiteRefVo(domainObject.getTSite().getId(), domainObject.getTSite().getVersion()));
			}
		}
		// TVal
		valueObject.setTVal(ims.clinicaladmin.vo.domain.TumourGroupSiteTNMValueListVoAssembler.create(map, domainObject.getTVal()) );
		// NVal
		valueObject.setNVal(ims.clinicaladmin.vo.domain.TumourGroupSiteTNMValueListVoAssembler.create(map, domainObject.getNVal()) );
		// MVal
		valueObject.setMVal(ims.clinicaladmin.vo.domain.TumourGroupSiteTNMValueListVoAssembler.create(map, domainObject.getMVal()) );
		// HistVal
		valueObject.setHistVal(ims.clinicaladmin.vo.domain.TumourGroupHistologyVoAssembler.create(map, domainObject.getHistVal()) );
		// SerumMarkerVal
		valueObject.setSerumMarkerVal(ims.clinicaladmin.vo.domain.TumourSerumMarkersLiteVoAssembler.create(map, domainObject.getSerumMarkerVal()) );
		// DiffVal
		valueObject.setDiffVal(ims.clinicaladmin.vo.domain.TumourGroupHistopathologyGradeVoAssembler.create(map, domainObject.getDiffVal()) );
		// OverallStageDescription
		ims.domain.lookups.LookupInstance instance9 = domainObject.getOverallStageDescription();
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

			ims.oncology.vo.lookups.TumourOverallStage voLookup9 = new ims.oncology.vo.lookups.TumourOverallStage(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.oncology.vo.lookups.TumourOverallStage parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.oncology.vo.lookups.TumourOverallStage(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setOverallStageDescription(voLookup9);
		}
				// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// O45
		valueObject.setO45(domainObject.getO45());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging extractTumourGroupSiteOverallStaging(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.TumourGroupSiteOverallStagingVo valueObject) 
	{
		return 	extractTumourGroupSiteOverallStaging(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging extractTumourGroupSiteOverallStaging(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.TumourGroupSiteOverallStagingVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_TumourGroupSiteOverallStaging();
		ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging)domMap.get(valueObject);
			}
			// ims.clinicaladmin.vo.TumourGroupSiteOverallStagingVo ID_TumourGroupSiteOverallStaging field is unknown
			domainObject = new ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_TumourGroupSiteOverallStaging());
			if (domMap.get(key) != null)
			{
				return (ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging)domMap.get(key);
			}
			domainObject = (ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging) domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_TumourGroupSiteOverallStaging());

		ims.oncology.configuration.domain.objects.TumourGroup value1 = null;
		if ( null != valueObject.getTGroup() ) 
		{
			if (valueObject.getTGroup().getBoId() == null)
			{
				if (domMap.get(valueObject.getTGroup()) != null)
				{
					value1 = (ims.oncology.configuration.domain.objects.TumourGroup)domMap.get(valueObject.getTGroup());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getTGroup();	
			}
			else
			{
				value1 = (ims.oncology.configuration.domain.objects.TumourGroup)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.TumourGroup.class, valueObject.getTGroup().getBoId());
			}
		}
		domainObject.setTGroup(value1);
		ims.oncology.configuration.domain.objects.TumourSite value2 = null;
		if ( null != valueObject.getTSite() ) 
		{
			if (valueObject.getTSite().getBoId() == null)
			{
				if (domMap.get(valueObject.getTSite()) != null)
				{
					value2 = (ims.oncology.configuration.domain.objects.TumourSite)domMap.get(valueObject.getTSite());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getTSite();	
			}
			else
			{
				value2 = (ims.oncology.configuration.domain.objects.TumourSite)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.TumourSite.class, valueObject.getTSite().getBoId());
			}
		}
		domainObject.setTSite(value2);
		domainObject.setTVal(ims.clinicaladmin.vo.domain.TumourGroupSiteTNMValueListVoAssembler.extractTumourGroupSiteTNMValue(domainFactory, valueObject.getTVal(), domMap));
		domainObject.setNVal(ims.clinicaladmin.vo.domain.TumourGroupSiteTNMValueListVoAssembler.extractTumourGroupSiteTNMValue(domainFactory, valueObject.getNVal(), domMap));
		domainObject.setMVal(ims.clinicaladmin.vo.domain.TumourGroupSiteTNMValueListVoAssembler.extractTumourGroupSiteTNMValue(domainFactory, valueObject.getMVal(), domMap));
		domainObject.setHistVal(ims.clinicaladmin.vo.domain.TumourGroupHistologyVoAssembler.extractTumourGroupHistology(domainFactory, valueObject.getHistVal(), domMap));
		domainObject.setSerumMarkerVal(ims.clinicaladmin.vo.domain.TumourSerumMarkersLiteVoAssembler.extractTumourSerumMarker(domainFactory, valueObject.getSerumMarkerVal(), domMap));
		domainObject.setDiffVal(ims.clinicaladmin.vo.domain.TumourGroupHistopathologyGradeVoAssembler.extractTumourGroupHistopathologicGrade(domainFactory, valueObject.getDiffVal(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getOverallStageDescription() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getOverallStageDescription().getID());
		}
		domainObject.setOverallStageDescription(value9);
		domainObject.setIsActive(valueObject.getIsActive());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getO45() != null && valueObject.getO45().equals(""))
		{
			valueObject.setO45(null);
		}
		domainObject.setO45(valueObject.getO45());

		return domainObject;
	}

}
