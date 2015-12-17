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
package ims.clinicaladmin.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Marius Mihalec
 */
public class MedicationHotlistShortVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinicaladmin.vo.MedicationHotlistShortVo copy(ims.clinicaladmin.vo.MedicationHotlistShortVo valueObjectDest, ims.clinicaladmin.vo.MedicationHotlistShortVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_MedicationHotlist(valueObjectSrc.getID_MedicationHotlist());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// isGlobal
		valueObjectDest.setIsGlobal(valueObjectSrc.getIsGlobal());
		// User
		valueObjectDest.setUser(valueObjectSrc.getUser());
		// Specialty
		valueObjectDest.setSpecialty(valueObjectSrc.getSpecialty());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createMedicationHotlistShortVoCollectionFromMedicationHotlist(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.configuration.domain.objects.MedicationHotlist objects.
	 */
	public static ims.clinicaladmin.vo.MedicationHotlistShortVoCollection createMedicationHotlistShortVoCollectionFromMedicationHotlist(java.util.Set domainObjectSet)	
	{
		return createMedicationHotlistShortVoCollectionFromMedicationHotlist(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.configuration.domain.objects.MedicationHotlist objects.
	 */
	public static ims.clinicaladmin.vo.MedicationHotlistShortVoCollection createMedicationHotlistShortVoCollectionFromMedicationHotlist(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinicaladmin.vo.MedicationHotlistShortVoCollection voList = new ims.clinicaladmin.vo.MedicationHotlistShortVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.configuration.domain.objects.MedicationHotlist domainObject = (ims.clinical.configuration.domain.objects.MedicationHotlist) iterator.next();
			ims.clinicaladmin.vo.MedicationHotlistShortVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.configuration.domain.objects.MedicationHotlist objects.
	 */
	public static ims.clinicaladmin.vo.MedicationHotlistShortVoCollection createMedicationHotlistShortVoCollectionFromMedicationHotlist(java.util.List domainObjectList) 
	{
		return createMedicationHotlistShortVoCollectionFromMedicationHotlist(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.configuration.domain.objects.MedicationHotlist objects.
	 */
	public static ims.clinicaladmin.vo.MedicationHotlistShortVoCollection createMedicationHotlistShortVoCollectionFromMedicationHotlist(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinicaladmin.vo.MedicationHotlistShortVoCollection voList = new ims.clinicaladmin.vo.MedicationHotlistShortVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.configuration.domain.objects.MedicationHotlist domainObject = (ims.clinical.configuration.domain.objects.MedicationHotlist) domainObjectList.get(i);
			ims.clinicaladmin.vo.MedicationHotlistShortVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.configuration.domain.objects.MedicationHotlist set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractMedicationHotlistSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.MedicationHotlistShortVoCollection voCollection) 
	 {
	 	return extractMedicationHotlistSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractMedicationHotlistSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.MedicationHotlistShortVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinicaladmin.vo.MedicationHotlistShortVo vo = voCollection.get(i);
			ims.clinical.configuration.domain.objects.MedicationHotlist domainObject = MedicationHotlistShortVoAssembler.extractMedicationHotlist(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.configuration.domain.objects.MedicationHotlist list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractMedicationHotlistList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.MedicationHotlistShortVoCollection voCollection) 
	 {
	 	return extractMedicationHotlistList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractMedicationHotlistList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.MedicationHotlistShortVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinicaladmin.vo.MedicationHotlistShortVo vo = voCollection.get(i);
			ims.clinical.configuration.domain.objects.MedicationHotlist domainObject = MedicationHotlistShortVoAssembler.extractMedicationHotlist(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.configuration.domain.objects.MedicationHotlist object.
	 * @param domainObject ims.clinical.configuration.domain.objects.MedicationHotlist
	 */
	 public static ims.clinicaladmin.vo.MedicationHotlistShortVo create(ims.clinical.configuration.domain.objects.MedicationHotlist domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.configuration.domain.objects.MedicationHotlist object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinicaladmin.vo.MedicationHotlistShortVo create(DomainObjectMap map, ims.clinical.configuration.domain.objects.MedicationHotlist domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinicaladmin.vo.MedicationHotlistShortVo valueObject = (ims.clinicaladmin.vo.MedicationHotlistShortVo) map.getValueObject(domainObject, ims.clinicaladmin.vo.MedicationHotlistShortVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinicaladmin.vo.MedicationHotlistShortVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.configuration.domain.objects.MedicationHotlist
	 */
	 public static ims.clinicaladmin.vo.MedicationHotlistShortVo insert(ims.clinicaladmin.vo.MedicationHotlistShortVo valueObject, ims.clinical.configuration.domain.objects.MedicationHotlist domainObject) 
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
	 * @param domainObject ims.clinical.configuration.domain.objects.MedicationHotlist
	 */
	 public static ims.clinicaladmin.vo.MedicationHotlistShortVo insert(DomainObjectMap map, ims.clinicaladmin.vo.MedicationHotlistShortVo valueObject, ims.clinical.configuration.domain.objects.MedicationHotlist domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_MedicationHotlist(domainObject.getId());
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
			
		// isGlobal
		valueObject.setIsGlobal( domainObject.isIsGlobal() );
		// User
		if (domainObject.getUser() != null)
		{
			if(domainObject.getUser() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getUser();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setUser(new ims.core.resource.people.vo.MedicRefVo(id, -1));				
			}
			else
			{
				valueObject.setUser(new ims.core.resource.people.vo.MedicRefVo(domainObject.getUser().getId(), domainObject.getUser().getVersion()));
			}
		}
		// Specialty
		ims.domain.lookups.LookupInstance instance3 = domainObject.getSpecialty();
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

			ims.core.vo.lookups.Specialty voLookup3 = new ims.core.vo.lookups.Specialty(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.Specialty(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setSpecialty(voLookup3);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.configuration.domain.objects.MedicationHotlist extractMedicationHotlist(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.MedicationHotlistShortVo valueObject) 
	{
		return 	extractMedicationHotlist(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.configuration.domain.objects.MedicationHotlist extractMedicationHotlist(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.MedicationHotlistShortVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_MedicationHotlist();
		ims.clinical.configuration.domain.objects.MedicationHotlist domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.configuration.domain.objects.MedicationHotlist)domMap.get(valueObject);
			}
			// ims.clinicaladmin.vo.MedicationHotlistShortVo ID_MedicationHotlist field is unknown
			domainObject = new ims.clinical.configuration.domain.objects.MedicationHotlist();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_MedicationHotlist());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.configuration.domain.objects.MedicationHotlist)domMap.get(key);
			}
			domainObject = (ims.clinical.configuration.domain.objects.MedicationHotlist) domainFactory.getDomainObject(ims.clinical.configuration.domain.objects.MedicationHotlist.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_MedicationHotlist());

		domainObject.setIsGlobal(valueObject.getIsGlobal());
		ims.core.resource.people.domain.objects.Medic value2 = null;
		if ( null != valueObject.getUser() ) 
		{
			if (valueObject.getUser().getBoId() == null)
			{
				if (domMap.get(valueObject.getUser()) != null)
				{
					value2 = (ims.core.resource.people.domain.objects.Medic)domMap.get(valueObject.getUser());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getUser();	
			}
			else
			{
				value2 = (ims.core.resource.people.domain.objects.Medic)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Medic.class, valueObject.getUser().getBoId());
			}
		}
		domainObject.setUser(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value3);

		return domainObject;
	}

}
