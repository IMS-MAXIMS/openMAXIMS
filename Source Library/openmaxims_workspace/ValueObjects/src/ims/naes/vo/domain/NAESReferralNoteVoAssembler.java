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
package ims.naes.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Aidan Mc Donnell
 */
public class NAESReferralNoteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.naes.vo.NAESReferralNoteVo copy(ims.naes.vo.NAESReferralNoteVo valueObjectDest, ims.naes.vo.NAESReferralNoteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_NAESReferralNote(valueObjectSrc.getID_NAESReferralNote());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Referral
		valueObjectDest.setReferral(valueObjectSrc.getReferral());
		// RecordingUser
		valueObjectDest.setRecordingUser(valueObjectSrc.getRecordingUser());
		// RecordingDateTime
		valueObjectDest.setRecordingDateTime(valueObjectSrc.getRecordingDateTime());
		// Note
		valueObjectDest.setNote(valueObjectSrc.getNote());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createNAESReferralNoteVoCollectionFromNAESReferralNote(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.naes.domain.objects.NAESReferralNote objects.
	 */
	public static ims.naes.vo.NAESReferralNoteVoCollection createNAESReferralNoteVoCollectionFromNAESReferralNote(java.util.Set domainObjectSet)	
	{
		return createNAESReferralNoteVoCollectionFromNAESReferralNote(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.naes.domain.objects.NAESReferralNote objects.
	 */
	public static ims.naes.vo.NAESReferralNoteVoCollection createNAESReferralNoteVoCollectionFromNAESReferralNote(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.naes.vo.NAESReferralNoteVoCollection voList = new ims.naes.vo.NAESReferralNoteVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.naes.domain.objects.NAESReferralNote domainObject = (ims.naes.domain.objects.NAESReferralNote) iterator.next();
			ims.naes.vo.NAESReferralNoteVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.naes.domain.objects.NAESReferralNote objects.
	 */
	public static ims.naes.vo.NAESReferralNoteVoCollection createNAESReferralNoteVoCollectionFromNAESReferralNote(java.util.List domainObjectList) 
	{
		return createNAESReferralNoteVoCollectionFromNAESReferralNote(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.naes.domain.objects.NAESReferralNote objects.
	 */
	public static ims.naes.vo.NAESReferralNoteVoCollection createNAESReferralNoteVoCollectionFromNAESReferralNote(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.naes.vo.NAESReferralNoteVoCollection voList = new ims.naes.vo.NAESReferralNoteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.naes.domain.objects.NAESReferralNote domainObject = (ims.naes.domain.objects.NAESReferralNote) domainObjectList.get(i);
			ims.naes.vo.NAESReferralNoteVo vo = create(map, domainObject);

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
	 * Create the ims.naes.domain.objects.NAESReferralNote set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractNAESReferralNoteSet(ims.domain.ILightweightDomainFactory domainFactory, ims.naes.vo.NAESReferralNoteVoCollection voCollection) 
	 {
	 	return extractNAESReferralNoteSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractNAESReferralNoteSet(ims.domain.ILightweightDomainFactory domainFactory, ims.naes.vo.NAESReferralNoteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.naes.vo.NAESReferralNoteVo vo = voCollection.get(i);
			ims.naes.domain.objects.NAESReferralNote domainObject = NAESReferralNoteVoAssembler.extractNAESReferralNote(domainFactory, vo, domMap);

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
	 * Create the ims.naes.domain.objects.NAESReferralNote list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractNAESReferralNoteList(ims.domain.ILightweightDomainFactory domainFactory, ims.naes.vo.NAESReferralNoteVoCollection voCollection) 
	 {
	 	return extractNAESReferralNoteList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractNAESReferralNoteList(ims.domain.ILightweightDomainFactory domainFactory, ims.naes.vo.NAESReferralNoteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.naes.vo.NAESReferralNoteVo vo = voCollection.get(i);
			ims.naes.domain.objects.NAESReferralNote domainObject = NAESReferralNoteVoAssembler.extractNAESReferralNote(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.naes.domain.objects.NAESReferralNote object.
	 * @param domainObject ims.naes.domain.objects.NAESReferralNote
	 */
	 public static ims.naes.vo.NAESReferralNoteVo create(ims.naes.domain.objects.NAESReferralNote domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.naes.domain.objects.NAESReferralNote object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.naes.vo.NAESReferralNoteVo create(DomainObjectMap map, ims.naes.domain.objects.NAESReferralNote domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.naes.vo.NAESReferralNoteVo valueObject = (ims.naes.vo.NAESReferralNoteVo) map.getValueObject(domainObject, ims.naes.vo.NAESReferralNoteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.naes.vo.NAESReferralNoteVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.naes.domain.objects.NAESReferralNote
	 */
	 public static ims.naes.vo.NAESReferralNoteVo insert(ims.naes.vo.NAESReferralNoteVo valueObject, ims.naes.domain.objects.NAESReferralNote domainObject) 
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
	 * @param domainObject ims.naes.domain.objects.NAESReferralNote
	 */
	 public static ims.naes.vo.NAESReferralNoteVo insert(DomainObjectMap map, ims.naes.vo.NAESReferralNoteVo valueObject, ims.naes.domain.objects.NAESReferralNote domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_NAESReferralNote(domainObject.getId());
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
			
		// Referral
		if (domainObject.getReferral() != null)
		{
			if(domainObject.getReferral() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getReferral();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setReferral(new ims.naes.vo.NAESReferralRefVo(id, -1));				
			}
			else
			{
				valueObject.setReferral(new ims.naes.vo.NAESReferralRefVo(domainObject.getReferral().getId(), domainObject.getReferral().getVersion()));
			}
		}
		// RecordingUser
		valueObject.setRecordingUser(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getRecordingUser()) );
		// RecordingDateTime
		java.util.Date RecordingDateTime = domainObject.getRecordingDateTime();
		if ( null != RecordingDateTime ) 
		{
			valueObject.setRecordingDateTime(new ims.framework.utils.DateTime(RecordingDateTime) );
		}
		// Note
		valueObject.setNote(domainObject.getNote());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.naes.domain.objects.NAESReferralNote extractNAESReferralNote(ims.domain.ILightweightDomainFactory domainFactory, ims.naes.vo.NAESReferralNoteVo valueObject) 
	{
		return 	extractNAESReferralNote(domainFactory, valueObject, new HashMap());
	}

	public static ims.naes.domain.objects.NAESReferralNote extractNAESReferralNote(ims.domain.ILightweightDomainFactory domainFactory, ims.naes.vo.NAESReferralNoteVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_NAESReferralNote();
		ims.naes.domain.objects.NAESReferralNote domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.naes.domain.objects.NAESReferralNote)domMap.get(valueObject);
			}
			// ims.naes.vo.NAESReferralNoteVo ID_NAESReferralNote field is unknown
			domainObject = new ims.naes.domain.objects.NAESReferralNote();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_NAESReferralNote());
			if (domMap.get(key) != null)
			{
				return (ims.naes.domain.objects.NAESReferralNote)domMap.get(key);
			}
			domainObject = (ims.naes.domain.objects.NAESReferralNote) domainFactory.getDomainObject(ims.naes.domain.objects.NAESReferralNote.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_NAESReferralNote());

		ims.naes.domain.objects.NAESReferral value1 = null;
		if ( null != valueObject.getReferral() ) 
		{
			if (valueObject.getReferral().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferral()) != null)
				{
					value1 = (ims.naes.domain.objects.NAESReferral)domMap.get(valueObject.getReferral());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getReferral();	
			}
			else
			{
				value1 = (ims.naes.domain.objects.NAESReferral)domainFactory.getDomainObject(ims.naes.domain.objects.NAESReferral.class, valueObject.getReferral().getBoId());
			}
		}
		domainObject.setReferral(value1);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value2 = null;
		if ( null != valueObject.getRecordingUser() ) 
		{
			if (valueObject.getRecordingUser().getBoId() == null)
			{
				if (domMap.get(valueObject.getRecordingUser()) != null)
				{
					value2 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getRecordingUser());
				}
			}
			else
			{
				value2 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getRecordingUser().getBoId());
			}
		}
		domainObject.setRecordingUser(value2);
		ims.framework.utils.DateTime dateTime3 = valueObject.getRecordingDateTime();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setRecordingDateTime(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNote() != null && valueObject.getNote().equals(""))
		{
			valueObject.setNote(null);
		}
		domainObject.setNote(valueObject.getNote());

		return domainObject;
	}

}
