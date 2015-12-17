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
package ims.emergency.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Gabriel Maxim
 */
public class PostDischargeLiaisonVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.PostDischargeLiaisonVo copy(ims.emergency.vo.PostDischargeLiaisonVo valueObjectDest, ims.emergency.vo.PostDischargeLiaisonVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PostDischargeLiaison(valueObjectSrc.getID_PostDischargeLiaison());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ContactedBy
		valueObjectDest.setContactedBy(valueObjectSrc.getContactedBy());
		// PersonContacted
		valueObjectDest.setPersonContacted(valueObjectSrc.getPersonContacted());
		// PersonContactedText
		valueObjectDest.setPersonContactedText(valueObjectSrc.getPersonContactedText());
		// ReasonForContact
		valueObjectDest.setReasonForContact(valueObjectSrc.getReasonForContact());
		// ContactMethod
		valueObjectDest.setContactMethod(valueObjectSrc.getContactMethod());
		// Comments
		valueObjectDest.setComments(valueObjectSrc.getComments());
		// LetterReviewStatus
		valueObjectDest.setLetterReviewStatus(valueObjectSrc.getLetterReviewStatus());
		// AllocateToHCP
		valueObjectDest.setAllocateToHCP(valueObjectSrc.getAllocateToHCP());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPostDischargeLiaisonVoCollectionFromPostDischargeLiaison(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.emergency.domain.objects.PostDischargeLiaison objects.
	 */
	public static ims.emergency.vo.PostDischargeLiaisonVoCollection createPostDischargeLiaisonVoCollectionFromPostDischargeLiaison(java.util.Set domainObjectSet)	
	{
		return createPostDischargeLiaisonVoCollectionFromPostDischargeLiaison(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.emergency.domain.objects.PostDischargeLiaison objects.
	 */
	public static ims.emergency.vo.PostDischargeLiaisonVoCollection createPostDischargeLiaisonVoCollectionFromPostDischargeLiaison(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.PostDischargeLiaisonVoCollection voList = new ims.emergency.vo.PostDischargeLiaisonVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.emergency.domain.objects.PostDischargeLiaison domainObject = (ims.emergency.domain.objects.PostDischargeLiaison) iterator.next();
			ims.emergency.vo.PostDischargeLiaisonVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.emergency.domain.objects.PostDischargeLiaison objects.
	 */
	public static ims.emergency.vo.PostDischargeLiaisonVoCollection createPostDischargeLiaisonVoCollectionFromPostDischargeLiaison(java.util.List domainObjectList) 
	{
		return createPostDischargeLiaisonVoCollectionFromPostDischargeLiaison(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.emergency.domain.objects.PostDischargeLiaison objects.
	 */
	public static ims.emergency.vo.PostDischargeLiaisonVoCollection createPostDischargeLiaisonVoCollectionFromPostDischargeLiaison(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.PostDischargeLiaisonVoCollection voList = new ims.emergency.vo.PostDischargeLiaisonVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.emergency.domain.objects.PostDischargeLiaison domainObject = (ims.emergency.domain.objects.PostDischargeLiaison) domainObjectList.get(i);
			ims.emergency.vo.PostDischargeLiaisonVo vo = create(map, domainObject);

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
	 * Create the ims.emergency.domain.objects.PostDischargeLiaison set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPostDischargeLiaisonSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.PostDischargeLiaisonVoCollection voCollection) 
	 {
	 	return extractPostDischargeLiaisonSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPostDischargeLiaisonSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.PostDischargeLiaisonVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.PostDischargeLiaisonVo vo = voCollection.get(i);
			ims.emergency.domain.objects.PostDischargeLiaison domainObject = PostDischargeLiaisonVoAssembler.extractPostDischargeLiaison(domainFactory, vo, domMap);

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
	 * Create the ims.emergency.domain.objects.PostDischargeLiaison list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPostDischargeLiaisonList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.PostDischargeLiaisonVoCollection voCollection) 
	 {
	 	return extractPostDischargeLiaisonList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPostDischargeLiaisonList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.PostDischargeLiaisonVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.PostDischargeLiaisonVo vo = voCollection.get(i);
			ims.emergency.domain.objects.PostDischargeLiaison domainObject = PostDischargeLiaisonVoAssembler.extractPostDischargeLiaison(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.emergency.domain.objects.PostDischargeLiaison object.
	 * @param domainObject ims.emergency.domain.objects.PostDischargeLiaison
	 */
	 public static ims.emergency.vo.PostDischargeLiaisonVo create(ims.emergency.domain.objects.PostDischargeLiaison domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.emergency.domain.objects.PostDischargeLiaison object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.emergency.vo.PostDischargeLiaisonVo create(DomainObjectMap map, ims.emergency.domain.objects.PostDischargeLiaison domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.PostDischargeLiaisonVo valueObject = (ims.emergency.vo.PostDischargeLiaisonVo) map.getValueObject(domainObject, ims.emergency.vo.PostDischargeLiaisonVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.PostDischargeLiaisonVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.emergency.domain.objects.PostDischargeLiaison
	 */
	 public static ims.emergency.vo.PostDischargeLiaisonVo insert(ims.emergency.vo.PostDischargeLiaisonVo valueObject, ims.emergency.domain.objects.PostDischargeLiaison domainObject) 
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
	 * @param domainObject ims.emergency.domain.objects.PostDischargeLiaison
	 */
	 public static ims.emergency.vo.PostDischargeLiaisonVo insert(DomainObjectMap map, ims.emergency.vo.PostDischargeLiaisonVo valueObject, ims.emergency.domain.objects.PostDischargeLiaison domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PostDischargeLiaison(domainObject.getId());
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
			
		// ContactedBy
		valueObject.setContactedBy(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getContactedBy()) );
		// PersonContacted
		ims.domain.lookups.LookupInstance instance2 = domainObject.getPersonContacted();
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

			ims.emergency.vo.lookups.PersonContacted voLookup2 = new ims.emergency.vo.lookups.PersonContacted(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.emergency.vo.lookups.PersonContacted parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.emergency.vo.lookups.PersonContacted(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setPersonContacted(voLookup2);
		}
				// PersonContactedText
		valueObject.setPersonContactedText(domainObject.getPersonContactedText());
		// ReasonForContact
		ims.domain.lookups.LookupInstance instance4 = domainObject.getReasonForContact();
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

			ims.emergency.vo.lookups.ReasonForContact voLookup4 = new ims.emergency.vo.lookups.ReasonForContact(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.emergency.vo.lookups.ReasonForContact parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.emergency.vo.lookups.ReasonForContact(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setReasonForContact(voLookup4);
		}
				// ContactMethod
		ims.domain.lookups.LookupInstance instance5 = domainObject.getContactMethod();
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

			ims.core.vo.lookups.ContactMethod voLookup5 = new ims.core.vo.lookups.ContactMethod(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.ContactMethod parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.ContactMethod(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setContactMethod(voLookup5);
		}
				// Comments
		valueObject.setComments(domainObject.getComments());
		// LetterReviewStatus
		ims.domain.lookups.LookupInstance instance7 = domainObject.getLetterReviewStatus();
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

			ims.emergency.vo.lookups.LetterReviewStatus voLookup7 = new ims.emergency.vo.lookups.LetterReviewStatus(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.emergency.vo.lookups.LetterReviewStatus parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.emergency.vo.lookups.LetterReviewStatus(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setLetterReviewStatus(voLookup7);
		}
				// AllocateToHCP
		valueObject.setAllocateToHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getAllocateToHCP()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.emergency.domain.objects.PostDischargeLiaison extractPostDischargeLiaison(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.PostDischargeLiaisonVo valueObject) 
	{
		return 	extractPostDischargeLiaison(domainFactory, valueObject, new HashMap());
	}

	public static ims.emergency.domain.objects.PostDischargeLiaison extractPostDischargeLiaison(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.PostDischargeLiaisonVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PostDischargeLiaison();
		ims.emergency.domain.objects.PostDischargeLiaison domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.emergency.domain.objects.PostDischargeLiaison)domMap.get(valueObject);
			}
			// ims.emergency.vo.PostDischargeLiaisonVo ID_PostDischargeLiaison field is unknown
			domainObject = new ims.emergency.domain.objects.PostDischargeLiaison();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PostDischargeLiaison());
			if (domMap.get(key) != null)
			{
				return (ims.emergency.domain.objects.PostDischargeLiaison)domMap.get(key);
			}
			domainObject = (ims.emergency.domain.objects.PostDischargeLiaison) domainFactory.getDomainObject(ims.emergency.domain.objects.PostDischargeLiaison.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PostDischargeLiaison());

		domainObject.setContactedBy(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getContactedBy(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getPersonContacted() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getPersonContacted().getID());
		}
		domainObject.setPersonContacted(value2);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPersonContactedText() != null && valueObject.getPersonContactedText().equals(""))
		{
			valueObject.setPersonContactedText(null);
		}
		domainObject.setPersonContactedText(valueObject.getPersonContactedText());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getReasonForContact() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getReasonForContact().getID());
		}
		domainObject.setReasonForContact(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getContactMethod() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getContactMethod().getID());
		}
		domainObject.setContactMethod(value5);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComments() != null && valueObject.getComments().equals(""))
		{
			valueObject.setComments(null);
		}
		domainObject.setComments(valueObject.getComments());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getLetterReviewStatus() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getLetterReviewStatus().getID());
		}
		domainObject.setLetterReviewStatus(value7);
		domainObject.setAllocateToHCP(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getAllocateToHCP(), domMap));

		return domainObject;
	}

}
