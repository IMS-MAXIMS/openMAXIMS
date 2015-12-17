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
 * @author George Cristian Josan
 */
public class OverallPrognosticGroupingVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinicaladmin.vo.OverallPrognosticGroupingVo copy(ims.clinicaladmin.vo.OverallPrognosticGroupingVo valueObjectDest, ims.clinicaladmin.vo.OverallPrognosticGroupingVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PrognosticGrouping(valueObjectSrc.getID_PrognosticGrouping());
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
		// O45
		valueObjectDest.setO45(valueObjectSrc.getO45());
		// PrognosticLocationVal
		valueObjectDest.setPrognosticLocationVal(valueObjectSrc.getPrognosticLocationVal());
		// PrognosticRiskVal
		valueObjectDest.setPrognosticRiskVal(valueObjectSrc.getPrognosticRiskVal());
		// PrognosticPSAVal
		valueObjectDest.setPrognosticPSAVal(valueObjectSrc.getPrognosticPSAVal());
		// PrognosticGleasonVal
		valueObjectDest.setPrognosticGleasonVal(valueObjectSrc.getPrognosticGleasonVal());
		// PrognosticGroup
		valueObjectDest.setPrognosticGroup(valueObjectSrc.getPrognosticGroup());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createOverallPrognosticGroupingVoCollectionFromPrognosticGrouping(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.configuration.domain.objects.PrognosticGrouping objects.
	 */
	public static ims.clinicaladmin.vo.OverallPrognosticGroupingVoCollection createOverallPrognosticGroupingVoCollectionFromPrognosticGrouping(java.util.Set domainObjectSet)	
	{
		return createOverallPrognosticGroupingVoCollectionFromPrognosticGrouping(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.configuration.domain.objects.PrognosticGrouping objects.
	 */
	public static ims.clinicaladmin.vo.OverallPrognosticGroupingVoCollection createOverallPrognosticGroupingVoCollectionFromPrognosticGrouping(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinicaladmin.vo.OverallPrognosticGroupingVoCollection voList = new ims.clinicaladmin.vo.OverallPrognosticGroupingVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.oncology.configuration.domain.objects.PrognosticGrouping domainObject = (ims.oncology.configuration.domain.objects.PrognosticGrouping) iterator.next();
			ims.clinicaladmin.vo.OverallPrognosticGroupingVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.oncology.configuration.domain.objects.PrognosticGrouping objects.
	 */
	public static ims.clinicaladmin.vo.OverallPrognosticGroupingVoCollection createOverallPrognosticGroupingVoCollectionFromPrognosticGrouping(java.util.List domainObjectList) 
	{
		return createOverallPrognosticGroupingVoCollectionFromPrognosticGrouping(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.configuration.domain.objects.PrognosticGrouping objects.
	 */
	public static ims.clinicaladmin.vo.OverallPrognosticGroupingVoCollection createOverallPrognosticGroupingVoCollectionFromPrognosticGrouping(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinicaladmin.vo.OverallPrognosticGroupingVoCollection voList = new ims.clinicaladmin.vo.OverallPrognosticGroupingVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.configuration.domain.objects.PrognosticGrouping domainObject = (ims.oncology.configuration.domain.objects.PrognosticGrouping) domainObjectList.get(i);
			ims.clinicaladmin.vo.OverallPrognosticGroupingVo vo = create(map, domainObject);

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
	 * Create the ims.oncology.configuration.domain.objects.PrognosticGrouping set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPrognosticGroupingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.OverallPrognosticGroupingVoCollection voCollection) 
	 {
	 	return extractPrognosticGroupingSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPrognosticGroupingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.OverallPrognosticGroupingVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinicaladmin.vo.OverallPrognosticGroupingVo vo = voCollection.get(i);
			ims.oncology.configuration.domain.objects.PrognosticGrouping domainObject = OverallPrognosticGroupingVoAssembler.extractPrognosticGrouping(domainFactory, vo, domMap);

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
	 * Create the ims.oncology.configuration.domain.objects.PrognosticGrouping list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPrognosticGroupingList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.OverallPrognosticGroupingVoCollection voCollection) 
	 {
	 	return extractPrognosticGroupingList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPrognosticGroupingList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.OverallPrognosticGroupingVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinicaladmin.vo.OverallPrognosticGroupingVo vo = voCollection.get(i);
			ims.oncology.configuration.domain.objects.PrognosticGrouping domainObject = OverallPrognosticGroupingVoAssembler.extractPrognosticGrouping(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.oncology.configuration.domain.objects.PrognosticGrouping object.
	 * @param domainObject ims.oncology.configuration.domain.objects.PrognosticGrouping
	 */
	 public static ims.clinicaladmin.vo.OverallPrognosticGroupingVo create(ims.oncology.configuration.domain.objects.PrognosticGrouping domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.oncology.configuration.domain.objects.PrognosticGrouping object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinicaladmin.vo.OverallPrognosticGroupingVo create(DomainObjectMap map, ims.oncology.configuration.domain.objects.PrognosticGrouping domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinicaladmin.vo.OverallPrognosticGroupingVo valueObject = (ims.clinicaladmin.vo.OverallPrognosticGroupingVo) map.getValueObject(domainObject, ims.clinicaladmin.vo.OverallPrognosticGroupingVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinicaladmin.vo.OverallPrognosticGroupingVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.oncology.configuration.domain.objects.PrognosticGrouping
	 */
	 public static ims.clinicaladmin.vo.OverallPrognosticGroupingVo insert(ims.clinicaladmin.vo.OverallPrognosticGroupingVo valueObject, ims.oncology.configuration.domain.objects.PrognosticGrouping domainObject) 
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
	 * @param domainObject ims.oncology.configuration.domain.objects.PrognosticGrouping
	 */
	 public static ims.clinicaladmin.vo.OverallPrognosticGroupingVo insert(DomainObjectMap map, ims.clinicaladmin.vo.OverallPrognosticGroupingVo valueObject, ims.oncology.configuration.domain.objects.PrognosticGrouping domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PrognosticGrouping(domainObject.getId());
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
		// O45
		valueObject.setO45(domainObject.getO45());
		// PrognosticLocationVal
		valueObject.setPrognosticLocationVal(ims.oncology.vo.domain.PrognosticLocationConfigVoAssembler.create(map, domainObject.getPrognosticLocationVal()) );
		// PrognosticRiskVal
		valueObject.setPrognosticRiskVal(ims.clinicaladmin.vo.domain.PrognosticRiskConfigVoAssembler.create(map, domainObject.getPrognosticRiskVal()) );
		// PrognosticPSAVal
		valueObject.setPrognosticPSAVal(ims.clinicaladmin.vo.domain.PSAConfigVoAssembler.create(map, domainObject.getPrognosticPSAVal()) );
		// PrognosticGleasonVal
		valueObject.setPrognosticGleasonVal(ims.clinicaladmin.vo.domain.GleasonConfigLiteVoAssembler.create(map, domainObject.getPrognosticGleasonVal()) );
		// PrognosticGroup
		ims.domain.lookups.LookupInstance instance14 = domainObject.getPrognosticGroup();
		if ( null != instance14 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance14.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance14.getImage().getImageId(), instance14.getImage().getImagePath());
			}
			color = instance14.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.PrognosticGroup voLookup14 = new ims.oncology.vo.lookups.PrognosticGroup(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.oncology.vo.lookups.PrognosticGroup parentVoLookup14 = voLookup14;
			ims.domain.lookups.LookupInstance parent14 = instance14.getParent();
			while (parent14 != null)
			{
				if (parent14.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent14.getImage().getImageId(), parent14.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent14.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup14.setParent(new ims.oncology.vo.lookups.PrognosticGroup(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setPrognosticGroup(voLookup14);
		}
				// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.configuration.domain.objects.PrognosticGrouping extractPrognosticGrouping(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.OverallPrognosticGroupingVo valueObject) 
	{
		return 	extractPrognosticGrouping(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.configuration.domain.objects.PrognosticGrouping extractPrognosticGrouping(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.OverallPrognosticGroupingVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PrognosticGrouping();
		ims.oncology.configuration.domain.objects.PrognosticGrouping domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.oncology.configuration.domain.objects.PrognosticGrouping)domMap.get(valueObject);
			}
			// ims.clinicaladmin.vo.OverallPrognosticGroupingVo ID_PrognosticGrouping field is unknown
			domainObject = new ims.oncology.configuration.domain.objects.PrognosticGrouping();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PrognosticGrouping());
			if (domMap.get(key) != null)
			{
				return (ims.oncology.configuration.domain.objects.PrognosticGrouping)domMap.get(key);
			}
			domainObject = (ims.oncology.configuration.domain.objects.PrognosticGrouping) domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.PrognosticGrouping.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PrognosticGrouping());

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
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue value3 = null;
		if ( null != valueObject.getTVal() ) 
		{
			if (valueObject.getTVal().getBoId() == null)
			{
				if (domMap.get(valueObject.getTVal()) != null)
				{
					value3 = (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue)domMap.get(valueObject.getTVal());
				}
			}
			else
			{
				value3 = (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.class, valueObject.getTVal().getBoId());
			}
		}
		domainObject.setTVal(value3);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue value4 = null;
		if ( null != valueObject.getNVal() ) 
		{
			if (valueObject.getNVal().getBoId() == null)
			{
				if (domMap.get(valueObject.getNVal()) != null)
				{
					value4 = (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue)domMap.get(valueObject.getNVal());
				}
			}
			else
			{
				value4 = (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.class, valueObject.getNVal().getBoId());
			}
		}
		domainObject.setNVal(value4);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue value5 = null;
		if ( null != valueObject.getMVal() ) 
		{
			if (valueObject.getMVal().getBoId() == null)
			{
				if (domMap.get(valueObject.getMVal()) != null)
				{
					value5 = (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue)domMap.get(valueObject.getMVal());
				}
			}
			else
			{
				value5 = (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.class, valueObject.getMVal().getBoId());
			}
		}
		domainObject.setMVal(value5);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.TumourGroupHistology value6 = null;
		if ( null != valueObject.getHistVal() ) 
		{
			if (valueObject.getHistVal().getBoId() == null)
			{
				if (domMap.get(valueObject.getHistVal()) != null)
				{
					value6 = (ims.oncology.configuration.domain.objects.TumourGroupHistology)domMap.get(valueObject.getHistVal());
				}
			}
			else
			{
				value6 = (ims.oncology.configuration.domain.objects.TumourGroupHistology)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.TumourGroupHistology.class, valueObject.getHistVal().getBoId());
			}
		}
		domainObject.setHistVal(value6);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.TumourSerumMarker value7 = null;
		if ( null != valueObject.getSerumMarkerVal() ) 
		{
			if (valueObject.getSerumMarkerVal().getBoId() == null)
			{
				if (domMap.get(valueObject.getSerumMarkerVal()) != null)
				{
					value7 = (ims.oncology.configuration.domain.objects.TumourSerumMarker)domMap.get(valueObject.getSerumMarkerVal());
				}
			}
			else
			{
				value7 = (ims.oncology.configuration.domain.objects.TumourSerumMarker)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.TumourSerumMarker.class, valueObject.getSerumMarkerVal().getBoId());
			}
		}
		domainObject.setSerumMarkerVal(value7);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.TumourGroupHistopathologicGrade value8 = null;
		if ( null != valueObject.getDiffVal() ) 
		{
			if (valueObject.getDiffVal().getBoId() == null)
			{
				if (domMap.get(valueObject.getDiffVal()) != null)
				{
					value8 = (ims.oncology.configuration.domain.objects.TumourGroupHistopathologicGrade)domMap.get(valueObject.getDiffVal());
				}
			}
			else
			{
				value8 = (ims.oncology.configuration.domain.objects.TumourGroupHistopathologicGrade)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.TumourGroupHistopathologicGrade.class, valueObject.getDiffVal().getBoId());
			}
		}
		domainObject.setDiffVal(value8);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getO45() != null && valueObject.getO45().equals(""))
		{
			valueObject.setO45(null);
		}
		domainObject.setO45(valueObject.getO45());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.PrognosticLocationConfig value10 = null;
		if ( null != valueObject.getPrognosticLocationVal() ) 
		{
			if (valueObject.getPrognosticLocationVal().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrognosticLocationVal()) != null)
				{
					value10 = (ims.oncology.configuration.domain.objects.PrognosticLocationConfig)domMap.get(valueObject.getPrognosticLocationVal());
				}
			}
			else
			{
				value10 = (ims.oncology.configuration.domain.objects.PrognosticLocationConfig)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.PrognosticLocationConfig.class, valueObject.getPrognosticLocationVal().getBoId());
			}
		}
		domainObject.setPrognosticLocationVal(value10);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.PrognosticRiskConfiguration value11 = null;
		if ( null != valueObject.getPrognosticRiskVal() ) 
		{
			if (valueObject.getPrognosticRiskVal().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrognosticRiskVal()) != null)
				{
					value11 = (ims.oncology.configuration.domain.objects.PrognosticRiskConfiguration)domMap.get(valueObject.getPrognosticRiskVal());
				}
			}
			else
			{
				value11 = (ims.oncology.configuration.domain.objects.PrognosticRiskConfiguration)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.PrognosticRiskConfiguration.class, valueObject.getPrognosticRiskVal().getBoId());
			}
		}
		domainObject.setPrognosticRiskVal(value11);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.PSAConfig value12 = null;
		if ( null != valueObject.getPrognosticPSAVal() ) 
		{
			if (valueObject.getPrognosticPSAVal().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrognosticPSAVal()) != null)
				{
					value12 = (ims.oncology.configuration.domain.objects.PSAConfig)domMap.get(valueObject.getPrognosticPSAVal());
				}
			}
			else
			{
				value12 = (ims.oncology.configuration.domain.objects.PSAConfig)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.PSAConfig.class, valueObject.getPrognosticPSAVal().getBoId());
			}
		}
		domainObject.setPrognosticPSAVal(value12);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.GleasonConfig value13 = null;
		if ( null != valueObject.getPrognosticGleasonVal() ) 
		{
			if (valueObject.getPrognosticGleasonVal().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrognosticGleasonVal()) != null)
				{
					value13 = (ims.oncology.configuration.domain.objects.GleasonConfig)domMap.get(valueObject.getPrognosticGleasonVal());
				}
			}
			else
			{
				value13 = (ims.oncology.configuration.domain.objects.GleasonConfig)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.GleasonConfig.class, valueObject.getPrognosticGleasonVal().getBoId());
			}
		}
		domainObject.setPrognosticGleasonVal(value13);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getPrognosticGroup() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getPrognosticGroup().getID());
		}
		domainObject.setPrognosticGroup(value14);
		domainObject.setIsActive(valueObject.getIsActive());

		return domainObject;
	}

}
