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
package ims.hl7.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class HL7InboundVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.hl7.vo.HL7InboundVo copy(ims.hl7.vo.HL7InboundVo valueObjectDest, ims.hl7.vo.HL7InboundVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_HL7Inbound(valueObjectSrc.getID_HL7Inbound());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// HL7Message
		valueObjectDest.setHL7Message(valueObjectSrc.getHL7Message());
		// failureMessage
		valueObjectDest.setFailureMessage(valueObjectSrc.getFailureMessage());
		// patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// providerSystem
		valueObjectDest.setProviderSystem(valueObjectSrc.getProviderSystem());
		// messageType
		valueObjectDest.setMessageType(valueObjectSrc.getMessageType());
		// messageCategory
		valueObjectDest.setMessageCategory(valueObjectSrc.getMessageCategory());
		// messageDateTime
		valueObjectDest.setMessageDateTime(valueObjectSrc.getMessageDateTime());
		// successfulOutcome
		valueObjectDest.setSuccessfulOutcome(valueObjectSrc.getSuccessfulOutcome());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createHL7InboundVoCollectionFromHL7Inbound(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.hl7.domain.objects.HL7Inbound objects.
	 */
	public static ims.hl7.vo.HL7InboundVoCollection createHL7InboundVoCollectionFromHL7Inbound(java.util.Set domainObjectSet)	
	{
		return createHL7InboundVoCollectionFromHL7Inbound(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.hl7.domain.objects.HL7Inbound objects.
	 */
	public static ims.hl7.vo.HL7InboundVoCollection createHL7InboundVoCollectionFromHL7Inbound(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.hl7.vo.HL7InboundVoCollection voList = new ims.hl7.vo.HL7InboundVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.hl7.domain.objects.HL7Inbound domainObject = (ims.hl7.domain.objects.HL7Inbound) iterator.next();
			ims.hl7.vo.HL7InboundVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.hl7.domain.objects.HL7Inbound objects.
	 */
	public static ims.hl7.vo.HL7InboundVoCollection createHL7InboundVoCollectionFromHL7Inbound(java.util.List domainObjectList) 
	{
		return createHL7InboundVoCollectionFromHL7Inbound(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.hl7.domain.objects.HL7Inbound objects.
	 */
	public static ims.hl7.vo.HL7InboundVoCollection createHL7InboundVoCollectionFromHL7Inbound(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.hl7.vo.HL7InboundVoCollection voList = new ims.hl7.vo.HL7InboundVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.hl7.domain.objects.HL7Inbound domainObject = (ims.hl7.domain.objects.HL7Inbound) domainObjectList.get(i);
			ims.hl7.vo.HL7InboundVo vo = create(map, domainObject);

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
	 * Create the ims.hl7.domain.objects.HL7Inbound set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractHL7InboundSet(ims.domain.ILightweightDomainFactory domainFactory, ims.hl7.vo.HL7InboundVoCollection voCollection) 
	 {
	 	return extractHL7InboundSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractHL7InboundSet(ims.domain.ILightweightDomainFactory domainFactory, ims.hl7.vo.HL7InboundVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.hl7.vo.HL7InboundVo vo = voCollection.get(i);
			ims.hl7.domain.objects.HL7Inbound domainObject = HL7InboundVoAssembler.extractHL7Inbound(domainFactory, vo, domMap);

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
	 * Create the ims.hl7.domain.objects.HL7Inbound list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractHL7InboundList(ims.domain.ILightweightDomainFactory domainFactory, ims.hl7.vo.HL7InboundVoCollection voCollection) 
	 {
	 	return extractHL7InboundList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractHL7InboundList(ims.domain.ILightweightDomainFactory domainFactory, ims.hl7.vo.HL7InboundVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.hl7.vo.HL7InboundVo vo = voCollection.get(i);
			ims.hl7.domain.objects.HL7Inbound domainObject = HL7InboundVoAssembler.extractHL7Inbound(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.hl7.domain.objects.HL7Inbound object.
	 * @param domainObject ims.hl7.domain.objects.HL7Inbound
	 */
	 public static ims.hl7.vo.HL7InboundVo create(ims.hl7.domain.objects.HL7Inbound domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.hl7.domain.objects.HL7Inbound object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.hl7.vo.HL7InboundVo create(DomainObjectMap map, ims.hl7.domain.objects.HL7Inbound domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.hl7.vo.HL7InboundVo valueObject = (ims.hl7.vo.HL7InboundVo) map.getValueObject(domainObject, ims.hl7.vo.HL7InboundVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.hl7.vo.HL7InboundVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.hl7.domain.objects.HL7Inbound
	 */
	 public static ims.hl7.vo.HL7InboundVo insert(ims.hl7.vo.HL7InboundVo valueObject, ims.hl7.domain.objects.HL7Inbound domainObject) 
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
	 * @param domainObject ims.hl7.domain.objects.HL7Inbound
	 */
	 public static ims.hl7.vo.HL7InboundVo insert(DomainObjectMap map, ims.hl7.vo.HL7InboundVo valueObject, ims.hl7.domain.objects.HL7Inbound domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_HL7Inbound(domainObject.getId());
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
			
		// HL7Message
		valueObject.setHL7Message(domainObject.getHL7Message());
		// failureMessage
		valueObject.setFailureMessage(domainObject.getFailureMessage());
		// patient
		valueObject.setPatient(ims.core.vo.domain.PatientLiteVoAssembler.create(map, domainObject.getPatient()) );
		// providerSystem
		valueObject.setProviderSystem(ims.ocrr.vo.domain.ProviderSystemVoAssembler.create(map, domainObject.getProviderSystem()) );
		// messageType
		ims.domain.lookups.LookupInstance instance5 = domainObject.getMessageType();
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

			ims.hl7.vo.lookups.MessageType voLookup5 = new ims.hl7.vo.lookups.MessageType(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.hl7.vo.lookups.MessageType parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.hl7.vo.lookups.MessageType(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setMessageType(voLookup5);
		}
				// messageCategory
		ims.domain.lookups.LookupInstance instance6 = domainObject.getMessageCategory();
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

			ims.hl7.vo.lookups.MessageType voLookup6 = new ims.hl7.vo.lookups.MessageType(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.hl7.vo.lookups.MessageType parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.hl7.vo.lookups.MessageType(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setMessageCategory(voLookup6);
		}
				// messageDateTime
		java.util.Date messageDateTime = domainObject.getMessageDateTime();
		if ( null != messageDateTime ) 
		{
			valueObject.setMessageDateTime(new ims.framework.utils.DateTime(messageDateTime) );
		}
		// successfulOutcome
		valueObject.setSuccessfulOutcome( domainObject.isSuccessfulOutcome() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.hl7.domain.objects.HL7Inbound extractHL7Inbound(ims.domain.ILightweightDomainFactory domainFactory, ims.hl7.vo.HL7InboundVo valueObject) 
	{
		return 	extractHL7Inbound(domainFactory, valueObject, new HashMap());
	}

	public static ims.hl7.domain.objects.HL7Inbound extractHL7Inbound(ims.domain.ILightweightDomainFactory domainFactory, ims.hl7.vo.HL7InboundVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_HL7Inbound();
		ims.hl7.domain.objects.HL7Inbound domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.hl7.domain.objects.HL7Inbound)domMap.get(valueObject);
			}
			// ims.hl7.vo.HL7InboundVo ID_HL7Inbound field is unknown
			domainObject = new ims.hl7.domain.objects.HL7Inbound();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_HL7Inbound());
			if (domMap.get(key) != null)
			{
				return (ims.hl7.domain.objects.HL7Inbound)domMap.get(key);
			}
			domainObject = (ims.hl7.domain.objects.HL7Inbound) domainFactory.getDomainObject(ims.hl7.domain.objects.HL7Inbound.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_HL7Inbound());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getHL7Message() != null && valueObject.getHL7Message().equals(""))
		{
			valueObject.setHL7Message(null);
		}
		domainObject.setHL7Message(valueObject.getHL7Message());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getFailureMessage() != null && valueObject.getFailureMessage().equals(""))
		{
			valueObject.setFailureMessage(null);
		}
		domainObject.setFailureMessage(valueObject.getFailureMessage());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.patient.domain.objects.Patient value3 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value3 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else
			{
				value3 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value3);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.ProviderSystem value4 = null;
		if ( null != valueObject.getProviderSystem() ) 
		{
			if (valueObject.getProviderSystem().getBoId() == null)
			{
				if (domMap.get(valueObject.getProviderSystem()) != null)
				{
					value4 = (ims.core.admin.domain.objects.ProviderSystem)domMap.get(valueObject.getProviderSystem());
				}
			}
			else
			{
				value4 = (ims.core.admin.domain.objects.ProviderSystem)domainFactory.getDomainObject(ims.core.admin.domain.objects.ProviderSystem.class, valueObject.getProviderSystem().getBoId());
			}
		}
		domainObject.setProviderSystem(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getMessageType() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getMessageType().getID());
		}
		domainObject.setMessageType(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getMessageCategory() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getMessageCategory().getID());
		}
		domainObject.setMessageCategory(value6);
		ims.framework.utils.DateTime dateTime7 = valueObject.getMessageDateTime();
		java.util.Date value7 = null;
		if ( dateTime7 != null ) 
		{
			value7 = dateTime7.getJavaDate();
		}
		domainObject.setMessageDateTime(value7);
		domainObject.setSuccessfulOutcome(valueObject.getSuccessfulOutcome());

		return domainObject;
	}

}
