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
public class NextOfKinAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.NextOfKin copy(ims.core.vo.NextOfKin valueObjectDest, ims.core.vo.NextOfKin valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Relative(valueObjectSrc.getID_Relative());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TempField
		valueObjectDest.setTempField(valueObjectSrc.getTempField());
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
 	 * If more than one call to an Assembler is made then #createNextOfKinCollectionFromNextOfKin(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.NextOfKin objects.
	 */
	public static ims.core.vo.NextOfKinCollection createNextOfKinCollectionFromNextOfKin(java.util.Set domainObjectSet)	
	{
		return createNextOfKinCollectionFromNextOfKin(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.NextOfKin objects.
	 */
	public static ims.core.vo.NextOfKinCollection createNextOfKinCollectionFromNextOfKin(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.NextOfKinCollection voList = new ims.core.vo.NextOfKinCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.patient.domain.objects.NextOfKin domainObject = (ims.core.patient.domain.objects.NextOfKin) iterator.next();
			ims.core.vo.NextOfKin vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.patient.domain.objects.NextOfKin objects.
	 */
	public static ims.core.vo.NextOfKinCollection createNextOfKinCollectionFromNextOfKin(java.util.List domainObjectList) 
	{
		return createNextOfKinCollectionFromNextOfKin(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.patient.domain.objects.NextOfKin objects.
	 */
	public static ims.core.vo.NextOfKinCollection createNextOfKinCollectionFromNextOfKin(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.NextOfKinCollection voList = new ims.core.vo.NextOfKinCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.patient.domain.objects.NextOfKin domainObject = (ims.core.patient.domain.objects.NextOfKin) domainObjectList.get(i);
			ims.core.vo.NextOfKin vo = create(map, domainObject);

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
	 * Create the ims.core.patient.domain.objects.NextOfKin set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractNextOfKinSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.NextOfKinCollection voCollection) 
	 {
	 	return extractNextOfKinSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractNextOfKinSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.NextOfKinCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.NextOfKin vo = voCollection.get(i);
			ims.core.patient.domain.objects.NextOfKin domainObject = NextOfKinAssembler.extractNextOfKin(domainFactory, vo, domMap);

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
	 * Create the ims.core.patient.domain.objects.NextOfKin list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractNextOfKinList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.NextOfKinCollection voCollection) 
	 {
	 	return extractNextOfKinList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractNextOfKinList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.NextOfKinCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.NextOfKin vo = voCollection.get(i);
			ims.core.patient.domain.objects.NextOfKin domainObject = NextOfKinAssembler.extractNextOfKin(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.patient.domain.objects.NextOfKin object.
	 * @param domainObject ims.core.patient.domain.objects.NextOfKin
	 */
	 public static ims.core.vo.NextOfKin create(ims.core.patient.domain.objects.NextOfKin domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.patient.domain.objects.NextOfKin object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.NextOfKin create(DomainObjectMap map, ims.core.patient.domain.objects.NextOfKin domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.NextOfKin valueObject = (ims.core.vo.NextOfKin) map.getValueObject(domainObject, ims.core.vo.NextOfKin.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.NextOfKin(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.patient.domain.objects.NextOfKin
	 */
	 public static ims.core.vo.NextOfKin insert(ims.core.vo.NextOfKin valueObject, ims.core.patient.domain.objects.NextOfKin domainObject) 
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
	 * @param domainObject ims.core.patient.domain.objects.NextOfKin
	 */
	 public static ims.core.vo.NextOfKin insert(DomainObjectMap map, ims.core.vo.NextOfKin valueObject, ims.core.patient.domain.objects.NextOfKin domainObject) 
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
			
		// TempField
		valueObject.setTempField(domainObject.getTempField());
		// name
		valueObject.setName(ims.core.vo.domain.PersonNameAssembler.create(map, domainObject.getName()) );
		// address
		valueObject.setAddress(ims.core.vo.domain.PersonAddressAssembler.create(map, domainObject.getAddress()) );
		// relationship
		ims.domain.lookups.LookupInstance instance4 = domainObject.getRelationship();
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

			ims.core.vo.lookups.PersonRelationship voLookup4 = new ims.core.vo.lookups.PersonRelationship(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.PersonRelationship parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.PersonRelationship(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setRelationship(voLookup4);
		}
				// CommChannels
		valueObject.setCommChannels(ims.core.vo.domain.CommChannelVoAssembler.createCommChannelVoCollectionFromCommunicationChannel(map, domainObject.getCommChannels()) );
		// pdsUpdateMode
		ims.domain.lookups.LookupInstance instance6 = domainObject.getPdsUpdateMode();
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

			ims.core.vo.lookups.PDSUpdateMode voLookup6 = new ims.core.vo.lookups.PDSUpdateMode(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.PDSUpdateMode parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.PDSUpdateMode(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setPdsUpdateMode(voLookup6);
		}
				// objectidentifier
		valueObject.setObjectidentifier(domainObject.getObjectidentifier());
		// Role
		ims.domain.lookups.LookupInstance instance8 = domainObject.getRole();
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

			ims.core.vo.lookups.PDSPersonRole voLookup8 = new ims.core.vo.lookups.PDSPersonRole(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.PDSPersonRole parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.PDSPersonRole(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setRole(voLookup8);
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
		ims.domain.lookups.LookupInstance instance13 = domainObject.getCallbckCons();
		if ( null != instance13 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance13.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance13.getImage().getImageId(), instance13.getImage().getImagePath());
			}
			color = instance13.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PDSConsent voLookup13 = new ims.core.vo.lookups.PDSConsent(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.core.vo.lookups.PDSConsent parentVoLookup13 = voLookup13;
			ims.domain.lookups.LookupInstance parent13 = instance13.getParent();
			while (parent13 != null)
			{
				if (parent13.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent13.getImage().getImageId(), parent13.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent13.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup13.setParent(new ims.core.vo.lookups.PDSConsent(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setCallbckCons(voLookup13);
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
		ims.domain.lookups.LookupInstance instance21 = domainObject.getPDSlanguage();
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

			ims.core.vo.lookups.PDSPreferredCommunicationLanguage voLookup21 = new ims.core.vo.lookups.PDSPreferredCommunicationLanguage(instance21.getId(),instance21.getText(), instance21.isActive(), null, img, color);
			ims.core.vo.lookups.PDSPreferredCommunicationLanguage parentVoLookup21 = voLookup21;
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
								parentVoLookup21.setParent(new ims.core.vo.lookups.PDSPreferredCommunicationLanguage(parent21.getId(),parent21.getText(), parent21.isActive(), null, img, color));
				parentVoLookup21 = parentVoLookup21.getParent();
								parent21 = parent21.getParent();
			}			
			valueObject.setPDSlanguage(voLookup21);
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
	public static ims.core.patient.domain.objects.NextOfKin extractNextOfKin(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.NextOfKin valueObject) 
	{
		return 	extractNextOfKin(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.patient.domain.objects.NextOfKin extractNextOfKin(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.NextOfKin valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Relative();
		ims.core.patient.domain.objects.NextOfKin domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.patient.domain.objects.NextOfKin)domMap.get(valueObject);
			}
			// ims.core.vo.NextOfKin ID_NextOfKin field is unknown
			domainObject = new ims.core.patient.domain.objects.NextOfKin();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Relative());
			if (domMap.get(key) != null)
			{
				return (ims.core.patient.domain.objects.NextOfKin)domMap.get(key);
			}
			domainObject = (ims.core.patient.domain.objects.NextOfKin) domainFactory.getDomainObject(ims.core.patient.domain.objects.NextOfKin.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Relative());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTempField() != null && valueObject.getTempField().equals(""))
		{
			valueObject.setTempField(null);
		}
		domainObject.setTempField(valueObject.getTempField());
		domainObject.setName(ims.core.vo.domain.PersonNameAssembler.extractPersonName(domainFactory, valueObject.getName(), domMap));
		domainObject.setAddress(ims.core.vo.domain.PersonAddressAssembler.extractAddress(domainFactory, valueObject.getAddress(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getRelationship() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getRelationship().getID());
		}
		domainObject.setRelationship(value4);
		domainObject.setCommChannels(ims.core.vo.domain.CommChannelVoAssembler.extractCommunicationChannelList(domainFactory, valueObject.getCommChannels(), domainObject.getCommChannels(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getPdsUpdateMode() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getPdsUpdateMode().getID());
		}
		domainObject.setPdsUpdateMode(value6);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getObjectidentifier() != null && valueObject.getObjectidentifier().equals(""))
		{
			valueObject.setObjectidentifier(null);
		}
		domainObject.setObjectidentifier(valueObject.getObjectidentifier());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getRole() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getRole().getID());
		}
		domainObject.setRole(value8);
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
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getCallbckCons() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getCallbckCons().getID());
		}
		domainObject.setCallbckCons(value13);
		domainObject.setBeffdatecnf(valueObject.getBeffdatecnf());
		domainObject.setBetdatecnf(valueObject.getBetdatecnf());
		java.util.Date value16 = null;
		ims.framework.utils.Date date16 = valueObject.getBeffdate();		
		if ( date16 != null ) 
		{
			value16 = date16.getDate();
		}
		domainObject.setBeffdate(value16);
		java.util.Date value17 = null;
		ims.framework.utils.Date date17 = valueObject.getBetdate();		
		if ( date17 != null ) 
		{
			value17 = date17.getDate();
		}
		domainObject.setBetdate(value17);
		ims.framework.utils.PartialDate dob = valueObject.getDob();
		Integer value18 = null;
		if ( null != dob ) 
		{
			value18 = dob.toInteger();
		}
		domainObject.setDob(value18);
		domainObject.setActive(valueObject.getActive());
		domainObject.setPDScontactPreferences(ims.core.vo.domain.PDSRelativeContactPrefVoAssembler.extractPDSRelativeContactPref(domainFactory, valueObject.getPDScontactPreferences(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value21 = null;
		if ( null != valueObject.getPDSlanguage() ) 
		{
			value21 =
				domainFactory.getLookupInstance(valueObject.getPDSlanguage().getID());
		}
		domainObject.setPDSlanguage(value21);
		domainObject.setPDSInterpreterRequired(valueObject.getPDSInterpreterRequired());
		domainObject.setPending(valueObject.getPending());
		domainObject.setIsConfidential(valueObject.getIsConfidential());

		return domainObject;
	}

}
