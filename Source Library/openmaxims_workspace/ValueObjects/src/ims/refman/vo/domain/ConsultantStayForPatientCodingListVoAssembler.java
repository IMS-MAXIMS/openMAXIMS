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
 * @author Cornel Ventuneac
 */
public class ConsultantStayForPatientCodingListVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.ConsultantStayForPatientCodingListVo copy(ims.RefMan.vo.ConsultantStayForPatientCodingListVo valueObjectDest, ims.RefMan.vo.ConsultantStayForPatientCodingListVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ConsultantStay(valueObjectSrc.getID_ConsultantStay());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// consultant
		valueObjectDest.setConsultant(valueObjectSrc.getConsultant());
		// transferDateTime
		valueObjectDest.setTransferDateTime(valueObjectSrc.getTransferDateTime());
		// endDateTime
		valueObjectDest.setEndDateTime(valueObjectSrc.getEndDateTime());
		// Specialty
		valueObjectDest.setSpecialty(valueObjectSrc.getSpecialty());
		// CodingStatus
		valueObjectDest.setCodingStatus(valueObjectSrc.getCodingStatus());
		// HistologyStatus
		valueObjectDest.setHistologyStatus(valueObjectSrc.getHistologyStatus());
		// CodingComment
		valueObjectDest.setCodingComment(valueObjectSrc.getCodingComment());
		// service
		valueObjectDest.setService(valueObjectSrc.getService());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createConsultantStayForPatientCodingListVoCollectionFromConsultantStay(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.ConsultantStay objects.
	 */
	public static ims.RefMan.vo.ConsultantStayForPatientCodingListVoCollection createConsultantStayForPatientCodingListVoCollectionFromConsultantStay(java.util.Set domainObjectSet)	
	{
		return createConsultantStayForPatientCodingListVoCollectionFromConsultantStay(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.ConsultantStay objects.
	 */
	public static ims.RefMan.vo.ConsultantStayForPatientCodingListVoCollection createConsultantStayForPatientCodingListVoCollectionFromConsultantStay(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.ConsultantStayForPatientCodingListVoCollection voList = new ims.RefMan.vo.ConsultantStayForPatientCodingListVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.pas.domain.objects.ConsultantStay domainObject = (ims.core.admin.pas.domain.objects.ConsultantStay) iterator.next();
			ims.RefMan.vo.ConsultantStayForPatientCodingListVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.ConsultantStay objects.
	 */
	public static ims.RefMan.vo.ConsultantStayForPatientCodingListVoCollection createConsultantStayForPatientCodingListVoCollectionFromConsultantStay(java.util.List domainObjectList) 
	{
		return createConsultantStayForPatientCodingListVoCollectionFromConsultantStay(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.ConsultantStay objects.
	 */
	public static ims.RefMan.vo.ConsultantStayForPatientCodingListVoCollection createConsultantStayForPatientCodingListVoCollectionFromConsultantStay(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.ConsultantStayForPatientCodingListVoCollection voList = new ims.RefMan.vo.ConsultantStayForPatientCodingListVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.ConsultantStay domainObject = (ims.core.admin.pas.domain.objects.ConsultantStay) domainObjectList.get(i);
			ims.RefMan.vo.ConsultantStayForPatientCodingListVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.pas.domain.objects.ConsultantStay set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractConsultantStaySet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ConsultantStayForPatientCodingListVoCollection voCollection) 
	 {
	 	return extractConsultantStaySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractConsultantStaySet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ConsultantStayForPatientCodingListVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ConsultantStayForPatientCodingListVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.ConsultantStay domainObject = ConsultantStayForPatientCodingListVoAssembler.extractConsultantStay(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.pas.domain.objects.ConsultantStay list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractConsultantStayList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ConsultantStayForPatientCodingListVoCollection voCollection) 
	 {
	 	return extractConsultantStayList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractConsultantStayList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ConsultantStayForPatientCodingListVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ConsultantStayForPatientCodingListVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.ConsultantStay domainObject = ConsultantStayForPatientCodingListVoAssembler.extractConsultantStay(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.pas.domain.objects.ConsultantStay object.
	 * @param domainObject ims.core.admin.pas.domain.objects.ConsultantStay
	 */
	 public static ims.RefMan.vo.ConsultantStayForPatientCodingListVo create(ims.core.admin.pas.domain.objects.ConsultantStay domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.pas.domain.objects.ConsultantStay object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.ConsultantStayForPatientCodingListVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.ConsultantStay domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.ConsultantStayForPatientCodingListVo valueObject = (ims.RefMan.vo.ConsultantStayForPatientCodingListVo) map.getValueObject(domainObject, ims.RefMan.vo.ConsultantStayForPatientCodingListVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.ConsultantStayForPatientCodingListVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.pas.domain.objects.ConsultantStay
	 */
	 public static ims.RefMan.vo.ConsultantStayForPatientCodingListVo insert(ims.RefMan.vo.ConsultantStayForPatientCodingListVo valueObject, ims.core.admin.pas.domain.objects.ConsultantStay domainObject) 
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
	 * @param domainObject ims.core.admin.pas.domain.objects.ConsultantStay
	 */
	 public static ims.RefMan.vo.ConsultantStayForPatientCodingListVo insert(DomainObjectMap map, ims.RefMan.vo.ConsultantStayForPatientCodingListVo valueObject, ims.core.admin.pas.domain.objects.ConsultantStay domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ConsultantStay(domainObject.getId());
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
			
		// consultant
		valueObject.setConsultant(ims.core.vo.domain.MedicLiteVoAssembler.create(map, domainObject.getConsultant()) );
		// transferDateTime
		java.util.Date transferDateTime = domainObject.getTransferDateTime();
		if ( null != transferDateTime ) 
		{
			valueObject.setTransferDateTime(new ims.framework.utils.DateTime(transferDateTime) );
		}
		// endDateTime
		java.util.Date endDateTime = domainObject.getEndDateTime();
		if ( null != endDateTime ) 
		{
			valueObject.setEndDateTime(new ims.framework.utils.DateTime(endDateTime) );
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
				// CodingStatus
		ims.domain.lookups.LookupInstance instance5 = domainObject.getCodingStatus();
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

			ims.core.vo.lookups.CodingStatus voLookup5 = new ims.core.vo.lookups.CodingStatus(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.CodingStatus parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.CodingStatus(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setCodingStatus(voLookup5);
		}
				// HistologyStatus
		ims.domain.lookups.LookupInstance instance6 = domainObject.getHistologyStatus();
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

			ims.clinical.vo.lookups.HistologyStatus voLookup6 = new ims.clinical.vo.lookups.HistologyStatus(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.clinical.vo.lookups.HistologyStatus parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.clinical.vo.lookups.HistologyStatus(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setHistologyStatus(voLookup6);
		}
				// CodingComment
		valueObject.setCodingComment(ims.clinical.vo.domain.CodingCommentVoAssembler.createCodingCommentVoCollectionFromCodingComment(map, domainObject.getCodingComment()) );
		// service
		valueObject.setService(ims.core.vo.domain.ServiceLiteVoAssembler.create(map, domainObject.getService()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.pas.domain.objects.ConsultantStay extractConsultantStay(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ConsultantStayForPatientCodingListVo valueObject) 
	{
		return 	extractConsultantStay(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.ConsultantStay extractConsultantStay(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ConsultantStayForPatientCodingListVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ConsultantStay();
		ims.core.admin.pas.domain.objects.ConsultantStay domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.pas.domain.objects.ConsultantStay)domMap.get(valueObject);
			}
			// ims.RefMan.vo.ConsultantStayForPatientCodingListVo ID_ConsultantStay field is unknown
			domainObject = new ims.core.admin.pas.domain.objects.ConsultantStay();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ConsultantStay());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.pas.domain.objects.ConsultantStay)domMap.get(key);
			}
			domainObject = (ims.core.admin.pas.domain.objects.ConsultantStay) domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.ConsultantStay.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ConsultantStay());

		domainObject.setConsultant(ims.core.vo.domain.MedicLiteVoAssembler.extractMedic(domainFactory, valueObject.getConsultant(), domMap));
		ims.framework.utils.DateTime dateTime2 = valueObject.getTransferDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setTransferDateTime(value2);
		ims.framework.utils.DateTime dateTime3 = valueObject.getEndDateTime();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setEndDateTime(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getCodingStatus() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getCodingStatus().getID());
		}
		domainObject.setCodingStatus(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getHistologyStatus() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getHistologyStatus().getID());
		}
		domainObject.setHistologyStatus(value6);
		domainObject.setCodingComment(ims.clinical.vo.domain.CodingCommentVoAssembler.extractCodingCommentList(domainFactory, valueObject.getCodingComment(), domainObject.getCodingComment(), domMap));		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Service value8 = null;
		if ( null != valueObject.getService() ) 
		{
			if (valueObject.getService().getBoId() == null)
			{
				if (domMap.get(valueObject.getService()) != null)
				{
					value8 = (ims.core.clinical.domain.objects.Service)domMap.get(valueObject.getService());
				}
			}
			else
			{
				value8 = (ims.core.clinical.domain.objects.Service)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Service.class, valueObject.getService().getBoId());
			}
		}
		domainObject.setService(value8);

		return domainObject;
	}

}
