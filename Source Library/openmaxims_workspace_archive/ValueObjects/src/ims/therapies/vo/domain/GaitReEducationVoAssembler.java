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
 * @author Charlotte Murphy
 */
public class GaitReEducationVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.therapies.vo.GaitReEducationVo copy(ims.therapies.vo.GaitReEducationVo valueObjectDest, ims.therapies.vo.GaitReEducationVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_GaitReEducation(valueObjectSrc.getID_GaitReEducation());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// AuthoringDateTime
		valueObjectDest.setAuthoringDateTime(valueObjectSrc.getAuthoringDateTime());
		// AuthoringCP
		valueObjectDest.setAuthoringCP(valueObjectSrc.getAuthoringCP());
		// GaitAspect
		valueObjectDest.setGaitAspect(valueObjectSrc.getGaitAspect());
		// Details
		valueObjectDest.setDetails(valueObjectSrc.getDetails());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createGaitReEducationVoCollectionFromGaitReEducation(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.therapies.treatment.domain.objects.GaitReEducation objects.
	 */
	public static ims.therapies.vo.GaitReEducationVoCollection createGaitReEducationVoCollectionFromGaitReEducation(java.util.Set domainObjectSet)	
	{
		return createGaitReEducationVoCollectionFromGaitReEducation(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.therapies.treatment.domain.objects.GaitReEducation objects.
	 */
	public static ims.therapies.vo.GaitReEducationVoCollection createGaitReEducationVoCollectionFromGaitReEducation(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.therapies.vo.GaitReEducationVoCollection voList = new ims.therapies.vo.GaitReEducationVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.therapies.treatment.domain.objects.GaitReEducation domainObject = (ims.therapies.treatment.domain.objects.GaitReEducation) iterator.next();
			ims.therapies.vo.GaitReEducationVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.therapies.treatment.domain.objects.GaitReEducation objects.
	 */
	public static ims.therapies.vo.GaitReEducationVoCollection createGaitReEducationVoCollectionFromGaitReEducation(java.util.List domainObjectList) 
	{
		return createGaitReEducationVoCollectionFromGaitReEducation(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.therapies.treatment.domain.objects.GaitReEducation objects.
	 */
	public static ims.therapies.vo.GaitReEducationVoCollection createGaitReEducationVoCollectionFromGaitReEducation(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.therapies.vo.GaitReEducationVoCollection voList = new ims.therapies.vo.GaitReEducationVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.therapies.treatment.domain.objects.GaitReEducation domainObject = (ims.therapies.treatment.domain.objects.GaitReEducation) domainObjectList.get(i);
			ims.therapies.vo.GaitReEducationVo vo = create(map, domainObject);

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
	 * Create the ims.therapies.treatment.domain.objects.GaitReEducation set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractGaitReEducationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.GaitReEducationVoCollection voCollection) 
	 {
	 	return extractGaitReEducationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractGaitReEducationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.GaitReEducationVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.GaitReEducationVo vo = voCollection.get(i);
			ims.therapies.treatment.domain.objects.GaitReEducation domainObject = GaitReEducationVoAssembler.extractGaitReEducation(domainFactory, vo, domMap);

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
	 * Create the ims.therapies.treatment.domain.objects.GaitReEducation list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractGaitReEducationList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.GaitReEducationVoCollection voCollection) 
	 {
	 	return extractGaitReEducationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractGaitReEducationList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.GaitReEducationVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.GaitReEducationVo vo = voCollection.get(i);
			ims.therapies.treatment.domain.objects.GaitReEducation domainObject = GaitReEducationVoAssembler.extractGaitReEducation(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.therapies.treatment.domain.objects.GaitReEducation object.
	 * @param domainObject ims.therapies.treatment.domain.objects.GaitReEducation
	 */
	 public static ims.therapies.vo.GaitReEducationVo create(ims.therapies.treatment.domain.objects.GaitReEducation domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.therapies.treatment.domain.objects.GaitReEducation object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.therapies.vo.GaitReEducationVo create(DomainObjectMap map, ims.therapies.treatment.domain.objects.GaitReEducation domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.therapies.vo.GaitReEducationVo valueObject = (ims.therapies.vo.GaitReEducationVo) map.getValueObject(domainObject, ims.therapies.vo.GaitReEducationVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.therapies.vo.GaitReEducationVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.therapies.treatment.domain.objects.GaitReEducation
	 */
	 public static ims.therapies.vo.GaitReEducationVo insert(ims.therapies.vo.GaitReEducationVo valueObject, ims.therapies.treatment.domain.objects.GaitReEducation domainObject) 
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
	 * @param domainObject ims.therapies.treatment.domain.objects.GaitReEducation
	 */
	 public static ims.therapies.vo.GaitReEducationVo insert(DomainObjectMap map, ims.therapies.vo.GaitReEducationVo valueObject, ims.therapies.treatment.domain.objects.GaitReEducation domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_GaitReEducation(domainObject.getId());
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
			
		// ClinicalContact
		valueObject.setClinicalContact(ims.core.vo.domain.ClinicalContactShortVoAssembler.create(map, domainObject.getClinicalContact()) );
		// AuthoringDateTime
		java.util.Date AuthoringDateTime = domainObject.getAuthoringDateTime();
		if ( null != AuthoringDateTime ) 
		{
			valueObject.setAuthoringDateTime(new ims.framework.utils.DateTime(AuthoringDateTime) );
		}
		// AuthoringCP
		valueObject.setAuthoringCP(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getAuthoringCP()) );
		// GaitAspect
		java.util.List listGaitAspect = domainObject.getGaitAspect();
		ims.spinalinjuries.vo.lookups.GaitReEducationGaitAspectCollection GaitAspect = new ims.spinalinjuries.vo.lookups.GaitReEducationGaitAspectCollection();
		for(java.util.Iterator iterator = listGaitAspect.iterator(); iterator.hasNext(); ) 
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
			ims.spinalinjuries.vo.lookups.GaitReEducationGaitAspect voInstance = new ims.spinalinjuries.vo.lookups.GaitReEducationGaitAspect(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.GaitReEducationGaitAspect parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.spinalinjuries.vo.lookups.GaitReEducationGaitAspect(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			GaitAspect.add(voInstance);
		}
		valueObject.setGaitAspect( GaitAspect );
		// Details
		valueObject.setDetails(domainObject.getDetails());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.therapies.treatment.domain.objects.GaitReEducation extractGaitReEducation(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.GaitReEducationVo valueObject) 
	{
		return 	extractGaitReEducation(domainFactory, valueObject, new HashMap());
	}

	public static ims.therapies.treatment.domain.objects.GaitReEducation extractGaitReEducation(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.GaitReEducationVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_GaitReEducation();
		ims.therapies.treatment.domain.objects.GaitReEducation domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.therapies.treatment.domain.objects.GaitReEducation)domMap.get(valueObject);
			}
			// ims.therapies.vo.GaitReEducationVo ID_GaitReEducation field is unknown
			domainObject = new ims.therapies.treatment.domain.objects.GaitReEducation();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_GaitReEducation());
			if (domMap.get(key) != null)
			{
				return (ims.therapies.treatment.domain.objects.GaitReEducation)domMap.get(key);
			}
			domainObject = (ims.therapies.treatment.domain.objects.GaitReEducation) domainFactory.getDomainObject(ims.therapies.treatment.domain.objects.GaitReEducation.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_GaitReEducation());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.ClinicalContact value1 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value1 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else
			{
				value1 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getAuthoringDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setAuthoringDateTime(value2);
		domainObject.setAuthoringCP(ims.core.vo.domain.HcpAssembler.extractHcp(domainFactory, valueObject.getAuthoringCP(), domMap));
		ims.spinalinjuries.vo.lookups.GaitReEducationGaitAspectCollection collection4 =
	valueObject.getGaitAspect();
	    java.util.List domainGaitAspect = domainObject.getGaitAspect();;			
	    int collection4Size=0;
		if (collection4 == null)
		{
			domainGaitAspect = new java.util.ArrayList(0);
		}
		else
		{
			collection4Size = collection4.size();
		}
		
		for(int i=0; i<collection4Size; i++) 
		{
			int instanceId = collection4.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainGaitAspect.indexOf(dom);
			if (domIdx == -1)
			{
				domainGaitAspect.add(i, dom);
			}
			else if (i != domIdx && i < domainGaitAspect.size())
			{
				Object tmp = domainGaitAspect.get(i);
				domainGaitAspect.set(i, domainGaitAspect.get(domIdx));
				domainGaitAspect.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j4 = domainGaitAspect.size();
		while (j4 > collection4Size)
		{
			domainGaitAspect.remove(j4-1);
			j4 = domainGaitAspect.size();
		}

		domainObject.setGaitAspect(domainGaitAspect);		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDetails() != null && valueObject.getDetails().equals(""))
		{
			valueObject.setDetails(null);
		}
		domainObject.setDetails(valueObject.getDetails());

		return domainObject;
	}

}
