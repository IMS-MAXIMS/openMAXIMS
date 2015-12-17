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
 * @author Rory Fitzpatrick
 */
public class PatientICPLiteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.icp.vo.PatientICPLiteVo copy(ims.icp.vo.PatientICPLiteVo valueObjectDest, ims.icp.vo.PatientICPLiteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientICP(valueObjectSrc.getID_PatientICP());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// hasOutstandingAdminActions
		valueObjectDest.setHasOutstandingAdminActions(valueObjectSrc.getHasOutstandingAdminActions());
		// hasOutstandingNursingActions
		valueObjectDest.setHasOutstandingNursingActions(valueObjectSrc.getHasOutstandingNursingActions());
		// hasOutstandingPhysioActions
		valueObjectDest.setHasOutstandingPhysioActions(valueObjectSrc.getHasOutstandingPhysioActions());
		// hasOutstandingClinicalActions
		valueObjectDest.setHasOutstandingClinicalActions(valueObjectSrc.getHasOutstandingClinicalActions());
		// ICP
		valueObjectDest.setICP(valueObjectSrc.getICP());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientICPLiteVoCollectionFromPatientICP(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.icps.instantiation.domain.objects.PatientICP objects.
	 */
	public static ims.icp.vo.PatientICPLiteVoCollection createPatientICPLiteVoCollectionFromPatientICP(java.util.Set domainObjectSet)	
	{
		return createPatientICPLiteVoCollectionFromPatientICP(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.icps.instantiation.domain.objects.PatientICP objects.
	 */
	public static ims.icp.vo.PatientICPLiteVoCollection createPatientICPLiteVoCollectionFromPatientICP(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.icp.vo.PatientICPLiteVoCollection voList = new ims.icp.vo.PatientICPLiteVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.icps.instantiation.domain.objects.PatientICP domainObject = (ims.icps.instantiation.domain.objects.PatientICP) iterator.next();
			ims.icp.vo.PatientICPLiteVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.icps.instantiation.domain.objects.PatientICP objects.
	 */
	public static ims.icp.vo.PatientICPLiteVoCollection createPatientICPLiteVoCollectionFromPatientICP(java.util.List domainObjectList) 
	{
		return createPatientICPLiteVoCollectionFromPatientICP(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.icps.instantiation.domain.objects.PatientICP objects.
	 */
	public static ims.icp.vo.PatientICPLiteVoCollection createPatientICPLiteVoCollectionFromPatientICP(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.icp.vo.PatientICPLiteVoCollection voList = new ims.icp.vo.PatientICPLiteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.icps.instantiation.domain.objects.PatientICP domainObject = (ims.icps.instantiation.domain.objects.PatientICP) domainObjectList.get(i);
			ims.icp.vo.PatientICPLiteVo vo = create(map, domainObject);

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
	 * Create the ims.icps.instantiation.domain.objects.PatientICP set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientICPSet(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPLiteVoCollection voCollection) 
	 {
	 	return extractPatientICPSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientICPSet(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPLiteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.icp.vo.PatientICPLiteVo vo = voCollection.get(i);
			ims.icps.instantiation.domain.objects.PatientICP domainObject = PatientICPLiteVoAssembler.extractPatientICP(domainFactory, vo, domMap);

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
	 * Create the ims.icps.instantiation.domain.objects.PatientICP list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientICPList(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPLiteVoCollection voCollection) 
	 {
	 	return extractPatientICPList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientICPList(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPLiteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.icp.vo.PatientICPLiteVo vo = voCollection.get(i);
			ims.icps.instantiation.domain.objects.PatientICP domainObject = PatientICPLiteVoAssembler.extractPatientICP(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.icps.instantiation.domain.objects.PatientICP object.
	 * @param domainObject ims.icps.instantiation.domain.objects.PatientICP
	 */
	 public static ims.icp.vo.PatientICPLiteVo create(ims.icps.instantiation.domain.objects.PatientICP domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.icps.instantiation.domain.objects.PatientICP object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.icp.vo.PatientICPLiteVo create(DomainObjectMap map, ims.icps.instantiation.domain.objects.PatientICP domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.icp.vo.PatientICPLiteVo valueObject = (ims.icp.vo.PatientICPLiteVo) map.getValueObject(domainObject, ims.icp.vo.PatientICPLiteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.icp.vo.PatientICPLiteVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.icps.instantiation.domain.objects.PatientICP
	 */
	 public static ims.icp.vo.PatientICPLiteVo insert(ims.icp.vo.PatientICPLiteVo valueObject, ims.icps.instantiation.domain.objects.PatientICP domainObject) 
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
	 * @param domainObject ims.icps.instantiation.domain.objects.PatientICP
	 */
	 public static ims.icp.vo.PatientICPLiteVo insert(DomainObjectMap map, ims.icp.vo.PatientICPLiteVo valueObject, ims.icps.instantiation.domain.objects.PatientICP domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientICP(domainObject.getId());
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
			
		// hasOutstandingAdminActions
		valueObject.setHasOutstandingAdminActions( domainObject.isHasOutstandingAdminActions() );
		// hasOutstandingNursingActions
		valueObject.setHasOutstandingNursingActions( domainObject.isHasOutstandingNursingActions() );
		// hasOutstandingPhysioActions
		valueObject.setHasOutstandingPhysioActions( domainObject.isHasOutstandingPhysioActions() );
		// hasOutstandingClinicalActions
		valueObject.setHasOutstandingClinicalActions( domainObject.isHasOutstandingClinicalActions() );
		// ICP
		valueObject.setICP(ims.icp.vo.domain.ICPLiteVoAssembler.create(map, domainObject.getICP()) );
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
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.icps.instantiation.domain.objects.PatientICP extractPatientICP(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPLiteVo valueObject) 
	{
		return 	extractPatientICP(domainFactory, valueObject, new HashMap());
	}

	public static ims.icps.instantiation.domain.objects.PatientICP extractPatientICP(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPLiteVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientICP();
		ims.icps.instantiation.domain.objects.PatientICP domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.icps.instantiation.domain.objects.PatientICP)domMap.get(valueObject);
			}
			// ims.icp.vo.PatientICPLiteVo ID_PatientICP field is unknown
			domainObject = new ims.icps.instantiation.domain.objects.PatientICP();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientICP());
			if (domMap.get(key) != null)
			{
				return (ims.icps.instantiation.domain.objects.PatientICP)domMap.get(key);
			}
			domainObject = (ims.icps.instantiation.domain.objects.PatientICP) domainFactory.getDomainObject(ims.icps.instantiation.domain.objects.PatientICP.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientICP());

		domainObject.setHasOutstandingAdminActions(valueObject.getHasOutstandingAdminActions());
		domainObject.setHasOutstandingNursingActions(valueObject.getHasOutstandingNursingActions());
		domainObject.setHasOutstandingPhysioActions(valueObject.getHasOutstandingPhysioActions());
		domainObject.setHasOutstandingClinicalActions(valueObject.getHasOutstandingClinicalActions());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.icps.configuration.domain.objects.ICP value5 = null;
		if ( null != valueObject.getICP() ) 
		{
			if (valueObject.getICP().getBoId() == null)
			{
				if (domMap.get(valueObject.getICP()) != null)
				{
					value5 = (ims.icps.configuration.domain.objects.ICP)domMap.get(valueObject.getICP());
				}
			}
			else
			{
				value5 = (ims.icps.configuration.domain.objects.ICP)domainFactory.getDomainObject(ims.icps.configuration.domain.objects.ICP.class, valueObject.getICP().getBoId());
			}
		}
		domainObject.setICP(value5);
		ims.core.admin.domain.objects.CareContext value6 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value6 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value6 = domainObject.getCareContext();	
			}
			else
			{
				value6 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value6);

		return domainObject;
	}

}
