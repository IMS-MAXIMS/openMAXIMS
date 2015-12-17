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
package ims.nursing.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Florin Blindu
 */
public class CarePlanForCopyCarePlansVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.nursing.vo.CarePlanForCopyCarePlansVo copy(ims.nursing.vo.CarePlanForCopyCarePlansVo valueObjectDest, ims.nursing.vo.CarePlanForCopyCarePlansVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CarePlan(valueObjectSrc.getID_CarePlan());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Title
		valueObjectDest.setTitle(valueObjectSrc.getTitle());
		// Objective
		valueObjectDest.setObjective(valueObjectSrc.getObjective());
		// Interventions
		valueObjectDest.setInterventions(valueObjectSrc.getInterventions());
		// NextEvaluationDate
		valueObjectDest.setNextEvaluationDate(valueObjectSrc.getNextEvaluationDate());
		// NextEvaluationTime
		valueObjectDest.setNextEvaluationTime(valueObjectSrc.getNextEvaluationTime());
		// Template
		valueObjectDest.setTemplate(valueObjectSrc.getTemplate());
		// CarePlanStatus
		valueObjectDest.setCarePlanStatus(valueObjectSrc.getCarePlanStatus());
		// CurrentCarePlanStatus
		valueObjectDest.setCurrentCarePlanStatus(valueObjectSrc.getCurrentCarePlanStatus());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// RecordingInformation
		valueObjectDest.setRecordingInformation(valueObjectSrc.getRecordingInformation());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCarePlanForCopyCarePlansVoCollectionFromCarePlan(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.nursing.careplans.domain.objects.CarePlan objects.
	 */
	public static ims.nursing.vo.CarePlanForCopyCarePlansVoCollection createCarePlanForCopyCarePlansVoCollectionFromCarePlan(java.util.Set domainObjectSet)	
	{
		return createCarePlanForCopyCarePlansVoCollectionFromCarePlan(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.nursing.careplans.domain.objects.CarePlan objects.
	 */
	public static ims.nursing.vo.CarePlanForCopyCarePlansVoCollection createCarePlanForCopyCarePlansVoCollectionFromCarePlan(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.nursing.vo.CarePlanForCopyCarePlansVoCollection voList = new ims.nursing.vo.CarePlanForCopyCarePlansVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.nursing.careplans.domain.objects.CarePlan domainObject = (ims.nursing.careplans.domain.objects.CarePlan) iterator.next();
			ims.nursing.vo.CarePlanForCopyCarePlansVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.nursing.careplans.domain.objects.CarePlan objects.
	 */
	public static ims.nursing.vo.CarePlanForCopyCarePlansVoCollection createCarePlanForCopyCarePlansVoCollectionFromCarePlan(java.util.List domainObjectList) 
	{
		return createCarePlanForCopyCarePlansVoCollectionFromCarePlan(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.nursing.careplans.domain.objects.CarePlan objects.
	 */
	public static ims.nursing.vo.CarePlanForCopyCarePlansVoCollection createCarePlanForCopyCarePlansVoCollectionFromCarePlan(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.nursing.vo.CarePlanForCopyCarePlansVoCollection voList = new ims.nursing.vo.CarePlanForCopyCarePlansVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.nursing.careplans.domain.objects.CarePlan domainObject = (ims.nursing.careplans.domain.objects.CarePlan) domainObjectList.get(i);
			ims.nursing.vo.CarePlanForCopyCarePlansVo vo = create(map, domainObject);

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
	 * Create the ims.nursing.careplans.domain.objects.CarePlan set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractCarePlanSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.CarePlanForCopyCarePlansVoCollection voCollection) 
	 {
	 	return extractCarePlanSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCarePlanSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.CarePlanForCopyCarePlansVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.CarePlanForCopyCarePlansVo vo = voCollection.get(i);
			ims.nursing.careplans.domain.objects.CarePlan domainObject = CarePlanForCopyCarePlansVoAssembler.extractCarePlan(domainFactory, vo, domMap);

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
	 * Create the ims.nursing.careplans.domain.objects.CarePlan list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractCarePlanList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.CarePlanForCopyCarePlansVoCollection voCollection) 
	 {
	 	return extractCarePlanList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCarePlanList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.CarePlanForCopyCarePlansVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.CarePlanForCopyCarePlansVo vo = voCollection.get(i);
			ims.nursing.careplans.domain.objects.CarePlan domainObject = CarePlanForCopyCarePlansVoAssembler.extractCarePlan(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.nursing.careplans.domain.objects.CarePlan object.
	 * @param domainObject ims.nursing.careplans.domain.objects.CarePlan
	 */
	 public static ims.nursing.vo.CarePlanForCopyCarePlansVo create(ims.nursing.careplans.domain.objects.CarePlan domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.nursing.careplans.domain.objects.CarePlan object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.nursing.vo.CarePlanForCopyCarePlansVo create(DomainObjectMap map, ims.nursing.careplans.domain.objects.CarePlan domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.nursing.vo.CarePlanForCopyCarePlansVo valueObject = (ims.nursing.vo.CarePlanForCopyCarePlansVo) map.getValueObject(domainObject, ims.nursing.vo.CarePlanForCopyCarePlansVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.nursing.vo.CarePlanForCopyCarePlansVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.nursing.careplans.domain.objects.CarePlan
	 */
	 public static ims.nursing.vo.CarePlanForCopyCarePlansVo insert(ims.nursing.vo.CarePlanForCopyCarePlansVo valueObject, ims.nursing.careplans.domain.objects.CarePlan domainObject) 
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
	 * @param domainObject ims.nursing.careplans.domain.objects.CarePlan
	 */
	 public static ims.nursing.vo.CarePlanForCopyCarePlansVo insert(DomainObjectMap map, ims.nursing.vo.CarePlanForCopyCarePlansVo valueObject, ims.nursing.careplans.domain.objects.CarePlan domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_CarePlan(domainObject.getId());
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
			
		// Title
		valueObject.setTitle(domainObject.getTitle());
		// Objective
		valueObject.setObjective(domainObject.getObjective());
		// Interventions
		valueObject.setInterventions(ims.nursing.vo.domain.CarePlanInterventionsAssembler.createCarePlanInterventionsCollectionFromCarePlanIntervention(map, domainObject.getInterventions()) );
		// NextEvaluationDate
		java.util.Date NextEvaluationDate = domainObject.getNextEvaluationDate();
		if ( null != NextEvaluationDate ) 
		{
			valueObject.setNextEvaluationDate(new ims.framework.utils.Date(NextEvaluationDate) );
		}
		// NextEvaluationTime
		String NextEvaluationTime = domainObject.getNextEvaluationTime();
		if ( null != NextEvaluationTime ) 
		{
			valueObject.setNextEvaluationTime(new ims.framework.utils.Time(NextEvaluationTime) );
		}
		// Template
		valueObject.setTemplate(ims.nursing.vo.domain.CarePlanTemplateAssembler.create(map, domainObject.getTemplate()) );
		// CarePlanStatus
		valueObject.setCarePlanStatus(ims.nursing.vo.domain.CarePlanStatusAssembler.createCarePlanStatusCollectionFromCarePlanStatus(map, domainObject.getCarePlanStatus()) );
		// CurrentCarePlanStatus
		valueObject.setCurrentCarePlanStatus(ims.nursing.vo.domain.CarePlanStatusAssembler.create(map, domainObject.getCurrentCarePlanStatus()) );
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
		// RecordingInformation
		valueObject.setRecordingInformation(ims.core.vo.domain.RecordingUserInformationVoAssembler.create(map, domainObject.getRecordingInformation()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.nursing.careplans.domain.objects.CarePlan extractCarePlan(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.CarePlanForCopyCarePlansVo valueObject) 
	{
		return 	extractCarePlan(domainFactory, valueObject, new HashMap());
	}

	public static ims.nursing.careplans.domain.objects.CarePlan extractCarePlan(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.CarePlanForCopyCarePlansVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_CarePlan();
		ims.nursing.careplans.domain.objects.CarePlan domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.nursing.careplans.domain.objects.CarePlan)domMap.get(valueObject);
			}
			// ims.nursing.vo.CarePlanForCopyCarePlansVo ID_CarePlan field is unknown
			domainObject = new ims.nursing.careplans.domain.objects.CarePlan();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_CarePlan());
			if (domMap.get(key) != null)
			{
				return (ims.nursing.careplans.domain.objects.CarePlan)domMap.get(key);
			}
			domainObject = (ims.nursing.careplans.domain.objects.CarePlan) domainFactory.getDomainObject(ims.nursing.careplans.domain.objects.CarePlan.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_CarePlan());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTitle() != null && valueObject.getTitle().equals(""))
		{
			valueObject.setTitle(null);
		}
		domainObject.setTitle(valueObject.getTitle());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getObjective() != null && valueObject.getObjective().equals(""))
		{
			valueObject.setObjective(null);
		}
		domainObject.setObjective(valueObject.getObjective());
		domainObject.setInterventions(ims.nursing.vo.domain.CarePlanInterventionsAssembler.extractCarePlanInterventionSet(domainFactory, valueObject.getInterventions(), domainObject.getInterventions(), domMap));		
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getNextEvaluationDate();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setNextEvaluationDate(value4);
		ims.framework.utils.Time time5 = valueObject.getNextEvaluationTime();
		String value5 = null;
		if ( time5 != null ) 
		{
			value5 = time5.toString();
		}
		domainObject.setNextEvaluationTime(value5);
		domainObject.setTemplate(ims.nursing.vo.domain.CarePlanTemplateAssembler.extractCarePlanTemplate(domainFactory, valueObject.getTemplate(), domMap));
		domainObject.setCarePlanStatus(ims.nursing.vo.domain.CarePlanStatusAssembler.extractCarePlanStatusSet(domainFactory, valueObject.getCarePlanStatus(), domainObject.getCarePlanStatus(), domMap));		
		domainObject.setCurrentCarePlanStatus(ims.nursing.vo.domain.CarePlanStatusAssembler.extractCarePlanStatus(domainFactory, valueObject.getCurrentCarePlanStatus(), domMap));
		ims.core.admin.domain.objects.ClinicalContact value9 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value9 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value9 = domainObject.getClinicalContact();	
			}
			else
			{
				value9 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value9);
		ims.core.admin.domain.objects.CareContext value10 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value10 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value10 = domainObject.getCareContext();	
			}
			else
			{
				value10 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value10);
		domainObject.setRecordingInformation(ims.core.vo.domain.RecordingUserInformationVoAssembler.extractRecordingUserInformation(domainFactory, valueObject.getRecordingInformation(), domMap));

		return domainObject;
	}

}
