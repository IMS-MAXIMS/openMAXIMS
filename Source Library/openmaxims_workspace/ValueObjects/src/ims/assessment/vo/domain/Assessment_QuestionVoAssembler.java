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
public class Assessment_QuestionVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.assessment.vo.Assessment_QuestionVo copy(ims.assessment.vo.Assessment_QuestionVo valueObjectDest, ims.assessment.vo.Assessment_QuestionVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_AssessmentQuestion(valueObjectSrc.getID_AssessmentQuestion());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// LegendText
		valueObjectDest.setLegendText(valueObjectSrc.getLegendText());
		// Question
		valueObjectDest.setQuestion(valueObjectSrc.getQuestion());
		// isMandatory
		valueObjectDest.setIsMandatory(valueObjectSrc.getIsMandatory());
		// ActiveStatus
		valueObjectDest.setActiveStatus(valueObjectSrc.getActiveStatus());
		// allowsMultipleAnswers
		valueObjectDest.setAllowsMultipleAnswers(valueObjectSrc.getAllowsMultipleAnswers());
		// Sequence
		valueObjectDest.setSequence(valueObjectSrc.getSequence());
		// AssessmentAnswerRole
		valueObjectDest.setAssessmentAnswerRole(valueObjectSrc.getAssessmentAnswerRole());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createAssessment_QuestionVoCollectionFromAssessmentQuestion(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.assessment.configuration.domain.objects.AssessmentQuestion objects.
	 */
	public static ims.assessment.vo.Assessment_QuestionVoCollection createAssessment_QuestionVoCollectionFromAssessmentQuestion(java.util.Set domainObjectSet)	
	{
		return createAssessment_QuestionVoCollectionFromAssessmentQuestion(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.assessment.configuration.domain.objects.AssessmentQuestion objects.
	 */
	public static ims.assessment.vo.Assessment_QuestionVoCollection createAssessment_QuestionVoCollectionFromAssessmentQuestion(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.assessment.vo.Assessment_QuestionVoCollection voList = new ims.assessment.vo.Assessment_QuestionVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.assessment.configuration.domain.objects.AssessmentQuestion domainObject = (ims.assessment.configuration.domain.objects.AssessmentQuestion) iterator.next();
			ims.assessment.vo.Assessment_QuestionVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.assessment.configuration.domain.objects.AssessmentQuestion objects.
	 */
	public static ims.assessment.vo.Assessment_QuestionVoCollection createAssessment_QuestionVoCollectionFromAssessmentQuestion(java.util.List domainObjectList) 
	{
		return createAssessment_QuestionVoCollectionFromAssessmentQuestion(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.assessment.configuration.domain.objects.AssessmentQuestion objects.
	 */
	public static ims.assessment.vo.Assessment_QuestionVoCollection createAssessment_QuestionVoCollectionFromAssessmentQuestion(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.assessment.vo.Assessment_QuestionVoCollection voList = new ims.assessment.vo.Assessment_QuestionVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.assessment.configuration.domain.objects.AssessmentQuestion domainObject = (ims.assessment.configuration.domain.objects.AssessmentQuestion) domainObjectList.get(i);
			ims.assessment.vo.Assessment_QuestionVo vo = create(map, domainObject);

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
	 * Create the ims.assessment.configuration.domain.objects.AssessmentQuestion set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractAssessmentQuestionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Assessment_QuestionVoCollection voCollection) 
	 {
	 	return extractAssessmentQuestionSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractAssessmentQuestionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Assessment_QuestionVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.assessment.vo.Assessment_QuestionVo vo = voCollection.get(i);
			ims.assessment.configuration.domain.objects.AssessmentQuestion domainObject = Assessment_QuestionVoAssembler.extractAssessmentQuestion(domainFactory, vo, domMap);

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
	 * Create the ims.assessment.configuration.domain.objects.AssessmentQuestion list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractAssessmentQuestionList(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Assessment_QuestionVoCollection voCollection) 
	 {
	 	return extractAssessmentQuestionList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractAssessmentQuestionList(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Assessment_QuestionVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.assessment.vo.Assessment_QuestionVo vo = voCollection.get(i);
			ims.assessment.configuration.domain.objects.AssessmentQuestion domainObject = Assessment_QuestionVoAssembler.extractAssessmentQuestion(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.assessment.configuration.domain.objects.AssessmentQuestion object.
	 * @param domainObject ims.assessment.configuration.domain.objects.AssessmentQuestion
	 */
	 public static ims.assessment.vo.Assessment_QuestionVo create(ims.assessment.configuration.domain.objects.AssessmentQuestion domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.assessment.configuration.domain.objects.AssessmentQuestion object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.assessment.vo.Assessment_QuestionVo create(DomainObjectMap map, ims.assessment.configuration.domain.objects.AssessmentQuestion domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.assessment.vo.Assessment_QuestionVo valueObject = (ims.assessment.vo.Assessment_QuestionVo) map.getValueObject(domainObject, ims.assessment.vo.Assessment_QuestionVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.assessment.vo.Assessment_QuestionVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.assessment.configuration.domain.objects.AssessmentQuestion
	 */
	 public static ims.assessment.vo.Assessment_QuestionVo insert(ims.assessment.vo.Assessment_QuestionVo valueObject, ims.assessment.configuration.domain.objects.AssessmentQuestion domainObject) 
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
	 * @param domainObject ims.assessment.configuration.domain.objects.AssessmentQuestion
	 */
	 public static ims.assessment.vo.Assessment_QuestionVo insert(DomainObjectMap map, ims.assessment.vo.Assessment_QuestionVo valueObject, ims.assessment.configuration.domain.objects.AssessmentQuestion domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_AssessmentQuestion(domainObject.getId());
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
			
		// LegendText
		valueObject.setLegendText(domainObject.getLegendText());
		// Question
		valueObject.setQuestion(ims.assessment.vo.domain.Question_InformationVoAssembler.create(map, domainObject.getQuestion()) );
		// isMandatory
		valueObject.setIsMandatory( domainObject.isIsMandatory() );
		// ActiveStatus
		ims.domain.lookups.LookupInstance instance4 = domainObject.getActiveStatus();
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

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup4 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setActiveStatus(voLookup4);
		}
				// allowsMultipleAnswers
		valueObject.setAllowsMultipleAnswers( domainObject.isAllowsMultipleAnswers() );
		// Sequence
		valueObject.setSequence(domainObject.getSequence());
		// AssessmentAnswerRole
		valueObject.setAssessmentAnswerRole(ims.assessment.vo.domain.AssessmentQuestionRoleVoAssembler.createAssessmentQuestionRoleVoCollectionFromAssessmentQuestionRole(map, domainObject.getAssessmentAnswerRole()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.assessment.configuration.domain.objects.AssessmentQuestion extractAssessmentQuestion(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Assessment_QuestionVo valueObject) 
	{
		return 	extractAssessmentQuestion(domainFactory, valueObject, new HashMap());
	}

	public static ims.assessment.configuration.domain.objects.AssessmentQuestion extractAssessmentQuestion(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Assessment_QuestionVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_AssessmentQuestion();
		ims.assessment.configuration.domain.objects.AssessmentQuestion domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.assessment.configuration.domain.objects.AssessmentQuestion)domMap.get(valueObject);
			}
			// ims.assessment.vo.Assessment_QuestionVo ID_AssessmentQuestion field is unknown
			domainObject = new ims.assessment.configuration.domain.objects.AssessmentQuestion();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_AssessmentQuestion());
			if (domMap.get(key) != null)
			{
				return (ims.assessment.configuration.domain.objects.AssessmentQuestion)domMap.get(key);
			}
			domainObject = (ims.assessment.configuration.domain.objects.AssessmentQuestion) domainFactory.getDomainObject(ims.assessment.configuration.domain.objects.AssessmentQuestion.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_AssessmentQuestion());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLegendText() != null && valueObject.getLegendText().equals(""))
		{
			valueObject.setLegendText(null);
		}
		domainObject.setLegendText(valueObject.getLegendText());
		domainObject.setQuestion(ims.assessment.vo.domain.Question_InformationVoAssembler.extractQuestionInformation(domainFactory, valueObject.getQuestion(), domMap));
		domainObject.setIsMandatory(valueObject.getIsMandatory());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getActiveStatus() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getActiveStatus().getID());
		}
		domainObject.setActiveStatus(value4);
		domainObject.setAllowsMultipleAnswers(valueObject.getAllowsMultipleAnswers());
		domainObject.setSequence(valueObject.getSequence());

		// SaveAsRefVO treated as RefValueObject
		ims.assessment.configuration.vo.AssessmentQuestionRoleRefVoCollection refCollection7 = new ims.assessment.configuration.vo.AssessmentQuestionRoleRefVoCollection();
		if (valueObject.getAssessmentAnswerRole() != null)
		{
			for (int i7=0; i7<valueObject.getAssessmentAnswerRole().size(); i7++)
			{
				ims.assessment.configuration.vo.AssessmentQuestionRoleRefVo ref7 = (ims.assessment.configuration.vo.AssessmentQuestionRoleRefVo)valueObject.getAssessmentAnswerRole().get(i7);
				refCollection7.add(ref7);
			}
		}
		int size7 = (null == refCollection7) ? 0 : refCollection7.size();		
		java.util.Set domainAssessmentAnswerRole7 = domainObject.getAssessmentAnswerRole();
		if (domainAssessmentAnswerRole7 == null)
		{
			domainAssessmentAnswerRole7 = new java.util.HashSet();
		}
		java.util.Set newSet7  = new java.util.HashSet();
		for(int i=0; i<size7; i++) 
		{
			ims.assessment.configuration.vo.AssessmentQuestionRoleRefVo vo = refCollection7.get(i);					
			ims.assessment.configuration.domain.objects.AssessmentQuestionRole dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.assessment.configuration.domain.objects.AssessmentQuestionRole)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.assessment.configuration.domain.objects.AssessmentQuestionRole)domainFactory.getDomainObject( ims.assessment.configuration.domain.objects.AssessmentQuestionRole.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainAssessmentAnswerRole7.contains(dom))
			{
				domainAssessmentAnswerRole7.add(dom);
			}
			newSet7.add(dom);			
		}
		java.util.Set removedSet7 = new java.util.HashSet();
		java.util.Iterator iter7 = domainAssessmentAnswerRole7.iterator();
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
			domainAssessmentAnswerRole7.remove(iter7.next());
		}		
		
		domainObject.setAssessmentAnswerRole(domainAssessmentAnswerRole7);		

		return domainObject;
	}

}
