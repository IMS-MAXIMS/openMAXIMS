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
public class NeuroReflexesVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.generalmedical.vo.NeuroReflexesVo copy(ims.generalmedical.vo.NeuroReflexesVo valueObjectDest, ims.generalmedical.vo.NeuroReflexesVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_NeuExamReflxs(valueObjectSrc.getID_NeuExamReflxs());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// PeripheralReflexes
		valueObjectDest.setPeripheralReflexes(valueObjectSrc.getPeripheralReflexes());
		// analTests
		valueObjectDest.setAnalTests(valueObjectSrc.getAnalTests());
		// otherTests
		valueObjectDest.setOtherTests(valueObjectSrc.getOtherTests());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// AuthoringCP
		valueObjectDest.setAuthoringCP(valueObjectSrc.getAuthoringCP());
		// AuthoringDateTime
		valueObjectDest.setAuthoringDateTime(valueObjectSrc.getAuthoringDateTime());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createNeuroReflexesVoCollectionFromNeuExamReflxs(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.medical.domain.objects.NeuExamReflxs objects.
	 */
	public static ims.generalmedical.vo.NeuroReflexesVoCollection createNeuroReflexesVoCollectionFromNeuExamReflxs(java.util.Set domainObjectSet)	
	{
		return createNeuroReflexesVoCollectionFromNeuExamReflxs(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.medical.domain.objects.NeuExamReflxs objects.
	 */
	public static ims.generalmedical.vo.NeuroReflexesVoCollection createNeuroReflexesVoCollectionFromNeuExamReflxs(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.generalmedical.vo.NeuroReflexesVoCollection voList = new ims.generalmedical.vo.NeuroReflexesVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.medical.domain.objects.NeuExamReflxs domainObject = (ims.medical.domain.objects.NeuExamReflxs) iterator.next();
			ims.generalmedical.vo.NeuroReflexesVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.medical.domain.objects.NeuExamReflxs objects.
	 */
	public static ims.generalmedical.vo.NeuroReflexesVoCollection createNeuroReflexesVoCollectionFromNeuExamReflxs(java.util.List domainObjectList) 
	{
		return createNeuroReflexesVoCollectionFromNeuExamReflxs(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.medical.domain.objects.NeuExamReflxs objects.
	 */
	public static ims.generalmedical.vo.NeuroReflexesVoCollection createNeuroReflexesVoCollectionFromNeuExamReflxs(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.generalmedical.vo.NeuroReflexesVoCollection voList = new ims.generalmedical.vo.NeuroReflexesVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.medical.domain.objects.NeuExamReflxs domainObject = (ims.medical.domain.objects.NeuExamReflxs) domainObjectList.get(i);
			ims.generalmedical.vo.NeuroReflexesVo vo = create(map, domainObject);

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
	 * Create the ims.medical.domain.objects.NeuExamReflxs set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractNeuExamReflxsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.NeuroReflexesVoCollection voCollection) 
	 {
	 	return extractNeuExamReflxsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractNeuExamReflxsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.NeuroReflexesVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.generalmedical.vo.NeuroReflexesVo vo = voCollection.get(i);
			ims.medical.domain.objects.NeuExamReflxs domainObject = NeuroReflexesVoAssembler.extractNeuExamReflxs(domainFactory, vo, domMap);

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
	 * Create the ims.medical.domain.objects.NeuExamReflxs list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractNeuExamReflxsList(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.NeuroReflexesVoCollection voCollection) 
	 {
	 	return extractNeuExamReflxsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractNeuExamReflxsList(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.NeuroReflexesVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.generalmedical.vo.NeuroReflexesVo vo = voCollection.get(i);
			ims.medical.domain.objects.NeuExamReflxs domainObject = NeuroReflexesVoAssembler.extractNeuExamReflxs(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.medical.domain.objects.NeuExamReflxs object.
	 * @param domainObject ims.medical.domain.objects.NeuExamReflxs
	 */
	 public static ims.generalmedical.vo.NeuroReflexesVo create(ims.medical.domain.objects.NeuExamReflxs domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.medical.domain.objects.NeuExamReflxs object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.generalmedical.vo.NeuroReflexesVo create(DomainObjectMap map, ims.medical.domain.objects.NeuExamReflxs domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.generalmedical.vo.NeuroReflexesVo valueObject = (ims.generalmedical.vo.NeuroReflexesVo) map.getValueObject(domainObject, ims.generalmedical.vo.NeuroReflexesVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.generalmedical.vo.NeuroReflexesVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.medical.domain.objects.NeuExamReflxs
	 */
	 public static ims.generalmedical.vo.NeuroReflexesVo insert(ims.generalmedical.vo.NeuroReflexesVo valueObject, ims.medical.domain.objects.NeuExamReflxs domainObject) 
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
	 * @param domainObject ims.medical.domain.objects.NeuExamReflxs
	 */
	 public static ims.generalmedical.vo.NeuroReflexesVo insert(DomainObjectMap map, ims.generalmedical.vo.NeuroReflexesVo valueObject, ims.medical.domain.objects.NeuExamReflxs domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_NeuExamReflxs(domainObject.getId());
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
			
		// PeripheralReflexes
		valueObject.setPeripheralReflexes(ims.generalmedical.vo.domain.NeuroReflexPeripheralTestsVoAssembler.createNeuroReflexPeripheralTestsVoCollectionFromNeuroReflexesPeripheralFindings(map, domainObject.getPeripheralReflexes()) );
		// analTests
		valueObject.setAnalTests(ims.generalmedical.vo.domain.NeuroReflexAnalTestsVoAssembler.createNeuroReflexAnalTestsVoCollectionFromNeuroReflexesAnalTests(map, domainObject.getAnalTests()) );
		// otherTests
		valueObject.setOtherTests(ims.generalmedical.vo.domain.NeuroReflexOtherTestsVoAssembler.createNeuroReflexOtherTestsVoCollectionFromNeuroReflexesOtherFindings(map, domainObject.getOtherTests()) );
		// ClinicalContact
		valueObject.setClinicalContact(ims.core.vo.domain.ClinicalContactShortVoAssembler.create(map, domainObject.getClinicalContact()) );
		// AuthoringCP
		valueObject.setAuthoringCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getAuthoringCP()) );
		// AuthoringDateTime
		java.util.Date AuthoringDateTime = domainObject.getAuthoringDateTime();
		if ( null != AuthoringDateTime ) 
		{
			valueObject.setAuthoringDateTime(new ims.framework.utils.DateTime(AuthoringDateTime) );
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
	public static ims.medical.domain.objects.NeuExamReflxs extractNeuExamReflxs(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.NeuroReflexesVo valueObject) 
	{
		return 	extractNeuExamReflxs(domainFactory, valueObject, new HashMap());
	}

	public static ims.medical.domain.objects.NeuExamReflxs extractNeuExamReflxs(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.NeuroReflexesVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_NeuExamReflxs();
		ims.medical.domain.objects.NeuExamReflxs domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.medical.domain.objects.NeuExamReflxs)domMap.get(valueObject);
			}
			// ims.generalmedical.vo.NeuroReflexesVo ID_NeuExamReflxs field is unknown
			domainObject = new ims.medical.domain.objects.NeuExamReflxs();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_NeuExamReflxs());
			if (domMap.get(key) != null)
			{
				return (ims.medical.domain.objects.NeuExamReflxs)domMap.get(key);
			}
			domainObject = (ims.medical.domain.objects.NeuExamReflxs) domainFactory.getDomainObject(ims.medical.domain.objects.NeuExamReflxs.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_NeuExamReflxs());

		domainObject.setPeripheralReflexes(ims.generalmedical.vo.domain.NeuroReflexPeripheralTestsVoAssembler.extractNeuroReflexesPeripheralFindingsSet(domainFactory, valueObject.getPeripheralReflexes(), domainObject.getPeripheralReflexes(), domMap));		
		domainObject.setAnalTests(ims.generalmedical.vo.domain.NeuroReflexAnalTestsVoAssembler.extractNeuroReflexesAnalTestsSet(domainFactory, valueObject.getAnalTests(), domainObject.getAnalTests(), domMap));		
		domainObject.setOtherTests(ims.generalmedical.vo.domain.NeuroReflexOtherTestsVoAssembler.extractNeuroReflexesOtherFindingsSet(domainFactory, valueObject.getOtherTests(), domainObject.getOtherTests(), domMap));		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.ClinicalContact value4 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value4 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else
			{
				value4 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value4);
		domainObject.setAuthoringCP(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getAuthoringCP(), domMap));
		ims.framework.utils.DateTime dateTime6 = valueObject.getAuthoringDateTime();
		java.util.Date value6 = null;
		if ( dateTime6 != null ) 
		{
			value6 = dateTime6.getJavaDate();
		}
		domainObject.setAuthoringDateTime(value6);
		ims.core.admin.domain.objects.CareContext value7 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value7 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value7 = domainObject.getCareContext();	
			}
			else
			{
				value7 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value7);

		return domainObject;
	}

}
