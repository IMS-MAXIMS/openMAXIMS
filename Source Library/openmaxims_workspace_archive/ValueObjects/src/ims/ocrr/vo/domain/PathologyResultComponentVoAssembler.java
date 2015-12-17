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
package ims.ocrr.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Marius Mihalec
 */
public class PathologyResultComponentVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.PathologyResultComponentVo copy(ims.ocrr.vo.PathologyResultComponentVo valueObjectDest, ims.ocrr.vo.PathologyResultComponentVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ResultComponent(valueObjectSrc.getID_ResultComponent());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// FormattedText
		valueObjectDest.setFormattedText(valueObjectSrc.getFormattedText());
		// ResultVal
		valueObjectDest.setResultVal(valueObjectSrc.getResultVal());
		// UnitOfMeasure
		valueObjectDest.setUnitOfMeasure(valueObjectSrc.getUnitOfMeasure());
		// RefRange
		valueObjectDest.setRefRange(valueObjectSrc.getRefRange());
		// isAbnormal
		valueObjectDest.setIsAbnormal(valueObjectSrc.getIsAbnormal());
		// ResultComponentComments
		valueObjectDest.setResultComponentComments(valueObjectSrc.getResultComponentComments());
		// ResValType
		valueObjectDest.setResValType(valueObjectSrc.getResValType());
		// Analyte
		valueObjectDest.setAnalyte(valueObjectSrc.getAnalyte());
		// EDSubType
		valueObjectDest.setEDSubType(valueObjectSrc.getEDSubType());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPathologyResultComponentVoCollectionFromResultComponent(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.ResultComponent objects.
	 */
	public static ims.ocrr.vo.PathologyResultComponentVoCollection createPathologyResultComponentVoCollectionFromResultComponent(java.util.Set domainObjectSet)	
	{
		return createPathologyResultComponentVoCollectionFromResultComponent(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.ResultComponent objects.
	 */
	public static ims.ocrr.vo.PathologyResultComponentVoCollection createPathologyResultComponentVoCollectionFromResultComponent(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.PathologyResultComponentVoCollection voList = new ims.ocrr.vo.PathologyResultComponentVoCollection();
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
			ims.ocrr.vo.PathologyResultComponentVo vo = create(map, domainObject);
			
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
	public static ims.ocrr.vo.PathologyResultComponentVoCollection createPathologyResultComponentVoCollectionFromResultComponent(java.util.List domainObjectList) 
	{
		return createPathologyResultComponentVoCollectionFromResultComponent(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.ResultComponent objects.
	 */
	public static ims.ocrr.vo.PathologyResultComponentVoCollection createPathologyResultComponentVoCollectionFromResultComponent(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.PathologyResultComponentVoCollection voList = new ims.ocrr.vo.PathologyResultComponentVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.orderingresults.domain.objects.ResultComponent domainObject = (ims.ocrr.orderingresults.domain.objects.ResultComponent) domainObjectList.get(i);
			ims.ocrr.vo.PathologyResultComponentVo vo = create(map, domainObject);

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
	 public static java.util.Set extractResultComponentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.PathologyResultComponentVoCollection voCollection) 
	 {
	 	return extractResultComponentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractResultComponentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.PathologyResultComponentVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.PathologyResultComponentVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.ResultComponent domainObject = PathologyResultComponentVoAssembler.extractResultComponent(domainFactory, vo, domMap);

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
	 public static java.util.List extractResultComponentList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.PathologyResultComponentVoCollection voCollection) 
	 {
	 	return extractResultComponentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractResultComponentList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.PathologyResultComponentVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.PathologyResultComponentVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.ResultComponent domainObject = PathologyResultComponentVoAssembler.extractResultComponent(domainFactory, vo, domMap);

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
	 public static ims.ocrr.vo.PathologyResultComponentVo create(ims.ocrr.orderingresults.domain.objects.ResultComponent domainObject) 
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
	  public static ims.ocrr.vo.PathologyResultComponentVo create(DomainObjectMap map, ims.ocrr.orderingresults.domain.objects.ResultComponent domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.PathologyResultComponentVo valueObject = (ims.ocrr.vo.PathologyResultComponentVo) map.getValueObject(domainObject, ims.ocrr.vo.PathologyResultComponentVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.PathologyResultComponentVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.ocrr.vo.PathologyResultComponentVo insert(ims.ocrr.vo.PathologyResultComponentVo valueObject, ims.ocrr.orderingresults.domain.objects.ResultComponent domainObject) 
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
	 public static ims.ocrr.vo.PathologyResultComponentVo insert(DomainObjectMap map, ims.ocrr.vo.PathologyResultComponentVo valueObject, ims.ocrr.orderingresults.domain.objects.ResultComponent domainObject) 
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
			
		// FormattedText
		valueObject.setFormattedText(domainObject.getFormattedText());
		// ResultVal
		valueObject.setResultVal(domainObject.getResultVal());
		// UnitOfMeasure
		ims.domain.lookups.LookupInstance instance3 = domainObject.getUnitOfMeasure();
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

			ims.ocrr.vo.lookups.ResultUnitOfMeasure voLookup3 = new ims.ocrr.vo.lookups.ResultUnitOfMeasure(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.ocrr.vo.lookups.ResultUnitOfMeasure parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.ocrr.vo.lookups.ResultUnitOfMeasure(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setUnitOfMeasure(voLookup3);
		}
				// RefRange
		valueObject.setRefRange(domainObject.getRefRange());
		// isAbnormal
		valueObject.setIsAbnormal( domainObject.isIsAbnormal() );
		// ResultComponentComments
		valueObject.setResultComponentComments(ims.ocrr.vo.domain.ResultComponentCommentsVoAssembler.createResultComponentCommentsVoCollectionFromResultComment(map, domainObject.getResultComponentComments()) );
		// ResValType
		ims.domain.lookups.LookupInstance instance7 = domainObject.getResValType();
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

			ims.ocrr.vo.lookups.ResultValueType voLookup7 = new ims.ocrr.vo.lookups.ResultValueType(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.ocrr.vo.lookups.ResultValueType parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.ocrr.vo.lookups.ResultValueType(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setResValType(voLookup7);
		}
				// Analyte
		valueObject.setAnalyte(ims.ocrr.vo.domain.AnalyteLiteVoAssembler.create(map, domainObject.getAnalyte()) );
		// EDSubType
		ims.domain.lookups.LookupInstance instance9 = domainObject.getEDSubType();
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

			ims.ocrr.vo.lookups.ResultEDSubtype voLookup9 = new ims.ocrr.vo.lookups.ResultEDSubtype(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.ocrr.vo.lookups.ResultEDSubtype parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.ocrr.vo.lookups.ResultEDSubtype(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setEDSubType(voLookup9);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.orderingresults.domain.objects.ResultComponent extractResultComponent(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.PathologyResultComponentVo valueObject) 
	{
		return 	extractResultComponent(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.orderingresults.domain.objects.ResultComponent extractResultComponent(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.PathologyResultComponentVo valueObject, HashMap domMap) 
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
			// ims.ocrr.vo.PathologyResultComponentVo ID_ResultComponent field is unknown
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
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getUnitOfMeasure() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getUnitOfMeasure().getID());
		}
		domainObject.setUnitOfMeasure(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getRefRange() != null && valueObject.getRefRange().equals(""))
		{
			valueObject.setRefRange(null);
		}
		domainObject.setRefRange(valueObject.getRefRange());
		domainObject.setIsAbnormal(valueObject.getIsAbnormal());
		domainObject.setResultComponentComments(ims.ocrr.vo.domain.ResultComponentCommentsVoAssembler.extractResultCommentList(domainFactory, valueObject.getResultComponentComments(), domainObject.getResultComponentComments(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getResValType() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getResValType().getID());
		}
		domainObject.setResValType(value7);
		domainObject.setAnalyte(ims.ocrr.vo.domain.AnalyteLiteVoAssembler.extractAnalyte(domainFactory, valueObject.getAnalyte(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getEDSubType() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getEDSubType().getID());
		}
		domainObject.setEDSubType(value9);

		return domainObject;
	}

}
