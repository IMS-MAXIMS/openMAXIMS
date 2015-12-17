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
 * @author Catalin Tomozei
 */
public class PropertyChecklistVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.nursing.vo.PropertyChecklistVo copy(ims.nursing.vo.PropertyChecklistVo valueObjectDest, ims.nursing.vo.PropertyChecklistVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PropertyChecklist(valueObjectSrc.getID_PropertyChecklist());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// ItemsRetained
		valueObjectDest.setItemsRetained(valueObjectSrc.getItemsRetained());
		// DestinationWard
		valueObjectDest.setDestinationWard(valueObjectSrc.getDestinationWard());
		// ConfirmingHCP
		valueObjectDest.setConfirmingHCP(valueObjectSrc.getConfirmingHCP());
		// ConfirmingDateTime
		valueObjectDest.setConfirmingDateTime(valueObjectSrc.getConfirmingDateTime());
		// Valuables
		valueObjectDest.setValuables(valueObjectSrc.getValuables());
		// OtherValuables
		valueObjectDest.setOtherValuables(valueObjectSrc.getOtherValuables());
		// MovementType
		valueObjectDest.setMovementType(valueObjectSrc.getMovementType());
		// AuthoringDateTime
		valueObjectDest.setAuthoringDateTime(valueObjectSrc.getAuthoringDateTime());
		// AuthoringHCP
		valueObjectDest.setAuthoringHCP(valueObjectSrc.getAuthoringHCP());
		// Ward
		valueObjectDest.setWard(valueObjectSrc.getWard());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPropertyChecklistVoCollectionFromPropertyChecklist(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.nursing.domain.objects.PropertyChecklist objects.
	 */
	public static ims.nursing.vo.PropertyChecklistVoCollection createPropertyChecklistVoCollectionFromPropertyChecklist(java.util.Set domainObjectSet)	
	{
		return createPropertyChecklistVoCollectionFromPropertyChecklist(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.nursing.domain.objects.PropertyChecklist objects.
	 */
	public static ims.nursing.vo.PropertyChecklistVoCollection createPropertyChecklistVoCollectionFromPropertyChecklist(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.nursing.vo.PropertyChecklistVoCollection voList = new ims.nursing.vo.PropertyChecklistVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.nursing.domain.objects.PropertyChecklist domainObject = (ims.nursing.domain.objects.PropertyChecklist) iterator.next();
			ims.nursing.vo.PropertyChecklistVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.nursing.domain.objects.PropertyChecklist objects.
	 */
	public static ims.nursing.vo.PropertyChecklistVoCollection createPropertyChecklistVoCollectionFromPropertyChecklist(java.util.List domainObjectList) 
	{
		return createPropertyChecklistVoCollectionFromPropertyChecklist(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.nursing.domain.objects.PropertyChecklist objects.
	 */
	public static ims.nursing.vo.PropertyChecklistVoCollection createPropertyChecklistVoCollectionFromPropertyChecklist(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.nursing.vo.PropertyChecklistVoCollection voList = new ims.nursing.vo.PropertyChecklistVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.nursing.domain.objects.PropertyChecklist domainObject = (ims.nursing.domain.objects.PropertyChecklist) domainObjectList.get(i);
			ims.nursing.vo.PropertyChecklistVo vo = create(map, domainObject);

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
	 * Create the ims.nursing.domain.objects.PropertyChecklist set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPropertyChecklistSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PropertyChecklistVoCollection voCollection) 
	 {
	 	return extractPropertyChecklistSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPropertyChecklistSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PropertyChecklistVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.PropertyChecklistVo vo = voCollection.get(i);
			ims.nursing.domain.objects.PropertyChecklist domainObject = PropertyChecklistVoAssembler.extractPropertyChecklist(domainFactory, vo, domMap);

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
	 * Create the ims.nursing.domain.objects.PropertyChecklist list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPropertyChecklistList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PropertyChecklistVoCollection voCollection) 
	 {
	 	return extractPropertyChecklistList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPropertyChecklistList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PropertyChecklistVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.PropertyChecklistVo vo = voCollection.get(i);
			ims.nursing.domain.objects.PropertyChecklist domainObject = PropertyChecklistVoAssembler.extractPropertyChecklist(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.nursing.domain.objects.PropertyChecklist object.
	 * @param domainObject ims.nursing.domain.objects.PropertyChecklist
	 */
	 public static ims.nursing.vo.PropertyChecklistVo create(ims.nursing.domain.objects.PropertyChecklist domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.nursing.domain.objects.PropertyChecklist object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.nursing.vo.PropertyChecklistVo create(DomainObjectMap map, ims.nursing.domain.objects.PropertyChecklist domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.nursing.vo.PropertyChecklistVo valueObject = (ims.nursing.vo.PropertyChecklistVo) map.getValueObject(domainObject, ims.nursing.vo.PropertyChecklistVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.nursing.vo.PropertyChecklistVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.nursing.domain.objects.PropertyChecklist
	 */
	 public static ims.nursing.vo.PropertyChecklistVo insert(ims.nursing.vo.PropertyChecklistVo valueObject, ims.nursing.domain.objects.PropertyChecklist domainObject) 
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
	 * @param domainObject ims.nursing.domain.objects.PropertyChecklist
	 */
	 public static ims.nursing.vo.PropertyChecklistVo insert(DomainObjectMap map, ims.nursing.vo.PropertyChecklistVo valueObject, ims.nursing.domain.objects.PropertyChecklist domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PropertyChecklist(domainObject.getId());
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
		// ItemsRetained
		valueObject.setItemsRetained(ims.nursing.vo.domain.PropertyItemVoAssembler.createPropertyItemVoCollectionFromPropertyItem(map, domainObject.getItemsRetained()) );
		// DestinationWard
		valueObject.setDestinationWard(ims.core.vo.domain.LocShortVoAssembler.create(map, domainObject.getDestinationWard()) );
		// ConfirmingHCP
		valueObject.setConfirmingHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getConfirmingHCP()) );
		// ConfirmingDateTime
		java.util.Date ConfirmingDateTime = domainObject.getConfirmingDateTime();
		if ( null != ConfirmingDateTime ) 
		{
			valueObject.setConfirmingDateTime(new ims.framework.utils.DateTime(ConfirmingDateTime) );
		}
		// Valuables
		valueObject.setValuables(ims.nursing.vo.domain.ValuableVoAssembler.createValuableVoCollectionFromValuable(map, domainObject.getValuables()) );
		// OtherValuables
		valueObject.setOtherValuables(domainObject.getOtherValuables());
		// MovementType
		ims.domain.lookups.LookupInstance instance8 = domainObject.getMovementType();
		if ( null != instance8 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance8.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance8.getImage().getImageId(), instance8.getImage().getImagePath());
			}
			color = instance8.getColor();
			if (color != null) 
				color.getValue();

			ims.nursing.vo.lookups.MovementType voLookup8 = new ims.nursing.vo.lookups.MovementType(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.nursing.vo.lookups.MovementType parentVoLookup8 = voLookup8;
			ims.domain.lookups.LookupInstance parent8 = instance8.getParent();
			while (parent8 != null)
			{
				if (parent8.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent8.getImage().getImageId(), parent8.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent8.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup8.setParent(new ims.nursing.vo.lookups.MovementType(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setMovementType(voLookup8);
		}
				// AuthoringDateTime
		java.util.Date AuthoringDateTime = domainObject.getAuthoringDateTime();
		if ( null != AuthoringDateTime ) 
		{
			valueObject.setAuthoringDateTime(new ims.framework.utils.DateTime(AuthoringDateTime) );
		}
		// AuthoringHCP
		valueObject.setAuthoringHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getAuthoringHCP()) );
		// Ward
		valueObject.setWard(ims.core.vo.domain.LocShortVoAssembler.create(map, domainObject.getWard()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.nursing.domain.objects.PropertyChecklist extractPropertyChecklist(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PropertyChecklistVo valueObject) 
	{
		return 	extractPropertyChecklist(domainFactory, valueObject, new HashMap());
	}

	public static ims.nursing.domain.objects.PropertyChecklist extractPropertyChecklist(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PropertyChecklistVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PropertyChecklist();
		ims.nursing.domain.objects.PropertyChecklist domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.nursing.domain.objects.PropertyChecklist)domMap.get(valueObject);
			}
			// ims.nursing.vo.PropertyChecklistVo ID_PropertyChecklist field is unknown
			domainObject = new ims.nursing.domain.objects.PropertyChecklist();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PropertyChecklist());
			if (domMap.get(key) != null)
			{
				return (ims.nursing.domain.objects.PropertyChecklist)domMap.get(key);
			}
			domainObject = (ims.nursing.domain.objects.PropertyChecklist) domainFactory.getDomainObject(ims.nursing.domain.objects.PropertyChecklist.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PropertyChecklist());

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
		domainObject.setItemsRetained(ims.nursing.vo.domain.PropertyItemVoAssembler.extractPropertyItemList(domainFactory, valueObject.getItemsRetained(), domainObject.getItemsRetained(), domMap));		
		domainObject.setDestinationWard(ims.core.vo.domain.LocShortVoAssembler.extractLocation(domainFactory, valueObject.getDestinationWard(), domMap));
		domainObject.setConfirmingHCP(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getConfirmingHCP(), domMap));
		ims.framework.utils.DateTime dateTime5 = valueObject.getConfirmingDateTime();
		java.util.Date value5 = null;
		if ( dateTime5 != null ) 
		{
			value5 = dateTime5.getJavaDate();
		}
		domainObject.setConfirmingDateTime(value5);
		domainObject.setValuables(ims.nursing.vo.domain.ValuableVoAssembler.extractValuableList(domainFactory, valueObject.getValuables(), domainObject.getValuables(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOtherValuables() != null && valueObject.getOtherValuables().equals(""))
		{
			valueObject.setOtherValuables(null);
		}
		domainObject.setOtherValuables(valueObject.getOtherValuables());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getMovementType() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getMovementType().getID());
		}
		domainObject.setMovementType(value8);
		ims.framework.utils.DateTime dateTime9 = valueObject.getAuthoringDateTime();
		java.util.Date value9 = null;
		if ( dateTime9 != null ) 
		{
			value9 = dateTime9.getJavaDate();
		}
		domainObject.setAuthoringDateTime(value9);
		domainObject.setAuthoringHCP(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getAuthoringHCP(), domMap));
		domainObject.setWard(ims.core.vo.domain.LocShortVoAssembler.extractLocation(domainFactory, valueObject.getWard(), domMap));

		return domainObject;
	}

}
