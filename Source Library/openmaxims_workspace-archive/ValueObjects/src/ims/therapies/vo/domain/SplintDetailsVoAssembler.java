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
 * @author Charlotte Murphy
 */
public class SplintDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.therapies.vo.SplintDetailsVo copy(ims.therapies.vo.SplintDetailsVo valueObjectDest, ims.therapies.vo.SplintDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_SplintDetails(valueObjectSrc.getID_SplintDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// AuthoringDateTime
		valueObjectDest.setAuthoringDateTime(valueObjectSrc.getAuthoringDateTime());
		// AuthoringCP
		valueObjectDest.setAuthoringCP(valueObjectSrc.getAuthoringCP());
		// StartDate
		valueObjectDest.setStartDate(valueObjectSrc.getStartDate());
		// Area
		valueObjectDest.setArea(valueObjectSrc.getArea());
		// SplintCategory
		valueObjectDest.setSplintCategory(valueObjectSrc.getSplintCategory());
		// Material
		valueObjectDest.setMaterial(valueObjectSrc.getMaterial());
		// Product
		valueObjectDest.setProduct(valueObjectSrc.getProduct());
		// Laterality
		valueObjectDest.setLaterality(valueObjectSrc.getLaterality());
		// SplintType
		valueObjectDest.setSplintType(valueObjectSrc.getSplintType());
		// SplintBase
		valueObjectDest.setSplintBase(valueObjectSrc.getSplintBase());
		// SplintSize
		valueObjectDest.setSplintSize(valueObjectSrc.getSplintSize());
		// SplintsWearRegime
		valueObjectDest.setSplintsWearRegime(valueObjectSrc.getSplintsWearRegime());
		// SplintInstructions
		valueObjectDest.setSplintInstructions(valueObjectSrc.getSplintInstructions());
		// SplintAdditionalFeatures
		valueObjectDest.setSplintAdditionalFeatures(valueObjectSrc.getSplintAdditionalFeatures());
		// ConsentGiven
		valueObjectDest.setConsentGiven(valueObjectSrc.getConsentGiven());
		// EndDate
		valueObjectDest.setEndDate(valueObjectSrc.getEndDate());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSplintDetailsVoCollectionFromSplintDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.therapies.treatment.domain.objects.SplintDetails objects.
	 */
	public static ims.therapies.vo.SplintDetailsVoCollection createSplintDetailsVoCollectionFromSplintDetails(java.util.Set domainObjectSet)	
	{
		return createSplintDetailsVoCollectionFromSplintDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.therapies.treatment.domain.objects.SplintDetails objects.
	 */
	public static ims.therapies.vo.SplintDetailsVoCollection createSplintDetailsVoCollectionFromSplintDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.therapies.vo.SplintDetailsVoCollection voList = new ims.therapies.vo.SplintDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.therapies.treatment.domain.objects.SplintDetails domainObject = (ims.therapies.treatment.domain.objects.SplintDetails) iterator.next();
			ims.therapies.vo.SplintDetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.therapies.treatment.domain.objects.SplintDetails objects.
	 */
	public static ims.therapies.vo.SplintDetailsVoCollection createSplintDetailsVoCollectionFromSplintDetails(java.util.List domainObjectList) 
	{
		return createSplintDetailsVoCollectionFromSplintDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.therapies.treatment.domain.objects.SplintDetails objects.
	 */
	public static ims.therapies.vo.SplintDetailsVoCollection createSplintDetailsVoCollectionFromSplintDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.therapies.vo.SplintDetailsVoCollection voList = new ims.therapies.vo.SplintDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.therapies.treatment.domain.objects.SplintDetails domainObject = (ims.therapies.treatment.domain.objects.SplintDetails) domainObjectList.get(i);
			ims.therapies.vo.SplintDetailsVo vo = create(map, domainObject);

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
	 * Create the ims.therapies.treatment.domain.objects.SplintDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractSplintDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.SplintDetailsVoCollection voCollection) 
	 {
	 	return extractSplintDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSplintDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.SplintDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.SplintDetailsVo vo = voCollection.get(i);
			ims.therapies.treatment.domain.objects.SplintDetails domainObject = SplintDetailsVoAssembler.extractSplintDetails(domainFactory, vo, domMap);

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
	 * Create the ims.therapies.treatment.domain.objects.SplintDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractSplintDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.SplintDetailsVoCollection voCollection) 
	 {
	 	return extractSplintDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSplintDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.SplintDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.SplintDetailsVo vo = voCollection.get(i);
			ims.therapies.treatment.domain.objects.SplintDetails domainObject = SplintDetailsVoAssembler.extractSplintDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.therapies.treatment.domain.objects.SplintDetails object.
	 * @param domainObject ims.therapies.treatment.domain.objects.SplintDetails
	 */
	 public static ims.therapies.vo.SplintDetailsVo create(ims.therapies.treatment.domain.objects.SplintDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.therapies.treatment.domain.objects.SplintDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.therapies.vo.SplintDetailsVo create(DomainObjectMap map, ims.therapies.treatment.domain.objects.SplintDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.therapies.vo.SplintDetailsVo valueObject = (ims.therapies.vo.SplintDetailsVo) map.getValueObject(domainObject, ims.therapies.vo.SplintDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.therapies.vo.SplintDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.therapies.treatment.domain.objects.SplintDetails
	 */
	 public static ims.therapies.vo.SplintDetailsVo insert(ims.therapies.vo.SplintDetailsVo valueObject, ims.therapies.treatment.domain.objects.SplintDetails domainObject) 
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
	 * @param domainObject ims.therapies.treatment.domain.objects.SplintDetails
	 */
	 public static ims.therapies.vo.SplintDetailsVo insert(DomainObjectMap map, ims.therapies.vo.SplintDetailsVo valueObject, ims.therapies.treatment.domain.objects.SplintDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_SplintDetails(domainObject.getId());
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
			
		// ClinicalContact
		valueObject.setClinicalContact(ims.core.vo.domain.ClinicalContactShortVoAssembler.create(map, domainObject.getClinicalContact()) );
		// AuthoringDateTime
		java.util.Date AuthoringDateTime = domainObject.getAuthoringDateTime();
		if ( null != AuthoringDateTime ) 
		{
			valueObject.setAuthoringDateTime(new ims.framework.utils.DateTime(AuthoringDateTime) );
		}
		// AuthoringCP
		valueObject.setAuthoringCP(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getAuthoringCP()) );
		// StartDate
		java.util.Date StartDate = domainObject.getStartDate();
		if ( null != StartDate ) 
		{
			valueObject.setStartDate(new ims.framework.utils.Date(StartDate) );
		}
		// Area
		ims.domain.lookups.LookupInstance instance5 = domainObject.getArea();
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

			ims.spinalinjuries.vo.lookups.SplintArea voLookup5 = new ims.spinalinjuries.vo.lookups.SplintArea(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.SplintArea parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.spinalinjuries.vo.lookups.SplintArea(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setArea(voLookup5);
		}
				// SplintCategory
		ims.domain.lookups.LookupInstance instance6 = domainObject.getSplintCategory();
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

			ims.spinalinjuries.vo.lookups.SplintCategory voLookup6 = new ims.spinalinjuries.vo.lookups.SplintCategory(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.SplintCategory parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.spinalinjuries.vo.lookups.SplintCategory(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setSplintCategory(voLookup6);
		}
				// Material
		ims.domain.lookups.LookupInstance instance7 = domainObject.getMaterial();
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

			ims.spinalinjuries.vo.lookups.SplintMaterial voLookup7 = new ims.spinalinjuries.vo.lookups.SplintMaterial(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.SplintMaterial parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.spinalinjuries.vo.lookups.SplintMaterial(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setMaterial(voLookup7);
		}
				// Product
		ims.domain.lookups.LookupInstance instance8 = domainObject.getProduct();
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

			ims.spinalinjuries.vo.lookups.SplintProduct voLookup8 = new ims.spinalinjuries.vo.lookups.SplintProduct(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.SplintProduct parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.spinalinjuries.vo.lookups.SplintProduct(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setProduct(voLookup8);
		}
				// Laterality
		ims.domain.lookups.LookupInstance instance9 = domainObject.getLaterality();
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

			ims.core.vo.lookups.LateralityLRonly voLookup9 = new ims.core.vo.lookups.LateralityLRonly(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.LateralityLRonly parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.core.vo.lookups.LateralityLRonly(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setLaterality(voLookup9);
		}
				// SplintType
		ims.domain.lookups.LookupInstance instance10 = domainObject.getSplintType();
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

			ims.spinalinjuries.vo.lookups.SplintType voLookup10 = new ims.spinalinjuries.vo.lookups.SplintType(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.SplintType parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.spinalinjuries.vo.lookups.SplintType(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setSplintType(voLookup10);
		}
				// SplintBase
		ims.domain.lookups.LookupInstance instance11 = domainObject.getSplintBase();
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

			ims.spinalinjuries.vo.lookups.SplintBase voLookup11 = new ims.spinalinjuries.vo.lookups.SplintBase(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.SplintBase parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.spinalinjuries.vo.lookups.SplintBase(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setSplintBase(voLookup11);
		}
				// SplintSize
		ims.domain.lookups.LookupInstance instance12 = domainObject.getSplintSize();
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

			ims.spinalinjuries.vo.lookups.SplintSize voLookup12 = new ims.spinalinjuries.vo.lookups.SplintSize(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.SplintSize parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.spinalinjuries.vo.lookups.SplintSize(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setSplintSize(voLookup12);
		}
				// SplintsWearRegime
		valueObject.setSplintsWearRegime(ims.therapies.vo.domain.SplintsWearRegimeVoAssembler.createSplintsWearRegimeVoCollectionFromSplintsWearRegime(map, domainObject.getSplintRegime()) );
		// SplintInstructions
		valueObject.setSplintInstructions(ims.therapies.vo.domain.SplintsInstructionDetailsVoAssembler.createSplintsInstructionDetailsVoCollectionFromSplintsInstructionDetails(map, domainObject.getSplintInstructions()) );
		// SplintAdditionalFeatures
		valueObject.setSplintAdditionalFeatures(ims.therapies.vo.domain.SplintAdditionalFeaturesVoAssembler.createSplintAdditionalFeaturesVoCollectionFromSplintsAdditionalFeatures(map, domainObject.getSplintAdditionalFeatures()) );
		// ConsentGiven
		valueObject.setConsentGiven(ims.core.vo.domain.ConsentGivenVoAssembler.create(map, domainObject.getConsentGiven()) );
		// EndDate
		java.util.Date EndDate = domainObject.getEndDate();
		if ( null != EndDate ) 
		{
			valueObject.setEndDate(new ims.framework.utils.Date(EndDate) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.therapies.treatment.domain.objects.SplintDetails extractSplintDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.SplintDetailsVo valueObject) 
	{
		return 	extractSplintDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.therapies.treatment.domain.objects.SplintDetails extractSplintDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.SplintDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_SplintDetails();
		ims.therapies.treatment.domain.objects.SplintDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.therapies.treatment.domain.objects.SplintDetails)domMap.get(valueObject);
			}
			// ims.therapies.vo.SplintDetailsVo ID_SplintDetails field is unknown
			domainObject = new ims.therapies.treatment.domain.objects.SplintDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_SplintDetails());
			if (domMap.get(key) != null)
			{
				return (ims.therapies.treatment.domain.objects.SplintDetails)domMap.get(key);
			}
			domainObject = (ims.therapies.treatment.domain.objects.SplintDetails) domainFactory.getDomainObject(ims.therapies.treatment.domain.objects.SplintDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_SplintDetails());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.ClinicalContact value1 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value1 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else
			{
				value1 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getAuthoringDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setAuthoringDateTime(value2);
		domainObject.setAuthoringCP(ims.core.vo.domain.HcpAssembler.extractHcp(domainFactory, valueObject.getAuthoringCP(), domMap));
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getStartDate();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setStartDate(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getArea() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getArea().getID());
		}
		domainObject.setArea(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getSplintCategory() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getSplintCategory().getID());
		}
		domainObject.setSplintCategory(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getMaterial() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getMaterial().getID());
		}
		domainObject.setMaterial(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getProduct() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getProduct().getID());
		}
		domainObject.setProduct(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getLaterality() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getLaterality().getID());
		}
		domainObject.setLaterality(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getSplintType() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getSplintType().getID());
		}
		domainObject.setSplintType(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getSplintBase() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getSplintBase().getID());
		}
		domainObject.setSplintBase(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getSplintSize() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getSplintSize().getID());
		}
		domainObject.setSplintSize(value12);
		domainObject.setSplintRegime(ims.therapies.vo.domain.SplintsWearRegimeVoAssembler.extractSplintsWearRegimeSet(domainFactory, valueObject.getSplintsWearRegime(), domainObject.getSplintRegime(), domMap));		
		domainObject.setSplintInstructions(ims.therapies.vo.domain.SplintsInstructionDetailsVoAssembler.extractSplintsInstructionDetailsSet(domainFactory, valueObject.getSplintInstructions(), domainObject.getSplintInstructions(), domMap));		
		domainObject.setSplintAdditionalFeatures(ims.therapies.vo.domain.SplintAdditionalFeaturesVoAssembler.extractSplintsAdditionalFeaturesSet(domainFactory, valueObject.getSplintAdditionalFeatures(), domainObject.getSplintAdditionalFeatures(), domMap));		
		domainObject.setConsentGiven(ims.core.vo.domain.ConsentGivenVoAssembler.extractConsentGiven(domainFactory, valueObject.getConsentGiven(), domMap));
		java.util.Date value17 = null;
		ims.framework.utils.Date date17 = valueObject.getEndDate();		
		if ( date17 != null ) 
		{
			value17 = date17.getDate();
		}
		domainObject.setEndDate(value17);

		return domainObject;
	}

}
