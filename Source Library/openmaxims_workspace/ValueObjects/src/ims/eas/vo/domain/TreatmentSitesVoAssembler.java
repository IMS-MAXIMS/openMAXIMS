//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 12/10/2015, 13:24
 *
 */
package ims.eas.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Barbara Worwood
 */
public class TreatmentSitesVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.eas.vo.TreatmentSitesVo copy(ims.eas.vo.TreatmentSitesVo valueObjectDest, ims.eas.vo.TreatmentSitesVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_TreatmentSites(valueObjectSrc.getID_TreatmentSites());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TreatmentSite
		valueObjectDest.setTreatmentSite(valueObjectSrc.getTreatmentSite());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// Assessment
		valueObjectDest.setAssessment(valueObjectSrc.getAssessment());
		// ScanLimits
		valueObjectDest.setScanLimits(valueObjectSrc.getScanLimits());
		// DefaultScanLimit
		valueObjectDest.setDefaultScanLimit(valueObjectSrc.getDefaultScanLimit());
		// Laterality
		valueObjectDest.setLaterality(valueObjectSrc.getLaterality());
		// SystemInformation
		valueObjectDest.setSystemInformation(valueObjectSrc.getSystemInformation());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTreatmentSitesVoCollectionFromTreatmentSites(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.eas.configuration.domain.objects.TreatmentSites objects.
	 */
	public static ims.eas.vo.TreatmentSitesVoCollection createTreatmentSitesVoCollectionFromTreatmentSites(java.util.Set domainObjectSet)	
	{
		return createTreatmentSitesVoCollectionFromTreatmentSites(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.eas.configuration.domain.objects.TreatmentSites objects.
	 */
	public static ims.eas.vo.TreatmentSitesVoCollection createTreatmentSitesVoCollectionFromTreatmentSites(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.eas.vo.TreatmentSitesVoCollection voList = new ims.eas.vo.TreatmentSitesVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.eas.configuration.domain.objects.TreatmentSites domainObject = (ims.eas.configuration.domain.objects.TreatmentSites) iterator.next();
			ims.eas.vo.TreatmentSitesVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.eas.configuration.domain.objects.TreatmentSites objects.
	 */
	public static ims.eas.vo.TreatmentSitesVoCollection createTreatmentSitesVoCollectionFromTreatmentSites(java.util.List domainObjectList) 
	{
		return createTreatmentSitesVoCollectionFromTreatmentSites(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.eas.configuration.domain.objects.TreatmentSites objects.
	 */
	public static ims.eas.vo.TreatmentSitesVoCollection createTreatmentSitesVoCollectionFromTreatmentSites(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.eas.vo.TreatmentSitesVoCollection voList = new ims.eas.vo.TreatmentSitesVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.eas.configuration.domain.objects.TreatmentSites domainObject = (ims.eas.configuration.domain.objects.TreatmentSites) domainObjectList.get(i);
			ims.eas.vo.TreatmentSitesVo vo = create(map, domainObject);

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
	 * Create the ims.eas.configuration.domain.objects.TreatmentSites set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTreatmentSitesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.TreatmentSitesVoCollection voCollection) 
	 {
	 	return extractTreatmentSitesSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTreatmentSitesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.TreatmentSitesVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.eas.vo.TreatmentSitesVo vo = voCollection.get(i);
			ims.eas.configuration.domain.objects.TreatmentSites domainObject = TreatmentSitesVoAssembler.extractTreatmentSites(domainFactory, vo, domMap);

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
	 * Create the ims.eas.configuration.domain.objects.TreatmentSites list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTreatmentSitesList(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.TreatmentSitesVoCollection voCollection) 
	 {
	 	return extractTreatmentSitesList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTreatmentSitesList(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.TreatmentSitesVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.eas.vo.TreatmentSitesVo vo = voCollection.get(i);
			ims.eas.configuration.domain.objects.TreatmentSites domainObject = TreatmentSitesVoAssembler.extractTreatmentSites(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.eas.configuration.domain.objects.TreatmentSites object.
	 * @param domainObject ims.eas.configuration.domain.objects.TreatmentSites
	 */
	 public static ims.eas.vo.TreatmentSitesVo create(ims.eas.configuration.domain.objects.TreatmentSites domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.eas.configuration.domain.objects.TreatmentSites object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.eas.vo.TreatmentSitesVo create(DomainObjectMap map, ims.eas.configuration.domain.objects.TreatmentSites domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.eas.vo.TreatmentSitesVo valueObject = (ims.eas.vo.TreatmentSitesVo) map.getValueObject(domainObject, ims.eas.vo.TreatmentSitesVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.eas.vo.TreatmentSitesVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.eas.configuration.domain.objects.TreatmentSites
	 */
	 public static ims.eas.vo.TreatmentSitesVo insert(ims.eas.vo.TreatmentSitesVo valueObject, ims.eas.configuration.domain.objects.TreatmentSites domainObject) 
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
	 * @param domainObject ims.eas.configuration.domain.objects.TreatmentSites
	 */
	 public static ims.eas.vo.TreatmentSitesVo insert(DomainObjectMap map, ims.eas.vo.TreatmentSitesVo valueObject, ims.eas.configuration.domain.objects.TreatmentSites domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_TreatmentSites(domainObject.getId());
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
			
		// TreatmentSite
		ims.domain.lookups.LookupInstance instance1 = domainObject.getTreatmentSite();
		if ( null != instance1 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance1.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance1.getImage().getImageId(), instance1.getImage().getImagePath());
			}
			color = instance1.getColor();
			if (color != null) 
				color.getValue();

			ims.eas.vo.lookups.TreatmentSites voLookup1 = new ims.eas.vo.lookups.TreatmentSites(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.eas.vo.lookups.TreatmentSites parentVoLookup1 = voLookup1;
			ims.domain.lookups.LookupInstance parent1 = instance1.getParent();
			while (parent1 != null)
			{
				if (parent1.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent1.getImage().getImageId(), parent1.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent1.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup1.setParent(new ims.eas.vo.lookups.TreatmentSites(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setTreatmentSite(voLookup1);
		}
				// Status
		ims.domain.lookups.LookupInstance instance2 = domainObject.getStatus();
		if ( null != instance2 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance2.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance2.getImage().getImageId(), instance2.getImage().getImagePath());
			}
			color = instance2.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup2 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup2 = voLookup2;
			ims.domain.lookups.LookupInstance parent2 = instance2.getParent();
			while (parent2 != null)
			{
				if (parent2.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent2.getImage().getImageId(), parent2.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent2.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup2.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setStatus(voLookup2);
		}
				// Assessment
		valueObject.setAssessment(ims.assessment.vo.domain.GraphicAssessmentLiteVoAssembler.create(map, domainObject.getAssessment()) );
		// ScanLimits
		java.util.List listScanLimits = domainObject.getScanLimits();
		ims.eas.vo.lookups.ScanLimitsCollection ScanLimits = new ims.eas.vo.lookups.ScanLimitsCollection();
		for(java.util.Iterator iterator = listScanLimits.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.eas.vo.lookups.ScanLimits voInstance = new ims.eas.vo.lookups.ScanLimits(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.eas.vo.lookups.ScanLimits parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.eas.vo.lookups.ScanLimits(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			ScanLimits.add(voInstance);
		}
		valueObject.setScanLimits( ScanLimits );
		// DefaultScanLimit
		ims.domain.lookups.LookupInstance instance5 = domainObject.getDefaultScanLimit();
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

			ims.eas.vo.lookups.ScanLimits voLookup5 = new ims.eas.vo.lookups.ScanLimits(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.eas.vo.lookups.ScanLimits parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.eas.vo.lookups.ScanLimits(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setDefaultScanLimit(voLookup5);
		}
				// Laterality
		valueObject.setLaterality( domainObject.isLaterality() );
		// SystemInformation
		// set system information
		valueObject.setSystemInformation(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.eas.configuration.domain.objects.TreatmentSites extractTreatmentSites(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.TreatmentSitesVo valueObject) 
	{
		return 	extractTreatmentSites(domainFactory, valueObject, new HashMap());
	}

	public static ims.eas.configuration.domain.objects.TreatmentSites extractTreatmentSites(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.TreatmentSitesVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_TreatmentSites();
		ims.eas.configuration.domain.objects.TreatmentSites domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.eas.configuration.domain.objects.TreatmentSites)domMap.get(valueObject);
			}
			// ims.eas.vo.TreatmentSitesVo ID_TreatmentSites field is unknown
			domainObject = new ims.eas.configuration.domain.objects.TreatmentSites();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_TreatmentSites());
			if (domMap.get(key) != null)
			{
				return (ims.eas.configuration.domain.objects.TreatmentSites)domMap.get(key);
			}
			domainObject = (ims.eas.configuration.domain.objects.TreatmentSites) domainFactory.getDomainObject(ims.eas.configuration.domain.objects.TreatmentSites.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_TreatmentSites());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getTreatmentSite() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getTreatmentSite().getID());
		}
		domainObject.setTreatmentSite(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.assessment.configuration.domain.objects.GraphicAssessment value3 = null;
		if ( null != valueObject.getAssessment() ) 
		{
			if (valueObject.getAssessment().getBoId() == null)
			{
				if (domMap.get(valueObject.getAssessment()) != null)
				{
					value3 = (ims.assessment.configuration.domain.objects.GraphicAssessment)domMap.get(valueObject.getAssessment());
				}
			}
			else
			{
				value3 = (ims.assessment.configuration.domain.objects.GraphicAssessment)domainFactory.getDomainObject(ims.assessment.configuration.domain.objects.GraphicAssessment.class, valueObject.getAssessment().getBoId());
			}
		}
		domainObject.setAssessment(value3);
		ims.eas.vo.lookups.ScanLimitsCollection collection4 =
	valueObject.getScanLimits();
	    java.util.List domainScanLimits = domainObject.getScanLimits();;			
	    int collection4Size=0;
		if (collection4 == null)
		{
			domainScanLimits = new java.util.ArrayList(0);
		}
		else
		{
			collection4Size = collection4.size();
		}
		
		for(int i=0; i<collection4Size; i++) 
		{
			int instanceId = collection4.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainScanLimits.indexOf(dom);
			if (domIdx == -1)
			{
				domainScanLimits.add(i, dom);
			}
			else if (i != domIdx && i < domainScanLimits.size())
			{
				Object tmp = domainScanLimits.get(i);
				domainScanLimits.set(i, domainScanLimits.get(domIdx));
				domainScanLimits.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j4 = domainScanLimits.size();
		while (j4 > collection4Size)
		{
			domainScanLimits.remove(j4-1);
			j4 = domainScanLimits.size();
		}

		domainObject.setScanLimits(domainScanLimits);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getDefaultScanLimit() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getDefaultScanLimit().getID());
		}
		domainObject.setDefaultScanLimit(value5);
		domainObject.setLaterality(valueObject.getLaterality());

		return domainObject;
	}

}
