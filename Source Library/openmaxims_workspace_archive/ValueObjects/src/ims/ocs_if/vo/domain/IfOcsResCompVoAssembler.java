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
package ims.ocs_if.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author John Pearson
 */
public class IfOcsResCompVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocs_if.vo.IfOcsResCompVo copy(ims.ocs_if.vo.IfOcsResCompVo valueObjectDest, ims.ocs_if.vo.IfOcsResCompVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ResultComponent(valueObjectSrc.getID_ResultComponent());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Analyte
		valueObjectDest.setAnalyte(valueObjectSrc.getAnalyte());
		// ResValType
		valueObjectDest.setResValType(valueObjectSrc.getResValType());
		// FormattedText
		valueObjectDest.setFormattedText(valueObjectSrc.getFormattedText());
		// ResultVal
		valueObjectDest.setResultVal(valueObjectSrc.getResultVal());
		// UnitOfMeasure
		valueObjectDest.setUnitOfMeasure(valueObjectSrc.getUnitOfMeasure());
		// RefRange
		valueObjectDest.setRefRange(valueObjectSrc.getRefRange());
		// NormalcyStatus
		valueObjectDest.setNormalcyStatus(valueObjectSrc.getNormalcyStatus());
		// isAbnormal
		valueObjectDest.setIsAbnormal(valueObjectSrc.getIsAbnormal());
		// ObsDateTime
		valueObjectDest.setObsDateTime(valueObjectSrc.getObsDateTime());
		// ObsTimeSupplied
		valueObjectDest.setObsTimeSupplied(valueObjectSrc.getObsTimeSupplied());
		// ResultStatus
		valueObjectDest.setResultStatus(valueObjectSrc.getResultStatus());
		// ResultComponentComments
		valueObjectDest.setResultComponentComments(valueObjectSrc.getResultComponentComments());
		// EDSubType
		valueObjectDest.setEDSubType(valueObjectSrc.getEDSubType());
		// SpecimenSource
		valueObjectDest.setSpecimenSource(valueObjectSrc.getSpecimenSource());
		// ResultSpecimenType
		valueObjectDest.setResultSpecimenType(valueObjectSrc.getResultSpecimenType());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createIfOcsResCompVoCollectionFromResultComponent(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.ResultComponent objects.
	 */
	public static ims.ocs_if.vo.IfOcsResCompVoCollection createIfOcsResCompVoCollectionFromResultComponent(java.util.Set domainObjectSet)	
	{
		return createIfOcsResCompVoCollectionFromResultComponent(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.ResultComponent objects.
	 */
	public static ims.ocs_if.vo.IfOcsResCompVoCollection createIfOcsResCompVoCollectionFromResultComponent(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocs_if.vo.IfOcsResCompVoCollection voList = new ims.ocs_if.vo.IfOcsResCompVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ocrr.orderingresults.domain.objects.ResultComponent domainObject = (ims.ocrr.orderingresults.domain.objects.ResultComponent) iterator.next();
			ims.ocs_if.vo.IfOcsResCompVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.ResultComponent objects.
	 */
	public static ims.ocs_if.vo.IfOcsResCompVoCollection createIfOcsResCompVoCollectionFromResultComponent(java.util.List domainObjectList) 
	{
		return createIfOcsResCompVoCollectionFromResultComponent(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.ResultComponent objects.
	 */
	public static ims.ocs_if.vo.IfOcsResCompVoCollection createIfOcsResCompVoCollectionFromResultComponent(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocs_if.vo.IfOcsResCompVoCollection voList = new ims.ocs_if.vo.IfOcsResCompVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.orderingresults.domain.objects.ResultComponent domainObject = (ims.ocrr.orderingresults.domain.objects.ResultComponent) domainObjectList.get(i);
			ims.ocs_if.vo.IfOcsResCompVo vo = create(map, domainObject);

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
	 * Create the ims.ocrr.orderingresults.domain.objects.ResultComponent set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractResultComponentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOcsResCompVoCollection voCollection) 
	 {
	 	return extractResultComponentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractResultComponentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOcsResCompVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocs_if.vo.IfOcsResCompVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.ResultComponent domainObject = IfOcsResCompVoAssembler.extractResultComponent(domainFactory, vo, domMap);

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
	 * Create the ims.ocrr.orderingresults.domain.objects.ResultComponent list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractResultComponentList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOcsResCompVoCollection voCollection) 
	 {
	 	return extractResultComponentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractResultComponentList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOcsResCompVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocs_if.vo.IfOcsResCompVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.ResultComponent domainObject = IfOcsResCompVoAssembler.extractResultComponent(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.ResultComponent object.
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.ResultComponent
	 */
	 public static ims.ocs_if.vo.IfOcsResCompVo create(ims.ocrr.orderingresults.domain.objects.ResultComponent domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.ResultComponent object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ocs_if.vo.IfOcsResCompVo create(DomainObjectMap map, ims.ocrr.orderingresults.domain.objects.ResultComponent domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocs_if.vo.IfOcsResCompVo valueObject = (ims.ocs_if.vo.IfOcsResCompVo) map.getValueObject(domainObject, ims.ocs_if.vo.IfOcsResCompVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocs_if.vo.IfOcsResCompVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.ResultComponent
	 */
	 public static ims.ocs_if.vo.IfOcsResCompVo insert(ims.ocs_if.vo.IfOcsResCompVo valueObject, ims.ocrr.orderingresults.domain.objects.ResultComponent domainObject) 
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
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.ResultComponent
	 */
	 public static ims.ocs_if.vo.IfOcsResCompVo insert(DomainObjectMap map, ims.ocs_if.vo.IfOcsResCompVo valueObject, ims.ocrr.orderingresults.domain.objects.ResultComponent domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ResultComponent(domainObject.getId());
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
			
		// Analyte
		valueObject.setAnalyte(ims.ocs_if.vo.domain.IfAnalyteVoAssembler.create(map, domainObject.getAnalyte()) );
		// ResValType
		ims.domain.lookups.LookupInstance instance2 = domainObject.getResValType();
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

			ims.ocrr.vo.lookups.ResultValueType voLookup2 = new ims.ocrr.vo.lookups.ResultValueType(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.ocrr.vo.lookups.ResultValueType parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.ocrr.vo.lookups.ResultValueType(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setResValType(voLookup2);
		}
				// FormattedText
		valueObject.setFormattedText(domainObject.getFormattedText());
		// ResultVal
		valueObject.setResultVal(domainObject.getResultVal());
		// UnitOfMeasure
		ims.domain.lookups.LookupInstance instance5 = domainObject.getUnitOfMeasure();
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

			ims.ocrr.vo.lookups.ResultUnitOfMeasure voLookup5 = new ims.ocrr.vo.lookups.ResultUnitOfMeasure(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.ocrr.vo.lookups.ResultUnitOfMeasure parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.ocrr.vo.lookups.ResultUnitOfMeasure(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setUnitOfMeasure(voLookup5);
		}
				// RefRange
		valueObject.setRefRange(domainObject.getRefRange());
		// NormalcyStatus
		ims.domain.lookups.LookupInstance instance7 = domainObject.getNormalcyStatus();
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

			ims.ocrr.vo.lookups.NormalcyStatus voLookup7 = new ims.ocrr.vo.lookups.NormalcyStatus(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.ocrr.vo.lookups.NormalcyStatus parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.ocrr.vo.lookups.NormalcyStatus(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setNormalcyStatus(voLookup7);
		}
				// isAbnormal
		valueObject.setIsAbnormal( domainObject.isIsAbnormal() );
		// ObsDateTime
		java.util.Date ObsDateTime = domainObject.getObsDateTime();
		if ( null != ObsDateTime ) 
		{
			valueObject.setObsDateTime(new ims.framework.utils.DateTime(ObsDateTime) );
		}
		// ObsTimeSupplied
		valueObject.setObsTimeSupplied( domainObject.isObsTimeSupplied() );
		// ResultStatus
		ims.domain.lookups.LookupInstance instance11 = domainObject.getResultStatus();
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

			ims.ocrr.vo.lookups.ResultStatus voLookup11 = new ims.ocrr.vo.lookups.ResultStatus(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.ocrr.vo.lookups.ResultStatus parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.ocrr.vo.lookups.ResultStatus(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setResultStatus(voLookup11);
		}
				// ResultComponentComments
		valueObject.setResultComponentComments(ims.ocs_if.vo.domain.IfOcsResCommentVoAssembler.createIfOcsResCommentVoCollectionFromResultComment(map, domainObject.getResultComponentComments()) );
		// EDSubType
		ims.domain.lookups.LookupInstance instance13 = domainObject.getEDSubType();
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

			ims.ocrr.vo.lookups.ResultEDSubtype voLookup13 = new ims.ocrr.vo.lookups.ResultEDSubtype(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.ocrr.vo.lookups.ResultEDSubtype parentVoLookup13 = voLookup13;
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
								parentVoLookup13.setParent(new ims.ocrr.vo.lookups.ResultEDSubtype(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setEDSubType(voLookup13);
		}
				// SpecimenSource
		ims.domain.lookups.LookupInstance instance14 = domainObject.getSpecimenSource();
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

			ims.ocrr.vo.lookups.SpecimenType voLookup14 = new ims.ocrr.vo.lookups.SpecimenType(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.ocrr.vo.lookups.SpecimenType parentVoLookup14 = voLookup14;
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
								parentVoLookup14.setParent(new ims.ocrr.vo.lookups.SpecimenType(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setSpecimenSource(voLookup14);
		}
				// ResultSpecimenType
		ims.domain.lookups.LookupInstance instance15 = domainObject.getResultSpecimenType();
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

			ims.vo.LookupInstVo voLookup15 = new ims.vo.LookupInstVo(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.vo.LookupInstVo parentVoLookup15 = voLookup15;
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
								parentVoLookup15.setParentInstance(new ims.vo.LookupInstVo(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParentInstance();
								parent15 = parent15.getParent();
			}			
			valueObject.setResultSpecimenType(voLookup15);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.orderingresults.domain.objects.ResultComponent extractResultComponent(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOcsResCompVo valueObject) 
	{
		return 	extractResultComponent(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.orderingresults.domain.objects.ResultComponent extractResultComponent(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOcsResCompVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ResultComponent();
		ims.ocrr.orderingresults.domain.objects.ResultComponent domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.ResultComponent)domMap.get(valueObject);
			}
			// ims.ocs_if.vo.IfOcsResCompVo ID_ResultComponent field is unknown
			domainObject = new ims.ocrr.orderingresults.domain.objects.ResultComponent();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ResultComponent());
			if (domMap.get(key) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.ResultComponent)domMap.get(key);
			}
			domainObject = (ims.ocrr.orderingresults.domain.objects.ResultComponent) domainFactory.getDomainObject(ims.ocrr.orderingresults.domain.objects.ResultComponent.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ResultComponent());

		domainObject.setAnalyte(ims.ocs_if.vo.domain.IfAnalyteVoAssembler.extractAnalyte(domainFactory, valueObject.getAnalyte(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getResValType() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getResValType().getID());
		}
		domainObject.setResValType(value2);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getFormattedText() != null && valueObject.getFormattedText().equals(""))
		{
			valueObject.setFormattedText(null);
		}
		domainObject.setFormattedText(valueObject.getFormattedText());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getResultVal() != null && valueObject.getResultVal().equals(""))
		{
			valueObject.setResultVal(null);
		}
		domainObject.setResultVal(valueObject.getResultVal());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getUnitOfMeasure() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getUnitOfMeasure().getID());
		}
		domainObject.setUnitOfMeasure(value5);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getRefRange() != null && valueObject.getRefRange().equals(""))
		{
			valueObject.setRefRange(null);
		}
		domainObject.setRefRange(valueObject.getRefRange());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getNormalcyStatus() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getNormalcyStatus().getID());
		}
		domainObject.setNormalcyStatus(value7);
		domainObject.setIsAbnormal(valueObject.getIsAbnormal());
		ims.framework.utils.DateTime dateTime9 = valueObject.getObsDateTime();
		java.util.Date value9 = null;
		if ( dateTime9 != null ) 
		{
			value9 = dateTime9.getJavaDate();
		}
		domainObject.setObsDateTime(value9);
		domainObject.setObsTimeSupplied(valueObject.getObsTimeSupplied());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getResultStatus() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getResultStatus().getID());
		}
		domainObject.setResultStatus(value11);
		domainObject.setResultComponentComments(ims.ocs_if.vo.domain.IfOcsResCommentVoAssembler.extractResultCommentList(domainFactory, valueObject.getResultComponentComments(), domainObject.getResultComponentComments(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getEDSubType() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getEDSubType().getID());
		}
		domainObject.setEDSubType(value13);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getSpecimenSource() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getSpecimenSource().getID());
		}
		domainObject.setSpecimenSource(value14);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getResultSpecimenType() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getResultSpecimenType().getID());
		}
		domainObject.setResultSpecimenType(value15);

		return domainObject;
	}

}
