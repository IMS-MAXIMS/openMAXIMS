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
package ims.ocrr.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Marius Mihalec
 */
public class OcsOrderWebServiceVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.OcsOrderWebServiceVo copy(ims.ocrr.vo.OcsOrderWebServiceVo valueObjectDest, ims.ocrr.vo.OcsOrderWebServiceVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_OcsOrderSession(valueObjectSrc.getID_OcsOrderSession());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// Investigations
		valueObjectDest.setInvestigations(valueObjectSrc.getInvestigations());
		// HasNewOrUpdatedResults
		valueObjectDest.setHasNewOrUpdatedResults(valueObjectSrc.getHasNewOrUpdatedResults());
		// ResponsibleClinician
		valueObjectDest.setResponsibleClinician(valueObjectSrc.getResponsibleClinician());
		// ResponsibleGp
		valueObjectDest.setResponsibleGp(valueObjectSrc.getResponsibleGp());
		// PatientLocation
		valueObjectDest.setPatientLocation(valueObjectSrc.getPatientLocation());
		// PatientClinic
		valueObjectDest.setPatientClinic(valueObjectSrc.getPatientClinic());
		// OrderedBy
		valueObjectDest.setOrderedBy(valueObjectSrc.getOrderedBy());
		// SysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createOcsOrderWebServiceVoCollectionFromOcsOrderSession(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OcsOrderSession objects.
	 */
	public static ims.ocrr.vo.OcsOrderWebServiceVoCollection createOcsOrderWebServiceVoCollectionFromOcsOrderSession(java.util.Set domainObjectSet)	
	{
		return createOcsOrderWebServiceVoCollectionFromOcsOrderSession(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OcsOrderSession objects.
	 */
	public static ims.ocrr.vo.OcsOrderWebServiceVoCollection createOcsOrderWebServiceVoCollectionFromOcsOrderSession(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.OcsOrderWebServiceVoCollection voList = new ims.ocrr.vo.OcsOrderWebServiceVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ocrr.orderingresults.domain.objects.OcsOrderSession domainObject = (ims.ocrr.orderingresults.domain.objects.OcsOrderSession) iterator.next();
			ims.ocrr.vo.OcsOrderWebServiceVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.OcsOrderSession objects.
	 */
	public static ims.ocrr.vo.OcsOrderWebServiceVoCollection createOcsOrderWebServiceVoCollectionFromOcsOrderSession(java.util.List domainObjectList) 
	{
		return createOcsOrderWebServiceVoCollectionFromOcsOrderSession(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.OcsOrderSession objects.
	 */
	public static ims.ocrr.vo.OcsOrderWebServiceVoCollection createOcsOrderWebServiceVoCollectionFromOcsOrderSession(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.OcsOrderWebServiceVoCollection voList = new ims.ocrr.vo.OcsOrderWebServiceVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.orderingresults.domain.objects.OcsOrderSession domainObject = (ims.ocrr.orderingresults.domain.objects.OcsOrderSession) domainObjectList.get(i);
			ims.ocrr.vo.OcsOrderWebServiceVo vo = create(map, domainObject);

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
	 * Create the ims.ocrr.orderingresults.domain.objects.OcsOrderSession set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractOcsOrderSessionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OcsOrderWebServiceVoCollection voCollection) 
	 {
	 	return extractOcsOrderSessionSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOcsOrderSessionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OcsOrderWebServiceVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.OcsOrderWebServiceVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OcsOrderSession domainObject = OcsOrderWebServiceVoAssembler.extractOcsOrderSession(domainFactory, vo, domMap);

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
	 * Create the ims.ocrr.orderingresults.domain.objects.OcsOrderSession list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractOcsOrderSessionList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OcsOrderWebServiceVoCollection voCollection) 
	 {
	 	return extractOcsOrderSessionList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOcsOrderSessionList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OcsOrderWebServiceVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.OcsOrderWebServiceVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OcsOrderSession domainObject = OcsOrderWebServiceVoAssembler.extractOcsOrderSession(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.OcsOrderSession object.
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.OcsOrderSession
	 */
	 public static ims.ocrr.vo.OcsOrderWebServiceVo create(ims.ocrr.orderingresults.domain.objects.OcsOrderSession domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.OcsOrderSession object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ocrr.vo.OcsOrderWebServiceVo create(DomainObjectMap map, ims.ocrr.orderingresults.domain.objects.OcsOrderSession domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.OcsOrderWebServiceVo valueObject = (ims.ocrr.vo.OcsOrderWebServiceVo) map.getValueObject(domainObject, ims.ocrr.vo.OcsOrderWebServiceVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.OcsOrderWebServiceVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.OcsOrderSession
	 */
	 public static ims.ocrr.vo.OcsOrderWebServiceVo insert(ims.ocrr.vo.OcsOrderWebServiceVo valueObject, ims.ocrr.orderingresults.domain.objects.OcsOrderSession domainObject) 
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
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.OcsOrderSession
	 */
	 public static ims.ocrr.vo.OcsOrderWebServiceVo insert(DomainObjectMap map, ims.ocrr.vo.OcsOrderWebServiceVo valueObject, ims.ocrr.orderingresults.domain.objects.OcsOrderSession domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_OcsOrderSession(domainObject.getId());
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
			
		// Patient
		valueObject.setPatient(ims.core.vo.domain.PatientLiteVoAssembler.create(map, domainObject.getPatient()) );
		// Investigations
		valueObject.setInvestigations(ims.ocrr.vo.domain.OrderInvestigationWebServiceVoAssembler.createOrderInvestigationWebServiceVoCollectionFromOrderInvestigation(map, domainObject.getInvestigations()) );
		// HasNewOrUpdatedResults
		valueObject.setHasNewOrUpdatedResults( domainObject.isHasNewOrUpdatedResults() );
		// ResponsibleClinician
		valueObject.setResponsibleClinician(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getResponsibleClinician()) );
		// ResponsibleGp
		valueObject.setResponsibleGp(ims.core.vo.domain.GpLiteVoAssembler.create(map, domainObject.getResponsibleGp()) );
		// PatientLocation
		valueObject.setPatientLocation(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getPatientLocation()) );
		// PatientClinic
		valueObject.setPatientClinic(ims.core.vo.domain.ClinicLiteVoAssembler.create(map, domainObject.getPatientClinic()) );
		// OrderedBy
		valueObject.setOrderedBy(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getOrderedBy()) );
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
	public static ims.ocrr.orderingresults.domain.objects.OcsOrderSession extractOcsOrderSession(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OcsOrderWebServiceVo valueObject) 
	{
		return 	extractOcsOrderSession(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.orderingresults.domain.objects.OcsOrderSession extractOcsOrderSession(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OcsOrderWebServiceVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_OcsOrderSession();
		ims.ocrr.orderingresults.domain.objects.OcsOrderSession domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.OcsOrderSession)domMap.get(valueObject);
			}
			// ims.ocrr.vo.OcsOrderWebServiceVo ID_OcsOrderSession field is unknown
			domainObject = new ims.ocrr.orderingresults.domain.objects.OcsOrderSession();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_OcsOrderSession());
			if (domMap.get(key) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.OcsOrderSession)domMap.get(key);
			}
			domainObject = (ims.ocrr.orderingresults.domain.objects.OcsOrderSession) domainFactory.getDomainObject(ims.ocrr.orderingresults.domain.objects.OcsOrderSession.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_OcsOrderSession());

		domainObject.setPatient(ims.core.vo.domain.PatientLiteVoAssembler.extractPatient(domainFactory, valueObject.getPatient(), domMap));

		// SaveAsRefVO treated as RefValueObject
		ims.ocrr.orderingresults.vo.OrderInvestigationRefVoCollection refCollection2 = new ims.ocrr.orderingresults.vo.OrderInvestigationRefVoCollection();
		if (valueObject.getInvestigations() != null)
		{
			for (int i2=0; i2<valueObject.getInvestigations().size(); i2++)
			{
				ims.ocrr.orderingresults.vo.OrderInvestigationRefVo ref2 = (ims.ocrr.orderingresults.vo.OrderInvestigationRefVo)valueObject.getInvestigations().get(i2);
				refCollection2.add(ref2);
			}
		}
		int size2 = (null == refCollection2) ? 0 : refCollection2.size();		
		java.util.Set domainInvestigations2 = domainObject.getInvestigations();
		if (domainInvestigations2 == null)
		{
			domainInvestigations2 = new java.util.HashSet();
		}
		java.util.Set newSet2  = new java.util.HashSet();
		for(int i=0; i<size2; i++) 
		{
			ims.ocrr.orderingresults.vo.OrderInvestigationRefVo vo = refCollection2.get(i);					
			ims.ocrr.orderingresults.domain.objects.OrderInvestigation dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation)domainFactory.getDomainObject( ims.ocrr.orderingresults.domain.objects.OrderInvestigation.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainInvestigations2.contains(dom))
			{
				domainInvestigations2.add(dom);
			}
			newSet2.add(dom);			
		}
		java.util.Set removedSet2 = new java.util.HashSet();
		java.util.Iterator iter2 = domainInvestigations2.iterator();
		//Find out which objects need to be removed
		while (iter2.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter2.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet2.contains(o))
			{
				removedSet2.add(o);
			}
		}
		iter2 = removedSet2.iterator();
		//Remove the unwanted objects
		while (iter2.hasNext())
		{
			domainInvestigations2.remove(iter2.next());
		}		
		
		domainObject.setInvestigations(domainInvestigations2);		
		domainObject.setHasNewOrUpdatedResults(valueObject.getHasNewOrUpdatedResults());
		domainObject.setResponsibleClinician(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getResponsibleClinician(), domMap));
		domainObject.setResponsibleGp(ims.core.vo.domain.GpLiteVoAssembler.extractGp(domainFactory, valueObject.getResponsibleGp(), domMap));
		domainObject.setPatientLocation(ims.core.vo.domain.LocationLiteVoAssembler.extractLocation(domainFactory, valueObject.getPatientLocation(), domMap));
		domainObject.setPatientClinic(ims.core.vo.domain.ClinicLiteVoAssembler.extractClinic(domainFactory, valueObject.getPatientClinic(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value8 = null;
		if ( null != valueObject.getOrderedBy() ) 
		{
			if (valueObject.getOrderedBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getOrderedBy()) != null)
				{
					value8 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getOrderedBy());
				}
			}
			else
			{
				value8 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getOrderedBy().getBoId());
			}
		}
		domainObject.setOrderedBy(value8);

		return domainObject;
	}

}
