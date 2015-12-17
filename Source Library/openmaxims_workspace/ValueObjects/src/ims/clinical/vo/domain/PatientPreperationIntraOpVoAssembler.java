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
 * Generated on 12/10/2015, 13:23
 *
 */
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class PatientPreperationIntraOpVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.PatientPreperationIntraOpVo copy(ims.clinical.vo.PatientPreperationIntraOpVo valueObjectDest, ims.clinical.vo.PatientPreperationIntraOpVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientPreperationIntraOp(valueObjectSrc.getID_PatientPreperationIntraOp());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TheatreAppointment
		valueObjectDest.setTheatreAppointment(valueObjectSrc.getTheatreAppointment());
		// PatientPreparation
		valueObjectDest.setPatientPreparation(valueObjectSrc.getPatientPreparation());
		// OtherDetails
		valueObjectDest.setOtherDetails(valueObjectSrc.getOtherDetails());
		// SkinIntegrityMaintained
		valueObjectDest.setSkinIntegrityMaintained(valueObjectSrc.getSkinIntegrityMaintained());
		// PatientTransferToOperatingTableVia
		valueObjectDest.setPatientTransferToOperatingTableVia(valueObjectSrc.getPatientTransferToOperatingTableVia());
		// PatientTransferFromOperatingTableVia1
		valueObjectDest.setPatientTransferFromOperatingTableVia1(valueObjectSrc.getPatientTransferFromOperatingTableVia1());
		// BodyPosition
		valueObjectDest.setBodyPosition(valueObjectSrc.getBodyPosition());
		// LeftArmPosition
		valueObjectDest.setLeftArmPosition(valueObjectSrc.getLeftArmPosition());
		// RightArmPosition
		valueObjectDest.setRightArmPosition(valueObjectSrc.getRightArmPosition());
		// LeftLegPosition
		valueObjectDest.setLeftLegPosition(valueObjectSrc.getLeftLegPosition());
		// RightLegPosition
		valueObjectDest.setRightLegPosition(valueObjectSrc.getRightLegPosition());
		// WasPatientWarmed
		valueObjectDest.setWasPatientWarmed(valueObjectSrc.getWasPatientWarmed());
		// FluidWarmerUsed
		valueObjectDest.setFluidWarmerUsed(valueObjectSrc.getFluidWarmerUsed());
		// WarmingBlanketUsed
		valueObjectDest.setWarmingBlanketUsed(valueObjectSrc.getWarmingBlanketUsed());
		// PositioningDevices
		valueObjectDest.setPositioningDevices(valueObjectSrc.getPositioningDevices());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientPreperationIntraOpVoCollectionFromPatientPreperationIntraOp(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.PatientPreperationIntraOp objects.
	 */
	public static ims.clinical.vo.PatientPreperationIntraOpVoCollection createPatientPreperationIntraOpVoCollectionFromPatientPreperationIntraOp(java.util.Set domainObjectSet)	
	{
		return createPatientPreperationIntraOpVoCollectionFromPatientPreperationIntraOp(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.PatientPreperationIntraOp objects.
	 */
	public static ims.clinical.vo.PatientPreperationIntraOpVoCollection createPatientPreperationIntraOpVoCollectionFromPatientPreperationIntraOp(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.PatientPreperationIntraOpVoCollection voList = new ims.clinical.vo.PatientPreperationIntraOpVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.PatientPreperationIntraOp domainObject = (ims.clinical.domain.objects.PatientPreperationIntraOp) iterator.next();
			ims.clinical.vo.PatientPreperationIntraOpVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.PatientPreperationIntraOp objects.
	 */
	public static ims.clinical.vo.PatientPreperationIntraOpVoCollection createPatientPreperationIntraOpVoCollectionFromPatientPreperationIntraOp(java.util.List domainObjectList) 
	{
		return createPatientPreperationIntraOpVoCollectionFromPatientPreperationIntraOp(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.PatientPreperationIntraOp objects.
	 */
	public static ims.clinical.vo.PatientPreperationIntraOpVoCollection createPatientPreperationIntraOpVoCollectionFromPatientPreperationIntraOp(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.PatientPreperationIntraOpVoCollection voList = new ims.clinical.vo.PatientPreperationIntraOpVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.PatientPreperationIntraOp domainObject = (ims.clinical.domain.objects.PatientPreperationIntraOp) domainObjectList.get(i);
			ims.clinical.vo.PatientPreperationIntraOpVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.PatientPreperationIntraOp set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientPreperationIntraOpSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientPreperationIntraOpVoCollection voCollection) 
	 {
	 	return extractPatientPreperationIntraOpSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientPreperationIntraOpSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientPreperationIntraOpVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.PatientPreperationIntraOpVo vo = voCollection.get(i);
			ims.clinical.domain.objects.PatientPreperationIntraOp domainObject = PatientPreperationIntraOpVoAssembler.extractPatientPreperationIntraOp(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.PatientPreperationIntraOp list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientPreperationIntraOpList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientPreperationIntraOpVoCollection voCollection) 
	 {
	 	return extractPatientPreperationIntraOpList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientPreperationIntraOpList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientPreperationIntraOpVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.PatientPreperationIntraOpVo vo = voCollection.get(i);
			ims.clinical.domain.objects.PatientPreperationIntraOp domainObject = PatientPreperationIntraOpVoAssembler.extractPatientPreperationIntraOp(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.PatientPreperationIntraOp object.
	 * @param domainObject ims.clinical.domain.objects.PatientPreperationIntraOp
	 */
	 public static ims.clinical.vo.PatientPreperationIntraOpVo create(ims.clinical.domain.objects.PatientPreperationIntraOp domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.PatientPreperationIntraOp object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.PatientPreperationIntraOpVo create(DomainObjectMap map, ims.clinical.domain.objects.PatientPreperationIntraOp domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.PatientPreperationIntraOpVo valueObject = (ims.clinical.vo.PatientPreperationIntraOpVo) map.getValueObject(domainObject, ims.clinical.vo.PatientPreperationIntraOpVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.PatientPreperationIntraOpVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.PatientPreperationIntraOp
	 */
	 public static ims.clinical.vo.PatientPreperationIntraOpVo insert(ims.clinical.vo.PatientPreperationIntraOpVo valueObject, ims.clinical.domain.objects.PatientPreperationIntraOp domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.PatientPreperationIntraOp
	 */
	 public static ims.clinical.vo.PatientPreperationIntraOpVo insert(DomainObjectMap map, ims.clinical.vo.PatientPreperationIntraOpVo valueObject, ims.clinical.domain.objects.PatientPreperationIntraOp domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientPreperationIntraOp(domainObject.getId());
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
			
		// TheatreAppointment
		if (domainObject.getTheatreAppointment() != null)
		{
			if(domainObject.getTheatreAppointment() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getTheatreAppointment();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setTheatreAppointment(new ims.scheduling.vo.Booking_AppointmentRefVo(id, -1));				
			}
			else
			{
				valueObject.setTheatreAppointment(new ims.scheduling.vo.Booking_AppointmentRefVo(domainObject.getTheatreAppointment().getId(), domainObject.getTheatreAppointment().getVersion()));
			}
		}
		// PatientPreparation
		java.util.List listPatientPreparation = domainObject.getPatientPreparation();
		ims.clinical.vo.lookups.PatientPreparationIntraOpCollection PatientPreparation = new ims.clinical.vo.lookups.PatientPreparationIntraOpCollection();
		for(java.util.Iterator iterator = listPatientPreparation.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.clinical.vo.lookups.PatientPreparationIntraOp voInstance = new ims.clinical.vo.lookups.PatientPreparationIntraOp(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.clinical.vo.lookups.PatientPreparationIntraOp parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.clinical.vo.lookups.PatientPreparationIntraOp(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			PatientPreparation.add(voInstance);
		}
		valueObject.setPatientPreparation( PatientPreparation );
		// OtherDetails
		valueObject.setOtherDetails(domainObject.getOtherDetails());
		// SkinIntegrityMaintained
		ims.domain.lookups.LookupInstance instance4 = domainObject.getSkinIntegrityMaintained();
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

			ims.core.vo.lookups.YesNo voLookup4 = new ims.core.vo.lookups.YesNo(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.YesNo(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setSkinIntegrityMaintained(voLookup4);
		}
				// PatientTransferToOperatingTableVia
		ims.domain.lookups.LookupInstance instance5 = domainObject.getPatientTransferToOperatingTableVia();
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

			ims.clinical.vo.lookups.TransferToFromOperatingTableIntraOp voLookup5 = new ims.clinical.vo.lookups.TransferToFromOperatingTableIntraOp(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.clinical.vo.lookups.TransferToFromOperatingTableIntraOp parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.clinical.vo.lookups.TransferToFromOperatingTableIntraOp(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setPatientTransferToOperatingTableVia(voLookup5);
		}
				// PatientTransferFromOperatingTableVia1
		ims.domain.lookups.LookupInstance instance6 = domainObject.getPatientTransferFromOperatingTableVia1();
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

			ims.clinical.vo.lookups.TransferToFromOperatingTableIntraOp voLookup6 = new ims.clinical.vo.lookups.TransferToFromOperatingTableIntraOp(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.clinical.vo.lookups.TransferToFromOperatingTableIntraOp parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.clinical.vo.lookups.TransferToFromOperatingTableIntraOp(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setPatientTransferFromOperatingTableVia1(voLookup6);
		}
				// BodyPosition
		ims.domain.lookups.LookupInstance instance7 = domainObject.getBodyPosition();
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

			ims.clinical.vo.lookups.BodyPositionIntraOp voLookup7 = new ims.clinical.vo.lookups.BodyPositionIntraOp(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.clinical.vo.lookups.BodyPositionIntraOp parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.clinical.vo.lookups.BodyPositionIntraOp(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setBodyPosition(voLookup7);
		}
				// LeftArmPosition
		ims.domain.lookups.LookupInstance instance8 = domainObject.getLeftArmPosition();
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

			ims.clinical.vo.lookups.LeftRightArmPositionIntraOp voLookup8 = new ims.clinical.vo.lookups.LeftRightArmPositionIntraOp(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.clinical.vo.lookups.LeftRightArmPositionIntraOp parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.clinical.vo.lookups.LeftRightArmPositionIntraOp(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setLeftArmPosition(voLookup8);
		}
				// RightArmPosition
		ims.domain.lookups.LookupInstance instance9 = domainObject.getRightArmPosition();
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

			ims.clinical.vo.lookups.LeftRightArmPositionIntraOp voLookup9 = new ims.clinical.vo.lookups.LeftRightArmPositionIntraOp(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.clinical.vo.lookups.LeftRightArmPositionIntraOp parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.clinical.vo.lookups.LeftRightArmPositionIntraOp(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setRightArmPosition(voLookup9);
		}
				// LeftLegPosition
		ims.domain.lookups.LookupInstance instance10 = domainObject.getLeftLegPosition();
		if ( null != instance10 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance10.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance10.getImage().getImageId(), instance10.getImage().getImagePath());
			}
			color = instance10.getColor();
			if (color != null) 
				color.getValue();

			ims.clinical.vo.lookups.LeftRightLegPositionIntraOp voLookup10 = new ims.clinical.vo.lookups.LeftRightLegPositionIntraOp(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.clinical.vo.lookups.LeftRightLegPositionIntraOp parentVoLookup10 = voLookup10;
			ims.domain.lookups.LookupInstance parent10 = instance10.getParent();
			while (parent10 != null)
			{
				if (parent10.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent10.getImage().getImageId(), parent10.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent10.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup10.setParent(new ims.clinical.vo.lookups.LeftRightLegPositionIntraOp(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setLeftLegPosition(voLookup10);
		}
				// RightLegPosition
		ims.domain.lookups.LookupInstance instance11 = domainObject.getRightLegPosition();
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

			ims.clinical.vo.lookups.LeftRightLegPositionIntraOp voLookup11 = new ims.clinical.vo.lookups.LeftRightLegPositionIntraOp(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.clinical.vo.lookups.LeftRightLegPositionIntraOp parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.clinical.vo.lookups.LeftRightLegPositionIntraOp(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setRightLegPosition(voLookup11);
		}
				// WasPatientWarmed
		ims.domain.lookups.LookupInstance instance12 = domainObject.getWasPatientWarmed();
		if ( null != instance12 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance12.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance12.getImage().getImageId(), instance12.getImage().getImagePath());
			}
			color = instance12.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup12 = new ims.core.vo.lookups.YesNo(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup12 = voLookup12;
			ims.domain.lookups.LookupInstance parent12 = instance12.getParent();
			while (parent12 != null)
			{
				if (parent12.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent12.getImage().getImageId(), parent12.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent12.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup12.setParent(new ims.core.vo.lookups.YesNo(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setWasPatientWarmed(voLookup12);
		}
				// FluidWarmerUsed
		ims.domain.lookups.LookupInstance instance13 = domainObject.getFluidWarmerUsed();
		if ( null != instance13 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance13.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance13.getImage().getImageId(), instance13.getImage().getImagePath());
			}
			color = instance13.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup13 = new ims.core.vo.lookups.YesNo(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup13 = voLookup13;
			ims.domain.lookups.LookupInstance parent13 = instance13.getParent();
			while (parent13 != null)
			{
				if (parent13.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent13.getImage().getImageId(), parent13.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent13.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup13.setParent(new ims.core.vo.lookups.YesNo(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setFluidWarmerUsed(voLookup13);
		}
				// WarmingBlanketUsed
		ims.domain.lookups.LookupInstance instance14 = domainObject.getWarmingBlanketUsed();
		if ( null != instance14 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance14.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance14.getImage().getImageId(), instance14.getImage().getImagePath());
			}
			color = instance14.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup14 = new ims.core.vo.lookups.YesNo(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup14 = voLookup14;
			ims.domain.lookups.LookupInstance parent14 = instance14.getParent();
			while (parent14 != null)
			{
				if (parent14.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent14.getImage().getImageId(), parent14.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent14.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup14.setParent(new ims.core.vo.lookups.YesNo(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setWarmingBlanketUsed(voLookup14);
		}
				// PositioningDevices
		java.util.List listPositioningDevices = domainObject.getPositioningDevices();
		ims.clinical.vo.lookups.PositioningDevicesIntraOpCollection PositioningDevices = new ims.clinical.vo.lookups.PositioningDevicesIntraOpCollection();
		for(java.util.Iterator iterator = listPositioningDevices.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.clinical.vo.lookups.PositioningDevicesIntraOp voInstance = new ims.clinical.vo.lookups.PositioningDevicesIntraOp(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.clinical.vo.lookups.PositioningDevicesIntraOp parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.clinical.vo.lookups.PositioningDevicesIntraOp(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			PositioningDevices.add(voInstance);
		}
		valueObject.setPositioningDevices( PositioningDevices );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.PatientPreperationIntraOp extractPatientPreperationIntraOp(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientPreperationIntraOpVo valueObject) 
	{
		return 	extractPatientPreperationIntraOp(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.PatientPreperationIntraOp extractPatientPreperationIntraOp(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientPreperationIntraOpVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientPreperationIntraOp();
		ims.clinical.domain.objects.PatientPreperationIntraOp domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.PatientPreperationIntraOp)domMap.get(valueObject);
			}
			// ims.clinical.vo.PatientPreperationIntraOpVo ID_PatientPreperationIntraOp field is unknown
			domainObject = new ims.clinical.domain.objects.PatientPreperationIntraOp();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientPreperationIntraOp());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.PatientPreperationIntraOp)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.PatientPreperationIntraOp) domainFactory.getDomainObject(ims.clinical.domain.objects.PatientPreperationIntraOp.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientPreperationIntraOp());

		ims.scheduling.domain.objects.Booking_Appointment value1 = null;
		if ( null != valueObject.getTheatreAppointment() ) 
		{
			if (valueObject.getTheatreAppointment().getBoId() == null)
			{
				if (domMap.get(valueObject.getTheatreAppointment()) != null)
				{
					value1 = (ims.scheduling.domain.objects.Booking_Appointment)domMap.get(valueObject.getTheatreAppointment());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getTheatreAppointment();	
			}
			else
			{
				value1 = (ims.scheduling.domain.objects.Booking_Appointment)domainFactory.getDomainObject(ims.scheduling.domain.objects.Booking_Appointment.class, valueObject.getTheatreAppointment().getBoId());
			}
		}
		domainObject.setTheatreAppointment(value1);
		ims.clinical.vo.lookups.PatientPreparationIntraOpCollection collection2 =
	valueObject.getPatientPreparation();
	    java.util.List domainPatientPreparation = domainObject.getPatientPreparation();;			
	    int collection2Size=0;
		if (collection2 == null)
		{
			domainPatientPreparation = new java.util.ArrayList(0);
		}
		else
		{
			collection2Size = collection2.size();
		}
		
		for(int i=0; i<collection2Size; i++) 
		{
			int instanceId = collection2.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainPatientPreparation.indexOf(dom);
			if (domIdx == -1)
			{
				domainPatientPreparation.add(i, dom);
			}
			else if (i != domIdx && i < domainPatientPreparation.size())
			{
				Object tmp = domainPatientPreparation.get(i);
				domainPatientPreparation.set(i, domainPatientPreparation.get(domIdx));
				domainPatientPreparation.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j2 = domainPatientPreparation.size();
		while (j2 > collection2Size)
		{
			domainPatientPreparation.remove(j2-1);
			j2 = domainPatientPreparation.size();
		}

		domainObject.setPatientPreparation(domainPatientPreparation);		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOtherDetails() != null && valueObject.getOtherDetails().equals(""))
		{
			valueObject.setOtherDetails(null);
		}
		domainObject.setOtherDetails(valueObject.getOtherDetails());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getSkinIntegrityMaintained() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getSkinIntegrityMaintained().getID());
		}
		domainObject.setSkinIntegrityMaintained(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getPatientTransferToOperatingTableVia() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getPatientTransferToOperatingTableVia().getID());
		}
		domainObject.setPatientTransferToOperatingTableVia(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getPatientTransferFromOperatingTableVia1() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getPatientTransferFromOperatingTableVia1().getID());
		}
		domainObject.setPatientTransferFromOperatingTableVia1(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getBodyPosition() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getBodyPosition().getID());
		}
		domainObject.setBodyPosition(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getLeftArmPosition() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getLeftArmPosition().getID());
		}
		domainObject.setLeftArmPosition(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getRightArmPosition() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getRightArmPosition().getID());
		}
		domainObject.setRightArmPosition(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getLeftLegPosition() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getLeftLegPosition().getID());
		}
		domainObject.setLeftLegPosition(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getRightLegPosition() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getRightLegPosition().getID());
		}
		domainObject.setRightLegPosition(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getWasPatientWarmed() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getWasPatientWarmed().getID());
		}
		domainObject.setWasPatientWarmed(value12);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getFluidWarmerUsed() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getFluidWarmerUsed().getID());
		}
		domainObject.setFluidWarmerUsed(value13);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getWarmingBlanketUsed() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getWarmingBlanketUsed().getID());
		}
		domainObject.setWarmingBlanketUsed(value14);
		ims.clinical.vo.lookups.PositioningDevicesIntraOpCollection collection15 =
	valueObject.getPositioningDevices();
	    java.util.List domainPositioningDevices = domainObject.getPositioningDevices();;			
	    int collection15Size=0;
		if (collection15 == null)
		{
			domainPositioningDevices = new java.util.ArrayList(0);
		}
		else
		{
			collection15Size = collection15.size();
		}
		
		for(int i=0; i<collection15Size; i++) 
		{
			int instanceId = collection15.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainPositioningDevices.indexOf(dom);
			if (domIdx == -1)
			{
				domainPositioningDevices.add(i, dom);
			}
			else if (i != domIdx && i < domainPositioningDevices.size())
			{
				Object tmp = domainPositioningDevices.get(i);
				domainPositioningDevices.set(i, domainPositioningDevices.get(domIdx));
				domainPositioningDevices.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j15 = domainPositioningDevices.size();
		while (j15 > collection15Size)
		{
			domainPositioningDevices.remove(j15-1);
			j15 = domainPositioningDevices.size();
		}

		domainObject.setPositioningDevices(domainPositioningDevices);		

		return domainObject;
	}

}
