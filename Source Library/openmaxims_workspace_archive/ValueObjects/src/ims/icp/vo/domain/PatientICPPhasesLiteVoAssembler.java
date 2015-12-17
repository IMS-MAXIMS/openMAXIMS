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
 * @author Vasile Purdila
 */
public class PatientICPPhasesLiteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.icp.vo.PatientICPPhasesLiteVo copy(ims.icp.vo.PatientICPPhasesLiteVo valueObjectDest, ims.icp.vo.PatientICPPhasesLiteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientICPPhase(valueObjectSrc.getID_PatientICPPhase());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Phase
		valueObjectDest.setPhase(valueObjectSrc.getPhase());
		// PhaseActions
		valueObjectDest.setPhaseActions(valueObjectSrc.getPhaseActions());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientICPPhasesLiteVoCollectionFromPatientICPPhase(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.icps.instantiation.domain.objects.PatientICPPhase objects.
	 */
	public static ims.icp.vo.PatientICPPhasesLiteVoCollection createPatientICPPhasesLiteVoCollectionFromPatientICPPhase(java.util.Set domainObjectSet)	
	{
		return createPatientICPPhasesLiteVoCollectionFromPatientICPPhase(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.icps.instantiation.domain.objects.PatientICPPhase objects.
	 */
	public static ims.icp.vo.PatientICPPhasesLiteVoCollection createPatientICPPhasesLiteVoCollectionFromPatientICPPhase(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.icp.vo.PatientICPPhasesLiteVoCollection voList = new ims.icp.vo.PatientICPPhasesLiteVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.icps.instantiation.domain.objects.PatientICPPhase domainObject = (ims.icps.instantiation.domain.objects.PatientICPPhase) iterator.next();
			ims.icp.vo.PatientICPPhasesLiteVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.icps.instantiation.domain.objects.PatientICPPhase objects.
	 */
	public static ims.icp.vo.PatientICPPhasesLiteVoCollection createPatientICPPhasesLiteVoCollectionFromPatientICPPhase(java.util.List domainObjectList) 
	{
		return createPatientICPPhasesLiteVoCollectionFromPatientICPPhase(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.icps.instantiation.domain.objects.PatientICPPhase objects.
	 */
	public static ims.icp.vo.PatientICPPhasesLiteVoCollection createPatientICPPhasesLiteVoCollectionFromPatientICPPhase(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.icp.vo.PatientICPPhasesLiteVoCollection voList = new ims.icp.vo.PatientICPPhasesLiteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.icps.instantiation.domain.objects.PatientICPPhase domainObject = (ims.icps.instantiation.domain.objects.PatientICPPhase) domainObjectList.get(i);
			ims.icp.vo.PatientICPPhasesLiteVo vo = create(map, domainObject);

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
	 * Create the ims.icps.instantiation.domain.objects.PatientICPPhase set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientICPPhaseSet(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPPhasesLiteVoCollection voCollection) 
	 {
	 	return extractPatientICPPhaseSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientICPPhaseSet(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPPhasesLiteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.icp.vo.PatientICPPhasesLiteVo vo = voCollection.get(i);
			ims.icps.instantiation.domain.objects.PatientICPPhase domainObject = PatientICPPhasesLiteVoAssembler.extractPatientICPPhase(domainFactory, vo, domMap);

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
	 * Create the ims.icps.instantiation.domain.objects.PatientICPPhase list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientICPPhaseList(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPPhasesLiteVoCollection voCollection) 
	 {
	 	return extractPatientICPPhaseList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientICPPhaseList(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPPhasesLiteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.icp.vo.PatientICPPhasesLiteVo vo = voCollection.get(i);
			ims.icps.instantiation.domain.objects.PatientICPPhase domainObject = PatientICPPhasesLiteVoAssembler.extractPatientICPPhase(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.icps.instantiation.domain.objects.PatientICPPhase object.
	 * @param domainObject ims.icps.instantiation.domain.objects.PatientICPPhase
	 */
	 public static ims.icp.vo.PatientICPPhasesLiteVo create(ims.icps.instantiation.domain.objects.PatientICPPhase domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.icps.instantiation.domain.objects.PatientICPPhase object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.icp.vo.PatientICPPhasesLiteVo create(DomainObjectMap map, ims.icps.instantiation.domain.objects.PatientICPPhase domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.icp.vo.PatientICPPhasesLiteVo valueObject = (ims.icp.vo.PatientICPPhasesLiteVo) map.getValueObject(domainObject, ims.icp.vo.PatientICPPhasesLiteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.icp.vo.PatientICPPhasesLiteVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.icps.instantiation.domain.objects.PatientICPPhase
	 */
	 public static ims.icp.vo.PatientICPPhasesLiteVo insert(ims.icp.vo.PatientICPPhasesLiteVo valueObject, ims.icps.instantiation.domain.objects.PatientICPPhase domainObject) 
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
	 * @param domainObject ims.icps.instantiation.domain.objects.PatientICPPhase
	 */
	 public static ims.icp.vo.PatientICPPhasesLiteVo insert(DomainObjectMap map, ims.icp.vo.PatientICPPhasesLiteVo valueObject, ims.icps.instantiation.domain.objects.PatientICPPhase domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientICPPhase(domainObject.getId());
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
			
		// Phase
		valueObject.setPhase(ims.icp.vo.domain.ICPPhaseLiteVoAssembler.create(map, domainObject.getPhase()) );
		// PhaseActions
		valueObject.setPhaseActions(ims.icp.vo.domain.PatientICPActionLiteVoAssembler.createPatientICPActionLiteVoCollectionFromPatientICPAction(map, domainObject.getPhaseActions()) );
		// CurrentStatus
		valueObject.setCurrentStatus(ims.icp.vo.domain.PatientICPPhaseStatusVoAssembler.create(map, domainObject.getCurrentStatus()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.icps.instantiation.domain.objects.PatientICPPhase extractPatientICPPhase(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPPhasesLiteVo valueObject) 
	{
		return 	extractPatientICPPhase(domainFactory, valueObject, new HashMap());
	}

	public static ims.icps.instantiation.domain.objects.PatientICPPhase extractPatientICPPhase(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPPhasesLiteVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientICPPhase();
		ims.icps.instantiation.domain.objects.PatientICPPhase domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.icps.instantiation.domain.objects.PatientICPPhase)domMap.get(valueObject);
			}
			// ims.icp.vo.PatientICPPhasesLiteVo ID_PatientICPPhase field is unknown
			domainObject = new ims.icps.instantiation.domain.objects.PatientICPPhase();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientICPPhase());
			if (domMap.get(key) != null)
			{
				return (ims.icps.instantiation.domain.objects.PatientICPPhase)domMap.get(key);
			}
			domainObject = (ims.icps.instantiation.domain.objects.PatientICPPhase) domainFactory.getDomainObject(ims.icps.instantiation.domain.objects.PatientICPPhase.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientICPPhase());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.icps.configuration.domain.objects.ICPPhase value1 = null;
		if ( null != valueObject.getPhase() ) 
		{
			if (valueObject.getPhase().getBoId() == null)
			{
				if (domMap.get(valueObject.getPhase()) != null)
				{
					value1 = (ims.icps.configuration.domain.objects.ICPPhase)domMap.get(valueObject.getPhase());
				}
			}
			else
			{
				value1 = (ims.icps.configuration.domain.objects.ICPPhase)domainFactory.getDomainObject(ims.icps.configuration.domain.objects.ICPPhase.class, valueObject.getPhase().getBoId());
			}
		}
		domainObject.setPhase(value1);

		// SaveAsRefVO treated as RefValueObject
		ims.icps.instantiation.vo.PatientICPActionRefVoCollection refCollection2 = new ims.icps.instantiation.vo.PatientICPActionRefVoCollection();
		if (valueObject.getPhaseActions() != null)
		{
			for (int i2=0; i2<valueObject.getPhaseActions().size(); i2++)
			{
				ims.icps.instantiation.vo.PatientICPActionRefVo ref2 = (ims.icps.instantiation.vo.PatientICPActionRefVo)valueObject.getPhaseActions().get(i2);
				refCollection2.add(ref2);
			}
		}
		int size2 = (null == refCollection2) ? 0 : refCollection2.size();		
		java.util.Set domainPhaseActions2 = domainObject.getPhaseActions();
		if (domainPhaseActions2 == null)
		{
			domainPhaseActions2 = new java.util.HashSet();
		}
		java.util.Set newSet2  = new java.util.HashSet();
		for(int i=0; i<size2; i++) 
		{
			ims.icps.instantiation.vo.PatientICPActionRefVo vo = refCollection2.get(i);					
			ims.icps.instantiation.domain.objects.PatientICPAction dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.icps.instantiation.domain.objects.PatientICPAction)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.icps.instantiation.domain.objects.PatientICPAction)domainFactory.getDomainObject( ims.icps.instantiation.domain.objects.PatientICPAction.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainPhaseActions2.contains(dom))
			{
				domainPhaseActions2.add(dom);
			}
			newSet2.add(dom);			
		}
		java.util.Set removedSet2 = new java.util.HashSet();
		java.util.Iterator iter2 = domainPhaseActions2.iterator();
		//Find out which objects need to be removed
		while (iter2.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter2.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet2.contains(o))
			{
				removedSet2.add(o);
			}
		}
		iter2 = removedSet2.iterator();
		//Remove the unwanted objects
		while (iter2.hasNext())
		{
			domainPhaseActions2.remove(iter2.next());
		}		
		
		domainObject.setPhaseActions(domainPhaseActions2);		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.icps.instantiation.domain.objects.PatientICPPhaseStatus value3 = null;
		if ( null != valueObject.getCurrentStatus() ) 
		{
			if (valueObject.getCurrentStatus().getBoId() == null)
			{
				if (domMap.get(valueObject.getCurrentStatus()) != null)
				{
					value3 = (ims.icps.instantiation.domain.objects.PatientICPPhaseStatus)domMap.get(valueObject.getCurrentStatus());
				}
			}
			else
			{
				value3 = (ims.icps.instantiation.domain.objects.PatientICPPhaseStatus)domainFactory.getDomainObject(ims.icps.instantiation.domain.objects.PatientICPPhaseStatus.class, valueObject.getCurrentStatus().getBoId());
			}
		}
		domainObject.setCurrentStatus(value3);

		return domainObject;
	}

}
