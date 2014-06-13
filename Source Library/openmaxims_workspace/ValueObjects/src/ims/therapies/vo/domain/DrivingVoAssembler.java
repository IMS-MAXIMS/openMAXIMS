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
package ims.therapies.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Peter Martin
 */
public class DrivingVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.therapies.vo.DrivingVo copy(ims.therapies.vo.DrivingVo valueObjectDest, ims.therapies.vo.DrivingVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Driving(valueObjectSrc.getID_Driving());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// AuthoringDateTime
		valueObjectDest.setAuthoringDateTime(valueObjectSrc.getAuthoringDateTime());
		// AuthoringCP
		valueObjectDest.setAuthoringCP(valueObjectSrc.getAuthoringCP());
		// DrivingCommencedDate
		valueObjectDest.setDrivingCommencedDate(valueObjectSrc.getDrivingCommencedDate());
		// VehicleType
		valueObjectDest.setVehicleType(valueObjectSrc.getVehicleType());
		// SpecialistInfoEquip
		valueObjectDest.setSpecialistInfoEquip(valueObjectSrc.getSpecialistInfoEquip());
		// DrivingAspect
		valueObjectDest.setDrivingAspect(valueObjectSrc.getDrivingAspect());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createDrivingVoCollectionFromDriving(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.therapies.workleisuredriving.domain.objects.Driving objects.
	 */
	public static ims.therapies.vo.DrivingVoCollection createDrivingVoCollectionFromDriving(java.util.Set domainObjectSet)	
	{
		return createDrivingVoCollectionFromDriving(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.therapies.workleisuredriving.domain.objects.Driving objects.
	 */
	public static ims.therapies.vo.DrivingVoCollection createDrivingVoCollectionFromDriving(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.therapies.vo.DrivingVoCollection voList = new ims.therapies.vo.DrivingVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.therapies.workleisuredriving.domain.objects.Driving domainObject = (ims.therapies.workleisuredriving.domain.objects.Driving) iterator.next();
			ims.therapies.vo.DrivingVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.therapies.workleisuredriving.domain.objects.Driving objects.
	 */
	public static ims.therapies.vo.DrivingVoCollection createDrivingVoCollectionFromDriving(java.util.List domainObjectList) 
	{
		return createDrivingVoCollectionFromDriving(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.therapies.workleisuredriving.domain.objects.Driving objects.
	 */
	public static ims.therapies.vo.DrivingVoCollection createDrivingVoCollectionFromDriving(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.therapies.vo.DrivingVoCollection voList = new ims.therapies.vo.DrivingVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.therapies.workleisuredriving.domain.objects.Driving domainObject = (ims.therapies.workleisuredriving.domain.objects.Driving) domainObjectList.get(i);
			ims.therapies.vo.DrivingVo vo = create(map, domainObject);

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
	 * Create the ims.therapies.workleisuredriving.domain.objects.Driving set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractDrivingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.DrivingVoCollection voCollection) 
	 {
	 	return extractDrivingSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractDrivingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.DrivingVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.DrivingVo vo = voCollection.get(i);
			ims.therapies.workleisuredriving.domain.objects.Driving domainObject = DrivingVoAssembler.extractDriving(domainFactory, vo, domMap);

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
	 * Create the ims.therapies.workleisuredriving.domain.objects.Driving list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractDrivingList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.DrivingVoCollection voCollection) 
	 {
	 	return extractDrivingList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractDrivingList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.DrivingVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.DrivingVo vo = voCollection.get(i);
			ims.therapies.workleisuredriving.domain.objects.Driving domainObject = DrivingVoAssembler.extractDriving(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.therapies.workleisuredriving.domain.objects.Driving object.
	 * @param domainObject ims.therapies.workleisuredriving.domain.objects.Driving
	 */
	 public static ims.therapies.vo.DrivingVo create(ims.therapies.workleisuredriving.domain.objects.Driving domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.therapies.workleisuredriving.domain.objects.Driving object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.therapies.vo.DrivingVo create(DomainObjectMap map, ims.therapies.workleisuredriving.domain.objects.Driving domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.therapies.vo.DrivingVo valueObject = (ims.therapies.vo.DrivingVo) map.getValueObject(domainObject, ims.therapies.vo.DrivingVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.therapies.vo.DrivingVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.therapies.workleisuredriving.domain.objects.Driving
	 */
	 public static ims.therapies.vo.DrivingVo insert(ims.therapies.vo.DrivingVo valueObject, ims.therapies.workleisuredriving.domain.objects.Driving domainObject) 
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
	 * @param domainObject ims.therapies.workleisuredriving.domain.objects.Driving
	 */
	 public static ims.therapies.vo.DrivingVo insert(DomainObjectMap map, ims.therapies.vo.DrivingVo valueObject, ims.therapies.workleisuredriving.domain.objects.Driving domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Driving(domainObject.getId());
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
			
		// CareContext
		if (domainObject.getCareContext() != null)
		{
			if(domainObject.getCareContext() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCareContext();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(id, -1));				
			}
			else
			{
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(domainObject.getCareContext().getId(), domainObject.getCareContext().getVersion()));
			}
		}
		// AuthoringDateTime
		java.util.Date AuthoringDateTime = domainObject.getAuthoringDateTime();
		if ( null != AuthoringDateTime ) 
		{
			valueObject.setAuthoringDateTime(new ims.framework.utils.DateTime(AuthoringDateTime) );
		}
		// AuthoringCP
		valueObject.setAuthoringCP(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getAuthoringCP()) );
		// DrivingCommencedDate
		Integer DrivingCommencedDate = domainObject.getDrivingCommencedDate();
		if ( null != DrivingCommencedDate ) 
		{
			valueObject.setDrivingCommencedDate(new ims.framework.utils.PartialDate(DrivingCommencedDate) );
		}
		// VehicleType
		valueObject.setVehicleType(domainObject.getVehicleType());
		// SpecialistInfoEquip
		valueObject.setSpecialistInfoEquip(domainObject.getSpecialistInfoEquip());
		// DrivingAspect
		valueObject.setDrivingAspect(ims.therapies.vo.domain.DrivingAspectVoAssembler.createDrivingAspectVoCollectionFromDrivingAspect(map, domainObject.getDrivingAspect()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.therapies.workleisuredriving.domain.objects.Driving extractDriving(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.DrivingVo valueObject) 
	{
		return 	extractDriving(domainFactory, valueObject, new HashMap());
	}

	public static ims.therapies.workleisuredriving.domain.objects.Driving extractDriving(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.DrivingVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Driving();
		ims.therapies.workleisuredriving.domain.objects.Driving domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.therapies.workleisuredriving.domain.objects.Driving)domMap.get(valueObject);
			}
			// ims.therapies.vo.DrivingVo ID_Driving field is unknown
			domainObject = new ims.therapies.workleisuredriving.domain.objects.Driving();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Driving());
			if (domMap.get(key) != null)
			{
				return (ims.therapies.workleisuredriving.domain.objects.Driving)domMap.get(key);
			}
			domainObject = (ims.therapies.workleisuredriving.domain.objects.Driving) domainFactory.getDomainObject(ims.therapies.workleisuredriving.domain.objects.Driving.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Driving());

		ims.core.admin.domain.objects.CareContext value1 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value1 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getCareContext();	
			}
			else
			{
				value1 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getAuthoringDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setAuthoringDateTime(value2);
		domainObject.setAuthoringCP(ims.core.vo.domain.HcpAssembler.extractHcp(domainFactory, valueObject.getAuthoringCP(), domMap));
		ims.framework.utils.PartialDate DrivingCommencedDate = valueObject.getDrivingCommencedDate();
		Integer value4 = null;
		if ( null != DrivingCommencedDate ) 
		{
			value4 = DrivingCommencedDate.toInteger();
		}
		domainObject.setDrivingCommencedDate(value4);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getVehicleType() != null && valueObject.getVehicleType().equals(""))
		{
			valueObject.setVehicleType(null);
		}
		domainObject.setVehicleType(valueObject.getVehicleType());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSpecialistInfoEquip() != null && valueObject.getSpecialistInfoEquip().equals(""))
		{
			valueObject.setSpecialistInfoEquip(null);
		}
		domainObject.setSpecialistInfoEquip(valueObject.getSpecialistInfoEquip());
		domainObject.setDrivingAspect(ims.therapies.vo.domain.DrivingAspectVoAssembler.extractDrivingAspectSet(domainFactory, valueObject.getDrivingAspect(), domainObject.getDrivingAspect(), domMap));		

		return domainObject;
	}

}
