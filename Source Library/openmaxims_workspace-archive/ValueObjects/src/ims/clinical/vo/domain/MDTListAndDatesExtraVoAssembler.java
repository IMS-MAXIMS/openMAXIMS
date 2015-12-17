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
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Peter Martin
 */
public class MDTListAndDatesExtraVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.MDTListAndDatesExtraVo copy(ims.clinical.vo.MDTListAndDatesExtraVo valueObjectDest, ims.clinical.vo.MDTListAndDatesExtraVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_MDTListandDates(valueObjectSrc.getID_MDTListandDates());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ListPatientisOn
		valueObjectDest.setListPatientisOn(valueObjectSrc.getListPatientisOn());
		// KeyDates
		valueObjectDest.setKeyDates(valueObjectSrc.getKeyDates());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createMDTListAndDatesExtraVoCollectionFromMDTListandDates(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.MDTListandDates objects.
	 */
	public static ims.clinical.vo.MDTListAndDatesExtraVoCollection createMDTListAndDatesExtraVoCollectionFromMDTListandDates(java.util.Set domainObjectSet)	
	{
		return createMDTListAndDatesExtraVoCollectionFromMDTListandDates(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.MDTListandDates objects.
	 */
	public static ims.clinical.vo.MDTListAndDatesExtraVoCollection createMDTListAndDatesExtraVoCollectionFromMDTListandDates(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.MDTListAndDatesExtraVoCollection voList = new ims.clinical.vo.MDTListAndDatesExtraVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.MDTListandDates domainObject = (ims.clinical.domain.objects.MDTListandDates) iterator.next();
			ims.clinical.vo.MDTListAndDatesExtraVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.MDTListandDates objects.
	 */
	public static ims.clinical.vo.MDTListAndDatesExtraVoCollection createMDTListAndDatesExtraVoCollectionFromMDTListandDates(java.util.List domainObjectList) 
	{
		return createMDTListAndDatesExtraVoCollectionFromMDTListandDates(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.MDTListandDates objects.
	 */
	public static ims.clinical.vo.MDTListAndDatesExtraVoCollection createMDTListAndDatesExtraVoCollectionFromMDTListandDates(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.MDTListAndDatesExtraVoCollection voList = new ims.clinical.vo.MDTListAndDatesExtraVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.MDTListandDates domainObject = (ims.clinical.domain.objects.MDTListandDates) domainObjectList.get(i);
			ims.clinical.vo.MDTListAndDatesExtraVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.MDTListandDates set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractMDTListandDatesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.MDTListAndDatesExtraVoCollection voCollection) 
	 {
	 	return extractMDTListandDatesSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractMDTListandDatesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.MDTListAndDatesExtraVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.MDTListAndDatesExtraVo vo = voCollection.get(i);
			ims.clinical.domain.objects.MDTListandDates domainObject = MDTListAndDatesExtraVoAssembler.extractMDTListandDates(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.MDTListandDates list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractMDTListandDatesList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.MDTListAndDatesExtraVoCollection voCollection) 
	 {
	 	return extractMDTListandDatesList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractMDTListandDatesList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.MDTListAndDatesExtraVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.MDTListAndDatesExtraVo vo = voCollection.get(i);
			ims.clinical.domain.objects.MDTListandDates domainObject = MDTListAndDatesExtraVoAssembler.extractMDTListandDates(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.MDTListandDates object.
	 * @param domainObject ims.clinical.domain.objects.MDTListandDates
	 */
	 public static ims.clinical.vo.MDTListAndDatesExtraVo create(ims.clinical.domain.objects.MDTListandDates domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.MDTListandDates object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.MDTListAndDatesExtraVo create(DomainObjectMap map, ims.clinical.domain.objects.MDTListandDates domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.MDTListAndDatesExtraVo valueObject = (ims.clinical.vo.MDTListAndDatesExtraVo) map.getValueObject(domainObject, ims.clinical.vo.MDTListAndDatesExtraVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.MDTListAndDatesExtraVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.MDTListandDates
	 */
	 public static ims.clinical.vo.MDTListAndDatesExtraVo insert(ims.clinical.vo.MDTListAndDatesExtraVo valueObject, ims.clinical.domain.objects.MDTListandDates domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.MDTListandDates
	 */
	 public static ims.clinical.vo.MDTListAndDatesExtraVo insert(DomainObjectMap map, ims.clinical.vo.MDTListAndDatesExtraVo valueObject, ims.clinical.domain.objects.MDTListandDates domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_MDTListandDates(domainObject.getId());
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
			
		// ListPatientisOn
		ims.domain.lookups.LookupInstance instance1 = domainObject.getListPatientisOn();
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

			ims.clinical.vo.lookups.MDTListAorB voLookup1 = new ims.clinical.vo.lookups.MDTListAorB(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.clinical.vo.lookups.MDTListAorB parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.clinical.vo.lookups.MDTListAorB(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setListPatientisOn(voLookup1);
		}
				// KeyDates
		ims.clinical.vo.KeyDatesRefVoCollection KeyDates = new ims.clinical.vo.KeyDatesRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getKeyDates().iterator(); iterator.hasNext(); ) 
		{
			ims.clinical.domain.objects.KeyDates tmp = (ims.clinical.domain.objects.KeyDates)iterator.next();
			if (tmp != null)
				KeyDates.add(new ims.clinical.vo.KeyDatesRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setKeyDates(KeyDates);
		// Patient
		valueObject.setPatient(ims.core.vo.domain.PatientShortAssembler.create(map, domainObject.getPatient()) );
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
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.MDTListandDates extractMDTListandDates(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.MDTListAndDatesExtraVo valueObject) 
	{
		return 	extractMDTListandDates(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.MDTListandDates extractMDTListandDates(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.MDTListAndDatesExtraVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_MDTListandDates();
		ims.clinical.domain.objects.MDTListandDates domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.MDTListandDates)domMap.get(valueObject);
			}
			// ims.clinical.vo.MDTListAndDatesExtraVo ID_MDTListandDates field is unknown
			domainObject = new ims.clinical.domain.objects.MDTListandDates();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_MDTListandDates());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.MDTListandDates)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.MDTListandDates) domainFactory.getDomainObject(ims.clinical.domain.objects.MDTListandDates.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_MDTListandDates());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getListPatientisOn() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getListPatientisOn().getID());
		}
		domainObject.setListPatientisOn(value1);

		ims.clinical.vo.KeyDatesRefVoCollection refCollection2 = valueObject.getKeyDates();
		int size2 = (null == refCollection2) ? 0 : refCollection2.size();		
		java.util.Set domainKeyDates2 = domainObject.getKeyDates();
		if (domainKeyDates2 == null)
		{
			domainKeyDates2 = new java.util.HashSet();
		}
		java.util.Set newSet2  = new java.util.HashSet();
		for(int i=0; i<size2; i++) 
		{
			ims.clinical.vo.KeyDatesRefVo vo = refCollection2.get(i);					
			ims.clinical.domain.objects.KeyDates dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.clinical.domain.objects.KeyDates)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.clinical.domain.objects.KeyDates)domainFactory.getDomainObject( ims.clinical.domain.objects.KeyDates.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainKeyDates2.contains(dom))
			{
				domainKeyDates2.add(dom);
			}
			newSet2.add(dom);			
		}
		java.util.Set removedSet2 = new java.util.HashSet();
		java.util.Iterator iter2 = domainKeyDates2.iterator();
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
			domainKeyDates2.remove(iter2.next());
		}		
		
		domainObject.setKeyDates(domainKeyDates2);		
		domainObject.setPatient(ims.core.vo.domain.PatientShortAssembler.extractPatient(domainFactory, valueObject.getPatient(), domMap));
		ims.core.admin.domain.objects.CareContext value4 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value4 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getCareContext();	
			}
			else
			{
				value4 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value4);

		return domainObject;
	}

}
