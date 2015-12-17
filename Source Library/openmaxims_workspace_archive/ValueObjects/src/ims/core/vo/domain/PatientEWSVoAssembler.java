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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class PatientEWSVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PatientEWSVo copy(ims.core.vo.PatientEWSVo valueObjectDest, ims.core.vo.PatientEWSVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientEWS(valueObjectSrc.getID_PatientEWS());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// VitalSign
		valueObjectDest.setVitalSign(valueObjectSrc.getVitalSign());
		// PatientAssessment
		valueObjectDest.setPatientAssessment(valueObjectSrc.getPatientAssessment());
		// SECSScore
		valueObjectDest.setSECSScore(valueObjectSrc.getSECSScore());
		// ScoreDetails
		valueObjectDest.setScoreDetails(valueObjectSrc.getScoreDetails());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// SysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientEWSVoCollectionFromPatientEWS(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.assessment.instantiation.domain.objects.PatientEWS objects.
	 */
	public static ims.core.vo.PatientEWSVoCollection createPatientEWSVoCollectionFromPatientEWS(java.util.Set domainObjectSet)	
	{
		return createPatientEWSVoCollectionFromPatientEWS(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.assessment.instantiation.domain.objects.PatientEWS objects.
	 */
	public static ims.core.vo.PatientEWSVoCollection createPatientEWSVoCollectionFromPatientEWS(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatientEWSVoCollection voList = new ims.core.vo.PatientEWSVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.assessment.instantiation.domain.objects.PatientEWS domainObject = (ims.assessment.instantiation.domain.objects.PatientEWS) iterator.next();
			ims.core.vo.PatientEWSVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.assessment.instantiation.domain.objects.PatientEWS objects.
	 */
	public static ims.core.vo.PatientEWSVoCollection createPatientEWSVoCollectionFromPatientEWS(java.util.List domainObjectList) 
	{
		return createPatientEWSVoCollectionFromPatientEWS(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.assessment.instantiation.domain.objects.PatientEWS objects.
	 */
	public static ims.core.vo.PatientEWSVoCollection createPatientEWSVoCollectionFromPatientEWS(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatientEWSVoCollection voList = new ims.core.vo.PatientEWSVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.assessment.instantiation.domain.objects.PatientEWS domainObject = (ims.assessment.instantiation.domain.objects.PatientEWS) domainObjectList.get(i);
			ims.core.vo.PatientEWSVo vo = create(map, domainObject);

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
	 * Create the ims.assessment.instantiation.domain.objects.PatientEWS set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientEWSSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientEWSVoCollection voCollection) 
	 {
	 	return extractPatientEWSSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientEWSSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientEWSVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientEWSVo vo = voCollection.get(i);
			ims.assessment.instantiation.domain.objects.PatientEWS domainObject = PatientEWSVoAssembler.extractPatientEWS(domainFactory, vo, domMap);

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
	 * Create the ims.assessment.instantiation.domain.objects.PatientEWS list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientEWSList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientEWSVoCollection voCollection) 
	 {
	 	return extractPatientEWSList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientEWSList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientEWSVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientEWSVo vo = voCollection.get(i);
			ims.assessment.instantiation.domain.objects.PatientEWS domainObject = PatientEWSVoAssembler.extractPatientEWS(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.assessment.instantiation.domain.objects.PatientEWS object.
	 * @param domainObject ims.assessment.instantiation.domain.objects.PatientEWS
	 */
	 public static ims.core.vo.PatientEWSVo create(ims.assessment.instantiation.domain.objects.PatientEWS domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.assessment.instantiation.domain.objects.PatientEWS object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PatientEWSVo create(DomainObjectMap map, ims.assessment.instantiation.domain.objects.PatientEWS domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PatientEWSVo valueObject = (ims.core.vo.PatientEWSVo) map.getValueObject(domainObject, ims.core.vo.PatientEWSVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PatientEWSVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.assessment.instantiation.domain.objects.PatientEWS
	 */
	 public static ims.core.vo.PatientEWSVo insert(ims.core.vo.PatientEWSVo valueObject, ims.assessment.instantiation.domain.objects.PatientEWS domainObject) 
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
	 * @param domainObject ims.assessment.instantiation.domain.objects.PatientEWS
	 */
	 public static ims.core.vo.PatientEWSVo insert(DomainObjectMap map, ims.core.vo.PatientEWSVo valueObject, ims.assessment.instantiation.domain.objects.PatientEWS domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientEWS(domainObject.getId());
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
			
		// VitalSign
		if (domainObject.getVitalSign() != null)
		{
			if(domainObject.getVitalSign() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getVitalSign();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setVitalSign(new ims.core.vitals.vo.VitalSignsRefVo(id, -1));				
			}
			else
			{
				valueObject.setVitalSign(new ims.core.vitals.vo.VitalSignsRefVo(domainObject.getVitalSign().getId(), domainObject.getVitalSign().getVersion()));
			}
		}
		// PatientAssessment
		valueObject.setPatientAssessment(ims.assessment.vo.domain.PatientAssessmentVoAssembler.create(map, domainObject.getPatientAssessment()) );
		// SECSScore
		valueObject.setSECSScore(domainObject.getSECSScore());
		// ScoreDetails
		valueObject.setScoreDetails(domainObject.getScoreDetails());
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
		// SysInfo
		// set system information
		valueObject.setSysInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.assessment.instantiation.domain.objects.PatientEWS extractPatientEWS(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientEWSVo valueObject) 
	{
		return 	extractPatientEWS(domainFactory, valueObject, new HashMap());
	}

	public static ims.assessment.instantiation.domain.objects.PatientEWS extractPatientEWS(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientEWSVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientEWS();
		ims.assessment.instantiation.domain.objects.PatientEWS domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.assessment.instantiation.domain.objects.PatientEWS)domMap.get(valueObject);
			}
			// ims.core.vo.PatientEWSVo ID_PatientEWS field is unknown
			domainObject = new ims.assessment.instantiation.domain.objects.PatientEWS();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientEWS());
			if (domMap.get(key) != null)
			{
				return (ims.assessment.instantiation.domain.objects.PatientEWS)domMap.get(key);
			}
			domainObject = (ims.assessment.instantiation.domain.objects.PatientEWS) domainFactory.getDomainObject(ims.assessment.instantiation.domain.objects.PatientEWS.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientEWS());

		ims.core.vitals.domain.objects.VitalSigns value1 = null;
		if ( null != valueObject.getVitalSign() ) 
		{
			if (valueObject.getVitalSign().getBoId() == null)
			{
				if (domMap.get(valueObject.getVitalSign()) != null)
				{
					value1 = (ims.core.vitals.domain.objects.VitalSigns)domMap.get(valueObject.getVitalSign());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getVitalSign();	
			}
			else
			{
				value1 = (ims.core.vitals.domain.objects.VitalSigns)domainFactory.getDomainObject(ims.core.vitals.domain.objects.VitalSigns.class, valueObject.getVitalSign().getBoId());
			}
		}
		domainObject.setVitalSign(value1);
		domainObject.setPatientAssessment(ims.assessment.vo.domain.PatientAssessmentVoAssembler.extractPatientAssessment(domainFactory, valueObject.getPatientAssessment(), domMap));
		domainObject.setSECSScore(valueObject.getSECSScore());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getScoreDetails() != null && valueObject.getScoreDetails().equals(""))
		{
			valueObject.setScoreDetails(null);
		}
		domainObject.setScoreDetails(valueObject.getScoreDetails());
		ims.core.admin.domain.objects.CareContext value5 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value5 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value5 = domainObject.getCareContext();	
			}
			else
			{
				value5 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value5);

		return domainObject;
	}

}
