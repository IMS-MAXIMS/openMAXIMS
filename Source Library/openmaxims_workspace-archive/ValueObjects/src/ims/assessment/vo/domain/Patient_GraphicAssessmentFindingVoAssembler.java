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
public class Patient_GraphicAssessmentFindingVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.assessment.vo.Patient_GraphicAssessmentFindingVo copy(ims.assessment.vo.Patient_GraphicAssessmentFindingVo valueObjectDest, ims.assessment.vo.Patient_GraphicAssessmentFindingVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientGraphicAssessmentFinding(valueObjectSrc.getID_PatientGraphicAssessmentFinding());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AreaName
		valueObjectDest.setAreaName(valueObjectSrc.getAreaName());
		// GraphicFinding
		valueObjectDest.setGraphicFinding(valueObjectSrc.getGraphicFinding());
		// AreaDrawn
		valueObjectDest.setAreaDrawn(valueObjectSrc.getAreaDrawn());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// AreaDetails
		valueObjectDest.setAreaDetails(valueObjectSrc.getAreaDetails());
		// Stage
		valueObjectDest.setStage(valueObjectSrc.getStage());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatient_GraphicAssessmentFindingVoCollectionFromPatientGraphicAssessmentFinding(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.assessment.instantiation.domain.objects.PatientGraphicAssessmentFinding objects.
	 */
	public static ims.assessment.vo.Patient_GraphicAssessmentFindingVoCollection createPatient_GraphicAssessmentFindingVoCollectionFromPatientGraphicAssessmentFinding(java.util.Set domainObjectSet)	
	{
		return createPatient_GraphicAssessmentFindingVoCollectionFromPatientGraphicAssessmentFinding(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.assessment.instantiation.domain.objects.PatientGraphicAssessmentFinding objects.
	 */
	public static ims.assessment.vo.Patient_GraphicAssessmentFindingVoCollection createPatient_GraphicAssessmentFindingVoCollectionFromPatientGraphicAssessmentFinding(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.assessment.vo.Patient_GraphicAssessmentFindingVoCollection voList = new ims.assessment.vo.Patient_GraphicAssessmentFindingVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.assessment.instantiation.domain.objects.PatientGraphicAssessmentFinding domainObject = (ims.assessment.instantiation.domain.objects.PatientGraphicAssessmentFinding) iterator.next();
			ims.assessment.vo.Patient_GraphicAssessmentFindingVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.assessment.instantiation.domain.objects.PatientGraphicAssessmentFinding objects.
	 */
	public static ims.assessment.vo.Patient_GraphicAssessmentFindingVoCollection createPatient_GraphicAssessmentFindingVoCollectionFromPatientGraphicAssessmentFinding(java.util.List domainObjectList) 
	{
		return createPatient_GraphicAssessmentFindingVoCollectionFromPatientGraphicAssessmentFinding(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.assessment.instantiation.domain.objects.PatientGraphicAssessmentFinding objects.
	 */
	public static ims.assessment.vo.Patient_GraphicAssessmentFindingVoCollection createPatient_GraphicAssessmentFindingVoCollectionFromPatientGraphicAssessmentFinding(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.assessment.vo.Patient_GraphicAssessmentFindingVoCollection voList = new ims.assessment.vo.Patient_GraphicAssessmentFindingVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.assessment.instantiation.domain.objects.PatientGraphicAssessmentFinding domainObject = (ims.assessment.instantiation.domain.objects.PatientGraphicAssessmentFinding) domainObjectList.get(i);
			ims.assessment.vo.Patient_GraphicAssessmentFindingVo vo = create(map, domainObject);

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
	 * Create the ims.assessment.instantiation.domain.objects.PatientGraphicAssessmentFinding set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientGraphicAssessmentFindingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Patient_GraphicAssessmentFindingVoCollection voCollection) 
	 {
	 	return extractPatientGraphicAssessmentFindingSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientGraphicAssessmentFindingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Patient_GraphicAssessmentFindingVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.assessment.vo.Patient_GraphicAssessmentFindingVo vo = voCollection.get(i);
			ims.assessment.instantiation.domain.objects.PatientGraphicAssessmentFinding domainObject = Patient_GraphicAssessmentFindingVoAssembler.extractPatientGraphicAssessmentFinding(domainFactory, vo, domMap);

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
	 * Create the ims.assessment.instantiation.domain.objects.PatientGraphicAssessmentFinding list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientGraphicAssessmentFindingList(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Patient_GraphicAssessmentFindingVoCollection voCollection) 
	 {
	 	return extractPatientGraphicAssessmentFindingList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientGraphicAssessmentFindingList(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Patient_GraphicAssessmentFindingVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.assessment.vo.Patient_GraphicAssessmentFindingVo vo = voCollection.get(i);
			ims.assessment.instantiation.domain.objects.PatientGraphicAssessmentFinding domainObject = Patient_GraphicAssessmentFindingVoAssembler.extractPatientGraphicAssessmentFinding(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.assessment.instantiation.domain.objects.PatientGraphicAssessmentFinding object.
	 * @param domainObject ims.assessment.instantiation.domain.objects.PatientGraphicAssessmentFinding
	 */
	 public static ims.assessment.vo.Patient_GraphicAssessmentFindingVo create(ims.assessment.instantiation.domain.objects.PatientGraphicAssessmentFinding domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.assessment.instantiation.domain.objects.PatientGraphicAssessmentFinding object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.assessment.vo.Patient_GraphicAssessmentFindingVo create(DomainObjectMap map, ims.assessment.instantiation.domain.objects.PatientGraphicAssessmentFinding domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.assessment.vo.Patient_GraphicAssessmentFindingVo valueObject = (ims.assessment.vo.Patient_GraphicAssessmentFindingVo) map.getValueObject(domainObject, ims.assessment.vo.Patient_GraphicAssessmentFindingVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.assessment.vo.Patient_GraphicAssessmentFindingVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.assessment.instantiation.domain.objects.PatientGraphicAssessmentFinding
	 */
	 public static ims.assessment.vo.Patient_GraphicAssessmentFindingVo insert(ims.assessment.vo.Patient_GraphicAssessmentFindingVo valueObject, ims.assessment.instantiation.domain.objects.PatientGraphicAssessmentFinding domainObject) 
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
	 * @param domainObject ims.assessment.instantiation.domain.objects.PatientGraphicAssessmentFinding
	 */
	 public static ims.assessment.vo.Patient_GraphicAssessmentFindingVo insert(DomainObjectMap map, ims.assessment.vo.Patient_GraphicAssessmentFindingVo valueObject, ims.assessment.instantiation.domain.objects.PatientGraphicAssessmentFinding domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientGraphicAssessmentFinding(domainObject.getId());
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
			
		// AreaName
		valueObject.setAreaName(domainObject.getAreaName());
		// GraphicFinding
		valueObject.setGraphicFinding(ims.core.vo.domain.DrawingGraphicFindingVoAssembler.create(map, domainObject.getGraphicFinding()) );
		// AreaDrawn
		valueObject.setAreaDrawn(domainObject.getAreaDrawn());
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// AreaDetails
		valueObject.setAreaDetails(domainObject.getAreaDetails());
		// Stage
		valueObject.setStage(ims.assessment.vo.domain.Patient_GraphicalAssessmentStageVoAssembler.createPatient_GraphicalAssessmentStageVoCollectionFromPatientGraphicalAssessmentStage(map, domainObject.getStage()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.assessment.instantiation.domain.objects.PatientGraphicAssessmentFinding extractPatientGraphicAssessmentFinding(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Patient_GraphicAssessmentFindingVo valueObject) 
	{
		return 	extractPatientGraphicAssessmentFinding(domainFactory, valueObject, new HashMap());
	}

	public static ims.assessment.instantiation.domain.objects.PatientGraphicAssessmentFinding extractPatientGraphicAssessmentFinding(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Patient_GraphicAssessmentFindingVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientGraphicAssessmentFinding();
		ims.assessment.instantiation.domain.objects.PatientGraphicAssessmentFinding domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.assessment.instantiation.domain.objects.PatientGraphicAssessmentFinding)domMap.get(valueObject);
			}
			// ims.assessment.vo.Patient_GraphicAssessmentFindingVo ID_PatientGraphicAssessmentFinding field is unknown
			domainObject = new ims.assessment.instantiation.domain.objects.PatientGraphicAssessmentFinding();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientGraphicAssessmentFinding());
			if (domMap.get(key) != null)
			{
				return (ims.assessment.instantiation.domain.objects.PatientGraphicAssessmentFinding)domMap.get(key);
			}
			domainObject = (ims.assessment.instantiation.domain.objects.PatientGraphicAssessmentFinding) domainFactory.getDomainObject(ims.assessment.instantiation.domain.objects.PatientGraphicAssessmentFinding.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientGraphicAssessmentFinding());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAreaName() != null && valueObject.getAreaName().equals(""))
		{
			valueObject.setAreaName(null);
		}
		domainObject.setAreaName(valueObject.getAreaName());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.assessment.configuration.domain.objects.DrawingGraphicFinding value2 = null;
		if ( null != valueObject.getGraphicFinding() ) 
		{
			if (valueObject.getGraphicFinding().getBoId() == null)
			{
				if (domMap.get(valueObject.getGraphicFinding()) != null)
				{
					value2 = (ims.assessment.configuration.domain.objects.DrawingGraphicFinding)domMap.get(valueObject.getGraphicFinding());
				}
			}
			else
			{
				value2 = (ims.assessment.configuration.domain.objects.DrawingGraphicFinding)domainFactory.getDomainObject(ims.assessment.configuration.domain.objects.DrawingGraphicFinding.class, valueObject.getGraphicFinding().getBoId());
			}
		}
		domainObject.setGraphicFinding(value2);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAreaDrawn() != null && valueObject.getAreaDrawn().equals(""))
		{
			valueObject.setAreaDrawn(null);
		}
		domainObject.setAreaDrawn(valueObject.getAreaDrawn());
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAreaDetails() != null && valueObject.getAreaDetails().equals(""))
		{
			valueObject.setAreaDetails(null);
		}
		domainObject.setAreaDetails(valueObject.getAreaDetails());
		domainObject.setStage(ims.assessment.vo.domain.Patient_GraphicalAssessmentStageVoAssembler.extractPatientGraphicalAssessmentStageSet(domainFactory, valueObject.getStage(), domainObject.getStage(), domMap));		

		return domainObject;
	}

}
