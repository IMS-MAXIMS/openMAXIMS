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
public class Patient_AssessmentAnswerVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.assessment.vo.Patient_AssessmentAnswerVo copy(ims.assessment.vo.Patient_AssessmentAnswerVo valueObjectDest, ims.assessment.vo.Patient_AssessmentAnswerVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientAssessmentAnswer(valueObjectSrc.getID_PatientAssessmentAnswer());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AnswerDetails
		valueObjectDest.setAnswerDetails(valueObjectSrc.getAnswerDetails());
		// AuthoringInfo
		valueObjectDest.setAuthoringInfo(valueObjectSrc.getAuthoringInfo());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatient_AssessmentAnswerVoCollectionFromPatientAssessmentAnswer(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer objects.
	 */
	public static ims.assessment.vo.Patient_AssessmentAnswerVoCollection createPatient_AssessmentAnswerVoCollectionFromPatientAssessmentAnswer(java.util.Set domainObjectSet)	
	{
		return createPatient_AssessmentAnswerVoCollectionFromPatientAssessmentAnswer(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer objects.
	 */
	public static ims.assessment.vo.Patient_AssessmentAnswerVoCollection createPatient_AssessmentAnswerVoCollectionFromPatientAssessmentAnswer(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.assessment.vo.Patient_AssessmentAnswerVoCollection voList = new ims.assessment.vo.Patient_AssessmentAnswerVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer domainObject = (ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer) iterator.next();
			ims.assessment.vo.Patient_AssessmentAnswerVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer objects.
	 */
	public static ims.assessment.vo.Patient_AssessmentAnswerVoCollection createPatient_AssessmentAnswerVoCollectionFromPatientAssessmentAnswer(java.util.List domainObjectList) 
	{
		return createPatient_AssessmentAnswerVoCollectionFromPatientAssessmentAnswer(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer objects.
	 */
	public static ims.assessment.vo.Patient_AssessmentAnswerVoCollection createPatient_AssessmentAnswerVoCollectionFromPatientAssessmentAnswer(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.assessment.vo.Patient_AssessmentAnswerVoCollection voList = new ims.assessment.vo.Patient_AssessmentAnswerVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer domainObject = (ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer) domainObjectList.get(i);
			ims.assessment.vo.Patient_AssessmentAnswerVo vo = create(map, domainObject);

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
	 * Create the ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientAssessmentAnswerSet(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Patient_AssessmentAnswerVoCollection voCollection) 
	 {
	 	return extractPatientAssessmentAnswerSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientAssessmentAnswerSet(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Patient_AssessmentAnswerVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.assessment.vo.Patient_AssessmentAnswerVo vo = voCollection.get(i);
			ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer domainObject = Patient_AssessmentAnswerVoAssembler.extractPatientAssessmentAnswer(domainFactory, vo, domMap);

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
	 * Create the ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientAssessmentAnswerList(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Patient_AssessmentAnswerVoCollection voCollection) 
	 {
	 	return extractPatientAssessmentAnswerList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientAssessmentAnswerList(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Patient_AssessmentAnswerVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.assessment.vo.Patient_AssessmentAnswerVo vo = voCollection.get(i);
			ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer domainObject = Patient_AssessmentAnswerVoAssembler.extractPatientAssessmentAnswer(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer object.
	 * @param domainObject ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer
	 */
	 public static ims.assessment.vo.Patient_AssessmentAnswerVo create(ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.assessment.vo.Patient_AssessmentAnswerVo create(DomainObjectMap map, ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.assessment.vo.Patient_AssessmentAnswerVo valueObject = (ims.assessment.vo.Patient_AssessmentAnswerVo) map.getValueObject(domainObject, ims.assessment.vo.Patient_AssessmentAnswerVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.assessment.vo.Patient_AssessmentAnswerVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer
	 */
	 public static ims.assessment.vo.Patient_AssessmentAnswerVo insert(ims.assessment.vo.Patient_AssessmentAnswerVo valueObject, ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer domainObject) 
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
	 * @param domainObject ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer
	 */
	 public static ims.assessment.vo.Patient_AssessmentAnswerVo insert(DomainObjectMap map, ims.assessment.vo.Patient_AssessmentAnswerVo valueObject, ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientAssessmentAnswer(domainObject.getId());
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
			
		// AnswerDetails
		valueObject.setAnswerDetails(ims.assessment.vo.domain.Answer_DetailsVoAssembler.createAnswer_DetailsVoCollectionFromPatientAnswerDetails(map, domainObject.getAnswerDetails()) );
		// AuthoringInfo
		if (domainObject.getAuthoringInfo() != null)
		{
			if(domainObject.getAuthoringInfo() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAuthoringInfo();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAuthoringInfo(new ims.core.clinical.vo.AuthoringInformationRefVo(id, -1));				
			}
			else
			{
				valueObject.setAuthoringInfo(new ims.core.clinical.vo.AuthoringInformationRefVo(domainObject.getAuthoringInfo().getId(), domainObject.getAuthoringInfo().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer extractPatientAssessmentAnswer(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Patient_AssessmentAnswerVo valueObject) 
	{
		return 	extractPatientAssessmentAnswer(domainFactory, valueObject, new HashMap());
	}

	public static ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer extractPatientAssessmentAnswer(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Patient_AssessmentAnswerVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientAssessmentAnswer();
		ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer)domMap.get(valueObject);
			}
			// ims.assessment.vo.Patient_AssessmentAnswerVo ID_PatientAssessmentAnswer field is unknown
			domainObject = new ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientAssessmentAnswer());
			if (domMap.get(key) != null)
			{
				return (ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer)domMap.get(key);
			}
			domainObject = (ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer) domainFactory.getDomainObject(ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientAssessmentAnswer());

		domainObject.setAnswerDetails(ims.assessment.vo.domain.Answer_DetailsVoAssembler.extractPatientAnswerDetailsList(domainFactory, valueObject.getAnswerDetails(), domainObject.getAnswerDetails(), domMap));		
		ims.core.clinical.domain.objects.AuthoringInformation value2 = null;
		if ( null != valueObject.getAuthoringInfo() ) 
		{
			if (valueObject.getAuthoringInfo().getBoId() == null)
			{
				if (domMap.get(valueObject.getAuthoringInfo()) != null)
				{
					value2 = (ims.core.clinical.domain.objects.AuthoringInformation)domMap.get(valueObject.getAuthoringInfo());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getAuthoringInfo();	
			}
			else
			{
				value2 = (ims.core.clinical.domain.objects.AuthoringInformation)domainFactory.getDomainObject(ims.core.clinical.domain.objects.AuthoringInformation.class, valueObject.getAuthoringInfo().getBoId());
			}
		}
		domainObject.setAuthoringInfo(value2);

		return domainObject;
	}

}
