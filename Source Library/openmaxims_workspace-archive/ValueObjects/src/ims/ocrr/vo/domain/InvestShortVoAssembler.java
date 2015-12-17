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
package ims.ocrr.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Marius Mihalec
 */
public class InvestShortVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.InvestShortVo copy(ims.ocrr.vo.InvestShortVo valueObjectDest, ims.ocrr.vo.InvestShortVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Investigation(valueObjectSrc.getID_Investigation());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Colour
		valueObjectDest.setColour(valueObjectSrc.getColour());
		// ActiveStatus
		valueObjectDest.setActiveStatus(valueObjectSrc.getActiveStatus());
		// InvestigationIndex
		valueObjectDest.setInvestigationIndex(valueObjectSrc.getInvestigationIndex());
		// ProviderService
		valueObjectDest.setProviderService(valueObjectSrc.getProviderService());
		// HelpText
		valueObjectDest.setHelpText(valueObjectSrc.getHelpText());
		// IsAddon
		valueObjectDest.setIsAddon(valueObjectSrc.getIsAddon());
		// MinReorderPeriodVal
		valueObjectDest.setMinReorderPeriodVal(valueObjectSrc.getMinReorderPeriodVal());
		// MinReorderPeriodUnit
		valueObjectDest.setMinReorderPeriodUnit(valueObjectSrc.getMinReorderPeriodUnit());
		// FemaleMinReorderPeriodVal
		valueObjectDest.setFemaleMinReorderPeriodVal(valueObjectSrc.getFemaleMinReorderPeriodVal());
		// FemaleMinReorderPeriodUnit
		valueObjectDest.setFemaleMinReorderPeriodUnit(valueObjectSrc.getFemaleMinReorderPeriodUnit());
		// TurnaroundMeasure
		valueObjectDest.setTurnaroundMeasure(valueObjectSrc.getTurnaroundMeasure());
		// ExpectedTurnaround
		valueObjectDest.setExpectedTurnaround(valueObjectSrc.getExpectedTurnaround());
		// EventType
		valueObjectDest.setEventType(valueObjectSrc.getEventType());
		// AssocInvestigations
		valueObjectDest.setAssocInvestigations(valueObjectSrc.getAssocInvestigations());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createInvestShortVoCollectionFromInvestigation(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.configuration.domain.objects.Investigation objects.
	 */
	public static ims.ocrr.vo.InvestShortVoCollection createInvestShortVoCollectionFromInvestigation(java.util.Set domainObjectSet)	
	{
		return createInvestShortVoCollectionFromInvestigation(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.configuration.domain.objects.Investigation objects.
	 */
	public static ims.ocrr.vo.InvestShortVoCollection createInvestShortVoCollectionFromInvestigation(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.InvestShortVoCollection voList = new ims.ocrr.vo.InvestShortVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ocrr.configuration.domain.objects.Investigation domainObject = (ims.ocrr.configuration.domain.objects.Investigation) iterator.next();
			ims.ocrr.vo.InvestShortVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.ocrr.configuration.domain.objects.Investigation objects.
	 */
	public static ims.ocrr.vo.InvestShortVoCollection createInvestShortVoCollectionFromInvestigation(java.util.List domainObjectList) 
	{
		return createInvestShortVoCollectionFromInvestigation(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.configuration.domain.objects.Investigation objects.
	 */
	public static ims.ocrr.vo.InvestShortVoCollection createInvestShortVoCollectionFromInvestigation(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.InvestShortVoCollection voList = new ims.ocrr.vo.InvestShortVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.configuration.domain.objects.Investigation domainObject = (ims.ocrr.configuration.domain.objects.Investigation) domainObjectList.get(i);
			ims.ocrr.vo.InvestShortVo vo = create(map, domainObject);

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
	 * Create the ims.ocrr.configuration.domain.objects.Investigation set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractInvestigationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.InvestShortVoCollection voCollection) 
	 {
	 	return extractInvestigationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractInvestigationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.InvestShortVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.InvestShortVo vo = voCollection.get(i);
			ims.ocrr.configuration.domain.objects.Investigation domainObject = InvestShortVoAssembler.extractInvestigation(domainFactory, vo, domMap);

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
	 * Create the ims.ocrr.configuration.domain.objects.Investigation list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractInvestigationList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.InvestShortVoCollection voCollection) 
	 {
	 	return extractInvestigationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractInvestigationList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.InvestShortVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.InvestShortVo vo = voCollection.get(i);
			ims.ocrr.configuration.domain.objects.Investigation domainObject = InvestShortVoAssembler.extractInvestigation(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.ocrr.configuration.domain.objects.Investigation object.
	 * @param domainObject ims.ocrr.configuration.domain.objects.Investigation
	 */
	 public static ims.ocrr.vo.InvestShortVo create(ims.ocrr.configuration.domain.objects.Investigation domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ocrr.configuration.domain.objects.Investigation object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ocrr.vo.InvestShortVo create(DomainObjectMap map, ims.ocrr.configuration.domain.objects.Investigation domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.InvestShortVo valueObject = (ims.ocrr.vo.InvestShortVo) map.getValueObject(domainObject, ims.ocrr.vo.InvestShortVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.InvestShortVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ocrr.configuration.domain.objects.Investigation
	 */
	 public static ims.ocrr.vo.InvestShortVo insert(ims.ocrr.vo.InvestShortVo valueObject, ims.ocrr.configuration.domain.objects.Investigation domainObject) 
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
	 * @param domainObject ims.ocrr.configuration.domain.objects.Investigation
	 */
	 public static ims.ocrr.vo.InvestShortVo insert(DomainObjectMap map, ims.ocrr.vo.InvestShortVo valueObject, ims.ocrr.configuration.domain.objects.Investigation domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Investigation(domainObject.getId());
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
			
		// Colour
		valueObject.setColour(domainObject.getColour());
		// ActiveStatus
		ims.domain.lookups.LookupInstance instance2 = domainObject.getActiveStatus();
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
			valueObject.setActiveStatus(voLookup2);
		}
				// InvestigationIndex
		valueObject.setInvestigationIndex(ims.ocrr.vo.domain.InvestigationIndexShortVoAssembler.create(map, domainObject.getInvestigationIndex()) );
		// ProviderService
		valueObject.setProviderService(ims.ocrr.vo.domain.LocSvcProviderSysVoAssembler.create(map, domainObject.getProviderService()) );
		// HelpText
		valueObject.setHelpText(ims.core.vo.domain.HelpTextVoAssembler.createHelpTextVoCollectionFromHelpText(map, domainObject.getHelpText()) );
		// IsAddon
		valueObject.setIsAddon( domainObject.isIsAddon() );
		// MinReorderPeriodVal
		valueObject.setMinReorderPeriodVal(domainObject.getMinReorderPeriodVal());
		// MinReorderPeriodUnit
		ims.domain.lookups.LookupInstance instance8 = domainObject.getMinReorderPeriodUnit();
		if ( null != instance8 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance8.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance8.getImage().getImageId(), instance8.getImage().getImagePath());
			}
			color = instance8.getColor();
			if (color != null) 
				color.getValue();

			ims.ocrr.vo.lookups.MinReorderPeriod voLookup8 = new ims.ocrr.vo.lookups.MinReorderPeriod(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.ocrr.vo.lookups.MinReorderPeriod parentVoLookup8 = voLookup8;
			ims.domain.lookups.LookupInstance parent8 = instance8.getParent();
			while (parent8 != null)
			{
				if (parent8.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent8.getImage().getImageId(), parent8.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent8.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup8.setParent(new ims.ocrr.vo.lookups.MinReorderPeriod(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setMinReorderPeriodUnit(voLookup8);
		}
				// FemaleMinReorderPeriodVal
		valueObject.setFemaleMinReorderPeriodVal(domainObject.getFemaleMinReorderPeriodVal());
		// FemaleMinReorderPeriodUnit
		ims.domain.lookups.LookupInstance instance10 = domainObject.getFemaleMinReorderPeriodUnit();
		if ( null != instance10 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance10.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance10.getImage().getImageId(), instance10.getImage().getImagePath());
			}
			color = instance10.getColor();
			if (color != null) 
				color.getValue();

			ims.ocrr.vo.lookups.MinReorderPeriod voLookup10 = new ims.ocrr.vo.lookups.MinReorderPeriod(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.ocrr.vo.lookups.MinReorderPeriod parentVoLookup10 = voLookup10;
			ims.domain.lookups.LookupInstance parent10 = instance10.getParent();
			while (parent10 != null)
			{
				if (parent10.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent10.getImage().getImageId(), parent10.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent10.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup10.setParent(new ims.ocrr.vo.lookups.MinReorderPeriod(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setFemaleMinReorderPeriodUnit(voLookup10);
		}
				// TurnaroundMeasure
		ims.domain.lookups.LookupInstance instance11 = domainObject.getTurnaroundMeasure();
		if ( null != instance11 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance11.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance11.getImage().getImageId(), instance11.getImage().getImagePath());
			}
			color = instance11.getColor();
			if (color != null) 
				color.getValue();

			ims.ocrr.vo.lookups.MinReorderPeriod voLookup11 = new ims.ocrr.vo.lookups.MinReorderPeriod(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.ocrr.vo.lookups.MinReorderPeriod parentVoLookup11 = voLookup11;
			ims.domain.lookups.LookupInstance parent11 = instance11.getParent();
			while (parent11 != null)
			{
				if (parent11.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent11.getImage().getImageId(), parent11.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent11.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup11.setParent(new ims.ocrr.vo.lookups.MinReorderPeriod(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setTurnaroundMeasure(voLookup11);
		}
				// ExpectedTurnaround
		valueObject.setExpectedTurnaround(domainObject.getExpectedTurnaround());
		// EventType
		ims.domain.lookups.LookupInstance instance13 = domainObject.getEventType();
		if ( null != instance13 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance13.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance13.getImage().getImageId(), instance13.getImage().getImagePath());
			}
			color = instance13.getColor();
			if (color != null) 
				color.getValue();

			ims.ocrr.vo.lookups.InvEventType voLookup13 = new ims.ocrr.vo.lookups.InvEventType(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.ocrr.vo.lookups.InvEventType parentVoLookup13 = voLookup13;
			ims.domain.lookups.LookupInstance parent13 = instance13.getParent();
			while (parent13 != null)
			{
				if (parent13.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent13.getImage().getImageId(), parent13.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent13.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup13.setParent(new ims.ocrr.vo.lookups.InvEventType(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setEventType(voLookup13);
		}
				// AssocInvestigations
		ims.ocrr.configuration.vo.InvestigationRefVoCollection AssocInvestigations = new ims.ocrr.configuration.vo.InvestigationRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getAssocInvestigations().iterator(); iterator.hasNext(); ) 
		{
			ims.ocrr.configuration.domain.objects.Investigation tmp = (ims.ocrr.configuration.domain.objects.Investigation)iterator.next();
			if (tmp != null)
				AssocInvestigations.add(new ims.ocrr.configuration.vo.InvestigationRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setAssocInvestigations(AssocInvestigations);
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.configuration.domain.objects.Investigation extractInvestigation(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.InvestShortVo valueObject) 
	{
		return 	extractInvestigation(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.configuration.domain.objects.Investigation extractInvestigation(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.InvestShortVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Investigation();
		ims.ocrr.configuration.domain.objects.Investigation domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ocrr.configuration.domain.objects.Investigation)domMap.get(valueObject);
			}
			// ims.ocrr.vo.InvestShortVo ID_Investigation field is unknown
			domainObject = new ims.ocrr.configuration.domain.objects.Investigation();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Investigation());
			if (domMap.get(key) != null)
			{
				return (ims.ocrr.configuration.domain.objects.Investigation)domMap.get(key);
			}
			domainObject = (ims.ocrr.configuration.domain.objects.Investigation) domainFactory.getDomainObject(ims.ocrr.configuration.domain.objects.Investigation.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Investigation());

		domainObject.setColour(valueObject.getColour());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getActiveStatus() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getActiveStatus().getID());
		}
		domainObject.setActiveStatus(value2);
		domainObject.setInvestigationIndex(ims.ocrr.vo.domain.InvestigationIndexShortVoAssembler.extractInvestigationIndex(domainFactory, valueObject.getInvestigationIndex(), domMap));
		domainObject.setProviderService(ims.ocrr.vo.domain.LocSvcProviderSysVoAssembler.extractLocSvcProviderSys(domainFactory, valueObject.getProviderService(), domMap));
		domainObject.setHelpText(ims.core.vo.domain.HelpTextVoAssembler.extractHelpTextList(domainFactory, valueObject.getHelpText(), domainObject.getHelpText(), domMap));		
		domainObject.setIsAddon(valueObject.getIsAddon());
		domainObject.setMinReorderPeriodVal(valueObject.getMinReorderPeriodVal());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getMinReorderPeriodUnit() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getMinReorderPeriodUnit().getID());
		}
		domainObject.setMinReorderPeriodUnit(value8);
		domainObject.setFemaleMinReorderPeriodVal(valueObject.getFemaleMinReorderPeriodVal());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getFemaleMinReorderPeriodUnit() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getFemaleMinReorderPeriodUnit().getID());
		}
		domainObject.setFemaleMinReorderPeriodUnit(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getTurnaroundMeasure() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getTurnaroundMeasure().getID());
		}
		domainObject.setTurnaroundMeasure(value11);
		domainObject.setExpectedTurnaround(valueObject.getExpectedTurnaround());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getEventType() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getEventType().getID());
		}
		domainObject.setEventType(value13);

		ims.ocrr.configuration.vo.InvestigationRefVoCollection refCollection14 = valueObject.getAssocInvestigations();
		int size14 = (null == refCollection14) ? 0 : refCollection14.size();		
		java.util.Set domainAssocInvestigations14 = domainObject.getAssocInvestigations();
		if (domainAssocInvestigations14 == null)
		{
			domainAssocInvestigations14 = new java.util.HashSet();
		}
		java.util.Set newSet14  = new java.util.HashSet();
		for(int i=0; i<size14; i++) 
		{
			ims.ocrr.configuration.vo.InvestigationRefVo vo = refCollection14.get(i);					
			ims.ocrr.configuration.domain.objects.Investigation dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.ocrr.configuration.domain.objects.Investigation)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.ocrr.configuration.domain.objects.Investigation)domainFactory.getDomainObject( ims.ocrr.configuration.domain.objects.Investigation.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainAssocInvestigations14.contains(dom))
			{
				domainAssocInvestigations14.add(dom);
			}
			newSet14.add(dom);			
		}
		java.util.Set removedSet14 = new java.util.HashSet();
		java.util.Iterator iter14 = domainAssocInvestigations14.iterator();
		//Find out which objects need to be removed
		while (iter14.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter14.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet14.contains(o))
			{
				removedSet14.add(o);
			}
		}
		iter14 = removedSet14.iterator();
		//Remove the unwanted objects
		while (iter14.hasNext())
		{
			domainAssocInvestigations14.remove(iter14.next());
		}		
		
		domainObject.setAssocInvestigations(domainAssocInvestigations14);		

		return domainObject;
	}

}
