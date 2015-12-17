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
 * @author George Cristian Josan
 */
public class ICPFullVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.icp.vo.ICPFullVo copy(ims.icp.vo.ICPFullVo valueObjectDest, ims.icp.vo.ICPFullVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ICP(valueObjectSrc.getID_ICP());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// HelpURL
		valueObjectDest.setHelpURL(valueObjectSrc.getHelpURL());
		// Category
		valueObjectDest.setCategory(valueObjectSrc.getCategory());
		// Type
		valueObjectDest.setType(valueObjectSrc.getType());
		// Specialty
		valueObjectDest.setSpecialty(valueObjectSrc.getSpecialty());
		// CreationDate
		valueObjectDest.setCreationDate(valueObjectSrc.getCreationDate());
		// ContactPerson
		valueObjectDest.setContactPerson(valueObjectSrc.getContactPerson());
		// Diagnosis
		valueObjectDest.setDiagnosis(valueObjectSrc.getDiagnosis());
		// Procedures
		valueObjectDest.setProcedures(valueObjectSrc.getProcedures());
		// Stages
		valueObjectDest.setStages(valueObjectSrc.getStages());
		// Problem
		valueObjectDest.setProblem(valueObjectSrc.getProblem());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// Description
		valueObjectDest.setDescription(valueObjectSrc.getDescription());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createICPFullVoCollectionFromICP(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.icps.configuration.domain.objects.ICP objects.
	 */
	public static ims.icp.vo.ICPFullVoCollection createICPFullVoCollectionFromICP(java.util.Set domainObjectSet)	
	{
		return createICPFullVoCollectionFromICP(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.icps.configuration.domain.objects.ICP objects.
	 */
	public static ims.icp.vo.ICPFullVoCollection createICPFullVoCollectionFromICP(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.icp.vo.ICPFullVoCollection voList = new ims.icp.vo.ICPFullVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.icps.configuration.domain.objects.ICP domainObject = (ims.icps.configuration.domain.objects.ICP) iterator.next();
			ims.icp.vo.ICPFullVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.icps.configuration.domain.objects.ICP objects.
	 */
	public static ims.icp.vo.ICPFullVoCollection createICPFullVoCollectionFromICP(java.util.List domainObjectList) 
	{
		return createICPFullVoCollectionFromICP(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.icps.configuration.domain.objects.ICP objects.
	 */
	public static ims.icp.vo.ICPFullVoCollection createICPFullVoCollectionFromICP(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.icp.vo.ICPFullVoCollection voList = new ims.icp.vo.ICPFullVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.icps.configuration.domain.objects.ICP domainObject = (ims.icps.configuration.domain.objects.ICP) domainObjectList.get(i);
			ims.icp.vo.ICPFullVo vo = create(map, domainObject);

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
	 * Create the ims.icps.configuration.domain.objects.ICP set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractICPSet(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.ICPFullVoCollection voCollection) 
	 {
	 	return extractICPSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractICPSet(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.ICPFullVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.icp.vo.ICPFullVo vo = voCollection.get(i);
			ims.icps.configuration.domain.objects.ICP domainObject = ICPFullVoAssembler.extractICP(domainFactory, vo, domMap);

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
	 * Create the ims.icps.configuration.domain.objects.ICP list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractICPList(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.ICPFullVoCollection voCollection) 
	 {
	 	return extractICPList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractICPList(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.ICPFullVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.icp.vo.ICPFullVo vo = voCollection.get(i);
			ims.icps.configuration.domain.objects.ICP domainObject = ICPFullVoAssembler.extractICP(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.icps.configuration.domain.objects.ICP object.
	 * @param domainObject ims.icps.configuration.domain.objects.ICP
	 */
	 public static ims.icp.vo.ICPFullVo create(ims.icps.configuration.domain.objects.ICP domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.icps.configuration.domain.objects.ICP object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.icp.vo.ICPFullVo create(DomainObjectMap map, ims.icps.configuration.domain.objects.ICP domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.icp.vo.ICPFullVo valueObject = (ims.icp.vo.ICPFullVo) map.getValueObject(domainObject, ims.icp.vo.ICPFullVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.icp.vo.ICPFullVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.icps.configuration.domain.objects.ICP
	 */
	 public static ims.icp.vo.ICPFullVo insert(ims.icp.vo.ICPFullVo valueObject, ims.icps.configuration.domain.objects.ICP domainObject) 
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
	 * @param domainObject ims.icps.configuration.domain.objects.ICP
	 */
	 public static ims.icp.vo.ICPFullVo insert(DomainObjectMap map, ims.icp.vo.ICPFullVo valueObject, ims.icps.configuration.domain.objects.ICP domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ICP(domainObject.getId());
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
			
		// HelpURL
		valueObject.setHelpURL(domainObject.getHelpURL());
		// Category
		ims.domain.lookups.LookupInstance instance2 = domainObject.getCategory();
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

			ims.core.vo.lookups.ICPCategoryType voLookup2 = new ims.core.vo.lookups.ICPCategoryType(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.ICPCategoryType parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.ICPCategoryType(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setCategory(voLookup2);
		}
				// Type
		ims.domain.lookups.LookupInstance instance3 = domainObject.getType();
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

			ims.core.vo.lookups.ICPCategoryType voLookup3 = new ims.core.vo.lookups.ICPCategoryType(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.ICPCategoryType parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.ICPCategoryType(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setType(voLookup3);
		}
				// Specialty
		ims.domain.lookups.LookupInstance instance4 = domainObject.getSpecialty();
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

			ims.core.vo.lookups.Specialty voLookup4 = new ims.core.vo.lookups.Specialty(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.Specialty(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setSpecialty(voLookup4);
		}
				// CreationDate
		java.util.Date CreationDate = domainObject.getCreationDate();
		if ( null != CreationDate ) 
		{
			valueObject.setCreationDate(new ims.framework.utils.Date(CreationDate) );
		}
		// ContactPerson
		valueObject.setContactPerson(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getContactPerson()) );
		// Diagnosis
		valueObject.setDiagnosis(ims.core.vo.domain.DiagLiteVoAssembler.create(map, domainObject.getDiagnosis()) );
		// Procedures
		valueObject.setProcedures(ims.core.vo.domain.ProcedureLiteVoAssembler.createProcedureLiteVoCollectionFromProcedure(map, domainObject.getProcedures()) );
		// Stages
		valueObject.setStages(ims.icp.vo.domain.ICPStageFullVoAssembler.createICPStageFullVoCollectionFromICPStage(map, domainObject.getStages()) );
		// Problem
		valueObject.setProblem(ims.clinical.vo.domain.ClinicalProblemShortVoAssembler.create(map, domainObject.getProblem()) );
		// Name
		valueObject.setName(domainObject.getName());
		// Description
		valueObject.setDescription(domainObject.getDescription());
		// Status
		ims.domain.lookups.LookupInstance instance13 = domainObject.getStatus();
		if ( null != instance13 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance13.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance13.getImage().getImageId(), instance13.getImage().getImagePath());
			}
			color = instance13.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup13 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup13 = voLookup13;
			ims.domain.lookups.LookupInstance parent13 = instance13.getParent();
			while (parent13 != null)
			{
				if (parent13.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent13.getImage().getImageId(), parent13.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent13.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup13.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setStatus(voLookup13);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.icps.configuration.domain.objects.ICP extractICP(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.ICPFullVo valueObject) 
	{
		return 	extractICP(domainFactory, valueObject, new HashMap());
	}

	public static ims.icps.configuration.domain.objects.ICP extractICP(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.ICPFullVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ICP();
		ims.icps.configuration.domain.objects.ICP domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.icps.configuration.domain.objects.ICP)domMap.get(valueObject);
			}
			// ims.icp.vo.ICPFullVo ID_ICP field is unknown
			domainObject = new ims.icps.configuration.domain.objects.ICP();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ICP());
			if (domMap.get(key) != null)
			{
				return (ims.icps.configuration.domain.objects.ICP)domMap.get(key);
			}
			domainObject = (ims.icps.configuration.domain.objects.ICP) domainFactory.getDomainObject(ims.icps.configuration.domain.objects.ICP.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ICP());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getHelpURL() != null && valueObject.getHelpURL().equals(""))
		{
			valueObject.setHelpURL(null);
		}
		domainObject.setHelpURL(valueObject.getHelpURL());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getCategory() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getCategory().getID());
		}
		domainObject.setCategory(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getType() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getType().getID());
		}
		domainObject.setType(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value4);
		java.util.Date value5 = null;
		ims.framework.utils.Date date5 = valueObject.getCreationDate();		
		if ( date5 != null ) 
		{
			value5 = date5.getDate();
		}
		domainObject.setCreationDate(value5);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value6 = null;
		if ( null != valueObject.getContactPerson() ) 
		{
			if (valueObject.getContactPerson().getBoId() == null)
			{
				if (domMap.get(valueObject.getContactPerson()) != null)
				{
					value6 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getContactPerson());
				}
			}
			else
			{
				value6 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getContactPerson().getBoId());
			}
		}
		domainObject.setContactPerson(value6);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Diagnosis value7 = null;
		if ( null != valueObject.getDiagnosis() ) 
		{
			if (valueObject.getDiagnosis().getBoId() == null)
			{
				if (domMap.get(valueObject.getDiagnosis()) != null)
				{
					value7 = (ims.core.clinical.domain.objects.Diagnosis)domMap.get(valueObject.getDiagnosis());
				}
			}
			else
			{
				value7 = (ims.core.clinical.domain.objects.Diagnosis)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Diagnosis.class, valueObject.getDiagnosis().getBoId());
			}
		}
		domainObject.setDiagnosis(value7);

		// SaveAsRefVO treated as RefValueObject
		ims.core.clinical.vo.ProcedureRefVoCollection refCollection8 = new ims.core.clinical.vo.ProcedureRefVoCollection();
		if (valueObject.getProcedures() != null)
		{
			for (int i8=0; i8<valueObject.getProcedures().size(); i8++)
			{
				ims.core.clinical.vo.ProcedureRefVo ref8 = (ims.core.clinical.vo.ProcedureRefVo)valueObject.getProcedures().get(i8);
				refCollection8.add(ref8);
			}
		}
		int size8 = (null == refCollection8) ? 0 : refCollection8.size();		
		java.util.Set domainProcedures8 = domainObject.getProcedures();
		if (domainProcedures8 == null)
		{
			domainProcedures8 = new java.util.HashSet();
		}
		java.util.Set newSet8  = new java.util.HashSet();
		for(int i=0; i<size8; i++) 
		{
			ims.core.clinical.vo.ProcedureRefVo vo = refCollection8.get(i);					
			ims.core.clinical.domain.objects.Procedure dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.clinical.domain.objects.Procedure)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.clinical.domain.objects.Procedure)domainFactory.getDomainObject( ims.core.clinical.domain.objects.Procedure.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainProcedures8.contains(dom))
			{
				domainProcedures8.add(dom);
			}
			newSet8.add(dom);			
		}
		java.util.Set removedSet8 = new java.util.HashSet();
		java.util.Iterator iter8 = domainProcedures8.iterator();
		//Find out which objects need to be removed
		while (iter8.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter8.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet8.contains(o))
			{
				removedSet8.add(o);
			}
		}
		iter8 = removedSet8.iterator();
		//Remove the unwanted objects
		while (iter8.hasNext())
		{
			domainProcedures8.remove(iter8.next());
		}		
		
		domainObject.setProcedures(domainProcedures8);		
		domainObject.setStages(ims.icp.vo.domain.ICPStageFullVoAssembler.extractICPStageList(domainFactory, valueObject.getStages(), domainObject.getStages(), domMap));		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.clinical.configuration.domain.objects.ClinicalProblem value10 = null;
		if ( null != valueObject.getProblem() ) 
		{
			if (valueObject.getProblem().getBoId() == null)
			{
				if (domMap.get(valueObject.getProblem()) != null)
				{
					value10 = (ims.clinical.configuration.domain.objects.ClinicalProblem)domMap.get(valueObject.getProblem());
				}
			}
			else
			{
				value10 = (ims.clinical.configuration.domain.objects.ClinicalProblem)domainFactory.getDomainObject(ims.clinical.configuration.domain.objects.ClinicalProblem.class, valueObject.getProblem().getBoId());
			}
		}
		domainObject.setProblem(value10);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDescription() != null && valueObject.getDescription().equals(""))
		{
			valueObject.setDescription(null);
		}
		domainObject.setDescription(valueObject.getDescription());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value13);

		return domainObject;
	}

}
