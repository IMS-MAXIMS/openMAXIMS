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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class PatientProblemVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PatientProblemVo copy(ims.core.vo.PatientProblemVo valueObjectDest, ims.core.vo.PatientProblemVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientProblem(valueObjectSrc.getID_PatientProblem());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Problem
		valueObjectDest.setProblem(valueObjectSrc.getProblem());
		// isPresentingProblem
		valueObjectDest.setIsPresentingProblem(valueObjectSrc.getIsPresentingProblem());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// ProblemContext
		valueObjectDest.setProblemContext(valueObjectSrc.getProblemContext());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// isResolved
		valueObjectDest.setIsResolved(valueObjectSrc.getIsResolved());
		// DateResolved
		valueObjectDest.setDateResolved(valueObjectSrc.getDateResolved());
		// Onset
		valueObjectDest.setOnset(valueObjectSrc.getOnset());
		// Source
		valueObjectDest.setSource(valueObjectSrc.getSource());
		// ResolvedHCP
		valueObjectDest.setResolvedHCP(valueObjectSrc.getResolvedHCP());
		// ProblemNote
		valueObjectDest.setProblemNote(valueObjectSrc.getProblemNote());
		// Specialty
		valueObjectDest.setSpecialty(valueObjectSrc.getSpecialty());
		// PatientProblem
		valueObjectDest.setPatientProblem(valueObjectSrc.getPatientProblem());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// PrimaryForCareSpells
		valueObjectDest.setPrimaryForCareSpells(valueObjectSrc.getPrimaryForCareSpells());
		// SysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientProblemVoCollectionFromPatientProblem(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientProblem objects.
	 */
	public static ims.core.vo.PatientProblemVoCollection createPatientProblemVoCollectionFromPatientProblem(java.util.Set domainObjectSet)	
	{
		return createPatientProblemVoCollectionFromPatientProblem(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientProblem objects.
	 */
	public static ims.core.vo.PatientProblemVoCollection createPatientProblemVoCollectionFromPatientProblem(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatientProblemVoCollection voList = new ims.core.vo.PatientProblemVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.PatientProblem domainObject = (ims.core.clinical.domain.objects.PatientProblem) iterator.next();
			ims.core.vo.PatientProblemVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientProblem objects.
	 */
	public static ims.core.vo.PatientProblemVoCollection createPatientProblemVoCollectionFromPatientProblem(java.util.List domainObjectList) 
	{
		return createPatientProblemVoCollectionFromPatientProblem(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientProblem objects.
	 */
	public static ims.core.vo.PatientProblemVoCollection createPatientProblemVoCollectionFromPatientProblem(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatientProblemVoCollection voList = new ims.core.vo.PatientProblemVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.PatientProblem domainObject = (ims.core.clinical.domain.objects.PatientProblem) domainObjectList.get(i);
			ims.core.vo.PatientProblemVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.PatientProblem set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientProblemSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientProblemVoCollection voCollection) 
	 {
	 	return extractPatientProblemSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientProblemSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientProblemVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientProblemVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientProblem domainObject = PatientProblemVoAssembler.extractPatientProblem(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.PatientProblem list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientProblemList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientProblemVoCollection voCollection) 
	 {
	 	return extractPatientProblemList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientProblemList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientProblemVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientProblemVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientProblem domainObject = PatientProblemVoAssembler.extractPatientProblem(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.PatientProblem object.
	 * @param domainObject ims.core.clinical.domain.objects.PatientProblem
	 */
	 public static ims.core.vo.PatientProblemVo create(ims.core.clinical.domain.objects.PatientProblem domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.PatientProblem object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PatientProblemVo create(DomainObjectMap map, ims.core.clinical.domain.objects.PatientProblem domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PatientProblemVo valueObject = (ims.core.vo.PatientProblemVo) map.getValueObject(domainObject, ims.core.vo.PatientProblemVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PatientProblemVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.PatientProblem
	 */
	 public static ims.core.vo.PatientProblemVo insert(ims.core.vo.PatientProblemVo valueObject, ims.core.clinical.domain.objects.PatientProblem domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.PatientProblem
	 */
	 public static ims.core.vo.PatientProblemVo insert(DomainObjectMap map, ims.core.vo.PatientProblemVo valueObject, ims.core.clinical.domain.objects.PatientProblem domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientProblem(domainObject.getId());
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
			
		// Problem
		valueObject.setProblem(ims.clinical.vo.domain.ClinicalProblemShortVoAssembler.create(map, domainObject.getProblem()) );
		// isPresentingProblem
		valueObject.setIsPresentingProblem( domainObject.isIsPresentingProblem() );
		// ClinicalContact
		if (domainObject.getClinicalContact() != null)
		{
			if(domainObject.getClinicalContact() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getClinicalContact();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(id, -1));				
			}
			else
			{
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(domainObject.getClinicalContact().getId(), domainObject.getClinicalContact().getVersion()));
			}
		}
		// CareContext
		valueObject.setCareContext(ims.core.vo.domain.CareContextLiteVoAssembler.create(map, domainObject.getCareContext()) );
		// ProblemContext
		valueObject.setProblemContext(domainObject.getProblemContext());
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// isResolved
		valueObject.setIsResolved( domainObject.isIsResolved() );
		// DateResolved
		java.util.Date DateResolved = domainObject.getDateResolved();
		if ( null != DateResolved ) 
		{
			valueObject.setDateResolved(new ims.framework.utils.Date(DateResolved) );
		}
		// Onset
		Integer Onset = domainObject.getOnset();
		if ( null != Onset ) 
		{
			valueObject.setOnset(new ims.framework.utils.PartialDate(Onset) );
		}
		// Source
		ims.domain.lookups.LookupInstance instance10 = domainObject.getSource();
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

			ims.core.vo.lookups.SourceofInformation voLookup10 = new ims.core.vo.lookups.SourceofInformation(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.SourceofInformation parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.core.vo.lookups.SourceofInformation(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setSource(voLookup10);
		}
				// ResolvedHCP
		valueObject.setResolvedHCP(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getResolvedHCP()) );
		// ProblemNote
		valueObject.setProblemNote(domainObject.getProblemNote());
		// Specialty
		ims.domain.lookups.LookupInstance instance13 = domainObject.getSpecialty();
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

			ims.core.vo.lookups.Specialty voLookup13 = new ims.core.vo.lookups.Specialty(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup13 = voLookup13;
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
								parentVoLookup13.setParent(new ims.core.vo.lookups.Specialty(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setSpecialty(voLookup13);
		}
				// PatientProblem
		valueObject.setPatientProblem(domainObject.getPatientProblem());
		// Status
		ims.domain.lookups.LookupInstance instance15 = domainObject.getStatus();
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

			ims.core.vo.lookups.PatientProblemStatus voLookup15 = new ims.core.vo.lookups.PatientProblemStatus(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.core.vo.lookups.PatientProblemStatus parentVoLookup15 = voLookup15;
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
								parentVoLookup15.setParent(new ims.core.vo.lookups.PatientProblemStatus(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setStatus(voLookup15);
		}
				// PrimaryForCareSpells
		valueObject.setPrimaryForCareSpells(ims.core.vo.domain.CSPrimaryProblemVoAssembler.createCSPrimaryProblemVoCollectionFromCsPrimaryProblem(map, domainObject.getPrimaryForCareSpells()) );
		// SysInfo
		// set system information
		valueObject.setSysInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.PatientProblem extractPatientProblem(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientProblemVo valueObject) 
	{
		return 	extractPatientProblem(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.PatientProblem extractPatientProblem(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientProblemVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientProblem();
		ims.core.clinical.domain.objects.PatientProblem domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.PatientProblem)domMap.get(valueObject);
			}
			// ims.core.vo.PatientProblemVo ID_PatientProblem field is unknown
			domainObject = new ims.core.clinical.domain.objects.PatientProblem();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientProblem());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.PatientProblem)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.PatientProblem) domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientProblem.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientProblem());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.clinical.configuration.domain.objects.ClinicalProblem value1 = null;
		if ( null != valueObject.getProblem() ) 
		{
			if (valueObject.getProblem().getBoId() == null)
			{
				if (domMap.get(valueObject.getProblem()) != null)
				{
					value1 = (ims.clinical.configuration.domain.objects.ClinicalProblem)domMap.get(valueObject.getProblem());
				}
			}
			else
			{
				value1 = (ims.clinical.configuration.domain.objects.ClinicalProblem)domainFactory.getDomainObject(ims.clinical.configuration.domain.objects.ClinicalProblem.class, valueObject.getProblem().getBoId());
			}
		}
		domainObject.setProblem(value1);
		domainObject.setIsPresentingProblem(valueObject.getIsPresentingProblem());
		ims.core.admin.domain.objects.ClinicalContact value3 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value3 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getClinicalContact();	
			}
			else
			{
				value3 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value3);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.CareContext value4 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value4 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else
			{
				value4 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value4);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getProblemContext() != null && valueObject.getProblemContext().equals(""))
		{
			valueObject.setProblemContext(null);
		}
		domainObject.setProblemContext(valueObject.getProblemContext());
		domainObject.setIsActive(valueObject.getIsActive());
		domainObject.setIsResolved(valueObject.getIsResolved());
		java.util.Date value8 = null;
		ims.framework.utils.Date date8 = valueObject.getDateResolved();		
		if ( date8 != null ) 
		{
			value8 = date8.getDate();
		}
		domainObject.setDateResolved(value8);
		ims.framework.utils.PartialDate Onset = valueObject.getOnset();
		Integer value9 = null;
		if ( null != Onset ) 
		{
			value9 = Onset.toInteger();
		}
		domainObject.setOnset(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getSource() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getSource().getID());
		}
		domainObject.setSource(value10);
		domainObject.setResolvedHCP(ims.core.vo.domain.HcpAssembler.extractHcp(domainFactory, valueObject.getResolvedHCP(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getProblemNote() != null && valueObject.getProblemNote().equals(""))
		{
			valueObject.setProblemNote(null);
		}
		domainObject.setProblemNote(valueObject.getProblemNote());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value13);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPatientProblem() != null && valueObject.getPatientProblem().equals(""))
		{
			valueObject.setPatientProblem(null);
		}
		domainObject.setPatientProblem(valueObject.getPatientProblem());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value15);
		domainObject.setPrimaryForCareSpells(ims.core.vo.domain.CSPrimaryProblemVoAssembler.extractCsPrimaryProblemSet(domainFactory, valueObject.getPrimaryForCareSpells(), domainObject.getPrimaryForCareSpells(), domMap));		
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));

		return domainObject;
	}

}
