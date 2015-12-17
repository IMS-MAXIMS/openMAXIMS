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
package ims.generalmedical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Kevin O'Carroll
 */
public class InjuryDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.generalmedical.vo.InjuryDetailsVo copy(ims.generalmedical.vo.InjuryDetailsVo valueObjectDest, ims.generalmedical.vo.InjuryDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_InjuryDetails(valueObjectSrc.getID_InjuryDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// injuryDate
		valueObjectDest.setInjuryDate(valueObjectSrc.getInjuryDate());
		// injuryTime
		valueObjectDest.setInjuryTime(valueObjectSrc.getInjuryTime());
		// referralDate
		valueObjectDest.setReferralDate(valueObjectSrc.getReferralDate());
		// transferDate
		valueObjectDest.setTransferDate(valueObjectSrc.getTransferDate());
		// sufferedLOC
		valueObjectDest.setSufferedLOC(valueObjectSrc.getSufferedLOC());
		// durLOC
		valueObjectDest.setDurLOC(valueObjectSrc.getDurLOC());
		// durLOCUnit
		valueObjectDest.setDurLOCUnit(valueObjectSrc.getDurLOCUnit());
		// requiresVentillation
		valueObjectDest.setRequiresVentillation(valueObjectSrc.getRequiresVentillation());
		// descriptionOfInjury
		valueObjectDest.setDescriptionOfInjury(valueObjectSrc.getDescriptionOfInjury());
		// presentingComplaints
		valueObjectDest.setPresentingComplaints(valueObjectSrc.getPresentingComplaints());
		// associatedFactor
		valueObjectDest.setAssociatedFactor(valueObjectSrc.getAssociatedFactor());
		// modeOfInjury
		valueObjectDest.setModeOfInjury(valueObjectSrc.getModeOfInjury());
		// causeOfInjury
		valueObjectDest.setCauseOfInjury(valueObjectSrc.getCauseOfInjury());
		// mechanismOfInjury
		valueObjectDest.setMechanismOfInjury(valueObjectSrc.getMechanismOfInjury());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createInjuryDetailsVoCollectionFromInjuryDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.medical.domain.objects.InjuryDetails objects.
	 */
	public static ims.generalmedical.vo.InjuryDetailsVoCollection createInjuryDetailsVoCollectionFromInjuryDetails(java.util.Set domainObjectSet)	
	{
		return createInjuryDetailsVoCollectionFromInjuryDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.medical.domain.objects.InjuryDetails objects.
	 */
	public static ims.generalmedical.vo.InjuryDetailsVoCollection createInjuryDetailsVoCollectionFromInjuryDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.generalmedical.vo.InjuryDetailsVoCollection voList = new ims.generalmedical.vo.InjuryDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.medical.domain.objects.InjuryDetails domainObject = (ims.medical.domain.objects.InjuryDetails) iterator.next();
			ims.generalmedical.vo.InjuryDetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.medical.domain.objects.InjuryDetails objects.
	 */
	public static ims.generalmedical.vo.InjuryDetailsVoCollection createInjuryDetailsVoCollectionFromInjuryDetails(java.util.List domainObjectList) 
	{
		return createInjuryDetailsVoCollectionFromInjuryDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.medical.domain.objects.InjuryDetails objects.
	 */
	public static ims.generalmedical.vo.InjuryDetailsVoCollection createInjuryDetailsVoCollectionFromInjuryDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.generalmedical.vo.InjuryDetailsVoCollection voList = new ims.generalmedical.vo.InjuryDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.medical.domain.objects.InjuryDetails domainObject = (ims.medical.domain.objects.InjuryDetails) domainObjectList.get(i);
			ims.generalmedical.vo.InjuryDetailsVo vo = create(map, domainObject);

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
	 * Create the ims.medical.domain.objects.InjuryDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractInjuryDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.InjuryDetailsVoCollection voCollection) 
	 {
	 	return extractInjuryDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractInjuryDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.InjuryDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.generalmedical.vo.InjuryDetailsVo vo = voCollection.get(i);
			ims.medical.domain.objects.InjuryDetails domainObject = InjuryDetailsVoAssembler.extractInjuryDetails(domainFactory, vo, domMap);

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
	 * Create the ims.medical.domain.objects.InjuryDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractInjuryDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.InjuryDetailsVoCollection voCollection) 
	 {
	 	return extractInjuryDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractInjuryDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.InjuryDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.generalmedical.vo.InjuryDetailsVo vo = voCollection.get(i);
			ims.medical.domain.objects.InjuryDetails domainObject = InjuryDetailsVoAssembler.extractInjuryDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.medical.domain.objects.InjuryDetails object.
	 * @param domainObject ims.medical.domain.objects.InjuryDetails
	 */
	 public static ims.generalmedical.vo.InjuryDetailsVo create(ims.medical.domain.objects.InjuryDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.medical.domain.objects.InjuryDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.generalmedical.vo.InjuryDetailsVo create(DomainObjectMap map, ims.medical.domain.objects.InjuryDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.generalmedical.vo.InjuryDetailsVo valueObject = (ims.generalmedical.vo.InjuryDetailsVo) map.getValueObject(domainObject, ims.generalmedical.vo.InjuryDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.generalmedical.vo.InjuryDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.medical.domain.objects.InjuryDetails
	 */
	 public static ims.generalmedical.vo.InjuryDetailsVo insert(ims.generalmedical.vo.InjuryDetailsVo valueObject, ims.medical.domain.objects.InjuryDetails domainObject) 
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
	 * @param domainObject ims.medical.domain.objects.InjuryDetails
	 */
	 public static ims.generalmedical.vo.InjuryDetailsVo insert(DomainObjectMap map, ims.generalmedical.vo.InjuryDetailsVo valueObject, ims.medical.domain.objects.InjuryDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_InjuryDetails(domainObject.getId());
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
			
		// injuryDate
		java.util.Date injuryDate = domainObject.getInjuryDate();
		if ( null != injuryDate ) 
		{
			valueObject.setInjuryDate(new ims.framework.utils.Date(injuryDate) );
		}
		// injuryTime
		String injuryTime = domainObject.getInjuryTime();
		if ( null != injuryTime ) 
		{
			valueObject.setInjuryTime(new ims.framework.utils.Time(injuryTime) );
		}
		// referralDate
		java.util.Date referralDate = domainObject.getReferralDate();
		if ( null != referralDate ) 
		{
			valueObject.setReferralDate(new ims.framework.utils.Date(referralDate) );
		}
		// transferDate
		java.util.Date transferDate = domainObject.getTransferDate();
		if ( null != transferDate ) 
		{
			valueObject.setTransferDate(new ims.framework.utils.Date(transferDate) );
		}
		// sufferedLOC
		valueObject.setSufferedLOC( domainObject.isSufferedLOC() );
		// durLOC
		valueObject.setDurLOC(domainObject.getDurLOC());
		// durLOCUnit
		ims.domain.lookups.LookupInstance instance7 = domainObject.getDurLOCUnit();
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

			ims.spinalinjuries.vo.lookups.DurLOCUnit voLookup7 = new ims.spinalinjuries.vo.lookups.DurLOCUnit(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.DurLOCUnit parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.spinalinjuries.vo.lookups.DurLOCUnit(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setDurLOCUnit(voLookup7);
		}
				// requiresVentillation
		ims.domain.lookups.LookupInstance instance8 = domainObject.getRequiresVentillation();
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

			ims.core.vo.lookups.YesNoUnknown voLookup8 = new ims.core.vo.lookups.YesNoUnknown(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.YesNoUnknown(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setRequiresVentillation(voLookup8);
		}
				// descriptionOfInjury
		valueObject.setDescriptionOfInjury(domainObject.getDescriptionOfInjury());
		// presentingComplaints
		valueObject.setPresentingComplaints(domainObject.getPresentingComplaints());
		// associatedFactor
		valueObject.setAssociatedFactor(ims.generalmedical.vo.domain.AssociatedFactorVoAssembler.createAssociatedFactorVoCollectionFromInjuryAssocFactor(map, domainObject.getAssociatedFactor()) );
		// modeOfInjury
		ims.domain.lookups.LookupInstance instance12 = domainObject.getModeOfInjury();
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

			ims.spinalinjuries.vo.lookups.InjuryClassModeofInjury voLookup12 = new ims.spinalinjuries.vo.lookups.InjuryClassModeofInjury(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.InjuryClassModeofInjury parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.spinalinjuries.vo.lookups.InjuryClassModeofInjury(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setModeOfInjury(voLookup12);
		}
				// causeOfInjury
		ims.domain.lookups.LookupInstance instance13 = domainObject.getCauseOfInjury();
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

			ims.spinalinjuries.vo.lookups.InjuryClassCauseofInjury voLookup13 = new ims.spinalinjuries.vo.lookups.InjuryClassCauseofInjury(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.InjuryClassCauseofInjury parentVoLookup13 = voLookup13;
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
								parentVoLookup13.setParent(new ims.spinalinjuries.vo.lookups.InjuryClassCauseofInjury(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setCauseOfInjury(voLookup13);
		}
				// mechanismOfInjury
		ims.domain.lookups.LookupInstance instance14 = domainObject.getMechanismOfInjury();
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

			ims.spinalinjuries.vo.lookups.InjuryClassModeofInjury voLookup14 = new ims.spinalinjuries.vo.lookups.InjuryClassModeofInjury(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.InjuryClassModeofInjury parentVoLookup14 = voLookup14;
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
								parentVoLookup14.setParent(new ims.spinalinjuries.vo.lookups.InjuryClassModeofInjury(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setMechanismOfInjury(voLookup14);
		}
				// ClinicalContact
		valueObject.setClinicalContact(ims.core.vo.domain.ClinicalContactShortVoAssembler.create(map, domainObject.getClinicalContact()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.medical.domain.objects.InjuryDetails extractInjuryDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.InjuryDetailsVo valueObject) 
	{
		return 	extractInjuryDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.medical.domain.objects.InjuryDetails extractInjuryDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.InjuryDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_InjuryDetails();
		ims.medical.domain.objects.InjuryDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.medical.domain.objects.InjuryDetails)domMap.get(valueObject);
			}
			// ims.generalmedical.vo.InjuryDetailsVo ID_InjuryDetails field is unknown
			domainObject = new ims.medical.domain.objects.InjuryDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_InjuryDetails());
			if (domMap.get(key) != null)
			{
				return (ims.medical.domain.objects.InjuryDetails)domMap.get(key);
			}
			domainObject = (ims.medical.domain.objects.InjuryDetails) domainFactory.getDomainObject(ims.medical.domain.objects.InjuryDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_InjuryDetails());

		java.util.Date value1 = null;
		ims.framework.utils.Date date1 = valueObject.getInjuryDate();		
		if ( date1 != null ) 
		{
			value1 = date1.getDate();
		}
		domainObject.setInjuryDate(value1);
		ims.framework.utils.Time time2 = valueObject.getInjuryTime();
		String value2 = null;
		if ( time2 != null ) 
		{
			value2 = time2.toString();
		}
		domainObject.setInjuryTime(value2);
		java.util.Date value3 = null;
		ims.framework.utils.Date date3 = valueObject.getReferralDate();		
		if ( date3 != null ) 
		{
			value3 = date3.getDate();
		}
		domainObject.setReferralDate(value3);
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getTransferDate();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setTransferDate(value4);
		domainObject.setSufferedLOC(valueObject.getSufferedLOC());
		domainObject.setDurLOC(valueObject.getDurLOC());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getDurLOCUnit() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getDurLOCUnit().getID());
		}
		domainObject.setDurLOCUnit(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getRequiresVentillation() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getRequiresVentillation().getID());
		}
		domainObject.setRequiresVentillation(value8);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDescriptionOfInjury() != null && valueObject.getDescriptionOfInjury().equals(""))
		{
			valueObject.setDescriptionOfInjury(null);
		}
		domainObject.setDescriptionOfInjury(valueObject.getDescriptionOfInjury());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPresentingComplaints() != null && valueObject.getPresentingComplaints().equals(""))
		{
			valueObject.setPresentingComplaints(null);
		}
		domainObject.setPresentingComplaints(valueObject.getPresentingComplaints());
		domainObject.setAssociatedFactor(ims.generalmedical.vo.domain.AssociatedFactorVoAssembler.extractInjuryAssocFactorSet(domainFactory, valueObject.getAssociatedFactor(), domainObject.getAssociatedFactor(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getModeOfInjury() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getModeOfInjury().getID());
		}
		domainObject.setModeOfInjury(value12);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getCauseOfInjury() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getCauseOfInjury().getID());
		}
		domainObject.setCauseOfInjury(value13);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getMechanismOfInjury() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getMechanismOfInjury().getID());
		}
		domainObject.setMechanismOfInjury(value14);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.ClinicalContact value15 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value15 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else
			{
				value15 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value15);

		return domainObject;
	}

}
