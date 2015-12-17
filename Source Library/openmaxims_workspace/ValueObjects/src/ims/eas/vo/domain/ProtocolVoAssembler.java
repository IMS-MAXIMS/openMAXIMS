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
package ims.eas.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Barbara Worwood
 */
public class ProtocolVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.eas.vo.ProtocolVo copy(ims.eas.vo.ProtocolVo valueObjectDest, ims.eas.vo.ProtocolVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Protocol(valueObjectSrc.getID_Protocol());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// RecordingMOS
		valueObjectDest.setRecordingMOS(valueObjectSrc.getRecordingMOS());
		// RecordingDateTime
		valueObjectDest.setRecordingDateTime(valueObjectSrc.getRecordingDateTime());
		// ConsSessRequired
		valueObjectDest.setConsSessRequired(valueObjectSrc.getConsSessRequired());
		// ConsSessDefault
		valueObjectDest.setConsSessDefault(valueObjectSrc.getConsSessDefault());
		// PlanCTRequired
		valueObjectDest.setPlanCTRequired(valueObjectSrc.getPlanCTRequired());
		// PlanCTDefault
		valueObjectDest.setPlanCTDefault(valueObjectSrc.getPlanCTDefault());
		// AppropCCCL
		valueObjectDest.setAppropCCCL(valueObjectSrc.getAppropCCCL());
		// MRICoRegRequired
		valueObjectDest.setMRICoRegRequired(valueObjectSrc.getMRICoRegRequired());
		// MRIDefault
		valueObjectDest.setMRIDefault(valueObjectSrc.getMRIDefault());
		// DentistRequired
		valueObjectDest.setDentistRequired(valueObjectSrc.getDentistRequired());
		// DentistDefault
		valueObjectDest.setDentistDefault(valueObjectSrc.getDentistDefault());
		// PegRequired
		valueObjectDest.setPegRequired(valueObjectSrc.getPegRequired());
		// PEGDefault
		valueObjectDest.setPEGDefault(valueObjectSrc.getPEGDefault());
		// PetCTDefault
		valueObjectDest.setPetCTDefault(valueObjectSrc.getPetCTDefault());
		// SimlRequired
		valueObjectDest.setSimlRequired(valueObjectSrc.getSimlRequired());
		// SimulationDefault
		valueObjectDest.setSimulationDefault(valueObjectSrc.getSimulationDefault());
		// PetCTRequired
		valueObjectDest.setPetCTRequired(valueObjectSrc.getPetCTRequired());
		// IVContrastRequired
		valueObjectDest.setIVContrastRequired(valueObjectSrc.getIVContrastRequired());
		// IVContrastList
		valueObjectDest.setIVContrastList(valueObjectSrc.getIVContrastList());
		// IVContrastDefault
		valueObjectDest.setIVContrastDefault(valueObjectSrc.getIVContrastDefault());
		// OralContrastRequired
		valueObjectDest.setOralContrastRequired(valueObjectSrc.getOralContrastRequired());
		// OralContrastList
		valueObjectDest.setOralContrastList(valueObjectSrc.getOralContrastList());
		// OralContrastDefault
		valueObjectDest.setOralContrastDefault(valueObjectSrc.getOralContrastDefault());
		// GatingOptsRequired
		valueObjectDest.setGatingOptsRequired(valueObjectSrc.getGatingOptsRequired());
		// GatingOptsList
		valueObjectDest.setGatingOptsList(valueObjectSrc.getGatingOptsList());
		// GatingOptsDefault
		valueObjectDest.setGatingOptsDefault(valueObjectSrc.getGatingOptsDefault());
		// IMRTRequired
		valueObjectDest.setIMRTRequired(valueObjectSrc.getIMRTRequired());
		// IMRTList
		valueObjectDest.setIMRTList(valueObjectSrc.getIMRTList());
		// IMRTDefault
		valueObjectDest.setIMRTDefault(valueObjectSrc.getIMRTDefault());
		// ImmobTypeRequired
		valueObjectDest.setImmobTypeRequired(valueObjectSrc.getImmobTypeRequired());
		// ImmobTypeList
		valueObjectDest.setImmobTypeList(valueObjectSrc.getImmobTypeList());
		// ImmobTypeDefault
		valueObjectDest.setImmobTypeDefault(valueObjectSrc.getImmobTypeDefault());
		// MouldRoomRequired
		valueObjectDest.setMouldRoomRequired(valueObjectSrc.getMouldRoomRequired());
		// MouldRoomList
		valueObjectDest.setMouldRoomList(valueObjectSrc.getMouldRoomList());
		// MouldRoomDefault
		valueObjectDest.setMouldRoomDefault(valueObjectSrc.getMouldRoomDefault());
		// ClinTrialProtocol
		valueObjectDest.setClinTrialProtocol(valueObjectSrc.getClinTrialProtocol());
		// ClinicalTrial
		valueObjectDest.setClinicalTrial(valueObjectSrc.getClinicalTrial());
		// PrimaryTumour
		valueObjectDest.setPrimaryTumour(valueObjectSrc.getPrimaryTumour());
		// TreatmentSite
		valueObjectDest.setTreatmentSite(valueObjectSrc.getTreatmentSite());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// Phases
		valueObjectDest.setPhases(valueObjectSrc.getPhases());
		// ProtocolName
		valueObjectDest.setProtocolName(valueObjectSrc.getProtocolName());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createProtocolVoCollectionFromProtocol(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.eas.configuration.domain.objects.Protocol objects.
	 */
	public static ims.eas.vo.ProtocolVoCollection createProtocolVoCollectionFromProtocol(java.util.Set domainObjectSet)	
	{
		return createProtocolVoCollectionFromProtocol(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.eas.configuration.domain.objects.Protocol objects.
	 */
	public static ims.eas.vo.ProtocolVoCollection createProtocolVoCollectionFromProtocol(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.eas.vo.ProtocolVoCollection voList = new ims.eas.vo.ProtocolVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.eas.configuration.domain.objects.Protocol domainObject = (ims.eas.configuration.domain.objects.Protocol) iterator.next();
			ims.eas.vo.ProtocolVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.eas.configuration.domain.objects.Protocol objects.
	 */
	public static ims.eas.vo.ProtocolVoCollection createProtocolVoCollectionFromProtocol(java.util.List domainObjectList) 
	{
		return createProtocolVoCollectionFromProtocol(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.eas.configuration.domain.objects.Protocol objects.
	 */
	public static ims.eas.vo.ProtocolVoCollection createProtocolVoCollectionFromProtocol(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.eas.vo.ProtocolVoCollection voList = new ims.eas.vo.ProtocolVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.eas.configuration.domain.objects.Protocol domainObject = (ims.eas.configuration.domain.objects.Protocol) domainObjectList.get(i);
			ims.eas.vo.ProtocolVo vo = create(map, domainObject);

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
	 * Create the ims.eas.configuration.domain.objects.Protocol set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractProtocolSet(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.ProtocolVoCollection voCollection) 
	 {
	 	return extractProtocolSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractProtocolSet(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.ProtocolVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.eas.vo.ProtocolVo vo = voCollection.get(i);
			ims.eas.configuration.domain.objects.Protocol domainObject = ProtocolVoAssembler.extractProtocol(domainFactory, vo, domMap);

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
	 * Create the ims.eas.configuration.domain.objects.Protocol list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractProtocolList(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.ProtocolVoCollection voCollection) 
	 {
	 	return extractProtocolList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractProtocolList(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.ProtocolVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.eas.vo.ProtocolVo vo = voCollection.get(i);
			ims.eas.configuration.domain.objects.Protocol domainObject = ProtocolVoAssembler.extractProtocol(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.eas.configuration.domain.objects.Protocol object.
	 * @param domainObject ims.eas.configuration.domain.objects.Protocol
	 */
	 public static ims.eas.vo.ProtocolVo create(ims.eas.configuration.domain.objects.Protocol domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.eas.configuration.domain.objects.Protocol object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.eas.vo.ProtocolVo create(DomainObjectMap map, ims.eas.configuration.domain.objects.Protocol domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.eas.vo.ProtocolVo valueObject = (ims.eas.vo.ProtocolVo) map.getValueObject(domainObject, ims.eas.vo.ProtocolVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.eas.vo.ProtocolVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.eas.configuration.domain.objects.Protocol
	 */
	 public static ims.eas.vo.ProtocolVo insert(ims.eas.vo.ProtocolVo valueObject, ims.eas.configuration.domain.objects.Protocol domainObject) 
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
	 * @param domainObject ims.eas.configuration.domain.objects.Protocol
	 */
	 public static ims.eas.vo.ProtocolVo insert(DomainObjectMap map, ims.eas.vo.ProtocolVo valueObject, ims.eas.configuration.domain.objects.Protocol domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Protocol(domainObject.getId());
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
			
		// RecordingMOS
		valueObject.setRecordingMOS(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getRecordingMOS()) );
		// RecordingDateTime
		java.util.Date RecordingDateTime = domainObject.getRecordingDateTime();
		if ( null != RecordingDateTime ) 
		{
			valueObject.setRecordingDateTime(new ims.framework.utils.DateTime(RecordingDateTime) );
		}
		// ConsSessRequired
		ims.domain.lookups.LookupInstance instance3 = domainObject.getConsSessRequired();
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

			ims.eas.vo.lookups.OptionsRequired voLookup3 = new ims.eas.vo.lookups.OptionsRequired(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.eas.vo.lookups.OptionsRequired parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.eas.vo.lookups.OptionsRequired(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setConsSessRequired(voLookup3);
		}
				// ConsSessDefault
		ims.domain.lookups.LookupInstance instance4 = domainObject.getConsSessDefault();
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

			ims.core.vo.lookups.YesNo voLookup4 = new ims.core.vo.lookups.YesNo(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.YesNo(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setConsSessDefault(voLookup4);
		}
				// PlanCTRequired
		ims.domain.lookups.LookupInstance instance5 = domainObject.getPlanCTRequired();
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

			ims.eas.vo.lookups.OptionsRequired voLookup5 = new ims.eas.vo.lookups.OptionsRequired(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.eas.vo.lookups.OptionsRequired parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.eas.vo.lookups.OptionsRequired(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setPlanCTRequired(voLookup5);
		}
				// PlanCTDefault
		ims.domain.lookups.LookupInstance instance6 = domainObject.getPlanCTDefault();
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

			ims.core.vo.lookups.YesNo voLookup6 = new ims.core.vo.lookups.YesNo(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.YesNo(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setPlanCTDefault(voLookup6);
		}
				// AppropCCCL
		ims.domain.lookups.LookupInstance instance7 = domainObject.getAppropCCCL();
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

			ims.core.vo.lookups.YesNo voLookup7 = new ims.core.vo.lookups.YesNo(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.core.vo.lookups.YesNo(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setAppropCCCL(voLookup7);
		}
				// MRICoRegRequired
		ims.domain.lookups.LookupInstance instance8 = domainObject.getMRICoRegRequired();
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

			ims.eas.vo.lookups.OptionsRequired voLookup8 = new ims.eas.vo.lookups.OptionsRequired(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.eas.vo.lookups.OptionsRequired parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.eas.vo.lookups.OptionsRequired(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setMRICoRegRequired(voLookup8);
		}
				// MRIDefault
		ims.domain.lookups.LookupInstance instance9 = domainObject.getMRIDefault();
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

			ims.core.vo.lookups.YesNo voLookup9 = new ims.core.vo.lookups.YesNo(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.core.vo.lookups.YesNo(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setMRIDefault(voLookup9);
		}
				// DentistRequired
		ims.domain.lookups.LookupInstance instance10 = domainObject.getDentistRequired();
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

			ims.eas.vo.lookups.OptionsRequired voLookup10 = new ims.eas.vo.lookups.OptionsRequired(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.eas.vo.lookups.OptionsRequired parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.eas.vo.lookups.OptionsRequired(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setDentistRequired(voLookup10);
		}
				// DentistDefault
		ims.domain.lookups.LookupInstance instance11 = domainObject.getDentistDefault();
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

			ims.core.vo.lookups.YesNo voLookup11 = new ims.core.vo.lookups.YesNo(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.core.vo.lookups.YesNo(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setDentistDefault(voLookup11);
		}
				// PegRequired
		ims.domain.lookups.LookupInstance instance12 = domainObject.getPegRequired();
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

			ims.eas.vo.lookups.OptionsRequired voLookup12 = new ims.eas.vo.lookups.OptionsRequired(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.eas.vo.lookups.OptionsRequired parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.eas.vo.lookups.OptionsRequired(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setPegRequired(voLookup12);
		}
				// PEGDefault
		ims.domain.lookups.LookupInstance instance13 = domainObject.getPEGDefault();
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

			ims.core.vo.lookups.YesNo voLookup13 = new ims.core.vo.lookups.YesNo(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup13 = voLookup13;
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
								parentVoLookup13.setParent(new ims.core.vo.lookups.YesNo(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setPEGDefault(voLookup13);
		}
				// PetCTDefault
		ims.domain.lookups.LookupInstance instance14 = domainObject.getPetCTDefault();
		if ( null != instance14 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance14.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance14.getImage().getImageId(), instance14.getImage().getImagePath());
			}
			color = instance14.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup14 = new ims.core.vo.lookups.YesNo(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup14 = voLookup14;
			ims.domain.lookups.LookupInstance parent14 = instance14.getParent();
			while (parent14 != null)
			{
				if (parent14.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent14.getImage().getImageId(), parent14.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent14.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup14.setParent(new ims.core.vo.lookups.YesNo(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setPetCTDefault(voLookup14);
		}
				// SimlRequired
		ims.domain.lookups.LookupInstance instance15 = domainObject.getSimlRequired();
		if ( null != instance15 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance15.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance15.getImage().getImageId(), instance15.getImage().getImagePath());
			}
			color = instance15.getColor();
			if (color != null) 
				color.getValue();

			ims.eas.vo.lookups.OptionsRequired voLookup15 = new ims.eas.vo.lookups.OptionsRequired(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.eas.vo.lookups.OptionsRequired parentVoLookup15 = voLookup15;
			ims.domain.lookups.LookupInstance parent15 = instance15.getParent();
			while (parent15 != null)
			{
				if (parent15.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent15.getImage().getImageId(), parent15.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent15.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup15.setParent(new ims.eas.vo.lookups.OptionsRequired(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setSimlRequired(voLookup15);
		}
				// SimulationDefault
		ims.domain.lookups.LookupInstance instance16 = domainObject.getSimulationDefault();
		if ( null != instance16 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance16.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance16.getImage().getImageId(), instance16.getImage().getImagePath());
			}
			color = instance16.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup16 = new ims.core.vo.lookups.YesNo(instance16.getId(),instance16.getText(), instance16.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup16 = voLookup16;
			ims.domain.lookups.LookupInstance parent16 = instance16.getParent();
			while (parent16 != null)
			{
				if (parent16.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent16.getImage().getImageId(), parent16.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent16.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup16.setParent(new ims.core.vo.lookups.YesNo(parent16.getId(),parent16.getText(), parent16.isActive(), null, img, color));
				parentVoLookup16 = parentVoLookup16.getParent();
								parent16 = parent16.getParent();
			}			
			valueObject.setSimulationDefault(voLookup16);
		}
				// PetCTRequired
		ims.domain.lookups.LookupInstance instance17 = domainObject.getPetCTRequired();
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

			ims.eas.vo.lookups.OptionsRequired voLookup17 = new ims.eas.vo.lookups.OptionsRequired(instance17.getId(),instance17.getText(), instance17.isActive(), null, img, color);
			ims.eas.vo.lookups.OptionsRequired parentVoLookup17 = voLookup17;
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
								parentVoLookup17.setParent(new ims.eas.vo.lookups.OptionsRequired(parent17.getId(),parent17.getText(), parent17.isActive(), null, img, color));
				parentVoLookup17 = parentVoLookup17.getParent();
								parent17 = parent17.getParent();
			}			
			valueObject.setPetCTRequired(voLookup17);
		}
				// IVContrastRequired
		ims.domain.lookups.LookupInstance instance18 = domainObject.getIVContrastRequired();
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

			ims.eas.vo.lookups.OptionsRequired voLookup18 = new ims.eas.vo.lookups.OptionsRequired(instance18.getId(),instance18.getText(), instance18.isActive(), null, img, color);
			ims.eas.vo.lookups.OptionsRequired parentVoLookup18 = voLookup18;
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
								parentVoLookup18.setParent(new ims.eas.vo.lookups.OptionsRequired(parent18.getId(),parent18.getText(), parent18.isActive(), null, img, color));
				parentVoLookup18 = parentVoLookup18.getParent();
								parent18 = parent18.getParent();
			}			
			valueObject.setIVContrastRequired(voLookup18);
		}
				// IVContrastList
		java.util.List listIVContrastList = domainObject.getIVContrastList();
		ims.eas.vo.lookups.IVContrastCollection IVContrastList = new ims.eas.vo.lookups.IVContrastCollection();
		for(java.util.Iterator iterator = listIVContrastList.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.eas.vo.lookups.IVContrast voInstance = new ims.eas.vo.lookups.IVContrast(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.eas.vo.lookups.IVContrast parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.eas.vo.lookups.IVContrast(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			IVContrastList.add(voInstance);
		}
		valueObject.setIVContrastList( IVContrastList );
		// IVContrastDefault
		ims.domain.lookups.LookupInstance instance20 = domainObject.getIVContrastDefault();
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

			ims.eas.vo.lookups.IVContrast voLookup20 = new ims.eas.vo.lookups.IVContrast(instance20.getId(),instance20.getText(), instance20.isActive(), null, img, color);
			ims.eas.vo.lookups.IVContrast parentVoLookup20 = voLookup20;
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
								parentVoLookup20.setParent(new ims.eas.vo.lookups.IVContrast(parent20.getId(),parent20.getText(), parent20.isActive(), null, img, color));
				parentVoLookup20 = parentVoLookup20.getParent();
								parent20 = parent20.getParent();
			}			
			valueObject.setIVContrastDefault(voLookup20);
		}
				// OralContrastRequired
		ims.domain.lookups.LookupInstance instance21 = domainObject.getOralContrastRequired();
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

			ims.eas.vo.lookups.OptionsRequired voLookup21 = new ims.eas.vo.lookups.OptionsRequired(instance21.getId(),instance21.getText(), instance21.isActive(), null, img, color);
			ims.eas.vo.lookups.OptionsRequired parentVoLookup21 = voLookup21;
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
								parentVoLookup21.setParent(new ims.eas.vo.lookups.OptionsRequired(parent21.getId(),parent21.getText(), parent21.isActive(), null, img, color));
				parentVoLookup21 = parentVoLookup21.getParent();
								parent21 = parent21.getParent();
			}			
			valueObject.setOralContrastRequired(voLookup21);
		}
				// OralContrastList
		java.util.List listOralContrastList = domainObject.getOralContrastList();
		ims.eas.vo.lookups.OralContrastCollection OralContrastList = new ims.eas.vo.lookups.OralContrastCollection();
		for(java.util.Iterator iterator = listOralContrastList.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.eas.vo.lookups.OralContrast voInstance = new ims.eas.vo.lookups.OralContrast(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.eas.vo.lookups.OralContrast parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.eas.vo.lookups.OralContrast(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			OralContrastList.add(voInstance);
		}
		valueObject.setOralContrastList( OralContrastList );
		// OralContrastDefault
		ims.domain.lookups.LookupInstance instance23 = domainObject.getOralContrastDefault();
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

			ims.eas.vo.lookups.OralContrast voLookup23 = new ims.eas.vo.lookups.OralContrast(instance23.getId(),instance23.getText(), instance23.isActive(), null, img, color);
			ims.eas.vo.lookups.OralContrast parentVoLookup23 = voLookup23;
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
								parentVoLookup23.setParent(new ims.eas.vo.lookups.OralContrast(parent23.getId(),parent23.getText(), parent23.isActive(), null, img, color));
				parentVoLookup23 = parentVoLookup23.getParent();
								parent23 = parent23.getParent();
			}			
			valueObject.setOralContrastDefault(voLookup23);
		}
				// GatingOptsRequired
		ims.domain.lookups.LookupInstance instance24 = domainObject.getGatingOptsRequired();
		if ( null != instance24 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance24.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance24.getImage().getImageId(), instance24.getImage().getImagePath());
			}
			color = instance24.getColor();
			if (color != null) 
				color.getValue();

			ims.eas.vo.lookups.OptionsRequired voLookup24 = new ims.eas.vo.lookups.OptionsRequired(instance24.getId(),instance24.getText(), instance24.isActive(), null, img, color);
			ims.eas.vo.lookups.OptionsRequired parentVoLookup24 = voLookup24;
			ims.domain.lookups.LookupInstance parent24 = instance24.getParent();
			while (parent24 != null)
			{
				if (parent24.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent24.getImage().getImageId(), parent24.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent24.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup24.setParent(new ims.eas.vo.lookups.OptionsRequired(parent24.getId(),parent24.getText(), parent24.isActive(), null, img, color));
				parentVoLookup24 = parentVoLookup24.getParent();
								parent24 = parent24.getParent();
			}			
			valueObject.setGatingOptsRequired(voLookup24);
		}
				// GatingOptsList
		java.util.List listGatingOptsList = domainObject.getGatingOptsList();
		ims.eas.vo.lookups.GatingOptionsCollection GatingOptsList = new ims.eas.vo.lookups.GatingOptionsCollection();
		for(java.util.Iterator iterator = listGatingOptsList.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.eas.vo.lookups.GatingOptions voInstance = new ims.eas.vo.lookups.GatingOptions(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.eas.vo.lookups.GatingOptions parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.eas.vo.lookups.GatingOptions(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			GatingOptsList.add(voInstance);
		}
		valueObject.setGatingOptsList( GatingOptsList );
		// GatingOptsDefault
		ims.domain.lookups.LookupInstance instance26 = domainObject.getGatingOptsDefault();
		if ( null != instance26 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance26.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance26.getImage().getImageId(), instance26.getImage().getImagePath());
			}
			color = instance26.getColor();
			if (color != null) 
				color.getValue();

			ims.eas.vo.lookups.GatingOptions voLookup26 = new ims.eas.vo.lookups.GatingOptions(instance26.getId(),instance26.getText(), instance26.isActive(), null, img, color);
			ims.eas.vo.lookups.GatingOptions parentVoLookup26 = voLookup26;
			ims.domain.lookups.LookupInstance parent26 = instance26.getParent();
			while (parent26 != null)
			{
				if (parent26.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent26.getImage().getImageId(), parent26.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent26.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup26.setParent(new ims.eas.vo.lookups.GatingOptions(parent26.getId(),parent26.getText(), parent26.isActive(), null, img, color));
				parentVoLookup26 = parentVoLookup26.getParent();
								parent26 = parent26.getParent();
			}			
			valueObject.setGatingOptsDefault(voLookup26);
		}
				// IMRTRequired
		ims.domain.lookups.LookupInstance instance27 = domainObject.getIMRTRequired();
		if ( null != instance27 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance27.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance27.getImage().getImageId(), instance27.getImage().getImagePath());
			}
			color = instance27.getColor();
			if (color != null) 
				color.getValue();

			ims.eas.vo.lookups.OptionsRequired voLookup27 = new ims.eas.vo.lookups.OptionsRequired(instance27.getId(),instance27.getText(), instance27.isActive(), null, img, color);
			ims.eas.vo.lookups.OptionsRequired parentVoLookup27 = voLookup27;
			ims.domain.lookups.LookupInstance parent27 = instance27.getParent();
			while (parent27 != null)
			{
				if (parent27.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent27.getImage().getImageId(), parent27.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent27.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup27.setParent(new ims.eas.vo.lookups.OptionsRequired(parent27.getId(),parent27.getText(), parent27.isActive(), null, img, color));
				parentVoLookup27 = parentVoLookup27.getParent();
								parent27 = parent27.getParent();
			}			
			valueObject.setIMRTRequired(voLookup27);
		}
				// IMRTList
		java.util.List listIMRTList = domainObject.getIMRTList();
		ims.eas.vo.lookups.IMRTCollection IMRTList = new ims.eas.vo.lookups.IMRTCollection();
		for(java.util.Iterator iterator = listIMRTList.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.eas.vo.lookups.IMRT voInstance = new ims.eas.vo.lookups.IMRT(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.eas.vo.lookups.IMRT parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.eas.vo.lookups.IMRT(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			IMRTList.add(voInstance);
		}
		valueObject.setIMRTList( IMRTList );
		// IMRTDefault
		ims.domain.lookups.LookupInstance instance29 = domainObject.getIMRTDefault();
		if ( null != instance29 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance29.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance29.getImage().getImageId(), instance29.getImage().getImagePath());
			}
			color = instance29.getColor();
			if (color != null) 
				color.getValue();

			ims.eas.vo.lookups.IMRT voLookup29 = new ims.eas.vo.lookups.IMRT(instance29.getId(),instance29.getText(), instance29.isActive(), null, img, color);
			ims.eas.vo.lookups.IMRT parentVoLookup29 = voLookup29;
			ims.domain.lookups.LookupInstance parent29 = instance29.getParent();
			while (parent29 != null)
			{
				if (parent29.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent29.getImage().getImageId(), parent29.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent29.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup29.setParent(new ims.eas.vo.lookups.IMRT(parent29.getId(),parent29.getText(), parent29.isActive(), null, img, color));
				parentVoLookup29 = parentVoLookup29.getParent();
								parent29 = parent29.getParent();
			}			
			valueObject.setIMRTDefault(voLookup29);
		}
				// ImmobTypeRequired
		ims.domain.lookups.LookupInstance instance30 = domainObject.getImmobTypeRequired();
		if ( null != instance30 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance30.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance30.getImage().getImageId(), instance30.getImage().getImagePath());
			}
			color = instance30.getColor();
			if (color != null) 
				color.getValue();

			ims.eas.vo.lookups.OptionsRequired voLookup30 = new ims.eas.vo.lookups.OptionsRequired(instance30.getId(),instance30.getText(), instance30.isActive(), null, img, color);
			ims.eas.vo.lookups.OptionsRequired parentVoLookup30 = voLookup30;
			ims.domain.lookups.LookupInstance parent30 = instance30.getParent();
			while (parent30 != null)
			{
				if (parent30.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent30.getImage().getImageId(), parent30.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent30.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup30.setParent(new ims.eas.vo.lookups.OptionsRequired(parent30.getId(),parent30.getText(), parent30.isActive(), null, img, color));
				parentVoLookup30 = parentVoLookup30.getParent();
								parent30 = parent30.getParent();
			}			
			valueObject.setImmobTypeRequired(voLookup30);
		}
				// ImmobTypeList
		java.util.List listImmobTypeList = domainObject.getImmobTypeList();
		ims.eas.vo.lookups.ImmobilisationTypeCollection ImmobTypeList = new ims.eas.vo.lookups.ImmobilisationTypeCollection();
		for(java.util.Iterator iterator = listImmobTypeList.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.eas.vo.lookups.ImmobilisationType voInstance = new ims.eas.vo.lookups.ImmobilisationType(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.eas.vo.lookups.ImmobilisationType parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.eas.vo.lookups.ImmobilisationType(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			ImmobTypeList.add(voInstance);
		}
		valueObject.setImmobTypeList( ImmobTypeList );
		// ImmobTypeDefault
		ims.domain.lookups.LookupInstance instance32 = domainObject.getImmobTypeDefault();
		if ( null != instance32 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance32.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance32.getImage().getImageId(), instance32.getImage().getImagePath());
			}
			color = instance32.getColor();
			if (color != null) 
				color.getValue();

			ims.eas.vo.lookups.ImmobilisationType voLookup32 = new ims.eas.vo.lookups.ImmobilisationType(instance32.getId(),instance32.getText(), instance32.isActive(), null, img, color);
			ims.eas.vo.lookups.ImmobilisationType parentVoLookup32 = voLookup32;
			ims.domain.lookups.LookupInstance parent32 = instance32.getParent();
			while (parent32 != null)
			{
				if (parent32.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent32.getImage().getImageId(), parent32.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent32.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup32.setParent(new ims.eas.vo.lookups.ImmobilisationType(parent32.getId(),parent32.getText(), parent32.isActive(), null, img, color));
				parentVoLookup32 = parentVoLookup32.getParent();
								parent32 = parent32.getParent();
			}			
			valueObject.setImmobTypeDefault(voLookup32);
		}
				// MouldRoomRequired
		ims.domain.lookups.LookupInstance instance33 = domainObject.getMouldRoomRequired();
		if ( null != instance33 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance33.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance33.getImage().getImageId(), instance33.getImage().getImagePath());
			}
			color = instance33.getColor();
			if (color != null) 
				color.getValue();

			ims.eas.vo.lookups.OptionsRequired voLookup33 = new ims.eas.vo.lookups.OptionsRequired(instance33.getId(),instance33.getText(), instance33.isActive(), null, img, color);
			ims.eas.vo.lookups.OptionsRequired parentVoLookup33 = voLookup33;
			ims.domain.lookups.LookupInstance parent33 = instance33.getParent();
			while (parent33 != null)
			{
				if (parent33.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent33.getImage().getImageId(), parent33.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent33.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup33.setParent(new ims.eas.vo.lookups.OptionsRequired(parent33.getId(),parent33.getText(), parent33.isActive(), null, img, color));
				parentVoLookup33 = parentVoLookup33.getParent();
								parent33 = parent33.getParent();
			}			
			valueObject.setMouldRoomRequired(voLookup33);
		}
				// MouldRoomList
		java.util.List listMouldRoomList = domainObject.getMouldRoomList();
		ims.eas.vo.lookups.MouldRoomActivityCollection MouldRoomList = new ims.eas.vo.lookups.MouldRoomActivityCollection();
		for(java.util.Iterator iterator = listMouldRoomList.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.eas.vo.lookups.MouldRoomActivity voInstance = new ims.eas.vo.lookups.MouldRoomActivity(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.eas.vo.lookups.MouldRoomActivity parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.eas.vo.lookups.MouldRoomActivity(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			MouldRoomList.add(voInstance);
		}
		valueObject.setMouldRoomList( MouldRoomList );
		// MouldRoomDefault
		ims.domain.lookups.LookupInstance instance35 = domainObject.getMouldRoomDefault();
		if ( null != instance35 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance35.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance35.getImage().getImageId(), instance35.getImage().getImagePath());
			}
			color = instance35.getColor();
			if (color != null) 
				color.getValue();

			ims.eas.vo.lookups.MouldRoomActivity voLookup35 = new ims.eas.vo.lookups.MouldRoomActivity(instance35.getId(),instance35.getText(), instance35.isActive(), null, img, color);
			ims.eas.vo.lookups.MouldRoomActivity parentVoLookup35 = voLookup35;
			ims.domain.lookups.LookupInstance parent35 = instance35.getParent();
			while (parent35 != null)
			{
				if (parent35.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent35.getImage().getImageId(), parent35.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent35.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup35.setParent(new ims.eas.vo.lookups.MouldRoomActivity(parent35.getId(),parent35.getText(), parent35.isActive(), null, img, color));
				parentVoLookup35 = parentVoLookup35.getParent();
								parent35 = parent35.getParent();
			}			
			valueObject.setMouldRoomDefault(voLookup35);
		}
				// ClinTrialProtocol
		valueObject.setClinTrialProtocol( domainObject.isClinTrialProtocol() );
		// ClinicalTrial
		ims.domain.lookups.LookupInstance instance37 = domainObject.getClinicalTrial();
		if ( null != instance37 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance37.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance37.getImage().getImageId(), instance37.getImage().getImagePath());
			}
			color = instance37.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.ClinicalTrialName voLookup37 = new ims.oncology.vo.lookups.ClinicalTrialName(instance37.getId(),instance37.getText(), instance37.isActive(), null, img, color);
			ims.oncology.vo.lookups.ClinicalTrialName parentVoLookup37 = voLookup37;
			ims.domain.lookups.LookupInstance parent37 = instance37.getParent();
			while (parent37 != null)
			{
				if (parent37.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent37.getImage().getImageId(), parent37.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent37.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup37.setParent(new ims.oncology.vo.lookups.ClinicalTrialName(parent37.getId(),parent37.getText(), parent37.isActive(), null, img, color));
				parentVoLookup37 = parentVoLookup37.getParent();
								parent37 = parent37.getParent();
			}			
			valueObject.setClinicalTrial(voLookup37);
		}
				// PrimaryTumour
		valueObject.setPrimaryTumour(ims.eas.vo.domain.PrimaryTumourNameVoAssembler.create(map, domainObject.getPrimaryTumour()) );
		// TreatmentSite
		valueObject.setTreatmentSite(ims.eas.vo.domain.TreatmentSiteNameVoAssembler.create(map, domainObject.getTreatmentSite()) );
		// Status
		ims.domain.lookups.LookupInstance instance40 = domainObject.getStatus();
		if ( null != instance40 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance40.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance40.getImage().getImageId(), instance40.getImage().getImagePath());
			}
			color = instance40.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup40 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance40.getId(),instance40.getText(), instance40.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup40 = voLookup40;
			ims.domain.lookups.LookupInstance parent40 = instance40.getParent();
			while (parent40 != null)
			{
				if (parent40.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent40.getImage().getImageId(), parent40.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent40.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup40.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent40.getId(),parent40.getText(), parent40.isActive(), null, img, color));
				parentVoLookup40 = parentVoLookup40.getParent();
								parent40 = parent40.getParent();
			}			
			valueObject.setStatus(voLookup40);
		}
				// Phases
		valueObject.setPhases(ims.eas.vo.domain.ProtocolPhaseVoAssembler.createProtocolPhaseVoCollectionFromProtocolPhase(map, domainObject.getPhases()) );
		// ProtocolName
		valueObject.setProtocolName(domainObject.getProtocolName());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.eas.configuration.domain.objects.Protocol extractProtocol(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.ProtocolVo valueObject) 
	{
		return 	extractProtocol(domainFactory, valueObject, new HashMap());
	}

	public static ims.eas.configuration.domain.objects.Protocol extractProtocol(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.ProtocolVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Protocol();
		ims.eas.configuration.domain.objects.Protocol domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.eas.configuration.domain.objects.Protocol)domMap.get(valueObject);
			}
			// ims.eas.vo.ProtocolVo ID_Protocol field is unknown
			domainObject = new ims.eas.configuration.domain.objects.Protocol();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Protocol());
			if (domMap.get(key) != null)
			{
				return (ims.eas.configuration.domain.objects.Protocol)domMap.get(key);
			}
			domainObject = (ims.eas.configuration.domain.objects.Protocol) domainFactory.getDomainObject(ims.eas.configuration.domain.objects.Protocol.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Protocol());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value1 = null;
		if ( null != valueObject.getRecordingMOS() ) 
		{
			if (valueObject.getRecordingMOS().getBoId() == null)
			{
				if (domMap.get(valueObject.getRecordingMOS()) != null)
				{
					value1 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getRecordingMOS());
				}
			}
			else
			{
				value1 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getRecordingMOS().getBoId());
			}
		}
		domainObject.setRecordingMOS(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getRecordingDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setRecordingDateTime(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getConsSessRequired() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getConsSessRequired().getID());
		}
		domainObject.setConsSessRequired(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getConsSessDefault() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getConsSessDefault().getID());
		}
		domainObject.setConsSessDefault(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getPlanCTRequired() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getPlanCTRequired().getID());
		}
		domainObject.setPlanCTRequired(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getPlanCTDefault() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getPlanCTDefault().getID());
		}
		domainObject.setPlanCTDefault(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getAppropCCCL() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getAppropCCCL().getID());
		}
		domainObject.setAppropCCCL(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getMRICoRegRequired() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getMRICoRegRequired().getID());
		}
		domainObject.setMRICoRegRequired(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getMRIDefault() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getMRIDefault().getID());
		}
		domainObject.setMRIDefault(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getDentistRequired() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getDentistRequired().getID());
		}
		domainObject.setDentistRequired(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getDentistDefault() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getDentistDefault().getID());
		}
		domainObject.setDentistDefault(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getPegRequired() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getPegRequired().getID());
		}
		domainObject.setPegRequired(value12);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getPEGDefault() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getPEGDefault().getID());
		}
		domainObject.setPEGDefault(value13);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getPetCTDefault() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getPetCTDefault().getID());
		}
		domainObject.setPetCTDefault(value14);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getSimlRequired() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getSimlRequired().getID());
		}
		domainObject.setSimlRequired(value15);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getSimulationDefault() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getSimulationDefault().getID());
		}
		domainObject.setSimulationDefault(value16);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value17 = null;
		if ( null != valueObject.getPetCTRequired() ) 
		{
			value17 =
				domainFactory.getLookupInstance(valueObject.getPetCTRequired().getID());
		}
		domainObject.setPetCTRequired(value17);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value18 = null;
		if ( null != valueObject.getIVContrastRequired() ) 
		{
			value18 =
				domainFactory.getLookupInstance(valueObject.getIVContrastRequired().getID());
		}
		domainObject.setIVContrastRequired(value18);
		ims.eas.vo.lookups.IVContrastCollection collection19 =
	valueObject.getIVContrastList();
	    java.util.List domainIVContrastList = domainObject.getIVContrastList();;			
	    int collection19Size=0;
		if (collection19 == null)
		{
			domainIVContrastList = new java.util.ArrayList(0);
		}
		else
		{
			collection19Size = collection19.size();
		}
		
		for(int i=0; i<collection19Size; i++) 
		{
			int instanceId = collection19.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainIVContrastList.indexOf(dom);
			if (domIdx == -1)
			{
				domainIVContrastList.add(i, dom);
			}
			else if (i != domIdx && i < domainIVContrastList.size())
			{
				Object tmp = domainIVContrastList.get(i);
				domainIVContrastList.set(i, domainIVContrastList.get(domIdx));
				domainIVContrastList.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j19 = domainIVContrastList.size();
		while (j19 > collection19Size)
		{
			domainIVContrastList.remove(j19-1);
			j19 = domainIVContrastList.size();
		}

		domainObject.setIVContrastList(domainIVContrastList);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value20 = null;
		if ( null != valueObject.getIVContrastDefault() ) 
		{
			value20 =
				domainFactory.getLookupInstance(valueObject.getIVContrastDefault().getID());
		}
		domainObject.setIVContrastDefault(value20);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value21 = null;
		if ( null != valueObject.getOralContrastRequired() ) 
		{
			value21 =
				domainFactory.getLookupInstance(valueObject.getOralContrastRequired().getID());
		}
		domainObject.setOralContrastRequired(value21);
		ims.eas.vo.lookups.OralContrastCollection collection22 =
	valueObject.getOralContrastList();
	    java.util.List domainOralContrastList = domainObject.getOralContrastList();;			
	    int collection22Size=0;
		if (collection22 == null)
		{
			domainOralContrastList = new java.util.ArrayList(0);
		}
		else
		{
			collection22Size = collection22.size();
		}
		
		for(int i=0; i<collection22Size; i++) 
		{
			int instanceId = collection22.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainOralContrastList.indexOf(dom);
			if (domIdx == -1)
			{
				domainOralContrastList.add(i, dom);
			}
			else if (i != domIdx && i < domainOralContrastList.size())
			{
				Object tmp = domainOralContrastList.get(i);
				domainOralContrastList.set(i, domainOralContrastList.get(domIdx));
				domainOralContrastList.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j22 = domainOralContrastList.size();
		while (j22 > collection22Size)
		{
			domainOralContrastList.remove(j22-1);
			j22 = domainOralContrastList.size();
		}

		domainObject.setOralContrastList(domainOralContrastList);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value23 = null;
		if ( null != valueObject.getOralContrastDefault() ) 
		{
			value23 =
				domainFactory.getLookupInstance(valueObject.getOralContrastDefault().getID());
		}
		domainObject.setOralContrastDefault(value23);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value24 = null;
		if ( null != valueObject.getGatingOptsRequired() ) 
		{
			value24 =
				domainFactory.getLookupInstance(valueObject.getGatingOptsRequired().getID());
		}
		domainObject.setGatingOptsRequired(value24);
		ims.eas.vo.lookups.GatingOptionsCollection collection25 =
	valueObject.getGatingOptsList();
	    java.util.List domainGatingOptsList = domainObject.getGatingOptsList();;			
	    int collection25Size=0;
		if (collection25 == null)
		{
			domainGatingOptsList = new java.util.ArrayList(0);
		}
		else
		{
			collection25Size = collection25.size();
		}
		
		for(int i=0; i<collection25Size; i++) 
		{
			int instanceId = collection25.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainGatingOptsList.indexOf(dom);
			if (domIdx == -1)
			{
				domainGatingOptsList.add(i, dom);
			}
			else if (i != domIdx && i < domainGatingOptsList.size())
			{
				Object tmp = domainGatingOptsList.get(i);
				domainGatingOptsList.set(i, domainGatingOptsList.get(domIdx));
				domainGatingOptsList.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j25 = domainGatingOptsList.size();
		while (j25 > collection25Size)
		{
			domainGatingOptsList.remove(j25-1);
			j25 = domainGatingOptsList.size();
		}

		domainObject.setGatingOptsList(domainGatingOptsList);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value26 = null;
		if ( null != valueObject.getGatingOptsDefault() ) 
		{
			value26 =
				domainFactory.getLookupInstance(valueObject.getGatingOptsDefault().getID());
		}
		domainObject.setGatingOptsDefault(value26);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value27 = null;
		if ( null != valueObject.getIMRTRequired() ) 
		{
			value27 =
				domainFactory.getLookupInstance(valueObject.getIMRTRequired().getID());
		}
		domainObject.setIMRTRequired(value27);
		ims.eas.vo.lookups.IMRTCollection collection28 =
	valueObject.getIMRTList();
	    java.util.List domainIMRTList = domainObject.getIMRTList();;			
	    int collection28Size=0;
		if (collection28 == null)
		{
			domainIMRTList = new java.util.ArrayList(0);
		}
		else
		{
			collection28Size = collection28.size();
		}
		
		for(int i=0; i<collection28Size; i++) 
		{
			int instanceId = collection28.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainIMRTList.indexOf(dom);
			if (domIdx == -1)
			{
				domainIMRTList.add(i, dom);
			}
			else if (i != domIdx && i < domainIMRTList.size())
			{
				Object tmp = domainIMRTList.get(i);
				domainIMRTList.set(i, domainIMRTList.get(domIdx));
				domainIMRTList.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j28 = domainIMRTList.size();
		while (j28 > collection28Size)
		{
			domainIMRTList.remove(j28-1);
			j28 = domainIMRTList.size();
		}

		domainObject.setIMRTList(domainIMRTList);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value29 = null;
		if ( null != valueObject.getIMRTDefault() ) 
		{
			value29 =
				domainFactory.getLookupInstance(valueObject.getIMRTDefault().getID());
		}
		domainObject.setIMRTDefault(value29);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value30 = null;
		if ( null != valueObject.getImmobTypeRequired() ) 
		{
			value30 =
				domainFactory.getLookupInstance(valueObject.getImmobTypeRequired().getID());
		}
		domainObject.setImmobTypeRequired(value30);
		ims.eas.vo.lookups.ImmobilisationTypeCollection collection31 =
	valueObject.getImmobTypeList();
	    java.util.List domainImmobTypeList = domainObject.getImmobTypeList();;			
	    int collection31Size=0;
		if (collection31 == null)
		{
			domainImmobTypeList = new java.util.ArrayList(0);
		}
		else
		{
			collection31Size = collection31.size();
		}
		
		for(int i=0; i<collection31Size; i++) 
		{
			int instanceId = collection31.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainImmobTypeList.indexOf(dom);
			if (domIdx == -1)
			{
				domainImmobTypeList.add(i, dom);
			}
			else if (i != domIdx && i < domainImmobTypeList.size())
			{
				Object tmp = domainImmobTypeList.get(i);
				domainImmobTypeList.set(i, domainImmobTypeList.get(domIdx));
				domainImmobTypeList.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j31 = domainImmobTypeList.size();
		while (j31 > collection31Size)
		{
			domainImmobTypeList.remove(j31-1);
			j31 = domainImmobTypeList.size();
		}

		domainObject.setImmobTypeList(domainImmobTypeList);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value32 = null;
		if ( null != valueObject.getImmobTypeDefault() ) 
		{
			value32 =
				domainFactory.getLookupInstance(valueObject.getImmobTypeDefault().getID());
		}
		domainObject.setImmobTypeDefault(value32);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value33 = null;
		if ( null != valueObject.getMouldRoomRequired() ) 
		{
			value33 =
				domainFactory.getLookupInstance(valueObject.getMouldRoomRequired().getID());
		}
		domainObject.setMouldRoomRequired(value33);
		ims.eas.vo.lookups.MouldRoomActivityCollection collection34 =
	valueObject.getMouldRoomList();
	    java.util.List domainMouldRoomList = domainObject.getMouldRoomList();;			
	    int collection34Size=0;
		if (collection34 == null)
		{
			domainMouldRoomList = new java.util.ArrayList(0);
		}
		else
		{
			collection34Size = collection34.size();
		}
		
		for(int i=0; i<collection34Size; i++) 
		{
			int instanceId = collection34.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainMouldRoomList.indexOf(dom);
			if (domIdx == -1)
			{
				domainMouldRoomList.add(i, dom);
			}
			else if (i != domIdx && i < domainMouldRoomList.size())
			{
				Object tmp = domainMouldRoomList.get(i);
				domainMouldRoomList.set(i, domainMouldRoomList.get(domIdx));
				domainMouldRoomList.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j34 = domainMouldRoomList.size();
		while (j34 > collection34Size)
		{
			domainMouldRoomList.remove(j34-1);
			j34 = domainMouldRoomList.size();
		}

		domainObject.setMouldRoomList(domainMouldRoomList);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value35 = null;
		if ( null != valueObject.getMouldRoomDefault() ) 
		{
			value35 =
				domainFactory.getLookupInstance(valueObject.getMouldRoomDefault().getID());
		}
		domainObject.setMouldRoomDefault(value35);
		domainObject.setClinTrialProtocol(valueObject.getClinTrialProtocol());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value37 = null;
		if ( null != valueObject.getClinicalTrial() ) 
		{
			value37 =
				domainFactory.getLookupInstance(valueObject.getClinicalTrial().getID());
		}
		domainObject.setClinicalTrial(value37);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.eas.configuration.domain.objects.PrimaryTumour value38 = null;
		if ( null != valueObject.getPrimaryTumour() ) 
		{
			if (valueObject.getPrimaryTumour().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrimaryTumour()) != null)
				{
					value38 = (ims.eas.configuration.domain.objects.PrimaryTumour)domMap.get(valueObject.getPrimaryTumour());
				}
			}
			else
			{
				value38 = (ims.eas.configuration.domain.objects.PrimaryTumour)domainFactory.getDomainObject(ims.eas.configuration.domain.objects.PrimaryTumour.class, valueObject.getPrimaryTumour().getBoId());
			}
		}
		domainObject.setPrimaryTumour(value38);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.eas.configuration.domain.objects.TreatmentSites value39 = null;
		if ( null != valueObject.getTreatmentSite() ) 
		{
			if (valueObject.getTreatmentSite().getBoId() == null)
			{
				if (domMap.get(valueObject.getTreatmentSite()) != null)
				{
					value39 = (ims.eas.configuration.domain.objects.TreatmentSites)domMap.get(valueObject.getTreatmentSite());
				}
			}
			else
			{
				value39 = (ims.eas.configuration.domain.objects.TreatmentSites)domainFactory.getDomainObject(ims.eas.configuration.domain.objects.TreatmentSites.class, valueObject.getTreatmentSite().getBoId());
			}
		}
		domainObject.setTreatmentSite(value39);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value40 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value40 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value40);
		domainObject.setPhases(ims.eas.vo.domain.ProtocolPhaseVoAssembler.extractProtocolPhaseList(domainFactory, valueObject.getPhases(), domainObject.getPhases(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getProtocolName() != null && valueObject.getProtocolName().equals(""))
		{
			valueObject.setProtocolName(null);
		}
		domainObject.setProtocolName(valueObject.getProtocolName());

		return domainObject;
	}

}
