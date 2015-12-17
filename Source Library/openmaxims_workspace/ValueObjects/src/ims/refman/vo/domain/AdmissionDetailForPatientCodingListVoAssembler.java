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
public class AdmissionDetailForPatientCodingListVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.AdmissionDetailForPatientCodingListVo copy(ims.RefMan.vo.AdmissionDetailForPatientCodingListVo valueObjectDest, ims.RefMan.vo.AdmissionDetailForPatientCodingListVo valueObjectSrc) 
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
		// Ward
		valueObjectDest.setWard(valueObjectSrc.getWard());
		// Consultant
		valueObjectDest.setConsultant(valueObjectSrc.getConsultant());
		// WardType
		valueObjectDest.setWardType(valueObjectSrc.getWardType());
		// EstDischargeDate
		valueObjectDest.setEstDischargeDate(valueObjectSrc.getEstDischargeDate());
		// AdmissionTransactionDateTime
		valueObjectDest.setAdmissionTransactionDateTime(valueObjectSrc.getAdmissionTransactionDateTime());
		// CodingStatus
		valueObjectDest.setCodingStatus(valueObjectSrc.getCodingStatus());
		// CodingComments
		valueObjectDest.setCodingComments(valueObjectSrc.getCodingComments());
		// AwaitingHistology
		valueObjectDest.setAwaitingHistology(valueObjectSrc.getAwaitingHistology());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createAdmissionDetailForPatientCodingListVoCollectionFromAdmissionDetail(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.AdmissionDetail objects.
	 */
	public static ims.RefMan.vo.AdmissionDetailForPatientCodingListVoCollection createAdmissionDetailForPatientCodingListVoCollectionFromAdmissionDetail(java.util.Set domainObjectSet)	
	{
		return createAdmissionDetailForPatientCodingListVoCollectionFromAdmissionDetail(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.AdmissionDetail objects.
	 */
	public static ims.RefMan.vo.AdmissionDetailForPatientCodingListVoCollection createAdmissionDetailForPatientCodingListVoCollectionFromAdmissionDetail(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.AdmissionDetailForPatientCodingListVoCollection voList = new ims.RefMan.vo.AdmissionDetailForPatientCodingListVoCollection();
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
			ims.RefMan.vo.AdmissionDetailForPatientCodingListVo vo = create(map, domainObject);
			
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
	public static ims.RefMan.vo.AdmissionDetailForPatientCodingListVoCollection createAdmissionDetailForPatientCodingListVoCollectionFromAdmissionDetail(java.util.List domainObjectList) 
	{
		return createAdmissionDetailForPatientCodingListVoCollectionFromAdmissionDetail(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.AdmissionDetail objects.
	 */
	public static ims.RefMan.vo.AdmissionDetailForPatientCodingListVoCollection createAdmissionDetailForPatientCodingListVoCollectionFromAdmissionDetail(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.AdmissionDetailForPatientCodingListVoCollection voList = new ims.RefMan.vo.AdmissionDetailForPatientCodingListVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.AdmissionDetail domainObject = (ims.core.admin.pas.domain.objects.AdmissionDetail) domainObjectList.get(i);
			ims.RefMan.vo.AdmissionDetailForPatientCodingListVo vo = create(map, domainObject);

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
	 public static java.util.Set extractAdmissionDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.AdmissionDetailForPatientCodingListVoCollection voCollection) 
	 {
	 	return extractAdmissionDetailSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractAdmissionDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.AdmissionDetailForPatientCodingListVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.AdmissionDetailForPatientCodingListVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.AdmissionDetail domainObject = AdmissionDetailForPatientCodingListVoAssembler.extractAdmissionDetail(domainFactory, vo, domMap);

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
	 public static java.util.List extractAdmissionDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.AdmissionDetailForPatientCodingListVoCollection voCollection) 
	 {
	 	return extractAdmissionDetailList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractAdmissionDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.AdmissionDetailForPatientCodingListVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.AdmissionDetailForPatientCodingListVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.AdmissionDetail domainObject = AdmissionDetailForPatientCodingListVoAssembler.extractAdmissionDetail(domainFactory, vo, domMap);

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
	 public static ims.RefMan.vo.AdmissionDetailForPatientCodingListVo create(ims.core.admin.pas.domain.objects.AdmissionDetail domainObject) 
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
	  public static ims.RefMan.vo.AdmissionDetailForPatientCodingListVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.AdmissionDetail domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.AdmissionDetailForPatientCodingListVo valueObject = (ims.RefMan.vo.AdmissionDetailForPatientCodingListVo) map.getValueObject(domainObject, ims.RefMan.vo.AdmissionDetailForPatientCodingListVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.AdmissionDetailForPatientCodingListVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.RefMan.vo.AdmissionDetailForPatientCodingListVo insert(ims.RefMan.vo.AdmissionDetailForPatientCodingListVo valueObject, ims.core.admin.pas.domain.objects.AdmissionDetail domainObject) 
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
	 public static ims.RefMan.vo.AdmissionDetailForPatientCodingListVo insert(DomainObjectMap map, ims.RefMan.vo.AdmissionDetailForPatientCodingListVo valueObject, ims.core.admin.pas.domain.objects.AdmissionDetail domainObject) 
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
		// Consultant
		if (domainObject.getConsultant() != null)
		{
			if(domainObject.getConsultant() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getConsultant();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setConsultant(new ims.core.resource.people.vo.MedicRefVo(id, -1));				
			}
			else
			{
				valueObject.setConsultant(new ims.core.resource.people.vo.MedicRefVo(domainObject.getConsultant().getId(), domainObject.getConsultant().getVersion()));
			}
		}
		// WardType
		ims.domain.lookups.LookupInstance instance5 = domainObject.getWardType();
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

			ims.core.vo.lookups.WardType voLookup5 = new ims.core.vo.lookups.WardType(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.WardType parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.WardType(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setWardType(voLookup5);
		}
				// EstDischargeDate
		java.util.Date EstDischargeDate = domainObject.getEstDischargeDate();
		if ( null != EstDischargeDate ) 
		{
			valueObject.setEstDischargeDate(new ims.framework.utils.DateTime(EstDischargeDate) );
		}
		// AdmissionTransactionDateTime
		java.util.Date AdmissionTransactionDateTime = domainObject.getAdmissionTransactionDateTime();
		if ( null != AdmissionTransactionDateTime ) 
		{
			valueObject.setAdmissionTransactionDateTime(new ims.framework.utils.DateTime(AdmissionTransactionDateTime) );
		}
		// CodingStatus
		ims.domain.lookups.LookupInstance instance8 = domainObject.getCodingStatus();
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

			ims.core.vo.lookups.CodingStatus voLookup8 = new ims.core.vo.lookups.CodingStatus(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.CodingStatus parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.CodingStatus(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setCodingStatus(voLookup8);
		}
				// CodingComments
		valueObject.setCodingComments(ims.clinical.vo.domain.CodingCommentVoAssembler.createCodingCommentVoCollectionFromCodingComment(map, domainObject.getCodingComments()) );
		// AwaitingHistology
		valueObject.setAwaitingHistology(ims.RefMan.vo.domain.AwaitingHistologyForPatientCodingListVoAssembler.createAwaitingHistologyForPatientCodingListVoCollectionFromAwaitingHistology(map, domainObject.getAwaitingHistology()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.pas.domain.objects.AdmissionDetail extractAdmissionDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.AdmissionDetailForPatientCodingListVo valueObject) 
	{
		return 	extractAdmissionDetail(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.AdmissionDetail extractAdmissionDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.AdmissionDetailForPatientCodingListVo valueObject, HashMap domMap) 
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
			// ims.RefMan.vo.AdmissionDetailForPatientCodingListVo ID_AdmissionDetail field is unknown
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
		ims.core.resource.place.domain.objects.Location value3 = null;
		if ( null != valueObject.getWard() ) 
		{
			if (valueObject.getWard().getBoId() == null)
			{
				if (domMap.get(valueObject.getWard()) != null)
				{
					value3 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getWard());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getWard();	
			}
			else
			{
				value3 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getWard().getBoId());
			}
		}
		domainObject.setWard(value3);
		ims.core.resource.people.domain.objects.Medic value4 = null;
		if ( null != valueObject.getConsultant() ) 
		{
			if (valueObject.getConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getConsultant()) != null)
				{
					value4 = (ims.core.resource.people.domain.objects.Medic)domMap.get(valueObject.getConsultant());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getConsultant();	
			}
			else
			{
				value4 = (ims.core.resource.people.domain.objects.Medic)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Medic.class, valueObject.getConsultant().getBoId());
			}
		}
		domainObject.setConsultant(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getWardType() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getWardType().getID());
		}
		domainObject.setWardType(value5);
		ims.framework.utils.DateTime dateTime6 = valueObject.getEstDischargeDate();
		java.util.Date value6 = null;
		if ( dateTime6 != null ) 
		{
			value6 = dateTime6.getJavaDate();
		}
		domainObject.setEstDischargeDate(value6);
		ims.framework.utils.DateTime dateTime7 = valueObject.getAdmissionTransactionDateTime();
		java.util.Date value7 = null;
		if ( dateTime7 != null ) 
		{
			value7 = dateTime7.getJavaDate();
		}
		domainObject.setAdmissionTransactionDateTime(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getCodingStatus() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getCodingStatus().getID());
		}
		domainObject.setCodingStatus(value8);
		domainObject.setCodingComments(ims.clinical.vo.domain.CodingCommentVoAssembler.extractCodingCommentList(domainFactory, valueObject.getCodingComments(), domainObject.getCodingComments(), domMap));		

		// SaveAsRefVO treated as RefValueObject
		ims.clinical.vo.AwaitingHistologyRefVoCollection refCollection10 = new ims.clinical.vo.AwaitingHistologyRefVoCollection();
		if (valueObject.getAwaitingHistology() != null)
		{
			for (int i10=0; i10<valueObject.getAwaitingHistology().size(); i10++)
			{
				ims.clinical.vo.AwaitingHistologyRefVo ref10 = (ims.clinical.vo.AwaitingHistologyRefVo)valueObject.getAwaitingHistology().get(i10);
				refCollection10.add(ref10);
			}
		}
		int size10 = (null == refCollection10) ? 0 : refCollection10.size();		
		java.util.List domainAwaitingHistology10 = domainObject.getAwaitingHistology();
		if (domainAwaitingHistology10 == null)
		{
			domainAwaitingHistology10 = new java.util.ArrayList();
		}
		for(int i=0; i < size10; i++) 
		{
			ims.clinical.vo.AwaitingHistologyRefVo vo = refCollection10.get(i);			
			ims.clinical.domain.objects.AwaitingHistology dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.clinical.domain.objects.AwaitingHistology)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.clinical.domain.objects.AwaitingHistology)domainFactory.getDomainObject( ims.clinical.domain.objects.AwaitingHistology.class, vo.getBoId());
				}
			}

			int domIdx = domainAwaitingHistology10.indexOf(dom);
			if (domIdx == -1)
			{
				domainAwaitingHistology10.add(i, dom);
			}
			else if (i != domIdx && i < domainAwaitingHistology10.size())
			{
				Object tmp = domainAwaitingHistology10.get(i);
				domainAwaitingHistology10.set(i, domainAwaitingHistology10.get(domIdx));
				domainAwaitingHistology10.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i10 = domainAwaitingHistology10.size();
		while (i10 > size10)
		{
			domainAwaitingHistology10.remove(i10-1);
			i10 = domainAwaitingHistology10.size();
		}
		
		domainObject.setAwaitingHistology(domainAwaitingHistology10);		

		return domainObject;
	}

}
