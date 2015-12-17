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
package ims.nursing.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Alexie Ursache
 */
public class PlanOfCareVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.nursing.vo.PlanOfCareVo copy(ims.nursing.vo.PlanOfCareVo valueObjectDest, ims.nursing.vo.PlanOfCareVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PlanOfCare(valueObjectSrc.getID_PlanOfCare());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// StartHCP
		valueObjectDest.setStartHCP(valueObjectSrc.getStartHCP());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// ResolvingHCP
		valueObjectDest.setResolvingHCP(valueObjectSrc.getResolvingHCP());
		// ConfirmingDateTime
		valueObjectDest.setConfirmingDateTime(valueObjectSrc.getConfirmingDateTime());
		// ConfirmingHCP
		valueObjectDest.setConfirmingHCP(valueObjectSrc.getConfirmingHCP());
		// AnswerHistory
		valueObjectDest.setAnswerHistory(valueObjectSrc.getAnswerHistory());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// Actions
		valueObjectDest.setActions(valueObjectSrc.getActions());
		// Group
		valueObjectDest.setGroup(valueObjectSrc.getGroup());
		// Title
		valueObjectDest.setTitle(valueObjectSrc.getTitle());
		// StartDateTime
		valueObjectDest.setStartDateTime(valueObjectSrc.getStartDateTime());
		// ResolvedDateTime
		valueObjectDest.setResolvedDateTime(valueObjectSrc.getResolvedDateTime());
		// AssessmentQuestion
		valueObjectDest.setAssessmentQuestion(valueObjectSrc.getAssessmentQuestion());
		// LevelOfIntervention
		valueObjectDest.setLevelOfIntervention(valueObjectSrc.getLevelOfIntervention());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPlanOfCareVoCollectionFromPlanOfCare(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.nursing.domain.objects.PlanOfCare objects.
	 */
	public static ims.nursing.vo.PlanOfCareVoCollection createPlanOfCareVoCollectionFromPlanOfCare(java.util.Set domainObjectSet)	
	{
		return createPlanOfCareVoCollectionFromPlanOfCare(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.nursing.domain.objects.PlanOfCare objects.
	 */
	public static ims.nursing.vo.PlanOfCareVoCollection createPlanOfCareVoCollectionFromPlanOfCare(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.nursing.vo.PlanOfCareVoCollection voList = new ims.nursing.vo.PlanOfCareVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.nursing.domain.objects.PlanOfCare domainObject = (ims.nursing.domain.objects.PlanOfCare) iterator.next();
			ims.nursing.vo.PlanOfCareVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.nursing.domain.objects.PlanOfCare objects.
	 */
	public static ims.nursing.vo.PlanOfCareVoCollection createPlanOfCareVoCollectionFromPlanOfCare(java.util.List domainObjectList) 
	{
		return createPlanOfCareVoCollectionFromPlanOfCare(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.nursing.domain.objects.PlanOfCare objects.
	 */
	public static ims.nursing.vo.PlanOfCareVoCollection createPlanOfCareVoCollectionFromPlanOfCare(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.nursing.vo.PlanOfCareVoCollection voList = new ims.nursing.vo.PlanOfCareVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.nursing.domain.objects.PlanOfCare domainObject = (ims.nursing.domain.objects.PlanOfCare) domainObjectList.get(i);
			ims.nursing.vo.PlanOfCareVo vo = create(map, domainObject);

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
	 * Create the ims.nursing.domain.objects.PlanOfCare set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPlanOfCareSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PlanOfCareVoCollection voCollection) 
	 {
	 	return extractPlanOfCareSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPlanOfCareSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PlanOfCareVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.PlanOfCareVo vo = voCollection.get(i);
			ims.nursing.domain.objects.PlanOfCare domainObject = PlanOfCareVoAssembler.extractPlanOfCare(domainFactory, vo, domMap);

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
	 * Create the ims.nursing.domain.objects.PlanOfCare list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPlanOfCareList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PlanOfCareVoCollection voCollection) 
	 {
	 	return extractPlanOfCareList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPlanOfCareList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PlanOfCareVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.PlanOfCareVo vo = voCollection.get(i);
			ims.nursing.domain.objects.PlanOfCare domainObject = PlanOfCareVoAssembler.extractPlanOfCare(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.nursing.domain.objects.PlanOfCare object.
	 * @param domainObject ims.nursing.domain.objects.PlanOfCare
	 */
	 public static ims.nursing.vo.PlanOfCareVo create(ims.nursing.domain.objects.PlanOfCare domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.nursing.domain.objects.PlanOfCare object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.nursing.vo.PlanOfCareVo create(DomainObjectMap map, ims.nursing.domain.objects.PlanOfCare domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.nursing.vo.PlanOfCareVo valueObject = (ims.nursing.vo.PlanOfCareVo) map.getValueObject(domainObject, ims.nursing.vo.PlanOfCareVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.nursing.vo.PlanOfCareVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.nursing.domain.objects.PlanOfCare
	 */
	 public static ims.nursing.vo.PlanOfCareVo insert(ims.nursing.vo.PlanOfCareVo valueObject, ims.nursing.domain.objects.PlanOfCare domainObject) 
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
	 * @param domainObject ims.nursing.domain.objects.PlanOfCare
	 */
	 public static ims.nursing.vo.PlanOfCareVo insert(DomainObjectMap map, ims.nursing.vo.PlanOfCareVo valueObject, ims.nursing.domain.objects.PlanOfCare domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PlanOfCare(domainObject.getId());
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
		// StartHCP
		valueObject.setStartHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getStartHCP()) );
		// Status
		ims.domain.lookups.LookupInstance instance4 = domainObject.getStatus();
		if ( null != instance4 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance4.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance4.getImage().getImageId(), instance4.getImage().getImagePath());
			}
			color = instance4.getColor();
			if (color != null) 
				color.getValue();

			ims.nursing.vo.lookups.PlanOfCareStatus voLookup4 = new ims.nursing.vo.lookups.PlanOfCareStatus(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.nursing.vo.lookups.PlanOfCareStatus parentVoLookup4 = voLookup4;
			ims.domain.lookups.LookupInstance parent4 = instance4.getParent();
			while (parent4 != null)
			{
				if (parent4.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent4.getImage().getImageId(), parent4.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent4.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup4.setParent(new ims.nursing.vo.lookups.PlanOfCareStatus(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setStatus(voLookup4);
		}
				// ResolvingHCP
		valueObject.setResolvingHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getResolvingHCP()) );
		// ConfirmingDateTime
		java.util.Date ConfirmingDateTime = domainObject.getConfirmingDateTime();
		if ( null != ConfirmingDateTime ) 
		{
			valueObject.setConfirmingDateTime(new ims.framework.utils.DateTime(ConfirmingDateTime) );
		}
		// ConfirmingHCP
		valueObject.setConfirmingHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getConfirmingHCP()) );
		// AnswerHistory
		valueObject.setAnswerHistory(ims.nursing.vo.domain.PlanOfCareHistoryVoAssembler.createPlanOfCareHistoryVoCollectionFromPlanOfCareHistory(map, domainObject.getAnswerHistory()) );
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// Actions
		valueObject.setActions(ims.nursing.vo.domain.PlanOfCareActionsVoAssembler.createPlanOfCareActionsVoCollectionFromPlanOfCareActions(map, domainObject.getActions()) );
		// Group
		ims.domain.lookups.LookupInstance instance11 = domainObject.getGroup();
		if ( null != instance11 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance11.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance11.getImage().getImageId(), instance11.getImage().getImagePath());
			}
			color = instance11.getColor();
			if (color != null) 
				color.getValue();

			ims.clinical.vo.lookups.PlanOfCareGroupings voLookup11 = new ims.clinical.vo.lookups.PlanOfCareGroupings(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.clinical.vo.lookups.PlanOfCareGroupings parentVoLookup11 = voLookup11;
			ims.domain.lookups.LookupInstance parent11 = instance11.getParent();
			while (parent11 != null)
			{
				if (parent11.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent11.getImage().getImageId(), parent11.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent11.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup11.setParent(new ims.clinical.vo.lookups.PlanOfCareGroupings(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setGroup(voLookup11);
		}
				// Title
		valueObject.setTitle(domainObject.getTitle());
		// StartDateTime
		java.util.Date StartDateTime = domainObject.getStartDateTime();
		if ( null != StartDateTime ) 
		{
			valueObject.setStartDateTime(new ims.framework.utils.DateTime(StartDateTime) );
		}
		// ResolvedDateTime
		java.util.Date ResolvedDateTime = domainObject.getResolvedDateTime();
		if ( null != ResolvedDateTime ) 
		{
			valueObject.setResolvedDateTime(new ims.framework.utils.DateTime(ResolvedDateTime) );
		}
		// AssessmentQuestion
		valueObject.setAssessmentQuestion(ims.core.vo.domain.AssessmentQuestionShortVoAssembler.create(map, domainObject.getAssessmentQuestion()) );
		// LevelOfIntervention
		valueObject.setLevelOfIntervention(domainObject.getLevelOfIntervention());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.nursing.domain.objects.PlanOfCare extractPlanOfCare(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PlanOfCareVo valueObject) 
	{
		return 	extractPlanOfCare(domainFactory, valueObject, new HashMap());
	}

	public static ims.nursing.domain.objects.PlanOfCare extractPlanOfCare(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PlanOfCareVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PlanOfCare();
		ims.nursing.domain.objects.PlanOfCare domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.nursing.domain.objects.PlanOfCare)domMap.get(valueObject);
			}
			// ims.nursing.vo.PlanOfCareVo ID_PlanOfCare field is unknown
			domainObject = new ims.nursing.domain.objects.PlanOfCare();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PlanOfCare());
			if (domMap.get(key) != null)
			{
				return (ims.nursing.domain.objects.PlanOfCare)domMap.get(key);
			}
			domainObject = (ims.nursing.domain.objects.PlanOfCare) domainFactory.getDomainObject(ims.nursing.domain.objects.PlanOfCare.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PlanOfCare());

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
		domainObject.setStartHCP(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getStartHCP(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value4);
		domainObject.setResolvingHCP(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getResolvingHCP(), domMap));
		ims.framework.utils.DateTime dateTime6 = valueObject.getConfirmingDateTime();
		java.util.Date value6 = null;
		if ( dateTime6 != null ) 
		{
			value6 = dateTime6.getJavaDate();
		}
		domainObject.setConfirmingDateTime(value6);
		domainObject.setConfirmingHCP(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getConfirmingHCP(), domMap));
		domainObject.setAnswerHistory(ims.nursing.vo.domain.PlanOfCareHistoryVoAssembler.extractPlanOfCareHistorySet(domainFactory, valueObject.getAnswerHistory(), domainObject.getAnswerHistory(), domMap));		
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		domainObject.setActions(ims.nursing.vo.domain.PlanOfCareActionsVoAssembler.extractPlanOfCareActionsSet(domainFactory, valueObject.getActions(), domainObject.getActions(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getGroup() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getGroup().getID());
		}
		domainObject.setGroup(value11);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTitle() != null && valueObject.getTitle().equals(""))
		{
			valueObject.setTitle(null);
		}
		domainObject.setTitle(valueObject.getTitle());
		ims.framework.utils.DateTime dateTime13 = valueObject.getStartDateTime();
		java.util.Date value13 = null;
		if ( dateTime13 != null ) 
		{
			value13 = dateTime13.getJavaDate();
		}
		domainObject.setStartDateTime(value13);
		ims.framework.utils.DateTime dateTime14 = valueObject.getResolvedDateTime();
		java.util.Date value14 = null;
		if ( dateTime14 != null ) 
		{
			value14 = dateTime14.getJavaDate();
		}
		domainObject.setResolvedDateTime(value14);
		domainObject.setAssessmentQuestion(ims.core.vo.domain.AssessmentQuestionShortVoAssembler.extractAssessmentQuestion(domainFactory, valueObject.getAssessmentQuestion(), domMap));
		domainObject.setLevelOfIntervention(valueObject.getLevelOfIntervention());

		return domainObject;
	}

}
