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
public class PatientCaseNoteTransferListVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PatientCaseNoteTransferListVo copy(ims.core.vo.PatientCaseNoteTransferListVo valueObjectDest, ims.core.vo.PatientCaseNoteTransferListVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientCaseNoteTransfer(valueObjectSrc.getID_PatientCaseNoteTransfer());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TransferredFromLocation
		valueObjectDest.setTransferredFromLocation(valueObjectSrc.getTransferredFromLocation());
		// TransferredToLocation
		valueObjectDest.setTransferredToLocation(valueObjectSrc.getTransferredToLocation());
		// TransferredBy
		valueObjectDest.setTransferredBy(valueObjectSrc.getTransferredBy());
		// TransferDate
		valueObjectDest.setTransferDate(valueObjectSrc.getTransferDate());
		// ReasonForTransfer
		valueObjectDest.setReasonForTransfer(valueObjectSrc.getReasonForTransfer());
		// TansferComment
		valueObjectDest.setTansferComment(valueObjectSrc.getTansferComment());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientCaseNoteTransferListVoCollectionFromPatientCaseNoteTransfer(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientCaseNoteTransfer objects.
	 */
	public static ims.core.vo.PatientCaseNoteTransferListVoCollection createPatientCaseNoteTransferListVoCollectionFromPatientCaseNoteTransfer(java.util.Set domainObjectSet)	
	{
		return createPatientCaseNoteTransferListVoCollectionFromPatientCaseNoteTransfer(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientCaseNoteTransfer objects.
	 */
	public static ims.core.vo.PatientCaseNoteTransferListVoCollection createPatientCaseNoteTransferListVoCollectionFromPatientCaseNoteTransfer(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatientCaseNoteTransferListVoCollection voList = new ims.core.vo.PatientCaseNoteTransferListVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.PatientCaseNoteTransfer domainObject = (ims.core.clinical.domain.objects.PatientCaseNoteTransfer) iterator.next();
			ims.core.vo.PatientCaseNoteTransferListVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientCaseNoteTransfer objects.
	 */
	public static ims.core.vo.PatientCaseNoteTransferListVoCollection createPatientCaseNoteTransferListVoCollectionFromPatientCaseNoteTransfer(java.util.List domainObjectList) 
	{
		return createPatientCaseNoteTransferListVoCollectionFromPatientCaseNoteTransfer(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientCaseNoteTransfer objects.
	 */
	public static ims.core.vo.PatientCaseNoteTransferListVoCollection createPatientCaseNoteTransferListVoCollectionFromPatientCaseNoteTransfer(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatientCaseNoteTransferListVoCollection voList = new ims.core.vo.PatientCaseNoteTransferListVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.PatientCaseNoteTransfer domainObject = (ims.core.clinical.domain.objects.PatientCaseNoteTransfer) domainObjectList.get(i);
			ims.core.vo.PatientCaseNoteTransferListVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.PatientCaseNoteTransfer set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientCaseNoteTransferSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteTransferListVoCollection voCollection) 
	 {
	 	return extractPatientCaseNoteTransferSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientCaseNoteTransferSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteTransferListVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientCaseNoteTransferListVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientCaseNoteTransfer domainObject = PatientCaseNoteTransferListVoAssembler.extractPatientCaseNoteTransfer(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.PatientCaseNoteTransfer list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientCaseNoteTransferList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteTransferListVoCollection voCollection) 
	 {
	 	return extractPatientCaseNoteTransferList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientCaseNoteTransferList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteTransferListVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientCaseNoteTransferListVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientCaseNoteTransfer domainObject = PatientCaseNoteTransferListVoAssembler.extractPatientCaseNoteTransfer(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.PatientCaseNoteTransfer object.
	 * @param domainObject ims.core.clinical.domain.objects.PatientCaseNoteTransfer
	 */
	 public static ims.core.vo.PatientCaseNoteTransferListVo create(ims.core.clinical.domain.objects.PatientCaseNoteTransfer domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.PatientCaseNoteTransfer object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PatientCaseNoteTransferListVo create(DomainObjectMap map, ims.core.clinical.domain.objects.PatientCaseNoteTransfer domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PatientCaseNoteTransferListVo valueObject = (ims.core.vo.PatientCaseNoteTransferListVo) map.getValueObject(domainObject, ims.core.vo.PatientCaseNoteTransferListVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PatientCaseNoteTransferListVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.PatientCaseNoteTransfer
	 */
	 public static ims.core.vo.PatientCaseNoteTransferListVo insert(ims.core.vo.PatientCaseNoteTransferListVo valueObject, ims.core.clinical.domain.objects.PatientCaseNoteTransfer domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.PatientCaseNoteTransfer
	 */
	 public static ims.core.vo.PatientCaseNoteTransferListVo insert(DomainObjectMap map, ims.core.vo.PatientCaseNoteTransferListVo valueObject, ims.core.clinical.domain.objects.PatientCaseNoteTransfer domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientCaseNoteTransfer(domainObject.getId());
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
			
		// TransferredFromLocation
		valueObject.setTransferredFromLocation(ims.core.vo.domain.LocationMinVoAssembler.create(map, domainObject.getTransferredFromLocation()) );
		// TransferredToLocation
		valueObject.setTransferredToLocation(ims.core.vo.domain.LocationMinVoAssembler.create(map, domainObject.getTransferredToLocation()) );
		// TransferredBy
		valueObject.setTransferredBy(ims.core.vo.domain.MemberOfStaffMinVoAssembler.create(map, domainObject.getTransferredBy()) );
		// TransferDate
		java.util.Date TransferDate = domainObject.getTransferDate();
		if ( null != TransferDate ) 
		{
			valueObject.setTransferDate(new ims.framework.utils.DateTime(TransferDate) );
		}
		// ReasonForTransfer
		ims.domain.lookups.LookupInstance instance5 = domainObject.getReasonForTransfer();
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

			ims.core.vo.lookups.CaseNoteReasonForRequest voLookup5 = new ims.core.vo.lookups.CaseNoteReasonForRequest(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.CaseNoteReasonForRequest parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.CaseNoteReasonForRequest(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setReasonForTransfer(voLookup5);
		}
				// TansferComment
		valueObject.setTansferComment(ims.core.vo.domain.PatientCaseNoteCommentSaveVoAssembler.create(map, domainObject.getTansferComment()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.PatientCaseNoteTransfer extractPatientCaseNoteTransfer(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteTransferListVo valueObject) 
	{
		return 	extractPatientCaseNoteTransfer(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.PatientCaseNoteTransfer extractPatientCaseNoteTransfer(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteTransferListVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientCaseNoteTransfer();
		ims.core.clinical.domain.objects.PatientCaseNoteTransfer domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.PatientCaseNoteTransfer)domMap.get(valueObject);
			}
			// ims.core.vo.PatientCaseNoteTransferListVo ID_PatientCaseNoteTransfer field is unknown
			domainObject = new ims.core.clinical.domain.objects.PatientCaseNoteTransfer();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientCaseNoteTransfer());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.PatientCaseNoteTransfer)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.PatientCaseNoteTransfer) domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientCaseNoteTransfer.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientCaseNoteTransfer());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value1 = null;
		if ( null != valueObject.getTransferredFromLocation() ) 
		{
			if (valueObject.getTransferredFromLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getTransferredFromLocation()) != null)
				{
					value1 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getTransferredFromLocation());
				}
			}
			else
			{
				value1 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getTransferredFromLocation().getBoId());
			}
		}
		domainObject.setTransferredFromLocation(value1);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value2 = null;
		if ( null != valueObject.getTransferredToLocation() ) 
		{
			if (valueObject.getTransferredToLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getTransferredToLocation()) != null)
				{
					value2 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getTransferredToLocation());
				}
			}
			else
			{
				value2 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getTransferredToLocation().getBoId());
			}
		}
		domainObject.setTransferredToLocation(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value3 = null;
		if ( null != valueObject.getTransferredBy() ) 
		{
			if (valueObject.getTransferredBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getTransferredBy()) != null)
				{
					value3 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getTransferredBy());
				}
			}
			else
			{
				value3 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getTransferredBy().getBoId());
			}
		}
		domainObject.setTransferredBy(value3);
		ims.framework.utils.DateTime dateTime4 = valueObject.getTransferDate();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setTransferDate(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getReasonForTransfer() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getReasonForTransfer().getID());
		}
		domainObject.setReasonForTransfer(value5);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.PatientCaseNoteComment value6 = null;
		if ( null != valueObject.getTansferComment() ) 
		{
			if (valueObject.getTansferComment().getBoId() == null)
			{
				if (domMap.get(valueObject.getTansferComment()) != null)
				{
					value6 = (ims.core.clinical.domain.objects.PatientCaseNoteComment)domMap.get(valueObject.getTansferComment());
				}
			}
			else
			{
				value6 = (ims.core.clinical.domain.objects.PatientCaseNoteComment)domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientCaseNoteComment.class, valueObject.getTansferComment().getBoId());
			}
		}
		domainObject.setTansferComment(value6);

		return domainObject;
	}

}
