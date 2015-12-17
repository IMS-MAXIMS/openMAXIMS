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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author George Cristian Josan
 */
public class PendingEmergencyNonEDAdmissionListVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PendingEmergencyNonEDAdmissionListVo copy(ims.core.vo.PendingEmergencyNonEDAdmissionListVo valueObjectDest, ims.core.vo.PendingEmergencyNonEDAdmissionListVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PendingNoEDEmergencyAdmit(valueObjectSrc.getID_PendingNoEDEmergencyAdmit());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Type
		valueObjectDest.setType(valueObjectSrc.getType());
		// Category
		valueObjectDest.setCategory(valueObjectSrc.getCategory());
		// Service
		valueObjectDest.setService(valueObjectSrc.getService());
		// Hospital
		valueObjectDest.setHospital(valueObjectSrc.getHospital());
		// Ward
		valueObjectDest.setWard(valueObjectSrc.getWard());
		// SourceOfReferral
		valueObjectDest.setSourceOfReferral(valueObjectSrc.getSourceOfReferral());
		// SourceOfEmergencyReferral
		valueObjectDest.setSourceOfEmergencyReferral(valueObjectSrc.getSourceOfEmergencyReferral());
		// AdmissionDetail
		valueObjectDest.setAdmissionDetail(valueObjectSrc.getAdmissionDetail());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPendingEmergencyNonEDAdmissionListVoCollectionFromPendingNoEDEmergencyAdmit(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit objects.
	 */
	public static ims.core.vo.PendingEmergencyNonEDAdmissionListVoCollection createPendingEmergencyNonEDAdmissionListVoCollectionFromPendingNoEDEmergencyAdmit(java.util.Set domainObjectSet)	
	{
		return createPendingEmergencyNonEDAdmissionListVoCollectionFromPendingNoEDEmergencyAdmit(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit objects.
	 */
	public static ims.core.vo.PendingEmergencyNonEDAdmissionListVoCollection createPendingEmergencyNonEDAdmissionListVoCollectionFromPendingNoEDEmergencyAdmit(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PendingEmergencyNonEDAdmissionListVoCollection voList = new ims.core.vo.PendingEmergencyNonEDAdmissionListVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit domainObject = (ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit) iterator.next();
			ims.core.vo.PendingEmergencyNonEDAdmissionListVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit objects.
	 */
	public static ims.core.vo.PendingEmergencyNonEDAdmissionListVoCollection createPendingEmergencyNonEDAdmissionListVoCollectionFromPendingNoEDEmergencyAdmit(java.util.List domainObjectList) 
	{
		return createPendingEmergencyNonEDAdmissionListVoCollectionFromPendingNoEDEmergencyAdmit(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit objects.
	 */
	public static ims.core.vo.PendingEmergencyNonEDAdmissionListVoCollection createPendingEmergencyNonEDAdmissionListVoCollectionFromPendingNoEDEmergencyAdmit(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PendingEmergencyNonEDAdmissionListVoCollection voList = new ims.core.vo.PendingEmergencyNonEDAdmissionListVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit domainObject = (ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit) domainObjectList.get(i);
			ims.core.vo.PendingEmergencyNonEDAdmissionListVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPendingNoEDEmergencyAdmitSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PendingEmergencyNonEDAdmissionListVoCollection voCollection) 
	 {
	 	return extractPendingNoEDEmergencyAdmitSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPendingNoEDEmergencyAdmitSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PendingEmergencyNonEDAdmissionListVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PendingEmergencyNonEDAdmissionListVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit domainObject = PendingEmergencyNonEDAdmissionListVoAssembler.extractPendingNoEDEmergencyAdmit(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPendingNoEDEmergencyAdmitList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PendingEmergencyNonEDAdmissionListVoCollection voCollection) 
	 {
	 	return extractPendingNoEDEmergencyAdmitList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPendingNoEDEmergencyAdmitList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PendingEmergencyNonEDAdmissionListVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PendingEmergencyNonEDAdmissionListVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit domainObject = PendingEmergencyNonEDAdmissionListVoAssembler.extractPendingNoEDEmergencyAdmit(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit object.
	 * @param domainObject ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit
	 */
	 public static ims.core.vo.PendingEmergencyNonEDAdmissionListVo create(ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PendingEmergencyNonEDAdmissionListVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PendingEmergencyNonEDAdmissionListVo valueObject = (ims.core.vo.PendingEmergencyNonEDAdmissionListVo) map.getValueObject(domainObject, ims.core.vo.PendingEmergencyNonEDAdmissionListVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PendingEmergencyNonEDAdmissionListVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit
	 */
	 public static ims.core.vo.PendingEmergencyNonEDAdmissionListVo insert(ims.core.vo.PendingEmergencyNonEDAdmissionListVo valueObject, ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit domainObject) 
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
	 * @param domainObject ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit
	 */
	 public static ims.core.vo.PendingEmergencyNonEDAdmissionListVo insert(DomainObjectMap map, ims.core.vo.PendingEmergencyNonEDAdmissionListVo valueObject, ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PendingNoEDEmergencyAdmit(domainObject.getId());
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
			
		// Type
		ims.domain.lookups.LookupInstance instance1 = domainObject.getType();
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

			ims.core.vo.lookups.PendingEmergencyAdmissionType voLookup1 = new ims.core.vo.lookups.PendingEmergencyAdmissionType(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.PendingEmergencyAdmissionType parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.core.vo.lookups.PendingEmergencyAdmissionType(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setType(voLookup1);
		}
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

			ims.core.vo.lookups.PatientStatus voLookup2 = new ims.core.vo.lookups.PatientStatus(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.PatientStatus parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.PatientStatus(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setCategory(voLookup2);
		}
				// Service
		valueObject.setService(ims.core.vo.domain.ServiceLiteVoAssembler.create(map, domainObject.getService()) );
		// Hospital
		valueObject.setHospital(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getHospital()) );
		// Ward
		valueObject.setWard(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getWard()) );
		// SourceOfReferral
		ims.domain.lookups.LookupInstance instance6 = domainObject.getSourceOfReferral();
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

			ims.core.vo.lookups.SourceOfReferral voLookup6 = new ims.core.vo.lookups.SourceOfReferral(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.SourceOfReferral parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.SourceOfReferral(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setSourceOfReferral(voLookup6);
		}
				// SourceOfEmergencyReferral
		ims.domain.lookups.LookupInstance instance7 = domainObject.getSourceOfEmergencyReferral();
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

			ims.core.vo.lookups.SourceOfEmergencyReferral voLookup7 = new ims.core.vo.lookups.SourceOfEmergencyReferral(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.SourceOfEmergencyReferral parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.core.vo.lookups.SourceOfEmergencyReferral(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setSourceOfEmergencyReferral(voLookup7);
		}
				// AdmissionDetail
		if (domainObject.getAdmissionDetail() != null)
		{
			if(domainObject.getAdmissionDetail() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAdmissionDetail();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAdmissionDetail(new ims.core.admin.pas.vo.AdmissionDetailRefVo(id, -1));				
			}
			else
			{
				valueObject.setAdmissionDetail(new ims.core.admin.pas.vo.AdmissionDetailRefVo(domainObject.getAdmissionDetail().getId(), domainObject.getAdmissionDetail().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit extractPendingNoEDEmergencyAdmit(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PendingEmergencyNonEDAdmissionListVo valueObject) 
	{
		return 	extractPendingNoEDEmergencyAdmit(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit extractPendingNoEDEmergencyAdmit(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PendingEmergencyNonEDAdmissionListVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PendingNoEDEmergencyAdmit();
		ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit)domMap.get(valueObject);
			}
			// ims.core.vo.PendingEmergencyNonEDAdmissionListVo ID_PendingNoEDEmergencyAdmit field is unknown
			domainObject = new ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PendingNoEDEmergencyAdmit());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit)domMap.get(key);
			}
			domainObject = (ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit) domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PendingNoEDEmergencyAdmit());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getType() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getType().getID());
		}
		domainObject.setType(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getCategory() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getCategory().getID());
		}
		domainObject.setCategory(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Service value3 = null;
		if ( null != valueObject.getService() ) 
		{
			if (valueObject.getService().getBoId() == null)
			{
				if (domMap.get(valueObject.getService()) != null)
				{
					value3 = (ims.core.clinical.domain.objects.Service)domMap.get(valueObject.getService());
				}
			}
			else
			{
				value3 = (ims.core.clinical.domain.objects.Service)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Service.class, valueObject.getService().getBoId());
			}
		}
		domainObject.setService(value3);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value4 = null;
		if ( null != valueObject.getHospital() ) 
		{
			if (valueObject.getHospital().getBoId() == null)
			{
				if (domMap.get(valueObject.getHospital()) != null)
				{
					value4 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getHospital());
				}
			}
			else
			{
				value4 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getHospital().getBoId());
			}
		}
		domainObject.setHospital(value4);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value5 = null;
		if ( null != valueObject.getWard() ) 
		{
			if (valueObject.getWard().getBoId() == null)
			{
				if (domMap.get(valueObject.getWard()) != null)
				{
					value5 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getWard());
				}
			}
			else
			{
				value5 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getWard().getBoId());
			}
		}
		domainObject.setWard(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getSourceOfReferral() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getSourceOfReferral().getID());
		}
		domainObject.setSourceOfReferral(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getSourceOfEmergencyReferral() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getSourceOfEmergencyReferral().getID());
		}
		domainObject.setSourceOfEmergencyReferral(value7);
		ims.core.admin.pas.domain.objects.AdmissionDetail value8 = null;
		if ( null != valueObject.getAdmissionDetail() ) 
		{
			if (valueObject.getAdmissionDetail().getBoId() == null)
			{
				if (domMap.get(valueObject.getAdmissionDetail()) != null)
				{
					value8 = (ims.core.admin.pas.domain.objects.AdmissionDetail)domMap.get(valueObject.getAdmissionDetail());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value8 = domainObject.getAdmissionDetail();	
			}
			else
			{
				value8 = (ims.core.admin.pas.domain.objects.AdmissionDetail)domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.AdmissionDetail.class, valueObject.getAdmissionDetail().getBoId());
			}
		}
		domainObject.setAdmissionDetail(value8);

		return domainObject;
	}

}
