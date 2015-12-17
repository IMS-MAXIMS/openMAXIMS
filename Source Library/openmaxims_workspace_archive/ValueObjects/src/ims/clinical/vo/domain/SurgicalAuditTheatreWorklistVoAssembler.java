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
 * @author Florin Blindu
 */
public class SurgicalAuditTheatreWorklistVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.SurgicalAuditTheatreWorklistVo copy(ims.clinical.vo.SurgicalAuditTheatreWorklistVo valueObjectDest, ims.clinical.vo.SurgicalAuditTheatreWorklistVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_SurgicalAuditOperationDetail(valueObjectSrc.getID_SurgicalAuditOperationDetail());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// PreOpChecks
		valueObjectDest.setPreOpChecks(valueObjectSrc.getPreOpChecks());
		// ActualProcedure
		valueObjectDest.setActualProcedure(valueObjectSrc.getActualProcedure());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSurgicalAuditTheatreWorklistVoCollectionFromSurgicalAuditOperationDetail(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.SurgicalAuditOperationDetail objects.
	 */
	public static ims.clinical.vo.SurgicalAuditTheatreWorklistVoCollection createSurgicalAuditTheatreWorklistVoCollectionFromSurgicalAuditOperationDetail(java.util.Set domainObjectSet)	
	{
		return createSurgicalAuditTheatreWorklistVoCollectionFromSurgicalAuditOperationDetail(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.SurgicalAuditOperationDetail objects.
	 */
	public static ims.clinical.vo.SurgicalAuditTheatreWorklistVoCollection createSurgicalAuditTheatreWorklistVoCollectionFromSurgicalAuditOperationDetail(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.SurgicalAuditTheatreWorklistVoCollection voList = new ims.clinical.vo.SurgicalAuditTheatreWorklistVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.SurgicalAuditOperationDetail domainObject = (ims.clinical.domain.objects.SurgicalAuditOperationDetail) iterator.next();
			ims.clinical.vo.SurgicalAuditTheatreWorklistVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.SurgicalAuditOperationDetail objects.
	 */
	public static ims.clinical.vo.SurgicalAuditTheatreWorklistVoCollection createSurgicalAuditTheatreWorklistVoCollectionFromSurgicalAuditOperationDetail(java.util.List domainObjectList) 
	{
		return createSurgicalAuditTheatreWorklistVoCollectionFromSurgicalAuditOperationDetail(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.SurgicalAuditOperationDetail objects.
	 */
	public static ims.clinical.vo.SurgicalAuditTheatreWorklistVoCollection createSurgicalAuditTheatreWorklistVoCollectionFromSurgicalAuditOperationDetail(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.SurgicalAuditTheatreWorklistVoCollection voList = new ims.clinical.vo.SurgicalAuditTheatreWorklistVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.SurgicalAuditOperationDetail domainObject = (ims.clinical.domain.objects.SurgicalAuditOperationDetail) domainObjectList.get(i);
			ims.clinical.vo.SurgicalAuditTheatreWorklistVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.SurgicalAuditOperationDetail set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractSurgicalAuditOperationDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalAuditTheatreWorklistVoCollection voCollection) 
	 {
	 	return extractSurgicalAuditOperationDetailSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSurgicalAuditOperationDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalAuditTheatreWorklistVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.SurgicalAuditTheatreWorklistVo vo = voCollection.get(i);
			ims.clinical.domain.objects.SurgicalAuditOperationDetail domainObject = SurgicalAuditTheatreWorklistVoAssembler.extractSurgicalAuditOperationDetail(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.SurgicalAuditOperationDetail list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractSurgicalAuditOperationDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalAuditTheatreWorklistVoCollection voCollection) 
	 {
	 	return extractSurgicalAuditOperationDetailList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSurgicalAuditOperationDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalAuditTheatreWorklistVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.SurgicalAuditTheatreWorklistVo vo = voCollection.get(i);
			ims.clinical.domain.objects.SurgicalAuditOperationDetail domainObject = SurgicalAuditTheatreWorklistVoAssembler.extractSurgicalAuditOperationDetail(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.SurgicalAuditOperationDetail object.
	 * @param domainObject ims.clinical.domain.objects.SurgicalAuditOperationDetail
	 */
	 public static ims.clinical.vo.SurgicalAuditTheatreWorklistVo create(ims.clinical.domain.objects.SurgicalAuditOperationDetail domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.SurgicalAuditOperationDetail object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.SurgicalAuditTheatreWorklistVo create(DomainObjectMap map, ims.clinical.domain.objects.SurgicalAuditOperationDetail domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.SurgicalAuditTheatreWorklistVo valueObject = (ims.clinical.vo.SurgicalAuditTheatreWorklistVo) map.getValueObject(domainObject, ims.clinical.vo.SurgicalAuditTheatreWorklistVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.SurgicalAuditTheatreWorklistVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.SurgicalAuditOperationDetail
	 */
	 public static ims.clinical.vo.SurgicalAuditTheatreWorklistVo insert(ims.clinical.vo.SurgicalAuditTheatreWorklistVo valueObject, ims.clinical.domain.objects.SurgicalAuditOperationDetail domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.SurgicalAuditOperationDetail
	 */
	 public static ims.clinical.vo.SurgicalAuditTheatreWorklistVo insert(DomainObjectMap map, ims.clinical.vo.SurgicalAuditTheatreWorklistVo valueObject, ims.clinical.domain.objects.SurgicalAuditOperationDetail domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_SurgicalAuditOperationDetail(domainObject.getId());
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
			
		// Patient
		valueObject.setPatient(ims.core.vo.domain.PatientListVoAssembler.create(map, domainObject.getPatient()) );
		// CurrentStatus
		valueObject.setCurrentStatus(ims.clinical.vo.domain.SurgicalAuditOperationDetailStatusVoAssembler.create(map, domainObject.getCurrentStatus()) );
		// PreOpChecks
		valueObject.setPreOpChecks(ims.clinical.vo.domain.SurgicalAuditPreOpChecksForTheatreWorklistVoAssembler.create(map, domainObject.getPreOpChecks()) );
		// ActualProcedure
		valueObject.setActualProcedure(ims.clinical.vo.domain.SurgicalAuditActualProcedureForTheatreWorklistVoAssembler.create(map, domainObject.getActualProcedure()) );
		// CareContext
		valueObject.setCareContext(ims.core.vo.domain.CareContextShortVoAssembler.create(map, domainObject.getCareContext()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.SurgicalAuditOperationDetail extractSurgicalAuditOperationDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalAuditTheatreWorklistVo valueObject) 
	{
		return 	extractSurgicalAuditOperationDetail(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.SurgicalAuditOperationDetail extractSurgicalAuditOperationDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalAuditTheatreWorklistVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_SurgicalAuditOperationDetail();
		ims.clinical.domain.objects.SurgicalAuditOperationDetail domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.SurgicalAuditOperationDetail)domMap.get(valueObject);
			}
			// ims.clinical.vo.SurgicalAuditTheatreWorklistVo ID_SurgicalAuditOperationDetail field is unknown
			domainObject = new ims.clinical.domain.objects.SurgicalAuditOperationDetail();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_SurgicalAuditOperationDetail());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.SurgicalAuditOperationDetail)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.SurgicalAuditOperationDetail) domainFactory.getDomainObject(ims.clinical.domain.objects.SurgicalAuditOperationDetail.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_SurgicalAuditOperationDetail());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.patient.domain.objects.Patient value1 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value1 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else
			{
				value1 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value1);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.clinical.domain.objects.SurgicalAuditOperationDetailStatus value2 = null;
		if ( null != valueObject.getCurrentStatus() ) 
		{
			if (valueObject.getCurrentStatus().getBoId() == null)
			{
				if (domMap.get(valueObject.getCurrentStatus()) != null)
				{
					value2 = (ims.clinical.domain.objects.SurgicalAuditOperationDetailStatus)domMap.get(valueObject.getCurrentStatus());
				}
			}
			else
			{
				value2 = (ims.clinical.domain.objects.SurgicalAuditOperationDetailStatus)domainFactory.getDomainObject(ims.clinical.domain.objects.SurgicalAuditOperationDetailStatus.class, valueObject.getCurrentStatus().getBoId());
			}
		}
		domainObject.setCurrentStatus(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.clinical.domain.objects.SurgicalAuditPreOpChecks value3 = null;
		if ( null != valueObject.getPreOpChecks() ) 
		{
			if (valueObject.getPreOpChecks().getBoId() == null)
			{
				if (domMap.get(valueObject.getPreOpChecks()) != null)
				{
					value3 = (ims.clinical.domain.objects.SurgicalAuditPreOpChecks)domMap.get(valueObject.getPreOpChecks());
				}
			}
			else
			{
				value3 = (ims.clinical.domain.objects.SurgicalAuditPreOpChecks)domainFactory.getDomainObject(ims.clinical.domain.objects.SurgicalAuditPreOpChecks.class, valueObject.getPreOpChecks().getBoId());
			}
		}
		domainObject.setPreOpChecks(value3);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.clinical.domain.objects.SurgicalAuditActualProcedure value4 = null;
		if ( null != valueObject.getActualProcedure() ) 
		{
			if (valueObject.getActualProcedure().getBoId() == null)
			{
				if (domMap.get(valueObject.getActualProcedure()) != null)
				{
					value4 = (ims.clinical.domain.objects.SurgicalAuditActualProcedure)domMap.get(valueObject.getActualProcedure());
				}
			}
			else
			{
				value4 = (ims.clinical.domain.objects.SurgicalAuditActualProcedure)domainFactory.getDomainObject(ims.clinical.domain.objects.SurgicalAuditActualProcedure.class, valueObject.getActualProcedure().getBoId());
			}
		}
		domainObject.setActualProcedure(value4);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.CareContext value5 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value5 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else
			{
				value5 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value5);

		return domainObject;
	}

}
