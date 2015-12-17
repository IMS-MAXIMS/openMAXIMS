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
 * @author Rory Fitzpatrick
 */
public class ElectronicPrescribingConfigVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.admin.vo.ElectronicPrescribingConfigVo copy(ims.admin.vo.ElectronicPrescribingConfigVo valueObjectDest, ims.admin.vo.ElectronicPrescribingConfigVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ElectronicPrescribingConfig(valueObjectSrc.getID_ElectronicPrescribingConfig());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Button
		valueObjectDest.setButton(valueObjectSrc.getButton());
		// ButtonText
		valueObjectDest.setButtonText(valueObjectSrc.getButtonText());
		// LabelText
		valueObjectDest.setLabelText(valueObjectSrc.getLabelText());
		// ButtonExecutablePath
		valueObjectDest.setButtonExecutablePath(valueObjectSrc.getButtonExecutablePath());
		// ButtonParameter
		valueObjectDest.setButtonParameter(valueObjectSrc.getButtonParameter());
		// ButtonDeniedRoleAccess
		valueObjectDest.setButtonDeniedRoleAccess(valueObjectSrc.getButtonDeniedRoleAccess());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createElectronicPrescribingConfigVoCollectionFromElectronicPrescribingConfig(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.ElectronicPrescribingConfig objects.
	 */
	public static ims.admin.vo.ElectronicPrescribingConfigVoCollection createElectronicPrescribingConfigVoCollectionFromElectronicPrescribingConfig(java.util.Set domainObjectSet)	
	{
		return createElectronicPrescribingConfigVoCollectionFromElectronicPrescribingConfig(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.ElectronicPrescribingConfig objects.
	 */
	public static ims.admin.vo.ElectronicPrescribingConfigVoCollection createElectronicPrescribingConfigVoCollectionFromElectronicPrescribingConfig(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.admin.vo.ElectronicPrescribingConfigVoCollection voList = new ims.admin.vo.ElectronicPrescribingConfigVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.domain.objects.ElectronicPrescribingConfig domainObject = (ims.core.admin.domain.objects.ElectronicPrescribingConfig) iterator.next();
			ims.admin.vo.ElectronicPrescribingConfigVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.domain.objects.ElectronicPrescribingConfig objects.
	 */
	public static ims.admin.vo.ElectronicPrescribingConfigVoCollection createElectronicPrescribingConfigVoCollectionFromElectronicPrescribingConfig(java.util.List domainObjectList) 
	{
		return createElectronicPrescribingConfigVoCollectionFromElectronicPrescribingConfig(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.ElectronicPrescribingConfig objects.
	 */
	public static ims.admin.vo.ElectronicPrescribingConfigVoCollection createElectronicPrescribingConfigVoCollectionFromElectronicPrescribingConfig(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.admin.vo.ElectronicPrescribingConfigVoCollection voList = new ims.admin.vo.ElectronicPrescribingConfigVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.ElectronicPrescribingConfig domainObject = (ims.core.admin.domain.objects.ElectronicPrescribingConfig) domainObjectList.get(i);
			ims.admin.vo.ElectronicPrescribingConfigVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.domain.objects.ElectronicPrescribingConfig set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractElectronicPrescribingConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ElectronicPrescribingConfigVoCollection voCollection) 
	 {
	 	return extractElectronicPrescribingConfigSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractElectronicPrescribingConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ElectronicPrescribingConfigVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.ElectronicPrescribingConfigVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.ElectronicPrescribingConfig domainObject = ElectronicPrescribingConfigVoAssembler.extractElectronicPrescribingConfig(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.domain.objects.ElectronicPrescribingConfig list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractElectronicPrescribingConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ElectronicPrescribingConfigVoCollection voCollection) 
	 {
	 	return extractElectronicPrescribingConfigList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractElectronicPrescribingConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ElectronicPrescribingConfigVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.ElectronicPrescribingConfigVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.ElectronicPrescribingConfig domainObject = ElectronicPrescribingConfigVoAssembler.extractElectronicPrescribingConfig(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.domain.objects.ElectronicPrescribingConfig object.
	 * @param domainObject ims.core.admin.domain.objects.ElectronicPrescribingConfig
	 */
	 public static ims.admin.vo.ElectronicPrescribingConfigVo create(ims.core.admin.domain.objects.ElectronicPrescribingConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.domain.objects.ElectronicPrescribingConfig object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.admin.vo.ElectronicPrescribingConfigVo create(DomainObjectMap map, ims.core.admin.domain.objects.ElectronicPrescribingConfig domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.admin.vo.ElectronicPrescribingConfigVo valueObject = (ims.admin.vo.ElectronicPrescribingConfigVo) map.getValueObject(domainObject, ims.admin.vo.ElectronicPrescribingConfigVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.admin.vo.ElectronicPrescribingConfigVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.domain.objects.ElectronicPrescribingConfig
	 */
	 public static ims.admin.vo.ElectronicPrescribingConfigVo insert(ims.admin.vo.ElectronicPrescribingConfigVo valueObject, ims.core.admin.domain.objects.ElectronicPrescribingConfig domainObject) 
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
	 * @param domainObject ims.core.admin.domain.objects.ElectronicPrescribingConfig
	 */
	 public static ims.admin.vo.ElectronicPrescribingConfigVo insert(DomainObjectMap map, ims.admin.vo.ElectronicPrescribingConfigVo valueObject, ims.core.admin.domain.objects.ElectronicPrescribingConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ElectronicPrescribingConfig(domainObject.getId());
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
			
		// Button
		ims.domain.lookups.LookupInstance instance1 = domainObject.getButton();
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

			ims.core.vo.lookups.ElectronicPrescribingButton voLookup1 = new ims.core.vo.lookups.ElectronicPrescribingButton(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.ElectronicPrescribingButton parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.core.vo.lookups.ElectronicPrescribingButton(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setButton(voLookup1);
		}
				// ButtonText
		valueObject.setButtonText(domainObject.getButtonText());
		// LabelText
		valueObject.setLabelText(domainObject.getLabelText());
		// ButtonExecutablePath
		valueObject.setButtonExecutablePath(domainObject.getButtonExecutablePath());
		// ButtonParameter
		valueObject.setButtonParameter(domainObject.getButtonParameter());
		// ButtonDeniedRoleAccess
		valueObject.setButtonDeniedRoleAccess(ims.admin.vo.domain.AppRoleShortVoAssembler.createAppRoleShortVoCollectionFromAppRole(map, domainObject.getButtonDeniedRoleAccess()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.ElectronicPrescribingConfig extractElectronicPrescribingConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ElectronicPrescribingConfigVo valueObject) 
	{
		return 	extractElectronicPrescribingConfig(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.ElectronicPrescribingConfig extractElectronicPrescribingConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ElectronicPrescribingConfigVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ElectronicPrescribingConfig();
		ims.core.admin.domain.objects.ElectronicPrescribingConfig domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.domain.objects.ElectronicPrescribingConfig)domMap.get(valueObject);
			}
			// ims.admin.vo.ElectronicPrescribingConfigVo ID_ElectronicPrescribingConfig field is unknown
			domainObject = new ims.core.admin.domain.objects.ElectronicPrescribingConfig();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ElectronicPrescribingConfig());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.domain.objects.ElectronicPrescribingConfig)domMap.get(key);
			}
			domainObject = (ims.core.admin.domain.objects.ElectronicPrescribingConfig) domainFactory.getDomainObject(ims.core.admin.domain.objects.ElectronicPrescribingConfig.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ElectronicPrescribingConfig());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getButton() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getButton().getID());
		}
		domainObject.setButton(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getButtonText() != null && valueObject.getButtonText().equals(""))
		{
			valueObject.setButtonText(null);
		}
		domainObject.setButtonText(valueObject.getButtonText());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLabelText() != null && valueObject.getLabelText().equals(""))
		{
			valueObject.setLabelText(null);
		}
		domainObject.setLabelText(valueObject.getLabelText());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getButtonExecutablePath() != null && valueObject.getButtonExecutablePath().equals(""))
		{
			valueObject.setButtonExecutablePath(null);
		}
		domainObject.setButtonExecutablePath(valueObject.getButtonExecutablePath());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getButtonParameter() != null && valueObject.getButtonParameter().equals(""))
		{
			valueObject.setButtonParameter(null);
		}
		domainObject.setButtonParameter(valueObject.getButtonParameter());

		// SaveAsRefVO treated as RefValueObject
		ims.core.configuration.vo.AppRoleRefVoCollection refCollection6 = new ims.core.configuration.vo.AppRoleRefVoCollection();
		if (valueObject.getButtonDeniedRoleAccess() != null)
		{
			for (int i6=0; i6<valueObject.getButtonDeniedRoleAccess().size(); i6++)
			{
				ims.core.configuration.vo.AppRoleRefVo ref6 = (ims.core.configuration.vo.AppRoleRefVo)valueObject.getButtonDeniedRoleAccess().get(i6);
				refCollection6.add(ref6);
			}
		}
		int size6 = (null == refCollection6) ? 0 : refCollection6.size();		
		java.util.List domainButtonDeniedRoleAccess6 = domainObject.getButtonDeniedRoleAccess();
		if (domainButtonDeniedRoleAccess6 == null)
		{
			domainButtonDeniedRoleAccess6 = new java.util.ArrayList();
		}
		for(int i=0; i < size6; i++) 
		{
			ims.core.configuration.vo.AppRoleRefVo vo = refCollection6.get(i);			
			ims.core.configuration.domain.objects.AppRole dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.configuration.domain.objects.AppRole)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.configuration.domain.objects.AppRole)domainFactory.getDomainObject( ims.core.configuration.domain.objects.AppRole.class, vo.getBoId());
				}
			}

			int domIdx = domainButtonDeniedRoleAccess6.indexOf(dom);
			if (domIdx == -1)
			{
				domainButtonDeniedRoleAccess6.add(i, dom);
			}
			else if (i != domIdx && i < domainButtonDeniedRoleAccess6.size())
			{
				Object tmp = domainButtonDeniedRoleAccess6.get(i);
				domainButtonDeniedRoleAccess6.set(i, domainButtonDeniedRoleAccess6.get(domIdx));
				domainButtonDeniedRoleAccess6.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i6 = domainButtonDeniedRoleAccess6.size();
		while (i6 > size6)
		{
			domainButtonDeniedRoleAccess6.remove(i6-1);
			i6 = domainButtonDeniedRoleAccess6.size();
		}
		
		domainObject.setButtonDeniedRoleAccess(domainButtonDeniedRoleAccess6);		

		return domainObject;
	}

}
