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
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class ReferralDetailsForReferralTriageVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.ReferralDetailsForReferralTriageVo copy(ims.RefMan.vo.ReferralDetailsForReferralTriageVo valueObjectDest, ims.RefMan.vo.ReferralDetailsForReferralTriageVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ReferralLetterDetails(valueObjectSrc.getID_ReferralLetterDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Service
		valueObjectDest.setService(valueObjectSrc.getService());
		// Consultant
		valueObjectDest.setConsultant(valueObjectSrc.getConsultant());
		// Function
		valueObjectDest.setFunction(valueObjectSrc.getFunction());
		// OriginalService
		valueObjectDest.setOriginalService(valueObjectSrc.getOriginalService());
		// ServiceUpdateHistory
		valueObjectDest.setServiceUpdateHistory(valueObjectSrc.getServiceUpdateHistory());
		// DateOfReferral
		valueObjectDest.setDateOfReferral(valueObjectSrc.getDateOfReferral());
		// End18WW
		valueObjectDest.setEnd18WW(valueObjectSrc.getEnd18WW());
		// OriginalConsultant
		valueObjectDest.setOriginalConsultant(valueObjectSrc.getOriginalConsultant());
		// ReferrerType
		valueObjectDest.setReferrerType(valueObjectSrc.getReferrerType());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createReferralDetailsForReferralTriageVoCollectionFromReferralLetterDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.ReferralLetterDetails objects.
	 */
	public static ims.RefMan.vo.ReferralDetailsForReferralTriageVoCollection createReferralDetailsForReferralTriageVoCollectionFromReferralLetterDetails(java.util.Set domainObjectSet)	
	{
		return createReferralDetailsForReferralTriageVoCollectionFromReferralLetterDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.ReferralLetterDetails objects.
	 */
	public static ims.RefMan.vo.ReferralDetailsForReferralTriageVoCollection createReferralDetailsForReferralTriageVoCollectionFromReferralLetterDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.ReferralDetailsForReferralTriageVoCollection voList = new ims.RefMan.vo.ReferralDetailsForReferralTriageVoCollection();
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
			ims.RefMan.vo.ReferralDetailsForReferralTriageVo vo = create(map, domainObject);
			
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
	public static ims.RefMan.vo.ReferralDetailsForReferralTriageVoCollection createReferralDetailsForReferralTriageVoCollectionFromReferralLetterDetails(java.util.List domainObjectList) 
	{
		return createReferralDetailsForReferralTriageVoCollectionFromReferralLetterDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.ReferralLetterDetails objects.
	 */
	public static ims.RefMan.vo.ReferralDetailsForReferralTriageVoCollection createReferralDetailsForReferralTriageVoCollectionFromReferralLetterDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.ReferralDetailsForReferralTriageVoCollection voList = new ims.RefMan.vo.ReferralDetailsForReferralTriageVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.ReferralLetterDetails domainObject = (ims.core.clinical.domain.objects.ReferralLetterDetails) domainObjectList.get(i);
			ims.RefMan.vo.ReferralDetailsForReferralTriageVo vo = create(map, domainObject);

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
	 public static java.util.Set extractReferralLetterDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralDetailsForReferralTriageVoCollection voCollection) 
	 {
	 	return extractReferralLetterDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractReferralLetterDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralDetailsForReferralTriageVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ReferralDetailsForReferralTriageVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.ReferralLetterDetails domainObject = ReferralDetailsForReferralTriageVoAssembler.extractReferralLetterDetails(domainFactory, vo, domMap);

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
	 public static java.util.List extractReferralLetterDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralDetailsForReferralTriageVoCollection voCollection) 
	 {
	 	return extractReferralLetterDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractReferralLetterDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralDetailsForReferralTriageVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ReferralDetailsForReferralTriageVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.ReferralLetterDetails domainObject = ReferralDetailsForReferralTriageVoAssembler.extractReferralLetterDetails(domainFactory, vo, domMap);

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
	 public static ims.RefMan.vo.ReferralDetailsForReferralTriageVo create(ims.core.clinical.domain.objects.ReferralLetterDetails domainObject) 
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
	  public static ims.RefMan.vo.ReferralDetailsForReferralTriageVo create(DomainObjectMap map, ims.core.clinical.domain.objects.ReferralLetterDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.ReferralDetailsForReferralTriageVo valueObject = (ims.RefMan.vo.ReferralDetailsForReferralTriageVo) map.getValueObject(domainObject, ims.RefMan.vo.ReferralDetailsForReferralTriageVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.ReferralDetailsForReferralTriageVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.RefMan.vo.ReferralDetailsForReferralTriageVo insert(ims.RefMan.vo.ReferralDetailsForReferralTriageVo valueObject, ims.core.clinical.domain.objects.ReferralLetterDetails domainObject) 
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
	 public static ims.RefMan.vo.ReferralDetailsForReferralTriageVo insert(DomainObjectMap map, ims.RefMan.vo.ReferralDetailsForReferralTriageVo valueObject, ims.core.clinical.domain.objects.ReferralLetterDetails domainObject) 
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
		// Consultant
		valueObject.setConsultant(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getConsultant()) );
		// Function
		valueObject.setFunction(ims.core.vo.domain.ServiceFunctionLiteVoAssembler.create(map, domainObject.getFunction()) );
		// OriginalService
		if (domainObject.getOriginalService() != null)
		{
			if(domainObject.getOriginalService() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getOriginalService();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setOriginalService(new ims.core.clinical.vo.ServiceRefVo(id, -1));				
			}
			else
			{
				valueObject.setOriginalService(new ims.core.clinical.vo.ServiceRefVo(domainObject.getOriginalService().getId(), domainObject.getOriginalService().getVersion()));
			}
		}
		// ServiceUpdateHistory
		valueObject.setServiceUpdateHistory(ims.RefMan.vo.domain.ReferralServiceUpdatesVoAssembler.createReferralServiceUpdatesVoCollectionFromReferralServiceUpdates(map, domainObject.getServiceUpdateHistory()) );
		// DateOfReferral
		java.util.Date DateOfReferral = domainObject.getDateOfReferral();
		if ( null != DateOfReferral ) 
		{
			valueObject.setDateOfReferral(new ims.framework.utils.Date(DateOfReferral) );
		}
		// End18WW
		java.util.Date End18WW = domainObject.getEnd18WW();
		if ( null != End18WW ) 
		{
			valueObject.setEnd18WW(new ims.framework.utils.Date(End18WW) );
		}
		// OriginalConsultant
		valueObject.setOriginalConsultant(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getOriginalConsultant()) );
		// ReferrerType
		ims.domain.lookups.LookupInstance instance9 = domainObject.getReferrerType();
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

			ims.core.vo.lookups.SourceOfReferral voLookup9 = new ims.core.vo.lookups.SourceOfReferral(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.SourceOfReferral parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.core.vo.lookups.SourceOfReferral(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setReferrerType(voLookup9);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.ReferralLetterDetails extractReferralLetterDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralDetailsForReferralTriageVo valueObject) 
	{
		return 	extractReferralLetterDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.ReferralLetterDetails extractReferralLetterDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralDetailsForReferralTriageVo valueObject, HashMap domMap) 
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
			// ims.RefMan.vo.ReferralDetailsForReferralTriageVo ID_ReferralLetterDetails field is unknown
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

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Service value1 = null;
		if ( null != valueObject.getService() ) 
		{
			if (valueObject.getService().getBoId() == null)
			{
				if (domMap.get(valueObject.getService()) != null)
				{
					value1 = (ims.core.clinical.domain.objects.Service)domMap.get(valueObject.getService());
				}
			}
			else
			{
				value1 = (ims.core.clinical.domain.objects.Service)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Service.class, valueObject.getService().getBoId());
			}
		}
		domainObject.setService(value1);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value2 = null;
		if ( null != valueObject.getConsultant() ) 
		{
			if (valueObject.getConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getConsultant()) != null)
				{
					value2 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getConsultant());
				}
			}
			else
			{
				value2 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getConsultant().getBoId());
			}
		}
		domainObject.setConsultant(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.ServiceFunction value3 = null;
		if ( null != valueObject.getFunction() ) 
		{
			if (valueObject.getFunction().getBoId() == null)
			{
				if (domMap.get(valueObject.getFunction()) != null)
				{
					value3 = (ims.core.clinical.domain.objects.ServiceFunction)domMap.get(valueObject.getFunction());
				}
			}
			else
			{
				value3 = (ims.core.clinical.domain.objects.ServiceFunction)domainFactory.getDomainObject(ims.core.clinical.domain.objects.ServiceFunction.class, valueObject.getFunction().getBoId());
			}
		}
		domainObject.setFunction(value3);
		ims.core.clinical.domain.objects.Service value4 = null;
		if ( null != valueObject.getOriginalService() ) 
		{
			if (valueObject.getOriginalService().getBoId() == null)
			{
				if (domMap.get(valueObject.getOriginalService()) != null)
				{
					value4 = (ims.core.clinical.domain.objects.Service)domMap.get(valueObject.getOriginalService());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getOriginalService();	
			}
			else
			{
				value4 = (ims.core.clinical.domain.objects.Service)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Service.class, valueObject.getOriginalService().getBoId());
			}
		}
		domainObject.setOriginalService(value4);
		domainObject.setServiceUpdateHistory(ims.RefMan.vo.domain.ReferralServiceUpdatesVoAssembler.extractReferralServiceUpdatesList(domainFactory, valueObject.getServiceUpdateHistory(), domainObject.getServiceUpdateHistory(), domMap));		
		java.util.Date value6 = null;
		ims.framework.utils.Date date6 = valueObject.getDateOfReferral();		
		if ( date6 != null ) 
		{
			value6 = date6.getDate();
		}
		domainObject.setDateOfReferral(value6);
		java.util.Date value7 = null;
		ims.framework.utils.Date date7 = valueObject.getEnd18WW();		
		if ( date7 != null ) 
		{
			value7 = date7.getDate();
		}
		domainObject.setEnd18WW(value7);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value8 = null;
		if ( null != valueObject.getOriginalConsultant() ) 
		{
			if (valueObject.getOriginalConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getOriginalConsultant()) != null)
				{
					value8 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getOriginalConsultant());
				}
			}
			else
			{
				value8 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getOriginalConsultant().getBoId());
			}
		}
		domainObject.setOriginalConsultant(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getReferrerType() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getReferrerType().getID());
		}
		domainObject.setReferrerType(value9);

		return domainObject;
	}

}
