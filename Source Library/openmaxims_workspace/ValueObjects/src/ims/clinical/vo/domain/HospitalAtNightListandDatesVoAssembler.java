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
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class HospitalAtNightListandDatesVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.HospitalAtNightListandDatesVo copy(ims.clinical.vo.HospitalAtNightListandDatesVo valueObjectDest, ims.clinical.vo.HospitalAtNightListandDatesVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_HospitalAtNightListandDates(valueObjectSrc.getID_HospitalAtNightListandDates());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CutOverPoints
		valueObjectDest.setCutOverPoints(valueObjectSrc.getCutOverPoints());
		// Hospital
		valueObjectDest.setHospital(valueObjectSrc.getHospital());
		// PatientDetails
		valueObjectDest.setPatientDetails(valueObjectSrc.getPatientDetails());
		// ShiftStartDate
		valueObjectDest.setShiftStartDate(valueObjectSrc.getShiftStartDate());
		// ShiftEndDate
		valueObjectDest.setShiftEndDate(valueObjectSrc.getShiftEndDate());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createHospitalAtNightListandDatesVoCollectionFromHospitalAtNightListandDates(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.HospitalAtNightListandDates objects.
	 */
	public static ims.clinical.vo.HospitalAtNightListandDatesVoCollection createHospitalAtNightListandDatesVoCollectionFromHospitalAtNightListandDates(java.util.Set domainObjectSet)	
	{
		return createHospitalAtNightListandDatesVoCollectionFromHospitalAtNightListandDates(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.HospitalAtNightListandDates objects.
	 */
	public static ims.clinical.vo.HospitalAtNightListandDatesVoCollection createHospitalAtNightListandDatesVoCollectionFromHospitalAtNightListandDates(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.HospitalAtNightListandDatesVoCollection voList = new ims.clinical.vo.HospitalAtNightListandDatesVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.HospitalAtNightListandDates domainObject = (ims.clinical.domain.objects.HospitalAtNightListandDates) iterator.next();
			ims.clinical.vo.HospitalAtNightListandDatesVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.HospitalAtNightListandDates objects.
	 */
	public static ims.clinical.vo.HospitalAtNightListandDatesVoCollection createHospitalAtNightListandDatesVoCollectionFromHospitalAtNightListandDates(java.util.List domainObjectList) 
	{
		return createHospitalAtNightListandDatesVoCollectionFromHospitalAtNightListandDates(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.HospitalAtNightListandDates objects.
	 */
	public static ims.clinical.vo.HospitalAtNightListandDatesVoCollection createHospitalAtNightListandDatesVoCollectionFromHospitalAtNightListandDates(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.HospitalAtNightListandDatesVoCollection voList = new ims.clinical.vo.HospitalAtNightListandDatesVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.HospitalAtNightListandDates domainObject = (ims.clinical.domain.objects.HospitalAtNightListandDates) domainObjectList.get(i);
			ims.clinical.vo.HospitalAtNightListandDatesVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.HospitalAtNightListandDates set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractHospitalAtNightListandDatesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.HospitalAtNightListandDatesVoCollection voCollection) 
	 {
	 	return extractHospitalAtNightListandDatesSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractHospitalAtNightListandDatesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.HospitalAtNightListandDatesVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.HospitalAtNightListandDatesVo vo = voCollection.get(i);
			ims.clinical.domain.objects.HospitalAtNightListandDates domainObject = HospitalAtNightListandDatesVoAssembler.extractHospitalAtNightListandDates(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.HospitalAtNightListandDates list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractHospitalAtNightListandDatesList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.HospitalAtNightListandDatesVoCollection voCollection) 
	 {
	 	return extractHospitalAtNightListandDatesList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractHospitalAtNightListandDatesList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.HospitalAtNightListandDatesVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.HospitalAtNightListandDatesVo vo = voCollection.get(i);
			ims.clinical.domain.objects.HospitalAtNightListandDates domainObject = HospitalAtNightListandDatesVoAssembler.extractHospitalAtNightListandDates(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.HospitalAtNightListandDates object.
	 * @param domainObject ims.clinical.domain.objects.HospitalAtNightListandDates
	 */
	 public static ims.clinical.vo.HospitalAtNightListandDatesVo create(ims.clinical.domain.objects.HospitalAtNightListandDates domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.HospitalAtNightListandDates object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.HospitalAtNightListandDatesVo create(DomainObjectMap map, ims.clinical.domain.objects.HospitalAtNightListandDates domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.HospitalAtNightListandDatesVo valueObject = (ims.clinical.vo.HospitalAtNightListandDatesVo) map.getValueObject(domainObject, ims.clinical.vo.HospitalAtNightListandDatesVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.HospitalAtNightListandDatesVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.HospitalAtNightListandDates
	 */
	 public static ims.clinical.vo.HospitalAtNightListandDatesVo insert(ims.clinical.vo.HospitalAtNightListandDatesVo valueObject, ims.clinical.domain.objects.HospitalAtNightListandDates domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.HospitalAtNightListandDates
	 */
	 public static ims.clinical.vo.HospitalAtNightListandDatesVo insert(DomainObjectMap map, ims.clinical.vo.HospitalAtNightListandDatesVo valueObject, ims.clinical.domain.objects.HospitalAtNightListandDates domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_HospitalAtNightListandDates(domainObject.getId());
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
			
		// CutOverPoints
		if (domainObject.getCutOverPoints() != null)
		{
			if(domainObject.getCutOverPoints() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCutOverPoints();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCutOverPoints(new ims.clinical.configuration.vo.HospitalAtNightCutOverPointsConfigRefVo(id, -1));				
			}
			else
			{
				valueObject.setCutOverPoints(new ims.clinical.configuration.vo.HospitalAtNightCutOverPointsConfigRefVo(domainObject.getCutOverPoints().getId(), domainObject.getCutOverPoints().getVersion()));
			}
		}
		// Hospital
		if (domainObject.getHospital() != null)
		{
			if(domainObject.getHospital() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getHospital();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setHospital(new ims.core.resource.place.vo.LocSiteRefVo(id, -1));				
			}
			else
			{
				valueObject.setHospital(new ims.core.resource.place.vo.LocSiteRefVo(domainObject.getHospital().getId(), domainObject.getHospital().getVersion()));
			}
		}
		// PatientDetails
		valueObject.setPatientDetails(ims.clinical.vo.domain.HospitalAtNightPatientDetailVoAssembler.createHospitalAtNightPatientDetailVoCollectionFromHospitalAtNightPatientDetail(map, domainObject.getPatientDetails()) );
		// ShiftStartDate
		java.util.Date ShiftStartDate = domainObject.getShiftStartDate();
		if ( null != ShiftStartDate ) 
		{
			valueObject.setShiftStartDate(new ims.framework.utils.DateTime(ShiftStartDate) );
		}
		// ShiftEndDate
		java.util.Date ShiftEndDate = domainObject.getShiftEndDate();
		if ( null != ShiftEndDate ) 
		{
			valueObject.setShiftEndDate(new ims.framework.utils.DateTime(ShiftEndDate) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.HospitalAtNightListandDates extractHospitalAtNightListandDates(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.HospitalAtNightListandDatesVo valueObject) 
	{
		return 	extractHospitalAtNightListandDates(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.HospitalAtNightListandDates extractHospitalAtNightListandDates(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.HospitalAtNightListandDatesVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_HospitalAtNightListandDates();
		ims.clinical.domain.objects.HospitalAtNightListandDates domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.HospitalAtNightListandDates)domMap.get(valueObject);
			}
			// ims.clinical.vo.HospitalAtNightListandDatesVo ID_HospitalAtNightListandDates field is unknown
			domainObject = new ims.clinical.domain.objects.HospitalAtNightListandDates();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_HospitalAtNightListandDates());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.HospitalAtNightListandDates)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.HospitalAtNightListandDates) domainFactory.getDomainObject(ims.clinical.domain.objects.HospitalAtNightListandDates.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_HospitalAtNightListandDates());

		ims.clinical.configuration.domain.objects.HospitalAtNightCutOverPointsConfig value1 = null;
		if ( null != valueObject.getCutOverPoints() ) 
		{
			if (valueObject.getCutOverPoints().getBoId() == null)
			{
				if (domMap.get(valueObject.getCutOverPoints()) != null)
				{
					value1 = (ims.clinical.configuration.domain.objects.HospitalAtNightCutOverPointsConfig)domMap.get(valueObject.getCutOverPoints());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getCutOverPoints();	
			}
			else
			{
				value1 = (ims.clinical.configuration.domain.objects.HospitalAtNightCutOverPointsConfig)domainFactory.getDomainObject(ims.clinical.configuration.domain.objects.HospitalAtNightCutOverPointsConfig.class, valueObject.getCutOverPoints().getBoId());
			}
		}
		domainObject.setCutOverPoints(value1);
		ims.core.resource.place.domain.objects.LocSite value2 = null;
		if ( null != valueObject.getHospital() ) 
		{
			if (valueObject.getHospital().getBoId() == null)
			{
				if (domMap.get(valueObject.getHospital()) != null)
				{
					value2 = (ims.core.resource.place.domain.objects.LocSite)domMap.get(valueObject.getHospital());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getHospital();	
			}
			else
			{
				value2 = (ims.core.resource.place.domain.objects.LocSite)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.LocSite.class, valueObject.getHospital().getBoId());
			}
		}
		domainObject.setHospital(value2);

		// SaveAsRefVO treated as RefValueObject
		ims.clinical.vo.HospitalAtNightPatientDetailRefVoCollection refCollection3 = new ims.clinical.vo.HospitalAtNightPatientDetailRefVoCollection();
		if (valueObject.getPatientDetails() != null)
		{
			for (int i3=0; i3<valueObject.getPatientDetails().size(); i3++)
			{
				ims.clinical.vo.HospitalAtNightPatientDetailRefVo ref3 = (ims.clinical.vo.HospitalAtNightPatientDetailRefVo)valueObject.getPatientDetails().get(i3);
				refCollection3.add(ref3);
			}
		}
		int size3 = (null == refCollection3) ? 0 : refCollection3.size();		
		java.util.Set domainPatientDetails3 = domainObject.getPatientDetails();
		if (domainPatientDetails3 == null)
		{
			domainPatientDetails3 = new java.util.HashSet();
		}
		java.util.Set newSet3  = new java.util.HashSet();
		for(int i=0; i<size3; i++) 
		{
			ims.clinical.vo.HospitalAtNightPatientDetailRefVo vo = refCollection3.get(i);					
			ims.clinical.domain.objects.HospitalAtNightPatientDetail dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.clinical.domain.objects.HospitalAtNightPatientDetail)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.clinical.domain.objects.HospitalAtNightPatientDetail)domainFactory.getDomainObject( ims.clinical.domain.objects.HospitalAtNightPatientDetail.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainPatientDetails3.contains(dom))
			{
				domainPatientDetails3.add(dom);
			}
			newSet3.add(dom);			
		}
		java.util.Set removedSet3 = new java.util.HashSet();
		java.util.Iterator iter3 = domainPatientDetails3.iterator();
		//Find out which objects need to be removed
		while (iter3.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter3.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet3.contains(o))
			{
				removedSet3.add(o);
			}
		}
		iter3 = removedSet3.iterator();
		//Remove the unwanted objects
		while (iter3.hasNext())
		{
			domainPatientDetails3.remove(iter3.next());
		}		
		
		domainObject.setPatientDetails(domainPatientDetails3);		
		ims.framework.utils.DateTime dateTime4 = valueObject.getShiftStartDate();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setShiftStartDate(value4);
		ims.framework.utils.DateTime dateTime5 = valueObject.getShiftEndDate();
		java.util.Date value5 = null;
		if ( dateTime5 != null ) 
		{
			value5 = dateTime5.getJavaDate();
		}
		domainObject.setShiftEndDate(value5);

		return domainObject;
	}

}
