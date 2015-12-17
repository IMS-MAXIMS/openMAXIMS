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
package ims.icp.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author George Cristian Josan
 */
public class PatientICPAction_PresentationVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.icp.vo.PatientICPAction_PresentationVo copy(ims.icp.vo.PatientICPAction_PresentationVo valueObjectDest, ims.icp.vo.PatientICPAction_PresentationVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientICPAction(valueObjectSrc.getID_PatientICPAction());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ICP
		valueObjectDest.setICP(valueObjectSrc.getICP());
		// Action
		valueObjectDest.setAction(valueObjectSrc.getAction());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// RequiresCounterSigning
		valueObjectDest.setRequiresCounterSigning(valueObjectSrc.getRequiresCounterSigning());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientICPAction_PresentationVoCollectionFromPatientICPAction(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.icps.instantiation.domain.objects.PatientICPAction objects.
	 */
	public static ims.icp.vo.PatientICPAction_PresentationVoCollection createPatientICPAction_PresentationVoCollectionFromPatientICPAction(java.util.Set domainObjectSet)	
	{
		return createPatientICPAction_PresentationVoCollectionFromPatientICPAction(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.icps.instantiation.domain.objects.PatientICPAction objects.
	 */
	public static ims.icp.vo.PatientICPAction_PresentationVoCollection createPatientICPAction_PresentationVoCollectionFromPatientICPAction(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.icp.vo.PatientICPAction_PresentationVoCollection voList = new ims.icp.vo.PatientICPAction_PresentationVoCollection();
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
			ims.icp.vo.PatientICPAction_PresentationVo vo = create(map, domainObject);
			
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
	public static ims.icp.vo.PatientICPAction_PresentationVoCollection createPatientICPAction_PresentationVoCollectionFromPatientICPAction(java.util.List domainObjectList) 
	{
		return createPatientICPAction_PresentationVoCollectionFromPatientICPAction(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.icps.instantiation.domain.objects.PatientICPAction objects.
	 */
	public static ims.icp.vo.PatientICPAction_PresentationVoCollection createPatientICPAction_PresentationVoCollectionFromPatientICPAction(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.icp.vo.PatientICPAction_PresentationVoCollection voList = new ims.icp.vo.PatientICPAction_PresentationVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.icps.instantiation.domain.objects.PatientICPAction domainObject = (ims.icps.instantiation.domain.objects.PatientICPAction) domainObjectList.get(i);
			ims.icp.vo.PatientICPAction_PresentationVo vo = create(map, domainObject);

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
	 public static java.util.Set extractPatientICPActionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPAction_PresentationVoCollection voCollection) 
	 {
	 	return extractPatientICPActionSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientICPActionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPAction_PresentationVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.icp.vo.PatientICPAction_PresentationVo vo = voCollection.get(i);
			ims.icps.instantiation.domain.objects.PatientICPAction domainObject = PatientICPAction_PresentationVoAssembler.extractPatientICPAction(domainFactory, vo, domMap);

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
	 public static java.util.List extractPatientICPActionList(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPAction_PresentationVoCollection voCollection) 
	 {
	 	return extractPatientICPActionList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientICPActionList(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPAction_PresentationVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.icp.vo.PatientICPAction_PresentationVo vo = voCollection.get(i);
			ims.icps.instantiation.domain.objects.PatientICPAction domainObject = PatientICPAction_PresentationVoAssembler.extractPatientICPAction(domainFactory, vo, domMap);

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
	 public static ims.icp.vo.PatientICPAction_PresentationVo create(ims.icps.instantiation.domain.objects.PatientICPAction domainObject) 
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
	  public static ims.icp.vo.PatientICPAction_PresentationVo create(DomainObjectMap map, ims.icps.instantiation.domain.objects.PatientICPAction domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.icp.vo.PatientICPAction_PresentationVo valueObject = (ims.icp.vo.PatientICPAction_PresentationVo) map.getValueObject(domainObject, ims.icp.vo.PatientICPAction_PresentationVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.icp.vo.PatientICPAction_PresentationVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.icp.vo.PatientICPAction_PresentationVo insert(ims.icp.vo.PatientICPAction_PresentationVo valueObject, ims.icps.instantiation.domain.objects.PatientICPAction domainObject) 
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
	 public static ims.icp.vo.PatientICPAction_PresentationVo insert(DomainObjectMap map, ims.icp.vo.PatientICPAction_PresentationVo valueObject, ims.icps.instantiation.domain.objects.PatientICPAction domainObject) 
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
		valueObject.setAction(ims.icp.vo.domain.ICPActionLiteVoAssembler.create(map, domainObject.getAction()) );
		// CurrentStatus
		valueObject.setCurrentStatus(ims.icp.vo.domain.PatientICPActionStatusVoAssembler.create(map, domainObject.getCurrentStatus()) );
		// RequiresCounterSigning
		valueObject.setRequiresCounterSigning( domainObject.isRequiresCounterSigning() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.icps.instantiation.domain.objects.PatientICPAction extractPatientICPAction(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPAction_PresentationVo valueObject) 
	{
		return 	extractPatientICPAction(domainFactory, valueObject, new HashMap());
	}

	public static ims.icps.instantiation.domain.objects.PatientICPAction extractPatientICPAction(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPAction_PresentationVo valueObject, HashMap domMap) 
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
			// ims.icp.vo.PatientICPAction_PresentationVo ID_PatientICPAction field is unknown
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

		ims.icps.instantiation.domain.objects.PatientICP value1 = null;
		if ( null != valueObject.getICP() ) 
		{
			if (valueObject.getICP().getBoId() == null)
			{
				if (domMap.get(valueObject.getICP()) != null)
				{
					value1 = (ims.icps.instantiation.domain.objects.PatientICP)domMap.get(valueObject.getICP());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getICP();	
			}
			else
			{
				value1 = (ims.icps.instantiation.domain.objects.PatientICP)domainFactory.getDomainObject(ims.icps.instantiation.domain.objects.PatientICP.class, valueObject.getICP().getBoId());
			}
		}
		domainObject.setICP(value1);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.icps.configuration.domain.objects.ICPAction value2 = null;
		if ( null != valueObject.getAction() ) 
		{
			if (valueObject.getAction().getBoId() == null)
			{
				if (domMap.get(valueObject.getAction()) != null)
				{
					value2 = (ims.icps.configuration.domain.objects.ICPAction)domMap.get(valueObject.getAction());
				}
			}
			else
			{
				value2 = (ims.icps.configuration.domain.objects.ICPAction)domainFactory.getDomainObject(ims.icps.configuration.domain.objects.ICPAction.class, valueObject.getAction().getBoId());
			}
		}
		domainObject.setAction(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.icps.instantiation.domain.objects.PatientICPActionStatus value3 = null;
		if ( null != valueObject.getCurrentStatus() ) 
		{
			if (valueObject.getCurrentStatus().getBoId() == null)
			{
				if (domMap.get(valueObject.getCurrentStatus()) != null)
				{
					value3 = (ims.icps.instantiation.domain.objects.PatientICPActionStatus)domMap.get(valueObject.getCurrentStatus());
				}
			}
			else
			{
				value3 = (ims.icps.instantiation.domain.objects.PatientICPActionStatus)domainFactory.getDomainObject(ims.icps.instantiation.domain.objects.PatientICPActionStatus.class, valueObject.getCurrentStatus().getBoId());
			}
		}
		domainObject.setCurrentStatus(value3);
		domainObject.setRequiresCounterSigning(valueObject.getRequiresCounterSigning());

		return domainObject;
	}

}
