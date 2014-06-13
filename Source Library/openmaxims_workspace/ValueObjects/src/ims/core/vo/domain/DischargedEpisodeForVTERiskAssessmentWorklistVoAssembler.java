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
 * @author Cristian Belciug
 */
public class DischargedEpisodeForVTERiskAssessmentWorklistVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVo copy(ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVo valueObjectDest, ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_DischargedEpisode(valueObjectSrc.getID_DischargedEpisode());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// pasEvent
		valueObjectDest.setPasEvent(valueObjectSrc.getPasEvent());
		// wardStays
		valueObjectDest.setWardStays(valueObjectSrc.getWardStays());
		// VTEAssessmentStatus
		valueObjectDest.setVTEAssessmentStatus(valueObjectSrc.getVTEAssessmentStatus());
		// AdmissionDetail
		valueObjectDest.setAdmissionDetail(valueObjectSrc.getAdmissionDetail());
		// VTERiskAssessment
		valueObjectDest.setVTERiskAssessment(valueObjectSrc.getVTERiskAssessment());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createDischargedEpisodeForVTERiskAssessmentWorklistVoCollectionFromDischargedEpisode(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.DischargedEpisode objects.
	 */
	public static ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVoCollection createDischargedEpisodeForVTERiskAssessmentWorklistVoCollectionFromDischargedEpisode(java.util.Set domainObjectSet)	
	{
		return createDischargedEpisodeForVTERiskAssessmentWorklistVoCollectionFromDischargedEpisode(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.DischargedEpisode objects.
	 */
	public static ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVoCollection createDischargedEpisodeForVTERiskAssessmentWorklistVoCollectionFromDischargedEpisode(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVoCollection voList = new ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.pas.domain.objects.DischargedEpisode domainObject = (ims.core.admin.pas.domain.objects.DischargedEpisode) iterator.next();
			ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.DischargedEpisode objects.
	 */
	public static ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVoCollection createDischargedEpisodeForVTERiskAssessmentWorklistVoCollectionFromDischargedEpisode(java.util.List domainObjectList) 
	{
		return createDischargedEpisodeForVTERiskAssessmentWorklistVoCollectionFromDischargedEpisode(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.DischargedEpisode objects.
	 */
	public static ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVoCollection createDischargedEpisodeForVTERiskAssessmentWorklistVoCollectionFromDischargedEpisode(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVoCollection voList = new ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.DischargedEpisode domainObject = (ims.core.admin.pas.domain.objects.DischargedEpisode) domainObjectList.get(i);
			ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.pas.domain.objects.DischargedEpisode set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractDischargedEpisodeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVoCollection voCollection) 
	 {
	 	return extractDischargedEpisodeSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractDischargedEpisodeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.DischargedEpisode domainObject = DischargedEpisodeForVTERiskAssessmentWorklistVoAssembler.extractDischargedEpisode(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.pas.domain.objects.DischargedEpisode list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractDischargedEpisodeList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVoCollection voCollection) 
	 {
	 	return extractDischargedEpisodeList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractDischargedEpisodeList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.DischargedEpisode domainObject = DischargedEpisodeForVTERiskAssessmentWorklistVoAssembler.extractDischargedEpisode(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.pas.domain.objects.DischargedEpisode object.
	 * @param domainObject ims.core.admin.pas.domain.objects.DischargedEpisode
	 */
	 public static ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVo create(ims.core.admin.pas.domain.objects.DischargedEpisode domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.pas.domain.objects.DischargedEpisode object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.DischargedEpisode domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVo valueObject = (ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVo) map.getValueObject(domainObject, ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.pas.domain.objects.DischargedEpisode
	 */
	 public static ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVo insert(ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVo valueObject, ims.core.admin.pas.domain.objects.DischargedEpisode domainObject) 
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
	 * @param domainObject ims.core.admin.pas.domain.objects.DischargedEpisode
	 */
	 public static ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVo insert(DomainObjectMap map, ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVo valueObject, ims.core.admin.pas.domain.objects.DischargedEpisode domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_DischargedEpisode(domainObject.getId());
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
		valueObject.setPasEvent(ims.core.vo.domain.PASEventForVTERiskAssessmentVoAssembler.create(map, domainObject.getPasEvent()) );
		// wardStays
		valueObject.setWardStays(ims.core.vo.domain.WardStayVoAssembler.createWardStayVoCollectionFromWardStay(map, domainObject.getWardStays()) );
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
				// AdmissionDetail
		valueObject.setAdmissionDetail(ims.core.vo.domain.AdmissionDetailForVTERiskAssessmentVoAssembler.create(map, domainObject.getAdmissionDetail()) );
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
	public static ims.core.admin.pas.domain.objects.DischargedEpisode extractDischargedEpisode(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVo valueObject) 
	{
		return 	extractDischargedEpisode(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.DischargedEpisode extractDischargedEpisode(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_DischargedEpisode();
		ims.core.admin.pas.domain.objects.DischargedEpisode domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.pas.domain.objects.DischargedEpisode)domMap.get(valueObject);
			}
			// ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVo ID_DischargedEpisode field is unknown
			domainObject = new ims.core.admin.pas.domain.objects.DischargedEpisode();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_DischargedEpisode());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.pas.domain.objects.DischargedEpisode)domMap.get(key);
			}
			domainObject = (ims.core.admin.pas.domain.objects.DischargedEpisode) domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.DischargedEpisode.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_DischargedEpisode());

	// SaveAsRefVO - treated as a refVo in extract methods
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
			else
			{
				value1 = (ims.core.admin.pas.domain.objects.PASEvent)domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.PASEvent.class, valueObject.getPasEvent().getBoId());
			}
		}
		domainObject.setPasEvent(value1);

		// SaveAsRefVO treated as RefValueObject
		ims.core.admin.pas.vo.WardStayRefVoCollection refCollection2 = new ims.core.admin.pas.vo.WardStayRefVoCollection();
		if (valueObject.getWardStays() != null)
		{
			for (int i2=0; i2<valueObject.getWardStays().size(); i2++)
			{
				ims.core.admin.pas.vo.WardStayRefVo ref2 = (ims.core.admin.pas.vo.WardStayRefVo)valueObject.getWardStays().get(i2);
				refCollection2.add(ref2);
			}
		}
		int size2 = (null == refCollection2) ? 0 : refCollection2.size();		
		java.util.Set domainWardStays2 = domainObject.getWardStays();
		if (domainWardStays2 == null)
		{
			domainWardStays2 = new java.util.HashSet();
		}
		java.util.Set newSet2  = new java.util.HashSet();
		for(int i=0; i<size2; i++) 
		{
			ims.core.admin.pas.vo.WardStayRefVo vo = refCollection2.get(i);					
			ims.core.admin.pas.domain.objects.WardStay dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.admin.pas.domain.objects.WardStay)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.admin.pas.domain.objects.WardStay)domainFactory.getDomainObject( ims.core.admin.pas.domain.objects.WardStay.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainWardStays2.contains(dom))
			{
				domainWardStays2.add(dom);
			}
			newSet2.add(dom);			
		}
		java.util.Set removedSet2 = new java.util.HashSet();
		java.util.Iterator iter2 = domainWardStays2.iterator();
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
			domainWardStays2.remove(iter2.next());
		}		
		
		domainObject.setWardStays(domainWardStays2);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getVTEAssessmentStatus() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getVTEAssessmentStatus().getID());
		}
		domainObject.setVTEAssessmentStatus(value3);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.pas.domain.objects.AdmissionDetail value4 = null;
		if ( null != valueObject.getAdmissionDetail() ) 
		{
			if (valueObject.getAdmissionDetail().getBoId() == null)
			{
				if (domMap.get(valueObject.getAdmissionDetail()) != null)
				{
					value4 = (ims.core.admin.pas.domain.objects.AdmissionDetail)domMap.get(valueObject.getAdmissionDetail());
				}
			}
			else
			{
				value4 = (ims.core.admin.pas.domain.objects.AdmissionDetail)domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.AdmissionDetail.class, valueObject.getAdmissionDetail().getBoId());
			}
		}
		domainObject.setAdmissionDetail(value4);
		ims.core.clinical.domain.objects.VTERiskAssessment value5 = null;
		if ( null != valueObject.getVTERiskAssessment() ) 
		{
			if (valueObject.getVTERiskAssessment().getBoId() == null)
			{
				if (domMap.get(valueObject.getVTERiskAssessment()) != null)
				{
					value5 = (ims.core.clinical.domain.objects.VTERiskAssessment)domMap.get(valueObject.getVTERiskAssessment());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value5 = domainObject.getVTERiskAssessment();	
			}
			else
			{
				value5 = (ims.core.clinical.domain.objects.VTERiskAssessment)domainFactory.getDomainObject(ims.core.clinical.domain.objects.VTERiskAssessment.class, valueObject.getVTERiskAssessment().getBoId());
			}
		}
		domainObject.setVTERiskAssessment(value5);

		return domainObject;
	}

}
