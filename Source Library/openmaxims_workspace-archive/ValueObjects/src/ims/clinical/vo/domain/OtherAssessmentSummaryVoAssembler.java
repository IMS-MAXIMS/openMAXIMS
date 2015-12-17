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
 * @author Calin Perebiceanu
 */
public class OtherAssessmentSummaryVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.OtherAssessmentSummaryVo copy(ims.clinical.vo.OtherAssessmentSummaryVo valueObjectDest, ims.clinical.vo.OtherAssessmentSummaryVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_OtherAssessmentSummary(valueObjectSrc.getID_OtherAssessmentSummary());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// AssessmentDate
		valueObjectDest.setAssessmentDate(valueObjectSrc.getAssessmentDate());
		// AssessmentName
		valueObjectDest.setAssessmentName(valueObjectSrc.getAssessmentName());
		// CarriedOutBy
		valueObjectDest.setCarriedOutBy(valueObjectSrc.getCarriedOutBy());
		// Score
		valueObjectDest.setScore(valueObjectSrc.getScore());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createOtherAssessmentSummaryVoCollectionFromOtherAssessmentSummary(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.OtherAssessmentSummary objects.
	 */
	public static ims.clinical.vo.OtherAssessmentSummaryVoCollection createOtherAssessmentSummaryVoCollectionFromOtherAssessmentSummary(java.util.Set domainObjectSet)	
	{
		return createOtherAssessmentSummaryVoCollectionFromOtherAssessmentSummary(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.OtherAssessmentSummary objects.
	 */
	public static ims.clinical.vo.OtherAssessmentSummaryVoCollection createOtherAssessmentSummaryVoCollectionFromOtherAssessmentSummary(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.OtherAssessmentSummaryVoCollection voList = new ims.clinical.vo.OtherAssessmentSummaryVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.OtherAssessmentSummary domainObject = (ims.core.clinical.domain.objects.OtherAssessmentSummary) iterator.next();
			ims.clinical.vo.OtherAssessmentSummaryVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.OtherAssessmentSummary objects.
	 */
	public static ims.clinical.vo.OtherAssessmentSummaryVoCollection createOtherAssessmentSummaryVoCollectionFromOtherAssessmentSummary(java.util.List domainObjectList) 
	{
		return createOtherAssessmentSummaryVoCollectionFromOtherAssessmentSummary(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.OtherAssessmentSummary objects.
	 */
	public static ims.clinical.vo.OtherAssessmentSummaryVoCollection createOtherAssessmentSummaryVoCollectionFromOtherAssessmentSummary(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.OtherAssessmentSummaryVoCollection voList = new ims.clinical.vo.OtherAssessmentSummaryVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.OtherAssessmentSummary domainObject = (ims.core.clinical.domain.objects.OtherAssessmentSummary) domainObjectList.get(i);
			ims.clinical.vo.OtherAssessmentSummaryVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.OtherAssessmentSummary set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractOtherAssessmentSummarySet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.OtherAssessmentSummaryVoCollection voCollection) 
	 {
	 	return extractOtherAssessmentSummarySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOtherAssessmentSummarySet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.OtherAssessmentSummaryVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.OtherAssessmentSummaryVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.OtherAssessmentSummary domainObject = OtherAssessmentSummaryVoAssembler.extractOtherAssessmentSummary(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.OtherAssessmentSummary list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractOtherAssessmentSummaryList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.OtherAssessmentSummaryVoCollection voCollection) 
	 {
	 	return extractOtherAssessmentSummaryList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOtherAssessmentSummaryList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.OtherAssessmentSummaryVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.OtherAssessmentSummaryVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.OtherAssessmentSummary domainObject = OtherAssessmentSummaryVoAssembler.extractOtherAssessmentSummary(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.OtherAssessmentSummary object.
	 * @param domainObject ims.core.clinical.domain.objects.OtherAssessmentSummary
	 */
	 public static ims.clinical.vo.OtherAssessmentSummaryVo create(ims.core.clinical.domain.objects.OtherAssessmentSummary domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.OtherAssessmentSummary object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.OtherAssessmentSummaryVo create(DomainObjectMap map, ims.core.clinical.domain.objects.OtherAssessmentSummary domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.OtherAssessmentSummaryVo valueObject = (ims.clinical.vo.OtherAssessmentSummaryVo) map.getValueObject(domainObject, ims.clinical.vo.OtherAssessmentSummaryVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.OtherAssessmentSummaryVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.OtherAssessmentSummary
	 */
	 public static ims.clinical.vo.OtherAssessmentSummaryVo insert(ims.clinical.vo.OtherAssessmentSummaryVo valueObject, ims.core.clinical.domain.objects.OtherAssessmentSummary domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.OtherAssessmentSummary
	 */
	 public static ims.clinical.vo.OtherAssessmentSummaryVo insert(DomainObjectMap map, ims.clinical.vo.OtherAssessmentSummaryVo valueObject, ims.core.clinical.domain.objects.OtherAssessmentSummary domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_OtherAssessmentSummary(domainObject.getId());
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
		// AssessmentDate
		java.util.Date AssessmentDate = domainObject.getAssessmentDate();
		if ( null != AssessmentDate ) 
		{
			valueObject.setAssessmentDate(new ims.framework.utils.Date(AssessmentDate) );
		}
		// AssessmentName
		ims.domain.lookups.LookupInstance instance3 = domainObject.getAssessmentName();
		if ( null != instance3 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance3.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance3.getImage().getImageId(), instance3.getImage().getImagePath());
			}
			color = instance3.getColor();
			if (color != null) 
				color.getValue();

			ims.assessment.vo.lookups.AssessmentName voLookup3 = new ims.assessment.vo.lookups.AssessmentName(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.assessment.vo.lookups.AssessmentName parentVoLookup3 = voLookup3;
			ims.domain.lookups.LookupInstance parent3 = instance3.getParent();
			while (parent3 != null)
			{
				if (parent3.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent3.getImage().getImageId(), parent3.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent3.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup3.setParent(new ims.assessment.vo.lookups.AssessmentName(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setAssessmentName(voLookup3);
		}
				// CarriedOutBy
		valueObject.setCarriedOutBy(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getCarriedOutBy()) );
		// Score
		valueObject.setScore(domainObject.getScore());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.OtherAssessmentSummary extractOtherAssessmentSummary(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.OtherAssessmentSummaryVo valueObject) 
	{
		return 	extractOtherAssessmentSummary(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.OtherAssessmentSummary extractOtherAssessmentSummary(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.OtherAssessmentSummaryVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_OtherAssessmentSummary();
		ims.core.clinical.domain.objects.OtherAssessmentSummary domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.OtherAssessmentSummary)domMap.get(valueObject);
			}
			// ims.clinical.vo.OtherAssessmentSummaryVo ID_OtherAssessmentSummary field is unknown
			domainObject = new ims.core.clinical.domain.objects.OtherAssessmentSummary();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_OtherAssessmentSummary());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.OtherAssessmentSummary)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.OtherAssessmentSummary) domainFactory.getDomainObject(ims.core.clinical.domain.objects.OtherAssessmentSummary.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_OtherAssessmentSummary());

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
		java.util.Date value2 = null;
		ims.framework.utils.Date date2 = valueObject.getAssessmentDate();		
		if ( date2 != null ) 
		{
			value2 = date2.getDate();
		}
		domainObject.setAssessmentDate(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getAssessmentName() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getAssessmentName().getID());
		}
		domainObject.setAssessmentName(value3);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value4 = null;
		if ( null != valueObject.getCarriedOutBy() ) 
		{
			if (valueObject.getCarriedOutBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getCarriedOutBy()) != null)
				{
					value4 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getCarriedOutBy());
				}
			}
			else
			{
				value4 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getCarriedOutBy().getBoId());
			}
		}
		domainObject.setCarriedOutBy(value4);
		domainObject.setScore(valueObject.getScore());

		return domainObject;
	}

}
