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
 * @author Calin Perebiceanu
 */
public class PatientICPViewVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.icp.vo.PatientICPViewVo copy(ims.icp.vo.PatientICPViewVo valueObjectDest, ims.icp.vo.PatientICPViewVo valueObjectSrc) 
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
		// Stages
		valueObjectDest.setStages(valueObjectSrc.getStages());
		// CriticalEvents
		valueObjectDest.setCriticalEvents(valueObjectSrc.getCriticalEvents());
		// EvaluationNotes
		valueObjectDest.setEvaluationNotes(valueObjectSrc.getEvaluationNotes());
		// CompletedDateTime
		valueObjectDest.setCompletedDateTime(valueObjectSrc.getCompletedDateTime());
		// ICP
		valueObjectDest.setICP(valueObjectSrc.getICP());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientICPViewVoCollectionFromPatientICP(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.icps.instantiation.domain.objects.PatientICP objects.
	 */
	public static ims.icp.vo.PatientICPViewVoCollection createPatientICPViewVoCollectionFromPatientICP(java.util.Set domainObjectSet)	
	{
		return createPatientICPViewVoCollectionFromPatientICP(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.icps.instantiation.domain.objects.PatientICP objects.
	 */
	public static ims.icp.vo.PatientICPViewVoCollection createPatientICPViewVoCollectionFromPatientICP(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.icp.vo.PatientICPViewVoCollection voList = new ims.icp.vo.PatientICPViewVoCollection();
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
			ims.icp.vo.PatientICPViewVo vo = create(map, domainObject);
			
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
	public static ims.icp.vo.PatientICPViewVoCollection createPatientICPViewVoCollectionFromPatientICP(java.util.List domainObjectList) 
	{
		return createPatientICPViewVoCollectionFromPatientICP(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.icps.instantiation.domain.objects.PatientICP objects.
	 */
	public static ims.icp.vo.PatientICPViewVoCollection createPatientICPViewVoCollectionFromPatientICP(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.icp.vo.PatientICPViewVoCollection voList = new ims.icp.vo.PatientICPViewVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.icps.instantiation.domain.objects.PatientICP domainObject = (ims.icps.instantiation.domain.objects.PatientICP) domainObjectList.get(i);
			ims.icp.vo.PatientICPViewVo vo = create(map, domainObject);

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
	 public static java.util.Set extractPatientICPSet(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPViewVoCollection voCollection) 
	 {
	 	return extractPatientICPSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientICPSet(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPViewVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.icp.vo.PatientICPViewVo vo = voCollection.get(i);
			ims.icps.instantiation.domain.objects.PatientICP domainObject = PatientICPViewVoAssembler.extractPatientICP(domainFactory, vo, domMap);

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
	 public static java.util.List extractPatientICPList(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPViewVoCollection voCollection) 
	 {
	 	return extractPatientICPList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientICPList(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPViewVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.icp.vo.PatientICPViewVo vo = voCollection.get(i);
			ims.icps.instantiation.domain.objects.PatientICP domainObject = PatientICPViewVoAssembler.extractPatientICP(domainFactory, vo, domMap);

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
	 public static ims.icp.vo.PatientICPViewVo create(ims.icps.instantiation.domain.objects.PatientICP domainObject) 
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
	  public static ims.icp.vo.PatientICPViewVo create(DomainObjectMap map, ims.icps.instantiation.domain.objects.PatientICP domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.icp.vo.PatientICPViewVo valueObject = (ims.icp.vo.PatientICPViewVo) map.getValueObject(domainObject, ims.icp.vo.PatientICPViewVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.icp.vo.PatientICPViewVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.icp.vo.PatientICPViewVo insert(ims.icp.vo.PatientICPViewVo valueObject, ims.icps.instantiation.domain.objects.PatientICP domainObject) 
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
	 public static ims.icp.vo.PatientICPViewVo insert(DomainObjectMap map, ims.icp.vo.PatientICPViewVo valueObject, ims.icps.instantiation.domain.objects.PatientICP domainObject) 
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
		// Stages
		valueObject.setStages(ims.icp.vo.domain.PatientICPStageViewVoAssembler.createPatientICPStageViewVoCollectionFromPatientICPStage(map, domainObject.getStages()) );
		// CriticalEvents
		valueObject.setCriticalEvents(ims.icp.vo.domain.PatientCriticalEventsVoAssembler.createPatientCriticalEventsVoCollectionFromPatientCriticalEvents(map, domainObject.getCriticalEvents()) );
		// EvaluationNotes
		valueObject.setEvaluationNotes(ims.icp.vo.domain.PatientICPEvaluationNoteVoAssembler.createPatientICPEvaluationNoteVoCollectionFromPatientICPEvaluationNote(map, domainObject.getEvaluationNotes()) );
		// CompletedDateTime
		java.util.Date CompletedDateTime = domainObject.getCompletedDateTime();
		if ( null != CompletedDateTime ) 
		{
			valueObject.setCompletedDateTime(new ims.framework.utils.DateTime(CompletedDateTime) );
		}
		// ICP
		if (domainObject.getICP() != null)
		{
			if(domainObject.getICP() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getICP();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setICP(new ims.icps.configuration.vo.ICPRefVo(id, -1));				
			}
			else
			{
				valueObject.setICP(new ims.icps.configuration.vo.ICPRefVo(domainObject.getICP().getId(), domainObject.getICP().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.icps.instantiation.domain.objects.PatientICP extractPatientICP(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPViewVo valueObject) 
	{
		return 	extractPatientICP(domainFactory, valueObject, new HashMap());
	}

	public static ims.icps.instantiation.domain.objects.PatientICP extractPatientICP(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPViewVo valueObject, HashMap domMap) 
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
			// ims.icp.vo.PatientICPViewVo ID_PatientICP field is unknown
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

		// SaveAsRefVO treated as RefValueObject
		ims.icps.instantiation.vo.PatientICPStageRefVoCollection refCollection5 = new ims.icps.instantiation.vo.PatientICPStageRefVoCollection();
		if (valueObject.getStages() != null)
		{
			for (int i5=0; i5<valueObject.getStages().size(); i5++)
			{
				ims.icps.instantiation.vo.PatientICPStageRefVo ref5 = (ims.icps.instantiation.vo.PatientICPStageRefVo)valueObject.getStages().get(i5);
				refCollection5.add(ref5);
			}
		}
		int size5 = (null == refCollection5) ? 0 : refCollection5.size();		
		java.util.Set domainStages5 = domainObject.getStages();
		if (domainStages5 == null)
		{
			domainStages5 = new java.util.HashSet();
		}
		java.util.Set newSet5  = new java.util.HashSet();
		for(int i=0; i<size5; i++) 
		{
			ims.icps.instantiation.vo.PatientICPStageRefVo vo = refCollection5.get(i);					
			ims.icps.instantiation.domain.objects.PatientICPStage dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.icps.instantiation.domain.objects.PatientICPStage)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.icps.instantiation.domain.objects.PatientICPStage)domainFactory.getDomainObject( ims.icps.instantiation.domain.objects.PatientICPStage.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainStages5.contains(dom))
			{
				domainStages5.add(dom);
			}
			newSet5.add(dom);			
		}
		java.util.Set removedSet5 = new java.util.HashSet();
		java.util.Iterator iter5 = domainStages5.iterator();
		//Find out which objects need to be removed
		while (iter5.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter5.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet5.contains(o))
			{
				removedSet5.add(o);
			}
		}
		iter5 = removedSet5.iterator();
		//Remove the unwanted objects
		while (iter5.hasNext())
		{
			domainStages5.remove(iter5.next());
		}		
		
		domainObject.setStages(domainStages5);		

		// SaveAsRefVO treated as RefValueObject
		ims.icps.instantiation.vo.PatientCriticalEventsRefVoCollection refCollection6 = new ims.icps.instantiation.vo.PatientCriticalEventsRefVoCollection();
		if (valueObject.getCriticalEvents() != null)
		{
			for (int i6=0; i6<valueObject.getCriticalEvents().size(); i6++)
			{
				ims.icps.instantiation.vo.PatientCriticalEventsRefVo ref6 = (ims.icps.instantiation.vo.PatientCriticalEventsRefVo)valueObject.getCriticalEvents().get(i6);
				refCollection6.add(ref6);
			}
		}
		int size6 = (null == refCollection6) ? 0 : refCollection6.size();		
		java.util.Set domainCriticalEvents6 = domainObject.getCriticalEvents();
		if (domainCriticalEvents6 == null)
		{
			domainCriticalEvents6 = new java.util.HashSet();
		}
		java.util.Set newSet6  = new java.util.HashSet();
		for(int i=0; i<size6; i++) 
		{
			ims.icps.instantiation.vo.PatientCriticalEventsRefVo vo = refCollection6.get(i);					
			ims.icps.instantiation.domain.objects.PatientCriticalEvents dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.icps.instantiation.domain.objects.PatientCriticalEvents)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.icps.instantiation.domain.objects.PatientCriticalEvents)domainFactory.getDomainObject( ims.icps.instantiation.domain.objects.PatientCriticalEvents.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainCriticalEvents6.contains(dom))
			{
				domainCriticalEvents6.add(dom);
			}
			newSet6.add(dom);			
		}
		java.util.Set removedSet6 = new java.util.HashSet();
		java.util.Iterator iter6 = domainCriticalEvents6.iterator();
		//Find out which objects need to be removed
		while (iter6.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter6.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet6.contains(o))
			{
				removedSet6.add(o);
			}
		}
		iter6 = removedSet6.iterator();
		//Remove the unwanted objects
		while (iter6.hasNext())
		{
			domainCriticalEvents6.remove(iter6.next());
		}		
		
		domainObject.setCriticalEvents(domainCriticalEvents6);		

		// SaveAsRefVO treated as RefValueObject
		ims.icps.instantiation.vo.PatientICPEvaluationNoteRefVoCollection refCollection7 = new ims.icps.instantiation.vo.PatientICPEvaluationNoteRefVoCollection();
		if (valueObject.getEvaluationNotes() != null)
		{
			for (int i7=0; i7<valueObject.getEvaluationNotes().size(); i7++)
			{
				ims.icps.instantiation.vo.PatientICPEvaluationNoteRefVo ref7 = (ims.icps.instantiation.vo.PatientICPEvaluationNoteRefVo)valueObject.getEvaluationNotes().get(i7);
				refCollection7.add(ref7);
			}
		}
		int size7 = (null == refCollection7) ? 0 : refCollection7.size();		
		java.util.Set domainEvaluationNotes7 = domainObject.getEvaluationNotes();
		if (domainEvaluationNotes7 == null)
		{
			domainEvaluationNotes7 = new java.util.HashSet();
		}
		java.util.Set newSet7  = new java.util.HashSet();
		for(int i=0; i<size7; i++) 
		{
			ims.icps.instantiation.vo.PatientICPEvaluationNoteRefVo vo = refCollection7.get(i);					
			ims.icps.instantiation.domain.objects.PatientICPEvaluationNote dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.icps.instantiation.domain.objects.PatientICPEvaluationNote)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.icps.instantiation.domain.objects.PatientICPEvaluationNote)domainFactory.getDomainObject( ims.icps.instantiation.domain.objects.PatientICPEvaluationNote.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainEvaluationNotes7.contains(dom))
			{
				domainEvaluationNotes7.add(dom);
			}
			newSet7.add(dom);			
		}
		java.util.Set removedSet7 = new java.util.HashSet();
		java.util.Iterator iter7 = domainEvaluationNotes7.iterator();
		//Find out which objects need to be removed
		while (iter7.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter7.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet7.contains(o))
			{
				removedSet7.add(o);
			}
		}
		iter7 = removedSet7.iterator();
		//Remove the unwanted objects
		while (iter7.hasNext())
		{
			domainEvaluationNotes7.remove(iter7.next());
		}		
		
		domainObject.setEvaluationNotes(domainEvaluationNotes7);		
		ims.framework.utils.DateTime dateTime8 = valueObject.getCompletedDateTime();
		java.util.Date value8 = null;
		if ( dateTime8 != null ) 
		{
			value8 = dateTime8.getJavaDate();
		}
		domainObject.setCompletedDateTime(value8);
		ims.icps.configuration.domain.objects.ICP value9 = null;
		if ( null != valueObject.getICP() ) 
		{
			if (valueObject.getICP().getBoId() == null)
			{
				if (domMap.get(valueObject.getICP()) != null)
				{
					value9 = (ims.icps.configuration.domain.objects.ICP)domMap.get(valueObject.getICP());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value9 = domainObject.getICP();	
			}
			else
			{
				value9 = (ims.icps.configuration.domain.objects.ICP)domainFactory.getDomainObject(ims.icps.configuration.domain.objects.ICP.class, valueObject.getICP().getBoId());
			}
		}
		domainObject.setICP(value9);

		return domainObject;
	}

}
