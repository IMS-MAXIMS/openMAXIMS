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
 * @author Gabriel Maxim
 */
public class WardMixedSexBreachVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.WardMixedSexBreachVo copy(ims.core.vo.WardMixedSexBreachVo valueObjectDest, ims.core.vo.WardMixedSexBreachVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_WardMixedSexBreach(valueObjectSrc.getID_WardMixedSexBreach());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Ward
		valueObjectDest.setWard(valueObjectSrc.getWard());
		// Bay
		valueObjectDest.setBay(valueObjectSrc.getBay());
		// AdmissionDateTime
		valueObjectDest.setAdmissionDateTime(valueObjectSrc.getAdmissionDateTime());
		// MemberOfStaff
		valueObjectDest.setMemberOfStaff(valueObjectSrc.getMemberOfStaff());
		// MalePatients
		valueObjectDest.setMalePatients(valueObjectSrc.getMalePatients());
		// FemalePatients
		valueObjectDest.setFemalePatients(valueObjectSrc.getFemalePatients());
		// ReasonForGenderBreach
		valueObjectDest.setReasonForGenderBreach(valueObjectSrc.getReasonForGenderBreach());
		// ReasonForGenderBreachComment
		valueObjectDest.setReasonForGenderBreachComment(valueObjectSrc.getReasonForGenderBreachComment());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createWardMixedSexBreachVoCollectionFromWardMixedSexBreach(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.WardMixedSexBreach objects.
	 */
	public static ims.core.vo.WardMixedSexBreachVoCollection createWardMixedSexBreachVoCollectionFromWardMixedSexBreach(java.util.Set domainObjectSet)	
	{
		return createWardMixedSexBreachVoCollectionFromWardMixedSexBreach(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.WardMixedSexBreach objects.
	 */
	public static ims.core.vo.WardMixedSexBreachVoCollection createWardMixedSexBreachVoCollectionFromWardMixedSexBreach(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.WardMixedSexBreachVoCollection voList = new ims.core.vo.WardMixedSexBreachVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.pas.domain.objects.WardMixedSexBreach domainObject = (ims.core.admin.pas.domain.objects.WardMixedSexBreach) iterator.next();
			ims.core.vo.WardMixedSexBreachVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.WardMixedSexBreach objects.
	 */
	public static ims.core.vo.WardMixedSexBreachVoCollection createWardMixedSexBreachVoCollectionFromWardMixedSexBreach(java.util.List domainObjectList) 
	{
		return createWardMixedSexBreachVoCollectionFromWardMixedSexBreach(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.WardMixedSexBreach objects.
	 */
	public static ims.core.vo.WardMixedSexBreachVoCollection createWardMixedSexBreachVoCollectionFromWardMixedSexBreach(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.WardMixedSexBreachVoCollection voList = new ims.core.vo.WardMixedSexBreachVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.WardMixedSexBreach domainObject = (ims.core.admin.pas.domain.objects.WardMixedSexBreach) domainObjectList.get(i);
			ims.core.vo.WardMixedSexBreachVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.pas.domain.objects.WardMixedSexBreach set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractWardMixedSexBreachSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.WardMixedSexBreachVoCollection voCollection) 
	 {
	 	return extractWardMixedSexBreachSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractWardMixedSexBreachSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.WardMixedSexBreachVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.WardMixedSexBreachVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.WardMixedSexBreach domainObject = WardMixedSexBreachVoAssembler.extractWardMixedSexBreach(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.pas.domain.objects.WardMixedSexBreach list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractWardMixedSexBreachList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.WardMixedSexBreachVoCollection voCollection) 
	 {
	 	return extractWardMixedSexBreachList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractWardMixedSexBreachList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.WardMixedSexBreachVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.WardMixedSexBreachVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.WardMixedSexBreach domainObject = WardMixedSexBreachVoAssembler.extractWardMixedSexBreach(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.pas.domain.objects.WardMixedSexBreach object.
	 * @param domainObject ims.core.admin.pas.domain.objects.WardMixedSexBreach
	 */
	 public static ims.core.vo.WardMixedSexBreachVo create(ims.core.admin.pas.domain.objects.WardMixedSexBreach domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.pas.domain.objects.WardMixedSexBreach object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.WardMixedSexBreachVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.WardMixedSexBreach domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.WardMixedSexBreachVo valueObject = (ims.core.vo.WardMixedSexBreachVo) map.getValueObject(domainObject, ims.core.vo.WardMixedSexBreachVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.WardMixedSexBreachVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.pas.domain.objects.WardMixedSexBreach
	 */
	 public static ims.core.vo.WardMixedSexBreachVo insert(ims.core.vo.WardMixedSexBreachVo valueObject, ims.core.admin.pas.domain.objects.WardMixedSexBreach domainObject) 
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
	 * @param domainObject ims.core.admin.pas.domain.objects.WardMixedSexBreach
	 */
	 public static ims.core.vo.WardMixedSexBreachVo insert(DomainObjectMap map, ims.core.vo.WardMixedSexBreachVo valueObject, ims.core.admin.pas.domain.objects.WardMixedSexBreach domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_WardMixedSexBreach(domainObject.getId());
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
			
		// Ward
		if (domainObject.getWard() != null)
		{
			if(domainObject.getWard() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getWard();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setWard(new ims.core.resource.place.vo.LocationRefVo(id, -1));				
			}
			else
			{
				valueObject.setWard(new ims.core.resource.place.vo.LocationRefVo(domainObject.getWard().getId(), domainObject.getWard().getVersion()));
			}
		}
		// Bay
		if (domainObject.getBay() != null)
		{
			if(domainObject.getBay() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getBay();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setBay(new ims.core.resource.place.vo.LocationRefVo(id, -1));				
			}
			else
			{
				valueObject.setBay(new ims.core.resource.place.vo.LocationRefVo(domainObject.getBay().getId(), domainObject.getBay().getVersion()));
			}
		}
		// AdmissionDateTime
		java.util.Date AdmissionDateTime = domainObject.getAdmissionDateTime();
		if ( null != AdmissionDateTime ) 
		{
			valueObject.setAdmissionDateTime(new ims.framework.utils.DateTime(AdmissionDateTime) );
		}
		// MemberOfStaff
		valueObject.setMemberOfStaff(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getMemberOfStaff()) );
		// MalePatients
		valueObject.setMalePatients(domainObject.getMalePatients());
		// FemalePatients
		valueObject.setFemalePatients(domainObject.getFemalePatients());
		// ReasonForGenderBreach
		ims.domain.lookups.LookupInstance instance7 = domainObject.getReasonForGenderBreach();
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

			ims.core.vo.lookups.ReasonForAdmissionToGenderSpecificBay voLookup7 = new ims.core.vo.lookups.ReasonForAdmissionToGenderSpecificBay(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.ReasonForAdmissionToGenderSpecificBay parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.core.vo.lookups.ReasonForAdmissionToGenderSpecificBay(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setReasonForGenderBreach(voLookup7);
		}
				// ReasonForGenderBreachComment
		valueObject.setReasonForGenderBreachComment(domainObject.getReasonForGenderBreachComment());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.pas.domain.objects.WardMixedSexBreach extractWardMixedSexBreach(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.WardMixedSexBreachVo valueObject) 
	{
		return 	extractWardMixedSexBreach(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.WardMixedSexBreach extractWardMixedSexBreach(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.WardMixedSexBreachVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_WardMixedSexBreach();
		ims.core.admin.pas.domain.objects.WardMixedSexBreach domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.pas.domain.objects.WardMixedSexBreach)domMap.get(valueObject);
			}
			// ims.core.vo.WardMixedSexBreachVo ID_WardMixedSexBreach field is unknown
			domainObject = new ims.core.admin.pas.domain.objects.WardMixedSexBreach();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_WardMixedSexBreach());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.pas.domain.objects.WardMixedSexBreach)domMap.get(key);
			}
			domainObject = (ims.core.admin.pas.domain.objects.WardMixedSexBreach) domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.WardMixedSexBreach.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_WardMixedSexBreach());

		ims.core.resource.place.domain.objects.Location value1 = null;
		if ( null != valueObject.getWard() ) 
		{
			if (valueObject.getWard().getBoId() == null)
			{
				if (domMap.get(valueObject.getWard()) != null)
				{
					value1 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getWard());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getWard();	
			}
			else
			{
				value1 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getWard().getBoId());
			}
		}
		domainObject.setWard(value1);
		ims.core.resource.place.domain.objects.Location value2 = null;
		if ( null != valueObject.getBay() ) 
		{
			if (valueObject.getBay().getBoId() == null)
			{
				if (domMap.get(valueObject.getBay()) != null)
				{
					value2 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getBay());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getBay();	
			}
			else
			{
				value2 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getBay().getBoId());
			}
		}
		domainObject.setBay(value2);
		ims.framework.utils.DateTime dateTime3 = valueObject.getAdmissionDateTime();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setAdmissionDateTime(value3);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value4 = null;
		if ( null != valueObject.getMemberOfStaff() ) 
		{
			if (valueObject.getMemberOfStaff().getBoId() == null)
			{
				if (domMap.get(valueObject.getMemberOfStaff()) != null)
				{
					value4 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getMemberOfStaff());
				}
			}
			else
			{
				value4 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getMemberOfStaff().getBoId());
			}
		}
		domainObject.setMemberOfStaff(value4);
		domainObject.setMalePatients(valueObject.getMalePatients());
		domainObject.setFemalePatients(valueObject.getFemalePatients());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getReasonForGenderBreach() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getReasonForGenderBreach().getID());
		}
		domainObject.setReasonForGenderBreach(value7);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReasonForGenderBreachComment() != null && valueObject.getReasonForGenderBreachComment().equals(""))
		{
			valueObject.setReasonForGenderBreachComment(null);
		}
		domainObject.setReasonForGenderBreachComment(valueObject.getReasonForGenderBreachComment());

		return domainObject;
	}

}
