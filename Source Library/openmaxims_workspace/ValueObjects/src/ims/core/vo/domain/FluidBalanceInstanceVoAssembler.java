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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Charlotte Murphy
 */
public class FluidBalanceInstanceVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.FluidBalanceInstanceVo copy(ims.core.vo.FluidBalanceInstanceVo valueObjectDest, ims.core.vo.FluidBalanceInstanceVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_FluidBalanceInstance(valueObjectSrc.getID_FluidBalanceInstance());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TotalIntake
		valueObjectDest.setTotalIntake(valueObjectSrc.getTotalIntake());
		// TotalOutput
		valueObjectDest.setTotalOutput(valueObjectSrc.getTotalOutput());
		// Balance
		valueObjectDest.setBalance(valueObjectSrc.getBalance());
		// FluidIntake
		valueObjectDest.setFluidIntake(valueObjectSrc.getFluidIntake());
		// FluidOutput
		valueObjectDest.setFluidOutput(valueObjectSrc.getFluidOutput());
		// VentilationChart
		valueObjectDest.setVentilationChart(valueObjectSrc.getVentilationChart());
		// FluidBalanceDate
		valueObjectDest.setFluidBalanceDate(valueObjectSrc.getFluidBalanceDate());
		// StartTime
		valueObjectDest.setStartTime(valueObjectSrc.getStartTime());
		// SystemInfo
		valueObjectDest.setSystemInfo(valueObjectSrc.getSystemInfo());
		// Comments
		valueObjectDest.setComments(valueObjectSrc.getComments());
		// ConfirmingDateTime
		valueObjectDest.setConfirmingDateTime(valueObjectSrc.getConfirmingDateTime());
		// ConfirmingHCP
		valueObjectDest.setConfirmingHCP(valueObjectSrc.getConfirmingHCP());
		// isConfirmed
		valueObjectDest.setIsConfirmed(valueObjectSrc.getIsConfirmed());
		// IrrigationIn
		valueObjectDest.setIrrigationIn(valueObjectSrc.getIrrigationIn());
		// IrrigationOut
		valueObjectDest.setIrrigationOut(valueObjectSrc.getIrrigationOut());
		// TimePeriod
		valueObjectDest.setTimePeriod(valueObjectSrc.getTimePeriod());
		// SignatoryShift
		valueObjectDest.setSignatoryShift(valueObjectSrc.getSignatoryShift());
		// EndTime
		valueObjectDest.setEndTime(valueObjectSrc.getEndTime());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createFluidBalanceInstanceVoCollectionFromFluidBalanceInstance(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.vitals.domain.objects.FluidBalanceInstance objects.
	 */
	public static ims.core.vo.FluidBalanceInstanceVoCollection createFluidBalanceInstanceVoCollectionFromFluidBalanceInstance(java.util.Set domainObjectSet)	
	{
		return createFluidBalanceInstanceVoCollectionFromFluidBalanceInstance(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.vitals.domain.objects.FluidBalanceInstance objects.
	 */
	public static ims.core.vo.FluidBalanceInstanceVoCollection createFluidBalanceInstanceVoCollectionFromFluidBalanceInstance(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.FluidBalanceInstanceVoCollection voList = new ims.core.vo.FluidBalanceInstanceVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.vitals.domain.objects.FluidBalanceInstance domainObject = (ims.core.vitals.domain.objects.FluidBalanceInstance) iterator.next();
			ims.core.vo.FluidBalanceInstanceVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.vitals.domain.objects.FluidBalanceInstance objects.
	 */
	public static ims.core.vo.FluidBalanceInstanceVoCollection createFluidBalanceInstanceVoCollectionFromFluidBalanceInstance(java.util.List domainObjectList) 
	{
		return createFluidBalanceInstanceVoCollectionFromFluidBalanceInstance(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.vitals.domain.objects.FluidBalanceInstance objects.
	 */
	public static ims.core.vo.FluidBalanceInstanceVoCollection createFluidBalanceInstanceVoCollectionFromFluidBalanceInstance(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.FluidBalanceInstanceVoCollection voList = new ims.core.vo.FluidBalanceInstanceVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.vitals.domain.objects.FluidBalanceInstance domainObject = (ims.core.vitals.domain.objects.FluidBalanceInstance) domainObjectList.get(i);
			ims.core.vo.FluidBalanceInstanceVo vo = create(map, domainObject);

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
	 * Create the ims.core.vitals.domain.objects.FluidBalanceInstance set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractFluidBalanceInstanceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.FluidBalanceInstanceVoCollection voCollection) 
	 {
	 	return extractFluidBalanceInstanceSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractFluidBalanceInstanceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.FluidBalanceInstanceVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.FluidBalanceInstanceVo vo = voCollection.get(i);
			ims.core.vitals.domain.objects.FluidBalanceInstance domainObject = FluidBalanceInstanceVoAssembler.extractFluidBalanceInstance(domainFactory, vo, domMap);

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
	 * Create the ims.core.vitals.domain.objects.FluidBalanceInstance list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractFluidBalanceInstanceList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.FluidBalanceInstanceVoCollection voCollection) 
	 {
	 	return extractFluidBalanceInstanceList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractFluidBalanceInstanceList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.FluidBalanceInstanceVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.FluidBalanceInstanceVo vo = voCollection.get(i);
			ims.core.vitals.domain.objects.FluidBalanceInstance domainObject = FluidBalanceInstanceVoAssembler.extractFluidBalanceInstance(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.vitals.domain.objects.FluidBalanceInstance object.
	 * @param domainObject ims.core.vitals.domain.objects.FluidBalanceInstance
	 */
	 public static ims.core.vo.FluidBalanceInstanceVo create(ims.core.vitals.domain.objects.FluidBalanceInstance domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.vitals.domain.objects.FluidBalanceInstance object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.FluidBalanceInstanceVo create(DomainObjectMap map, ims.core.vitals.domain.objects.FluidBalanceInstance domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.FluidBalanceInstanceVo valueObject = (ims.core.vo.FluidBalanceInstanceVo) map.getValueObject(domainObject, ims.core.vo.FluidBalanceInstanceVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.FluidBalanceInstanceVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.vitals.domain.objects.FluidBalanceInstance
	 */
	 public static ims.core.vo.FluidBalanceInstanceVo insert(ims.core.vo.FluidBalanceInstanceVo valueObject, ims.core.vitals.domain.objects.FluidBalanceInstance domainObject) 
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
	 * @param domainObject ims.core.vitals.domain.objects.FluidBalanceInstance
	 */
	 public static ims.core.vo.FluidBalanceInstanceVo insert(DomainObjectMap map, ims.core.vo.FluidBalanceInstanceVo valueObject, ims.core.vitals.domain.objects.FluidBalanceInstance domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_FluidBalanceInstance(domainObject.getId());
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
			
		// TotalIntake
		valueObject.setTotalIntake(domainObject.getTotalInput());
		// TotalOutput
		valueObject.setTotalOutput(domainObject.getTotalOutput());
		// Balance
		valueObject.setBalance(domainObject.getBalance());
		// FluidIntake
		valueObject.setFluidIntake(ims.core.vo.domain.FluidBalanceDetailsVoAssembler.createFluidBalanceDetailsVoCollectionFromFluidsBalanceDetails(map, domainObject.getFluidIntake()) );
		// FluidOutput
		valueObject.setFluidOutput(ims.core.vo.domain.FluidBalanceDetailsVoAssembler.createFluidBalanceDetailsVoCollectionFromFluidsBalanceDetails(map, domainObject.getFluidOutput()) );
		// VentilationChart
		valueObject.setVentilationChart(ims.core.vo.domain.VSVentilationChartVoAssembler.create(map, domainObject.getVentilationChart()) );
		// FluidBalanceDate
		java.util.Date FluidBalanceDate = domainObject.getFluidBalanceDate();
		if ( null != FluidBalanceDate ) 
		{
			valueObject.setFluidBalanceDate(new ims.framework.utils.Date(FluidBalanceDate) );
		}
		// StartTime
		String StartTime = domainObject.getStartTime();
		if ( null != StartTime ) 
		{
			valueObject.setStartTime(new ims.framework.utils.Time(StartTime) );
		}
		// SystemInfo
		// set system information
		valueObject.setSystemInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// Comments
		valueObject.setComments(domainObject.getComments());
		// ConfirmingDateTime
		java.util.Date ConfirmingDateTime = domainObject.getConfirmingDateTime();
		if ( null != ConfirmingDateTime ) 
		{
			valueObject.setConfirmingDateTime(new ims.framework.utils.DateTime(ConfirmingDateTime) );
		}
		// ConfirmingHCP
		valueObject.setConfirmingHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getConfirmingHCP()) );
		// isConfirmed
		valueObject.setIsConfirmed( domainObject.isIsConfirmed() );
		// IrrigationIn
		valueObject.setIrrigationIn(domainObject.getIrrigationIn());
		// IrrigationOut
		valueObject.setIrrigationOut(domainObject.getIrrigationOut());
		// TimePeriod
		ims.domain.lookups.LookupInstance instance16 = domainObject.getTimePeriod();
		if ( null != instance16 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance16.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance16.getImage().getImageId(), instance16.getImage().getImagePath());
			}
			color = instance16.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.DailyTimePeriods voLookup16 = new ims.core.vo.lookups.DailyTimePeriods(instance16.getId(),instance16.getText(), instance16.isActive(), null, img, color);
			ims.core.vo.lookups.DailyTimePeriods parentVoLookup16 = voLookup16;
			ims.domain.lookups.LookupInstance parent16 = instance16.getParent();
			while (parent16 != null)
			{
				if (parent16.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent16.getImage().getImageId(), parent16.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent16.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup16.setParent(new ims.core.vo.lookups.DailyTimePeriods(parent16.getId(),parent16.getText(), parent16.isActive(), null, img, color));
				parentVoLookup16 = parentVoLookup16.getParent();
								parent16 = parent16.getParent();
			}			
			valueObject.setTimePeriod(voLookup16);
		}
				// SignatoryShift
		if (domainObject.getSignatoryShift() != null)
		{
			if(domainObject.getSignatoryShift() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getSignatoryShift();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setSignatoryShift(new ims.core.vitals.vo.SignatoryShiftDetailsRefVo(id, -1));				
			}
			else
			{
				valueObject.setSignatoryShift(new ims.core.vitals.vo.SignatoryShiftDetailsRefVo(domainObject.getSignatoryShift().getId(), domainObject.getSignatoryShift().getVersion()));
			}
		}
		// EndTime
		String EndTime = domainObject.getEndTime();
		if ( null != EndTime ) 
		{
			valueObject.setEndTime(new ims.framework.utils.Time(EndTime) );
		}
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.vitals.domain.objects.FluidBalanceInstance extractFluidBalanceInstance(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.FluidBalanceInstanceVo valueObject) 
	{
		return 	extractFluidBalanceInstance(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.vitals.domain.objects.FluidBalanceInstance extractFluidBalanceInstance(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.FluidBalanceInstanceVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_FluidBalanceInstance();
		ims.core.vitals.domain.objects.FluidBalanceInstance domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.vitals.domain.objects.FluidBalanceInstance)domMap.get(valueObject);
			}
			// ims.core.vo.FluidBalanceInstanceVo ID_FluidBalanceInstance field is unknown
			domainObject = new ims.core.vitals.domain.objects.FluidBalanceInstance();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_FluidBalanceInstance());
			if (domMap.get(key) != null)
			{
				return (ims.core.vitals.domain.objects.FluidBalanceInstance)domMap.get(key);
			}
			domainObject = (ims.core.vitals.domain.objects.FluidBalanceInstance) domainFactory.getDomainObject(ims.core.vitals.domain.objects.FluidBalanceInstance.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_FluidBalanceInstance());

		domainObject.setTotalInput(valueObject.getTotalIntake());
		domainObject.setTotalOutput(valueObject.getTotalOutput());
		domainObject.setBalance(valueObject.getBalance());
		domainObject.setFluidIntake(ims.core.vo.domain.FluidBalanceDetailsVoAssembler.extractFluidsBalanceDetailsSet(domainFactory, valueObject.getFluidIntake(), domainObject.getFluidIntake(), domMap));		
		domainObject.setFluidOutput(ims.core.vo.domain.FluidBalanceDetailsVoAssembler.extractFluidsBalanceDetailsSet(domainFactory, valueObject.getFluidOutput(), domainObject.getFluidOutput(), domMap));		
		domainObject.setVentilationChart(ims.core.vo.domain.VSVentilationChartVoAssembler.extractVentilationChart(domainFactory, valueObject.getVentilationChart(), domMap));
		java.util.Date value7 = null;
		ims.framework.utils.Date date7 = valueObject.getFluidBalanceDate();		
		if ( date7 != null ) 
		{
			value7 = date7.getDate();
		}
		domainObject.setFluidBalanceDate(value7);
		ims.framework.utils.Time time8 = valueObject.getStartTime();
		String value8 = null;
		if ( time8 != null ) 
		{
			value8 = time8.toString();
		}
		domainObject.setStartTime(value8);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComments() != null && valueObject.getComments().equals(""))
		{
			valueObject.setComments(null);
		}
		domainObject.setComments(valueObject.getComments());
		ims.framework.utils.DateTime dateTime11 = valueObject.getConfirmingDateTime();
		java.util.Date value11 = null;
		if ( dateTime11 != null ) 
		{
			value11 = dateTime11.getJavaDate();
		}
		domainObject.setConfirmingDateTime(value11);
		domainObject.setConfirmingHCP(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getConfirmingHCP(), domMap));
		domainObject.setIsConfirmed(valueObject.getIsConfirmed());
		domainObject.setIrrigationIn(valueObject.getIrrigationIn());
		domainObject.setIrrigationOut(valueObject.getIrrigationOut());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getTimePeriod() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getTimePeriod().getID());
		}
		domainObject.setTimePeriod(value16);
		ims.core.vitals.domain.objects.SignatoryShiftDetails value17 = null;
		if ( null != valueObject.getSignatoryShift() ) 
		{
			if (valueObject.getSignatoryShift().getBoId() == null)
			{
				if (domMap.get(valueObject.getSignatoryShift()) != null)
				{
					value17 = (ims.core.vitals.domain.objects.SignatoryShiftDetails)domMap.get(valueObject.getSignatoryShift());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value17 = domainObject.getSignatoryShift();	
			}
			else
			{
				value17 = (ims.core.vitals.domain.objects.SignatoryShiftDetails)domainFactory.getDomainObject(ims.core.vitals.domain.objects.SignatoryShiftDetails.class, valueObject.getSignatoryShift().getBoId());
			}
		}
		domainObject.setSignatoryShift(value17);
		ims.framework.utils.Time time18 = valueObject.getEndTime();
		String value18 = null;
		if ( time18 != null ) 
		{
			value18 = time18.toString();
		}
		domainObject.setEndTime(value18);
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));

		return domainObject;
	}

}
