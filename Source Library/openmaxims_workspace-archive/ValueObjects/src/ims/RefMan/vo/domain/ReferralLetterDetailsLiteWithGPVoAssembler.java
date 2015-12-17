/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 16/04/2014, 12:32
 *
 */
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class ReferralLetterDetailsLiteWithGPVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.ReferralLetterDetailsLiteWithGPVo copy(ims.RefMan.vo.ReferralLetterDetailsLiteWithGPVo valueObjectDest, ims.RefMan.vo.ReferralLetterDetailsLiteWithGPVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ReferralLetterDetails(valueObjectSrc.getID_ReferralLetterDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// GPName
		valueObjectDest.setGPName(valueObjectSrc.getGPName());
		// Service
		valueObjectDest.setService(valueObjectSrc.getService());
		// ReferrerType
		valueObjectDest.setReferrerType(valueObjectSrc.getReferrerType());
		// AlliedHealthProfName
		valueObjectDest.setAlliedHealthProfName(valueObjectSrc.getAlliedHealthProfName());
		// DateOfReferral
		valueObjectDest.setDateOfReferral(valueObjectSrc.getDateOfReferral());
		// DateReferralReceived
		valueObjectDest.setDateReferralReceived(valueObjectSrc.getDateReferralReceived());
		// Transport
		valueObjectDest.setTransport(valueObjectSrc.getTransport());
		// SpecialRequirements
		valueObjectDest.setSpecialRequirements(valueObjectSrc.getSpecialRequirements());
		// IsDADReferral
		valueObjectDest.setIsDADReferral(valueObjectSrc.getIsDADReferral());
		// Location
		valueObjectDest.setLocation(valueObjectSrc.getLocation());
		// EndDateKPI
		valueObjectDest.setEndDateKPI(valueObjectSrc.getEndDateKPI());
		// EndDateEmailKPI
		valueObjectDest.setEndDateEmailKPI(valueObjectSrc.getEndDateEmailKPI());
		// EndDatePaperKPI
		valueObjectDest.setEndDatePaperKPI(valueObjectSrc.getEndDatePaperKPI());
		// End18WW
		valueObjectDest.setEnd18WW(valueObjectSrc.getEnd18WW());
		// Consultant
		valueObjectDest.setConsultant(valueObjectSrc.getConsultant());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createReferralLetterDetailsLiteWithGPVoCollectionFromReferralLetterDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.ReferralLetterDetails objects.
	 */
	public static ims.RefMan.vo.ReferralLetterDetailsLiteWithGPVoCollection createReferralLetterDetailsLiteWithGPVoCollectionFromReferralLetterDetails(java.util.Set domainObjectSet)	
	{
		return createReferralLetterDetailsLiteWithGPVoCollectionFromReferralLetterDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.ReferralLetterDetails objects.
	 */
	public static ims.RefMan.vo.ReferralLetterDetailsLiteWithGPVoCollection createReferralLetterDetailsLiteWithGPVoCollectionFromReferralLetterDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.ReferralLetterDetailsLiteWithGPVoCollection voList = new ims.RefMan.vo.ReferralLetterDetailsLiteWithGPVoCollection();
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
			ims.RefMan.vo.ReferralLetterDetailsLiteWithGPVo vo = create(map, domainObject);
			
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
	public static ims.RefMan.vo.ReferralLetterDetailsLiteWithGPVoCollection createReferralLetterDetailsLiteWithGPVoCollectionFromReferralLetterDetails(java.util.List domainObjectList) 
	{
		return createReferralLetterDetailsLiteWithGPVoCollectionFromReferralLetterDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.ReferralLetterDetails objects.
	 */
	public static ims.RefMan.vo.ReferralLetterDetailsLiteWithGPVoCollection createReferralLetterDetailsLiteWithGPVoCollectionFromReferralLetterDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.ReferralLetterDetailsLiteWithGPVoCollection voList = new ims.RefMan.vo.ReferralLetterDetailsLiteWithGPVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.ReferralLetterDetails domainObject = (ims.core.clinical.domain.objects.ReferralLetterDetails) domainObjectList.get(i);
			ims.RefMan.vo.ReferralLetterDetailsLiteWithGPVo vo = create(map, domainObject);

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
	 public static java.util.Set extractReferralLetterDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralLetterDetailsLiteWithGPVoCollection voCollection) 
	 {
	 	return extractReferralLetterDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractReferralLetterDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralLetterDetailsLiteWithGPVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ReferralLetterDetailsLiteWithGPVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.ReferralLetterDetails domainObject = ReferralLetterDetailsLiteWithGPVoAssembler.extractReferralLetterDetails(domainFactory, vo, domMap);

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
	 public static java.util.List extractReferralLetterDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralLetterDetailsLiteWithGPVoCollection voCollection) 
	 {
	 	return extractReferralLetterDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractReferralLetterDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralLetterDetailsLiteWithGPVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ReferralLetterDetailsLiteWithGPVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.ReferralLetterDetails domainObject = ReferralLetterDetailsLiteWithGPVoAssembler.extractReferralLetterDetails(domainFactory, vo, domMap);

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
	 public static ims.RefMan.vo.ReferralLetterDetailsLiteWithGPVo create(ims.core.clinical.domain.objects.ReferralLetterDetails domainObject) 
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
	  public static ims.RefMan.vo.ReferralLetterDetailsLiteWithGPVo create(DomainObjectMap map, ims.core.clinical.domain.objects.ReferralLetterDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.ReferralLetterDetailsLiteWithGPVo valueObject = (ims.RefMan.vo.ReferralLetterDetailsLiteWithGPVo) map.getValueObject(domainObject, ims.RefMan.vo.ReferralLetterDetailsLiteWithGPVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.ReferralLetterDetailsLiteWithGPVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.RefMan.vo.ReferralLetterDetailsLiteWithGPVo insert(ims.RefMan.vo.ReferralLetterDetailsLiteWithGPVo valueObject, ims.core.clinical.domain.objects.ReferralLetterDetails domainObject) 
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
	 public static ims.RefMan.vo.ReferralLetterDetailsLiteWithGPVo insert(DomainObjectMap map, ims.RefMan.vo.ReferralLetterDetailsLiteWithGPVo valueObject, ims.core.clinical.domain.objects.ReferralLetterDetails domainObject) 
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
			
		// GPName
		valueObject.setGPName(ims.core.vo.domain.GpLiteWithNameVoAssembler.create(map, domainObject.getGPName()) );
		// Service
		valueObject.setService(ims.core.vo.domain.ServiceLiteVoAssembler.create(map, domainObject.getService()) );
		// ReferrerType
		ims.domain.lookups.LookupInstance instance3 = domainObject.getReferrerType();
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

			ims.core.vo.lookups.SourceOfReferral voLookup3 = new ims.core.vo.lookups.SourceOfReferral(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.SourceOfReferral parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.SourceOfReferral(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setReferrerType(voLookup3);
		}
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
		// Transport
		ims.domain.lookups.LookupInstance instance7 = domainObject.getTransport();
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

			ims.scheduling.vo.lookups.ApptTransportType voLookup7 = new ims.scheduling.vo.lookups.ApptTransportType(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.scheduling.vo.lookups.ApptTransportType parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.scheduling.vo.lookups.ApptTransportType(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setTransport(voLookup7);
		}
				// SpecialRequirements
		valueObject.setSpecialRequirements(domainObject.getSpecialRequirements());
		// IsDADReferral
		valueObject.setIsDADReferral( domainObject.isIsDADReferral() );
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
		// End18WW
		java.util.Date End18WW = domainObject.getEnd18WW();
		if ( null != End18WW ) 
		{
			valueObject.setEnd18WW(new ims.framework.utils.Date(End18WW) );
		}
		// Consultant
		if (domainObject.getConsultant() != null)
		{
			if(domainObject.getConsultant() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getConsultant();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setConsultant(new ims.core.resource.people.vo.HcpRefVo(id, -1));				
			}
			else
			{
				valueObject.setConsultant(new ims.core.resource.people.vo.HcpRefVo(domainObject.getConsultant().getId(), domainObject.getConsultant().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.ReferralLetterDetails extractReferralLetterDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralLetterDetailsLiteWithGPVo valueObject) 
	{
		return 	extractReferralLetterDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.ReferralLetterDetails extractReferralLetterDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralLetterDetailsLiteWithGPVo valueObject, HashMap domMap) 
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
			// ims.RefMan.vo.ReferralLetterDetailsLiteWithGPVo ID_ReferralLetterDetails field is unknown
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

		domainObject.setGPName(ims.core.vo.domain.GpLiteWithNameVoAssembler.extractGp(domainFactory, valueObject.getGPName(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Service value2 = null;
		if ( null != valueObject.getService() ) 
		{
			if (valueObject.getService().getBoId() == null)
			{
				if (domMap.get(valueObject.getService()) != null)
				{
					value2 = (ims.core.clinical.domain.objects.Service)domMap.get(valueObject.getService());
				}
			}
			else
			{
				value2 = (ims.core.clinical.domain.objects.Service)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Service.class, valueObject.getService().getBoId());
			}
		}
		domainObject.setService(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getReferrerType() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getReferrerType().getID());
		}
		domainObject.setReferrerType(value3);
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
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getTransport() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getTransport().getID());
		}
		domainObject.setTransport(value7);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSpecialRequirements() != null && valueObject.getSpecialRequirements().equals(""))
		{
			valueObject.setSpecialRequirements(null);
		}
		domainObject.setSpecialRequirements(valueObject.getSpecialRequirements());
		domainObject.setIsDADReferral(valueObject.getIsDADReferral());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value10 = null;
		if ( null != valueObject.getLocation() ) 
		{
			if (valueObject.getLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getLocation()) != null)
				{
					value10 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getLocation());
				}
			}
			else
			{
				value10 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getLocation().getBoId());
			}
		}
		domainObject.setLocation(value10);
		java.util.Date value11 = null;
		ims.framework.utils.Date date11 = valueObject.getEndDateKPI();		
		if ( date11 != null ) 
		{
			value11 = date11.getDate();
		}
		domainObject.setEndDateKPI(value11);
		java.util.Date value12 = null;
		ims.framework.utils.Date date12 = valueObject.getEndDateEmailKPI();		
		if ( date12 != null ) 
		{
			value12 = date12.getDate();
		}
		domainObject.setEndDateEmailKPI(value12);
		java.util.Date value13 = null;
		ims.framework.utils.Date date13 = valueObject.getEndDatePaperKPI();		
		if ( date13 != null ) 
		{
			value13 = date13.getDate();
		}
		domainObject.setEndDatePaperKPI(value13);
		java.util.Date value14 = null;
		ims.framework.utils.Date date14 = valueObject.getEnd18WW();		
		if ( date14 != null ) 
		{
			value14 = date14.getDate();
		}
		domainObject.setEnd18WW(value14);
		ims.core.resource.people.domain.objects.Hcp value15 = null;
		if ( null != valueObject.getConsultant() ) 
		{
			if (valueObject.getConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getConsultant()) != null)
				{
					value15 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getConsultant());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value15 = domainObject.getConsultant();	
			}
			else
			{
				value15 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getConsultant().getBoId());
			}
		}
		domainObject.setConsultant(value15);

		return domainObject;
	}

}
