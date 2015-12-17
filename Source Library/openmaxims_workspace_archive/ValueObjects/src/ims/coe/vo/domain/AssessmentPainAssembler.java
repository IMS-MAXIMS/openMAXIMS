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
package ims.coe.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Sinead McDermott
 */
public class AssessmentPainAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.coe.vo.AssessmentPain copy(ims.coe.vo.AssessmentPain valueObjectDest, ims.coe.vo.AssessmentPain valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_AssessmentComponent(valueObjectSrc.getID_AssessmentComponent());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// optionalPainAssessment
		valueObjectDest.setOptionalPainAssessment(valueObjectSrc.getOptionalPainAssessment());
		// PatientExperiencePainAnyTime
		valueObjectDest.setPatientExperiencePainAnyTime(valueObjectSrc.getPatientExperiencePainAnyTime());
		// PatientTakePainMeds
		valueObjectDest.setPatientTakePainMeds(valueObjectSrc.getPatientTakePainMeds());
		// PainMedication
		valueObjectDest.setPainMedication(valueObjectSrc.getPainMedication());
		// OtherMethods
		valueObjectDest.setOtherMethods(valueObjectSrc.getOtherMethods());
		// isComplete
		valueObjectDest.setIsComplete(valueObjectSrc.getIsComplete());
		// AssessmentInfo
		valueObjectDest.setAssessmentInfo(valueObjectSrc.getAssessmentInfo());
		// Copy
		valueObjectDest.setCopy(valueObjectSrc.getCopy());
		// ComponentType
		valueObjectDest.setComponentType(valueObjectSrc.getComponentType());
		// CarePlanTemplate
		valueObjectDest.setCarePlanTemplate(valueObjectSrc.getCarePlanTemplate());
		// CarePlans
		valueObjectDest.setCarePlans(valueObjectSrc.getCarePlans());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createAssessmentPainCollectionFromPainComponent(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.coe.assessment.domain.objects.PainComponent objects.
	 */
	public static ims.coe.vo.AssessmentPainCollection createAssessmentPainCollectionFromPainComponent(java.util.Set domainObjectSet)	
	{
		return createAssessmentPainCollectionFromPainComponent(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.coe.assessment.domain.objects.PainComponent objects.
	 */
	public static ims.coe.vo.AssessmentPainCollection createAssessmentPainCollectionFromPainComponent(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.coe.vo.AssessmentPainCollection voList = new ims.coe.vo.AssessmentPainCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.coe.assessment.domain.objects.PainComponent domainObject = (ims.coe.assessment.domain.objects.PainComponent) iterator.next();
			ims.coe.vo.AssessmentPain vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.coe.assessment.domain.objects.PainComponent objects.
	 */
	public static ims.coe.vo.AssessmentPainCollection createAssessmentPainCollectionFromPainComponent(java.util.List domainObjectList) 
	{
		return createAssessmentPainCollectionFromPainComponent(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.coe.assessment.domain.objects.PainComponent objects.
	 */
	public static ims.coe.vo.AssessmentPainCollection createAssessmentPainCollectionFromPainComponent(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.coe.vo.AssessmentPainCollection voList = new ims.coe.vo.AssessmentPainCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.coe.assessment.domain.objects.PainComponent domainObject = (ims.coe.assessment.domain.objects.PainComponent) domainObjectList.get(i);
			ims.coe.vo.AssessmentPain vo = create(map, domainObject);

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
	 * Create the ims.coe.assessment.domain.objects.PainComponent set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPainComponentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentPainCollection voCollection) 
	 {
	 	return extractPainComponentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPainComponentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentPainCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.coe.vo.AssessmentPain vo = voCollection.get(i);
			ims.coe.assessment.domain.objects.PainComponent domainObject = AssessmentPainAssembler.extractPainComponent(domainFactory, vo, domMap);

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
	 * Create the ims.coe.assessment.domain.objects.PainComponent list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPainComponentList(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentPainCollection voCollection) 
	 {
	 	return extractPainComponentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPainComponentList(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentPainCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.coe.vo.AssessmentPain vo = voCollection.get(i);
			ims.coe.assessment.domain.objects.PainComponent domainObject = AssessmentPainAssembler.extractPainComponent(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.coe.assessment.domain.objects.PainComponent object.
	 * @param domainObject ims.coe.assessment.domain.objects.PainComponent
	 */
	 public static ims.coe.vo.AssessmentPain create(ims.coe.assessment.domain.objects.PainComponent domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.coe.assessment.domain.objects.PainComponent object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.coe.vo.AssessmentPain create(DomainObjectMap map, ims.coe.assessment.domain.objects.PainComponent domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.coe.vo.AssessmentPain valueObject = (ims.coe.vo.AssessmentPain) map.getValueObject(domainObject, ims.coe.vo.AssessmentPain.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.coe.vo.AssessmentPain(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.coe.assessment.domain.objects.PainComponent
	 */
	 public static ims.coe.vo.AssessmentPain insert(ims.coe.vo.AssessmentPain valueObject, ims.coe.assessment.domain.objects.PainComponent domainObject) 
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
	 * @param domainObject ims.coe.assessment.domain.objects.PainComponent
	 */
	 public static ims.coe.vo.AssessmentPain insert(DomainObjectMap map, ims.coe.vo.AssessmentPain valueObject, ims.coe.assessment.domain.objects.PainComponent domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_AssessmentComponent(domainObject.getId());
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
			
		// optionalPainAssessment
		valueObject.setOptionalPainAssessment(ims.nursing.vo.domain.PainAssessmentAssembler.create(map, domainObject.getOptionalPainAssessment()) );
		// PatientExperiencePainAnyTime
		ims.domain.lookups.LookupInstance instance2 = domainObject.getPatientExperiencePainAnyTime();
		if ( null != instance2 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance2.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance2.getImage().getImageId(), instance2.getImage().getImagePath());
			}
			color = instance2.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNoUnknown voLookup2 = new ims.core.vo.lookups.YesNoUnknown(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup2 = voLookup2;
			ims.domain.lookups.LookupInstance parent2 = instance2.getParent();
			while (parent2 != null)
			{
				if (parent2.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent2.getImage().getImageId(), parent2.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent2.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup2.setParent(new ims.core.vo.lookups.YesNoUnknown(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setPatientExperiencePainAnyTime(voLookup2);
		}
				// PatientTakePainMeds
		ims.domain.lookups.LookupInstance instance3 = domainObject.getPatientTakePainMeds();
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

			ims.core.vo.lookups.YesNoUnknown voLookup3 = new ims.core.vo.lookups.YesNoUnknown(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.YesNoUnknown(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setPatientTakePainMeds(voLookup3);
		}
				// PainMedication
		valueObject.setPainMedication(ims.coe.vo.domain.PainMedicationAssembler.createPainMedicationCollectionFromPainMedication(map, domainObject.getPainMedication()) );
		// OtherMethods
		valueObject.setOtherMethods(domainObject.getOtherMethods());
		// isComplete
		valueObject.setIsComplete( domainObject.isIsComplete() );
		// AssessmentInfo
		valueObject.setAssessmentInfo(ims.nursing.vo.domain.AssessmentInfoAssembler.createAssessmentInfoCollectionFromAssessmentInfo(map, domainObject.getAssessmentInfo()) );
		// Copy
		valueObject.setCopy( domainObject.isCopy() );
		// ComponentType
		ims.domain.lookups.LookupInstance instance9 = domainObject.getComponentType();
		if ( null != instance9 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance9.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance9.getImage().getImageId(), instance9.getImage().getImagePath());
			}
			color = instance9.getColor();
			if (color != null) 
				color.getValue();

			ims.nursing.vo.lookups.AssessmentComponentType voLookup9 = new ims.nursing.vo.lookups.AssessmentComponentType(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.nursing.vo.lookups.AssessmentComponentType parentVoLookup9 = voLookup9;
			ims.domain.lookups.LookupInstance parent9 = instance9.getParent();
			while (parent9 != null)
			{
				if (parent9.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent9.getImage().getImageId(), parent9.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent9.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup9.setParent(new ims.nursing.vo.lookups.AssessmentComponentType(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setComponentType(voLookup9);
		}
				// CarePlanTemplate
		valueObject.setCarePlanTemplate(ims.nursing.vo.domain.CarePlanTemplateAssembler.createCarePlanTemplateCollectionFromCarePlanTemplate(map, domainObject.getCarePlanTemplate()) );
		// CarePlans
		valueObject.setCarePlans(ims.nursing.vo.domain.CarePlanAssembler.createCarePlanCollectionFromCarePlan(map, domainObject.getCarePlans()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.coe.assessment.domain.objects.PainComponent extractPainComponent(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentPain valueObject) 
	{
		return 	extractPainComponent(domainFactory, valueObject, new HashMap());
	}

	public static ims.coe.assessment.domain.objects.PainComponent extractPainComponent(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentPain valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_AssessmentComponent();
		ims.coe.assessment.domain.objects.PainComponent domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.coe.assessment.domain.objects.PainComponent)domMap.get(valueObject);
			}
			// ims.coe.vo.AssessmentPain ID_PainComponent field is unknown
			domainObject = new ims.coe.assessment.domain.objects.PainComponent();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_AssessmentComponent());
			if (domMap.get(key) != null)
			{
				return (ims.coe.assessment.domain.objects.PainComponent)domMap.get(key);
			}
			domainObject = (ims.coe.assessment.domain.objects.PainComponent) domainFactory.getDomainObject(ims.coe.assessment.domain.objects.PainComponent.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_AssessmentComponent());

		domainObject.setOptionalPainAssessment(ims.nursing.vo.domain.PainAssessmentAssembler.extractPainAssessment(domainFactory, valueObject.getOptionalPainAssessment(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getPatientExperiencePainAnyTime() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getPatientExperiencePainAnyTime().getID());
		}
		domainObject.setPatientExperiencePainAnyTime(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getPatientTakePainMeds() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getPatientTakePainMeds().getID());
		}
		domainObject.setPatientTakePainMeds(value3);
		domainObject.setPainMedication(ims.coe.vo.domain.PainMedicationAssembler.extractPainMedicationSet(domainFactory, valueObject.getPainMedication(), domainObject.getPainMedication(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOtherMethods() != null && valueObject.getOtherMethods().equals(""))
		{
			valueObject.setOtherMethods(null);
		}
		domainObject.setOtherMethods(valueObject.getOtherMethods());
		domainObject.setIsComplete(valueObject.getIsComplete());
		domainObject.setAssessmentInfo(ims.nursing.vo.domain.AssessmentInfoAssembler.extractAssessmentInfoList(domainFactory, valueObject.getAssessmentInfo(), domainObject.getAssessmentInfo(), domMap));		
		domainObject.setCopy(valueObject.getCopy());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getComponentType() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getComponentType().getID());
		}
		domainObject.setComponentType(value9);
		domainObject.setCarePlanTemplate(ims.nursing.vo.domain.CarePlanTemplateAssembler.extractCarePlanTemplateSet(domainFactory, valueObject.getCarePlanTemplate(), domainObject.getCarePlanTemplate(), domMap));		
		domainObject.setCarePlans(ims.nursing.vo.domain.CarePlanAssembler.extractCarePlanSet(domainFactory, valueObject.getCarePlans(), domainObject.getCarePlans(), domMap));		

		return domainObject;
	}

}
