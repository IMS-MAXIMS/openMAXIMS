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
 * @author Cristian Belciug
 */
public class ResultDetailsForOrderInvestigationLiteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.ResultDetailsForOrderInvestigationLiteVo copy(ims.ocrr.vo.ResultDetailsForOrderInvestigationLiteVo valueObjectDest, ims.ocrr.vo.ResultDetailsForOrderInvestigationLiteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ResultDetails(valueObjectSrc.getID_ResultDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// PathologyResultDetails
		valueObjectDest.setPathologyResultDetails(valueObjectSrc.getPathologyResultDetails());
		// ClinicalResultDetails
		valueObjectDest.setClinicalResultDetails(valueObjectSrc.getClinicalResultDetails());
		// DocumentResultDetails
		valueObjectDest.setDocumentResultDetails(valueObjectSrc.getDocumentResultDetails());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createResultDetailsForOrderInvestigationLiteVoCollectionFromResultDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.ResultDetails objects.
	 */
	public static ims.ocrr.vo.ResultDetailsForOrderInvestigationLiteVoCollection createResultDetailsForOrderInvestigationLiteVoCollectionFromResultDetails(java.util.Set domainObjectSet)	
	{
		return createResultDetailsForOrderInvestigationLiteVoCollectionFromResultDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.ResultDetails objects.
	 */
	public static ims.ocrr.vo.ResultDetailsForOrderInvestigationLiteVoCollection createResultDetailsForOrderInvestigationLiteVoCollectionFromResultDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.ResultDetailsForOrderInvestigationLiteVoCollection voList = new ims.ocrr.vo.ResultDetailsForOrderInvestigationLiteVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ocrr.orderingresults.domain.objects.ResultDetails domainObject = (ims.ocrr.orderingresults.domain.objects.ResultDetails) iterator.next();
			ims.ocrr.vo.ResultDetailsForOrderInvestigationLiteVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.ResultDetails objects.
	 */
	public static ims.ocrr.vo.ResultDetailsForOrderInvestigationLiteVoCollection createResultDetailsForOrderInvestigationLiteVoCollectionFromResultDetails(java.util.List domainObjectList) 
	{
		return createResultDetailsForOrderInvestigationLiteVoCollectionFromResultDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.ResultDetails objects.
	 */
	public static ims.ocrr.vo.ResultDetailsForOrderInvestigationLiteVoCollection createResultDetailsForOrderInvestigationLiteVoCollectionFromResultDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.ResultDetailsForOrderInvestigationLiteVoCollection voList = new ims.ocrr.vo.ResultDetailsForOrderInvestigationLiteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.orderingresults.domain.objects.ResultDetails domainObject = (ims.ocrr.orderingresults.domain.objects.ResultDetails) domainObjectList.get(i);
			ims.ocrr.vo.ResultDetailsForOrderInvestigationLiteVo vo = create(map, domainObject);

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
	 * Create the ims.ocrr.orderingresults.domain.objects.ResultDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractResultDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ResultDetailsForOrderInvestigationLiteVoCollection voCollection) 
	 {
	 	return extractResultDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractResultDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ResultDetailsForOrderInvestigationLiteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.ResultDetailsForOrderInvestigationLiteVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.ResultDetails domainObject = ResultDetailsForOrderInvestigationLiteVoAssembler.extractResultDetails(domainFactory, vo, domMap);

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
	 * Create the ims.ocrr.orderingresults.domain.objects.ResultDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractResultDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ResultDetailsForOrderInvestigationLiteVoCollection voCollection) 
	 {
	 	return extractResultDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractResultDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ResultDetailsForOrderInvestigationLiteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.ResultDetailsForOrderInvestigationLiteVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.ResultDetails domainObject = ResultDetailsForOrderInvestigationLiteVoAssembler.extractResultDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.ResultDetails object.
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.ResultDetails
	 */
	 public static ims.ocrr.vo.ResultDetailsForOrderInvestigationLiteVo create(ims.ocrr.orderingresults.domain.objects.ResultDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.ResultDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ocrr.vo.ResultDetailsForOrderInvestigationLiteVo create(DomainObjectMap map, ims.ocrr.orderingresults.domain.objects.ResultDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.ResultDetailsForOrderInvestigationLiteVo valueObject = (ims.ocrr.vo.ResultDetailsForOrderInvestigationLiteVo) map.getValueObject(domainObject, ims.ocrr.vo.ResultDetailsForOrderInvestigationLiteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.ResultDetailsForOrderInvestigationLiteVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.ResultDetails
	 */
	 public static ims.ocrr.vo.ResultDetailsForOrderInvestigationLiteVo insert(ims.ocrr.vo.ResultDetailsForOrderInvestigationLiteVo valueObject, ims.ocrr.orderingresults.domain.objects.ResultDetails domainObject) 
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
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.ResultDetails
	 */
	 public static ims.ocrr.vo.ResultDetailsForOrderInvestigationLiteVo insert(DomainObjectMap map, ims.ocrr.vo.ResultDetailsForOrderInvestigationLiteVo valueObject, ims.ocrr.orderingresults.domain.objects.ResultDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ResultDetails(domainObject.getId());
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
			
		// PathologyResultDetails
		valueObject.setPathologyResultDetails(ims.ocrr.vo.domain.PathResultDetailsShortVoAssembler.createPathResultDetailsShortVoCollectionFromPathResultDetails(map, domainObject.getPathologyResultDetails()) );
		// ClinicalResultDetails
		valueObject.setClinicalResultDetails(ims.ocrr.vo.domain.RadResultDetailsVoAssembler.create(map, domainObject.getClinicalResultDetails()) );
		// DocumentResultDetails
		if (domainObject.getDocumentResultDetails() != null)
		{
			if(domainObject.getDocumentResultDetails() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getDocumentResultDetails();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setDocumentResultDetails(new ims.core.documents.vo.PatientDocumentRefVo(id, -1));				
			}
			else
			{
				valueObject.setDocumentResultDetails(new ims.core.documents.vo.PatientDocumentRefVo(domainObject.getDocumentResultDetails().getId(), domainObject.getDocumentResultDetails().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.orderingresults.domain.objects.ResultDetails extractResultDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ResultDetailsForOrderInvestigationLiteVo valueObject) 
	{
		return 	extractResultDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.orderingresults.domain.objects.ResultDetails extractResultDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ResultDetailsForOrderInvestigationLiteVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ResultDetails();
		ims.ocrr.orderingresults.domain.objects.ResultDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.ResultDetails)domMap.get(valueObject);
			}
			// ims.ocrr.vo.ResultDetailsForOrderInvestigationLiteVo ID_ResultDetails field is unknown
			domainObject = new ims.ocrr.orderingresults.domain.objects.ResultDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ResultDetails());
			if (domMap.get(key) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.ResultDetails)domMap.get(key);
			}
			domainObject = (ims.ocrr.orderingresults.domain.objects.ResultDetails) domainFactory.getDomainObject(ims.ocrr.orderingresults.domain.objects.ResultDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ResultDetails());

		domainObject.setPathologyResultDetails(ims.ocrr.vo.domain.PathResultDetailsShortVoAssembler.extractPathResultDetailsSet(domainFactory, valueObject.getPathologyResultDetails(), domainObject.getPathologyResultDetails(), domMap));		
		domainObject.setClinicalResultDetails(ims.ocrr.vo.domain.RadResultDetailsVoAssembler.extractClinicalResultDetail(domainFactory, valueObject.getClinicalResultDetails(), domMap));
		ims.core.documents.domain.objects.PatientDocument value3 = null;
		if ( null != valueObject.getDocumentResultDetails() ) 
		{
			if (valueObject.getDocumentResultDetails().getBoId() == null)
			{
				if (domMap.get(valueObject.getDocumentResultDetails()) != null)
				{
					value3 = (ims.core.documents.domain.objects.PatientDocument)domMap.get(valueObject.getDocumentResultDetails());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getDocumentResultDetails();	
			}
			else
			{
				value3 = (ims.core.documents.domain.objects.PatientDocument)domainFactory.getDomainObject(ims.core.documents.domain.objects.PatientDocument.class, valueObject.getDocumentResultDetails().getBoId());
			}
		}
		domainObject.setDocumentResultDetails(value3);

		return domainObject;
	}

}
