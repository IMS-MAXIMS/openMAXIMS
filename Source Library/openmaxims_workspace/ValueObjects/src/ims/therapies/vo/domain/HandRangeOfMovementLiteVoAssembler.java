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
 * @author George Cristian Josan
 */
public class HandRangeOfMovementLiteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.therapies.vo.HandRangeOfMovementLiteVo copy(ims.therapies.vo.HandRangeOfMovementLiteVo valueObjectDest, ims.therapies.vo.HandRangeOfMovementLiteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_HandRangeOfMovement(valueObjectSrc.getID_HandRangeOfMovement());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AuthoringDateTime
		valueObjectDest.setAuthoringDateTime(valueObjectSrc.getAuthoringDateTime());
		// AuthoringCP
		valueObjectDest.setAuthoringCP(valueObjectSrc.getAuthoringCP());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// DominantHand
		valueObjectDest.setDominantHand(valueObjectSrc.getDominantHand());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createHandRangeOfMovementLiteVoCollectionFromHandRangeOfMovement(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.therapies.hand.domain.objects.HandRangeOfMovement objects.
	 */
	public static ims.therapies.vo.HandRangeOfMovementLiteVoCollection createHandRangeOfMovementLiteVoCollectionFromHandRangeOfMovement(java.util.Set domainObjectSet)	
	{
		return createHandRangeOfMovementLiteVoCollectionFromHandRangeOfMovement(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.therapies.hand.domain.objects.HandRangeOfMovement objects.
	 */
	public static ims.therapies.vo.HandRangeOfMovementLiteVoCollection createHandRangeOfMovementLiteVoCollectionFromHandRangeOfMovement(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.therapies.vo.HandRangeOfMovementLiteVoCollection voList = new ims.therapies.vo.HandRangeOfMovementLiteVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.therapies.hand.domain.objects.HandRangeOfMovement domainObject = (ims.therapies.hand.domain.objects.HandRangeOfMovement) iterator.next();
			ims.therapies.vo.HandRangeOfMovementLiteVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.therapies.hand.domain.objects.HandRangeOfMovement objects.
	 */
	public static ims.therapies.vo.HandRangeOfMovementLiteVoCollection createHandRangeOfMovementLiteVoCollectionFromHandRangeOfMovement(java.util.List domainObjectList) 
	{
		return createHandRangeOfMovementLiteVoCollectionFromHandRangeOfMovement(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.therapies.hand.domain.objects.HandRangeOfMovement objects.
	 */
	public static ims.therapies.vo.HandRangeOfMovementLiteVoCollection createHandRangeOfMovementLiteVoCollectionFromHandRangeOfMovement(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.therapies.vo.HandRangeOfMovementLiteVoCollection voList = new ims.therapies.vo.HandRangeOfMovementLiteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.therapies.hand.domain.objects.HandRangeOfMovement domainObject = (ims.therapies.hand.domain.objects.HandRangeOfMovement) domainObjectList.get(i);
			ims.therapies.vo.HandRangeOfMovementLiteVo vo = create(map, domainObject);

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
	 * Create the ims.therapies.hand.domain.objects.HandRangeOfMovement set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractHandRangeOfMovementSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.HandRangeOfMovementLiteVoCollection voCollection) 
	 {
	 	return extractHandRangeOfMovementSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractHandRangeOfMovementSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.HandRangeOfMovementLiteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.HandRangeOfMovementLiteVo vo = voCollection.get(i);
			ims.therapies.hand.domain.objects.HandRangeOfMovement domainObject = HandRangeOfMovementLiteVoAssembler.extractHandRangeOfMovement(domainFactory, vo, domMap);

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
	 * Create the ims.therapies.hand.domain.objects.HandRangeOfMovement list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractHandRangeOfMovementList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.HandRangeOfMovementLiteVoCollection voCollection) 
	 {
	 	return extractHandRangeOfMovementList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractHandRangeOfMovementList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.HandRangeOfMovementLiteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.HandRangeOfMovementLiteVo vo = voCollection.get(i);
			ims.therapies.hand.domain.objects.HandRangeOfMovement domainObject = HandRangeOfMovementLiteVoAssembler.extractHandRangeOfMovement(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.therapies.hand.domain.objects.HandRangeOfMovement object.
	 * @param domainObject ims.therapies.hand.domain.objects.HandRangeOfMovement
	 */
	 public static ims.therapies.vo.HandRangeOfMovementLiteVo create(ims.therapies.hand.domain.objects.HandRangeOfMovement domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.therapies.hand.domain.objects.HandRangeOfMovement object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.therapies.vo.HandRangeOfMovementLiteVo create(DomainObjectMap map, ims.therapies.hand.domain.objects.HandRangeOfMovement domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.therapies.vo.HandRangeOfMovementLiteVo valueObject = (ims.therapies.vo.HandRangeOfMovementLiteVo) map.getValueObject(domainObject, ims.therapies.vo.HandRangeOfMovementLiteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.therapies.vo.HandRangeOfMovementLiteVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.therapies.hand.domain.objects.HandRangeOfMovement
	 */
	 public static ims.therapies.vo.HandRangeOfMovementLiteVo insert(ims.therapies.vo.HandRangeOfMovementLiteVo valueObject, ims.therapies.hand.domain.objects.HandRangeOfMovement domainObject) 
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
	 * @param domainObject ims.therapies.hand.domain.objects.HandRangeOfMovement
	 */
	 public static ims.therapies.vo.HandRangeOfMovementLiteVo insert(DomainObjectMap map, ims.therapies.vo.HandRangeOfMovementLiteVo valueObject, ims.therapies.hand.domain.objects.HandRangeOfMovement domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_HandRangeOfMovement(domainObject.getId());
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
			
		// AuthoringDateTime
		java.util.Date AuthoringDateTime = domainObject.getAuthoringDateTime();
		if ( null != AuthoringDateTime ) 
		{
			valueObject.setAuthoringDateTime(new ims.framework.utils.DateTime(AuthoringDateTime) );
		}
		// AuthoringCP
		valueObject.setAuthoringCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getAuthoringCP()) );
		// ClinicalContact
		if (domainObject.getClinicalContact() != null)
		{
			if(domainObject.getClinicalContact() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getClinicalContact();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(id, -1));				
			}
			else
			{
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(domainObject.getClinicalContact().getId(), domainObject.getClinicalContact().getVersion()));
			}
		}
		// DominantHand
		ims.domain.lookups.LookupInstance instance4 = domainObject.getDominantHand();
		if ( null != instance4 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance4.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance4.getImage().getImageId(), instance4.getImage().getImagePath());
			}
			color = instance4.getColor();
			if (color != null) 
				color.getValue();

			ims.therapies.vo.lookups.DominantHand voLookup4 = new ims.therapies.vo.lookups.DominantHand(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.therapies.vo.lookups.DominantHand parentVoLookup4 = voLookup4;
			ims.domain.lookups.LookupInstance parent4 = instance4.getParent();
			while (parent4 != null)
			{
				if (parent4.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent4.getImage().getImageId(), parent4.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent4.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup4.setParent(new ims.therapies.vo.lookups.DominantHand(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setDominantHand(voLookup4);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.therapies.hand.domain.objects.HandRangeOfMovement extractHandRangeOfMovement(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.HandRangeOfMovementLiteVo valueObject) 
	{
		return 	extractHandRangeOfMovement(domainFactory, valueObject, new HashMap());
	}

	public static ims.therapies.hand.domain.objects.HandRangeOfMovement extractHandRangeOfMovement(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.HandRangeOfMovementLiteVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_HandRangeOfMovement();
		ims.therapies.hand.domain.objects.HandRangeOfMovement domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.therapies.hand.domain.objects.HandRangeOfMovement)domMap.get(valueObject);
			}
			// ims.therapies.vo.HandRangeOfMovementLiteVo ID_HandRangeOfMovement field is unknown
			domainObject = new ims.therapies.hand.domain.objects.HandRangeOfMovement();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_HandRangeOfMovement());
			if (domMap.get(key) != null)
			{
				return (ims.therapies.hand.domain.objects.HandRangeOfMovement)domMap.get(key);
			}
			domainObject = (ims.therapies.hand.domain.objects.HandRangeOfMovement) domainFactory.getDomainObject(ims.therapies.hand.domain.objects.HandRangeOfMovement.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_HandRangeOfMovement());

		ims.framework.utils.DateTime dateTime1 = valueObject.getAuthoringDateTime();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setAuthoringDateTime(value1);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value2 = null;
		if ( null != valueObject.getAuthoringCP() ) 
		{
			if (valueObject.getAuthoringCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getAuthoringCP()) != null)
				{
					value2 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getAuthoringCP());
				}
			}
			else
			{
				value2 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getAuthoringCP().getBoId());
			}
		}
		domainObject.setAuthoringCP(value2);
		ims.core.admin.domain.objects.ClinicalContact value3 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value3 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getClinicalContact();	
			}
			else
			{
				value3 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getDominantHand() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getDominantHand().getID());
		}
		domainObject.setDominantHand(value4);

		return domainObject;
	}

}
