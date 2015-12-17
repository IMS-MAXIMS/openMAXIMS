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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author John MacEnri
 */
public class ClinicalContactShortVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.ClinicalContactShortVo copy(ims.core.vo.ClinicalContactShortVo valueObjectDest, ims.core.vo.ClinicalContactShortVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ClinicalContact(valueObjectSrc.getID_ClinicalContact());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Specialty
		valueObjectDest.setSpecialty(valueObjectSrc.getSpecialty());
		// SeenBy
		valueObjectDest.setSeenBy(valueObjectSrc.getSeenBy());
		// ContactType
		valueObjectDest.setContactType(valueObjectSrc.getContactType());
		// StartDateTime
		valueObjectDest.setStartDateTime(valueObjectSrc.getStartDateTime());
		// EndDateTime
		valueObjectDest.setEndDateTime(valueObjectSrc.getEndDateTime());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// isClinicalNoteCreated
		valueObjectDest.setIsClinicalNoteCreated(valueObjectSrc.getIsClinicalNoteCreated());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// StatusHistory
		valueObjectDest.setStatusHistory(valueObjectSrc.getStatusHistory());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createClinicalContactShortVoCollectionFromClinicalContact(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.ClinicalContact objects.
	 */
	public static ims.core.vo.ClinicalContactShortVoCollection createClinicalContactShortVoCollectionFromClinicalContact(java.util.Set domainObjectSet)	
	{
		return createClinicalContactShortVoCollectionFromClinicalContact(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.ClinicalContact objects.
	 */
	public static ims.core.vo.ClinicalContactShortVoCollection createClinicalContactShortVoCollectionFromClinicalContact(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.ClinicalContactShortVoCollection voList = new ims.core.vo.ClinicalContactShortVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.domain.objects.ClinicalContact domainObject = (ims.core.admin.domain.objects.ClinicalContact) iterator.next();
			ims.core.vo.ClinicalContactShortVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.domain.objects.ClinicalContact objects.
	 */
	public static ims.core.vo.ClinicalContactShortVoCollection createClinicalContactShortVoCollectionFromClinicalContact(java.util.List domainObjectList) 
	{
		return createClinicalContactShortVoCollectionFromClinicalContact(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.ClinicalContact objects.
	 */
	public static ims.core.vo.ClinicalContactShortVoCollection createClinicalContactShortVoCollectionFromClinicalContact(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.ClinicalContactShortVoCollection voList = new ims.core.vo.ClinicalContactShortVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.ClinicalContact domainObject = (ims.core.admin.domain.objects.ClinicalContact) domainObjectList.get(i);
			ims.core.vo.ClinicalContactShortVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.domain.objects.ClinicalContact set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractClinicalContactSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ClinicalContactShortVoCollection voCollection) 
	 {
	 	return extractClinicalContactSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractClinicalContactSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ClinicalContactShortVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.ClinicalContactShortVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.ClinicalContact domainObject = ClinicalContactShortVoAssembler.extractClinicalContact(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.domain.objects.ClinicalContact list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractClinicalContactList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ClinicalContactShortVoCollection voCollection) 
	 {
	 	return extractClinicalContactList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractClinicalContactList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ClinicalContactShortVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.ClinicalContactShortVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.ClinicalContact domainObject = ClinicalContactShortVoAssembler.extractClinicalContact(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.domain.objects.ClinicalContact object.
	 * @param domainObject ims.core.admin.domain.objects.ClinicalContact
	 */
	 public static ims.core.vo.ClinicalContactShortVo create(ims.core.admin.domain.objects.ClinicalContact domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.domain.objects.ClinicalContact object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.ClinicalContactShortVo create(DomainObjectMap map, ims.core.admin.domain.objects.ClinicalContact domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.ClinicalContactShortVo valueObject = (ims.core.vo.ClinicalContactShortVo) map.getValueObject(domainObject, ims.core.vo.ClinicalContactShortVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.ClinicalContactShortVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.domain.objects.ClinicalContact
	 */
	 public static ims.core.vo.ClinicalContactShortVo insert(ims.core.vo.ClinicalContactShortVo valueObject, ims.core.admin.domain.objects.ClinicalContact domainObject) 
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
	 * @param domainObject ims.core.admin.domain.objects.ClinicalContact
	 */
	 public static ims.core.vo.ClinicalContactShortVo insert(DomainObjectMap map, ims.core.vo.ClinicalContactShortVo valueObject, ims.core.admin.domain.objects.ClinicalContact domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ClinicalContact(domainObject.getId());
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
			
		// Specialty
		ims.domain.lookups.LookupInstance instance1 = domainObject.getSpecialty();
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

			ims.core.vo.lookups.Specialty voLookup1 = new ims.core.vo.lookups.Specialty(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.core.vo.lookups.Specialty(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setSpecialty(voLookup1);
		}
				// SeenBy
		valueObject.setSeenBy(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getSeenBy()) );
		// ContactType
		ims.domain.lookups.LookupInstance instance3 = domainObject.getContactType();
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

			ims.core.vo.lookups.ContactType voLookup3 = new ims.core.vo.lookups.ContactType(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.ContactType parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.ContactType(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setContactType(voLookup3);
		}
				// StartDateTime
		java.util.Date StartDateTime = domainObject.getStartDateTime();
		if ( null != StartDateTime ) 
		{
			valueObject.setStartDateTime(new ims.framework.utils.DateTime(StartDateTime) );
		}
		// EndDateTime
		java.util.Date EndDateTime = domainObject.getEndDateTime();
		if ( null != EndDateTime ) 
		{
			valueObject.setEndDateTime(new ims.framework.utils.DateTime(EndDateTime) );
		}
		// CareContext
		if (domainObject.getCareContext() != null)
		{
			if(domainObject.getCareContext() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCareContext();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(id, -1));				
			}
			else
			{
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(domainObject.getCareContext().getId(), domainObject.getCareContext().getVersion()));
			}
		}
		// isClinicalNoteCreated
		valueObject.setIsClinicalNoteCreated( domainObject.isIsClinicalNoteCreated() );
		// CurrentStatus
		valueObject.setCurrentStatus(ims.core.vo.domain.ClinicalContactStatusHistoryVoAssembler.create(map, domainObject.getCurrentStatus()) );
		// StatusHistory
		valueObject.setStatusHistory(ims.core.vo.domain.ClinicalContactStatusHistoryVoAssembler.createClinicalContactStatusHistoryVoCollectionFromClinicalContactStatusHistory(map, domainObject.getStatusHistory()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.ClinicalContact extractClinicalContact(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ClinicalContactShortVo valueObject) 
	{
		return 	extractClinicalContact(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.ClinicalContact extractClinicalContact(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ClinicalContactShortVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ClinicalContact();
		ims.core.admin.domain.objects.ClinicalContact domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject);
			}
			// ims.core.vo.ClinicalContactShortVo ID_ClinicalContact field is unknown
			domainObject = new ims.core.admin.domain.objects.ClinicalContact();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ClinicalContact());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.domain.objects.ClinicalContact)domMap.get(key);
			}
			domainObject = (ims.core.admin.domain.objects.ClinicalContact) domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ClinicalContact());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value1);
		domainObject.setSeenBy(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getSeenBy(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getContactType() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getContactType().getID());
		}
		domainObject.setContactType(value3);
		ims.framework.utils.DateTime dateTime4 = valueObject.getStartDateTime();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setStartDateTime(value4);
		ims.framework.utils.DateTime dateTime5 = valueObject.getEndDateTime();
		java.util.Date value5 = null;
		if ( dateTime5 != null ) 
		{
			value5 = dateTime5.getJavaDate();
		}
		domainObject.setEndDateTime(value5);
		ims.core.admin.domain.objects.CareContext value6 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value6 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value6 = domainObject.getCareContext();	
			}
			else
			{
				value6 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value6);
		domainObject.setIsClinicalNoteCreated(valueObject.getIsClinicalNoteCreated());
		domainObject.setCurrentStatus(ims.core.vo.domain.ClinicalContactStatusHistoryVoAssembler.extractClinicalContactStatusHistory(domainFactory, valueObject.getCurrentStatus(), domMap));

		// SaveAsRefVO treated as RefValueObject
		ims.core.admin.vo.ClinicalContactStatusHistoryRefVoCollection refCollection9 = new ims.core.admin.vo.ClinicalContactStatusHistoryRefVoCollection();
		if (valueObject.getStatusHistory() != null)
		{
			for (int i9=0; i9<valueObject.getStatusHistory().size(); i9++)
			{
				ims.core.admin.vo.ClinicalContactStatusHistoryRefVo ref9 = (ims.core.admin.vo.ClinicalContactStatusHistoryRefVo)valueObject.getStatusHistory().get(i9);
				refCollection9.add(ref9);
			}
		}
		int size9 = (null == refCollection9) ? 0 : refCollection9.size();		
		java.util.List domainStatusHistory9 = domainObject.getStatusHistory();
		if (domainStatusHistory9 == null)
		{
			domainStatusHistory9 = new java.util.ArrayList();
		}
		for(int i=0; i < size9; i++) 
		{
			ims.core.admin.vo.ClinicalContactStatusHistoryRefVo vo = refCollection9.get(i);			
			ims.core.admin.domain.objects.ClinicalContactStatusHistory dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.admin.domain.objects.ClinicalContactStatusHistory)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.admin.domain.objects.ClinicalContactStatusHistory)domainFactory.getDomainObject( ims.core.admin.domain.objects.ClinicalContactStatusHistory.class, vo.getBoId());
				}
			}

			int domIdx = domainStatusHistory9.indexOf(dom);
			if (domIdx == -1)
			{
				domainStatusHistory9.add(i, dom);
			}
			else if (i != domIdx && i < domainStatusHistory9.size())
			{
				Object tmp = domainStatusHistory9.get(i);
				domainStatusHistory9.set(i, domainStatusHistory9.get(domIdx));
				domainStatusHistory9.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i9 = domainStatusHistory9.size();
		while (i9 > size9)
		{
			domainStatusHistory9.remove(i9-1);
			i9 = domainStatusHistory9.size();
		}
		
		domainObject.setStatusHistory(domainStatusHistory9);		

		return domainObject;
	}

}
