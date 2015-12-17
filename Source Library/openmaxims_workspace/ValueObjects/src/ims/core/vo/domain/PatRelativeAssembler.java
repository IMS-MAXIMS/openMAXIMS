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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author John MacEnri
 */
public class PatRelativeAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PatRelative copy(ims.core.vo.PatRelative valueObjectDest, ims.core.vo.PatRelative valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Relative(valueObjectSrc.getID_Relative());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// name
		valueObjectDest.setName(valueObjectSrc.getName());
		// address
		valueObjectDest.setAddress(valueObjectSrc.getAddress());
		// relationship
		valueObjectDest.setRelationship(valueObjectSrc.getRelationship());
		// CommChannels
		valueObjectDest.setCommChannels(valueObjectSrc.getCommChannels());
		// pdsUpdateMode
		valueObjectDest.setPdsUpdateMode(valueObjectSrc.getPdsUpdateMode());
		// objectidentifier
		valueObjectDest.setObjectidentifier(valueObjectSrc.getObjectidentifier());
		// Role
		valueObjectDest.setRole(valueObjectSrc.getRole());
		// nhsNum
		valueObjectDest.setNhsNum(valueObjectSrc.getNhsNum());
		// contactRank
		valueObjectDest.setContactRank(valueObjectSrc.getContactRank());
		// nokInd
		valueObjectDest.setNokInd(valueObjectSrc.getNokInd());
		// cpyCorresp
		valueObjectDest.setCpyCorresp(valueObjectSrc.getCpyCorresp());
		// callbckCons
		valueObjectDest.setCallbckCons(valueObjectSrc.getCallbckCons());
		// beffdatecnf
		valueObjectDest.setBeffdatecnf(valueObjectSrc.getBeffdatecnf());
		// betdatecnf
		valueObjectDest.setBetdatecnf(valueObjectSrc.getBetdatecnf());
		// beffdate
		valueObjectDest.setBeffdate(valueObjectSrc.getBeffdate());
		// betdate
		valueObjectDest.setBetdate(valueObjectSrc.getBetdate());
		// dob
		valueObjectDest.setDob(valueObjectSrc.getDob());
		// active
		valueObjectDest.setActive(valueObjectSrc.getActive());
		// PDScontactPreferences
		valueObjectDest.setPDScontactPreferences(valueObjectSrc.getPDScontactPreferences());
		// PDSlanguage
		valueObjectDest.setPDSlanguage(valueObjectSrc.getPDSlanguage());
		// PDSInterpreterRequired
		valueObjectDest.setPDSInterpreterRequired(valueObjectSrc.getPDSInterpreterRequired());
		// Pending
		valueObjectDest.setPending(valueObjectSrc.getPending());
		// IsConfidential
		valueObjectDest.setIsConfidential(valueObjectSrc.getIsConfidential());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatRelativeCollectionFromRelative(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.Relative objects.
	 */
	public static ims.core.vo.PatRelativeCollection createPatRelativeCollectionFromRelative(java.util.Set domainObjectSet)	
	{
		return createPatRelativeCollectionFromRelative(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.Relative objects.
	 */
	public static ims.core.vo.PatRelativeCollection createPatRelativeCollectionFromRelative(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatRelativeCollection voList = new ims.core.vo.PatRelativeCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.patient.domain.objects.Relative domainObject = (ims.core.patient.domain.objects.Relative) iterator.next();
			ims.core.vo.PatRelative vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.patient.domain.objects.Relative objects.
	 */
	public static ims.core.vo.PatRelativeCollection createPatRelativeCollectionFromRelative(java.util.List domainObjectList) 
	{
		return createPatRelativeCollectionFromRelative(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.patient.domain.objects.Relative objects.
	 */
	public static ims.core.vo.PatRelativeCollection createPatRelativeCollectionFromRelative(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatRelativeCollection voList = new ims.core.vo.PatRelativeCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.patient.domain.objects.Relative domainObject = (ims.core.patient.domain.objects.Relative) domainObjectList.get(i);
			ims.core.vo.PatRelative vo = create(map, domainObject);

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
	 * Create the ims.core.patient.domain.objects.Relative set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractRelativeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatRelativeCollection voCollection) 
	 {
	 	return extractRelativeSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractRelativeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatRelativeCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatRelative vo = voCollection.get(i);
			ims.core.patient.domain.objects.Relative domainObject = PatRelativeAssembler.extractRelative(domainFactory, vo, domMap);

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
	 * Create the ims.core.patient.domain.objects.Relative list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractRelativeList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatRelativeCollection voCollection) 
	 {
	 	return extractRelativeList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractRelativeList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatRelativeCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatRelative vo = voCollection.get(i);
			ims.core.patient.domain.objects.Relative domainObject = PatRelativeAssembler.extractRelative(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.patient.domain.objects.Relative object.
	 * @param domainObject ims.core.patient.domain.objects.Relative
	 */
	 public static ims.core.vo.PatRelative create(ims.core.patient.domain.objects.Relative domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.patient.domain.objects.Relative object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PatRelative create(DomainObjectMap map, ims.core.patient.domain.objects.Relative domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PatRelative valueObject = (ims.core.vo.PatRelative) map.getValueObject(domainObject, ims.core.vo.PatRelative.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PatRelative(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.patient.domain.objects.Relative
	 */
	 public static ims.core.vo.PatRelative insert(ims.core.vo.PatRelative valueObject, ims.core.patient.domain.objects.Relative domainObject) 
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
	 * @param domainObject ims.core.patient.domain.objects.Relative
	 */
	 public static ims.core.vo.PatRelative insert(DomainObjectMap map, ims.core.vo.PatRelative valueObject, ims.core.patient.domain.objects.Relative domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Relative(domainObject.getId());
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
			
		// name
		valueObject.setName(ims.core.vo.domain.PersonNameAssembler.create(map, domainObject.getName()) );
		// address
		valueObject.setAddress(ims.core.vo.domain.PersonAddressAssembler.create(map, domainObject.getAddress()) );
		// relationship
		ims.domain.lookups.LookupInstance instance3 = domainObject.getRelationship();
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

			ims.core.vo.lookups.PersonRelationship voLookup3 = new ims.core.vo.lookups.PersonRelationship(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.PersonRelationship parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.PersonRelationship(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setRelationship(voLookup3);
		}
				// CommChannels
		valueObject.setCommChannels(ims.core.vo.domain.CommChannelVoAssembler.createCommChannelVoCollectionFromCommunicationChannel(map, domainObject.getCommChannels()) );
		// pdsUpdateMode
		ims.domain.lookups.LookupInstance instance5 = domainObject.getPdsUpdateMode();
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

			ims.core.vo.lookups.PDSUpdateMode voLookup5 = new ims.core.vo.lookups.PDSUpdateMode(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.PDSUpdateMode parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.PDSUpdateMode(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setPdsUpdateMode(voLookup5);
		}
				// objectidentifier
		valueObject.setObjectidentifier(domainObject.getObjectidentifier());
		// Role
		ims.domain.lookups.LookupInstance instance7 = domainObject.getRole();
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

			ims.core.vo.lookups.PDSPersonRole voLookup7 = new ims.core.vo.lookups.PDSPersonRole(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.PDSPersonRole parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.core.vo.lookups.PDSPersonRole(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setRole(voLookup7);
		}
				// nhsNum
		valueObject.setNhsNum(domainObject.getNhsNum());
		// contactRank
		valueObject.setContactRank(domainObject.getContactRank());
		// nokInd
		valueObject.setNokInd( domainObject.isNokInd() );
		// cpyCorresp
		valueObject.setCpyCorresp( domainObject.isCpyCorresp() );
		// callbckCons
		ims.domain.lookups.LookupInstance instance12 = domainObject.getCallbckCons();
		if ( null != instance12 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance12.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance12.getImage().getImageId(), instance12.getImage().getImagePath());
			}
			color = instance12.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PDSConsent voLookup12 = new ims.core.vo.lookups.PDSConsent(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.core.vo.lookups.PDSConsent parentVoLookup12 = voLookup12;
			ims.domain.lookups.LookupInstance parent12 = instance12.getParent();
			while (parent12 != null)
			{
				if (parent12.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent12.getImage().getImageId(), parent12.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent12.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup12.setParent(new ims.core.vo.lookups.PDSConsent(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setCallbckCons(voLookup12);
		}
				// beffdatecnf
		valueObject.setBeffdatecnf( domainObject.isBeffdatecnf() );
		// betdatecnf
		valueObject.setBetdatecnf( domainObject.isBetdatecnf() );
		// beffdate
		java.util.Date beffdate = domainObject.getBeffdate();
		if ( null != beffdate ) 
		{
			valueObject.setBeffdate(new ims.framework.utils.Date(beffdate) );
		}
		// betdate
		java.util.Date betdate = domainObject.getBetdate();
		if ( null != betdate ) 
		{
			valueObject.setBetdate(new ims.framework.utils.Date(betdate) );
		}
		// dob
		Integer dob = domainObject.getDob();
		if ( null != dob ) 
		{
			valueObject.setDob(new ims.framework.utils.PartialDate(dob) );
		}
		// active
		valueObject.setActive( domainObject.isActive() );
		// PDScontactPreferences
		valueObject.setPDScontactPreferences(ims.core.vo.domain.PDSRelativeContactPrefVoAssembler.create(map, domainObject.getPDScontactPreferences()) );
		// PDSlanguage
		ims.domain.lookups.LookupInstance instance20 = domainObject.getPDSlanguage();
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

			ims.core.vo.lookups.PDSPreferredCommunicationLanguage voLookup20 = new ims.core.vo.lookups.PDSPreferredCommunicationLanguage(instance20.getId(),instance20.getText(), instance20.isActive(), null, img, color);
			ims.core.vo.lookups.PDSPreferredCommunicationLanguage parentVoLookup20 = voLookup20;
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
								parentVoLookup20.setParent(new ims.core.vo.lookups.PDSPreferredCommunicationLanguage(parent20.getId(),parent20.getText(), parent20.isActive(), null, img, color));
				parentVoLookup20 = parentVoLookup20.getParent();
								parent20 = parent20.getParent();
			}			
			valueObject.setPDSlanguage(voLookup20);
		}
				// PDSInterpreterRequired
		valueObject.setPDSInterpreterRequired( domainObject.isPDSInterpreterRequired() );
		// Pending
		valueObject.setPending( domainObject.isPending() );
		// IsConfidential
		valueObject.setIsConfidential( domainObject.isIsConfidential() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.patient.domain.objects.Relative extractRelative(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatRelative valueObject) 
	{
		return 	extractRelative(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.patient.domain.objects.Relative extractRelative(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatRelative valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Relative();
		ims.core.patient.domain.objects.Relative domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.patient.domain.objects.Relative)domMap.get(valueObject);
			}
			// ims.core.vo.PatRelative ID_Relative field is unknown
			domainObject = new ims.core.patient.domain.objects.Relative();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Relative());
			if (domMap.get(key) != null)
			{
				return (ims.core.patient.domain.objects.Relative)domMap.get(key);
			}
			domainObject = (ims.core.patient.domain.objects.Relative) domainFactory.getDomainObject(ims.core.patient.domain.objects.Relative.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Relative());

		domainObject.setName(ims.core.vo.domain.PersonNameAssembler.extractPersonName(domainFactory, valueObject.getName(), domMap));
		domainObject.setAddress(ims.core.vo.domain.PersonAddressAssembler.extractAddress(domainFactory, valueObject.getAddress(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getRelationship() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getRelationship().getID());
		}
		domainObject.setRelationship(value3);
		domainObject.setCommChannels(ims.core.vo.domain.CommChannelVoAssembler.extractCommunicationChannelList(domainFactory, valueObject.getCommChannels(), domainObject.getCommChannels(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getPdsUpdateMode() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getPdsUpdateMode().getID());
		}
		domainObject.setPdsUpdateMode(value5);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getObjectidentifier() != null && valueObject.getObjectidentifier().equals(""))
		{
			valueObject.setObjectidentifier(null);
		}
		domainObject.setObjectidentifier(valueObject.getObjectidentifier());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getRole() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getRole().getID());
		}
		domainObject.setRole(value7);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNhsNum() != null && valueObject.getNhsNum().equals(""))
		{
			valueObject.setNhsNum(null);
		}
		domainObject.setNhsNum(valueObject.getNhsNum());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getContactRank() != null && valueObject.getContactRank().equals(""))
		{
			valueObject.setContactRank(null);
		}
		domainObject.setContactRank(valueObject.getContactRank());
		domainObject.setNokInd(valueObject.getNokInd());
		domainObject.setCpyCorresp(valueObject.getCpyCorresp());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getCallbckCons() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getCallbckCons().getID());
		}
		domainObject.setCallbckCons(value12);
		domainObject.setBeffdatecnf(valueObject.getBeffdatecnf());
		domainObject.setBetdatecnf(valueObject.getBetdatecnf());
		java.util.Date value15 = null;
		ims.framework.utils.Date date15 = valueObject.getBeffdate();		
		if ( date15 != null ) 
		{
			value15 = date15.getDate();
		}
		domainObject.setBeffdate(value15);
		java.util.Date value16 = null;
		ims.framework.utils.Date date16 = valueObject.getBetdate();		
		if ( date16 != null ) 
		{
			value16 = date16.getDate();
		}
		domainObject.setBetdate(value16);
		ims.framework.utils.PartialDate dob = valueObject.getDob();
		Integer value17 = null;
		if ( null != dob ) 
		{
			value17 = dob.toInteger();
		}
		domainObject.setDob(value17);
		domainObject.setActive(valueObject.getActive());
		domainObject.setPDScontactPreferences(ims.core.vo.domain.PDSRelativeContactPrefVoAssembler.extractPDSRelativeContactPref(domainFactory, valueObject.getPDScontactPreferences(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value20 = null;
		if ( null != valueObject.getPDSlanguage() ) 
		{
			value20 =
				domainFactory.getLookupInstance(valueObject.getPDSlanguage().getID());
		}
		domainObject.setPDSlanguage(value20);
		domainObject.setPDSInterpreterRequired(valueObject.getPDSInterpreterRequired());
		domainObject.setPending(valueObject.getPending());
		domainObject.setIsConfidential(valueObject.getIsConfidential());

		return domainObject;
	}

}
