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
package ims.emergency.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Bogdan Tofei
 */
public class TriageForEventHistoryVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.TriageForEventHistoryVo copy(ims.emergency.vo.TriageForEventHistoryVo valueObjectDest, ims.emergency.vo.TriageForEventHistoryVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Triage(valueObjectSrc.getID_Triage());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Attendance
		valueObjectDest.setAttendance(valueObjectSrc.getAttendance());
		// TriageStartDateTime
		valueObjectDest.setTriageStartDateTime(valueObjectSrc.getTriageStartDateTime());
		// CurrentTriagePriority
		valueObjectDest.setCurrentTriagePriority(valueObjectSrc.getCurrentTriagePriority());
		// MainPresentingProblem
		valueObjectDest.setMainPresentingProblem(valueObjectSrc.getMainPresentingProblem());
		// MedicInterventionStartDateTime
		valueObjectDest.setMedicInterventionStartDateTime(valueObjectSrc.getMedicInterventionStartDateTime());
		// CurrentTriageAssessment
		valueObjectDest.setCurrentTriageAssessment(valueObjectSrc.getCurrentTriageAssessment());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTriageForEventHistoryVoCollectionFromTriage(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.emergency.domain.objects.Triage objects.
	 */
	public static ims.emergency.vo.TriageForEventHistoryVoCollection createTriageForEventHistoryVoCollectionFromTriage(java.util.Set domainObjectSet)	
	{
		return createTriageForEventHistoryVoCollectionFromTriage(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.emergency.domain.objects.Triage objects.
	 */
	public static ims.emergency.vo.TriageForEventHistoryVoCollection createTriageForEventHistoryVoCollectionFromTriage(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.TriageForEventHistoryVoCollection voList = new ims.emergency.vo.TriageForEventHistoryVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.emergency.domain.objects.Triage domainObject = (ims.emergency.domain.objects.Triage) iterator.next();
			ims.emergency.vo.TriageForEventHistoryVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.emergency.domain.objects.Triage objects.
	 */
	public static ims.emergency.vo.TriageForEventHistoryVoCollection createTriageForEventHistoryVoCollectionFromTriage(java.util.List domainObjectList) 
	{
		return createTriageForEventHistoryVoCollectionFromTriage(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.emergency.domain.objects.Triage objects.
	 */
	public static ims.emergency.vo.TriageForEventHistoryVoCollection createTriageForEventHistoryVoCollectionFromTriage(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.TriageForEventHistoryVoCollection voList = new ims.emergency.vo.TriageForEventHistoryVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.emergency.domain.objects.Triage domainObject = (ims.emergency.domain.objects.Triage) domainObjectList.get(i);
			ims.emergency.vo.TriageForEventHistoryVo vo = create(map, domainObject);

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
	 * Create the ims.emergency.domain.objects.Triage set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTriageSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TriageForEventHistoryVoCollection voCollection) 
	 {
	 	return extractTriageSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTriageSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TriageForEventHistoryVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.TriageForEventHistoryVo vo = voCollection.get(i);
			ims.emergency.domain.objects.Triage domainObject = TriageForEventHistoryVoAssembler.extractTriage(domainFactory, vo, domMap);

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
	 * Create the ims.emergency.domain.objects.Triage list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTriageList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TriageForEventHistoryVoCollection voCollection) 
	 {
	 	return extractTriageList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTriageList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TriageForEventHistoryVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.TriageForEventHistoryVo vo = voCollection.get(i);
			ims.emergency.domain.objects.Triage domainObject = TriageForEventHistoryVoAssembler.extractTriage(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.emergency.domain.objects.Triage object.
	 * @param domainObject ims.emergency.domain.objects.Triage
	 */
	 public static ims.emergency.vo.TriageForEventHistoryVo create(ims.emergency.domain.objects.Triage domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.emergency.domain.objects.Triage object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.emergency.vo.TriageForEventHistoryVo create(DomainObjectMap map, ims.emergency.domain.objects.Triage domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.TriageForEventHistoryVo valueObject = (ims.emergency.vo.TriageForEventHistoryVo) map.getValueObject(domainObject, ims.emergency.vo.TriageForEventHistoryVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.TriageForEventHistoryVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.emergency.domain.objects.Triage
	 */
	 public static ims.emergency.vo.TriageForEventHistoryVo insert(ims.emergency.vo.TriageForEventHistoryVo valueObject, ims.emergency.domain.objects.Triage domainObject) 
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
	 * @param domainObject ims.emergency.domain.objects.Triage
	 */
	 public static ims.emergency.vo.TriageForEventHistoryVo insert(DomainObjectMap map, ims.emergency.vo.TriageForEventHistoryVo valueObject, ims.emergency.domain.objects.Triage domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Triage(domainObject.getId());
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
			
		// Attendance
		if (domainObject.getAttendance() != null)
		{
			if(domainObject.getAttendance() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAttendance();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAttendance(new ims.core.admin.vo.CareContextRefVo(id, -1));				
			}
			else
			{
				valueObject.setAttendance(new ims.core.admin.vo.CareContextRefVo(domainObject.getAttendance().getId(), domainObject.getAttendance().getVersion()));
			}
		}
		// TriageStartDateTime
		java.util.Date TriageStartDateTime = domainObject.getTriageStartDateTime();
		if ( null != TriageStartDateTime ) 
		{
			valueObject.setTriageStartDateTime(new ims.framework.utils.DateTime(TriageStartDateTime) );
		}
		// CurrentTriagePriority
		ims.domain.lookups.LookupInstance instance3 = domainObject.getCurrentTriagePriority();
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

			ims.emergency.vo.lookups.TriagePriority voLookup3 = new ims.emergency.vo.lookups.TriagePriority(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.emergency.vo.lookups.TriagePriority parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.emergency.vo.lookups.TriagePriority(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setCurrentTriagePriority(voLookup3);
		}
				// MainPresentingProblem
		valueObject.setMainPresentingProblem(ims.emergency.vo.domain.PatientProblemForTrackingVoAssembler.create(map, domainObject.getMainPresentingProblem()) );
		// MedicInterventionStartDateTime
		java.util.Date MedicInterventionStartDateTime = domainObject.getMedicInterventionStartDateTime();
		if ( null != MedicInterventionStartDateTime ) 
		{
			valueObject.setMedicInterventionStartDateTime(new ims.framework.utils.DateTime(MedicInterventionStartDateTime) );
		}
		// CurrentTriageAssessment
		valueObject.setCurrentTriageAssessment(ims.emergency.vo.domain.TriageProtocolAssessmentForTriageVoAssembler.create(map, domainObject.getCurrentTriageAssessment()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.emergency.domain.objects.Triage extractTriage(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TriageForEventHistoryVo valueObject) 
	{
		return 	extractTriage(domainFactory, valueObject, new HashMap());
	}

	public static ims.emergency.domain.objects.Triage extractTriage(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TriageForEventHistoryVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Triage();
		ims.emergency.domain.objects.Triage domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.emergency.domain.objects.Triage)domMap.get(valueObject);
			}
			// ims.emergency.vo.TriageForEventHistoryVo ID_Triage field is unknown
			domainObject = new ims.emergency.domain.objects.Triage();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Triage());
			if (domMap.get(key) != null)
			{
				return (ims.emergency.domain.objects.Triage)domMap.get(key);
			}
			domainObject = (ims.emergency.domain.objects.Triage) domainFactory.getDomainObject(ims.emergency.domain.objects.Triage.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Triage());

		ims.core.admin.domain.objects.CareContext value1 = null;
		if ( null != valueObject.getAttendance() ) 
		{
			if (valueObject.getAttendance().getBoId() == null)
			{
				if (domMap.get(valueObject.getAttendance()) != null)
				{
					value1 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getAttendance());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getAttendance();	
			}
			else
			{
				value1 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getAttendance().getBoId());
			}
		}
		domainObject.setAttendance(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getTriageStartDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setTriageStartDateTime(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getCurrentTriagePriority() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getCurrentTriagePriority().getID());
		}
		domainObject.setCurrentTriagePriority(value3);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.PatientProblem value4 = null;
		if ( null != valueObject.getMainPresentingProblem() ) 
		{
			if (valueObject.getMainPresentingProblem().getBoId() == null)
			{
				if (domMap.get(valueObject.getMainPresentingProblem()) != null)
				{
					value4 = (ims.core.clinical.domain.objects.PatientProblem)domMap.get(valueObject.getMainPresentingProblem());
				}
			}
			else
			{
				value4 = (ims.core.clinical.domain.objects.PatientProblem)domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientProblem.class, valueObject.getMainPresentingProblem().getBoId());
			}
		}
		domainObject.setMainPresentingProblem(value4);
		ims.framework.utils.DateTime dateTime5 = valueObject.getMedicInterventionStartDateTime();
		java.util.Date value5 = null;
		if ( dateTime5 != null ) 
		{
			value5 = dateTime5.getJavaDate();
		}
		domainObject.setMedicInterventionStartDateTime(value5);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.emergency.domain.objects.TriageProtocolAssessment value6 = null;
		if ( null != valueObject.getCurrentTriageAssessment() ) 
		{
			if (valueObject.getCurrentTriageAssessment().getBoId() == null)
			{
				if (domMap.get(valueObject.getCurrentTriageAssessment()) != null)
				{
					value6 = (ims.emergency.domain.objects.TriageProtocolAssessment)domMap.get(valueObject.getCurrentTriageAssessment());
				}
			}
			else
			{
				value6 = (ims.emergency.domain.objects.TriageProtocolAssessment)domainFactory.getDomainObject(ims.emergency.domain.objects.TriageProtocolAssessment.class, valueObject.getCurrentTriageAssessment().getBoId());
			}
		}
		domainObject.setCurrentTriageAssessment(value6);

		return domainObject;
	}

}
