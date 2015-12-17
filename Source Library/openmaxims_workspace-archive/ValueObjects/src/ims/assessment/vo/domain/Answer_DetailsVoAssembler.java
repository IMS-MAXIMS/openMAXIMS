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
package ims.assessment.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class Answer_DetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.assessment.vo.Answer_DetailsVo copy(ims.assessment.vo.Answer_DetailsVo valueObjectDest, ims.assessment.vo.Answer_DetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientAnswerDetails(valueObjectSrc.getID_PatientAnswerDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AnswerType
		valueObjectDest.setAnswerType(valueObjectSrc.getAnswerType());
		// AnswerWidth
		valueObjectDest.setAnswerWidth(valueObjectSrc.getAnswerWidth());
		// MaxMultiselectAllowed
		valueObjectDest.setMaxMultiselectAllowed(valueObjectSrc.getMaxMultiselectAllowed());
		// MultiSelectAnswers
		valueObjectDest.setMultiSelectAnswers(valueObjectSrc.getMultiSelectAnswers());
		// BoolValueAnswer
		valueObjectDest.setBoolValueAnswer(valueObjectSrc.getBoolValueAnswer());
		// Picklist
		valueObjectDest.setPicklist(valueObjectSrc.getPicklist());
		// CalculatedScore
		valueObjectDest.setCalculatedScore(valueObjectSrc.getCalculatedScore());
		// DateAnswer
		valueObjectDest.setDateAnswer(valueObjectSrc.getDateAnswer());
		// TimeAnswer
		valueObjectDest.setTimeAnswer(valueObjectSrc.getTimeAnswer());
		// StringAnswer
		valueObjectDest.setStringAnswer(valueObjectSrc.getStringAnswer());
		// IntegerAnswer
		valueObjectDest.setIntegerAnswer(valueObjectSrc.getIntegerAnswer());
		// DecimalAnswer
		valueObjectDest.setDecimalAnswer(valueObjectSrc.getDecimalAnswer());
		// PartialDate
		valueObjectDest.setPartialDate(valueObjectSrc.getPartialDate());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createAnswer_DetailsVoCollectionFromPatientAnswerDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.assessment.instantiation.domain.objects.PatientAnswerDetails objects.
	 */
	public static ims.assessment.vo.Answer_DetailsVoCollection createAnswer_DetailsVoCollectionFromPatientAnswerDetails(java.util.Set domainObjectSet)	
	{
		return createAnswer_DetailsVoCollectionFromPatientAnswerDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.assessment.instantiation.domain.objects.PatientAnswerDetails objects.
	 */
	public static ims.assessment.vo.Answer_DetailsVoCollection createAnswer_DetailsVoCollectionFromPatientAnswerDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.assessment.vo.Answer_DetailsVoCollection voList = new ims.assessment.vo.Answer_DetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.assessment.instantiation.domain.objects.PatientAnswerDetails domainObject = (ims.assessment.instantiation.domain.objects.PatientAnswerDetails) iterator.next();
			ims.assessment.vo.Answer_DetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.assessment.instantiation.domain.objects.PatientAnswerDetails objects.
	 */
	public static ims.assessment.vo.Answer_DetailsVoCollection createAnswer_DetailsVoCollectionFromPatientAnswerDetails(java.util.List domainObjectList) 
	{
		return createAnswer_DetailsVoCollectionFromPatientAnswerDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.assessment.instantiation.domain.objects.PatientAnswerDetails objects.
	 */
	public static ims.assessment.vo.Answer_DetailsVoCollection createAnswer_DetailsVoCollectionFromPatientAnswerDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.assessment.vo.Answer_DetailsVoCollection voList = new ims.assessment.vo.Answer_DetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.assessment.instantiation.domain.objects.PatientAnswerDetails domainObject = (ims.assessment.instantiation.domain.objects.PatientAnswerDetails) domainObjectList.get(i);
			ims.assessment.vo.Answer_DetailsVo vo = create(map, domainObject);

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
	 * Create the ims.assessment.instantiation.domain.objects.PatientAnswerDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientAnswerDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Answer_DetailsVoCollection voCollection) 
	 {
	 	return extractPatientAnswerDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientAnswerDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Answer_DetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.assessment.vo.Answer_DetailsVo vo = voCollection.get(i);
			ims.assessment.instantiation.domain.objects.PatientAnswerDetails domainObject = Answer_DetailsVoAssembler.extractPatientAnswerDetails(domainFactory, vo, domMap);

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
	 * Create the ims.assessment.instantiation.domain.objects.PatientAnswerDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientAnswerDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Answer_DetailsVoCollection voCollection) 
	 {
	 	return extractPatientAnswerDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientAnswerDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Answer_DetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.assessment.vo.Answer_DetailsVo vo = voCollection.get(i);
			ims.assessment.instantiation.domain.objects.PatientAnswerDetails domainObject = Answer_DetailsVoAssembler.extractPatientAnswerDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.assessment.instantiation.domain.objects.PatientAnswerDetails object.
	 * @param domainObject ims.assessment.instantiation.domain.objects.PatientAnswerDetails
	 */
	 public static ims.assessment.vo.Answer_DetailsVo create(ims.assessment.instantiation.domain.objects.PatientAnswerDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.assessment.instantiation.domain.objects.PatientAnswerDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.assessment.vo.Answer_DetailsVo create(DomainObjectMap map, ims.assessment.instantiation.domain.objects.PatientAnswerDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.assessment.vo.Answer_DetailsVo valueObject = (ims.assessment.vo.Answer_DetailsVo) map.getValueObject(domainObject, ims.assessment.vo.Answer_DetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.assessment.vo.Answer_DetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.assessment.instantiation.domain.objects.PatientAnswerDetails
	 */
	 public static ims.assessment.vo.Answer_DetailsVo insert(ims.assessment.vo.Answer_DetailsVo valueObject, ims.assessment.instantiation.domain.objects.PatientAnswerDetails domainObject) 
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
	 * @param domainObject ims.assessment.instantiation.domain.objects.PatientAnswerDetails
	 */
	 public static ims.assessment.vo.Answer_DetailsVo insert(DomainObjectMap map, ims.assessment.vo.Answer_DetailsVo valueObject, ims.assessment.instantiation.domain.objects.PatientAnswerDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientAnswerDetails(domainObject.getId());
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
			
		// AnswerType
		valueObject.setAnswerType(ims.assessment.vo.domain.Question_AnswerTypeVoAssembler.create(map, domainObject.getAnswerType()) );
		// AnswerWidth
		valueObject.setAnswerWidth(domainObject.getAnswerWidth());
		// MaxMultiselectAllowed
		valueObject.setMaxMultiselectAllowed(domainObject.getMaxMultiselectAllowed());
		// MultiSelectAnswers
		valueObject.setMultiSelectAnswers(ims.assessment.vo.domain.Answer_OptionVoAssembler.createAnswer_OptionVoCollectionFromAnswerOption(map, domainObject.getMultiSelectAnswers()) );
		// BoolValueAnswer
		valueObject.setBoolValueAnswer( domainObject.isBoolValueAnswer() );
		// Picklist
		valueObject.setPicklist(ims.assessment.vo.domain.Answer_OptionVoAssembler.create(map, domainObject.getPicklist()) );
		// CalculatedScore
		valueObject.setCalculatedScore(domainObject.getCalculatedScore());
		// DateAnswer
		java.util.Date DateAnswer = domainObject.getDateAnswer();
		if ( null != DateAnswer ) 
		{
			valueObject.setDateAnswer(new ims.framework.utils.Date(DateAnswer) );
		}
		// TimeAnswer
		String TimeAnswer = domainObject.getTimeAnswer();
		if ( null != TimeAnswer ) 
		{
			valueObject.setTimeAnswer(new ims.framework.utils.Time(TimeAnswer) );
		}
		// StringAnswer
		valueObject.setStringAnswer(domainObject.getStringAnswer());
		// IntegerAnswer
		valueObject.setIntegerAnswer(domainObject.getIntegerAnswer());
		// DecimalAnswer
		valueObject.setDecimalAnswer(domainObject.getDecimalAnswer());
		// PartialDate
		Integer PartialDate = domainObject.getPartialDate();
		if ( null != PartialDate ) 
		{
			valueObject.setPartialDate(new ims.framework.utils.PartialDate(PartialDate) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.assessment.instantiation.domain.objects.PatientAnswerDetails extractPatientAnswerDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Answer_DetailsVo valueObject) 
	{
		return 	extractPatientAnswerDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.assessment.instantiation.domain.objects.PatientAnswerDetails extractPatientAnswerDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Answer_DetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientAnswerDetails();
		ims.assessment.instantiation.domain.objects.PatientAnswerDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.assessment.instantiation.domain.objects.PatientAnswerDetails)domMap.get(valueObject);
			}
			// ims.assessment.vo.Answer_DetailsVo ID_PatientAnswerDetails field is unknown
			domainObject = new ims.assessment.instantiation.domain.objects.PatientAnswerDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientAnswerDetails());
			if (domMap.get(key) != null)
			{
				return (ims.assessment.instantiation.domain.objects.PatientAnswerDetails)domMap.get(key);
			}
			domainObject = (ims.assessment.instantiation.domain.objects.PatientAnswerDetails) domainFactory.getDomainObject(ims.assessment.instantiation.domain.objects.PatientAnswerDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientAnswerDetails());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.QuestionAnswerType value1 = null;
		if ( null != valueObject.getAnswerType() ) 
		{
			if (valueObject.getAnswerType().getBoId() == null)
			{
				if (domMap.get(valueObject.getAnswerType()) != null)
				{
					value1 = (ims.core.clinical.domain.objects.QuestionAnswerType)domMap.get(valueObject.getAnswerType());
				}
			}
			else
			{
				value1 = (ims.core.clinical.domain.objects.QuestionAnswerType)domainFactory.getDomainObject(ims.core.clinical.domain.objects.QuestionAnswerType.class, valueObject.getAnswerType().getBoId());
			}
		}
		domainObject.setAnswerType(value1);
		domainObject.setAnswerWidth(valueObject.getAnswerWidth());
		domainObject.setMaxMultiselectAllowed(valueObject.getMaxMultiselectAllowed());

		// SaveAsRefVO treated as RefValueObject
		ims.core.clinical.vo.AnswerOptionRefVoCollection refCollection4 = new ims.core.clinical.vo.AnswerOptionRefVoCollection();
		if (valueObject.getMultiSelectAnswers() != null)
		{
			for (int i4=0; i4<valueObject.getMultiSelectAnswers().size(); i4++)
			{
				ims.core.clinical.vo.AnswerOptionRefVo ref4 = (ims.core.clinical.vo.AnswerOptionRefVo)valueObject.getMultiSelectAnswers().get(i4);
				refCollection4.add(ref4);
			}
		}
		int size4 = (null == refCollection4) ? 0 : refCollection4.size();		
		java.util.Set domainMultiSelectAnswers4 = domainObject.getMultiSelectAnswers();
		if (domainMultiSelectAnswers4 == null)
		{
			domainMultiSelectAnswers4 = new java.util.HashSet();
		}
		java.util.Set newSet4  = new java.util.HashSet();
		for(int i=0; i<size4; i++) 
		{
			ims.core.clinical.vo.AnswerOptionRefVo vo = refCollection4.get(i);					
			ims.core.clinical.domain.objects.AnswerOption dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.clinical.domain.objects.AnswerOption)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.clinical.domain.objects.AnswerOption)domainFactory.getDomainObject( ims.core.clinical.domain.objects.AnswerOption.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainMultiSelectAnswers4.contains(dom))
			{
				domainMultiSelectAnswers4.add(dom);
			}
			newSet4.add(dom);			
		}
		java.util.Set removedSet4 = new java.util.HashSet();
		java.util.Iterator iter4 = domainMultiSelectAnswers4.iterator();
		//Find out which objects need to be removed
		while (iter4.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter4.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet4.contains(o))
			{
				removedSet4.add(o);
			}
		}
		iter4 = removedSet4.iterator();
		//Remove the unwanted objects
		while (iter4.hasNext())
		{
			domainMultiSelectAnswers4.remove(iter4.next());
		}		
		
		domainObject.setMultiSelectAnswers(domainMultiSelectAnswers4);		
		domainObject.setBoolValueAnswer(valueObject.getBoolValueAnswer());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.AnswerOption value6 = null;
		if ( null != valueObject.getPicklist() ) 
		{
			if (valueObject.getPicklist().getBoId() == null)
			{
				if (domMap.get(valueObject.getPicklist()) != null)
				{
					value6 = (ims.core.clinical.domain.objects.AnswerOption)domMap.get(valueObject.getPicklist());
				}
			}
			else
			{
				value6 = (ims.core.clinical.domain.objects.AnswerOption)domainFactory.getDomainObject(ims.core.clinical.domain.objects.AnswerOption.class, valueObject.getPicklist().getBoId());
			}
		}
		domainObject.setPicklist(value6);
		domainObject.setCalculatedScore(valueObject.getCalculatedScore());
		java.util.Date value8 = null;
		ims.framework.utils.Date date8 = valueObject.getDateAnswer();		
		if ( date8 != null ) 
		{
			value8 = date8.getDate();
		}
		domainObject.setDateAnswer(value8);
		ims.framework.utils.Time time9 = valueObject.getTimeAnswer();
		String value9 = null;
		if ( time9 != null ) 
		{
			value9 = time9.toString();
		}
		domainObject.setTimeAnswer(value9);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getStringAnswer() != null && valueObject.getStringAnswer().equals(""))
		{
			valueObject.setStringAnswer(null);
		}
		domainObject.setStringAnswer(valueObject.getStringAnswer());
		domainObject.setIntegerAnswer(valueObject.getIntegerAnswer());
		domainObject.setDecimalAnswer(valueObject.getDecimalAnswer());
		ims.framework.utils.PartialDate PartialDate = valueObject.getPartialDate();
		Integer value13 = null;
		if ( null != PartialDate ) 
		{
			value13 = PartialDate.toInteger();
		}
		domainObject.setPartialDate(value13);

		return domainObject;
	}

}
