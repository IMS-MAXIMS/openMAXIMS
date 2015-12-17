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
 * Generated on 12/10/2015, 13:24
 *
 */
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author John MacEnri
 */
public class ProcedureLiteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.ProcedureLiteVo copy(ims.core.vo.ProcedureLiteVo valueObjectDest, ims.core.vo.ProcedureLiteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Procedure(valueObjectSrc.getID_Procedure());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ProcedureName
		valueObjectDest.setProcedureName(valueObjectSrc.getProcedureName());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// procedureStatus
		valueObjectDest.setProcedureStatus(valueObjectSrc.getProcedureStatus());
		// DurationInMins
		valueObjectDest.setDurationInMins(valueObjectSrc.getDurationInMins());
		// TCILagTime
		valueObjectDest.setTCILagTime(valueObjectSrc.getTCILagTime());
		// LOS
		valueObjectDest.setLOS(valueObjectSrc.getLOS());
		// isLateralityApplicable
		valueObjectDest.setIsLateralityApplicable(valueObjectSrc.getIsLateralityApplicable());
		// isBilateralListingApplicable
		valueObjectDest.setIsBilateralListingApplicable(valueObjectSrc.getIsBilateralListingApplicable());
		// DefaultAnaestheticType
		valueObjectDest.setDefaultAnaestheticType(valueObjectSrc.getDefaultAnaestheticType());
		// GenderSpecific
		valueObjectDest.setGenderSpecific(valueObjectSrc.getGenderSpecific());
		// isEndoscopy
		valueObjectDest.setIsEndoscopy(valueObjectSrc.getIsEndoscopy());
		// EndoscopyType
		valueObjectDest.setEndoscopyType(valueObjectSrc.getEndoscopyType());
		// MedicalWL
		valueObjectDest.setMedicalWL(valueObjectSrc.getMedicalWL());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createProcedureLiteVoCollectionFromProcedure(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.Procedure objects.
	 */
	public static ims.core.vo.ProcedureLiteVoCollection createProcedureLiteVoCollectionFromProcedure(java.util.Set domainObjectSet)	
	{
		return createProcedureLiteVoCollectionFromProcedure(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.Procedure objects.
	 */
	public static ims.core.vo.ProcedureLiteVoCollection createProcedureLiteVoCollectionFromProcedure(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.ProcedureLiteVoCollection voList = new ims.core.vo.ProcedureLiteVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.Procedure domainObject = (ims.core.clinical.domain.objects.Procedure) iterator.next();
			ims.core.vo.ProcedureLiteVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.Procedure objects.
	 */
	public static ims.core.vo.ProcedureLiteVoCollection createProcedureLiteVoCollectionFromProcedure(java.util.List domainObjectList) 
	{
		return createProcedureLiteVoCollectionFromProcedure(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.Procedure objects.
	 */
	public static ims.core.vo.ProcedureLiteVoCollection createProcedureLiteVoCollectionFromProcedure(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.ProcedureLiteVoCollection voList = new ims.core.vo.ProcedureLiteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.Procedure domainObject = (ims.core.clinical.domain.objects.Procedure) domainObjectList.get(i);
			ims.core.vo.ProcedureLiteVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.Procedure set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractProcedureSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ProcedureLiteVoCollection voCollection) 
	 {
	 	return extractProcedureSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractProcedureSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ProcedureLiteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.ProcedureLiteVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.Procedure domainObject = ProcedureLiteVoAssembler.extractProcedure(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.Procedure list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractProcedureList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ProcedureLiteVoCollection voCollection) 
	 {
	 	return extractProcedureList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractProcedureList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ProcedureLiteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.ProcedureLiteVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.Procedure domainObject = ProcedureLiteVoAssembler.extractProcedure(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.Procedure object.
	 * @param domainObject ims.core.clinical.domain.objects.Procedure
	 */
	 public static ims.core.vo.ProcedureLiteVo create(ims.core.clinical.domain.objects.Procedure domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.Procedure object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.ProcedureLiteVo create(DomainObjectMap map, ims.core.clinical.domain.objects.Procedure domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.ProcedureLiteVo valueObject = (ims.core.vo.ProcedureLiteVo) map.getValueObject(domainObject, ims.core.vo.ProcedureLiteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.ProcedureLiteVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.Procedure
	 */
	 public static ims.core.vo.ProcedureLiteVo insert(ims.core.vo.ProcedureLiteVo valueObject, ims.core.clinical.domain.objects.Procedure domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.Procedure
	 */
	 public static ims.core.vo.ProcedureLiteVo insert(DomainObjectMap map, ims.core.vo.ProcedureLiteVo valueObject, ims.core.clinical.domain.objects.Procedure domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Procedure(domainObject.getId());
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
			
		// ProcedureName
		valueObject.setProcedureName(domainObject.getProcedureName());
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// procedureStatus
		ims.domain.lookups.LookupInstance instance3 = domainObject.getProcedureStatus();
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

			ims.core.vo.lookups.ProcedureStatus voLookup3 = new ims.core.vo.lookups.ProcedureStatus(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.ProcedureStatus parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.ProcedureStatus(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setProcedureStatus(voLookup3);
		}
				// DurationInMins
		valueObject.setDurationInMins(domainObject.getDurationInMins());
		// TCILagTime
		valueObject.setTCILagTime(domainObject.getTCILagTime());
		// LOS
		valueObject.setLOS(domainObject.getLOS());
		// isLateralityApplicable
		valueObject.setIsLateralityApplicable( domainObject.isIsLateralityApplicable() );
		// isBilateralListingApplicable
		valueObject.setIsBilateralListingApplicable( domainObject.isIsBilateralListingApplicable() );
		// DefaultAnaestheticType
		ims.domain.lookups.LookupInstance instance9 = domainObject.getDefaultAnaestheticType();
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

			ims.clinical.vo.lookups.AnaestheticType voLookup9 = new ims.clinical.vo.lookups.AnaestheticType(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.clinical.vo.lookups.AnaestheticType parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.clinical.vo.lookups.AnaestheticType(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setDefaultAnaestheticType(voLookup9);
		}
				// GenderSpecific
		ims.domain.lookups.LookupInstance instance10 = domainObject.getGenderSpecific();
		if ( null != instance10 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance10.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance10.getImage().getImageId(), instance10.getImage().getImagePath());
			}
			color = instance10.getColor();
			if (color != null) 
				color.getValue();

			ims.admin.vo.lookups.GenderSpecific voLookup10 = new ims.admin.vo.lookups.GenderSpecific(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.admin.vo.lookups.GenderSpecific parentVoLookup10 = voLookup10;
			ims.domain.lookups.LookupInstance parent10 = instance10.getParent();
			while (parent10 != null)
			{
				if (parent10.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent10.getImage().getImageId(), parent10.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent10.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup10.setParent(new ims.admin.vo.lookups.GenderSpecific(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setGenderSpecific(voLookup10);
		}
				// isEndoscopy
		valueObject.setIsEndoscopy( domainObject.isIsEndoscopy() );
		// EndoscopyType
		ims.domain.lookups.LookupInstance instance12 = domainObject.getEndoscopyType();
		if ( null != instance12 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance12.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance12.getImage().getImageId(), instance12.getImage().getImagePath());
			}
			color = instance12.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.ProcedureEndoscopyType voLookup12 = new ims.core.vo.lookups.ProcedureEndoscopyType(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.core.vo.lookups.ProcedureEndoscopyType parentVoLookup12 = voLookup12;
			ims.domain.lookups.LookupInstance parent12 = instance12.getParent();
			while (parent12 != null)
			{
				if (parent12.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent12.getImage().getImageId(), parent12.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent12.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup12.setParent(new ims.core.vo.lookups.ProcedureEndoscopyType(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setEndoscopyType(voLookup12);
		}
				// MedicalWL
		valueObject.setMedicalWL( domainObject.isMedicalWL() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.Procedure extractProcedure(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ProcedureLiteVo valueObject) 
	{
		return 	extractProcedure(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.Procedure extractProcedure(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ProcedureLiteVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Procedure();
		ims.core.clinical.domain.objects.Procedure domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.Procedure)domMap.get(valueObject);
			}
			// ims.core.vo.ProcedureLiteVo ID_Procedure field is unknown
			domainObject = new ims.core.clinical.domain.objects.Procedure();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Procedure());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.Procedure)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.Procedure) domainFactory.getDomainObject(ims.core.clinical.domain.objects.Procedure.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Procedure());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getProcedureName() != null && valueObject.getProcedureName().equals(""))
		{
			valueObject.setProcedureName(null);
		}
		domainObject.setProcedureName(valueObject.getProcedureName());
		domainObject.setIsActive(valueObject.getIsActive());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getProcedureStatus() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getProcedureStatus().getID());
		}
		domainObject.setProcedureStatus(value3);
		domainObject.setDurationInMins(valueObject.getDurationInMins());
		domainObject.setTCILagTime(valueObject.getTCILagTime());
		domainObject.setLOS(valueObject.getLOS());
		domainObject.setIsLateralityApplicable(valueObject.getIsLateralityApplicable());
		domainObject.setIsBilateralListingApplicable(valueObject.getIsBilateralListingApplicable());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getDefaultAnaestheticType() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getDefaultAnaestheticType().getID());
		}
		domainObject.setDefaultAnaestheticType(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getGenderSpecific() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getGenderSpecific().getID());
		}
		domainObject.setGenderSpecific(value10);
		domainObject.setIsEndoscopy(valueObject.getIsEndoscopy());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getEndoscopyType() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getEndoscopyType().getID());
		}
		domainObject.setEndoscopyType(value12);
		domainObject.setMedicalWL(valueObject.getMedicalWL());

		return domainObject;
	}

}
