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
 * @author Peter Martin
 */
public class PendingTransfersVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PendingTransfersVo copy(ims.core.vo.PendingTransfersVo valueObjectDest, ims.core.vo.PendingTransfersVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PendingTransfers(valueObjectSrc.getID_PendingTransfers());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// InpatientEpisode
		valueObjectDest.setInpatientEpisode(valueObjectSrc.getInpatientEpisode());
		// WardType
		valueObjectDest.setWardType(valueObjectSrc.getWardType());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
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
 	 * If more than one call to an Assembler is made then #createPendingTransfersVoCollectionFromPendingTransfers(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.PendingTransfers objects.
	 */
	public static ims.core.vo.PendingTransfersVoCollection createPendingTransfersVoCollectionFromPendingTransfers(java.util.Set domainObjectSet)	
	{
		return createPendingTransfersVoCollectionFromPendingTransfers(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.PendingTransfers objects.
	 */
	public static ims.core.vo.PendingTransfersVoCollection createPendingTransfersVoCollectionFromPendingTransfers(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PendingTransfersVoCollection voList = new ims.core.vo.PendingTransfersVoCollection();
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
			ims.core.vo.PendingTransfersVo vo = create(map, domainObject);
			
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
	public static ims.core.vo.PendingTransfersVoCollection createPendingTransfersVoCollectionFromPendingTransfers(java.util.List domainObjectList) 
	{
		return createPendingTransfersVoCollectionFromPendingTransfers(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.PendingTransfers objects.
	 */
	public static ims.core.vo.PendingTransfersVoCollection createPendingTransfersVoCollectionFromPendingTransfers(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PendingTransfersVoCollection voList = new ims.core.vo.PendingTransfersVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.PendingTransfers domainObject = (ims.core.admin.pas.domain.objects.PendingTransfers) domainObjectList.get(i);
			ims.core.vo.PendingTransfersVo vo = create(map, domainObject);

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
	 public static java.util.Set extractPendingTransfersSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PendingTransfersVoCollection voCollection) 
	 {
	 	return extractPendingTransfersSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPendingTransfersSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PendingTransfersVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PendingTransfersVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.PendingTransfers domainObject = PendingTransfersVoAssembler.extractPendingTransfers(domainFactory, vo, domMap);

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
	 public static java.util.List extractPendingTransfersList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PendingTransfersVoCollection voCollection) 
	 {
	 	return extractPendingTransfersList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPendingTransfersList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PendingTransfersVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PendingTransfersVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.PendingTransfers domainObject = PendingTransfersVoAssembler.extractPendingTransfers(domainFactory, vo, domMap);

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
	 public static ims.core.vo.PendingTransfersVo create(ims.core.admin.pas.domain.objects.PendingTransfers domainObject) 
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
	  public static ims.core.vo.PendingTransfersVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.PendingTransfers domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PendingTransfersVo valueObject = (ims.core.vo.PendingTransfersVo) map.getValueObject(domainObject, ims.core.vo.PendingTransfersVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PendingTransfersVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.core.vo.PendingTransfersVo insert(ims.core.vo.PendingTransfersVo valueObject, ims.core.admin.pas.domain.objects.PendingTransfers domainObject) 
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
	 public static ims.core.vo.PendingTransfersVo insert(DomainObjectMap map, ims.core.vo.PendingTransfersVo valueObject, ims.core.admin.pas.domain.objects.PendingTransfers domainObject) 
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
			
		// InpatientEpisode
		valueObject.setInpatientEpisode(ims.core.vo.domain.InpatientEpisodeForTransfersVoAssembler.create(map, domainObject.getInpatientEpisode()) );
		// WardType
		ims.domain.lookups.LookupInstance instance2 = domainObject.getWardType();
		if ( null != instance2 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance2.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance2.getImage().getImageId(), instance2.getImage().getImagePath());
			}
			color = instance2.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.WardType voLookup2 = new ims.core.vo.lookups.WardType(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.WardType parentVoLookup2 = voLookup2;
			ims.domain.lookups.LookupInstance parent2 = instance2.getParent();
			while (parent2 != null)
			{
				if (parent2.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent2.getImage().getImageId(), parent2.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent2.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup2.setParent(new ims.core.vo.lookups.WardType(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setWardType(voLookup2);
		}
				// CurrentStatus
		ims.domain.lookups.LookupInstance instance3 = domainObject.getCurrentStatus();
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

			ims.core.vo.lookups.TransferStatus voLookup3 = new ims.core.vo.lookups.TransferStatus(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.TransferStatus parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.TransferStatus(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setCurrentStatus(voLookup3);
		}
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
		ims.domain.lookups.LookupInstance instance8 = domainObject.getSpecialty();
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

			ims.core.vo.lookups.Specialty voLookup8 = new ims.core.vo.lookups.Specialty(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.Specialty(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setSpecialty(voLookup8);
		}
				// TransferReason
		ims.domain.lookups.LookupInstance instance9 = domainObject.getTransferReason();
		if ( null != instance9 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance9.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance9.getImage().getImageId(), instance9.getImage().getImagePath());
			}
			color = instance9.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.TransferReason voLookup9 = new ims.core.vo.lookups.TransferReason(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.TransferReason parentVoLookup9 = voLookup9;
			ims.domain.lookups.LookupInstance parent9 = instance9.getParent();
			while (parent9 != null)
			{
				if (parent9.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent9.getImage().getImageId(), parent9.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent9.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup9.setParent(new ims.core.vo.lookups.TransferReason(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setTransferReason(voLookup9);
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
	public static ims.core.admin.pas.domain.objects.PendingTransfers extractPendingTransfers(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PendingTransfersVo valueObject) 
	{
		return 	extractPendingTransfers(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.PendingTransfers extractPendingTransfers(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PendingTransfersVo valueObject, HashMap domMap) 
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
			// ims.core.vo.PendingTransfersVo ID_PendingTransfers field is unknown
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

		domainObject.setInpatientEpisode(ims.core.vo.domain.InpatientEpisodeForTransfersVoAssembler.extractInpatientEpisode(domainFactory, valueObject.getInpatientEpisode(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getWardType() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getWardType().getID());
		}
		domainObject.setWardType(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getCurrentStatus() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getCurrentStatus().getID());
		}
		domainObject.setCurrentStatus(value3);
		ims.framework.utils.DateTime dateTime4 = valueObject.getTransferRequestDateTime();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setTransferRequestDateTime(value4);
		ims.framework.utils.DateTime dateTime5 = valueObject.getBedAvailableDateTime();
		java.util.Date value5 = null;
		if ( dateTime5 != null ) 
		{
			value5 = dateTime5.getJavaDate();
		}
		domainObject.setBedAvailableDateTime(value5);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value6 = null;
		if ( null != valueObject.getDestinationWard() ) 
		{
			if (valueObject.getDestinationWard().getBoId() == null)
			{
				if (domMap.get(valueObject.getDestinationWard()) != null)
				{
					value6 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getDestinationWard());
				}
			}
			else
			{
				value6 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getDestinationWard().getBoId());
			}
		}
		domainObject.setDestinationWard(value6);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Medic value7 = null;
		if ( null != valueObject.getConsultant() ) 
		{
			if (valueObject.getConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getConsultant()) != null)
				{
					value7 = (ims.core.resource.people.domain.objects.Medic)domMap.get(valueObject.getConsultant());
				}
			}
			else
			{
				value7 = (ims.core.resource.people.domain.objects.Medic)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Medic.class, valueObject.getConsultant().getBoId());
			}
		}
		domainObject.setConsultant(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getTransferReason() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getTransferReason().getID());
		}
		domainObject.setTransferReason(value9);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTransferComment() != null && valueObject.getTransferComment().equals(""))
		{
			valueObject.setTransferComment(null);
		}
		domainObject.setTransferComment(valueObject.getTransferComment());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Service value11 = null;
		if ( null != valueObject.getService() ) 
		{
			if (valueObject.getService().getBoId() == null)
			{
				if (domMap.get(valueObject.getService()) != null)
				{
					value11 = (ims.core.clinical.domain.objects.Service)domMap.get(valueObject.getService());
				}
			}
			else
			{
				value11 = (ims.core.clinical.domain.objects.Service)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Service.class, valueObject.getService().getBoId());
			}
		}
		domainObject.setService(value11);

		return domainObject;
	}

}
