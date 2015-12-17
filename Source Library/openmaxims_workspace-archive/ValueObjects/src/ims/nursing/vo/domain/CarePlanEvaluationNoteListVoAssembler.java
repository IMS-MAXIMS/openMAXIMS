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
package ims.nursing.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class CarePlanEvaluationNoteListVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.nursing.vo.CarePlanEvaluationNoteListVo copy(ims.nursing.vo.CarePlanEvaluationNoteListVo valueObjectDest, ims.nursing.vo.CarePlanEvaluationNoteListVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CarePlanEvaluationNote(valueObjectSrc.getID_CarePlanEvaluationNote());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// RecordedDateTime
		valueObjectDest.setRecordedDateTime(valueObjectSrc.getRecordedDateTime());
		// RecordedBy
		valueObjectDest.setRecordedBy(valueObjectSrc.getRecordedBy());
		// Note
		valueObjectDest.setNote(valueObjectSrc.getNote());
		// Active
		valueObjectDest.setActive(valueObjectSrc.getActive());
		// carePlan
		valueObjectDest.setCarePlan(valueObjectSrc.getCarePlan());
		// CorrectedBy
		valueObjectDest.setCorrectedBy(valueObjectSrc.getCorrectedBy());
		// CorrectionDateTime
		valueObjectDest.setCorrectionDateTime(valueObjectSrc.getCorrectionDateTime());
		// CorrectionReason
		valueObjectDest.setCorrectionReason(valueObjectSrc.getCorrectionReason());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCarePlanEvaluationNoteListVoCollectionFromCarePlanEvaluationNote(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.nursing.careplans.domain.objects.CarePlanEvaluationNote objects.
	 */
	public static ims.nursing.vo.CarePlanEvaluationNoteListVoCollection createCarePlanEvaluationNoteListVoCollectionFromCarePlanEvaluationNote(java.util.Set domainObjectSet)	
	{
		return createCarePlanEvaluationNoteListVoCollectionFromCarePlanEvaluationNote(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.nursing.careplans.domain.objects.CarePlanEvaluationNote objects.
	 */
	public static ims.nursing.vo.CarePlanEvaluationNoteListVoCollection createCarePlanEvaluationNoteListVoCollectionFromCarePlanEvaluationNote(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.nursing.vo.CarePlanEvaluationNoteListVoCollection voList = new ims.nursing.vo.CarePlanEvaluationNoteListVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.nursing.careplans.domain.objects.CarePlanEvaluationNote domainObject = (ims.nursing.careplans.domain.objects.CarePlanEvaluationNote) iterator.next();
			ims.nursing.vo.CarePlanEvaluationNoteListVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.nursing.careplans.domain.objects.CarePlanEvaluationNote objects.
	 */
	public static ims.nursing.vo.CarePlanEvaluationNoteListVoCollection createCarePlanEvaluationNoteListVoCollectionFromCarePlanEvaluationNote(java.util.List domainObjectList) 
	{
		return createCarePlanEvaluationNoteListVoCollectionFromCarePlanEvaluationNote(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.nursing.careplans.domain.objects.CarePlanEvaluationNote objects.
	 */
	public static ims.nursing.vo.CarePlanEvaluationNoteListVoCollection createCarePlanEvaluationNoteListVoCollectionFromCarePlanEvaluationNote(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.nursing.vo.CarePlanEvaluationNoteListVoCollection voList = new ims.nursing.vo.CarePlanEvaluationNoteListVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.nursing.careplans.domain.objects.CarePlanEvaluationNote domainObject = (ims.nursing.careplans.domain.objects.CarePlanEvaluationNote) domainObjectList.get(i);
			ims.nursing.vo.CarePlanEvaluationNoteListVo vo = create(map, domainObject);

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
	 * Create the ims.nursing.careplans.domain.objects.CarePlanEvaluationNote set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractCarePlanEvaluationNoteSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.CarePlanEvaluationNoteListVoCollection voCollection) 
	 {
	 	return extractCarePlanEvaluationNoteSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCarePlanEvaluationNoteSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.CarePlanEvaluationNoteListVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.CarePlanEvaluationNoteListVo vo = voCollection.get(i);
			ims.nursing.careplans.domain.objects.CarePlanEvaluationNote domainObject = CarePlanEvaluationNoteListVoAssembler.extractCarePlanEvaluationNote(domainFactory, vo, domMap);

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
	 * Create the ims.nursing.careplans.domain.objects.CarePlanEvaluationNote list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractCarePlanEvaluationNoteList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.CarePlanEvaluationNoteListVoCollection voCollection) 
	 {
	 	return extractCarePlanEvaluationNoteList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCarePlanEvaluationNoteList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.CarePlanEvaluationNoteListVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.CarePlanEvaluationNoteListVo vo = voCollection.get(i);
			ims.nursing.careplans.domain.objects.CarePlanEvaluationNote domainObject = CarePlanEvaluationNoteListVoAssembler.extractCarePlanEvaluationNote(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.nursing.careplans.domain.objects.CarePlanEvaluationNote object.
	 * @param domainObject ims.nursing.careplans.domain.objects.CarePlanEvaluationNote
	 */
	 public static ims.nursing.vo.CarePlanEvaluationNoteListVo create(ims.nursing.careplans.domain.objects.CarePlanEvaluationNote domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.nursing.careplans.domain.objects.CarePlanEvaluationNote object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.nursing.vo.CarePlanEvaluationNoteListVo create(DomainObjectMap map, ims.nursing.careplans.domain.objects.CarePlanEvaluationNote domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.nursing.vo.CarePlanEvaluationNoteListVo valueObject = (ims.nursing.vo.CarePlanEvaluationNoteListVo) map.getValueObject(domainObject, ims.nursing.vo.CarePlanEvaluationNoteListVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.nursing.vo.CarePlanEvaluationNoteListVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.nursing.careplans.domain.objects.CarePlanEvaluationNote
	 */
	 public static ims.nursing.vo.CarePlanEvaluationNoteListVo insert(ims.nursing.vo.CarePlanEvaluationNoteListVo valueObject, ims.nursing.careplans.domain.objects.CarePlanEvaluationNote domainObject) 
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
	 * @param domainObject ims.nursing.careplans.domain.objects.CarePlanEvaluationNote
	 */
	 public static ims.nursing.vo.CarePlanEvaluationNoteListVo insert(DomainObjectMap map, ims.nursing.vo.CarePlanEvaluationNoteListVo valueObject, ims.nursing.careplans.domain.objects.CarePlanEvaluationNote domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_CarePlanEvaluationNote(domainObject.getId());
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
			
		// RecordedDateTime
		java.util.Date RecordedDateTime = domainObject.getRecordedDateTime();
		if ( null != RecordedDateTime ) 
		{
			valueObject.setRecordedDateTime(new ims.framework.utils.DateTime(RecordedDateTime) );
		}
		// RecordedBy
		valueObject.setRecordedBy(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getRecordedBy()) );
		// Note
		valueObject.setNote(domainObject.getNote());
		// Active
		valueObject.setActive( domainObject.isActive() );
		// carePlan
		valueObject.setCarePlan(ims.nursing.vo.domain.CarePlanTitleAssembler.create(map, domainObject.getCarePlan()) );
		// CorrectedBy
		valueObject.setCorrectedBy(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getCorrectedBy()) );
		// CorrectionDateTime
		java.util.Date CorrectionDateTime = domainObject.getCorrectionDateTime();
		if ( null != CorrectionDateTime ) 
		{
			valueObject.setCorrectionDateTime(new ims.framework.utils.DateTime(CorrectionDateTime) );
		}
		// CorrectionReason
		valueObject.setCorrectionReason(domainObject.getCorrectionReason());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.nursing.careplans.domain.objects.CarePlanEvaluationNote extractCarePlanEvaluationNote(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.CarePlanEvaluationNoteListVo valueObject) 
	{
		return 	extractCarePlanEvaluationNote(domainFactory, valueObject, new HashMap());
	}

	public static ims.nursing.careplans.domain.objects.CarePlanEvaluationNote extractCarePlanEvaluationNote(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.CarePlanEvaluationNoteListVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_CarePlanEvaluationNote();
		ims.nursing.careplans.domain.objects.CarePlanEvaluationNote domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.nursing.careplans.domain.objects.CarePlanEvaluationNote)domMap.get(valueObject);
			}
			// ims.nursing.vo.CarePlanEvaluationNoteListVo ID_CarePlanEvaluationNote field is unknown
			domainObject = new ims.nursing.careplans.domain.objects.CarePlanEvaluationNote();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_CarePlanEvaluationNote());
			if (domMap.get(key) != null)
			{
				return (ims.nursing.careplans.domain.objects.CarePlanEvaluationNote)domMap.get(key);
			}
			domainObject = (ims.nursing.careplans.domain.objects.CarePlanEvaluationNote) domainFactory.getDomainObject(ims.nursing.careplans.domain.objects.CarePlanEvaluationNote.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_CarePlanEvaluationNote());

		ims.framework.utils.DateTime dateTime1 = valueObject.getRecordedDateTime();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setRecordedDateTime(value1);
		domainObject.setRecordedBy(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getRecordedBy(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNote() != null && valueObject.getNote().equals(""))
		{
			valueObject.setNote(null);
		}
		domainObject.setNote(valueObject.getNote());
		domainObject.setActive(valueObject.getActive());
		domainObject.setCarePlan(ims.nursing.vo.domain.CarePlanTitleAssembler.extractCarePlan(domainFactory, valueObject.getCarePlan(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value6 = null;
		if ( null != valueObject.getCorrectedBy() ) 
		{
			if (valueObject.getCorrectedBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getCorrectedBy()) != null)
				{
					value6 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getCorrectedBy());
				}
			}
			else
			{
				value6 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getCorrectedBy().getBoId());
			}
		}
		domainObject.setCorrectedBy(value6);
		ims.framework.utils.DateTime dateTime7 = valueObject.getCorrectionDateTime();
		java.util.Date value7 = null;
		if ( dateTime7 != null ) 
		{
			value7 = dateTime7.getJavaDate();
		}
		domainObject.setCorrectionDateTime(value7);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCorrectionReason() != null && valueObject.getCorrectionReason().equals(""))
		{
			valueObject.setCorrectionReason(null);
		}
		domainObject.setCorrectionReason(valueObject.getCorrectionReason());

		return domainObject;
	}

}
