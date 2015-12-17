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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Sinead McDermott
 */
public class VSVentilationChartVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.VSVentilationChartVo copy(ims.core.vo.VSVentilationChartVo valueObjectDest, ims.core.vo.VSVentilationChartVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_VentilationChart(valueObjectSrc.getID_VentilationChart());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Suction
		valueObjectDest.setSuction(valueObjectSrc.getSuction());
		// Physio
		valueObjectDest.setPhysio(valueObjectSrc.getPhysio());
		// Mode
		valueObjectDest.setMode(valueObjectSrc.getMode());
		// PeakPressure
		valueObjectDest.setPeakPressure(valueObjectSrc.getPeakPressure());
		// PEEPCPAP
		valueObjectDest.setPEEPCPAP(valueObjectSrc.getPEEPCPAP());
		// Rate
		valueObjectDest.setRate(valueObjectSrc.getRate());
		// SpontaneousMV
		valueObjectDest.setSpontaneousMV(valueObjectSrc.getSpontaneousMV());
		// Cuff
		valueObjectDest.setCuff(valueObjectSrc.getCuff());
		// HumidifierTemp
		valueObjectDest.setHumidifierTemp(valueObjectSrc.getHumidifierTemp());
		// ProbeChange
		valueObjectDest.setProbeChange(valueObjectSrc.getProbeChange());
		// Position
		valueObjectDest.setPosition(valueObjectSrc.getPosition());
		// PainScale
		valueObjectDest.setPainScale(valueObjectSrc.getPainScale());
		// FluidBalanceInstance
		valueObjectDest.setFluidBalanceInstance(valueObjectSrc.getFluidBalanceInstance());
		// DailyFluidBalance
		valueObjectDest.setDailyFluidBalance(valueObjectSrc.getDailyFluidBalance());
		// ShiftDetails
		valueObjectDest.setShiftDetails(valueObjectSrc.getShiftDetails());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createVSVentilationChartVoCollectionFromVentilationChart(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.vitals.domain.objects.VentilationChart objects.
	 */
	public static ims.core.vo.VSVentilationChartVoCollection createVSVentilationChartVoCollectionFromVentilationChart(java.util.Set domainObjectSet)	
	{
		return createVSVentilationChartVoCollectionFromVentilationChart(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.vitals.domain.objects.VentilationChart objects.
	 */
	public static ims.core.vo.VSVentilationChartVoCollection createVSVentilationChartVoCollectionFromVentilationChart(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.VSVentilationChartVoCollection voList = new ims.core.vo.VSVentilationChartVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.vitals.domain.objects.VentilationChart domainObject = (ims.core.vitals.domain.objects.VentilationChart) iterator.next();
			ims.core.vo.VSVentilationChartVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.vitals.domain.objects.VentilationChart objects.
	 */
	public static ims.core.vo.VSVentilationChartVoCollection createVSVentilationChartVoCollectionFromVentilationChart(java.util.List domainObjectList) 
	{
		return createVSVentilationChartVoCollectionFromVentilationChart(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.vitals.domain.objects.VentilationChart objects.
	 */
	public static ims.core.vo.VSVentilationChartVoCollection createVSVentilationChartVoCollectionFromVentilationChart(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.VSVentilationChartVoCollection voList = new ims.core.vo.VSVentilationChartVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.vitals.domain.objects.VentilationChart domainObject = (ims.core.vitals.domain.objects.VentilationChart) domainObjectList.get(i);
			ims.core.vo.VSVentilationChartVo vo = create(map, domainObject);

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
	 * Create the ims.core.vitals.domain.objects.VentilationChart set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractVentilationChartSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VSVentilationChartVoCollection voCollection) 
	 {
	 	return extractVentilationChartSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractVentilationChartSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VSVentilationChartVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.VSVentilationChartVo vo = voCollection.get(i);
			ims.core.vitals.domain.objects.VentilationChart domainObject = VSVentilationChartVoAssembler.extractVentilationChart(domainFactory, vo, domMap);

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
	 * Create the ims.core.vitals.domain.objects.VentilationChart list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractVentilationChartList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VSVentilationChartVoCollection voCollection) 
	 {
	 	return extractVentilationChartList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractVentilationChartList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VSVentilationChartVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.VSVentilationChartVo vo = voCollection.get(i);
			ims.core.vitals.domain.objects.VentilationChart domainObject = VSVentilationChartVoAssembler.extractVentilationChart(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.vitals.domain.objects.VentilationChart object.
	 * @param domainObject ims.core.vitals.domain.objects.VentilationChart
	 */
	 public static ims.core.vo.VSVentilationChartVo create(ims.core.vitals.domain.objects.VentilationChart domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.vitals.domain.objects.VentilationChart object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.VSVentilationChartVo create(DomainObjectMap map, ims.core.vitals.domain.objects.VentilationChart domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.VSVentilationChartVo valueObject = (ims.core.vo.VSVentilationChartVo) map.getValueObject(domainObject, ims.core.vo.VSVentilationChartVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.VSVentilationChartVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.vitals.domain.objects.VentilationChart
	 */
	 public static ims.core.vo.VSVentilationChartVo insert(ims.core.vo.VSVentilationChartVo valueObject, ims.core.vitals.domain.objects.VentilationChart domainObject) 
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
	 * @param domainObject ims.core.vitals.domain.objects.VentilationChart
	 */
	 public static ims.core.vo.VSVentilationChartVo insert(DomainObjectMap map, ims.core.vo.VSVentilationChartVo valueObject, ims.core.vitals.domain.objects.VentilationChart domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_VentilationChart(domainObject.getId());
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
			
		// Suction
		ims.domain.lookups.LookupInstance instance1 = domainObject.getSuction();
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

			ims.core.vo.lookups.YesNoUnknown voLookup1 = new ims.core.vo.lookups.YesNoUnknown(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.core.vo.lookups.YesNoUnknown(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setSuction(voLookup1);
		}
				// Physio
		ims.domain.lookups.LookupInstance instance2 = domainObject.getPhysio();
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

			ims.core.vo.lookups.YesNoUnknown voLookup2 = new ims.core.vo.lookups.YesNoUnknown(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.YesNoUnknown(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setPhysio(voLookup2);
		}
				// Mode
		ims.domain.lookups.LookupInstance instance3 = domainObject.getMode();
		if ( null != instance3 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance3.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance3.getImage().getImageId(), instance3.getImage().getImagePath());
			}
			color = instance3.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.VentilationMode voLookup3 = new ims.core.vo.lookups.VentilationMode(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.VentilationMode parentVoLookup3 = voLookup3;
			ims.domain.lookups.LookupInstance parent3 = instance3.getParent();
			while (parent3 != null)
			{
				if (parent3.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent3.getImage().getImageId(), parent3.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent3.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup3.setParent(new ims.core.vo.lookups.VentilationMode(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setMode(voLookup3);
		}
				// PeakPressure
		valueObject.setPeakPressure(domainObject.getPeakPressure());
		// PEEPCPAP
		valueObject.setPEEPCPAP(domainObject.getPEEPCPAP());
		// Rate
		valueObject.setRate(domainObject.getRate());
		// SpontaneousMV
		valueObject.setSpontaneousMV(domainObject.getSpontaneousMV());
		// Cuff
		ims.domain.lookups.LookupInstance instance8 = domainObject.getCuff();
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

			ims.core.vo.lookups.CuffStatus voLookup8 = new ims.core.vo.lookups.CuffStatus(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.CuffStatus parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.CuffStatus(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setCuff(voLookup8);
		}
				// HumidifierTemp
		valueObject.setHumidifierTemp(domainObject.getHumidifierTemp());
		// ProbeChange
		ims.domain.lookups.LookupInstance instance10 = domainObject.getProbeChange();
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

			ims.core.vo.lookups.YesNo voLookup10 = new ims.core.vo.lookups.YesNo(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.core.vo.lookups.YesNo(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setProbeChange(voLookup10);
		}
				// Position
		ims.domain.lookups.LookupInstance instance11 = domainObject.getPosition();
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

			ims.core.vo.lookups.PatientPosition voLookup11 = new ims.core.vo.lookups.PatientPosition(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.core.vo.lookups.PatientPosition parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.core.vo.lookups.PatientPosition(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setPosition(voLookup11);
		}
				// PainScale
		ims.domain.lookups.LookupInstance instance12 = domainObject.getPainScale();
		if ( null != instance12 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance12.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance12.getImage().getImageId(), instance12.getImage().getImagePath());
			}
			color = instance12.getColor();
			if (color != null) 
				color.getValue();

			ims.nursing.vo.lookups.PainSeverity voLookup12 = new ims.nursing.vo.lookups.PainSeverity(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.nursing.vo.lookups.PainSeverity parentVoLookup12 = voLookup12;
			ims.domain.lookups.LookupInstance parent12 = instance12.getParent();
			while (parent12 != null)
			{
				if (parent12.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent12.getImage().getImageId(), parent12.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent12.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup12.setParent(new ims.nursing.vo.lookups.PainSeverity(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setPainScale(voLookup12);
		}
				// FluidBalanceInstance
		valueObject.setFluidBalanceInstance(ims.core.vo.domain.FluidBalanceInstanceVoAssembler.create(map, domainObject.getFluidBalance()) );
		// DailyFluidBalance
		valueObject.setDailyFluidBalance(ims.core.vo.domain.DailyFluidBalanceVoAssembler.create(map, domainObject.getDailyFluidBalance()) );
		// ShiftDetails
		valueObject.setShiftDetails(ims.core.vo.domain.ShiftDetailsVoAssembler.create(map, domainObject.getShiftDetails()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.vitals.domain.objects.VentilationChart extractVentilationChart(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VSVentilationChartVo valueObject) 
	{
		return 	extractVentilationChart(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.vitals.domain.objects.VentilationChart extractVentilationChart(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VSVentilationChartVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_VentilationChart();
		ims.core.vitals.domain.objects.VentilationChart domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.vitals.domain.objects.VentilationChart)domMap.get(valueObject);
			}
			// ims.core.vo.VSVentilationChartVo ID_VentilationChart field is unknown
			domainObject = new ims.core.vitals.domain.objects.VentilationChart();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_VentilationChart());
			if (domMap.get(key) != null)
			{
				return (ims.core.vitals.domain.objects.VentilationChart)domMap.get(key);
			}
			domainObject = (ims.core.vitals.domain.objects.VentilationChart) domainFactory.getDomainObject(ims.core.vitals.domain.objects.VentilationChart.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_VentilationChart());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getSuction() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getSuction().getID());
		}
		domainObject.setSuction(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getPhysio() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getPhysio().getID());
		}
		domainObject.setPhysio(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getMode() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getMode().getID());
		}
		domainObject.setMode(value3);
		domainObject.setPeakPressure(valueObject.getPeakPressure());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPEEPCPAP() != null && valueObject.getPEEPCPAP().equals(""))
		{
			valueObject.setPEEPCPAP(null);
		}
		domainObject.setPEEPCPAP(valueObject.getPEEPCPAP());
		domainObject.setRate(valueObject.getRate());
		domainObject.setSpontaneousMV(valueObject.getSpontaneousMV());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getCuff() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getCuff().getID());
		}
		domainObject.setCuff(value8);
		domainObject.setHumidifierTemp(valueObject.getHumidifierTemp());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getProbeChange() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getProbeChange().getID());
		}
		domainObject.setProbeChange(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getPosition() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getPosition().getID());
		}
		domainObject.setPosition(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getPainScale() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getPainScale().getID());
		}
		domainObject.setPainScale(value12);
		domainObject.setFluidBalance(ims.core.vo.domain.FluidBalanceInstanceVoAssembler.extractFluidBalanceInstance(domainFactory, valueObject.getFluidBalanceInstance(), domMap));
		domainObject.setDailyFluidBalance(ims.core.vo.domain.DailyFluidBalanceVoAssembler.extractDailyFluidBalance(domainFactory, valueObject.getDailyFluidBalance(), domMap));
		domainObject.setShiftDetails(ims.core.vo.domain.ShiftDetailsVoAssembler.extractShiftDetails(domainFactory, valueObject.getShiftDetails(), domMap));

		return domainObject;
	}

}
