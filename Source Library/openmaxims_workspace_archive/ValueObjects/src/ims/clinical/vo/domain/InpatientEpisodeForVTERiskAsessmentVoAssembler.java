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
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cornel Ventuneac
 */
public class InpatientEpisodeForVTERiskAsessmentVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.InpatientEpisodeForVTERiskAsessmentVo copy(ims.clinical.vo.InpatientEpisodeForVTERiskAsessmentVo valueObjectDest, ims.clinical.vo.InpatientEpisodeForVTERiskAsessmentVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_InpatientEpisode(valueObjectSrc.getID_InpatientEpisode());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// pasEvent
		valueObjectDest.setPasEvent(valueObjectSrc.getPasEvent());
		// AdmissionDateTime
		valueObjectDest.setAdmissionDateTime(valueObjectSrc.getAdmissionDateTime());
		// VTEAssessmentStatus
		valueObjectDest.setVTEAssessmentStatus(valueObjectSrc.getVTEAssessmentStatus());
		// VTERiskAssessment
		valueObjectDest.setVTERiskAssessment(valueObjectSrc.getVTERiskAssessment());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createInpatientEpisodeForVTERiskAsessmentVoCollectionFromInpatientEpisode(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.InpatientEpisode objects.
	 */
	public static ims.clinical.vo.InpatientEpisodeForVTERiskAsessmentVoCollection createInpatientEpisodeForVTERiskAsessmentVoCollectionFromInpatientEpisode(java.util.Set domainObjectSet)	
	{
		return createInpatientEpisodeForVTERiskAsessmentVoCollectionFromInpatientEpisode(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.InpatientEpisode objects.
	 */
	public static ims.clinical.vo.InpatientEpisodeForVTERiskAsessmentVoCollection createInpatientEpisodeForVTERiskAsessmentVoCollectionFromInpatientEpisode(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.InpatientEpisodeForVTERiskAsessmentVoCollection voList = new ims.clinical.vo.InpatientEpisodeForVTERiskAsessmentVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.pas.domain.objects.InpatientEpisode domainObject = (ims.core.admin.pas.domain.objects.InpatientEpisode) iterator.next();
			ims.clinical.vo.InpatientEpisodeForVTERiskAsessmentVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.InpatientEpisode objects.
	 */
	public static ims.clinical.vo.InpatientEpisodeForVTERiskAsessmentVoCollection createInpatientEpisodeForVTERiskAsessmentVoCollectionFromInpatientEpisode(java.util.List domainObjectList) 
	{
		return createInpatientEpisodeForVTERiskAsessmentVoCollectionFromInpatientEpisode(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.InpatientEpisode objects.
	 */
	public static ims.clinical.vo.InpatientEpisodeForVTERiskAsessmentVoCollection createInpatientEpisodeForVTERiskAsessmentVoCollectionFromInpatientEpisode(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.InpatientEpisodeForVTERiskAsessmentVoCollection voList = new ims.clinical.vo.InpatientEpisodeForVTERiskAsessmentVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.InpatientEpisode domainObject = (ims.core.admin.pas.domain.objects.InpatientEpisode) domainObjectList.get(i);
			ims.clinical.vo.InpatientEpisodeForVTERiskAsessmentVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.pas.domain.objects.InpatientEpisode set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractInpatientEpisodeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.InpatientEpisodeForVTERiskAsessmentVoCollection voCollection) 
	 {
	 	return extractInpatientEpisodeSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractInpatientEpisodeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.InpatientEpisodeForVTERiskAsessmentVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.InpatientEpisodeForVTERiskAsessmentVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.InpatientEpisode domainObject = InpatientEpisodeForVTERiskAsessmentVoAssembler.extractInpatientEpisode(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.pas.domain.objects.InpatientEpisode list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractInpatientEpisodeList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.InpatientEpisodeForVTERiskAsessmentVoCollection voCollection) 
	 {
	 	return extractInpatientEpisodeList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractInpatientEpisodeList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.InpatientEpisodeForVTERiskAsessmentVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.InpatientEpisodeForVTERiskAsessmentVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.InpatientEpisode domainObject = InpatientEpisodeForVTERiskAsessmentVoAssembler.extractInpatientEpisode(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.pas.domain.objects.InpatientEpisode object.
	 * @param domainObject ims.core.admin.pas.domain.objects.InpatientEpisode
	 */
	 public static ims.clinical.vo.InpatientEpisodeForVTERiskAsessmentVo create(ims.core.admin.pas.domain.objects.InpatientEpisode domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.pas.domain.objects.InpatientEpisode object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.InpatientEpisodeForVTERiskAsessmentVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.InpatientEpisode domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.InpatientEpisodeForVTERiskAsessmentVo valueObject = (ims.clinical.vo.InpatientEpisodeForVTERiskAsessmentVo) map.getValueObject(domainObject, ims.clinical.vo.InpatientEpisodeForVTERiskAsessmentVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.InpatientEpisodeForVTERiskAsessmentVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.pas.domain.objects.InpatientEpisode
	 */
	 public static ims.clinical.vo.InpatientEpisodeForVTERiskAsessmentVo insert(ims.clinical.vo.InpatientEpisodeForVTERiskAsessmentVo valueObject, ims.core.admin.pas.domain.objects.InpatientEpisode domainObject) 
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
	 * @param domainObject ims.core.admin.pas.domain.objects.InpatientEpisode
	 */
	 public static ims.clinical.vo.InpatientEpisodeForVTERiskAsessmentVo insert(DomainObjectMap map, ims.clinical.vo.InpatientEpisodeForVTERiskAsessmentVo valueObject, ims.core.admin.pas.domain.objects.InpatientEpisode domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_InpatientEpisode(domainObject.getId());
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
			
		// pasEvent
		if (domainObject.getPasEvent() != null)
		{
			if(domainObject.getPasEvent() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPasEvent();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPasEvent(new ims.core.admin.pas.vo.PASEventRefVo(id, -1));				
			}
			else
			{
				valueObject.setPasEvent(new ims.core.admin.pas.vo.PASEventRefVo(domainObject.getPasEvent().getId(), domainObject.getPasEvent().getVersion()));
			}
		}
		// AdmissionDateTime
		java.util.Date AdmissionDateTime = domainObject.getAdmissionDateTime();
		if ( null != AdmissionDateTime ) 
		{
			valueObject.setAdmissionDateTime(new ims.framework.utils.DateTime(AdmissionDateTime) );
		}
		// VTEAssessmentStatus
		ims.domain.lookups.LookupInstance instance3 = domainObject.getVTEAssessmentStatus();
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

			ims.clinical.vo.lookups.VTEAsessmentStatus voLookup3 = new ims.clinical.vo.lookups.VTEAsessmentStatus(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.clinical.vo.lookups.VTEAsessmentStatus parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.clinical.vo.lookups.VTEAsessmentStatus(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setVTEAssessmentStatus(voLookup3);
		}
				// VTERiskAssessment
		if (domainObject.getVTERiskAssessment() != null)
		{
			if(domainObject.getVTERiskAssessment() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getVTERiskAssessment();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setVTERiskAssessment(new ims.core.clinical.vo.VTERiskAssessmentRefVo(id, -1));				
			}
			else
			{
				valueObject.setVTERiskAssessment(new ims.core.clinical.vo.VTERiskAssessmentRefVo(domainObject.getVTERiskAssessment().getId(), domainObject.getVTERiskAssessment().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.pas.domain.objects.InpatientEpisode extractInpatientEpisode(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.InpatientEpisodeForVTERiskAsessmentVo valueObject) 
	{
		return 	extractInpatientEpisode(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.InpatientEpisode extractInpatientEpisode(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.InpatientEpisodeForVTERiskAsessmentVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_InpatientEpisode();
		ims.core.admin.pas.domain.objects.InpatientEpisode domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.pas.domain.objects.InpatientEpisode)domMap.get(valueObject);
			}
			// ims.clinical.vo.InpatientEpisodeForVTERiskAsessmentVo ID_InpatientEpisode field is unknown
			domainObject = new ims.core.admin.pas.domain.objects.InpatientEpisode();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_InpatientEpisode());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.pas.domain.objects.InpatientEpisode)domMap.get(key);
			}
			domainObject = (ims.core.admin.pas.domain.objects.InpatientEpisode) domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.InpatientEpisode.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_InpatientEpisode());

		ims.core.admin.pas.domain.objects.PASEvent value1 = null;
		if ( null != valueObject.getPasEvent() ) 
		{
			if (valueObject.getPasEvent().getBoId() == null)
			{
				if (domMap.get(valueObject.getPasEvent()) != null)
				{
					value1 = (ims.core.admin.pas.domain.objects.PASEvent)domMap.get(valueObject.getPasEvent());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getPasEvent();	
			}
			else
			{
				value1 = (ims.core.admin.pas.domain.objects.PASEvent)domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.PASEvent.class, valueObject.getPasEvent().getBoId());
			}
		}
		domainObject.setPasEvent(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getAdmissionDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setAdmissionDateTime(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getVTEAssessmentStatus() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getVTEAssessmentStatus().getID());
		}
		domainObject.setVTEAssessmentStatus(value3);
		ims.core.clinical.domain.objects.VTERiskAssessment value4 = null;
		if ( null != valueObject.getVTERiskAssessment() ) 
		{
			if (valueObject.getVTERiskAssessment().getBoId() == null)
			{
				if (domMap.get(valueObject.getVTERiskAssessment()) != null)
				{
					value4 = (ims.core.clinical.domain.objects.VTERiskAssessment)domMap.get(valueObject.getVTERiskAssessment());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getVTERiskAssessment();	
			}
			else
			{
				value4 = (ims.core.clinical.domain.objects.VTERiskAssessment)domainFactory.getDomainObject(ims.core.clinical.domain.objects.VTERiskAssessment.class, valueObject.getVTERiskAssessment().getBoId());
			}
		}
		domainObject.setVTERiskAssessment(value4);

		return domainObject;
	}

}
