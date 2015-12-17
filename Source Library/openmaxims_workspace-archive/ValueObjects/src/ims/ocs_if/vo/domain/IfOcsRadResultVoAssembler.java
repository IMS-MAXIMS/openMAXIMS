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
package ims.ocs_if.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author John Pearson
 */
public class IfOcsRadResultVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocs_if.vo.IfOcsRadResultVo copy(ims.ocs_if.vo.IfOcsRadResultVo valueObjectDest, ims.ocs_if.vo.IfOcsRadResultVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ClinicalResultDetail(valueObjectSrc.getID_ClinicalResultDetail());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ExamDateTime
		valueObjectDest.setExamDateTime(valueObjectSrc.getExamDateTime());
		// ExamTimeSupplied
		valueObjectDest.setExamTimeSupplied(valueObjectSrc.getExamTimeSupplied());
		// AuthoringRadiologistName
		valueObjectDest.setAuthoringRadiologistName(valueObjectSrc.getAuthoringRadiologistName());
		// VerifyingRadiologistName
		valueObjectDest.setVerifyingRadiologistName(valueObjectSrc.getVerifyingRadiologistName());
		// RadiographerName
		valueObjectDest.setRadiographerName(valueObjectSrc.getRadiographerName());
		// TranscriberName
		valueObjectDest.setTranscriberName(valueObjectSrc.getTranscriberName());
		// ReportText
		valueObjectDest.setReportText(valueObjectSrc.getReportText());
		// ResultComments
		valueObjectDest.setResultComments(valueObjectSrc.getResultComments());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createIfOcsRadResultVoCollectionFromClinicalResultDetail(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.ClinicalResultDetail objects.
	 */
	public static ims.ocs_if.vo.IfOcsRadResultVoCollection createIfOcsRadResultVoCollectionFromClinicalResultDetail(java.util.Set domainObjectSet)	
	{
		return createIfOcsRadResultVoCollectionFromClinicalResultDetail(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.ClinicalResultDetail objects.
	 */
	public static ims.ocs_if.vo.IfOcsRadResultVoCollection createIfOcsRadResultVoCollectionFromClinicalResultDetail(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocs_if.vo.IfOcsRadResultVoCollection voList = new ims.ocs_if.vo.IfOcsRadResultVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ocrr.orderingresults.domain.objects.ClinicalResultDetail domainObject = (ims.ocrr.orderingresults.domain.objects.ClinicalResultDetail) iterator.next();
			ims.ocs_if.vo.IfOcsRadResultVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.ClinicalResultDetail objects.
	 */
	public static ims.ocs_if.vo.IfOcsRadResultVoCollection createIfOcsRadResultVoCollectionFromClinicalResultDetail(java.util.List domainObjectList) 
	{
		return createIfOcsRadResultVoCollectionFromClinicalResultDetail(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.ClinicalResultDetail objects.
	 */
	public static ims.ocs_if.vo.IfOcsRadResultVoCollection createIfOcsRadResultVoCollectionFromClinicalResultDetail(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocs_if.vo.IfOcsRadResultVoCollection voList = new ims.ocs_if.vo.IfOcsRadResultVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.orderingresults.domain.objects.ClinicalResultDetail domainObject = (ims.ocrr.orderingresults.domain.objects.ClinicalResultDetail) domainObjectList.get(i);
			ims.ocs_if.vo.IfOcsRadResultVo vo = create(map, domainObject);

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
	 * Create the ims.ocrr.orderingresults.domain.objects.ClinicalResultDetail set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractClinicalResultDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOcsRadResultVoCollection voCollection) 
	 {
	 	return extractClinicalResultDetailSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractClinicalResultDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOcsRadResultVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocs_if.vo.IfOcsRadResultVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.ClinicalResultDetail domainObject = IfOcsRadResultVoAssembler.extractClinicalResultDetail(domainFactory, vo, domMap);

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
	 * Create the ims.ocrr.orderingresults.domain.objects.ClinicalResultDetail list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractClinicalResultDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOcsRadResultVoCollection voCollection) 
	 {
	 	return extractClinicalResultDetailList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractClinicalResultDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOcsRadResultVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocs_if.vo.IfOcsRadResultVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.ClinicalResultDetail domainObject = IfOcsRadResultVoAssembler.extractClinicalResultDetail(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.ClinicalResultDetail object.
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.ClinicalResultDetail
	 */
	 public static ims.ocs_if.vo.IfOcsRadResultVo create(ims.ocrr.orderingresults.domain.objects.ClinicalResultDetail domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.ClinicalResultDetail object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ocs_if.vo.IfOcsRadResultVo create(DomainObjectMap map, ims.ocrr.orderingresults.domain.objects.ClinicalResultDetail domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocs_if.vo.IfOcsRadResultVo valueObject = (ims.ocs_if.vo.IfOcsRadResultVo) map.getValueObject(domainObject, ims.ocs_if.vo.IfOcsRadResultVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocs_if.vo.IfOcsRadResultVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.ClinicalResultDetail
	 */
	 public static ims.ocs_if.vo.IfOcsRadResultVo insert(ims.ocs_if.vo.IfOcsRadResultVo valueObject, ims.ocrr.orderingresults.domain.objects.ClinicalResultDetail domainObject) 
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
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.ClinicalResultDetail
	 */
	 public static ims.ocs_if.vo.IfOcsRadResultVo insert(DomainObjectMap map, ims.ocs_if.vo.IfOcsRadResultVo valueObject, ims.ocrr.orderingresults.domain.objects.ClinicalResultDetail domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ClinicalResultDetail(domainObject.getId());
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
			
		// ExamDateTime
		java.util.Date ExamDateTime = domainObject.getExamDateTime();
		if ( null != ExamDateTime ) 
		{
			valueObject.setExamDateTime(new ims.framework.utils.DateTime(ExamDateTime) );
		}
		// ExamTimeSupplied
		valueObject.setExamTimeSupplied( domainObject.isExamTimeSupplied() );
		// AuthoringRadiologistName
		valueObject.setAuthoringRadiologistName(domainObject.getAuthoringRadiologistName());
		// VerifyingRadiologistName
		valueObject.setVerifyingRadiologistName(domainObject.getVerifyingRadiologistName());
		// RadiographerName
		valueObject.setRadiographerName(domainObject.getRadiographerName());
		// TranscriberName
		valueObject.setTranscriberName(domainObject.getTranscriberName());
		// ReportText
		valueObject.setReportText(domainObject.getReportText());
		// ResultComments
		ims.ocrr.orderingresults.vo.ResultCommentRefVoCollection ResultComments = new ims.ocrr.orderingresults.vo.ResultCommentRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getResultComments().iterator(); iterator.hasNext(); ) 
		{
			ims.ocrr.orderingresults.domain.objects.ResultComment tmp = (ims.ocrr.orderingresults.domain.objects.ResultComment)iterator.next();
			if (tmp != null)
				ResultComments.add(new ims.ocrr.orderingresults.vo.ResultCommentRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setResultComments(ResultComments);
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.orderingresults.domain.objects.ClinicalResultDetail extractClinicalResultDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOcsRadResultVo valueObject) 
	{
		return 	extractClinicalResultDetail(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.orderingresults.domain.objects.ClinicalResultDetail extractClinicalResultDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOcsRadResultVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ClinicalResultDetail();
		ims.ocrr.orderingresults.domain.objects.ClinicalResultDetail domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.ClinicalResultDetail)domMap.get(valueObject);
			}
			// ims.ocs_if.vo.IfOcsRadResultVo ID_ClinicalResultDetail field is unknown
			domainObject = new ims.ocrr.orderingresults.domain.objects.ClinicalResultDetail();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ClinicalResultDetail());
			if (domMap.get(key) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.ClinicalResultDetail)domMap.get(key);
			}
			domainObject = (ims.ocrr.orderingresults.domain.objects.ClinicalResultDetail) domainFactory.getDomainObject(ims.ocrr.orderingresults.domain.objects.ClinicalResultDetail.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ClinicalResultDetail());

		ims.framework.utils.DateTime dateTime1 = valueObject.getExamDateTime();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setExamDateTime(value1);
		domainObject.setExamTimeSupplied(valueObject.getExamTimeSupplied());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAuthoringRadiologistName() != null && valueObject.getAuthoringRadiologistName().equals(""))
		{
			valueObject.setAuthoringRadiologistName(null);
		}
		domainObject.setAuthoringRadiologistName(valueObject.getAuthoringRadiologistName());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getVerifyingRadiologistName() != null && valueObject.getVerifyingRadiologistName().equals(""))
		{
			valueObject.setVerifyingRadiologistName(null);
		}
		domainObject.setVerifyingRadiologistName(valueObject.getVerifyingRadiologistName());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getRadiographerName() != null && valueObject.getRadiographerName().equals(""))
		{
			valueObject.setRadiographerName(null);
		}
		domainObject.setRadiographerName(valueObject.getRadiographerName());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTranscriberName() != null && valueObject.getTranscriberName().equals(""))
		{
			valueObject.setTranscriberName(null);
		}
		domainObject.setTranscriberName(valueObject.getTranscriberName());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReportText() != null && valueObject.getReportText().equals(""))
		{
			valueObject.setReportText(null);
		}
		domainObject.setReportText(valueObject.getReportText());

		ims.ocrr.orderingresults.vo.ResultCommentRefVoCollection refCollection8 = valueObject.getResultComments();
		int size8 = (null == refCollection8) ? 0 : refCollection8.size();		
		java.util.List domainResultComments8 = domainObject.getResultComments();
		if (domainResultComments8 == null)
		{
			domainResultComments8 = new java.util.ArrayList();
		}
		for(int i=0; i < size8; i++) 
		{
			ims.ocrr.orderingresults.vo.ResultCommentRefVo vo = refCollection8.get(i);			
			ims.ocrr.orderingresults.domain.objects.ResultComment dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.ocrr.orderingresults.domain.objects.ResultComment)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.ocrr.orderingresults.domain.objects.ResultComment)domainFactory.getDomainObject( ims.ocrr.orderingresults.domain.objects.ResultComment.class, vo.getBoId());
				}
			}

			int domIdx = domainResultComments8.indexOf(dom);
			if (domIdx == -1)
			{
				domainResultComments8.add(i, dom);
			}
			else if (i != domIdx && i < domainResultComments8.size())
			{
				Object tmp = domainResultComments8.get(i);
				domainResultComments8.set(i, domainResultComments8.get(domIdx));
				domainResultComments8.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i8 = domainResultComments8.size();
		while (i8 > size8)
		{
			domainResultComments8.remove(i8-1);
			i8 = domainResultComments8.size();
		}
		
		domainObject.setResultComments(domainResultComments8);		

		return domainObject;
	}

}
