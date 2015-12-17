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
package ims.oncology.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class ImagingEventsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.oncology.vo.ImagingEventsVo copy(ims.oncology.vo.ImagingEventsVo valueObjectDest, ims.oncology.vo.ImagingEventsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Imagingevents(valueObjectSrc.getID_Imagingevents());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// HospitalSiteOfImage
		valueObjectDest.setHospitalSiteOfImage(valueObjectSrc.getHospitalSiteOfImage());
		// ImageDate
		valueObjectDest.setImageDate(valueObjectSrc.getImageDate());
		// AnatomicalSite
		valueObjectDest.setAnatomicalSite(valueObjectSrc.getAnatomicalSite());
		// ReportDate
		valueObjectDest.setReportDate(valueObjectSrc.getReportDate());
		// LesionSize
		valueObjectDest.setLesionSize(valueObjectSrc.getLesionSize());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// ImagingEvent
		valueObjectDest.setImagingEvent(valueObjectSrc.getImagingEvent());
		// ImagingEventDescription
		valueObjectDest.setImagingEventDescription(valueObjectSrc.getImagingEventDescription());
		// RequestedDate
		valueObjectDest.setRequestedDate(valueObjectSrc.getRequestedDate());
		// InvestigationResult
		valueObjectDest.setInvestigationResult(valueObjectSrc.getInvestigationResult());
		// EpisodeOfCare
		valueObjectDest.setEpisodeOfCare(valueObjectSrc.getEpisodeOfCare());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createImagingEventsVoCollectionFromImagingevents(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.Imagingevents objects.
	 */
	public static ims.oncology.vo.ImagingEventsVoCollection createImagingEventsVoCollectionFromImagingevents(java.util.Set domainObjectSet)	
	{
		return createImagingEventsVoCollectionFromImagingevents(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.Imagingevents objects.
	 */
	public static ims.oncology.vo.ImagingEventsVoCollection createImagingEventsVoCollectionFromImagingevents(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.oncology.vo.ImagingEventsVoCollection voList = new ims.oncology.vo.ImagingEventsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.oncology.domain.objects.Imagingevents domainObject = (ims.oncology.domain.objects.Imagingevents) iterator.next();
			ims.oncology.vo.ImagingEventsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.oncology.domain.objects.Imagingevents objects.
	 */
	public static ims.oncology.vo.ImagingEventsVoCollection createImagingEventsVoCollectionFromImagingevents(java.util.List domainObjectList) 
	{
		return createImagingEventsVoCollectionFromImagingevents(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.domain.objects.Imagingevents objects.
	 */
	public static ims.oncology.vo.ImagingEventsVoCollection createImagingEventsVoCollectionFromImagingevents(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.oncology.vo.ImagingEventsVoCollection voList = new ims.oncology.vo.ImagingEventsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.domain.objects.Imagingevents domainObject = (ims.oncology.domain.objects.Imagingevents) domainObjectList.get(i);
			ims.oncology.vo.ImagingEventsVo vo = create(map, domainObject);

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
	 * Create the ims.oncology.domain.objects.Imagingevents set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractImagingeventsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.ImagingEventsVoCollection voCollection) 
	 {
	 	return extractImagingeventsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractImagingeventsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.ImagingEventsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.ImagingEventsVo vo = voCollection.get(i);
			ims.oncology.domain.objects.Imagingevents domainObject = ImagingEventsVoAssembler.extractImagingevents(domainFactory, vo, domMap);

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
	 * Create the ims.oncology.domain.objects.Imagingevents list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractImagingeventsList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.ImagingEventsVoCollection voCollection) 
	 {
	 	return extractImagingeventsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractImagingeventsList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.ImagingEventsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.ImagingEventsVo vo = voCollection.get(i);
			ims.oncology.domain.objects.Imagingevents domainObject = ImagingEventsVoAssembler.extractImagingevents(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.oncology.domain.objects.Imagingevents object.
	 * @param domainObject ims.oncology.domain.objects.Imagingevents
	 */
	 public static ims.oncology.vo.ImagingEventsVo create(ims.oncology.domain.objects.Imagingevents domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.oncology.domain.objects.Imagingevents object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.oncology.vo.ImagingEventsVo create(DomainObjectMap map, ims.oncology.domain.objects.Imagingevents domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.oncology.vo.ImagingEventsVo valueObject = (ims.oncology.vo.ImagingEventsVo) map.getValueObject(domainObject, ims.oncology.vo.ImagingEventsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.oncology.vo.ImagingEventsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.oncology.domain.objects.Imagingevents
	 */
	 public static ims.oncology.vo.ImagingEventsVo insert(ims.oncology.vo.ImagingEventsVo valueObject, ims.oncology.domain.objects.Imagingevents domainObject) 
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
	 * @param domainObject ims.oncology.domain.objects.Imagingevents
	 */
	 public static ims.oncology.vo.ImagingEventsVo insert(DomainObjectMap map, ims.oncology.vo.ImagingEventsVo valueObject, ims.oncology.domain.objects.Imagingevents domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Imagingevents(domainObject.getId());
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
		valueObject.setCareContext(ims.core.vo.domain.CareContextLiteVoAssembler.create(map, domainObject.getCareContext()) );
		// HospitalSiteOfImage
		valueObject.setHospitalSiteOfImage(ims.core.vo.domain.LocSiteLiteVoAssembler.create(map, domainObject.getHospitalSiteOfImage()) );
		// ImageDate
		java.util.Date ImageDate = domainObject.getImageDate();
		if ( null != ImageDate ) 
		{
			valueObject.setImageDate(new ims.framework.utils.Date(ImageDate) );
		}
		// AnatomicalSite
		ims.domain.lookups.LookupInstance instance4 = domainObject.getAnatomicalSite();
		if ( null != instance4 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance4.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance4.getImage().getImageId(), instance4.getImage().getImagePath());
			}
			color = instance4.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.ImageAnatomicalSite voLookup4 = new ims.oncology.vo.lookups.ImageAnatomicalSite(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.oncology.vo.lookups.ImageAnatomicalSite parentVoLookup4 = voLookup4;
			ims.domain.lookups.LookupInstance parent4 = instance4.getParent();
			while (parent4 != null)
			{
				if (parent4.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent4.getImage().getImageId(), parent4.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent4.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup4.setParent(new ims.oncology.vo.lookups.ImageAnatomicalSite(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setAnatomicalSite(voLookup4);
		}
				// ReportDate
		java.util.Date ReportDate = domainObject.getReportDate();
		if ( null != ReportDate ) 
		{
			valueObject.setReportDate(new ims.framework.utils.Date(ReportDate) );
		}
		// LesionSize
		valueObject.setLesionSize(domainObject.getLesionSize());
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// ImagingEvent
		valueObject.setImagingEvent(ims.core.vo.domain.CancerImagingEventLiteVoAssembler.create(map, domainObject.getImagingEvent()) );
		// ImagingEventDescription
		valueObject.setImagingEventDescription(domainObject.getImagingEventDescription());
		// RequestedDate
		java.util.Date RequestedDate = domainObject.getRequestedDate();
		if ( null != RequestedDate ) 
		{
			valueObject.setRequestedDate(new ims.framework.utils.Date(RequestedDate) );
		}
		// InvestigationResult
		ims.domain.lookups.LookupInstance instance11 = domainObject.getInvestigationResult();
		if ( null != instance11 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance11.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance11.getImage().getImageId(), instance11.getImage().getImagePath());
			}
			color = instance11.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.StagingInvestigationResult voLookup11 = new ims.oncology.vo.lookups.StagingInvestigationResult(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.oncology.vo.lookups.StagingInvestigationResult parentVoLookup11 = voLookup11;
			ims.domain.lookups.LookupInstance parent11 = instance11.getParent();
			while (parent11 != null)
			{
				if (parent11.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent11.getImage().getImageId(), parent11.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent11.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup11.setParent(new ims.oncology.vo.lookups.StagingInvestigationResult(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setInvestigationResult(voLookup11);
		}
				// EpisodeOfCare
		if (domainObject.getEpisodeOfCare() != null)
		{
			if(domainObject.getEpisodeOfCare() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getEpisodeOfCare();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setEpisodeOfCare(new ims.core.admin.vo.EpisodeOfCareRefVo(id, -1));				
			}
			else
			{
				valueObject.setEpisodeOfCare(new ims.core.admin.vo.EpisodeOfCareRefVo(domainObject.getEpisodeOfCare().getId(), domainObject.getEpisodeOfCare().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.domain.objects.Imagingevents extractImagingevents(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.ImagingEventsVo valueObject) 
	{
		return 	extractImagingevents(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.domain.objects.Imagingevents extractImagingevents(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.ImagingEventsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Imagingevents();
		ims.oncology.domain.objects.Imagingevents domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.oncology.domain.objects.Imagingevents)domMap.get(valueObject);
			}
			// ims.oncology.vo.ImagingEventsVo ID_Imagingevents field is unknown
			domainObject = new ims.oncology.domain.objects.Imagingevents();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Imagingevents());
			if (domMap.get(key) != null)
			{
				return (ims.oncology.domain.objects.Imagingevents)domMap.get(key);
			}
			domainObject = (ims.oncology.domain.objects.Imagingevents) domainFactory.getDomainObject(ims.oncology.domain.objects.Imagingevents.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Imagingevents());

	// SaveAsRefVO - treated as a refVo in extract methods
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
			else
			{
				value1 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value1);
		domainObject.setHospitalSiteOfImage(ims.core.vo.domain.LocSiteLiteVoAssembler.extractLocSite(domainFactory, valueObject.getHospitalSiteOfImage(), domMap));
		java.util.Date value3 = null;
		ims.framework.utils.Date date3 = valueObject.getImageDate();		
		if ( date3 != null ) 
		{
			value3 = date3.getDate();
		}
		domainObject.setImageDate(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getAnatomicalSite() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getAnatomicalSite().getID());
		}
		domainObject.setAnatomicalSite(value4);
		java.util.Date value5 = null;
		ims.framework.utils.Date date5 = valueObject.getReportDate();		
		if ( date5 != null ) 
		{
			value5 = date5.getDate();
		}
		domainObject.setReportDate(value5);
		domainObject.setLesionSize(valueObject.getLesionSize());
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		domainObject.setImagingEvent(ims.core.vo.domain.CancerImagingEventLiteVoAssembler.extractCancerImagingEvent(domainFactory, valueObject.getImagingEvent(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getImagingEventDescription() != null && valueObject.getImagingEventDescription().equals(""))
		{
			valueObject.setImagingEventDescription(null);
		}
		domainObject.setImagingEventDescription(valueObject.getImagingEventDescription());
		java.util.Date value10 = null;
		ims.framework.utils.Date date10 = valueObject.getRequestedDate();		
		if ( date10 != null ) 
		{
			value10 = date10.getDate();
		}
		domainObject.setRequestedDate(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getInvestigationResult() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getInvestigationResult().getID());
		}
		domainObject.setInvestigationResult(value11);
		ims.core.admin.domain.objects.EpisodeOfCare value12 = null;
		if ( null != valueObject.getEpisodeOfCare() ) 
		{
			if (valueObject.getEpisodeOfCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisodeOfCare()) != null)
				{
					value12 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisodeOfCare());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value12 = domainObject.getEpisodeOfCare();	
			}
			else
			{
				value12 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisodeOfCare().getBoId());
			}
		}
		domainObject.setEpisodeOfCare(value12);

		return domainObject;
	}

}
