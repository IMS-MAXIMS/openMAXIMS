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
package ims.ocrr.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Alexie Ursache
 */
public class InvestigationOcsQuestionsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.InvestigationOcsQuestionsVo copy(ims.ocrr.vo.InvestigationOcsQuestionsVo valueObjectDest, ims.ocrr.vo.InvestigationOcsQuestionsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Investigation(valueObjectSrc.getID_Investigation());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AssocQuestions
		valueObjectDest.setAssocQuestions(valueObjectSrc.getAssocQuestions());
		// InvestigationIndex
		valueObjectDest.setInvestigationIndex(valueObjectSrc.getInvestigationIndex());
		// ProviderService
		valueObjectDest.setProviderService(valueObjectSrc.getProviderService());
		// PathInvDetails
		valueObjectDest.setPathInvDetails(valueObjectSrc.getPathInvDetails());
		// EventType
		valueObjectDest.setEventType(valueObjectSrc.getEventType());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createInvestigationOcsQuestionsVoCollectionFromInvestigation(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.configuration.domain.objects.Investigation objects.
	 */
	public static ims.ocrr.vo.InvestigationOcsQuestionsVoCollection createInvestigationOcsQuestionsVoCollectionFromInvestigation(java.util.Set domainObjectSet)	
	{
		return createInvestigationOcsQuestionsVoCollectionFromInvestigation(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.configuration.domain.objects.Investigation objects.
	 */
	public static ims.ocrr.vo.InvestigationOcsQuestionsVoCollection createInvestigationOcsQuestionsVoCollectionFromInvestigation(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.InvestigationOcsQuestionsVoCollection voList = new ims.ocrr.vo.InvestigationOcsQuestionsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ocrr.configuration.domain.objects.Investigation domainObject = (ims.ocrr.configuration.domain.objects.Investigation) iterator.next();
			ims.ocrr.vo.InvestigationOcsQuestionsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.ocrr.configuration.domain.objects.Investigation objects.
	 */
	public static ims.ocrr.vo.InvestigationOcsQuestionsVoCollection createInvestigationOcsQuestionsVoCollectionFromInvestigation(java.util.List domainObjectList) 
	{
		return createInvestigationOcsQuestionsVoCollectionFromInvestigation(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.configuration.domain.objects.Investigation objects.
	 */
	public static ims.ocrr.vo.InvestigationOcsQuestionsVoCollection createInvestigationOcsQuestionsVoCollectionFromInvestigation(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.InvestigationOcsQuestionsVoCollection voList = new ims.ocrr.vo.InvestigationOcsQuestionsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.configuration.domain.objects.Investigation domainObject = (ims.ocrr.configuration.domain.objects.Investigation) domainObjectList.get(i);
			ims.ocrr.vo.InvestigationOcsQuestionsVo vo = create(map, domainObject);

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
	 * Create the ims.ocrr.configuration.domain.objects.Investigation set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractInvestigationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.InvestigationOcsQuestionsVoCollection voCollection) 
	 {
	 	return extractInvestigationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractInvestigationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.InvestigationOcsQuestionsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.InvestigationOcsQuestionsVo vo = voCollection.get(i);
			ims.ocrr.configuration.domain.objects.Investigation domainObject = InvestigationOcsQuestionsVoAssembler.extractInvestigation(domainFactory, vo, domMap);

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
	 * Create the ims.ocrr.configuration.domain.objects.Investigation list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractInvestigationList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.InvestigationOcsQuestionsVoCollection voCollection) 
	 {
	 	return extractInvestigationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractInvestigationList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.InvestigationOcsQuestionsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.InvestigationOcsQuestionsVo vo = voCollection.get(i);
			ims.ocrr.configuration.domain.objects.Investigation domainObject = InvestigationOcsQuestionsVoAssembler.extractInvestigation(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.ocrr.configuration.domain.objects.Investigation object.
	 * @param domainObject ims.ocrr.configuration.domain.objects.Investigation
	 */
	 public static ims.ocrr.vo.InvestigationOcsQuestionsVo create(ims.ocrr.configuration.domain.objects.Investigation domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ocrr.configuration.domain.objects.Investigation object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ocrr.vo.InvestigationOcsQuestionsVo create(DomainObjectMap map, ims.ocrr.configuration.domain.objects.Investigation domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.InvestigationOcsQuestionsVo valueObject = (ims.ocrr.vo.InvestigationOcsQuestionsVo) map.getValueObject(domainObject, ims.ocrr.vo.InvestigationOcsQuestionsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.InvestigationOcsQuestionsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ocrr.configuration.domain.objects.Investigation
	 */
	 public static ims.ocrr.vo.InvestigationOcsQuestionsVo insert(ims.ocrr.vo.InvestigationOcsQuestionsVo valueObject, ims.ocrr.configuration.domain.objects.Investigation domainObject) 
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
	 * @param domainObject ims.ocrr.configuration.domain.objects.Investigation
	 */
	 public static ims.ocrr.vo.InvestigationOcsQuestionsVo insert(DomainObjectMap map, ims.ocrr.vo.InvestigationOcsQuestionsVo valueObject, ims.ocrr.configuration.domain.objects.Investigation domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Investigation(domainObject.getId());
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
			
		// AssocQuestions
		valueObject.setAssocQuestions(ims.ocrr.vo.domain.InvestigationQuestionShortVoAssembler.createInvestigationQuestionShortVoCollectionFromInvestigationQuestion(map, domainObject.getAssocQuestions()) );
		// InvestigationIndex
		valueObject.setInvestigationIndex(ims.ocrr.vo.domain.InvestigationIndexLiteVoAssembler.create(map, domainObject.getInvestigationIndex()) );
		// ProviderService
		valueObject.setProviderService(ims.ocrr.vo.domain.ProviderServiceOcsVoAssembler.create(map, domainObject.getProviderService()) );
		// PathInvDetails
		valueObject.setPathInvDetails(ims.ocrr.vo.domain.PathInvDetailsForNewResultInvestigationVoAssembler.create(map, domainObject.getPathInvDetails()) );
		// EventType
		ims.domain.lookups.LookupInstance instance5 = domainObject.getEventType();
		if ( null != instance5 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance5.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance5.getImage().getImageId(), instance5.getImage().getImagePath());
			}
			color = instance5.getColor();
			if (color != null) 
				color.getValue();

			ims.ocrr.vo.lookups.InvEventType voLookup5 = new ims.ocrr.vo.lookups.InvEventType(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.ocrr.vo.lookups.InvEventType parentVoLookup5 = voLookup5;
			ims.domain.lookups.LookupInstance parent5 = instance5.getParent();
			while (parent5 != null)
			{
				if (parent5.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent5.getImage().getImageId(), parent5.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent5.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup5.setParent(new ims.ocrr.vo.lookups.InvEventType(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setEventType(voLookup5);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.configuration.domain.objects.Investigation extractInvestigation(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.InvestigationOcsQuestionsVo valueObject) 
	{
		return 	extractInvestigation(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.configuration.domain.objects.Investigation extractInvestigation(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.InvestigationOcsQuestionsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Investigation();
		ims.ocrr.configuration.domain.objects.Investigation domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ocrr.configuration.domain.objects.Investigation)domMap.get(valueObject);
			}
			// ims.ocrr.vo.InvestigationOcsQuestionsVo ID_Investigation field is unknown
			domainObject = new ims.ocrr.configuration.domain.objects.Investigation();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Investigation());
			if (domMap.get(key) != null)
			{
				return (ims.ocrr.configuration.domain.objects.Investigation)domMap.get(key);
			}
			domainObject = (ims.ocrr.configuration.domain.objects.Investigation) domainFactory.getDomainObject(ims.ocrr.configuration.domain.objects.Investigation.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Investigation());

		domainObject.setAssocQuestions(ims.ocrr.vo.domain.InvestigationQuestionShortVoAssembler.extractInvestigationQuestionList(domainFactory, valueObject.getAssocQuestions(), domainObject.getAssocQuestions(), domMap));		
		domainObject.setInvestigationIndex(ims.ocrr.vo.domain.InvestigationIndexLiteVoAssembler.extractInvestigationIndex(domainFactory, valueObject.getInvestigationIndex(), domMap));
		domainObject.setProviderService(ims.ocrr.vo.domain.ProviderServiceOcsVoAssembler.extractLocSvcProviderSys(domainFactory, valueObject.getProviderService(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.ocrr.configuration.domain.objects.PathInvDetails value4 = null;
		if ( null != valueObject.getPathInvDetails() ) 
		{
			if (valueObject.getPathInvDetails().getBoId() == null)
			{
				if (domMap.get(valueObject.getPathInvDetails()) != null)
				{
					value4 = (ims.ocrr.configuration.domain.objects.PathInvDetails)domMap.get(valueObject.getPathInvDetails());
				}
			}
			else
			{
				value4 = (ims.ocrr.configuration.domain.objects.PathInvDetails)domainFactory.getDomainObject(ims.ocrr.configuration.domain.objects.PathInvDetails.class, valueObject.getPathInvDetails().getBoId());
			}
		}
		domainObject.setPathInvDetails(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getEventType() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getEventType().getID());
		}
		domainObject.setEventType(value5);

		return domainObject;
	}

}
