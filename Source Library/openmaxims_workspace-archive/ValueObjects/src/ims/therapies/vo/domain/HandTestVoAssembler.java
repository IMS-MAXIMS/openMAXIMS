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
 * @author Peter Martin
 */
public class HandTestVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.therapies.vo.HandTestVo copy(ims.therapies.vo.HandTestVo valueObjectDest, ims.therapies.vo.HandTestVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_HandTest(valueObjectSrc.getID_HandTest());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AuthoringDateTime
		valueObjectDest.setAuthoringDateTime(valueObjectSrc.getAuthoringDateTime());
		// AuthoringCP
		valueObjectDest.setAuthoringCP(valueObjectSrc.getAuthoringCP());
		// LeftBulbDynamometer
		valueObjectDest.setLeftBulbDynamometer(valueObjectSrc.getLeftBulbDynamometer());
		// RightBulbDynamometer
		valueObjectDest.setRightBulbDynamometer(valueObjectSrc.getRightBulbDynamometer());
		// LeftPinchStrength
		valueObjectDest.setLeftPinchStrength(valueObjectSrc.getLeftPinchStrength());
		// RightPinchStrength
		valueObjectDest.setRightPinchStrength(valueObjectSrc.getRightPinchStrength());
		// GripStrength
		valueObjectDest.setGripStrength(valueObjectSrc.getGripStrength());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// LeftThumbIndexSpanExtension
		valueObjectDest.setLeftThumbIndexSpanExtension(valueObjectSrc.getLeftThumbIndexSpanExtension());
		// RightThumbIndexSpanExtension
		valueObjectDest.setRightThumbIndexSpanExtension(valueObjectSrc.getRightThumbIndexSpanExtension());
		// DominantHand
		valueObjectDest.setDominantHand(valueObjectSrc.getDominantHand());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createHandTestVoCollectionFromHandTest(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.therapies.hand.domain.objects.HandTest objects.
	 */
	public static ims.therapies.vo.HandTestVoCollection createHandTestVoCollectionFromHandTest(java.util.Set domainObjectSet)	
	{
		return createHandTestVoCollectionFromHandTest(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.therapies.hand.domain.objects.HandTest objects.
	 */
	public static ims.therapies.vo.HandTestVoCollection createHandTestVoCollectionFromHandTest(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.therapies.vo.HandTestVoCollection voList = new ims.therapies.vo.HandTestVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.therapies.hand.domain.objects.HandTest domainObject = (ims.therapies.hand.domain.objects.HandTest) iterator.next();
			ims.therapies.vo.HandTestVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.therapies.hand.domain.objects.HandTest objects.
	 */
	public static ims.therapies.vo.HandTestVoCollection createHandTestVoCollectionFromHandTest(java.util.List domainObjectList) 
	{
		return createHandTestVoCollectionFromHandTest(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.therapies.hand.domain.objects.HandTest objects.
	 */
	public static ims.therapies.vo.HandTestVoCollection createHandTestVoCollectionFromHandTest(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.therapies.vo.HandTestVoCollection voList = new ims.therapies.vo.HandTestVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.therapies.hand.domain.objects.HandTest domainObject = (ims.therapies.hand.domain.objects.HandTest) domainObjectList.get(i);
			ims.therapies.vo.HandTestVo vo = create(map, domainObject);

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
	 * Create the ims.therapies.hand.domain.objects.HandTest set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractHandTestSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.HandTestVoCollection voCollection) 
	 {
	 	return extractHandTestSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractHandTestSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.HandTestVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.HandTestVo vo = voCollection.get(i);
			ims.therapies.hand.domain.objects.HandTest domainObject = HandTestVoAssembler.extractHandTest(domainFactory, vo, domMap);

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
	 * Create the ims.therapies.hand.domain.objects.HandTest list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractHandTestList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.HandTestVoCollection voCollection) 
	 {
	 	return extractHandTestList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractHandTestList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.HandTestVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.HandTestVo vo = voCollection.get(i);
			ims.therapies.hand.domain.objects.HandTest domainObject = HandTestVoAssembler.extractHandTest(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.therapies.hand.domain.objects.HandTest object.
	 * @param domainObject ims.therapies.hand.domain.objects.HandTest
	 */
	 public static ims.therapies.vo.HandTestVo create(ims.therapies.hand.domain.objects.HandTest domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.therapies.hand.domain.objects.HandTest object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.therapies.vo.HandTestVo create(DomainObjectMap map, ims.therapies.hand.domain.objects.HandTest domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.therapies.vo.HandTestVo valueObject = (ims.therapies.vo.HandTestVo) map.getValueObject(domainObject, ims.therapies.vo.HandTestVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.therapies.vo.HandTestVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.therapies.hand.domain.objects.HandTest
	 */
	 public static ims.therapies.vo.HandTestVo insert(ims.therapies.vo.HandTestVo valueObject, ims.therapies.hand.domain.objects.HandTest domainObject) 
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
	 * @param domainObject ims.therapies.hand.domain.objects.HandTest
	 */
	 public static ims.therapies.vo.HandTestVo insert(DomainObjectMap map, ims.therapies.vo.HandTestVo valueObject, ims.therapies.hand.domain.objects.HandTest domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_HandTest(domainObject.getId());
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
		// AuthoringCP
		valueObject.setAuthoringCP(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getAuthoringCP()) );
		// LeftBulbDynamometer
		valueObject.setLeftBulbDynamometer(domainObject.getLeftBulbDynamometer());
		// RightBulbDynamometer
		valueObject.setRightBulbDynamometer(domainObject.getRightBulbDynamometer());
		// LeftPinchStrength
		valueObject.setLeftPinchStrength(domainObject.getLeftPinchStrength());
		// RightPinchStrength
		valueObject.setRightPinchStrength(domainObject.getRightPinchStrength());
		// GripStrength
		valueObject.setGripStrength(ims.therapies.vo.domain.HandJaymarVoAssembler.createHandJaymarVoCollectionFromHandJaymar(map, domainObject.getGripStrength()) );
		// ClinicalContact
		valueObject.setClinicalContact(ims.core.vo.domain.ClinicalContactShortVoAssembler.create(map, domainObject.getClinicalContact()) );
		// LeftThumbIndexSpanExtension
		valueObject.setLeftThumbIndexSpanExtension(domainObject.getLeftThumbIndexSpanExtension());
		// RightThumbIndexSpanExtension
		valueObject.setRightThumbIndexSpanExtension(domainObject.getRightThumbIndexSpanExtension());
		// DominantHand
		ims.domain.lookups.LookupInstance instance11 = domainObject.getDominantHand();
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

			ims.therapies.vo.lookups.Handedness voLookup11 = new ims.therapies.vo.lookups.Handedness(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.therapies.vo.lookups.Handedness parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.therapies.vo.lookups.Handedness(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setDominantHand(voLookup11);
		}
				// CareContext
		if (domainObject.getCareContext() != null)
		{
			if(domainObject.getCareContext() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCareContext();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(id, -1));				
			}
			else
			{
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(domainObject.getCareContext().getId(), domainObject.getCareContext().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.therapies.hand.domain.objects.HandTest extractHandTest(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.HandTestVo valueObject) 
	{
		return 	extractHandTest(domainFactory, valueObject, new HashMap());
	}

	public static ims.therapies.hand.domain.objects.HandTest extractHandTest(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.HandTestVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_HandTest();
		ims.therapies.hand.domain.objects.HandTest domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.therapies.hand.domain.objects.HandTest)domMap.get(valueObject);
			}
			// ims.therapies.vo.HandTestVo ID_HandTest field is unknown
			domainObject = new ims.therapies.hand.domain.objects.HandTest();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_HandTest());
			if (domMap.get(key) != null)
			{
				return (ims.therapies.hand.domain.objects.HandTest)domMap.get(key);
			}
			domainObject = (ims.therapies.hand.domain.objects.HandTest) domainFactory.getDomainObject(ims.therapies.hand.domain.objects.HandTest.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_HandTest());

		ims.framework.utils.DateTime dateTime1 = valueObject.getAuthoringDateTime();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setAuthoringDateTime(value1);
		domainObject.setAuthoringCP(ims.core.vo.domain.HcpAssembler.extractHcp(domainFactory, valueObject.getAuthoringCP(), domMap));
		domainObject.setLeftBulbDynamometer(valueObject.getLeftBulbDynamometer());
		domainObject.setRightBulbDynamometer(valueObject.getRightBulbDynamometer());
		domainObject.setLeftPinchStrength(valueObject.getLeftPinchStrength());
		domainObject.setRightPinchStrength(valueObject.getRightPinchStrength());
		domainObject.setGripStrength(ims.therapies.vo.domain.HandJaymarVoAssembler.extractHandJaymarSet(domainFactory, valueObject.getGripStrength(), domainObject.getGripStrength(), domMap));		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.ClinicalContact value8 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value8 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else
			{
				value8 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value8);
		domainObject.setLeftThumbIndexSpanExtension(valueObject.getLeftThumbIndexSpanExtension());
		domainObject.setRightThumbIndexSpanExtension(valueObject.getRightThumbIndexSpanExtension());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getDominantHand() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getDominantHand().getID());
		}
		domainObject.setDominantHand(value11);
		ims.core.admin.domain.objects.CareContext value12 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value12 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value12 = domainObject.getCareContext();	
			}
			else
			{
				value12 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value12);

		return domainObject;
	}

}
