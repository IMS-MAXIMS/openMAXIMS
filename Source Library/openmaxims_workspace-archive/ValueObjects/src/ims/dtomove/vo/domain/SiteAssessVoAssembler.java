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
package ims.dtomove.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cornel Ventuneac
 */
public class SiteAssessVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.dtomove.vo.SiteAssessVo copy(ims.dtomove.vo.SiteAssessVo valueObjectDest, ims.dtomove.vo.SiteAssessVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_SiteAssess(valueObjectSrc.getID_SiteAssess());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// pkey
		valueObjectDest.setPkey(valueObjectSrc.getPkey());
		// patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// episode
		valueObjectDest.setEpisode(valueObjectSrc.getEpisode());
		// AssessName
		valueObjectDest.setAssessName(valueObjectSrc.getAssessName());
		// AssessSpecialty
		valueObjectDest.setAssessSpecialty(valueObjectSrc.getAssessSpecialty());
		// CreationDate
		valueObjectDest.setCreationDate(valueObjectSrc.getCreationDate());
		// CreationTime
		valueObjectDest.setCreationTime(valueObjectSrc.getCreationTime());
		// AssessDataItems
		valueObjectDest.setAssessDataItems(valueObjectSrc.getAssessDataItems());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSiteAssessVoCollectionFromSiteAssess(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.dto_move.domain.objects.SiteAssess objects.
	 */
	public static ims.dtomove.vo.SiteAssessVoCollection createSiteAssessVoCollectionFromSiteAssess(java.util.Set domainObjectSet)	
	{
		return createSiteAssessVoCollectionFromSiteAssess(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.dto_move.domain.objects.SiteAssess objects.
	 */
	public static ims.dtomove.vo.SiteAssessVoCollection createSiteAssessVoCollectionFromSiteAssess(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.dtomove.vo.SiteAssessVoCollection voList = new ims.dtomove.vo.SiteAssessVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.dto_move.domain.objects.SiteAssess domainObject = (ims.dto_move.domain.objects.SiteAssess) iterator.next();
			ims.dtomove.vo.SiteAssessVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.dto_move.domain.objects.SiteAssess objects.
	 */
	public static ims.dtomove.vo.SiteAssessVoCollection createSiteAssessVoCollectionFromSiteAssess(java.util.List domainObjectList) 
	{
		return createSiteAssessVoCollectionFromSiteAssess(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.dto_move.domain.objects.SiteAssess objects.
	 */
	public static ims.dtomove.vo.SiteAssessVoCollection createSiteAssessVoCollectionFromSiteAssess(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.dtomove.vo.SiteAssessVoCollection voList = new ims.dtomove.vo.SiteAssessVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.dto_move.domain.objects.SiteAssess domainObject = (ims.dto_move.domain.objects.SiteAssess) domainObjectList.get(i);
			ims.dtomove.vo.SiteAssessVo vo = create(map, domainObject);

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
	 * Create the ims.dto_move.domain.objects.SiteAssess set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractSiteAssessSet(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.SiteAssessVoCollection voCollection) 
	 {
	 	return extractSiteAssessSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSiteAssessSet(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.SiteAssessVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.dtomove.vo.SiteAssessVo vo = voCollection.get(i);
			ims.dto_move.domain.objects.SiteAssess domainObject = SiteAssessVoAssembler.extractSiteAssess(domainFactory, vo, domMap);

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
	 * Create the ims.dto_move.domain.objects.SiteAssess list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractSiteAssessList(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.SiteAssessVoCollection voCollection) 
	 {
	 	return extractSiteAssessList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSiteAssessList(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.SiteAssessVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.dtomove.vo.SiteAssessVo vo = voCollection.get(i);
			ims.dto_move.domain.objects.SiteAssess domainObject = SiteAssessVoAssembler.extractSiteAssess(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.dto_move.domain.objects.SiteAssess object.
	 * @param domainObject ims.dto_move.domain.objects.SiteAssess
	 */
	 public static ims.dtomove.vo.SiteAssessVo create(ims.dto_move.domain.objects.SiteAssess domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.dto_move.domain.objects.SiteAssess object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.dtomove.vo.SiteAssessVo create(DomainObjectMap map, ims.dto_move.domain.objects.SiteAssess domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.dtomove.vo.SiteAssessVo valueObject = (ims.dtomove.vo.SiteAssessVo) map.getValueObject(domainObject, ims.dtomove.vo.SiteAssessVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.dtomove.vo.SiteAssessVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.dto_move.domain.objects.SiteAssess
	 */
	 public static ims.dtomove.vo.SiteAssessVo insert(ims.dtomove.vo.SiteAssessVo valueObject, ims.dto_move.domain.objects.SiteAssess domainObject) 
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
	 * @param domainObject ims.dto_move.domain.objects.SiteAssess
	 */
	 public static ims.dtomove.vo.SiteAssessVo insert(DomainObjectMap map, ims.dtomove.vo.SiteAssessVo valueObject, ims.dto_move.domain.objects.SiteAssess domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_SiteAssess(domainObject.getId());
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
			
		// pkey
		valueObject.setPkey(domainObject.getPkey());
		// patient
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
		// episode
		if (domainObject.getEpisode() != null)
		{
			if(domainObject.getEpisode() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getEpisode();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setEpisode(new ims.core.admin.vo.EpisodeOfCareRefVo(id, -1));				
			}
			else
			{
				valueObject.setEpisode(new ims.core.admin.vo.EpisodeOfCareRefVo(domainObject.getEpisode().getId(), domainObject.getEpisode().getVersion()));
			}
		}
		// AssessName
		valueObject.setAssessName(domainObject.getAssessName());
		// AssessSpecialty
		valueObject.setAssessSpecialty(domainObject.getAssessSpecialty());
		// CreationDate
		java.util.Date CreationDate = domainObject.getCreationDate();
		if ( null != CreationDate ) 
		{
			valueObject.setCreationDate(new ims.framework.utils.Date(CreationDate) );
		}
		// CreationTime
		String CreationTime = domainObject.getCreationTime();
		if ( null != CreationTime ) 
		{
			valueObject.setCreationTime(new ims.framework.utils.Time(CreationTime) );
		}
		// AssessDataItems
		valueObject.setAssessDataItems(ims.dtomove.vo.domain.SiteAssessItemVoAssembler.createSiteAssessItemVoCollectionFromSiteAssessItems(map, domainObject.getAssessDataItems()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.dto_move.domain.objects.SiteAssess extractSiteAssess(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.SiteAssessVo valueObject) 
	{
		return 	extractSiteAssess(domainFactory, valueObject, new HashMap());
	}

	public static ims.dto_move.domain.objects.SiteAssess extractSiteAssess(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.SiteAssessVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_SiteAssess();
		ims.dto_move.domain.objects.SiteAssess domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.dto_move.domain.objects.SiteAssess)domMap.get(valueObject);
			}
			// ims.dtomove.vo.SiteAssessVo ID_SiteAssess field is unknown
			domainObject = new ims.dto_move.domain.objects.SiteAssess();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_SiteAssess());
			if (domMap.get(key) != null)
			{
				return (ims.dto_move.domain.objects.SiteAssess)domMap.get(key);
			}
			domainObject = (ims.dto_move.domain.objects.SiteAssess) domainFactory.getDomainObject(ims.dto_move.domain.objects.SiteAssess.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_SiteAssess());

		domainObject.setPkey(valueObject.getPkey());
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
		ims.core.admin.domain.objects.EpisodeOfCare value3 = null;
		if ( null != valueObject.getEpisode() ) 
		{
			if (valueObject.getEpisode().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisode()) != null)
				{
					value3 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisode());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getEpisode();	
			}
			else
			{
				value3 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisode().getBoId());
			}
		}
		domainObject.setEpisode(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAssessName() != null && valueObject.getAssessName().equals(""))
		{
			valueObject.setAssessName(null);
		}
		domainObject.setAssessName(valueObject.getAssessName());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAssessSpecialty() != null && valueObject.getAssessSpecialty().equals(""))
		{
			valueObject.setAssessSpecialty(null);
		}
		domainObject.setAssessSpecialty(valueObject.getAssessSpecialty());
		java.util.Date value6 = null;
		ims.framework.utils.Date date6 = valueObject.getCreationDate();		
		if ( date6 != null ) 
		{
			value6 = date6.getDate();
		}
		domainObject.setCreationDate(value6);
		ims.framework.utils.Time time7 = valueObject.getCreationTime();
		String value7 = null;
		if ( time7 != null ) 
		{
			value7 = time7.toString();
		}
		domainObject.setCreationTime(value7);

		// SaveAsRefVO treated as RefValueObject
		ims.dto_move.vo.SiteAssessItemsRefVoCollection refCollection8 = new ims.dto_move.vo.SiteAssessItemsRefVoCollection();
		if (valueObject.getAssessDataItems() != null)
		{
			for (int i8=0; i8<valueObject.getAssessDataItems().size(); i8++)
			{
				ims.dto_move.vo.SiteAssessItemsRefVo ref8 = (ims.dto_move.vo.SiteAssessItemsRefVo)valueObject.getAssessDataItems().get(i8);
				refCollection8.add(ref8);
			}
		}
		int size8 = (null == refCollection8) ? 0 : refCollection8.size();		
		java.util.List domainAssessDataItems8 = domainObject.getAssessDataItems();
		if (domainAssessDataItems8 == null)
		{
			domainAssessDataItems8 = new java.util.ArrayList();
		}
		for(int i=0; i < size8; i++) 
		{
			ims.dto_move.vo.SiteAssessItemsRefVo vo = refCollection8.get(i);			
			ims.dto_move.domain.objects.SiteAssessItems dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.dto_move.domain.objects.SiteAssessItems)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.dto_move.domain.objects.SiteAssessItems)domainFactory.getDomainObject( ims.dto_move.domain.objects.SiteAssessItems.class, vo.getBoId());
				}
			}

			int domIdx = domainAssessDataItems8.indexOf(dom);
			if (domIdx == -1)
			{
				domainAssessDataItems8.add(i, dom);
			}
			else if (i != domIdx && i < domainAssessDataItems8.size())
			{
				Object tmp = domainAssessDataItems8.get(i);
				domainAssessDataItems8.set(i, domainAssessDataItems8.get(domIdx));
				domainAssessDataItems8.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i8 = domainAssessDataItems8.size();
		while (i8 > size8)
		{
			domainAssessDataItems8.remove(i8-1);
			i8 = domainAssessDataItems8.size();
		}
		
		domainObject.setAssessDataItems(domainAssessDataItems8);		

		return domainObject;
	}

}
