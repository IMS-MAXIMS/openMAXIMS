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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class PendingTransfersLiteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PendingTransfersLiteVo copy(ims.core.vo.PendingTransfersLiteVo valueObjectDest, ims.core.vo.PendingTransfersLiteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PendingTransfers(valueObjectSrc.getID_PendingTransfers());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// InpatientEpisode
		valueObjectDest.setInpatientEpisode(valueObjectSrc.getInpatientEpisode());
		// TransferRequestDateTime
		valueObjectDest.setTransferRequestDateTime(valueObjectSrc.getTransferRequestDateTime());
		// DestinationWard
		valueObjectDest.setDestinationWard(valueObjectSrc.getDestinationWard());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// WardType
		valueObjectDest.setWardType(valueObjectSrc.getWardType());
		// Consultant
		valueObjectDest.setConsultant(valueObjectSrc.getConsultant());
		// Specialty
		valueObjectDest.setSpecialty(valueObjectSrc.getSpecialty());
		// PASSpecialty
		valueObjectDest.setPASSpecialty(valueObjectSrc.getPASSpecialty());
		// TransferReason
		valueObjectDest.setTransferReason(valueObjectSrc.getTransferReason());
		// TransferComment
		valueObjectDest.setTransferComment(valueObjectSrc.getTransferComment());
		// PatientStatus
		valueObjectDest.setPatientStatus(valueObjectSrc.getPatientStatus());
		// BedAvailableDateTime
		valueObjectDest.setBedAvailableDateTime(valueObjectSrc.getBedAvailableDateTime());
		// Service
		valueObjectDest.setService(valueObjectSrc.getService());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPendingTransfersLiteVoCollectionFromPendingTransfers(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.PendingTransfers objects.
	 */
	public static ims.core.vo.PendingTransfersLiteVoCollection createPendingTransfersLiteVoCollectionFromPendingTransfers(java.util.Set domainObjectSet)	
	{
		return createPendingTransfersLiteVoCollectionFromPendingTransfers(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.PendingTransfers objects.
	 */
	public static ims.core.vo.PendingTransfersLiteVoCollection createPendingTransfersLiteVoCollectionFromPendingTransfers(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PendingTransfersLiteVoCollection voList = new ims.core.vo.PendingTransfersLiteVoCollection();
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
			ims.core.vo.PendingTransfersLiteVo vo = create(map, domainObject);
			
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
	public static ims.core.vo.PendingTransfersLiteVoCollection createPendingTransfersLiteVoCollectionFromPendingTransfers(java.util.List domainObjectList) 
	{
		return createPendingTransfersLiteVoCollectionFromPendingTransfers(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.PendingTransfers objects.
	 */
	public static ims.core.vo.PendingTransfersLiteVoCollection createPendingTransfersLiteVoCollectionFromPendingTransfers(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PendingTransfersLiteVoCollection voList = new ims.core.vo.PendingTransfersLiteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.PendingTransfers domainObject = (ims.core.admin.pas.domain.objects.PendingTransfers) domainObjectList.get(i);
			ims.core.vo.PendingTransfersLiteVo vo = create(map, domainObject);

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
	 public static java.util.Set extractPendingTransfersSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PendingTransfersLiteVoCollection voCollection) 
	 {
	 	return extractPendingTransfersSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPendingTransfersSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PendingTransfersLiteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PendingTransfersLiteVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.PendingTransfers domainObject = PendingTransfersLiteVoAssembler.extractPendingTransfers(domainFactory, vo, domMap);

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
	 public static java.util.List extractPendingTransfersList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PendingTransfersLiteVoCollection voCollection) 
	 {
	 	return extractPendingTransfersList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPendingTransfersList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PendingTransfersLiteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PendingTransfersLiteVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.PendingTransfers domainObject = PendingTransfersLiteVoAssembler.extractPendingTransfers(domainFactory, vo, domMap);

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
	 public static ims.core.vo.PendingTransfersLiteVo create(ims.core.admin.pas.domain.objects.PendingTransfers domainObject) 
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
	  public static ims.core.vo.PendingTransfersLiteVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.PendingTransfers domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PendingTransfersLiteVo valueObject = (ims.core.vo.PendingTransfersLiteVo) map.getValueObject(domainObject, ims.core.vo.PendingTransfersLiteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PendingTransfersLiteVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.core.vo.PendingTransfersLiteVo insert(ims.core.vo.PendingTransfersLiteVo valueObject, ims.core.admin.pas.domain.objects.PendingTransfers domainObject) 
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
	 public static ims.core.vo.PendingTransfersLiteVo insert(DomainObjectMap map, ims.core.vo.PendingTransfersLiteVo valueObject, ims.core.admin.pas.domain.objects.PendingTransfers domainObject) 
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
		valueObject.setInpatientEpisode(ims.core.vo.domain.InpatientEpisodeLiteVoAssembler.create(map, domainObject.getInpatientEpisode()) );
		// TransferRequestDateTime
		java.util.Date TransferRequestDateTime = domainObject.getTransferRequestDateTime();
		if ( null != TransferRequestDateTime ) 
		{
			valueObject.setTransferRequestDateTime(new ims.framework.utils.DateTime(TransferRequestDateTime) );
		}
		// DestinationWard
		valueObject.setDestinationWard(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getDestinationWard()) );
		// CurrentStatus
		ims.domain.lookups.LookupInstance instance4 = domainObject.getCurrentStatus();
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

			ims.core.vo.lookups.TransferStatus voLookup4 = new ims.core.vo.lookups.TransferStatus(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.TransferStatus parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.TransferStatus(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setCurrentStatus(voLookup4);
		}
				// WardType
		ims.domain.lookups.LookupInstance instance5 = domainObject.getWardType();
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

			ims.core.vo.lookups.WardType voLookup5 = new ims.core.vo.lookups.WardType(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.WardType parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.WardType(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setWardType(voLookup5);
		}
				// Consultant
		valueObject.setConsultant((ims.core.vo.MedicVo)ims.core.vo.domain.MedicVoAssembler.create(map, domainObject.getConsultant()) );
		// Specialty
		ims.domain.lookups.LookupInstance instance7 = domainObject.getSpecialty();
		if ( null != instance7 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance7.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance7.getImage().getImageId(), instance7.getImage().getImagePath());
			}
			color = instance7.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.Specialty voLookup7 = new ims.core.vo.lookups.Specialty(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup7 = voLookup7;
			ims.domain.lookups.LookupInstance parent7 = instance7.getParent();
			while (parent7 != null)
			{
				if (parent7.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent7.getImage().getImageId(), parent7.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent7.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup7.setParent(new ims.core.vo.lookups.Specialty(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setSpecialty(voLookup7);
		}
				// PASSpecialty
		ims.domain.lookups.LookupInstance instance8 = domainObject.getPASSpecialty();
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

			ims.core.vo.lookups.PASSpecialty voLookup8 = new ims.core.vo.lookups.PASSpecialty(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.PASSpecialty parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.PASSpecialty(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setPASSpecialty(voLookup8);
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
		// PatientStatus
		ims.domain.lookups.LookupInstance instance11 = domainObject.getPatientStatus();
		if ( null != instance11 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance11.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance11.getImage().getImageId(), instance11.getImage().getImagePath());
			}
			color = instance11.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PatientStatus voLookup11 = new ims.core.vo.lookups.PatientStatus(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.core.vo.lookups.PatientStatus parentVoLookup11 = voLookup11;
			ims.domain.lookups.LookupInstance parent11 = instance11.getParent();
			while (parent11 != null)
			{
				if (parent11.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent11.getImage().getImageId(), parent11.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent11.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup11.setParent(new ims.core.vo.lookups.PatientStatus(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setPatientStatus(voLookup11);
		}
				// BedAvailableDateTime
		java.util.Date BedAvailableDateTime = domainObject.getBedAvailableDateTime();
		if ( null != BedAvailableDateTime ) 
		{
			valueObject.setBedAvailableDateTime(new ims.framework.utils.DateTime(BedAvailableDateTime) );
		}
		// Service
		valueObject.setService(ims.core.vo.domain.ServiceLiteVoAssembler.create(map, domainObject.getService()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.pas.domain.objects.PendingTransfers extractPendingTransfers(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PendingTransfersLiteVo valueObject) 
	{
		return 	extractPendingTransfers(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.PendingTransfers extractPendingTransfers(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PendingTransfersLiteVo valueObject, HashMap domMap) 
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
			// ims.core.vo.PendingTransfersLiteVo ID_PendingTransfers field is unknown
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

		domainObject.setInpatientEpisode(ims.core.vo.domain.InpatientEpisodeLiteVoAssembler.extractInpatientEpisode(domainFactory, valueObject.getInpatientEpisode(), domMap));
		ims.framework.utils.DateTime dateTime2 = valueObject.getTransferRequestDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setTransferRequestDateTime(value2);
		domainObject.setDestinationWard(ims.core.vo.domain.LocationLiteVoAssembler.extractLocation(domainFactory, valueObject.getDestinationWard(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getCurrentStatus() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getCurrentStatus().getID());
		}
		domainObject.setCurrentStatus(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getWardType() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getWardType().getID());
		}
		domainObject.setWardType(value5);
		domainObject.setConsultant(ims.core.vo.domain.MedicVoAssembler.extractMedic(domainFactory, (ims.core.vo.MedicVo)valueObject.getConsultant(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getPASSpecialty() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getPASSpecialty().getID());
		}
		domainObject.setPASSpecialty(value8);
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
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getPatientStatus() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getPatientStatus().getID());
		}
		domainObject.setPatientStatus(value11);
		ims.framework.utils.DateTime dateTime12 = valueObject.getBedAvailableDateTime();
		java.util.Date value12 = null;
		if ( dateTime12 != null ) 
		{
			value12 = dateTime12.getJavaDate();
		}
		domainObject.setBedAvailableDateTime(value12);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Service value13 = null;
		if ( null != valueObject.getService() ) 
		{
			if (valueObject.getService().getBoId() == null)
			{
				if (domMap.get(valueObject.getService()) != null)
				{
					value13 = (ims.core.clinical.domain.objects.Service)domMap.get(valueObject.getService());
				}
			}
			else
			{
				value13 = (ims.core.clinical.domain.objects.Service)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Service.class, valueObject.getService().getBoId());
			}
		}
		domainObject.setService(value13);

		return domainObject;
	}

}
