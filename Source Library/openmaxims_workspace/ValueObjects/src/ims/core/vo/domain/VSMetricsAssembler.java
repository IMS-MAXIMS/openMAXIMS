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
public class VSMetricsAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.VSMetrics copy(ims.core.vo.VSMetrics valueObjectDest, ims.core.vo.VSMetrics valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Metrics(valueObjectSrc.getID_Metrics());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// HeightValue
		valueObjectDest.setHeightValue(valueObjectSrc.getHeightValue());
		// HeightEstimatedMeasured
		valueObjectDest.setHeightEstimatedMeasured(valueObjectSrc.getHeightEstimatedMeasured());
		// WeightValue
		valueObjectDest.setWeightValue(valueObjectSrc.getWeightValue());
		// WeightEstimatedMeasured
		valueObjectDest.setWeightEstimatedMeasured(valueObjectSrc.getWeightEstimatedMeasured());
		// BMI
		valueObjectDest.setBMI(valueObjectSrc.getBMI());
		// SurfaceArea
		valueObjectDest.setSurfaceArea(valueObjectSrc.getSurfaceArea());
		// NeckSize
		valueObjectDest.setNeckSize(valueObjectSrc.getNeckSize());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createVSMetricsCollectionFromMetrics(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.vitals.domain.objects.Metrics objects.
	 */
	public static ims.core.vo.VSMetricsCollection createVSMetricsCollectionFromMetrics(java.util.Set domainObjectSet)	
	{
		return createVSMetricsCollectionFromMetrics(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.vitals.domain.objects.Metrics objects.
	 */
	public static ims.core.vo.VSMetricsCollection createVSMetricsCollectionFromMetrics(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.VSMetricsCollection voList = new ims.core.vo.VSMetricsCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.vitals.domain.objects.Metrics domainObject = (ims.core.vitals.domain.objects.Metrics) iterator.next();
			ims.core.vo.VSMetrics vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.vitals.domain.objects.Metrics objects.
	 */
	public static ims.core.vo.VSMetricsCollection createVSMetricsCollectionFromMetrics(java.util.List domainObjectList) 
	{
		return createVSMetricsCollectionFromMetrics(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.vitals.domain.objects.Metrics objects.
	 */
	public static ims.core.vo.VSMetricsCollection createVSMetricsCollectionFromMetrics(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.VSMetricsCollection voList = new ims.core.vo.VSMetricsCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.vitals.domain.objects.Metrics domainObject = (ims.core.vitals.domain.objects.Metrics) domainObjectList.get(i);
			ims.core.vo.VSMetrics vo = create(map, domainObject);

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
	 * Create the ims.core.vitals.domain.objects.Metrics set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractMetricsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VSMetricsCollection voCollection) 
	 {
	 	return extractMetricsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractMetricsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VSMetricsCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.VSMetrics vo = voCollection.get(i);
			ims.core.vitals.domain.objects.Metrics domainObject = VSMetricsAssembler.extractMetrics(domainFactory, vo, domMap);

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
	 * Create the ims.core.vitals.domain.objects.Metrics list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractMetricsList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VSMetricsCollection voCollection) 
	 {
	 	return extractMetricsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractMetricsList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VSMetricsCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.VSMetrics vo = voCollection.get(i);
			ims.core.vitals.domain.objects.Metrics domainObject = VSMetricsAssembler.extractMetrics(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.vitals.domain.objects.Metrics object.
	 * @param domainObject ims.core.vitals.domain.objects.Metrics
	 */
	 public static ims.core.vo.VSMetrics create(ims.core.vitals.domain.objects.Metrics domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.vitals.domain.objects.Metrics object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.VSMetrics create(DomainObjectMap map, ims.core.vitals.domain.objects.Metrics domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.VSMetrics valueObject = (ims.core.vo.VSMetrics) map.getValueObject(domainObject, ims.core.vo.VSMetrics.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.VSMetrics(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.vitals.domain.objects.Metrics
	 */
	 public static ims.core.vo.VSMetrics insert(ims.core.vo.VSMetrics valueObject, ims.core.vitals.domain.objects.Metrics domainObject) 
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
	 * @param domainObject ims.core.vitals.domain.objects.Metrics
	 */
	 public static ims.core.vo.VSMetrics insert(DomainObjectMap map, ims.core.vo.VSMetrics valueObject, ims.core.vitals.domain.objects.Metrics domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Metrics(domainObject.getId());
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
			
		// HeightValue
		valueObject.setHeightValue(domainObject.getHeightValue());
		// HeightEstimatedMeasured
		valueObject.setHeightEstimatedMeasured( domainObject.isHeightEstimatedMeasured() );
		// WeightValue
		valueObject.setWeightValue(domainObject.getWeightValue());
		// WeightEstimatedMeasured
		valueObject.setWeightEstimatedMeasured( domainObject.isWeightEstimatedMeasured() );
		// BMI
		valueObject.setBMI(domainObject.getBMI());
		// SurfaceArea
		valueObject.setSurfaceArea(domainObject.getSurfaceArea());
		// NeckSize
		valueObject.setNeckSize(domainObject.getNeckSize());
		// Patient
		if (domainObject.getPatient() != null)
		{
			if(domainObject.getPatient() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPatient();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPatient(new ims.core.patient.vo.PatientRefVo(id, -1));				
			}
			else
			{
				valueObject.setPatient(new ims.core.patient.vo.PatientRefVo(domainObject.getPatient().getId(), domainObject.getPatient().getVersion()));
			}
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
	public static ims.core.vitals.domain.objects.Metrics extractMetrics(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VSMetrics valueObject) 
	{
		return 	extractMetrics(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.vitals.domain.objects.Metrics extractMetrics(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VSMetrics valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Metrics();
		ims.core.vitals.domain.objects.Metrics domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.vitals.domain.objects.Metrics)domMap.get(valueObject);
			}
			// ims.core.vo.VSMetrics ID_Metrics field is unknown
			domainObject = new ims.core.vitals.domain.objects.Metrics();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Metrics());
			if (domMap.get(key) != null)
			{
				return (ims.core.vitals.domain.objects.Metrics)domMap.get(key);
			}
			domainObject = (ims.core.vitals.domain.objects.Metrics) domainFactory.getDomainObject(ims.core.vitals.domain.objects.Metrics.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Metrics());

		domainObject.setHeightValue(valueObject.getHeightValue());
		domainObject.setHeightEstimatedMeasured(valueObject.getHeightEstimatedMeasured());
		domainObject.setWeightValue(valueObject.getWeightValue());
		domainObject.setWeightEstimatedMeasured(valueObject.getWeightEstimatedMeasured());
		domainObject.setBMI(valueObject.getBMI());
		domainObject.setSurfaceArea(valueObject.getSurfaceArea());
		domainObject.setNeckSize(valueObject.getNeckSize());
		ims.core.patient.domain.objects.Patient value8 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value8 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value8 = domainObject.getPatient();	
			}
			else
			{
				value8 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value8);
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));

		return domainObject;
	}

}
