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
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Dara Hickey
 */
public class PresentAbsentHistoryProblemsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.PresentAbsentHistoryProblemsVo copy(ims.clinical.vo.PresentAbsentHistoryProblemsVo valueObjectDest, ims.clinical.vo.PresentAbsentHistoryProblemsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PresentAbsentHistoryProblems(valueObjectSrc.getID_PresentAbsentHistoryProblems());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// PresentProblems
		valueObjectDest.setPresentProblems(valueObjectSrc.getPresentProblems());
		// AbsentProblems
		valueObjectDest.setAbsentProblems(valueObjectSrc.getAbsentProblems());
		// HistoryPresentingProblem
		valueObjectDest.setHistoryPresentingProblem(valueObjectSrc.getHistoryPresentingProblem());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPresentAbsentHistoryProblemsVoCollectionFromPresentAbsentHistoryProblems(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.PresentAbsentHistoryProblems objects.
	 */
	public static ims.clinical.vo.PresentAbsentHistoryProblemsVoCollection createPresentAbsentHistoryProblemsVoCollectionFromPresentAbsentHistoryProblems(java.util.Set domainObjectSet)	
	{
		return createPresentAbsentHistoryProblemsVoCollectionFromPresentAbsentHistoryProblems(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.PresentAbsentHistoryProblems objects.
	 */
	public static ims.clinical.vo.PresentAbsentHistoryProblemsVoCollection createPresentAbsentHistoryProblemsVoCollectionFromPresentAbsentHistoryProblems(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.PresentAbsentHistoryProblemsVoCollection voList = new ims.clinical.vo.PresentAbsentHistoryProblemsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.PresentAbsentHistoryProblems domainObject = (ims.clinical.domain.objects.PresentAbsentHistoryProblems) iterator.next();
			ims.clinical.vo.PresentAbsentHistoryProblemsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.PresentAbsentHistoryProblems objects.
	 */
	public static ims.clinical.vo.PresentAbsentHistoryProblemsVoCollection createPresentAbsentHistoryProblemsVoCollectionFromPresentAbsentHistoryProblems(java.util.List domainObjectList) 
	{
		return createPresentAbsentHistoryProblemsVoCollectionFromPresentAbsentHistoryProblems(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.PresentAbsentHistoryProblems objects.
	 */
	public static ims.clinical.vo.PresentAbsentHistoryProblemsVoCollection createPresentAbsentHistoryProblemsVoCollectionFromPresentAbsentHistoryProblems(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.PresentAbsentHistoryProblemsVoCollection voList = new ims.clinical.vo.PresentAbsentHistoryProblemsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.PresentAbsentHistoryProblems domainObject = (ims.clinical.domain.objects.PresentAbsentHistoryProblems) domainObjectList.get(i);
			ims.clinical.vo.PresentAbsentHistoryProblemsVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.PresentAbsentHistoryProblems set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPresentAbsentHistoryProblemsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PresentAbsentHistoryProblemsVoCollection voCollection) 
	 {
	 	return extractPresentAbsentHistoryProblemsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPresentAbsentHistoryProblemsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PresentAbsentHistoryProblemsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.PresentAbsentHistoryProblemsVo vo = voCollection.get(i);
			ims.clinical.domain.objects.PresentAbsentHistoryProblems domainObject = PresentAbsentHistoryProblemsVoAssembler.extractPresentAbsentHistoryProblems(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.PresentAbsentHistoryProblems list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPresentAbsentHistoryProblemsList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PresentAbsentHistoryProblemsVoCollection voCollection) 
	 {
	 	return extractPresentAbsentHistoryProblemsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPresentAbsentHistoryProblemsList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PresentAbsentHistoryProblemsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.PresentAbsentHistoryProblemsVo vo = voCollection.get(i);
			ims.clinical.domain.objects.PresentAbsentHistoryProblems domainObject = PresentAbsentHistoryProblemsVoAssembler.extractPresentAbsentHistoryProblems(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.PresentAbsentHistoryProblems object.
	 * @param domainObject ims.clinical.domain.objects.PresentAbsentHistoryProblems
	 */
	 public static ims.clinical.vo.PresentAbsentHistoryProblemsVo create(ims.clinical.domain.objects.PresentAbsentHistoryProblems domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.PresentAbsentHistoryProblems object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.PresentAbsentHistoryProblemsVo create(DomainObjectMap map, ims.clinical.domain.objects.PresentAbsentHistoryProblems domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.PresentAbsentHistoryProblemsVo valueObject = (ims.clinical.vo.PresentAbsentHistoryProblemsVo) map.getValueObject(domainObject, ims.clinical.vo.PresentAbsentHistoryProblemsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.PresentAbsentHistoryProblemsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.PresentAbsentHistoryProblems
	 */
	 public static ims.clinical.vo.PresentAbsentHistoryProblemsVo insert(ims.clinical.vo.PresentAbsentHistoryProblemsVo valueObject, ims.clinical.domain.objects.PresentAbsentHistoryProblems domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.PresentAbsentHistoryProblems
	 */
	 public static ims.clinical.vo.PresentAbsentHistoryProblemsVo insert(DomainObjectMap map, ims.clinical.vo.PresentAbsentHistoryProblemsVo valueObject, ims.clinical.domain.objects.PresentAbsentHistoryProblems domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PresentAbsentHistoryProblems(domainObject.getId());
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
			
		// PresentProblems
		valueObject.setPresentProblems(ims.clinical.vo.domain.PatientPresentingProblemsVoAssembler.createPatientPresentingProblemsVoCollectionFromPatientProblem(map, domainObject.getPresentProblems()) );
		// AbsentProblems
		valueObject.setAbsentProblems(ims.clinical.vo.domain.AbsentPatientPresentingProblemVoAssembler.createAbsentPatientPresentingProblemVoCollectionFromAbsentPresentingProblems(map, domainObject.getAbsentProblems()) );
		// HistoryPresentingProblem
		valueObject.setHistoryPresentingProblem(domainObject.getHistoryPresentingProblem());
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// ClinicalContact
		if (domainObject.getClinicalContact() != null)
		{
			if(domainObject.getClinicalContact() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getClinicalContact();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(id, -1));				
			}
			else
			{
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(domainObject.getClinicalContact().getId(), domainObject.getClinicalContact().getVersion()));
			}
		}
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
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.PresentAbsentHistoryProblems extractPresentAbsentHistoryProblems(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PresentAbsentHistoryProblemsVo valueObject) 
	{
		return 	extractPresentAbsentHistoryProblems(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.PresentAbsentHistoryProblems extractPresentAbsentHistoryProblems(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PresentAbsentHistoryProblemsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PresentAbsentHistoryProblems();
		ims.clinical.domain.objects.PresentAbsentHistoryProblems domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.PresentAbsentHistoryProblems)domMap.get(valueObject);
			}
			// ims.clinical.vo.PresentAbsentHistoryProblemsVo ID_PresentAbsentHistoryProblems field is unknown
			domainObject = new ims.clinical.domain.objects.PresentAbsentHistoryProblems();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PresentAbsentHistoryProblems());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.PresentAbsentHistoryProblems)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.PresentAbsentHistoryProblems) domainFactory.getDomainObject(ims.clinical.domain.objects.PresentAbsentHistoryProblems.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PresentAbsentHistoryProblems());

		domainObject.setPresentProblems(ims.clinical.vo.domain.PatientPresentingProblemsVoAssembler.extractPatientProblemSet(domainFactory, valueObject.getPresentProblems(), domainObject.getPresentProblems(), domMap));		
		domainObject.setAbsentProblems(ims.clinical.vo.domain.AbsentPatientPresentingProblemVoAssembler.extractAbsentPresentingProblemsSet(domainFactory, valueObject.getAbsentProblems(), domainObject.getAbsentProblems(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getHistoryPresentingProblem() != null && valueObject.getHistoryPresentingProblem().equals(""))
		{
			valueObject.setHistoryPresentingProblem(null);
		}
		domainObject.setHistoryPresentingProblem(valueObject.getHistoryPresentingProblem());
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		ims.core.admin.domain.objects.ClinicalContact value5 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value5 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value5 = domainObject.getClinicalContact();	
			}
			else
			{
				value5 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value5);
		ims.core.admin.domain.objects.CareContext value6 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value6 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value6 = domainObject.getCareContext();	
			}
			else
			{
				value6 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value6);

		return domainObject;
	}

}
