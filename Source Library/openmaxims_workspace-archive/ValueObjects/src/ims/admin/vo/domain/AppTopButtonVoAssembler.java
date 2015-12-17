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
package ims.admin.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Marius Mihalec
 */
public class AppTopButtonVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.admin.vo.AppTopButtonVo copy(ims.admin.vo.AppTopButtonVo valueObjectDest, ims.admin.vo.AppTopButtonVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_AppTopButton(valueObjectSrc.getID_AppTopButton());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Text
		valueObjectDest.setText(valueObjectSrc.getText());
		// Action
		valueObjectDest.setAction(valueObjectSrc.getAction());
		// BuildIn
		valueObjectDest.setBuildIn(valueObjectSrc.getBuildIn());
		// Form
		valueObjectDest.setForm(valueObjectSrc.getForm());
		// URL
		valueObjectDest.setURL(valueObjectSrc.getURL());
		// AlwaysEnabled
		valueObjectDest.setAlwaysEnabled(valueObjectSrc.getAlwaysEnabled());
		// Enabled
		valueObjectDest.setEnabled(valueObjectSrc.getEnabled());
		// ContextDependent
		valueObjectDest.setContextDependent(valueObjectSrc.getContextDependent());
		// PatientMustBeSelected
		valueObjectDest.setPatientMustBeSelected(valueObjectSrc.getPatientMustBeSelected());
		// DisplayMaximiseButton
		valueObjectDest.setDisplayMaximiseButton(valueObjectSrc.getDisplayMaximiseButton());
		// DisplayCloseButton
		valueObjectDest.setDisplayCloseButton(valueObjectSrc.getDisplayCloseButton());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createAppTopButtonVoCollectionFromAppTopButton(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.configuration.domain.objects.AppTopButton objects.
	 */
	public static ims.admin.vo.AppTopButtonVoCollection createAppTopButtonVoCollectionFromAppTopButton(java.util.Set domainObjectSet)	
	{
		return createAppTopButtonVoCollectionFromAppTopButton(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.configuration.domain.objects.AppTopButton objects.
	 */
	public static ims.admin.vo.AppTopButtonVoCollection createAppTopButtonVoCollectionFromAppTopButton(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.admin.vo.AppTopButtonVoCollection voList = new ims.admin.vo.AppTopButtonVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.configuration.domain.objects.AppTopButton domainObject = (ims.core.configuration.domain.objects.AppTopButton) iterator.next();
			ims.admin.vo.AppTopButtonVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.configuration.domain.objects.AppTopButton objects.
	 */
	public static ims.admin.vo.AppTopButtonVoCollection createAppTopButtonVoCollectionFromAppTopButton(java.util.List domainObjectList) 
	{
		return createAppTopButtonVoCollectionFromAppTopButton(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.configuration.domain.objects.AppTopButton objects.
	 */
	public static ims.admin.vo.AppTopButtonVoCollection createAppTopButtonVoCollectionFromAppTopButton(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.admin.vo.AppTopButtonVoCollection voList = new ims.admin.vo.AppTopButtonVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.configuration.domain.objects.AppTopButton domainObject = (ims.core.configuration.domain.objects.AppTopButton) domainObjectList.get(i);
			ims.admin.vo.AppTopButtonVo vo = create(map, domainObject);

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
	 * Create the ims.core.configuration.domain.objects.AppTopButton set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractAppTopButtonSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.AppTopButtonVoCollection voCollection) 
	 {
	 	return extractAppTopButtonSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractAppTopButtonSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.AppTopButtonVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.AppTopButtonVo vo = voCollection.get(i);
			ims.core.configuration.domain.objects.AppTopButton domainObject = AppTopButtonVoAssembler.extractAppTopButton(domainFactory, vo, domMap);

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
	 * Create the ims.core.configuration.domain.objects.AppTopButton list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractAppTopButtonList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.AppTopButtonVoCollection voCollection) 
	 {
	 	return extractAppTopButtonList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractAppTopButtonList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.AppTopButtonVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.AppTopButtonVo vo = voCollection.get(i);
			ims.core.configuration.domain.objects.AppTopButton domainObject = AppTopButtonVoAssembler.extractAppTopButton(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.configuration.domain.objects.AppTopButton object.
	 * @param domainObject ims.core.configuration.domain.objects.AppTopButton
	 */
	 public static ims.admin.vo.AppTopButtonVo create(ims.core.configuration.domain.objects.AppTopButton domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.configuration.domain.objects.AppTopButton object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.admin.vo.AppTopButtonVo create(DomainObjectMap map, ims.core.configuration.domain.objects.AppTopButton domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.admin.vo.AppTopButtonVo valueObject = (ims.admin.vo.AppTopButtonVo) map.getValueObject(domainObject, ims.admin.vo.AppTopButtonVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.admin.vo.AppTopButtonVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.configuration.domain.objects.AppTopButton
	 */
	 public static ims.admin.vo.AppTopButtonVo insert(ims.admin.vo.AppTopButtonVo valueObject, ims.core.configuration.domain.objects.AppTopButton domainObject) 
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
	 * @param domainObject ims.core.configuration.domain.objects.AppTopButton
	 */
	 public static ims.admin.vo.AppTopButtonVo insert(DomainObjectMap map, ims.admin.vo.AppTopButtonVo valueObject, ims.core.configuration.domain.objects.AppTopButton domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_AppTopButton(domainObject.getId());
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
			
		// Text
		valueObject.setText(domainObject.getText());
		// Action
		ims.domain.lookups.LookupInstance instance2 = domainObject.getAction();
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

			ims.admin.vo.lookups.TopButtonAction voLookup2 = new ims.admin.vo.lookups.TopButtonAction(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.admin.vo.lookups.TopButtonAction parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.admin.vo.lookups.TopButtonAction(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setAction(voLookup2);
		}
				// BuildIn
		valueObject.setBuildIn(domainObject.getBuildIn());
		// Form
		valueObject.setForm(domainObject.getForm());
		// URL
		valueObject.setURL(domainObject.getURL());
		// AlwaysEnabled
		valueObject.setAlwaysEnabled( domainObject.isAlwaysEnabled() );
		// Enabled
		valueObject.setEnabled( domainObject.isEnabled() );
		// ContextDependent
		valueObject.setContextDependent( domainObject.isContextDependent() );
		// PatientMustBeSelected
		valueObject.setPatientMustBeSelected( domainObject.isPatientMustBeSelected() );
		// DisplayMaximiseButton
		valueObject.setDisplayMaximiseButton( domainObject.isDisplayMaximiseButton() );
		// DisplayCloseButton
		valueObject.setDisplayCloseButton( domainObject.isDisplayCloseButton() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.configuration.domain.objects.AppTopButton extractAppTopButton(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.AppTopButtonVo valueObject) 
	{
		return 	extractAppTopButton(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.configuration.domain.objects.AppTopButton extractAppTopButton(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.AppTopButtonVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_AppTopButton();
		ims.core.configuration.domain.objects.AppTopButton domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.configuration.domain.objects.AppTopButton)domMap.get(valueObject);
			}
			// ims.admin.vo.AppTopButtonVo ID_AppTopButton field is unknown
			domainObject = new ims.core.configuration.domain.objects.AppTopButton();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_AppTopButton());
			if (domMap.get(key) != null)
			{
				return (ims.core.configuration.domain.objects.AppTopButton)domMap.get(key);
			}
			domainObject = (ims.core.configuration.domain.objects.AppTopButton) domainFactory.getDomainObject(ims.core.configuration.domain.objects.AppTopButton.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_AppTopButton());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getText() != null && valueObject.getText().equals(""))
		{
			valueObject.setText(null);
		}
		domainObject.setText(valueObject.getText());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getAction() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getAction().getID());
		}
		domainObject.setAction(value2);
		domainObject.setBuildIn(valueObject.getBuildIn());
		domainObject.setForm(valueObject.getForm());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getURL() != null && valueObject.getURL().equals(""))
		{
			valueObject.setURL(null);
		}
		domainObject.setURL(valueObject.getURL());
		domainObject.setAlwaysEnabled(valueObject.getAlwaysEnabled());
		domainObject.setEnabled(valueObject.getEnabled());
		domainObject.setContextDependent(valueObject.getContextDependent());
		domainObject.setPatientMustBeSelected(valueObject.getPatientMustBeSelected());
		domainObject.setDisplayMaximiseButton(valueObject.getDisplayMaximiseButton());
		domainObject.setDisplayCloseButton(valueObject.getDisplayCloseButton());

		return domainObject;
	}

}
