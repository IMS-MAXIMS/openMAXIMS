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
package ims.oncology.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Barbara Worwood
 */
public class WaitingTimeFailuresVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.oncology.vo.WaitingTimeFailuresVo copy(ims.oncology.vo.WaitingTimeFailuresVo valueObjectDest, ims.oncology.vo.WaitingTimeFailuresVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_WaitingTimeFailures(valueObjectSrc.getID_WaitingTimeFailures());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// NHSNumber
		valueObjectDest.setNHSNumber(valueObjectSrc.getNHSNumber());
		// Reason
		valueObjectDest.setReason(valueObjectSrc.getReason());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createWaitingTimeFailuresVoCollectionFromWaitingTimeFailures(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.waitingtimes.domain.objects.WaitingTimeFailures objects.
	 */
	public static ims.oncology.vo.WaitingTimeFailuresVoCollection createWaitingTimeFailuresVoCollectionFromWaitingTimeFailures(java.util.Set domainObjectSet)	
	{
		return createWaitingTimeFailuresVoCollectionFromWaitingTimeFailures(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.waitingtimes.domain.objects.WaitingTimeFailures objects.
	 */
	public static ims.oncology.vo.WaitingTimeFailuresVoCollection createWaitingTimeFailuresVoCollectionFromWaitingTimeFailures(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.oncology.vo.WaitingTimeFailuresVoCollection voList = new ims.oncology.vo.WaitingTimeFailuresVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.oncology.waitingtimes.domain.objects.WaitingTimeFailures domainObject = (ims.oncology.waitingtimes.domain.objects.WaitingTimeFailures) iterator.next();
			ims.oncology.vo.WaitingTimeFailuresVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.oncology.waitingtimes.domain.objects.WaitingTimeFailures objects.
	 */
	public static ims.oncology.vo.WaitingTimeFailuresVoCollection createWaitingTimeFailuresVoCollectionFromWaitingTimeFailures(java.util.List domainObjectList) 
	{
		return createWaitingTimeFailuresVoCollectionFromWaitingTimeFailures(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.waitingtimes.domain.objects.WaitingTimeFailures objects.
	 */
	public static ims.oncology.vo.WaitingTimeFailuresVoCollection createWaitingTimeFailuresVoCollectionFromWaitingTimeFailures(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.oncology.vo.WaitingTimeFailuresVoCollection voList = new ims.oncology.vo.WaitingTimeFailuresVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.waitingtimes.domain.objects.WaitingTimeFailures domainObject = (ims.oncology.waitingtimes.domain.objects.WaitingTimeFailures) domainObjectList.get(i);
			ims.oncology.vo.WaitingTimeFailuresVo vo = create(map, domainObject);

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
	 * Create the ims.oncology.waitingtimes.domain.objects.WaitingTimeFailures set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractWaitingTimeFailuresSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.WaitingTimeFailuresVoCollection voCollection) 
	 {
	 	return extractWaitingTimeFailuresSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractWaitingTimeFailuresSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.WaitingTimeFailuresVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.WaitingTimeFailuresVo vo = voCollection.get(i);
			ims.oncology.waitingtimes.domain.objects.WaitingTimeFailures domainObject = WaitingTimeFailuresVoAssembler.extractWaitingTimeFailures(domainFactory, vo, domMap);

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
	 * Create the ims.oncology.waitingtimes.domain.objects.WaitingTimeFailures list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractWaitingTimeFailuresList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.WaitingTimeFailuresVoCollection voCollection) 
	 {
	 	return extractWaitingTimeFailuresList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractWaitingTimeFailuresList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.WaitingTimeFailuresVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.WaitingTimeFailuresVo vo = voCollection.get(i);
			ims.oncology.waitingtimes.domain.objects.WaitingTimeFailures domainObject = WaitingTimeFailuresVoAssembler.extractWaitingTimeFailures(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.oncology.waitingtimes.domain.objects.WaitingTimeFailures object.
	 * @param domainObject ims.oncology.waitingtimes.domain.objects.WaitingTimeFailures
	 */
	 public static ims.oncology.vo.WaitingTimeFailuresVo create(ims.oncology.waitingtimes.domain.objects.WaitingTimeFailures domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.oncology.waitingtimes.domain.objects.WaitingTimeFailures object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.oncology.vo.WaitingTimeFailuresVo create(DomainObjectMap map, ims.oncology.waitingtimes.domain.objects.WaitingTimeFailures domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.oncology.vo.WaitingTimeFailuresVo valueObject = (ims.oncology.vo.WaitingTimeFailuresVo) map.getValueObject(domainObject, ims.oncology.vo.WaitingTimeFailuresVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.oncology.vo.WaitingTimeFailuresVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.oncology.waitingtimes.domain.objects.WaitingTimeFailures
	 */
	 public static ims.oncology.vo.WaitingTimeFailuresVo insert(ims.oncology.vo.WaitingTimeFailuresVo valueObject, ims.oncology.waitingtimes.domain.objects.WaitingTimeFailures domainObject) 
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
	 * @param domainObject ims.oncology.waitingtimes.domain.objects.WaitingTimeFailures
	 */
	 public static ims.oncology.vo.WaitingTimeFailuresVo insert(DomainObjectMap map, ims.oncology.vo.WaitingTimeFailuresVo valueObject, ims.oncology.waitingtimes.domain.objects.WaitingTimeFailures domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_WaitingTimeFailures(domainObject.getId());
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
		// Patient
		if (domainObject.getPatient() != null)
		{
			if(domainObject.getPatient() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPatient();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPatient(new ims.core.patient.vo.PatientRefVo(id, -1));				
			}
			else
			{
				valueObject.setPatient(new ims.core.patient.vo.PatientRefVo(domainObject.getPatient().getId(), domainObject.getPatient().getVersion()));
			}
		}
		// NHSNumber
		valueObject.setNHSNumber(domainObject.getNHSNumber());
		// Reason
		valueObject.setReason(domainObject.getReason());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.waitingtimes.domain.objects.WaitingTimeFailures extractWaitingTimeFailures(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.WaitingTimeFailuresVo valueObject) 
	{
		return 	extractWaitingTimeFailures(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.waitingtimes.domain.objects.WaitingTimeFailures extractWaitingTimeFailures(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.WaitingTimeFailuresVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_WaitingTimeFailures();
		ims.oncology.waitingtimes.domain.objects.WaitingTimeFailures domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.oncology.waitingtimes.domain.objects.WaitingTimeFailures)domMap.get(valueObject);
			}
			// ims.oncology.vo.WaitingTimeFailuresVo ID_WaitingTimeFailures field is unknown
			domainObject = new ims.oncology.waitingtimes.domain.objects.WaitingTimeFailures();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_WaitingTimeFailures());
			if (domMap.get(key) != null)
			{
				return (ims.oncology.waitingtimes.domain.objects.WaitingTimeFailures)domMap.get(key);
			}
			domainObject = (ims.oncology.waitingtimes.domain.objects.WaitingTimeFailures) domainFactory.getDomainObject(ims.oncology.waitingtimes.domain.objects.WaitingTimeFailures.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_WaitingTimeFailures());

		ims.core.admin.domain.objects.CareContext value1 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value1 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getCareContext();	
			}
			else
			{
				value1 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value1);
		ims.core.patient.domain.objects.Patient value2 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value2 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getPatient();	
			}
			else
			{
				value2 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value2);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNHSNumber() != null && valueObject.getNHSNumber().equals(""))
		{
			valueObject.setNHSNumber(null);
		}
		domainObject.setNHSNumber(valueObject.getNHSNumber());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReason() != null && valueObject.getReason().equals(""))
		{
			valueObject.setReason(null);
		}
		domainObject.setReason(valueObject.getReason());

		return domainObject;
	}

}
