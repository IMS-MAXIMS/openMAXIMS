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
package ims.icp.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Vasile Purdila
 */
public class PatientICPActionStatusVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.icp.vo.PatientICPActionStatusVo copy(ims.icp.vo.PatientICPActionStatusVo valueObjectDest, ims.icp.vo.PatientICPActionStatusVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientICPActionStatus(valueObjectSrc.getID_PatientICPActionStatus());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// StatusDate
		valueObjectDest.setStatusDate(valueObjectSrc.getStatusDate());
		// ChangedBy
		valueObjectDest.setChangedBy(valueObjectSrc.getChangedBy());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// VarianceCategory
		valueObjectDest.setVarianceCategory(valueObjectSrc.getVarianceCategory());
		// VarianceType
		valueObjectDest.setVarianceType(valueObjectSrc.getVarianceType());
		// VarianceComment
		valueObjectDest.setVarianceComment(valueObjectSrc.getVarianceComment());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientICPActionStatusVoCollectionFromPatientICPActionStatus(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.icps.instantiation.domain.objects.PatientICPActionStatus objects.
	 */
	public static ims.icp.vo.PatientICPActionStatusVoCollection createPatientICPActionStatusVoCollectionFromPatientICPActionStatus(java.util.Set domainObjectSet)	
	{
		return createPatientICPActionStatusVoCollectionFromPatientICPActionStatus(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.icps.instantiation.domain.objects.PatientICPActionStatus objects.
	 */
	public static ims.icp.vo.PatientICPActionStatusVoCollection createPatientICPActionStatusVoCollectionFromPatientICPActionStatus(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.icp.vo.PatientICPActionStatusVoCollection voList = new ims.icp.vo.PatientICPActionStatusVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.icps.instantiation.domain.objects.PatientICPActionStatus domainObject = (ims.icps.instantiation.domain.objects.PatientICPActionStatus) iterator.next();
			ims.icp.vo.PatientICPActionStatusVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.icps.instantiation.domain.objects.PatientICPActionStatus objects.
	 */
	public static ims.icp.vo.PatientICPActionStatusVoCollection createPatientICPActionStatusVoCollectionFromPatientICPActionStatus(java.util.List domainObjectList) 
	{
		return createPatientICPActionStatusVoCollectionFromPatientICPActionStatus(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.icps.instantiation.domain.objects.PatientICPActionStatus objects.
	 */
	public static ims.icp.vo.PatientICPActionStatusVoCollection createPatientICPActionStatusVoCollectionFromPatientICPActionStatus(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.icp.vo.PatientICPActionStatusVoCollection voList = new ims.icp.vo.PatientICPActionStatusVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.icps.instantiation.domain.objects.PatientICPActionStatus domainObject = (ims.icps.instantiation.domain.objects.PatientICPActionStatus) domainObjectList.get(i);
			ims.icp.vo.PatientICPActionStatusVo vo = create(map, domainObject);

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
	 * Create the ims.icps.instantiation.domain.objects.PatientICPActionStatus set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientICPActionStatusSet(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPActionStatusVoCollection voCollection) 
	 {
	 	return extractPatientICPActionStatusSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientICPActionStatusSet(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPActionStatusVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.icp.vo.PatientICPActionStatusVo vo = voCollection.get(i);
			ims.icps.instantiation.domain.objects.PatientICPActionStatus domainObject = PatientICPActionStatusVoAssembler.extractPatientICPActionStatus(domainFactory, vo, domMap);

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
	 * Create the ims.icps.instantiation.domain.objects.PatientICPActionStatus list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientICPActionStatusList(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPActionStatusVoCollection voCollection) 
	 {
	 	return extractPatientICPActionStatusList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientICPActionStatusList(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPActionStatusVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.icp.vo.PatientICPActionStatusVo vo = voCollection.get(i);
			ims.icps.instantiation.domain.objects.PatientICPActionStatus domainObject = PatientICPActionStatusVoAssembler.extractPatientICPActionStatus(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.icps.instantiation.domain.objects.PatientICPActionStatus object.
	 * @param domainObject ims.icps.instantiation.domain.objects.PatientICPActionStatus
	 */
	 public static ims.icp.vo.PatientICPActionStatusVo create(ims.icps.instantiation.domain.objects.PatientICPActionStatus domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.icps.instantiation.domain.objects.PatientICPActionStatus object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.icp.vo.PatientICPActionStatusVo create(DomainObjectMap map, ims.icps.instantiation.domain.objects.PatientICPActionStatus domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.icp.vo.PatientICPActionStatusVo valueObject = (ims.icp.vo.PatientICPActionStatusVo) map.getValueObject(domainObject, ims.icp.vo.PatientICPActionStatusVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.icp.vo.PatientICPActionStatusVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.icps.instantiation.domain.objects.PatientICPActionStatus
	 */
	 public static ims.icp.vo.PatientICPActionStatusVo insert(ims.icp.vo.PatientICPActionStatusVo valueObject, ims.icps.instantiation.domain.objects.PatientICPActionStatus domainObject) 
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
	 * @param domainObject ims.icps.instantiation.domain.objects.PatientICPActionStatus
	 */
	 public static ims.icp.vo.PatientICPActionStatusVo insert(DomainObjectMap map, ims.icp.vo.PatientICPActionStatusVo valueObject, ims.icps.instantiation.domain.objects.PatientICPActionStatus domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientICPActionStatus(domainObject.getId());
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
			
		// StatusDate
		java.util.Date StatusDate = domainObject.getStatusDate();
		if ( null != StatusDate ) 
		{
			valueObject.setStatusDate(new ims.framework.utils.DateTime(StatusDate) );
		}
		// ChangedBy
		valueObject.setChangedBy(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getChangedBy()) );
		// Status
		ims.domain.lookups.LookupInstance instance3 = domainObject.getStatus();
		if ( null != instance3 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance3.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance3.getImage().getImageId(), instance3.getImage().getImagePath());
			}
			color = instance3.getColor();
			if (color != null) 
				color.getValue();

			ims.icp.vo.lookups.ICPActionStatus voLookup3 = new ims.icp.vo.lookups.ICPActionStatus(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.icp.vo.lookups.ICPActionStatus parentVoLookup3 = voLookup3;
			ims.domain.lookups.LookupInstance parent3 = instance3.getParent();
			while (parent3 != null)
			{
				if (parent3.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent3.getImage().getImageId(), parent3.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent3.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup3.setParent(new ims.icp.vo.lookups.ICPActionStatus(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setStatus(voLookup3);
		}
				// VarianceCategory
		ims.domain.lookups.LookupInstance instance4 = domainObject.getVarianceCategory();
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

			ims.icp.vo.lookups.ICPVarianceType voLookup4 = new ims.icp.vo.lookups.ICPVarianceType(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.icp.vo.lookups.ICPVarianceType parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.icp.vo.lookups.ICPVarianceType(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setVarianceCategory(voLookup4);
		}
				// VarianceType
		ims.domain.lookups.LookupInstance instance5 = domainObject.getVarianceType();
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

			ims.icp.vo.lookups.ICPVarianceType voLookup5 = new ims.icp.vo.lookups.ICPVarianceType(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.icp.vo.lookups.ICPVarianceType parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.icp.vo.lookups.ICPVarianceType(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setVarianceType(voLookup5);
		}
				// VarianceComment
		valueObject.setVarianceComment(domainObject.getVarianceComment());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.icps.instantiation.domain.objects.PatientICPActionStatus extractPatientICPActionStatus(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPActionStatusVo valueObject) 
	{
		return 	extractPatientICPActionStatus(domainFactory, valueObject, new HashMap());
	}

	public static ims.icps.instantiation.domain.objects.PatientICPActionStatus extractPatientICPActionStatus(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPActionStatusVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientICPActionStatus();
		ims.icps.instantiation.domain.objects.PatientICPActionStatus domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.icps.instantiation.domain.objects.PatientICPActionStatus)domMap.get(valueObject);
			}
			// ims.icp.vo.PatientICPActionStatusVo ID_PatientICPActionStatus field is unknown
			domainObject = new ims.icps.instantiation.domain.objects.PatientICPActionStatus();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientICPActionStatus());
			if (domMap.get(key) != null)
			{
				return (ims.icps.instantiation.domain.objects.PatientICPActionStatus)domMap.get(key);
			}
			domainObject = (ims.icps.instantiation.domain.objects.PatientICPActionStatus) domainFactory.getDomainObject(ims.icps.instantiation.domain.objects.PatientICPActionStatus.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientICPActionStatus());

		ims.framework.utils.DateTime dateTime1 = valueObject.getStatusDate();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setStatusDate(value1);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value2 = null;
		if ( null != valueObject.getChangedBy() ) 
		{
			if (valueObject.getChangedBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getChangedBy()) != null)
				{
					value2 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getChangedBy());
				}
			}
			else
			{
				value2 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getChangedBy().getBoId());
			}
		}
		domainObject.setChangedBy(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getVarianceCategory() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getVarianceCategory().getID());
		}
		domainObject.setVarianceCategory(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getVarianceType() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getVarianceType().getID());
		}
		domainObject.setVarianceType(value5);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getVarianceComment() != null && valueObject.getVarianceComment().equals(""))
		{
			valueObject.setVarianceComment(null);
		}
		domainObject.setVarianceComment(valueObject.getVarianceComment());

		return domainObject;
	}

}
