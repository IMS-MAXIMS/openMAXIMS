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
package ims.correspondence.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Sean Nesbitt
 */
public class CorrespondenceDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.correspondence.vo.CorrespondenceDetailsVo copy(ims.correspondence.vo.CorrespondenceDetailsVo valueObjectDest, ims.correspondence.vo.CorrespondenceDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CorrespondenceDetails(valueObjectSrc.getID_CorrespondenceDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// pasEvent
		valueObjectDest.setPasEvent(valueObjectSrc.getPasEvent());
		// currentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// CspStatusHistory
		valueObjectDest.setCspStatusHistory(valueObjectSrc.getCspStatusHistory());
		// categories
		valueObjectDest.setCategories(valueObjectSrc.getCategories());
		// recipients
		valueObjectDest.setRecipients(valueObjectSrc.getRecipients());
		// currentDocument
		valueObjectDest.setCurrentDocument(valueObjectSrc.getCurrentDocument());
		// signedBy
		valueObjectDest.setSignedBy(valueObjectSrc.getSignedBy());
		// specialInterest
		valueObjectDest.setSpecialInterest(valueObjectSrc.getSpecialInterest());
		// DateOfClinic
		valueObjectDest.setDateOfClinic(valueObjectSrc.getDateOfClinic());
		// AdmissionDate
		valueObjectDest.setAdmissionDate(valueObjectSrc.getAdmissionDate());
		// DischargeDate
		valueObjectDest.setDischargeDate(valueObjectSrc.getDischargeDate());
		// DictatedBy
		valueObjectDest.setDictatedBy(valueObjectSrc.getDictatedBy());
		// DictatedByInitials
		valueObjectDest.setDictatedByInitials(valueObjectSrc.getDictatedByInitials());
		// TypedBy
		valueObjectDest.setTypedBy(valueObjectSrc.getTypedBy());
		// TypedByInitials
		valueObjectDest.setTypedByInitials(valueObjectSrc.getTypedByInitials());
		// EnquiriesTo
		valueObjectDest.setEnquiriesTo(valueObjectSrc.getEnquiriesTo());
		// WasTypedWithoutCaseNotes
		valueObjectDest.setWasTypedWithoutCaseNotes(valueObjectSrc.getWasTypedWithoutCaseNotes());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCorrespondenceDetailsVoCollectionFromCorrespondenceDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.correspondence.domain.objects.CorrespondenceDetails objects.
	 */
	public static ims.correspondence.vo.CorrespondenceDetailsVoCollection createCorrespondenceDetailsVoCollectionFromCorrespondenceDetails(java.util.Set domainObjectSet)	
	{
		return createCorrespondenceDetailsVoCollectionFromCorrespondenceDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.correspondence.domain.objects.CorrespondenceDetails objects.
	 */
	public static ims.correspondence.vo.CorrespondenceDetailsVoCollection createCorrespondenceDetailsVoCollectionFromCorrespondenceDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.correspondence.vo.CorrespondenceDetailsVoCollection voList = new ims.correspondence.vo.CorrespondenceDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.correspondence.domain.objects.CorrespondenceDetails domainObject = (ims.correspondence.domain.objects.CorrespondenceDetails) iterator.next();
			ims.correspondence.vo.CorrespondenceDetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.correspondence.domain.objects.CorrespondenceDetails objects.
	 */
	public static ims.correspondence.vo.CorrespondenceDetailsVoCollection createCorrespondenceDetailsVoCollectionFromCorrespondenceDetails(java.util.List domainObjectList) 
	{
		return createCorrespondenceDetailsVoCollectionFromCorrespondenceDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.correspondence.domain.objects.CorrespondenceDetails objects.
	 */
	public static ims.correspondence.vo.CorrespondenceDetailsVoCollection createCorrespondenceDetailsVoCollectionFromCorrespondenceDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.correspondence.vo.CorrespondenceDetailsVoCollection voList = new ims.correspondence.vo.CorrespondenceDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.correspondence.domain.objects.CorrespondenceDetails domainObject = (ims.correspondence.domain.objects.CorrespondenceDetails) domainObjectList.get(i);
			ims.correspondence.vo.CorrespondenceDetailsVo vo = create(map, domainObject);

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
	 * Create the ims.correspondence.domain.objects.CorrespondenceDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractCorrespondenceDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.correspondence.vo.CorrespondenceDetailsVoCollection voCollection) 
	 {
	 	return extractCorrespondenceDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCorrespondenceDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.correspondence.vo.CorrespondenceDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.correspondence.vo.CorrespondenceDetailsVo vo = voCollection.get(i);
			ims.correspondence.domain.objects.CorrespondenceDetails domainObject = CorrespondenceDetailsVoAssembler.extractCorrespondenceDetails(domainFactory, vo, domMap);

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
	 * Create the ims.correspondence.domain.objects.CorrespondenceDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractCorrespondenceDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.correspondence.vo.CorrespondenceDetailsVoCollection voCollection) 
	 {
	 	return extractCorrespondenceDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCorrespondenceDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.correspondence.vo.CorrespondenceDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.correspondence.vo.CorrespondenceDetailsVo vo = voCollection.get(i);
			ims.correspondence.domain.objects.CorrespondenceDetails domainObject = CorrespondenceDetailsVoAssembler.extractCorrespondenceDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.correspondence.domain.objects.CorrespondenceDetails object.
	 * @param domainObject ims.correspondence.domain.objects.CorrespondenceDetails
	 */
	 public static ims.correspondence.vo.CorrespondenceDetailsVo create(ims.correspondence.domain.objects.CorrespondenceDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.correspondence.domain.objects.CorrespondenceDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.correspondence.vo.CorrespondenceDetailsVo create(DomainObjectMap map, ims.correspondence.domain.objects.CorrespondenceDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.correspondence.vo.CorrespondenceDetailsVo valueObject = (ims.correspondence.vo.CorrespondenceDetailsVo) map.getValueObject(domainObject, ims.correspondence.vo.CorrespondenceDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.correspondence.vo.CorrespondenceDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.correspondence.domain.objects.CorrespondenceDetails
	 */
	 public static ims.correspondence.vo.CorrespondenceDetailsVo insert(ims.correspondence.vo.CorrespondenceDetailsVo valueObject, ims.correspondence.domain.objects.CorrespondenceDetails domainObject) 
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
	 * @param domainObject ims.correspondence.domain.objects.CorrespondenceDetails
	 */
	 public static ims.correspondence.vo.CorrespondenceDetailsVo insert(DomainObjectMap map, ims.correspondence.vo.CorrespondenceDetailsVo valueObject, ims.correspondence.domain.objects.CorrespondenceDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_CorrespondenceDetails(domainObject.getId());
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
			
		// pasEvent
		if (domainObject.getPasEvent() != null)
		{
			if(domainObject.getPasEvent() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPasEvent();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPasEvent(new ims.core.admin.pas.vo.PASEventRefVo(id, -1));				
			}
			else
			{
				valueObject.setPasEvent(new ims.core.admin.pas.vo.PASEventRefVo(domainObject.getPasEvent().getId(), domainObject.getPasEvent().getVersion()));
			}
		}
		// currentStatus
		ims.domain.lookups.LookupInstance instance2 = domainObject.getCurrentStatus();
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

			ims.core.vo.lookups.DocumentStatus voLookup2 = new ims.core.vo.lookups.DocumentStatus(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.DocumentStatus parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.DocumentStatus(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setCurrentStatus(voLookup2);
		}
				// CspStatusHistory
		valueObject.setCspStatusHistory(ims.correspondence.vo.domain.CorrespondenceStatusHistoryVoAssembler.createCorrespondenceStatusHistoryVoCollectionFromCorrespondenceStatusHistory(map, domainObject.getCspStatusHistory()) );
		// categories
		valueObject.setCategories(ims.correspondence.vo.domain.CategoryNotesVoAssembler.createCategoryNotesVoCollectionFromCategoryNotes(map, domainObject.getCategories()) );
		// recipients
		valueObject.setRecipients(ims.correspondence.vo.domain.RecipientVoAssembler.createRecipientVoCollectionFromRecipient(map, domainObject.getRecipients()) );
		// currentDocument
		valueObject.setCurrentDocument(ims.core.vo.domain.DocumentVoAssembler.create(map, domainObject.getCurrentDocument()) );
		// signedBy
		valueObject.setSignedBy(ims.core.vo.domain.MedicLiteVoAssembler.create(map, domainObject.getSignedBy()) );
		// specialInterest
		ims.domain.lookups.LookupInstance instance8 = domainObject.getSpecialInterest();
		if ( null != instance8 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance8.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance8.getImage().getImageId(), instance8.getImage().getImagePath());
			}
			color = instance8.getColor();
			if (color != null) 
				color.getValue();

			ims.correspondence.vo.lookups.SpecialInterestType voLookup8 = new ims.correspondence.vo.lookups.SpecialInterestType(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.correspondence.vo.lookups.SpecialInterestType parentVoLookup8 = voLookup8;
			ims.domain.lookups.LookupInstance parent8 = instance8.getParent();
			while (parent8 != null)
			{
				if (parent8.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent8.getImage().getImageId(), parent8.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent8.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup8.setParent(new ims.correspondence.vo.lookups.SpecialInterestType(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setSpecialInterest(voLookup8);
		}
				// DateOfClinic
		java.util.Date DateOfClinic = domainObject.getDateOfClinic();
		if ( null != DateOfClinic ) 
		{
			valueObject.setDateOfClinic(new ims.framework.utils.Date(DateOfClinic) );
		}
		// AdmissionDate
		java.util.Date AdmissionDate = domainObject.getAdmissionDate();
		if ( null != AdmissionDate ) 
		{
			valueObject.setAdmissionDate(new ims.framework.utils.Date(AdmissionDate) );
		}
		// DischargeDate
		java.util.Date DischargeDate = domainObject.getDischargeDate();
		if ( null != DischargeDate ) 
		{
			valueObject.setDischargeDate(new ims.framework.utils.Date(DischargeDate) );
		}
		// DictatedBy
		valueObject.setDictatedBy(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getDictatedBy()) );
		// DictatedByInitials
		valueObject.setDictatedByInitials(domainObject.getDictatedByInitials());
		// TypedBy
		valueObject.setTypedBy(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getTypedBy()) );
		// TypedByInitials
		valueObject.setTypedByInitials(domainObject.getTypedByInitials());
		// EnquiriesTo
		valueObject.setEnquiriesTo(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getEnquiriesTo()) );
		// WasTypedWithoutCaseNotes
		valueObject.setWasTypedWithoutCaseNotes( domainObject.isWasTypedWithoutCaseNotes() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.correspondence.domain.objects.CorrespondenceDetails extractCorrespondenceDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.correspondence.vo.CorrespondenceDetailsVo valueObject) 
	{
		return 	extractCorrespondenceDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.correspondence.domain.objects.CorrespondenceDetails extractCorrespondenceDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.correspondence.vo.CorrespondenceDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_CorrespondenceDetails();
		ims.correspondence.domain.objects.CorrespondenceDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.correspondence.domain.objects.CorrespondenceDetails)domMap.get(valueObject);
			}
			// ims.correspondence.vo.CorrespondenceDetailsVo ID_CorrespondenceDetails field is unknown
			domainObject = new ims.correspondence.domain.objects.CorrespondenceDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_CorrespondenceDetails());
			if (domMap.get(key) != null)
			{
				return (ims.correspondence.domain.objects.CorrespondenceDetails)domMap.get(key);
			}
			domainObject = (ims.correspondence.domain.objects.CorrespondenceDetails) domainFactory.getDomainObject(ims.correspondence.domain.objects.CorrespondenceDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_CorrespondenceDetails());

		ims.core.admin.pas.domain.objects.PASEvent value1 = null;
		if ( null != valueObject.getPasEvent() ) 
		{
			if (valueObject.getPasEvent().getBoId() == null)
			{
				if (domMap.get(valueObject.getPasEvent()) != null)
				{
					value1 = (ims.core.admin.pas.domain.objects.PASEvent)domMap.get(valueObject.getPasEvent());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getPasEvent();	
			}
			else
			{
				value1 = (ims.core.admin.pas.domain.objects.PASEvent)domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.PASEvent.class, valueObject.getPasEvent().getBoId());
			}
		}
		domainObject.setPasEvent(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getCurrentStatus() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getCurrentStatus().getID());
		}
		domainObject.setCurrentStatus(value2);
		domainObject.setCspStatusHistory(ims.correspondence.vo.domain.CorrespondenceStatusHistoryVoAssembler.extractCorrespondenceStatusHistorySet(domainFactory, valueObject.getCspStatusHistory(), domainObject.getCspStatusHistory(), domMap));		
		domainObject.setCategories(ims.correspondence.vo.domain.CategoryNotesVoAssembler.extractCategoryNotesList(domainFactory, valueObject.getCategories(), domainObject.getCategories(), domMap));		
		domainObject.setRecipients(ims.correspondence.vo.domain.RecipientVoAssembler.extractRecipientList(domainFactory, valueObject.getRecipients(), domainObject.getRecipients(), domMap));		
		domainObject.setCurrentDocument(ims.core.vo.domain.DocumentVoAssembler.extractDocument(domainFactory, valueObject.getCurrentDocument(), domMap));
		domainObject.setSignedBy(ims.core.vo.domain.MedicLiteVoAssembler.extractMedic(domainFactory, valueObject.getSignedBy(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getSpecialInterest() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getSpecialInterest().getID());
		}
		domainObject.setSpecialInterest(value8);
		java.util.Date value9 = null;
		ims.framework.utils.Date date9 = valueObject.getDateOfClinic();		
		if ( date9 != null ) 
		{
			value9 = date9.getDate();
		}
		domainObject.setDateOfClinic(value9);
		java.util.Date value10 = null;
		ims.framework.utils.Date date10 = valueObject.getAdmissionDate();		
		if ( date10 != null ) 
		{
			value10 = date10.getDate();
		}
		domainObject.setAdmissionDate(value10);
		java.util.Date value11 = null;
		ims.framework.utils.Date date11 = valueObject.getDischargeDate();		
		if ( date11 != null ) 
		{
			value11 = date11.getDate();
		}
		domainObject.setDischargeDate(value11);
		domainObject.setDictatedBy(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.extractMemberOfStaff(domainFactory, valueObject.getDictatedBy(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDictatedByInitials() != null && valueObject.getDictatedByInitials().equals(""))
		{
			valueObject.setDictatedByInitials(null);
		}
		domainObject.setDictatedByInitials(valueObject.getDictatedByInitials());
		domainObject.setTypedBy(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.extractMemberOfStaff(domainFactory, valueObject.getTypedBy(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTypedByInitials() != null && valueObject.getTypedByInitials().equals(""))
		{
			valueObject.setTypedByInitials(null);
		}
		domainObject.setTypedByInitials(valueObject.getTypedByInitials());
		domainObject.setEnquiriesTo(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.extractMemberOfStaff(domainFactory, valueObject.getEnquiriesTo(), domMap));
		domainObject.setWasTypedWithoutCaseNotes(valueObject.getWasTypedWithoutCaseNotes());

		return domainObject;
	}

}
