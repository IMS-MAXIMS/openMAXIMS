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
package ims.naes.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Aidan Mc Donnell
 */
public class NAESReferralVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.naes.vo.NAESReferralVo copy(ims.naes.vo.NAESReferralVo valueObjectDest, ims.naes.vo.NAESReferralVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_NAESReferral(valueObjectSrc.getID_NAESReferral());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// DateReferralReceived
		valueObjectDest.setDateReferralReceived(valueObjectSrc.getDateReferralReceived());
		// DateOfSurgery
		valueObjectDest.setDateOfSurgery(valueObjectSrc.getDateOfSurgery());
		// ReferringHospital
		valueObjectDest.setReferringHospital(valueObjectSrc.getReferringHospital());
		// ReferringDoctor
		valueObjectDest.setReferringDoctor(valueObjectSrc.getReferringDoctor());
		// ReferralReason
		valueObjectDest.setReferralReason(valueObjectSrc.getReferralReason());
		// SecondarySurgery
		valueObjectDest.setSecondarySurgery(valueObjectSrc.getSecondarySurgery());
		// UnderlyingReason
		valueObjectDest.setUnderlyingReason(valueObjectSrc.getUnderlyingReason());
		// AffectedEye
		valueObjectDest.setAffectedEye(valueObjectSrc.getAffectedEye());
		// Implant
		valueObjectDest.setImplant(valueObjectSrc.getImplant());
		// ImplantType
		valueObjectDest.setImplantType(valueObjectSrc.getImplantType());
		// InterpreterRequired
		valueObjectDest.setInterpreterRequired(valueObjectSrc.getInterpreterRequired());
		// Language
		valueObjectDest.setLanguage(valueObjectSrc.getLanguage());
		// LanguageIfOther
		valueObjectDest.setLanguageIfOther(valueObjectSrc.getLanguageIfOther());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// ReferredBy
		valueObjectDest.setReferredBy(valueObjectSrc.getReferredBy());
		// SixWeekKPI
		valueObjectDest.setSixWeekKPI(valueObjectSrc.getSixWeekKPI());
		// ThreeWeekKPI
		valueObjectDest.setThreeWeekKPI(valueObjectSrc.getThreeWeekKPI());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// PreferredClinic
		valueObjectDest.setPreferredClinic(valueObjectSrc.getPreferredClinic());
		// Notes
		valueObjectDest.setNotes(valueObjectSrc.getNotes());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createNAESReferralVoCollectionFromNAESReferral(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.naes.domain.objects.NAESReferral objects.
	 */
	public static ims.naes.vo.NAESReferralVoCollection createNAESReferralVoCollectionFromNAESReferral(java.util.Set domainObjectSet)	
	{
		return createNAESReferralVoCollectionFromNAESReferral(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.naes.domain.objects.NAESReferral objects.
	 */
	public static ims.naes.vo.NAESReferralVoCollection createNAESReferralVoCollectionFromNAESReferral(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.naes.vo.NAESReferralVoCollection voList = new ims.naes.vo.NAESReferralVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.naes.domain.objects.NAESReferral domainObject = (ims.naes.domain.objects.NAESReferral) iterator.next();
			ims.naes.vo.NAESReferralVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.naes.domain.objects.NAESReferral objects.
	 */
	public static ims.naes.vo.NAESReferralVoCollection createNAESReferralVoCollectionFromNAESReferral(java.util.List domainObjectList) 
	{
		return createNAESReferralVoCollectionFromNAESReferral(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.naes.domain.objects.NAESReferral objects.
	 */
	public static ims.naes.vo.NAESReferralVoCollection createNAESReferralVoCollectionFromNAESReferral(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.naes.vo.NAESReferralVoCollection voList = new ims.naes.vo.NAESReferralVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.naes.domain.objects.NAESReferral domainObject = (ims.naes.domain.objects.NAESReferral) domainObjectList.get(i);
			ims.naes.vo.NAESReferralVo vo = create(map, domainObject);

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
	 * Create the ims.naes.domain.objects.NAESReferral set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractNAESReferralSet(ims.domain.ILightweightDomainFactory domainFactory, ims.naes.vo.NAESReferralVoCollection voCollection) 
	 {
	 	return extractNAESReferralSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractNAESReferralSet(ims.domain.ILightweightDomainFactory domainFactory, ims.naes.vo.NAESReferralVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.naes.vo.NAESReferralVo vo = voCollection.get(i);
			ims.naes.domain.objects.NAESReferral domainObject = NAESReferralVoAssembler.extractNAESReferral(domainFactory, vo, domMap);

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
	 * Create the ims.naes.domain.objects.NAESReferral list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractNAESReferralList(ims.domain.ILightweightDomainFactory domainFactory, ims.naes.vo.NAESReferralVoCollection voCollection) 
	 {
	 	return extractNAESReferralList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractNAESReferralList(ims.domain.ILightweightDomainFactory domainFactory, ims.naes.vo.NAESReferralVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.naes.vo.NAESReferralVo vo = voCollection.get(i);
			ims.naes.domain.objects.NAESReferral domainObject = NAESReferralVoAssembler.extractNAESReferral(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.naes.domain.objects.NAESReferral object.
	 * @param domainObject ims.naes.domain.objects.NAESReferral
	 */
	 public static ims.naes.vo.NAESReferralVo create(ims.naes.domain.objects.NAESReferral domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.naes.domain.objects.NAESReferral object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.naes.vo.NAESReferralVo create(DomainObjectMap map, ims.naes.domain.objects.NAESReferral domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.naes.vo.NAESReferralVo valueObject = (ims.naes.vo.NAESReferralVo) map.getValueObject(domainObject, ims.naes.vo.NAESReferralVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.naes.vo.NAESReferralVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.naes.domain.objects.NAESReferral
	 */
	 public static ims.naes.vo.NAESReferralVo insert(ims.naes.vo.NAESReferralVo valueObject, ims.naes.domain.objects.NAESReferral domainObject) 
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
	 * @param domainObject ims.naes.domain.objects.NAESReferral
	 */
	 public static ims.naes.vo.NAESReferralVo insert(DomainObjectMap map, ims.naes.vo.NAESReferralVo valueObject, ims.naes.domain.objects.NAESReferral domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_NAESReferral(domainObject.getId());
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
			
		// DateReferralReceived
		java.util.Date DateReferralReceived = domainObject.getDateReferralReceived();
		if ( null != DateReferralReceived ) 
		{
			valueObject.setDateReferralReceived(new ims.framework.utils.Date(DateReferralReceived) );
		}
		// DateOfSurgery
		java.util.Date DateOfSurgery = domainObject.getDateOfSurgery();
		if ( null != DateOfSurgery ) 
		{
			valueObject.setDateOfSurgery(new ims.framework.utils.Date(DateOfSurgery) );
		}
		// ReferringHospital
		valueObject.setReferringHospital(domainObject.getReferringHospital());
		// ReferringDoctor
		valueObject.setReferringDoctor(domainObject.getReferringDoctor());
		// ReferralReason
		ims.domain.lookups.LookupInstance instance5 = domainObject.getReferralReason();
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

			ims.core.vo.lookups.ReasonForReferral voLookup5 = new ims.core.vo.lookups.ReasonForReferral(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.ReasonForReferral parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.ReasonForReferral(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setReferralReason(voLookup5);
		}
				// SecondarySurgery
		ims.domain.lookups.LookupInstance instance6 = domainObject.getSecondarySurgery();
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

			ims.core.vo.lookups.YesNoUnknown voLookup6 = new ims.core.vo.lookups.YesNoUnknown(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.YesNoUnknown(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setSecondarySurgery(voLookup6);
		}
				// UnderlyingReason
		ims.domain.lookups.LookupInstance instance7 = domainObject.getUnderlyingReason();
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

			ims.naes.vo.lookups.UnderlyingReason voLookup7 = new ims.naes.vo.lookups.UnderlyingReason(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.naes.vo.lookups.UnderlyingReason parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.naes.vo.lookups.UnderlyingReason(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setUnderlyingReason(voLookup7);
		}
				// AffectedEye
		ims.domain.lookups.LookupInstance instance8 = domainObject.getAffectedEye();
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

			ims.core.vo.lookups.LateralityLRB voLookup8 = new ims.core.vo.lookups.LateralityLRB(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.LateralityLRB parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.LateralityLRB(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setAffectedEye(voLookup8);
		}
				// Implant
		ims.domain.lookups.LookupInstance instance9 = domainObject.getImplant();
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

			ims.core.vo.lookups.YesNoUnknown voLookup9 = new ims.core.vo.lookups.YesNoUnknown(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.core.vo.lookups.YesNoUnknown(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setImplant(voLookup9);
		}
				// ImplantType
		ims.domain.lookups.LookupInstance instance10 = domainObject.getImplantType();
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

			ims.naes.vo.lookups.ImplantType voLookup10 = new ims.naes.vo.lookups.ImplantType(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.naes.vo.lookups.ImplantType parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.naes.vo.lookups.ImplantType(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setImplantType(voLookup10);
		}
				// InterpreterRequired
		ims.domain.lookups.LookupInstance instance11 = domainObject.getInterpreterRequired();
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

			ims.core.vo.lookups.YesNoUnknown voLookup11 = new ims.core.vo.lookups.YesNoUnknown(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.core.vo.lookups.YesNoUnknown(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setInterpreterRequired(voLookup11);
		}
				// Language
		ims.domain.lookups.LookupInstance instance12 = domainObject.getLanguage();
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

			ims.core.vo.lookups.Language voLookup12 = new ims.core.vo.lookups.Language(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.core.vo.lookups.Language parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.core.vo.lookups.Language(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setLanguage(voLookup12);
		}
				// LanguageIfOther
		valueObject.setLanguageIfOther(domainObject.getLanguageIfOther());
		// Patient
		valueObject.setPatient(ims.core.vo.domain.PatientShortAssembler.create(map, domainObject.getPatient()) );
		// ReferredBy
		ims.domain.lookups.LookupInstance instance15 = domainObject.getReferredBy();
		if ( null != instance15 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance15.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance15.getImage().getImageId(), instance15.getImage().getImagePath());
			}
			color = instance15.getColor();
			if (color != null) 
				color.getValue();

			ims.naes.vo.lookups.NAESReferredBy voLookup15 = new ims.naes.vo.lookups.NAESReferredBy(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.naes.vo.lookups.NAESReferredBy parentVoLookup15 = voLookup15;
			ims.domain.lookups.LookupInstance parent15 = instance15.getParent();
			while (parent15 != null)
			{
				if (parent15.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent15.getImage().getImageId(), parent15.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent15.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup15.setParent(new ims.naes.vo.lookups.NAESReferredBy(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setReferredBy(voLookup15);
		}
				// SixWeekKPI
		java.util.Date SixWeekKPI = domainObject.get_6weekKPI();
		if ( null != SixWeekKPI ) 
		{
			valueObject.setSixWeekKPI(new ims.framework.utils.Date(SixWeekKPI) );
		}
		// ThreeWeekKPI
		java.util.Date ThreeWeekKPI = domainObject.get_3weekKPI();
		if ( null != ThreeWeekKPI ) 
		{
			valueObject.setThreeWeekKPI(new ims.framework.utils.Date(ThreeWeekKPI) );
		}
		// CareContext
		valueObject.setCareContext(ims.core.vo.domain.CareContextShortVoAssembler.create(map, domainObject.getCareContext()) );
		// PreferredClinic
		valueObject.setPreferredClinic(domainObject.getPreferredClinic());
		// Notes
		valueObject.setNotes(domainObject.getNotes());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.naes.domain.objects.NAESReferral extractNAESReferral(ims.domain.ILightweightDomainFactory domainFactory, ims.naes.vo.NAESReferralVo valueObject) 
	{
		return 	extractNAESReferral(domainFactory, valueObject, new HashMap());
	}

	public static ims.naes.domain.objects.NAESReferral extractNAESReferral(ims.domain.ILightweightDomainFactory domainFactory, ims.naes.vo.NAESReferralVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_NAESReferral();
		ims.naes.domain.objects.NAESReferral domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.naes.domain.objects.NAESReferral)domMap.get(valueObject);
			}
			// ims.naes.vo.NAESReferralVo ID_NAESReferral field is unknown
			domainObject = new ims.naes.domain.objects.NAESReferral();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_NAESReferral());
			if (domMap.get(key) != null)
			{
				return (ims.naes.domain.objects.NAESReferral)domMap.get(key);
			}
			domainObject = (ims.naes.domain.objects.NAESReferral) domainFactory.getDomainObject(ims.naes.domain.objects.NAESReferral.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_NAESReferral());

		java.util.Date value1 = null;
		ims.framework.utils.Date date1 = valueObject.getDateReferralReceived();		
		if ( date1 != null ) 
		{
			value1 = date1.getDate();
		}
		domainObject.setDateReferralReceived(value1);
		java.util.Date value2 = null;
		ims.framework.utils.Date date2 = valueObject.getDateOfSurgery();		
		if ( date2 != null ) 
		{
			value2 = date2.getDate();
		}
		domainObject.setDateOfSurgery(value2);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReferringHospital() != null && valueObject.getReferringHospital().equals(""))
		{
			valueObject.setReferringHospital(null);
		}
		domainObject.setReferringHospital(valueObject.getReferringHospital());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReferringDoctor() != null && valueObject.getReferringDoctor().equals(""))
		{
			valueObject.setReferringDoctor(null);
		}
		domainObject.setReferringDoctor(valueObject.getReferringDoctor());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getReferralReason() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getReferralReason().getID());
		}
		domainObject.setReferralReason(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getSecondarySurgery() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getSecondarySurgery().getID());
		}
		domainObject.setSecondarySurgery(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getUnderlyingReason() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getUnderlyingReason().getID());
		}
		domainObject.setUnderlyingReason(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getAffectedEye() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getAffectedEye().getID());
		}
		domainObject.setAffectedEye(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getImplant() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getImplant().getID());
		}
		domainObject.setImplant(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getImplantType() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getImplantType().getID());
		}
		domainObject.setImplantType(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getInterpreterRequired() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getInterpreterRequired().getID());
		}
		domainObject.setInterpreterRequired(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getLanguage() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getLanguage().getID());
		}
		domainObject.setLanguage(value12);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLanguageIfOther() != null && valueObject.getLanguageIfOther().equals(""))
		{
			valueObject.setLanguageIfOther(null);
		}
		domainObject.setLanguageIfOther(valueObject.getLanguageIfOther());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.patient.domain.objects.Patient value14 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value14 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else
			{
				value14 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value14);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getReferredBy() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getReferredBy().getID());
		}
		domainObject.setReferredBy(value15);
		java.util.Date value16 = null;
		ims.framework.utils.Date date16 = valueObject.getSixWeekKPI();		
		if ( date16 != null ) 
		{
			value16 = date16.getDate();
		}
		domainObject.set_6weekKPI(value16);
		java.util.Date value17 = null;
		ims.framework.utils.Date date17 = valueObject.getThreeWeekKPI();		
		if ( date17 != null ) 
		{
			value17 = date17.getDate();
		}
		domainObject.set_3weekKPI(value17);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.CareContext value18 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value18 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else
			{
				value18 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value18);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPreferredClinic() != null && valueObject.getPreferredClinic().equals(""))
		{
			valueObject.setPreferredClinic(null);
		}
		domainObject.setPreferredClinic(valueObject.getPreferredClinic());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNotes() != null && valueObject.getNotes().equals(""))
		{
			valueObject.setNotes(null);
		}
		domainObject.setNotes(valueObject.getNotes());

		return domainObject;
	}

}
