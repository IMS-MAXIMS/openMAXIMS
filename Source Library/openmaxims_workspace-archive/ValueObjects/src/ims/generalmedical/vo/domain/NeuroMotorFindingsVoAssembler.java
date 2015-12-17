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
package ims.generalmedical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Kevin O'Carroll
 */
public class NeuroMotorFindingsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.generalmedical.vo.NeuroMotorFindingsVo copy(ims.generalmedical.vo.NeuroMotorFindingsVo valueObjectDest, ims.generalmedical.vo.NeuroMotorFindingsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_NeuExamMotor(valueObjectSrc.getID_NeuExamMotor());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// rootFinding
		valueObjectDest.setRootFinding(valueObjectSrc.getRootFinding());
		// rightMotorLevel
		valueObjectDest.setRightMotorLevel(valueObjectSrc.getRightMotorLevel());
		// leftMotorLevel
		valueObjectDest.setLeftMotorLevel(valueObjectSrc.getLeftMotorLevel());
		// isProblem
		valueObjectDest.setIsProblem(valueObjectSrc.getIsProblem());
		// OverallAsiaRight
		valueObjectDest.setOverallAsiaRight(valueObjectSrc.getOverallAsiaRight());
		// OverAllAsiaLeft
		valueObjectDest.setOverAllAsiaLeft(valueObjectSrc.getOverAllAsiaLeft());
		// LLAsiaRight
		valueObjectDest.setLLAsiaRight(valueObjectSrc.getLLAsiaRight());
		// LLAsiaLeft
		valueObjectDest.setLLAsiaLeft(valueObjectSrc.getLLAsiaLeft());
		// SysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
		// MotorAreaFindings
		valueObjectDest.setMotorAreaFindings(valueObjectSrc.getMotorAreaFindings());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// AuthoringCP
		valueObjectDest.setAuthoringCP(valueObjectSrc.getAuthoringCP());
		// AuthoringDateTime
		valueObjectDest.setAuthoringDateTime(valueObjectSrc.getAuthoringDateTime());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createNeuroMotorFindingsVoCollectionFromNeuExamMotor(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.medical.domain.objects.NeuExamMotor objects.
	 */
	public static ims.generalmedical.vo.NeuroMotorFindingsVoCollection createNeuroMotorFindingsVoCollectionFromNeuExamMotor(java.util.Set domainObjectSet)	
	{
		return createNeuroMotorFindingsVoCollectionFromNeuExamMotor(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.medical.domain.objects.NeuExamMotor objects.
	 */
	public static ims.generalmedical.vo.NeuroMotorFindingsVoCollection createNeuroMotorFindingsVoCollectionFromNeuExamMotor(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.generalmedical.vo.NeuroMotorFindingsVoCollection voList = new ims.generalmedical.vo.NeuroMotorFindingsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.medical.domain.objects.NeuExamMotor domainObject = (ims.medical.domain.objects.NeuExamMotor) iterator.next();
			ims.generalmedical.vo.NeuroMotorFindingsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.medical.domain.objects.NeuExamMotor objects.
	 */
	public static ims.generalmedical.vo.NeuroMotorFindingsVoCollection createNeuroMotorFindingsVoCollectionFromNeuExamMotor(java.util.List domainObjectList) 
	{
		return createNeuroMotorFindingsVoCollectionFromNeuExamMotor(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.medical.domain.objects.NeuExamMotor objects.
	 */
	public static ims.generalmedical.vo.NeuroMotorFindingsVoCollection createNeuroMotorFindingsVoCollectionFromNeuExamMotor(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.generalmedical.vo.NeuroMotorFindingsVoCollection voList = new ims.generalmedical.vo.NeuroMotorFindingsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.medical.domain.objects.NeuExamMotor domainObject = (ims.medical.domain.objects.NeuExamMotor) domainObjectList.get(i);
			ims.generalmedical.vo.NeuroMotorFindingsVo vo = create(map, domainObject);

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
	 * Create the ims.medical.domain.objects.NeuExamMotor set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractNeuExamMotorSet(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.NeuroMotorFindingsVoCollection voCollection) 
	 {
	 	return extractNeuExamMotorSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractNeuExamMotorSet(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.NeuroMotorFindingsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.generalmedical.vo.NeuroMotorFindingsVo vo = voCollection.get(i);
			ims.medical.domain.objects.NeuExamMotor domainObject = NeuroMotorFindingsVoAssembler.extractNeuExamMotor(domainFactory, vo, domMap);

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
	 * Create the ims.medical.domain.objects.NeuExamMotor list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractNeuExamMotorList(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.NeuroMotorFindingsVoCollection voCollection) 
	 {
	 	return extractNeuExamMotorList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractNeuExamMotorList(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.NeuroMotorFindingsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.generalmedical.vo.NeuroMotorFindingsVo vo = voCollection.get(i);
			ims.medical.domain.objects.NeuExamMotor domainObject = NeuroMotorFindingsVoAssembler.extractNeuExamMotor(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.medical.domain.objects.NeuExamMotor object.
	 * @param domainObject ims.medical.domain.objects.NeuExamMotor
	 */
	 public static ims.generalmedical.vo.NeuroMotorFindingsVo create(ims.medical.domain.objects.NeuExamMotor domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.medical.domain.objects.NeuExamMotor object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.generalmedical.vo.NeuroMotorFindingsVo create(DomainObjectMap map, ims.medical.domain.objects.NeuExamMotor domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.generalmedical.vo.NeuroMotorFindingsVo valueObject = (ims.generalmedical.vo.NeuroMotorFindingsVo) map.getValueObject(domainObject, ims.generalmedical.vo.NeuroMotorFindingsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.generalmedical.vo.NeuroMotorFindingsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.medical.domain.objects.NeuExamMotor
	 */
	 public static ims.generalmedical.vo.NeuroMotorFindingsVo insert(ims.generalmedical.vo.NeuroMotorFindingsVo valueObject, ims.medical.domain.objects.NeuExamMotor domainObject) 
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
	 * @param domainObject ims.medical.domain.objects.NeuExamMotor
	 */
	 public static ims.generalmedical.vo.NeuroMotorFindingsVo insert(DomainObjectMap map, ims.generalmedical.vo.NeuroMotorFindingsVo valueObject, ims.medical.domain.objects.NeuExamMotor domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_NeuExamMotor(domainObject.getId());
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
			
		// rootFinding
		valueObject.setRootFinding(ims.generalmedical.vo.domain.NeuroMotorRootValueVoAssembler.createNeuroMotorRootValueVoCollectionFromNeuRootMotorFind(map, domainObject.getRootFinding()) );
		// rightMotorLevel
		valueObject.setRightMotorLevel(ims.core.vo.domain.VertebrallevelVoAssembler.create(map, domainObject.getRightMotorLevel()) );
		// leftMotorLevel
		valueObject.setLeftMotorLevel(ims.core.vo.domain.VertebrallevelVoAssembler.create(map, domainObject.getLeftMotorLevel()) );
		// isProblem
		valueObject.setIsProblem( domainObject.isIsProblem() );
		// OverallAsiaRight
		valueObject.setOverallAsiaRight(domainObject.getOverallAsiaRight());
		// OverAllAsiaLeft
		valueObject.setOverAllAsiaLeft(domainObject.getOverAllAsiaLeft());
		// LLAsiaRight
		valueObject.setLLAsiaRight(domainObject.getLLAsiaRight());
		// LLAsiaLeft
		valueObject.setLLAsiaLeft(domainObject.getLLAsiaLeft());
		// SysInfo
		// set system information
		valueObject.setSysInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// MotorAreaFindings
		valueObject.setMotorAreaFindings(ims.generalmedical.vo.domain.NeuroMotorAreaFindingVoAssembler.createNeuroMotorAreaFindingVoCollectionFromNeuroMotorAreaFinding(map, domainObject.getMotorAreaFindings()) );
		// ClinicalContact
		valueObject.setClinicalContact(ims.core.vo.domain.ClinicalContactShortVoAssembler.create(map, domainObject.getClinicalContact()) );
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
		// AuthoringCP
		valueObject.setAuthoringCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getAuthoringCP()) );
		// AuthoringDateTime
		java.util.Date AuthoringDateTime = domainObject.getAuthoringDateTime();
		if ( null != AuthoringDateTime ) 
		{
			valueObject.setAuthoringDateTime(new ims.framework.utils.DateTime(AuthoringDateTime) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.medical.domain.objects.NeuExamMotor extractNeuExamMotor(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.NeuroMotorFindingsVo valueObject) 
	{
		return 	extractNeuExamMotor(domainFactory, valueObject, new HashMap());
	}

	public static ims.medical.domain.objects.NeuExamMotor extractNeuExamMotor(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.NeuroMotorFindingsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_NeuExamMotor();
		ims.medical.domain.objects.NeuExamMotor domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.medical.domain.objects.NeuExamMotor)domMap.get(valueObject);
			}
			// ims.generalmedical.vo.NeuroMotorFindingsVo ID_NeuExamMotor field is unknown
			domainObject = new ims.medical.domain.objects.NeuExamMotor();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_NeuExamMotor());
			if (domMap.get(key) != null)
			{
				return (ims.medical.domain.objects.NeuExamMotor)domMap.get(key);
			}
			domainObject = (ims.medical.domain.objects.NeuExamMotor) domainFactory.getDomainObject(ims.medical.domain.objects.NeuExamMotor.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_NeuExamMotor());

		domainObject.setRootFinding(ims.generalmedical.vo.domain.NeuroMotorRootValueVoAssembler.extractNeuRootMotorFindSet(domainFactory, valueObject.getRootFinding(), domainObject.getRootFinding(), domMap));		
		domainObject.setRightMotorLevel(ims.core.vo.domain.VertebrallevelVoAssembler.extractVertebralLevels(domainFactory, valueObject.getRightMotorLevel(), domMap));
		domainObject.setLeftMotorLevel(ims.core.vo.domain.VertebrallevelVoAssembler.extractVertebralLevels(domainFactory, valueObject.getLeftMotorLevel(), domMap));
		domainObject.setIsProblem(valueObject.getIsProblem());
		domainObject.setOverallAsiaRight(valueObject.getOverallAsiaRight());
		domainObject.setOverAllAsiaLeft(valueObject.getOverAllAsiaLeft());
		domainObject.setLLAsiaRight(valueObject.getLLAsiaRight());
		domainObject.setLLAsiaLeft(valueObject.getLLAsiaLeft());
		domainObject.setMotorAreaFindings(ims.generalmedical.vo.domain.NeuroMotorAreaFindingVoAssembler.extractNeuroMotorAreaFindingSet(domainFactory, valueObject.getMotorAreaFindings(), domainObject.getMotorAreaFindings(), domMap));		
		domainObject.setClinicalContact(ims.core.vo.domain.ClinicalContactShortVoAssembler.extractClinicalContact(domainFactory, valueObject.getClinicalContact(), domMap));
		ims.core.admin.domain.objects.CareContext value12 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value12 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value12 = domainObject.getCareContext();	
			}
			else
			{
				value12 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value12);
		domainObject.setAuthoringCP(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getAuthoringCP(), domMap));
		ims.framework.utils.DateTime dateTime14 = valueObject.getAuthoringDateTime();
		java.util.Date value14 = null;
		if ( dateTime14 != null ) 
		{
			value14 = dateTime14.getJavaDate();
		}
		domainObject.setAuthoringDateTime(value14);

		return domainObject;
	}

}
