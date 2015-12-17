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
 * Generated on 12/10/2015, 13:24
 *
 */
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Gabriel Maxim
 */
public class PendingTransferForBedReadyDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PendingTransferForBedReadyDetailsVo copy(ims.core.vo.PendingTransferForBedReadyDetailsVo valueObjectDest, ims.core.vo.PendingTransferForBedReadyDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PendingTransfers(valueObjectSrc.getID_PendingTransfers());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TransferRequestDateTime
		valueObjectDest.setTransferRequestDateTime(valueObjectSrc.getTransferRequestDateTime());
		// BedAvailableDateTime
		valueObjectDest.setBedAvailableDateTime(valueObjectSrc.getBedAvailableDateTime());
		// DestinationWard
		valueObjectDest.setDestinationWard(valueObjectSrc.getDestinationWard());
		// Consultant
		valueObjectDest.setConsultant(valueObjectSrc.getConsultant());
		// Specialty
		valueObjectDest.setSpecialty(valueObjectSrc.getSpecialty());
		// TransferReason
		valueObjectDest.setTransferReason(valueObjectSrc.getTransferReason());
		// TransferComment
		valueObjectDest.setTransferComment(valueObjectSrc.getTransferComment());
		// Service
		valueObjectDest.setService(valueObjectSrc.getService());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPendingTransferForBedReadyDetailsVoCollectionFromPendingTransfers(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.PendingTransfers objects.
	 */
	public static ims.core.vo.PendingTransferForBedReadyDetailsVoCollection createPendingTransferForBedReadyDetailsVoCollectionFromPendingTransfers(java.util.Set domainObjectSet)	
	{
		return createPendingTransferForBedReadyDetailsVoCollectionFromPendingTransfers(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.PendingTransfers objects.
	 */
	public static ims.core.vo.PendingTransferForBedReadyDetailsVoCollection createPendingTransferForBedReadyDetailsVoCollectionFromPendingTransfers(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PendingTransferForBedReadyDetailsVoCollection voList = new ims.core.vo.PendingTransferForBedReadyDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.pas.domain.objects.PendingTransfers domainObject = (ims.core.admin.pas.domain.objects.PendingTransfers) iterator.next();
			ims.core.vo.PendingTransferForBedReadyDetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.PendingTransfers objects.
	 */
	public static ims.core.vo.PendingTransferForBedReadyDetailsVoCollection createPendingTransferForBedReadyDetailsVoCollectionFromPendingTransfers(java.util.List domainObjectList) 
	{
		return createPendingTransferForBedReadyDetailsVoCollectionFromPendingTransfers(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.PendingTransfers objects.
	 */
	public static ims.core.vo.PendingTransferForBedReadyDetailsVoCollection createPendingTransferForBedReadyDetailsVoCollectionFromPendingTransfers(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PendingTransferForBedReadyDetailsVoCollection voList = new ims.core.vo.PendingTransferForBedReadyDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.PendingTransfers domainObject = (ims.core.admin.pas.domain.objects.PendingTransfers) domainObjectList.get(i);
			ims.core.vo.PendingTransferForBedReadyDetailsVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.pas.domain.objects.PendingTransfers set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPendingTransfersSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PendingTransferForBedReadyDetailsVoCollection voCollection) 
	 {
	 	return extractPendingTransfersSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPendingTransfersSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PendingTransferForBedReadyDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PendingTransferForBedReadyDetailsVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.PendingTransfers domainObject = PendingTransferForBedReadyDetailsVoAssembler.extractPendingTransfers(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.pas.domain.objects.PendingTransfers list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPendingTransfersList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PendingTransferForBedReadyDetailsVoCollection voCollection) 
	 {
	 	return extractPendingTransfersList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPendingTransfersList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PendingTransferForBedReadyDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PendingTransferForBedReadyDetailsVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.PendingTransfers domainObject = PendingTransferForBedReadyDetailsVoAssembler.extractPendingTransfers(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.pas.domain.objects.PendingTransfers object.
	 * @param domainObject ims.core.admin.pas.domain.objects.PendingTransfers
	 */
	 public static ims.core.vo.PendingTransferForBedReadyDetailsVo create(ims.core.admin.pas.domain.objects.PendingTransfers domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.pas.domain.objects.PendingTransfers object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PendingTransferForBedReadyDetailsVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.PendingTransfers domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PendingTransferForBedReadyDetailsVo valueObject = (ims.core.vo.PendingTransferForBedReadyDetailsVo) map.getValueObject(domainObject, ims.core.vo.PendingTransferForBedReadyDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PendingTransferForBedReadyDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.pas.domain.objects.PendingTransfers
	 */
	 public static ims.core.vo.PendingTransferForBedReadyDetailsVo insert(ims.core.vo.PendingTransferForBedReadyDetailsVo valueObject, ims.core.admin.pas.domain.objects.PendingTransfers domainObject) 
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
	 * @param domainObject ims.core.admin.pas.domain.objects.PendingTransfers
	 */
	 public static ims.core.vo.PendingTransferForBedReadyDetailsVo insert(DomainObjectMap map, ims.core.vo.PendingTransferForBedReadyDetailsVo valueObject, ims.core.admin.pas.domain.objects.PendingTransfers domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PendingTransfers(domainObject.getId());
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
			
		// TransferRequestDateTime
		java.util.Date TransferRequestDateTime = domainObject.getTransferRequestDateTime();
		if ( null != TransferRequestDateTime ) 
		{
			valueObject.setTransferRequestDateTime(new ims.framework.utils.DateTime(TransferRequestDateTime) );
		}
		// BedAvailableDateTime
		java.util.Date BedAvailableDateTime = domainObject.getBedAvailableDateTime();
		if ( null != BedAvailableDateTime ) 
		{
			valueObject.setBedAvailableDateTime(new ims.framework.utils.DateTime(BedAvailableDateTime) );
		}
		// DestinationWard
		valueObject.setDestinationWard(ims.core.vo.domain.LocationMinVoAssembler.create(map, domainObject.getDestinationWard()) );
		// Consultant
		valueObject.setConsultant(ims.core.vo.domain.MedicLiteVoAssembler.create(map, domainObject.getConsultant()) );
		// Specialty
		ims.domain.lookups.LookupInstance instance5 = domainObject.getSpecialty();
		if ( null != instance5 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance5.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance5.getImage().getImageId(), instance5.getImage().getImagePath());
			}
			color = instance5.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.Specialty voLookup5 = new ims.core.vo.lookups.Specialty(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup5 = voLookup5;
			ims.domain.lookups.LookupInstance parent5 = instance5.getParent();
			while (parent5 != null)
			{
				if (parent5.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent5.getImage().getImageId(), parent5.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent5.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup5.setParent(new ims.core.vo.lookups.Specialty(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setSpecialty(voLookup5);
		}
				// TransferReason
		ims.domain.lookups.LookupInstance instance6 = domainObject.getTransferReason();
		if ( null != instance6 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance6.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance6.getImage().getImageId(), instance6.getImage().getImagePath());
			}
			color = instance6.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.TransferReason voLookup6 = new ims.core.vo.lookups.TransferReason(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.TransferReason parentVoLookup6 = voLookup6;
			ims.domain.lookups.LookupInstance parent6 = instance6.getParent();
			while (parent6 != null)
			{
				if (parent6.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent6.getImage().getImageId(), parent6.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent6.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup6.setParent(new ims.core.vo.lookups.TransferReason(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setTransferReason(voLookup6);
		}
				// TransferComment
		valueObject.setTransferComment(domainObject.getTransferComment());
		// Service
		valueObject.setService(ims.admin.vo.domain.ServiceVoLiteVoAssembler.create(map, domainObject.getService()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.pas.domain.objects.PendingTransfers extractPendingTransfers(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PendingTransferForBedReadyDetailsVo valueObject) 
	{
		return 	extractPendingTransfers(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.PendingTransfers extractPendingTransfers(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PendingTransferForBedReadyDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PendingTransfers();
		ims.core.admin.pas.domain.objects.PendingTransfers domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.pas.domain.objects.PendingTransfers)domMap.get(valueObject);
			}
			// ims.core.vo.PendingTransferForBedReadyDetailsVo ID_PendingTransfers field is unknown
			domainObject = new ims.core.admin.pas.domain.objects.PendingTransfers();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PendingTransfers());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.pas.domain.objects.PendingTransfers)domMap.get(key);
			}
			domainObject = (ims.core.admin.pas.domain.objects.PendingTransfers) domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.PendingTransfers.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PendingTransfers());

		ims.framework.utils.DateTime dateTime1 = valueObject.getTransferRequestDateTime();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setTransferRequestDateTime(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getBedAvailableDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setBedAvailableDateTime(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value3 = null;
		if ( null != valueObject.getDestinationWard() ) 
		{
			if (valueObject.getDestinationWard().getBoId() == null)
			{
				if (domMap.get(valueObject.getDestinationWard()) != null)
				{
					value3 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getDestinationWard());
				}
			}
			else
			{
				value3 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getDestinationWard().getBoId());
			}
		}
		domainObject.setDestinationWard(value3);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Medic value4 = null;
		if ( null != valueObject.getConsultant() ) 
		{
			if (valueObject.getConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getConsultant()) != null)
				{
					value4 = (ims.core.resource.people.domain.objects.Medic)domMap.get(valueObject.getConsultant());
				}
			}
			else
			{
				value4 = (ims.core.resource.people.domain.objects.Medic)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Medic.class, valueObject.getConsultant().getBoId());
			}
		}
		domainObject.setConsultant(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getTransferReason() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getTransferReason().getID());
		}
		domainObject.setTransferReason(value6);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTransferComment() != null && valueObject.getTransferComment().equals(""))
		{
			valueObject.setTransferComment(null);
		}
		domainObject.setTransferComment(valueObject.getTransferComment());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Service value8 = null;
		if ( null != valueObject.getService() ) 
		{
			if (valueObject.getService().getBoId() == null)
			{
				if (domMap.get(valueObject.getService()) != null)
				{
					value8 = (ims.core.clinical.domain.objects.Service)domMap.get(valueObject.getService());
				}
			}
			else
			{
				value8 = (ims.core.clinical.domain.objects.Service)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Service.class, valueObject.getService().getBoId());
			}
		}
		domainObject.setService(value8);

		return domainObject;
	}

}
