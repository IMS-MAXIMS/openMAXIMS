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
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Gabriel Maxim
 */
public class AdmissionDetailForCoderWorklistVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.AdmissionDetailForCoderWorklistVo copy(ims.RefMan.vo.AdmissionDetailForCoderWorklistVo valueObjectDest, ims.RefMan.vo.AdmissionDetailForCoderWorklistVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_AdmissionDetail(valueObjectSrc.getID_AdmissionDetail());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// pasEvent
		valueObjectDest.setPasEvent(valueObjectSrc.getPasEvent());
		// AdmissionDateTime
		valueObjectDest.setAdmissionDateTime(valueObjectSrc.getAdmissionDateTime());
		// EstDischargeDate
		valueObjectDest.setEstDischargeDate(valueObjectSrc.getEstDischargeDate());
		// CodingStatus
		valueObjectDest.setCodingStatus(valueObjectSrc.getCodingStatus());
		// CodingComments
		valueObjectDest.setCodingComments(valueObjectSrc.getCodingComments());
		// LastComment
		valueObjectDest.setLastComment(valueObjectSrc.getLastComment());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createAdmissionDetailForCoderWorklistVoCollectionFromAdmissionDetail(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.AdmissionDetail objects.
	 */
	public static ims.RefMan.vo.AdmissionDetailForCoderWorklistVoCollection createAdmissionDetailForCoderWorklistVoCollectionFromAdmissionDetail(java.util.Set domainObjectSet)	
	{
		return createAdmissionDetailForCoderWorklistVoCollectionFromAdmissionDetail(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.AdmissionDetail objects.
	 */
	public static ims.RefMan.vo.AdmissionDetailForCoderWorklistVoCollection createAdmissionDetailForCoderWorklistVoCollectionFromAdmissionDetail(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.AdmissionDetailForCoderWorklistVoCollection voList = new ims.RefMan.vo.AdmissionDetailForCoderWorklistVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.pas.domain.objects.AdmissionDetail domainObject = (ims.core.admin.pas.domain.objects.AdmissionDetail) iterator.next();
			ims.RefMan.vo.AdmissionDetailForCoderWorklistVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.AdmissionDetail objects.
	 */
	public static ims.RefMan.vo.AdmissionDetailForCoderWorklistVoCollection createAdmissionDetailForCoderWorklistVoCollectionFromAdmissionDetail(java.util.List domainObjectList) 
	{
		return createAdmissionDetailForCoderWorklistVoCollectionFromAdmissionDetail(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.AdmissionDetail objects.
	 */
	public static ims.RefMan.vo.AdmissionDetailForCoderWorklistVoCollection createAdmissionDetailForCoderWorklistVoCollectionFromAdmissionDetail(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.AdmissionDetailForCoderWorklistVoCollection voList = new ims.RefMan.vo.AdmissionDetailForCoderWorklistVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.AdmissionDetail domainObject = (ims.core.admin.pas.domain.objects.AdmissionDetail) domainObjectList.get(i);
			ims.RefMan.vo.AdmissionDetailForCoderWorklistVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.pas.domain.objects.AdmissionDetail set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractAdmissionDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.AdmissionDetailForCoderWorklistVoCollection voCollection) 
	 {
	 	return extractAdmissionDetailSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractAdmissionDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.AdmissionDetailForCoderWorklistVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.AdmissionDetailForCoderWorklistVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.AdmissionDetail domainObject = AdmissionDetailForCoderWorklistVoAssembler.extractAdmissionDetail(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.pas.domain.objects.AdmissionDetail list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractAdmissionDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.AdmissionDetailForCoderWorklistVoCollection voCollection) 
	 {
	 	return extractAdmissionDetailList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractAdmissionDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.AdmissionDetailForCoderWorklistVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.AdmissionDetailForCoderWorklistVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.AdmissionDetail domainObject = AdmissionDetailForCoderWorklistVoAssembler.extractAdmissionDetail(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.pas.domain.objects.AdmissionDetail object.
	 * @param domainObject ims.core.admin.pas.domain.objects.AdmissionDetail
	 */
	 public static ims.RefMan.vo.AdmissionDetailForCoderWorklistVo create(ims.core.admin.pas.domain.objects.AdmissionDetail domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.pas.domain.objects.AdmissionDetail object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.AdmissionDetailForCoderWorklistVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.AdmissionDetail domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.AdmissionDetailForCoderWorklistVo valueObject = (ims.RefMan.vo.AdmissionDetailForCoderWorklistVo) map.getValueObject(domainObject, ims.RefMan.vo.AdmissionDetailForCoderWorklistVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.AdmissionDetailForCoderWorklistVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.pas.domain.objects.AdmissionDetail
	 */
	 public static ims.RefMan.vo.AdmissionDetailForCoderWorklistVo insert(ims.RefMan.vo.AdmissionDetailForCoderWorklistVo valueObject, ims.core.admin.pas.domain.objects.AdmissionDetail domainObject) 
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
	 * @param domainObject ims.core.admin.pas.domain.objects.AdmissionDetail
	 */
	 public static ims.RefMan.vo.AdmissionDetailForCoderWorklistVo insert(DomainObjectMap map, ims.RefMan.vo.AdmissionDetailForCoderWorklistVo valueObject, ims.core.admin.pas.domain.objects.AdmissionDetail domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_AdmissionDetail(domainObject.getId());
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
		valueObject.setPasEvent(ims.RefMan.vo.domain.PasEventForClinicalCodingWorklistVoAssembler.create(map, domainObject.getPasEvent()) );
		// AdmissionDateTime
		java.util.Date AdmissionDateTime = domainObject.getAdmissionDateTime();
		if ( null != AdmissionDateTime ) 
		{
			valueObject.setAdmissionDateTime(new ims.framework.utils.DateTime(AdmissionDateTime) );
		}
		// EstDischargeDate
		java.util.Date EstDischargeDate = domainObject.getEstDischargeDate();
		if ( null != EstDischargeDate ) 
		{
			valueObject.setEstDischargeDate(new ims.framework.utils.DateTime(EstDischargeDate) );
		}
		// CodingStatus
		ims.domain.lookups.LookupInstance instance4 = domainObject.getCodingStatus();
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

			ims.core.vo.lookups.CodingStatus voLookup4 = new ims.core.vo.lookups.CodingStatus(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.CodingStatus parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.CodingStatus(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setCodingStatus(voLookup4);
		}
				// CodingComments
		valueObject.setCodingComments(ims.clinical.vo.domain.CodingCommentVoAssembler.createCodingCommentVoCollectionFromCodingComment(map, domainObject.getCodingComments()) );
		// LastComment
		valueObject.setLastComment(ims.clinical.vo.domain.CodingCommentVoAssembler.create(map, domainObject.getLastComment()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.pas.domain.objects.AdmissionDetail extractAdmissionDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.AdmissionDetailForCoderWorklistVo valueObject) 
	{
		return 	extractAdmissionDetail(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.AdmissionDetail extractAdmissionDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.AdmissionDetailForCoderWorklistVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_AdmissionDetail();
		ims.core.admin.pas.domain.objects.AdmissionDetail domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.pas.domain.objects.AdmissionDetail)domMap.get(valueObject);
			}
			// ims.RefMan.vo.AdmissionDetailForCoderWorklistVo ID_AdmissionDetail field is unknown
			domainObject = new ims.core.admin.pas.domain.objects.AdmissionDetail();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_AdmissionDetail());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.pas.domain.objects.AdmissionDetail)domMap.get(key);
			}
			domainObject = (ims.core.admin.pas.domain.objects.AdmissionDetail) domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.AdmissionDetail.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_AdmissionDetail());

	// SaveAsRefVO - treated as a refVo in extract methods
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
			else
			{
				value1 = (ims.core.admin.pas.domain.objects.PASEvent)domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.PASEvent.class, valueObject.getPasEvent().getBoId());
			}
		}
		domainObject.setPasEvent(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getAdmissionDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setAdmissionDateTime(value2);
		ims.framework.utils.DateTime dateTime3 = valueObject.getEstDischargeDate();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setEstDischargeDate(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getCodingStatus() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getCodingStatus().getID());
		}
		domainObject.setCodingStatus(value4);
		domainObject.setCodingComments(ims.clinical.vo.domain.CodingCommentVoAssembler.extractCodingCommentList(domainFactory, valueObject.getCodingComments(), domainObject.getCodingComments(), domMap));		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.clinical.domain.objects.CodingComment value6 = null;
		if ( null != valueObject.getLastComment() ) 
		{
			if (valueObject.getLastComment().getBoId() == null)
			{
				if (domMap.get(valueObject.getLastComment()) != null)
				{
					value6 = (ims.clinical.domain.objects.CodingComment)domMap.get(valueObject.getLastComment());
				}
			}
			else
			{
				value6 = (ims.clinical.domain.objects.CodingComment)domainFactory.getDomainObject(ims.clinical.domain.objects.CodingComment.class, valueObject.getLastComment().getBoId());
			}
		}
		domainObject.setLastComment(value6);

		return domainObject;
	}

}
