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
package ims.pci.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class ClientBirthDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.pci.vo.ClientBirthDetailsVo copy(ims.pci.vo.ClientBirthDetailsVo valueObjectDest, ims.pci.vo.ClientBirthDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ClientBirthDetails(valueObjectSrc.getID_ClientBirthDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Client
		valueObjectDest.setClient(valueObjectSrc.getClient());
		// PlaceOfBirth
		valueObjectDest.setPlaceOfBirth(valueObjectSrc.getPlaceOfBirth());
		// WeightAtBirth
		valueObjectDest.setWeightAtBirth(valueObjectSrc.getWeightAtBirth());
		// DateNotified
		valueObjectDest.setDateNotified(valueObjectSrc.getDateNotified());
		// DurationOfPregnancy
		valueObjectDest.setDurationOfPregnancy(valueObjectSrc.getDurationOfPregnancy());
		// DeliveryMethod
		valueObjectDest.setDeliveryMethod(valueObjectSrc.getDeliveryMethod());
		// Episiotomy
		valueObjectDest.setEpisiotomy(valueObjectSrc.getEpisiotomy());
		// Epidural
		valueObjectDest.setEpidural(valueObjectSrc.getEpidural());
		// OrderOfBirthOrder
		valueObjectDest.setOrderOfBirthOrder(valueObjectSrc.getOrderOfBirthOrder());
		// OrderOfBirthNr
		valueObjectDest.setOrderOfBirthNr(valueObjectSrc.getOrderOfBirthNr());
		// Apgar1
		valueObjectDest.setApgar1(valueObjectSrc.getApgar1());
		// Apgar5
		valueObjectDest.setApgar5(valueObjectSrc.getApgar5());
		// Apgar10
		valueObjectDest.setApgar10(valueObjectSrc.getApgar10());
		// Stillborn
		valueObjectDest.setStillborn(valueObjectSrc.getStillborn());
		// Live
		valueObjectDest.setLive(valueObjectSrc.getLive());
		// Miscarriages
		valueObjectDest.setMiscarriages(valueObjectSrc.getMiscarriages());
		// MaritalStatusAtBirth
		valueObjectDest.setMaritalStatusAtBirth(valueObjectSrc.getMaritalStatusAtBirth());
		// PKUTest
		valueObjectDest.setPKUTest(valueObjectSrc.getPKUTest());
		// StillBornIndicator
		valueObjectDest.setStillBornIndicator(valueObjectSrc.getStillBornIndicator());
		// BreastFeeding
		valueObjectDest.setBreastFeeding(valueObjectSrc.getBreastFeeding());
		// BreastFeedingAtDischarge
		valueObjectDest.setBreastFeedingAtDischarge(valueObjectSrc.getBreastFeedingAtDischarge());
		// BreastFeedingAt3months
		valueObjectDest.setBreastFeedingAt3months(valueObjectSrc.getBreastFeedingAt3months());
		// BreastFeedingAtPHN
		valueObjectDest.setBreastFeedingAtPHN(valueObjectSrc.getBreastFeedingAtPHN());
		// ClientNotes
		valueObjectDest.setClientNotes(valueObjectSrc.getClientNotes());
		// ClientIDOfMother
		valueObjectDest.setClientIDOfMother(valueObjectSrc.getClientIDOfMother());
		// TimeOfBirth
		valueObjectDest.setTimeOfBirth(valueObjectSrc.getTimeOfBirth());
		// DischargeDateTime
		valueObjectDest.setDischargeDateTime(valueObjectSrc.getDischargeDateTime());
		// FirstPHNVisitDateTime
		valueObjectDest.setFirstPHNVisitDateTime(valueObjectSrc.getFirstPHNVisitDateTime());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createClientBirthDetailsVoCollectionFromClientBirthDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.pci.domain.objects.ClientBirthDetails objects.
	 */
	public static ims.pci.vo.ClientBirthDetailsVoCollection createClientBirthDetailsVoCollectionFromClientBirthDetails(java.util.Set domainObjectSet)	
	{
		return createClientBirthDetailsVoCollectionFromClientBirthDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.pci.domain.objects.ClientBirthDetails objects.
	 */
	public static ims.pci.vo.ClientBirthDetailsVoCollection createClientBirthDetailsVoCollectionFromClientBirthDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.pci.vo.ClientBirthDetailsVoCollection voList = new ims.pci.vo.ClientBirthDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.pci.domain.objects.ClientBirthDetails domainObject = (ims.pci.domain.objects.ClientBirthDetails) iterator.next();
			ims.pci.vo.ClientBirthDetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.pci.domain.objects.ClientBirthDetails objects.
	 */
	public static ims.pci.vo.ClientBirthDetailsVoCollection createClientBirthDetailsVoCollectionFromClientBirthDetails(java.util.List domainObjectList) 
	{
		return createClientBirthDetailsVoCollectionFromClientBirthDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.pci.domain.objects.ClientBirthDetails objects.
	 */
	public static ims.pci.vo.ClientBirthDetailsVoCollection createClientBirthDetailsVoCollectionFromClientBirthDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.pci.vo.ClientBirthDetailsVoCollection voList = new ims.pci.vo.ClientBirthDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.pci.domain.objects.ClientBirthDetails domainObject = (ims.pci.domain.objects.ClientBirthDetails) domainObjectList.get(i);
			ims.pci.vo.ClientBirthDetailsVo vo = create(map, domainObject);

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
	 * Create the ims.pci.domain.objects.ClientBirthDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractClientBirthDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ClientBirthDetailsVoCollection voCollection) 
	 {
	 	return extractClientBirthDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractClientBirthDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ClientBirthDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.pci.vo.ClientBirthDetailsVo vo = voCollection.get(i);
			ims.pci.domain.objects.ClientBirthDetails domainObject = ClientBirthDetailsVoAssembler.extractClientBirthDetails(domainFactory, vo, domMap);

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
	 * Create the ims.pci.domain.objects.ClientBirthDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractClientBirthDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ClientBirthDetailsVoCollection voCollection) 
	 {
	 	return extractClientBirthDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractClientBirthDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ClientBirthDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.pci.vo.ClientBirthDetailsVo vo = voCollection.get(i);
			ims.pci.domain.objects.ClientBirthDetails domainObject = ClientBirthDetailsVoAssembler.extractClientBirthDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.pci.domain.objects.ClientBirthDetails object.
	 * @param domainObject ims.pci.domain.objects.ClientBirthDetails
	 */
	 public static ims.pci.vo.ClientBirthDetailsVo create(ims.pci.domain.objects.ClientBirthDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.pci.domain.objects.ClientBirthDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.pci.vo.ClientBirthDetailsVo create(DomainObjectMap map, ims.pci.domain.objects.ClientBirthDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.pci.vo.ClientBirthDetailsVo valueObject = (ims.pci.vo.ClientBirthDetailsVo) map.getValueObject(domainObject, ims.pci.vo.ClientBirthDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.pci.vo.ClientBirthDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.pci.domain.objects.ClientBirthDetails
	 */
	 public static ims.pci.vo.ClientBirthDetailsVo insert(ims.pci.vo.ClientBirthDetailsVo valueObject, ims.pci.domain.objects.ClientBirthDetails domainObject) 
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
	 * @param domainObject ims.pci.domain.objects.ClientBirthDetails
	 */
	 public static ims.pci.vo.ClientBirthDetailsVo insert(DomainObjectMap map, ims.pci.vo.ClientBirthDetailsVo valueObject, ims.pci.domain.objects.ClientBirthDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ClientBirthDetails(domainObject.getId());
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
			
		// Client
		if (domainObject.getClient() != null)
		{
			if(domainObject.getClient() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getClient();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setClient(new ims.core.patient.vo.PatientRefVo(id, -1));				
			}
			else
			{
				valueObject.setClient(new ims.core.patient.vo.PatientRefVo(domainObject.getClient().getId(), domainObject.getClient().getVersion()));
			}
		}
		// PlaceOfBirth
		ims.domain.lookups.LookupInstance instance2 = domainObject.getPlaceOfBirth();
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

			ims.pci.vo.lookups.PlaceOfBirth voLookup2 = new ims.pci.vo.lookups.PlaceOfBirth(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.pci.vo.lookups.PlaceOfBirth parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.pci.vo.lookups.PlaceOfBirth(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setPlaceOfBirth(voLookup2);
		}
				// WeightAtBirth
		valueObject.setWeightAtBirth(domainObject.getWeightAtBirth());
		// DateNotified
		java.util.Date DateNotified = domainObject.getDateNotified();
		if ( null != DateNotified ) 
		{
			valueObject.setDateNotified(new ims.framework.utils.Date(DateNotified) );
		}
		// DurationOfPregnancy
		valueObject.setDurationOfPregnancy(domainObject.getDurationOfPregnancy());
		// DeliveryMethod
		ims.domain.lookups.LookupInstance instance6 = domainObject.getDeliveryMethod();
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

			ims.pci.vo.lookups.DeliveryMethodBirth voLookup6 = new ims.pci.vo.lookups.DeliveryMethodBirth(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.pci.vo.lookups.DeliveryMethodBirth parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.pci.vo.lookups.DeliveryMethodBirth(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setDeliveryMethod(voLookup6);
		}
				// Episiotomy
		ims.domain.lookups.LookupInstance instance7 = domainObject.getEpisiotomy();
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

			ims.core.vo.lookups.YesNoUnknown voLookup7 = new ims.core.vo.lookups.YesNoUnknown(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.core.vo.lookups.YesNoUnknown(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setEpisiotomy(voLookup7);
		}
				// Epidural
		ims.domain.lookups.LookupInstance instance8 = domainObject.getEpidural();
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

			ims.core.vo.lookups.YesNoUnknown voLookup8 = new ims.core.vo.lookups.YesNoUnknown(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.YesNoUnknown(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setEpidural(voLookup8);
		}
				// OrderOfBirthOrder
		valueObject.setOrderOfBirthOrder(domainObject.getOrderOfBirthOrder());
		// OrderOfBirthNr
		valueObject.setOrderOfBirthNr(domainObject.getOrderOfBirthNr());
		// Apgar1
		valueObject.setApgar1(domainObject.getApgar1());
		// Apgar5
		valueObject.setApgar5(domainObject.getApgar5());
		// Apgar10
		valueObject.setApgar10(domainObject.getApgar10());
		// Stillborn
		valueObject.setStillborn(domainObject.getStillborn());
		// Live
		valueObject.setLive(domainObject.getLive());
		// Miscarriages
		valueObject.setMiscarriages(domainObject.getMiscarriages());
		// MaritalStatusAtBirth
		ims.domain.lookups.LookupInstance instance17 = domainObject.getMaritalStatusAtBirth();
		if ( null != instance17 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance17.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance17.getImage().getImageId(), instance17.getImage().getImagePath());
			}
			color = instance17.getColor();
			if (color != null) 
				color.getValue();

			ims.pci.vo.lookups.MaritalStatusAtBirth voLookup17 = new ims.pci.vo.lookups.MaritalStatusAtBirth(instance17.getId(),instance17.getText(), instance17.isActive(), null, img, color);
			ims.pci.vo.lookups.MaritalStatusAtBirth parentVoLookup17 = voLookup17;
			ims.domain.lookups.LookupInstance parent17 = instance17.getParent();
			while (parent17 != null)
			{
				if (parent17.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent17.getImage().getImageId(), parent17.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent17.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup17.setParent(new ims.pci.vo.lookups.MaritalStatusAtBirth(parent17.getId(),parent17.getText(), parent17.isActive(), null, img, color));
				parentVoLookup17 = parentVoLookup17.getParent();
								parent17 = parent17.getParent();
			}			
			valueObject.setMaritalStatusAtBirth(voLookup17);
		}
				// PKUTest
		ims.domain.lookups.LookupInstance instance18 = domainObject.getPKUTest();
		if ( null != instance18 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance18.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance18.getImage().getImageId(), instance18.getImage().getImagePath());
			}
			color = instance18.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNoUnknown voLookup18 = new ims.core.vo.lookups.YesNoUnknown(instance18.getId(),instance18.getText(), instance18.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup18 = voLookup18;
			ims.domain.lookups.LookupInstance parent18 = instance18.getParent();
			while (parent18 != null)
			{
				if (parent18.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent18.getImage().getImageId(), parent18.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent18.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup18.setParent(new ims.core.vo.lookups.YesNoUnknown(parent18.getId(),parent18.getText(), parent18.isActive(), null, img, color));
				parentVoLookup18 = parentVoLookup18.getParent();
								parent18 = parent18.getParent();
			}			
			valueObject.setPKUTest(voLookup18);
		}
				// StillBornIndicator
		valueObject.setStillBornIndicator( domainObject.isStillBornIndicator() );
		// BreastFeeding
		ims.domain.lookups.LookupInstance instance20 = domainObject.getBreastFeeding();
		if ( null != instance20 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance20.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance20.getImage().getImageId(), instance20.getImage().getImagePath());
			}
			color = instance20.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNoUnknown voLookup20 = new ims.core.vo.lookups.YesNoUnknown(instance20.getId(),instance20.getText(), instance20.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup20 = voLookup20;
			ims.domain.lookups.LookupInstance parent20 = instance20.getParent();
			while (parent20 != null)
			{
				if (parent20.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent20.getImage().getImageId(), parent20.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent20.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup20.setParent(new ims.core.vo.lookups.YesNoUnknown(parent20.getId(),parent20.getText(), parent20.isActive(), null, img, color));
				parentVoLookup20 = parentVoLookup20.getParent();
								parent20 = parent20.getParent();
			}			
			valueObject.setBreastFeeding(voLookup20);
		}
				// BreastFeedingAtDischarge
		ims.domain.lookups.LookupInstance instance21 = domainObject.getBreastFeedingAtDischarge();
		if ( null != instance21 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance21.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance21.getImage().getImageId(), instance21.getImage().getImagePath());
			}
			color = instance21.getColor();
			if (color != null) 
				color.getValue();

			ims.pci.vo.lookups.BreastFeedingStatus voLookup21 = new ims.pci.vo.lookups.BreastFeedingStatus(instance21.getId(),instance21.getText(), instance21.isActive(), null, img, color);
			ims.pci.vo.lookups.BreastFeedingStatus parentVoLookup21 = voLookup21;
			ims.domain.lookups.LookupInstance parent21 = instance21.getParent();
			while (parent21 != null)
			{
				if (parent21.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent21.getImage().getImageId(), parent21.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent21.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup21.setParent(new ims.pci.vo.lookups.BreastFeedingStatus(parent21.getId(),parent21.getText(), parent21.isActive(), null, img, color));
				parentVoLookup21 = parentVoLookup21.getParent();
								parent21 = parent21.getParent();
			}			
			valueObject.setBreastFeedingAtDischarge(voLookup21);
		}
				// BreastFeedingAt3months
		ims.domain.lookups.LookupInstance instance22 = domainObject.getBreastFeedingAt3months();
		if ( null != instance22 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance22.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance22.getImage().getImageId(), instance22.getImage().getImagePath());
			}
			color = instance22.getColor();
			if (color != null) 
				color.getValue();

			ims.pci.vo.lookups.BreastFeedingStatus voLookup22 = new ims.pci.vo.lookups.BreastFeedingStatus(instance22.getId(),instance22.getText(), instance22.isActive(), null, img, color);
			ims.pci.vo.lookups.BreastFeedingStatus parentVoLookup22 = voLookup22;
			ims.domain.lookups.LookupInstance parent22 = instance22.getParent();
			while (parent22 != null)
			{
				if (parent22.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent22.getImage().getImageId(), parent22.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent22.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup22.setParent(new ims.pci.vo.lookups.BreastFeedingStatus(parent22.getId(),parent22.getText(), parent22.isActive(), null, img, color));
				parentVoLookup22 = parentVoLookup22.getParent();
								parent22 = parent22.getParent();
			}			
			valueObject.setBreastFeedingAt3months(voLookup22);
		}
				// BreastFeedingAtPHN
		ims.domain.lookups.LookupInstance instance23 = domainObject.getBreastFeedingAtPHN();
		if ( null != instance23 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance23.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance23.getImage().getImageId(), instance23.getImage().getImagePath());
			}
			color = instance23.getColor();
			if (color != null) 
				color.getValue();

			ims.pci.vo.lookups.BreastFeedingStatus voLookup23 = new ims.pci.vo.lookups.BreastFeedingStatus(instance23.getId(),instance23.getText(), instance23.isActive(), null, img, color);
			ims.pci.vo.lookups.BreastFeedingStatus parentVoLookup23 = voLookup23;
			ims.domain.lookups.LookupInstance parent23 = instance23.getParent();
			while (parent23 != null)
			{
				if (parent23.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent23.getImage().getImageId(), parent23.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent23.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup23.setParent(new ims.pci.vo.lookups.BreastFeedingStatus(parent23.getId(),parent23.getText(), parent23.isActive(), null, img, color));
				parentVoLookup23 = parentVoLookup23.getParent();
								parent23 = parent23.getParent();
			}			
			valueObject.setBreastFeedingAtPHN(voLookup23);
		}
				// ClientNotes
		valueObject.setClientNotes(domainObject.getClientNotes());
		// ClientIDOfMother
		valueObject.setClientIDOfMother(domainObject.getClientIDOfMother());
		// TimeOfBirth
		valueObject.setTimeOfBirth(domainObject.getTimeOfBirth());
		// DischargeDateTime
		java.util.Date DischargeDateTime = domainObject.getDischargeDateTime();
		if ( null != DischargeDateTime ) 
		{
			valueObject.setDischargeDateTime(new ims.framework.utils.DateTime(DischargeDateTime) );
		}
		// FirstPHNVisitDateTime
		java.util.Date FirstPHNVisitDateTime = domainObject.getFirstPHNVisitDateTime();
		if ( null != FirstPHNVisitDateTime ) 
		{
			valueObject.setFirstPHNVisitDateTime(new ims.framework.utils.DateTime(FirstPHNVisitDateTime) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.pci.domain.objects.ClientBirthDetails extractClientBirthDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ClientBirthDetailsVo valueObject) 
	{
		return 	extractClientBirthDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.pci.domain.objects.ClientBirthDetails extractClientBirthDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ClientBirthDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ClientBirthDetails();
		ims.pci.domain.objects.ClientBirthDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.pci.domain.objects.ClientBirthDetails)domMap.get(valueObject);
			}
			// ims.pci.vo.ClientBirthDetailsVo ID_ClientBirthDetails field is unknown
			domainObject = new ims.pci.domain.objects.ClientBirthDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ClientBirthDetails());
			if (domMap.get(key) != null)
			{
				return (ims.pci.domain.objects.ClientBirthDetails)domMap.get(key);
			}
			domainObject = (ims.pci.domain.objects.ClientBirthDetails) domainFactory.getDomainObject(ims.pci.domain.objects.ClientBirthDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ClientBirthDetails());

		ims.core.patient.domain.objects.Patient value1 = null;
		if ( null != valueObject.getClient() ) 
		{
			if (valueObject.getClient().getBoId() == null)
			{
				if (domMap.get(valueObject.getClient()) != null)
				{
					value1 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getClient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getClient();	
			}
			else
			{
				value1 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getClient().getBoId());
			}
		}
		domainObject.setClient(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getPlaceOfBirth() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getPlaceOfBirth().getID());
		}
		domainObject.setPlaceOfBirth(value2);
		domainObject.setWeightAtBirth(valueObject.getWeightAtBirth());
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getDateNotified();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setDateNotified(value4);
		domainObject.setDurationOfPregnancy(valueObject.getDurationOfPregnancy());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getDeliveryMethod() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getDeliveryMethod().getID());
		}
		domainObject.setDeliveryMethod(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getEpisiotomy() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getEpisiotomy().getID());
		}
		domainObject.setEpisiotomy(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getEpidural() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getEpidural().getID());
		}
		domainObject.setEpidural(value8);
		domainObject.setOrderOfBirthOrder(valueObject.getOrderOfBirthOrder());
		domainObject.setOrderOfBirthNr(valueObject.getOrderOfBirthNr());
		domainObject.setApgar1(valueObject.getApgar1());
		domainObject.setApgar5(valueObject.getApgar5());
		domainObject.setApgar10(valueObject.getApgar10());
		domainObject.setStillborn(valueObject.getStillborn());
		domainObject.setLive(valueObject.getLive());
		domainObject.setMiscarriages(valueObject.getMiscarriages());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value17 = null;
		if ( null != valueObject.getMaritalStatusAtBirth() ) 
		{
			value17 =
				domainFactory.getLookupInstance(valueObject.getMaritalStatusAtBirth().getID());
		}
		domainObject.setMaritalStatusAtBirth(value17);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value18 = null;
		if ( null != valueObject.getPKUTest() ) 
		{
			value18 =
				domainFactory.getLookupInstance(valueObject.getPKUTest().getID());
		}
		domainObject.setPKUTest(value18);
		domainObject.setStillBornIndicator(valueObject.getStillBornIndicator());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value20 = null;
		if ( null != valueObject.getBreastFeeding() ) 
		{
			value20 =
				domainFactory.getLookupInstance(valueObject.getBreastFeeding().getID());
		}
		domainObject.setBreastFeeding(value20);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value21 = null;
		if ( null != valueObject.getBreastFeedingAtDischarge() ) 
		{
			value21 =
				domainFactory.getLookupInstance(valueObject.getBreastFeedingAtDischarge().getID());
		}
		domainObject.setBreastFeedingAtDischarge(value21);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value22 = null;
		if ( null != valueObject.getBreastFeedingAt3months() ) 
		{
			value22 =
				domainFactory.getLookupInstance(valueObject.getBreastFeedingAt3months().getID());
		}
		domainObject.setBreastFeedingAt3months(value22);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value23 = null;
		if ( null != valueObject.getBreastFeedingAtPHN() ) 
		{
			value23 =
				domainFactory.getLookupInstance(valueObject.getBreastFeedingAtPHN().getID());
		}
		domainObject.setBreastFeedingAtPHN(value23);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getClientNotes() != null && valueObject.getClientNotes().equals(""))
		{
			valueObject.setClientNotes(null);
		}
		domainObject.setClientNotes(valueObject.getClientNotes());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getClientIDOfMother() != null && valueObject.getClientIDOfMother().equals(""))
		{
			valueObject.setClientIDOfMother(null);
		}
		domainObject.setClientIDOfMother(valueObject.getClientIDOfMother());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTimeOfBirth() != null && valueObject.getTimeOfBirth().equals(""))
		{
			valueObject.setTimeOfBirth(null);
		}
		domainObject.setTimeOfBirth(valueObject.getTimeOfBirth());
		ims.framework.utils.DateTime dateTime27 = valueObject.getDischargeDateTime();
		java.util.Date value27 = null;
		if ( dateTime27 != null ) 
		{
			value27 = dateTime27.getJavaDate();
		}
		domainObject.setDischargeDateTime(value27);
		ims.framework.utils.DateTime dateTime28 = valueObject.getFirstPHNVisitDateTime();
		java.util.Date value28 = null;
		if ( dateTime28 != null ) 
		{
			value28 = dateTime28.getJavaDate();
		}
		domainObject.setFirstPHNVisitDateTime(value28);

		return domainObject;
	}

}
