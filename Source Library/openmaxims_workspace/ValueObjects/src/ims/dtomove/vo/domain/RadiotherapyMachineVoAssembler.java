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
 * Generated on 12/10/2015, 13:25
 *
 */
package ims.dtomove.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Barbara Worwood
 */
public class RadiotherapyMachineVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.dtomove.vo.RadiotherapyMachineVo copy(ims.dtomove.vo.RadiotherapyMachineVo valueObjectDest, ims.dtomove.vo.RadiotherapyMachineVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_RadiotherapyMachine(valueObjectSrc.getID_RadiotherapyMachine());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// location
		valueObjectDest.setLocation(valueObjectSrc.getLocation());
		// name
		valueObjectDest.setName(valueObjectSrc.getName());
		// dateComm
		valueObjectDest.setDateComm(valueObjectSrc.getDateComm());
		// machineType
		valueObjectDest.setMachineType(valueObjectSrc.getMachineType());
		// active
		valueObjectDest.setActive(valueObjectSrc.getActive());
		// dateDeComm
		valueObjectDest.setDateDeComm(valueObjectSrc.getDateDeComm());
		// modalities
		valueObjectDest.setModalities(valueObjectSrc.getModalities());
		// exclusionTimes
		valueObjectDest.setExclusionTimes(valueObjectSrc.getExclusionTimes());
		// exclusionDates
		valueObjectDest.setExclusionDates(valueObjectSrc.getExclusionDates());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createRadiotherapyMachineVoCollectionFromRadiotherapyMachine(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.dto_move.domain.objects.RadiotherapyMachine objects.
	 */
	public static ims.dtomove.vo.RadiotherapyMachineVoCollection createRadiotherapyMachineVoCollectionFromRadiotherapyMachine(java.util.Set domainObjectSet)	
	{
		return createRadiotherapyMachineVoCollectionFromRadiotherapyMachine(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.dto_move.domain.objects.RadiotherapyMachine objects.
	 */
	public static ims.dtomove.vo.RadiotherapyMachineVoCollection createRadiotherapyMachineVoCollectionFromRadiotherapyMachine(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.dtomove.vo.RadiotherapyMachineVoCollection voList = new ims.dtomove.vo.RadiotherapyMachineVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.dto_move.domain.objects.RadiotherapyMachine domainObject = (ims.dto_move.domain.objects.RadiotherapyMachine) iterator.next();
			ims.dtomove.vo.RadiotherapyMachineVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.dto_move.domain.objects.RadiotherapyMachine objects.
	 */
	public static ims.dtomove.vo.RadiotherapyMachineVoCollection createRadiotherapyMachineVoCollectionFromRadiotherapyMachine(java.util.List domainObjectList) 
	{
		return createRadiotherapyMachineVoCollectionFromRadiotherapyMachine(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.dto_move.domain.objects.RadiotherapyMachine objects.
	 */
	public static ims.dtomove.vo.RadiotherapyMachineVoCollection createRadiotherapyMachineVoCollectionFromRadiotherapyMachine(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.dtomove.vo.RadiotherapyMachineVoCollection voList = new ims.dtomove.vo.RadiotherapyMachineVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.dto_move.domain.objects.RadiotherapyMachine domainObject = (ims.dto_move.domain.objects.RadiotherapyMachine) domainObjectList.get(i);
			ims.dtomove.vo.RadiotherapyMachineVo vo = create(map, domainObject);

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
	 * Create the ims.dto_move.domain.objects.RadiotherapyMachine set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractRadiotherapyMachineSet(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.RadiotherapyMachineVoCollection voCollection) 
	 {
	 	return extractRadiotherapyMachineSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractRadiotherapyMachineSet(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.RadiotherapyMachineVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.dtomove.vo.RadiotherapyMachineVo vo = voCollection.get(i);
			ims.dto_move.domain.objects.RadiotherapyMachine domainObject = RadiotherapyMachineVoAssembler.extractRadiotherapyMachine(domainFactory, vo, domMap);

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
	 * Create the ims.dto_move.domain.objects.RadiotherapyMachine list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractRadiotherapyMachineList(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.RadiotherapyMachineVoCollection voCollection) 
	 {
	 	return extractRadiotherapyMachineList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractRadiotherapyMachineList(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.RadiotherapyMachineVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.dtomove.vo.RadiotherapyMachineVo vo = voCollection.get(i);
			ims.dto_move.domain.objects.RadiotherapyMachine domainObject = RadiotherapyMachineVoAssembler.extractRadiotherapyMachine(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.dto_move.domain.objects.RadiotherapyMachine object.
	 * @param domainObject ims.dto_move.domain.objects.RadiotherapyMachine
	 */
	 public static ims.dtomove.vo.RadiotherapyMachineVo create(ims.dto_move.domain.objects.RadiotherapyMachine domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.dto_move.domain.objects.RadiotherapyMachine object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.dtomove.vo.RadiotherapyMachineVo create(DomainObjectMap map, ims.dto_move.domain.objects.RadiotherapyMachine domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.dtomove.vo.RadiotherapyMachineVo valueObject = (ims.dtomove.vo.RadiotherapyMachineVo) map.getValueObject(domainObject, ims.dtomove.vo.RadiotherapyMachineVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.dtomove.vo.RadiotherapyMachineVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.dto_move.domain.objects.RadiotherapyMachine
	 */
	 public static ims.dtomove.vo.RadiotherapyMachineVo insert(ims.dtomove.vo.RadiotherapyMachineVo valueObject, ims.dto_move.domain.objects.RadiotherapyMachine domainObject) 
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
	 * @param domainObject ims.dto_move.domain.objects.RadiotherapyMachine
	 */
	 public static ims.dtomove.vo.RadiotherapyMachineVo insert(DomainObjectMap map, ims.dtomove.vo.RadiotherapyMachineVo valueObject, ims.dto_move.domain.objects.RadiotherapyMachine domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_RadiotherapyMachine(domainObject.getId());
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
			
		// location
		if (domainObject.getLocation() != null)
		{
			if(domainObject.getLocation() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getLocation();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setLocation(new ims.dto_move.vo.InternalLocationRefVo(id, -1));				
			}
			else
			{
				valueObject.setLocation(new ims.dto_move.vo.InternalLocationRefVo(domainObject.getLocation().getId(), domainObject.getLocation().getVersion()));
			}
		}
		// name
		valueObject.setName(domainObject.getName());
		// dateComm
		java.util.Date dateComm = domainObject.getDateComm();
		if ( null != dateComm ) 
		{
			valueObject.setDateComm(new ims.framework.utils.Date(dateComm) );
		}
		// machineType
		valueObject.setMachineType(domainObject.getMachineType());
		// active
		valueObject.setActive(domainObject.getActive());
		// dateDeComm
		java.util.Date dateDeComm = domainObject.getDateDeComm();
		if ( null != dateDeComm ) 
		{
			valueObject.setDateDeComm(new ims.framework.utils.Date(dateDeComm) );
		}
		// modalities
		valueObject.setModalities(ims.dtomove.vo.domain.MachineModalityVoAssembler.createMachineModalityVoCollectionFromMachineModality(map, domainObject.getModalities()) );
		// exclusionTimes
		valueObject.setExclusionTimes(ims.dtomove.vo.domain.MachineExclusionTimeVoAssembler.createMachineExclusionTimeVoCollectionFromMachineExclusionTime(map, domainObject.getExclusionTimes()) );
		// exclusionDates
		valueObject.setExclusionDates(ims.dtomove.vo.domain.MachineExclusionDateVoAssembler.createMachineExclusionDateVoCollectionFromMachineExclusionDate(map, domainObject.getExclusionDates()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.dto_move.domain.objects.RadiotherapyMachine extractRadiotherapyMachine(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.RadiotherapyMachineVo valueObject) 
	{
		return 	extractRadiotherapyMachine(domainFactory, valueObject, new HashMap());
	}

	public static ims.dto_move.domain.objects.RadiotherapyMachine extractRadiotherapyMachine(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.RadiotherapyMachineVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_RadiotherapyMachine();
		ims.dto_move.domain.objects.RadiotherapyMachine domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.dto_move.domain.objects.RadiotherapyMachine)domMap.get(valueObject);
			}
			// ims.dtomove.vo.RadiotherapyMachineVo ID_RadiotherapyMachine field is unknown
			domainObject = new ims.dto_move.domain.objects.RadiotherapyMachine();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_RadiotherapyMachine());
			if (domMap.get(key) != null)
			{
				return (ims.dto_move.domain.objects.RadiotherapyMachine)domMap.get(key);
			}
			domainObject = (ims.dto_move.domain.objects.RadiotherapyMachine) domainFactory.getDomainObject(ims.dto_move.domain.objects.RadiotherapyMachine.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_RadiotherapyMachine());

		ims.dto_move.domain.objects.InternalLocation value1 = null;
		if ( null != valueObject.getLocation() ) 
		{
			if (valueObject.getLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getLocation()) != null)
				{
					value1 = (ims.dto_move.domain.objects.InternalLocation)domMap.get(valueObject.getLocation());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getLocation();	
			}
			else
			{
				value1 = (ims.dto_move.domain.objects.InternalLocation)domainFactory.getDomainObject(ims.dto_move.domain.objects.InternalLocation.class, valueObject.getLocation().getBoId());
			}
		}
		domainObject.setLocation(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());
		java.util.Date value3 = null;
		ims.framework.utils.Date date3 = valueObject.getDateComm();		
		if ( date3 != null ) 
		{
			value3 = date3.getDate();
		}
		domainObject.setDateComm(value3);
		domainObject.setMachineType(valueObject.getMachineType());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getActive() != null && valueObject.getActive().equals(""))
		{
			valueObject.setActive(null);
		}
		domainObject.setActive(valueObject.getActive());
		java.util.Date value6 = null;
		ims.framework.utils.Date date6 = valueObject.getDateDeComm();		
		if ( date6 != null ) 
		{
			value6 = date6.getDate();
		}
		domainObject.setDateDeComm(value6);

		// SaveAsRefVO treated as RefValueObject
		ims.dto_move.vo.MachineModalityRefVoCollection refCollection7 = new ims.dto_move.vo.MachineModalityRefVoCollection();
		if (valueObject.getModalities() != null)
		{
			for (int i7=0; i7<valueObject.getModalities().size(); i7++)
			{
				ims.dto_move.vo.MachineModalityRefVo ref7 = (ims.dto_move.vo.MachineModalityRefVo)valueObject.getModalities().get(i7);
				refCollection7.add(ref7);
			}
		}
		int size7 = (null == refCollection7) ? 0 : refCollection7.size();		
		java.util.List domainModalities7 = domainObject.getModalities();
		if (domainModalities7 == null)
		{
			domainModalities7 = new java.util.ArrayList();
		}
		for(int i=0; i < size7; i++) 
		{
			ims.dto_move.vo.MachineModalityRefVo vo = refCollection7.get(i);			
			ims.dto_move.domain.objects.MachineModality dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.dto_move.domain.objects.MachineModality)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.dto_move.domain.objects.MachineModality)domainFactory.getDomainObject( ims.dto_move.domain.objects.MachineModality.class, vo.getBoId());
				}
			}

			int domIdx = domainModalities7.indexOf(dom);
			if (domIdx == -1)
			{
				domainModalities7.add(i, dom);
			}
			else if (i != domIdx && i < domainModalities7.size())
			{
				Object tmp = domainModalities7.get(i);
				domainModalities7.set(i, domainModalities7.get(domIdx));
				domainModalities7.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i7 = domainModalities7.size();
		while (i7 > size7)
		{
			domainModalities7.remove(i7-1);
			i7 = domainModalities7.size();
		}
		
		domainObject.setModalities(domainModalities7);		

		// SaveAsRefVO treated as RefValueObject
		ims.dto_move.vo.MachineExclusionTimeRefVoCollection refCollection8 = new ims.dto_move.vo.MachineExclusionTimeRefVoCollection();
		if (valueObject.getExclusionTimes() != null)
		{
			for (int i8=0; i8<valueObject.getExclusionTimes().size(); i8++)
			{
				ims.dto_move.vo.MachineExclusionTimeRefVo ref8 = (ims.dto_move.vo.MachineExclusionTimeRefVo)valueObject.getExclusionTimes().get(i8);
				refCollection8.add(ref8);
			}
		}
		int size8 = (null == refCollection8) ? 0 : refCollection8.size();		
		java.util.List domainExclusionTimes8 = domainObject.getExclusionTimes();
		if (domainExclusionTimes8 == null)
		{
			domainExclusionTimes8 = new java.util.ArrayList();
		}
		for(int i=0; i < size8; i++) 
		{
			ims.dto_move.vo.MachineExclusionTimeRefVo vo = refCollection8.get(i);			
			ims.dto_move.domain.objects.MachineExclusionTime dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.dto_move.domain.objects.MachineExclusionTime)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.dto_move.domain.objects.MachineExclusionTime)domainFactory.getDomainObject( ims.dto_move.domain.objects.MachineExclusionTime.class, vo.getBoId());
				}
			}

			int domIdx = domainExclusionTimes8.indexOf(dom);
			if (domIdx == -1)
			{
				domainExclusionTimes8.add(i, dom);
			}
			else if (i != domIdx && i < domainExclusionTimes8.size())
			{
				Object tmp = domainExclusionTimes8.get(i);
				domainExclusionTimes8.set(i, domainExclusionTimes8.get(domIdx));
				domainExclusionTimes8.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i8 = domainExclusionTimes8.size();
		while (i8 > size8)
		{
			domainExclusionTimes8.remove(i8-1);
			i8 = domainExclusionTimes8.size();
		}
		
		domainObject.setExclusionTimes(domainExclusionTimes8);		

		// SaveAsRefVO treated as RefValueObject
		ims.dto_move.vo.MachineExclusionDateRefVoCollection refCollection9 = new ims.dto_move.vo.MachineExclusionDateRefVoCollection();
		if (valueObject.getExclusionDates() != null)
		{
			for (int i9=0; i9<valueObject.getExclusionDates().size(); i9++)
			{
				ims.dto_move.vo.MachineExclusionDateRefVo ref9 = (ims.dto_move.vo.MachineExclusionDateRefVo)valueObject.getExclusionDates().get(i9);
				refCollection9.add(ref9);
			}
		}
		int size9 = (null == refCollection9) ? 0 : refCollection9.size();		
		java.util.List domainExclusionDates9 = domainObject.getExclusionDates();
		if (domainExclusionDates9 == null)
		{
			domainExclusionDates9 = new java.util.ArrayList();
		}
		for(int i=0; i < size9; i++) 
		{
			ims.dto_move.vo.MachineExclusionDateRefVo vo = refCollection9.get(i);			
			ims.dto_move.domain.objects.MachineExclusionDate dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.dto_move.domain.objects.MachineExclusionDate)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.dto_move.domain.objects.MachineExclusionDate)domainFactory.getDomainObject( ims.dto_move.domain.objects.MachineExclusionDate.class, vo.getBoId());
				}
			}

			int domIdx = domainExclusionDates9.indexOf(dom);
			if (domIdx == -1)
			{
				domainExclusionDates9.add(i, dom);
			}
			else if (i != domIdx && i < domainExclusionDates9.size())
			{
				Object tmp = domainExclusionDates9.get(i);
				domainExclusionDates9.set(i, domainExclusionDates9.get(domIdx));
				domainExclusionDates9.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i9 = domainExclusionDates9.size();
		while (i9 > size9)
		{
			domainExclusionDates9.remove(i9-1);
			i9 = domainExclusionDates9.size();
		}
		
		domainObject.setExclusionDates(domainExclusionDates9);		

		return domainObject;
	}

}
