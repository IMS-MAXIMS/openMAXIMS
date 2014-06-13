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
public class PatientAllergyEDischargeVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PatientAllergyEDischargeVo copy(ims.core.vo.PatientAllergyEDischargeVo valueObjectDest, ims.core.vo.PatientAllergyEDischargeVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientAllergy(valueObjectSrc.getID_PatientAllergy());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Allergen
		valueObjectDest.setAllergen(valueObjectSrc.getAllergen());
		// AllergenDescription
		valueObjectDest.setAllergenDescription(valueObjectSrc.getAllergenDescription());
		// AllergenType
		valueObjectDest.setAllergenType(valueObjectSrc.getAllergenType());
		// AllergenReactions
		valueObjectDest.setAllergenReactions(valueObjectSrc.getAllergenReactions());
		// WhenIdentified
		valueObjectDest.setWhenIdentified(valueObjectSrc.getWhenIdentified());
		// SourceofInformation
		valueObjectDest.setSourceofInformation(valueObjectSrc.getSourceofInformation());
		// Comments
		valueObjectDest.setComments(valueObjectSrc.getComments());
		// IsCurrentlyActiveAllergy
		valueObjectDest.setIsCurrentlyActiveAllergy(valueObjectSrc.getIsCurrentlyActiveAllergy());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// IncludeAllergyInDischargeReports
		valueObjectDest.setIncludeAllergyInDischargeReports(valueObjectSrc.getIncludeAllergyInDischargeReports());
		// SysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
		// InactivationComments
		valueObjectDest.setInactivationComments(valueObjectSrc.getInactivationComments());
		// InactivationAuthoringInfo
		valueObjectDest.setInactivationAuthoringInfo(valueObjectSrc.getInactivationAuthoringInfo());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientAllergyEDischargeVoCollectionFromPatientAllergy(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientAllergy objects.
	 */
	public static ims.core.vo.PatientAllergyEDischargeVoCollection createPatientAllergyEDischargeVoCollectionFromPatientAllergy(java.util.Set domainObjectSet)	
	{
		return createPatientAllergyEDischargeVoCollectionFromPatientAllergy(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientAllergy objects.
	 */
	public static ims.core.vo.PatientAllergyEDischargeVoCollection createPatientAllergyEDischargeVoCollectionFromPatientAllergy(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatientAllergyEDischargeVoCollection voList = new ims.core.vo.PatientAllergyEDischargeVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.PatientAllergy domainObject = (ims.core.clinical.domain.objects.PatientAllergy) iterator.next();
			ims.core.vo.PatientAllergyEDischargeVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientAllergy objects.
	 */
	public static ims.core.vo.PatientAllergyEDischargeVoCollection createPatientAllergyEDischargeVoCollectionFromPatientAllergy(java.util.List domainObjectList) 
	{
		return createPatientAllergyEDischargeVoCollectionFromPatientAllergy(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientAllergy objects.
	 */
	public static ims.core.vo.PatientAllergyEDischargeVoCollection createPatientAllergyEDischargeVoCollectionFromPatientAllergy(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatientAllergyEDischargeVoCollection voList = new ims.core.vo.PatientAllergyEDischargeVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.PatientAllergy domainObject = (ims.core.clinical.domain.objects.PatientAllergy) domainObjectList.get(i);
			ims.core.vo.PatientAllergyEDischargeVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.PatientAllergy set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientAllergySet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientAllergyEDischargeVoCollection voCollection) 
	 {
	 	return extractPatientAllergySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientAllergySet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientAllergyEDischargeVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientAllergyEDischargeVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientAllergy domainObject = PatientAllergyEDischargeVoAssembler.extractPatientAllergy(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.PatientAllergy list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientAllergyList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientAllergyEDischargeVoCollection voCollection) 
	 {
	 	return extractPatientAllergyList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientAllergyList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientAllergyEDischargeVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientAllergyEDischargeVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientAllergy domainObject = PatientAllergyEDischargeVoAssembler.extractPatientAllergy(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.PatientAllergy object.
	 * @param domainObject ims.core.clinical.domain.objects.PatientAllergy
	 */
	 public static ims.core.vo.PatientAllergyEDischargeVo create(ims.core.clinical.domain.objects.PatientAllergy domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.PatientAllergy object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PatientAllergyEDischargeVo create(DomainObjectMap map, ims.core.clinical.domain.objects.PatientAllergy domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PatientAllergyEDischargeVo valueObject = (ims.core.vo.PatientAllergyEDischargeVo) map.getValueObject(domainObject, ims.core.vo.PatientAllergyEDischargeVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PatientAllergyEDischargeVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.PatientAllergy
	 */
	 public static ims.core.vo.PatientAllergyEDischargeVo insert(ims.core.vo.PatientAllergyEDischargeVo valueObject, ims.core.clinical.domain.objects.PatientAllergy domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.PatientAllergy
	 */
	 public static ims.core.vo.PatientAllergyEDischargeVo insert(DomainObjectMap map, ims.core.vo.PatientAllergyEDischargeVo valueObject, ims.core.clinical.domain.objects.PatientAllergy domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientAllergy(domainObject.getId());
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
			
		// Allergen
		valueObject.setAllergen(ims.core.vo.domain.AllergenVoAssembler.create(map, domainObject.getAllergen()) );
		// AllergenDescription
		valueObject.setAllergenDescription(domainObject.getAllergenDescription());
		// AllergenType
		ims.domain.lookups.LookupInstance instance3 = domainObject.getAllergenType();
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

			ims.core.vo.lookups.AllergenType voLookup3 = new ims.core.vo.lookups.AllergenType(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.AllergenType parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.AllergenType(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setAllergenType(voLookup3);
		}
				// AllergenReactions
		valueObject.setAllergenReactions(ims.core.vo.domain.PatientAllergyReactionVoAssembler.createPatientAllergyReactionVoCollectionFromPatientAllergyReaction(map, domainObject.getAllergenReactions()) );
		// WhenIdentified
		Integer WhenIdentified = domainObject.getWhenIdentified();
		if ( null != WhenIdentified ) 
		{
			valueObject.setWhenIdentified(new ims.framework.utils.PartialDate(WhenIdentified) );
		}
		// SourceofInformation
		ims.domain.lookups.LookupInstance instance6 = domainObject.getSourceofInformation();
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

			ims.core.vo.lookups.SourceofInformation voLookup6 = new ims.core.vo.lookups.SourceofInformation(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.SourceofInformation parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.SourceofInformation(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setSourceofInformation(voLookup6);
		}
				// Comments
		valueObject.setComments(domainObject.getComments());
		// IsCurrentlyActiveAllergy
		valueObject.setIsCurrentlyActiveAllergy( domainObject.isIsCurrentlyActiveAllergy() );
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// Patient
		if (domainObject.getPatient() != null)
		{
			if(domainObject.getPatient() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPatient();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPatient(new ims.core.patient.vo.PatientRefVo(id, -1));				
			}
			else
			{
				valueObject.setPatient(new ims.core.patient.vo.PatientRefVo(domainObject.getPatient().getId(), domainObject.getPatient().getVersion()));
			}
		}
		// IncludeAllergyInDischargeReports
		valueObject.setIncludeAllergyInDischargeReports(ims.core.vo.domain.IncludeAllergyInDischargeReportsVoAssembler.createIncludeAllergyInDischargeReportsVoCollectionFromIncludeAllergyInDischargeReport(map, domainObject.getIncludeAllergyInDischargeReports()) );
		// SysInfo
		// set system information
		valueObject.setSysInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// InactivationComments
		valueObject.setInactivationComments(domainObject.getInactivationComments());
		// InactivationAuthoringInfo
		valueObject.setInactivationAuthoringInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getInactivationAuthoringInfo()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.PatientAllergy extractPatientAllergy(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientAllergyEDischargeVo valueObject) 
	{
		return 	extractPatientAllergy(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.PatientAllergy extractPatientAllergy(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientAllergyEDischargeVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientAllergy();
		ims.core.clinical.domain.objects.PatientAllergy domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.PatientAllergy)domMap.get(valueObject);
			}
			// ims.core.vo.PatientAllergyEDischargeVo ID_PatientAllergy field is unknown
			domainObject = new ims.core.clinical.domain.objects.PatientAllergy();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientAllergy());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.PatientAllergy)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.PatientAllergy) domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientAllergy.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientAllergy());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Allergen value1 = null;
		if ( null != valueObject.getAllergen() ) 
		{
			if (valueObject.getAllergen().getBoId() == null)
			{
				if (domMap.get(valueObject.getAllergen()) != null)
				{
					value1 = (ims.core.clinical.domain.objects.Allergen)domMap.get(valueObject.getAllergen());
				}
			}
			else
			{
				value1 = (ims.core.clinical.domain.objects.Allergen)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Allergen.class, valueObject.getAllergen().getBoId());
			}
		}
		domainObject.setAllergen(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAllergenDescription() != null && valueObject.getAllergenDescription().equals(""))
		{
			valueObject.setAllergenDescription(null);
		}
		domainObject.setAllergenDescription(valueObject.getAllergenDescription());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getAllergenType() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getAllergenType().getID());
		}
		domainObject.setAllergenType(value3);
		domainObject.setAllergenReactions(ims.core.vo.domain.PatientAllergyReactionVoAssembler.extractPatientAllergyReactionSet(domainFactory, valueObject.getAllergenReactions(), domainObject.getAllergenReactions(), domMap));		
		ims.framework.utils.PartialDate WhenIdentified = valueObject.getWhenIdentified();
		Integer value5 = null;
		if ( null != WhenIdentified ) 
		{
			value5 = WhenIdentified.toInteger();
		}
		domainObject.setWhenIdentified(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getSourceofInformation() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getSourceofInformation().getID());
		}
		domainObject.setSourceofInformation(value6);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComments() != null && valueObject.getComments().equals(""))
		{
			valueObject.setComments(null);
		}
		domainObject.setComments(valueObject.getComments());
		domainObject.setIsCurrentlyActiveAllergy(valueObject.getIsCurrentlyActiveAllergy());
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		ims.core.patient.domain.objects.Patient value10 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value10 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value10 = domainObject.getPatient();	
			}
			else
			{
				value10 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value10);
		domainObject.setIncludeAllergyInDischargeReports(ims.core.vo.domain.IncludeAllergyInDischargeReportsVoAssembler.extractIncludeAllergyInDischargeReportSet(domainFactory, valueObject.getIncludeAllergyInDischargeReports(), domainObject.getIncludeAllergyInDischargeReports(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getInactivationComments() != null && valueObject.getInactivationComments().equals(""))
		{
			valueObject.setInactivationComments(null);
		}
		domainObject.setInactivationComments(valueObject.getInactivationComments());
		domainObject.setInactivationAuthoringInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getInactivationAuthoringInfo(), domMap));

		return domainObject;
	}

}
