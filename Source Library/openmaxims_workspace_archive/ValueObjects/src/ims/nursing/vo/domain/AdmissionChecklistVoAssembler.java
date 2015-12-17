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
package ims.nursing.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cornel Ventuneac
 */
public class AdmissionChecklistVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.nursing.vo.AdmissionChecklistVo copy(ims.nursing.vo.AdmissionChecklistVo valueObjectDest, ims.nursing.vo.AdmissionChecklistVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_AdmissionChecklist(valueObjectSrc.getID_AdmissionChecklist());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ChecklistItem
		valueObjectDest.setChecklistItem(valueObjectSrc.getChecklistItem());
		// CheckedDateTime
		valueObjectDest.setCheckedDateTime(valueObjectSrc.getCheckedDateTime());
		// CheckedHCP
		valueObjectDest.setCheckedHCP(valueObjectSrc.getCheckedHCP());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createAdmissionChecklistVoCollectionFromAdmissionChecklist(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.nursing.domain.objects.AdmissionChecklist objects.
	 */
	public static ims.nursing.vo.AdmissionChecklistVoCollection createAdmissionChecklistVoCollectionFromAdmissionChecklist(java.util.Set domainObjectSet)	
	{
		return createAdmissionChecklistVoCollectionFromAdmissionChecklist(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.nursing.domain.objects.AdmissionChecklist objects.
	 */
	public static ims.nursing.vo.AdmissionChecklistVoCollection createAdmissionChecklistVoCollectionFromAdmissionChecklist(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.nursing.vo.AdmissionChecklistVoCollection voList = new ims.nursing.vo.AdmissionChecklistVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.nursing.domain.objects.AdmissionChecklist domainObject = (ims.nursing.domain.objects.AdmissionChecklist) iterator.next();
			ims.nursing.vo.AdmissionChecklistVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.nursing.domain.objects.AdmissionChecklist objects.
	 */
	public static ims.nursing.vo.AdmissionChecklistVoCollection createAdmissionChecklistVoCollectionFromAdmissionChecklist(java.util.List domainObjectList) 
	{
		return createAdmissionChecklistVoCollectionFromAdmissionChecklist(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.nursing.domain.objects.AdmissionChecklist objects.
	 */
	public static ims.nursing.vo.AdmissionChecklistVoCollection createAdmissionChecklistVoCollectionFromAdmissionChecklist(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.nursing.vo.AdmissionChecklistVoCollection voList = new ims.nursing.vo.AdmissionChecklistVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.nursing.domain.objects.AdmissionChecklist domainObject = (ims.nursing.domain.objects.AdmissionChecklist) domainObjectList.get(i);
			ims.nursing.vo.AdmissionChecklistVo vo = create(map, domainObject);

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
	 * Create the ims.nursing.domain.objects.AdmissionChecklist set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractAdmissionChecklistSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.AdmissionChecklistVoCollection voCollection) 
	 {
	 	return extractAdmissionChecklistSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractAdmissionChecklistSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.AdmissionChecklistVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.AdmissionChecklistVo vo = voCollection.get(i);
			ims.nursing.domain.objects.AdmissionChecklist domainObject = AdmissionChecklistVoAssembler.extractAdmissionChecklist(domainFactory, vo, domMap);

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
	 * Create the ims.nursing.domain.objects.AdmissionChecklist list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractAdmissionChecklistList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.AdmissionChecklistVoCollection voCollection) 
	 {
	 	return extractAdmissionChecklistList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractAdmissionChecklistList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.AdmissionChecklistVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.AdmissionChecklistVo vo = voCollection.get(i);
			ims.nursing.domain.objects.AdmissionChecklist domainObject = AdmissionChecklistVoAssembler.extractAdmissionChecklist(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.nursing.domain.objects.AdmissionChecklist object.
	 * @param domainObject ims.nursing.domain.objects.AdmissionChecklist
	 */
	 public static ims.nursing.vo.AdmissionChecklistVo create(ims.nursing.domain.objects.AdmissionChecklist domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.nursing.domain.objects.AdmissionChecklist object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.nursing.vo.AdmissionChecklistVo create(DomainObjectMap map, ims.nursing.domain.objects.AdmissionChecklist domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.nursing.vo.AdmissionChecklistVo valueObject = (ims.nursing.vo.AdmissionChecklistVo) map.getValueObject(domainObject, ims.nursing.vo.AdmissionChecklistVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.nursing.vo.AdmissionChecklistVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.nursing.domain.objects.AdmissionChecklist
	 */
	 public static ims.nursing.vo.AdmissionChecklistVo insert(ims.nursing.vo.AdmissionChecklistVo valueObject, ims.nursing.domain.objects.AdmissionChecklist domainObject) 
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
	 * @param domainObject ims.nursing.domain.objects.AdmissionChecklist
	 */
	 public static ims.nursing.vo.AdmissionChecklistVo insert(DomainObjectMap map, ims.nursing.vo.AdmissionChecklistVo valueObject, ims.nursing.domain.objects.AdmissionChecklist domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_AdmissionChecklist(domainObject.getId());
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
			
		// ChecklistItem
		ims.domain.lookups.LookupInstance instance1 = domainObject.getChecklistItem();
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

			ims.nursing.vo.lookups.AdmissionQuestion voLookup1 = new ims.nursing.vo.lookups.AdmissionQuestion(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.nursing.vo.lookups.AdmissionQuestion parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.nursing.vo.lookups.AdmissionQuestion(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setChecklistItem(voLookup1);
		}
				// CheckedDateTime
		java.util.Date CheckedDateTime = domainObject.getCheckedDateTime();
		if ( null != CheckedDateTime ) 
		{
			valueObject.setCheckedDateTime(new ims.framework.utils.DateTime(CheckedDateTime) );
		}
		// CheckedHCP
		valueObject.setCheckedHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getCheckedHCP()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.nursing.domain.objects.AdmissionChecklist extractAdmissionChecklist(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.AdmissionChecklistVo valueObject) 
	{
		return 	extractAdmissionChecklist(domainFactory, valueObject, new HashMap());
	}

	public static ims.nursing.domain.objects.AdmissionChecklist extractAdmissionChecklist(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.AdmissionChecklistVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_AdmissionChecklist();
		ims.nursing.domain.objects.AdmissionChecklist domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.nursing.domain.objects.AdmissionChecklist)domMap.get(valueObject);
			}
			// ims.nursing.vo.AdmissionChecklistVo ID_AdmissionChecklist field is unknown
			domainObject = new ims.nursing.domain.objects.AdmissionChecklist();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_AdmissionChecklist());
			if (domMap.get(key) != null)
			{
				return (ims.nursing.domain.objects.AdmissionChecklist)domMap.get(key);
			}
			domainObject = (ims.nursing.domain.objects.AdmissionChecklist) domainFactory.getDomainObject(ims.nursing.domain.objects.AdmissionChecklist.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_AdmissionChecklist());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getChecklistItem() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getChecklistItem().getID());
		}
		domainObject.setChecklistItem(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getCheckedDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setCheckedDateTime(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value3 = null;
		if ( null != valueObject.getCheckedHCP() ) 
		{
			if (valueObject.getCheckedHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getCheckedHCP()) != null)
				{
					value3 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getCheckedHCP());
				}
			}
			else
			{
				value3 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getCheckedHCP().getBoId());
			}
		}
		domainObject.setCheckedHCP(value3);

		return domainObject;
	}

}
