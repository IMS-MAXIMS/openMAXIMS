//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 12/10/2015, 13:24
 *
 */
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Florin Blindu
 */
public class PreAssessmentOutcomeForWorklistVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.PreAssessmentOutcomeForWorklistVo copy(ims.RefMan.vo.PreAssessmentOutcomeForWorklistVo valueObjectDest, ims.RefMan.vo.PreAssessmentOutcomeForWorklistVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PreAssessmentOutcome(valueObjectSrc.getID_PreAssessmentOutcome());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// WaitingForDetails
		valueObjectDest.setWaitingForDetails(valueObjectSrc.getWaitingForDetails());
		// FitToProceed
		valueObjectDest.setFitToProceed(valueObjectSrc.getFitToProceed());
		// DetailsOutstanding
		valueObjectDest.setDetailsOutstanding(valueObjectSrc.getDetailsOutstanding());
		// PreAssessmentAppointment
		valueObjectDest.setPreAssessmentAppointment(valueObjectSrc.getPreAssessmentAppointment());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPreAssessmentOutcomeForWorklistVoCollectionFromPreAssessmentOutcome(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.PreAssessmentOutcome objects.
	 */
	public static ims.RefMan.vo.PreAssessmentOutcomeForWorklistVoCollection createPreAssessmentOutcomeForWorklistVoCollectionFromPreAssessmentOutcome(java.util.Set domainObjectSet)	
	{
		return createPreAssessmentOutcomeForWorklistVoCollectionFromPreAssessmentOutcome(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.PreAssessmentOutcome objects.
	 */
	public static ims.RefMan.vo.PreAssessmentOutcomeForWorklistVoCollection createPreAssessmentOutcomeForWorklistVoCollectionFromPreAssessmentOutcome(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.PreAssessmentOutcomeForWorklistVoCollection voList = new ims.RefMan.vo.PreAssessmentOutcomeForWorklistVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.PreAssessmentOutcome domainObject = (ims.RefMan.domain.objects.PreAssessmentOutcome) iterator.next();
			ims.RefMan.vo.PreAssessmentOutcomeForWorklistVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.PreAssessmentOutcome objects.
	 */
	public static ims.RefMan.vo.PreAssessmentOutcomeForWorklistVoCollection createPreAssessmentOutcomeForWorklistVoCollectionFromPreAssessmentOutcome(java.util.List domainObjectList) 
	{
		return createPreAssessmentOutcomeForWorklistVoCollectionFromPreAssessmentOutcome(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.PreAssessmentOutcome objects.
	 */
	public static ims.RefMan.vo.PreAssessmentOutcomeForWorklistVoCollection createPreAssessmentOutcomeForWorklistVoCollectionFromPreAssessmentOutcome(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.PreAssessmentOutcomeForWorklistVoCollection voList = new ims.RefMan.vo.PreAssessmentOutcomeForWorklistVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.PreAssessmentOutcome domainObject = (ims.RefMan.domain.objects.PreAssessmentOutcome) domainObjectList.get(i);
			ims.RefMan.vo.PreAssessmentOutcomeForWorklistVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.PreAssessmentOutcome set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPreAssessmentOutcomeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PreAssessmentOutcomeForWorklistVoCollection voCollection) 
	 {
	 	return extractPreAssessmentOutcomeSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPreAssessmentOutcomeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PreAssessmentOutcomeForWorklistVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PreAssessmentOutcomeForWorklistVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.PreAssessmentOutcome domainObject = PreAssessmentOutcomeForWorklistVoAssembler.extractPreAssessmentOutcome(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.PreAssessmentOutcome list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPreAssessmentOutcomeList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PreAssessmentOutcomeForWorklistVoCollection voCollection) 
	 {
	 	return extractPreAssessmentOutcomeList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPreAssessmentOutcomeList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PreAssessmentOutcomeForWorklistVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PreAssessmentOutcomeForWorklistVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.PreAssessmentOutcome domainObject = PreAssessmentOutcomeForWorklistVoAssembler.extractPreAssessmentOutcome(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.PreAssessmentOutcome object.
	 * @param domainObject ims.RefMan.domain.objects.PreAssessmentOutcome
	 */
	 public static ims.RefMan.vo.PreAssessmentOutcomeForWorklistVo create(ims.RefMan.domain.objects.PreAssessmentOutcome domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.PreAssessmentOutcome object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.PreAssessmentOutcomeForWorklistVo create(DomainObjectMap map, ims.RefMan.domain.objects.PreAssessmentOutcome domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.PreAssessmentOutcomeForWorklistVo valueObject = (ims.RefMan.vo.PreAssessmentOutcomeForWorklistVo) map.getValueObject(domainObject, ims.RefMan.vo.PreAssessmentOutcomeForWorklistVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.PreAssessmentOutcomeForWorklistVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.PreAssessmentOutcome
	 */
	 public static ims.RefMan.vo.PreAssessmentOutcomeForWorklistVo insert(ims.RefMan.vo.PreAssessmentOutcomeForWorklistVo valueObject, ims.RefMan.domain.objects.PreAssessmentOutcome domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.PreAssessmentOutcome
	 */
	 public static ims.RefMan.vo.PreAssessmentOutcomeForWorklistVo insert(DomainObjectMap map, ims.RefMan.vo.PreAssessmentOutcomeForWorklistVo valueObject, ims.RefMan.domain.objects.PreAssessmentOutcome domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PreAssessmentOutcome(domainObject.getId());
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
			
		// WaitingForDetails
		valueObject.setWaitingForDetails(ims.RefMan.vo.domain.PreAssessmentInformationVoAssembler.createPreAssessmentInformationVoCollectionFromPreAssessmentInformation(map, domainObject.getWaitingForDetails()) );
		// FitToProceed
		valueObject.setFitToProceed( domainObject.isFitToProceed() );
		// DetailsOutstanding
		valueObject.setDetailsOutstanding( domainObject.isDetailsOutstanding() );
		// PreAssessmentAppointment
		valueObject.setPreAssessmentAppointment(ims.RefMan.vo.domain.BookAppointmentForPreAssessmentWorklistVoAssembler.create(map, domainObject.getPreAssessmentAppointment()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.PreAssessmentOutcome extractPreAssessmentOutcome(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PreAssessmentOutcomeForWorklistVo valueObject) 
	{
		return 	extractPreAssessmentOutcome(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.PreAssessmentOutcome extractPreAssessmentOutcome(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PreAssessmentOutcomeForWorklistVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PreAssessmentOutcome();
		ims.RefMan.domain.objects.PreAssessmentOutcome domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.PreAssessmentOutcome)domMap.get(valueObject);
			}
			// ims.RefMan.vo.PreAssessmentOutcomeForWorklistVo ID_PreAssessmentOutcome field is unknown
			domainObject = new ims.RefMan.domain.objects.PreAssessmentOutcome();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PreAssessmentOutcome());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.PreAssessmentOutcome)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.PreAssessmentOutcome) domainFactory.getDomainObject(ims.RefMan.domain.objects.PreAssessmentOutcome.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PreAssessmentOutcome());


		// SaveAsRefVO treated as RefValueObject
		ims.RefMan.vo.PreAssessmentInformationRefVoCollection refCollection1 = new ims.RefMan.vo.PreAssessmentInformationRefVoCollection();
		if (valueObject.getWaitingForDetails() != null)
		{
			for (int i1=0; i1<valueObject.getWaitingForDetails().size(); i1++)
			{
				ims.RefMan.vo.PreAssessmentInformationRefVo ref1 = (ims.RefMan.vo.PreAssessmentInformationRefVo)valueObject.getWaitingForDetails().get(i1);
				refCollection1.add(ref1);
			}
		}
		int size1 = (null == refCollection1) ? 0 : refCollection1.size();		
		java.util.List domainWaitingForDetails1 = domainObject.getWaitingForDetails();
		if (domainWaitingForDetails1 == null)
		{
			domainWaitingForDetails1 = new java.util.ArrayList();
		}
		for(int i=0; i < size1; i++) 
		{
			ims.RefMan.vo.PreAssessmentInformationRefVo vo = refCollection1.get(i);			
			ims.RefMan.domain.objects.PreAssessmentInformation dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.RefMan.domain.objects.PreAssessmentInformation)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.RefMan.domain.objects.PreAssessmentInformation)domainFactory.getDomainObject( ims.RefMan.domain.objects.PreAssessmentInformation.class, vo.getBoId());
				}
			}

			int domIdx = domainWaitingForDetails1.indexOf(dom);
			if (domIdx == -1)
			{
				domainWaitingForDetails1.add(i, dom);
			}
			else if (i != domIdx && i < domainWaitingForDetails1.size())
			{
				Object tmp = domainWaitingForDetails1.get(i);
				domainWaitingForDetails1.set(i, domainWaitingForDetails1.get(domIdx));
				domainWaitingForDetails1.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1 = domainWaitingForDetails1.size();
		while (i1 > size1)
		{
			domainWaitingForDetails1.remove(i1-1);
			i1 = domainWaitingForDetails1.size();
		}
		
		domainObject.setWaitingForDetails(domainWaitingForDetails1);		
		domainObject.setFitToProceed(valueObject.getFitToProceed());
		domainObject.setDetailsOutstanding(valueObject.getDetailsOutstanding());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.scheduling.domain.objects.Booking_Appointment value4 = null;
		if ( null != valueObject.getPreAssessmentAppointment() ) 
		{
			if (valueObject.getPreAssessmentAppointment().getBoId() == null)
			{
				if (domMap.get(valueObject.getPreAssessmentAppointment()) != null)
				{
					value4 = (ims.scheduling.domain.objects.Booking_Appointment)domMap.get(valueObject.getPreAssessmentAppointment());
				}
			}
			else
			{
				value4 = (ims.scheduling.domain.objects.Booking_Appointment)domainFactory.getDomainObject(ims.scheduling.domain.objects.Booking_Appointment.class, valueObject.getPreAssessmentAppointment().getBoId());
			}
		}
		domainObject.setPreAssessmentAppointment(value4);

		return domainObject;
	}

}
