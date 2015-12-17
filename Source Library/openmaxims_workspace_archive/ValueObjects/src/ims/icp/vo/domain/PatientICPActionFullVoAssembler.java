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
package ims.icp.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Neil McAnaspie
 */
public class PatientICPActionFullVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.icp.vo.PatientICPActionFullVo copy(ims.icp.vo.PatientICPActionFullVo valueObjectDest, ims.icp.vo.PatientICPActionFullVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientICPAction(valueObjectSrc.getID_PatientICPAction());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// ICP
		valueObjectDest.setICP(valueObjectSrc.getICP());
		// Action
		valueObjectDest.setAction(valueObjectSrc.getAction());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// StatusHistory
		valueObjectDest.setStatusHistory(valueObjectSrc.getStatusHistory());
		// CompletedOnDate
		valueObjectDest.setCompletedOnDate(valueObjectSrc.getCompletedOnDate());
		// ParentPhase
		valueObjectDest.setParentPhase(valueObjectSrc.getParentPhase());
		// RequiresCounterSigning
		valueObjectDest.setRequiresCounterSigning(valueObjectSrc.getRequiresCounterSigning());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientICPActionFullVoCollectionFromPatientICPAction(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.icps.instantiation.domain.objects.PatientICPAction objects.
	 */
	public static ims.icp.vo.PatientICPActionFullVoCollection createPatientICPActionFullVoCollectionFromPatientICPAction(java.util.Set domainObjectSet)	
	{
		return createPatientICPActionFullVoCollectionFromPatientICPAction(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.icps.instantiation.domain.objects.PatientICPAction objects.
	 */
	public static ims.icp.vo.PatientICPActionFullVoCollection createPatientICPActionFullVoCollectionFromPatientICPAction(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.icp.vo.PatientICPActionFullVoCollection voList = new ims.icp.vo.PatientICPActionFullVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.icps.instantiation.domain.objects.PatientICPAction domainObject = (ims.icps.instantiation.domain.objects.PatientICPAction) iterator.next();
			ims.icp.vo.PatientICPActionFullVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.icps.instantiation.domain.objects.PatientICPAction objects.
	 */
	public static ims.icp.vo.PatientICPActionFullVoCollection createPatientICPActionFullVoCollectionFromPatientICPAction(java.util.List domainObjectList) 
	{
		return createPatientICPActionFullVoCollectionFromPatientICPAction(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.icps.instantiation.domain.objects.PatientICPAction objects.
	 */
	public static ims.icp.vo.PatientICPActionFullVoCollection createPatientICPActionFullVoCollectionFromPatientICPAction(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.icp.vo.PatientICPActionFullVoCollection voList = new ims.icp.vo.PatientICPActionFullVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.icps.instantiation.domain.objects.PatientICPAction domainObject = (ims.icps.instantiation.domain.objects.PatientICPAction) domainObjectList.get(i);
			ims.icp.vo.PatientICPActionFullVo vo = create(map, domainObject);

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
	 * Create the ims.icps.instantiation.domain.objects.PatientICPAction set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientICPActionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPActionFullVoCollection voCollection) 
	 {
	 	return extractPatientICPActionSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientICPActionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPActionFullVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.icp.vo.PatientICPActionFullVo vo = voCollection.get(i);
			ims.icps.instantiation.domain.objects.PatientICPAction domainObject = PatientICPActionFullVoAssembler.extractPatientICPAction(domainFactory, vo, domMap);

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
	 * Create the ims.icps.instantiation.domain.objects.PatientICPAction list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientICPActionList(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPActionFullVoCollection voCollection) 
	 {
	 	return extractPatientICPActionList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientICPActionList(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPActionFullVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.icp.vo.PatientICPActionFullVo vo = voCollection.get(i);
			ims.icps.instantiation.domain.objects.PatientICPAction domainObject = PatientICPActionFullVoAssembler.extractPatientICPAction(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.icps.instantiation.domain.objects.PatientICPAction object.
	 * @param domainObject ims.icps.instantiation.domain.objects.PatientICPAction
	 */
	 public static ims.icp.vo.PatientICPActionFullVo create(ims.icps.instantiation.domain.objects.PatientICPAction domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.icps.instantiation.domain.objects.PatientICPAction object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.icp.vo.PatientICPActionFullVo create(DomainObjectMap map, ims.icps.instantiation.domain.objects.PatientICPAction domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.icp.vo.PatientICPActionFullVo valueObject = (ims.icp.vo.PatientICPActionFullVo) map.getValueObject(domainObject, ims.icp.vo.PatientICPActionFullVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.icp.vo.PatientICPActionFullVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.icps.instantiation.domain.objects.PatientICPAction
	 */
	 public static ims.icp.vo.PatientICPActionFullVo insert(ims.icp.vo.PatientICPActionFullVo valueObject, ims.icps.instantiation.domain.objects.PatientICPAction domainObject) 
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
	 * @param domainObject ims.icps.instantiation.domain.objects.PatientICPAction
	 */
	 public static ims.icp.vo.PatientICPActionFullVo insert(DomainObjectMap map, ims.icp.vo.PatientICPActionFullVo valueObject, ims.icps.instantiation.domain.objects.PatientICPAction domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientICPAction(domainObject.getId());
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
		// CareContext
		if (domainObject.getCareContext() != null)
		{
			if(domainObject.getCareContext() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCareContext();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(id, -1));				
			}
			else
			{
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(domainObject.getCareContext().getId(), domainObject.getCareContext().getVersion()));
			}
		}
		// ICP
		if (domainObject.getICP() != null)
		{
			if(domainObject.getICP() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getICP();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setICP(new ims.icps.instantiation.vo.PatientICPRefVo(id, -1));				
			}
			else
			{
				valueObject.setICP(new ims.icps.instantiation.vo.PatientICPRefVo(domainObject.getICP().getId(), domainObject.getICP().getVersion()));
			}
		}
		// Action
		valueObject.setAction(ims.icp.vo.domain.ICPActionShortVoAssembler.create(map, domainObject.getAction()) );
		// CurrentStatus
		valueObject.setCurrentStatus(ims.icp.vo.domain.PatientICPActionStatusVoAssembler.create(map, domainObject.getCurrentStatus()) );
		// StatusHistory
		valueObject.setStatusHistory(ims.icp.vo.domain.PatientICPActionStatusVoAssembler.createPatientICPActionStatusVoCollectionFromPatientICPActionStatus(map, domainObject.getStatusHistory()) );
		// CompletedOnDate
		java.util.Date CompletedOnDate = domainObject.getCompletedOnDate();
		if ( null != CompletedOnDate ) 
		{
			valueObject.setCompletedOnDate(new ims.framework.utils.DateTime(CompletedOnDate) );
		}
		// ParentPhase
		if (domainObject.getParentPhase() != null)
		{
			if(domainObject.getParentPhase() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getParentPhase();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setParentPhase(new ims.icps.instantiation.vo.PatientICPPhaseRefVo(id, -1));				
			}
			else
			{
				valueObject.setParentPhase(new ims.icps.instantiation.vo.PatientICPPhaseRefVo(domainObject.getParentPhase().getId(), domainObject.getParentPhase().getVersion()));
			}
		}
		// RequiresCounterSigning
		valueObject.setRequiresCounterSigning( domainObject.isRequiresCounterSigning() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.icps.instantiation.domain.objects.PatientICPAction extractPatientICPAction(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPActionFullVo valueObject) 
	{
		return 	extractPatientICPAction(domainFactory, valueObject, new HashMap());
	}

	public static ims.icps.instantiation.domain.objects.PatientICPAction extractPatientICPAction(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPActionFullVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientICPAction();
		ims.icps.instantiation.domain.objects.PatientICPAction domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.icps.instantiation.domain.objects.PatientICPAction)domMap.get(valueObject);
			}
			// ims.icp.vo.PatientICPActionFullVo ID_PatientICPAction field is unknown
			domainObject = new ims.icps.instantiation.domain.objects.PatientICPAction();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientICPAction());
			if (domMap.get(key) != null)
			{
				return (ims.icps.instantiation.domain.objects.PatientICPAction)domMap.get(key);
			}
			domainObject = (ims.icps.instantiation.domain.objects.PatientICPAction) domainFactory.getDomainObject(ims.icps.instantiation.domain.objects.PatientICPAction.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientICPAction());

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
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getPatient();	
			}
			else
			{
				value1 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value1);
		ims.core.admin.domain.objects.CareContext value2 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value2 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getCareContext();	
			}
			else
			{
				value2 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value2);
		ims.icps.instantiation.domain.objects.PatientICP value3 = null;
		if ( null != valueObject.getICP() ) 
		{
			if (valueObject.getICP().getBoId() == null)
			{
				if (domMap.get(valueObject.getICP()) != null)
				{
					value3 = (ims.icps.instantiation.domain.objects.PatientICP)domMap.get(valueObject.getICP());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getICP();	
			}
			else
			{
				value3 = (ims.icps.instantiation.domain.objects.PatientICP)domainFactory.getDomainObject(ims.icps.instantiation.domain.objects.PatientICP.class, valueObject.getICP().getBoId());
			}
		}
		domainObject.setICP(value3);
		domainObject.setAction(ims.icp.vo.domain.ICPActionShortVoAssembler.extractICPAction(domainFactory, valueObject.getAction(), domMap));
		domainObject.setCurrentStatus(ims.icp.vo.domain.PatientICPActionStatusVoAssembler.extractPatientICPActionStatus(domainFactory, valueObject.getCurrentStatus(), domMap));
		domainObject.setStatusHistory(ims.icp.vo.domain.PatientICPActionStatusVoAssembler.extractPatientICPActionStatusSet(domainFactory, valueObject.getStatusHistory(), domainObject.getStatusHistory(), domMap));		
		ims.framework.utils.DateTime dateTime7 = valueObject.getCompletedOnDate();
		java.util.Date value7 = null;
		if ( dateTime7 != null ) 
		{
			value7 = dateTime7.getJavaDate();
		}
		domainObject.setCompletedOnDate(value7);
		ims.icps.instantiation.domain.objects.PatientICPPhase value8 = null;
		if ( null != valueObject.getParentPhase() ) 
		{
			if (valueObject.getParentPhase().getBoId() == null)
			{
				if (domMap.get(valueObject.getParentPhase()) != null)
				{
					value8 = (ims.icps.instantiation.domain.objects.PatientICPPhase)domMap.get(valueObject.getParentPhase());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value8 = domainObject.getParentPhase();	
			}
			else
			{
				value8 = (ims.icps.instantiation.domain.objects.PatientICPPhase)domainFactory.getDomainObject(ims.icps.instantiation.domain.objects.PatientICPPhase.class, valueObject.getParentPhase().getBoId());
			}
		}
		domainObject.setParentPhase(value8);
		domainObject.setRequiresCounterSigning(valueObject.getRequiresCounterSigning());

		return domainObject;
	}

}
