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
 * @author Rory Fitzpatrick
 */
public class IncludeAllergyInDischargeReportsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.IncludeAllergyInDischargeReportsVo copy(ims.core.vo.IncludeAllergyInDischargeReportsVo valueObjectDest, ims.core.vo.IncludeAllergyInDischargeReportsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_IncludeAllergyInDischargeReport(valueObjectSrc.getID_IncludeAllergyInDischargeReport());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// Allergy
		valueObjectDest.setAllergy(valueObjectSrc.getAllergy());
		// IncludeInReport
		valueObjectDest.setIncludeInReport(valueObjectSrc.getIncludeInReport());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createIncludeAllergyInDischargeReportsVoCollectionFromIncludeAllergyInDischargeReport(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.IncludeAllergyInDischargeReport objects.
	 */
	public static ims.core.vo.IncludeAllergyInDischargeReportsVoCollection createIncludeAllergyInDischargeReportsVoCollectionFromIncludeAllergyInDischargeReport(java.util.Set domainObjectSet)	
	{
		return createIncludeAllergyInDischargeReportsVoCollectionFromIncludeAllergyInDischargeReport(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.IncludeAllergyInDischargeReport objects.
	 */
	public static ims.core.vo.IncludeAllergyInDischargeReportsVoCollection createIncludeAllergyInDischargeReportsVoCollectionFromIncludeAllergyInDischargeReport(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.IncludeAllergyInDischargeReportsVoCollection voList = new ims.core.vo.IncludeAllergyInDischargeReportsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.IncludeAllergyInDischargeReport domainObject = (ims.core.clinical.domain.objects.IncludeAllergyInDischargeReport) iterator.next();
			ims.core.vo.IncludeAllergyInDischargeReportsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.IncludeAllergyInDischargeReport objects.
	 */
	public static ims.core.vo.IncludeAllergyInDischargeReportsVoCollection createIncludeAllergyInDischargeReportsVoCollectionFromIncludeAllergyInDischargeReport(java.util.List domainObjectList) 
	{
		return createIncludeAllergyInDischargeReportsVoCollectionFromIncludeAllergyInDischargeReport(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.IncludeAllergyInDischargeReport objects.
	 */
	public static ims.core.vo.IncludeAllergyInDischargeReportsVoCollection createIncludeAllergyInDischargeReportsVoCollectionFromIncludeAllergyInDischargeReport(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.IncludeAllergyInDischargeReportsVoCollection voList = new ims.core.vo.IncludeAllergyInDischargeReportsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.IncludeAllergyInDischargeReport domainObject = (ims.core.clinical.domain.objects.IncludeAllergyInDischargeReport) domainObjectList.get(i);
			ims.core.vo.IncludeAllergyInDischargeReportsVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.IncludeAllergyInDischargeReport set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractIncludeAllergyInDischargeReportSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.IncludeAllergyInDischargeReportsVoCollection voCollection) 
	 {
	 	return extractIncludeAllergyInDischargeReportSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractIncludeAllergyInDischargeReportSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.IncludeAllergyInDischargeReportsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.IncludeAllergyInDischargeReportsVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.IncludeAllergyInDischargeReport domainObject = IncludeAllergyInDischargeReportsVoAssembler.extractIncludeAllergyInDischargeReport(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.IncludeAllergyInDischargeReport list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractIncludeAllergyInDischargeReportList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.IncludeAllergyInDischargeReportsVoCollection voCollection) 
	 {
	 	return extractIncludeAllergyInDischargeReportList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractIncludeAllergyInDischargeReportList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.IncludeAllergyInDischargeReportsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.IncludeAllergyInDischargeReportsVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.IncludeAllergyInDischargeReport domainObject = IncludeAllergyInDischargeReportsVoAssembler.extractIncludeAllergyInDischargeReport(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.IncludeAllergyInDischargeReport object.
	 * @param domainObject ims.core.clinical.domain.objects.IncludeAllergyInDischargeReport
	 */
	 public static ims.core.vo.IncludeAllergyInDischargeReportsVo create(ims.core.clinical.domain.objects.IncludeAllergyInDischargeReport domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.IncludeAllergyInDischargeReport object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.IncludeAllergyInDischargeReportsVo create(DomainObjectMap map, ims.core.clinical.domain.objects.IncludeAllergyInDischargeReport domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.IncludeAllergyInDischargeReportsVo valueObject = (ims.core.vo.IncludeAllergyInDischargeReportsVo) map.getValueObject(domainObject, ims.core.vo.IncludeAllergyInDischargeReportsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.IncludeAllergyInDischargeReportsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.IncludeAllergyInDischargeReport
	 */
	 public static ims.core.vo.IncludeAllergyInDischargeReportsVo insert(ims.core.vo.IncludeAllergyInDischargeReportsVo valueObject, ims.core.clinical.domain.objects.IncludeAllergyInDischargeReport domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.IncludeAllergyInDischargeReport
	 */
	 public static ims.core.vo.IncludeAllergyInDischargeReportsVo insert(DomainObjectMap map, ims.core.vo.IncludeAllergyInDischargeReportsVo valueObject, ims.core.clinical.domain.objects.IncludeAllergyInDischargeReport domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_IncludeAllergyInDischargeReport(domainObject.getId());
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
		// Allergy
		if (domainObject.getAllergy() != null)
		{
			if(domainObject.getAllergy() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAllergy();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAllergy(new ims.core.clinical.vo.PatientAllergyRefVo(id, -1));				
			}
			else
			{
				valueObject.setAllergy(new ims.core.clinical.vo.PatientAllergyRefVo(domainObject.getAllergy().getId(), domainObject.getAllergy().getVersion()));
			}
		}
		// IncludeInReport
		valueObject.setIncludeInReport( domainObject.isIncludeInReport() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.IncludeAllergyInDischargeReport extractIncludeAllergyInDischargeReport(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.IncludeAllergyInDischargeReportsVo valueObject) 
	{
		return 	extractIncludeAllergyInDischargeReport(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.IncludeAllergyInDischargeReport extractIncludeAllergyInDischargeReport(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.IncludeAllergyInDischargeReportsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_IncludeAllergyInDischargeReport();
		ims.core.clinical.domain.objects.IncludeAllergyInDischargeReport domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.IncludeAllergyInDischargeReport)domMap.get(valueObject);
			}
			// ims.core.vo.IncludeAllergyInDischargeReportsVo ID_IncludeAllergyInDischargeReport field is unknown
			domainObject = new ims.core.clinical.domain.objects.IncludeAllergyInDischargeReport();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_IncludeAllergyInDischargeReport());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.IncludeAllergyInDischargeReport)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.IncludeAllergyInDischargeReport) domainFactory.getDomainObject(ims.core.clinical.domain.objects.IncludeAllergyInDischargeReport.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_IncludeAllergyInDischargeReport());

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
		ims.core.clinical.domain.objects.PatientAllergy value2 = null;
		if ( null != valueObject.getAllergy() ) 
		{
			if (valueObject.getAllergy().getBoId() == null)
			{
				if (domMap.get(valueObject.getAllergy()) != null)
				{
					value2 = (ims.core.clinical.domain.objects.PatientAllergy)domMap.get(valueObject.getAllergy());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getAllergy();	
			}
			else
			{
				value2 = (ims.core.clinical.domain.objects.PatientAllergy)domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientAllergy.class, valueObject.getAllergy().getBoId());
			}
		}
		domainObject.setAllergy(value2);
		domainObject.setIncludeInReport(valueObject.getIncludeInReport());

		return domainObject;
	}

}
