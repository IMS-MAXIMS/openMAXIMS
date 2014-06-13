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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Marius Mihalec
 */
public class ChartResultVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.ChartResultVo copy(ims.core.vo.ChartResultVo valueObjectDest, ims.core.vo.ChartResultVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ResultComponent(valueObjectSrc.getID_ResultComponent());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Analyte
		valueObjectDest.setAnalyte(valueObjectSrc.getAnalyte());
		// ResultVal
		valueObjectDest.setResultVal(valueObjectSrc.getResultVal());
		// isAbnormal
		valueObjectDest.setIsAbnormal(valueObjectSrc.getIsAbnormal());
		// ObsDateTime
		valueObjectDest.setObsDateTime(valueObjectSrc.getObsDateTime());
		// ObsTimeSupplied
		valueObjectDest.setObsTimeSupplied(valueObjectSrc.getObsTimeSupplied());
		// Comments
		valueObjectDest.setComments(valueObjectSrc.getComments());
		// RefRange
		valueObjectDest.setRefRange(valueObjectSrc.getRefRange());
		// SpecimenSource
		valueObjectDest.setSpecimenSource(valueObjectSrc.getSpecimenSource());
		// ResultSpecimenType
		valueObjectDest.setResultSpecimenType(valueObjectSrc.getResultSpecimenType());
		// ResValType
		valueObjectDest.setResValType(valueObjectSrc.getResValType());
		// UnitOfMeasure
		valueObjectDest.setUnitOfMeasure(valueObjectSrc.getUnitOfMeasure());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createChartResultVoCollectionFromResultComponent(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.ResultComponent objects.
	 */
	public static ims.core.vo.ChartResultVoCollection createChartResultVoCollectionFromResultComponent(java.util.Set domainObjectSet)	
	{
		return createChartResultVoCollectionFromResultComponent(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.ResultComponent objects.
	 */
	public static ims.core.vo.ChartResultVoCollection createChartResultVoCollectionFromResultComponent(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.ChartResultVoCollection voList = new ims.core.vo.ChartResultVoCollection();
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
			ims.core.vo.ChartResultVo vo = create(map, domainObject);
			
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
	public static ims.core.vo.ChartResultVoCollection createChartResultVoCollectionFromResultComponent(java.util.List domainObjectList) 
	{
		return createChartResultVoCollectionFromResultComponent(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.ResultComponent objects.
	 */
	public static ims.core.vo.ChartResultVoCollection createChartResultVoCollectionFromResultComponent(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.ChartResultVoCollection voList = new ims.core.vo.ChartResultVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.orderingresults.domain.objects.ResultComponent domainObject = (ims.ocrr.orderingresults.domain.objects.ResultComponent) domainObjectList.get(i);
			ims.core.vo.ChartResultVo vo = create(map, domainObject);

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
	 public static java.util.Set extractResultComponentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ChartResultVoCollection voCollection) 
	 {
	 	return extractResultComponentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractResultComponentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ChartResultVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.ChartResultVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.ResultComponent domainObject = ChartResultVoAssembler.extractResultComponent(domainFactory, vo, domMap);

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
	 public static java.util.List extractResultComponentList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ChartResultVoCollection voCollection) 
	 {
	 	return extractResultComponentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractResultComponentList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ChartResultVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.ChartResultVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.ResultComponent domainObject = ChartResultVoAssembler.extractResultComponent(domainFactory, vo, domMap);

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
	 public static ims.core.vo.ChartResultVo create(ims.ocrr.orderingresults.domain.objects.ResultComponent domainObject) 
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
	  public static ims.core.vo.ChartResultVo create(DomainObjectMap map, ims.ocrr.orderingresults.domain.objects.ResultComponent domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.ChartResultVo valueObject = (ims.core.vo.ChartResultVo) map.getValueObject(domainObject, ims.core.vo.ChartResultVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.ChartResultVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.core.vo.ChartResultVo insert(ims.core.vo.ChartResultVo valueObject, ims.ocrr.orderingresults.domain.objects.ResultComponent domainObject) 
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
	 public static ims.core.vo.ChartResultVo insert(DomainObjectMap map, ims.core.vo.ChartResultVo valueObject, ims.ocrr.orderingresults.domain.objects.ResultComponent domainObject) 
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
		valueObject.setAnalyte(ims.ocrr.vo.domain.ChartResultAnalyteVoAssembler.create(map, domainObject.getAnalyte()) );
		// ResultVal
		valueObject.setResultVal(domainObject.getResultVal());
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
		// Comments
		valueObject.setComments(ims.ocrr.vo.domain.ResultComponentCommentsVoAssembler.createResultComponentCommentsVoCollectionFromResultComment(map, domainObject.getResultComponentComments()) );
		// RefRange
		valueObject.setRefRange(domainObject.getRefRange());
		// SpecimenSource
		ims.domain.lookups.LookupInstance instance8 = domainObject.getSpecimenSource();
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

			ims.ocrr.vo.lookups.SpecimenType voLookup8 = new ims.ocrr.vo.lookups.SpecimenType(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.ocrr.vo.lookups.SpecimenType parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.ocrr.vo.lookups.SpecimenType(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setSpecimenSource(voLookup8);
		}
				// ResultSpecimenType
		ims.domain.lookups.LookupInstance instance9 = domainObject.getResultSpecimenType();
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

			ims.vo.LookupInstVo voLookup9 = new ims.vo.LookupInstVo(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.vo.LookupInstVo parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParentInstance(new ims.vo.LookupInstVo(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParentInstance();
								parent9 = parent9.getParent();
			}			
			valueObject.setResultSpecimenType(voLookup9);
		}
				// ResValType
		ims.domain.lookups.LookupInstance instance10 = domainObject.getResValType();
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

			ims.ocrr.vo.lookups.ResultValueType voLookup10 = new ims.ocrr.vo.lookups.ResultValueType(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.ocrr.vo.lookups.ResultValueType parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.ocrr.vo.lookups.ResultValueType(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setResValType(voLookup10);
		}
				// UnitOfMeasure
		ims.domain.lookups.LookupInstance instance11 = domainObject.getUnitOfMeasure();
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

			ims.ocrr.vo.lookups.ResultUnitOfMeasure voLookup11 = new ims.ocrr.vo.lookups.ResultUnitOfMeasure(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.ocrr.vo.lookups.ResultUnitOfMeasure parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.ocrr.vo.lookups.ResultUnitOfMeasure(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setUnitOfMeasure(voLookup11);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.orderingresults.domain.objects.ResultComponent extractResultComponent(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ChartResultVo valueObject) 
	{
		return 	extractResultComponent(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.orderingresults.domain.objects.ResultComponent extractResultComponent(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ChartResultVo valueObject, HashMap domMap) 
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
			// ims.core.vo.ChartResultVo ID_ResultComponent field is unknown
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

		domainObject.setAnalyte(ims.ocrr.vo.domain.ChartResultAnalyteVoAssembler.extractAnalyte(domainFactory, valueObject.getAnalyte(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getResultVal() != null && valueObject.getResultVal().equals(""))
		{
			valueObject.setResultVal(null);
		}
		domainObject.setResultVal(valueObject.getResultVal());
		domainObject.setIsAbnormal(valueObject.getIsAbnormal());
		ims.framework.utils.DateTime dateTime4 = valueObject.getObsDateTime();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setObsDateTime(value4);
		domainObject.setObsTimeSupplied(valueObject.getObsTimeSupplied());

		// SaveAsRefVO treated as RefValueObject
		ims.ocrr.orderingresults.vo.ResultCommentRefVoCollection refCollection6 = new ims.ocrr.orderingresults.vo.ResultCommentRefVoCollection();
		if (valueObject.getComments() != null)
		{
			for (int i6=0; i6<valueObject.getComments().size(); i6++)
			{
				ims.ocrr.orderingresults.vo.ResultCommentRefVo ref6 = (ims.ocrr.orderingresults.vo.ResultCommentRefVo)valueObject.getComments().get(i6);
				refCollection6.add(ref6);
			}
		}
		int size6 = (null == refCollection6) ? 0 : refCollection6.size();		
		java.util.List domainResultComponentComments6 = domainObject.getResultComponentComments();
		if (domainResultComponentComments6 == null)
		{
			domainResultComponentComments6 = new java.util.ArrayList();
		}
		for(int i=0; i < size6; i++) 
		{
			ims.ocrr.orderingresults.vo.ResultCommentRefVo vo = refCollection6.get(i);			
			ims.ocrr.orderingresults.domain.objects.ResultComment dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.ocrr.orderingresults.domain.objects.ResultComment)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.ocrr.orderingresults.domain.objects.ResultComment)domainFactory.getDomainObject( ims.ocrr.orderingresults.domain.objects.ResultComment.class, vo.getBoId());
				}
			}

			int domIdx = domainResultComponentComments6.indexOf(dom);
			if (domIdx == -1)
			{
				domainResultComponentComments6.add(i, dom);
			}
			else if (i != domIdx && i < domainResultComponentComments6.size())
			{
				Object tmp = domainResultComponentComments6.get(i);
				domainResultComponentComments6.set(i, domainResultComponentComments6.get(domIdx));
				domainResultComponentComments6.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i6 = domainResultComponentComments6.size();
		while (i6 > size6)
		{
			domainResultComponentComments6.remove(i6-1);
			i6 = domainResultComponentComments6.size();
		}
		
		domainObject.setResultComponentComments(domainResultComponentComments6);		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getRefRange() != null && valueObject.getRefRange().equals(""))
		{
			valueObject.setRefRange(null);
		}
		domainObject.setRefRange(valueObject.getRefRange());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getSpecimenSource() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getSpecimenSource().getID());
		}
		domainObject.setSpecimenSource(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getResultSpecimenType() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getResultSpecimenType().getID());
		}
		domainObject.setResultSpecimenType(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getResValType() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getResValType().getID());
		}
		domainObject.setResValType(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getUnitOfMeasure() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getUnitOfMeasure().getID());
		}
		domainObject.setUnitOfMeasure(value11);

		return domainObject;
	}

}
