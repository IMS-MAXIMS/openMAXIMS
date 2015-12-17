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
public class ResultComponentCommentsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.ResultComponentCommentsVo copy(ims.ocrr.vo.ResultComponentCommentsVo valueObjectDest, ims.ocrr.vo.ResultComponentCommentsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ResultComment(valueObjectSrc.getID_ResultComment());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CommentType
		valueObjectDest.setCommentType(valueObjectSrc.getCommentType());
		// CmtSrc
		valueObjectDest.setCmtSrc(valueObjectSrc.getCmtSrc());
		// CmtText
		valueObjectDest.setCmtText(valueObjectSrc.getCmtText());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createResultComponentCommentsVoCollectionFromResultComment(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.ResultComment objects.
	 */
	public static ims.ocrr.vo.ResultComponentCommentsVoCollection createResultComponentCommentsVoCollectionFromResultComment(java.util.Set domainObjectSet)	
	{
		return createResultComponentCommentsVoCollectionFromResultComment(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.ResultComment objects.
	 */
	public static ims.ocrr.vo.ResultComponentCommentsVoCollection createResultComponentCommentsVoCollectionFromResultComment(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.ResultComponentCommentsVoCollection voList = new ims.ocrr.vo.ResultComponentCommentsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ocrr.orderingresults.domain.objects.ResultComment domainObject = (ims.ocrr.orderingresults.domain.objects.ResultComment) iterator.next();
			ims.ocrr.vo.ResultComponentCommentsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.ResultComment objects.
	 */
	public static ims.ocrr.vo.ResultComponentCommentsVoCollection createResultComponentCommentsVoCollectionFromResultComment(java.util.List domainObjectList) 
	{
		return createResultComponentCommentsVoCollectionFromResultComment(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.ResultComment objects.
	 */
	public static ims.ocrr.vo.ResultComponentCommentsVoCollection createResultComponentCommentsVoCollectionFromResultComment(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.ResultComponentCommentsVoCollection voList = new ims.ocrr.vo.ResultComponentCommentsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.orderingresults.domain.objects.ResultComment domainObject = (ims.ocrr.orderingresults.domain.objects.ResultComment) domainObjectList.get(i);
			ims.ocrr.vo.ResultComponentCommentsVo vo = create(map, domainObject);

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
	 * Create the ims.ocrr.orderingresults.domain.objects.ResultComment set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractResultCommentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ResultComponentCommentsVoCollection voCollection) 
	 {
	 	return extractResultCommentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractResultCommentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ResultComponentCommentsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.ResultComponentCommentsVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.ResultComment domainObject = ResultComponentCommentsVoAssembler.extractResultComment(domainFactory, vo, domMap);

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
	 * Create the ims.ocrr.orderingresults.domain.objects.ResultComment list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractResultCommentList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ResultComponentCommentsVoCollection voCollection) 
	 {
	 	return extractResultCommentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractResultCommentList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ResultComponentCommentsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.ResultComponentCommentsVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.ResultComment domainObject = ResultComponentCommentsVoAssembler.extractResultComment(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.ResultComment object.
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.ResultComment
	 */
	 public static ims.ocrr.vo.ResultComponentCommentsVo create(ims.ocrr.orderingresults.domain.objects.ResultComment domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.ResultComment object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ocrr.vo.ResultComponentCommentsVo create(DomainObjectMap map, ims.ocrr.orderingresults.domain.objects.ResultComment domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.ResultComponentCommentsVo valueObject = (ims.ocrr.vo.ResultComponentCommentsVo) map.getValueObject(domainObject, ims.ocrr.vo.ResultComponentCommentsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.ResultComponentCommentsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.ResultComment
	 */
	 public static ims.ocrr.vo.ResultComponentCommentsVo insert(ims.ocrr.vo.ResultComponentCommentsVo valueObject, ims.ocrr.orderingresults.domain.objects.ResultComment domainObject) 
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
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.ResultComment
	 */
	 public static ims.ocrr.vo.ResultComponentCommentsVo insert(DomainObjectMap map, ims.ocrr.vo.ResultComponentCommentsVo valueObject, ims.ocrr.orderingresults.domain.objects.ResultComment domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ResultComment(domainObject.getId());
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
			
		// CommentType
		ims.domain.lookups.LookupInstance instance1 = domainObject.getCommentType();
		if ( null != instance1 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance1.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance1.getImage().getImageId(), instance1.getImage().getImagePath());
			}
			color = instance1.getColor();
			if (color != null) 
				color.getValue();

			ims.ocrr.vo.lookups.ResultCommentType voLookup1 = new ims.ocrr.vo.lookups.ResultCommentType(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.ocrr.vo.lookups.ResultCommentType parentVoLookup1 = voLookup1;
			ims.domain.lookups.LookupInstance parent1 = instance1.getParent();
			while (parent1 != null)
			{
				if (parent1.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent1.getImage().getImageId(), parent1.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent1.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup1.setParent(new ims.ocrr.vo.lookups.ResultCommentType(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setCommentType(voLookup1);
		}
				// CmtSrc
		valueObject.setCmtSrc(domainObject.getCmtSrc());
		// CmtText
		valueObject.setCmtText(domainObject.getCmtText());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.orderingresults.domain.objects.ResultComment extractResultComment(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ResultComponentCommentsVo valueObject) 
	{
		return 	extractResultComment(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.orderingresults.domain.objects.ResultComment extractResultComment(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ResultComponentCommentsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ResultComment();
		ims.ocrr.orderingresults.domain.objects.ResultComment domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.ResultComment)domMap.get(valueObject);
			}
			// ims.ocrr.vo.ResultComponentCommentsVo ID_ResultComment field is unknown
			domainObject = new ims.ocrr.orderingresults.domain.objects.ResultComment();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ResultComment());
			if (domMap.get(key) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.ResultComment)domMap.get(key);
			}
			domainObject = (ims.ocrr.orderingresults.domain.objects.ResultComment) domainFactory.getDomainObject(ims.ocrr.orderingresults.domain.objects.ResultComment.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ResultComment());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getCommentType() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getCommentType().getID());
		}
		domainObject.setCommentType(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCmtSrc() != null && valueObject.getCmtSrc().equals(""))
		{
			valueObject.setCmtSrc(null);
		}
		domainObject.setCmtSrc(valueObject.getCmtSrc());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCmtText() != null && valueObject.getCmtText().equals(""))
		{
			valueObject.setCmtText(null);
		}
		domainObject.setCmtText(valueObject.getCmtText());

		return domainObject;
	}

}
