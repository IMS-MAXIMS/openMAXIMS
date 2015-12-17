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
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Ander Telleria
 */
public class ReferralLetterDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.ReferralLetterDetailsVo copy(ims.clinical.vo.ReferralLetterDetailsVo valueObjectDest, ims.clinical.vo.ReferralLetterDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ReferralLetterDetails(valueObjectSrc.getID_ReferralLetterDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Service
		valueObjectDest.setService(valueObjectSrc.getService());
		// ReferrerType
		valueObjectDest.setReferrerType(valueObjectSrc.getReferrerType());
		// GPName
		valueObjectDest.setGPName(valueObjectSrc.getGPName());
		// AlliedHealthProfName
		valueObjectDest.setAlliedHealthProfName(valueObjectSrc.getAlliedHealthProfName());
		// DateOfReferral
		valueObjectDest.setDateOfReferral(valueObjectSrc.getDateOfReferral());
		// DateReferralReceived
		valueObjectDest.setDateReferralReceived(valueObjectSrc.getDateReferralReceived());
		// End18WW
		valueObjectDest.setEnd18WW(valueObjectSrc.getEnd18WW());
		// InterpreterRequired
		valueObjectDest.setInterpreterRequired(valueObjectSrc.getInterpreterRequired());
		// Language
		valueObjectDest.setLanguage(valueObjectSrc.getLanguage());
		// TransportRequired
		valueObjectDest.setTransportRequired(valueObjectSrc.getTransportRequired());
		// Transport
		valueObjectDest.setTransport(valueObjectSrc.getTransport());
		// AuthoringUser
		valueObjectDest.setAuthoringUser(valueObjectSrc.getAuthoringUser());
		// AuthoringDateTime
		valueObjectDest.setAuthoringDateTime(valueObjectSrc.getAuthoringDateTime());
		// CopyDischargeToPatient
		valueObjectDest.setCopyDischargeToPatient(valueObjectSrc.getCopyDischargeToPatient());
		// PCT
		valueObjectDest.setPCT(valueObjectSrc.getPCT());
		// Function
		valueObjectDest.setFunction(valueObjectSrc.getFunction());
		// OtherLanguage
		valueObjectDest.setOtherLanguage(valueObjectSrc.getOtherLanguage());
		// SpecialRequirements
		valueObjectDest.setSpecialRequirements(valueObjectSrc.getSpecialRequirements());
		// IsDADReferral
		valueObjectDest.setIsDADReferral(valueObjectSrc.getIsDADReferral());
		// DadUbrn
		valueObjectDest.setDadUbrn(valueObjectSrc.getDadUbrn());
		// Practice
		valueObjectDest.setPractice(valueObjectSrc.getPractice());
		// IsReferrerPatientsGp
		valueObjectDest.setIsReferrerPatientsGp(valueObjectSrc.getIsReferrerPatientsGp());
		// Procedure
		valueObjectDest.setProcedure(valueObjectSrc.getProcedure());
		// Location
		valueObjectDest.setLocation(valueObjectSrc.getLocation());
		// EndDateKPI
		valueObjectDest.setEndDateKPI(valueObjectSrc.getEndDateKPI());
		// EndDateEmailKPI
		valueObjectDest.setEndDateEmailKPI(valueObjectSrc.getEndDateEmailKPI());
		// EndDatePaperKPI
		valueObjectDest.setEndDatePaperKPI(valueObjectSrc.getEndDatePaperKPI());
		// Consultant
		valueObjectDest.setConsultant(valueObjectSrc.getConsultant());
		// TransportRequirements
		valueObjectDest.setTransportRequirements(valueObjectSrc.getTransportRequirements());
		// ReferringConsultant
		valueObjectDest.setReferringConsultant(valueObjectSrc.getReferringConsultant());
		// OriginalDateOfReferral
		valueObjectDest.setOriginalDateOfReferral(valueObjectSrc.getOriginalDateOfReferral());
		// RefererAddress
		valueObjectDest.setRefererAddress(valueObjectSrc.getRefererAddress());
		// TransferedBY
		valueObjectDest.setTransferedBY(valueObjectSrc.getTransferedBY());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createReferralLetterDetailsVoCollectionFromReferralLetterDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.ReferralLetterDetails objects.
	 */
	public static ims.clinical.vo.ReferralLetterDetailsVoCollection createReferralLetterDetailsVoCollectionFromReferralLetterDetails(java.util.Set domainObjectSet)	
	{
		return createReferralLetterDetailsVoCollectionFromReferralLetterDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.ReferralLetterDetails objects.
	 */
	public static ims.clinical.vo.ReferralLetterDetailsVoCollection createReferralLetterDetailsVoCollectionFromReferralLetterDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.ReferralLetterDetailsVoCollection voList = new ims.clinical.vo.ReferralLetterDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.ReferralLetterDetails domainObject = (ims.core.clinical.domain.objects.ReferralLetterDetails) iterator.next();
			ims.clinical.vo.ReferralLetterDetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.ReferralLetterDetails objects.
	 */
	public static ims.clinical.vo.ReferralLetterDetailsVoCollection createReferralLetterDetailsVoCollectionFromReferralLetterDetails(java.util.List domainObjectList) 
	{
		return createReferralLetterDetailsVoCollectionFromReferralLetterDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.ReferralLetterDetails objects.
	 */
	public static ims.clinical.vo.ReferralLetterDetailsVoCollection createReferralLetterDetailsVoCollectionFromReferralLetterDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.ReferralLetterDetailsVoCollection voList = new ims.clinical.vo.ReferralLetterDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.ReferralLetterDetails domainObject = (ims.core.clinical.domain.objects.ReferralLetterDetails) domainObjectList.get(i);
			ims.clinical.vo.ReferralLetterDetailsVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.ReferralLetterDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractReferralLetterDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ReferralLetterDetailsVoCollection voCollection) 
	 {
	 	return extractReferralLetterDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractReferralLetterDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ReferralLetterDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.ReferralLetterDetailsVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.ReferralLetterDetails domainObject = ReferralLetterDetailsVoAssembler.extractReferralLetterDetails(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.ReferralLetterDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractReferralLetterDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ReferralLetterDetailsVoCollection voCollection) 
	 {
	 	return extractReferralLetterDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractReferralLetterDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ReferralLetterDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.ReferralLetterDetailsVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.ReferralLetterDetails domainObject = ReferralLetterDetailsVoAssembler.extractReferralLetterDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.ReferralLetterDetails object.
	 * @param domainObject ims.core.clinical.domain.objects.ReferralLetterDetails
	 */
	 public static ims.clinical.vo.ReferralLetterDetailsVo create(ims.core.clinical.domain.objects.ReferralLetterDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.ReferralLetterDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.ReferralLetterDetailsVo create(DomainObjectMap map, ims.core.clinical.domain.objects.ReferralLetterDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.ReferralLetterDetailsVo valueObject = (ims.clinical.vo.ReferralLetterDetailsVo) map.getValueObject(domainObject, ims.clinical.vo.ReferralLetterDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.ReferralLetterDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.ReferralLetterDetails
	 */
	 public static ims.clinical.vo.ReferralLetterDetailsVo insert(ims.clinical.vo.ReferralLetterDetailsVo valueObject, ims.core.clinical.domain.objects.ReferralLetterDetails domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.ReferralLetterDetails
	 */
	 public static ims.clinical.vo.ReferralLetterDetailsVo insert(DomainObjectMap map, ims.clinical.vo.ReferralLetterDetailsVo valueObject, ims.core.clinical.domain.objects.ReferralLetterDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ReferralLetterDetails(domainObject.getId());
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
			
		// Service
		valueObject.setService(ims.core.vo.domain.ServiceLiteVoAssembler.create(map, domainObject.getService()) );
		// ReferrerType
		ims.domain.lookups.LookupInstance instance2 = domainObject.getReferrerType();
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

			ims.core.vo.lookups.SourceOfReferral voLookup2 = new ims.core.vo.lookups.SourceOfReferral(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.SourceOfReferral parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.SourceOfReferral(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setReferrerType(voLookup2);
		}
				// GPName
		valueObject.setGPName(ims.core.vo.domain.GpLiteVoAssembler.create(map, domainObject.getGPName()) );
		// AlliedHealthProfName
		valueObject.setAlliedHealthProfName(domainObject.getAlliedHealthProfName());
		// DateOfReferral
		java.util.Date DateOfReferral = domainObject.getDateOfReferral();
		if ( null != DateOfReferral ) 
		{
			valueObject.setDateOfReferral(new ims.framework.utils.Date(DateOfReferral) );
		}
		// DateReferralReceived
		java.util.Date DateReferralReceived = domainObject.getDateReferralReceived();
		if ( null != DateReferralReceived ) 
		{
			valueObject.setDateReferralReceived(new ims.framework.utils.Date(DateReferralReceived) );
		}
		// End18WW
		java.util.Date End18WW = domainObject.getEnd18WW();
		if ( null != End18WW ) 
		{
			valueObject.setEnd18WW(new ims.framework.utils.Date(End18WW) );
		}
		// InterpreterRequired
		ims.domain.lookups.LookupInstance instance8 = domainObject.getInterpreterRequired();
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

			ims.core.vo.lookups.YesNo voLookup8 = new ims.core.vo.lookups.YesNo(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.YesNo(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setInterpreterRequired(voLookup8);
		}
				// Language
		ims.domain.lookups.LookupInstance instance9 = domainObject.getLanguage();
		if ( null != instance9 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance9.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance9.getImage().getImageId(), instance9.getImage().getImagePath());
			}
			color = instance9.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.Language voLookup9 = new ims.core.vo.lookups.Language(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.Language parentVoLookup9 = voLookup9;
			ims.domain.lookups.LookupInstance parent9 = instance9.getParent();
			while (parent9 != null)
			{
				if (parent9.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent9.getImage().getImageId(), parent9.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent9.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup9.setParent(new ims.core.vo.lookups.Language(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setLanguage(voLookup9);
		}
				// TransportRequired
		ims.domain.lookups.LookupInstance instance10 = domainObject.getTransportRequired();
		if ( null != instance10 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance10.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance10.getImage().getImageId(), instance10.getImage().getImagePath());
			}
			color = instance10.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup10 = new ims.core.vo.lookups.YesNo(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup10 = voLookup10;
			ims.domain.lookups.LookupInstance parent10 = instance10.getParent();
			while (parent10 != null)
			{
				if (parent10.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent10.getImage().getImageId(), parent10.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent10.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup10.setParent(new ims.core.vo.lookups.YesNo(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setTransportRequired(voLookup10);
		}
				// Transport
		ims.domain.lookups.LookupInstance instance11 = domainObject.getTransport();
		if ( null != instance11 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance11.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance11.getImage().getImageId(), instance11.getImage().getImagePath());
			}
			color = instance11.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.ApptTransportType voLookup11 = new ims.scheduling.vo.lookups.ApptTransportType(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.scheduling.vo.lookups.ApptTransportType parentVoLookup11 = voLookup11;
			ims.domain.lookups.LookupInstance parent11 = instance11.getParent();
			while (parent11 != null)
			{
				if (parent11.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent11.getImage().getImageId(), parent11.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent11.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup11.setParent(new ims.scheduling.vo.lookups.ApptTransportType(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setTransport(voLookup11);
		}
				// AuthoringUser
		valueObject.setAuthoringUser(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getAuthoringUser()) );
		// AuthoringDateTime
		java.util.Date AuthoringDateTime = domainObject.getAuthoringDateTime();
		if ( null != AuthoringDateTime ) 
		{
			valueObject.setAuthoringDateTime(new ims.framework.utils.DateTime(AuthoringDateTime) );
		}
		// CopyDischargeToPatient
		valueObject.setCopyDischargeToPatient( domainObject.isCopyDischargeToPatient() );
		// PCT
		valueObject.setPCT(domainObject.getPCT());
		// Function
		valueObject.setFunction(ims.core.vo.domain.ServiceFunctionLiteVoAssembler.create(map, domainObject.getFunction()) );
		// OtherLanguage
		valueObject.setOtherLanguage(domainObject.getOtherLanguage());
		// SpecialRequirements
		valueObject.setSpecialRequirements(domainObject.getSpecialRequirements());
		// IsDADReferral
		valueObject.setIsDADReferral( domainObject.isIsDADReferral() );
		// DadUbrn
		valueObject.setDadUbrn(domainObject.getDadUbrn());
		// Practice
		valueObject.setPractice(ims.core.vo.domain.OrganisationWithSitesVoAssembler.create(map, domainObject.getPractice()) );
		// IsReferrerPatientsGp
		valueObject.setIsReferrerPatientsGp( domainObject.isIsReferrerPatientsGp() );
		// Procedure
		valueObject.setProcedure(ims.core.vo.domain.ProcedureLiteVoAssembler.create(map, domainObject.getProcedure()) );
		// Location
		valueObject.setLocation(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getLocation()) );
		// EndDateKPI
		java.util.Date EndDateKPI = domainObject.getEndDateKPI();
		if ( null != EndDateKPI ) 
		{
			valueObject.setEndDateKPI(new ims.framework.utils.Date(EndDateKPI) );
		}
		// EndDateEmailKPI
		java.util.Date EndDateEmailKPI = domainObject.getEndDateEmailKPI();
		if ( null != EndDateEmailKPI ) 
		{
			valueObject.setEndDateEmailKPI(new ims.framework.utils.Date(EndDateEmailKPI) );
		}
		// EndDatePaperKPI
		java.util.Date EndDatePaperKPI = domainObject.getEndDatePaperKPI();
		if ( null != EndDatePaperKPI ) 
		{
			valueObject.setEndDatePaperKPI(new ims.framework.utils.Date(EndDatePaperKPI) );
		}
		// Consultant
		valueObject.setConsultant(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getConsultant()) );
		// TransportRequirements
		valueObject.setTransportRequirements(ims.core.vo.domain.PatientTransportRequirementsVoAssembler.create(map, domainObject.getTransportRequirements()) );
		// ReferringConsultant
		valueObject.setReferringConsultant(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getReferringConsultant()) );
		// OriginalDateOfReferral
		java.util.Date OriginalDateOfReferral = domainObject.getOriginalDateOfReferral();
		if ( null != OriginalDateOfReferral ) 
		{
			valueObject.setOriginalDateOfReferral(new ims.framework.utils.Date(OriginalDateOfReferral) );
		}
		// RefererAddress
		valueObject.setRefererAddress(domainObject.getRefererAddress());
		// TransferedBY
		valueObject.setTransferedBY(domainObject.getTransferedBY());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.ReferralLetterDetails extractReferralLetterDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ReferralLetterDetailsVo valueObject) 
	{
		return 	extractReferralLetterDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.ReferralLetterDetails extractReferralLetterDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ReferralLetterDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ReferralLetterDetails();
		ims.core.clinical.domain.objects.ReferralLetterDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.ReferralLetterDetails)domMap.get(valueObject);
			}
			// ims.clinical.vo.ReferralLetterDetailsVo ID_ReferralLetterDetails field is unknown
			domainObject = new ims.core.clinical.domain.objects.ReferralLetterDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ReferralLetterDetails());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.ReferralLetterDetails)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.ReferralLetterDetails) domainFactory.getDomainObject(ims.core.clinical.domain.objects.ReferralLetterDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ReferralLetterDetails());

		domainObject.setService(ims.core.vo.domain.ServiceLiteVoAssembler.extractService(domainFactory, valueObject.getService(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getReferrerType() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getReferrerType().getID());
		}
		domainObject.setReferrerType(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Gp value3 = null;
		if ( null != valueObject.getGPName() ) 
		{
			if (valueObject.getGPName().getBoId() == null)
			{
				if (domMap.get(valueObject.getGPName()) != null)
				{
					value3 = (ims.core.resource.people.domain.objects.Gp)domMap.get(valueObject.getGPName());
				}
			}
			else
			{
				value3 = (ims.core.resource.people.domain.objects.Gp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Gp.class, valueObject.getGPName().getBoId());
			}
		}
		domainObject.setGPName(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAlliedHealthProfName() != null && valueObject.getAlliedHealthProfName().equals(""))
		{
			valueObject.setAlliedHealthProfName(null);
		}
		domainObject.setAlliedHealthProfName(valueObject.getAlliedHealthProfName());
		java.util.Date value5 = null;
		ims.framework.utils.Date date5 = valueObject.getDateOfReferral();		
		if ( date5 != null ) 
		{
			value5 = date5.getDate();
		}
		domainObject.setDateOfReferral(value5);
		java.util.Date value6 = null;
		ims.framework.utils.Date date6 = valueObject.getDateReferralReceived();		
		if ( date6 != null ) 
		{
			value6 = date6.getDate();
		}
		domainObject.setDateReferralReceived(value6);
		java.util.Date value7 = null;
		ims.framework.utils.Date date7 = valueObject.getEnd18WW();		
		if ( date7 != null ) 
		{
			value7 = date7.getDate();
		}
		domainObject.setEnd18WW(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getInterpreterRequired() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getInterpreterRequired().getID());
		}
		domainObject.setInterpreterRequired(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getLanguage() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getLanguage().getID());
		}
		domainObject.setLanguage(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getTransportRequired() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getTransportRequired().getID());
		}
		domainObject.setTransportRequired(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getTransport() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getTransport().getID());
		}
		domainObject.setTransport(value11);
		domainObject.setAuthoringUser(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.extractMemberOfStaff(domainFactory, valueObject.getAuthoringUser(), domMap));
		ims.framework.utils.DateTime dateTime13 = valueObject.getAuthoringDateTime();
		java.util.Date value13 = null;
		if ( dateTime13 != null ) 
		{
			value13 = dateTime13.getJavaDate();
		}
		domainObject.setAuthoringDateTime(value13);
		domainObject.setCopyDischargeToPatient(valueObject.getCopyDischargeToPatient());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPCT() != null && valueObject.getPCT().equals(""))
		{
			valueObject.setPCT(null);
		}
		domainObject.setPCT(valueObject.getPCT());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.ServiceFunction value16 = null;
		if ( null != valueObject.getFunction() ) 
		{
			if (valueObject.getFunction().getBoId() == null)
			{
				if (domMap.get(valueObject.getFunction()) != null)
				{
					value16 = (ims.core.clinical.domain.objects.ServiceFunction)domMap.get(valueObject.getFunction());
				}
			}
			else
			{
				value16 = (ims.core.clinical.domain.objects.ServiceFunction)domainFactory.getDomainObject(ims.core.clinical.domain.objects.ServiceFunction.class, valueObject.getFunction().getBoId());
			}
		}
		domainObject.setFunction(value16);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOtherLanguage() != null && valueObject.getOtherLanguage().equals(""))
		{
			valueObject.setOtherLanguage(null);
		}
		domainObject.setOtherLanguage(valueObject.getOtherLanguage());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSpecialRequirements() != null && valueObject.getSpecialRequirements().equals(""))
		{
			valueObject.setSpecialRequirements(null);
		}
		domainObject.setSpecialRequirements(valueObject.getSpecialRequirements());
		domainObject.setIsDADReferral(valueObject.getIsDADReferral());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDadUbrn() != null && valueObject.getDadUbrn().equals(""))
		{
			valueObject.setDadUbrn(null);
		}
		domainObject.setDadUbrn(valueObject.getDadUbrn());
		domainObject.setPractice(ims.core.vo.domain.OrganisationWithSitesVoAssembler.extractOrganisation(domainFactory, valueObject.getPractice(), domMap));
		domainObject.setIsReferrerPatientsGp(valueObject.getIsReferrerPatientsGp());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Procedure value23 = null;
		if ( null != valueObject.getProcedure() ) 
		{
			if (valueObject.getProcedure().getBoId() == null)
			{
				if (domMap.get(valueObject.getProcedure()) != null)
				{
					value23 = (ims.core.clinical.domain.objects.Procedure)domMap.get(valueObject.getProcedure());
				}
			}
			else
			{
				value23 = (ims.core.clinical.domain.objects.Procedure)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Procedure.class, valueObject.getProcedure().getBoId());
			}
		}
		domainObject.setProcedure(value23);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value24 = null;
		if ( null != valueObject.getLocation() ) 
		{
			if (valueObject.getLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getLocation()) != null)
				{
					value24 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getLocation());
				}
			}
			else
			{
				value24 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getLocation().getBoId());
			}
		}
		domainObject.setLocation(value24);
		java.util.Date value25 = null;
		ims.framework.utils.Date date25 = valueObject.getEndDateKPI();		
		if ( date25 != null ) 
		{
			value25 = date25.getDate();
		}
		domainObject.setEndDateKPI(value25);
		java.util.Date value26 = null;
		ims.framework.utils.Date date26 = valueObject.getEndDateEmailKPI();		
		if ( date26 != null ) 
		{
			value26 = date26.getDate();
		}
		domainObject.setEndDateEmailKPI(value26);
		java.util.Date value27 = null;
		ims.framework.utils.Date date27 = valueObject.getEndDatePaperKPI();		
		if ( date27 != null ) 
		{
			value27 = date27.getDate();
		}
		domainObject.setEndDatePaperKPI(value27);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value28 = null;
		if ( null != valueObject.getConsultant() ) 
		{
			if (valueObject.getConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getConsultant()) != null)
				{
					value28 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getConsultant());
				}
			}
			else
			{
				value28 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getConsultant().getBoId());
			}
		}
		domainObject.setConsultant(value28);
		domainObject.setTransportRequirements(ims.core.vo.domain.PatientTransportRequirementsVoAssembler.extractPatientTransportRequirements(domainFactory, valueObject.getTransportRequirements(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value30 = null;
		if ( null != valueObject.getReferringConsultant() ) 
		{
			if (valueObject.getReferringConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferringConsultant()) != null)
				{
					value30 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getReferringConsultant());
				}
			}
			else
			{
				value30 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getReferringConsultant().getBoId());
			}
		}
		domainObject.setReferringConsultant(value30);
		java.util.Date value31 = null;
		ims.framework.utils.Date date31 = valueObject.getOriginalDateOfReferral();		
		if ( date31 != null ) 
		{
			value31 = date31.getDate();
		}
		domainObject.setOriginalDateOfReferral(value31);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getRefererAddress() != null && valueObject.getRefererAddress().equals(""))
		{
			valueObject.setRefererAddress(null);
		}
		domainObject.setRefererAddress(valueObject.getRefererAddress());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTransferedBY() != null && valueObject.getTransferedBY().equals(""))
		{
			valueObject.setTransferedBY(null);
		}
		domainObject.setTransferedBY(valueObject.getTransferedBY());

		return domainObject;
	}

}
