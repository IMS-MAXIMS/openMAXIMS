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
package ims.ocrr.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class ResultDetailsForNewResultSpecDocVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.ResultDetailsForNewResultSpecDocVo copy(ims.ocrr.vo.ResultDetailsForNewResultSpecDocVo valueObjectDest, ims.ocrr.vo.ResultDetailsForNewResultSpecDocVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ResultDetails(valueObjectSrc.getID_ResultDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// DocumentResultDetails
		valueObjectDest.setDocumentResultDetails(valueObjectSrc.getDocumentResultDetails());
		// PathologyResultDetails
		valueObjectDest.setPathologyResultDetails(valueObjectSrc.getPathologyResultDetails());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createResultDetailsForNewResultSpecDocVoCollectionFromResultDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.ResultDetails objects.
	 */
	public static ims.ocrr.vo.ResultDetailsForNewResultSpecDocVoCollection createResultDetailsForNewResultSpecDocVoCollectionFromResultDetails(java.util.Set domainObjectSet)	
	{
		return createResultDetailsForNewResultSpecDocVoCollectionFromResultDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.ResultDetails objects.
	 */
	public static ims.ocrr.vo.ResultDetailsForNewResultSpecDocVoCollection createResultDetailsForNewResultSpecDocVoCollectionFromResultDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.ResultDetailsForNewResultSpecDocVoCollection voList = new ims.ocrr.vo.ResultDetailsForNewResultSpecDocVoCollection();
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
			ims.ocrr.vo.ResultDetailsForNewResultSpecDocVo vo = create(map, domainObject);
			
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
	public static ims.ocrr.vo.ResultDetailsForNewResultSpecDocVoCollection createResultDetailsForNewResultSpecDocVoCollectionFromResultDetails(java.util.List domainObjectList) 
	{
		return createResultDetailsForNewResultSpecDocVoCollectionFromResultDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.ResultDetails objects.
	 */
	public static ims.ocrr.vo.ResultDetailsForNewResultSpecDocVoCollection createResultDetailsForNewResultSpecDocVoCollectionFromResultDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.ResultDetailsForNewResultSpecDocVoCollection voList = new ims.ocrr.vo.ResultDetailsForNewResultSpecDocVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.orderingresults.domain.objects.ResultDetails domainObject = (ims.ocrr.orderingresults.domain.objects.ResultDetails) domainObjectList.get(i);
			ims.ocrr.vo.ResultDetailsForNewResultSpecDocVo vo = create(map, domainObject);

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
	 public static java.util.Set extractResultDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ResultDetailsForNewResultSpecDocVoCollection voCollection) 
	 {
	 	return extractResultDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractResultDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ResultDetailsForNewResultSpecDocVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.ResultDetailsForNewResultSpecDocVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.ResultDetails domainObject = ResultDetailsForNewResultSpecDocVoAssembler.extractResultDetails(domainFactory, vo, domMap);

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
	 public static java.util.List extractResultDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ResultDetailsForNewResultSpecDocVoCollection voCollection) 
	 {
	 	return extractResultDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractResultDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ResultDetailsForNewResultSpecDocVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.ResultDetailsForNewResultSpecDocVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.ResultDetails domainObject = ResultDetailsForNewResultSpecDocVoAssembler.extractResultDetails(domainFactory, vo, domMap);

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
	 public static ims.ocrr.vo.ResultDetailsForNewResultSpecDocVo create(ims.ocrr.orderingresults.domain.objects.ResultDetails domainObject) 
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
	  public static ims.ocrr.vo.ResultDetailsForNewResultSpecDocVo create(DomainObjectMap map, ims.ocrr.orderingresults.domain.objects.ResultDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.ResultDetailsForNewResultSpecDocVo valueObject = (ims.ocrr.vo.ResultDetailsForNewResultSpecDocVo) map.getValueObject(domainObject, ims.ocrr.vo.ResultDetailsForNewResultSpecDocVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.ResultDetailsForNewResultSpecDocVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.ocrr.vo.ResultDetailsForNewResultSpecDocVo insert(ims.ocrr.vo.ResultDetailsForNewResultSpecDocVo valueObject, ims.ocrr.orderingresults.domain.objects.ResultDetails domainObject) 
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
	 public static ims.ocrr.vo.ResultDetailsForNewResultSpecDocVo insert(DomainObjectMap map, ims.ocrr.vo.ResultDetailsForNewResultSpecDocVo valueObject, ims.ocrr.orderingresults.domain.objects.ResultDetails domainObject) 
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
			
		// DocumentResultDetails
		valueObject.setDocumentResultDetails(ims.core.vo.domain.PatientDocumentVoAssembler.create(map, domainObject.getDocumentResultDetails()) );
		// PathologyResultDetails
		ims.ocrr.orderingresults.vo.PathResultDetailsRefVoCollection PathologyResultDetails = new ims.ocrr.orderingresults.vo.PathResultDetailsRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getPathologyResultDetails().iterator(); iterator.hasNext(); ) 
		{
			ims.ocrr.orderingresults.domain.objects.PathResultDetails tmp = (ims.ocrr.orderingresults.domain.objects.PathResultDetails)iterator.next();
			if (tmp != null)
				PathologyResultDetails.add(new ims.ocrr.orderingresults.vo.PathResultDetailsRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setPathologyResultDetails(PathologyResultDetails);
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.orderingresults.domain.objects.ResultDetails extractResultDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ResultDetailsForNewResultSpecDocVo valueObject) 
	{
		return 	extractResultDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.orderingresults.domain.objects.ResultDetails extractResultDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ResultDetailsForNewResultSpecDocVo valueObject, HashMap domMap) 
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
			// ims.ocrr.vo.ResultDetailsForNewResultSpecDocVo ID_ResultDetails field is unknown
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

		domainObject.setDocumentResultDetails(ims.core.vo.domain.PatientDocumentVoAssembler.extractPatientDocument(domainFactory, valueObject.getDocumentResultDetails(), domMap));

		ims.ocrr.orderingresults.vo.PathResultDetailsRefVoCollection refCollection2 = valueObject.getPathologyResultDetails();
		int size2 = (null == refCollection2) ? 0 : refCollection2.size();		
		java.util.Set domainPathologyResultDetails2 = domainObject.getPathologyResultDetails();
		if (domainPathologyResultDetails2 == null)
		{
			domainPathologyResultDetails2 = new java.util.HashSet();
		}
		java.util.Set newSet2  = new java.util.HashSet();
		for(int i=0; i<size2; i++) 
		{
			ims.ocrr.orderingresults.vo.PathResultDetailsRefVo vo = refCollection2.get(i);					
			ims.ocrr.orderingresults.domain.objects.PathResultDetails dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.ocrr.orderingresults.domain.objects.PathResultDetails)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.ocrr.orderingresults.domain.objects.PathResultDetails)domainFactory.getDomainObject( ims.ocrr.orderingresults.domain.objects.PathResultDetails.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainPathologyResultDetails2.contains(dom))
			{
				domainPathologyResultDetails2.add(dom);
			}
			newSet2.add(dom);			
		}
		java.util.Set removedSet2 = new java.util.HashSet();
		java.util.Iterator iter2 = domainPathologyResultDetails2.iterator();
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
			domainPathologyResultDetails2.remove(iter2.next());
		}		
		
		domainObject.setPathologyResultDetails(domainPathologyResultDetails2);		

		return domainObject;
	}

}
