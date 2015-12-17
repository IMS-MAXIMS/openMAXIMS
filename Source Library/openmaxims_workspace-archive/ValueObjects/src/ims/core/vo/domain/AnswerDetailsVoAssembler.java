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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Marius Mihalec
 */
public class AnswerDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.AnswerDetailsVo copy(ims.core.vo.AnswerDetailsVo valueObjectDest, ims.core.vo.AnswerDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientAnswerDetails(valueObjectSrc.getID_PatientAnswerDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AnswerType
		valueObjectDest.setAnswerType(valueObjectSrc.getAnswerType());
		// MultiSelectAnswers
		valueObjectDest.setMultiSelectAnswers(valueObjectSrc.getMultiSelectAnswers());
		// Picklist
		valueObjectDest.setPicklist(valueObjectSrc.getPicklist());
		// CalculatedScore
		valueObjectDest.setCalculatedScore(valueObjectSrc.getCalculatedScore());
		// BoolValueAnswer
		valueObjectDest.setBoolValueAnswer(valueObjectSrc.getBoolValueAnswer());
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
		// MaxMultiselectAllowed
		valueObjectDest.setMaxMultiselectAllowed(valueObjectSrc.getMaxMultiselectAllowed());
		// AnswerWidth
		valueObjectDest.setAnswerWidth(valueObjectSrc.getAnswerWidth());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createAnswerDetailsVoCollectionFromPatientAnswerDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.assessment.instantiation.domain.objects.PatientAnswerDetails objects.
	 */
	public static ims.core.vo.AnswerDetailsVoCollection createAnswerDetailsVoCollectionFromPatientAnswerDetails(java.util.Set domainObjectSet)	
	{
		return createAnswerDetailsVoCollectionFromPatientAnswerDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.assessment.instantiation.domain.objects.PatientAnswerDetails objects.
	 */
	public static ims.core.vo.AnswerDetailsVoCollection createAnswerDetailsVoCollectionFromPatientAnswerDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.AnswerDetailsVoCollection voList = new ims.core.vo.AnswerDetailsVoCollection();
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
			ims.core.vo.AnswerDetailsVo vo = create(map, domainObject);
			
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
	public static ims.core.vo.AnswerDetailsVoCollection createAnswerDetailsVoCollectionFromPatientAnswerDetails(java.util.List domainObjectList) 
	{
		return createAnswerDetailsVoCollectionFromPatientAnswerDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.assessment.instantiation.domain.objects.PatientAnswerDetails objects.
	 */
	public static ims.core.vo.AnswerDetailsVoCollection createAnswerDetailsVoCollectionFromPatientAnswerDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.AnswerDetailsVoCollection voList = new ims.core.vo.AnswerDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.assessment.instantiation.domain.objects.PatientAnswerDetails domainObject = (ims.assessment.instantiation.domain.objects.PatientAnswerDetails) domainObjectList.get(i);
			ims.core.vo.AnswerDetailsVo vo = create(map, domainObject);

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
	 public static java.util.Set extractPatientAnswerDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.AnswerDetailsVoCollection voCollection) 
	 {
	 	return extractPatientAnswerDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientAnswerDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.AnswerDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.AnswerDetailsVo vo = voCollection.get(i);
			ims.assessment.instantiation.domain.objects.PatientAnswerDetails domainObject = AnswerDetailsVoAssembler.extractPatientAnswerDetails(domainFactory, vo, domMap);

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
	 public static java.util.List extractPatientAnswerDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.AnswerDetailsVoCollection voCollection) 
	 {
	 	return extractPatientAnswerDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientAnswerDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.AnswerDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.AnswerDetailsVo vo = voCollection.get(i);
			ims.assessment.instantiation.domain.objects.PatientAnswerDetails domainObject = AnswerDetailsVoAssembler.extractPatientAnswerDetails(domainFactory, vo, domMap);

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
	 public static ims.core.vo.AnswerDetailsVo create(ims.assessment.instantiation.domain.objects.PatientAnswerDetails domainObject) 
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
	  public static ims.core.vo.AnswerDetailsVo create(DomainObjectMap map, ims.assessment.instantiation.domain.objects.PatientAnswerDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.AnswerDetailsVo valueObject = (ims.core.vo.AnswerDetailsVo) map.getValueObject(domainObject, ims.core.vo.AnswerDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.AnswerDetailsVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.core.vo.AnswerDetailsVo insert(ims.core.vo.AnswerDetailsVo valueObject, ims.assessment.instantiation.domain.objects.PatientAnswerDetails domainObject) 
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
	 public static ims.core.vo.AnswerDetailsVo insert(DomainObjectMap map, ims.core.vo.AnswerDetailsVo valueObject, ims.assessment.instantiation.domain.objects.PatientAnswerDetails domainObject) 
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
		valueObject.setAnswerType(ims.core.vo.domain.QuestionAnswerTypeVoAssembler.create(map, domainObject.getAnswerType()) );
		// MultiSelectAnswers
		valueObject.setMultiSelectAnswers(ims.core.vo.domain.AnswerOptionVoAssembler.createAnswerOptionVoCollectionFromAnswerOption(map, domainObject.getMultiSelectAnswers()) );
		// Picklist
		valueObject.setPicklist(ims.core.vo.domain.AnswerOptionVoAssembler.create(map, domainObject.getPicklist()) );
		// CalculatedScore
		valueObject.setCalculatedScore(domainObject.getCalculatedScore());
		// BoolValueAnswer
		valueObject.setBoolValueAnswer( domainObject.isBoolValueAnswer() );
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
		// MaxMultiselectAllowed
		valueObject.setMaxMultiselectAllowed(domainObject.getMaxMultiselectAllowed());
		// AnswerWidth
		valueObject.setAnswerWidth(domainObject.getAnswerWidth());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.assessment.instantiation.domain.objects.PatientAnswerDetails extractPatientAnswerDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.AnswerDetailsVo valueObject) 
	{
		return 	extractPatientAnswerDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.assessment.instantiation.domain.objects.PatientAnswerDetails extractPatientAnswerDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.AnswerDetailsVo valueObject, HashMap domMap) 
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
			// ims.core.vo.AnswerDetailsVo ID_PatientAnswerDetails field is unknown
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

		// SaveAsRefVO treated as RefValueObject
		ims.core.clinical.vo.AnswerOptionRefVoCollection refCollection2 = new ims.core.clinical.vo.AnswerOptionRefVoCollection();
		if (valueObject.getMultiSelectAnswers() != null)
		{
			for (int i2=0; i2<valueObject.getMultiSelectAnswers().size(); i2++)
			{
				ims.core.clinical.vo.AnswerOptionRefVo ref2 = (ims.core.clinical.vo.AnswerOptionRefVo)valueObject.getMultiSelectAnswers().get(i2);
				refCollection2.add(ref2);
			}
		}
		int size2 = (null == refCollection2) ? 0 : refCollection2.size();		
		java.util.Set domainMultiSelectAnswers2 = domainObject.getMultiSelectAnswers();
		if (domainMultiSelectAnswers2 == null)
		{
			domainMultiSelectAnswers2 = new java.util.HashSet();
		}
		java.util.Set newSet2  = new java.util.HashSet();
		for(int i=0; i<size2; i++) 
		{
			ims.core.clinical.vo.AnswerOptionRefVo vo = refCollection2.get(i);					
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
			if (!domainMultiSelectAnswers2.contains(dom))
			{
				domainMultiSelectAnswers2.add(dom);
			}
			newSet2.add(dom);			
		}
		java.util.Set removedSet2 = new java.util.HashSet();
		java.util.Iterator iter2 = domainMultiSelectAnswers2.iterator();
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
			domainMultiSelectAnswers2.remove(iter2.next());
		}		
		
		domainObject.setMultiSelectAnswers(domainMultiSelectAnswers2);		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.AnswerOption value3 = null;
		if ( null != valueObject.getPicklist() ) 
		{
			if (valueObject.getPicklist().getBoId() == null)
			{
				if (domMap.get(valueObject.getPicklist()) != null)
				{
					value3 = (ims.core.clinical.domain.objects.AnswerOption)domMap.get(valueObject.getPicklist());
				}
			}
			else
			{
				value3 = (ims.core.clinical.domain.objects.AnswerOption)domainFactory.getDomainObject(ims.core.clinical.domain.objects.AnswerOption.class, valueObject.getPicklist().getBoId());
			}
		}
		domainObject.setPicklist(value3);
		domainObject.setCalculatedScore(valueObject.getCalculatedScore());
		domainObject.setBoolValueAnswer(valueObject.getBoolValueAnswer());
		java.util.Date value6 = null;
		ims.framework.utils.Date date6 = valueObject.getDateAnswer();		
		if ( date6 != null ) 
		{
			value6 = date6.getDate();
		}
		domainObject.setDateAnswer(value6);
		ims.framework.utils.Time time7 = valueObject.getTimeAnswer();
		String value7 = null;
		if ( time7 != null ) 
		{
			value7 = time7.toString();
		}
		domainObject.setTimeAnswer(value7);
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
		Integer value11 = null;
		if ( null != PartialDate ) 
		{
			value11 = PartialDate.toInteger();
		}
		domainObject.setPartialDate(value11);
		domainObject.setMaxMultiselectAllowed(valueObject.getMaxMultiselectAllowed());
		domainObject.setAnswerWidth(valueObject.getAnswerWidth());

		return domainObject;
	}

}
