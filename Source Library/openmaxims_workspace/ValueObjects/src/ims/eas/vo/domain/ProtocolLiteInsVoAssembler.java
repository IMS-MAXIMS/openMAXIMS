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
package ims.eas.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Sean Nesbitt
 */
public class ProtocolLiteInsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.eas.vo.ProtocolLiteInsVo copy(ims.eas.vo.ProtocolLiteInsVo valueObjectDest, ims.eas.vo.ProtocolLiteInsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Protocol(valueObjectSrc.getID_Protocol());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TreatmentSite
		valueObjectDest.setTreatmentSite(valueObjectSrc.getTreatmentSite());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// Phases
		valueObjectDest.setPhases(valueObjectSrc.getPhases());
		// ClinTrialProtocol
		valueObjectDest.setClinTrialProtocol(valueObjectSrc.getClinTrialProtocol());
		// ClinicalTrial
		valueObjectDest.setClinicalTrial(valueObjectSrc.getClinicalTrial());
		// PrimaryTumour
		valueObjectDest.setPrimaryTumour(valueObjectSrc.getPrimaryTumour());
		// AppropCCCL
		valueObjectDest.setAppropCCCL(valueObjectSrc.getAppropCCCL());
		// ConsSessDefault
		valueObjectDest.setConsSessDefault(valueObjectSrc.getConsSessDefault());
		// ConsSessRequired
		valueObjectDest.setConsSessRequired(valueObjectSrc.getConsSessRequired());
		// ProtocolName
		valueObjectDest.setProtocolName(valueObjectSrc.getProtocolName());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createProtocolLiteInsVoCollectionFromProtocol(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.eas.configuration.domain.objects.Protocol objects.
	 */
	public static ims.eas.vo.ProtocolLiteInsVoCollection createProtocolLiteInsVoCollectionFromProtocol(java.util.Set domainObjectSet)	
	{
		return createProtocolLiteInsVoCollectionFromProtocol(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.eas.configuration.domain.objects.Protocol objects.
	 */
	public static ims.eas.vo.ProtocolLiteInsVoCollection createProtocolLiteInsVoCollectionFromProtocol(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.eas.vo.ProtocolLiteInsVoCollection voList = new ims.eas.vo.ProtocolLiteInsVoCollection();
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
			ims.eas.vo.ProtocolLiteInsVo vo = create(map, domainObject);
			
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
	public static ims.eas.vo.ProtocolLiteInsVoCollection createProtocolLiteInsVoCollectionFromProtocol(java.util.List domainObjectList) 
	{
		return createProtocolLiteInsVoCollectionFromProtocol(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.eas.configuration.domain.objects.Protocol objects.
	 */
	public static ims.eas.vo.ProtocolLiteInsVoCollection createProtocolLiteInsVoCollectionFromProtocol(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.eas.vo.ProtocolLiteInsVoCollection voList = new ims.eas.vo.ProtocolLiteInsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.eas.configuration.domain.objects.Protocol domainObject = (ims.eas.configuration.domain.objects.Protocol) domainObjectList.get(i);
			ims.eas.vo.ProtocolLiteInsVo vo = create(map, domainObject);

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
	 public static java.util.Set extractProtocolSet(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.ProtocolLiteInsVoCollection voCollection) 
	 {
	 	return extractProtocolSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractProtocolSet(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.ProtocolLiteInsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.eas.vo.ProtocolLiteInsVo vo = voCollection.get(i);
			ims.eas.configuration.domain.objects.Protocol domainObject = ProtocolLiteInsVoAssembler.extractProtocol(domainFactory, vo, domMap);

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
	 public static java.util.List extractProtocolList(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.ProtocolLiteInsVoCollection voCollection) 
	 {
	 	return extractProtocolList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractProtocolList(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.ProtocolLiteInsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.eas.vo.ProtocolLiteInsVo vo = voCollection.get(i);
			ims.eas.configuration.domain.objects.Protocol domainObject = ProtocolLiteInsVoAssembler.extractProtocol(domainFactory, vo, domMap);

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
	 public static ims.eas.vo.ProtocolLiteInsVo create(ims.eas.configuration.domain.objects.Protocol domainObject) 
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
	  public static ims.eas.vo.ProtocolLiteInsVo create(DomainObjectMap map, ims.eas.configuration.domain.objects.Protocol domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.eas.vo.ProtocolLiteInsVo valueObject = (ims.eas.vo.ProtocolLiteInsVo) map.getValueObject(domainObject, ims.eas.vo.ProtocolLiteInsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.eas.vo.ProtocolLiteInsVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.eas.vo.ProtocolLiteInsVo insert(ims.eas.vo.ProtocolLiteInsVo valueObject, ims.eas.configuration.domain.objects.Protocol domainObject) 
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
	 public static ims.eas.vo.ProtocolLiteInsVo insert(DomainObjectMap map, ims.eas.vo.ProtocolLiteInsVo valueObject, ims.eas.configuration.domain.objects.Protocol domainObject) 
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
			
		// TreatmentSite
		valueObject.setTreatmentSite(ims.eas.vo.domain.TreatmentSitesVoAssembler.create(map, domainObject.getTreatmentSite()) );
		// Status
		ims.domain.lookups.LookupInstance instance2 = domainObject.getStatus();
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

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup2 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setStatus(voLookup2);
		}
				// Phases
		valueObject.setPhases(ims.eas.vo.domain.ProtocolPhaseVoAssembler.createProtocolPhaseVoCollectionFromProtocolPhase(map, domainObject.getPhases()) );
		// ClinTrialProtocol
		valueObject.setClinTrialProtocol( domainObject.isClinTrialProtocol() );
		// ClinicalTrial
		ims.domain.lookups.LookupInstance instance5 = domainObject.getClinicalTrial();
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

			ims.oncology.vo.lookups.ClinicalTrialName voLookup5 = new ims.oncology.vo.lookups.ClinicalTrialName(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.oncology.vo.lookups.ClinicalTrialName parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.oncology.vo.lookups.ClinicalTrialName(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setClinicalTrial(voLookup5);
		}
				// PrimaryTumour
		valueObject.setPrimaryTumour(ims.eas.vo.domain.PrimaryTumourNameVoAssembler.create(map, domainObject.getPrimaryTumour()) );
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
				// ConsSessDefault
		ims.domain.lookups.LookupInstance instance8 = domainObject.getConsSessDefault();
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
			valueObject.setConsSessDefault(voLookup8);
		}
				// ConsSessRequired
		ims.domain.lookups.LookupInstance instance9 = domainObject.getConsSessRequired();
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

			ims.eas.vo.lookups.OptionsRequired voLookup9 = new ims.eas.vo.lookups.OptionsRequired(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.eas.vo.lookups.OptionsRequired parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.eas.vo.lookups.OptionsRequired(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setConsSessRequired(voLookup9);
		}
				// ProtocolName
		valueObject.setProtocolName(domainObject.getProtocolName());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.eas.configuration.domain.objects.Protocol extractProtocol(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.ProtocolLiteInsVo valueObject) 
	{
		return 	extractProtocol(domainFactory, valueObject, new HashMap());
	}

	public static ims.eas.configuration.domain.objects.Protocol extractProtocol(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.ProtocolLiteInsVo valueObject, HashMap domMap) 
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
			// ims.eas.vo.ProtocolLiteInsVo ID_Protocol field is unknown
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
	ims.eas.configuration.domain.objects.TreatmentSites value1 = null;
		if ( null != valueObject.getTreatmentSite() ) 
		{
			if (valueObject.getTreatmentSite().getBoId() == null)
			{
				if (domMap.get(valueObject.getTreatmentSite()) != null)
				{
					value1 = (ims.eas.configuration.domain.objects.TreatmentSites)domMap.get(valueObject.getTreatmentSite());
				}
			}
			else
			{
				value1 = (ims.eas.configuration.domain.objects.TreatmentSites)domainFactory.getDomainObject(ims.eas.configuration.domain.objects.TreatmentSites.class, valueObject.getTreatmentSite().getBoId());
			}
		}
		domainObject.setTreatmentSite(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value2);

		// SaveAsRefVO treated as RefValueObject
		ims.eas.configuration.vo.ProtocolPhaseRefVoCollection refCollection3 = new ims.eas.configuration.vo.ProtocolPhaseRefVoCollection();
		if (valueObject.getPhases() != null)
		{
			for (int i3=0; i3<valueObject.getPhases().size(); i3++)
			{
				ims.eas.configuration.vo.ProtocolPhaseRefVo ref3 = (ims.eas.configuration.vo.ProtocolPhaseRefVo)valueObject.getPhases().get(i3);
				refCollection3.add(ref3);
			}
		}
		int size3 = (null == refCollection3) ? 0 : refCollection3.size();		
		java.util.List domainPhases3 = domainObject.getPhases();
		if (domainPhases3 == null)
		{
			domainPhases3 = new java.util.ArrayList();
		}
		for(int i=0; i < size3; i++) 
		{
			ims.eas.configuration.vo.ProtocolPhaseRefVo vo = refCollection3.get(i);			
			ims.eas.configuration.domain.objects.ProtocolPhase dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.eas.configuration.domain.objects.ProtocolPhase)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.eas.configuration.domain.objects.ProtocolPhase)domainFactory.getDomainObject( ims.eas.configuration.domain.objects.ProtocolPhase.class, vo.getBoId());
				}
			}

			int domIdx = domainPhases3.indexOf(dom);
			if (domIdx == -1)
			{
				domainPhases3.add(i, dom);
			}
			else if (i != domIdx && i < domainPhases3.size())
			{
				Object tmp = domainPhases3.get(i);
				domainPhases3.set(i, domainPhases3.get(domIdx));
				domainPhases3.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i3 = domainPhases3.size();
		while (i3 > size3)
		{
			domainPhases3.remove(i3-1);
			i3 = domainPhases3.size();
		}
		
		domainObject.setPhases(domainPhases3);		
		domainObject.setClinTrialProtocol(valueObject.getClinTrialProtocol());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getClinicalTrial() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getClinicalTrial().getID());
		}
		domainObject.setClinicalTrial(value5);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.eas.configuration.domain.objects.PrimaryTumour value6 = null;
		if ( null != valueObject.getPrimaryTumour() ) 
		{
			if (valueObject.getPrimaryTumour().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrimaryTumour()) != null)
				{
					value6 = (ims.eas.configuration.domain.objects.PrimaryTumour)domMap.get(valueObject.getPrimaryTumour());
				}
			}
			else
			{
				value6 = (ims.eas.configuration.domain.objects.PrimaryTumour)domainFactory.getDomainObject(ims.eas.configuration.domain.objects.PrimaryTumour.class, valueObject.getPrimaryTumour().getBoId());
			}
		}
		domainObject.setPrimaryTumour(value6);
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
		if ( null != valueObject.getConsSessDefault() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getConsSessDefault().getID());
		}
		domainObject.setConsSessDefault(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getConsSessRequired() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getConsSessRequired().getID());
		}
		domainObject.setConsSessRequired(value9);
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
