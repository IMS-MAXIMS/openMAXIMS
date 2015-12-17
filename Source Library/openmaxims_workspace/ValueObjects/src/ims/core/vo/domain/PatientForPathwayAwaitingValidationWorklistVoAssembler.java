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
 * @author Mara Iroaie
 */
public class PatientForPathwayAwaitingValidationWorklistVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PatientForPathwayAwaitingValidationWorklistVo copy(ims.core.vo.PatientForPathwayAwaitingValidationWorklistVo valueObjectDest, ims.core.vo.PatientForPathwayAwaitingValidationWorklistVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Patient(valueObjectSrc.getID_Patient());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// name
		valueObjectDest.setName(valueObjectSrc.getName());
		// identifiers
		valueObjectDest.setIdentifiers(valueObjectSrc.getIdentifiers());
		// sex
		valueObjectDest.setSex(valueObjectSrc.getSex());
		// address
		valueObjectDest.setAddress(valueObjectSrc.getAddress());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientForPathwayAwaitingValidationWorklistVoCollectionFromPatient(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.Patient objects.
	 */
	public static ims.core.vo.PatientForPathwayAwaitingValidationWorklistVoCollection createPatientForPathwayAwaitingValidationWorklistVoCollectionFromPatient(java.util.Set domainObjectSet)	
	{
		return createPatientForPathwayAwaitingValidationWorklistVoCollectionFromPatient(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.Patient objects.
	 */
	public static ims.core.vo.PatientForPathwayAwaitingValidationWorklistVoCollection createPatientForPathwayAwaitingValidationWorklistVoCollectionFromPatient(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatientForPathwayAwaitingValidationWorklistVoCollection voList = new ims.core.vo.PatientForPathwayAwaitingValidationWorklistVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.patient.domain.objects.Patient domainObject = (ims.core.patient.domain.objects.Patient) iterator.next();
			ims.core.vo.PatientForPathwayAwaitingValidationWorklistVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.patient.domain.objects.Patient objects.
	 */
	public static ims.core.vo.PatientForPathwayAwaitingValidationWorklistVoCollection createPatientForPathwayAwaitingValidationWorklistVoCollectionFromPatient(java.util.List domainObjectList) 
	{
		return createPatientForPathwayAwaitingValidationWorklistVoCollectionFromPatient(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.patient.domain.objects.Patient objects.
	 */
	public static ims.core.vo.PatientForPathwayAwaitingValidationWorklistVoCollection createPatientForPathwayAwaitingValidationWorklistVoCollectionFromPatient(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatientForPathwayAwaitingValidationWorklistVoCollection voList = new ims.core.vo.PatientForPathwayAwaitingValidationWorklistVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.patient.domain.objects.Patient domainObject = (ims.core.patient.domain.objects.Patient) domainObjectList.get(i);
			ims.core.vo.PatientForPathwayAwaitingValidationWorklistVo vo = create(map, domainObject);

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
	 * Create the ims.core.patient.domain.objects.Patient set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientForPathwayAwaitingValidationWorklistVoCollection voCollection) 
	 {
	 	return extractPatientSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientForPathwayAwaitingValidationWorklistVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientForPathwayAwaitingValidationWorklistVo vo = voCollection.get(i);
			ims.core.patient.domain.objects.Patient domainObject = PatientForPathwayAwaitingValidationWorklistVoAssembler.extractPatient(domainFactory, vo, domMap);

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
	 * Create the ims.core.patient.domain.objects.Patient list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientForPathwayAwaitingValidationWorklistVoCollection voCollection) 
	 {
	 	return extractPatientList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientForPathwayAwaitingValidationWorklistVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientForPathwayAwaitingValidationWorklistVo vo = voCollection.get(i);
			ims.core.patient.domain.objects.Patient domainObject = PatientForPathwayAwaitingValidationWorklistVoAssembler.extractPatient(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.patient.domain.objects.Patient object.
	 * @param domainObject ims.core.patient.domain.objects.Patient
	 */
	 public static ims.core.vo.PatientForPathwayAwaitingValidationWorklistVo create(ims.core.patient.domain.objects.Patient domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.patient.domain.objects.Patient object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PatientForPathwayAwaitingValidationWorklistVo create(DomainObjectMap map, ims.core.patient.domain.objects.Patient domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PatientForPathwayAwaitingValidationWorklistVo valueObject = (ims.core.vo.PatientForPathwayAwaitingValidationWorklistVo) map.getValueObject(domainObject, ims.core.vo.PatientForPathwayAwaitingValidationWorklistVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PatientForPathwayAwaitingValidationWorklistVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.patient.domain.objects.Patient
	 */
	 public static ims.core.vo.PatientForPathwayAwaitingValidationWorklistVo insert(ims.core.vo.PatientForPathwayAwaitingValidationWorklistVo valueObject, ims.core.patient.domain.objects.Patient domainObject) 
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
	 * @param domainObject ims.core.patient.domain.objects.Patient
	 */
	 public static ims.core.vo.PatientForPathwayAwaitingValidationWorklistVo insert(DomainObjectMap map, ims.core.vo.PatientForPathwayAwaitingValidationWorklistVo valueObject, ims.core.patient.domain.objects.Patient domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Patient(domainObject.getId());
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
		// identifiers
		valueObject.setIdentifiers(ims.core.vo.domain.PatientIdAssembler.createPatientIdCollectionFromPatientId(map, domainObject.getIdentifiers()) );
		// sex
		ims.domain.lookups.LookupInstance instance3 = domainObject.getSex();
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

			ims.core.vo.lookups.Sex voLookup3 = new ims.core.vo.lookups.Sex(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.Sex parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.Sex(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setSex(voLookup3);
		}
				// address
		valueObject.setAddress(ims.core.vo.domain.PersonAddressAssembler.create(map, domainObject.getAddress()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.patient.domain.objects.Patient extractPatient(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientForPathwayAwaitingValidationWorklistVo valueObject) 
	{
		return 	extractPatient(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.patient.domain.objects.Patient extractPatient(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientForPathwayAwaitingValidationWorklistVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Patient();
		ims.core.patient.domain.objects.Patient domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.patient.domain.objects.Patient)domMap.get(valueObject);
			}
			// ims.core.vo.PatientForPathwayAwaitingValidationWorklistVo ID_Patient field is unknown
			domainObject = new ims.core.patient.domain.objects.Patient();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Patient());
			if (domMap.get(key) != null)
			{
				return (ims.core.patient.domain.objects.Patient)domMap.get(key);
			}
			domainObject = (ims.core.patient.domain.objects.Patient) domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Patient());

		domainObject.setName(ims.core.vo.domain.PersonNameAssembler.extractPersonName(domainFactory, valueObject.getName(), domMap));
		domainObject.setIdentifiers(ims.core.vo.domain.PatientIdAssembler.extractPatientIdList(domainFactory, valueObject.getIdentifiers(), domainObject.getIdentifiers(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getSex() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getSex().getID());
		}
		domainObject.setSex(value3);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.generic.domain.objects.Address value4 = null;
		if ( null != valueObject.getAddress() ) 
		{
			if (valueObject.getAddress().getBoId() == null)
			{
				if (domMap.get(valueObject.getAddress()) != null)
				{
					value4 = (ims.core.generic.domain.objects.Address)domMap.get(valueObject.getAddress());
				}
			}
			else
			{
				value4 = (ims.core.generic.domain.objects.Address)domainFactory.getDomainObject(ims.core.generic.domain.objects.Address.class, valueObject.getAddress().getBoId());
			}
		}
		domainObject.setAddress(value4);

		return domainObject;
	}

}
