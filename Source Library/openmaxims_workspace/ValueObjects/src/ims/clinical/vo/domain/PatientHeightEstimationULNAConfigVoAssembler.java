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
 * @author Florin Blindu
 */
public class PatientHeightEstimationULNAConfigVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.PatientHeightEstimationULNAConfigVo copy(ims.clinical.vo.PatientHeightEstimationULNAConfigVo valueObjectDest, ims.clinical.vo.PatientHeightEstimationULNAConfigVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientHeightEstimationULNAConfig(valueObjectSrc.getID_PatientHeightEstimationULNAConfig());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ULNALengthCM
		valueObjectDest.setULNALengthCM(valueObjectSrc.getULNALengthCM());
		// MenUnder65HeightM
		valueObjectDest.setMenUnder65HeightM(valueObjectSrc.getMenUnder65HeightM());
		// MenOver65HeightM
		valueObjectDest.setMenOver65HeightM(valueObjectSrc.getMenOver65HeightM());
		// WomenUnder65HeightM
		valueObjectDest.setWomenUnder65HeightM(valueObjectSrc.getWomenUnder65HeightM());
		// WomenOver65HeightM
		valueObjectDest.setWomenOver65HeightM(valueObjectSrc.getWomenOver65HeightM());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientHeightEstimationULNAConfigVoCollectionFromPatientHeightEstimationULNAConfig(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.configuration.domain.objects.PatientHeightEstimationULNAConfig objects.
	 */
	public static ims.clinical.vo.PatientHeightEstimationULNAConfigVoCollection createPatientHeightEstimationULNAConfigVoCollectionFromPatientHeightEstimationULNAConfig(java.util.Set domainObjectSet)	
	{
		return createPatientHeightEstimationULNAConfigVoCollectionFromPatientHeightEstimationULNAConfig(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.configuration.domain.objects.PatientHeightEstimationULNAConfig objects.
	 */
	public static ims.clinical.vo.PatientHeightEstimationULNAConfigVoCollection createPatientHeightEstimationULNAConfigVoCollectionFromPatientHeightEstimationULNAConfig(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.PatientHeightEstimationULNAConfigVoCollection voList = new ims.clinical.vo.PatientHeightEstimationULNAConfigVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.configuration.domain.objects.PatientHeightEstimationULNAConfig domainObject = (ims.clinical.configuration.domain.objects.PatientHeightEstimationULNAConfig) iterator.next();
			ims.clinical.vo.PatientHeightEstimationULNAConfigVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.configuration.domain.objects.PatientHeightEstimationULNAConfig objects.
	 */
	public static ims.clinical.vo.PatientHeightEstimationULNAConfigVoCollection createPatientHeightEstimationULNAConfigVoCollectionFromPatientHeightEstimationULNAConfig(java.util.List domainObjectList) 
	{
		return createPatientHeightEstimationULNAConfigVoCollectionFromPatientHeightEstimationULNAConfig(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.configuration.domain.objects.PatientHeightEstimationULNAConfig objects.
	 */
	public static ims.clinical.vo.PatientHeightEstimationULNAConfigVoCollection createPatientHeightEstimationULNAConfigVoCollectionFromPatientHeightEstimationULNAConfig(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.PatientHeightEstimationULNAConfigVoCollection voList = new ims.clinical.vo.PatientHeightEstimationULNAConfigVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.configuration.domain.objects.PatientHeightEstimationULNAConfig domainObject = (ims.clinical.configuration.domain.objects.PatientHeightEstimationULNAConfig) domainObjectList.get(i);
			ims.clinical.vo.PatientHeightEstimationULNAConfigVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.configuration.domain.objects.PatientHeightEstimationULNAConfig set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientHeightEstimationULNAConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientHeightEstimationULNAConfigVoCollection voCollection) 
	 {
	 	return extractPatientHeightEstimationULNAConfigSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientHeightEstimationULNAConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientHeightEstimationULNAConfigVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.PatientHeightEstimationULNAConfigVo vo = voCollection.get(i);
			ims.clinical.configuration.domain.objects.PatientHeightEstimationULNAConfig domainObject = PatientHeightEstimationULNAConfigVoAssembler.extractPatientHeightEstimationULNAConfig(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.configuration.domain.objects.PatientHeightEstimationULNAConfig list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientHeightEstimationULNAConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientHeightEstimationULNAConfigVoCollection voCollection) 
	 {
	 	return extractPatientHeightEstimationULNAConfigList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientHeightEstimationULNAConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientHeightEstimationULNAConfigVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.PatientHeightEstimationULNAConfigVo vo = voCollection.get(i);
			ims.clinical.configuration.domain.objects.PatientHeightEstimationULNAConfig domainObject = PatientHeightEstimationULNAConfigVoAssembler.extractPatientHeightEstimationULNAConfig(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.configuration.domain.objects.PatientHeightEstimationULNAConfig object.
	 * @param domainObject ims.clinical.configuration.domain.objects.PatientHeightEstimationULNAConfig
	 */
	 public static ims.clinical.vo.PatientHeightEstimationULNAConfigVo create(ims.clinical.configuration.domain.objects.PatientHeightEstimationULNAConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.configuration.domain.objects.PatientHeightEstimationULNAConfig object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.PatientHeightEstimationULNAConfigVo create(DomainObjectMap map, ims.clinical.configuration.domain.objects.PatientHeightEstimationULNAConfig domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.PatientHeightEstimationULNAConfigVo valueObject = (ims.clinical.vo.PatientHeightEstimationULNAConfigVo) map.getValueObject(domainObject, ims.clinical.vo.PatientHeightEstimationULNAConfigVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.PatientHeightEstimationULNAConfigVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.configuration.domain.objects.PatientHeightEstimationULNAConfig
	 */
	 public static ims.clinical.vo.PatientHeightEstimationULNAConfigVo insert(ims.clinical.vo.PatientHeightEstimationULNAConfigVo valueObject, ims.clinical.configuration.domain.objects.PatientHeightEstimationULNAConfig domainObject) 
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
	 * @param domainObject ims.clinical.configuration.domain.objects.PatientHeightEstimationULNAConfig
	 */
	 public static ims.clinical.vo.PatientHeightEstimationULNAConfigVo insert(DomainObjectMap map, ims.clinical.vo.PatientHeightEstimationULNAConfigVo valueObject, ims.clinical.configuration.domain.objects.PatientHeightEstimationULNAConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientHeightEstimationULNAConfig(domainObject.getId());
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
			
		// ULNALengthCM
		valueObject.setULNALengthCM(domainObject.getULNALengthCM());
		// MenUnder65HeightM
		valueObject.setMenUnder65HeightM(domainObject.getMenUnder65HeightM());
		// MenOver65HeightM
		valueObject.setMenOver65HeightM(domainObject.getMenOver65HeightM());
		// WomenUnder65HeightM
		valueObject.setWomenUnder65HeightM(domainObject.getWomenUnder65HeightM());
		// WomenOver65HeightM
		valueObject.setWomenOver65HeightM(domainObject.getWomenOver65HeightM());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.configuration.domain.objects.PatientHeightEstimationULNAConfig extractPatientHeightEstimationULNAConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientHeightEstimationULNAConfigVo valueObject) 
	{
		return 	extractPatientHeightEstimationULNAConfig(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.configuration.domain.objects.PatientHeightEstimationULNAConfig extractPatientHeightEstimationULNAConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientHeightEstimationULNAConfigVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientHeightEstimationULNAConfig();
		ims.clinical.configuration.domain.objects.PatientHeightEstimationULNAConfig domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.configuration.domain.objects.PatientHeightEstimationULNAConfig)domMap.get(valueObject);
			}
			// ims.clinical.vo.PatientHeightEstimationULNAConfigVo ID_PatientHeightEstimationULNAConfig field is unknown
			domainObject = new ims.clinical.configuration.domain.objects.PatientHeightEstimationULNAConfig();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientHeightEstimationULNAConfig());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.configuration.domain.objects.PatientHeightEstimationULNAConfig)domMap.get(key);
			}
			domainObject = (ims.clinical.configuration.domain.objects.PatientHeightEstimationULNAConfig) domainFactory.getDomainObject(ims.clinical.configuration.domain.objects.PatientHeightEstimationULNAConfig.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientHeightEstimationULNAConfig());

		domainObject.setULNALengthCM(valueObject.getULNALengthCM());
		domainObject.setMenUnder65HeightM(valueObject.getMenUnder65HeightM());
		domainObject.setMenOver65HeightM(valueObject.getMenOver65HeightM());
		domainObject.setWomenUnder65HeightM(valueObject.getWomenUnder65HeightM());
		domainObject.setWomenOver65HeightM(valueObject.getWomenOver65HeightM());

		return domainObject;
	}

}
