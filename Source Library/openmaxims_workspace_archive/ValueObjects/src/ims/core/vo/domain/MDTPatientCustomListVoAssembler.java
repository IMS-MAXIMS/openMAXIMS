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
 * @author Peter Martin
 */
public class MDTPatientCustomListVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.MDTPatientCustomListVo copy(ims.core.vo.MDTPatientCustomListVo valueObjectDest, ims.core.vo.MDTPatientCustomListVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_MDTPatientCustomList(valueObjectSrc.getID_MDTPatientCustomList());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CustomListType
		valueObjectDest.setCustomListType(valueObjectSrc.getCustomListType());
		// Patients
		valueObjectDest.setPatients(valueObjectSrc.getPatients());
		// ListOrder
		valueObjectDest.setListOrder(valueObjectSrc.getListOrder());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createMDTPatientCustomListVoCollectionFromMDTPatientCustomList(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.MDTPatientCustomList objects.
	 */
	public static ims.core.vo.MDTPatientCustomListVoCollection createMDTPatientCustomListVoCollectionFromMDTPatientCustomList(java.util.Set domainObjectSet)	
	{
		return createMDTPatientCustomListVoCollectionFromMDTPatientCustomList(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.MDTPatientCustomList objects.
	 */
	public static ims.core.vo.MDTPatientCustomListVoCollection createMDTPatientCustomListVoCollectionFromMDTPatientCustomList(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.MDTPatientCustomListVoCollection voList = new ims.core.vo.MDTPatientCustomListVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.MDTPatientCustomList domainObject = (ims.core.clinical.domain.objects.MDTPatientCustomList) iterator.next();
			ims.core.vo.MDTPatientCustomListVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.MDTPatientCustomList objects.
	 */
	public static ims.core.vo.MDTPatientCustomListVoCollection createMDTPatientCustomListVoCollectionFromMDTPatientCustomList(java.util.List domainObjectList) 
	{
		return createMDTPatientCustomListVoCollectionFromMDTPatientCustomList(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.MDTPatientCustomList objects.
	 */
	public static ims.core.vo.MDTPatientCustomListVoCollection createMDTPatientCustomListVoCollectionFromMDTPatientCustomList(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.MDTPatientCustomListVoCollection voList = new ims.core.vo.MDTPatientCustomListVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.MDTPatientCustomList domainObject = (ims.core.clinical.domain.objects.MDTPatientCustomList) domainObjectList.get(i);
			ims.core.vo.MDTPatientCustomListVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.MDTPatientCustomList set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractMDTPatientCustomListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MDTPatientCustomListVoCollection voCollection) 
	 {
	 	return extractMDTPatientCustomListSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractMDTPatientCustomListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MDTPatientCustomListVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.MDTPatientCustomListVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.MDTPatientCustomList domainObject = MDTPatientCustomListVoAssembler.extractMDTPatientCustomList(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.MDTPatientCustomList list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractMDTPatientCustomListList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MDTPatientCustomListVoCollection voCollection) 
	 {
	 	return extractMDTPatientCustomListList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractMDTPatientCustomListList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MDTPatientCustomListVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.MDTPatientCustomListVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.MDTPatientCustomList domainObject = MDTPatientCustomListVoAssembler.extractMDTPatientCustomList(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.MDTPatientCustomList object.
	 * @param domainObject ims.core.clinical.domain.objects.MDTPatientCustomList
	 */
	 public static ims.core.vo.MDTPatientCustomListVo create(ims.core.clinical.domain.objects.MDTPatientCustomList domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.MDTPatientCustomList object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.MDTPatientCustomListVo create(DomainObjectMap map, ims.core.clinical.domain.objects.MDTPatientCustomList domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.MDTPatientCustomListVo valueObject = (ims.core.vo.MDTPatientCustomListVo) map.getValueObject(domainObject, ims.core.vo.MDTPatientCustomListVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.MDTPatientCustomListVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.MDTPatientCustomList
	 */
	 public static ims.core.vo.MDTPatientCustomListVo insert(ims.core.vo.MDTPatientCustomListVo valueObject, ims.core.clinical.domain.objects.MDTPatientCustomList domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.MDTPatientCustomList
	 */
	 public static ims.core.vo.MDTPatientCustomListVo insert(DomainObjectMap map, ims.core.vo.MDTPatientCustomListVo valueObject, ims.core.clinical.domain.objects.MDTPatientCustomList domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_MDTPatientCustomList(domainObject.getId());
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
			
		// CustomListType
		if (domainObject.getCustomListType() != null)
		{
			if(domainObject.getCustomListType() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCustomListType();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCustomListType(new ims.core.configuration.vo.CustomListRefVo(id, -1));				
			}
			else
			{
				valueObject.setCustomListType(new ims.core.configuration.vo.CustomListRefVo(domainObject.getCustomListType().getId(), domainObject.getCustomListType().getVersion()));
			}
		}
		// Patients
		valueObject.setPatients(ims.core.vo.domain.PatientShortAssembler.createPatientShortCollectionFromPatient(map, domainObject.getPatients()) );
		// ListOrder
		valueObject.setListOrder(domainObject.getListOrder());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.MDTPatientCustomList extractMDTPatientCustomList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MDTPatientCustomListVo valueObject) 
	{
		return 	extractMDTPatientCustomList(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.MDTPatientCustomList extractMDTPatientCustomList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MDTPatientCustomListVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_MDTPatientCustomList();
		ims.core.clinical.domain.objects.MDTPatientCustomList domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.MDTPatientCustomList)domMap.get(valueObject);
			}
			// ims.core.vo.MDTPatientCustomListVo ID_MDTPatientCustomList field is unknown
			domainObject = new ims.core.clinical.domain.objects.MDTPatientCustomList();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_MDTPatientCustomList());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.MDTPatientCustomList)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.MDTPatientCustomList) domainFactory.getDomainObject(ims.core.clinical.domain.objects.MDTPatientCustomList.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_MDTPatientCustomList());

		ims.core.configuration.domain.objects.CustomList value1 = null;
		if ( null != valueObject.getCustomListType() ) 
		{
			if (valueObject.getCustomListType().getBoId() == null)
			{
				if (domMap.get(valueObject.getCustomListType()) != null)
				{
					value1 = (ims.core.configuration.domain.objects.CustomList)domMap.get(valueObject.getCustomListType());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getCustomListType();	
			}
			else
			{
				value1 = (ims.core.configuration.domain.objects.CustomList)domainFactory.getDomainObject(ims.core.configuration.domain.objects.CustomList.class, valueObject.getCustomListType().getBoId());
			}
		}
		domainObject.setCustomListType(value1);

		// SaveAsRefVO treated as RefValueObject
		ims.core.patient.vo.PatientRefVoCollection refCollection2 = new ims.core.patient.vo.PatientRefVoCollection();
		if (valueObject.getPatients() != null)
		{
			for (int i2=0; i2<valueObject.getPatients().size(); i2++)
			{
				ims.core.patient.vo.PatientRefVo ref2 = (ims.core.patient.vo.PatientRefVo)valueObject.getPatients().get(i2);
				refCollection2.add(ref2);
			}
		}
		int size2 = (null == refCollection2) ? 0 : refCollection2.size();		
		java.util.Set domainPatients2 = domainObject.getPatients();
		if (domainPatients2 == null)
		{
			domainPatients2 = new java.util.HashSet();
		}
		java.util.Set newSet2  = new java.util.HashSet();
		for(int i=0; i<size2; i++) 
		{
			ims.core.patient.vo.PatientRefVo vo = refCollection2.get(i);					
			ims.core.patient.domain.objects.Patient dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.patient.domain.objects.Patient)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject( ims.core.patient.domain.objects.Patient.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainPatients2.contains(dom))
			{
				domainPatients2.add(dom);
			}
			newSet2.add(dom);			
		}
		java.util.Set removedSet2 = new java.util.HashSet();
		java.util.Iterator iter2 = domainPatients2.iterator();
		//Find out which objects need to be removed
		while (iter2.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter2.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet2.contains(o))
			{
				removedSet2.add(o);
			}
		}
		iter2 = removedSet2.iterator();
		//Remove the unwanted objects
		while (iter2.hasNext())
		{
			domainPatients2.remove(iter2.next());
		}		
		
		domainObject.setPatients(domainPatients2);		
		domainObject.setListOrder(valueObject.getListOrder());

		return domainObject;
	}

}
