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
 * @author Gabriel Maxim
 */
public class CodingCommentVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.CodingCommentVo copy(ims.clinical.vo.CodingCommentVo valueObjectDest, ims.clinical.vo.CodingCommentVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CodingComment(valueObjectSrc.getID_CodingComment());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AuthoringDateTime
		valueObjectDest.setAuthoringDateTime(valueObjectSrc.getAuthoringDateTime());
		// AuthoringMOS
		valueObjectDest.setAuthoringMOS(valueObjectSrc.getAuthoringMOS());
		// CommentText
		valueObjectDest.setCommentText(valueObjectSrc.getCommentText());
		// StructuredComment
		valueObjectDest.setStructuredComment(valueObjectSrc.getStructuredComment());
		// CommentStatus
		valueObjectDest.setCommentStatus(valueObjectSrc.getCommentStatus());
		// CodingType
		valueObjectDest.setCodingType(valueObjectSrc.getCodingType());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCodingCommentVoCollectionFromCodingComment(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.CodingComment objects.
	 */
	public static ims.clinical.vo.CodingCommentVoCollection createCodingCommentVoCollectionFromCodingComment(java.util.Set domainObjectSet)	
	{
		return createCodingCommentVoCollectionFromCodingComment(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.CodingComment objects.
	 */
	public static ims.clinical.vo.CodingCommentVoCollection createCodingCommentVoCollectionFromCodingComment(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.CodingCommentVoCollection voList = new ims.clinical.vo.CodingCommentVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.CodingComment domainObject = (ims.clinical.domain.objects.CodingComment) iterator.next();
			ims.clinical.vo.CodingCommentVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.CodingComment objects.
	 */
	public static ims.clinical.vo.CodingCommentVoCollection createCodingCommentVoCollectionFromCodingComment(java.util.List domainObjectList) 
	{
		return createCodingCommentVoCollectionFromCodingComment(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.CodingComment objects.
	 */
	public static ims.clinical.vo.CodingCommentVoCollection createCodingCommentVoCollectionFromCodingComment(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.CodingCommentVoCollection voList = new ims.clinical.vo.CodingCommentVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.CodingComment domainObject = (ims.clinical.domain.objects.CodingComment) domainObjectList.get(i);
			ims.clinical.vo.CodingCommentVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.CodingComment set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractCodingCommentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.CodingCommentVoCollection voCollection) 
	 {
	 	return extractCodingCommentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCodingCommentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.CodingCommentVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.CodingCommentVo vo = voCollection.get(i);
			ims.clinical.domain.objects.CodingComment domainObject = CodingCommentVoAssembler.extractCodingComment(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.CodingComment list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractCodingCommentList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.CodingCommentVoCollection voCollection) 
	 {
	 	return extractCodingCommentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCodingCommentList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.CodingCommentVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.CodingCommentVo vo = voCollection.get(i);
			ims.clinical.domain.objects.CodingComment domainObject = CodingCommentVoAssembler.extractCodingComment(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.CodingComment object.
	 * @param domainObject ims.clinical.domain.objects.CodingComment
	 */
	 public static ims.clinical.vo.CodingCommentVo create(ims.clinical.domain.objects.CodingComment domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.CodingComment object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.CodingCommentVo create(DomainObjectMap map, ims.clinical.domain.objects.CodingComment domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.CodingCommentVo valueObject = (ims.clinical.vo.CodingCommentVo) map.getValueObject(domainObject, ims.clinical.vo.CodingCommentVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.CodingCommentVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.CodingComment
	 */
	 public static ims.clinical.vo.CodingCommentVo insert(ims.clinical.vo.CodingCommentVo valueObject, ims.clinical.domain.objects.CodingComment domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.CodingComment
	 */
	 public static ims.clinical.vo.CodingCommentVo insert(DomainObjectMap map, ims.clinical.vo.CodingCommentVo valueObject, ims.clinical.domain.objects.CodingComment domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_CodingComment(domainObject.getId());
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
			
		// AuthoringDateTime
		java.util.Date AuthoringDateTime = domainObject.getAuthoringDateTime();
		if ( null != AuthoringDateTime ) 
		{
			valueObject.setAuthoringDateTime(new ims.framework.utils.DateTime(AuthoringDateTime) );
		}
		// AuthoringMOS
		valueObject.setAuthoringMOS(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getAuthoringMOS()) );
		// CommentText
		valueObject.setCommentText(domainObject.getCommentText());
		// StructuredComment
		ims.domain.lookups.LookupInstance instance4 = domainObject.getStructuredComment();
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

			ims.clinical.vo.lookups.StructuredCodingComment voLookup4 = new ims.clinical.vo.lookups.StructuredCodingComment(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.clinical.vo.lookups.StructuredCodingComment parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.clinical.vo.lookups.StructuredCodingComment(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setStructuredComment(voLookup4);
		}
				// CommentStatus
		ims.domain.lookups.LookupInstance instance5 = domainObject.getCommentStatus();
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

			ims.clinical.vo.lookups.CodingCommentStatus voLookup5 = new ims.clinical.vo.lookups.CodingCommentStatus(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.clinical.vo.lookups.CodingCommentStatus parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.clinical.vo.lookups.CodingCommentStatus(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setCommentStatus(voLookup5);
		}
				// CodingType
		ims.domain.lookups.LookupInstance instance6 = domainObject.getCodingType();
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

			ims.clinical.vo.lookups.CodingCommentType voLookup6 = new ims.clinical.vo.lookups.CodingCommentType(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.clinical.vo.lookups.CodingCommentType parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.clinical.vo.lookups.CodingCommentType(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setCodingType(voLookup6);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.CodingComment extractCodingComment(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.CodingCommentVo valueObject) 
	{
		return 	extractCodingComment(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.CodingComment extractCodingComment(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.CodingCommentVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_CodingComment();
		ims.clinical.domain.objects.CodingComment domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.CodingComment)domMap.get(valueObject);
			}
			// ims.clinical.vo.CodingCommentVo ID_CodingComment field is unknown
			domainObject = new ims.clinical.domain.objects.CodingComment();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_CodingComment());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.CodingComment)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.CodingComment) domainFactory.getDomainObject(ims.clinical.domain.objects.CodingComment.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_CodingComment());

		ims.framework.utils.DateTime dateTime1 = valueObject.getAuthoringDateTime();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setAuthoringDateTime(value1);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value2 = null;
		if ( null != valueObject.getAuthoringMOS() ) 
		{
			if (valueObject.getAuthoringMOS().getBoId() == null)
			{
				if (domMap.get(valueObject.getAuthoringMOS()) != null)
				{
					value2 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getAuthoringMOS());
				}
			}
			else
			{
				value2 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getAuthoringMOS().getBoId());
			}
		}
		domainObject.setAuthoringMOS(value2);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCommentText() != null && valueObject.getCommentText().equals(""))
		{
			valueObject.setCommentText(null);
		}
		domainObject.setCommentText(valueObject.getCommentText());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getStructuredComment() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getStructuredComment().getID());
		}
		domainObject.setStructuredComment(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getCommentStatus() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getCommentStatus().getID());
		}
		domainObject.setCommentStatus(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getCodingType() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getCodingType().getID());
		}
		domainObject.setCodingType(value6);

		return domainObject;
	}

}
