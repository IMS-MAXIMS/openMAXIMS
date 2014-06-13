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
 * @author Vasile Purdila
 */
public class ProviderSystemVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.ProviderSystemVo copy(ims.ocrr.vo.ProviderSystemVo valueObjectDest, ims.ocrr.vo.ProviderSystemVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ProviderSystem(valueObjectSrc.getID_ProviderSystem());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// SystemName
		valueObjectDest.setSystemName(valueObjectSrc.getSystemName());
		// Description
		valueObjectDest.setDescription(valueObjectSrc.getDescription());
		// IPAddress
		valueObjectDest.setIPAddress(valueObjectSrc.getIPAddress());
		// IPPort
		valueObjectDest.setIPPort(valueObjectSrc.getIPPort());
		// Hl7Application
		valueObjectDest.setHl7Application(valueObjectSrc.getHl7Application());
		// CodeSystem
		valueObjectDest.setCodeSystem(valueObjectSrc.getCodeSystem());
		// IdtypeComponent
		valueObjectDest.setIdtypeComponent(valueObjectSrc.getIdtypeComponent());
		// PrimaryPatientId
		valueObjectDest.setPrimaryPatientId(valueObjectSrc.getPrimaryPatientId());
		// Category
		valueObjectDest.setCategory(valueObjectSrc.getCategory());
		// ConfigItems
		valueObjectDest.setConfigItems(valueObjectSrc.getConfigItems());
		// SendReferralLetter
		valueObjectDest.setSendReferralLetter(valueObjectSrc.getSendReferralLetter());
		// SendQuestionnaire
		valueObjectDest.setSendQuestionnaire(valueObjectSrc.getSendQuestionnaire());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createProviderSystemVoCollectionFromProviderSystem(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.ProviderSystem objects.
	 */
	public static ims.ocrr.vo.ProviderSystemVoCollection createProviderSystemVoCollectionFromProviderSystem(java.util.Set domainObjectSet)	
	{
		return createProviderSystemVoCollectionFromProviderSystem(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.ProviderSystem objects.
	 */
	public static ims.ocrr.vo.ProviderSystemVoCollection createProviderSystemVoCollectionFromProviderSystem(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.ProviderSystemVoCollection voList = new ims.ocrr.vo.ProviderSystemVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.domain.objects.ProviderSystem domainObject = (ims.core.admin.domain.objects.ProviderSystem) iterator.next();
			ims.ocrr.vo.ProviderSystemVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.domain.objects.ProviderSystem objects.
	 */
	public static ims.ocrr.vo.ProviderSystemVoCollection createProviderSystemVoCollectionFromProviderSystem(java.util.List domainObjectList) 
	{
		return createProviderSystemVoCollectionFromProviderSystem(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.ProviderSystem objects.
	 */
	public static ims.ocrr.vo.ProviderSystemVoCollection createProviderSystemVoCollectionFromProviderSystem(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.ProviderSystemVoCollection voList = new ims.ocrr.vo.ProviderSystemVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.ProviderSystem domainObject = (ims.core.admin.domain.objects.ProviderSystem) domainObjectList.get(i);
			ims.ocrr.vo.ProviderSystemVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.domain.objects.ProviderSystem set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractProviderSystemSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ProviderSystemVoCollection voCollection) 
	 {
	 	return extractProviderSystemSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractProviderSystemSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ProviderSystemVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.ProviderSystemVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.ProviderSystem domainObject = ProviderSystemVoAssembler.extractProviderSystem(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.domain.objects.ProviderSystem list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractProviderSystemList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ProviderSystemVoCollection voCollection) 
	 {
	 	return extractProviderSystemList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractProviderSystemList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ProviderSystemVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.ProviderSystemVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.ProviderSystem domainObject = ProviderSystemVoAssembler.extractProviderSystem(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.domain.objects.ProviderSystem object.
	 * @param domainObject ims.core.admin.domain.objects.ProviderSystem
	 */
	 public static ims.ocrr.vo.ProviderSystemVo create(ims.core.admin.domain.objects.ProviderSystem domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.domain.objects.ProviderSystem object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ocrr.vo.ProviderSystemVo create(DomainObjectMap map, ims.core.admin.domain.objects.ProviderSystem domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.ProviderSystemVo valueObject = (ims.ocrr.vo.ProviderSystemVo) map.getValueObject(domainObject, ims.ocrr.vo.ProviderSystemVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.ProviderSystemVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.domain.objects.ProviderSystem
	 */
	 public static ims.ocrr.vo.ProviderSystemVo insert(ims.ocrr.vo.ProviderSystemVo valueObject, ims.core.admin.domain.objects.ProviderSystem domainObject) 
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
	 * @param domainObject ims.core.admin.domain.objects.ProviderSystem
	 */
	 public static ims.ocrr.vo.ProviderSystemVo insert(DomainObjectMap map, ims.ocrr.vo.ProviderSystemVo valueObject, ims.core.admin.domain.objects.ProviderSystem domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ProviderSystem(domainObject.getId());
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
			
		// SystemName
		valueObject.setSystemName(domainObject.getSystemName());
		// Description
		valueObject.setDescription(domainObject.getDescription());
		// IPAddress
		valueObject.setIPAddress(domainObject.getIPAddress());
		// IPPort
		valueObject.setIPPort(domainObject.getIPPort());
		// Hl7Application
		valueObject.setHl7Application(domainObject.getHl7Application());
		// CodeSystem
		ims.domain.lookups.LookupInstance instance6 = domainObject.getCodeSystem();
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

			ims.core.vo.lookups.TaxonomyType voLookup6 = new ims.core.vo.lookups.TaxonomyType(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.TaxonomyType parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.TaxonomyType(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setCodeSystem(voLookup6);
		}
				// IdtypeComponent
		valueObject.setIdtypeComponent(domainObject.getIdtypeComponent());
		// PrimaryPatientId
		ims.domain.lookups.LookupInstance instance8 = domainObject.getPrimaryPatientId();
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

			ims.core.vo.lookups.PatIdType voLookup8 = new ims.core.vo.lookups.PatIdType(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.PatIdType parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.PatIdType(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setPrimaryPatientId(voLookup8);
		}
				// Category
		ims.domain.lookups.LookupInstance instance9 = domainObject.getCategory();
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

			ims.ocrr.vo.lookups.Category voLookup9 = new ims.ocrr.vo.lookups.Category(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.ocrr.vo.lookups.Category parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.ocrr.vo.lookups.Category(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setCategory(voLookup9);
		}
				// ConfigItems
		valueObject.setConfigItems(ims.admin.vo.domain.ConfigPropertyVoAssembler.createConfigPropertyVoCollectionFromConfigProperty(map, domainObject.getConfigItems()) );
		// SendReferralLetter
		valueObject.setSendReferralLetter( domainObject.isSendReferralLetter() );
		// SendQuestionnaire
		valueObject.setSendQuestionnaire( domainObject.isSendQuestionnaire() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.ProviderSystem extractProviderSystem(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ProviderSystemVo valueObject) 
	{
		return 	extractProviderSystem(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.ProviderSystem extractProviderSystem(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ProviderSystemVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ProviderSystem();
		ims.core.admin.domain.objects.ProviderSystem domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.domain.objects.ProviderSystem)domMap.get(valueObject);
			}
			// ims.ocrr.vo.ProviderSystemVo ID_ProviderSystem field is unknown
			domainObject = new ims.core.admin.domain.objects.ProviderSystem();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ProviderSystem());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.domain.objects.ProviderSystem)domMap.get(key);
			}
			domainObject = (ims.core.admin.domain.objects.ProviderSystem) domainFactory.getDomainObject(ims.core.admin.domain.objects.ProviderSystem.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ProviderSystem());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSystemName() != null && valueObject.getSystemName().equals(""))
		{
			valueObject.setSystemName(null);
		}
		domainObject.setSystemName(valueObject.getSystemName());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDescription() != null && valueObject.getDescription().equals(""))
		{
			valueObject.setDescription(null);
		}
		domainObject.setDescription(valueObject.getDescription());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getIPAddress() != null && valueObject.getIPAddress().equals(""))
		{
			valueObject.setIPAddress(null);
		}
		domainObject.setIPAddress(valueObject.getIPAddress());
		domainObject.setIPPort(valueObject.getIPPort());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getHl7Application() != null && valueObject.getHl7Application().equals(""))
		{
			valueObject.setHl7Application(null);
		}
		domainObject.setHl7Application(valueObject.getHl7Application());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getCodeSystem() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getCodeSystem().getID());
		}
		domainObject.setCodeSystem(value6);
		domainObject.setIdtypeComponent(valueObject.getIdtypeComponent());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getPrimaryPatientId() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getPrimaryPatientId().getID());
		}
		domainObject.setPrimaryPatientId(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getCategory() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getCategory().getID());
		}
		domainObject.setCategory(value9);
		domainObject.setConfigItems(ims.admin.vo.domain.ConfigPropertyVoAssembler.extractConfigPropertyList(domainFactory, valueObject.getConfigItems(), domainObject.getConfigItems(), domMap));		
		domainObject.setSendReferralLetter(valueObject.getSendReferralLetter());
		domainObject.setSendQuestionnaire(valueObject.getSendQuestionnaire());

		return domainObject;
	}

}
