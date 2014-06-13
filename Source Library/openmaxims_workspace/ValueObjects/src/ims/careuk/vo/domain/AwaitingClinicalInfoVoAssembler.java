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
package ims.careuk.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class AwaitingClinicalInfoVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.careuk.vo.AwaitingClinicalInfoVo copy(ims.careuk.vo.AwaitingClinicalInfoVo valueObjectDest, ims.careuk.vo.AwaitingClinicalInfoVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_AwaitingClinicalInfo(valueObjectSrc.getID_AwaitingClinicalInfo());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ClinicalInfoAwaiting
		valueObjectDest.setClinicalInfoAwaiting(valueObjectSrc.getClinicalInfoAwaiting());
		// OtherClinicalInformation
		valueObjectDest.setOtherClinicalInformation(valueObjectSrc.getOtherClinicalInformation());
		// ClinicalInfoReceived
		valueObjectDest.setClinicalInfoReceived(valueObjectSrc.getClinicalInfoReceived());
		// DateAwaitingClinicalInfo
		valueObjectDest.setDateAwaitingClinicalInfo(valueObjectSrc.getDateAwaitingClinicalInfo());
		// DateClinicalInfoReceived
		valueObjectDest.setDateClinicalInfoReceived(valueObjectSrc.getDateClinicalInfoReceived());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createAwaitingClinicalInfoVoCollectionFromAwaitingClinicalInfo(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.careuk.domain.objects.AwaitingClinicalInfo objects.
	 */
	public static ims.careuk.vo.AwaitingClinicalInfoVoCollection createAwaitingClinicalInfoVoCollectionFromAwaitingClinicalInfo(java.util.Set domainObjectSet)	
	{
		return createAwaitingClinicalInfoVoCollectionFromAwaitingClinicalInfo(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.careuk.domain.objects.AwaitingClinicalInfo objects.
	 */
	public static ims.careuk.vo.AwaitingClinicalInfoVoCollection createAwaitingClinicalInfoVoCollectionFromAwaitingClinicalInfo(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.careuk.vo.AwaitingClinicalInfoVoCollection voList = new ims.careuk.vo.AwaitingClinicalInfoVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.careuk.domain.objects.AwaitingClinicalInfo domainObject = (ims.careuk.domain.objects.AwaitingClinicalInfo) iterator.next();
			ims.careuk.vo.AwaitingClinicalInfoVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.careuk.domain.objects.AwaitingClinicalInfo objects.
	 */
	public static ims.careuk.vo.AwaitingClinicalInfoVoCollection createAwaitingClinicalInfoVoCollectionFromAwaitingClinicalInfo(java.util.List domainObjectList) 
	{
		return createAwaitingClinicalInfoVoCollectionFromAwaitingClinicalInfo(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.careuk.domain.objects.AwaitingClinicalInfo objects.
	 */
	public static ims.careuk.vo.AwaitingClinicalInfoVoCollection createAwaitingClinicalInfoVoCollectionFromAwaitingClinicalInfo(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.careuk.vo.AwaitingClinicalInfoVoCollection voList = new ims.careuk.vo.AwaitingClinicalInfoVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.careuk.domain.objects.AwaitingClinicalInfo domainObject = (ims.careuk.domain.objects.AwaitingClinicalInfo) domainObjectList.get(i);
			ims.careuk.vo.AwaitingClinicalInfoVo vo = create(map, domainObject);

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
	 * Create the ims.careuk.domain.objects.AwaitingClinicalInfo set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractAwaitingClinicalInfoSet(ims.domain.ILightweightDomainFactory domainFactory, ims.careuk.vo.AwaitingClinicalInfoVoCollection voCollection) 
	 {
	 	return extractAwaitingClinicalInfoSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractAwaitingClinicalInfoSet(ims.domain.ILightweightDomainFactory domainFactory, ims.careuk.vo.AwaitingClinicalInfoVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.careuk.vo.AwaitingClinicalInfoVo vo = voCollection.get(i);
			ims.careuk.domain.objects.AwaitingClinicalInfo domainObject = AwaitingClinicalInfoVoAssembler.extractAwaitingClinicalInfo(domainFactory, vo, domMap);

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
	 * Create the ims.careuk.domain.objects.AwaitingClinicalInfo list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractAwaitingClinicalInfoList(ims.domain.ILightweightDomainFactory domainFactory, ims.careuk.vo.AwaitingClinicalInfoVoCollection voCollection) 
	 {
	 	return extractAwaitingClinicalInfoList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractAwaitingClinicalInfoList(ims.domain.ILightweightDomainFactory domainFactory, ims.careuk.vo.AwaitingClinicalInfoVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.careuk.vo.AwaitingClinicalInfoVo vo = voCollection.get(i);
			ims.careuk.domain.objects.AwaitingClinicalInfo domainObject = AwaitingClinicalInfoVoAssembler.extractAwaitingClinicalInfo(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.careuk.domain.objects.AwaitingClinicalInfo object.
	 * @param domainObject ims.careuk.domain.objects.AwaitingClinicalInfo
	 */
	 public static ims.careuk.vo.AwaitingClinicalInfoVo create(ims.careuk.domain.objects.AwaitingClinicalInfo domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.careuk.domain.objects.AwaitingClinicalInfo object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.careuk.vo.AwaitingClinicalInfoVo create(DomainObjectMap map, ims.careuk.domain.objects.AwaitingClinicalInfo domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.careuk.vo.AwaitingClinicalInfoVo valueObject = (ims.careuk.vo.AwaitingClinicalInfoVo) map.getValueObject(domainObject, ims.careuk.vo.AwaitingClinicalInfoVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.careuk.vo.AwaitingClinicalInfoVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.careuk.domain.objects.AwaitingClinicalInfo
	 */
	 public static ims.careuk.vo.AwaitingClinicalInfoVo insert(ims.careuk.vo.AwaitingClinicalInfoVo valueObject, ims.careuk.domain.objects.AwaitingClinicalInfo domainObject) 
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
	 * @param domainObject ims.careuk.domain.objects.AwaitingClinicalInfo
	 */
	 public static ims.careuk.vo.AwaitingClinicalInfoVo insert(DomainObjectMap map, ims.careuk.vo.AwaitingClinicalInfoVo valueObject, ims.careuk.domain.objects.AwaitingClinicalInfo domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_AwaitingClinicalInfo(domainObject.getId());
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
			
		// ClinicalInfoAwaiting
		java.util.List listClinicalInfoAwaiting = domainObject.getClinicalInfoAwaiting();
		ims.careuk.vo.lookups.AwaitingClinicalInformationTypeCollection ClinicalInfoAwaiting = new ims.careuk.vo.lookups.AwaitingClinicalInformationTypeCollection();
		for(java.util.Iterator iterator = listClinicalInfoAwaiting.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.careuk.vo.lookups.AwaitingClinicalInformationType voInstance = new ims.careuk.vo.lookups.AwaitingClinicalInformationType(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.careuk.vo.lookups.AwaitingClinicalInformationType parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.careuk.vo.lookups.AwaitingClinicalInformationType(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			ClinicalInfoAwaiting.add(voInstance);
		}
		valueObject.setClinicalInfoAwaiting( ClinicalInfoAwaiting );
		// OtherClinicalInformation
		valueObject.setOtherClinicalInformation(domainObject.getOtherClinicalInformation());
		// ClinicalInfoReceived
		java.util.List listClinicalInfoReceived = domainObject.getClinicalInfoReceived();
		ims.careuk.vo.lookups.AwaitingClinicalInformationTypeCollection ClinicalInfoReceived = new ims.careuk.vo.lookups.AwaitingClinicalInformationTypeCollection();
		for(java.util.Iterator iterator = listClinicalInfoReceived.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.careuk.vo.lookups.AwaitingClinicalInformationType voInstance = new ims.careuk.vo.lookups.AwaitingClinicalInformationType(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.careuk.vo.lookups.AwaitingClinicalInformationType parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.careuk.vo.lookups.AwaitingClinicalInformationType(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			ClinicalInfoReceived.add(voInstance);
		}
		valueObject.setClinicalInfoReceived( ClinicalInfoReceived );
		// DateAwaitingClinicalInfo
		java.util.Date DateAwaitingClinicalInfo = domainObject.getDateAwaitingClinicalInfo();
		if ( null != DateAwaitingClinicalInfo ) 
		{
			valueObject.setDateAwaitingClinicalInfo(new ims.framework.utils.DateTime(DateAwaitingClinicalInfo) );
		}
		// DateClinicalInfoReceived
		java.util.Date DateClinicalInfoReceived = domainObject.getDateClinicalInfoReceived();
		if ( null != DateClinicalInfoReceived ) 
		{
			valueObject.setDateClinicalInfoReceived(new ims.framework.utils.DateTime(DateClinicalInfoReceived) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.careuk.domain.objects.AwaitingClinicalInfo extractAwaitingClinicalInfo(ims.domain.ILightweightDomainFactory domainFactory, ims.careuk.vo.AwaitingClinicalInfoVo valueObject) 
	{
		return 	extractAwaitingClinicalInfo(domainFactory, valueObject, new HashMap());
	}

	public static ims.careuk.domain.objects.AwaitingClinicalInfo extractAwaitingClinicalInfo(ims.domain.ILightweightDomainFactory domainFactory, ims.careuk.vo.AwaitingClinicalInfoVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_AwaitingClinicalInfo();
		ims.careuk.domain.objects.AwaitingClinicalInfo domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.careuk.domain.objects.AwaitingClinicalInfo)domMap.get(valueObject);
			}
			// ims.careuk.vo.AwaitingClinicalInfoVo ID_AwaitingClinicalInfo field is unknown
			domainObject = new ims.careuk.domain.objects.AwaitingClinicalInfo();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_AwaitingClinicalInfo());
			if (domMap.get(key) != null)
			{
				return (ims.careuk.domain.objects.AwaitingClinicalInfo)domMap.get(key);
			}
			domainObject = (ims.careuk.domain.objects.AwaitingClinicalInfo) domainFactory.getDomainObject(ims.careuk.domain.objects.AwaitingClinicalInfo.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_AwaitingClinicalInfo());

		ims.careuk.vo.lookups.AwaitingClinicalInformationTypeCollection collection1 =
	valueObject.getClinicalInfoAwaiting();
	    java.util.List domainClinicalInfoAwaiting = domainObject.getClinicalInfoAwaiting();;			
	    int collection1Size=0;
		if (collection1 == null)
		{
			domainClinicalInfoAwaiting = new java.util.ArrayList(0);
		}
		else
		{
			collection1Size = collection1.size();
		}
		
		for(int i=0; i<collection1Size; i++) 
		{
			int instanceId = collection1.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainClinicalInfoAwaiting.indexOf(dom);
			if (domIdx == -1)
			{
				domainClinicalInfoAwaiting.add(i, dom);
			}
			else if (i != domIdx && i < domainClinicalInfoAwaiting.size())
			{
				Object tmp = domainClinicalInfoAwaiting.get(i);
				domainClinicalInfoAwaiting.set(i, domainClinicalInfoAwaiting.get(domIdx));
				domainClinicalInfoAwaiting.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j1 = domainClinicalInfoAwaiting.size();
		while (j1 > collection1Size)
		{
			domainClinicalInfoAwaiting.remove(j1-1);
			j1 = domainClinicalInfoAwaiting.size();
		}

		domainObject.setClinicalInfoAwaiting(domainClinicalInfoAwaiting);		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOtherClinicalInformation() != null && valueObject.getOtherClinicalInformation().equals(""))
		{
			valueObject.setOtherClinicalInformation(null);
		}
		domainObject.setOtherClinicalInformation(valueObject.getOtherClinicalInformation());
		ims.careuk.vo.lookups.AwaitingClinicalInformationTypeCollection collection3 =
	valueObject.getClinicalInfoReceived();
	    java.util.List domainClinicalInfoReceived = domainObject.getClinicalInfoReceived();;			
	    int collection3Size=0;
		if (collection3 == null)
		{
			domainClinicalInfoReceived = new java.util.ArrayList(0);
		}
		else
		{
			collection3Size = collection3.size();
		}
		
		for(int i=0; i<collection3Size; i++) 
		{
			int instanceId = collection3.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainClinicalInfoReceived.indexOf(dom);
			if (domIdx == -1)
			{
				domainClinicalInfoReceived.add(i, dom);
			}
			else if (i != domIdx && i < domainClinicalInfoReceived.size())
			{
				Object tmp = domainClinicalInfoReceived.get(i);
				domainClinicalInfoReceived.set(i, domainClinicalInfoReceived.get(domIdx));
				domainClinicalInfoReceived.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j3 = domainClinicalInfoReceived.size();
		while (j3 > collection3Size)
		{
			domainClinicalInfoReceived.remove(j3-1);
			j3 = domainClinicalInfoReceived.size();
		}

		domainObject.setClinicalInfoReceived(domainClinicalInfoReceived);		
		ims.framework.utils.DateTime dateTime4 = valueObject.getDateAwaitingClinicalInfo();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setDateAwaitingClinicalInfo(value4);
		ims.framework.utils.DateTime dateTime5 = valueObject.getDateClinicalInfoReceived();
		java.util.Date value5 = null;
		if ( dateTime5 != null ) 
		{
			value5 = dateTime5.getJavaDate();
		}
		domainObject.setDateClinicalInfoReceived(value5);

		return domainObject;
	}

}
