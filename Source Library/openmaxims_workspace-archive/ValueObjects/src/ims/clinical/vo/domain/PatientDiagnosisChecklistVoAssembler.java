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
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Peter Martin
 */
public class PatientDiagnosisChecklistVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.PatientDiagnosisChecklistVo copy(ims.clinical.vo.PatientDiagnosisChecklistVo valueObjectDest, ims.clinical.vo.PatientDiagnosisChecklistVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientDiagnosisChecklist(valueObjectSrc.getID_PatientDiagnosisChecklist());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// PresentDiagnoses
		valueObjectDest.setPresentDiagnoses(valueObjectSrc.getPresentDiagnoses());
		// OtherDiagnoses
		valueObjectDest.setOtherDiagnoses(valueObjectSrc.getOtherDiagnoses());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientDiagnosisChecklistVoCollectionFromPatientDiagnosisChecklist(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.PatientDiagnosisChecklist objects.
	 */
	public static ims.clinical.vo.PatientDiagnosisChecklistVoCollection createPatientDiagnosisChecklistVoCollectionFromPatientDiagnosisChecklist(java.util.Set domainObjectSet)	
	{
		return createPatientDiagnosisChecklistVoCollectionFromPatientDiagnosisChecklist(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.PatientDiagnosisChecklist objects.
	 */
	public static ims.clinical.vo.PatientDiagnosisChecklistVoCollection createPatientDiagnosisChecklistVoCollectionFromPatientDiagnosisChecklist(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.PatientDiagnosisChecklistVoCollection voList = new ims.clinical.vo.PatientDiagnosisChecklistVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.PatientDiagnosisChecklist domainObject = (ims.clinical.domain.objects.PatientDiagnosisChecklist) iterator.next();
			ims.clinical.vo.PatientDiagnosisChecklistVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.PatientDiagnosisChecklist objects.
	 */
	public static ims.clinical.vo.PatientDiagnosisChecklistVoCollection createPatientDiagnosisChecklistVoCollectionFromPatientDiagnosisChecklist(java.util.List domainObjectList) 
	{
		return createPatientDiagnosisChecklistVoCollectionFromPatientDiagnosisChecklist(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.PatientDiagnosisChecklist objects.
	 */
	public static ims.clinical.vo.PatientDiagnosisChecklistVoCollection createPatientDiagnosisChecklistVoCollectionFromPatientDiagnosisChecklist(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.PatientDiagnosisChecklistVoCollection voList = new ims.clinical.vo.PatientDiagnosisChecklistVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.PatientDiagnosisChecklist domainObject = (ims.clinical.domain.objects.PatientDiagnosisChecklist) domainObjectList.get(i);
			ims.clinical.vo.PatientDiagnosisChecklistVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.PatientDiagnosisChecklist set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientDiagnosisChecklistSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientDiagnosisChecklistVoCollection voCollection) 
	 {
	 	return extractPatientDiagnosisChecklistSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientDiagnosisChecklistSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientDiagnosisChecklistVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.PatientDiagnosisChecklistVo vo = voCollection.get(i);
			ims.clinical.domain.objects.PatientDiagnosisChecklist domainObject = PatientDiagnosisChecklistVoAssembler.extractPatientDiagnosisChecklist(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.PatientDiagnosisChecklist list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientDiagnosisChecklistList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientDiagnosisChecklistVoCollection voCollection) 
	 {
	 	return extractPatientDiagnosisChecklistList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientDiagnosisChecklistList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientDiagnosisChecklistVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.PatientDiagnosisChecklistVo vo = voCollection.get(i);
			ims.clinical.domain.objects.PatientDiagnosisChecklist domainObject = PatientDiagnosisChecklistVoAssembler.extractPatientDiagnosisChecklist(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.PatientDiagnosisChecklist object.
	 * @param domainObject ims.clinical.domain.objects.PatientDiagnosisChecklist
	 */
	 public static ims.clinical.vo.PatientDiagnosisChecklistVo create(ims.clinical.domain.objects.PatientDiagnosisChecklist domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.PatientDiagnosisChecklist object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.PatientDiagnosisChecklistVo create(DomainObjectMap map, ims.clinical.domain.objects.PatientDiagnosisChecklist domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.PatientDiagnosisChecklistVo valueObject = (ims.clinical.vo.PatientDiagnosisChecklistVo) map.getValueObject(domainObject, ims.clinical.vo.PatientDiagnosisChecklistVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.PatientDiagnosisChecklistVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.PatientDiagnosisChecklist
	 */
	 public static ims.clinical.vo.PatientDiagnosisChecklistVo insert(ims.clinical.vo.PatientDiagnosisChecklistVo valueObject, ims.clinical.domain.objects.PatientDiagnosisChecklist domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.PatientDiagnosisChecklist
	 */
	 public static ims.clinical.vo.PatientDiagnosisChecklistVo insert(DomainObjectMap map, ims.clinical.vo.PatientDiagnosisChecklistVo valueObject, ims.clinical.domain.objects.PatientDiagnosisChecklist domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientDiagnosisChecklist(domainObject.getId());
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
		// PresentDiagnoses
		valueObject.setPresentDiagnoses(ims.core.vo.domain.PatientDiagnosisVoAssembler.createPatientDiagnosisVoCollectionFromPatientDiagnosis(map, domainObject.getPresentDiagnoses()) );
		// OtherDiagnoses
		valueObject.setOtherDiagnoses(ims.clinical.vo.domain.PatientAbsentDiagnosisVoAssembler.createPatientAbsentDiagnosisVoCollectionFromPatientAbsentDiagnosis(map, domainObject.getOtherDiagnoses()) );
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.PatientDiagnosisChecklist extractPatientDiagnosisChecklist(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientDiagnosisChecklistVo valueObject) 
	{
		return 	extractPatientDiagnosisChecklist(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.PatientDiagnosisChecklist extractPatientDiagnosisChecklist(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientDiagnosisChecklistVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientDiagnosisChecklist();
		ims.clinical.domain.objects.PatientDiagnosisChecklist domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.PatientDiagnosisChecklist)domMap.get(valueObject);
			}
			// ims.clinical.vo.PatientDiagnosisChecklistVo ID_PatientDiagnosisChecklist field is unknown
			domainObject = new ims.clinical.domain.objects.PatientDiagnosisChecklist();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientDiagnosisChecklist());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.PatientDiagnosisChecklist)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.PatientDiagnosisChecklist) domainFactory.getDomainObject(ims.clinical.domain.objects.PatientDiagnosisChecklist.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientDiagnosisChecklist());

		ims.core.admin.domain.objects.ClinicalContact value1 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value1 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getClinicalContact();	
			}
			else
			{
				value1 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value1);
		domainObject.setPresentDiagnoses(ims.core.vo.domain.PatientDiagnosisVoAssembler.extractPatientDiagnosisSet(domainFactory, valueObject.getPresentDiagnoses(), domainObject.getPresentDiagnoses(), domMap));		
		domainObject.setOtherDiagnoses(ims.clinical.vo.domain.PatientAbsentDiagnosisVoAssembler.extractPatientAbsentDiagnosisSet(domainFactory, valueObject.getOtherDiagnoses(), domainObject.getOtherDiagnoses(), domMap));		
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));

		return domainObject;
	}

}
